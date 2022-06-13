var __author__ = "kubik.augustyn@post.cz"

// import javax.microedition.midlet.MIDletStateChangeException;
// import javax.microedition.lcdui.Displayable;
// import javax.microedition.lcdui.Display;
// import javax.microedition.midlet.MIDlet;

class GloftDIRU {// public final class GloftDIRU extends MIDlet
    constructor() {
        this.a = undefined// public static byte[] a;
        this.b = undefined// public i a;
        this.c = undefined// public Display a;
    }

    GloftDIRU() {// public GloftDIRU()
        this.a = AppProps.getAppProperty("MIDlet-Version").getBytes()// GloftDIRU.a = this.getAppProperty("MIDlet-Version").getBytes();
        this.b = new i(this)// this.a = new i(this);
    }// }

    startApp() {// public final void startApp() throws MIDletStateChangeException {
        if (this.c === undefined) {// if (this.a == null) {
            this.c = Display.getDisplay(this)// this.a = Display.getDisplay((MIDlet)this);
        }// }
        this.c.setCurrent(this.b)// this.a.setCurrent((Displayable)this.a);
        this.b.f()// this.a.f();
    }// }

    pauseApp() {// public final void pauseApp() {
        this.b.e()// this.a.e();
        this.notifyPaused()// this.notifyPaused();
    }// }

    destroyApp(b) {// public final void destroyApp(final boolean b) throws MIDletStateChangeException {
        this.notifyDestroyed()// this.notifyDestroyed();
    }// }

    d() {// public final void a() {
        this.b.d()// i.d();
        this.b.a.d()// this.a.a.d();
        this.e()// this.b();
        try {// try {
            this.destroyApp(true)// this.destroyApp(true);
        }// }
        catch
            (ex) {
        }// catch (MIDletStateChangeException ex) {}
    }// }

    e() {// private void b() {
        this.a = undefined// this.a = null;
        this.b = undefined// this.a = null;
        this.c = undefined
        System.gc()// System.gc();
    }// }

    // static {
    // GloftDIRU.a = null;
    // }// }
}// }
