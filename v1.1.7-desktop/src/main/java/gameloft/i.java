package gameloft;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class i extends Canvas implements Runnable {
    public i(GloftDIRU gloftDIRU) {

    }

    public static void pause() {
        System.out.println("Pausing!");
    }

    @Override
    public void run() {

    }

    @Override
    protected void paint(Graphics graphics) {

    }

    public void start() {
        System.out.println("Start!");
    }
}
