var __author__ = "kubik.augustyn@post.cz"

class ByteMarker {
    /**
     * @type {ArrayIterator}
     */
    data
    /**
     * @type {string}
     */
    color
    /**
     * @type {ArrayBuffer<Array<string, number>>}
     */
    colorsMapped
    /**
     * @type {HTMLDivElement}
     */
    container

    /**
     * @param data {number[]}
     * @param offset {number}
     * @param container {HTMLDivElement, null}
     */
    constructor(data, offset, container = null) {
        this.data = new ArrayIterator(data.slice(offset))
        this.color = "LOL"
        this.colorsMapped = new ArrayBuffer()
        this.container = container || document.createElement("div")
    }

    next(colorName = this.color, amount = 1) {
        if (amount > 1) {
            for (var i = 0; i < amount; i++) this.next(colorName)
            return
        }
        this.color = colorName
        if (this.colorsMapped.length > 0 && this.colorsMapped.item(this.colorsMapped.length - 1)[0] === colorName) this.colorsMapped.item(this.colorsMapped.length - 1)[1] += 1
        else this.colorsMapped.add([colorName, 1])
    }

    skip(amount = 1) {
        this.color = undefined
        this.next(undefined, amount)
    }

    jump(to = 0) {
        this.color = undefined
        var counter = this.countColorsMapped()
        if (counter < to) {
            this.skip(to - counter)
            return
        }
        counter = 0
        var target = this.colorsMapped.find(clr => {
            counter += clr[1]
            return counter >= to
        }, this)
        var targetI = this.colorsMapped.items.indexOf(target)
        var leftItems = this.colorsMapped.items.slice(0, targetI)
        this.colorsMapped.reset()
        leftItems.forEach(item => this.colorsMapped.add(item))
        var left = to - this.countColorsMapped(leftItems)
        this.colorsMapped.add([target[0], left])
    }

    countColorsMapped(items = this.colorsMapped.items) {
        return items.reduce((reducer, val) => reducer + val[1], 0)
    }

    render() {
        console.log("Render", this)
        this.container.innerHTML = ""
        this.data.reset()
        for (var color of this.colorsMapped.iter()) {
            var span = document.createElement("span")
            if (color[0]) span.style.backgroundColor = color[0]
            for (var i = 0; i < color[1] && !this.data.almostDone; i++) span.innerText += (i ? " " : "") + this.data.next.toString(16).padStart(2, "0")
            this.container.appendChild(span)
            this.container.append(" ")
            if (this.data.done) break
        }
    }
}


class BlankByteMarker extends ByteMarker {
    next(colorName, amount) {
    }

    skip(amount) {
    }

    jump(to) {
    }

    countColorsMapped(items) {
    }

    render() {
    }
}
