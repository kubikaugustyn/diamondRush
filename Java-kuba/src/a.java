import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class a
{
    public static int[] a;
    public byte[] a1;
    public byte[] b;
    public short[] a2;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public short[] b1;
    public byte[] f;
    public int[][] a3;
    public int[][] b2;
    public int a4;
    public int b3;
    public boolean a5;
    public short a6;
    public byte[] g;
    public short[] c1;
    public Image[][] a7;
    public static int c2;
    public static int d1;
    public static byte[] h;
    public int e1;
    public static int f1;
    public static int g1;
    
    public a() {
        this.e1 = 0;
    }
    
    public final void a(final byte[] array, int n) {
        try {
            System.gc();
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            final short n2;
            if ((n2 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.a1 = new byte[n2 << 1], 0, this.a.length);
                n += this.a.length;
            }
            final short n3;
            if ((n3 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.d = new byte[n3 << 2], 0, this.d.length);
                n += this.d.length;
            }
            final short n4;
            if ((n4 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.b = new byte[n4];
                this.a2 = new short[n4];
                for (short n5 = 0; n5 < n4; ++n5) {
                    this.b[n5] = array[n++];
                    ++n;
                    this.a[n5] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
                final int n6 = n4 << 2;
                this.c = new byte[n6];
                for (int i = 0; i < n6; ++i) {
                    this.c[i] = array[n++];
                }
            }
            final short n7;
            if ((n7 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.f = new byte[n7 * 5], 0, this.f.length);
                n += this.f.length;
            }
            final short n8;
            if ((n8 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.e = new byte[n8];
                this.b1 = new short[n8];
                for (short n9 = 0; n9 < n8; ++n9) {
                    this.e[n9] = array[n++];
                    ++n;
                    this.b1[n9] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
            }
            if (n2 <= 0) {
                System.gc();
                return;
            }
            final short n10 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            this.a4 = (array[n++] & 0xFF);
            final int n11 = array[n++] & 0xFF;
            this.b2 = new int[16][];
            for (int j = 0; j < this.a4; ++j) {
                this.b2[j] = new int[n11];
                switch (n10) {
                    case -30584: {
                        for (int k = 0; k < n11; ++k) {
                            final int n12;
                            if (((n12 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8) + ((array[n++] & 0xFF) << 16) + ((array[n++] & 0xFF) << 24)) & 0xFF000000) != 0xFF000000) {
                                this.a5 = true;
                            }
                            this.b2[j][k] = n12;
                        }
                        break;
                    }
                    case 17476: {
                        for (int l = 0; l < n11; ++l) {
                            final int n13;
                            if (((n13 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8)) & 0xF000) != 0xF000) {
                                this.a5 = true;
                            }
                            this.b2[j][l] = ((n13 & 0xF000) << 16 | (n13 & 0xF000) << 12 | (n13 & 0xF00) << 12 | (n13 & 0xF00) << 8 | (n13 & 0xF0) << 8 | (n13 & 0xF0) << 4 | (n13 & 0xF) << 4 | (n13 & 0xF));
                        }
                        break;
                    }
                    case 21781: {
                        for (int n14 = 0; n14 < n11; ++n14) {
                            final int n15 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            int n16 = -16777216;
                            if ((n15 & 0x8000) != 0x8000) {
                                n16 = 0;
                                this.a5 = true;
                            }
                            this.b2[j][n14] = (n16 | (n15 & 0x7C00) << 9 | (n15 & 0x3E0) << 6 | (n15 & 0x1F) << 3);
                        }
                        break;
                    }
                    case 25861: {
                        for (int n17 = 0; n17 < n11; ++n17) {
                            final int n18 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            int n19 = -16777216;
                            if (n18 == 63519) {
                                n19 = 0;
                                this.a5 = true;
                            }
                            this.b2[j][n17] = (n19 | (n18 & 0xF800) << 8 | (n18 & 0x7E0) << 5 | (n18 & 0x1F) << 3);
                        }
                        break;
                    }
                }
            }
            this.a6 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            if (n2 > 0) {
                this.c1 = new short[n2];
                int n20 = 0;
                int n21 = n;
                for (short n22 = 0; n22 < n2; ++n22) {
                    final short n23 = (short)((array[n21++] & 0xFF) + ((array[n21++] & 0xFF) << 8));
                    this.c1[n22] = (short)n20;
                    n21 += n23;
                    n20 += n23;
                }
                this.g = new byte[n20];
                for (short n24 = 0; n24 < n2; ++n24) {
                    final short n25 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                    System.arraycopy(array, n, this.g, this.c[n24] & 0xFFFF, n25);
                    n += n25;
                }
            }
            System.gc();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void a(final int b, final int n, int n2, final int n3) {
        if (this.a == null) {
            return;
        }
        if (n2 == -1) {
            n2 = (this.a.length >> 1) - 1;
        }
        if (this.a7 == null) {
            this.a7 = new Image[this.a4][];
        }
        if (this.a7[b] == null) {
            this.a7[b] = new Image[this.a.length >> 1];
        }
        if (n3 >= 0) {
            for (int i = n; i <= n2; ++i) {
                this.a3[b][i] = this.a3[n3][i];
            }
        }
        else {
            final int b2_local = this.b3;
            this.b3 = b;
            System.gc();
            for (int j = n; j <= n2; ++j) {
                final int n4 = j << 1;
                final int n5 = this.a[n4] & 0xFF;
                final int n6 = this.a[n4 + 1] & 0xFF;
                if (n5 > 0) {
                    if (n6 > 0) {
                        final int[] a;
                        if ((a = this.a(j)) != null) {
                            boolean b3 = false;
                            for (int n7 = n5 * n6, k = 0; k < n7; ++k) {
                                if ((a[k] & 0xFF000000) != 0xFF000000) {
                                    b3 = true;
                                    break;
                                }
                            }
                            this.a7[b][j] = Image.createRGBImage(a, n5, n6, b3);
                        }
                    }
                }
            }
            System.gc();
            this.b3 = b2_local;
        }
        System.gc();
    }
    
    public final void a(final int n) {
        if (this.a == null) {
            return;
        }
        if (this.a == null) {
            return;
        }
        if (this.a[n] == null) {
            return;
        }
        for (int i = 0; i < this.a[n].length; ++i) {
            this.a[n][i] = null;
        }
        this.a[n] = null;
        --this.a;
    }
    
    public final String toString() {
        new String();
        int i = 0;
        for (int j = 0; j < this.a.length / 2; ++j) {
            i += 2 * (this.a[2 * j] & 0xFF) * (this.a[2 * j + 1] & 0xFF);
        }
        return "raw/full: " + this.g.length + "/" + i;
    }
    
    public final int a(final int n, final int n2) {
        return this.f[(this.b[n] + n2) * 5 + 1] & 0xFF;
    }
    
    public final int a(final int n) {
        return this.e[n] & 0xFF;
    }
    
    public final int b(final int n) {
        return this.b[n] & 0xFF;
    }
    
    public final int a(final String s) {
        byte b = 1;
        for (int length = s.length(), i = s.indexOf(10); i != -1; i = ((i < length - 1) ? s.indexOf(10, i + 1) : -1)) {
            ++b;
        }
        return this.e * (b - 1) + this.a[1] * b;
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, int n6, int n7) {
        final int n8 = (this.b[n] + n2) * 5;
        final int n9 = this.f[n8] & 0xFF;
        if ((n5 & 0x20) != 0x0) {
            n6 = (((n5 & 0x1) != 0x0) ? (n6 + this.f[n8 + 2]) : (n6 - this.f[n8 + 2]));
            n7 = (((n5 & 0x2) != 0x0) ? (n7 + this.f[n8 + 3]) : (n7 - this.f[n8 + 3]));
        }
        this.a(graphics, n9, n3 - n6, n4 - n7, n5 ^ (this.f[n8 + 4] & 0xF), n6, n7);
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int n7 = this.b[n] & 0xFF, i = 0; i < n7; ++i) {
            this.a(graphics, n, i, n2, n3, n4);
        }
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, int n3, int n4, final int n5) {
        final int n6 = this.a[n] + n2 << 2;
        final int n7 = this.d[n6 + 3] & 0xFF;
        final int n8 = this.d[n6] & 0xFF;
        n3 = (((n5 & 0x1) != 0x0) ? (n3 - this.d[n6 + 1]) : (n3 + this.d[n6 + 1]));
        n4 = (((n5 & 0x2) != 0x0) ? (n4 - this.d[n6 + 2]) : (n4 + this.d[n6 + 2]));
        if ((n5 & 0x1) != 0x0) {
            n3 -= (this.a[n8 << 1] & 0xFF);
        }
        if ((n5 & 0x2) != 0x0) {
            n4 -= (this.a[(n8 << 1) + 1] & 0xFF);
        }
        this.a(graphics, n8, n3, n4, n5 ^ (n7 & 0xF));
    }
    
    public final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n << 1;
        final int n6 = this.a[n5] & 0xFF;
        final int n7 = this.a[n5 + 1] & 0xFF;
        if (n6 <= 0 || n7 <= 0) {
            return;
        }
        Image rgbImage = null;
        if (this.a != null && this.a[this.b] != null) {
            rgbImage = this.a[this.b][n];
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
    
    private int[] a(final int n) {
        if (this.g == null || this.c == null) {
            return null;
        }
        final int n2 = n << 1;
        final int n3 = this.a[n2] & 0xFF;
        final int n4 = this.a[n2 + 1] & 0xFF;
        final int[] a = a.a;
        final int[] array;
        if ((array = this.b[this.b]) == null) {
            return null;
        }
        final byte[] g = this.g;
        int n5 = this.c[n] & 0xFFFF;
        int i = 0;
        final int n6 = n3 * n4;
        if (this.a == 10225) {
            while (i < n6) {
                int n7;
                if ((n7 = (g[n5++] & 0xFF)) > 127) {
                    final int n8 = array[g[n5++] & 0xFF];
                    n7 -= 128;
                    while (n7-- > 0) {
                        a[i++] = n8;
                    }
                }
                else {
                    a[i++] = array[n7];
                }
            }
        }
        else if (this.a == 5632) {
            while (i < n6) {
                a[i++] = array[g[n5] >> 4 & 0xF];
                a[i++] = array[g[n5] & 0xF];
                ++n5;
            }
        }
        else if (this.a == 1024) {
            while (i < n6) {
                a[i++] = array[g[n5] >> 6 & 0x3];
                a[i++] = array[g[n5] >> 4 & 0x3];
                a[i++] = array[g[n5] >> 2 & 0x3];
                a[i++] = array[g[n5] & 0x3];
                ++n5;
            }
        }
        else if (this.a == 512) {
            while (i < n6) {
                a[i++] = array[g[n5] >> 7 & 0x1];
                a[i++] = array[g[n5] >> 6 & 0x1];
                a[i++] = array[g[n5] >> 5 & 0x1];
                a[i++] = array[g[n5] >> 4 & 0x1];
                a[i++] = array[g[n5] >> 3 & 0x1];
                a[i++] = array[g[n5] >> 2 & 0x1];
                a[i++] = array[g[n5] >> 1 & 0x1];
                a[i++] = array[g[n5] & 0x1];
                ++n5;
            }
        }
        else if (this.a == 22018) {
            while (i < n6) {
                a[i++] = array[g[n5++] & 0xFF];
            }
        }
        else if (this.a == 22258) {
            while (i < n6) {
                int n9;
                if ((n9 = (g[n5++] & 0xFF)) > 127) {
                    n9 -= 128;
                    while (n9-- > 0) {
                        a[i++] = array[g[n5++] & 0xFF];
                    }
                }
                else {
                    final int n10 = array[g[n5++] & 0xFF];
                    while (n9-- > 0) {
                        a[i++] = n10;
                    }
                }
            }
        }
        return a;
    }
    
    public final void a(final String s) {
        a.c = 0;
        a.d = (this.a[1] & 0xFF);
        int n = 0;
        final int n2 = (a.f >= 0) ? a.f : 0;
        for (int n3 = (a.g >= 0) ? a.g : s.length(), i = n2; i < n3; ++i) {
            int n5 = 0;
            int n6 = 0;
            Label_0275: {
                final char char1;
                int char2;
                int n4;
                if ((char1 = s.charAt(i)) > ' ') {
                    n4 = (char2 = (a.h[char1] & 0xFF));
                }
                else {
                    if (char1 == ' ') {
                        n5 = n;
                        n6 = (this.a[0] & 0xFF);
                        break Label_0275;
                    }
                    if (char1 == '\n') {
                        if (n > a.c) {
                            a.c = n;
                        }
                        n = 0;
                        a.d += this.e + (this.a[1] & 0xFF);
                        continue;
                    }
                    if (char1 == '\u0001') {
                        ++i;
                        continue;
                    }
                    if (char1 != '\u0002') {
                        continue;
                    }
                    ++i;
                    n4 = (char2 = s.charAt(i));
                }
                final int n7 = char2;
                int n9;
                int n10;
                if (n4 >= this.b(0)) {
                    final int n8 = n7 - this.b(0);
                    n5 = n;
                    n9 = (this.c[(n8 << 2) + 2] & 0xFF);
                    n10 = (this.c[n8 << 2] & 0xFF);
                }
                else {
                    final int n11 = (this.d[n7 << 2] & 0xFF) << 1;
                    n5 = n;
                    n9 = (this.a[n11] & 0xFF);
                    n10 = this.d[(n7 << 2) + 1];
                }
                n6 = n9 - n10;
            }
            n = n5 + (n6 + this.d[1]);
        }
        if (n > a.c) {
            a.c = n;
        }
        if (a.c > 0) {
            a.c -= this.d[1];
        }
    }
    
    public final void a(final Graphics graphics, final String s, int n, int n2, final int n3) {
        n2 -= this.d[2];
        Label_0087: {
            if ((n3 & 0x2B) != 0x0) {
                this.a(s);
                Label_0054: {
                    int n4;
                    int c;
                    if ((n3 & 0x8) != 0x0) {
                        n4 = n;
                        c = a.c;
                    }
                    else {
                        if ((n3 & 0x1) == 0x0) {
                            break Label_0054;
                        }
                        n4 = n;
                        c = a.c >> 1;
                    }
                    n = n4 - c;
                }
                int n5;
                int d;
                if ((n3 & 0x20) != 0x0) {
                    n5 = n2;
                    d = a.d;
                }
                else {
                    if ((n3 & 0x2) == 0x0) {
                        break Label_0087;
                    }
                    n5 = n2;
                    d = a.d >> 1;
                }
                n2 = n5 - d;
            }
        }
        int n6 = n;
        int n7 = n2;
        final int b = this.b;
        final int n8 = (a.f >= 0) ? a.f : 0;
        for (int n9 = (a.g >= 0) ? a.g : s.length(), i = n8; i < n9; ++i) {
            int n11 = 0;
            int n12 = 0;
            Label_0386: {
                final char char1;
                int char2;
                int n10;
                if ((char1 = s.charAt(i)) > ' ') {
                    n10 = (char2 = (a.h[char1] & 0xFF));
                }
                else {
                    if (char1 == ' ') {
                        n11 = n6;
                        n12 = (this.a[0] & 0xFF);
                        break Label_0386;
                    }
                    if (char1 == '\n') {
                        n6 = n;
                        n7 += this.e + (this.a[1] & 0xFF);
                        continue;
                    }
                    if (char1 == '\u0001') {
                        ++i;
                        this.b = s.charAt(i);
                        continue;
                    }
                    if (char1 != '\u0002') {
                        continue;
                    }
                    ++i;
                    n10 = (char2 = s.charAt(i));
                }
                final int n13 = char2;
                int n15;
                int n16;
                if (n10 >= this.b(0)) {
                    final int n14 = n13 - this.b(0);
                    this.a(graphics, n14, n6, n7, 0, 0, 0);
                    n11 = n6;
                    n15 = (this.c[(n14 << 2) + 2] & 0xFF);
                    n16 = (this.c[n14 << 2] & 0xFF);
                }
                else {
                    final int n17 = (this.d[n13 << 2] & 0xFF) << 1;
                    this.a(graphics, 0, n13, n6, n7, 0);
                    n11 = n6;
                    n15 = (this.a[n17] & 0xFF);
                    n16 = this.d[(n13 << 2) + 1];
                }
                n12 = n15 - n16;
            }
            n6 = n11 + (n12 + this.d[1]);
        }
        this.b = b;
    }
    
    public final void b(final Graphics graphics, final String s, final int n, int n2, final int n3) {
        int n4 = 0;
        final int length = s.length();
        final int[] array = new int[100];
        for (int i = 0; i < length; ++i) {
            if (s.charAt(i) == '\n') {
                array[n4++] = i;
            }
        }
        array[n4++] = length;
        final int n5 = this.e + (this.a[1] & 0xFF);
        Label_0120: {
            int n6;
            int n7;
            if ((n3 & 0x20) != 0x0) {
                n6 = n2;
                n7 = n5 * (n4 - 1);
            }
            else {
                if ((n3 & 0x2) == 0x0) {
                    break Label_0120;
                }
                n6 = n2;
                n7 = n5 * (n4 - 1) >> 1;
            }
            n2 = n6 - n7;
        }
        for (int j = 0; j < n4; ++j) {
            a.f = ((j > 0) ? (array[j - 1] + 1) : 0);
            a.g = array[j];
            this.a(graphics, s, n, n2 + j * n5, n3);
        }
        a.f = -1;
        a.g = -1;
    }
    
    public final void a(final boolean b) {
        this.a = null;
        this.b = null;
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = null;
        this.f = null;
        if (this.a != null) {
            for (int i = 0; i < this.a.length; ++i) {
                this.a[i] = null;
            }
            this.a = null;
        }
        if (this.b != null) {
            for (int j = 0; j < this.b.length; ++j) {
                this.b[j] = null;
            }
            this.b = null;
        }
        this.g = null;
        this.c = null;
        if (b && this.a != null) {
            for (int k = 0; k < this.a.length; ++k) {
                if (this.a[k] != null) {
                    for (int l = 0; l < this.a[k].length; ++l) {
                        this.a[k][l] = null;
                    }
                }
            }
            this.a = null;
        }
    }
    
    static {
        a.a = new int[4096];
        a.f = -1;
        a.g = -1;
    }
}
