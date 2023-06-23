var __author__ = "kubik.augustyn@post.cz"

class DiamondRaw extends DiamondFile {
    init() {
        this.fileType = "RAW"
    }

    parse(dec, container) {
        var header = document.createElement("div")
        header.innerHTML = `File size: ${dec.length}`
        var hex = document.createElement("div")
        hex.innerHTML = dec.map(decVal => {
            var hexStr = decVal.toString(16)
            if (hexStr.length === 1) hexStr = "0" + hexStr
            return hexStr
        }).join(" ")
        var ascii = document.createElement("div")
        ascii.innerHTML = dec.map(decVal => String.fromCharCode(decVal)).join(" ")
        container.appendChild(header)
        container.appendChild(hex)
        container.appendChild(ascii)
    }
}
