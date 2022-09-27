var __author__ = "kubik.augustyn@post.cz"

function DiamondMapPointPosition2XY(mapX, mapY) {
    return [(44 + mapX * 13), (78 + mapY * 13)]
}

function arr2smallEndian(arr) {
    var se = 0
    arr.forEach((val, index) => {
        se += val * Math.pow(256, index)
    })
    return se
}

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

class DiamondMapPoint {
    constructor(canvas) {
        this.canvas = canvas
        this.x = -1
        this.y = -1
        this.secret = false
        this.stageID = -1
        this.paths = []
        this.symbols = undefined
        this.mapId = undefined
        this.goingToSecret = false

        //  1 * x = 37
        //  4 * x = 76
        //  7 * x = 115
        //  8 * x = 128
        // 10 * x = 154
        // this.xs = [44, 57, -1, 83, 96, -1, -1, 135, 148, -1, 174] // - 20
        // this.ys = [-1, -1, -1, 117, 130, -1, 156, 169, 182, -1, 208] // - 84

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    setMapId(mapId) {
        this.mapId = mapId
    }

    setGoingToSecret(secret) {
        this.goingToSecret = secret
    }

    setSymbols(symbols) {
        this.symbols = symbols
    }

    setStageId(id) {
        if (typeof id === "number") this.stageID = id
    }

    setPosition(x, y) {
        if (typeof x === "number") this.x = x
        if (typeof y === "number") this.y = y
    }

    setSecret(secret) {
        if (typeof secret === "boolean") this.secret = secret
    }

    setPaths(paths) {
        this.paths = []
        paths.forEach(a => this.addPath(a))
    }

    addPath(path) {
        this.paths.push(path)
    }

    render() {
        if (!this.symbols) return
        // console.log("Render point:", this)
        var image
        if (this.mapId === "angkor" && this.stageID === 8) {
            image = this.symbols.diamond.fire_crystal
        } else if (this.mapId === "bavaria" && this.stageID === 9) {
            image = this.symbols.diamond.silver_diamond
        } else if (this.mapId === "siberia" && this.stageID === 10) {
            image = this.symbols.diamond.ice_diamond
        } else {
            if (this.secret) image = this.symbols.cross.secret
            else {
                if (this.goingToSecret) image = this.symbols.cross.secret_path
                else image = this.symbols.cross.normal
            }
        }
        image.id = "point"
        var w = image.data[0].length
        var h = image.data.length
        var hw = Math.floor(w / 2)
        var hh = Math.floor(h / 2)
        var [x, y] = DiamondMapPointPosition2XY(this.x, this.y)
        this.canvas.addElement(image, x - hw, y - hh, 1)
    }
}

class DiamondMapPath {
    constructor(canvas) {
        this.canvas = canvas
        this.fromX = -1
        this.fromY = -1
        this.toX = -1
        this.toY = -1
        this.secret = false
        this.fromPoint = undefined
        this.toPoint = undefined
        this.symbols = undefined

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    setSymbols(symbols) {
        this.symbols = symbols
    }

    getPoints() {
        return [this.fromPoint, this.toPoint]
    }

    setPoints(point1, point2) {
        if (point1 instanceof DiamondMapPoint) this.fromPoint = point1
        if (point2 instanceof DiamondMapPoint) this.toPoint = point2
    }

    setPosition(fx, fy, tx, ty) {
        if (typeof fx === "number") this.fromX = fx
        if (typeof fy === "number") this.fromY = fy
        if (typeof tx === "number") this.toX = tx
        if (typeof ty === "number") this.toY = ty
    }

    getPositionString() {
        return JSON.stringify(this.getPosition())
    }

    getReversePositionString() {
        return JSON.stringify(this.getReversePosition())
    }

    getPosition() {
        return [this.fromX, this.fromY, this.toX, this.toY]
    }

    getReversePosition() {
        return [this.toX, this.toY, this.fromX, this.fromY]
    }

    getFrom() {
        var pos = this.getPosition()
        return [pos[0], pos[1]]
    }

    getTo() {
        var pos = this.getPosition()
        return [pos[2], pos[3]]
    }

    setSecret(secret) {
        if (typeof secret === "boolean") this.secret = secret
    }

    render() {
        if (!this.symbols) return
        var [fx, fy] = DiamondMapPointPosition2XY(...this.getFrom())
        var [tx, ty] = DiamondMapPointPosition2XY(...this.getTo())
        console.log("Render path:", [fx, fy], [tx, ty], this)
    }
}

class DiamondMap extends DiamondFile {
    init() {
        this.fileType = "map"

        this.canvasElement = document.createElement("canvas")
        this.canvas = new CanvasEngine2D({
            canvas: this.canvasElement,
            appName: "diamondRush-browser-all_files-textures",
            imageW: 240,
            imageH: 320,
            backgroundColor: [0, 255, 0, 255],
            scale: 2.5
        })
        this.points = new Map()
        this.paths = new Map()
        this.mapId = undefined
    }

    loadImage(url, onLoad = this.setBackgroundImage) {
        var http = new XMLHttpRequest()
        http.open("GET", url)
        http.responseType = "arraybuffer"
        http.myDumbIdea = this
        http.onload = function () {
            onLoad(this.myDumbIdea.onImageLoad(http.response))
        }
        http.send()
    }

    onImageLoad(buffer) {
        var png = UPNG.decode(buffer)
        console.log("Decoded PNG:", png)
        var rgba = [...(new Uint8Array(png.data))]
        /*var data = []
        for (var y = 0; y < png.height; y++) {
            var line = []
            var rootI = y * png.width * 4
            for (var x = 0; x < png.width; x++) {
                var i = rootI + x * 4
                line.push([rgba[i], rgba[i + 1], rgba[i + 2], rgba[i + 3]])
            }
            data.push(line)
        }*/
        return [rgba, png]
    }

    setBackgroundImage([rgba, png]) {
        this.canvas.removeElementsById("background")
        var img = this.canvas.loadImage("background", "", "", false, 0, 0, png.width, png.height, ["0:255:0:255"], rgba)
        this.canvas.addElement(img, 0, 0, 0)
        this.canvas.render()
    }

    onSymbolsLoad([rgba, png]) {
        var symbolsImg = this.canvas.loadImage("symbols", "", "", false, 0, 0, png.width, png.height, ["0:255:0:255"], rgba)
        console.log("Loaded symbols: ", symbolsImg, this.points, this.paths)
        var symbols = {
            cross: {
                normal: this.canvas.getImageFromImage("symbol-cross-normal", symbolsImg, 0, 0, 15, 13),
                secret_path: this.canvas.getImageFromImage("symbol-cross-secret_path", symbolsImg, 15, 0, 15, 13),
                secret: this.canvas.getImageFromImage("symbol-cross-secret", symbolsImg, 30, 0, 9, 9)
            },
            diamond: {
                fire_crystal: this.canvas.getImageFromImage("symbol-diamond-fire_crystal", symbolsImg, 0, 13, 28, 27),
                silver_diamond: this.canvas.getImageFromImage("symbol-diamond-silver_diamond", symbolsImg, 28, 13, 28, 27),
                ice_diamond: this.canvas.getImageFromImage("symbol-diamond-ice_diamond", symbolsImg, 56, 13, 28, 27)
            },
            path_point: {
                normal: this.canvas.getImageFromImage("symbol-path_point-normal", symbolsImg, 0, 40, 6, 6),
                secret: this.canvas.getImageFromImage("symbol-path_point-secret", symbolsImg, 6, 40, 5, 5)
            }
        }
        var x, y, pt, pa
        // Render paths
        this.canvas.removeElementsById("path")
        for ([[x, y], pa] of this.paths.entries()) {
            pa.setSymbols(symbols)
            pa.render()
        }
        // Render points
        this.canvas.removeElementsById("point")
        for ([[x, y], pt] of this.points.entries()) {
            // console.log("Point:", x, y, pt)
            pt.setSymbols(symbols)
            pt.render()
        }
        this.canvas.render()
    }

    parse(dec, container) {
        console.group("Parse map")
        try {
            switch (currentFileName) {
                case "map_angkor.out":
                    this.mapId = "angkor"
                    this.loadImage("angkor.png")
                    break
                case "map_scotland.out":
                    this.mapId = "bavaria"
                    this.loadImage("bavaria.png")
                    break
                case "map_tibet.out":
                    this.mapId = "siberia"
                    this.loadImage("siberia.png")
                    break
            }
            this.loadImage("symbols.png", this.onSymbolsLoad)
        } catch (e) {
            console.log(e)
        }

        var len = arr2smallEndian(dec.shiftTimes(2)) + 1
        var data = dec.shiftTimes(len)
        var num_points = data.shift()
        console.log("Number of points:", num_points)
        var points = new Map()
        var paths = new Map()
        for (var i = 0; i < num_points; i++) {
            var point = new DiamondMapPoint(this.canvas)
            var [x, y, secret, stage_id, num_paths] = data.shiftTimes(5)
            point.setPosition(x, y)
            point.setSecret(!!secret)
            point.setStageId(stage_id)
            point.setMapId(this.mapId)
            var point_paths = []
            for (var _ = 0; _ < num_paths; _++) {
                var path = new DiamondMapPath(this.canvas)
                path.setPosition(x, y, ...data.shiftTimes(2))
                var anotherPath = paths.get(path.getPositionString()) || paths.get(path.getReversePositionString())
                if (anotherPath) path.setPoints(anotherPath.getPoints()[0], point)
                else path.setPoints(point)
                var path_secret = !!secret
                if (anotherPath && !path_secret) path_secret = anotherPath.getPoints()[0].secret
                path.setSecret(path_secret)
                paths.set(path.getPositionString(), path)
                point_paths.push(path)
            }
            point.setPaths(point_paths)
            point.render()
            points.set([x, y], point)
        }
        // Set points going to secret path
        for (var [_, pt] of points.entries()) for (var pa of pt.paths) if (pa.secret) pa.getPoints().forEach(a => a && a.setGoingToSecret(true))
        console.log("Points:", points)
        console.log("Paths:", paths)
        this.points = points
        this.paths = paths

        container.innerHTML = "<h1>Map</h1>"
        container.innerHTML += `Points: (${points.size})<br>`
        container.innerHTML += `<table class="center"><tr>${["X", "Y", "Secret", "Path to secret", "Stage", "Paths"].map(a => `<th>${a}</th>`).join("")}</th>${new Array(...points.entries()).map(
            ([[x, y], point]) => {
                return `<tr><td>${x}</td><td>${y}</td><td>${point.secret ? "Yes" : "No"}</td><td>${point.goingToSecret ? "Yes" : "No"}</td><td>${point.stageID + 1}</td><td>${point.paths.map((path) => `X: ${path.getTo()[0]} Y: ${path.getTo()[1]}`).join(", ")}</td></tr>`
            }
        ).join("")}</table><br>`

        // Render
        this.canvas.elements = []

        this.canvas.render()
        container.appendChild(this.canvasElement)
        console.groupEnd()
    }
}
