var __author__ = "kubik.augustyn@post.cz"

function bin2hex(bin) {
    var hex = []
    for (var a of bin) {
        hex.push(parseInt(a, 2).toString(16).toUpperCase())
        if (hex[hex.length - 1].length === 1) hex[hex.length - 1] = "0" + hex[hex.length - 1]
    }
    return hex
}

function bin2dec(bin) {
    var dec = []
    for (var a of bin) {
        dec.push(parseInt(a, 2).toString())
        if (dec[dec.length - 1].length === 1) dec[dec.length - 1] = "00" + dec[dec.length - 1]
        else if (dec[dec.length - 1].length === 2) dec[dec.length - 1] = "0" + dec[dec.length - 1]
    }
    return dec
}

function decompile(binary) {
    if (bin2hex(binary.slice(0, 4)).join("") !== "CAFEBABE") return "Bad  magic number."
    binary = binary.slice(4)
    if (bin2hex(binary.slice(0, 2)).join("") !== "0003") return "Bad  minor version."
    binary = binary.slice(2)
    if (bin2hex(binary.slice(0, 2)).join("") !== "002D") return "Bad  major version."//JDK 1.1
    binary = binary.slice(2)
    var constantPoolCount = 256 * parseInt(binary.shift(), 2) + parseInt(binary.shift(), 2)
    console.log(constantPoolCount)
    var constantPoolTable = bin2dec(binary.slice(0, constantPoolCount - 1))
    binary = binary.slice(constantPoolCount - 1)
    console.log(constantPoolTable)
    var [accesFlags, bitmask] = bin2dec([binary.shift(), binary.shift()])
    console.log(accesFlags, bitmask)
    var thisIndexClass = 256 * parseInt(binary.shift(), 2) + parseInt(binary.shift(), 2)
    console.log(thisIndexClass, constantPoolTable[thisIndexClass])
    var superIndexClass = 256 * parseInt(binary.shift(), 2) + parseInt(binary.shift(), 2)
    console.log(superIndexClass, constantPoolTable[superIndexClass])
    var java = `//Decompiled by ${__author__} code.\n`
    console.log(binary)
    return java
}
