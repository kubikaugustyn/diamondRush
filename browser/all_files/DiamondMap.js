var __author__ = "kubik.augustyn@post.cz"

class DiamondMap extends DiamondFile {
    init() {
        this.fileType = "map"
    }

    parse(dec, container) {
        container.innerHTML += "Map parser is not implemented yet.<br>"
        super.parse(dec, container)
    }
}
