var __author__ = "kubik.augustyn@post.cz"

// Copied from https://mindustry-proc-programming.web.app/src/js/editor/Parser.js
class ArrayIterator {
    #values = []
    #i = 0
    #done = false
    #almostDone = false

    constructor(array) {
        this.add(array)
    }

    reset() {
        this.#i = 0
        this.#done = false
        this.#almostDone = false
    }

    get next() {
        if (this.#i >= this.#values.length) this.#done = true
        if (this.#i >= this.#values.length - 1) this.#almostDone = true
        return this.#values[this.#i++]
    }

    get nextPreview() {
        return this.#values[this.#i]
    }

    get lastPreview() {
        return this.#values[this.#i - 2]
    }

    get lastValid() {
        for (var i = this.#i - 2; i >= 0; i--) if (typeof this.#values[i] !== "undefined") return this.#values[i]
        return undefined
    }

    get done() {
        return this.#done
    }

    get almostDone() {
        return this.#almostDone
    }

    undo(len) {
        this.#i -= len
        this.#done = this.#i >= this.#values.length
        this.#almostDone = this.#i >= this.#values.length - 1
    }

    add(array) {
        this.#values.push(...array)
        this.undo(0)
    }

    getState() {
        return [this.#i, this.#done, this.#almostDone]
    }

    setState(state) {
        this.#i = state[0]
        this.#done = state[1]
        this.#almostDone = state[2]
    }

    toArray() {
        return this.#values.slice()
    }
}
