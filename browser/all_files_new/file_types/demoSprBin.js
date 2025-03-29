/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {BSprite, render as renderSprite} from "./sprites.js"
import {createElement} from "../utils.js";

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const dataView = new DataView(chunk.data)
    let ptr = 0

    const chunkCount = dataView.getUint16(ptr, true)
    ptr += 2
    /** @type {{i: number, demoSpriteID: number, data: ArrayBuffer, sprite: BSprite}[]} */
    const chunks = []
    for (let i = 0; i < chunkCount; i++) {
        const demoSpriteID = dataView.getUint16(ptr, true)
        ptr += 2
        const chunkLength = dataView.getUint32(ptr, true)
        ptr += 4
        const data = dataView.buffer.slice(ptr, ptr + chunkLength)
        ptr += chunkLength

        const sprite = new BSprite()
        sprite.parseSprite(new DataView(data), 0)

        chunks.push({i, demoSpriteID, data, sprite})
    }

    console.log("demoSpr.bin chunks parsed:", chunks)

    return {chunks}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    /** @type {{i: number, demoSpriteID: number, data: ArrayBuffer, sprite: BSprite}[]} */
    const chunks = parsed.chunks

    const chunkDivs = []
    for (const chunk of chunks) {
        chunkDivs.push(createElement("div", [
            createElement("h1", `Demo chunk ${chunk.i + 1} (ID: ${chunk.demoSpriteID})`),
            await renderSprite(null, {sprite: chunk.sprite}, config),
        ], {"class": "demo-chunk"}))
    }

    return createElement("div", chunkDivs)
}
