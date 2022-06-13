import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
  public static byte[] a = null;

  public i b;

  public Display c;

  public GloftDIRU() {
    a = getAppProperty("MIDlet-Version").getBytes();
    this.b = new i(this);
  }

  public final void startApp() throws MIDletStateChangeException {
    if (this.c == null)
      this.c = Display.getDisplay(this);
    this.c.setCurrent((Displayable)this.b);
    this.b.f();
  }

  public final void pauseApp() {
    this.b.e();
    notifyPaused();
  }

  public final void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
    notifyDestroyed();
  }

  public final void a() {
    i.d();
    ((i)this.b).a.d();
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
