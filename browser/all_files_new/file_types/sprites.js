/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {toggleButton, createElement, renderCanvasEngine2DImage} from "../utils.js";

/**
 * @typedef {number} int8_t
 * @typedef {number} uint8_t
 * @typedef {number} uint16_t
 * @typedef {number} uint32_t
 * @typedef {uint32_t} RGBAColor The color is in the 0xAABBGGRR format that CanvasEngine2D uses
 */

// https://github.com/SmithGoll/dia_data/blob/main/AuroraGT/bsprite_format.txt
export class BSprite {
    static MAGIC = 0xDF03 // BSPRITE_v3

    static Module = class Module {
        /** @type {uint8_t} */
        width
        /** @type {uint8_t} */
        height
        /** @type {CanvasEngine2DImageData[]|null} */
        #parsedData

        /**
         * @param width {uint8_t}
         * @param height {uint8_t}
         */
        constructor(width, height) {
            this.width = width
            this.height = height
            this.#parsedData = null
        }

        /**
         * @param val {CanvasEngine2DImageData[]}
         */
        _setParsedData(val) {
            if (val === null) throw new Error("No data provided")
            if (!(val instanceof Array)) throw new Error("Data must be an array")
            if (val.find(image => !(image instanceof CanvasEngine2DImageData))) throw new Error("Invalid data provided")
            this.#parsedData = val
        }

        /**
         * @param paletteI {number}
         * @return {CanvasEngine2DImageData}
         */
        getParsedData(paletteI) {
            if (this.#parsedData === null) throw new Error("No data found")
            return this.#parsedData[paletteI]
        }
    }
    static FrameModule = class FrameModule {
        /** @type {uint8_t} */
        moduleIndex
        /** @type {int8_t} */
        offsetX
        /** @type {int8_t} */
        offsetY
        /**
         * The flags define the transformation of the FrameModule.
         * 0bxxxxxxYX
         * Where if the Y flag is set, the image is flipped horizontally.
         * Where if the X flag is set, the image is flipped vertically.
         * @type {uint8_t}
         */
        flags

        /**
         * @param moduleIndex {uint8_t}
         * @param offsetX {uint8_t}
         * @param offsetY {uint8_t}
         * @param flags {uint8_t}
         */
        constructor(moduleIndex, offsetX, offsetY, flags) {
            this.moduleIndex = moduleIndex
            this.offsetX = offsetX
            this.offsetY = offsetY
            this.flags = flags
        }
    }
    static Frame = class Frame {
        /** @type {uint8_t} */
        frameModuleCount
        /** @type {uint16_t} */
        firstFrameModuleIndex
        /** @type {{x: uint8_t, y: uint8_t, w: uint8_t, h: uint8_t}} */
        bbox
        /** @type {CanvasEngine2DImageData[]|null} */
        #parsedData

        /**
         * @param frameModuleCount {uint8_t}
         * @param firstFrameModuleIndex {uint16_t}
         * @param bbox {{x: uint8_t, y: uint8_t, w: uint8_t, h: uint8_t}}
         */
        constructor(frameModuleCount, firstFrameModuleIndex, bbox) {
            this.frameModuleCount = frameModuleCount
            this.firstFrameModuleIndex = firstFrameModuleIndex
            this.bbox = bbox
            this.#parsedData = null
        }

        /**
         * @param val {CanvasEngine2DImageData[]}
         */
        _setParsedData(val) {
            if (val === null) throw new Error("No data provided")
            if (!(val instanceof Array)) throw new Error("Data must be an array")
            if (val.find(image => !(image instanceof CanvasEngine2DImageData))) throw new Error("Invalid data provided")
            this.#parsedData = val
        }

        /**
         * @param paletteI {number}
         * @return {CanvasEngine2DImageData}
         */
        getParsedData(paletteI) {
            if (this.#parsedData === null) throw new Error("No data found")
            return this.#parsedData[paletteI]
        }
    }
    static AnimationFrame = class AnimationFrame {
        /** @type {uint8_t} */
        frameIndex
        /** @type {uint8_t} */
        time
        /** @type {int8_t} */
        offsetX
        /** @type {int8_t} */
        offsetY
        /** @type {uint8_t} */
        flags

        /**
         * @param frameIndex {uint8_t}
         * @param time {uint8_t}
         * @param offsetX {int8_t}
         * @param offsetY {int8_t}
         * @param flags {uint8_t}
         */
        constructor(frameIndex, time, offsetX, offsetY, flags) {
            this.frameIndex = frameIndex
            this.time = time
            this.offsetX = offsetX
            this.offsetY = offsetY
            this.flags = flags
        }
    }
    static Animation = class Animation {
        /** @type {uint16_t} */
        animationFrameCount
        /** @type {uint16_t} */
        firstAnimationFrameIndex

        /**
         * @param animationFrameCount {uint16_t}
         * @param firstAnimationFrameIndex {uint16_t}
         */
        constructor(animationFrameCount, firstAnimationFrameIndex) {
            this.animationFrameCount = animationFrameCount
            this.firstAnimationFrameIndex = firstAnimationFrameIndex
        }
    }

    /** @type {uint32_t} */
    flags

    // Modules
    /** @type {BSprite.Module[]} */
    modules

    // Frames
    /** @type {BSprite.FrameModule[]} */
    frameModules
    /** @type {BSprite.Frame[]} */
    frames

    // Animations
    /** @type {BSprite.AnimationFrame[]} */
    animationFrames
    /** @type {BSprite.Animation[]} */
    animations

    // Modules image data
    /** @type {uint16_t} */
    pixelFormat
    /** @type {uint8_t} */
    paletteCount
    /** @type {uint8_t} */
    colorsPerPalette
    /** @type {RGBAColor[][]} */
    palettes
    /** @type {uint16_t} */
    dataFormat
    /** @type {ArrayBuffer[]} */
    moduleData

    constructor() {
        this.flags = 0
        this.modules = null
        this.frameModules = null
        this.frames = null
        this.animationFrames = null
        this.animations = null
        this.pixelFormat = 0
        this.paletteCount = 0
        this.colorsPerPalette = 0
        this.palettes = null
        this.dataFormat = 0
        this.moduleData = null
    }

    /**
     * Parses the binary sprite and stores the information inside this class.
     * @param dataView {DataView} The data view of the input buffer.
     * @param ptr {number} The pointer to the address to start reading from.
     * @returns {number} The modified pointer.
     */
    parseSprite(dataView, ptr) {
        // Header
        const magic = dataView.getUint16(ptr, false)
        ptr += 2
        if (magic !== BSprite.MAGIC)
            throw new Error(`File magic mismatch, got ${magic.toString(16)}, but expected ${BSprite.MAGIC.toString(16)}`)
        this.flags = dataView.getUint32(ptr, false)
        ptr += 4

        // Modules
        const moduleCount = dataView.getUint16(ptr, true)
        ptr += 2
        this.modules = new Array(moduleCount)
        for (let i = 0; i < moduleCount; i++) {
            this.modules[i] = new BSprite.Module(dataView.getUint8(ptr++), dataView.getUint8(ptr++))
        }

        // Frames
        const frameModuleCount = dataView.getUint16(ptr, true)
        ptr += 2
        this.frameModules = new Array(frameModuleCount)
        for (let i = 0; i < frameModuleCount; i++) {
            this.frameModules[i] = new BSprite.FrameModule(dataView.getUint8(ptr++), dataView.getInt8(ptr++), dataView.getInt8(ptr++), dataView.getUint8(ptr++))
        }

        const frameCount = dataView.getUint16(ptr, true)
        ptr += 2
        this.frames = new Array(frameCount)
        const frameFModuleCounts = new Array(frameCount),
            frameFirstModuleIndices = new Array(frameCount)
        for (let i = 0; i < frameCount; i++) {
            frameFModuleCounts[i] = dataView.getUint16(ptr, true)
            ptr += 2

            frameFirstModuleIndices[i] = dataView.getUint16(ptr, true)
            ptr += 2
        }
        for (let i = 0; i < frameCount; i++) {
            const bbox = {
                x: dataView.getInt8(ptr++),
                y: dataView.getInt8(ptr++),
                w: dataView.getUint8(ptr++),
                h: dataView.getUint8(ptr++)
            }
            this.frames[i] = new BSprite.Frame(frameFModuleCounts[i], frameFirstModuleIndices[i], bbox)
        }

        // Animations
        const animationFramesCount = dataView.getUint16(ptr, true)
        ptr += 2
        this.animationFrames = new Array(animationFramesCount)
        for (let i = 0; i < animationFramesCount; i++) {
            this.animationFrames[i] = new BSprite.AnimationFrame(dataView.getUint8(ptr++), dataView.getUint8(ptr++), dataView.getInt8(ptr++), dataView.getInt8(ptr++), dataView.getUint8(ptr++))
        }

        const animationCount = dataView.getUint16(ptr, true)
        ptr += 2
        this.animations = new Array(animationCount)
        for (let i = 0; i < animationCount; i++) {
            const animationFrameCount = dataView.getUint16(ptr, true)
            ptr += 2
            const firstAnimationFrameIndex = dataView.getUint16(ptr, true)
            ptr += 2
            this.animations[i] = new BSprite.Animation(animationFrameCount, firstAnimationFrameIndex)
        }

        // Modules image data
        this.pixelFormat = dataView.getUint16(ptr, false) // I guess it's little endian, but I like the 0xARGB nibble order
        ptr += 2
        this.paletteCount = dataView.getUint8(ptr++)
        this.colorsPerPalette = dataView.getUint8(ptr++)
        ptr = this.#parsePalettes(dataView, ptr)

        this.dataFormat = dataView.getUint16(ptr, true)
        ptr += 2
        this.moduleData = new Array(moduleCount)
        for (let i = 0; i < moduleCount; i++) {
            const size = dataView.getUint16(ptr, true)
            ptr += 2
            this.moduleData[i] = dataView.buffer.slice(ptr, ptr + size)
            ptr += size

            // Parse/render the module
            const data = new Array(this.paletteCount).fill(null).map((_, paletteI) =>
                this.#parseModuleData(paletteI, i)
            )
            this.modules[i]._setParsedData(data)
        }

        // Render the frames
        for (let i = 0; i < this.frames.length; i++) {
            const data = new Array(this.paletteCount).fill(null).map((_, paletteI) =>
                this.#renderFrame(paletteI, i)
            )
            this.frames[i]._setParsedData(data)
        }

        return ptr
    }

    /**
     * Parses the binary sprite's palettes and stores the information inside this class.
     * @param dataView {DataView} The data view of the input buffer.
     * @param ptr {number} The pointer to the address to start reading from.
     * @returns {number} The modified pointer.
     */
    #parsePalettes(dataView, ptr) {
        this.palettes = new Array(this.paletteCount)
        for (let i = 0; i < this.paletteCount; i++)
            this.palettes[i] = new Array(this.colorsPerPalette)

        /** @type {uint8_t} */
        let R, G, B, A
        for (let paletteI = 0; paletteI < this.paletteCount; paletteI++) {
            for (let colorI = 0; colorI < this.colorsPerPalette; colorI++) {
                // 0xARGB - every nibble means the number of bits (0-8) per channel
                // console.log("Pixel format:", this.pixelFormat.toString(16))
                // TODO Are the channel bytes parsed all in the correct order?
                switch (this.pixelFormat) {
                    case 0x8888:
                        // All channels are 8-bit
                        B = dataView.getUint8(ptr++)
                        G = dataView.getUint8(ptr++)
                        R = dataView.getUint8(ptr++)
                        A = dataView.getUint8(ptr++)
                        break
                    case 0x0888:
                        // All channels are 8-bit, but the A (alpha) channel is not present
                        A = 0xFF
                        R = dataView.getUint8(ptr++)
                        G = dataView.getUint8(ptr++)
                        B = dataView.getUint8(ptr++)
                        break
                    case 0x4444: {
                        // All channels are 4-bit, where the 4-bit number is duplicated twice to get the resulting 8 bits
                        const packed = dataView.getUint16(ptr, false)
                        ptr += 2
                        A = (packed & 0xF000) >> 16
                        A |= A >> 8
                        R = (packed & 0x0F00) >> 8
                        R |= R >> 8
                        G = (packed & 0x00F0) >> 0
                        G |= G >> 8
                        B = (packed & 0x000F) << 8
                        B |= B >> 8
                        break
                    }
                    case 0x1555: {
                        // The R, G and B channels are 5-bit, and the A channel is 1-bit
                        // For the color channels the 5 bits are followed by 3 zeros to get the resulting 8 bits
                        const packed = dataView.getUint16(ptr, true)
                        ptr += 2
                        A = (packed & 0x8000) ? 0xFF : 0x00
                        R = (packed & 0x7C00) >> 7
                        G = (packed & 0x03E0) >> 2
                        B = (packed & 0x001F) << 3
                        break
                    }
                    case 0x0565:
                        throw new Error("Pixel format not implemented: 0x0565")
                    // break
                    case 0x0332:
                        throw new Error("Pixel format not implemented: 0x0332")
                    // break
                    default:
                        throw new Error(`Unknown pixel format ${this.pixelFormat.toString(16)}`)
                }
                this.palettes[paletteI][colorI] = CanvasEngine2DVariables.COLORS.ToNumber([R, G, B, A])
            }
        }

        return ptr
    }

    /**
     * Parses the binary sprite's module data and returns it.
     * @param paletteI {number}
     * @param moduleI {number}
     * @returns {CanvasEngine2DImageData}
     */
    #parseModuleData(paletteI, moduleI) {
        const module = this.modules[moduleI]
        const palette = this.palettes[paletteI]
        const pixelData = new Uint32Array(module.width * module.height)
        const packedData = new DataView(this.moduleData[moduleI])

        switch (this.dataFormat) {
            // I16 according to bsprite_format.txt - "maximum  16 colors (indexed), packed data 2 pixels / 1 byte  (4 bits/pixel)"
            case 0x1600:
                for (let j = 0; j < pixelData.length; j += 2) {
                    const packed = packedData.getUint8(j >> 1)
                    const index1 = (packed & 0xF0) >> 4
                    const index2 = (packed & 0x0F)

                    if (index1 >= this.colorsPerPalette || index2 >= this.colorsPerPalette)
                        throw new Error("Pixel index is too big for this color palette")

                    pixelData[j] = palette[index1]
                    pixelData[j + 1] = palette[index2]
                }
                break
            // I256RLE? according to bsprite_format.txt - "maximum 256 colors (indexed), compressed data (RLE)"
            case 0x27F1: {
                let j = 0, packedPtr = 0
                while (j < pixelData.length) {
                    let byte1 = packedData.getUint8(packedPtr++)
                    if (byte1 > 0x7F) {
                        byte1 -= 0x80
                        const byte2 = packedData.getUint8(packedPtr++)

                        if (byte2 >= this.colorsPerPalette || byte2 >= this.colorsPerPalette)
                            throw new Error("Pixel index is too big for this color palette")

                        while (byte1-- > 0) pixelData[j++] = palette[byte2]
                    }
                    else {
                        if (byte1 >= this.colorsPerPalette || byte1 >= this.colorsPerPalette)
                            throw new Error("Pixel index is too big for this color palette")

                        pixelData[j++] = palette[byte1]
                    }
                }
                break
            }
            // I4 - "indexed, max 4 colors, 4 pixels / 1 byte, 2 bits/pixel"
            case 0x0400:
                for (let j = 0; j < pixelData.length;) {
                    const packed = packedData.getUint8(j >> 2)
                    const index1 = (packed >> 6) & 0b11
                    const index2 = (packed >> 4) & 0b11
                    const index3 = (packed >> 2) & 0b11
                    const index4 = (packed >> 0) & 0b11

                    if (index1 >= this.colorsPerPalette || index2 >= this.colorsPerPalette || index3 >= this.colorsPerPalette || index4 >= this.colorsPerPalette)
                        throw new Error("Pixel index is too big for this color palette")

                    pixelData[j++] = palette[index1]
                    pixelData[j++] = palette[index2]
                    pixelData[j++] = palette[index3]
                    pixelData[j++] = palette[index4]
                }
                break
            default:
                throw new Error(`Unknown data format ${this.dataFormat.toString(16)}`)
        }

        return new CanvasEngine2DImageData(module.width, module.height, pixelData)
    }

    /**
     * Renders the binary sprite's frame module and returns it.
     * @param paletteI {number}
     * @param frameI {number}
     * @returns {CanvasEngine2DImageData}
     */
    #renderFrame(paletteI, frameI) {
        const frame = this.frames[frameI]
        if (frame.frameModuleCount === 0) // Nothing is inside
            return new CanvasEngine2DImageData(1, 1, new Uint32Array(1).fill(CanvasEngine2DVariables.COLORS.TRANSPARENT_NUM))

        const width = frame.bbox.w,
            height = frame.bbox.h
        if (width <= 0 || height <= 0) {
            console.error("Frame has a 0 dimension:", frame)
            return new CanvasEngine2DImageData(5, 5, new Uint32Array(25).fill(CanvasEngine2DVariables.COLORS.RED_NUM))
        }
        const data = new CanvasEngine2DImageData(width, height, new Uint32Array(width * height))

        // console.log(this.frameModules.slice(frame.firstFrameModuleIndex, frame.firstFrameModuleIndex + frame.frameModuleCount))
        for (const frameModule of this.frameModules.slice(frame.firstFrameModuleIndex, frame.firstFrameModuleIndex + frame.frameModuleCount)) {
            const module = this.modules[frameModule.moduleIndex]
            const moduleData = module.getParsedData(paletteI).clone()

            if (frameModule.flags & 2) { // Flip horizontally
                const original = moduleData.clone()
                moduleData.clear(CanvasEngine2DVariables.COLORS.TRANSPARENT_NUM)
                for (let y = 0; y < moduleData.height; y++) {
                    moduleData.setPixels(0, y, original.getPixels(0, moduleData.height - 1 - y, moduleData.width))
                }
            }
            if (frameModule.flags & 1) { // Flip vertically
                const original = moduleData.clone()
                moduleData.clear(CanvasEngine2DVariables.COLORS.TRANSPARENT_NUM)
                for (let x = 0; x < moduleData.width; x++) {
                    for (let y = 0; y < moduleData.height; y++) {
                        moduleData.forcePixelAtPos(x, y, original.getPixel(moduleData.width - 1 - x, y))
                    }
                }
            }

            const targetX = frameModule.offsetX - frame.bbox.x,
                targetY = frameModule.offsetY - frame.bbox.y

            // Draw the small chunk to the bigger image
            for (let y = 0; y < moduleData.height; y++) {
                if (y + targetY < 0 || y + targetY >= data.height) continue
                for (let x = 0; x < moduleData.width; x++) {
                    if (x + targetX < 0 || x + targetX >= data.width) continue
                    data.setPixel(x + targetX, y + targetY, moduleData.getPixel(x, y))
                }
            }
        }

        return data
    }
}

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const sprite = new BSprite()
    sprite.parseSprite(new DataView(chunk.data), 0)
    console.log("Parsed sprite:", sprite)

    return {sprite}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    const renderImage = (image, scale = config.render_scale) => renderCanvasEngine2DImage(image.data.width, image.data.height, engine => {
        engine.addElement(image, 0, 0, 0)
    }, scale, config.sprites_background)
    const renderImageData = (data, scale = config.render_scale) => renderCanvasEngine2DImage(data.width, data.height, engine => {
        engine.addElement(engine.createImage("image", data), 0, 0, 0)
    }, scale, config.sprites_background)
    /**
     * @param sprite {BSprite}
     * @param animationI {number}
     * @param paletteI {number}
     * @param scale {number}
     * @return {HTMLCanvasElement}
     */
    const renderSpriteAnimation = (sprite, animationI, paletteI, scale = 2) => {
        let frameI = 0
        const animation = sprite.animations[animationI]
        const animationFrames = sprite.animationFrames.slice(animation.firstAnimationFrameIndex, animation.firstAnimationFrameIndex + animation.animationFrameCount)
        const frames = sprite.frames

        const bbox = {x: 0, y: 0, w: 1, h: 1}
        animationFrames.forEach(animationFrame => {
            if (animationFrame.frameIndex >= frames.length) return
            const frame = frames[animationFrame.frameIndex]
            const x = animationFrame.offsetX + frame.bbox.x,
                y = animationFrame.offsetY + frame.bbox.y

            if (x < bbox.x) bbox.x = x
            if (y < bbox.y) bbox.y = y
        })
        animationFrames.forEach(animationFrame => {
            if (animationFrame.frameIndex >= frames.length) return
            const frame = frames[animationFrame.frameIndex]
            const x = animationFrame.offsetX + frame.bbox.x,
                y = animationFrame.offsetY + frame.bbox.y
            const w = frame.bbox.w - bbox.x + x,
                h = frame.bbox.h - bbox.y + y

            if (w > bbox.w) bbox.w = w
            if (h > bbox.h) bbox.h = h
        })
        const offsetX = -bbox.x,
            offsetY = -bbox.y,
            width = bbox.w,
            height = bbox.h

        const canvas = document.createElement("canvas")
        const engine = new CanvasEngine2D({
            canvas: canvas,
            appName: "diamondRush-browser-all_files_new-utils-renderCanvasEngine2DImage",
            imageW: width,
            imageH: height,
            backgroundColor: config.sprites_background,
            scale
        })

        const originColor = CanvasEngine2DVariables.COLORS.ToNumber(config.sprites_animation_origin_background)
        /** @type {CanvasEngine2DImageData|null} */
        let originImageData = null
        switch (config.sprites_animation_origin) {
            case "hide":
                break
            case "origin_pixel":
                originImageData = new CanvasEngine2DImageData(1, 1, new Uint32Array(1).fill(originColor))
                break
            case "origin_cross":
                originImageData = new CanvasEngine2DImageData(3, 3, new Uint32Array(9).fill(CanvasEngine2DVariables.COLORS.TRANSPARENT_NUM))
                originImageData.setPixel(1, 0, originColor)
                originImageData.setPixel(0, 1, originColor)
                originImageData.setPixel(1, 1, originColor)
                originImageData.setPixel(2, 1, originColor)
                originImageData.setPixel(1, 2, originColor)
                break
            case "block":
                originImageData = new CanvasEngine2DImageData(24, 24, new Uint32Array(24 * 24).fill(originColor))
                break
            default:
                throw new Error(`Unknown sprites animation origin: '${config.sprites_animation_origin}'`)
        }
        if (originImageData !== null) {
            const oneOrZero = (config.sprites_animation_origin === "origin_cross" ? 1 : 0)
            engine.addElement(engine.createImage("origin", originImageData), offsetX - oneOrZero, offsetY - oneOrZero, 0)
        }

        /** @type {(CanvasEngine2DElement|{visible: boolean})[]} */
        const frameElements = []
        /** @type {number[]} */
        const frameTimesMs = []
        for (const animationFrame of animationFrames) {
            const frame = frames[animationFrame.frameIndex]

            if (frame) {
                const data = frame.getParsedData(paletteI)
                const element = engine.addElement(
                    engine.createImage("frame", data),
                    animationFrame.offsetX + frame.bbox.x + offsetX,
                    animationFrame.offsetY + frame.bbox.y + offsetY,
                    1
                )
                element.visible = false
                frameElements.push(element)
            }
            else frameElements.push({visible: false}) // Basically means there is no frame

            frameTimesMs.push(animationFrame.time * (1000 / 20)) // animationFrame.time is in frames of the 20FPS game
        }

        function render() {
            frameElements[frameI].visible = false
            frameI++
            frameI %= animationFrames.length
            frameElements[frameI].visible = true
            engine.render()

            setTimeout(render, frameTimesMs[frameI])
        }

        render()

        return canvas
    }

    /** @type {BSprite} */
    const sprite = parsed.sprite

    const moduleDivs = []
    for (let moduleI = 0; moduleI < sprite.modules.length; moduleI++) {
        moduleDivs.push(createElement("div", [
            createElement("h3", `Module ${moduleI}`),
            ...(new Array(sprite.paletteCount).fill(null).map((_, paletteI) =>
                renderImageData(sprite.modules[moduleI].getParsedData(paletteI))
            ))
        ], {"class": "sprite-module"}))
    }
    const moduleDivsContainer = createElement("div", moduleDivs, {"class": "sprite-modules"})

    const paletteImages = []
    for (let paletteI = 0; paletteI < sprite.paletteCount; paletteI++) {
        const data = new CanvasEngine2DImageData(sprite.colorsPerPalette, 1, new Uint32Array(sprite.colorsPerPalette))
        for (let colorI = 0; colorI < sprite.colorsPerPalette; colorI++) {
            data.setPixel(colorI, 0, sprite.palettes[paletteI][colorI])
        }
        const palette = renderImageData(data, 25);
        palette.classList.add("sprite-palette")
        paletteImages.push(palette)
    }

    const frameModuleDivs = []
    for (let frameModuleI = 0; frameModuleI < sprite.frameModules.length; frameModuleI++) {
        const frameModule = sprite.frameModules[frameModuleI]
        frameModuleDivs.push(createElement("div", [
            createElement("h3", `Frame module ${frameModuleI}`),
            new Text(`Module: ${frameModule.moduleIndex}`),
            createElement("br"),
            new Text(`Offset X: ${frameModule.offsetX}, Y: ${frameModule.offsetY}`),
            createElement("br"),
            new Text(`Flags: ${frameModule.flags} (flip vertically: ${!!(frameModule.flags & 1)}, flip horizontally: ${!!(frameModule.flags & 2)})`),
        ], {"class": "sprite-frame-module"}))
    }
    const frameModuleDivsContainer = createElement("div", frameModuleDivs, {"class": "sprite-frame-modules"})

    const frameDivs = []
    for (let frameI = 0; frameI < sprite.frames.length; frameI++) {
        frameDivs.push(createElement("div", [
            createElement("h3", `Frame ${frameI}`),
            ...(sprite.frames[frameI].frameModuleCount ?
                    (new Array(sprite.paletteCount).fill(null).map((_, paletteI) =>
                        renderImageData(sprite.frames[frameI].getParsedData(paletteI))
                    )) :
                    [new Text("No frame modules inside this frame")]
            )
        ], {"class": "sprite-frame"}))
    }
    const frameDivsContainer = createElement("div", frameDivs, {"class": "sprite-frames"})

    const animationFrameDivsContainer = createElement("div", "You don't need to see that (e.g., I'm lazy). Look into the console if you want.", {"class": "sprite-animation-frames"})

    const animationDivs = []
    for (let animationI = 0; animationI < sprite.animations.length; animationI++) {
        animationDivs.push(createElement("div", [
            createElement("h3", `Animation ${animationI}`),
            ...(new Array(sprite.paletteCount).fill(null).map((_, paletteI) =>
                renderSpriteAnimation(sprite, animationI, paletteI, config.render_scale)
            ))
        ], {"class": "sprite-animation"}))
    }
    const animationDivsContainer = createElement("div", animationDivs, {"class": "sprite-animations"})

    return createElement("div", [
        new Text(`Modules: ${sprite.modules.length}, palettes: ${sprite.paletteCount}, frame modules: ${sprite.frameModules.length}, frames: ${sprite.frames.length}, animation frames: ${sprite.animationFrames.length}, animations: ${sprite.animations.length}`),
        createElement("h2", `Palettes`),
        createElement("div", paletteImages.map(img => [img, document.createElement("br")]).flat(1), {"class": "sprite-palettes"}),
        createElement("h2", `Modules`),
        toggleButton(moduleDivsContainer, frameDivs.length === 0),
        moduleDivsContainer,
        createElement("h2", `Frame modules`),
        toggleButton(frameModuleDivsContainer, false),
        frameModuleDivsContainer,
        createElement("h2", `Frames`),
        toggleButton(frameDivsContainer, animationDivs.length === 0),
        frameDivsContainer,
        createElement("h2", `Animation frames`),
        toggleButton(animationFrameDivsContainer, false),
        animationFrameDivsContainer,
        createElement("h2", `Animations`),
        toggleButton(animationDivsContainer, true),
        animationDivsContainer,
    ], {"class": "sprite"})
}
