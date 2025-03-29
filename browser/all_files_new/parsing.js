/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {parse as parseTexts, render as renderTexts} from "./file_types/texts.js";
import {parse as parsePNG, render as renderPNG} from "./file_types/PNG.js";
import {parse as parseMap, render as renderMap} from "./file_types/map.js";
import {parse as parseSprites, render as renderSprites} from "./file_types/sprites.js";
import {parse as parseDemoSprites, render as renderDemoSprites} from "./file_types/demoSprBin.js";
import {parse as parseStages, render as renderStages} from "./file_types/stages.js";
import {parse as parseRaw, render as renderRaw} from "./file_types/raw.js";
import {FileType} from "./files.js";
import {createElement, downloadRawButton} from "./utils.js";

/**
 * @typedef {any} TParsedDataData
 * @typedef {{data: TParsedDataData, container: HTMLElement}} TParsedData
 * @typedef {{
 *      render_scale: number,
 *      sprites_background: uint8_t[],
 *      sprites_animation_origin: "hide"|"origin_pixel"|"origin_cross"|"block",
 *      sprites_animation_origin_background: uint8_t[],
 *      stages_render_background: boolean,
 *      stages_render_player: boolean,
 *      stages_render_foreground: boolean,
 *      stages_render_special: boolean,
 *      stages_render_chest_contents: boolean,
 *      stages_render_unknown: boolean,
 *      stages_render_pot_fan_air: boolean,
 *      parseOtherFile: function(fileName: string): Promise<FileChunk[]|null>
 * }} TParseConfig
 */

export class FileChunk {
    /**
     * The index of the chunk within the file.
     * The value -1 means the file doesn't consist of chunks and thus this "chunk" contains the entire file.
     * @readonly
     * @type {number}
     */
    index
    /**
     * @readonly
     * @type {ArrayBuffer}
     */
    data
    /**
     * @readonly
     * @type {TFileType}
     */
    type
    /**
     * @readonly
     * @type {FileInfo}
     */
    file
    /**
     * @type {Promise<TParsedData|never>|null}
     */
    #parsePromise
    /**
     * @type {TParsedData|null}
     */
    #parsedData
    /**
     * @type {Promise<HTMLElement|never>|null}
     */
    #renderPromise

    /**
     * @param index {number}
     * @param data {ArrayBuffer}
     * @param type {TFileType}
     * @param file {FileInfo}
     */
    constructor(index, data, type, file) {
        this.index = index
        this.data = data
        this.type = type
        this.file = file
        this.#parsePromise = null
        this.#parsedData = null
        this.#renderPromise = null
    }

    /**
     * @return {Promise<TParsedData>}
     */
    async parse() {
        if (this.#parsePromise !== null)
            return this.#parsePromise

        return this.#parsePromise = this.#parseInner()
    }

    /**
     * @return {Promise<TParsedData>}
     */
    async #parseInner() {
        if (this.#parsedData !== null) return this.#parsedData

        /** @type {TParsedData} */
        const parsedData = {data: null, container: null}
        switch (this.type) {
            case FileType.TEXTS:
                parsedData.data = await parseTexts(this);
                break
            case FileType.PNG:
                parsedData.data = await parsePNG(this);
                break
            case FileType.MAP:
                parsedData.data = await parseMap(this);
                break
            case FileType.SPRITES:
                parsedData.data = await parseSprites(this);
                break
            case FileType.DEMO_SPRITES:
                parsedData.data = await parseDemoSprites(this);
                break
            case FileType.STAGES:
                parsedData.data = await parseStages(this);
                break
            case FileType.RAW:
                parsedData.data = await parseRaw(this);
                break
            default:
                console.warn("Unknown file type " + this.type.toString())
                parsedData.data = null
                parsedData.container = createElement("div", "Unknown file type: ".concat(this.type.toString()))
                break
        }

        return this.#parsedData = parsedData
    }

    /**
     * @param config {TParseConfig|null}
     * @return {Promise<HTMLElement>}
     */
    async render(config = null) {
        if (this.#renderPromise !== null)
            return this.#renderPromise

        return this.#renderPromise = this.#renderInner(config)
    }

    /**
     * @param config {TParseConfig|null}
     * @return {Promise<HTMLElement>}
     */
    async #renderInner(config = null) {
        if (!config) config = {
            sprites_background: [0, 0xFF, 0, 0xFF],
            sprites_animation_origin: "hide",
            sprites_animation_origin_background: [0xFF, 0, 0, 0xFF]
        }

        await this.parse()
        /** @type {TParsedData} */
        const parsedData = this.#parsedData
        // FIXME Memory leak: we are not destroying the previous container (it can be referenced by an ongoing animation etc.)
        switch (this.type) {
            case FileType.TEXTS:
                parsedData.container = await renderTexts(this, parsedData.data, config);
                break
            case FileType.PNG:
                parsedData.container = await renderPNG(this, parsedData.data, config);
                break
            case FileType.MAP:
                parsedData.container = await renderMap(this, parsedData.data, config);
                break
            case FileType.SPRITES:
                parsedData.container = await renderSprites(this, parsedData.data, config);
                break
            case FileType.DEMO_SPRITES:
                parsedData.container = await renderDemoSprites(this, parsedData.data, config);
                break
            case FileType.STAGES:
                parsedData.container = await renderStages(this, parsedData.data, config);
                break
            case FileType.RAW:
                parsedData.container = await renderRaw(this, parsedData.data, config);
                break
            default:
                console.warn("Unknown file type " + this.type.toString())
                break
        }

        const fileExtension = new Map([
            [FileType.SPRITES, "sprite"],
            [FileType.MAP, "game"],
            [FileType.STAGES, "aTLMap"], // Tiled Layer Map file
        ]).get(this.type) || "bin"

        return createElement("div", [
            this.index !== -1 && createElement("h1", `Chunk ${this.index + 1}`),
            this.index !== -1 && downloadRawButton(this.data, `chunk${this.index}.${fileExtension}`, "Download chunk contents"),
            this.index !== -1 && createElement("br"),
            parsedData.container,
        ], {"class": "chunk"})
    }
}

/**
 * @param file {FileInfo}
 * @return {Promise<FileChunk[]>}
 */
export async function parseFile(file) {
    await file.loadData()

    if (!file.isChunks)
        return [new FileChunk(-1, file.loadedData, file.fileType, file)]

    const dataView = new DataView(file.loadedData)
    let ptr = 0

    const chunkCount = dataView.getUint8(ptr++)
    const chunkArrayPtr = ptr + chunkCount * 8
    const chunks = []
    for (let i = 0; i < chunkCount; i++) {
        const chunkOffset = dataView.getUint32(ptr, true)
        const chunkPtr = chunkArrayPtr + chunkOffset
        ptr += 4
        const chunkLength = dataView.getUint32(ptr, true)
        ptr += 4

        chunks.push(new FileChunk(i, file.loadedData.slice(chunkPtr, chunkPtr + chunkLength), file.fileType, file))
    }

    return chunks
}
