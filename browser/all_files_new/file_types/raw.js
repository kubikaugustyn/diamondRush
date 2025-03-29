/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {copyToClipboardButton, createElement, downloadRawButton} from "../utils.js";

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const data = chunk.data
    return {data}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    const BLOCK_SIZE = 16, GROUP_SIZE=4
    const textDecoder = new TextDecoder("ascii", {fatal: false, ignoreBOM: true}) // The options are loose on purpose

    /** @type {Uint8Array} */
    const data = new Uint8Array(parsed.data)
    const text = textDecoder.decode(data)

    const blockDivs = []
    for (let blockI = 0; blockI < Math.ceil(data.length / BLOCK_SIZE); blockI++) {
        const startPtr = blockI * BLOCK_SIZE
        blockDivs.push(createElement("div", [
            createElement("pre", new Array(BLOCK_SIZE).fill(null)
                .map((_, i) => startPtr + i >= data.length ? null : data[startPtr + i])
                .map((byte, i) => (byte === null ? "  " : byte.toString(16).padStart(2, "0")).concat((i + 1) % GROUP_SIZE === 0 && i + 1 !== BLOCK_SIZE ? " " : ""))
                .join(" ")
            ),
            createElement("span", null, {"class": "raw-divider"}),
            createElement("pre", Array
                .from(data.slice(startPtr, startPtr + BLOCK_SIZE))
                .map(byte =>
                    byte === 0x0D ?
                        '␍' :
                        byte === 0x0A ?
                            '␊' :
                            textDecoder.decode(new Uint8Array([byte]))
                )
                .join(" ")
            )
        ], {"class": "raw-line"}))
    }

    return createElement("div", [
        copyToClipboardButton(text, "Copy as text to clipboard"),
        createElement("br"),
        downloadRawButton(data, "chunk.bin", "Download the binary data"),
        createElement("br"),
        createElement("p",`Byte length: ${data.length}, right column text encoding: ASCII`),
        ...blockDivs
    ])
}
