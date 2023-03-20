var __author__ = "kubik.augustyn@post.cz"

Array.prototype.asSmallEndian = function () {
    var se = 0
    this.forEach((val, index) => {
        se += val * Math.pow(256, index)
    })
    return se
}

Array.prototype.asBigEndian = function () {
    this.reverse()
    return this.asSmallEndian()
}

Array.prototype.shiftTimes = function (num) {
    var result = []
    for (var i = 0; i < num; i++) result.push(this.shift())
    return result
}

Array.prototype.joinPart = function (sep = ", ", start, end) {
    if (!end) end = this.length
    if (!start) start = 0
    return this.slice(start, end).join(sep)
}

Array.prototype.toAscii = function () {
    return this.map(a => String.fromCharCode(a)).join("")
}

Array.prototype.compareValues = function (otherArr) {
    if (this.length !== otherArr.length) return false
    for (var i = 0; i < this.length; i++) if (this[i] !== otherArr[i]) return false
    return true
}

function bin2hex(bin) {
    var hex = []
    for (var a of bin) {
        hex.push(parseInt(a, 2).toString(16).toUpperCase())
        if (hex[hex.length - 1].length === 1) hex[hex.length - 1] = "0" + hex[hex.length - 1]
    }
    return hex
}

function hex2num(hex) {
    var num = 0
    var i = 0
    for (var a of hex.reverse()) {
        num += parseInt(a, 16) * Math.pow(256, i)
        i++
    }
    return num
}

function hex2dec(hex) {
    var dec = []
    for (var a of hex) {
        dec.push(parseInt(a, 16).toString())
        if (dec[dec.length - 1].length === 1) dec[dec.length - 1] = "00" + dec[dec.length - 1]
        else if (dec[dec.length - 1].length === 2) dec[dec.length - 1] = "0" + dec[dec.length - 1]
    }
    return dec
}

function decode_utf8(s) {
    return decodeURIComponent(escape(s));
}

function hex2utf8(hex) {
    var ascii = ""
    for (var code of hex2dec(hex)) ascii += String.fromCharCode(parseInt(code))
    return decode_utf8(ascii)
}


class ClassFactory {
    static AdditionalByte = class AdditionalByte {
        lengthBytes
        name

        constructor(lengthBytes, name) {
            this.lengthBytes = lengthBytes
            this.name = name
        }

        getValue(decimalArray, values, bytes) {
            var length
            if (typeof this.lengthBytes === "string") {
                var i = 0
                for (var byte of bytes) {
                    if (byte.name === this.lengthBytes) {
                        length = values[i].split(" ").map(str => parseInt(str, 16)).asBigEndian()
                        break
                    }
                    i++
                }
            } else length = this.lengthBytes
            var value = decimalArray.shiftTimes(length).map(num => num.toString(16)).join(" ")
            return [decimalArray, value]
        }

        getInfo() {
            return `${this.name}: ${this.lengthBytes} bytes`
        }
    }
    static ConstantTypesByTag = {}
    static ConstantType = class ConstantType {
        tag
        type
        additionalBytes

        constructor(tag, type, additionalBytes = []) {
            this.tag = tag
            this.type = type
            this.additionalBytes = additionalBytes
            ClassFactory.ConstantTypesByTag[tag] = this
        }

        getAdditionalByteValues(decimalArray) {
            var values = []
            var value, i = 0
            for (var byte of this.additionalBytes) {
                [decimalArray, value] = byte.getValue(decimalArray, values, this.additionalBytes)
                if (this.type === "UTF-8" && i === 1) {
                    console.log(value)
                    values = hex2utf8(value.split(" "))
                    break
                }
                values.push(value)
                i++
            }
            return [decimalArray, values]
        }

        getInfo() {
            return `Tag: ${this.tag}, Type: ${this.type}, Additional Bytes: ${this.additionalBytes.map(a => a.getInfo()).join(", ")}`
        }
    }
    static Constant = class Constant {
        type
        value

        constructor(type, values) {
            this.type = type
            this.values = values
        }

        toString() {
            if (typeof this.values === "string") {
                if (this.type.type === "UTF-8") return this.values
                return `${this.type} ${this.values}`
            }
            return JSON.stringify(this.values)
        }
    }
    static AccessFlag = class AccessFlag {
        text
        description

        constructor(text, description) {
            this.text = text || "Undefined flag text!"
            this.description = description || "Undefined flag description!"
        }
    }
    static AccessFlagKind = class AccessFlagKind {
        constructor() {

        }

        get(val) {
            /*
            https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.6-200-A.1
            Flag Name	Value	Interpretation
            ACC_PUBLIC	0x0001	Declared public; may be accessed from outside its package.
            ACC_PRIVATE	0x0002	Declared private; accessible only within the defining class.
            ACC_PROTECTED	0x0004	Declared protected; may be accessed within subclasses.
            ACC_STATIC	0x0008	Declared static.
            ACC_FINAL	0x0010	Declared final; must not be overridden (§5.4.5).
            ACC_SYNCHRONIZED	0x0020	Declared synchronized; invocation is wrapped by a monitor use.
            ACC_BRIDGE	0x0040	A bridge method, generated by the compiler.
            ACC_VARARGS	0x0080	Declared with variable number of arguments.
            ACC_NATIVE	0x0100	Declared native; implemented in a language other than Java.
            ACC_ABSTRACT	0x0400	Declared abstract; no implementation is provided.
            ACC_STRICT	0x0800	Declared strictfp; floating-point mode is FP-strict.
            ACC_SYNTHETIC	0x1000	Declared synthetic; not present in the source code.
            */
            return undefined
        }
    }
    static AccessFlagKinds = []
    static AccessFlags = class AccessFlags {
        value
        access_flags

        constructor(value) {
            this.value = value
            this.access_flags = this.getFlags()
        }

        getFlagProps(key) {
            var props = []
            for (var flag of this.access_flags) props.push(flag[key])
            return props
        }

        getFlags() {
            var flags = []
            for (var flag_kind of ClassFactory.AccessFlagKinds) {
                var flag = flag_kind.prototype.get(this.value)
                if (flag) flags.push(flag)
            }
            return flags
        }
    }
    static Field = class Field {
        access_flags
        name_index
        descriptor_index
        attributes_count
        attributes
        name
        descriptor

        constructor() {
            this.access_flags = undefined
            this.name_index = undefined
            this.descriptor_index = undefined
            this.attributes_count = undefined
            this.attributes = []

            this.name = undefined
            this.descriptor = undefined
        }

        getInfo(decimalArray, constantPoolTable) {
            this.access_flags = new ClassFactory.AccessFlags(decimalArray.shiftTimes(2).asBigEndian())
            this.name_index = decimalArray.shiftTimes(2).asBigEndian()
            this.name = constantPoolTable[this.name_index - 1].values//?.toString()
            this.descriptor_index = decimalArray.shiftTimes(2).asBigEndian()
            this.descriptor = constantPoolTable[this.descriptor_index - 1]//?.toString()
            this.attributes_count = decimalArray.shiftTimes(2).asBigEndian()
            for (var i = 0; i < this.attributes_count; i++) {
                var attribute = new ClassFactory.Attribute()
                decimalArray = attribute.getInfo(decimalArray, constantPoolTable)
                this.attributes.push(attribute)
            }
            return decimalArray
        }
    }
    static Method = class Method extends ClassFactory.Field {
    }
    static Attribute = class Attribute {
        attribute_name_index
        attribute_length
        info
        info_string
        attribute_name

        constructor() {
            this.attribute_name_index = undefined
            this.attribute_length = undefined
            this.info = []
            this.info_string = ""

            this.attribute_name = undefined
        }

        getInfo(decimalArray, constantPoolTable) {
            this.attribute_name_index = decimalArray.shiftTimes(2).asBigEndian()
            this.attribute_name = constantPoolTable[this.attribute_name_index]?.toString()
            this.attribute_length = decimalArray.shiftTimes(4).asBigEndian()
            for (var i = 0; i < this.attribute_length; i++) {
                var hex = decimalArray.shift().toString(16)
                this.info.push(hex)
                this.info_string += String.fromCharCode(parseInt(hex, 16))
            }
            return decimalArray
        }
    }

    static MAGIC = [0xCA, 0xFE, 0xBA, 0xBE]
    static MINOR = [0x00, 0x03]
    static MAJOR = [0x00, 0x2D]

    constantPoolTable
    accessFlags
    thisClassIndex
    superClassIndex
    interfacePoolTable
    fieldPoolTable
    methodPoolTable
    attributePoolTable

    constructor() {
    }

    getConstant(hex) {
        return this.constantPoolTable[hex.split(" ").map(str => parseInt(str, 16)).asBigEndian() - 1]
    }

    decodeDecimal(dec) {
        var i
        if (!dec.shiftTimes(ClassFactory.MAGIC.length).compareValues(ClassFactory.MAGIC)) return "Bad  magic number."
        if (!dec.shiftTimes(ClassFactory.MINOR.length).compareValues(ClassFactory.MINOR)) return "Bad  minor version."
        if (!dec.shiftTimes(ClassFactory.MAJOR.length).compareValues(ClassFactory.MAJOR)) return "Bad  major version."
        var constantPoolCount = dec.shiftTimes(2).asBigEndian()
        this.constantPoolTable = new Array(constantPoolCount - 1)
        for (i = 0; i < constantPoolCount - 1; i++) {
            var tag = dec.shift()
            var type = ClassFactory.ConstantTypesByTag[tag]
            if (type) {
                var values
                [dec, values] = type.getAdditionalByteValues(dec)
                this.constantPoolTable[i] = new ClassFactory.Constant(type, values)
                dec = dec.slice(type.additionalBytes)
            } else console.warn("Undefined or not implemented constant tag:", tag)
        }

        this.accessFlags = new ClassFactory.AccessFlags(dec.shiftTimes(2).asBigEndian())
        this.thisClassIndex = dec.shiftTimes(2).asBigEndian()
        this.superClassIndex = dec.shiftTimes(2).asBigEndian()

        this.interfacePoolCount = dec.shiftTimes(2).asBigEndian()
        this.interfacePoolTable = new Array(this.interfacePoolCount)
        for (i = 0; i < this.interfacePoolCount; i++) {
            this.interfacePoolTable[i] = dec.shiftTimes(2).map(num => num.toString(16)).join(" ")
        }

        var fieldPoolCount = dec.shiftTimes(2).asBigEndian()
        this.fieldPoolTable = new Array(fieldPoolCount)
        for (i = 0; i < fieldPoolCount; i++) {
            var field = new ClassFactory.Field()
            dec = field.getInfo(dec, this.constantPoolTable)
            this.fieldPoolTable[i] = field
        }

        var methodPoolCount = dec.shiftTimes(2).asBigEndian()
        this.methodPoolTable = new Array(methodPoolCount)
        for (i = 0; i < methodPoolCount; i++) {
            var method = new ClassFactory.Method()
            dec = method.getInfo(dec, this.constantPoolTable)
            this.methodPoolTable[i] = method
        }

        var attributePoolCount = dec.shiftTimes(2).asBigEndian()
        this.attributePoolTable = new Array(attributePoolCount)
        for (i = 0; i < attributePoolCount; i++) {
            var attribute = new ClassFactory.Attribute()
            dec = attribute.getInfo(dec, this.constantPoolTable)
            this.attributePoolTable[i] = attribute
        }

        return "Successful"
    }

    static {
        var ConstantType = ClassFactory.ConstantType
        var AdditionalByte = ClassFactory.AdditionalByte
        var AccessFlagKind = ClassFactory.AccessFlagKind
        var AccessFlag = ClassFactory.AccessFlag

        new ConstantType(7, "Class", [new AdditionalByte(2, "Name Index")])
        new ConstantType(9, "Fieldref", [new AdditionalByte(2, "Class Index"), new AdditionalByte(2, "Name and Type Index")])
        new ConstantType(10, "Methodref", [new AdditionalByte(2, "Class Index"), new AdditionalByte(2, "Name and Type Index")])
        new ConstantType(11, "InterfaceMethodref", [new AdditionalByte(2, "Class Index"), new AdditionalByte(2, "Name and Type Index")])
        new ConstantType(8, "String", [new AdditionalByte(2, "String Index")])
        new ConstantType(3, "Integer", [new AdditionalByte(4, "Bytes")])
        new ConstantType(4, "Float", [new AdditionalByte(4, "Bytes")])
        new ConstantType(5, "Long", [new AdditionalByte(4, "High Bytes"), new AdditionalByte(4, "Low Bytes")])
        new ConstantType(6, "Double", [new AdditionalByte(4, "High Bytes"), new AdditionalByte(4, "Low Bytes")])
        new ConstantType(12, "Name and Type", [new AdditionalByte(2, "Name Index"), new AdditionalByte(2, "Descriptor Index")])
        new ConstantType(1, "UTF-8", [new AdditionalByte(2, "Length"), new AdditionalByte("Length", "Bytes")])
        // new ConstantType(15, "Method Handle", [new AdditionalByte(1, "Reference Kind"), new AdditionalByte(2, "Reference Index")])
        // new ConstantType(16, "Method Type", [new AdditionalByte(2, "Descriptor Index")])
        // new ConstantType(18, "Invoke Dynamic", [new AdditionalByte(2, "Bootstrap method attribute index"), new AdditionalByte(2, "Name and type index")])

        ClassFactory.AccessFlagKinds.push(
            class AccessFlagKindPublic extends AccessFlagKind {
                get(val) {
                    if (val & 0x0001) return new AccessFlag("public", "Declared public; may be accessed from outside its package.")
                }
            },
            class AccessFlagKindPrivate extends AccessFlagKind {
                get(val) {
                    if (val & 0x0002) return new AccessFlag("private", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindProtected extends AccessFlagKind {
                get(val) {
                    if (val & 0x0004) return new AccessFlag("protected", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindStatic extends AccessFlagKind {
                get(val) {
                    if (val & 0x0008) return new AccessFlag("static", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindFinal extends AccessFlagKind {
                get(val) {
                    if (val & 0x0010) return new AccessFlag("final", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindSynchronized extends AccessFlagKind {
                get(val) {
                    if (val & 0x0020) return new AccessFlag("synchronized", "Declared synchronized; ???")
                }
            },
            class AccessFlagKindBridge extends AccessFlagKind {
                get(val) {
                    if (val & 0x0040) return new AccessFlag("bridge", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindVarArgs extends AccessFlagKind {
                get(val) {
                    if (val & 0x0080) return new AccessFlag("varargs", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindNative extends AccessFlagKind {
                get(val) {
                    if (val & 0x0100) return new AccessFlag("native", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindAbstract extends AccessFlagKind {
                get(val) {
                    if (val & 0x0400) return new AccessFlag("abstract", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindStrict extends AccessFlagKind {
                get(val) {
                    if (val & 0x0800) return new AccessFlag("strict", "Declared private; accessible only within the defining class.")
                }
            },
            class AccessFlagKindSynthetic extends AccessFlagKind {
                get(val) {
                    if (val & 0x1000) return new AccessFlag("synthetic", "Declared private; accessible only within the defining class.")
                }
            }
        )
    }
}
