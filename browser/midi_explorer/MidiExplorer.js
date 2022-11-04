var __author__ = "kubik.augustyn@post.cz"

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

Array.prototype.toAscii = function () {
    return this.map(a => String.fromCharCode(a)).join("")
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

class MidiExplorer {
    constructor(fileBase64, container) {
        this.fileBase64 = fileBase64
        this.container = container
        this.decimal = []

        Object.getOwnPropertyNames(Object.getPrototypeOf(this)).filter(method => (method !== 'constructor')).forEach((method) => {
            this[method] = this[method].bind(this);
        })
    }

    error(msg) {
        console.error(msg)
    }

    init() {
        var raw
        try {
            raw = atob(this.fileBase64)
        } catch {
            this.error("Wrong base64")
            return
        }
        this.decimal = []
        for (var char of raw) this.decimal.push(char.charCodeAt())
        if (this.decimal.shiftTimes(4).join(" ") !== "77 84 104 100") this.error("Midi Explorer didn't recognize midi file. Maybe wrong base64?")
        this.parse()
    }

    parse() {
        try {
            this.container.innerHTML = "<h1>Parsed MIDI File</h1><h2>Header</h2>"
            // Parsing by: https://www.file-recovery.com/mid-signature-format.htm
            // Can be finished with: https://ccrma.stanford.edu/~craig/14q/midifile/MidiFileFormat.html
            var header_len = arr2bigEndian(this.decimal.shiftTimes(4))
            if (header_len !== 6) throw new Error("Bad MThd Header length, expected 6, got " + header_len)
            var format_type = arr2bigEndian(this.decimal.shiftTimes(2)) // format type (0-2)
            if (!(format_type > -1 && format_type < 3)) throw new Error("Bad MThd Header format type, expected 0 - 2, got " + format_type)
            this.container.innerHTML += `Format type: ${format_type}<br>`
            var num_tracks = arr2bigEndian(this.decimal.shiftTimes(2)) // number of tracks (1-65,535)
            if (!(num_tracks > 0 && num_tracks < 65536)) throw new Error("Bad MThd Header number of tracks, expected 1 - 65535, got " + num_tracks)
            this.container.innerHTML += `Number of tracks: ${num_tracks}<br>`
            var time_division = arr2bigEndian(this.decimal.shiftTimes(2)) // time division, either ticks per beat or frames per second
            this.container.innerHTML += `Time division: ${time_division}<br>`

            var track_chunks = []
            for (var a = 0; a < num_tracks; a++) {
                var signature = this.decimal.shiftTimes(4).toAscii() // signature, must be 4D 54 72 6B ("MTrk")
                if (signature !== "MTrk") throw new Error("Bad Track chunk signature, expected MTrk, got " + signature)
                var track_chunk_len = arr2bigEndian(this.decimal.shiftTimes(4)) // chunk size (length of the data), big-endian
                var track_chunk_dec = this.decimal.shiftTimes(track_chunk_len) // track event data, contains a stream of MIDI events that define information about the sequence and how it is played

                var track_events = []
                var chunk = [...track_chunk_dec]// Clone
                while (chunk.length) {
                    var v_time=chunk.shift()

                    var track_event = {}

                    track_events.push(track_events)
                    break
                }

                var track_chunk = {
                    length: track_chunk_len,
                    data: track_chunk_dec,
                    ascii: track_chunk_dec.toAscii(),
                    events: track_events
                }

                track_chunks.push(track_chunk)
            }
            console.log("Track chunks:", track_chunks)
        } catch (e) {
            this.error("Parsing error: ".concat(e.message))
        }
    }
}
