var __author__ = "kubik.augustyn@post.cz"

/*import './data_types.js'
import '../../../javascript-decompiler/java_tools.js'

import {MIDletStateChangeException} from "./javax/microedition/midlet/MIDletStateChangeException.js";
import {Displayable} from "./javax/microedition/lcdui/Displayable.js";
// import javax.microedition.lcdui.Display;
// import javax.microedition.midlet.MIDlet;

var a = new Displayable()
console.log(a)*/
/*var i = 0

function load(file) {
    var http = new XMLHttpRequest()
    http.open("GET", "diamond_EUD.jar/" + file + ".f")
    http.responseType = "arraybuffer"
    http.onreadystatechange = function () {
        if (http.readyState === 4 && http.status === 200) {
            console.groupCollapsed("File " + i)
            console.log(http.response)
            var arr = Array.from(new Uint8Array(http.response))
            var string = ""
            var hex = ""
            for (var num of arr) {
                string += String.fromCharCode(num)
                hex += (num.toString(16).length === 1 ? "0" : "") + num.toString(16) + " "
            }
            var canvas = document.createElement("canvas")
            var ctx = canvas.getContext("2d")
            canvas.height = 10
            canvas.width = 10 * Math.floor(arr.length / 3)
            for (var a = 0; a < Math.floor(arr.length / 3); a++) {
                ctx.fillStyle = `rgb(${arr[a * 3]},${arr[a * 3 + 1]},${arr[a * 3 + 2]})`
                ctx.fillRect(a * 10, 0, 10, 10)
            }
            document.body.appendChild(canvas)
            console.log(hex)
            console.log(string)
            console.groupEnd()
            i++
            load(i)
        }
    }
    http.send()
}

load(i)*/
/*var http = new XMLHttpRequest()
http.open("GET", "diamond_EUD.jar/lang.xx")
http.responseType = "arraybuffer"
http.onreadystatechange = function () {
    if (http.readyState === 4 && http.status === 200) {
        console.group("Tips")
        console.log(http.response)
        var arr = Array.from(new Uint8Array(http.response))
        var string = ""
        var hex = ""
        for (var num of arr) {
            string += String.fromCharCode(num)
            hex += (num.toString(16).length === 1 ? "0" : "") + num.toString(16) + " "
        }
        console.log(hex)
        console.log(string)
        string = string.slice(256)
        var texts = {}
        var currKey
        for (var i = 0; i < string.length; i++) {
            var b10 = arr[i + 256]
            var b16 = (b10.toString(16).length === 1 ? "0" : "") + b10.toString(16)
            var char = String.fromCharCode(b10)
            // console.log(b10, b16, char)
            if (b16 === "00") {
                currKey = "waiting"
            } else if (currKey === "waiting") {
                currKey = b16
                // if (texts[currKey]) console.log(`Overwriting text with key ${currKey}: "${texts[currKey]}"`)
                if (!texts[currKey]) texts[currKey] = []
                texts[currKey].push("")
            } else {
                texts[currKey][texts[currKey].length - 1] += char
            }
        }
        for (var [key, value] of Object.entries(texts)) {
            console.log(key + ":", value)
        }
    }
}
http.send()*/

/*var http = new XMLHttpRequest()
// http.open("GET", "diamond_EUD.jar/w0.bin")
// http.open("GET", "diamond_EUD.jar/gen4.f")
// http.open("GET", "diamond_EUD.jar/cm.f")
// http.open("GET", "diamond_EUD.jar/o.f")
http.open("GET", "diamond_EUD.jar/0.f")
http.responseType = "arraybuffer"
http.onreadystatechange = function () {
    if (http.readyState === 4 && http.status === 200) {
        console.groupCollapsed("Textures of Angkor Wat")
        console.log(http.response)
        var arr = Array.from(new Uint8Array(http.response))
        var string = ""
        var hex = ""
        for (var num of arr) {
            string += String.fromCharCode(num)
            hex += (num.toString(16).length === 1 ? "0" : "") + num.toString(16) + " "
        }
        console.log(hex)
        console.log(string)
        var canvas = document.createElement("canvas")
        var ctx = canvas.getContext("2d")
        var scale = 5
        var blockSize = 24
        var w = 10
        var h = 9
        canvas.height = h * blockSize * scale
        canvas.width = w * blockSize * scale
        var palette = []
        for (var i = 0; i < 256; i++) palette.push(`rgb(${Math.floor(Math.random() * 256)},${Math.floor(Math.random() * 256)},${Math.floor(Math.random() * 256)})`)
        var totalX = 0
        var totalY = 0
        for (var line = 0; line < h; line++) {
            for (var col = 0; col < w; col++) {
                var textureX = col * blockSize
                var textureY = line * blockSize
                for (var y = 0; y < blockSize; y++) {
                    for (var x = 0; x < blockSize; x++) {
                        ctx.fillStyle = palette[arr[((line * w + col) * blockSize * blockSize) + y * blockSize + x]]
                        // ctx.fillStyle = palette[arr.shift()]
                        /!*ctx.fillRect(totalX * scale, totalY * scale, scale, scale)
                        totalX++
                        if (totalX > w * blockSize) {
                            totalX = 0
                            totalY++
                        }*!/
                        ctx.fillRect((textureX + x) * scale, (textureY + y) * scale, scale, scale)
                    }
                }
            }
        }
        document.body.appendChild(canvas)
    }
}
http.send()*/

var hexes = []

function load(file, callback) {
    var http = new XMLHttpRequest()
    http.open("GET", "diamond_EUD.jar/" + file)
    http.responseType = "arraybuffer"
    http.onreadystatechange = function () {
        if (http.readyState === 4 && http.status === 200) {
            var arr = Array.from(new Uint8Array(http.response))
            var string = ""
            var hex = ""
            for (var num of arr) {
                string += String.fromCharCode(num)
                hex += (num.toString(16).length === 1 ? "0" : "") + num.toString(16) + " "
            }
            callback(arr, hex, string, file)
        }
    }
    http.send()
}

function onLoad(arr, hex, string, file) {
    console.groupCollapsed("Textures: " + file)
    hexes.push(hex.split(" "))
    console.log(hex.slice(0, 1024))
    console.log(string.length)
    console.groupEnd()
    if (file === "2.f") {
        for (var i = 0; i < Math.min(hexes[0].length); i++) {
            var span = document.createElement("span")
            span.innerHTML = hexes[0][i]
            var same = true
            for (var a = 1; a < hexes.length; a++) {
                if (hexes[a][i] !== hexes[0][i]) same = false
            }
            span.style.backgroundColor = same ? "green" : "red"
            span.style.margin = "2px"
            span.style.padding = "2px"
            document.body.appendChild(span)
        }
    }
}

load("ui.f", onLoad)
load("0.f", onLoad)
load("1.f", onLoad)
load("2.f", onLoad)
