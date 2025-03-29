/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {copyToClipboardButton, createElement, createAndLoadImageElement} from "../utils.js";

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const url = URL.createObjectURL(new Blob([chunk.data], {type: "image/png"}))
    return {url}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    /** @type {string} */
    const url = parsed.url
    const image = await createAndLoadImageElement(url)

    return createElement("div", [
        image,
        createElement("br"),
        copyToClipboardButton(url, "Copy image URL to clipboard")
    ])
}
