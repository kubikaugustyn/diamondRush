var __author__ = "kubik.augustyn@post.cz"

// import javax.microedition.lcdui.Display;
// import javax.microedition.lcdui.Displayable;
// import javax.microedition.midlet.MIDlet;
// import javax.microedition.midlet.MIDletStateChangeException;

class GloftDIRU extends MIDlet {// public final class GloftDIRU extends MIDlet {
    constructor() {
        super();
        this.byte_arr_a = null//   public static byte[] a = null;
        this.i_a = undefined//   public i a;
        this.Display_a = undefined//   public Display a;

        //   public GloftDIRU() {
        this.byte_arr_a = this.getAppProperty("MIDlet-Version").getBytes()//     a = (Display)getAppProperty("MIDlet-Version").getBytes();
        this.i_a = new i(this)//     this.a = (Display)new i(this);
        //   }
    }

    startApp() {//   public final void startApp() throws MIDletStateChangeException {
        if (this.Display_a === undefined)//     if (this.a == null)
            this.Display_a = Display.getDisplay(this)//       this.a = Display.getDisplay(this);
        this.Display_a.setCurrent(this.i_a)//     this.a.setCurrent((Displayable)this.a);
        this.i_a.f()//     this.a.f();
    }//   }

    pauseApp() {//   public final void pauseApp() {
        this.i_a.e()//     this.a.e();
        this.notifyPaused()//     notifyPaused();
    }//   }

    destroyApp(paramBoolean) {//   public final void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
        this.notifyDestroyed()//     notifyDestroyed();
    }//   }

    a() {//   public final void a() {
        i.d()//     i.d();
        this.i_a.a.d()//     ((i)this.a).a.d();
        this.b()//     b();
        try {//     try {
            this.destroyApp(true)//       destroyApp(true);
            //return//       return;
        } catch (mIDletStateChangeException) {//     } catch (MIDletStateChangeException mIDletStateChangeException) {
            //return//       return;
        }//     }
    }//   }

    b() {//   private void b() {
        this.i_a = null//     this.a = null;
        this.Display_a = null//     this.a = null;
        System.gc()//     System.gc();
    }//   }
}// }

