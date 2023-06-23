var __author__ = "kubik.augustyn@post.cz"

// Copied from https://mindustry-proc-programming.web.app/src/js/editor/Parser.js
class ArrayBuffer {
    static ALLOCATE_CHUNK = 5;
    #length
    #content

    constructor() {
        this.#content = new Array(ArrayBuffer.ALLOCATE_CHUNK)
        this.reset()
    }

    add(item) {
        if (this.#content.length <= this.#length) this.#content.length += ArrayBuffer.ALLOCATE_CHUNK
        this.#content[this.#length++] = item
    }

    reset() {
        this.#length = 0
        this.#content.length = ArrayBuffer.ALLOCATE_CHUNK
    }

    item(i) {
        if (i >= this.#length) return
        return this.#content[i]
    }

    /**
     * @param predicate {(value: any, index: number, obj: any[]) => unknown}
     * @param thisArg {any}
     * @return {any | undefined}
     */
    find(predicate, thisArg) {
        return this.items.find(predicate, thisArg)
    };

    * iter() {
        for (var i = 0; i < this.#length; i++) yield this.#content[i]
    }

    get items() {
        return this.#content.slice(0, this.#length)
    }

    get length() {
        return this.#length
    }
}
