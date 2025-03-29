/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

/**
 * Enum for suggested file types.
 * @readonly
 * @enum {symbol}
 * @typedef {symbol} TFileType
 */
export const FileType = Object.freeze({
    SPRITES: Symbol("SPRITES"),
    RAW: Symbol("RAW"),
    MAP: Symbol("MAP"),
    STAGES: Symbol("STAGES"),
    TEXTS: Symbol("TEXTS"),
    MIDI: Symbol("MIDI"),
    DEMO_SPRITES: Symbol("DEMO_SPRITES"),
    PNG: Symbol("PNG"),
})

export class FileInfo {
    /**
     * @private
     * @type {number}
     */
    static #ID_COUNTER = 0

    /**
     * @readonly
     * @type {string}
     */
    fileName
    /**
     * @readonly
     * @type {number}
     */
    id
    /**
     * @readonly
     * @type {boolean}
     */
    isDefaultFile
    /**
     * @readonly
     * @type {TFileType}
     */
    autoFileType
    /**
     * @type {TFileType}
     */
    fileType
    /**
     * @readonly
     * @type {boolean}
     */
    autoIsChunks
    /**
     * @type {boolean}
     */
    isChunks
    /** @type {ArrayBuffer|null} */
    loadedData
    /** @type {Promise<void|never>|null} */
    #dataLoadingPromise

    /**
     * @param fileName {string}
     * @param autoFileType {TFileType}
     * @param autoIsChunks {boolean}
     * @param isDefaultFile {boolean}
     * @param loadedData {ArrayBuffer|null}
     */
    constructor(fileName, autoFileType, autoIsChunks, isDefaultFile = true, loadedData = null) {
        this.fileName = fileName
        this.id = FileInfo.#ID_COUNTER++
        this.isChunks = this.autoIsChunks = autoIsChunks
        this.fileType = this.autoFileType = autoFileType
        this.isDefaultFile = isDefaultFile
        this.loadedData = loadedData
        this.#dataLoadingPromise = null
    }

    /**
     * Loads the data of the file from the original diamond_EUD.jar folder on the server unless the data is already loaded.
     * @return {Promise<void|never>}
     */
    async loadData() {
        if (this.#dataLoadingPromise !== null) return this.#dataLoadingPromise
        this.#dataLoadingPromise = this.#loadDataInner()
        await this.#dataLoadingPromise
    }

    /**
     * Loads the data of the file from the original diamond_EUD.jar folder on the server unless the data is already loaded.
     * @return {Promise<void|never>}
     */
    async #loadDataInner() {
        if (this.loadedData !== null) return

        const response = await fetch(`../diamond_EUD.jar/${this.fileName}`, {
            mode: "same-origin",
            cache: "force-cache",
            redirect: "error"
        })
        if (response.status !== 200) throw new Error(`Could not load the file '${this.fileName}' (status ${response.status})`)
        this.loadedData = await response.arrayBuffer()
    }
}

/**
 * Note that this list may be pushed into at runtime (when the user uploads their own file)
 * @type {FileInfo[]}
 */
export const files = [
    // new FileInfo("0-edited.f", FileType.SPRITES, true),
    new FileInfo("0.f", FileType.SPRITES, true),
    new FileInfo("1.f", FileType.SPRITES, true),
    new FileInfo("2.f", FileType.SPRITES, true),
    new FileInfo("b0.f", FileType.SPRITES, true),
    new FileInfo("b1.f", FileType.SPRITES, true),
    new FileInfo("cm.f", FileType.SPRITES, true),
    new FileInfo("cr.f", FileType.RAW, true),
    new FileInfo("demo.f", FileType.RAW, true),
    new FileInfo("demoSpr.bin", FileType.DEMO_SPRITES, false),
    new FileInfo("demoui.f", FileType.SPRITES, true),
    new FileInfo("gen0.f", FileType.SPRITES, true),
    new FileInfo("gen1.f", FileType.SPRITES, true),
    new FileInfo("gen2.f", FileType.SPRITES, true),
    new FileInfo("gen3.f", FileType.SPRITES, true),
    new FileInfo("gen4.f", FileType.SPRITES, true),
    new FileInfo("icon.png", FileType.PNG, false),
    new FileInfo("lang.bs-BA", FileType.TEXTS, false),
    new FileInfo("lang.cs-CZ", FileType.TEXTS, false),
    new FileInfo("lang.de", FileType.TEXTS, false),
    new FileInfo("lang.fr", FileType.TEXTS, false),
    new FileInfo("lang.hr-HR", FileType.TEXTS, false),
    new FileInfo("lang.hu-HU", FileType.TEXTS, false),
    new FileInfo("lang.mk-MK", FileType.TEXTS, false),
    new FileInfo("lang.pl-PL", FileType.TEXTS, false),
    new FileInfo("lang.ro-RO", FileType.TEXTS, false),
    new FileInfo("lang.ru-RU", FileType.TEXTS, false),
    new FileInfo("lang.sk-SK", FileType.TEXTS, false),
    new FileInfo("lang.sl-SI", FileType.TEXTS, false),
    new FileInfo("lang.sq", FileType.TEXTS, false),
    new FileInfo("lang.sr-YU", FileType.TEXTS, false),
    new FileInfo("lang.xx", FileType.TEXTS, false),
    new FileInfo("map_angkor.out", FileType.MAP, false),
    new FileInfo("map_scotland.out", FileType.MAP, false),
    new FileInfo("map_tibet.out", FileType.MAP, false),
    new FileInfo("mc", FileType.RAW, false),
    new FileInfo("mm0.f", FileType.SPRITES, true),
    new FileInfo("mm1.f", FileType.SPRITES, true),
    new FileInfo("mmv.f", FileType.SPRITES, true),
    new FileInfo("ms.f", FileType.SPRITES, true),
    new FileInfo("o.f", FileType.SPRITES, true),
    new FileInfo("snd.amr", FileType.RAW, false),
    new FileInfo("snd.f", FileType.MIDI, true),
    new FileInfo("spl.f", FileType.PNG, true),
    // new FileInfo("testStage.bin", FileType.STAGES, false),
    new FileInfo("tips.f", FileType.SPRITES, true),
    new FileInfo("tipst.f", FileType.RAW, true),
    new FileInfo("ui.f", FileType.SPRITES, true),
    new FileInfo("w0.bin", FileType.STAGES, false),
    new FileInfo("w1.bin", FileType.STAGES, false),
    new FileInfo("w2.bin", FileType.STAGES, false),
]
