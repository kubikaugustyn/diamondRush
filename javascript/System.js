var __author__ = "kubik.augustyn@post.cz"

var System = {}

System.gc = () => {
    console.log("Garbage Collection")
}

System.arraycopy = (src, srcPos, dest, destPos, length) => {
    for (var a = 0; a < length; a++) {
        var b = a + srcPos
        var c = a + destPos
        dest[c] = src[b]
    }
}

System.currentTimeMillis = () => {
    return Date.now()
}

class short {
    constructor(length) {
        this.length = length || Infinity
    }
}

class byte {
    constructor(length) {
        this.length = length || Infinity
    }
}

class int {
    constructor(length) {
        this.length = length || Infinity
    }
}

class int2 {
    constructor(length1, length2) {
        this.length1 = length1 || Infinity
        this.length2 = length2 || Infinity
    }
}
