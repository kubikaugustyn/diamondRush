var __author__ = "kubik.augustyn@post.cz"


class Exception {
    constructor(message = "No message.") {
        this.message = message
        this.setType()
    }

    setType() {
        this.type = "Exception"
    }
}

class RuntimeException extends Exception {
    setType() {
        this.type = "RuntimeException"
    }
}

class IllegalArgumentException extends Exception {
    setType() {
        this.type = "IllegalArgumentException"
    }
}

class JavaCharArr {
    constructor(length = Infinity, value = []) {
        this.JAVA_IDENTIFIER = "JAVA_CHAR_ARRAY"
        this.length = length
        if (this.length < 1) throw new RuntimeException("Invalid char array length.")
        this.value = value
        if (this.length < Infinity) this.value.length = this.length
    }

    push(value) {
        if (typeof value === "string" && value.length === 1) {
            if (this.length > this.value.length) this.value.push(value)
            else throw new RuntimeException("Exceed char array length.")
        } else throw new RuntimeException("Invalid char array value.")
    }

    setItem(index, value) {
        if (typeof value === "string" && value.length === 1) {
            if (this.length > index) this.value[index] = value
            else throw new RuntimeException("Exceed char array length.")
        } else throw new RuntimeException("Invalid char array value.")
    }

    toString() {
        return this.value.join("")
    }
}

class JavaString {
    constructor(source, offset = 0, length) {
        this.source = source
        this.offset = offset
        this.length = length || source.length + offset
        this.value = ""
        for (var i = 0; i < this.length; i++) this.value += " "
        switch (typeof this.source) {
            case "bigint":
            case "number":
                this.setValueWithOffset(this.source.toString())
                break
            case "string":
            case "symbol":
                this.setValueWithOffset(this.source)
                break
            case "boolean":
                this.setValueWithOffset(this.source ? "Yes" : "No")
                break
            case "function":
                this.setValueWithOffset("[Function]")
                break
            case "object":
                if (JSON.stringify(this.source)[0] === "[") this.setValueWithOffset(this.source.join(""))
                else if (typeof this.source.JAVA_IDENTIFIER === "string" && this.source.JAVA_IDENTIFIER === "JAVA_CHAR_ARRAY") this.setValueWithOffset(this.source.toString())
                else this.setValueWithOffset(JSON.stringify(this.source))
                break
            case "undefined":
                this.setValueWithOffset("undefined")
                break
        }
    }

    setValueWithOffset(text) {
        if (this.offset + text.length <= this.length) this.value = this.value.slice(0, this.offset) + text + this.value.slice(this.offset + text.length)
        else throw new RuntimeException("Too big text to a string.")
    }
}
