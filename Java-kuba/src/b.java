import javax.microedition.lcdui.Graphics;

public final class b {
    public static byte[][] var_byte_arr_arr_a;
    public static byte var_byte_a;
    public static byte var_byte_b;
    public static int var_int_a;
    public static byte[][] var_byte_arr_arr_b;
    public static byte c;
    public static byte d;
    public static boolean var_boolean_a;
    public static int var_int_b;

    public static void a(int n) {
        int n2;
        int n3;
        if ((var_byte_a = (byte)(var_byte_a + var_byte_b)) > 24) {
            var_byte_a = 0;
            for (n3 = 12; n3 >= 1; --n3) {
                for (n2 = 0; n2 < 12; ++n2) {
                    b.var_byte_arr_arr_a[n2][n3] = var_byte_arr_arr_a[n2][n3 - 1];
                }
            }
            b.b(n);
        }
        if (var_boolean_a && (c = (byte)(c + d)) > 24) {
            c = 0;
            for (n3 = 12; n3 >= 1; --n3) {
                for (n2 = 0; n2 < 12; ++n2) {
                    b.var_byte_arr_arr_b[n2][n3] = var_byte_arr_arr_b[n2][n3 - 1];
                }
            }
            b.b(n);
        }
    }

    public static void b(int n) {
        int n2;
        int n3;
        for (n3 = 0; n3 < 12; ++n3) {
            b.var_byte_arr_arr_a[n3][0] = 0;
        }
        if (var_boolean_a) {
            for (n3 = 0; n3 < 12; ++n3) {
                b.var_byte_arr_arr_b[n3][0] = 0;
            }
        }
        int n4 = 0;
        for (n2 = 0; n2 < n; ++n2) {
            while (var_byte_arr_arr_a[n3 = d.a(0, 12)][0] != 0) {
            }
            n4 = d.a(1, 3);
            b.var_byte_arr_arr_a[n3][0] = (byte)n4;
        }
        if (var_boolean_a) {
            for (n2 = 0; n2 < n; ++n2) {
                while (var_byte_arr_arr_b[n3 = d.a(0, 12)][0] != 0) {
                }
                n4 = d.a(1, 3);
                b.var_byte_arr_arr_b[n3][0] = (byte)n4;
            }
        }
    }

    public static void a(Graphics graphics) {
        int n;
        int n2;
        for (n2 = 0; n2 < 12; ++n2) {
            for (n = 0; n < 13; ++n) {
                int n3;
                Graphics graphics2;
                a a2;
                if (var_byte_arr_arr_a[n2][n] == 1) {
                    a2 = i.var_a_arr_a[i.int_a(2)];
                    graphics2 = graphics;
                    n3 = var_int_a;
                } else {
                    if (var_byte_arr_arr_a[n2][n] != 2) continue;
                    a2 = i.var_a_arr_a[i.int_a(2)];
                    graphics2 = graphics;
                    n3 = 0;
                }
                a2.a(graphics2, n3, n2 * 24, (n - 1) * 24 + var_byte_a, 0, 0, 0);
            }
        }
        if (var_boolean_a) {
            for (n2 = 0; n2 < 12; ++n2) {
                for (n = 0; n < 13; ++n) {
                    if (var_byte_arr_arr_b[n2][n] != 1 && var_byte_arr_arr_b[n2][n] != 2) continue;
                    i.var_a_arr_a[i.int_a(2)].a(graphics, 0, n2 * 24, (n - 1) * 24 + c, 0, 0, 0);
                }
            }
        }
        var_int_a = (var_int_a + 1) % var_int_b;
    }

    static {
        var_byte_a = 0;
        var_byte_b = (byte)4;
        var_int_a = 0;
        c = 0;
        d = (byte)2;
        var_boolean_a = false;
        var_int_b = 0;
    }
}