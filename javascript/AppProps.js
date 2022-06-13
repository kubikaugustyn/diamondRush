var __author__ = "kubik.augustyn@post.cz"

class AppProp {
    constructor(id, value) {
        this.id = id
        this.value = value

        this.getBytes = this.getBytes.bind(this)
    }

    getBytes(){
        return this.value.split("").slice(0, -1)
    }
}

var AppProps = {
    getAppProperty: id => {
        var http = new XMLHttpRequest()
        http.open("GET", "resources/META-INF/MANIFEST.MF", false)
        http.send()
        var lines = http.responseText.split("\n")
        var manifest = {}
        for(var line of lines){
            var a = line.split(": ")
            manifest[a[0]]=a[1]
        }
        return new AppProp(id, manifest[id])
    }
}
