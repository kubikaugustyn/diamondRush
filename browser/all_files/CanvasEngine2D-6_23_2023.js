var __author__ = "kubik.augustyn@post.cz"

class CanvasEngine2DEventListener {
    constructor(type, listener, conditions = []) {
        this.type = type
        this.listener = listener
        this.conditions = conditions
        this.id = ([1e7] + -1e3 + -4e3 + -8e3 + -1e11).replace(/[018]/g, c =>
            (c ^ crypto.getRandomValues(new Uint8Array(1))[0] & 15 >> c / 4).toString(16)
        )

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        });
    }
}

class CanvasEngine2DEvent {
    constructor(data) {
        this.data = data

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        });
    }
}

class CanvasEngine2DCamera {
    /**
     * @type {number}
     */
    x
    /**
     * @type {number}
     */
    y
    /**
     * @type {number}
     */
    viewWidth
    /**
     * @type {number}
     */
    viewHeight
    /**
     * @type {number}
     */
    zoom

    constructor(x, y, viewWidth, viewHeight, zoom) {
        this.x = x
        this.y = y
        this.viewWidth = viewWidth
        this.viewHeight = viewHeight
        this.zoom = Math.floor(zoom)

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        });
    }

    watch(image, outOfImageColor) {
        // var watchedImage = []
        var z = this.zoom
        var line, x, y
        /*// Create blank image
        for (y = this.y; y < this.viewHeight + this.y; y++) {
            line = []
            for (x = this.x; x < this.viewWidth + this.x; x++) {
                line.push(outOfImageColor)
            }
            watchedImage.push(line)
        }*/
        // Cut out part of image
        var lineW = Math.floor(this.viewWidth / z + this.x), lineWPX = Math.floor(this.viewWidth / z)
        var lineH = Math.floor(this.viewHeight / z + this.y), lineHPX = Math.floor(this.viewHeight / z)
        var lineX, wholeY
        var cutImage = new Array(lineHPX)
        for (wholeY = 0, y = this.y; wholeY < lineHPX; y++, wholeY++) {
            line = new Array(lineWPX)
            for (lineX = 0, x = this.x; lineX < lineWPX; x++, lineX++) {
                if (image?.[y]?.[x]) line[lineX] = image[y][x]
                else line[lineX] = outOfImageColor
            }
            cutImage[wholeY] = line
        }
        // Zoom
        var zoomedImage = new Array(this.viewHeight)
        var cutY
        for (y = 0; y < this.viewHeight; y++) {
            cutY = Math.floor(y / z)
            line = new Array(this.viewWidth)
            try {
                for (x = 0; x < this.viewWidth; x++) {
                    line[x] = cutImage[cutY][Math.floor(x / z)]
                }
            } catch (e) {
                console.log(e)
                console.log(cutY, y, z,lineHPX)
                console.log(cutImage[cutY], cutImage)
            }
            zoomedImage[y] = line
        }
        // TDO There's some error lmao
        // TDO BIG optimization - 1500x1000px should have 60 FPS min., not 3-5 FPS
        return zoomedImage
    }
}

class CanvasEngine2DElement {
    /**
     * @type {string}
     */
    id
    /**
     * @type {CanvasEngine2DImage}
     */
    element
    /**
     * @type {number}
     */
    x
    /**
     * @type {number}
     */
    y
    /**
     * @type {number}
     */
    z
    /**
     * @type {boolean}
     */
    visible

    constructor(element, x, y, z) {
        this.id = element.id
        this.element = element
        this.x = x
        this.y = y
        this.z = z
        this.visible = true

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        });
    }
}

class CanvasEngine2DImage {
    /**
     * @type {string|null}
     */
    id
    /**
     * @type {string}
     */
    type
    /**
     * @type {string}
     */
    colorSpace
    /**
     * @type {string}
     */
    colorSpaceRealName
    /**
     * @type {number[][]|null}
     */
    data

    /**
     * Constructor
     * @param args Arguments for the init method
     */
    constructor(...args) {
        this.id = null
        this.type = "image"
        this.colorSpace = "rgba"
        this.colorSpaceRealName = "srgb"
        this.data = null

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.init(...args)
    }

    /**
     * Flips this image by changing its contents
     * @param flip {-1|1} How to flip {-1, 1}
     * @param callBeforeRender {boolean} Set to false when called in beforeRender method
     */
    flip(flip, callBeforeRender = true) {
        /*
        -1: Flip from ^ to v
         1: Flip from < to >
        */
        if (typeof flip !== "number" || !Number.isInteger(flip) || flip < -1 || flip > 1 || flip === 0) throw new Error("CanvasEngine2DImage rotate: Flip out of {-1, 1} bounds.")
        if (callBeforeRender) this.beforeRender()

        var oldData = this.data.slice().map(a => a.slice())
        var newData = []
        if (flip === 1) newData = oldData.map(a => a.reverse())
        else newData = oldData.reverse()
        this.data = newData
    }

    /**
     * Rotates this image by changing its contents
     * @param rotation {-1|1|2} How to rotate {-1, 1, 2}
     * @param callBeforeRender {boolean} Set to false when called in beforeRender method
     */
    rotate(rotation, callBeforeRender = true) {
        /*
        -1: Rotate from ^ to <
         1: Rotate from ^ to >
         2: Rotate from ^ to v
        */
        if (typeof rotation !== "number" || !Number.isInteger(rotation) || rotation < -1 || rotation > 2 || rotation === 0) throw new Error("CanvasEngine2DImage rotate: Rotation out of {-1, 1, 2} bounds.")
        if (callBeforeRender) this.beforeRender()

        var oldData = this.data.slice().map(a => a.slice())
        var newData = []
        if (rotation !== 2) {
            // First we rotate as we were given rotation -1
            var [newW, newH] = [this.data.length, this.data[0].length]
            for (var y = 0; y < newH; y++) {
                var line = new Array(newW)
                for (var x = 0; x < newW; x++) {
                    line[x] = oldData[x][newW - y - 1]
                }
                newData.push(line)
            }
            // Then we rotate by 2 if given rotation is 1
            if (rotation === 1) {
                rotation = 2
                oldData = newData.slice()
            }
        }
        if (rotation === 2) newData = oldData.reverse().map(a => a.reverse())
        this.data = newData
    }

    /**
     * Rotates this image by changing its contents
     * @param angle {number} What angle to rotate (can't be negative!)
     * @param pointX {number} X of point to rotate around
     * @param pointY {number} X of point to rotate around
     * @param callBeforeRender {boolean} Set to false when called in beforeRender method
     * @returns {number[2]} Delta of x and y movement (move the element<pre>x=yourX+Math.round(deltaX) and y=yourY+Math.round(deltaY)</pre>)
     */
    rotateDegreesAroundPoint(angle, pointX, pointY, callBeforeRender = true) {
        throw new Error("Not implemented: this thing doesn't work")
        if (typeof angle !== "number" || !Number.isInteger(angle) || angle <= 0 || angle >= 360) throw new Error("CanvasEngine2DImage rotate: Rotation out of (-360, 360) bounds.")
        if (typeof pointX !== "number" || !Number.isInteger(pointX) || pointX < 0) throw new Error("CanvasEngine2DImage rotate: X point out of <0, Infinity) bounds.")
        if (typeof pointY !== "number" || !Number.isInteger(pointY) || pointY < 0) throw new Error("CanvasEngine2DImage rotate: Y point out of <0, Infinity) bounds.")
        if (callBeforeRender) this.beforeRender()

        /*var newData = []
        var angleRadians = angle * Math.PI / 180
        var sina = Math.sin(angleRadians)
        var cosa = Math.cos(angleRadians)
        var negativeAngle = angle < 0
        if (angle < 0) angle = 360 + angle
        var angleRadiansLimited = (angle % 90) * Math.PI / 180
        var sinaLimited = Math.sin(angleRadiansLimited)
        var cosaLimited = Math.cos(angleRadiansLimited)
        if (negativeAngle) [sinaLimited, cosaLimited] = [cosaLimited, sinaLimited] // Very sketchy, but it's working...
        var newW = Math.abs(Math.floor(cosaLimited * this.data[0].length + sinaLimited * this.data.length))
        var newH = Math.abs(Math.floor(cosaLimited * this.data.length + sinaLimited * this.data[0].length))
        var halfOldW = this.data[0].length / 2
        var halfOldH = this.data.length / 2
        var halfNewWDelta = (Math.max(newW, this.data[0].length) - Math.min(newW, this.data[0].length)) / 2
        var halfNewHDelta = (Math.max(newH, this.data.length) - Math.min(newH, this.data.length)) / 2
        for (var _ = 0; _ < newH; _++) newData.push(new Array(newW).fill(0).map(() => CanvasEngine2DVariables.COLORS.YELLOW)) // TRANSPARENT
        var wm1 = this.data[0].length - 1
        var hm1 = this.data.length - 1
        for (var i = 0; i < newH; i++) {
            console.log(newH / 8, pointY,halfNewHDelta,halfNewHDelta*2*cosa)
            var ydif = i + (pointY - newH / 8)//negativeAngle ? newH - i - halfOldH : halfOldH - i - 1
            var ydifSina = ydif * sina
            var ydifCosa = ydif * cosa
            for (var j = 0; j < newW; j++) {
                var xdif = j + pointX - newW//negativeAngle ? newW - j - halfOldW : halfOldW - j - 1
                var x = Math.round(pointX + (xdif * cosa - ydifSina))
                if (x < 0 || x > wm1) continue
                var y = Math.round(pointY + (xdif * sina + ydifCosa))
                if (y < 0 || y > hm1) continue
                try {
                    newData[i][j] = this.data[y][x]
                } catch (e) {
                    console.log(i, j, y, x)
                    console.log(e)
                }
            }
        }
        this.data = newData
        return [-halfNewWDelta, -halfNewHDelta]*/
        // https://stackoverflow.com/questions/59909942/how-can-you-rotate-an-image-around-an-off-center-pivot-in-pygame
        var [oldH, oldW] = [this.data.length, this.data[0].length]
        var image_rect = [-pointY, -pointX, -pointY + oldH, -pointX + oldW]
        var offset_center_to_pivot = [-(image_rect[2] - image_rect[0]) / 2, -(image_rect[3] - image_rect[1]) / 2]
        var angleRadians = -angle * Math.PI / 180
        var sina = Math.sin(angleRadians)
        var cosa = Math.cos(angleRadians)
        var rotated_offset = [offset_center_to_pivot[0] * cosa - offset_center_to_pivot[1] * sina,
            offset_center_to_pivot[0] * sina + offset_center_to_pivot[1] * cosa]
        var rotated_image_center = [-rotated_offset[0], -rotated_offset[1]]
        var [deltaX, deltaY] = this.rotateDegrees(angle, callBeforeRender)
        var rotated_image_rect = [rotated_image_center[0] - deltaY, rotated_image_center[1] - deltaX,
            rotated_image_center[0] + deltaY, rotated_image_center[1] + deltaX]
        console.log(rotated_image_rect, -deltaX * 2 + oldW, -deltaY * 2 + oldH)
        // this.data[oldH + Math.floor(offset_center_to_pivot[0])][oldW + Math.floor(offset_center_to_pivot[1])] = CanvasEngine2DVariables.COLORS.GREEN
        return [deltaX - oldW / 2, deltaY]
    }

    /**
     * Rotates this image by changing its contents
     * @param angle {number} What angle to rotate (can't be negative!)
     * @param callBeforeRender {boolean} Set to false when called in beforeRender method
     * @returns {number[2]} Delta of x and y movement (move the element<pre>x=yourX+Math.round(deltaX) and y=yourY+Math.round(deltaY)</pre>)
     */
    rotateDegrees(angle, callBeforeRender = true) {
        if (typeof angle !== "number" || !Number.isInteger(angle) || angle <= 0 || angle >= 360) throw new Error("CanvasEngine2DImage rotate: Rotation out of (0, 360) bounds.")
        if (callBeforeRender) this.beforeRender()

        var newData = []
        var angleRadians = angle * Math.PI / 180
        var sina = Math.sin(angleRadians)
        var cosa = Math.cos(angleRadians)
        var angleRadiansLimited = (angle % 90) * Math.PI / 180
        var sinaLimited = Math.sin(angleRadiansLimited)
        var cosaLimited = Math.cos(angleRadiansLimited)
        var newW = Math.abs(Math.floor(cosaLimited * this.data[0].length + sinaLimited * this.data.length))
        var newH = Math.abs(Math.floor(cosaLimited * this.data.length + sinaLimited * this.data[0].length))
        var halfNewWDelta = (Math.max(newW, this.data[0].length) - Math.min(newW, this.data[0].length)) / 2
        var halfNewHDelta = (Math.max(newH, this.data.length) - Math.min(newH, this.data.length)) / 2
        for (var _ = 0; _ < newH; _++) newData.push(new Array(newW).fill(0).map(() => CanvasEngine2DVariables.COLORS.YELLOW))
        // http://leptonica.org/rotation.html#ROTATION-BY-AREA-MAPPING
        // https://github.com/DanBloomberg/leptonica/blob/master/src/rotate.c
        // Fixed MY mistake (simple - instead of +) using: https://stackoverflow.com/questions/622140/calculate-bounding-box-coordinates-from-a-rotated-rectangle#answer-622172
        var centerX = this.data[0].length / 2
        var centerY = this.data.length / 2
        var wm1 = this.data[0].length - 1
        var hm1 = this.data.length - 1
        /*
        I think it works by scanning through all pixels of source image, then calculates new position for the pixel from source and puts it to the target image
        */
        for (var i = 0; i < newH; i++) {
            var ydif = centerY - i + halfNewHDelta
            var ydifSina = ydif * sina
            var minusYdifCosa = -ydif * cosa
            for (var j = 0; j < newW; j++) {
                var xdif = centerX - j + halfNewWDelta
                var x = Math.round(centerX + (-xdif * cosa + ydifSina))
                if (x < 0 || x > wm1) continue
                var y = Math.round(centerY + (minusYdifCosa - xdif * sina))
                if (y < 0 || y > hm1) continue
                try {
                    newData[i][j] = this.data[y][x]
                } catch (e) {
                    console.log(i, j, y, x)
                    console.log(e)
                    break
                }
            }
        }
        this.data = newData
        return [-halfNewWDelta, -halfNewHDelta]
    }

    /**
     * Initialises Image
     * @param id Id of the image
     * @param data Data of the image (2D array of [R, G, B, A])
     */
    init(id, data) {
        this.id = id
        this.data = data
    }

    /**
     * Checks if image should be rendered, if is visible and not out of the camera view
     * @param element Element that this image is stored in
     * @param camera Camera which is looking at the element
     * @returns {boolean} If image should be rendered
     */
    checkRender(element, camera) {
        return true
    }

    /**
     * Called before image is rendered, only if checkRender method returns true
     * / when rotate method is used
     */
    beforeRender() {
    }

    /**
     * Clones itself
     * @returns CanvasEngine2DImage
     */
    clone() {
        return new CanvasEngine2DImage(this.id, JSON.parse(JSON.stringify(this.data)))
    }

    /**
     * Coverts CanvasEngine2DImage class into Object class
     * @returns {{args: *[], signature: string}}
     */
    toObject() {
        return {signature: "CanvasEngine2DImage", args: [this.id, this.data]}
    }

    /**
     * Coverts Object class into CanvasEngine2DImage class
     * @param signature
     * @param args
     */
    fromObject({signature, args}) {
        if (signature !== "CanvasEngine2DImage") return
        return new CanvasEngine2DImage(...args)
    }
}

/**
 * Image mask, where you can change it's whole color by changing CanvasEngine2DImageMask.color field because of JS Object links
 *
 * Useful when darkening some images (light)
 *
 * Can be also used to color images by shape (coloring letters with 0 alpha background etc.)
 */
class CanvasEngine2DImageMask extends CanvasEngine2DImage {
    /**
     * Init method
     * @param id Id of the mask, can be used in positioning etc. methods of CanvasEngine2D
     * @param width Width of the mask
     * @param height Height of the mask
     * @param color Mask color
     * @param followedShape (Optional) Image the mask should follow
     */
    init(id, width, height, color, followedShape) {
        this.id = id
        this.width = width
        this.height = height
        this.color = color

        this.followedShape = null // Mask will be of same shape as this image
        this.followShape(followedShape)

        if (!this.data) this.buildData() // If not following shape, it will change the whole image
    }

    buildData() {
        var line = new Array(this.width).fill(this.color) // Single line of data, the this.color will be same for all elements even after change because it's JS Object
        this.data = new Array(this.height).fill(line) // Fill the whole data
    }

    followShape(image) {
        if (!image) return
        this.followedShape = image
        this.data = new Array(this.height)
        for (var y = 0; y < this.height; y++) {
            var line = new Array(this.width)
            for (var x = 0; x < this.width; x++) {
                var shapePixel = image?.[y]?.[x]?.slice?.()
                // y === 0 && x < 10 && console.log(shapePixel)
                if (shapePixel && shapePixel[3]) line[x] = this.color // If transparent or no pixel, skip it
                else line[x] = CanvasEngine2DVariables.COLORS.TRANSPARENT
            }
            this.data[y] = line
        }
    }

    clone() {
        return new CanvasEngine2DImageMask(this.id, this.width, this.height, this.color.slice())
    }

    toObject() {
        return {
            signature: "CanvasEngine2DImageMask",
            args: [this.id, this.width, this.height, this.color]
        }
    }

    fromObject({signature, args}) {
        if (signature !== "CanvasEngine2DImageMask") return
        return new CanvasEngine2DAnimatedImage(...args)
    }
}

class CanvasEngine2DAnimatedImage extends CanvasEngine2DImage {
    init(id, images, imageIndex) {
        this.id = id
        this.images = images
        this.imageIndex = imageIndex
    }

    beforeRender() {
        this.data = this.images[this.imageIndex].data
    }

    clone() {
        return new CanvasEngine2DAnimatedImage(this.id, this.images.map(a => a.clone()), this.imageIndex)
    }

    toObject() {
        return {
            signature: "CanvasEngine2DAnimatedImage",
            args: [this.id, this.images, this.imageIndex]
        }
    }

    fromObject({signature, args}) {
        if (signature !== "CanvasEngine2DAnimatedImage") return
        return new CanvasEngine2DAnimatedImage(...args)
    }
}

class CanvasEngine2DAutomaticallyAnimatedImage extends CanvasEngine2DImage {
    init(id, images, imageIndex, rendersToNextImage) {
        this.id = id
        this.images = images
        this.imageIndex = imageIndex
        this.rendersToNextImage = rendersToNextImage
        this.renders = 0
    }

    beforeRender() {
        this.renders++
        if (this.renders >= this.rendersToNextImage) {
            this.renders = 0
            this.imageIndex++
            if (this.imageIndex >= this.images.length) this.imageIndex = 0
        }
        this.data = this.images[this.imageIndex].data
    }

    clone() {
        return new CanvasEngine2DAutomaticallyAnimatedImage(this.id, this.images.map(a => a.clone()), this.imageIndex, this.rendersToNextImage)
    }

    toObject() {
        return {
            signature: "CanvasEngine2DAutomaticallyAnimatedImage",
            args: [this.id, this.images, this.imageIndex, this.rendersToNextImage]
        }
    }

    fromObject({signature, args}) {
        if (signature !== "CanvasEngine2DAutomaticallyAnimatedImage") return
        return new CanvasEngine2DAutomaticallyAnimatedImage(...args)
    }
}

class CanvasEngine2DVariables {
    static METHODS = class {
        static  DRAWIMAGEIMAGE = class {
            static FIRST = 0
            static SECOND = 1
        }
    }
    static IMAGES = [CanvasEngine2DImage, CanvasEngine2DAnimatedImage, CanvasEngine2DAutomaticallyAnimatedImage, CanvasEngine2DImageMask]
    static COLORS = class CanvasEngine2DColors {
        static get TRANSPARENT() {
            return [0, 0, 0, 0]
        }

        static get WHITE() {
            return [255, 255, 255, 255]
        }

        static get BLACK() {
            return [0, 0, 0, 255]
        }

        static get RED() {
            return [255, 0, 0, 255]
        }

        static get GREEN() {
            return [0, 255, 0, 255]
        }

        static get BLUE() {
            return [0, 0, 255, 255]
        }

        static get CYAN() {
            return [0, 255, 255, 255]
        }

        static get MAGENTA() {
            return [255, 0, 255, 255]
        }

        static get YELLOW() {
            return [255, 255, 0, 255]
        }

        static get GRAY() {
            return [128, 128, 128, 255]
        }
    }
}

class CanvasEngine2D {
    /**
     * Constructor
     * @param args Engine arguments
     */
    constructor(args = {}) {
        this.args = {
            ...{
                camera: undefined,
                canvas: HTMLCanvasElement,
                appName: "",
                imageW: 0,
                imageH: 0,
                backgroundColor: [255, 255, 255, 255],
                methods: {
                    drawImageImage: CanvasEngine2DVariables.METHODS.DRAWIMAGEIMAGE.FIRST
                },
                scale: 1
            }, ...args
        }
        this.time = {
            render: {
                start: 0,
                end: 0,
                total: 0,
                endToStart: 0
            }
        }
        this.renderFPS = 0
        this.elements = []
        this.realCanvas = document.createElement("canvas")
        this.ctx = undefined
        this.image = []
        this.lastImage = []
        this.rendersNum = 0
        this.plx = undefined
        this.ply = undefined
        this.eventListeners = []

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        });

        this.processArgs()
        this.createBlankImage()
        this.preparePointerLock()
    }

    preparePointerLock() {
        this.resetPointerLockMouseMove()
        document.addEventListener('pointerlockchange', this.pointerLockChange, false);
        document.addEventListener('mozpointerlockchange', this.pointerLockChange, false);
    }

    requestPointerLock() {
        var func = this.args.canvas.requestPointerLock || this.args.canvas.mozRequestPointerLock
        func = func.bind(this.args.canvas)
        func()
    }

    exitPointerLock() {
        var func = document.exitPointerLock || document.mozExitPointerLock
        func = func.bind(document)
        func()
    }

    pointerLockChange() {
        if (document.pointerLockElement === this.args.canvas || document.mozPointerLockElement === this.args.canvas) {
            document.addEventListener("mousemove", this.pointerLockMouseMove, false)
            this.handleEvent("pointerLockChange", {locked: true})
        } else {
            document.removeEventListener("mousemove", this.pointerLockMouseMove, false)
            this.resetPointerLockMouseMove()
            this.handleEvent("pointerLockChange", {locked: false})
        }
    }

    resetPointerLockMouseMove() {
        this.plx = 0
        this.ply = 0
    }

    pointerLockMouseMove(e) {
        var movementX = e.movementX || e.mozMovementX || 0;
        var movementY = e.movementY || e.mozMovementY || 0;
        if (!movementX && !movementY) return
        this.plx += movementX;
        this.ply += movementY;
        this.handleEvent("pointerLockMouseMove", {mouseX: this.plx, mouseY: this.ply, movementX, movementY})
    }

    addEventListener(listener) {
        return this.eventListeners.push(listener)
    }

    removeEventListener(listener) {
        this.eventListeners = this.eventListeners.filter(a => a.id !== listener.id)
        return listener
    }

    createEventListener(type, listener, conditions = {}) {
        return new CanvasEngine2DEventListener(type, listener, conditions)
    }

    click(e) {
        // console.log("Canvas clicked.", e)
        var csPos = this.args.canvas.getBoundingClientRect()
        var x = e.clientX - csPos.x
        var y = e.clientY - csPos.y
        x /= this.args.scale
        y /= this.args.scale
        x = Math.floor(x)
        y = Math.floor(y)
        var targets = this.elements.sort((elem1, elem2) => elem2.z - elem1.z).filter(elem => {
            if (elem && elem.element && elem.element.data && elem.visible) {
                var eH = elem.element.data.length
                var eY = elem.y
                var eX = elem.x
                var eW = elem.element.data[0].length
                return (x >= eX && y >= eY && x <= eX + eW && y <= eY + eH)
            }
            return false
        })
        this.handleEvent("click", {target: targets[0], targets, canvas: this.args.canvas, sourceEvent: e})
    }

    handleEvent(type, data = {}) {
        for (var listener of this.eventListeners.filter(a => a.type === type)) {
            var handle = true
            for (var [key, value] of Object.entries(listener.conditions)) {
                switch (key) {
                    case "target":
                        // console.log(data.target, "must be", value)
                        if (data.target.id !== value.id) handle = false
                        break
                    default:
                        console.log("Add later: ", key, value)
                        break
                }
            }
            if (handle) listener.listener(new CanvasEngine2DEvent(data))
        }
    }

    /**
     * Clears engine this.image
     * @param onlyWhereCamera {boolean} If replace places only where's camera (used in render) or whole image
     */
    createBlankImage(onlyWhereCamera = false) {
        var x, y
        if (onlyWhereCamera) {
            var maxX = this.args.camera.viewWidth + this.args.camera.x
            var maxY = this.args.camera.viewHeight + this.args.camera.y
            for (y = this.args.camera.y; y < maxY; y++) {
                for (x = this.args.camera.x; x < maxX; x++) this.image[y][x] = this.args.backgroundColor
            }
            return
        }
        this.image = new Array(this.args.imageH)
        var line = new Array(this.args.imageW)
        for (x = 0; x < this.args.imageW; x++) line[x] = this.args.backgroundColor
        for (y = 0; y < this.args.imageH; y++) this.image[y] = line.slice()
    }

    /**
     * Adds element to engine this.elements
     * @param element Created element
     * @param x Position X
     * @param y Position Y
     * @param z Position Z
     * @returns {CanvasEngine2DElement}
     */
    addElement(element, x, y, z) {
        var elem = new CanvasEngine2DElement(element, x, y, z)
        this.elements.push(elem)
        return elem
    }

    /**
     * Removes elements from engine this.elements by id
     * @param id
     */
    removeElementsById(id) {
        this.elements = this.elements.filter(a => a.id !== id)
    }

    /**
     * Sets elements position in engine this.elements by id
     * @param id Element id
     * @param x Position X
     * @param y Position Y
     * @param z Position Z
     */
    setElementsPositionById(id, x, y, z) {
        this.getElementsById(id).forEach(a => {
            a.x = x
            a.y = y
            a.z = z
        })
    }

    /**
     * Sets elements text in engine this.elements by id
     * @param id Element id
     * @param text Element text
     */
    setElementsTextById(id, text) {
        this.getElementsById(id).forEach(a => a.element.text = text)
    }

    /**
     * Sets elements data in engine this.elements by id
     * @param id Element id
     * @param data Element data (Image data)
     */
    setElementsDataById(id, data) {
        this.getElementsById(id).forEach(a => a.element.data = data)
    }

    /**
     * Sets elements visibility in engine this.elements by id
     * @param id Element id
     * @param visible Visible
     */
    setElementsVisibilityById(id, visible) {
        this.getElementsById(id).forEach(a => a.visible = visible)
    }

    /**
     * Sets image index in animated image in engine this.elements by id
     * @param id Element id
     * @param i Image index
     */
    setAnimatedImagesImageIndexById(id, i) {
        this.getElementsById(id).forEach(a => ["animatedImage", "automaticallyAnimatedImage"].includes(a.element.type) && (a.element.imageIndex = i))
    }

    /**
     * Gets elements from engine this.elements by id
     * @param id
     * @returns {(CanvasEngine2DElement)[]} [<Elements>]
     */
    getElementsById(id) {
        return this.elements.filter(a => a.id === id)
    }

    /**
     * Gets first element from engine this.elements by id
     * @param id Element's ID
     * @returns {CanvasEngine2DElement} <Element>
     */
    getElementById(id) {
        return this.elements.find(a => a.id === id)
    }

    /**
     * Creates and returns text object
     * @param id
     * @param text
     * @param color
     * @returns {{color: string, id: string, text: string, type: string}}
     */
    createText(id = "", text = "", color = "") {
        return {
            id,
            type: "text",
            color,
            text
        }
    }

    /**
     * Creates and returns animated image object
     * @param id
     * @param images
     * @param imageIndex
     * @returns CanvasEngine2DAnimatedImage
     */
    createAnimatedImage(id = "", images = [], imageIndex = 0) {
        return new CanvasEngine2DAnimatedImage(id, images, imageIndex)
    }

    /**
     * Creates and returns image object
     * @param id
     * @param data
     * @returns CanvasEngine2DImage
     */
    createImage(id = "", data) {
        return new CanvasEngine2DImage(id, data)
    }

    /**
     * Creates and returns automatically animated image object
     * @param id
     * @param images
     * @param imageIndex
     * @param rendersToNextImage
     * @returns CanvasEngine2DAutomaticallyAnimatedImage
     */
    createAutomaticallyAnimatedImage(id = "", images = [], imageIndex = 0, rendersToNextImage = 0) {
        return new CanvasEngine2DAutomaticallyAnimatedImage(id, images, imageIndex, rendersToNextImage)
    }

    /**
     * Processes engine arguments this.args
     */
    processArgs() {
        if (this.args.canvas === HTMLCanvasElement) {
            throw new Error("CanvasEngine2D doesn't have canvas to render.")
        } else {
            // Options: https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
            this.ctx = this.realCanvas.getContext("2d", {
                alpha: false,
                colorSpace: "srgb",
                desynchronized: true,
                willReadFrequently: true
            })
            this.args.canvas.addEventListener("click", this.click)
        }
        if (this.args.appName === "") {
            throw new Error("CanvasEngine2D doesn't have app name.")
        }
        if (this.args.imageW === 0) {
            throw new Error("CanvasEngine2D image width equals to zero.")
        }
        if (this.args.imageH === 0) {
            throw new Error("CanvasEngine2D image height equals to zero.")
        }
        if (this.args.scale === 0) {
            throw new Error("CanvasEngine2D image scale equals to zero.")
        }
        if (!this.args.camera) {
            this.args.camera = new CanvasEngine2DCamera(0, 0, this.args.imageW, this.args.imageH, 1)
        }
    }

    /**
     * Parses image by image string
     * @param imageString Image string
     * @returns {any}
     */
    parseImage(imageString) {
        var imageObject = JSON.parse(imageString)
        if (!(imageObject.signature && imageObject.args)) return
        for (var cls of CanvasEngine2DVariables.IMAGES) {
            var image = cls.prototype.fromObject(imageObject)
            if (image) {
                if (typeof image.data === "string") image.data = $$.Array.decompress3DArrayV1(image.data)
                return image
            }
        }
    }

    /**
     * Gets response text by URL
     * @param url URL
     * @returns {string}
     */
    getURLResponseText(url) {
        var http = new XMLHttpRequest()
        http.open("GET", url, false)
        http.send()
        return http.responseText
    }

    /*parseImageByImageURL(url, id) {
        var image = {
            id,
            source: {
                extension: url.split(".")[url.split(".").length - 1],
                url
            },
            codingVersion: "1",
            data: []
        }
        /!*var http = new XMLHttpRequest()
        http.open("GET", url, false)
        // http.setRequestHeader("content-type", "text/binary")
        http.send()

        function stringToArrayBuffer(str) {
            var buf = new ArrayBuffer(str.length);
            var bufView = new Uint8Array(buf);

            for (var i = 0, strLen = str.length; i < strLen; i++) {
                bufView[i] = str.charCodeAt(i);
            }

            return buf;
        }

        var responseText = stringToArrayBuffer(http.response)//this.getURLResponseText(url)
        var byteArray = new Uint8Array(responseText);

        /!*function arrayBufferToBase64(buffer) {
            var binary = '';
            var bytes = new Uint8Array(buffer);
            var len = bytes.byteLength;
            for (var i = 0; i < len; i++) {
                binary += String.fromCharCode(bytes[i]);
            }
            return window.btoa(binary);
        }*!/

        var data = []
        var rgb = []
        var byteIndex = 0

        for (var i = 0; i < byteArray.byteLength; i++) {
            //do something with each byte in the array
            // console.log("'" + /!*String.fromCharCode(*!/byteArray[i]/!*)*!/ + "'")
            rgb.push(byteArray[i])
            if (byteIndex === 2) {
                byteIndex = 0
                data.push(rgb)
                rgb = []
            } else {
                byteIndex++// = Math.ceil((i / 3 - Math.floor(i / 3)) * 3)
            }
        }
        // var imageURL = "data:image/png;base64," + arrayBufferToBase64(responseText)
        console.log(data)*!/
        return image
    }*/

    /**
     * Parses image by image tag id
     * @param id Image Id
     * @param tagId Image tag Id
     * @param dataX Image source data X
     * @param dataY Image source data Y
     * @param dataW Image source data Width
     * @param dataH Image source data Height
     * @param invisibleColors Colors to make invisible, format: r:g:b:a
     * @returns {CanvasEngine2DImage}
     */
    parseImageByImageTagID(id = "", tagId = "", dataX = 0, dataY = 0, dataW, dataH, invisibleColors = []) {
        var image = this.createImage(id, [])
        var canvas = document.createElement("canvas")
        var imgTag = document.getElementById(tagId)
        var ctx = canvas.getContext("2d", {
            alpha: true,
            colorSpace: "srgb",
            desynchronized: false,
            willReadFrequently: true
        })
        var width = imgTag.width
        var height = imgTag.height
        dataW = dataW || width
        dataH = dataH || height
        canvas.width = width
        canvas.height = height
        ctx.drawImage(imgTag, 0, 0, width, height)
        var data = ctx.getImageData(dataX, dataY, dataW, dataH)
        var pixels = Array.from(data.data)
        // var dataIndex = 0
        if (image.colorSpaceRealName === data.colorSpace) {
            image = this.parseRGBAImageData(image, data.width, data.height, pixels, invisibleColors)
        } else {
            throw new Error("CanvasEngine2D image to parse isn't in srgb color space, but " + data.colorSpace + ".")
        }
        return image
    }

    parseRGBAImageData(image, width, height, pixels, invisibleColors) {
        /* Method 1 Too slow (probably because of the Array.shift())
        for (var y = 0; y < height; y++) {
            var line = []
            for (var x = 0; x < width; x++) {
                var color = []
                for (var i = 0; i < 4; i++) {
                    // console.log(data.data)
                    var pixel = pixels.shift()//[dataIndex]
                    color.push(pixel)
                    // dataIndex++
                }
                line.push(invisibleColors.includes(color.join(":")) ? [0, 0, 0, 0] : color)
            }
            image.data.push(line)
        }*/
        // Method 2 Should work much faster
        image.data = []
        for (var y = 0; y < height; y++) {
            var line = []
            var rootI = y * width * 4
            for (var x = 0; x < width; x++) {
                var i = rootI + x * 4
                var color = [pixels[i], pixels[i + 1], pixels[i + 2], pixels[i + 3]]
                line.push(invisibleColors.includes(color.join(":")) ? CanvasEngine2DVariables.COLORS.TRANSPARENT : color)
            }
            image.data.push(line)
        }
        return image
    }

    /**
     * Parses image by image json url
     * @param url URL
     * @returns {any}
     */
    parseImageByJSONURL(url) {
        return this.parseImage(this.getURLResponseText(url))
    }

    /**
     * Stringifies image to string
     * @param image Image
     * @returns {string}
     */
    stringifyImage(image) {
        var temp
        temp = image.data
        image.data = $$.Array.compress3DArrayV1(temp)
        var result = JSON.stringify(image.toObject())
        image.data = temp
        return result
    }

    /**
     * Saves image to cache
     * @param image Image
     */
    saveImage(image) {
        localStorage.setItem(this.getImageLocalStorageKey(image.id), this.stringifyImage(image))
    }

    /**
     * Loads image from chache, JSON or image tag
     * @param id Image id
     * @param JSONUrl JSON URL
     * @param imageTagId Image tag id
     * @param allowLoadingCache Can load cache (loads last image state)
     * @param dataX Image tag source cut X
     * @param dataY Image tag source cut Y
     * @param dataW Image tag source cut Width
     * @param dataH Image tag source cut Height
     * @param invisibleColors Image tag source colors to make invisible
     * @param data Image tag data in Array format
     * @returns CanvasEngine2DImage
     */
    loadImage(id, JSONUrl = "", imageTagId = "", allowLoadingCache = true, dataX = 0, dataY = 0, dataW, dataH, invisibleColors = [], data = undefined) {
        var image = undefined
        if (this.isImageLoadable(id) && allowLoadingCache) {
            image = this.parseImage(localStorage.getItem(this.getImageLocalStorageKey(id)))
        }
        if (image) return image
        if (JSONUrl !== "") {
            image = this.parseImageByJSONURL(JSONUrl)
            this.saveImage(image)
        } else if (imageTagId !== "") {
            image = this.parseImageByImageTagID(id, imageTagId, dataX, dataY, dataW, dataH, invisibleColors)
            this.saveImage(image)
        } else if (data) {
            image = this.parseRGBAImageData(this.createImage(id, []), dataW, dataH, data, invisibleColors)
            this.saveImage(image)
        } else {
            throw new Error(`CanvasEngine2D can't load image from localStorage (${this.getImageLocalStorageKey(id)}), JSON url (${JSONUrl}), Image tag id (${imageTagId}) or parse from RGBA data (${data}).`)
        }
        return image
    }

    getImageFromImage(id, sourceImage, sx, sy, sw, sh) {
        // console.log(id, sourceImage, sx, sy, sw, sh)
        var image = this.createImage(id, [])
        for (var y = sy; y < sy + sh; y++) {
            var line = []
            for (var x = sx; x < sx + sw; x++) {
                line.push(sourceImage.data[y][x])
            }
            image.data.push(line)
        }
        return image
    }

    /**
     * Gets image localStorage key by image id
     * @param id Image id
     * @returns {string}
     */
    getImageLocalStorageKey(id) {
        return `${this.args.appName}-Image-${id}`
    }

    /**
     * Is image loadable from localStorage by image id
     * @param id Image id
     * @returns {boolean}
     */
    isImageLoadable(id) {
        return this.getLocalStorageKeys().includes(this.getImageLocalStorageKey(id))
    }

    /**
     * Gets all localStorage keys
     * @returns {(string)[]} [<Keys>]
     */
    getLocalStorageKeys() {
        var keys = []
        for (var i = 0; i < localStorage.length; i++) keys.push(localStorage.key(i))
        return keys
    }

    /**
     * Calculates needed scale from parameters below.
     * @param width Current width
     * @param height Current height
     * @param maxWidth Width to fit inside
     * @param maxHeight Height to fit inside
     * @param margin Margin
     * @returns {(number)[]} [<scale>, <newWidth>, <newHeight>]
     */
    calculateScale(width, height, maxWidth, maxHeight, margin) {
        var scaleWidth = (maxWidth - 2 * margin) / width
        var scaleHeight = (maxHeight - 2 * margin) / height
        var scale = (scaleWidth < scaleHeight ? scaleWidth : scaleHeight)
        var newWidth = Math.floor(width * scale)
        var newHeight = Math.floor(height * scale)
        return [scale, newWidth, newHeight]
    }

    /**
     * Draws pixel to <Target image>
     * @param x Pixel X
     * @param y Pixel Y
     * @param color Pixel color
     * @param image Target image
     */
    drawImagePixel(x, y, color, image = this.image) {
        if (!image?.length) return image
        if (x > -1 && x < image[0].length) {
            if (y > -1 && y < image.length) {
                if (color[3] === 255) {
                    image[y][x] = color
                } else if (color[3] === 0) {

                } else {
                    // When using negative alpha value, the image gets lighter, which is cursed, but can be used for some effects
                    var oldPixel = this.readImagePixel(x, y)
                    var newPixelWeight = color[3] / 255 // With 128 / 255 it should be around .5
                    var oldPixelWeight = 1 - newPixelWeight
                    var r = Math.floor(oldPixel[0] * oldPixelWeight + color[0] * newPixelWeight)
                    var g = Math.floor(oldPixel[1] * oldPixelWeight + color[1] * newPixelWeight)
                    var b = Math.floor(oldPixel[2] * oldPixelWeight + color[2] * newPixelWeight)
                    image[y][x] = [r, g, b, 255]
                    // console.warn("CanvasEngine2D doesn't support rgba color a value that isn't 0 or 255. (given value " + color[3] + ", pixel " + JSON.stringify(color) + ")")
                    /*// https://gist.github.com/JordanDelcros/518396da1c13f75ee057 edited, cursed
                    var base = this.readImagePixel(x, y).slice();
                    base[3] = base[3] / 256
                    var added = color.slice();
                    added[3] = added[3] / 256

                    var mix = [];
                    mix[3] = 1 - (1 - added[3]) * (1 - base[3]); // alpha
                    mix[0] = Math.floor((added[0] * added[3] / mix[3]) + (base[0] * base[3] * (1 - added[3]) / mix[3])); // red
                    mix[1] = Math.floor((added[1] * added[3] / mix[3]) + (base[1] * base[3] * (1 - added[3]) / mix[3])); // green
                    mix[2] = Math.floor((added[2] * added[3] / mix[3]) + (base[2] * base[3] * (1 - added[3]) / mix[3])); // blue
                    image[y][x] = mix*/
                }
            }
        }
        return image
    }

    /**
     * Reads pixel from <Source image>
     * @param x Pixel X
     * @param y Pixel Y
     * @param from Source image
     */
    readImagePixel(x, y, from = this.image) {
        if (x > -1 && x < this.args.imageW) {
            if (y > -1 && y < this.args.imageH) {
                if (from[y] && from[y][x]) return from[y][x]
            }
        }
        return [-1, -1, -1, -1]
    }

    /**
     * Draws image to engine this.image
     * @param dx Image destination X
     * @param dy Image destination Y
     * @param image Image
     * @param dstImage Destination image
     */
    drawImageImage(dx, dy, image, dstImage = this.image) {
        var y, line
        switch (this.args.methods.drawImageImage) {
            case CanvasEngine2DVariables.METHODS.DRAWIMAGEIMAGE.FIRST:
                for (y = 0; y < image.length; y++) {
                    line = image[y]
                    for (var x = 0; x < line.length; x++) {
                        if (line[x][3] !== 0) {
                            dstImage = this.drawImagePixel(dx + x, dy + y, line[x], dstImage)
                        }
                    }
                }
                break
            case CanvasEngine2DVariables.METHODS.DRAWIMAGEIMAGE.SECOND:
                console.warn("CanvasEngine2D draw image image method isn't working for images that contains rgba(r, g, b, 0-254) pixels.")
                for (y = 0; y < image.length; y++) {
                    line = this.image[dy + y]
                    line = [...line.slice(0, dx), ...image[y], ...line.slice(dx + image[0].length + 1)]
                    this.image[dy + y] = line
                }
                break
            default:
                throw new Error("CanvasEngine2D draw image image method doesn't exist.")
        }
        return dstImage
    }

    /**
     * 0-255 -> 00-ff
     * @param c Component
     * @returns {string}
     */
    componentToHex(c) {
        var hex = c.toString(16);
        return hex.length === 1 ? "0" + hex : hex;
    }

    /**
     * Converts RGB to HEX colorspace
     * @param r R
     * @param g G
     * @param b B
     * @returns {string}
     */
    rgbToHex(r, g, b) {
        return "#" + this.componentToHex(r) + this.componentToHex(g) + this.componentToHex(b);
    }

    /**
     * Compares two arrays of numbers or strings
     * @param a Array 1
     * @param b Array 2
     * @returns {boolean} Are same
     */
    compareArrays(a, b) {
        if (a.length !== b.length) return false
        for (var i = 0; i < a.length; i++) {
            if (a[i] !== b[i]) return false
        }
        return true
    }

    /**
     * Renders engine this.image to engine this.args.canvas
     */
    renderImageToCanvas() {
        // this.realCanvas.width = this.args.imageW
        // this.realCanvas.height = this.args.imageH
        this.realCanvas.width = this.args.camera.viewWidth
        this.realCanvas.height = this.args.camera.viewHeight
        // this.ctx.clearRect(0, 0, this.args.imageW, this.args.imageH)
        // var id = this.ctx.getImageData(0, 0, this.args.imageW, this.args.imageH)
        var id = this.ctx.getImageData(0, 0, this.realCanvas.width, this.realCanvas.height)
        var pixels = id.data
        // var changedPixels = []
        var image = this.args.camera.watch(this.image, this.args.backgroundColor)
        var lineIdx, line, off, pix
        for (var y = 0; y < image.length; y++) {
            line = image[y]
            lineIdx = y * id.width
            for (var x = 0; x < line.length; x++) {
                // ** Method 1 **
                // https://plnkr.co/edit/mfNyalsAR2MWkccr?preview
                // 3rd method
                pix = line[x]
                off = (lineIdx + x) << 2;
                pixels[off] = pix[0];
                pixels[off + 1] = pix[1];
                pixels[off + 2] = pix[2];
                pixels[off + 3] = pix[3];

                // ** Method 2 **
                /*var pix = this.readImagePixel(x, y)
                // if (this.renderImageToCanvasNotFirstTime) console.log(this.compareArrays(pix, this.readImagePixel(x, y, this.lastImage)))
                if (!this.compareArrays(pix, this.readImagePixel(x, y, this.lastImage))) {
                    // changedPixels.push([x, y, pix])
                    var [r, g, b, a] = pix
                    var off = (y * id.width + x) * 4;
                    pixels[off] = r;
                    pixels[off + 1] = g;
                    pixels[off + 2] = b;
                    pixels[off + 3] = a;
                }*/
            }
        }
        /*console.log(changedPixels)
        for (var changedPixel of changedPixels) {
            // var [r, g, b, a] = changedPixel[2]
            // var off = (changedPixel[1] * id.width + changedPixel[0]) * 4
            // pixels[off] = r
            // pixels[off + 1] = g
            // pixels[off + 2] = b
            // pixels[off + 3] = a
            this.ctx.fillStyle = this.rgbToHex(...changedPixel[2].slice(0, 3))
            this.ctx.strokeStyle = this.rgbToHex(...changedPixel[2].slice(0, 3))
            this.ctx.fillRect(changedPixel[0], changedPixel[1], 1, 1)
            console.log(changedPixel, this.rgbToHex(...changedPixel[2].slice(0, 3)), this.ctx.fillStyle)
            break
        }*/
        this.ctx.putImageData(id, 0, 0);
        // if (!this.renderImageToCanvasNotFirstTime) {
        //     this.lastImage = []
        //     this.renderImageToCanvasNotFirstTime = true
        // }
    }

    renderResultCanvas() {
        var canvas = this.args.canvas
        var ctx = canvas.getContext("2d")
        // canvas.width = Math.floor(this.args.imageW * this.args.scale)
        // canvas.height = Math.floor(this.args.imageH * this.args.scale)
        canvas.width = Math.floor(this.args.camera.viewWidth * this.args.scale)
        canvas.height = Math.floor(this.args.camera.viewHeight * this.args.scale)
        ctx.imageSmoothingEnabled = false
        ctx.drawImage(this.realCanvas, 0, 0, canvas.width, canvas.height)
    }

    /**
     * Render function
     */
    render() {
        this.time.render.start = Date.now()
        this.time.render.endToStart = this.time.render.start - this.time.render.end
        this.rendersNum++
        if (this.image.length) this.lastImage = this.image
        this.createBlankImage(true)
        var elementsZ = {}, element
        for (element of this.elements.filter(a => a.element.type !== "text")) {
            if (!Object.keys(elementsZ).includes(element.z.toString())) elementsZ[element.z.toString()] = []
            if (element.visible && element.element.checkRender(element, this.args.camera)) elementsZ[element.z.toString()].push(element)
        }
        for (var z of Object.keys(elementsZ).sort((a, b) => parseFloat(a) - parseFloat(b))) {
            for (element of elementsZ[z]) {
                // Draw
                element.element.beforeRender()
                /*switch (element.element.type) {
                    case "image":
                        this.drawImageImage(element.x, element.y, element.element.data)
                        break
                    case "automaticallyAnimatedImage":
                    case "animatedImage":
                        this.drawImageImage(element.x, element.y, element.element.images[element.element.imageIndex].data)
                        break
                    default:
                        console.log("Undefined element type:", element.element.type, element)
                        break
                }*/
                switch (element.element.type) {
                    case "image":
                        if (element.element.data) this.drawImageImage(element.x, element.y, element.element.data)
                        else console.warn("Undefined element data:", element.element.data, element)
                        break
                    default:
                        console.warn("Undefined element type:", element.element.type, element)
                        break
                }
                // Draw end
            }
        }
        this.renderImageToCanvas()
        for (element of this.elements.filter(a => a.element.type === "text")) {
            this.ctx.fillStyle = element.element.color
            this.ctx.fillText(element.element.text, element.x, element.y)
        }
        this.renderResultCanvas()
        this.time.render.end = Date.now()
        this.time.render.total = this.time.render.end - this.time.render.start
        this.renderFPS = 1000 / (this.time.render.total + this.time.render.endToStart)
    }
}
