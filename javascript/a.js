var __author__ = "kubik.augustyn@post.cz"

// import javax.microedition.lcdui.Graphics;
// import javax.microedition.lcdui.Image;

class a {
    constructor() {
        this.a = new int(4096)// public static int[] a;
        this.b = undefined// public byte[] a;
        this.c = undefined// public byte[] b;
        this.d = undefined// public short[] a;
        this.e = undefined// public byte[] c;
        this.f = undefined// public byte[] d;
        this.g = undefined// public byte[] e;
        this.h = undefined// public short[] b;
        this.i = undefined// public byte[] f;
        this.j = undefined// public int[][] a;
        this.k = undefined// public int[][] b;
        this.l = undefined// public int a;
        this.m = undefined// public int b;
        this.n = undefined// public boolean a;
        this.o = undefined// public short a;
        this.p = undefined// public byte[] g;
        this.q = undefined// public short[] c;
        this.r = undefined// public Image[][] a;
        this.s = undefined// public static int c;
        this.t = undefined// public static int d;
        this.u = undefined// public static byte[] h;
        this.v = undefined// public int e;
        this.w = -1// public static int f;
        this.x = -1// public static int g;
    }

    y() {//public a()
        this.v = 0//this.e = 0;
    }

    z(array, n) {//public final void a(final byte[] array, int n)
        try {// try {
            System.gc()// System.gc();
            n++// ++n;
            n++// ++n;
            n++// ++n;
            n++// ++n;
            n++// ++n;
            n++// ++n;
            var n2// final short n2;
            if ((n2 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))) > 0) {// if ((n2 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.b = new byte(n2 << 1), 0, this.b.length)// System.arraycopy(array, n, this.a = new byte[n2 << 1], 0, this.a.length);
                n += this.b.length// n += this.a.length;
            }// }
            var n3// final short n3;
            if ((n3 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))) > 0) {// if ((n3 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.f = new byte(n3 << 2), 0, this.f.length)// System.arraycopy(array, n, this.d = new byte[n3 << 2], 0, this.d.length);
                n += this.f.length// n += this.d.length;
            }// }
            var n4// final short n4;
            if ((n4 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))) > 0) {// if ((n4 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.c = new byte(n4)// this.b = new byte[n4];
                this.o - new short(n4)// this.a = new short[n4];
                for (var n5 = 0; n5 < n4; n5++) {// for (short n5 = 0; n5 < n4; ++n5) {
                    this.d[n5] = array[++n]// this.b[n5] = array[n++];
                    n++// ++n;
                    this.d[n5] = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))// this.a[n5] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }// }
                var n6 = n4 << 2// final int n6 = n4 << 2;
                this.e = new byte(n6)// this.c = new byte[n6];
                for (var i = 0; i < n6; i++) {// for (int i = 0; i < n6; ++i) {
                    this.e[i] = array[++n]// this.c[i] = array[n++];
                }// }
            }// }
            var n7// final short n7;
            if ((n7 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))) > 0) {// if ((n7 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                System.arraycopy(array, n, this.i = new byte(n7 * 5), 0, this.i.length)// System.arraycopy(array, n, this.f = new byte[n7 * 5], 0, this.f.length);
                n += this.i.length// n += this.f.length;
            }// }
            var n8// final short n8;
            if ((n8 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))) > 0) {// if ((n8 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.g = new byte(n8)// this.e = new byte[n8];
                this.h = new short(n8)// this.b = new short[n8];
                for (var n9 = 0; n9 < n8; n9++) {// for (short n9 = 0; n9 < n8; ++n9) {
                    this.g[n9] = new array[++n]// this.e[n9] = array[n++];
                    n++// ++n;
                    this.h[n9] = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))// this.b[n9] = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }// }
            }// }
            if (n2 <= 0) {// if (n2 <= 0) {
                System.gc()// System.gc();
                return // return;
            }// }
            var n10 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))// final short n10 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            this.l = (array[++n] & 0xFF)// this.a = (array[n++] & 0xFF);
            var n11 = array[++n] & 0xFF// final int n11 = array[n++] & 0xFF;
            this.k = new int2(16)// this.b = new int[16][];
            for (var j = 0; j < this.l; j++) {// for (int j = 0; j < this.a; ++j) {
                this.k[j] = new int(n11)// this.b[j] = new int[n11];
                switch (n10) {// switch (n10) {
                    case -30584:// case -30584: {
                        for (var k = 0; k < n11; k++) {// for (int k = 0; k < n11; ++k) {
                            var n12// final int n12;
                            if (((n12 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8) + ((array[n++] & 0xFF) << 16) + ((array[n++] & 0xFF) << 24)) & 0xFF000000)) {// if (((n12 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8) + ((array[n++] & 0xFF) << 16) + ((array[n++] & 0xFF) << 24)) & 0xFF000000) != 0xFF000000) {
                                this.n = true// this.a = true;
                            }// }
                            this.k[j][k] = n12// this.b[j][k] = n12;
                        }// }
                        break// break;
                    // }
                    case 17476:// case 17476: {
                        for (var l = 0; l < n11; l++) {// for (int l = 0; l < n11; ++l) {
                            var n13// final int n13;
                            if (((n13 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8)) & 0xF000)) {// if (((n13 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8)) & 0xF000) != 0xF000) {
                                this.n = true// this.a = true;
                            }// }
                            this.k[j][l] = ((n13 & 0xF000) << 16 | (n13 & 0xF000) << 12 | (n13 & 0xF00) << 12 | (n13 & 0xF00) << 8 | (n13 & 0xF0) << 8 | (n13 & 0xF0) << 4 | (n13 & 0xF) << 4 | (n13 & 0xF))// this.b[j][l] = ((n13 & 0xF000) << 16 | (n13 & 0xF000) << 12 | (n13 & 0xF00) << 12 | (n13 & 0xF00) << 8 | (n13 & 0xF0) << 8 | (n13 & 0xF0) << 4 | (n13 & 0xF) << 4 | (n13 & 0xF));
                        }// }
                        break// break;
                    // }
                    case 21781:// case 21781: {
                        for (var n14 = 0; n14 < n11; n14++) {// for (int n14 = 0; n14 < n11; ++n14) {
                            var n15 = (array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8)// final int n15 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            var n16 = -16777216// int n16 = -16777216;
                            if ((n15 & 0x8000) !== 0x8000) {// if ((n15 & 0x8000) != 0x8000) {
                                n16 = 0// n16 = 0;
                                this.n = true// this.a = true;
                            }// }
                            this.k[j][n14] = (n16 | (n15 & 0x7C00) << 9 | (n15 & 0x3E0) << 6 | (n15 & 0x1F) << 3)// this.b[j][n14] = (n16 | (n15 & 0x7C00) << 9 | (n15 & 0x3E0) << 6 | (n15 & 0x1F) << 3);
                        }// }
                        break// break;
                    // }
                    case 25861:// case 25861: {
                        for (var n17 = 0; n17 < n11; n17++) {// for (int n17 = 0; n17 < n11; ++n17) {
                            var n18 = (array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8)// final int n18 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            var n19 = -16777216// int n19 = -16777216;
                            if (n18 === 63519) {// if (n18 == 63519) {
                                n19 = 0// n19 = 0;
                                this.n = true// this.a = true;
                            }// }
                            this.k[j][n17] = (n19 | (n18 & 0xF800) << 8 | (n18 & 0x7E0) << 5 | (n18 & 0x1F) << 3)// this.b[j][n17] = (n19 | (n18 & 0xF800) << 8 | (n18 & 0x7E0) << 5 | (n18 & 0x1F) << 3);
                        }// }
                        break// break;
                    // }
                }// }
            }// }
            this.o = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))// this.a = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            if (n2 > 0) {// if (n2 > 0) {
                this.q = new short(n2)// this.c = new short[n2];
                var n20 = 0// int n20 = 0;
                var n21 = n// int n21 = n;
                for (var n22 = 0; n22 < n2; n22++) {// for (short n22 = 0; n22 < n2; ++n22) {
                    var n23 = ((array[++n21] & 0xFF) + ((array[++n21] & 0xFF) << 8))// final short n23 = (short)((array[n21++] & 0xFF) + ((array[n21++] & 0xFF) << 8));
                    this.q[n22] = n20// this.c[n22] = (short)n20;
                    n21 += n23// n21 += n23;
                    n20 += n23// n20 += n23;
                }// }
                this.p = new byte(n20)// this.g = new byte[n20];
                for (var n24 = 0; n24 < n2; n24++) {// for (short n24 = 0; n24 < n2; ++n24) {
                    var n25 = ((array[++n] & 0xFF) + ((array[++n] & 0xFF) << 8))// final short n25 = (short)((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                    System.arraycopy(array, n, thisp, this.q[n24] & 0xFFFF, n25)// System.arraycopy(array, n, this.g, this.c[n24] & 0xFFFF, n25);
                    n += n25// n += n25;
                }// }
            }// }
            System.gc()// System.gc();
        }// }
        catch (ex) {// catch (Exception ex) {
            console.log(ex, "ex.printStackTrace()")// ex.printStackTrace();
        }// }
    }

    A(b, n, n2, n3) {//public final void a(final int b, final int n, int n2, final int n3)
        if (this.a === null) {// if (this.a == null) {
            return// return;
        }// }
        if (n2 === -1) {// if (n2 == -1) {
            n2 = (this.a.length >> 1) - 1// n2 = (this.a.length >> 1) - 1;
        }// }
        if (this.r === null) {// if (this.a == null) {
            this.r = new Image(this.l)// this.a = new Image[this.a][];
        }// }
        if (this.r[b] === null) {// if (this.a[b] == null) {
            this.r[b] = new Image(this.a.length >> 1)// this.a[b] = new Image[this.a.length >> 1];
        }// }
        if (n3 >= 0) {// if (n3 >= 0) {
            for (var i = n; i <= 2; i++) {// for (int i = n; i <= n2; ++i) {
                this.r[b][i] = this.r[n3][i]// this.a[b][i] = this.a[n3][i];
            }// }
        }// }
        else {// else {
            var b2 = this.m + 0// final int b2 = this.b;
            this.m = b// this.b = b;
            System.gc();// System.gc();
            for (var j = n; j <= n2; j++) {// for (int j = n; j <= n2; ++j) {
                var n4 = j << 1// final int n4 = j << 1;
                var n5 = this.a[n4] & 0xFF// final int n5 = this.a[n4] & 0xFF;
                var n6 = this.a[n4 + 1] & 0xFF// final int n6 = this.a[n4 + 1] & 0xFF;
                if (n5 > 0) {// if (n5 > 0) {
                    if (n6 > 0) {// if (n6 > 0) {
                        var a// final int[] a;
                        if ((a = this.B(j)) !== null) {// if ((a = this.a(j)) != null) {
                            var b3 = false// boolean b3 = false;
                            for (var n7 = n5 * n6, k = 0; k < n7; k++) {// for (int n7 = n5 * n6, k = 0; k < n7; ++k) {
                                if ((a[k] & 0xFF000000) !== 0xFF000000) {// if ((a[k] & 0xFF000000) != 0xFF000000) {
                                    b3 = true// b3 = true;
                                    break// break;
                                }// }
                            }// }
                            this.r[b][j] = new Image().createRGBImage(a, n5, n6, b3)// this.a[b][j] = Image.createRGBImage(a, n5, n6, b3);
                        }// }
                    }// }
                }// }
            }// }
            System.gc();// System.gc();
            this.m = b2// this.b = b2;
        }// }
        System.gc();// System.gc();
    }

    B(n) {//public final void a(final int n)
        if (this.a === null) {// if (this.a == null) {
            return// return;
        }// }
        if (this.r === null) {// if (this.a == null) {
            return// return;
        }// }
        if (this.r[n] === null) {// if (this.a[n] == null) {
            return// return;
        }// }
        for (var i = 0; i < this.r.length; i++) {// for (int i = 0; i < this.a[n].length; ++i) {
            this.r[n][i] = null// this.a[n][i] = null;
        }// }
        this.b[n] = null// this.a[n] = null;
        this.l--// --this.a;
    }

    toString() {//public final String toString()
        // new String();
        var i = 0// int i = 0;
        for (var j = 0; j < this.a.length / 2; j++) {// for (int j = 0; j < this.a.length / 2; ++j) {
            i += 2 * (this.a[2 * j] & 0xFF) * (this.a[2 * j + 1] & 0xFF)// i += 2 * (this.a[2 * j] & 0xFF) * (this.a[2 * j + 1] & 0xFF);
        }// }
        return "raw/full:" + this.p.length + "/" + i// return "raw/full: " + this.g.length + "/" + i;
    }

    C(n, n2) {//public final int a(final int n, final int n2)
        return this.i[(this.c[n]+n2)*5+1]&0xFF//return this.f[(this.b[n] + n2) * 5 + 1] & 0xFF;
    }

    D() {

    }

    E() {

    }

    F() {

    }

    G() {

    }

    H() {

    }

    I() {

    }

    J() {

    }

    K() {

    }

    L() {

    }

    M() {

    }

    N() {

    }

    O() {

    }
}
