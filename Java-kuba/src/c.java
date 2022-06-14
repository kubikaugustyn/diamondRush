import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

public final class c {
    public static long var_long_a;
    public static String var_java_lang_String_a;
    public static String var_java_lang_String_b;
    public static a[] var_a_arr_a;
    public byte[][] var_byte_arr_arr_a = null;
    public int var_int_a = 0;
    public long var_long_b;
    public byte[] var_byte_arr_a = null;
    public int var_int_b;
    public boolean var_boolean_a = false;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = -1;
    public boolean var_boolean_b = false;
    public i var_i_a = null;
    public final short[] var_short_arr_a = new short[16];
    public int h;

    public c(i i2) {
        this.var_i_a = i2;
    }

    /*
     * Unable to fully structure code
     */
    private void a(Graphics var1_1, byte[] var2_2, int var3_3) {
        if (var2_2 == null) {
            return;
        }
        var13_4 = var2_2[var3_3 + 0];
        switch (var13_4) {
            case 18: {
                if (var2_2[var3_3 + 7] == 0) break;
                var14_5 = (var2_2[var3_3 + 3] & 255) + ((var2_2[var3_3 + 3 + 1] & 255) << 8) + ((var2_2[var3_3 + 3 + 2] & 255) << 16);
                var1_1.setColor(var14_5);
                var1_1.fillRect(0, 0, 240, 320);
                return;
            }
            case 12: {
                var14_6 = this.var_int_b;
                var1_1.setColor(0xFFFFFF);
                if (var14_6 > 5) {
                    var14_6 = 5;
                }
                var15_10 = this.var_i_a.aP * 24;
                var16_11 = this.var_i_a.aQ * 24;
                var17_12 = this.c;
                var18_14 = this.d;
                var1_1.fillRect(((var15_10 - this.var_i_a.var_int_ar) * (5 - var14_6) + var17_12 * var14_6) / 5, ((var16_11 - this.var_i_a.var_int_as) * (5 - var14_6) + var18_14 * var14_6) / 5, 102 * var14_6 / 5, 38 * var14_6 / 5);
                return;
            }
            case 1: {
                var14_7 = this.var_int_b;
                var4_16 = (short)i.a(var2_2, var3_3 + 2);
                var5_19 = (short)i.a(var2_2, var3_3 + 4);
                var10_22 = (short)i.a(var2_2, var3_3 + 6);
                var6_25 = (short)i.a(var2_2, var3_3 + 8);
                var7_28 = (short)i.a(var2_2, var3_3 + 10);
                if (var6_25 == 10000) {
                    var6_25 = (short)this.var_i_a.var_int_at;
                }
                if (var7_28 == 10000) {
                    var7_28 = (short)this.var_i_a.var_int_au;
                }
                if (var14_7 > var10_22) {
                    var14_7 = var10_22;
                }
                var4_16 = (short)(var4_16 - 108);
                var5_19 = (short)(var5_19 - 108);
                this.var_i_a.var_int_at = (short)((var4_16 * var14_7 + var6_25 * (var10_22 - var14_7)) / var10_22);
                this.var_i_a.var_int_au = (short)((var5_19 * var14_7 + var7_28 * (var10_22 - var14_7)) / var10_22);
                var19_31 = this.var_i_a.var_int_av * 24 - 240;
                var20_32 = this.var_i_a.var_int_aw * 24 - 320 + 80;
                if (this.var_i_a.var_int_at > var19_31) {
                    v0 = this.var_i_a;
                    v1 = var19_31;
                } else if (this.var_i_a.var_int_at < 0) {
                    v0 = this.var_i_a;
                    v1 = v0.var_int_at = 0;
                }
                if (this.var_i_a.var_int_au <= var20_32) ** GOTO lbl52
                v2 = this.var_i_a;
                v3 = var20_32;
                ** GOTO lbl55
lbl52:
                // 1 sources

                if (this.var_i_a.var_int_au >= 0) ** GOTO lbl56
                v2 = this.var_i_a;
                v3 = 0;
lbl55:
                // 2 sources

                v2.var_int_au = v3;
lbl56:
                // 2 sources

                this.var_i_a.var_int_ar = this.var_i_a.var_int_at;
                this.var_i_a.var_int_as = this.var_i_a.var_int_au;
                if (this.var_i_a.var_int_ar > var19_31) {
                    this.var_i_a.var_int_ar -= var19_31;
                }
                if (this.var_i_a.var_int_as > var20_32) {
                    this.var_i_a.var_int_as = var20_32;
                    return;
                }
                if (this.var_i_a.var_int_as >= 0) break;
                return;
            }
            case 13: {
                var14_8 = this.var_int_b;
                var4_17 = (short)i.a(var2_2, var3_3 + 2);
                var5_20 = (short)i.a(var2_2, var3_3 + 4);
                var10_23 = (short)i.a(var2_2, var3_3 + 6);
                var6_26 = (short)i.a(var2_2, var3_3 + 8);
                var7_29 = (short)i.a(var2_2, var3_3 + 10);
                if (var14_8 > var10_23) {
                    var14_8 = var10_23;
                }
                var17_13 = (short)((var4_17 * var14_8 + var6_26 * (var10_23 - var14_8)) / var10_23);
                var18_15 = (short)((var5_20 * var14_8 + var7_29 * (var10_23 - var14_8)) / var10_23);
                if (var13_4 != 13) break;
                this.c = var17_13;
                this.d = var18_15;
                return;
            }
            case 4: {
                var14_9 = this.var_int_b;
                var6_27 = (short)i.a(var2_2, var3_3 + 2);
                var7_30 = (short)i.a(var2_2, var3_3 + 4);
                var4_18 = (short)i.a(var2_2, var3_3 + 6);
                var5_21 = (short)i.a(var2_2, var3_3 + 6);
                var10_24 = (short)i.a(var2_2, var3_3 + 14);
                if (var14_9 > var10_24) {
                    var14_9 = var10_24;
                }
                var8_33 = (short)((var4_18 * var14_9 + var6_27 * (var10_24 - var14_9)) / var10_24);
                var9_35 = (short)((var5_21 * var14_9 + var7_30 * (var10_24 - var14_9)) / var10_24);
                var11_37 = (short)i.a(var2_2, var3_3 + 10);
                var12_38 = (short)i.a(var2_2, var3_3 + 12);
                c.var_a_arr_a[var11_37].a(var1_1, var12_38, var8_33, var9_35, 0, 0, 0);
                return;
            }
            case 27: {
                i.var_a_arr_a[41].var_int_e = 2;
                var21_39 = var2_2[var3_3 + 6] & 255;
                i.a(var1_1, 6, 229, 226, 35, 73, 1, i.a(i.var_a_arr_a[41], i.var_java_lang_String_arr_a[70], 0) + 10, 15);
                var22_41 = null;
                try {
                    var22_41 = new String(var2_2, var3_3 + 8, (int)((short)i.a(var2_2, var3_3 + 2)), "ISO-8859-1");
                }
                catch (Exception v4) {}
                this.a(var22_41, 196);
                this.a(var1_1, var22_41, 22, 231, var21_39, var21_39 + 2);
                i.var_a_arr_a[41].a(var1_1, i.var_java_lang_String_arr_a[70], 19, 211, 20);
                if (i.aO / 2 % 4 >= 2) break;
                var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_b[0][9], 223, 220, 17);
                return;
            }
            case 2: {
                i.var_a_arr_a[41].var_int_e = 2;
                var9_36 = (short)i.a(var2_2, var3_3 + 6);
                var8_34 = i.a(var2_2, var3_3 + 4);
                if (var8_34 == 10000) {
                    var8_34 = -240;
                }
                var23_43 = var2_2[var3_3 + 8] & 255;
                var21_40 = var2_2[var3_3 + 9] & 255;
                var24_44 = var23_43 * i.a(i.var_a_arr_a[41]) + 4 - 2;
                i.a(var1_1, var8_34, var9_36, 226, var24_44, 73, 0);
                var22_42 = null;
                try {
                    var22_42 = new String(var2_2, var3_3 + 11, (int)((short)i.a(var2_2, var3_3 + 2)), "ISO-8859-1");
                }
                catch (Exception v5) {}
                this.a(var22_42, 222);
                this.a(var1_1, var22_42, var8_34 + 2, var9_36 + 2, var21_40, var21_40 + var23_43);
                if (i.aO / 2 % 4 < 2) {
                    var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_b[0][9], var8_34 + 226 - 10, var9_36 + var24_44 - 5, 17);
                }
                var1_1.setClip(0, 0, 240, 320);
            }
        }
    }

    private void a(byte[] byArray, int n) {
        short s = byArray[n + 0];
        switch (s) {
            case 7: {
                byArray[n + 1] = 1;
                return;
            }
            case 27: {
                if (i.var_boolean_D) {
                    return;
                }
                String string = null;
                try {
                    string = new String(byArray, n + 8, (int)((short)i.a(byArray, n + 2)), "ISO-8859-1");
                }
                catch (Exception exception) {}
                this.a(string, 196);
                short s2 = (short)(byArray[n + 6] & 0xFF);
                boolean bl = false;
                if (s2 + 2 >= this.h) {
                    byArray[n + 7] = 1;
                    return;
                }
                byArray[n + 6] = (byte)(s2 + 2);
                return;
            }
            case 2: {
                byte by;
                int n2;
                byte[] byArray2;
                String string = null;
                try {
                    string = new String(byArray, n + 11, (int)((short)i.a(byArray, n + 2)), "ISO-8859-1");
                }
                catch (Exception exception) {}
                this.a(string, 222);
                short s3 = (short)(byArray[n + 9] & 0xFF);
                short s4 = (short)(byArray[n + 8] & 0xFF);
                if (s3 + s4 >= this.h) {
                    byArray2 = byArray;
                    n2 = n + 10;
                    by = 1;
                } else {
                    byArray2 = byArray;
                    n2 = n + 9;
                    by = (byte)(s3 + s4);
                }
                byArray2[n2] = by;
            }
        }
    }

    public final void void_a() {
        if (this.var_byte_arr_a == null) {
            return;
        }
        if (Math.abs(this.var_long_b - System.currentTimeMillis()) < var_long_a) {
            return;
        }
        if (this.var_byte_arr_a[0] == 0) {
            int n = this.var_byte_arr_a[1];
            int n2 = 2 + n * 4;
            for (int j = 0; j < n; ++j) {
                int n3 = i.b(this.var_byte_arr_a, 2 + j * 4);
                this.a(this.var_byte_arr_a, n2);
                n2 += n3;
            }
        } else {
            this.a(this.var_byte_arr_a, 0);
        }
    }

    public final void a(Graphics graphics) {
        if (this.var_boolean_b) {
            return;
        }
        switch (this.byte_a()) {
            case 25: 
            case 26: {
                if (this.var_byte_arr_arr_a != null && this.var_int_a < this.var_byte_arr_arr_a.length) break;
                return;
            }
            default: {
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 42);
                graphics.fillRect(0, 278, 240, 42);
                i.var_a_arr_a[41].a(graphics, i.var_java_lang_String_arr_a[53], 5, 315, 36);
            }
        }
        if (this.var_byte_arr_a[0] == 0) {
            int n = this.var_byte_arr_a[1];
            int n2 = 2 + n * 4;
            for (int j = 0; j < n; ++j) {
                int n3 = i.b(this.var_byte_arr_a, 2 + j * 4);
                this.a(graphics, this.var_byte_arr_a, n2);
                n2 += n3;
            }
        } else {
            this.a(graphics, this.var_byte_arr_a, 0);
        }
        if (this.var_boolean_a) {
            graphics.setColor(0);
            graphics.fillRect(this.c - 3, this.d - 3, 109, 45);
            var_a_arr_a[this.f].a(graphics, 0, this.var_int_b % var_a_arr_a[this.f].int_a(0), this.c, this.d, 0, 0, 0);
            var_a_arr_a[0].a(graphics, this.e, this.c + 0, this.d, 0, 0, 0);
            if (this.g >= 0) {
                var_a_arr_a[1].a(graphics, this.g, this.c + 90, this.d + -6, 0, 0, 0);
            }
        }
    }

    public final byte[] byte_arr_a() {
        this.a(this.var_byte_arr_arr_a);
        this.var_boolean_a = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.var_boolean_b = false;
        this.var_int_a = 0;
        this.var_long_b = System.currentTimeMillis();
        return this.byte_arr_b();
    }

    /*
     * Unable to fully structure code
     */
    private void b(byte[] var1_1, int var2_2) {
        block5: {
            if (var1_1[var2_2 + 0] == 0) break block5;
            var1_1[var2_2 + 1] = 0;
            switch (var1_1[var2_2 + 0]) {
                case 27: {
                    var1_1[var2_2 + 6] = 0;
                    c.a(var1_1, var2_2 + 4, (short)-240);
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = 7;
                    ** GOTO lbl17
                }
                case 2: {
                    var1_1[var2_2 + 9] = 0;
                    c.a(var1_1, var2_2 + 4, (short)-240);
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = 10;
lbl17:
                    // 2 sources

                    v0[v1 + v2] = 0;
                }
            }
            return;
        }
        var3_3 = var1_1[var2_2 + 1];
        var4_4 = var2_2 + 2 + var3_3 * 4;
        for (var5_5 = 0; var5_5 < var3_3; ++var5_5) {
            var6_6 = i.b(var1_1, var2_2 + 2 + var5_5 * 4);
            this.b(var1_1, var4_4);
            var4_4 += var6_6;
        }
    }

    private void a(byte[][] byArray) {
        for (int j = 0; j < byArray.length; ++j) {
            this.b(byArray[j], 0);
        }
    }

    public final byte[] byte_arr_b() {
        byte[] byArray;
        c c2;
        this.var_int_b = 0;
        if (this.var_byte_arr_arr_a == null || this.var_int_a >= this.var_byte_arr_arr_a.length) {
            c2 = this;
            byArray = null;
        } else {
            c2 = this;
            byArray = this.var_byte_arr_arr_a[this.var_int_a++];
        }
        c2.var_byte_arr_a = byArray;
        return this.var_byte_arr_a;
    }

    public final void void_b() {
        if (this.var_byte_arr_a[0] == 0) {
            int n = this.var_byte_arr_a[1];
            int n2 = 2 + n * 4;
            for (int j = 0; j < n; ++j) {
                int n3 = i.b(this.var_byte_arr_a, 2 + j * 4);
                this.c(this.var_byte_arr_a, n2);
                n2 += n3;
            }
        } else {
            this.c(this.var_byte_arr_a, 0);
        }
        ++this.var_int_b;
    }

    private void c(byte[] byArray, int n) {
        short s = byArray[n + 0];
        if (this.var_boolean_b) {
            switch (s) {
                case 5: 
                case 9: 
                case 10: 
                case 25: 
                case 26: {
                    break;
                }
                default: {
                    byArray[n + 1] = 1;
                    return;
                }
            }
        }
        switch (s) {
            case 16: 
            case 17: 
            case 18: {
                boolean bl;
                if (this.var_int_b % 2 == 0) {
                    return;
                }
                int n2 = n + (s == 18 ? 2 : 4);
                byte by = byArray[n2];
                int n3 = -1;
                int n4 = n + (s == 18 ? 7 : 5);
                boolean bl2 = bl = byArray[n4] != 0;
                if (s != 18) {
                    n3 = (short)i.a(byArray, n + 2);
                }
                if (bl) {
                    bl = false;
                    this.g = -1;
                    if ((by = (byte)(by - 1)) == 0) {
                        byArray[n + 1] = 1;
                        if (s != 18) {
                            this.g = s == 16 ? n3 : -1;
                        }
                    }
                } else if (by > 0) {
                    bl = true;
                    if (s != 18) {
                        this.g = n3;
                    }
                } else {
                    byArray[n + 1] = 1;
                }
                byArray[n4] = (byte)(bl ? 1 : 0);
                byArray[n2] = by;
                return;
            }
            case 14: 
            case 15: {
                this.var_boolean_a = s == 14;
                byArray[n + 1] = 1;
                return;
            }
            case 12: {
                short s2 = (short)i.a(byArray, n + 2);
                short s3 = (short)i.a(byArray, n + 4);
                this.c = s2;
                this.d = s3;
                if (this.var_int_b <= 5) break;
                byArray[n + 1] = 1;
                this.var_boolean_a = true;
                return;
            }
            case 11: {
                this.f = (short)i.a(byArray, n + 4);
                this.e = (short)i.a(byArray, n + 2);
                byArray[n + 1] = 1;
                return;
            }
            case 10: {
                byte by = byArray[n + 2];
                if (this.var_int_b == 0) {
                    this.var_i_a.aS = this.var_i_a.aS & 0xFFFFFFF8 | by;
                    this.var_i_a.var_byte_j = by;
                } else if (this.var_i_a.aR <= 0) {
                    this.var_i_a.var_byte_j = 0;
                    byArray[n + 1] = 1;
                }
                this.var_i_a.void_c();
                return;
            }
            case 13: {
                short s4;
                if ((short)i.a(byArray, n + 8) == 10000) {
                    c.a(byArray, n + 8, (short)this.c);
                }
                if ((short)i.a(byArray, n + 10) == 10000) {
                    c.a(byArray, n + 10, (short)this.d);
                }
                if (this.var_int_b <= (s4 = (short)i.a(byArray, n + 6))) break;
                byArray[n + 1] = 1;
                return;
            }
            case 1: {
                short s5;
                if ((short)i.a(byArray, n + 8) == 10000) {
                    c.a(byArray, n + 8, (short)this.var_i_a.var_int_at);
                }
                if ((short)i.a(byArray, n + 10) == 10000) {
                    c.a(byArray, n + 10, (short)this.var_i_a.var_int_au);
                }
                if (this.var_int_b <= (s5 = (short)i.a(byArray, n + 6))) break;
                byArray[n + 1] = 1;
                return;
            }
            case 4: {
                short s6 = (short)i.a(byArray, n + 14);
                if (this.var_int_b <= s6) break;
                byArray[n + 1] = 1;
                return;
            }
            case 6: {
                if (this.var_int_b <= i.b(byArray, n + 2)) break;
                byArray[n + 1] = 1;
                return;
            }
            case 25: {
                short s7 = (short)i.a(byArray, n + 2);
                short s8 = (short)i.a(byArray, n + 4);
                byte by = byArray[n + 6];
                byte by2 = byArray[n + 7];
                i.var_int_arr_arr_a[s7][s8] = by2 << 8 | by;
                byArray[n + 1] = 1;
                return;
            }
            case 26: {
                int n5;
                short s9 = (short)i.a(byArray, n + 2);
                short s10 = (short)i.a(byArray, n + 4);
                i.var_int_arr_arr_b[s9][s10] = n5 = i.b(byArray, n + 6);
                byArray[n + 1] = 1;
                return;
            }
            case 5: {
                i.a((short)i.a(byArray, n + 2), (short)i.a(byArray, n + 4), byArray[n + 6], 0);
                byArray[n + 1] = 1;
                return;
            }
            case 8: {
                return;
            }
            case 9: {
                i.a((short)i.a(byArray, n + 2), (short)i.a(byArray, n + 4), (byte)0, (int)((short)i.a(byArray, n + 6)));
                byArray[n + 1] = 1;
                return;
            }
            case 27: {
                if (byArray[n + 7] == 0) break;
                byArray[n + 1] = 1;
                return;
            }
            case 2: {
                short s11 = (short)i.a(byArray, n + 4);
                if (s11 == 10000) {
                    s11 = -226;
                }
                s11 = (short)(s11 + 30);
                if (byArray[n + 10] == 0) {
                    if (s11 > 7) {
                        s11 = 7;
                    }
                } else if (s11 > 240) {
                    byArray[n + 1] = 1;
                }
                c.a(byArray, n + 4, s11);
            }
        }
    }

    public final boolean boolean_a() {
        boolean bl = true;
        if (this.var_byte_arr_a[0] == 0) {
            int n = this.var_byte_arr_a[1];
            int n2 = 2 + n * 4;
            for (int j = 0; j < n; ++j) {
                int n3 = i.b(this.var_byte_arr_a, 2 + j * 4);
                if (bl = bl && this.var_byte_arr_a[n2 + 1] == 1) {
                    n2 += n3;
                    continue;
                }
                break;
            }
        } else {
            bl = this.var_byte_arr_a[1] == 1;
        }
        return bl;
    }

    private byte byte_a() {
        if (this.var_byte_arr_a == null) {
            return -1;
        }
        return this.var_byte_arr_a[0];
    }

    public final void a(int n) {
        try {
            this.var_i_a.getClass();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i.byte_arr_a(var_java_lang_String_b, 0));
            byte[] byArray = new byte[4];
            byteArrayInputStream.read(byArray, 0, 2);
            boolean bl = false;
            do {
                int n2;
                byteArrayInputStream.read(byArray, 0, 2);
                short s = (short)i.a(byArray, 0);
                if (s == n) {
                    int n3;
                    short s2;
                    int n4;
                    int n5;
                    int n6;
                    Object object;
                    int n7;
                    int n8;
                    Object object2;
                    byteArrayInputStream.read(byArray, 0, 2);
                    n2 = i.a(byArray, 0);
                    byteArrayInputStream.read(byArray, 0, 4);
                    int n9 = i.b(byArray, 0);
                    byArray = new byte[n9];
                    byteArrayInputStream.read(byArray);
                    byteArrayInputStream.close();
                    byteArrayInputStream = null;
                    bl = true;
                    int n10 = 0;
                    int n11 = i.a(byArray, 0);
                    n10 += 2;
                    if (n11 != 0) {
                        object2 = new short[n11];
                        for (n8 = 0; n8 < n11; ++n8) {
                            object2[n8] = (short)i.a(byArray, n10);
                            n10 += 2;
                        }
                        for (n7 = 1; n7 < n11; ++n7) {
                            int n12;
                            n8 = object2[n7];
                            int n13 = n12 = n7;
                            while (n13 > 0 && object2[n12 - 1] > n8) {
                                object2[n12] = object2[n12 - 1];
                                n13 = n12 - 1;
                            }
                            object2[n12] = n8;
                        }
                        InputStream inputStream = this.getClass().getResourceAsStream(var_java_lang_String_a);
                        object = new byte[4];
                        inputStream.read((byte[])object, 0, 2);
                        n6 = (short)i.a(object, 0);
                        if (var_a_arr_a == null) {
                            var_a_arr_a = new a[n6];
                        }
                        for (n5 = 0; n5 < n11; ++n5) {
                            n4 = object2[n5];
                            boolean bl2 = false;
                            while (!bl2) {
                                inputStream.read((byte[])object, 0, 2);
                                s2 = (short)i.a(object, 0);
                                if (n4 == s2) {
                                    bl2 = true;
                                }
                                inputStream.read((byte[])object, 0, 4);
                                n3 = i.b(object, 0);
                                if (!bl2 && var_a_arr_a[n4] != null) {
                                    inputStream.skip(n3);
                                    continue;
                                }
                                object = new byte[n3];
                                inputStream.read((byte[])object);
                                c.var_a_arr_a[n4] = new a();
                                var_a_arr_a[n4].a((byte[])object, 0);
                                var_a_arr_a[n4].a(0, 0, -1, -1);
                                c.var_a_arr_a[n4].var_byte_arr_g = null;
                            }
                        }
                        inputStream.close();
                    }
                    object2 = new byte[n2][];
                    n8 = 0;
                    Object object3 = null;
                    n7 = 0;
                    object = null;
                    n6 = 0;
                    for (n5 = 0; n5 < n2 || n6 != 0; ++n5) {
                        int n14;
                        if (n6 == 0) {
                            object = object2;
                        } else {
                            object = object3;
                            --n6;
                            --n5;
                        }
                        n4 = byArray[n10++] & 0xFF;
                        byte[] byArray2 = null;
                        switch (n4) {
                            case 18: {
                                s2 = (short)(byArray[n10++] & 0xFF);
                                n3 = (byArray[n10++] & 0xFF) + ((byArray[n10++] & 0xFF) << 8) + ((byArray[n10++] & 0xFF) << 16);
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, s2);
                                c.a(byArray2, 3, n3);
                                byArray2[7] = 0;
                                break;
                            }
                            case 16: 
                            case 17: {
                                n14 = i.a(byArray, n10);
                                n10 += 2;
                                s2 = (short)(byArray[n10++] & 0xFF);
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, (short)n14);
                                c.a(byArray2, 4, s2);
                                byArray2[5] = 0;
                                break;
                            }
                            case 11: {
                                n14 = (short)i.a(byArray, n10);
                                short s3 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, (short)n14);
                                c.a(byArray2, 4, s3);
                                break;
                            }
                            case 12: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                break;
                            }
                            case 13: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                short s6 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[12];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                c.a(byArray2, 6, s6);
                                c.a(byArray2, 8, (short)10000);
                                c.a(byArray2, 10, (short)10000);
                                break;
                            }
                            case 14: 
                            case 15: {
                                byte[] byArray3 = new byte[2];
                                break;
                            }
                            case 4: {
                                short s7 = (short)i.a(byArray, n10);
                                short s8 = (short)i.a(byArray, n10 += 2);
                                short s9 = (short)i.a(byArray, n10 += 2);
                                short s10 = (short)i.a(byArray, n10 += 2);
                                short s11 = (short)i.a(byArray, n10 += 2);
                                n14 = (short)i.a(byArray, n10 += 2);
                                short s6 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[16];
                                c.a(byArray2, 2, s7);
                                c.a(byArray2, 4, s8);
                                c.a(byArray2, 6, s9);
                                c.a(byArray2, 8, s10);
                                c.a(byArray2, 10, s11);
                                c.a(byArray2, 12, (short)n14);
                                c.a(byArray2, 14, s6);
                                break;
                            }
                            case 7: {
                                byte[] byArray3 = new byte[2];
                                break;
                            }
                            case 1: {
                                short s4 = (short)(i.a(byArray, n10) * 24);
                                short s5 = (short)(i.a(byArray, n10 += 2) * 24);
                                short s6 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[12];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                c.a(byArray2, 6, s6);
                                c.a(byArray2, 8, (short)10000);
                                c.a(byArray2, 10, (short)10000);
                                break;
                            }
                            case 6: {
                                int n15 = i.b(byArray, n10);
                                n10 += 4;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, n15);
                                break;
                            }
                            case 26: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                int n16 = i.b(byArray, n10 += 2);
                                n10 += 4;
                                byArray2 = new byte[10];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                c.a(byArray2, 6, n16);
                                break;
                            }
                            case 25: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                short s12 = (short)(byArray[n10++] & 0xFF);
                                short s13 = (short)(byArray[n10++] & 0xFF);
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                byArray2[6] = (byte)s12;
                                byArray2[7] = (byte)s13;
                                break;
                            }
                            case 5: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                short s12 = (short)(byArray[n10++] & 0xFF);
                                byArray2 = new byte[7];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                byArray2[6] = (byte)s12;
                                break;
                            }
                            case 27: {
                                short s14 = (short)i.a(byArray, n10);
                                n10 += 2;
                                byArray2 = new byte[8 + s14];
                                c.a(byArray2, 2, s14);
                                c.a(byArray2, 4, (short)10000);
                                byArray2[6] = 0;
                                byArray2[7] = 0;
                                System.arraycopy(byArray, n10, byArray2, 8, s14);
                                n10 += s14;
                                break;
                            }
                            case 2: {
                                short s15 = (short)(byArray[n10++] & 0xFF);
                                short s5 = (short)i.a(byArray, n10);
                                short s14 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[11 + s14];
                                c.a(byArray2, 2, s14);
                                c.a(byArray2, 4, (short)10000);
                                c.a(byArray2, 6, s5);
                                byArray2[8] = (byte)s15;
                                byArray2[9] = 0;
                                byArray2[10] = 0;
                                System.arraycopy(byArray, n10, byArray2, 11, s14);
                                n10 += s14;
                                break;
                            }
                            case 9: {
                                short s4 = (short)i.a(byArray, n10);
                                short s5 = (short)i.a(byArray, n10 += 2);
                                short s16 = (short)i.a(byArray, n10 += 2);
                                n10 += 2;
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, s4);
                                c.a(byArray2, 4, s5);
                                c.a(byArray2, 6, s16);
                                break;
                            }
                            case 10: {
                                short s17 = (short)(byArray[n10++] & 0xFF);
                                byte[] byArray4 = new byte[3];
                                byArray2 = byArray4;
                                byArray4[2] = (byte)s17;
                                break;
                            }
                            case 0: {
                                short s18 = (short)(byArray[n10++] & 0xFF);
                                n6 = s18;
                                object3 = new byte[s18][];
                                byte[] byArray3 = byArray2 = null;
                            }
                        }
                        if (byArray2 != null) {
                            byArray2[0] = (byte)(n4 & 0xFF);
                            byArray2[1] = 0;
                            if (object == object3) {
                                object[n7] = (byte)byArray2;
                                ++n7;
                            } else {
                                object[n8] = (byte)byArray2;
                                ++n8;
                            }
                        }
                        if (object != object3 || n6 != 0) continue;
                        s2 = 0;
                        for (n3 = 0; n3 < ((byte[][])object3).length; ++n3) {
                            s2 += object3[n3].length;
                        }
                        byte[] byArray5 = new byte[2 + ((byte[][])object3).length * 4 + s2];
                        byArray2 = byArray5;
                        byArray5[0] = 0;
                        byArray2[1] = (byte)((byte[][])object3).length;
                        n3 = 2 + ((byte[][])object3).length * 4;
                        for (n14 = 0; n14 < ((byte[][])object3).length; ++n14) {
                            c.a(byArray2, 2 + n14 * 4, object3[n14].length);
                            System.arraycopy(object3[n14], 0, byArray2, n3, object3[n14].length);
                            n3 += object3[n14].length;
                        }
                        object2[n8] = (short)byArray2;
                        n7 = 0;
                        object3 = null;
                        ++n8;
                    }
                    this.var_byte_arr_arr_a = (byte[][])object2;
                    continue;
                }
                byteArrayInputStream.skip(2L);
                byteArrayInputStream.read(byArray, 0, 4);
                n2 = i.b(byArray, 0);
                byteArrayInputStream.skip(n2);
            } while (!bl);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void a(Graphics graphics, String string, int n, int n2, int n3, int n4) {
        int n5 = i.var_a_arr_a[41].var_int_e + (i.var_a_arr_a[41].var_byte_arr_a[1] & 0xFF);
        if (n4 > this.h) {
            n4 = this.h;
        }
        for (int j = n3; j < n4; ++j) {
            a.var_int_f = j > 0 ? this.var_short_arr_a[j - 1] + 1 : 0;
            a.var_int_g = this.var_short_arr_a[j];
            i.var_a_arr_a[41].a(graphics, string, n, n2 + (j - n3) * n5, 4);
        }
        a.var_int_f = -1;
        a.var_int_g = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, int n) {
        this.h = 0;
        int n2 = string.length();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            block13: {
                block12: {
                    block9: {
                        char c2;
                        block11: {
                            block10: {
                                int n6;
                                block8: {
                                    if (n5 >= n2) {
                                        this.var_short_arr_a[this.h++] = (short)n2;
                                        return;
                                    }
                                    c2 = string.charAt(n5);
                                    if (c2 <= ' ') break block8;
                                    int n7 = a.h[c2] & 0xFF;
                                    n6 = (i.var_a_arr_a[41].var_byte_arr_d[n7 << 2] & 0xFF) << 1;
                                    n3 += (i.var_a_arr_a[41].var_byte_arr_a[n6] & 0xFF) - i.var_a_arr_a[41].var_byte_arr_d[(n7 << 2) + 1] + i.var_a_arr_a[41].var_byte_arr_d[1];
                                    break block9;
                                }
                                if (c2 != ' ' || n5 + 1 >= n2 || string.charAt(n5 + 1) != '?' && string.charAt(n5 + 1) != '!' && string.charAt(n5 + 1) != ':') break block10;
                                n3 += (i.var_a_arr_a[41].var_byte_arr_a[0] & 0xFF) + i.var_a_arr_a[41].var_byte_arr_d[1];
                                n6 = a.h[string.charAt(n5 + 1)] & 0xFF;
                                int n8 = (i.var_a_arr_a[41].var_byte_arr_d[n6 << 2] & 0xFF) << 1;
                                n3 += (i.var_a_arr_a[41].var_byte_arr_a[n8] & 0xFF) - i.var_a_arr_a[41].var_byte_arr_d[(n6 << 2) + 1] + i.var_a_arr_a[41].var_byte_arr_d[1];
                                break block9;
                            }
                            if (c2 != ' ') break block11;
                            n3 += (i.var_a_arr_a[41].var_byte_arr_a[0] & 0xFF) + i.var_a_arr_a[41].var_byte_arr_d[1];
                            break block12;
                        }
                        if (c2 == '\n') {
                            n3 = 0;
                            this.var_short_arr_a[this.h++] = (short)n5;
                        }
                        break block13;
                    }
                    if (n3 > n) {
                        n5 = n4 - 1;
                        this.var_short_arr_a[this.h++] = (short)n5;
                        n3 = 0;
                    }
                    if (string.charAt(n5) != ' ') break block13;
                }
                n4 = n5 + 1;
            }
            ++n5;
        }
    }

    private static void a(byte[] byArray, int n, short s) {
        byArray[n] = (byte)(s & 0xFF);
        byArray[n + 1] = (byte)(s >> 8 & 0xFF);
    }

    private static void a(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 & 0xFF);
        byArray[n + 1] = (byte)(n2 >> 8 & 0xFF);
        byArray[n + 2] = (byte)(n2 >> 16 & 0xFF);
        byArray[n + 3] = (byte)(n2 >> 24 & 0xFF);
    }

    static {
        var_long_a = 1000L;
        var_java_lang_String_a = "/demoSpr.bin";
        var_java_lang_String_b = "/demo.f";
        var_a_arr_a = null;
    }
}