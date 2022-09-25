var __author__ = "kubik.augustyn@post.cz"

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

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
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
        paths.forEach(a => this.addPath(...a))
    }

    addPath(x, y) {
        this.paths.push([x, y])
    }

    render() {
        console.log("Render point:", this)
        var image = this.canvas.createImage("point", [])
        this.canvas.addElement(image, this.x * 10, this * 10, 1)
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
        var data = []
        for (var y = 0; y < png.height; y++) {
            var line = []
            var rootI = y * png.width * 4
            for (var x = 0; x < png.width; x++) {
                var i = rootI + x * 4
                line.push([rgba[i], rgba[i + 1], rgba[i + 2], rgba[i + 3]])
            }
            data.push(line)
        }
        return data
    }

    setBackgroundImage(data) {
        this.canvas.removeElementsById("background")
        var img = this.canvas.createImage("background", data)
        this.canvas.addElement(img, 0, 0, 0)
        this.canvas.render()
    }

    parse(dec, container) {
        console.group("Parse map")
        try {
            switch (currentFileName) {
                case "map_scotland.out":
                    this.loadImage("bavaria.png")
                    break
                case "map_tibet.out":
                    this.loadImage("siberia.png")
                    break
                case "map_angkor.out":
                default:
                    this.loadImage("angkor.png")
                    break
            }
        } catch (e) {
            console.log(e)
        }

        var len = arr2smallEndian(dec.shiftTimes(2)) + 1
        var data = dec.shiftTimes(len)
        var num_points = data.shift()
        console.log("Number of points:", num_points)
        var points = new Map()
        for (var i = 0; i < num_points; i++) {
            var point = new DiamondMapPoint(this.canvas)
            var [x, y, secret, stage_id, num_paths] = data.shiftTimes(5)
            point.setPosition(x, y)
            point.setSecret(!!secret)
            point.setStageId(stage_id)
            var paths = []
            for (var _ = 0; _ < num_paths; _++) paths.push(data.shiftTimes(2))
            point.setPaths(paths)
            point.render()
            points.set([x, y], point)
        }
        console.log("Points:", points)

        container.innerHTML = "<h1>Map</h1>"
        container.innerHTML += `Points: (${points.size})<br>`
        container.innerHTML += `<table><tr>${["X", "Y", "Secret", "Stage", "Paths"].map(a => `<th>${a}</th>`).join("")}</th>${new Array(...points.entries()).map(
            ([[x, y], point]) => {
                return `<tr><td>${x}</td><td>${y}</td><td>${point.secret ? "Yes" : "No"}</td><td>${point.stageID + 1}</td><td>${point.paths.map(([x, y]) => `X: ${x} Y: ${y}`).join(", ")}</td></tr>`
            }
        ).join("")}</table><br>`

        // Render
        this.canvas.elements = []

        this.canvas.render()
        container.appendChild(this.canvasElement)
        console.groupEnd()
    }
}
