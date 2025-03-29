/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {createAndLoadImageElement, createElement, renderCanvasEngine2DImage} from "../utils.js";

/**
 * @typedef {{pointA: TMapPoint, pointB: TMapPoint, secret: boolean}} TMapPath
 * @typedef {{x: number, y: number, secret: boolean, stageID: number, paths: TMapPath[]}} TMapPoint
 * @typedef {{pointA: TMapPoint, pointB: TTempMapPoint}} TTempMapPath
 * @typedef {{x: number, y: number}} TTempMapPoint
 */

const fileNameToMapID = new Map([
    ["map_angkor.out", "angkor"],
    ["map_scotland.out", "bavaria"],
    ["map_tibet.out", "siberia"],
])

/**
 * Converts the Diamond Rush map point position into XY coordinates.
 * @param mapX {number}
 * @param mapY {number}
 * @return {number[]}
 */
function diamondMapPointPositionToXY(mapX, mapY) {
    return [(44 + mapX * 13), (78 + mapY * 13)]
}

/**
 * @param path {TMapPath|TTempMapPath}
 * @return {function(other: TMapPath|TTempMapPath): boolean}
 */
function getPathComparator(path) {
    return other =>
        (path.pointA === other.pointA && path.pointB === other.pointB) ||
        (path.pointA === other.pointB && path.pointB === other.pointA)
}

/**
 * @param arr {TMapPath[]}
 * @return {TMapPath[]}
 * @author ChatGPT
 * @home https://chatgpt.com/
 */
function removeDuplicatePathPairs(arr) {
    const uniquePairs = new Set();

    return arr.filter(({pointA, pointB}) => {
        // Normalize the pair by sorting the points so (pointA, pointB) and (pointB, pointA) are considered the same
        const pair = JSON.stringify([`${pointA.x},${pointA.y}`, `${pointB.x},${pointB.y}`].sort());

        if (uniquePairs.has(pair)) {
            return false; // If the pair already exists, don't include it
        }
        else {
            uniquePairs.add(pair);
            return true; // Include the unique pair
        }
    });
}

/**
 * @param A {{x: number, y: number}}
 * @param B {{x: number, y: number}}
 * @param spacing {number}
 * @return {{x: number, y: number}[]}
 * @author ChatGPT
 * @home https://chatgpt.com/
 */
function generatePointsWithSpacing(A, B, spacing) {
    const points = [];

    // Calculate the distance between points A and B using Math.hypot
    const distance = Math.hypot(B.x - A.x, B.y - A.y);

    // Determine the number of steps based on the desired spacing
    const steps = Math.floor(distance / spacing);

    // Calculate the difference between A and B coordinates
    const dx = (B.x - A.x) / distance;
    const dy = (B.y - A.y) / distance;

    // Generate points
    for (let i = 0; i <= steps; i++) {
        const x = A.x + dx * spacing * i;
        const y = A.y + dy * spacing * i;
        points.push({x, y});
    }

    // console.log(A, B, points)
    return points;
}

/**
 * @param engine {CanvasEngine2D}
 * @param backgroundImg {HTMLImageElement}
 * @param symbolsImg {HTMLImageElement}
 * @param paths {TMapPath[]}
 * @param points {TMapPoint[]}
 * @param mapID {"angkor"|"bavaria"|"siberia"}
 */
function populateEngine(engine, backgroundImg, symbolsImg, {paths, points, mapID}) {
    backgroundImg.id = "background-" + (Math.random().toString(36).slice(2))
    symbolsImg.id = "symbols-" + (Math.random().toString(36).slice(2))
    document.body.appendChild(backgroundImg)
    document.body.appendChild(symbolsImg)
    var backgroundLoadedImage = engine.loadImage("background", "", backgroundImg.id, false, 0, 0, null, null, ["0:255:0:255"])
    var symbolsLoadedImage = engine.loadImage("symbols", "", symbolsImg.id, false, 0, 0, null, null, ["0:255:0:255"])
    document.body.removeChild(backgroundImg)
    document.body.removeChild(symbolsImg)

    var symbols = {
        cross: {
            normal: engine.getImageFromImage("symbol-cross-normal", symbolsLoadedImage, 0, 0, 15, 13),
            secret_path: engine.getImageFromImage("symbol-cross-secret_path", symbolsLoadedImage, 15, 0, 15, 13),
            secret: engine.getImageFromImage("symbol-cross-secret", symbolsLoadedImage, 30, 0, 9, 9)
        },
        diamond: {
            fire_crystal: engine.getImageFromImage("symbol-diamond-fire_crystal", symbolsLoadedImage, 0, 13, 28, 27),
            silver_diamond: engine.getImageFromImage("symbol-diamond-silver_diamond", symbolsLoadedImage, 28, 13, 28, 27),
            ice_diamond: engine.getImageFromImage("symbol-diamond-ice_diamond", symbolsLoadedImage, 56, 13, 28, 27)
        },
        path_point: {
            normal: engine.getImageFromImage("symbol-path_point-normal", symbolsLoadedImage, 0, 40, 6, 6),
            secret: engine.getImageFromImage("symbol-path_point-secret", symbolsLoadedImage, 6, 40, 5, 5)
        }
    }

    engine.addElement(backgroundLoadedImage, 0, 0, 0)

    for (const path of paths) {
        const [aX, aY] = diamondMapPointPositionToXY(path.pointA.x, path.pointA.y)
        const [bX, bY] = diamondMapPointPositionToXY(path.pointB.x, path.pointB.y)
        // TODO A 45deg angle makes the spacing bigger (looks like it's going in +width +height steps)
        const spacedPoints = generatePointsWithSpacing({x: aX, y: aY}, {x: bX, y: bY}, path.secret ? 7.5 : 8.5)

        /** @type {CanvasEngine2DImage} */
        const image = path.secret ? symbols.path_point.secret : symbols.path_point.normal
        const halfWidth = image.data.width / 2
        const halfHeight = image.data.height / 2

        for (const {x, y} of spacedPoints)
            engine.addElement(image, Math.round(x - halfWidth), Math.round(y - halfHeight), 2)
    }

    // points = []
    for (const point of points) {
        /** @type {CanvasEngine2DImage} */
        let image
        if (mapID === "angkor" && point.stageID === 8) {
            image = symbols.diamond.fire_crystal
        }
        else if (mapID === "bavaria" && point.stageID === 9) {
            image = symbols.diamond.silver_diamond
        }
        else if (mapID === "siberia" && point.stageID === 10) {
            image = symbols.diamond.ice_diamond
        }
        else
            image = point.secret ?
                symbols.cross.secret :
                point.paths.find(path => path.secret) ?
                    symbols.cross.secret_path :
                    symbols.cross.normal

        const halfWidth = Math.floor(image.data.width / 2)
        const halfHeight = Math.floor(image.data.height / 2)
        const [x, y] = diamondMapPointPositionToXY(point.x, point.y)
        engine.addElement(image, x - halfWidth, y - halfHeight, 2)
    }
}

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const mapID = fileNameToMapID.get(chunk.file.fileName) || "angkor"

    /** @type {TTempMapPath[]} */
    const tempPaths = []
    /** @type {TMapPoint[]} */
    const points = []

    const dataLength = (new DataView(chunk.data)).getUint16(0) + 1
    const dataView = new DataView(chunk.data.slice(2, dataLength + 2))
    let ptr = 0

    const pointCount = dataView.getUint8(ptr++)
    for (let i = 0; i < pointCount; i++) {
        const x = dataView.getUint8(ptr++),
            y = dataView.getUint8(ptr++),
            secret = !!dataView.getUint8(ptr++),
            stageID = dataView.getUint8(ptr++),
            pathCount = dataView.getUint8(ptr++)

        const pointPaths = []
        /** @type {TMapPoint} */
        const point = {x, y, secret, stageID, paths: pointPaths}
        for (let j = 0; j < pathCount; j++) {
            const targetX = dataView.getUint8(ptr++),
                targetY = dataView.getUint8(ptr++)

            /** @type {TTempMapPath} */
            let path = {pointA: point, pointB: {x: targetX, y: targetY}}
            const definedPath = tempPaths.find(getPathComparator(path))
            if (definedPath)
                path = definedPath
            else tempPaths.push(path)
            pointPaths.push(path)
        }

        points.push(point)
    }

    // Resolve the temporary paths (their pointBs)
    /** @type {TMapPath[]} */
    const paths = removeDuplicatePathPairs(tempPaths.map(tempPath => {
        /** @type {TMapPoint|null} */
        const pointB = points.find(point => tempPath.pointB.x === point.x && tempPath.pointB.y === point.y)
        if (pointB === null)
            throw new Error(`Could not link the path ${tempPath.pointA.x},${tempPath.pointA.y} <---> ${tempPath.pointB.x},${tempPath.pointB.y} to any known point`)

        /** @type {TMapPath} */
        const newPath = {pointA: tempPath.pointA, pointB, secret: tempPath.pointA.secret || pointB.secret}

        points.forEach(point => {
            point.paths = point.paths.map(path => path === tempPath ? newPath : path)
        })
        return newPath
    }))

    console.log("Paths:", paths)
    console.log("Points:", points)

    return {paths, points, mapID}
}


/**
 * @param chunk {FileChunk}
 * @param parsed {{paths: TMapPath[], points: TMapPoint[], mapID: string}|TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    const {paths, points, mapID} = parsed
    const backgroundImg = await createAndLoadImageElement(`./${mapID}.png`)
    const symbolsImg = await createAndLoadImageElement("./symbols.png")

    return createElement("div", [
        renderCanvasEngine2DImage(
            backgroundImg.width, backgroundImg.height,
            engine => populateEngine(engine, backgroundImg, symbolsImg, {paths, points, mapID}),
            2//config.render_scale
        ),
        document.createElement("br"),
        createElement("table", [
            createElement("thead", [
                createElement("tr", [
                    createElement("th", "X"),
                    createElement("th", "Y"),
                    createElement("th", "Secret"),
                    createElement("th", "Stage"),
                    createElement("th", "Paths"),
                ])
            ]),
            createElement("tbody", points.map(point => createElement("tr", [
                createElement("td", point.x.toString()),
                createElement("td", point.y.toString()),
                createElement("td", point.secret ? "Yes" : "No"),
                createElement("td", point.stageID.toString()),
                createElement("td", point.paths.map(path =>
                    createElement("div", `Path(A=[${path.pointA.x}, ${path.pointA.y}], B=[${path.pointB.x}, ${path.pointB.y}], secret=${path.secret ? "Yes" : "No"})`))
                ),
            ])))
        ]),
    ])
}
