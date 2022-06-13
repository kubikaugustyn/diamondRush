var __author__ = "kubik.augustyn@post.cz"

/*function createPackage(variable, structure = []) {
    for (var data of structure) {
        if (typeof data === "string") {
            variable[data] = "Wasn't defined yet."
        } else {
            var key = data.shift()
            if (!Object.keys(variable).includes(key)) variable[key] = {}
            createPackage(variable[key], data)
        }
    }
}

var javax = {}
var nanoxml = {}
var org = {}
createPackage(javax, [
    [
        "microedition",

        [
            "io",

            "CommConnection",
            "Connection"
        ]
    ]
])*/

var U = undefined

var javax = {
    microedition: {
        lcdui: {
            AlertType: U,
            Choice: U,
        }
    }
}
