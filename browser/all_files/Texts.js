var __author__ = "kubik.augustyn@post.cz"

function arr2bigEndian(arr) {
    return arr2smallEndian(arr.reverse())
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

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

class Texts {
    constructor(dec) {
        this.texts = []
        this.dec = dec

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.parseTexts()
    }

    parseTexts() {
        var dec = new Array(...this.dec)
        this.texts = []
        var len_header = 256
        var header = dec.shiftTimes(len_header)
        console.log("Header:", header.join(" "))
        while (dec.length) {
            var len = arr2bigEndian(dec.shiftTimes(2))
            var text = ""
            for (var byte of dec.shiftTimes(len)) {
                text += String.fromCharCode(byte)
            }
            if (text === "0") break
            this.texts.push(new Text(text))
        }
    }

    createTable(targetTable) {
        var i = 0
        targetTable.innerHTML = "<tr><th>Index</th><th>Size</th><th>Text</th></th>"
        for (var text of this.texts) {
            var tr = document.createElement("tr")
            var td = document.createElement("td")
            td.innerText = dec2hex_str(i)
            tr.appendChild(td)
            var td1 = document.createElement("td")
            td1.innerText = text.size
            tr.appendChild(td1)
            var td2 = document.createElement("td")
            td2.innerText = text.text
            tr.appendChild(td2)
            targetTable.appendChild(tr)
            i++
        }
    }
}

class Text {
    constructor(text, size = 0) {
        this.text = decode_utf8(text)
        this.size = size

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }
}
