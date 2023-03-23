var __author__ = "kubik.augustyn@post.cz"

function dec2hex_str(dec) {
    var decArr = []
    var b2 = dec.toString(2)
    for (var i = 0; i < b2.length; i += 8) {
        decArr.push(b2.slice(0, i * 8))
        b2 = b2.slice(i * 8)
    }
    var hexArr = []
    for (var a of decArr) {
        var hex = dec.toString(16)
        if (hex.length === 1) hex = "0" + hex
        hexArr.push(hex)
    }
    return hexArr.join(" ")
}

function arr2bigEndian(arr) {
    return arr2smallEndian([...arr].reverse())
}

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

class DiamondTextures {
    constructor(dec) {
        this.dec = dec

        this.palette = []
        this.textures = []
        this.count = 0

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.parse()
    }

    parse() {
        /*var num_textures = arr2smallEndian(this.dec.shiftTimes(2))
        this.setCount(num_textures)
        this.setDimensions(this.dec.shiftTimes(num_textures * 2))
        this.setIds(this.dec.shiftTimes(arr2smallEndian(this.dec.shiftTimes(2)) * 4))

        console.log("Number of textures:", num_textures)
        // console.log("Remaining data:", this.dec, this.dec.join(" "))*/
        // ORIGINAL IMPLEMENTATION FROM DIAMOND RUSH
        // class f --> public final void a(final byte[] array, int n)
        // where byte[] array is chunk raw data - df 03 ...
        // where int n is 0
        // class i --> private static f a(final String s, final int n, final int a, final int n2)
        var a = 0, n2 = 0
        var texture = new f()
        texture.aByte1DAndIntReturnVoid(this.dec.slice(), 0)
        console.log(texture.aInt)
        texture.aInt = 10225
        console.log(texture.aInt)
        /*for (var i = a; i <= n2; ++i) {
            texture.aIntAndIntAndIntAndIntReturnVoid(i, 0, -1, -1);
        }
        texture.aInt = a;*/
        // texture.dByte1D = null;
        console.log("Texture class f:", texture)
        // console.log(texture.toStringReturnString())
        texture.aIntAndIntAndIntAndIntReturnVoid(0, 0, -1, -1)
        var graphics = new Graphics()
        // texture.aGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, 0, 0, 0, 0)
        // graphics.drawImage(texture.aImage2D[0][0], 10, 20, 0)
        var dimensions = texture.getFByte1D()
        if (dimensions) {
            var images = []
            for (var i = 0; i < texture.aImage2D.length; i++) {
                if (texture.aImage2D[i]) for (var j = 0; j < texture.aImage2D[i].length; j++) {
                    if (texture.aImage2D[i][j]) images.push(texture.aImage2D[i][j])
                }
            }
            if (images.length !== dimensions.length / 2) throw new Error("Something went wrong")
            this.setCount(images.length)
            this.setDimensions(dimensions)
            for (var [k, image] of Object.entries(images)) {
                var text = this.textures[k]
                var img = image.toCanvasEngine2DImage("RGBAImage", text.engine)
                text.engine.addElement(img, 0, 0, 0)
            }
        }
        // https://docs.oracle.com/javame/config/cldc/ref-impl/midp2.0/jsr118/javax/microedition/lcdui/Image.html
    }

    render(container) {
        var check = document.getElementById("strict_textures")
        var strict = check ? !check.checked : false
        if (strict) container.innerHTML = `In this chunk there are ${this.count} textures.`
        for (var i = 0; i < this.count; i++) {
            var texture = this.textures[i]
            var div = document.createElement("div")
            div.classList.add("inline")
            container.appendChild(div)
            div.innerHTML = `<h3>Texture ${i + 1}</h3>`
            if (strict) {
                div.innerHTML += `Texture size: ${texture.getWidth()} px X ${texture.getHeight()} px<br>`
                div.innerHTML += `Texture ID: ${texture.getIdHex()}<br>`
            }
            texture.render()
            div.appendChild(texture.getCanvas())
        }
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

    setIds(array) {
        for (var texture of this.textures) {
            texture.setId(array.shiftTimes(4))
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
            target.appendChild(texture.getCanvas())
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
        this.id = [0, 0, 0, 0]
        this.canvas = document.createElement("canvas")
        this.engine = undefined

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    getId() {
        return arr2bigEndian(this.getIdArray())
    }

    getIdArray() {
        return this.id
    }

    getIdHex() {
        var hex = []
        var id = this.getId()
        var len = this.getIdArray().length
        for (var i = 0; i < len; i++) {
            var value = Math.pow(256, len - i - 1)
            var num = Math.floor(id / value)
            id %= value
            var h = num.toString(16)
            hex.push((h.length === 1 ? "0" : "") + h)
        }
        return hex.join(" ")
    }

    getCanvas() {
        return this.canvas
    }

    getSize() {
        return [this.width, this.height]
    }

    getWidth() {
        return this.getSize()[0]
    }

    getHeight() {
        return this.getSize()[1]
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

    setId(array) {
        this.id = array
    }

    setPalette(palette) {
        this.palette = palette
        this.render()
    }

    render() {
        if (this.engine && this.width && this.height) {
            if (this.data.length && this.palette.length) {
                var data = []
                for (var y = 0; y < this.height; y++) {
                    var line = []
                    for (var x = 0; x < this.width; x++) {
                        line.push(this.palette[this.data[y * this.width + x]] || [255, 0, 0, 255])
                    }
                    data.push(line)
                }
                this.engine.addElement(this.engine.createImage("texture", data), 0, 0, 0)
            }
            this.engine.removeElementsById("texture")
            this.engine.render()
        }
    }
}
