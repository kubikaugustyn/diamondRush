var __author__ = "kubik.augustyn@post.cz"

// package javax.microedition.midlet;
//
// import javax.microedition.io.ConnectionNotFoundException;
//
// import org.microemu.DisplayAccess;
// import org.microemu.MIDletAccess;
// import org.microemu.MIDletBridge;
//
class MIDlet {// public abstract class MIDlet {
    constructor() {//
        this.destroyed = undefined// 	private boolean destroyed;
        //
        this.MIDletAccessor = class MIDletAccessor extends MIDletAccess {// 	class MIDletAccessor extends MIDletAccess {
            constructor() {//
                // 		public MIDletAccessor() {
                super(MIDlet.prototype)// 			super(MIDlet.this);
                this.destroyed=false// 			destroyed = false;
            }// 		}
            //
            startApp() {// 		public void startApp() throws MIDletStateChangeException {
                org.microemu.MIDletBridge.prototype.setCurrentMIDlet(midlet)// 			MIDletBridge.setCurrentMIDlet(midlet);
                // 			midlet.startApp();
            }// 		}
            //
            // 		public void pauseApp() {
            // 			midlet.pauseApp();
            // 		}
            //
            // 		public void destroyApp(boolean unconditional) throws MIDletStateChangeException {
            // 			if (!midlet.destroyed) {
            // 				midlet.destroyApp(unconditional);
            // 			}
            // 			DisplayAccess da = getDisplayAccess();
            // 			if (da != null) {
            // 				da.clean();
            // 				setDisplayAccess(null);
            // 			}
            // 			MIDletBridge.destroyMIDletContext(MIDletBridge.getMIDletContext(midlet));
            // 		}
        }// 	}
        //
        // 	protected MIDlet() {
        org.microemu.MIDletBridge.prototype.registerMIDletAccess(new this.MIDletAccessor())// 		MIDletBridge.registerMIDletAccess(new MIDletAccessor());
    }// 	}
//
// 	protected abstract void startApp() throws MIDletStateChangeException;
//
// 	protected abstract void pauseApp();
//
// 	protected abstract void destroyApp(boolean unconditional) throws MIDletStateChangeException;
//
// 	public final int checkPermission(String permission) {
// 		return MIDletBridge.checkPermission(permission);
// 	}
//
// 	public final String getAppProperty(String key) {
// 		return MIDletBridge.getAppProperty(key);
// 	}
//
// 	public final void notifyDestroyed() {
// 		destroyed = true;
// 		MIDletBridge.notifyDestroyed();
// 	}
//
// 	public final void notifyPaused() {
// 	}
//
// 	public final boolean platformRequest(String URL) throws ConnectionNotFoundException {
// 		return MIDletBridge.platformRequest(URL);
// 	}
//
// 	public final void resumeRequest() {
// 		// TODO implement
// 	}
//
}// }
