var __author__ = "kubik.augustyn@post.cz"

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

Array.prototype.toAscii = function () {
    return this.map(a => String.fromCharCode(a)).join("")
}

function arr2smallEndian(arr) {
    var se = 0
    arr.forEach((val, index) => {
        se += val * Math.pow(256, index)
    })
    return se
}

function arr2bigEndian(arr) {
    return arr2smallEndian([...arr].reverse())
}

class StageEditorMenu {
    constructor(stageEditor) {
        this.stageEditor = stageEditor
        this.canvas = this.stageEditor.canvas
        this.textures = this.stageEditor.textures

        this.places = {
            angkor: 'Angkor Wat',
            bavaria: 'Bavaria',
            siberia: 'Siberia'
        }
        if (!this.stageEditor.place) this.stageEditor.place = Object.keys(this.places)[0]
        // Render the place menu
        this.placesMenu = document.createElement('fieldset')
        this.placesMenu.innerHTML = '<legend>Choose destination</legend>'
        this.placesMenu.innerHTML += Object.entries(this.places).map(([fileName, text]) => {
            return `<label><input type="radio" value="${fileName}" name="place"${fileName === this.stageEditor.place ? " checked" : ""}>${text}</label>`
        }).join('<br>').concat('<br>')
        var okButton = document.createElement('button')
        okButton.innerHTML = 'OK'
        this.okButton = okButton
        this.placesMenu.appendChild(okButton)
        this.stageEditor.container.appendChild(this.placesMenu)
        this.size = {
            w_blocks: 6,
            h_blocks: 12,
            border: 0,
            block_size: 24,
            w: null,
            h: null,
            x: 0,
            y: 0
        }
        this.size.w = this.size.w_blocks * (this.size.border + this.size.block_size) // We leave border also between map and blocks
        this.size.h = this.size.h_blocks * this.size.block_size + (this.size.h_blocks + 1) * this.size.border // We leave border on top and bottom
        this.palette = {
            angkor: [
                [80, 81, 82, 83, 84],
                [91, 86, 92, 88, 89],
                [90, 85, 87, 93, 94],
                [95, 96, 102, 98, 99],
                [100, 101, 97, 103, 104],
                [105, 106, 107, 108, 109],
                [110, 111, 112, 113, 114],
                [115, 116, 117, 118, 119],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0]
            ], bavaria: [
                [87, 104, 111, 110, 103, 95],
                [0, 0, 0, 0, 0, 109],
                [80, 113, 0, 94, 0, 81],
                [96, 97, 124, 125, 136, 88],
                [98, 99, 126, 127, 137, 92],
                [100, 101, 128, 129, 138, 89],
                [120, 117, 121, 122, 123, 139],
                [119, 108, 82, 83, 84, 140],
                [118, 90, 91, 0, 0, 141],
                [106, 107, 130, 131, 132, 133],
                [134, 135, 114, 102, 0, 115],
                [112, 105, 142, 143, 144, 145],
                [146, 93, 0, 85, 86, 116],
            ], siberia: [
                [80, 81, 82, 83, 84],
                [91, 86, 92, 88, 89],
                [90, 85, 87, 93, 94],
                [95, 96, 102, 98, 99],
                [100, 101, 97, 103, 104],
                [105, 106, 107, 108, 109],
                [110, 111, 112, 113, 114],
                [115, 116, 117, 118, 119],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0]
            ]
        }
        this.paletteRendered = false

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        okButton.onclick = this.okButtonClick
    }

    okButtonClick() {
        var inputs = new Array(...this.placesMenu.getElementsByTagName("input")).filter(a => a.checked && a.name === 'place')
        if (!inputs.length) return console.log("You didn't choose any of places.")
        var place = inputs[0].value
        this.stageEditor.changePlace(place)
    }

    onPlaceTexturesChange() {
        if (!this.paletteRendered) {
            this.paletteRendered = true
            this.stageEditor.canvas.removeElementsById("menu-block")
            for (var [y, line] of Object.entries(this.palette[this.stageEditor.place])) {
                y = Number(y)
                for (var [x, blockNum] of Object.entries(line)) {
                    x = Number(x)
                    if (!this.textures.block[blockNum]) continue
                    var block = this.textures.block[blockNum].clone() // Cloned not to change id of a texture itself
                    var rx = this.size.x + x * (this.size.block_size + this.size.border)
                    var ry = this.size.y + y * this.size.block_size + (y + 1) * this.size.border
                    block.id = 'menu-block'
                    this.stageEditor.canvas.addElement(block, rx, ry, 1)
                }
            }
        }
    }
}

class StageEditor {
    constructor(container) {
        this.container = container

        this.container.appendChild(this.canvasElement = document.createElement('canvas'))
        this.textures = {block: {}}
        this.place = sessionStorage.getItem('place')
        this.menu = new StageEditorMenu(this)
        this.canvas = new CanvasEngine2D({
            canvas: this.canvasElement,
            appName: "diamondRush-browser-stage_editor-textures",
            imageW: 240 + (this.menu.size.w),
            imageH: Math.max(320, this.menu.size.h),
            backgroundColor: [0, 255, 255, 255],
            scale: 2
        })
        this.menu.size.x = 240
        // this.canvas.args.camera.zoom = 2
        // this.canvas.args.camera.x = 10
        this.BLOCK_BEGINNING_NUMBER = 80

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.menu.okButton.click()
    }

    error(msg) {
        console.error(msg)
    }

    init() {
        this.render()
    }

    loadImage(url, onLoad) {
        var http = new XMLHttpRequest()
        http.open("GET", url)
        http.responseType = "arraybuffer"
        http.myDumbIdea = this
        http.onload = function () {
            onLoad(this.myDumbIdea.onImageLoad(this.response))
        }
        http.send()
    }

    onImageLoad(buffer) {
        var png = UPNG.decode(buffer)
        // console.log("Decoded PNG:", png)
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

    changePlace(target) {
        if (!target || typeof target !== 'string') return
        this.place = target
        sessionStorage.setItem('place', target)
        console.log(`Set place to ${this.menu.places[target]}`)
        this.loadImage(`./textures/${target}.png`, this.onPlaceTexturesLoad)
    }

    onPlaceTexturesLoad([rgba, png]) {
        // this.canvas.removeElementsById("block")
        var bs = this.menu.size.block_size
        var img = this.canvas.loadImage("blocks", "", "", false, 0, 0, png.width - png.width % bs, bs, ["255:255:255:255"], rgba)
        // this.canvas.addElement(img, -50, 0, 0)

        // Cut blocks
        for (var i = 0; i < img.data[0].length / bs; i++) {
            var block = this.canvas.getImageFromImage('block', img, i * bs, 0, bs, bs)
            var blockNum = this.BLOCK_BEGINNING_NUMBER + i
            if (!this.textures.block[blockNum]) this.textures.block[blockNum] = block // On first change set block
            else this.textures.block[blockNum].data = block.data // On later ones set only data
        }
        // Inform classes
        this.menu.paletteRendered = false
        this.menu.onPlaceTexturesChange()
    }

    render() {
        this.canvas.render()
        requestAnimationFrame(this.render)
    }
}
