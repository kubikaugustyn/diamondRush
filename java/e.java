import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class e
{
    public static Image[] a;
    public static a a;
    public static a b;
    public static String[] a;
    public static String[] b;
    public static int a;
    public static int b;
    public static int c;
    public boolean a;
    public int d;
    
    public e() {
        e.a = new Image[5];
        e.a = new String[5];
    }
    
    private static void a(final String s) {
        if (s == null) {
            return;
        }
        try {
            i.a.platformRequest(s);
        }
        catch (Exception ex) {}
    }
    
    public static void a() {
        e.b = i.a[41];
        e.b.e = 1;
        e.a = i.a("/tips.f", 0);
        if (e.b == null) {
            (e.b = i.a("/lang_IGA.f", 15))[7] = i.a(e.b[7], 170);
            e.b[8] = i.a(e.b[8], 170);
            e.b[9] = i.a(e.b[9], 170);
        }
        for (int i = 10, n = 0; i <= 14; ++i, ++n) {
            e.a[n] = i.a.getAppProperty(e.b[i]);
            if (e.a[n] != null && (e.a[n].compareTo("no") == 0 || e.a[n].compareTo("") == 0)) {
                e.a[n] = null;
            }
        }
        e.b[3] = e.b[3] + "\n\u0001\u0001" + e.b[4] + "\n\u0001\u0000" + e.b[5];
        e.b[7] = new String("\u0001\u0000" + e.b[7]);
        try {
            for (int j = 0; j < 4; ++j) {
                e.a[j] = Image.createImage("/ad" + (j + 1));
            }
            i.a[0] = new g(i.a("/ui.f", 0), 0, 0, null);
        }
        catch (Exception ex) {}
        e.a = 0;
        i.b(3);
    }
    
    private static void a(final int n) {
        e.a += n;
        if (e.a == 3 && e.a[e.a] == null) {
            e.a += n;
        }
        int a;
        if (e.a < 0) {
            a = 4;
        }
        else {
            if (e.a != 5) {
                return;
            }
            a = 0;
        }
        e.a = a;
    }
    
    private static void a(final Graphics graphics, final int n) {
        if (e.a[e.a] == null) {
            return;
        }
        if (e.b % 30 < 15) {
            return;
        }
        String[] array;
        int n2;
        if (e.a >= 3) {
            array = e.b;
            n2 = 8;
        }
        else {
            array = e.b;
            n2 = 9;
        }
        final String s = array[n2];
        e.b.a(s);
        final int n3 = a.c + 2;
        final int a = e.b.a(s);
        int n4;
        int n5;
        if (n != 0) {
            n4 = 320 + n >> 1;
            n5 = (a >> 1) + 4;
        }
        else {
            n4 = 160;
            n5 = a >> 1;
        }
        final int n6 = n4 - n5;
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(16711680);
        graphics.fillRect(120 - (n3 >> 1) - 4, n6 - 4, n3 + 8, a + 8);
        e.b.b(graphics, s, 120, n6, 1);
    }
    
    private static void b(final Graphics graphics) {
        int n = 99;
        int n2 = 189;
        graphics.setClip(0, 0, 240, 320);
        for (int i = 0; i < 16; ++i) {
            graphics.setColor(n << 16 | 0x0 | n2);
            graphics.fillRect(0, 160 + 160 * i / 16, 240, 21);
            graphics.fillRect(0, 160 - 160 * (i + 1) / 16, 240, 21);
            n -= 4;
            n2 -= 8;
        }
    }
    
    public final void a(final Graphics graphics) {
        b(graphics);
        if (e.a != 3) {
            i.a[0].a.a(graphics, 11, 120, 15, 0, 0, 0);
        }
        int n = 0;
        switch (e.a) {
            case 4: {
                e.b.b(graphics, "\n\u0001\u0002" + e.b[6], 120, 35, 17);
                e.b.b(graphics, e.b[7], 120, 160, 3);
                e.b.a(e.b[7]);
                n = 160 + (a.d >> 1) + 4;
                break;
            }
            case 3: {
                graphics.drawImage(e.a[e.a], 120, 15, 17);
                e.b.b(graphics, e.b[3], 120, 160, 3);
                e.b.a(e.b[3]);
                n = 160 + (a.d >> 1) + 4;
                break;
            }
            default: {
                graphics.drawImage(e.a[e.a], 120, 240, 33);
                e.b.b(graphics, e.b[e.a], 120, 242, 17);
                n = 0;
                break;
            }
        }
        final int n2 = n;
        i.a.a();
        if (e.a[e.a] != null) {
            i.a.b();
        }
        a(graphics, n2);
        if (i.a(16388)) {
            a(-1);
        }
        else if (i.a(65544)) {
            a(1);
        }
        else if (i.a(32944)) {
            a(e.a[e.a]);
        }
        else if (i.a(64)) {
            i.a.a(0);
            e.c = 2;
            i.W = 0;
        }
        e.a.a(graphics, i.a(16388) ? 2 : 0, e.b % e.a.a(0), 20 + this.d, 160, 0, 0, 0);
        e.a.a(graphics, i.a(65544) ? 3 : 1, e.b % e.a.a(1), 220 - this.d, 160, 0, 0, 0);
        this.d += (this.a ? -1 : 1);
        if (this.d > 3 || this.d < 1) {
            this.a = !this.a;
        }
        i.W = 0;
    }
    
    public static void b() {
        for (int length = e.a.length, i = 0; i < length; ++i) {
            e.a[i] = null;
        }
        e.a = null;
        for (int length2 = e.a.length, j = 0; j < length2; ++j) {
            e.a[j] = null;
        }
        e.a = null;
        for (int length3 = e.b.length, k = 0; k < length3; ++k) {
            e.b[k] = null;
        }
        e.b = null;
        e.b = null;
        e.a = null;
        e.c = 0;
        System.gc();
    }
}
