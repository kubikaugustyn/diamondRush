import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e {
    public static Image[] var_javax_microedition_lcdui_Image_arr_a;
    public static a var_a_a;
    public static a var_a_b;
    public static String[] var_java_lang_String_arr_a;
    public static String[] var_java_lang_String_arr_b;
    public static int var_int_a;
    public static int var_int_b;
    public static int c;
    public boolean var_boolean_a;
    public int d;

    public e() {
        var_javax_microedition_lcdui_Image_arr_a = new Image[5];
        var_java_lang_String_arr_a = new String[5];
    }

    private static void a(String string) {
        if (string == null) {
            return;
        }
        try {
            i.var_GloftDIRU_a.platformRequest(string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a() {
        int n;
        var_a_b = i.var_a_arr_a[41];
        e.var_a_b.var_int_e = 1;
        var_a_a = i.a_a("/tips.f", 0);
        if (var_java_lang_String_arr_b == null) {
            n = 0;
            var_java_lang_String_arr_b = i.java_lang_String_arr_a("/lang_IGA.f", 15);
            e.var_java_lang_String_arr_b[7] = i.java_lang_String_a(var_java_lang_String_arr_b[7], 170);
            e.var_java_lang_String_arr_b[8] = i.java_lang_String_a(var_java_lang_String_arr_b[8], 170);
            e.var_java_lang_String_arr_b[9] = i.java_lang_String_a(var_java_lang_String_arr_b[9], 170);
        }
        n = 10;
        int n2 = 0;
        while (n <= 14) {
            e.var_java_lang_String_arr_a[n2] = i.var_GloftDIRU_a.getAppProperty(var_java_lang_String_arr_b[n]);
            if (var_java_lang_String_arr_a[n2] != null && (var_java_lang_String_arr_a[n2].compareTo("no") == 0 || var_java_lang_String_arr_a[n2].compareTo("") == 0)) {
                e.var_java_lang_String_arr_a[n2] = null;
            }
            ++n;
            ++n2;
        }
        e.var_java_lang_String_arr_b[3] = var_java_lang_String_arr_b[3] + "\n\u0001\u0001" + var_java_lang_String_arr_b[4] + "\n\u0001\u0000" + var_java_lang_String_arr_b[5];
        e.var_java_lang_String_arr_b[7] = new String("\u0001\u0000" + var_java_lang_String_arr_b[7]);
        try {
            for (n = 0; n < 4; ++n) {
                e.var_javax_microedition_lcdui_Image_arr_a[n] = Image.createImage((String)("/ad" + (n + 1)));
            }
            i.var_g_arr_a[0] = new g(i.a_a("/ui.f", 0), 0, 0, null);
        }
        catch (Exception exception) {}
        var_int_a = 0;
        i.void_b(3);
    }

    private static void a(int n) {
        block6: {
            int n2;
            block5: {
                block4: {
                    if ((var_int_a += n) == 3 && var_java_lang_String_arr_a[var_int_a] == null) {
                        var_int_a += n;
                    }
                    if (var_int_a >= 0) break block4;
                    n2 = 4;
                    break block5;
                }
                if (var_int_a != 5) break block6;
                n2 = 0;
            }
            var_int_a = n2;
        }
    }

    private static void a(Graphics graphics, int n) {
        int n2;
        int n3;
        int n4;
        String[] stringArray;
        if (var_java_lang_String_arr_a[var_int_a] == null) {
            return;
        }
        if (var_int_b % 30 < 15) {
            return;
        }
        if (var_int_a >= 3) {
            stringArray = var_java_lang_String_arr_b;
            n4 = 8;
        } else {
            stringArray = var_java_lang_String_arr_b;
            n4 = 9;
        }
        String string = stringArray[n4];
        var_a_b.void_a(string);
        int n5 = a.var_int_c + 2;
        int n6 = var_a_b.int_a(string);
        if (n != 0) {
            n3 = 320 + n >> 1;
            n2 = (n6 >> 1) + 4;
        } else {
            n3 = 160;
            n2 = n6 >> 1;
        }
        int n7 = n3 - n2;
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0xFF0000);
        graphics.fillRect(120 - (n5 >> 1) - 4, n7 - 4, n5 + 8, n6 + 8);
        var_a_b.b(graphics, string, 120, n7, 1);
    }

    private static void b(Graphics graphics) {
        int n = 99;
        int n2 = 189;
        graphics.setClip(0, 0, 240, 320);
        for (int j = 0; j < 16; ++j) {
            graphics.setColor(n << 16 | 0 | n2);
            graphics.fillRect(0, 160 + 160 * j / 16, 240, 21);
            graphics.fillRect(0, 160 - 160 * (j + 1) / 16, 240, 21);
            n -= 4;
            n2 -= 8;
        }
    }

    public final void a(Graphics graphics) {
        int n;
        e.b(graphics);
        int n2 = 0;
        if (var_int_a != 3) {
            g g2 = i.var_g_arr_a[0];
            g2.var_a_a.a(graphics, 11, 120, 15, 0, 0, 0);
        }
        switch (var_int_a) {
            case 4: {
                var_a_b.b(graphics, "\n\u0001\u0002" + var_java_lang_String_arr_b[6], 120, 35, 17);
                var_a_b.b(graphics, var_java_lang_String_arr_b[7], 120, 160, 3);
                var_a_b.void_a(var_java_lang_String_arr_b[7]);
                n = 160 + (a.var_int_d >> 1) + 4;
                break;
            }
            case 3: {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_a[var_int_a], 120, 15, 17);
                var_a_b.b(graphics, var_java_lang_String_arr_b[3], 120, 160, 3);
                var_a_b.void_a(var_java_lang_String_arr_b[3]);
                n = 160 + (a.var_int_d >> 1) + 4;
                break;
            }
            default: {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_a[var_int_a], 120, 240, 33);
                var_a_b.b(graphics, var_java_lang_String_arr_b[var_int_a], 120, 242, 17);
                n = 0;
            }
        }
        n2 = n;
        i.var_i_a.void_a();
        if (var_java_lang_String_arr_a[var_int_a] != null) {
            i.var_i_a.void_b();
        }
        e.a(graphics, n2);
        if (i.boolean_a(16388)) {
            e.a(-1);
        } else if (i.boolean_a(65544)) {
            e.a(1);
        } else if (i.boolean_a(32944)) {
            e.a(var_java_lang_String_arr_a[var_int_a]);
        } else if (i.boolean_a(64)) {
            i.var_i_a.void_a(0);
            c = 2;
            i.var_int_W = 0;
        }
        var_a_a.a(graphics, i.boolean_a(16388) ? 2 : 0, var_int_b % var_a_a.int_a(0), 20 + this.d, 160, 0, 0, 0);
        var_a_a.a(graphics, i.boolean_a(65544) ? 3 : 1, var_int_b % var_a_a.int_a(1), 220 - this.d, 160, 0, 0, 0);
        this.d += this.var_boolean_a ? -1 : 1;
        if (this.d > 3 || this.d < 1) {
            this.var_boolean_a = !this.var_boolean_a;
        }
        i.var_int_W = 0;
    }

    public static void b() {
        int n = 0;
        int n2 = var_javax_microedition_lcdui_Image_arr_a.length;
        for (n = 0; n < n2; ++n) {
            e.var_javax_microedition_lcdui_Image_arr_a[n] = null;
        }
        var_javax_microedition_lcdui_Image_arr_a = null;
        n2 = var_java_lang_String_arr_a.length;
        for (n = 0; n < n2; ++n) {
            e.var_java_lang_String_arr_a[n] = null;
        }
        var_java_lang_String_arr_a = null;
        n2 = var_java_lang_String_arr_b.length;
        for (n = 0; n < n2; ++n) {
            e.var_java_lang_String_arr_b[n] = null;
        }
        var_java_lang_String_arr_b = null;
        var_a_b = null;
        var_a_a = null;
        c = 0;
        System.gc();
    }
}