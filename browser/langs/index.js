var __author__ = "kubik.augustyn@post.cz"

function test(dec) {
    /*var c = []
    while (dec.length) {
        var r = dec.shift()
        var g = dec.shift()
        var b = dec.shift()
        var a = dec.shift()
        c.push(`rgba(${[r, g, b, a].join(", ")})`)
    }
    console.log(c)*/
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

function loadLang(e) {
    e.preventDefault()
    console.log(e)
    var file = new Array(...document.getElementsByName("file")).filter(a => a.checked)[0].value
    if (!file) return false
    $$.Data.httpBinary("../diamond_EUD.jar/" + file, renderLang)
}

function encode_utf8(s) {
    return unescape(encodeURIComponent(s));
}

function decode_utf8(s) {
    return decodeURIComponent(escape(s));
}

function renderLang(binary, e) {
    var dec = binary.map(a => parseInt(a, 2))
    console.log(dec)
    var len_header = 256
    var header = dec.slice(0, len_header)
    dec = dec.slice(len_header)
    console.log("Header:", header.join(" "))
    test(header)
    var data = dec.slice(0, dec.length)
    var texts = []
    var text
    while (data.length) {
        var len = 256 * dec.shift() + dec.shift()
        text = ""
        for (var byte of dec.slice(0, len)) {
            text += String.fromCharCode(byte)
        }
        if (text === "0") break
        texts.push(decode_utf8(text))
        dec = dec.slice(len)
    }
    var i = 0
    document.getElementById("result").innerHTML = ""
    for (text of texts) {
        var tr = document.createElement("tr")
        var td = document.createElement("td")
        td.innerText = dec2hex_str(i)
        tr.appendChild(td)
        var td1 = document.createElement("td")
        td1.innerText = text
        tr.appendChild(td1)
        document.getElementById("result").appendChild(tr)
        i++
    }
    console.log(texts)
}

document.getElementById("map_form").addEventListener("submit", loadLang)
