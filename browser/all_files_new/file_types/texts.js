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
    let ptr = 0

    const textsCount = dataView.getUint16(ptr) >> 1

    /** @type {string[]} */
    const texts = []
    while (texts.length < textsCount && ptr < dataView.byteLength) {
        const textAddress = dataView.getUint16(ptr)
        ptr += 2

        const textLength = dataView.getUint16(textAddress)

        // The last text "0" isn't for saying where the end is, but rather it is an enum for the alignment of the state title - "0" -> left, "1" -> right
        // if (textLength === 1 && dataView.getUint8(textAddress + 2) === 0x30)
        //     break // The last text is "0"

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
export async function render(chunk, parsed, config) {
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
