import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
    public static byte[] var_byte_arr_a;
    public i var_i_a;
    public Display var_javax_microedition_lcdui_Display_a;

    public GloftDIRU() {
        var_byte_arr_a = this.getAppProperty("MIDlet-Version").getBytes();
        this.var_i_a = new i(this);
    }

    public final void startApp() throws MIDletStateChangeException {
        if (this.var_javax_microedition_lcdui_Display_a == null) {
            this.var_javax_microedition_lcdui_Display_a = Display.getDisplay((MIDlet)this);
        }
        this.var_javax_microedition_lcdui_Display_a.setCurrent((Displayable)this.var_i_a);
        this.var_i_a.void_f();
    }

    public final void pauseApp() {
        this.var_i_a.void_e();
        this.notifyPaused();
    }

    public final void destroyApp(boolean bl) throws MIDletStateChangeException {
        this.notifyDestroyed();
    }

    public final void a() {
        i.void_d();
        this.var_i_a.var_h_a.d();
        this.b();
        try {
            this.destroyApp(true);
            return;
        }
        catch (MIDletStateChangeException mIDletStateChangeException) {
            return;
        }
    }

    private void b() {
        this.var_i_a = null;
        this.var_javax_microedition_lcdui_Display_a = null;
        System.gc();
    }

    static {
        var_byte_arr_a = null;
    }
}
