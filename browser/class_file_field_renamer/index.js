var __author__ = "kubik.augustyn@post.cz"

function ge(id) {
    return document.getElementById(id)
}

var elems = {
    file_load_form: ge("file_load_form"),
    file_from: ge("file_from"),
    editor: ge("editor"),
    file_save_form: ge("file_save_form"),
    file_to: ge("file_to")
}
var factory = new ClassFactory()

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

function init() {
    elems.file_load_form.addEventListener("submit", loadFile)
    elems.file_from.addEventListener("change", loadFile)
}

function loadFile(e) {
    e.preventDefault()
    var files = elems.file_from.files
    if (files.length !== 1) return false
    var file = files[0]
    if (!file.name.endsWith(".class")) return false
    console.log(file)
    /*file.text().then(utf8 => {
        var ascii = encode_utf8(utf8)
        var dec = new Array(utf8.length).fill(0).map((_, i) => utf8.charCodeAt(i))
        console.log(ascii)
        console.log(dec)
    }).catch(e => {
        elems.editor.innerHTML = `<h1>An error occurred</h1>${e}`
    })*/
    var reader = new FileReader();
    reader.onload = function (e) {
        var asciiText = e.target.result
        var dec = new Array(asciiText.length).fill(0).map((_, i) => asciiText.charCodeAt(i))
        parseFile(dec)
    };
    reader.onerror = function (e) {
        elems.editor.innerHTML = `<h1>An error occurred: ${e.type}</h1>${e}`
    };
    reader.readAsBinaryString(file);
}

function parseFile(dec) {
    console.log("Parse file:", dec)
    try {
        var res = factory.decodeDecimal(dec)
        console.log(res)
    } catch (e) {
        elems.editor.innerHTML = `<h1>An error occurred: ${e.type}</h1>${e}`
        // console.error(e)
    }
    console.log(factory)
    var constatntAtI = index => {
        var val = factory.constantPoolTable[index - 1]?.values
        var rVal
        if (val instanceof Array) rVal = val.slice().map(hexStr => constatntAt(hexStr))
        return `<span class="value">"${rVal ? rVal.map((value, i) => {
            return `<${val[i]} --> ${value}>`
        }) : val?.replaceAll?.("<", "&lt;")}"</span>`
    }
    var constatntAt = hexStr => {
        return constatntAtI(hexStr.split(" ").map(str => parseInt(str, 16)).asBigEndian())
    }
    var accessFlags = flags => {
        if (!flags)return `<span class="flag">[UNDEFINED]</span>`
        return `<span class="flag">${flags.access_flags.map(flag => flag.text).join(", ")}</span>`
    }
    elems.editor.innerHTML = `<h1>Parse file - ${res}</h1>
    <h2>Constant pool table</h2>
    <table>
    <thead>
    <tr><th>HEX index</th><th>Type tag - text</th><th>Type additional bytes</th><th>[Value]</th></tr>
    </thead>
    <tbody>
    ${factory.constantPoolTable.map((constant, i) => {
        var tp = constant.type
        return `<tr><td>${i.toString(16)}</td><td>${tp.tag} - ${tp.type}</td><td>${tp.additionalBytes.map((byte, byteI) => {
            return `<span class="multicolor">${byte.name} (${byte.lengthBytes} b)${typeof constant.values === "string" ? "" : " = " + constant.values[byteI].replaceAll("<", "&lt;") + " === " + constatntAt(constant.values[byteI])}</span>`
        })}</td>${typeof constant.values === "string" ? `<td>${constant.values.replaceAll("<", "&lt;")}</td>` : ""}</tr>`
    }).join("")}
    </tbody>
    </table>
    <h2>This class access flags - ${accessFlags(factory.accessFlags)}</h2>
    <h2>This class - ${(factory.thisClassIndex - 1).toString(16)} - ${constatntAtI(factory.thisClassIndex)}</h2>
    <h2>Super class - ${(factory.superClassIndex - 1).toString(16)} - ${constatntAtI(factory.superClassIndex)}</h2>
    <h2>Interfaces</h2>
    ${factory.interfacePoolCount ? "" : "(No interfaces)"}
    ${factory.interfacePoolTable?.map?.(inter => constatntAt(inter)).join("<br>")}
    <h2>Fields</h2>
    <table>
    <thead>
    <tr><th>HEX index</th><th>Access flags</th><th>Name</th><th>Descriptor</th><th>Attributes</th></tr>
    </thead>
    <tbody>
    ${factory.fieldPoolTable?.map?.((field, i) => {
        field.name = field.name.replaceAll("<", "&lt;")
        var res = `<tr><td>${i.toString(16)}</td><td>${accessFlags(field.access_flags)}</td><td>${field.name} (${constatntAtI(field.name_index)})</td><td>${field.descriptor} (${constatntAtI(field.descriptor_index)})</td><td>(${field.attributes_count}) ${field.attributes}</td></tr>`
        field.name = field.name.replaceAll("&lt;", "<")
        return res
    }).join("")}
    </tbody>
    </table>
    <h2>Methods</h2>
    <table>
    <thead>
    <tr><th>HEX index</th><th>Access flags</th><th>Name</th><th>Descriptor</th><th>Attributes</th></tr>
    </thead>
    <tbody>
    ${factory.methodPoolTable?.map?.((method, i) => {
        method.name = method.name.replaceAll("<", "&lt;")
        var res = `<tr><td>${i.toString(16)}</td><td>${accessFlags(method.access_flags)}</td><td>${method.name} (${constatntAtI(method.name_index)})</td><td>${method.descriptor} (${constatntAtI(method.descriptor_index)})</td><td>(${method.attributes_count}) ${method.attributes}</td></tr>`
        method.name = method.name.replaceAll("&lt;", "<")
        return res
    }).join("")}
    </tbody>
    </table>
    `
}

init()
