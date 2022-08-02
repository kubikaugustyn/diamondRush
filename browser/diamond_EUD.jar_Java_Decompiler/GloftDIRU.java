import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
  public static byte[] a = null;
  
  private i a;
  
  public Display a;
  
  public static String a = null;
  
  public GloftDIRU() {
    a = (String)getAppProperty("MIDlet-Version").getBytes();
    this.a = (String)new i(this);
  }
  
  public final void startApp() {
    if (this.a == null)
      this.a = (String)Display.getDisplay(this); 
    this.a.setCurrent((Displayable)this.a);
    this.a.d();
  }
  
  public final void pauseApp() {
    this.a.c();
    notifyPaused();
  }
  
  public final void destroyApp(boolean paramBoolean) {
    if (a != null)
      try {
        platformRequest(a);
      } catch (Exception exception) {} 
    notifyDestroyed();
  }
  
  public final void a() {
    i.b();
    ((i)this.a).a.d();
    try {
      destroyApp(true);
      return;
    } catch (MIDletStateChangeException mIDletStateChangeException) {
      return;
    } 
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\GloftDIRU.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */