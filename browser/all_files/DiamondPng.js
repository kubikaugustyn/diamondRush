var __author__ = "kubik.augustyn@post.cz"

class DiamondPng extends DiamondFile {
    init() {
        this.fileType = "PNG"
    }

    createPngAndLink(src = "", linkText = "Download this file", alt = "PNG Image", download = this.fileName) {
        var png = document.createElement("img")
        png.alt = alt
        png.src = src
        var link = document.createElement("a")
        link.href = src
        link.innerHTML = linkText
        link.download = download
        return [png, link]
    }

    parse(dec, container) {
        var [png, link] = this.createPngAndLink(`data:image/png;base64,${btoa(dec.map(a => String.fromCharCode(a)).join(""))}`)
        container.appendChild(png)
        container.appendChild(document.createElement("br"))
        container.appendChild(link)
    }
}
