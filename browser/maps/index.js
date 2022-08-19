var __author__ = "kubik.augustyn@post.cz"

var canvas = new CanvasEngine2D({
    canvas: document.getElementById("canvas"),
    appName: "diamondRush-browser-maps",
    imageW: 240,
    imageH: 320,
    backgroundColor: [0, 0, 0, 255]
})
canvas.addElement(canvas.loadImage("map", "", "map"), 0, 0, 0)
canvas.render()

function loadMap(e) {
    e.preventDefault()
    console.log(e)
    var file = new Array(...document.getElementsByName("file")).filter(a => a.checked)[0].value
    if (!file) return false
    $$.Data.httpBinary("../diamond_EUD.jar/" + file, renderMap)
}

function renderMap(binary, e) {
    canvas.removeElementsById("dot")
    var dec = binary.map(a => parseInt(a, 2))
    console.log(dec)
    var header = dec.slice(0, 3)
    dec = dec.slice(3)
    var data = dec.slice(0, header[0])
    var numStages = header[2]
    var stages = []
    var stageI = 0
    var stageS = 0
    for (var i = 0; i < numStages; i++) {
        var stage = {
            x: data.shift(),
            y: data.shift(),
            secret: data.shift(),
            levelID: data.shift(),
            numPaths: data.shift(),
            paths: []
        }
        stage.name = `${stage.secret ? "Secret stage" : "Stage"} ${(stage.secret ? stageS : stageI) + 1}`
        for (var a = 0; a < stage.numPaths; a++) stage.paths.push({
            x: data.shift(),
            y: data.shift()
        })
        var clr = stage.secret ? [255, 0, 0, 255] : [0, 255, 0, 255]
        canvas.addElement(canvas.createImage("dot", [[clr, clr, clr, clr, clr], [clr, clr, clr, clr, clr], [clr, clr, clr, clr, clr], [clr, clr, clr, clr, clr], [clr, clr, clr, clr, clr]]), 40 + stage.x * 13, 82 + stage.y * 13, 1)
        stages.push(stage)
        if (stage.secret) stageS++
        else stageI++
    }
    canvas.render()
    console.log(stages)
}

document.getElementById("map_form").addEventListener("submit", loadMap)
