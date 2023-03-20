package gameloft;
import gameloft.i;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftDIRU extends MIDlet {
    public static byte[] versionA;
    private i mainClassA;
    public Display displayA;
    public static String stringA;

    public GloftDIRU() {
        GloftDIRU.versionA = this.getAppProperty("MIDlet-Version").getBytes(); // b'1.1.7'
        this.mainClassA = new i(this);
    }

    public final void startApp() {
        if (this.displayA == null) {
            this.displayA = Display.getDisplay((MIDlet)this);
        }
        this.displayA.setCurrent((Displayable)this.mainClassA);
        this.mainClassA.start();
    }

    public final void pauseApp() {
        this.mainClassA.pause();
        this.notifyPaused();
    }

    public final void destroyApp(final boolean b) {
        if (GloftDIRU.stringA != null) {
            try {
                this.platformRequest(GloftDIRU.stringA);
            }
            catch (Exception ex) {}
        }
        this.notifyDestroyed();
    }

    static {
        GloftDIRU.versionA = null;
        GloftDIRU.stringA = null;
    }
}
