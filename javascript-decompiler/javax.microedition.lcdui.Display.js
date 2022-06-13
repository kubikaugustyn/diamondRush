var __author__ = "kubik.augustyn@post.cz"

// package javax.microedition.lcdui;

// import javax.microedition.midlet.MIDlet;

class DisplayClass {// public class Display {
    constructor(paramMIDlet) {
        this.COLOR_BACKGROUND = 0//   public static final int COLOR_BACKGROUND = 0;
        this.COLOR_FOREGROUND = 1//   public static final int COLOR_FOREGROUND = 1;
        this.LIST_ELEMENT = 1//   public static final int LIST_ELEMENT = 1;
        this.CHOICE_GROUP_ELEMENT = 2//   public static final int CHOICE_GROUP_ELEMENT = 2;
        this.COLOR_HIGHLIGHTED_BACKGROUND = 2 //   public static final int COLOR_HIGHLIGHTED_BACKGROUND = 2;
        this.ALERT = 3//   public static final int ALERT = 3;
        this.COLOR_HIGHLIGHTED_FOREGROUND = 3//   public static final int COLOR_HIGHLIGHTED_FOREGROUND = 3;
        this.COLOR_BORDER = 4 //   public static final int COLOR_BORDER = 4;
        this.COLOR_HIGHLIGHTED_BORDER = 5//   public static final int COLOR_HIGHLIGHTED_BORDER = 5;

        this.MIDlet_paramMIDlet = paramMIDlet
        this.Displayable_current = undefined
    }

    flashBacklight(paramInt) {//   public boolean flashBacklight(int paramInt) {
        console.log("Fash backlight", paramInt)
        return false//     return false;
    }//   }

    isColor() {//   public boolean isColor() {
        return false//     return false;
    }//   }

    vibrate(paramInt) {//   public boolean vibrate(int paramInt) {
        console.log("Vibrate", paramInt)
        return false//     return false;
    }//   }

    getBestImageHeight(paramInt) {//   public int getBestImageHeight(int paramInt) {
        console.log("Get best image height", paramInt)
        return 0//     return 0;
    }//   }

    getBestImageWidth(paramInt) {//   public int getBestImageWidth(int paramInt) {
        return 0//     return 0;
    }//   }

    getBorderStyle(paramBoolean) {//   public int getBorderStyle(boolean paramBoolean) {
        return 0//     return 0;
    }//   }

    getColor(paramInt) {//   public int getColor(int paramInt) {
        return 0//     return 0;
    }//   }

    numAlphaLevels() {//   public int numAlphaLevels() {
        return 0//     return 0;
    }//   }

    numColors() {//   public int numColors() {
        return 0//     return 0;
    }//   }

    getCurrent() {//   public Displayable getCurrent() {
        return null//     return null;
    }//   }

    // getDisplay(paramMIDlet) {//   public static Display getDisplay(MIDlet paramMIDlet) {
    //     console.log("Get display", paramMIDlet)
    //     return null//     return null;
    // }//   }

    callSerially(paramRunnable) {
    }//   public void callSerially(Runnable paramRunnable) {}

    setCurrent_Alert(paramAlert, paramDisplayable) {
    }//   public void setCurrent(Alert paramAlert, Displayable paramDisplayable) {}

    setCurrent(paramDisplayable) {
        this.Displayable_current = paramDisplayable
    }//   public void setCurrent(Displayable paramDisplayable) {}

    setCurrentItem(paramItem) {
    }//   public void setCurrentItem(Item paramItem) {}
}// }

var Display = {
    getDisplay: paramMIDlet => {
        return new DisplayClass(paramMIDlet)
    }
}

/*class DisplayClass {
    constructor(cls) {
        this.cls = {}

        this.setCurrent = this.setCurrent.bind(this)
        this.notifyPaused = this.notifyPaused.bind(this)
        this.notifyDestroyed = this.notifyDestroyed.bind(this)

        this.setCurrent(cls)
    }

    setCurrent(cls) {
        if (this.cls.notifyPaused) delete this.cls.notifyPaused
        if (this.cls.notifyDestroyed) delete this.cls.notifyDestroyed
        this.cls = cls
        this.cls.notifyPaused = this.notifyPaused
        this.cls.notifyDestroyed = this.notifyDestroyed
    }

    notifyPaused() {
        console.log("Display => getDisplay => new class DisplayClass => notifyPaused()")
    }

    notifyDestroyed() {
        console.log("Display => getDisplay => new class DisplayClass => notifyDestroyed()")
    }
}

var Display = {
    getDisplay: cls => {
        return new DisplayClass(cls)
    }
}*/
