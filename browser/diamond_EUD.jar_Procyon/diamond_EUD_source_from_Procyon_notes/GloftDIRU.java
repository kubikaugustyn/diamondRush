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
    private i a;
    public Display a;
    public static String a;
    
    public GloftDIRU() {
        GloftDIRU.a = this.getAppProperty("MIDlet-Version").getBytes(); // b'1.1.7'
        this.a = new i(this);
    }
    
    public final void startApp() {
        if (this.a == null) {
            this.a = Display.getDisplay((MIDlet)this);
        }
        this.a.setCurrent((Displayable)this.a);
        this.a.d();
    }
    
    public final void pauseApp() {
        this.a.c();
        this.notifyPaused();
    }
    
    public final void destroyApp(final boolean b) {
        if (GloftDIRU.a != null) {
            try {
                this.platformRequest(GloftDIRU.a);
            }
            catch (Exception ex) {}
        }
        this.notifyDestroyed();
    }
    
    public final void a() {
        i.b();
        this.a.a.d();
        try {
            this.destroyApp(true);
        }
        catch (MIDletStateChangeException ex) {}
    }
    
    static {
        GloftDIRU.a = null;
        GloftDIRU.a = null;
    }
}
