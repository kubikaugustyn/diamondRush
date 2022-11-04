var __author__ = "kubik.augustyn@post.cz"

var container = [...document.body.children].filter(a => a.tagName === 'DIV')[0]
var url, fileBase64, explorer

function error(message) {
    if (container) {
        container.innerHTML = message
        container.classList.add('error')
    } else {
        console.error(message)
    }
}

function init() {
    if (!container) {
        container = document.body
        error("Couldn't find any div to render midi explorer")
        return
    }

    url = new URL(document.location.href)
    fileBase64 = url.searchParams.get("file") || url.hash.slice(1)

    if (!fileBase64 || !fileBase64.length) {
        error("Couldn't find any file base64 data in url search ?file=[base64] or hash #[base64].")
        return;
    }

    fileBase64 = fileBase64.replaceAll(" ", "+")

    explorer = new MidiExplorer(fileBase64, container)
    explorer.error = error
    explorer.init()
}

init()
