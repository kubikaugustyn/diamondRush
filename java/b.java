import javax.microedition.lcdui.Graphics;

//
// Decompiled by Procyon v0.5.36
//

public final class b
{
    public static byte[][] a;
    public static byte a;
    public static byte b;
    public static int a;
    public static byte[][] b;
    public static byte c;
    public static byte d;
    public static boolean a;
    public static int b;

    public static void a(final int n) {
        b.a += b.b;
        if (b.a > 24) {
            b.a = 0;
            for (int i = 12; i >= 1; --i) {
                for (int j = 0; j < 12; ++j) {
                    b.a[j][i] = b.a[j][i - 1];
                }
            }
            b(n);
        }
        if (b.a) {
            b.c += b.d;
            if (b.c > 24) {
                b.c = 0;
                for (int k = 12; k >= 1; --k) {
                    for (int l = 0; l < 12; ++l) {
                        b.b[l][k] = b.b[l][k - 1];
                    }
                }
                b(n);
            }
        }
    }

    public static void b(final int n) {
        for (int i = 0; i < 12; ++i) {
            b.a[i][0] = 0;
        }
        if (b.a) {
            for (int j = 0; j < 12; ++j) {
                b.b[j][0] = 0;
            }
        }
        for (int k = 0; k < n; ++k) {
            int a;
            do {
                a = d.a(0, 12);
            } while (b.a[a][0] != 0);
            b.a[a][0] = (byte)d.a(1, 3);
        }
        if (b.a) {
            for (int l = 0; l < n; ++l) {
                int a2;
                do {
                    a2 = d.a(0, 12);
                } while (b.b[a2][0] != 0);
                b.b[a2][0] = (byte)d.a(1, 3);
            }
        }
    }

    public static void a(final Graphics graphics) {
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 13; ++j) {
                a a;
                Graphics graphics2;
                int a2;
                if (b.a[i][j] == 1) {
                    a = i.a[i.a(2)];
                    graphics2 = graphics;
                    a2 = b.a;
                }
                else {
                    if (b.a[i][j] != 2) {
                        continue;
                    }
                    a = i.a[i.a(2)];
                    graphics2 = graphics;
                    a2 = 0;
                }
                a.a(graphics2, a2, i * 24, (j - 1) * 24 + b.a, 0, 0, 0);
            }
        }
        if (b.a) {
            for (int k = 0; k < 12; ++k) {
                for (int l = 0; l < 13; ++l) {
                    if (b.b[k][l] != 1) {
                        if (b.b[k][l] != 2) {
                            continue;
                        }
                    }
                    i.a[i.a(2)].a(graphics, 0, k * 24, (l - 1) * 24 + b.c, 0, 0, 0);
                }
            }
        }
        b.a = (b.a + 1) % b.b;
    }

    static {
        //???b.a = 0;
        //???b.b = 4;
        b.a = 0;
        b.c = 0;
        b.d = 2;
        b.a = false;
        b.b = 0;
    }
}
