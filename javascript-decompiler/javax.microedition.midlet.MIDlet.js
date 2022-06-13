var __author__ = "kubik.augustyn@post.cz"

/*
package javax.microedition.midlet;

import javax.microedition.io.ConnectionNotFoundException;

public abstract class MIDlet {
  protected abstract void destroyApp(boolean paramBoolean) throws MIDletStateChangeException;

  protected abstract void pauseApp();

  protected abstract void startApp() throws MIDletStateChangeException;

  public final boolean platformRequest(String paramString) throws ConnectionNotFoundException {
    return false;
  }

  public final int checkPermission(String paramString) {
    return 0;
  }

  public final String getAppProperty(String paramString) {
    return null;
  }

  public final void notifyDestroyed() {}

  public final void notifyPaused() {}

  public final void resumeRequest() {}
}
*/

class AppProp {
    constructor(id, value) {
        this.id = id
        this.value = value

        this.getBytes = this.getBytes.bind(this)
    }

    getBytes() {
        var hex = []
        for (var val of this.value.split("").slice(0, -1)) hex.push((val.charCodeAt().toString(16).length === 1 ? "0" : "") + val.charCodeAt().toString(16))
        return "[B@" + hex.join("")
    }
}

class MIDlet {
    getAppProperty(id) {
        var http = new XMLHttpRequest()
        http.open("GET", "resources/META-INF/MANIFEST.MF", false)
        http.send()
        var lines = http.responseText.split("\n")
        var manifest = {}
        for (var line of lines) {
            var a = line.split(": ")
            manifest[a[0]] = a[1]
        }
        return new AppProp(id, manifest[id])
    }

    notifyPaused() {
        console.log("Paused!")
    }

    notifyDestroyed() {
        console.log("Destroyed!")
    }
}
