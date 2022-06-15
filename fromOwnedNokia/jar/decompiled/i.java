import javax.microedition.lcdui.Displayable;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.rms.RecordStore;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class i extends Canvas implements Runnable
{
    private int l;
    private int m;
    private boolean c;
    private boolean d;
    private int n;
    private int o;
    private String a;
    private boolean e;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String b;
    private String c;
    private int u;
    private boolean f;
    private boolean g;
    private byte c;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private static boolean[] a;
    private int C;
    private static boolean[] b;
    private boolean h;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean i;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean j;
    private boolean k;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private byte h;
    private byte i;
    private boolean l;
    private int aa;
    private int ab;
    private int ac;
    private static byte[] a;
    private static byte[] b;
    private static byte[] c;
    private int ad;
    private int ae;
    private byte j;
    private static boolean m;
    private int af;
    private int ag;
    private static int ah;
    private boolean n;
    private boolean o;
    private int ai;
    private int aj;
    private static byte[] d;
    private byte k;
    private int ak;
    private int al;
    private int am;
    private int an;
    private boolean p;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int au;
    private int av;
    private static byte[] e;
    private int aw;
    private int ax;
    private int ay;
    public byte a;
    private byte l;
    private int az;
    private int aA;
    private int aB;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    public static byte b;
    private int aR;
    private static byte m;
    private boolean u;
    private static int aS;
    public static int g;
    private long a;
    private boolean v;
    public int h;
    public int i;
    public int j;
    public int k;
    private int aT;
    private boolean w;
    private int aU;
    private int aV;
    private boolean x;
    private byte n;
    private int aW;
    private long b;
    private int aX;
    private int aY;
    private int aZ;
    private int ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private byte o;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bm;
    private boolean y;
    private int bn;
    private boolean z;
    private int bo;
    private int bp;
    private int bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private int bw;
    private int bx;
    private int by;
    private int bz;
    private int bA;
    private int bB;
    private int bC;
    private boolean A;
    private int bD;
    private int bE;
    private int bF;
    private int bG;
    private int bH;
    private int bI;
    private int bJ;
    private int bK;
    private int bL;
    private int bM;
    private int bN;
    private int bO;
    private int bP;
    private int bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private int bZ;
    private int ca;
    private int cb;
    private boolean B;
    private int cc;
    private int cd;
    private InputStream a;
    private byte p;
    private byte q;
    private boolean C;
    private int ce;
    private int cf;
    private int cg;
    private int ch;
    private Graphics a;
    private static Image a;
    private static Image b;
    private static Image c;
    private static Image[][] b;
    public static Image[][] a;
    public static f[] a;
    private static h b;
    public static h a;
    private static f a;
    private static byte[] f;
    private static b[] a;
    private static f b;
    private static byte[] g;
    private static byte[] h;
    private long c;
    private long d;
    private boolean D;
    private static byte[] i;
    private static byte[] j;
    public static int[][] a;
    public static int[][] b;
    private static byte[][] a;
    private static byte[][] b;
    private static byte[][] c;
    private static byte[] k;
    private boolean E;
    private int ci;
    private int cj;
    private int ck;
    private int cl;
    private static byte[] l;
    private static byte[] m;
    private static int cm;
    private static int cn;
    private static byte[] n;
    private static int[][] c;
    private static int[][] d;
    private static byte[][] d;
    private static byte[][] e;
    private static byte[] o;
    public final j a;
    private c a;
    private static c[] a;
    private static byte[] p;
    private Thread a;
    public static GloftDIRU a;
    private int co;
    private int cp;
    private int cq;
    private int cr;
    private int cs;
    private static f c;
    private int ct;
    private byte r;
    public static boolean a;
    private static String d;
    private long e;
    private long f;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int cu;
    private int cv;
    private int cw;
    private boolean O;
    private boolean P;
    private int cx;
    private int cy;
    private boolean Q;
    private boolean R;
    private int cz;
    private int cA;
    private boolean S;
    private boolean T;
    private int cB;
    private static Image d;
    private static Graphics b;
    private static int cC;
    private static int cD;
    private static int cE;
    private static int cF;
    private static int cG;
    private static int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    private static Image e;
    private static int cM;
    private static int cN;
    private static int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int cS;
    private int cT;
    private int cU;
    private int cV;
    private boolean U;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private int db;
    private long g;
    private int dc;
    private static boolean V;
    private static boolean W;
    private long h;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private int dd;
    private int[] a;
    private static byte s;
    private static int[] b;
    private static int de;
    private static int df;
    private static int dg;
    private byte t;
    private byte u;
    private boolean ac;
    private static byte[] q;
    private static byte[] r;
    private long i;
    private boolean ad;
    private int dh;
    private boolean ae;
    private long j;
    private long k;
    private boolean af;
    private long l;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private String e;
    private int di;
    private int dj;
    private int dk;
    private int dl;
    private static boolean ak;
    private static int dm;
    private static int dn;
    private static int do;
    private static int dp;
    private boolean al;
    private int dq;
    private int dr;
    private int ds;
    private byte v;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private byte w;
    private int dy;
    private int dz;
    private byte x;
    private byte y;
    private int dA;
    private int dB;
    private int dC;
    private byte z;
    private int dD;
    private int dE;
    private int dF;
    private byte A;
    private int dG;
    private int dH;
    private static f d;
    private static int[][] e;
    private static long[] a;
    private static long[] b;
    private static int[][] f;
    private static long[] c;
    private static long[] d;
    private static boolean am;
    private int dI;
    private int dJ;
    private static String f;
    private static long[][] a;
    private static StringBuffer a;
    private static StringBuffer b;
    private static StringBuffer c;
    private static Image f;
    private static Graphics c;
    private int dK;
    private int dL;
    private int dM;
    private int dN;
    private int dO;
    private int dP;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private boolean an;
    private boolean ao;
    private int dV;
    private int dW;
    private int dX;
    private int dY;
    private static int dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef;
    private int eg;
    private int eh;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private int[] c;
    private int ei;
    private int ej;
    private int ek;
    private int el;
    private int em;
    private boolean as;
    private boolean at;
    private boolean au;
    private long m;
    private int en;
    private String g;
    private StringBuffer d;
    private boolean av;
    private boolean aw;
    private int eo;
    private int ep;
    private static short[][] a;
    private static int[] d;
    private static int[][] g;
    private static String[] c;
    public static String[] a;
    public static String[] b;
    public static boolean b;
    private static byte[] s;
    private static String[] d;
    private static int eq;
    private long n;
    private String h;
    private int er;
    private int es;
    private int et;
    private int eu;
    
    public i(final GloftDIRU a) {
        this.l = 40;
        this.c = false;
        this.n = 0;
        this.o = a.a[this.n];
        this.a = "";
        this.e = true;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = this.q;
        this.t = this.r;
        this.b = "";
        this.c = "";
        this.u = -1;
        this.f = false;
        this.g = true;
        this.c = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.h = false;
        this.D = -1;
        this.E = 10;
        this.F = 10;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.i = false;
        this.L = 0;
        this.M = -1;
        this.N = -1;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.j = false;
        this.k = false;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.d = 1;
        this.e = 1;
        this.f = 3;
        this.g = 3;
        this.h = 2;
        this.i = 0;
        this.l = false;
        this.ag = 0;
        this.n = true;
        this.k = 0;
        this.ak = 0;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.a = 0;
        this.l = 0;
        this.u = false;
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
        this.C = false;
        this.D = false;
        this.a = null;
        this.co = -1;
        this.cp = -1;
        this.r = 0;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.cu = -1;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.cP = -1;
        this.cQ = -1;
        this.cR = -1;
        this.cS = -1;
        this.cT = -1;
        this.cU = -1;
        this.cV = -1;
        this.U = true;
        this.da = 3;
        this.db = -1;
        this.g = 0L;
        this.dc = -1;
        this.h = 0L;
        this.ab = false;
        this.dd = 0;
        this.a = new int[] { 0, 0, 0, 0, 0 };
        this.ac = false;
        this.i = 0L;
        this.dh = 0;
        this.j = 0L;
        this.k = 0L;
        this.af = false;
        this.aj = false;
        this.di = 0;
        this.al = true;
        this.dq = -1;
        this.dz = -1;
        this.x = 3;
        this.dK = 100;
        this.an = true;
        this.ap = true;
        this.aq = true;
        this.ar = true;
        this.ek = 2;
        this.em = 2;
        this.at = true;
        this.au = true;
        this.m = 0L;
        this.en = -1;
        this.d = new StringBuffer();
        this.av = true;
        this.aw = true;
        this.n = System.currentTimeMillis();
        this.aD = -1;
        this.aF = -1;
        this.aH = -1;
        i.a = new b[6];
        i.a = new f[61];
        if (f.e == null) {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream("/mc");
            f.e = new byte[256];
            try {
                resourceAsStream.read(f.e);
                resourceAsStream.close();
            }
            catch (Exception ex) {}
        }
        i.b = new Image[33][];
        i.a = new Image[2][];
        i.a = a;
        this.a = new j();
        this.setFullScreenMode(true);
        this.o = true;
        i.m = true;
        i.d = i.a.getAppProperty(i.d);
        (this.a = new Thread(this)).start();
        short[] array;
        int n;
        if (!a()) {
            (i.a[0] = new short[8])[0] = 0;
            i.a[0][1] = 16;
            i.a[0][2] = 1;
            i.a[0][3] = 40;
            i.a[0][4] = 3;
            i.a[0][5] = 18;
            i.a[0][6] = 5;
            array = i.a[0];
            n = 7;
        }
        else {
            (i.a[0] = new short[10])[0] = 0;
            i.a[0][1] = 16;
            i.a[0][2] = 1;
            i.a[0][3] = 40;
            i.a[0][4] = 6;
            i.a[0][5] = 44;
            i.a[0][6] = 3;
            i.a[0][7] = 18;
            i.a[0][8] = 5;
            array = i.a[0];
            n = 9;
        }
        array[n] = 22;
    }
    
    private void a(int n, int h, final int n2) {
        this.aF = -1;
        this.aI = -1;
        this.aH = -1;
        final int d;
        if ((d = i.a[((this.k & 0x4000) == 0x0) ? 0 : 3].d) == 40) {
            return;
        }
        if (d == 48) {
            return;
        }
        if (d == 47) {
            return;
        }
        if ((this.b <= 0L && this.aW == 0 && this.bi == 0 && this.l != 6 && (this.k & 0x70) == 0x0) || this.aT > 0) {
            ++this.bc;
            this.a((byte)(this.n - n));
            if (this.bl == 0 && this.n == 0) {
                this.j = 0L;
                this.co = this.bE;
                this.cp = this.bF;
                i.c = null;
            }
            this.k = ((this.k & 0xFFFFFF8F) | h);
            this.p(5);
            switch (h) {
                case 16: {
                    final int n3 = 0;
                    this.av = n3;
                    this.au = n3;
                    this.aT = 5;
                    i.a[this.h][this.i] = 9;
                    this.k &= 0xFFFFFF8F;
                    i.b[this.h][this.i] = 138412032;
                    i.c[this.h][this.i] = 24;
                }
                case 64: {
                    this.g(1000);
                }
                default: {
                    this.g(10);
                    if (n2 != 0) {
                        n = (byte)n2;
                        do {
                            h = this.h - i.g[n];
                            final int i = this.i - i.g[n + 8];
                            if (i.a[h][i] < 0 && (byte)i.a[h][i] < 0) {
                                this.h = h;
                                this.i = i;
                                this.j = 18;
                                this.a = 0;
                                this.k = ((this.k & 0xFFFFFFF8) | n | 0x800);
                                return;
                            }
                        } while ((n = ((n >= 4) ? 1 : ((byte)(n + 1)))) != n2);
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
        (this = this).o = true;
    }
    
    private void a(int i) {
        this.bp = this.bo;
        this.z = false;
        this.bq = 0;
        this.bo = i;
        this.cW = 0;
        if (i >= 0) {
            final i j = this = this;
            j.cX = i.a[this.bo].length >> 1;
            this.cY = 0;
            int a;
            for (i = 0; i < this.cX; ++i) {
                a = a(i.b, i.a[i.a[this.bo][(i << 1) + 1]], 0);
                if ((this.bo != 0 || i != 3) && a > this.cY) {
                    this.cY = a;
                }
            }
            this.cZ = 0;
            this.cW = 0;
        }
    }
    
    private static boolean a(final int n) {
        return (i.ah & n) != 0x0;
    }
    
    public final void keyPressed(int g) {
        g = g(g);
        i.ah |= g;
        this.d = false;
    }
    
    public final void keyReleased(final int n) {
        i.ah &= ~g(n);
        this.d = true;
    }
    
    private void e() {
        this.a = System.currentTimeMillis();
        i.aS = 0;
        i.g = 0;
        this.ak = 0;
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
        this.e();
        RecordStore recordStore = null;
        try {
            try {
                recordStore = RecordStore.openRecordStore("Preferences", false);
            }
            catch (Exception obj) {
                System.out.println("Exception " + obj);
            }
            i.j = new byte[1];
            if (recordStore == null) {
                try {
                    recordStore = RecordStore.openRecordStore("Preferences", true);
                    i.j[0] = 0;
                    this.cv = i.j.length;
                    recordStore.closeRecordStore();
                    this.v();
                }
                catch (Exception ex2) {}
            }
            else {
                try {
                    i.j = recordStore.getRecord(1);
                    this.cv = i.j.length;
                    recordStore.closeRecordStore();
                    recordStore = null;
                }
                catch (Exception ex3) {}
            }
        }
        finally {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception ex4) {}
        }
        final i i;
        while (!i.B) {
            if (!i.af) {
                i.e = System.currentTimeMillis();
                try {
                    i.f();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    a(5000L);
                }
                if (i.B) {
                    break;
                }
                if (i.b != 2) {
                    ++i.aS;
                }
                System.currentTimeMillis();
                if (i.f > 65L) {
                    i.v = true;
                    i.f = 0L;
                }
                else {
                    i.repaint();
                    i.v = false;
                    if (i.b != 2) {
                        ++i.g;
                    }
                    i.f = Math.abs(System.currentTimeMillis() - i.e);
                    a(50L - (System.currentTimeMillis() - i.e));
                }
            }
        }
        i.p();
        i.a.d();
        i.a.a();
    }
    
    private void f() {
        if (i.eq > 0) {
            i.eq -= (int)(System.currentTimeMillis() - this.n);
            this.n = System.currentTimeMillis();
            if (i.eq <= 0) {
                this.d(true);
            }
        }
        if (i.ah == 0) {
            this.a = 0;
        }
        else if (i.eq > 0) {
            this.d(true);
            i.ah = 0;
        }
        else {
            Label_4240: {
                int ah = 0;
                Label_4237: {
                    Label_4236: {
                        switch (i.b) {
                            case 33: {
                                if (a(64)) {
                                    if (this.bo == 0) {
                                        i.b = 4;
                                        this.a(0);
                                    }
                                    if (this.bo == 1) {
                                        i.b = 2;
                                        i.V = true;
                                        this.o = true;
                                        this.a(1);
                                    }
                                }
                                break Label_4240;
                            }
                            case 26: {
                                if (a(64)) {
                                    i.b = 4;
                                    this.a(4);
                                }
                                ah = 0;
                                break Label_4237;
                            }
                            case 18: {
                                break Label_4240;
                            }
                            case 25: {
                                this.P();
                                break Label_4240;
                            }
                            case 24: {
                                boolean b = false;
                                Label_0795: {
                                    if (a(512)) {
                                        this.ab = !this.ab;
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
                                            Label_0454: {
                                                i i;
                                                int ca;
                                                if (this.cA == 0) {
                                                    i = this;
                                                    ca = 1;
                                                }
                                                else {
                                                    if (this.cA <= 8) {
                                                        break Label_0454;
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
                                        this.S = !this.S;
                                    }
                                    else if (a(1024)) {
                                        this.T = !this.T;
                                    }
                                    else {
                                        if (!a(64)) {
                                            if (!a(32944)) {
                                                break Label_0795;
                                            }
                                            i.i[8] = (byte)this.cz;
                                            i.i[9] = (byte)this.cA;
                                            if (this.S || this.T) {
                                                for (int j = 0; j <= 2; ++j) {
                                                    int e = e(j);
                                                    if (j == 2) {
                                                        ++e;
                                                    }
                                                    for (int k = 0; k <= e; ++k) {
                                                        this.a(j, k, (byte)2);
                                                        this.a(j, k, (byte)64);
                                                    }
                                                    a(j, e);
                                                }
                                                if (this.T) {
                                                    for (int l = 0; l <= 2; ++l) {
                                                        int d = d(l);
                                                        if (l == 0) {
                                                            --d;
                                                        }
                                                        for (int e2 = e(l); e2 < d; ++e2) {
                                                            this.a(l, e2, (byte)2);
                                                            this.a(l, e2, (byte)64);
                                                        }
                                                        a(l, d - 1);
                                                    }
                                                }
                                            }
                                            this.b();
                                            e(6, this.bb);
                                            this.u();
                                        }
                                        b = true;
                                        this.a.setColor(0);
                                        this.a.fillRect(0, 0, 240, 320);
                                    }
                                }
                                if (b) {
                                    this.S();
                                }
                                ah = 0;
                                break Label_4237;
                            }
                            case 34: {
                                int n = 0;
                                if (a(33008)) {
                                    this.S();
                                    a(i.a, true);
                                    i.a = null;
                                }
                                if (a(4097)) {
                                    --this.dd;
                                    if (this.dd < 0) {
                                        this.dd = 0;
                                    }
                                }
                                if (a(262146)) {
                                    ++this.dd;
                                    if (this.dd >= 2) {
                                        this.dd = 1;
                                    }
                                }
                                int n2 = this.a[this.dd];
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
                                    switch (this.dd) {
                                        case 1: {
                                            n3 = 8;
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
                                            this.a[this.dd] = n2;
                                            break Label_4236;
                                        }
                                    }
                                    n = n3;
                                    continue;
                                }
                            }
                            case 12: {
                                if (a(32944)) {
                                    this.az = 5;
                                    i.i[3] = (byte)this.az;
                                    if (this.k == 2) {
                                        this.l();
                                    }
                                    else {
                                        e(4, -500);
                                        this.u();
                                        i.b = 15;
                                        this.J = true;
                                        this.H = true;
                                        this.av();
                                    }
                                }
                                break Label_4240;
                            }
                            case 4: {
                                this.T();
                                break Label_4240;
                            }
                            case 30: {
                                if (a(1048575)) {
                                    i.b = 4;
                                    if (this.bo == -1) {
                                        this.a(this.aR = 0);
                                    }
                                    else {
                                        this.aR = 2;
                                    }
                                    ah = 0;
                                    break Label_4237;
                                }
                                break Label_4240;
                            }
                            case 2:
                            case 7:
                            case 32: {
                                this.T();
                                break Label_4240;
                            }
                            case 1: {
                                if (this.h || this.aj) {
                                    i.ah = 0;
                                }
                                i.m = i.b;
                                this.R();
                                if (this.ab && (a(524288) || a(131072))) {
                                    if (this.aA == 0 && this.aB == 13) {
                                        this.a = null;
                                        this.h = 60;
                                        this.i = 3;
                                    }
                                    else {
                                        this.at = a(524288);
                                        this.C = !this.at;
                                        this.bd = 0;
                                        this.bc = 0;
                                        this.x = true;
                                        this.h = this.e + 5 + 1;
                                    }
                                }
                                if ((this.cl != 0 && !a(32944)) || this.ay != 0 || this.x || this.n <= 0 || i.a[0].d == 19 || this.E) {
                                    i.ah = 0;
                                    break Label_4240;
                                }
                                if (this.a != null) {
                                    if (a(32784)) {
                                        this.a.a();
                                    }
                                    else if (a(32944)) {
                                        this.a.a = true;
                                    }
                                    i.ah = 0;
                                    break Label_4240;
                                }
                                if (this.aT > 0) {
                                    boolean b2 = true;
                                    if (a(4097)) {
                                        this.av = -5;
                                    }
                                    else if (a(262146)) {
                                        this.av = 5;
                                    }
                                    else if (a(16388)) {
                                        this.au = -5;
                                    }
                                    else if (a(65544)) {
                                        this.au = 5;
                                    }
                                    else if (!a(32784)) {
                                        if (a(32944)) {
                                            this.ae();
                                            i.ah = 0;
                                        }
                                        else {
                                            b2 = false;
                                        }
                                    }
                                    if (b2) {
                                        --this.aT;
                                        if (this.aT == 0) {
                                            if ((byte)i.a[this.h][this.i] < 0) {
                                                i.a[this.h][this.i] = 32;
                                            }
                                            if (i.a[this.h][this.i] == 9) {
                                                i.a[this.h][this.i] = -1;
                                            }
                                            this.b = 40L;
                                            this.j = 0;
                                            this.k &= 0xFFFFFF8F;
                                            this.g(this.c());
                                        }
                                        i.ah = 0;
                                    }
                                }
                                else {
                                    if (a(4097)) {
                                        this.a = 1;
                                    }
                                    else if (a(262146)) {
                                        this.a = 3;
                                    }
                                    else if (a(16388)) {
                                        this.a = 4;
                                    }
                                    else if (a(65544)) {
                                        this.a = 2;
                                    }
                                    else if (a(32784)) {
                                        i.ah = 0;
                                        if (this.bS == this.h && this.bT == this.i && (i.a[this.h][this.i] & 0xFF) == 0x4) {
                                            this.p(9);
                                            this.ap();
                                        }
                                        else {
                                            final int n4;
                                            if ((n4 = ((i.e == null) ? 0 : a(i.e[this.h][this.i], (byte)0, (byte)3, (byte)4))) != 8 && n4 != 7) {
                                                final int n5 = this.k & 0x7;
                                                int n6 = -1;
                                                int n7 = -1;
                                                boolean b3 = false;
                                                if (i.i[9] >= 2) {
                                                    int n8 = 0;
                                                    for (int n9 = 0; n9 < 2; ++n9) {
                                                        final int n10;
                                                        if (((n10 = ((n9 == 0) ? 1 : -1)) > 0 && this.h < this.e - 3) || (n10 < 0 && this.h > 3)) {
                                                            for (int n11 = 1; n11 <= 3; ++n11) {
                                                                final int n12 = this.h + n10 * n11;
                                                                final byte b4 = i.a[n12][this.i];
                                                                int n15 = 0;
                                                                Label_2157: {
                                                                    if ((i.a[n12][this.i] & 0xFF) != 0x7 || (i.a[n12][this.i] >> 8 & 0xF0) != 0x0) {
                                                                        if (b4 == 48 && (i.b[n12][this.i] & 0x8) != 0x0) {
                                                                            continue;
                                                                        }
                                                                        Label_2094: {
                                                                            switch (b4) {
                                                                                case 11:
                                                                                case 19:
                                                                                case 43: {
                                                                                    int n13;
                                                                                    int n14;
                                                                                    if (n10 > 0) {
                                                                                        n13 = n8;
                                                                                        n14 = 2;
                                                                                    }
                                                                                    else {
                                                                                        if (n10 >= 0) {
                                                                                            break Label_2094;
                                                                                        }
                                                                                        n13 = n8;
                                                                                        n14 = 4;
                                                                                    }
                                                                                    n8 = (n13 | n14);
                                                                                }
                                                                                case 0:
                                                                                case 1:
                                                                                case 8:
                                                                                case 9:
                                                                                case 14:
                                                                                case 47:
                                                                                case 48: {
                                                                                    if (n11 == 1) {
                                                                                        n15 = 4;
                                                                                        break Label_2157;
                                                                                    }
                                                                                    if (n7 < 0) {
                                                                                        n7 = ((n10 > 0) ? 2 : 4);
                                                                                        break;
                                                                                    }
                                                                                    b3 = true;
                                                                                    n7 = ((n8 == 2) ? 2 : ((n8 == 4) ? 4 : -1));
                                                                                    break;
                                                                                }
                                                                                case -1: {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    n15 = 4;
                                                                }
                                                                n11 = n15;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i.i[9] >= 1) {
                                                    this.a = 5;
                                                    int n16 = 0;
                                                    final int[] array = { 0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2 };
                                                    final int[] array2 = { -1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0 };
                                                    final int[] array3 = { 0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8 };
                                                    for (int n17 = 0; n17 < array.length; ++n17) {
                                                        final int n18 = this.h + array[n17];
                                                        final int n19 = this.i + array2[n17];
                                                        if (n18 >= 0 && n18 < this.e && n19 >= 0 && n19 < this.f) {
                                                            final int n20 = i.b[n18][n19] & 0x7;
                                                            boolean b5 = false;
                                                            int n21 = -1;
                                                            boolean b6 = false;
                                                            Label_2616: {
                                                                switch (i.a[n18][n19]) {
                                                                    case 9:
                                                                    case 18:
                                                                    case 30: {
                                                                        if (array3[n17] == 0) {
                                                                            b6 = true;
                                                                        }
                                                                        break Label_2616;
                                                                    }
                                                                    case 46:
                                                                    case 49:
                                                                    case 50: {
                                                                        if (array3[n17] == 0) {
                                                                            ++n16;
                                                                            b6 = true;
                                                                        }
                                                                        break Label_2616;
                                                                    }
                                                                    case 19:
                                                                    case 43: {
                                                                        if ((i.b[n18][n19] & 0xF8) == 0x0) {
                                                                            break;
                                                                        }
                                                                        break Label_2616;
                                                                    }
                                                                    case 45: {
                                                                        if ((i.b[n18][n19] & 0xF) != 0xA) {
                                                                            break;
                                                                        }
                                                                        break Label_2616;
                                                                    }
                                                                }
                                                                b5 = true;
                                                            }
                                                            if (b5) {
                                                                Label_2753: {
                                                                    int n22;
                                                                    if (array3[n17] == 0) {
                                                                        n22 = n17 + 1;
                                                                    }
                                                                    else {
                                                                        if (i.b[n18][n19] < 12) {
                                                                            break Label_2753;
                                                                        }
                                                                        if ((array3[n17] & 0x1) != 0x0 && n20 == 3) {
                                                                            if (array[n17] == 0) {
                                                                                n22 = 1;
                                                                            }
                                                                            else if (array[n17] < 0) {
                                                                                n22 = 4;
                                                                            }
                                                                            else {
                                                                                if (array[n17] <= 0) {
                                                                                    break Label_2753;
                                                                                }
                                                                                n22 = 2;
                                                                            }
                                                                        }
                                                                        else {
                                                                            if ((array3[n17] & 0x8) == 0x0 || n20 != 2) {
                                                                                break Label_2753;
                                                                            }
                                                                            if (array2[n17] == 0) {
                                                                                n22 = 4;
                                                                            }
                                                                            else if (array2[n17] < 0) {
                                                                                n22 = 1;
                                                                            }
                                                                            else {
                                                                                if (array2[n17] <= 0) {
                                                                                    break Label_2753;
                                                                                }
                                                                                n22 = 3;
                                                                            }
                                                                        }
                                                                    }
                                                                    n21 = n22;
                                                                }
                                                                if (n21 != -1) {
                                                                    b6 = true;
                                                                    ++n16;
                                                                }
                                                            }
                                                            if (b6) {
                                                                if (n16 == 0) {
                                                                    if (n5 == n17 + 1) {
                                                                        n6 = n5;
                                                                    }
                                                                    else if (n6 < 0) {
                                                                        n6 = n17 + 1;
                                                                    }
                                                                }
                                                                else {
                                                                    if (n16 != 1) {
                                                                        n6 = n5;
                                                                        break;
                                                                    }
                                                                    n6 = n21;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                Label_2971: {
                                                    i m = null;
                                                    int n23 = 0;
                                                    int n24 = 0;
                                                    Label_2967: {
                                                        if (n6 > 0 && n7 == n5) {
                                                            this.a = 6;
                                                            m = this;
                                                            n23 = (this.k & 0xFFFFFFF8);
                                                            n24 = n5;
                                                        }
                                                        else if (n6 > 0 && n7 < 0 && !b3) {
                                                            m = this;
                                                            n23 = (this.k & 0xFFFFFFF8);
                                                            n24 = n6;
                                                        }
                                                        else {
                                                            if (n6 >= 0 || n7 <= 0 || b3) {
                                                                if (b3 && (n5 == 2 || n5 == 4)) {
                                                                    this.a = 6;
                                                                    m = this;
                                                                    n23 = (this.k & 0xFFFFFFF8);
                                                                    n24 = n5;
                                                                    break Label_2967;
                                                                }
                                                                if (!b3 || n7 <= 0) {
                                                                    break Label_2971;
                                                                }
                                                            }
                                                            this.a = 6;
                                                            m = this;
                                                            n23 = (this.k & 0xFFFFFFF8);
                                                            n24 = n7;
                                                        }
                                                    }
                                                    m.k = (n23 | n24);
                                                }
                                                if (this.a == 6 && (i.a[this.h][this.i] & 0xFF) == 0x2 && i.a[this.h][this.i] >> 8 == 1) {
                                                    this.aD = -1;
                                                    this.b(this.h, this.i, (byte)2);
                                                }
                                            }
                                        }
                                    }
                                    else if (a(256)) {
                                        this.aD = -1;
                                        final int d2;
                                        if ((d2 = i.a[0].d) == 36 + (this.k & 0x7) - 1) {
                                            if ((i.a[this.h][this.i] & 0xFF) == 0x4) {
                                                this.ap();
                                            }
                                            else {
                                                this.p(2);
                                                this.g(19);
                                            }
                                        }
                                        switch (d2) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 34:
                                            case 35: {
                                                if ((i.a[this.h][this.i] & 0xFF) == 0x4) {
                                                    this.ap();
                                                    break;
                                                }
                                                this.p(2);
                                                this.g(19);
                                                break;
                                            }
                                        }
                                    }
                                    else if (a(32944)) {
                                        this.ae();
                                        i.ah = 0;
                                    }
                                    if (this.a != 5 && this.l == 0 && this.m == 0 && this.a != (this.k & 0x7)) {
                                        this.k |= 0x1000;
                                    }
                                }
                                break Label_4240;
                            }
                            case 10: {
                                break Label_4240;
                            }
                            case 15: {
                                Label_4006: {
                                    if (this.dV == this.dX && this.dW == this.dY) {
                                        int n25 = -1;
                                        if (a(4097)) {
                                            n25 = 2;
                                        }
                                        else if (a(262146)) {
                                            n25 = 3;
                                        }
                                        else if (a(16388)) {
                                            n25 = 4;
                                        }
                                        else if (a(65544)) {
                                            n25 = 1;
                                        }
                                        else if (a(32944)) {
                                            if (System.currentTimeMillis() >= 2000L) {
                                                final int a = a(i.a[this.dV][this.dW], (byte)6, (byte)5);
                                                this.p();
                                                this.au();
                                                System.gc();
                                                this.aB = a;
                                                this.l();
                                                i.ah = 0;
                                            }
                                            break Label_4006;
                                        }
                                        else if (a(64)) {
                                            this.J = true;
                                            this.H = true;
                                            this.L = true;
                                            this.bs = 0;
                                            i.b = 28;
                                            i.ah = 0;
                                            break Label_4240;
                                        }
                                        i.ah = 0;
                                        if (n25 != -1) {
                                            final int dv = this.dV;
                                            final int dw = this.dW;
                                            final long n26;
                                            final int a2 = a(n26 = i.a[dv][dw], (byte)11, (byte)3);
                                            int n27 = 14;
                                            int n28 = -1;
                                            int n29 = -1;
                                            for (int n30 = 0; n30 < a2; ++n30, n27 += 4) {
                                                final int a3 = a(n26, (byte)n27, (byte)4);
                                                n27 += 4;
                                                final int a4 = a(n26, (byte)n27, (byte)4);
                                                if (a(i.a[a3][a4], (byte)0, (byte)3) != 1) {
                                                    int n31 = 0;
                                                    switch (n25) {
                                                        case 1: {
                                                            if (a3 <= dv) {
                                                                continue;
                                                            }
                                                            if (n28 >= 0) {
                                                                n29 = n30;
                                                                continue;
                                                            }
                                                            n31 = n30;
                                                            break;
                                                        }
                                                        case 4: {
                                                            if (a3 >= dv) {
                                                                continue;
                                                            }
                                                            if (n28 >= 0) {
                                                                n29 = n30;
                                                                continue;
                                                            }
                                                            n31 = n30;
                                                            break;
                                                        }
                                                        case 2: {
                                                            if (a4 >= dw) {
                                                                continue;
                                                            }
                                                            if (n28 >= 0) {
                                                                n29 = n30;
                                                                continue;
                                                            }
                                                            n31 = n30;
                                                            break;
                                                        }
                                                        case 3: {
                                                            if (a4 <= dw) {
                                                                continue;
                                                            }
                                                            if (n28 >= 0) {
                                                                n29 = n30;
                                                                continue;
                                                            }
                                                            n31 = n30;
                                                            break;
                                                        }
                                                    }
                                                    n28 = n31;
                                                }
                                            }
                                            if (n28 != -1) {
                                                int n32 = -1;
                                                Label_3930: {
                                                    if (n29 != -1) {
                                                        int n33 = 14 + (n28 << 1 << 2);
                                                        final int a5 = a(n26, (byte)n33, (byte)4);
                                                        n33 += 4;
                                                        final int a6 = a(n26, (byte)n33, (byte)4);
                                                        int n34 = 14 + (n29 << 1 << 2);
                                                        final int a7 = a(n26, (byte)n34, (byte)4);
                                                        n34 += 4;
                                                        final int a8 = a(n26, (byte)n34, (byte)4);
                                                        int n35 = 0;
                                                        Label_3921: {
                                                            switch (n25) {
                                                                case 1:
                                                                case 4: {
                                                                    if (dw == a6) {
                                                                        n35 = n28;
                                                                        break Label_3921;
                                                                    }
                                                                    if (dw != a8) {
                                                                        n35 = ((Math.abs(dv - a5) > Math.abs(dv - a7)) ? n28 : n29);
                                                                        break Label_3921;
                                                                    }
                                                                    break;
                                                                }
                                                                case 2:
                                                                case 3: {
                                                                    if (dv == a5) {
                                                                        n35 = n28;
                                                                        break Label_3921;
                                                                    }
                                                                    if (dv != a7 && a5 > a7) {
                                                                        n35 = n28;
                                                                        break Label_3921;
                                                                    }
                                                                    break;
                                                                }
                                                                default: {
                                                                    break Label_3930;
                                                                }
                                                            }
                                                            n35 = n29;
                                                        }
                                                        n32 = n35;
                                                    }
                                                    else {
                                                        n32 = n28;
                                                    }
                                                }
                                                if (n32 != -1) {
                                                    int n36 = 14 + (n32 << 1 << 2);
                                                    final int a9 = a(n26, (byte)n36, (byte)4);
                                                    n36 += 4;
                                                    final int a10 = a(n26, (byte)n36, (byte)4);
                                                    if (a(i.a[a9][a10], (byte)0, (byte)3) == 0) {
                                                        this.dX = a9;
                                                        this.dY = a10;
                                                        this.aw = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break Label_4240;
                            }
                            case 17:
                            case 20: {
                                if (a(32944)) {
                                    if (this.aR == 5) {
                                        this.av();
                                        this.c(false);
                                        this.p();
                                    }
                                    this.u = true;
                                    break;
                                }
                                break Label_4240;
                            }
                            case 27: {
                                i.m = i.b;
                                this.R();
                                if (this.D != -1 || this.B != 0) {
                                    i.ah = 0;
                                    break Label_4240;
                                }
                                Label_4185: {
                                    i i2;
                                    int u;
                                    if (a(32944)) {
                                        i2 = this;
                                        u = 4;
                                    }
                                    else {
                                        if (a(64)) {
                                            this.p();
                                            i.b = 9;
                                            this.br = 8;
                                            this.a(-1);
                                            this.bs = 0;
                                            break Label_4185;
                                        }
                                        if (a(4097)) {
                                            i2 = this;
                                            u = 0;
                                        }
                                        else if (a(262146)) {
                                            i2 = this;
                                            u = 2;
                                        }
                                        else if (a(16388)) {
                                            i2 = this;
                                            u = 3;
                                        }
                                        else {
                                            if (!a(65544)) {
                                                break Label_4185;
                                            }
                                            i2 = this;
                                            u = 1;
                                        }
                                    }
                                    i2.u = u;
                                }
                                i.ah = 0;
                                break Label_4240;
                            }
                            case 31: {
                                if (a(64)) {
                                    this.bs = 0;
                                    this.br = 8;
                                    i.b = 9;
                                    this.a(-1);
                                    break;
                                }
                                if (a(32944)) {
                                    this.Q();
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    ah = 0;
                }
                i.ah = ah;
            }
            if (!this.d && (this.k & 0x7) != 0x0) {
                this.m = 10;
            }
        }
        switch (i.b) {
            case 22: {
                switch (this.aR) {
                    case 0: {
                        this.eo = 0;
                        this.ep = 0;
                        this.aR = 1;
                    }
                    case 1: {
                        i.s = a("/cr.f", 0);
                        int n37 = 0;
                        while (n37 < i.s.length) {
                            if (i.s[n37] == 92 && i.s[n37 + 1] == 110) {
                                i.s[n37++] = 10;
                                i.s[n37++] = 32;
                            }
                            else {
                                ++n37;
                            }
                        }
                        int n38;
                        for (n38 = 0; i.s[n38] != 36; ++n38) {}
                        for (int n39 = 0; n39 < GloftDIRU.a.length; ++n39, ++n38) {
                            i.s[n38] = GloftDIRU.a[n39];
                        }
                        this.aR = 2;
                    }
                    case 2: {
                        Label_4719: {
                            i i3 = null;
                            int eo = 0;
                            Label_4716: {
                                int n40 = 0;
                                int n41 = 0;
                                Label_4715: {
                                    if (a(4097)) {
                                        if (this.eo >= 240) {
                                            this.eo -= 3;
                                            if (this.eo < 240) {
                                                i3 = this;
                                                eo = 240;
                                                break Label_4716;
                                            }
                                            break Label_4719;
                                        }
                                    }
                                    else {
                                        if (a(262146)) {
                                            i3 = this;
                                            n40 = this.eo;
                                            n41 = 3;
                                            break Label_4715;
                                        }
                                        if (a(64)) {
                                            if (this.i) {
                                                this.bs = 0;
                                                this.br = 8;
                                                i.b = 9;
                                                this.i = false;
                                                break Label_4719;
                                            }
                                            this.aR = 3;
                                            break Label_4719;
                                        }
                                    }
                                    i3 = this;
                                    n40 = this.eo;
                                    n41 = 1;
                                }
                                eo = n40 + n41;
                            }
                            i3.eo = eo;
                        }
                        int n42;
                        int ep;
                        for (n42 = -this.eo, ep = 0; ep < i.s.length && n42 <= -340; ++ep) {
                            if (i.s[ep] == 10) {
                                n42 += 17;
                            }
                        }
                        this.ep = ep;
                        if (this.ep >= i.s.length) {
                            this.ep = 0;
                            this.eo = 0;
                            return;
                        }
                        break;
                    }
                    case 3: {
                        i.s = null;
                        System.gc();
                        i.b = 4;
                        this.aR = 2;
                        this.a(0);
                        this.a.b(19);
                        break;
                    }
                }
            }
            case 21: {
                final int n43 = this.bs++;
                Label_5670: {
                    try {
                        switch (n43) {
                            case 0: {
                                if (this.I) {
                                    this.s();
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                if (this.J) {
                                    this.p();
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (this.G) {
                                    this.G = false;
                                    a(i.a[17], true);
                                    i.a[17] = null;
                                    a(i.a[10], true);
                                    i.a[10] = null;
                                    a(i.a[46], true);
                                    i.a[46] = null;
                                    a(i.a[55], true);
                                    i.a[55] = null;
                                    i.b[8] = null;
                                    a(i.a[59], true);
                                    i.b[3] = null;
                                    a(i.a[17], true);
                                    i.a[17] = null;
                                    System.gc();
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                if (this.H) {
                                    this.au();
                                    break;
                                }
                                break;
                            }
                            case 4: {
                                h.a(16777215);
                                i.c.delete(0, i.c.length());
                                switch (this.aA) {
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
                                break;
                            }
                            case 5: {
                                i.a[17] = a("/ms.f", 0);
                                i.a[23] = a("/ms.f", 1);
                                break;
                            }
                            case 6: {
                                while (true) {
                                    f[] array4 = null;
                                    int n44 = 0;
                                    String s = null;
                                    int n45 = 0;
                                    switch (this.aA) {
                                        case 0: {
                                            array4 = i.a;
                                            n44 = 24;
                                            s = "/ms.f";
                                            n45 = 2;
                                            break;
                                        }
                                        case 1: {
                                            array4 = i.a;
                                            n44 = 25;
                                            s = "/ms.f";
                                            n45 = 3;
                                            break;
                                        }
                                        case 2: {
                                            array4 = i.a;
                                            n44 = 26;
                                            s = "/ms.f";
                                            n45 = 4;
                                            break;
                                        }
                                        default: {
                                            break Label_5670;
                                        }
                                    }
                                    array4[n44] = a(s, n45);
                                    continue;
                                }
                            }
                            case 7: {
                                if (i.a[54] == null) {
                                    i.a[54] = a("/mmv.f", 1);
                                }
                                this.G = c(i.a[54], 0) >> 1;
                                this.H = b(i.a[54], 0) >> 1;
                                break;
                            }
                            case 8: {
                                if (i.a[53] == null) {
                                    i.a[53] = a("/mmv.f", 2);
                                    break;
                                }
                                break;
                            }
                            case 9: {
                                if (i.a[52] == null) {
                                    i.a[52] = a("/mmv.f", 3);
                                    break;
                                }
                                break;
                            }
                            case 10: {
                                if (this.ac) {
                                    this.el = 0;
                                    this.ei = 0;
                                    this.ej = 0;
                                    this.ar = false;
                                    this.aq = true;
                                    this.ap = false;
                                    this.ek = 2;
                                    this.em = 2;
                                    this.as = false;
                                    break;
                                }
                                break;
                            }
                            case 14: {
                                if (this.C) {
                                    this.C = false;
                                }
                                this.dV = -1;
                                if (!this.ac) {
                                    this.aB = i.dZ;
                                }
                                this.ac = false;
                                for (int n46 = 0; n46 < 12; ++n46) {
                                    for (int n47 = 0; n47 < 12; ++n47) {
                                        final long n48;
                                        if ((n48 = i.a[n46][n47]) != 0L) {
                                            final int a11 = a(n48, (byte)6, (byte)5);
                                            int n49;
                                            int n50;
                                            int n51;
                                            if ((this.a(this.aA, a11) & 0x40) != 0x0 || a11 == 0) {
                                                n49 = n46;
                                                n50 = n47;
                                                n51 = 0;
                                            }
                                            else {
                                                n49 = n46;
                                                n50 = n47;
                                                n51 = 1;
                                            }
                                            a(n49, n50, n51, (byte)0, (byte)3);
                                            if (a11 == this.aB) {
                                                this.dV = n46;
                                                this.dW = n47;
                                            }
                                            if (a11 == i.dZ) {
                                                this.dX = n46;
                                                this.dY = n47;
                                            }
                                            this.ao = false;
                                        }
                                    }
                                }
                                i.b = 15;
                                break;
                            }
                        }
                    }
                    catch (Exception ex2) {}
                }
                this.e();
            }
            case 20: {
                if (i.aS > 30) {
                    this.C = true;
                    this.J = true;
                    this.H = true;
                    this.av();
                    return;
                }
                break;
            }
            case 35: {
                Label_6577: {
                    switch (this.bs++) {
                        case 0: {
                            i.de = 0;
                            i.df = 0;
                            i.dg = 0;
                            this.t = this.a(this.aA, this.aB);
                            this.u = 0;
                            break;
                        }
                        case 1: {
                            i.de = (i.de = a(i.i, 4)) + this.aZ;
                            this.u = false;
                            break;
                        }
                        case 2: {
                            i.i[4] = (byte)i.de;
                            i.i[5] = (byte)(i.de >> 8);
                            break;
                        }
                        case 3: {
                            i.df = (i.df = a(i.i, 6)) + this.bb;
                            break;
                        }
                        case 4: {
                            i.i[6] = (byte)i.df;
                            i.i[7] = (byte)(i.df >> 8);
                            break;
                        }
                        case 5: {
                            i.dg = i.i[2];
                            this.U = 0;
                            if ((i.dg & 0x8) == 0x0 && i.df >= a.b[1]) {
                                this.U = 1;
                                break;
                            }
                            if ((i.dg & 0x10) == 0x0 && i.df >= a.b[2]) {
                                this.U = 2;
                                break;
                            }
                            break;
                        }
                        case 6: {
                            try {
                                i.b[28] = a("/ui.f", 4, 0);
                            }
                            catch (Exception ex3) {}
                            break;
                        }
                        case 7: {
                            this.a(this.aA, this.aB, (byte)2);
                            this.V = 0;
                            break;
                        }
                        case 8: {
                            int v;
                            int n52;
                            for (n52 = (v = (i.dg & 0xE0) >> 5); v < 4 && i.de >= a.a[v]; ++v) {}
                            if (n52 < v) {
                                final byte[] i4 = i.i;
                                final int n53 = 2;
                                i4[n53] &= (byte)(-225);
                                final byte[] i5 = i.i;
                                final int n54 = 2;
                                i5[n54] |= (byte)(v << 5 & 0xE0);
                                this.u();
                                this.V = v;
                            }
                        }
                        case 9: {
                            this.W();
                            break;
                        }
                        case 10: {
                            this.e();
                            System.gc();
                            break;
                        }
                        case 11: {
                            if (this.az < 99 && this.aZ == this.aY && (this.t & 0x4) == 0x0) {
                                this.a(this.aA, this.aB, (byte)4);
                                this.u |= 0x4;
                                ++this.az;
                            }
                            if (this.az < 99 && this.bb == this.ba && (this.t & 0x8) == 0x0) {
                                this.a(this.aA, this.aB, (byte)8);
                                this.u |= 0x8;
                                ++this.az;
                            }
                            if (this.az < 99 && this.bc == 0 && (this.t & 0x10) == 0x0) {
                                this.a(this.aA, this.aB, (byte)16);
                                this.u |= 0x10;
                                ++this.az;
                            }
                            if (this.az < 99 && this.bd == 0 && (this.t & 0x20) == 0x0) {
                                this.a(this.aA, this.aB, (byte)32);
                                this.u |= 0x20;
                                ++this.az;
                            }
                            final int ab = this.aB;
                            int n55 = 0;
                        Label_6463:
                            while (true) {
                                while (n55 < 12) {
                                    for (int n56 = 0; n56 < 12; ++n56) {
                                        final long n57;
                                        if ((n57 = i.a[n55][n56]) != 0L && a(n57, (byte)6, (byte)5) == ab) {
                                            final long n58 = n57;
                                            break Label_6463;
                                        }
                                    }
                                    ++n55;
                                    continue;
                                    long n58 = 0L;
                                    final long n59 = n58;
                                    if ((this.aB == 0 || a(n59, (byte)11, (byte)3) > 1) && n59 >= 0L && (this.a(this.aA, this.aB + 1) & 0x40) == 0x0) {
                                        i.dZ = this.aB + 1;
                                        this.a(this.aA, i.dZ, (byte)64);
                                        this.ac = true;
                                    }
                                    else {
                                        i.dZ = this.aB;
                                    }
                                    this.c(false);
                                    this.s();
                                    this.I = false;
                                    this.H = true;
                                    break Label_6577;
                                }
                                final long n58 = -1L;
                                continue Label_6463;
                            }
                        }
                    }
                }
                this.e();
                if (this.bs == 12) {
                    i.b = 17;
                    this.aR = 0;
                    this.p(15);
                    return;
                }
                break;
            }
            case 17: {
                switch (this.aR) {
                    case 0: {
                        if (i.aS > 40 || this.u) {
                            ++this.aR;
                            this.e();
                            return;
                        }
                        break;
                    }
                    case 1: {
                        if ((i.aS > this.aZ << 1 && i.aS > 40) || this.u) {
                            ++this.aR;
                            this.e();
                            return;
                        }
                        break;
                    }
                    case 2: {
                        if (i.aS > 40 || this.u) {
                            ++this.aR;
                            this.e();
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if (i.aS > 10 || this.u) {
                            ++this.aR;
                            this.e();
                            return;
                        }
                        break;
                    }
                    case 4: {
                        if (i.aS > 10 || this.u) {
                            ++this.aR;
                            this.e();
                            this.u = false;
                            break;
                        }
                        break;
                    }
                }
            }
            case 31: {}
            case 16: {
                this.D = true;
                this.l();
                i.ah = 0;
            }
            case 0: {
                (i.a[0] = new b(a("/ui.f", 0), 0, 0, null)).a(0);
                i.b = 6;
                this.e();
            }
            case 6: {
                if (i.aS < 60) {
                    i.a[0].b();
                    return;
                }
                i.a = a(127);
                i.b = a();
                i.c = b();
                try {
                    i.b = d.a(127).trim().equals("1");
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    i.b = false;
                }
                aA();
                i.a[18] = a("/ui.f", 3);
                this.p();
                j.a = true;
                i.b = 8;
                this.bs = 0;
                this.br = 32;
            }
            case 7: {
                if (this.z) {
                    i.b = 8;
                    this.bs = 0;
                    this.br = 32;
                    return;
                }
                break;
            }
            case 1: {
                this.U();
            }
            case 3: {
                this.B = true;
            }
            case 9: {
                try {
                    this.t();
                    int bs = 0;
                    int n60 = 0;
                    if (this.br == 8) {
                        bs = this.bs;
                    }
                    else {
                        n60 = this.bs - 24;
                    }
                    int n61 = n60;
                    switch (bs) {
                        case 0: {
                            aA();
                            System.gc();
                        }
                        case 1: {}
                        case 2: {}
                        case 3: {}
                        case 4: {}
                        case 6: {
                            if (i.a == null) {
                                i.a = a("/spl.f", 0);
                            }
                            if (i.b == null) {
                                i.b = a("/spl.f", 1);
                            }
                            if (i.c == null) {
                                i.c = a("/spl.f", 2);
                                break;
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
                    ++n61;
                    ++this.bs;
                    this.Y = true;
                    if (n61 == 8) {
                        if (this.F) {
                            i.b = 4;
                            if (this.bo == -1) {
                                this.a(this.aR = 0);
                            }
                            else {
                                this.aR = 2;
                            }
                        }
                        else {
                            i.b = 30;
                            this.F = true;
                        }
                        this.a.b(19);
                    }
                }
                catch (Exception ex4) {}
                this.e();
            }
            case 11: {
                this.J = true;
                this.H = true;
                i.b = 5;
                this.R = true;
                this.e();
            }
            case 5: {
                if (this.D && this.bs <= 5) {
                    this.e(this.bs++);
                    for (int n62 = 0; n62 < 3; ++n62) {
                        i.b[n62] = false;
                    }
                    for (int n63 = 1; n63 < 3; ++n63) {
                        i.a[n63] = false;
                    }
                    this.e();
                    if (this.bs == 5) {
                        this.N = true;
                        this.M = true;
                        this.L = true;
                        this.aA = 0;
                        this.aB = 13;
                        i.ah = 0;
                    }
                }
                else {
                    this.j();
                }
                this.e();
            }
            case 8: {
                final int n64 = this.bs++;
                if (n64 < 21) {
                    if (n64 == 0) {
                        this.a.b();
                    }
                    this.a.a(n64);
                    if (n64 == 20) {
                        this.a.c();
                    }
                    System.gc();
                }
                else {
                    switch (n64) {
                        case 21: {
                            i.a[9] = a("/cm.f", 7);
                            break;
                        }
                        case 22: {
                            i.a[0] = a("/ui.f", 2);
                            break;
                        }
                        case 23: {
                            i.a[0] = a("/demoui.f", 0, 0);
                            i.a[1] = a("/demoui.f", 0, 1);
                            break;
                        }
                        case 24: {
                            this.a.a();
                            i.b = 9;
                            this.a(-1);
                            (i.a = new StringBuffer(i.c[0])).delete(i.a.length() - 1, i.a.length());
                            (i.b = new StringBuffer(i.c[11])).delete(i.b.length() - 1, i.b.length());
                            i.c = new StringBuffer("1");
                            break;
                        }
                    }
                }
                this.e();
            }
            case 2:
            case 12: {}
            case 15: {
                if (this.U > 0 || this.V > 0) {
                    final StringBuffer sb = new StringBuffer();
                    Label_7811: {
                        if (this.U > 0) {
                            sb.append(i.a[124]).append("\n");
                            while (true) {
                                final byte[] i6;
                                int n65 = 0;
                                byte b7 = 0;
                                byte b8 = 0;
                                switch (this.U) {
                                    case 1: {
                                        sb.append(i.a[4]);
                                        i6 = i.i;
                                        b7 = i6[n65 = 2];
                                        b8 = 8;
                                        break;
                                    }
                                    case 2: {
                                        sb.append(i.a[64]);
                                        final byte[] i7 = i.i;
                                        final int n66 = 2;
                                        i7[n66] |= 0x8;
                                        b7 = i.i[n65 = 2];
                                        b8 = 16;
                                        break;
                                    }
                                    default: {
                                        this.u();
                                        this.U = 0;
                                        break Label_7811;
                                    }
                                }
                                i6[n65] = (byte)(b7 | b8);
                                continue;
                            }
                        }
                    }
                    if (this.V > 0) {
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(i.a[33]).append("\n").append(i.a[120 + this.V - 1]);
                        this.V = 0;
                    }
                    if (sb.length() > 0) {
                        this.a(sb.toString(), -1, -1, 5000, 4273165, 0);
                    }
                }
            }
            case 27: {
                this.i();
            }
            case 28: {
                try {
                    this.b(this.bs);
                    ++this.bs;
                    if (this.bs == 11) {
                        i.b = 27;
                    }
                }
                catch (Exception ex5) {}
                this.e();
            }
            case 29: {
                this.g();
                break;
            }
        }
    }
    
    private void g() {
        switch (this.W) {
            case 0: {
                if (System.currentTimeMillis() - this.a >= 3000L) {
                    ++this.W;
                    this.e();
                    return;
                }
                break;
            }
            case 1: {
                i i;
                boolean av;
                if (i.aS % 6 >= 3) {
                    this.X += 1677721;
                    i = this;
                    av = false;
                }
                else {
                    i = this;
                    av = true;
                }
                i.av = av;
                if (System.currentTimeMillis() - this.a >= 5000L) {
                    ++this.W;
                    this.av = true;
                    this.e();
                    return;
                }
                break;
            }
            case 2: {
                Label_0195: {
                    i j;
                    byte d;
                    if (this.Z >= this.f) {
                        j = this;
                        d = -1;
                    }
                    else {
                        if (this.Z > -this.f) {
                            break Label_0195;
                        }
                        j = this;
                        d = 1;
                    }
                    j.d = d;
                }
                this.Z += this.d * this.h;
                Label_0246: {
                    i k;
                    byte e;
                    if (this.Y >= this.g) {
                        k = this;
                        e = -1;
                    }
                    else {
                        if (this.Z > -this.g) {
                            break Label_0246;
                        }
                        k = this;
                        e = 1;
                    }
                    k.e = e;
                }
                final int y = this.Y;
                final byte e2 = this.e;
                this.Y = y + 0;
                if (System.currentTimeMillis() - this.a >= 10000L) {
                    this.Y = 0;
                    this.Z = 0;
                    this.e();
                    ++this.W;
                    return;
                }
                break;
            }
            case 3: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.W;
                    return;
                }
                break;
            }
            case 4: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.W;
                    return;
                }
                break;
            }
            case 5: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.W;
                    return;
                }
                break;
            }
            case 6: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    ++this.W;
                    this.e();
                    return;
                }
                break;
            }
            case 7: {
                if (System.currentTimeMillis() - this.a >= 1000L) {
                    g.a = new byte[12][13];
                    ++this.W;
                    g.b(3);
                    this.a.b(19);
                    this.e();
                    return;
                }
                break;
            }
            case 8: {
                g.a(3);
                this.av = true;
                if (System.currentTimeMillis() - this.a >= 15000L) {
                    ++this.W;
                    this.e();
                    return;
                }
                break;
            }
            case 9: {
                this.av = true;
                g.a(3);
                if (System.currentTimeMillis() - this.a >= 12000L) {
                    ++this.W;
                    this.e();
                    return;
                }
                break;
            }
            case 10: {
                this.p();
                this.a(0);
                i.b = 22;
                this.aR = 0;
                this.a.e();
                break;
            }
        }
    }
    
    private void b(int n) {
        switch (n) {
            case 0: {
                if (this.K) {
                    this.o();
                    return;
                }
                break;
            }
            case 1: {
                if (this.H) {
                    this.au();
                    return;
                }
                break;
            }
            case 2: {
                if (this.M) {
                    this.x();
                    return;
                }
                break;
            }
            case 3: {
                if (this.L) {
                    System.gc();
                    this.L = false;
                    return;
                }
                break;
            }
            case 4: {
                this.p();
                if (i.a[10] == null) {
                    final f[] a = i.a;
                    final int n2 = 10;
                    final String s = "/mmv.f";
                    final int n3 = 0;
                    n = 0;
                    a[n2] = a(s, n3, 0, 0);
                }
                if (i.a[46] == null) {
                    final f[] a2 = i.a;
                    final int n4 = 46;
                    final String s2 = "/mmv.f";
                    final int n5 = 5;
                    n = 0;
                    a2[n4] = a(s2, n5, 0, 0);
                }
                this.z = 240 - c(i.a[10], 0) >> 1;
                this.A = 320 - b(i.a[10], 0) - 48 >> 1;
            }
            case 5: {
                if (i.a[55] == null) {
                    final f[] a3 = i.a;
                    final int n6 = 55;
                    final String s3 = "/mmv.f";
                    final int n7 = 4;
                    n = 0;
                    a3[n6] = a(s3, n7, 0, 0);
                    this.x = a(i.a[55], 0);
                    i.b = i.a[55];
                }
                if (i.a[18] == null) {
                    final f[] a4 = i.a;
                    final int n8 = 18;
                    final String s4 = "/ui.f";
                    final int n9 = 3;
                    n = 0;
                    a4[n8] = a(s4, n9, 0, 0);
                    return;
                }
                break;
            }
            case 6: {
                if (i.a[54] == null) {
                    final f[] a5 = i.a;
                    final int n10 = 54;
                    final String s5 = "/mmv.f";
                    final int n11 = 1;
                    n = 0;
                    a5[n10] = a(s5, n11, 0, 0);
                }
                this.G = c(i.a[54], 0) >> 1;
                this.H = b(i.a[54], 0) >> 1;
            }
            case 7: {
                if (i.a[53] == null) {
                    final f[] a6 = i.a;
                    final int n12 = 53;
                    final String s6 = "/mmv.f";
                    final int n13 = 2;
                    n = 0;
                    a6[n12] = a(s6, n13, 0, 0);
                    return;
                }
                break;
            }
            case 8: {
                if (i.a[52] == null) {
                    final f[] a7 = i.a;
                    final int n14 = 52;
                    final String s7 = "/mmv.f";
                    final int n15 = 3;
                    n = 0;
                    a7[n14] = a(s7, n15, 0, 0);
                    return;
                }
                break;
            }
            case 9: {
                try {
                    final String string = "/" + 0 + ".f";
                    final int n16 = 3;
                    n = 0;
                    i.b[8] = a(string, n16, 0, 0).a[0];
                    final String s8 = "/cm.f";
                    final int n17 = 2;
                    n = 0;
                    final f a8;
                    (a8 = a(s8, n17, 0, 0)).a(0, 0, -1, -1);
                    a8.a(1, 0, 0, -1);
                    i.a[59] = a8;
                    g.a = a8.a[0].length;
                    a8.d = null;
                    if (i.a[17] == null) {
                        final f[] a9 = i.a;
                        final int n18 = 17;
                        final String s9 = "/ms.f";
                        final int n19 = 0;
                        n = 0;
                        a9[n18] = a(s9, n19, 0, 0);
                    }
                }
                catch (Exception ex) {}
            }
            case 10: {
                if (i.a[9] == null) {
                    final f[] a10 = i.a;
                    final int n20 = 9;
                    final String s10 = "/cm.f";
                    final int n21 = 7;
                    n = 0;
                    a10[n20] = a(s10, n21, 0, 0);
                }
                this.J = a(i.a[9], 5);
                n = i.i[2];
                for (int i = 0; i < 3; ++i) {
                    if ((n & 1 << i) != 0x0) {
                        i.b[i] = true;
                    }
                }
                this.E = 10;
                this.F = 10;
                Label_0747: {
                    boolean[] array;
                    int n22;
                    boolean b;
                    if (((n = i.i[1]) & 0x1) != 0x0) {
                        array = i.a;
                        n22 = 1;
                        b = true;
                    }
                    else {
                        if (a(i.i, 6) >= a.b[1]) {
                            final byte[] j = i.i;
                            final int n23 = 1;
                            j[n23] |= 0x1;
                            this.u();
                            this.B = 1;
                            this.p = 1;
                            break Label_0747;
                        }
                        array = i.a;
                        n22 = 1;
                        b = false;
                    }
                    array[n22] = b;
                }
                Label_0810: {
                    boolean[] array2;
                    int n24;
                    boolean b2;
                    if ((n & 0x2) != 0x0) {
                        array2 = i.a;
                        n24 = 2;
                        b2 = true;
                    }
                    else {
                        if (a(i.i, 6) >= a.b[2]) {
                            final byte[] k = i.i;
                            final int n25 = 1;
                            k[n25] |= 0x2;
                            this.u();
                            this.B = 2;
                            this.p = 2;
                            break Label_0810;
                        }
                        array2 = i.a;
                        n24 = 2;
                        b2 = false;
                    }
                    array2[n24] = b2;
                }
                this.q = a.d[this.p << 1];
                this.r = a.d[(this.p << 1) + 1];
                this.s = this.q;
                this.t = this.r;
                this.h();
                this.g = true;
                this.av = true;
                break;
            }
        }
    }
    
    private void h() {
        i i;
        StringBuffer append;
        String lowerCase;
        if (this.p == 3) {
            i = this;
            append = new StringBuffer();
            lowerCase = i.a[45];
        }
        else if (b(this.p)) {
            i = this;
            append = new StringBuffer();
            lowerCase = i.a[45];
        }
        else {
            i = this;
            append = new StringBuffer().append(a.b[this.p]).append(" ");
            lowerCase = i.a[48].toLowerCase();
        }
        i.b = append.append(lowerCase).append(" ").append(i.a[77]).toString();
        i j = null;
        String[] array = null;
        int n = 0;
        switch (this.p) {
            case 0: {
                j = this;
                array = i.a;
                n = 1;
                break;
            }
            case 1: {
                j = this;
                array = i.a;
                n = 4;
                break;
            }
            case 2: {
                j = this;
                array = i.a;
                n = 64;
                break;
            }
            case 3: {
                j = this;
                array = i.a;
                n = 63;
                break;
            }
            default: {
                return;
            }
        }
        j.c = array[n];
    }
    
    private static boolean b(final int n) {
        return n == 0 || n == 3 || a(i.i, 6) >= a.b[n];
    }
    
    private void i() {
        if (!this.v) {
            this.s = this.q;
            this.t = this.r;
        }
        if (this.f) {
            i.ah = 0;
            final int n = this.v - this.q;
            final int n2 = this.w - this.r;
            this.q += n / (8 - this.c);
            this.r += n2 / (8 - this.c);
            ++this.c;
            if (this.c == 8) {
                this.q = this.v;
                this.r = this.w;
                this.f = false;
                this.c = 0;
                this.g = true;
                this.h();
            }
        }
        else {
            switch (this.u) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.p) {
                        case 0: {
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 0;
                            this.l = false;
                            i.b = 15;
                            i.dZ = b(this.aA);
                            this.av();
                            break;
                        }
                        case 1: {
                            if (!b(this.p)) {
                                break;
                            }
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 1;
                            this.aB = 0;
                            i.b = 15;
                            i.dZ = b(this.aA);
                            this.av();
                            this.p = true;
                            this.l = false;
                            if (i.i[9] < 1) {
                                i.i[9] = 1;
                                break;
                            }
                            break;
                        }
                        case 2: {
                            if (!b(this.p)) {
                                break;
                            }
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 2;
                            this.aB = 0;
                            this.l = false;
                            i.b = 15;
                            i.dZ = b(this.aA);
                            this.av();
                            this.p = true;
                            if (i.i[9] < 2) {
                                i.i[9] = 2;
                                break;
                            }
                            break;
                        }
                        case 3: {
                            i.b = 18;
                            break;
                        }
                    }
                    break;
                }
                default: {
                    final byte p;
                    if ((p = a.a[this.u][this.p]) != -1) {
                        this.p = p;
                        this.f = true;
                        this.v = a.d[this.p << 1];
                        this.w = a.d[(this.p << 1) + 1];
                        break;
                    }
                    break;
                }
            }
            this.u = -1;
        }
    }
    
    private static String[] a(int n) {
        n = (int)(Object)new String[128];
        for (int i = 0; i <= 127; ++i) {
            try {
                n[i] = d.a(i);
            }
            catch (Exception ex) {
                n[i] = "E";
            }
        }
        return (String[])(Object)n;
    }
    
    private static String[] a() {
        final String[] array = new String[39];
        for (int i = 0; i < 39; ++i) {
            try {
                switch (i) {
                    case 0: {
                        array[i] = d.a(79);
                        break;
                    }
                    case 1: {
                        array[i] = d.a(80);
                        break;
                    }
                    case 2: {
                        array[i] = d.a(91);
                        break;
                    }
                    case 3: {
                        array[i] = d.a(102);
                        break;
                    }
                    case 4: {
                        array[i] = d.a(112);
                        break;
                    }
                    case 5: {
                        array[i] = d.a(113);
                        break;
                    }
                    case 6: {
                        array[i] = d.a(114);
                        break;
                    }
                    case 7: {
                        array[i] = d.a(115);
                        break;
                    }
                    case 8: {
                        array[i] = d.a(116);
                        break;
                    }
                    case 9: {
                        array[i] = d.a(117);
                        break;
                    }
                    case 10: {
                        array[i] = d.a(81);
                        break;
                    }
                    case 11: {
                        array[i] = d.a(82);
                        break;
                    }
                    case 12: {
                        array[i] = d.a(83);
                        break;
                    }
                    case 13: {
                        array[i] = d.a(84);
                        break;
                    }
                    case 14: {
                        array[i] = d.a(85);
                        break;
                    }
                    case 15: {
                        array[i] = d.a(86);
                        break;
                    }
                    case 16: {
                        array[i] = d.a(87);
                        break;
                    }
                    case 17: {
                        array[i] = d.a(88);
                        break;
                    }
                    case 18: {
                        array[i] = d.a(89);
                        break;
                    }
                    case 19: {
                        array[i] = d.a(90);
                        break;
                    }
                    case 20: {
                        array[i] = d.a(92);
                        break;
                    }
                    case 21: {
                        array[i] = d.a(93);
                        break;
                    }
                    case 22: {
                        array[i] = d.a(94);
                        break;
                    }
                    case 23: {
                        array[i] = d.a(95);
                        break;
                    }
                    case 24: {
                        array[i] = d.a(96);
                        break;
                    }
                    case 25: {
                        array[i] = d.a(97);
                        break;
                    }
                    case 26: {
                        array[i] = d.a(98);
                        break;
                    }
                    case 27: {
                        array[i] = d.a(99);
                        break;
                    }
                    case 28: {
                        array[i] = d.a(100);
                        break;
                    }
                    case 29: {
                        array[i] = d.a(101);
                        break;
                    }
                    case 30: {
                        array[i] = d.a(103);
                        break;
                    }
                    case 31: {
                        array[i] = d.a(104);
                        break;
                    }
                    case 32: {
                        array[i] = d.a(105);
                        break;
                    }
                    case 33: {
                        array[i] = d.a(106);
                        break;
                    }
                    case 34: {
                        array[i] = d.a(107);
                        break;
                    }
                    case 35: {
                        array[i] = d.a(108);
                        break;
                    }
                    case 36: {
                        array[i] = d.a(109);
                        break;
                    }
                    case 37: {
                        array[i] = d.a(110);
                        break;
                    }
                    case 38: {
                        array[i] = d.a(111);
                        break;
                    }
                }
            }
            catch (Exception ex) {
                array[i] = "E";
            }
        }
        return array;
    }
    
    private void j() {
        try {
            int bs = this.bs;
            if (this.D) {
                bs -= 5;
            }
            ++this.bs;
            switch (bs) {
                case 0: {
                    if (this.N) {
                        this.u();
                    }
                }
                case 1: {
                    if (this.M) {
                        this.x();
                    }
                }
                case 2: {
                    if (this.L) {
                        System.gc();
                        this.L = false;
                    }
                }
                case 3: {
                    h.a();
                    h.a();
                }
                case 4: {
                    if (this.J) {
                        this.p();
                    }
                }
                case 5: {
                    if (this.H) {
                        this.au();
                    }
                }
                case 6: {
                    Label_0191: {
                        final byte b;
                        i i;
                        int ag;
                        if ((b = i.i[12]) < 1) {
                            i = this;
                            ag = b;
                        }
                        else {
                            if ((this.ag + 8) % 8 >= 1) {
                                break Label_0191;
                            }
                            i = this;
                            ag = 1;
                        }
                        i.ag = ag;
                    }
                    o(this.ag % 8);
                }
                case 7: {
                    this.ba = this.c(this.aA, this.aB);
                }
                case 8: {
                    i.cC = 264;
                    i.cD = 264;
                    i.b = (i.d = Image.createImage(i.cC, i.cD)).getGraphics();
                    i.cE = -1;
                    i.a = false;
                    this.e = true;
                    this.aC = 0;
                    this.bj = 0;
                    this.c = 0L;
                    this.d = 0L;
                    this.ab = 0;
                    this.ac = 0;
                    this.k = 0;
                    this.P = ((this.a(this.aA, this.aB) & 0x2) != 0x0);
                    this.cl = 0;
                    switch (this.aA) {
                        case 0: {
                            if (this.aB == 5) {
                                this.k = 1;
                                this.al = 816;
                                this.am = 0;
                                break;
                            }
                            if (this.aB == 13) {
                                this.k = 2;
                                this.t = false;
                                break;
                            }
                            if (this.aB == 8) {
                                this.k = 4;
                                this.ao = 0;
                                this.aq = 3;
                                this.ar = 0;
                                this.ap = 0;
                                this.k = false;
                                this.c |= 0x8L;
                                this.c |= 0x400L;
                                this.O = 2;
                                this.P = 12;
                                this.Q = 15;
                                this.R = 5;
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if (this.aB == 9) {
                                this.y();
                                break;
                            }
                            break;
                        }
                        case 2: {
                            if (this.aB == 10) {
                                this.ad();
                                this.as = 360;
                                this.k = 3;
                                this.c |= 0x80L;
                                this.c |= 0x8L;
                                break;
                            }
                            break;
                        }
                    }
                    this.q = false;
                    this.r = false;
                    this.s = false;
                    this.aa = 0;
                    this.be = -1;
                    this.bf = -1;
                    this.o = 0;
                    this.bg = 0;
                    this.bh = 0;
                    this.bi = 0;
                    this.ax = 70;
                    this.n = i.i[8];
                    this.l = 0;
                    this.aZ = 0;
                    this.bc = 0;
                    this.bd = 0;
                    this.bb = 0;
                    this.aW = 0;
                    this.k = 0;
                    this.aT = 0;
                    this.aU = 0;
                    this.aV = 0;
                    i.cm = -1;
                    i.m = null;
                    i.l = null;
                    (this.a = this.getClass().getResourceAsStream(i.d[this.aA])).read();
                    int j = 0;
                    while (j == 0) {
                        final int read = this.a.read();
                        int n = 0;
                        byte[] b2 = new byte[4];
                        while (n < read && j == 0) {
                            this.a.read(b2);
                            final int a = a(b2, 0);
                            final int a2 = a(b2, 2);
                            if (n == this.aB) {
                                this.e = a;
                                this.f = a2;
                                i.a = null;
                                i.c = null;
                                i.a = null;
                                System.gc();
                                i.a = new byte[this.e][this.f];
                                i.c = new byte[this.e][this.f];
                                i.a = new int[this.e][this.f];
                                final byte[] b3 = new byte[this.e * this.f];
                                this.a.read(b3);
                                for (int k = 0; k < this.e; ++k) {
                                    for (int l = 0; l < this.f; ++l) {
                                        i.a[k][l] = b3[k + l * this.e];
                                    }
                                }
                                i.b = new byte[this.e][this.f];
                                i.b = new int[this.e][this.f];
                                this.a.read(b3);
                                for (int n2 = 0; n2 < this.e; ++n2) {
                                    for (int n3 = 0; n3 < this.f; ++n3) {
                                        i.b[n2][n3] = b3[n2 + n3 * this.e];
                                    }
                                }
                                this.a.read(b3);
                                for (int n4 = 0; n4 < this.e; ++n4) {
                                    for (int n5 = 0; n5 < this.f; ++n5) {
                                        i.a[n4][n5] = b3[n4 + n5 * this.e];
                                    }
                                }
                                b2 = null;
                                j = 1;
                            }
                            else {
                                this.a.skip(a * a2 * 3);
                            }
                            ++n;
                        }
                    }
                    this.a.close();
                    this.a = null;
                    final int n6 = 0;
                    this.c = n6;
                    this.a = n6;
                    final int n7 = 0;
                    this.d = n7;
                    this.b = n7;
                    this.a();
                    System.gc();
                }
                case 9: {
                    final Hashtable<Object, Integer> hashtable = new Hashtable<Object, Integer>();
                    final Hashtable<Integer, Integer> hashtable2 = new Hashtable<Integer, Integer>();
                    final Hashtable<Integer, Integer> hashtable3 = new Hashtable<Integer, Integer>();
                    this.ai = 0;
                    this.aj = 0;
                    int n8 = 0;
                    this.aY = 0;
                    this.bu = 0;
                    int n9 = 0;
                    int n10 = 0;
                    this.ag = false;
                    this.ah = false;
                    this.ai = false;
                    this.aw = 0;
                    int n11 = 0;
                    for (int n12 = 0; n12 < this.e; ++n12) {
                        for (int n13 = 0; n13 < this.f; ++n13) {
                            i.b[n12][n13] = 0;
                            i.c[n12][n13] = 0;
                            final int n14 = i.a[n12][n13];
                            final int n15 = i.b[n12][n13];
                            final byte b4 = i.a[n12][n13];
                            Label_2656: {
                                if (n14 != -1) {
                                    switch (n14 & 0xFF) {
                                        case 31: {
                                            this.c |= 0x40000000L;
                                            i.a[n12][n13] = (n15 << 8 | 0x1F);
                                        }
                                        case 19: {
                                            i.a[n12][n13] = (n15 << 8 | 0x13);
                                            break;
                                        }
                                        case 17: {
                                            final int n16;
                                            if ((n16 = (i.a[n12][n13 - 1] & 0xFF)) == 14 || n16 == 33) {
                                                i.a[n12][n13 - 1] = (0xFF00 | n16);
                                            }
                                            final byte b5;
                                            switch (b5 = i.a[n12][n13 - 1]) {
                                                case 19:
                                                case 36:
                                                case 43:
                                                case 45:
                                                case 46:
                                                case 49: {
                                                    final Integer n17 = new Integer(n15);
                                                    final Integer n18;
                                                    hashtable2.put(n17, ((n18 = hashtable2.get(n17)) == null) ? new Integer(1) : new Integer(n18 + 1));
                                                    i.a[n12][n13] = -1;
                                                    final Integer n19 = hashtable3.get(n17);
                                                    if (b5 == 36) {
                                                        if (n19 == null) {
                                                            hashtable3.put(n17, new Integer(58));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    else {
                                                        hashtable3.put(n17, new Integer(56));
                                                        if (this.k == 4) {
                                                            hashtable3.put(n17, new Integer(51));
                                                            break;
                                                        }
                                                        if (this.k == 5) {
                                                            hashtable3.put(n17, new Integer(52));
                                                            break;
                                                        }
                                                        if (this.k == 3) {
                                                            hashtable3.put(n17, new Integer(53));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    i.a[n12][n13] = (n15 << 8 | 0x11);
                                                    break;
                                                }
                                            }
                                            if (n15 >= 0) {
                                                n10 |= 1 << n15;
                                                break;
                                            }
                                            break;
                                        }
                                        case 14:
                                        case 33: {
                                            if (!this.f()) {
                                                i.a[n12][n13] = 33;
                                            }
                                            this.c |= 1L << (((i.a[n12][n13] & 0xFF) == 0xE) ? 22 : 33);
                                            if (!this.a(this.aA, this.aB, n12, n13)) {
                                                break;
                                            }
                                            if (this.f()) {
                                                i.a[n12][n13] = 41;
                                                i.b[n12][n13] = 10;
                                                this.aY += 10;
                                                break;
                                            }
                                            i.a[n12][n13] = -1;
                                            final int[] array = i.a[n12];
                                            final int n20 = n13;
                                            array[n20] |= 0x100;
                                            break;
                                        }
                                        case 2: {
                                            this.c |= 0x100000L;
                                            switch (n15) {
                                                case 0:
                                                case 1: {
                                                    this.c |= 0x80000L;
                                                    break;
                                                }
                                            }
                                            i.a[n12][n13] = (n15 << 8 | 0x2);
                                            break;
                                        }
                                        case 8: {
                                            this.ah = true;
                                        }
                                        case 9: {
                                            if ((n14 & 0xFF) != 0x8) {
                                                this.ag = true;
                                            }
                                            this.c |= 0x10000000L;
                                            final Integer n21 = new Integer(n15);
                                            final Integer n22;
                                            hashtable.put(n21, ((n22 = hashtable.get(n21)) == null) ? new Integer(1) : new Integer(n22 + 1));
                                            i.a[n12][n13] = (n15 << 8 | n14);
                                            break;
                                        }
                                        case 7: {
                                            if (n15 != -1) {
                                                i.q[n15] = (byte)n12;
                                                i.r[n15] = (byte)n13;
                                            }
                                            i.a[n12][n13] = (n15 << 8 | n14);
                                            break;
                                        }
                                        case 30: {
                                            this.c |= 0x40000000L;
                                            ++n11;
                                        }
                                        case 1:
                                        case 26: {
                                            i.a[n12][n13] = (n15 << 8 | (n14 & 0xFF));
                                            break;
                                        }
                                        case 0: {
                                            ++n11;
                                            i.a[n12][n13] = (n15 << 8 | (n14 & 0xFF));
                                            break;
                                        }
                                        case 4: {
                                            ++n9;
                                            this.c |= 0x10L;
                                            i.a[n12][n13] = (n15 << 8 | (n14 & 0xFF));
                                            break;
                                        }
                                        case 5: {
                                            this.p = (byte)n15;
                                            break;
                                        }
                                        case 28: {
                                            this.q = (byte)n15;
                                            break;
                                        }
                                        case 3: {
                                            i.c[n12][n13] = 127;
                                            if (n15 > 0) {
                                                i.a[n12][n13] = (n15 + 1 << 8 | 0x3);
                                                break;
                                            }
                                            break;
                                        }
                                        case 6: {
                                            final Integer n23 = new Integer(n15);
                                            final Integer n24;
                                            hashtable.put(n23, ((n24 = hashtable.get(n23)) == null) ? new Integer(1) : new Integer(n24 + 1));
                                            this.c |= 0x20000000L;
                                            i.a[n12][n13] = (n15 << 8 | 0x6);
                                            break;
                                        }
                                        default: {
                                            if (n14 >= 20 && n14 < 26) {
                                                i.a[n12][n13] = n14;
                                                while (true) {
                                                    i m = null;
                                                    long n25 = 0L;
                                                    long n26 = 0L;
                                                    switch (this.aA) {
                                                        case 0: {
                                                            m = this;
                                                            n25 = this.c;
                                                            n26 = 16L;
                                                            break;
                                                        }
                                                        case 1: {
                                                            m = this;
                                                            n25 = this.c;
                                                            n26 = 2097152L;
                                                            break;
                                                        }
                                                        default: {
                                                            break Label_2656;
                                                        }
                                                    }
                                                    m.c = (n25 | n26);
                                                    continue;
                                                }
                                            }
                                            if (n14 < 80 && n14 > -1) {
                                                i.a[n12][n13] = -1;
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
                            int n30 = 0;
                            int n31 = 0;
                            switch (b4) {
                                case 48: {
                                    int[] array2;
                                    int n27;
                                    int n28;
                                    if ((n15 & 0x7) == 0x4) {
                                        array2 = i.b[n12];
                                        n27 = n13;
                                        n28 = 16;
                                    }
                                    else {
                                        array2 = i.b[n12];
                                        n27 = n13;
                                        n28 = 0;
                                    }
                                    array2[n27] = n28;
                                    ++this.aw;
                                    this.c |= 0x10000000000L;
                                    this.c |= 0x100000000L;
                                    final int n29 = n13 - 1;
                                    i.a[n12][n29] = 48;
                                    i.b[n12][n29] = 8;
                                    k(n12, n29);
                                    continue;
                                }
                                case 47: {
                                    i.c[n12][n13] = 48;
                                    i.b[n12][n13] = 0;
                                    this.c |= 0x800000L;
                                    continue;
                                }
                                case 46: {
                                    i.b[n12][n13] = 0;
                                    i.c[n12][n13] = 24;
                                    i.b[n12][n13] = 0;
                                    this.c |= 0x2000000000L;
                                    continue;
                                }
                                case 45: {
                                    i.b[n12][n13] = 0;
                                    i.c[n12][n13] = 24;
                                    this.c |= 0x800000000L;
                                    continue;
                                }
                                case 44: {
                                    i.c[n12][n13] = 24;
                                    i.b[n12][n13] = 0;
                                    this.c |= 0x400000000L;
                                    continue;
                                }
                                case 42: {
                                    ++n11;
                                    ++n8;
                                    this.c |= 0x80000000L;
                                    this.c |= 0x40000000L;
                                    this.i(n12, n13);
                                    continue;
                                }
                                case 41: {
                                    if (i.b[n12][n13] <= 0) {
                                        i.b[n12][n13] = 1;
                                    }
                                    this.aY += i.b[n12][n13];
                                    continue;
                                }
                                case 40: {
                                    this.c |= 0x40000000L;
                                    ++n11;
                                    this.l = true;
                                    this.c |= 0x8000000L;
                                    this.i(n12, n13);
                                    ++n8;
                                    continue;
                                }
                                case 12: {
                                    i.a[n12][n13] = -1;
                                    this.ab = n12;
                                    this.ac = n13;
                                    this.aa = n15;
                                    continue;
                                }
                                case 36: {
                                    if (i.b[n12][n13] != 1) {
                                        i.b[n12][n13] = 0;
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
                                    i.a[n12][n13] = -1;
                                    i.a[n12][n13] = 15;
                                    this.c |= 0x1000000L;
                                    continue;
                                }
                                case 35: {
                                    i.a[n12][n13] = 35;
                                    i.a[n12][n13] = -1;
                                    this.c |= 0x1000000L;
                                    this.ai = true;
                                }
                                case 31:
                                case 33: {
                                    continue;
                                }
                                case 39: {
                                    this.l = true;
                                    this.c |= 0x4000000L;
                                    continue;
                                }
                                case 38: {
                                    this.l = true;
                                    this.c |= 0x4000000L;
                                    i.a[n12][n13] = 27;
                                    this.c |= 0x40L;
                                    continue;
                                }
                                case 14: {
                                    this.c |= 0x1000L;
                                    i.b[n12][n13] = ((i.b[n12][n13] == 4) ? 8 : 0);
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 24;
                                    break;
                                }
                                case 28: {
                                    this.c |= 0x800L;
                                    if (n15 > 10) {
                                        final int[] array4 = i.b[n12];
                                        final int n32 = n13;
                                        array4[n32] /= 11;
                                        final int[] array5 = i.b[n12];
                                        final int n33 = n13;
                                        array5[n33] |= 0x8;
                                    }
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 24;
                                    break;
                                }
                                case 79: {
                                    this.h = 0;
                                    this.i = n13;
                                    this.ay = n12;
                                    i.a[n12][n13] = -1;
                                    final int n34 = 0;
                                    this.c = n34;
                                    this.a = n34;
                                    final int n35 = this.i * 24 - 160;
                                    this.d = n35;
                                    this.b = n35;
                                    continue;
                                }
                                case 11: {
                                    i.b[n12][n13] = ((n15 == 1) ? 16 : 0);
                                    i.c[n12][n13] = 48;
                                    this.c |= 0x4000L;
                                    continue;
                                }
                                case 49: {
                                    this.c |= 0x20000000000L;
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 48;
                                    break;
                                }
                                case 43: {
                                    this.c |= 1L << ((this.aA == 1) ? 17 : 15);
                                    this.bu |= 0x1;
                                    i.b[n12][n13] = ((n15 & 0xFFFE7FFF) | 0x10000);
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 48;
                                    break;
                                }
                                case 19: {
                                    this.c |= 1L << ((this.aA == 1) ? 17 : 15);
                                    this.bu |= 0x2;
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 48;
                                    break;
                                }
                                case 22:
                                case 23: {
                                    this.c |= 0x200L;
                                    this.c |= 0x400L;
                                    array3 = i.c[n12];
                                    n30 = n13;
                                    n31 = 48;
                                    break;
                                }
                                case 30: {
                                    this.c |= 0x80L;
                                    i.b[n12][n13] = 0;
                                    continue;
                                }
                                case 37: {
                                    this.c |= 0x2000000L;
                                    i.b[n12][n13] = 0;
                                    continue;
                                }
                                case 10: {
                                    i.b[n12][n13] = 0;
                                    this.d |= 0x2L;
                                    continue;
                                }
                                case 16: {
                                    if (i.a[n12][n13 + 1] != 16) {
                                        i.a[n12][n13 - 1] = 16;
                                        i.b[n12][n13 - 1] = n15;
                                    }
                                    this.c |= 0x2000L;
                                    continue;
                                }
                                case 6: {
                                    ++n8;
                                    this.i(n12, n13);
                                }
                                case 7: {
                                    this.c |= 0x10L;
                                    i.b[n12][n13] = 0;
                                    continue;
                                }
                                case 26: {
                                    this.c |= 0x10000000000L;
                                }
                                case 24:
                                case 27: {
                                    ++n11;
                                    ++n8;
                                    this.c |= 0x40000000L;
                                    this.c |= 0x80000L;
                                    this.i(n12, n13);
                                    continue;
                                }
                                case 8: {
                                    this.c |= 0x20L;
                                    this.c |= 0x8L;
                                }
                                case 4: {
                                    if (b4 != 8) {
                                        this.i(n12, n13);
                                    }
                                }
                                case 5: {
                                    this.c |= 0x4L;
                                }
                                case 2: {
                                    ++n8;
                                }
                                case 0: {
                                    i.c[n12][n13] = 48;
                                    i.b[n12][n13] = 0;
                                    this.d |= 0x1L;
                                    continue;
                                }
                                case 1: {
                                    ++this.aY;
                                    i.c[n12][n13] = 48;
                                    i.b[n12][n13] = 0;
                                }
                                case 53: {}
                                case 51: {}
                                case 52: {
                                    continue;
                                }
                                default: {
                                    if (b4 < 80 && b4 > -1) {
                                        array3 = i.a[n12];
                                        n30 = n13;
                                        n31 = -1;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            array3[n30] = (byte)n31;
                        }
                    }
                    i.d = new byte[n8 << 1];
                    for (int n36 = 0; n36 < i.d.length; ++n36) {
                        i.d[n36] = 0;
                    }
                    i.a = new c[n11];
                    i.p = new byte[n11];
                    int n37 = 0;
                    i.k = new byte[n9 + 1 << 1];
                    int n38;
                    for (n38 = 31; n38 >= 0 && (n10 & 1 << n38) == 0x0; --n38) {}
                    if (++n38 > 0) {
                        i.m = new byte[n38];
                        i.l = new byte[n38];
                    }
                    if (this.aw > 0) {
                        i.e = new byte[this.aw * 3];
                    }
                    int n39 = 0;
                    for (int n40 = 0; n40 < this.f; ++n40) {
                        for (int n41 = 0; n41 < this.e; ++n41) {
                            final int n42 = i.a[n41][n40] & 0xFF;
                            final int n43 = i.a[n41][n40] >> 8;
                            Label_5021: {
                                byte[] array6 = null;
                                int n44 = 0;
                                byte byteValue = 0;
                                switch (n42) {
                                    case 0:
                                    case 30: {
                                        array6 = i.p;
                                        n44 = n37++;
                                        byteValue = (byte)n43;
                                        break;
                                    }
                                    case 7: {
                                        final Integer n45 = hashtable.get(new Integer(n43));
                                        int n46 = n43 << 8;
                                        if (n45 != null) {
                                            n46 = ((n46 & 0xFFFFFFF0) | n45);
                                        }
                                        final boolean b6 = (i.a[n41][n40 - 1] & 0xFF) == 0x11;
                                        final boolean b7 = (i.a[n41][n40 + 1] & 0xFF) == 0x11 && (i.a[n41 + 1][n40] & 0xFF) != 0x1A && (i.a[n41 - 1][n40] & 0xFF) != 0x1A;
                                        if (b6 || b7) {
                                            n46 = ((n46 & 0xFFFFFF0F) | 0x30);
                                            i.c[n41][n40] = 24;
                                            if (b6) {
                                                i.a[n41][n40 - 1] = -1;
                                            }
                                        }
                                        i.a[n41][n40] = (n46 << 8 | n42);
                                        break Label_5021;
                                    }
                                    case 4: {
                                        final int n47 = n43;
                                        i.k[n47 << 1] = (byte)n41;
                                        array6 = i.k;
                                        n44 = (n47 << 1) + 1;
                                        byteValue = (byte)n40;
                                        break;
                                    }
                                    case 5: {
                                        i.k[n9 << 1] = (byte)n41;
                                        array6 = i.k;
                                        n44 = (n9 << 1) + 1;
                                        byteValue = (byte)n40;
                                        break;
                                    }
                                    case 17: {
                                        if (n43 != -1) {
                                            final Integer n48 = new Integer(n43);
                                            Integer n49;
                                            if ((n49 = hashtable2.get(n48)) == null) {
                                                n49 = new Integer(0);
                                            }
                                            i.m[n43] = n49.byteValue();
                                            Integer n50;
                                            if ((n50 = hashtable3.get(n48)) == null) {
                                                n50 = new Integer(57);
                                            }
                                            array6 = i.l;
                                            n44 = n43;
                                            byteValue = n50.byteValue();
                                            break;
                                        }
                                        break Label_5021;
                                    }
                                }
                                array6[n44] = byteValue;
                            }
                            byte[] array8 = null;
                            int n55 = 0;
                            int n56 = 0;
                            switch (i.a[n41][n40]) {
                                case 48: {
                                    if ((i.b[n41][n40] & 0x8) != 0x0) {
                                        final int n51 = n41 + (((i.b[n41][n40 + 1] & 0x10) == 0x0) ? 1 : -1);
                                        final int n52 = n39 * 3;
                                        byte[] array7;
                                        int n53;
                                        int n54;
                                        if (d(n51, n40) >= 0) {
                                            i.e[n52] = (byte)n51;
                                            i.e[n52 + 1] = (byte)n51;
                                            array7 = i.e;
                                            n53 = n52 + 2;
                                            n54 = (byte)n40;
                                        }
                                        else {
                                            array7 = i.e;
                                            n53 = n52 + 2;
                                            n54 = -1;
                                        }
                                        array7[n53] = (byte)n54;
                                        i.b[n41][n40] = ((i.b[n41][n40] & 0xFFFFFF) | n39 << 24);
                                        ++n39;
                                    }
                                    continue;
                                }
                                case 26: {
                                    array8 = i.p;
                                    n55 = n37++;
                                    n56 = 25;
                                    break;
                                }
                                case 42: {
                                    array8 = i.p;
                                    n55 = n37++;
                                    n56 = 11;
                                    break;
                                }
                                case 24: {
                                    array8 = i.p;
                                    n55 = n37++;
                                    n56 = 22;
                                    break;
                                }
                                case 27: {
                                    array8 = i.p;
                                    n55 = n37++;
                                    n56 = 23;
                                    break;
                                }
                                case 40: {
                                    array8 = i.p;
                                    n55 = n37++;
                                    n56 = 24;
                                    break;
                                }
                            }
                            array8[n55] = (byte)n56;
                        }
                    }
                    i.a[this.ay - 2][this.i] = (-193 << 8 | 0x7);
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
                case 10: {
                    this.a = this.getClass().getResourceAsStream("/" + this.aA + ".f");
                    this.cc = this.a.read();
                    i.n = new byte[this.cc << 3];
                    this.a.read(i.n);
                }
                default: {
                    int n57;
                    if ((n57 = bs - 10 - 1) < 4) {
                        final int n58 = n57;
                        final byte[] b8 = new byte[b(i.n, (n58 << 3) + 4)];
                        this.a.read(b8);
                        final f f;
                        (f = new f()).a(b8, 0);
                        f.a(0, 0, -1, -1);
                        Label_5745: {
                            Object o = null;
                            int n59 = 0;
                            Object o2 = null;
                            switch (n58) {
                                case 0: {
                                    if ((this.d & 0x1L) != 0x0L) {
                                        o = i.a;
                                        n59 = 60;
                                        o2 = f;
                                        break;
                                    }
                                    break Label_5745;
                                }
                                case 1: {
                                    if ((this.d & 0x2L) != 0x0L) {
                                        o = i.a;
                                        n59 = 16;
                                        o2 = f;
                                        break;
                                    }
                                    break Label_5745;
                                }
                                case 2: {
                                    i.b[0] = null;
                                    o = i.a;
                                    n59 = 42;
                                    o2 = f;
                                    break;
                                }
                                case 3: {
                                    o = i.b;
                                    n59 = 8;
                                    o2 = f.a[0];
                                    break;
                                }
                            }
                            o[n59] = o2;
                        }
                        f.d = null;
                        this.bt = 0;
                        return;
                    }
                    n57 -= 4;
                    if (n57 >= 0 && n57 < 43) {
                        final int n60 = n57;
                        try {
                            if (n60 % 10 == 0) {
                                this.a.close();
                                this.a = null;
                                this.a = this.getClass().getResourceAsStream("/gen" + this.bt + ".f");
                                this.cc = this.a.read();
                                i.n = new byte[this.cc << 3];
                                this.a.read(i.n);
                                this.cd = 0;
                                ++this.bt;
                            }
                            final int b9 = b(i.n, (n60 - (this.bt - 1) * 10 << 3) + 4);
                            if ((this.c & 1L << n60) != 0x0L) {
                                if (this.cd != 0) {
                                    this.a.skip(this.cd);
                                    this.cd = 0;
                                }
                                final byte[] b10 = new byte[b9];
                                this.a.read(b10);
                                final f d;
                                (d = new f()).a(b10, 0);
                                if ((n60 != 28 || this.ag) && (n60 != 24 || this.ai)) {
                                    d.a(0, 0, -1, -1);
                                }
                                int n61 = -1;
                                int n62 = -1;
                                Label_6692: {
                                    int n63 = 0;
                                    switch (n60) {
                                        case 41: {
                                            n61 = 38;
                                            break Label_6692;
                                        }
                                        case 42: {
                                            n61 = 39;
                                            break Label_6692;
                                        }
                                        case 0: {
                                            n61 = 33;
                                            break Label_6692;
                                        }
                                        case 36: {
                                            n61 = 35;
                                            break Label_6692;
                                        }
                                        case 1: {
                                            n61 = 34;
                                            break Label_6692;
                                        }
                                        case 38: {
                                            n61 = 36;
                                            break Label_6692;
                                        }
                                        case 16:
                                        case 18: {
                                            n61 = 37;
                                            break Label_6692;
                                        }
                                        case 40: {
                                            n61 = 2;
                                            break Label_6692;
                                        }
                                        case 32: {
                                            n61 = 32;
                                            break Label_6692;
                                        }
                                        case 23: {
                                            n61 = 30;
                                            break Label_6692;
                                        }
                                        case 37: {
                                            n61 = 29;
                                            break Label_6692;
                                        }
                                        case 35: {
                                            n61 = 28;
                                            break Label_6692;
                                        }
                                        case 34: {
                                            n61 = 27;
                                            break Label_6692;
                                        }
                                        case 33: {
                                            n61 = 22;
                                            break Label_6692;
                                        }
                                        case 31: {
                                            n63 = 29;
                                            break;
                                        }
                                        case 30: {
                                            n61 = 15;
                                            break Label_6692;
                                        }
                                        case 28: {
                                            if (this.ah) {
                                                d.a(1, 0, -1, -1);
                                            }
                                            n61 = 45;
                                            break Label_6692;
                                        }
                                        case 29: {
                                            n63 = 26;
                                            break;
                                        }
                                        case 2: {
                                            if (this.ag) {
                                                i.b[24] = d.a[0];
                                            }
                                            if (this.ah) {
                                                d.a(1, 0, -1, -1);
                                                i.b[25] = d.a[1];
                                            }
                                            break Label_6692;
                                        }
                                        case 6: {
                                            n63 = 21;
                                            break;
                                        }
                                        case 27: {
                                            n63 = 19;
                                            break;
                                        }
                                        case 26: {
                                            i.d = d;
                                            break Label_6692;
                                        }
                                        case 25: {
                                            n63 = 17;
                                            break;
                                        }
                                        case 5: {
                                            n61 = 58;
                                            break Label_6692;
                                        }
                                        case 3: {
                                            n61 = 7;
                                            break Label_6692;
                                        }
                                        case 39: {
                                            n61 = 6;
                                            break Label_6692;
                                        }
                                        case 8: {
                                            n61 = 5;
                                            break Label_6692;
                                        }
                                        case 24: {
                                            i.b[15] = null;
                                            d.a(1, 0, -1, -1);
                                            n61 = 57;
                                            i.b[14] = null;
                                            break Label_6692;
                                        }
                                        case 22: {
                                            n61 = 8;
                                            break Label_6692;
                                        }
                                        case 20: {
                                            n63 = 13;
                                            break;
                                        }
                                        case 4:
                                        case 21: {
                                            if (this.aA != 2) {
                                                n61 = 3;
                                            }
                                            break Label_6692;
                                        }
                                        case 7: {
                                            if (this.aA == 2) {
                                                d.a = null;
                                                d.a(1, 0, -1, -1);
                                                d.a = 1;
                                            }
                                            n61 = 20;
                                            break Label_6692;
                                        }
                                        case 14: {
                                            n63 = 6;
                                            break;
                                        }
                                        case 10: {
                                            (i.a[4] = new b(d, 0, 0, null)).a(0);
                                            break Label_6692;
                                        }
                                        case 9: {
                                            n61 = 12;
                                            break Label_6692;
                                        }
                                        case 15:
                                        case 17: {
                                            if ((this.bu & 0x2) != 0x0) {
                                                if (this.aA == 2) {
                                                    d.a = null;
                                                    d.a(2, 0, -1, -1);
                                                    d.a = 2;
                                                }
                                                n61 = 4;
                                            }
                                            if ((this.bu & 0x1) != 0x0) {
                                                (i.a[21] = new f()).a(b10, 0);
                                                i.a[21].a(1, 0, -1, -1);
                                                i.a[21].a = 1;
                                                i.a[21].d = null;
                                            }
                                            break Label_6692;
                                        }
                                        case 13: {
                                            n61 = 1;
                                            break Label_6692;
                                        }
                                        case 11: {
                                            n61 = 11;
                                            break Label_6692;
                                        }
                                        case 19: {
                                            n63 = 7;
                                            break;
                                        }
                                        case 12: {
                                            n63 = 10;
                                            break;
                                        }
                                    }
                                    n62 = n63;
                                }
                                if (n61 != -1) {
                                    i.a[n61] = d;
                                }
                                if (n62 != -1) {
                                    i.b[n62] = d.a[0];
                                }
                                d.d = null;
                                return;
                            }
                            this.cd += b9;
                            return;
                        }
                        catch (IOException ex) {
                            return;
                        }
                    }
                    n57 -= 43;
                    if (n57 >= 0 && n57 < 8) {
                        final int n64 = n57;
                        try {
                            if (n64 == 0) {
                                this.a.close();
                                this.a = null;
                                System.gc();
                                this.a = this.getClass().getResourceAsStream("/cm.f");
                                this.cc = this.a.read();
                                i.n = new byte[this.cc << 3];
                                this.a.read(i.n);
                            }
                            final byte[] b11 = new byte[b(i.n, (n64 << 3) + 4)];
                            this.a.read(b11);
                            final f f2;
                            (f2 = new f()).a(b11, 0);
                            f2.a(0, 0, -1, -1);
                            Label_7075: {
                                Object o3 = null;
                                int n65 = 0;
                                Object o4 = null;
                                Label_7074: {
                                    switch (n64) {
                                        case 6: {
                                            i.a[43] = f2;
                                            o3 = i.b;
                                            n65 = 20;
                                            o4 = null;
                                            break Label_7074;
                                        }
                                        case 5: {
                                            o3 = i.b;
                                            n65 = 18;
                                            break;
                                        }
                                        case 2: {
                                            f2.a(1, 0, 0, -1);
                                            o3 = i.a;
                                            n65 = 59;
                                            o4 = f2;
                                            break Label_7074;
                                        }
                                        case 1: {
                                            switch (this.aA) {
                                                case 1:
                                                case 2: {
                                                    if (this.aA != 0) {
                                                        f2.a(this.aA, 0, -1, -1);
                                                        f2.a(0);
                                                        f2.a = this.aA;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            o3 = i.a;
                                            n65 = 56;
                                            o4 = f2;
                                            break Label_7074;
                                        }
                                        case 3: {
                                            i.a[13] = f2;
                                            this.r();
                                            break Label_7075;
                                        }
                                        case 0: {
                                            o3 = i.b;
                                            n65 = 11;
                                            break;
                                        }
                                        case 4: {
                                            o3 = i.b;
                                            n65 = 5;
                                            break;
                                        }
                                    }
                                    o4 = f2.a[0];
                                }
                                o3[n65] = o4;
                            }
                            f2.d = null;
                        }
                        catch (Exception ex2) {}
                        if (n57 == 7) {
                            this.a.close();
                            this.a = null;
                            System.gc();
                        }
                        return;
                    }
                    n57 -= 8;
                    if (n57 >= 0 && n57 < 16) {
                        if (n57 < i.a.length) {
                            (i.a[n57] = new c(this)).a(i.p[n57]);
                        }
                        if (n57 == 15 && i.a.length >= 16) {
                            for (int n66 = 16; n66 < i.a.length; ++n66) {
                                (i.a[n66] = new c(this)).a(i.p[n66]);
                            }
                        }
                        return;
                    }
                    n57 -= 16;
                    if (n57 < 0 || n57 >= 3) {
                        n57 -= 3;
                        switch (n57) {
                            case 0: {
                                i.n = null;
                                this.a(i.a[12] != null || i.b[6] != null || i.a[58] != null || this.k == 1 || this.k == 4 || this.k == 5);
                            }
                            case 1: {
                                this.c = 0L;
                                this.d = 0L;
                                this.bu = 0;
                                ++this.ag;
                                i.i[12] = (byte)((this.ag < 3) ? this.ag : 3);
                                this.u();
                            }
                            case 2: {
                                i.c = new int[this.e][this.f];
                                i.d = new byte[this.e][this.f];
                                i.e = new byte[this.e][this.f];
                                i.d = new int[this.e][this.f];
                                if (i.m != null) {
                                    i.o = new byte[i.m.length];
                                    return;
                                }
                                break;
                            }
                            case 3: {
                                if (this.l) {
                                    this.ar();
                                    i.e = new int[this.e][this.f];
                                    this.af();
                                }
                            }
                            case 4: {
                                this.bl = 0;
                                final int n67 = 0;
                                this.ae = n67;
                                this.ad = n67;
                                this.ao();
                            }
                            case 5: {
                                this.bn = i.aS + 60;
                                this.q();
                            }
                            case 6: {
                                a(i.a, true);
                                i.a = null;
                                System.gc();
                            }
                            case 7: {
                                this.D = false;
                                i.f = null;
                                System.gc();
                                this.a.b(16 + this.aA);
                                i.b = 1;
                                break;
                            }
                        }
                        return;
                    }
                    switch (this.k) {
                        case 1: {
                            this.d(n57);
                            if (n57 == 2) {
                                this.a.close();
                                this.a = null;
                            }
                            return;
                        }
                        case 3: {
                            if (n57 > 0) {
                                return;
                            }
                            i.b[31] = a("/mmv.f", 1, 0).a[0];
                            (i.a[5] = new b(a("/mm1.f", 0), 0, 0, null)).a(0);
                            return;
                        }
                        case 4: {
                            if (n57 >= 2) {
                                return;
                            }
                            this.c(n57);
                            i.b[32] = a("/mmv.f", 3, 0).a[0];
                            i.a[20] = a("/gen0.f", 7, 0);
                            if (n57 == 1) {
                                this.a.close();
                                this.a = null;
                            }
                            return;
                        }
                        case 5: {
                            i.b[30] = a("/mmv.f", 2, 0).a[0];
                            i.a[20] = a("/gen0.f", 7, 0);
                            (i.a[5] = new b(a("/b1.f", 0), 0, 0, null)).a(10);
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
        catch (Exception ex3) {}
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
            final f f;
            (f = new f()).a(b3, 0);
            f.a(this.cu = i.i[8] - 4, 0, -1, -1);
            f.a = this.cu;
            f.d = null;
            i.a[0] = new b(f, 0, 0, null);
            System.gc();
            if (b) {
                final byte[] b4 = new byte[b(b2, 12)];
                resourceAsStream.read(b4);
                resourceAsStream.close();
                System.gc();
                final f f2;
                (f2 = new f()).a(b4, 0);
                f2.a(0, 0, -1, -1);
                f2.d = null;
                i.a[3] = new b(f2, 0, 0, null);
                System.gc();
            }
        }
        catch (Exception ex) {}
    }
    
    private int a() {
        return i.a[this.bo][this.bq << 1];
    }
    
    private void k() {
        if (i.d != null) {
            final String d = i.d;
            try {
                Thread.sleep(10L);
                new k(d).start();
            }
            catch (Exception ex) {}
        }
    }
    
    private void l() {
        i i;
        int br;
        if (this.D) {
            i = this;
            br = 97;
        }
        else {
            i = this;
            br = 92;
        }
        i.br = br;
        this.bs = 0;
        if (!b()) {
            this.p = false;
        }
        this.J = true;
        this.x = false;
        i.b = 11;
        final byte k = 0;
        this.a = k;
        this.l = k;
        this.k = k;
        final int n = -1;
        this.aG = n;
        this.aF = n;
        this.b = 0L;
    }
    
    private static boolean a() {
        String appProperty = null;
        try {
            appProperty = i.a.getAppProperty("more_games_status");
        }
        catch (Exception ex) {}
        return appProperty != null && appProperty.equals("on");
    }
    
    private void m() {
        --this.bq;
        if (this.bq < 0) {
            this.bq = (i.a[this.bo].length >> 1) - 1;
        }
    }
    
    private void n() {
        this.bq = (this.bq + 1) % (i.a[this.bo].length >> 1);
    }
    
    private void o() {
        this.K = false;
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
    
    private static void a(final f f, final boolean b) {
        if (f == null) {
            return;
        }
        f.a(b);
    }
    
    private void p() {
        this.J = false;
        this.o = true;
        this.E = false;
        this.di = 0;
        this.e = null;
        i.m = null;
        i.l = null;
        this.ai = 0;
        this.aj = 0;
        i.d = null;
        i.e = null;
        this.a = null;
        i.n = null;
        i.f = null;
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
        if (i.b != null) {
            for (int j = 0; j < 33; ++j) {
                if (i.b[j] != null) {
                    for (int length2 = i.b[j].length, k = 0; k < length2; ++k) {
                        i.b[j][k] = null;
                    }
                    i.b[j] = null;
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
        this.aD = -1;
        this.aF = -1;
        this.aH = -1;
        this.aI = -1;
        i.b = null;
        this.bK = -1;
        this.x = 3;
        i.e = null;
        i.f = null;
        i.a = null;
        i.c = null;
        i.b = null;
        i.d = null;
        this.al = false;
        this.dq = -1;
        this.dr = 0;
        this.ds = 0;
        this.v = 0;
        this.dv = 0;
        this.dw = 0;
        this.dx = 0;
        this.w = 0;
        this.dy = 0;
        this.dz = -1;
        this.l = false;
        i.e = null;
        i.a = null;
        i.b = null;
        i.c = null;
        i.f = null;
        i.c = null;
        System.gc();
        System.gc();
    }
    
    private void q() {
        this.o = true;
    }
    
    private void r() {
        if ((this.d & 0x1L) == 0x0L) {
            for (int i = 0; i < 5; ++i) {
                i.a[13].a[0][i] = null;
            }
        }
    }
    
    private void c(final int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/b0.f");
                this.cc = this.a.read();
                i.n = new byte[this.cc << 3];
                this.a.read(i.n);
            }
            final byte[] b = new byte[b(i.n, (n << 3) + 4)];
            this.a.read(b);
            final f f;
            (f = new f()).a(b, 0);
            f.a(0, 0, -1, -1);
            f.d = null;
            switch (n) {
                case 0: {
                    i.a[5] = new b(f, 0, 0, null);
                }
                case 1: {
                    i.a[40] = f;
                    break;
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void d(final int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/mm0.f");
                this.cc = this.a.read();
                i.n = new byte[this.cc << 3];
                this.a.read(i.n);
            }
            final byte[] b = new byte[b(i.n, (n << 3) + 4)];
            this.a.read(b);
            final f f;
            (f = new f()).a(b, 0);
            f.a(0, 0, -1, -1);
            f.d = null;
            switch (n) {
                case 2: {
                    i.b[27] = f.a[0];
                }
                case 1: {
                    (i.a[2] = new b(f, 0, 0, null)).a(0);
                }
                case 0: {
                    (i.a[1] = new b(f, 0, 0, null)).a(2);
                    break;
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private static boolean b() {
        return i.i != null && i.i[13] != 0;
    }
    
    private void b(final boolean b) {
        i.i[13] = 1;
        this.u();
    }
    
    private void s() {
        this.c(true);
    }
    
    private void c(final boolean b) {
        this.I = false;
        this.b(true);
        this.w();
        this.v();
        a(this.aA, i.dZ);
        if (b) {
            i.i[a(this.aA, this.aB)] = (byte)(this.bb + this.b(this.aA, this.aB));
        }
        this.u();
    }
    
    private void t() {
        RecordStore openRecordStore = null;
        try {
            i.i = (openRecordStore = RecordStore.openRecordStore("DiamondRush", true)).getRecord(1);
            this.cw = i.i.length;
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex2) {}
        }
        finally {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex3) {}
        }
    }
    
    private void u() {
        this.N = false;
        RecordStore openRecordStore = null;
        try {
            if ((openRecordStore = RecordStore.openRecordStore("DiamondRush", true)).getNumRecords() == 0) {
                openRecordStore.addRecord(i.i, 0, this.cw);
            }
            else {
                openRecordStore.setRecord(1, i.i, 0, this.cw);
            }
            openRecordStore.closeRecordStore();
        }
        catch (Exception ex) {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex2) {}
        }
        finally {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex3) {}
        }
    }
    
    private void v() {
        RecordStore recordStore = null;
        try {
            if ((recordStore = RecordStore.openRecordStore("Preferences", true)).getNumRecords() == 0) {
                recordStore.addRecord(i.j, 0, this.cv);
            }
            else {
                recordStore.setRecord(1, i.j, 0, this.cv);
            }
            recordStore.closeRecordStore();
            recordStore = RecordStore.openRecordStore("Preferences", true);
        }
        catch (Exception ex) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception ex2) {}
        }
        finally {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception ex3) {}
        }
    }
    
    private void e(int read) {
        RecordStore openRecordStore = null;
        try {
            String s = null;
            switch (read) {
                case 0:
                case 1: {
                    try {
                        openRecordStore = RecordStore.openRecordStore("DiamondRush", false);
                    }
                    catch (Exception ex) {}
                    i i;
                    boolean o;
                    if (openRecordStore == null) {
                        i = this;
                        o = true;
                    }
                    else {
                        i = this;
                        o = false;
                    }
                    i.O = o;
                    openRecordStore.closeRecordStore();
                    if (read != 0) {
                        (i.i = new byte[1001])[3] = 5;
                        i.i[8] = 4;
                        i.i[9] = 0;
                        i.i[10] = 0;
                        this.cw = 14;
                        this.cw += 6;
                        break;
                    }
                    break;
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
                    (this.a = this.getClass().getResourceAsStream(i.d[read - 2])).read();
                    read -= 2;
                    final int cw = this.cw;
                    i.i[14 + (read << 1)] = (byte)this.cw;
                    i.i[14 + (read << 1) + 1] = (byte)(this.cw >> 8);
                    read = this.a.read();
                    i.i[this.cw++] = (byte)read;
                    i.i[this.cw++] = 0;
                    this.aw();
                    this.a(s);
                    i.i[this.cw++] = (byte)this.dK;
                    this.au();
                    this.cw += read << 1;
                    for (int j = 0; j < read; ++j) {
                        final int cw2 = this.cw;
                        i.i[cw + 3 + (j << 1)] = (byte)cw2;
                        i.i[cw + 3 + (j << 1) + 1] = (byte)(cw2 >> 8);
                        byte b = 0;
                        byte b2 = 0;
                        final int a = a(this.a);
                        final int a2 = a(this.a);
                        final byte[] array = new byte[a * a2];
                        this.a.read(array);
                        for (int k = 0; k < a2; ++k) {
                            for (int l = 0; l < a; ++l) {
                                if (array[l + k * a] == 2) {
                                    ++b2;
                                }
                            }
                        }
                        final byte[] m = i.i;
                        final int n = 0;
                        m[n] += b2;
                        i.i[this.cw++] = 0;
                        i.i[this.cw++] = b2;
                        i.i[this.cw++] = 0;
                        this.a.skip(a * a2);
                        final int cw3 = this.cw;
                        this.cw += 2;
                        this.a.read(array);
                        for (int n2 = 0; n2 < a2; ++n2) {
                            for (int n3 = 0; n3 < a; ++n3) {
                                if (array[n3 + n2 * a] == 14 || array[n3 + n2 * a] == 33) {
                                    i.i[this.cw++] = (byte)n3;
                                    i.i[this.cw++] = (byte)n2;
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
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex2) {}
        }
        catch (Exception ex3) {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex4) {}
        }
        finally {
            try {
                if (openRecordStore != null) {
                    openRecordStore.closeRecordStore();
                }
            }
            catch (Exception ex5) {}
        }
    }
    
    private void w() {
        i.i[3] = (byte)this.az;
        i.i[11] = this.r;
    }
    
    private void x() {
        this.M = false;
        this.az = i.i[3];
        this.r = i.i[11];
        this.aZ = a(i.i, 4);
    }
    
    private byte a(final int n, final int n2) {
        return i.i[a(n, n2) + 2];
    }
    
    private void a(final int n, final int n2, final byte b) {
        final int a = a(n, n2);
        final byte[] i = i.i;
        final int n3 = a + 2;
        i[n3] |= b;
    }
    
    private static void a(int n, final int n2) {
        n = c(n) + 1;
        if (i.i[n] < n2) {
            i.i[n] = (byte)n2;
        }
    }
    
    private static int b(final int n) {
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
                return a(i.i, 14 + (n << 1));
            }
            n2 = 2;
        }
        n = n2;
        return a(i.i, 14 + (n << 1));
    }
    
    private static int d(final int n) {
        try {
            return i.i[c(n)];
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private static int e(final int n) {
        return i.i[c(n) + 2];
    }
    
    private static int a(final int n, final int n2) {
        return a(i.i, c(n) + 3 + (n2 << 1));
    }
    
    private int b(final int n, final int n2) {
        return i.i[a(n, n2)];
    }
    
    private int c(final int n, final int n2) {
        return i.i[a(n, n2) + 1];
    }
    
    private void a(int n, int i, final int n2, final int n3) {
        final int a = a(n, i);
        byte[] j;
        int n4;
        for (n = i.i[a + 4], i = 0; i < n; ++i) {
            if (i.i[a + 5 + i * 2] == n2 && i.i[a + 5 + i * 2 + 1] == n3) {
                i.i[a + 5 + i * 2] = 0;
                i.i[a + 5 + i * 2 + 1] = 0;
                j = i.i;
                n4 = a + 3;
                ++j[n4];
                return;
            }
        }
    }
    
    private boolean a(int n, int i, final int n2, final int n3) {
        final int a = a(n, i);
        for (n = i.i[a + 4], i = 0; i < n; ++i) {
            if (i.i[a + 5 + i * 2] == n2 && i.i[a + 5 + i * 2 + 1] == n3) {
                return false;
            }
        }
        return true;
    }
    
    private void y() {
        this.ao = 13;
        this.aq = 4;
        this.at = 408;
        this.k = 5;
        this.c |= 0x80L;
        this.c |= 0x8L;
        this.ae = false;
        this.O = 16;
        this.P = 16;
        this.Q = 19;
        this.R = 18;
    }
    
    private void z() {
        final int dv = this.dV;
        final int dw = this.dW;
        final long n;
        final int a = a(n = i.a[dv][dw], (byte)6, (byte)5);
        final int a2 = a(n, (byte)11, (byte)3);
        int n2 = 14;
        if (this.aB >= this.dK) {
            this.a(this.aA, this.aB, (byte)2);
        }
        if (a2 > 1) {
            for (int i = 0; i < a2; ++i, n2 += 4) {
                final int a3 = a(n, (byte)n2, (byte)4);
                n2 += 4;
                final long n3;
                final int a4;
                if (a(n3 = i.a[a3][a(n, (byte)n2, (byte)4)], (byte)3, (byte)3) == 1 && (a4 = a(n3, (byte)6, (byte)5)) > a) {
                    i.dZ = a4;
                    this.cx = dv;
                    this.cy = dw;
                    this.a(this.aA, i.dZ, (byte)64);
                    this.ac = true;
                }
            }
        }
        else {
            i.dZ = this.aB;
        }
        this.c(false);
    }
    
    public final void paint(final Graphics a) {
        try {
            if (((Displayable)this).getWidth() > ((Displayable)this).getHeight()) {
                try {
                    try {
                        a.setColor(0);
                        a.setClip(0, 0, ((Displayable)this).getWidth(), ((Displayable)this).getHeight());
                        a.fillRect(0, 0, ((Displayable)this).getWidth(), ((Displayable)this).getHeight());
                        a.setColor(16777215);
                        c.a(a, d.a(34), ((Displayable)this).getWidth() >> 1, (((Displayable)this).getHeight() >> 1) - 40, ((Displayable)this).getWidth() - 100);
                    }
                    catch (Exception ex2) {}
                    this.hideNotify();
                    this.showNotify();
                    return;
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
            }
            try {
                (this.a = a).setClip(0, 0, 240, 320);
                switch (i.b) {
                    case 24: {
                        String s = null;
                        final h a2;
                        (a2 = i.a).d = 15;
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 240, 320);
                        int i = 0;
                    Label_0590_Outer:
                        while (i < 6) {
                            int n = -1;
                            while (true) {
                                String s2 = null;
                                switch (i) {
                                    case 0: {
                                        n = 7;
                                        s2 = " 6 - Add " + String.valueOf(this.aZ);
                                        break;
                                    }
                                    case 1: {
                                        n = 8;
                                        s2 = " 7 - Add " + String.valueOf(this.bb);
                                        break;
                                    }
                                    case 2: {
                                        n = 12;
                                        s2 = " 8 - x " + String.valueOf(this.cA) + ((this.cA >= 4) ? " blue potion" : "");
                                        break;
                                    }
                                    case 3: {
                                        n = 11;
                                        s2 = " 9 - " + i.a[this.S ? 43 : 42];
                                        break;
                                    }
                                    case 4: {
                                        n = 10;
                                        s2 = " 0 - " + i.a[this.T ? 43 : 42];
                                        break;
                                    }
                                    case 5: {
                                        n = -1;
                                        s2 = "";
                                        break;
                                    }
                                    default: {
                                        final int n2 = (i + 1) * 35;
                                        if (n >= 0) {
                                            a2.b(this.a, i.a[n], 110, n2, 17);
                                        }
                                        final int n3 = n2 + a2.d;
                                        h h;
                                        Graphics graphics;
                                        String s3;
                                        int n4;
                                        int n5;
                                        int n6;
                                        if (n == -1) {
                                            h = a2;
                                            graphics = this.a;
                                            s3 = s;
                                            n4 = 110;
                                            n5 = n3;
                                            n6 = 17;
                                        }
                                        else {
                                            a2.b(this.a, i.a[9], 110, n3, 24);
                                            h = a2;
                                            graphics = this.a;
                                            s3 = s;
                                            n4 = 110;
                                            n5 = n3;
                                            n6 = 20;
                                        }
                                        h.b(graphics, s3, n4, n5, n6);
                                        ++i;
                                        continue Label_0590_Outer;
                                    }
                                }
                                s = s2;
                                continue;
                            }
                        }
                        final String s4 = "Pound (#) - Pass levels ";
                        StringBuffer sb;
                        String str;
                        if (this.ab) {
                            sb = new StringBuffer().append(s4);
                            str = "on";
                        }
                        else {
                            sb = new StringBuffer().append(s4);
                            str = "off";
                        }
                        a2.b(this.a, sb.append(str).toString(), 110, 250, 17);
                        a2.b(this.a, "(Press 9 while gameplay to", 110, 265, 17);
                        a2.b(this.a, "skip the level)", 110, 280, 17);
                        this.I();
                        this.J();
                        break;
                    }
                    case 34: {
                        final h a3;
                        (a3 = i.a).d = 2;
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 240, 320);
                        String s5 = null;
                        switch (this.dd) {
                            case 1: {
                                s5 = "Tips";
                                o(this.a[1]);
                                this.at();
                                break;
                            }
                            case 0: {
                                s5 = "Mix";
                                a3.a(this.a, i.a[this.a[0]], 10, 15, 20);
                                break;
                            }
                            default: {
                                s5 = "";
                                break;
                            }
                        }
                        a3.d = 2;
                        a3.b(this.a, s5, 40, 308, 20);
                        a3.b(this.a, "" + this.a[this.dd], 120, 308, 20);
                        a3.a(this.a, "Use up, down, left and right", 10, 270, 20);
                        a3.a(this.a, "to navigate", 10, 285, 20);
                        this.I();
                        this.J();
                        break;
                    }
                    case 22: {
                        this.az();
                        break;
                    }
                    case 33: {
                        if (this.av) {
                            this.a.setColor(0);
                            this.a.setClip(0, 0, 240, 320);
                            this.a.fillRect(0, 0, 240, 320);
                            i.a.a(this.a, i.a[18] + "\n\n" + i.a[29] + "\n" + i.a[37] + "\n" + i.a[38] + "\n\n" + i.a[119] + "\n\n" + a(i.a[118]) + "\n" + a(i.a[67]), 120, 10, 17);
                            this.I();
                            this.av = false;
                        }
                        break;
                    }
                    case 20: {
                        a(this.a, i.a, a(i.a[61]), 120, 180, 17, 20, true);
                        break;
                    }
                    case 17: {
                        final int ar = this.aR;
                        final h a4 = i.a;
                        final Graphics a5;
                        (a5 = this.a).setColor(2496263);
                        a5.fillRect(0, 0, 240, 320);
                        switch (ar) {
                            case 5: {
                                if (this.bd == 0) {
                                    if ((this.u & 0x20) != 0x0) {
                                        a5.drawImage(i.b[5][0], 200, 237, 0);
                                        final f f;
                                        if (ar == 5 && i.aS < (f = i.a[9]).a(0) << 1) {
                                            f.a(a5, 0, i.aS << 1, 200, 237, 0, 0, 0);
                                        }
                                    }
                                    a5.drawImage(i.b[28][0], 180, 254, 0);
                                }
                            }
                            case 4: {
                                int n7;
                                if (ar != 4 || (n7 = -100 + i.aS * 10) > 0) {
                                    n7 = 0;
                                }
                                i.a[0].a.a(a5, 12, 0, n7 + 7, 243, 0, 0, 0);
                                a4.a(a5, i.a[78], 120, 243, 17);
                                a4.a(a5, String.valueOf(this.bd), 120, 259, 17);
                                if (this.bc == 0) {
                                    if ((this.u & 0x10) != 0x0) {
                                        a5.drawImage(i.b[5][0], 200, 181, 0);
                                        final f f2;
                                        if (ar == 4 && i.aS < (f2 = i.a[9]).a(0) << 1) {
                                            f2.a(a5, 0, i.aS >> 1, 200, 181, 0, 0, 0);
                                        }
                                    }
                                    a5.drawImage(i.b[28][0], 180, 198, 0);
                                }
                            }
                            case 3: {
                                int n8;
                                if (ar != 3 || (n8 = -100 + i.aS * 10) > 0) {
                                    n8 = 0;
                                }
                                i.a[0].a.a(a5, 10, 0, n8 + 7, 191, 0, 0, 0);
                                a4.a(a5, i.a[68], 120, 187, 17);
                                a4.a(a5, String.valueOf(this.bc), 120, 203, 17);
                                if (this.bb == this.ba) {
                                    if ((this.u & 0x8) != 0x0) {
                                        a5.drawImage(i.b[5][0], 200, 125, 0);
                                        final f f3;
                                        if (ar == 3 && i.aS < (f3 = i.a[9]).a(0) << 1) {
                                            f3.a(a5, 0, i.aS >> 1, 200, 125, 0, 0, 0);
                                        }
                                    }
                                    a5.drawImage(i.b[28][0], 180, 142, 0);
                                }
                            }
                            case 2: {
                                int n9;
                                if (ar != 2 || (n9 = -100 + i.aS * 10) > 0) {
                                    n9 = 0;
                                }
                                i.a[a(3)].a(a5, 0, n9 + 7, 131, 0);
                                a4.a(a5, i.a[48], 120, 131, 17);
                                a4.a(a5, this.bb + "/" + this.ba, 120, 147, 17);
                                if (this.aZ == this.aY) {
                                    if ((this.u & 0x4) != 0x0) {
                                        a5.drawImage(i.b[5][0], 200, 69, 0);
                                        final f f4;
                                        if (ar == 2 && i.aS < (f4 = i.a[9]).a(0) >> 1) {
                                            f4.a(a5, 0, i.aS << 1, 200, 69, 0, 0, 0);
                                        }
                                    }
                                    a5.drawImage(i.b[28][0], 180, 86, 0);
                                }
                            }
                            case 1: {
                                int n10;
                                if (ar != 1 || (n10 = -100 + i.aS * 10) > 0) {
                                    n10 = 0;
                                }
                                i.a[a(2)].a(a5, 0, n10 + 7, 75, 0);
                                a4.a(a5, i.a[19], 120, 75, 17);
                                int az;
                                if (ar != 1 || (az = i.aS >> 1) > this.aZ) {
                                    az = this.aZ;
                                }
                                a4.a(a5, az + "/" + this.aY, 120, 91, 17);
                            }
                            case 0: {
                                int n12 = 0;
                                int n11 = 0;
                                Label_2231: {
                                    if (ar == 0) {
                                        n11 = (n12 = -100 + i.aS * 10) - 240;
                                        if (n12 > 0) {
                                            n12 = 0;
                                        }
                                        if (n11 <= 0) {
                                            break Label_2231;
                                        }
                                    }
                                    else {
                                        n12 = 0;
                                    }
                                    n11 = 0;
                                }
                                a4.b(a5, i.c[i.g[this.aA][this.aB] - 1], n12 + 120, 15, 17);
                                a4.b(a5, i.a[14], n11 + 120, 32, 17);
                                break;
                            }
                        }
                        i.a.b(this.a, i.a[(this.aR == 5) ? 17 : 65], 5, 320 - (a4.a.getHeight() - 10), 36);
                        break;
                    }
                    case 4: {
                        this.H();
                        break;
                    }
                    case 7: {
                        this.H();
                        break;
                    }
                    case 30: {
                        b(this.a, true);
                        this.f(280);
                        if (i.aS % 15 >= 7) {
                            i.b.b(this.a, i.a[46], 120, 280, 17);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        this.H();
                        break;
                    }
                    case 5: {
                        if (!this.R) {
                            this.a.setClip(0, a.e, 240, 320 - a.e);
                            this.K();
                            this.a.setClip(0, 0, 240, 320);
                        }
                        else {
                            this.K();
                        }
                        if (i.f != null && this.R) {
                            this.at();
                            break;
                        }
                        break;
                    }
                    case 28: {
                        this.br = 11;
                        this.K();
                        break;
                    }
                    case 8:
                    case 9:
                    case 21:
                    case 35: {
                        this.K();
                        break;
                    }
                    case 6: {
                        final b b = i.a[0];
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 240, 320);
                        b.b = 136;
                        int n13 = 0;
                        if (i.aS > 30) {
                            b.a = 139;
                            b.a(1);
                            int n14;
                            if ((n14 = i.aS - 30 << 2) > 29) {
                                n14 = 29;
                                f f5;
                                Graphics graphics2;
                                int n16;
                                int n17;
                                int n18;
                                if (i.aS < 42) {
                                    final int n15 = 42 - i.aS;
                                    n13 = 0 + n15 * n15 % ((n15 >> 1) + 1);
                                    f5 = b.a;
                                    graphics2 = this.a;
                                    n16 = 10;
                                    n17 = 138;
                                    n18 = n13 + 136;
                                }
                                else {
                                    f5 = b.a;
                                    graphics2 = this.a;
                                    n16 = 4;
                                    n17 = 138;
                                    n18 = 136;
                                }
                                f5.a(graphics2, n16, n17, n18, 0);
                                b.e = 0;
                            }
                            else {
                                b.a.a(this.a, 10, 138, 136, 0);
                            }
                            b.b = n14 + 136;
                        }
                        else {
                            b.a = (i.aS << 2) - 1 + 18;
                        }
                        final b b2 = b;
                        b2.b += n13;
                        b.a(this.a);
                        b.a.a(this.a, 5, 138, n13 + 160, 0);
                        break;
                    }
                    case 1: {
                        this.D();
                        break;
                    }
                    case 12: {
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 240, 320);
                        final h a6;
                        (a6 = i.a).b(this.a, i.a[26], 120, 50, 17);
                        h h2;
                        Graphics graphics3;
                        String s6;
                        int n19;
                        int n20;
                        int n21;
                        if (this.k == 2) {
                            h2 = a6;
                            graphics3 = this.a;
                            s6 = i.a[49];
                            n19 = 0;
                            n20 = 320 - (a6.a.getHeight() - 10);
                            n21 = 36;
                        }
                        else {
                            a6.b(this.a, i.a[16], 0, 320 - (a6.a.getHeight() - 10), 36);
                            final String string = i.a[126] + " " + ((a(i.i, 4) < 500) ? a(i.i, 4) : 500) + " " + i.a[19];
                            h2 = a6;
                            graphics3 = this.a;
                            s6 = string;
                            n19 = 120;
                            n20 = 160;
                            n21 = 17;
                        }
                        h2.b(graphics3, s6, n19, n20, n21);
                    }
                    case 15: {
                        if (this.au) {
                            i.f = Image.createImage(200, 204);
                        }
                        Label_3607: {
                            if (this.av) {
                                this.av = false;
                                this.aw = true;
                                this.a.setClip(0, 0, 240, 320);
                                int n22 = 0;
                                int color = 0;
                                int color2 = 0;
                                int n23 = -1;
                                int n24 = 0;
                                while (true) {
                                    int n25 = 0;
                                    switch (this.aA) {
                                        case 0: {
                                            n22 = 939282;
                                            color = 3111750;
                                            color2 = 8635434;
                                            n24 = 24;
                                            n25 = 1;
                                            break;
                                        }
                                        case 1: {
                                            n22 = 869201;
                                            color = 4022666;
                                            color2 = 5873874;
                                            n24 = 25;
                                            n25 = 4;
                                            break;
                                        }
                                        case 2: {
                                            n22 = 5210510;
                                            color = 3711421;
                                            color2 = 7469567;
                                            n24 = 26;
                                            n25 = 64;
                                            break;
                                        }
                                        default: {
                                            this.a.setColor(n22);
                                            this.a.fillRect(0, 0, 240, 320);
                                            i.a[n24].a(this.a, 0, 120, 0, 0);
                                            i.b.b(this.a, i.a[n23], 120, 12, 17);
                                            (i.c = i.f.getGraphics()).setColor(n22);
                                            i.c.fillRect(0, 0, 200, 204);
                                            i.a[23].a(i.c, 0, 100, 102, 0);
                                            this.a.setColor(color);
                                            this.a.fillRoundRect(2, 275, 236, a.h, 8, 8);
                                            this.a.setColor(color2);
                                            this.a.drawRoundRect(2, 275, 236, a.h, 8, 8);
                                            this.I();
                                            this.J();
                                            i.a.b(this.a, i.a[60], 218, 314, 40);
                                            if (i.a[17] != null) {
                                                i.a[17].a(this.a, 12, 10, 278, 0);
                                                i.a[17].a(this.a, 10, 155, 280, 0);
                                                i.a[17].a(this.a, 11, 80, 280, 0);
                                            }
                                            i.c.delete(0, i.c.length());
                                            i.c.append(this.az);
                                            i.a.b(this.a, i.c.toString(), 41, 290, 20);
                                            i.c.delete(0, i.c.length());
                                            i.c.append(a(i.i, 4));
                                            i.a.b(this.a, i.c.toString(), 99, 290, 20);
                                            i.c.delete(0, i.c.length());
                                            final int a7 = a(i.i, 6);
                                            final byte j = i.i[0];
                                            if (a7 >= j) {
                                                i.c.append(a7).append("/").append(a7);
                                            }
                                            else {
                                                i.c.append(a7).append("/").append(j);
                                            }
                                            i.a.b(this.a, i.c.toString(), 174, 290, 20);
                                            this.au = false;
                                            this.ax();
                                            break Label_3607;
                                        }
                                    }
                                    n23 = n25;
                                    continue;
                                }
                            }
                        }
                        Label_5087: {
                            if (this.aw) {
                                this.a.drawImage(i.f, 20, 69, 0);
                                int color3 = 0;
                                int color4 = 0;
                                while (true) {
                                    int n26 = 0;
                                    switch (this.aA) {
                                        case 0: {
                                            color3 = 3111750;
                                            n26 = 8635434;
                                            break;
                                        }
                                        case 1: {
                                            color3 = 4022666;
                                            n26 = 5873874;
                                            break;
                                        }
                                        case 2: {
                                            color3 = 3711421;
                                            n26 = 7469567;
                                            break;
                                        }
                                        default: {
                                            this.a.setColor(color3);
                                            this.a.fillRoundRect(2, a.g, 236, a.f, 8, 8);
                                            this.a.setColor(color4);
                                            this.a.drawRoundRect(2, a.g, 236, a.f, 8, 8);
                                            final int n27 = 37 + this.dV * 13 + 6;
                                            final int n28 = 73 + this.dW * 13 + 6;
                                            if (this.dV != this.dX || this.dW != this.dY) {
                                                final int n29 = 37 + this.dX * 13 + 6;
                                                final int n30 = 73 + this.dY * 13 + 6;
                                                if (((this.a(this.aA, this.aB + 1) & 0x2) != 0x0 && this.aB + 1 == i.dZ) || this.aB == i.dZ) {
                                                    this.ap = true;
                                                }
                                                if (!this.ap) {
                                                    this.ap = this.h();
                                                    if (this.ap) {
                                                        this.av = true;
                                                    }
                                                }
                                                else {
                                                    final int n31 = n27;
                                                    final int n32 = n28;
                                                    final int n33 = n29;
                                                    final int n34 = n30;
                                                    final int n35 = n33;
                                                    final int dn = n32;
                                                    final int dm = n31;
                                                    if (this.an) {
                                                        this.an = false;
                                                        this.dM = dm;
                                                        this.dN = dn;
                                                        this.dO = 0;
                                                        this.dP = n35 - dm;
                                                        this.dQ = n34 - dn;
                                                        this.dR = 0;
                                                        this.dS = 0;
                                                        this.dT = 10;
                                                        this.dU = 10;
                                                    }
                                                    if (this.dP < 0) {
                                                        this.dT = -10;
                                                        this.dP = -this.dP;
                                                    }
                                                    if (this.dQ < 0) {
                                                        this.dU = -10;
                                                        this.dQ = -this.dQ;
                                                    }
                                                    this.ao = (this.dT <= 0);
                                                    final int n36 = this.ao ? 7 : 6;
                                                    boolean b3 = false;
                                                    Label_4533: {
                                                        Label_4532: {
                                                            if (this.dQ <= this.dP) {
                                                                this.dR = 2 * this.dP;
                                                                this.dS = 2 * this.dQ;
                                                                if ((this.dT < 0 && this.dM <= n35) || (this.dT > 0 && this.dM >= n35)) {
                                                                    i.a[17].a(this.a, n36, 37 + this.dX * 13 + 6, 73 + this.dY * 13 + 6, 0);
                                                                    this.an = true;
                                                                    b3 = true;
                                                                    break Label_4533;
                                                                }
                                                                i.a[17].a(this.a, n36, this.dM, this.dN, 0);
                                                                this.dM += this.dT;
                                                                this.dO += this.dS;
                                                                if (this.dO <= this.dP) {
                                                                    break Label_4532;
                                                                }
                                                                this.dN += this.dU;
                                                            }
                                                            else {
                                                                this.dR = 2 * this.dQ;
                                                                this.dS = 2 * this.dP;
                                                                if ((this.dU < 0 && this.dN <= n34) || (this.dU > 0 && this.dN >= n34)) {
                                                                    i.a[17].a(this.a, n36, 37 + this.dX * 13 + 6, 73 + this.dY * 13 + 6, 0);
                                                                    this.an = true;
                                                                    b3 = true;
                                                                    break Label_4533;
                                                                }
                                                                i.a[17].a(this.a, n36, this.dM, this.dN, 0);
                                                                this.dN += this.dU;
                                                                this.dO += this.dS;
                                                                if (this.dO <= this.dQ) {
                                                                    break Label_4532;
                                                                }
                                                                this.dM += this.dT;
                                                            }
                                                            this.dO -= this.dR;
                                                        }
                                                        b3 = false;
                                                    }
                                                    if (b3) {
                                                        this.dV = this.dX;
                                                        this.dW = this.dY;
                                                    }
                                                }
                                            }
                                            else if (this.aw) {
                                                i.a[17].a(this.a, this.ao ? 7 : 6, n27, n28, 0);
                                            }
                                            h h3 = null;
                                            Graphics graphics4 = null;
                                            String s7 = null;
                                            int n37 = 0;
                                            int n38 = 0;
                                            int n39 = 0;
                                            Label_4743: {
                                                final int a8;
                                                String[] array;
                                                int n40;
                                                if ((a8 = a(i.a[this.dV][this.dW], (byte)6, (byte)5)) < this.dK) {
                                                    if (i.b) {
                                                        h3 = i.b;
                                                        graphics4 = this.a;
                                                        s7 = i.c[a8];
                                                        n37 = 234;
                                                        n38 = a.i;
                                                        n39 = 40;
                                                        break Label_4743;
                                                    }
                                                    h3 = i.b;
                                                    graphics4 = this.a;
                                                    array = i.c;
                                                    n40 = a8;
                                                }
                                                else {
                                                    if (i.b) {
                                                        h3 = i.b;
                                                        graphics4 = this.a;
                                                        s7 = i.c[a8 + 10 - this.dK + 1];
                                                        n37 = 234;
                                                        n38 = a.i;
                                                        n39 = 40;
                                                        break Label_4743;
                                                    }
                                                    h3 = i.b;
                                                    graphics4 = this.a;
                                                    array = i.c;
                                                    n40 = a8 + 10 - this.dK + 1;
                                                }
                                                s7 = array[n40];
                                                n37 = 8;
                                                n38 = a.i;
                                                n39 = 36;
                                            }
                                            h3.b(graphics4, s7, n37, n38, n39);
                                            if (this.dV != this.dX || this.dW != this.dY) {
                                                break Label_5087;
                                            }
                                            final int a9 = a(i.a[this.dV][this.dW], (byte)6, (byte)5);
                                            int b4 = this.b(this.aA, a9);
                                            final int c = this.c(this.aA, a9);
                                            if (b4 > c) {
                                                b4 = c;
                                            }
                                            i.c.delete(0, i.c.length());
                                            i.c.append(b4);
                                            i.c.append('/');
                                            i.c.append(c);
                                            i.a.a(i.c.toString());
                                            final int n41 = h.a + 6 + 14;
                                            final int n42 = 37 + this.dV * 13 + 6;
                                            final int n43 = 73 + this.dW * 13 + 6;
                                            int n44 = n42 - (n41 >> 1);
                                            int n45;
                                            if ((n45 = n43 - 17 - 26) <= 63) {
                                                n45 = 63;
                                                if ((n44 = n42 + 20) + n41 >= 220) {
                                                    n44 = n42 - n41 - 20;
                                                }
                                            }
                                            if (n44 <= 25) {
                                                n44 = 25;
                                            }
                                            if (n44 + n41 >= 220) {
                                                n44 = 170;
                                            }
                                            a(this.a, n44, n45 - 15, n41, 17, 37042, 0);
                                            i.a.b(this.a, i.c.toString(), n44 + 2, n45 + 2 + 8, 20);
                                            if (i.a[17] != null) {
                                                i.a[17].a(this.a, 10, n44 + n41 - 2 - 14, n45 + 2 - 1, 0);
                                            }
                                            break Label_5087;
                                        }
                                    }
                                    color4 = n26;
                                    continue;
                                }
                            }
                        }
                        if (this.aw && this.dV == this.dX && this.dW == this.dY) {
                            this.aw = false;
                        }
                        break;
                    }
                    case 18: {
                        i.a[17] = a("/ms.f", 0, 0, 0);
                        this.P();
                        this.av = true;
                        i.b = 25;
                        this.en = this.n;
                        this.g = i.a[125] + " " + a(i.i, 4) + " " + i.a[19];
                    }
                    case 25: {
                        this.ay();
                    }
                    case 27: {
                        this.B();
                        break;
                    }
                    case 31: {
                        if (this.Q) {
                            this.Q = false;
                            this.a.setColor(0);
                            this.a.fillRect(0, 0, 240, 320);
                            i.a.a(this.a, a(i.a[this.O ? 39 : 21]), 120, 160, 3);
                            this.J();
                            this.I();
                            break;
                        }
                        break;
                    }
                    case 16: {
                        this.K();
                        break;
                    }
                    case 29: {
                        this.A();
                        break;
                    }
                }
                final h a10 = i.a;
                if (i.eq > 0) {
                    a10.a(this.h);
                    final int b5 = h.b;
                    final int a11 = h.a;
                    if (this.er == -1) {
                        this.er = 240 - a11 >> 1;
                    }
                    if (this.es == -1) {
                        this.es = 320 - b5 >> 1;
                    }
                    this.a.setClip(this.er - 6, this.es - 3, a11 + 12, b5 + 26 + 6);
                    a(this.a, this.er - 6, this.es - 3, a11 + 12, b5 + 6, this.et, this.eu);
                    a10.a(this.a, this.h, this.er, this.es + 26, 0);
                }
            }
            catch (Throwable t) {}
        }
        catch (Exception ex3) {}
    }
    
    private static String a(final String s) {
        final String[] a = c.a(s, 220);
        String string = "";
        for (int i = 0; i < a.length; ++i) {
            string = string + a[i] + "\n";
        }
        return string;
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
                graphics.drawImage(i.b[8][0], j + n, i + n2, 0);
            }
        }
        i.a[10].a(graphics, 0, this.z + n, this.A + n2, 0);
        if (b) {
            for (int k = 0; k < 320; k += 24) {
                for (int l = 0; l < 240; l += 24) {
                    i.a[17].a(graphics, 16, l, k, 0);
                }
            }
        }
    }
    
    private void a(final Graphics graphics, final boolean b) {
        this.a(graphics, b, 0, 0);
    }
    
    private void A() {
        if (this.av) {
            this.a(this.a, false, this.Y, this.Z);
            i.a[17].a(this.a, 11, 120 + a.c[6] + this.Y, 136 + a.c[7] + this.Z, 0);
            for (int i = 0; i < 3; ++i) {
                i.a[i + 52].a(this.a, 0, a.c[i << 1] + 120 - this.G + this.Y, a.c[(i << 1) + 1] + 136 - this.H + this.Z, 0);
            }
        }
        switch (this.W) {
            case 1: {
                if (!this.av) {
                    this.a.setColor(this.X);
                    this.a.fillRect(0, 0, 240, 320);
                    for (int j = 0; j < 3; ++j) {
                        i.a[j + 52].a(this.a, 0, a.c[j << 1] + 120 - this.G, a.c[(j << 1) + 1] + 136 - this.H, 0);
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
                g.a(this.a);
            }
            case 9:
            case 10: {
                g.a(this.a);
                final String a = a(i.a[15] + "\n" + i.a[20]);
                i.a.a(a);
                a(this.a, (240 - h.a >> 1) - 3, (320 - h.b >> 1) - 3, h.a + 6, h.b + 6, 7096587, 0);
                i.a.a(this.a, a, 120, (320 - h.b >> 1) + 24, 17);
                break;
            }
        }
    }
    
    private void B() {
        if (this.av || this.g) {
            this.a.setClip(0, 0, 240, 320);
            this.a(this.a, false);
            i.a[17].a(this.a, 11, 120 + a.c[6], 136 + a.c[7], 0);
            this.I();
            this.J();
            i.a.b(this.a, i.a[36], 218, 314, 10);
            this.av = false;
        }
        else {
            this.a.setClip(this.s + 120, this.t + 136, 14, 22);
            i.a[10].a(this.a, 0, this.z, this.A, 0);
        }
        if (this.B != 0) {
            this.g = false;
            this.av = true;
            for (int i = 0; i < this.B; ++i) {
                if (b(i)) {
                    i.a[10].a(this.a, i + 1, this.z, this.A, 0);
                }
            }
            this.a.setClip(0, 0, 240, 320);
            if (this.K < this.J) {
                i.a[9].a(this.a, 5, this.K, a.c[this.B << 1] + 120 - 12, a.c[(this.B << 1) + 1] + 124, 0, 0, 0);
                ++this.K;
            }
            else {
                if (this.y % this.x >= this.x >> 1) {
                    i.a[10].a(this.a, this.B + 1, this.z, this.A, 0);
                    ++this.C;
                }
                if (this.C >= 15) {
                    i.a[this.B] = true;
                    this.C = 0;
                    this.B = 0;
                    this.K = 0;
                    this.h();
                    this.g = true;
                    this.av = false;
                }
            }
        }
        else {
            for (int j = 0; j < 3; ++j) {
                if (i.a[j]) {
                    i.a[10].a(this.a, j + 1, this.z, this.A, 0);
                }
            }
        }
        for (int k = 0; k < 3; ++k) {
            if (i.b[k]) {
                final int n = k + 52;
                if (this.D != k) {
                    i.a[n].a(this.a, 0, a.c[k << 1] + 120 - this.G, a.c[(k << 1) + 1] + 136 - this.H, 0);
                }
            }
        }
        if (this.D != -1) {
            this.av = true;
            final int d = this.D;
            final int n2 = d + 52;
            final int n3 = a.c[d << 1] + 120;
            final int n5;
            final int n4 = (n5 = a.c[(d << 1) + 1] + 136) - this.F;
            final int n6 = n3 - this.E;
            Label_0677: {
                if (n4 < 0) {
                    this.F -= 2;
                    if (this.F > n5) {
                        break Label_0677;
                    }
                }
                else {
                    if (n4 <= 0) {
                        break Label_0677;
                    }
                    this.F += 2;
                    if (this.F < n5) {
                        break Label_0677;
                    }
                }
                this.F = n5;
            }
            Label_0734: {
                if (n6 < 0) {
                    this.E -= 3;
                    if (this.E > n3) {
                        break Label_0734;
                    }
                }
                else {
                    if (n6 <= 0) {
                        break Label_0734;
                    }
                    this.E += 3;
                    if (this.E < n3) {
                        break Label_0734;
                    }
                }
                this.E = n3;
            }
            i.a[n2].a(this.a, 0, this.E - this.G, this.F - this.H, 0);
            boolean b = false;
            Label_0946: {
                if (this.E == n3 && this.F == n5) {
                    this.E = n3;
                    this.F = n5;
                    if (this.I < 20) {
                        if (this.I % 2 == 1) {
                            this.a.setColor(0 + 838860 * this.I);
                            this.a.fillRect(0, 0, 240, 320);
                        }
                        ++this.I;
                    }
                    else {
                        if (this.K >= this.J) {
                            this.K = 0;
                            this.I = 0;
                            b = true;
                            break Label_0946;
                        }
                        i.a[9].a(this.a, 5, this.K, a.c[d << 1] + 120 - 12, a.c[(d << 1) + 1] + 124, 0, 0, 0);
                        ++this.K;
                    }
                }
                b = false;
            }
            if (b) {
                this.D = -1;
                if (i.b[0] && i.b[1] && i.b[2]) {
                    this.e();
                    this.av = true;
                    this.i = true;
                    i.b = 29;
                }
            }
            return;
        }
        this.y %= this.x;
        this.a.setClip(this.q + 120, 136 + this.r, 14, 22);
        i.a[55].a(this.a, 0, this.y, 120 + this.q, 136 + this.r, 0, 0, 0);
        ++this.y;
        if (this.g) {
            final String s = (c.a(this.b, 220).length > 1) ? a(this.b + "\n" + this.c) : (a(this.b) + this.c);
            i.a.a(s);
            final int n7 = (240 - h.a >> 1) - 3;
            final int n8 = 240 - (i.a.a.getHeight() >> 1) - 3;
            final int n9 = h.a + 6;
            final int n10 = h.b + 3;
            this.a.setClip(n7, n8 - 15, n9, n10 + 20);
            a(this.a, n7, n8 - 15, n9, n10, 7096587, 0);
            i.a.a(this.a, s, 120, 240, 3);
            this.g = false;
        }
    }
    
    private static void b(final Graphics graphics, final boolean b) {
        graphics.drawImage(i.b, 0, 0, 20);
        graphics.drawImage(i.a, 0, 0, 20);
        if (b) {
            graphics.drawImage(i.c, 120, 319, 33);
        }
    }
    
    private static void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        graphics.drawImage(i.d, n3 - n, n4 - n2, 0);
    }
    
    private void b(final int n, final int n2) {
        final int n3 = this.a - this.a % 24;
        final int n4 = this.b - this.b % 24;
        final int n5 = this.a + i.cC - 24 - (this.a + i.cC - 24) % 24;
        final int n6 = this.b + i.cD - 24 - (this.b + i.cD - 24) % 24;
        final int n7 = n * 24;
        final int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            final int n9 = i.a[n][n2] & 0xFF;
            if (i.a[n][n2] < 80) {
                if (n9 == 4 || n9 == 16 || n9 == 15) {
                    this.c(n, n2);
                    return;
                }
                i.b.drawImage(i.b[8][0], n7 % i.cC, n8 % i.cD, 0);
            }
        }
    }
    
    private void c(int n, int n2) {
        final int n3 = this.a - this.a % 24;
        final int n4 = this.b - this.b % 24;
        final int n5 = this.a + i.cC - 24 - (this.a + i.cC - 24) % 24;
        final int n6 = this.b + i.cD - 24 - (this.b + i.cD - 24) % 24;
        n *= 24;
        n2 *= 24;
        if (n >= n3 && n <= n5 && n2 >= n4 && n2 <= n6) {
            this.a(n, n2, n, n2, false);
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
                i.a[45].a = 0;
                return 45;
            }
            case 23: {
                i.a[45].a = 1;
                return 45;
            }
            case 4: {
                return 56;
            }
            case 15: {
                i.a[57].a = 0;
                return 57;
            }
            case 14: {
                i.a[57].a = 1;
                return 57;
            }
            case 16: {
                return 58;
            }
            case 2: {
                i.a[59].a = 0;
                return 59;
            }
            case 3: {
                i.a[59].a = 1;
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
    
    private void a(final int n, int i, final int n2, final int n3, final boolean b) {
        final Graphics b2 = i.b;
        final int cc = i.cC;
        final int cd = i.cD;
        final int n4 = n % cc;
        this.by = i % cd - 24;
        this.bH = i / 24 - 1;
        int j;
        int n5;
        int n6;
        i k = null;
        int ak = 0;
        int n7;
        byte b3;
        i l = null;
        int am = 0;
        int n8;
        Graphics graphics;
        for (i = i; i <= n3; i += 24) {
            this.bx = n4 - 24;
            this.bG = n / 24 - 1;
            this.by += 24;
            ++this.bH;
            if (this.by >= cd) {
                this.by = 0;
            }
            for (j = n; j <= n2; j += 24) {
                this.bx += 24;
                ++this.bG;
                if (this.bx >= cc) {
                    this.bx = 0;
                }
                if (this.bG >= 0 && this.bG < this.e && this.bH >= 0 && this.bH < this.f) {
                    this.bI = i.a[this.bG][this.bH];
                    this.bJ = (i.a[this.bG][this.bH] & 0xFF);
                    if (this.bI < 80) {
                        b2.drawImage(i.b[8][0], this.bx, this.by, 0);
                    }
                    Label_0439: {
                        if (this.bJ > -1 && this.bJ < 38) {
                            switch (this.bJ) {
                                case 4: {
                                    this.aJ = 20;
                                    this.aK = 7;
                                    n5 = 0;
                                    this.bO = n5;
                                    this.bN = n5;
                                    break Label_0439;
                                }
                                case 27: {
                                    this.aJ = 21;
                                    this.aK = 0;
                                    n6 = 0;
                                    this.bO = n6;
                                    this.bN = n6;
                                    break Label_0439;
                                }
                                case 15: {
                                    if (this.ce == 0) {
                                        this.aJ = 14;
                                        k = this;
                                        ak = 0 + this.ce * 5 / 10;
                                        break;
                                    }
                                    break Label_0439;
                                }
                                case 16: {
                                    if (this.ce != 9) {
                                        break Label_0439;
                                    }
                                    this.aJ = 15;
                                    this.aK = 4 - this.ce * 5 / 10;
                                    if (this.aK < 0) {
                                        k = this;
                                        ak = 0;
                                        break;
                                    }
                                    break Label_0439;
                                }
                            }
                            k.aK = ak;
                        }
                    }
                    if (this.aJ != -1) {
                        if (i.b[this.aJ] == null) {
                            i.a[a(this.aJ)].a(b2, this.aK, this.bx + this.bN, this.by + this.bO, this.bP);
                        }
                        else {
                            b2.drawImage(i.b[this.aJ][this.aK], this.bx + this.bN, this.by + this.bO, this.bP);
                        }
                        this.bP = 0;
                        this.aJ = -1;
                        n7 = 0;
                        this.bO = n7;
                        this.bN = n7;
                    }
                    if (this.bI != -1) {
                        Label_0854: {
                            if ((b3 = (byte)(this.bI - 80)) >= 0) {
                                this.aL = 0;
                                l = this;
                                am = b3;
                            }
                            else {
                                switch (this.bI) {
                                    case 10: {
                                        i.a[16].a(b2, 0, this.bx, this.by, 0);
                                        break Label_0854;
                                    }
                                    case 1: {
                                        if (i.b[this.bG][this.bH] == 0 && (i.e == null || i.e[this.bG][this.bH] == 0)) {
                                            this.O();
                                            this.aM -= this.bR;
                                            this.bO = 0;
                                        }
                                        break Label_0854;
                                    }
                                    case 0: {
                                        if (i.b[this.bG][this.bH] == 0 && (i.e == null || i.e[this.bG][this.bH] == 0)) {
                                            this.O();
                                        }
                                        break Label_0854;
                                    }
                                    case 34: {
                                        if (this.ce == 9) {
                                            this.aL = 14;
                                            l = this;
                                            am = 0 + this.ce * 5 / 10;
                                            break;
                                        }
                                        break Label_0854;
                                    }
                                    case 35: {
                                        if (this.ce != 0) {
                                            break Label_0854;
                                        }
                                        this.aL = 15;
                                        this.aM = 4 - this.ce * 5 / 10;
                                        if (this.aM < 0) {
                                            l = this;
                                            am = 0;
                                            break;
                                        }
                                        break Label_0854;
                                    }
                                }
                            }
                            l.aM = am;
                        }
                        if (this.aL != -1) {
                            if (i.b[this.aL] == null) {
                                i.a[a(this.aL)].a(b2, this.aM, this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            else {
                                b2.drawImage(i.b[this.aL][this.aM], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.aL = -1;
                            this.bP = 0;
                            n8 = 0;
                            this.bO = n8;
                            this.bN = n8;
                        }
                    }
                    if (this.k == 2) {
                        graphics = b2;
                        if (i.a[10] == null) {
                            i.a[10] = a("/mmv.f", 0, 0, 0);
                        }
                        if (this.bG >= 60 && this.bG < 65 && this.bH >= 2 && this.bH < 7) {
                            i.a[10].a(graphics, 4 + (this.bH - 2) * 5 + this.bG - 60, this.bx, this.by, 0);
                        }
                    }
                }
            }
        }
    }
    
    private void C() {
        this.a.setClip(0, 0, 240, 240);
    }
    
    private void D() {
        final Graphics a = this.a;
        final int as = i.aS;
        this.bQ = (((this.k & 0x1000) == 0x0) ? this.l : 0);
        a.translate(0, 40);
        this.bk = 0;
        this.C();
        if (this.bj > 0) {
            this.bk = this.bj * as % ((this.bj >> 1) + 1) % 12;
        }
        if (this.bk > this.b) {
            this.bk = this.b;
        }
        this.b -= this.bk;
        this.cI = this.a / 24;
        this.cJ = this.b / 24;
        this.cK = this.a % 24;
        this.cL = this.b % 24;
        this.bR = (as & 0x3F) >> 1;
        if (this.bR >= 4) {
            this.bR = 0;
        }
        final int n = this.a - this.cK;
        final int n2 = this.b - this.cL;
        final int n3 = this.a + i.cC - 24 - (this.a + i.cC - 24) % 24;
        final int n4 = this.b + i.cD - 24 - (this.b + i.cD - 24) % 24;
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
        final Graphics graphics = a;
        final int n9 = this.a % i.cC;
        final int n10 = this.b % i.cD;
        final int n11 = (this.a + 240) % i.cC;
        final int n12 = (this.b + 240) % i.cD;
        Graphics graphics2 = null;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        Label_0602: {
            if (n11 > n9) {
                if (n12 > n10) {
                    graphics2 = graphics;
                    n13 = n9;
                    n14 = n10;
                    n15 = 0;
                    n16 = 0;
                    break Label_0602;
                }
                a(graphics, n9, n10, 0, 0);
                graphics2 = graphics;
                n13 = n9;
                n14 = 0;
                n15 = 0;
            }
            else {
                if (n12 > n10) {
                    a(graphics, n9, n10, 0, 0);
                    graphics2 = graphics;
                    n13 = 0;
                    n14 = n10;
                    n15 = 240 - n11;
                    n16 = 0;
                    break Label_0602;
                }
                a(graphics, n9, n10, 0, 0);
                a(graphics, n9, 0, 0, 240 - n12);
                a(graphics, 0, n10, 240 - n11, 0);
                graphics2 = graphics;
                n13 = 0;
                n14 = 0;
                n15 = 240 - n11;
            }
            n16 = 240 - n12;
        }
        a(graphics2, n13, n14, n15, n16);
        this.C();
        final Graphics graphics3 = a;
        for (int i = -1; i < 12; ++i) {
            i k = null;
            int bj;
            int n17;
            int n18;
            int bg;
            int bh;
            i l;
            int bo;
            int bg2;
            int bh2;
            int n19;
            i m;
            int ak;
            int n20;
            i i2;
            int ak2;
            int n21;
            i i3;
            int n22;
            int n23;
            int bg3;
            int bh3;
            int n24;
            byte b;
            int n25;
            int n26;
            i i4;
            int bl;
            i i5;
            int bk;
            int n27;
            int n28;
            boolean b2;
            i i6;
            int bl2;
            byte b3;
            int n29;
            i i7 = null;
            int bl3 = 0;
            i i8 = null;
            int bo2 = 0;
            i i9 = null;
            int bk2 = 0;
            int n30;
            i i10;
            byte bo3;
            int a2;
            int n31;
            int n32;
            int n33;
            int n34;
            int bl4;
            int a3;
            int n35;
            int n36;
            int a4;
            int n37;
            i i11 = null;
            int bl5 = 0;
            int bx;
            int by;
            int n38;
            Image[] array;
            int n39;
            int n40;
            f f;
            i i12;
            int bl6;
            int n41;
            int n42;
            int n43;
            int n44;
            int n45;
            int n46;
            f f2;
            Graphics graphics4;
            int n48;
            int n49;
            int n50;
            int n51;
            f f3;
            byte b4;
            int n52;
            short bl7;
            int as2;
            int n54;
            byte b5;
            int n55;
            int n56;
            int n57;
            byte b6;
            int bx2;
            int n58;
            i i13;
            int bl8;
            int bg4;
            int bh4;
            int n59;
            i i14;
            int am;
            int n60;
            i i15 = null;
            int bo4 = 0;
            i i16 = null;
            int bo5 = 0;
            i i17 = null;
            int n61;
            Label_3025_Outer:Label_5350_Outer:
            for (int j = -1; j < 12; ++j) {
                this.bG = j + this.cI;
                this.bH = i + this.cJ;
                if (this.bG >= 0 && this.bG < this.e && this.bH >= 0 && this.bH < this.f) {
                    this.bI = i.a[this.bG][this.bH];
                    this.bJ = (i.a[this.bG][this.bH] & 0xFF);
                    this.bx = j * 24 - this.cK;
                    this.by = i * 24 - this.cL;
                    this.C();
                    Label_2138: {
                        if (this.bJ > -1 && this.bJ < 38) {
                            Label_1934: {
                                switch (this.bJ) {
                                    case 35: {
                                        k = this;
                                        break;
                                    }
                                    case 34: {
                                        i.a[27].a(graphics3, 2, 0, this.bx, this.by, 0, 0, 0);
                                        break Label_1934;
                                    }
                                    case 14:
                                    case 33: {
                                        bj = this.bJ;
                                        if ((n17 = i.a[this.bG][this.bH] >> 8) == 255) {
                                            n17 = 0;
                                        }
                                        n18 = ((14 == bj) ? 8 : 22);
                                        if (i.a[n18] != null) {
                                            i.a[n18].a(this.a, 0, n17, this.bx, this.by, 0, 0, 0);
                                        }
                                        break Label_1934;
                                    }
                                    case 6: {
                                        bg = this.bG;
                                        bh = this.bH;
                                        this.aJ = 26;
                                        this.aK = 0;
                                        Label_1272: {
                                            if (i(bg, bh) && i.b[bg][bh] <= 12) {
                                                l = this;
                                                bo = -(i.b[bg][bh] - 12);
                                            }
                                            else if (this.c(bg, bh)) {
                                                if ((this.k & 0x1000) == 0x0) {
                                                    if (this.j > 12) {
                                                        break Label_1272;
                                                    }
                                                    l = this;
                                                    bo = -(this.j - 12);
                                                }
                                                else {
                                                    l = this;
                                                    bo = 12;
                                                }
                                            }
                                            else {
                                                if (this.c(bg - 1, bh)) {
                                                    if (this.bQ != 4 || this.j <= 12) {
                                                        break Label_1272;
                                                    }
                                                }
                                                else if (!this.c(bg + 1, bh) || this.bQ != 2 || this.j <= 12) {
                                                    break Label_1272;
                                                }
                                                l = this;
                                                bo = this.j - 12;
                                            }
                                            l.bO = bo;
                                        }
                                        this.bO += 24;
                                        this.bP = 36;
                                        if (this.by + 24 < 240) {
                                            graphics3.clipRect(this.bx, this.by, 24, 24);
                                        }
                                        break Label_1934;
                                    }
                                    case 15: {
                                        if (this.ce != 0 && this.ce <= 5) {
                                            this.aJ = 14;
                                            this.aK = 0 + this.ce * 5 / 10;
                                        }
                                        break Label_1934;
                                    }
                                    case 16: {
                                        if (this.ce == 9 || this.ce < 5) {
                                            break Label_1934;
                                        }
                                        this.aJ = 15;
                                        this.aK = 4 - this.ce * 5 / 10;
                                        if (this.aK < 0) {
                                            this.aK = 0;
                                        }
                                        break Label_1934;
                                    }
                                    case 7: {
                                        bg2 = this.bG;
                                        bh2 = this.bH;
                                        if ((n19 = ((i.a[bg2][bh2] >> 8 & 0xF0) >> 4) - 1) < 0) {
                                            n19 = 0;
                                        }
                                        if ((i.a[bg2][bh2 - 1] & 0xFF) != 0x9 && (i.a[bg2][bh2 - 1] & 0xFF) != 0x8) {
                                            i.a[56].a(this.a, n19, this.bx, this.by, 0);
                                        }
                                        this.aJ = 4;
                                        this.aK = (byte)(n19 + 3);
                                        break Label_1934;
                                    }
                                    case 4: {
                                        if (i.a[this.bG][this.bH] >> 8 >= this.aC) {
                                            this.aJ = 20;
                                            if (i.a[this.bG][this.bH] >> 8 >= this.aC) {
                                                m = this;
                                                ak = 0 + (i.aS >> 1) % 7;
                                            }
                                            else {
                                                m = this;
                                                ak = 7;
                                            }
                                            m.aK = ak;
                                        }
                                        break Label_1934;
                                    }
                                    case 5:
                                    case 28: {
                                        this.aJ = 11;
                                        if ((this.aA == 0 && (this.aB == 4 || this.aB == 7)) || (this.aA == 1 && this.aB == 8) || (this.aA == 2 && (this.aB == 1 || this.aB == 2 || this.aB == 6 || this.aB == 7))) {
                                            this.aK = 1;
                                            break Label_1934;
                                        }
                                        this.aK = 0;
                                        break Label_1934;
                                    }
                                    case 8:
                                    case 9: {
                                        n20 = i.a[this.bG][this.bH] >> 8;
                                        this.aJ = ((this.bJ == 9) ? 22 : 23);
                                        if ((n20 & 0x200) != 0x0) {
                                            i2 = this;
                                            ak2 = (byte)(1 + (i.aS >> 2) % 6);
                                        }
                                        else if ((n20 & 0x100) != 0x0) {
                                            i2 = this;
                                            ak2 = 1;
                                        }
                                        else {
                                            i2 = this;
                                            ak2 = 0;
                                        }
                                        i2.aK = ak2;
                                        break Label_1934;
                                    }
                                    case 3: {
                                        if ((n21 = (i.a[this.bG][this.bH] >> 8) - 1) >= 0) {
                                            this.aJ = 12;
                                            this.aK = (byte)n21;
                                        }
                                        break Label_1934;
                                    }
                                    case 37: {
                                        i.a[27].a(graphics3, 2, 0, this.bx, this.by, 0, 0, 0);
                                        k = this;
                                        break;
                                    }
                                }
                                i3 = k;
                                i.b = i.a[30];
                                i3.bK = 1;
                                i3.bL = a(i.b, 1, i.aS % a(i.b, 1));
                            }
                            if (this.aJ != -1) {
                                if (i.b[this.aJ] == null) {
                                    i.a[a(this.aJ)].a(graphics3, this.aK, this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                else {
                                    graphics3.drawImage(i.b[this.aJ][this.aK], this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                this.bP = 0;
                                this.aJ = -1;
                                graphics3.setClip(0, -this.bk, 240, 240);
                            }
                            else {
                                if (i.b == null) {
                                    break Label_2138;
                                }
                                if (this.bK != -1) {
                                    i.b.a(graphics3, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, 0, 0, 0);
                                    this.bK = -1;
                                }
                                i.b = null;
                            }
                            n22 = 0;
                            this.bO = n22;
                            this.bN = n22;
                        }
                    }
                    if (this.bI != -1) {
                        Label_5612: {
                            if ((byte)(this.bI - 80) < 0) {
                                n23 = i.b[this.bG][this.bH];
                                Label_5608: {
                                    switch (this.bI) {
                                        case 49: {
                                            bg3 = this.bG;
                                            bh3 = this.bH;
                                            n24 = i.b[bg3][bh3];
                                            b = i.b[bg3][bh3];
                                            n25 = (n24 & 0x7);
                                            this.bN = b * i.g[n25];
                                            this.bO = b * i.g[n25 + 8];
                                            i.b = i.a[38];
                                            if ((((n26 = (n24 & 0x7000) >> 12) == 2 || n26 == 4 || n25 == 2 || n25 == 4) && i.a[bg3 - 1][bh3] >= 0 && i.a[bg3 + 1][bh3] >= 0) || ((n26 == 1 || n26 == 3 || n25 == 1 || n25 == 3) && i.a[bg3][bh3 - 1] >= 0 && i.a[bg3][bh3 + 1] >= 0)) {
                                                this.bK = 1;
                                                i4 = this;
                                                bl = 0;
                                            }
                                            else {
                                                if (n25 == 1 || n25 == 3) {
                                                    i5 = this;
                                                    bk = n25 - 1;
                                                }
                                                else {
                                                    i5 = this;
                                                    bk = 0;
                                                }
                                                i5.bK = bk;
                                                i4 = this;
                                                bl = (i.aS >> 1) % i.b.a(this.bK);
                                            }
                                            i4.bL = bl;
                                            this.F();
                                            break Label_5612;
                                        }
                                        case 48: {
                                            if (((n27 = i.b[this.bG][this.bH]) & 0x8) == 0x0) {
                                                i.b = i.a[32];
                                                n28 = (n27 & 0x7);
                                                if (((b2 = ((n27 & 0x10) == 0x0)) && n28 == 2) || (!b2 && n28 == 4)) {
                                                    i6 = this;
                                                    bl2 = 2;
                                                }
                                                else {
                                                    i6 = this;
                                                    bl2 = (b2 ? 1 : 0);
                                                }
                                                i6.bL = bl2;
                                                b3 = i.b[this.bG][this.bH];
                                                this.bN = b3 * i.g[n28];
                                                this.bO = b3 * i.g[n28 + 8];
                                            }
                                            break Label_5612;
                                        }
                                        case 21: {
                                            n29 = (i.b[this.bG][this.bH] & 0x7);
                                            i.b = i.a[29];
                                            Label_3107: {
                                                if ((i.b[this.bG][this.bH] & 0x8) == 0x0) {
                                                    while (true) {
                                                        switch (n29) {
                                                            case 1: {
                                                                i7 = this;
                                                                bl3 = 2;
                                                                break;
                                                            }
                                                            case 2: {
                                                                i7 = this;
                                                                bl3 = 1;
                                                                break;
                                                            }
                                                            case 4: {
                                                                i7 = this;
                                                                bl3 = 0;
                                                                break;
                                                            }
                                                            default: {
                                                                this.bN = i.b[this.bG][this.bH] * i.g[n29];
                                                                i8 = this;
                                                                bo2 = i.b[this.bG][this.bH] * i.g[n29 + 8];
                                                                break Label_3107;
                                                            }
                                                        }
                                                        i7.bL = bl3;
                                                        continue Label_3025_Outer;
                                                    }
                                                }
                                                while (true) {
                                                    switch (n29) {
                                                        case 1: {
                                                            i9 = this;
                                                            bk2 = 14;
                                                            break;
                                                        }
                                                        case 2: {
                                                            i9 = this;
                                                            bk2 = 13;
                                                            break;
                                                        }
                                                        case 4: {
                                                            i9 = this;
                                                            bk2 = 12;
                                                            break;
                                                        }
                                                        default: {
                                                            this.bL = a(i.b, this.bK, i.b[this.bG][this.bH]);
                                                            n30 = (i.b.a[this.bK] + this.bL) * 5;
                                                            this.bN = i.b.c[n30 + 2];
                                                            i8 = this;
                                                            bo2 = i.b.c[n30 + 3];
                                                            break Label_3107;
                                                        }
                                                    }
                                                    i9.bK = bk2;
                                                    continue;
                                                }
                                            }
                                            i8.bO = bo2;
                                            break Label_5612;
                                        }
                                        case 46: {
                                            i.b = i.a[29];
                                            this.bK = (i.b[this.bG][this.bH] & 0x1F);
                                            if (this.bK == 8 || this.bK == 9) {
                                                this.bL = 0;
                                                this.bN = i.b.c[i.b.a[this.bK] * 5 + 2];
                                                i10 = this;
                                                bo3 = (byte)(-i.b[this.bG][this.bH]);
                                            }
                                            else {
                                                a2 = a(i.b, this.bK, (i.b[this.bG][this.bH] & 0x1FE0) >> 5);
                                                this.bL = a2;
                                                n31 = (i.b.a[this.bK] + a2) * 5;
                                                this.bN = i.b.c[n31 + 2];
                                                i10 = this;
                                                bo3 = i.b.c[n31 + 3];
                                            }
                                            i10.bO = bo3;
                                            break Label_5612;
                                        }
                                        case 45: {
                                            n32 = i.b[this.bG][this.bH];
                                            i.b = i.a[28];
                                            this.bK = (n32 & 0xF);
                                            n33 = (i.b[this.bG][this.bH] & 0x1FE000) >> 13;
                                            if (this.bK == 10) {
                                                n34 = n33;
                                                bl4 = 0;
                                                a3 = i.b.a(this.bK);
                                                n35 = 0;
                                                while (true) {
                                                    n36 = n35;
                                                    if (n34 <= 0) {
                                                        break;
                                                    }
                                                    n34 -= i.b.a(this.bK, n36);
                                                    bl4 = n36;
                                                    n35 = (n36 + 1) % a3;
                                                }
                                                this.bL = bl4;
                                            }
                                            else {
                                                a4 = a(i.b, this.bK, n33);
                                                this.bL = a4;
                                                n37 = (i.b.a[this.bK] + a4) * 5;
                                                this.bN = i.b.c[n37 + 2];
                                                this.bO = i.b.c[n37 + 3];
                                            }
                                            this.F();
                                            break Label_5612;
                                        }
                                        case 44: {
                                            this.bK = (i.b[this.bG][this.bH] & 0x38) >> 3;
                                            i.b = i.a[27];
                                            Label_3699: {
                                                switch (this.bK) {
                                                    case 3: {
                                                        this.bL = 0;
                                                        this.bO = -i.b[this.bG][this.bH];
                                                        break Label_3699;
                                                    }
                                                    case 1: {
                                                        i11 = this;
                                                        bl5 = (i.b[this.bG][this.bH] >> 1) % i.a[27].a(1);
                                                        break;
                                                    }
                                                    default: {
                                                        i11 = this;
                                                        bl5 = i.b[this.bG][this.bH];
                                                        break;
                                                    }
                                                }
                                                i11.bL = bl5;
                                            }
                                            this.bL = 0;
                                            break Label_5612;
                                        }
                                        case 12: {
                                            bx = this.bx;
                                            by = this.by;
                                            n38 = bx;
                                            array = i.b[18];
                                            this.a.drawImage(array[1], n38 + 6, by, 0);
                                            this.a.drawImage(array[0], n38 + 3, by + 7, 0);
                                            n39 = 0;
                                            if (this.aa < 10) {
                                                n39 = i.a[0].a[0][0].getWidth() >> 1;
                                                ++n39;
                                            }
                                            a(this.a, n38 + 19 - n39, by + 13, this.aa, i.a[0].a[0], 0);
                                            break Label_5612;
                                        }
                                        case 36: {
                                            n40 = ((i.b[this.bG][this.bH] == 1) ? 1 : 0);
                                            f = i.a[5];
                                            f.a(this.a, n40, (i.aS >> 1) % f.a(n40), this.bx, this.by, 0, 0, 0);
                                            break Label_5612;
                                        }
                                        case 18: {
                                            i.b = i.a[6];
                                            this.bK = 0;
                                            if (this.ce == 0) {
                                                i12 = this;
                                                bl6 = 0;
                                            }
                                            else if (this.ce == 9) {
                                                i12 = this;
                                                bl6 = 2;
                                            }
                                            else {
                                                i12 = this;
                                                bl6 = ((this.cf < 0) ? 1 : 3);
                                            }
                                            i12.bL = bl6;
                                            break Label_5612;
                                        }
                                        case 34: {
                                            if (this.ce != 9 && this.ce >= 5) {
                                                this.aL = 14;
                                                this.aM = 0 + this.ce * 5 / 10;
                                            }
                                            break Label_5612;
                                        }
                                        case 35: {
                                            if (this.ce == 0 || this.ce > 5) {
                                                break Label_5612;
                                            }
                                            this.aL = 15;
                                            this.aM = 4 - this.ce * 5 / 10;
                                            if (this.aM < 0) {
                                                this.aM = 0;
                                            }
                                            break Label_5612;
                                        }
                                        case 28: {
                                            n41 = -1;
                                            n42 = 3;
                                            if (((n43 = i.b[this.bG][this.bH]) & 0x7) == 0x3) {
                                                n41 = 1;
                                                n42 = 0;
                                            }
                                            if ((n43 & 0x8) == 0x0) {
                                                n44 = this.aO;
                                                n45 = this.aN;
                                            }
                                            else {
                                                n44 = this.aQ;
                                                n45 = this.aP;
                                            }
                                            n46 = n45;
                                            for (int n47 = 0; n47 < n44; ++n47) {
                                                i.a[11].a(this.a, n42 + n47 * n41, this.bx + 3, this.by + n41 * (n46 - n47 * 24), 0);
                                            }
                                            if (n41 == 1) {
                                                f2 = i.a[42];
                                                graphics4 = this.a;
                                                n48 = i.a[this.bG][this.bH - 1] - 80;
                                                n49 = this.bx;
                                                n50 = this.by - 24;
                                            }
                                            else {
                                                f2 = i.a[42];
                                                graphics4 = this.a;
                                                n48 = i.a[this.bG][this.bH + 1] - 80;
                                                n49 = this.bx;
                                                n50 = this.by + 24;
                                            }
                                            f2.a(graphics4, n48, n49, n50, 0);
                                            break Label_5612;
                                        }
                                        case 16: {
                                            if (i.a[this.bG][this.bH + 1] != 16) {
                                                n51 = i.b[this.bG][this.bH];
                                                f3 = (i.b = i.a[1]);
                                                b4 = i.b[this.bG][this.bH];
                                                n52 = 36 - b4;
                                                bl7 = 0;
                                                this.bK = (((n51 & 0x7) == 0x4) ? 1 : 0);
                                                if (b4 != 0) {
                                                    for (short n53 = 0; n52 > 0; n52 -= f3.a(this.bK, n53), bl7 = n53, ++n53) {}
                                                }
                                                this.bL = bl7;
                                                this.bN = f3.c[(f3.a[this.bK] + bl7) * 5 + 2];
                                            }
                                            break Label_5612;
                                        }
                                        case 14: {
                                            as2 = i.aS;
                                            n54 = i.b[this.bG][this.bH];
                                            if ((b5 = i.b[this.bG][this.bH]) > 24) {
                                                b5 = 24;
                                            }
                                            n55 = (n54 & 0x7);
                                            this.bN = b5 * i.g[n55];
                                            this.bO = b5 * i.g[n55 + 8];
                                            if ((n54 & 0x8) == 0x0) {
                                                this.aL = 10;
                                                this.aM = (as2 >> 1) % 3;
                                                if (n55 != 3) {
                                                    n56 = (as2 >> 1) % 5;
                                                    this.a.drawImage(i.b[10][n56 + 3], this.bx + this.bN - (n56 << 2), this.by + (this.bO + 24), 36);
                                                }
                                            }
                                            else {
                                                this.aL = 10;
                                                this.aM = 2 - (as2 >> 1) % 3;
                                                if (n55 != 3) {
                                                    n57 = (as2 >> 1) % 5;
                                                    this.a.drawImage(i.b[10][n57 + 8], this.bx + 24 - 12 + this.bN + n57 * 3, this.by + (this.bO + 24), 36);
                                                    if ((as2 >> 1 & 0x1) == 0x0 && i.a[this.bG - 1][this.bH] >= 0) {
                                                        --this.bN;
                                                        ++this.bO;
                                                    }
                                                }
                                            }
                                            break Label_5612;
                                        }
                                        case 32: {
                                            this.a.setColor(13883367);
                                            b6 = i.b[this.bG][this.bH];
                                            if ((i.b[this.bG][this.bH] & 0x1) != 0x0) {
                                                bx2 = this.bx;
                                                n58 = this.bx + 24 - b6;
                                                i13 = this;
                                                bl8 = 0;
                                            }
                                            else {
                                                bx2 = this.bx + 24;
                                                n58 = this.bx + b6;
                                                i13 = this;
                                                bl8 = 1;
                                            }
                                            i13.bL = bl8;
                                            this.a.drawLine(bx2, this.by + 12, n58, this.by + 12);
                                            if (b6 > 0) {
                                                i.a[0].a.b(this.a, this.bL, n58, this.by + 12 - 2, 0);
                                            }
                                            break Label_5612;
                                        }
                                        case 11: {
                                            bg4 = this.bG;
                                            bh4 = this.bH;
                                            this.aL = 6;
                                            if ((n59 = (i.b[bg4][bh4] & 0xF00) >> 8) >= 4) {
                                                this.aL = -1;
                                                break Label_5612;
                                            }
                                            if (n59 == 0) {
                                                i14 = this;
                                                am = 0 + (i.aS >> 1) % 3;
                                            }
                                            else {
                                                i14 = this;
                                                am = n59 + 3 - 1;
                                            }
                                            i14.aM = am;
                                            n60 = (i.b[bg4][bh4] & 0x7);
                                            this.bN = i.b[bg4][bh4] * i.g[n60] + 2;
                                            this.bO = i.b[bg4][bh4] * i.g[n60 + 8] + 2;
                                            if ((i.b[bg4][bh4] & 0x10) == 0x0) {
                                                while (true) {
                                                    switch (n60) {
                                                        case 1: {
                                                            this.bN += 4;
                                                            break Label_5612;
                                                        }
                                                        case 2: {
                                                            i15 = this;
                                                            bo4 = this.bO + 4;
                                                            break;
                                                        }
                                                        case 3: {
                                                            this.bN -= 4;
                                                            break Label_5612;
                                                        }
                                                        case 4: {
                                                            i15 = this;
                                                            bo4 = this.bO - 4;
                                                            break;
                                                        }
                                                        default: {
                                                            break Label_5612;
                                                        }
                                                    }
                                                    i15.bO = bo4;
                                                    continue Label_5350_Outer;
                                                }
                                            }
                                            while (true) {
                                                switch (n60) {
                                                    case 1: {
                                                        this.bN -= 4;
                                                        break Label_5612;
                                                    }
                                                    case 2: {
                                                        i16 = this;
                                                        bo5 = this.bO - 4;
                                                        break;
                                                    }
                                                    case 3: {
                                                        this.bN += 4;
                                                        break Label_5612;
                                                    }
                                                    case 4: {
                                                        i16 = this;
                                                        bo5 = this.bO + 4;
                                                        break;
                                                    }
                                                    default: {
                                                        break Label_5612;
                                                    }
                                                }
                                                i16.bO = bo5;
                                                continue;
                                            }
                                        }
                                        case 30: {
                                            i.b = i.a[20];
                                            this.bK = 0;
                                            this.bL = 0 + (n23 - 1) * 7 / 16;
                                            break Label_5612;
                                        }
                                        case 37: {
                                            this.aL = 17;
                                            this.aM = 0 + (n23 - 1) * 3 / 8;
                                            break Label_5612;
                                        }
                                        case 23: {
                                            i.b = i.a[12];
                                            this.bL = 0;
                                            this.b((byte)23);
                                            break Label_5612;
                                        }
                                        case 22: {
                                            i.b = i.a[12];
                                            this.bL = 1;
                                            this.b((byte)22);
                                            break Label_5612;
                                        }
                                        case 43: {
                                            this.c((byte)this.bI);
                                            break Label_5612;
                                        }
                                        case 19: {
                                            this.c((byte)this.bI);
                                        }
                                        case 10: {
                                            break Label_5612;
                                        }
                                        case 47: {
                                            i17 = this;
                                            break;
                                        }
                                        case 9: {
                                            this.O();
                                            if ((i.b[this.bG][this.bH] & 0xFC00000) == 0x8400000) {
                                                this.bN += this.au;
                                                this.bO += this.av;
                                            }
                                            break Label_5612;
                                        }
                                        case 4: {}
                                        case 5: {}
                                        case 2: {
                                            break Label_5612;
                                        }
                                        case 1: {
                                            if ((i.b[this.bG][this.bH] & Integer.MIN_VALUE) != 0x0 || this.bR != 0) {
                                                i17 = this;
                                                break;
                                            }
                                            break Label_5612;
                                        }
                                        case 0: {
                                            if ((i.b[this.bG][this.bH] & Integer.MIN_VALUE) != 0x0) {
                                                break Label_5608;
                                            }
                                            break Label_5612;
                                        }
                                        case 6: {}
                                        case 7: {
                                            break Label_5612;
                                        }
                                        case 8: {
                                            i17 = this;
                                            break;
                                        }
                                    }
                                }
                                i17.O();
                            }
                        }
                        if (this.aL != -1) {
                            if (i.b[this.aL] == null) {
                                i.a[a(this.aL)].a(graphics3, this.aM, this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            else {
                                graphics3.drawImage(i.b[this.aL][this.aM], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.aL = -1;
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
                                i.b.a(graphics3, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, 0, 0, 0);
                                this.bK = -1;
                            }
                            else {
                                i.b.a(graphics3, this.bL, this.bx + this.bN, this.by + this.bO, 0);
                            }
                            i.b = null;
                            this.bM = 0;
                        }
                        n61 = 0;
                        this.bO = n61;
                        this.bN = n61;
                    }
                }
            }
        }
        if (i.a) {
            a.setColor(0);
            a.fillRect(0, 0, 240, 320);
            this.N();
            if (this.ad != this.ae) {
                int ad;
                int n62 = ad = this.ad;
                while (true) {
                    int n63 = ad;
                    if (n62 == this.ae) {
                        break;
                    }
                    final int n64 = i.a[n63 << 1] * 24 - this.a;
                    final int n65 = i.a[(n63 << 1) + 1] * 24 - this.b;
                    f f4;
                    Graphics graphics5;
                    int n66;
                    int a5;
                    if (i.c[n63] < 0) {
                        final f f5;
                        f4 = (f5 = i.a[2]);
                        graphics5 = a;
                        n66 = 0;
                        a5 = a(f5, 0, i.b[n63]);
                    }
                    else {
                        f4 = i.a[9];
                        graphics5 = a;
                        n66 = i.c[n63];
                        a5 = i.b[n63];
                    }
                    f4.a(graphics5, n66, a5, n64, n65, 0, 0, 0);
                    n62 = (ad = (++n63 & 0x7));
                }
            }
            this.a.setClip(0, 0, 240, 320);
            a.translate(0, -40);
            this.G();
            return;
        }
        this.N();
        if (this.l) {
            final int ck = this.cK;
            final int cl = this.cL;
            final int n67 = ck;
            final Graphics a6 = this.a;
            for (int n68 = 0; n68 < 12; ++n68) {
                for (int n69 = 0; n69 < 12; ++n69) {
                    final int n70 = n69 + this.a / 24;
                    final int n71 = n68 + this.b / 24;
                    if (n70 >= 0 && n70 < this.e && n71 >= 0 && n71 < this.f) {
                        final int n72 = i.e[n70][n71];
                        final int n73 = n69 * 24 - n67;
                        final int n74 = n68 * 24 - cl;
                        if (n72 > 0) {
                            int n75;
                            byte b7 = (byte)(n75 = 0);
                            while (true) {
                                byte b8 = (byte)n75;
                                if (b7 > 2) {
                                    break;
                                }
                                Label_6562: {
                                    if (a(n72, b8, (byte)0, (byte)3) != 0) {
                                        byte b9;
                                        if ((b9 = (byte)(a(n72, b8, (byte)7, (byte)2) << 3)) > 0) {
                                            b9 = ((a(a(n72, b8, (byte)0, (byte)3), (byte)45, (byte)2) <= 1) ? ((byte)(b9 - 24)) : ((byte)(24 - b9)));
                                            this.C();
                                            a6.clipRect(n73, n74 + (b8 << 3), 24, 8);
                                        }
                                        final int a7;
                                        final int n77;
                                        final int n76 = (((n77 = (a7 = a(n70, n71, n72, b8)) >> 1) == 7) ? (i.aS >> 3) : i.aS) & 0x1;
                                        if (n77 == 15) {
                                            i.d.a(a6, a7 + this.cB, n73 + b9 - 8, n74 + (b8 << 3) + 8, 36);
                                            ++this.cB;
                                            if (this.cB > 2) {
                                                this.cB = 0;
                                            }
                                        }
                                        else {
                                            f f6;
                                            Graphics graphics6;
                                            int n78;
                                            int n79;
                                            int n80;
                                            if (n77 == 14 || n77 == 11) {
                                                f6 = i.d;
                                                graphics6 = a6;
                                                n78 = a7 + n76;
                                                n79 = n73 + b9;
                                                n80 = n74;
                                            }
                                            else {
                                                if (n77 == 8 && b8 == 0 && i.e[n70][n71 - 1] > 0) {
                                                    i.d.a(a6, 33, n73 + b9, n74, 20);
                                                    b8 = 3;
                                                    break Label_6562;
                                                }
                                                f6 = i.d;
                                                graphics6 = a6;
                                                n78 = a7 + n76;
                                                n79 = n73 + b9;
                                                n80 = n74 + (b8 << 3);
                                            }
                                            f6.a(graphics6, n78, n79, n80, 20);
                                            this.C();
                                        }
                                    }
                                }
                                b7 = (byte)(n75 = (byte)(b8 + 1));
                            }
                        }
                    }
                }
            }
        }
        if (this.aw > 0) {
            this.E();
        }
        if (this.k != 0) {
            this.L();
        }
        for (int n81 = -1; n81 < 12; ++n81) {
            for (int n82 = -1; n82 < 12; ++n82) {
                final int n83 = n82 + this.cI;
                final int n84 = n81 + this.cJ;
                if (n83 >= 0 && n83 < this.e && n84 >= 0 && n84 < this.f) {
                    final int n85 = i.a[n83][n84] & 0xFF;
                    final byte b10 = i.a[n83][n84];
                    if (n85 < 38 || n85 >= 80) {
                        final int n86 = n82 * 24 - this.cK;
                        final int n87 = n81 * 24 - this.cL;
                        Label_7042: {
                            f f7;
                            Graphics graphics7;
                            int n89;
                            int n90;
                            if (n85 >= 20 && n85 < 26) {
                                final int n88 = n85 - 20;
                                f7 = i.a[3];
                                graphics7 = a;
                                n89 = n88;
                                n90 = (as >> 2) % (i.a[3].b[n88] & 0xFF);
                            }
                            else {
                                switch (n85) {
                                    case 36: {
                                        i.a[20].a(a, 0, (0 + ((i.a[n83][n84] >> 8) - 1) * 7) / 16, n86, n87, 0, 0, 0);
                                        break;
                                    }
                                    case 31: {
                                        final int n91 = i.a[n83][n84] >> 8;
                                        final f f8 = i.a[15];
                                        f8.a(this.a, n91, (i.aS >> 1) % (f8.b[n91] & 0xFF), n86, n87, 0, 0, 0);
                                        break;
                                    }
                                    case 32: {
                                        i.a[16].a(this.a, 0, i.a[n83][n84] >> 8 & 0xFF, n86, n87, 0, 0, 0);
                                        break;
                                    }
                                    default: {
                                        final byte b11;
                                        if ((b11 = (byte)(n85 - 80)) >= 0) {
                                            i.a[42].a(a, b11, n86, n87, 0);
                                            break;
                                        }
                                        break;
                                    }
                                }
                                final int n92;
                                if ((n92 = (i.a[n83][n84] & 0xF0000000) >> 28) <= 0) {
                                    break Label_7042;
                                }
                                f7 = i.a[13];
                                graphics7 = a;
                                n89 = 0;
                                n90 = n92;
                            }
                            f7.a(graphics7, n89, n90, n86, n87, 0, 0, 0);
                        }
                        if (b10 == 54) {
                            i.a[7].a(a, 0, a(i.a[7], 0, i.b[n83][n84]), n86, n87, 0, 0, 0);
                        }
                    }
                }
            }
        }
        if (this.A) {
            a.drawImage(i.a[13].a[0][0 + this.bD], (this.bB - this.cI) * 24 - this.cK + this.bz, (this.bC - this.cJ + 1) * 24 - this.cL + this.bA, 0);
            this.A = false;
        }
        if (this.aD != -1) {
            a.drawImage(i.b[13][0], this.bv - 12, this.bw - 24 + 2, 3);
            a.drawImage(i.b[this.aD][this.aE], this.bv - 12, this.bw - 24, 3);
        }
        if (this.ad != this.ae) {
            int ad2;
            int n93 = ad2 = this.ad;
            while (true) {
                int n94 = ad2;
                if (n93 == this.ae) {
                    break;
                }
                final int n95 = i.a[n94 << 1] * 24 - this.a;
                final int n96 = i.a[(n94 << 1) + 1] * 24 - this.b;
                f f9;
                Graphics graphics8;
                int n97;
                int a8;
                if (i.c[n94] < 0) {
                    final f f10;
                    f9 = (f10 = i.a[2]);
                    graphics8 = a;
                    n97 = 0;
                    a8 = a(f10, 0, i.b[n94]);
                }
                else {
                    f9 = i.a[9];
                    graphics8 = a;
                    n97 = i.c[n94];
                    a8 = i.b[n94];
                }
                f9.a(graphics8, n97, a8, n95, n96, 0, 0, 0);
                n93 = (ad2 = (++n94 & 0x7));
            }
        }
        this.b += this.bk;
        if (this.x) {
            a(a, i.b, i.a[15], 120, 160, 17, 19, false);
        }
        if (this.bn > i.aS && this.k != 2) {
            if (!this.aj && !this.h) {
                final int n99;
                final int n98 = ((n99 = this.bn - i.aS) < 20) ? ((n99 - 10) * 240 / 20) : ((n99 >= 50) ? ((60 - n99) * 240 / 15) : 120);
                final int n100 = 240 - n98;
                a(a, i.b, i.a[i.d[this.aA]], n98, 15, 17, 20, false);
                a(a, i.b, i.c[i.g[this.aA][this.aB] - 1], n100, 50, 17, 20, false);
            }
        }
        else if (this.ak > i.aS) {
            a(a, i.b, i.a[13], 120, a.c, 17, 20, false);
        }
        else if (this.ak == i.aS && this.r <= 2) {
            ++this.r;
            this.w();
        }
        Label_7755: {
            i i18 = null;
            Graphics graphics9 = null;
            int n101 = 0;
            switch (this.k) {
                case 4: {
                    this.M();
                    break Label_7755;
                }
                case 3: {
                    if (this.ao != -1 && this.ao != 15) {
                        i18 = this;
                        graphics9 = a;
                        n101 = 5;
                        break;
                    }
                    break Label_7755;
                }
                case 5: {
                    if (this.ao != -1 && this.ao != 15 && this.ao != 13 && this.ao != 12) {
                        i18 = this;
                        graphics9 = a;
                        n101 = 4;
                        break;
                    }
                    break Label_7755;
                }
            }
            i18.a(graphics9, n101);
        }
        a.translate(0, -40);
        a.setClip(0, 0, 240, 320);
        if (this.a == null) {
            this.G();
        }
        if (this.e != null) {
            this.o = true;
            a(a, i.a, a(this.e), 120, 223, 17, 4, true);
        }
        if (this.a != null && !i.a) {
            this.o = true;
            this.a.a(a);
        }
        if (this.bl > 0) {
            this.o = true;
            a.setColor(0);
            a.fillRect(0, 0, 240, this.bl);
            a.fillRect(0, 320 - this.bl, 240, this.bl);
            a.translate(0, 40);
            this.N();
            if (i.c != null) {
                if (this.ct != -1) {
                    i.c.a(a, this.ct, this.cs, (this.co - this.cI) * 24 - this.cK, (this.cp - this.cJ) * 24 - this.cL, 0, 0, 0);
                }
                else {
                    i.c.a(a, this.cs, this.cr, this.cq, 0);
                }
            }
            a.translate(0, -40);
        }
    }
    
    private void E() {
        final int n = this.b - 24;
        final int n2 = this.b + 320;
        final int a = this.a;
        final int n3 = this.a + 240;
        final int n4 = (i.aS >> 1) % i.a[2].a(1);
        for (int i = 0; i < i.e.length; i += 3) {
            int n5 = 0;
            final byte b;
            final int n6;
            if ((n6 = (b = i.e[i + 2]) * 24) > n && n6 < n2) {
                final byte b2 = i.e[i];
                final byte b3 = i.e[i + 1];
                final int n7 = b2 * 24;
                final int n8 = b3 * 24 + 24;
                if ((n7 >= a && n7 <= n3) || (n8 >= a && n8 <= n3) || (n7 <= a && n8 >= n3)) {
                    int n9 = n7 - a;
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
                    int n11 = n8 - a;
                    final byte b5;
                    final int n12 = b5 + (((b5 = b3) < this.e - 1) ? 1 : 0);
                    boolean b6 = true;
                    if (i.a[n12][b] == 48 && (i.b[n12][b] & 0x8) != 0x0) {
                        n11 += 12;
                        b6 = false;
                        if ((i.b[n12][b + 1] & 0x7) == 0x3) {
                            n5 = -i.b[n12][b + 1];
                        }
                        else {
                            n11 -= i.b[n12][b + 1];
                        }
                    }
                    int n13 = n6 - this.b + 10 + n5;
                    this.a.setColor(1820159);
                    this.a.drawLine(n9, n13, n11, n13);
                    n13 += 2;
                    this.a.drawLine(n9, n13, n11, n13);
                    --n13;
                    this.a.setColor(14153215);
                    this.a.drawLine(n9, n13, n11, n13);
                    f f;
                    Graphics graphics;
                    int n14;
                    int n15;
                    byte b7;
                    int n16;
                    int n17;
                    if (b4) {
                        f = i.a[2];
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
                        f = i.a[2];
                        graphics = this.a;
                        n14 = 1;
                        n15 = n4;
                        b7 = (byte)n11;
                        n16 = n13;
                        n17 = 0;
                    }
                    f.a(graphics, n14, n15, b7, n16, n17, 0, 0);
                }
            }
        }
    }
    
    private void F() {
        if ((i.b[this.bG][this.bH] & 0x7) == 0x1 && (i.a[this.bG][this.bH] & 0xFF) == 0x23) {
            this.bN = 0;
            this.bO = i.b[this.bG][this.bH];
        }
    }
    
    private void G() {
        boolean b = false;
        final Graphics a = this.a;
        final f f;
        if ((f = i.a[0]) == null) {
            return;
        }
        a.translate(120, 320);
        f f2;
        if (this.o || i.b == 2) {
            f.a(a, 0, 0, 0, 0);
            if (this.U) {
                f.a(a, 19, 0, 0, 0);
            }
            f2 = f;
        }
        else {
            b = true;
            a.setClip(-120, -320, 240, 320);
            f2 = f;
        }
        f2.a(a, 1, 0, 0, 0);
        if (this.p) {
            f.a(a, 2, 2, 0, 0);
            f.a(a, 3 + this.an, 2, 0, 0);
        }
        if (b) {
            a.setClip(-120, -320, 240, 320);
        }
        if (this.n != this.cP || this.o || this.n <= 1) {
            final Image[] array = i.a[0].a[0];
            final int n = (this.n <= 1) ? 1 : 0;
            final int n2 = -33 - (i.i[8] - 4) * array[n + 11].getWidth() / 2;
            a.drawImage(array[n + 11], n2, -29, 0);
            int n3 = 0 + array[n + 11].getWidth();
            final int width = array[15].getWidth();
            for (byte b2 = 0; b2 < i.i[8]; ++b2) {
                Graphics graphics;
                Image[] array2;
                int n4;
                if ((this.n <= 1 && b2 == 0 && (i.aS >> 2 & 0x1) == 0x0) || (b2 < this.n && this.n > 1)) {
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
            a.drawImage(array[n + 17], n2 + n3, -29, 0);
            this.cP = this.n;
        }
        if (this.cQ != this.aZ || this.cT != this.aa || this.o) {
            a(a, 70, -12, this.aZ, i.a[0].a[0], 0);
        }
        if (this.cR != this.bb || this.o) {
            this.cR = this.bb;
            a(a, 107, -12, this.bb, i.a[0].a[0], 0);
        }
        a.translate(-120, -320);
        a.translate(120, 0);
        int n5 = 0;
        if (this.o || i.b == 2) {
            f.a(a, 20, 0, 0, 0);
            n5 = 1;
        }
        if (this.cU != this.aU || this.cV != this.aV || this.o || i.b == 2 || n5 != 0) {
            if (n5 == 0) {
                f.a(a, 20, 0, 0, 0);
                n5 = 1;
            }
            a(a, 47, 18, this.aU, i.a[0].a[0], 0);
            a(a, 87, 18, this.aV, i.a[0].a[0], 0);
            this.cU = this.aU;
            this.cV = this.aV;
        }
        if (this.cS != this.az || this.o || n5 != 0) {
            if (n5 == 0) {
                f.a(a, 20, 0, 0, 0);
            }
            a(a, -29, 18, this.az, i.a[0].a[0], 0);
            this.cS = this.az;
        }
        a.translate(-120, 0);
        this.cQ = this.aZ;
        this.cT = this.aa;
        this.o = false;
    }
    
    private void b(final byte b) {
        final b b2 = i.a[4];
        if (b == 23) {
            b2.a = this.bx;
            final b b3 = b2;
            b3.c |= 0x1;
        }
        else {
            b2.c &= 0xFFFFFFFE;
            b2.a = this.bx + 24;
        }
        b2.b = this.by;
        b2.a();
        b2.a(this.a);
    }
    
    private void f(final int n) {
        for (int i = n - 8 - 1; i < n + 15 - 2; ++i) {
            i.a[18].a(this.a, 4, i % 2, i, 0);
        }
        this.a.setColor(16777215);
        this.a.drawLine(0, n - 8 - 1 - 1, 240, n - 8 - 1 - 1);
        this.a.drawLine(0, n + 15 - 1, 240, n + 15 - 1);
        this.a.setColor(0);
        this.a.drawLine(0, n - 8 - 1 - 2, 240, n - 8 - 1 - 2);
        this.a.drawLine(0, n + 15 - 2, 240, n + 15 - 2);
    }
    
    private void H() {
        if (this.Y) {
            this.Y = false;
            this.X = b();
        }
        int n = 320 - ((this.cX + 1) * a.d + 1 + 2) + ((!this.X && this.bo == 0) ? a.d : 0);
        int n2 = 320 - a.d + 1 + 1;
        this.a.setClip(0, 0, 240, 320);
        if (i.b == 2 && i.V && i.W) {
            this.U = false;
            this.D();
            this.U = true;
            i.W = false;
        }
        if (i.b == 7 || i.b == 2) {
            final int n3 = n - (160 - (n2 - n) / 2);
            n -= n3;
            n2 -= n3;
        }
        if (this.bo == 7) {
            this.f(n - 22);
            i.b.b(this.a, i.a[(this.aR == 5) ? 23 : 2], 120, n - 20, 17);
        }
        if (i.b == 7) {
            Graphics graphics;
            int n5;
            int n6;
            int n7;
            int n8;
            if (this.dc != -1 && !i.V) {
                final int n4 = n + this.dc * a.d;
                this.a.setColor(0);
                graphics = this.a;
                n5 = 0;
                n6 = n4;
                n7 = 240;
                n8 = a.d + 1;
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
        if (this.db >= 0 && currentTimeMillis - this.g > 100L) {
            ++this.db;
            this.g = currentTimeMillis;
        }
        if (this.dc != -1 && !i.V) {
            this.a.setClip(0, n + this.dc * a.d - ((this.bo == 0 && this.dc > 0 && !this.X) ? a.d : 0), 240, a.d + 1);
        }
        if (this.dc != this.bq || i.V) {
            final int n9 = n;
            final int n10 = n2;
            final int n11 = n9;
            if (i.b == 4) {
                b(this.a, false);
                for (int i = n11 - 1; i < n10 - 2; ++i) {
                    i.a[18].a(this.a, 4, i % 2, i, 0);
                }
            }
            if (i.b == 2) {
                this.a.setColor(0);
                this.a.fillRect(0, n11 - 1, 240, n10 - 2 - (n11 - 1));
            }
            this.a.setColor(16777215);
            this.a.drawLine(0, n11 - 1 - 1, 240, n11 - 1 - 1);
            this.a.drawLine(0, n10 - 1, 240, n10 - 1);
            this.a.setColor(0);
            this.a.drawLine(0, n11 - 1 - 2, 240, n11 - 1 - 2);
            this.a.drawLine(0, n10 - 2, 240, n10 - 2);
        }
        if (!this.X && i.b == 4 && this.bq == 0 && this.aR != 5 && this.bo != 8) {
            this.bq = 1;
        }
        for (int j = 0; j < this.cX; ++j) {
            if ((this.dc == -1 || j == this.dc || j == this.bq || i.V) && (this.bo != 0 || j != 0 || this.X)) {
                int n12 = n + j * a.d + a.d / 2;
                if (this.bo == 0 && j > 0 && !this.X) {
                    n12 -= a.d;
                }
                int n13 = 16777215;
                if (j == 2 && this.bo == 0 && a()) {
                    n13 = 16711680;
                }
                if (j == 0 && this.bo == 8 && a()) {
                    n13 = 16711680;
                }
                Label_0925: {
                    Graphics graphics2 = null;
                    int n14 = 0;
                    int n15 = 0;
                    int n16 = 0;
                    int n17 = 0;
                    Label_0922: {
                        Graphics graphics3;
                        int color;
                        if (this.k == 2 && j == 3 && this.bo == 1) {
                            n13 = 16777215;
                            if (j != this.bq) {
                                this.a.setColor(13421772);
                                graphics2 = this.a;
                                n14 = 0;
                                n15 = n12 - a.d / 2 + 1;
                                n16 = 240;
                                n17 = a.d - 1;
                                break Label_0922;
                            }
                            graphics3 = this.a;
                            color = 6710886;
                        }
                        else {
                            if (j != this.bq) {
                                break Label_0925;
                            }
                            graphics3 = this.a;
                            color = 13540096;
                        }
                        graphics3.setColor(color);
                        graphics2 = this.a;
                        n14 = 0;
                        n15 = n12 - a.d / 2;
                        n16 = 240;
                        n17 = a.d + 1;
                    }
                    graphics2.fillRect(n14, n15, n16, n17);
                }
                i.b.a(i.a[i.a[this.bo][(j << 1) + 1]]);
                final int a = h.a;
                if ((j != 2 || this.bo != 0 || !a()) && j == 0 && this.bo == 8) {
                    a();
                }
                h.a(n13);
                i.b.a(this.a, i.a[i.a[this.bo][(j << 1) + 1]], 120 - a / 2, n12 + 1, n13, 6);
                if (j == this.bq) {
                    this.a.setColor(16777215);
                    i.a[18].a(this.a, 2, 120 - a / 2 - 8, n12, 0);
                    i.a[18].a(this.a, 2, 120 + a / 2 + 8, n12, 0);
                }
            }
        }
        this.dc = this.bq;
        ++this.cW;
        i k;
        int da;
        if (this.da < 0) {
            k = this;
            da = 3;
        }
        else {
            k = this;
            da = this.da - 1;
        }
        k.da = da;
        if (this.da == 0 && this.cZ + 1 < this.cX) {
            ++this.cZ;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.bo != 0 && this.bo != 3 && this.bo != 1 && this.bo != 7 && this.bo != 8) {
            this.I();
        }
        this.J();
        i.V = false;
        Label_2264: {
            if (this.db == 2) {
                if (i.b == 2) {
                    i.V = true;
                    i.W = true;
                }
                this.db = -1;
                this.o = true;
                this.dc = -1;
                h.a(16777215);
                this.z = true;
                switch (this.bo) {
                    case 0: {
                        switch (this.a()) {
                            case 0: {
                                this.a.e();
                                this.t();
                                if (i.i != null && b()) {
                                    this.ag = 0;
                                    this.M = true;
                                    this.p = true;
                                    this.bs = 0;
                                    i.b = 28;
                                    break Label_2264;
                                }
                            }
                            case 1: {
                                this.a.e();
                                if (!b()) {
                                    this.Q();
                                    break Label_2264;
                                }
                                this.Q = true;
                                this.D = false;
                                i.b = 31;
                                break Label_2264;
                            }
                            case 5: {
                                this.a(7);
                                this.aR = 5;
                                break Label_2264;
                            }
                            case 6: {
                                this.k();
                                break Label_2264;
                            }
                            case 2: {
                                this.a(5);
                                this.a.e();
                                break Label_2264;
                            }
                            case 4: {
                                i.b = 22;
                                this.aR = 0;
                                this.a.e();
                                break Label_2264;
                            }
                            case 3: {
                                i.b = 33;
                                this.a.e();
                                this.av = true;
                                break Label_2264;
                            }
                            default: {
                                this.z = false;
                                return;
                            }
                        }
                        break;
                    }
                    case 3: {
                        this.aR = 0;
                        for (int l = 0; l < i.a[5].length; l += 2) {
                            if (0 == i.a[5][l]) {
                                i.a[5][l + 1] = 0;
                                break Label_2264;
                            }
                        }
                        return;
                    }
                    case 7: {
                        Label_1781: {
                            switch (this.a()) {
                                case 0: {
                                    if (this.bp == 0) {
                                        i.b = 4;
                                    }
                                    this.a(this.bp);
                                    break;
                                }
                                case 1: {
                                    switch (this.aR) {
                                        case 1: {
                                            this.l();
                                            break Label_1781;
                                        }
                                        case 3: {
                                            i.b = 15;
                                            this.J = true;
                                            this.H = true;
                                            this.av();
                                            break Label_1781;
                                        }
                                        case 4: {
                                            this.p();
                                            i.b = 9;
                                            this.br = 8;
                                            this.a(-1);
                                            this.bs = 0;
                                            break Label_1781;
                                        }
                                        case 5: {
                                            i.b = 3;
                                            break Label_1781;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        this.aR = -1;
                        return;
                    }
                    case 2: {
                        switch (this.a()) {
                            case 0: {
                                this.a.e();
                                this.aA = 0;
                                this.l = false;
                                i.b = 15;
                                i.dZ = b(this.aA);
                                this.H = true;
                                this.av();
                                break Label_2264;
                            }
                            case 1: {
                                this.a.e();
                                this.aA = 1;
                                this.aB = 0;
                                i.b = 15;
                                i.dZ = b(this.aA);
                                this.H = true;
                                this.av();
                                this.p = true;
                                this.l = false;
                                if (i.i[9] < 1) {
                                    i.i[9] = 1;
                                    break Label_2264;
                                }
                                break;
                            }
                            case 2: {
                                this.a.e();
                                this.aA = 2;
                                this.aB = 0;
                                this.l = false;
                                i.b = 15;
                                i.dZ = b(this.aA);
                                this.H = true;
                                this.av();
                                this.p = true;
                                if (i.i[9] < 2) {
                                    i.i[9] = 2;
                                }
                                if (i.i[8] < 8) {
                                    i.i[8] = 8;
                                    break Label_2264;
                                }
                                break;
                            }
                            case 3: {
                                this.a(4);
                                break Label_2264;
                            }
                            default: {
                                i.b = 3;
                                this.a.d();
                                i.a.a();
                                break;
                            }
                        }
                        return;
                    }
                    case 1: {
                        switch (this.a()) {
                            case 1: {
                                this.a(7);
                                this.aR = 1;
                                break Label_2264;
                            }
                            case 0: {
                                i.b = 1;
                                i.f = null;
                                break Label_2264;
                            }
                            case 3: {
                                if (this.aB != 13 || this.aA != 0) {
                                    this.a(7);
                                    this.aR = 3;
                                    break Label_2264;
                                }
                                break;
                            }
                            case 4: {
                                this.a(7);
                                this.aR = 4;
                                break Label_2264;
                            }
                            case 5: {
                                this.a(7);
                                this.aR = 5;
                                break Label_2264;
                            }
                            case 2: {
                                this.a(5);
                                break Label_2264;
                            }
                            case 6: {
                                i.b = 33;
                                this.av = true;
                                break Label_2264;
                            }
                            default: {
                                this.z = false;
                                break;
                            }
                        }
                        return;
                    }
                    case 5: {
                        return;
                    }
                    case 8: {
                        switch (this.a()) {
                            case 0: {
                                this.k();
                                break;
                            }
                            case 1: {
                                i.b = 3;
                                break;
                            }
                        }
                        this.aR = -1;
                        break;
                    }
                }
            }
        }
    }
    
    private void I() {
        i.a[18].a(this.a, 0, 223, 308, 0);
    }
    
    private void J() {
        i.a[18].a(this.a, 3, 2, 308, 0);
    }
    
    private void K() {
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
        h.a(16777215);
        i.b.b(this.a, i.a[35], 120, a.e, 1);
    }
    
    private void L() {
        switch (this.k) {
            case 2: {
                if (this.t && this.a == null && this.bm == -1) {
                    i.a[15].a(this.a, 0, i.aS >> 1 & 0x3, this.bv, this.bw - 24, 0, 0, 0);
                }
                if (this.a + 240 > 1440 && this.b + 320 > 48) {
                    if (i.a[10] == null) {
                        i.a[10] = a("/mmv.f", 0, 0, 0);
                    }
                    final f f = i.a[10];
                    if (this.c(60, 3) || this.c(61, 3)) {
                        f.a(this.a, 1, 1440 - this.a, 48 - this.b, 0);
                    }
                }
                if (this.h > 55 && this.e) {
                    i.a[0].a(this.a);
                }
            }
            case 1: {
                final int as = i.aS;
                final b b = i.a[2];
                if (this.b + this.bk < 1008 && this.b + this.bk > 592) {
                    b.a = 240 - this.a;
                    b.b = 1008 - this.b;
                    b.a();
                    b.a(this.a);
                    b.a = 336 - this.a;
                    b.b = 1008 - this.b;
                    b.a();
                    b.c = 1;
                    b.a(this.a);
                }
                if (this.bj > 10) {
                    for (int i = 3; i < 13; i += 2) {
                        final int n;
                        this.a.drawImage(i.b[27][i & 0x1], ((n = 10 * (i * 2 / 5 + 1)) + i.aS / n) * i % 240, 320 / n * i.aS % 320, 0);
                    }
                }
                final int b2 = this.f * 24 - this.al - this.b;
                final int n2;
                int j = n2 = 168 - this.a;
                final int n3 = j + 240;
                while (j <= -24) {
                    j += 24;
                }
                final b b3 = i.a[1];
                if ((this.al >= 816 || b3.d == 2) && this.al > 816) {
                    for (int k = b2 + 20; k < 320; k += 24) {
                        for (int l = j; l < n3; l += 24) {
                            b3.a.a(this.a, 1, ((as >> 1) + l + k) % 2, l, k, 0, 0, 0);
                        }
                    }
                }
                if (b.d == 2) {
                    b3.c = 0;
                    b3.a = n2 + 120;
                    b3.b = b2;
                    b3.a();
                    b3.a(this.a);
                    b3.c = 1;
                    b3.a(this.a);
                    final Graphics a = this.a;
                    final int n4 = (i.aS << 3) % 160;
                    a.setColor(255, ((i.aS / 160 & 0x1) == 0x0) ? (160 - n4) : (n4 + 0), 0);
                    a.drawRect(0, 0, 239, 319);
                }
            }
            case 3: {
                if (this.k == 3 && i.aS >= this.k + 80L) {
                    for (int n5 = 14; n5 <= 21; ++n5) {
                        i.b[n5][15] = 0;
                        i.a[n5][15] = -1;
                        i.a[n5][15] = 44;
                        i.b[n5][15] = 0;
                        i.c[n5][15] = 24;
                    }
                    this.k = 0L;
                }
                if (this.ao != 15) {
                    if (this.a + 240 + 48 >= this.as && this.b + 320 + 48 >= 504) {
                        final b b4;
                        (b4 = i.a[5]).a = this.as - this.a;
                        b4.b = 504 - this.b;
                        b4.a();
                        b4.a(this.a);
                    }
                    if (this.ao == 12) {
                        final int n6 = this.as - this.a + i.aS * this.ap % 48;
                        final int n7 = i.a[5].b + 24;
                        i.a[7].a(this.a, 0, i.aS % i.a[7].a(0), n6, n7, 0, 0, 0);
                        this.f(n6, n7);
                    }
                }
            }
            case 4: {
                final Graphics a2 = this.a;
                final b b5 = i.a[5];
                final b b6 = i.a[4];
                int n8 = 0;
                Label_1183: {
                    int ap = 0;
                    switch (this.ao) {
                        case 1: {
                            ap = this.ap;
                            break;
                        }
                        case 2:
                        case 7: {
                            ap = 40;
                            break;
                        }
                        case 3: {
                            ap = 40;
                            break;
                        }
                        case 4: {
                            ap = 40 - (this.ap << 1 << 1);
                            break;
                        }
                        case 5: {
                            n8 = 15 + this.ap * 18;
                            this.Z = false;
                            break Label_1183;
                        }
                        case 9: {
                            ap = 15 + this.ap * 18;
                            break;
                        }
                        case 10: {
                            ap = 15 + this.ap * 18;
                            break;
                        }
                        case 11: {
                            ap = 15 + this.ap * 18;
                            break;
                        }
                        default: {
                            ap = -1000;
                            break;
                        }
                    }
                    n8 = ap;
                }
                b5.a = (10 + this.ar * (2 + ((this.ar > 0) ? 1 : 0))) * 24 - this.a;
                Label_1275: {
                    b b8;
                    int b9;
                    if (this.ao == 5) {
                        final int b7 = b5.b;
                        b5.b = 256 - this.b - 15;
                        if (this.e() != 3) {
                            break Label_1275;
                        }
                        b8 = b5;
                        b9 = b7;
                    }
                    else {
                        b8 = b5;
                        b9 = 256 - n8 - this.b;
                    }
                    b8.b = b9;
                }
                b5.a(a2);
                if (this.k) {
                    b6.b = 96 - this.b;
                    b6.a = (this.d() + 1) * 24 - this.a;
                    b6.a(a2);
                }
                for (int n9 = 0; n9 < 3; ++n9) {
                    final int n10;
                    if ((n10 = (n9 * (2 + ((n9 > 0) ? 1 : 0)) + 10) * 24 - this.a) < 240 && n10 > -48 && this.b > -80) {
                        i.a[40].a(a2, 1, n10, 216 - this.b, 0);
                    }
                }
            }
            case 5: {
                if (this.ao == -1) {
                    break;
                }
                final b b10;
                (b10 = i.a[5]).a = this.at - this.a;
                b10.b = 504 - this.b;
                b10.a();
                b10.a(this.a);
                if (this.ao == 12) {
                    final int n11 = this.at - this.a + i.aS * this.ap % 48;
                    final int n12 = i.a[5].b + 24;
                    i.a[7].a(this.a, 0, i.aS % i.a[7].a(1), n11, n12, 0, 0, 0);
                    this.f(n11, n12);
                    break;
                }
                break;
            }
        }
    }
    
    private void M() {
        final Graphics a = this.a;
        final b b = i.a[5];
        if (this.ao == 7) {
            final int n = b.a + i.aS * this.ap % 48;
            int b2 = b.b;
            if (this.S == 10) {
                b2 -= 144;
            }
            i.a[7].a(a, 1, i.aS % i.a[7].a(1), n, b2, 0, 0, 0);
            this.f(n, b2);
            return;
        }
        if (this.ao != 8 && this.ao != 0) {
            this.a(a, 3);
        }
    }
    
    private void a(final Graphics graphics, int i) {
        i = i * 14 + 2;
        final int n = 240 - i >> 1;
        if (this.aq > 0) {
            graphics.setColor(0);
            graphics.fillRect(n, 5, i, 12);
            graphics.setColor(3913615);
            for (i = 0; i < this.aq; ++i) {
                graphics.fillRect(n + 2 + i * 14, 7, 12, 8);
            }
        }
    }
    
    private void N() {
        if (this.E) {
            return;
        }
        final int h = this.h;
        final int i = this.i;
        final int as = i.aS;
        final int n = this.k & 0x7;
        final b b = i.a[((this.k & 0x4000) == 0x0) ? 0 : 3];
        final boolean c = this.c();
        final int n2 = ((this.k & 0x800) == 0x0) ? this.bQ : (this.k & 0x7);
        if (!this.e) {
            return;
        }
        this.bv = h * 24 + i.g[n2] * this.j - this.a;
        this.bw = i * 24 + i.g[n2 + 8] * this.j - this.b;
        if ((this.b <= 0L || (as >> 1 & 0x1) == 0x0) && this.aT <= 0) {
            b.a = this.bv;
            b.b = this.bw;
            if (i.e != null && c && n != 1 && n != 3 && i.e[h][i + 1] != 0 && i(h, i + 1)) {
                final int n4;
                int n3 = (n4 = (as >> 1) + h) % 4;
                if ((n4 / 4 & 0x1) == 0x1) {
                    n3 = 4 - n3;
                }
                final b b2 = b;
                b2.b += n3;
            }
            b.a();
            b.a(this.a);
            final int d;
            i.a = ((d = b.d) == 47 && b.e == 0);
            switch (d) {
                case 40:
                case 47:
                case 48: {
                    if (b.e <= ((d == 40) ? 13 : 6)) {
                        if (d != 47) {
                            break;
                        }
                    }
                    try {
                        int n5 = 0;
                        if (this.aF == 30 || this.aF == 31 || this.aF == 32) {
                            n5 = -2;
                        }
                        if (i.b[this.aF] == null) {
                            i.a[a(this.aF)].a(this.a, this.aG, b.a + n5, b.b - 24, 0);
                        }
                        else {
                            this.a.drawImage(i.b[this.aF][this.aG], b.a + n5, b.b - 24, 0);
                        }
                    }
                    catch (Exception x) {
                        System.out.println(x);
                    }
                    if (this.aH > 0) {
                        a(this.a, b.a + 24, b.b - 10, this.aH, i.a[0].a[0], 0);
                        break;
                    }
                    break;
                }
                case 17:
                case 18: {
                    if (b.e == 0) {
                        this.a.drawImage(i.b[this.aF][this.aG], b.a, b.b - 12, 0);
                        break;
                    }
                    break;
                }
            }
        }
        if (c && i.a[h][i] == 0) {
            final int n6 = i.b[h][i] & 0x7;
            final byte b3 = i.b[h][i];
            try {
                i.a[a(1)].a(this.a, 0 + (i.b[h][i] & 0x38), h * 24 - this.a + i.g[n6] * b3, i * 24 - this.b + i.g[n6 + 8] * b3, 0);
            }
            catch (Exception ex) {}
        }
    }
    
    private void O() {
        final int bg = this.bG;
        final int bh;
        final int n = (bh = this.bH) + 1;
        this.bz = 0;
        this.bA = 0;
        this.A = false;
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
                this.bL = a(i.b, 0, i.aS % a(i.b, 0));
                break;
            }
            case 8: {
                this.aL = 16;
                this.aM = 0 + (i.aS >> 1 & 0x1);
                break;
            }
            case 5: {
                this.aL = 25;
                this.aM = 0 + this.bR;
                break;
            }
            case 6: {
                this.aL = 5;
                this.aM = 0;
                break;
            }
            case 7: {
                this.aL = 5;
                this.aM = 1;
                break;
            }
            case 9: {
                i.b = i.a[(n3 & 0xFC00000) >> 22];
                this.bL = 0;
                break;
            }
            case 4: {
                this.aL = 24;
                this.aM = 0 + this.bR;
                break;
            }
            case 0: {
                final int n4 = (n3 & 0x38) >> 3;
                int bn = (n3 & 0x7000) >> 12;
                final boolean b3 = (n3 & 0x10000) == 0x0;
                if (!b2 && n2 == 0 && i(bg, n)) {
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
                this.aL = 1;
                this.aM = n4 + 0;
                break;
            }
            case 1: {
                this.aL = 2;
                this.aM = 0 + this.bR;
                break;
            }
            case 2: {
                final int n6 = i.a[this.bG][this.bH] & 0xFF;
                final int n7 = i.a[this.bG][this.bH] >> 8;
                if ((n6 != 14 && n6 != 33) || n7 > 11) {
                    this.aL = 3;
                    this.aM = 0 + this.bR;
                    i i;
                    f[] array;
                    int n8;
                    if (n6 == 14) {
                        i = this;
                        array = i.a;
                        n8 = 8;
                    }
                    else {
                        if (n6 != 33) {
                            break;
                        }
                        i = this;
                        array = i.a;
                        n8 = 22;
                    }
                    i.bO = -(array[n8].a(0) - n7);
                    break;
                }
                break;
            }
        }
        if (b2 || (i.e != null && i.e[bg][n] != 0 && i(bg, n))) {
            final int n10;
            int n9 = (n10 = (i.aS >> 1) + bg) % 4;
            if ((n10 / 4 & 0x1) == 0x1) {
                n9 = 4 - n9;
            }
            this.bO += n9;
        }
        if (((n3 & 0x200) != 0x0 || (i.a[bg - i.g[n2]][n] < 0 && i(bg, n) && (i.b[bg][n] & 0x7) == 0x0 && bg != this.bg && bh != this.bh)) && (this.k & 0x8) == 0x0) {
            this.bO += b * b / 24;
            if (this.bI != 9) {
                this.bN += -1 + i.aS % 3;
            }
        }
        if ((n3 & 0x200) != 0x0) {
            this.bN = -this.bN;
        }
        if (this.bI == 0) {
            this.bD = ((n3 & 0x1C0) >> 6) - 1;
            if (this.bD >= 0 && this.bD < 5) {
                this.A = true;
                i j = null;
                int bz = 0;
                switch (n3 & 0x7) {
                    case 4: {
                        j = this;
                        bz = 24;
                        break;
                    }
                    case 2: {
                        j = this;
                        bz = -24;
                        break;
                    }
                    default: {
                        j = this;
                        bz = 0;
                        break;
                    }
                }
                j.bz = bz;
                this.bA = 13;
                this.bB = this.bG;
                this.bC = this.bH - 1;
            }
        }
        this.F();
    }
    
    private void c(final byte b) {
        final int n = i.b[this.bG][this.bH];
        final byte b2 = i.b[this.bG][this.bH];
        final int n2 = n & 0x7;
        this.bN = b2 * i.g[n2];
        this.bO = b2 * i.g[n2 + 8];
        i.b = i.a[(b == 19) ? 4 : 21];
        i j = null;
        int as = 0;
        f f = null;
        int bk3 = 0;
        Label_0188: {
            if (this.aA == 1) {
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
                as = i.aS;
                f = i.b;
            }
            else {
                Label_0164: {
                    i k;
                    int bk2;
                    if ((n & 0xF8) >> 3 > 0) {
                        k = this;
                        bk2 = 4;
                    }
                    else {
                        this.bK = n2 - 1;
                        if (this.bK >= 0) {
                            break Label_0164;
                        }
                        k = this;
                        bk2 = ((n & 0x7000) >> 12) - 1;
                    }
                    k.bK = bk2;
                }
                j = this;
                as = i.aS >> 1;
                f = i.b;
                if (this.bK < 0) {
                    bk3 = 0;
                    break Label_0188;
                }
            }
            bk3 = this.bK;
        }
        j.bL = as % f.a(bk3);
        this.F();
    }
    
    private static int a(final f f, final int n, int i) {
        int n2 = 0;
        for (int n3 = 0; i > 0; i -= f.a(n, n3), n2 = n3, ++n3) {}
        return n2;
    }
    
    private static int b(final f f, final int n, int n2) {
        n2 = 0;
        for (int i = 0; i < 1; ++i) {
            n2 = 0 + f.a(n, 0);
        }
        return n2;
    }
    
    private static void a(final Graphics graphics, int n, final int n2, int i, final Image[] array, int n3) {
        if (i == 0) {
            graphics.drawImage(i.a[0].a[0][0], n, n2, 24);
            return;
        }
        while (i > 0) {
            n3 = i % 10;
            i /= 10;
            final Image image = array[n3];
            n -= image.getWidth();
            graphics.drawImage(image, n, n2, 0);
        }
    }
    
    private boolean c() {
        return this.h > 0 && this.h < this.e - 1 && this.i > 0 && this.i < this.f - 1;
    }
    
    private void g(int n) {
        final int d;
        if ((d = i.a[0].d) != 19 && (this.k & 0x4000) == 0x0 && (this.k & 0x800) == 0x0) {
            Label_0516: {
                if (this.c()) {
                    final int n2;
                    if ((n2 = ((i.e == null) ? 0 : a(i.e[this.h][this.i], (byte)0, (byte)3, (byte)4))) == 8 || n2 == 7) {
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
                                n = 36 + (this.k & 0x7) - 1;
                                break;
                            }
                        }
                    }
                    else if (i.a[this.h][this.i + 1] < 0 || i.a[this.h][this.i + 1] == 14) {
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
                this.k |= 0x4000;
            }
            else {
                i.a[0].a(n);
            }
            if (d != n) {
                this.ax = 70;
            }
        }
    }
    
    private void P() {
        if (a(32944)) {
            i.ah = 0;
            this.av = true;
            final int n = this.n;
            this.en = -1;
            switch (f(n)) {
                case -1: {
                    this.a = i.a[41];
                }
                case 0: {
                    this.a = i.a[0];
                }
                case 1: {
                    this.aZ = a(i.i, 4) - a.a[this.n];
                    this.g = null;
                    System.gc();
                    this.g = i.a[125] + " " + this.aZ + " " + i.a[19];
                    i.i[4] = (byte)this.aZ;
                    i.i[5] = (byte)(this.aZ >> 8);
                    i.i[8] = (byte)(n + 4 + 1);
                    this.u();
                    this.o = -1;
                    this.a = i.a[0];
                    this.aa = true;
                    this.a(i.a[32], -1, -1, 5000, 4273165, 0);
                    break;
                }
            }
            return;
        }
        if (a(64)) {
            i.ah = 0;
            i.b = 27;
            this.av = true;
            this.g = true;
            i.ah = 0;
            return;
        }
        Label_0325: {
            i i;
            i j;
            i k;
            int n2;
            if (a(4097)) {
                i = this;
                j = this;
                k = this;
                n2 = -1;
            }
            else {
                if (!a(262146)) {
                    break Label_0325;
                }
                i = this;
                j = this;
                k = this;
                n2 = 1;
            }
            final int n3 = n2;
            final i l = k;
            i.n = j.n + n3;
            if (l.n < 0) {
                l.n = 3;
            }
            if (l.n == 4) {
                l.n = 0;
            }
        }
        i.ah = 0;
        i m;
        String[] array;
        int n4;
        if (f(this.n) == 0) {
            this.o = -1;
            m = this;
            array = i.a;
            n4 = 0;
        }
        else {
            this.o = a.a[this.n];
            this.d.delete(0, this.d.length());
            this.d.append(this.o);
            m = this;
            array = i.a;
            n4 = 6;
        }
        m.a = array[n4];
        this.av = true;
    }
    
    private static int f(final int n) {
        if (i.i[8] >= n + 4 + 1) {
            return 0;
        }
        if (a(i.i, 4) < a.a[n]) {
            return -1;
        }
        return 1;
    }
    
    private void Q() {
        this.D = true;
        i.b = 16;
        this.bs = 0;
        this.br = 6;
        this.az = 0;
        this.bb = 0;
        this.aZ = 0;
        this.p = false;
        this.ag = 0;
        i.dZ = 0;
    }
    
    private void R() {
        if (i.s < i.b.length && a(i.b[i.s])) {
            i.ah = 0;
            if (++i.s == i.b.length) {
                i.ah = 0;
                i.b = 24;
                this.cz = i.i[8];
                this.cA = i.i[9];
                this.S = false;
                this.T = false;
            }
        }
        else {
            byte s;
            if (a(i.b[0])) {
                i.ah = 0;
                s = 1;
            }
            else {
                s = 0;
            }
            i.s = s;
        }
    }
    
    private void S() {
        this.a.setClip(0, 0, 240, 320);
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        i.b = i.m;
        if (i.m == 27) {
            this.av = true;
            this.g = true;
        }
        else if (i.m == 1) {
            (this = this).o = true;
        }
        i.ah = 0;
    }
    
    private void T() {
        if (this.db >= 0 && this.db <= 2) {
            i.ah = 0;
            return;
        }
        if (a(4097)) {
            if (System.currentTimeMillis() < 300L) {
                return;
            }
            this.m();
            if (this.bo == 0 && this.bq == 0 && !this.X) {
                this.m();
            }
        }
        else if (a(262146)) {
            if (System.currentTimeMillis() < 300L) {
                return;
            }
            this.n();
            if (this.bo == 0 && this.bq == 0 && !this.X) {
                this.n();
            }
        }
        else if (a(32944)) {
            if (this.db < 0 || this.db > 2) {
                this.db = 0;
                this.g = System.currentTimeMillis();
            }
        }
        else if (a(64)) {
            switch ((this = this).bo) {
                case 5: {
                    i.V = true;
                    i.W = false;
                    if (i.b == 2) {
                        this.a(1);
                        this.o = true;
                        i.W = true;
                    }
                    if (i.b == 4) {
                        this.a(0);
                        this.p(19);
                        break;
                    }
                    break;
                }
                case 2: {
                    i.b = 9;
                    this.a(0);
                    this.br = 8;
                    this.bs = 0;
                    break;
                }
                case 4: {
                    this.a(2);
                    break;
                }
            }
        }
        i.ah = 0;
    }
    
    private boolean d() {
        if (this.x == 3) {
            final int n = i.a[this.h][this.i] & 0xFF;
            if (this.cf == 0 && n != 15 && n != 16) {
                this.p(0);
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
    
    private void b(final int n, final int n2, final int n3) {
        int n4 = i.b[n2][n3];
        if (n == 43 && (n4 & 0xF8) == 0x0) {
            if ((n4 & 0x18000) == 0x0) {
                i.a[n2][n3] = -1;
                this.j(n2, n3);
                return;
            }
            final int n5;
            n4 = ((((n5 = ((((n4 - 32768 & 0xFF01FFFF) | n2 << 17) & 0x80FFFFFF) | n3 << 24)) & 0x7) == 0x1 || (n5 & 0x7) == 0x3) ? (n5 | Integer.MIN_VALUE) : (n5 & Integer.MAX_VALUE));
        }
        i.b[n2][n3] = ((n4 & 0xFFFFFF07) | 0x78);
    }
    
    private void d(final int n, final int n2) {
        switch (i.a[n][n2]) {
            case 0: {
                this.p(11);
            }
            case 19:
            case 43:
            case 45:
            case 46: {
                i.a[n][n2] = -1;
                this.j(n, n2);
            }
            case 48: {
                i.a[n][n2] = -1;
                this.j(n, n2);
                int n3 = n2 + 1;
                if (i.a[n][n3] != 48) {
                    n3 = -1;
                }
                i.a[n][n3] = -1;
                this.j(n, n3);
                i.e[(i.b[n][n2] >> 24) * 3 + 2] = -1;
            }
            default: {
                i.a[n][n2] = -1;
            }
        }
    }
    
    private void U() {
        if (this.c) {
            --this.l;
        }
        if ((this.h || this.aj) && i.aS > 140) {
            if (this.aj) {
                this.b();
            }
            this.h = false;
            this.aj = false;
            this.K = true;
            this.bs = 0;
            this.e();
            this.I = true;
            i.b = 28;
        }
        boolean b = this.c();
        if (this.al) {
            this.al = false;
            if (this.dt < this.du) {
                this.m(a((byte)this.dt, (byte)13, (byte)7), a((byte)this.dt, (byte)20, (byte)7));
                ++this.dt;
            }
            else {
                this.dt = 0;
                this.du = 0;
            }
        }
        if (i.a[4] != null) {
            i.a[4].b();
        }
        if (this.bj > 0) {
            --this.bj;
        }
        if (this.di > 0) {
            --this.di;
            if (this.di == 0) {
                this.e = null;
            }
        }
        if (this.ad != this.ae) {
            int ad;
            int n = ad = this.ad;
            while (true) {
                final int n2 = ad;
                if (n == this.ae) {
                    break;
                }
                final byte[] b2 = i.b;
                final int n3 = n2;
                ++b2[n3];
                if (i.b[n2] >= ((i.c[n2] < 0) ? a(i.a[2], 0) : i.a[9].a((int)i.c[n2]))) {
                    ++this.ad;
                    this.ad &= 0x7;
                }
                n = (ad = (n2 + 1 & 0x7));
            }
        }
        if (this.k != 0) {
            Label_5436: {
                switch (this.k) {
                    case 2: {
                        if (i.a != null && this.c() && (i.a[this.h][this.i] & 0xFF) == 0x0) {
                            final int n4;
                            if ((n4 = i.a[this.h][this.i] >> 8) == 13) {
                                this.q = true;
                            }
                            else if (n4 == 16) {
                                this.r = true;
                            }
                        }
                        if (!this.s && this.j <= 0 && this.c(46, 7)) {
                            this.t = true;
                            this.s = true;
                        }
                        if (this.c(61, 3) && this.j == 6) {
                            this.c(this.h, this.i, 5);
                            this.e = false;
                        }
                        if (this.a == null && (this.c(60, 3) || this.c(61, 3))) {
                            this.b(true);
                            this.N = true;
                            this.au();
                            this.p();
                            this.aA = 0;
                            this.aB = 0;
                            this.l();
                        }
                        if (this.aI == 2) {
                            i.a[11][50] = -1;
                        }
                        break;
                    }
                    case 1: {
                        if (i.a[18][63] == 0 && i.b[18][63] <= 0 && this.am == 0) {
                            this.bj = 120;
                            ++this.am;
                        }
                        Label_0773: {
                            b b3;
                            int n5;
                            if (this.am == 3) {
                                if (i.a[2].d == 0) {
                                    b3 = i.a[2];
                                    n5 = 1;
                                }
                                else {
                                    if (i.a[2].d != 1 || !i.a[2].a()) {
                                        break Label_0773;
                                    }
                                    i.a[2].a(2);
                                    if (this.i == this.f - 4) {
                                        this.al = 817;
                                    }
                                    break Label_0773;
                                }
                            }
                            else {
                                if (i.a[2].d == 0) {
                                    break Label_0773;
                                }
                                b3 = i.a[2];
                                n5 = 0;
                            }
                            b3.a(n5);
                        }
                        i.a[2].b();
                        if (i.a[2].d == 2) {
                            i.a[1].b();
                            if (this.bj == 10) {
                                this.bj = 60;
                            }
                            if (i.a[1].d == 0) {
                                if ((this.a == null || this.al < 46) && this.al < 1704) {
                                    ++this.al;
                                    final int al = this.f * 24 - (this.b + 320 - 80);
                                    if (this.al < al) {
                                        this.al = al;
                                    }
                                }
                                if (this.f * 24 - this.al <= this.i * 24 + 18 && this.h < 17) {
                                    this.a(i.i[8], 64, 1);
                                }
                            }
                            else if (i.a[1].a()) {
                                i.a[1].a(0);
                            }
                        }
                        break;
                    }
                    case 3: {
                        final b b4 = i.a[5];
                        final int be = this.bE;
                        final int bf = this.bF;
                        final int n6 = this.h - 8;
                        final int n7 = this.h + 8;
                        final int n8 = this.i + 8;
                        final int n9 = this.i - 8;
                        for (int i = 15; i <= 22; ++i) {
                            for (int j = 14; j <= 21; ++j) {
                                if ((j <= n6 || j >= n7 || i <= n8 || i >= n9) && i.a[j][i] == 44) {
                                    this.bE = j;
                                    this.bF = i;
                                    this.ak();
                                }
                            }
                        }
                        this.bE = be;
                        this.bF = bf;
                        if (this.n == 0) {
                            this.ad();
                        }
                        b b5;
                        if (this.ao == 12) {
                            if (this.ap++ > 100) {
                                this.ao = 15;
                                this.j(11, 11);
                            }
                            else {
                                this.a.b(7);
                            }
                            b5 = b4;
                        }
                        else if (this.ao == -1) {
                            if (this.h * 24 >= 336) {
                                b4.a(this.ao = 0);
                                break;
                            }
                            break;
                        }
                        else {
                            if (this.ao == 15 || this.ao == -1) {
                                break;
                            }
                            int n10 = -1;
                            final int n11 = this.h * 24 + 12;
                            final int n12 = this.i * 24;
                            int n13 = this.as + 24;
                            if (this.j == 0L && this.n != 0) {
                                this.j = i.aS + e.a(340, 441);
                            }
                            int n14 = (this.aq > 0 && i.aS % this.aq == 0) ? 2 : 1;
                            if (this.ao == 10 || this.ao == 11) {
                                n14 = (((i.aS & 0xB) == 0x0) ? 2 : n14);
                            }
                            while (n14-- > 0) {
                                Label_2250: {
                                    switch (this.ao) {
                                        case 2: {
                                            if (!b4.a()) {
                                                break;
                                            }
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 13);
                                                break;
                                            }
                                            n10 = (this.ao = 4);
                                            break;
                                        }
                                        case 3: {
                                            if (!b4.a()) {
                                                break;
                                            }
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 14);
                                                break;
                                            }
                                            n10 = (this.ao = 5);
                                            break;
                                        }
                                        case 0: {
                                            if (n13 > 360) {
                                                n10 = (this.ao = 4);
                                                break;
                                            }
                                            n10 = (this.ao = 5);
                                            break;
                                        }
                                        case 1: {
                                            if (n13 < 504) {
                                                n10 = (this.ao = 5);
                                                break;
                                            }
                                            n10 = (this.ao = 4);
                                            break;
                                        }
                                        case 10: {
                                            if (!b4.a()) {
                                                this.as -= 2;
                                                break;
                                            }
                                            this.bj = 10;
                                            n13 = this.as + 24;
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 13);
                                                break;
                                            }
                                            if (n12 < 504) {
                                                n10 = (this.ao = 4);
                                                break;
                                            }
                                            if (n11 >= n13 - 48) {
                                                n10 = (this.ao = 6);
                                                break;
                                            }
                                            break;
                                        }
                                        case 11: {
                                            if (!b4.a()) {
                                                this.as += 2;
                                                break;
                                            }
                                            this.bj = 10;
                                            n13 = this.as + 24;
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 14);
                                                break;
                                            }
                                            if (n12 < 504) {
                                                n10 = (this.ao = 5);
                                                break;
                                            }
                                            if (n11 <= n13 + 48) {
                                                n10 = (this.ao = 7);
                                                break;
                                            }
                                            break;
                                        }
                                        case 4: {
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 13);
                                                break;
                                            }
                                            if (n12 >= 504 && n11 < n13 && this.as - 48 >= 360) {
                                                n10 = (this.ao = 10);
                                            }
                                            if (n13 <= 360) {
                                                n10 = (this.ao = 5);
                                            }
                                            if (this.ao == 4) {
                                                --this.as;
                                                break;
                                            }
                                            break;
                                        }
                                        case 5: {
                                            if (i.aS > this.j) {
                                                n10 = (this.ao = 14);
                                                break;
                                            }
                                            if (n12 >= 504 && n11 > n13 && this.as + 48 <= 504) {
                                                n10 = (this.ao = 11);
                                            }
                                            if (n13 >= 504) {
                                                n10 = (this.ao = 4);
                                            }
                                            if (this.ao == 5) {
                                                ++this.as;
                                                break;
                                            }
                                            break;
                                        }
                                        case 6:
                                        case 7:
                                        case 13:
                                        case 14: {
                                            int ao = 0;
                                            int n15 = 0;
                                            int n16 = 0;
                                            while (true) {
                                                int n17 = 0;
                                                switch (this.ao) {
                                                    case 6:
                                                    case 13: {
                                                        ao = 4;
                                                        n15 = 2;
                                                        n17 = 1;
                                                        break;
                                                    }
                                                    case 7:
                                                    case 14: {
                                                        ao = 5;
                                                        n15 = 1;
                                                        n17 = 2;
                                                        break;
                                                    }
                                                    default: {
                                                        if (b4.e == 5 && b4.f == 0) {
                                                            i k;
                                                            int bj;
                                                            if (this.ao == 13 || this.ao == 14) {
                                                                k = this;
                                                                bj = 80;
                                                            }
                                                            else {
                                                                k = this;
                                                                bj = 10;
                                                            }
                                                            k.bj = bj;
                                                        }
                                                        if (b4.a()) {
                                                            if (this.ao == 13 || this.ao == 14) {
                                                                this.k = i.aS + 40;
                                                                this.j = i.aS + e.a(340, 441);
                                                            }
                                                            n10 = (this.ao = ao);
                                                        }
                                                        if (b4.e >= 5 && n12 >= 504 && n11 >= n13 - n15 * 24 && n11 <= n13 + n16 * 24) {
                                                            this.a(1, 48, 4);
                                                            break Label_2250;
                                                        }
                                                        break Label_2250;
                                                    }
                                                }
                                                n16 = n17;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                if (n12 >= 504 && n11 >= n13 - 24 && n11 <= n13 + 24) {
                                    this.a(1, 48, (int)i.h[this.k & 0x7]);
                                }
                                if (this.aq <= 0) {
                                    this.ao = 12;
                                    this.ap = 0;
                                    break Label_5436;
                                }
                            }
                            Label_2517: {
                                if (this.ce == 5) {
                                    int[] array;
                                    int n18;
                                    if (this.cf <= 0) {
                                        if (this.aq <= 2) {
                                            i.a[10][16] = 45;
                                            i.c[10][16] = 24;
                                            i.b[10][16] = 0;
                                            i.b[10][16] = 0;
                                        }
                                        i.a[26][19] = 45;
                                        i.c[26][19] = 24;
                                        i.b[26][19] = 0;
                                        array = i.b[26];
                                        n18 = 19;
                                    }
                                    else {
                                        i.a[10][19] = 45;
                                        i.c[10][19] = 24;
                                        i.b[10][19] = 0;
                                        i.b[10][19] = 0;
                                        if (this.aq > 2) {
                                            break Label_2517;
                                        }
                                        i.a[26][16] = 45;
                                        i.c[26][16] = 24;
                                        i.b[26][16] = 0;
                                        array = i.b[26];
                                        n18 = 16;
                                    }
                                    array[n18] = 0;
                                }
                            }
                            if (this.ao != 10 && this.ao != 11) {
                                for (int l = 21; l < 23; ++l) {
                                    for (int n19 = n13 / 24 - 1; n19 < n13 / 24 - 2 + 4; ++n19) {
                                        if (i.a[n19][l] == 9) {
                                            Label_2673: {
                                                if ((i.b[n19][l] & 0x7) == 0x3) {
                                                    --this.aq;
                                                    i m = null;
                                                    int n20 = 0;
                                                    int ao2 = 0;
                                                    switch (this.ao) {
                                                        case 0:
                                                        case 2:
                                                        case 4:
                                                        case 6: {
                                                            m = this;
                                                            ao2 = (n20 = 2);
                                                            break;
                                                        }
                                                        case 1:
                                                        case 3:
                                                        case 5:
                                                        case 7: {
                                                            m = this;
                                                            ao2 = (n20 = 3);
                                                            break;
                                                        }
                                                        default: {
                                                            break Label_2673;
                                                        }
                                                    }
                                                    n10 = n20;
                                                    m.ao = ao2;
                                                }
                                            }
                                            i.a[n19][l] = -1;
                                            this.b(n19, l);
                                            i.a[n19][l] = 30;
                                            i.c[n19][l] = 24;
                                            i.b[n19][l] = 4;
                                            this.p(14);
                                        }
                                    }
                                }
                            }
                            if (n10 != -1) {
                                b4.a(n10);
                                break;
                            }
                            b5 = b4;
                        }
                        b5.b();
                        break;
                    }
                    case 4: {
                        if (this.ao == 5) {
                            if (this.Z) {
                                break;
                            }
                            this.Z = true;
                        }
                        final b b6 = i.a[5];
                        ++this.ap;
                        int n21 = -1;
                        final b b7 = i.a[4];
                        int n22 = -1;
                        final int d = this.d();
                        if (i.a[this.P][2] == -1) {
                            i.a[this.P][2] = 31;
                        }
                        if (i.a[this.Q][2] == -1) {
                            i.a[this.Q][2] = 31;
                        }
                        switch (this.ao) {
                            case 0: {
                                if (this.h >= 10) {
                                    this.ao = 6;
                                    this.ap = 0;
                                    break;
                                }
                                break;
                            }
                            case 6: {
                                if (this.ap > 10) {
                                    this.ao = 1;
                                    n21 = 2;
                                    this.ap = 0;
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                if (this.ap > 40) {
                                    this.ao = 2;
                                    this.ap = 0;
                                    break;
                                }
                                if (this.ap > 20) {
                                    this.b(d, 8);
                                    h(d, 8);
                                    this.M = d;
                                    this.N = 8;
                                    break;
                                }
                                break;
                            }
                            case 7: {
                                g(this.M, this.N);
                                this.M = -1;
                                this.N = -1;
                                if (this.ap > 80) {
                                    this.ao = 8;
                                    this.al();
                                }
                                if ((this.ap & 0x6F) == 0x1) {
                                    this.p(7);
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                if (this.ap <= 40) {
                                    break;
                                }
                                if (this.aq <= 0) {
                                    this.ao = 7;
                                    this.ap = 0;
                                    break;
                                }
                                if (this.S == 10) {
                                    this.ao = 9;
                                    this.ap = 0;
                                    break;
                                }
                                if (this.S == 2 || this.S == 1) {
                                    this.ao = 4;
                                    this.ap = 0;
                                    n21 = 2;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (this.b(d, 8)) {
                                    --this.aq;
                                    this.S = this.ao;
                                    g(this.M, this.N);
                                    this.M = -1;
                                    this.N = -1;
                                    this.S = this.ao;
                                    this.ao = 3;
                                    n21 = 3;
                                    this.p(10);
                                }
                                if (this.ap > 15 && b6.d != 6) {
                                    n21 = 6;
                                }
                                if (this.ap > 30) {
                                    this.ao = 4;
                                    this.ap = 0;
                                    n21 = 0;
                                    g(this.M, this.N);
                                    this.M = -1;
                                    this.N = -1;
                                    break;
                                }
                                break;
                            }
                            case 4: {
                                final int n23 = (this.aq <= 1) ? 5 : 10;
                                Label_3392: {
                                    int n24;
                                    if (this.ap >= n23) {
                                        this.ao = 5;
                                        this.ap = 0;
                                        n24 = 4;
                                    }
                                    else {
                                        if (this.ap <= n23 >> 1 || b6.d == 1) {
                                            break Label_3392;
                                        }
                                        n24 = 1;
                                    }
                                    n21 = n24;
                                }
                                this.e();
                                this.ab();
                                break;
                            }
                            case 5: {
                                if (b6.b - 40 - b6.a.c[(b6.a.a[b6.d] + b6.e) * 5 + 3] <= 72 - this.b + 40) {
                                    this.T = 0;
                                    this.ac();
                                    this.ao = 10;
                                    this.M = d;
                                    this.N = 4;
                                    h(this.M, this.N);
                                }
                                this.e();
                                this.ab();
                                break;
                            }
                            case 9: {
                                this.ap -= 2;
                                this.ab();
                                if (b6.b - 40 - b6.a.c[(b6.a.a[b6.d] + b6.e) * 5 + 3] >= 240 - this.b + 40) {
                                    this.ao = 6;
                                    this.ap = 0;
                                    final int n25;
                                    int ar = (n25 = this.h - 10) / 3;
                                    if (n25 == ar * 3 + 2) {
                                        ar += i.aS % 50 / 25;
                                    }
                                    this.ar = ar;
                                    break;
                                }
                                break;
                            }
                            case 10: {
                                --this.ap;
                                this.ab();
                                ++this.L;
                                if (this.L == 28) {
                                    n21 = 7;
                                }
                                if (this.L >= 50) {
                                    this.L = 0;
                                    this.ao = 11;
                                    g(this.M, this.N);
                                    this.M = -1;
                                    this.N = -1;
                                    n21 = 8;
                                    n22 = 2;
                                    this.k = true;
                                    break;
                                }
                                break;
                            }
                            case 11: {
                                --this.ap;
                                ++this.L;
                                if (this.L >= 12) {
                                    this.L = 0;
                                    this.ao = 9;
                                    n21 = 4;
                                    this.j = false;
                                    this.k = false;
                                    break;
                                }
                                if (this.j) {
                                    break;
                                }
                                final int d2 = this.d();
                                if (this.i == 4 && this.h >= d2 - 3 && this.h <= d2 + 4) {
                                    this.a(1, 64, (this.h == d2) ? 4 : 2);
                                    this.j = true;
                                    break;
                                }
                                break;
                            }
                        }
                        if (n21 == -1) {
                            b6.b();
                        }
                        else {
                            b6.a(n21);
                        }
                        if (this.k) {
                            if (n22 == -1) {
                                b7.b();
                            }
                            else {
                                b7.a(n22);
                            }
                        }
                        break;
                    }
                    case 5: {
                        final b b8 = i.a[5];
                        b b9;
                        if (this.ao == 12) {
                            if (this.ap++ > 100) {
                                this.ao = 15;
                                this.j(11, 11);
                            }
                            else {
                                this.a.b(7);
                            }
                            b9 = b8;
                        }
                        else if (this.ao == -1) {
                            if (this.h * 24 >= 360) {
                                b8.a(this.ao = 10);
                                break;
                            }
                            break;
                        }
                        else {
                            if (this.ao == 15 || this.ao == -1) {
                                break;
                            }
                            int n26 = -1;
                            final int n27 = this.h * 24 + 12;
                            final int n28 = this.i * 24;
                            final int n29 = this.at + 24;
                            if (this.ao == 13) {
                                n26 = 13;
                                if (n27 > n29) {
                                    this.ae = true;
                                }
                            }
                            int n30 = (this.aq > 0 && i.aS % this.aq == 0) ? 2 : 1;
                            if (this.ao == 6 || this.ao == 7) {
                                n30 = (((i.aS & 0xB) == 0x0) ? 2 : n30);
                            }
                            if (!this.ad && (this.ao == 0 || this.ao == 1)) {
                                i i2;
                                int dh;
                                if (this.ao == 0) {
                                    this.dh = 36;
                                    this.dh ^= -1;
                                    i2 = this;
                                    dh = this.dh + 1;
                                }
                                else {
                                    i2 = this;
                                    dh = 36;
                                }
                                i2.dh = dh;
                                if (n28 < 504 && (n27 == n29 + this.dh || i.aS % 76 == 0)) {
                                    this.ad = true;
                                }
                            }
                            while (n30-- > 0) {
                                Label_5070: {
                                    switch (this.ao) {
                                        case 13: {
                                            if (b8.a()) {
                                                n26 = (this.ao = 0);
                                                this.ae = false;
                                                break Label_5070;
                                            }
                                            if (this.ae) {
                                                b8.b();
                                            }
                                            break Label_5070;
                                        }
                                        case 4:
                                        case 5: {
                                            if (b8.a()) {
                                                n26 = (this.ao = ((this.ao != 4) ? 1 : 0));
                                            }
                                            this.ad = false;
                                            this.dh = 0;
                                            break Label_5070;
                                        }
                                        case 10:
                                        case 11: {
                                            Label_4472: {
                                                i i3;
                                                int n31;
                                                int ao3;
                                                if (n27 > n29 && n29 < 504) {
                                                    i3 = this;
                                                    ao3 = (n31 = 1);
                                                }
                                                else {
                                                    if (n27 >= n29 || n29 <= 360) {
                                                        break Label_4472;
                                                    }
                                                    i3 = this;
                                                    ao3 = (n31 = 0);
                                                }
                                                n26 = n31;
                                                i3.ao = ao3;
                                            }
                                            this.ad = false;
                                            this.dh = 0;
                                            break Label_5070;
                                        }
                                        case 6: {
                                            if (n28 >= 504) {
                                                if (n27 >= n29 - 48) {
                                                    n26 = (this.ao = 8);
                                                    break Label_5070;
                                                }
                                                this.at -= 2;
                                                break Label_5070;
                                            }
                                            else {
                                                if (n29 >= 360) {
                                                    n26 = (this.ao = 0);
                                                }
                                                break Label_5070;
                                            }
                                            break;
                                        }
                                        case 7: {
                                            if (n28 >= 504) {
                                                if (n27 <= n29 + 48) {
                                                    n26 = (this.ao = 9);
                                                    break Label_5070;
                                                }
                                                this.at += 2;
                                                break Label_5070;
                                            }
                                            else {
                                                if (n29 <= 504) {
                                                    n26 = (this.ao = 1);
                                                }
                                                break Label_5070;
                                            }
                                            break;
                                        }
                                        case 0: {
                                            if (n28 >= 504 && n29 > 360) {
                                                if (n27 < n29) {
                                                    n26 = (this.ao = 6);
                                                    break Label_5070;
                                                }
                                                --this.at;
                                                break Label_5070;
                                            }
                                            else {
                                                if (this.ad) {
                                                    n26 = (this.ao = 2);
                                                    break Label_5070;
                                                }
                                                if (n29 <= 360) {
                                                    n26 = (this.ao = 1);
                                                    break Label_5070;
                                                }
                                                --this.at;
                                                break Label_5070;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            if (n28 >= 504 && n29 < 504) {
                                                if (n27 < n29) {
                                                    ++this.at;
                                                    break Label_5070;
                                                }
                                                n26 = (this.ao = 7);
                                                break Label_5070;
                                            }
                                            else {
                                                if (this.ad) {
                                                    n26 = (this.ao = 3);
                                                    break Label_5070;
                                                }
                                                if (n29 >= 504) {
                                                    n26 = (this.ao = 0);
                                                    break Label_5070;
                                                }
                                                ++this.at;
                                                break Label_5070;
                                            }
                                            break;
                                        }
                                        case 8: {
                                            if (b8.a()) {
                                                n26 = (this.ao = 10);
                                            }
                                            if (b8.e >= 4 && n28 >= 504 && n27 >= n29 - 48 && n27 <= n29) {
                                                break;
                                            }
                                            break Label_5070;
                                        }
                                        case 9: {
                                            if (b8.a()) {
                                                n26 = (this.ao = 11);
                                            }
                                            if (b8.e >= 4 && n28 >= 504 && n27 >= n29 && n27 <= n29 + 48) {
                                                break;
                                            }
                                            break Label_5070;
                                        }
                                        case 3: {
                                            if (b8.e == 5 && b8.f == 0) {
                                                this.bj = 30;
                                            }
                                            if (b8.a()) {
                                                n26 = (this.ao = 11);
                                                this.ad = false;
                                                this.dh = 0;
                                            }
                                            if (b8.e >= 7 && n28 < 504 && n27 == n29 + this.dh) {
                                                break;
                                            }
                                            break Label_5070;
                                        }
                                        case 2: {
                                            if (b8.e == 5 && b8.f == 0) {
                                                this.bj = 30;
                                            }
                                            if (b8.a()) {
                                                n26 = (this.ao = 10);
                                                this.ad = false;
                                                this.dh = 0;
                                            }
                                            if (b8.e >= 7 && n28 < 504 && n27 == n29 + this.dh) {
                                                break;
                                            }
                                            break Label_5070;
                                        }
                                    }
                                    this.a(1, 48, 0);
                                }
                                if (n28 >= 504 && n27 >= n29 - 24 && n27 <= n29 - 24) {
                                    this.a(1, 48, (int)i.h[this.k & 0x7]);
                                }
                            }
                            if ((this.ao == 8 || this.ao == 9) && b8.e == 5) {
                                this.ac();
                            }
                            if (this.ao != 6 && this.ao != 7) {
                                for (int n32 = 21; n32 < 23; ++n32) {
                                    for (int n33 = n29 / 24 - 1; n33 < n29 / 24 - 2 + 4; ++n33) {
                                        if (i.a[n33][n32] == 0) {
                                            Label_5328: {
                                                if ((i.b[n33][n32] & 0x7) == 0x3 && this.ao != 13) {
                                                    --this.aq;
                                                    i i4 = null;
                                                    int n34 = 0;
                                                    int ao4 = 0;
                                                    switch (this.ao) {
                                                        case 0:
                                                        case 2:
                                                        case 4:
                                                        case 8:
                                                        case 10: {
                                                            i4 = this;
                                                            ao4 = (n34 = 4);
                                                            break;
                                                        }
                                                        case 1:
                                                        case 3:
                                                        case 5:
                                                        case 9:
                                                        case 11: {
                                                            i4 = this;
                                                            ao4 = (n34 = 5);
                                                            break;
                                                        }
                                                        default: {
                                                            break Label_5328;
                                                        }
                                                    }
                                                    n26 = n34;
                                                    i4.ao = ao4;
                                                }
                                            }
                                            i.a[n33][n32] = -1;
                                            this.b(n33, n32);
                                            i.a[n33][n32] = 30;
                                            i.c[n33][n32] = 24;
                                            i.b[n33][n32] = 4;
                                            this.p(14);
                                        }
                                    }
                                }
                            }
                            if (this.aq <= 0) {
                                this.ao = 12;
                                this.ap = 0;
                                n26 = 12;
                            }
                            if (n26 != -1) {
                                b8.a(n26);
                                break;
                            }
                            b9 = b8;
                        }
                        b9.b();
                        break;
                    }
                }
            }
            if (i.b != 1) {
                return;
            }
        }
        if ((i.aS & 0xF) == 0x0) {
            this.aa();
        }
        if (this.cf != 0 && (i.aS >> 1 & 0x1) == 0x0) {
            this.ce += this.cf;
            if (this.ce == 0 || this.ce == 9) {
                this.cf = 0;
                for (int n35 = 1; n35 < this.f - 1; ++n35) {
                    for (int n36 = 1; n36 < this.e - 1; ++n36) {
                        final int n37 = i.a[n36][n35] & 0xFF;
                        final byte b10 = i.a[n36][n35];
                        if (n37 == 15 || n37 == 16 || b10 == 34 || b10 == 35) {
                            this.c(n36, n35);
                        }
                    }
                }
            }
            else if (this.ce == 5) {
                final int n38 = this.f - 1;
                final int n39 = this.e - 1;
                for (int n40 = 1; n40 < n38; ++n40) {
                    for (int n41 = 1; n41 < n39; ++n41) {
                        final int n42 = i.a[n41][n40] & 0xFF;
                        final byte b11 = i.a[n41][n40];
                        boolean b12 = false;
                        Label_5786: {
                            if (n42 == 15) {
                                this.d(n41, n40);
                                i.a[n41][n40] = 34;
                            }
                            else if (n42 == 16) {
                                this.d(n41, n40);
                                i.a[n41][n40] = 35;
                            }
                            else {
                                int[] array2;
                                int n43;
                                int n44;
                                if (b11 == 34) {
                                    array2 = i.a[n41];
                                    n43 = n40;
                                    n44 = 15;
                                }
                                else {
                                    if (b11 != 35) {
                                        break Label_5786;
                                    }
                                    array2 = i.a[n41];
                                    n43 = n40;
                                    n44 = 16;
                                }
                                array2[n43] = n44;
                                i.a[n41][n40] = -1;
                                this.l(n41, n40);
                            }
                            b12 = true;
                        }
                        if (b12) {
                            k(n41, n40);
                        }
                    }
                }
            }
        }
        --this.b;
        if (this.aW > 0 && --this.aW == 0) {
            this.X();
        }
        if (this.j <= 0 && this.w) {
            this.w = false;
            this.p(9);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException ex) {}
            this.ao();
        }
        if (i.a[11] != null) {
            final int n45;
            i i5;
            int an;
            if ((n45 = i.aS % 89) < 15) {
                i5 = this;
                an = 0;
            }
            else if (n45 < 45) {
                i5 = this;
                an = 48 * (n45 - 15) / 30;
            }
            else if (n45 < 60) {
                i5 = this;
                an = 48;
            }
            else {
                i5 = this;
                an = 48 - 48 * (n45 - 60) / 30;
            }
            i5.aN = an;
            this.aO = ((this.aN > 0) ? ((this.aN - 1) / 24 + 2) : 1);
            final int n46;
            i i6;
            int ap;
            if ((n46 = i.aS % 44) < 7) {
                i6 = this;
                ap = 0;
            }
            else if (n46 < 22) {
                i6 = this;
                ap = 48 * (n46 - 7) / 15;
            }
            else if (n46 < 30) {
                i6 = this;
                ap = 48;
            }
            else {
                i6 = this;
                ap = 48 - 48 * (n46 - 30) / 15;
            }
            i6.aP = ap;
            this.aQ = ((this.aP > 0) ? ((this.aP - 1) / 24 + 2) : 1);
        }
        if (this.bi != 0 && this.bg != 0) {
            this.Z();
        }
        this.ah();
        if (this.aw > 0) {
            this.V();
        }
        this.as();
        if (this.cl != 0) {
            this.ag();
        }
        if (this.a != null) {
            this.ax = 70;
            if (this.a.a() && this.a.b() == null) {
                this.a = null;
            }
            if (this.a != null) {
                this.a.b();
            }
        }
        else if (this.bm != -1) {
            this.k(this.bm);
            this.bm = -1;
            this.a = 0;
        }
        Label_7749: {
            i i8;
            int j2;
            if (this.aT > 0) {
                if (i.a[this.h][this.i] < 0) {
                    i i7;
                    int n47;
                    int n48;
                    if (i.a[this.h][this.i + 1] == 9 && (i.b[this.h][this.i + 1] & 0x7) == 0x3) {
                        ++this.i;
                        i7 = this;
                        n47 = (this.k & 0xFFFFFFF8);
                        n48 = 3;
                    }
                    else if (i.a[this.h - 1][this.i + 1] == 9 && (i.b[this.h - 1][this.i + 1] & 0x7) == 0x3) {
                        ++this.i;
                        --this.h;
                        i7 = this;
                        n47 = (this.k & 0xFFFFFFF8);
                        n48 = 3;
                    }
                    else if (i.a[this.h + 1][this.i + 1] == 9 && (i.b[this.h + 1][this.i + 1] & 0x7) == 0x3) {
                        ++this.i;
                        ++this.h;
                        i7 = this;
                        n47 = (this.k & 0xFFFFFFF8);
                        n48 = 3;
                    }
                    else {
                        i7 = this;
                        n47 = (this.k & 0xFFFFFFF8);
                        n48 = 0;
                    }
                    i7.k = (n47 | n48);
                }
                i8 = this;
                j2 = i.b[this.h][this.i];
            }
            else if ((this.l == 0 || (this.j <= 0 && this.l != 5)) && !this.x && (this.k & 0x70) == 0x0 && this.aF == -1) {
                this.l = this.a;
                boolean a = false;
                if (this.ay > 0) {
                    this.l = 2;
                    --this.ay;
                    if (this.ay == 0) {
                        this.e(this.h - 1, this.i);
                        this.a = 0;
                        i.ah = 0;
                    }
                }
                else if (b) {
                    k(this.h, this.i);
                }
                switch (this.l) {
                    case 3: {
                        this.k &= 0xFFFFFFF7;
                    }
                    case 1:
                    case 2:
                    case 4: {
                        if (i.a[0].d == 40 || i.a[0].d == 48) {
                            break;
                        }
                        if ((this.k & 0x1000) != 0x0) {
                            this.k = ((this.k & 0xFFFFFFF8) | this.l);
                            this.j = 18;
                            int n49;
                            if ((n49 = this.l - 1) < 0) {
                                n49 = 0;
                            }
                            this.g(n49 + 0);
                            break;
                        }
                        a = this.a(-i.g[this.l], -i.g[this.l + 8], false);
                        b = this.c();
                        if (!a) {
                            break;
                        }
                        this.l = 40;
                        this.c = false;
                        int n50;
                        if ((n50 = this.l - 1) < 0) {
                            n50 = 0;
                        }
                        if ((this.k & 0x8) == 0x0) {
                            this.g(n50 + 4);
                            break;
                        }
                        if (this.l == 2) {
                            this.g(8);
                            break;
                        }
                        this.g(9);
                        break;
                    }
                    case 6: {
                        final int n51 = ((this.k & 0x7) == 0x2) ? 1 : -1;
                        if (b && i.a[this.h + n51][this.i] < 0) {
                            this.g((n51 == -1) ? 22 : 20);
                            i.a[this.h + n51][this.i] = 32;
                            i.b[this.h + n51][this.i] = 18;
                            i.b[this.h + n51][this.i] = (0x4 | ((n51 > 0) ? 1 : 0));
                            i.c[this.h + n51][this.i] = 30;
                            this.j = 72;
                            this.a = 0;
                            break;
                        }
                        break;
                    }
                    case 5: {
                        this.j = 0;
                        final int n52 = this.k & 0x7;
                        if (this.c()) {
                            this.g(n52 + 13 - 1);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        this.k &= 0xFFFFFFF7;
                        boolean b13 = false;
                        switch (i.a[0].d) {
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
                                if ((this.k & 0x4000) == 0x0) {
                                    b13 = true;
                                    break;
                                }
                                break;
                            }
                        }
                        if (b13) {
                            int n53;
                            if ((n53 = 0 + (this.k & 0x7) - 1) < 0) {
                                n53 = 0;
                            }
                            this.g(n53);
                        }
                        i i9;
                        int ax;
                        if (this.a == null) {
                            i9 = this;
                            ax = 6;
                        }
                        else {
                            i9 = this;
                            ax = 0;
                        }
                        i9.aX = ax;
                        if (this.j > 0) {
                            this.j -= 6;
                            break;
                        }
                        break;
                    }
                }
                if (b) {
                    final byte b14 = i.a[this.h][this.i - 1];
                    if (!a && this.l != 5 && this.j <= 0 && (b14 == 0 || b14 == 9 || b14 == 8 || b14 == 48) && (i.a[this.h][this.i] & 0xFF) != 0x23) {
                        int a2 = 0;
                        if (i.e != null) {
                            a2 = a(i.e[this.h][this.i], (byte)0, (byte)3, (byte)4);
                        }
                        if (!this.l || (a2 == 0 && a2 != 3)) {
                            if ((this.k & 0x8) == 0x0 && i.a[0].d != 11 && i.a[0].d != 10 && i.a[0].d != 12) {
                                this.g(11);
                            }
                            this.c = true;
                            if (this.l <= 0) {
                                this.l = 40;
                                this.b = 0L;
                                this.a(i.i[8], 32, 0);
                                return;
                            }
                        }
                    }
                }
                if (a) {
                    this.y = false;
                    break Label_7749;
                }
                if (!b || (i.aS & 0x1F) != 0x0) {
                    break Label_7749;
                }
                boolean b15 = i.a[this.h][this.i - 1] == 0;
                for (int n54 = 1; !b15 && n54 <= 4; b15 |= this.a(i.g[n54], i.g[n54 + 8], true), ++n54) {}
                if (b15) {
                    break Label_7749;
                }
                if (this.y) {
                    this.g(19);
                    break Label_7749;
                }
                this.y = true;
                break Label_7749;
            }
            else {
                if (this.x && this.j <= 0) {
                    i i10;
                    byte l2;
                    if (this.at) {
                        i10 = this;
                        l2 = this.p;
                    }
                    else {
                        i10 = this;
                        l2 = this.q;
                    }
                    i10.l = l2;
                    this.k = ((this.k & 0xFFFFFFF8) | this.l);
                    this.h -= i.g[this.l];
                    this.i -= i.g[this.l + 8];
                    b = this.c();
                    this.j = 18;
                    if (i.a[0].d != 4) {
                        this.g(4 + this.l - 1);
                    }
                }
                if ((this.k & 0x70) > 32 && (this.k & 0x800) == 0x0) {
                    break Label_7749;
                }
                this.j -= 6;
                if (this.j > 0) {
                    break Label_7749;
                }
                this.k &= 0xFFFFEF8F;
                i8 = this;
                j2 = 0;
            }
            i8.j = j2;
        }
        if (this.cl == 0) {
            if (this.E) {
                this.ck = 8;
                if (this.g()) {
                    this.c(this.bS, this.bT, 5);
                    this.E = false;
                }
            }
            else if (this.a == null) {
                if (i.ak && this.l != 0) {
                    i.ak = false;
                    this.ax = 0;
                }
                if (!i.ak) {
                    this.a();
                }
            }
            else {
                this.a = this.c;
                this.b = this.d;
            }
        }
        if (this.l != 0 && b) {
            this.n = (i.a[this.h][this.i + 1] >= 0);
        }
        this.Y();
        if (this.x && (this.h < -5 || this.h > this.e + 5 || this.i < -5 || this.i > this.f + 5)) {
            this.o();
            i i11;
            boolean b16;
            if (this.at || this.aB >= this.dK) {
                this.bs = 0;
                this.br = 12;
                i.b = 35;
                i11 = this;
                b16 = false;
            }
            else {
                i.b = 20;
                this.bs = 0;
                this.W();
                this.z();
                e(6, this.bb);
                i11 = this;
                b16 = true;
            }
            i11.c(b16);
            this.u();
            this.e();
            this.aR = -1;
        }
    }
    
    private static byte a(int n, final int n2, final int n3, final int n4) {
        int n5 = n + n2;
        if (((n > 0 && n3 == 0) || (n < n3 && n3 > 0)) && (i.a[n5][n4] < 0 || i.a[n5][n4] == 31 || d(n5, n4) >= 0)) {
            do {
                n = n5;
                n5 += n2;
            } while (((n > 0 && n3 == 0) || (n < n3 && n3 > 0)) && (i.a[n5][n4] < 0 || d(n5, n4) >= 0 || i.a[n5][n4] == 31));
        }
        return (byte)n;
    }
    
    private void V() {
        final int n = this.e - 1;
        for (int i = 0; i < i.e.length; i += 3) {
            final byte b;
            if ((b = i.e[i + 2]) > 0) {
                final byte b2 = i.e[i + 1];
                final byte b3 = i.e[i];
                final byte[] e = i.e;
                final int n2 = i;
                final byte a = a((int)b3, -1, 0, (int)b);
                e[n2] = a;
                final byte b4 = a;
                final byte[] e2 = i.e;
                final int n3 = i + 1;
                final byte a2 = a((int)b2, 1, n, (int)b);
                e2[n3] = a2;
                for (byte b5 = a2, b6 = b4; b6 <= b5; ++b6) {
                    this.a((int)b6, (int)b);
                }
            }
        }
    }
    
    private boolean a(final int n, final int n2) {
        final int d = d(n, n2);
        int n3 = 0;
        if (d >= 0) {
            if (d == 37 && i.a[n][n2] == 43) {
                n3 = 268435456;
            }
            k(n, n2);
            i.a[n][n2] = 9;
            i.b[n][n2] = ((i.b[n][n2] & 0xF03FFFFF) | d << 22 | n3);
            this.c(n, n2, 1);
        }
        final b b = i.a[((this.k & 0x4000) == 0x0) ? 0 : 3];
        if (this.c(n, n2) && this.aT <= 0 && b.d != 40 && b.d != 48 && b.d != 47) {
            this.a(0, 16, 0);
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
    
    public static int a(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8;
    }
    
    public static int b(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24;
    }
    
    private static int e(final int n, int n2) {
        if ((n2 += a(i.i, n)) < 0) {
            n2 = 0;
        }
        i.i[n] = (byte)n2;
        i.i[n + 1] = (byte)(n2 >> 8);
        return n2;
    }
    
    private void W() {
        for (int i = 0; i < this.ai; ++i) {
            this.a(this.aA, this.aB, i.d[i << 1] & 0xFF, i.d[(i << 1) + 1] & 0xFF);
        }
    }
    
    private int b() {
        return e(4, this.aZ);
    }
    
    private void c(final int n, final int n2, final int n3) {
        final int n4 = this.ae << 1;
        i.a[n4] = (byte)n;
        i.a[n4 + 1] = (byte)n2;
        i.c[this.ae] = (byte)n3;
        i.b[this.ae] = 0;
        this.ae = (this.ae + 1 & 0x7);
    }
    
    private void X() {
        --this.az;
        ++this.bd;
        if (this.az >= 0) {
            this.ap();
            this.n = i.i[8];
            this.o = true;
            this.k = 0;
            this.aT = 0;
            final byte b = 0;
            this.l = b;
            this.a = b;
            return;
        }
        i.b = 12;
    }
    
    private void h(int n) {
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
        if (n2 != 7 || (n3 >> 8 & 0xFF) != n) {
            System.out.println("!!!!!!!!!!!!!! door missing");
        }
        n = (n3 & 0xF);
        int n4;
        if (--n == 0) {
            n4 = ((n3 & 0xFFFFFF0F) | 0x10);
            this.a(b, b2 - 1, 1, 0, 1);
            this.a(b, b2 - 1, -1, 0, 1);
            n = (i.a[b][b2 - 1] >> 8 | 0x200);
            i.a[b][b2 - 1] = (n << 8 | (i.a[b][b2 - 1] & 0xFF));
            i.c[b][b2] = 24;
        }
        else {
            n4 = ((n3 & 0xFFFFFFF0) | n);
        }
        i.a[b][b2] = (n4 << 8 | n2);
        this.p(8);
    }
    
    private void e(final int n, final int n2) {
        try {
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
            this.p(14);
            i.a[n][n2] = ((n3 & 0xFFFFFF0F) << 8 | 0x7);
            this.a(n, n2 - 1, 1, 0, 0);
            this.a(n, n2 - 1, -1, 0, 0);
            if (this.c(n, n2)) {
                this.b = 0L;
                this.bi = 0;
                this.a(i.i[8], 48, 0);
                this.p(2);
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
                        this.j(n, n2);
                        break;
                    }
                }
            }
            i.c[n][n2] = 24;
        }
        catch (Exception ex) {}
    }
    
    private void i(final int n) {
        if (n < 0) {
            return;
        }
        try {
            this.e((int)i.q[n], (int)i.r[n]);
        }
        catch (Exception ex) {}
    }
    
    private void Y() {
        final int n = ((this.k & 0x4000) == 0x0) ? 0 : 3;
        final b b = i.a[n];
        int n2 = -1;
        boolean b2 = true;
        boolean b3 = false;
        final boolean a;
        if (a = b.a()) {
            this.k &= 0xFFFFDFFF;
        }
        Label_3151: {
            int n3 = 0;
            Label_3150: {
                if (n == 3) {
                    if (!a) {
                        break Label_3151;
                    }
                    this.k &= 0xFFFFB7FF;
                    n3 = this.c();
                }
                else {
                    int n4 = 0;
                    switch (b.d) {
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46: {
                            if (a) {
                                n2 = 0 + (this.k & 0x7) - 1;
                                final byte b4 = 0;
                                this.a = b4;
                                this.l = b4;
                                this.j = 0;
                                i.ah = 0;
                            }
                            break Label_3151;
                        }
                        case 1:
                        case 3: {
                            if (a) {
                                n2 = 0 + (this.k & 0x7) - 1;
                            }
                            b3 = true;
                            break Label_3151;
                        }
                        case 36:
                        case 37:
                        case 38:
                        case 39: {
                            n4 = 4;
                            break;
                        }
                        case 47: {
                            this.j = 0;
                            final byte b5 = 0;
                            this.l = b5;
                            this.a = b5;
                            if ((i.aS & 0x1) == 0x0) {
                                int n5 = this.h - 2 + i.aS % 5;
                                final int n6 = this.i - 2 + i.aS % 3;
                                if (n5 == this.h && (n6 == this.i || n6 == this.i - 1)) {
                                    n5 += (((i.aS >> 1 & 0x1) == 0x0) ? 1 : -1);
                                }
                                this.c(n5, n6, i.aS * 3 % 5);
                            }
                            if (a) {
                                n2 = 0 + (this.k & 0x7) - 1;
                                final int af = -1;
                                this.aH = af;
                                this.aG = af;
                                this.aF = af;
                            }
                            break Label_3151;
                        }
                        case 40:
                        case 48: {
                            this.j = 0;
                            final byte b6 = 0;
                            this.l = b6;
                            this.a = b6;
                            if (b.f == 0) {
                                if (b.e == ((b.d == 40) ? 12 : 6)) {
                                    this.p(4);
                                }
                                if (b.e == ((b.d == 40) ? 13 : 6)) {
                                    boolean b7 = false;
                                    int n7 = -1;
                                    boolean b8 = false;
                                    switch (this.aI) {
                                        case 26: {
                                            b7 = true;
                                            this.bm = 25;
                                            b8 = true;
                                            break;
                                        }
                                        case 24: {
                                            b8 = true;
                                            b7 = true;
                                            this.bm = 22;
                                            break;
                                        }
                                        case 27: {
                                            b8 = true;
                                            b7 = true;
                                            this.bm = 23;
                                            break;
                                        }
                                        case 40: {
                                            b8 = true;
                                            b7 = true;
                                            this.bm = 24;
                                            break;
                                        }
                                        case 42: {
                                            b8 = true;
                                            b7 = true;
                                            this.p = true;
                                            this.bm = 11;
                                            break;
                                        }
                                        case 41: {
                                            if (this.f()) {
                                                this.aj = true;
                                                this.e();
                                            }
                                            this.aZ += this.aH;
                                            this.aa -= this.aH;
                                            if (this.aa <= 0 && !this.f()) {
                                                i.a[this.ab][this.ac] = -1;
                                                this.aa = 0;
                                            }
                                            n7 = 3;
                                            break;
                                        }
                                        case 4: {
                                            n7 = 2;
                                            ++this.aU;
                                            break;
                                        }
                                        case 5: {
                                            ++this.aV;
                                            n7 = 1;
                                            break;
                                        }
                                        case 2: {
                                            ++this.bb;
                                            b8 = true;
                                            n7 = 0;
                                            break;
                                        }
                                        case 6: {
                                            ++this.az;
                                            i.e[this.h][this.i] = -1;
                                            final int[] array = i.d[this.h];
                                            final int i = this.i;
                                            array[i] |= 0x100;
                                            n7 = 0;
                                            this.a(this.aA, this.aB, this.h, this.i);
                                            break;
                                        }
                                        case 7: {
                                            this.a((byte)127);
                                            n7 = 4;
                                            break;
                                        }
                                        case 51:
                                        case 52:
                                        case 53: {
                                            this.a(this.aA, this.aB, this.h, this.i);
                                            n7 = 0;
                                            b7 = true;
                                            this.e();
                                            this.h = true;
                                            i j;
                                            int d;
                                            if (this.aI == 53) {
                                                j = this;
                                                d = 0;
                                            }
                                            else if (this.aI == 51) {
                                                j = this;
                                                d = 1;
                                            }
                                            else {
                                                j = this;
                                                d = 2;
                                            }
                                            j.D = d;
                                            final byte[] k = i.i;
                                            final int n8 = 2;
                                            k[n8] |= (byte)(1 << this.D);
                                            this.u();
                                            break;
                                        }
                                    }
                                    if (b7) {
                                        this.g(47);
                                    }
                                    if (n7 != -1) {
                                        this.c(this.h, this.i - 1, n7);
                                    }
                                    if (b8) {
                                        i.d[this.ai << 1] = (byte)this.h;
                                        i.d[(this.ai << 1) + 1] = (byte)this.i;
                                        ++this.ai;
                                    }
                                    this.o = true;
                                    this.aI = -1;
                                }
                            }
                            if (b.a()) {
                                this.i = System.currentTimeMillis();
                                n2 = 0 + (this.k & 0x7) - 1;
                                final int af2 = -1;
                                this.aH = af2;
                                this.aG = af2;
                                this.aF = af2;
                            }
                            break Label_3151;
                        }
                        case 35: {
                            b3 = true;
                            n3 = 35;
                            break Label_3150;
                        }
                        case 34: {
                            b3 = true;
                            n3 = 34;
                            break Label_3150;
                        }
                        case 0: {
                            b3 = true;
                            n3 = 0;
                            break Label_3150;
                        }
                        case 2: {
                            b3 = true;
                            n3 = 2;
                            break Label_3150;
                        }
                        case 9: {
                            if (!this.n) {
                                n3 = 27;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 8: {
                            if (!this.n) {
                                n3 = 26;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 27: {
                            if (!this.n) {
                                n3 = 9;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 26: {
                            if (!this.n) {
                                n3 = 8;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 4:
                        case 6: {
                            if (this.n) {
                                n3 = b.d;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 5: {
                            if (!this.n) {
                                n3 = 24;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 7: {
                            if (!this.n) {
                                n3 = 25;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 24: {
                            if (this.n) {
                                n3 = 5;
                                break Label_3150;
                            }
                            break Label_3151;
                        }
                        case 25: {
                            if (this.n) {
                                n3 = 7;
                                break Label_3150;
                            }
                            break Label_3151;
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
                                b2 = false;
                                i.ah = 0;
                            }
                            break Label_3151;
                        }
                        case 19: {
                            if (a) {
                                b2 = false;
                                this.X();
                            }
                            break Label_3151;
                        }
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 28:
                        case 29: {
                            if (a) {
                                i.ah = 0;
                                this.l = 0;
                                this.j = 0;
                                n4 = 0;
                                break;
                            }
                            if ((this.k & 0x2000) == 0x0 && b.e == 2 && b.f == 0) {
                                final int n9 = this.h - i.g[this.k & 0x7];
                                final int n10 = this.i - i.g[(this.k & 0x7) + 8];
                                if (i.i[9] >= 8 && b.e == 2 && b.f == 0) {
                                    this.c(n9, n10, -1);
                                }
                                final int n11 = n9;
                                final byte b9 = (byte)n10;
                                final int n12 = n11;
                                final int[] array2 = { 0, 1, -1, 0, 0 };
                                final int[] array3 = { 0, 0, 0, 1, -1 };
                                int n13 = 0;
                                final boolean b10 = i.i[9] >= 8;
                                boolean b11 = false;
                                Label_2313: {
                                    int d2 = 0;
                                    switch (i.a[n12][b9]) {
                                        case 9: {
                                            if ((this.k & 0x2000) == 0x0) {
                                                this.k |= 0x2000;
                                                n13 = 1;
                                                final int n14 = n12;
                                                final byte b12 = b9;
                                                final int n16;
                                                final int n15 = n16 = n14;
                                                final byte b13 = b12;
                                                final int n17 = n16;
                                                boolean b14 = false;
                                                Label_1887: {
                                                    if (i.e != null) {
                                                        for (int l = 0; l < i.e.length; l += 3) {
                                                            if (i.e[l + 2] == b13 && (i.e[l] - 1 == n17 || i.e[l + 1] + 1 == n17)) {
                                                                b14 = true;
                                                                break Label_1887;
                                                            }
                                                        }
                                                    }
                                                    b14 = false;
                                                }
                                                if (!b14) {
                                                    k(n15, b12);
                                                    final int n18 = this.c(n15, b12 - 1) ? 2 : 1;
                                                    switch ((i.b[n15][b12] & 0xFC00000) >> 22) {
                                                        case 39: {
                                                            i.a[n15][b12] = 49;
                                                            i.b[n15][b12] = n18;
                                                            break;
                                                        }
                                                        case 37: {
                                                            byte[] array4;
                                                            byte b15;
                                                            int n19;
                                                            if ((i.b[n15][b12] & 0x10000000) != 0x0) {
                                                                array4 = i.a[n15];
                                                                b15 = b12;
                                                                n19 = 43;
                                                            }
                                                            else {
                                                                array4 = i.a[n15];
                                                                b15 = b12;
                                                                n19 = 19;
                                                            }
                                                            array4[b15] = (byte)n19;
                                                            i.b[n15][b12] = n18;
                                                            this.b(19, n15, (int)b12);
                                                            break;
                                                        }
                                                        case 35: {
                                                            i.a[n15][b12] = 45;
                                                            i.b[n15][b12] = ((i.b[n15][b12] & 0xFFFFFFF0) | 0xA);
                                                            break;
                                                        }
                                                        case 34: {
                                                            i.a[n15][b12] = 1;
                                                            this.c(n15, (int)b12);
                                                            break;
                                                        }
                                                        case 36: {
                                                            i.a[n15][b12] = 46;
                                                            i.b[n15][b12] = 0;
                                                            i.b[n15][b12] = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            break Label_2313;
                                        }
                                        case 18: {
                                            d2 = (this.d() ? 1 : 0);
                                            break;
                                        }
                                        case 0: {
                                            b11 = true;
                                            break Label_2313;
                                        }
                                        case 30: {
                                            n13 = 1;
                                            if (i.b[n12][b9] == 0) {
                                                this.p(11);
                                                i.b[n12][b9] = 1;
                                            }
                                            break Label_2313;
                                        }
                                        case 10: {
                                            if (this.x == 3 && i.b[n12][b9] <= 0) {
                                                n13 = 1;
                                                i.b[n12][b9] = 1;
                                                this.b(n12, (int)b9);
                                            }
                                            break Label_2313;
                                        }
                                        case 16: {
                                            n13 = 1;
                                            b11 = true;
                                            break Label_2313;
                                        }
                                        default: {
                                            if (i.a[n12][b9] - 80 >= 0 || ((i.a[n12][b9] & 0xFF) == 0x7 && (i.a[n12][b9] >> 8 & 0xF0) == 0x0)) {
                                                b11 = true;
                                                d2 = 1;
                                                break;
                                            }
                                            break Label_2313;
                                        }
                                    }
                                    n13 = d2;
                                }
                                if (b11) {
                                    j(200);
                                    this.p(6);
                                    this.g(41 + (this.k & 0x7) - 1);
                                }
                                if (n13 == 0) {
                                    for (int n20 = 0; n20 < 5; ++n20) {
                                        final int n21 = n12 + array2[n20];
                                        final int n22 = b9 + array3[n20];
                                        if (n21 >= 0 && n21 < this.e && n22 >= 0 && n22 < this.f) {
                                            final byte b16 = i.a[n21][n22];
                                            int n23 = 0;
                                            boolean b17 = false;
                                            switch (b16) {
                                                case 1: {
                                                    if (n21 == this.h - i.g[this.k & 0x7] && n22 == this.i - i.g[(this.k & 0x7) + 8]) {
                                                        b17 = true;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 19:
                                                case 43:
                                                case 45:
                                                case 46:
                                                case 49: {
                                                    final int n24;
                                                    final byte b18 = (byte)(((n24 = (i.b[n21][n22] & 0x7)) == 0) ? 0 : i.b[n21][n22]);
                                                    final boolean b19 = b16 != 49 && b16 != 46;
                                                    if (a(n12, b9, 0, 0, n21, n22, n24, b18)) {
                                                        b17 = true;
                                                        n23 = (b19 ? 1 : 0);
                                                    }
                                                    if (b17) {
                                                        this.p(10);
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            if (b10 && b17 && (n21 != this.h || n22 != this.i)) {
                                                if (this.a(n21, n22)) {
                                                    this.k |= 0x2000;
                                                }
                                            }
                                            else if (n23 != 0) {
                                                this.k |= 0x2000;
                                                if (b16 == 45) {
                                                    int n25;
                                                    if ((n25 = (i.b[n21][n22] & 0x1C00) >> 10) == 3) {
                                                        i.a[n21][n22] = -1;
                                                        this.j(n21, n22);
                                                    }
                                                    else {
                                                        ++n25;
                                                        i.b[n21][n22] = (0xA | n25 << 10);
                                                        i.b[n21][n22] = ((i.b[n21][n22] & 0xFFFFFF07) | 0x78);
                                                        i.b[n21][n22] = 0;
                                                    }
                                                }
                                                else {
                                                    this.b(b16, n21, n22);
                                                }
                                            }
                                        }
                                    }
                                }
                                this.a = 0;
                                i.ah = 0;
                            }
                            break Label_3151;
                        }
                        case 11: {
                            if (i.a[this.h][this.i - 1] == -1) {
                                n4 = 0;
                                break;
                            }
                            if (a && i.a[this.h][this.i - 1] != -1) {
                                this.b = 0L;
                                this.a(i.i[8], 32, 0);
                            }
                            break Label_3151;
                        }
                        case 17:
                        case 18: {
                            if (a) {
                                n2 = 0 + (this.k & 0x7) - 1;
                                this.j = 0;
                                break Label_3151;
                            }
                            if (b.e > 0 && this.aF != -1) {
                                final int n26 = ((this.k & 0x7) == 0x2) ? (this.h + 1) : (this.h - 1);
                                final int n27 = i.a[n26][this.i] >> 8;
                                final int n28 = i.a[n26][this.i] & 0xFF;
                                final int n29 = n27 | 0x100;
                                if (n28 == 9) {
                                    --this.aU;
                                }
                                else {
                                    --this.aV;
                                }
                                i.a[n26][this.i] = (n29 << 8 | n28);
                                this.h(n29 & 0xFF);
                                final int n30 = -1;
                                this.aH = n30;
                                this.aF = n30;
                            }
                            break Label_3151;
                        }
                        case 10: {
                            if (a) {
                                this.k &= 0xFFFFF7FF;
                                n3 = this.c();
                                break Label_3150;
                            }
                            this.b = 40L;
                            break Label_3151;
                        }
                        case 12: {
                            if (this.bl < 160) {
                                this.bl += 12;
                            }
                            break Label_3151;
                        }
                        default: {
                            n4 = 36;
                            break;
                        }
                    }
                    n3 = n4 + (this.k & 0x7) - 1;
                }
            }
            n2 = n3;
        }
        i m;
        int ax;
        if (b3) {
            m = this;
            ax = this.ax - 1;
        }
        else {
            m = this;
            ax = 70;
        }
        m.ax = ax;
        if (n2 != -1) {
            this.g(n2);
        }
        if (b2) {
            b.b();
        }
        this.m = ((this.m > 0) ? (--this.m) : 0);
    }
    
    private int c() {
        int n;
        if (this.n <= 0) {
            this.p(2);
            n = 12;
            this.aW = 80;
        }
        else {
            n = 0 + (this.k & 0x7) - 1;
            this.k &= 0xFFFFFF8F;
            this.b = 40L;
        }
        this.l = 0;
        return n;
    }
    
    private static void j(final int n) {
        if (i.m) {
            i.a.a.vibrate(200);
        }
    }
    
    private void Z() {
        if (this.o <= 0) {
            final int n = (this.bi > 0) ? 1 : -1;
            this.bi -= n;
            if (this.bi != 0) {
                if (i.a[this.bg][this.bh] == 48) {
                    final int n2 = this.bh + (((i.b[this.bg][this.bh] & 0x8) == 0x0) ? -1 : 1);
                    if (i.a[this.bg + n][n2] >= 0) {
                        int h = this.h;
                        while (true) {
                            final int n3 = h - n;
                            if (i.a[n3][this.i] != 32) {
                                break;
                            }
                            i.a[n3][this.i] = -1;
                            h = n3;
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
            k(this.bg - n, this.bh);
            return;
        }
        this.o -= 6;
        i.b[this.bg][this.bh] = this.o;
        if ((this.bi == 1 || this.bi == -1) && this.o <= 6 && (this.k & 0x70) == 0x0) {
            this.g(((this.k & 0x7) == 0x4) ? 23 : 21);
        }
    }
    
    private void aa() {
        int n = i.k[this.aC << 1] - this.h;
        int n2 = i.k[(this.aC << 1) + 1] - this.i;
        if (this.k == 2 && this.aC == 2) {
            n = 10;
            n2 = -8;
        }
        i i;
        int an;
        if (n2 == 0) {
            if (n < 0) {
                i = this;
                an = 12;
            }
            else {
                i = this;
                an = 4;
            }
        }
        else if (n == 0) {
            if (n2 < 0) {
                i = this;
                an = 0;
            }
            else {
                i = this;
                an = 8;
            }
        }
        else {
            final int n3;
            if ((n3 = (n << 7) / n2) > 0) {
                if (n3 < 128) {
                    if (n > 0) {
                        i = this;
                        an = 7;
                    }
                    else {
                        i = this;
                        an = 15;
                    }
                }
                else if (n3 > 128) {
                    if (n > 0) {
                        i = this;
                        an = 5;
                    }
                    else {
                        i = this;
                        an = 13;
                    }
                }
                else if (n > 0) {
                    i = this;
                    an = 6;
                }
                else {
                    i = this;
                    an = 14;
                }
            }
            else if (n3 > -128) {
                if (n < 0) {
                    i = this;
                    an = 9;
                }
                else {
                    i = this;
                    an = 1;
                }
            }
            else if (n3 < -128) {
                if (n < 0) {
                    i = this;
                    an = 11;
                }
                else {
                    i = this;
                    an = 3;
                }
            }
            else if (n < 0) {
                i = this;
                an = 10;
            }
            else {
                i = this;
                an = 2;
            }
        }
        i.an = an;
    }
    
    private void f(final int n, final int n2) {
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                if (this.c((this.a + n) / 24 + j, (this.b + n2) / 24 + i)) {
                    this.a(1, 48, 0);
                }
            }
        }
    }
    
    private void ab() {
        final int d = this.d();
        if (this.h == d || this.h == d + 1) {
            final b b;
            final int n = (b = i.a[5]).b - 40;
            final int n2 = b.b + 256;
            final byte b2 = b.a.c[(b.a.a[b.d] + b.e) * 5 + 3];
            final int n3 = n - b2;
            final int n4 = n2 - b2;
            final int b3;
            if ((b3 = i.a[0].b) > n3 && b3 < n4 && !this.j) {
                this.a(1, 48, (this.h == d) ? 4 : 2);
            }
        }
    }
    
    private static void g(final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = -1;
        i.a[n + 1][n2] = -1;
    }
    
    private static void h(final int n, final int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = 50;
        i.a[n + 1][n2] = 50;
    }
    
    private boolean b(final int n, int n2) {
        n2 = 0;
        for (int i = n; i <= n + 1; ++i) {
            for (int j = 8; j >= 7; --j) {
                if (i.a[i][j] == 0) {
                    this.d(i, j);
                    k(i, j);
                    i.a[i][j] = -1;
                    this.b(i, j);
                    n2 = 1;
                }
            }
        }
        return n2 != 0;
    }
    
    private int d() {
        return 10 + this.ar * (((this.ar > 0) ? 1 : 0) + 2);
    }
    
    private int e() {
        final b b;
        return this.f * ((b = i.a[5]).b - 40 - b.a.c[(b.a.a[b.d] + b.e) * 5 + 3] + this.b) / (this.f * 24);
    }
    
    private boolean e() {
        final int d = this.d();
        final int e = this.e();
        boolean b = false;
        for (int i = d; i <= d + 1; ++i) {
            for (int j = e; j <= 10; ++j) {
                if (i.a[i][j] == 0) {
                    this.d(i, j);
                    k(i, j);
                    i.a[i][j] = -1;
                    this.b(i, j);
                    b = true;
                }
            }
        }
        return b;
    }
    
    private void ac() {
        this.bj = 30;
        if (i.a[this.P][this.R] == -1) {
            i.a[this.P][this.O] = 0;
            k(this.P, this.O);
        }
        if (i.a[this.Q][this.R] == -1) {
            i.a[this.Q][this.O] = 0;
            k(this.Q, this.O);
        }
    }
    
    private void ad() {
        this.ao = -1;
        this.aq = 5;
    }
    
    public final void a() {
        final byte b = (byte)(((this.k & 0x1000) == 0x0) ? this.l : 0);
        final int n = this.h * 24 + this.j * i.g[b];
        final int n2 = 24 * this.e - 240;
        final int d = 24 * this.f - 240;
        Label_0141: {
            i i;
            int c;
            if (n < this.c + 96) {
                this.c = this.c - 96 + n >> 1;
                if (this.c >= 0) {
                    break Label_0141;
                }
                i = this;
                c = 0;
            }
            else {
                if (n <= this.c + 120) {
                    break Label_0141;
                }
                this.c = this.c - 120 + n >> 1;
                if (this.c <= n2) {
                    break Label_0141;
                }
                i = this;
                c = n2;
            }
            i.c = c;
        }
        final int n3;
        if ((n3 = this.i * 24 + this.j * i.g[b + 8] + 40) < this.d + 96) {
            this.d = this.d - 96 + n3 >> 1;
            if (this.d < 0) {
                this.d = 0;
            }
        }
        if (n3 > this.d + 160) {
            this.d = this.d - 160 + n3 >> 1;
            if (this.d > d) {
                this.d = d;
            }
        }
        this.a = this.c;
        this.b = this.d;
        Label_0288: {
            i j;
            int a;
            if (this.a < 0) {
                j = this;
                a = 0;
            }
            else {
                if (this.a <= n2) {
                    break Label_0288;
                }
                j = this;
                a = n2;
            }
            j.a = a;
        }
        i k;
        i l;
        int d2;
        int b2;
        if (this.b < 0) {
            k = this;
            l = this;
            b2 = (d2 = 0);
        }
        else {
            if (this.b <= d) {
                return;
            }
            k = this;
            l = this;
            b2 = (d2 = d);
        }
        l.d = d2;
        k.b = b2;
    }
    
    private void b(int n, int n2, final byte b) {
        while ((i.a[n][n2] & 0xFF) == b) {
            i.a[n][n2] = -1;
            this.b(n - 1, n2, b);
            this.b(n + 1, n2, b);
            this.b(n, n2 - 1, b);
            final i i = this;
            final int n3 = n;
            ++n2;
            n = n3;
            this = i;
        }
    }
    
    private boolean a(int n, int n2, final boolean b) {
        int n3 = 0;
        final int k = this.k;
        int h = this.h;
        int i = this.i;
        byte l = this.l;
        boolean x = this.x;
        int ax = this.aX;
        int j = this.j;
        final int aw = this.aW;
        int n4;
        int n5;
        if (n > 0) {
            n4 = (k & 0xFFFFFFF8);
            n5 = 2;
        }
        else if (n < 0) {
            n4 = (k & 0xFFFFFFF8);
            n5 = 4;
        }
        else if (n2 < 0) {
            n4 = (k & 0xFFFFFFF8);
            n5 = 1;
        }
        else {
            n4 = (k & 0xFFFFFFF8);
            n5 = 3;
        }
        int m = n4 | n5;
        final int n6 = h + n;
        final int n7 = i + n2;
        boolean b2 = false;
        boolean b3 = false;
        if (n6 < 0 || n6 >= this.e || n7 < 0 || n7 >= this.f) {
            b2 = true;
        }
        else {
            if (i.e != null && i.e[n6][n7] != 0 && i.i[10] == 0) {
                b2 = false;
                n3 = 1;
            }
            Label_0738: {
                int n10 = 0;
                switch ((byte)i.a[n6][n7]) {
                    case 19: {
                        if (b) {
                            break Label_0738;
                        }
                        int n8;
                        int n9;
                        for (n8 = n6 + 3, n9 = n7; i.a[n8][n9] != 39; --n9) {}
                        if (!this.l) {
                            this.ar();
                        }
                        this.l = true;
                        this.al = false;
                        if (i.e == null) {
                            i.e = new int[this.e][this.f];
                        }
                        this.a((byte)i.b[n8][n9], (byte)n8, (byte)n9, (byte)0);
                        this.m(n8, n9);
                        while (true) {
                            ++n9;
                            if ((i.a[n6][n9] & 0xFF) != 0x13) {
                                break Label_0738;
                            }
                            i.a[n6][n9] = -1;
                        }
                        break;
                    }
                    case 1: {
                        if (!b) {
                            this.bj = 120;
                            ++this.am;
                            this.b(n6, n7, (byte)1);
                        }
                        break Label_0738;
                    }
                    case 7: {
                        if ((i.a[n6][n7] >> 8 & 0xF0) >> 4 < 2) {
                            n10 = 1;
                            break;
                        }
                        break Label_0738;
                    }
                    case 4: {
                        final int n11;
                        if (!b && (n11 = (i.a[n6][n7] & 0xFFFFFF00) >> 8) >= this.aC) {
                            this.w = true;
                            this.aC = n11 + 1;
                            this.ak = i.aS + 13;
                        }
                        break Label_0738;
                    }
                    case 28: {
                        if (!b) {
                            x = true;
                            this.at = false;
                        }
                        break Label_0738;
                    }
                    case 5: {
                        b2 = true;
                        if (!b) {
                            x = true;
                            this.at = true;
                        }
                        break Label_0738;
                    }
                    case 2: {
                        if (!b) {
                            b3 = true;
                            i i2 = null;
                            int ae = 0;
                            Label_0701: {
                                i i3 = null;
                                int ad = 0;
                                Label_0696: {
                                    switch (i.a[n6][n7] >> 8) {
                                        case 0: {
                                            if (i.i[9] >= 1) {
                                                this.aD = 7;
                                                i2 = this;
                                                ae = 0;
                                                break Label_0701;
                                            }
                                            i3 = this;
                                            break;
                                        }
                                        case 1: {
                                            if (i.i[9] >= 2) {
                                                i3 = this;
                                                ad = 7;
                                                break Label_0696;
                                            }
                                            i3 = this;
                                            break;
                                        }
                                        default: {
                                            break Label_0738;
                                        }
                                    }
                                    ad = 13;
                                }
                                i3.aD = ad;
                                i2 = this;
                                ae = 1;
                            }
                            i2.aE = ae;
                        }
                        break Label_0738;
                    }
                    case 6: {
                        break Label_0738;
                    }
                    case 3: {
                        if (i.a[n6][n7] >> 8 < 3) {
                            b2 = true;
                            break Label_0738;
                        }
                        b2 = false;
                        n10 = 1;
                        break;
                    }
                }
                n3 = n10;
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
                        final int n12 = h + (n << 1);
                        n2 = i + (n2 << 1);
                        if (this.k == 4) {
                            final int d = this.d();
                            if ((n12 == d || n12 == d + 1) && n2 >= this.e()) {
                                this.g((((m | 0x8) & 0x7) == 0x2) ? 8 : 9);
                                return false;
                            }
                        }
                        --ax;
                        final int n13 = i.a[n12][n2] & 0xFF;
                        final int n14 = i.a[n12][n2] >> 8;
                        final byte b5 = i.a[n6][i + 1];
                        if ((ax < 0 || b) && n != 0 && e(n12, n2) && (n13 != 7 || (n14 & 0xF0) != 0x0) && ((b5 != 19 && b5 != 45 && b5 != 49 && b5 != 43) || (i.a[n6][i + 1] & 0xFF) == 0x23)) {
                            if (!b) {
                                final int n15 = n6;
                                final int n16 = n7;
                                final boolean b6 = n > 0;
                                final byte b7 = b4;
                                final boolean b8 = b6;
                                final int n17 = n16;
                                final int n18 = n15;
                                final int n19 = b8 ? (n18 + 1) : (n18 - 1);
                                final int n20 = i.b[n18][n17];
                                i.a[n19][n17] = b7;
                                i.a[n18][n17] = -1;
                                i.b[n19][n17] = 18;
                                int n21;
                                int n22;
                                if (b8) {
                                    n21 = (((n20 & 0xFFFFFFF8) | 0x2) & 0xFFFFF3FF);
                                    n22 = 1024;
                                }
                                else {
                                    n21 = (((n20 & 0xFFFFFFF8) | 0x4) & 0xFFFFF3FF);
                                    n22 = 2048;
                                }
                                i.b[n19][n17] = (((n21 | n22) & 0xFFFFFDFF) | Integer.MIN_VALUE);
                                k(n19, n17);
                                this.b(n18, n17);
                            }
                            b2 = true;
                            m |= 0x8;
                            break;
                        }
                        if (n != 0) {
                            m |= 0x8;
                        }
                        l = 0;
                        i.b[n6][n7] &= 0xFFFFFFF8;
                        break;
                    }
                    case 48: {
                        final int n23 = h + (n << 1);
                        n2 = i + (n2 << 1);
                        --ax;
                        int n24;
                        int n25;
                        if ((i.b[n6][n7] & 0x8) != 0x0) {
                            n24 = 0;
                            n25 = 1;
                        }
                        else {
                            n24 = -1;
                            n25 = 0;
                        }
                        final int n26 = n25;
                        if ((ax < 0 || b) && n != 0 && i.a[n23][n2 + n24] < 0 && i.a[n23][n2 + n26] < 0 && i.a[n6][n7 + n26 + 1] >= 0) {
                            if (!b) {
                                i.a[n23][n2 + n24] = b4;
                                i.a[n23][n2 + n26] = b4;
                                i.a[n6][n7 + n24] = -1;
                                i.a[n6][n7 + n26] = -1;
                                i.b[n23][n2 + n24] = i.b[n6][n7 + n24];
                                i.b[n23][n2 + n26] = ((i.b[n6][n7 + n26] & 0xFFFFFFF0) | ((n > 0) ? 2 : 4));
                                i.b[n23][n2 + n26] = 18;
                                i.c[n23][n2 + n24 - 1] = 48;
                                i.c[n23][n2 + n24 - 1] = 48;
                                i.c[n23][n2 + n24 - 1] = 48;
                                k(n23, n2 + n26);
                            }
                            b2 = true;
                            m |= 0x8;
                            break;
                        }
                        if (n != 0) {
                            m |= 0x8;
                        }
                        l = 0;
                        break;
                    }
                    case -1: {
                        Label_1991: {
                            boolean b9;
                            if (n6 == 0 || n7 == 0 || n6 == this.e - 1 || n7 == this.f - 1) {
                                b9 = true;
                            }
                            else {
                                if (((n != 0 && i.a[n6][i + 1] == 0 && (i.b[n6][i + 1] & 0x7) == 0x3) || (this.aN >= 24 && ((i.a[n6][n7 - 1] == 28 && (i.b[n6][n7 - 1] & 0x8) == 0x0) || (i.a[n6][n7 + 1] == 28 && (i.b[n6][n7 + 1] & 0x8) == 0x0))) || (this.aP >= 24 && (i.a[n6][n7 - 1] == 28 || i.a[n6][n7 + 1] == 28))) && !b) {
                                    l = 0;
                                    break Label_1991;
                                }
                                b9 = true;
                            }
                            b2 = b9;
                        }
                        m &= 0xFFFFFFF7;
                        break;
                    }
                    case 28: {
                        l = 0;
                        m &= 0xFFFFFFF7;
                        break;
                    }
                    default: {
                        n = 0;
                        b2 = false;
                        if (this.l == 4 || this.l == 2) {
                            this.g(0 + this.l - 1);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        if (!b && b2 && !b3) {
            this.aD = -1;
        }
        if (b2 && aw == 0) {
            j = 18;
            h += n;
            i = n7;
            if ((m & 0x8) == 0x0 && !b) {
                this.g(l + 4 - 1);
            }
        }
        else if (n != 0 && !b) {
            m |= 0x8;
        }
        if ((m & 0x8) != 0x0 && !b) {
            this.g(((m & 0x7) == 0x2) ? 8 : 9);
        }
        if (!b) {
            this.k = m;
            this.h = h;
            this.i = i;
            this.l = l;
            this.x = x;
            this.aX = ax;
            this.j = j;
            this.aW = aw;
        }
        return b2;
    }
    
    public static void b() {
        i.b = 3;
    }
    
    private void ae() {
        i.b = 2;
        i.V = true;
        this.a(1);
        (this = this).o = true;
        if (i.a[18] == null) {
            i.a[18] = a("/ui.f", 3, 0, 0);
        }
    }
    
    public final void c() {
        this.l = System.currentTimeMillis() - this.a;
        this.af = true;
        System.out.println(j.a());
        this.a.e();
    }
    
    public final void showNotify() {
        if (this.af) {
            this.d();
        }
    }
    
    public final void hideNotify() {
        if (!this.af) {
            this.c();
        }
    }
    
    public final void d() {
        this.af = false;
        i.V = true;
        i.W = true;
        this.d = true;
        i.ah = 0;
        this.db = -1;
        if (this.bo == 7) {
            this.bq = 0;
        }
        this.a = System.currentTimeMillis() - this.l;
        i i = null;
        switch (i.b) {
            case 0:
            case 6:
            case 12:
            case 22: {
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
            case 1: {
                this.a.setClip(0, 0, 240, 320);
                this.a.setColor(0);
                this.a.fillRect(0, 0, 240, 320);
                this.o = true;
                if (i.a) {
                    this.o = true;
                    this.G();
                    return;
                }
                if (this.a != null) {
                    return;
                }
                if (this.ay != 0) {
                    return;
                }
                if (this.x) {
                    return;
                }
                if (this.n <= 0) {
                    return;
                }
                if (i.a[0].d == 19) {
                    return;
                }
                if (this.E) {
                    return;
                }
                this.ae();
                return;
            }
            case 5: {
                this.R = true;
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
                this.Q = true;
                return;
            }
            case 16: {
                this.az = 0;
                this.bb = 0;
                this.p = false;
                this.ag = 0;
                this.D = true;
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
                this.av();
                return;
            }
            case 23: {
                return;
            }
            case 27: {
                this.av = true;
                this.g = true;
                return;
            }
            case 2: {
                i.f = null;
                if (i.a) {
                    this.o = true;
                    this.G();
                }
                this.o = true;
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
        i.av = true;
    }
    
    private void af() {
        if (!this.l) {
            return;
        }
        for (int i = 0; i < this.e; ++i) {
            for (int j = 0; j < this.f; ++j) {
                if (i.a[i][j] == 38) {
                    this.a((byte)i.b[i][j], (byte)i, (byte)j, (byte)0);
                    ++this.du;
                }
            }
        }
    }
    
    private void i(final int n, final int n2) {
        this.c |= 0x400000L;
        final int[] array = i.a[n];
        array[n2] &= 0xFFFFFF00;
        final int[] array2 = i.a[n];
        array2[n2] |= 0xE;
    }
    
    private boolean f() {
        return this.k == 4 || this.k == 5 || this.k == 3;
    }
    
    private void a(int n, int n2, int n3, int n4, final int n5) {
        while (n + n3 > 0 && n + n3 < this.e && n2 + n4 > 0 && n2 + n4 < this.f) {
            final int n6;
            switch (n6 = (i.a[n + n3][n2 + n4] & 0xFF)) {
                case 8:
                case 9: {
                    final int n7 = i.a[n + n3][n2 + n4] >> 8;
                    i.a[n + n3][n2 + n4] = (((n5 == 1) ? (n7 | 0x200) : (n7 & 0xFFFFFDFF)) << 8 | n6);
                    this.a(n + n3, n2 + n4, n3, n4, n5);
                    final i i = this;
                    final int n8 = n + n3;
                    final int n9 = n2 + n4;
                    final int n10 = 0;
                    n4 = 1;
                    n3 = n10;
                    n2 = n9;
                    n = n8;
                    this = i;
                    continue;
                }
                default: {}
            }
        }
    }
    
    private boolean c(final int n, final int n2) {
        return n == this.h && n2 == this.i;
    }
    
    private void k(final int n) {
        final byte b = 0;
        this.l = b;
        this.a = b;
        for (int i = 0; i < i.p.length; ++i) {
            if (i.p[i] == n) {
                this.a = i.a[i];
            }
        }
        this.a.a();
    }
    
    private boolean g() {
        Label_0081: {
            if (this.a < this.ci) {
                this.a += this.ck;
                if (this.a <= this.ci) {
                    break Label_0081;
                }
            }
            else {
                if (this.a <= this.ci) {
                    break Label_0081;
                }
                this.a -= this.ck;
                if (this.a >= this.ci) {
                    break Label_0081;
                }
            }
            this.a = this.ci;
        }
        Label_0162: {
            if (this.b < this.cj) {
                this.b += this.ck;
                if (this.b <= this.cj) {
                    break Label_0162;
                }
            }
            else {
                if (this.b <= this.cj) {
                    break Label_0162;
                }
                this.b -= this.ck;
                if (this.b >= this.cj) {
                    break Label_0162;
                }
            }
            this.b = this.cj;
        }
        boolean b = false;
        boolean b2 = false;
        Label_0230: {
            if (this.a < 0) {
                this.a = 0;
            }
            else if (this.a > this.e * 24 - 240) {
                this.a = this.e * 24 - 240;
            }
            else if (this.a != this.ci) {
                break Label_0230;
            }
            b = true;
        }
        Label_0300: {
            if (this.b < 0) {
                this.b = 0;
            }
            else if (this.b > this.f * 24 - 320 + 80) {
                this.b = this.f * 24 - 320 + 80;
            }
            else if (this.b != this.cj) {
                break Label_0300;
            }
            b2 = true;
        }
        if (b && b2) {
            this.c = this.a;
            this.d = this.b;
            this.ax = 70;
            return true;
        }
        return false;
    }
    
    private void ag() {
        switch (this.cl) {
            case 1: {
                this.ck = 8;
                if (this.g()) {
                    this.cl = 2;
                    this.dl = 40;
                    return;
                }
                break;
            }
            case 2: {
                --this.dl;
                if (this.dl == 30) {
                    if ((i.a[this.dj][this.dk] >> 8 & 0xF0) != 0x0) {
                        this.e(this.dj, this.dk);
                        return;
                    }
                    break;
                }
                else {
                    if (this.dl == 0) {
                        this.cl = 3;
                        this.ci = this.h * 24 - 108;
                        this.cj = this.i * 24 - 108;
                        this.ck = 5;
                        this.e = i.a[i.l[i.cm]];
                        i.b.a(this.e);
                        this.di = 80;
                        return;
                    }
                    break;
                }
                break;
            }
            case 3: {
                if (this.g()) {
                    this.dl = 20;
                    this.cl = 4;
                    this.ax = 0;
                    return;
                }
                break;
            }
            case 4: {
                --this.dl;
                if (this.dl == 0) {
                    this.ax = 0;
                    this.cl = 0;
                    i.ak = true;
                    break;
                }
                break;
            }
        }
    }
    
    private void ah() {
        int n = this.h - 8;
        int n2 = this.h + 8;
        int n3 = this.i + 8;
        int n4 = this.i - 8;
        int n5 = 0;
        if (i.a[4] != null) {
            final int e;
            n5 = (((e = i.a[4].e) == 0) ? 0 : ((e <= 10) ? 1 : ((e <= 20) ? 2 : 3)));
        }
        if (n < 1) {
            n = 1;
        }
        if (n2 > this.e - 2) {
            n2 = this.e - 2;
        }
        if (n4 < 1) {
            n4 = 1;
        }
        if (n3 > this.f - 2) {
            n3 = this.f - 2;
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
                Label_8485: {
                    if (i.c[this.bE][this.bF] > 0 && !b) {
                        final byte[] array = i.c[this.bE];
                        final int bf2 = this.bF;
                        array[bf2] -= 6;
                        Label_2587: {
                            i m = null;
                            i i2 = null;
                            switch ((byte)i.a[this.bE][this.bF]) {
                                case 36: {
                                    int n6 = i.a[this.bE][this.bF] >> 8;
                                    int[] array2;
                                    int n7;
                                    int n8;
                                    if (++n6 >= 16) {
                                        array2 = i.a[this.bE];
                                        n7 = this.bF;
                                        n8 = -1;
                                    }
                                    else {
                                        i.c[this.bE][this.bF] = 24;
                                        array2 = i.a[this.bE];
                                        n7 = this.bF;
                                        n8 = (n6 << 8 | 0x24);
                                    }
                                    array2[n7] = n8;
                                    break Label_2587;
                                }
                                case 35:
                                case 37: {
                                    if (this.bE != this.bg || this.bF != this.bh || this.bi == 0) {
                                        final int be2 = this.bE;
                                        final int bf3 = this.bF;
                                        i.c[be2][bf3] = 24;
                                        Label_0929: {
                                            int n15;
                                            byte b4;
                                            byte[] array6 = null;
                                            if (i.b[be2][bf3] <= 0) {
                                                final int n9 = bf3 - 1;
                                                final int n10 = bf3 + 1;
                                                final byte b2;
                                                Label_0660: {
                                                    int[] array3;
                                                    int n11;
                                                    int n12;
                                                    if ((b2 = (byte)i.a[be2][n9]) == 34 || b2 == 37) {
                                                        array3 = i.a[be2];
                                                        n11 = n9;
                                                        n12 = 37;
                                                    }
                                                    else {
                                                        if (b2 == 35 || !d(be2, n9)) {
                                                            break Label_0660;
                                                        }
                                                        i.b[be2][n9] = 18;
                                                        array3 = i.a[be2];
                                                        n11 = n9;
                                                        n12 = 35;
                                                    }
                                                    array3[n11] = n12;
                                                }
                                                final byte b3 = i.a[be2][bf3];
                                                if (i.a[be2][n9] < 0 && !this.c(be2, n9) && b2 == 35 && b3 != 32 && b3 != 21 && i.a[be2][bf3] != -1) {
                                                    i.b[be2][n9] = 18;
                                                    i.a[be2][n9] = i.a[be2][bf3];
                                                    i.b[be2][n9] = ((i.b[be2][bf3] & 0xFFFFFFF8) | 0x1);
                                                    i.a[be2][bf3] = -1;
                                                    this.b(be2, bf3);
                                                }
                                                else {
                                                    this.c(be2, bf3);
                                                }
                                                if ((i.a[be2][n10] & 0xFF) != 0x23 && i.a[be2][n10] != 47) {
                                                    int[] array4;
                                                    int n13;
                                                    int n14;
                                                    if (i.a[be2][bf3] == 37) {
                                                        array4 = i.a[be2];
                                                        n13 = bf3;
                                                        n14 = 34;
                                                    }
                                                    else {
                                                        array4 = i.a[be2];
                                                        n13 = bf3;
                                                        n14 = -1;
                                                    }
                                                    array4[n13] = n14;
                                                }
                                                i.c[be2][n9] = 24;
                                                if (i.a[be2][bf3] >= 0) {
                                                    break Label_0929;
                                                }
                                                final byte[] array5 = i.b[be2];
                                                n15 = bf3;
                                                b4 = 18;
                                            }
                                            else {
                                                array6 = i.b[be2];
                                                b4 = (byte)(array6[n15 = bf3] - 6);
                                            }
                                            array6[n15] = b4;
                                        }
                                    }
                                    break Label_2587;
                                }
                                case 32: {
                                    int n16 = i.a[this.bE][this.bF] >> 8 & 0xFF;
                                    if ((i.aS & 0x1) == 0x0) {
                                        ++n16;
                                    }
                                    else if (n16 == 1) {
                                        this.b(this.bE, this.bF);
                                    }
                                    int[] array7;
                                    int n17;
                                    int n18;
                                    if (n16 == i.a[16].a(0)) {
                                        array7 = i.a[this.bE];
                                        n17 = this.bF;
                                        n18 = -1;
                                    }
                                    else {
                                        array7 = i.a[this.bE];
                                        n17 = this.bF;
                                        n18 = (n16 << 8 | 0x20);
                                    }
                                    array7[n17] = n18;
                                    i.c[this.bE][this.bF] = 24;
                                    break Label_2587;
                                }
                                case 26: {
                                    if (this.j <= 6 && this.c(this.bE, this.bF)) {
                                        i.ah = 0;
                                        this.a = 0;
                                        i.cm = i.a[this.bE][this.bF] >> 8;
                                        this.e(this.h + i.g[this.k & 0x7], this.i);
                                        if (i.cm < 0 || i.cm >= i.m.length) {
                                            i.cm = -1;
                                        }
                                        else {
                                            this.p(1);
                                            this.cl = 1;
                                            final int cm = i.cm;
                                            this.p(1);
                                            final int n19 = this.e - 1;
                                            for (int n20 = this.f - 1, k = 1; k < n20; ++k) {
                                                for (int l = 1; l < n19; ++l) {
                                                    if ((i.a[l][k] & 0xFF) == 0x11 && i.a[l][k] >> 8 == cm) {
                                                        int dj = -1;
                                                        int dk = 0;
                                                        Label_1363: {
                                                            int n21 = 0;
                                                            if (i.a[l][k] == 18) {
                                                                dj = l;
                                                                n21 = k;
                                                            }
                                                            else {
                                                                Label_1353: {
                                                                    switch (i.a[l][k - 1] & 0xFF) {
                                                                        case 7: {
                                                                            if ((i.a[l][k - 1] >> 8 & 0xF0) != 0x0) {
                                                                                break Label_1353;
                                                                            }
                                                                            break Label_1363;
                                                                        }
                                                                        case 14:
                                                                        case 33: {
                                                                            dj = l;
                                                                            n21 = k - 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            dk = n21;
                                                        }
                                                        if (dj != -1) {
                                                            this.dj = dj;
                                                            this.dk = dk;
                                                            this.ci = dj * 24 - 108;
                                                            this.cj = dk * 24 - 108;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i.a[this.bE][this.bF] = -1;
                                    }
                                    break Label_2587;
                                }
                                case 6: {
                                    final int be3 = this.bE;
                                    final int bf4 = this.bF;
                                    final int n22 = i.a[be3][bf4] >> 8;
                                    int n23 = (i(be3, bf4) || i.a[be3][bf4] == 47 || i.a[be3][bf4] == 48) ? 1 : 0;
                                    int n24 = i.b[be3][bf4];
                                    if (n23 == 0 && this.c(be3, bf4)) {
                                        n23 = 1;
                                        n24 = (((this.k & 0x1000) != 0x0) ? 0 : this.j);
                                    }
                                    if (n23 != 0 && n24 < 12) {
                                        this.h(n22);
                                        break Label_2587;
                                    }
                                    this.i(n22);
                                    break Label_2587;
                                }
                                case 33: {
                                    this.n(33);
                                    break Label_2587;
                                }
                                case 14: {
                                    this.n(14);
                                    break Label_2587;
                                }
                                case 2: {
                                    switch (i.a[this.bE][this.bF] >> 8) {
                                        case 0: {
                                            if (i.a[this.bE - 1][this.bF] != 30 && i.a[this.bE + 1][this.bF] != 30 && i.a[this.bE][this.bF - 1] != 30 && i.a[this.bE][this.bF + 1] != 30) {
                                                this.aD = -1;
                                                this.b(this.bE, this.bF, (byte)2);
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    break Label_2587;
                                }
                                case 3: {
                                    final int be4 = this.bE;
                                    final int bf5 = this.bF;
                                    int n25;
                                    if ((n25 = i.a[be4][bf5] >> 8) < 6) {
                                        switch (n25) {
                                            case -1: {
                                                if (Math.abs(this.h - be4) < 4 && Math.abs(this.i - bf5) < 4) {
                                                    n25 = 3;
                                                    break;
                                                }
                                                break;
                                            }
                                            case 0:
                                            case 1: {
                                                break;
                                            }
                                            case 2: {
                                                Label_1948: {
                                                    switch (this.l) {
                                                        case 1: {
                                                            if (this.c(be4, bf5 - 1)) {
                                                                break;
                                                            }
                                                            break Label_1948;
                                                        }
                                                        case 2: {
                                                            if (this.c(be4 + 1, bf5)) {
                                                                break;
                                                            }
                                                            break Label_1948;
                                                        }
                                                        case 3: {
                                                            if (this.c(be4, bf5 + 1)) {
                                                                break;
                                                            }
                                                            break Label_1948;
                                                        }
                                                        case 4: {
                                                            if (this.c(be4 - 1, bf5)) {
                                                                break;
                                                            }
                                                            break Label_1948;
                                                        }
                                                    }
                                                    n25 = 3;
                                                }
                                                break;
                                            }
                                            default: {
                                                if ((i.aS & 0x1) == 0x0) {
                                                    ++n25;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        i.c[be4][bf5] = 24;
                                        i.a[be4][bf5] = (n25 << 8 | 0x3);
                                        break Label_2587;
                                    }
                                    i.c[be4][bf5] = 0;
                                    break Label_2587;
                                }
                                case 30: {
                                    if (this.a == null && this.bm == -1 && this.c(this.bE, this.bF) && this.j <= 0) {
                                        this.bm = i.a[this.bE][this.bF] >> 8;
                                        i.a[this.bE][this.bF] = -1;
                                    }
                                    break Label_2587;
                                }
                                case 0: {
                                    if (this.a == null && this.bm == -1 && this.c(this.bE, this.bF) && this.j <= 6) {
                                        this.bm = i.a[this.bE][this.bF] >> 8;
                                        i.a[this.bE][this.bF] = -1;
                                    }
                                    break Label_2587;
                                }
                                case 7: {
                                    final int be5 = this.bE;
                                    final int bf6 = this.bF;
                                    int n27;
                                    final int n26;
                                    if ((n26 = ((n27 = i.a[be5][bf6] >> 8) & 0xF0) >> 4) != 0) {
                                        if (i.aS % 3 == 0 && n26 < 3) {
                                            n27 = ((n27 & 0xFFFFFF0F) | n26 + 1 << 4);
                                            if (n26 == 2) {
                                                final int n28;
                                                if ((n28 = (i.a[be5][bf6 - 1] & 0xFF)) == 9 || n28 == 8) {
                                                    i.a[be5][bf6 - 1] = ((i.a[be5][bf6 - 1] >> 8 & 0xFFFFFDFF) << 8 | n28);
                                                }
                                                this.a(be5, bf6 - 1, 1, 0, 0);
                                                this.a(be5, bf6 - 1, -1, 0, 0);
                                            }
                                            i.c[be5][bf6] = 24;
                                        }
                                        i.a[be5][bf6] = (n27 << 8 | 0x7);
                                    }
                                    break Label_2587;
                                }
                                case 8: {
                                    m = this;
                                    i2 = this;
                                    break;
                                }
                                case 9: {
                                    m = this;
                                    i2 = this;
                                    break;
                                }
                            }
                            final i i3 = i2;
                            final int be6 = m.bE;
                            final int bf7 = i3.bF;
                            final int n29 = i.a[be6][bf7] >> 8;
                            final int n30 = i.a[be6][bf7] & 0xFF;
                            final int d;
                            if ((n29 & 0x100) == 0x0 && ((n30 == 9 && i3.aU > 0) || (n30 == 8 && i3.aV > 0)) && i3.i == bf7 && (i3.h == be6 - 1 || i3.h == be6 + 1) && (d = i.a[0].d) != 18 && d != 17 && i3.j <= 6) {
                                final i i4 = i3;
                                final i i5 = i3;
                                final byte b5 = 0;
                                i5.a = b5;
                                i4.l = b5;
                                i i6;
                                int n31;
                                if (i3.h == be6 - 1) {
                                    i3.k = ((i3.k & 0xFFFFFFF8) | 0x2);
                                    i6 = i3;
                                    n31 = 18;
                                }
                                else {
                                    i3.k = ((i3.k & 0xFFFFFFF8) | 0x4);
                                    i6 = i3;
                                    n31 = 17;
                                }
                                i6.g(n31);
                                i i7;
                                int af;
                                if (n30 == 9) {
                                    i7 = i3;
                                    af = 24;
                                }
                                else {
                                    i7 = i3;
                                    af = 25;
                                }
                                i7.aF = af;
                                i3.aG = 0;
                            }
                        }
                        if ((i.a[this.bE][this.bF] & 0xF0000000) >> 28 > 0) {
                            int n32;
                            if ((n32 = (i.a[this.bE][this.bF] & 0xF0000000) >> 28) == 0) {
                                this.p(10);
                            }
                            if ((i.aS & 0x1) == 0x0) {
                                ++n32;
                            }
                            int[] array8;
                            int n33;
                            int n34;
                            if (n32 >= i.a[13].a(0)) {
                                array8 = i.a[this.bE];
                                n33 = this.bF;
                                n34 = (i.a[this.bE][this.bF] & 0xFFFFFFF);
                            }
                            else {
                                array8 = i.a[this.bE];
                                n33 = this.bF;
                                n34 = ((i.a[this.bE][this.bF] & 0xFFFFFFF) | n32 << 28);
                            }
                            array8[n33] = n34;
                            k(this.bE, this.bF);
                        }
                        i i10 = null;
                        i i11 = null;
                        int n98 = 0;
                        switch (i.a[this.bE][this.bF]) {
                            case 54: {
                                final int be7 = this.bE;
                                final int bf8 = this.bF;
                                int n35 = i.b[be7][bf8];
                                final f f = i.a[7];
                                ++n35;
                                final int a = a(f, 0);
                                if (n35 >= a) {
                                    i.a[be7][bf8] = -1;
                                    k(be7, bf8);
                                    break Label_8485;
                                }
                                if (n35 == 1) {
                                    this.p(7);
                                    k(be7, bf8);
                                }
                                else if (n35 == a >> 1) {
                                    for (int n36 = -1; n36 < 2; ++n36) {
                                        for (int n37 = -1; n37 < 2; ++n37) {
                                            final int n38 = be7 + n37;
                                            final int n39 = bf8 + n36;
                                            Label_3288: {
                                                int[] array9 = null;
                                                int n40 = 0;
                                                boolean b6 = false;
                                                Label_3216: {
                                                    switch (i.a[n38][n39]) {
                                                        case 10: {
                                                            if (this.x == 3) {
                                                                break Label_3216;
                                                            }
                                                            break Label_3288;
                                                        }
                                                        case 30:
                                                        case 37: {
                                                            array9 = i.b[n38];
                                                            n40 = n39;
                                                            b6 = true;
                                                            break;
                                                        }
                                                        case 16:
                                                        case 19:
                                                        case 43:
                                                        case 49: {
                                                            i.a[n38][n39] = -1;
                                                            this.j(n38, n39);
                                                            i.c[n38][n39] = 24;
                                                            break Label_3288;
                                                        }
                                                        case 8: {
                                                            i.a[n38][n39] = 54;
                                                            array9 = i.b[n38];
                                                            n40 = n39;
                                                            b6 = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                                array9[n40] = (b6 ? 1 : 0);
                                                k(n38, n39);
                                            }
                                            if (this.c(n38, n39)) {
                                                this.a(1, 64, 0);
                                            }
                                        }
                                    }
                                }
                                i.b[be7][bf8] = n35;
                                i.c[be7][bf8] = 24;
                                break Label_8485;
                            }
                            case 50: {
                                if (this.j < 12 && this.c(this.bE, this.bF) && !this.j) {
                                    this.a(1, 48, (int)i.h[this.k & 0x7]);
                                }
                                break Label_8485;
                            }
                            case 49: {
                                this.e((byte)49);
                                break Label_8485;
                            }
                            case 48: {
                                if ((i.b[this.bE][this.bF] & 0x8) == 0x0) {
                                    this.d((byte)48);
                                    break Label_8485;
                                }
                                this.ai();
                                break Label_8485;
                            }
                            case 46: {
                                final int be8 = this.bE;
                                final int bf9 = this.bF;
                                int n41 = i.b[be8][bf9] & 0x1F;
                                int n42 = (i.b[be8][bf9] & 0x1FE0) >> 5;
                                final int a2 = a(i.a[29], n41);
                                if ((i.a[be8][bf9] & 0xFF) == 0x23) {
                                    if (++n42 > a2) {
                                        n42 = 0;
                                    }
                                    i.b[be8][bf9] = (0x0 | n42 << 5);
                                    break Label_8485;
                                }
                                if (i.a[be8][bf9 + 1] < 0 && n41 != 8 && n41 != 9) {
                                    int n43 = 0;
                                    switch (n41) {
                                        case 0:
                                        case 2:
                                        case 4:
                                        case 6: {
                                            n43 = 8;
                                            break;
                                        }
                                        default: {
                                            n43 = 9;
                                            break;
                                        }
                                    }
                                    final int n44 = n43;
                                    i.b[be8][bf9 + 1] = 18;
                                    i.a[be8][bf9 + 1] = 46;
                                    i.a[be8][bf9] = -1;
                                    i.b[be8][bf9 + 1] = n44;
                                    k(be8, bf9);
                                    break Label_8485;
                                }
                                if (n41 == 8 || n41 == 9) {
                                    final byte[] array10 = i.b[be8];
                                    final int n45 = bf9;
                                    array10[n45] -= 6;
                                    if (i.b[be8][bf9] < 0) {
                                        if (i.a[be8][bf9 + 1] < 0) {
                                            i.b[be8][bf9 + 1] = 18;
                                            i.a[be8][bf9 + 1] = 46;
                                            i.a[be8][bf9] = -1;
                                            i.b[be8][bf9 + 1] = n41;
                                            k(be8, bf9);
                                        }
                                        else {
                                            i.b[be8][bf9] = ((n41 == 8) ? 10 : 11);
                                            i.b[be8][bf9] = 0;
                                        }
                                    }
                                    else if (a(be8, bf9, 3, i.b[be8][bf9], this.h, this.i, this.k & 0x7, this.j)) {
                                        this.a(1, 48, i.b[be8][bf9] & 0x7);
                                    }
                                }
                                else if (h(be8, bf9)) {
                                    i.a[be8][bf9] = -1;
                                    this.j(be8, bf9);
                                    k(be8, bf9);
                                }
                                else {
                                    Label_4803: {
                                        if (this.c(be8 - 1, bf9) || this.c(be8 + 1, bf9) || this.c(be8, bf9 - 1)) {
                                            Label_4035: {
                                                int n46;
                                                if (this.i == bf9 - 1) {
                                                    n46 = 17;
                                                }
                                                else if (this.h == be8 - 1) {
                                                    n46 = 16;
                                                }
                                                else {
                                                    if (this.h != be8 + 1) {
                                                        break Label_4035;
                                                    }
                                                    n46 = 15;
                                                }
                                                n41 = n46;
                                            }
                                            n42 = 0;
                                        }
                                        else {
                                            final int n47 = this.k & 0x7;
                                            if (this.h == be8 && this.j == 6 && (n47 == 4 || n47 == 2) && this.i < bf9 && i.a[be8][bf9 - 1] < 0 && bf9 * 24 <= this.b + 320 - 80) {
                                                int n48 = 0;
                                                switch (n41) {
                                                    case 0:
                                                    case 2: {
                                                        n48 = 6;
                                                        break;
                                                    }
                                                    case 1:
                                                    case 3: {
                                                        n48 = 7;
                                                        break;
                                                    }
                                                    default: {
                                                        break Label_4803;
                                                    }
                                                }
                                                n41 = n48;
                                                n42 = 0;
                                            }
                                            else if (this.i == bf9 && this.j == 6 && (n47 == 1 || n47 == 3) && n41 >= 0 && n41 <= 3 && ((this.h < be8 && i.a[be8 - 1][bf9] < 0 && be8 * 24 < this.a + 240) || (this.h > be8 && i.a[be8 + 1][bf9] < 0 && (be8 + 1) * 24 > this.a))) {
                                                n41 = ((this.h < be8) ? 4 : 5);
                                                n42 = 0;
                                            }
                                            else {
                                                ++n42;
                                                Label_4576: {
                                                    byte[] array11 = null;
                                                    int n50 = 0;
                                                    switch (n41) {
                                                        case 4: {
                                                            final int n49 = be8 - 1;
                                                            if (i.a[n49][bf9] < 0 && n42 == b(i.a[29], 4, 1)) {
                                                                i.a[n49][bf9] = 21;
                                                                i.b[n49][bf9] = 4;
                                                                i.b[n49][bf9] = 18;
                                                                array11 = i.c[n49];
                                                                n50 = bf9;
                                                                break;
                                                            }
                                                            break Label_4576;
                                                        }
                                                        case 5: {
                                                            final int n51 = be8 + 1;
                                                            if (i.a[n51][bf9] < 0 && n42 == b(i.a[29], 5, 1)) {
                                                                i.a[n51][bf9] = 21;
                                                                i.b[n51][bf9] = 2;
                                                                i.b[n51][bf9] = 18;
                                                                array11 = i.c[n51];
                                                                n50 = bf9;
                                                                break;
                                                            }
                                                            break Label_4576;
                                                        }
                                                        case 6:
                                                        case 7: {
                                                            final int n52 = bf9 - 1;
                                                            if (i.a[be8][n52] < 0 && n42 == b(i.a[29], n41, 1)) {
                                                                i.a[be8][n52] = 21;
                                                                i.b[be8][n52] = 1;
                                                                i.b[be8][n52] = 18;
                                                                array11 = i.c[be8];
                                                                n50 = n52;
                                                                break;
                                                            }
                                                            break Label_4576;
                                                        }
                                                    }
                                                    array11[n50] = 24;
                                                }
                                                if (n42 > a2) {
                                                    n42 = 0;
                                                    int n53 = 0;
                                                    switch (this.a(be8, bf9, this.h, this.i, false)) {
                                                        case 4: {
                                                            n53 = ((this.i == bf9 && n41 != 4 && be8 * 24 < this.a + 240) ? 4 : 0);
                                                            break;
                                                        }
                                                        case 2: {
                                                            n53 = ((this.i == bf9 && n41 != 5 && (be8 + 1) * 24 > this.a) ? 5 : 1);
                                                            break;
                                                        }
                                                        case 1: {
                                                            if (this.h == be8 && n41 != 6 && n41 != 7 && bf9 * 24 <= this.b + 320 - 80) {
                                                                n41 = ((n41 == 2) ? 6 : 7);
                                                                break Label_4803;
                                                            }
                                                            n41 = ((this.h < be8) ? 2 : 3);
                                                            break Label_4803;
                                                        }
                                                        default: {
                                                            n53 = ((this.h >= be8) ? 1 : 0);
                                                            break;
                                                        }
                                                    }
                                                    n41 = n53;
                                                }
                                            }
                                        }
                                    }
                                    i.c[be8][bf9] = 24;
                                    i.b[be8][bf9] = ((n41 & 0x1F) | n42 << 5);
                                }
                                break Label_8485;
                            }
                            case 45: {
                                final int be9 = this.bE;
                                final int bf10 = this.bF;
                                i.c[be9][bf10] = 24;
                                final int n54 = (i.b[be9][bf10] & 0x1C00) >> 10;
                                final int n55 = i.b[be9][bf10] & 0xF;
                                int n56 = 0;
                                final boolean b7 = (i.a[be9][bf10] & 0xFF) == 0x23;
                                if (n55 == 10) {
                                    n56 = 100;
                                }
                                else {
                                    for (int a3 = i.a[28].a(n55), n57 = 0; n57 < a3; ++n57) {
                                        n56 += i.a[28].a(n55, n57);
                                    }
                                }
                                int n58 = (i.b[be9][bf10] & 0x1FE000) >> 13;
                                ++n58;
                                i.b[be9][bf10] = ((i.b[be9][bf10] & 0xFFE01FFF) | n58 << 13);
                                byte[] array12;
                                int n59;
                                int n60;
                                if (n55 >= 4 && n55 <= 9) {
                                    array12 = i.b[be9];
                                    n59 = bf10;
                                    n60 = 12;
                                }
                                else {
                                    array12 = i.b[be9];
                                    n59 = bf10;
                                    n60 = 0;
                                }
                                array12[n59] = (byte)n60;
                                if (n58 > n56 >> 1) {
                                    if (!b7) {
                                        if (this.c(be9, bf10) && n55 != 10) {
                                            int n61 = 0;
                                            switch (n55) {
                                                case 4:
                                                case 5: {
                                                    n61 = 1;
                                                    break;
                                                }
                                                case 6: {
                                                    n61 = 2;
                                                    break;
                                                }
                                                case 7:
                                                case 8: {
                                                    n61 = 3;
                                                    break;
                                                }
                                                case 9: {
                                                    n61 = 4;
                                                    break;
                                                }
                                                default: {
                                                    n61 = i.h[this.k & 0x7];
                                                    break;
                                                }
                                            }
                                            this.a(1, 48, n61);
                                        }
                                        if (h(be9, bf10)) {
                                            i.a[be9][bf10] = -1;
                                            this.j(be9, bf10);
                                            break Label_8485;
                                        }
                                    }
                                    if (n58 >= n56) {
                                        k(be9, bf10);
                                        final int a4 = this.a(be9, bf10, this.h, this.i, true);
                                        int n62 = 0;
                                        switch (n55) {
                                            case 0:
                                            case 3:
                                            case 4:
                                            case 7:
                                            case 9: {
                                                n62 = 1;
                                                break;
                                            }
                                        }
                                        final boolean b8 = a4 == 4;
                                        int n63 = 0;
                                        int n64 = 0;
                                        int n65 = 0;
                                        Label_5529: {
                                            if (n62 != (b8 ? 1 : 0)) {
                                                n63 = (b8 ? 3 : 2);
                                                n64 = be9;
                                                n65 = bf10;
                                            }
                                            else {
                                                n64 = be9 - i.g[a4];
                                                n65 = bf10 - i.g[a4 + 8];
                                                int n66 = 0;
                                                if (b8) {
                                                    if (this.c(n64, n65) && n55 != 0) {
                                                        n63 = 0;
                                                        n64 = be9;
                                                        n65 = bf10;
                                                        break Label_5529;
                                                    }
                                                    switch (a4) {
                                                        case 1: {
                                                            n66 = 4;
                                                            break;
                                                        }
                                                        case 4: {
                                                            n66 = 9;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n66 = 7;
                                                            break;
                                                        }
                                                        default: {
                                                            n66 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    if (this.c(n64, n65) && n55 != 1) {
                                                        n63 = 1;
                                                        n64 = be9;
                                                        n65 = bf10;
                                                        break Label_5529;
                                                    }
                                                    switch (a4) {
                                                        case 1: {
                                                            n66 = 5;
                                                            break;
                                                        }
                                                        case 2: {
                                                            n66 = 6;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n66 = 8;
                                                            break;
                                                        }
                                                        default: {
                                                            n66 = 1;
                                                            break;
                                                        }
                                                    }
                                                }
                                                n63 = n66;
                                            }
                                        }
                                        if (i.a[n64][n65] >= 0 || b7) {
                                            if (n64 != be9 || n65 != bf10) {
                                                n63 = 0;
                                            }
                                            n64 = be9;
                                            n65 = bf10;
                                        }
                                        i.a[be9][bf10] = -1;
                                        i.b[n64][n65] = 0;
                                        i.b[n64][n65] = (n54 << 10 | n63);
                                        i.b[n64][n65] &= 0xFFE01FFF;
                                        i.a[n64][n65] = 45;
                                    }
                                }
                                Label_5806: {
                                    if (b7) {
                                        if (!this.c(be9, bf10) || n55 == 10) {
                                            break Label_5806;
                                        }
                                    }
                                    else {
                                        int n67 = be9;
                                        int n68 = bf10;
                                        switch (n55) {
                                            case 7:
                                            case 8: {
                                                --n68;
                                                break;
                                            }
                                            case 10: {
                                                n67 = -1;
                                                n68 = -1;
                                                break;
                                            }
                                            case 9: {
                                                ++n67;
                                                break;
                                            }
                                            case 6: {
                                                --n67;
                                            }
                                            case 4:
                                            case 5: {
                                                ++n68;
                                                break;
                                            }
                                        }
                                        if (!this.c(n67, n68)) {
                                            break Label_5806;
                                        }
                                    }
                                    this.a(1, 48, (int)i.h[this.k & 0x7]);
                                }
                                break Label_8485;
                            }
                            case 44: {
                                this.ak();
                                break Label_8485;
                            }
                            case 40: {
                                this.l(40);
                                break Label_8485;
                            }
                            case 36: {
                                final int be10 = this.bE;
                                final int bf11 = this.bF;
                                if (i.b[be10][bf11] == 0) {
                                    if (i.a[be10][bf11 - 1] == 11) {
                                        i.b[be10][bf11] = 1;
                                        this.al();
                                    }
                                }
                                else if (this.c(be10, bf11 - 1)) {
                                    this.a(1, 64, 0);
                                }
                                break Label_8485;
                            }
                            case 28: {
                                final int n69 = i.b[this.bE][this.bF];
                                final int n70 = this.bF + ((((n69 & 0x8) == 0x0) ? this.aO : this.aQ) - 1) * (((n69 & 0x7) == 0x3) ? 1 : -1);
                                if (this.c(this.bE, n70)) {
                                    this.a(2, 48, (int)i.h[this.k & 0x7]);
                                }
                                switch (i.a[this.bE][n70]) {
                                    case -1:
                                    case 28:
                                    case 32: {
                                        break;
                                    }
                                    default: {
                                        this.j(this.bE, n70);
                                        i.a[this.bE][n70] = -1;
                                        k(this.bE, n70);
                                        this.b(this.bE, n70);
                                        break;
                                    }
                                }
                                i.c[this.bE][this.bF] = 24;
                                break Label_8485;
                            }
                            case 16: {
                                final int be11 = this.bE;
                                final int bf12 = this.bF;
                                int n71;
                                int n72;
                                if (i.a[be11][bf12 + 1] != 16) {
                                    n71 = 0;
                                    n72 = -1;
                                }
                                else {
                                    n71 = 1;
                                    n72 = 0;
                                }
                                final int n73 = n72;
                                byte b9 = i.b[be11][bf12 + n71];
                                final int n75;
                                final int n74 = (((n75 = i.b[be11][bf12 + n71]) & 0x7) == 0x4) ? 4 : 2;
                                final boolean b10 = this.c(be11 - i.g[n74], bf12 + n71) || this.c(be11 - i.g[n74], bf12 + n73);
                                if (b9 <= 0 && b10 && this.j <= 12) {
                                    b9 = 36;
                                }
                                else if (b9 > 0) {
                                    if (n71 == 0) {
                                        --b9;
                                    }
                                    if ((b9 == 11 || (n71 == 0 && b9 < 11)) && b10) {
                                        this.a(1, 48, n75 & 0x7);
                                    }
                                    i.c[be11][bf12] = 24;
                                }
                                if (h(be11, bf12)) {
                                    this.p(14);
                                    i.a[be11][bf12 + n73] = -1;
                                    this.j(be11, bf12 + n73);
                                    i.a[be11][bf12 + n71] = -1;
                                    this.j(be11, bf12 + n71);
                                    break Label_8485;
                                }
                                i.b[be11][bf12 + n73] = n75;
                                i.b[be11][bf12 + n71] = n75;
                                if (n71 == 0) {
                                    i.b[be11][bf12 + n73] = b9;
                                    i.b[be11][bf12 + n71] = b9;
                                }
                                break Label_8485;
                            }
                            case 14: {
                                final int be12 = this.bE;
                                final int bf13 = this.bF;
                                int n77;
                                final int n76 = (n77 = i.b[be12][bf13]) >> 8 & 0xFF;
                                int n78 = ((n77 & 0x8) != 0x0) ? 4 : 2;
                                Label_7035: {
                                    if (n76 >= 20) {
                                        if (f(be12, bf13 + 1) || (n78 == 4 && (i.a[be12 - 1][bf13] < 0 || i.a[be12 - 1][bf13] == 16 || i.a[be12 - 1][bf13] == 19 || i.a[be12 - 1][bf13] == 43)) || (n78 == 2 && (i.a[be12 + 1][bf13] < 0 || i.a[be12 + 1][bf13] == 16 || i.a[be12 + 1][bf13] == 19 || i.a[be12 + 1][bf13] == 43))) {
                                            i.b[be12][bf13] = ((n77 & 0xFFFF00FF) | 0x1300);
                                        }
                                    }
                                    else {
                                        byte[] array13;
                                        int n79;
                                        int n80;
                                        if (n76 > 0) {
                                            i.b[be12][bf13] = ((n77 & 0xFFFF00FF) | n76 - 1 << 8);
                                            array13 = i.c[be12];
                                            n79 = bf13;
                                            n80 = 24;
                                        }
                                        else {
                                            final byte b11;
                                            if ((b11 = i.b[be12][bf13]) <= 0) {
                                                int n81 = be12;
                                                int n82 = bf13;
                                                Label_6947: {
                                                    if (f(be12, bf13 + 1)) {
                                                        n82 = bf13 + 1;
                                                        n78 = 3;
                                                    }
                                                    else {
                                                        if (n78 == 4) {
                                                            if (f(be12 - 1, bf13)) {
                                                                n81 = be12 - 1;
                                                                break Label_6947;
                                                            }
                                                            n78 = 0;
                                                            if (i.a[be12 - 1][bf13] == 16 || i.a[be12 - 1][bf13] == 19 || i.a[be12 - 1][bf13] == 43) {
                                                                break Label_6947;
                                                            }
                                                        }
                                                        else {
                                                            if (f(be12 + 1, bf13)) {
                                                                n81 = be12 + 1;
                                                                break Label_6947;
                                                            }
                                                            n78 = 0;
                                                            if (i.a[be12 + 1][bf13] == 16 || i.a[be12 + 1][bf13] == 19 || i.a[be12 + 1][bf13] == 43) {
                                                                break Label_6947;
                                                            }
                                                        }
                                                        n77 = ((n77 & 0xFFFF00FF) | 0x1400);
                                                    }
                                                }
                                                if (n81 != be12 || n82 != bf13) {
                                                    i.a[n81][n82] = 14;
                                                    k(n81, n82);
                                                    i.a[be12][bf13] = -1;
                                                    i.b[n81][n82] = 18;
                                                }
                                                i.b[n81][n82] = ((n77 & 0xFFFFFFF8) | n78);
                                                break Label_7035;
                                            }
                                            array13 = i.b[be12];
                                            n79 = bf13;
                                            n80 = (byte)(b11 - 6);
                                        }
                                        array13[n79] = (byte)n80;
                                    }
                                }
                                if (this.c(be12, bf13)) {
                                    this.a(1, 48, n78);
                                }
                                break Label_8485;
                            }
                            case 10: {
                                final int be13 = this.bE;
                                final int bf14 = this.bF;
                                if (i.b[be13][bf14] > 0) {
                                    i.a[be13][bf14] = -1;
                                    i.a[be13][bf14] = 32;
                                    k(be13, bf14);
                                    this.l(be13, bf14);
                                    i.c[be13][bf14] = 24;
                                }
                                break Label_8485;
                            }
                            case 21: {
                                final int be14 = this.bE;
                                final int bf15 = this.bF;
                                final int n83 = i.b[be14][bf15] & 0x7;
                                int n86;
                                byte b12;
                                byte[] array18 = null;
                                if ((i.b[be14][bf15] & 0x8) != 0x0) {
                                    int n84 = 0;
                                    switch (n83) {
                                        case 4: {
                                            n84 = 12;
                                            break;
                                        }
                                        case 2: {
                                            n84 = 13;
                                            break;
                                        }
                                        default: {
                                            n84 = 14;
                                            break;
                                        }
                                    }
                                    if (i.b[be14][bf15] >= a(i.a[29], n84) || (i.a[this.bE][this.bF] & 0xFF) == 0x23) {
                                        i.a[be14][bf15] = -1;
                                        k(be14, bf15);
                                    }
                                    else {
                                        final byte[] array14 = i.b[be14];
                                        final int n85 = bf15;
                                        ++array14[n85];
                                    }
                                    final byte[] array15 = i.c[be14];
                                    n86 = bf15;
                                    b12 = 24;
                                }
                                else {
                                    if (this.c(be14, bf15) || (this.c(be14 + i.g[n83], bf15 + i.g[n83 + 8]) && i.b[be14][bf15] <= this.j)) {
                                        this.a(1, 48, 0);
                                    }
                                    if (i.b[be14][bf15] <= 0) {
                                        final int n87 = be14 - i.g[n83];
                                        final int n88 = bf15 - i.g[n83 + 8];
                                        byte b13 = 24;
                                        if (n83 == 4) {
                                            b13 = 12;
                                        }
                                        byte[] array16;
                                        byte b14;
                                        int n89;
                                        if (i.a[n87][n88] < 0) {
                                            i.a[n87][n88] = 21;
                                            i.b[n87][n88] = i.b[be14][bf15];
                                            i.b[n87][n88] = b13;
                                            array16 = i.a[be14];
                                            b14 = (byte)bf15;
                                            n89 = -1;
                                        }
                                        else if (i.a[n87][n88] == 21) {
                                            final int n90 = i.b[n87][n88] & 0x7;
                                            final int n91 = n87 - i.g[n90];
                                            final int n92 = n88 - i.g[n90 + 8];
                                            i.a[be14][bf15] = -1;
                                            k(be14, bf15);
                                            final int n93 = i.b[be14][bf15];
                                            if (i.a[n91][n92] < 0) {
                                                i.a[n91][n92] = 21;
                                                i.b[n91][n92] = i.b[n87][n88];
                                                i.b[n91][n92] = 18;
                                            }
                                            i.a[n87][n88] = 21;
                                            i.b[n87][n88] = n93;
                                            array16 = i.b[n87];
                                            b14 = (byte)n88;
                                            n89 = 18;
                                        }
                                        else {
                                            switch (i.a[n87][n88]) {
                                                case 19:
                                                case 43:
                                                case 45:
                                                case 46: {
                                                    i.a[n87][n88] = -1;
                                                    this.j(n87, n88);
                                                    break;
                                                }
                                                case 10:
                                                case 30: {
                                                    if (i.b[n87][n88] < 1) {
                                                        i.b[n87][n88] = 1;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            final int[] array17 = i.b[be14];
                                            final byte b15 = (byte)bf15;
                                            array17[b15] |= 0x8;
                                            array16 = i.b[be14];
                                            b14 = (byte)bf15;
                                            n89 = 0;
                                        }
                                        array16[b14] = (byte)n89;
                                        final byte[] array15 = i.c[n87];
                                        n86 = n88;
                                        b12 = 48;
                                    }
                                    else {
                                        array18 = i.b[be14];
                                        b12 = (byte)(array18[n86 = bf15] - 12);
                                    }
                                }
                                array18[n86] = b12;
                                break Label_8485;
                            }
                            case 32: {
                                this.an();
                                break Label_8485;
                            }
                            case 11: {
                                this.am();
                                break Label_8485;
                            }
                            case 37: {
                                final int be15 = this.bE;
                                final int bf16 = this.bF;
                                final int n94;
                                if ((n94 = i.b[be15][bf16]) > 0) {
                                    if (n94 >= 8) {
                                        this.l(be15, bf16);
                                        i.a[be15][bf16] = -1;
                                        k(be15, bf16);
                                    }
                                    i.b[be15][bf16] = n94 + 1;
                                    i.c[be15][bf16] = 24;
                                }
                                break Label_8485;
                            }
                            case 30: {
                                final int n95;
                                if ((n95 = i.b[this.bE][this.bF]) > 0) {
                                    final int be16 = this.bE;
                                    final int bf17 = this.bF;
                                    if (n95 == 4) {
                                        for (int n96 = 1; n96 < 5; ++n96) {
                                            final byte b16 = i.g[n96];
                                            final byte b17 = i.g[n96 + 8];
                                            if (i.a[be16 + b16][bf17 + b17] == 30) {
                                                final int[] array19 = i.b[be16 + b16];
                                                final int n97 = bf17 + b17;
                                                ++array19[n97];
                                                i.c[be16 + b16][bf17 + b17] = 24;
                                            }
                                        }
                                    }
                                    else if (n95 >= 16) {
                                        i.a[be16][bf17] = -1;
                                        k(be16, bf17);
                                    }
                                    i.b[be16][bf17] = n95 + 1;
                                    i.c[be16][bf17] = 24;
                                }
                                break Label_8485;
                            }
                            case 24: {
                                this.m(24);
                                break Label_8485;
                            }
                            case 27: {
                                this.m(27);
                                break Label_8485;
                            }
                            case 26: {
                                this.m(26);
                                break Label_8485;
                            }
                            case 43: {
                                this.e((byte)43);
                                break Label_8485;
                            }
                            case 19: {
                                this.e((byte)19);
                                break Label_8485;
                            }
                            case 42: {
                                this.l(42);
                                break Label_8485;
                            }
                            case 2: {
                                this.l(2);
                                break Label_8485;
                            }
                            case 53: {
                                this.l(53);
                                break Label_8485;
                            }
                            case 51: {
                                this.l(51);
                                break Label_8485;
                            }
                            case 52: {
                                this.l(52);
                                break Label_8485;
                            }
                            case 5: {
                                this.l(5);
                                break Label_8485;
                            }
                            case 4: {
                                this.l(4);
                                break Label_8485;
                            }
                            case 6: {
                                this.l(6);
                                break Label_8485;
                            }
                            case 7: {
                                this.l(7);
                                break Label_8485;
                            }
                            case 41: {
                                this.l(41);
                                break Label_8485;
                            }
                            case 47: {
                                this.aq();
                                this.aj();
                                break Label_8485;
                            }
                            case 1: {
                                this.aq();
                                break Label_8485;
                            }
                            case 0: {
                                this.aq();
                                break Label_8485;
                            }
                            case 9: {
                                Label_8366: {
                                    if ((i.b[this.bE][this.bF] & 0xFC00000) == 0x8400000) {
                                        i.c[this.bE][this.bF] = 24;
                                        Label_8332: {
                                            i i8;
                                            int au;
                                            if (this.au > 0) {
                                                i8 = this;
                                                au = this.au - 1;
                                            }
                                            else {
                                                if (this.au >= 0) {
                                                    break Label_8332;
                                                }
                                                i8 = this;
                                                au = this.au + 1;
                                            }
                                            i8.au = au;
                                        }
                                        i i9;
                                        int av;
                                        if (this.av > 0) {
                                            i9 = this;
                                            av = this.av - 1;
                                        }
                                        else {
                                            if (this.av >= 0) {
                                                break Label_8366;
                                            }
                                            i9 = this;
                                            av = this.av + 1;
                                        }
                                        i9.av = av;
                                    }
                                }
                                this.aq();
                                break Label_8485;
                            }
                            case 8: {
                                this.aq();
                                break Label_8485;
                            }
                            case 23: {
                                i10 = this;
                                i11 = this;
                                n98 = 23;
                                break;
                            }
                            case 22: {
                                i10 = this;
                                i11 = this;
                                n98 = 22;
                                break;
                            }
                        }
                        final int n99 = n5;
                        final int n100 = n98;
                        final i i12 = i11;
                        final int be17 = i10.bE;
                        final int bf18 = i12.bF;
                        final int n101 = (n100 == 23) ? -1 : 1;
                        i.c[be17][bf18] = 24;
                        if (i12.i == bf18) {
                            for (int n102 = 0; n102 <= n99; ++n102) {
                                if (i12.h == be17 + n102 * n101) {
                                    i12.a(1, 64, 0);
                                }
                            }
                        }
                    }
                }
                j = this;
                be = this.bE + 1;
            }
            i = this;
            bf = this.bF - 1;
        }
    }
    
    private void ai() {
        final int be = this.bE;
        final int bf;
        int n2 = 0;
        Label_0078: {
            final int n;
            int n3 = 0;
            switch ((n = i.b[be][(bf = this.bF) + 1]) & 0x7) {
                case 4: {
                    n2 = be + 1;
                    break Label_0078;
                }
                case 2: {
                    n3 = be;
                    break;
                }
                default: {
                    if ((n & 0x10) == 0x0) {
                        n2 = be + 1;
                        break Label_0078;
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
            n6 = n5;
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
            this.h(i.a[be][bf] >> 8);
        }
        if (i.b[be][bf] <= 0) {
            int n2 = 0;
            Label_0099: {
                final int n;
                int n3;
                if ((n = ((n2 = i.b[be][bf]) & 0x7)) == 2) {
                    n3 = (n2 | 0x10);
                }
                else {
                    if (n != 4) {
                        break Label_0099;
                    }
                    n3 = (n2 & 0xFFFFFFEF);
                }
                n2 = n3;
            }
            final int n4 = bf + 1;
            if (i.a[be][n4] < 0 && (!this.c(be, n4) || this.aW != 0)) {
                i.a[be][bf - 1] = -1;
                i.a[be][n4] = 48;
                i.b[be][n4] = ((n2 & 0xFFFFFFF8) | 0x3);
                i.b[be][bf] = (i.b[be][bf - 1] | 0x8);
                i.b[be][n4] = 18;
                final int n5 = bf - 2;
                i.c[be - 1][n5] = 48;
                i.c[be][n5] = 48;
                i.c[be + 1][n5] = 48;
                k(be, bf);
                this.ai();
            }
            else {
                if ((n2 & 0x7) == 0x3 && this.c(be, n4)) {
                    this.a(2, 48, 0);
                }
                i.b[be][bf] = (n2 & 0xFFFFFFF8);
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
    
    private static boolean d(int n, final int n2) {
        final byte b = i.a[n][n2];
        n = (i.a[n][n2] & 0xFF);
        return b < 80 && b != 30 && b != 10 && b != 37 && b != 34 && b != 35 && n != 14 && n != 33 && n != 15 && n != 4 && n != 16;
    }
    
    private static boolean e(int n, final int n2) {
        final byte b = i.a[n][n2];
        n = (i.a[n][n2] & 0xFF);
        return b == -1 && n != 14 && n != 33 && n != 5 && n != 28;
    }
    
    private static boolean f(final int n, final int n2) {
        final byte b = i.a[n][n2];
        final int n3 = i.a[n][n2] & 0xFF;
        return b == -1 && n3 != 14 && n3 != 33 && n3 != 4 && n3 != 32 && (n3 != 7 || (i.a[n][n2] >> 8 & 0xF0) != 0x0);
    }
    
    private void aj() {
        final int n = this.bF - 1;
        final boolean b = i.e != null && i.e[this.bE][this.bF] != 0 && i.e[this.bE][this.bF - 1] == 0;
        if ((i.a[this.bE][n] & 0xFF) != 0x23 && d(this.bE, n) && ((!this.c(this.bE - 1, this.bF) && !this.c(this.bE + 1, this.bF)) || (this.k & 0x8) == 0x0) && (i.a[this.bE][this.bF + 1] >= 0 || b)) {
            System.out.println("In ProcessWindPod condition throw");
            i.a[this.bE][n] = 35;
            i.b[this.bE][n] = 18;
            i.c[this.bE][n] = 24;
        }
    }
    
    private static int a(final f f, final int n) {
        int n2 = 0;
        final int n3 = f.b[n] & 0xFF;
        for (short n4 = 0; n4 < n3; ++n4) {
            n2 += (f.c[(f.a[n] + n4) * 5 + 1] & 0xFF);
        }
        return n2;
    }
    
    private void ak() {
        final int be = this.bE;
        final int bf = this.bF;
        i.c[be][bf] = 24;
        byte[] array3 = null;
        int n4 = 0;
        int n5 = 0;
        switch ((i.b[be][bf] & 0x38) >> 3) {
            case 0: {
                if ((this.h != be || (bf + 1) * 24 <= this.b || this.k == 3) && (this.k != 3 || this.k == 0L || i.aS < this.k + (21 - be))) {
                    return;
                }
                int n = bf + 1;
                while (true) {
                    final byte b = i.a[be][n];
                    if (this.i == n || b >= 80 || b == 30 || b == 34 || b == 35 || b == 0) {
                        break;
                    }
                    ++n;
                }
                if (this.i == n || this.k == 3) {
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
                final boolean c = this.c(be, bf + 1);
                boolean b2 = false;
                if (c || i.a[be][bf + 1] >= 0 || (this.l && i.e[be][bf + 1] != 0)) {
                    if (c) {
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
                                this.j(be, bf + 1);
                                i.a[be][bf + 1] = -1;
                                break;
                            }
                            case 30: {
                                this.p(11);
                                i.b[be][bf + 1] = 1;
                                break;
                            }
                            case 18: {
                                this.d();
                                break;
                            }
                            case 21: {
                                b2 = false;
                                break;
                            }
                            default: {
                                this.p(14);
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
                if ((i.aS & 0x1) != 0x0) {
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
        k(be, bf);
    }
    
    private void l(final int ai) {
        final int be = this.bE;
        final int bf = this.bF;
        if (this.j > 0 || !this.c(be, bf)) {
            return;
        }
        final int n;
        if (((n = (i.a[be][bf] & 0xFF)) == 14 || n == 33) && i.a[be][bf] >> 8 == 255) {
            return;
        }
        Label_0429: {
            i i = null;
            int ag = 0;
            switch (this.aI = ai) {
                case 40: {
                    this.aF = 19;
                    this.aG = 0;
                    i.a[this.bE][this.bF] = -1;
                    this.aI = 40;
                    i.i[10] = 1;
                    break Label_0429;
                }
                case 42: {
                    this.aF = 29;
                    i = this;
                    ag = 0;
                    break;
                }
                case 41: {
                    this.aF = 2;
                    this.aG = 0;
                    this.aH = i.b[this.bE][this.bF];
                    break Label_0429;
                }
                case 4: {
                    this.aF = 24;
                    i = this;
                    ag = 0;
                    break;
                }
                case 5: {
                    this.aF = 25;
                    i = this;
                    ag = 0;
                    break;
                }
                case 2: {
                    this.aF = 3;
                    i = this;
                    ag = 0;
                    break;
                }
                case 53: {
                    this.aF = 32;
                    i = this;
                    ag = 0;
                    break;
                }
                case 51: {
                    this.aF = 30;
                    i = this;
                    ag = 0;
                    break;
                }
                case 52: {
                    this.aF = 31;
                    i = this;
                    ag = 0;
                    break;
                }
                case 6: {
                    if (this.az < 99) {
                        this.aF = 5;
                        i = this;
                        ag = 0;
                        break;
                    }
                    i.a[be][bf] = 7;
                    i.b[be][bf] = 0;
                    this.l(7);
                    break Label_0429;
                }
                case 7: {
                    if (this.n == i.i[8]) {
                        i.a[be][bf] = 41;
                        i.b[be][bf] = 10;
                        final i j = this;
                        j.aY += 10;
                        this.l(41);
                        break Label_0429;
                    }
                    this.aF = 5;
                    i = this;
                    ag = 1;
                    break;
                }
            }
            i.aG = ag;
        }
        i.a[be][bf] = -1;
        (this = this).o = true;
    }
    
    private boolean g(final int n, final int n2) {
        return i.a[n][n2] == 28 || (this.aN >= 24 && ((i.a[n][n2 - 1] == 28 && (i.b[n][n2 - 1] & 0x8) == 0x0) || (i.a[n][n2 + 1] == 28 && (i.b[n][n2 + 1] & 0x8) == 0x0))) || (this.aP >= 24 && (i.a[n][n2 - 1] == 28 || i.a[n][n2 + 1] == 28));
    }
    
    private int a(final int n, final int n2, int n3, int n4, final boolean b) {
        n3 = n - n3;
        n4 = n2 - n4;
        final int n5 = (n3 > 0) ? n3 : (-n3);
        final int n6 = (n4 > 0) ? n4 : (-n4);
        int n7 = 0;
        if (n5 > n6) {
            Label_0062: {
                int n8;
                if (n3 > 0) {
                    n8 = 4;
                }
                else {
                    if (n3 >= 0) {
                        break Label_0062;
                    }
                    n8 = 2;
                }
                n7 = n8;
            }
            if (n7 != 0 && (!f(n - i.g[n7], n2) || this.g(n - i.g[n7], n2))) {
                n7 = 0;
            }
        }
        if (n7 == 0) {
            Label_0123: {
                int n9;
                if (n4 > 0) {
                    n9 = 1;
                }
                else {
                    if (n4 >= 0) {
                        break Label_0123;
                    }
                    n9 = 3;
                }
                n7 = n9;
            }
            n4 = n2 - i.g[n7 + 8];
            if (b && n7 != 0 && (!f(n, n4) || (this.l && i.e[n][n4] != 0) || this.g(n, n4))) {
                n7 = 0;
                Label_0201: {
                    int n10;
                    if (n3 > 0) {
                        n10 = 4;
                    }
                    else {
                        if (n3 >= 0) {
                            break Label_0201;
                        }
                        n10 = 2;
                    }
                    n7 = n10;
                }
                if (n7 != 0 && i.a[n - i.g[n7]][n2] >= 0) {
                    n7 = 0;
                }
            }
        }
        return n7;
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
        if (!b3 && h(be, bf)) {
            i.a[be][bf] = -1;
            this.j(be, bf);
            return;
        }
        int n4 = n & 0x7;
        Label_0771: {
            byte[] array;
            int n12;
            byte b5;
            if (b2 <= 0) {
                Label_0600: {
                    if (b3 && b2 <= 6) {
                        if (b2 < 0) {
                            i.b[be][bf] = 0;
                        }
                    }
                    else {
                        k(be, bf);
                        if (b4) {
                            b2 = 18;
                            final int a = this.a(be, bf, this.h, this.i, true);
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
                            Label_0594: {
                                if ((n & 0xFE0000) != 0x0 && (n & 0xF8) == 0x0) {
                                    final int n6 = (n & 0xFE0000) >> 17;
                                    final int n7 = (n & 0x7F000000) >> 24;
                                    if (be == n6 && bf == n7) {
                                        final int n8;
                                        n4 = ((((n8 = (n & 0xFF01FFFF)) & Integer.MIN_VALUE) == 0x0) ? 2 : 1);
                                        n = ((n8 & 0xFFFFFFF8) | n4);
                                        break Label_0600;
                                    }
                                    b2 = 21;
                                    final int a2 = this.a(be, bf, n6, n7, true);
                                    n = ((n & 0xFFFFFFF8) | a2);
                                    n2 = -i.g[a2];
                                    n3 = -i.g[a2 + 8];
                                    if ((n4 = a2) != 0) {
                                        break Label_0600;
                                    }
                                    b2 = 0;
                                }
                                else if (n4 == 0) {
                                    b2 = 21;
                                    final int n9 = (n & 0x7000) >> 12;
                                    n = ((n & 0xFFFFFFF8) | n9);
                                    n4 = n9;
                                    n2 = -i.g[n4];
                                    n3 = -i.g[n4 + 8];
                                    if (!f(be + n2, bf + n3)) {
                                        n3 = (n2 = 0);
                                        b2 = 0;
                                    }
                                    break Label_0600;
                                }
                                else {
                                    b2 = 21;
                                    n2 = -i.g[n4];
                                    n3 = -i.g[n4 + 8];
                                    if (!f(be + n2, bf + n3)) {
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
                                                    n &= 0xFFFFFFF8;
                                                    n4 = 0;
                                                    break Label_0594;
                                                }
                                            }
                                            n = (n10 | n11);
                                            continue;
                                        }
                                    }
                                    break Label_0600;
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
                    break Label_0771;
                }
                if ((i.aS & 0x3) == 0x0) {
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
        if ((n & 0xF8) == 0x0 && (i.a[0].d < 13 || i.a[0].d > 16) && a(be, bf, n4, i.b[be][bf], this.h, this.i, ((this.k & 0x1000) == 0x0) ? this.l : 0, this.j)) {
            this.a(1, 48, n4);
            if (b4) {
                n &= 0xFFFFF0FF;
            }
        }
        i.b[be][bf] = n;
    }
    
    private void al() {
        if ((this.k == 3 || this.k == 4 || this.k == 5) && this.aq > 0) {
            return;
        }
        if (i.cm >= 0) {
            final byte[] m = i.m;
            final int cm = i.cm;
            --m[cm];
            if (i.m[i.cm] == 0) {
                final i i = this;
                final int cm2 = i.cm;
                this = i;
                i.p(8);
                final int n = this.e - 1;
                for (int n2 = this.f - 1, j = 1; j < n2; ++j) {
                    for (int k = 1; k < n; ++k) {
                        if ((i.a[k][j] & 0xFF) == 0x11 && i.a[k][j] >> 8 == cm2) {
                            final int n3;
                            switch (n3 = (i.a[k][j - 1] & 0xFF)) {
                                case 7: {
                                    final int n4 = k;
                                    final int n5 = j - 1;
                                    final int n6 = n4;
                                    final int n7;
                                    if (((n7 = i.a[n6][n5] >> 8) & 0xF0) == 0x0) {
                                        i.a[n6][n5] = ((n7 | 0x10) << 8 | 0x7);
                                        i.c[n6][n5] = 24;
                                    }
                                    break;
                                }
                                case 14:
                                case 33: {
                                    i.a[k][j - 1] = (0x0 | n3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void m(final int n) {
        if ((i.a[this.bE][this.bF] & 0xFF) == 0xE && i.a[this.bE][this.bF] >> 8 == 255) {
            return;
        }
        if (this.c(this.bE, this.bF) && (i.a[0].d == 40 || i.a[0].d == 48)) {
            i.a[this.bE][this.bF] = -1;
            while (true) {
                i i = null;
                int ai = 0;
                switch (n) {
                    case 24: {
                        i.i[9] = 1;
                        this.aF = 7;
                        this.aG = 0;
                        i = this;
                        ai = 24;
                        break;
                    }
                    case 27: {
                        i.i[9] = 2;
                        this.aF = 7;
                        this.aG = 1;
                        i = this;
                        ai = 27;
                        break;
                    }
                    case 26: {
                        i.i[9] = 8;
                        this.aF = 7;
                        this.aG = 2;
                        i = this;
                        ai = 26;
                        break;
                    }
                    default: {
                        this.a(this.aA, this.aB, this.bE, this.bF);
                        return;
                    }
                }
                i.aI = ai;
                continue;
            }
        }
    }
    
    private void am() {
        final int be = this.bE;
        final int bf = this.bF;
        final int n;
        if ((n = (i.b[be][bf] & 0xF00) >> 8) != 0) {
            if (n >= 4) {
                i.a[be][bf] = -1;
            }
            else if ((i.aS >> 1 & 0x1) == 0x0) {
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
            Label_0803: {
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
                    Label_0383: {
                        int n10 = 0;
                        switch (n3) {
                            case 3: {
                                n4 = (b ? 1 : -1);
                                n8 = (b ? 2 : 4);
                                n9 = (b ? 4 : 2);
                                n7 = 1;
                                break Label_0383;
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
                                break Label_0383;
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
                    if (f(be + n6, bf + n7) && f(be + n4, bf + n5) && f(be + n4 - n6, bf + n5 - n7)) {
                        if (i.b[be][bf] <= 0) {
                            i.b[be + n6][bf + n7] = n2;
                            i.a[be + n6][bf + n7] = 11;
                            i.a[be][bf] = -1;
                            i.b[be + n6][bf + n7] = 18;
                        }
                        break Label_0803;
                    }
                    else {
                        if (f(be + n4, bf + n5)) {
                            i.b[be + n4][bf + n5] = ((n2 & 0xFFFFFFF8) | n8);
                            i.a[be + n4][bf + n5] = 11;
                            i.a[be][bf] = -1;
                            i.b[be + n4][bf + n5] = 18;
                            break Label_0803;
                        }
                        if (f(be + n6, bf + n7)) {
                            if (i.b[be][bf] <= 0) {
                                i.b[be + n6][bf + n7] = n2;
                                i.a[be + n6][bf + n7] = 11;
                                i.a[be][bf] = -1;
                                i.b[be + n6][bf + n7] = 18;
                            }
                            break Label_0803;
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
                    Label_0735: {
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
                                break Label_0735;
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
                        break Label_0803;
                    }
                    array = i.b[be];
                    n11 = bf;
                    n12 = (n2 & 0xFFFFFFF8);
                    n13 = (b ? 4 : 2);
                }
                array[n11] = (n12 | n13);
            }
            k(be, bf);
        }
        if (this.c(be, bf)) {
            this.a(1, 64, 0);
        }
        if (i.b[be][bf] > 0) {
            final byte[] array3 = i.b[be];
            final int n16 = bf;
            array3[n16] -= 5;
        }
    }
    
    private void an() {
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
            Label_0565: {
                final int n4;
                if ((n4 = n2 >> 1) > 0) {
                    if (b < 0 && n3 != 14 && n3 != 33) {
                        i.b[be + n][bf] = (n4 - 1 << 1 | (n2 & 0x1));
                        i.c[be + n][bf] = 30;
                        i.b[be + n][bf] = 18;
                        b = 32;
                        break Label_0565;
                    }
                    if (b == 32) {
                        break Label_0565;
                    }
                    int bf2 = i.b[be + n][bf];
                    int n5 = 0;
                    if (b == 48 && (bf2 & 0x8) != 0x0) {
                        break Label_0565;
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
                            this.p(12);
                            this.o = 0;
                            this.bi = this.h - (be + n) + n5;
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
                                break Label_0565;
                            }
                            this.be = ((bf2 & 0xFFFFFFF8) | 0x2);
                            break Label_0565;
                        }
                        default: {
                            if (b != -1) {
                                break;
                            }
                            break Label_0565;
                        }
                    }
                }
                b2 = true;
            }
            if (b2) {
                for (int i = 1; i <= 3; ++i) {
                    if (i.a[this.h + n * i][this.i] == 32) {
                        i.a[this.h + n * i][this.i] = -1;
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
        k(be, bf);
    }
    
    private void j(final int n, final int n2) {
        i.a[n][n2] = ((i.a[n][n2] & 0xFFFFFFF) | 0x10000000);
        this.al();
    }
    
    private void n(final int n) {
        final int be = this.bE;
        final int bf = this.bF;
        final int n2 = i.a[be][bf] >> 8;
        i.a[be][bf] = (n2 << 8 | n);
        if (i.b[be][bf] <= 0) {
            if (n2 == 0) {
                if (this.c(be, bf) && this.j <= 0) {
                    this.k &= 0xFFFFF7FF;
                    i.a[be][bf] = (0x100 | n);
                    i i;
                    int n3;
                    if (Math.abs(this.i - System.currentTimeMillis()) >= 5000L) {
                        i = this;
                        n3 = 40;
                    }
                    else {
                        i = this;
                        n3 = 48;
                    }
                    i.g(n3);
                    this.p(3);
                }
            }
            else if ((i.aS >> 1 & 0x1) == 0x0 && i.a[(n == 14) ? 8 : 22] != null && n2 < i.a[(n == 14) ? 8 : 22].a(0) - 1) {
                i.a[be][bf] = (n2 + 1 << 8 | n);
                i.c[be][bf] = 24;
            }
        }
    }
    
    private static boolean h(final int n, final int n2) {
        final int n3 = n2 - 1;
        final int n4 = n - 1;
        final int n5 = n + 1;
        return (i.b[n][n3] <= 6 && ((i(n, n3) && ((i.b[n][n3] & 0x7) == 0x3 || (i.a[n][n2] != 16 && i.a[n][n3] != 1))) || i.a[n][n3] == 46 || i.a[n][n3] == 14 || i.a[n][n3] == 48)) || (i.b[n5][n2] <= 0 && i.a[n5][n2] == 14 && (i.b[n5][n2] & 0x8) != 0x0 && (i.b[n5][n2] & 0x7) != 0x3) || (i.b[n4][n2] <= 0 && i.a[n4][n2] == 14 && (i.b[n4][n2] & 0x8) == 0x0 && (i.b[n4][n2] & 0x7) != 0x3);
    }
    
    private static boolean i(final int n, final int n2) {
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
    
    private static void k(final int n, final int n2) {
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
    
    private void ao() {
        this.j = i.i[10];
        this.ch = this.cf;
        this.cg = this.ce;
        this.af = this.aa;
        this.bZ = this.aC;
        this.bX = this.aZ;
        this.bY = this.bb;
        this.bS = this.h;
        this.bT = this.i;
        this.bU = this.aU;
        this.bV = this.aV;
        this.bW = this.ay;
        this.aj = this.ai;
        this.ca = this.am;
        this.cb = this.al;
        i.cn = i.cm;
        if (i.m != null) {
            System.arraycopy(i.m, 0, i.o, 0, i.m.length);
        }
        for (int i = 0; i < this.e; ++i) {
            System.arraycopy(i.b[i], 0, i.c[i], 0, this.f);
            System.arraycopy(i.b[i], 0, i.d[i], 0, this.f);
            System.arraycopy(i.a[i], 0, i.e[i], 0, this.f);
            System.arraycopy(i.a[i], 0, i.d[i], 0, this.f);
        }
        if ((this = this).l) {
            if (i.f == null) {
                i.f = new int[this.e][this.f];
            }
            for (int j = 0; j < this.e; ++j) {
                System.arraycopy(i.e[j], 0, i.f[j], 0, this.f);
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
            this.dA = this.dq;
            this.dB = this.dr;
            this.dC = this.ds;
            this.z = this.v;
            this.dD = this.dv;
            this.dE = this.dw;
            this.dF = this.dx;
            this.A = this.w;
            this.dG = this.dy;
            this.dH = this.dz;
            i.am = this.al;
            this.dI = this.dt;
            this.dJ = this.du;
        }
    }
    
    private void ap() {
        i.cE = -1;
        final int af = -1;
        this.aH = af;
        this.aG = af;
        this.aF = af;
        this.bg = 0;
        this.bh = 0;
        this.E = true;
        this.ci = this.bS * 24 - 120;
        this.cj = this.bT * 24 - 160 + 40;
        this.bl = 0;
        Label_0147: {
            int[] array;
            int n;
            if (this.q) {
                this.bm = 15;
                this.q = false;
                i.d[37][7] = -1;
                array = i.d[39];
                n = 5;
            }
            else {
                if (!this.r) {
                    break Label_0147;
                }
                this.bm = 17;
                this.r = false;
                i.d[46][7] = -1;
                array = i.d[50];
                n = 7;
            }
            array[n] = -1;
        }
        this.t = false;
        this.ax = 70;
        i.i[10] = this.j;
        this.aa = this.af;
        this.cf = this.ch;
        this.ce = this.cg;
        this.aC = this.bZ;
        this.bb = this.bY;
        this.aZ = this.bX;
        i.a[0].a(2);
        this.k = 2;
        this.bj = 0;
        this.h = this.bS;
        this.i = this.bT;
        this.aU = this.bU;
        this.aV = this.bV;
        this.ai = this.aj;
        switch (this.k) {
            case 5: {
                this.y();
                break;
            }
            case 3: {
                this.aq = 5;
                break;
            }
            case 4: {
                this.ao = 0;
                this.ar = 0;
                this.aq = 3;
                this.k = false;
                break;
            }
            case 1: {
                this.al = this.cb;
                this.am = this.ca;
                break;
            }
        }
        i.cm = i.cn;
        if (i.m != null) {
            System.arraycopy(i.o, 0, i.m, 0, i.m.length);
        }
        for (int i = 0; i < this.e; ++i) {
            System.arraycopy(i.c[i], 0, i.b[i], 0, this.f);
            System.arraycopy(i.d[i], 0, i.b[i], 0, this.f);
            System.arraycopy(i.e[i], 0, i.a[i], 0, this.f);
            System.arraycopy(i.d[i], 0, i.a[i], 0, this.f);
        }
        for (int n2 = this.f - 1, j = 1; j < n2; ++j) {
            for (int n3 = this.e - 1, k = 1; k < n3; ++k) {
                final byte b = i.a[k][j];
                final int n4 = i.a[k][j] & 0xFF;
                if ((b > -1 && b < 80) || (n4 > -1 && n4 < 80)) {
                    k(k, j);
                }
            }
        }
        if (i.a[2] != null) {
            i.a[2].a(0);
            i.a[18][63] = -1;
        }
        this.ay = this.bW;
        this.o = true;
        if (this.l) {
            this.al = i.am;
            this.dt = this.dI;
            this.du = this.dJ;
            for (int l = 0; l < this.e; ++l) {
                System.arraycopy(i.f[l], 0, i.e[l], 0, this.f);
            }
            System.arraycopy(i.c, 0, i.a, 0, i.a.length);
            System.arraycopy(i.d, 0, i.b, 0, i.b.length);
            this.x = this.y;
            this.dq = this.dA;
            this.dr = this.dB;
            this.ds = this.dC;
            this.v = this.z;
            this.dv = this.dD;
            this.dw = this.dE;
            this.dx = this.dF;
            this.w = this.A;
            this.dy = this.dG;
            this.dz = this.dH;
        }
        if (i.e != null) {
            for (int bf = 0; bf < this.f; ++bf) {
                for (int be = 0; be < this.e; ++be) {
                    if (i.a[be][bf] == 48) {
                        this.bE = be;
                        this.bF = bf;
                        if ((i.b[be][bf] & 0x8) == 0x0) {
                            this.d((byte)48);
                        }
                        else {
                            this.ai();
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
        i.dm = (i.dn = 0);
        i.do = (i.dp = 100);
        if (Math.abs(n - n5) > 1 || Math.abs(n2 - n6) > 1) {
            return false;
        }
        i.dm = n * 24 + i.g[n3] * n4;
        i.dn = n2 * 24 + i.g[n3 + 8] * n4;
        i.do = n5 * 24 + i.g[n7] * n8;
        i.dp = n6 * 24 + i.g[n7 + 8] * n8;
        return b(i.dm, i.dn, i.do, i.dp);
    }
    
    private void aq() {
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
        final int i = n5;
        final boolean a = a(be, bf, n2, b, this.h, this.i, ((this.k & 0x1000) == 0x0) ? this.l : 0, this.j);
        if (b2 == 1 && a) {
            final i j = this;
            final int n6 = be;
            final int n7 = bf;
            final int n8 = n6;
            this = j;
            j.c(n8, n7, 3);
            final i k = this;
            ++k.aZ;
            i.a[n8][n7] = -1;
            final i l = this;
            --l.aa;
            this.bi = 0;
            if (this.aa == 0) {
                i.a[this.ab][this.ac] = -1;
            }
            if (i.a[n8][n7 - 1] == -1) {
                this.b(n8, n7 - 1);
            }
            this.b(n8, n7);
            this.o = true;
            return;
        }
        final boolean b4 = (i.a[be][bf] & 0xFF) == 0x23;
        if (i.a[be][i] == 9 && b <= 0) {
            final byte b5 = (byte)i.a[be][i];
            final int n9;
            if ((n9 = (i.b[be][i] & 0xFC00000) >> 22) != 34) {
                if (n9 == 33) {
                    if (b5 == -1) {
                        i.a[be][i] = 32;
                    }
                    this.h = be;
                    this.i = i;
                    i.a[be][i] = -1;
                    this.j = 0;
                    this.a(2, 48, this.aT = 0);
                }
                else if (i.a[be][i] == 19 || i.a[be][i] == 43 || i.a[be][i] == 45 || i.a[be][i] == 46 || i.a[be][i] == 49 || i.a[be][i] == 11) {
                    i.a[be][i] = -1;
                    this.j(be, i);
                }
            }
        }
        if (b <= 0 && !b4) {
            if (n2 == n4 && this.c(be, i) && e(be, i)) {
                if ((b2 == 0 || b2 == 9) && n3 > 0) {
                    this.a(2, 48, 0);
                }
                else if (b2 == 1) {
                    i.b[be][i] = ((n & 0xFFFFFFF8) | 0x3);
                    i.b[be][i] = 18;
                    i.a[be][i] = 1;
                    i.a[be][bf] = -1;
                    this.b(be, bf);
                }
                else if (b2 == 8) {
                    n &= 0xFFC1FFFF;
                }
                i.b[be][bf] = (n & 0xFFFFFFF8);
            }
            else if ((e(be, i) || i.a[be][i] == 21) && (!this.c(be, bf) || this.aT > 0) && ((!this.c(be, i) && !b(i.dm, i.dn, i.do, i.dp - 1)) || this.aT > 0 || this.aW != 0 || (b2 != 0 && n2 == n4))) {
                if (n3 > 0 || (i.e != null && i.e[be][i] != 0)) {
                    n = ((n + 131072 & 0xFFFFFFF8) | n4);
                    i.b[be][i] = (n | Integer.MIN_VALUE);
                    i.b[be][i] = 18;
                    i.a[be][i] = b2;
                    i.a[be][bf] = -1;
                    k(be, bf);
                    i.c[be][bf + n3 * 2] = 24;
                    this.b(be, bf);
                }
                else {
                    n &= 0xFFC1FFF8;
                    i.b[be][bf] = n;
                    i.b[be][i] = 0;
                }
            }
            else if (i(be, i)) {
                if (n3 < 0 && (i.e == null || i.e[be][i] == 0) && i.a[be][bf + 1] < 0) {
                    i.b[be][bf + 1] = ((n & 0xFFFFFFF8) | 0x3);
                    i.b[be][bf + 1] |= Integer.MIN_VALUE;
                    i.a[be][bf + 1] = b2;
                    i.b[be][bf + 1] = 18;
                    i.a[be][bf] = -1;
                }
                else if (i.b[be][i] <= 0) {
                    if ((n & 0x3E0000) >> 17 >= 2) {
                        if (b2 == 8) {
                            i.a[be][bf] = 54;
                            i.b[be][bf] = 0;
                            k(be, bf);
                            return;
                        }
                        if (i.a[be][i] == 8) {
                            i.a[be][i] = 54;
                            i.b[be][i] = 0;
                            k(be, i);
                            return;
                        }
                    }
                    n &= 0xFFC1FFFF;
                    Label_1240: {
                        int n10;
                        int n11;
                        if (e(be - 1, bf) && e(be - 1, i) && !this.c(be - 1, bf)) {
                            i.b[be][bf] = (byte)(((n & 0x7000) >> 12) + 1);
                            i.c[be][bf] = 24;
                            n10 = (((n & 0xFFFFFFF8) | 0x4) & 0xFFFFF3FF);
                            n11 = 2048;
                        }
                        else {
                            if (!e(be + 1, bf) || !e(be + 1, i) || this.c(be + 1, bf)) {
                                break Label_1240;
                            }
                            i.b[be][bf] = (byte)(((n & 0x7000) >> 12) + 1);
                            i.c[be][bf] = 24;
                            n10 = (((n & 0xFFFFFFF8) | 0x2) & 0xFFFFF3FF);
                            n11 = 1024;
                        }
                        n = (n10 | n11 | 0x200);
                    }
                    i.b[be][bf] = n;
                }
            }
            else if (b2 == 8) {
                if ((n & 0x3E0000) >> 17 >= 2) {
                    i.a[be][bf] = 54;
                    i.b[be][bf] = 0;
                    k(be, bf);
                    return;
                }
                n &= 0xFFC1FFFF;
            }
            else {
                n = (n & 0xFFFFF3FF & 0xFFC1FFFF & 0xFFFFFFF8);
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
                    b6 = (byte)(b - (i.aS & 0x1));
                    i.c[be][bf] = 24;
                }
                Label_1634: {
                    if (b6 == 0 || b6 == 12) {
                        while (true) {
                            int n12 = 0;
                            int n13 = 0;
                            switch (n & 0xC00) {
                                case 2048: {
                                    n12 = (n & 0xFFFFFFC7);
                                    n13 = n - 8;
                                    break;
                                }
                                case 1024: {
                                    n12 = (n & 0xFFFFFFC7);
                                    n13 = n + 8;
                                    break;
                                }
                                default: {
                                    if (b6 != 0) {
                                        break Label_1634;
                                    }
                                    if ((i.a[be][bf] & 0xFF) == 0x6) {
                                        n &= 0xFFFFFE3F;
                                    }
                                    if (n2 != n4) {
                                        break Label_1634;
                                    }
                                    if ((b2 == 0 || b2 == 9) && n3 > 0 && !e(be, bf + 1)) {
                                        j(200);
                                        this.p(14);
                                        this.bj = 10;
                                        if (b2 == 9 && this.aT > 0 && this.c(be, bf)) {
                                            this.a(1, 0, 0);
                                            this.o = true;
                                        }
                                        if (!i(be, bf + 1)) {
                                            n = ((n & 0xFFFFFE3F) | 0x40);
                                        }
                                    }
                                    i.c[be][bf] = 30;
                                    if (!this.c(be, i)) {
                                        n &= 0xFFFFFFF8;
                                    }
                                    break Label_1634;
                                }
                            }
                            n = (n12 | (n13 & 0x38));
                            continue;
                        }
                    }
                }
                i.b[be][bf] = b6;
                i.b[be][bf] = n;
            }
            else {
                int n14 = 0;
                int n15 = 0;
                Label_1679: {
                    int n16;
                    if (n2 == 4) {
                        n16 = -1;
                    }
                    else {
                        if (n2 != 2) {
                            break Label_1679;
                        }
                        n16 = 1;
                    }
                    n14 = n16;
                }
                if (e(be, i) && !this.c(be, i)) {
                    byte b7;
                    if ((b7 = (byte)(b - 6)) <= 0) {
                        b7 = 0;
                        n = (n & 0xFFFFFDFF & 0xFFFFFFF8);
                    }
                    i.b[be][bf] = b7;
                    i.b[be][bf] = n;
                    i.c[be][bf] = 24;
                }
                else if (e(be + n14, bf) && !this.c(be + n14, bf) && e(be + n14, i) && !this.c(be + n14, i) && (i.b[be][i] & 0x200) == 0x0) {
                    if (b >= 6 || (i.aS & 0x3) == 0x0) {
                        ++b;
                    }
                    if (b >= 12) {
                        n &= 0xFFFFFDFF;
                        byte b8;
                        if (n14 != 0) {
                            b8 = 6;
                            i.a[be][bf] = -1;
                            if (e(be + n14, i)) {
                                b8 = 12;
                                n = ((n & 0xFFFFFFF8) | n4);
                                n15 = n3;
                            }
                        }
                        else {
                            n &= 0xFFFFFFF8;
                            b8 = 0;
                        }
                        i.b[be + n14][bf + n15] = (n | Integer.MIN_VALUE);
                        i.b[be + n14][bf + n15] = b8;
                        i.a[be + n14][bf + n15] = b2;
                        k(be, bf);
                        i.c[be][bf + n3 * 2] = 24;
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
                        n = (n & 0xFFFFFDFF & 0xFFFFFFF8);
                    }
                    i.b[be][bf] = b9;
                    i.b[be][bf] = n;
                    i.c[be][bf] = 24;
                    this.c(be, bf);
                }
            }
        }
        final int n17 = n & 0x20000000;
        final byte b10 = i.b[be][bf];
        final int n18 = n & 0x40000000;
        if ((n17 == 0 && b10 != 0) || (n18 == 0 && b3)) {
            this.b(be, bf);
        }
        if ((n17 != 0 && b10 == 0) || (n18 != 0 && !b3)) {
            this.c(be, bf);
        }
        i.b[be][bf] = ((((((n & 0xDFFFFFFF) | ((b10 != 0) ? 536870912 : 0)) & 0xBFFFFFFF) | (b3 ? 1073741824 : 0)) & Integer.MAX_VALUE) | (((((n & 0x200) != 0x0) ? 1 : ((b10 != 0 || n17 != 0) ? 2 : (b3 ? 3 : ((i.a[be][bf] > -1 && i.a[be][bf] < 38) ? 4 : (((e(be - 1, bf) || e(be + 1, bf)) && i(be, bf + 1) && (i.b[be][bf + 1] & 0x7) == 0x0 && be != this.bg && bf != this.bh) ? 6 : 0))))) != 0) ? Integer.MIN_VALUE : 0));
        final int n19;
        if ((n19 = ((i.b[be][bf] & 0x1C0) >> 6) - 1) >= 0 && n19 < 5) {
            i.b[be][bf] = ((i.b[be][bf] & 0xFFFFFE3F) | (i.b[be][bf] + 64 & 0x1C0));
        }
    }
    
    private static f a(final String s, final int n, final int a, final int n2) {
        f f = null;
        try {
            f = new f();
            f.a(a(s, n), 0);
            for (int i = a; i <= n2; ++i) {
                f.a(i, 0, -1, -1);
            }
            f.a = a;
            f.d = null;
            System.gc();
        }
        catch (Exception ex) {}
        return f;
    }
    
    private static f a(String s, int n) {
        final String s2 = s;
        n = n;
        s = s2;
        return a(s2, n, 0, 0);
    }
    
    private static f a(final String s, final int n, final int n2) {
        return a(s, n, 0, 0);
    }
    
    private static Image[] a(final String s, final int n, final int n2) {
        f f = null;
        try {
            f = new f();
            f.a(a(s, n), 0);
            f.a(n2, 0, -1, -1);
            a(f, false);
            System.gc();
        }
        catch (Exception ex) {}
        return f.a[n2];
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
    
    public static byte[] a(final String name, int b) {
        byte[] array = null;
        final InputStream resourceAsStream = name.getClass().getResourceAsStream(name);
        try {
            array = new byte[resourceAsStream.read() << 3];
            resourceAsStream.read(array);
            final int b2 = b(array, b << 3);
            b = b(array, (b << 3) + 4);
            resourceAsStream.skip(b2);
            array = new byte[b];
            resourceAsStream.read(array);
            resourceAsStream.close();
        }
        catch (Exception ex) {}
        return array;
    }
    
    private static int a(final h h, String s, int n) {
        if (n != -1 && (n = s.indexOf(10)) != -1) {
            s = s.substring(0, n);
        }
        if ((n = s.indexOf(125)) != -1) {
            s = s.substring(0, n);
        }
        h.a(s);
        return h.a;
    }
    
    private static int a(final InputStream inputStream) {
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
    
    private void ar() {
        if (this.l) {
            i.a = new long[15];
            i.c = new long[15];
            i.b = new long[15];
            i.d = new long[15];
            this.x = 3;
            this.al = true;
            this.dq = -1;
            this.dr = 0;
            this.ds = 0;
            this.v = 0;
            this.dv = 0;
            this.dw = 0;
            this.dx = 0;
            this.w = 0;
            this.dy = 0;
            this.dz = -1;
            this.dt = 0;
            this.du = 0;
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
            a(b6, (byte)1, (byte)0, (byte)4);
            a(b6, b4, (byte)4, (byte)2);
            a(b6, b, (byte)6, (byte)7);
            a(b6, b, (byte)27, (byte)7);
            a(b6, b2, (byte)13, (byte)7);
            a(b6, b3, (byte)20, (byte)7);
            return b6;
        }
        return -1;
    }
    
    private static int a(final int n, final byte b, final byte b2, final byte b3) {
        return n >>> b * 9 + b2 & ~(-1 << b3);
    }
    
    private static void a(final int n, final int n2, final byte b, final byte b2, final byte b3, final byte b4) {
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
    
    private static void a(int n, final byte b, final byte b2, final byte b3) {
        final long n2 = a(n, b2, b3);
        --n;
        i.a[n] = ((i.a[n] ^ n2 << b2) | (long)b << b2);
    }
    
    private static int a(final byte b, final byte b2, final byte b3) {
        return (int)(i.b[b] >>> b2 & ~(-1L << b3));
    }
    
    private static void a(final byte b, final byte b2, final byte b3, final byte b4) {
        i.b[b] = ((i.b[b] ^ (long)a(b, b3, b4) << b3) | (long)(b2 << b3));
    }
    
    private static byte b(final int n, final int n2) {
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
    
    private void as() {
        if (!this.l) {
            return;
        }
        Label_1070: {
            if (this.dq >= 0 && this.dz >= 0) {
                ++this.dq;
                int a = a((int)this.w, (byte)14, (byte)6);
                int a2 = a((int)this.w, (byte)20, (byte)6);
                byte b7 = 0;
                byte b8 = 0;
                byte b9 = 0;
                byte b10 = 0;
                switch (a((int)this.w, (byte)47, (byte)2)) {
                    case 1: {
                        if (a2 == this.dy) {
                            this.dq = -1;
                            this.dz = -1;
                            f(this.w);
                            this.x = 4;
                            break Label_1070;
                        }
                        final byte b = (byte)a((int)this.w, (byte)49, (byte)5);
                        if (this.dq == 0 || this.dq % b != 0) {
                            break Label_1070;
                        }
                        this.dq = 0;
                        final byte b2;
                        if ((b2 = (byte)a((int)this.w, (byte)26, (byte)2)) < 0) {
                            break Label_1070;
                        }
                        byte b4;
                        byte b3 = b4 = 0;
                        while (true) {
                            final byte b5 = b4;
                            if (b3 >= b) {
                                break;
                            }
                            c(a - b5, a2, b2);
                            int n = a2;
                            byte b6;
                            if ((b6 = (byte)(b2 + 1)) > 2) {
                                b6 = 0;
                                ++n;
                            }
                            final int a3 = a(i.e[a - b5][n], b6, (byte)3, (byte)4);
                            Label_0302: {
                                if (n != this.dy || b2 != 2) {
                                    if (a3 == 12 || a3 == 9) {
                                        break Label_0302;
                                    }
                                }
                                else if (a3 == 0 || a3 == 3) {
                                    break Label_0302;
                                }
                                a(a - b5, n, b6, (byte)7, (byte)3, (byte)4);
                            }
                            b3 = (b4 = (byte)(b5 + 1));
                        }
                        if (b2 == 2) {
                            a((int)this.w, (byte)0, (byte)47, (byte)2);
                            a((int)this.w, (byte)0, (byte)26, (byte)2);
                            ++a2;
                            b7 = this.w;
                            b8 = (byte)a2;
                            b9 = 20;
                            b10 = 6;
                            break;
                        }
                        b7 = this.w;
                        b8 = (byte)(b2 + 1);
                        b9 = 26;
                        b10 = 2;
                        break;
                    }
                    case 0: {
                        a((int)this.w, (byte)1, (byte)47, (byte)2);
                        final byte b11 = (byte)a((int)this.w, (byte)49, (byte)5);
                        final byte b12 = (byte)a((int)this.w, (byte)45, (byte)2);
                        byte b13 = 0;
                        if (b12 != 0) {
                            if (b12 == 2) {
                                while (a >= this.dv && (byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                                    ++a;
                                }
                            }
                            else {
                                while (a <= this.dv && (byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
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
                            while (b13 < b11) {
                                ++b13;
                                if ((byte)(i.a[a][a2] - 80) < 0 && i.a[a][a2] != 10 && i.a[a][a2] != 37 && i.a[a][a2] != 34 && i.a[a][a2] != 35) {
                                    b13 = b11;
                                }
                                else {
                                    --a;
                                }
                            }
                        }
                        if (this.dx != 2 && a <= this.dv) {
                            while ((byte)(i.a[a + 1][a2] - 80) < 0 && i.a[a + 1][a2] != 10 && i.a[a + 1][a2] != 37 && i.a[a + 1][a2] != 34 && i.a[a + 1][a2] != 35) {
                                ++a;
                            }
                        }
                        a((int)this.w, (byte)a, (byte)14, (byte)6);
                        byte b14 = 1;
                        byte b15;
                        while (true) {
                            b15 = b14;
                            if ((byte)(i.a[a - b15][a2] - 80) >= 0 || i.a[a - b15][a2] == 10 || i.a[a - b15][a2] == 37 || i.a[a - b15][a2] == 34 || i.a[a - b15][a2] == 35) {
                                break;
                            }
                            b14 = (byte)(b15 + 1);
                        }
                        b7 = this.w;
                        b8 = b15;
                        b9 = 49;
                        b10 = 5;
                        break;
                    }
                }
                a((int)b7, b8, b9, b10);
            }
        }
        Label_4517: {
            switch (this.x) {
                case 2: {
                    byte b17;
                    byte b16 = b17 = 1;
                    while (true) {
                        final byte b18 = b17;
                        if (b16 > 15) {
                            break Label_4517;
                        }
                        Label_3627: {
                            switch (a((int)b18, (byte)28, (byte)3)) {
                                case 3: {
                                    f(b18);
                                    break;
                                }
                                case 2: {
                                    if (this.dz >= 0) {
                                        ++this.dz;
                                        final byte b19 = b18;
                                        int a4 = a((int)b19, (byte)14, (byte)6);
                                        int a5 = a((int)b19, (byte)20, (byte)6);
                                        final int a6 = a((int)b19, (byte)0, (byte)7);
                                        final int a7 = a((int)b19, (byte)7, (byte)7);
                                        final int a8 = a((int)b19, (byte)47, (byte)2);
                                        final byte b21;
                                        final byte b20 = (byte)a(b21 = (byte)a((int)b19, (byte)54, (byte)3), (byte)6, (byte)7);
                                        switch (a8) {
                                            case 1: {
                                                final byte b22 = (byte)a((int)b19, (byte)49, (byte)5);
                                                if (this.dz == 0 || this.dz % b22 != 0) {
                                                    break;
                                                }
                                                this.dz = 0;
                                                final byte b23 = (byte)a((int)b19, (byte)26, (byte)2);
                                                final byte b24 = (byte)a((int)b19, (byte)57, (byte)1);
                                                if (b23 < 0) {
                                                    break;
                                                }
                                                if (b24 != 1) {
                                                    byte b26;
                                                    byte b25 = b26 = 0;
                                                    while (true) {
                                                        final byte b27 = b26;
                                                        if (b25 >= b22) {
                                                            break;
                                                        }
                                                        a(a4 - b27, a5, b23, (byte)7, (byte)3, (byte)4);
                                                        a((int)b19, b23, (byte)43, (byte)2);
                                                        a(a4 - b27, a5, b23, b19, (byte)0, (byte)3);
                                                        b25 = (b26 = (byte)(b27 + 1));
                                                    }
                                                    if (this.dr > 0) {
                                                        int n2 = a5;
                                                        byte b28;
                                                        if ((b28 = (byte)(b23 + 1)) > 2) {
                                                            b28 = 0;
                                                            ++n2;
                                                        }
                                                        byte b30;
                                                        byte b29 = b30 = 0;
                                                        while (true) {
                                                            final byte b31 = b30;
                                                            if (b29 >= b22) {
                                                                break;
                                                            }
                                                            if ((byte)(i.a[a4 - b31][n2] - 80) < 0 && i.a[a4 - b31][n2] != 10 && i.a[a4 - b31][n2] != 37 && i.a[a4 - b31][n2] != 34 && i.a[a4 - b31][n2] != 35) {
                                                                a(a4 - b31, n2, b28, (byte)8, (byte)3, (byte)4);
                                                            }
                                                            b29 = (b30 = (byte)(b31 + 1));
                                                        }
                                                    }
                                                    ++this.dr;
                                                }
                                                if (b24 == 1 || ((a7 >= a6 || b20 == 0) && b23 == this.v)) {
                                                    if (b24 == 1) {
                                                        a((int)b19, (byte)0, (byte)57, (byte)1);
                                                    }
                                                    a((int)b19, (byte)3, (byte)28, (byte)3);
                                                    if (b20 == 0) {
                                                        a(b21, (byte)3, (byte)0, (byte)4);
                                                        a((int)b19, (byte)5, (byte)28, (byte)3);
                                                        if (this.dq == -1) {
                                                            this.dz = -1;
                                                            this.x = 4;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (b23 == 0) {
                                                    a((int)b19, (byte)0, (byte)47, (byte)2);
                                                    a((int)b19, (byte)2, (byte)26, (byte)2);
                                                    break;
                                                }
                                                a((int)b19, (byte)(b23 - 1), (byte)26, (byte)2);
                                                break;
                                            }
                                            case 0: {
                                                a((int)b19, (byte)1, (byte)47, (byte)2);
                                                --a5;
                                                a((int)b19, (byte)a5, (byte)20, (byte)6);
                                                if ((byte)(i.a[a4][a5] - 80) >= 0 || i.a[a4][a5] == 10 || i.a[a4][a5] == 37 || i.a[a4][a5] == 34 || i.a[a4][a5] == 35) {
                                                    while ((byte)(i.a[a4][a5] - 80) >= 0 || i.a[a4][a5] == 10 || i.a[a4][a5] == 37 || i.a[a4][a5] == 34 || i.a[a4][a5] == 35) {
                                                        --a4;
                                                    }
                                                }
                                                else {
                                                    while ((byte)(i.a[a4 + 1][a5] - 80) < 0 && i.a[a4 + 1][a5] != 10 && i.a[a4 + 1][a5] != 37 && i.a[a4 + 1][a5] != 34 && i.a[a4 + 1][a5] != 35) {
                                                        ++a4;
                                                    }
                                                }
                                                a((int)b19, (byte)a4, (byte)14, (byte)6);
                                                byte b32 = 1;
                                                byte b33;
                                                while (true) {
                                                    b33 = b32;
                                                    if ((byte)(i.a[a4 - b33][a5] - 80) >= 0 || i.a[a4 - b33][a5] == 10 || i.a[a4 - b33][a5] == 37 || i.a[a4 - b33][a5] == 34 || i.a[a4 - b33][a5] == 35) {
                                                        break;
                                                    }
                                                    b32 = (byte)(b33 + 1);
                                                }
                                                a((int)b19, b33, (byte)49, (byte)5);
                                                byte a9 = (byte)(b20 - b33);
                                                byte b34 = 0;
                                                this.v = 0;
                                                if (a9 < 0) {
                                                    final int n3 = -a9 * 3;
                                                    byte b35 = 0;
                                                    final int n4;
                                                    if ((n4 = b33 + a9) * 3 - b33 != 0 && n4 * 3 <= b33 * 3 / 2) {
                                                        b35 = 1;
                                                    }
                                                    this.v = (byte)(n3 / b33);
                                                    this.v += b35;
                                                    if (this.v > 2) {
                                                        a((int)b19, (byte)1, (byte)57, (byte)1);
                                                    }
                                                    b34 = (byte)Math.abs(a9);
                                                    a9 = 0;
                                                }
                                                int n5;
                                                if ((n5 = a7 + (b33 - b34)) > a6) {
                                                    final int n6 = a6 - n5;
                                                    n5 += n6;
                                                    a9 -= (byte)n6;
                                                }
                                                a((int)b19, (byte)n5, (byte)7, (byte)7);
                                                a(b21, a9, (byte)6, (byte)7);
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 6:
                                case 7: {
                                    final byte b36 = b18;
                                    int a10 = a((int)b36, (byte)31, (byte)6);
                                    final int a11 = a((int)b36, (byte)37, (byte)6);
                                    final byte b37 = (byte)a((int)b36, (byte)43, (byte)2);
                                    final byte b38 = (byte)a(i.e[a10][a11], b37, (byte)7, (byte)2);
                                    byte b39 = (byte)a((int)b36, (byte)45, (byte)2);
                                    final boolean b40 = (byte)a((int)b36, (byte)28, (byte)3) == 7;
                                    byte b41 = 0;
                                    if (b39 > 1) {
                                        b39 = -1;
                                    }
                                    if (b38 == 0) {
                                        byte b42 = (byte)(b37 + 1);
                                        int n7 = a11;
                                        if (b37 == 2) {
                                            b42 = 0;
                                            n7 = a11 + 1;
                                        }
                                        if (a(i.e[a10][n7], b42, (byte)3, (byte)4) == 7) {
                                            this.dr = 1;
                                            if (b40) {
                                                f(b36);
                                                this.x = 3;
                                                this.al = true;
                                                break;
                                            }
                                            int n8;
                                            if ((n8 = b42 - 1) < 0) {
                                                n8 = 2;
                                            }
                                            this.dz = 0;
                                            final byte b43 = (byte)a(i.e[a10][n7], b42, (byte)0, (byte)3);
                                            a((int)b43, (byte)a((int)b36, (byte)54, (byte)3), (byte)54, (byte)3);
                                            a((int)b43, (byte)2, (byte)28, (byte)3);
                                            a((int)b43, (byte)0, (byte)47, (byte)2);
                                            a((int)b43, (byte)n8, (byte)26, (byte)2);
                                            a((int)b43, (byte)a10, (byte)14, (byte)6);
                                            a((int)b43, (byte)n7, (byte)20, (byte)6);
                                            a((int)b43, (byte)0, (byte)57, (byte)1);
                                            f(b36);
                                            break;
                                        }
                                    }
                                    if (b37 == 2 && b38 == 0) {
                                        if ((byte)(i.a[a10][a11 + 1] - 80) >= 0 || i.a[a10][a11 + 1] == 10 || i.a[a10][a11 + 1] == 37 || i.a[a10][a11 + 1] == 34 || i.a[a10][a11 + 1] == 35) {
                                            Label_2855: {
                                                i i;
                                                byte b44;
                                                int n9;
                                                int n10;
                                                byte b45;
                                                byte b46;
                                                byte b47;
                                                if (b39 == 0) {
                                                    if (b40) {
                                                        c(a10, a11, b37);
                                                    }
                                                    else {
                                                        a(a10, a11, b37, (byte)15, (byte)3, (byte)4);
                                                    }
                                                    if ((b41 = this.a(b36, a10, a11, b39, b37, (byte)1, b40)) < 0) {
                                                        i = this;
                                                        b44 = b36;
                                                        n9 = a10;
                                                        n10 = a11;
                                                        b45 = b39;
                                                        b46 = b37;
                                                        b47 = -1;
                                                    }
                                                    else {
                                                        if ((byte)(i.a[a10 - 1][a11] - 80) < 0 && i.a[a10 - 1][a11] != 10 && i.a[a10 - 1][a11] != 37 && i.a[a10 - 1][a11] != 34 && i.a[a10 - 1][a11] != 35) {
                                                            this.a(a10 - 1, a11, (byte)(b40 ? 7 : 5), (byte)(-1), (byte)2, (byte)a((int)b36, (byte)54, (byte)3));
                                                        }
                                                        break Label_2855;
                                                    }
                                                }
                                                else {
                                                    i = this;
                                                    b44 = b36;
                                                    n9 = a10;
                                                    n10 = a11;
                                                    b45 = b39;
                                                    b46 = b37;
                                                    b47 = b39;
                                                }
                                                b41 = i.a(b44, n9, n10, b45, b46, b47, b40);
                                            }
                                            if (b41 == -2) {
                                                byte b53 = 0;
                                                byte b54 = 0;
                                                byte b55 = 0;
                                                byte b56 = 0;
                                                Label_3362: {
                                                    final int n12;
                                                    final int n11;
                                                    if ((n11 = (n12 = i.b[a10][a11 + 1])) != -1 && a(n11, (byte)6, (byte)1) == 1) {
                                                        final int n13 = a10;
                                                        final int n14 = a11;
                                                        final byte b48 = b39;
                                                        final int n15 = n14;
                                                        int n16 = n13;
                                                        boolean b49 = true;
                                                        boolean b50 = true;
                                                        boolean b52 = false;
                                                    Label_3289:
                                                        while (true) {
                                                            boolean b51 = b50;
                                                            while (b51) {
                                                                b51 = true;
                                                                n16 -= b48;
                                                                if (b48 == 0) {
                                                                    if ((byte)(i.a[n16 - 1][n15] - 80) >= 0 || i.a[n16 - 1][n15] == 10 || i.a[n16 - 1][n15] == 37 || i.a[n16 - 1][n15] == 34 || (i.a[n16 - 1][n15] == 35 && (byte)(i.a[n16 + 1][n15] - 80) >= 0) || i.a[n16 + 1][n15] == 10 || i.a[n16 + 1][n15] == 37 || i.a[n16 + 1][n15] == 34 || i.a[n16 + 1][n15] == 35) {
                                                                        b49 = true;
                                                                        b50 = false;
                                                                        continue Label_3289;
                                                                    }
                                                                    continue;
                                                                }
                                                                else {
                                                                    if ((byte)(i.a[n16][n15 + 1] - 80) < 0 && i.a[n16][n15 + 1] != 10 && i.a[n16][n15 + 1] != 37 && i.a[n16][n15 + 1] != 34 && i.a[n16][n15 + 1] != 35) {
                                                                        b51 = false;
                                                                    }
                                                                    if ((byte)(i.a[n16][n15] - 80) >= 0 || i.a[n16][n15] == 10 || i.a[n16][n15] == 37 || i.a[n16][n15] == 34 || i.a[n16][n15] == 35) {
                                                                        b49 = b51;
                                                                        b50 = false;
                                                                        continue Label_3289;
                                                                    }
                                                                    if (!b51) {
                                                                        b52 = b51;
                                                                        break Label_3289;
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                            b52 = b49;
                                                            break;
                                                        }
                                                        if (b52) {
                                                            this.dr = 0;
                                                            this.dz = 0;
                                                            a((int)b36, (byte)2, (byte)28, (byte)3);
                                                            a((int)b36, a(n12, (byte)0, (byte)6), (byte)0, (byte)7);
                                                            a((int)b36, (byte)2, (byte)26, (byte)2);
                                                            a((int)b36, (byte)a10, (byte)14, (byte)6);
                                                            b53 = b36;
                                                            b54 = (byte)(a11 + 1);
                                                            b55 = 20;
                                                            b56 = 6;
                                                            break Label_3362;
                                                        }
                                                    }
                                                    b53 = b36;
                                                    b54 = 3;
                                                    b55 = 28;
                                                    b56 = 3;
                                                }
                                                a((int)b53, b54, b55, b56);
                                                a10 += b39;
                                            }
                                            else {
                                                b39 = b41;
                                                a10 += b39;
                                            }
                                        }
                                        else if (b39 != 0) {
                                            b39 = 0;
                                            a((int)b36, (byte)0, (byte)45, (byte)2);
                                        }
                                    }
                                    if (b41 == -2) {
                                        break;
                                    }
                                    switch (b39) {
                                        case 0: {
                                            final byte b57 = b36;
                                            final byte b58 = (byte)a10;
                                            final int n17 = a11;
                                            final byte b59 = b37;
                                            final boolean b60 = b40;
                                            final byte b61 = b59;
                                            int n18 = n17;
                                            final byte b62 = b58;
                                            final byte b63 = b57;
                                            if (!b60 && a(i.e[b62][n18], b61, (byte)3, (byte)4) == 0) {
                                                a((int)b62, n18, b61, (byte)3, (byte)3, (byte)4);
                                            }
                                            byte b64;
                                            if ((b64 = (byte)(b61 + 1)) > 2) {
                                                b64 = 0;
                                                ++n18;
                                                a((int)b63, (byte)n18, (byte)37, (byte)6);
                                            }
                                            a((int)b63, b64, (byte)43, (byte)2);
                                            byte b65;
                                            int n19;
                                            byte b66;
                                            byte b67;
                                            if (b60) {
                                                b65 = b62;
                                                n19 = n18;
                                                b66 = b64;
                                                b67 = 6;
                                            }
                                            else {
                                                a((int)b62, n18, b64, b63, (byte)0, (byte)3);
                                                b65 = b62;
                                                n19 = n18;
                                                b66 = b64;
                                                b67 = 0;
                                            }
                                            a((int)b65, n19, b66, b67, (byte)3, (byte)4);
                                            break Label_3627;
                                        }
                                        case -1:
                                        case 1: {
                                            final byte b68 = (byte)a10;
                                            final int n20 = a11;
                                            final byte b69 = b37;
                                            final byte b70 = b38;
                                            final byte b71 = b69;
                                            final int n21 = n20;
                                            final byte b72 = b68;
                                            byte b73;
                                            if ((b73 = (byte)(b70 + 1)) > 2) {
                                                b73 = 0;
                                            }
                                            a((int)b72, n21, b71, b73, (byte)7, (byte)2);
                                            break Label_3627;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        b16 = (b17 = (byte)(b18 + 1));
                    }
                    break;
                }
                case 1: {
                    this.x = 2;
                    return;
                }
                case 4: {
                    byte b75;
                    byte b74 = b75 = 0;
                    while (true) {
                        final byte b76 = b75;
                        if (b74 >= 15) {
                            break;
                        }
                        Label_3776: {
                            if (a(b76, (byte)0, (byte)4) == 3) {
                                int a12 = a(b76, (byte)13, (byte)7);
                                int a13 = a(b76, (byte)20, (byte)7);
                                final int a14 = a(b76, (byte)4, (byte)2);
                                i.b[b76] = 0L;
                                byte b77 = 0;
                                byte b78 = 0;
                                while (true) {
                                    byte b79 = 0;
                                    Label_3752: {
                                        byte b80 = 0;
                                        switch (a14) {
                                            case 0: {
                                                ++a13;
                                                b77 = 0;
                                                b79 = 0;
                                                break Label_3752;
                                            }
                                            case 1: {
                                                ++a12;
                                                b80 = 1;
                                                break;
                                            }
                                            case 2: {
                                                --a12;
                                                b80 = -1;
                                                break;
                                            }
                                            default: {
                                                this.a(a12, a13, (byte)7, b77, b78, b(a12, a13));
                                                break Label_3776;
                                            }
                                        }
                                        b77 = b80;
                                        b79 = 2;
                                    }
                                    b78 = b79;
                                    continue;
                                }
                            }
                        }
                        b74 = (b75 = (byte)(b76 + 1));
                    }
                    this.x = 2;
                    return;
                }
                case 5: {
                    final int dv = this.dv;
                    final int dw = this.dw;
                    final int dv2 = dv;
                    this.dq = 0;
                    int[] array;
                    int n22;
                    if (this.dx > 1) {
                        array = i.e[dv2];
                        n22 = dw - 1;
                    }
                    else {
                        array = i.e[dv2 + this.dx];
                        n22 = dw;
                    }
                    a((int)(this.w = (byte)a(array[n22], (byte)2, (byte)0, (byte)3)), (byte)0, (byte)47, (byte)2);
                    final int a15 = a((int)this.w, (byte)7, (byte)7);
                    int n23 = 0;
                    int n24 = 0;
                    int dy = 0;
                    int n25 = 0;
                    int n26 = 0;
                    switch (this.dx) {
                        case 2: {
                            n23 = 0;
                            n24 = dv2;
                            dy = dw;
                            n25 = a15;
                            n26 = dw - 1;
                            final int n27 = -1;
                            this.dw = n27;
                            this.dv = n27;
                            break;
                        }
                        default: {
                            final int dx = this.dx;
                            n24 = dv2 + dx;
                            n23 = ((dx < 0) ? 1 : 2);
                            dy = dw + 1;
                            final int n28 = a15;
                            final int n29 = n24;
                            int n30 = dy;
                            int n31 = n29;
                            byte a16 = 0;
                            int n32 = 1;
                            final int dx2 = this.dx;
                            int n33 = 0;
                        Label_4322:
                            while (true) {
                                int n34 = 0;
                                while ((i.e[n31 + dx2][n30 - 1] != 0 && (byte)(i.a[n31][n30] - 80) >= 0) || i.a[n31][n30] == 10 || i.a[n31][n30] == 37 || i.a[n31][n30] == 34 || i.a[n31][n30] == 35) {
                                    n31 += dx2;
                                }
                                int n35 = 0;
                                int a17;
                                while (true) {
                                    a17 = n35;
                                    if ((byte)(i.a[n31 + a17][n30] - 80) >= 0 || i.a[n31 + a17][n30] == 10 || i.a[n31 + a17][n30] == 37 || i.a[n31 + a17][n30] == 34 || i.a[n31 + a17][n30] == 35) {
                                        break;
                                    }
                                    if (n32 != 0) {
                                        n32 = 0;
                                        a((int)(a16 = this.a(n31, n30, (byte)8, (byte)(-2), (byte)2, (byte)0)), (byte)5, (byte)28, (byte)3);
                                        a((int)a16, (byte)n31, (byte)14, (byte)6);
                                        a((int)a16, (byte)n30, (byte)20, (byte)6);
                                    }
                                    a(n31 + a17, n30, (byte)2, a16, (byte)0, (byte)3);
                                    n35 = a17 + dx2;
                                }
                                final int abs = Math.abs(a17);
                                n33 += abs;
                                ++n30;
                                while (i.e[n31][n30] == 0) {
                                    n31 += dx2;
                                    if (n34 >= abs || n31 < 0 || n31 == this.e) {
                                        break Label_4322;
                                    }
                                    ++n34;
                                }
                            }
                            if (n33 > 0) {
                                a((int)a16, (byte)n33, (byte)7, (byte)7);
                            }
                            n25 = n28 - n33;
                            n26 = dw;
                            this.dv = dv2;
                            this.dw = dw;
                            break;
                        }
                    }
                    a((int)this.w, (byte)n23, (byte)45, (byte)2);
                    this.dy = dy;
                    this.a((byte)n25, (byte)n24, (byte)n26, (byte)n23);
                    byte b81;
                    a(b81 = b(n24, n26), (byte)2, (byte)0, (byte)4);
                    this.x = 1;
                    while (true) {
                        i j = null;
                        int n36 = 0;
                        int n37 = 0;
                        byte b82 = 0;
                        byte b83 = 0;
                        byte b84 = 0;
                        Label_4495: {
                            switch (this.dx) {
                                case 2: {
                                    j = this;
                                    n36 = n24;
                                    n37 = dw;
                                    b82 = 3;
                                    b83 = 0;
                                    b84 = 0;
                                    break Label_4495;
                                }
                                case 1: {
                                    j = this;
                                    n36 = n24 - 1;
                                    n37 = dw;
                                    b82 = 14;
                                    b83 = -1;
                                    break;
                                }
                                case -1: {
                                    j = this;
                                    n36 = n24 + 1;
                                    n37 = dw;
                                    b82 = 11;
                                    b83 = 1;
                                    break;
                                }
                                default: {
                                    a((int)b81, (byte)6, (byte)28, (byte)3);
                                    this.dx = 0;
                                    break Label_4517;
                                }
                            }
                            b84 = 2;
                        }
                        b81 = j.a(n36, n37, b82, b83, b84, b81);
                        continue;
                    }
                }
            }
        }
    }
    
    private static void f(final byte b) {
        i.a[b - 1] = 0L;
    }
    
    private byte a(final byte b, int n, final int n2, final byte b2, final byte b3, final byte b4, final boolean b5) {
        byte b6;
        if ((byte)(i.a[n + b4][n2] - 80) >= 0 || i.a[n + b4][n2] == 10 || i.a[n + b4][n2] == 37 || i.a[n + b4][n2] == 34 || i.a[n + b4][n2] == 35) {
            b6 = -2;
        }
        else {
            if (b2 != (b6 = b4)) {
                a((int)b, (byte)((b4 < 0) ? 2 : b4), (byte)45, (byte)2);
            }
            n += b4;
            a((int)b, (byte)n, (byte)31, (byte)6);
            a(n, n2, b3, b, (byte)0, (byte)3);
            if (b5) {
                c(n, n2, b3);
            }
            else {
                final int a = a((int)b, (byte)28, (byte)3);
                int n3;
                byte b7;
                if (b4 > 0) {
                    n3 = ((a == 6 && this.dv == n && this.dw == n2) ? 11 : 4);
                    b7 = 9;
                }
                else {
                    n3 = ((a == 6 && this.dv == n && this.dw == n2) ? 14 : 5);
                    b7 = 12;
                }
                final byte b8 = b7;
                int n4;
                int n5;
                byte b9;
                int n6;
                if ((byte)(i.a[n][n2 + 1] - 80) >= 0 || i.a[n + b4][n2] == 10 || i.a[n + b4][n2] == 37 || i.a[n + b4][n2] == 34 || i.a[n + b4][n2] == 35) {
                    n4 = n;
                    n5 = n2;
                    b9 = b3;
                    n6 = n3;
                }
                else {
                    n4 = n;
                    n5 = n2;
                    b9 = b3;
                    n6 = b8;
                }
                a(n4, n5, b9, (byte)n6, (byte)3, (byte)4);
            }
        }
        return b6;
    }
    
    private static byte a(final int n, final byte b, final byte b2) {
        return (byte)(n >>> b & ~(16777215 << b2));
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
            a((int)b6, (byte)7, (byte)28, (byte)3);
        }
        else {
            a((int)b6, (byte)1, (byte)28, (byte)3);
            a((int)b6, b4, (byte)54, (byte)3);
            a(n, n2, b3, b6, (byte)0, (byte)3);
            a(n, n2, b3, b, (byte)3, (byte)4);
        }
        a((int)b6, (byte)n, (byte)31, (byte)6);
        a((int)b6, (byte)n2, (byte)37, (byte)6);
        a((int)b6, b3, (byte)43, (byte)2);
        if (b2 < 0) {
            b2 = 2;
        }
        a((int)b6, b2, (byte)45, (byte)2);
        return b6;
    }
    
    private static int a(final int n, final int n2, int a, final byte b) {
        final byte b2;
        final int a2 = a((int)(b2 = (byte)a(a, b, (byte)0, (byte)3)), (byte)31, (byte)6);
        final int a3 = a((int)b2, (byte)37, (byte)6);
        final int a4 = a((int)b2, (byte)43, (byte)2);
        a = a(a, b, (byte)3, (byte)4);
        if (a2 == n && a3 == n2 && a4 == b) {
            int n3 = 0;
            switch (a) {
                case 4: {
                    n3 = 1;
                    break;
                }
                case 5: {
                    n3 = 2;
                    break;
                }
                default: {
                    return a << 1;
                }
            }
            a = n3;
            return a << 1;
        }
        switch (a) {
            case 6: {
                c(n, n2, b);
                break;
            }
        }
        return a << 1;
    }
    
    private void l(final int dv, final int dw) {
        if (this.l) {
            this.dx = ((i.e[dv - 1][dw] != 0) ? -1 : ((i.e[dv + 1][dw] != 0) ? 1 : 0));
            if (this.dx == 0) {
                this.dx = ((i.e[dv][dw - 1] != 0) ? 2 : 0);
            }
            if (this.dx != 0) {
                this.x = 5;
                this.p(13);
                this.dv = dv;
                this.dw = dw;
            }
        }
    }
    
    private void m(final int n, final int n2) {
        final byte b;
        int n3;
        if ((b = b(n, n2)) >= 0) {
            a(b, (byte)2, (byte)0, (byte)4);
            n3 = 39;
        }
        else {
            n3 = -1;
        }
        if (n3 > 0) {
            i.a[n][n2] = -1;
            this.x = 1;
            this.a(n, n2 + 1, (byte)0, (byte)0, (byte)0, b(n, n2));
        }
    }
    
    private static int b(final f f, int n) {
        n = (n << 2) + 3;
        return f.a[n] & 0xFF;
    }
    
    private static int c(final f f, int n) {
        n = (n << 2) + 2;
        return f.a[n] & 0xFF;
    }
    
    private static void o(int n) {
        try {
            n %= 8;
            i.f = d.a(n + 69);
            if (n <= 4) {
                i.a = a("/tips.f", n);
                return;
            }
            i.a = null;
        }
        catch (Exception ex) {}
    }
    
    private void at() {
        this.R = false;
        o(this.ag);
        final Graphics a;
        (a = this.a).setColor(798521);
        a.fillRoundRect(20, 40, 200, 220, 8, 8);
        a.setColor(13540096);
        a.drawRoundRect(20, 40, 200, 220, 8, 8);
        final i i = this;
        final Graphics graphics = a;
        final String f = i.f;
        int a2 = 65;
        final String s = f;
        final Graphics graphics2 = graphics;
        this = i;
        final String[] a3 = c.a(s, '\n');
        final int n = this.ag % 8;
        for (int j = 0; j < a3.length; ++j) {
            i.a.a.getHeight();
            int n3;
            final int n2 = ((n == 0 && (j == 1 || j == 4)) || (n > 0 && n < 4 && j == 1)) ? ((n == 0 && j == 1) ? (n3 = 7) : ((n == 0 && j == 4) ? (n3 = 6) : (n3 = 0))) : (n3 = -1);
            final int n4 = n3;
            if (n2 >= 0) {
                if (i.a == null) {
                    i.a = a("/tips.f", this.ag);
                }
                if (i.a != null) {
                    try {
                        i.a.a(graphics2, n4, 120 - c(i.a, n4) / 2, a2 - 5, 0);
                        a2 += (i.a.a[(n4 << 2) + 3] & 0xFF) + 10;
                    }
                    catch (Exception ex) {}
                }
            }
            else {
                a2 = c.a(graphics2, a3[j], 120, a2, 170);
            }
        }
    }
    
    private static void a(final Graphics graphics, final h h, String s, final int n, final int n2, int a, int a2, final boolean b) {
        h.d = a2;
        if (s.endsWith("\n")) {
            s = s.substring(0, s.length() - 1);
        }
        s = a(s, 230);
        a = a(h, s, b ? -1 : 0);
        a2 = h.a(s);
        final int n3 = n - (a >> 1);
        graphics.setColor(798521);
        graphics.fillRoundRect(n3 - 5, n2 - 5, a + 10, a2 + 10, 10, 10);
        graphics.setColor(13540096);
        graphics.drawRoundRect(n3 - 5, n2 - 5, a + 10, a2 + 10, 10, 10);
        h.a(graphics, s, n, n2 + 10, 17);
    }
    
    private void au() {
        this.H = false;
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
        i.f = null;
        i.c = null;
        System.gc();
    }
    
    private void av() {
        this.e();
        this.au = true;
        this.av = true;
        this.an = true;
        i.b = 21;
        this.bs = 0;
        this.br = 14;
        this.dK = 100;
        if (this.aB > b(this.aA)) {
            this.aB = b(this.aA);
        }
        this.aw();
    }
    
    private void aw() {
        i.a = new long[12][12];
        this.c = new int[20];
    }
    
    private static int a(final long n, final byte b, final byte b2) {
        return (int)(n >>> b & ~(-1L << b2));
    }
    
    private static void a(final int n, final int n2, final int n3, final byte b, final byte b2) {
        final long n4 = i.a[n][n2];
        i.a[n][n2] = ((n4 ^ (long)a(n4, b, b2) << b) | (long)n3 << b);
    }
    
    private boolean h() {
        boolean b = false;
        final int n = this.ei >> 1;
        i i;
        int ek;
        if (this.ek < 0) {
            i = this;
            ek = 2;
        }
        else {
            i = this;
            ek = this.ek - 1;
        }
        i.ek = ek;
        if (this.dX == 0 && this.dY == 0) {
            this.dX = this.dV;
            this.dY = this.dW;
        }
        if (this.ek == 0) {
            boolean b2;
            if (this.ej == n) {
                b2 = true;
            }
            else {
                ++this.ej;
                b2 = false;
            }
            b = b2;
        }
        final int a = a(i.a[this.dV][this.dW], (byte)3, (byte)3);
        final int a2 = a(i.a[this.dX][this.dY], (byte)3, (byte)3);
        int n2 = 0;
        while (true) {
            int n3 = 0;
            switch ((a == 1 || a2 == 1) ? 1 : a) {
                case 0: {
                    n3 = 2;
                    break;
                }
                case 1: {
                    n3 = 8;
                    break;
                }
                default: {
                    int j = 0;
                    for (int n4 = this.as ? (n - 1) : 0, n5 = this.as ? -1 : 1; j < this.ej; ++j, n4 += n5) {
                        final int n6 = n4 << 1;
                        i.a[17].a(this.a, n2, this.c[n6], this.c[n6 + 1], 0);
                    }
                    int n7 = 0;
                    int n8 = 0;
                    while (true) {
                        int n9 = 0;
                        switch (a) {
                            case 0: {
                                n8 = 0;
                                n9 = 0;
                                break;
                            }
                            case 1: {
                                n8 = 2;
                                n9 = 9;
                                break;
                            }
                            default: {
                                final int n10 = this.dV * 13 + n8 + 37;
                                final int n11 = this.dW * 13 + n8 + 73;
                                i.a[17].a(this.a, n7, n10, n11, 0);
                                i.a[17].a(this.a, this.ao ? 7 : 6, n10 + 6, n11 + 6, 0);
                                boolean b3 = true;
                                if (j == n) {
                                    i k;
                                    int em;
                                    if (this.em < 0) {
                                        k = this;
                                        em = 2;
                                    }
                                    else {
                                        k = this;
                                        em = this.em - 1;
                                    }
                                    k.em = em;
                                    if (this.em == 0) {
                                        this.em = 1;
                                        b3 = false;
                                    }
                                }
                                Label_0553: {
                                    if (!b3) {
                                        int n12 = 0;
                                        switch (a2) {
                                            case 0: {
                                                n8 = 0;
                                                n12 = 0;
                                                break;
                                            }
                                            case 1: {
                                                n8 = 2;
                                                n12 = 9;
                                                break;
                                            }
                                            default: {
                                                break Label_0553;
                                            }
                                        }
                                        n7 = n12;
                                    }
                                    else {
                                        int n13 = 0;
                                        switch (a2) {
                                            case 0: {
                                                n8 = 0;
                                                n13 = 1;
                                                break;
                                            }
                                            case 1: {
                                                n8 = 2;
                                                n13 = 5;
                                                break;
                                            }
                                            default: {
                                                break Label_0553;
                                            }
                                        }
                                        n7 = n13;
                                    }
                                }
                                final int n14 = this.dX * 13 + n8 + 37;
                                final int n15 = this.dY * 13 + n8 + 73;
                                i.a[17].a(this.a, n7, n14, n15, 0);
                                if (!b3) {
                                    boolean b4;
                                    if (this.el == i.a[9].a(0)) {
                                        --this.el;
                                        this.ar = true;
                                        b4 = true;
                                    }
                                    else {
                                        b4 = false;
                                    }
                                    b = b4;
                                    if (!this.P) {
                                        i.a[9].a(this.a, this.el, n14, n15, 0);
                                    }
                                    ++this.el;
                                }
                                return b;
                            }
                        }
                        n7 = n9;
                        continue;
                    }
                }
            }
            n2 = n3;
            continue;
        }
    }
    
    private void n(final int n, final int n2) {
        i i;
        if (!this.at) {
            final int a = a(i.a[this.cx][this.cy], (byte)6, (byte)5);
            if ((n2 != i.dZ || n != a) && (n != i.dZ || n2 != a)) {
                return;
            }
            if (n == i.dZ && n2 == a) {
                this.as = true;
            }
            i = this;
        }
        else {
            if ((n2 != i.dZ || n != i.dZ - 1) && (n != i.dZ || n2 != i.dZ - 1)) {
                return;
            }
            if (n == i.dZ && n2 == i.dZ - 1) {
                this.as = true;
            }
            i = this;
        }
        i.c[this.ei++] = this.ea;
        this.c[this.ei++] = this.eb;
    }
    
    private void ax() {
        this.dL = 0;
        if (((this.a(this.aA, this.aB + 1) & 0x2) != 0x0 && this.aB + 1 == i.dZ) || this.aB == i.dZ) {
            this.aq = false;
            this.ar = true;
        }
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                final long n = i.a[i][j];
                boolean b = false;
                if (n != 0L) {
                    final int a = a(n, (byte)3, (byte)3);
                    final int a2 = a(n, (byte)6, (byte)5);
                    final int n2 = (!this.ar && a2 == i.dZ && a2 != 0) ? 1 : a(n, (byte)0, (byte)3);
                    int n3 = -1;
                    int n4 = -1;
                    int n5 = -1;
                    Label_0278: {
                        if (n2 == 0) {
                            b = (this.b(this.aA, a2) == this.c(this.aA, a2));
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
                                    break Label_0278;
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
                    final int n7 = i;
                    final int n8 = j;
                    final long n9 = n;
                    final int n10 = a;
                    final int n11 = n2;
                    final int n12 = n10;
                    final long n13 = n9;
                    final int n14 = n8;
                    final int n15 = n7;
                    final int a3 = a(n13, (byte)6, (byte)5);
                    this.dL |= 1 << a3;
                    for (int a4 = a(n13, (byte)11, (byte)3), n16 = 14, k = 0; k < a4; ++k, n16 += 4) {
                        int ea = 37 + n15 * 13;
                        int eb = 73 + n14 * 13;
                        final int a5 = a(n13, (byte)n16, (byte)4);
                        n16 += 4;
                        final int a6 = a(n13, (byte)n16, (byte)4);
                        final int n17 = a5;
                        final int n18 = a6;
                        final long n19;
                        final int a7 = a(n19 = i.a[n17][n18], (byte)6, (byte)5);
                        if ((this.dL & 1 << a7) <= 0) {
                            int n20 = 37 + n17 * 13;
                            int n21 = 73 + n18 * 13;
                            ea += 6;
                            eb += 6;
                            n20 += 6;
                            n21 += 6;
                            this.ea = ea;
                            this.eb = eb;
                            this.ec = 0;
                            this.ed = n20 - ea;
                            this.ee = n21 - eb;
                            this.ef = 0;
                            this.eg = 0;
                            this.eh = 1;
                            int n22 = 1;
                            int n23 = 1;
                            if (this.ed < 0) {
                                n22 = -1;
                                this.ed = -this.ed;
                            }
                            if (this.ee < 0) {
                                n23 = -1;
                                this.ee = -this.ee;
                            }
                            int n24 = 0;
                            int a8 = a(n19, (byte)0, (byte)3);
                            int a9 = a(n19, (byte)3, (byte)3);
                            if (n12 == 1) {
                                a9 = n12;
                            }
                            if (n11 == 1) {
                                if (a9 == 1) {
                                    continue;
                                }
                                a8 = n11;
                            }
                            if (!this.ar && a7 == i.dZ) {
                                a8 = 1;
                            }
                            Label_0699: {
                                if (a8 == 0) {
                                    int n25 = 0;
                                    switch (a9) {
                                        case 0: {
                                            n25 = 2;
                                            break;
                                        }
                                        case 1: {
                                            n25 = 8;
                                            break;
                                        }
                                        default: {
                                            break Label_0699;
                                        }
                                    }
                                    n24 = n25;
                                }
                                else {
                                    int n26 = 0;
                                    switch (a9) {
                                        case 0: {
                                            n26 = 3;
                                            break;
                                        }
                                        case 1: {
                                            n26 = 4;
                                            break;
                                        }
                                        default: {
                                            break Label_0699;
                                        }
                                    }
                                    n24 = n26;
                                }
                            }
                            if (this.ee <= this.ed) {
                                this.ef = this.ed << 1;
                                this.eg = this.ee << 1;
                                while (true) {
                                    if (this.eh % 8 == 0) {
                                        i.a[17].a(i.c, n24, this.ea - 20, this.eb - 69, 0);
                                        if (this.aq) {
                                            this.n(a3, a7);
                                        }
                                    }
                                    if (this.ea == n20) {
                                        break;
                                    }
                                    this.ea += n22;
                                    this.ec += this.eg;
                                    if (this.ec > this.ed) {
                                        this.eb += n23;
                                        this.ec -= this.ef;
                                    }
                                    ++this.eh;
                                }
                            }
                            else {
                                this.ef = 2 * this.ee;
                                this.eg = 2 * this.ed;
                                while (true) {
                                    if (this.eh % 8 == 0) {
                                        i.a[17].a(i.c, n24, this.ea - 20, this.eb - 69, 0);
                                        if (this.aq) {
                                            this.n(a3, a7);
                                        }
                                    }
                                    if (this.eb == n21) {
                                        break;
                                    }
                                    this.eb += n23;
                                    this.ec += this.eg;
                                    if (this.ec > this.ee) {
                                        this.ea += n22;
                                        this.ec -= this.ef;
                                    }
                                    ++this.eh;
                                }
                            }
                        }
                    }
                    if (n5 != -1 && n3 != -1) {
                        if (b && n4 != -1) {
                            i.a[17].a(i.c, n4, i * 13 + n5 + 37 - 20, j * 13 + n5 + 73 - 69, 0);
                        }
                        i.a[17].a(i.c, n3, i * 13 + n5 + 37 - 20, j * 13 + n5 + 73 - 69, 0);
                        int n27 = -1;
                        Label_1202: {
                            int n28 = 0;
                            switch (this.aA) {
                                case 0: {
                                    if (a2 == 8) {
                                        n28 = 52;
                                        break;
                                    }
                                    break Label_1202;
                                }
                                case 1: {
                                    if (a2 == 9) {
                                        n28 = 53;
                                        break;
                                    }
                                    break Label_1202;
                                }
                                case 2: {
                                    if (a2 == 10) {
                                        n28 = 54;
                                        break;
                                    }
                                    break Label_1202;
                                }
                            }
                            n27 = n28;
                        }
                        if (n27 != -1) {
                            i.a[n27].a(i.c, 0, i * 13 - 8 + 37 - 20, j * 13 - 8 + 73 - 69, 0);
                        }
                    }
                }
            }
        }
        this.aq = false;
    }
    
    private void a(final String name) {
        final InputStream resourceAsStream;
        final int n = ((byte)(resourceAsStream = this.getClass().getResourceAsStream(name)).read() & 0xFF) + (((byte)resourceAsStream.read() & 0xFF) << 8);
        final int read = resourceAsStream.read();
        resourceAsStream.read(i.f = new byte[n]);
        resourceAsStream.close();
        int n2 = 0;
        for (int i = 0; i < read; ++i) {
            final byte b = i.f[n2++];
            final byte b2 = i.f[n2++];
            final byte b3 = i.f[n2++];
            final byte dk = i.f[n2++];
            if (b3 == 1 && dk < this.dK) {
                this.dK = dk;
            }
            final byte b4 = i.f[n2++];
            a(b, b2, 1, (byte)0, (byte)3);
            a(b, b2, b3, (byte)3, (byte)3);
            a(b, b2, dk, (byte)6, (byte)5);
            a(b, b2, b4, (byte)11, (byte)3);
            byte b5 = 14;
            for (byte b6 = 0; b6 < b4; ++b6) {
                a(b, b2, i.f[n2++], b5, (byte)4);
                final byte b7 = (byte)(b5 + 4);
                a(b, b2, i.f[n2++], b7, (byte)4);
                b5 = (byte)(b7 + 4);
            }
        }
        i.f = null;
        System.gc();
    }
    
    public static final void a(final Graphics graphics, final int n, int n2, final int n3, int n4, int i, final int n5) {
        n2 += 15;
        n4 += 2;
        final int clipX = graphics.getClipX();
        final int clipY = graphics.getClipY();
        final int clipWidth = graphics.getClipWidth();
        final int clipHeight = graphics.getClipHeight();
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(i);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setClip(n - 3, n2, n3 + 6, n4);
        for (i = n2; i <= n2 + n4; i += 8) {
            graphics.drawImage(i.a[n5][7], n, i, 24);
            graphics.drawImage(i.a[n5][5], n + n3, i, 20);
        }
        graphics.setClip(n, n2 - 3, n3, n4 + 6);
        for (i = n; i <= n + n3; i += 8) {
            graphics.drawImage(i.a[n5][4], i, n2, 36);
            graphics.drawImage(i.a[n5][6], i, n2 + n4, 20);
        }
        graphics.setClip(n - 3, n2 - 3, n3 + 6, n4 + 6);
        graphics.drawImage(i.a[n5][0], n, n2, 40);
        graphics.drawImage(i.a[n5][1], n + n3, n2, 36);
        graphics.drawImage(i.a[n5][2], n, n2 + n4, 24);
        graphics.drawImage(i.a[n5][3], n + n3, n2 + n4, 20);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
    
    public static final void a(final Graphics graphics, int clipX, int clipY, int clipWidth, final int n, int clipHeight, final int n2, final int n3, final int n4) {
        clipX = graphics.getClipX();
        clipY = graphics.getClipY();
        clipWidth = graphics.getClipWidth();
        clipHeight = graphics.getClipHeight();
        a(graphics, 6, 197, 226, n, 73, 1);
        a(graphics, 16, 192 - n4, n3, n4, 73, 1);
        graphics.setClip(13, 195, n3 + 6, 3);
        graphics.setColor(73);
        graphics.fillRect(13, 195, n3 + 6, 3);
        graphics.drawImage(i.a[1][3], 16, 195, 24);
        graphics.drawImage(i.a[1][2], n3 + 16, 195, 20);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }
    
    private void ay() {
        if (this.n == this.en && !this.av) {
            return;
        }
        if (this.n != this.en) {
            this.av = true;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.av) {
            this.a(this.a, true);
            this.a.setColor(0);
            this.a.fillRect(0, 0, 240, a.b);
            this.a.setColor(16777215);
            this.a.drawLine(0, a.b, 240, a.b);
            i.b.b(this.a, i.a[63], 120, 9, 17);
            a(this.a, 10, 35, 220, 90, 4273165, 0);
            if (this.o != -1) {
                i.a.a(this.a, a(this.a, 200), 120, 280, 17);
            }
            if (this.aa) {
                this.aa = false;
                i.a.b(this.a, this.a, 120, 191, 1);
            }
            i.a.a(this.a, this.g, 120, 260, 17);
            this.I();
            this.J();
            this.av = false;
        }
        if (this.n != this.en) {
            this.a.setColor(4273165);
            this.a.fillRect(20, 58 + ((this.en >= 0) ? this.en : this.n) * 20 + 2, 7, 9);
        }
        i.a[17].a(this.a, 14, 20, 58 + this.n * 20 + 2, 0);
        a(this.a, 10, 155, 220, 70, 4273165, 0);
        h h;
        Graphics graphics;
        String a;
        if (this.o != -1) {
            final String string = i.a[47] + " " + this.d.toString() + "\n" + i.a[27];
            h = i.a;
            graphics = this.a;
            a = string;
        }
        else {
            h = i.a;
            graphics = this.a;
            a = this.a;
        }
        h.a(graphics, a, 120, 210, 1);
        for (int i = 0; i < 4; ++i) {
            final int n = 58 + i * 20;
            i.a[46].a(this.a, i + 0, 27, n, 0);
            i.a.b(this.a, i.a[i + 120], 53, n + 8, 0);
        }
        final Image[] array;
        int width = (array = i.a[0].a[0])[11].getWidth();
        final int width2 = array[15].getWidth();
        this.a.drawImage(array[11], 100, 175, 0);
        for (int j = 0; j < 8; ++j) {
            this.a.drawImage(array[(j >= 4) ? 13 : 15], width + 100, 175, 0);
            width += width2;
        }
        final int n2 = this.n;
        final int n3 = width;
        int n4 = width - (width2 << 2);
        for (int k = 0; k <= n2; ++k) {
            this.a.drawImage(array[15], n4 + 100, 175, 0);
            n4 += width2;
        }
        this.a.drawImage(array[17], n3 + 100, 175, 0);
        if (this.n != this.en) {
            this.en = this.n;
        }
    }
    
    private void p(final int n) {
        this.a.b(n);
    }
    
    private void az() {
        if (this.aR != 2) {
            return;
        }
        final Graphics a;
        (a = this.a).setColor(0, 0, 0);
        a.fillRect(0, 0, 240, 320);
        int n = -17;
        int ep = this.ep;
        int ep2 = this.ep;
        final int n2 = (this.eo >= 340) ? (-(this.eo % 17)) : (340 - this.eo - 17);
        while (ep < i.s.length && n < 340) {
            if (i.s[ep] == 10) {
                h.a(16777215);
                final Graphics graphics = a;
                final byte[] s = i.s;
                final h a2 = i.a;
                final int n3 = ep2;
                final int n4 = ep - ep2;
                final int n5 = n + n2;
                final int n6 = n4;
                final int n7 = n3;
                final h h = a2;
                final byte[] array = s;
                final Graphics graphics2 = graphics;
                int n8 = h.a.getHeight();
                int n9 = 0;
                int n10 = n5;
                final boolean b = n5 != -1;
                final int c = h.c;
                int n11 = n7;
                boolean b2 = true;
                int n12 = n7;
                int n13 = 0;
                for (int i = n7; i <= n7 + n6; ++i) {
                    int n14 = 10;
                    if (i < n7 + n6) {
                        n14 = (array[i] & 0xFF);
                    }
                    if (b2 && n9 > 234) {
                        n9 = n13;
                        array[n12] = 10;
                        i = n12 - 1;
                    }
                    else if (n14 == 10) {
                        if (b2 && b) {
                            n9 = 120 - (n9 >> 1);
                            i = n11 - 1;
                        }
                        else {
                            n9 = 0;
                            n11 = i + 1;
                            n10 += n8;
                            n8 = h.a.getHeight();
                        }
                        if (b) {
                            b2 = !b2;
                        }
                    }
                    else {
                        int n17 = 0;
                        int charWidth = 0;
                        Label_0563: {
                            int n16;
                            int n15;
                            if (n14 > 32) {
                                n15 = (n16 = array[i]);
                            }
                            else {
                                if (n14 == 32) {
                                    n12 = i;
                                    n13 = n9;
                                    n17 = n9;
                                    charWidth = (h.a[0] & 0xFF) + h.b[1];
                                    break Label_0563;
                                }
                                if (n14 == 1) {
                                    ++i;
                                    h.c = array[i];
                                    continue;
                                }
                                if (n14 != 2) {
                                    continue;
                                }
                                ++i;
                                n15 = (n16 = (array[i] & 0xFF));
                            }
                            final int n18 = n16;
                            if (n15 >= 89) {
                                if (!b2 && b) {
                                    h.b(graphics2, "" + (char)n18, n9, n10 + 10, 0);
                                }
                                n17 = n9;
                            }
                            else {
                                if (!b2 && b) {
                                    h.b(graphics2, "" + (char)n18, n9, n10 + 10, 0);
                                }
                                n17 = n9;
                            }
                            charWidth = h.a.charWidth((char)n18);
                        }
                        n9 = n17 + charWidth;
                    }
                }
                h.c = c;
                n += 17;
                ep2 = ep + 1;
            }
            ++ep;
        }
        int n19 = 0;
        for (int j = 6; j > 0; --j) {
            a.setColor(0);
            a.fillRect(0, n19, 240, j);
            a.fillRect(0, 320 - n19 - j, 240, j);
            n19 += j + 1;
        }
        this.I();
    }
    
    private static String[] b() {
        final String[] array = new String[16];
        int i = 1;
        for (int j = 0; j < 15; ++j) {
            if (j < 11) {
                try {
                    final String s;
                    if ((s = i.a[66]).indexOf("%U") == -1 || s.length() == 1) {
                        array[j] = s;
                    }
                    else {
                        array[j] = d.a(s, "%U", "" + (j + 1));
                    }
                }
                catch (Exception ex) {
                    array[j] = "E";
                }
            }
            else {
                try {
                    final String s2;
                    String[] array2;
                    int n;
                    String a;
                    if ((s2 = i.a[62]).indexOf("%U") == -1 || s2.length() == 1) {
                        array2 = array;
                        n = j;
                        a = s2;
                    }
                    else {
                        array2 = array;
                        n = j;
                        a = d.a(s2, "%U", "" + i);
                    }
                    array2[n] = a;
                    ++i;
                }
                catch (Exception ex2) {
                    array[j] = "E";
                }
            }
        }
        try {
            array[15] = i.a[31];
        }
        catch (Exception ex3) {
            array[15] = " ";
        }
        return array;
    }
    
    private void a(final String s, final int n, final int n2, final int n3, final int et, final int n4) {
        this.n = System.currentTimeMillis();
        i.eq = 5000;
        this.er = -1;
        this.es = -1;
        this.h = a(s, 220);
        this.et = et;
        this.eu = 0;
    }
    
    private void d(final boolean b) {
        i.eq = 0;
        this.av = true;
    }
    
    private static String a(final String str, final int n) {
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
                else if (n5 > 32) {
                    if (n5 == 64) {
                        n2 += 14;
                    }
                    continue;
                }
                else {
                    if (n5 != 32) {
                        continue;
                    }
                    index = i;
                    n3 = n2;
                    n6 = n2 + (h.a() + (h.a() << 1));
                }
                n2 = n6;
            }
        }
        return sb.toString();
    }
    
    private static void aA() {
        i.b = new h(0);
        i.a = new h(8);
    }
    
    static {
        i.a = new boolean[] { true, false, false };
        i.b = new boolean[] { false, false, false };
        i.a = new byte[16];
        i.b = new byte[8];
        i.c = new byte[8];
        i.m = (i.b = 0);
        i.g = new byte[] { 0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0 };
        i.h = new byte[] { 0, 3, 4, 1, 2, 5, 6 };
        i.i = null;
        i.j = null;
        i.a = null;
        i.p = null;
        i.a = false;
        i.d = "more_games_url";
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
        i.V = false;
        i.W = true;
        i.s = 0;
        i.b = new int[] { 512, 16384, 131072, 131072, 4096 };
        i.de = 0;
        i.df = 0;
        i.dg = 0;
        i.q = new byte[16];
        i.r = new byte[16];
        i.ak = false;
        i.a = new long[15];
        i.b = new long[15];
        i.a = new short[][] { { 0, 16, 1, 40, 6, 44, 3, 18, 5, 22 }, { 0, 50, 1, 49, 6, 18, 3, 28, 4, 36, 5, 22 }, { 0, 1, 1, 4, 2, 64, 3, 63 }, new short[0], new short[0], new short[0], { 0, 50, 4, 36 }, { 0, 24, 1, 25 }, { 0, 44, 1, 22 } };
        i.d = new int[] { 1, 4, 64 };
        i.g = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
        i.b = false;
        i.s = null;
        i.d = new String[] { "/w0.bin", "/w1.bin", "/w2.bin" };
        i.eq = 0;
    }
}
