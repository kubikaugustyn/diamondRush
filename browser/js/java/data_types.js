var __author__ = "kubik.augustyn@post.cz"

class DataType {
    constructor(...args) {
        this.args=args
    }

    register(args){
        console.log("???", args)
    }
}

export class Long extends DataType {
    register(args){
        console.log("Long", args)
    }
}

export class Vector extends DataType {
    register(args){
        console.log("Vector", args)
    }
}

export class Exception {
    constructor(...args) {
        console.log("Exception", args)
    }
}
