import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f
{
    private static int[] integer_arr_a;
    private byte[] byte_arr_f;
    private byte[] byte_arr_g;
    private short[] short_arr_b;
    public byte[] byte_arr_a;
    private byte[] byte_arr_h;
    public byte[] byte_arr_b;
    public short[] short_arr_a;
    public byte[] byte_arr_c;
    private int[][] integer_arr_arr_a;
    private int integer_b;
    public int integer_a;
    private boolean boolean_a;
    private short short_a;
    public byte[] byte_arr_d;
    private short[] short_arr_c;
    public Image[][] image_arr_arr_a;
    public static byte[] byte_arr_e;
    
    public final void void_a(final byte[] array, int n) {
        try {
            System.gc();
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            final int n2 = 6;
            ++n;
            final int n3 = array[n2] & 0xFF;
            final int n4 = 7;
            ++n;
            final short n5;
            if ((n5 = (short)(n3 + ((array[n4] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, 8, this.byte_arr_f = new byte[n5 << 1], 0, this.byte_arr_f.length);
                n = 8 + this.byte_arr_f.length;
            }
            final short n6;
            if ((n6 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.byte_arr_h = new byte[n6 << 2], 0, this.byte_arr_h.length);
                n += this.byte_arr_h.length;
            }
            final short n7;
            if ((n7 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.byte_arr_g = new byte[n7];
                this.short_arr_b = new short[n7];
                for (short n8 = 0; n8 < n7; ++n8) {
                    this.byte_arr_g[n8] = array[n++];
                    ++n;
                    this.short_arr_b[n8] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
                final int n9 = n7 << 2;
                this.byte_arr_a = new byte[n9];
                for (int i = 0; i < n9; ++i) {
                    this.byte_arr_a[i] = array[n++];
                }
            }
            final short n10;
            if ((n10 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.byte_arr_c = new byte[n10 * 5], 0, this.byte_arr_c.length);
                n += this.byte_arr_c.length;
            }
            final short n11;
            if ((n11 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.byte_arr_b = new byte[n11];
                this.short_arr_a = new short[n11];
                for (short n12 = 0; n12 < n11; ++n12) {
                    this.byte_arr_b[n12] = array[n++];
                    ++n;
                    this.short_arr_a[n12] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
            }
            if (n5 <= 0) {
                System.gc();
                return;
            }
            final short n13 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            this.integer_b = (array[n++] & 0xFF);
            final int n14 = array[n++] & 0xFF;
            this.integer_arr_arr_a = new int[16][];
            for (int j = 0; j < this.integer_b; ++j) {
                this.integer_arr_arr_a[j] = new int[n14];
                switch (n13) {
                    case -30584: {
                        for (int k = 0; k < n14; ++k) {
                            final int n15;
                            if (((n15 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8) + ((array[n++] & 0xFF) << 16) + ((array[n++] & 0xFF) << 24)) & 0xFF000000) != 0xFF000000) {
                                this.boolean_a = true;
                            }
                            this.integer_arr_arr_a[j][k] = n15;
                        }
                        break;
                    }
                    case 17476: {
                        for (int l = 0; l < n14; ++l) {
                            final int n16;
                            if (((n16 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8)) & 0xF000) != 0xF000) {
                                this.boolean_a = true;
                            }
                            this.integer_arr_arr_a[j][l] = ((n16 & 0xF000) << 16 | (n16 & 0xF000) << 12 | (n16 & 0xF00) << 12 | (n16 & 0xF00) << 8 | (n16 & 0xF0) << 8 | (n16 & 0xF0) << 4 | (n16 & 0xF) << 4 | (n16 & 0xF));
                        }
                        break;
                    }
                    case 21781: {
                        for (int n17 = 0; n17 < n14; ++n17) {
                            final int n18 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            int n19 = -16777216;
                            if ((n18 & 0x8000) != 0x8000) {
                                n19 = 0;
                                this.boolean_a = true;
                            }
                            this.integer_arr_arr_a[j][n17] = (n19 | (n18 & 0x7C00) << 9 | (n18 & 0x3E0) << 6 | (n18 & 0x1F) << 3);
                        }
                        break;
                    }
                    case 25861: {
                        for (int n20 = 0; n20 < n14; ++n20) {
                            final int n21 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            int n22 = -16777216;
                            if (n21 == 63519) {
                                n22 = 0;
                                this.boolean_a = true;
                            }
                            this.integer_arr_arr_a[j][n20] = (n22 | (n21 & 0xF800) << 8 | (n21 & 0x7E0) << 5 | (n21 & 0x1F) << 3);
                        }
                        break;
                    }
                }
            }
            this.short_a = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            if (n5 > 0) {
                this.short_arr_c = new short[n5];
                int n23 = 0;
                int n24 = n;
                for (short n25 = 0; n25 < n5; ++n25) {
                    final short n26 = (short)((array[n24++] & 0xFF) + ((array[n24++] & 0xFF) << 8));
                    this.short_arr_c[n25] = (short)n23;
                    n24 += n26;
                    n23 += n26;
                }
                this.byte_arr_d = new byte[n23];
                for (short n27 = 0; n27 < n5; ++n27) {
                    final short n28 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                    System.arraycopy(array, n, this.byte_arr_d, this.byte_arr_c[n27] & 0xFFFF, n28);
                    n += n28;
                }
            }
            System.gc();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void void_a(final int a, int a2, int n, int i) {
        if (this.byte_arr_f == null) {
            return;
        }
        if (n == -1) {
            n = (this.byte_arr_f.length >> 1) - 1;
        }
        if (this.image_arr_arr_a == null) {
            this.image_arr_arr_a = new Image[this.integer_b][];
        }
        if (this.image_arr_arr_a[a] == null) {
            this.image_arr_arr_a[a] = new Image[this.byte_arr_f.length >> 1];
        }
        a2 = this.integer_a;
        this.integer_a = a;
        System.gc();
        int n2;
        int n3;
        int n4;
        int[] a3;
        boolean b;
        int n5;
        int j;
        for (i = 0; i <= n; ++i) {
            n2 = i << 1;
            n3 = (this.byte_arr_f[n2] & 0xFF);
            n4 = (this.byte_arr_f[n2 + 1] & 0xFF);
            if (n3 > 0 && n4 > 0 && (a3 = this.integer_arr_a(i)) != null) {
                b = false;
                for (n5 = n3 * n4, j = 0; j < n5; ++j) {
                    if ((a3[j] & 0xFF000000) != 0xFF000000) {
                        b = true;
                        break;
                    }
                }
                this.image_arr_arr_a[a][i] = Image.createRGBImage(a3, n3, n4, b);
            }
        }
        System.gc();
        this.integer_a = a2;
        System.gc();
    }
    
    public final void void_a(int i) {
        if (this.byte_arr_f == null) {
            return;
        }
        if (this.image_arr_arr_a == null) {
            return;
        }
        if (this.image_arr_arr_a[0] == null) {
            return;
        }
        for (i = 0; i < this.image_arr_arr_a[0].length; ++i) {
            this.image_arr_arr_a[0][i] = null;
        }
        this.image_arr_arr_a[0] = null;
        --this.integer_b;
    }
    
    public final String toString() {
        new String();
        int i = 0;
        for (int j = 0; j < this.byte_arr_f.length / 2; ++j) {
            i += 2 * (this.byte_arr_f[j * 2] & 0xFF) * (this.byte_arr_f[j * 2 + 1] & 0xFF);
        }
        return "raw/full: " + this.byte_arr_d.length + "/" + i;
    }
    
    public final int integer_a(final int n, final int n2) {
        return this.c[(this.a[n] + n2) * 5 + 1] & 0xFF;
    }
    
    public final int integer_a(final int n) {
        return this.b[n] & 0xFF;
    }
    
    public final void void_a(final Graphics graphics, int n, int n2, final int n3, final int n4, final int n5, int n6, int n7) {
        n = (this.a[n] + n2) * 5;
        n2 = (this.c[n] & 0xFF);
        if ((n5 & 0x20) != 0x0) {
            n6 = (((n5 & 0x1) != 0x0) ? (0 + this.c[n + 2]) : (0 - this.c[n + 2]));
            n7 = (((n5 & 0x2) != 0x0) ? (0 + this.c[n + 3]) : (0 - this.c[n + 3]));
        }
        this.a(graphics, n2, n3 - n6, n4 - n7, n5 ^ (this.c[n + 4] & 0xF));
    }
    
    public final void void_a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        final int n5 = this.g[n] & 0xFF;
        for (short n6 = 0; n6 < n5; ++n6) {
            final int n7 = this.b[n] + n6 << 2;
            final int n8 = this.h[n7 + 3] & 0xFF;
            final int n9 = this.h[n7] & 0xFF;
            int n10 = ((n4 & 0x1) != 0x0) ? (n2 - this.h[n7 + 1]) : (n2 + this.h[n7 + 1]);
            int n11 = ((n4 & 0x2) != 0x0) ? (n3 - this.h[n7 + 2]) : (n3 + this.h[n7 + 2]);
            if ((n4 & 0x1) != 0x0) {
                n10 -= (this.f[n9 << 1] & 0xFF);
            }
            if ((n4 & 0x2) != 0x0) {
                n11 -= (this.f[(n9 << 1) + 1] & 0xFF);
            }
            this.b(graphics, n9, n10, n11, n4 ^ (n8 & 0xF));
        }
    }
    
    public final void void_b(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n << 1;
        final int n6 = this.f[n5] & 0xFF;
        final int n7 = this.f[n5 + 1] & 0xFF;
        if (n6 <= 0 || n7 <= 0) {
            return;
        }
        Image rgbImage = null;
        if (this.a != null && this.a[this.a] != null) {
            rgbImage = this.a[this.a][n];
        }
        if (rgbImage == null) {
            final int[] a;
            if ((a = this.a(n)) == null) {
                return;
            }
            rgbImage = Image.createRGBImage(a, n6, n7, this.a);
        }
        final int width = rgbImage.getWidth();
        final int height = rgbImage.getHeight();
        Graphics graphics2;
        Image image;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        if ((n4 & 0x1) != 0x0) {
            if ((n4 & 0x2) != 0x0) {
                graphics2 = graphics;
                image = rgbImage;
                n8 = 0;
                n9 = 0;
                n10 = width;
                n11 = height;
                n12 = 3;
            }
            else {
                graphics2 = graphics;
                image = rgbImage;
                n8 = 0;
                n9 = 0;
                n10 = width;
                n11 = height;
                n12 = 2;
            }
        }
        else if ((n4 & 0x2) != 0x0) {
            graphics2 = graphics;
            image = rgbImage;
            n8 = 0;
            n9 = 0;
            n10 = width;
            n11 = height;
            n12 = 1;
        }
        else {
            graphics2 = graphics;
            image = rgbImage;
            n8 = 0;
            n9 = 0;
            n10 = width;
            n11 = height;
            n12 = 0;
        }
        graphics2.drawRegion(image, n8, n9, n10, n11, n12, n2, n3, 0);
    }
    
    private int[] integer_arr_a(int n) {
        if (this.d == null || this.c == null) {
            return null;
        }
        final int n2 = n << 1;
        final int n3 = this.f[n2] & 0xFF;
        final int n4 = this.f[n2 + 1] & 0xFF;
        final int[] a = f.a;
        final int[] array;
        if ((array = this.a[this.a]) == null) {
            return null;
        }
        final byte[] d = this.d;
        n = (this.c[n] & 0xFFFF);
        int i = 0;
        final int n5 = n3 * n4;
        if (this.a == 10225) {
            while (i < n5) {
                int n6;
                if ((n6 = (d[n++] & 0xFF)) > 127) {
                    final int n7 = array[d[n++] & 0xFF];
                    n6 -= 128;
                    while (n6-- > 0) {
                        a[i++] = n7;
                    }
                }
                else {
                    a[i++] = array[n6];
                }
            }
        }
        else if (this.a == 5632) {
            while (i < n5) {
                a[i++] = array[d[n] >> 4 & 0xF];
                a[i++] = array[d[n] & 0xF];
                ++n;
            }
        }
        else if (this.a == 1024) {
            while (i < n5) {
                a[i++] = array[d[n] >> 6 & 0x3];
                a[i++] = array[d[n] >> 4 & 0x3];
                a[i++] = array[d[n] >> 2 & 0x3];
                a[i++] = array[d[n] & 0x3];
                ++n;
            }
        }
        else if (this.a == 512) {
            while (i < n5) {
                a[i++] = array[d[n] >> 7 & 0x1];
                a[i++] = array[d[n] >> 6 & 0x1];
                a[i++] = array[d[n] >> 5 & 0x1];
                a[i++] = array[d[n] >> 4 & 0x1];
                a[i++] = array[d[n] >> 3 & 0x1];
                a[i++] = array[d[n] >> 2 & 0x1];
                a[i++] = array[d[n] >> 1 & 0x1];
                a[i++] = array[d[n] & 0x1];
                ++n;
            }
        }
        else if (this.a == 22018) {
            while (i < n5) {
                a[i++] = array[d[n++] & 0xFF];
            }
        }
        else if (this.a == 22258) {
            while (i < n5) {
                int n8;
                if ((n8 = (d[n++] & 0xFF)) > 127) {
                    n8 -= 128;
                    while (n8-- > 0) {
                        a[i++] = array[d[n++] & 0xFF];
                    }
                }
                else {
                    final int n9 = array[d[n++] & 0xFF];
                    while (n8-- > 0) {
                        a[i++] = n9;
                    }
                }
            }
        }
        return a;
    }
    
    public final void void_a(final boolean b) {
        this.f = null;
        this.g = null;
        this.b = null;
        this.a = null;
        this.h = null;
        this.b = null;
        this.a = null;
        this.c = null;
        if (this.a != null) {
            for (int i = 0; i < this.a.length; ++i) {
                this.a[i] = null;
            }
            this.a = null;
        }
        this.d = null;
        this.c = null;
        if (b && this.a != null) {
            for (int j = 0; j < this.a.length; ++j) {
                if (this.a[j] != null) {
                    for (int k = 0; k < this.a[j].length; ++k) {
                        this.a[j][k] = null;
                    }
                }
            }
            this.a = null;
        }
    }
    
    static {
        f.integer_arr_a = new int[4096];
    }
}
