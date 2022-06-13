import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
  public static byte[] a = null;

  public i a;

  public Display a;

  public GloftDIRU() {
    a = (Display)getAppProperty("MIDlet-Version").getBytes();
    this.a = (Display)new i(this);
  }

  public final void startApp() throws MIDletStateChangeException {
    if (this.a == null)
      this.a = Display.getDisplay(this);
    this.a.setCurrent((Displayable)this.a);
    this.a.f();
  }

  public final void pauseApp() {
    this.a.e();
    notifyPaused();
  }

  public final void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
    notifyDestroyed();
  }

  public final void a() {
    i.d();
    ((i)this.a).a.d();
    b();
    try {
      destroyApp(true);
      return;
    } catch (MIDletStateChangeException mIDletStateChangeException) {
      return;
    }
  }

  private void b() {
    this.a = null;
    this.a = null;
    System.gc();
  }
}
