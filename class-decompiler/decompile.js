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

function hex2dec(hex) {
    var dec = []
    for (var a of hex) {
        dec.push(parseInt(a, 16).toString())
        if (dec[dec.length - 1].length === 1) dec[dec.length - 1] = "00" + dec[dec.length - 1]
        else if (dec[dec.length - 1].length === 2) dec[dec.length - 1] = "0" + dec[dec.length - 1]
    }
    return dec
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

function hex2utf8(hex) {
    var utf8 = ""
    for (var code of hex2dec(hex)) utf8 += String.fromCharCode(parseInt(code))
    return utf8
}

class AdditionalByte {
    constructor(lengthBytes, name) {
        this.lengthBytes = lengthBytes
        this.name = name
    }

    getValue(binaryArray, values, bytes) {
        var length
        if (typeof this.lengthBytes === "string") {
            var i = 0
            for (var byte of bytes) {
                if (byte.name === this.lengthBytes) {
                    length = hex2num(values[i].split(" "))
                    break
                }
                i++
            }
        } else length = this.lengthBytes
        var value = bin2hex(binaryArray.slice(0, length)).join(" ")
        binaryArray = binaryArray.slice(length)
        return [binaryArray, value]
    }

    getInfo() {
        return `${this.name}: ${this.lengthBytes} bytes`
    }
}

var ConstantTypesByTag = {}

class ConstantType {
    constructor(tag, type, additionalBytes = []) {
        // this.additionalBytes = additionalBytes
        // this.description = description
        this.tag = tag
        this.type = type
        this.additionalBytes = additionalBytes
        ConstantTypesByTag[tag] = this
    }

    getAdditionalByteValues(binaryArray) {
        var values = []
        var value, i = 0
        for (var byte of this.additionalBytes) {
            [binaryArray, value] = byte.getValue(binaryArray, values, this.additionalBytes)
            if (this.type === "UTF-8" && i === 1) {
                values = hex2utf8(value.split(" "))
                break
            }
            values.push(value)
            i++
        }
        return [binaryArray, values]
    }

    getInfo() {
        return `Tag: ${this.tag}, Type: ${this.type}, Additional Bytes: ${this.additionalBytes.map(a => a.getInfo()).join(", ")}`
    }
}

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

class Constant {
    constructor(type, values) {
        this.type = type
        this.values = values
    }

    toString() {
        if (typeof this.values === "string") return this.values
        return JSON.stringify(this.values)
    }
}

class AccessFlag {
    constructor(text, description) {
        this.text = text || "Undefined flag text!"
        this.description = description || "Undefined flag description!"
    }
}

class AccessFlagKind {
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
        if (val & 0x0000) return new AccessFlag()
    }
}

class AccessFlagKindPublic extends AccessFlagKind {
    get(val) {
        if (val & 0x0001) return new AccessFlag("public", "Declared public; may be accessed from outside its package.")
    }
}

class AccessFlagKindPrivate extends AccessFlagKind {
    get(val) {
        if (val & 0x0002) return new AccessFlag("private", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindProtected extends AccessFlagKind {
    get(val) {
        if (val & 0x0004) return new AccessFlag("protected", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindStatic extends AccessFlagKind {
    get(val) {
        if (val & 0x0008) return new AccessFlag("static", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindFinal extends AccessFlagKind {
    get(val) {
        if (val & 0x0010) return new AccessFlag("final", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindSynchronized extends AccessFlagKind {
    get(val) {
        if (val & 0x0020) return new AccessFlag("synchronized", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindBridge extends AccessFlagKind {
    get(val) {
        if (val & 0x0040) return new AccessFlag("bridge", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindVarArgs extends AccessFlagKind {
    get(val) {
        if (val & 0x0080) return new AccessFlag("varargs", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindNative extends AccessFlagKind {
    get(val) {
        if (val & 0x0100) return new AccessFlag("native", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindAbstract extends AccessFlagKind {
    get(val) {
        if (val & 0x0400) return new AccessFlag("abstract", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindStrict extends AccessFlagKind {
    get(val) {
        if (val & 0x0800) return new AccessFlag("strict", "Declared private; accessible only within the defining class.")
    }
}

class AccessFlagKindSynthetic extends AccessFlagKind {
    get(val) {
        if (val & 0x1000) return new AccessFlag("synthetic", "Declared private; accessible only within the defining class.")
    }
}


class AccessFlags {
    constructor(value) {
        this.value = value
        this.flag_kinds = [AccessFlagKindPublic, AccessFlagKindPrivate, AccessFlagKindProtected, AccessFlagKindStatic, AccessFlagKindFinal, AccessFlagKindSynchronized, AccessFlagKindBridge, AccessFlagKindVarArgs, AccessFlagKindNative, AccessFlagKindAbstract, AccessFlagKindStrict, AccessFlagKindSynthetic]
        this.access_flags = this.getFlags()
    }

    getFlagProps(key) {
        var props = []
        for (var flag of this.access_flags) props.push(flag[key])
        return props
    }

    getFlags() {
        var flags = []
        for (var flag_kind of this.flag_kinds) {
            var flag = flag_kind.prototype.get(this.value)
            if (flag) flags.push(flag)
        }
        return flags
    }
}

class Field {
    constructor() {
        this.access_flags = undefined
        this.name_index = undefined
        this.descriptor_index = undefined
        this.attributes_count = undefined
        this.attributes = []

        this.name = undefined
        this.descriptor = undefined
    }

    getInfo(binaryArray, constantPoolTable) {
        this.access_flags = new AccessFlags(hex2num(bin2hex([binaryArray.shift(), binaryArray.shift()])))
        this.name_index = hex2num(bin2hex([binaryArray.shift(), binaryArray.shift()]))
        this.name = constantPoolTable[this.name_index - 1]?.toString()
        this.descriptor_index = hex2num(bin2hex([binaryArray.shift(), binaryArray.shift()]))
        this.descriptor = constantPoolTable[this.descriptor_index - 1]?.toString()
        this.attributes_count = hex2num(bin2hex([binaryArray.shift(), binaryArray.shift()]))
        for (var i = 0; i < this.attributes_count; i++) {
            var attribute = new Attribute()
            binaryArray = attribute.getInfo(binaryArray, constantPoolTable)
            this.attributes.push(attribute)
        }
        return binaryArray
    }
}

class Method extends Field {
}

class Attribute {
    constructor() {
        this.attribute_name_index = undefined
        this.attribute_length = undefined
        this.info = []
        this.info_string = ""

        this.attribute_name = undefined
    }

    getInfo(binaryArray, constantPoolTable) {
        this.attribute_name_index = hex2num(bin2hex([binaryArray.shift(), binaryArray.shift()]))
        this.attribute_name = constantPoolTable[this.attribute_name_index]?.toString()
        this.attribute_length = hex2num(bin2hex([binaryArray.shift(), binaryArray.shift(), binaryArray.shift(), binaryArray.shift()]))
        for (var i = 0; i < this.attribute_length; i++) {
            var hex = bin2hex([binaryArray.shift()])[0]
            this.info.push(hex)
            this.info_string += String.fromCharCode(hex2num([hex]))
        }
        return binaryArray
    }
}

function decompile(binary) {
    var i
    if (bin2hex(binary.slice(0, 4)).join("") !== "CAFEBABE") return "Bad  magic number."
    binary = binary.slice(4)
    if (bin2hex(binary.slice(0, 2)).join("") !== "0003") return "Bad  minor version."
    binary = binary.slice(2)
    if (bin2hex(binary.slice(0, 2)).join("") !== "002D") return "Bad  major version."//JDK 1.1
    binary = binary.slice(2)
    var constantPoolCount = 256 * parseInt(binary.shift(), 2) + parseInt(binary.shift(), 2)
    console.groupCollapsed("Count of constants:", constantPoolCount)
    var constantPoolTable = []
    for (i = 1; i < constantPoolCount; i++) {
        var tag = parseInt(binary.shift(), 2)
        console.groupCollapsed("Constant index:", bin2hex([i.toString(2)]).join(" "))
        console.log("Constant tag:", tag)
        var type = ConstantTypesByTag[tag]
        if (type) {
            var values
            [binary, values] = type.getAdditionalByteValues(binary)
            var constant = new Constant(type, values)
            constantPoolTable.push(constant)
            console.log("Constant type:", constant.type.getInfo())
            console.log("Constant values:", constant.values)
            binary = binary.slice(type.additionalBytes)
        } else console.warn("Undefined or not implemented constant tag:", tag)
        console.groupEnd()
    }
    console.groupEnd()
    console.log("Constants table:", constantPoolTable)

    function getConstant(hex) {
        return constantPoolTable[hex2num(hex.split(" ")) - 1]
    }

    // var [accessFlags, bitmask] = bin2dec([binary.shift(), binary.shift()])
    // console.log("Access flags:", accessFlags,new AccessFlags(parseInt(accessFlags)), "Bitmask:", bitmask)
    var accessFlags = new AccessFlags(hex2num(bin2hex([binary.shift(), binary.shift()])))
    console.log("Access flags:", accessFlags.getFlagProps("text")?.join(" "), accessFlags)
    var thisClassIndex = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.log("This class:", thisClassIndex, getConstant(constantPoolTable[thisClassIndex - 1].values[0])?.toString())
    var superClassIndex = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.log("Super class:", superClassIndex, getConstant(constantPoolTable[superClassIndex - 1].values[0])?.toString())

    var interfacePoolCount = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.groupCollapsed("Count of interfaces:", interfacePoolCount)
    var interfacePoolTable = []
    for (i = 0; i < interfacePoolCount; i++) {
        interfacePoolTable.push(bin2hex([binary.shift(), binary.shift()]).join(" "))
    }
    console.groupEnd()
    console.log("Interfaces table:", interfacePoolTable)

    var fieldPoolCount = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.groupCollapsed("Count of fields:", fieldPoolCount)
    var fieldPoolTable = []
    for (i = 0; i < fieldPoolCount; i++) {
        var field = new Field()
        binary = field.getInfo(binary, constantPoolTable)
        fieldPoolTable.push(field)
    }
    console.groupEnd()
    console.log("Field table:", fieldPoolTable)

    var methodPoolCount = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.groupCollapsed("Count of methods:", methodPoolCount)
    var methodPoolTable = []
    for (i = 0; i < methodPoolCount; i++) {
        var method = new Method()
        binary = method.getInfo(binary, constantPoolTable)
        methodPoolTable.push(method)
    }
    console.groupEnd()
    console.log("Method table:", methodPoolTable)

    var attributePoolCount = hex2num(bin2hex([binary.shift(), binary.shift()]))
    console.groupCollapsed("Count of attributes:", attributePoolCount)
    var attributePoolTable = []
    for (i = 0; i < attributePoolCount; i++) {
        var attribute = new Attribute()
        binary = attribute.getInfo(binary, constantPoolTable)
        attributePoolTable.push(attribute)
    }
    console.groupEnd()
    console.log("Attribute table:", attributePoolTable)

    var head = `//Decompiled by ${__author__}'s code.`
    var imports = ""
    var code = ""

    function importClass(name) {
        var packageName = name.split("/")
        var className = packageName.pop()
        imports += `import ${packageName.join(".")}${packageName.length ? "." : ""}${className};\n`
        return className
    }

    /*
        https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.3.2-200
    FieldType term	Type	Interpretation
    B	byte	signed byte
    C	char	Unicode character code point in the Basic Multilingual Plane, encoded with UTF-16
    D	double	double-precision floating-point value
    F	float	single-precision floating-point value
    I	int	integer
    J	long	long integer
    L ClassName ;	reference	an instance of class ClassName
    S	short	signed short
    Z	boolean	true or false
    [	reference	one array dimension

    https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.3.3
    VoidDescriptor: V
        */
    function nameField(descriptor, name) {
        var line = ""
        // console.log(field)
        // Parse descriptor
        var arr = "", type = ""
        while (descriptor.length) {
            var char = descriptor.shift()
            var exit = true
            switch (char) {
                case "[":
                    arr += "[]"
                    break
                case "B":
                    type += "byte"
                    break
                case "C":
                    type += "char"
                    break
                case "D":
                    type += "double"
                    break
                case "F":
                    type += "float"
                    break
                case "I":
                    type += "int"
                    break
                case "J":
                    type += "long"
                    break
                case "S":
                    type += "short"
                    break
                case "Z":
                    type += "boolean"
                    break
                case "L":
                    char = descriptor.shift()
                    while (char !== ";" && descriptor.length) {
                        type += char
                        char = descriptor.shift()
                    }
                    break
                case "V":
                    type += "void"
                    break
                default:
                    exit = false
            }
            if (exit) break
        }
        line += type + arr
        // End
        return [line, name, ";\n"]
    }

    function nameMethod(method) {
        var returnType = ""
        var parameters = []

        // console.log(method.descriptor)
        var descriptor = `${method.descriptor}`.split("")
        var stage = "wait"
        while (descriptor.length) {
            var char = descriptor[0]
            // console.log(descriptor, char)
            if (char === "(") {
                stage = "parameters"
                descriptor.shift()
            } else if (char === ")") {
                stage = "return"
                descriptor.shift()
            } else if (stage === "parameters") {
                // console.log(descriptor)
                parameters.push(nameField(descriptor, "")[0])
            } else if (stage === "return") {
                returnType = nameField(descriptor, "")[0]
            }
        }
        // console.log(returnType, parameters)

        return [returnType, parameters]
    }

    var extendedClass = importClass(getConstant(constantPoolTable[superClassIndex - 1].values[0]).toString())
    code += `${accessFlags.getFlagProps("text").join(" ")} class ${getConstant(constantPoolTable[thisClassIndex - 1].values[0]).toString()} extends ${extendedClass} {\n`
    try {
        var a, b, c
        for (var f of fieldPoolTable) {
            a = nameField(f.descriptor.split(""), f.name)
            b = f.access_flags.getFlagProps("text").join(" ") + " " + a[0] + " " + a[1] + a[2]
            code += "\t" + b
        }
        code += "\n"
        /*for (var cs of constantPoolTable) {
            switch (cs.type.tag) {
                case 7:// Class
                    java += "uses class " + getConstant(cs.values[0]) + "\n"
                    break
                case 9:// Fieldref
                    java += "uses field of class " + getConstant(getConstant(cs.values[0]).values[0])
                    java += " type '" + getConstant(getConstant(cs.values[1]).values[1]) + "'"
                    java += " named " + getConstant(getConstant(cs.values[1]).values[0]) + "\n"
                    break
                case 10:// Methodref
                    // console.log(cs.values, getConstant(cs.values[0]), getConstant(cs.values[1]))
                    java += "uses method of class " + getConstant(getConstant(cs.values[0]).values[0])
                    java += " type '" + getConstant(getConstant(cs.values[1]).values[1]) + "'"
                    java += " named " + getConstant(getConstant(cs.values[1]).values[0]) + "\n"
                    break
            }
        }*/
        for (var m of methodPoolTable) {
            // console.log(m)
            var [returnType, parameters] = nameMethod(m)
            if (parameters.length === 0 && returnType === "void" && m.name === "<clinit>") {
                code += "\tdefault static\n"
                continue
            }
            b = `${m.access_flags.getFlagProps("text").join(" ")} ${returnType} ${m.name}(${parameters.join(", ")})`
            code += `\t${b}\n`
        }
    } catch (e) {
        console.log(e)
    }
    code += "}"
    console.log(binary.length ? binary : "Parsed all of the binary data.")
    return `${head}\n\n${imports}\n\n${code}`
}
