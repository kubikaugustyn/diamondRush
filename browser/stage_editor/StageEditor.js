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
        this.textures = this.stageEditor.textures

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.places = {
            angkor: 'Angkor Wat',
            bavaria: 'Bavaria',
            siberia: 'Siberia'
        }
        if (!this.stageEditor.place) this.stageEditor.place = Object.keys(this.places)[0]
        // Render the place menu
        this.placesMenu = document.createElement('fieldset')
        this.placesMenu.innerHTML = '<legend>Choose destination</legend>'
        /*this.placesMenu.innerHTML += Object.entries(this.places).map(([fileName, text]) => {
            return `<label><input type="radio" value="${fileName}" name="place"${fileName === this.stageEditor.place ? " checked" : ""}>${text}</label>`
        }).join('<br>').concat('<br>')*/
        Object.entries(this.places).forEach(([fileName, text]) => {
            this.placesMenu.appendChild(this.createInput('radio', fileName, 'place', fileName === this.stageEditor.place, text, '').label)
            this.placesMenu.appendChild(this.br())
        })
        this.placesMenu.appendChild(this.okButton = this.createButton('OK', this.okButtonClick))
        this.stageEditor.container.appendChild(this.placesMenu)
        // Render the stage menu
        this.stageMenu = document.createElement('fieldset')
        this.stageMenu.innerHTML = '<legend>New Stage</legend>'
        this.stageMenuElements = {
            width: this.createInput('number', '25', 'stageWidth', false, ' blocks', 'Stage Width ', 5, {width: '50px'}, {
                max: (256 * 256) - 1,
                min: 1
            }),
            height: this.createInput('number', '25', 'stageHeight', false, ' blocks', 'Stage Width ', 5, {width: '50px'}, {
                max: (256 * 256) - 1,
                min: 1
            }),
            create: this.createButton('Create', this.stageEditor.stage.newStage),
        }
        Object.values(this.stageMenuElements).forEach(el => {
            this.stageMenu.appendChild(el?.label ? el.label : el)
            this.stageMenu.appendChild(this.br())
        })
        this.stageEditor.container.appendChild(this.stageMenu)
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
                [120, 121, 122, 123, 124],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0]
            ]
        }
        this.paletteRendered = false
        this.paletteClickListener = null
    }

    onClick(event) {
        if (event.data.target.id !== 'cursor') return
        if (event.data.targets.length !== 2) return
        if (event.data.targets[1].id !== 'menu-block') return
        var blockTexture = event.data.targets[1].element
        var blockNum = blockTexture.blockNum
        console.log(`Set block to: ${blockNum},`, blockTexture, event)
        this.stageEditor.stage.brush.block = blockNum
    }

    br() {
        return document.createElement('br')
    }

    createInput(type = 'radio', value = 'Input', name = 'input', checked = false, textAfter = 'Hello', textBefore = 'World', size = NaN, styles = {}, attributes = {}) {
        // `<label><input type="radio" value="${fileName}" name="place"${fileName === this.stageEditor.place ? " checked" : ""}>${text}</label>`
        var lb = document.createElement('label')
        var input = document.createElement('input')
        input.type = type
        input.value = value
        input.name = name
        !isNaN(size) && input.setAttribute('size', size)
        checked && input.setAttribute('checked', 'checked')
        Object.entries(styles).forEach(([name, val]) => input.style[name] = val)
        Object.entries(attributes).forEach(([name, val]) => input.setAttribute(name, val))
        lb.appendChild(input)
        textBefore.length && lb.insertAdjacentHTML('afterbegin', textBefore)
        textAfter.length && lb.insertAdjacentHTML('beforeend', textAfter)
        return {
            label: lb, input
        }
    }

    createButton(text, onclick) {
        var button = document.createElement('button')
        button.innerHTML = text
        button.addEventListener('click', onclick)
        return button
    }

    okButtonClick() {
        var inputs = new Array(...this.placesMenu.getElementsByTagName("input")).filter(a => a.checked && a.name === 'place')
        if (!inputs.length) return console.log("You didn't choose any of places.")
        var place = inputs[0].value
        this.stageEditor.changePlace(place)
    }

    onPlaceTexturesChange() {
        if (!this.paletteClickListener) {
            this.paletteClickListener = this.stageEditor.canvas.createEventListener('click', this.onClick, {target: this.stageEditor.canvas.createImage('cursor', [])})
            this.stageEditor.canvas.addEventListener(this.paletteClickListener)
        }
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
                    block.blockNum = blockNum
                    this.stageEditor.canvas.addElement(block, rx, ry, 2)
                }
            }
        }
    }
}

class StageEditorStage {
    constructor(stageEditor) {
        this.stageEditor = stageEditor
        this.textures = this.stageEditor.textures

        this.stage = []
        this.stageData = {
            w: 0,
            h: 0,
            x: 0,
            y: 0,
            viewWidth: Math.floor(240 / 24),
            viewHeight: Math.floor(320 / 24)
        }
        this.brush = {
            block: 115,
            layer: 'back',
            layers: ['all', 'back', 'front', 'data'],
            x: 0,
            y: 0
        }

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

    }

    newStage() {
        var w = parseInt(this.stageEditor.menu.stageMenuElements.width.input.value)
        var h = parseInt(this.stageEditor.menu.stageMenuElements.height.input.value)
        if (!w || isNaN(w) || !h || isNaN(h) || w < 1 || h < 1) return
        var blocks = []
        for (var y = 0; y < h; y++) {
            var line = []
            for (var x = 0; x < w; x++) {
                var block = {
                    back: 255,
                    front: 255,
                    data: 255
                }
                line.push(block)
            }
            blocks.push(line)
        }
        this.createStage(w, h, blocks)
    }

    createStage(w, h, blocks) {
        if (!w || isNaN(w) || !h || isNaN(h) || w < 1 || h < 1 || !blocks || !blocks instanceof Array) return
        console.log('Create stage!')
        this.stageData.w = w
        this.stageData.h = h
        this.stageData.x = 0
        this.stageData.y = 0
        this.stage = blocks
    }

    render() {
        if (!this.stageData.w || !this.stageData.h) return
        var canvas = this.stageEditor.canvas
        var bs = this.stageEditor.menu.size.block_size
        // Render the stage
        canvas.removeElementsById('block')
        var layers = this.brush.layer === 'all' ? this.brush.layers.filter(a => a !== 'all') : [this.brush.layer]
        for (var y = 0; y < this.stageData.viewHeight; y++) {
            for (var x = 0; x < this.stageData.viewWidth; x++) {
                var block = this.stage?.[y + this.stageData.y]?.[x + this.stageData.x]
                for (var layer of layers) {
                    var texture = this?.textures?.block[block?.[layer]]
                    texture && canvas.addElement(texture, x * bs, y * bs, 0)
                }
            }
        }
        // Render current block
        var text = this.textures.block[this.brush.block] // text = texture
        // console.log('Current block:', text)
        text && this.brush.x < this.stageEditor.menu.size.x && canvas.addElement(text, this.brush.x - Math.floor(bs / 2), this.brush.y - Math.floor(bs / 2), 1)
        if (this.brush.x < this.stageEditor.menu.size.x) { // You're in stage
            var bx = Math.floor(this.brush.x / bs) + this.stageData.x
            var by = Math.floor(this.brush.y / bs) + this.stageData.y
            var keys = Object.keys(this.stageEditor.downKeyCodes)
            var layerI = this.brush.layers.indexOf(this.brush.layer)
            if (this.stage?.[by]?.[bx]?.[this.brush.layer] && this.brush.layer !== 'all') {
                if (keys.includes('ControlLeft')) { // Place
                    // console.log('Set block!')
                    this.stage[by][bx][this.brush.layer] = this.brush.block
                } else if (keys.includes('ShiftLeft') && this.stageEditor.downKeyCodes.ShiftLeft === 1) { // Pipette + Only at first call (&& this.stageEditor.downKeyCodes === 1)
                    this.stageEditor.downKeyCodes.ShiftLeft++
                    this.brush.block = this.stage[by][bx][this.brush.layer]
                }
            }
            if (keys.includes('ArrowLeft') && this.stageEditor.downKeyCodes.ArrowLeft === 1) { // - Layer
                this.stageEditor.downKeyCodes.ArrowLeft++
                console.log('- Layer')
                layerI--
                if (layerI < 0) layerI = 0
            } else if (keys.includes('ArrowRight') && this.stageEditor.downKeyCodes.ArrowRight === 1) { // + Layer
                this.stageEditor.downKeyCodes.ArrowRight++
                console.log('+ Layer')
                layerI++
                if (layerI >= this.brush.layers.length) layerI = this.brush.layers.length - 1
            }
            this.brush.layer = this.brush.layers[layerI]
        } else { // Cursor is over palette

        }
    }
}

class StageEditor {
    constructor(container) {
        this.container = container

        this.container.appendChild(this.canvasElement = document.createElement('canvas'))
        this.textures = {block: {}}
        this.place = sessionStorage.getItem('place')
        this.stage = new StageEditorStage(this)
        this.menu = new StageEditorMenu(this)
        this.canvas = new CanvasEngine2D({
            canvas: this.canvasElement,
            appName: "diamondRush-browser-stage_editor-textures",
            imageW: 240 + (this.menu.size.w),
            imageH: Math.max(320, this.menu.size.h),
            backgroundColor: [0, 255, 255, 255],
            scale: 2
        })
        // this.canvas.args.camera.x = 250
        // this.canvas.args.camera.zoom = 5
        this.menu.size.x = 240
        this.BLOCK_BEGINNING_NUMBER = 80
        this.openerId = new URL(document.location).searchParams.get('id')
        this.lastMsg = null
        this.lastMsgSent = null
        this.downKeyCodes = {}

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.menu.okButton.click()

        // If window is opened from all_files/index.html or other
        if (window.opener) {
            window.addEventListener("message", (event) => {
                if (event.origin !== document.location.origin) return
                var data = event.data
                if (this.openerId !== data.id) return
                this.onMessage(data.msg)
            }, false)
            this.sendMessage('ready')
        }
        window.addEventListener('keydown', this.keyDown)
        window.addEventListener('keyup', this.keyUp)
        this.canvasElement.addEventListener('mousemove', this.mouseMove)
    }

    error(msg) {
        console.error(msg)
    }

    init() {
        var c = [255, 0, 0, 255]
        var l = new Array(5).fill(c)
        var i = new Array(5).fill(l)
        this.canvas.addElement(this.canvas.createImage('cursor', i), 0, 0, 100)
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
        var rgba = [...(new Uint8Array(png.data))]
        return [rgba, png]
    }

    changePlace(target) {
        if (!target || typeof target !== 'string') return
        this.place = target
        this.textures.block = {} // Remove old place textures to prevent cross-place textures and blocks (looks weird and would crash game)
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

    keyDown(ev) {
        if (ev.target !== document.body) return
        if (!Object.keys(this.downKeyCodes).includes(ev.code)) this.downKeyCodes[ev.code] = 0
        this.downKeyCodes[ev.code]++
        if (!this.stage.stageData.w || !this.stage.stageData.h) return
        console.log(ev.code, ev)
        switch (ev.code) { // Don't care abut shift and CapsLock etc.
            case 'KeyA':
                this.stage.stageData.x--
                if (this.stage.stageData.x < 0) this.stage.stageData.x = 0
                break
            case 'KeyD':
                this.stage.stageData.x++
                if (this.stage.stageData.x >= (this.stage.stageData.w - this.stage.stageData.viewWidth)) this.stage.stageData.x = (this.stage.stageData.w - this.stage.stageData.viewWidth) - 1
                break
            case 'KeyW':
                this.stage.stageData.y--
                if (this.stage.stageData.y < 0) this.stage.stageData.y = 0
                break
            case 'KeyS':
                this.stage.stageData.y++
                if (this.stage.stageData.y >= (this.stage.stageData.h - this.stage.stageData.viewHeight)) this.stage.stageData.y = (this.stage.stageData.h - this.stage.stageData.viewHeight) - 1
                break
        }
    }

    keyUp(ev) {
        if (ev.target !== document.body) return
        if (!Object.keys(this.downKeyCodes).includes(ev.code)) return
        // this.downKeyCodes = this.downKeyCodes.filter(code => code !== ev.code)
        delete this.downKeyCodes[ev.code]
    }

    mouseMove(ev) {
        // console.log(ev.target, ev)
        var x = Math.floor((ev.offsetX / this.canvas.args.scale) / this.canvas.args.camera.zoom) + this.canvas.args.camera.x
        var y = Math.floor((ev.offsetY / this.canvas.args.scale) / this.canvas.args.camera.zoom) + this.canvas.args.camera.y
        this.stage.brush.x = x
        this.stage.brush.y = y
        this.canvas.setElementsPositionById('cursor', x - 2, y - 2, 100)
    }

    render() {
        this.stage.render()

        this.canvas.render()
        requestAnimationFrame(this.render)
    }

    sendMessage(msg) {
        if (!window.opener) return
        window.opener.postMessage(msg, document.location.origin)
        console.log('Sent message:', msg)
        this.lastMsgSent = msg
    }

    onMessage(msg) {
        console.log('Got message:', msg)
        switch (msg) {
            case 'ready':
                this.sendMessage('send-place')
                break
            default:
                if (this.lastMsgSent === 'send-place') {
                    console.log('Received place!', msg)
                    this.changePlace(msg)
                    this.sendMessage('send-stage')
                } else if (this.lastMsgSent === 'send-stage') {
                    console.log('Received stage!', msg)
                    this.stage.createStage(msg.w, msg.h, msg.blocks)
                }
        }
        this.lastMsg = msg
    }
}
