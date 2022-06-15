import java.util.Enumeration;
import java.util.Vector;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class c
{
    private static long a;
    private static String a;
    private static String b;
    public static f[] a;
    public byte[][] a;
    private int a;
    private long b;
    public byte[] a;
    private int b;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    public boolean a;
    private static i a;
    private short[] a;
    private int h;
    
    public c(final i a) {
        this.a = null;
        this.a = 0;
        this.a = null;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.a = false;
        this.a = new short[16];
        c.a = a;
    }
    
    private void a(final Graphics graphics, final byte[] array, int n) {
        if (array == null) {
            return;
        }
        final byte b;
        switch (b = array[n]) {
            case 18: {
                if (array[n + 7] != 0) {
                    graphics.setColor((array[n + 3] & 0xFF) + ((array[n + 3 + 1] & 0xFF) << 8) + ((array[n + 3 + 2] & 0xFF) << 16));
                    graphics.fillRect(0, 0, 240, 320);
                    return;
                }
                break;
            }
            case 12: {
                int b2 = this.b;
                graphics.setColor(16777215);
                if (b2 > 5) {
                    b2 = 5;
                }
                final int n2 = c.a.h * 24;
                n = c.a.i * 24;
                graphics.fillRect(((n2 - c.a.a) * (5 - b2) + this.c * b2) / 5, ((n - c.a.b) * (5 - b2) + this.d * b2) / 5, b2 * 102 / 5, b2 * 38 / 5);
            }
            case 1: {
                int b3 = this.b;
                final short n3 = (short)i.a(array, n + 2);
                final short n4 = (short)i.a(array, n + 4);
                final short n5 = (short)i.a(array, n + 6);
                short n6 = (short)i.a(array, n + 8);
                short n7 = (short)i.a(array, n + 10);
                if (n6 == 10000) {
                    n6 = (short)c.a.c;
                }
                if (n7 == 10000) {
                    n7 = (short)c.a.d;
                }
                if (b3 > n5) {
                    b3 = n5;
                }
                final short n8 = (short)(n3 - 108);
                final short n9 = (short)(n4 - 108);
                c.a.c = (short)((n8 * b3 + n6 * (n5 - b3)) / n5);
                c.a.d = (short)((n9 * b3 + n7 * (n5 - b3)) / n5);
                final int n10 = c.a.e * 24 - 240;
                final int b4 = c.a.f * 24 - 320 + 80;
                Label_0491: {
                    i i;
                    int c;
                    if (c.a.c > n10) {
                        i = c.a;
                        c = n10;
                    }
                    else {
                        if (c.a.c >= 0) {
                            break Label_0491;
                        }
                        i = c.a;
                        c = 0;
                    }
                    i.c = c;
                }
                Label_0524: {
                    i j;
                    int d;
                    if (c.a.d > b4) {
                        j = c.a;
                        d = b4;
                    }
                    else {
                        if (c.a.d >= 0) {
                            break Label_0524;
                        }
                        j = c.a;
                        d = 0;
                    }
                    j.d = d;
                }
                c.a.a = c.a.c;
                c.a.b = c.a.d;
                if (c.a.a > n10) {
                    final i a = c.a;
                    a.a -= n10;
                }
                if (c.a.b > b4) {
                    c.a.b = b4;
                    return;
                }
                if (c.a.b < 0) {
                    return;
                }
                break;
            }
            case 13: {
                int b5 = this.b;
                final short n11 = (short)i.a(array, n + 2);
                final short n12 = (short)i.a(array, n + 4);
                final short n13 = (short)i.a(array, n + 6);
                final short n14 = (short)i.a(array, n + 8);
                final short n15 = (short)i.a(array, n + 10);
                if (b5 > n13) {
                    b5 = n13;
                }
                final short c2 = (short)((n11 * b5 + n14 * (n13 - b5)) / n13);
                final short d2 = (short)((n12 * b5 + n15 * (n13 - b5)) / n13);
                if (b == 13) {
                    this.c = c2;
                    this.d = d2;
                    return;
                }
                break;
            }
            case 4: {
                int b6 = this.b;
                final short n16 = (short)i.a(array, n + 2);
                final short n17 = (short)i.a(array, n + 4);
                final short n18 = (short)i.a(array, n + 6);
                final short n19 = (short)i.a(array, n + 6);
                final short n20 = (short)i.a(array, n + 14);
                if (b6 > n20) {
                    b6 = n20;
                }
                c.a[(short)i.a(array, n + 10)].a(graphics, (short)i.a(array, n + 12), (short)((n18 * b6 + n16 * (n20 - b6)) / n20), (short)((n19 * b6 + n17 * (n20 - b6)) / n20), 0);
            }
            case 27: {
                final int n21 = i.a.a.stringWidth(i.a[30]) + 10;
                final int n22 = i.a.a.getHeight() + 4;
                String s = null;
                try {
                    s = new String(array, n + 8, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex) {}
                if (s != null) {
                    try {
                        s = i.b[Integer.parseInt(s.trim())];
                    }
                    catch (Exception ex2) {}
                }
                i.a(graphics, 6, 197, 226, a(s, 220).length * i.a.a.getHeight() + 6, 73, 1, n21, n22);
                a(graphics, s, 8, 210, 220);
                i.a.b(graphics, i.a[30], 19, 200, 20);
                if (i.g / 2 % 4 < 2) {
                    graphics.drawImage(i.a[0][9], 223, 197, 17);
                    return;
                }
                break;
            }
            case 2: {
                final short n23 = (short)i.a(array, n + 6);
                int n24;
                if ((n24 = (short)i.a(array, n + 4)) == 10000) {
                    n24 = -240;
                }
                String s2 = null;
                try {
                    s2 = new String(array, n + 11, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex3) {}
                if (s2 != null) {
                    try {
                        s2 = i.b[Integer.parseInt(s2.trim())];
                    }
                    catch (Exception ex4) {}
                }
                final int n25 = a(s2, 222).length * i.a.a.getHeight() + 2;
                i.a(graphics, n24, n23 - 11, 226, n25, 73, 0);
                a(graphics, s2, n24 + 2, n23 + 2, 222);
                if (i.g / 2 % 4 < 2) {
                    graphics.drawImage(i.a[0][9], n24 + 226 - 10, n23 + n25 + 2, 17);
                }
                graphics.setClip(0, 0, 240, 320);
                break;
            }
        }
    }
    
    private void a(final byte[] array, final int n) {
        switch (array[n]) {
            case 7: {
                array[n + 1] = 1;
            }
            case 27: {
                if (i.a) {
                    return;
                }
                String s = null;
                try {
                    s = new String(array, n + 8, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex) {}
                this.a(s, 196);
                final short n2 = (short)(array[n + 6] & 0xFF);
                final short n3 = (short)(array[n + 8] & 0xFF);
                if (n2 + n3 >= this.h) {
                    array[n + 7] = 1;
                    return;
                }
                array[n + 6] = (byte)(n2 + n3);
            }
            case 2: {
                String s2 = null;
                try {
                    s2 = new String(array, n + 11, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex2) {}
                this.a(s2, 222);
                final short n4 = (short)(array[n + 9] & 0xFF);
                final short n5 = (short)(array[n + 8] & 0xFF);
                byte[] array2;
                int n6;
                byte b;
                if (n4 + n5 >= this.h) {
                    array2 = array;
                    n6 = n + 10;
                    b = 1;
                }
                else {
                    array2 = array;
                    n6 = n + 9;
                    b = (byte)(n4 + n5);
                }
                array2[n6] = b;
                break;
            }
        }
    }
    
    public final void a() {
        if (this.a == null) {
            return;
        }
        if (Math.abs(this.b - System.currentTimeMillis()) < c.a) {
            return;
        }
        if (this.a[0] == 0) {
            final byte b = this.a[1];
            int n = 2 + (b << 2);
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + (b2 << 2));
                this.a(this.a, n);
                n += b3;
            }
        }
        else {
            this.a(this.a, 0);
        }
    }
    
    public final void a(final Graphics graphics) {
        if (this.a) {
            return;
        }
        switch ((this.a == null) ? -1 : this.a[0]) {
            case 25:
            case 26: {
                if (this.a == null || this.a >= this.a.length) {
                    return;
                }
                break;
            }
            default: {
                graphics.setColor(0);
                graphics.fillRect(0, 0, 240, 42);
                graphics.fillRect(0, 278, 240, 42);
                i.a.b(graphics, i.a[65], 2, 320 - (i.a.a.getHeight() - 10), 36);
                break;
            }
        }
        if (this.a[0] == 0) {
            final byte b = this.a[1];
            int n = 2 + (b << 2);
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + (b2 << 2));
                this.a(graphics, this.a, n);
                n += b3;
            }
        }
        else {
            this.a(graphics, this.a, 0);
        }
        if (this.b) {
            graphics.setColor(0);
            graphics.fillRect(this.c - 3, this.d - 3, 109, 45);
            c.a[this.f].a(graphics, 0, this.b % c.a[this.f].a(0), this.c, this.d, 0, 0, 0);
            c.a[0].a(graphics, this.e, this.c, this.d, 0);
            if (this.g >= 0) {
                if (i.b && this.g == 2) {
                    this.g = 7;
                }
                if (i.b && this.g == 6) {
                    this.g = 8;
                }
                c.a[1].a(graphics, this.g, this.c + 90, this.d - 6, 0);
            }
        }
    }
    
    public final byte[] a() {
        final byte[][] a = this.a;
        for (int i = 0; i < a.length; ++i) {
            this.b(a[i], 0);
        }
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.a = false;
        this.a = 0;
        this.b = System.currentTimeMillis();
        return this.b();
    }
    
    private void b(final byte[] array, final int n) {
        if (array[n] != 0) {
            array[n + 1] = 0;
            byte[] array2 = null;
            int n2 = 0;
            int n3 = 0;
            switch (array[n]) {
                case 27: {
                    array[n + 6] = 0;
                    a(array, n + 4, (short)(-240));
                    array2 = array;
                    n2 = n;
                    n3 = 7;
                    break;
                }
                case 2: {
                    array[n + 9] = 0;
                    a(array, n + 4, (short)(-240));
                    array2 = array;
                    n2 = n;
                    n3 = 10;
                    break;
                }
                default: {
                    return;
                }
            }
            array2[n2 + n3] = 0;
            return;
        }
        final byte b = array[n + 1];
        int n4 = n + 2 + (b << 2);
        for (byte b2 = 0; b2 < b; ++b2) {
            final int b3 = i.b(array, n + 2 + (b2 << 2));
            this.b(array, n4);
            n4 += b3;
        }
    }
    
    public final byte[] b() {
        this.b = 0;
        c c;
        byte[] a;
        if (this.a == null || this.a >= this.a.length) {
            c = this;
            a = null;
        }
        else {
            c = this;
            a = this.a[this.a++];
        }
        c.a = a;
        return this.a;
    }
    
    public final void b() {
        if (this.a[0] == 0) {
            final byte b = this.a[1];
            int n = 2 + (b << 2);
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + (b2 << 2));
                this.c(this.a, n);
                n += b3;
            }
        }
        else {
            this.c(this.a, 0);
        }
        ++this.b;
    }
    
    private void c(final byte[] array, final int n) {
        final short n2 = array[n];
        if (this.a) {
            switch (n2) {
                case 5:
                case 9:
                case 10:
                case 25:
                case 26: {
                    break;
                }
                default: {
                    array[n + 1] = 1;
                    return;
                }
            }
        }
        switch (n2) {
            case 16:
            case 17:
            case 18: {
                if (this.b % 2 == 0) {
                    return;
                }
                final int n3 = n + ((n2 == 18) ? 2 : 4);
                byte b = array[n3];
                int g = -1;
                final int n4 = n + ((n2 == 18) ? 7 : 5);
                int n5 = (array[n4] != 0) ? 1 : 0;
                if (n2 != 18) {
                    g = (short)i.a(array, n + 2);
                }
                if (n5 != 0) {
                    n5 = 0;
                    this.g = -1;
                    if (--b == 0) {
                        array[n + 1] = 1;
                        if (n2 != 18) {
                            this.g = ((n2 == 16) ? g : -1);
                        }
                    }
                }
                else if (b > 0) {
                    n5 = 1;
                    if (n2 != 18) {
                        this.g = g;
                    }
                }
                else {
                    array[n + 1] = 1;
                }
                array[n4] = (byte)((n5 != 0) ? 1 : 0);
                array[n3] = b;
            }
            case 14:
            case 15: {
                this.b = (n2 == 14);
                array[n + 1] = 1;
            }
            case 12: {
                final short c = (short)i.a(array, n + 2);
                final short d = (short)i.a(array, n + 4);
                this.c = c;
                this.d = d;
                if (this.b > 5) {
                    array[n + 1] = 1;
                    this.b = true;
                    return;
                }
                break;
            }
            case 11: {
                this.f = (short)i.a(array, n + 4);
                this.e = (short)i.a(array, n + 2);
                array[n + 1] = 1;
            }
            case 10: {
                final byte a = array[n + 2];
                if (this.b == 0) {
                    c.a.k = ((c.a.k & 0xFFFFFFF8) | a);
                    c.a.a = a;
                }
                else if (c.a.j <= 0) {
                    c.a.a = 0;
                    array[n + 1] = 1;
                }
                c.a.a();
            }
            case 13: {
                if ((short)i.a(array, n + 8) == 10000) {
                    a(array, n + 8, (short)this.c);
                }
                if ((short)i.a(array, n + 10) == 10000) {
                    a(array, n + 10, (short)this.d);
                }
                if (this.b > (short)i.a(array, n + 6)) {
                    array[n + 1] = 1;
                    return;
                }
                break;
            }
            case 1: {
                if ((short)i.a(array, n + 8) == 10000) {
                    a(array, n + 8, (short)c.a.c);
                }
                if ((short)i.a(array, n + 10) == 10000) {
                    a(array, n + 10, (short)c.a.d);
                }
                if (this.b > (short)i.a(array, n + 6)) {
                    array[n + 1] = 1;
                    return;
                }
                break;
            }
            case 4: {
                if (this.b > (short)i.a(array, n + 14)) {
                    array[n + 1] = 1;
                    return;
                }
                break;
            }
            case 6: {
                if (this.b > i.b(array, n + 2)) {
                    array[n + 1] = 1;
                    return;
                }
                break;
            }
            case 25: {
                i.a[(short)i.a(array, n + 2)][(short)i.a(array, n + 4)] = (array[n + 7] << 8 | array[n + 6]);
                array[n + 1] = 1;
            }
            case 26: {
                i.b[(short)i.a(array, n + 2)][(short)i.a(array, n + 4)] = i.b(array, n + 6);
                array[n + 1] = 1;
            }
            case 5: {
                i.a((short)i.a(array, n + 2), (short)i.a(array, n + 4), array[n + 6], 0);
                array[n + 1] = 1;
            }
            case 8: {}
            case 9: {
                i.a((short)i.a(array, n + 2), (short)i.a(array, n + 4), (byte)0, (short)i.a(array, n + 6));
                array[n + 1] = 1;
            }
            case 27: {
                if (array[n + 7] != 0) {
                    array[n + 1] = 1;
                    return;
                }
                break;
            }
            case 2: {
                int n6;
                if ((n6 = (short)i.a(array, n + 4)) == 10000) {
                    n6 = -226;
                }
                short n7 = (short)(n6 + 30);
                if (array[n + 10] == 0) {
                    if (n7 > 7) {
                        n7 = 7;
                    }
                }
                else if (n7 > 240) {
                    array[n + 1] = 1;
                }
                a(array, n + 4, n7);
                break;
            }
        }
    }
    
    public final boolean a() {
        boolean b = true;
        if (this.a[0] == 0) {
            final byte b2 = this.a[1];
            int n = 2 + (b2 << 2);
            for (byte b3 = 0; b3 < b2; ++b3) {
                final int b4 = i.b(this.a, 2 + (b3 << 2));
                if (!(b = (b && this.a[n + 1] == 1))) {
                    break;
                }
                n += b4;
            }
        }
        else {
            b = (this.a[1] == 1);
        }
        return b;
    }
    
    public final void a(final int n) {
        try {
            final String b = c.b;
            c.a.getClass();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i.a(b, 0));
            byte[] array = new byte[4];
            byteArrayInputStream.read(array, 0, 2);
            boolean b2 = false;
            do {
                byteArrayInputStream.read(array, 0, 2);
                if ((short)i.a(array, 0) == n) {
                    byteArrayInputStream.read(array, 0, 2);
                    final short n2 = (short)i.a(array, 0);
                    byteArrayInputStream.read(array, 0, 4);
                    array = new byte[i.b(array, 0)];
                    byteArrayInputStream.read(array);
                    byteArrayInputStream.close();
                    byteArrayInputStream = null;
                    b2 = true;
                    int n3 = 0;
                    final short n4 = (short)i.a(array, 0);
                    n3 += 2;
                    if (n4 != 0) {
                        final short[] array2 = new short[n4];
                        for (short n5 = 0; n5 < n4; ++n5) {
                            array2[n5] = (short)i.a(array, n3);
                            n3 += 2;
                        }
                        for (short n6 = 1; n6 < n4; ++n6) {
                            final short n7 = array2[n6];
                            int n9;
                            int n8 = n9 = n6;
                            int n10;
                            while (true) {
                                n10 = n9;
                                if (n8 <= 0 || array2[n10 - 1] <= n7) {
                                    break;
                                }
                                array2[n10] = array2[n10 - 1];
                                n8 = (n9 = n10 - 1);
                            }
                            array2[n10] = n7;
                        }
                        final InputStream resourceAsStream = this.getClass().getResourceAsStream(c.a);
                        byte[] array3 = new byte[4];
                        resourceAsStream.read(array3, 0, 2);
                        final short n11 = (short)i.a(array3, 0);
                        if (c.a == null) {
                            c.a = new f[n11];
                        }
                        for (short n12 = 0; n12 < n4; ++n12) {
                            final short n13 = array2[n12];
                            int i = 0;
                            while (i == 0) {
                                resourceAsStream.read(array3, 0, 2);
                                if (n13 == (short)i.a(array3, 0)) {
                                    i = 1;
                                }
                                resourceAsStream.read(array3, 0, 4);
                                final int b3 = i.b(array3, 0);
                                if (i == 0 && c.a[n13] != null) {
                                    resourceAsStream.skip(b3);
                                }
                                else {
                                    array3 = new byte[b3];
                                    resourceAsStream.read(array3);
                                    (c.a[n13] = new f()).a(array3, 0);
                                    c.a[n13].a(0, 0, -1, -1);
                                    c.a[n13].d = null;
                                }
                            }
                        }
                        resourceAsStream.close();
                    }
                    final byte[][] a = new byte[n2][];
                    int n14 = 0;
                    byte[][] array4 = null;
                    int n15 = 0;
                    int n16 = 0;
                    for (short n17 = 0; n17 < n2 || n16 != 0; ++n17) {
                        byte[][] array5;
                        if (n16 == 0) {
                            array5 = a;
                        }
                        else {
                            array5 = array4;
                            --n16;
                            --n17;
                        }
                        final int n18 = array[n3++] & 0xFF;
                        byte[] array6 = null;
                        Label_1801: {
                            byte[] array7 = null;
                            switch (n18) {
                                case 18: {
                                    final short n19 = (short)(array[n3++] & 0xFF);
                                    final int n20 = (array[n3++] & 0xFF) + ((array[n3++] & 0xFF) << 8) + ((array[n3++] & 0xFF) << 16);
                                    a(array6 = new byte[8], 2, n19);
                                    a(array6, 3, n20);
                                    array6[7] = 0;
                                    break Label_1801;
                                }
                                case 16:
                                case 17: {
                                    final short n21 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n22 = (short)(array[n3++] & 0xFF);
                                    a(array6 = new byte[6], 2, n21);
                                    a(array6, 4, n22);
                                    array6[5] = 0;
                                    break Label_1801;
                                }
                                case 11: {
                                    final short n23 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n24 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[6], 2, n23);
                                    a(array6, 4, n24);
                                    break Label_1801;
                                }
                                case 12: {
                                    final short n25 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n26 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[6], 2, n25);
                                    a(array6, 4, n26);
                                    break Label_1801;
                                }
                                case 13: {
                                    final short n27 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n28 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n29 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[12], 2, n27);
                                    a(array6, 4, n28);
                                    a(array6, 6, n29);
                                    a(array6, 8, (short)10000);
                                    a(array6, 10, (short)10000);
                                    break Label_1801;
                                }
                                case 14:
                                case 15: {
                                    array7 = new byte[2];
                                    break;
                                }
                                case 4: {
                                    final short n30 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n31 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n32 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n33 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n34 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n35 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n36 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[16], 2, n30);
                                    a(array6, 4, n31);
                                    a(array6, 6, n32);
                                    a(array6, 8, n33);
                                    a(array6, 10, n34);
                                    a(array6, 12, n35);
                                    a(array6, 14, n36);
                                    break Label_1801;
                                }
                                case 7: {
                                    array7 = new byte[2];
                                    break;
                                }
                                case 1: {
                                    final short n37 = (short)(i.a(array, n3) * 24);
                                    n3 += 2;
                                    final short n38 = (short)(i.a(array, n3) * 24);
                                    n3 += 2;
                                    final short n39 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[12], 2, n37);
                                    a(array6, 4, n38);
                                    a(array6, 6, n39);
                                    a(array6, 8, (short)10000);
                                    a(array6, 10, (short)10000);
                                    break Label_1801;
                                }
                                case 6: {
                                    final int b4 = i.b(array, n3);
                                    n3 += 4;
                                    a(array6 = new byte[6], 2, b4);
                                    break Label_1801;
                                }
                                case 26: {
                                    final short n40 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n41 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final int b5 = i.b(array, n3);
                                    n3 += 4;
                                    a(array6 = new byte[10], 2, n40);
                                    a(array6, 4, n41);
                                    a(array6, 6, b5);
                                    break Label_1801;
                                }
                                case 25: {
                                    final short n42 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n43 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n44 = (short)(array[n3++] & 0xFF);
                                    final short n45 = (short)(array[n3++] & 0xFF);
                                    a(array6 = new byte[8], 2, n42);
                                    a(array6, 4, n43);
                                    array6[6] = (byte)n44;
                                    array6[7] = (byte)n45;
                                    break Label_1801;
                                }
                                case 5: {
                                    final short n46 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n47 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n48 = (short)(array[n3++] & 0xFF);
                                    a(array6 = new byte[7], 2, n46);
                                    a(array6, 4, n47);
                                    array6[6] = (byte)n48;
                                    break Label_1801;
                                }
                                case 27: {
                                    final short n49 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[n49 + 8], 2, n49);
                                    a(array6, 4, (short)10000);
                                    array6[7] = (array6[6] = 0);
                                    System.arraycopy(array, n3, array6, 8, n49);
                                    n3 += n49;
                                    break Label_1801;
                                }
                                case 2: {
                                    final short n50 = (short)(array[n3++] & 0xFF);
                                    final short n51 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n52 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[n52 + 11], 2, n52);
                                    a(array6, 4, (short)10000);
                                    a(array6, 6, n51);
                                    array6[8] = (byte)n50;
                                    array6[10] = (array6[9] = 0);
                                    System.arraycopy(array, n3, array6, 11, n52);
                                    n3 += n52;
                                    break Label_1801;
                                }
                                case 9: {
                                    final short n53 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n54 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n55 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[8], 2, n53);
                                    a(array6, 4, n54);
                                    a(array6, 6, n55);
                                    break Label_1801;
                                }
                                case 10: {
                                    (array6 = new byte[3])[2] = (byte)(array[n3++] & 0xFF);
                                    break Label_1801;
                                }
                                case 0: {
                                    array4 = new byte[n16 = (short)(array[n3++] & 0xFF)][];
                                    array7 = null;
                                    break;
                                }
                            }
                            array6 = array7;
                        }
                        if (array6 != null) {
                            array6[0] = (byte)n18;
                            array6[1] = 0;
                            if (array5 == array4) {
                                array5[n15] = array6;
                                ++n15;
                            }
                            else {
                                array5[n14] = array6;
                                ++n14;
                            }
                        }
                        if (array5 == array4 && n16 == 0) {
                            int n56 = 0;
                            for (int j = 0; j < array4.length; ++j) {
                                n56 += array4[j].length;
                            }
                            final byte[] array8;
                            (array8 = new byte[2 + (array4.length << 2) + n56])[0] = 0;
                            array8[1] = (byte)array4.length;
                            int n57 = 2 + (array4.length << 2);
                            for (int k = 0; k < array4.length; ++k) {
                                a(array8, 2 + (k << 2), array4[k].length);
                                System.arraycopy(array4[k], 0, array8, n57, array4[k].length);
                                n57 += array4[k].length;
                            }
                            a[n14] = array8;
                            n15 = 0;
                            array4 = null;
                            ++n14;
                        }
                    }
                    this.a = a;
                }
                else {
                    byteArrayInputStream.skip(2L);
                    byteArrayInputStream.read(array, 0, 4);
                    byteArrayInputStream.skip(i.b(array, 0));
                }
            } while (!b2);
        }
        catch (Exception ex) {}
    }
    
    public static int a(final Graphics graphics, final String s, final int n, int n2, int i) {
        String[] a;
        for (a = a(s, i), i = 0; i < a.length; ++i) {
            i.a.b(graphics, a[i], n, n2, 17);
            n2 += i.a.a.getHeight();
        }
        return n2;
    }
    
    private static void a(final Graphics graphics, final String s, final int n, int n2, final int n3) {
        n2 += 14;
        try {
            final String[] a = a(s, n3);
            for (int i = 0; i < a.length; ++i) {
                if (a[i] == null) {
                    return;
                }
                if (a[i].trim().equals("") || a[i].trim().equals(" ")) {
                    return;
                }
                h h;
                Graphics graphics2;
                String s2;
                int n4;
                int n5;
                int n6;
                if (i.b) {
                    h = i.a;
                    graphics2 = graphics;
                    s2 = a[i];
                    n4 = n + n3;
                    n5 = n2;
                    n6 = 8;
                }
                else {
                    h = i.a;
                    graphics2 = graphics;
                    s2 = a[i];
                    n4 = n;
                    n5 = n2;
                    n6 = 4;
                }
                h.b(graphics2, s2, n4, n5, n6);
                n2 += i.a.a.getHeight();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static String[] a(final String s, final int n) {
        final Vector<String> vector = new Vector<String>();
        String obj = "";
        final String[] a = a(s, ' ');
        for (int i = 0; i < a.length; ++i) {
            final String str = a[i];
            if (i.a.a.stringWidth(str) >= n) {
                final String[] b;
                final String trim;
                if ((b = b(obj + str, n)).length > 1 && (trim = b[b.length - 1].trim()).length() == 1 && (trim.equals(".") || trim.equals(",") || trim.equals(";") || trim.equals("?") || trim.equals("'") || trim.equals("\"") || trim.equals("!"))) {
                    final String s2 = b[b.length - 2];
                    final String string = s2.charAt(s2.length() - 1) + trim;
                    b[b.length - 2] = s2.substring(0, s2.length() - 1);
                    b[b.length - 1] = string;
                }
                final String[] array = b;
                for (int j = 0; j < array.length - 1; ++j) {
                    if (array[j] != null && !array[j].equals("") && !array[j].equals(" ")) {
                        vector.addElement(array[j]);
                    }
                }
                obj = "" + array[array.length - 1] + " ";
                if (i != a.length - 1 || obj == null || obj.equals("") || obj.equals(" ")) {
                    continue;
                }
            }
            else {
                StringBuffer sb;
                if (i.a.a.stringWidth(obj + str + " ") < n) {
                    final String trim2;
                    if (a.length > 2 && i == a.length - 2 && (trim2 = a[a.length - 1].trim()).length() == 1 && i.a.a.stringWidth(obj + " " + str + " " + trim2) >= n && (trim2.equals(".") || trim2.equals(",") || trim2.equals(";") || trim2.equals("?") || trim2.equals("'") || trim2.equals("\"") || trim2.equals("!"))) {
                        if (obj != null && !obj.equals("") && !obj.equals(" ")) {
                            vector.addElement(obj);
                        }
                        final String string2;
                        if ((string2 = "" + str + " " + trim2) != null && !string2.equals("") && !string2.equals(" ")) {
                            vector.addElement(string2);
                            break;
                        }
                        break;
                    }
                    else {
                        sb = new StringBuffer();
                    }
                }
                else {
                    if (obj != null && !obj.equals("") && !obj.equals(" ")) {
                        vector.addElement(obj);
                    }
                    obj = "";
                    sb = new StringBuffer();
                }
                obj = sb.append(obj).append(str).append(" ").toString();
                if (i != a.length - 1 || obj == null || obj.equals("") || obj.equals(" ")) {
                    continue;
                }
            }
            vector.addElement(obj);
        }
        return a(vector);
    }
    
    private static String[] b(final String s, final int n) {
        final Vector<String> vector = new Vector<String>();
        String string = "";
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            StringBuffer sb;
            String str;
            if (i.a.a.stringWidth(string + char1) < n) {
                sb = new StringBuffer();
                str = string;
            }
            else {
                vector.addElement(string);
                sb = new StringBuffer();
                str = "";
            }
            string = sb.append(str).append(char1).toString();
            if (i == s.length() - 1 && string != null && !string.equals("") && !string.equals(" ")) {
                vector.addElement(string);
            }
        }
        return a(vector);
    }
    
    private static String[] a(final Vector vector) {
        final String[] array = new String[vector.size()];
        final Enumeration<String> elements = vector.elements();
        int n = 0;
        while (elements.hasMoreElements()) {
            final String trim;
            if (!(trim = elements.nextElement().trim()).equals("") && !trim.equals(" ")) {
                array[n] = trim;
            }
            ++n;
        }
        return array;
    }
    
    public static String[] a(final String s, final char c) {
        final Vector<String> vector = new Vector<String>();
        String string = "";
        for (int i = 0; i < s.length(); ++i) {
            final char char1;
            if ((char1 = s.charAt(i)) != c) {
                string += char1;
            }
            if (char1 == c || char1 == '\n' || i == s.length() - 1) {
                vector.addElement(string);
                string = "";
            }
        }
        return a(vector);
    }
    
    private void a(final String s, final int n) {
        try {
            this.h = 0;
            final int length = s.length();
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < length; ++i) {
                if (s.charAt(length - 1) == '\n') {
                    return;
                }
                Label_0276: {
                    final char char1;
                    if ((char1 = s.charAt(i)) > ' ') {
                        n2 += i.a.a.charWidth((char)char1);
                    }
                    else if (char1 == ' ' && i + 1 < length && (s.charAt(i + 1) == '?' || s.charAt(i + 1) == '!' || s.charAt(i + 1) == ':')) {
                        final int n4 = n2 + i.a.a.charWidth((char)char1);
                        s.charAt(i + 1);
                        n2 = n4 + i.a.a.charWidth((char)char1);
                    }
                    else {
                        if (char1 == ' ') {
                            n2 += i.a.a.charWidth((char)char1);
                            break Label_0276;
                        }
                        if (char1 == '\n') {
                            n2 = 0;
                            this.a[this.h++] = (short)i;
                        }
                        continue;
                    }
                    if (n2 > n) {
                        i = n3 - 1;
                        this.a[this.h++] = (short)i;
                        n2 = 0;
                    }
                    if (s.charAt(i) != ' ') {
                        continue;
                    }
                }
                n3 = i + 1;
            }
            this.a[this.h++] = (short)length;
        }
        catch (Exception ex) {}
    }
    
    private static void a(final byte[] array, final int n, final short n2) {
        array[n] = (byte)n2;
        array[n + 1] = (byte)(n2 >> 8);
    }
    
    private static void a(final byte[] array, final int n, final int n2) {
        array[n] = (byte)n2;
        array[n + 1] = (byte)(n2 >> 8);
        array[n + 2] = (byte)(n2 >> 16);
        array[n + 3] = (byte)(n2 >>> 24);
    }
    
    static {
        c.a = 1000L;
        c.a = "/demoSpr.bin";
        c.b = "/demo.f";
        c.a = null;
        c.a = null;
    }
}
