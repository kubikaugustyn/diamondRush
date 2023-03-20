import emulator.Emulator;
import gameloft.GloftDIRU;

public class DesktopLauncher {
    public static void main(String[] args) {
        // System.out.println("Running emulator in: " + Emulator.getAbsolutePath());
        Emulator.main(args);
        GloftDIRU midletClass = new GloftDIRU();
        midletClass.invokeStartApp();
    }
}
