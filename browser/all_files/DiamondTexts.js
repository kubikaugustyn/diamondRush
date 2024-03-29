var __author__ = "kubik.augustyn@post.cz"

/////////////////////////////////////////////////
function arr2bigEndian(arr) {
    return arr2smallEndian([...arr].reverse())
}

function dec2hex_str(dec) {
    var decArr = []
    var b2 = dec.toString(2)
    for (var i = 0; i < b2.length; i += 8) {
        decArr.push(b2.slice(0, i * 8))
        b2 = b2.slice(i * 8)
    }
    var hexArr = []
    for (var a of decArr) {
        var hex = dec.toString(16)
        if (hex.length === 1) hex = "0" + hex
        hexArr.push(hex)
    }
    return hexArr.join(" ")
}

function decode_utf8(s) {
    return decodeURIComponent(escape(s));
}

/////////////////////////////////////////////////

class DiamondText {
    constructor(text) {
        console.log(text)
        this.text = decode_utf8(text)

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }
}

class DiamondTexts extends DiamondFile {
    init() {
        this.fileType = "texts"

        this.texts = []
    }

    parseTexts(dec) {
        this.texts = []
        var i = 0
        while (dec.length) {
            var index = arr2bigEndian(dec.slice(i, i + 2))
            var len = arr2bigEndian(dec.slice(index, index + 2))
            var text = ""
            for (var byte of dec.slice(index + 2, index + 2 + len)) text += String.fromCharCode(byte)
            if (text === "0") break
            this.texts.push(new DiamondText(text))
            i += 2
        }
    }

    createTable(targetTable) {
        var i = 0
        targetTable.innerHTML = "<tr><th>Index</th><th>Text</th></th>"
        for (var text of this.texts) {
            var tr = document.createElement("tr")
            var td = document.createElement("td")
            td.innerText = dec2hex_str(i)
            tr.appendChild(td)
            var td1 = document.createElement("td")
            td1.innerText = text.text
            tr.appendChild(td1)
            targetTable.appendChild(tr)
            i++
        }
    }

    parse(dec, container) {
        this.parseTexts(dec)
        var table = document.createElement("table")
        container.appendChild(table)
        this.createTable(table)
    }
}
