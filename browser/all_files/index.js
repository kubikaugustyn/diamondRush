var __author__ = "kubik.augustyn@post.cz"

FILE_CHUNKS = DiamondChunks
FILE_MAP = DiamondMap
FILE_STAGES = DiamondStages
FILE_TEXTS = DiamondTexts
FILE_PNG = DiamondPng
FILE_UNDEFINED = DiamondFile

var files_list = {
    "0-edited.f": FILE_CHUNKS,
    'testStage.bin': FILE_STAGES,
    "0.f": FILE_CHUNKS,
    "1.f": FILE_CHUNKS,
    "2.f": FILE_CHUNKS,
    "b0.f": FILE_CHUNKS,
    "b1.f": FILE_CHUNKS,
    "cm.f": FILE_CHUNKS,
    "cr.f": FILE_CHUNKS,
    "demo.f": FILE_UNDEFINED,
    "demoSpr.bin": FILE_UNDEFINED,
    "demoui.f": FILE_CHUNKS,
    "gen0.f": FILE_CHUNKS,
    "gen1.f": FILE_CHUNKS,
    "gen2.f": FILE_CHUNKS,
    "gen3.f": FILE_CHUNKS,
    "gen4.f": FILE_CHUNKS,
    "icon.png": FILE_PNG,
    "lang.bs-BA": FILE_TEXTS,
    "lang.cs-CZ": FILE_TEXTS,
    "lang.de": FILE_TEXTS,
    "lang.fr": FILE_TEXTS,
    "lang.hr-HR": FILE_TEXTS,
    "lang.hu-HU": FILE_TEXTS,
    "lang.mk-MK": FILE_TEXTS,
    "lang.pl-PL": FILE_TEXTS,
    "lang.ro-RO": FILE_TEXTS,
    "lang.ru-RU": FILE_TEXTS,
    "lang.sk-SK": FILE_TEXTS,
    "lang.sl-SI": FILE_TEXTS,
    "lang.sq": FILE_TEXTS,
    "lang.sr-YU": FILE_TEXTS,
    "lang.xx": FILE_TEXTS,
    "map_angkor.out": FILE_MAP,
    "map_scotland.out": FILE_MAP,
    "map_tibet.out": FILE_MAP,
    "mc": FILE_UNDEFINED,
    "mm0.f": FILE_CHUNKS,
    "mm1.f": FILE_CHUNKS,
    "mmv.f": FILE_CHUNKS,
    "ms.f": FILE_CHUNKS,
    "o.f": FILE_CHUNKS,
    "snd.amr": FILE_UNDEFINED,
    "snd.f": FILE_CHUNKS,
    "spl.f": FILE_CHUNKS,
    "tips.f": FILE_CHUNKS,
    "tipst.f": FILE_UNDEFINED,
    "ui.f": FILE_CHUNKS,
    "w0.bin": FILE_STAGES,
    "w1.bin": FILE_STAGES,
    "w2.bin": FILE_STAGES
}
var checked_file_i = parseInt(localStorage.getItem("diamondRush-all_files-file_index") || 0)
// var checked_file_i = 0
// var checked_file_i = 41
// var checked_file_i = 42
// var checked_file_i = 30
// var checked_file_i = 15
// var checked_file_i = 46
var currentFileName = Object.keys(files_list)[checked_file_i]
var currentFile = null

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

Array.prototype.toAscii = function () {
    return this.map(a => String.fromCharCode(a)).join("")
}

function init() {
    ge("file_form").addEventListener("submit", loadFile)
    ge("files").innerHTML = Object.entries(files_list).map(
        (file, index) => {
            var [fileName, fileClass] = file
            files_list[fileName] = new fileClass(fileName)
            return `<label><input type="radio" value="${fileName}" name="file"${index === checked_file_i ? " checked" : ""}>${fileName}</label><br>`
        }
    ).join("")

    ge("submit").click()
}

function loadFile(e) {
    e.preventDefault()
    console.log(e)
    var inputs = new Array(...document.getElementsByName("file")).filter(a => a.checked)
    if (!inputs.length) return false
    var file = inputs[0].value
    var i = Object.keys(files_list).indexOf(file)
    if (!file || i < 0) return false
    checked_file_i = i
    currentFileName = file
    localStorage.setItem("diamondRush-all_files-file_index", i)
    $$.Data.httpBinary("../diamond_EUD.jar/" + file, parseFile)
}

function parseFile(binary, e) {
    var dec = binary.map(a => parseInt(a, 2))
    console.log("Parse file:", dec)
    var file_main_type = new Array(...document.getElementsByName("file_main_type")).filter(a => a.checked)[0].value
    var r = ge("result")
    r.innerHTML = ""
    var file = files_list[currentFileName]
    if (file.fileType) file.parse(dec, r)
    else {
        switch (file_main_type) {
            case "chunks":
                file = new DiamondChunks(file.fileName)
                break
            case "map":
                file = new DiamondMap(file.fileName)
                break
            case "stages":
                file = new DiamondStages(file.fileName)
                break
            case "texts":
                file = new DiamondTexts(file.fileName)
                break
            case "PNG":
                file = new DiamondPng(file.fileName)
                break
            default:
                break
        }
        if (file.fileType) file.parse(dec, r)
        else {
            r.innerHTML = "This file type is not implemented yet: " + file_main_type
        }
    }
    currentFile = file
    /*switch (file_main_type) {
        case "chunks":
            break
        case "texts":
            break
        default:
            r.innerHTML = "This file type is not implemented yet: " + file_main_type
            break
    }*/
}

init()

// Test of textures
/*
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
*/
