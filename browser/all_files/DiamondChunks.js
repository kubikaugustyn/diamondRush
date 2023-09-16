var __author__ = "kubik.augustyn@post.cz"

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

class DiamondChunks extends DiamondFile {
    init() {
        this.fileType = "chunks"
    }

    /**
     * @param _dec {number[]}
     * @returns {number[][]}
     */
    static parseChunks(_dec) {
        var dec = _dec.slice()
        var num_chunks = dec.shift()
        var chunk_data = dec.shiftTimes(num_chunks * 8) // num_chunks << 3 in ORIGINAL IMPLEMENTATION
        var chunks = []
        for (var i = 0; i < num_chunks; i++) {
            var address = arr2smallEndian(chunk_data.shiftTimes(4))
            var length = arr2smallEndian(chunk_data.shiftTimes(4))
            var chunk = dec.slice(address, address + length)
            chunks.push(chunk)
        }
        return chunks
    }

    parse(dec, r) {
        // console.log("Whole file:", dec.join(" "))
        var chunks = DiamondChunks.parseChunks(dec)
        for (var i = 0; i < chunks.length; i++) {
            var chunk = chunks[i]
            var chunkDiv = document.createElement("div")
            var h1 = document.createElement("h1")
            h1.innerHTML = "Chunk " + (i + 1) + ": "
            r.appendChild(h1)
            r.appendChild(chunkDiv)

            console.groupCollapsed("Chunk " + (i + 1))
            console.log("Decimal:", chunk)
            try {
                var c = chunk.slice()
                if (c[0] === 223 || c[0] === 26) {// df (03 01 01 01 01) - Texture file
                    h1.innerHTML += "Textures"
                    // console.log("Address: ", address, "Length:", length)
                    var textures = new DiamondTextures(c)
                    textures.setScale(5)
                    textures.render(chunkDiv)
                    console.log("Textures:", textures)
                    // r.innerHTML += "Textures were not fully documented yet and cannot be parsed right now.<br>"
                    // r.innerHTML += "But I found out where is the 16-color palette stored and dimension of textures and also encoding of pixels, but some bytes still doesn't make sense for me."
                } else if (c.joinPart(" ", 0, 4) === "77 84 104 100") {// MThd = .MID file
                    h1.innerHTML += "MID sound file"
                    /* chunkDiv.innerHTML = `<audio controls>
                          <source src="data:audio/mid;base64,${btoa(c.map(a => String.fromCharCode(a)).join(""))}" type="audio/mid">
                        Your browser does not support the audio element.
                        </audio>` */
                    chunkDiv.innerHTML = `<a href="data:audio/mid;base64,${btoa(c.toAscii())}" download="audio${i}.mid">Download this file</a><br>`
                    console.log("MIDI base64:", btoa(c.toAscii()))
                    chunkDiv.innerHTML += `<a target="_blank" href="../midi_explorer/index.html?file=${btoa(c.toAscii())}">Explore this file</a>`
                    chunkDiv.innerHTML += "<h1>MID file info</h1>"
                    var d = document.createElement("div")
                    chunkDiv.appendChild(d)


                    // Parsing by: https://www.file-recovery.com/mid-signature-format.htm
                    // Can be finished with: https://ccrma.stanford.edu/~craig/14q/midifile/MidiFileFormat.html
                    c.shiftTimes(4)
                    var header_len = arr2bigEndian(c.shiftTimes(4))
                    if (header_len !== 6) throw new Error("Bad MThd Header length, expected 6, got " + header_len)
                    var format_type = arr2bigEndian(c.shiftTimes(2)) // format type (0-2)
                    if (!(format_type > -1 && format_type < 3)) throw new Error("Bad MThd Header length, expected 0 - 2, got " + format_type)
                    d.innerHTML += `Format type: ${format_type}<br>`
                    var num_tracks = arr2bigEndian(c.shiftTimes(2)) // number of tracks (1-65,535)
                    if (!(num_tracks > 0 && num_tracks < 65536)) throw new Error("Bad MThd Header length, expected 1 - 65535, got " + num_tracks)
                    d.innerHTML += `Number of tracks: ${num_tracks}<br>`
                    var time_division = arr2bigEndian(c.shiftTimes(2)) // time division, either ticks per beat or frames per second
                    d.innerHTML += `Time division: ${time_division}<br>`

                    var track_chunks = []
                    for (var a = 0; a < num_tracks; a++) {
                        var signature = c.shiftTimes(4).toAscii() // signature, must be 4D 54 72 6B ("MTrk")
                        if (signature !== "MTrk") throw new Error("Bad Track chunk signature, expected MTrk, got " + signature)
                        var track_chunk_len = arr2bigEndian(c.shiftTimes(4)) // chunk size (length of the data), big-endian
                        var track_chunk_dec = c.shiftTimes(track_chunk_len) // track event data, contains a stream of MIDI events that define information about the sequence and how it is played

                        var track_chunk = {
                            length: track_chunk_len,
                            data: track_chunk_dec,
                            ascii: track_chunk_dec.toAscii()
                        }
                        track_chunks.push(track_chunk)
                    }
                    console.log("Track chunks:", track_chunks)
                } else if (c.joinPart(" ", 0, 8) === "137 80 78 71 13 10 26 10") {// Magic number = .PNG file
                    h1.innerHTML += "PNG image file"
                    var png = new DiamondPng(`image${i}.png`)
                    png.parse(c, chunkDiv)
                } else {
                    h1.innerHTML += "Not recognized, probably text"
                    // r.removeChild(chunkDiv)
                    chunkDiv.innerHTML = c.join(", ") + "<hr>" + c.map(a => String.fromCharCode(a)).join("")
                }
            } catch (e) {
                console.log(e)
                h1.innerHTML += " - Error"
                chunkDiv.innerHTML = "Error while parsing chunk: " + e
            }
            console.groupEnd()
        }
        console.log("Parsed chunks:", chunks)
    }
}
