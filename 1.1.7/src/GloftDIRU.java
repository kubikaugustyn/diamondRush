import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftDIRU extends MIDlet
{
    public static byte[] a;
    private i b;
    public Display c;
    public static String d;
    
    public GloftDIRU() {
        GloftDIRU.a = this.getAppProperty("MIDlet-Version").getBytes();
        this.b = new i(this);
    }
    
    public final void startApp() {
        if (this.c == null) {
            this.c = Display.getDisplay((MIDlet)this);
        }
        this.c.setCurrent((Displayable)this.b);
        this.b.d();
    }
    
    public final void pauseApp() {
        this.b.c();
        this.notifyPaused();
    }
    
    public final void destroyApp(final boolean b) {
        if (GloftDIRU.d != null) {
            try {
                this.platformRequest(GloftDIRU.d);
            }
            catch (Exception ex) {}
        }
        this.notifyDestroyed();
    }
    
    public final void a() {
        i.b();
        //this.b.a.d();
        //try {
            this.destroyApp(true);
        //}
        //catch (MIDletStateChangeException ex) {}
    }
    
    static {
        //GloftDIRU.a = null;
        //GloftDIRU.a = null;
    }
}
