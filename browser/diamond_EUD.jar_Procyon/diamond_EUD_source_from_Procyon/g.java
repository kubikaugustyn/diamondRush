import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class g
{
    public static byte[][] a;
    private static byte a;
    private static byte b;
    private static int b;
    private static byte c;
    private static byte d;
    private static boolean a;
    public static int a;
    
    public static void a(int i) {
        if ((g.a += g.b) > 24) {
            g.a = 0;
            int j;
            for (i = 12; i >= 1; --i) {
                for (j = 0; j < 12; ++j) {
                    g.a[j][i] = g.a[j][i - 1];
                }
            }
            b(3);
        }
    }
    
    public static void b(final int n) {
        for (int i = 0; i < 12; ++i) {
            g.a[i][0] = 0;
        }
        for (int j = 0; j < n; ++j) {
            int a;
            do {
                a = e.a(0, 12);
            } while (g.a[a][0] != 0);
            g.a[a][0] = (byte)e.a(1, 3);
        }
    }
    
    public static void a(final Graphics graphics) {
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 13; ++j) {
                f f;
                Graphics graphics2;
                int b;
                if (g.a[i][j] == 1) {
                    f = i.a[i.a(2)];
                    graphics2 = graphics;
                    b = g.b;
                }
                else {
                    if (g.a[i][j] != 2) {
                        continue;
                    }
                    f = i.a[i.a(2)];
                    graphics2 = graphics;
                    b = 0;
                }
                f.a(graphics2, b, i * 24, (j - 1) * 24 + g.a, 0);
            }
        }
        g.b = (g.b + 1) % g.a;
    }
    
    static {
        g.a = 0;
        g.b = 4;
        g.b = 0;
        g.c = 0;
        g.d = 2;
        g.a = false;
        g.a = 0;
    }
}
