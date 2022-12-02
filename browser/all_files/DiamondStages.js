var __author__ = "kubik.augustyn@post.cz"

function arr2smallEndian(arr) {
    var se = 0
    arr.forEach((val, index) => {
        se += val * Math.pow(256, index)
    })
    return se
}

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

class DiamondStage {
    constructor(dec, width, height) {
        this.dec = dec
        this.width = width
        this.height = height
        this.div = document.createElement("div")

        this.layers = {
            blocks: [],
            specifying_data: [],
            data: []
        }

        var any = new Array(256).fill(0).map((_, i) => i)

        this.palette = [
            [
                [255],
                [255],
                [255],
                "green",
                "Air"
            ],
            [
                [10],
                [255],
                [255],
                "lightgreen",
                "Leaves"
            ],
            [
                [80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146],
                [20, 21, 22, 23, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 255],
                [255, 0],
                "yellow",
                "Wall"
            ],
            [
                [1],
                [255],
                [255],
                "violet",
                "Diamond"
            ],
            [
                [0],
                [255],
                [255],
                "gray",
                "Stone"
            ],
            [
                [30],
                [255],
                [255],
                "#ecca86",
                "Stone"
            ],
            [
                [19],
                [255],
                [1, 2],
                "yellowgreen",
                "Snake"
            ],
            [
                [43],
                [255],
                [1, 2],
                "#f54c4c",
                "Red Snake"
            ],
            [
                [49],
                [255],
                [1, 2],
                "#0ee",
                "Turtle"
            ],
            [
                [45],
                [255],
                [255],
                "#ffc593",
                "Monkey"
            ],
            [
                [46],
                [255],
                [255],
                "#ffe7bf",
                "Wasp"
            ],
            [
                [22, 23],
                [255],
                [255],
                "orange",
                "Fire spreader"
            ],
            [
                [11],
                [255],
                [255],
                "#fa0",
                "Fire ball"
            ],
            [
                [2],
                [14, 33],
                [255],
                "darkred",
                "Chest with red diamond"
            ],
            [
                [7],
                [33],
                [255],
                "darkviolet",
                "Chest with ten diamonds"
            ],
            [
                [41],
                [14, 33],
                any,
                "darkviolet",
                "Chest with any diamonds"
            ],
            [
                [5],
                [33],
                any,
                "#bebdb4",
                "Chest with iron key"
            ],
            [
                [4],
                [14, 33],
                any,
                "gold",
                "Chest with gold key"
            ],
            [
                [6],
                [14, 33],
                [255],
                "red",
                "Red chest with 1 Up"
            ],
            [
                [255],
                [4],
                any,
                "lightblue",
                "Spawn / Check point"
            ],
            [
                [79],
                [4, 255],
                any,
                "#00bbff",
                "Spawn / Check point and start point if for, if 255 only start point"
            ],
            [
                any,
                [5],
                [2, 4],
                "burlywood",
                "End sign"
            ],
            [
                any,
                [28],
                [2, 4],
                "burlywood",
                "Secret End sign"
            ],
            [
                any,
                [0],
                [30],
                "magenta",
                "'Ah! The door is locked!' and 'I'm sure the key must be nearby…' text"
            ],
            [
                any,
                [0],
                [33],
                "magenta",
                "'The final chamber in Angkor Wat! The fire crystal is supposed to be hidden here…' and 'But I have a bad feeling about this…' text"
            ],
            [
                any,
                [2],
                [0, 1],
                "cyan",
                "Use hammer / hook image"
            ],
            [
                any,
                [26],
                any,
                "#ff5151",
                "'Defeat everyone!' or 'Defeat The Great Anaconda!' text and next door view"
            ],
            [
                any,
                [1],
                [255],
                "#0f0",
                "Shake UP and DOWN animation"
            ],
            [
                any,
                [0],
                [3],
                "#0f0",
                "Fire statues fall animation"
            ],
            [
                [31],
                [8],
                any,
                "#bebdb4",
                "Iron key keyhole"
            ],
            [
                [31],
                [9],
                any,
                "gold",
                "Gold key keyhole"
            ],
            [
                any,
                [6],
                any,
                "#eed55f",
                "Press button to door"
            ],
            [
                any,
                [7],
                [255],
                "#fca7a7",
                "Defeat everyone Door"
            ],
            [
                any,
                [17],
                [255],
                "#8c714f",
                "Door top"
            ],
            [
                any,
                [7],
                any,
                "#8c714f",
                "Door"
            ],
            [
                any,
                [34],
                [255],
                "blue",
                "Broken icicle"
            ],
            [
                [44],
                [255],
                [255],
                "cyan",
                "Icicle"
            ],
            [
                [38],
                [255],
                any,
                "#005252",
                "Sewer (any = number of water blocks to output)"
            ],
            [
                any,
                [17],
                any,
                "#ff9",
                "Defeat everyone marker (marking block on top of it) - when marking entity (adds to list of entities to be defeated) or chest and doors (adds to list of blocks to be open / unlocked)"
            ],
            [
                [35],
                [255],
                [255],
                "#00f",
                "Trapdoor"
            ],
            [
                [18],
                [255],
                [255],
                "#f00",
                "Trapdoor switch"
            ],
            [
                [255],
                any,
                [255],
                "#0f0",
                "Secret path"
            ],
        ]

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })

        this.parse()
    }

    parse() {
        var dec = this.dec.slice()
        for (var layer of Object.keys(this.layers)) {
            var data = []
            for (var y = 0; y < this.height; y++) {
                data.push(dec.shiftTimes(this.width))
            }
            this.layers[layer] = data
        }
    }

    getLayerBlock(layer, x, y) {
        try {
            return this.layers[layer][y][x]
        } catch (e) {
            return undefined
        }
    }

    render(log = false) {
        log && console.groupCollapsed("Render")
        log && console.log("Width:", this.width)
        log && console.log("Height:", this.height)
        log && console.log("Div:", this.div)

        this.div.innerHTML = ""
        var canvas = document.createElement("canvas")
        var s = 2 // Scale
        var bs = 24 * s // Block size
        canvas.width = bs * this.width
        canvas.height = bs * this.height
        var ctx = canvas.getContext("2d")
        this.div.appendChild(canvas)

        for (var y = 0; y < this.height; y++) {
            for (var x = 0; x < this.width; x++) {
                var block = this.getLayerBlock("blocks", x, y)
                var data = this.getLayerBlock("data", x, y)
                var specifying_data = this.getLayerBlock("specifying_data", x, y)
                var bx = x * bs // Block X
                var by = y * bs // Block Y
                // ctx.strokeStyle = "black"
                ctx.fillStyle = "white"
                for (var clr of this.palette) {
                    if (clr[0].includes(block) && clr[1].includes(data) && clr[2].includes(specifying_data)) {
                        ctx.fillStyle = clr[3]
                        break
                    }
                }
                // log && console.log(ctx.fillStyle)
                // ctx.beginPath()
                ctx.fillRect(bx, by, bs, bs)
                // ctx.stroke()
                ctx.fillStyle = "black"
                ctx.font = `${24 * (1 / s)}px Arial`
                ctx.textBaseline = "top"
                ctx.fillText(block, bx + s, by + s, bs)
                if (data < 255) ctx.fillText(data, bx + s, by + 10 * s, bs)
                if (specifying_data < 255) ctx.fillText(specifying_data, bx + s, by + 18 * s, bs)
                // log && console.log(`Block at X: ${x} Y: ${y} ID: ${block} ${data < 255 ? 'DATA: ' + data : ''} ${specifying_data < 255 ? 'SPECIFIED BY: ' + specifying_data : ''}`)
            }
        }

        log && console.groupEnd()
    }
}

class DiamondStages extends DiamondFile {
    init() {
        this.fileType = "stages"

        this.stages = []
    }

    parse(dec, container) {
        this.stages = []
        console.group("Parse stages!")
        // console.log("Nonsense bytes:", dec.shiftTimes(2))
        if (dec.shift() === 1) {
            var num_stages = dec.shift()
            container.innerHTML = `This stages file contains ${num_stages} stages.`
            for (var i = 0; i < num_stages; i++) {
                var w = arr2smallEndian(dec.shiftTimes(2))
                var h = arr2smallEndian(dec.shiftTimes(2))
                var length = w * h * 3
                var stage = new DiamondStage(dec.shiftTimes(length), w, h)
                var h1 = document.createElement("h1")
                h1.innerHTML = `Stage ${this.stages.length}`
                // stage.render(!this.stages.length)
                stage.render(true)
                container.appendChild(h1)
                container.appendChild(stage.div)
                this.stages.push(stage)
            }
        } else {
            container.innerHTML = "You probably didn't choose right file main type, because this absolutely isn't stages file."
        }
        console.groupEnd()
    }
}
