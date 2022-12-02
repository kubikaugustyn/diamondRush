var __author__ = "kubik.augustyn@post.cz"

var container = [...document.body.children].filter(a => a.tagName.toUpperCase() === 'DIV')[0]
var editor

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

    editor = new StageEditor(container)
    editor.error = error
    editor.init()
}

init()
