var __author__ = "kubik.augustyn@post.cz"

var files_arr = ["0.f", "1.f", "2.f", "b0.f", "b1.f", "cm.f", "cr.f", "demo.f", "demoSpr.bin", "demoui.f", "gen0.f", "gen1.f", "gen2.f", "gen3.f", "gen4.f", "icon.png", "lang.bs-BA", "lang.cs-CZ", "lang.de", "lang.fr", "lang.hr-HR", "lang.hu-HU", "lang.mk-MK", "lang.pl-PL", "lang.ro-RO", "lang.ru-RU", "lang.sk-SK", "lang.sl-SI", "lang.sq", "lang.sr-YU", "lang.xx", "map_angkor.out", "map_scotland.out", "map_tibet.out", "mc", "mm0.f", "mm1.f", "mmv.f", "ms.f", "o.f", "snd.amr", "snd.f", "spl.f", "tips.f", "tipst.f", "ui.f", "w0.bin", "w1.bin", "w2.bin"]

function ge(id) {
    return document.getElementById(id)
}

function arr2smallEndian(arr) {
    var se = 0
    arr.forEach((val, index) => {
        se += val * Math.pow(256, index)
    })
    return se
}

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

function encode_utf8(s) {
    return unescape(encodeURIComponent(s));
}

function decode_utf8(s) {
    return decodeURIComponent(escape(s));
}

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

Array.prototype.joinPart = function (separator = ", ", start, end) {
    if (!end) end = this.length
    if (!start) start = 0
    return this.slice(start, end).join(separator)
}

function loadFile(e) {
    e.preventDefault()
    console.log(e)
    var file = new Array(...document.getElementsByName("file")).filter(a => a.checked)[0].value
    if (!file) return false
    $$.Data.httpBinary("../diamond_EUD.jar/" + file, parseFile)
}

function parseFile(binary, e) {
    var dec = binary.map(a => parseInt(a, 2))
    console.log(dec)
    var file_main_type = new Array(...document.getElementsByName("file_main_type")).filter(a => a.checked)[0].value
    var r = ge("result")
    r.innerHTML = ""
    switch (file_main_type) {
        case "chunks":
            var num_chunks = dec.shift()
            var chunk_data = dec.shiftTimes(num_chunks * 8)
            var chunks = []
            for (var i = 0; i < num_chunks; i++) {
                var address = arr2smallEndian(chunk_data.shiftTimes(4))
                var length = arr2smallEndian(chunk_data.shiftTimes(4))
                var chunk = dec.slice(address, address + length)
                var chunkDiv = document.createElement("div")
                var h1 = document.createElement("h1")
                h1.innerHTML = "Chunk " + (i + 1) + ": "
                r.appendChild(h1)
                r.appendChild(chunkDiv)

                console.group("Chunk " + (i + 1))
                console.log("Decimal:", chunk)
                try {
                    var c = new Array(...chunk)
                    if (c.joinPart(" ", 0, 6) === "223 3 1 1 1 1") {
                        h1.innerHTML += "Image"
                        c.shiftTimes(6)
                        var num_textures = arr2smallEndian(c.shiftTimes(2))
                        console.log("Number of textures:", num_textures)
                        var textures = new Textures()
                        textures.setCount(num_textures)
                        textures.setDimensions(c.shiftTimes(num_textures * 2))
                        console.log("Remaining data:", c)
                        console.log("Textures:", textures)
                    } else {
                        h1.innerHTML += "Not recognized"
                    }
                } catch (e) {
                    h1.innerHTML += "Error"
                    chunkDiv.innerHTML = "Error while parsing chunk: " + e
                }
                console.groupEnd()

                chunks.push(chunk)
            }
            console.log(chunks)
            break
        case "texts":
            var texts = new Texts(dec)
            var table = document.createElement("table")
            r.appendChild(table)
            texts.createTable(table)
            break
        default:
            r.innerHTML = "This file type is not implemented yet: " + file_main_type
            break
    }
}

ge("file_form").addEventListener("submit", loadFile)
ge("files").innerHTML = files_arr.map((a, b) => `<input type="radio" value="${a}" name="file"${b === 0 ? " checked" : ""}> ${a}<br>`).join("")
ge("submit").click()

// Test of textures
var textures = new Textures()
textures.setCount(1)
textures.setDimensions([24, 24])
textures.setScale(10)
textures.setPalette([
    [0, 0, 0, 0],
    [88, 56, 24, 255],
    [104, 88, 32, 255],
    [128, 104, 48, 255],
    [144, 120, 56, 255],
    [208, 184, 104, 255],
    [160, 136, 72, 255],
    [232, 216, 152, 255],
    [176, 152, 80, 255],
    [192, 168, 96, 255],
    [248, 248, 192, 255],
    [48, 136, 96, 255],
    [96, 208, 128, 255],
    [120, 232, 136, 255],
    [72, 184, 112, 255],
    [144, 248, 152, 255]
])
textures.appendCanvases()
// textures.setData([[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]])
textures.setData(["00 00 00 00 01 11 11 10 00 00 00 00 00 00 00 11 17 77 aa 61 11 00 00 00 00 00 01 a7 77 59 9a a4 46 10 00 00 00 00 15 5a a5 77 77 79 77 61 00 00 00 01 a7 7a aa 85 63 59 72 46 10 00 00 1a 73 33 57 97 a6 94 41 23 41 00 01 aa 34 44 45 85 59 43 33 34 22 10 01 a4 46 66 68 34 42 33 33 33 41 10 19 a3 65 88 58 48 84 38 44 88 31 21 19 55 75 75 35 87 56 53 87 46 12 11 19 55 77 82 27 97 56 52 23 78 12 b1 16 85 57 77 75 9a 75 87 77 98 21 e1 16 68 55 55 59 7a 75 68 55 94 11 c1 16 66 38 55 25 97 58 52 59 44 2b d1 14 66 68 88 29 48 84 82 33 33 2c d1 14 66 36 66 33 22 21 22 33 33 1d c1 01 44 36 64 33 43 12 64 32 33 bc 10 00 34 33 33 75 55 99 86 32 33 f1 00 00 12 22 23 59 83 24 66 32 3e d1 00 00 01 22 23 46 59 86 41 32 ed 10 00 00 00 12 23 34 21 11 12 3d d1 00 00 00 00 01 12 22 22 21 1b d1 10 00 00 00 00 00 01 11 11 1b 11 10 00 00 00 00 00 00 00 00 11 11 00 00 00 00 00".split(' ').map(a => parseInt(a, 16))])
