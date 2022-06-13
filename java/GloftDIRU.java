import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

//
// Decompiled by Procyon v0.5.36
//

public final class GloftDIRU extends MIDlet
{
    public static byte[] a;
    public i a;
    public Display a;

    public GloftDIRU() {
        GloftDIRU.a = this.getAppProperty("MIDlet-Version").getBytes();
        this.a = new i(this);
    }

    public final void startApp() throws MIDletStateChangeException {
        if (this.a == null) {
            this.a = Display.getDisplay((MIDlet)this);
        }
        this.a.setCurrent((Displayable)this.a);
        this.a.f();
    }

    public final void pauseApp() {
        this.a.e();
        this.notifyPaused();
    }

    public final void destroyApp(final boolean b) throws MIDletStateChangeException {
        this.notifyDestroyed();
    }

    public final void a() {
        i.d();
        this.a.a.d();
        this.b();
        try {
            this.destroyApp(true);
        }
        catch (MIDletStateChangeException ex) {}
    }

    private void b() {
        this.a = null;
        this.a = null;
        System.gc();
    }

    static {
        GloftDIRU.a = null;
    }
}
