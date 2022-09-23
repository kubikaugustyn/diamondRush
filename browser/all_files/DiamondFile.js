var __author__ = "kubik.augustyn@post.cz"

class DiamondFile {
    constructor(fileName) {
        this.fileName = fileName
        this.fileType = undefined

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.init()
    }

    init() {

    }

    parse(dec, container) {
        container.innerHTML = dec.join(", ")
    }
}
