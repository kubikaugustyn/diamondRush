var __author__ = "kubik.augustyn@post.cz"

var java_tools = {
    areArgumentsInForm: (args = [], types = []) => {
        if (args.length !== types.length) return false
        var valid = true
        for (var i = 0; i < args.length; i++) {
            var arg = args[i]
            var type = types[i]
            var argType = typeof arg

            // if (!(["bigint", "boolean", "function", "number", "!not object!", "string", "symbol", "!not undefined!"].includes(argType) && type === argType)) valid = false
            if (!(["bigint", "boolean", "function", "number", "object", "string", "symbol", "undefined"].includes(argType) && type === argType)) valid = false
        }
        return valid
    }
}
