var __author__ = "kubik.augustyn@post.cz"

class DiamondDemoSpr extends DiamondFile {
    static textures = new Map([
        [8, 2756], // Offset, length
        [2764, 1054],
        [3818, 481]
    ])

    init() {
        this.fileType = "DemoSpr"
    }

    getImages(dec) {
        var images = []
        try {
            for (var [off, len] of DiamondDemoSpr.textures.entries()) {
                console.log(off, len, dec.slice(off, off + len))
                var textures = new DiamondTextures(dec.slice(off, off + len))
                var div = document.createElement("div")
                textures.setScale(5)
                textures.render(div)
                images.push(div)
            }
        } catch (e) {
            console.log("Error at offset", off, e)
        }
        return images
    }

    parse(dec, container) {
        container.innerHTML="This file contains 3 texture files, that are incomplete / can't be parsed (yet)"
        //this.getImages(dec).forEach(image => container.appendChild(image))
    }
}
