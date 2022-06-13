import javax.microedition.lcdui.Canvas;
import java.io.ByteArrayInputStream;
import java.util.Hashtable;
import javax.microedition.rms.RecordStore;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.game.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class i extends GameCanvas implements Runnable
{
    public static i a;
    public int a1;
    public int b;
    public boolean a2;
    public boolean b1;
    public int c;
    public int d;
    public String a3;
    public boolean c1;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String b2;
    public String c2;
    public int j;
    public boolean d1;
    public boolean e1;
    public byte a4;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public static boolean[] a5;
    public int r;
    public static boolean[] b3;
    public boolean f1;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean g1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean h1;
    public boolean i1;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public byte b4;
    public byte c3;
    public byte d2;
    public byte e2;
    public byte f2;
    public byte g2;
    public boolean j1;
    public int P;
    public int Q;
    public int R;
    public static byte[] a6;
    public static byte[] b5;
    public static byte[] c4;
    public int S;
    public int T;
    public byte h2;
    public static boolean k1;
    public int U;
    public int V;
    public static int W;
    public boolean l1;
    public boolean m1;
    public int X;
    public int Y;
    public static byte[] d3;
    public byte i2;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public boolean n1;
    public int ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public int aj;
    public int ak;
    public static byte[] e3;
    public int al;
    public int am;
    public int an;
    public byte j2;
    public byte k2;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public int aw;
    public int ax;
    public int ay;
    public int az;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public int aJ;
    public int aK;
    public int aL;
    public static byte l3;
    public int aM;
    public static byte m2;
    public boolean s1;
    public static int aN;
    public static int aO;
    public long a7;
    public boolean t1;
    public int aP;
    public int aQ;
    public int aR;
    public int aS;
    public int aT;
    public boolean u1;
    public int aU;
    public int aV;
    public boolean v1;
    public byte n2;
    public int aW;
    public long b6;
    public int aX;
    public int aY;
    public int aZ;
    public int ba;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public byte o2;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bm;
    public boolean w1;
    public int bn;
    public String d4;
    public boolean x1;
    public int bo;
    public int bp;
    public int bq;
    public int br;
    public int bs;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public int bz;
    public int bA;
    public int bB;
    public int bC;
    public boolean y1;
    public int bD;
    public int bE;
    public int bF;
    public int bG;
    public int bH;
    public int bI;
    public int bJ;
    public int bK;
    public int bL;
    public int bM;
    public int bN;
    public int bO;
    public int bP;
    public int bQ;
    public int bR;
    public int bS;
    public int bT;
    public int bU;
    public int bV;
    public int bW;
    public int bX;
    public int bY;
    public int bZ;
    public int ca;
    public int cb;
    public boolean z1;
    public int cc;
    public int cd;
    public InputStream a8;
    public byte p2;
    public byte q2;
    public boolean A1;
    public int ce;
    public int cf;
    public int cg;
    public int ch;
    public Graphics a9;
    public static Image a10;
    public static Image b7;
    public static Image c5;
    public static Image[][] a11;
    public static Image[][] b8;
    public static a[] a12;
    public static a a13_class_a;
    public static byte[] f3;
    public static g[] a14;
    public static a b9_class_a;
    public static byte[] g3;
    public static byte[] h3;
    public long c6;
    public long d5;
    public boolean B1;
    public static byte[] i3;
    public static byte[] j3;
    public static int[][] a15;
    public static int[][] b10;
    public static byte[][] a16;
    public static byte[][] b11;
    public static byte[][] c7;
    public static byte[] k3;
    public boolean C1;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public static byte[] l2;
    public static byte[] m3;
    public static int cm;
    public static int cn;
    public static byte[] n3;
    public static int[][] c8;
    public static int[][] d6;
    public static byte[][] d7;
    public static byte[][] e4;
    public static byte[] o3;
    public final h a17;
    public c a18;
    public static c[] a19;
    public static byte[] p3;
    public final Thread a20_class_Thread;
    public static GloftDIRU a21_class_GloftDIRU;
    public int co;
    public int cp;
    public int cq;
    public int cr;
    public int cs;
    public static a c9_class_a;
    public int ct;
    public byte r2;
    public static boolean D1;
    public long e5;
    public long f4;
    public long g4;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public int cu;
    public int cv;
    public int cw;
    public boolean N1;
    public boolean O1;
    public int cx;
    public int cy;
    public boolean P1;
    public boolean Q1;
    public int cz;
    public int cA;
    public boolean R1;
    public boolean S1;
    public int cB;
    public static Image d8_class_Imagr;
    public static Graphics b12_class_Graphics;
    public static int cC;
    public static int cD;
    public static int cE;
    public static int cF;
    public static int cG;
    public static int cH;
    public int cI;
    public int cJ;
    public int cK;
    public int cL;
    public static Image e6_class_Image;
    public static int cM;
    public static int cN;
    public static int cO;
    public int cP;
    public int cQ;
    public int cR;
    public int cS;
    public int cT;
    public int cU;
    public int cV;
    public boolean T1;
    public long h4;
    public int cW;
    public int cX;
    public int cY;
    public int cZ;
    public int da;
    public int db;
    public int dc;
    public int dd;
    public long i4;
    public int de;
    public static Image f5;
    public static boolean U1;
    public static boolean V1;
    public long j4;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean aa1;
    public int df;
    public int[] a20;
    public static byte s2;
    public static final int[] b12;
    public static int dg;
    public static int dh;
    public static int di;
    public byte t2;
    public byte u2;
    public boolean ab1;
    public static byte[] q3;
    public static byte[] r3;
    public long k4;
    public boolean ac1;
    public int dj;
    public boolean ad1;
    public long l4;
    public long m4;
    public boolean ae1;
    public boolean af1;
    public long n4;
    public boolean ag1;
    public boolean ah1;
    public boolean ai1;
    public boolean aj1;
    public String e6;
    public int dk;
    public int dl;
    public int dm;
    public int dn;
    public static boolean ak1;
    public static int do1;
    public static int dp;
    public static int dq;
    public static int dr;
    public e a21_class_e;
    public boolean al1;
    public boolean am1;
    public int ds;
    public int dt;
    public int du;
    public byte v2;
    public int dv;
    public int dw;
    public int dx;
    public int dy;
    public int dz;
    public byte w2;
    public int dA;
    public int dB;
    public byte x2;
    public byte y2;
    public int dC;
    public int dD;
    public int dE;
    public byte z2;
    public int dF;
    public int dG;
    public int dH;
    public byte A2;
    public int dI;
    public int dJ;
    public static a d;
    public static int[][] e;
    public static long[] a;
    public static long[] b;
    public static int[][] f;
    public static long[] c;
    public static long[] d;
    public static boolean an;
    public int dK;
    public int dL;
    public static long[][] a;
    public static StringBuffer a;
    public static StringBuffer b;
    public static StringBuffer c;
    public static Image g;
    public static Graphics c;
    public int dM;
    public int dN;
    public int dO;
    public int dP;
    public int dQ;
    public int dR;
    public int dS;
    public int dT;
    public int dU;
    public int dV;
    public int dW;
    public boolean ao;
    public boolean ap;
    public int dX;
    public int dY;
    public int dZ;
    public int ea;
    public static int eb;
    public int ec;
    public int ed;
    public int ee;
    public int ef;
    public int eg;
    public int eh;
    public int ei;
    public int ej;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public int[] c;
    public int ek;
    public int el;
    public int em;
    public int en;
    public int eo;
    public boolean at;
    public boolean au;
    public boolean av;
    public long o;
    public int ep;
    public String f;
    public StringBuffer d;
    public boolean aw;
    public boolean ax;
    public int eq;
    public int er;
    public static final short[][] a;
    public static final int[] d;
    public static final int[][] g;
    public static String[] a;
    public static byte[] s;
    public static final String[] b;
    public static int es;
    public long p;
    public String g;
    public int et;
    public int eu;
    public int ev;
    public int ew;
    
    public i(final GloftDIRU a) {
        super(false);
        this.a = 40;
        this.a = false;
        this.c = 0;
        this.d = f.a[this.c];
        this.a = "";
        this.c = true;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = this.f;
        this.i = this.g;
        this.b = "";
        this.c = "";
        this.j = -1;
        this.d = false;
        this.e = true;
        this.a = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.f = false;
        this.s = -1;
        this.t = 10;
        this.u = 10;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.g = false;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.h = false;
        this.i = false;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.b = 1;
        this.c = 1;
        this.d = 3;
        this.e = 3;
        this.f = 2;
        this.g = 0;
        this.j = false;
        this.V = 0;
        this.l = true;
        this.i = 0;
        this.Z = 0;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.j = 0;
        this.k = 0;
        this.s = false;
        this.aY = 0;
        this.ba = 0;
        this.bm = -1;
        this.bD = 0;
        this.bW = 0;
        this.bX = 0;
        this.bY = 0;
        this.bZ = 0;
        this.ca = 0;
        this.cb = 0;
        this.A = false;
        this.B = false;
        this.a = null;
        this.co = -1;
        this.cp = -1;
        this.r = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.cu = -1;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.cP = -1;
        this.cQ = -1;
        this.cR = -1;
        this.cS = -1;
        this.cT = -1;
        this.cU = -1;
        this.cV = -1;
        this.T = true;
        this.cZ = 2;
        this.da = 0;
        this.dc = 3;
        this.dd = -1;
        this.i = 0L;
        this.de = -1;
        this.j = 0L;
        this.aa = false;
        this.df = 0;
        this.a = new int[] { 0, 0, 0, 0, 0 };
        this.ab = false;
        this.k = 0L;
        this.dj = 0;
        this.l = 0L;
        this.m = 0L;
        this.ae = false;
        this.af = false;
        this.aj = false;
        this.dk = 0;
        this.al = false;
        this.am = true;
        this.ds = -1;
        this.dB = -1;
        this.x = 3;
        this.dM = 100;
        this.ao = true;
        this.aq = true;
        this.ar = true;
        this.as = true;
        this.em = 2;
        this.eo = 2;
        this.au = true;
        this.av = true;
        this.o = 0L;
        this.ep = -1;
        this.d = new StringBuffer();
        this.aw = true;
        this.ax = true;
        this.p = System.currentTimeMillis();
        i.a = this;
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        i.a = new g[6];
        i.a = new a[61];
        this.ci();
        i.a = new Image[33][];
        i.b = new Image[2][];
        i.a = a;
        this.a = new h();
        ((Canvas)this).setFullScreenMode(i.k = true);
        this.B();
        (this.a = new Thread(this)).start();
    }
    
    private void a(final int n, final int n2, final int n3) {
        this.aA = -1;
        this.aD = -1;
        this.aC = -1;
        final int f;
        if ((f = i.a[((this.aS & 0x4000) == 0x0) ? 0 : 3].f) == 40) {
            return;
        }
        if (f == 48) {
            return;
        }
        if (f == 47) {
            return;
        }
        if ((this.b <= 0L && this.aW == 0 && this.bi == 0 && this.k != 6 && (this.aS & 0x70) == 0x0) || this.aT > 0) {
            ++this.bc;
            this.a((byte)(this.n - n));
            if (this.bl == 0 && this.n == 0) {
                this.l = 0L;
                this.co = this.bE;
                this.cp = this.bF;
                i.c = null;
            }
            this.aS = ((this.aS & 0xFFFFFF8F) | n2);
            this.C(5);
            switch (n2) {
                case 16: {
                    final int n4 = 0;
                    this.ak = n4;
                    this.aj = n4;
                    this.aT = 5;
                    i.a[this.aP][this.aQ] = 9;
                    this.aS = ((this.aS & 0xFFFFFF8F) | 0x0);
                    i.b[this.aP][this.aQ] = 138412032;
                    i.c[this.aP][this.aQ] = 24;
                }
                case 64: {
                    this.n(1000);
                }
                default: {
                    this.n(10);
                    if (n3 != 0) {
                        byte b = (byte)n3;
                        do {
                            final int ap = this.aP - i.g[b];
                            final int aq = this.aQ - i.g[b + 8];
                            if (i.a[ap][aq] < 0 && (byte)(i.a[ap][aq] & 0xFF) < 0) {
                                this.aP = ap;
                                this.aQ = aq;
                                this.aR = 18;
                                this.j = 0;
                                this.aS = ((this.aS & 0xFFFFFFF8) | b | 0x800);
                                return;
                            }
                        } while ((b = (byte)((b >= 4) ? 1 : ((byte)(b + 1)))) != n3);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private void a(final byte n) {
        this.n = n;
        Label_0040: {
            i i;
            byte n2;
            if (this.n <= 0) {
                i = this;
                n2 = 0;
            }
            else {
                if (this.n <= i.i[8]) {
                    break Label_0040;
                }
                i = this;
                n2 = i.i[8];
            }
            i.n = n2;
        }
        this.B();
    }
    
    public final void a(final int bo) {
        this.bp = this.bo;
        this.x = false;
        this.bq = 0;
        this.bo = bo;
        this.cW = 0;
        if (bo >= 0) {
            this.al();
        }
    }
    
    public static boolean a(final int n) {
        return (i.W & n) != 0x0;
    }
    
    public final void keyPressed(final int n) {
        i.W |= g(n);
        this.b = false;
    }
    
    public final void keyReleased(final int n) {
        i.W &= ~g(n);
        this.b = true;
    }
    
    private void g() {
        this.a = System.currentTimeMillis();
        i.aN = 0;
        i.aO = 0;
        this.Z = 0;
    }
    
    private static void a(final long n) {
        if (n <= 0L) {
            return;
        }
        System.currentTimeMillis();
        try {
            Thread.sleep(n);
        }
        catch (Exception ex) {}
    }
    
    public final void run() {
        this.a = System.currentTimeMillis();
        this.g();
        this.H();
        while (!this.z) {
            Thread.yield();
            if (this.ae) {
                continue;
            }
            this.e = System.currentTimeMillis();
            try {
                this.h();
            }
            catch (Exception ex) {
                ex.printStackTrace();
                a(5000L);
            }
            if (this.z) {
                break;
            }
            if (i.l != 2) {
                ++i.aN;
            }
            this.f = System.currentTimeMillis();
            if (this.g > 65L) {
                a(100L - this.g - this.f);
                this.t = true;
                this.g = 0L;
            }
            else {
                this.a(this.getGraphics());
                this.flushGraphics();
                this.t = false;
                if (i.l != 2) {
                    ++i.aO;
                }
                this.g = Math.abs(System.currentTimeMillis() - this.e);
                a(50L - (System.currentTimeMillis() - this.e));
            }
        }
        this.A();
        this.a.d();
        i.a.a();
    }
    
    private void h() throws Exception {
        this.cJ();
        this.aQ();
        switch (i.l) {
            case 22: {
                this.cH();
            }
            case 21: {
                this.B(this.bs++);
                this.g();
            }
            case 20: {
                if (i.aN > 30) {
                    this.A = true;
                    this.I = true;
                    this.G = true;
                    this.ct();
                    return;
                }
                break;
            }
            case 35: {
                this.q(this.bs++);
                this.g();
                if (this.bs == 12) {
                    i.l = 17;
                    this.aM = 0;
                    this.C(15);
                    return;
                }
                break;
            }
            case 17: {
                this.bi();
            }
            case 31: {}
            case 16: {
                this.B = true;
                this.t();
                i.W = 0;
            }
            case 0: {
                (i.a[0] = new g(a("/ui.f", 0), 0, 0, null)).a(0);
                i.l = 6;
                this.g();
            }
            case 6: {
                if (i.aN < 60) {
                    i.a[0].b();
                    return;
                }
                i.a = a("/lang.f", 115);
                cL();
                i.a[18] = a("/ui.f", 3);
                this.A();
                this.a(3);
                i.l = 7;
            }
            case 7: {
                if (this.x) {
                    i.l = 8;
                    this.bs = 0;
                    this.br = 32;
                    return;
                }
                break;
            }
            case 1: {
                this.be();
            }
            case 3: {
                this.z = true;
            }
            case 9: {
                try {
                    if ((i.j[0] & 0x1) == 0x0) {
                        this.al = true;
                    }
                    this.F();
                    int n = (this.br == 8) ? this.bs : (this.bs - 24);
                    this.m(n);
                    ++n;
                    ++this.bs;
                    this.X = true;
                    if (n == 8) {
                        if (this.E) {
                            i.l = 4;
                            if (this.bo == -1) {
                                this.a(this.aM = 0);
                            }
                            else {
                                this.aM = 2;
                            }
                        }
                        else {
                            i.l = 30;
                            this.E = true;
                        }
                        this.a.b(19);
                    }
                }
                catch (Exception ex) {}
                this.g();
            }
            case 11: {
                this.I = true;
                this.G = true;
                i.l = 5;
                this.Q = true;
                this.g();
            }
            case 5: {
                if (this.B && this.bs <= 5) {
                    this.k(this.bs++);
                    for (int i = 0; i < 3; ++i) {
                        i.b[i] = false;
                    }
                    for (int j = 1; j < 3; ++j) {
                        i.a[j] = false;
                    }
                    this.g();
                    if (this.bs == 5) {
                        this.M = true;
                        this.L = true;
                        this.K = true;
                        this.ap = 0;
                        this.aq = 13;
                        i.W = 0;
                    }
                }
                else {
                    this.o();
                }
                this.g();
            }
            case 8: {
                this.d(this.bs++);
                this.g();
            }
            case 2:
            case 12: {}
            case 15: {
                this.m();
            }
            case 27: {
                this.n();
            }
            case 28: {
                try {
                    this.c(this.bs);
                    ++this.bs;
                    if (this.bs == 11) {
                        i.l = 27;
                    }
                }
                catch (Exception ex2) {}
                this.g();
            }
            case 29: {
                this.j();
                break;
            }
        }
    }
    
    private void i() {
        Label_0033: {
            i i;
            byte b;
            if (this.O >= this.d) {
                i = this;
                b = -1;
            }
            else {
                if (this.O > -this.d) {
                    break Label_0033;
                }
                i = this;
                b = 1;
            }
            i.b = b;
        }
        this.O += this.b * this.f;
        Label_0084: {
            i j;
            byte c;
            if (this.N >= this.e) {
                j = this;
                c = -1;
            }
            else {
                if (this.O > -this.e) {
                    break Label_0084;
                }
                j = this;
                c = 1;
            }
            j.c = c;
        }
        this.N += this.c * this.g;
    }
    
    private void j() {
        switch (this.L) {
            case 0: {
                if (System.currentTimeMillis() - this.a >= 3000L) {
                    ++this.L;
                    this.g();
                    return;
                }
                break;
            }
            case 1: {
                i i;
                boolean aw;
                if (i.aN % 6 >= 3) {
                    this.M += 1677721;
                    i = this;
                    aw = false;
                }
                else {
                    i = this;
                    aw = true;
                }
                i.aw = aw;
                if (System.currentTimeMillis() - this.a >= 5000L) {
                    ++this.L;
                    this.aw = true;
                    this.g();
                    return;
                }
                break;
            }
            case 2: {
                this.i();
                if (System.currentTimeMillis() - this.a >= 10000L) {
                    this.N = 0;
                    this.O = 0;
                    this.g();
                    ++this.L;
                    return;
                }
                break;
            }
            case 3: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.L;
                    return;
                }
                break;
            }
            case 4: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.L;
                    return;
                }
                break;
            }
            case 5: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.L;
                    return;
                }
                break;
            }
            case 6: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.L;
                    this.g();
                    return;
                }
                break;
            }
            case 7: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    b.a = new byte[12][13];
                    ++this.L;
                    b.b(3);
                    this.a.b(19);
                    this.g();
                    return;
                }
                break;
            }
            case 8: {
                b.a(3);
                this.aw = true;
                if (System.currentTimeMillis() - this.a >= 15000L) {
                    ++this.L;
                    this.g();
                    return;
                }
                break;
            }
            case 9: {
                this.aw = true;
                b.a(3);
                if (System.currentTimeMillis() - this.a >= 12000L) {
                    ++this.L;
                    this.g();
                    return;
                }
                break;
            }
            case 10: {
                this.A();
                this.a(0);
                i.l = 22;
                this.aM = 0;
                this.a.e();
                break;
            }
        }
    }
    
    private void k() {
        this.F = false;
        a(i.a[17], true);
        i.a[17] = null;
        for (int length = e.a.length, i = 0; i < length; ++i) {
            e.a[i] = null;
        }
        e.a = null;
        a(i.a[10], true);
        i.a[10] = null;
        a(i.a[46], true);
        i.a[46] = null;
        a(i.a[55], true);
        i.a[55] = null;
        i.a[8] = null;
        a(i.a[59], true);
        i.a[3] = null;
        a(i.a[17], true);
        i.a[17] = null;
        System.gc();
    }
    
    private void c(final int n) {
        switch (n) {
            case 0: {
                if (this.J) {
                    this.z();
                    return;
                }
                break;
            }
            case 1: {
                if (this.G) {
                    this.cs();
                    return;
                }
                break;
            }
            case 2: {
                if (this.L) {
                    this.K();
                    return;
                }
                break;
            }
            case 3: {
                if (this.K) {
                    System.gc();
                    this.K = false;
                    return;
                }
                break;
            }
            case 4: {
                this.A();
                e.a = a("/demoui.f", 0);
                if (i.a[10] == null) {
                    i.a[10] = a("/mmv.f", 0);
                }
                if (i.a[46] == null) {
                    i.a[46] = a("/mmv.f", 5);
                }
                this.o = 240 - c(i.a[10], 0) >> 1;
                this.p = 320 - b(i.a[10], 0) - 48 >> 1;
            }
            case 5: {
                if (i.a[55] == null) {
                    i.a[55] = a("/mmv.f", 4);
                    this.m = a(i.a[55], 0);
                    i.b = i.a[55];
                }
                if (i.a[18] == null) {
                    i.a[18] = a("/ui.f", 3);
                    return;
                }
                break;
            }
            case 6: {
                if (i.a[54] == null) {
                    i.a[54] = a("/mmv.f", 1);
                }
                this.v = c(i.a[54], 0) >> 1;
                this.w = b(i.a[54], 0) >> 1;
            }
            case 7: {
                if (i.a[53] == null) {
                    i.a[53] = a("/mmv.f", 2);
                    return;
                }
                break;
            }
            case 8: {
                if (i.a[52] == null) {
                    i.a[52] = a("/mmv.f", 3);
                    return;
                }
                break;
            }
            case 9: {
                try {
                    i.a[8] = a("/" + 0 + ".f", 3, 0).a[0];
                    final a a;
                    (a = a("/cm.f", 2, 0)).a(0, 0, -1, -1);
                    a.a(1, 0, 0, -1);
                    i.a[59] = a;
                    b.b = a.a[0].length;
                    a.g = null;
                    if (i.a[17] == null) {
                        i.a[17] = a("/ms.f", 0);
                    }
                }
                catch (Exception ex) {}
            }
            case 10: {
                if (i.a[9] == null) {
                    i.a[9] = a("/cm.f", 7);
                }
                this.y = a(i.a[9], 5);
                final byte b = i.i[2];
                for (int i = 0; i < 3; ++i) {
                    if ((b & 1 << i) != 0x0) {
                        i.b[i] = true;
                    }
                }
                this.t = 10;
                this.u = 10;
                final byte b2;
                Label_0649: {
                    boolean[] array;
                    int n2;
                    boolean b3;
                    if (((b2 = i.i[1]) & 0x1) != 0x0) {
                        array = i.a;
                        n2 = 1;
                        b3 = true;
                    }
                    else {
                        if (a(i.i, 6) >= f.b[1]) {
                            final byte[] j = i.i;
                            final int n3 = 1;
                            j[n3] |= 0x1;
                            this.G();
                            this.q = 1;
                            this.e = 1;
                            break Label_0649;
                        }
                        array = i.a;
                        n2 = 1;
                        b3 = false;
                    }
                    array[n2] = b3;
                }
                Label_0714: {
                    boolean[] array2;
                    int n4;
                    boolean b4;
                    if ((b2 & 0x2) != 0x0) {
                        array2 = i.a;
                        n4 = 2;
                        b4 = true;
                    }
                    else {
                        if (a(i.i, 6) >= f.b[2]) {
                            final byte[] k = i.i;
                            final int n5 = 1;
                            k[n5] |= 0x2;
                            this.G();
                            this.q = 2;
                            this.e = 2;
                            break Label_0714;
                        }
                        array2 = i.a;
                        n4 = 2;
                        b4 = false;
                    }
                    array2[n4] = b4;
                }
                this.f = f.d[this.e << 1];
                this.g = f.d[(this.e << 1) + 1];
                this.h = this.f;
                this.i = this.g;
                this.l();
                this.e = true;
                this.aw = true;
                break;
            }
        }
    }
    
    private void l() {
        i i;
        StringBuffer append;
        String lowerCase;
        if (this.e == 3) {
            i = this;
            append = new StringBuffer();
            lowerCase = i.a[82];
        }
        else if (b(this.e)) {
            i = this;
            append = new StringBuffer();
            lowerCase = i.a[82];
        }
        else {
            i = this;
            append = new StringBuffer().append(f.b[this.e]).append(" ");
            lowerCase = i.a[114].toLowerCase();
        }
        i.b = append.append(lowerCase).append(" ").append(i.a[79]).toString();
        i j = null;
        String[] array = null;
        int n = 0;
        switch (this.e) {
            case 0: {
                j = this;
                array = i.a;
                n = 28;
                break;
            }
            case 1: {
                j = this;
                array = i.a;
                n = 29;
                break;
            }
            case 2: {
                j = this;
                array = i.a;
                n = 30;
                break;
            }
            case 3: {
                j = this;
                array = i.a;
                n = 31;
                break;
            }
            default: {
                return;
            }
        }
        j.c = array[n];
    }
    
    private static boolean b(final int n) {
        return n == 0 || n == 3 || a(i.i, 6) >= f.b[n];
    }
    
    private void m() {
        if (this.J > 0 || this.K > 0) {
            final StringBuffer sb = new StringBuffer();
            Label_0140: {
                if (this.J > 0) {
                    sb.append(i.a[92]).append("\n");
                    while (true) {
                        final byte[] i;
                        int n = 0;
                        byte b = 0;
                        byte b2 = 0;
                        switch (this.J) {
                            case 1: {
                                sb.append(i.a[29]);
                                i = i.i;
                                b = i[n = 2];
                                b2 = 8;
                                break;
                            }
                            case 2: {
                                sb.append(i.a[30]);
                                final byte[] j = i.i;
                                final int n2 = 2;
                                j[n2] |= 0x8;
                                b = i.i[n = 2];
                                b2 = 16;
                                break;
                            }
                            default: {
                                this.G();
                                this.J = 0;
                                break Label_0140;
                            }
                        }
                        i[n] = (byte)(b | b2);
                        continue;
                    }
                }
            }
            if (this.K > 0) {
                if (sb.length() > 0) {
                    sb.append("\n\n");
                }
                sb.append(i.a[99]).append("\n").append(i.a[85 + this.K - 1]);
                this.K = 0;
            }
            if (sb.length() > 0) {
                this.a(sb.toString(), -1, -1, 5000, 4273165, 0);
            }
        }
    }
    
    private void n() {
        if (!this.t) {
            this.h = this.f;
            this.i = this.g;
        }
        if (this.d) {
            i.W = 0;
            final int n = this.k - this.f;
            final int n2 = this.l - this.g;
            this.f += n / (8 - this.a);
            this.g += n2 / (8 - this.a);
            ++this.a;
            if (this.a == 8) {
                this.f = this.k;
                this.g = this.l;
                this.d = false;
                this.a = 0;
                this.e = true;
                this.l();
            }
        }
        else {
            switch (this.j) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.e) {
                        case 0: {
                            this.F = true;
                            this.G = true;
                            this.a.e();
                            this.ap = 0;
                            this.j = false;
                            i.l = 15;
                            i.eb = this.b(this.ap);
                            this.ct();
                            break;
                        }
                        case 1: {
                            if (!b(this.e)) {
                                break;
                            }
                            this.F = true;
                            this.G = true;
                            this.a.e();
                            this.ap = 1;
                            this.aq = 0;
                            i.l = 15;
                            i.eb = this.b(this.ap);
                            this.ct();
                            this.n = true;
                            this.j = false;
                            if (i.i[9] < 1) {
                                i.i[9] = 1;
                                break;
                            }
                            break;
                        }
                        case 2: {
                            if (!b(this.e)) {
                                break;
                            }
                            this.F = true;
                            this.G = true;
                            this.a.e();
                            this.ap = 2;
                            this.aq = 0;
                            this.j = false;
                            i.l = 15;
                            i.eb = this.b(this.ap);
                            this.ct();
                            this.n = true;
                            if (i.i[9] < 2) {
                                i.i[9] = 2;
                                break;
                            }
                            break;
                        }
                        case 3: {
                            i.l = 18;
                            break;
                        }
                    }
                    break;
                }
                default: {
                    final byte e;
                    if ((e = f.a[this.j][this.e]) != -1) {
                        this.e = e;
                        this.d = true;
                        this.k = f.d[this.e * 2];
                        this.l = f.d[this.e * 2 + 1];
                        break;
                    }
                    break;
                }
            }
            this.j = -1;
        }
    }
    
    private void d(final int n) {
        if (n < 21) {
            if (n == 0) {
                this.a.b();
            }
            this.a.a(n);
            if (n == 20) {
                this.a.c();
            }
            System.gc();
            return;
        }
        switch (n) {
            case 21: {
                i.a[9] = a("/cm.f", 7);
            }
            case 22: {
                i.a[0] = a("/ui.f", 2);
            }
            case 23: {
                i.b[0] = a("/demoui.f", 0, 0);
                i.b[1] = a("/demoui.f", 0, 1);
            }
            case 24: {
                this.a.a();
                i.l = 9;
                this.a(-1);
                (i.a = new StringBuffer(i.a[8])).delete(i.a.length() - 1, i.a.length());
                (i.b = new StringBuffer(i.a[20])).delete(i.b.length() - 1, i.b.length());
                i.c = new StringBuffer("1");
                break;
            }
        }
    }
    
    public static String[] a(final String s, final int n) {
        final byte[] a = a(s, 0);
        int offset = 0;
        int length = 0;
        int i = 0;
        final String[] array = new String[n];
        while (i < n) {
            if (a[offset + length] == 0) {
                try {
                    array[i] = new String(a, offset, length, "ISO-8859-1");
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                offset += length + 1;
                length = 0;
                ++i;
            }
            else {
                ++length;
            }
        }
        return array;
    }
    
    private void o() {
        Label_1151: {
            try {
                int bs = this.bs;
                if (this.B) {
                    bs -= 5;
                }
                ++this.bs;
                switch (bs) {
                    case 0: {
                        if (this.M) {
                            this.G();
                        }
                        return;
                    }
                    case 1: {
                        if (this.L) {
                            this.K();
                        }
                        return;
                    }
                    case 2: {
                        if (this.K) {
                            System.gc();
                            this.K = false;
                        }
                        return;
                    }
                    case 3: {
                        i.a[41].a(1);
                        i.a[41].a(2);
                        return;
                    }
                    case 4: {
                        if (this.I) {
                            this.A();
                        }
                        return;
                    }
                    case 5: {
                        if (this.G) {
                            this.cs();
                        }
                        return;
                    }
                    case 6: {
                        Label_0202: {
                            final int c;
                            i i;
                            int v;
                            if ((c = c()) < 1) {
                                i = this;
                                v = c;
                            }
                            else {
                                if ((this.V + 9) % 9 >= 1) {
                                    break Label_0202;
                                }
                                i = this;
                                v = 1;
                            }
                            i.V = v;
                        }
                        A(this.V % 9);
                        return;
                    }
                    case 7: {
                        this.D();
                        return;
                    }
                    case 8: {
                        V();
                        this.M();
                        return;
                    }
                    case 9: {
                        this.bD();
                        return;
                    }
                    case 10: {
                        this.a = this.getClass().getResourceAsStream("/" + this.ap + ".f");
                        this.cc = this.a.read();
                        i.n = new byte[this.cc << 3];
                        this.a.read(i.n);
                        return;
                    }
                    default: {
                        int n;
                        if ((n = bs - 10 - 1) < 4) {
                            this.e(n);
                            this.bt = 0;
                            return;
                        }
                        n -= 4;
                        if (n >= 0 && n < 43) {
                            this.g(n);
                            return;
                        }
                        n -= 43;
                        if (n >= 0 && n < 8) {
                            this.f(n);
                            if (n == 7) {
                                this.a.close();
                                this.a = null;
                                System.gc();
                            }
                            return;
                        }
                        n -= 8;
                        if (n >= 0 && n < 16) {
                            if (n < i.a.length) {
                                (i.a[n] = new c(this)).a(i.p[n]);
                            }
                            if (n == 15 && i.a.length >= 16) {
                                for (int j = 16; j < i.a.length; ++j) {
                                    (i.a[j] = new c(this)).a(i.p[j]);
                                }
                            }
                            return;
                        }
                        n -= 16;
                        if (n < 0 || n >= 3) {
                            n -= 3;
                            switch (n) {
                                case 0: {
                                    i.n = null;
                                    this.a(i.a[12] != null || i.a[6] != null || i.a[58] != null || this.i == 1 || this.i == 4 || this.i == 5);
                                    break Label_1151;
                                }
                                case 1: {
                                    this.c = 0L;
                                    this.d = 0L;
                                    this.bu = 0;
                                    ++this.V;
                                    j((this.V < 3) ? this.V : 3);
                                    this.G();
                                    break Label_1151;
                                }
                                case 2: {
                                    i.c = new int[this.av][this.aw];
                                    i.d = new byte[this.av][this.aw];
                                    i.e = new byte[this.av][this.aw];
                                    i.d = new int[this.av][this.aw];
                                    if (i.m != null) {
                                        i.o = new byte[i.m.length];
                                        break Label_1151;
                                    }
                                    break;
                                }
                                case 3: {
                                    this.cm();
                                    break Label_1151;
                                }
                                case 4: {
                                    this.bl = 0;
                                    final int n2 = 0;
                                    this.T = n2;
                                    this.S = n2;
                                    this.cf();
                                    break Label_1151;
                                }
                                case 5: {
                                    this.bn = i.aN + 60;
                                    this.d = i.a[38] + "\n" + this.P + " " + i.a[39];
                                    this.B();
                                    break Label_1151;
                                }
                                case 6: {
                                    a(i.a, true);
                                    i.a = null;
                                    System.gc();
                                    break Label_1151;
                                }
                                case 7: {
                                    this.B = false;
                                    i.f = null;
                                    System.gc();
                                    this.a.b(16 + this.ap);
                                    i.l = 1;
                                    break;
                                }
                            }
                            return;
                        }
                        switch (this.i) {
                            case 1: {
                                this.i(n);
                                if (n == 2) {
                                    this.a.close();
                                    this.a = null;
                                }
                                return;
                            }
                            case 3: {
                                if (n > 0) {
                                    return;
                                }
                                i.a[31] = a("/mmv.f", 1, 0).a[0];
                                (i.a[5] = new g(a("/mm1.f", 0), 0, 0, null)).a(0);
                                return;
                            }
                            case 4: {
                                if (n >= 2) {
                                    return;
                                }
                                this.h(n);
                                i.a[32] = a("/mmv.f", 3, 0).a[0];
                                i.a[20] = a("/gen0.f", 7, 0);
                                if (n == 1) {
                                    this.a.close();
                                    this.a = null;
                                }
                                return;
                            }
                            case 5: {
                                i.a[30] = a("/mmv.f", 2, 0).a[0];
                                i.a[20] = a("/gen0.f", 7, 0);
                                (i.a[5] = new g(a("/b1.f", 0), 0, 0, null)).a(10);
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                        break;
                    }
                }
            }
            catch (Exception ex) {}
        }
    }
    
    private static int a() {
        return i.i[8] - 4;
    }
    
    private void a(final boolean b) {
        try {
            InputStream resourceAsStream;
            final byte[] b2 = new byte[(resourceAsStream = this.getClass().getResourceAsStream("/o.f")).read() << 3];
            resourceAsStream.read(b2);
            final byte[] b3 = new byte[b(b2, 4)];
            resourceAsStream.read(b3);
            if (!b) {
                resourceAsStream.close();
                resourceAsStream = null;
                System.gc();
            }
            final a a;
            (a = new a()).a(b3, 0);
            a.a(this.cu = a(), 0, -1, -1);
            a.b = this.cu;
            a.g = null;
            i.a[0] = new g(a, 0, 0, null);
            System.gc();
            if (b) {
                final byte[] b4 = new byte[b(b2, 12)];
                resourceAsStream.read(b4);
                resourceAsStream.close();
                System.gc();
                final a a2;
                (a2 = new a()).a(b4, 0);
                a2.a(0, 0, -1, -1);
                a2.g = null;
                i.a[3] = new g(a2, 0, 0, null);
                System.gc();
            }
        }
        catch (Exception ex) {}
    }
    
    private int b() {
        return i.a[this.bo][this.bq << 1];
    }
    
    private void p() {
        i.a[41].b = 0;
        this.x = true;
        switch (this.bo) {
            case 0: {
                this.w();
            }
            case 3: {
                this.v();
            }
            case 7: {
                this.q();
            }
            case 2: {
                this.u();
            }
            case 1: {
                this.s();
            }
            case 5: {
                this.r();
                break;
            }
        }
    }
    
    private void q() {
        Label_0166: {
            switch (this.b()) {
                case 0: {
                    if (this.bp == 0) {
                        i.l = 4;
                    }
                    this.a(this.bp);
                    break;
                }
                case 1: {
                    switch (this.aM) {
                        case 1: {
                            this.t();
                            break Label_0166;
                        }
                        case 3: {
                            i.l = 15;
                            this.I = true;
                            this.G = true;
                            this.ct();
                            break Label_0166;
                        }
                        case 4: {
                            this.A();
                            i.l = 9;
                            this.br = 8;
                            this.a(-1);
                            this.bs = 0;
                            break Label_0166;
                        }
                        case 5: {
                            i.l = 3;
                            this.a.d();
                            i.a.notifyDestroyed();
                            break Label_0166;
                        }
                    }
                    break;
                }
            }
        }
        this.aM = -1;
    }
    
    private void r() {
        int n2 = 0;
        int n3 = 0;
        short n4 = 0;
        switch (this.b()) {
            case 0: {
                h.a = !h.a;
                short n;
                if (h.a) {
                    n = 32;
                    this.C(0);
                }
                else {
                    this.a.e();
                    this.a.e();
                    n = 33;
                }
                n2 = 5;
                n3 = 0;
                n4 = n;
                break;
            }
            case 1: {
                i.k = !i.k;
                short n5 = 51;
                if (i.k) {
                    n5 = 50;
                    t(200);
                }
                n2 = 5;
                n3 = 1;
                n4 = n5;
                break;
            }
            default: {
                return;
            }
        }
        a(n2, n3, n4);
    }
    
    private void s() {
        switch (this.b()) {
            case 1: {
                this.a(7);
                this.aM = 1;
            }
            case 0: {
                i.l = 1;
                i.g = null;
                i.f = null;
            }
            case 3: {
                if (this.aq != 13 || this.ap != 0) {
                    this.a(7);
                    this.aM = 3;
                    return;
                }
                break;
            }
            case 4: {
                this.a(7);
                this.aM = 4;
            }
            case 5: {
                this.a(7);
                this.aM = 5;
            }
            case 2: {
                this.a(5);
            }
            case 6: {
                i.l = 33;
                this.aw = true;
            }
            default: {
                this.x = false;
                break;
            }
        }
    }
    
    private void t() {
        i i;
        int br;
        if (this.B) {
            i = this;
            br = 97;
        }
        else {
            i = this;
            br = 92;
        }
        i.br = br;
        this.bs = 0;
        this.I = true;
        this.v = false;
        i.l = 11;
        final byte as = 0;
        this.j = as;
        this.k = as;
        this.aS = as;
        final int n = -1;
        this.aB = n;
        this.aA = n;
        this.b = 0L;
    }
    
    private void u() {
        switch (this.b()) {
            case 0: {
                this.a.e();
                this.ap = 0;
                this.j = false;
                i.l = 15;
                i.eb = this.b(this.ap);
                this.G = true;
                this.ct();
            }
            case 1: {
                this.a.e();
                this.ap = 1;
                this.aq = 0;
                i.l = 15;
                i.eb = this.b(this.ap);
                this.G = true;
                this.ct();
                this.n = true;
                this.j = false;
                if (i.i[9] < 1) {
                    i.i[9] = 1;
                    return;
                }
                break;
            }
            case 2: {
                this.a.e();
                this.ap = 2;
                this.aq = 0;
                this.j = false;
                i.l = 15;
                i.eb = this.b(this.ap);
                this.G = true;
                this.ct();
                this.n = true;
                if (i.i[9] < 2) {
                    i.i[9] = 2;
                }
                if (i.i[8] < 8) {
                    i.i[8] = 8;
                    return;
                }
                break;
            }
            case 3: {
                this.a(4);
            }
            default: {
                i.l = 3;
                this.a.d();
                i.a.a();
                break;
            }
        }
    }
    
    private void v() {
        short n = 0;
        while (true) {
            short n2 = 0;
            switch (this.b()) {
                case 0: {
                    h.a = true;
                    n2 = 32;
                    break;
                }
                case 1: {
                    h.a = false;
                    n2 = 33;
                    break;
                }
                default: {
                    a(5, this.aM = 0, n);
                    return;
                }
            }
            n = n2;
            continue;
        }
    }
    
    private void w() {
        switch (this.b()) {
            case 1: {
                this.a.e();
                this.F();
                if (i.i != null && a()) {
                    this.V = 0;
                    this.L = true;
                    this.n = true;
                    this.bs = 0;
                    i.l = 28;
                    return;
                }
            }
            case 0: {
                this.a.e();
                if (!a()) {
                    this.aR();
                    return;
                }
                this.P = true;
                this.B = false;
                i.l = 31;
            }
            case 5: {
                this.a(7);
                this.aM = 5;
            }
            case 6: {
                i.l = 10;
            }
            case 2: {
                this.a(5);
                this.a.e();
            }
            case 4: {
                i.l = 22;
                this.aM = 0;
                this.a.e();
            }
            case 3: {
                i.l = 33;
                this.a.e();
                this.aw = true;
            }
            default: {
                this.x = false;
            }
        }
    }
    
    private void x() {
        --this.bq;
        if (this.bq < 0) {
            this.bq = (i.a[this.bo].length >> 1) - 1;
        }
    }
    
    private void y() {
        this.bq = (this.bq + 1) % (i.a[this.bo].length >> 1);
    }
    
    private void z() {
        this.J = false;
        if (i.a != null) {
            for (int length = i.a.length, i = 0; i < length; ++i) {
                a(i.a[i]);
                i.a[i] = null;
            }
        }
        i.a = null;
        a(i.a[42], true);
        a(i.a[43], true);
        System.gc();
    }
    
    private static void a(final c c) {
        if (c == null) {
            return;
        }
        if (c.a != null) {
            for (int i = 0; i < c.a.length; ++i) {
                a(c.a[i], true);
                c.a[i] = null;
            }
        }
        if (c.a != null) {
            for (int j = 0; j < c.a.length; ++j) {
                c.a[j] = null;
            }
            c.a = null;
        }
        c.a = null;
    }
    
    private static void a(final a a, final boolean b) {
        if (a == null) {
            return;
        }
        a.a(b);
    }
    
    private void A() {
        this.I = false;
        this.m = true;
        this.C = false;
        this.dk = 0;
        this.e = null;
        i.m = null;
        i.l = null;
        this.X = 0;
        this.Y = 0;
        i.d = null;
        i.e = null;
        this.a = null;
        i.n = null;
        i.g = null;
        i.c = null;
        i.b = null;
        i.d = null;
        i.p = null;
        i.k = null;
        if (i.a != null) {
            for (int length = i.a.length, i = 0; i < length; ++i) {
                a(i.a[i]);
                i.a[i] = null;
            }
        }
        i.a = null;
        if (this.a != null) {
            a(this.a);
            this.a = null;
        }
        if (i.a != null) {
            for (int j = 0; j < 33; ++j) {
                if (i.a[j] != null) {
                    for (int length2 = i.a[j].length, k = 0; k < length2; ++k) {
                        i.a[j][k] = null;
                    }
                    i.a[j] = null;
                }
            }
        }
        a(i.d, true);
        System.gc();
        if (i.a != null) {
            for (int l = 0; l < 61; ++l) {
                if (l != 41 && l != 0 && l != 9 && l != 18) {
                    a(i.a[l], true);
                    i.a[l] = null;
                }
            }
        }
        if (i.a != null) {
            for (int n = 0; n < 6; ++n) {
                if (i.a[n] != null) {
                    a(i.a[n].a, true);
                    i.a[n].a = null;
                    i.a[n] = null;
                }
            }
        }
        i.b = null;
        i.a = null;
        i.b = null;
        i.a = null;
        i.c = null;
        i.c = null;
        i.d = null;
        i.d = null;
        i.e = null;
        i.o = null;
        this.c = 0L;
        this.bu = 0;
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        this.aD = -1;
        i.b = null;
        this.bK = -1;
        this.d = null;
        this.x = 3;
        i.e = null;
        i.f = null;
        i.a = null;
        i.c = null;
        i.b = null;
        i.d = null;
        this.am = false;
        this.ds = -1;
        this.dt = 0;
        this.du = 0;
        this.v = 0;
        this.dx = 0;
        this.dy = 0;
        this.dz = 0;
        this.w = 0;
        this.dA = 0;
        this.dB = -1;
        this.j = false;
        i.e = null;
        ak();
        System.gc();
    }
    
    private void B() {
        this.m = true;
    }
    
    private void e(final int n) throws Exception {
        final byte[] b = new byte[b(i.n, n * 8 + 4)];
        this.a.read(b);
        final a a;
        (a = new a()).a(b, 0);
        a.a(0, 0, -1, -1);
        Label_0153: {
            Object o = null;
            int n2 = 0;
            Object o2 = null;
            switch (n) {
                case 0: {
                    if ((this.d & 0x1L) != 0x0L) {
                        o = i.a;
                        n2 = 60;
                        o2 = a;
                        break;
                    }
                    break Label_0153;
                }
                case 1: {
                    if ((this.d & 0x2L) != 0x0L) {
                        o = i.a;
                        n2 = 16;
                        o2 = a;
                        break;
                    }
                    break Label_0153;
                }
                case 2: {
                    i.a[0] = null;
                    o = i.a;
                    n2 = 42;
                    o2 = a;
                    break;
                }
                case 3: {
                    o = i.a;
                    n2 = 8;
                    o2 = a.a[0];
                    break;
                }
            }
            o[n2] = o2;
        }
        a.g = null;
    }
    
    private void f(final int n) {
        try {
            if (n == 0) {
                this.a.close();
                this.a = null;
                System.gc();
                this.a = this.getClass().getResourceAsStream("/cm.f");
                this.cc = this.a.read();
                i.n = new byte[this.cc << 3];
                this.a.read(i.n);
            }
            final byte[] b = new byte[b(i.n, n * 8 + 4)];
            this.a.read(b);
            final a a;
            (a = new a()).a(b, 0);
            a.a(0, 0, -1, -1);
            Label_0315: {
                Object o = null;
                int n2 = 0;
                Object o2 = null;
                Label_0314: {
                    switch (n) {
                        case 6: {
                            i.a[43] = a;
                            o = i.a;
                            n2 = 20;
                            o2 = null;
                            break Label_0314;
                        }
                        case 5: {
                            o = i.a;
                            n2 = 18;
                            break;
                        }
                        case 2: {
                            a.a(1, 0, 0, -1);
                            o = i.a;
                            n2 = 59;
                            o2 = a;
                            break Label_0314;
                        }
                        case 1: {
                            switch (this.ap) {
                                case 1:
                                case 2: {
                                    if (this.ap != 0) {
                                        a.a(this.ap, 0, -1, -1);
                                        a.a(0);
                                        a.b = this.ap;
                                        break;
                                    }
                                    break;
                                }
                            }
                            o = i.a;
                            n2 = 56;
                            o2 = a;
                            break Label_0314;
                        }
                        case 3: {
                            i.a[13] = a;
                            this.C();
                            break Label_0315;
                        }
                        case 0: {
                            o = i.a;
                            n2 = 11;
                            break;
                        }
                        case 4: {
                            o = i.a;
                            n2 = 5;
                            break;
                        }
                    }
                    o2 = a.a[0];
                }
                o[n2] = o2;
            }
            a.g = null;
        }
        catch (Exception ex) {}
    }
    
    private void C() {
        if ((this.d & 0x1L) == 0x0L) {
            for (int i = 0; i < 5; ++i) {
                i.a[13].a[0][i] = null;
            }
        }
    }
    
    private void g(final int n) {
        try {
            if (n % 10 == 0) {
                this.a.close();
                this.a = null;
                this.a = this.getClass().getResourceAsStream("/gen" + this.bt + ".f");
                this.cc = this.a.read();
                i.n = new byte[this.cc << 3];
                this.a.read(i.n);
                this.cd = 0;
                ++this.bt;
            }
            final int b = b(i.n, (n - (this.bt - 1) * 10) * 8 + 4);
            if ((this.c & 1L << n) == 0x0L) {
                this.cd += b;
                return;
            }
            if (this.cd != 0) {
                this.a.skip(this.cd);
                this.cd = 0;
            }
            final byte[] b2 = new byte[b];
            this.a.read(b2);
            final a d;
            (d = new a()).a(b2, 0);
            if ((n != 28 || this.ag) && (n != 24 || this.ai)) {
                d.a(0, 0, -1, -1);
            }
            int n2 = -1;
            int n3 = -1;
            Label_0942: {
                int n4 = 0;
                switch (n) {
                    case 41: {
                        n2 = 38;
                        break Label_0942;
                    }
                    case 42: {
                        n2 = 39;
                        break Label_0942;
                    }
                    case 0: {
                        n2 = 33;
                        break Label_0942;
                    }
                    case 36: {
                        n2 = 35;
                        break Label_0942;
                    }
                    case 1: {
                        n2 = 34;
                        break Label_0942;
                    }
                    case 38: {
                        n2 = 36;
                        break Label_0942;
                    }
                    case 16:
                    case 18: {
                        n2 = 37;
                        break Label_0942;
                    }
                    case 40: {
                        n2 = 2;
                        break Label_0942;
                    }
                    case 32: {
                        n2 = 32;
                        break Label_0942;
                    }
                    case 23: {
                        n2 = 30;
                        break Label_0942;
                    }
                    case 37: {
                        n2 = 29;
                        break Label_0942;
                    }
                    case 35: {
                        n2 = 28;
                        break Label_0942;
                    }
                    case 34: {
                        n2 = 27;
                        break Label_0942;
                    }
                    case 33: {
                        n2 = 22;
                        break Label_0942;
                    }
                    case 31: {
                        n4 = 29;
                        break;
                    }
                    case 30: {
                        n2 = 15;
                        break Label_0942;
                    }
                    case 28: {
                        if (this.ah) {
                            d.a(1, 0, -1, -1);
                        }
                        n2 = 45;
                        break Label_0942;
                    }
                    case 29: {
                        n4 = 26;
                        break;
                    }
                    case 2: {
                        if (this.ag) {
                            i.a[24] = d.a[0];
                        }
                        if (this.ah) {
                            d.a(1, 0, -1, -1);
                            i.a[25] = d.a[1];
                        }
                        break Label_0942;
                    }
                    case 6: {
                        n4 = 21;
                        break;
                    }
                    case 27: {
                        n4 = 19;
                        break;
                    }
                    case 26: {
                        i.d = d;
                        break Label_0942;
                    }
                    case 25: {
                        n4 = 17;
                        break;
                    }
                    case 5: {
                        n2 = 58;
                        break Label_0942;
                    }
                    case 3: {
                        n2 = 7;
                        break Label_0942;
                    }
                    case 39: {
                        n2 = 6;
                        break Label_0942;
                    }
                    case 8: {
                        n2 = 5;
                        break Label_0942;
                    }
                    case 24: {
                        i.a[15] = null;
                        d.a(1, 0, -1, -1);
                        n2 = 57;
                        i.a[14] = null;
                        break Label_0942;
                    }
                    case 22: {
                        n2 = 8;
                        break Label_0942;
                    }
                    case 20: {
                        n4 = 13;
                        break;
                    }
                    case 4:
                    case 21: {
                        if (this.ap == 2) {
                            break Label_0942;
                        }
                        n2 = 3;
                        break Label_0942;
                    }
                    case 7: {
                        if (this.ap == 2) {
                            d.a = null;
                            d.a(1, 0, -1, -1);
                            d.b = 1;
                        }
                        n2 = 20;
                        break Label_0942;
                    }
                    case 14: {
                        n4 = 6;
                        break;
                    }
                    case 10: {
                        (i.a[4] = new g(d, 0, 0, null)).a(0);
                        break Label_0942;
                    }
                    case 9: {
                        n2 = 12;
                        break Label_0942;
                    }
                    case 15:
                    case 17: {
                        if ((this.bu & 0x2) != 0x0) {
                            if (this.ap == 2) {
                                d.a = null;
                                d.a(2, 0, -1, -1);
                                d.b = 2;
                            }
                            n2 = 4;
                        }
                        if ((this.bu & 0x1) != 0x0) {
                            (i.a[21] = new a()).a(b2, 0);
                            i.a[21].a(1, 0, -1, -1);
                            i.a[21].b = 1;
                            i.a[21].g = null;
                        }
                        break Label_0942;
                    }
                    case 13: {
                        n2 = 1;
                        break Label_0942;
                    }
                    case 11: {
                        n2 = 11;
                        break Label_0942;
                    }
                    case 19: {
                        n4 = 7;
                        break;
                    }
                    case 12: {
                        n4 = 10;
                        break;
                    }
                }
                n3 = n4;
            }
            if (n2 != -1) {
                i.a[n2] = d;
            }
            if (n3 != -1) {
                i.a[n3] = d.a[0];
            }
            d.g = null;
        }
        catch (IOException ex) {}
    }
    
    private void h(final int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/b0.f");
                this.cc = this.a.read();
                i.n = new byte[this.cc * 8];
                this.a.read(i.n);
            }
            final byte[] b = new byte[b(i.n, n * 8 + 4)];
            this.a.read(b);
            final a a;
            (a = new a()).a(b, 0);
            a.a(0, 0, -1, -1);
            a.g = null;
            switch (n) {
                case 0: {
                    i.a[5] = new g(a, 0, 0, null);
                }
                case 1: {
                    i.a[40] = a;
                    break;
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void i(final int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/mm0.f");
                this.cc = this.a.read();
                i.n = new byte[this.cc * 8];
                this.a.read(i.n);
            }
            final byte[] b = new byte[b(i.n, n * 8 + 4)];
            this.a.read(b);
            final a a;
            (a = new a()).a(b, 0);
            a.a(0, 0, -1, -1);
            a.g = null;
            switch (n) {
                case 2: {
                    i.a[27] = a.a[0];
                }
                case 1: {
                    (i.a[2] = new g(a, 0, 0, null)).a(0);
                }
                case 0: {
                    (i.a[1] = new g(a, 0, 0, null)).a(2);
                    break;
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private static int c() {
        return i.i[12];
    }
    
    private static void j(final int n) {
        i.i[12] = (byte)n;
    }
    
    private static boolean a() {
        return i.i != null && i.i[13] != 0;
    }
    
    private void b(final boolean b) {
        i.i[13] = (byte)(b ? 1 : 0);
        this.G();
    }
    
    private void D() {
        this.ba = this.c(this.ap, this.aq);
    }
    
    private void E() {
        this.H = false;
        this.J();
        this.a(this.ap, i.eb);
        this.b(this.ap, this.aq, this.bb + this.b(this.ap, this.aq));
        this.G();
    }
    
    private void F() {
        try {
            final RecordStore openRecordStore;
            i.i = (openRecordStore = RecordStore.openRecordStore("DiamondRush", true)).getRecord(1);
            this.cw = i.i.length;
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {}
    }
    
    private void G() {
        this.M = false;
        try {
            final RecordStore openRecordStore;
            if ((openRecordStore = RecordStore.openRecordStore("DiamondRush", true)).getNumRecords() == 0) {
                openRecordStore.addRecord(i.i, 0, this.cw);
            }
            else {
                openRecordStore.setRecord(1, i.i, 0, this.cw);
            }
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {}
    }
    
    private void H() {
        RecordStore openRecordStore = null;
        try {
            openRecordStore = RecordStore.openRecordStore("Preferences", false);
        }
        catch (Exception ex) {}
        i.j = new byte[1];
        if (openRecordStore == null) {
            try {
                final RecordStore openRecordStore2 = RecordStore.openRecordStore("Preferences", true);
                i.j[0] = 0;
                this.cv = i.j.length;
                openRecordStore2.closeRecordStore();
                this.I();
                return;
            }
            catch (Exception ex2) {
                return;
            }
        }
        try {
            i.j = openRecordStore.getRecord(1);
            this.cv = i.j.length;
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex3) {}
    }
    
    private void I() {
        try {
            final RecordStore openRecordStore;
            if ((openRecordStore = RecordStore.openRecordStore("Preferences", true)).getNumRecords() == 0) {
                openRecordStore.addRecord(i.j, 0, this.cv);
            }
            else {
                openRecordStore.setRecord(1, i.j, 0, this.cv);
            }
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {}
    }
    
    private void k(final int n) {
        try {
            String s = null;
            switch (n) {
                case 0:
                case 1: {
                    RecordStore openRecordStore = null;
                    try {
                        openRecordStore = RecordStore.openRecordStore("DiamondRush", false);
                    }
                    catch (Exception ex) {}
                    if (openRecordStore == null) {
                        this.N = true;
                    }
                    else {
                        this.N = false;
                        openRecordStore.closeRecordStore();
                    }
                    if (n == 0) {
                        return;
                    }
                    (i.i = new byte[1000])[3] = 5;
                    i.i[8] = 4;
                    i.i[9] = 0;
                    i.i[10] = 0;
                    this.cw = 14;
                    this.cw += 6;
                }
                case 2: {
                    s = "/map_angkor.out";
                }
                case 3: {
                    if (s == null) {
                        s = "/map_scotland.out";
                    }
                }
                case 4: {
                    if (s == null) {
                        s = "/map_tibet.out";
                    }
                    (this.a = this.getClass().getResourceAsStream(i.b[n - 2])).read();
                    final int n2 = n - 2;
                    final int cw = this.cw;
                    i.i[14 + n2 * 2] = (byte)(this.cw & 0xFF);
                    i.i[14 + n2 * 2 + 1] = (byte)(this.cw >> 8);
                    final int read = this.a.read();
                    i.i[this.cw++] = (byte)read;
                    i.i[this.cw++] = 0;
                    this.cu();
                    this.a(s);
                    i.i[this.cw++] = (byte)this.dM;
                    this.cs();
                    this.cw += read << 1;
                    for (int i = 0; i < read; ++i) {
                        final int cw2 = this.cw;
                        i.i[cw + 3 + i * 2] = (byte)(cw2 & 0xFF);
                        i.i[cw + 3 + i * 2 + 1] = (byte)(cw2 >> 8);
                        byte b = 0;
                        byte b2 = 0;
                        final int a = a(this.a);
                        final int a2 = a(this.a);
                        final byte[] array = new byte[a * a2];
                        this.a.read(array);
                        for (int j = 0; j < a2; ++j) {
                            for (int k = 0; k < a; ++k) {
                                if (array[k + j * a] == 2) {
                                    ++b2;
                                }
                            }
                        }
                        final byte[] l = i.i;
                        final int n3 = 0;
                        l[n3] += b2;
                        i.i[this.cw++] = 0;
                        i.i[this.cw++] = b2;
                        i.i[this.cw++] = 0;
                        this.a.skip(a * a2);
                        final int cw3 = this.cw;
                        this.cw += 2;
                        this.a.read(array);
                        for (int n4 = 0; n4 < a2; ++n4) {
                            for (int n5 = 0; n5 < a; ++n5) {
                                if (array[n5 + n4 * a] == 14 || array[n5 + n4 * a] == 33) {
                                    i.i[this.cw++] = (byte)n5;
                                    i.i[this.cw++] = (byte)n4;
                                    ++b;
                                }
                            }
                        }
                        i.i[cw3] = 0;
                        i.i[cw3 + 1] = b;
                    }
                    this.a.close();
                    this.a = null;
                    System.gc();
                    break;
                }
            }
        }
        catch (Exception ex2) {}
    }
    
    private void J() {
        i.i[3] = (byte)this.ao;
        i.i[11] = this.r;
    }
    
    private void K() {
        this.L = false;
        this.ao = i.i[3];
        this.r = i.i[11];
        this.aZ = a(i.i, 4);
    }
    
    private byte a(final int n, final int n2) {
        return i.i[this.a(n, n2) + 2];
    }
    
    private void a(final int n, final int n2, final byte b) {
        final int a = this.a(n, n2);
        final byte[] i = i.i;
        final int n3 = a + 2;
        i[n3] |= b;
    }
    
    private void a(final int n, final int n2) {
        final int n3 = c(n) + 1;
        if (i.i[n3] < n2) {
            i.i[n3] = (byte)n2;
        }
    }
    
    private int b(final int n) {
        final int n2;
        if ((n2 = c(n) + 1) >= 0 && n2 <= i.i.length) {
            return i.i[c(n) + 1];
        }
        return 0;
    }
    
    private static int c(int n) {
        int n2;
        if (n < 0) {
            n2 = 0;
        }
        else {
            if (n < 3) {
                return a(i.i, 14 + n * 2);
            }
            n2 = 2;
        }
        n = n2;
        return a(i.i, 14 + n * 2);
    }
    
    private int d(final int n) {
        try {
            return i.i[c(n) + 0];
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private int e(final int n) {
        return i.i[c(n) + 2];
    }
    
    private int a(final int n, final int n2) {
        return a(i.i, c(n) + 3 + n2 * 2);
    }
    
    private int b(final int n, final int n2) {
        return i.i[this.a(n, n2) + 0];
    }
    
    private void b(final int n, final int n2, final int n3) {
        i.i[this.a(n, n2) + 0] = (byte)n3;
    }
    
    private int c(final int n, final int n2) {
        return i.i[this.a(n, n2) + 1];
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        final int a = this.a(n, n2);
        for (byte b = i.i[a + 4], b2 = 0; b2 < b; ++b2) {
            if (i.i[a + 5 + 2 * b2 + 0] == n3 && i.i[a + 5 + 2 * b2 + 1] == n4) {
                i.i[a + 5 + 2 * b2 + 0] = 0;
                i.i[a + 5 + 2 * b2 + 1] = 0;
                final byte[] i = i.i;
                final int n5 = a + 3;
                ++i[n5];
                return;
            }
        }
    }
    
    private boolean a(final int n, final int n2, final int n3, final int n4) {
        final int a = this.a(n, n2);
        for (byte b = i.i[a + 4], b2 = 0; b2 < b; ++b2) {
            if (i.i[a + 5 + 2 * b2 + 0] == n3 && i.i[a + 5 + 2 * b2 + 1] == n4) {
                return false;
            }
        }
        return true;
    }
    
    private void L() {
        this.ad = 13;
        this.af = 4;
        this.ai = 408;
        this.i = 5;
        this.c |= 0x80L;
        this.c |= 0x8L;
        this.ad = false;
        this.D = 16;
        this.E = 16;
        this.F = 19;
        this.G = 18;
    }
    
    private void M() throws Exception {
        i.cE = -1;
        i.D = false;
        this.c = true;
        this.ax = 0;
        this.bj = 0;
        this.c = 0L;
        this.d = 0L;
        this.Q = 0;
        this.R = 0;
        this.i = 0;
        this.O = ((this.a(this.ap, this.aq) & 0x2) != 0x0);
        this.cl = 0;
        switch (this.ap) {
            case 0: {
                if (this.aq == 5) {
                    this.i = 1;
                    this.aa = 816;
                    this.ab = 0;
                    break;
                }
                if (this.aq == 13) {
                    this.i = 2;
                    this.r = false;
                    break;
                }
                if (this.aq == 8) {
                    this.i = 4;
                    this.ad = 0;
                    this.af = 3;
                    this.ag = 0;
                    this.ae = 0;
                    this.i = false;
                    this.c |= 0x8L;
                    this.c |= 0x400L;
                    this.D = 2;
                    this.E = 12;
                    this.F = 15;
                    this.G = 5;
                    break;
                }
                break;
            }
            case 1: {
                if (this.aq == 9) {
                    this.L();
                    break;
                }
                break;
            }
            case 2: {
                if (this.aq == 10) {
                    this.bx();
                    this.ah = 360;
                    this.i = 3;
                    this.c |= 0x80L;
                    this.c |= 0x8L;
                    break;
                }
                break;
            }
        }
        this.o = false;
        this.p = false;
        this.q = false;
        this.P = 0;
        this.be = -1;
        this.bf = -1;
        this.o = 0;
        this.bg = 0;
        this.bh = 0;
        this.bi = 0;
        this.am = 70;
        this.n = i.i[8];
        this.k = 0;
        this.aZ = 0;
        this.bc = 0;
        this.bd = 0;
        this.bb = 0;
        this.aW = 0;
        this.aS = 0;
        this.aT = 0;
        this.aU = 0;
        this.aV = 0;
        i.cm = -1;
        i.m = null;
        i.l = null;
        (this.a = this.getClass().getResourceAsStream(i.b[this.ap])).read();
        int i = 0;
        while (i == 0) {
            final int read = this.a.read();
            int n = 0;
            byte[] b = new byte[4];
            while (n < read && i == 0) {
                this.a.read(b);
                final int a = a(b, 0);
                final int a2 = a(b, 2);
                if (n == this.aq) {
                    this.av = a;
                    this.aw = a2;
                    i.a = null;
                    i.c = null;
                    i.a = null;
                    System.gc();
                    i.a = new byte[this.av][this.aw];
                    i.c = new byte[this.av][this.aw];
                    i.a = new int[this.av][this.aw];
                    final byte[] b2 = new byte[this.av * this.aw];
                    this.a.read(b2);
                    for (int j = 0; j < this.av; ++j) {
                        for (int k = 0; k < this.aw; ++k) {
                            i.a[j][k] = b2[j + k * this.av];
                        }
                    }
                    i.b = new byte[this.av][this.aw];
                    i.b = new int[this.av][this.aw];
                    this.a.read(b2);
                    for (int l = 0; l < this.av; ++l) {
                        for (int n2 = 0; n2 < this.aw; ++n2) {
                            i.b[l][n2] = b2[l + n2 * this.av];
                        }
                    }
                    this.a.read(b2);
                    for (int n3 = 0; n3 < this.av; ++n3) {
                        for (int n4 = 0; n4 < this.aw; ++n4) {
                            i.a[n3][n4] = b2[n3 + n4 * this.av];
                        }
                    }
                    b = null;
                    i = 1;
                }
                else {
                    this.a.skip(a * a2 * 3);
                }
                ++n;
            }
        }
        this.a.close();
        this.a = null;
        final int n5 = 0;
        this.at = n5;
        this.ar = n5;
        final int n6 = 0;
        this.au = n6;
        this.as = n6;
        this.c();
        System.gc();
    }
    
    private void N() {
        final int dx = this.dX;
        final int dy = this.dY;
        final long n;
        final int a = a(n = i.a[dx][dy], (byte)6, (byte)5);
        final int a2 = a(n, (byte)11, (byte)3);
        int n2 = 14;
        if (this.aq >= this.dM) {
            this.a(this.ap, this.aq, (byte)2);
        }
        if (a2 > 1) {
            for (int i = 0; i < a2; ++i, n2 += 4) {
                final int a3 = a(n, (byte)n2, (byte)4);
                n2 += 4;
                final long n3;
                if (a(n3 = i.a[a3][a(n, (byte)n2, (byte)4)], (byte)3, (byte)3) == 1) {
                    final int a4;
                    if ((a4 = a(n3, (byte)6, (byte)5)) > a) {
                        i.eb = a4;
                        this.cx = dx;
                        this.cy = dy;
                        this.a(this.ap, i.eb, (byte)64);
                        this.ab = true;
                    }
                }
            }
        }
        else {
            i.eb = this.aq;
        }
    }
    
    private void a(final Graphics a) {
        try {
            (this.a = a).setClip(0, 0, 240, 320);
            switch (i.l) {
                case 24: {
                    this.R();
                    break;
                }
                case 34: {
                    this.S();
                    break;
                }
                case 22: {
                    this.cI();
                    break;
                }
                case 33: {
                    this.O();
                    break;
                }
                case 20: {
                    a(this.a, i.a[41], i.a[48], 120, 180, 3, 20, true);
                    break;
                }
                case 17: {
                    this.bg();
                    break;
                }
                case 10: {
                    this.a(this.a);
                    break;
                }
                case 4: {
                    this.T();
                    break;
                }
                case 7: {
                    this.an();
                    break;
                }
                case 30: {
                    this.b(this.a, true);
                    if (i.aN % 20 >= 10) {
                        i.a[41].a(this.a, i.a[82], 120, 250, 17);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.an();
                    break;
                }
                case 5: {
                    if (!this.Q) {
                        this.a.setClip(0, 293, 240, 27);
                        this.ao();
                        this.a.setClip(0, 0, 240, 320);
                    }
                    else {
                        this.ao();
                    }
                    if (i.f != null && this.Q) {
                        this.cr();
                        break;
                    }
                    break;
                }
                case 28: {
                    this.br = 11;
                    this.ao();
                    break;
                }
                case 8:
                case 9:
                case 21:
                case 35: {
                    this.ao();
                    break;
                }
                case 6: {
                    this.aN();
                    break;
                }
                case 1: {
                    this.X();
                    break;
                }
                case 12: {
                    this.U();
                }
                case 15: {
                    this.cv();
                    break;
                }
                case 18: {
                    this.cF();
                    this.aw = true;
                    i.l = 25;
                    this.ep = this.c;
                    this.f = i.a[110] + " " + a(i.i, 4) + " " + i.a[109];
                }
                case 25: {
                    this.cG();
                }
                case 27: {
                    this.Q();
                    break;
                }
                case 31: {
                    if (this.P) {
                        this.P = false;
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 240, 320);
                        i.a[41].e = 5;
                        i.a[41].b(this.a, a(i.a[this.N ? 69 : 68], 220), 120, 160, 3);
                        this.b();
                        this.a();
                        break;
                    }
                    break;
                }
                case 16: {
                    this.ao();
                    break;
                }
                case 29: {
                    this.P();
                    break;
                }
            }
            this.cK();
        }
        catch (Throwable t) {}
    }
    
    private void O() {
        if (this.aw) {
            this.a.setColor(0);
            this.a.setClip(0, 0, 240, 320);
            this.a.fillRect(0, 0, 240, 320);
            i.a[41].e = 3;
            i.a[41].b(this.a, a(i.a[4] + "\n\n" + i.a[103] + "\n" + i.a[104] + "\n" + i.a[105] + "\n\n" + i.a[106] + "\n\n" + i.a[107] + "\n\n" + i.a[108], 235), 120, 10, 17);
            this.a();
            this.aw = false;
        }
    }
    
    private void a(final Graphics graphics, final boolean b, final int n, final int n2) {
        graphics.setClip(0, 0, 240, 320);
        int n3 = 0;
        int n4 = 0;
        if (n != 0 || n2 != 0) {
            n3 -= 24;
            n4 -= 24;
        }
        for (int i = n4; i < 320; i += 24) {
            for (int j = n3; j < 240; j += 24) {
                graphics.drawImage(i.a[8][0], j + n, i + n2, 0);
            }
        }
        i.a[10].a(graphics, 0, this.o + n, this.p + n2, 0, 0, 0);
        if (b) {
            for (int k = 0; k < 320; k += 24) {
                for (int l = 0; l < 240; l += 24) {
                    i.a[17].a(graphics, 16, l, k, 0, 0, 0);
                }
            }
        }
    }
    
    private void a(final Graphics graphics, final boolean b) {
        this.a(graphics, b, 0, 0);
    }
    
    private void P() {
        if (this.aw) {
            this.a(this.a, false, this.N, this.O);
            i.a[17].a(this.a, 11, 120 + f.c[6] + this.N, 136 + f.c[7] + this.O, 0, 0, 0);
            for (int i = 0; i < 3; ++i) {
                i.a[52 + i].a(this.a, 0, f.c[i << 1] + 120 - this.v + this.N, f.c[(i << 1) + 1] + 136 - this.w + this.O, 0, 0, 0);
            }
        }
        switch (this.L) {
            case 1: {
                if (!this.aw) {
                    this.a.setColor(this.M);
                    this.a.fillRect(0, 0, 240, 320);
                    for (int j = 0; j < 3; ++j) {
                        i.a[52 + j].a(this.a, 0, f.c[j << 1] + 120 - this.v, f.c[(j << 1) + 1] + 136 - this.w, 0, 0, 0);
                    }
                    break;
                }
                break;
            }
            case 2: {}
            case 3: {}
            case 4: {}
            case 5: {}
            case 6: {}
            case 7: {}
            case 8: {
                b.a(this.a);
            }
            case 9:
            case 10: {
                b.a(this.a);
                final int e = i.a[41].e;
                i.a[41].e = 3;
                final String a = a(i.a[40] + "\n" + i.a[97], 220);
                i.a[41].a(a);
                a(this.a, (240 - a.c >> 1) - 3, (320 - a.d >> 1) - 3, a.c + 6, a.d + 6, 7096587, 0);
                i.a[41].b(this.a, a, 120, 160, 3);
                i.a[41].e = e;
                break;
            }
        }
    }
    
    private void Q() {
        if (this.aw || this.e) {
            this.a.setClip(0, 0, 240, 320);
            this.a(this.a, false);
            i.a[17].a(this.a, 11, 120 + f.c[6], 136 + f.c[7], 0, 0, 0);
            this.a();
            this.b();
            i.a[41].a(this.a, i.a[27].toLowerCase(), 222, 311, 10);
            this.aw = false;
        }
        else {
            this.a.setClip(this.h + 120, this.i + 136, 14, 22);
            i.a[10].a(this.a, 0, this.o, this.p, 0, 0, 0);
        }
        if (this.q != 0) {
            this.e = false;
            this.aw = true;
            for (int i = 0; i < this.q; ++i) {
                if (b(i)) {
                    i.a[10].a(this.a, i + 1, this.o, this.p, 0, 0, 0);
                }
            }
            this.a.setClip(0, 0, 240, 320);
            if (this.z < this.y) {
                i.a[9].a(this.a, 5, this.z, f.c[this.q << 1] + 120 - 12, f.c[(this.q << 1) + 1] + 124, 0, 0, 0);
                ++this.z;
            }
            else {
                if (this.n % this.m >= this.m >> 1) {
                    i.a[10].a(this.a, this.q + 1, this.o, this.p, 0, 0, 0);
                    ++this.r;
                }
                if (this.r >= 15) {
                    i.a[this.q] = true;
                    this.r = 0;
                    this.q = 0;
                    this.z = 0;
                    this.l();
                    this.e = true;
                    this.aw = false;
                }
            }
        }
        else {
            for (int j = 0; j < 3; ++j) {
                if (i.a[j]) {
                    i.a[10].a(this.a, j + 1, this.o, this.p, 0, 0, 0);
                }
            }
        }
        for (int k = 0; k < 3; ++k) {
            if (i.b[k]) {
                final int n = 52 + k;
                if (this.s != k) {
                    i.a[n].a(this.a, 0, f.c[k << 1] + 120 - this.v, f.c[(k << 1) + 1] + 136 - this.w, 0, 0, 0);
                }
            }
        }
        if (this.s != -1) {
            this.aw = true;
            if (this.c(this.s)) {
                this.s = -1;
                if (i.b[0] && i.b[1] && i.b[2]) {
                    this.g();
                    this.aw = true;
                    this.g = true;
                    i.l = 29;
                }
            }
            return;
        }
        this.n %= this.m;
        this.a.setClip(this.f + 120, 136 + this.g, 14, 22);
        i.a[55].a(this.a, 0, this.n, 120 + this.f, 136 + this.g, 0, 0, 0);
        ++this.n;
        if (this.e) {
            final int e = i.a[41].e;
            i.a[41].e = 1;
            final String a = a(this.b + "\n" + this.c, 220);
            i.a[41].a(a);
            final int n2 = (240 - a.c >> 1) - 3;
            final int n3 = 250 - (a.d >> 1) - 3;
            final int n4 = a.c + 6;
            final int n5 = a.d + 6;
            this.a.setClip(n2, n3, n4, n5);
            a(this.a, n2, n3, n4, n5, 7096587, 0);
            i.a[41].b(this.a, a, 120, 250, 3);
            i.a[41].e = e;
            this.e = false;
        }
    }
    
    private boolean c(final int n) {
        final int n2 = 52 + n;
        final int n3 = f.c[n << 1] + 120;
        final int n5;
        final int n4 = (n5 = f.c[(n << 1) + 1] + 136) - this.u;
        final int n6 = n3 - this.t;
        Label_0104: {
            if (n4 < 0) {
                this.u -= 2;
                if (this.u > n5) {
                    break Label_0104;
                }
            }
            else {
                if (n4 <= 0) {
                    break Label_0104;
                }
                this.u += 2;
                if (this.u < n5) {
                    break Label_0104;
                }
            }
            this.u = n5;
        }
        Label_0158: {
            if (n6 < 0) {
                this.t -= 3;
                if (this.t > n3) {
                    break Label_0158;
                }
            }
            else {
                if (n6 <= 0) {
                    break Label_0158;
                }
                this.t += 3;
                if (this.t < n3) {
                    break Label_0158;
                }
            }
            this.t = n3;
        }
        i.a[n2].a(this.a, 0, this.t - this.v, this.u - this.w, 0, 0, 0);
        if (this.t != n3 || this.u != n5) {
            return false;
        }
        this.t = n3;
        this.u = n5;
        if (this.x < 20) {
            if (this.x % 2 == 1) {
                this.a.setColor(0 + 838860 * this.x);
                this.a.fillRect(0, 0, 240, 320);
            }
            ++this.x;
            return false;
        }
        if (this.z < this.y) {
            i.a[9].a(this.a, 5, this.z, f.c[n << 1] + 120 - 12, f.c[(n << 1) + 1] + 124, 0, 0, 0);
            ++this.z;
            return false;
        }
        this.z = 0;
        this.x = 0;
        return true;
    }
    
    private void R() {
        String s = null;
        final a a;
        (a = i.a[41]).e = 15;
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        int i = 0;
    Label_0302_Outer:
        while (i < 6) {
            int n = -1;
            while (true) {
                String s2 = null;
                switch (i) {
                    case 0: {
                        n = 60;
                        s2 = " 6 - Add " + String.valueOf(this.aZ);
                        break;
                    }
                    case 1: {
                        n = 61;
                        s2 = " 7 - Add " + String.valueOf(this.bb);
                        break;
                    }
                    case 2: {
                        n = 62;
                        s2 = " 8 - x " + String.valueOf(this.cA) + ((this.cA >= 4) ? " blue potion" : "");
                        break;
                    }
                    case 3: {
                        n = 63;
                        s2 = " 9 - " + i.a[this.R ? 66 : 67];
                        break;
                    }
                    case 4: {
                        n = 64;
                        s2 = " 0 - " + i.a[this.S ? 66 : 67];
                        break;
                    }
                    case 5: {
                        n = -1;
                        s2 = "5 to activate lang cheat";
                        break;
                    }
                    default: {
                        final int n2 = i * 35;
                        if (n >= 0) {
                            a.a(this.a, i.a[n], 110, n2, 17);
                        }
                        final int n3 = n2 + a.e;
                        a.a(this.a, i.a[65], 110, n3, 24);
                        a.a(this.a, s, 110, n3, 20);
                        ++i;
                        continue Label_0302_Outer;
                    }
                }
                s = s2;
                continue;
            }
        }
        final String s3 = "Pound - Pass levels ";
        StringBuffer sb;
        String str;
        if (this.aa) {
            sb = new StringBuffer().append(s3);
            str = "on";
        }
        else {
            sb = new StringBuffer().append(s3);
            str = "off";
        }
        a.a(this.a, sb.append(str).toString(), 110, 290, 17);
        this.a();
        this.b();
    }
    
    private void S() {
        final a a;
        (a = i.a[41]).e = 2;
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        String s = null;
        switch (this.df) {
            case 1: {
                s = "Tips";
                A(this.a[1]);
                this.cr();
                break;
            }
            case 0: {
                s = "Mix";
                a.b(this.a, i.a[this.a[0]], 10, 5, 20);
                break;
            }
            default: {
                s = "";
                break;
            }
        }
        a.e = 2;
        a.a(this.a, s, 40, 308, 20);
        a.a(this.a, "" + this.a[this.df], 120, 308, 20);
        a.b(this.a, "Use up, down, left and right to navigate", 10, 280, 20);
        this.a();
        this.b();
    }
    
    private void T() {
        this.an();
    }
    
    private void b(final Graphics graphics, final boolean b) {
        graphics.drawImage(i.b, 0, 0, 20);
        graphics.drawImage(i.a, 0, 0, 20);
        if (b) {
            graphics.drawImage(i.c, 120, 319, 33);
        }
    }
    
    private void U() {
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        final a a;
        (a = i.a[41]).a(this.a, i.a[35], 120, 50, 17);
        a a2;
        Graphics graphics;
        String s;
        int n;
        int n2;
        int n3;
        if (this.i == 2) {
            a2 = a;
            graphics = this.a;
            s = i.a[26];
            n = 0;
            n2 = 320;
            n3 = 36;
        }
        else {
            a.a(this.a, i.a[1], 0, 320, 36);
            final String string = i.a[111] + " " + ((a(i.i, 4) < 500) ? a(i.i, 4) : 500) + " " + i.a[109];
            a2 = a;
            graphics = this.a;
            s = string;
            n = 120;
            n2 = 160;
            n3 = 17;
        }
        a2.a(graphics, s, n, n2, n3);
        this.az();
    }
    
    private void b(final Graphics graphics) {
        final int n = this.ar % i.cC;
        final int n2 = this.as % i.cD;
        final int n3 = (this.ar + 240) % i.cC;
        final int n4 = (this.as + 240) % i.cD;
        Graphics graphics2 = null;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        Label_0157: {
            if (n3 > n) {
                if (n4 > n2) {
                    graphics2 = graphics;
                    n5 = n;
                    n6 = n2;
                    n7 = 0;
                    n8 = 0;
                    break Label_0157;
                }
                a(graphics, n, n2, 0, 0);
                graphics2 = graphics;
                n5 = n;
                n6 = 0;
                n7 = 0;
            }
            else {
                if (n4 > n2) {
                    a(graphics, n, n2, 0, 0);
                    graphics2 = graphics;
                    n5 = 0;
                    n6 = n2;
                    n7 = 240 - n3;
                    n8 = 0;
                    break Label_0157;
                }
                a(graphics, n, n2, 0, 0);
                a(graphics, n, 0, 0, 240 - n4);
                a(graphics, 0, n2, 240 - n3, 0);
                graphics2 = graphics;
                n5 = 0;
                n6 = 0;
                n7 = 240 - n3;
            }
            n8 = 240 - n4;
        }
        a(graphics2, n5, n6, n7, n8);
    }
    
    private static void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        graphics.drawImage(i.d, n3 - n, n4 - n2, 0);
    }
    
    private static void V() {
        i.cC = 264;
        i.cD = 264;
        i.d = Image.createImage(i.cC, i.cD);
        i.b = i.d.getGraphics();
    }
    
    private void b(final int n, final int n2) {
        final int n3 = this.ar - this.ar % 24;
        final int n4 = this.as - this.as % 24;
        final int n5 = this.ar + i.cC - 24 - (this.ar + i.cC - 24) % 24;
        final int n6 = this.as + i.cD - 24 - (this.as + i.cD - 24) % 24;
        final int n7 = n * 24;
        final int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            final int n9 = i.a[n][n2] & 0xFF;
            final byte b;
            if ((b = i.a[n][n2]) < 80) {
                if (n9 == 4 || n9 == 16 || n9 == 15) {
                    this.c(n, n2);
                    return;
                }
                i.b.drawImage(i.a[8][0], n7 % i.cC, n8 % i.cD, 0);
            }
        }
    }
    
    private void c(final int n, final int n2) {
        final int n3 = this.ar - this.ar % 24;
        final int n4 = this.as - this.as % 24;
        final int n5 = this.ar + i.cC - 24 - (this.ar + i.cC - 24) % 24;
        final int n6 = this.as + i.cD - 24 - (this.as + i.cD - 24) % 24;
        final int n7 = n * 24;
        final int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            this.a(n7, n8, n7, n8, false);
        }
    }
    
    public static int a(final int n) {
        switch (n) {
            case 0: {
                return 42;
            }
            case 20: {
                return 43;
            }
            case 22: {
                i.a[45].b = 0;
                return 45;
            }
            case 23: {
                i.a[45].b = 1;
                return 45;
            }
            case 4: {
                return 56;
            }
            case 15: {
                i.a[57].b = 0;
                return 57;
            }
            case 14: {
                i.a[57].b = 1;
                return 57;
            }
            case 16: {
                return 58;
            }
            case 2: {
                i.a[59].b = 0;
                return 59;
            }
            case 3: {
                i.a[59].b = 1;
                return 59;
            }
            case 1: {
                return 60;
            }
            default: {
                return -1;
            }
        }
    }
    
    private void a(final int n, final int n2, final int n3, final int n4, final boolean b) {
        final Graphics b2 = i.b;
        final int cc = i.cC;
        final int cd = i.cD;
        final int n5 = n % cc;
        this.by = n2 % cd - 24;
        this.bH = n2 / 24 - 1;
        for (int i = n2; i <= n4; i += 24) {
            this.bx = n5 - 24;
            this.bG = n / 24 - 1;
            this.by += 24;
            ++this.bH;
            if (this.by >= cd) {
                this.by = 0;
            }
            for (int j = n; j <= n3; j += 24) {
                this.bx += 24;
                ++this.bG;
                if (this.bx >= cc) {
                    this.bx = 0;
                }
                if (this.bG >= 0 && this.bG < this.av && this.bH >= 0) {
                    if (this.bH < this.aw) {
                        this.bI = i.a[this.bG][this.bH];
                        this.bJ = (i.a[this.bG][this.bH] & 0xFF);
                        if (this.bI < 80 && !b) {
                            b2.drawImage(i.a[8][0], this.bx, this.by, 0);
                        }
                        Label_0459: {
                            if (this.bJ > -1 && this.bJ < 38) {
                                i k = null;
                                int af = 0;
                                switch (this.bJ) {
                                    case 4: {
                                        this.aE = 20;
                                        this.aF = 7;
                                        final int n6 = 0;
                                        this.bO = n6;
                                        this.bN = n6;
                                        break Label_0459;
                                    }
                                    case 27: {
                                        this.aE = 21;
                                        this.aF = 0;
                                        final int n7 = 0;
                                        this.bO = n7;
                                        this.bN = n7;
                                        break Label_0459;
                                    }
                                    case 15: {
                                        if (this.ce == 0) {
                                            this.aE = 14;
                                            k = this;
                                            af = 0 + this.ce * 5 / 10;
                                            break;
                                        }
                                        break Label_0459;
                                    }
                                    case 16: {
                                        if (this.ce != 9) {
                                            break Label_0459;
                                        }
                                        this.aE = 15;
                                        this.aF = 4 - this.ce * 5 / 10;
                                        if (this.aF < 0) {
                                            k = this;
                                            af = 0;
                                            break;
                                        }
                                        break Label_0459;
                                    }
                                }
                                k.aF = af;
                            }
                        }
                        if (this.aE != -1) {
                            if (i.a[this.aE] == null) {
                                i.a[a(this.aE)].a(b2, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                            }
                            else {
                                b2.drawImage(i.a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.bP = 0;
                            this.aE = -1;
                            final int n8 = 0;
                            this.bO = n8;
                            this.bN = n8;
                        }
                        if (this.bI != -1 && !b) {
                            Label_0880: {
                                final byte b3;
                                i l = null;
                                int ah = 0;
                                if ((b3 = (byte)(this.bI - 80)) >= 0) {
                                    this.aG = 0;
                                    l = this;
                                    ah = b3;
                                }
                                else {
                                    switch (this.bI) {
                                        case 10: {
                                            i.a[16].a(b2, 0, this.bx, this.by, 0, 0, 0);
                                            break Label_0880;
                                        }
                                        case 1: {
                                            if (i.b[this.bG][this.bH] == 0 && (i.e == null || i.e[this.bG][this.bH] == 0)) {
                                                this.aA();
                                                this.aH -= this.bR;
                                                this.bO = 0;
                                            }
                                            break Label_0880;
                                        }
                                        case 0: {
                                            if (i.b[this.bG][this.bH] == 0 && (i.e == null || i.e[this.bG][this.bH] == 0)) {
                                                this.aA();
                                            }
                                            break Label_0880;
                                        }
                                        case 34: {
                                            if (this.ce == 9) {
                                                this.aG = 14;
                                                l = this;
                                                ah = 0 + this.ce * 5 / 10;
                                                break;
                                            }
                                            break Label_0880;
                                        }
                                        case 35: {
                                            if (this.ce != 0) {
                                                break Label_0880;
                                            }
                                            this.aG = 15;
                                            this.aH = 4 - this.ce * 5 / 10;
                                            if (this.aH < 0) {
                                                l = this;
                                                ah = 0;
                                                break;
                                            }
                                            break Label_0880;
                                        }
                                    }
                                }
                                l.aH = ah;
                            }
                            if (this.aG != -1) {
                                if (i.a[this.aG] == null) {
                                    i.a[a(this.aG)].a(b2, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                                }
                                else {
                                    b2.drawImage(i.a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                this.aG = -1;
                                this.bP = 0;
                                final int n9 = 0;
                                this.bO = n9;
                                this.bN = n9;
                            }
                        }
                        if (this.i == 2) {
                            this.d(b2);
                        }
                    }
                }
            }
        }
    }
    
    private void c(final Graphics graphics) {
        for (int i = -1; i < 12; ++i) {
            for (int j = -1; j < 12; ++j) {
                this.bG = j + this.cI;
                this.bH = i + this.cJ;
                if (this.bG >= 0 && this.bG < this.av && this.bH >= 0) {
                    if (this.bH < this.aw) {
                        this.bI = i.a[this.bG][this.bH];
                        this.bJ = (i.a[this.bG][this.bH] & 0xFF);
                        this.bx = j * 24 - this.cK;
                        this.by = i * 24 - this.cL;
                        this.W();
                        Label_0816: {
                            if (this.bJ > -1 && this.bJ < 38) {
                                Label_0614: {
                                    i k = null;
                                    switch (this.bJ) {
                                        case 35: {
                                            k = this;
                                            break;
                                        }
                                        case 34: {
                                            i.a[27].a(graphics, 2, 0, this.bx, this.by, 0, 0, 0);
                                            break Label_0614;
                                        }
                                        case 14:
                                        case 33: {
                                            this.l(this.bJ);
                                            break Label_0614;
                                        }
                                        case 6: {
                                            this.aC();
                                            if (this.by + 24 < 240) {
                                                graphics.clipRect(this.bx, this.by, 24, 24);
                                            }
                                            break Label_0614;
                                        }
                                        case 15: {
                                            if (this.ce != 0 && this.ce <= 5) {
                                                this.aE = 14;
                                                this.aF = 0 + this.ce * 5 / 10;
                                            }
                                            break Label_0614;
                                        }
                                        case 16: {
                                            if (this.ce == 9 || this.ce < 5) {
                                                break Label_0614;
                                            }
                                            this.aE = 15;
                                            this.aF = 4 - this.ce * 5 / 10;
                                            if (this.aF < 0) {
                                                this.aF = 0;
                                            }
                                            break Label_0614;
                                        }
                                        case 7: {
                                            this.aH();
                                            break Label_0614;
                                        }
                                        case 4: {
                                            if (i.a[this.bG][this.bH] >> 8 >= this.ax) {
                                                this.ag();
                                            }
                                            break Label_0614;
                                        }
                                        case 5:
                                        case 28: {
                                            this.aE = 11;
                                            this.aF = 0;
                                            break Label_0614;
                                        }
                                        case 8:
                                        case 9: {
                                            this.aG();
                                            break Label_0614;
                                        }
                                        case 3: {
                                            final int n;
                                            if ((n = (i.a[this.bG][this.bH] >> 8) - 1) >= 0) {
                                                this.aE = 12;
                                                this.aF = (byte)n;
                                            }
                                            break Label_0614;
                                        }
                                        case 37: {
                                            i.a[27].a(graphics, 2, 0, this.bx, this.by, 0, 0, 0);
                                            k = this;
                                            break;
                                        }
                                    }
                                    k.ab();
                                }
                                if (this.aE != -1) {
                                    if (i.a[this.aE] == null) {
                                        i.a[a(this.aE)].a(graphics, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                                    }
                                    else {
                                        graphics.drawImage(i.a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                                    }
                                    this.bP = 0;
                                    this.aE = -1;
                                    graphics.setClip(0, -this.bk, 240, 240);
                                }
                                else {
                                    if (i.b == null) {
                                        break Label_0816;
                                    }
                                    if (this.bK != -1) {
                                        i.b.a(graphics, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, 0, 0, 0);
                                        this.bK = -1;
                                    }
                                    i.b = null;
                                }
                                final int n2 = 0;
                                this.bO = n2;
                                this.bN = n2;
                            }
                        }
                        if (this.bI != -1) {
                            Label_1530: {
                                if ((byte)(this.bI - 80) < 0) {
                                    final int n3 = i.b[this.bG][this.bH];
                                    i l = null;
                                    Label_1526: {
                                        switch (this.bI) {
                                            case 49: {
                                                this.aB();
                                                break Label_1530;
                                            }
                                            case 48: {
                                                this.Z();
                                                break Label_1530;
                                            }
                                            case 21: {
                                                this.ac();
                                                break Label_1530;
                                            }
                                            case 46: {
                                                this.ad();
                                                break Label_1530;
                                            }
                                            case 45: {
                                                this.aK();
                                                break Label_1530;
                                            }
                                            case 44: {
                                                this.ae();
                                                this.bL = 0;
                                                break Label_1530;
                                            }
                                            case 12: {
                                                this.af();
                                                break Label_1530;
                                            }
                                            case 36: {
                                                this.aj();
                                                break Label_1530;
                                            }
                                            case 18: {
                                                this.ai();
                                                break Label_1530;
                                            }
                                            case 34: {
                                                if (this.ce != 9 && this.ce >= 5) {
                                                    this.aG = 14;
                                                    this.aH = 0 + this.ce * 5 / 10;
                                                }
                                                break Label_1530;
                                            }
                                            case 35: {
                                                if (this.ce == 0 || this.ce > 5) {
                                                    break Label_1530;
                                                }
                                                this.aG = 15;
                                                this.aH = 4 - this.ce * 5 / 10;
                                                if (this.aH < 0) {
                                                    this.aH = 0;
                                                }
                                                break Label_1530;
                                            }
                                            case 28: {
                                                this.aM();
                                                break Label_1530;
                                            }
                                            case 16: {
                                                this.aJ();
                                                break Label_1530;
                                            }
                                            case 14: {
                                                this.aI();
                                                break Label_1530;
                                            }
                                            case 32: {
                                                this.aF();
                                                break Label_1530;
                                            }
                                            case 11: {
                                                this.aE();
                                                break Label_1530;
                                            }
                                            case 30: {
                                                i.b = i.a[20];
                                                this.bK = 0;
                                                this.bL = 0 + (n3 - 1) * 7 / 16;
                                                break Label_1530;
                                            }
                                            case 37: {
                                                this.aG = 17;
                                                this.aH = 0 + (n3 - 1) * 3 / 8;
                                                break Label_1530;
                                            }
                                            case 23: {
                                                i.b = i.a[12];
                                                this.bL = 0;
                                                this.b((byte)23);
                                                break Label_1530;
                                            }
                                            case 22: {
                                                i.b = i.a[12];
                                                this.bL = 1;
                                                this.b((byte)22);
                                                break Label_1530;
                                            }
                                            case 43: {
                                                this.c((byte)this.bI);
                                                break Label_1530;
                                            }
                                            case 19: {
                                                this.c((byte)this.bI);
                                            }
                                            case 10: {
                                                break Label_1530;
                                            }
                                            case 47: {
                                                l = this;
                                                break;
                                            }
                                            case 9: {
                                                this.aA();
                                                if ((i.b[this.bG][this.bH] & 0xFC00000) == 0x8400000) {
                                                    this.bN += this.aj;
                                                    this.bO += this.ak;
                                                }
                                                break Label_1530;
                                            }
                                            case 4: {}
                                            case 5: {}
                                            case 2: {
                                                break Label_1530;
                                            }
                                            case 1: {
                                                if ((i.b[this.bG][this.bH] & Integer.MIN_VALUE) != 0x0 || this.bR != 0) {
                                                    l = this;
                                                    break;
                                                }
                                                break Label_1530;
                                            }
                                            case 0: {
                                                if ((i.b[this.bG][this.bH] & Integer.MIN_VALUE) != 0x0) {
                                                    break Label_1526;
                                                }
                                                break Label_1530;
                                            }
                                            case 6: {}
                                            case 7: {
                                                break Label_1530;
                                            }
                                            case 8: {
                                                l = this;
                                                break;
                                            }
                                        }
                                    }
                                    l.aA();
                                }
                            }
                            if (this.aG != -1) {
                                if (i.a[this.aG] == null) {
                                    i.a[a(this.aG)].a(graphics, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                                }
                                else {
                                    graphics.drawImage(i.a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                this.aG = -1;
                                this.bP = 0;
                            }
                            else {
                                if (i.b == null) {
                                    continue;
                                }
                                if (this.bG == this.co && this.bH == this.cp) {
                                    i.c = i.b;
                                    this.ct = this.bK;
                                    this.cs = this.bL;
                                    this.cr = this.bx + this.bN;
                                    this.cq = this.by + this.bO;
                                }
                                if (this.bK != -1) {
                                    i.b.a(graphics, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                                    this.bK = -1;
                                }
                                else {
                                    i.b.a(graphics, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                                }
                                i.b = null;
                                this.bM = 0;
                            }
                            final int n4 = 0;
                            this.bO = n4;
                            this.bN = n4;
                        }
                    }
                }
            }
        }
    }
    
    private void W() {
        this.a.setClip(0, 0, 240, 240);
    }
    
    private void X() {
        final Graphics a = this.a;
        final int an = i.aN;
        this.bQ = (((this.aS & 0x1000) == 0x0) ? this.k : 0);
        a.translate(0, 40);
        this.bk = 0;
        this.W();
        if (this.bj > 0) {
            this.bk = this.bj * an % ((this.bj >> 1) + 1) % 12;
        }
        if (this.bk > this.as) {
            this.bk = this.as;
        }
        this.as -= this.bk;
        this.cI = this.ar / 24;
        this.cJ = this.as / 24;
        this.cK = this.ar % 24;
        this.cL = this.as % 24;
        this.bR = (an & 0x3F) >> 1;
        if (this.bR >= 4) {
            this.bR = 0;
        }
        final int n = this.ar - this.cK;
        final int n2 = this.as - this.cL;
        final int n3 = this.ar + i.cC - 24 - (this.ar + i.cC - 24) % 24;
        final int n4 = this.as + i.cD - 24 - (this.as + i.cD - 24) % 24;
        if (i.cE == -1) {
            this.a(n, n2, n3, n4, false);
            i.cE = n;
            i.cF = n3;
            i.cG = n2;
            i.cH = n4;
        }
        if (i.cE != n) {
            int n5;
            int n6;
            if (i.cE < n) {
                n5 = i.cF + 24;
                n6 = n3;
            }
            else {
                n5 = n;
                n6 = i.cE - 24;
            }
            this.a(n5, n2, n6, n4, false);
            i.cE = n;
            i.cF = n3;
        }
        if (i.cG != n2) {
            int n7;
            int n8;
            if (i.cG < n2) {
                n7 = i.cH + 24;
                n8 = n4;
            }
            else {
                n7 = n2;
                n8 = i.cG - 24;
            }
            this.a(n, n7, n3, n8, false);
            i.cG = n2;
            i.cH = n4;
        }
        this.b(a);
        this.W();
        this.c(a);
        if (i.D) {
            a.setColor(0);
            a.fillRect(0, 0, 240, 320);
            this.az();
            if (i.e != null) {
                a.drawImage(i.e, i.cM, i.cN, i.cO);
            }
            if (this.S != this.T) {
                int s;
                int n9 = s = this.S;
                while (true) {
                    int n10 = s;
                    if (n9 == this.T) {
                        break;
                    }
                    final int n11 = i.a[n10 << 1] * 24 - this.ar;
                    final int n12 = i.a[(n10 << 1) + 1] * 24 - this.as;
                    a a2;
                    Graphics graphics;
                    int n13;
                    int a4;
                    if (i.c[n10] < 0) {
                        final a a3;
                        a2 = (a3 = i.a[2]);
                        graphics = a;
                        n13 = 0;
                        a4 = a(a3, 0, i.b[n10]);
                    }
                    else {
                        a2 = i.a[9];
                        graphics = a;
                        n13 = i.c[n10];
                        a4 = i.b[n10];
                    }
                    a2.a(graphics, n13, a4, n11, n12, 0, 0, 0);
                    n9 = (s = (++n10 & 0x7));
                }
            }
            this.a.setClip(0, 0, 240, 320);
            a.translate(0, -40);
            this.ah();
            return;
        }
        this.az();
        if (this.j) {
            this.d(this.cK, this.cL);
        }
        if (i.e != null) {
            a.drawImage(i.e, i.cM, i.cN, i.cO);
        }
        if (this.al > 0) {
            this.Y();
        }
        if (this.i != 0) {
            this.ap();
        }
        for (int i = -1; i < 12; ++i) {
            for (int j = -1; j < 12; ++j) {
                final int n14 = j + this.cI;
                final int n15 = i + this.cJ;
                if (n14 >= 0 && n14 < this.av && n15 >= 0) {
                    if (n15 < this.aw) {
                        final int n16 = i.a[n14][n15] & 0xFF;
                        final byte b = i.a[n14][n15];
                        if (n16 < 38 || n16 >= 80) {
                            final int n17 = j * 24 - this.cK;
                            final int n18 = i * 24 - this.cL;
                            Label_1145: {
                                a a5;
                                Graphics graphics2;
                                int n20;
                                int n21;
                                if (n16 >= 20 && n16 < 26) {
                                    final int n19 = n16 - 20;
                                    a5 = i.a[3];
                                    graphics2 = a;
                                    n20 = n19;
                                    n21 = (an >> 2) % (i.a[3].e[n19] & 0xFF);
                                }
                                else {
                                    switch (n16) {
                                        case 36: {
                                            i.a[20].a(a, 0, (0 + ((i.a[n14][n15] >> 8) - 1) * 7) / 16, n17, n18, 0, 0, 0);
                                            break;
                                        }
                                        case 31: {
                                            final int n22 = i.a[n14][n15] >> 8;
                                            final a a6 = i.a[15];
                                            a6.a(this.a, n22, (i.aN >> 1) % (a6.e[n22] & 0xFF), n17, n18, 0, 0, 0);
                                            break;
                                        }
                                        case 32: {
                                            i.a[16].a(this.a, 0, i.a[n14][n15] >> 8 & 0xFF, n17, n18, 0, 0, 0);
                                            break;
                                        }
                                        default: {
                                            final byte b2;
                                            if ((b2 = (byte)(n16 - 80)) >= 0) {
                                                i.a[42].a(a, b2, n17, n18, 0, 0, 0);
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    final int n23;
                                    if ((n23 = (i.a[n14][n15] & 0xF0000000) >> 28) <= 0) {
                                        break Label_1145;
                                    }
                                    a5 = i.a[13];
                                    graphics2 = a;
                                    n20 = 0;
                                    n21 = n23;
                                }
                                a5.a(graphics2, n20, n21, n17, n18, 0, 0, 0);
                            }
                            if (b == 54) {
                                i.a[7].a(a, 0, a(i.a[7], 0, i.b[n14][n15]), n17, n18, 0, 0, 0);
                            }
                        }
                    }
                }
            }
        }
        if (this.y) {
            a.drawImage(i.a[13].a[0][0 + this.bD], (this.bB - this.cI) * 24 - this.cK + this.bz, (this.bC - this.cJ + 1) * 24 - this.cL + this.bA, 0);
            this.y = false;
        }
        if (this.ay != -1) {
            a.drawImage(i.a[13][0], this.bv - 12, this.bw - 24 + 2, 3);
            a.drawImage(i.a[this.ay][this.az], this.bv - 12, this.bw - 24, 3);
        }
        if (this.S != this.T) {
            int s2;
            int n24 = s2 = this.S;
            while (true) {
                int n25 = s2;
                if (n24 == this.T) {
                    break;
                }
                final int n26 = i.a[n25 << 1] * 24 - this.ar;
                final int n27 = i.a[(n25 << 1) + 1] * 24 - this.as;
                a a7;
                Graphics graphics3;
                int n28;
                int a9;
                if (i.c[n25] < 0) {
                    final a a8;
                    a7 = (a8 = i.a[2]);
                    graphics3 = a;
                    n28 = 0;
                    a9 = a(a8, 0, i.b[n25]);
                }
                else {
                    a7 = i.a[9];
                    graphics3 = a;
                    n28 = i.c[n25];
                    a9 = i.b[n25];
                }
                a7.a(graphics3, n28, a9, n26, n27, 0, 0, 0);
                n24 = (s2 = (++n25 & 0x7));
            }
        }
        this.as += this.bk;
        if (this.v) {
            a(a, i.a[41], i.a[40], 120, 160, 17, 19, false);
        }
        if (this.bn > i.aN && this.i != 2) {
            if (!this.aj && !this.f) {
                final int n30;
                final int n29 = ((n30 = this.bn - i.aN) < 20) ? ((n30 - 10) * 240 / 20) : ((n30 >= 50) ? ((60 - n30) * 240 / 15) : 120);
                final int n31 = 240 - n29;
                a(a, i.a[41], i.a[i.d[this.ap]], n29, 15, 17, 20, false);
                a(a, i.a[41], i.a[i.g[this.ap][this.aq]], n31, 50, 17, 20, false);
                if (this.P > 0) {
                    a(a, i.a[41], this.d, 120, 190, 17, 5, true);
                }
            }
        }
        else if (this.Z > i.aN && this.r <= 2) {
            a(a, i.a[41], i.a[36], 120, 230, 33, 20, false);
        }
        else if (this.Z == i.aN) {
            if (this.r <= 2) {
                ++this.r;
                this.J();
            }
        }
        Label_1911: {
            i k = null;
            Graphics graphics4 = null;
            int n32 = 0;
            switch (this.i) {
                case 4: {
                    this.at();
                    break Label_1911;
                }
                case 3: {
                    if (this.ad != -1 && this.ad != 15) {
                        k = this;
                        graphics4 = a;
                        n32 = 5;
                        break;
                    }
                    break Label_1911;
                }
                case 5: {
                    if (this.ad != -1 && this.ad != 15 && this.ad != 13 && this.ad != 12) {
                        k = this;
                        graphics4 = a;
                        n32 = 4;
                        break;
                    }
                    break Label_1911;
                }
            }
            k.a(graphics4, n32);
        }
        a.translate(0, -40);
        a.setClip(0, 0, 240, 320);
        if (this.a == null) {
            this.ah();
        }
        if (this.e != null) {
            this.m = true;
            a(a, i.a[41], this.e, 120, 263, 33, 4, true);
        }
        if (this.a != null && !i.D) {
            this.m = true;
            this.a.a(a);
        }
        if (this.bl > 0) {
            this.m = true;
            a.setColor(0);
            a.fillRect(0, 0, 240, this.bl);
            a.fillRect(0, 320 - this.bl, 240, this.bl);
            a.translate(0, 40);
            this.az();
            if (i.e != null) {
                a.drawImage(i.e, i.cM, i.cN, i.cO);
            }
            if (i.c != null) {
                if (this.ct != -1) {
                    i.c.a(a, this.ct, this.cs, (this.co - this.cI) * 24 - this.cK, (this.cp - this.cJ) * 24 - this.cL, this.bM, 0, 0);
                }
                else {
                    i.c.a(a, this.cs, this.cr, this.cq, this.bM, 0, 0);
                }
            }
            a.translate(0, -40);
        }
    }
    
    private void Y() {
        final int n = this.as - 24;
        final int n2 = this.as + 320;
        final int ar = this.ar;
        final int n3 = this.ar + 240;
        final int n4 = (i.aN >> 1) % i.a[2].a(1);
        for (int i = 0; i < i.e.length; i += 3) {
            int n5 = 0;
            final byte b;
            final int n6;
            if ((n6 = (b = i.e[i + 2]) * 24) > n && n6 < n2) {
                final byte b2 = i.e[i + 0];
                final byte b3 = i.e[i + 1];
                final int n7 = b2 * 24;
                final int n8 = b3 * 24 + 24;
                if ((n7 >= ar && n7 <= n3) || (n8 >= ar && n8 <= n3) || (n7 <= ar && n8 >= n3)) {
                    int n9 = n7 - ar;
                    final int n10 = b2 + ((b2 != 0) ? -1 : 0);
                    boolean b4 = true;
                    if (i.a[n10][b] == 48 && (i.b[n10][b] & 0x8) != 0x0) {
                        n9 -= 12;
                        b4 = false;
                        if ((i.b[n10][b + 1] & 0x7) == 0x3) {
                            n5 = -i.b[n10][b + 1];
                        }
                        else {
                            n9 -= -i.b[n10][b + 1];
                        }
                    }
                    int n11 = n8 - ar;
                    final byte b5;
                    final int n12 = b5 + (((b5 = b3) < this.av - 1) ? 1 : 0);
                    boolean b6 = true;
                    if (i.a[n12][b] == 48 && (i.b[n12][b] & 0x8) != 0x0) {
                        n11 += 12;
                        b6 = false;
                        if ((i.b[n12][b + 1] & 0x7) == 0x3) {
                            n5 = -i.b[n12][b + 1];
                        }
                        else {
                            n11 += -i.b[n12][b + 1];
                        }
                    }
                    int n13 = n6 - this.as + 10 + n5;
                    this.a.setColor(1820159);
                    this.a.drawLine(n9, n13, n11, n13);
                    n13 += 2;
                    this.a.drawLine(n9, n13, n11, n13);
                    --n13;
                    this.a.setColor(14153215);
                    this.a.drawLine(n9, n13, n11, n13);
                    a a;
                    Graphics graphics;
                    int n14;
                    int n15;
                    byte b7;
                    int n16;
                    int n17;
                    if (b4) {
                        a = i.a[2];
                        graphics = this.a;
                        n14 = 1;
                        n15 = n4;
                        b7 = (byte)n9;
                        n16 = n13;
                        n17 = 1;
                    }
                    else {
                        if (!b6) {
                            continue;
                        }
                        a = i.a[2];
                        graphics = this.a;
                        n14 = 1;
                        n15 = n4;
                        b7 = (byte)n11;
                        n16 = n13;
                        n17 = 0;
                    }
                    a.a(graphics, n14, n15, b7, n16, n17, 0, 0);
                }
            }
        }
    }
    
    private void Z() {
        final int n;
        if (((n = i.b[this.bG][this.bH]) & 0x8) == 0x0) {
            i.b = i.a[32];
            final int n2 = n & 0x7;
            final boolean b;
            i i;
            int bl;
            if (((b = ((n & 0x10) == 0x0)) && n2 == 2) || (!b && n2 == 4)) {
                i = this;
                bl = 2;
            }
            else {
                i = this;
                bl = (b ? 1 : 0);
            }
            i.bL = bl;
            final byte b2 = i.b[this.bG][this.bH];
            this.bN = b2 * i.g[n2];
            this.bO = b2 * i.g[n2 + 8];
        }
    }
    
    private void aa() {
        if ((i.b[this.bG][this.bH] & 0x7) == 0x1 && (i.a[this.bG][this.bH] & 0xFF) == 0x23) {
            this.bN = 0;
            this.bO = i.b[this.bG][this.bH];
        }
    }
    
    private void ab() {
        i.b = i.a[30];
        this.bK = 1;
        this.bL = a(i.b, 1, i.aN % a(i.b, 1));
    }
    
    private void ac() {
        final int n = i.b[this.bG][this.bH] & 0x7;
        i.b = i.a[29];
        i j = null;
        int bo = 0;
        Label_0261: {
            if ((i.b[this.bG][this.bH] & 0x8) == 0x0) {
                while (true) {
                    i i = null;
                    int bl = 0;
                    switch (n) {
                        case 1: {
                            i = this;
                            bl = 2;
                            break;
                        }
                        case 2: {
                            i = this;
                            bl = 1;
                            break;
                        }
                        case 4: {
                            i = this;
                            bl = 0;
                            break;
                        }
                        default: {
                            this.bN = i.b[this.bG][this.bH] * i.g[n];
                            j = this;
                            bo = i.b[this.bG][this.bH] * i.g[8 + n];
                            break Label_0261;
                        }
                    }
                    i.bL = bl;
                    continue;
                }
            }
            while (true) {
                i k = null;
                int bk = 0;
                switch (n) {
                    case 1: {
                        k = this;
                        bk = 14;
                        break;
                    }
                    case 2: {
                        k = this;
                        bk = 13;
                        break;
                    }
                    case 4: {
                        k = this;
                        bk = 12;
                        break;
                    }
                    default: {
                        this.bL = a(i.b, this.bK, i.b[this.bG][this.bH]);
                        final int n2 = (i.b.b[this.bK] + this.bL) * 5;
                        this.bN = i.b.f[n2 + 2];
                        j = this;
                        bo = i.b.f[n2 + 3];
                        break Label_0261;
                    }
                }
                k.bK = bk;
                continue;
            }
        }
        j.bO = bo;
    }
    
    private void ad() {
        i.b = i.a[29];
        this.bK = (i.b[this.bG][this.bH] & 0x1F);
        i i;
        byte bo;
        if (this.bK == 8 || this.bK == 9) {
            this.bL = 0;
            this.bN = i.b.f[(i.b.b[this.bK] + 0) * 5 + 2];
            i = this;
            bo = (byte)(-i.b[this.bG][this.bH]);
        }
        else {
            final int a = a(i.b, this.bK, (i.b[this.bG][this.bH] & 0x1FE0) >> 5);
            this.bL = a;
            final int n = (i.b.b[this.bK] + a) * 5;
            this.bN = i.b.f[n + 2];
            i = this;
            bo = i.b.f[n + 3];
        }
        i.bO = bo;
    }
    
    private void ae() {
        this.bK = (i.b[this.bG][this.bH] & 0x38) >> 3;
        i.b = i.a[27];
        i i = null;
        int bl = 0;
        switch (this.bK) {
            case 3: {
                this.bL = 0;
                this.bO = -i.b[this.bG][this.bH];
                return;
            }
            case 1: {
                i = this;
                bl = (i.b[this.bG][this.bH] >> 1) % i.a[27].a(1);
                break;
            }
            default: {
                i = this;
                bl = i.b[this.bG][this.bH];
                break;
            }
        }
        i.bL = bl;
    }
    
    private void af() {
        this.a(this.bx, this.by, false);
    }
    
    private void a(final int n, final int n2, final boolean b) {
        final Image[] array = i.a[18];
        int n3 = 0;
        if (b) {
            n3 = -5;
        }
        this.a.drawImage(array[1], n + 6, n2 + n3, 0);
        this.a.drawImage(array[0], n + 3, n2 + 7, 0);
        if (!b) {
            int n4 = 0;
            if (this.P < 10) {
                n4 = i.a[0].a[0][0].getWidth() >> 1;
                ++n4;
            }
            a(this.a, n + 19 - n4, n2 + 13, this.P, i.a[0].a[0], 0);
        }
    }
    
    private void d(final int n, final int n2) {
        final Graphics a = this.a;
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                final int n3 = j + this.ar / 24;
                final int n4 = i + this.as / 24;
                if (n3 >= 0 && n3 < this.av && n4 >= 0) {
                    if (n4 < this.aw) {
                        final int n5 = i.e[n3][n4];
                        final int n6 = j * 24 - n;
                        final int n7 = i * 24 - n2;
                        if (n5 > 0) {
                            int n8;
                            byte b = (byte)(n8 = 0);
                            while (true) {
                                byte b2 = (byte)n8;
                                if (b > 2) {
                                    break;
                                }
                                Label_0448: {
                                    if (a(n5, b2, (byte)0, (byte)3) != 0) {
                                        int n9;
                                        if ((n9 = (byte)(a(n5, b2, (byte)7, (byte)2) << 3)) > 0) {
                                            byte b3 = 0;
                                            if (a(a(n5, b2, (byte)0, (byte)3), (byte)45, (byte)2) <= 1) {
                                                b3 = (byte)(n9 - 24);
                                            }
                                            else {
                                                final byte b4 = (byte)(24 - n9);
                                            }
                                            n9 = b3;
                                            this.W();
                                            a.clipRect(n6, n7 + (b2 << 3), 24, 8);
                                        }
                                        final int a2;
                                        final int n11;
                                        final int n10 = (((n11 = (a2 = this.a(n3, n4, n5, b2)) >> 1) == 7) ? (i.aN >> 3) : i.aN) & 0x1;
                                        if (n11 == 15) {
                                            i.d.a(a, a2 + this.cB, n6 + n9 - 8, n7 + (b2 << 3) + 8, 36, 0, 0);
                                            ++this.cB;
                                            if (this.cB > 2) {
                                                this.cB = 0;
                                            }
                                        }
                                        else {
                                            a a3;
                                            Graphics graphics;
                                            int n12;
                                            int n13;
                                            int n14;
                                            if (n11 == 14 || n11 == 11) {
                                                a3 = i.d;
                                                graphics = a;
                                                n12 = a2 + n10;
                                                n13 = n6 + n9;
                                                n14 = n7;
                                            }
                                            else {
                                                if (n11 == 8 && b2 == 0 && i.e[n3][n4 - 1] > 0) {
                                                    i.d.a(a, 33, n6 + n9, n7, 20, 0, 0);
                                                    b2 = 3;
                                                    break Label_0448;
                                                }
                                                a3 = i.d;
                                                graphics = a;
                                                n12 = a2 + n10;
                                                n13 = n6 + n9;
                                                n14 = n7 + (b2 << 3);
                                            }
                                            a3.a(graphics, n12, n13, n14, 20, 0, 0);
                                            this.W();
                                        }
                                    }
                                }
                                b = (byte)(n8 = (byte)(b2 + 1));
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void ag() {
        this.aE = 20;
        i i;
        int af;
        if (i.a[this.bG][this.bH] >> 8 >= this.ax) {
            i = this;
            af = 0 + (i.aN >> 1) % 7;
        }
        else {
            i = this;
            af = 7;
        }
        i.aF = af;
    }
    
    private void l(final int n) {
        int n2;
        if ((n2 = i.a[this.bG][this.bH] >> 8) == 255) {
            n2 = 0;
        }
        final int n3 = (14 == n) ? 8 : 22;
        if (i.a[n3] != null) {
            i.a[n3].a(this.a, 0, n2, this.bx, this.by, 0, 0, 0);
        }
    }
    
    private void ah() {
        boolean b = false;
        final Graphics a = this.a;
        final a a2;
        if ((a2 = i.a[0]) == null) {
            return;
        }
        a.translate(120, 320);
        a a3;
        if (this.m || i.l == 2) {
            a2.a(a, 0, 0, 0, 0, 0, 0);
            if (this.T) {
                a2.a(a, 19, 0, 0, 0, 0, 0);
            }
            a3 = a2;
        }
        else {
            b = true;
            a.setClip(-120, -320, 240, 320);
            a3 = a2;
        }
        a3.a(a, 1, 0, 0, 0, 0, 0);
        if (this.n) {
            a2.a(a, 2, 0, 0, 0, 0, 0);
            a2.a(a, 3 + this.ac, 0, 0, 0, 0, 0);
        }
        if (b) {
            a.setClip(-120, -320, 240, 320);
        }
        if (this.P > 0) {
            this.h = System.currentTimeMillis();
        }
        else if (System.currentTimeMillis() - this.h < 1500L) {
            a(a, i.a[41], i.a[34], 0, -55, 33, 5, true);
        }
        if (this.n != this.cP || this.m || this.n <= 1) {
            final Image[] array = i.a[0].a[0];
            final int n = (this.n <= 1) ? 1 : 0;
            final int n2 = -11 - (i.i[8] - 4) * array[11 + n].getWidth() / 2;
            a.drawImage(array[11 + n], n2, -29, 0);
            int n3 = 0 + array[11 + n].getWidth();
            final int width = array[15].getWidth();
            for (byte b2 = 0; b2 < i.i[8]; ++b2) {
                Graphics graphics;
                Image[] array2;
                int n4;
                if ((this.n <= 1 && b2 == 0 && (i.aN >> 2 & 0x1) == 0x0) || (b2 < this.n && this.n > 1)) {
                    graphics = a;
                    array2 = array;
                    n4 = 15;
                }
                else {
                    graphics = a;
                    array2 = array;
                    n4 = 13;
                }
                graphics.drawImage(array2[n4 + n], n2 + n3, -29, 0);
                n3 += width;
            }
            a.drawImage(array[17 + n], n2 + n3, -29, 0);
            this.cP = this.n;
        }
        if (this.cQ != this.aZ || this.cT != this.P || this.m) {
            if (this.P > 0) {
                a(a, 70, -12, "" + this.aZ + "/" + (this.P + this.aZ), i.a[0].a[0], 0);
            }
            else {
                a(a, 70, -12, this.aZ, i.a[0].a[0], 0);
            }
        }
        if (this.cR != this.bb || this.m) {
            this.cR = this.bb;
            a(a, 107, -12, this.bb, i.a[0].a[0], 0);
        }
        if (this.cS != this.ao || this.m) {
            this.cS = this.ao;
            a(a, -25, -12, this.ao, i.a[0].a[0], 0);
        }
        a.translate(-120, -320);
        a.translate(120, 0);
        if (this.m || i.l == 2) {
            a2.a(a, 20, 0, 0, 0, 0, 0);
        }
        if (this.cQ != this.aZ || this.cT != this.P || this.m) {
            this.a(-53, 8, this.P <= 0);
        }
        if (this.cU != this.aU || this.cV != this.aV || this.m || i.l == 2) {
            a2.a(a, 21, 0, 0, 0, 0, 0);
            a(a, 55, 15, this.aU, i.a[0].a[0], 0);
            a(a, 87, 15, this.aV, i.a[0].a[0], 0);
            this.cU = this.aU;
            this.cV = this.aV;
        }
        a.translate(-120, 0);
        this.cQ = this.aZ;
        this.cT = this.P;
        this.m = false;
    }
    
    private void ai() {
        i.b = i.a[6];
        this.bK = 0;
        i i;
        int bl;
        if (this.ce == 0) {
            i = this;
            bl = 0;
        }
        else if (this.ce == 9) {
            i = this;
            bl = 2;
        }
        else {
            i = this;
            bl = ((this.cf < 0) ? 1 : 3);
        }
        i.bL = bl;
    }
    
    private void aj() {
        final int n = (i.b[this.bG][this.bH] == 1) ? 1 : 0;
        final a a = i.a[5];
        a.a(this.a, n, (i.aN >> 1) % a.a(n), this.bx, this.by, 0, 0, 0);
    }
    
    private void b(final byte b) {
        final g g = i.a[4];
        if (b == 23) {
            g.a = this.bx;
            final g g2 = g;
            g2.e |= 0x1;
        }
        else {
            g.e &= 0xFFFFFFFE;
            g.a = this.bx + 24;
        }
        g.b = this.by;
        g.a();
        g.a(this.a);
    }
    
    private void m(final int n) {
        switch (n) {
            case 0: {
                cL();
                System.gc();
            }
            case 1: {}
            case 2: {
                i.a[41].e = 15;
            }
            case 3: {}
            case 4: {}
            case 5: {}
            case 6: {
                if (i.a == null) {
                    i.a = a("/spl.f", 0);
                }
                if (i.b == null) {
                    i.b = a("/spl.f", 1);
                }
                if (i.c == null) {
                    i.c = a("/spl.f", 2);
                    return;
                }
                break;
            }
            case 7: {
                if (i.a[18] == null) {
                    i.a[18] = a("/ui.f", 3);
                    break;
                }
                break;
            }
        }
    }
    
    private static void ak() {
        i.a = null;
        i.b = null;
        i.c = null;
        i.g = null;
        i.f = null;
        i.c = null;
        System.gc();
    }
    
    private void al() {
        this.cX = i.a[this.bo].length >> 1;
        this.cY = 0;
        for (int i = 0; i < this.cX; ++i) {
            final int a = a(i.a[41], i.a[i.a[this.bo][i * 2 + 1]], 0);
            if (this.bo != 0 || i != 3) {
                if (a > this.cY) {
                    this.cY = a;
                }
            }
        }
        this.db = 0;
        this.cW = 0;
    }
    
    private void e(final int n, final int n2) {
        if (i.l == 4) {
            this.b(this.a, false);
            for (int i = n - 1; i < n2 - 2; ++i) {
                i.a[18].a(this.a, 4, i % 2, i, 0, 0, 0);
            }
        }
        if (i.l == 2) {
            this.a.setColor(0);
            this.a.fillRect(0, n - 1, 240, n2 - 2 - (n - 1));
        }
        this.a.setColor(16777215);
        this.a.drawLine(0, n - 1 - 1, 240, n - 1 - 1);
        this.a.drawLine(0, n2 - 1, 240, n2 - 1);
        this.a.setColor(0);
        this.a.drawLine(0, n - 1 - 2, 240, n - 1 - 2);
        this.a.drawLine(0, n2 - 2, 240, n2 - 2);
    }
    
    private void am() {
        this.X = false;
        this.W = a();
    }
    
    private void an() {
        if (this.X) {
            this.am();
        }
        int n = 320 - (this.cX * 15 + 1 + 2) + ((!this.W && this.bo == 0) ? 15 : 0);
        int n2 = 320;
        this.a.setClip(0, 0, 240, 320);
        if (i.l == 2 && i.U && i.V) {
            this.T = false;
            this.X();
            this.T = true;
            i.V = false;
        }
        if (i.l == 7 || i.l == 2) {
            final int n3 = n - (160 - (320 - n) / 2);
            n -= n3;
            n2 = 320 - n3;
        }
        if (this.bo == 7) {
            i.a[41].a(this.a, i.a[(this.aM == 5) ? 102 : 113], 120, n - 20, 17);
        }
        if (i.l == 7) {
            Graphics graphics;
            int n5;
            int n6;
            int n7;
            int n8;
            if (this.de != -1 && !i.U) {
                final int n4 = n + this.de * 15;
                this.a.setColor(0);
                graphics = this.a;
                n5 = 0;
                n6 = n4;
                n7 = 240;
                n8 = 16;
            }
            else {
                this.a.setColor(0);
                graphics = this.a;
                n5 = 0;
                n6 = 0;
                n7 = 240;
                n8 = 320;
            }
            graphics.fillRect(n5, n6, n7, n8);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.dd >= 0 && currentTimeMillis - this.i > 100L) {
            ++this.dd;
            this.i = currentTimeMillis;
        }
        if (this.de != -1 && !i.U) {
            this.a.setClip(0, n + this.de * 15 - ((this.bo == 0 && this.de > 1 && !this.W) ? 15 : 0), 240, 16);
        }
        if (this.de != this.bq || i.U) {
            this.e(n, n2);
        }
        for (int i = 0; i < this.cX; ++i) {
            if (this.de == -1 || i == this.de || i == this.bq || i.U) {
                if (this.bo != 0 || i != 1 || this.W) {
                    int n10;
                    int n9 = (n10 = n + i * 15) + 7;
                    if (this.bo == 0 && i > 1 && !this.W) {
                        n10 -= 15;
                        n9 -= 15;
                    }
                    int b = 0;
                    if (i == 2 && this.bo == 0) {
                        b = 1;
                    }
                    Label_0644: {
                        Graphics graphics2 = null;
                        int n11 = 0;
                        int n12 = 0;
                        int n13 = 0;
                        int n14 = 0;
                        Label_0641: {
                            Graphics graphics3;
                            int color;
                            if (this.i == 2 && i == 4 && this.bo == 1) {
                                b = 0;
                                if (i != this.bq) {
                                    this.a.setColor(13421772);
                                    graphics2 = this.a;
                                    n11 = 0;
                                    n12 = n9 - 7 + 1;
                                    n13 = 240;
                                    n14 = 14;
                                    break Label_0641;
                                }
                                graphics3 = this.a;
                                color = 6710886;
                            }
                            else {
                                if (i != this.bq) {
                                    break Label_0644;
                                }
                                graphics3 = this.a;
                                color = 13540096;
                            }
                            graphics3.setColor(color);
                            graphics2 = this.a;
                            n11 = 0;
                            n12 = n9 - 7;
                            n13 = 240;
                            n14 = 16;
                        }
                        graphics2.fillRect(n11, n12, n13, n14);
                    }
                    int n15 = 0;
                    boolean b2 = false;
                    i.a[41].a(i.a[i.a[this.bo][i * 2 + 1]]);
                    final int c;
                    int n16 = c = a.c;
                    final int n17 = (i == 2 && this.bo == 0) ? 152 : 210;
                    if (n16 > n17) {
                        b2 = true;
                        n16 = n17;
                    }
                    final int n18 = 120 - n16 / 2;
                    if (b2) {
                        n15 = ((i == this.bq) ? this.da : 0);
                        this.a.setClip(n18, n10, n16, 15);
                    }
                    i.a[41].b = b;
                    i.a[41].a(this.a, i.a[i.a[this.bo][i * 2 + 1]], 120 - n16 / 2 - n15, n9 + 1, 6);
                    if (b2) {
                        this.a.setClip(0, 0, 240, 320);
                    }
                    if (i == this.bq) {
                        this.a.setColor(16777215);
                        i.a[18].a(this.a, 2, 120 - n16 / 2 - 8, n9, 0, 0, 10);
                        i.a[18].a(this.a, 2, 120 + n16 / 2 + 8, n9, 0, 0, 6);
                    }
                    if (i == this.bq && b2 && this.cW % 2 == 0) {
                        this.da += this.cZ;
                        if (this.da < -5 || this.da + n17 - 5 > c) {
                            this.cZ = -this.cZ;
                            this.da += this.cZ;
                        }
                    }
                }
            }
        }
        this.de = this.bq;
        ++this.cW;
        i j;
        int dc;
        if (this.dc < 0) {
            j = this;
            dc = 3;
        }
        else {
            j = this;
            dc = this.dc - 1;
        }
        j.dc = dc;
        if (this.dc == 0 && this.db + 1 < this.cX) {
            ++this.db;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.bo == 0 && this.al) {
            if (this.cW % 20 >= 10) {
                i.a[18].a(this.a, 1, 1, n + 30 + 7 - (this.W ? 0 : 15), 0, 0, 6);
            }
            else if (this.bq != 2) {
                if (i.f == null) {
                    final int n19 = n + 30 + 1 - (this.W ? 0 : 15);
                    i.f = Image.createImage(28, 14);
                    final Graphics graphics4;
                    (graphics4 = i.f.getGraphics()).translate(-1, -n19);
                    this.b(graphics4, false);
                    graphics4.translate(1, n19);
                    for (int k = 0; k < 14; ++k) {
                        i.a[18].a(graphics4, 4, (n19 + k + 1) % 2, k, 0, 0, 0);
                    }
                }
                this.a.drawImage(i.f, 1, n + 30 + 1 - (this.W ? 0 : 15), 0);
            }
        }
        if (this.bo != 0 && this.bo != 3 && this.bo != 1 && this.bo != 7) {
            this.a();
        }
        this.b();
        i.U = false;
        if (this.dd == 2) {
            if (i.l == 2) {
                i.U = true;
                i.V = true;
            }
            this.dd = -1;
            this.m = true;
            this.de = -1;
            this.p();
        }
    }
    
    public final void a() {
        i.a[18].a(this.a, 0, 223, 308, 0, 0, 0);
    }
    
    public final void b() {
        i.a[18].a(this.a, 3, 2, 308, 0, 0, 0);
    }
    
    private void ao() {
        final Graphics a;
        (a = this.a).setColor(0);
        a.fillRect(0, 0, 240, 320);
        int n;
        if ((n = (this.bs + 1) * 230 / this.br) > 230) {
            n = 230;
        }
        a.setColor(13540096);
        this.a.fillRect(5, 310, n, 6);
        a.setColor(16554500);
        this.a.drawRoundRect(4, 309, 231, 6, 2, 2);
        i.a[41].b = 0;
        i.a[41].a(this.a, i.a[37], 120, 293, 1);
    }
    
    private void ap() {
        switch (this.i) {
            case 2: {
                this.ax();
                this.aq();
            }
            case 1: {
                this.av();
            }
            case 3: {
                this.as();
            }
            case 4: {
                this.au();
            }
            case 5: {
                this.ar();
                break;
            }
        }
    }
    
    private void aq() {
        if (this.ar + 240 > 1440 && this.as + 320 > 48) {
            if (i.a[10] == null) {
                i.a[10] = a("/mmv.f", 0);
            }
            final a a = i.a[10];
            if (this.d(60, 3) || this.d(61, 3)) {
                a.a(this.a, 1, 1440 - this.ar, 48 - this.as, 0, 0, 0);
            }
        }
        if (this.aP > 55 && this.c) {
            i.a[0].a(this.a);
        }
    }
    
    private void d(final Graphics graphics) {
        if (i.a[10] == null) {
            i.a[10] = a("/mmv.f", 0);
        }
        if (this.bG >= 60 && this.bG < 65 && this.bH >= 2 && this.bH < 7) {
            i.a[10].a(graphics, 4 + (this.bH - 2) * 5 + this.bG - 60, this.bx, this.by, 0, 0, 0);
        }
    }
    
    private void ar() {
        if (this.ad != -1) {
            final g g;
            (g = i.a[5]).a = this.ai - this.ar;
            g.b = 504 - this.as;
            g.a();
            g.a(this.a);
            if (this.ad == 12) {
                final int n = this.ai - this.ar + i.aN * this.ae % 48;
                final int n2 = i.a[5].b + 24;
                i.a[7].a(this.a, 0, i.aN % i.a[7].a(1), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }
    
    private void as() {
        if (this.i == 3 && i.aN >= this.m + 80L) {
            for (int i = 14; i <= 21; ++i) {
                i.b[i][15] = 0;
                i.a[i][15] = -1;
                i.a[i][15] = 44;
                i.b[i][15] = 0;
                i.c[i][15] = 24;
            }
            this.m = 0L;
        }
        if (this.ad != 15) {
            if (this.ar + 240 + 48 >= this.ah && this.as + 320 + 48 >= 504) {
                final g g;
                (g = i.a[5]).a = this.ah - this.ar;
                g.b = 504 - this.as;
                g.a();
                g.a(this.a);
            }
            if (this.ad == 12) {
                final int n = this.ah - this.ar + i.aN * this.ae % 48;
                final int n2 = i.a[5].b + 24;
                i.a[7].a(this.a, 0, i.aN % i.a[7].a(0), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }
    
    private void at() {
        final Graphics a = this.a;
        final g g = i.a[5];
        if (this.ad == 7) {
            final int n = g.a + i.aN * this.ae % 48;
            int b = g.b;
            if (this.H == 10) {
                b -= 144;
            }
            i.a[7].a(a, 1, i.aN % i.a[7].a(1), n, b, 0, 0, 0);
            this.k(n, b);
            return;
        }
        if (this.ad != 8 && this.ad != 0) {
            this.a(a, 3);
        }
    }
    
    private void a(final Graphics graphics, final int n) {
        final int n2 = n * 14 + 2;
        final int n3 = 240 - n2 >> 1;
        if (this.af > 0) {
            graphics.setColor(0);
            graphics.fillRect(n3, 5, n2, 12);
            graphics.setColor(3913615);
            for (int i = 0; i < this.af; ++i) {
                graphics.fillRect(n3 + 2 + i * 14, 7, 12, 8);
            }
        }
    }
    
    private void au() {
        final Graphics a = this.a;
        final g g = i.a[5];
        final g g2 = i.a[4];
        int n2 = 0;
        Label_0177: {
            int n = 0;
            switch (this.ad) {
                case 1: {
                    n = this.ae * 1;
                    break;
                }
                case 2:
                case 7: {
                    n = 40;
                    break;
                }
                case 3: {
                    n = 40;
                    break;
                }
                case 4: {
                    n = 40 - (this.ae * 2 << 1);
                    break;
                }
                case 5: {
                    n2 = 15 + this.ae * 18;
                    this.Y = false;
                    break Label_0177;
                }
                case 9: {
                    n = 15 + this.ae * 18;
                    break;
                }
                case 10: {
                    n = 15 + this.ae * 18;
                    break;
                }
                case 11: {
                    n = 15 + this.ae * 18;
                    break;
                }
                default: {
                    n = -1000;
                    break;
                }
            }
            n2 = n;
        }
        g.a = (10 + this.ag * (2 + ((this.ag > 0) ? 1 : 0))) * 24 - this.ar;
        Label_0274: {
            g g3;
            int b2;
            if (this.ad == 5) {
                final int b = g.b;
                g.b = 256 - this.as - this.I - 15;
                if (this.h() != 3) {
                    break Label_0274;
                }
                g3 = g;
                b2 = b;
            }
            else {
                g3 = g;
                b2 = 256 - n2 - this.as;
            }
            g3.b = b2;
        }
        g.a(a);
        if (this.i) {
            g2.b = 96 - this.as;
            g2.a = (this.g() + 1) * 24 - this.ar;
            g2.a(a);
        }
        for (int i = 0; i < 3; ++i) {
            final int n3;
            if ((n3 = (i * (2 + ((i > 0) ? 1 : 0)) + 10) * 24 - this.ar) < 240 && n3 > -48 && this.as > -80) {
                i.a[40].a(a, 1, n3, 216 - this.as, 0, 0, 0);
            }
        }
    }
    
    private void av() {
        final int an = i.aN;
        final g g = i.a[2];
        if (this.as + this.bk < 1008 && this.as + this.bk > 592) {
            g.a = 240 - this.ar;
            g.b = 1008 - this.as;
            g.a();
            g.a(this.a);
            g.a = 336 - this.ar;
            g.b = 1008 - this.as;
            g.a();
            g.e = 1;
            g.a(this.a);
        }
        if (this.bj > 10) {
            this.aw();
        }
        final int b = this.aw * 24 - this.aa - this.as;
        final int n;
        int i = n = 168 - this.ar;
        final int n2 = i + 240;
        while (i <= -24) {
            i += 24;
        }
        final g g2 = i.a[1];
        if ((this.aa >= 816 || g2.f == 2) && this.aa > 816) {
            for (int j = b + 20; j < 320; j += 24) {
                for (int k = i; k < n2; k += 24) {
                    g2.a.a(this.a, 1, ((an >> 1) + k + j) % 2, k, j, 0, 0, 0);
                }
            }
        }
        if (g.f == 2) {
            g2.e = 0;
            g2.a = n + 120;
            g2.b = b;
            g2.a();
            g2.a(this.a);
            g2.e = 1;
            g2.a(this.a);
            this.ay();
        }
    }
    
    private void aw() {
        for (int i = 3; i < 13; i += 2) {
            final int n;
            this.a.drawImage(i.a[27][i & 0x1], ((n = 10 * (2 * i / 5 + 1)) + i.aN / n) * i % 240, 320 / n * i.aN % 320, 0);
        }
    }
    
    private void ax() {
        if (this.r && this.a == null && this.bm == -1) {
            i.a[15].a(this.a, 0, i.aN >> 1 & 0x3, this.bv, this.bw - 24, 0, 0, 0);
        }
    }
    
    private void ay() {
        final Graphics a = this.a;
        final int n = (i.aN << 3) % 160;
        a.setColor(255, ((i.aN / 160 & 0x1) == 0x0) ? (160 - n) : (0 + n), 0);
        a.drawRect(0, 0, 239, 319);
    }
    
    private void az() {
        if (this.C) {
            return;
        }
        final int ap = this.aP;
        final int aq = this.aQ;
        final int an = i.aN;
        final int n = this.aS & 0x7;
        final g g = i.a[((this.aS & 0x4000) == 0x0) ? 0 : 3];
        final boolean b = this.b();
        final int n2 = ((this.aS & 0x800) == 0x0) ? this.bQ : (this.aS & 0x7);
        if (!this.c) {
            return;
        }
        this.bv = ap * 24 + i.g[n2] * this.aR - this.ar;
        this.bw = aq * 24 + i.g[n2 + 8] * this.aR - this.as;
        if ((this.b <= 0L || (an >> 1 & 0x1) == 0x0) && this.aT <= 0) {
            g.a = this.bv;
            g.b = this.bw;
            if (i.e != null && b && n != 1 && n != 3 && i.e[ap][aq + 1] != 0 && j(ap, aq + 1)) {
                final int n4;
                int n3 = (n4 = (an >> 1) + ap) % 4;
                if ((n4 / 4 & 0x1) == 0x1) {
                    n3 = 4 - n3;
                }
                final g g2 = g;
                g2.b += n3;
            }
            g.a();
            g.a(this.a);
            final int f;
            i.D = ((f = g.f) == 47 && g.g == 0);
            switch (f) {
                case 40:
                case 47:
                case 48: {
                    if (g.g <= ((f == 40) ? 13 : 6)) {
                        if (f != 47) {
                            break;
                        }
                    }
                    try {
                        int n5 = 0;
                        if (this.aA == 30 || this.aA == 31 || this.aA == 32) {
                            n5 = -2;
                        }
                        if (i.a[this.aA] == null) {
                            i.a[a(this.aA)].a(this.a, this.aB, g.a + n5, g.b - 24, 0, 0, 0);
                        }
                        else {
                            this.a.drawImage(i.a[this.aA][this.aB], g.a + n5, g.b - 24, 0);
                        }
                    }
                    catch (Exception ex) {}
                    if (this.aC > 0) {
                        a(this.a, g.a + 24, g.b - 10, this.aC, i.a[0].a[0], 0);
                        break;
                    }
                    break;
                }
                case 17:
                case 18: {
                    if (g.g == 0) {
                        this.a.drawImage(i.a[this.aA][this.aB], g.a, g.b - 12, 0);
                        break;
                    }
                    break;
                }
            }
        }
        if (b && i.a[ap][aq] == 0) {
            final int n6 = i.b[ap][aq] & 0x7;
            final byte b2 = i.b[ap][aq];
            try {
                i.a[a(1)].a(this.a, 0 + (i.b[ap][aq] & 0x38), ap * 24 - this.ar + i.g[n6] * b2, aq * 24 - this.as + i.g[n6 + 8] * b2, 0, 0, 0);
            }
            catch (Exception ex2) {}
        }
    }
    
    private void aA() {
        final int bg = this.bG;
        final int bh;
        final int n = (bh = this.bH) + 1;
        this.bz = 0;
        this.bA = 0;
        this.y = false;
        int n3;
        final int n2 = (n3 = i.b[bg][bh]) & 0x7;
        final byte b = i.b[bg][bh];
        if (n3 == -1) {
            n3 = -1;
        }
        this.bN += b * i.g[n2];
        this.bO += b * i.g[n2 + 8];
        final boolean b2 = i.e != null && i.e[bg][bh] != 0;
        switch (this.bI) {
            case 47: {
                i.b = i.a[30];
                this.bK = 0;
                this.bL = a(i.b, 0, i.aN % a(i.b, 0));
                break;
            }
            case 8: {
                this.aG = 16;
                this.aH = 0 + (i.aN >> 1 & 0x1);
                break;
            }
            case 5: {
                this.aG = 25;
                this.aH = 0 + this.bR;
                break;
            }
            case 6: {
                this.aG = 5;
                this.aH = 0;
                break;
            }
            case 7: {
                this.aG = 5;
                this.aH = 1;
                break;
            }
            case 9: {
                i.b = i.a[(n3 & 0xFC00000) >> 22];
                this.bL = 0;
                break;
            }
            case 4: {
                this.aG = 24;
                this.aH = 0 + this.bR;
                break;
            }
            case 0: {
                final int n4 = (n3 & 0x38) >> 3;
                int bn = (n3 & 0x7000) >> 12;
                final boolean b3 = (n3 & 0x10000) == 0x0;
                if (!b2 && n2 == 0 && j(bg, n)) {
                    final int n5 = (n3 & 0xFFFF8FFF) | bn << 12;
                    if (b3) {
                        n3 = (n5 & 0xFFFEFFFF);
                    }
                    else {
                        n3 = (n5 | 0x10000);
                        bn = -bn;
                    }
                    this.bN = bn;
                }
                else {
                    n3 &= 0xFFFF8FFF;
                }
                i.b[bg][bh] = n3;
                this.aG = 1;
                this.aH = 0 + n4;
                break;
            }
            case 1: {
                this.aG = 2;
                this.aH = 0 + this.bR;
                break;
            }
            case 2: {
                this.aD();
                break;
            }
        }
        if (b2 || (i.e != null && i.e[bg][n] != 0 && j(bg, n))) {
            final int n7;
            int n6 = (n7 = (i.aN >> 1) + bg) % 4;
            if ((n7 / 4 & 0x1) == 0x1) {
                n6 = 4 - n6;
            }
            this.bO += n6;
        }
        if (((n3 & 0x200) != 0x0 || (i.a[bg - i.g[n2]][n] < 0 && j(bg, n) && (i.b[bg][n] & 0x7) == 0x0 && bg != this.bg && bh != this.bh)) && (this.aS & 0x8) == 0x0) {
            this.bO += b * b / 24;
            if (this.bI != 9) {
                this.bN += -1 + i.aN % 3;
            }
        }
        if ((n3 & 0x200) != 0x0) {
            this.bN = -this.bN;
        }
        if (this.bI == 0) {
            this.bD = ((n3 & 0x1C0) >> 6) - 1;
            if (this.bD >= 0 && this.bD < 5) {
                this.y = true;
                i i = null;
                int bz = 0;
                switch (n3 & 0x7) {
                    case 4: {
                        i = this;
                        bz = 24;
                        break;
                    }
                    case 2: {
                        i = this;
                        bz = -24;
                        break;
                    }
                    default: {
                        i = this;
                        bz = 0;
                        break;
                    }
                }
                i.bz = bz;
                this.bA = 13;
                this.bB = this.bG;
                this.bC = this.bH - 1;
            }
        }
        this.aa();
    }
    
    private void aB() {
        final int bg = this.bG;
        final int bh = this.bH;
        final int n = i.b[bg][bh];
        final byte b = i.b[bg][bh];
        final int n2 = n & 0x7;
        this.bN = b * i.g[n2];
        this.bO = b * i.g[n2 + 8];
        i.b = i.a[38];
        final int n3;
        i i;
        int bl;
        if ((((n3 = (n & 0x7000) >> 12) == 2 || n3 == 4 || n2 == 2 || n2 == 4) && i.a[bg - 1][bh] >= 0 && i.a[bg + 1][bh] >= 0) || ((n3 == 1 || n3 == 3 || n2 == 1 || n2 == 3) && i.a[bg][bh - 1] >= 0 && i.a[bg][bh + 1] >= 0)) {
            this.bK = 1;
            i = this;
            bl = 0;
        }
        else {
            i j;
            int bk;
            if (n2 == 1 || n2 == 3) {
                j = this;
                bk = n2 - 1;
            }
            else {
                j = this;
                bk = 0;
            }
            j.bK = bk;
            i = this;
            bl = (i.aN >> 1) % i.b.a(this.bK);
        }
        i.bL = bl;
        this.aa();
    }
    
    private void c(final byte b) {
        final int n = i.b[this.bG][this.bH];
        final byte b2 = i.b[this.bG][this.bH];
        final int n2 = n & 0x7;
        this.bN = b2 * i.g[n2];
        this.bO = b2 * i.g[n2 + 8];
        i.b = i.a[(b == 19) ? 4 : 21];
        i j = null;
        int an = 0;
        a a = null;
        int bk3 = 0;
        Label_0196: {
            if (this.ap == 1) {
                i i;
                int bk;
                if ((n & 0xF8) >> 3 > 0) {
                    i = this;
                    bk = 2;
                }
                else {
                    i = this;
                    bk = 0;
                }
                i.bK = bk;
                j = this;
                an = i.aN;
                a = i.b;
            }
            else {
                Label_0172: {
                    i k;
                    int bk2;
                    if ((n & 0xF8) >> 3 > 0) {
                        k = this;
                        bk2 = 4;
                    }
                    else {
                        this.bK = n2 - 1;
                        if (this.bK >= 0) {
                            break Label_0172;
                        }
                        k = this;
                        bk2 = ((n & 0x7000) >> 12) - 1;
                    }
                    k.bK = bk2;
                }
                j = this;
                an = i.aN >> 1;
                a = i.b;
                if (this.bK < 0) {
                    bk3 = 0;
                    break Label_0196;
                }
            }
            bk3 = this.bK;
        }
        j.bL = an % a.a(bk3);
        this.aa();
    }
    
    private void aC() {
        final int bg = this.bG;
        final int bh = this.bH;
        this.aE = 26;
        this.aF = 0;
        Label_0173: {
            i i;
            int bo;
            if (j(bg, bh) && i.b[bg][bh] <= 12) {
                i = this;
                bo = -(i.b[bg][bh] - 12);
            }
            else if (this.d(bg, bh)) {
                if ((this.aS & 0x1000) == 0x0) {
                    if (this.aR > 12) {
                        break Label_0173;
                    }
                    i = this;
                    bo = -(this.aR - 12);
                }
                else {
                    i = this;
                    bo = 12;
                }
            }
            else {
                if (this.d(bg - 1, bh)) {
                    if (this.bQ != 4 || this.aR <= 12) {
                        break Label_0173;
                    }
                }
                else if (!this.d(bg + 1, bh) || this.bQ != 2 || this.aR <= 12) {
                    break Label_0173;
                }
                i = this;
                bo = this.aR - 12;
            }
            i.bO = bo;
        }
        this.bO += 24;
        this.bP = 36;
    }
    
    private void aD() {
        final int n = i.a[this.bG][this.bH] & 0xFF;
        final int n2 = i.a[this.bG][this.bH] >> 8;
        if ((n != 14 && n != 33) || n2 > 11) {
            this.aG = 3;
            this.aH = 0 + this.bR;
            i i;
            a[] array;
            int n3;
            if (n == 14) {
                i = this;
                array = i.a;
                n3 = 8;
            }
            else {
                if (n != 33) {
                    return;
                }
                i = this;
                array = i.a;
                n3 = 22;
            }
            i.bO = -(array[n3].a(0) - n2);
        }
    }
    
    private void aE() {
        final int bg = this.bG;
        final int bh = this.bH;
        this.aG = 6;
        final int n;
        if ((n = (i.b[bg][bh] & 0xF00) >> 8) >= 4) {
            this.aG = -1;
            return;
        }
        i i;
        int ah;
        if (n == 0) {
            i = this;
            ah = 0 + (i.aN >> 1) % 3;
        }
        else {
            i = this;
            ah = 3 + n - 1;
        }
        i.aH = ah;
        final int n2 = i.b[bg][bh] & 0x7;
        this.bN = i.b[bg][bh] * i.g[n2] + 2;
        this.bO = i.b[bg][bh] * i.g[n2 + 8] + 2;
        if ((i.b[bg][bh] & 0x10) == 0x0) {
            i j = null;
            int bo = 0;
            switch (n2) {
                case 1: {
                    this.bN += 4;
                    return;
                }
                case 2: {
                    j = this;
                    bo = this.bO + 4;
                    break;
                }
                case 3: {
                    this.bN -= 4;
                    return;
                }
                case 4: {
                    j = this;
                    bo = this.bO - 4;
                    break;
                }
                default: {
                    return;
                }
            }
            j.bO = bo;
            return;
        }
        i k = null;
        int bo2 = 0;
        switch (n2) {
            case 1: {
                this.bN -= 4;
                return;
            }
            case 2: {
                k = this;
                bo2 = this.bO - 4;
                break;
            }
            case 3: {
                this.bN += 4;
                return;
            }
            case 4: {
                k = this;
                bo2 = this.bO + 4;
                break;
            }
            default: {
                return;
            }
        }
        k.bO = bo2;
    }
    
    private void aF() {
        this.a.setColor(13883367);
        final byte b = i.b[this.bG][this.bH];
        int bx;
        int n;
        i i;
        int bl;
        if ((i.b[this.bG][this.bH] & 0x1) != 0x0) {
            bx = this.bx;
            n = this.bx + 24 - b;
            i = this;
            bl = 0;
        }
        else {
            bx = this.bx + 24;
            n = this.bx + b;
            i = this;
            bl = 1;
        }
        i.bL = bl;
        this.a.drawLine(bx, this.by + 12, n, this.by + 12);
        if (b > 0) {
            i.a[0].a.a(this.a, this.bL, n, this.by + 12 - 2, 0);
        }
    }
    
    private void aG() {
        final int n = i.a[this.bG][this.bH] >> 8;
        this.aE = ((this.bJ == 9) ? 22 : 23);
        i i;
        int af;
        if ((n & 0x200) != 0x0) {
            i = this;
            if (this.bJ == 9) {}
            af = (byte)(1 + (i.aN >> 2) % 6);
        }
        else if ((n & 0x100) != 0x0) {
            i = this;
            af = 1;
        }
        else {
            i = this;
            af = 0;
        }
        i.aF = af;
    }
    
    private void aH() {
        final int bg = this.bG;
        final int bh = this.bH;
        int n;
        if ((n = ((i.a[bg][bh] >> 8 & 0xF0) >> 4) - 1) < 0) {
            n = 0;
        }
        if ((i.a[bg][bh - 1] & 0xFF) != 0x9 && (i.a[bg][bh - 1] & 0xFF) != 0x8) {
            i.a[56].a(this.a, n, this.bx, this.by, 0, 0, 0);
        }
        this.aE = 4;
        this.aF = (byte)(n + 3);
    }
    
    private void aI() {
        final int an = i.aN;
        final int n = i.b[this.bG][this.bH];
        byte b;
        if ((b = i.b[this.bG][this.bH]) > 24) {
            b = 24;
        }
        final int n2 = n & 0x7;
        this.bN = b * i.g[n2];
        this.bO = b * i.g[n2 + 8];
        if ((n & 0x8) == 0x0) {
            this.aG = 10;
            this.aH = (an >> 1) % 3;
            if (n2 != 3) {
                final int n3 = (an >> 1) % 5;
                this.a.drawImage(i.a[10][3 + n3], this.bx + this.bN - n3 * 4, this.by + (this.bO + 24), 36);
            }
        }
        else {
            this.aG = 10;
            this.aH = 2 - (an >> 1) % 3;
            if (n2 != 3) {
                final int n4 = (an >> 1) % 5;
                this.a.drawImage(i.a[10][8 + n4], this.bx + 24 - 12 + this.bN + n4 * 3, this.by + (this.bO + 24), 36);
                if ((an >> 1 & 0x1) == 0x0 && i.a[this.bG - 1][this.bH] >= 0) {
                    --this.bN;
                    ++this.bO;
                }
            }
        }
    }
    
    private void aJ() {
        if (i.a[this.bG][this.bH + 1] == 16) {
            return;
        }
        final int n = i.b[this.bG][this.bH];
        final a a = i.b = i.a[1];
        final byte b = i.b[this.bG][this.bH];
        int i = 36 - b;
        short bl = 0;
        this.bK = (((n & 0x7) == 0x4) ? 1 : 0);
        if (b != 0) {
            for (short n2 = 0; i > 0; i -= a.a(this.bK, n2), bl = n2, ++n2) {}
        }
        this.bL = bl;
        this.bN = a.f[(a.b[this.bK] + bl) * 5 + 2];
    }
    
    private void aK() {
        final int n = i.b[this.bG][this.bH];
        i.b = i.a[28];
        this.bK = (n & 0xF);
        final int n2 = (i.b[this.bG][this.bH] & 0x1FE000) >> 13;
        if (this.bK == 10) {
            int n3 = n2;
            int bl = 0;
            final int a = i.b.a(this.bK);
            int n4 = 0;
            while (true) {
                final int n5 = n4;
                if (n3 <= 0) {
                    break;
                }
                n3 -= i.b.a(this.bK, n5);
                bl = n5;
                n4 = (n5 + 1) % a;
            }
            this.bL = bl;
        }
        else {
            final int a2 = a(i.b, this.bK, n2);
            this.bL = a2;
            final int n6 = (i.b.b[this.bK] + a2) * 5;
            this.bN = i.b.f[n6 + 2];
            this.bO = i.b.f[n6 + 3];
        }
        this.aa();
    }
    
    private static int a(final a a, final int n, int i) {
        int n2 = 0;
        for (int n3 = 0; i > 0; i -= a.a(n, n3), n2 = n3, ++n3) {}
        return n2;
    }
    
    private static int b(final a a, final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += a.a(n, i);
        }
        return n3;
    }
    
    private void aL() {
        final int be = this.bE;
        final int bf = this.bF;
        i.c[be][bf] = 24;
        final int n = (i.b[be][bf] & 0x1C00) >> 10;
        final int n2 = i.b[be][bf] & 0xF;
        int n3 = 0;
        final boolean b = (i.a[be][bf] & 0xFF) == 0x23;
        if (n2 == 10) {
            n3 = 100;
        }
        else {
            for (int a = i.a[28].a(n2), i = 0; i < a; ++i) {
                n3 += i.a[28].a(n2, i);
            }
        }
        int n4 = (i.b[be][bf] & 0x1FE000) >> 13;
        ++n4;
        i.b[be][bf] = ((i.b[be][bf] & 0xFFE01FFF) | n4 << 13);
        byte[] array;
        int n5;
        int n6;
        if (n2 >= 4 && n2 <= 9) {
            array = i.b[be];
            n5 = bf;
            n6 = 12;
        }
        else {
            array = i.b[be];
            n5 = bf;
            n6 = 0;
        }
        array[n5] = (byte)n6;
        if (n4 > n3 >> 1) {
            if (!b) {
                if (this.d(be, bf) && n2 != 10) {
                    int n7 = 0;
                    switch (n2) {
                        case 4:
                        case 5: {
                            n7 = 1;
                            break;
                        }
                        case 6: {
                            n7 = 2;
                            break;
                        }
                        case 7:
                        case 8: {
                            n7 = 3;
                            break;
                        }
                        case 9: {
                            n7 = 4;
                            break;
                        }
                        default: {
                            n7 = i.h[this.aS & 0x7];
                            break;
                        }
                    }
                    this.a(1, 48, n7);
                }
                if (this.i(be, bf)) {
                    i.a[be][bf] = -1;
                    this.p(be, bf);
                    return;
                }
            }
            if (n4 >= n3) {
                q(be, bf);
                final int a2 = this.a(be, bf, this.aP, this.aQ, true);
                int n8 = 0;
                switch (n2) {
                    case 0:
                    case 3:
                    case 4:
                    case 7:
                    case 9: {
                        n8 = 1;
                        break;
                    }
                }
                final boolean b2 = a2 == 4;
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                Label_0657: {
                    if (n8 != (b2 ? 1 : 0)) {
                        n9 = (b2 ? 3 : 2);
                        n10 = be;
                        n11 = bf;
                    }
                    else {
                        n10 = be - i.g[a2];
                        n11 = bf - i.g[8 + a2];
                        int n12 = 0;
                        if (b2) {
                            if (this.d(n10, n11) && n2 != 0) {
                                n9 = 0;
                                n10 = be;
                                n11 = bf;
                                break Label_0657;
                            }
                            switch (a2) {
                                case 1: {
                                    n12 = 4;
                                    break;
                                }
                                case 4: {
                                    n12 = 9;
                                    break;
                                }
                                case 3: {
                                    n12 = 7;
                                    break;
                                }
                                default: {
                                    n12 = 0;
                                    break;
                                }
                            }
                        }
                        else {
                            if (this.d(n10, n11) && n2 != 1) {
                                n9 = 1;
                                n10 = be;
                                n11 = bf;
                                break Label_0657;
                            }
                            switch (a2) {
                                case 1: {
                                    n12 = 5;
                                    break;
                                }
                                case 2: {
                                    n12 = 6;
                                    break;
                                }
                                case 3: {
                                    n12 = 8;
                                    break;
                                }
                                default: {
                                    n12 = 1;
                                    break;
                                }
                            }
                        }
                        n9 = n12;
                    }
                }
                final boolean b3;
                if (!(b3 = (i.a[n10][n11] < 0)) || b) {
                    if (n10 != be || n11 != bf) {
                        n9 = 0;
                    }
                    n10 = be;
                    n11 = bf;
                }
                i.a[be][bf] = -1;
                i.b[n10][n11] = 0;
                i.b[n10][n11] = (n << 10 | n9);
                i.b[n10][n11] &= 0xFFE01FFF;
                i.a[n10][n11] = 45;
            }
        }
        if (b) {
            if (!this.d(be, bf) || n2 == 10) {
                return;
            }
        }
        else {
            int n13 = be;
            int n14 = bf;
            switch (n2) {
                case 7:
                case 8: {
                    --n14;
                    break;
                }
                case 10: {
                    n13 = -1;
                    n14 = -1;
                    break;
                }
                case 9: {
                    ++n13;
                    break;
                }
                case 6: {
                    --n13;
                }
                case 4:
                case 5: {
                    ++n14;
                    break;
                }
            }
            if (!this.d(n13, n14)) {
                return;
            }
        }
        this.a(1, 48, (int)i.h[this.aS & 0x7]);
    }
    
    private void aM() {
        int n = -1;
        int n2 = 3;
        final int n3;
        if (((n3 = i.b[this.bG][this.bH]) & 0x7) == 0x3) {
            n = 1;
            n2 = 0;
        }
        int n4;
        int n5;
        if ((n3 & 0x8) == 0x0) {
            n4 = this.aJ;
            n5 = this.aI;
        }
        else {
            n4 = this.aL;
            n5 = this.aK;
        }
        final int n6 = n5;
        for (int i = 0; i < n4; ++i) {
            i.a[11].a(this.a, n2 + i * n, this.bx + 3, this.by + n * (n6 - i * 24), 0, 0, 0);
        }
        a a;
        Graphics graphics;
        int n7;
        int n8;
        int n9;
        if (n == 1) {
            a = i.a[42];
            graphics = this.a;
            n7 = i.a[this.bG][this.bH - 1] - 80;
            n8 = this.bx;
            n9 = this.by - 24;
        }
        else {
            a = i.a[42];
            graphics = this.a;
            n7 = i.a[this.bG][this.bH + 1] - 80;
            n8 = this.bx;
            n9 = this.by + 24;
        }
        a.a(graphics, n7, n8, n9, 0, 0, 0);
    }
    
    private void aN() {
        final g g = i.a[0];
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        g.b = 136;
        int n = 0;
        if (i.aN > 30) {
            g.a = 139;
            g.a(1);
            int n2;
            if ((n2 = (i.aN - 30) * 4) > 29) {
                n2 = 29;
                a a;
                Graphics graphics;
                int n4;
                int n5;
                int n6;
                if (i.aN < 42) {
                    final int n3 = 42 - i.aN;
                    n = 0 + n3 * n3 % ((n3 >> 1) + 1);
                    a = g.a;
                    graphics = this.a;
                    n4 = 10;
                    n5 = 138;
                    n6 = 136 + n;
                }
                else {
                    a = g.a;
                    graphics = this.a;
                    n4 = 4;
                    n5 = 138;
                    n6 = 136;
                }
                a.a(graphics, n4, n5, n6, 0, 0, 0);
                g.g = 0;
            }
            else {
                g.a.a(this.a, 10, 138, 136, 0, 0, 0);
            }
            g.b = 136 + n2;
        }
        else {
            g.a = i.aN * 4 - 1 + 18;
        }
        final g g2 = g;
        g2.b += n;
        g.a(this.a);
        g.a.a(this.a, 5, 138, 160 + n, 0, 0, 0);
    }
    
    private static void a(final Graphics graphics, int n, final int n2, int i, final Image[] array, final int n3) {
        if (i == 0) {
            graphics.drawImage(i.a[0].a[0][0], n, n2, 24);
            return;
        }
        while (i > 0) {
            final int n4 = i % 10;
            i /= 10;
            final Image image = array[n4 + n3];
            n -= image.getWidth();
            graphics.drawImage(image, n, n2, 0);
        }
    }
    
    private static void a(final Graphics graphics, int n, final int n2, final String s, final Image[] array, final int n3) {
        for (int i = s.length() - 1; i >= 0; --i) {
            int char1;
            if ((char1 = s.charAt(i)) == 47) {
                char1 = 58;
            }
            final Image image = array[(char)(char1 - 48) + n3];
            graphics.drawImage(image, n, n2, 24);
            n -= image.getWidth();
        }
    }
    
    private boolean b() {
        return this.aP > 0 && this.aP < this.av - 1 && this.aQ > 0 && this.aQ < this.aw - 1;
    }
    
    private void n(int n) {
        final int f;
        if ((f = i.a[0].f) != 19 && (this.aS & 0x4000) == 0x0 && (this.aS & 0x800) == 0x0) {
            Label_0516: {
                if (this.b()) {
                    final int n2;
                    if ((n2 = ((i.e == null) ? 0 : a(i.e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4))) == 8 || n2 == 7) {
                        switch (n) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 24:
                            case 25:
                            case 26:
                            case 27: {
                                n = 36 + (this.aS & 0x7) - 1;
                                break;
                            }
                        }
                    }
                    else if (i.a[this.aP][this.aQ + 1] < 0 || i.a[this.aP][this.aQ + 1] == 14) {
                        int n3 = 0;
                        switch (n) {
                            case 14: {
                                n3 = 28;
                                break;
                            }
                            case 16: {
                                n3 = 29;
                                break;
                            }
                            case 42: {
                                n3 = 46;
                                break;
                            }
                            case 44: {
                                n3 = 45;
                                break;
                            }
                            case 1: {
                                n3 = 35;
                                break;
                            }
                            case 3: {
                                n3 = 34;
                                break;
                            }
                            case 0: {
                                n3 = 0;
                                break;
                            }
                            case 2: {
                                n3 = 2;
                                break;
                            }
                            case 22: {
                                n3 = 31;
                                break;
                            }
                            case 20: {
                                n3 = 30;
                                break;
                            }
                            case 23: {
                                n3 = 33;
                                break;
                            }
                            case 21: {
                                n3 = 32;
                                break;
                            }
                            default: {
                                break Label_0516;
                            }
                        }
                        n = n3;
                    }
                }
            }
            if (n == 1000) {
                i.a[3].a(0);
                this.aS |= 0x4000;
            }
            else {
                i.a[0].a(n);
            }
            if (f != n) {
                this.am = 70;
            }
        }
    }
    
    private void aO() {
        if (a(32944)) {
            i.W = 0;
            this.aw = true;
            this.o(this.c);
            return;
        }
        if (a(64)) {
            i.W = 0;
            i.l = 27;
            this.aw = true;
            this.e = true;
            i.W = 0;
            return;
        }
        Label_0087: {
            i i;
            int n;
            if (a(4097)) {
                i = this;
                n = -1;
            }
            else {
                if (!a(262146)) {
                    break Label_0087;
                }
                i = this;
                n = 1;
            }
            i.p(n);
        }
        i.W = 0;
        i j;
        String[] array;
        int n2;
        if (f(this.c) == 0) {
            this.d = -1;
            j = this;
            array = i.a;
            n2 = 81;
        }
        else {
            ((StringBuffer)(this.d = f.a[this.c])).delete(0, this.d.length());
            this.d.append(this.d);
            j = this;
            array = i.a;
            n2 = 90;
        }
        j.a = array[n2];
        this.aw = true;
    }
    
    private static int f(final int n) {
        if (i.i[8] >= 4 + n + 1) {
            return 0;
        }
        if (a(i.i, 4) < f.a[n]) {
            return -1;
        }
        return 1;
    }
    
    private void o(final int n) {
        this.ep = -1;
        switch (f(n)) {
            case -1: {
                this.a = i.a[89];
            }
            case 0: {
                this.a = i.a[81];
            }
            case 1: {
                this.aZ = a(i.i, 4) - f.a[this.c];
                this.f = null;
                System.gc();
                this.f = i.a[110] + " " + this.aZ + " " + i.a[109];
                i.i[4] = (byte)(this.aZ & 0xFF);
                i.i[5] = (byte)(this.aZ >> 8 & 0xFF);
                i.i[8] = (byte)(4 + n + 1);
                this.G();
                this.d = -1;
                this.a = i.a[81];
                this.Z = true;
                this.a(i.a[91], -1, -1, 5000, 4273165, 0);
                break;
            }
        }
    }
    
    private void p(final int n) {
        this.c += n;
        if (this.c < 0) {
            this.c = 3;
        }
        if (this.c == 4) {
            this.c = 0;
        }
    }
    
    private void aP() {
        if (a(64)) {
            i.l = 4;
            this.a(4);
        }
        i.W = 0;
    }
    
    private void aQ() {
        if (i.W == 0) {
            this.j = 0;
            return;
        }
        if (h()) {
            this.c(true);
            i.W = 0;
            return;
        }
        Label_0429: {
            int w = 0;
            Label_0426: {
                switch (i.l) {
                    case 33: {
                        this.aS();
                        break Label_0429;
                    }
                    case 26: {
                        this.aP();
                    }
                    case 18: {
                        break Label_0429;
                    }
                    case 25: {
                        this.aO();
                        break Label_0429;
                    }
                    case 24: {
                        this.aW();
                        break Label_0429;
                    }
                    case 34: {
                        this.aY();
                        break Label_0429;
                    }
                    case 12: {
                        this.aZ();
                        break Label_0429;
                    }
                    case 4: {
                        this.bb();
                        break Label_0429;
                    }
                    case 30: {
                        if (!a(32784)) {
                            break Label_0429;
                        }
                        i.l = 4;
                        if (this.bo == -1) {
                            this.a(this.aM = 0);
                        }
                        else {
                            this.aM = 2;
                        }
                        w = 0;
                        break Label_0426;
                    }
                    case 2:
                    case 7:
                    case 32: {
                        this.bb();
                        break Label_0429;
                    }
                    case 1: {
                        if (this.f || this.aj) {
                            i.W = 0;
                        }
                        i.m = i.l;
                        this.aT();
                        this.ba();
                    }
                    case 10: {
                        break Label_0429;
                    }
                    case 15: {
                        this.cD();
                        break Label_0429;
                    }
                    case 17:
                    case 20: {
                        if (a(32944)) {
                            if (this.aM == 5) {
                                this.bk();
                                this.A();
                            }
                            this.s = true;
                            break;
                        }
                        break Label_0429;
                    }
                    case 27: {
                        i.m = i.l;
                        this.aT();
                        this.aU();
                        break Label_0429;
                    }
                    case 31: {
                        if (a(64)) {
                            this.bs = 0;
                            this.br = 8;
                            i.l = 9;
                            this.a(-1);
                            break;
                        }
                        if (a(32944)) {
                            this.aR();
                            break;
                        }
                        break;
                    }
                }
                w = 0;
            }
            i.W = w;
        }
        if (this.b) {
            return;
        }
        if ((this.aS & 0x7) != 0x0) {
            this.b = 10;
        }
    }
    
    private void aR() {
        this.B = true;
        i.l = 16;
        this.bs = 0;
        this.br = 6;
        this.ao = 0;
        this.bb = 0;
        this.aZ = 0;
        this.n = false;
        this.V = 0;
        i.eb = 0;
    }
    
    private void aS() {
        if (a(64)) {
            if (this.bo == 0) {
                i.l = 4;
                this.a(0);
                this.a.b(19);
            }
            if (this.bo == 1) {
                i.l = 2;
                i.U = true;
                this.m = true;
                this.a(1);
            }
        }
    }
    
    private void aT() {
        if (i.s < i.b.length && a(i.b[i.s])) {
            i.W = 0;
            ++i.s;
            if (i.s == i.b.length) {
                i.W = 0;
                i.l = 24;
                this.cz = i.i[8];
                this.cA = i.i[9];
                this.R = false;
                this.S = false;
            }
        }
        else {
            byte s;
            if (a(i.b[0])) {
                i.W = 0;
                s = 1;
            }
            else {
                s = 0;
            }
            i.s = s;
        }
    }
    
    private void aU() {
        if (this.s != -1 || this.q != 0) {
            i.W = 0;
            return;
        }
        Label_0126: {
            i i;
            int j;
            if (a(32944)) {
                i = this;
                j = 4;
            }
            else {
                if (a(64)) {
                    this.A();
                    i.l = 9;
                    this.br = 8;
                    this.a(-1);
                    this.bs = 0;
                    break Label_0126;
                }
                if (a(4097)) {
                    i = this;
                    j = 0;
                }
                else if (a(262146)) {
                    i = this;
                    j = 2;
                }
                else if (a(16388)) {
                    i = this;
                    j = 3;
                }
                else {
                    if (!a(65544)) {
                        break Label_0126;
                    }
                    i = this;
                    j = 1;
                }
            }
            i.j = j;
        }
        i.W = 0;
    }
    
    private void aV() {
        if (this.ap == 0 && this.aq == 13) {
            this.a = null;
            this.aP = 60;
            this.aQ = 3;
            return;
        }
        this.au = a(524288);
        this.A = !this.au;
        this.bd = 0;
        this.bc = 0;
        this.v = true;
        this.aP = this.av + 5 + 1;
    }
    
    private void aW() {
        boolean b = false;
        Label_0442: {
            if (a(512)) {
                this.aa = !this.aa;
            }
            else if (a(65536)) {
                this.aZ += 50;
            }
            else if (a(131072)) {
                this.bb += 5;
            }
            else if (a(262144)) {
                if (i.m != 1) {
                    this.cA <<= 1;
                    Label_0127: {
                        i i;
                        int ca;
                        if (this.cA == 0) {
                            i = this;
                            ca = 1;
                        }
                        else {
                            if (this.cA <= 8) {
                                break Label_0127;
                            }
                            i = this;
                            ca = 0;
                        }
                        i.cA = ca;
                    }
                    if (this.cA > 2) {
                        i.i[10] = 1;
                    }
                    else {
                        i.i[10] = 0;
                    }
                }
            }
            else if (a(524288)) {
                this.R = !this.R;
            }
            else if (a(32768)) {
                i.l = 34;
            }
            else if (a(1024)) {
                this.S = !this.S;
            }
            else {
                if (!a(64)) {
                    if (!a(32944)) {
                        break Label_0442;
                    }
                    i.i[8] = (byte)this.cz;
                    i.i[9] = (byte)this.cA;
                    if (this.R || this.S) {
                        for (int j = 0; j <= 2; ++j) {
                            int e = this.e(j);
                            if (j == 2) {
                                ++e;
                            }
                            for (int k = 0; k <= e; ++k) {
                                this.a(j, k, (byte)2);
                                this.a(j, k, (byte)64);
                            }
                            this.a(j, e);
                        }
                        if (this.S) {
                            for (int l = 0; l <= 2; ++l) {
                                int d = this.d(l);
                                if (l == 0) {
                                    --d;
                                }
                                for (int e2 = this.e(l); e2 < d; ++e2) {
                                    this.a(l, e2, (byte)2);
                                    this.a(l, e2, (byte)64);
                                }
                                this.a(l, d - 1);
                            }
                        }
                    }
                    this.d();
                    this.e();
                    this.G();
                }
                b = true;
            }
        }
        if (b) {
            this.aX();
        }
        i.W = 0;
    }
    
    private void aX() {
        i.l = i.m;
        if (i.m == 27) {
            this.aw = true;
            this.e = true;
        }
        else if (i.m == 1) {
            this.B();
        }
        i.W = 0;
    }
    
    private void aY() {
        int n = 0;
        if (a(33008)) {
            this.aX();
            a(i.a, true);
            i.a = null;
        }
        if (a(4097)) {
            --this.df;
            if (this.df < 0) {
                this.df = 0;
            }
        }
        if (a(262146)) {
            ++this.df;
            if (this.df >= 2) {
                this.df = 1;
            }
        }
        int n2 = this.a[this.df];
        if (a(16388)) {
            --n2;
        }
        if (a(65544)) {
            ++n2;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (true) {
            int n3 = 0;
            switch (this.df) {
                case 1: {
                    n3 = 9;
                    break;
                }
                case 0: {
                    n3 = 115;
                    break;
                }
                default: {
                    if (n2 >= n) {
                        n2 = n - 1;
                    }
                    this.a[this.df] = n2;
                    i.W = 0;
                    return;
                }
            }
            n = n3;
            continue;
        }
    }
    
    private void aZ() {
        if (!a(32944)) {
            return;
        }
        this.ao = 5;
        i.i[3] = (byte)this.ao;
        if (this.i == 2) {
            this.t();
            return;
        }
        e(4, -500);
        i.l = 15;
        this.I = true;
        this.G = true;
        this.ct();
    }
    
    private void ba() {
        if (this.aa && (a(524288) || a(131072))) {
            this.aV();
        }
        if ((this.cl != 0 && !a(32944)) || this.an != 0 || this.v || this.n <= 0 || i.a[0].f == 19 || this.C) {
            i.W = 0;
            return;
        }
        if (this.a != null) {
            if (a(32784)) {
                this.a.a();
            }
            else if (a(32944)) {
                this.a.b = true;
            }
            i.W = 0;
            return;
        }
        if (this.aT > 0) {
            boolean b = true;
            if (a(4097)) {
                this.ak = -5;
            }
            else if (a(262146)) {
                this.ak = 5;
            }
            else if (a(16388)) {
                this.aj = -5;
            }
            else if (a(65544)) {
                this.aj = 5;
            }
            else if (!a(32784)) {
                if (a(32944)) {
                    this.bB();
                    i.W = 0;
                }
                else {
                    b = false;
                }
            }
            if (b) {
                --this.aT;
                if (this.aT == 0) {
                    if ((byte)(i.a[this.aP][this.aQ] & 0xFF) < 0) {
                        i.a[this.aP][this.aQ] = 32;
                    }
                    if (i.a[this.aP][this.aQ] == 9) {
                        i.a[this.aP][this.aQ] = -1;
                    }
                    this.b = 40L;
                    this.aR = 0;
                    this.aS = ((this.aS & 0xFFFFFF8F) | 0x0);
                    this.n(this.f());
                }
                i.W = 0;
            }
        }
        else {
            if (a(4097)) {
                this.j = 1;
            }
            else if (a(262146)) {
                this.j = 3;
            }
            else if (a(16388)) {
                this.j = 4;
            }
            else if (a(65544)) {
                this.j = 2;
            }
            else if (a(32784)) {
                i.W = 0;
                if (this.bS == this.aP && this.bT == this.aQ && (i.a[this.aP][this.aQ] & 0xFF) == 0x4) {
                    this.C(9);
                    this.cg();
                }
                else {
                    final int n;
                    if ((n = ((i.e == null) ? 0 : a(i.e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4))) != 8 && n != 7) {
                        final int n2 = this.aS & 0x7;
                        int n3 = -1;
                        int n4 = -1;
                        boolean b2 = false;
                        if (i.i[9] >= 2) {
                            int n5 = 0;
                            for (int i = 0; i < 2; ++i) {
                                final int n6;
                                if (((n6 = ((i == 0) ? 1 : -1)) > 0 && this.aP < this.av - 3) || (n6 < 0 && this.aP > 3)) {
                                    for (int j = 1; j <= 3; ++j) {
                                        final int n7 = this.aP + n6 * j;
                                        final byte b3 = i.a[n7][this.aQ];
                                        int n10 = 0;
                                        Label_0930: {
                                            if ((i.a[n7][this.aQ] & 0xFF) != 0x7 || (i.a[n7][this.aQ] >> 8 & 0xF0) != 0x0) {
                                                if (b3 == 48 && (i.b[n7][this.aQ] & 0x8) != 0x0) {
                                                    continue;
                                                }
                                                Label_0866: {
                                                    switch (b3) {
                                                        case 11:
                                                        case 19:
                                                        case 43: {
                                                            int n8;
                                                            int n9;
                                                            if (n6 > 0) {
                                                                n8 = n5;
                                                                n9 = 2;
                                                            }
                                                            else {
                                                                if (n6 >= 0) {
                                                                    break Label_0866;
                                                                }
                                                                n8 = n5;
                                                                n9 = 4;
                                                            }
                                                            n5 = (n8 | n9);
                                                        }
                                                        case 0:
                                                        case 1:
                                                        case 8:
                                                        case 9:
                                                        case 14:
                                                        case 47:
                                                        case 48: {
                                                            if (j == 1) {
                                                                n10 = 4;
                                                                break Label_0930;
                                                            }
                                                            if (n4 < 0) {
                                                                n4 = ((n6 > 0) ? 2 : 4);
                                                                break;
                                                            }
                                                            b2 = true;
                                                            n4 = ((n5 == 2) ? 2 : ((n5 == 4) ? 4 : -1));
                                                            n10 = 4;
                                                            break Label_0930;
                                                        }
                                                        case -1: {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                            n10 = 4;
                                        }
                                        j = n10;
                                    }
                                }
                            }
                        }
                        if (i.i[9] >= 1) {
                            this.j = 5;
                            int n11 = 0;
                            final int[] array = { 0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2 };
                            final int[] array2 = { -1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0 };
                            final int[] array3 = { 0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8 };
                            for (int k = 0; k < array.length; ++k) {
                                final int n12 = this.aP + array[k];
                                final int n13 = this.aQ + array2[k];
                                if (n12 >= 0 && n12 < this.av && n13 >= 0) {
                                    if (n13 < this.aw) {
                                        final int n14 = i.b[n12][n13] & 0x7;
                                        boolean b4 = false;
                                        int n15 = -1;
                                        boolean b5 = false;
                                        Label_1398: {
                                            switch (i.a[n12][n13]) {
                                                case 9:
                                                case 18:
                                                case 30: {
                                                    if (array3[k] == 0) {
                                                        b5 = true;
                                                    }
                                                    break Label_1398;
                                                }
                                                case 46:
                                                case 49:
                                                case 50: {
                                                    if (array3[k] == 0) {
                                                        ++n11;
                                                        b5 = true;
                                                    }
                                                    break Label_1398;
                                                }
                                                case 19:
                                                case 43: {
                                                    if ((i.b[n12][n13] & 0xF8) == 0x0) {
                                                        break;
                                                    }
                                                    break Label_1398;
                                                }
                                                case 45: {
                                                    if ((i.b[n12][n13] & 0xF) != 0xA) {
                                                        break;
                                                    }
                                                    break Label_1398;
                                                }
                                            }
                                            b4 = true;
                                        }
                                        if (b4) {
                                            Label_1536: {
                                                int n16;
                                                if (array3[k] == 0) {
                                                    n16 = k + 1;
                                                }
                                                else {
                                                    if (i.b[n12][n13] < 12) {
                                                        break Label_1536;
                                                    }
                                                    if ((array3[k] & 0x1) != 0x0 && n14 == 3) {
                                                        if (array[k] == 0) {
                                                            n16 = 1;
                                                        }
                                                        else if (array[k] < 0) {
                                                            n16 = 4;
                                                        }
                                                        else {
                                                            if (array[k] <= 0) {
                                                                break Label_1536;
                                                            }
                                                            n16 = 2;
                                                        }
                                                    }
                                                    else {
                                                        if ((array3[k] & 0x8) == 0x0 || n14 != 2) {
                                                            break Label_1536;
                                                        }
                                                        if (array2[k] == 0) {
                                                            n16 = 4;
                                                        }
                                                        else if (array2[k] < 0) {
                                                            n16 = 1;
                                                        }
                                                        else {
                                                            if (array2[k] <= 0) {
                                                                break Label_1536;
                                                            }
                                                            n16 = 3;
                                                        }
                                                    }
                                                }
                                                n15 = n16;
                                            }
                                            if (n15 != -1) {
                                                b5 = true;
                                                ++n11;
                                            }
                                        }
                                        if (b5) {
                                            if (n11 == 0) {
                                                if (n2 == k + 1) {
                                                    n3 = n2;
                                                }
                                                else if (n3 < 0) {
                                                    n3 = k + 1;
                                                }
                                            }
                                            else {
                                                if (n11 != 1) {
                                                    n3 = n2;
                                                    break;
                                                }
                                                n3 = n15;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Label_1740: {
                            i l = null;
                            int n17 = 0;
                            int n18 = 0;
                            Label_1736: {
                                if (n3 > 0 && n4 == n2) {
                                    this.j = 6;
                                    l = this;
                                    n17 = (this.aS & 0xFFFFFFF8);
                                    n18 = n2;
                                }
                                else if (n3 > 0 && n4 < 0 && !b2) {
                                    l = this;
                                    n17 = (this.aS & 0xFFFFFFF8);
                                    n18 = n3;
                                }
                                else {
                                    if (n3 >= 0 || n4 <= 0 || b2) {
                                        if (b2 && (n2 == 2 || n2 == 4)) {
                                            this.j = 6;
                                            l = this;
                                            n17 = (this.aS & 0xFFFFFFF8);
                                            n18 = n2;
                                            break Label_1736;
                                        }
                                        if (!b2 || n4 <= 0) {
                                            break Label_1740;
                                        }
                                    }
                                    this.j = 6;
                                    l = this;
                                    n17 = (this.aS & 0xFFFFFFF8);
                                    n18 = n4;
                                }
                            }
                            l.aS = (n17 | n18);
                        }
                        if (this.j == 6 && (i.a[this.aP][this.aQ] & 0xFF) == 0x2 && i.a[this.aP][this.aQ] >> 8 == 1) {
                            this.ay = -1;
                            this.b(this.aP, this.aQ, (byte)2);
                        }
                    }
                }
            }
            else if (a(256)) {
                this.ay = -1;
                final int f;
                if ((f = i.a[0].f) == 36 + (this.aS & 0x7) - 1) {
                    if ((i.a[this.aP][this.aQ] & 0xFF) == 0x4) {
                        this.cg();
                    }
                    else {
                        this.C(2);
                        this.n(19);
                    }
                }
                switch (f) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 34:
                    case 35: {
                        if ((i.a[this.aP][this.aQ] & 0xFF) == 0x4) {
                            this.cg();
                            break;
                        }
                        this.C(2);
                        this.n(19);
                        break;
                    }
                }
            }
            else if (a(32944)) {
                this.bB();
                i.W = 0;
            }
            if (this.j != 5 && this.k == 0 && this.b == 0 && this.j != (this.aS & 0x7)) {
                this.aS |= 0x1000;
            }
        }
    }
    
    private void bb() {
        if (this.dd >= 0 && this.dd <= 2) {
            i.W = 0;
            return;
        }
        if (a(4097)) {
            if (System.currentTimeMillis() - this.j < 300L) {
                return;
            }
            this.x();
            if (this.bo == 0 && this.bq == 1 && !this.W) {
                this.x();
            }
        }
        else if (a(262146)) {
            if (System.currentTimeMillis() - this.j < 300L) {
                return;
            }
            this.y();
            if (this.bo == 0 && this.bq == 1 && !this.W) {
                this.y();
            }
        }
        else if (a(32944)) {
            if (this.dd < 0 || this.dd > 2) {
                this.dd = 0;
                this.i = System.currentTimeMillis();
            }
        }
        else if (a(64)) {
            this.bc();
        }
        i.W = 0;
    }
    
    private void bc() {
        switch (this.bo) {
            case -1: {}
            case 5: {
                i.U = true;
                i.V = false;
                if (i.l == 2) {
                    this.a(1);
                    this.B();
                    i.V = true;
                }
                if (i.l == 4) {
                    this.a(0);
                    this.C(19);
                    return;
                }
                break;
            }
            case 2: {
                i.l = 9;
                this.a(0);
                this.br = 8;
                this.bs = 0;
            }
            case 4: {
                this.a(2);
                break;
            }
        }
    }
    
    private void f(final int n, final int n2) {
        final int[] array = { 0, 1, -1, 0, 0 };
        final int[] array2 = { 0, 0, 0, 1, -1 };
        int n3 = 0;
        final boolean b = i.i[9] >= 8;
        boolean b2 = false;
        Label_0317: {
            int c = 0;
            switch (i.a[n][n2]) {
                case 9: {
                    if ((this.aS & 0x2000) == 0x0) {
                        this.aS |= 0x2000;
                        n3 = 1;
                        this.g(n, n2);
                    }
                    break Label_0317;
                }
                case 18: {
                    c = (this.c() ? 1 : 0);
                    break;
                }
                case 0: {
                    b2 = true;
                    break Label_0317;
                }
                case 30: {
                    n3 = 1;
                    if (i.b[n][n2] == 0) {
                        this.C(11);
                        i.b[n][n2] = 1;
                    }
                    break Label_0317;
                }
                case 10: {
                    if (this.x == 3 && i.b[n][n2] <= 0) {
                        n3 = 1;
                        i.b[n][n2] = 1;
                        this.b(n, n2);
                    }
                    break Label_0317;
                }
                case 16: {
                    n3 = 1;
                    b2 = true;
                    break Label_0317;
                }
                default: {
                    if (i.a[n][n2] - 80 >= 0 || ((i.a[n][n2] & 0xFF) == 0x7 && (i.a[n][n2] >> 8 & 0xF0) == 0x0)) {
                        b2 = true;
                        c = 1;
                        break;
                    }
                    break Label_0317;
                }
            }
            n3 = c;
        }
        if (b2) {
            t(200);
            this.C(6);
            this.n(41 + (this.aS & 0x7) - 1);
        }
        if (n3 == 0) {
            for (int i = 0; i < 5; ++i) {
                final int n4 = n + array[i];
                final int n5 = n2 + array2[i];
                if (n4 >= 0 && n4 < this.av && n5 >= 0) {
                    if (n5 < this.aw) {
                        final byte b3 = i.a[n4][n5];
                        int n6 = 0;
                        boolean b4 = false;
                        switch (b3) {
                            case 1: {
                                if (n4 == this.aP - i.g[this.aS & 0x7] && n5 == this.aQ - i.g[(this.aS & 0x7) + 8]) {
                                    b4 = true;
                                    break;
                                }
                                break;
                            }
                            case 19:
                            case 43:
                            case 45:
                            case 46:
                            case 49: {
                                final int n7;
                                final byte b5 = (byte)(((n7 = (i.b[n4][n5] & 0x7)) == 0) ? 0 : i.b[n4][n5]);
                                final boolean b6 = b3 != 49 && b3 != 46;
                                if (a(n, n2, 0, 0, n4, n5, n7, b5)) {
                                    b4 = true;
                                    n6 = (b6 ? 1 : 0);
                                }
                                if (b4) {
                                    this.C(10);
                                    break;
                                }
                                break;
                            }
                        }
                        if (b && b4 && (n4 != this.aP || n5 != this.aQ)) {
                            final boolean b7;
                            if (b7 = this.b(n4, n5)) {
                                this.aS |= 0x2000;
                            }
                        }
                        else if (n6 != 0) {
                            this.aS |= 0x2000;
                            if (b3 == 45) {
                                int n8;
                                if ((n8 = (i.b[n4][n5] & 0x1C00) >> 10) == 3) {
                                    i.a[n4][n5] = -1;
                                    this.p(n4, n5);
                                }
                                else {
                                    ++n8;
                                    i.b[n4][n5] = (0xA | n8 << 10);
                                    i.b[n4][n5] = ((i.b[n4][n5] & 0xFFFFFF07) | 0x78);
                                    i.b[n4][n5] = 0;
                                }
                            }
                            else {
                                this.c(b3, n4, n5);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void g(final int n, final int n2) {
        if (a(n, n2)) {
            return;
        }
        q(n, n2);
        final int n3 = this.d(n, n2 - 1) ? 2 : 1;
        switch ((i.b[n][n2] & 0xFC00000) >> 22) {
            case 39: {
                i.a[n][n2] = 49;
                i.b[n][n2] = n3;
            }
            case 37: {
                byte[] array;
                int n4;
                int n5;
                if ((i.b[n][n2] & 0x10000000) != 0x0) {
                    array = i.a[n];
                    n4 = n2;
                    n5 = 43;
                }
                else {
                    array = i.a[n];
                    n4 = n2;
                    n5 = 19;
                }
                array[n4] = (byte)n5;
                i.b[n][n2] = n3;
                this.c(19, n, n2);
            }
            case 35: {
                i.a[n][n2] = 45;
                i.b[n][n2] = ((i.b[n][n2] & 0xFFFFFFF0) | 0xA);
            }
            case 34: {
                i.a[n][n2] = 1;
                this.c(n, n2);
            }
            case 36: {
                i.a[n][n2] = 46;
                i.b[n][n2] = 0;
                i.b[n][n2] = 0;
                break;
            }
        }
    }
    
    private boolean c() {
        if (this.x == 3) {
            final int n = i.a[this.aP][this.aQ] & 0xFF;
            if (this.cf == 0 && n != 15 && n != 16) {
                this.C(0);
                i i;
                int cf;
                if (this.ce <= 0) {
                    i = this;
                    cf = 1;
                }
                else {
                    i = this;
                    cf = -1;
                }
                i.cf = cf;
            }
            return true;
        }
        return false;
    }
    
    private void c(final int n, final int n2, final int n3) {
        int n4 = i.b[n2][n3];
        if (n == 43 && (n4 & 0xF8) == 0x0) {
            if ((n4 & 0x18000) == 0x0) {
                i.a[n2][n3] = -1;
                this.p(n2, n3);
                return;
            }
            final int n5;
            n4 = ((((n5 = ((((n4 - 32768 & 0xFF01FFFF) | n2 << 17) & 0x80FFFFFF) | n3 << 24)) & 0x7) == 0x1 || (n5 & 0x7) == 0x3) ? (n5 | Integer.MIN_VALUE) : (n5 & Integer.MAX_VALUE));
        }
        i.b[n2][n3] = ((n4 & 0xFFFFFF07) | 0x78);
    }
    
    private void bd() {
        int n = i.a[this.bE][this.bF] >> 8;
        int[] array;
        int n2;
        int n3;
        if (++n >= 16) {
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = -1;
        }
        else {
            i.c[this.bE][this.bF] = 24;
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = (n << 8 | 0x24);
        }
        array[n2] = n3;
    }
    
    private void h(final int n, final int n2) {
        switch (i.a[n][n2]) {
            case 0: {
                this.C(11);
            }
            case 19:
            case 43:
            case 45:
            case 46: {
                i.a[n][n2] = -1;
                this.p(n, n2);
            }
            case 48: {
                i.a[n][n2] = -1;
                this.p(n, n2);
                int n3 = n2 + 1;
                if (i.a[n][n3] != 48) {
                    n3 = -1;
                }
                i.a[n][n3] = -1;
                this.p(n, n3);
                i.e[(i.b[n][n2] >> 24) * 3 + 2] = -1;
            }
            default: {
                i.a[n][n2] = -1;
            }
        }
    }
    
    private void be() {
        if (this.a) {
            --this.a;
        }
        if ((this.f || this.aj) && i.aN > 140) {
            if (this.aj) {
                this.d();
            }
            this.f = false;
            this.aj = false;
            this.J = true;
            this.bs = 0;
            this.g();
            this.H = true;
            i.l = 28;
        }
        boolean b = this.b();
        if (this.am) {
            this.am = false;
            if (this.dv < this.dw) {
                this.v(a((byte)this.dv, (byte)13, (byte)7), a((byte)this.dv, (byte)20, (byte)7));
                ++this.dv;
            }
            else {
                this.dv = 0;
                this.dw = 0;
            }
        }
        if (i.a[4] != null) {
            i.a[4].b();
        }
        if (this.bj > 0) {
            --this.bj;
        }
        if (this.dk > 0) {
            --this.dk;
            if (this.dk == 0) {
                this.e = null;
            }
        }
        if (this.S != this.T) {
            int s;
            int n = s = this.S;
            while (true) {
                final int n2 = s;
                if (n == this.T) {
                    break;
                }
                final byte[] b2 = i.b;
                final int n3 = n2;
                ++b2[n3];
                if (i.b[n2] >= ((i.c[n2] < 0) ? a(i.a[2], 0) : i.a[9].a((int)i.c[n2]))) {
                    ++this.S;
                    this.S &= 0x7;
                }
                n = (s = (n2 + 1 & 0x7));
            }
        }
        if (this.i != 0) {
            this.bq();
            if (i.l != 1) {
                return;
            }
        }
        if ((i.aN & 0xF) == 0x0) {
            this.bp();
        }
        if (this.cf != 0 && (i.aN >> 1 & 0x1) == 0x0) {
            this.ce += this.cf;
            if (this.ce == 0 || this.ce == 9) {
                this.cf = 0;
                for (int i = 1; i < this.aw - 1; ++i) {
                    for (int j = 1; j < this.av - 1; ++j) {
                        final int n4 = i.a[j][i] & 0xFF;
                        final byte b3 = i.a[j][i];
                        if (n4 == 15 || n4 == 16 || b3 == 34 || b3 == 35) {
                            this.c(j, i);
                        }
                    }
                }
            }
            else if (this.ce == 5) {
                final int n5 = this.aw - 1;
                final int n6 = this.av - 1;
                for (int k = 1; k < n5; ++k) {
                    for (int l = 1; l < n6; ++l) {
                        final int n7 = i.a[l][k] & 0xFF;
                        final byte b4 = i.a[l][k];
                        boolean b5 = false;
                        Label_0700: {
                            if (n7 == 15) {
                                this.h(l, k);
                                i.a[l][k] = 34;
                            }
                            else if (n7 == 16) {
                                this.h(l, k);
                                i.a[l][k] = 35;
                            }
                            else {
                                int[] array;
                                int n8;
                                int n9;
                                if (b4 == 34) {
                                    array = i.a[l];
                                    n8 = k;
                                    n9 = 15;
                                }
                                else {
                                    if (b4 != 35) {
                                        break Label_0700;
                                    }
                                    array = i.a[l];
                                    n8 = k;
                                    n9 = 16;
                                }
                                array[n8] = n9;
                                i.a[l][k] = -1;
                                this.t(l, k);
                            }
                            b5 = true;
                        }
                        if (b5) {
                            q(l, k);
                        }
                    }
                }
            }
        }
        --this.b;
        if (this.aW > 0 && --this.aW == 0) {
            this.bl();
        }
        if (this.aR <= 0 && this.u) {
            this.u = false;
            this.C(9);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException ex) {}
            this.cf();
        }
        if (i.a[11] != null) {
            this.bo();
        }
        if (this.bi != 0 && this.bg != 0) {
            this.bn();
        }
        this.bF();
        if (this.al > 0) {
            this.bf();
        }
        this.co();
        if (this.cl != 0) {
            this.bE();
        }
        if (this.a != null) {
            this.am = 70;
            if (this.a.a() && this.a.b() == null) {
                this.a = null;
            }
            if (this.a != null) {
                this.a.b();
            }
        }
        else if (this.bm != -1) {
            this.u(this.bm);
            this.bm = -1;
            this.j = 0;
        }
        Label_2483: {
            i i2;
            int ar;
            if (this.aT > 0) {
                if (i.a[this.aP][this.aQ] < 0) {
                    i m;
                    int n10;
                    int n11;
                    if (i.a[this.aP][this.aQ + 1] == 9 && (i.b[this.aP][this.aQ + 1] & 0x7) == 0x3) {
                        ++this.aQ;
                        m = this;
                        n10 = (this.aS & 0xFFFFFFF8);
                        n11 = 3;
                    }
                    else if (i.a[this.aP - 1][this.aQ + 1] == 9 && (i.b[this.aP - 1][this.aQ + 1] & 0x7) == 0x3) {
                        ++this.aQ;
                        --this.aP;
                        m = this;
                        n10 = (this.aS & 0xFFFFFFF8);
                        n11 = 3;
                    }
                    else if (i.a[this.aP + 1][this.aQ + 1] == 9 && (i.b[this.aP + 1][this.aQ + 1] & 0x7) == 0x3) {
                        ++this.aQ;
                        ++this.aP;
                        m = this;
                        n10 = (this.aS & 0xFFFFFFF8);
                        n11 = 3;
                    }
                    else {
                        m = this;
                        n10 = (this.aS & 0xFFFFFFF8);
                        n11 = 0;
                    }
                    m.aS = (n10 | n11);
                }
                i2 = this;
                ar = i.b[this.aP][this.aQ];
            }
            else if ((this.k == 0 || (this.aR <= 0 && this.k != 5)) && !this.v && (this.aS & 0x70) == 0x0 && this.aA == -1) {
                this.k = this.j;
                boolean a = false;
                if (this.an > 0) {
                    this.k = 2;
                    --this.an;
                    if (this.an == 0) {
                        this.j(this.aP - 1, this.aQ);
                        this.j = 0;
                        i.W = 0;
                    }
                }
                else if (b) {
                    q(this.aP, this.aQ);
                }
                switch (this.k) {
                    case 3: {
                        this.aS &= 0xFFFFFFF7;
                    }
                    case 1:
                    case 2:
                    case 4: {
                        if (i.a[0].f == 40 || i.a[0].f == 48) {
                            break;
                        }
                        if ((this.aS & 0x1000) != 0x0) {
                            this.aS = ((this.aS & 0xFFFFFFF8) | this.k);
                            this.aR = 18;
                            int n12;
                            if ((n12 = this.k - 1) < 0) {
                                n12 = 0;
                            }
                            this.n(0 + n12);
                            break;
                        }
                        a = this.a(-i.g[this.k], -i.g[this.k + 8], false);
                        b = this.b();
                        if (!a) {
                            break;
                        }
                        this.a = 40;
                        this.a = false;
                        int n13;
                        if ((n13 = this.k - 1) < 0) {
                            n13 = 0;
                        }
                        if ((this.aS & 0x8) == 0x0) {
                            this.n(4 + n13);
                            break;
                        }
                        if (this.k == 2) {
                            this.n(8);
                            break;
                        }
                        this.n(9);
                        break;
                    }
                    case 6: {
                        final int n14 = ((this.aS & 0x7) == 0x2) ? 1 : -1;
                        if (b && i.a[this.aP + n14][this.aQ] < 0) {
                            this.n((n14 == -1) ? 22 : 20);
                            i.a[this.aP + n14][this.aQ] = 32;
                            i.b[this.aP + n14][this.aQ] = 18;
                            i.b[this.aP + n14][this.aQ] = (0x4 | ((n14 > 0) ? 1 : 0));
                            i.c[this.aP + n14][this.aQ] = 30;
                            this.aR = 72;
                            this.j = 0;
                            break;
                        }
                        break;
                    }
                    case 5: {
                        this.aR = 0;
                        final int n15 = this.aS & 0x7;
                        if (this.b()) {
                            this.n(13 + n15 - 1);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        this.aS &= 0xFFFFFFF7;
                        boolean b6 = false;
                        switch (i.a[0].f) {
                            case 0:
                            case 2:
                            case 10:
                            case 11:
                            case 12:
                            case 34:
                            case 35:
                            case 40:
                            case 48: {
                                break;
                            }
                            default: {
                                if ((this.aS & 0x4000) == 0x0) {
                                    b6 = true;
                                    break;
                                }
                                break;
                            }
                        }
                        if (b6) {
                            int n16;
                            if ((n16 = 0 + (this.aS & 0x7) - 1) < 0) {
                                n16 = 0;
                            }
                            this.n(n16);
                        }
                        i i3;
                        int ax;
                        if (this.a == null) {
                            i3 = this;
                            ax = 6;
                        }
                        else {
                            i3 = this;
                            ax = 0;
                        }
                        i3.aX = ax;
                        if (this.aR > 0) {
                            this.aR -= 6;
                            break;
                        }
                        break;
                    }
                }
                if (b) {
                    final byte b7 = i.a[this.aP][this.aQ - 1];
                    if (!a && this.k != 5 && this.aR <= 0 && (b7 == 0 || b7 == 9 || b7 == 8 || b7 == 48) && (i.a[this.aP][this.aQ] & 0xFF) != 0x23) {
                        int a2 = 0;
                        if (i.e != null) {
                            a2 = a(i.e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                        }
                        if (!this.j || (a2 == 0 && a2 != 3)) {
                            if ((this.aS & 0x8) == 0x0 && i.a[0].f != 11 && i.a[0].f != 10 && i.a[0].f != 12) {
                                this.n(11);
                            }
                            this.a = true;
                            if (this.a <= 0) {
                                this.a = 40;
                                this.b = 0L;
                                this.a((int)i.i[8], 32, 0);
                                return;
                            }
                        }
                    }
                }
                if (a) {
                    this.w = false;
                    break Label_2483;
                }
                if (!b || (i.aN & 0x1F) != 0x0) {
                    break Label_2483;
                }
                boolean b8 = i.a[this.aP][this.aQ - 1] == 0;
                for (int n17 = 1; !b8 && n17 <= 4; b8 |= this.a((int)i.g[n17], (int)i.g[n17 + 8], true), ++n17) {}
                if (b8) {
                    break Label_2483;
                }
                if (this.w) {
                    this.n(19);
                    break Label_2483;
                }
                this.w = true;
                break Label_2483;
            }
            else {
                if (this.v && this.aR <= 0) {
                    i i4;
                    byte k2;
                    if (this.au) {
                        i4 = this;
                        k2 = this.p;
                    }
                    else {
                        i4 = this;
                        k2 = this.q;
                    }
                    i4.k = k2;
                    this.aS = ((this.aS & 0xFFFFFFF8) | this.k);
                    this.aP += -i.g[this.k];
                    this.aQ += -i.g[this.k + 8];
                    b = this.b();
                    this.aR = 18;
                    if (i.a[0].f != 4) {
                        this.n(4 + this.k - 1);
                    }
                }
                if ((this.aS & 0x70) > 32 && (this.aS & 0x800) == 0x0) {
                    break Label_2483;
                }
                this.aR -= 6;
                if (this.aR > 0) {
                    break Label_2483;
                }
                this.aS &= 0xFFFFEF8F;
                i2 = this;
                ar = 0;
            }
            i2.aR = ar;
        }
        if (this.cl == 0) {
            if (this.C) {
                this.ck = 8;
                if (this.f()) {
                    this.d(this.bS, this.bT, 5);
                    this.C = false;
                }
            }
            else if (this.a == null) {
                if (i.ak && this.k != 0) {
                    i.ak = false;
                    this.am = 0;
                }
                if (!i.ak) {
                    this.c();
                }
            }
            else {
                this.ar = this.at;
                this.as = this.au;
            }
        }
        if (this.k != 0 && b) {
            this.l = (i.a[this.aP][this.aQ + 1] >= 0);
        }
        this.bm();
        if (this.v && (this.aP < -5 || this.aP > this.av + 5 || this.aQ < -5 || this.aQ > this.aw + 5)) {
            this.z();
            if (this.au || this.aq >= this.dM) {
                this.bs = 0;
                this.br = 12;
                i.l = 35;
            }
            else {
                i.l = 20;
                this.bs = 0;
                this.bh();
                this.N();
                e(6, this.bb);
                this.E();
            }
            this.g();
            this.aM = -1;
        }
    }
    
    private byte a(int n, final int n2, final int n3, final int n4) {
        int n5 = n + n2;
        if (((n > 0 && n3 == 0) || (n < n3 && n3 > 0)) && (i.a[n5][n4] < 0 || i.a[n5][n4] == 31 || d(n5, n4) >= 0)) {
            do {
                n = n5;
                n5 += n2;
            } while (((n > 0 && n3 == 0) || (n < n3 && n3 > 0)) && (i.a[n5][n4] < 0 || d(n5, n4) >= 0 || i.a[n5][n4] == 31));
        }
        return (byte)n;
    }
    
    private static boolean a(final int n, final int n2) {
        if (i.e == null) {
            return false;
        }
        for (int i = 0; i < i.e.length; i += 3) {
            if (i.e[i + 2] == n2) {
                if (i.e[i + 0] - 1 == n || i.e[i + 1] + 1 == n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void bf() {
        final int n = this.av - 1;
        for (int i = 0; i < i.e.length; i += 3) {
            final byte b;
            if ((b = i.e[i + 2]) > 0) {
                final byte b2 = i.e[i + 1];
                final byte b3 = i.e[i + 0];
                final byte[] e = i.e;
                final int n2 = i + 0;
                final byte a = this.a((int)b3, -1, 0, (int)b);
                e[n2] = a;
                final byte b4 = a;
                final byte[] e2 = i.e;
                final int n3 = i + 1;
                final byte a2 = this.a((int)b2, 1, n, (int)b);
                e2[n3] = a2;
                for (byte b5 = a2, b6 = b4; b6 <= b5; ++b6) {
                    this.b((int)b6, (int)b);
                }
            }
        }
    }
    
    private boolean b(final int n, final int n2) {
        final int d = d(n, n2);
        int n3 = 0;
        if (d >= 0) {
            if (d == 37 && i.a[n][n2] == 43) {
                n3 = 268435456;
            }
            q(n, n2);
            i.a[n][n2] = 9;
            i.b[n][n2] = ((i.b[n][n2] & 0xF03FFFFF) | d << 22 | n3);
            this.d(n, n2, 1);
        }
        final g g = i.a[((this.aS & 0x4000) == 0x0) ? 0 : 3];
        if (this.d(n, n2) && this.aT <= 0 && g.f != 40 && g.f != 48) {
            if (g.f != 47) {
                this.a(0, 16, 0);
            }
        }
        return d >= 0;
    }
    
    private static int d(final int n, final int n2) {
        if (i.a[n][n2] < 0) {
            return -1;
        }
        switch (i.a[n][n2]) {
            case 1: {
                return 34;
            }
            case 45: {
                return 35;
            }
            case 19:
            case 43: {
                return 37;
            }
            case 46: {
                return 36;
            }
            case 49: {
                return 39;
            }
            default: {
                return -1;
            }
        }
    }
    
    private void bg() {
        final int am = this.aM;
        final a a = i.a[41];
        final Graphics a2;
        (a2 = this.a).setColor(2496263);
        a2.fillRect(0, 0, 240, 320);
        switch (am) {
            case 5: {
                if (this.bd == 0) {
                    if ((this.u & 0x20) != 0x0) {
                        a2.drawImage(i.a[5][0], 200, 237, 0);
                        final a a3;
                        if (am == 5 && i.aN < (a3 = i.a[9]).a(0) * 2) {
                            a3.a(a2, 0, i.aN * 2, 200, 237, 0, 0, 0);
                        }
                    }
                    a2.drawImage(i.a[28][0], 180, 254, 0);
                }
            }
            case 4: {
                int n;
                if (am != 4 || (n = -100 + i.aN * 10) > 0) {
                    n = 0;
                }
                i.a[0].a.a(a2, 12, 0, 7 + n, 243, 0, 0, 0);
                a.b(a2, i.a[44], 120, 243, 17);
                a.b(a2, String.valueOf(this.bd), 120, 255, 17);
                if (this.bc == 0) {
                    if ((this.u & 0x10) != 0x0) {
                        a2.drawImage(i.a[5][0], 200, 179, 0);
                        final a a4;
                        if (am == 4 && i.aN < (a4 = i.a[9]).a(0) * 2) {
                            a4.a(a2, 0, i.aN >> 1, 200, 179, 0, 0, 0);
                        }
                    }
                    a2.drawImage(i.a[28][0], 180, 196, 0);
                }
            }
            case 3: {
                int n2;
                if (am != 3 || (n2 = -100 + i.aN * 10) > 0) {
                    n2 = 0;
                }
                i.a[0].a.a(a2, 10, 0, 7 + n2, 189, 0, 0, 0);
                a.b(a2, i.a[43], 120, 185, 17);
                a.b(a2, String.valueOf(this.bc), 120, 197, 17);
                if (this.bb == this.ba) {
                    if ((this.u & 0x8) != 0x0) {
                        a2.drawImage(i.a[5][0], 200, 121, 0);
                        final a a5;
                        if (am == 3 && i.aN < (a5 = i.a[9]).a(0) * 2) {
                            a5.a(a2, 0, i.aN >> 1, 200, 121, 0, 0, 0);
                        }
                    }
                    a2.drawImage(i.a[28][0], 180, 138, 0);
                }
            }
            case 2: {
                int n3;
                if (am != 2 || (n3 = -100 + i.aN * 10) > 0) {
                    n3 = 0;
                }
                i.a[a(3)].a(a2, 0, 7 + n3, 127, 0, 0, 0);
                a.b(a2, i.a[114], 120, 127, 17);
                a.b(a2, this.bb + "/" + this.ba, 120, 139, 17);
                if (this.aZ == this.aY) {
                    if ((this.u & 0x4) != 0x0) {
                        a2.drawImage(i.a[5][0], 200, 63, 0);
                        final a a6;
                        if (am == 2 && i.aN < (a6 = i.a[9]).a(0) >> 1) {
                            a6.a(a2, 0, i.aN * 2, 200, 63, 0, 0, 0);
                        }
                    }
                    a2.drawImage(i.a[28][0], 180, 80, 0);
                }
            }
            case 1: {
                int n4;
                if (am != 1 || (n4 = -100 + i.aN * 10) > 0) {
                    n4 = 0;
                }
                i.a[a(2)].a(a2, 0, 7 + n4, 69, 0, 0, 0);
                a.b(a2, i.a[109], 120, 69, 17);
                int az;
                if (am != 1 || (az = i.aN >> 1) > this.aZ) {
                    az = this.aZ;
                }
                a.b(a2, az + "/" + this.aY, 120, 81, 17);
            }
            case 0: {
                int n6 = 0;
                int n5 = 0;
                Label_0963: {
                    if (am == 0) {
                        n5 = (n6 = -100 + i.aN * 10) - 240;
                        if (n6 > 0) {
                            n6 = 0;
                        }
                        if (n5 <= 0) {
                            break Label_0963;
                        }
                    }
                    else {
                        n6 = 0;
                    }
                    n5 = 0;
                }
                a.a(a2, i.a[i.g[this.ap][this.aq]], 120 + n6, 10, 17);
                a.a(a2, i.a[41], 120 + n5, 25, 17);
                break;
            }
        }
        i.a[41].a(this.a, i.a[(this.aM == 5) ? 98 : 53], 5, 318, 36);
    }
    
    public static int a(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8;
    }
    
    public static int b(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24;
    }
    
    private static int e(final int n, final int n2) {
        int n3;
        if ((n3 = a(i.i, n) + n2) < 0) {
            n3 = 0;
        }
        i.i[n] = (byte)(n3 & 0xFF);
        i.i[n + 1] = (byte)(n3 >> 8 & 0xFF);
        return n3;
    }
    
    private void bh() {
        for (int i = 0; i < this.X; ++i) {
            this.a(this.ap, this.aq, i.d[i << 1] & 0xFF, i.d[(i << 1) + 1] & 0xFF);
        }
    }
    
    private int d() {
        return e(4, this.aZ);
    }
    
    private int e() {
        return e(6, this.bb);
    }
    
    private void q(final int n) {
        switch (n) {
            case 0: {
                i.dg = 0;
                i.dh = 0;
                i.di = 0;
                this.t = this.a(this.ap, this.aq);
                this.u = 0;
            }
            case 1: {
                i.dg = a(i.i, 4);
                i.dg += this.aZ;
                this.s = false;
            }
            case 2: {
                i.i[4] = (byte)(i.dg & 0xFF);
                i.i[5] = (byte)(i.dg >> 8 & 0xFF);
            }
            case 3: {
                i.dh = a(i.i, 6);
                i.dh += this.bb;
            }
            case 4: {
                i.i[6] = (byte)(i.dh & 0xFF);
                i.i[7] = (byte)(i.dh >> 8 & 0xFF);
            }
            case 5: {
                i.di = i.i[2];
                this.J = 0;
                if ((i.di & 0x8) == 0x0 && i.dh >= f.b[1]) {
                    this.J = 1;
                    return;
                }
                if ((i.di & 0x10) == 0x0 && i.dh >= f.b[2]) {
                    this.J = 2;
                    return;
                }
                break;
            }
            case 6: {
                try {
                    i.a[28] = a("/ui.f", 4);
                }
                catch (Exception ex) {}
            }
            case 7: {
                this.a(this.ap, this.aq, (byte)2);
                this.K = 0;
            }
            case 8: {
                int k;
                int n2;
                for (n2 = (k = (i.di & 0xE0) >> 5); k < 4 && i.dg >= f.a[k]; ++k) {}
                if (n2 < k) {
                    final byte[] i = i.i;
                    final int n3 = 2;
                    i[n3] &= (byte)(-225);
                    final byte[] j = i.i;
                    final int n4 = 2;
                    j[n4] |= (byte)(k << 5 & 0xE0);
                    this.G();
                    this.K = k;
                }
            }
            case 9: {
                this.bh();
            }
            case 10: {
                this.g();
                System.gc();
            }
            case 11: {
                if (this.ao < 99 && this.aZ == this.aY && (this.t & 0x4) == 0x0) {
                    this.a(this.ap, this.aq, (byte)4);
                    this.u |= 0x4;
                    ++this.ao;
                }
                if (this.ao < 99 && this.bb == this.ba && (this.t & 0x8) == 0x0) {
                    this.a(this.ap, this.aq, (byte)8);
                    this.u |= 0x8;
                    ++this.ao;
                }
                if (this.ao < 99 && this.bc == 0 && (this.t & 0x10) == 0x0) {
                    this.a(this.ap, this.aq, (byte)16);
                    this.u |= 0x10;
                    ++this.ao;
                }
                if (this.ao < 99 && this.bd == 0 && (this.t & 0x20) == 0x0) {
                    this.a(this.ap, this.aq, (byte)32);
                    this.u |= 0x20;
                    ++this.ao;
                }
                this.bj();
                this.E();
                this.H = false;
                this.G = true;
                break;
            }
        }
    }
    
    private void bi() {
        switch (this.aM) {
            case 0: {
                if (i.aN > 40 || this.s) {
                    ++this.aM;
                    this.g();
                    return;
                }
                break;
            }
            case 1: {
                if ((i.aN > this.aZ << 1 && i.aN > 40) || this.s) {
                    ++this.aM;
                    this.g();
                    return;
                }
                break;
            }
            case 2: {
                if (i.aN > 40 || this.s) {
                    ++this.aM;
                    this.g();
                    return;
                }
                break;
            }
            case 3: {
                if (i.aN > 10 || this.s) {
                    ++this.aM;
                    this.g();
                    return;
                }
                break;
            }
            case 4: {
                if (i.aN > 10 || this.s) {
                    ++this.aM;
                    this.g();
                    this.s = false;
                    break;
                }
                break;
            }
        }
    }
    
    private long a(final int n) {
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                final long n2;
                if ((n2 = i.a[i][j]) != 0L && a(n2, (byte)6, (byte)5) == n) {
                    return n2;
                }
            }
        }
        return -1L;
    }
    
    private void bj() {
        final long a = this.a(this.aq);
        if ((this.aq == 0 || a(a, (byte)11, (byte)3) > 1) && a >= 0L && (this.a(this.ap, this.aq + 1) & 0x40) == 0x0) {
            i.eb = this.aq + 1;
            this.a(this.ap, i.eb, (byte)64);
            this.ab = true;
            return;
        }
        i.eb = this.aq;
    }
    
    private void bk() {
        this.ct();
    }
    
    private void d(final int n, final int n2, final int n3) {
        final int n4 = this.T << 1;
        i.a[n4] = (byte)n;
        i.a[n4 + 1] = (byte)n2;
        i.c[this.T] = (byte)n3;
        i.b[this.T] = 0;
        this.T = (this.T + 1 & 0x7);
    }
    
    private void bl() {
        --this.ao;
        ++this.bd;
        if (this.ao >= 0) {
            this.cg();
            this.n = i.i[8];
            this.B();
            this.aS = 0;
            this.aT = 0;
            final byte b = 0;
            this.k = b;
            this.j = b;
            return;
        }
        i.l = 12;
    }
    
    private void r(final int n) {
        if (n < 0) {
            return;
        }
        final byte b = i.q[n];
        final byte b2 = i.r[n];
        final int n2 = i.a[b][b2] & 0xFF;
        final int n3;
        if (((n3 = i.a[b][b2] >> 8) & 0xF0) != 0x0) {
            return;
        }
        if (n2 != 7 || (n3 & 0xFF00) >> 8 != n) {
            System.out.println("!!!!!!!!!!!!!! door missing");
        }
        int n4 = n3 & 0xF;
        int n5;
        if (--n4 == 0) {
            n5 = ((n3 & 0xFFFFFF0F) | 0x10);
            this.a(b, b2 - 1, 1, 0, 1);
            this.a(b, b2 - 1, -1, 0, 1);
            i.a[b][b2 - 1] = ((i.a[b][b2 - 1] >> 8 | 0x200) << 8 | (i.a[b][b2 - 1] & 0xFF));
            i.c[b][b2] = 24;
        }
        else {
            n5 = ((n3 & 0xFFFFFFF0) | n4);
        }
        i.a[b][b2] = (n5 << 8 | n2);
        this.C(8);
    }
    
    private static void i(final int n, final int n2) {
        final int n3;
        if (((n3 = i.a[n][n2] >> 8) & 0xF0) == 0x0) {
            i.a[n][n2] = ((n3 | 0x10) << 8 | 0x7);
            i.c[n][n2] = 24;
        }
    }
    
    private void j(final int n, final int n2) {
        final int n3 = i.a[n][n2] >> 8;
        if ((i.a[n][n2] & 0xFF) != 0x7) {
            return;
        }
        if ((n3 & 0xF0) == 0x0) {
            return;
        }
        if (i.a[n][n2] == 32) {
            return;
        }
        this.C(14);
        i.a[n][n2] = ((n3 & 0xFFFFFF0F) << 8 | 0x7);
        this.a(n, n2 - 1, 1, 0, 0);
        this.a(n, n2 - 1, -1, 0, 0);
        if (this.d(n, n2)) {
            this.b = 0L;
            this.bi = 0;
            this.a((int)i.i[8], 48, 0);
            this.C(2);
        }
        else {
            switch (i.a[n][n2]) {
                case 0:
                case 1:
                case 19:
                case 43:
                case 45: {
                    i.a[n][n2] = -1;
                    this.b(n, n2);
                    this.p(n, n2);
                    break;
                }
            }
        }
        i.c[n][n2] = 24;
    }
    
    private void s(final int n) {
        if (n < 0) {
            return;
        }
        this.j((int)i.q[n], (int)i.r[n]);
    }
    
    private void bm() {
        final int n = ((this.aS & 0x4000) == 0x0) ? 0 : 3;
        final g g = i.a[n];
        int n2 = -1;
        boolean b = true;
        boolean b2 = false;
        final boolean a;
        if (a = g.a()) {
            this.aS &= 0xFFFFDFFF;
        }
        Label_1270: {
            int n3 = 0;
            Label_1269: {
                if (n == 3) {
                    if (!a) {
                        break Label_1270;
                    }
                    this.aS &= 0xFFFFB7FF;
                    n3 = this.f();
                }
                else {
                    int n4 = 0;
                    switch (g.f) {
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46: {
                            if (a) {
                                n2 = 0 + (this.aS & 0x7) - 1;
                                final byte b3 = 0;
                                this.j = b3;
                                this.k = b3;
                                this.aR = 0;
                                i.W = 0;
                            }
                            break Label_1270;
                        }
                        case 1:
                        case 3: {
                            if (a) {
                                n2 = 0 + (this.aS & 0x7) - 1;
                            }
                            b2 = true;
                            break Label_1270;
                        }
                        case 36:
                        case 37:
                        case 38:
                        case 39: {
                            if (a) {
                                n4 = 4;
                                break;
                            }
                            break Label_1270;
                        }
                        case 47: {
                            this.aR = 0;
                            final byte b4 = 0;
                            this.k = b4;
                            this.j = b4;
                            if ((i.aN & 0x1) == 0x0) {
                                int n5 = this.aP - 2 + i.aN % 5;
                                final int n6 = this.aQ - 2 + i.aN % 3;
                                if (n5 == this.aP && (n6 == this.aQ || n6 == this.aQ - 1)) {
                                    n5 += (((i.aN >> 1 & 0x1) == 0x0) ? 1 : -1);
                                }
                                this.d(n5, n6, i.aN * 3 % 5);
                            }
                            if (a) {
                                n2 = 0 + (this.aS & 0x7) - 1;
                                final int aa = -1;
                                this.aC = aa;
                                this.aB = aa;
                                this.aA = aa;
                            }
                            break Label_1270;
                        }
                        case 40:
                        case 48: {
                            this.aR = 0;
                            final byte b5 = 0;
                            this.k = b5;
                            this.j = b5;
                            if (g.h == 0) {
                                if (g.g == ((g.f == 40) ? 12 : 6)) {
                                    this.C(4);
                                }
                                if (g.g == ((g.f == 40) ? 13 : 6)) {
                                    this.bQ();
                                }
                            }
                            if (g.a()) {
                                this.k = System.currentTimeMillis();
                                n2 = 0 + (this.aS & 0x7) - 1;
                                final int aa2 = -1;
                                this.aC = aa2;
                                this.aB = aa2;
                                this.aA = aa2;
                            }
                            break Label_1270;
                        }
                        case 35: {
                            b2 = true;
                            n3 = 35;
                            break Label_1269;
                        }
                        case 34: {
                            b2 = true;
                            n3 = 34;
                            break Label_1269;
                        }
                        case 0: {
                            b2 = true;
                            n3 = 0;
                            break Label_1269;
                        }
                        case 2: {
                            b2 = true;
                            n3 = 2;
                            break Label_1269;
                        }
                        case 9: {
                            if (!this.l) {
                                n3 = 27;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 8: {
                            if (!this.l) {
                                n3 = 26;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 27: {
                            if (!this.l) {
                                n3 = 9;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 26: {
                            if (!this.l) {
                                n3 = 8;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 4:
                        case 6: {
                            if (this.l) {
                                n3 = g.f;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 5: {
                            if (!this.l) {
                                n3 = 24;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 7: {
                            if (!this.l) {
                                n3 = 25;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 24: {
                            if (this.l) {
                                n3 = 5;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 25: {
                            if (this.l) {
                                n3 = 7;
                                break Label_1269;
                            }
                            break Label_1270;
                        }
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 30:
                        case 31:
                        case 32:
                        case 33: {
                            if (a) {
                                b = false;
                                i.W = 0;
                            }
                            break Label_1270;
                        }
                        case 19: {
                            if (a) {
                                b = false;
                                this.bl();
                            }
                            break Label_1270;
                        }
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 28:
                        case 29: {
                            if (a) {
                                i.W = 0;
                                this.k = 0;
                                this.aR = 0;
                                n4 = 0;
                                break;
                            }
                            if ((this.aS & 0x2000) == 0x0 && g.g == 2 && g.h == 0) {
                                final int n7 = this.aP - i.g[this.aS & 0x7];
                                final int n8 = this.aQ - i.g[(this.aS & 0x7) + 8];
                                if (i.i[9] >= 8 && g.g == 2 && g.h == 0) {
                                    this.d(n7, n8, -1);
                                }
                                this.f(n7, n8);
                                this.j = 0;
                                i.W = 0;
                            }
                            break Label_1270;
                        }
                        case 11: {
                            if (i.a[this.aP][this.aQ - 1] == -1) {
                                n4 = 0;
                                break;
                            }
                            if (a && i.a[this.aP][this.aQ - 1] != -1) {
                                this.b = 0L;
                                this.a((int)i.i[8], 32, 0);
                            }
                            break Label_1270;
                        }
                        case 17:
                        case 18: {
                            if (a) {
                                n2 = 0 + (this.aS & 0x7) - 1;
                                this.aR = 0;
                                break Label_1270;
                            }
                            if (g.g > 0 && this.aA != -1) {
                                final int n9 = ((this.aS & 0x7) == 0x2) ? (this.aP + 1) : (this.aP - 1);
                                final int n10 = i.a[n9][this.aQ] >> 8;
                                final int n11 = i.a[n9][this.aQ] & 0xFF;
                                final int n12 = n10 | 0x100;
                                if (n11 == 9) {
                                    --this.aU;
                                }
                                else {
                                    --this.aV;
                                }
                                i.a[n9][this.aQ] = (n12 << 8 | n11);
                                this.r(n12 & 0xFF);
                                final int n13 = -1;
                                this.aC = n13;
                                this.aA = n13;
                            }
                            break Label_1270;
                        }
                        case 10: {
                            if (a) {
                                this.aS &= 0xFFFFF7FF;
                                n3 = this.f();
                                break Label_1269;
                            }
                            this.b = 40L;
                            break Label_1270;
                        }
                        case 12: {
                            if (this.bl < 160) {
                                this.bl += 12;
                            }
                            break Label_1270;
                        }
                        default: {
                            n4 = 36;
                            break;
                        }
                    }
                    n3 = n4 + (this.aS & 0x7) - 1;
                }
            }
            n2 = n3;
        }
        i i;
        int am;
        if (b2) {
            i = this;
            am = this.am - 1;
        }
        else {
            i = this;
            am = 70;
        }
        i.am = am;
        if (n2 != -1) {
            this.n(n2);
        }
        if (b) {
            g.b();
        }
        this.b = ((this.b > 0) ? (--this.b) : 0);
    }
    
    private int f() {
        int n;
        if (this.n <= 0) {
            this.C(2);
            n = 12;
            this.aW = 80;
        }
        else {
            n = 0 + (this.aS & 0x7) - 1;
            this.aS = ((this.aS & 0xFFFFFF8F) | 0x0);
            this.b = 40L;
        }
        this.k = 0;
        return n;
    }
    
    private static void t(final int n) {
        if (i.k) {
            i.a.a.vibrate(n);
        }
    }
    
    private void bn() {
        if (this.o <= 0) {
            final int n = (this.bi > 0) ? 1 : -1;
            this.bi -= n;
            if (this.bi != 0) {
                if (i.a[this.bg][this.bh] == 48) {
                    final int n2 = this.bh + (((i.b[this.bg][this.bh] & 0x8) == 0x0) ? -1 : 1);
                    if (i.a[this.bg + n][n2] >= 0) {
                        int ap = this.aP;
                        while (true) {
                            final int n3 = ap - n;
                            if (i.a[n3][this.aQ] != 32) {
                                break;
                            }
                            i.a[n3][this.aQ] = -1;
                            ap = n3;
                        }
                        this.bi = 0;
                        return;
                    }
                    i.a[this.bg + n][n2] = i.a[this.bg][n2];
                    i.a[this.bg][n2] = -1;
                    i.b[this.bg + n][n2] = i.b[this.bg][n2];
                    i.b[this.bg][n2] = this.o;
                }
                i.a[this.bg + n][this.bh] = i.a[this.bg][this.bh];
                i.a[this.bg][this.bh] = -1;
                this.b(this.bg, this.bh);
                this.bg += n;
                i.b[this.bg][this.bh] = (this.be | Integer.MIN_VALUE);
                this.o = 18;
                i.b[this.bg][this.bh] = this.o;
            }
            else {
                if (i.a[this.bg][this.bh] == 48) {
                    i.b[this.bg][this.bh + (((i.b[this.bg][this.bh] & 0x8) == 0x0) ? -1 : 1)] = 0;
                }
                else {
                    i.b[this.bg][this.bh] = this.bf;
                }
                i.b[this.bg][this.bh] = 0;
                this.bf = -1;
                this.c(this.bg, this.bh);
            }
            q(this.bg - n, this.bh);
            return;
        }
        this.o -= 6;
        i.b[this.bg][this.bh] = this.o;
        if ((this.bi == 1 || this.bi == -1) && this.o <= 6 && (this.aS & 0x70) == 0x0) {
            this.n(((this.aS & 0x7) == 0x4) ? 23 : 21);
        }
    }
    
    private void bo() {
        final int n;
        i i;
        int ai;
        if ((n = i.aN % 89) < 15) {
            i = this;
            ai = 0;
        }
        else if (n < 45) {
            i = this;
            ai = 48 * (n - 15) / 30;
        }
        else if (n < 60) {
            i = this;
            ai = 48;
        }
        else {
            i = this;
            ai = 48 - 48 * (n - 60) / 30;
        }
        i.aI = ai;
        this.aJ = ((this.aI > 0) ? ((this.aI - 1) / 24 + 2) : 1);
        final int n2;
        i j;
        int ak;
        if ((n2 = i.aN % 44) < 7) {
            j = this;
            ak = 0;
        }
        else if (n2 < 22) {
            j = this;
            ak = 48 * (n2 - 7) / 15;
        }
        else if (n2 < 30) {
            j = this;
            ak = 48;
        }
        else {
            j = this;
            ak = 48 - 48 * (n2 - 30) / 15;
        }
        j.aK = ak;
        this.aL = ((this.aK > 0) ? ((this.aK - 1) / 24 + 2) : 1);
    }
    
    private void bp() {
        int n = i.k[this.ax << 1] - this.aP;
        int n2 = i.k[(this.ax << 1) + 1] - this.aQ;
        if (this.i == 2 && this.ax == 2) {
            n = 10;
            n2 = -8;
        }
        i i;
        int ac;
        if (n2 == 0) {
            if (n < 0) {
                i = this;
                ac = 12;
            }
            else {
                i = this;
                ac = 4;
            }
        }
        else if (n == 0) {
            if (n2 < 0) {
                i = this;
                ac = 0;
            }
            else {
                i = this;
                ac = 8;
            }
        }
        else {
            final int n3;
            if ((n3 = n * 128 / n2) > 0) {
                if (n3 < 128) {
                    if (n > 0) {
                        i = this;
                        ac = 7;
                    }
                    else {
                        i = this;
                        ac = 15;
                    }
                }
                else if (n3 > 128) {
                    if (n > 0) {
                        i = this;
                        ac = 5;
                    }
                    else {
                        i = this;
                        ac = 13;
                    }
                }
                else if (n > 0) {
                    i = this;
                    ac = 6;
                }
                else {
                    i = this;
                    ac = 14;
                }
            }
            else if (n3 > -128) {
                if (n < 0) {
                    i = this;
                    ac = 9;
                }
                else {
                    i = this;
                    ac = 1;
                }
            }
            else if (n3 < -128) {
                if (n < 0) {
                    i = this;
                    ac = 11;
                }
                else {
                    i = this;
                    ac = 3;
                }
            }
            else if (n < 0) {
                i = this;
                ac = 10;
            }
            else {
                i = this;
                ac = 2;
            }
        }
        i.ac = ac;
    }
    
    private void bq() {
        switch (this.i) {
            case 2: {
                this.bA();
                this.br();
            }
            case 1: {
                this.bz();
            }
            case 3: {
                this.by();
            }
            case 4: {
                this.bu();
            }
            case 5: {
                this.bs();
                break;
            }
        }
    }
    
    private void br() {
        if (this.d(61, 3) && this.aR == 6) {
            this.d(this.aP, this.aQ, 5);
            this.c = false;
        }
        if (this.a == null && (this.d(60, 3) || this.d(61, 3))) {
            this.b(true);
            this.M = true;
            this.cs();
            this.A();
            this.ap = 0;
            this.aq = 0;
            this.t();
        }
        if (this.aD == 2) {
            i.a[11][50] = -1;
        }
    }
    
    private void k(final int n, final int n2) {
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                if (this.d((this.ar + n) / 24 + j, (this.as + n2) / 24 + i)) {
                    this.a(1, 48, 0);
                }
            }
        }
    }
    
    private void bs() {
        final g g = i.a[5];
        g g2;
        if (this.ad == 12) {
            if (this.ae++ > 100) {
                this.ad = 15;
                this.p(11, 11);
            }
            else {
                this.a.b(7);
            }
            g2 = g;
        }
        else if (this.ad == -1) {
            if (this.aP * 24 >= 360) {
                g.a(this.ad = 10);
            }
            return;
        }
        else {
            if (this.ad == 15 || this.ad == -1) {
                return;
            }
            int n = -1;
            final int n2 = this.aP * 24 + 12;
            final int n3 = this.aQ * 24;
            final int n4 = this.ai + 24;
            if (this.ad == 13) {
                n = 13;
                if (n2 > n4) {
                    this.ad = true;
                }
            }
            int n5 = 0;
            Label_0192: {
                if (this.af > 0) {
                    if (i.aN % this.af == 0) {
                        n5 = 2;
                        break Label_0192;
                    }
                }
                n5 = 1;
            }
            int n6 = n5;
            if (this.ad == 6 || this.ad == 7) {
                n6 = (((i.aN & 0xB) == 0x0) ? 2 : n6);
            }
            if (!this.ac && (this.ad == 0 || this.ad == 1)) {
                i i;
                int dj;
                if (this.ad == 0) {
                    this.dj = 36;
                    this.dj ^= -1;
                    i = this;
                    dj = this.dj + 1;
                }
                else {
                    i = this;
                    dj = 36;
                }
                i.dj = dj;
                if (n3 < 504 && (n2 == n4 + this.dj || i.aN % 76 == 0)) {
                    this.ac = true;
                }
            }
            while (n6-- > 0) {
                Label_1099: {
                    switch (this.ad) {
                        case 13: {
                            if (g.a()) {
                                n = (this.ad = 0);
                                this.ad = false;
                                break Label_1099;
                            }
                            if (this.ad) {
                                g.b();
                            }
                            break Label_1099;
                        }
                        case 4:
                        case 5: {
                            if (g.a()) {
                                n = (this.ad = ((this.ad != 4) ? 1 : 0));
                            }
                            this.ac = false;
                            this.dj = 0;
                            break Label_1099;
                        }
                        case 10:
                        case 11: {
                            Label_0523: {
                                i j;
                                int n7;
                                int ad;
                                if (n2 > n4 && n4 < 504) {
                                    j = this;
                                    ad = (n7 = 1);
                                }
                                else {
                                    if (n2 >= n4 || n4 <= 360) {
                                        break Label_0523;
                                    }
                                    j = this;
                                    ad = (n7 = 0);
                                }
                                n = n7;
                                j.ad = ad;
                            }
                            this.ac = false;
                            this.dj = 0;
                            break Label_1099;
                        }
                        case 6: {
                            if (n3 >= 504) {
                                if (n2 >= n4 - 48) {
                                    n = (this.ad = 8);
                                    break Label_1099;
                                }
                                this.ai -= 2;
                                break Label_1099;
                            }
                            else {
                                if (n4 >= 360) {
                                    n = (this.ad = 0);
                                }
                                break Label_1099;
                            }
                            break;
                        }
                        case 7: {
                            if (n3 >= 504) {
                                if (n2 <= n4 + 48) {
                                    n = (this.ad = 9);
                                    break Label_1099;
                                }
                                this.ai += 2;
                                break Label_1099;
                            }
                            else {
                                if (n4 <= 504) {
                                    n = (this.ad = 1);
                                }
                                break Label_1099;
                            }
                            break;
                        }
                        case 0: {
                            if (n3 >= 504 && n4 > 360) {
                                if (n2 < n4) {
                                    n = (this.ad = 6);
                                    break Label_1099;
                                }
                                --this.ai;
                                break Label_1099;
                            }
                            else {
                                if (this.ac) {
                                    n = (this.ad = 2);
                                    break Label_1099;
                                }
                                if (n4 <= 360) {
                                    n = (this.ad = 1);
                                    break Label_1099;
                                }
                                --this.ai;
                                break Label_1099;
                            }
                            break;
                        }
                        case 1: {
                            if (n3 >= 504 && n4 < 504) {
                                if (n2 < n4) {
                                    ++this.ai;
                                    break Label_1099;
                                }
                                n = (this.ad = 7);
                                break Label_1099;
                            }
                            else {
                                if (this.ac) {
                                    n = (this.ad = 3);
                                    break Label_1099;
                                }
                                if (n4 >= 504) {
                                    n = (this.ad = 0);
                                    break Label_1099;
                                }
                                ++this.ai;
                                break Label_1099;
                            }
                            break;
                        }
                        case 8: {
                            if (g.a()) {
                                n = (this.ad = 10);
                            }
                            if (g.g >= 4 && n3 >= 504 && n2 >= n4 - 48 && n2 <= n4) {
                                break;
                            }
                            break Label_1099;
                        }
                        case 9: {
                            if (g.a()) {
                                n = (this.ad = 11);
                            }
                            if (g.g >= 4 && n3 >= 504 && n2 >= n4 && n2 <= n4 + 48) {
                                break;
                            }
                            break Label_1099;
                        }
                        case 3: {
                            if (g.g == 5 && g.h == 0) {
                                this.bj = 30;
                            }
                            if (g.a()) {
                                n = (this.ad = 11);
                                this.ac = false;
                                this.dj = 0;
                            }
                            if (g.g >= 7 && n3 < 504 && n2 == n4 + this.dj) {
                                break;
                            }
                            break Label_1099;
                        }
                        case 2: {
                            if (g.g == 5 && g.h == 0) {
                                this.bj = 30;
                            }
                            if (g.a()) {
                                n = (this.ad = 10);
                                this.ac = false;
                                this.dj = 0;
                            }
                            if (g.g >= 7 && n3 < 504 && n2 == n4 + this.dj) {
                                break;
                            }
                            break Label_1099;
                        }
                    }
                    this.a(1, 48, 0);
                }
                if (n3 >= 504 && n2 >= n4 - 24 && n2 <= n4 - 24) {
                    this.a(1, 48, (int)i.h[this.aS & 0x7]);
                }
            }
            if ((this.ad == 8 || this.ad == 9) && g.g == 5) {
                this.bw();
            }
            if (this.ad != 6 && this.ad != 7) {
                for (int k = 21; k < 23; ++k) {
                    for (int l = n4 / 24 - 1; l < n4 / 24 - 2 + 4; ++l) {
                        if (i.a[l][k] == 0) {
                            Label_1352: {
                                if ((i.b[l][k] & 0x7) == 0x3 && this.ad != 13) {
                                    --this.af;
                                    i m = null;
                                    int n8 = 0;
                                    int ad2 = 0;
                                    switch (this.ad) {
                                        case 0:
                                        case 2:
                                        case 4:
                                        case 8:
                                        case 10: {
                                            m = this;
                                            ad2 = (n8 = 4);
                                            break;
                                        }
                                        case 1:
                                        case 3:
                                        case 5:
                                        case 9:
                                        case 11: {
                                            m = this;
                                            ad2 = (n8 = 5);
                                            break;
                                        }
                                        default: {
                                            break Label_1352;
                                        }
                                    }
                                    n = n8;
                                    m.ad = ad2;
                                }
                            }
                            i.a[l][k] = -1;
                            this.b(l, k);
                            i.a[l][k] = 30;
                            i.c[l][k] = 24;
                            i.b[l][k] = 4;
                            this.C(14);
                        }
                    }
                }
            }
            if (this.af <= 0) {
                this.ad = 12;
                this.ae = 0;
                n = 12;
            }
            if (n != -1) {
                g.a(n);
                return;
            }
            g2 = g;
        }
        g2.b();
    }
    
    private void bt() {
        final int g = this.g();
        if (this.aP == g || this.aP == g + 1) {
            final g g2;
            final int n = (g2 = i.a[5]).b - 40;
            final int n2 = g2.b + 256;
            final int n3 = (g2.a.f[(g2.a.b[g2.f] + g2.g) * 5 + 3] << 0) * 1 / 1;
            final int n4 = n - n3;
            final int n5 = n2 - n3;
            final int b;
            if ((b = i.a[0].b) > n4 && b < n5 && !this.h) {
                this.a(1, 48, (this.aP == g) ? 4 : 2);
            }
        }
    }
    
    private static void l(final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = -1;
        i.a[n + 1][n2] = -1;
    }
    
    private static void m(final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = 50;
        i.a[n + 1][n2] = 50;
    }
    
    private boolean c(final int n, final int n2) {
        boolean b = false;
        for (int i = n; i <= n + 1; ++i) {
            for (int j = n2; j >= n2 - 1; --j) {
                if (i.a[i][j] == 0) {
                    this.h(i, j);
                    q(i, j);
                    i.a[i][j] = -1;
                    this.b(i, j);
                    b = true;
                }
            }
        }
        return b;
    }
    
    private int g() {
        return 10 + this.ag * (2 + ((this.ag > 0) ? 1 : 0));
    }
    
    private int h() {
        final g g;
        return this.aw * ((g = i.a[5]).b - 40 - (g.a.f[(g.a.b[g.f] + g.g) * 5 + 3] << 0) * 1 / 1 + this.as) / (this.aw * 24);
    }
    
    private boolean d() {
        final int g = this.g();
        final int h = this.h();
        boolean b = false;
        for (int i = g; i <= g + 1; ++i) {
            for (int j = h; j <= 10; ++j) {
                if (i.a[i][j] == 0) {
                    this.h(i, j);
                    q(i, j);
                    i.a[i][j] = -1;
                    this.b(i, j);
                    b = true;
                }
            }
        }
        return b;
    }
    
    private int i() {
        final int n2;
        int n = (n2 = this.aP - 10) / 3;
        if (n2 == n * 3 + 2) {
            n += i.aN % 50 / 25;
        }
        return n;
    }
    
    private void bu() {
        if (this.ad == 5) {
            if (this.Y) {
                return;
            }
            this.Y = true;
        }
        final g g = i.a[5];
        ++this.ae;
        int n = -1;
        final g g2 = i.a[4];
        int n2 = -1;
        final int g3 = this.g();
        if (i.a[this.E][2] == -1) {
            i.a[this.E][2] = 31;
        }
        if (i.a[this.F][2] == -1) {
            i.a[this.F][2] = 31;
        }
        switch (this.ad) {
            case 0: {
                if (this.aP >= 10) {
                    this.ad = 6;
                    this.ae = 0;
                    break;
                }
                break;
            }
            case 6: {
                if (this.ae > 10) {
                    this.ad = 1;
                    n = 2;
                    this.ae = 0;
                    break;
                }
                break;
            }
            case 1: {
                if (this.ae > 40) {
                    this.ad = 2;
                    this.ae = 0;
                    break;
                }
                if (this.ae > 20) {
                    this.c(g3, 8);
                    m(g3, 8);
                    this.B = g3;
                    this.C = 8;
                    break;
                }
                break;
            }
            case 7: {
                l(this.B, this.C);
                this.B = -1;
                this.C = -1;
                if (this.ae > 80) {
                    this.ad = 8;
                    this.bS();
                }
                if ((this.ae & 0x6F) == 0x1) {
                    this.C(7);
                    break;
                }
                break;
            }
            case 3: {
                if (this.ae <= 40) {
                    break;
                }
                if (this.af <= 0) {
                    this.ad = 7;
                    this.ae = 0;
                    break;
                }
                if (this.H == 10) {
                    this.ad = 9;
                    this.ae = 0;
                    break;
                }
                if (this.H == 2 || this.H == 1) {
                    this.ad = 4;
                    this.ae = 0;
                    n = 2;
                    break;
                }
                break;
            }
            case 2: {
                if (this.c(g3, 8)) {
                    --this.af;
                    this.H = this.ad;
                    l(this.B, this.C);
                    this.B = -1;
                    this.C = -1;
                    this.H = this.ad;
                    this.ad = 3;
                    n = 3;
                    this.C(10);
                }
                if (this.ae > 15 && g.f != 6) {
                    n = 6;
                }
                if (this.ae > 30) {
                    this.ad = 4;
                    this.ae = 0;
                    n = 0;
                    l(this.B, this.C);
                    this.B = -1;
                    this.C = -1;
                    break;
                }
                break;
            }
            case 4: {
                final int n3 = (this.af <= 1) ? 5 : 10;
                Label_0631: {
                    int n4;
                    if (this.ae >= n3) {
                        this.ad = 5;
                        this.ae = 0;
                        n4 = 4;
                    }
                    else {
                        if (this.ae <= n3 >> 1 || g.f == 1) {
                            break Label_0631;
                        }
                        n4 = 1;
                    }
                    n = n4;
                }
                this.d();
                this.bt();
                break;
            }
            case 5: {
                if (g.b - 40 - (g.a.f[(g.a.b[g.f] + g.g) * 5 + 3] << 0) * 1 / 1 <= 72 - this.as + 40) {
                    this.I = 0;
                    this.bw();
                    this.ad = 10;
                    this.B = g3;
                    this.C = 4;
                    m(this.B, this.C);
                }
                this.d();
                this.bt();
                break;
            }
            case 9: {
                this.ae -= 2;
                this.bt();
                if (g.b - 40 - (g.a.f[(g.a.b[g.f] + g.g) * 5 + 3] << 0) * 1 / 1 >= 240 - this.as + 40) {
                    this.ad = 6;
                    this.ae = 0;
                    this.ag = this.i();
                    break;
                }
                break;
            }
            case 10: {
                --this.ae;
                this.bt();
                ++this.A;
                if (this.A == 28) {
                    n = 7;
                }
                if (this.A >= 50) {
                    this.A = 0;
                    this.ad = 11;
                    l(this.B, this.C);
                    this.B = -1;
                    this.C = -1;
                    n = 8;
                    n2 = 2;
                    this.i = true;
                    break;
                }
                break;
            }
            case 11: {
                --this.ae;
                ++this.A;
                if (this.A >= 12) {
                    this.A = 0;
                    this.ad = 9;
                    n = 4;
                    this.h = false;
                    this.i = false;
                    break;
                }
                if (!this.h) {
                    this.bv();
                    break;
                }
                break;
            }
        }
        if (n == -1) {
            g.b();
        }
        else {
            g.a(n);
        }
        if (this.i) {
            if (n2 == -1) {
                g2.b();
                return;
            }
            g2.a(n2);
        }
    }
    
    private void bv() {
        final int g = this.g();
        if (this.aQ == 4 && this.aP >= g - 3 && this.aP <= g + 4) {
            this.a(1, 64, (this.aP == g) ? 4 : 2);
            this.h = true;
        }
    }
    
    private void bw() {
        this.bj = 30;
        if (i.a[this.E][this.G] == -1) {
            i.a[this.E][this.D] = 0;
            q(this.E, this.D);
        }
        if (i.a[this.F][this.G] == -1) {
            i.a[this.F][this.D] = 0;
            q(this.F, this.D);
        }
    }
    
    private void bx() {
        this.ad = -1;
        this.af = 5;
    }
    
    private void by() {
        final g g = i.a[5];
        final int be = this.bE;
        final int bf = this.bF;
        final int n = this.aP - 8;
        final int n2 = this.aP + 8;
        final int n3 = this.aQ + 8;
        final int n4 = this.aQ - 8;
        for (int i = 15; i <= 22; ++i) {
            for (int j = 14; j <= 21; ++j) {
                if (j <= n || j >= n2 || i <= n3 || i >= n4) {
                    if (i.a[j][i] == 44) {
                        this.bE = j;
                        this.bF = i;
                        this.bK();
                    }
                }
            }
        }
        this.bE = be;
        this.bF = bf;
        if (this.n == 0) {
            this.bx();
        }
        g g2;
        if (this.ad == 12) {
            if (this.ae++ > 100) {
                this.ad = 15;
                this.p(11, 11);
            }
            else {
                this.a.b(7);
            }
            g2 = g;
        }
        else if (this.ad == -1) {
            if (this.aP * 24 >= 336) {
                g.a(this.ad = 0);
            }
            return;
        }
        else {
            if (this.ad == 15 || this.ad == -1) {
                return;
            }
            int n5 = -1;
            final int n6 = this.aP * 24 + 12;
            final int n7 = this.aQ * 24;
            int n8 = this.ah + 24;
            if (this.l == 0L && this.n != 0) {
                this.l = i.aN + d.a(340, 441);
            }
            int n9 = 0;
            Label_0368: {
                if (this.af > 0) {
                    if (i.aN % this.af == 0) {
                        n9 = 2;
                        break Label_0368;
                    }
                }
                n9 = 1;
            }
            int n10 = n9;
            if (this.ad == 10 || this.ad == 11) {
                n10 = (((i.aN & 0xB) == 0x0) ? 2 : n10);
            }
            while (n10-- > 0) {
                Label_1273: {
                    switch (this.ad) {
                        case 2: {
                            if (!g.a()) {
                                break;
                            }
                            if (i.aN > this.l) {
                                n5 = (this.ad = 13);
                                break;
                            }
                            n5 = (this.ad = 4);
                            break;
                        }
                        case 3: {
                            if (!g.a()) {
                                break;
                            }
                            if (i.aN > this.l) {
                                n5 = (this.ad = 14);
                                break;
                            }
                            n5 = (this.ad = 5);
                            break;
                        }
                        case 0: {
                            if (n8 > 360) {
                                n5 = (this.ad = 4);
                                break;
                            }
                            n5 = (this.ad = 5);
                            break;
                        }
                        case 1: {
                            if (n8 < 504) {
                                n5 = (this.ad = 5);
                                break;
                            }
                            n5 = (this.ad = 4);
                            break;
                        }
                        case 10: {
                            if (!g.a()) {
                                this.ah -= 2;
                                break;
                            }
                            this.bj = 10;
                            n8 = this.ah + 24;
                            if (i.aN > this.l) {
                                n5 = (this.ad = 13);
                                break;
                            }
                            if (n7 < 504) {
                                n5 = (this.ad = 4);
                                break;
                            }
                            if (n6 >= n8 - 48) {
                                n5 = (this.ad = 6);
                                break;
                            }
                            break;
                        }
                        case 11: {
                            if (!g.a()) {
                                this.ah += 2;
                                break;
                            }
                            this.bj = 10;
                            n8 = this.ah + 24;
                            if (i.aN > this.l) {
                                n5 = (this.ad = 14);
                                break;
                            }
                            if (n7 < 504) {
                                n5 = (this.ad = 5);
                                break;
                            }
                            if (n6 <= n8 + 48) {
                                n5 = (this.ad = 7);
                                break;
                            }
                            break;
                        }
                        case 4: {
                            if (i.aN > this.l) {
                                n5 = (this.ad = 13);
                                break;
                            }
                            if (n7 >= 504 && n6 < n8 && this.ah - 48 >= 360) {
                                n5 = (this.ad = 10);
                            }
                            if (n8 <= 360) {
                                n5 = (this.ad = 5);
                            }
                            if (this.ad == 4) {
                                --this.ah;
                                break;
                            }
                            break;
                        }
                        case 5: {
                            if (i.aN > this.l) {
                                n5 = (this.ad = 14);
                                break;
                            }
                            if (n7 >= 504 && n6 > n8 && this.ah + 48 <= 504) {
                                n5 = (this.ad = 11);
                            }
                            if (n8 >= 504) {
                                n5 = (this.ad = 4);
                            }
                            if (this.ad == 5) {
                                ++this.ah;
                                break;
                            }
                            break;
                        }
                        case 6:
                        case 7:
                        case 13:
                        case 14: {
                            int ad = 0;
                            int n11 = 0;
                            int n12 = 0;
                            while (true) {
                                int n13 = 0;
                                switch (this.ad) {
                                    case 6:
                                    case 13: {
                                        ad = 4;
                                        n11 = 2;
                                        n13 = 1;
                                        break;
                                    }
                                    case 7:
                                    case 14: {
                                        ad = 5;
                                        n11 = 1;
                                        n13 = 2;
                                        break;
                                    }
                                    default: {
                                        if (g.g == 5 && g.h == 0) {
                                            i k;
                                            int bj;
                                            if (this.ad == 13 || this.ad == 14) {
                                                k = this;
                                                bj = 80;
                                            }
                                            else {
                                                k = this;
                                                bj = 10;
                                            }
                                            k.bj = bj;
                                        }
                                        if (g.a()) {
                                            if (this.ad == 13 || this.ad == 14) {
                                                this.m = i.aN + 40;
                                                this.l = i.aN + d.a(340, 441);
                                            }
                                            n5 = (this.ad = ad);
                                        }
                                        if (g.g >= 5 && n7 >= 504 && n6 >= n8 - n11 * 24 && n6 <= n8 + n12 * 24) {
                                            this.a(1, 48, 4);
                                            break Label_1273;
                                        }
                                        break Label_1273;
                                    }
                                }
                                n12 = n13;
                                continue;
                            }
                        }
                    }
                }
                if (n7 >= 504 && n6 >= n8 - 24 && n6 <= n8 + 24) {
                    this.a(1, 48, (int)i.h[this.aS & 0x7]);
                }
                if (this.af <= 0) {
                    this.ad = 12;
                    this.ae = 0;
                    return;
                }
            }
            Label_1538: {
                if (this.ce == 5) {
                    int[] array;
                    int n14;
                    if (this.cf <= 0) {
                        if (this.af <= 2) {
                            i.a[10][16] = 45;
                            i.c[10][16] = 24;
                            i.b[10][16] = 0;
                            i.b[10][16] = 0;
                        }
                        i.a[26][19] = 45;
                        i.c[26][19] = 24;
                        i.b[26][19] = 0;
                        array = i.b[26];
                        n14 = 19;
                    }
                    else {
                        i.a[10][19] = 45;
                        i.c[10][19] = 24;
                        i.b[10][19] = 0;
                        i.b[10][19] = 0;
                        if (this.af > 2) {
                            break Label_1538;
                        }
                        i.a[26][16] = 45;
                        i.c[26][16] = 24;
                        i.b[26][16] = 0;
                        array = i.b[26];
                        n14 = 16;
                    }
                    array[n14] = 0;
                }
            }
            if (this.ad != 10 && this.ad != 11) {
                for (int l = 21; l < 23; ++l) {
                    for (int n15 = n8 / 24 - 1; n15 < n8 / 24 - 2 + 4; ++n15) {
                        if (i.a[n15][l] == 9) {
                            Label_1693: {
                                if ((i.b[n15][l] & 0x7) == 0x3) {
                                    --this.af;
                                    i m = null;
                                    int n16 = 0;
                                    int ad2 = 0;
                                    switch (this.ad) {
                                        case 0:
                                        case 2:
                                        case 4:
                                        case 6: {
                                            m = this;
                                            ad2 = (n16 = 2);
                                            break;
                                        }
                                        case 1:
                                        case 3:
                                        case 5:
                                        case 7: {
                                            m = this;
                                            ad2 = (n16 = 3);
                                            break;
                                        }
                                        default: {
                                            break Label_1693;
                                        }
                                    }
                                    n5 = n16;
                                    m.ad = ad2;
                                }
                            }
                            i.a[n15][l] = -1;
                            this.b(n15, l);
                            i.a[n15][l] = 30;
                            i.c[n15][l] = 24;
                            i.b[n15][l] = 4;
                            this.C(14);
                        }
                    }
                }
            }
            if (n5 != -1) {
                g.a(n5);
                return;
            }
            g2 = g;
        }
        g2.b();
    }
    
    private void bz() {
        if (i.a[18][63] == 0 && i.b[18][63] <= 0 && this.ab == 0) {
            this.bj = 120;
            ++this.ab;
        }
        Label_0150: {
            g g;
            int n;
            if (this.ab == 3) {
                if (i.a[2].f == 0) {
                    g = i.a[2];
                    n = 1;
                }
                else {
                    if (i.a[2].f != 1 || !i.a[2].a()) {
                        break Label_0150;
                    }
                    i.a[2].a(2);
                    if (this.aQ == this.aw - 4) {
                        this.aa = 817;
                    }
                    break Label_0150;
                }
            }
            else {
                if (i.a[2].f == 0) {
                    break Label_0150;
                }
                g = i.a[2];
                n = 0;
            }
            g.a(n);
        }
        i.a[2].b();
        if (i.a[2].f == 2) {
            i.a[1].b();
            if (this.bj == 10) {
                this.bj = 60;
            }
            if (i.a[1].f == 0) {
                if ((this.a == null || this.aa < 46) && this.aa < 1704) {
                    ++this.aa;
                    final int aa = this.aw * 24 - (this.as + 320 - 80);
                    if (this.aa < aa) {
                        this.aa = aa;
                    }
                }
                if (this.aw * 24 - this.aa <= this.aQ * 24 + 18 && this.aP < 17) {
                    this.a((int)i.i[8], 64, 1);
                }
            }
            else if (i.a[1].a()) {
                i.a[1].a(0);
            }
        }
    }
    
    private void bA() {
        if (i.a != null && this.b() && (i.a[this.aP][this.aQ] & 0xFF) == 0x0) {
            final int n;
            if ((n = i.a[this.aP][this.aQ] >> 8) == 13) {
                this.o = true;
            }
            else if (n == 16) {
                this.p = true;
            }
        }
        if (!this.q && this.aR <= 0 && this.d(46, 7)) {
            this.r = true;
            this.q = true;
        }
    }
    
    public final void c() {
        final byte b = (byte)(((this.aS & 0x1000) == 0x0) ? this.k : 0);
        final int n = this.aP * 24 + this.aR * i.g[b];
        final int n2 = 24 * this.av - 240;
        final int au = 24 * this.aw - 240;
        Label_0144: {
            i i;
            int at;
            if (n < this.at + 96) {
                this.at = this.at - 96 + n >> 1;
                if (this.at >= 0) {
                    break Label_0144;
                }
                i = this;
                at = 0;
            }
            else {
                if (n <= this.at + 120) {
                    break Label_0144;
                }
                this.at = this.at - 120 + n >> 1;
                if (this.at <= n2) {
                    break Label_0144;
                }
                i = this;
                at = n2;
            }
            i.at = at;
        }
        final int n3;
        if ((n3 = this.aQ * 24 + this.aR * i.g[b + 8] + 40) < this.au + 96) {
            this.au = this.au - 96 + n3 >> 1;
            if (this.au < 0) {
                this.au = 0;
            }
        }
        if (n3 > this.au + 160) {
            this.au = this.au - 160 + n3 >> 1;
            if (this.au > au) {
                this.au = au;
            }
        }
        this.ar = this.at;
        this.as = this.au;
        Label_0293: {
            i j;
            int ar;
            if (this.ar < 0) {
                j = this;
                ar = 0;
            }
            else {
                if (this.ar <= n2) {
                    break Label_0293;
                }
                j = this;
                ar = n2;
            }
            j.ar = ar;
        }
        i k;
        i l;
        int au2;
        int as;
        if (this.as < 0) {
            k = this;
            l = this;
            as = (au2 = 0);
        }
        else {
            if (this.as <= au) {
                return;
            }
            k = this;
            l = this;
            as = (au2 = au);
        }
        l.au = au2;
        k.as = as;
    }
    
    private void a(final int n, final int n2, final boolean b, final byte b2) {
        final int n3 = b ? (n + 1) : (n - 1);
        final int n4 = i.b[n][n2];
        i.a[n3][n2] = b2;
        i.a[n][n2] = -1;
        i.b[n3][n2] = 18;
        int n5;
        int n6;
        if (b) {
            n5 = (((n4 & 0xFFFFFFF8) | 0x2) & 0xFFFFF3FF);
            n6 = 1024;
        }
        else {
            n5 = (((n4 & 0xFFFFFFF8) | 0x4) & 0xFFFFF3FF);
            n6 = 2048;
        }
        i.b[n3][n2] = (((n5 | n6) & 0xFFFFFDFF) | Integer.MIN_VALUE);
        q(n3, n2);
        this.b(n, n2);
    }
    
    private void b(final int n, final int n2, final byte b) {
        if ((i.a[n][n2] & 0xFF) == b) {
            i.a[n][n2] = -1;
            this.b(n - 1, n2, b);
            this.b(n + 1, n2, b);
            this.b(n, n2 - 1, b);
            this.b(n, n2 + 1, b);
        }
    }
    
    private boolean a(int n, final int n2, final boolean b) {
        int n3 = 0;
        final int as = this.aS;
        int ap = this.aP;
        int aq = this.aQ;
        byte k = this.k;
        boolean v = this.v;
        int ax = this.aX;
        int ar = this.aR;
        final int aw = this.aW;
        int n4;
        int n5;
        if (n > 0) {
            n4 = (as & 0xFFFFFFF8);
            n5 = 2;
        }
        else if (n < 0) {
            n4 = (as & 0xFFFFFFF8);
            n5 = 4;
        }
        else if (n2 < 0) {
            n4 = (as & 0xFFFFFFF8);
            n5 = 1;
        }
        else {
            n4 = (as & 0xFFFFFFF8);
            n5 = 3;
        }
        int as2 = n4 | n5;
        final int n6 = ap + n;
        final int n7 = aq + n2;
        boolean b2 = false;
        boolean b3 = false;
        if (n6 < 0 || n6 >= this.av || n7 < 0 || n7 >= this.aw) {
            b2 = true;
        }
        else {
            if (i.e != null && i.e[n6][n7] != 0 && i.i[10] == 0) {
                b2 = false;
                n3 = 1;
            }
            Label_0758: {
                int n11 = 0;
                switch ((byte)(i.a[n6][n7] & 0xFF)) {
                    case 19: {
                        if (b) {
                            break Label_0758;
                        }
                        int n8;
                        int n9;
                        for (n8 = n6 + 3, n9 = n7; i.a[n8][n9] != 39; --n9) {}
                        if (!this.j) {
                            this.cn();
                        }
                        this.j = true;
                        this.am = false;
                        if (i.e == null) {
                            i.e = new int[this.av][this.aw];
                        }
                        this.a((byte)i.b[n8][n9], (byte)n8, (byte)n9, (byte)0);
                        this.v(n8, n9);
                        final int n10 = n6;
                        while (true) {
                            ++n9;
                            if ((i.a[n10][n9] & 0xFF) != 0x13) {
                                break Label_0758;
                            }
                            i.a[n10][n9] = -1;
                        }
                        break;
                    }
                    case 1: {
                        if (!b) {
                            this.bj = 120;
                            ++this.ab;
                            this.b(n6, n7, (byte)1);
                        }
                        break Label_0758;
                    }
                    case 7: {
                        if ((i.a[n6][n7] >> 8 & 0xF0) >> 4 >= 2) {
                            break Label_0758;
                        }
                        n11 = 1;
                        break;
                    }
                    case 4: {
                        final int n12;
                        if (!b && (n12 = (i.a[n6][n7] & 0xFFFFFF00) >> 8) >= this.ax) {
                            this.u = true;
                            this.ax = n12 + 1;
                            this.Z = i.aN + 13;
                        }
                        break Label_0758;
                    }
                    case 28: {
                        if (!b) {
                            v = true;
                            this.au = false;
                        }
                        break Label_0758;
                    }
                    case 5: {
                        b2 = true;
                        if (!b) {
                            v = true;
                            this.au = true;
                        }
                        break Label_0758;
                    }
                    case 2: {
                        if (!b) {
                            b3 = true;
                            i i = null;
                            int az = 0;
                            Label_0721: {
                                i j = null;
                                int ay = 0;
                                Label_0716: {
                                    switch (i.a[n6][n7] >> 8) {
                                        case 0: {
                                            if (i.i[9] >= 1) {
                                                this.ay = 7;
                                                i = this;
                                                az = 0;
                                                break Label_0721;
                                            }
                                            j = this;
                                            break;
                                        }
                                        case 1: {
                                            if (i.i[9] >= 2) {
                                                j = this;
                                                ay = 7;
                                                break Label_0716;
                                            }
                                            j = this;
                                            break;
                                        }
                                        default: {
                                            break Label_0758;
                                        }
                                    }
                                    ay = 13;
                                }
                                j.ay = ay;
                                i = this;
                                az = 1;
                            }
                            i.az = az;
                        }
                        break Label_0758;
                    }
                    case 6: {
                        break Label_0758;
                    }
                    case 3: {
                        if (i.a[n6][n7] >> 8 < 3) {
                            b2 = true;
                            break Label_0758;
                        }
                        b2 = false;
                        n11 = 1;
                        break;
                    }
                }
                n3 = n11;
            }
            if (n3 == 0) {
                final byte b4;
                switch (b4 = i.a[n6][n7]) {
                    case 34:
                    case 35: {
                        b2 = b;
                        break;
                    }
                    case 31:
                    case 49: {
                        b2 = false;
                        break;
                    }
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 14:
                    case 19:
                    case 24:
                    case 26:
                    case 27:
                    case 33:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 45:
                    case 50:
                    case 51:
                    case 52:
                    case 53: {
                        b2 = true;
                        break;
                    }
                    case 10: {
                        if (this.x == 3) {
                            if (!b && i.b[n6][n7] <= 0) {
                                i.b[n6][n7] = 1;
                            }
                            b2 = true;
                            break;
                        }
                        break;
                    }
                    case 0:
                    case 8:
                    case 9:
                    case 47: {
                        final int n13 = ap + (n << 1);
                        final int n14 = aq + (n2 << 1);
                        if (this.i == 4) {
                            final int g = this.g();
                            if ((n13 == g || n13 == g + 1) && n14 >= this.h()) {
                                this.n((((as2 | 0x8) & 0x7) == 0x2) ? 8 : 9);
                                return false;
                            }
                        }
                        --ax;
                        final int n15 = i.a[n13][n14] & 0xFF;
                        final int n16 = i.a[n13][n14] >> 8;
                        final byte b5 = i.a[n6][aq + 1];
                        if ((ax < 0 || b) && n != 0 && f(n13, n14) && (n15 != 7 || (n16 & 0xF0) != 0x0) && ((b5 != 19 && b5 != 45 && b5 != 49 && b5 != 43) || (i.a[n6][aq + 1] & 0xFF) == 0x23)) {
                            if (!b) {
                                this.a(n6, n7, n > 0, b4);
                            }
                            b2 = true;
                            as2 |= 0x8;
                            break;
                        }
                        if (n != 0) {
                            as2 |= 0x8;
                        }
                        k = 0;
                        i.b[n6][n7] = ((i.b[n6][n7] & 0xFFFFFFF8) | 0x0);
                        break;
                    }
                    case 48: {
                        final int n17 = ap + (n << 1);
                        final int n18 = aq + (n2 << 1);
                        --ax;
                        int n19;
                        int n20;
                        if ((i.b[n6][n7] & 0x8) != 0x0) {
                            n19 = 0;
                            n20 = 1;
                        }
                        else {
                            n19 = -1;
                            n20 = 0;
                        }
                        final int n21 = n20;
                        if ((ax < 0 || b) && n != 0 && i.a[n17][n18 + n19] < 0 && i.a[n17][n18 + n21] < 0 && i.a[n6][n7 + n21 + 1] >= 0) {
                            if (!b) {
                                i.a[n17][n18 + n19] = b4;
                                i.a[n17][n18 + n21] = b4;
                                i.a[n6][n7 + n19] = -1;
                                i.a[n6][n7 + n21] = -1;
                                i.b[n17][n18 + n19] = i.b[n6][n7 + n19];
                                i.b[n17][n18 + n21] = ((i.b[n6][n7 + n21] & 0xFFFFFFF0) | ((n > 0) ? 2 : 4));
                                i.b[n17][n18 + n21] = 18;
                                i.c[n17][n18 + n19 - 1] = 48;
                                i.c[n17][n18 + n19 - 1] = 48;
                                i.c[n17][n18 + n19 - 1] = 48;
                                q(n17, n18 + n21);
                            }
                            b2 = true;
                            as2 |= 0x8;
                            break;
                        }
                        if (n != 0) {
                            as2 |= 0x8;
                        }
                        k = 0;
                        break;
                    }
                    case -1: {
                        Label_1894: {
                            boolean b6;
                            if (n6 == 0 || n7 == 0 || n6 == this.av - 1 || n7 == this.aw - 1) {
                                b6 = true;
                            }
                            else {
                                if (((n != 0 && i.a[n6][aq + 1] == 0 && (i.b[n6][aq + 1] & 0x7) == 0x3) || (this.aI >= 24 && ((i.a[n6][n7 - 1] == 28 && (i.b[n6][n7 - 1] & 0x8) == 0x0) || (i.a[n6][n7 + 1] == 28 && (i.b[n6][n7 + 1] & 0x8) == 0x0))) || (this.aK >= 24 && (i.a[n6][n7 - 1] == 28 || i.a[n6][n7 + 1] == 28))) && !b) {
                                    k = 0;
                                    break Label_1894;
                                }
                                b6 = true;
                            }
                            b2 = b6;
                        }
                        as2 &= 0xFFFFFFF7;
                        break;
                    }
                    case 28: {
                        k = 0;
                        as2 &= 0xFFFFFFF7;
                        break;
                    }
                    default: {
                        n = 0;
                        b2 = false;
                        if (this.k == 4 || this.k == 2) {
                            this.n(0 + this.k - 1);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        if (!b && b2 && !b3) {
            this.ay = -1;
        }
        if (b2 && aw == 0) {
            ar = 18;
            ap += n;
            aq += n2;
            if ((as2 & 0x8) == 0x0 && !b) {
                this.n(4 + k - 1);
            }
        }
        else if (n != 0 && !b) {
            as2 |= 0x8;
        }
        if ((as2 & 0x8) != 0x0 && !b) {
            this.n(((as2 & 0x7) == 0x2) ? 8 : 9);
        }
        if (!b) {
            this.aS = as2;
            this.aP = ap;
            this.aQ = aq;
            this.k = k;
            this.v = v;
            this.aX = ax;
            this.aR = ar;
            this.aW = aw;
        }
        return b2;
    }
    
    public static void d() {
        i.l = 3;
    }
    
    private void bB() {
        i.l = 2;
        i.U = true;
        this.a(1);
        this.B();
        if (i.a[18] == null) {
            i.a[18] = a("/ui.f", 3);
        }
    }
    
    public final void e() {
        this.n = System.currentTimeMillis() - this.a;
        this.ae = true;
        System.out.println(h.a());
        if ((i.l == 30 || i.l == 4) && h.a()) {
            this.af = true;
        }
        this.a.e();
    }
    
    public final void showNotify() {
        if (this.ae) {
            this.f();
        }
    }
    
    public final void hideNotify() {
        if (!this.ae) {
            this.e();
        }
    }
    
    public final void f() {
        this.ae = false;
        i.U = true;
        i.V = true;
        this.b = true;
        i.W = 0;
        this.dd = -1;
        if (this.bo == 7) {
            this.bq = 0;
        }
        this.a = System.currentTimeMillis() - this.n;
        i i = null;
        switch (i.l) {
            case 0:
            case 6:
            case 12:
            case 22: {
                return;
            }
            case 4:
            case 30: {
                if (this.af) {
                    this.a.b(19);
                }
                return;
            }
            case 7: {
                this.bq = 1;
                return;
            }
            case 15: {
                i = this;
                break;
            }
            case 10: {
                i.V = false;
                return;
            }
            case 1: {
                this.B();
                if (i.D) {
                    return;
                }
                if (this.a != null) {
                    return;
                }
                if (this.an != 0) {
                    return;
                }
                if (this.v) {
                    return;
                }
                if (this.n <= 0) {
                    return;
                }
                if (i.a[0].f == 19) {
                    return;
                }
                if (this.C) {
                    return;
                }
                this.bB();
                return;
            }
            case 5: {
                this.Q = true;
                return;
            }
            case 8: {
                return;
            }
            case 9:
            case 28: {
                return;
            }
            case 11: {
                this.bs = 6;
                return;
            }
            case 31: {
                this.P = true;
                return;
            }
            case 16: {
                this.ao = 0;
                this.bb = 0;
                this.n = false;
                this.V = 0;
                this.B = true;
                return;
            }
            case 17: {
                return;
            }
            case 18:
            case 25:
            case 26: {
                i = this;
                break;
            }
            case 19: {
                return;
            }
            case 20: {
                return;
            }
            case 21: {
                this.ct();
                return;
            }
            case 23: {
                return;
            }
            case 27: {
                this.aw = true;
                this.e = true;
                return;
            }
            case 2: {
                i.g = null;
                this.m = true;
                if (this.bo == 1) {
                    this.bq = 0;
                }
                return;
            }
            case 33: {
                i = this;
                break;
            }
        }
        i.aw = true;
    }
    
    private void bC() {
        if (!this.j) {
            return;
        }
        for (int i = 0; i < this.av; ++i) {
            for (int j = 0; j < this.aw; ++j) {
                if (i.a[i][j] == 38) {
                    this.a((byte)i.b[i][j], (byte)i, (byte)j, (byte)0);
                    ++this.dw;
                }
            }
        }
    }
    
    private void n(final int n, final int n2) {
        this.c |= 0x400000L;
        final int[] array = i.a[n];
        array[n2] &= 0xFFFFFF00;
        final int[] array2 = i.a[n];
        array2[n2] |= 0xE;
    }
    
    private boolean e() {
        return this.i == 4 || this.i == 5 || this.i == 3;
    }
    
    private void bD() {
        final Hashtable<Object, Integer> hashtable = new Hashtable<Object, Integer>();
        final Hashtable<Integer, Integer> hashtable2 = new Hashtable<Integer, Integer>();
        final Hashtable<Integer, Integer> hashtable3 = new Hashtable<Integer, Integer>();
        this.X = 0;
        this.Y = 0;
        int n = 0;
        this.aY = 0;
        this.bu = 0;
        int n2 = 0;
        int n3 = 0;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.al = 0;
        int n4 = 0;
        for (int i = 0; i < this.av; ++i) {
            for (int j = 0; j < this.aw; ++j) {
                i.b[i][j] = 0;
                i.c[i][j] = 0;
                final int n5 = i.a[i][j];
                final int n6 = i.b[i][j];
                final byte b = i.a[i][j];
                Label_1480: {
                    if (n5 != -1) {
                        switch (n5 & 0xFF) {
                            case 31: {
                                this.c |= 0x40000000L;
                                i.a[i][j] = (n6 << 8 | 0x1F);
                            }
                            case 19: {
                                i.a[i][j] = (n6 << 8 | 0x13);
                                break;
                            }
                            case 17: {
                                final int n7;
                                if ((n7 = (i.a[i][j - 1] & 0xFF)) == 14 || n7 == 33) {
                                    i.a[i][j - 1] = (0xFF00 | n7);
                                }
                                final byte b2;
                                switch (b2 = i.a[i][j - 1]) {
                                    case 19:
                                    case 36:
                                    case 43:
                                    case 45:
                                    case 46:
                                    case 49: {
                                        final Integer n8 = new Integer(n6);
                                        final Integer n9;
                                        hashtable2.put(n8, ((n9 = hashtable2.get(n8)) == null) ? new Integer(1) : new Integer(n9 + 1));
                                        i.a[i][j] = -1;
                                        final Integer n10 = hashtable3.get(n8);
                                        if (b2 == 36) {
                                            if (n10 == null) {
                                                hashtable3.put(n8, new Integer(58));
                                                break;
                                            }
                                            break;
                                        }
                                        else {
                                            hashtable3.put(n8, new Integer(57));
                                            if (this.i == 4) {
                                                hashtable3.put(n8, new Integer(93));
                                                break;
                                            }
                                            if (this.i == 5) {
                                                hashtable3.put(n8, new Integer(94));
                                                break;
                                            }
                                            if (this.i == 3) {
                                                hashtable3.put(n8, new Integer(95));
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    default: {
                                        i.a[i][j] = (n6 << 8 | 0x11);
                                        break;
                                    }
                                }
                                if (n6 >= 0) {
                                    n3 |= 1 << n6;
                                    break;
                                }
                                break;
                            }
                            case 14:
                            case 33: {
                                if (!this.e()) {
                                    i.a[i][j] = 33;
                                }
                                this.c |= 1L << (((i.a[i][j] & 0xFF) == 0xE) ? 22 : 33);
                                if (!this.a(this.ap, this.aq, i, j)) {
                                    break;
                                }
                                if (this.e()) {
                                    i.a[i][j] = 41;
                                    i.b[i][j] = 10;
                                    this.aY += 10;
                                    break;
                                }
                                i.a[i][j] = -1;
                                final int[] array = i.a[i];
                                final int n11 = j;
                                array[n11] |= 0x100;
                                break;
                            }
                            case 2: {
                                this.c |= 0x100000L;
                                switch (n6) {
                                    case 0:
                                    case 1: {
                                        this.c |= 0x80000L;
                                        break;
                                    }
                                }
                                i.a[i][j] = (n6 << 8 | 0x2);
                                break;
                            }
                            case 8: {
                                this.ah = true;
                            }
                            case 9: {
                                if ((n5 & 0xFF) != 0x8) {
                                    this.ag = true;
                                }
                                this.c |= 0x10000000L;
                                final Integer n12 = new Integer(n6);
                                final Integer n13;
                                hashtable.put(n12, ((n13 = hashtable.get(n12)) == null) ? new Integer(1) : new Integer(n13 + 1));
                                i.a[i][j] = (n6 << 8 | n5);
                                break;
                            }
                            case 7: {
                                if (n6 != -1) {
                                    i.q[n6] = (byte)i;
                                    i.r[n6] = (byte)j;
                                }
                                i.a[i][j] = (n6 << 8 | n5);
                                break;
                            }
                            case 30: {
                                this.c |= 0x40000000L;
                                ++n4;
                            }
                            case 1:
                            case 26: {
                                i.a[i][j] = (n6 << 8 | (n5 & 0xFF));
                                break;
                            }
                            case 0: {
                                ++n4;
                                i.a[i][j] = (n6 << 8 | (n5 & 0xFF));
                                break;
                            }
                            case 4: {
                                ++n2;
                                this.c |= 0x10L;
                                i.a[i][j] = (n6 << 8 | (n5 & 0xFF));
                                break;
                            }
                            case 5: {
                                this.p = (byte)n6;
                                break;
                            }
                            case 28: {
                                this.q = (byte)n6;
                                break;
                            }
                            case 3: {
                                i.c[i][j] = 127;
                                if (n6 > 0) {
                                    i.a[i][j] = (n6 + 1 << 8 | 0x3);
                                    break;
                                }
                                break;
                            }
                            case 6: {
                                final Integer n14 = new Integer(n6);
                                final Integer n15;
                                hashtable.put(n14, ((n15 = hashtable.get(n14)) == null) ? new Integer(1) : new Integer(n15 + 1));
                                this.c |= 0x20000000L;
                                i.a[i][j] = (n6 << 8 | 0x6);
                                break;
                            }
                            default: {
                                if (n5 >= 20 && n5 < 26) {
                                    i.a[i][j] = n5;
                                    while (true) {
                                        i k = null;
                                        long n16 = 0L;
                                        long n17 = 0L;
                                        switch (this.ap) {
                                            case 0: {
                                                k = this;
                                                n16 = this.c;
                                                n17 = 16L;
                                                break;
                                            }
                                            case 1: {
                                                k = this;
                                                n16 = this.c;
                                                n17 = 2097152L;
                                                break;
                                            }
                                            default: {
                                                break Label_1480;
                                            }
                                        }
                                        k.c = (n16 | n17);
                                        continue;
                                    }
                                }
                                if (n5 < 80 && n5 > -1) {
                                    i.a[i][j] = -1;
                                    break;
                                }
                                break;
                            }
                            case 34: {
                                this.c |= 0x400000000L;
                                break;
                            }
                        }
                    }
                }
                byte[] array3 = null;
                int n21 = 0;
                int n22 = 0;
                switch (b) {
                    case 48: {
                        int[] array2;
                        int n18;
                        int n19;
                        if ((n6 & 0x7) == 0x4) {
                            array2 = i.b[i];
                            n18 = j;
                            n19 = 16;
                        }
                        else {
                            array2 = i.b[i];
                            n18 = j;
                            n19 = 0;
                        }
                        array2[n18] = n19;
                        ++this.al;
                        this.c |= 0x10000000000L;
                        this.c |= 0x100000000L;
                        final int n20 = j - 1;
                        i.a[i][n20] = 48;
                        i.b[i][n20] = 8;
                        q(i, n20);
                        continue;
                    }
                    case 47: {
                        i.c[i][j] = 48;
                        i.b[i][j] = 0;
                        this.c |= 0x800000L;
                        continue;
                    }
                    case 46: {
                        i.b[i][j] = 0;
                        i.c[i][j] = 24;
                        i.b[i][j] = 0;
                        this.c |= 0x2000000000L;
                        continue;
                    }
                    case 45: {
                        i.b[i][j] = 0;
                        i.c[i][j] = 24;
                        this.c |= 0x800000000L;
                        continue;
                    }
                    case 44: {
                        i.c[i][j] = 24;
                        i.b[i][j] = 0;
                        this.c |= 0x400000000L;
                        continue;
                    }
                    case 42: {
                        ++n4;
                        ++n;
                        this.c |= 0x80000000L;
                        this.c |= 0x40000000L;
                        this.n(i, j);
                        continue;
                    }
                    case 41: {
                        if (i.b[i][j] <= 0) {
                            i.b[i][j] = 1;
                        }
                        this.aY += i.b[i][j];
                        continue;
                    }
                    case 40: {
                        this.c |= 0x40000000L;
                        ++n4;
                        this.j = true;
                        this.c |= 0x8000000L;
                        this.n(i, j);
                        ++n;
                        continue;
                    }
                    case 12: {
                        this.Q = i;
                        this.R = j;
                        this.P = n6;
                        continue;
                    }
                    case 36: {
                        if (i.b[i][j] != 1) {
                            i.b[i][j] = 0;
                        }
                        this.c |= 0x100L;
                        continue;
                    }
                    case 18: {
                        this.ce = 0;
                        this.cf = 0;
                        this.c |= 0x8000000000L;
                        this.c |= 0x80L;
                        continue;
                    }
                    case 34: {
                        i.a[i][j] = -1;
                        i.a[i][j] = 15;
                        this.c |= 0x1000000L;
                        continue;
                    }
                    case 35: {
                        i.a[i][j] = 35;
                        i.a[i][j] = -1;
                        this.c |= 0x1000000L;
                        this.ai = true;
                    }
                    case 31:
                    case 33: {
                        continue;
                    }
                    case 39: {
                        this.j = true;
                        this.c |= 0x4000000L;
                        continue;
                    }
                    case 38: {
                        this.j = true;
                        this.c |= 0x4000000L;
                        i.a[i][j] = 27;
                        this.c |= 0x40L;
                        continue;
                    }
                    case 14: {
                        this.c |= 0x1000L;
                        i.b[i][j] = ((i.b[i][j] == 4) ? 8 : 0);
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 24;
                        break;
                    }
                    case 28: {
                        this.c |= 0x800L;
                        if (n6 > 10) {
                            final int[] array4 = i.b[i];
                            final int n23 = j;
                            array4[n23] /= 11;
                            final int[] array5 = i.b[i];
                            final int n24 = j;
                            array5[n24] |= 0x8;
                        }
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 24;
                        break;
                    }
                    case 79: {
                        this.aP = 0;
                        this.aQ = j;
                        this.an = i;
                        i.a[i][j] = -1;
                        final int n25 = 0;
                        this.at = n25;
                        this.ar = n25;
                        final int n26 = this.aQ * 24 - 160;
                        this.au = n26;
                        this.as = n26;
                        continue;
                    }
                    case 11: {
                        i.b[i][j] = ((n6 == 1) ? 16 : 0);
                        i.c[i][j] = 48;
                        this.c |= 0x4000L;
                        continue;
                    }
                    case 49: {
                        this.c |= 0x20000000000L;
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 48;
                        break;
                    }
                    case 43: {
                        this.c |= 1L << ((this.ap == 1) ? 17 : 15);
                        this.bu |= 0x1;
                        i.b[i][j] = ((n6 & 0xFFFE7FFF) | 0x10000);
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 48;
                        break;
                    }
                    case 19: {
                        this.c |= 1L << ((this.ap == 1) ? 17 : 15);
                        this.bu |= 0x2;
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 48;
                        break;
                    }
                    case 22:
                    case 23: {
                        this.c |= 0x200L;
                        this.c |= 0x400L;
                        array3 = i.c[i];
                        n21 = j;
                        n22 = 48;
                        break;
                    }
                    case 30: {
                        this.c |= 0x80L;
                        i.b[i][j] = 0;
                        continue;
                    }
                    case 37: {
                        this.c |= 0x2000000L;
                        i.b[i][j] = 0;
                        continue;
                    }
                    case 10: {
                        i.b[i][j] = 0;
                        this.d |= 0x2L;
                        continue;
                    }
                    case 16: {
                        if (i.a[i][j + 1] != 16) {
                            i.a[i][j - 1] = 16;
                            i.b[i][j - 1] = n6;
                        }
                        this.c |= 0x2000L;
                        continue;
                    }
                    case 6: {
                        ++n;
                        this.n(i, j);
                    }
                    case 7: {
                        this.c |= 0x10L;
                        i.b[i][j] = 0;
                        continue;
                    }
                    case 26: {
                        this.c |= 0x10000000000L;
                    }
                    case 24:
                    case 27: {
                        ++n4;
                        ++n;
                        this.c |= 0x40000000L;
                        this.c |= 0x80000L;
                        this.n(i, j);
                        continue;
                    }
                    case 8: {
                        this.c |= 0x20L;
                        this.c |= 0x8L;
                    }
                    case 4: {
                        if (b != 8) {
                            this.n(i, j);
                        }
                    }
                    case 5: {
                        this.c |= 0x4L;
                    }
                    case 2: {
                        ++n;
                    }
                    case 0: {
                        i.c[i][j] = 48;
                        i.b[i][j] = 0;
                        this.d |= 0x1L;
                        continue;
                    }
                    case 1: {
                        ++this.aY;
                        i.c[i][j] = 48;
                        i.b[i][j] = 0;
                    }
                    case 53: {}
                    case 51: {}
                    case 52: {
                        continue;
                    }
                    default: {
                        if (b < 80 && b > -1) {
                            array3 = i.a[i];
                            n21 = j;
                            n22 = -1;
                            break;
                        }
                        continue;
                    }
                }
                array3[n21] = (byte)n22;
            }
        }
        i.d = new byte[n << 1];
        for (int l = 0; l < i.d.length; ++l) {
            i.d[l] = 0;
        }
        i.a = new c[n4];
        i.p = new byte[n4];
        int n27 = 0;
        i.k = new byte[(n2 + 1) * 2];
        int n28;
        for (n28 = 31; n28 >= 0 && (n3 & 1 << n28) == 0x0; --n28) {}
        if (++n28 > 0) {
            i.m = new byte[n28];
            i.l = new byte[n28];
        }
        if (this.al > 0) {
            i.e = new byte[this.al * 3];
        }
        int n29 = 0;
        for (int n30 = 0; n30 < this.aw; ++n30) {
            for (int n31 = 0; n31 < this.av; ++n31) {
                final int n32 = i.a[n31][n30] & 0xFF;
                final int n33 = i.a[n31][n30] >> 8;
                Label_3838: {
                    byte[] array6 = null;
                    int n34 = 0;
                    byte byteValue = 0;
                    switch (n32) {
                        case 0:
                        case 30: {
                            array6 = i.p;
                            n34 = n27++;
                            byteValue = (byte)n33;
                            break;
                        }
                        case 7: {
                            final Integer n35 = hashtable.get(new Integer(n33));
                            int n36 = n33 << 8;
                            if (n35 != null) {
                                n36 = ((n36 & 0xFFFFFFF0) | n35);
                            }
                            final boolean b3 = (i.a[n31][n30 - 1] & 0xFF) == 0x11;
                            final boolean b4 = (i.a[n31][n30 + 1] & 0xFF) == 0x11 && (i.a[n31 + 1][n30] & 0xFF) != 0x1A && (i.a[n31 - 1][n30] & 0xFF) != 0x1A;
                            if (b3 || b4) {
                                n36 = ((n36 & 0xFFFFFF0F) | 0x30);
                                i.c[n31][n30] = 24;
                                if (b3) {
                                    i.a[n31][n30 - 1] = -1;
                                }
                            }
                            i.a[n31][n30] = (n36 << 8 | n32);
                            break Label_3838;
                        }
                        case 4: {
                            final int n37 = n33;
                            i.k[n37 * 2] = (byte)n31;
                            array6 = i.k;
                            n34 = n37 * 2 + 1;
                            byteValue = (byte)n30;
                            break;
                        }
                        case 5: {
                            i.k[n2 * 2] = (byte)n31;
                            array6 = i.k;
                            n34 = n2 * 2 + 1;
                            byteValue = (byte)n30;
                            break;
                        }
                        case 17: {
                            if (n33 != -1) {
                                final Integer n38 = new Integer(n33);
                                Integer n39;
                                if ((n39 = hashtable2.get(n38)) == null) {
                                    n39 = new Integer(0);
                                }
                                i.m[n33] = n39.byteValue();
                                Integer n40;
                                if ((n40 = hashtable3.get(n38)) == null) {
                                    n40 = new Integer(59);
                                }
                                array6 = i.l;
                                n34 = n33;
                                byteValue = n40.byteValue();
                                break;
                            }
                            break Label_3838;
                        }
                    }
                    array6[n34] = byteValue;
                }
                byte[] array8 = null;
                int n45 = 0;
                int n46 = 0;
                switch (i.a[n31][n30]) {
                    case 48: {
                        if ((i.b[n31][n30] & 0x8) != 0x0) {
                            final int n41 = n31 + (((i.b[n31][n30 + 1] & 0x10) == 0x0) ? 1 : -1);
                            final int n42 = n29 * 3;
                            byte[] array7;
                            int n43;
                            int n44;
                            if (d(n41, n30) >= 0) {
                                i.e[n42 + 0] = (byte)n41;
                                i.e[n42 + 1] = (byte)n41;
                                array7 = i.e;
                                n43 = n42 + 2;
                                n44 = (byte)n30;
                            }
                            else {
                                array7 = i.e;
                                n43 = n42 + 2;
                                n44 = -1;
                            }
                            array7[n43] = (byte)n44;
                            i.b[n31][n30] = ((i.b[n31][n30] & 0xFFFFFF) | n29 << 24);
                            ++n29;
                        }
                        continue;
                    }
                    case 26: {
                        array8 = i.p;
                        n45 = n27++;
                        n46 = 25;
                        break;
                    }
                    case 42: {
                        array8 = i.p;
                        n45 = n27++;
                        n46 = 11;
                        break;
                    }
                    case 24: {
                        array8 = i.p;
                        n45 = n27++;
                        n46 = 22;
                        break;
                    }
                    case 27: {
                        array8 = i.p;
                        n45 = n27++;
                        n46 = 23;
                        break;
                    }
                    case 40: {
                        array8 = i.p;
                        n45 = n27++;
                        n46 = 24;
                        break;
                    }
                }
                array8[n45] = (byte)n46;
            }
        }
        i.a[this.an - 2][this.aQ] = (-193 << 8 | 0x7);
        if ((this.c & 0x100000000L) != 0x0L || i.i[9] >= 8) {
            this.c |= 0x10000000000L;
            this.c |= 0x2L;
            this.c |= 0x1L;
            if ((this.c & 0x20000L) != 0x0L) {
                this.c |= 0x40000L;
            }
            if ((this.c & 0x8000L) != 0x0L) {
                this.c |= 0x10000L;
            }
            if ((this.c & 0x800000000L) != 0x0L) {
                this.c |= 0x1000000000L;
            }
            if ((this.c & 0x2000000000L) != 0x0L) {
                this.c |= 0x4000000000L;
            }
            if ((this.c & 0x20000000000L) != 0x0L) {
                this.c |= 0x40000000000L;
            }
        }
    }
    
    private void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n + n3 <= 0 || n + n3 >= this.av || n2 + n4 <= 0 || n2 + n4 >= this.aw) {
            return;
        }
        final int n6;
        switch (n6 = (i.a[n + n3][n2 + n4] & 0xFF)) {
            case 8:
            case 9: {
                final int n7 = i.a[n + n3][n2 + n4] >> 8;
                i.a[n + n3][n2 + n4] = (((n5 == 1) ? (n7 | 0x200) : (n7 & 0xFFFFFDFF)) << 8 | n6);
                this.a(n + n3, n2 + n4, n3, n4, n5);
                this.a(n + n3, n2 + n4, 0, 1, n5);
                break;
            }
        }
    }
    
    private boolean d(final int n, final int n2) {
        return n == this.aP && n2 == this.aQ;
    }
    
    private void u(final int n) {
        final byte b = 0;
        this.k = b;
        this.j = b;
        for (int i = 0; i < i.p.length; ++i) {
            if (i.p[i] == n) {
                this.a = i.a[i];
            }
        }
        this.a.a();
    }
    
    private boolean f() {
        Label_0081: {
            if (this.ar < this.ci) {
                this.ar += this.ck;
                if (this.ar <= this.ci) {
                    break Label_0081;
                }
            }
            else {
                if (this.ar <= this.ci) {
                    break Label_0081;
                }
                this.ar -= this.ck;
                if (this.ar >= this.ci) {
                    break Label_0081;
                }
            }
            this.ar = this.ci;
        }
        Label_0162: {
            if (this.as < this.cj) {
                this.as += this.ck;
                if (this.as <= this.cj) {
                    break Label_0162;
                }
            }
            else {
                if (this.as <= this.cj) {
                    break Label_0162;
                }
                this.as -= this.ck;
                if (this.as >= this.cj) {
                    break Label_0162;
                }
            }
            this.as = this.cj;
        }
        boolean b = false;
        boolean b2 = false;
        Label_0230: {
            if (this.ar < 0) {
                this.ar = 0;
            }
            else if (this.ar > this.av * 24 - 240) {
                this.ar = this.av * 24 - 240;
            }
            else if (this.ar != this.ci) {
                break Label_0230;
            }
            b = true;
        }
        Label_0300: {
            if (this.as < 0) {
                this.as = 0;
            }
            else if (this.as > this.aw * 24 - 320 + 80) {
                this.as = this.aw * 24 - 320 + 80;
            }
            else if (this.as != this.cj) {
                break Label_0300;
            }
            b2 = true;
        }
        if (b && b2) {
            this.at = this.ar;
            this.au = this.as;
            this.am = 70;
            return true;
        }
        return false;
    }
    
    private void bE() {
        switch (this.cl) {
            case 1: {
                this.ck = 8;
                if (this.f()) {
                    this.cl = 2;
                    this.dn = 40;
                    return;
                }
                break;
            }
            case 2: {
                --this.dn;
                if (this.dn == 30) {
                    if ((i.a[this.dl][this.dm] >> 8 & 0xF0) != 0x0) {
                        this.j(this.dl, this.dm);
                        return;
                    }
                    break;
                }
                else {
                    if (this.dn == 0) {
                        this.cl = 3;
                        this.ci = this.aP * 24 - 108;
                        this.cj = this.aQ * 24 - 108;
                        this.ck = 5;
                        this.e = i.a[i.l[i.cm]];
                        i.a[41].a(this.e);
                        this.dk = 80;
                        return;
                    }
                    break;
                }
                break;
            }
            case 3: {
                if (this.f()) {
                    this.dn = 20;
                    this.cl = 4;
                    this.am = 0;
                    return;
                }
                break;
            }
            case 4: {
                --this.dn;
                if (this.dn == 0) {
                    this.am = 0;
                    this.cl = 0;
                    i.ak = true;
                    break;
                }
                break;
            }
        }
    }
    
    private void v(final int n) {
        this.C(1);
        final int n2 = this.av - 1;
        for (int n3 = this.aw - 1, i = 1; i < n3; ++i) {
            for (int j = 1; j < n2; ++j) {
                if ((i.a[j][i] & 0xFF) == 0x11 && i.a[j][i] >> 8 == n) {
                    int dl = -1;
                    int dm = -1;
                    Label_0186: {
                        int n4 = 0;
                        if (i.a[j][i] == 18) {
                            dl = j;
                            n4 = i;
                        }
                        else {
                            Label_0176: {
                                switch (i.a[j][i - 1] & 0xFF) {
                                    case 7: {
                                        if ((i.a[j][i - 1] >> 8 & 0xF0) != 0x0) {
                                            break Label_0176;
                                        }
                                        break Label_0186;
                                    }
                                    case 14:
                                    case 33: {
                                        dl = j;
                                        n4 = i - 1;
                                        break;
                                    }
                                }
                            }
                        }
                        dm = n4;
                    }
                    if (dl != -1) {
                        this.dl = dl;
                        this.dm = dm;
                        this.ci = 24 * dl - 108;
                        this.cj = 24 * dm - 108;
                    }
                }
            }
        }
    }
    
    private void w(final int n) {
        this.C(8);
        final int n2 = this.av - 1;
        for (int n3 = this.aw - 1, i = 1; i < n3; ++i) {
            for (int j = 1; j < n2; ++j) {
                if ((i.a[j][i] & 0xFF) == 0x11 && i.a[j][i] >> 8 == n) {
                    final int n4;
                    switch (n4 = (i.a[j][i - 1] & 0xFF)) {
                        case 7: {
                            i(j, i - 1);
                            break;
                        }
                        case 14:
                        case 33: {
                            i.a[j][i - 1] = (0x0 | n4);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    private void bF() {
        int n = this.aP - 8;
        int n2 = this.aP + 8;
        int n3 = this.aQ + 8;
        int n4 = this.aQ - 8;
        int n5 = 0;
        if (i.a[4] != null) {
            final int g;
            n5 = (((g = i.a[4].g) == 0) ? 0 : ((g <= 10) ? 1 : ((g <= 20) ? 2 : 3)));
        }
        if (n < 1) {
            n = 1;
        }
        if (n2 > this.av - 2) {
            n2 = this.av - 2;
        }
        if (n4 < 1) {
            n4 = 1;
        }
        if (n3 > this.aw - 2) {
            n3 = this.aw - 2;
        }
        i i = this;
        int bf = n3;
        while (true) {
            i.bF = bf;
            if (this.bF < n4) {
                break;
            }
            i j = this;
            int be = n;
            while (true) {
                j.bE = be;
                if (this.bE > n2) {
                    break;
                }
                final boolean b = this.bi != 0 && this.bE == this.bg && this.bF == this.bh;
                Label_1594: {
                    if (i.c[this.bE][this.bF] > 0 && !b) {
                        final byte[] array = i.c[this.bE];
                        final int bf2 = this.bF;
                        array[bf2] -= 6;
                        Label_0821: {
                            i k = null;
                            switch ((byte)(i.a[this.bE][this.bF] & 0xFF)) {
                                case 36: {
                                    this.bd();
                                    break Label_0821;
                                }
                                case 35:
                                case 37: {
                                    if (this.bE != this.bg || this.bF != this.bh || this.bi == 0) {
                                        this.bH();
                                    }
                                    break Label_0821;
                                }
                                case 32: {
                                    this.bL();
                                    break Label_0821;
                                }
                                case 26: {
                                    this.bP();
                                    break Label_0821;
                                }
                                case 6: {
                                    this.bM();
                                    break Label_0821;
                                }
                                case 33: {
                                    this.z(33);
                                    break Label_0821;
                                }
                                case 14: {
                                    this.z(14);
                                    break Label_0821;
                                }
                                case 2: {
                                    switch (i.a[this.bE][this.bF] >> 8) {
                                        case 0: {
                                            if (i.a[this.bE - 1][this.bF] != 30 && i.a[this.bE + 1][this.bF] != 30 && i.a[this.bE][this.bF - 1] != 30 && i.a[this.bE][this.bF + 1] != 30) {
                                                this.ay = -1;
                                                this.b(this.bE, this.bF, (byte)2);
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    break Label_0821;
                                }
                                case 3: {
                                    this.ce();
                                    break Label_0821;
                                }
                                case 30: {
                                    if (this.a == null && this.bm == -1 && this.d(this.bE, this.bF) && this.aR <= 0) {
                                        this.bm = i.a[this.bE][this.bF] >> 8;
                                        i.a[this.bE][this.bF] = -1;
                                    }
                                    break Label_0821;
                                }
                                case 0: {
                                    if (this.a == null && this.bm == -1 && this.d(this.bE, this.bF) && this.aR <= 6) {
                                        this.bm = i.a[this.bE][this.bF] >> 8;
                                        i.a[this.bE][this.bF] = -1;
                                    }
                                    break Label_0821;
                                }
                                case 7: {
                                    this.cd();
                                    break Label_0821;
                                }
                                case 8: {
                                    k = this;
                                    break;
                                }
                                case 9: {
                                    k = this;
                                    break;
                                }
                            }
                            k.cc();
                        }
                        final int n6;
                        if ((n6 = (i.a[this.bE][this.bF] & 0xF0000000) >> 28) > 0) {
                            this.bR();
                        }
                        i i2 = null;
                        int n7 = 0;
                        switch (i.a[this.bE][this.bF]) {
                            case 54: {
                                this.bN();
                                break Label_1594;
                            }
                            case 50: {
                                if (this.aR < 12 && this.d(this.bE, this.bF) && !this.h) {
                                    this.a(1, 48, (int)i.h[this.aS & 0x7]);
                                }
                                break Label_1594;
                            }
                            case 49: {
                                this.e((byte)49);
                                break Label_1594;
                            }
                            case 48: {
                                if ((i.b[this.bE][this.bF] & 0x8) == 0x0) {
                                    this.d((byte)48);
                                    break Label_1594;
                                }
                                this.bG();
                                break Label_1594;
                            }
                            case 46: {
                                this.bJ();
                                break Label_1594;
                            }
                            case 45: {
                                this.aL();
                                break Label_1594;
                            }
                            case 44: {
                                this.bK();
                                break Label_1594;
                            }
                            case 40: {
                                this.x(40);
                                break Label_1594;
                            }
                            case 36: {
                                this.bO();
                                break Label_1594;
                            }
                            case 28: {
                                this.cb();
                                break Label_1594;
                            }
                            case 16: {
                                this.ca();
                                break Label_1594;
                            }
                            case 14: {
                                this.bZ();
                                break Label_1594;
                            }
                            case 10: {
                                this.bW();
                                break Label_1594;
                            }
                            case 21: {
                                this.bY();
                                break Label_1594;
                            }
                            case 32: {
                                this.bX();
                                break Label_1594;
                            }
                            case 11: {
                                this.bV();
                                break Label_1594;
                            }
                            case 37: {
                                this.bU();
                                break Label_1594;
                            }
                            case 30: {
                                this.bT();
                                break Label_1594;
                            }
                            case 24: {
                                this.y(24);
                                break Label_1594;
                            }
                            case 27: {
                                this.y(27);
                                break Label_1594;
                            }
                            case 26: {
                                this.y(26);
                                break Label_1594;
                            }
                            case 43: {
                                this.e((byte)43);
                                break Label_1594;
                            }
                            case 19: {
                                this.e((byte)19);
                                break Label_1594;
                            }
                            case 42: {
                                this.x(42);
                                break Label_1594;
                            }
                            case 2: {
                                this.x(2);
                                break Label_1594;
                            }
                            case 53: {
                                this.x(53);
                                break Label_1594;
                            }
                            case 51: {
                                this.x(51);
                                break Label_1594;
                            }
                            case 52: {
                                this.x(52);
                                break Label_1594;
                            }
                            case 5: {
                                this.x(5);
                                break Label_1594;
                            }
                            case 4: {
                                this.x(4);
                                break Label_1594;
                            }
                            case 6: {
                                this.x(6);
                                break Label_1594;
                            }
                            case 7: {
                                this.x(7);
                                break Label_1594;
                            }
                            case 41: {
                                this.x(41);
                                break Label_1594;
                            }
                            case 47: {
                                this.ch();
                                this.bI();
                                break Label_1594;
                            }
                            case 1: {
                                this.ch();
                                break Label_1594;
                            }
                            case 0: {
                                this.ch();
                                break Label_1594;
                            }
                            case 9: {
                                Label_1566: {
                                    if ((i.b[this.bE][this.bF] & 0xFC00000) == 0x8400000) {
                                        i.c[this.bE][this.bF] = 24;
                                        Label_1532: {
                                            i l;
                                            int aj;
                                            if (this.aj > 0) {
                                                l = this;
                                                aj = this.aj - 1;
                                            }
                                            else {
                                                if (this.aj >= 0) {
                                                    break Label_1532;
                                                }
                                                l = this;
                                                aj = this.aj + 1;
                                            }
                                            l.aj = aj;
                                        }
                                        i m;
                                        int ak;
                                        if (this.ak > 0) {
                                            m = this;
                                            ak = this.ak - 1;
                                        }
                                        else {
                                            if (this.ak >= 0) {
                                                break Label_1566;
                                            }
                                            m = this;
                                            ak = this.ak + 1;
                                        }
                                        m.ak = ak;
                                    }
                                }
                                this.ch();
                                break Label_1594;
                            }
                            case 8: {
                                this.ch();
                                break Label_1594;
                            }
                            case 23: {
                                i2 = this;
                                n7 = 23;
                                break;
                            }
                            case 22: {
                                i2 = this;
                                n7 = 22;
                                break;
                            }
                        }
                        i2.o(n7, n5);
                    }
                }
                j = this;
                be = this.bE + 1;
            }
            i = this;
            bf = this.bF - 1;
        }
    }
    
    private void bG() {
        final int be = this.bE;
        final int bf;
        int n2 = 0;
        Label_0079: {
            final int n;
            int n3 = 0;
            switch ((n = i.b[be][(bf = this.bF) + 1]) & 0x7) {
                case 4: {
                    n2 = be + 1;
                    break Label_0079;
                }
                case 2: {
                    n3 = be;
                    break;
                }
                default: {
                    if ((n & 0x10) == 0x0) {
                        n2 = be + 1;
                        break Label_0079;
                    }
                    n3 = be;
                    break;
                }
            }
            n2 = n3 - 1;
        }
        final int n4 = n2;
        final int n5 = (i.b[be][bf] >> 24) * 3;
        byte[] array;
        int n6;
        int n7;
        if (i.a[n4][bf] < 0) {
            i.e[n5 + 2] = (byte)bf;
            i.e[n5 + 1] = (byte)n4;
            array = i.e;
            n6 = n5 + 0;
            n7 = (byte)n4;
        }
        else {
            array = i.e;
            n6 = n5 + 2;
            n7 = -1;
        }
        array[n6] = (byte)n7;
    }
    
    private void d(final byte b) {
        final int be = this.bE;
        final int bf = this.bF;
        if (i.b[be][bf] == 6 && (i.a[be][bf] & 0xFF) == 0x6) {
            this.r(i.a[be][bf] >> 8);
        }
        if (i.b[be][bf] <= 0) {
            int n2 = 0;
            Label_0103: {
                final int n;
                int n3;
                if ((n = ((n2 = i.b[be][bf]) & 0x7)) == 2) {
                    n3 = (n2 | 0x10);
                }
                else {
                    if (n != 4) {
                        break Label_0103;
                    }
                    n3 = (n2 & 0xFFFFFFEF);
                }
                n2 = n3;
            }
            final int n4 = bf + 1;
            if (i.a[be][n4] < 0 && (!this.d(be, n4) || this.aW != 0)) {
                i.a[be][bf - 1] = -1;
                i.a[be][n4] = b;
                i.b[be][n4] = ((n2 & 0xFFFFFFF8) | 0x3);
                i.b[be][bf] = (i.b[be][bf - 1] | 0x8);
                i.b[be][n4] = 18;
                final int n5 = bf - 2;
                i.c[be - 1][n5] = 48;
                i.c[be][n5] = 48;
                i.c[be + 1][n5] = 48;
                q(be, bf);
                if (b == 48) {
                    this.bG();
                }
            }
            else {
                if ((n2 & 0x7) == 0x3 && this.d(be, bf + 1)) {
                    this.a(2, 48, 0);
                }
                i.b[be][bf] = ((n2 & 0xFFFFFFF8) | 0x0);
            }
        }
        else {
            final byte[] array = i.b[be];
            final int n6 = bf;
            array[n6] -= 6;
        }
        i.c[be][bf] = 24;
        i.c[be][bf - 1] = 24;
    }
    
    private void bH() {
        final int be = this.bE;
        final int bf = this.bF;
        i.c[be][bf] = 24;
        int n7;
        byte b3;
        byte[] array4 = null;
        if (i.b[be][bf] <= 0) {
            final int n = bf - 1;
            final int n2 = bf + 1;
            final byte b;
            Label_0109: {
                int[] array;
                int n3;
                int n4;
                if ((b = (byte)(i.a[be][n] & 0xFF)) == 34 || b == 37) {
                    array = i.a[be];
                    n3 = n;
                    n4 = 37;
                }
                else {
                    if (b == 35 || !e(be, n)) {
                        break Label_0109;
                    }
                    i.b[be][n] = 18;
                    array = i.a[be];
                    n3 = n;
                    n4 = 35;
                }
                array[n3] = n4;
            }
            final byte b2 = i.a[be][bf];
            if (i.a[be][n] < 0 && !this.d(be, n) && b == 35 && b2 != 32 && b2 != 21 && i.a[be][bf] != -1) {
                i.b[be][n] = 18;
                i.a[be][n] = i.a[be][bf];
                i.b[be][n] = ((i.b[be][bf] & 0xFFFFFFF8) | 0x1);
                i.a[be][bf] = -1;
                this.b(be, bf);
            }
            else {
                this.c(be, bf);
            }
            if ((i.a[be][n2] & 0xFF) != 0x23 && i.a[be][n2] != 47) {
                int[] array2;
                int n5;
                int n6;
                if (i.a[be][bf] == 37) {
                    array2 = i.a[be];
                    n5 = bf;
                    n6 = 34;
                }
                else {
                    array2 = i.a[be];
                    n5 = bf;
                    n6 = -1;
                }
                array2[n5] = n6;
            }
            i.c[be][n] = 24;
            if (i.a[be][bf] >= 0) {
                return;
            }
            final byte[] array3 = i.b[be];
            n7 = bf;
            b3 = 18;
        }
        else {
            array4 = i.b[be];
            b3 = (byte)(array4[n7 = bf] - 6);
        }
        array4[n7] = b3;
    }
    
    private static boolean e(final int n, final int n2) {
        final byte b = i.a[n][n2];
        final int n3 = i.a[n][n2] & 0xFF;
        return b < 80 && b != 30 && b != 10 && b != 37 && b != 34 && b != 35 && n3 != 14 && n3 != 33 && n3 != 15 && n3 != 4 && n3 != 16;
    }
    
    private static boolean f(final int n, final int n2) {
        final byte b = i.a[n][n2];
        final int n3 = i.a[n][n2] & 0xFF;
        return b == -1 && n3 != 14 && n3 != 33 && n3 != 5 && n3 != 28;
    }
    
    private static boolean g(final int n, final int n2) {
        final byte b = i.a[n][n2];
        final int n3 = i.a[n][n2] & 0xFF;
        return b == -1 && n3 != 14 && n3 != 33 && n3 != 4 && n3 != 32 && (n3 != 7 || (i.a[n][n2] >> 8 & 0xF0) != 0x0);
    }
    
    private void bI() {
        final int n = this.bF - 1;
        final boolean b = i.e != null && i.e[this.bE][this.bF] != 0 && i.e[this.bE][this.bF - 1] == 0;
        if ((i.b[this.bE][this.bF] & 0x7) == 0x0 && (i.a[this.bE][n] & 0xFF) != 0x23 && e(this.bE, n) && ((!this.d(this.bE - 1, this.bF) && !this.d(this.bE + 1, this.bF)) || (this.aS & 0x8) == 0x0) && (i.a[this.bE][this.bF + 1] >= 0 || b)) {
            i.a[this.bE][n] = 35;
            i.b[this.bE][n] = 18;
            i.c[this.bE][n] = 24;
        }
    }
    
    private void bJ() {
        final int be = this.bE;
        final int bf = this.bF;
        int n = i.b[be][bf] & 0x1F;
        int n2 = (i.b[be][bf] & 0x1FE0) >> 5;
        final int a = a(i.a[29], n);
        final boolean b;
        if (b = ((i.a[be][bf] & 0xFF) == 0x23)) {
            if (++n2 > a) {
                n2 = 0;
            }
            i.b[be][bf] = (0x0 | n2 << 5);
            return;
        }
        if (i.a[be][bf + 1] < 0 && n != 8 && n != 9) {
            int n3 = 0;
            switch (n) {
                case 0:
                case 2:
                case 4:
                case 6: {
                    n3 = 8;
                    break;
                }
                default: {
                    n3 = 9;
                    break;
                }
            }
            final int n4 = n3;
            i.b[be][bf + 1] = 18;
            i.a[be][bf + 1] = 46;
            i.a[be][bf] = -1;
            i.b[be][bf + 1] = n4;
            q(be, bf);
            return;
        }
        if (n == 8 || n == 9) {
            final byte[] array = i.b[be];
            final int n5 = bf;
            array[n5] -= 6;
            if (i.b[be][bf] < 0) {
                if (i.a[be][bf + 1] < 0) {
                    i.b[be][bf + 1] = 18;
                    i.a[be][bf + 1] = 46;
                    i.a[be][bf] = -1;
                    i.b[be][bf + 1] = n;
                    q(be, bf);
                    return;
                }
                i.b[be][bf] = ((n == 8) ? 10 : 11);
                i.b[be][bf] = 0;
            }
            else if (a(be, bf, 3, i.b[be][bf], this.aP, this.aQ, this.aS & 0x7, this.aR)) {
                this.a(1, 48, i.b[be][bf] & 0x7);
            }
        }
        else {
            if (this.i(be, bf)) {
                i.a[be][bf] = -1;
                this.p(be, bf);
                q(be, bf);
                return;
            }
            Label_1219: {
                if (this.d(be - 1, bf) || this.d(be + 1, bf) || this.d(be, bf - 1)) {
                    Label_0504: {
                        int n6;
                        if (this.aQ == bf - 1) {
                            n6 = 17;
                        }
                        else if (this.aP == be - 1) {
                            n6 = 16;
                        }
                        else {
                            if (this.aP != be + 1) {
                                break Label_0504;
                            }
                            n6 = 15;
                        }
                        n = n6;
                    }
                    n2 = 0;
                }
                else {
                    final int n7 = this.aS & 0x7;
                    if (this.aP == be && this.aR == 6 && (n7 == 4 || n7 == 2) && this.aQ < bf && i.a[be][bf - 1] < 0 && bf * 24 <= this.as + 320 - 80) {
                        int n8 = 0;
                        switch (n) {
                            case 0:
                            case 2: {
                                n8 = 6;
                                break;
                            }
                            case 1:
                            case 3: {
                                n8 = 7;
                                break;
                            }
                            default: {
                                break Label_1219;
                            }
                        }
                        n = n8;
                        n2 = 0;
                    }
                    else if (this.aQ == bf && this.aR == 6 && (n7 == 1 || n7 == 3) && n >= 0 && n <= 3 && ((this.aP < be && i.a[be - 1][bf] < 0 && be * 24 < this.ar + 240) || (this.aP > be && i.a[be + 1][bf] < 0 && (be + 1) * 24 > this.ar))) {
                        n = ((this.aP < be) ? 4 : 5);
                        n2 = 0;
                    }
                    else {
                        ++n2;
                        Label_1005: {
                            byte[] array2 = null;
                            int n10 = 0;
                            switch (n) {
                                case 4: {
                                    final int n9 = be - 1;
                                    if (i.a[n9][bf] < 0 && n2 == b(i.a[29], 4, 1)) {
                                        i.a[n9][bf] = 21;
                                        i.b[n9][bf] = 4;
                                        i.b[n9][bf] = 18;
                                        array2 = i.c[n9];
                                        n10 = bf;
                                        break;
                                    }
                                    break Label_1005;
                                }
                                case 5: {
                                    final int n11 = be + 1;
                                    if (i.a[n11][bf] < 0 && n2 == b(i.a[29], 5, 1)) {
                                        i.a[n11][bf] = 21;
                                        i.b[n11][bf] = 2;
                                        i.b[n11][bf] = 18;
                                        array2 = i.c[n11];
                                        n10 = bf;
                                        break;
                                    }
                                    break Label_1005;
                                }
                                case 6:
                                case 7: {
                                    final int n12 = bf - 1;
                                    if (i.a[be][n12] < 0 && n2 == b(i.a[29], n, 1)) {
                                        i.a[be][n12] = 21;
                                        i.b[be][n12] = 1;
                                        i.b[be][n12] = 18;
                                        array2 = i.c[be];
                                        n10 = n12;
                                        break;
                                    }
                                    break Label_1005;
                                }
                            }
                            array2[n10] = 24;
                        }
                        if (n2 > a) {
                            n2 = 0;
                            int n13 = 0;
                            switch (this.a(be, bf, this.aP, this.aQ, false)) {
                                case 4: {
                                    n13 = ((this.aQ == bf && n != 4 && be * 24 < this.ar + 240) ? 4 : 0);
                                    break;
                                }
                                case 2: {
                                    n13 = ((this.aQ == bf && n != 5 && (be + 1) * 24 > this.ar) ? 5 : 1);
                                    break;
                                }
                                case 1: {
                                    if (this.aP == be && n != 6 && n != 7 && bf * 24 <= this.as + 320 - 80) {
                                        n = ((n == 2) ? 6 : 7);
                                        break Label_1219;
                                    }
                                    n = ((this.aP < be) ? 2 : 3);
                                    break Label_1219;
                                }
                                default: {
                                    n13 = ((this.aP >= be) ? 1 : 0);
                                    break;
                                }
                            }
                            n = n13;
                        }
                    }
                }
            }
            i.c[be][bf] = 24;
            i.b[be][bf] = ((n & 0x1F) | n2 << 5);
        }
    }
    
    private static int a(final a a, final int n) {
        int n2 = 0;
        final int n3 = a.e[n] & 0xFF;
        for (short n4 = 0; n4 < n3; ++n4) {
            n2 += (a.f[(a.b[n] + n4) * 5 + 1] & 0xFF);
        }
        return n2;
    }
    
    private void bK() {
        final int be = this.bE;
        final int bf = this.bF;
        i.c[be][bf] = 24;
        byte[] array3 = null;
        int n4 = 0;
        int n5 = 0;
        switch ((i.b[be][bf] & 0x38) >> 3) {
            case 0: {
                if ((this.aP != be || (bf + 1) * 24 <= this.as || this.i == 3) && (this.i != 3 || this.m == 0L || i.aN < this.m + (21 - be))) {
                    return;
                }
                int n = bf + 1;
                while (true) {
                    final byte b = i.a[be][n];
                    if (this.aQ == n || b >= 80 || b == 30 || b == 34 || b == 35 || b == 0) {
                        break;
                    }
                    ++n;
                }
                if (this.aQ == n || this.i == 3) {
                    i.b[be][bf] = ((i.b[be][bf] & 0xFFFFFFC7) | 0x8);
                    i.b[be][bf] = 10;
                }
                return;
            }
            case 1: {
                final byte[] array = i.b[be];
                final int n2 = bf;
                --array[n2];
                if (i.b[be][bf] <= 0) {
                    i.a[be][bf] = 34;
                    i.b[be][bf] = ((i.b[be][bf] & 0xFFFFFFC0) | 0x18 | 0x3);
                    i.b[be][bf] = 0;
                }
                return;
            }
            case 3: {
                if (i.b[be][bf] > 0) {
                    final byte[] array2 = i.b[be];
                    final int n3 = bf;
                    array2[n3] -= 5;
                    return;
                }
                final boolean d = this.d(be, bf + 1);
                boolean b2 = false;
                if (d || i.a[be][bf + 1] >= 0 || (this.j && i.e[be][bf + 1] != 0)) {
                    if (d) {
                        this.a(1, 48, 0);
                        b2 = true;
                    }
                    else {
                        b2 = true;
                        switch (i.a[be][bf + 1]) {
                            case 10: {
                                i.a[be][bf + 1] = 32;
                                this.b(be, bf + 1);
                                b2 = false;
                                break;
                            }
                            case 19:
                            case 43:
                            case 45:
                            case 46:
                            case 49: {
                                this.p(be, bf + 1);
                                i.a[be][bf + 1] = -1;
                                break;
                            }
                            case 30: {
                                this.C(11);
                                i.b[be][bf + 1] = 1;
                                break;
                            }
                            case 18: {
                                this.c();
                                break;
                            }
                            case 21: {
                                b2 = false;
                                break;
                            }
                            default: {
                                this.C(14);
                                break;
                            }
                        }
                    }
                }
                if (b2) {
                    i.b[be][bf] = ((i.b[be][bf] & 0xFFFFFFC0) | 0x20);
                    i.b[be][bf] = 0;
                    return;
                }
                i.a[be][bf] = -1;
                i.a[be][bf + 1] = 44;
                i.b[be][bf + 1] = i.b[be][bf];
                array3 = i.b[be];
                n4 = bf + 1;
                n5 = 19;
                break;
            }
            case 4: {
                if ((i.aN & 0x1) != 0x0) {
                    return;
                }
                final byte[] array4 = i.b[be];
                final int n6 = bf;
                ++array4[n6];
                if (i.b[be][bf] == i.a[27].a(4)) {
                    array3 = i.a[be];
                    n4 = bf;
                    n5 = -1;
                    break;
                }
                return;
            }
        }
        array3[n4] = (byte)n5;
        q(be, bf);
    }
    
    private void bL() {
        int n = i.a[this.bE][this.bF] >> 8 & 0xFF;
        if ((i.aN & 0x1) == 0x0) {
            ++n;
        }
        else if (n == 1) {
            this.b(this.bE, this.bF);
        }
        int[] array;
        int n2;
        int n3;
        if (n == i.a[16].a(0)) {
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = -1;
        }
        else {
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = (n << 8 | 0x20);
        }
        array[n2] = n3;
        i.c[this.bE][this.bF] = 24;
    }
    
    private void bM() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n = i.a[be][bf] >> 8;
        int n2 = (j(be, bf) || i.a[be][bf] == 47 || i.a[be][bf] == 48) ? 1 : 0;
        int n3 = i.b[be][bf];
        if (n2 == 0 && this.d(be, bf)) {
            n2 = 1;
            n3 = (((this.aS & 0x1000) != 0x0) ? 0 : this.aR);
        }
        if (n2 != 0 && n3 < 12) {
            this.r(n);
            return;
        }
        this.s(n);
    }
    
    private void bN() {
        final int be = this.bE;
        final int bf = this.bF;
        int n = i.b[be][bf];
        final a a = i.a[7];
        ++n;
        final int a2 = a(a, 0);
        if (n >= a2) {
            i.a[be][bf] = -1;
            q(be, bf);
            return;
        }
        if (n == 1) {
            this.C(7);
            q(be, bf);
        }
        else if (n == a2 >> 1) {
            for (int i = -1; i < 2; ++i) {
                for (int j = -1; j < 2; ++j) {
                    final int n2 = be + j;
                    final int n3 = bf + i;
                    Label_0279: {
                        int[] array = null;
                        int n4 = 0;
                        boolean b = false;
                        switch (i.a[n2][n3]) {
                            case 10: {
                                if (this.x != 3) {
                                    break Label_0279;
                                }
                            }
                            case 30:
                            case 37: {
                                array = i.b[n2];
                                n4 = n3;
                                b = true;
                                break;
                            }
                            case 16:
                            case 19:
                            case 43:
                            case 49: {
                                i.a[n2][n3] = -1;
                                this.p(n2, n3);
                                i.c[n2][n3] = 24;
                                break Label_0279;
                            }
                            case 8: {
                                i.a[n2][n3] = 54;
                                array = i.b[n2];
                                n4 = n3;
                                b = false;
                                break;
                            }
                        }
                        array[n4] = (b ? 1 : 0);
                        q(n2, n3);
                    }
                    if (this.d(n2, n3)) {
                        this.a(1, 64, 0);
                    }
                }
            }
        }
        i.b[be][bf] = n;
        i.c[be][bf] = 24;
    }
    
    private void bO() {
        final int be = this.bE;
        final int bf = this.bF;
        if (i.b[be][bf] == 0) {
            if (i.a[be][bf - 1] == 11) {
                i.b[be][bf] = 1;
                this.bS();
            }
        }
        else if (this.d(be, bf - 1)) {
            this.a(1, 64, 0);
        }
    }
    
    private void bP() {
        if (this.aR <= 6 && this.d(this.bE, this.bF)) {
            i.W = 0;
            this.j = 0;
            i.cm = i.a[this.bE][this.bF] >> 8;
            this.j(this.aP + i.g[this.aS & 0x7], this.aQ);
            if (i.cm < 0 || i.cm >= i.m.length) {
                i.cm = -1;
            }
            else {
                this.C(1);
                this.cl = 1;
                this.v(i.cm);
            }
            i.a[this.bE][this.bF] = -1;
        }
    }
    
    private void o(final int n, final int n2) {
        final int be = this.bE;
        final int bf = this.bF;
        final int n3 = (n == 23) ? -1 : 1;
        i.c[be][bf] = 24;
        if (this.aQ == bf) {
            for (int i = 0; i <= n2; ++i) {
                if (this.aP == be + i * n3) {
                    this.a(1, 64, 0);
                }
            }
        }
    }
    
    private void bQ() {
        boolean b = false;
        int n = -1;
        boolean b2 = false;
        switch (this.aD) {
            case 26: {
                b = true;
                this.bm = 25;
                b2 = true;
                break;
            }
            case 24: {
                b2 = true;
                b = true;
                this.bm = 22;
                break;
            }
            case 27: {
                b2 = true;
                b = true;
                this.bm = 23;
                break;
            }
            case 40: {
                b2 = true;
                b = true;
                this.bm = 24;
                break;
            }
            case 42: {
                b2 = true;
                b = true;
                this.n = true;
                this.bm = 11;
                break;
            }
            case 41: {
                if (this.e()) {
                    this.aj = true;
                    this.g();
                }
                this.aZ += this.aC;
                this.P -= this.aC;
                if (this.P <= 0 && !this.e()) {
                    i.a[this.Q][this.R] = -1;
                    this.P = 0;
                }
                n = 3;
                break;
            }
            case 4: {
                n = 2;
                ++this.aU;
                break;
            }
            case 5: {
                ++this.aV;
                n = 1;
                break;
            }
            case 2: {
                ++this.bb;
                b2 = true;
                n = 0;
                break;
            }
            case 6: {
                ++this.ao;
                i.e[this.aP][this.aQ] = -1;
                final int[] array = i.d[this.aP];
                final int aq = this.aQ;
                array[aq] |= 0x100;
                n = 0;
                this.a(this.ap, this.aq, this.aP, this.aQ);
                break;
            }
            case 7: {
                this.a((byte)127);
                n = 4;
                break;
            }
            case 51:
            case 52:
            case 53: {
                this.a(this.ap, this.aq, this.aP, this.aQ);
                n = 0;
                b = true;
                this.g();
                this.f = true;
                i i;
                int s;
                if (this.aD == 53) {
                    i = this;
                    s = 0;
                }
                else if (this.aD == 51) {
                    i = this;
                    s = 1;
                }
                else {
                    i = this;
                    s = 2;
                }
                i.s = s;
                final byte[] j = i.i;
                final int n2 = 2;
                j[n2] |= (byte)(1 << this.s);
                this.G();
                break;
            }
        }
        if (b) {
            this.n(47);
        }
        if (n != -1) {
            this.d(this.aP, this.aQ - 1, n);
        }
        if (b2) {
            i.d[this.X << 1] = (byte)this.aP;
            i.d[(this.X << 1) + 1] = (byte)this.aQ;
            ++this.X;
        }
        this.B();
        this.aD = -1;
    }
    
    private void x(final int ad) {
        final int be = this.bE;
        final int bf = this.bF;
        if (this.aR > 0 || !this.d(be, bf)) {
            return;
        }
        final int n;
        if (((n = (i.a[be][bf] & 0xFF)) == 14 || n == 33) && i.a[be][bf] >> 8 == 255) {
            return;
        }
        Label_0429: {
            i i = null;
            int ab = 0;
            switch (this.aD = ad) {
                case 40: {
                    this.aA = 19;
                    this.aB = 0;
                    i.a[this.bE][this.bF] = -1;
                    this.aD = 40;
                    i.i[10] = 1;
                    break Label_0429;
                }
                case 42: {
                    this.aA = 29;
                    i = this;
                    ab = 0;
                    break;
                }
                case 41: {
                    this.aA = 2;
                    this.aB = 0;
                    this.aC = i.b[this.bE][this.bF];
                    break Label_0429;
                }
                case 4: {
                    this.aA = 24;
                    i = this;
                    ab = 0;
                    break;
                }
                case 5: {
                    this.aA = 25;
                    i = this;
                    ab = 0;
                    break;
                }
                case 2: {
                    this.aA = 3;
                    i = this;
                    ab = 0;
                    break;
                }
                case 53: {
                    this.aA = 32;
                    i = this;
                    ab = 0;
                    break;
                }
                case 51: {
                    this.aA = 30;
                    i = this;
                    ab = 0;
                    break;
                }
                case 52: {
                    this.aA = 31;
                    i = this;
                    ab = 0;
                    break;
                }
                case 6: {
                    if (this.ao < 99) {
                        this.aA = 5;
                        i = this;
                        ab = 0;
                        break;
                    }
                    i.a[be][bf] = 7;
                    i.b[be][bf] = 0;
                    this.x(7);
                    break Label_0429;
                }
                case 7: {
                    if (this.n == i.i[8]) {
                        i.a[be][bf] = 41;
                        i.b[be][bf] = 10;
                        this.aY += 10;
                        this.x(41);
                        break Label_0429;
                    }
                    this.aA = 5;
                    i = this;
                    ab = 1;
                    break;
                }
            }
            i.aB = ab;
        }
        i.a[be][bf] = -1;
        this.B();
    }
    
    private boolean h(final int n, final int n2) {
        return i.a[n][n2] == 28 || (this.aI >= 24 && ((i.a[n][n2 - 1] == 28 && (i.b[n][n2 - 1] & 0x8) == 0x0) || (i.a[n][n2 + 1] == 28 && (i.b[n][n2 + 1] & 0x8) == 0x0))) || (this.aK >= 24 && (i.a[n][n2 - 1] == 28 || i.a[n][n2 + 1] == 28));
    }
    
    private int a(final int n, final int n2, final int n3, final int n4, final boolean b) {
        final int n5 = n - n3;
        final int n6 = n2 - n4;
        final int n7 = (n5 > 0) ? n5 : (-n5);
        final int n8 = (n6 > 0) ? n6 : (-n6);
        int n9 = 0;
        if (n7 > n8) {
            Label_0068: {
                int n10;
                if (n5 > 0) {
                    n10 = 4;
                }
                else {
                    if (n5 >= 0) {
                        break Label_0068;
                    }
                    n10 = 2;
                }
                n9 = n10;
            }
            if (n9 != 0 && (!g(n - i.g[n9], n2) || this.h(n - i.g[n9], n2))) {
                n9 = 0;
            }
        }
        if (n9 == 0) {
            Label_0129: {
                int n11;
                if (n6 > 0) {
                    n11 = 1;
                }
                else {
                    if (n6 >= 0) {
                        break Label_0129;
                    }
                    n11 = 3;
                }
                n9 = n11;
            }
            final int n12 = n2 - i.g[8 + n9];
            if (b && n9 != 0 && (!g(n, n12) || (this.j && i.e[n][n12] != 0) || this.h(n, n12))) {
                n9 = 0;
                Label_0209: {
                    int n13;
                    if (n5 > 0) {
                        n13 = 4;
                    }
                    else {
                        if (n5 >= 0) {
                            break Label_0209;
                        }
                        n13 = 2;
                    }
                    n9 = n13;
                }
                if (n9 != 0 && i.a[n - i.g[n9]][n2] >= 0) {
                    n9 = 0;
                }
            }
        }
        return n9;
    }
    
    private void e(final byte b) {
        final int be = this.bE;
        final int bf = this.bF;
        int n = i.b[be][bf];
        byte b2 = i.b[be][bf];
        int n2 = 0;
        int n3 = 0;
        final boolean b3 = (i.a[be][bf] & 0xFF) == 0x23;
        final boolean b4 = b == 43 && (n & 0xF00) != 0x0;
        if (!b3 && this.i(be, bf)) {
            i.a[be][bf] = -1;
            this.p(be, bf);
            return;
        }
        int n4 = n & 0x7;
        Label_0781: {
            byte[] array;
            int n12;
            byte b5;
            if (b2 <= 0) {
                Label_0610: {
                    if (b3 && b2 <= 6) {
                        if (b2 < 0) {
                            i.b[be][bf] = 0;
                        }
                    }
                    else {
                        q(be, bf);
                        if (b4) {
                            b2 = 18;
                            final int a = this.a(be, bf, this.aP, this.aQ, true);
                            final int n5 = (n & 0xFFFFFFF8) | a;
                            n4 = a;
                            n2 = -i.g[a];
                            n3 = -i.g[a + 8];
                            if (a == 0) {
                                b2 = 0;
                                n3 = (n2 = 0);
                            }
                            n = n5 - 256;
                        }
                        else {
                            Label_0604: {
                                if ((n & 0xFE0000) != 0x0 && (n & 0xF8) == 0x0) {
                                    final int n6 = (n & 0xFE0000) >> 17;
                                    final int n7 = (n & 0x7F000000) >> 24;
                                    if (be == n6 && bf == n7) {
                                        final int n8;
                                        n4 = ((((n8 = (n & 0xFF01FFFF)) & Integer.MIN_VALUE) == 0x0) ? 2 : 1);
                                        n = ((n8 & 0xFFFFFFF8) | n4);
                                        break Label_0610;
                                    }
                                    b2 = 21;
                                    final int a2 = this.a(be, bf, n6, n7, true);
                                    n = ((n & 0xFFFFFFF8) | a2);
                                    n2 = -i.g[a2];
                                    n3 = -i.g[a2 + 8];
                                    if ((n4 = a2) != 0) {
                                        break Label_0610;
                                    }
                                    b2 = 0;
                                }
                                else if (n4 == 0) {
                                    b2 = 21;
                                    final int n9 = (n & 0x7000) >> 12;
                                    n = ((n & 0xFFFFFFF8) | n9);
                                    n4 = n9;
                                    n2 = -i.g[n9];
                                    n3 = -i.g[n9 + 8];
                                    if (!g(be + n2, bf + n3)) {
                                        n3 = (n2 = 0);
                                        b2 = 0;
                                    }
                                    break Label_0610;
                                }
                                else {
                                    b2 = 21;
                                    n2 = -i.g[n4];
                                    n3 = -i.g[n4 + 8];
                                    if (!g(be + n2, bf + n3)) {
                                        while (true) {
                                            int n10 = 0;
                                            int n11 = 0;
                                            switch (n4) {
                                                case 4: {
                                                    n10 = (n & 0xFFFF8FFF);
                                                    n11 = 8192;
                                                    break;
                                                }
                                                case 2: {
                                                    n10 = (n & 0xFFFF8FFF);
                                                    n11 = 16384;
                                                    break;
                                                }
                                                case 1: {
                                                    n10 = (n & 0xFFFF8FFF);
                                                    n11 = 12288;
                                                    break;
                                                }
                                                case 3: {
                                                    n10 = (n & 0xFFFF8FFF);
                                                    n11 = 4096;
                                                    break;
                                                }
                                                default: {
                                                    n = ((n & 0xFFFFFFF8) | 0x0);
                                                    n4 = 0;
                                                    break Label_0604;
                                                }
                                            }
                                            n = (n10 | n11);
                                            continue;
                                        }
                                    }
                                    break Label_0610;
                                }
                            }
                            n3 = (n2 = 0);
                        }
                    }
                }
                if ((n & 0xF8) == 0x0) {
                    i.a[be][bf] = -1;
                    i.a[be + n2][bf + n3] = b;
                    i.c[be + n2][bf + n3] = 48;
                    i.b[be + n2][bf + n3] = b2;
                    i.b[be + n2][bf + n3] = n;
                    break Label_0781;
                }
                if ((i.aN & 0x3) == 0x0) {
                    n = ((n & 0xFFFFFF07) | (n & 0xF8) - 8);
                    if (b == 43 && (n & 0xF8) == 0x0) {
                        n = ((n & 0xFFFFF0FF) | 0xC00);
                    }
                }
                array = i.b[be];
                n12 = bf;
                b5 = 0;
            }
            else {
                if (b2 < 0) {
                    i.b[be][bf] = 0;
                }
                final byte b6 = (byte)(b2 - 3);
                array = i.b[be];
                n12 = bf;
                b5 = b6;
            }
            array[n12] = b5;
        }
        if ((n & 0xF8) == 0x0 && (i.a[0].f < 13 || i.a[0].f > 16) && a(be, bf, n4, i.b[be][bf], this.aP, this.aQ, ((this.aS & 0x1000) == 0x0) ? this.k : 0, this.aR)) {
            this.a(1, 48, n4);
            if (b4) {
                n &= 0xFFFFF0FF;
            }
        }
        i.b[be][bf] = n;
    }
    
    private void bR() {
        int n;
        if ((n = (i.a[this.bE][this.bF] & 0xF0000000) >> 28) == 0) {
            this.C(10);
        }
        if ((i.aN & 0x1) == 0x0) {
            ++n;
        }
        int[] array;
        int n2;
        int n3;
        if (n >= i.a[13].a(0)) {
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = (i.a[this.bE][this.bF] & 0xFFFFFFF);
        }
        else {
            array = i.a[this.bE];
            n2 = this.bF;
            n3 = ((i.a[this.bE][this.bF] & 0xFFFFFFF) | n << 28);
        }
        array[n2] = n3;
        q(this.bE, this.bF);
    }
    
    private void bS() {
        if ((this.i == 3 || this.i == 4 || this.i == 5) && this.af > 0) {
            return;
        }
        if (i.cm >= 0) {
            final byte[] m = i.m;
            final int cm = i.cm;
            --m[cm];
            if (i.m[i.cm] == 0) {
                this.w(i.cm);
            }
        }
    }
    
    private void y(final int n) {
        if ((i.a[this.bE][this.bF] & 0xFF) == 0xE && i.a[this.bE][this.bF] >> 8 == 255) {
            return;
        }
        if (this.d(this.bE, this.bF) && (i.a[0].f == 40 || i.a[0].f == 48)) {
            i.a[this.bE][this.bF] = -1;
            while (true) {
                i i = null;
                int ad = 0;
                switch (n) {
                    case 24: {
                        i.i[9] = 1;
                        this.aA = 7;
                        this.aB = 0;
                        i = this;
                        ad = 24;
                        break;
                    }
                    case 27: {
                        i.i[9] = 2;
                        this.aA = 7;
                        this.aB = 1;
                        i = this;
                        ad = 27;
                        break;
                    }
                    case 26: {
                        i.i[9] = 8;
                        this.aA = 7;
                        this.aB = 2;
                        i = this;
                        ad = 26;
                        break;
                    }
                    default: {
                        this.a(this.ap, this.aq, this.bE, this.bF);
                        return;
                    }
                }
                i.aD = ad;
                continue;
            }
        }
    }
    
    private void bT() {
        final int n;
        if ((n = i.b[this.bE][this.bF]) > 0) {
            final int be = this.bE;
            final int bf = this.bF;
            if (n == 4) {
                for (int i = 1; i < 5; ++i) {
                    final byte b = i.g[i];
                    final byte b2 = i.g[i + 8];
                    if (i.a[be + b][bf + b2] == 30) {
                        final int[] array = i.b[be + b];
                        final int n2 = bf + b2;
                        ++array[n2];
                        i.c[be + b][bf + b2] = 24;
                    }
                }
            }
            else if (n >= 16) {
                i.a[be][bf] = -1;
                q(be, bf);
            }
            i.b[be][bf] = n + 1;
            i.c[be][bf] = 24;
        }
    }
    
    private void bU() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n;
        if ((n = i.b[be][bf]) > 0) {
            if (n >= 8) {
                this.t(be, bf);
                i.a[be][bf] = -1;
                q(be, bf);
            }
            i.b[be][bf] = n + 1;
            i.c[be][bf] = 24;
        }
    }
    
    private void bV() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n;
        if ((n = (i.b[be][bf] & 0xF00) >> 8) != 0) {
            if (n >= 4) {
                i.a[be][bf] = -1;
            }
            else if ((i.aN >> 1 & 0x1) == 0x0) {
                i.b[be][bf] += 256;
            }
        }
        else if (i.e != null && i.e[be][bf] != 0) {
            i.b[be][bf] = ((i.b[be][bf] & 0xFFFFF0FF) | 0x100);
        }
        else if (i.b[be][bf] <= 4) {
            final int n2 = i.b[be][bf];
            i.c[be][bf] = 24;
            final boolean b = (n2 & 0x10) != 0x0;
            Label_0815: {
                final int n3;
                int[] array;
                int n11;
                int n12;
                int n13;
                if ((n3 = (n2 & 0x7)) != 0) {
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    int n7 = 0;
                    int n8 = 0;
                    int n9 = 0;
                    Label_0387: {
                        int n10 = 0;
                        switch (n3) {
                            case 3: {
                                n4 = (b ? 1 : -1);
                                n8 = (b ? 2 : 4);
                                n9 = (b ? 4 : 2);
                                n7 = 1;
                                break Label_0387;
                            }
                            case 2: {
                                n5 = (b ? -1 : 1);
                                n8 = (b ? 1 : 3);
                                n9 = (b ? 3 : 1);
                                n10 = 1;
                                break;
                            }
                            case 1: {
                                n4 = (b ? -1 : 1);
                                n8 = (b ? 4 : 2);
                                n9 = (b ? 2 : 4);
                                n7 = -1;
                                break Label_0387;
                            }
                            case 4: {
                                n5 = (b ? 1 : -1);
                                n8 = (b ? 3 : 1);
                                n9 = (b ? 1 : 3);
                                n10 = -1;
                                break;
                            }
                        }
                        n6 = n10;
                    }
                    if (g(be + n6, bf + n7) && g(be + n4, bf + n5) && g(be + n4 - n6, bf + n5 - n7)) {
                        if (i.b[be][bf] <= 0) {
                            i.b[be + n6][bf + n7] = n2;
                            i.a[be + n6][bf + n7] = 11;
                            i.a[be][bf] = -1;
                            i.b[be + n6][bf + n7] = 18;
                        }
                        break Label_0815;
                    }
                    else {
                        if (g(be + n4, bf + n5)) {
                            i.b[be + n4][bf + n5] = ((n2 & 0xFFFFFFF8) | n8);
                            i.a[be + n4][bf + n5] = 11;
                            i.a[be][bf] = -1;
                            i.b[be + n4][bf + n5] = 18;
                            break Label_0815;
                        }
                        if (g(be + n6, bf + n7)) {
                            if (i.b[be][bf] <= 0) {
                                i.b[be + n6][bf + n7] = n2;
                                i.a[be + n6][bf + n7] = 11;
                                i.a[be][bf] = -1;
                                i.b[be + n6][bf + n7] = 18;
                            }
                            break Label_0815;
                        }
                        else {
                            array = i.b[be];
                            n11 = bf;
                            n12 = (n2 & 0xFFFFFFF8);
                            n13 = n9;
                        }
                    }
                }
                else {
                    Label_0745: {
                        int[] array2;
                        int n14;
                        int n15;
                        if (i.a[be - 1][bf] >= 0) {
                            array2 = i.b[be];
                            n14 = bf;
                            n15 = ((n2 & 0xFFFFFFF8) | (b ? 1 : 3));
                        }
                        else {
                            if (i.a[be][bf + 1] < 0) {
                                break Label_0745;
                            }
                            array2 = i.b[be];
                            n14 = bf;
                            n15 = ((n2 & 0xFFFFFFF8) | (b ? 2 : 4));
                        }
                        array2[n14] = n15;
                    }
                    if (i.a[be + 1][bf] >= 0) {
                        i.b[be][bf] = ((n2 & 0xFFFFFFF8) | (b ? 3 : 1));
                    }
                    if (i.a[be][bf + 1] < 0) {
                        break Label_0815;
                    }
                    array = i.b[be];
                    n11 = bf;
                    n12 = (n2 & 0xFFFFFFF8);
                    n13 = (b ? 4 : 2);
                }
                array[n11] = (n12 | n13);
            }
            q(be, bf);
        }
        if (this.d(be, bf)) {
            this.a(1, 64, 0);
        }
        if (i.b[be][bf] > 0) {
            final byte[] array3 = i.b[be];
            final int n16 = bf;
            array3[n16] -= 5;
        }
    }
    
    private void bW() {
        final int be = this.bE;
        final int bf = this.bF;
        if (i.b[be][bf] > 0) {
            i.a[be][bf] = -1;
            i.a[be][bf] = 32;
            q(be, bf);
            this.t(be, bf);
            i.c[be][bf] = 24;
        }
    }
    
    private void bX() {
        final int be = this.bE;
        final int bf = this.bF;
        i.c[be][bf] = 24;
        int n6;
        byte b3;
        byte[] array2 = null;
        if (i.b[be][bf] == 0) {
            final int n2;
            final int n = (((n2 = i.b[be][bf]) & 0x1) == 0x0) ? -1 : 1;
            byte b = i.a[be + n][bf];
            final int n3 = i.a[be + n][bf] & 0xFF;
            boolean b2 = false;
            Label_0573: {
                final int n4;
                if ((n4 = n2 >> 1) > 0) {
                    if (b < 0 && n3 != 14 && n3 != 33) {
                        i.b[be + n][bf] = (n4 - 1 << 1 | (n2 & 0x1));
                        i.c[be + n][bf] = 30;
                        i.b[be + n][bf] = 18;
                        b = 32;
                        break Label_0573;
                    }
                    if (b == 32) {
                        break Label_0573;
                    }
                    int bf2 = i.b[be + n][bf];
                    int n5 = 0;
                    if (b == 48 && (bf2 & 0x8) != 0x0) {
                        break Label_0573;
                    }
                    switch (b) {
                        case 1:
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                        case 7: {
                            n5 = -n;
                        }
                        case 0:
                        case 8:
                        case 9:
                        case 11:
                        case 14:
                        case 19:
                        case 43:
                        case 47:
                        case 48:
                        case 49: {
                            this.C(12);
                            this.o = 0;
                            this.bi = this.aP - (be + n) + n5;
                            this.bg = be + n;
                            this.bh = bf;
                            if (this.bf == -1) {
                                switch (b) {
                                    case 0:
                                    case 8:
                                    case 9:
                                    case 47: {
                                        bf2 = (bf2 & 0xFFFF8FFF & 0xFFFFFDFF);
                                        break;
                                    }
                                }
                                this.bf = bf2;
                            }
                            if (this.bi < 0) {
                                this.be = ((bf2 & 0xFFFFFFF8) | 0x4);
                                break Label_0573;
                            }
                            this.be = ((bf2 & 0xFFFFFFF8) | 0x2);
                            break Label_0573;
                        }
                        default: {
                            if (b != -1) {
                                break;
                            }
                            break Label_0573;
                        }
                    }
                }
                b2 = true;
            }
            if (b2) {
                for (int i = 1; i <= 3; ++i) {
                    if (i.a[this.aP + n * i][this.aQ] == 32) {
                        i.a[this.aP + n * i][this.aQ] = -1;
                    }
                }
            }
            final byte[] array = i.a[be + n];
            n6 = bf;
            b3 = b;
        }
        else {
            array2 = i.b[be];
            b3 = (byte)(array2[n6 = bf] - 6);
        }
        array2[n6] = b3;
        q(be, bf);
    }
    
    private void bY() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n = i.b[be][bf] & 0x7;
        if ((i.b[be][bf] & 0x8) != 0x0) {
            int n2 = 0;
            switch (n) {
                case 4: {
                    n2 = 12;
                    break;
                }
                case 2: {
                    n2 = 13;
                    break;
                }
                default: {
                    n2 = 14;
                    break;
                }
            }
            if (i.b[be][bf] >= a(i.a[29], n2) || (i.a[this.bE][this.bF] & 0xFF) == 0x23) {
                i.a[be][bf] = -1;
                q(be, bf);
            }
            else {
                final byte[] array = i.b[be];
                final int n3 = bf;
                ++array[n3];
            }
            i.c[be][bf] = 24;
            return;
        }
        if (this.d(be, bf) || (this.d(be + i.g[n], bf + i.g[8 + n]) && i.b[be][bf] <= this.aR)) {
            this.a(1, 48, 0);
        }
        byte b4;
        byte b5;
        byte[] array5 = null;
        if (i.b[be][bf] <= 0) {
            final int n4 = be - i.g[n];
            final int n5 = bf - i.g[n + 8];
            byte b = 24;
            if (n == 4) {
                b = 12;
            }
            byte[] array2;
            byte b2;
            int n6;
            if (i.a[n4][n5] < 0) {
                i.a[n4][n5] = 21;
                i.b[n4][n5] = i.b[be][bf];
                i.b[n4][n5] = b;
                array2 = i.a[be];
                b2 = (byte)bf;
                n6 = -1;
            }
            else if (i.a[n4][n5] == 21) {
                final int n7 = i.b[n4][n5] & 0x7;
                final int n8 = n4 - i.g[n7];
                final int n9 = n5 - i.g[n7 + 8];
                i.a[be][bf] = -1;
                q(be, bf);
                final int n10 = i.b[be][bf];
                if (i.a[n8][n9] < 0) {
                    i.a[n8][n9] = 21;
                    i.b[n8][n9] = i.b[n4][n5];
                    i.b[n8][n9] = 18;
                }
                i.a[n4][n5] = 21;
                i.b[n4][n5] = n10;
                array2 = i.b[n4];
                b2 = (byte)n5;
                n6 = 18;
            }
            else {
                switch (i.a[n4][n5]) {
                    case 19:
                    case 43:
                    case 45:
                    case 46: {
                        i.a[n4][n5] = -1;
                        this.p(n4, n5);
                        break;
                    }
                    case 10:
                    case 30: {
                        if (i.b[n4][n5] < 1) {
                            i.b[n4][n5] = 1;
                            break;
                        }
                        break;
                    }
                }
                final int[] array3 = i.b[be];
                final byte b3 = (byte)bf;
                array3[b3] |= 0x8;
                array2 = i.b[be];
                b2 = (byte)bf;
                n6 = 0;
            }
            array2[b2] = (byte)n6;
            final byte[] array4 = i.c[n4];
            b4 = (byte)n5;
            b5 = 48;
        }
        else {
            array5 = i.b[be];
            b5 = (byte)(array5[b4 = (byte)bf] - 12);
        }
        array5[b4] = b5;
    }
    
    private void p(final int n, final int n2) {
        i.a[n][n2] = ((i.a[n][n2] & 0xFFFFFFF) | 0x10000000);
        this.bS();
    }
    
    private void bZ() {
        final int be = this.bE;
        final int bf = this.bF;
        int n2;
        final int n = ((n2 = i.b[be][bf]) & 0xFF00) >> 8;
        int n3 = ((n2 & 0x8) != 0x0) ? 4 : 2;
        Label_0500: {
            if (n >= 20) {
                if (g(be, bf + 1) || (n3 == 4 && (i.a[be - 1][bf] < 0 || i.a[be - 1][bf] == 16 || i.a[be - 1][bf] == 19 || i.a[be - 1][bf] == 43)) || (n3 == 2 && (i.a[be + 1][bf] < 0 || i.a[be + 1][bf] == 16 || i.a[be + 1][bf] == 19 || i.a[be + 1][bf] == 43))) {
                    i.b[be][bf] = ((n2 & 0xFFFF00FF) | 0x1300);
                }
            }
            else {
                byte[] array;
                int n4;
                int n5;
                if (n > 0) {
                    i.b[be][bf] = ((n2 & 0xFFFF00FF) | n - 1 << 8);
                    array = i.c[be];
                    n4 = bf;
                    n5 = 24;
                }
                else {
                    final byte b;
                    if ((b = i.b[be][bf]) <= 0) {
                        int n6 = be;
                        int n7 = bf;
                        Label_0419: {
                            if (g(be, bf + 1)) {
                                n7 = bf + 1;
                                n3 = 3;
                            }
                            else {
                                if (n3 == 4) {
                                    if (g(be - 1, bf)) {
                                        n6 = be - 1;
                                        break Label_0419;
                                    }
                                    n3 = 0;
                                    if (i.a[be - 1][bf] == 16 || i.a[be - 1][bf] == 19 || i.a[be - 1][bf] == 43) {
                                        break Label_0419;
                                    }
                                }
                                else {
                                    if (g(be + 1, bf)) {
                                        n6 = be + 1;
                                        break Label_0419;
                                    }
                                    n3 = 0;
                                    if (i.a[be + 1][bf] == 16 || i.a[be + 1][bf] == 19 || i.a[be + 1][bf] == 43) {
                                        break Label_0419;
                                    }
                                }
                                n2 = ((n2 & 0xFFFF00FF) | 0x1400);
                            }
                        }
                        if (n6 != be || n7 != bf) {
                            i.a[n6][n7] = 14;
                            q(n6, n7);
                            i.a[be][bf] = -1;
                            i.b[n6][n7] = 18;
                        }
                        i.b[n6][n7] = ((n2 & 0xFFFFFFF8) | n3);
                        break Label_0500;
                    }
                    array = i.b[be];
                    n4 = bf;
                    n5 = (byte)(b - 6);
                }
                array[n4] = (byte)n5;
            }
        }
        if (this.d(be, bf)) {
            this.a(1, 48, n3);
        }
    }
    
    private void ca() {
        final int be = this.bE;
        final int bf = this.bF;
        int n;
        int n2;
        if (i.a[be][bf + 1] != 16) {
            n = 0;
            n2 = -1;
        }
        else {
            n = 1;
            n2 = 0;
        }
        final int n3 = n2;
        byte b = i.b[be][bf + n];
        final int n5;
        final int n4 = (((n5 = i.b[be][bf + n]) & 0x7) == 0x4) ? 4 : 2;
        final boolean b2 = this.d(be - i.g[n4], bf + n) || this.d(be - i.g[n4], bf + n3);
        if (b <= 0 && b2 && this.aR <= 12) {
            b = 36;
        }
        else if (b > 0) {
            if (n == 0) {
                --b;
            }
            if ((b == 11 || (n == 0 && b < 11)) && b2) {
                this.a(1, 48, n5 & 0x7);
            }
            i.c[be][bf] = 24;
        }
        if (this.i(be, bf)) {
            this.C(14);
            i.a[be][bf + n3] = -1;
            this.p(be, bf + n3);
            i.a[be][bf + n] = -1;
            this.p(be, bf + n);
            return;
        }
        i.b[be][bf + n3] = n5;
        i.b[be][bf + n] = n5;
        if (n == 0) {
            i.b[be][bf + n3] = b;
            i.b[be][bf + n] = b;
        }
    }
    
    private void cb() {
        final int n = i.b[this.bE][this.bF];
        final int n2 = this.bF + ((((n & 0x8) == 0x0) ? this.aJ : this.aL) - 1) * (((n & 0x7) == 0x3) ? 1 : -1);
        if (this.d(this.bE, n2)) {
            this.a(2, 48, (int)i.h[this.aS & 0x7]);
        }
        switch (i.a[this.bE][n2]) {
            case -1:
            case 28:
            case 32: {
                break;
            }
            default: {
                this.p(this.bE, n2);
                i.a[this.bE][n2] = -1;
                q(this.bE, n2);
                this.b(this.bE, n2);
                break;
            }
        }
        i.c[this.bE][this.bF] = 24;
    }
    
    private void cc() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n = i.a[be][bf] >> 8;
        final int n2 = i.a[be][bf] & 0xFF;
        final int f;
        if ((n & 0x100) == 0x0 && ((n2 == 9 && this.aU > 0) || (n2 == 8 && this.aV > 0)) && this.aQ == bf && (this.aP == be - 1 || this.aP == be + 1) && (f = i.a[0].f) != 18 && f != 17 && this.aR <= 6) {
            final byte b = 0;
            this.j = b;
            this.k = b;
            i i;
            int n3;
            if (this.aP == be - 1) {
                this.aS = ((this.aS & 0xFFFFFFF8) | 0x2);
                i = this;
                n3 = 18;
            }
            else {
                this.aS = ((this.aS & 0xFFFFFFF8) | 0x4);
                i = this;
                n3 = 17;
            }
            i.n(n3);
            i j;
            int aa;
            if (n2 == 9) {
                j = this;
                aa = 24;
            }
            else {
                j = this;
                aa = 25;
            }
            j.aA = aa;
            this.aB = 0;
        }
    }
    
    private void cd() {
        final int be = this.bE;
        final int bf = this.bF;
        int n2;
        final int n;
        if ((n = ((n2 = i.a[be][bf] >> 8) & 0xF0) >> 4) != 0) {
            if (i.aN % 3 == 0 && n < 3) {
                n2 = ((n2 & 0xFFFFFF0F) | n + 1 << 4);
                if (n == 2) {
                    final int n3;
                    if ((n3 = (i.a[be][bf - 1] & 0xFF)) == 9 || n3 == 8) {
                        i.a[be][bf - 1] = ((i.a[be][bf - 1] >> 8 & 0xFFFFFDFF) << 8 | n3);
                    }
                    this.a(be, bf - 1, 1, 0, 0);
                    this.a(be, bf - 1, -1, 0, 0);
                }
                i.c[be][bf] = 24;
            }
            i.a[be][bf] = (n2 << 8 | 0x7);
        }
    }
    
    private void ce() {
        final int be = this.bE;
        final int bf = this.bF;
        int n;
        if ((n = i.a[be][bf] >> 8) < 6) {
            switch (n) {
                case -1: {
                    if (Math.abs(this.aP - be) < 4 && Math.abs(this.aQ - bf) < 4) {
                        n = 3;
                        break;
                    }
                    break;
                }
                case 0:
                case 1: {
                    break;
                }
                case 2: {
                    Label_0183: {
                        switch (this.k) {
                            case 1: {
                                if (this.d(be, bf - 1)) {
                                    break;
                                }
                                break Label_0183;
                            }
                            case 2: {
                                if (this.d(be + 1, bf)) {
                                    break;
                                }
                                break Label_0183;
                            }
                            case 3: {
                                if (this.d(be, bf + 1)) {
                                    break;
                                }
                                break Label_0183;
                            }
                            case 4: {
                                if (this.d(be - 1, bf)) {
                                    break;
                                }
                                break Label_0183;
                            }
                        }
                        n = 3;
                    }
                    break;
                }
                default: {
                    if ((i.aN & 0x1) == 0x0) {
                        ++n;
                        break;
                    }
                    break;
                }
            }
            i.c[be][bf] = 24;
            i.a[be][bf] = (n << 8 | 0x3);
            return;
        }
        i.c[be][bf] = 0;
    }
    
    private void z(final int n) {
        final int be = this.bE;
        final int bf = this.bF;
        final int n2 = i.a[be][bf] >> 8;
        i.a[be][bf] = (n2 << 8 | n);
        if (i.b[be][bf] <= 0) {
            if (n2 == 0) {
                if (this.d(be, bf) && this.aR <= 0) {
                    this.aS &= 0xFFFFF7FF;
                    i.a[be][bf] = (0x100 | n);
                    i i;
                    int n3;
                    if (Math.abs(this.k - System.currentTimeMillis()) >= 5000L) {
                        i = this;
                        n3 = 40;
                    }
                    else {
                        i = this;
                        n3 = 48;
                    }
                    i.n(n3);
                    this.C(3);
                }
            }
            else if ((i.aN >> 1 & 0x1) == 0x0 && i.a[(n == 14) ? 8 : 22] != null && n2 < i.a[(n == 14) ? 8 : 22].a(0) - 1) {
                i.a[be][bf] = (n2 + 1 << 8 | n);
                i.c[be][bf] = 24;
            }
        }
    }
    
    private boolean i(final int n, final int n2) {
        final int n3 = n2 - 1;
        final int n4 = n - 1;
        final int n5 = n + 1;
        return (i.b[n][n3] <= 6 && ((j(n, n3) && ((i.b[n][n3] & 0x7) == 0x3 || (i.a[n][n2] != 16 && i.a[n][n3] != 1))) || i.a[n][n3] == 46 || i.a[n][n3] == 14 || i.a[n][n3] == 48)) || (i.b[n5][n2] <= 0 && i.a[n5][n2] == 14 && (i.b[n5][n2] & 0x8) != 0x0 && (i.b[n5][n2] & 0x7) != 0x3) || (i.b[n4][n2] <= 0 && i.a[n4][n2] == 14 && (i.b[n4][n2] & 0x8) == 0x0 && (i.b[n4][n2] & 0x7) != 0x3);
    }
    
    private static boolean j(final int n, final int n2) {
        if (i.a[n][n2] >= 0) {
            switch (i.a[n][n2]) {
                case 0:
                case 1:
                case 8:
                case 9: {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static void q(final int n, final int n2) {
        final int n3 = n - 1;
        final int n4 = n + 1;
        final int n5 = n2 - 1;
        final int n6 = n2 + 1;
        i.c[n3][n5] = 48;
        i.c[n][n5] = 48;
        i.c[n4][n5] = 48;
        i.c[n3][n2] = 48;
        i.c[n][n2] = 48;
        i.c[n4][n2] = 48;
        i.c[n3][n6] = 48;
        i.c[n][n6] = 48;
        i.c[n4][n6] = 48;
    }
    
    private void cf() {
        this.h = i.i[10];
        this.ch = this.cf;
        this.cg = this.ce;
        this.U = this.P;
        this.bZ = this.ax;
        this.bX = this.aZ;
        this.bY = this.bb;
        this.bS = this.aP;
        this.bT = this.aQ;
        this.bU = this.aU;
        this.bV = this.aV;
        this.bW = this.an;
        this.Y = this.X;
        this.ca = this.ab;
        this.cb = this.aa;
        i.cn = i.cm;
        if (i.m != null) {
            System.arraycopy(i.m, 0, i.o, 0, i.m.length);
        }
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(i.b[i], 0, i.c[i], 0, this.aw);
            System.arraycopy(i.b[i], 0, i.d[i], 0, this.aw);
            System.arraycopy(i.a[i], 0, i.e[i], 0, this.aw);
            System.arraycopy(i.a[i], 0, i.d[i], 0, this.aw);
        }
        this.ck();
    }
    
    private void cg() {
        i.cE = -1;
        final int aa = -1;
        this.aC = aa;
        this.aB = aa;
        this.aA = aa;
        this.bg = 0;
        this.bh = 0;
        this.C = true;
        this.ci = this.bS * 24 - 120;
        this.cj = this.bT * 24 - 160 + 40;
        this.bl = 0;
        Label_0147: {
            int[] array;
            int n;
            if (this.o) {
                this.bm = 15;
                this.o = false;
                i.d[37][7] = -1;
                array = i.d[39];
                n = 5;
            }
            else {
                if (!this.p) {
                    break Label_0147;
                }
                this.bm = 17;
                this.p = false;
                i.d[46][7] = -1;
                array = i.d[50];
                n = 7;
            }
            array[n] = -1;
        }
        this.r = false;
        this.am = 70;
        i.i[10] = this.h;
        this.P = this.U;
        this.cf = this.ch;
        this.ce = this.cg;
        this.ax = this.bZ;
        this.bb = this.bY;
        this.aZ = this.bX;
        i.a[0].a(2);
        this.aS = 2;
        this.bj = 0;
        this.aP = this.bS;
        this.aQ = this.bT;
        this.aU = this.bU;
        this.aV = this.bV;
        this.X = this.Y;
        switch (this.i) {
            case 5: {
                this.L();
                break;
            }
            case 3: {
                this.af = 5;
                break;
            }
            case 4: {
                this.ad = 0;
                this.ag = 0;
                this.af = 3;
                this.i = false;
                break;
            }
            case 1: {
                this.aa = this.cb;
                this.ab = this.ca;
                break;
            }
        }
        i.cm = i.cn;
        if (i.m != null) {
            System.arraycopy(i.o, 0, i.m, 0, i.m.length);
        }
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(i.c[i], 0, i.b[i], 0, this.aw);
            System.arraycopy(i.d[i], 0, i.b[i], 0, this.aw);
            System.arraycopy(i.e[i], 0, i.a[i], 0, this.aw);
            System.arraycopy(i.d[i], 0, i.a[i], 0, this.aw);
        }
        for (int n2 = this.aw - 1, j = 1; j < n2; ++j) {
            for (int n3 = this.av - 1, k = 1; k < n3; ++k) {
                final byte b = i.a[k][j];
                final int n4 = i.a[k][j] & 0xFF;
                if ((b > -1 && b < 80) || (n4 > -1 && n4 < 80)) {
                    q(k, j);
                }
            }
        }
        if (i.a[2] != null) {
            i.a[2].a(0);
            i.a[18][63] = -1;
        }
        this.an = this.bW;
        this.B();
        if (this.j) {
            this.cl();
        }
        if (i.e != null) {
            for (int l = 0; l < this.aw; ++l) {
                for (int be = 0; be < this.av; ++be) {
                    if (i.a[be][l] == 48) {
                        this.bE = be;
                        this.bF = l;
                        if ((i.b[be][l] & 0x8) == 0x0) {
                            this.d((byte)48);
                        }
                        else {
                            this.bG();
                        }
                    }
                }
            }
        }
    }
    
    public static void a(final short n, final short n2, final byte b, final int n3) {
        i.a[n][n2] = b;
        i.b[n][n2] = n3;
    }
    
    private static boolean b(final int n, final int n2, final int n3, final int n4) {
        return Math.abs(n - n3) < 24 && Math.abs(n2 - n4) < 24;
    }
    
    private static boolean a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        i.do = (i.dp = 0);
        i.dq = (i.dr = 100);
        if (Math.abs(n - n5) > 1 || Math.abs(n2 - n6) > 1) {
            return false;
        }
        i.do = n * 24 + i.g[n3] * n4;
        i.dp = n2 * 24 + i.g[8 + n3] * n4;
        i.dq = n5 * 24 + i.g[n7] * n8;
        i.dr = n6 * 24 + i.g[8 + n7] * n8;
        return b(i.do, i.dp, i.dq, i.dr);
    }
    
    private void ch() {
        final int be = this.bE;
        final int bf = this.bF;
        byte b = i.b[be][bf];
        int n = i.b[be][bf];
        final byte b2 = i.a[be][bf];
        final boolean b3 = i.e != null && i.e[be][bf] != 0;
        final int n2 = n & 0x7;
        int n3;
        int n4;
        int n5;
        if (b3 && i.e[be][bf] != 3) {
            n3 = -1;
            n4 = 1;
            n5 = bf - 1;
        }
        else {
            n3 = 1;
            n4 = 3;
            n5 = bf + 1;
        }
        final int aq = n5;
        final boolean a = a(be, bf, n2, b, this.aP, this.aQ, ((this.aS & 0x1000) == 0x0) ? this.k : 0, this.aR);
        if (b2 == 1 && a) {
            this.r(be, bf);
            return;
        }
        final boolean b4 = (i.a[be][bf] & 0xFF) == 0x23;
        if (i.a[be][aq] == 9 && b <= 0) {
            final byte b5 = (byte)(i.a[be][aq] & 0xFF);
            final int n6;
            if ((n6 = (i.b[be][aq] & 0xFC00000) >> 22) != 34) {
                if (n6 == 33) {
                    if (b5 == -1) {
                        i.a[be][aq] = 32;
                    }
                    this.aP = be;
                    this.aQ = aq;
                    i.a[be][aq] = -1;
                    this.aR = 0;
                    this.a(2, 48, this.aT = 0);
                }
                else if (i.a[be][aq] == 19 || i.a[be][aq] == 43 || i.a[be][aq] == 45 || i.a[be][aq] == 46 || i.a[be][aq] == 49 || i.a[be][aq] == 11) {
                    i.a[be][aq] = -1;
                    this.p(be, aq);
                }
            }
        }
        if (b <= 0 && !b4) {
            if (n2 == n4 && this.d(be, aq) && f(be, aq)) {
                if ((b2 == 0 || b2 == 9) && n3 > 0) {
                    this.a(2, 48, 0);
                }
                else if (b2 == 1) {
                    i.b[be][aq] = ((n & 0xFFFFFFF8) | 0x3);
                    i.b[be][aq] = 18;
                    i.a[be][aq] = 1;
                    i.a[be][bf] = -1;
                    this.b(be, bf);
                }
                else if (b2 == 8) {
                    n &= 0xFFC1FFFF;
                }
                i.b[be][bf] = ((n & 0xFFFFFFF8) | 0x0);
            }
            else if ((f(be, aq) || i.a[be][aq] == 21) && (!this.d(be, bf) || this.aT > 0) && ((!this.d(be, aq) && !b(i.do, i.dp, i.dq, i.dr - 1)) || this.aT > 0 || this.aW != 0 || (b2 != 0 && n2 == n4))) {
                if (n3 > 0 || (i.e != null && i.e[be][aq] != 0)) {
                    n = ((n + 131072 & 0xFFFFFFF8) | n4);
                    i.b[be][aq] = (n | Integer.MIN_VALUE);
                    i.b[be][aq] = 18;
                    i.a[be][aq] = b2;
                    i.a[be][bf] = -1;
                    q(be, bf);
                    i.c[be][bf + 2 * n3] = 24;
                    this.b(be, bf);
                }
                else {
                    n = ((n & 0xFFC1FFF8) | 0x0);
                    i.b[be][bf] = n;
                    i.b[be][aq] = 0;
                }
            }
            else if (j(be, aq)) {
                if (n3 < 0 && (i.e == null || i.e[be][aq] == 0) && i.a[be][bf + 1] < 0) {
                    i.b[be][bf + 1] = ((n & 0xFFFFFFF8) | 0x3);
                    i.b[be][bf + 1] |= Integer.MIN_VALUE;
                    i.a[be][bf + 1] = b2;
                    i.b[be][bf + 1] = 18;
                    i.a[be][bf] = -1;
                }
                else if (i.b[be][aq] <= 0) {
                    if ((n & 0x3E0000) >> 17 >= 2) {
                        if (b2 == 8) {
                            i.a[be][bf] = 54;
                            i.b[be][bf] = 0;
                            q(be, bf);
                            return;
                        }
                        if (i.a[be][aq] == 8) {
                            i.a[be][aq] = 54;
                            i.b[be][aq] = 0;
                            q(be, aq);
                            return;
                        }
                    }
                    n &= 0xFFC1FFFF;
                    Label_1181: {
                        int n7;
                        int n8;
                        if (f(be - 1, bf) && f(be - 1, aq) && !this.d(be - 1, bf)) {
                            i.b[be][bf] = (byte)(((n & 0x7000) >> 12) + 1);
                            i.c[be][bf] = 24;
                            n7 = (((n & 0xFFFFFFF8) | 0x4) & 0xFFFFF3FF);
                            n8 = 2048;
                        }
                        else {
                            if (!f(be + 1, bf) || !f(be + 1, aq) || this.d(be + 1, bf)) {
                                break Label_1181;
                            }
                            i.b[be][bf] = (byte)(((n & 0x7000) >> 12) + 1);
                            i.c[be][bf] = 24;
                            n7 = (((n & 0xFFFFFFF8) | 0x2) & 0xFFFFF3FF);
                            n8 = 1024;
                        }
                        n = (n7 | n8 | 0x200);
                    }
                    i.b[be][bf] = n;
                }
            }
            else if (b2 == 8) {
                if ((n & 0x3E0000) >> 17 >= 2) {
                    i.a[be][bf] = 54;
                    i.b[be][bf] = 0;
                    q(be, bf);
                    return;
                }
                n &= 0xFFC1FFFF;
            }
            else {
                n = (((n & 0xFFFFF3FF) | 0x0) & 0xFFC1FFFF & 0xFFFFFFF8);
                i.b[be][bf] = n;
            }
        }
        else if (!b4) {
            if ((n & 0x200) == 0x0) {
                byte b6;
                if (n2 != 3 || (i.a[be][bf] & 0xFF) != 0x6 || b > 12) {
                    b6 = (byte)(b - 6);
                }
                else {
                    b6 = (byte)(b - (i.aN & 0x1));
                    i.c[be][bf] = 24;
                }
                Label_1591: {
                    if (b6 == 0 || b6 == 12) {
                        while (true) {
                            int n9 = 0;
                            int n10 = 0;
                            switch (n & 0xC00) {
                                case 2048: {
                                    n9 = (n & 0xFFFFFFC7);
                                    n10 = n - 8;
                                    break;
                                }
                                case 1024: {
                                    n9 = (n & 0xFFFFFFC7);
                                    n10 = n + 8;
                                    break;
                                }
                                default: {
                                    if (b6 != 0) {
                                        break Label_1591;
                                    }
                                    if ((i.a[be][bf] & 0xFF) == 0x6) {
                                        n &= 0xFFFFFE3F;
                                    }
                                    if (n2 != n4) {
                                        break Label_1591;
                                    }
                                    if ((b2 == 0 || b2 == 9) && n3 > 0 && !f(be, bf + 1)) {
                                        t(200);
                                        this.C(14);
                                        this.bj = 10;
                                        if (b2 == 9 && this.aT > 0 && this.d(be, bf)) {
                                            this.a(1, 0, 0);
                                            this.B();
                                        }
                                        final boolean j;
                                        if (!(j = j(be, bf + 1))) {
                                            n = ((n & 0xFFFFFE3F) | 0x40);
                                        }
                                    }
                                    i.c[be][bf] = 30;
                                    if (!this.d(be, aq)) {
                                        n = ((n & 0xFFFFFFF8) | 0x0);
                                    }
                                    break Label_1591;
                                }
                            }
                            n = (n9 | (n10 & 0x38));
                            continue;
                        }
                    }
                }
                i.b[be][bf] = b6;
                i.b[be][bf] = n;
            }
            else {
                int n11 = 0;
                int n12 = 0;
                Label_1636: {
                    int n13;
                    if (n2 == 4) {
                        n13 = -1;
                    }
                    else {
                        if (n2 != 2) {
                            break Label_1636;
                        }
                        n13 = 1;
                    }
                    n11 = n13;
                }
                if (f(be, aq) && !this.d(be, aq)) {
                    byte b7;
                    if ((b7 = (byte)(b - 6)) <= 0) {
                        b7 = 0;
                        n = ((n & 0xFFFFFDFF & 0xFFFFFFF8) | 0x0);
                    }
                    i.b[be][bf] = b7;
                    i.b[be][bf] = n;
                    i.c[be][bf] = 24;
                }
                else if (f(be + n11, bf) && !this.d(be + n11, bf) && f(be + n11, aq) && !this.d(be + n11, aq) && (i.b[be][aq] & 0x200) == 0x0) {
                    if (b >= 6 || (i.aN & 0x3) == 0x0) {
                        ++b;
                    }
                    if (b >= 12) {
                        n &= 0xFFFFFDFF;
                        byte b8;
                        if (n11 != 0) {
                            b8 = 6;
                            i.a[be][bf] = -1;
                            if (f(be + n11, aq)) {
                                b8 = 12;
                                n = ((n & 0xFFFFFFF8) | n4);
                                n12 = n3;
                            }
                        }
                        else {
                            n = ((n & 0xFFFFFFF8) | 0x0);
                            b8 = 0;
                        }
                        i.b[be + n11][bf + n12] = (n | Integer.MIN_VALUE);
                        i.b[be + n11][bf + n12] = b8;
                        i.a[be + n11][bf + n12] = b2;
                        q(be, bf);
                        i.c[be][bf + 2 * n3] = 24;
                    }
                    else {
                        i.b[be][bf] = b;
                        i.b[be][bf] = n;
                        i.c[be][bf] = 24;
                    }
                }
                else {
                    byte b9;
                    if ((b9 = (byte)(b - 6)) <= 0) {
                        b9 = 0;
                        n = ((n & 0xFFFFFDFF & 0xFFFFFFF8) | 0x0);
                    }
                    i.b[be][bf] = b9;
                    i.b[be][bf] = n;
                    i.c[be][bf] = 24;
                    this.c(be, bf);
                }
            }
        }
        final int n14 = n & 0x20000000;
        final byte b10 = i.b[be][bf];
        final int n15 = n & 0x40000000;
        if ((n14 == 0 && b10 != 0) || (n15 == 0 && b3)) {
            this.b(be, bf);
        }
        if ((n14 != 0 && b10 == 0) || (n15 != 0 && !b3)) {
            this.c(be, bf);
        }
        i.b[be][bf] = ((((((n & 0xDFFFFFFF) | ((b10 != 0) ? 536870912 : 0)) & 0xBFFFFFFF) | (b3 ? 1073741824 : 0)) & Integer.MAX_VALUE) | (((((n & 0x200) != 0x0) ? 1 : ((b10 != 0 || n14 != 0) ? 2 : (b3 ? 3 : ((i.a[be][bf] > -1 && i.a[be][bf] < 38) ? 4 : (((f(be - 1, bf) || f(be + 1, bf)) && j(be, bf + 1) && (i.b[be][bf + 1] & 0x7) == 0x0 && be != this.bg && bf != this.bh) ? 6 : 0))))) != 0) ? Integer.MIN_VALUE : 0));
        final int n16;
        if ((n16 = ((i.b[be][bf] & 0x1C0) >> 6) - 1) >= 0 && n16 < 5) {
            i.b[be][bf] = ((i.b[be][bf] & 0xFFFFFE3F) | (i.b[be][bf] + 64 & 0x1C0));
        }
    }
    
    private void r(final int n, final int n2) {
        this.d(n, n2, 3);
        ++this.aZ;
        i.a[n][n2] = -1;
        --this.P;
        this.bi = 0;
        if (this.P == 0) {
            i.a[this.Q][this.R] = -1;
        }
        if (i.a[n][n2 - 1] == -1) {
            this.b(n, n2 - 1);
        }
        this.b(n, n2);
        this.B();
    }
    
    private static a a(final String s, final int n, final int b, final int n2) {
        a a = null;
        try {
            a = new a();
            a.a(a(s, n), 0);
            for (int i = b; i <= n2; ++i) {
                a.a(i, 0, -1, -1);
            }
            a.b = b;
            a.g = null;
            System.gc();
        }
        catch (Exception ex) {}
        return a;
    }
    
    public static a a(final String s, final int n) {
        return a(s, n, 0);
    }
    
    private static a a(final String s, final int n, final int n2) {
        return a(s, n, n2, n2);
    }
    
    private static Image[] a(final String s, final int n) {
        return a(s, n, 0);
    }
    
    private static Image[] a(final String s, final int n, final int n2) {
        a a = null;
        try {
            a = new a();
            a.a(a(s, n), 0);
            a.a(n2, 0, -1, -1);
            a(a, false);
            System.gc();
        }
        catch (Exception ex) {}
        return a.a[n2];
    }
    
    private static Image a(final String s, final int n) {
        Image image = null;
        try {
            final byte[] a = a(s, n);
            image = Image.createImage(a, 0, a.length);
            System.gc();
        }
        catch (Exception ex) {}
        return image;
    }
    
    public static byte[] a(final String name, final int n) {
        byte[] array = null;
        final InputStream resourceAsStream = name.getClass().getResourceAsStream(name);
        try {
            array = new byte[resourceAsStream.read() << 3];
            resourceAsStream.read(array);
            final int b = b(array, n << 3);
            final int b2 = b(array, (n << 3) + 4);
            resourceAsStream.skip(b);
            array = new byte[b2];
            resourceAsStream.read(array);
            resourceAsStream.close();
        }
        catch (Exception ex) {}
        return array;
    }
    
    private void ci() {
        if (a.h == null) {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream("/mc");
            a.h = new byte[256];
            try {
                resourceAsStream.read(a.h);
                resourceAsStream.close();
            }
            catch (Exception ex) {}
        }
    }
    
    public static final int a(final a a, String s, final int n) {
        final int index;
        if (n != -1 && (index = s.indexOf(10)) != -1) {
            s = s.substring(0, index);
        }
        final int index2;
        if ((index2 = s.indexOf(125)) != -1) {
            s = s.substring(0, index2);
        }
        a.a(s);
        return a.c;
    }
    
    public static int a(final a a) {
        return a.e + (a.a[1] & 0xFF);
    }
    
    public static void b(final int c) {
        e.c = c;
    }
    
    private boolean a(final Graphics graphics) {
        ++e.b;
        switch (e.c) {
            case 0: {
                this.A();
                this.a = new e();
                this.cj();
                this.a.e();
                b(1);
                this.al = false;
                break;
            }
            case 1: {
                e.a();
                i.V = false;
                break;
            }
            case 2: {
                e.b();
                this.A();
                i.l = 9;
                this.br = 8;
                this.bs = 0;
                break;
            }
            case 3: {
                this.a.a(graphics);
                break;
            }
            case 4: {
                b(0);
                this.a = null;
                System.gc();
                return false;
            }
        }
        return true;
    }
    
    private void cj() {
        if ((i.j[0] & 0x1) == 0x0) {
            this.al = true;
            final byte[] j = i.j;
            final int n = 0;
            j[n] |= 0x1;
            this.I();
        }
    }
    
    private static int a(final InputStream inputStream) throws IOException {
        return (inputStream.read() & 0xFF) | (inputStream.read() & 0xFF) << 8;
    }
    
    private static int g(int abs) {
        if (abs < 0) {
            abs = Math.abs(abs);
        }
        switch (abs) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 8;
            }
            case 5: {
                return 16;
            }
            case 6: {
                return 32;
            }
            case 7: {
                return 64;
            }
            case 23: {
                return 128;
            }
            case 42: {
                return 256;
            }
            case 35: {
                return 512;
            }
            case 48: {
                return 1024;
            }
            case 49: {
                return 2048;
            }
            case 50: {
                return 4096;
            }
            case 51: {
                return 8192;
            }
            case 52: {
                return 16384;
            }
            case 53: {
                return 32768;
            }
            case 54: {
                return 65536;
            }
            case 55: {
                return 131072;
            }
            case 56: {
                return 262144;
            }
            case 57: {
                return 524288;
            }
            default: {
                return 0;
            }
        }
    }
    
    private void ck() {
        if (!this.j) {
            return;
        }
        if (i.f == null) {
            i.f = new int[this.av][this.aw];
        }
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(i.e[i], 0, i.f[i], 0, this.aw);
        }
        if (i.c == null) {
            i.c = new long[15];
        }
        System.arraycopy(i.a, 0, i.c, 0, i.a.length);
        if (i.d == null) {
            i.d = new long[15];
        }
        System.arraycopy(i.b, 0, i.d, 0, i.b.length);
        this.y = this.x;
        this.dC = this.ds;
        this.dD = this.dt;
        this.dE = this.du;
        this.z = this.v;
        this.dF = this.dx;
        this.dG = this.dy;
        this.dH = this.dz;
        this.A = this.w;
        this.dI = this.dA;
        this.dJ = this.dB;
        i.an = this.am;
        this.dK = this.dv;
        this.dL = this.dw;
    }
    
    private void cl() {
        this.am = i.an;
        this.dv = this.dK;
        this.dw = this.dL;
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(i.f[i], 0, i.e[i], 0, this.aw);
        }
        System.arraycopy(i.c, 0, i.a, 0, i.a.length);
        System.arraycopy(i.d, 0, i.b, 0, i.b.length);
        this.x = this.y;
        this.ds = this.dC;
        this.dt = this.dD;
        this.du = this.dE;
        this.v = this.z;
        this.dx = this.dF;
        this.dy = this.dG;
        this.dz = this.dH;
        this.w = this.A;
        this.dA = this.dI;
        this.dB = this.dJ;
    }
    
    private void cm() {
        if (this.j) {
            this.cn();
            i.e = new int[this.av][this.aw];
            this.bC();
        }
    }
    
    private void cn() {
        if (this.j) {
            i.a = new long[15];
            i.c = new long[15];
            i.b = new long[15];
            i.d = new long[15];
            this.x = 3;
            this.am = true;
            this.ds = -1;
            this.dt = 0;
            this.du = 0;
            this.v = 0;
            this.dx = 0;
            this.dy = 0;
            this.dz = 0;
            this.w = 0;
            this.dA = 0;
            this.dB = -1;
            this.dv = 0;
            this.dw = 0;
        }
    }
    
    private byte a(final byte b, final byte b2, final byte b3, final byte b4) {
        int n;
        byte b5 = (byte)(n = 0);
        byte b6;
        while (true) {
            b6 = (byte)n;
            if (b5 >= 15 || a(b6, (byte)0, (byte)4) == 0) {
                break;
            }
            b5 = (byte)(n = (byte)(b6 + 1));
        }
        if (b6 < 15) {
            this.a(b6, (byte)1, (byte)0, (byte)4);
            this.a(b6, b4, (byte)4, (byte)2);
            this.a(b6, b, (byte)6, (byte)7);
            this.a(b6, b, (byte)27, (byte)7);
            this.a(b6, b2, (byte)13, (byte)7);
            this.a(b6, b3, (byte)20, (byte)7);
            return b6;
        }
        return -1;
    }
    
    private static int a(int n, final byte b, final byte b2, final byte b3) {
        return n = ((n >>>= b * 9 + b2) & ~(-1 << b3));
    }
    
    private void a(final int n, final int n2, final byte b, final byte b2, final byte b3, final byte b4) {
        final int n3;
        final int a = a(n3 = i.e[n][n2], b, b3, b4);
        final byte b5 = (byte)(b * 9 + b3);
        i.e[n][n2] = ((n3 ^ a << b5) | b2 << b5);
        i.c[n][n2] = 24;
        i.c[n][n2 + 1] = 24;
    }
    
    private static int a(final int n, final byte b, final byte b2) {
        return (int)(i.a[n - 1] >>> b & ~(-1L << b2));
    }
    
    private void a(int n, final byte b, final byte b2, final byte b3) {
        final long n2 = a(n, b2, b3);
        --n;
        i.a[n] = ((i.a[n] ^ n2 << b2) | (long)b << b2);
    }
    
    private static int a(final byte b, final byte b2, final byte b3) {
        return (int)(i.b[b] >>> b2 & ~(-1L << b3));
    }
    
    private void a(final byte b, final byte b2, final byte b3, final byte b4) {
        i.b[b] = ((i.b[b] ^ (long)a(b, b3, b4) << b3) | (long)(b2 << b3));
    }
    
    private byte b(final int n, final int n2) {
        int n3;
        byte b = (byte)(n3 = 0);
        while (true) {
            final byte b2 = (byte)n3;
            if (b >= 15) {
                return -1;
            }
            if (n == a(b2, (byte)13, (byte)7) && n2 == a(b2, (byte)20, (byte)7)) {
                return b2;
            }
            b = (byte)(n3 = (byte)(b2 + 1));
        }
    }
    
    private byte a(final int n, final int n2, final byte b) {
        byte b2;
        if ((b2 = this.b(n, n2)) >= 0) {
            this.a(b2, b, (byte)0, (byte)4);
            byte b3 = 0;
            switch (b) {
                case 3: {
                    b3 = 39;
                    break;
                }
                case 1: {
                    b3 = 38;
                    break;
                }
                case 2: {
                    b3 = 39;
                    break;
                }
                default: {
                    return b2;
                }
            }
            b2 = b3;
            return b2;
        }
        return -1;
    }
    
    private void co() {
        if (!this.j) {
            return;
        }
        if (this.ds >= 0 && this.dB >= 0) {
            ++this.ds;
            this.cq();
        }
        Label_0204: {
            switch (this.x) {
                case 2: {
                    int n;
                    byte b = (byte)(n = 1);
                    while (true) {
                        final byte b2 = (byte)n;
                        if (b > 15) {
                            break Label_0204;
                        }
                        switch (a((int)b2, (byte)28, (byte)3)) {
                            case 3: {
                                f(b2);
                                break;
                            }
                            case 2: {
                                if (this.dB >= 0) {
                                    ++this.dB;
                                    this.g(b2);
                                    break;
                                }
                                break;
                            }
                            case 1:
                            case 6:
                            case 7: {
                                this.h(b2);
                                break;
                            }
                        }
                        b = (byte)(n = (byte)(b2 + 1));
                    }
                    break;
                }
                case 1: {
                    this.x = 2;
                    return;
                }
                case 4: {
                    this.cp();
                    this.x = 2;
                    return;
                }
                case 5: {
                    this.u(this.dx, this.dy);
                    break;
                }
            }
        }
    }
    
    private static void f(final byte b) {
        i.a[b - 1] = 0L;
    }
    
    private void cp() {
        int n;
        byte b = (byte)(n = 0);
        while (true) {
            final byte b2 = (byte)n;
            if (b >= 15) {
                break;
            }
            Label_0129: {
                if (a(b2, (byte)0, (byte)4) == 3) {
                    int a = a(b2, (byte)13, (byte)7);
                    int a2 = a(b2, (byte)20, (byte)7);
                    final int a3 = a(b2, (byte)4, (byte)2);
                    i.b[b2] = 0L;
                    byte b3 = 0;
                    byte b4 = 0;
                    while (true) {
                        byte b5 = 0;
                        Label_0108: {
                            byte b6 = 0;
                            switch (a3) {
                                case 0: {
                                    ++a2;
                                    b3 = 0;
                                    b5 = 0;
                                    break Label_0108;
                                }
                                case 1: {
                                    ++a;
                                    b6 = 1;
                                    break;
                                }
                                case 2: {
                                    --a;
                                    b6 = -1;
                                    break;
                                }
                                default: {
                                    this.a(a, a2, (byte)7, b3, b4, this.b(a, a2));
                                    break Label_0129;
                                }
                            }
                            b3 = b6;
                            b5 = 2;
                        }
                        b4 = b5;
                        continue;
                    }
                }
            }
            b = (byte)(n = (byte)(b2 + 1));
        }
    }
    
    private void cq() {
        int a = a((int)this.w, (byte)14, (byte)6);
        int a2 = a((int)this.w, (byte)20, (byte)6);
        i i = null;
        byte b5 = 0;
        byte b7 = 0;
        byte b8 = 0;
        final byte b9;
        switch (a((int)this.w, (byte)47, (byte)2)) {
            case 1: {
                if (a2 == this.dA) {
                    this.ds = -1;
                    this.dB = -1;
                    f(this.w);
                    this.x = 4;
                    return;
                }
                final byte b = (byte)a((int)this.w, (byte)49, (byte)5);
                if (this.ds == 0 || this.ds % b != 0) {
                    return;
                }
                this.ds = 0;
                final byte b2;
                if ((b2 = (byte)a((int)this.w, (byte)26, (byte)2)) < 0) {
                    return;
                }
                int n2;
                int n = n2 = 0;
                while (true) {
                    final int n3 = n2;
                    if (n >= b) {
                        break;
                    }
                    c(a - n3, a2, b2);
                    final byte b3 = b2;
                    int n4 = a2;
                    byte b4;
                    if ((b4 = (byte)(b3 + 1)) > 2) {
                        b4 = 0;
                        ++n4;
                    }
                    final int a3 = a(i.e[a - n3][n4], b4, (byte)3, (byte)4);
                    Label_0270: {
                        if (n4 != this.dA || b2 != 2) {
                            if (a3 == 12 || a3 == 9) {
                                break Label_0270;
                            }
                        }
                        else if (a3 == 0 || a3 == 3) {
                            break Label_0270;
                        }
                        this.a(a - n3, n4, b4, (byte)7, (byte)3, (byte)4);
                    }
                    n = (n2 = (byte)(n3 + 1));
                }
                if (b2 == 2) {
                    this.a((int)this.w, (byte)0, (byte)47, (byte)2);
                    this.a((int)this.w, (byte)0, (byte)26, (byte)2);
                    ++a2;
                    i = this;
                    b5 = this.w;
                    final byte b6 = (byte)a2;
                    b7 = 20;
                    b8 = 6;
                    break;
                }
                i = this;
                b5 = this.w;
                b9 = (byte)(b2 + 1);
                b7 = 26;
                b8 = 2;
                break;
            }
            case 0: {
                this.a((int)this.w, (byte)1, (byte)47, (byte)2);
                final byte b10 = (byte)a((int)this.w, (byte)49, (byte)5);
                final byte b11 = (byte)a((int)this.w, (byte)45, (byte)2);
                byte b12 = 0;
                if (b11 != 0) {
                    if (b11 == 2) {
                        while (a >= this.dx && (byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                            ++a;
                        }
                    }
                    else {
                        while (a <= this.dx && (byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                            ++a;
                        }
                    }
                }
                else if ((byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                    while ((byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                        ++a;
                    }
                }
                else {
                    while (b12 < b10) {
                        ++b12;
                        if ((byte)(i.a[a][a2] - 80) < 0 && i.a[a][a2] != 10 && i.a[a][a2] != 37 && i.a[a][a2] != 34 && i.a[a][a2] != 35) {
                            b12 = b10;
                        }
                        else {
                            --a;
                        }
                    }
                }
                if (this.dz != 2 && a <= this.dx) {
                    while ((byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                        ++a;
                    }
                }
                this.a((int)this.w, (byte)a, (byte)14, (byte)6);
                int n5 = 1;
                while (true) {
                    final int n6 = n5;
                    if ((byte)(i.a[a - n6][a2] - 80) >= 0 || i.a[a - n6][a2] == 10 || i.a[a - n6][a2] == 37 || i.a[a - n6][a2] == 34 || i.a[a - n6][a2] == 35) {
                        break;
                    }
                    n5 = (byte)(n6 + 1);
                }
                i = this;
                b5 = this.w;
                b7 = 49;
                b8 = 5;
                break;
            }
        }
        i.a((int)b5, b9, b7, b8);
    }
    
    private void g(final byte b) {
        int a = a((int)b, (byte)14, (byte)6);
        int a2 = a((int)b, (byte)20, (byte)6);
        final int a3 = a((int)b, (byte)0, (byte)7);
        final int a4 = a((int)b, (byte)7, (byte)7);
        final int a5 = a((int)b, (byte)47, (byte)2);
        final byte b3;
        final byte b2 = (byte)a(b3 = (byte)a((int)b, (byte)54, (byte)3), (byte)6, (byte)7);
        switch (a5) {
            case 1: {
                final byte b4 = (byte)a((int)b, (byte)49, (byte)5);
                if (this.dB == 0 || this.dB % b4 != 0) {
                    break;
                }
                this.dB = 0;
                final byte b5 = (byte)a((int)b, (byte)26, (byte)2);
                final byte b6 = (byte)a((int)b, (byte)57, (byte)1);
                if (b5 < 0) {
                    break;
                }
                if (b6 != 1) {
                    byte b8;
                    byte b7 = b8 = 0;
                    while (true) {
                        final byte b9 = b8;
                        if (b7 >= b4) {
                            break;
                        }
                        this.a(a - b9, a2, b5, (byte)7, (byte)3, (byte)4);
                        this.a((int)b, b5, (byte)43, (byte)2);
                        this.a(a - b9, a2, b5, b, (byte)0, (byte)3);
                        b7 = (b8 = (byte)(b9 + 1));
                    }
                    if (this.dt > 0) {
                        final byte b10 = b5;
                        int n = a2;
                        byte b11;
                        if ((b11 = (byte)(b10 + 1)) > 2) {
                            b11 = 0;
                            ++n;
                        }
                        byte b13;
                        byte b12 = b13 = 0;
                        while (true) {
                            final byte b14 = b13;
                            if (b12 >= b4) {
                                break;
                            }
                            if ((byte)(i.a[a - b14][n] - 80) < 0 && i.a[a - b14][n] != 10 && i.a[a - b14][n] != 37 && i.a[a - b14][n] != 34 && i.a[a - b14][n] != 35) {
                                this.a(a - b14, n, b11, (byte)8, (byte)3, (byte)4);
                            }
                            b12 = (b13 = (byte)(b14 + 1));
                        }
                    }
                    ++this.dt;
                }
                if (b6 == 1 || ((a4 >= a3 || b2 == 0) && b5 == this.v)) {
                    if (b6 == 1) {
                        this.a((int)b, (byte)0, (byte)57, (byte)1);
                    }
                    this.a((int)b, (byte)3, (byte)28, (byte)3);
                    if (b2 == 0) {
                        this.a(b3, (byte)3, (byte)0, (byte)4);
                        this.a((int)b, (byte)5, (byte)28, (byte)3);
                        if (this.ds == -1) {
                            this.dB = -1;
                            this.x = 4;
                        }
                        return;
                    }
                }
                if (b5 == 0) {
                    this.a((int)b, (byte)0, (byte)47, (byte)2);
                    this.a((int)b, (byte)2, (byte)26, (byte)2);
                    return;
                }
                this.a((int)b, (byte)(b5 - 1), (byte)26, (byte)2);
            }
            case 0: {
                this.a((int)b, (byte)1, (byte)47, (byte)2);
                --a2;
                this.a((int)b, (byte)a2, (byte)20, (byte)6);
                if ((byte)(i.a[a][a2] - 80) >= 0 || i.a[a][a2] == 10 || i.a[a][a2] == 37 || i.a[a][a2] == 34 || i.a[a][a2] == 35) {
                    while ((byte)(i.a[a][a2] - 80) >= 0 || i.a[a][a2] == 10 || i.a[a][a2] == 37 || i.a[a][a2] == 34 || i.a[a][a2] == 35) {
                        --a;
                    }
                }
                else {
                    while ((byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                        ++a;
                    }
                }
                this.a((int)b, (byte)a, (byte)14, (byte)6);
                byte b15 = 1;
                byte b16;
                while (true) {
                    b16 = b15;
                    if ((byte)(i.a[a - b16][a2] - 80) >= 0 || i.a[a - b16][a2] == 10 || i.a[a - b16][a2] == 37 || i.a[a - b16][a2] == 34 || i.a[a - b16][a2] == 35) {
                        break;
                    }
                    b15 = (byte)(b16 + 1);
                }
                this.a((int)b, b16, (byte)49, (byte)5);
                byte a6 = (byte)(b2 - b16);
                byte b17 = 0;
                this.v = 0;
                if (a6 < 0) {
                    final int n2 = -a6 * 3;
                    byte b18 = 0;
                    final int n3;
                    final int n4;
                    if ((n3 = b16 + a6) * 3 - b16 != 0 && (n4 = n3 * 3) <= b16 * 3 / 2) {
                        b18 = 1;
                    }
                    this.v = (byte)(n2 / b16);
                    this.v += b18;
                    if (this.v > 2) {
                        this.a((int)b, (byte)1, (byte)57, (byte)1);
                    }
                    b17 = (byte)Math.abs(a6);
                    a6 = 0;
                }
                int n5;
                if ((n5 = a4 + (b16 - b17)) > a3) {
                    final int n6 = a3 - n5;
                    n5 += n6;
                    a6 -= (byte)n6;
                }
                this.a((int)b, (byte)n5, (byte)7, (byte)7);
                this.a(b3, a6, (byte)6, (byte)7);
                break;
            }
        }
    }
    
    private byte a(final byte b, int n, final int n2, final byte b2, final byte b3, final byte b4, final boolean b5) {
        byte b6;
        if ((byte)(i.a[n + b4][n2] - 80) >= 0 || i.a[n + b4][n2] == 10 || i.a[n + b4][n2] == 37 || i.a[n + b4][n2] == 34 || i.a[n + b4][n2] == 35) {
            b6 = -2;
        }
        else {
            if (b2 != (b6 = b4)) {
                this.a((int)b, (byte)((b4 < 0) ? 2 : b4), (byte)45, (byte)2);
            }
            n += b4;
            this.a((int)b, (byte)n, (byte)31, (byte)6);
            this.a(n, n2, b3, b, (byte)0, (byte)3);
            if (b5) {
                c(n, n2, b3);
            }
            else {
                final int a = a((int)b, (byte)28, (byte)3);
                int n3;
                byte b7;
                if (b4 > 0) {
                    n3 = ((a == 6 && this.dx == n && this.dy == n2) ? 11 : 4);
                    b7 = 9;
                }
                else {
                    n3 = ((a == 6 && this.dx == n && this.dy == n2) ? 14 : 5);
                    b7 = 12;
                }
                final byte b8 = b7;
                i i;
                int n4;
                int n5;
                byte b9;
                int n6;
                if ((byte)(i.a[n][n2 + 1] - 80) >= 0 || i.a[n + b4][n2] == 10 || i.a[n + b4][n2] == 37 || i.a[n + b4][n2] == 34 || i.a[n + b4][n2] == 35) {
                    i = this;
                    n4 = n;
                    n5 = n2;
                    b9 = b3;
                    n6 = n3;
                }
                else {
                    i = this;
                    n4 = n;
                    n5 = n2;
                    b9 = b3;
                    n6 = b8;
                }
                i.a(n4, n5, b9, (byte)n6, (byte)3, (byte)4);
            }
        }
        return b6;
    }
    
    private boolean d(final int n) {
        return n != -1 && a(n, (byte)6, (byte)1) == 1;
    }
    
    private static byte a(final int n, final byte b, final byte b2) {
        return (byte)(n >>> b & ~(16777215 << b2));
    }
    
    private static boolean a(int n, final int n2, final int n3) {
        int n4 = 1;
        int n5 = 1;
    Label_0003:
        while (true) {
            int n6 = n5;
            while (n6) {
                n6 = 1;
                n -= n3;
                if (n3 == 0) {
                    if ((byte)(i.a[n - 1][n2] - 80) >= 0 || i.a[n - 1][n2] == 10 || i.a[n - 1][n2] == 37 || i.a[n - 1][n2] == 34 || (i.a[n - 1][n2] == 35 && (byte)(i.a[n + 1][n2] - 80) >= 0) || i.a[n + 1][n2] == 10 || i.a[n + 1][n2] == 37 || i.a[n + 1][n2] == 34 || i.a[n + 1][n2] == 35) {
                        n4 = 1;
                        n5 = 0;
                        continue Label_0003;
                    }
                    continue;
                }
                else {
                    if ((byte)(i.a[n][n2 + 1] - 80) < 0 && i.a[n][n2 + 1] != 10 && i.a[n][n2 + 1] != 37 && i.a[n][n2 + 1] != 34 && i.a[n][n2 + 1] != 35) {
                        n6 = 0;
                    }
                    if ((byte)(i.a[n][n2] - 80) >= 0 || i.a[n][n2] == 10 || i.a[n][n2] == 37 || i.a[n][n2] == 34 || i.a[n][n2] == 35) {
                        n4 = n6;
                        n5 = 0;
                        continue Label_0003;
                    }
                    if (n6 == 0) {
                        return n6 != 0;
                    }
                    continue;
                }
            }
            return n4 != 0;
        }
    }
    
    private void h(final byte b) {
        int a = a((int)b, (byte)31, (byte)6);
        final int a2 = a((int)b, (byte)37, (byte)6);
        final byte b2 = (byte)a((int)b, (byte)43, (byte)2);
        final byte b3 = (byte)a(i.e[a][a2], b2, (byte)7, (byte)2);
        byte b4 = (byte)a((int)b, (byte)45, (byte)2);
        final boolean b5 = (byte)a((int)b, (byte)28, (byte)3) == 7;
        byte b6 = 0;
        if (b4 > 1) {
            b4 = -1;
        }
        if (b3 == 0) {
            byte b7 = (byte)(b2 + 1);
            int n = a2;
            if (b2 == 2) {
                b7 = 0;
                n = a2 + 1;
            }
            if (a(i.e[a][n], b7, (byte)3, (byte)4) == 7) {
                this.dt = 1;
                if (b5) {
                    f(b);
                    this.x = 3;
                    this.am = true;
                    return;
                }
                int n2;
                if ((n2 = b7 - 1) < 0) {
                    n2 = 2;
                }
                this.dB = 0;
                final byte b8 = (byte)a(i.e[a][n], b7, (byte)0, (byte)3);
                this.a((int)b8, (byte)a((int)b, (byte)54, (byte)3), (byte)54, (byte)3);
                this.a((int)b8, (byte)2, (byte)28, (byte)3);
                this.a((int)b8, (byte)0, (byte)47, (byte)2);
                this.a((int)b8, (byte)n2, (byte)26, (byte)2);
                this.a((int)b8, (byte)a, (byte)14, (byte)6);
                this.a((int)b8, (byte)n, (byte)20, (byte)6);
                this.a((int)b8, (byte)0, (byte)57, (byte)1);
                f(b);
                return;
            }
        }
        if (b2 == 2 && b3 == 0) {
            if ((byte)(i.a[a][a2 + 1] - 80) >= 0 || i.a[a][a2 + 1] == 10 || i.a[a][a2 + 1] == 37 || i.a[a][a2 + 1] == 34 || i.a[a][a2 + 1] == 35) {
                Label_0563: {
                    i i;
                    byte b9;
                    int n3;
                    int n4;
                    byte b10;
                    byte b11;
                    byte b12;
                    if (b4 == 0) {
                        if (b5) {
                            c(a, a2, b2);
                        }
                        else {
                            this.a(a, a2, b2, (byte)15, (byte)3, (byte)4);
                        }
                        if ((b6 = this.a(b, a, a2, b4, b2, (byte)1, b5)) < 0) {
                            i = this;
                            b9 = b;
                            n3 = a;
                            n4 = a2;
                            b10 = b4;
                            b11 = b2;
                            b12 = -1;
                        }
                        else {
                            if ((byte)(i.a[a - 1][a2] - 80) < 0 && i.a[a - 1][a2] != 10 && i.a[a - 1][a2] != 37 && i.a[a - 1][a2] != 34 && i.a[a - 1][a2] != 35) {
                                this.a(a - 1, a2, (byte)(b5 ? 7 : 5), (byte)(-1), (byte)2, (byte)a((int)b, (byte)54, (byte)3));
                            }
                            break Label_0563;
                        }
                    }
                    else {
                        i = this;
                        b9 = b;
                        n3 = a;
                        n4 = a2;
                        b10 = b4;
                        b11 = b2;
                        b12 = b4;
                    }
                    b6 = i.a(b9, n3, n4, b10, b11, b12, b5);
                }
                if (b6 == -2) {
                    final int n5 = i.b[a][a2 + 1];
                    i j;
                    byte b13;
                    byte b14;
                    byte b15;
                    byte b16;
                    if (this.d(n5) && a(a, a2, (int)b4)) {
                        this.dt = 0;
                        this.dB = 0;
                        this.a((int)b, (byte)2, (byte)28, (byte)3);
                        this.a((int)b, a(n5, (byte)0, (byte)6), (byte)0, (byte)7);
                        this.a((int)b, (byte)2, (byte)26, (byte)2);
                        this.a((int)b, (byte)a, (byte)14, (byte)6);
                        j = this;
                        b13 = b;
                        b14 = (byte)(a2 + 1);
                        b15 = 20;
                        b16 = 6;
                    }
                    else {
                        j = this;
                        b13 = b;
                        b14 = 3;
                        b15 = 28;
                        b16 = 3;
                    }
                    j.a((int)b13, b14, b15, b16);
                    a += b4;
                }
                else {
                    b4 = b6;
                    a += b4;
                }
            }
            else if (b4 != 0) {
                b4 = 0;
                this.a((int)b, (byte)0, (byte)45, (byte)2);
            }
        }
        if (b6 != -2) {
            switch (b4) {
                case 0: {
                    this.a(b, a, a2, b2, b5);
                }
                case -1:
                case 1: {
                    this.a(a, a2, b2, b3);
                    break;
                }
            }
        }
    }
    
    private void a(final int n, final int n2, final byte b, final byte b2) {
        byte b3;
        if ((b3 = (byte)(b2 + 1)) > 2) {
            b3 = 0;
        }
        this.a(n, n2, b, b3, (byte)7, (byte)2);
    }
    
    private void a(final byte b, final int n, int n2, final byte b2, final boolean b3) {
        if (!b3 && a(i.e[n][n2], b2, (byte)3, (byte)4) == 0) {
            this.a(n, n2, b2, (byte)3, (byte)3, (byte)4);
        }
        byte b4;
        if ((b4 = (byte)(b2 + 1)) > 2) {
            b4 = 0;
            ++n2;
            this.a((int)b, (byte)n2, (byte)37, (byte)6);
        }
        this.a((int)b, b4, (byte)43, (byte)2);
        i i;
        int n3;
        int n4;
        byte b5;
        byte b6;
        if (b3) {
            i = this;
            n3 = n;
            n4 = n2;
            b5 = b4;
            b6 = 6;
        }
        else {
            this.a(n, n2, b4, b, (byte)0, (byte)3);
            i = this;
            n3 = n;
            n4 = n2;
            b5 = b4;
            b6 = 0;
        }
        i.a(n3, n4, b5, b6, (byte)3, (byte)4);
    }
    
    private void s(final int n, final int n2) {
        this.x = 1;
        this.a(n, n2 + 1, (byte)0, (byte)0, (byte)0, this.b(n, n2));
    }
    
    private static void c(final int n, final int n2, final byte b) {
        final int n3 = i.e[n][n2];
        final byte b2 = (byte)(b * 9);
        i.e[n][n2] = (n3 ^ (n3 >>> b2 & 0x1FF) << b2);
        i.c[n][n2] = 24;
    }
    
    private byte a(final int n, final int n2, final byte b, byte b2, final byte b3, final byte b4) {
        int n3;
        byte b5 = (byte)(n3 = 1);
        byte b6;
        while (true) {
            b6 = (byte)n3;
            if (b5 > 15 || a((int)b6, (byte)28, (byte)3) == 0) {
                break;
            }
            b5 = (byte)(n3 = (byte)(b6 + 1));
        }
        i.a[b6 - 1] = 0L;
        if (b == 7) {
            c(n, n2, b3);
            this.a((int)b6, (byte)7, (byte)28, (byte)3);
        }
        else {
            this.a((int)b6, (byte)1, (byte)28, (byte)3);
            this.a((int)b6, b4, (byte)54, (byte)3);
            this.a(n, n2, b3, b6, (byte)0, (byte)3);
            this.a(n, n2, b3, b, (byte)3, (byte)4);
        }
        this.a((int)b6, (byte)n, (byte)31, (byte)6);
        this.a((int)b6, (byte)n2, (byte)37, (byte)6);
        this.a((int)b6, b3, (byte)43, (byte)2);
        if (b2 < 0) {
            b2 = 2;
        }
        this.a((int)b6, b2, (byte)45, (byte)2);
        return b6;
    }
    
    private int a(final int n, final int n2, final int n3, final byte b) {
        final byte b2;
        final int a = a((int)(b2 = (byte)a(n3, b, (byte)0, (byte)3)), (byte)31, (byte)6);
        final int a2 = a((int)b2, (byte)37, (byte)6);
        final int a3 = a((int)b2, (byte)43, (byte)2);
        int a4 = a(n3, b, (byte)3, (byte)4);
        if (a == n && a2 == n2 && a3 == b) {
            int n4 = 0;
            switch (a4) {
                case 4: {
                    n4 = 1;
                    break;
                }
                case 5: {
                    n4 = 2;
                    break;
                }
                default: {
                    return a4 << 1;
                }
            }
            a4 = n4;
            return a4 << 1;
        }
        switch (a4) {
            case 6: {
                c(n, n2, b);
                break;
            }
        }
        return a4 << 1;
    }
    
    private void t(final int dx, final int dy) {
        if (this.j) {
            this.dz = ((i.e[dx - 1][dy] != 0) ? -1 : ((i.e[dx + 1][dy] != 0) ? 1 : 0));
            if (this.dz == 0) {
                this.dz = ((i.e[dx][dy - 1] != 0) ? 2 : 0);
            }
            if (this.dz != 0) {
                this.x = 5;
                this.C(13);
                this.dx = dx;
                this.dy = dy;
            }
        }
    }
    
    private int f(int n, int n2) {
        byte a = 0;
        int n3 = 1;
        final int dz = this.dz;
        int n4 = 0;
    Label_0309:
        while (true) {
            int n5 = 0;
            while ((i.e[n + dz][n2 - 1] != 0 && (byte)(i.a[n][n2] - 80) >= 0) || i.a[n][n2] == 10 || i.a[n][n2] == 37 || i.a[n][n2] == 34 || i.a[n][n2] == 35) {
                n += dz;
            }
            int n6 = 0;
            int a2;
            while (true) {
                a2 = n6;
                if ((byte)(i.a[n + a2][n2] - 80) >= 0 || i.a[n + a2][n2] == 10 || i.a[n + a2][n2] == 37 || i.a[n + a2][n2] == 34 || i.a[n + a2][n2] == 35) {
                    break;
                }
                if (n3 != 0) {
                    n3 = 0;
                    a = this.a(n, n2, (byte)8, (byte)(-2), (byte)2, (byte)0);
                    this.a((int)a, (byte)5, (byte)28, (byte)3);
                    this.a((int)a, (byte)n, (byte)14, (byte)6);
                    this.a((int)a, (byte)n2, (byte)20, (byte)6);
                }
                this.a(n + a2, n2, (byte)2, a, (byte)0, (byte)3);
                n6 = a2 + dz;
            }
            final int abs = Math.abs(a2);
            n4 += abs;
            ++n2;
            while (i.e[n][n2] == 0) {
                n += dz;
                if (n5 >= abs || n < 0 || n == this.av) {
                    break Label_0309;
                }
                ++n5;
            }
        }
        if (n4 > 0) {
            this.a((int)a, (byte)n4, (byte)7, (byte)7);
        }
        return n4;
    }
    
    private void u(final int dx, final int dy) {
        this.ds = 0;
        int[] array;
        int n;
        if (this.dz > 1) {
            array = i.e[dx];
            n = dy - 1;
        }
        else {
            array = i.e[dx + this.dz];
            n = dy;
        }
        this.a((int)(this.w = (byte)a(array[n], (byte)2, (byte)0, (byte)3)), (byte)0, (byte)47, (byte)2);
        final int a = a((int)this.w, (byte)7, (byte)7);
        int n2 = 0;
        int n3 = 0;
        int da = 0;
        int n4 = 0;
        int n5 = 0;
        switch (this.dz) {
            case 2: {
                n2 = 0;
                n3 = dx;
                da = dy;
                n4 = a;
                n5 = dy - 1;
                final int n6 = -1;
                this.dy = n6;
                this.dx = n6;
                break;
            }
            default: {
                final int dz = this.dz;
                n3 = dx + dz;
                n2 = ((dz < 0) ? 1 : 2);
                da = dy + 1;
                n4 = a - this.f(n3, da);
                n5 = dy;
                this.dx = dx;
                this.dy = dy;
                break;
            }
        }
        this.a((int)this.w, (byte)n2, (byte)45, (byte)2);
        this.dA = da;
        this.a((byte)n4, (byte)n3, (byte)n5, (byte)n2);
        byte b = this.b(n3, n5);
        this.a(b, (byte)2, (byte)0, (byte)4);
        this.x = 1;
        while (true) {
            i i = null;
            int n7 = 0;
            int n8 = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            Label_0324: {
                switch (this.dz) {
                    case 2: {
                        i = this;
                        n7 = n3;
                        n8 = dy;
                        b2 = 3;
                        b3 = 0;
                        b4 = 0;
                        break Label_0324;
                    }
                    case 1: {
                        i = this;
                        n7 = n3 - 1;
                        n8 = dy;
                        b2 = 14;
                        b3 = -1;
                        break;
                    }
                    case -1: {
                        i = this;
                        n7 = n3 + 1;
                        n8 = dy;
                        b2 = 11;
                        b3 = 1;
                        break;
                    }
                    default: {
                        this.a((int)b, (byte)6, (byte)28, (byte)3);
                        this.dz = 0;
                        return;
                    }
                }
                b4 = 2;
            }
            b = i.a(n7, n8, b2, b3, b4, b);
            continue;
        }
    }
    
    private void v(final int n, final int n2) {
        if (this.a(n, n2, (byte)2) > 0) {
            i.a[n][n2] = -1;
            this.s(n, n2);
        }
    }
    
    private static int b(final a a, final int n) {
        return a.c[(n << 2) + 3] & 0xFF;
    }
    
    private static int c(final a a, final int n) {
        return a.c[(n << 2) + 2] & 0xFF;
    }
    
    private static void A(int n) {
        try {
            i.a = ((n <= 5) ? a("/tips.f", n) : null);
            final ByteArrayInputStream byteArrayInputStream;
            final int read = (byteArrayInputStream = new ByteArrayInputStream(a("/tipst.f", 0))).read();
            n %= read;
            final byte[] b = new byte[(read + 1) * 2];
            byteArrayInputStream.read(b);
            final int a = a(b, n << 1);
            final int a2 = a(b, n + 1 << 1);
            byteArrayInputStream.skip(a);
            byteArrayInputStream.read(i.f = new byte[a2 - a]);
            byteArrayInputStream.close();
        }
        catch (Exception ex) {}
    }
    
    private void cr() {
        i.a[41].e = 5;
        int n = 0;
        final byte[] f = i.f;
        final int n2 = 0;
        ++n;
        final byte b = f[n2];
        this.Q = false;
        final Graphics a;
        (a = this.a).setColor(798521);
        a.fillRoundRect(20, 60, 200, 200, 8, 8);
        a.setColor(13540096);
        a.drawRoundRect(20, 60, 200, 200, 8, 8);
        int n3 = 0;
        int n4 = 1;
        for (byte b2 = 0; b2 <= b; ++b2) {
            if (b2 == b) {
                if (n4 == 0) {
                    return;
                }
                n4 = 0;
                b2 = -1;
                n = 1;
                n3 -= 4;
                n3 = 60 + (200 - n3 >> 1);
            }
            else {
                Label_0328: {
                    int n8;
                    int a3;
                    if (i.f[n++] == 0) {
                        n += 2;
                        n += 2;
                        final int a2 = a(i.f, n);
                        n += 2;
                        final int n5 = n;
                        int n6 = n + a2;
                        final byte b3 = i.f[n6++];
                        final int n7 = n6;
                        n = n6 + b3;
                        n3 -= 3;
                        n8 = n3;
                        a3 = this.a(a, i.f, i.a[41], n5, a2, (n4 != 0) ? -1 : n3, i.a, n7, 192);
                    }
                    else {
                        n += 2;
                        n += 2;
                        final int n9 = i.f[n++] & 0xFF;
                        if (i.a == null) {
                            break Label_0328;
                        }
                        if (n4 == 0) {
                            i.a.a(a, n9, (240 - i.a.c[(n9 << 2) + 2] & 0xFF) >> 1, n3, 0, 0, 0);
                        }
                        n8 = n3;
                        a3 = (i.a.c[(n9 << 2) + 3] & 0xFF);
                    }
                    n3 = n8 + a3;
                }
                n3 += 4;
            }
        }
    }
    
    private static void a(final Graphics graphics, final a a, String s, final int n, final int n2, final int n3, final int e, final boolean b) {
        a.e = e;
        if (s.endsWith("\n")) {
            s = s.substring(0, s.length() - 1);
        }
        s = a(s, 230);
        final int a2 = a(a, s, b ? -1 : 0);
        final int a3 = a.a(s);
        int n4 = n;
        int n5 = n2;
        Label_0098: {
            int n6;
            int n7;
            if ((n3 & 0x20) != 0x0) {
                n6 = n5;
                n7 = a3;
            }
            else {
                if ((n3 & 0x2) == 0x0) {
                    break Label_0098;
                }
                n6 = n5;
                n7 = a3 >> 1;
            }
            n5 = n6 - n7;
        }
        Label_0129: {
            int n8;
            int n9;
            if ((n3 & 0x8) != 0x0) {
                n8 = n4;
                n9 = a2;
            }
            else {
                if ((n3 & 0x1) == 0x0) {
                    break Label_0129;
                }
                n8 = n4;
                n9 = a2 >> 1;
            }
            n4 = n8 - n9;
        }
        graphics.setColor(798521);
        graphics.fillRoundRect(n4 - 5, n5 - 5, a2 + 10, a3 + 10, 10, 10);
        graphics.setColor(13540096);
        graphics.drawRoundRect(n4 - 5, n5 - 5, a2 + 10, a3 + 10, 10, 10);
        a.b(graphics, s, n, n2, n3);
    }
    
    private int a(final Graphics graphics, final byte[] array, final a a, final int n, final int n2, int n3, final a a2, final int n4, final int n5) {
        int n6 = 0;
        n3 -= a.d[2];
        int n7 = a.e + (a.a[1] & 0xFF);
        int n8 = 0;
        int n9 = n3;
        final boolean b = n3 != -1;
        final int b2 = a.b;
        int n10 = n;
        boolean b3 = true;
        int n11 = n;
        int n12 = 0;
        for (int i = n; i <= n + n2; ++i) {
            int n13 = 10;
            if (i < n + n2) {
                n13 = (array[i] & 0xFF);
            }
            if (b3 && n8 > n5) {
                n8 = n12;
                array[n11] = 10;
                i = n11 - 1;
            }
            else if (n13 == 10) {
                if (b3 && b) {
                    n8 = 120 - (n8 >> 1);
                    i = n10 - 1;
                    n6 = 0;
                }
                else {
                    n8 = 0;
                    n10 = i + 1;
                    n9 += n7;
                    n7 = a.e + (a.a[1] & 0xFF);
                }
                if (b) {
                    b3 = !b3;
                }
            }
            else {
                int n15 = 0;
                int n16 = 0;
                Label_0545: {
                    byte[] h;
                    int n14;
                    if (n13 > 32) {
                        if (n13 == 64 && a2 != null) {
                            if (!b3 && b) {
                                a2.a(graphics, array[n6 + n4], n8, n9, 0, 0, 0);
                            }
                            n8 += c(a2, array[n6 + n4]);
                            final int b4;
                            if ((b4 = b(a2, array[n6 + n4])) > n7) {
                                n7 = b4;
                            }
                            ++n6;
                            continue;
                        }
                        h = a.h;
                        n14 = n13;
                    }
                    else {
                        if (n13 == 32) {
                            n11 = i;
                            n12 = n8;
                            n15 = n8;
                            n16 = (a.a[0] & 0xFF);
                            break Label_0545;
                        }
                        if (n13 == 1) {
                            ++i;
                            a.b = array[i];
                            continue;
                        }
                        if (n13 != 2) {
                            continue;
                        }
                        ++i;
                        h = array;
                        n14 = i;
                    }
                    final int n17;
                    int n19;
                    int n20;
                    if ((n17 = (h[n14] & 0xFF)) >= a.b(0)) {
                        final int n18 = n17 - a.b(0);
                        if (!b3 && b) {
                            a.a(graphics, n18, n8, n9, 0, 0, 0);
                        }
                        n15 = n8;
                        n19 = (a.c[(n18 << 2) + 2] & 0xFF);
                        n20 = (a.c[n18 << 2] & 0xFF);
                    }
                    else {
                        final int n21 = (a.d[n17 << 2] & 0xFF) << 1;
                        if (!b3 && b) {
                            a.a(graphics, 0, n17, n8, n9, 0);
                        }
                        n15 = n8;
                        n19 = (a.a[n21] & 0xFF);
                        n20 = a.d[(n17 << 2) + 1];
                    }
                    n16 = n19 - n20;
                }
                n8 = n15 + (n16 + a.d[1]);
            }
        }
        a.b = b2;
        return n9 - n3;
    }
    
    private void cs() {
        this.G = false;
        a(i.a[23], true);
        i.a[23] = null;
        a(i.a[24], true);
        i.a[24] = null;
        a(i.a[25], true);
        i.a[25] = null;
        a(i.a[26], true);
        i.a[26] = null;
        a(i.a[17], true);
        i.a[17] = null;
        this.c = null;
        i.g = null;
        i.c = null;
        System.gc();
    }
    
    private void ct() {
        this.g();
        this.av = true;
        this.aw = true;
        this.ao = true;
        i.l = 21;
        this.bs = 0;
        this.br = 14;
        this.dM = 100;
        if (this.aq > this.b(this.ap)) {
            this.aq = this.b(this.ap);
        }
        this.cu();
    }
    
    private void cu() {
        i.a = new long[12][12];
        this.c = new int[20];
    }
    
    private static int a(long n, final byte b, final byte b2) {
        return (int)(n = ((n >>>= b) & ~(-1L << b2)));
    }
    
    private void a(final int n, final int n2, final int n3, final byte b, final byte b2) {
        final long n4;
        i.a[n][n2] = ((n4 ^ (long)a(n4 = i.a[n][n2], b, b2) << b) | (long)n3 << b);
    }
    
    private void cv() {
        if (this.av) {
            i.g = Image.createImage(186, 226);
        }
        if (this.aw) {
            this.aw = false;
            this.ax = true;
            this.cB();
            this.cA();
        }
        if (this.ax) {
            this.a.drawImage(i.g, 27, 56, 0);
            this.cC();
            this.cz();
            this.cw();
            this.cx();
        }
        if (this.ax && this.dX == this.dZ && this.dY == this.ea) {
            this.ax = false;
        }
    }
    
    private void cw() {
        final int a;
        a a2;
        Graphics graphics;
        StringBuffer sb;
        int n;
        if ((a = a(i.a[this.dX][this.dY], (byte)6, (byte)5)) < this.dM) {
            a2 = i.a[41];
            graphics = this.a;
            sb = new StringBuffer().append(i.a.toString());
            n = a;
        }
        else {
            a2 = i.a[41];
            graphics = this.a;
            sb = new StringBuffer().append(i.b.toString());
            n = a - this.dM;
        }
        a2.a(graphics, sb.append(n + 1).toString(), 8, 45, 6);
    }
    
    private void cx() {
        if (this.dX != this.dZ || this.dY != this.ea) {
            return;
        }
        final int a = a(i.a[this.dX][this.dY], (byte)6, (byte)5);
        int b = this.b(this.ap, a);
        final int c = this.c(this.ap, a);
        if (b > c) {
            b = c;
        }
        i.c.delete(0, i.c.length());
        i.c.append(b);
        i.c.append('/');
        i.c.append(c);
        i.a[41].a(i.c.toString());
        final int n = a.c + 6 + 14;
        final int n2 = 37 + this.dX * 13 + 6;
        final int n3 = 73 + this.dY * 13 + 6;
        int n4 = n2 - (n >> 1) + 0;
        int n5;
        if ((n5 = n3 - 17 - 31) <= 63) {
            n5 = 63;
            if ((n4 = n2 + 20) + n >= 200) {
                n4 = n2 - n - 20;
            }
        }
        if (n4 <= 35) {
            n4 = 35;
        }
        if (n4 + n >= 200) {
            n4 = 150;
        }
        a(this.a, n4, n5, n, 17, 37042, 0);
        i.a[41].a(this.a, i.c.toString(), n4 + 2, n5 + 2 - 1, 20);
        if (i.a[17] != null) {
            i.a[17].a(this.a, 10, n4 + n - 2 - 14, n5 + 2 - 1, 0, 0, 0);
        }
    }
    
    private void cy() {
        this.en = 0;
        this.ek = 0;
        this.el = 0;
        this.as = false;
        this.ar = true;
        this.aq = false;
        this.em = 2;
        this.eo = 2;
        this.at = false;
    }
    
    private boolean g() {
        boolean b = false;
        final int n = this.ek >> 1;
        i i;
        int em;
        if (this.em < 0) {
            i = this;
            em = 2;
        }
        else {
            i = this;
            em = this.em - 1;
        }
        i.em = em;
        if (this.dZ == 0 && this.ea == 0) {
            this.dZ = this.dX;
            this.ea = this.dY;
        }
        if (this.em == 0) {
            boolean b2;
            if (this.el == n) {
                b2 = true;
            }
            else {
                ++this.el;
                b2 = false;
            }
            b = b2;
        }
        final int a = a(i.a[this.dX][this.dY], (byte)3, (byte)3);
        final int a2 = a(i.a[this.dZ][this.ea], (byte)3, (byte)3);
        int n2 = 0;
        while (true) {
            final int n3;
            int n4 = 0;
            switch (n3 = ((a == 1 || a2 == 1) ? 1 : a)) {
                case 0: {
                    n4 = 2;
                    break;
                }
                case 1: {
                    n4 = 8;
                    break;
                }
                default: {
                    int j = 0;
                    for (int n5 = this.at ? (n - 1) : 0, n6 = this.at ? -1 : 1; j < this.el; ++j, n5 += n6) {
                        final int n7 = n5 * 2;
                        i.a[17].a(this.a, n2, this.c[n7], this.c[n7 + 1], 0, 0, 0);
                    }
                    int n8 = 0;
                    int n9 = 0;
                    while (true) {
                        int n10 = 0;
                        switch (a) {
                            case 0: {
                                n9 = 0;
                                n10 = 0;
                                break;
                            }
                            case 1: {
                                n9 = 2;
                                n10 = 9;
                                break;
                            }
                            default: {
                                final int n11 = this.dX * 13 + n9 + 37;
                                final int n12 = this.dY * 13 + n9 + 73;
                                i.a[17].a(this.a, n8, n11, n12, 0, 0, 0);
                                i.a[17].a(this.a, this.ap ? 7 : 6, n11 + 6, n12 + 6, 0, 0, 0);
                                boolean b3 = true;
                                if (j == n) {
                                    i k;
                                    int eo;
                                    if (this.eo < 0) {
                                        k = this;
                                        eo = 2;
                                    }
                                    else {
                                        k = this;
                                        eo = this.eo - 1;
                                    }
                                    k.eo = eo;
                                    if (this.eo == 0) {
                                        this.eo = 1;
                                        b3 = false;
                                    }
                                }
                                Label_0573: {
                                    if (!b3) {
                                        int n13 = 0;
                                        switch (a2) {
                                            case 0: {
                                                n9 = 0;
                                                n13 = 0;
                                                break;
                                            }
                                            case 1: {
                                                n9 = 2;
                                                n13 = 9;
                                                break;
                                            }
                                            default: {
                                                break Label_0573;
                                            }
                                        }
                                        n8 = n13;
                                    }
                                    else {
                                        int n14 = 0;
                                        switch (a2) {
                                            case 0: {
                                                n9 = 0;
                                                n14 = 1;
                                                break;
                                            }
                                            case 1: {
                                                n9 = 2;
                                                n14 = 5;
                                                break;
                                            }
                                            default: {
                                                break Label_0573;
                                            }
                                        }
                                        n8 = n14;
                                    }
                                }
                                final int n15 = this.dZ * 13 + n9 + 37;
                                final int n16 = this.ea * 13 + n9 + 73;
                                i.a[17].a(this.a, n8, n15, n16, 0, 0, 0);
                                if (!b3) {
                                    boolean b4;
                                    if (this.en == i.a[9].a(0)) {
                                        --this.en;
                                        this.as = true;
                                        b4 = true;
                                    }
                                    else {
                                        b4 = false;
                                    }
                                    b = b4;
                                    if (!this.O) {
                                        i.a[9].a(this.a, this.en, n15, n16, 0, 0, 0);
                                    }
                                    ++this.en;
                                }
                                return b;
                            }
                        }
                        n8 = n10;
                        continue;
                    }
                }
            }
            n2 = n4;
            continue;
        }
    }
    
    private void cz() {
        final int n = 37 + this.dX * 13 + 6;
        final int n2 = 73 + this.dY * 13 + 6;
        if (this.dX != this.dZ || this.dY != this.ea) {
            final int n3 = 37 + this.dZ * 13 + 6;
            final int n4 = 73 + this.ea * 13 + 6;
            if (((this.a(this.ap, this.aq + 1) & 0x2) != 0x0 && this.aq + 1 == i.eb) || this.aq == i.eb) {
                this.aq = true;
            }
            if (!this.aq) {
                this.aq = this.g();
                if (this.aq) {
                    this.aw = true;
                }
            }
            else if (this.c(n, n2, n3, n4)) {
                this.dX = this.dZ;
                this.dY = this.ea;
            }
        }
        else if (this.ax) {
            i.a[17].a(this.a, this.ap ? 7 : 6, n, n2, 0, 0, 0);
        }
    }
    
    private boolean c(final int do1, final int dp, int n, int n2) {
        if (this.ao) {
            this.ao = false;
            this.dO = do1;
            this.dP = dp;
            this.dQ = 0;
            this.dR = n - do1;
            this.dS = n2 - dp;
            this.dT = 0;
            this.dU = 0;
            this.dV = 10;
            this.dW = 10;
        }
        if (this.dR < 0) {
            this.dV = -10;
            this.dR = -this.dR;
        }
        if (this.dS < 0) {
            this.dW = -10;
            this.dS = -this.dS;
        }
        this.ap = (this.dV <= 0);
        final int n3 = this.ap ? 7 : 6;
        if (this.dS <= this.dR) {
            this.dT = 2 * this.dR;
            this.dU = 2 * this.dS;
            if ((this.dV < 0 && this.dO <= n) || (this.dV > 0 && this.dO >= n)) {
                n = 37 + this.dZ * 13 + 6;
                n2 = 73 + this.ea * 13 + 6;
                i.a[17].a(this.a, n3, n, n2, 0, 0, 0);
                return this.ao = true;
            }
            i.a[17].a(this.a, n3, this.dO, this.dP, 0, 0, 0);
            this.dO += this.dV;
            this.dQ += this.dU;
            if (this.dQ <= this.dR) {
                return false;
            }
            this.dP += this.dW;
        }
        else {
            this.dT = 2 * this.dS;
            this.dU = 2 * this.dR;
            if ((this.dW < 0 && this.dP <= n2) || (this.dW > 0 && this.dP >= n2)) {
                n = 37 + this.dZ * 13 + 6;
                n2 = 73 + this.ea * 13 + 6;
                i.a[17].a(this.a, n3, n, n2, 0, 0, 0);
                return this.ao = true;
            }
            i.a[17].a(this.a, n3, this.dO, this.dP, 0, 0, 0);
            this.dP += this.dW;
            this.dQ += this.dU;
            if (this.dQ <= this.dS) {
                return false;
            }
            this.dO += this.dV;
        }
        this.dQ -= this.dT;
        return false;
    }
    
    private void a(final int n, final int n2, final long n3, final int n4, final int n5) {
        final int a = a(n3, (byte)6, (byte)5);
        this.dN |= 1 << a;
        for (int a2 = a(n3, (byte)11, (byte)3), n6 = 14, i = 0; i < a2; ++i, n6 += 4) {
            int ec = 37 + n * 13;
            int ed = 73 + n2 * 13;
            final int a3 = a(n3, (byte)n6, (byte)4);
            n6 += 4;
            final int a4 = a(n3, (byte)n6, (byte)4);
            final int n7 = a3;
            final int n8 = a4;
            final long n9;
            final int a5 = a(n9 = i.a[n7][n8], (byte)6, (byte)5);
            if ((this.dN & 1 << a5) <= 0) {
                int n10 = 37 + n7 * 13;
                int n11 = 73 + n8 * 13;
                ec += 6;
                ed += 6;
                n10 += 6;
                n11 += 6;
                this.ec = ec;
                this.ed = ed;
                this.ee = 0;
                this.ef = n10 - ec;
                this.eg = n11 - ed;
                this.eh = 0;
                this.ei = 0;
                this.ej = 1;
                int n12 = 1;
                int n13 = 1;
                if (this.ef < 0) {
                    n12 = -1;
                    this.ef = -this.ef;
                }
                if (this.eg < 0) {
                    n13 = -1;
                    this.eg = -this.eg;
                }
                int n14 = 0;
                int a6 = a(n9, (byte)0, (byte)3);
                int a7 = a(n9, (byte)3, (byte)3);
                if (n4 == 1) {
                    a7 = n4;
                }
                if (n5 == 1) {
                    if (a7 == 1) {
                        continue;
                    }
                    a6 = n5;
                }
                if (!this.as && a5 == i.eb) {
                    a6 = 1;
                }
                Label_0411: {
                    if (a6 == 0) {
                        int n15 = 0;
                        switch (a7) {
                            case 0: {
                                n15 = 2;
                                break;
                            }
                            case 1: {
                                n15 = 8;
                                break;
                            }
                            default: {
                                break Label_0411;
                            }
                        }
                        n14 = n15;
                    }
                    else {
                        int n16 = 0;
                        switch (a7) {
                            case 0: {
                                n16 = 3;
                                break;
                            }
                            case 1: {
                                n16 = 4;
                                break;
                            }
                            default: {
                                break Label_0411;
                            }
                        }
                        n14 = n16;
                    }
                }
                if (this.eg <= this.ef) {
                    this.eh = this.ef << 1;
                    this.ei = this.eg << 1;
                    while (true) {
                        if (this.ej % 8 == 0) {
                            i.a[17].a(i.c, n14, this.ec - 27, this.ed - 56, 0, 0, 0);
                            if (this.ar) {
                                this.w(a, a5);
                            }
                        }
                        if (this.ec == n10) {
                            break;
                        }
                        this.ec += n12;
                        this.ee += this.ei;
                        if (this.ee > this.ef) {
                            this.ed += n13;
                            this.ee -= this.eh;
                        }
                        ++this.ej;
                    }
                }
                else {
                    this.eh = 2 * this.eg;
                    this.ei = 2 * this.ef;
                    while (true) {
                        if (this.ej % 8 == 0) {
                            i.a[17].a(i.c, n14, this.ec - 27, this.ed - 56, 0, 0, 0);
                            if (this.ar) {
                                this.w(a, a5);
                            }
                        }
                        if (this.ed == n11) {
                            break;
                        }
                        this.ed += n13;
                        this.ee += this.ei;
                        if (this.ee > this.eg) {
                            this.ec += n12;
                            this.ee -= this.eh;
                        }
                        ++this.ej;
                    }
                }
            }
        }
    }
    
    private void w(final int n, final int n2) {
        i i;
        if (!this.au) {
            final int a = a(i.a[this.cx][this.cy], (byte)6, (byte)5);
            if ((n2 != i.eb || n != a) && (n != i.eb || n2 != a)) {
                return;
            }
            if (n == i.eb && n2 == a) {
                this.at = true;
            }
            i = this;
        }
        else {
            if ((n2 != i.eb || n != i.eb - 1) && (n != i.eb || n2 != i.eb - 1)) {
                return;
            }
            if (n == i.eb && n2 == i.eb - 1) {
                this.at = true;
            }
            i = this;
        }
        i.c[this.ek++] = this.ec;
        this.c[this.ek++] = this.ed;
    }
    
    private void cA() {
        this.dN = 0;
        if (((this.a(this.ap, this.aq + 1) & 0x2) != 0x0 && this.aq + 1 == i.eb) || this.aq == i.eb) {
            this.ar = false;
            this.as = true;
        }
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                final long n = i.a[i][j];
                boolean b = false;
                if (n != 0L) {
                    final int a = a(n, (byte)3, (byte)3);
                    final int a2 = a(n, (byte)6, (byte)5);
                    final int n2 = (!this.as && a2 == i.eb && a2 != 0) ? 1 : a(n, (byte)0, (byte)3);
                    int n3 = -1;
                    int n4 = -1;
                    int n5 = -1;
                    Label_0290: {
                        if (n2 == 0) {
                            b = (this.b(this.ap, a2) == this.c(this.ap, a2));
                            int n6 = 0;
                            switch (a) {
                                case 0: {
                                    n4 = 17;
                                    n5 = 0;
                                    n6 = ((a(n, (byte)11, (byte)3) > 2) ? 13 : 0);
                                    break;
                                }
                                case 1: {
                                    n4 = 18;
                                    n5 = 2;
                                    n6 = 9;
                                    break;
                                }
                                default: {
                                    break Label_0290;
                                }
                            }
                            n3 = n6;
                        }
                        else {
                            switch (a) {
                                case 0: {
                                    n5 = 0;
                                    n3 = 1;
                                    break;
                                }
                            }
                        }
                    }
                    this.a(i, j, n, a, n2);
                    if (n5 != -1 && n3 != -1) {
                        if (b && n4 != -1) {
                            i.a[17].a(i.c, n4, i * 13 + n5 + 37 - 27, j * 13 + n5 + 73 - 56, 0, 0, 0);
                        }
                        i.a[17].a(i.c, n3, i * 13 + n5 + 37 - 27, j * 13 + n5 + 73 - 56, 0, 0, 0);
                        int n7 = -1;
                        Label_0479: {
                            int n8 = 0;
                            switch (this.ap) {
                                case 0: {
                                    if (a2 == 8) {
                                        n8 = 52;
                                        break;
                                    }
                                    break Label_0479;
                                }
                                case 1: {
                                    if (a2 == 9) {
                                        n8 = 53;
                                        break;
                                    }
                                    break Label_0479;
                                }
                                case 2: {
                                    if (a2 == 10) {
                                        n8 = 54;
                                        break;
                                    }
                                    break Label_0479;
                                }
                            }
                            n7 = n8;
                        }
                        if (n7 != -1) {
                            i.a[n7].a(i.c, 0, i * 13 - 8 + 37 - 27, j * 13 - 8 + 73 - 56, 0, 0, 0);
                        }
                    }
                }
            }
        }
        this.ar = false;
    }
    
    private void cB() {
        this.a.setClip(0, 0, 240, 320);
        int n = 0;
        int color = 0;
        int color2 = 0;
        int n2 = -1;
        int n3 = 0;
        while (true) {
            int n4 = 0;
            switch (this.ap) {
                case 0: {
                    n = 939282;
                    color = 3111750;
                    color2 = 8635434;
                    n3 = 24;
                    n4 = 28;
                    break;
                }
                case 1: {
                    n = 869201;
                    color = 4022666;
                    color2 = 5873874;
                    n3 = 25;
                    n4 = 29;
                    break;
                }
                case 2: {
                    n = 5210510;
                    color = 3711421;
                    color2 = 7469567;
                    n3 = 26;
                    n4 = 30;
                    break;
                }
                default: {
                    this.a.setColor(n);
                    this.a.fillRect(0, 0, 240, 320);
                    i.a[n3].a(this.a, 0, 120, 0, 0, 0, 0);
                    i.a[41].a(this.a, i.a[n2], 8, 6, 20);
                    (i.c = i.g.getGraphics()).setColor(n);
                    i.c.fillRect(0, 0, 186, 226);
                    i.a[23].a(i.c, 0, 93, 113, 0, 0, 0);
                    this.a.setColor(color);
                    this.a.fillRoundRect(2, 282, 236, 22, 8, 8);
                    this.a.setColor(color2);
                    this.a.drawRoundRect(2, 282, 236, 22, 8, 8);
                    this.a();
                    this.b();
                    i.a[41].a(this.a, i.a[96], 222, 311, 10);
                    if (i.a[17] != null) {
                        i.a[17].a(this.a, 12, 11, 284, 0, 0, 0);
                        i.a[17].a(this.a, 10, 155, 285, 0, 0, 0);
                        i.a[17].a(this.a, 11, 80, 285, 0, 0, 0);
                    }
                    i.c.delete(0, i.c.length());
                    i.c.append(this.ao);
                    i.a[41].a(this.a, i.c.toString(), 39, 285, 20);
                    i.c.delete(0, i.c.length());
                    i.c.append(a(i.i, 4));
                    i.a[41].a(this.a, i.c.toString(), 100, 285, 20);
                    i.c.delete(0, i.c.length());
                    final int a = a(i.i, 6);
                    final byte i = i.i[0];
                    if (a >= i) {
                        i.c.append(a).append("/").append(a);
                    }
                    else {
                        i.c.append(a).append("/").append(i);
                    }
                    i.a[41].a(this.a, i.c.toString(), 175, 285, 20);
                    this.av = false;
                    return;
                }
            }
            n2 = n4;
            continue;
        }
    }
    
    private void cC() {
        int color = 0;
        int color2 = 0;
        while (true) {
            int n = 0;
            switch (this.ap) {
                case 0: {
                    color = 3111750;
                    n = 8635434;
                    break;
                }
                case 1: {
                    color = 4022666;
                    n = 5873874;
                    break;
                }
                case 2: {
                    color = 3711421;
                    n = 7469567;
                    break;
                }
                default: {
                    this.a.setColor(color);
                    this.a.fillRoundRect(2, 34, 236, 22, 8, 8);
                    this.a.setColor(color2);
                    this.a.drawRoundRect(2, 34, 236, 22, 8, 8);
                    return;
                }
            }
            color2 = n;
            continue;
        }
    }
    
    private void cD() {
        if (this.dX == this.dZ && this.dY == this.ea) {
            int n = -1;
            if (a(4097)) {
                n = 2;
            }
            else if (a(262146)) {
                n = 3;
            }
            else if (a(16388)) {
                n = 4;
            }
            else if (a(65544)) {
                n = 1;
            }
            else if (a(32944)) {
                if (System.currentTimeMillis() - this.o < 2000L) {
                    return;
                }
                final int a = a(i.a[this.dX][this.dY], (byte)6, (byte)5);
                this.A();
                this.cs();
                System.gc();
                this.aq = a;
                this.t();
                i.W = 0;
                return;
            }
            else if (a(64)) {
                this.I = true;
                this.G = true;
                this.K = true;
                this.bs = 0;
                i.l = 28;
                i.W = 0;
                return;
            }
            i.W = 0;
            if (n != -1) {
                final int dx = this.dX;
                final int dy = this.dY;
                final long n2;
                final int a2 = a(n2 = i.a[dx][dy], (byte)11, (byte)3);
                int n3 = 14;
                int n4 = -1;
                int n5 = -1;
                for (int i = 0; i < a2; ++i, n3 += 4) {
                    final int a3 = a(n2, (byte)n3, (byte)4);
                    n3 += 4;
                    final int a4 = a(n2, (byte)n3, (byte)4);
                    if (a(i.a[a3][a4], (byte)0, (byte)3) != 1) {
                        int n6 = 0;
                        switch (n) {
                            case 1: {
                                if (a3 <= dx) {
                                    continue;
                                }
                                if (n4 >= 0) {
                                    n5 = i;
                                    continue;
                                }
                                n6 = i;
                                break;
                            }
                            case 4: {
                                if (a3 >= dx) {
                                    continue;
                                }
                                if (n4 >= 0) {
                                    n5 = i;
                                    continue;
                                }
                                n6 = i;
                                break;
                            }
                            case 2: {
                                if (a4 >= dy) {
                                    continue;
                                }
                                if (n4 >= 0) {
                                    n5 = i;
                                    continue;
                                }
                                n6 = i;
                                break;
                            }
                            case 3: {
                                if (a4 <= dy) {
                                    continue;
                                }
                                if (n4 >= 0) {
                                    n5 = i;
                                    continue;
                                }
                                n6 = i;
                                break;
                            }
                        }
                        n4 = n6;
                    }
                }
                if (n4 != -1) {
                    int n7 = -1;
                    Label_0642: {
                        if (n5 != -1) {
                            int n8 = 14 + n4 * 2 * 4;
                            final int a5 = a(n2, (byte)n8, (byte)4);
                            n8 += 4;
                            final int a6 = a(n2, (byte)n8, (byte)4);
                            int n9 = 14 + n5 * 2 * 4;
                            final int a7 = a(n2, (byte)n9, (byte)4);
                            n9 += 4;
                            final int a8 = a(n2, (byte)n9, (byte)4);
                            int n10 = 0;
                            Label_0633: {
                                switch (n) {
                                    case 1:
                                    case 4: {
                                        if (dy == a6) {
                                            n10 = n4;
                                            break Label_0633;
                                        }
                                        if (dy == a8) {
                                            break;
                                        }
                                        n10 = ((Math.abs(dx - a5) > Math.abs(dx - a7)) ? n4 : n5);
                                        break Label_0633;
                                    }
                                    case 2:
                                    case 3: {
                                        if (dx == a5) {
                                            n10 = n4;
                                            break Label_0633;
                                        }
                                        if (dx == a7) {
                                            break;
                                        }
                                        if (a5 > a7) {
                                            n10 = n4;
                                            break Label_0633;
                                        }
                                        break;
                                    }
                                    default: {
                                        break Label_0642;
                                    }
                                }
                                n10 = n5;
                            }
                            n7 = n10;
                        }
                        else {
                            n7 = n4;
                        }
                    }
                    if (n7 != -1) {
                        int n11 = 14 + n7 * 2 * 4;
                        final int a9 = a(n2, (byte)n11, (byte)4);
                        n11 += 4;
                        final int a10 = a(n2, (byte)n11, (byte)4);
                        final int a11;
                        if ((a11 = a(i.a[a9][a10], (byte)0, (byte)3)) == 0) {
                            this.dZ = a9;
                            this.ea = a10;
                            this.ax = true;
                        }
                    }
                }
            }
        }
    }
    
    private void B(final int n) {
        try {
            switch (n) {
                case 0: {
                    if (this.H) {
                        this.E();
                        return;
                    }
                    break;
                }
                case 1: {
                    if (this.I) {
                        this.A();
                        return;
                    }
                    break;
                }
                case 2: {
                    if (this.F) {
                        this.k();
                        return;
                    }
                    break;
                }
                case 3: {
                    if (this.G) {
                        this.cs();
                        return;
                    }
                    break;
                }
                case 4: {
                    i.a[41].b = 0;
                    i.c.delete(0, i.c.length());
                    switch (this.ap) {
                        case 0: {
                            i.c.append("/map_angkor.out");
                            break;
                        }
                        case 1: {
                            i.c.append("/map_scotland.out");
                            break;
                        }
                        case 2: {
                            i.c.append("/map_tibet.out");
                            break;
                        }
                    }
                    i.a = new long[12][12];
                    this.c = new int[20];
                    this.a(i.c.toString());
                }
                case 5: {
                    i.a[17] = a("/ms.f", 0);
                    i.a[23] = a("/ms.f", 1);
                }
                case 6: {
                    a[] array = null;
                    int n2 = 0;
                    String s = null;
                    int n3 = 0;
                    switch (this.ap) {
                        case 0: {
                            array = i.a;
                            n2 = 24;
                            s = "/ms.f";
                            n3 = 2;
                            break;
                        }
                        case 1: {
                            array = i.a;
                            n2 = 25;
                            s = "/ms.f";
                            n3 = 3;
                            break;
                        }
                        case 2: {
                            array = i.a;
                            n2 = 26;
                            s = "/ms.f";
                            n3 = 4;
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                    array[n2] = a(s, n3);
                }
                case 7: {
                    if (i.a[54] == null) {
                        i.a[54] = a("/mmv.f", 1);
                    }
                    this.v = c(i.a[54], 0) >> 1;
                    this.w = b(i.a[54], 0) >> 1;
                }
                case 8: {
                    if (i.a[53] == null) {
                        i.a[53] = a("/mmv.f", 2);
                        return;
                    }
                    break;
                }
                case 9: {
                    if (i.a[52] == null) {
                        i.a[52] = a("/mmv.f", 3);
                        return;
                    }
                    break;
                }
                case 10: {
                    if (this.ab) {
                        this.cy();
                        return;
                    }
                    break;
                }
                case 14: {
                    if (this.A) {
                        this.A = false;
                    }
                    this.cE();
                    i.l = 15;
                    break;
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void a(final String name) throws IOException {
        final InputStream resourceAsStream;
        final int n = ((byte)(resourceAsStream = this.getClass().getResourceAsStream(name)).read() & 0xFF) + ((byte)resourceAsStream.read() & 0xFF) * 256;
        final int read = resourceAsStream.read();
        resourceAsStream.read(i.f = new byte[n]);
        resourceAsStream.close();
        int n2 = 0;
        for (int i = 0; i < read; ++i) {
            final byte b = i.f[n2++];
            final byte b2 = i.f[n2++];
            final byte b3 = i.f[n2++];
            final byte dm = i.f[n2++];
            if (b3 == 1 && dm < this.dM) {
                this.dM = dm;
            }
            final byte b4 = i.f[n2++];
            this.a(b, b2, 1, (byte)0, (byte)3);
            this.a(b, b2, b3, (byte)3, (byte)3);
            this.a(b, b2, dm, (byte)6, (byte)5);
            this.a(b, b2, b4, (byte)11, (byte)3);
            byte b5 = 14;
            for (byte b6 = 0; b6 < b4; ++b6) {
                this.a(b, b2, i.f[n2++], b5, (byte)4);
                final byte b7 = (byte)(b5 + 4);
                this.a(b, b2, i.f[n2++], b7, (byte)4);
                b5 = (byte)(b7 + 4);
            }
        }
        i.f = null;
        System.gc();
    }
    
    private void cE() {
        this.dX = -1;
        if (!this.ab) {
            this.aq = i.eb;
        }
        this.ab = false;
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                final long n;
                if ((n = i.a[i][j]) != 0L) {
                    final int a = a(n, (byte)6, (byte)5);
                    final boolean b;
                    i k;
                    int n2;
                    int n3;
                    int n4;
                    if ((b = ((this.a(this.ap, a) & 0x40) != 0x0)) || a == 0) {
                        k = this;
                        n2 = i;
                        n3 = j;
                        n4 = 0;
                    }
                    else {
                        k = this;
                        n2 = i;
                        n3 = j;
                        n4 = 1;
                    }
                    k.a(n2, n3, n4, (byte)0, (byte)3);
                    if (a == this.aq) {
                        this.dX = i;
                        this.dY = j;
                    }
                    if (a == i.eb) {
                        this.dZ = i;
                        this.ea = j;
                    }
                    this.ap = false;
                }
            }
        }
    }
    
    private void cF() {
        i.a[17] = a("/ms.f", 0);
        this.aO();
    }
    
    public static final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int color, final int n5) {
        final int clipX = graphics.getClipX();
        final int clipY = graphics.getClipY();
        final int clipWidth = graphics.getClipWidth();
        final int clipHeight = graphics.getClipHeight();
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(color);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setClip(n - 3, n2, n3 + 6, n4);
        for (int i = n2; i <= n2 + n4; i += 8) {
            graphics.drawImage(i.b[n5][7], n, i, 24);
            graphics.drawImage(i.b[n5][5], n + n3, i, 20);
        }
        graphics.setClip(n, n2 - 3, n3, n4 + 6);
        for (int j = n; j <= n + n3; j += 8) {
            graphics.drawImage(i.b[n5][4], j, n2, 36);
            graphics.drawImage(i.b[n5][6], j, n2 + n4, 20);
        }
        graphics.setClip(n - 3, n2 - 3, n3 + 6, n4 + 6);
        graphics.drawImage(i.b[n5][0], n, n2, 40);
        graphics.drawImage(i.b[n5][1], n + n3, n2, 36);
        graphics.drawImage(i.b[n5][2], n, n2 + n4, 24);
        graphics.drawImage(i.b[n5][3], n + n3, n2 + n4, 20);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
    
    public static final void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int color, final int n5, final int n6, final int n7) {
        final int clipX = graphics.getClipX();
        final int clipY = graphics.getClipY();
        final int clipWidth = graphics.getClipWidth();
        final int clipHeight = graphics.getClipHeight();
        a(graphics, n, n2, n3, n4, color, n5);
        a(graphics, n + 10, n2 - 3 - n7, n6, n7, color, n5);
        graphics.setClip(n + 10 - 3, n2 - 3, n6 + 6, 3);
        graphics.setColor(color);
        graphics.fillRect(n + 10 - 3, n2 - 3, n6 + 6, 3);
        graphics.drawImage(i.b[n5][3], n + 10, n2 - 3, 24);
        graphics.drawImage(i.b[n5][2], n + 10 + n6, n2 - 3, 20);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
    
    private void cG() {
        if (this.c == this.ep && !this.aw) {
            return;
        }
        if (this.c != this.ep) {
            this.aw = true;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.aw) {
            this.a(this.a, true);
            this.a.setColor(0);
            this.a.fillRect(0, 0, 240, 15);
            this.a.setColor(16777215);
            this.a.drawLine(0, 15, 240, 15);
            i.a[41].a(this.a, i.a[72], 120, 0, 17);
            a(this.a, 10, 35, 220, 90, 4273165, 0);
            if (this.d != -1) {
                i.a[41].b(this.a, a(this.a, 200), 120, 280, 17);
            }
            if (this.Z) {
                this.Z = false;
                i.a[41].a(this.a, this.a, 120, 191, 1);
            }
            i.a[41].b(this.a, this.f, 120, 260, 17);
            this.a();
            this.b();
            this.aw = false;
        }
        if (this.c != this.ep) {
            this.a.setColor(4273165);
            this.a.fillRect(20, 43 + ((this.ep >= 0) ? this.ep : this.c) * 20 + 2, 7, 9);
        }
        i.a[17].a(this.a, 14, 20, 43 + this.c * 20 + 2, 0, 0, 0);
        a(this.a, 10, 155, 220, 70, 4273165, 0);
        a a;
        Graphics graphics;
        String a2;
        int n;
        int n2;
        if (this.d != -1) {
            final String string = i.a[74] + " " + this.d.toString() + "\n" + i.a[42];
            i.a[41].e = 0;
            a = i.a[41];
            graphics = this.a;
            a2 = string;
            n = 120;
            n2 = 185;
        }
        else {
            a = i.a[41];
            graphics = this.a;
            a2 = this.a;
            n = 120;
            n2 = 191;
        }
        a.b(graphics, a2, n, n2, 1);
        for (int i = 0; i < 4; ++i) {
            final int n3 = 43 + 20 * i;
            i.a[46].a(this.a, 0 + i, 27, n3, 0, 0, 0);
            i.a[41].a(this.a, i.a[85 + i], 53, n3, 0);
        }
        final Image[] array;
        int width = (array = i.a[0].a[0])[11].getWidth();
        final int width2 = array[15].getWidth();
        this.a.drawImage(array[11], 100, 160, 0);
        for (int j = 0; j < 8; ++j) {
            this.a.drawImage(array[(j >= 4) ? 13 : 15], 100 + width, 160, 0);
            width += width2;
        }
        final int c = this.c;
        final int n4 = width;
        int n5 = width - width2 * 4;
        for (int k = 0; k <= c; ++k) {
            this.a.drawImage(array[15], 100 + n5, 160, 0);
            n5 += width2;
        }
        this.a.drawImage(array[17], 100 + n4, 160, 0);
        if (this.c != this.ep) {
            this.ep = this.c;
        }
    }
    
    private static void a(final int n, final int n2, final short n3) {
        for (int i = 0; i < i.a[n].length; i += 2) {
            if (n2 == i.a[n][i]) {
                i.a[n][i + 1] = n3;
                return;
            }
        }
    }
    
    private void C(final int n) {
        this.a.b(n);
    }
    
    private void cH() {
        switch (this.aM) {
            case 0: {
                this.eq = 0;
                this.er = 0;
                this.aM = 1;
            }
            case 1: {
                i.s = a("/cr.f", 0);
                int i = 0;
                while (i < i.s.length) {
                    if (i.s[i] == 92 && i.s[i + 1] == 110) {
                        i.s[i++] = 10;
                        i.s[i++] = 32;
                    }
                    else {
                        ++i;
                    }
                }
                int n;
                for (n = 0; i.s[n] != 36; ++n) {}
                for (int j = 0; j < GloftDIRU.a.length; ++j, ++n) {
                    i.s[n] = GloftDIRU.a[j];
                }
                this.aM = 2;
            }
            case 2: {
                Label_0302: {
                    i k = null;
                    int eq = 0;
                    Label_0299: {
                        int n2 = 0;
                        int n3 = 0;
                        Label_0298: {
                            if (a(4097)) {
                                if (this.eq >= 240) {
                                    this.eq -= 3;
                                    if (this.eq < 240) {
                                        k = this;
                                        eq = 240;
                                        break Label_0299;
                                    }
                                    break Label_0302;
                                }
                            }
                            else {
                                if (a(262146)) {
                                    k = this;
                                    n2 = this.eq;
                                    n3 = 3;
                                    break Label_0298;
                                }
                                if (a(64)) {
                                    if (this.g) {
                                        this.bs = 0;
                                        this.br = 8;
                                        i.l = 9;
                                        this.g = false;
                                        break Label_0302;
                                    }
                                    this.aM = 3;
                                    break Label_0302;
                                }
                            }
                            k = this;
                            n2 = this.eq;
                            n3 = 1;
                        }
                        eq = n2 + n3;
                    }
                    k.eq = eq;
                }
                int n4;
                int er;
                for (n4 = -this.eq, er = 0; er < i.s.length && n4 <= -340; ++er) {
                    if (i.s[er] == 10) {
                        n4 += 17;
                    }
                }
                this.er = er;
                if (this.er >= i.s.length) {
                    this.er = 0;
                    this.eq = 0;
                    return;
                }
                break;
            }
            case 3: {
                i.s = null;
                System.gc();
                i.l = 4;
                this.aM = 2;
                this.a(0);
                this.a.b(19);
                break;
            }
        }
    }
    
    private void cI() {
        if (this.aM != 2) {
            return;
        }
        final Graphics a;
        (a = this.a).setColor(0, 0, 0);
        a.fillRect(0, 0, 240, 320);
        int n = -17;
        int er = this.er;
        int er2 = this.er;
        final int n2 = (this.eq >= 340) ? (-(this.eq % 17)) : (340 - this.eq - 17);
        while (er < i.s.length && n < 340) {
            if (i.s[er] == 10) {
                i.a[41].b = 0;
                this.a(a, i.s, i.a[41], er2, er - er2, n + n2, null, 0, 234);
                n += 17;
                er2 = er + 1;
            }
            ++er;
        }
        int n3 = 0;
        for (int i = 6; i > 0; --i) {
            a.setColor(0);
            a.fillRect(0, n3, 240, i);
            a.fillRect(0, 320 - n3 - i, 240, i);
            n3 += i + 1;
        }
        this.a();
    }
    
    private void cJ() {
        if (i.es > 0) {
            i.es -= (int)(System.currentTimeMillis() - this.p);
            this.p = System.currentTimeMillis();
            if (i.es <= 0) {
                this.c(true);
            }
        }
    }
    
    private void a(final String s, final int et, final int eu, final int es, final int ev, final int ew) {
        this.p = System.currentTimeMillis();
        i.es = es;
        this.et = et;
        this.eu = eu;
        this.g = a(s, 220);
        this.ev = ev;
        this.ew = ew;
    }
    
    private void c(final boolean b) {
        i.es = 0;
        if (b) {
            this.aw = true;
        }
    }
    
    private static boolean h() {
        return i.es > 0;
    }
    
    private void cK() {
        final a a = i.a[41];
        if (i.es <= 0) {
            return;
        }
        final int e = a.e;
        a.e = 3;
        a.a(this.g);
        final int d = a.d;
        final int c = a.c;
        if (this.et == -1) {
            this.et = 240 - c >> 1;
        }
        if (this.eu == -1) {
            this.eu = 320 - d >> 1;
        }
        this.a.setClip(this.et - 6, this.eu - 3, c + 12, d + 6);
        a(this.a, this.et - 6, this.eu - 3, c + 12, d + 6, this.ev, this.ew);
        a.b(this.a, this.g, this.et, this.eu, 0);
        a.e = e;
    }
    
    public static String a(final String str, final int n) {
        final a a = i.a[41];
        int n2 = 0;
        int index = 0;
        int n3 = 0;
        int n4 = 0;
        final StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= sb.length(); ++i) {
            int n5 = 10;
            if (i < sb.length()) {
                n5 = (sb.charAt(i) & '\u00ff');
            }
            if (n2 > n && index != n4) {
                n2 = n3;
                sb.setCharAt(index, '\n');
                i = index - 1;
                n4 = index;
            }
            else {
                int n6;
                if (n5 == 10) {
                    n6 = 0;
                }
                else {
                    int n9;
                    int n13;
                    if (n5 > 32) {
                        if (n5 == 64) {
                            n2 += 14;
                            continue;
                        }
                        final int n7 = a.h[n5] & 0xFF;
                        int n10;
                        int n11;
                        if (n7 >= a.b(0)) {
                            final int n8 = n7 - a.b(0);
                            n9 = n2;
                            n10 = (a.c[(n8 << 2) + 2] & 0xFF);
                            n11 = (a.c[n8 << 2] & 0xFF);
                        }
                        else {
                            final int n12 = (a.d[n7 << 2] & 0xFF) << 1;
                            n9 = n2;
                            n10 = (a.a[n12] & 0xFF);
                            n11 = a.d[(n7 << 2) + 1];
                        }
                        n13 = n10 - n11;
                    }
                    else {
                        if (n5 != 32) {
                            continue;
                        }
                        index = i;
                        n3 = n2;
                        n9 = n2;
                        n13 = (a.a[0] & 0xFF);
                    }
                    n6 = n9 + (n13 + a.d[1]);
                }
                n2 = n6;
            }
        }
        return sb.toString();
    }
    
    private static void cL() {
        if (i.a[41] != null) {
            i.a[41] = null;
            System.gc();
        }
        (i.a[41] = new a()).a(a("/ui.f", 1), 0);
        i.a[41].a(0, 0, -1, -1);
        i.a[41].a(1, 0, -1, -1);
        i.a[41].a(2, 0, -1, -1);
        i.a[41].g = null;
    }
    
    static {
        i.a = new boolean[] { true, false, false };
        i.b = new boolean[] { false, false, false };
        i.a = new byte[16];
        i.b = new byte[8];
        i.c = new byte[8];
        i.l = 0;
        i.m = i.l;
        i.g = new byte[] { 0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0 };
        i.h = new byte[] { 0, 3, 4, 1, 2, 5, 6 };
        i.i = null;
        i.j = null;
        i.a = null;
        i.p = null;
        i.D = false;
        i.d = null;
        i.b = null;
        i.cC = 0;
        i.cD = 0;
        i.cE = -1;
        i.cF = -1;
        i.cG = -1;
        i.cH = -1;
        i.e = null;
        i.cM = 0;
        i.cN = 0;
        i.cO = 0;
        i.f = null;
        i.U = false;
        i.V = true;
        i.s = 0;
        b = new int[] { 512, 16384, 131072, 131072, 4096 };
        i.dg = 0;
        i.dh = 0;
        i.di = 0;
        i.q = new byte[16];
        i.r = new byte[16];
        i.ak = false;
        i.a = new long[15];
        i.b = new long[15];
        a = new short[][] { { 0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6 }, { 0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6 }, { 0, 28, 1, 29, 2, 30, 3, 31 }, { 0, 32, 1, 33 }, { 0, 45, 1, 46 }, { 0, 33, 1, 50 }, { 0, 25, 4, 27 }, { 0, 101, 1, 100 } };
        d = new int[] { 28, 29, 30 };
        g = new int[][] { { 8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23 }, { 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22 }, { 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47 } };
        i.s = null;
        b = new String[] { "/w0.bin", "/w1.bin", "/w2.bin" };
        i.es = 0;
    }
}
