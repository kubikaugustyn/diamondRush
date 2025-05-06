/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {copyToClipboardButton, createElement} from "../utils.js";

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const textDecoder = new TextDecoder("utf-8", {fatal: true, ignoreBOM: false})

    const dataView = new DataView(chunk.data)
    const offsetLength = dataView.getUint16(0)
    let ptr = 0

    /** @type {string[]} */
    const texts = []
    while (ptr < offsetLength) {
        const textAddress = dataView.getUint16(ptr)
        ptr += 2

        const textLength = dataView.getUint16(textAddress)
        const text = textDecoder.decode(dataView.buffer.slice(textAddress + 2, textAddress + 2 + textLength))
        texts.push(text)
    }

    return {texts}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed,config) {
    /** @type {string[]} */
    const texts = parsed.texts

    const tbody = createElement("tbody", [])
    const container = createElement("table", [
        createElement("thead", [
            createElement("tr", [
                createElement("th", "Text #"),
                createElement("th", "Content"),
                createElement("th", "Copy"),
            ])
        ]),
        tbody
    ])
    for (let i = 0; i < texts.length; i++) {
        const text = texts[i]
        tbody.appendChild(createElement("tr", [
            createElement("td", (i + 1).toString()),
            createElement("td", text),
            createElement("td", [
                copyToClipboardButton(text)
            ]),
        ]))
    }

    return container
}
