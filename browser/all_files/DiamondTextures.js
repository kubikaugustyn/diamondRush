var __author__ = "kubik.augustyn@post.cz"

class DiamondTextures {
    constructor() {
        this.palette = []
        this.textures = []
        this.count = 0

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    setCount(count) {
        this.count = count
        this.textures = []
        for (var i = 0; i < count; i++) this.textures.push(new DiamondTexture())
    }

    setDimensions(array) {
        for (var texture of this.textures) {
            texture.setDimensions(...array.shiftTimes(2))
        }
    }

    setPalette(palette) {
        this.palette = palette
        for (var texture of this.textures) {
            texture.setPalette(palette)
        }
    }

    setData(data) {
        var i = 0
        for (var texture of this.textures) {
            texture.setData(data[i])
            i++
        }
    }

    appendCanvases(target = document.body) {
        for (var texture of this.textures) {
            target.appendChild(texture.canvas)
        }
    }

    setScale(scale) {
        for (var texture of this.textures) {
            texture.engine.args.scale = scale
        }
    }
}

class DiamondTexture {
    constructor() {
        this.width = 0
        this.height = 0
        this.palette = []
        this.dataDec = []
        this.data = []
        this.canvas = document.createElement("canvas")
        this.engine = undefined

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    setDimensions(w, h) {
        this.width = w
        this.height = h
        this.engine = new CanvasEngine2D({
            canvas: this.canvas,
            appName: "diamondRush-browser-all_files-textures",
            imageW: w,
            imageH: h,
            backgroundColor: [0, 255, 0, 255]
        })
        this.render()
    }

    setData(data) {
        this.dataDec = data
        this.data = this.dataDec.map(a => {
            var b = a.toString(16)
            if (b.length < 2) b = "0" + b
            return b
        }).join("").split("").map(a => parseInt(a, 16))
        this.render()
    }

    setPalette(palette) {
        this.palette = palette
        this.render()
    }

    render() {
        if (this.engine && this.data.length && this.width && this.height && this.palette.length) {
            var data = []
            for (var y = 0; y < this.height; y++) {
                var line = []
                for (var x = 0; x < this.width; x++) {
                    line.push(this.palette[this.data[y * this.width + x]] || [255, 0, 0, 255])
                }
                data.push(line)
            }
            this.engine.removeElementsById("texture")
            this.engine.addElement(this.engine.createImage("texture", data), 0, 0, 0)
            this.engine.render()
        }
    }
}
