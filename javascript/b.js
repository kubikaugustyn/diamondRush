var __author__ = "kubik.augustyn@post.cz"

//import javax.microedition.lcdui.Graphics;

class b {//public final class b
    constructor() {
        this.a = undefined//public static byte[][] a;
        this.b = undefined//public static byte a;
        this.c = undefined//public static byte b;
        this.d = 0//public static int a;
        this.e = undefined//public static byte[][] b;
        this.f = 0//public static byte c;
        this.g = 2//public static byte d;
        this.h = false//public static boolean a;
        this.i = 0//public static int b;
        this.clsD = new d()
    }

    j(n) {//public static void a(final int n)
        this.d += this.i//b.a += b.b;
        if (this.d > 24) {//if (b.a > 24) {
            this.d = 0//b.a = 0;
            for (var i = 12; i >= 1; i--) {//for (int i = 12; i >= 1; --i) {
                for (var j = 0; j < 12; j++) {//for (int j = 0; j < 12; ++j) {
                    this.a[j][i] = this.a[j][i - 1]//b.a[j][i] = b.a[j][i - 1];
                }//}
            }//}
            this.k(n)//b(n);
        }
        if (this.h) {//if (b.a) {
            this.f += this.g//b.c += b.d;
            //??????
            if (this.f > 24) {//if (b.c > 24) {
                this.f = 0//b.c = 0;
                for (var k = 12; k >= 1; k--) {//for (int k = 12; k >= 1; --k) {
                    for (var l = 0; l < 12; l++) {//for (int l = 0; l < 12; ++l) {
                        this.a[l][k] = this.a[l][k - 1]//b.b[l][k] = b.b[l][k - 1];
                    }//}
                }//}
                this.k(n)//b(n);
            }
        }
    }

    k(n) {//public static void b(final int n)
        for (var i = 0; i < 12; i++) {//for (int i = 0; i < 12; ++i) {
            this.a[i][0] = 0//b.a[i][0] = 0;
        }//}
        if (this.h) {//if (b.a) {
            for (var j = 0; j < 12; j++) {//for (int j = 0; j < 12; ++j) {
                this.e[j][0] = 0//b.b[j][0] = 0;
            }//}
        }//}
        for (var k = 0; k < n; k++) {//for (int k = 0; k < n; ++k) {
            var a//int a;
            do {//do {
                a = this.clsD.a(0, 12)//a = d.a(0, 12);
            } while (this.a[a][0] !== 0)//} while (b.a[a][0] != 0);
            this.a[a][0] = this.clsD.a(1, 3)//b.a[a][0] = (byte)d.a(1, 3);
        }//}
        if (this.h) {//if (b.a) {
            for (var l = 0; l < n; l++) {//for (int l = 0; l < n; ++l) {
                var a2//int a2;
                do {//do {
                    a2 = this.clsD.a(0, 12)//a2 = d.a(0, 12);
                } while (this.e[a2][0] !== 0)//} while (b.b[a2][0] != 0);
                this.e[a2][0] = this.clsD.a(1, 3)//b.b[a2][0] = (byte)d.a(1, 3);
            }//}
        }//}
    }

    l(graphics) {//public static void a(final Graphics graphics)
        for (var myI = 0; myI < 12; myI++) {// for (int i = 0; i < 12; ++i) {
            for (var j = 0; j < 13; j++) {//     for (int j = 0; j < 13; ++j) {
                var clsA//         a a;
                var graphics2//         Graphics graphics2;
                var a2//         int a2;
                if (this.a[myI][j] === 1) {//         if (b.a[i][j] == 1) {
                    clsA = i.a[i.a(2)]//             a = i.a[i.a(2)];
                    graphics2 = graphics//             graphics2 = graphics;
                    a2 = this.d//             a2 = b.a;
                }//         }
                else {//         else {
                    if (this.a[myI][j] !== 2) {//if (b.a[i][j] != 2) {
                        continue//continue;
                    }//}
                    clsA = i.a[i.a(2)]//a = i.a[i.a(2)];
                    graphics2 = graphics//graphics2 = graphics;
                    a2 = 0//a2 = 0;
                }//         }
                clsA.a(graphics2, a2, i * 24, (j - 1) * 24 + this.d, 0, 0, 0)//         a.a(graphics2, a2, i * 24, (j - 1) * 24 + b.a, 0, 0, 0);
            }//     }
        }// }
        if (this.h) {// if (b.a) {
            for (var k = 0; k < 12; k++) {// for (int k = 0; k < 12; ++k) {
                for (var l = 0; l < 13; l++) {// for (int l = 0; l < 13; ++l) {
                    // if(this.e[k][l]!==1) {// if (b.b[k][l] != 1) {
                    // if (b.b[k][l] != 2) {
                    // continue;
                    // }
                    // }// }
                    i.a[i.a(2)].a(graphics, 0, k * 24, (l - 1) * 24 + this.f, 0, 0, 0)// i.a[i.a(2)].a(graphics, 0, k * 24, (l - 1) * 24 + b.c, 0, 0, 0);
                }// }
            }// }
        }// }
        this.d = (this.d + 1) % this.i// b.a = (b.a + 1) % b.b;
    }
}
