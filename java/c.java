import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class c
{
    public static long a;
    public static String a;
    public static String b;
    public static a[] a;
    public byte[][] a;
    public int a;
    public long b;
    public byte[] a;
    public int b;
    public boolean a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean b;
    public i a;
    public final short[] a;
    public int h;
    
    public c(final i a) {
        this.a = null;
        this.a = 0;
        this.a = null;
        this.a = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.b = false;
        this.a = null;
        this.a = new short[16];
        this.a = a;
    }
    
    private void a(final Graphics graphics, final byte[] array, final int n) {
        if (array == null) {
            return;
        }
        final byte b;
        switch (b = array[n + 0]) {
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
                graphics.fillRect(((this.a.aP * 24 - this.a.ar) * (5 - b2) + this.c * b2) / 5, ((this.a.aQ * 24 - this.a.as) * (5 - b2) + this.d * b2) / 5, 102 * b2 / 5, 38 * b2 / 5);
            }
            case 1: {
                int b3 = this.b;
                final short n2 = (short)i.a(array, n + 2);
                final short n3 = (short)i.a(array, n + 4);
                final short n4 = (short)i.a(array, n + 6);
                short n5 = (short)i.a(array, n + 8);
                short n6 = (short)i.a(array, n + 10);
                if (n5 == 10000) {
                    n5 = (short)this.a.at;
                }
                if (n6 == 10000) {
                    n6 = (short)this.a.au;
                }
                if (b3 > n4) {
                    b3 = n4;
                }
                final short n7 = (short)(n2 - 108);
                final short n8 = (short)(n3 - 108);
                this.a.at = (short)((n7 * b3 + n5 * (n4 - b3)) / n4);
                this.a.au = (short)((n8 * b3 + n6 * (n4 - b3)) / n4);
                final int n9 = this.a.av * 24 - 240;
                final int as = this.a.aw * 24 - 320 + 80;
                Label_0517: {
                    i i;
                    int at;
                    if (this.a.at > n9) {
                        i = this.a;
                        at = n9;
                    }
                    else {
                        if (this.a.at >= 0) {
                            break Label_0517;
                        }
                        i = this.a;
                        at = 0;
                    }
                    i.at = at;
                }
                Label_0556: {
                    i j;
                    int au;
                    if (this.a.au > as) {
                        j = this.a;
                        au = as;
                    }
                    else {
                        if (this.a.au >= 0) {
                            break Label_0556;
                        }
                        j = this.a;
                        au = 0;
                    }
                    j.au = au;
                }
                this.a.ar = this.a.at;
                this.a.as = this.a.au;
                if (this.a.ar > n9) {
                    final i a = this.a;
                    a.ar -= n9;
                }
                if (this.a.as > as) {
                    this.a.as = as;
                    return;
                }
                if (this.a.as < 0) {
                    return;
                }
                break;
            }
            case 13: {
                int b4 = this.b;
                final short n10 = (short)i.a(array, n + 2);
                final short n11 = (short)i.a(array, n + 4);
                final short n12 = (short)i.a(array, n + 6);
                final short n13 = (short)i.a(array, n + 8);
                final short n14 = (short)i.a(array, n + 10);
                if (b4 > n12) {
                    b4 = n12;
                }
                final short c = (short)((n10 * b4 + n13 * (n12 - b4)) / n12);
                final short d = (short)((n11 * b4 + n14 * (n12 - b4)) / n12);
                if (b == 13) {
                    this.c = c;
                    this.d = d;
                    return;
                }
                break;
            }
            case 4: {
                int b5 = this.b;
                final short n15 = (short)i.a(array, n + 2);
                final short n16 = (short)i.a(array, n + 4);
                final short n17 = (short)i.a(array, n + 6);
                final short n18 = (short)i.a(array, n + 6);
                final short n19 = (short)i.a(array, n + 14);
                if (b5 > n19) {
                    b5 = n19;
                }
                c.a[(short)i.a(array, n + 10)].a(graphics, (short)i.a(array, n + 12), (short)((n17 * b5 + n15 * (n19 - b5)) / n19), (short)((n18 * b5 + n16 * (n19 - b5)) / n19), 0, 0, 0);
            }
            case 27: {
                i.a[41].e = 2;
                final int n20 = array[n + 6] & 0xFF;
                i.a(graphics, 6, 229, 226, 35, 73, 1, i.a(i.a[41], i.a[70], 0) + 10, 15);
                String s = null;
                try {
                    s = new String(array, n + 8, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex) {}
                this.a(s, 196);
                this.a(graphics, s, 22, 231, n20, n20 + 2);
                i.a[41].a(graphics, i.a[70], 19, 211, 20);
                if (i.aO / 2 % 4 < 2) {
                    graphics.drawImage(i.b[0][9], 223, 220, 17);
                    return;
                }
                break;
            }
            case 2: {
                i.a[41].e = 2;
                final short n21 = (short)i.a(array, n + 6);
                int n22;
                if ((n22 = (short)i.a(array, n + 4)) == 10000) {
                    n22 = -240;
                }
                final int n23 = array[n + 8] & 0xFF;
                final int n24 = array[n + 9] & 0xFF;
                final int n25 = n23 * i.a(i.a[41]) + 4 - 2;
                i.a(graphics, n22, n21, 226, n25, 73, 0);
                String s2 = null;
                try {
                    s2 = new String(array, n + 11, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex2) {}
                this.a(s2, 222);
                this.a(graphics, s2, n22 + 2, n21 + 2, n24, n24 + n23);
                if (i.aO / 2 % 4 < 2) {
                    graphics.drawImage(i.b[0][9], n22 + 226 - 10, n21 + n25 - 5, 17);
                }
                graphics.setClip(0, 0, 240, 320);
                break;
            }
        }
    }
    
    private void a(final byte[] array, final int n) {
        switch (array[n + 0]) {
            case 7: {
                array[n + 1] = 1;
            }
            case 27: {
                if (i.D) {
                    return;
                }
                String s = null;
                try {
                    s = new String(array, n + 8, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex) {}
                this.a(s, 196);
                final short n2 = (short)(array[n + 6] & 0xFF);
                if (n2 + 2 >= this.h) {
                    array[n + 7] = 1;
                    return;
                }
                array[n + 6] = (byte)(n2 + 2);
            }
            case 2: {
                String s2 = null;
                try {
                    s2 = new String(array, n + 11, (short)i.a(array, n + 2), "ISO-8859-1");
                }
                catch (Exception ex2) {}
                this.a(s2, 222);
                final short n3 = (short)(array[n + 9] & 0xFF);
                final short n4 = (short)(array[n + 8] & 0xFF);
                byte[] array2;
                int n5;
                byte b;
                if (n3 + n4 >= this.h) {
                    array2 = array;
                    n5 = n + 10;
                    b = 1;
                }
                else {
                    array2 = array;
                    n5 = n + 9;
                    b = (byte)(n3 + n4);
                }
                array2[n5] = b;
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
            int n = 2 + b * 4;
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + b2 * 4);
                this.a(this.a, n);
                n += b3;
            }
        }
        else {
            this.a(this.a, 0);
        }
    }
    
    public final void a(final Graphics graphics) {
        if (this.b) {
            return;
        }
        switch (this.a()) {
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
                i.a[41].a(graphics, i.a[53], 5, 315, 36);
                break;
            }
        }
        if (this.a[0] == 0) {
            final byte b = this.a[1];
            int n = 2 + b * 4;
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + b2 * 4);
                this.a(graphics, this.a, n);
                n += b3;
            }
        }
        else {
            this.a(graphics, this.a, 0);
        }
        if (this.a) {
            graphics.setColor(0);
            graphics.fillRect(this.c - 3, this.d - 3, 109, 45);
            c.a[this.f].a(graphics, 0, this.b % c.a[this.f].a(0), this.c, this.d, 0, 0, 0);
            c.a[0].a(graphics, this.e, this.c + 0, this.d, 0, 0, 0);
            if (this.g >= 0) {
                c.a[1].a(graphics, this.g, this.c + 90, this.d - 6, 0, 0, 0);
            }
        }
    }
    
    public final byte[] a() {
        this.a(this.a);
        this.a = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.b = false;
        this.a = 0;
        this.b = System.currentTimeMillis();
        return this.b();
    }
    
    private void b(final byte[] array, final int n) {
        if (array[n + 0] != 0) {
            array[n + 1] = 0;
            byte[] array2 = null;
            int n2 = 0;
            int n3 = 0;
            switch (array[n + 0]) {
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
        int n4 = n + 2 + b * 4;
        for (byte b2 = 0; b2 < b; ++b2) {
            final int b3 = i.b(array, n + 2 + b2 * 4);
            this.b(array, n4);
            n4 += b3;
        }
    }
    
    private void a(final byte[][] array) {
        for (int i = 0; i < array.length; ++i) {
            this.b(array[i], 0);
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
            int n = 2 + b * 4;
            for (byte b2 = 0; b2 < b; ++b2) {
                final int b3 = i.b(this.a, 2 + b2 * 4);
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
        final short n2 = array[n + 0];
        if (this.b) {
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
                this.a = (n2 == 14);
                array[n + 1] = 1;
            }
            case 12: {
                final short c = (short)i.a(array, n + 2);
                final short d = (short)i.a(array, n + 4);
                this.c = c;
                this.d = d;
                if (this.b > 5) {
                    array[n + 1] = 1;
                    this.a = true;
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
                final byte j = array[n + 2];
                if (this.b == 0) {
                    this.a.aS = ((this.a.aS & 0xFFFFFFF8) | j);
                    this.a.j = j;
                }
                else if (this.a.aR <= 0) {
                    this.a.j = 0;
                    array[n + 1] = 1;
                }
                this.a.c();
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
                    a(array, n + 8, (short)this.a.at);
                }
                if ((short)i.a(array, n + 10) == 10000) {
                    a(array, n + 10, (short)this.a.au);
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
            int n = 2 + b2 * 4;
            for (byte b3 = 0; b3 < b2; ++b3) {
                final int b4 = i.b(this.a, 2 + b3 * 4);
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
    
    private byte a() {
        if (this.a == null) {
            return -1;
        }
        return this.a[0];
    }
    
    public final void a(final int n) {
        try {
            final String b = c.b;
            this.a.getClass();
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
                            c.a = new a[n11];
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
                                    (c.a[n13] = new a()).a(array3, 0);
                                    c.a[n13].a(0, 0, -1, -1);
                                    c.a[n13].g = null;
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
                        Label_1813: {
                            byte[] array7 = null;
                            switch (n18) {
                                case 18: {
                                    final short n19 = (short)(array[n3++] & 0xFF);
                                    final int n20 = (array[n3++] & 0xFF) + ((array[n3++] & 0xFF) << 8) + ((array[n3++] & 0xFF) << 16);
                                    a(array6 = new byte[8], 2, n19);
                                    a(array6, 3, n20);
                                    array6[7] = 0;
                                    break Label_1813;
                                }
                                case 16:
                                case 17: {
                                    final short n21 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n22 = (short)(array[n3++] & 0xFF);
                                    a(array6 = new byte[6], 2, n21);
                                    a(array6, 4, n22);
                                    array6[5] = 0;
                                    break Label_1813;
                                }
                                case 11: {
                                    final short n23 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n24 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[6], 2, n23);
                                    a(array6, 4, n24);
                                    break Label_1813;
                                }
                                case 12: {
                                    final short n25 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n26 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[6], 2, n25);
                                    a(array6, 4, n26);
                                    break Label_1813;
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
                                    break Label_1813;
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
                                    break Label_1813;
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
                                    break Label_1813;
                                }
                                case 6: {
                                    final int b4 = i.b(array, n3);
                                    n3 += 4;
                                    a(array6 = new byte[6], 2, b4);
                                    break Label_1813;
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
                                    break Label_1813;
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
                                    break Label_1813;
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
                                    break Label_1813;
                                }
                                case 27: {
                                    final short n49 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[8 + n49], 2, n49);
                                    a(array6, 4, (short)10000);
                                    array6[7] = (array6[6] = 0);
                                    System.arraycopy(array, n3, array6, 8, n49);
                                    n3 += n49;
                                    break Label_1813;
                                }
                                case 2: {
                                    final short n50 = (short)(array[n3++] & 0xFF);
                                    final short n51 = (short)i.a(array, n3);
                                    n3 += 2;
                                    final short n52 = (short)i.a(array, n3);
                                    n3 += 2;
                                    a(array6 = new byte[11 + n52], 2, n52);
                                    a(array6, 4, (short)10000);
                                    a(array6, 6, n51);
                                    array6[8] = (byte)n50;
                                    array6[10] = (array6[9] = 0);
                                    System.arraycopy(array, n3, array6, 11, n52);
                                    n3 += n52;
                                    break Label_1813;
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
                                    break Label_1813;
                                }
                                case 10: {
                                    (array6 = new byte[3])[2] = (byte)(array[n3++] & 0xFF);
                                    break Label_1813;
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
                            array6[0] = (byte)(n18 & 0xFF);
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
                            (array8 = new byte[2 + array4.length * 4 + n56])[0] = 0;
                            array8[1] = (byte)array4.length;
                            int n57 = 2 + array4.length * 4;
                            for (int k = 0; k < array4.length; ++k) {
                                a(array8, 2 + k * 4, array4[k].length);
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
    
    private void a(final Graphics graphics, final String s, final int n, final int n2, final int n3, int h) {
        final int n4 = i.a[41].e + (i.a[41].a[1] & 0xFF);
        if (h > this.h) {
            h = this.h;
        }
        for (int i = n3; i < h; ++i) {
            a.f = ((i > 0) ? (this.a[i - 1] + 1) : 0);
            a.g = this.a[i];
            i.a[41].a(graphics, s, n, n2 + (i - n3) * n4, 4);
        }
        a.f = -1;
        a.g = -1;
    }
    
    private void a(final String s, final int n) {
        this.h = 0;
        final int length = s.length();
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < length; ++i) {
            Label_0424: {
                final char char1;
                if ((char1 = s.charAt(i)) > ' ') {
                    final int n4 = a.h[char1] & 0xFF;
                    n2 += (i.a[41].a[(i.a[41].d[n4 << 2] & 0xFF) << 1] & 0xFF) - i.a[41].d[(n4 << 2) + 1] + i.a[41].d[1];
                }
                else if (char1 == ' ' && i + 1 < length && (s.charAt(i + 1) == '?' || s.charAt(i + 1) == '!' || s.charAt(i + 1) == ':')) {
                    final int n5 = n2 + ((i.a[41].a[0] & 0xFF) + i.a[41].d[1]);
                    final int n6 = a.h[s.charAt(i + 1)] & 0xFF;
                    n2 = n5 + ((i.a[41].a[(i.a[41].d[n6 << 2] & 0xFF) << 1] & 0xFF) - i.a[41].d[(n6 << 2) + 1] + i.a[41].d[1]);
                }
                else {
                    if (char1 == ' ') {
                        n2 += (i.a[41].a[0] & 0xFF) + i.a[41].d[1];
                        break Label_0424;
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
    
    private static void a(final byte[] array, final int n, final short n2) {
        array[n] = (byte)(n2 & 0xFF);
        array[n + 1] = (byte)(n2 >> 8 & 0xFF);
    }
    
    private static void a(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 & 0xFF);
        array[n + 1] = (byte)(n2 >> 8 & 0xFF);
        array[n + 2] = (byte)(n2 >> 16 & 0xFF);
        array[n + 3] = (byte)(n2 >> 24 & 0xFF);
    }
    
    static {
        c.a = 1000L;
        c.a = "/demoSpr.bin";
        c.b = "/demo.f";
        c.a = null;
    }
}
