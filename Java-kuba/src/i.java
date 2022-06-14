import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.RecordStore;

public final class i
extends GameCanvas
implements Runnable {
    public static i var_i_a;
    public int var_int_a = 40;
    public int var_int_b;
    public boolean var_boolean_a = false;
    public boolean var_boolean_b;
    public int var_int_c = 0;
    public int var_int_d = f.var_int_arr_a[this.var_int_c];
    public String var_java_lang_String_a = "";
    public boolean var_boolean_c = true;
    public int var_int_e = 0;
    public int var_int_f = 0;
    public int var_int_g = 0;
    public int var_int_h = this.var_int_f;
    public int var_int_i = this.var_int_g;
    public String var_java_lang_String_b = "";
    public String var_java_lang_String_c = "";
    public int var_int_j = -1;
    public boolean var_boolean_d = false;
    public boolean var_boolean_e = true;
    public byte var_byte_a = 0;
    public int var_int_k = 0;
    public int var_int_l = 0;
    public int var_int_m = 0;
    public int var_int_n = 0;
    public int var_int_o = 0;
    public int var_int_p = 0;
    public int var_int_q = 0;
    public static boolean[] var_boolean_arr_a;
    public int var_int_r = 0;
    public static boolean[] var_boolean_arr_b;
    public boolean var_boolean_f = false;
    public int var_int_s = -1;
    public int var_int_t = 10;
    public int var_int_u = 10;
    public int var_int_v = 0;
    public int var_int_w = 0;
    public int var_int_x = 0;
    public int var_int_y = 0;
    public int var_int_z = 0;
    public boolean var_boolean_g = false;
    public int var_int_A = 0;
    public int var_int_B = -1;
    public int var_int_C = -1;
    public int var_int_D = 0;
    public int var_int_E = 0;
    public int var_int_F = 0;
    public int var_int_G = 0;
    public int var_int_H = 0;
    public boolean var_boolean_h = false;
    public boolean var_boolean_i = false;
    public int var_int_I = 0;
    public int var_int_J = 0;
    public int var_int_K = 0;
    public int var_int_L = 0;
    public int var_int_M = 0;
    public int var_int_N = 0;
    public int var_int_O = 0;
    public byte var_byte_b = 1;
    public byte var_byte_c = 1;
    public byte var_byte_d = (byte)3;
    public byte var_byte_e = (byte)3;
    public byte var_byte_f = (byte)2;
    public byte var_byte_g = 0;
    public boolean var_boolean_j = false;
    public int var_int_P;
    public int var_int_Q;
    public int var_int_R;
    public static byte[] var_byte_arr_a;
    public static byte[] var_byte_arr_b;
    public static byte[] var_byte_arr_c;
    public int var_int_S;
    public int var_int_T;
    public byte var_byte_h;
    public static boolean var_boolean_k;
    public int var_int_U;
    public int var_int_V = 0;
    public static int var_int_W;
    public boolean var_boolean_l = true;
    public boolean var_boolean_m;
    public int var_int_X;
    public int var_int_Y;
    public static byte[] var_byte_arr_d;
    public byte var_byte_i = 0;
    public int var_int_Z = 0;
    public int var_int_aa;
    public int var_int_ab;
    public int var_int_ac;
    public boolean var_boolean_n;
    public int var_int_ad;
    public int var_int_ae;
    public int var_int_af;
    public int var_int_ag;
    public int var_int_ah;
    public int var_int_ai;
    public boolean var_boolean_o = false;
    public boolean var_boolean_p = false;
    public boolean var_boolean_q = false;
    public boolean var_boolean_r = false;
    public int var_int_aj;
    public int var_int_ak;
    public static byte[] var_byte_arr_e;
    public int var_int_al;
    public int var_int_am;
    public int var_int_an;
    public byte var_byte_j = 0;
    public byte var_byte_k = 0;
    public int var_int_ao;
    public int var_int_ap;
    public int var_int_aq;
    public int var_int_ar;
    public int var_int_as;
    public int var_int_at;
    public int var_int_au;
    public int var_int_av;
    public int var_int_aw;
    public int var_int_ax;
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
    public static byte var_byte_l;
    public int aM;
    public static byte var_byte_m;
    public boolean var_boolean_s = false;
    public static int aN;
    public static int aO;
    public long var_long_a;
    public boolean var_boolean_t;
    public int aP;
    public int aQ;
    public int aR;
    public int aS;
    public int aT;
    public boolean var_boolean_u;
    public int aU;
    public int aV;
    public boolean var_boolean_v;
    public byte var_byte_n;
    public int aW;
    public long var_long_b;
    public int aX;
    public int aY = 0;
    public int aZ;
    public int ba = 0;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public byte var_byte_o;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bm = -1;
    public boolean var_boolean_w;
    public int bn;
    public String var_java_lang_String_d;
    public boolean var_boolean_x;
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
    public boolean var_boolean_y;
    public int bD = 0;
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
    public int bW = 0;
    public int bX = 0;
    public int bY = 0;
    public int bZ = 0;
    public int ca = 0;
    public int cb = 0;
    public boolean var_boolean_z;
    public int cc;
    public int cd;
    public InputStream var_java_io_InputStream_a;
    public byte var_byte_p;
    public byte var_byte_q;
    public boolean var_boolean_A = false;
    public int ce;
    public int cf;
    public int cg;
    public int ch;
    public Graphics var_javax_microedition_lcdui_Graphics_a;
    public static Image var_javax_microedition_lcdui_Image_a;
    public static Image var_javax_microedition_lcdui_Image_b;
    public static Image var_javax_microedition_lcdui_Image_c;
    public static Image[][] var_javax_microedition_lcdui_Image_arr_arr_a;
    public static Image[][] var_javax_microedition_lcdui_Image_arr_arr_b;
    public static a[] var_a_arr_a;
    public static a var_a_a;
    public static byte[] var_byte_arr_f;
    public static g[] var_g_arr_a;
    public static a var_a_b;
    public static byte[] var_byte_arr_g;
    public static byte[] var_byte_arr_h;
    public long var_long_c;
    public long var_long_d;
    public boolean var_boolean_B = false;
    public static byte[] var_byte_arr_i;
    public static byte[] var_byte_arr_j;
    public static int[][] var_int_arr_arr_a;
    public static int[][] var_int_arr_arr_b;
    public static byte[][] var_byte_arr_arr_a;
    public static byte[][] var_byte_arr_arr_b;
    public static byte[][] var_byte_arr_arr_c;
    public static byte[] var_byte_arr_k;
    public boolean var_boolean_C;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public static byte[] var_byte_arr_l;
    public static byte[] var_byte_arr_m;
    public static int cm;
    public static int cn;
    public static byte[] var_byte_arr_n;
    public static int[][] var_int_arr_arr_c;
    public static int[][] var_int_arr_arr_d;
    public static byte[][] var_byte_arr_arr_d;
    public static byte[][] var_byte_arr_arr_e;
    public static byte[] var_byte_arr_o;
    public final h var_h_a;
    public c var_c_a = null;
    public static c[] var_c_arr_a;
    public static byte[] var_byte_arr_p;
    public final Thread var_java_lang_Thread_a;
    public static GloftDIRU var_GloftDIRU_a;
    public int co = -1;
    public int cp = -1;
    public int cq;
    public int cr;
    public int cs;
    public static a var_a_c;
    public int ct;
    public byte var_byte_r = 0;
    public static boolean var_boolean_D;
    public long var_long_e;
    public long var_long_f;
    public long var_long_g;
    public boolean var_boolean_E = false;
    public boolean var_boolean_F = false;
    public boolean var_boolean_G = false;
    public boolean var_boolean_H = false;
    public boolean var_boolean_I = false;
    public boolean var_boolean_J = false;
    public boolean var_boolean_K = false;
    public boolean var_boolean_L = false;
    public boolean var_boolean_M = false;
    public int cu = -1;
    public int cv;
    public int cw;
    public boolean var_boolean_N;
    public boolean var_boolean_O = false;
    public int cx;
    public int cy;
    public boolean var_boolean_P = false;
    public boolean var_boolean_Q = false;
    public int cz;
    public int cA;
    public boolean var_boolean_R;
    public boolean var_boolean_S;
    public int cB;
    public static Image var_javax_microedition_lcdui_Image_d;
    public static Graphics var_javax_microedition_lcdui_Graphics_b;
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
    public static Image var_javax_microedition_lcdui_Image_e;
    public static int cM;
    public static int cN;
    public static int cO;
    public int cP = -1;
    public int cQ = -1;
    public int cR = -1;
    public int cS = -1;
    public int cT = -1;
    public int cU = -1;
    public int cV = -1;
    public boolean var_boolean_T = true;
    public long var_long_h;
    public int cW;
    public int cX;
    public int cY;
    public int cZ = 2;
    public int da = 0;
    public int db;
    public int dc = 3;
    public int dd = -1;
    public long var_long_i = 0L;
    public int de = -1;
    public static Image var_javax_microedition_lcdui_Image_f;
    public static boolean var_boolean_U;
    public static boolean var_boolean_V;
    public long var_long_j = 0L;
    public boolean var_boolean_W;
    public boolean var_boolean_X;
    public boolean var_boolean_Y;
    public boolean var_boolean_Z;
    public boolean var_boolean_aa = false;
    public int df = 0;
    public int[] var_int_arr_a = new int[]{0, 0, 0, 0, 0};
    public static byte var_byte_s;
    public static final int[] var_int_arr_b;
    public static int dg;
    public static int dh;
    public static int di;
    public byte var_byte_t;
    public byte var_byte_u;
    public boolean var_boolean_ab = false;
    public static byte[] var_byte_arr_q;
    public static byte[] var_byte_arr_r;
    public long var_long_k = 0L;
    public boolean var_boolean_ac;
    public int dj = 0;
    public boolean var_boolean_ad;
    public long var_long_l = 0L;
    public long var_long_m = 0L;
    public boolean var_boolean_ae = false;
    public boolean var_boolean_af = false;
    public long var_long_n;
    public boolean var_boolean_ag;
    public boolean var_boolean_ah;
    public boolean var_boolean_ai;
    public boolean var_boolean_aj = false;
    public String var_java_lang_String_e;
    public int dk = 0;
    public int dl;
    public int dm;
    public int dn;
    public static boolean var_boolean_ak;
    public static int cfr_renamed_0;
    public static int dp;
    public static int dq;
    public static int dr;
    public e var_e_a;
    public boolean var_boolean_al = false;
    public boolean var_boolean_am = true;
    public int ds = -1;
    public int dt;
    public int du;
    public byte var_byte_v;
    public int dv;
    public int dw;
    public int dx;
    public int dy;
    public int dz;
    public byte var_byte_w;
    public int dA;
    public int dB = -1;
    public byte var_byte_x = (byte)3;
    public byte var_byte_y;
    public int dC;
    public int dD;
    public int dE;
    public byte var_byte_z;
    public int dF;
    public int dG;
    public int dH;
    public byte var_byte_A;
    public int dI;
    public int dJ;
    public static a var_a_d;
    public static int[][] var_int_arr_arr_e;
    public static long[] var_long_arr_a;
    public static long[] var_long_arr_b;
    public static int[][] var_int_arr_arr_f;
    public static long[] var_long_arr_c;
    public static long[] var_long_arr_d;
    public static boolean var_boolean_an;
    public int dK;
    public int dL;
    public static long[][] var_long_arr_arr_a;
    public static StringBuffer var_java_lang_StringBuffer_a;
    public static StringBuffer var_java_lang_StringBuffer_b;
    public static StringBuffer var_java_lang_StringBuffer_c;
    public static Image var_javax_microedition_lcdui_Image_g;
    public static Graphics var_javax_microedition_lcdui_Graphics_c;
    public int dM = 100;
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
    public boolean var_boolean_ao = true;
    public boolean var_boolean_ap;
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
    public boolean var_boolean_aq = true;
    public boolean var_boolean_ar = true;
    public boolean var_boolean_as = true;
    public int[] var_int_arr_c;
    public int ek;
    public int el;
    public int em = 2;
    public int en;
    public int eo = 2;
    public boolean var_boolean_at;
    public boolean var_boolean_au = true;
    public boolean var_boolean_av = true;
    public long var_long_o = 0L;
    public int ep = -1;
    public String var_java_lang_String_f;
    public StringBuffer var_java_lang_StringBuffer_d = new StringBuffer();
    public boolean var_boolean_aw = true;
    public boolean var_boolean_ax = true;
    public int eq;
    public int er;
    public static final short[][] var_short_arr_arr_a;
    public static final int[] var_int_arr_d;
    public static final int[][] var_int_arr_arr_g;
    public static String[] var_java_lang_String_arr_a;
    public static byte[] var_byte_arr_s;
    public static final String[] var_java_lang_String_arr_b;
    public static int es;
    public long var_long_p = System.currentTimeMillis();
    public String var_java_lang_String_g;
    public int et;
    public int eu;
    public int ev;
    public int ew;

    public i(GloftDIRU gloftDIRU) {
        super(false);
        var_i_a = this;
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        var_g_arr_a = new g[6];
        var_a_arr_a = new a[61];
        this.ci();
        var_javax_microedition_lcdui_Image_arr_arr_a = new Image[33][];
        var_javax_microedition_lcdui_Image_arr_arr_b = new Image[2][];
        var_GloftDIRU_a = gloftDIRU;
        this.var_h_a = new h();
        var_boolean_k = true;
        this.setFullScreenMode(true);
        this.B();
        this.var_java_lang_Thread_a = new Thread(this);
        this.var_java_lang_Thread_a.start();
    }

    private void void_a(int n, int n2, int n3) {
        this.aA = -1;
        this.aD = -1;
        this.aC = -1;
        g g2 = var_g_arr_a[(this.aS & 0x4000) == 0 ? 0 : 3];
        int n4 = g2.f;
        if (n4 == 40) {
            return;
        }
        if (n4 == 48) {
            return;
        }
        if (n4 == 47) {
            return;
        }
        if (this.var_long_b <= 0L && this.aW == 0 && this.bi == 0 && this.var_byte_k != 6 && (this.aS & 0x70) == 0 || this.aT > 0) {
            ++this.bc;
            this.a((byte)(this.var_byte_n - n));
            if (this.bl == 0 && this.var_byte_n == 0) {
                this.var_long_l = 0L;
                this.co = this.bE;
                this.cp = this.bF;
                var_a_c = null;
            }
            this.aS = this.aS & 0xFFFFFF8F | n2;
            this.C(5);
            switch (n2) {
                case 16: {
                    this.var_int_ak = 0;
                    this.var_int_aj = 0;
                    this.aT = 5;
                    i.var_byte_arr_arr_a[this.aP][this.aQ] = 9;
                    this.aS = this.aS & 0xFFFFFF8F | 0;
                    i.var_int_arr_arr_b[this.aP][this.aQ] = 0x8400000;
                    i.var_byte_arr_arr_c[this.aP][this.aQ] = 24;
                    return;
                }
                case 64: {
                    this.n(1000);
                    return;
                }
            }
            this.n(10);
            if (n3 != 0) {
                byte by = (byte)n3;
                do {
                    int n5;
                    int n6;
                    if (var_byte_arr_arr_a[n6 = this.aP - var_byte_arr_g[by]][n5 = this.aQ - var_byte_arr_g[by + 8]] >= 0 || (byte)(var_int_arr_arr_a[n6][n5] & 0xFF) >= 0) continue;
                    this.aP = n6;
                    this.aQ = n5;
                    this.aR = 18;
                    this.var_byte_j = 0;
                    this.aS = this.aS & 0xFFFFFFF8 | by | 0x800;
                    return;
                } while ((by = by >= 4 ? (byte)1 : (byte)(by + 1)) != n3);
            }
        }
    }

    private void a(byte by) {
        block4: {
            byte by2;
            block3: {
                i i2;
                block2: {
                    this.var_byte_n = by;
                    if (this.var_byte_n > 0) break block2;
                    i2 = this;
                    by2 = 0;
                    break block3;
                }
                if (this.var_byte_n <= var_byte_arr_i[8]) break block4;
                i2 = this;
                by2 = var_byte_arr_i[8];
            }
            i2.var_byte_n = by2;
        }
        this.B();
    }

    public final void void_a(int n) {
        this.bp = this.bo;
        this.var_boolean_x = false;
        this.bq = 0;
        this.bo = n;
        this.cW = 0;
        if (n >= 0) {
            this.al();
        }
    }

    public static boolean boolean_a(int n) {
        return (var_int_W & n) != 0;
    }

    public final void keyPressed(int n) {
        int n2 = i.int_g(n);
        var_int_W |= n2;
        this.var_boolean_b = false;
    }

    public final void keyReleased(int n) {
        var_int_W &= ~i.int_g(n);
        this.var_boolean_b = true;
    }

    private void void_g() {
        this.var_long_a = System.currentTimeMillis();
        aN = 0;
        aO = 0;
        this.var_int_Z = 0;
    }

    private static void a(long l) {
        if (l <= 0L) {
            return;
        }
        System.currentTimeMillis();
        try {
            Thread.sleep(l);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void run() {
        this.var_long_a = System.currentTimeMillis();
        this.void_g();
        this.H();
        while (!this.var_boolean_z) {
            Thread.yield();
            if (this.var_boolean_ae) continue;
            this.var_long_e = System.currentTimeMillis();
            try {
                this.void_h();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                i.a(5000L);
            }
            if (this.var_boolean_z) break;
            if (var_byte_l != 2) {
                ++aN;
            }
            this.var_long_f = System.currentTimeMillis();
            if (this.var_long_g > 65L) {
                i.a(100L - this.var_long_g - this.var_long_f);
                this.var_boolean_t = true;
                this.var_long_g = 0L;
                continue;
            }
            this.void_a(this.getGraphics());
            this.flushGraphics();
            this.var_boolean_t = false;
            if (var_byte_l != 2) {
                ++aO;
            }
            this.var_long_g = Math.abs(System.currentTimeMillis() - this.var_long_e);
            i.a(50L - (System.currentTimeMillis() - this.var_long_e));
        }
        this.A();
        this.var_h_a.d();
        var_GloftDIRU_a.a();
    }

    private void void_h() throws Exception {
        this.cJ();
        this.aQ();
        switch (var_byte_l) {
            case 22: {
                this.cH();
                return;
            }
            case 21: {
                this.B(this.bs++);
                this.void_g();
                return;
            }
            case 20: {
                if (aN <= 30) break;
                this.var_boolean_A = true;
                this.var_boolean_I = true;
                this.var_boolean_G = true;
                this.ct();
                return;
            }
            case 35: {
                this.q(this.bs++);
                this.void_g();
                if (this.bs != 12) break;
                var_byte_l = (byte)17;
                this.aM = 0;
                this.C(15);
                return;
            }
            case 17: {
                this.bi();
                return;
            }
            case 31: {
                return;
            }
            case 16: {
                this.var_boolean_B = true;
                this.t();
                var_int_W = 0;
                return;
            }
            case 0: {
                i.var_g_arr_a[0] = new g(i.a_a("/ui.f", 0), 0, 0, null);
                var_g_arr_a[0].void_a(0);
                var_byte_l = (byte)6;
                this.void_g();
                return;
            }
            case 6: {
                if (aN < 60) {
                    var_g_arr_a[0].b();
                    return;
                }
                var_java_lang_String_arr_a = i.java_lang_String_arr_a("/lang.f", 115);
                i.cL();
                i.var_a_arr_a[18] = i.a_a("/ui.f", 3);
                this.A();
                this.void_a(3);
                var_byte_l = (byte)7;
                return;
            }
            case 7: {
                if (!this.var_boolean_x) break;
                var_byte_l = (byte)8;
                this.bs = 0;
                this.br = 32;
                return;
            }
            case 1: {
                this.be();
                return;
            }
            case 3: {
                this.var_boolean_z = true;
                return;
            }
            case 9: {
                try {
                    if ((var_byte_arr_j[0] & 1) == 0) {
                        this.var_boolean_al = true;
                    }
                    this.F();
                    int n = this.br == 8 ? this.bs : this.bs - 24;
                    this.m(n);
                    ++this.bs;
                    this.var_boolean_X = true;
                    if (++n == 8) {
                        if (this.var_boolean_E) {
                            var_byte_l = (byte)4;
                            if (this.bo == -1) {
                                this.aM = 0;
                                this.void_a(0);
                            } else {
                                this.aM = 2;
                            }
                        } else {
                            var_byte_l = (byte)30;
                            this.var_boolean_E = true;
                        }
                        this.var_h_a.b(19);
                    }
                }
                catch (Exception exception) {}
                this.void_g();
                return;
            }
            case 11: {
                this.var_boolean_I = true;
                this.var_boolean_G = true;
                var_byte_l = (byte)5;
                this.var_boolean_Q = true;
                this.void_g();
                return;
            }
            case 5: {
                if (this.var_boolean_B && this.bs <= 5) {
                    int n;
                    this.k(this.bs++);
                    for (n = 0; n < 3; ++n) {
                        i.var_boolean_arr_b[n] = false;
                    }
                    for (n = 1; n < 3; ++n) {
                        i.var_boolean_arr_a[n] = false;
                    }
                    this.void_g();
                    if (this.bs == 5) {
                        this.var_boolean_M = true;
                        this.var_boolean_L = true;
                        this.var_boolean_K = true;
                        this.var_int_ap = 0;
                        this.var_int_aq = 13;
                        var_int_W = 0;
                    }
                } else {
                    this.o();
                }
                this.void_g();
                return;
            }
            case 8: {
                this.void_d(this.bs++);
                this.void_g();
                return;
            }
            case 2: 
            case 12: {
                return;
            }
            case 15: {
                this.m();
                return;
            }
            case 27: {
                this.n();
                return;
            }
            case 28: {
                try {
                    this.void_c(this.bs);
                    ++this.bs;
                    if (this.bs == 11) {
                        var_byte_l = (byte)27;
                    }
                }
                catch (Exception exception) {}
                this.void_g();
                return;
            }
            case 29: {
                this.j();
            }
        }
    }

    private void void_i() {
        block9: {
            int n;
            block8: {
                i i2;
                block7: {
                    block6: {
                        int n2;
                        block5: {
                            i i3;
                            block4: {
                                if (this.var_int_O < this.var_byte_d) break block4;
                                i3 = this;
                                n2 = -1;
                                break block5;
                            }
                            if (this.var_int_O > -this.var_byte_d) break block6;
                            i3 = this;
                            n2 = 1;
                        }
                        i3.var_byte_b = (byte)n2;
                    }
                    this.var_int_O += this.var_byte_b * this.var_byte_f;
                    if (this.var_int_N < this.var_byte_e) break block7;
                    i2 = this;
                    n = -1;
                    break block8;
                }
                if (this.var_int_O > -this.var_byte_e) break block9;
                i2 = this;
                n = 1;
            }
            i2.var_byte_c = (byte)n;
        }
        this.var_int_N += this.var_byte_c * this.var_byte_g;
    }

    private void j() {
        switch (this.var_int_L) {
            case 0: {
                if (System.currentTimeMillis() - this.var_long_a < 3000L) break;
                ++this.var_int_L;
                this.void_g();
                return;
            }
            case 1: {
                boolean bl;
                i i2;
                if (aN % 6 >= 3) {
                    this.var_int_M += 0x199999;
                    i2 = this;
                    bl = false;
                } else {
                    i2 = this;
                    bl = i2.var_boolean_aw = true;
                }
                if (System.currentTimeMillis() - this.var_long_a < 5000L) break;
                ++this.var_int_L;
                this.var_boolean_aw = true;
                this.void_g();
                return;
            }
            case 2: {
                this.void_i();
                if (System.currentTimeMillis() - this.var_long_a < 10000L) break;
                this.var_int_N = 0;
                this.var_int_O = 0;
                this.void_g();
                ++this.var_int_L;
                return;
            }
            case 3: {
                if (System.currentTimeMillis() - this.var_long_a < 1000L) break;
                ++this.var_int_L;
                return;
            }
            case 4: {
                if (System.currentTimeMillis() - this.var_long_a < 1000L) break;
                ++this.var_int_L;
                return;
            }
            case 5: {
                if (System.currentTimeMillis() - this.var_long_a < 1000L) break;
                ++this.var_int_L;
                return;
            }
            case 6: {
                if (System.currentTimeMillis() - this.var_long_a < 1000L) break;
                ++this.var_int_L;
                this.void_g();
                return;
            }
            case 7: {
                if (System.currentTimeMillis() - this.var_long_a < 1000L) break;
                b.var_byte_arr_arr_a = new byte[12][13];
                ++this.var_int_L;
                b.b(3);
                this.var_h_a.b(19);
                this.void_g();
                return;
            }
            case 8: {
                b.a(3);
                this.var_boolean_aw = true;
                if (System.currentTimeMillis() - this.var_long_a < 15000L) break;
                ++this.var_int_L;
                this.void_g();
                return;
            }
            case 9: {
                this.var_boolean_aw = true;
                b.a(3);
                if (System.currentTimeMillis() - this.var_long_a < 12000L) break;
                ++this.var_int_L;
                this.void_g();
                return;
            }
            case 10: {
                this.A();
                this.void_a(0);
                var_byte_l = (byte)22;
                this.aM = 0;
                this.var_h_a.e();
            }
        }
    }

    private void k() {
        this.var_boolean_F = false;
        i.a(var_a_arr_a[17], true);
        i.var_a_arr_a[17] = null;
        int n = e.var_javax_microedition_lcdui_Image_arr_a.length;
        for (int j = 0; j < n; ++j) {
            e.var_javax_microedition_lcdui_Image_arr_a[j] = null;
        }
        e.var_javax_microedition_lcdui_Image_arr_a = null;
        i.a(var_a_arr_a[10], true);
        i.var_a_arr_a[10] = null;
        i.a(var_a_arr_a[46], true);
        i.var_a_arr_a[46] = null;
        i.a(var_a_arr_a[55], true);
        i.var_a_arr_a[55] = null;
        i.var_javax_microedition_lcdui_Image_arr_arr_a[8] = null;
        i.a(var_a_arr_a[59], true);
        i.var_javax_microedition_lcdui_Image_arr_arr_a[3] = null;
        i.a(var_a_arr_a[17], true);
        i.var_a_arr_a[17] = null;
        System.gc();
    }

    /*
     * Unable to fully structure code
     */
    private void void_c(int var1_1) {
        switch (var1_1) {
            case 0: {
                if (!this.var_boolean_J) break;
                this.z();
                return;
            }
            case 1: {
                if (!this.var_boolean_G) break;
                this.cs();
                return;
            }
            case 2: {
                if (!this.var_boolean_L) break;
                this.K();
                return;
            }
            case 3: {
                if (!this.var_boolean_K) break;
                System.gc();
                this.var_boolean_K = false;
                return;
            }
            case 4: {
                this.A();
                e.var_javax_microedition_lcdui_Image_arr_a = i.javax_microedition_lcdui_Image_arr_a("/demoui.f", 0);
                if (i.var_a_arr_a[10] == null) {
                    i.var_a_arr_a[10] = i.a_a("/mmv.f", 0);
                }
                if (i.var_a_arr_a[46] == null) {
                    i.var_a_arr_a[46] = i.a_a("/mmv.f", 5);
                }
                this.var_int_o = 240 - i.c(i.var_a_arr_a[10], 0) >> 1;
                this.var_int_p = 320 - i.b(i.var_a_arr_a[10], 0) - 48 >> 1;
                return;
            }
            case 5: {
                if (i.var_a_arr_a[55] == null) {
                    i.var_a_arr_a[55] = i.a_a("/mmv.f", 4);
                    this.var_int_m = i.a(i.var_a_arr_a[55], 0);
                    i.var_a_b = i.var_a_arr_a[55];
                }
                if (i.var_a_arr_a[18] != null) break;
                i.var_a_arr_a[18] = i.a_a("/ui.f", 3);
                return;
            }
            case 6: {
                if (i.var_a_arr_a[54] == null) {
                    i.var_a_arr_a[54] = i.a_a("/mmv.f", 1);
                }
                this.var_int_v = i.c(i.var_a_arr_a[54], 0) >> 1;
                this.var_int_w = i.b(i.var_a_arr_a[54], 0) >> 1;
                return;
            }
            case 7: {
                if (i.var_a_arr_a[53] != null) break;
                i.var_a_arr_a[53] = i.a_a("/mmv.f", 2);
                return;
            }
            case 8: {
                if (i.var_a_arr_a[52] != null) break;
                i.var_a_arr_a[52] = i.a_a("/mmv.f", 3);
                return;
            }
            case 9: {
                try {
                    var2_2 = i.a_a("/" + 0 + ".f", 3, 0);
                    i.var_javax_microedition_lcdui_Image_arr_arr_a[8] = var2_2.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                    var2_2 = i.a_a("/cm.f", 2, 0);
                    var2_2.a(0, 0, -1, -1);
                    var2_2.a(1, 0, 0, -1);
                    i.var_a_arr_a[59] = var2_2;
                    b.var_int_b = var2_2.var_javax_microedition_lcdui_Image_arr_arr_a[0].length;
                    var2_2.var_byte_arr_g = null;
                    if (i.var_a_arr_a[17] == null) {
                        i.var_a_arr_a[17] = i.a_a("/ms.f", 0);
                    }
                    return;
                }
                catch (Exception v0) {
                    return;
                }
            }
            case 10: {
                if (i.var_a_arr_a[9] == null) {
                    i.var_a_arr_a[9] = i.a_a("/cm.f", 7);
                }
                this.var_int_y = i.a(i.var_a_arr_a[9], 5);
                var2_3 = i.var_byte_arr_i[2];
                for (var3_4 = 0; var3_4 < 3; ++var3_4) {
                    if ((var2_3 & 1 << var3_4) == 0) continue;
                    i.var_boolean_arr_b[var3_4] = true;
                }
                this.var_int_t = 10;
                this.var_int_u = 10;
                var2_3 = i.var_byte_arr_i[1];
                if ((var2_3 & 1) != 0) {
                    v1 = i.var_boolean_arr_a;
                    v2 = 1;
                    v3 = true;
                } else {
                    var3_4 = i.a(i.var_byte_arr_i, 6);
                    if (var3_4 >= f.b[1]) {
                        i.var_byte_arr_i[1] = (byte)(i.var_byte_arr_i[1] | 1);
                        this.G();
                        this.var_int_q = 1;
                        this.var_int_e = 1;
                    } else {
                        v1 = i.var_boolean_arr_a;
                        v2 = 1;
                        v3 = v1[v2] = false;
                    }
                }
                if ((var2_3 & 2) == 0) ** GOTO lbl98
                v4 = i.var_boolean_arr_a;
                v5 = 2;
                v6 = true;
                ** GOTO lbl108
lbl98:
                // 1 sources

                var3_4 = i.a(i.var_byte_arr_i, 6);
                if (var3_4 >= f.b[2]) {
                    i.var_byte_arr_i[1] = (byte)(i.var_byte_arr_i[1] | 2);
                    this.G();
                    this.var_int_q = 2;
                    this.var_int_e = 2;
                } else {
                    v4 = i.var_boolean_arr_a;
                    v5 = 2;
                    v6 = false;
lbl108:
                    // 2 sources

                    v4[v5] = v6;
                }
                this.var_int_f = f.d[this.var_int_e << 1];
                this.var_int_g = f.d[(this.var_int_e << 1) + 1];
                this.var_int_h = this.var_int_f;
                this.var_int_i = this.var_int_g;
                this.l();
                this.var_boolean_e = true;
                this.var_boolean_aw = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void l() {
        if (this.var_int_e == 3) {
            v0 = this;
            v1 = new StringBuffer();
            v2 = i.var_java_lang_String_arr_a[82];
        } else {
            var1_1 = i.boolean_b(this.var_int_e);
            if (var1_1) {
                v0 = this;
                v1 = new StringBuffer();
                v2 = i.var_java_lang_String_arr_a[82];
            } else {
                v0 = this;
                v1 = new StringBuffer().append(f.b[this.var_int_e]).append(" ");
                v2 = i.var_java_lang_String_arr_a[114].toLowerCase();
            }
        }
        v0.var_java_lang_String_b = v1.append(v2).append(" ").append(i.var_java_lang_String_arr_a[79]).toString();
        switch (this.var_int_e) {
            case 0: {
                v3 = this;
                v4 = i.var_java_lang_String_arr_a;
                v5 = 28;
                ** GOTO lbl36
            }
            case 1: {
                v3 = this;
                v4 = i.var_java_lang_String_arr_a;
                v5 = 29;
                ** GOTO lbl36
            }
            case 2: {
                v3 = this;
                v4 = i.var_java_lang_String_arr_a;
                v5 = 30;
                ** GOTO lbl36
            }
            case 3: {
                v3 = this;
                v4 = i.var_java_lang_String_arr_a;
                v5 = 31;
lbl36:
                // 4 sources

                v3.var_java_lang_String_c = v4[v5];
            }
        }
    }

    private static boolean boolean_b(int n) {
        if (n == 0 || n == 3) {
            return true;
        }
        int n2 = i.a(var_byte_arr_i, 6);
        return n2 >= f.b[n];
    }

    /*
     * Unable to fully structure code
     */
    private void m() {
        block7: {
            block8: {
                if (this.var_int_J <= 0 && this.var_int_K <= 0) break block7;
                var1_1 = new StringBuffer();
                if (this.var_int_J <= 0) break block8;
                var1_1.append(i.var_java_lang_String_arr_a[92]).append("\n");
                switch (this.var_int_J) {
                    case 1: {
                        var1_1.append(i.var_java_lang_String_arr_a[29]);
                        v0 = 2;
                        v1 = i.var_byte_arr_i;
                        v2 = i.var_byte_arr_i[2];
                        v3 = 8;
                        ** GOTO lbl23
                    }
                    case 2: {
                        var1_1.append(i.var_java_lang_String_arr_a[30]);
                        i.var_byte_arr_i[2] = (byte)(i.var_byte_arr_i[2] | 8);
                        v0 = 2;
                        v1 = i.var_byte_arr_i;
                        v2 = i.var_byte_arr_i[2];
                        v3 = 16;
lbl23:
                        // 2 sources

                        v1[v0] = (byte)(v2 | v3);
                    }
                }
                this.G();
                this.var_int_J = 0;
            }
            if (this.var_int_K > 0) {
                if (var1_1.length() > 0) {
                    var1_1.append("\n\n");
                }
                var1_1.append(i.var_java_lang_String_arr_a[99]).append("\n").append(i.var_java_lang_String_arr_a[85 + this.var_int_K - 1]);
                this.var_int_K = 0;
            }
            if (var1_1.length() > 0) {
                this.a(var1_1.toString(), -1, -1, 5000, 4273165, 0);
            }
        }
    }

    private void n() {
        if (!this.var_boolean_t) {
            this.var_int_h = this.var_int_f;
            this.var_int_i = this.var_int_g;
        }
        if (this.var_boolean_d) {
            var_int_W = 0;
            int n = this.var_int_k - this.var_int_f;
            int n2 = this.var_int_l - this.var_int_g;
            this.var_int_f += n / (8 - this.var_byte_a);
            this.var_int_g += n2 / (8 - this.var_byte_a);
            this.var_byte_a = (byte)(this.var_byte_a + 1);
            if (this.var_byte_a == 8) {
                this.var_int_f = this.var_int_k;
                this.var_int_g = this.var_int_l;
                this.var_boolean_d = false;
                this.var_byte_a = 0;
                this.var_boolean_e = true;
                this.l();
                return;
            }
        } else {
            switch (this.var_int_j) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.var_int_e) {
                        case 0: {
                            this.var_boolean_F = true;
                            this.var_boolean_G = true;
                            this.var_h_a.e();
                            this.var_int_ap = 0;
                            this.var_boolean_j = false;
                            var_byte_l = (byte)15;
                            eb = this.int_b(this.var_int_ap);
                            this.ct();
                            break;
                        }
                        case 1: {
                            if (!i.boolean_b(this.var_int_e)) break;
                            this.var_boolean_F = true;
                            this.var_boolean_G = true;
                            this.var_h_a.e();
                            this.var_int_ap = 1;
                            this.var_int_aq = 0;
                            var_byte_l = (byte)15;
                            eb = this.int_b(this.var_int_ap);
                            this.ct();
                            this.var_boolean_n = true;
                            this.var_boolean_j = false;
                            if (var_byte_arr_i[9] >= 1) break;
                            i.var_byte_arr_i[9] = 1;
                            break;
                        }
                        case 2: {
                            if (!i.boolean_b(this.var_int_e)) break;
                            this.var_boolean_F = true;
                            this.var_boolean_G = true;
                            this.var_h_a.e();
                            this.var_int_ap = 2;
                            this.var_int_aq = 0;
                            this.var_boolean_j = false;
                            var_byte_l = (byte)15;
                            eb = this.int_b(this.var_int_ap);
                            this.ct();
                            this.var_boolean_n = true;
                            if (var_byte_arr_i[9] >= 2) break;
                            i.var_byte_arr_i[9] = 2;
                            break;
                        }
                        case 3: {
                            var_byte_l = (byte)18;
                        }
                    }
                    break;
                }
                default: {
                    int n = f.var_byte_arr_arr_a[this.var_int_j][this.var_int_e];
                    if (n == -1) break;
                    this.var_int_e = n;
                    this.var_boolean_d = true;
                    this.var_int_k = f.d[this.var_int_e * 2];
                    this.var_int_l = f.d[this.var_int_e * 2 + 1];
                }
            }
            this.var_int_j = -1;
        }
    }

    private void void_d(int n) {
        if (n < 21) {
            if (n == 0) {
                this.var_h_a.b();
            }
            this.var_h_a.void_a(n);
            if (n == 20) {
                this.var_h_a.c();
            }
            System.gc();
            return;
        }
        switch (n) {
            case 21: {
                i.var_a_arr_a[9] = i.a_a("/cm.f", 7);
                return;
            }
            case 22: {
                i.var_a_arr_a[0] = i.a_a("/ui.f", 2);
                return;
            }
            case 23: {
                i.var_javax_microedition_lcdui_Image_arr_arr_b[0] = i.javax_microedition_lcdui_Image_arr_a("/demoui.f", 0, 0);
                i.var_javax_microedition_lcdui_Image_arr_arr_b[1] = i.javax_microedition_lcdui_Image_arr_a("/demoui.f", 0, 1);
                return;
            }
            case 24: {
                this.var_h_a.void_a();
                var_byte_l = (byte)9;
                this.void_a(-1);
                var_java_lang_StringBuffer_a = new StringBuffer(var_java_lang_String_arr_a[8]);
                var_java_lang_StringBuffer_a.delete(var_java_lang_StringBuffer_a.length() - 1, var_java_lang_StringBuffer_a.length());
                var_java_lang_StringBuffer_b = new StringBuffer(var_java_lang_String_arr_a[20]);
                var_java_lang_StringBuffer_b.delete(var_java_lang_StringBuffer_b.length() - 1, var_java_lang_StringBuffer_b.length());
                var_java_lang_StringBuffer_c = new StringBuffer("1");
            }
        }
    }

    public static String[] java_lang_String_arr_a(String string, int n) {
        byte[] byArray = i.byte_arr_a(string, 0);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String[] stringArray = new String[n];
        while (n4 < n) {
            if (byArray[n2 + n3] == 0) {
                try {
                    stringArray[n4] = new String(byArray, n2, n3, "ISO-8859-1");
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                n2 += n3 + 1;
                n3 = 0;
                ++n4;
                continue;
            }
            ++n3;
        }
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    private void o() {
        try {
            var1_1 = this.bs;
            if (this.var_boolean_B) {
                var1_1 -= 5;
            }
            ++this.bs;
            switch (var1_1) {
                case 0: {
                    if (this.var_boolean_M) {
                        this.G();
                    }
                    return;
                }
                case 1: {
                    if (this.var_boolean_L) {
                        this.K();
                    }
                    return;
                }
                case 2: {
                    if (this.var_boolean_K) {
                        System.gc();
                        this.var_boolean_K = false;
                    }
                    return;
                }
                case 3: {
                    i.var_a_arr_a[41].void_a(1);
                    i.var_a_arr_a[41].void_a(2);
                    return;
                }
                case 4: {
                    if (this.var_boolean_I) {
                        this.A();
                    }
                    return;
                }
                case 5: {
                    if (this.var_boolean_G) {
                        this.cs();
                    }
                    return;
                }
                case 6: {
                    var2_2 = i.int_c();
                    if (var2_2 >= 1) ** GOTO lbl38
                    v0 = this;
                    v1 = var2_2;
                    ** GOTO lbl41
lbl38:
                    // 1 sources

                    if ((this.var_int_V + 9) % 9 >= 1) ** GOTO lbl42
                    v0 = this;
                    v1 = 1;
lbl41:
                    // 2 sources

                    v0.var_int_V = v1;
lbl42:
                    // 2 sources

                    i.A(this.var_int_V % 9);
                    return;
                }
                case 7: {
                    this.D();
                    return;
                }
                case 8: {
                    i.V();
                    this.M();
                    return;
                }
                case 9: {
                    this.bD();
                    return;
                }
                case 10: {
                    var2_3 = "/" + this.var_int_ap + ".f";
                    this.var_java_io_InputStream_a = this.getClass().getResourceAsStream(var2_3);
                    this.cc = this.var_java_io_InputStream_a.read();
                    i.var_byte_arr_n = new byte[this.cc << 3];
                    this.var_java_io_InputStream_a.read(i.var_byte_arr_n);
                    return;
                }
            }
            var2_4 = var1_1 - 10 - 1;
            if (var2_4 < 4) {
                this.void_e(var2_4);
                this.bt = 0;
                return;
            }
            if ((var2_4 -= 4) >= 0 && var2_4 < 43) {
                this.void_g(var2_4);
                return;
            }
            if ((var2_4 -= 43) >= 0 && var2_4 < 8) {
                this.void_f(var2_4);
                if (var2_4 == 7) {
                    this.var_java_io_InputStream_a.close();
                    this.var_java_io_InputStream_a = null;
                    System.gc();
                }
                return;
            }
            if ((var2_4 -= 8) >= 0 && var2_4 < 16) {
                if (var2_4 < i.var_c_arr_a.length) {
                    i.var_c_arr_a[var2_4] = new c(this);
                    i.var_c_arr_a[var2_4].a(i.var_byte_arr_p[var2_4]);
                }
                if (var2_4 == 15 && i.var_c_arr_a.length >= 16) {
                    for (var3_5 = 16; var3_5 < i.var_c_arr_a.length; ++var3_5) {
                        i.var_c_arr_a[var3_5] = new c(this);
                        i.var_c_arr_a[var3_5].a(i.var_byte_arr_p[var3_5]);
                    }
                }
                return;
            }
            if ((var2_4 -= 16) >= 0 && var2_4 < 3) {
                switch (this.var_byte_i) {
                    case 1: {
                        this.i(var2_4);
                        if (var2_4 == 2) {
                            this.var_java_io_InputStream_a.close();
                            this.var_java_io_InputStream_a = null;
                        }
                        return;
                    }
                    case 3: {
                        if (var2_4 > 0) {
                            return;
                        }
                        var3_6 = i.a_a("/mmv.f", 1, 0);
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[31] = var3_6.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                        i.var_g_arr_a[5] = new g(i.a_a("/mm1.f", 0), 0, 0, null);
                        i.var_g_arr_a[5].void_a(0);
                        return;
                    }
                    case 4: {
                        if (var2_4 >= 2) {
                            return;
                        }
                        this.h(var2_4);
                        var3_7 = i.a_a("/mmv.f", 3, 0);
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[32] = var3_7.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                        i.var_a_arr_a[20] = i.a_a("/gen0.f", 7, 0);
                        if (var2_4 == 1) {
                            this.var_java_io_InputStream_a.close();
                            this.var_java_io_InputStream_a = null;
                        }
                        return;
                    }
                    case 5: {
                        var3_8 = i.a_a("/mmv.f", 2, 0);
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[30] = var3_8.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                        i.var_a_arr_a[20] = i.a_a("/gen0.f", 7, 0);
                        i.var_g_arr_a[5] = new g(i.a_a("/b1.f", 0), 0, 0, null);
                        i.var_g_arr_a[5].void_a(10);
                        return;
                    }
                }
                return;
            }
            switch (var2_4 -= 3) {
                case 0: {
                    i.var_byte_arr_n = null;
                    this.a(i.var_a_arr_a[12] != null || i.var_javax_microedition_lcdui_Image_arr_arr_a[6] != null || i.var_a_arr_a[58] != null || this.var_byte_i == 1 || this.var_byte_i == 4 || this.var_byte_i == 5);
                    break;
                }
                case 1: {
                    this.var_long_c = 0L;
                    this.var_long_d = 0L;
                    this.bu = 0;
                    ++this.var_int_V;
                    i.j(this.var_int_V < 3 ? this.var_int_V : 3);
                    this.G();
                    break;
                }
                case 2: {
                    i.var_int_arr_arr_c = new int[this.var_int_av][this.var_int_aw];
                    i.var_byte_arr_arr_d = new byte[this.var_int_av][this.var_int_aw];
                    i.var_byte_arr_arr_e = new byte[this.var_int_av][this.var_int_aw];
                    i.var_int_arr_arr_d = new int[this.var_int_av][this.var_int_aw];
                    if (i.var_byte_arr_m != null) {
                        i.var_byte_arr_o = new byte[i.var_byte_arr_m.length];
                        break;
                    }
                    ** GOTO lbl169
                }
                case 3: {
                    this.cm();
                    break;
                }
                case 4: {
                    this.bl = 0;
                    this.var_int_T = 0;
                    this.var_int_S = 0;
                    this.cf();
                    break;
                }
                case 5: {
                    this.bn = i.aN + 60;
                    this.var_java_lang_String_d = i.var_java_lang_String_arr_a[38] + "\n" + this.var_int_P + " " + i.var_java_lang_String_arr_a[39];
                    this.B();
                    break;
                }
                case 6: {
                    i.a(i.var_a_a, true);
                    i.var_a_a = null;
                    System.gc();
                    break;
                }
                case 7: {
                    this.var_boolean_B = false;
                    i.var_byte_arr_f = null;
                    System.gc();
                    this.var_h_a.b(16 + this.var_int_ap);
                    i.var_byte_l = 1;
                }
lbl169:
                // 3 sources

                default: {
                    return;
                }
            }
        }
        catch (Exception v2) {}
    }

    private static int int_a() {
        return var_byte_arr_i[8] - 4;
    }

    private void a(boolean bl) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/o.f");
            int n = inputStream.read();
            byte[] byArray = new byte[n << 3];
            inputStream.read(byArray);
            int n2 = i.b(byArray, 4);
            byte[] byArray2 = new byte[n2];
            inputStream.read(byArray2);
            if (!bl) {
                inputStream.close();
                inputStream = null;
                System.gc();
            }
            a a2 = new a();
            a2.a(byArray2, 0);
            this.cu = i.int_a();
            a2.a(this.cu, 0, -1, -1);
            a2.var_int_b = this.cu;
            a2.var_byte_arr_g = null;
            i.var_g_arr_a[0] = new g(a2, 0, 0, null);
            System.gc();
            if (bl) {
                n2 = i.b(byArray, 12);
                byArray2 = new byte[n2];
                inputStream.read(byArray2);
                inputStream.close();
                System.gc();
                a2 = new a();
                a2.a(byArray2, 0);
                a2.a(0, 0, -1, -1);
                a2.var_byte_arr_g = null;
                i.var_g_arr_a[3] = new g(a2, 0, 0, null);
                System.gc();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private int int_b() {
        return var_short_arr_arr_a[this.bo][this.bq << 1];
    }

    private void p() {
        i.var_a_arr_a[41].var_int_b = 0;
        this.var_boolean_x = true;
        switch (this.bo) {
            case 0: {
                this.w();
                return;
            }
            case 3: {
                this.v();
                return;
            }
            case 7: {
                this.q();
                return;
            }
            case 2: {
                this.u();
                return;
            }
            case 1: {
                this.s();
                return;
            }
            case 5: {
                this.r();
            }
        }
    }

    private void q() {
        block0 : switch (this.int_b()) {
            case 0: {
                if (this.bp == 0) {
                    var_byte_l = (byte)4;
                }
                this.void_a(this.bp);
                break;
            }
            case 1: {
                switch (this.aM) {
                    case 1: {
                        this.t();
                        break block0;
                    }
                    case 3: {
                        var_byte_l = (byte)15;
                        this.var_boolean_I = true;
                        this.var_boolean_G = true;
                        this.ct();
                        break block0;
                    }
                    case 4: {
                        this.A();
                        var_byte_l = (byte)9;
                        this.br = 8;
                        this.void_a(-1);
                        this.bs = 0;
                        break block0;
                    }
                    case 5: {
                        var_byte_l = (byte)3;
                        this.var_h_a.d();
                        var_GloftDIRU_a.notifyDestroyed();
                    }
                }
            }
        }
        this.aM = -1;
    }

    /*
     * Unable to fully structure code
     */
    private void r() {
        switch (this.int_b()) {
            case 0: {
                v0 = h.var_boolean_a = h.var_boolean_a == false;
                if (h.var_boolean_a) {
                    var1_1 = 32;
                    this.C(0);
                } else {
                    this.var_h_a.e();
                    this.var_h_a.e();
                    var1_1 = 33;
                }
                v1 = 5;
                v2 = 0;
                v3 = var1_1;
                ** GOTO lbl24
            }
            case 1: {
                i.var_boolean_k = i.var_boolean_k == false;
                var2_2 = 51;
                if (i.var_boolean_k) {
                    var2_2 = 50;
                    i.t(200);
                }
                v1 = 5;
                v2 = 1;
                v3 = var2_2;
lbl24:
                // 2 sources

                i.a(v1, v2, (short)v3);
            }
        }
    }

    private void s() {
        switch (this.int_b()) {
            case 1: {
                this.void_a(7);
                this.aM = 1;
                return;
            }
            case 0: {
                var_byte_l = 1;
                var_javax_microedition_lcdui_Image_g = null;
                var_javax_microedition_lcdui_Image_f = null;
                return;
            }
            case 3: {
                if (this.var_int_aq == 13 && this.var_int_ap == 0) break;
                this.void_a(7);
                this.aM = 3;
                return;
            }
            case 4: {
                this.void_a(7);
                this.aM = 4;
                return;
            }
            case 5: {
                this.void_a(7);
                this.aM = 5;
                return;
            }
            case 2: {
                this.void_a(5);
                return;
            }
            case 6: {
                var_byte_l = (byte)33;
                this.var_boolean_aw = true;
                return;
            }
            default: {
                this.var_boolean_x = false;
            }
        }
    }

    private void t() {
        int n;
        i i2;
        if (this.var_boolean_B) {
            i2 = this;
            n = 97;
        } else {
            i2 = this;
            n = 92;
        }
        i2.br = n;
        this.bs = 0;
        this.var_boolean_I = true;
        this.var_boolean_v = false;
        var_byte_l = (byte)11;
        this.var_byte_j = 0;
        this.var_byte_k = 0;
        this.aS = 0;
        this.aB = -1;
        this.aA = -1;
        this.var_long_b = 0L;
    }

    private void u() {
        switch (this.int_b()) {
            case 0: {
                this.var_h_a.e();
                this.var_int_ap = 0;
                this.var_boolean_j = false;
                var_byte_l = (byte)15;
                eb = this.int_b(this.var_int_ap);
                this.var_boolean_G = true;
                this.ct();
                return;
            }
            case 1: {
                this.var_h_a.e();
                this.var_int_ap = 1;
                this.var_int_aq = 0;
                var_byte_l = (byte)15;
                eb = this.int_b(this.var_int_ap);
                this.var_boolean_G = true;
                this.ct();
                this.var_boolean_n = true;
                this.var_boolean_j = false;
                if (var_byte_arr_i[9] >= 1) break;
                i.var_byte_arr_i[9] = 1;
                return;
            }
            case 2: {
                this.var_h_a.e();
                this.var_int_ap = 2;
                this.var_int_aq = 0;
                this.var_boolean_j = false;
                var_byte_l = (byte)15;
                eb = this.int_b(this.var_int_ap);
                this.var_boolean_G = true;
                this.ct();
                this.var_boolean_n = true;
                if (var_byte_arr_i[9] < 2) {
                    i.var_byte_arr_i[9] = 2;
                }
                if (var_byte_arr_i[8] >= 8) break;
                i.var_byte_arr_i[8] = 8;
                return;
            }
            case 3: {
                this.void_a(4);
                return;
            }
            default: {
                var_byte_l = (byte)3;
                this.var_h_a.d();
                var_GloftDIRU_a.a();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void v() {
        var1_1 = 0;
        switch (this.int_b()) {
            case 0: {
                h.var_boolean_a = true;
                v0 = 32;
                ** GOTO lbl10
            }
            case 1: {
                h.var_boolean_a = false;
                v0 = 33;
lbl10:
                // 2 sources

                var1_1 = v0;
            }
        }
        this.aM = 0;
        i.a(5, 0, var1_1);
    }

    private void w() {
        switch (this.int_b()) {
            case 1: {
                this.var_h_a.e();
                this.F();
                if (var_byte_arr_i != null && i.boolean_a()) {
                    this.var_int_V = 0;
                    this.var_boolean_L = true;
                    this.var_boolean_n = true;
                    this.bs = 0;
                    var_byte_l = (byte)28;
                    return;
                }
            }
            case 0: {
                this.var_h_a.e();
                if (!i.boolean_a()) {
                    this.aR();
                    return;
                }
                this.var_boolean_P = true;
                this.var_boolean_B = false;
                var_byte_l = (byte)31;
                return;
            }
            case 5: {
                this.void_a(7);
                this.aM = 5;
                return;
            }
            case 6: {
                var_byte_l = (byte)10;
                return;
            }
            case 2: {
                this.void_a(5);
                this.var_h_a.e();
                return;
            }
            case 4: {
                var_byte_l = (byte)22;
                this.aM = 0;
                this.var_h_a.e();
                return;
            }
            case 3: {
                var_byte_l = (byte)33;
                this.var_h_a.e();
                this.var_boolean_aw = true;
                return;
            }
        }
        this.var_boolean_x = false;
    }

    private void x() {
        --this.bq;
        if (this.bq < 0) {
            this.bq = (var_short_arr_arr_a[this.bo].length >> 1) - 1;
        }
    }

    private void y() {
        this.bq = (this.bq + 1) % (var_short_arr_arr_a[this.bo].length >> 1);
    }

    private void z() {
        this.var_boolean_J = false;
        if (var_c_arr_a != null) {
            int n = var_c_arr_a.length;
            for (int j = 0; j < n; ++j) {
                i.a(var_c_arr_a[j]);
                i.var_c_arr_a[j] = null;
            }
        }
        var_c_arr_a = null;
        i.a(var_a_arr_a[42], true);
        i.a(var_a_arr_a[43], true);
        System.gc();
    }

    private static void a(c c2) {
        int n;
        if (c2 == null) {
            return;
        }
        if (c.var_a_arr_a != null) {
            for (n = 0; n < c.var_a_arr_a.length; ++n) {
                i.a(c.var_a_arr_a[n], true);
                c.var_a_arr_a[n] = null;
            }
        }
        if (c2.var_byte_arr_arr_a != null) {
            for (n = 0; n < c2.var_byte_arr_arr_a.length; ++n) {
                c2.var_byte_arr_arr_a[n] = null;
            }
            c2.var_byte_arr_arr_a = null;
        }
        c2.var_byte_arr_a = null;
    }

    private static void a(a a2, boolean bl) {
        if (a2 == null) {
            return;
        }
        a2.a(bl);
    }

    private void A() {
        int n;
        int n2;
        this.var_boolean_I = false;
        this.var_boolean_m = true;
        this.var_boolean_C = false;
        this.dk = 0;
        this.var_java_lang_String_e = null;
        var_byte_arr_m = null;
        var_byte_arr_l = null;
        this.var_int_X = 0;
        this.var_int_Y = 0;
        var_byte_arr_d = null;
        var_byte_arr_e = null;
        this.var_java_io_InputStream_a = null;
        var_byte_arr_n = null;
        var_javax_microedition_lcdui_Image_g = null;
        var_javax_microedition_lcdui_Graphics_c = null;
        var_javax_microedition_lcdui_Graphics_b = null;
        var_javax_microedition_lcdui_Image_d = null;
        var_byte_arr_p = null;
        var_byte_arr_k = null;
        if (var_c_arr_a != null) {
            n2 = var_c_arr_a.length;
            for (n = 0; n < n2; ++n) {
                i.a(var_c_arr_a[n]);
                i.var_c_arr_a[n] = null;
            }
        }
        var_c_arr_a = null;
        if (this.var_c_a != null) {
            i.a(this.var_c_a);
            this.var_c_a = null;
        }
        if (var_javax_microedition_lcdui_Image_arr_arr_a != null) {
            for (n2 = 0; n2 < 33; ++n2) {
                if (var_javax_microedition_lcdui_Image_arr_arr_a[n2] == null) continue;
                n = var_javax_microedition_lcdui_Image_arr_arr_a[n2].length;
                for (int j = 0; j < n; ++j) {
                    i.var_javax_microedition_lcdui_Image_arr_arr_a[n2][j] = null;
                }
                i.var_javax_microedition_lcdui_Image_arr_arr_a[n2] = null;
            }
        }
        i.a(var_a_d, true);
        System.gc();
        if (var_a_arr_a != null) {
            for (n2 = 0; n2 < 61; ++n2) {
                if (n2 == 41 || n2 == 0 || n2 == 9 || n2 == 18) continue;
                i.a(var_a_arr_a[n2], true);
                i.var_a_arr_a[n2] = null;
            }
        }
        if (var_g_arr_a != null) {
            for (n2 = 0; n2 < 6; ++n2) {
                if (var_g_arr_a[n2] == null) continue;
                i.a(i.var_g_arr_a[n2].var_a_a, true);
                i.var_g_arr_a[n2].var_a_a = null;
                i.var_g_arr_a[n2] = null;
            }
        }
        var_int_arr_arr_b = null;
        var_int_arr_arr_a = null;
        var_byte_arr_arr_b = null;
        var_byte_arr_arr_a = null;
        var_byte_arr_arr_c = null;
        var_int_arr_arr_c = null;
        var_int_arr_arr_d = null;
        var_byte_arr_arr_d = null;
        var_byte_arr_arr_e = null;
        var_byte_arr_o = null;
        this.var_long_c = 0L;
        this.bu = 0;
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        this.aD = -1;
        var_a_b = null;
        this.bK = -1;
        this.var_java_lang_String_d = null;
        this.var_byte_x = (byte)3;
        var_int_arr_arr_e = null;
        var_int_arr_arr_f = null;
        var_long_arr_a = null;
        var_long_arr_c = null;
        var_long_arr_b = null;
        var_long_arr_d = null;
        this.var_boolean_am = false;
        this.ds = -1;
        this.dt = 0;
        this.du = 0;
        this.var_byte_v = 0;
        this.dx = 0;
        this.dy = 0;
        this.dz = 0;
        this.var_byte_w = 0;
        this.dA = 0;
        this.dB = -1;
        this.var_boolean_j = false;
        var_byte_arr_e = null;
        i.ak();
        System.gc();
    }

    private void B() {
        this.var_boolean_m = true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void void_e(int var1_1) throws Exception {
        var2_2 = i.b(i.var_byte_arr_n, var1_1 * 8 + 4);
        var3_3 = new byte[var2_2];
        this.var_java_io_InputStream_a.read(var3_3);
        var4_4 = new a();
        var4_4.a(var3_3, 0);
        var4_4.a(0, 0, -1, -1);
        switch (var1_1) {
            case 0: {
                if ((this.var_long_d & 1L) == 0L) break;
                v0 = i.var_a_arr_a;
                v1 = 60;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 1: {
                if ((this.var_long_d & 2L) == 0L) break;
                v0 = i.var_a_arr_a;
                v1 = 16;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 2: {
                i.var_javax_microedition_lcdui_Image_arr_arr_a[0] = null;
                v0 = i.var_a_arr_a;
                v1 = 42;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 3: {
                v0 = i.var_javax_microedition_lcdui_Image_arr_arr_a;
                v1 = 8;
                v2 /* !! */  = var4_4.var_javax_microedition_lcdui_Image_arr_arr_a[0];
lbl31:
                // 4 sources

                v0[v1] = v2 /* !! */ ;
            }
        }
        var4_4.var_byte_arr_g = null;
    }

    /*
     * Unable to fully structure code
     */
    private void void_f(int var1_1) {
        try {
            if (var1_1 == 0) {
                this.var_java_io_InputStream_a.close();
                this.var_java_io_InputStream_a = null;
                System.gc();
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream("/cm.f");
                this.cc = this.var_java_io_InputStream_a.read();
                i.var_byte_arr_n = new byte[this.cc << 3];
                this.var_java_io_InputStream_a.read(i.var_byte_arr_n);
            }
            var2_2 = i.b(i.var_byte_arr_n, var1_1 * 8 + 4);
            var3_3 = new byte[var2_2];
            this.var_java_io_InputStream_a.read(var3_3);
            var4_4 = new a();
            var4_4.a(var3_3, 0);
            var4_4.a(0, 0, -1, -1);
            switch (var1_1) {
                case 6: {
                    i.var_a_arr_a[43] = var4_4;
                    v0 = i.var_javax_microedition_lcdui_Image_arr_arr_a;
                    v1 = 20;
                    v2 = null;
                    ** GOTO lbl58
                }
                case 5: {
                    v0 = i.var_javax_microedition_lcdui_Image_arr_arr_a;
                    v1 = 18;
                    ** GOTO lbl57
                }
                case 2: {
                    var4_4.a(1, 0, 0, -1);
                    v0 = i.var_a_arr_a;
                    v1 = 59;
                    v2 = var4_4;
                    ** GOTO lbl58
                }
                case 1: {
                    switch (this.var_int_ap) {
                        case 1: 
                        case 2: {
                            if (this.var_int_ap == 0) break;
                            var4_4.a(this.var_int_ap, 0, -1, -1);
                            var4_4.void_a(0);
                            var4_4.var_int_b = this.var_int_ap;
                        }
                    }
                    v0 = i.var_a_arr_a;
                    v1 = 56;
                    v2 = var4_4;
                    ** GOTO lbl58
                }
                case 3: {
                    i.var_a_arr_a[13] = var4_4;
                    this.C();
                    break;
                }
                case 0: {
                    v0 = i.var_javax_microedition_lcdui_Image_arr_arr_a;
                    v1 = 11;
                    ** GOTO lbl57
                }
                case 4: {
                    v0 = i.var_javax_microedition_lcdui_Image_arr_arr_a;
                    v1 = 5;
lbl57:
                    // 3 sources

                    v2 = var4_4.var_javax_microedition_lcdui_Image_arr_arr_a[0];
lbl58:
                    // 4 sources

                    v0[v1] = v2;
                }
            }
            var4_4.var_byte_arr_g = null;
            return;
        }
        catch (Exception v3) {
            return;
        }
    }

    private void C() {
        if ((this.var_long_d & 1L) == 0L) {
            for (int j = 0; j < 5; ++j) {
                i.var_a_arr_a[13].var_javax_microedition_lcdui_Image_arr_arr_a[0][j] = null;
            }
        }
    }

    private void void_g(int n) {
        try {
            if (n % 10 == 0) {
                this.var_java_io_InputStream_a.close();
                this.var_java_io_InputStream_a = null;
                StringBuffer stringBuffer = new StringBuffer("/gen").append(this.bt).append(".f");
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream(stringBuffer.toString());
                this.cc = this.var_java_io_InputStream_a.read();
                var_byte_arr_n = new byte[this.cc << 3];
                this.var_java_io_InputStream_a.read(var_byte_arr_n);
                this.cd = 0;
                ++this.bt;
            }
            int n2 = n - (this.bt - 1) * 10;
            int n3 = i.b(var_byte_arr_n, n2 * 8 + 4);
            if ((this.var_long_c & 1L << n) != 0L) {
                if (this.cd != 0) {
                    this.var_java_io_InputStream_a.skip(this.cd);
                    this.cd = 0;
                }
                byte[] byArray = new byte[n3];
                this.var_java_io_InputStream_a.read(byArray);
                a a2 = new a();
                a2.a(byArray, 0);
                if ((n != 28 || this.var_boolean_ag) && (n != 24 || this.var_boolean_ai)) {
                    a2.a(0, 0, -1, -1);
                }
                int n4 = -1;
                int n5 = -1;
                switch (n) {
                    case 41: {
                        n4 = 38;
                        break;
                    }
                    case 42: {
                        n4 = 39;
                        break;
                    }
                    case 0: {
                        n4 = 33;
                        break;
                    }
                    case 36: {
                        n4 = 35;
                        break;
                    }
                    case 1: {
                        n4 = 34;
                        break;
                    }
                    case 38: {
                        n4 = 36;
                        break;
                    }
                    case 16: 
                    case 18: {
                        n4 = 37;
                        break;
                    }
                    case 40: {
                        n4 = 2;
                        break;
                    }
                    case 32: {
                        n4 = 32;
                        break;
                    }
                    case 23: {
                        n4 = 30;
                        break;
                    }
                    case 37: {
                        n4 = 29;
                        break;
                    }
                    case 35: {
                        n4 = 28;
                        break;
                    }
                    case 34: {
                        n4 = 27;
                        break;
                    }
                    case 33: {
                        n4 = 22;
                        break;
                    }
                    case 31: {
                        int n6 = 29;
                        break;
                    }
                    case 30: {
                        n4 = 15;
                        break;
                    }
                    case 28: {
                        if (this.var_boolean_ah) {
                            a2.a(1, 0, -1, -1);
                        }
                        n4 = 45;
                        break;
                    }
                    case 29: {
                        int n6 = 26;
                        break;
                    }
                    case 2: {
                        if (this.var_boolean_ag) {
                            i.var_javax_microedition_lcdui_Image_arr_arr_a[24] = a2.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                        }
                        if (!this.var_boolean_ah) break;
                        a2.a(1, 0, -1, -1);
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[25] = a2.var_javax_microedition_lcdui_Image_arr_arr_a[1];
                        break;
                    }
                    case 6: {
                        int n6 = 21;
                        break;
                    }
                    case 27: {
                        int n6 = 19;
                        break;
                    }
                    case 26: {
                        var_a_d = a2;
                        break;
                    }
                    case 25: {
                        int n6 = 17;
                        break;
                    }
                    case 5: {
                        n4 = 58;
                        break;
                    }
                    case 3: {
                        n4 = 7;
                        break;
                    }
                    case 39: {
                        n4 = 6;
                        break;
                    }
                    case 8: {
                        n4 = 5;
                        break;
                    }
                    case 24: {
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[15] = null;
                        a2.a(1, 0, -1, -1);
                        n4 = 57;
                        i.var_javax_microedition_lcdui_Image_arr_arr_a[14] = null;
                        break;
                    }
                    case 22: {
                        n4 = 8;
                        break;
                    }
                    case 20: {
                        int n6 = 13;
                        break;
                    }
                    case 4: 
                    case 21: {
                        if (this.var_int_ap == 2) break;
                        n4 = 3;
                        break;
                    }
                    case 7: {
                        if (this.var_int_ap == 2) {
                            a2.var_javax_microedition_lcdui_Image_arr_arr_a = null;
                            a2.a(1, 0, -1, -1);
                            a2.var_int_b = 1;
                        }
                        n4 = 20;
                        break;
                    }
                    case 14: {
                        int n6 = 6;
                        break;
                    }
                    case 10: {
                        i.var_g_arr_a[4] = new g(a2, 0, 0, null);
                        var_g_arr_a[4].void_a(0);
                        break;
                    }
                    case 9: {
                        n4 = 12;
                        break;
                    }
                    case 15: 
                    case 17: {
                        if ((this.bu & 2) != 0) {
                            if (this.var_int_ap == 2) {
                                a2.var_javax_microedition_lcdui_Image_arr_arr_a = null;
                                a2.a(2, 0, -1, -1);
                                a2.var_int_b = 2;
                            }
                            n4 = 4;
                        }
                        if ((this.bu & 1) == 0) break;
                        i.var_a_arr_a[21] = new a();
                        var_a_arr_a[21].a(byArray, 0);
                        var_a_arr_a[21].a(1, 0, -1, -1);
                        i.var_a_arr_a[21].var_int_b = 1;
                        i.var_a_arr_a[21].var_byte_arr_g = null;
                        break;
                    }
                    case 13: {
                        n4 = 1;
                        break;
                    }
                    case 11: {
                        n4 = 11;
                        break;
                    }
                    case 19: {
                        int n6 = 7;
                        break;
                    }
                    case 12: {
                        int n6 = n5 = 10;
                    }
                }
                if (n4 != -1) {
                    i.var_a_arr_a[n4] = a2;
                }
                if (n5 != -1) {
                    i.var_javax_microedition_lcdui_Image_arr_arr_a[n5] = a2.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                }
            } else {
                this.cd += n3;
                return;
            }
            a2.var_byte_arr_g = null;
        }
        catch (IOException iOException) {}
    }

    private void h(int n) {
        try {
            if (n == 0) {
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream("/b0.f");
                this.cc = this.var_java_io_InputStream_a.read();
                var_byte_arr_n = new byte[this.cc * 8];
                this.var_java_io_InputStream_a.read(var_byte_arr_n);
            }
            int n2 = i.b(var_byte_arr_n, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.var_java_io_InputStream_a.read(byArray);
            a a2 = new a();
            a2.a(byArray, 0);
            a2.a(0, 0, -1, -1);
            a2.var_byte_arr_g = null;
            switch (n) {
                case 0: {
                    i.var_g_arr_a[5] = new g(a2, 0, 0, null);
                    break;
                }
                case 1: {
                    i.var_a_arr_a[40] = a2;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void i(int n) {
        try {
            if (n == 0) {
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream("/mm0.f");
                this.cc = this.var_java_io_InputStream_a.read();
                var_byte_arr_n = new byte[this.cc * 8];
                this.var_java_io_InputStream_a.read(var_byte_arr_n);
            }
            int n2 = i.b(var_byte_arr_n, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.var_java_io_InputStream_a.read(byArray);
            a a2 = new a();
            a2.a(byArray, 0);
            a2.a(0, 0, -1, -1);
            a2.var_byte_arr_g = null;
            switch (n) {
                case 2: {
                    i.var_javax_microedition_lcdui_Image_arr_arr_a[27] = a2.var_javax_microedition_lcdui_Image_arr_arr_a[0];
                    break;
                }
                case 1: {
                    i.var_g_arr_a[2] = new g(a2, 0, 0, null);
                    var_g_arr_a[2].void_a(0);
                    break;
                }
                case 0: {
                    i.var_g_arr_a[1] = new g(a2, 0, 0, null);
                    var_g_arr_a[1].void_a(2);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static int int_c() {
        byte by = var_byte_arr_i[12];
        return by;
    }

    private static void j(int n) {
        i.var_byte_arr_i[12] = (byte)n;
    }

    private static boolean boolean_a() {
        if (var_byte_arr_i == null) {
            return false;
        }
        return var_byte_arr_i[13] != 0;
    }

    private void b(boolean bl) {
        i.var_byte_arr_i[13] = bl ? (byte)1 : 0;
        this.G();
    }

    private void D() {
        this.ba = this.int_c(this.var_int_ap, this.var_int_aq);
    }

    private void E() {
        this.var_boolean_H = false;
        this.J();
        this.void_a(this.var_int_ap, eb);
        this.b(this.var_int_ap, this.var_int_aq, this.bb + this.int_b(this.var_int_ap, this.var_int_aq));
        this.G();
    }

    private void F() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)"DiamondRush", (boolean)true);
            var_byte_arr_i = recordStore.getRecord(1);
            this.cw = var_byte_arr_i.length;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void G() {
        this.var_boolean_M = false;
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)"DiamondRush", (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(var_byte_arr_i, 0, this.cw);
            } else {
                recordStore.setRecord(1, var_byte_arr_i, 0, this.cw);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void H() {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)"Preferences", (boolean)false);
        }
        catch (Exception exception) {}
        var_byte_arr_j = new byte[1];
        if (recordStore == null) {
            try {
                recordStore = RecordStore.openRecordStore((String)"Preferences", (boolean)true);
                i.var_byte_arr_j[0] = 0;
                this.cv = var_byte_arr_j.length;
                recordStore.closeRecordStore();
                this.I();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        try {
            var_byte_arr_j = recordStore.getRecord(1);
            this.cv = var_byte_arr_j.length;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void I() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)"Preferences", (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(var_byte_arr_j, 0, this.cv);
            } else {
                recordStore.setRecord(1, var_byte_arr_j, 0, this.cv);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void k(int n) {
        try {
            String string = null;
            switch (n) {
                case 0: 
                case 1: {
                    RecordStore recordStore = null;
                    try {
                        recordStore = RecordStore.openRecordStore((String)"DiamondRush", (boolean)false);
                    }
                    catch (Exception exception) {}
                    if (recordStore == null) {
                        this.var_boolean_N = true;
                    } else {
                        this.var_boolean_N = false;
                        recordStore.closeRecordStore();
                    }
                    if (n != 0) {
                        var_byte_arr_i = new byte[1000];
                        i.var_byte_arr_i[3] = 5;
                        i.var_byte_arr_i[8] = 4;
                        i.var_byte_arr_i[9] = 0;
                        i.var_byte_arr_i[10] = 0;
                        this.cw = 14;
                        this.cw += 6;
                    }
                    break;
                }
                case 2: {
                    string = "/map_angkor.out";
                }
                case 3: {
                    if (string == null) {
                        string = "/map_scotland.out";
                    }
                }
                case 4: {
                    if (string == null) {
                        string = "/map_tibet.out";
                    }
                    this.var_java_io_InputStream_a = this.getClass().getResourceAsStream(var_java_lang_String_arr_b[n - 2]);
                    this.var_java_io_InputStream_a.read();
                    int n2 = n - 2;
                    int n3 = this.cw;
                    i.var_byte_arr_i[14 + n2 * 2] = (byte)(this.cw & 0xFF);
                    i.var_byte_arr_i[14 + n2 * 2 + 1] = (byte)(this.cw >> 8);
                    int n4 = this.var_java_io_InputStream_a.read();
                    i.var_byte_arr_i[this.cw++] = (byte)n4;
                    i.var_byte_arr_i[this.cw++] = 0;
                    this.cu();
                    this.a(string);
                    i.var_byte_arr_i[this.cw++] = (byte)this.dM;
                    this.cs();
                    this.cw += n4 << 1;
                    for (int j = 0; j < n4; ++j) {
                        int n5;
                        int n6;
                        int n7 = this.cw;
                        i.var_byte_arr_i[n3 + 3 + j * 2] = (byte)(n7 & 0xFF);
                        i.var_byte_arr_i[n3 + 3 + j * 2 + 1] = (byte)(n7 >> 8);
                        byte by = 0;
                        byte by2 = 0;
                        int n8 = i.a(this.var_java_io_InputStream_a);
                        int n9 = i.a(this.var_java_io_InputStream_a);
                        byte[] byArray = new byte[n8 * n9];
                        this.var_java_io_InputStream_a.read(byArray);
                        for (n6 = 0; n6 < n9; ++n6) {
                            for (n5 = 0; n5 < n8; ++n5) {
                                if (byArray[n5 + n6 * n8] != 2) continue;
                                by2 = (byte)(by2 + 1);
                            }
                        }
                        var_byte_arr_i[0] = (byte)(var_byte_arr_i[0] + by2);
                        i.var_byte_arr_i[this.cw++] = 0;
                        i.var_byte_arr_i[this.cw++] = by2;
                        i.var_byte_arr_i[this.cw++] = 0;
                        this.var_java_io_InputStream_a.skip(n8 * n9);
                        n6 = this.cw;
                        this.cw += 2;
                        this.var_java_io_InputStream_a.read(byArray);
                        for (n5 = 0; n5 < n9; ++n5) {
                            for (int k = 0; k < n8; ++k) {
                                if (byArray[k + n5 * n8] != 14 && byArray[k + n5 * n8] != 33) continue;
                                i.var_byte_arr_i[this.cw++] = (byte)k;
                                i.var_byte_arr_i[this.cw++] = (byte)n5;
                                by = (byte)(by + 1);
                            }
                        }
                        i.var_byte_arr_i[n6] = 0;
                        i.var_byte_arr_i[n6 + 1] = by;
                    }
                    this.var_java_io_InputStream_a.close();
                    this.var_java_io_InputStream_a = null;
                    System.gc();
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void J() {
        i.var_byte_arr_i[3] = (byte)this.var_int_ao;
        i.var_byte_arr_i[11] = this.var_byte_r;
    }

    private void K() {
        this.var_boolean_L = false;
        this.var_int_ao = var_byte_arr_i[3];
        this.var_byte_r = var_byte_arr_i[11];
        this.aZ = i.a(var_byte_arr_i, 4);
    }

    private byte byte_a(int n, int n2) {
        int n3 = this.int_a(n, n2);
        return var_byte_arr_i[n3 + 2];
    }

    private void void_a(int n, int n2, byte by) {
        int n3 = this.int_a(n, n2);
        int n4 = n3 + 2;
        var_byte_arr_i[n4] = (byte)(var_byte_arr_i[n4] | by);
    }

    private void void_a(int n, int n2) {
        int n3 = i.int_c(n) + 1;
        if (var_byte_arr_i[n3] < n2) {
            i.var_byte_arr_i[n3] = (byte)n2;
        }
    }

    private int int_b(int n) {
        int n2 = i.int_c(n) + 1;
        if (n2 >= 0 && n2 <= var_byte_arr_i.length) {
            return var_byte_arr_i[i.int_c(n) + 1];
        }
        return 0;
    }

    private static int int_c(int n) {
        block4: {
            int n2;
            block3: {
                block2: {
                    if (n >= 0) break block2;
                    n2 = 0;
                    break block3;
                }
                if (n < 3) break block4;
                n2 = 2;
            }
            n = n2;
        }
        return i.a(var_byte_arr_i, 14 + n * 2);
    }

    private int int_d(int n) {
        try {
            return var_byte_arr_i[i.int_c(n) + 0];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private int int_e(int n) {
        return var_byte_arr_i[i.int_c(n) + 2];
    }

    private int int_a(int n, int n2) {
        return i.a(var_byte_arr_i, i.int_c(n) + 3 + n2 * 2);
    }

    private int int_b(int n, int n2) {
        return var_byte_arr_i[this.int_a(n, n2) + 0];
    }

    private void b(int n, int n2, int n3) {
        i.var_byte_arr_i[this.int_a((int)n, (int)n2) + 0] = (byte)n3;
    }

    private int int_c(int n, int n2) {
        return var_byte_arr_i[this.int_a(n, n2) + 1];
    }

    private void void_a(int n, int n2, int n3, int n4) {
        int n5 = this.int_a(n, n2);
        int n6 = var_byte_arr_i[n5 + 4];
        for (int j = 0; j < n6; ++j) {
            if (var_byte_arr_i[n5 + 5 + 2 * j + 0] != n3 || var_byte_arr_i[n5 + 5 + 2 * j + 1] != n4) continue;
            i.var_byte_arr_i[n5 + 5 + 2 * j + 0] = 0;
            i.var_byte_arr_i[n5 + 5 + 2 * j + 1] = 0;
            int n7 = n5 + 3;
            var_byte_arr_i[n7] = (byte)(var_byte_arr_i[n7] + 1);
            return;
        }
    }

    private boolean boolean_a(int n, int n2, int n3, int n4) {
        int n5 = this.int_a(n, n2);
        int n6 = var_byte_arr_i[n5 + 4];
        for (int j = 0; j < n6; ++j) {
            if (var_byte_arr_i[n5 + 5 + 2 * j + 0] != n3 || var_byte_arr_i[n5 + 5 + 2 * j + 1] != n4) continue;
            return false;
        }
        return true;
    }

    private void L() {
        this.var_int_ad = 13;
        this.var_int_af = 4;
        this.var_int_ai = 408;
        this.var_byte_i = (byte)5;
        this.var_long_c |= 0x80L;
        this.var_long_c |= 8L;
        this.var_boolean_ad = false;
        this.var_int_D = 16;
        this.var_int_E = 16;
        this.var_int_F = 19;
        this.var_int_G = 18;
    }

    private void M() throws Exception {
        cE = -1;
        var_boolean_D = false;
        this.var_boolean_c = true;
        this.var_int_ax = 0;
        this.bj = 0;
        this.var_long_c = 0L;
        this.var_long_d = 0L;
        this.var_int_Q = 0;
        this.var_int_R = 0;
        this.var_byte_i = 0;
        this.var_boolean_O = (this.byte_a(this.var_int_ap, this.var_int_aq) & 2) != 0;
        this.cl = 0;
        switch (this.var_int_ap) {
            case 0: {
                if (this.var_int_aq == 5) {
                    this.var_byte_i = 1;
                    this.var_int_aa = 816;
                    this.var_int_ab = 0;
                    break;
                }
                if (this.var_int_aq == 13) {
                    this.var_byte_i = (byte)2;
                    this.var_boolean_r = false;
                    break;
                }
                if (this.var_int_aq != 8) break;
                this.var_byte_i = (byte)4;
                this.var_int_ad = 0;
                this.var_int_af = 3;
                this.var_int_ag = 0;
                this.var_int_ae = 0;
                this.var_boolean_i = false;
                this.var_long_c |= 8L;
                this.var_long_c |= 0x400L;
                this.var_int_D = 2;
                this.var_int_E = 12;
                this.var_int_F = 15;
                this.var_int_G = 5;
                break;
            }
            case 1: {
                if (this.var_int_aq != 9) break;
                this.L();
                break;
            }
            case 2: {
                if (this.var_int_aq != 10) break;
                this.bx();
                this.var_int_ah = 360;
                this.var_byte_i = (byte)3;
                this.var_long_c |= 0x80L;
                this.var_long_c |= 8L;
            }
        }
        this.var_boolean_o = false;
        this.var_boolean_p = false;
        this.var_boolean_q = false;
        this.var_int_P = 0;
        this.be = -1;
        this.bf = -1;
        this.var_byte_o = 0;
        this.bg = 0;
        this.bh = 0;
        this.bi = 0;
        this.var_int_am = 70;
        this.var_byte_n = var_byte_arr_i[8];
        this.var_byte_k = 0;
        this.aZ = 0;
        this.bc = 0;
        this.bd = 0;
        this.bb = 0;
        this.aW = 0;
        this.aS = 0;
        this.aT = 0;
        this.aU = 0;
        this.aV = 0;
        cm = -1;
        var_byte_arr_m = null;
        var_byte_arr_l = null;
        this.var_java_io_InputStream_a = this.getClass().getResourceAsStream(var_java_lang_String_arr_b[this.var_int_ap]);
        this.var_java_io_InputStream_a.read();
        boolean bl = false;
        while (!bl) {
            int n = this.var_java_io_InputStream_a.read();
            byte[] byArray = new byte[4];
            for (int j = 0; j < n && !bl; ++j) {
                this.var_java_io_InputStream_a.read(byArray);
                int n2 = i.a(byArray, 0);
                int n3 = i.a(byArray, 2);
                if (j == this.var_int_aq) {
                    int n4;
                    int n5;
                    this.var_int_av = n2;
                    this.var_int_aw = n3;
                    var_byte_arr_arr_a = null;
                    var_byte_arr_arr_c = null;
                    var_int_arr_arr_a = null;
                    System.gc();
                    var_byte_arr_arr_a = new byte[this.var_int_av][this.var_int_aw];
                    var_byte_arr_arr_c = new byte[this.var_int_av][this.var_int_aw];
                    var_int_arr_arr_a = new int[this.var_int_av][this.var_int_aw];
                    byArray = new byte[this.var_int_av * this.var_int_aw];
                    this.var_java_io_InputStream_a.read(byArray);
                    for (n5 = 0; n5 < this.var_int_av; ++n5) {
                        for (n4 = 0; n4 < this.var_int_aw; ++n4) {
                            i.var_byte_arr_arr_a[n5][n4] = byArray[n5 + n4 * this.var_int_av];
                        }
                    }
                    var_byte_arr_arr_b = new byte[this.var_int_av][this.var_int_aw];
                    var_int_arr_arr_b = new int[this.var_int_av][this.var_int_aw];
                    this.var_java_io_InputStream_a.read(byArray);
                    for (n5 = 0; n5 < this.var_int_av; ++n5) {
                        for (n4 = 0; n4 < this.var_int_aw; ++n4) {
                            i.var_int_arr_arr_b[n5][n4] = byArray[n5 + n4 * this.var_int_av];
                        }
                    }
                    this.var_java_io_InputStream_a.read(byArray);
                    for (n5 = 0; n5 < this.var_int_av; ++n5) {
                        for (n4 = 0; n4 < this.var_int_aw; ++n4) {
                            i.var_int_arr_arr_a[n5][n4] = byArray[n5 + n4 * this.var_int_av];
                        }
                    }
                    byArray = null;
                    bl = true;
                    continue;
                }
                this.var_java_io_InputStream_a.skip(n2 * n3 * 3);
            }
        }
        this.var_java_io_InputStream_a.close();
        this.var_java_io_InputStream_a = null;
        this.var_int_at = 0;
        this.var_int_ar = 0;
        this.var_int_au = 0;
        this.var_int_as = 0;
        this.void_c();
        System.gc();
    }

    private void N() {
        int n = this.dX;
        int n2 = this.dY;
        long l = var_long_arr_arr_a[n][n2];
        int n3 = i.a(l, (byte)6, (byte)5);
        int n4 = i.a(l, (byte)11, (byte)3);
        int n5 = 14;
        if (this.var_int_aq >= this.dM) {
            this.void_a(this.var_int_ap, this.var_int_aq, (byte)2);
        }
        if (n4 > 1) {
            int n6 = 0;
            while (n6 < n4) {
                int n7;
                int n8;
                int n9 = i.a(l, (byte)n5, (byte)4);
                long l2 = var_long_arr_arr_a[n9][n8 = i.a(l, (byte)(n5 += 4), (byte)4)];
                int n10 = i.a(l2, (byte)3, (byte)3);
                if (n10 == 1 && (n7 = i.a(l2, (byte)6, (byte)5)) > n3) {
                    eb = n7;
                    this.cx = n;
                    this.cy = n2;
                    this.void_a(this.var_int_ap, eb, (byte)64);
                    this.var_boolean_ab = true;
                }
                ++n6;
                n5 += 4;
            }
        } else {
            eb = this.var_int_aq;
        }
    }

    private void void_a(Graphics graphics) {
        try {
            this.var_javax_microedition_lcdui_Graphics_a = graphics;
            this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
            switch (var_byte_l) {
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
                    i.a(this.var_javax_microedition_lcdui_Graphics_a, var_a_arr_a[41], var_java_lang_String_arr_a[48], 120, 180, 3, 20, true);
                    break;
                }
                case 17: {
                    this.bg();
                    break;
                }
                case 10: {
                    this.boolean_a(this.var_javax_microedition_lcdui_Graphics_a);
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
                    this.b(this.var_javax_microedition_lcdui_Graphics_a, true);
                    if (aN % 20 < 10) break;
                    var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[82], 120, 250, 17);
                    break;
                }
                case 2: {
                    this.an();
                    break;
                }
                case 5: {
                    if (!this.var_boolean_Q) {
                        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 293, 240, 27);
                        this.ao();
                        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
                    } else {
                        this.ao();
                    }
                    if (var_byte_arr_f == null || !this.var_boolean_Q) break;
                    this.cr();
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
                    break;
                }
                case 0: 
                case 3: {
                    break;
                }
                case 15: {
                    this.cv();
                    break;
                }
                case 18: {
                    this.cF();
                    this.var_boolean_aw = true;
                    var_byte_l = (byte)25;
                    this.ep = this.var_int_c;
                    this.var_java_lang_String_f = var_java_lang_String_arr_a[110] + " " + i.a(var_byte_arr_i, 4) + " " + var_java_lang_String_arr_a[109];
                }
                case 25: {
                    this.cG();
                    break;
                }
                case 26: {
                    break;
                }
                case 27: {
                    this.Q();
                    break;
                }
                case 31: {
                    if (!this.var_boolean_P) break;
                    this.var_boolean_P = false;
                    this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
                    this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
                    i.var_a_arr_a[41].var_int_e = 5;
                    var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, i.java_lang_String_a(var_java_lang_String_arr_a[this.var_boolean_N ? 69 : 68], 220), 120, 160, 3);
                    this.void_b();
                    this.void_a();
                    break;
                }
                case 16: {
                    this.ao();
                    break;
                }
                case 29: {
                    this.P();
                }
            }
            this.cK();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void O() {
        if (this.var_boolean_aw) {
            this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
            this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
            this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
            i.var_a_arr_a[41].var_int_e = 3;
            String string = var_java_lang_String_arr_a[4] + "\n\n" + var_java_lang_String_arr_a[103] + "\n" + var_java_lang_String_arr_a[104] + "\n" + var_java_lang_String_arr_a[105] + "\n\n" + var_java_lang_String_arr_a[106] + "\n\n" + var_java_lang_String_arr_a[107] + "\n\n" + var_java_lang_String_arr_a[108];
            string = i.java_lang_String_a(string, 235);
            var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, string, 120, 10, 17);
            this.void_a();
            this.var_boolean_aw = false;
        }
    }

    private void a(Graphics graphics, boolean bl, int n, int n2) {
        int n3;
        graphics.setClip(0, 0, 240, 320);
        int n4 = 0;
        int n5 = 0;
        if (n != 0 || n2 != 0) {
            n4 -= 24;
            n5 -= 24;
        }
        int n6 = 0;
        for (n3 = n5; n3 < 320; n3 += 24) {
            for (int j = n4; j < 240; j += 24) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[8][0], j + n, n3 + n2, 0);
            }
        }
        var_a_arr_a[10].a(graphics, 0, this.var_int_o + n, this.var_int_p + n2, 0, 0, 0);
        if (bl) {
            for (n3 = 0; n3 < 320; n3 += 24) {
                for (n6 = 0; n6 < 240; n6 += 24) {
                    var_a_arr_a[17].a(graphics, 16, n6, n3, 0, 0, 0);
                }
            }
        }
    }

    private void a(Graphics graphics, boolean bl) {
        this.a(graphics, bl, 0, 0);
    }

    private void P() {
        int n;
        int n2;
        if (this.var_boolean_aw) {
            this.a(this.var_javax_microedition_lcdui_Graphics_a, false, this.var_int_N, this.var_int_O);
            var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 11, 120 + f.c[6] + this.var_int_N, 136 + f.c[7] + this.var_int_O, 0, 0, 0);
            n2 = 0;
            for (n = 0; n < 3; ++n) {
                n2 = 52 + n;
                var_a_arr_a[n2].a(this.var_javax_microedition_lcdui_Graphics_a, 0, f.c[n << 1] + 120 - this.var_int_v + this.var_int_N, f.c[(n << 1) + 1] + 136 - this.var_int_w + this.var_int_O, 0, 0, 0);
            }
        }
        switch (this.var_int_L) {
            case 1: {
                if (this.var_boolean_aw) break;
                this.var_javax_microedition_lcdui_Graphics_a.setColor(this.var_int_M);
                this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
                for (n = 0; n < 3; ++n) {
                    n2 = 52 + n;
                    var_a_arr_a[n2].a(this.var_javax_microedition_lcdui_Graphics_a, 0, f.c[n << 1] + 120 - this.var_int_v, f.c[(n << 1) + 1] + 136 - this.var_int_w, 0, 0, 0);
                }
                break;
            }
            case 2: {
                return;
            }
            case 3: {
                return;
            }
            case 4: {
                return;
            }
            case 5: {
                return;
            }
            case 6: {
                return;
            }
            case 7: {
                return;
            }
            case 8: {
                b.a(this.var_javax_microedition_lcdui_Graphics_a);
                return;
            }
            case 9: 
            case 10: {
                b.a(this.var_javax_microedition_lcdui_Graphics_a);
                n2 = i.var_a_arr_a[41].var_int_e;
                i.var_a_arr_a[41].var_int_e = 3;
                String string = var_java_lang_String_arr_a[40] + "\n" + var_java_lang_String_arr_a[97];
                string = i.java_lang_String_a(string, 220);
                var_a_arr_a[41].void_a(string);
                i.a(this.var_javax_microedition_lcdui_Graphics_a, (240 - a.var_int_c >> 1) - 3, (320 - a.var_int_d >> 1) - 3, a.var_int_c + 6, a.var_int_d + 6, 7096587, 0);
                var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, string, 120, 160, 3);
                i.var_a_arr_a[41].var_int_e = n2;
            }
        }
    }

    private void Q() {
        int n;
        int n2;
        block12: {
            block10: {
                block11: {
                    if (this.var_boolean_aw || this.var_boolean_e) {
                        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
                        this.a(this.var_javax_microedition_lcdui_Graphics_a, false);
                        var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 11, 120 + f.c[6], 136 + f.c[7], 0, 0, 0);
                        this.void_a();
                        this.void_b();
                        var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[27].toLowerCase(), 222, 311, 10);
                        this.var_boolean_aw = false;
                    } else {
                        this.var_javax_microedition_lcdui_Graphics_a.setClip(this.var_int_h + 120, this.var_int_i + 136, 14, 22);
                        var_a_arr_a[10].a(this.var_javax_microedition_lcdui_Graphics_a, 0, this.var_int_o, this.var_int_p, 0, 0, 0);
                    }
                    if (this.var_int_q == 0) break block10;
                    this.var_boolean_e = false;
                    this.var_boolean_aw = true;
                    for (n2 = 0; n2 < this.var_int_q; ++n2) {
                        if (!i.boolean_b(n2)) continue;
                        var_a_arr_a[10].a(this.var_javax_microedition_lcdui_Graphics_a, n2 + 1, this.var_int_o, this.var_int_p, 0, 0, 0);
                    }
                    this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
                    if (this.var_int_z >= this.var_int_y) break block11;
                    var_a_arr_a[9].a(this.var_javax_microedition_lcdui_Graphics_a, 5, this.var_int_z, f.c[this.var_int_q << 1] + 120 - 12, f.c[(this.var_int_q << 1) + 1] + 124, 0, 0, 0);
                    ++this.var_int_z;
                    break block12;
                }
                if (this.var_int_n % this.var_int_m >= this.var_int_m >> 1) {
                    var_a_arr_a[10].a(this.var_javax_microedition_lcdui_Graphics_a, this.var_int_q + 1, this.var_int_o, this.var_int_p, 0, 0, 0);
                    ++this.var_int_r;
                }
                if (this.var_int_r < 15) break block12;
                i.var_boolean_arr_a[this.var_int_q] = true;
                this.var_int_r = 0;
                this.var_int_q = 0;
                this.var_int_z = 0;
                this.l();
                this.var_boolean_e = true;
                this.var_boolean_aw = false;
                break block12;
            }
            for (n2 = 0; n2 < 3; ++n2) {
                if (!var_boolean_arr_a[n2]) continue;
                var_a_arr_a[10].a(this.var_javax_microedition_lcdui_Graphics_a, n2 + 1, this.var_int_o, this.var_int_p, 0, 0, 0);
            }
        }
        for (n = 0; n < 3; ++n) {
            if (!var_boolean_arr_b[n]) continue;
            n2 = 52 + n;
            if (this.var_int_s == n) continue;
            var_a_arr_a[n2].a(this.var_javax_microedition_lcdui_Graphics_a, 0, f.c[n << 1] + 120 - this.var_int_v, f.c[(n << 1) + 1] + 136 - this.var_int_w, 0, 0, 0);
        }
        if (this.var_int_s != -1) {
            this.var_boolean_aw = true;
            if (this.boolean_c(this.var_int_s)) {
                this.var_int_s = -1;
                if (var_boolean_arr_b[0] && var_boolean_arr_b[1] && var_boolean_arr_b[2]) {
                    this.void_g();
                    this.var_boolean_aw = true;
                    this.var_boolean_g = true;
                    var_byte_l = (byte)29;
                }
            }
            return;
        }
        this.var_int_n %= this.var_int_m;
        this.var_javax_microedition_lcdui_Graphics_a.setClip(this.var_int_f + 120, 136 + this.var_int_g, 14, 22);
        var_a_arr_a[55].a(this.var_javax_microedition_lcdui_Graphics_a, 0, this.var_int_n, 120 + this.var_int_f, 136 + this.var_int_g, 0, 0, 0);
        ++this.var_int_n;
        if (this.var_boolean_e) {
            n = i.var_a_arr_a[41].var_int_e;
            i.var_a_arr_a[41].var_int_e = 1;
            String string = this.var_java_lang_String_b + "\n" + this.var_java_lang_String_c;
            string = i.java_lang_String_a(string, 220);
            var_a_arr_a[41].void_a(string);
            int n3 = (240 - a.var_int_c >> 1) - 3;
            int n4 = 250 - (a.var_int_d >> 1) - 3;
            int n5 = a.var_int_c + 6;
            int n6 = a.var_int_d + 6;
            this.var_javax_microedition_lcdui_Graphics_a.setClip(n3, n4, n5, n6);
            i.a(this.var_javax_microedition_lcdui_Graphics_a, n3, n4, n5, n6, 7096587, 0);
            var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, string, 120, 250, 3);
            i.var_a_arr_a[41].var_int_e = n;
            this.var_boolean_e = false;
        }
    }

    private boolean boolean_c(int n) {
        int n2;
        int n3;
        int n4;
        block14: {
            block15: {
                int n5;
                block13: {
                    block11: {
                        block12: {
                            int n6;
                            block10: {
                                n4 = 52 + n;
                                n3 = f.c[n << 1] + 120;
                                n2 = f.c[(n << 1) + 1] + 136;
                                n6 = n2 - this.var_int_u;
                                n5 = n3 - this.var_int_t;
                                if (n6 >= 0) break block10;
                                this.var_int_u -= 2;
                                if (this.var_int_u > n2) break block11;
                                break block12;
                            }
                            if (n6 <= 0) break block11;
                            this.var_int_u += 2;
                            if (this.var_int_u < n2) break block11;
                        }
                        this.var_int_u = n2;
                    }
                    if (n5 >= 0) break block13;
                    this.var_int_t -= 3;
                    if (this.var_int_t > n3) break block14;
                    break block15;
                }
                if (n5 <= 0) break block14;
                this.var_int_t += 3;
                if (this.var_int_t < n3) break block14;
            }
            this.var_int_t = n3;
        }
        var_a_arr_a[n4].a(this.var_javax_microedition_lcdui_Graphics_a, 0, this.var_int_t - this.var_int_v, this.var_int_u - this.var_int_w, 0, 0, 0);
        if (this.var_int_t == n3 && this.var_int_u == n2) {
            this.var_int_t = n3;
            this.var_int_u = n2;
            if (this.var_int_x < 20) {
                if (this.var_int_x % 2 == 1) {
                    int n7 = 838860;
                    this.var_javax_microedition_lcdui_Graphics_a.setColor(0 + n7 * this.var_int_x);
                    this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
                }
                ++this.var_int_x;
                return false;
            }
            if (this.var_int_z < this.var_int_y) {
                var_a_arr_a[9].a(this.var_javax_microedition_lcdui_Graphics_a, 5, this.var_int_z, f.c[n << 1] + 120 - 12, f.c[(n << 1) + 1] + 124, 0, 0, 0);
                ++this.var_int_z;
                return false;
            }
            this.var_int_z = 0;
            this.var_int_x = 0;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void R() {
        var1_1 = null;
        var2_2 = i.var_a_arr_a[41];
        i.var_a_arr_a[41].var_int_e = 15;
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
        for (var3_3 = 0; var3_3 < 6; ++var3_3) {
            var4_4 = -1;
            switch (var3_3) {
                case 0: {
                    var4_4 = 60;
                    v0 = " 6 - Add " + String.valueOf(this.aZ);
                    ** GOTO lbl32
                }
                case 1: {
                    var4_4 = 61;
                    v0 = " 7 - Add " + String.valueOf(this.bb);
                    ** GOTO lbl32
                }
                case 2: {
                    var4_4 = 62;
                    v0 = " 8 - x " + String.valueOf(this.cA) + (this.cA >= 4 ? " blue potion" : "");
                    ** GOTO lbl32
                }
                case 3: {
                    var4_4 = 63;
                    v0 = " 9 - " + i.var_java_lang_String_arr_a[this.var_boolean_R != false ? 66 : 67];
                    ** GOTO lbl32
                }
                case 4: {
                    var4_4 = 64;
                    v0 = " 0 - " + i.var_java_lang_String_arr_a[this.var_boolean_S != false ? 66 : 67];
                    ** GOTO lbl32
                }
                case 5: {
                    var4_4 = -1;
                    v0 = "5 to activate lang cheat";
lbl32:
                    // 6 sources

                    var1_1 = v0;
                }
            }
            var5_5 = var3_3 * 35;
            if (var4_4 >= 0) {
                var2_2.a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_String_arr_a[var4_4], 110, var5_5, 17);
            }
            var2_2.a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_String_arr_a[65], 110, var5_5 += var2_2.var_int_e, 24);
            var2_2.a(this.var_javax_microedition_lcdui_Graphics_a, var1_1, 110, var5_5, 20);
        }
        var1_1 = "Pound - Pass levels ";
        if (this.var_boolean_aa) {
            v1 = new StringBuffer().append(var1_1);
            v2 = "on";
        } else {
            v1 = new StringBuffer().append(var1_1);
            v2 = "off";
        }
        var1_1 = v1.append(v2).toString();
        var2_2.a(this.var_javax_microedition_lcdui_Graphics_a, var1_1, 110, 290, 17);
        this.void_a();
        this.void_b();
    }

    private void S() {
        String string;
        a a2 = var_a_arr_a[41];
        var_a_arr_a[41].var_int_e = 2;
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
        switch (this.df) {
            case 1: {
                string = "Tips";
                i.A(this.var_int_arr_a[1]);
                this.cr();
                break;
            }
            case 0: {
                string = "Mix";
                a2.b(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[this.var_int_arr_a[0]], 10, 5, 20);
                break;
            }
            default: {
                string = "";
            }
        }
        a2.var_int_e = 2;
        a2.a(this.var_javax_microedition_lcdui_Graphics_a, string, 40, 308, 20);
        a2.a(this.var_javax_microedition_lcdui_Graphics_a, "" + this.var_int_arr_a[this.df], 120, 308, 20);
        a2.b(this.var_javax_microedition_lcdui_Graphics_a, "Use up, down, left and right to navigate", 10, 280, 20);
        this.void_a();
        this.void_b();
    }

    private void T() {
        this.an();
    }

    private void b(Graphics graphics, boolean bl) {
        graphics.drawImage(var_javax_microedition_lcdui_Image_b, 0, 0, 20);
        graphics.drawImage(var_javax_microedition_lcdui_Image_a, 0, 0, 20);
        if (bl) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_c, 120, 319, 33);
        }
    }

    private void U() {
        int n;
        int n2;
        int n3;
        String string;
        Graphics graphics;
        a a2;
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
        a a3 = var_a_arr_a[41];
        a3.a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[35], 120, 50, 17);
        if (this.var_byte_i == 2) {
            a2 = a3;
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            string = var_java_lang_String_arr_a[26];
            n3 = 0;
            n2 = 320;
            n = 36;
        } else {
            a3.a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[1], 0, 320, 36);
            String string2 = var_java_lang_String_arr_a[111] + " " + (i.a(var_byte_arr_i, 4) < 500 ? i.a(var_byte_arr_i, 4) : 500) + " " + var_java_lang_String_arr_a[109];
            a2 = a3;
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            string = string2;
            n3 = 120;
            n2 = 160;
            n = 17;
        }
        a2.a(graphics, string, n3, n2, n);
        this.az();
    }

    /*
     * Unable to fully structure code
     */
    private void b(Graphics var1_1) {
        block4: {
            block2: {
                block3: {
                    var2_2 = this.var_int_ar % i.cC;
                    var3_3 = this.var_int_as % i.cD;
                    var4_4 = (this.var_int_ar + 240) % i.cC;
                    var5_5 = (this.var_int_as + 240) % i.cD;
                    if (var4_4 <= var2_2) break block2;
                    if (var5_5 <= var3_3) break block3;
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = var3_3;
                    v3 = 0;
                    v4 = 0;
                    break block4;
                }
                i.a(var1_1, var2_2, var3_3, 0, 0);
                v0 = var1_1;
                v1 = var2_2;
                v2 = 0;
                v3 = 0;
                ** GOTO lbl36
            }
            if (var5_5 > var3_3) {
                i.a(var1_1, var2_2, var3_3, 0, 0);
                v0 = var1_1;
                v1 = 0;
                v2 = var3_3;
                v3 = 240 - var4_4;
                v4 = 0;
            } else {
                i.a(var1_1, var2_2, var3_3, 0, 0);
                i.a(var1_1, var2_2, 0, 0, 240 - var5_5);
                i.a(var1_1, 0, var3_3, 240 - var4_4, 0);
                v0 = var1_1;
                v1 = 0;
                v2 = 0;
                v3 = 240 - var4_4;
lbl36:
                // 2 sources

                v4 = 240 - var5_5;
            }
        }
        i.a(v0, v1, v2, v3, v4);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(var_javax_microedition_lcdui_Image_d, n3 - n, n4 - n2, 0);
    }

    private static void V() {
        cC = 264;
        cD = 264;
        var_javax_microedition_lcdui_Image_d = Image.createImage((int)cC, (int)cD);
        var_javax_microedition_lcdui_Graphics_b = var_javax_microedition_lcdui_Image_d.getGraphics();
    }

    private void void_b(int n, int n2) {
        int n3 = this.var_int_ar - this.var_int_ar % 24;
        int n4 = this.var_int_as - this.var_int_as % 24;
        int n5 = this.var_int_ar + cC - 24 - (this.var_int_ar + cC - 24) % 24;
        int n6 = this.var_int_as + cD - 24 - (this.var_int_as + cD - 24) % 24;
        int n7 = n * 24;
        int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            int n9 = var_int_arr_arr_a[n][n2] & 0xFF;
            byte by = var_byte_arr_arr_a[n][n2];
            if (by < 80) {
                if (n9 == 4 || n9 == 16 || n9 == 15) {
                    this.void_c(n, n2);
                    return;
                }
                var_javax_microedition_lcdui_Graphics_b.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[8][0], n7 % cC, n8 % cD, 0);
            }
        }
    }

    private void void_c(int n, int n2) {
        int n3 = this.var_int_ar - this.var_int_ar % 24;
        int n4 = this.var_int_as - this.var_int_as % 24;
        int n5 = this.var_int_ar + cC - 24 - (this.var_int_ar + cC - 24) % 24;
        int n6 = this.var_int_as + cD - 24 - (this.var_int_as + cD - 24) % 24;
        int n7 = n * 24;
        int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            this.void_a(n7, n8, n7, n8, false);
        }
    }

    public static int int_a(int n) {
        switch (n) {
            case 0: {
                return 42;
            }
            case 20: {
                return 43;
            }
            case 22: {
                i.var_a_arr_a[45].var_int_b = 0;
                return 45;
            }
            case 23: {
                i.var_a_arr_a[45].var_int_b = 1;
                return 45;
            }
            case 4: {
                return 56;
            }
            case 15: {
                i.var_a_arr_a[57].var_int_b = 0;
                return 57;
            }
            case 14: {
                i.var_a_arr_a[57].var_int_b = 1;
                return 57;
            }
            case 16: {
                return 58;
            }
            case 2: {
                i.var_a_arr_a[59].var_int_b = 0;
                return 59;
            }
            case 3: {
                i.var_a_arr_a[59].var_int_b = 1;
                return 59;
            }
            case 1: {
                return 60;
            }
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private void void_a(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        var6_6 = null;
        var9_7 = 0;
        var10_8 = 0;
        var6_6 = i.var_javax_microedition_lcdui_Graphics_b;
        var7_9 = i.cC;
        var8_10 = i.cD;
        var9_7 = var1_1 % var7_9;
        var10_8 = var2_2 % var8_10;
        this.by = var10_8 - 24;
        this.bH = var2_2 / 24 - 1;
        for (var11_11 = var2_2; var11_11 <= var4_4; var11_11 += 24) {
            this.bx = var9_7 - 24;
            this.bG = var1_1 / 24 - 1;
            this.by += 24;
            ++this.bH;
            if (this.by >= var8_10) {
                this.by = 0;
            }
            for (var12_12 = var1_1; var12_12 <= var3_3; var12_12 += 24) {
                block25: {
                    block26: {
                        this.bx += 24;
                        ++this.bG;
                        if (this.bx >= var7_9) {
                            this.bx = 0;
                        }
                        if (this.bG < 0 || this.bG >= this.var_int_av || this.bH < 0 || this.bH >= this.var_int_aw) continue;
                        this.bI = i.var_byte_arr_arr_a[this.bG][this.bH];
                        this.bJ = i.var_int_arr_arr_a[this.bG][this.bH] & 255;
                        if (this.bI < 80 && !var5_5) {
                            var6_6.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[8][0], this.bx, this.by, 0);
                        }
                        if (this.bJ > -1 && this.bJ < 38) {
                            switch (this.bJ) {
                                case 4: {
                                    this.aE = 20;
                                    this.aF = 7;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 27: {
                                    this.aE = 21;
                                    this.aF = 0;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 15: {
                                    if (this.ce != 0) break;
                                    this.aE = 14;
                                    v0 = this;
                                    v1 = 0 + this.ce * 5 / 10;
                                    break;
                                }
                                case 16: {
                                    if (this.ce != 9) break;
                                    this.aE = 15;
                                    this.aF = 4 - this.ce * 5 / 10;
                                    if (this.aF >= 0) break;
                                    v0 = this;
                                    v1 = v0.aF = 0;
                                }
                            }
                        }
                        if (this.aE != -1) {
                            if (i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aE] == null) {
                                i.var_a_arr_a[i.int_a(this.aE)].a(var6_6, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                            } else {
                                var6_6.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.bP = 0;
                            this.aE = -1;
                            this.bO = 0;
                            this.bN = 0;
                        }
                        if (this.bI == -1 || var5_5) break block25;
                        var13_13 = this.bI - 80;
                        if (var13_13 < 0) break block26;
                        this.aG = 0;
                        v2 = this;
                        v3 = var13_13;
                        ** GOTO lbl99
                    }
                    switch (this.bI) {
                        case 10: {
                            i.var_a_arr_a[16].a(var6_6, 0, this.bx, this.by, 0, 0, 0);
                            break;
                        }
                        case 1: {
                            if (i.var_byte_arr_arr_b[this.bG][this.bH] != 0 || i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[this.bG][this.bH] != 0) break;
                            this.aA();
                            this.aH -= this.bR;
                            this.bO = 0;
                            break;
                        }
                        case 0: {
                            if (i.var_byte_arr_arr_b[this.bG][this.bH] != 0 || i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[this.bG][this.bH] != 0) break;
                            this.aA();
                            break;
                        }
                        case 34: {
                            if (this.ce != 9) break;
                            this.aG = 14;
                            v2 = this;
                            v3 = 0 + this.ce * 5 / 10;
                            ** GOTO lbl99
                        }
                        case 35: {
                            if (this.ce != 0) break;
                            this.aG = 15;
                            this.aH = 4 - this.ce * 5 / 10;
                            if (this.aH >= 0) break;
                            v2 = this;
                            v3 = 0;
lbl99:
                            // 3 sources

                            v2.aH = v3;
                        }
                    }
                    if (this.aG != -1) {
                        if (i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aG] == null) {
                            i.var_a_arr_a[i.int_a(this.aG)].a(var6_6, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                        } else {
                            var6_6.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                        }
                        this.aG = -1;
                        this.bP = 0;
                        this.bO = 0;
                        this.bN = 0;
                    }
                }
                if (this.var_byte_i != 2) continue;
                this.d(var6_6);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void c(Graphics var1_1) {
        for (var2_2 = -1; var2_2 < 12; ++var2_2) {
            for (var3_3 = -1; var3_3 < 12; ++var3_3) {
                block67: {
                    block64: {
                        block66: {
                            block65: {
                                this.bG = var3_3 + this.cI;
                                this.bH = var2_2 + this.cJ;
                                if (this.bG < 0 || this.bG >= this.var_int_av || this.bH < 0 || this.bH >= this.var_int_aw) continue;
                                this.bI = i.var_byte_arr_arr_a[this.bG][this.bH];
                                this.bJ = i.var_int_arr_arr_a[this.bG][this.bH] & 255;
                                this.bx = var3_3 * 24 - this.cK;
                                this.by = var2_2 * 24 - this.cL;
                                this.W();
                                if (this.bJ <= -1 || this.bJ >= 38) break block64;
                                switch (this.bJ) {
                                    case 35: {
                                        v0 = this;
                                        ** GOTO lbl62
                                    }
                                    case 34: {
                                        i.var_a_arr_a[27].a(var1_1, 2, 0, this.bx, this.by, 0, 0, 0);
                                        break;
                                    }
                                    case 14: 
                                    case 33: {
                                        this.l(this.bJ);
                                        break;
                                    }
                                    case 6: {
                                        this.aC();
                                        if (this.by + 24 >= 240) break;
                                        var1_1.clipRect(this.bx, this.by, 24, 24);
                                        break;
                                    }
                                    case 15: {
                                        if (this.ce == 0 || this.ce > 5) break;
                                        this.aE = 14;
                                        this.aF = 0 + this.ce * 5 / 10;
                                        break;
                                    }
                                    case 16: {
                                        if (this.ce == 9 || this.ce < 5) break;
                                        this.aE = 15;
                                        this.aF = 4 - this.ce * 5 / 10;
                                        if (this.aF >= 0) break;
                                        this.aF = 0;
                                        break;
                                    }
                                    case 7: {
                                        this.aH();
                                        break;
                                    }
                                    case 4: {
                                        if (i.var_int_arr_arr_a[this.bG][this.bH] >> 8 < this.var_int_ax) break;
                                        this.ag();
                                        break;
                                    }
                                    case 5: 
                                    case 28: {
                                        this.aE = 11;
                                        this.aF = 0;
                                        break;
                                    }
                                    case 8: 
                                    case 9: {
                                        this.aG();
                                        break;
                                    }
                                    case 3: {
                                        var4_4 = (i.var_int_arr_arr_a[this.bG][this.bH] >> 8) - 1;
                                        if (var4_4 < 0) break;
                                        this.aE = 12;
                                        this.aF = (byte)var4_4;
                                        break;
                                    }
                                    case 37: {
                                        i.var_a_arr_a[27].a(var1_1, 2, 0, this.bx, this.by, 0, 0, 0);
                                        v0 = this;
lbl62:
                                        // 2 sources

                                        v0.ab();
                                    }
                                }
                                if (this.aE == -1) break block65;
                                if (i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aE] == null) {
                                    i.var_a_arr_a[i.int_a(this.aE)].a(var1_1, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                                } else {
                                    var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                this.bP = 0;
                                this.aE = -1;
                                var1_1.setClip(0, -this.bk, 240, 240);
                                break block66;
                            }
                            if (i.var_a_b == null) break block64;
                            if (this.bK != -1) {
                                i.var_a_b.a(var1_1, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, 0, 0, 0);
                                this.bK = -1;
                            }
                            i.var_a_b = null;
                        }
                        this.bO = 0;
                        this.bN = 0;
                    }
                    if (this.bI == -1) continue;
                    var4_4 = this.bI - 80;
                    if (var4_4 >= 0) break block67;
                    var5_5 = i.var_int_arr_arr_b[this.bG][this.bH];
                    switch (this.bI) {
                        case 49: {
                            this.aB();
                            break;
                        }
                        case 48: {
                            this.Z();
                            break;
                        }
                        case 21: {
                            this.ac();
                            break;
                        }
                        case 46: {
                            this.ad();
                            break;
                        }
                        case 45: {
                            this.aK();
                            break;
                        }
                        case 44: {
                            this.ae();
                            this.bL = 0;
                            break;
                        }
                        case 12: {
                            this.af();
                            break;
                        }
                        case 36: {
                            this.aj();
                            break;
                        }
                        case 18: {
                            this.ai();
                            break;
                        }
                        case 34: {
                            if (this.ce == 9 || this.ce < 5) break;
                            this.aG = 14;
                            this.aH = 0 + this.ce * 5 / 10;
                            break;
                        }
                        case 35: {
                            if (this.ce == 0 || this.ce > 5) break;
                            this.aG = 15;
                            this.aH = 4 - this.ce * 5 / 10;
                            if (this.aH >= 0) break;
                            this.aH = 0;
                            break;
                        }
                        case 28: {
                            this.aM();
                            break;
                        }
                        case 16: {
                            this.aJ();
                            break;
                        }
                        case 14: {
                            this.aI();
                            break;
                        }
                        case 32: {
                            this.aF();
                            break;
                        }
                        case 11: {
                            this.aE();
                            break;
                        }
                        case 30: {
                            i.var_a_b = i.var_a_arr_a[20];
                            this.bK = 0;
                            this.bL = 0 + (var5_5 - 1) * 7 / 16;
                            break;
                        }
                        case 37: {
                            this.aG = 17;
                            this.aH = 0 + (var5_5 - 1) * 3 / 8;
                            break;
                        }
                        case 23: {
                            i.var_a_b = i.var_a_arr_a[12];
                            this.bL = 0;
                            this.b((byte)23);
                            break;
                        }
                        case 22: {
                            i.var_a_b = i.var_a_arr_a[12];
                            this.bL = 1;
                            this.b((byte)22);
                            break;
                        }
                        case 43: {
                            this.c((byte)this.bI);
                            break;
                        }
                        case 19: {
                            this.c((byte)this.bI);
                            break;
                        }
                        case 10: {
                            break;
                        }
                        case 47: {
                            v1 = this;
                            ** GOTO lbl197
                        }
                        case 9: {
                            this.aA();
                            if ((i.var_int_arr_arr_b[this.bG][this.bH] & 0xFC00000) != 0x8400000) break;
                            this.bN += this.var_int_aj;
                            this.bO += this.var_int_ak;
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 1: {
                            if ((i.var_int_arr_arr_b[this.bG][this.bH] & -2147483648) == 0 && this.bR == 0) break;
                            v1 = this;
                            ** GOTO lbl197
                        }
                        case 0: {
                            if ((i.var_int_arr_arr_b[this.bG][this.bH] & -2147483648) == 0) break;
                            ** GOTO lbl195
                        }
                        case 6: {
                            break;
                        }
                        case 7: {
                            break;
                        }
lbl195:
                        // 2 sources

                        case 8: {
                            v1 = this;
lbl197:
                            // 3 sources

                            v1.aA();
                        }
                    }
                }
                if (this.aG != -1) {
                    if (i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aG] == null) {
                        i.var_a_arr_a[i.int_a(this.aG)].a(var1_1, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                    } else {
                        var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                    }
                    this.aG = -1;
                    this.bP = 0;
                } else {
                    if (i.var_a_b == null) continue;
                    if (this.bG == this.co && this.bH == this.cp) {
                        i.var_a_c = i.var_a_b;
                        this.ct = this.bK;
                        this.cs = this.bL;
                        this.cr = this.bx + this.bN;
                        this.cq = this.by + this.bO;
                    }
                    if (this.bK != -1) {
                        i.var_a_b.a(var1_1, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                        this.bK = -1;
                    } else {
                        i.var_a_b.a(var1_1, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                    }
                    i.var_a_b = null;
                    this.bM = 0;
                }
                this.bO = 0;
                this.bN = 0;
            }
        }
    }

    private void W() {
        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 240);
    }

    /*
     * Unable to fully structure code
     */
    private void X() {
        var1_1 = this.var_javax_microedition_lcdui_Graphics_a;
        var2_2 = i.aN;
        this.bQ = (this.aS & 4096) == 0 ? this.var_byte_k : 0;
        var1_1.translate(0, 40);
        this.bk = 0;
        this.W();
        if (this.bj > 0) {
            this.bk = this.bj * var2_2 % ((this.bj >> 1) + 1) % 12;
        }
        if (this.bk > this.var_int_as) {
            this.bk = this.var_int_as;
        }
        this.var_int_as -= this.bk;
        this.cI = this.var_int_ar / 24;
        this.cJ = this.var_int_as / 24;
        this.cK = this.var_int_ar % 24;
        this.cL = this.var_int_as % 24;
        this.bR = (var2_2 & 63) >> 1;
        if (this.bR >= 4) {
            this.bR = 0;
        }
        var3_3 = this.var_int_ar - this.cK;
        var4_4 = this.var_int_as - this.cL;
        var5_5 = this.var_int_ar + i.cC - 24 - (this.var_int_ar + i.cC - 24) % 24;
        var6_6 = this.var_int_as + i.cD - 24 - (this.var_int_as + i.cD - 24) % 24;
        if (i.cE == -1) {
            this.void_a(var3_3, var4_4, var5_5, var6_6, false);
            i.cE = var3_3;
            i.cF = var5_5;
            i.cG = var4_4;
            i.cH = var6_6;
        }
        if (i.cE != var3_3) {
            if (i.cE < var3_3) {
                var7_9 = i.cF + 24;
                v0 = var5_5;
            } else {
                var7_9 = var3_3;
                v0 = i.cE - 24;
            }
            var8_10 = v0;
            this.void_a(var7_9, var4_4, var8_10, var6_6, false);
            i.cE = var3_3;
            i.cF = var5_5;
        }
        if (i.cG != var4_4) {
            if (i.cG < var4_4) {
                var7_9 = i.cH + 24;
                v1 = var6_6;
            } else {
                var7_9 = var4_4;
                v1 = i.cG - 24;
            }
            var8_10 = v1;
            this.void_a(var3_3, var7_9, var5_5, var8_10, false);
            i.cG = var4_4;
            i.cH = var6_6;
        }
        this.b(var1_1);
        this.W();
        this.c(var1_1);
        if (i.var_boolean_D) {
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 240, 320);
            this.az();
            if (i.var_javax_microedition_lcdui_Image_e != null) {
                var1_1.drawImage(i.var_javax_microedition_lcdui_Image_e, i.cM, i.cN, i.cO);
            }
            if (this.var_int_S != this.var_int_T) {
                v2 = var3_3 = this.var_int_S;
                while (v2 != this.var_int_T) {
                    var4_4 = i.var_byte_arr_a[var3_3 << 1] * 24 - this.var_int_ar;
                    var5_5 = i.var_byte_arr_a[(var3_3 << 1) + 1] * 24 - this.var_int_as;
                    if (i.var_byte_arr_c[var3_3] < 0) {
                        v3 = i.var_a_arr_a[2];
                        v4 = var1_1;
                        v5 = 0;
                        v6 = i.a(var6_7, 0, (int)i.var_byte_arr_b[var3_3]);
                    } else {
                        v3 = i.var_a_arr_a[9];
                        v4 = var1_1;
                        v5 = i.var_byte_arr_c[var3_3];
                        v6 = i.var_byte_arr_b[var3_3];
                    }
                    v3.a(v4, v5, v6, var4_4, var5_5, 0, 0, 0);
                    v2 = ++var3_3 & 7;
                }
            }
            this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
            var1_1.translate(0, -40);
            this.ah();
            return;
        }
        this.az();
        if (this.var_boolean_j) {
            this.void_d(this.cK, this.cL);
        }
        if (i.var_javax_microedition_lcdui_Image_e != null) {
            var1_1.drawImage(i.var_javax_microedition_lcdui_Image_e, i.cM, i.cN, i.cO);
        }
        if (this.var_int_al > 0) {
            this.Y();
        }
        if (this.var_byte_i != 0) {
            this.ap();
        }
        for (var3_3 = -1; var3_3 < 12; ++var3_3) {
            for (var4_4 = -1; var4_4 < 12; ++var4_4) {
                block60: {
                    block59: {
                        block58: {
                            var7_9 = var4_4 + this.cI;
                            var8_10 = var3_3 + this.cJ;
                            if (var7_9 < 0 || var7_9 >= this.var_int_av || var8_10 < 0 || var8_10 >= this.var_int_aw) continue;
                            var5_5 = i.var_int_arr_arr_a[var7_9][var8_10] & 255;
                            var6_6 = i.var_byte_arr_arr_a[var7_9][var8_10];
                            if (var5_5 >= 38 && var5_5 < 80) continue;
                            var10_11 = var4_4 * 24 - this.cK;
                            var11_12 = var3_3 * 24 - this.cL;
                            if (var5_5 < 20 || var5_5 >= 26) break block58;
                            var12_13 = var5_5 - 20;
                            v7 = i.var_a_arr_a[3];
                            v8 = var1_1;
                            v9 = var12_13;
                            v10 = (var2_2 >> 2) % (i.var_a_arr_a[3].var_byte_arr_e[var12_13] & 255);
                            break block59;
                        }
                        switch (var5_5) {
                            case 36: {
                                var12_13 = (i.var_int_arr_arr_a[var7_9][var8_10] >> 8) - 1;
                                var12_13 = (0 + var12_13 * 7) / 16;
                                i.var_a_arr_a[20].a(var1_1, 0, var12_13, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            case 31: {
                                var13_14 = i.var_int_arr_arr_a[var7_9][var8_10] >> 8;
                                var14_15 = i.var_a_arr_a[15];
                                var15_16 = (i.aN >> 1) % (var14_15.var_byte_arr_e[var13_14] & 255);
                                var14_15.a(this.var_javax_microedition_lcdui_Graphics_a, var13_14, var15_16, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            case 32: {
                                i.var_a_arr_a[16].a(this.var_javax_microedition_lcdui_Graphics_a, 0, i.var_int_arr_arr_a[var7_9][var8_10] >> 8 & 255, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            default: {
                                var16_17 = (byte)(var5_5 - 80);
                                if (var16_17 < 0) break;
                                i.var_a_arr_a[42].a(var1_1, var16_17, var10_11, var11_12, 0, 0, 0);
                            }
                        }
                        var12_13 = (i.var_int_arr_arr_a[var7_9][var8_10] & -268435456) >> 28;
                        if (var12_13 <= 0) break block60;
                        v7 = i.var_a_arr_a[13];
                        v8 = var1_1;
                        v9 = 0;
                        v10 = var12_13;
                    }
                    v7.a(v8, v9, v10, var10_11, var11_12, 0, 0, 0);
                }
                if (var6_6 != 54) continue;
                i.var_a_arr_a[7].a(var1_1, 0, i.a(i.var_a_arr_a[7], 0, i.var_int_arr_arr_b[var7_9][var8_10]), var10_11, var11_12, 0, 0, 0);
            }
        }
        if (this.var_boolean_y) {
            var3_3 = (this.bB - this.cI) * 24 - this.cK + this.bz;
            var4_4 = (this.bC - this.cJ + 1) * 24 - this.cL + this.bA;
            var1_1.drawImage(i.var_a_arr_a[13].var_javax_microedition_lcdui_Image_arr_arr_a[0][0 + this.bD], var3_3, var4_4, 0);
            this.var_boolean_y = false;
        }
        if (this.ay != -1) {
            var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[13][0], this.bv + -12, this.bw + -24 + 2, 3);
            var1_1.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[this.ay][this.az], this.bv + -12, this.bw + -24, 3);
        }
        if (this.var_int_S != this.var_int_T) {
            v11 = var3_3 = this.var_int_S;
            while (v11 != this.var_int_T) {
                var4_4 = i.var_byte_arr_a[var3_3 << 1] * 24 - this.var_int_ar;
                var5_5 = i.var_byte_arr_a[(var3_3 << 1) + 1] * 24 - this.var_int_as;
                if (i.var_byte_arr_c[var3_3] < 0) {
                    v12 = i.var_a_arr_a[2];
                    v13 = var1_1;
                    v14 = 0;
                    v15 = i.a(var6_8, 0, (int)i.var_byte_arr_b[var3_3]);
                } else {
                    v12 = i.var_a_arr_a[9];
                    v13 = var1_1;
                    v14 = i.var_byte_arr_c[var3_3];
                    v15 = i.var_byte_arr_b[var3_3];
                }
                v12.a(v13, v14, v15, var4_4, var5_5, 0, 0, 0);
                v11 = ++var3_3 & 7;
            }
        }
        this.var_int_as += this.bk;
        if (this.var_boolean_v) {
            i.a(var1_1, i.var_a_arr_a[41], i.var_java_lang_String_arr_a[40], 120, 160, 17, 19, false);
        }
        if (this.bn > i.aN && this.var_byte_i != 2) {
            if (!this.var_boolean_aj && !this.var_boolean_f) {
                var3_3 = this.bn - i.aN;
                var4_4 = var3_3 < 20 ? (var3_3 - 10) * 240 / 20 : (var3_3 >= 50 ? (60 - var3_3) * 240 / 15 : 120);
                var5_5 = 240 - var4_4;
                i.a(var1_1, i.var_a_arr_a[41], i.var_java_lang_String_arr_a[i.var_int_arr_d[this.var_int_ap]], var4_4, 15, 17, 20, false);
                i.a(var1_1, i.var_a_arr_a[41], i.var_java_lang_String_arr_a[i.var_int_arr_arr_g[this.var_int_ap][this.var_int_aq]], var5_5, 50, 17, 20, false);
                if (this.var_int_P > 0) {
                    i.a(var1_1, i.var_a_arr_a[41], this.var_java_lang_String_d, 120, 190, 17, 5, true);
                }
            }
        } else if (this.var_int_Z > i.aN && this.var_byte_r <= 2) {
            i.a(var1_1, i.var_a_arr_a[41], i.var_java_lang_String_arr_a[36], 120, 230, 33, 20, false);
        } else if (this.var_int_Z == i.aN && this.var_byte_r <= 2) {
            this.var_byte_r = (byte)(this.var_byte_r + 1);
            this.J();
        }
        switch (this.var_byte_i) {
            case 4: {
                this.at();
                break;
            }
            case 3: {
                if (this.var_int_ad == -1 || this.var_int_ad == 15) break;
                v16 = this;
                v17 = var1_1;
                v18 = 5;
                ** GOTO lbl201
            }
            case 5: {
                if (this.var_int_ad == -1 || this.var_int_ad == 15 || this.var_int_ad == 13 || this.var_int_ad == 12) break;
                v16 = this;
                v17 = var1_1;
                v18 = 4;
lbl201:
                // 2 sources

                v16.a(v17, v18);
            }
        }
        var1_1.translate(0, -40);
        var1_1.setClip(0, 0, 240, 320);
        if (this.var_c_a == null) {
            this.ah();
        }
        if (this.var_java_lang_String_e != null) {
            this.var_boolean_m = true;
            i.a(var1_1, i.var_a_arr_a[41], this.var_java_lang_String_e, 120, 263, 33, 4, true);
        }
        if (this.var_c_a != null && !i.var_boolean_D) {
            this.var_boolean_m = true;
            this.var_c_a.a(var1_1);
        }
        if (this.bl > 0) {
            this.var_boolean_m = true;
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 240, this.bl);
            var1_1.fillRect(0, 320 - this.bl, 240, this.bl);
            var1_1.translate(0, 40);
            this.az();
            if (i.var_javax_microedition_lcdui_Image_e != null) {
                var1_1.drawImage(i.var_javax_microedition_lcdui_Image_e, i.cM, i.cN, i.cO);
            }
            if (i.var_a_c != null) {
                if (this.ct != -1) {
                    i.var_a_c.a(var1_1, this.ct, this.cs, (this.co - this.cI) * 24 - this.cK, (this.cp - this.cJ) * 24 - this.cL, this.bM, 0, 0);
                } else {
                    i.var_a_c.a(var1_1, this.cs, this.cr, this.cq, this.bM, 0, 0);
                }
            }
            var1_1.translate(0, -40);
        }
    }

    private void Y() {
        int n = this.var_int_as - 24;
        int n2 = this.var_int_as + 320;
        int n3 = this.var_int_ar;
        int n4 = this.var_int_ar + 240;
        int n5 = (aN >> 1) % var_a_arr_a[2].int_a(1);
        for (int j = 0; j < var_byte_arr_e.length; j += 3) {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            Graphics graphics;
            a a2;
            byte by = 0;
            byte by2 = var_byte_arr_e[j + 2];
            int n11 = by2 * 24;
            if (n11 <= n || n11 >= n2) continue;
            byte by3 = var_byte_arr_e[j + 0];
            byte by4 = var_byte_arr_e[j + 1];
            int n12 = by3 * 24;
            int n13 = by4 * 24 + 24;
            if (!(n12 >= n3 && n12 <= n4 || n13 >= n3 && n13 <= n4) && (n12 > n3 || n13 < n4)) continue;
            int n14 = n12 - n3;
            int n15 = by3 + (by3 != 0 ? -1 : 0);
            boolean bl = true;
            if (var_byte_arr_arr_a[n15][by2] == 48 && (var_int_arr_arr_b[n15][by2] & 8) != 0) {
                n14 -= 12;
                bl = false;
                if ((var_int_arr_arr_b[n15][by2 + 1] & 7) == 3) {
                    by = -var_byte_arr_arr_b[n15][by2 + 1];
                } else {
                    n14 -= -var_byte_arr_arr_b[n15][by2 + 1];
                }
            }
            int n16 = n13 - n3;
            n15 = by4 + (by4 < this.var_int_av - 1 ? (byte)1 : 0);
            boolean bl2 = true;
            if (var_byte_arr_arr_a[n15][by2] == 48 && (var_int_arr_arr_b[n15][by2] & 8) != 0) {
                n16 += 12;
                bl2 = false;
                if ((var_int_arr_arr_b[n15][by2 + 1] & 7) == 3) {
                    by = -var_byte_arr_arr_b[n15][by2 + 1];
                } else {
                    n16 += -var_byte_arr_arr_b[n15][by2 + 1];
                }
            }
            int n17 = n11 - this.var_int_as + 10 + by;
            this.var_javax_microedition_lcdui_Graphics_a.setColor(1820159);
            this.var_javax_microedition_lcdui_Graphics_a.drawLine(n14, n17, n16, n17);
            this.var_javax_microedition_lcdui_Graphics_a.drawLine(n14, n17 += 2, n16, n17);
            this.var_javax_microedition_lcdui_Graphics_a.setColor(14153215);
            this.var_javax_microedition_lcdui_Graphics_a.drawLine(n14, --n17, n16, n17);
            if (bl) {
                a2 = var_a_arr_a[2];
                graphics = this.var_javax_microedition_lcdui_Graphics_a;
                n10 = 1;
                n9 = n5;
                n8 = n14;
                n7 = n17;
                n6 = 1;
            } else {
                if (!bl2) continue;
                a2 = var_a_arr_a[2];
                graphics = this.var_javax_microedition_lcdui_Graphics_a;
                n10 = 1;
                n9 = n5;
                n8 = n16;
                n7 = n17;
                n6 = 0;
            }
            a2.a(graphics, n10, n9, n8, n7, n6, 0, 0);
        }
    }

    private void Z() {
        int n = var_int_arr_arr_b[this.bG][this.bH];
        if ((n & 8) == 0) {
            int n2;
            i i2;
            var_a_b = var_a_arr_a[32];
            int n3 = n & 7;
            boolean bl = (n & 0x10) == 0;
            if (bl && n3 == 2 || !bl && n3 == 4) {
                i2 = this;
                n2 = 2;
            } else {
                i2 = this;
                n2 = bl ? 1 : 0;
            }
            i2.bL = n2;
            byte by = var_byte_arr_arr_b[this.bG][this.bH];
            this.bN = by * var_byte_arr_g[n3];
            this.bO = by * var_byte_arr_g[n3 + 8];
        }
    }

    private void aa() {
        if ((var_int_arr_arr_b[this.bG][this.bH] & 7) == 1 && (var_int_arr_arr_a[this.bG][this.bH] & 0xFF) == 35) {
            this.bN = 0;
            this.bO = var_byte_arr_arr_b[this.bG][this.bH];
        }
    }

    private void ab() {
        var_a_b = var_a_arr_a[30];
        this.bK = 1;
        this.bL = i.a(var_a_b, 1, aN % i.a(var_a_b, 1));
    }

    /*
     * Unable to fully structure code
     */
    private void ac() {
        block11: {
            block10: {
                var1_1 = i.var_int_arr_arr_b[this.bG][this.bH] & 7;
                i.var_a_b = i.var_a_arr_a[29];
                if ((i.var_int_arr_arr_b[this.bG][this.bH] & 8) != 0) break block10;
                switch (var1_1) {
                    case 1: {
                        v0 = this;
                        v1 = 2;
                        ** GOTO lbl16
                    }
                    case 2: {
                        v0 = this;
                        v1 = 1;
                        ** GOTO lbl16
                    }
                    case 4: {
                        v0 = this;
                        v1 = 0;
lbl16:
                        // 3 sources

                        v0.bL = v1;
                    }
                }
                this.bN = i.var_byte_arr_arr_b[this.bG][this.bH] * i.var_byte_arr_g[var1_1];
                v2 = this;
                v3 = i.var_byte_arr_arr_b[this.bG][this.bH] * i.var_byte_arr_g[8 + var1_1];
                break block11;
            }
            switch (var1_1) {
                case 1: {
                    v4 = this;
                    v5 = 14;
                    ** GOTO lbl34
                }
                case 2: {
                    v4 = this;
                    v5 = 13;
                    ** GOTO lbl34
                }
                case 4: {
                    v4 = this;
                    v5 = 12;
lbl34:
                    // 3 sources

                    v4.bK = v5;
                }
            }
            this.bL = i.a(i.var_a_b, this.bK, (int)i.var_byte_arr_arr_b[this.bG][this.bH]);
            var2_2 = (i.var_a_b.var_short_arr_b[this.bK] + this.bL) * 5;
            this.bN = i.var_a_b.var_byte_arr_f[var2_2 + 2];
            v2 = this;
            v3 = i.var_a_b.var_byte_arr_f[var2_2 + 3];
        }
        v2.bO = v3;
    }

    private void ad() {
        int n;
        i i2;
        var_a_b = var_a_arr_a[29];
        this.bK = var_int_arr_arr_b[this.bG][this.bH] & 0x1F;
        if (this.bK == 8 || this.bK == 9) {
            this.bL = 0;
            int n2 = (i.var_a_b.var_short_arr_b[this.bK] + 0) * 5;
            this.bN = i.var_a_b.var_byte_arr_f[n2 + 2];
            i2 = this;
            n = -var_byte_arr_arr_b[this.bG][this.bH];
        } else {
            int n3;
            int n4 = (var_int_arr_arr_b[this.bG][this.bH] & 0x1FE0) >> 5;
            this.bL = n3 = i.a(var_a_b, this.bK, n4);
            int n5 = (i.var_a_b.var_short_arr_b[this.bK] + n3) * 5;
            this.bN = i.var_a_b.var_byte_arr_f[n5 + 2];
            i2 = this;
            n = i.var_a_b.var_byte_arr_f[n5 + 3];
        }
        i2.bO = n;
    }

    private void ae() {
        int n;
        this.bK = (var_int_arr_arr_b[this.bG][this.bH] & 0x38) >> 3;
        var_a_b = var_a_arr_a[27];
        switch (this.bK) {
            case 3: {
                this.bL = 0;
                this.bO = -var_byte_arr_arr_b[this.bG][this.bH];
                return;
            }
            case 1: {
                i i2 = this;
                n = (var_byte_arr_arr_b[this.bG][this.bH] >> 1) % var_a_arr_a[27].int_a(1);
                break;
            }
            default: {
                i i2 = this;
                n = var_byte_arr_arr_b[this.bG][this.bH];
            }
        }
        i2.bL = n;
    }

    private void af() {
        this.void_a(this.bx, this.by, false);
    }

    private void void_a(int n, int n2, boolean bl) {
        Image[] imageArray = var_javax_microedition_lcdui_Image_arr_arr_a[18];
        int n3 = 0;
        if (bl) {
            n3 = -5;
        }
        this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[1], n + 6, n2 + n3, 0);
        this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[0], n + 3, n2 + 7, 0);
        if (!bl) {
            int n4 = 0;
            if (this.var_int_P < 10) {
                n4 = i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0][0].getWidth() >> 1;
                ++n4;
            }
            i.a(this.var_javax_microedition_lcdui_Graphics_a, n + 19 - n4, n2 + 13, this.var_int_P, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void void_d(int var1_1, int var2_2) {
        var3_3 = this.var_javax_microedition_lcdui_Graphics_a;
        for (var4_4 = 0; var4_4 < 12; ++var4_4) {
            for (var5_5 = 0; var5_5 < 12; ++var5_5) {
                var7_7 = var5_5 + this.var_int_ar / 24;
                var8_8 = var4_4 + this.var_int_as / 24;
                if (var7_7 < 0 || var7_7 >= this.var_int_av || var8_8 < 0 || var8_8 >= this.var_int_aw) continue;
                var6_6 = i.var_int_arr_arr_e[var7_7][var8_8];
                var10_9 = var5_5 * 24 - var1_1;
                var11_10 = var4_4 * 24 - var2_2;
                var12_11 = 0;
                if (var6_6 <= 0) continue;
                var13_12 = 0;
                v0 = var13_12;
                while (v0 <= 2) {
                    block7: {
                        block9: {
                            block8: {
                                if (i.int_a(var6_6, var13_12, (byte)0, (byte)3) == 0) break block7;
                                var12_11 = (byte)(i.int_a(var6_6, var13_12, (byte)7, (byte)2) << 3);
                                if (var12_11 > 0) {
                                    var14_13 = i.int_a(var6_6, var13_12, (byte)0, (byte)3);
                                    var15_14 = i.int_a(var14_13, (byte)45, (byte)2);
                                    var12_11 = var15_14 <= 1 ? (var12_11 = (byte)(var12_11 - 24)) : (byte)(24 - var12_11);
                                    this.W();
                                    var3_3.clipRect(var10_9, var11_10 + (var13_12 << 3), 24, 8);
                                }
                                var16_15 = ((var15_14 = (var14_13 = this.a(var7_7, var8_8, var6_6, var13_12)) >> 1) == 7 ? i.aN >> 3 : i.aN) & 1;
                                if (var15_14 != 15) break block8;
                                i.var_a_d.a(var3_3, var14_13 + this.cB, var10_9 + var12_11 - 8, var11_10 + (var13_12 << 3) + 8, 36, 0, 0);
                                ++this.cB;
                                if (this.cB > 2) {
                                    this.cB = 0;
                                }
                                break block7;
                            }
                            if (var15_14 != 14 && var15_14 != 11) break block9;
                            v1 = i.var_a_d;
                            v2 = var3_3;
                            v3 = var14_13 + var16_15;
                            v4 = var10_9 + var12_11;
                            v5 = var11_10;
                            ** GOTO lbl48
                        }
                        if (var15_14 == 8 && var13_12 == 0 && i.var_int_arr_arr_e[var7_7][var8_8 - 1] > 0) {
                            i.var_a_d.a(var3_3, 33, var10_9 + var12_11, var11_10, 20, 0, 0);
                            var13_12 = 3;
                        } else {
                            v1 = i.var_a_d;
                            v2 = var3_3;
                            v3 = var14_13 + var16_15;
                            v4 = var10_9 + var12_11;
                            v5 = var11_10 + (var13_12 << 3);
lbl48:
                            // 2 sources

                            v1.a(v2, v3, v4, v5, 20, 0, 0);
                            this.W();
                        }
                    }
                    v0 = (byte)(var13_12 + 1);
                }
            }
        }
    }

    private void ag() {
        int n;
        i i2;
        this.aE = 20;
        if (var_int_arr_arr_a[this.bG][this.bH] >> 8 >= this.var_int_ax) {
            i2 = this;
            n = 0 + (aN >> 1) % 7;
        } else {
            i2 = this;
            n = 7;
        }
        i2.aF = n;
    }

    private void l(int n) {
        int n2;
        int n3 = var_int_arr_arr_a[this.bG][this.bH] >> 8;
        if (n3 == 255) {
            n3 = 0;
        }
        int n4 = n2 = 14 == n ? 8 : 22;
        if (var_a_arr_a[n2] != null) {
            var_a_arr_a[n2].a(this.var_javax_microedition_lcdui_Graphics_a, 0, n3, this.bx, this.by, 0, 0, 0);
        }
    }

    private void ah() {
        a a2;
        boolean bl = false;
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        a a3 = var_a_arr_a[0];
        if (a3 == null) {
            return;
        }
        graphics.translate(120, 320);
        if (this.var_boolean_m || var_byte_l == 2) {
            a3.a(graphics, 0, 0, 0, 0, 0, 0);
            if (this.var_boolean_T) {
                a3.a(graphics, 19, 0, 0, 0, 0, 0);
            }
            a2 = a3;
        } else {
            bl = true;
            graphics.setClip(-120, -320, 240, 320);
            a2 = a3;
        }
        a2.a(graphics, 1, 0, 0, 0, 0, 0);
        if (this.var_boolean_n) {
            a3.a(graphics, 2, 0, 0, 0, 0, 0);
            a3.a(graphics, 3 + this.var_int_ac, 0, 0, 0, 0, 0);
        }
        if (bl) {
            graphics.setClip(-120, -320, 240, 320);
        }
        if (this.var_int_P > 0) {
            this.var_long_h = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - this.var_long_h < 1500L) {
            i.a(graphics, var_a_arr_a[41], var_java_lang_String_arr_a[34], 0, -55, 33, 5, true);
        }
        if (this.var_byte_n != this.cP || this.var_boolean_m || this.var_byte_n <= 1) {
            Image[] imageArray = i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0];
            int n = 0;
            int n2 = this.var_byte_n <= 1 ? 1 : 0;
            int n3 = -11 - (var_byte_arr_i[8] - 4) * imageArray[11 + n2].getWidth() / 2;
            graphics.drawImage(imageArray[11 + n2], n3, -29, 0);
            n = 0 + imageArray[11 + n2].getWidth();
            int n4 = imageArray[15].getWidth();
            for (int j = 0; j < var_byte_arr_i[8]; ++j) {
                int n5;
                Image[] imageArray2;
                Graphics graphics2;
                if (this.var_byte_n <= 1 && j == 0 && (aN >> 2 & 1) == 0 || j < this.var_byte_n && this.var_byte_n > 1) {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 15;
                } else {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 13;
                }
                graphics2.drawImage(imageArray2[n5 + n2], n3 + n, -29, 0);
                n += n4;
            }
            graphics.drawImage(imageArray[17 + n2], n3 + n, -29, 0);
            this.cP = this.var_byte_n;
        }
        if (this.cQ != this.aZ || this.cT != this.var_int_P || this.var_boolean_m) {
            if (this.var_int_P > 0) {
                i.a(graphics, 70, -12, "" + this.aZ + "/" + (this.var_int_P + this.aZ), i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
            } else {
                i.a(graphics, 70, -12, this.aZ, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
            }
        }
        if (this.cR != this.bb || this.var_boolean_m) {
            this.cR = this.bb;
            i.a(graphics, 107, -12, this.bb, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
        }
        if (this.cS != this.var_int_ao || this.var_boolean_m) {
            this.cS = this.var_int_ao;
            i.a(graphics, -25, -12, this.var_int_ao, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
        }
        graphics.translate(-120, -320);
        graphics.translate(120, 0);
        if (this.var_boolean_m || var_byte_l == 2) {
            a3.a(graphics, 20, 0, 0, 0, 0, 0);
        }
        if (this.cQ != this.aZ || this.cT != this.var_int_P || this.var_boolean_m) {
            this.void_a(-53, 8, this.var_int_P <= 0);
        }
        if (this.cU != this.aU || this.cV != this.aV || this.var_boolean_m || var_byte_l == 2) {
            a3.a(graphics, 21, 0, 0, 0, 0, 0);
            i.a(graphics, 55, 15, this.aU, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
            i.a(graphics, 87, 15, this.aV, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
            this.cU = this.aU;
            this.cV = this.aV;
        }
        graphics.translate(-120, 0);
        this.cQ = this.aZ;
        this.cT = this.var_int_P;
        this.var_boolean_m = false;
    }

    private void ai() {
        int n;
        i i2;
        var_a_b = var_a_arr_a[6];
        this.bK = 0;
        if (this.ce == 0) {
            i2 = this;
            n = 0;
        } else if (this.ce == 9) {
            i2 = this;
            n = 2;
        } else {
            i2 = this;
            n = this.cf < 0 ? 1 : 3;
        }
        i2.bL = n;
    }

    private void aj() {
        int n = var_int_arr_arr_b[this.bG][this.bH] == 1 ? 1 : 0;
        a a2 = var_a_arr_a[5];
        a2.a(this.var_javax_microedition_lcdui_Graphics_a, n, (aN >> 1) % a2.int_a(n), this.bx, this.by, 0, 0, 0);
    }

    private void b(byte by) {
        g g2 = var_g_arr_a[4];
        if (by == 23) {
            g2.var_int_a = this.bx;
            g2.e |= 1;
        } else {
            g2.e &= 0xFFFFFFFE;
            g2.var_int_a = this.bx + 24;
        }
        g2.b = this.by;
        g2.void_a();
        g2.a(this.var_javax_microedition_lcdui_Graphics_a);
    }

    private void m(int n) {
        switch (n) {
            case 0: {
                i.cL();
                System.gc();
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                i.var_a_arr_a[41].var_int_e = 15;
                return;
            }
            case 3: {
                return;
            }
            case 4: {
                return;
            }
            case 5: {
                return;
            }
            case 6: {
                if (var_javax_microedition_lcdui_Image_a == null) {
                    var_javax_microedition_lcdui_Image_a = i.javax_microedition_lcdui_Image_a("/spl.f", 0);
                }
                if (var_javax_microedition_lcdui_Image_b == null) {
                    var_javax_microedition_lcdui_Image_b = i.javax_microedition_lcdui_Image_a("/spl.f", 1);
                }
                if (var_javax_microedition_lcdui_Image_c != null) break;
                var_javax_microedition_lcdui_Image_c = i.javax_microedition_lcdui_Image_a("/spl.f", 2);
                return;
            }
            case 7: {
                if (var_a_arr_a[18] != null) break;
                i.var_a_arr_a[18] = i.a_a("/ui.f", 3);
            }
        }
    }

    private static void ak() {
        var_javax_microedition_lcdui_Image_a = null;
        var_javax_microedition_lcdui_Image_b = null;
        var_javax_microedition_lcdui_Image_c = null;
        var_javax_microedition_lcdui_Image_g = null;
        var_javax_microedition_lcdui_Image_f = null;
        var_javax_microedition_lcdui_Graphics_c = null;
        System.gc();
    }

    private void al() {
        this.cX = var_short_arr_arr_a[this.bo].length >> 1;
        this.cY = 0;
        for (int j = 0; j < this.cX; ++j) {
            int n = i.a(var_a_arr_a[41], var_java_lang_String_arr_a[var_short_arr_arr_a[this.bo][j * 2 + 1]], 0);
            if (this.bo == 0 && j == 3 || n <= this.cY) continue;
            this.cY = n;
        }
        this.db = 0;
        this.cW = 0;
    }

    private void void_e(int n, int n2) {
        if (var_byte_l == 4) {
            this.b(this.var_javax_microedition_lcdui_Graphics_a, false);
            for (int j = n - 1; j < n2 - 2; ++j) {
                var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 4, j % 2, j, 0, 0, 0);
            }
        }
        if (var_byte_l == 2) {
            this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
            this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, n - 1, 240, n2 - 2 - (n - 1));
        }
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0xFFFFFF);
        this.var_javax_microedition_lcdui_Graphics_a.drawLine(0, n - 1 - 1, 240, n - 1 - 1);
        this.var_javax_microedition_lcdui_Graphics_a.drawLine(0, n2 - 1, 240, n2 - 1);
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
        this.var_javax_microedition_lcdui_Graphics_a.drawLine(0, n - 1 - 2, 240, n - 1 - 2);
        this.var_javax_microedition_lcdui_Graphics_a.drawLine(0, n2 - 2, 240, n2 - 2);
    }

    private void am() {
        this.var_boolean_X = false;
        this.var_boolean_W = i.boolean_a();
    }

    private void an() {
        int n;
        i i2;
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.var_boolean_X) {
            this.am();
        }
        int n6 = 320 - (this.cX * 15 + 1 + 2);
        n6 += !this.var_boolean_W && this.bo == 0 ? 15 : 0;
        int n7 = 320;
        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
        if (var_byte_l == 2 && var_boolean_U && var_boolean_V) {
            this.var_boolean_T = false;
            this.X();
            this.var_boolean_T = true;
            var_boolean_V = false;
        }
        if (var_byte_l == 7 || var_byte_l == 2) {
            n5 = n6 - (160 - (320 - n6) / 2);
            n6 -= n5;
            n7 = 320 - n5;
        }
        if (this.bo == 7) {
            var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[this.aM == 5 ? 102 : 113], 120, n6 - 20, 17);
        }
        if (var_byte_l == 7) {
            int n8;
            int n9;
            int n10;
            int n11;
            Graphics graphics;
            if (this.de != -1 && !var_boolean_U) {
                n5 = n6 + this.de * 15;
                this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
                graphics = this.var_javax_microedition_lcdui_Graphics_a;
                n11 = 0;
                n10 = n5;
                n9 = 240;
                n8 = 16;
            } else {
                this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
                graphics = this.var_javax_microedition_lcdui_Graphics_a;
                n11 = 0;
                n10 = 0;
                n9 = 240;
                n8 = 320;
            }
            graphics.fillRect(n11, n10, n9, n8);
        }
        long l = System.currentTimeMillis();
        if (this.dd >= 0 && l - this.var_long_i > 100L) {
            ++this.dd;
            this.var_long_i = l;
        }
        if (this.de != -1 && !var_boolean_U) {
            n4 = this.bo == 0 && this.de > 1 && !this.var_boolean_W ? 15 : 0;
            n3 = n6 + this.de * 15 - n4;
            this.var_javax_microedition_lcdui_Graphics_a.setClip(0, n3, 240, 16);
        }
        if (this.de != this.bq || var_boolean_U) {
            this.void_e(n6, n7);
        }
        for (n4 = 0; n4 < this.cX; ++n4) {
            int n12;
            int n13;
            int n14;
            block36: {
                int n15;
                int n16;
                int n17;
                int n18;
                Graphics graphics;
                block35: {
                    int n19;
                    Graphics graphics2;
                    block34: {
                        block32: {
                            block33: {
                                if (this.de != -1 && n4 != this.de && n4 != this.bq && !var_boolean_U || this.bo == 0 && n4 == 1 && !this.var_boolean_W) continue;
                                n3 = n6 + n4 * 15;
                                n14 = n3 + 7;
                                if (this.bo == 0 && n4 > 1 && !this.var_boolean_W) {
                                    n3 -= 15;
                                    n14 -= 15;
                                }
                                n2 = 0;
                                if (n4 == 2 && this.bo == 0) {
                                    n2 = 1;
                                }
                                if (this.var_byte_i != 2 || n4 != 4 || this.bo != 1) break block32;
                                n2 = 0;
                                if (n4 != this.bq) break block33;
                                graphics2 = this.var_javax_microedition_lcdui_Graphics_a;
                                n19 = 0x666666;
                                break block34;
                            }
                            this.var_javax_microedition_lcdui_Graphics_a.setColor(0xCCCCCC);
                            graphics = this.var_javax_microedition_lcdui_Graphics_a;
                            n18 = 0;
                            n17 = n14 - 7 + 1;
                            n16 = 240;
                            n15 = 14;
                            break block35;
                        }
                        if (n4 != this.bq) break block36;
                        graphics2 = this.var_javax_microedition_lcdui_Graphics_a;
                        n19 = 13540096;
                    }
                    graphics2.setColor(n19);
                    graphics = this.var_javax_microedition_lcdui_Graphics_a;
                    n18 = 0;
                    n17 = n14 - 7;
                    n16 = 240;
                    n15 = 16;
                }
                graphics.fillRect(n18, n17, n16, n15);
            }
            int n20 = 0;
            boolean bl = false;
            var_a_arr_a[41].void_a(var_java_lang_String_arr_a[var_short_arr_arr_a[this.bo][n4 * 2 + 1]]);
            int n21 = n13 = a.var_int_c;
            int n22 = n12 = n4 == 2 && this.bo == 0 ? 152 : 210;
            if (n13 > n12) {
                bl = true;
                n13 = n12;
            }
            int n23 = 120 - n13 / 2;
            if (bl) {
                n20 = n4 == this.bq ? this.da : 0;
                this.var_javax_microedition_lcdui_Graphics_a.setClip(n23, n3, n13, 15);
            }
            i.var_a_arr_a[41].var_int_b = n2;
            var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[var_short_arr_arr_a[this.bo][n4 * 2 + 1]], 120 - n13 / 2 - n20, n14 + 1, 6);
            if (bl) {
                this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
            }
            if (n4 == this.bq) {
                this.var_javax_microedition_lcdui_Graphics_a.setColor(0xFFFFFF);
                var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 2, 120 - n13 / 2 - 8, n14, 0, 0, 10);
                var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 2, 120 + n13 / 2 + 8, n14, 0, 0, 6);
            }
            if (n4 != this.bq || !bl || this.cW % 2 != 0) continue;
            this.da += this.cZ;
            if (this.da >= -5 && this.da + n12 - 5 <= n21) continue;
            this.cZ = -this.cZ;
            this.da += this.cZ;
        }
        this.de = this.bq;
        ++this.cW;
        if (this.dc < 0) {
            i2 = this;
            n = 3;
        } else {
            i i3 = this;
            i2 = i3;
            n = i2.dc = i3.dc - 1;
        }
        if (this.dc == 0 && this.db + 1 < this.cX) {
            ++this.db;
        }
        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
        if (this.bo == 0 && this.var_boolean_al) {
            n4 = this.cW % 20;
            if (n4 >= 10) {
                var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 1, 1, n6 + 30 + 7 - (this.var_boolean_W ? 0 : 15), 0, 0, 6);
            } else if (this.bq != 2) {
                if (var_javax_microedition_lcdui_Image_f == null) {
                    n3 = n6 + 30 + 1 - (this.var_boolean_W ? 0 : 15);
                    var_javax_microedition_lcdui_Image_f = Image.createImage((int)28, (int)14);
                    Graphics graphics = var_javax_microedition_lcdui_Image_f.getGraphics();
                    graphics.translate(-1, -n3);
                    this.b(graphics, false);
                    graphics.translate(1, n3);
                    for (n2 = 0; n2 < 14; ++n2) {
                        var_a_arr_a[18].a(graphics, 4, (n3 + n2 + 1) % 2, n2, 0, 0, 0);
                    }
                }
                this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_f, 1, n6 + 30 + 1 - (this.var_boolean_W ? 0 : 15), 0);
            }
        }
        if (this.bo != 0 && this.bo != 3 && this.bo != 1 && this.bo != 7) {
            this.void_a();
        }
        this.void_b();
        var_boolean_U = false;
        if (this.dd == 2) {
            if (var_byte_l == 2) {
                var_boolean_U = true;
                var_boolean_V = true;
            }
            this.dd = -1;
            this.var_boolean_m = true;
            this.de = -1;
            this.p();
        }
    }

    public final void void_a() {
        var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 0, 223, 308, 0, 0, 0);
    }

    public final void void_b() {
        var_a_arr_a[18].a(this.var_javax_microedition_lcdui_Graphics_a, 3, 2, 308, 0, 0, 0);
    }

    private void ao() {
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, 320);
        int n = (this.bs + 1) * 230 / this.br;
        if (n > 230) {
            n = 230;
        }
        graphics.setColor(13540096);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(5, 310, n, 6);
        graphics.setColor(16554500);
        this.var_javax_microedition_lcdui_Graphics_a.drawRoundRect(4, 309, 231, 6, 2, 2);
        i.var_a_arr_a[41].var_int_b = 0;
        var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[37], 120, 293, 1);
    }

    private void ap() {
        switch (this.var_byte_i) {
            case 2: {
                this.ax();
                this.aq();
                return;
            }
            case 1: {
                this.av();
                return;
            }
            case 3: {
                this.as();
                return;
            }
            case 4: {
                this.au();
                return;
            }
            case 5: {
                this.ar();
            }
        }
    }

    private void aq() {
        if (this.var_int_ar + 240 > 1440 && this.var_int_as + 320 > 48) {
            if (var_a_arr_a[10] == null) {
                i.var_a_arr_a[10] = i.a_a("/mmv.f", 0);
            }
            a a2 = var_a_arr_a[10];
            if (this.boolean_d(60, 3) || this.boolean_d(61, 3)) {
                a2.a(this.var_javax_microedition_lcdui_Graphics_a, 1, 1440 - this.var_int_ar, 48 - this.var_int_as, 0, 0, 0);
            }
        }
        if (this.aP > 55 && this.var_boolean_c) {
            var_g_arr_a[0].a(this.var_javax_microedition_lcdui_Graphics_a);
        }
    }

    private void d(Graphics graphics) {
        if (var_a_arr_a[10] == null) {
            i.var_a_arr_a[10] = i.a_a("/mmv.f", 0);
        }
        if (this.bG >= 60 && this.bG < 65 && this.bH >= 2 && this.bH < 7) {
            var_a_arr_a[10].a(graphics, 4 + (this.bH - 2) * 5 + this.bG - 60, this.bx, this.by, 0, 0, 0);
        }
    }

    private void ar() {
        if (this.var_int_ad != -1) {
            g g2 = var_g_arr_a[5];
            var_g_arr_a[5].var_int_a = this.var_int_ai - this.var_int_ar;
            g2.b = 504 - this.var_int_as;
            g2.void_a();
            g2.a(this.var_javax_microedition_lcdui_Graphics_a);
            if (this.var_int_ad == 12) {
                int n = this.var_int_ai - this.var_int_ar + aN * this.var_int_ae % 48;
                int n2 = i.var_g_arr_a[5].b + 24;
                var_a_arr_a[7].a(this.var_javax_microedition_lcdui_Graphics_a, 0, aN % var_a_arr_a[7].int_a(1), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }

    private void as() {
        int n;
        if (this.var_byte_i == 3 && (long)aN >= this.var_long_m + 80L) {
            for (n = 14; n <= 21; ++n) {
                i.var_int_arr_arr_b[n][15] = 0;
                i.var_int_arr_arr_a[n][15] = -1;
                i.var_byte_arr_arr_a[n][15] = 44;
                i.var_byte_arr_arr_b[n][15] = 0;
                i.var_byte_arr_arr_c[n][15] = 24;
            }
            this.var_long_m = 0L;
        }
        if (this.var_int_ad != 15) {
            if (this.var_int_ar + 240 + 48 >= this.var_int_ah && this.var_int_as + 320 + 48 >= 504) {
                g g2 = var_g_arr_a[5];
                var_g_arr_a[5].var_int_a = this.var_int_ah - this.var_int_ar;
                g2.b = 504 - this.var_int_as;
                g2.void_a();
                g2.a(this.var_javax_microedition_lcdui_Graphics_a);
            }
            if (this.var_int_ad == 12) {
                n = this.var_int_ah - this.var_int_ar + aN * this.var_int_ae % 48;
                int n2 = i.var_g_arr_a[5].b + 24;
                var_a_arr_a[7].a(this.var_javax_microedition_lcdui_Graphics_a, 0, aN % var_a_arr_a[7].int_a(0), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }

    private void at() {
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        g g2 = var_g_arr_a[5];
        if (this.var_int_ad == 7) {
            int n = g2.var_int_a + aN * this.var_int_ae % 48;
            int n2 = g2.b;
            if (this.var_int_H == 10) {
                n2 -= 144;
            }
            var_a_arr_a[7].a(graphics, 1, aN % var_a_arr_a[7].int_a(1), n, n2, 0, 0, 0);
            this.k(n, n2);
            return;
        }
        if (this.var_int_ad != 8 && this.var_int_ad != 0) {
            this.a(graphics, 3);
        }
    }

    private void a(Graphics graphics, int n) {
        int n2 = n * 14 + 2;
        int n3 = 240 - n2 >> 1;
        if (this.var_int_af > 0) {
            graphics.setColor(0);
            graphics.fillRect(n3, 5, n2, 12);
            graphics.setColor(3913615);
            for (int j = 0; j < this.var_int_af; ++j) {
                graphics.fillRect(n3 + 2 + j * 14, 7, 12, 8);
            }
        }
    }

    private void au() {
        int n;
        g g2;
        g g3;
        Graphics graphics;
        block14: {
            int n2;
            block15: {
                g g4;
                int n3;
                block13: {
                    block12: {
                        int n4;
                        graphics = this.var_javax_microedition_lcdui_Graphics_a;
                        g3 = var_g_arr_a[5];
                        g2 = var_g_arr_a[4];
                        switch (this.var_int_ad) {
                            case 1: {
                                n4 = this.var_int_ae * 1;
                                break;
                            }
                            case 2: 
                            case 7: {
                                n4 = 40;
                                break;
                            }
                            case 3: {
                                n4 = 40;
                                break;
                            }
                            case 4: {
                                n4 = 40 - (this.var_int_ae * 2 << 1);
                                break;
                            }
                            case 5: {
                                n3 = 15 + this.var_int_ae * 18;
                                this.var_boolean_Y = false;
                                break block12;
                            }
                            case 9: {
                                n4 = 15 + this.var_int_ae * 18;
                                break;
                            }
                            case 10: {
                                n4 = 15 + this.var_int_ae * 18;
                                break;
                            }
                            case 11: {
                                n4 = 15 + this.var_int_ae * 18;
                                break;
                            }
                            default: {
                                n4 = -1000;
                            }
                        }
                        n3 = n4;
                    }
                    g3.var_int_a = (10 + this.var_int_ag * (2 + (this.var_int_ag > 0 ? 1 : 0))) * 24 - this.var_int_ar;
                    if (this.var_int_ad != 5) break block13;
                    n = g3.b;
                    g3.b = 256 - this.var_int_as - this.var_int_I - 15;
                    if (this.int_h() != 3) break block14;
                    g4 = g3;
                    n2 = n;
                    break block15;
                }
                g4 = g3;
                n2 = 256 - n3 - this.var_int_as;
            }
            g4.b = n2;
        }
        g3.a(graphics);
        if (this.var_boolean_i) {
            g2.b = 96 - this.var_int_as;
            g2.var_int_a = (this.int_g() + 1) * 24 - this.var_int_ar;
            g2.a(graphics);
        }
        for (n = 0; n < 3; ++n) {
            int n5 = (n * (2 + (n > 0 ? 1 : 0)) + 10) * 24 - this.var_int_ar;
            if (n5 >= 240 || n5 <= -48 || this.var_int_as <= -80) continue;
            var_a_arr_a[40].a(graphics, 1, n5, 216 - this.var_int_as, 0, 0, 0);
        }
    }

    private void av() {
        int n;
        int n2 = aN;
        g g2 = var_g_arr_a[2];
        if (this.var_int_as + this.bk < 1008 && this.var_int_as + this.bk > 592) {
            g2.var_int_a = 240 - this.var_int_ar;
            g2.b = 1008 - this.var_int_as;
            g2.void_a();
            g2.a(this.var_javax_microedition_lcdui_Graphics_a);
            g2.var_int_a = 336 - this.var_int_ar;
            g2.b = 1008 - this.var_int_as;
            g2.void_a();
            g2.e = 1;
            g2.a(this.var_javax_microedition_lcdui_Graphics_a);
        }
        if (this.bj > 10) {
            this.aw();
        }
        int n3 = this.var_int_aw * 24 - this.var_int_aa - this.var_int_as;
        int n4 = n = 168 - this.var_int_ar;
        int n5 = n + 240;
        while (n <= -24) {
            n += 24;
        }
        g g3 = var_g_arr_a[1];
        if ((this.var_int_aa >= 816 || g3.f == 2) && this.var_int_aa > 816) {
            for (int j = n3 + 20; j < 320; j += 24) {
                for (int k = n; k < n5; k += 24) {
                    g3.var_a_a.a(this.var_javax_microedition_lcdui_Graphics_a, 1, ((n2 >> 1) + k + j) % 2, k, j, 0, 0, 0);
                }
            }
        }
        if (g2.f == 2) {
            g3.e = 0;
            g3.var_int_a = n4 + 120;
            g3.b = n3;
            g3.void_a();
            g3.a(this.var_javax_microedition_lcdui_Graphics_a);
            g3.e = 1;
            g3.a(this.var_javax_microedition_lcdui_Graphics_a);
            this.ay();
        }
    }

    private void aw() {
        for (int j = 3; j < 13; j += 2) {
            int n = 10 * (2 * j / 5 + 1);
            int n2 = (n + aN / n) * j % 240;
            int n3 = 320 / n * aN % 320;
            this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[27][j & 1], n2, n3, 0);
        }
    }

    private void ax() {
        if (this.var_boolean_r && this.var_c_a == null && this.bm == -1) {
            var_a_arr_a[15].a(this.var_javax_microedition_lcdui_Graphics_a, 0, aN >> 1 & 3, this.bv, this.bw - 24, 0, 0, 0);
        }
    }

    private void ay() {
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        int n = (aN << 3) % 160;
        int n2 = (aN / 160 & 1) == 0 ? 160 - n : 0 + n;
        graphics.setColor(255, n2, 0);
        graphics.drawRect(0, 0, 239, 319);
    }

    private void az() {
        int n;
        int n2;
        int n3;
        if (this.var_boolean_C) {
            return;
        }
        int n4 = this.aP;
        int n5 = this.aQ;
        int n6 = aN;
        int n7 = this.aS & 7;
        int n8 = (this.aS & 0x4000) == 0 ? 0 : 3;
        g g2 = var_g_arr_a[n8];
        boolean bl = this.boolean_b();
        int n9 = n3 = (this.aS & 0x800) == 0 ? this.bQ : this.aS & 7;
        if (!this.var_boolean_c) {
            return;
        }
        this.bv = n4 * 24 + var_byte_arr_g[n3] * this.aR - this.var_int_ar;
        this.bw = n5 * 24 + var_byte_arr_g[n3 + 8] * this.aR - this.var_int_as;
        if ((this.var_long_b <= 0L || (n6 >> 1 & 1) == 0) && this.aT <= 0) {
            g2.var_int_a = this.bv;
            g2.b = this.bw;
            if (var_int_arr_arr_e != null && bl && n7 != 1 && n7 != 3 && var_int_arr_arr_e[n4][n5 + 1] != 0 && i.boolean_j(n4, n5 + 1)) {
                n2 = (n6 >> 1) + n4;
                n = n2 % 4;
                if ((n2 / 4 & 1) == 1) {
                    n = 4 - n;
                }
                g2.b += n;
            }
            g2.void_a();
            g2.a(this.var_javax_microedition_lcdui_Graphics_a);
            n2 = g2.f;
            var_boolean_D = n2 == 47 && g2.g == 0;
            switch (n2) {
                case 40: 
                case 47: 
                case 48: {
                    if (g2.g <= (n2 == 40 ? 13 : 6) && n2 != 47) break;
                    try {
                        n = 0;
                        if (this.aA == 30 || this.aA == 31 || this.aA == 32) {
                            n = -2;
                        }
                        if (var_javax_microedition_lcdui_Image_arr_arr_a[this.aA] == null) {
                            var_a_arr_a[i.int_a(this.aA)].a(this.var_javax_microedition_lcdui_Graphics_a, this.aB, g2.var_int_a + n, g2.b - 24, 0, 0, 0);
                        } else {
                            this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[this.aA][this.aB], g2.var_int_a + n, g2.b - 24, 0);
                        }
                    }
                    catch (Exception exception) {}
                    if (this.aC <= 0) break;
                    i.a(this.var_javax_microedition_lcdui_Graphics_a, g2.var_int_a + 24, g2.b - 10, this.aC, i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0], 0);
                    break;
                }
                case 17: 
                case 18: {
                    if (g2.g != 0) break;
                    this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[this.aA][this.aB], g2.var_int_a, g2.b - 12, 0);
                }
            }
        }
        if (bl && var_byte_arr_arr_a[n4][n5] == 0) {
            n2 = var_int_arr_arr_b[n4][n5] & 7;
            n = var_byte_arr_arr_b[n4][n5];
            try {
                var_a_arr_a[i.int_a(1)].a(this.var_javax_microedition_lcdui_Graphics_a, 0 + (var_int_arr_arr_b[n4][n5] & 0x38), n4 * 24 - this.var_int_ar + var_byte_arr_g[n2] * n, n5 * 24 - this.var_int_as + var_byte_arr_g[n2 + 8] * n, 0, 0, 0);
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void aA() {
        int n;
        int n2;
        int n3 = this.bG;
        int n4 = this.bH;
        int n5 = n4 + 1;
        this.bz = 0;
        this.bA = 0;
        this.var_boolean_y = false;
        int n6 = var_int_arr_arr_b[n3][n4];
        int n7 = n6 & 7;
        byte by = var_byte_arr_arr_b[n3][n4];
        if (n6 == -1) {
            n6 = -1;
        }
        this.bN += by * var_byte_arr_g[n7];
        this.bO += by * var_byte_arr_g[n7 + 8];
        boolean bl = var_int_arr_arr_e != null && var_int_arr_arr_e[n3][n4] != 0;
        switch (this.bI) {
            case 47: {
                var_a_b = var_a_arr_a[30];
                this.bK = 0;
                this.bL = i.a(var_a_b, 0, aN % i.a(var_a_b, 0));
                break;
            }
            case 8: {
                this.aG = 16;
                this.aH = 0 + (aN >> 1 & 1);
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
                var_a_b = var_a_arr_a[(n6 & 0xFC00000) >> 22];
                this.bL = 0;
                break;
            }
            case 4: {
                this.aG = 24;
                this.aH = 0 + this.bR;
                break;
            }
            case 0: {
                boolean bl2;
                n2 = (n6 & 0x38) >> 3;
                n = (n6 & 0x7000) >> 12;
                boolean bl3 = bl2 = (n6 & 0x10000) == 0;
                if (!bl && n7 == 0 && i.boolean_j(n3, n5)) {
                    n6 = n6 & 0xFFFF8FFF | n << 12;
                    if (bl2) {
                        n6 &= 0xFFFEFFFF;
                    } else {
                        n6 |= 0x10000;
                        n = -n;
                    }
                    this.bN = n;
                } else {
                    n6 &= 0xFFFF8FFF;
                }
                i.var_int_arr_arr_b[n3][n4] = n6;
                this.aG = 1;
                this.aH = 0 + n2;
                break;
            }
            case 1: {
                this.aG = 2;
                this.aH = 0 + this.bR;
                break;
            }
            case 2: {
                this.aD();
            }
        }
        if (bl || var_int_arr_arr_e != null && var_int_arr_arr_e[n3][n5] != 0 && i.boolean_j(n3, n5)) {
            n2 = (aN >> 1) + n3;
            n = n2 % 4;
            if ((n2 / 4 & 1) == 1) {
                n = 4 - n;
            }
            this.bO += n;
        }
        if (((n6 & 0x200) != 0 || var_byte_arr_arr_a[n3 - var_byte_arr_g[n7]][n5] < 0 && i.boolean_j(n3, n5) && (var_int_arr_arr_b[n3][n5] & 7) == 0 && n3 != this.bg && n4 != this.bh) && (this.aS & 8) == 0) {
            this.bO += by * by / 24;
            if (this.bI != 9) {
                this.bN += -1 + aN % 3;
            }
        }
        if ((n6 & 0x200) != 0) {
            this.bN = -this.bN;
        }
        if (this.bI == 0) {
            this.bD = ((n6 & 0x1C0) >> 6) - 1;
            if (this.bD >= 0 && this.bD < 5) {
                int n8;
                this.var_boolean_y = true;
                switch (n6 & 7) {
                    case 4: {
                        i i2 = this;
                        n8 = 24;
                        break;
                    }
                    case 2: {
                        i i2 = this;
                        n8 = -24;
                        break;
                    }
                    default: {
                        i i2 = this;
                        n8 = 0;
                    }
                }
                i2.bz = n8;
                this.bA = 13;
                this.bB = this.bG;
                this.bC = this.bH - 1;
            }
        }
        this.aa();
    }

    private void aB() {
        int n;
        i i2;
        int n2 = this.bG;
        int n3 = this.bH;
        int n4 = var_int_arr_arr_b[n2][n3];
        byte by = var_byte_arr_arr_b[n2][n3];
        int n5 = n4 & 7;
        this.bN = by * var_byte_arr_g[n5];
        this.bO = by * var_byte_arr_g[n5 + 8];
        var_a_b = var_a_arr_a[38];
        int n6 = (n4 & 0x7000) >> 12;
        if ((n6 == 2 || n6 == 4 || n5 == 2 || n5 == 4) && var_byte_arr_arr_a[n2 - 1][n3] >= 0 && var_byte_arr_arr_a[n2 + 1][n3] >= 0 || (n6 == 1 || n6 == 3 || n5 == 1 || n5 == 3) && var_byte_arr_arr_a[n2][n3 - 1] >= 0 && var_byte_arr_arr_a[n2][n3 + 1] >= 0) {
            this.bK = 1;
            i2 = this;
            n = 0;
        } else {
            int n7;
            i i3;
            if (n5 == 1 || n5 == 3) {
                i3 = this;
                n7 = n5 - 1;
            } else {
                i3 = this;
                n7 = 0;
            }
            i3.bK = n7;
            i2 = this;
            n = (aN >> 1) % var_a_b.int_a(this.bK);
        }
        i2.bL = n;
        this.aa();
    }

    /*
     * Unable to fully structure code
     */
    private void c(byte var1_1) {
        block10: {
            block9: {
                block8: {
                    block7: {
                        var2_2 = i.var_int_arr_arr_b[this.bG][this.bH];
                        var3_3 = i.var_byte_arr_arr_b[this.bG][this.bH];
                        var4_4 = var2_2 & 7;
                        this.bN = var3_3 * i.var_byte_arr_g[var4_4];
                        this.bO = var3_3 * i.var_byte_arr_g[var4_4 + 8];
                        var5_5 = var1_1 == 19 ? 4 : 21;
                        i.var_a_b = i.var_a_arr_a[var5_5];
                        if (this.var_int_ap != 1) break block7;
                        var6_6 = (var2_2 & 248) >> 3;
                        if (var6_6 > 0) {
                            v0 = this;
                            v1 = 2;
                        } else {
                            v0 = this;
                            v1 = 0;
                        }
                        v0.bK = v1;
                        v2 = this;
                        v3 = i.aN;
                        v4 = i.var_a_b;
                        ** GOTO lbl-1000
                    }
                    var6_7 = (var2_2 & 248) >> 3;
                    if (var6_7 <= 0) break block8;
                    v5 = this;
                    v6 = 4;
                    break block9;
                }
                this.bK = var4_4 - 1;
                if (this.bK >= 0) break block10;
                v5 = this;
                v6 = ((var2_2 & 28672) >> 12) - 1;
            }
            v5.bK = v6;
        }
        v2 = this;
        v3 = i.aN >> 1;
        v4 = i.var_a_b;
        if (this.bK < 0) {
            v7 = 0;
        } else lbl-1000:
        // 2 sources

        {
            v7 = this.bK;
        }
        v2.bL = v3 % v4.int_a(v7);
        this.aa();
    }

    private void aC() {
        block6: {
            int n;
            block3: {
                i i2;
                int n2;
                int n3;
                block4: {
                    block5: {
                        block2: {
                            n3 = this.bG;
                            n2 = this.bH;
                            this.aE = 26;
                            this.aF = 0;
                            if (!i.boolean_j(n3, n2) || var_byte_arr_arr_b[n3][n2] > 12) break block2;
                            i2 = this;
                            n = -(var_byte_arr_arr_b[n3][n2] - 12);
                            break block3;
                        }
                        if (!this.boolean_d(n3, n2)) break block4;
                        if ((this.aS & 0x1000) != 0) break block5;
                        if (this.aR > 12) break block6;
                        i2 = this;
                        n = -(this.aR - 12);
                        break block3;
                    }
                    i2 = this;
                    n = 12;
                    break block3;
                }
                if (!(this.boolean_d(n3 - 1, n2) ? this.bQ == 4 && this.aR > 12 : this.boolean_d(n3 + 1, n2) && this.bQ == 2 && this.aR > 12)) break block6;
                i2 = this;
                n = this.aR - 12;
            }
            i2.bO = n;
        }
        this.bO += 24;
        this.bP = 36;
    }

    private void aD() {
        block2: {
            int n;
            a[] aArray;
            int n2;
            block4: {
                i i2;
                int n3;
                block3: {
                    n3 = var_int_arr_arr_a[this.bG][this.bH] & 0xFF;
                    n2 = var_int_arr_arr_a[this.bG][this.bH] >> 8;
                    if ((n3 == 14 || n3 == 33) && n2 <= 11) break block2;
                    this.aG = 3;
                    this.aH = 0 + this.bR;
                    if (n3 != 14) break block3;
                    i2 = this;
                    aArray = var_a_arr_a;
                    n = 8;
                    break block4;
                }
                if (n3 != 33) break block2;
                i2 = this;
                aArray = var_a_arr_a;
                n = 22;
            }
            i2.bO = -(aArray[n].int_a(0) - n2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void aE() {
        block16: {
            block15: {
                var1_1 = this.bG;
                var2_2 = this.bH;
                this.aG = 6;
                var3_3 = (i.var_int_arr_arr_b[var1_1][var2_2] & 3840) >> 8;
                if (var3_3 >= 4) {
                    this.aG = -1;
                    return;
                }
                if (var3_3 == 0) {
                    v0 = this;
                    v1 = 0 + (i.aN >> 1) % 3;
                } else {
                    v0 = this;
                    v1 = 3 + var3_3 - 1;
                }
                v0.aH = v1;
                var4_4 = i.var_int_arr_arr_b[var1_1][var2_2] & 7;
                this.bN = i.var_byte_arr_arr_b[var1_1][var2_2] * i.var_byte_arr_g[var4_4] + 2;
                this.bO = i.var_byte_arr_arr_b[var1_1][var2_2] * i.var_byte_arr_g[var4_4 + 8] + 2;
                if ((i.var_int_arr_arr_b[var1_1][var2_2] & 16) != 0) break block15;
                switch (var4_4) {
                    case 1: {
                        this.bN += 4;
                        break block16;
                    }
                    case 2: {
                        v2 = this;
                        v3 = v2;
                        v4 = v2.bO + 4;
                        ** GOTO lbl35
                    }
                    case 3: {
                        this.bN -= 4;
                        break block16;
                    }
                    case 4: {
                        v5 = this;
                        v3 = v5;
                        v4 = v5.bO - 4;
lbl35:
                        // 2 sources

                        v3.bO = v4;
                    }
                }
                return;
            }
            switch (var4_4) {
                case 1: {
                    this.bN -= 4;
                    return;
                }
                case 2: {
                    v6 = this;
                    v7 = v6;
                    v8 = v6.bO - 4;
                    ** GOTO lbl54
                }
                case 3: {
                    this.bN += 4;
                    return;
                }
                case 4: {
                    v9 = this;
                    v7 = v9;
                    v8 = v9.bO + 4;
lbl54:
                    // 2 sources

                    v7.bO = v8;
                }
            }
        }
    }

    private void aF() {
        int n;
        i i2;
        int n2;
        int n3;
        this.var_javax_microedition_lcdui_Graphics_a.setColor(13883367);
        byte by = var_byte_arr_arr_b[this.bG][this.bH];
        if ((var_int_arr_arr_b[this.bG][this.bH] & 1) != 0) {
            n3 = this.bx;
            n2 = this.bx + 24 - by;
            i2 = this;
            n = 0;
        } else {
            n3 = this.bx + 24;
            n2 = this.bx + by;
            i2 = this;
            n = 1;
        }
        i2.bL = n;
        this.var_javax_microedition_lcdui_Graphics_a.drawLine(n3, this.by + 12, n2, this.by + 12);
        if (by > 0) {
            i.var_g_arr_a[0].var_a_a.a(this.var_javax_microedition_lcdui_Graphics_a, this.bL, n2, this.by + 12 - 2, 0);
        }
    }

    private void aG() {
        byte by;
        i i2;
        int n = var_int_arr_arr_a[this.bG][this.bH] >> 8;
        int n2 = this.aE = this.bJ == 9 ? 22 : 23;
        if ((n & 0x200) != 0) {
            i2 = this;
            if (this.bJ == 9) {
                // empty if block
            }
            by = (byte)(1 + (aN >> 2) % 6);
        } else if ((n & 0x100) != 0) {
            i2 = this;
            by = 1;
        } else {
            i2 = this;
            by = 0;
        }
        i2.aF = by;
    }

    private void aH() {
        int n = this.bG;
        int n2 = this.bH;
        int n3 = var_int_arr_arr_a[n][n2] >> 8;
        int n4 = ((n3 & 0xF0) >> 4) - 1;
        if (n4 < 0) {
            n4 = 0;
        }
        if ((var_int_arr_arr_a[n][n2 - 1] & 0xFF) != 9 && (var_int_arr_arr_a[n][n2 - 1] & 0xFF) != 8) {
            var_a_arr_a[56].a(this.var_javax_microedition_lcdui_Graphics_a, n4, this.bx, this.by, 0, 0, 0);
        }
        this.aE = 4;
        this.aF = (byte)(n4 + 3);
    }

    private void aI() {
        int n = aN;
        int n2 = var_int_arr_arr_b[this.bG][this.bH];
        int n3 = var_byte_arr_arr_b[this.bG][this.bH];
        if (n3 > 24) {
            n3 = 24;
        }
        int n4 = n2 & 7;
        this.bN = n3 * var_byte_arr_g[n4];
        this.bO = n3 * var_byte_arr_g[n4 + 8];
        if ((n2 & 8) == 0) {
            this.aG = 10;
            this.aH = (n >> 1) % 3;
            if (n4 != 3) {
                int n5 = (n >> 1) % 5;
                this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[10][3 + n5], this.bx + this.bN - n5 * 4, this.by + (this.bO + 24), 36);
                return;
            }
        } else {
            this.aG = 10;
            this.aH = 2 - (n >> 1) % 3;
            if (n4 != 3) {
                int n6 = (n >> 1) % 5;
                this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_arr_arr_a[10][8 + n6], this.bx + 24 - 12 + this.bN + n6 * 3, this.by + (this.bO + 24), 36);
                if ((n >> 1 & 1) == 0 && var_byte_arr_arr_a[this.bG - 1][this.bH] >= 0) {
                    --this.bN;
                    ++this.bO;
                }
            }
        }
    }

    private void aJ() {
        int n;
        a a2;
        if (var_byte_arr_arr_a[this.bG][this.bH + 1] == 16) {
            return;
        }
        int n2 = var_int_arr_arr_b[this.bG][this.bH];
        var_a_b = a2 = var_a_arr_a[1];
        byte by = var_byte_arr_arr_b[this.bG][this.bH];
        int n3 = 0;
        int n4 = this.bK = (n2 & 7) == 4 ? 1 : 0;
        if (by != 0) {
            n = 0;
            for (int j = 36 - by; j > 0; j -= a2.a(this.bK, n)) {
                n3 = n++;
            }
        }
        this.bL = n3;
        n = (a2.var_short_arr_b[this.bK] + n3) * 5;
        this.bN = a2.var_byte_arr_f[n + 2];
    }

    private void aK() {
        int n = var_int_arr_arr_b[this.bG][this.bH];
        var_a_b = var_a_arr_a[28];
        this.bK = n & 0xF;
        int n2 = (var_int_arr_arr_b[this.bG][this.bH] & 0x1FE000) >> 13;
        if (this.bK == 10) {
            int n3;
            int n4 = 0;
            int n5 = var_a_b.int_a(this.bK);
            int n6 = n3 = 0;
            for (int j = n2; j > 0; j -= var_a_b.a(this.bK, n3)) {
                n4 = n3;
                n6 = (n3 + 1) % n5;
            }
            this.bL = n4;
        } else {
            int n7;
            this.bL = n7 = i.a(var_a_b, this.bK, n2);
            int n8 = (i.var_a_b.var_short_arr_b[this.bK] + n7) * 5;
            this.bN = i.var_a_b.var_byte_arr_f[n8 + 2];
            this.bO = i.var_a_b.var_byte_arr_f[n8 + 3];
        }
        this.aa();
    }

    private static int a(a a2, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (n2 > 0) {
            n2 -= a2.a(n, n4);
            n3 = n4++;
        }
        return n3;
    }

    private static int b(a a2, int n, int n2) {
        int n3 = 0;
        for (int j = 0; j < n2; ++j) {
            n3 += a2.a(n, j);
        }
        return n3;
    }

    private void aL() {
        block51: {
            block52: {
                int n;
                int n2;
                int n3;
                int n4;
                int n5;
                block50: {
                    int n6;
                    int n7;
                    byte[] byArray;
                    int n8;
                    int n9;
                    boolean bl;
                    n5 = this.bE;
                    n4 = this.bF;
                    i.var_byte_arr_arr_c[n5][n4] = 24;
                    int n10 = (var_int_arr_arr_b[n5][n4] & 0x1C00) >> 10;
                    n3 = var_int_arr_arr_b[n5][n4] & 0xF;
                    int n11 = 0;
                    boolean bl2 = bl = (var_int_arr_arr_a[n5][n4] & 0xFF) == 35;
                    if (n3 == 10) {
                        n11 = 100;
                    } else {
                        n9 = var_a_arr_a[28].int_a(n3);
                        for (n8 = 0; n8 < n9; ++n8) {
                            n11 += var_a_arr_a[28].a(n3, n8);
                        }
                    }
                    n9 = (var_int_arr_arr_b[n5][n4] & 0x1FE000) >> 13;
                    i.var_int_arr_arr_b[n5][n4] = var_int_arr_arr_b[n5][n4] & 0xFFE01FFF | ++n9 << 13;
                    if (n3 >= 4 && n3 <= 9) {
                        byArray = var_byte_arr_arr_b[n5];
                        n7 = n4;
                        n6 = 12;
                    } else {
                        byArray = var_byte_arr_arr_b[n5];
                        n7 = n4;
                        n6 = byArray[n7] = 0;
                    }
                    if (n9 > n11 >> 1) {
                        if (!bl) {
                            if (this.boolean_d(n5, n4) && n3 != 10) {
                                int n12;
                                switch (n3) {
                                    case 4: 
                                    case 5: {
                                        n12 = 1;
                                        break;
                                    }
                                    case 6: {
                                        n12 = 2;
                                        break;
                                    }
                                    case 7: 
                                    case 8: {
                                        n12 = 3;
                                        break;
                                    }
                                    case 9: {
                                        n12 = 4;
                                        break;
                                    }
                                    default: {
                                        n12 = var_byte_arr_h[this.aS & 7];
                                    }
                                }
                                n8 = n12;
                                this.void_a(1, 48, n8);
                            }
                            if (this.boolean_i(n5, n4)) {
                                i.var_byte_arr_arr_a[n5][n4] = -1;
                                this.p(n5, n4);
                                return;
                            }
                        }
                        if (n9 >= n11) {
                            boolean bl3;
                            int n13;
                            int n14;
                            boolean bl4;
                            i.q(n5, n4);
                            n2 = this.int_a(n5, n4, this.aP, this.aQ, true);
                            boolean bl5 = false;
                            switch (n3) {
                                case 0: 
                                case 3: 
                                case 4: 
                                case 7: 
                                case 9: {
                                    bl5 = true;
                                }
                            }
                            boolean bl6 = bl4 = n2 == 4;
                            if (bl5 != bl4) {
                                n = bl4 ? 3 : 2;
                                n14 = n5;
                                n13 = n4;
                            } else {
                                int n15;
                                n14 = n5 - var_byte_arr_g[n2];
                                n13 = n4 - var_byte_arr_g[8 + n2];
                                if (bl4) {
                                    if (this.boolean_d(n14, n13) && n3 != 0) {
                                        n = 0;
                                        n14 = n5;
                                        n13 = n4;
                                    } else {
                                        switch (n2) {
                                            case 1: {
                                                n15 = 4;
                                                break;
                                            }
                                            case 4: {
                                                n15 = 9;
                                                break;
                                            }
                                            case 3: {
                                                n15 = 7;
                                                break;
                                            }
                                            default: {
                                                n15 = 0;
                                                break;
                                            }
                                        }
                                    }
                                } else if (this.boolean_d(n14, n13) && n3 != 1) {
                                    n = 1;
                                    n14 = n5;
                                    n13 = n4;
                                } else {
                                    switch (n2) {
                                        case 1: {
                                            n15 = 5;
                                            break;
                                        }
                                        case 2: {
                                            n15 = 6;
                                            break;
                                        }
                                        case 3: {
                                            n15 = 8;
                                            break;
                                        }
                                        default: {
                                            n15 = n = 1;
                                        }
                                    }
                                }
                            }
                            if (!(bl3 = var_byte_arr_arr_a[n14][n13] < 0) || bl) {
                                if (n14 != n5 || n13 != n4) {
                                    n = 0;
                                }
                                n14 = n5;
                                n13 = n4;
                            }
                            i.var_byte_arr_arr_a[n5][n4] = -1;
                            i.var_byte_arr_arr_b[n14][n13] = 0;
                            i.var_int_arr_arr_b[n14][n13] = n10 << 10 | n;
                            i.var_int_arr_arr_b[n14][n13] = var_int_arr_arr_b[n14][n13] & 0xFFE01FFF;
                            i.var_byte_arr_arr_a[n14][n13] = 45;
                        }
                    }
                    if (!bl) break block50;
                    if (!this.boolean_d(n5, n4) || n3 == 10) break block51;
                    break block52;
                }
                n = n5;
                n2 = n4;
                switch (n3) {
                    case 7: 
                    case 8: {
                        --n2;
                        break;
                    }
                    case 10: {
                        n = -1;
                        n2 = -1;
                        break;
                    }
                    case 9: {
                        ++n;
                        break;
                    }
                    case 6: {
                        --n;
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        break;
                    }
                    case 4: 
                    case 5: {
                        ++n2;
                    }
                }
                if (!this.boolean_d(n, n2)) break block51;
            }
            this.void_a(1, 48, (int)var_byte_arr_h[this.aS & 7]);
        }
    }

    private void aM() {
        int n;
        int n2;
        int n3;
        Graphics graphics;
        a a2;
        int n4;
        int n5;
        int n6 = -1;
        int n7 = 3;
        int n8 = var_int_arr_arr_b[this.bG][this.bH];
        if ((n8 & 7) == 3) {
            n6 = 1;
            n7 = 0;
        }
        if ((n8 & 8) == 0) {
            n5 = this.aJ;
            n4 = this.aI;
        } else {
            n5 = this.aL;
            n4 = this.aK;
        }
        int n9 = n4;
        for (int j = 0; j < n5; ++j) {
            var_a_arr_a[11].a(this.var_javax_microedition_lcdui_Graphics_a, n7 + j * n6, this.bx + 3, this.by + n6 * (n9 - j * 24), 0, 0, 0);
        }
        if (n6 == 1) {
            a2 = var_a_arr_a[42];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            n3 = var_byte_arr_arr_a[this.bG][this.bH - 1] - 80;
            n2 = this.bx;
            n = this.by - 24;
        } else {
            a2 = var_a_arr_a[42];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            n3 = var_byte_arr_arr_a[this.bG][this.bH + 1] - 80;
            n2 = this.bx;
            n = this.by + 24;
        }
        a2.a(graphics, n3, n2, n, 0, 0, 0);
    }

    private void aN() {
        g g2 = var_g_arr_a[0];
        this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
        g2.b = 136;
        int n = 0;
        if (aN > 30) {
            g2.var_int_a = 139;
            g2.void_a(1);
            int n2 = (aN - 30) * 4;
            if (n2 > 29) {
                int n3;
                int n4;
                int n5;
                Graphics graphics;
                a a2;
                n2 = 29;
                if (aN < 42) {
                    int n6 = 42 - aN;
                    n = 0 + n6 * n6 % ((n6 >> 1) + 1);
                    a2 = g2.var_a_a;
                    graphics = this.var_javax_microedition_lcdui_Graphics_a;
                    n5 = 10;
                    n4 = 138;
                    n3 = 136 + n;
                } else {
                    a2 = g2.var_a_a;
                    graphics = this.var_javax_microedition_lcdui_Graphics_a;
                    n5 = 4;
                    n4 = 138;
                    n3 = 136;
                }
                a2.a(graphics, n5, n4, n3, 0, 0, 0);
                g2.g = 0;
            } else {
                g2.var_a_a.a(this.var_javax_microedition_lcdui_Graphics_a, 10, 138, 136, 0, 0, 0);
            }
            g2.b = 136 + n2;
        } else {
            g2.var_int_a = aN * 4 - 1 + 18;
        }
        g2.b += n;
        g2.a(this.var_javax_microedition_lcdui_Graphics_a);
        g2.var_a_a.a(this.var_javax_microedition_lcdui_Graphics_a, 5, 138, 160 + n, 0, 0, 0);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, Image[] imageArray, int n4) {
        if (n3 == 0) {
            Image image = i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0][0];
            graphics.drawImage(image, n, n2, 24);
            return;
        }
        while (n3 > 0) {
            int n5 = n3 % 10;
            n3 /= 10;
            Image image = imageArray[n5 + n4];
            graphics.drawImage(image, n -= image.getWidth(), n2, 0);
        }
    }

    private static void a(Graphics graphics, int n, int n2, String string, Image[] imageArray, int n3) {
        for (int j = string.length() - 1; j >= 0; --j) {
            int n4 = string.charAt(j);
            if (n4 == 47) {
                n4 = 58;
            }
            n4 = (char)(n4 - 48);
            Image image = imageArray[n4 + n3];
            graphics.drawImage(image, n, n2, 24);
            n -= image.getWidth();
        }
    }

    private boolean boolean_b() {
        return this.aP > 0 && this.aP < this.var_int_av - 1 && this.aQ > 0 && this.aQ < this.var_int_aw - 1;
    }

    private void n(int n) {
        int n2 = i.var_g_arr_a[0].f;
        if (n2 != 19 && (this.aS & 0x4000) == 0 && (this.aS & 0x800) == 0) {
            if (this.boolean_b()) {
                int n3 = var_int_arr_arr_e == null ? 0 : i.int_a(var_int_arr_arr_e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                if (n3 == 8 || n3 == 7) {
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
                            n = 36 + (this.aS & 7) - 1;
                        }
                    }
                } else if (var_byte_arr_arr_a[this.aP][this.aQ + 1] < 0 || var_byte_arr_arr_a[this.aP][this.aQ + 1] == 14) {
                    switch (n) {
                        case 14: {
                            int n4 = 28;
                            break;
                        }
                        case 16: {
                            int n4 = 29;
                            break;
                        }
                        case 42: {
                            int n4 = 46;
                            break;
                        }
                        case 44: {
                            int n4 = 45;
                            break;
                        }
                        case 1: {
                            int n4 = 35;
                            break;
                        }
                        case 3: {
                            int n4 = 34;
                            break;
                        }
                        case 0: {
                            int n4 = 0;
                            break;
                        }
                        case 2: {
                            int n4 = 2;
                            break;
                        }
                        case 22: {
                            int n4 = 31;
                            break;
                        }
                        case 20: {
                            int n4 = 30;
                            break;
                        }
                        case 23: {
                            int n4 = 33;
                            break;
                        }
                        case 21: {
                            int n4 = n = 32;
                        }
                    }
                }
            }
            if (n == 1000) {
                var_g_arr_a[3].void_a(0);
                this.aS |= 0x4000;
            } else {
                var_g_arr_a[0].void_a(n);
            }
            if (n2 != n) {
                this.var_int_am = 70;
            }
        }
    }

    private void aO() {
        int n;
        String[] stringArray;
        i i2;
        block9: {
            int n2;
            i i3;
            block8: {
                block7: {
                    if (i.boolean_a(32944)) {
                        var_int_W = 0;
                        this.var_boolean_aw = true;
                        this.o(this.var_int_c);
                        return;
                    }
                    if (i.boolean_a(64)) {
                        var_int_W = 0;
                        var_byte_l = (byte)27;
                        this.var_boolean_aw = true;
                        this.var_boolean_e = true;
                        var_int_W = 0;
                        return;
                    }
                    if (!i.boolean_a(4097)) break block7;
                    i3 = this;
                    n2 = -1;
                    break block8;
                }
                if (!i.boolean_a(262146)) break block9;
                i3 = this;
                n2 = 1;
            }
            i3.p(n2);
        }
        var_int_W = 0;
        int n3 = i.int_f(this.var_int_c);
        if (n3 == 0) {
            this.var_int_d = -1;
            i2 = this;
            stringArray = var_java_lang_String_arr_a;
            n = 81;
        } else {
            this.var_int_d = f.var_int_arr_a[this.var_int_c];
            this.var_java_lang_StringBuffer_d.delete(0, this.var_java_lang_StringBuffer_d.length());
            this.var_java_lang_StringBuffer_d.append(this.var_int_d);
            i2 = this;
            stringArray = var_java_lang_String_arr_a;
            n = 90;
        }
        i2.var_java_lang_String_a = stringArray[n];
        this.var_boolean_aw = true;
    }

    private static int int_f(int n) {
        byte by = var_byte_arr_i[8];
        if (by >= 4 + n + 1) {
            return 0;
        }
        int n2 = i.a(var_byte_arr_i, 4);
        if (n2 < f.var_int_arr_a[n]) {
            return -1;
        }
        return 1;
    }

    private void o(int n) {
        this.ep = -1;
        switch (i.int_f(n)) {
            case -1: {
                this.var_java_lang_String_a = var_java_lang_String_arr_a[89];
                return;
            }
            case 0: {
                this.var_java_lang_String_a = var_java_lang_String_arr_a[81];
                return;
            }
            case 1: {
                this.aZ = i.a(var_byte_arr_i, 4) - f.var_int_arr_a[this.var_int_c];
                this.var_java_lang_String_f = null;
                System.gc();
                this.var_java_lang_String_f = var_java_lang_String_arr_a[110] + " " + this.aZ + " " + var_java_lang_String_arr_a[109];
                i.var_byte_arr_i[4] = (byte)(this.aZ & 0xFF);
                i.var_byte_arr_i[5] = (byte)(this.aZ >> 8 & 0xFF);
                i.var_byte_arr_i[8] = (byte)(4 + n + 1);
                this.G();
                this.var_int_d = -1;
                this.var_java_lang_String_a = var_java_lang_String_arr_a[81];
                this.var_boolean_Z = true;
                this.a(var_java_lang_String_arr_a[91], -1, -1, 5000, 4273165, 0);
            }
        }
    }

    private void p(int n) {
        this.var_int_c += n;
        if (this.var_int_c < 0) {
            this.var_int_c = 3;
        }
        if (this.var_int_c == 4) {
            this.var_int_c = 0;
        }
    }

    private void aP() {
        if (i.boolean_a(64)) {
            var_byte_l = (byte)4;
            this.void_a(4);
        }
        var_int_W = 0;
    }

    /*
     * Unable to fully structure code
     */
    private void aQ() {
        if (i.var_int_W == 0) {
            this.var_byte_j = 0;
            return;
        }
        if (i.boolean_h()) {
            this.c(true);
            i.var_int_W = 0;
            return;
        }
        switch (i.var_byte_l) {
            case 33: {
                this.aS();
                break;
            }
            case 26: {
                this.aP();
                break;
            }
            case 18: {
                break;
            }
            case 25: {
                this.aO();
                break;
            }
            case 24: {
                this.aW();
                break;
            }
            case 34: {
                this.aY();
                break;
            }
            case 12: {
                this.aZ();
                break;
            }
            case 4: {
                this.bb();
                break;
            }
            case 30: {
                if (!i.boolean_a(32784)) break;
                i.var_byte_l = (byte)4;
                if (this.bo == -1) {
                    this.aM = 0;
                    this.void_a(0);
                } else {
                    this.aM = 2;
                }
                v0 = 0;
                break;
            }
            case 2: 
            case 7: 
            case 32: {
                this.bb();
                break;
            }
            case 1: {
                if (this.var_boolean_f || this.var_boolean_aj) {
                    i.var_int_W = 0;
                }
                i.var_byte_m = i.var_byte_l;
                this.aT();
                this.ba();
                break;
            }
            case 10: {
                break;
            }
            case 15: {
                this.cD();
                break;
            }
            case 17: 
            case 20: {
                if (!i.boolean_a(32944)) break;
                if (this.aM == 5) {
                    this.bk();
                    this.A();
                }
                this.var_boolean_s = true;
                ** GOTO lbl78
            }
            case 27: {
                i.var_byte_m = i.var_byte_l;
                this.aT();
                this.aU();
                break;
            }
            case 31: {
                if (i.boolean_a(64)) {
                    this.bs = 0;
                    this.br = 8;
                    i.var_byte_l = (byte)9;
                    this.void_a(-1);
                } else if (i.boolean_a(32944)) {
                    this.aR();
                }
lbl78:
                // 5 sources

                v0 = i.var_int_W = 0;
            }
        }
        if (this.var_boolean_b) {
            return;
        }
        if ((this.aS & 7) != 0) {
            this.var_int_b = 10;
        }
    }

    private void aR() {
        this.var_boolean_B = true;
        var_byte_l = (byte)16;
        this.bs = 0;
        this.br = 6;
        this.var_int_ao = 0;
        this.bb = 0;
        this.aZ = 0;
        this.var_boolean_n = false;
        this.var_int_V = 0;
        eb = 0;
    }

    private void aS() {
        if (i.boolean_a(64)) {
            if (this.bo == 0) {
                var_byte_l = (byte)4;
                this.void_a(0);
                this.var_h_a.b(19);
            }
            if (this.bo == 1) {
                var_byte_l = (byte)2;
                var_boolean_U = true;
                this.var_boolean_m = true;
                this.void_a(1);
            }
        }
    }

    private void aT() {
        if (var_byte_s < var_int_arr_b.length && i.boolean_a(var_int_arr_b[var_byte_s])) {
            var_int_W = 0;
            if ((var_byte_s = (byte)(var_byte_s + 1)) == var_int_arr_b.length) {
                var_int_W = 0;
                var_byte_l = (byte)24;
                this.cz = var_byte_arr_i[8];
                this.cA = var_byte_arr_i[9];
                this.var_boolean_R = false;
                this.var_boolean_S = false;
                return;
            }
        } else {
            byte by;
            if (i.boolean_a(var_int_arr_b[0])) {
                var_int_W = 0;
                by = 1;
            } else {
                by = 0;
            }
            var_byte_s = by;
        }
    }

    private void aU() {
        block7: {
            int n;
            block5: {
                i i2;
                block10: {
                    block9: {
                        block8: {
                            block6: {
                                block4: {
                                    if (this.var_int_s != -1 || this.var_int_q != 0) {
                                        var_int_W = 0;
                                        return;
                                    }
                                    if (!i.boolean_a(32944)) break block4;
                                    i2 = this;
                                    n = 4;
                                    break block5;
                                }
                                if (!i.boolean_a(64)) break block6;
                                this.A();
                                var_byte_l = (byte)9;
                                this.br = 8;
                                this.void_a(-1);
                                this.bs = 0;
                                break block7;
                            }
                            if (!i.boolean_a(4097)) break block8;
                            i2 = this;
                            n = 0;
                            break block5;
                        }
                        if (!i.boolean_a(262146)) break block9;
                        i2 = this;
                        n = 2;
                        break block5;
                    }
                    if (!i.boolean_a(16388)) break block10;
                    i2 = this;
                    n = 3;
                    break block5;
                }
                if (!i.boolean_a(65544)) break block7;
                i2 = this;
                n = 1;
            }
            i2.var_int_j = n;
        }
        var_int_W = 0;
    }

    private void aV() {
        if (this.var_int_ap == 0 && this.var_int_aq == 13) {
            this.var_c_a = null;
            this.aP = 60;
            this.aQ = 3;
            return;
        }
        this.var_boolean_au = i.boolean_a(524288);
        this.var_boolean_A = !this.var_boolean_au;
        this.bd = 0;
        this.bc = 0;
        this.var_boolean_v = true;
        this.aP = this.var_int_av + 5 + 1;
    }

    private void aW() {
        boolean bl;
        block18: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        block17: {
                                            bl = false;
                                            if (!i.boolean_a(512)) break block17;
                                            this.var_boolean_aa = !this.var_boolean_aa;
                                            break block18;
                                        }
                                        if (!i.boolean_a(65536)) break block19;
                                        this.aZ += 50;
                                        break block18;
                                    }
                                    if (!i.boolean_a(131072)) break block20;
                                    this.bb += 5;
                                    break block18;
                                }
                                if (!i.boolean_a(262144)) break block21;
                                if (var_byte_m != 1) {
                                    int n;
                                    i i2;
                                    this.cA <<= 1;
                                    if (this.cA == 0) {
                                        i2 = this;
                                        n = 1;
                                    } else if (this.cA > 8) {
                                        i2 = this;
                                        n = i2.cA = 0;
                                    }
                                    i.var_byte_arr_i[10] = this.cA > 2 ? (byte)1 : 0;
                                }
                                break block18;
                            }
                            if (!i.boolean_a(524288)) break block22;
                            this.var_boolean_R = !this.var_boolean_R;
                            break block18;
                        }
                        if (!i.boolean_a(32768)) break block23;
                        var_byte_l = (byte)34;
                        break block18;
                    }
                    if (!i.boolean_a(1024)) break block24;
                    this.var_boolean_S = !this.var_boolean_S;
                    break block18;
                }
                if (i.boolean_a(64)) break block25;
                if (!i.boolean_a(32944)) break block18;
                i.var_byte_arr_i[8] = (byte)this.cz;
                i.var_byte_arr_i[9] = (byte)this.cA;
                if (this.var_boolean_R || this.var_boolean_S) {
                    int n;
                    int n2;
                    int n3;
                    for (n3 = 0; n3 <= 2; ++n3) {
                        n2 = this.int_e(n3);
                        if (n3 == 2) {
                            ++n2;
                        }
                        for (n = 0; n <= n2; ++n) {
                            this.void_a(n3, n, (byte)2);
                            this.void_a(n3, n, (byte)64);
                        }
                        this.void_a(n3, n2);
                    }
                    if (this.var_boolean_S) {
                        for (n3 = 0; n3 <= 2; ++n3) {
                            n2 = this.int_d(n3);
                            if (n3 == 0) {
                                --n2;
                            }
                            for (n = this.int_e(n3); n < n2; ++n) {
                                this.void_a(n3, n, (byte)2);
                                this.void_a(n3, n, (byte)64);
                            }
                            this.void_a(n3, n2 - 1);
                        }
                    }
                }
                this.int_d();
                this.int_e();
                this.G();
            }
            bl = true;
        }
        if (bl) {
            this.aX();
        }
        var_int_W = 0;
    }

    private void aX() {
        var_byte_l = var_byte_m;
        if (var_byte_m == 27) {
            this.var_boolean_aw = true;
            this.var_boolean_e = true;
        } else if (var_byte_m == 1) {
            this.B();
        }
        var_int_W = 0;
    }

    private void aY() {
        int n = 0;
        int n2 = 0;
        if (i.boolean_a(33008)) {
            this.aX();
            i.a(var_a_a, true);
            var_a_a = null;
        }
        if (i.boolean_a(4097)) {
            --this.df;
            if (this.df < 0) {
                this.df = 0;
            }
        }
        if (i.boolean_a(262146)) {
            ++this.df;
            if (this.df >= 2) {
                this.df = 1;
            }
        }
        n2 = this.var_int_arr_a[this.df];
        if (i.boolean_a(16388)) {
            --n2;
        }
        if (i.boolean_a(65544)) {
            ++n2;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        switch (this.df) {
            case 1: {
                int n3 = 9;
                break;
            }
            case 0: {
                int n3 = n = 115;
            }
        }
        if (n2 >= n) {
            n2 = n - 1;
        }
        this.var_int_arr_a[this.df] = n2;
        var_int_W = 0;
    }

    private void aZ() {
        if (!i.boolean_a(32944)) {
            return;
        }
        this.var_int_ao = 5;
        i.var_byte_arr_i[3] = (byte)this.var_int_ao;
        if (this.var_byte_i == 2) {
            this.t();
            return;
        }
        i.int_e(4, -500);
        var_byte_l = (byte)15;
        this.var_boolean_I = true;
        this.var_boolean_G = true;
        this.ct();
    }

    /*
     * Unable to fully structure code
     */
    private void ba() {
        block77: {
            block79: {
                block83: {
                    block92: {
                        block88: {
                            block90: {
                                block91: {
                                    block89: {
                                        block87: {
                                            block86: {
                                                block85: {
                                                    block84: {
                                                        block82: {
                                                            block81: {
                                                                block80: {
                                                                    block78: {
                                                                        block76: {
                                                                            if (this.var_boolean_aa && (i.boolean_a(524288) || i.boolean_a(131072))) {
                                                                                this.aV();
                                                                            }
                                                                            if (this.cl != 0 && !i.boolean_a(32944) || this.var_int_an != 0 || this.var_boolean_v || this.var_byte_n <= 0 || i.var_g_arr_a[0].f == 19 || this.var_boolean_C) {
                                                                                i.var_int_W = 0;
                                                                                return;
                                                                            }
                                                                            if (this.var_c_a != null) {
                                                                                if (i.boolean_a(32784)) {
                                                                                    this.var_c_a.void_a();
                                                                                } else if (i.boolean_a(32944)) {
                                                                                    this.var_c_a.var_boolean_b = true;
                                                                                }
                                                                                i.var_int_W = 0;
                                                                                return;
                                                                            }
                                                                            if (this.aT <= 0) break block76;
                                                                            var1_1 = true;
                                                                            if (i.boolean_a(4097)) {
                                                                                this.var_int_ak = -5;
                                                                            } else if (i.boolean_a(262146)) {
                                                                                this.var_int_ak = 5;
                                                                            } else if (i.boolean_a(16388)) {
                                                                                this.var_int_aj = -5;
                                                                            } else if (i.boolean_a(65544)) {
                                                                                this.var_int_aj = 5;
                                                                            } else if (!i.boolean_a(32784)) {
                                                                                if (i.boolean_a(32944)) {
                                                                                    this.bB();
                                                                                    i.var_int_W = 0;
                                                                                } else {
                                                                                    var1_1 = false;
                                                                                }
                                                                            }
                                                                            if (var1_1) {
                                                                                --this.aT;
                                                                                if (this.aT == 0) {
                                                                                    if ((byte)(i.var_int_arr_arr_a[this.aP][this.aQ] & 255) < 0) {
                                                                                        i.var_int_arr_arr_a[this.aP][this.aQ] = 32;
                                                                                    }
                                                                                    if (i.var_byte_arr_arr_a[this.aP][this.aQ] == 9) {
                                                                                        i.var_byte_arr_arr_a[this.aP][this.aQ] = -1;
                                                                                    }
                                                                                    this.var_long_b = 40L;
                                                                                    this.aR = 0;
                                                                                    this.aS = this.aS & -113 | 0;
                                                                                    this.n(this.int_f());
                                                                                }
                                                                                i.var_int_W = 0;
                                                                                return;
                                                                            }
                                                                            break block77;
                                                                        }
                                                                        if (!i.boolean_a(4097)) break block78;
                                                                        this.var_byte_j = 1;
                                                                        break block79;
                                                                    }
                                                                    if (!i.boolean_a(262146)) break block80;
                                                                    this.var_byte_j = (byte)3;
                                                                    break block79;
                                                                }
                                                                if (!i.boolean_a(16388)) break block81;
                                                                this.var_byte_j = (byte)4;
                                                                break block79;
                                                            }
                                                            if (!i.boolean_a(65544)) break block82;
                                                            this.var_byte_j = (byte)2;
                                                            break block79;
                                                        }
                                                        if (!i.boolean_a(32784)) break block83;
                                                        i.var_int_W = 0;
                                                        if (this.bS != this.aP || this.bT != this.aQ || (i.var_int_arr_arr_a[this.aP][this.aQ] & 255) != 4) break block84;
                                                        this.C(9);
                                                        this.cg();
                                                        break block79;
                                                    }
                                                    var1_2 = i.var_int_arr_arr_e == null ? 0 : i.int_a(i.var_int_arr_arr_e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                                                    if (var1_2 == 8 || var1_2 == 7) break block79;
                                                    var2_4 = this.aS & 7;
                                                    var3_5 = -1;
                                                    var4_6 = -1;
                                                    var5_7 = false;
                                                    if (i.var_byte_arr_i[9] < 2) break block85;
                                                    var6_8 = 0;
                                                    for (var7_9 = 0; var7_9 < 2; ++var7_9) {
                                                        var8_11 = var7_9 == 0 ? 1 : -1;
                                                        if ((var8_11 <= 0 || this.aP >= this.var_int_av - 3) && (var8_11 >= 0 || this.aP <= 3)) continue;
                                                        block15: for (var9_13 = 1; var9_13 <= 3; ++var9_13) {
                                                            var10_14 = this.aP + var8_11 * var9_13;
                                                            var11_15 = i.var_byte_arr_arr_a[var10_14][this.aQ];
                                                            var12_16 = i.var_int_arr_arr_a[var10_14][this.aQ] & 255;
                                                            if (var12_16 == 7 && (i.var_int_arr_arr_a[var10_14][this.aQ] >> 8 & 240) == 0) ** GOTO lbl-1000
                                                            if (var11_15 == 48 && (i.var_int_arr_arr_b[var10_14][this.aQ] & 8) != 0) continue;
                                                            switch (var11_15) {
                                                                case 11: 
                                                                case 19: 
                                                                case 43: {
                                                                    if (var8_11 <= 0) ** GOTO lbl95
                                                                    v0 = var6_8;
                                                                    v1 = 2;
                                                                    ** GOTO lbl98
lbl95:
                                                                    // 1 sources

                                                                    if (var8_11 >= 0) ** GOTO lbl99
                                                                    v0 = var6_8;
                                                                    v1 = 4;
lbl98:
                                                                    // 2 sources

                                                                    var6_8 = v0 | v1;
                                                                }
lbl99:
                                                                // 3 sources

                                                                case 0: 
                                                                case 1: 
                                                                case 8: 
                                                                case 9: 
                                                                case 14: 
                                                                case 47: 
                                                                case 48: {
                                                                    if (var9_13 == 1) ** GOTO lbl108
                                                                    if (var4_6 >= 0) ** GOTO lbl104
                                                                    var4_6 = var8_11 > 0 ? 2 : 4;
                                                                    ** GOTO lbl112
lbl104:
                                                                    // 1 sources

                                                                    var5_7 = true;
                                                                    var4_6 = var6_8 == 2 ? 2 : (var6_8 == 4 ? 4 : -1);
                                                                    v2 = 4;
                                                                    break;
lbl108:
                                                                    // 1 sources

                                                                    v2 = 4;
                                                                    break;
                                                                }
                                                                case -1: {
                                                                    continue block15;
                                                                }
lbl112:
                                                                // 2 sources

                                                                default: lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    v2 = 4;
                                                                }
                                                            }
                                                            var9_13 = v2;
                                                        }
                                                    }
                                                }
                                                if (i.var_byte_arr_i[9] < 1) break block86;
                                                this.var_byte_j = (byte)5;
                                                var6_8 = 0;
                                                var7_10 = new int[]{0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
                                                var8_12 = new int[]{-1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0};
                                                var13_17 = new int[]{0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8};
                                                for (var14_18 = 0; var14_18 < var7_10.length; ++var14_18) {
                                                    var15_19 = this.aP + var7_10[var14_18];
                                                    var16_20 = this.aQ + var8_12[var14_18];
                                                    if (var15_19 < 0 || var15_19 >= this.var_int_av || var16_20 < 0 || var16_20 >= this.var_int_aw) continue;
                                                    var17_21 = i.var_int_arr_arr_b[var15_19][var16_20] & 7;
                                                    var18_22 = false;
                                                    var19_23 = -1;
                                                    var20_24 = false;
                                                    switch (i.var_byte_arr_arr_a[var15_19][var16_20]) {
                                                        case 9: 
                                                        case 18: 
                                                        case 30: {
                                                            if (var13_17[var14_18] != 0) break;
                                                            var20_24 = true;
                                                            break;
                                                        }
                                                        case 46: 
                                                        case 49: 
                                                        case 50: {
                                                            if (var13_17[var14_18] != 0) break;
                                                            ++var6_8;
                                                            var20_24 = true;
                                                            break;
                                                        }
                                                        case 19: 
                                                        case 43: {
                                                            if ((i.var_int_arr_arr_b[var15_19][var16_20] & 248) != 0) break;
                                                            ** GOTO lbl147
                                                        }
                                                        case 45: {
                                                            if ((i.var_int_arr_arr_b[var15_19][var16_20] & 15) == 10) break;
lbl147:
                                                            // 2 sources

                                                            var18_22 = true;
                                                        }
                                                    }
                                                    if (var18_22) {
                                                        if (var13_17[var14_18] == 0) {
                                                            v3 = var14_18 + 1;
                                                        } else if (i.var_byte_arr_arr_b[var15_19][var16_20] >= 12) {
                                                            if ((var13_17[var14_18] & 1) != 0 && var17_21 == 3) {
                                                                if (var7_10[var14_18] == 0) {
                                                                    v3 = 1;
                                                                } else if (var7_10[var14_18] < 0) {
                                                                    v3 = 4;
                                                                } else if (var7_10[var14_18] > 0) {
                                                                    v3 = 2;
                                                                }
                                                            } else if ((var13_17[var14_18] & 8) != 0 && var17_21 == 2) {
                                                                if (var8_12[var14_18] == 0) {
                                                                    v3 = 4;
                                                                } else if (var8_12[var14_18] < 0) {
                                                                    v3 = 1;
                                                                } else if (var8_12[var14_18] > 0) {
                                                                    v3 = var19_23 = 3;
                                                                }
                                                            }
                                                        }
                                                        if (var19_23 != -1) {
                                                            var20_24 = true;
                                                            ++var6_8;
                                                        }
                                                    }
                                                    if (!var20_24) continue;
                                                    if (var6_8 == 0) {
                                                        if (var2_4 == var14_18 + 1) {
                                                            var3_5 = var2_4;
                                                            continue;
                                                        }
                                                        if (var3_5 >= 0) continue;
                                                        var3_5 = var14_18 + 1;
                                                        continue;
                                                    }
                                                    if (var6_8 == 1) {
                                                        var3_5 = var19_23;
                                                        continue;
                                                    }
                                                    var3_5 = var2_4;
                                                    break;
                                                }
                                            }
                                            if (var3_5 <= 0 || var4_6 != var2_4) break block87;
                                            this.var_byte_j = (byte)6;
                                            v4 = this;
                                            v5 = this.aS & -8;
                                            v6 = var2_4;
                                            break block88;
                                        }
                                        if (var3_5 <= 0 || var4_6 >= 0 || var5_7) break block89;
                                        v4 = this;
                                        v5 = this.aS & -8;
                                        v6 = var3_5;
                                        break block88;
                                    }
                                    if (var3_5 < 0 && var4_6 > 0 && !var5_7) break block90;
                                    if (!var5_7 || var2_4 != 2 && var2_4 != 4) break block91;
                                    this.var_byte_j = (byte)6;
                                    v4 = this;
                                    v5 = this.aS & -8;
                                    v6 = var2_4;
                                    break block88;
                                }
                                if (!var5_7 || var4_6 <= 0) break block92;
                            }
                            this.var_byte_j = (byte)6;
                            v4 = this;
                            v5 = this.aS & -8;
                            v6 = var4_6;
                        }
                        v4.aS = v5 | v6;
                    }
                    if (this.var_byte_j == 6 && (i.var_int_arr_arr_a[this.aP][this.aQ] & 255) == 2 && i.var_int_arr_arr_a[this.aP][this.aQ] >> 8 == 1) {
                        this.ay = -1;
                        this.b(this.aP, this.aQ, (byte)2);
                    }
                    break block79;
                }
                if (i.boolean_a(256)) {
                    this.ay = -1;
                    var1_3 = i.var_g_arr_a[0].f;
                    if (var1_3 == 36 + (this.aS & 7) - 1) {
                        if ((i.var_int_arr_arr_a[this.aP][this.aQ] & 255) == 4) {
                            this.cg();
                        } else {
                            this.C(2);
                            this.n(19);
                        }
                    }
                    switch (var1_3) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 34: 
                        case 35: {
                            if ((i.var_int_arr_arr_a[this.aP][this.aQ] & 255) == 4) {
                                this.cg();
                                break;
                            }
                            this.C(2);
                            this.n(19);
                        }
                    }
                } else if (i.boolean_a(32944)) {
                    this.bB();
                    i.var_int_W = 0;
                }
            }
            if (this.var_byte_j != 5 && this.var_byte_k == 0 && this.var_int_b == 0 && this.var_byte_j != (this.aS & 7)) {
                this.aS |= 4096;
            }
        }
    }

    private void bb() {
        if (this.dd >= 0 && this.dd <= 2) {
            var_int_W = 0;
            return;
        }
        if (i.boolean_a(4097)) {
            if (System.currentTimeMillis() - this.var_long_j < 300L) {
                return;
            }
            this.x();
            if (this.bo == 0 && this.bq == 1 && !this.var_boolean_W) {
                this.x();
            }
        } else if (i.boolean_a(262146)) {
            if (System.currentTimeMillis() - this.var_long_j < 300L) {
                return;
            }
            this.y();
            if (this.bo == 0 && this.bq == 1 && !this.var_boolean_W) {
                this.y();
            }
        } else if (i.boolean_a(32944)) {
            if (this.dd < 0 || this.dd > 2) {
                this.dd = 0;
                this.var_long_i = System.currentTimeMillis();
            }
        } else if (i.boolean_a(64)) {
            this.bc();
        }
        var_int_W = 0;
    }

    private void bc() {
        switch (this.bo) {
            case -1: {
                return;
            }
            case 5: {
                var_boolean_U = true;
                var_boolean_V = false;
                if (var_byte_l == 2) {
                    this.void_a(1);
                    this.B();
                    var_boolean_V = true;
                }
                if (var_byte_l != 4) break;
                this.void_a(0);
                this.C(19);
                return;
            }
            case 2: {
                var_byte_l = (byte)9;
                this.void_a(0);
                this.br = 8;
                this.bs = 0;
                return;
            }
            case 4: {
                this.void_a(2);
            }
        }
    }

    private void void_f(int n, int n2) {
        int[] nArray = new int[]{0, 1, -1, 0, 0};
        int[] nArray2 = new int[]{0, 0, 0, 1, -1};
        boolean bl = false;
        boolean bl2 = var_byte_arr_i[9] >= 8;
        boolean bl3 = false;
        switch (var_byte_arr_arr_a[n][n2]) {
            case 9: {
                if ((this.aS & 0x2000) != 0) break;
                this.aS |= 0x2000;
                bl = true;
                this.void_g(n, n2);
                break;
            }
            case 18: {
                boolean bl4 = this.boolean_c();
                break;
            }
            case 0: {
                bl3 = true;
                break;
            }
            case 30: {
                bl = true;
                if (var_int_arr_arr_b[n][n2] != 0) break;
                this.C(11);
                i.var_int_arr_arr_b[n][n2] = 1;
                break;
            }
            case 10: {
                if (this.var_byte_x != 3 || var_int_arr_arr_b[n][n2] > 0) break;
                bl = true;
                i.var_int_arr_arr_b[n][n2] = 1;
                this.void_b(n, n2);
                break;
            }
            case 16: {
                bl = true;
                bl3 = true;
                break;
            }
            default: {
                if (var_byte_arr_arr_a[n][n2] - 80 < 0 && ((var_int_arr_arr_a[n][n2] & 0xFF) != 7 || (var_int_arr_arr_a[n][n2] >> 8 & 0xF0) != 0)) break;
                bl3 = true;
                boolean bl4 = bl = true;
            }
        }
        if (bl3) {
            i.t(200);
            this.C(6);
            this.n(41 + (this.aS & 7) - 1);
        }
        if (!bl) {
            for (int j = 0; j < 5; ++j) {
                int n3;
                int n4 = n + nArray[j];
                int n5 = n2 + nArray2[j];
                if (n4 < 0 || n4 >= this.var_int_av || n5 < 0 || n5 >= this.var_int_aw) continue;
                byte by = var_byte_arr_arr_a[n4][n5];
                boolean bl5 = false;
                boolean bl6 = false;
                switch (by) {
                    case 1: {
                        if (n4 != this.aP - var_byte_arr_g[this.aS & 7] || n5 != this.aQ - var_byte_arr_g[(this.aS & 7) + 8]) break;
                        bl6 = true;
                        break;
                    }
                    case 19: 
                    case 43: 
                    case 45: 
                    case 46: 
                    case 49: {
                        boolean bl7;
                        n3 = var_int_arr_arr_b[n4][n5] & 7;
                        byte by2 = n3 == 0 ? (byte)0 : var_byte_arr_arr_b[n4][n5];
                        boolean bl8 = bl7 = by != 49 && by != 46;
                        if (i.a(n, n2, 0, 0, n4, n5, n3, by2)) {
                            bl6 = true;
                            bl5 = bl7;
                        }
                        if (!bl6) break;
                        this.C(10);
                    }
                }
                if (bl2 && bl6 && (n4 != this.aP || n5 != this.aQ)) {
                    boolean bl9 = this.boolean_b(n4, n5);
                    n3 = bl9 ? 1 : 0;
                    if (!bl9) continue;
                    this.aS |= 0x2000;
                    continue;
                }
                if (!bl5) continue;
                this.aS |= 0x2000;
                if (by == 45) {
                    n3 = (var_int_arr_arr_b[n4][n5] & 0x1C00) >> 10;
                    if (n3 == 3) {
                        i.var_byte_arr_arr_a[n4][n5] = -1;
                        this.p(n4, n5);
                        continue;
                    }
                    i.var_int_arr_arr_b[n4][n5] = 0xA | ++n3 << 10;
                    i.var_int_arr_arr_b[n4][n5] = var_int_arr_arr_b[n4][n5] & 0xFFFFFF07 | 0x78;
                    i.var_byte_arr_arr_b[n4][n5] = 0;
                    continue;
                }
                this.c(by, n4, n5);
            }
        }
    }

    private void void_g(int n, int n2) {
        if (i.boolean_a(n, n2)) {
            return;
        }
        i.q(n, n2);
        int n3 = this.boolean_d(n, n2 - 1) ? 2 : 1;
        switch ((var_int_arr_arr_b[n][n2] & 0xFC00000) >> 22) {
            case 39: {
                i.var_byte_arr_arr_a[n][n2] = 49;
                i.var_int_arr_arr_b[n][n2] = n3;
                return;
            }
            case 37: {
                int n4;
                int n5;
                byte[] byArray;
                if ((var_int_arr_arr_b[n][n2] & 0x10000000) != 0) {
                    byArray = var_byte_arr_arr_a[n];
                    n5 = n2;
                    n4 = 43;
                } else {
                    byArray = var_byte_arr_arr_a[n];
                    n5 = n2;
                    n4 = 19;
                }
                byArray[n5] = n4;
                i.var_int_arr_arr_b[n][n2] = n3;
                this.c(19, n, n2);
                return;
            }
            case 35: {
                i.var_byte_arr_arr_a[n][n2] = 45;
                i.var_int_arr_arr_b[n][n2] = var_int_arr_arr_b[n][n2] & 0xFFFFFFF0 | 0xA;
                return;
            }
            case 34: {
                i.var_byte_arr_arr_a[n][n2] = 1;
                this.void_c(n, n2);
                return;
            }
            case 36: {
                i.var_byte_arr_arr_a[n][n2] = 46;
                i.var_int_arr_arr_b[n][n2] = 0;
                i.var_byte_arr_arr_b[n][n2] = 0;
            }
        }
    }

    private boolean boolean_c() {
        if (this.var_byte_x == 3) {
            int n = var_int_arr_arr_a[this.aP][this.aQ] & 0xFF;
            if (this.cf == 0 && n != 15 && n != 16) {
                int n2;
                i i2;
                this.C(0);
                if (this.ce <= 0) {
                    i2 = this;
                    n2 = 1;
                } else {
                    i2 = this;
                    n2 = -1;
                }
                i2.cf = n2;
            }
            return true;
        }
        return false;
    }

    private void c(int n, int n2, int n3) {
        int n4 = var_int_arr_arr_b[n2][n3];
        if (n == 43 && (n4 & 0xF8) == 0) {
            if ((n4 & 0x18000) == 0) {
                i.var_byte_arr_arr_a[n2][n3] = -1;
                this.p(n2, n3);
                return;
            }
            n4 -= 32768;
            n4 = n4 & 0xFF01FFFF | n2 << 17;
            n4 = ((n4 = n4 & 0x80FFFFFF | n3 << 24) & 7) == 1 || (n4 & 7) == 3 ? n4 | Integer.MIN_VALUE : n4 & Integer.MAX_VALUE;
        }
        i.var_int_arr_arr_b[n2][n3] = n4 = n4 & 0xFFFFFF07 | 0x78;
    }

    private void bd() {
        int n;
        int n2;
        int[] nArray;
        int n3 = var_int_arr_arr_a[this.bE][this.bF] >> 8;
        if (++n3 >= 16) {
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = -1;
        } else {
            i.var_byte_arr_arr_c[this.bE][this.bF] = 24;
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = n3 << 8 | 0x24;
        }
        nArray[n2] = n;
    }

    private void void_h(int n, int n2) {
        switch (var_byte_arr_arr_a[n][n2]) {
            case 0: {
                this.C(11);
            }
            case 19: 
            case 43: 
            case 45: 
            case 46: {
                i.var_int_arr_arr_a[n][n2] = -1;
                this.p(n, n2);
                return;
            }
            case 48: {
                i.var_int_arr_arr_a[n][n2] = -1;
                this.p(n, n2);
                int n3 = n2 + 1;
                if (var_byte_arr_arr_a[n][n3] != 48) {
                    n3 = -1;
                }
                i.var_byte_arr_arr_a[n][n3] = -1;
                this.p(n, n3);
                int n4 = (var_int_arr_arr_b[n][n2] >> 24) * 3;
                i.var_byte_arr_e[n4 + 2] = -1;
                return;
            }
        }
        i.var_int_arr_arr_a[n][n2] = -1;
    }

    private void be() {
        int n;
        i i2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl;
        block104: {
            block105: {
                if (this.var_boolean_a) {
                    --this.var_int_a;
                }
                if ((this.var_boolean_f || this.var_boolean_aj) && aN > 140) {
                    if (this.var_boolean_aj) {
                        this.int_d();
                    }
                    this.var_boolean_f = false;
                    this.var_boolean_aj = false;
                    this.var_boolean_J = true;
                    this.bs = 0;
                    this.void_g();
                    this.var_boolean_H = true;
                    var_byte_l = (byte)28;
                }
                bl = this.boolean_b();
                if (this.var_boolean_am) {
                    this.var_boolean_am = false;
                    if (this.dv < this.dw) {
                        n6 = i.a((byte)this.dv, (byte)13, (byte)7);
                        n5 = i.a((byte)this.dv, (byte)20, (byte)7);
                        this.v(n6, n5);
                        ++this.dv;
                    } else {
                        this.dv = 0;
                        this.dw = 0;
                    }
                }
                if (var_g_arr_a[4] != null) {
                    var_g_arr_a[4].b();
                }
                if (this.bj > 0) {
                    --this.bj;
                }
                if (this.dk > 0) {
                    --this.dk;
                    if (this.dk == 0) {
                        this.var_java_lang_String_e = null;
                    }
                }
                if (this.var_int_S != this.var_int_T) {
                    int n7 = n6 = this.var_int_S;
                    while (n7 != this.var_int_T) {
                        int n8 = n6;
                        var_byte_arr_b[n8] = (byte)(var_byte_arr_b[n8] + 1);
                        int n9 = n5 = var_byte_arr_c[n6] < 0 ? i.a(var_a_arr_a[2], 0) : var_a_arr_a[9].int_a(var_byte_arr_c[n6]);
                        if (var_byte_arr_b[n6] >= n5) {
                            ++this.var_int_S;
                            this.var_int_S &= 7;
                        }
                        n7 = n6 + 1 & 7;
                    }
                }
                if (this.var_byte_i != 0) {
                    this.bq();
                    if (var_byte_l != 1) {
                        return;
                    }
                }
                if ((aN & 0xF) == 0) {
                    this.bp();
                }
                if (this.cf == 0 || (aN >> 1 & 1) != 0) break block104;
                this.ce += this.cf;
                if (this.ce != 0 && this.ce != 9) break block105;
                this.cf = 0;
                for (n6 = 1; n6 < this.var_int_aw - 1; ++n6) {
                    for (n5 = 1; n5 < this.var_int_av - 1; ++n5) {
                        n4 = var_int_arr_arr_a[n5][n6] & 0xFF;
                        n3 = var_byte_arr_arr_a[n5][n6];
                        if (n4 != 15 && n4 != 16 && n3 != 34 && n3 != 35) continue;
                        this.void_c(n5, n6);
                    }
                }
                break block104;
            }
            if (this.ce != 5) break block104;
            n6 = this.var_int_aw - 1;
            n5 = this.var_int_av - 1;
            for (n4 = 1; n4 < n6; ++n4) {
                for (n3 = 1; n3 < n5; ++n3) {
                    boolean bl2;
                    block111: {
                        block107: {
                            int n10;
                            block110: {
                                int n11;
                                int[] nArray;
                                byte by;
                                block109: {
                                    block108: {
                                        block106: {
                                            n2 = var_int_arr_arr_a[n3][n4] & 0xFF;
                                            by = var_byte_arr_arr_a[n3][n4];
                                            bl2 = false;
                                            if (n2 != 15) break block106;
                                            this.void_h(n3, n4);
                                            i.var_byte_arr_arr_a[n3][n4] = 34;
                                            break block107;
                                        }
                                        if (n2 != 16) break block108;
                                        this.void_h(n3, n4);
                                        i.var_byte_arr_arr_a[n3][n4] = 35;
                                        break block107;
                                    }
                                    if (by != 34) break block109;
                                    nArray = var_int_arr_arr_a[n3];
                                    n11 = n4;
                                    n10 = 15;
                                    break block110;
                                }
                                if (by != 35) break block111;
                                nArray = var_int_arr_arr_a[n3];
                                n11 = n4;
                                n10 = 16;
                            }
                            nArray[n11] = n10;
                            i.var_byte_arr_arr_a[n3][n4] = -1;
                            this.t(n3, n4);
                        }
                        bl2 = true;
                    }
                    if (!bl2) continue;
                    i.q(n3, n4);
                }
            }
        }
        --this.var_long_b;
        if (this.aW > 0 && --this.aW == 0) {
            this.bl();
        }
        if (this.aR <= 0 && this.var_boolean_u) {
            this.var_boolean_u = false;
            this.C(9);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {}
            this.cf();
        }
        if (var_a_arr_a[11] != null) {
            this.bo();
        }
        if (this.bi != 0 && this.bg != 0) {
            this.bn();
        }
        this.bF();
        if (this.var_int_al > 0) {
            this.bf();
        }
        this.co();
        if (this.cl != 0) {
            this.bE();
        }
        if (this.var_c_a != null) {
            this.var_int_am = 70;
            if (this.var_c_a.boolean_a() && this.var_c_a.byte_arr_b() == null) {
                this.var_c_a = null;
            }
            if (this.var_c_a != null) {
                this.var_c_a.void_b();
            }
        } else if (this.bm != -1) {
            this.u(this.bm);
            this.bm = -1;
            this.var_byte_j = 0;
        }
        if (this.aT > 0) {
            if (var_byte_arr_arr_a[this.aP][this.aQ] < 0) {
                int n12;
                int n13;
                i i3;
                if (var_byte_arr_arr_a[this.aP][this.aQ + 1] == 9 && (var_int_arr_arr_b[this.aP][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    i3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else if (var_byte_arr_arr_a[this.aP - 1][this.aQ + 1] == 9 && (var_int_arr_arr_b[this.aP - 1][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    --this.aP;
                    i3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else if (var_byte_arr_arr_a[this.aP + 1][this.aQ + 1] == 9 && (var_int_arr_arr_b[this.aP + 1][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    ++this.aP;
                    i3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else {
                    i3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 0;
                }
                i3.aS = n13 | n12;
            }
            i2 = this;
            n = var_byte_arr_arr_b[this.aP][this.aQ];
        } else if ((this.var_byte_k == 0 || this.aR <= 0 && this.var_byte_k != 5) && !this.var_boolean_v && (this.aS & 0x70) == 0 && this.aA == -1) {
            this.var_byte_k = this.var_byte_j;
            n6 = 0;
            if (this.var_int_an > 0) {
                this.var_byte_k = (byte)2;
                --this.var_int_an;
                if (this.var_int_an == 0) {
                    this.void_j(this.aP - 1, this.aQ);
                    this.var_byte_j = 0;
                    var_int_W = 0;
                }
            } else if (bl) {
                i.q(this.aP, this.aQ);
            }
            switch (this.var_byte_k) {
                case 3: {
                    this.aS &= 0xFFFFFFF7;
                }
                case 1: 
                case 2: 
                case 4: {
                    if (i.var_g_arr_a[0].f == 40 || i.var_g_arr_a[0].f == 48) break;
                    if ((this.aS & 0x1000) == 0) {
                        n6 = this.boolean_a((int)(-var_byte_arr_g[this.var_byte_k]), (int)(-var_byte_arr_g[this.var_byte_k + 8]), false) ? 1 : 0;
                        bl = this.boolean_b();
                        if (n6 == 0) break;
                        this.var_int_a = 40;
                        this.var_boolean_a = false;
                        n5 = this.var_byte_k - 1;
                        if (n5 < 0) {
                            n5 = 0;
                        }
                        if ((this.aS & 8) != 0) {
                            if (this.var_byte_k == 2) {
                                this.n(8);
                                break;
                            }
                            this.n(9);
                            break;
                        }
                        this.n(4 + n5);
                        break;
                    }
                    this.aS = this.aS & 0xFFFFFFF8 | this.var_byte_k;
                    this.aR = 18;
                    n5 = this.var_byte_k - 1;
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    this.n(0 + n5);
                    break;
                }
                case 6: {
                    int n14 = n5 = (this.aS & 7) == 2 ? 1 : -1;
                    if (!bl || var_byte_arr_arr_a[this.aP + n5][this.aQ] >= 0) break;
                    this.n(n5 == -1 ? 22 : 20);
                    i.var_byte_arr_arr_a[this.aP + n5][this.aQ] = 32;
                    i.var_byte_arr_arr_b[this.aP + n5][this.aQ] = 18;
                    i.var_int_arr_arr_b[this.aP + n5][this.aQ] = 4 | (n5 > 0 ? 1 : 0);
                    i.var_byte_arr_arr_c[this.aP + n5][this.aQ] = 30;
                    this.aR = 72;
                    this.var_byte_j = 0;
                    break;
                }
                case 5: {
                    this.aR = 0;
                    n4 = this.aS & 7;
                    if (!this.boolean_b()) break;
                    this.n(13 + n4 - 1);
                    break;
                }
                case 0: {
                    int n15;
                    i i4;
                    this.aS &= 0xFFFFFFF7;
                    n3 = 0;
                    switch (i.var_g_arr_a[0].f) {
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
                            if ((this.aS & 0x4000) != 0) break;
                            n3 = 1;
                        }
                    }
                    if (n3 != 0) {
                        n2 = 0 + (this.aS & 7) - 1;
                        if (n2 < 0) {
                            n2 = 0;
                        }
                        this.n(n2);
                    }
                    if (this.var_c_a == null) {
                        i4 = this;
                        n15 = 6;
                    } else {
                        i4 = this;
                        n15 = i4.aX = 0;
                    }
                    if (this.aR <= 0) break;
                    this.aR -= 6;
                }
            }
            if (bl) {
                n5 = var_byte_arr_arr_a[this.aP][this.aQ - 1];
                if (n6 == 0 && this.var_byte_k != 5 && this.aR <= 0 && (n5 == 0 || n5 == 9 || n5 == 8 || n5 == 48) && (var_int_arr_arr_a[this.aP][this.aQ] & 0xFF) != 35) {
                    n4 = 0;
                    if (var_int_arr_arr_e != null) {
                        n4 = i.int_a(var_int_arr_arr_e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                    }
                    if (!this.var_boolean_j || n4 == 0 && n4 != 3) {
                        if ((this.aS & 8) == 0 && i.var_g_arr_a[0].f != 11 && i.var_g_arr_a[0].f != 10 && i.var_g_arr_a[0].f != 12) {
                            this.n(11);
                        }
                        this.var_boolean_a = true;
                        if (this.var_int_a <= 0) {
                            this.var_int_a = 40;
                            this.var_long_b = 0L;
                            this.void_a((int)var_byte_arr_i[8], 32, 0);
                            return;
                        }
                    }
                }
            }
            if (n6 != 0) {
                this.var_boolean_w = false;
            } else if (bl && (aN & 0x1F) == 0) {
                n5 = var_byte_arr_arr_a[this.aP][this.aQ - 1] == 0 ? 1 : 0;
                for (n4 = 1; n5 == 0 && n4 <= 4; n5 |= this.boolean_a((int)var_byte_arr_g[n4], (int)var_byte_arr_g[n4 + 8], true), ++n4) {
                }
                if (n5 == 0) {
                    if (this.var_boolean_w) {
                        this.n(19);
                    } else {
                        this.var_boolean_w = true;
                    }
                }
            }
        } else {
            if (this.var_boolean_v && this.aR <= 0) {
                byte by;
                i i5;
                if (this.var_boolean_au) {
                    i5 = this;
                    by = this.var_byte_p;
                } else {
                    i5 = this;
                    by = this.var_byte_q;
                }
                i5.var_byte_k = by;
                this.aS = this.aS & 0xFFFFFFF8 | this.var_byte_k;
                this.aP += -var_byte_arr_g[this.var_byte_k];
                this.aQ += -var_byte_arr_g[this.var_byte_k + 8];
                bl = this.boolean_b();
                this.aR = 18;
                if (i.var_g_arr_a[0].f != 4) {
                    this.n(4 + this.var_byte_k - 1);
                }
            }
            if ((this.aS & 0x70) <= 32 || (this.aS & 0x800) != 0) {
                this.aR -= 6;
                if (this.aR <= 0) {
                    this.aS &= 0xFFFFEF8F;
                    i2 = this;
                    n = i2.aR = 0;
                }
            }
        }
        if (this.cl == 0) {
            if (this.var_boolean_C) {
                this.ck = 8;
                if (this.boolean_f()) {
                    this.d(this.bS, this.bT, 5);
                    this.var_boolean_C = false;
                }
            } else if (this.var_c_a == null) {
                if (var_boolean_ak && this.var_byte_k != 0) {
                    var_boolean_ak = false;
                    this.var_int_am = 0;
                }
                if (!var_boolean_ak) {
                    this.void_c();
                }
            } else {
                this.var_int_ar = this.var_int_at;
                this.var_int_as = this.var_int_au;
            }
        }
        if (this.var_byte_k != 0 && bl) {
            this.var_boolean_l = var_byte_arr_arr_a[this.aP][this.aQ + 1] >= 0;
        }
        this.bm();
        if (this.var_boolean_v && (this.aP < -5 || this.aP > this.var_int_av + 5 || this.aQ < -5 || this.aQ > this.var_int_aw + 5)) {
            this.z();
            if (this.var_boolean_au || this.var_int_aq >= this.dM) {
                this.bs = 0;
                this.br = 12;
                var_byte_l = (byte)35;
            } else {
                var_byte_l = (byte)20;
                this.bs = 0;
                this.bh();
                this.N();
                i.int_e(6, this.bb);
                this.E();
            }
            this.void_g();
            this.aM = -1;
        }
    }

    private byte byte_a(int n, int n2, int n3, int n4) {
        int n5 = n + n2;
        if ((n > 0 && n3 == 0 || n < n3 && n3 > 0) && (var_byte_arr_arr_a[n5][n4] < 0 || var_byte_arr_arr_a[n5][n4] == 31 || i.int_d(n5, n4) >= 0)) {
            while (((n = n5) > 0 && n3 == 0 || n < n3 && n3 > 0) && (var_byte_arr_arr_a[n5 += n2][n4] < 0 || i.int_d(n5, n4) >= 0 || var_byte_arr_arr_a[n5][n4] == 31)) {
            }
        }
        return (byte)n;
    }

    private static boolean boolean_a(int n, int n2) {
        if (var_byte_arr_e == null) {
            return false;
        }
        for (int j = 0; j < var_byte_arr_e.length; j += 3) {
            if (var_byte_arr_e[j + 2] != n2 || var_byte_arr_e[j + 0] - 1 != n && var_byte_arr_e[j + 1] + 1 != n) continue;
            return true;
        }
        return false;
    }

    private void bf() {
        int n = this.var_int_av - 1;
        for (int j = 0; j < var_byte_arr_e.length; j += 3) {
            byte by = var_byte_arr_e[j + 2];
            if (by <= 0) continue;
            byte by2 = var_byte_arr_e[j + 1];
            int n2 = var_byte_arr_e[j + 0];
            int n3 = this.byte_a(n2, -1, 0, (int)by);
            i.var_byte_arr_e[j + 0] = n3;
            n2 = n3;
            byte by3 = this.byte_a((int)by2, 1, n, (int)by);
            i.var_byte_arr_e[j + 1] = by3;
            by2 = by3;
            for (int k = n2; k <= by2; ++k) {
                this.boolean_b(k, by);
            }
        }
    }

    private boolean boolean_b(int n, int n2) {
        int n3 = i.int_d(n, n2);
        int n4 = 0;
        if (n3 >= 0) {
            if (n3 == 37 && var_byte_arr_arr_a[n][n2] == 43) {
                n4 = 0x10000000;
            }
            i.q(n, n2);
            i.var_byte_arr_arr_a[n][n2] = 9;
            i.var_int_arr_arr_b[n][n2] = var_int_arr_arr_b[n][n2] & 0xF03FFFFF | n3 << 22 | n4;
            this.d(n, n2, 1);
        }
        int n5 = (this.aS & 0x4000) == 0 ? 0 : 3;
        g g2 = var_g_arr_a[n5];
        if (this.boolean_d(n, n2) && this.aT <= 0 && g2.f != 40 && g2.f != 48 && g2.f != 47) {
            this.void_a(0, 16, 0);
        }
        return n3 >= 0;
    }

    private static int int_d(int n, int n2) {
        if (var_byte_arr_arr_a[n][n2] < 0) {
            return -1;
        }
        switch (var_byte_arr_arr_a[n][n2]) {
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
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private void bg() {
        var1_1 = this.aM;
        var2_2 = i.var_a_arr_a[41];
        var3_3 = this.var_javax_microedition_lcdui_Graphics_a;
        var3_3.setColor(2496263);
        var3_3.fillRect(0, 0, 240, 320);
        switch (var1_1) {
            case 5: {
                if (this.bd == 0) {
                    if ((this.var_byte_u & 32) != 0) {
                        var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[5][0], 200, 237, 0);
                        if (var1_1 == 5 && i.aN < (var7_5 = (var6_4 = i.var_a_arr_a[9]).int_a(0)) * 2) {
                            var6_4.a(var3_3, 0, i.aN * 2, 200, 237, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[28][0], 180, 254, 0);
                }
            }
            case 4: {
                if (var1_1 != 4 || (var4_9 = -100 + i.aN * 10) > 0) {
                    var4_9 = 0;
                }
                i.var_g_arr_a[0].var_a_a.a(var3_3, 12, 0, 7 + var4_9, 243, 0, 0, 0);
                var2_2.b(var3_3, i.var_java_lang_String_arr_a[44], 120, 243, 17);
                var6_4 = String.valueOf(this.bd);
                var2_2.b(var3_3, (String)var6_4, 120, 255, 17);
                if (this.bc == 0) {
                    if ((this.var_byte_u & 16) != 0) {
                        var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[5][0], 200, 179, 0);
                        if (var1_1 == 4 && i.aN < (var8_10 = (var7_6 = i.var_a_arr_a[9]).int_a(0)) * 2) {
                            var7_6.a(var3_3, 0, i.aN >> 1, 200, 179, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[28][0], 180, 196, 0);
                }
            }
            case 3: {
                if (var1_1 != 3 || (var4_9 = -100 + i.aN * 10) > 0) {
                    var4_9 = 0;
                }
                i.var_g_arr_a[0].var_a_a.a(var3_3, 10, 0, 7 + var4_9, 189, 0, 0, 0);
                var2_2.b(var3_3, i.var_java_lang_String_arr_a[43], 120, 185, 17);
                var6_4 = String.valueOf(this.bc);
                var2_2.b(var3_3, (String)var6_4, 120, 197, 17);
                if (this.bb == this.ba) {
                    if ((this.var_byte_u & 8) != 0) {
                        var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[5][0], 200, 121, 0);
                        if (var1_1 == 3 && i.aN < (var8_10 = (var7_7 = i.var_a_arr_a[9]).int_a(0)) * 2) {
                            var7_7.a(var3_3, 0, i.aN >> 1, 200, 121, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[28][0], 180, 138, 0);
                }
            }
            case 2: {
                if (var1_1 != 2 || (var4_9 = -100 + i.aN * 10) > 0) {
                    var4_9 = 0;
                }
                i.var_a_arr_a[i.int_a(3)].a(var3_3, 0, 7 + var4_9, 127, 0, 0, 0);
                var2_2.b(var3_3, i.var_java_lang_String_arr_a[114], 120, 127, 17);
                var6_4 = this.bb + "/" + this.ba;
                var2_2.b(var3_3, (String)var6_4, 120, 139, 17);
                if (this.aZ == this.aY) {
                    if ((this.var_byte_u & 4) != 0) {
                        var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[5][0], 200, 63, 0);
                        if (var1_1 == 2 && i.aN < (var8_10 = (var7_8 = i.var_a_arr_a[9]).int_a(0)) >> 1) {
                            var7_8.a(var3_3, 0, i.aN * 2, 200, 63, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(i.var_javax_microedition_lcdui_Image_arr_arr_a[28][0], 180, 80, 0);
                }
            }
            case 1: {
                if (var1_1 != 1 || (var4_9 = -100 + i.aN * 10) > 0) {
                    var4_9 = 0;
                }
                i.var_a_arr_a[i.int_a(2)].a(var3_3, 0, 7 + var4_9, 69, 0, 0, 0);
                var2_2.b(var3_3, i.var_java_lang_String_arr_a[109], 120, 69, 17);
                if (var1_1 != 1 || (var7_5 = i.aN >> 1) > this.aZ) {
                    var7_5 = this.aZ;
                }
                var6_4 = var7_5 + "/" + this.aY;
                var2_2.b(var3_3, (String)var6_4, 120, 81, 17);
            }
            case 0: {
                if (var1_1 != 0) ** GOTO lbl70
                var4_9 = -100 + i.aN * 10;
                var5_11 = var4_9 - 240;
                if (var4_9 > 0) {
                    var4_9 = 0;
                }
                if (var5_11 <= 0) ** GOTO lbl72
                ** GOTO lbl71
lbl70:
                // 1 sources

                var4_9 = 0;
lbl71:
                // 2 sources

                var5_11 = 0;
lbl72:
                // 2 sources

                var2_2.a(var3_3, i.var_java_lang_String_arr_a[i.var_int_arr_arr_g[this.var_int_ap][this.var_int_aq]], 120 + var4_9, 10, 17);
                var2_2.a(var3_3, i.var_java_lang_String_arr_a[41], 120 + var5_11, 25, 17);
            }
        }
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_String_arr_a[this.aM == 5 ? 98 : 53], 5, 318, 36);
    }

    public static int a(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8;
    }

    public static int b(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 3] & 0xFF) << 24;
    }

    private static int int_e(int n, int n2) {
        int n3 = i.a(var_byte_arr_i, n);
        if ((n3 += n2) < 0) {
            n3 = 0;
        }
        i.var_byte_arr_i[n] = (byte)(n3 & 0xFF);
        i.var_byte_arr_i[n + 1] = (byte)(n3 >> 8 & 0xFF);
        return n3;
    }

    private void bh() {
        for (int j = 0; j < this.var_int_X; ++j) {
            this.void_a(this.var_int_ap, this.var_int_aq, var_byte_arr_d[j << 1] & 0xFF, var_byte_arr_d[(j << 1) + 1] & 0xFF);
        }
    }

    private int int_d() {
        return i.int_e(4, this.aZ);
    }

    private int int_e() {
        return i.int_e(6, this.bb);
    }

    private void q(int n) {
        switch (n) {
            case 0: {
                dg = 0;
                dh = 0;
                di = 0;
                this.var_byte_t = this.byte_a(this.var_int_ap, this.var_int_aq);
                this.var_byte_u = 0;
                return;
            }
            case 1: {
                dg = i.a(var_byte_arr_i, 4);
                dg += this.aZ;
                this.var_boolean_s = false;
                return;
            }
            case 2: {
                i.var_byte_arr_i[4] = (byte)(dg & 0xFF);
                i.var_byte_arr_i[5] = (byte)(dg >> 8 & 0xFF);
                return;
            }
            case 3: {
                dh = i.a(var_byte_arr_i, 6);
                dh += this.bb;
                return;
            }
            case 4: {
                i.var_byte_arr_i[6] = (byte)(dh & 0xFF);
                i.var_byte_arr_i[7] = (byte)(dh >> 8 & 0xFF);
                return;
            }
            case 5: {
                di = var_byte_arr_i[2];
                this.var_int_J = 0;
                if ((di & 8) == 0 && dh >= f.b[1]) {
                    this.var_int_J = 1;
                    return;
                }
                if ((di & 0x10) != 0 || dh < f.b[2]) break;
                this.var_int_J = 2;
                return;
            }
            case 6: {
                try {
                    i.var_javax_microedition_lcdui_Image_arr_arr_a[28] = i.javax_microedition_lcdui_Image_arr_a("/ui.f", 4);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 7: {
                this.void_a(this.var_int_ap, this.var_int_aq, (byte)2);
                this.var_int_K = 0;
                return;
            }
            case 8: {
                int n2;
                int n3;
                for (n3 = n2 = (di & 0xE0) >> 5; n3 < 4 && dg >= f.var_int_arr_a[n3]; ++n3) {
                }
                if (n2 < n3) {
                    var_byte_arr_i[2] = (byte)(var_byte_arr_i[2] & 0xFFFFFF1F);
                    var_byte_arr_i[2] = (byte)(var_byte_arr_i[2] | n3 << 5 & 0xE0);
                    this.G();
                    this.var_int_K = n3;
                }
            }
            case 9: {
                this.bh();
                return;
            }
            case 10: {
                this.void_g();
                System.gc();
                return;
            }
            case 11: {
                if (this.var_int_ao < 99 && this.aZ == this.aY && (this.var_byte_t & 4) == 0) {
                    this.void_a(this.var_int_ap, this.var_int_aq, (byte)4);
                    this.var_byte_u = (byte)(this.var_byte_u | 4);
                    ++this.var_int_ao;
                }
                if (this.var_int_ao < 99 && this.bb == this.ba && (this.var_byte_t & 8) == 0) {
                    this.void_a(this.var_int_ap, this.var_int_aq, (byte)8);
                    this.var_byte_u = (byte)(this.var_byte_u | 8);
                    ++this.var_int_ao;
                }
                if (this.var_int_ao < 99 && this.bc == 0 && (this.var_byte_t & 0x10) == 0) {
                    this.void_a(this.var_int_ap, this.var_int_aq, (byte)16);
                    this.var_byte_u = (byte)(this.var_byte_u | 0x10);
                    ++this.var_int_ao;
                }
                if (this.var_int_ao < 99 && this.bd == 0 && (this.var_byte_t & 0x20) == 0) {
                    this.void_a(this.var_int_ap, this.var_int_aq, (byte)32);
                    this.var_byte_u = (byte)(this.var_byte_u | 0x20);
                    ++this.var_int_ao;
                }
                this.bj();
                this.E();
                this.var_boolean_H = false;
                this.var_boolean_G = true;
            }
        }
    }

    private void bi() {
        switch (this.aM) {
            case 0: {
                if (aN <= 40 && !this.var_boolean_s) break;
                ++this.aM;
                this.void_g();
                return;
            }
            case 1: {
                if ((aN <= this.aZ << 1 || aN <= 40) && !this.var_boolean_s) break;
                ++this.aM;
                this.void_g();
                return;
            }
            case 2: {
                if (aN <= 40 && !this.var_boolean_s) break;
                ++this.aM;
                this.void_g();
                return;
            }
            case 3: {
                if (aN <= 10 && !this.var_boolean_s) break;
                ++this.aM;
                this.void_g();
                return;
            }
            case 4: {
                if (aN <= 10 && !this.var_boolean_s) break;
                ++this.aM;
                this.void_g();
                this.var_boolean_s = false;
            }
        }
    }

    private long long_a(int n) {
        for (int j = 0; j < 12; ++j) {
            for (int k = 0; k < 12; ++k) {
                long l = var_long_arr_arr_a[j][k];
                if (l == 0L || i.a(l, (byte)6, (byte)5) != n) continue;
                return l;
            }
        }
        return -1L;
    }

    private void bj() {
        long l = this.long_a(this.var_int_aq);
        if ((this.var_int_aq == 0 || i.a(l, (byte)11, (byte)3) > 1) && l >= 0L && (this.byte_a(this.var_int_ap, this.var_int_aq + 1) & 0x40) == 0) {
            eb = this.var_int_aq + 1;
            this.void_a(this.var_int_ap, eb, (byte)64);
            this.var_boolean_ab = true;
            return;
        }
        eb = this.var_int_aq;
    }

    private void bk() {
        this.ct();
    }

    private void d(int n, int n2, int n3) {
        int n4 = this.var_int_T << 1;
        i.var_byte_arr_a[n4] = (byte)n;
        i.var_byte_arr_a[n4 + 1] = (byte)n2;
        i.var_byte_arr_c[this.var_int_T] = (byte)n3;
        i.var_byte_arr_b[this.var_int_T] = 0;
        this.var_int_T = this.var_int_T + 1 & 7;
    }

    private void bl() {
        --this.var_int_ao;
        ++this.bd;
        if (this.var_int_ao >= 0) {
            this.cg();
            this.var_byte_n = var_byte_arr_i[8];
            this.B();
            this.aS = 0;
            this.aT = 0;
            this.var_byte_k = 0;
            this.var_byte_j = 0;
            return;
        }
        var_byte_l = (byte)12;
    }

    private void r(int n) {
        if (n < 0) {
            return;
        }
        byte by = var_byte_arr_q[n];
        byte by2 = var_byte_arr_r[n];
        int n2 = var_int_arr_arr_a[by][by2] & 0xFF;
        int n3 = var_int_arr_arr_a[by][by2] >> 8;
        if ((n3 & 0xF0) != 0) {
            return;
        }
        if (n2 != 7 || (n3 & 0xFF00) >> 8 != n) {
            System.out.println("!!!!!!!!!!!!!! door missing");
        }
        int n4 = n3 & 0xF;
        if (--n4 == 0) {
            n3 = n3 & 0xFFFFFF0F | 0x10;
            this.a((int)by, by2 - 1, 1, 0, 1);
            this.a((int)by, by2 - 1, -1, 0, 1);
            int n5 = var_int_arr_arr_a[by][by2 - 1] >> 8;
            i.var_int_arr_arr_a[by][by2 - 1] = (n5 |= 0x200) << 8 | var_int_arr_arr_a[by][by2 - 1] & 0xFF;
            i.var_byte_arr_arr_c[by][by2] = 24;
        } else {
            n3 = n3 & 0xFFFFFFF0 | n4;
        }
        i.var_int_arr_arr_a[by][by2] = n3 << 8 | n2;
        this.C(8);
    }

    private static void void_i(int n, int n2) {
        int n3 = var_int_arr_arr_a[n][n2] >> 8;
        if ((n3 & 0xF0) == 0) {
            i.var_int_arr_arr_a[n][n2] = (n3 |= 0x10) << 8 | 7;
            i.var_byte_arr_arr_c[n][n2] = 24;
        }
    }

    private void void_j(int n, int n2) {
        int n3 = var_int_arr_arr_a[n][n2] >> 8;
        if ((var_int_arr_arr_a[n][n2] & 0xFF) != 7) {
            return;
        }
        if ((n3 & 0xF0) == 0) {
            return;
        }
        if (var_byte_arr_arr_a[n][n2] == 32) {
            return;
        }
        this.C(14);
        i.var_int_arr_arr_a[n][n2] = (n3 &= 0xFFFFFF0F) << 8 | 7;
        this.a(n, n2 - 1, 1, 0, 0);
        this.a(n, n2 - 1, -1, 0, 0);
        if (this.boolean_d(n, n2)) {
            this.var_long_b = 0L;
            this.bi = 0;
            this.void_a((int)var_byte_arr_i[8], 48, 0);
            this.C(2);
        } else {
            switch (var_byte_arr_arr_a[n][n2]) {
                case 0: 
                case 1: 
                case 19: 
                case 43: 
                case 45: {
                    i.var_byte_arr_arr_a[n][n2] = -1;
                    this.void_b(n, n2);
                    this.p(n, n2);
                }
            }
        }
        i.var_byte_arr_arr_c[n][n2] = 24;
    }

    private void s(int n) {
        if (n < 0) {
            return;
        }
        this.void_j(var_byte_arr_q[n], var_byte_arr_r[n]);
    }

    private void bm() {
        int n;
        i i2;
        boolean bl;
        boolean bl2;
        int n2;
        g g2;
        block68: {
            int n3;
            int n4;
            boolean bl3;
            block67: {
                int n5 = (this.aS & 0x4000) == 0 ? 0 : 3;
                g2 = var_g_arr_a[n5];
                n2 = -1;
                bl2 = true;
                bl = false;
                bl3 = g2.boolean_a();
                if (bl3) {
                    this.aS &= 0xFFFFDFFF;
                }
                if (n5 != 3) break block67;
                if (bl3) {
                    this.aS &= 0xFFFFB7FF;
                    n4 = this.int_f();
                }
                break block68;
            }
            switch (g2.f) {
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.var_byte_j = 0;
                        this.var_byte_k = 0;
                        this.aR = 0;
                        var_int_W = 0;
                    }
                    break block68;
                }
                case 1: 
                case 3: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                    }
                    bl = true;
                    break block68;
                }
                case 36: 
                case 37: 
                case 38: 
                case 39: {
                    if (bl3) {
                        n3 = 4;
                        break;
                    }
                    break block68;
                }
                case 47: {
                    this.aR = 0;
                    this.var_byte_k = 0;
                    this.var_byte_j = 0;
                    if ((aN & 1) == 0) {
                        int n6 = this.aP - 2 + aN % 5;
                        int n7 = this.aQ - 2 + aN % 3;
                        if (n6 == this.aP && (n7 == this.aQ || n7 == this.aQ - 1)) {
                            n6 += (aN >> 1 & 1) == 0 ? 1 : -1;
                        }
                        this.d(n6, n7, aN * 3 % 5);
                    }
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aC = -1;
                        this.aB = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 40: 
                case 48: {
                    this.aR = 0;
                    this.var_byte_k = 0;
                    this.var_byte_j = 0;
                    if (g2.h == 0) {
                        if (g2.g == (g2.f == 40 ? 12 : 6)) {
                            this.C(4);
                        }
                        if (g2.g == (g2.f == 40 ? 13 : 6)) {
                            this.bQ();
                        }
                    }
                    if (g2.boolean_a()) {
                        this.var_long_k = System.currentTimeMillis();
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aC = -1;
                        this.aB = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 35: {
                    bl = true;
                    n4 = 35;
                    break block68;
                }
                case 34: {
                    bl = true;
                    n4 = 34;
                    break block68;
                }
                case 0: {
                    bl = true;
                    n4 = 0;
                    break block68;
                }
                case 2: {
                    bl = true;
                    n4 = 2;
                    break block68;
                }
                case 9: {
                    if (!this.var_boolean_l) {
                        n4 = 27;
                    }
                    break block68;
                }
                case 8: {
                    if (!this.var_boolean_l) {
                        n4 = 26;
                    }
                    break block68;
                }
                case 27: {
                    if (!this.var_boolean_l) {
                        n4 = 9;
                    }
                    break block68;
                }
                case 26: {
                    if (!this.var_boolean_l) {
                        n4 = 8;
                    }
                    break block68;
                }
                case 4: 
                case 6: {
                    if (this.var_boolean_l) {
                        n4 = g2.f;
                    }
                    break block68;
                }
                case 5: {
                    if (!this.var_boolean_l) {
                        n4 = 24;
                    }
                    break block68;
                }
                case 7: {
                    if (!this.var_boolean_l) {
                        n4 = 25;
                    }
                    break block68;
                }
                case 24: {
                    if (this.var_boolean_l) {
                        n4 = 5;
                    }
                    break block68;
                }
                case 25: {
                    if (this.var_boolean_l) {
                        n4 = 7;
                    }
                    break block68;
                }
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 30: 
                case 31: 
                case 32: 
                case 33: {
                    if (bl3) {
                        bl2 = false;
                        var_int_W = 0;
                    }
                    break block68;
                }
                case 19: {
                    if (bl3) {
                        bl2 = false;
                        this.bl();
                    }
                    break block68;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 28: 
                case 29: {
                    if (bl3) {
                        var_int_W = 0;
                        this.var_byte_k = 0;
                        this.aR = 0;
                        n3 = 0;
                        break;
                    }
                    if ((this.aS & 0x2000) == 0 && g2.g == 2 && g2.h == 0) {
                        int n8 = this.aP - var_byte_arr_g[this.aS & 7];
                        int n9 = this.aQ - var_byte_arr_g[(this.aS & 7) + 8];
                        if (var_byte_arr_i[9] >= 8 && g2.g == 2 && g2.h == 0) {
                            this.d(n8, n9, -1);
                        }
                        this.void_f(n8, n9);
                        this.var_byte_j = 0;
                        var_int_W = 0;
                    }
                    break block68;
                }
                case 11: {
                    if (var_byte_arr_arr_a[this.aP][this.aQ - 1] == -1) {
                        n3 = 0;
                        break;
                    }
                    if (bl3 && var_byte_arr_arr_a[this.aP][this.aQ - 1] != -1) {
                        this.var_long_b = 0L;
                        this.void_a((int)var_byte_arr_i[8], 32, 0);
                    }
                    break block68;
                }
                case 17: 
                case 18: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aR = 0;
                    } else if (g2.g > 0 && this.aA != -1) {
                        int n10 = (this.aS & 7) == 2 ? this.aP + 1 : this.aP - 1;
                        int n11 = var_int_arr_arr_a[n10][this.aQ] >> 8;
                        int n12 = var_int_arr_arr_a[n10][this.aQ] & 0xFF;
                        n11 |= 0x100;
                        if (n12 == 9) {
                            --this.aU;
                        } else {
                            --this.aV;
                        }
                        i.var_int_arr_arr_a[n10][this.aQ] = n11 << 8 | n12;
                        this.r(n11 & 0xFF);
                        this.aC = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 10: {
                    if (bl3) {
                        this.aS &= 0xFFFFF7FF;
                        n4 = this.int_f();
                    } else {
                        this.var_long_b = 40L;
                    }
                    break block68;
                }
                case 12: {
                    if (this.bl < 160) {
                        this.bl += 12;
                    }
                    break block68;
                }
                default: {
                    n3 = 36;
                }
            }
            n4 = n2 = n3 + (this.aS & 7) - 1;
        }
        if (bl) {
            i i3 = this;
            i2 = i3;
            n = i3.var_int_am - 1;
        } else {
            i2 = this;
            n = i2.var_int_am = 70;
        }
        if (n2 != -1) {
            this.n(n2);
        }
        if (bl2) {
            g2.b();
        }
        this.var_int_b = this.var_int_b > 0 ? (this.var_int_b = this.var_int_b - 1) : 0;
    }

    private int int_f() {
        int n = 0;
        if (this.var_byte_n <= 0) {
            this.C(2);
            n = 12;
            this.aW = 80;
        } else {
            n = 0 + (this.aS & 7) - 1;
            this.aS = this.aS & 0xFFFFFF8F | 0;
            this.var_long_b = 40L;
        }
        this.var_byte_k = 0;
        return n;
    }

    private static void t(int n) {
        if (var_boolean_k) {
            i.var_GloftDIRU_a.var_javax_microedition_lcdui_Display_a.vibrate(n);
        }
    }

    private void bn() {
        if (this.var_byte_o <= 0) {
            int n = this.bi > 0 ? 1 : -1;
            this.bi -= n;
            if (this.bi != 0) {
                if (var_byte_arr_arr_a[this.bg][this.bh] == 48) {
                    int n2 = var_int_arr_arr_b[this.bg][this.bh];
                    int n3 = this.bh + ((n2 & 8) == 0 ? -1 : 1);
                    if (var_byte_arr_arr_a[this.bg + n][n3] < 0) {
                        i.var_byte_arr_arr_a[this.bg + n][n3] = var_byte_arr_arr_a[this.bg][n3];
                        i.var_byte_arr_arr_a[this.bg][n3] = -1;
                        i.var_int_arr_arr_b[this.bg + n][n3] = var_int_arr_arr_b[this.bg][n3];
                        i.var_byte_arr_arr_b[this.bg][n3] = this.var_byte_o;
                    } else {
                        int n4;
                        int n5 = this.aP;
                        while (var_byte_arr_arr_a[n4 = n5 - n][this.aQ] == 32) {
                            i.var_byte_arr_arr_a[n4][this.aQ] = -1;
                            n5 = n4;
                        }
                        this.bi = 0;
                        return;
                    }
                }
                i.var_byte_arr_arr_a[this.bg + n][this.bh] = var_byte_arr_arr_a[this.bg][this.bh];
                i.var_byte_arr_arr_a[this.bg][this.bh] = -1;
                this.void_b(this.bg, this.bh);
                this.bg += n;
                i.var_int_arr_arr_b[this.bg][this.bh] = this.be | Integer.MIN_VALUE;
                i.var_byte_arr_arr_b[this.bg][this.bh] = this.var_byte_o = (byte)18;
            } else {
                if (var_byte_arr_arr_a[this.bg][this.bh] == 48) {
                    int n6 = var_int_arr_arr_b[this.bg][this.bh];
                    int n7 = this.bh + ((n6 & 8) == 0 ? -1 : 1);
                    i.var_byte_arr_arr_b[this.bg][n7] = 0;
                } else {
                    i.var_int_arr_arr_b[this.bg][this.bh] = this.bf;
                }
                i.var_byte_arr_arr_b[this.bg][this.bh] = 0;
                this.bf = -1;
                this.void_c(this.bg, this.bh);
            }
            i.q(this.bg - n, this.bh);
            return;
        }
        i.var_byte_arr_arr_b[this.bg][this.bh] = this.var_byte_o = (byte)(this.var_byte_o - 6);
        if ((this.bi == 1 || this.bi == -1) && this.var_byte_o <= 6 && (this.aS & 0x70) == 0) {
            this.n((this.aS & 7) == 4 ? 23 : 21);
        }
    }

    private void bo() {
        int n;
        i i2;
        int n2;
        i i3;
        int n3 = aN % 89;
        if (n3 < 15) {
            i3 = this;
            n2 = 0;
        } else if (n3 < 45) {
            i3 = this;
            n2 = 48 * (n3 - 15) / 30;
        } else if (n3 < 60) {
            i3 = this;
            n2 = 48;
        } else {
            i3 = this;
            n2 = 48 - 48 * (n3 - 60) / 30;
        }
        i3.aI = n2;
        this.aJ = this.aI > 0 ? (this.aI - 1) / 24 + 2 : 1;
        n3 = aN % 44;
        if (n3 < 7) {
            i2 = this;
            n = 0;
        } else if (n3 < 22) {
            i2 = this;
            n = 48 * (n3 - 7) / 15;
        } else if (n3 < 30) {
            i2 = this;
            n = 48;
        } else {
            i2 = this;
            n = 48 - 48 * (n3 - 30) / 15;
        }
        i2.aK = n;
        this.aL = this.aK > 0 ? (this.aK - 1) / 24 + 2 : 1;
    }

    private void bp() {
        int n;
        i i2;
        int n2 = var_byte_arr_k[this.var_int_ax << 1] - this.aP;
        int n3 = var_byte_arr_k[(this.var_int_ax << 1) + 1] - this.aQ;
        if (this.var_byte_i == 2 && this.var_int_ax == 2) {
            n2 = 10;
            n3 = -8;
        }
        if (n3 == 0) {
            if (n2 < 0) {
                i2 = this;
                n = 12;
            } else {
                i2 = this;
                n = 4;
            }
        } else if (n2 == 0) {
            if (n3 < 0) {
                i2 = this;
                n = 0;
            } else {
                i2 = this;
                n = 8;
            }
        } else {
            int n4 = n2 * 128 / n3;
            if (n4 > 0) {
                if (n4 < 128) {
                    if (n2 > 0) {
                        i2 = this;
                        n = 7;
                    } else {
                        i2 = this;
                        n = 15;
                    }
                } else if (n4 > 128) {
                    if (n2 > 0) {
                        i2 = this;
                        n = 5;
                    } else {
                        i2 = this;
                        n = 13;
                    }
                } else if (n2 > 0) {
                    i2 = this;
                    n = 6;
                } else {
                    i2 = this;
                    n = 14;
                }
            } else if (n4 > -128) {
                if (n2 < 0) {
                    i2 = this;
                    n = 9;
                } else {
                    i2 = this;
                    n = 1;
                }
            } else if (n4 < -128) {
                if (n2 < 0) {
                    i2 = this;
                    n = 11;
                } else {
                    i2 = this;
                    n = 3;
                }
            } else if (n2 < 0) {
                i2 = this;
                n = 10;
            } else {
                i2 = this;
                n = 2;
            }
        }
        i2.var_int_ac = n;
    }

    private void bq() {
        switch (this.var_byte_i) {
            case 2: {
                this.bA();
                this.br();
                return;
            }
            case 1: {
                this.bz();
                return;
            }
            case 3: {
                this.by();
                return;
            }
            case 4: {
                this.bu();
                return;
            }
            case 5: {
                this.bs();
            }
        }
    }

    private void br() {
        if (this.boolean_d(61, 3) && this.aR == 6) {
            this.d(this.aP, this.aQ, 5);
            this.var_boolean_c = false;
        }
        if (this.var_c_a == null && (this.boolean_d(60, 3) || this.boolean_d(61, 3))) {
            this.b(true);
            this.var_boolean_M = true;
            this.cs();
            this.A();
            this.var_int_ap = 0;
            this.var_int_aq = 0;
            this.t();
        }
        if (this.aD == 2) {
            i.var_int_arr_arr_a[11][50] = -1;
        }
    }

    private void k(int n, int n2) {
        for (int j = -1; j < 2; ++j) {
            for (int k = -1; k < 2; ++k) {
                int n3 = (this.var_int_ar + n) / 24 + k;
                int n4 = (this.var_int_as + n2) / 24 + j;
                if (!this.boolean_d(n3, n4)) continue;
                this.void_a(1, 48, 0);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bs() {
        block60: {
            block58: {
                block61: {
                    block59: {
                        block57: {
                            var1_1 = i.var_g_arr_a[5];
                            if (this.var_int_ad != 12) break block57;
                            if (this.var_int_ae++ > 100) {
                                this.var_int_ad = 15;
                                this.p(11, 11);
                            } else {
                                this.var_h_a.b(7);
                            }
                            v0 = var1_1;
                            break block58;
                        }
                        if (this.var_int_ad != -1) break block59;
                        if (this.aP * 24 >= 360) {
                            this.var_int_ad = 10;
                            var1_1.void_a(10);
                            return;
                        }
                        break block60;
                    }
                    if (this.var_int_ad == 15 || this.var_int_ad == -1) break block60;
                    var2_2 = -1;
                    var3_3 = this.aP * 24 + 12;
                    var4_4 = this.aQ * 24;
                    var5_5 = this.var_int_ai + 24;
                    if (this.var_int_ad == 13) {
                        var2_2 = 13;
                        if (var3_3 > var5_5) {
                            this.var_boolean_ad = true;
                        }
                    }
                    v1 = var6_6 = this.var_int_af > 0 && i.aN % this.var_int_af == 0 ? 2 : 1;
                    if (this.var_int_ad == 6 || this.var_int_ad == 7) {
                        v2 = var6_6 = (i.aN & 11) == 0 ? 2 : var6_6;
                    }
                    if (!(this.var_boolean_ac || this.var_int_ad != 0 && this.var_int_ad != 1)) {
                        if (this.var_int_ad == 0) {
                            this.dj = 36;
                            this.dj ^= -1;
                            v3 = this;
                            v4 = v3;
                            v5 = v3.dj + 1;
                        } else {
                            v4 = this;
                            v5 = v4.dj = 36;
                        }
                        if (var4_4 < 504 && (var3_3 == var5_5 + this.dj || i.aN % 76 == 0)) {
                            this.var_boolean_ac = true;
                        }
                    }
                    while (var6_6-- > 0) {
                        switch (this.var_int_ad) {
                            case 13: {
                                if (var1_1.boolean_a()) {
                                    var2_2 = 0;
                                    this.var_int_ad = 0;
                                    this.var_boolean_ad = false;
                                    break;
                                }
                                if (!this.var_boolean_ad) break;
                                var1_1.b();
                                break;
                            }
                            case 4: 
                            case 5: {
                                if (var1_1.boolean_a()) {
                                    var2_2 = this.var_int_ad == 4 ? 0 : 1;
                                    this.var_int_ad = var2_2;
                                }
                                this.var_boolean_ac = false;
                                this.dj = 0;
                                break;
                            }
                            case 10: 
                            case 11: {
                                if (var3_3 <= var5_5 || var5_5 >= 504) ** GOTO lbl65
                                v6 = this;
                                v7 = 1;
                                ** GOTO lbl68
lbl65:
                                // 1 sources

                                if (var3_3 >= var5_5 || var5_5 <= 360) ** GOTO lbl70
                                v6 = this;
                                v7 = 0;
lbl68:
                                // 2 sources

                                var2_2 = v7;
                                v6.var_int_ad = v7;
lbl70:
                                // 2 sources

                                this.var_boolean_ac = false;
                                this.dj = 0;
                                break;
                            }
                            case 6: {
                                if (var4_4 >= 504) {
                                    if (var3_3 >= var5_5 - 48) {
                                        var2_2 = 8;
                                        this.var_int_ad = 8;
                                        break;
                                    }
                                    this.var_int_ai -= 2;
                                    break;
                                }
                                if (var5_5 < 360) break;
                                var2_2 = 0;
                                this.var_int_ad = 0;
                                break;
                            }
                            case 7: {
                                if (var4_4 >= 504) {
                                    if (var3_3 <= var5_5 + 48) {
                                        var2_2 = 9;
                                        this.var_int_ad = 9;
                                        break;
                                    }
                                    this.var_int_ai += 2;
                                    break;
                                }
                                if (var5_5 > 504) break;
                                var2_2 = 1;
                                this.var_int_ad = 1;
                                break;
                            }
                            case 0: {
                                if (var4_4 >= 504 && var5_5 > 360) {
                                    if (var3_3 < var5_5) {
                                        var2_2 = 6;
                                        this.var_int_ad = 6;
                                        break;
                                    }
                                    --this.var_int_ai;
                                    break;
                                }
                                if (this.var_boolean_ac) {
                                    var2_2 = 2;
                                    this.var_int_ad = 2;
                                    break;
                                }
                                if (var5_5 <= 360) {
                                    var2_2 = 1;
                                    this.var_int_ad = 1;
                                    break;
                                }
                                --this.var_int_ai;
                                break;
                            }
                            case 1: {
                                if (var4_4 >= 504 && var5_5 < 504) {
                                    if (var3_3 < var5_5) {
                                        ++this.var_int_ai;
                                        break;
                                    }
                                    var2_2 = 7;
                                    this.var_int_ad = 7;
                                    break;
                                }
                                if (this.var_boolean_ac) {
                                    var2_2 = 3;
                                    this.var_int_ad = 3;
                                    break;
                                }
                                if (var5_5 >= 504) {
                                    var2_2 = 0;
                                    this.var_int_ad = 0;
                                    break;
                                }
                                ++this.var_int_ai;
                                break;
                            }
                            case 8: {
                                if (var1_1.boolean_a()) {
                                    var2_2 = 10;
                                    this.var_int_ad = 10;
                                }
                                if (var1_1.g < 4 || var4_4 < 504 || var3_3 < var5_5 - 48 || var3_3 > var5_5) break;
                                ** GOTO lbl164
                            }
                            case 9: {
                                if (var1_1.boolean_a()) {
                                    var2_2 = 11;
                                    this.var_int_ad = 11;
                                }
                                if (var1_1.g < 4 || var4_4 < 504 || var3_3 < var5_5 || var3_3 > var5_5 + 48) break;
                                ** GOTO lbl164
                            }
                            case 3: {
                                if (var1_1.g == 5 && var1_1.h == 0) {
                                    this.bj = 30;
                                }
                                if (var1_1.boolean_a()) {
                                    var2_2 = 11;
                                    this.var_int_ad = 11;
                                    this.var_boolean_ac = false;
                                    this.dj = 0;
                                }
                                if (var1_1.g < 7 || var4_4 >= 504 || var3_3 != var5_5 + this.dj) break;
                                ** GOTO lbl164
                            }
                            case 2: {
                                if (var1_1.g == 5 && var1_1.h == 0) {
                                    this.bj = 30;
                                }
                                if (var1_1.boolean_a()) {
                                    var2_2 = 10;
                                    this.var_int_ad = 10;
                                    this.var_boolean_ac = false;
                                    this.dj = 0;
                                }
                                if (var1_1.g < 7 || var4_4 >= 504 || var3_3 != var5_5 + this.dj) break;
lbl164:
                                // 4 sources

                                this.void_a(1, 48, 0);
                            }
                        }
                        if (var4_4 < 504 || var3_3 < var5_5 - 24 || var3_3 > var5_5 - 24) continue;
                        this.void_a(1, 48, (int)i.var_byte_arr_h[this.aS & 7]);
                    }
                    if ((this.var_int_ad == 8 || this.var_int_ad == 9) && var1_1.g == 5) {
                        this.bw();
                    }
                    if (this.var_int_ad == 6 || this.var_int_ad == 7) break block61;
                    for (var7_7 = 21; var7_7 < 23; ++var7_7) {
                        for (var8_8 = var5_5 / 24 - 1; var8_8 < var5_5 / 24 - 2 + 4; ++var8_8) {
                            block62: {
                                if (i.var_byte_arr_arr_a[var8_8][var7_7] != 0) continue;
                                if ((i.var_int_arr_arr_b[var8_8][var7_7] & 7) != 3 || this.var_int_ad == 13) break block62;
                                --this.var_int_af;
                                switch (this.var_int_ad) {
                                    case 0: 
                                    case 2: 
                                    case 4: 
                                    case 8: 
                                    case 10: {
                                        v8 = this;
                                        v9 = 4;
                                        ** GOTO lbl184
                                    }
                                    case 1: 
                                    case 3: 
                                    case 5: 
                                    case 9: 
                                    case 11: {
                                        v8 = this;
                                        v9 = 5;
lbl184:
                                        // 2 sources

                                        var2_2 = v9;
                                        v8.var_int_ad = v9;
                                    }
                                }
                            }
                            i.var_byte_arr_arr_a[var8_8][var7_7] = -1;
                            this.void_b(var8_8, var7_7);
                            i.var_byte_arr_arr_a[var8_8][var7_7] = 30;
                            i.var_byte_arr_arr_c[var8_8][var7_7] = 24;
                            i.var_int_arr_arr_b[var8_8][var7_7] = 4;
                            this.C(14);
                        }
                    }
                }
                if (this.var_int_af <= 0) {
                    this.var_int_ad = 12;
                    this.var_int_ae = 0;
                    var2_2 = 12;
                }
                if (var2_2 != -1) {
                    var1_1.void_a(var2_2);
                    return;
                }
                v0 = var1_1;
            }
            v0.b();
        }
    }

    private void bt() {
        int n = this.int_g();
        if (this.aP == n || this.aP == n + 1) {
            g g2 = var_g_arr_a[5];
            int n2 = g2.b + -40;
            int n3 = g2.b + 256;
            int n4 = (g2.var_a_a.var_short_arr_b[g2.f] + g2.g) * 5;
            int n5 = i.var_g_arr_a[0].b;
            if (n5 > (n2 -= (n4 = (g2.var_a_a.var_byte_arr_f[n4 + 3] << 0) * 1 / 1)) && n5 < (n3 -= n4) && !this.var_boolean_h) {
                this.void_a(1, 48, this.aP == n ? 4 : 2);
            }
        }
    }

    private static void l(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.var_byte_arr_arr_a[n][n2] = -1;
        i.var_byte_arr_arr_a[n + 1][n2] = -1;
    }

    private static void m(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.var_byte_arr_arr_a[n][n2] = 50;
        i.var_byte_arr_arr_a[n + 1][n2] = 50;
    }

    private boolean boolean_c(int n, int n2) {
        boolean bl = false;
        for (int j = n; j <= n + 1; ++j) {
            for (int k = n2; k >= n2 - 1; --k) {
                if (var_byte_arr_arr_a[j][k] != 0) continue;
                this.void_h(j, k);
                i.q(j, k);
                i.var_byte_arr_arr_a[j][k] = -1;
                this.void_b(j, k);
                bl = true;
            }
        }
        return bl;
    }

    private int int_g() {
        int n = this.var_int_ag > 0 ? 1 : 0;
        return 10 + this.var_int_ag * (2 + n);
    }

    private int int_h() {
        g g2 = var_g_arr_a[5];
        int n = g2.b + -40;
        int n2 = (g2.var_a_a.var_short_arr_b[g2.f] + g2.g) * 5;
        n2 = (g2.var_a_a.var_byte_arr_f[n2 + 3] << 0) * 1 / 1;
        n -= n2;
        return this.var_int_aw * (n += this.var_int_as) / (this.var_int_aw * 24);
    }

    private boolean boolean_d() {
        int n = this.int_g();
        int n2 = this.int_h();
        boolean bl = false;
        for (int j = n; j <= n + 1; ++j) {
            for (int k = n2; k <= 10; ++k) {
                if (var_byte_arr_arr_a[j][k] != 0) continue;
                this.void_h(j, k);
                i.q(j, k);
                i.var_byte_arr_arr_a[j][k] = -1;
                this.void_b(j, k);
                bl = true;
            }
        }
        return bl;
    }

    private int int_i() {
        int n = this.aP - 10;
        int n2 = n / 3;
        if (n == n2 * 3 + 2) {
            n2 += aN % 50 / 25;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private void bu() {
        if (this.var_int_ad == 5) {
            if (this.var_boolean_Y) {
                return;
            }
            this.var_boolean_Y = true;
        }
        var1_1 = i.var_g_arr_a[5];
        ++this.var_int_ae;
        var2_2 = -1;
        var3_3 = i.var_g_arr_a[4];
        var4_4 = -1;
        var5_5 = this.int_g();
        if (i.var_byte_arr_arr_a[this.var_int_E][2] == -1) {
            i.var_byte_arr_arr_a[this.var_int_E][2] = 31;
        }
        if (i.var_byte_arr_arr_a[this.var_int_F][2] == -1) {
            i.var_byte_arr_arr_a[this.var_int_F][2] = 31;
        }
        switch (this.var_int_ad) {
            case 0: {
                if (this.aP < 10) break;
                this.var_int_ad = 6;
                this.var_int_ae = 0;
                break;
            }
            case 6: {
                if (this.var_int_ae <= 10) break;
                this.var_int_ad = 1;
                var2_2 = 2;
                this.var_int_ae = 0;
                break;
            }
            case 1: {
                var7_6 = false;
                if (this.var_int_ae > 40) {
                    this.var_int_ad = 2;
                    this.var_int_ae = 0;
                    break;
                }
                if (this.var_int_ae <= 20) break;
                this.boolean_c(var5_5, 8);
                i.m(var5_5, 8);
                this.var_int_B = var5_5;
                this.var_int_C = 8;
                break;
            }
            case 7: {
                i.l(this.var_int_B, this.var_int_C);
                this.var_int_B = -1;
                this.var_int_C = -1;
                if (this.var_int_ae > 80) {
                    this.var_int_ad = 8;
                    this.bS();
                }
                if ((this.var_int_ae & 111) != 1) break;
                this.C(7);
                break;
            }
            case 3: {
                var7_7 = false;
                if (this.var_int_ae <= 40) break;
                if (this.var_int_af > 0) {
                    if (this.var_int_H == 10) {
                        this.var_int_ad = 9;
                        this.var_int_ae = 0;
                        break;
                    }
                    if (this.var_int_H != 2 && this.var_int_H != 1) break;
                    this.var_int_ad = 4;
                    this.var_int_ae = 0;
                    var2_2 = 2;
                    break;
                }
                this.var_int_ad = 7;
                this.var_int_ae = 0;
                break;
            }
            case 2: {
                var7_8 = false;
                if (this.boolean_c(var5_5, 8)) {
                    --this.var_int_af;
                    this.var_int_H = this.var_int_ad;
                    i.l(this.var_int_B, this.var_int_C);
                    this.var_int_B = -1;
                    this.var_int_C = -1;
                    this.var_int_H = this.var_int_ad;
                    this.var_int_ad = 3;
                    var2_2 = 3;
                    this.C(10);
                }
                if (this.var_int_ae > 15 && var1_1.f != 6) {
                    var2_2 = 6;
                }
                if (this.var_int_ae <= 30) break;
                this.var_int_ad = 4;
                this.var_int_ae = 0;
                var2_2 = 0;
                i.l(this.var_int_B, this.var_int_C);
                this.var_int_B = -1;
                this.var_int_C = -1;
                break;
            }
            case 4: {
                v0 = var7_9 = this.var_int_af <= 1 ? 5 : 10;
                if (this.var_int_ae < var7_9) ** GOTO lbl95
                this.var_int_ad = 5;
                this.var_int_ae = 0;
                v1 = 4;
                ** GOTO lbl97
lbl95:
                // 1 sources

                if (this.var_int_ae <= var7_9 >> 1 || var1_1.f == 1) ** GOTO lbl98
                v1 = 1;
lbl97:
                // 2 sources

                var2_2 = v1;
lbl98:
                // 2 sources

                this.boolean_d();
                this.bt();
                break;
            }
            case 5: {
                var8_10 = var1_1.b + -40;
                var9_11 = (var1_1.var_a_a.var_short_arr_b[var1_1.f] + var1_1.g) * 5;
                var9_11 = (var1_1.var_a_a.var_byte_arr_f[var9_11 + 3] << 0) * 1 / 1;
                if ((var8_10 -= var9_11) <= 72 - this.var_int_as + 40) {
                    this.var_int_I = 0;
                    this.bw();
                    this.var_int_ad = 10;
                    this.var_int_B = var5_5;
                    this.var_int_C = 4;
                    i.m(this.var_int_B, this.var_int_C);
                }
                this.boolean_d();
                this.bt();
                break;
            }
            case 9: {
                this.var_int_ae -= 2;
                this.bt();
                var10_12 = var1_1.b + -40;
                var11_13 = (var1_1.var_a_a.var_short_arr_b[var1_1.f] + var1_1.g) * 5;
                var11_13 = (var1_1.var_a_a.var_byte_arr_f[var11_13 + 3] << 0) * 1 / 1;
                if ((var10_12 -= var11_13) < 240 - this.var_int_as + 40) break;
                this.var_int_ad = 6;
                this.var_int_ae = 0;
                this.var_int_ag = this.int_i();
                break;
            }
            case 10: {
                --this.var_int_ae;
                this.bt();
                ++this.var_int_A;
                if (this.var_int_A == 28) {
                    var2_2 = 7;
                }
                if (this.var_int_A < 50) break;
                this.var_int_A = 0;
                this.var_int_ad = 11;
                i.l(this.var_int_B, this.var_int_C);
                this.var_int_B = -1;
                this.var_int_C = -1;
                var2_2 = 8;
                var4_4 = 2;
                this.var_boolean_i = true;
                break;
            }
            case 11: {
                --this.var_int_ae;
                ++this.var_int_A;
                if (this.var_int_A >= 12) {
                    this.var_int_A = 0;
                    this.var_int_ad = 9;
                    var2_2 = 4;
                    this.var_boolean_h = false;
                    this.var_boolean_i = false;
                    break;
                }
                if (this.var_boolean_h) break;
                this.bv();
            }
        }
        if (var2_2 == -1) {
            var1_1.b();
        } else {
            var1_1.void_a(var2_2);
        }
        if (this.var_boolean_i) {
            if (var4_4 == -1) {
                var3_3.b();
                return;
            }
            var3_3.void_a(var4_4);
        }
    }

    private void bv() {
        int n = this.int_g();
        if (this.aQ == 4 && this.aP >= n - 3 && this.aP <= n + 4) {
            this.void_a(1, 64, this.aP == n ? 4 : 2);
            this.var_boolean_h = true;
        }
    }

    private void bw() {
        this.bj = 30;
        if (var_byte_arr_arr_a[this.var_int_E][this.var_int_G] == -1) {
            i.var_byte_arr_arr_a[this.var_int_E][this.var_int_D] = 0;
            i.q(this.var_int_E, this.var_int_D);
        }
        if (var_byte_arr_arr_a[this.var_int_F][this.var_int_G] == -1) {
            i.var_byte_arr_arr_a[this.var_int_F][this.var_int_D] = 0;
            i.q(this.var_int_F, this.var_int_D);
        }
    }

    private void bx() {
        this.var_int_ad = -1;
        this.var_int_af = 5;
    }

    /*
     * Unable to fully structure code
     */
    private void by() {
        block61: {
            block59: {
                block65: {
                    block62: {
                        block64: {
                            block63: {
                                block60: {
                                    block58: {
                                        var1_1 = i.var_g_arr_a[5];
                                        var2_2 = this.bE;
                                        var3_3 = this.bF;
                                        var4_4 = this.aP - 8;
                                        var5_5 = this.aP + 8;
                                        var6_6 = this.aQ + 8;
                                        var7_7 = this.aQ - 8;
                                        for (var8_8 = 15; var8_8 <= 22; ++var8_8) {
                                            for (var9_9 = 14; var9_9 <= 21; ++var9_9) {
                                                if (var9_9 > var4_4 && var9_9 < var5_5 && var8_8 > var6_6 && var8_8 < var7_7 || i.var_byte_arr_arr_a[var9_9][var8_8] != 44) continue;
                                                this.bE = var9_9;
                                                this.bF = var8_8;
                                                this.bK();
                                            }
                                        }
                                        this.bE = var2_2;
                                        this.bF = var3_3;
                                        if (this.var_byte_n == 0) {
                                            this.bx();
                                        }
                                        if (this.var_int_ad != 12) break block58;
                                        if (this.var_int_ae++ > 100) {
                                            this.var_int_ad = 15;
                                            this.p(11, 11);
                                        } else {
                                            this.var_h_a.b(7);
                                        }
                                        v0 = var1_1;
                                        break block59;
                                    }
                                    if (this.var_int_ad != -1) break block60;
                                    if (this.aP * 24 >= 336) {
                                        this.var_int_ad = 0;
                                        var1_1.void_a(0);
                                        return;
                                    }
                                    break block61;
                                }
                                if (this.var_int_ad == 15 || this.var_int_ad == -1) break block61;
                                var8_8 = -1;
                                var9_9 = this.aP * 24 + 12;
                                var10_10 = this.aQ * 24;
                                var11_11 = this.var_int_ah + 24;
                                if (this.var_long_l == 0L && this.var_byte_n != 0) {
                                    this.var_long_l = i.aN + d.a(340, 441);
                                }
                                v1 = var12_12 = this.var_int_af > 0 && i.aN % this.var_int_af == 0 ? 2 : 1;
                                if (this.var_int_ad == 10 || this.var_int_ad == 11) {
                                    v2 = var12_12 = (i.aN & 11) == 0 ? 2 : var12_12;
                                }
                                while (var12_12-- > 0) {
                                    switch (this.var_int_ad) {
                                        case 2: {
                                            if (!var1_1.boolean_a()) break;
                                            if ((long)i.aN > this.var_long_l) {
                                                var8_8 = 13;
                                                this.var_int_ad = 13;
                                                break;
                                            }
                                            var8_8 = 4;
                                            this.var_int_ad = 4;
                                            break;
                                        }
                                        case 3: {
                                            if (!var1_1.boolean_a()) break;
                                            if ((long)i.aN > this.var_long_l) {
                                                var8_8 = 14;
                                                this.var_int_ad = 14;
                                                break;
                                            }
                                            var8_8 = 5;
                                            this.var_int_ad = 5;
                                            break;
                                        }
                                        case 0: {
                                            if (var11_11 > 360) {
                                                var8_8 = 4;
                                                this.var_int_ad = 4;
                                                break;
                                            }
                                            var8_8 = 5;
                                            this.var_int_ad = 5;
                                            break;
                                        }
                                        case 1: {
                                            if (var11_11 < 504) {
                                                var8_8 = 5;
                                                this.var_int_ad = 5;
                                                break;
                                            }
                                            var8_8 = 4;
                                            this.var_int_ad = 4;
                                            break;
                                        }
                                        case 10: {
                                            if (var1_1.boolean_a()) {
                                                this.bj = 10;
                                                var11_11 = this.var_int_ah + 24;
                                                if ((long)i.aN > this.var_long_l) {
                                                    var8_8 = 13;
                                                    this.var_int_ad = 13;
                                                    break;
                                                }
                                                if (var10_10 >= 504) {
                                                    if (var9_9 < var11_11 - 48) break;
                                                    var8_8 = 6;
                                                    this.var_int_ad = 6;
                                                    break;
                                                }
                                                var8_8 = 4;
                                                this.var_int_ad = 4;
                                                break;
                                            }
                                            this.var_int_ah -= 2;
                                            break;
                                        }
                                        case 11: {
                                            if (var1_1.boolean_a()) {
                                                this.bj = 10;
                                                var11_11 = this.var_int_ah + 24;
                                                if ((long)i.aN > this.var_long_l) {
                                                    var8_8 = 14;
                                                    this.var_int_ad = 14;
                                                    break;
                                                }
                                                if (var10_10 >= 504) {
                                                    if (var9_9 > var11_11 + 48) break;
                                                    var8_8 = 7;
                                                    this.var_int_ad = 7;
                                                    break;
                                                }
                                                var8_8 = 5;
                                                this.var_int_ad = 5;
                                                break;
                                            }
                                            this.var_int_ah += 2;
                                            break;
                                        }
                                        case 4: {
                                            if ((long)i.aN > this.var_long_l) {
                                                var8_8 = 13;
                                                this.var_int_ad = 13;
                                                break;
                                            }
                                            if (var10_10 >= 504 && var9_9 < var11_11 && this.var_int_ah - 48 >= 360) {
                                                var8_8 = 10;
                                                this.var_int_ad = 10;
                                            }
                                            if (var11_11 <= 360) {
                                                var8_8 = 5;
                                                this.var_int_ad = 5;
                                            }
                                            if (this.var_int_ad != 4) break;
                                            --this.var_int_ah;
                                            break;
                                        }
                                        case 5: {
                                            if ((long)i.aN > this.var_long_l) {
                                                var8_8 = 14;
                                                this.var_int_ad = 14;
                                                break;
                                            }
                                            if (var10_10 >= 504 && var9_9 > var11_11 && this.var_int_ah + 48 <= 504) {
                                                var8_8 = 11;
                                                this.var_int_ad = 11;
                                            }
                                            if (var11_11 >= 504) {
                                                var8_8 = 4;
                                                this.var_int_ad = 4;
                                            }
                                            if (this.var_int_ad != 5) break;
                                            ++this.var_int_ah;
                                            break;
                                        }
                                        case 6: 
                                        case 7: 
                                        case 13: 
                                        case 14: {
                                            var14_13 = 0;
                                            var15_14 = 0;
                                            var16_15 = 0;
                                            switch (this.var_int_ad) {
                                                case 6: 
                                                case 13: {
                                                    var14_13 = 4;
                                                    var15_14 = 2;
                                                    v3 = 1;
                                                    break;
                                                }
                                                case 7: 
                                                case 14: {
                                                    var14_13 = 5;
                                                    var15_14 = 1;
                                                    v3 = var16_15 = 2;
                                                }
                                            }
                                            if (var1_1.g == 5 && var1_1.h == 0) {
                                                if (this.var_int_ad == 13 || this.var_int_ad == 14) {
                                                    v4 = this;
                                                    v5 = 80;
                                                } else {
                                                    v4 = this;
                                                    v5 = v4.bj = 10;
                                                }
                                            }
                                            if (var1_1.boolean_a()) {
                                                if (this.var_int_ad == 13 || this.var_int_ad == 14) {
                                                    this.var_long_m = i.aN + 40;
                                                    this.var_long_l = i.aN + d.a(340, 441);
                                                }
                                                this.var_int_ad = var8_8 = var14_13;
                                            }
                                            if (var1_1.g < 5 || var10_10 < 504 || var9_9 < var11_11 - var15_14 * 24 || var9_9 > var11_11 + var16_15 * 24) break;
                                            this.void_a(1, 48, 4);
                                        }
                                    }
                                    if (var10_10 >= 504 && var9_9 >= var11_11 - 24 && var9_9 <= var11_11 + 24) {
                                        this.void_a(1, 48, (int)i.var_byte_arr_h[this.aS & 7]);
                                    }
                                    if (this.var_int_af > 0) continue;
                                    this.var_int_ad = 12;
                                    this.var_int_ae = 0;
                                    return;
                                }
                                if (this.ce != 5) break block62;
                                if (this.cf > 0) break block63;
                                if (this.var_int_af <= 2) {
                                    i.var_byte_arr_arr_a[10][16] = 45;
                                    i.var_byte_arr_arr_c[10][16] = 24;
                                    i.var_byte_arr_arr_b[10][16] = 0;
                                    i.var_int_arr_arr_b[10][16] = 0;
                                }
                                i.var_byte_arr_arr_a[26][19] = 45;
                                i.var_byte_arr_arr_c[26][19] = 24;
                                i.var_byte_arr_arr_b[26][19] = 0;
                                v6 = i.var_int_arr_arr_b[26];
                                v7 = 19;
                                break block64;
                            }
                            i.var_byte_arr_arr_a[10][19] = 45;
                            i.var_byte_arr_arr_c[10][19] = 24;
                            i.var_byte_arr_arr_b[10][19] = 0;
                            i.var_int_arr_arr_b[10][19] = 0;
                            if (this.var_int_af > 2) break block62;
                            i.var_byte_arr_arr_a[26][16] = 45;
                            i.var_byte_arr_arr_c[26][16] = 24;
                            i.var_byte_arr_arr_b[26][16] = 0;
                            v6 = i.var_int_arr_arr_b[26];
                            v7 = 16;
                        }
                        v6[v7] = 0;
                    }
                    if (this.var_int_ad == 10 || this.var_int_ad == 11) break block65;
                    for (var13_16 = 21; var13_16 < 23; ++var13_16) {
                        for (var14_13 = var11_11 / 24 - 1; var14_13 < var11_11 / 24 - 2 + 4; ++var14_13) {
                            block66: {
                                if (i.var_byte_arr_arr_a[var14_13][var13_16] != 9) continue;
                                if ((i.var_int_arr_arr_b[var14_13][var13_16] & 7) != 3) break block66;
                                --this.var_int_af;
                                switch (this.var_int_ad) {
                                    case 0: 
                                    case 2: 
                                    case 4: 
                                    case 6: {
                                        v8 = this;
                                        v9 = 2;
                                        ** GOTO lbl221
                                    }
                                    case 1: 
                                    case 3: 
                                    case 5: 
                                    case 7: {
                                        v8 = this;
                                        v9 = 3;
lbl221:
                                        // 2 sources

                                        var8_8 = v9;
                                        v8.var_int_ad = v9;
                                    }
                                }
                            }
                            i.var_byte_arr_arr_a[var14_13][var13_16] = -1;
                            this.void_b(var14_13, var13_16);
                            i.var_byte_arr_arr_a[var14_13][var13_16] = 30;
                            i.var_byte_arr_arr_c[var14_13][var13_16] = 24;
                            i.var_int_arr_arr_b[var14_13][var13_16] = 4;
                            this.C(14);
                        }
                    }
                }
                if (var8_8 != -1) {
                    var1_1.void_a(var8_8);
                    return;
                }
                v0 = var1_1;
            }
            v0.b();
        }
    }

    private void bz() {
        block19: {
            int n;
            g g2;
            block18: {
                block16: {
                    block17: {
                        if (var_byte_arr_arr_a[18][63] == 0 && var_byte_arr_arr_b[18][63] <= 0 && this.var_int_ab == 0) {
                            this.bj = 120;
                            ++this.var_int_ab;
                        }
                        if (this.var_int_ab != 3) break block16;
                        if (i.var_g_arr_a[2].f != 0) break block17;
                        g2 = var_g_arr_a[2];
                        n = 1;
                        break block18;
                    }
                    if (i.var_g_arr_a[2].f == 1 && var_g_arr_a[2].boolean_a()) {
                        var_g_arr_a[2].void_a(2);
                        if (this.aQ == this.var_int_aw - 4) {
                            this.var_int_aa = 817;
                        }
                    }
                    break block19;
                }
                if (i.var_g_arr_a[2].f == 0) break block19;
                g2 = var_g_arr_a[2];
                n = 0;
            }
            g2.void_a(n);
        }
        var_g_arr_a[2].b();
        if (i.var_g_arr_a[2].f == 2) {
            var_g_arr_a[1].b();
            if (this.bj == 10) {
                this.bj = 60;
            }
            if (i.var_g_arr_a[1].f == 0) {
                if ((this.var_c_a == null || this.var_int_aa < 46) && this.var_int_aa < 1704) {
                    ++this.var_int_aa;
                    int n = this.var_int_aw * 24 - (this.var_int_as + 320 - 80);
                    if (this.var_int_aa < n) {
                        this.var_int_aa = n;
                    }
                }
                if (this.var_int_aw * 24 - this.var_int_aa <= this.aQ * 24 + 18 && this.aP < 17) {
                    this.void_a((int)var_byte_arr_i[8], 64, 1);
                    return;
                }
            } else if (var_g_arr_a[1].boolean_a()) {
                var_g_arr_a[1].void_a(0);
            }
        }
    }

    private void bA() {
        if (var_int_arr_arr_a != null && this.boolean_b() && (var_int_arr_arr_a[this.aP][this.aQ] & 0xFF) == 0) {
            int n = var_int_arr_arr_a[this.aP][this.aQ] >> 8;
            if (n == 13) {
                this.var_boolean_o = true;
            } else if (n == 16) {
                this.var_boolean_p = true;
            }
        }
        if (!this.var_boolean_q && this.aR <= 0 && this.boolean_d(46, 7)) {
            this.var_boolean_r = true;
            this.var_boolean_q = true;
        }
    }

    public final void void_c() {
        block18: {
            int n;
            block17: {
                i i2;
                i i3;
                int n2;
                block16: {
                    int n3;
                    i i4;
                    int n4;
                    i i5;
                    byte by = (this.aS & 0x1000) == 0 ? this.var_byte_k : (byte)0;
                    int n5 = this.aP * 24 + this.aR * var_byte_arr_g[by];
                    int n6 = 24 * this.var_int_av - 240;
                    n2 = 24 * this.var_int_aw - 240;
                    if (n5 < this.var_int_at + 96) {
                        this.var_int_at = this.var_int_at - 96 + n5 >> 1;
                        if (this.var_int_at < 0) {
                            i5 = this;
                            n4 = 0;
                        }
                    } else if (n5 > this.var_int_at + 120) {
                        this.var_int_at = this.var_int_at - 120 + n5 >> 1;
                        if (this.var_int_at > n6) {
                            i5 = this;
                            n4 = i5.var_int_at = n6;
                        }
                    }
                    if ((n5 = this.aQ * 24 + this.aR * var_byte_arr_g[by + 8] + 40) < this.var_int_au + 96) {
                        this.var_int_au = this.var_int_au - 96 + n5 >> 1;
                        if (this.var_int_au < 0) {
                            this.var_int_au = 0;
                        }
                    }
                    if (n5 > this.var_int_au + 160) {
                        this.var_int_au = this.var_int_au - 160 + n5 >> 1;
                        if (this.var_int_au > n2) {
                            this.var_int_au = n2;
                        }
                    }
                    this.var_int_ar = this.var_int_at;
                    this.var_int_as = this.var_int_au;
                    if (this.var_int_ar < 0) {
                        i4 = this;
                        n3 = 0;
                    } else if (this.var_int_ar > n6) {
                        i4 = this;
                        n3 = i4.var_int_ar = n6;
                    }
                    if (this.var_int_as >= 0) break block16;
                    i3 = this;
                    i2 = this;
                    n = 0;
                    break block17;
                }
                if (this.var_int_as <= n2) break block18;
                i3 = this;
                i2 = this;
                n = n2;
            }
            i2.var_int_au = n;
            i3.var_int_as = n;
        }
    }

    private void a(int n, int n2, boolean bl, byte by) {
        int n3;
        int n4;
        int n5 = bl ? n + 1 : n - 1;
        int n6 = var_int_arr_arr_b[n][n2];
        i.var_byte_arr_arr_a[n5][n2] = by;
        i.var_byte_arr_arr_a[n][n2] = -1;
        i.var_byte_arr_arr_b[n5][n2] = 18;
        if (bl) {
            n6 = n6 & 0xFFFFFFF8 | 2;
            n4 = n6 & 0xFFFFF3FF;
            n3 = 1024;
        } else {
            n6 = n6 & 0xFFFFFFF8 | 4;
            n4 = n6 & 0xFFFFF3FF;
            n3 = 2048;
        }
        n6 = n4 | n3;
        i.var_int_arr_arr_b[n5][n2] = n6 & 0xFFFFFDFF | Integer.MIN_VALUE;
        i.q(n5, n2);
        this.void_b(n, n2);
    }

    private void b(int n, int n2, byte by) {
        if ((var_int_arr_arr_a[n][n2] & 0xFF) == by) {
            i.var_int_arr_arr_a[n][n2] = -1;
            this.b(n - 1, n2, by);
            this.b(n + 1, n2, by);
            this.b(n, n2 - 1, by);
            this.b(n, n2 + 1, by);
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_a(int var1_1, int var2_2, boolean var3_3) {
        block59: {
            block58: {
                var4_4 = false;
                var5_5 = this.aS;
                var6_6 = this.aP;
                var7_7 = this.aQ;
                var8_8 = this.var_byte_k;
                var9_9 = this.var_boolean_v;
                var10_10 = this.aX;
                var11_11 = this.aR;
                var12_12 = this.aW;
                if (var1_1 > 0) {
                    v0 = var5_5 & -8;
                    v1 = 2;
                } else if (var1_1 < 0) {
                    v0 = var5_5 & -8;
                    v1 = 4;
                } else if (var2_2 < 0) {
                    v0 = var5_5 & -8;
                    v1 = 1;
                } else {
                    v0 = var5_5 & -8;
                    v1 = 3;
                }
                var5_5 = v0 | v1;
                var13_13 = var6_6 + var1_1;
                var14_14 = var7_7 + var2_2;
                var15_15 = false;
                var16_16 = false;
                if (var13_13 >= 0 && var13_13 < this.var_int_av && var14_14 >= 0 && var14_14 < this.var_int_aw) break block58;
                var15_15 = true;
                break block59;
            }
            if (i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[var13_13][var14_14] != 0 && i.var_byte_arr_i[10] == 0) {
                var15_15 = false;
                var4_4 = true;
            }
            var17_17 = (byte)(i.var_int_arr_arr_a[var13_13][var14_14] & 255);
            switch (var17_17) {
                case 19: {
                    if (var3_3) break;
                    var19_18 = var13_13 + 3;
                    var20_19 = var14_14;
                    while (i.var_byte_arr_arr_a[var19_18][var20_19] != 39) {
                        --var20_19;
                    }
                    if (!this.var_boolean_j) {
                        this.cn();
                    }
                    this.var_boolean_j = true;
                    this.var_boolean_am = false;
                    if (i.var_int_arr_arr_e == null) {
                        i.var_int_arr_arr_e = new int[this.var_int_av][this.var_int_aw];
                    }
                    this.byte_a((byte)i.var_int_arr_arr_b[var19_18][var20_19], var19_18, (byte)var20_19, (byte)0);
                    this.v(var19_18, var20_19);
                    var19_18 = var13_13;
                    while ((i.var_int_arr_arr_a[var19_18][++var20_19] & 255) == 19) {
                        i.var_int_arr_arr_a[var19_18][var20_19] = -1;
                    }
                    break;
                }
                case 1: {
                    if (var3_3) break;
                    this.bj = 120;
                    ++this.var_int_ab;
                    this.b((int)var13_13, var14_14, (byte)1);
                    break;
                }
                case 7: {
                    var18_20 = i.var_int_arr_arr_a[var13_13][var14_14] >> 8;
                    if ((var18_20 & 240) >> 4 >= 2) break;
                    v2 = true;
                    break;
                }
                case 4: {
                    if (var3_3 || (var18_21 = (i.var_int_arr_arr_a[var13_13][var14_14] & -256) >> 8) < this.var_int_ax) break;
                    this.var_boolean_u = true;
                    this.var_int_ax = var18_21 + 1;
                    this.var_int_Z = i.aN + 13;
                    break;
                }
                case 28: {
                    if (var3_3) break;
                    var9_9 = true;
                    this.var_boolean_au = false;
                    break;
                }
                case 5: {
                    var15_15 = true;
                    if (var3_3) break;
                    var9_9 = true;
                    this.var_boolean_au = true;
                    break;
                }
                case 2: {
                    if (var3_3) break;
                    var16_16 = true;
                    var18_22 = i.var_int_arr_arr_a[var13_13][var14_14] >> 8;
                    switch (var18_22) {
                        case 0: {
                            if (i.var_byte_arr_i[9] < 1) ** GOTO lbl98
                            this.ay = 7;
                            v3 = this;
                            v4 = 0;
                            ** GOTO lbl110
lbl98:
                            // 1 sources

                            v5 = this;
                            ** GOTO lbl106
                        }
                        case 1: {
                            if (i.var_byte_arr_i[9] >= 2) {
                                v5 = this;
                                v6 = 7;
                            } else {
                                v5 = this;
lbl106:
                                // 2 sources

                                v6 = 13;
                            }
                            v5.ay = v6;
                            v3 = this;
                            v4 = 1;
lbl110:
                            // 2 sources

                            v3.az = v4;
                        }
                    }
                    break;
                }
                case 6: {
                    break;
                }
                case 3: {
                    if (i.var_int_arr_arr_a[var13_13][var14_14] >> 8 < 3) {
                        var15_15 = true;
                        break;
                    }
                    var15_15 = false;
                    v2 = var4_4 = true;
                }
            }
            if (var4_4) break block59;
            var19_18 = i.var_byte_arr_arr_a[var13_13][var14_14];
            switch (var19_18) {
                case 34: 
                case 35: {
                    var15_15 = var3_3;
                    break;
                }
                case 31: 
                case 49: {
                    var15_15 = false;
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
                    var15_15 = true;
                    break;
                }
                case 10: {
                    if (this.var_byte_x != 3) break;
                    if (!var3_3 && i.var_int_arr_arr_b[var13_13][var14_14] <= 0) {
                        i.var_int_arr_arr_b[var13_13][var14_14] = 1;
                    }
                    var15_15 = true;
                    break;
                }
                case 0: 
                case 8: 
                case 9: 
                case 47: {
                    var20_19 = var6_6 + (var1_1 << 1);
                    var21_23 = var7_7 + (var2_2 << 1);
                    if (this.var_byte_i == 4 && (var20_19 == (var22_25 = this.int_g()) || var20_19 == var22_25 + 1) && var21_23 >= (var23_26 = this.int_h())) {
                        this.n(((var5_5 |= 8) & 7) == 2 ? 8 : 9);
                        return false;
                    }
                    var22_25 = i.var_int_arr_arr_a[var20_19][var21_23] & 255;
                    var23_26 = i.var_int_arr_arr_a[var20_19][var21_23] >> 8;
                    var24_27 = i.var_byte_arr_arr_a[var13_13][var7_7 + 1];
                    if ((--var10_10 < 0 || var3_3) && var1_1 != 0 && i.boolean_f(var20_19, var21_23) && (var22_25 != 7 || (var23_26 & 240) != 0) && (var24_27 != 19 && var24_27 != 45 && var24_27 != 49 && var24_27 != 43 || (i.var_int_arr_arr_a[var13_13][var7_7 + 1] & 255) == 35)) {
                        if (!var3_3) {
                            this.a((int)var13_13, var14_14, var1_1 > 0, var19_18);
                        }
                        var15_15 = true;
                        var5_5 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_5 |= 8;
                    }
                    var8_8 = 0;
                    i.var_int_arr_arr_b[var13_13][var14_14] = i.var_int_arr_arr_b[var13_13][var14_14] & -8 | 0;
                    break;
                }
                case 48: {
                    var20_19 = var6_6 + (var1_1 << 1);
                    var21_24 = var7_7 + (var2_2 << 1);
                    --var10_10;
                    if ((i.var_int_arr_arr_b[var13_13][var14_14] & 8) != 0) {
                        var25_28 = 0;
                        v7 = 1;
                    } else {
                        var25_28 = -1;
                        v7 = var26_29 = 0;
                    }
                    if ((var10_10 < 0 || var3_3) && var1_1 != 0 && i.var_byte_arr_arr_a[var20_19][var21_24 + var25_28] < 0 && i.var_byte_arr_arr_a[var20_19][var21_24 + var26_29] < 0 && i.var_byte_arr_arr_a[var13_13][var14_14 + var26_29 + 1] >= 0) {
                        if (!var3_3) {
                            i.var_byte_arr_arr_a[var20_19][var21_24 + var25_28] = var19_18;
                            i.var_byte_arr_arr_a[var20_19][var21_24 + var26_29] = var19_18;
                            i.var_byte_arr_arr_a[var13_13][var14_14 + var25_28] = -1;
                            i.var_byte_arr_arr_a[var13_13][var14_14 + var26_29] = -1;
                            i.var_int_arr_arr_b[var20_19][var21_24 + var25_28] = i.var_int_arr_arr_b[var13_13][var14_14 + var25_28];
                            i.var_int_arr_arr_b[var20_19][var21_24 + var26_29] = i.var_int_arr_arr_b[var13_13][var14_14 + var26_29] & -16 | (var1_1 > 0 ? 2 : 4);
                            i.var_byte_arr_arr_b[var20_19][var21_24 + var26_29] = 18;
                            i.var_byte_arr_arr_c[var20_19][var21_24 + var25_28 - 1] = 48;
                            i.var_byte_arr_arr_c[var20_19][var21_24 + var25_28 - 1] = 48;
                            i.var_byte_arr_arr_c[var20_19][var21_24 + var25_28 - 1] = 48;
                            i.q(var20_19, var21_24 + var26_29);
                        }
                        var15_15 = true;
                        var5_5 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_5 |= 8;
                    }
                    var8_8 = 0;
                    break;
                }
                case -1: {
                    if (var13_13 != 0 && var14_14 != 0 && var13_13 != this.var_int_av - 1 && var14_14 != this.var_int_aw - 1) ** GOTO lbl192
                    v8 = true;
                    ** GOTO lbl196
lbl192:
                    // 1 sources

                    if ((var1_1 != 0 && i.var_byte_arr_arr_a[var13_13][var7_7 + 1] == 0 && (i.var_int_arr_arr_b[var13_13][var7_7 + 1] & 7) == 3 || this.aI >= 24 && (i.var_byte_arr_arr_a[var13_13][var14_14 - 1] == 28 && (i.var_int_arr_arr_b[var13_13][var14_14 - 1] & 8) == 0 || i.var_byte_arr_arr_a[var13_13][var14_14 + 1] == 28 && (i.var_int_arr_arr_b[var13_13][var14_14 + 1] & 8) == 0) || this.aK >= 24 && (i.var_byte_arr_arr_a[var13_13][var14_14 - 1] == 28 || i.var_byte_arr_arr_a[var13_13][var14_14 + 1] == 28)) && var3_3 == false) {
                        var8_8 = 0;
                    } else {
                        v8 = true;
lbl196:
                        // 2 sources

                        var15_15 = v8;
                    }
                    var5_5 &= -9;
                    break;
                }
                case 28: {
                    var8_8 = 0;
                    var5_5 &= -9;
                    break;
                }
                default: {
                    var1_1 = 0;
                    var15_15 = false;
                    if (this.var_byte_k != 4 && this.var_byte_k != 2) break;
                    this.n(0 + this.var_byte_k - 1);
                }
            }
        }
        if (!var3_3 && var15_15 && !var16_16) {
            this.ay = -1;
        }
        if (var15_15 && var12_12 == 0) {
            var11_11 = 18;
            var6_6 += var1_1;
            var7_7 += var2_2;
            if ((var5_5 & 8) == 0 && !var3_3) {
                this.n(4 + var8_8 - 1);
            }
        } else if (var1_1 != 0 && !var3_3) {
            var5_5 |= 8;
        }
        if ((var5_5 & 8) != 0 && !var3_3) {
            this.n((var5_5 & 7) == 2 ? 8 : 9);
        }
        if (!var3_3) {
            this.aS = var5_5;
            this.aP = var6_6;
            this.aQ = var7_7;
            this.var_byte_k = var8_8;
            this.var_boolean_v = var9_9;
            this.aX = var10_10;
            this.aR = var11_11;
            this.aW = var12_12;
        }
        return var15_15;
    }

    public static void void_d() {
        var_byte_l = (byte)3;
    }

    private void bB() {
        var_byte_l = (byte)2;
        var_boolean_U = true;
        this.void_a(1);
        this.B();
        if (var_a_arr_a[18] == null) {
            i.var_a_arr_a[18] = i.a_a("/ui.f", 3);
        }
    }

    public final void void_e() {
        this.var_long_n = System.currentTimeMillis() - this.var_long_a;
        this.var_boolean_ae = true;
        System.out.println(h.boolean_a());
        if ((var_byte_l == 30 || var_byte_l == 4) && h.boolean_a()) {
            this.var_boolean_af = true;
        }
        this.var_h_a.e();
    }

    public final void showNotify() {
        if (this.var_boolean_ae) {
            this.void_f();
        }
    }

    public final void hideNotify() {
        if (!this.var_boolean_ae) {
            this.void_e();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void void_f() {
        this.var_boolean_ae = false;
        i.var_boolean_U = true;
        i.var_boolean_V = true;
        this.var_boolean_b = true;
        i.var_int_W = 0;
        this.dd = -1;
        if (this.bo == 7) {
            this.bq = 0;
        }
        this.var_long_a = System.currentTimeMillis() - this.var_long_n;
        switch (i.var_byte_l) {
            case 0: 
            case 6: 
            case 12: 
            case 22: {
                return;
            }
            case 4: 
            case 30: {
                if (!this.var_boolean_af) break;
                this.var_h_a.b(19);
                return;
            }
            case 7: {
                this.bq = 1;
                return;
            }
            case 15: {
                v0 = this;
                ** GOTO lbl90
            }
            case 10: {
                i.var_boolean_V = false;
                return;
            }
            case 1: {
                this.B();
                if (i.var_boolean_D) {
                    return;
                }
                if (this.var_c_a != null) {
                    return;
                }
                if (this.var_int_an != 0) {
                    return;
                }
                if (this.var_boolean_v) {
                    return;
                }
                if (this.var_byte_n <= 0) {
                    return;
                }
                if (i.var_g_arr_a[0].f == 19) {
                    return;
                }
                if (this.var_boolean_C) {
                    return;
                }
                this.bB();
                return;
            }
            case 5: {
                this.var_boolean_Q = true;
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
                this.var_boolean_P = true;
                return;
            }
            case 16: {
                this.var_int_ao = 0;
                this.bb = 0;
                this.var_boolean_n = false;
                this.var_int_V = 0;
                this.var_boolean_B = true;
                return;
            }
            case 17: {
                return;
            }
            case 18: 
            case 25: 
            case 26: {
                v0 = this;
                ** GOTO lbl90
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
                this.var_boolean_aw = true;
                this.var_boolean_e = true;
                return;
            }
            case 2: {
                i.var_javax_microedition_lcdui_Image_g = null;
                this.var_boolean_m = true;
                if (this.bo != 1) break;
                this.bq = 0;
                return;
            }
            case 33: {
                v0 = this;
lbl90:
                // 3 sources

                v0.var_boolean_aw = true;
            }
        }
    }

    private void bC() {
        if (!this.var_boolean_j) {
            return;
        }
        for (int j = 0; j < this.var_int_av; ++j) {
            for (int k = 0; k < this.var_int_aw; ++k) {
                if (var_byte_arr_arr_a[j][k] != 38) continue;
                this.byte_a((byte)var_int_arr_arr_b[j][k], (byte)j, (byte)k, (byte)0);
                ++this.dw;
            }
        }
    }

    private void n(int n, int n2) {
        this.var_long_c |= 0x400000L;
        int[] nArray = var_int_arr_arr_a[n];
        int n3 = n2;
        nArray[n3] = nArray[n3] & 0xFFFFFF00;
        int[] nArray2 = var_int_arr_arr_a[n];
        int n4 = n2;
        nArray2[n4] = nArray2[n4] | 0xE;
    }

    private boolean boolean_e() {
        return this.var_byte_i == 4 || this.var_byte_i == 5 || this.var_byte_i == 3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void bD() {
        var1_1 = new Hashtable<Integer, Integer>();
        var2_2 = new Hashtable<Integer, Integer>();
        var3_3 = new Hashtable<Integer, Integer>();
        this.var_int_X = 0;
        this.var_int_Y = 0;
        var4_4 = 0;
        this.aY = 0;
        this.bu = 0;
        var5_5 = 0;
        var6_6 = 0;
        this.var_boolean_ag = false;
        this.var_boolean_ah = false;
        this.var_boolean_ai = false;
        this.var_int_al = 0;
        var7_7 = 0;
        for (var8_8 = 0; var8_8 < this.var_int_av; ++var8_8) {
            block88: for (var9_9 = 0; var9_9 < this.var_int_aw; ++var9_9) {
                block123: {
                    i.var_byte_arr_arr_b[var8_8][var9_9] = 0;
                    i.var_byte_arr_arr_c[var8_8][var9_9] = 0;
                    var10_10 = i.var_int_arr_arr_a[var8_8][var9_9];
                    var11_11 = i.var_int_arr_arr_b[var8_8][var9_9];
                    var12_12 = i.var_byte_arr_arr_a[var8_8][var9_9];
                    if (var10_10 == -1) break block123;
                    switch (var10_10 & 255) {
                        case 31: {
                            this.var_long_c |= 0x40000000L;
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | 31;
                        }
                        case 19: {
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | 19;
                            break;
                        }
                        case 17: {
                            var13_13 = i.var_int_arr_arr_a[var8_8][var9_9 - 1] & 255;
                            if (var13_13 == 14 || var13_13 == 33) {
                                i.var_int_arr_arr_a[var8_8][var9_9 - 1] = 65280 | var13_13;
                            }
                            var14_14 = i.var_byte_arr_arr_a[var8_8][var9_9 - 1];
                            switch (var14_14) {
                                case 19: 
                                case 36: 
                                case 43: 
                                case 45: 
                                case 46: 
                                case 49: {
                                    var15_15 = new Integer(var11_11);
                                    var16_19 = (Integer)var2_2.get(var15_15);
                                    var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                                    var2_2.put(var15_15, var16_19);
                                    i.var_int_arr_arr_a[var8_8][var9_9] = -1;
                                    var17_22 = (Integer)var3_3.get(var15_15);
                                    if (var14_14 == 36) {
                                        if (var17_22 != null) break;
                                        var3_3.put(var15_15, new Integer(58));
                                        break;
                                    }
                                    var3_3.put(var15_15, new Integer(57));
                                    if (this.var_byte_i == 4) {
                                        var3_3.put(var15_15, new Integer(93));
                                        break;
                                    }
                                    if (this.var_byte_i == 5) {
                                        var3_3.put(var15_15, new Integer(94));
                                        break;
                                    }
                                    if (this.var_byte_i != 3) break;
                                    var3_3.put(var15_15, new Integer(95));
                                    break;
                                }
                                default: {
                                    i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | 17;
                                }
                            }
                            if (var11_11 < 0) break;
                            var6_6 |= 1 << var11_11;
                            break;
                        }
                        case 14: 
                        case 33: {
                            if (!this.boolean_e()) {
                                i.var_int_arr_arr_a[var8_8][var9_9] = 33;
                            }
                            this.var_long_c |= 1L << ((i.var_int_arr_arr_a[var8_8][var9_9] & 255) == 14 ? 22 : 33);
                            if (!this.boolean_a(this.var_int_ap, this.var_int_aq, var8_8, var9_9)) break;
                            if (this.boolean_e()) {
                                i.var_byte_arr_arr_a[var8_8][var9_9] = 41;
                                i.var_int_arr_arr_b[var8_8][var9_9] = 10;
                                this.aY += 10;
                                break;
                            }
                            i.var_byte_arr_arr_a[var8_8][var9_9] = -1;
                            v0 = i.var_int_arr_arr_a[var8_8];
                            v1 = var9_9;
                            v0[v1] = v0[v1] | 256;
                            break;
                        }
                        case 2: {
                            this.var_long_c |= 0x100000L;
                            switch (var11_11) {
                                case 0: 
                                case 1: {
                                    this.var_long_c |= 524288L;
                                }
                            }
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | 2;
                            break;
                        }
                        case 8: {
                            this.var_boolean_ah = true;
                        }
                        case 9: {
                            if ((var10_10 & 255) != 8) {
                                this.var_boolean_ag = true;
                            }
                            this.var_long_c |= 0x10000000L;
                            var15_15 = new Integer(var11_11);
                            var16_19 = (Integer)var1_1.get(var15_15);
                            var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                            var1_1.put(var15_15, var16_19);
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | var10_10;
                            break;
                        }
                        case 7: {
                            if (var11_11 != -1) {
                                i.var_byte_arr_q[var11_11] = (byte)var8_8;
                                i.var_byte_arr_r[var11_11] = (byte)var9_9;
                            }
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | var10_10;
                            break;
                        }
                        case 30: {
                            this.var_long_c |= 0x40000000L;
                            ++var7_7;
                        }
                        case 1: 
                        case 26: {
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 0: {
                            ++var7_7;
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 4: {
                            ++var5_5;
                            this.var_long_c |= 16L;
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 5: {
                            this.var_byte_p = (byte)var11_11;
                            break;
                        }
                        case 28: {
                            this.var_byte_q = (byte)var11_11;
                            break;
                        }
                        case 3: {
                            i.var_byte_arr_arr_c[var8_8][var9_9] = 127;
                            if (var11_11 <= 0) break;
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 + 1 << 8 | 3;
                            break;
                        }
                        case 6: {
                            var15_15 = new Integer(var11_11);
                            var16_19 = (Integer)var1_1.get(var15_15);
                            var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                            var1_1.put(var15_15, var16_19);
                            this.var_long_c |= 0x20000000L;
                            i.var_int_arr_arr_a[var8_8][var9_9] = var11_11 << 8 | 6;
                            break;
                        }
                        default: {
                            if (var10_10 < 20 || var10_10 >= 26) ** GOTO lbl162
                            i.var_int_arr_arr_a[var8_8][var9_9] = var10_10;
                            switch (this.var_int_ap) {
                                case 0: {
                                    v2 = this;
                                    v3 = v2;
                                    v4 = v2.var_long_c;
                                    v5 = 16L;
                                    ** GOTO lbl160
                                }
                                case 1: {
                                    v6 = this;
                                    v3 = v6;
                                    v4 = v6.var_long_c;
                                    v5 = 0x200000L;
lbl160:
                                    // 2 sources

                                    v3.var_long_c = v4 | v5;
                                }
                            }
                            break;
lbl162:
                            // 1 sources

                            if (var10_10 >= 80 || var10_10 <= -1) break;
                            i.var_int_arr_arr_a[var8_8][var9_9] = -1;
                            break;
                        }
                        case 34: {
                            this.var_long_c |= 0x400000000L;
                        }
                    }
                }
                switch (var12_12) {
                    case 48: {
                        if ((var11_11 & 7) == 4) {
                            v7 = i.var_int_arr_arr_b[var8_8];
                            v8 = var9_9;
                            v9 = 16;
                        } else {
                            v7 = i.var_int_arr_arr_b[var8_8];
                            v8 = var9_9;
                            v9 = 0;
                        }
                        v7[v8] = v9;
                        ++this.var_int_al;
                        this.var_long_c |= 0x10000000000L;
                        this.var_long_c |= 0x100000000L;
                        var13_13 = var9_9 - 1;
                        i.var_byte_arr_arr_a[var8_8][var13_13] = 48;
                        i.var_int_arr_arr_b[var8_8][var13_13] = 8;
                        i.q(var8_8, var13_13);
                        continue block88;
                    }
                    case 47: {
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 48;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        this.var_long_c |= 0x800000L;
                        continue block88;
                    }
                    case 46: {
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 24;
                        i.var_byte_arr_arr_b[var8_8][var9_9] = 0;
                        this.var_long_c |= 0x2000000000L;
                        continue block88;
                    }
                    case 45: {
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 24;
                        this.var_long_c |= 0x800000000L;
                        continue block88;
                    }
                    case 44: {
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 24;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        this.var_long_c |= 0x400000000L;
                        continue block88;
                    }
                    case 42: {
                        ++var7_7;
                        ++var4_4;
                        this.var_long_c |= 0x80000000L;
                        this.var_long_c |= 0x40000000L;
                        this.n(var8_8, var9_9);
                        continue block88;
                    }
                    case 41: {
                        if (i.var_int_arr_arr_b[var8_8][var9_9] <= 0) {
                            i.var_int_arr_arr_b[var8_8][var9_9] = 1;
                        }
                        this.aY += i.var_int_arr_arr_b[var8_8][var9_9];
                        continue block88;
                    }
                    case 40: {
                        this.var_long_c |= 0x40000000L;
                        ++var7_7;
                        this.var_boolean_j = true;
                        this.var_long_c |= 0x8000000L;
                        this.n(var8_8, var9_9);
                        ++var4_4;
                        continue block88;
                    }
                    case 12: {
                        this.var_int_Q = var8_8;
                        this.var_int_R = var9_9;
                        this.var_int_P = var11_11;
                        continue block88;
                    }
                    case 36: {
                        if (i.var_int_arr_arr_b[var8_8][var9_9] != 1) {
                            i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        }
                        this.var_long_c |= 256L;
                        continue block88;
                    }
                    case 18: {
                        this.ce = 0;
                        this.cf = 0;
                        this.var_long_c |= 0x8000000000L;
                        this.var_long_c |= 128L;
                        continue block88;
                    }
                    case 34: {
                        i.var_byte_arr_arr_a[var8_8][var9_9] = -1;
                        i.var_int_arr_arr_a[var8_8][var9_9] = 15;
                        this.var_long_c |= 0x1000000L;
                        continue block88;
                    }
                    case 35: {
                        i.var_byte_arr_arr_a[var8_8][var9_9] = 35;
                        i.var_int_arr_arr_a[var8_8][var9_9] = -1;
                        this.var_long_c |= 0x1000000L;
                        this.var_boolean_ai = true;
                        continue block88;
                    }
                    case 31: 
                    case 33: {
                        continue block88;
                    }
                    case 39: {
                        this.var_boolean_j = true;
                        this.var_long_c |= 0x4000000L;
                        continue block88;
                    }
                    case 38: {
                        this.var_boolean_j = true;
                        this.var_long_c |= 0x4000000L;
                        i.var_int_arr_arr_a[var8_8][var9_9] = 27;
                        this.var_long_c |= 64L;
                        continue block88;
                    }
                    case 14: {
                        this.var_long_c |= 4096L;
                        i.var_int_arr_arr_b[var8_8][var9_9] = i.var_int_arr_arr_b[var8_8][var9_9] == 4 ? 8 : 0;
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 24;
                        break;
                    }
                    case 28: {
                        this.var_long_c |= 2048L;
                        if (var11_11 > 10) {
                            v13 = i.var_int_arr_arr_b[var8_8];
                            v14 = var9_9;
                            v13[v14] = v13[v14] / 11;
                            v15 = i.var_int_arr_arr_b[var8_8];
                            v16 = var9_9;
                            v15[v16] = v15[v16] | 8;
                        }
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 24;
                        break;
                    }
                    case 79: {
                        this.aP = 0;
                        this.aQ = var9_9;
                        this.var_int_an = var8_8;
                        i.var_byte_arr_arr_a[var8_8][var9_9] = -1;
                        this.var_int_at = 0;
                        this.var_int_ar = 0;
                        this.var_int_as = this.var_int_au = this.aQ * 24 - 160;
                        continue block88;
                    }
                    case 11: {
                        i.var_int_arr_arr_b[var8_8][var9_9] = var11_11 == 1 ? 16 : 0;
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 48;
                        this.var_long_c |= 16384L;
                        continue block88;
                    }
                    case 49: {
                        this.var_long_c |= 0x20000000000L;
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 43: {
                        this.var_long_c |= 1L << (this.var_int_ap == 1 ? 17 : 15);
                        this.bu |= 1;
                        i.var_int_arr_arr_b[var8_8][var9_9] = var11_11 & -98305 | 65536;
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 19: {
                        this.var_long_c |= 1L << (this.var_int_ap == 1 ? 17 : 15);
                        this.bu |= 2;
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 22: 
                    case 23: {
                        this.var_long_c |= 512L;
                        this.var_long_c |= 1024L;
                        v10 = i.var_byte_arr_arr_c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 30: {
                        this.var_long_c |= 128L;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 37: {
                        this.var_long_c |= 0x2000000L;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 10: {
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        this.var_long_d |= 2L;
                        continue block88;
                    }
                    case 16: {
                        if (i.var_byte_arr_arr_a[var8_8][var9_9 + 1] != 16) {
                            i.var_byte_arr_arr_a[var8_8][var9_9 - 1] = 16;
                            i.var_int_arr_arr_b[var8_8][var9_9 - 1] = var11_11;
                        }
                        this.var_long_c |= 8192L;
                        continue block88;
                    }
                    case 6: {
                        ++var4_4;
                        this.n(var8_8, var9_9);
                    }
                    case 7: {
                        this.var_long_c |= 16L;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 26: {
                        this.var_long_c |= 0x10000000000L;
                    }
                    case 24: 
                    case 27: {
                        ++var7_7;
                        ++var4_4;
                        this.var_long_c |= 0x40000000L;
                        this.var_long_c |= 524288L;
                        this.n(var8_8, var9_9);
                        continue block88;
                    }
                    case 8: {
                        this.var_long_c |= 32L;
                        this.var_long_c |= 8L;
                    }
                    case 4: {
                        if (var12_12 != 8) {
                            this.n(var8_8, var9_9);
                        }
                    }
                    case 5: {
                        this.var_long_c |= 4L;
                    }
                    case 2: {
                        ++var4_4;
                    }
                    case 0: {
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 48;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        this.var_long_d |= 1L;
                        continue block88;
                    }
                    case 1: {
                        ++this.aY;
                        i.var_byte_arr_arr_c[var8_8][var9_9] = 48;
                        i.var_int_arr_arr_b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 53: {
                        continue block88;
                    }
                    case 51: {
                        continue block88;
                    }
                    case 52: {
                        continue block88;
                    }
                    default: {
                        if (var12_12 >= 80 || var12_12 <= -1) continue block88;
                        v10 = i.var_byte_arr_arr_a[var8_8];
                        v11 = var9_9;
                        v12 = -1;
                    }
                }
                v10[v11] = v12;
            }
        }
        i.var_byte_arr_d = new byte[var4_4 << 1];
        for (var8_8 = 0; var8_8 < i.var_byte_arr_d.length; ++var8_8) {
            i.var_byte_arr_d[var8_8] = 0;
        }
        i.var_c_arr_a = new c[var7_7];
        i.var_byte_arr_p = new byte[var7_7];
        var8_8 = 0;
        i.var_byte_arr_k = new byte[(var5_5 + 1) * 2];
        for (var9_9 = 31; var9_9 >= 0 && (var6_6 & 1 << var9_9) == 0; --var9_9) {
        }
        if (++var9_9 > 0) {
            i.var_byte_arr_m = new byte[var9_9];
            i.var_byte_arr_l = new byte[var9_9];
        }
        if (this.var_int_al > 0) {
            i.var_byte_arr_e = new byte[this.var_int_al * 3];
        }
        var10_10 = 0;
        for (var11_11 = 0; var11_11 < this.var_int_aw; ++var11_11) {
            block92: for (var12_12 = 0; var12_12 < this.var_int_av; ++var12_12) {
                var13_13 = i.var_int_arr_arr_a[var12_12][var11_11] & 255;
                var14_14 = i.var_int_arr_arr_a[var12_12][var11_11] >> 8;
                switch (var13_13) {
                    case 0: 
                    case 30: {
                        v17 = i.var_byte_arr_p;
                        v18 = var8_8++;
                        v19 = (byte)var14_14;
                        ** GOTO lbl463
                    }
                    case 7: {
                        var15_17 = (Integer)var1_1.get(new Integer(var14_14));
                        var14_14 <<= 8;
                        if (var15_17 != null) {
                            var14_14 = var14_14 & -16 | var15_17;
                        }
                        var16_21 = (i.var_int_arr_arr_a[var12_12][var11_11 - 1] & 255) == 17 ? 1 : 0;
                        v20 = var17_23 = (i.var_int_arr_arr_a[var12_12][var11_11 + 1] & 255) == 17 && (i.var_int_arr_arr_a[var12_12 + 1][var11_11] & 255) != 26 && (i.var_int_arr_arr_a[var12_12 - 1][var11_11] & 255) != 26;
                        if (var16_21 != 0 || var17_23) {
                            var14_14 = var14_14 & -241 | 48;
                            i.var_byte_arr_arr_c[var12_12][var11_11] = 24;
                            if (var16_21 != 0) {
                                i.var_int_arr_arr_a[var12_12][var11_11 - 1] = -1;
                            }
                        }
                        i.var_int_arr_arr_a[var12_12][var11_11] = var14_14 << 8 | var13_13;
                        break;
                    }
                    case 4: {
                        var18_24 = var14_14;
                        i.var_byte_arr_k[var18_24 * 2] = (byte)var12_12;
                        v17 = i.var_byte_arr_k;
                        v18 = var18_24 * 2 + 1;
                        v19 = (byte)var11_11;
                        ** GOTO lbl463
                    }
                    case 5: {
                        i.var_byte_arr_k[var5_5 * 2] = (byte)var12_12;
                        v17 = i.var_byte_arr_k;
                        v18 = var5_5 * 2 + 1;
                        v19 = (byte)var11_11;
                        ** GOTO lbl463
                    }
                    case 17: {
                        if (var14_14 == -1) break;
                        var19_25 = new Integer(var14_14);
                        var20_26 = (Integer)var2_2.get(var19_25);
                        if (var20_26 == null) {
                            var20_26 = new Integer(0);
                        }
                        i.var_byte_arr_m[var14_14] = var20_26.byteValue();
                        var21_27 = (Integer)var3_3.get(var19_25);
                        if (var21_27 == null) {
                            var21_27 = new Integer(59);
                        }
                        v17 = i.var_byte_arr_l;
                        v18 = var14_14;
                        v19 = var21_27.byteValue();
lbl463:
                        // 4 sources

                        v17[v18] = v19;
                    }
                }
                switch (i.var_byte_arr_arr_a[var12_12][var11_11]) {
                    case 48: {
                        if ((i.var_int_arr_arr_b[var12_12][var11_11] & 8) == 0) continue block92;
                        var15_18 = var12_12 + ((i.var_int_arr_arr_b[var12_12][var11_11 + 1] & 16) == 0 ? 1 : -1);
                        var16_21 = var10_10 * 3;
                        if (i.int_d(var15_18, var11_11) >= 0) {
                            i.var_byte_arr_e[var16_21 + 0] = (byte)var15_18;
                            i.var_byte_arr_e[var16_21 + 1] = (byte)var15_18;
                            v21 = i.var_byte_arr_e;
                            v22 = var16_21 + 2;
                            v23 = (byte)var11_11;
                        } else {
                            v21 = i.var_byte_arr_e;
                            v22 = var16_21 + 2;
                            v23 = -1;
                        }
                        v21[v22] = v23;
                        i.var_int_arr_arr_b[var12_12][var11_11] = i.var_int_arr_arr_b[var12_12][var11_11] & 0xFFFFFF | var10_10 << 24;
                        ++var10_10;
                        continue block92;
                    }
                    case 26: {
                        v24 = i.var_byte_arr_p;
                        v25 = var8_8++;
                        v26 = 25;
                        ** GOTO lbl507
                    }
                    case 42: {
                        v24 = i.var_byte_arr_p;
                        v25 = var8_8++;
                        v26 = 11;
                        ** GOTO lbl507
                    }
                    case 24: {
                        v24 = i.var_byte_arr_p;
                        v25 = var8_8++;
                        v26 = 22;
                        ** GOTO lbl507
                    }
                    case 27: {
                        v24 = i.var_byte_arr_p;
                        v25 = var8_8++;
                        v26 = 23;
                        ** GOTO lbl507
                    }
                    case 40: {
                        v24 = i.var_byte_arr_p;
                        v25 = var8_8++;
                        v26 = 24;
lbl507:
                        // 5 sources

                        v24[v25] = v26;
                    }
                }
            }
        }
        i.var_int_arr_arr_a[this.var_int_an - 2][this.aQ] = -193 << 8 | 7;
        if ((this.var_long_c & 0x100000000L) != 0L || i.var_byte_arr_i[9] >= 8) {
            this.var_long_c |= 0x10000000000L;
            this.var_long_c |= 2L;
            this.var_long_c |= 1L;
            if ((this.var_long_c & 131072L) != 0L) {
                this.var_long_c |= 262144L;
            }
            if ((this.var_long_c & 32768L) != 0L) {
                this.var_long_c |= 65536L;
            }
            if ((this.var_long_c & 0x800000000L) != 0L) {
                this.var_long_c |= 0x1000000000L;
            }
            if ((this.var_long_c & 0x2000000000L) != 0L) {
                this.var_long_c |= 0x4000000000L;
            }
            if ((this.var_long_c & 0x20000000000L) != 0L) {
                this.var_long_c |= 0x40000000000L;
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5) {
        if (n + n3 <= 0 || n + n3 >= this.var_int_av || n2 + n4 <= 0 || n2 + n4 >= this.var_int_aw) {
            return;
        }
        int n6 = n3;
        int n7 = n4;
        int n8 = var_int_arr_arr_a[n + n3][n2 + n4] & 0xFF;
        switch (n8) {
            case 8: 
            case 9: {
                int n9 = var_int_arr_arr_a[n + n3][n2 + n4] >> 8;
                n9 = n5 == 1 ? n9 | 0x200 : n9 & 0xFFFFFDFF;
                i.var_int_arr_arr_a[n + n3][n2 + n4] = n9 << 8 | n8;
                this.a(n + n3, n2 + n4, n6, n7, n5);
                this.a(n + n3, n2 + n4, 0, 1, n5);
            }
        }
    }

    private boolean boolean_d(int n, int n2) {
        return n == this.aP && n2 == this.aQ;
    }

    private void u(int n) {
        this.var_byte_k = 0;
        this.var_byte_j = 0;
        for (int j = 0; j < var_byte_arr_p.length; ++j) {
            if (var_byte_arr_p[j] != n) continue;
            this.var_c_a = var_c_arr_a[j];
        }
        this.var_c_a.byte_arr_a();
    }

    private boolean boolean_f() {
        boolean bl;
        boolean bl2;
        block26: {
            block24: {
                block25: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    block19: {
                                        block17: {
                                            block18: {
                                                block16: {
                                                    block14: {
                                                        block15: {
                                                            block13: {
                                                                if (this.var_int_ar >= this.ci) break block13;
                                                                this.var_int_ar += this.ck;
                                                                if (this.var_int_ar <= this.ci) break block14;
                                                                break block15;
                                                            }
                                                            if (this.var_int_ar <= this.ci) break block14;
                                                            this.var_int_ar -= this.ck;
                                                            if (this.var_int_ar >= this.ci) break block14;
                                                        }
                                                        this.var_int_ar = this.ci;
                                                    }
                                                    if (this.var_int_as >= this.cj) break block16;
                                                    this.var_int_as += this.ck;
                                                    if (this.var_int_as <= this.cj) break block17;
                                                    break block18;
                                                }
                                                if (this.var_int_as <= this.cj) break block17;
                                                this.var_int_as -= this.ck;
                                                if (this.var_int_as >= this.cj) break block17;
                                            }
                                            this.var_int_as = this.cj;
                                        }
                                        bl2 = false;
                                        bl = false;
                                        if (this.var_int_ar >= 0) break block19;
                                        this.var_int_ar = 0;
                                        break block20;
                                    }
                                    if (this.var_int_ar <= this.var_int_av * 24 - 240) break block21;
                                    this.var_int_ar = this.var_int_av * 24 - 240;
                                    break block20;
                                }
                                if (this.var_int_ar != this.ci) break block22;
                            }
                            bl2 = true;
                        }
                        if (this.var_int_as >= 0) break block23;
                        this.var_int_as = 0;
                        break block24;
                    }
                    if (this.var_int_as <= this.var_int_aw * 24 - 320 + 80) break block25;
                    this.var_int_as = this.var_int_aw * 24 - 320 + 80;
                    break block24;
                }
                if (this.var_int_as != this.cj) break block26;
            }
            bl = true;
        }
        if (bl2 && bl) {
            this.var_int_at = this.var_int_ar;
            this.var_int_au = this.var_int_as;
            this.var_int_am = 70;
            return true;
        }
        return false;
    }

    private void bE() {
        switch (this.cl) {
            case 1: {
                this.ck = 8;
                if (!this.boolean_f()) break;
                this.cl = 2;
                this.dn = 40;
                return;
            }
            case 2: {
                --this.dn;
                if (this.dn == 30) {
                    int n = var_int_arr_arr_a[this.dl][this.dm] >> 8;
                    if ((n & 0xF0) == 0) break;
                    this.void_j(this.dl, this.dm);
                    return;
                }
                if (this.dn != 0) break;
                this.cl = 3;
                this.ci = this.aP * 24 - 108;
                this.cj = this.aQ * 24 - 108;
                this.ck = 5;
                this.var_java_lang_String_e = var_java_lang_String_arr_a[var_byte_arr_l[cm]];
                var_a_arr_a[41].int_a(this.var_java_lang_String_e);
                this.dk = 80;
                return;
            }
            case 3: {
                if (!this.boolean_f()) break;
                this.dn = 20;
                this.cl = 4;
                this.var_int_am = 0;
                return;
            }
            case 4: {
                --this.dn;
                if (this.dn != 0) break;
                this.var_int_am = 0;
                this.cl = 0;
                var_boolean_ak = true;
            }
        }
    }

    private void v(int n) {
        this.C(1);
        int n2 = this.var_int_av - 1;
        int n3 = this.var_int_aw - 1;
        for (int j = 1; j < n3; ++j) {
            for (int k = 1; k < n2; ++k) {
                int n4;
                if ((var_int_arr_arr_a[k][j] & 0xFF) != 17 || var_int_arr_arr_a[k][j] >> 8 != n) continue;
                int n5 = -1;
                int n6 = -1;
                if (var_byte_arr_arr_a[k][j] == 18) {
                    n5 = k;
                    n4 = j;
                } else {
                    int n7 = var_int_arr_arr_a[k][j - 1] & 0xFF;
                    switch (n7) {
                        case 7: {
                            int n8 = var_int_arr_arr_a[k][j - 1] >> 8;
                            if ((n8 & 0xF0) == 0) break;
                        }
                        case 14: 
                        case 33: {
                            n5 = k;
                            n4 = n6 = j - 1;
                        }
                    }
                }
                if (n5 == -1) continue;
                this.dl = n5;
                this.dm = n6;
                this.ci = 24 * n5 - 108;
                this.cj = 24 * n6 - 108;
            }
        }
    }

    private void w(int n) {
        this.C(8);
        int n2 = this.var_int_av - 1;
        int n3 = this.var_int_aw - 1;
        for (int j = 1; j < n3; ++j) {
            block5: for (int k = 1; k < n2; ++k) {
                if ((var_int_arr_arr_a[k][j] & 0xFF) != 17 || var_int_arr_arr_a[k][j] >> 8 != n) continue;
                int n4 = var_int_arr_arr_a[k][j - 1] & 0xFF;
                switch (n4) {
                    case 7: {
                        i.void_i(k, j - 1);
                        continue block5;
                    }
                    case 14: 
                    case 33: {
                        i.var_int_arr_arr_a[k][j - 1] = 0 | n4;
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bF() {
        var2_1 = this.aP - 8;
        var3_2 = this.aP + 8;
        var4_3 = this.aQ + 8;
        var5_4 = this.aQ - 8;
        var6_5 = 0;
        if (i.var_g_arr_a[4] != null) {
            var7_6 = i.var_g_arr_a[4].g;
            v0 = var7_6 == 0 ? 0 : (var7_6 <= 10 ? 1 : (var6_5 = var7_6 <= 20 ? 2 : 3));
        }
        if (var2_1 < 1) {
            var2_1 = 1;
        }
        if (var3_2 > this.var_int_av - 2) {
            var3_2 = this.var_int_av - 2;
        }
        if (var5_4 < 1) {
            var5_4 = 1;
        }
        if (var4_3 > this.var_int_aw - 2) {
            var4_3 = this.var_int_aw - 2;
        }
        v1 = this;
        v2 = v1.bF = var4_3;
        while (this.bF >= var5_4) {
            v3 = this;
            v4 = v3.bE = var2_1;
            while (this.bE <= var3_2) {
                block76: {
                    v5 = var7_6 = this.bi != 0 && this.bE == this.bg && this.bF == this.bh ? 1 : 0;
                    if (i.var_byte_arr_arr_c[this.bE][this.bF] <= 0 || var7_6 != 0) break block76;
                    v6 = i.var_byte_arr_arr_c[this.bE];
                    v7 = this.bF;
                    v6[v7] = (byte)(v6[v7] - 6);
                    var1_7 = (byte)(i.var_int_arr_arr_a[this.bE][this.bF] & 255);
                    switch (var1_7) {
                        case 36: {
                            this.bd();
                            break;
                        }
                        case 35: 
                        case 37: {
                            if (this.bE == this.bg && this.bF == this.bh && this.bi != 0) break;
                            this.bH();
                            break;
                        }
                        case 32: {
                            this.bL();
                            break;
                        }
                        case 26: {
                            this.bP();
                            break;
                        }
                        case 6: {
                            this.bM();
                            break;
                        }
                        case 33: {
                            this.z(33);
                            break;
                        }
                        case 14: {
                            this.z(14);
                            break;
                        }
                        case 2: {
                            switch (i.var_int_arr_arr_a[this.bE][this.bF] >> 8) {
                                case 0: {
                                    if (i.var_byte_arr_arr_a[this.bE - 1][this.bF] == 30 || i.var_byte_arr_arr_a[this.bE + 1][this.bF] == 30 || i.var_byte_arr_arr_a[this.bE][this.bF - 1] == 30 || i.var_byte_arr_arr_a[this.bE][this.bF + 1] == 30) break;
                                    this.ay = -1;
                                    this.b(this.bE, this.bF, (byte)2);
                                }
                            }
                            break;
                        }
                        case 3: {
                            this.ce();
                            break;
                        }
                        case 30: {
                            if (this.var_c_a != null || this.bm != -1 || !this.boolean_d(this.bE, this.bF) || this.aR > 0) break;
                            this.bm = i.var_int_arr_arr_a[this.bE][this.bF] >> 8;
                            i.var_int_arr_arr_a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 0: {
                            if (this.var_c_a != null || this.bm != -1 || !this.boolean_d(this.bE, this.bF) || this.aR > 6) break;
                            this.bm = i.var_int_arr_arr_a[this.bE][this.bF] >> 8;
                            i.var_int_arr_arr_a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 7: {
                            this.cd();
                            break;
                        }
                        case 8: {
                            v8 = this;
                            ** GOTO lbl80
                        }
                        case 9: {
                            v8 = this;
lbl80:
                            // 2 sources

                            v8.cc();
                        }
                    }
                    var8_8 = (i.var_int_arr_arr_a[this.bE][this.bF] & -268435456) >> 28;
                    if (var8_8 > 0) {
                        this.bR();
                    }
                    var1_7 = i.var_byte_arr_arr_a[this.bE][this.bF];
                    switch (var1_7) {
                        case 54: {
                            this.bN();
                            break;
                        }
                        case 50: {
                            if (this.aR >= 12 || !this.boolean_d(this.bE, this.bF) || this.var_boolean_h) break;
                            this.void_a(1, 48, (int)i.var_byte_arr_h[this.aS & 7]);
                            break;
                        }
                        case 49: {
                            this.e((byte)49);
                            break;
                        }
                        case 48: {
                            if ((i.var_int_arr_arr_b[this.bE][this.bF] & 8) == 0) {
                                this.d((byte)48);
                                break;
                            }
                            this.bG();
                            break;
                        }
                        case 46: {
                            this.bJ();
                            break;
                        }
                        case 45: {
                            this.aL();
                            break;
                        }
                        case 44: {
                            this.bK();
                            break;
                        }
                        case 40: {
                            this.x(40);
                            break;
                        }
                        case 36: {
                            this.bO();
                            break;
                        }
                        case 28: {
                            this.cb();
                            break;
                        }
                        case 16: {
                            this.ca();
                            break;
                        }
                        case 14: {
                            this.bZ();
                            break;
                        }
                        case 10: {
                            this.bW();
                            break;
                        }
                        case 21: {
                            this.bY();
                            break;
                        }
                        case 32: {
                            this.bX();
                            break;
                        }
                        case 11: {
                            this.bV();
                            break;
                        }
                        case 37: {
                            this.bU();
                            break;
                        }
                        case 30: {
                            this.bT();
                            break;
                        }
                        case 24: {
                            this.y(24);
                            break;
                        }
                        case 27: {
                            this.y(27);
                            break;
                        }
                        case 26: {
                            this.y(26);
                            break;
                        }
                        case 43: {
                            this.e((byte)43);
                            break;
                        }
                        case 19: {
                            this.e((byte)19);
                            break;
                        }
                        case 42: {
                            this.x(42);
                            break;
                        }
                        case 2: {
                            this.x(2);
                            break;
                        }
                        case 53: {
                            this.x(53);
                            break;
                        }
                        case 51: {
                            this.x(51);
                            break;
                        }
                        case 52: {
                            this.x(52);
                            break;
                        }
                        case 5: {
                            this.x(5);
                            break;
                        }
                        case 4: {
                            this.x(4);
                            break;
                        }
                        case 6: {
                            this.x(6);
                            break;
                        }
                        case 7: {
                            this.x(7);
                            break;
                        }
                        case 41: {
                            this.x(41);
                            break;
                        }
                        case 47: {
                            this.ch();
                            this.bI();
                            break;
                        }
                        case 1: {
                            this.ch();
                            break;
                        }
                        case 0: {
                            this.ch();
                            break;
                        }
                        case 9: {
                            if ((i.var_int_arr_arr_b[this.bE][this.bF] & 0xFC00000) != 0x8400000) ** GOTO lbl221
                            i.var_byte_arr_arr_c[this.bE][this.bF] = 24;
                            if (this.var_int_aj > 0) {
                                v9 = this;
                                v10 = v9;
                                v11 = v9.var_int_aj - 1;
                            } else if (this.var_int_aj < 0) {
                                v12 = this;
                                v10 = v12;
                                v11 = v10.var_int_aj = v12.var_int_aj + 1;
                            }
                            if (this.var_int_ak <= 0) ** GOTO lbl216
                            v13 = this;
                            v14 = v13;
                            v15 = v13.var_int_ak - 1;
                            ** GOTO lbl220
lbl216:
                            // 1 sources

                            if (this.var_int_ak >= 0) ** GOTO lbl221
                            v16 = this;
                            v14 = v16;
                            v15 = v16.var_int_ak + 1;
lbl220:
                            // 2 sources

                            v14.var_int_ak = v15;
lbl221:
                            // 3 sources

                            this.ch();
                            break;
                        }
                        case 8: {
                            this.ch();
                            break;
                        }
                        case 23: {
                            v17 = this;
                            v18 = 23;
                            ** GOTO lbl233
                        }
                        case 22: {
                            v17 = this;
                            v18 = 22;
lbl233:
                            // 2 sources

                            v17.o(v18, var6_5);
                        }
                    }
                }
                v19 = this;
                v3 = v19;
                v4 = v19.bE + 1;
            }
            v20 = this;
            v1 = v20;
            v2 = v20.bF - 1;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void bG() {
        block6: {
            var1_1 = this.bE;
            var2_2 = this.bF;
            var3_3 = var2_2 + 1;
            var4_4 = i.var_int_arr_arr_b[var1_1][var3_3];
            switch (var4_4 & 7) {
                case 4: {
                    v0 = var1_1 + 1;
                    break block6;
                }
                case 2: {
                    v1 = var1_1;
                    break;
                }
                default: {
                    if ((var4_4 & 16) != 0) ** GOTO lbl16
                    v0 = var1_1 + 1;
                    break block6;
lbl16:
                    // 1 sources

                    v1 = var1_1;
                }
            }
            v0 = v1 - 1;
        }
        var5_5 = v0;
        var6_6 = (i.var_int_arr_arr_b[var1_1][var2_2] >> 24) * 3;
        if (i.var_byte_arr_arr_a[var5_5][var2_2] < 0) {
            i.var_byte_arr_e[var6_6 + 2] = (byte)var2_2;
            i.var_byte_arr_e[var6_6 + 1] = (byte)var5_5;
            v2 = i.var_byte_arr_e;
            v3 = var6_6 + 0;
            v4 = (byte)var5_5;
        } else {
            v2 = i.var_byte_arr_e;
            v3 = var6_6 + 2;
            v4 = -1;
        }
        v2[v3] = v4;
    }

    private void d(byte by) {
        int n = this.bE;
        int n2 = this.bF;
        if (var_byte_arr_arr_b[n][n2] == 6 && (var_int_arr_arr_a[n][n2] & 0xFF) == 6) {
            this.r(var_int_arr_arr_a[n][n2] >> 8);
        }
        if (var_byte_arr_arr_b[n][n2] <= 0) {
            int n3;
            int n4;
            int n5 = var_int_arr_arr_b[n][n2];
            int n6 = n5 & 7;
            if (n6 == 2) {
                n4 = n5 | 0x10;
            } else if (n6 == 4) {
                n4 = n5 = n5 & 0xFFFFFFEF;
            }
            if (!(var_byte_arr_arr_a[n][n3 = n2 + 1] >= 0 || this.boolean_d(n, n3) && this.aW == 0)) {
                i.var_byte_arr_arr_a[n][n2 - 1] = -1;
                i.var_byte_arr_arr_a[n][n3] = by;
                i.var_int_arr_arr_b[n][n3] = n5 & 0xFFFFFFF8 | 3;
                i.var_int_arr_arr_b[n][n2] = var_int_arr_arr_b[n][n2 - 1] | 8;
                i.var_byte_arr_arr_b[n][n3] = 18;
                int n7 = n2 - 2;
                i.var_byte_arr_arr_c[n - 1][n7] = 48;
                i.var_byte_arr_arr_c[n][n7] = 48;
                i.var_byte_arr_arr_c[n + 1][n7] = 48;
                i.q(n, n2);
                if (by == 48) {
                    this.bG();
                }
            } else {
                if ((n5 & 7) == 3 && this.boolean_d(n, n2 + 1)) {
                    this.void_a(2, 48, 0);
                }
                i.var_int_arr_arr_b[n][n2] = n5 & 0xFFFFFFF8 | 0;
            }
        } else {
            byte[] byArray = var_byte_arr_arr_b[n];
            int n8 = n2;
            byArray[n8] = (byte)(byArray[n8] - 6);
        }
        i.var_byte_arr_arr_c[n][n2] = 24;
        i.var_byte_arr_arr_c[n][n2 - 1] = 24;
    }

    private void bH() {
        block12: {
            byte by;
            block13: {
                int n;
                byte[] byArray;
                int n2;
                int n3;
                block8: {
                    byte by2;
                    int n4;
                    int n5;
                    block11: {
                        int n6;
                        block10: {
                            int n7;
                            int[] nArray;
                            block9: {
                                n3 = this.bE;
                                n2 = this.bF;
                                i.var_byte_arr_arr_c[n3][n2] = 24;
                                if (var_byte_arr_arr_b[n3][n2] > 0) break block8;
                                n5 = n2 - 1;
                                n4 = n2 + 1;
                                by2 = (byte)(var_int_arr_arr_a[n3][n5] & 0xFF);
                                if (by2 != 34 && by2 != 37) break block9;
                                nArray = var_int_arr_arr_a[n3];
                                n7 = n5;
                                n6 = 37;
                                break block10;
                            }
                            if (by2 == 35 || !i.boolean_e(n3, n5)) break block11;
                            i.var_byte_arr_arr_b[n3][n5] = 18;
                            nArray = var_int_arr_arr_a[n3];
                            n7 = n5;
                            n6 = 35;
                        }
                        nArray[n7] = n6;
                    }
                    byte by3 = var_byte_arr_arr_a[n3][n2];
                    if (var_byte_arr_arr_a[n3][n5] < 0 && !this.boolean_d(n3, n5) && by2 == 35 && by3 != 32 && by3 != 21 && var_byte_arr_arr_a[n3][n2] != -1) {
                        i.var_byte_arr_arr_b[n3][n5] = 18;
                        i.var_byte_arr_arr_a[n3][n5] = var_byte_arr_arr_a[n3][n2];
                        i.var_int_arr_arr_b[n3][n5] = var_int_arr_arr_b[n3][n2] & 0xFFFFFFF8 | 1;
                        i.var_byte_arr_arr_a[n3][n2] = -1;
                        this.void_b(n3, n2);
                    } else {
                        this.void_c(n3, n2);
                    }
                    if ((var_int_arr_arr_a[n3][n4] & 0xFF) != 35 && var_byte_arr_arr_a[n3][n4] != 47) {
                        int n8;
                        int n9;
                        int[] nArray;
                        if (var_int_arr_arr_a[n3][n2] == 37) {
                            nArray = var_int_arr_arr_a[n3];
                            n9 = n2;
                            n8 = 34;
                        } else {
                            nArray = var_int_arr_arr_a[n3];
                            n9 = n2;
                            n8 = -1;
                        }
                        nArray[n9] = n8;
                    }
                    i.var_byte_arr_arr_c[n3][n5] = 24;
                    if (var_byte_arr_arr_a[n3][n2] >= 0) break block12;
                    byArray = var_byte_arr_arr_b[n3];
                    n = n2;
                    by = (byte)18;
                    break block13;
                }
                byte[] byArray2 = var_byte_arr_arr_b[n3];
                int n10 = n2;
                n = n10;
                byArray = byArray2;
                by = (byte)(byArray2[n10] - 6);
            }
            byArray[n] = by;
        }
    }

    private static boolean boolean_e(int n, int n2) {
        byte by = var_byte_arr_arr_a[n][n2];
        int n3 = var_int_arr_arr_a[n][n2] & 0xFF;
        return by < 80 && by != 30 && by != 10 && by != 37 && by != 34 && by != 35 && n3 != 14 && n3 != 33 && n3 != 15 && n3 != 4 && n3 != 16;
    }

    private static boolean boolean_f(int n, int n2) {
        byte by = var_byte_arr_arr_a[n][n2];
        int n3 = var_int_arr_arr_a[n][n2] & 0xFF;
        return by == -1 && n3 != 14 && n3 != 33 && n3 != 5 && n3 != 28;
    }

    private static boolean boolean_g(int n, int n2) {
        byte by = var_byte_arr_arr_a[n][n2];
        int n3 = var_int_arr_arr_a[n][n2] & 0xFF;
        return by == -1 && n3 != 14 && n3 != 33 && n3 != 4 && n3 != 32 && (n3 != 7 || (var_int_arr_arr_a[n][n2] >> 8 & 0xF0) != 0);
    }

    private void bI() {
        boolean bl;
        int n = this.bF - 1;
        boolean bl2 = bl = var_int_arr_arr_e != null && var_int_arr_arr_e[this.bE][this.bF] != 0 && var_int_arr_arr_e[this.bE][this.bF - 1] == 0;
        if ((var_int_arr_arr_b[this.bE][this.bF] & 7) == 0 && (var_int_arr_arr_a[this.bE][n] & 0xFF) != 35 && i.boolean_e(this.bE, n) && (!this.boolean_d(this.bE - 1, this.bF) && !this.boolean_d(this.bE + 1, this.bF) || (this.aS & 8) == 0) && (var_byte_arr_arr_a[this.bE][this.bF + 1] >= 0 || bl)) {
            i.var_int_arr_arr_a[this.bE][n] = 35;
            i.var_byte_arr_arr_b[this.bE][n] = 18;
            i.var_byte_arr_arr_c[this.bE][n] = 24;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bJ() {
        block33: {
            block31: {
                block40: {
                    block39: {
                        block34: {
                            block38: {
                                block36: {
                                    block37: {
                                        block35: {
                                            block32: {
                                                var1_1 = this.bE;
                                                var2_2 = this.bF;
                                                var3_3 = i.var_int_arr_arr_b[var1_1][var2_2] & 31;
                                                var4_4 = (i.var_int_arr_arr_b[var1_1][var2_2] & 8160) >> 5;
                                                var5_5 = i.a(i.var_a_arr_a[29], var3_3);
                                                var6_6 = (i.var_int_arr_arr_a[var1_1][var2_2] & 255) == 35;
                                                if (var6_6) {
                                                    if (++var4_4 > var5_5) {
                                                        var4_4 = 0;
                                                    }
                                                    i.var_int_arr_arr_b[var1_1][var2_2] = 0 | var4_4 << 5;
                                                    return;
                                                }
                                                if (i.var_byte_arr_arr_a[var1_1][var2_2 + 1] < 0 && var3_3 != 8 && var3_3 != 9) {
                                                    switch (var3_3) {
                                                        case 0: 
                                                        case 2: 
                                                        case 4: 
                                                        case 6: {
                                                            v0 = 8;
                                                            break;
                                                        }
                                                        default: {
                                                            v0 = 9;
                                                        }
                                                    }
                                                    var3_3 = v0;
                                                    i.var_byte_arr_arr_b[var1_1][var2_2 + 1] = 18;
                                                    i.var_byte_arr_arr_a[var1_1][var2_2 + 1] = 46;
                                                    i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                                    i.var_int_arr_arr_b[var1_1][var2_2 + 1] = var3_3;
                                                    i.q(var1_1, var2_2);
                                                    return;
                                                }
                                                if (var3_3 != 8 && var3_3 != 9) break block32;
                                                v1 = i.var_byte_arr_arr_b[var1_1];
                                                v2 = var2_2;
                                                v1[v2] = (byte)(v1[v2] - 6);
                                                if (i.var_byte_arr_arr_b[var1_1][var2_2] < 0) {
                                                    if (i.var_byte_arr_arr_a[var1_1][var2_2 + 1] < 0) {
                                                        i.var_byte_arr_arr_b[var1_1][var2_2 + 1] = 18;
                                                        i.var_byte_arr_arr_a[var1_1][var2_2 + 1] = 46;
                                                        i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                                        i.var_int_arr_arr_b[var1_1][var2_2 + 1] = var3_3;
                                                        i.q(var1_1, var2_2);
                                                        return;
                                                    }
                                                    i.var_int_arr_arr_b[var1_1][var2_2] = var3_3 = var3_3 == 8 ? 10 : 11;
                                                    i.var_byte_arr_arr_b[var1_1][var2_2] = 0;
                                                    return;
                                                }
                                                if (i.a(var1_1, var2_2, 3, (int)i.var_byte_arr_arr_b[var1_1][var2_2], this.aP, this.aQ, this.aS & 7, this.aR)) {
                                                    this.void_a(1, 48, i.var_int_arr_arr_b[var1_1][var2_2] & 7);
                                                    return;
                                                }
                                                break block33;
                                            }
                                            if (this.boolean_i(var1_1, var2_2)) {
                                                i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                                this.p(var1_1, var2_2);
                                                i.q(var1_1, var2_2);
                                                return;
                                            }
                                            if (!this.boolean_d(var1_1 - 1, var2_2) && !this.boolean_d(var1_1 + 1, var2_2) && !this.boolean_d(var1_1, var2_2 - 1)) break block34;
                                            if (this.aQ != var2_2 - 1) break block35;
                                            v3 = 17;
                                            break block36;
                                        }
                                        if (this.aP != var1_1 - 1) break block37;
                                        v3 = 16;
                                        break block36;
                                    }
                                    if (this.aP != var1_1 + 1) break block38;
                                    v3 = 15;
                                }
                                var3_3 = v3;
                            }
                            var4_4 = 0;
                            break block31;
                        }
                        var7_7 = this.aS & 7;
                        if (this.aP != var1_1 || this.aR != 6 || var7_7 != 4 && var7_7 != 2 || this.aQ >= var2_2 || i.var_byte_arr_arr_a[var1_1][var2_2 - 1] >= 0 || var2_2 * 24 > this.var_int_as + 320 - 80) break block39;
                        switch (var3_3) {
                            case 0: 
                            case 2: {
                                v4 = 6;
                                ** GOTO lbl76
                            }
                            case 1: 
                            case 3: {
                                v4 = 7;
lbl76:
                                // 2 sources

                                var3_3 = v4;
                                var4_4 = 0;
                            }
                        }
                        break block31;
                    }
                    if (this.aQ != var2_2 || this.aR != 6 || var7_7 != 1 && var7_7 != 3 || var3_3 < 0 || var3_3 > 3 || (this.aP >= var1_1 || i.var_byte_arr_arr_a[var1_1 - 1][var2_2] >= 0 || var1_1 * 24 >= this.var_int_ar + 240) && (this.aP <= var1_1 || i.var_byte_arr_arr_a[var1_1 + 1][var2_2] >= 0 || (var1_1 + 1) * 24 <= this.var_int_ar)) break block40;
                    var3_3 = this.aP < var1_1 ? 4 : 5;
                    var4_4 = 0;
                    break block31;
                }
                ++var4_4;
                switch (var3_3) {
                    case 4: {
                        var8_8 = var1_1 - 1;
                        if (i.var_byte_arr_arr_a[var8_8][var2_2] >= 0 || var4_4 != i.b(i.var_a_arr_a[29], 4, 1)) break;
                        i.var_byte_arr_arr_a[var8_8][var2_2] = 21;
                        i.var_int_arr_arr_b[var8_8][var2_2] = 4;
                        i.var_byte_arr_arr_b[var8_8][var2_2] = 18;
                        v5 = i.var_byte_arr_arr_c[var8_8];
                        v6 = var2_2;
                        ** GOTO lbl113
                    }
                    case 5: {
                        var9_9 = var1_1 + 1;
                        if (i.var_byte_arr_arr_a[var9_9][var2_2] >= 0 || var4_4 != i.b(i.var_a_arr_a[29], 5, 1)) break;
                        i.var_byte_arr_arr_a[var9_9][var2_2] = 21;
                        i.var_int_arr_arr_b[var9_9][var2_2] = 2;
                        i.var_byte_arr_arr_b[var9_9][var2_2] = 18;
                        v5 = i.var_byte_arr_arr_c[var9_9];
                        v6 = var2_2;
                        ** GOTO lbl113
                    }
                    case 6: 
                    case 7: {
                        var10_10 = var2_2 - 1;
                        if (i.var_byte_arr_arr_a[var1_1][var10_10] >= 0 || var4_4 != i.b(i.var_a_arr_a[29], var3_3, 1)) break;
                        i.var_byte_arr_arr_a[var1_1][var10_10] = 21;
                        i.var_int_arr_arr_b[var1_1][var10_10] = 1;
                        i.var_byte_arr_arr_b[var1_1][var10_10] = 18;
                        v5 = i.var_byte_arr_arr_c[var1_1];
                        v6 = var10_10;
lbl113:
                        // 3 sources

                        v5[v6] = 24;
                    }
                }
                if (var4_4 > var5_5) {
                    var4_4 = 0;
                    var8_8 = this.int_a(var1_1, var2_2, this.aP, this.aQ, false);
                    switch (var8_8) {
                        case 4: {
                            if (this.aQ == var2_2 && var3_3 != 4 && var1_1 * 24 < this.var_int_ar + 240) {
                                v7 = 4;
                                break;
                            }
                            v7 = 0;
                            break;
                        }
                        case 2: {
                            if (this.aQ == var2_2 && var3_3 != 5 && (var1_1 + 1) * 24 > this.var_int_ar) {
                                v7 = 5;
                                break;
                            }
                            v7 = 1;
                            break;
                        }
                        case 1: {
                            var3_3 = this.aP == var1_1 && var3_3 != 6 && var3_3 != 7 && var2_2 * 24 <= this.var_int_as + 320 - 80 ? (var3_3 == 2 ? 6 : 7) : (this.aP < var1_1 ? 2 : 3);
                            break block31;
                        }
                        default: {
                            v7 = this.aP < var1_1 ? 0 : 1;
                        }
                    }
                    var3_3 = v7;
                }
            }
            i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
            i.var_int_arr_arr_b[var1_1][var2_2] = var3_3 & 31 | var4_4 << 5;
        }
    }

    private static int a(a a2, int n) {
        int n2 = 0;
        int n3 = a2.var_byte_arr_e[n] & 0xFF;
        for (int j = 0; j < n3; ++j) {
            n2 += a2.var_byte_arr_f[(a2.var_short_arr_b[n] + j) * 5 + 1] & 0xFF;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private void bK() {
        var1_1 = this.bE;
        var2_2 = this.bF;
        i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
        var3_3 = (i.var_int_arr_arr_b[var1_1][var2_2] & 56) >> 3;
        switch (var3_3) {
            case 0: {
                if ((this.aP != var1_1 || (var2_2 + 1) * 24 <= this.var_int_as || this.var_byte_i == 3) && (this.var_byte_i != 3 || this.var_long_m == 0L || (long)i.aN < this.var_long_m + (long)(21 - var1_1))) break;
                var4_4 = var2_2 + 1;
                while (true) {
                    var5_6 = i.var_byte_arr_arr_a[var1_1][var4_4];
                    if (this.aQ == var4_4 || var5_6 >= 80 || var5_6 == 30 || var5_6 == 34 || var5_6 == 35 || var5_6 == 0) break;
                    ++var4_4;
                }
                if (this.aQ != var4_4 && this.var_byte_i != 3) break;
                i.var_int_arr_arr_b[var1_1][var2_2] = i.var_int_arr_arr_b[var1_1][var2_2] & -57 | 8;
                i.var_byte_arr_arr_b[var1_1][var2_2] = 10;
                return;
            }
            case 1: {
                v0 = i.var_byte_arr_arr_b[var1_1];
                v1 = var2_2;
                v0[v1] = (byte)(v0[v1] - 1);
                if (i.var_byte_arr_arr_b[var1_1][var2_2] > 0) break;
                i.var_int_arr_arr_a[var1_1][var2_2] = 34;
                i.var_int_arr_arr_b[var1_1][var2_2] = i.var_int_arr_arr_b[var1_1][var2_2] & -64 | 24 | 3;
                i.var_byte_arr_arr_b[var1_1][var2_2] = 0;
                return;
            }
            case 3: {
                if (i.var_byte_arr_arr_b[var1_1][var2_2] > 0) ** GOTO lbl71
                var4_5 = this.boolean_d(var1_1, var2_2 + 1);
                var5_7 = false;
                if (var4_5 || i.var_byte_arr_arr_a[var1_1][var2_2 + 1] >= 0 || this.var_boolean_j && i.var_int_arr_arr_e[var1_1][var2_2 + 1] != 0) {
                    if (var4_5) {
                        this.void_a(1, 48, 0);
                        var5_7 = true;
                    } else {
                        var5_7 = true;
                        switch (i.var_byte_arr_arr_a[var1_1][var2_2 + 1]) {
                            case 10: {
                                i.var_int_arr_arr_a[var1_1][var2_2 + 1] = 32;
                                this.void_b(var1_1, var2_2 + 1);
                                var5_7 = false;
                                break;
                            }
                            case 19: 
                            case 43: 
                            case 45: 
                            case 46: 
                            case 49: {
                                this.p(var1_1, var2_2 + 1);
                                i.var_byte_arr_arr_a[var1_1][var2_2 + 1] = -1;
                                break;
                            }
                            case 30: {
                                this.C(11);
                                i.var_int_arr_arr_b[var1_1][var2_2 + 1] = 1;
                                break;
                            }
                            case 18: {
                                this.boolean_c();
                                break;
                            }
                            case 21: {
                                var5_7 = false;
                                break;
                            }
                            default: {
                                this.C(14);
                            }
                        }
                    }
                }
                if (var5_7) {
                    i.var_int_arr_arr_b[var1_1][var2_2] = i.var_int_arr_arr_b[var1_1][var2_2] & -64 | 32;
                    i.var_byte_arr_arr_b[var1_1][var2_2] = 0;
                    return;
                }
                i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                i.var_byte_arr_arr_a[var1_1][var2_2 + 1] = 44;
                i.var_int_arr_arr_b[var1_1][var2_2 + 1] = i.var_int_arr_arr_b[var1_1][var2_2];
                v2 = i.var_byte_arr_arr_b[var1_1];
                v3 = var2_2 + 1;
                v4 = 19;
                ** GOTO lbl84
lbl71:
                // 1 sources

                v5 = i.var_byte_arr_arr_b[var1_1];
                v6 = var2_2;
                v5[v6] = (byte)(v5[v6] - 5);
                return;
            }
            case 4: {
                if ((i.aN & 1) != 0) break;
                v7 = i.var_byte_arr_arr_b[var1_1];
                v8 = var2_2;
                v7[v8] = (byte)(v7[v8] + 1);
                if (i.var_byte_arr_arr_b[var1_1][var2_2] != i.var_a_arr_a[27].int_a(4)) break;
                v2 = i.var_byte_arr_arr_a[var1_1];
                v3 = var2_2;
                v4 = -1;
lbl84:
                // 2 sources

                v2[v3] = v4;
                i.q(var1_1, var2_2);
            }
        }
    }

    private void bL() {
        int n;
        int n2;
        int[] nArray;
        int n3 = var_int_arr_arr_a[this.bE][this.bF] >> 8 & 0xFF;
        if ((aN & 1) == 0) {
            ++n3;
        } else if (n3 == 1) {
            this.void_b(this.bE, this.bF);
        }
        if (n3 == var_a_arr_a[16].int_a(0)) {
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = -1;
        } else {
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = n3 << 8 | 0x20;
        }
        nArray[n2] = n;
        i.var_byte_arr_arr_c[this.bE][this.bF] = 24;
    }

    private void bM() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = var_int_arr_arr_a[n][n2] >> 8;
        boolean bl = i.boolean_j(n, n2) || var_byte_arr_arr_a[n][n2] == 47 || var_byte_arr_arr_a[n][n2] == 48;
        int n4 = var_byte_arr_arr_b[n][n2];
        if (!bl && this.boolean_d(n, n2)) {
            bl = true;
            int n5 = n4 = (this.aS & 0x1000) != 0 ? 0 : this.aR;
        }
        if (bl && n4 < 12) {
            this.r(n3);
            return;
        }
        this.s(n3);
    }

    /*
     * Unable to fully structure code
     */
    private void bN() {
        block10: {
            block9: {
                var1_1 = this.bE;
                var2_2 = this.bF;
                var3_3 = i.var_int_arr_arr_b[var1_1][var2_2];
                var4_4 = i.var_a_arr_a[7];
                var5_5 = i.a(var4_4, 0);
                if (++var3_3 >= var5_5) {
                    i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                    i.q(var1_1, var2_2);
                    return;
                }
                if (var3_3 != 1) break block9;
                this.C(7);
                i.q(var1_1, var2_2);
                break block10;
            }
            if (var3_3 != var5_5 >> 1) break block10;
            for (var6_6 = -1; var6_6 < 2; ++var6_6) {
                for (var7_7 = -1; var7_7 < 2; ++var7_7) {
                    var8_8 = var1_1 + var7_7;
                    var9_9 = var2_2 + var6_6;
                    switch (i.var_byte_arr_arr_a[var8_8][var9_9]) {
                        case 10: {
                            if (this.var_byte_x != 3) break;
                        }
                        case 30: 
                        case 37: {
                            v0 = i.var_int_arr_arr_b[var8_8];
                            v1 = var9_9;
                            v2 = 1;
                            ** GOTO lbl38
                        }
                        case 16: 
                        case 19: 
                        case 43: 
                        case 49: {
                            i.var_byte_arr_arr_a[var8_8][var9_9] = -1;
                            this.p(var8_8, var9_9);
                            i.var_byte_arr_arr_c[var8_8][var9_9] = 24;
                            break;
                        }
                        case 8: {
                            i.var_byte_arr_arr_a[var8_8][var9_9] = 54;
                            v0 = i.var_int_arr_arr_b[var8_8];
                            v1 = var9_9;
                            v2 = 0;
lbl38:
                            // 2 sources

                            v0[v1] = v2;
                            i.q(var8_8, var9_9);
                        }
                    }
                    if (!this.boolean_d(var8_8, var9_9)) continue;
                    this.void_a(1, 64, 0);
                }
            }
        }
        i.var_int_arr_arr_b[var1_1][var2_2] = var3_3;
        i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
    }

    private void bO() {
        int n = this.bE;
        int n2 = this.bF;
        if (var_int_arr_arr_b[n][n2] == 0) {
            if (var_byte_arr_arr_a[n][n2 - 1] == 11) {
                i.var_int_arr_arr_b[n][n2] = 1;
                this.bS();
                return;
            }
        } else if (this.boolean_d(n, n2 - 1)) {
            this.void_a(1, 64, 0);
        }
    }

    private void bP() {
        if (this.aR <= 6 && this.boolean_d(this.bE, this.bF)) {
            var_int_W = 0;
            this.var_byte_j = 0;
            cm = var_int_arr_arr_a[this.bE][this.bF] >> 8;
            this.void_j(this.aP + var_byte_arr_g[this.aS & 7], this.aQ);
            if (cm < 0 || cm >= var_byte_arr_m.length) {
                cm = -1;
            } else {
                this.C(1);
                this.cl = 1;
                this.v(cm);
            }
            i.var_int_arr_arr_a[this.bE][this.bF] = -1;
        }
    }

    private void o(int n, int n2) {
        int n3 = this.bE;
        int n4 = this.bF;
        int n5 = n == 23 ? -1 : 1;
        i.var_byte_arr_arr_c[n3][n4] = 24;
        if (this.aQ == n4) {
            for (int j = 0; j <= n2; ++j) {
                int n6 = n3 + j * n5;
                if (this.aP != n6) continue;
                this.void_a(1, 64, 0);
            }
        }
    }

    private void bQ() {
        boolean bl = false;
        int n = -1;
        boolean bl2 = false;
        switch (this.aD) {
            case 26: {
                bl = true;
                this.bm = 25;
                bl2 = true;
                break;
            }
            case 24: {
                bl2 = true;
                bl = true;
                this.bm = 22;
                break;
            }
            case 27: {
                bl2 = true;
                bl = true;
                this.bm = 23;
                break;
            }
            case 40: {
                bl2 = true;
                bl = true;
                this.bm = 24;
                break;
            }
            case 42: {
                bl2 = true;
                bl = true;
                this.var_boolean_n = true;
                this.bm = 11;
                break;
            }
            case 41: {
                if (this.boolean_e()) {
                    this.var_boolean_aj = true;
                    this.void_g();
                }
                this.aZ += this.aC;
                this.var_int_P -= this.aC;
                if (this.var_int_P <= 0 && !this.boolean_e()) {
                    i.var_byte_arr_arr_a[this.var_int_Q][this.var_int_R] = -1;
                    this.var_int_P = 0;
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
                bl2 = true;
                n = 0;
                break;
            }
            case 6: {
                ++this.var_int_ao;
                i.var_byte_arr_arr_e[this.aP][this.aQ] = -1;
                int[] nArray = var_int_arr_arr_d[this.aP];
                int n2 = this.aQ;
                nArray[n2] = nArray[n2] | 0x100;
                n = 0;
                this.void_a(this.var_int_ap, this.var_int_aq, this.aP, this.aQ);
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
                int n3;
                i i2;
                this.void_a(this.var_int_ap, this.var_int_aq, this.aP, this.aQ);
                n = 0;
                bl = true;
                this.void_g();
                this.var_boolean_f = true;
                if (this.aD == 53) {
                    i2 = this;
                    n3 = 0;
                } else if (this.aD == 51) {
                    i2 = this;
                    n3 = 1;
                } else {
                    i2 = this;
                    n3 = 2;
                }
                i2.var_int_s = n3;
                var_byte_arr_i[2] = (byte)(var_byte_arr_i[2] | 1 << this.var_int_s);
                this.G();
            }
        }
        if (bl) {
            this.n(47);
        }
        if (n != -1) {
            this.d(this.aP, this.aQ - 1, n);
        }
        if (bl2) {
            i.var_byte_arr_d[this.var_int_X << 1] = (byte)this.aP;
            i.var_byte_arr_d[(this.var_int_X << 1) + 1] = (byte)this.aQ;
            ++this.var_int_X;
        }
        this.B();
        this.aD = -1;
    }

    /*
     * Unable to fully structure code
     */
    private void x(int var1_1) {
        var2_2 = this.bE;
        var3_3 = this.bF;
        if (this.aR > 0 || !this.boolean_d(var2_2, var3_3)) {
            return;
        }
        var4_4 = i.var_int_arr_arr_a[var2_2][var3_3] & 255;
        if ((var4_4 == 14 || var4_4 == 33) && i.var_int_arr_arr_a[var2_2][var3_3] >> 8 == 255) {
            return;
        }
        this.aD = var1_1;
        switch (var1_1) {
            case 40: {
                this.aA = 19;
                this.aB = 0;
                i.var_byte_arr_arr_a[this.bE][this.bF] = -1;
                this.aD = 40;
                i.var_byte_arr_i[10] = 1;
                break;
            }
            case 42: {
                this.aA = 29;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 41: {
                this.aA = 2;
                this.aB = 0;
                this.aC = i.var_int_arr_arr_b[this.bE][this.bF];
                break;
            }
            case 4: {
                this.aA = 24;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 5: {
                this.aA = 25;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 2: {
                this.aA = 3;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 53: {
                this.aA = 32;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 51: {
                this.aA = 30;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 52: {
                this.aA = 31;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 6: {
                if (this.var_int_ao >= 99) ** GOTO lbl63
                this.aA = 5;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
lbl63:
                // 1 sources

                i.var_byte_arr_arr_a[var2_2][var3_3] = 7;
                i.var_int_arr_arr_b[var2_2][var3_3] = 0;
                this.x(7);
                break;
            }
            case 7: {
                if (this.var_byte_n == i.var_byte_arr_i[8]) {
                    i.var_byte_arr_arr_a[var2_2][var3_3] = 41;
                    i.var_int_arr_arr_b[var2_2][var3_3] = 10;
                    this.aY += 10;
                    this.x(41);
                    break;
                }
                this.aA = 5;
                v0 = this;
                v1 = 1;
lbl77:
                // 9 sources

                v0.aB = v1;
            }
        }
        i.var_byte_arr_arr_a[var2_2][var3_3] = -1;
        this.B();
    }

    private boolean boolean_h(int n, int n2) {
        return var_byte_arr_arr_a[n][n2] == 28 || this.aI >= 24 && (var_byte_arr_arr_a[n][n2 - 1] == 28 && (var_int_arr_arr_b[n][n2 - 1] & 8) == 0 || var_byte_arr_arr_a[n][n2 + 1] == 28 && (var_int_arr_arr_b[n][n2 + 1] & 8) == 0) || this.aK >= 24 && (var_byte_arr_arr_a[n][n2 - 1] == 28 || var_byte_arr_arr_a[n][n2 + 1] == 28);
    }

    private int int_a(int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        block13: {
            int n6;
            block16: {
                int n7;
                block15: {
                    int n8;
                    block14: {
                        n6 = n - n3;
                        n8 = n2 - n4;
                        int n9 = n6 > 0 ? n6 : -n6;
                        int n10 = n8 > 0 ? n8 : -n8;
                        n5 = 0;
                        if (n9 > n10) {
                            int n11;
                            if (n6 > 0) {
                                n11 = 4;
                            } else if (n6 < 0) {
                                n11 = n5 = 2;
                            }
                            if (n5 != 0 && (!i.boolean_g(n - var_byte_arr_g[n5], n2) || this.boolean_h(n - var_byte_arr_g[n5], n2))) {
                                n5 = 0;
                            }
                        }
                        if (n5 != 0) break block13;
                        if (n8 <= 0) break block14;
                        n7 = 1;
                        break block15;
                    }
                    if (n8 >= 0) break block16;
                    n7 = 3;
                }
                n5 = n7;
            }
            int n12 = n2 - var_byte_arr_g[8 + n5];
            if (bl && n5 != 0 && (!i.boolean_g(n, n12) || this.var_boolean_j && var_int_arr_arr_e[n][n12] != 0 || this.boolean_h(n, n12))) {
                int n13;
                n5 = 0;
                if (n6 > 0) {
                    n13 = 4;
                } else if (n6 < 0) {
                    n13 = n5 = 2;
                }
                if (n5 != 0 && var_byte_arr_arr_a[n - var_byte_arr_g[n5]][n2] >= 0) {
                    n5 = 0;
                }
            }
        }
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    private void e(byte var1_1) {
        block25: {
            block17: {
                block19: {
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block20: {
                                        block18: {
                                            var2_2 = this.bE;
                                            var3_3 = this.bF;
                                            var4_4 = i.var_int_arr_arr_b[var2_2][var3_3];
                                            var5_5 = i.var_byte_arr_arr_b[var2_2][var3_3];
                                            var6_6 = 0;
                                            var7_7 = 0;
                                            var8_8 = (i.var_int_arr_arr_a[var2_2][var3_3] & 255) == 35;
                                            v0 = var9_9 = var1_1 == 43 && (var4_4 & 3840) != 0;
                                            if (!var8_8 && this.boolean_i(var2_2, var3_3)) {
                                                i.var_byte_arr_arr_a[var2_2][var3_3] = -1;
                                                this.p(var2_2, var3_3);
                                                return;
                                            }
                                            var10_10 = var4_4 & 7;
                                            if (var5_5 > 0) break block17;
                                            if (!var8_8 || var5_5 > 6) break block18;
                                            if (var5_5 < 0) {
                                                i.var_byte_arr_arr_b[var2_2][var3_3] = 0;
                                            }
                                            break block19;
                                        }
                                        i.q(var2_2, var3_3);
                                        if (!var9_9) break block20;
                                        var5_5 = 18;
                                        var11_11 = this.int_a(var2_2, var3_3, this.aP, this.aQ, true);
                                        var4_4 = var4_4 & -8 | var11_11;
                                        var10_10 = var11_11;
                                        var6_6 = -i.var_byte_arr_g[var11_11];
                                        var7_7 = -i.var_byte_arr_g[var11_11 + 8];
                                        if (var11_11 == 0) {
                                            var5_5 = 0;
                                            var7_7 = 0;
                                            var6_6 = 0;
                                        }
                                        var4_4 -= 256;
                                        break block19;
                                    }
                                    if ((var4_4 & 0xFE0000) == 0 || (var4_4 & 248) != 0) break block21;
                                    var11_12 = (var4_4 & 0xFE0000) >> 17;
                                    var12_14 = (var4_4 & 0x7F000000) >> 24;
                                    if (var2_2 != var11_12 || var3_3 != var12_14) break block22;
                                    var10_10 = ((var4_4 &= -16646145) & -2147483648) == 0 ? 2 : 1;
                                    var4_4 = var4_4 & -8 | var10_10;
                                    break block19;
                                }
                                var5_5 = 21;
                                var13_15 = this.int_a(var2_2, var3_3, var11_12, var12_14, true);
                                var4_4 = var4_4 & -8 | var13_15;
                                var6_6 = -i.var_byte_arr_g[var13_15];
                                var7_7 = -i.var_byte_arr_g[var13_15 + 8];
                                var10_10 = var13_15;
                                if (var13_15 != 0) break block19;
                                var5_5 = 0;
                                break block23;
                            }
                            if (var10_10 != 0) break block24;
                            var5_5 = 21;
                            var11_13 = (var4_4 & 28672) >> 12;
                            var4_4 = var4_4 & -8 | var11_13;
                            var10_10 = var11_13;
                            var6_6 = -i.var_byte_arr_g[var11_13];
                            var7_7 = -i.var_byte_arr_g[var11_13 + 8];
                            if (!i.boolean_g(var2_2 + var6_6, var3_3 + var7_7)) {
                                var7_7 = 0;
                                var6_6 = 0;
                                var5_5 = 0;
                            }
                            break block19;
                        }
                        var5_5 = 21;
                        var6_6 = -i.var_byte_arr_g[var10_10];
                        var7_7 = -i.var_byte_arr_g[var10_10 + 8];
                        if (i.boolean_g(var2_2 + var6_6, var3_3 + var7_7)) break block19;
                        switch (var10_10) {
                            case 4: {
                                v1 = var4_4 & -28673;
                                v2 = 8192;
                                ** GOTO lbl86
                            }
                            case 2: {
                                v1 = var4_4 & -28673;
                                v2 = 16384;
                                ** GOTO lbl86
                            }
                            case 1: {
                                v1 = var4_4 & -28673;
                                v2 = 12288;
                                ** GOTO lbl86
                            }
                            case 3: {
                                v1 = var4_4 & -28673;
                                v2 = 4096;
lbl86:
                                // 4 sources

                                var4_4 = v1 | v2;
                            }
                        }
                        var4_4 = var4_4 & -8 | 0;
                        var10_10 = 0;
                    }
                    var7_7 = 0;
                    var6_6 = 0;
                }
                if ((var4_4 & 248) == 0) {
                    i.var_byte_arr_arr_a[var2_2][var3_3] = -1;
                    i.var_byte_arr_arr_a[var2_2 + var6_6][var3_3 + var7_7] = var1_1;
                    i.var_byte_arr_arr_c[var2_2 + var6_6][var3_3 + var7_7] = 48;
                    i.var_byte_arr_arr_b[var2_2 + var6_6][var3_3 + var7_7] = var5_5;
                    i.var_int_arr_arr_b[var2_2 + var6_6][var3_3 + var7_7] = var4_4;
                } else {
                    if ((i.aN & 3) == 0) {
                        var4_4 = var4_4 & -249 | (var4_4 & 248) - 8;
                        if (var1_1 == 43 && (var4_4 & 248) == 0) {
                            var4_4 = var4_4 & -3841 | 3072;
                        }
                    }
                    v3 = i.var_byte_arr_arr_b[var2_2];
                    v4 = var3_3;
                    v5 = 0;
                }
                break block25;
            }
            if (var5_5 < 0) {
                i.var_byte_arr_arr_b[var2_2][var3_3] = 0;
            }
            var5_5 = (byte)(var5_5 - 3);
            v3 = i.var_byte_arr_arr_b[var2_2];
            v4 = var3_3;
            v5 = v3[v4] = var5_5;
        }
        if ((var4_4 & 248) == 0 && (i.var_g_arr_a[0].f < 13 || i.var_g_arr_a[0].f > 16) && i.a(var2_2, var3_3, var10_10, (int)i.var_byte_arr_arr_b[var2_2][var3_3], this.aP, this.aQ, (int)((this.aS & 4096) == 0 ? this.var_byte_k : 0), this.aR)) {
            this.void_a(1, 48, var10_10);
            if (var9_9) {
                var4_4 &= -3841;
            }
        }
        i.var_int_arr_arr_b[var2_2][var3_3] = var4_4;
    }

    private void bR() {
        int n;
        int n2;
        int[] nArray;
        int n3 = (var_int_arr_arr_a[this.bE][this.bF] & 0xF0000000) >> 28;
        if (n3 == 0) {
            this.C(10);
        }
        if ((aN & 1) == 0) {
            ++n3;
        }
        if (n3 >= var_a_arr_a[13].int_a(0)) {
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = var_int_arr_arr_a[this.bE][this.bF] & 0xFFFFFFF;
        } else {
            nArray = var_int_arr_arr_a[this.bE];
            n2 = this.bF;
            n = var_int_arr_arr_a[this.bE][this.bF] & 0xFFFFFFF | n3 << 28;
        }
        nArray[n2] = n;
        i.q(this.bE, this.bF);
    }

    private void bS() {
        if ((this.var_byte_i == 3 || this.var_byte_i == 4 || this.var_byte_i == 5) && this.var_int_af > 0) {
            return;
        }
        if (cm >= 0) {
            int n = cm;
            var_byte_arr_m[n] = (byte)(var_byte_arr_m[n] - 1);
            if (var_byte_arr_m[cm] == 0) {
                this.w(cm);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void y(int var1_1) {
        block6: {
            if ((i.var_int_arr_arr_a[this.bE][this.bF] & 255) == 14 && i.var_int_arr_arr_a[this.bE][this.bF] >> 8 == 255) {
                return;
            }
            if (!this.boolean_d(this.bE, this.bF) || i.var_g_arr_a[0].f != 40 && i.var_g_arr_a[0].f != 48) break block6;
            i.var_byte_arr_arr_a[this.bE][this.bF] = -1;
            switch (var1_1) {
                case 24: {
                    i.var_byte_arr_i[9] = 1;
                    this.aA = 7;
                    this.aB = 0;
                    v0 = this;
                    v1 = 24;
                    ** GOTO lbl26
                }
                case 27: {
                    i.var_byte_arr_i[9] = 2;
                    this.aA = 7;
                    this.aB = 1;
                    v0 = this;
                    v1 = 27;
                    ** GOTO lbl26
                }
                case 26: {
                    i.var_byte_arr_i[9] = 8;
                    this.aA = 7;
                    this.aB = 2;
                    v0 = this;
                    v1 = 26;
lbl26:
                    // 3 sources

                    v0.aD = v1;
                }
            }
            this.void_a(this.var_int_ap, this.var_int_aq, this.bE, this.bF);
        }
    }

    private void bT() {
        int n = var_int_arr_arr_b[this.bE][this.bF];
        if (n > 0) {
            int n2 = this.bE;
            int n3 = this.bF;
            if (n == 4) {
                for (int j = 1; j < 5; ++j) {
                    byte by = var_byte_arr_g[j];
                    byte by2 = var_byte_arr_g[j + 8];
                    if (var_byte_arr_arr_a[n2 + by][n3 + by2] != 30) continue;
                    int[] nArray = var_int_arr_arr_b[n2 + by];
                    int n4 = n3 + by2;
                    nArray[n4] = nArray[n4] + 1;
                    i.var_byte_arr_arr_c[n2 + by][n3 + by2] = 24;
                }
            } else if (n >= 16) {
                i.var_byte_arr_arr_a[n2][n3] = -1;
                i.q(n2, n3);
            }
            i.var_int_arr_arr_b[n2][n3] = n + 1;
            i.var_byte_arr_arr_c[n2][n3] = 24;
        }
    }

    private void bU() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = var_int_arr_arr_b[n][n2];
        if (n3 > 0) {
            if (n3 >= 8) {
                this.t(n, n2);
                i.var_byte_arr_arr_a[n][n2] = -1;
                i.q(n, n2);
            }
            i.var_int_arr_arr_b[n][n2] = n3 + 1;
            i.var_byte_arr_arr_c[n][n2] = 24;
        }
    }

    private void bV() {
        int n;
        int n2;
        block22: {
            block26: {
                int n3;
                int n4;
                block29: {
                    int n5;
                    int n6;
                    int[] nArray;
                    int n7;
                    int[] nArray2;
                    boolean bl;
                    int n8;
                    block24: {
                        int n9;
                        block28: {
                            int n10;
                            int n11;
                            block27: {
                                int n12;
                                int n13;
                                int n14;
                                block25: {
                                    block23: {
                                        block21: {
                                            n2 = this.bE;
                                            n = this.bF;
                                            int n15 = (var_int_arr_arr_b[n2][n] & 0xF00) >> 8;
                                            if (n15 == 0) break block21;
                                            if (n15 >= 4) {
                                                i.var_byte_arr_arr_a[n2][n] = -1;
                                            } else if ((aN >> 1 & 1) == 0) {
                                                i.var_int_arr_arr_b[n2][n] = var_int_arr_arr_b[n2][n] + 256;
                                            }
                                            break block22;
                                        }
                                        if (var_int_arr_arr_e == null || var_int_arr_arr_e[n2][n] == 0) break block23;
                                        i.var_int_arr_arr_b[n2][n] = var_int_arr_arr_b[n2][n] & 0xFFFFF0FF | 0x100;
                                        break block22;
                                    }
                                    if (var_byte_arr_arr_b[n2][n] > 4) break block22;
                                    n8 = var_int_arr_arr_b[n2][n];
                                    i.var_byte_arr_arr_c[n2][n] = 24;
                                    bl = (n8 & 0x10) != 0;
                                    int n16 = n8 & 7;
                                    if (n16 == 0) break block24;
                                    n14 = 0;
                                    n13 = 0;
                                    n11 = 0;
                                    n10 = 0;
                                    n12 = 0;
                                    n9 = 0;
                                    switch (n16) {
                                        case 3: {
                                            n14 = bl ? 1 : -1;
                                            n12 = bl ? 2 : 4;
                                            n9 = bl ? 4 : 2;
                                            n10 = 1;
                                            break;
                                        }
                                        case 2: {
                                            n13 = bl ? -1 : 1;
                                            n12 = bl ? 1 : 3;
                                            n9 = bl ? 3 : 1;
                                            int n17 = 1;
                                            break;
                                        }
                                        case 1: {
                                            n14 = bl ? -1 : 1;
                                            n12 = bl ? 4 : 2;
                                            n9 = bl ? 2 : 4;
                                            n10 = -1;
                                            break;
                                        }
                                        case 4: {
                                            n13 = bl ? 1 : -1;
                                            n12 = bl ? 3 : 1;
                                            n9 = bl ? 1 : 3;
                                            int n17 = n11 = -1;
                                        }
                                    }
                                    if (!i.boolean_g(n2 + n11, n + n10) || !i.boolean_g(n2 + n14, n + n13) || !i.boolean_g(n2 + n14 - n11, n + n13 - n10)) break block25;
                                    if (var_byte_arr_arr_b[n2][n] <= 0) {
                                        i.var_int_arr_arr_b[n2 + n11][n + n10] = n8;
                                        i.var_byte_arr_arr_a[n2 + n11][n + n10] = 11;
                                        i.var_byte_arr_arr_a[n2][n] = -1;
                                        i.var_byte_arr_arr_b[n2 + n11][n + n10] = 18;
                                    }
                                    break block26;
                                }
                                if (!i.boolean_g(n2 + n14, n + n13)) break block27;
                                i.var_int_arr_arr_b[n2 + n14][n + n13] = n8 & 0xFFFFFFF8 | n12;
                                i.var_byte_arr_arr_a[n2 + n14][n + n13] = 11;
                                i.var_byte_arr_arr_a[n2][n] = -1;
                                i.var_byte_arr_arr_b[n2 + n14][n + n13] = 18;
                                break block26;
                            }
                            if (!i.boolean_g(n2 + n11, n + n10)) break block28;
                            if (var_byte_arr_arr_b[n2][n] <= 0) {
                                i.var_int_arr_arr_b[n2 + n11][n + n10] = n8;
                                i.var_byte_arr_arr_a[n2 + n11][n + n10] = 11;
                                i.var_byte_arr_arr_a[n2][n] = -1;
                                i.var_byte_arr_arr_b[n2 + n11][n + n10] = 18;
                            }
                            break block26;
                        }
                        nArray2 = var_int_arr_arr_b[n2];
                        n7 = n;
                        n4 = n8 & 0xFFFFFFF8;
                        n3 = n9;
                        break block29;
                    }
                    if (var_byte_arr_arr_a[n2 - 1][n] >= 0) {
                        nArray = var_int_arr_arr_b[n2];
                        n6 = n;
                        n5 = n8 & 0xFFFFFFF8 | (bl ? 1 : 3);
                    } else if (var_byte_arr_arr_a[n2][n + 1] >= 0) {
                        nArray = var_int_arr_arr_b[n2];
                        n6 = n;
                        n5 = nArray[n6] = n8 & 0xFFFFFFF8 | (bl ? 2 : 4);
                    }
                    if (var_byte_arr_arr_a[n2 + 1][n] >= 0) {
                        i.var_int_arr_arr_b[n2][n] = n8 & 0xFFFFFFF8 | (bl ? 3 : 1);
                    }
                    if (var_byte_arr_arr_a[n2][n + 1] < 0) break block26;
                    nArray2 = var_int_arr_arr_b[n2];
                    n7 = n;
                    n4 = n8 & 0xFFFFFFF8;
                    n3 = bl ? 4 : 2;
                }
                nArray2[n7] = n4 | n3;
            }
            i.q(n2, n);
        }
        if (this.boolean_d(n2, n)) {
            this.void_a(1, 64, 0);
        }
        if (var_byte_arr_arr_b[n2][n] > 0) {
            byte[] byArray = var_byte_arr_arr_b[n2];
            int n18 = n;
            byArray[n18] = (byte)(byArray[n18] - 5);
        }
    }

    private void bW() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = var_int_arr_arr_b[n][n2];
        if (n3 > 0) {
            i.var_byte_arr_arr_a[n][n2] = -1;
            i.var_int_arr_arr_a[n][n2] = 32;
            i.q(n, n2);
            this.t(n, n2);
            i.var_byte_arr_arr_c[n][n2] = 24;
        }
    }

    private void bX() {
        int n;
        int n2;
        int n3;
        block14: {
            int n4;
            byte[] byArray;
            block10: {
                int n5;
                boolean bl;
                int n6;
                int n7;
                block13: {
                    block11: {
                        block12: {
                            n3 = this.bE;
                            n2 = this.bF;
                            i.var_byte_arr_arr_c[n3][n2] = 24;
                            if (var_byte_arr_arr_b[n3][n2] != 0) break block10;
                            int n8 = var_int_arr_arr_b[n3][n2];
                            n7 = (n8 & 1) == 0 ? -1 : 1;
                            n6 = var_byte_arr_arr_a[n3 + n7][n2];
                            int n9 = var_int_arr_arr_a[n3 + n7][n2] & 0xFF;
                            bl = false;
                            int n10 = n8 >> 1;
                            if (n10 <= 0) break block11;
                            if (n6 >= 0 || n9 == 14 || n9 == 33) break block12;
                            i.var_int_arr_arr_b[n3 + n7][n2] = n10 - 1 << 1 | n8 & 1;
                            i.var_byte_arr_arr_c[n3 + n7][n2] = 30;
                            i.var_byte_arr_arr_b[n3 + n7][n2] = 18;
                            n6 = 32;
                            break block13;
                        }
                        if (n6 == 32) break block13;
                        n5 = var_int_arr_arr_b[n3 + n7][n2];
                        int n11 = 0;
                        if (n6 == 48 && (n5 & 8) != 0) break block13;
                        switch (n6) {
                            case 1: 
                            case 2: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: {
                                n11 = -n7;
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
                                this.var_byte_o = 0;
                                this.bi = this.aP - (n3 + n7) + n11;
                                this.bg = n3 + n7;
                                this.bh = n2;
                                if (this.bf == -1) {
                                    switch (n6) {
                                        case 0: 
                                        case 8: 
                                        case 9: 
                                        case 47: {
                                            n5 &= 0xFFFF8FFF;
                                            n5 &= 0xFFFFFDFF;
                                        }
                                    }
                                    this.bf = n5;
                                }
                                this.be = this.bi < 0 ? n5 & 0xFFFFFFF8 | 4 : n5 & 0xFFFFFFF8 | 2;
                                break block13;
                            }
                            default: {
                                if (n6 == -1) break block13;
                            }
                        }
                    }
                    bl = true;
                }
                if (bl) {
                    for (n5 = 1; n5 <= 3; ++n5) {
                        if (var_byte_arr_arr_a[this.aP + n7 * n5][this.aQ] != 32) continue;
                        i.var_byte_arr_arr_a[this.aP + n7 * n5][this.aQ] = -1;
                    }
                }
                byArray = var_byte_arr_arr_a[n3 + n7];
                n4 = n2;
                n = n6;
                break block14;
            }
            byte[] byArray2 = var_byte_arr_arr_b[n3];
            int n12 = n2;
            n4 = n12;
            byArray = byArray2;
            n = byArray2[n12] - 6;
        }
        byArray[n4] = n;
        i.q(n3, n2);
    }

    private void bY() {
        byte by;
        int n;
        byte[] byArray;
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = var_int_arr_arr_b[n2][n3] & 7;
        if ((var_int_arr_arr_b[n2][n3] & 8) != 0) {
            int n5;
            switch (n4) {
                case 4: {
                    int n6 = 12;
                    break;
                }
                case 2: {
                    int n6 = 13;
                    break;
                }
                default: {
                    int n6 = n5 = 14;
                }
            }
            if (var_byte_arr_arr_b[n2][n3] >= i.a(var_a_arr_a[29], n5) || (var_int_arr_arr_a[this.bE][this.bF] & 0xFF) == 35) {
                i.var_byte_arr_arr_a[n2][n3] = -1;
                i.q(n2, n3);
            } else {
                byte[] byArray2 = var_byte_arr_arr_b[n2];
                int n7 = n3;
                byArray2[n7] = (byte)(byArray2[n7] + 1);
            }
            i.var_byte_arr_arr_c[n2][n3] = 24;
            return;
        }
        if (this.boolean_d(n2, n3) || this.boolean_d(n2 + var_byte_arr_g[n4], n3 + var_byte_arr_g[8 + n4]) && var_byte_arr_arr_b[n2][n3] <= this.aR) {
            this.void_a(1, 48, 0);
        }
        if (var_byte_arr_arr_b[n2][n3] <= 0) {
            int n8;
            int n9;
            byte[] byArray3;
            int n10 = n2 - var_byte_arr_g[n4];
            int n11 = n3 - var_byte_arr_g[n4 + 8];
            int n12 = 24;
            if (n4 == 4) {
                n12 = 12;
            }
            if (var_byte_arr_arr_a[n10][n11] < 0) {
                i.var_byte_arr_arr_a[n10][n11] = 21;
                i.var_int_arr_arr_b[n10][n11] = var_int_arr_arr_b[n2][n3];
                i.var_byte_arr_arr_b[n10][n11] = n12;
                byArray3 = var_byte_arr_arr_a[n2];
                n9 = n3;
                n8 = -1;
            } else if (var_byte_arr_arr_a[n10][n11] == 21) {
                int n13 = var_int_arr_arr_b[n10][n11] & 7;
                int n14 = n10 - var_byte_arr_g[n13];
                int n15 = n11 - var_byte_arr_g[n13 + 8];
                i.var_byte_arr_arr_a[n2][n3] = -1;
                i.q(n2, n3);
                int n16 = var_int_arr_arr_b[n2][n3];
                if (var_byte_arr_arr_a[n14][n15] < 0) {
                    i.var_byte_arr_arr_a[n14][n15] = 21;
                    i.var_int_arr_arr_b[n14][n15] = var_int_arr_arr_b[n10][n11];
                    i.var_byte_arr_arr_b[n14][n15] = 18;
                }
                i.var_byte_arr_arr_a[n10][n11] = 21;
                i.var_int_arr_arr_b[n10][n11] = n16;
                byArray3 = var_byte_arr_arr_b[n10];
                n9 = n11;
                n8 = 18;
            } else {
                switch (var_byte_arr_arr_a[n10][n11]) {
                    case 19: 
                    case 43: 
                    case 45: 
                    case 46: {
                        i.var_byte_arr_arr_a[n10][n11] = -1;
                        this.p(n10, n11);
                        break;
                    }
                    case 10: 
                    case 30: {
                        if (var_int_arr_arr_b[n10][n11] >= 1) break;
                        i.var_int_arr_arr_b[n10][n11] = 1;
                    }
                }
                int[] nArray = var_int_arr_arr_b[n2];
                int n17 = n3;
                nArray[n17] = nArray[n17] | 8;
                byArray3 = var_byte_arr_arr_b[n2];
                n9 = n3;
                n8 = 0;
            }
            byArray3[n9] = n8;
            byArray = var_byte_arr_arr_c[n10];
            n = n11;
            by = (byte)48;
        } else {
            byte[] byArray4 = var_byte_arr_arr_b[n2];
            int n18 = n3;
            n = n18;
            byArray = byArray4;
            by = (byte)(byArray4[n18] - 12);
        }
        byArray[n] = by;
    }

    private void p(int n, int n2) {
        i.var_int_arr_arr_a[n][n2] = var_int_arr_arr_a[n][n2] & 0xFFFFFFF | 0x10000000;
        this.bS();
    }

    private void bZ() {
        int n;
        int n2;
        int n3;
        block8: {
            byte by;
            byte by2;
            int n4;
            byte[] byArray;
            block10: {
                int n5;
                int n6;
                int n7;
                block12: {
                    block15: {
                        block16: {
                            block13: {
                                block14: {
                                    block11: {
                                        block9: {
                                            int n8;
                                            block7: {
                                                n3 = this.bE;
                                                n2 = this.bF;
                                                n7 = var_int_arr_arr_b[n3][n2];
                                                n8 = (n7 & 0xFF00) >> 8;
                                                int n9 = n = (n7 & 8) != 0 ? 4 : 2;
                                                if (n8 < 20) break block7;
                                                if (i.boolean_g(n3, n2 + 1) || n == 4 && (var_byte_arr_arr_a[n3 - 1][n2] < 0 || var_byte_arr_arr_a[n3 - 1][n2] == 16 || var_byte_arr_arr_a[n3 - 1][n2] == 19 || var_byte_arr_arr_a[n3 - 1][n2] == 43) || n == 2 && (var_byte_arr_arr_a[n3 + 1][n2] < 0 || var_byte_arr_arr_a[n3 + 1][n2] == 16 || var_byte_arr_arr_a[n3 + 1][n2] == 19 || var_byte_arr_arr_a[n3 + 1][n2] == 43)) {
                                                    i.var_int_arr_arr_b[n3][n2] = n7 & 0xFFFF00FF | 0x1300;
                                                }
                                                break block8;
                                            }
                                            if (n8 <= 0) break block9;
                                            i.var_int_arr_arr_b[n3][n2] = n7 & 0xFFFF00FF | n8 - 1 << 8;
                                            byArray = var_byte_arr_arr_c[n3];
                                            n4 = n2;
                                            by2 = (byte)24;
                                            break block8;
                                        }
                                        by = var_byte_arr_arr_b[n3][n2];
                                        if (by > 0) break block10;
                                        n6 = n3;
                                        n5 = n2;
                                        if (!i.boolean_g(n3, n2 + 1)) break block11;
                                        n5 = n2 + 1;
                                        n = 3;
                                        break block12;
                                    }
                                    if (n != 4) break block13;
                                    if (!i.boolean_g(n3 - 1, n2)) break block14;
                                    n6 = n3 - 1;
                                    break block12;
                                }
                                n = 0;
                                if (var_byte_arr_arr_a[n3 - 1][n2] == 16 || var_byte_arr_arr_a[n3 - 1][n2] == 19 || var_byte_arr_arr_a[n3 - 1][n2] == 43) break block12;
                                break block15;
                            }
                            if (!i.boolean_g(n3 + 1, n2)) break block16;
                            n6 = n3 + 1;
                            break block12;
                        }
                        n = 0;
                        if (var_byte_arr_arr_a[n3 + 1][n2] == 16 || var_byte_arr_arr_a[n3 + 1][n2] == 19 || var_byte_arr_arr_a[n3 + 1][n2] == 43) break block12;
                    }
                    n7 = n7 & 0xFFFF00FF | 0x1400;
                }
                if (n6 != n3 || n5 != n2) {
                    i.var_byte_arr_arr_a[n6][n5] = 14;
                    i.q(n6, n5);
                    i.var_byte_arr_arr_a[n3][n2] = -1;
                    i.var_byte_arr_arr_b[n6][n5] = 18;
                }
                i.var_int_arr_arr_b[n6][n5] = n7 & 0xFFFFFFF8 | n;
                break block8;
            }
            byArray = var_byte_arr_arr_b[n3];
            n4 = n2;
            by2 = byArray[n4] = (byte)(by - 6);
        }
        if (this.boolean_d(n3, n2)) {
            this.void_a(1, 48, n);
        }
    }

    private void ca() {
        boolean bl;
        int n;
        int n2;
        int n3 = this.bE;
        int n4 = this.bF;
        if (var_byte_arr_arr_a[n3][n4 + 1] != 16) {
            n2 = 0;
            n = -1;
        } else {
            n2 = 1;
            n = 0;
        }
        int n5 = n;
        int n6 = var_byte_arr_arr_b[n3][n4 + n2];
        int n7 = var_int_arr_arr_b[n3][n4 + n2];
        int n8 = (n7 & 7) == 4 ? 4 : 2;
        boolean bl2 = bl = this.boolean_d(n3 - var_byte_arr_g[n8], n4 + n2) || this.boolean_d(n3 - var_byte_arr_g[n8], n4 + n5);
        if (n6 <= 0 && bl && this.aR <= 12) {
            n6 = 36;
        } else if (n6 > 0) {
            if (n2 == 0) {
                n6 = (byte)(n6 - 1);
            }
            if ((n6 == 11 || n2 == 0 && n6 < 11) && bl) {
                this.void_a(1, 48, n7 & 7);
            }
            i.var_byte_arr_arr_c[n3][n4] = 24;
        }
        if (this.boolean_i(n3, n4)) {
            this.C(14);
            i.var_byte_arr_arr_a[n3][n4 + n5] = -1;
            this.p(n3, n4 + n5);
            i.var_byte_arr_arr_a[n3][n4 + n2] = -1;
            this.p(n3, n4 + n2);
            return;
        }
        i.var_int_arr_arr_b[n3][n4 + n5] = n7;
        i.var_int_arr_arr_b[n3][n4 + n2] = n7;
        if (n2 == 0) {
            i.var_byte_arr_arr_b[n3][n4 + n5] = n6;
            i.var_byte_arr_arr_b[n3][n4 + n2] = n6;
        }
    }

    private void cb() {
        int n;
        int n2;
        int n3 = (n2 & 8) == 0 ? this.aJ : this.aL;
        int n4 = this.bF + (n3 - 1) * (n = ((n2 = var_int_arr_arr_b[this.bE][this.bF]) & 7) == 3 ? 1 : -1);
        if (this.boolean_d(this.bE, n4)) {
            this.void_a(2, 48, (int)var_byte_arr_h[this.aS & 7]);
        }
        switch (var_byte_arr_arr_a[this.bE][n4]) {
            case -1: 
            case 28: 
            case 32: {
                break;
            }
            default: {
                this.p(this.bE, n4);
                i.var_byte_arr_arr_a[this.bE][n4] = -1;
                i.q(this.bE, n4);
                this.void_b(this.bE, n4);
            }
        }
        i.var_byte_arr_arr_c[this.bE][this.bF] = 24;
    }

    private void cc() {
        int n;
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = var_int_arr_arr_a[n2][n3] >> 8;
        int n5 = var_int_arr_arr_a[n2][n3] & 0xFF;
        if ((n4 & 0x100) == 0 && (n5 == 9 && this.aU > 0 || n5 == 8 && this.aV > 0) && this.aQ == n3 && (this.aP == n2 - 1 || this.aP == n2 + 1) && (n = i.var_g_arr_a[0].f) != 18 && n != 17 && this.aR <= 6) {
            int n6;
            i i2;
            int n7;
            i i3;
            this.var_byte_j = 0;
            this.var_byte_k = 0;
            if (this.aP == n2 - 1) {
                this.aS = this.aS & 0xFFFFFFF8 | 2;
                i3 = this;
                n7 = 18;
            } else {
                this.aS = this.aS & 0xFFFFFFF8 | 4;
                i3 = this;
                n7 = 17;
            }
            i3.n(n7);
            if (n5 == 9) {
                i2 = this;
                n6 = 24;
            } else {
                i2 = this;
                n6 = 25;
            }
            i2.aA = n6;
            this.aB = 0;
        }
    }

    private void cd() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = var_int_arr_arr_a[n][n2] >> 8;
        int n4 = (n3 & 0xF0) >> 4;
        if (n4 != 0) {
            if (aN % 3 == 0 && n4 < 3) {
                n3 = n3 & 0xFFFFFF0F | n4 + 1 << 4;
                if (n4 == 2) {
                    int n5 = var_int_arr_arr_a[n][n2 - 1] & 0xFF;
                    if (n5 == 9 || n5 == 8) {
                        int n6 = var_int_arr_arr_a[n][n2 - 1] >> 8;
                        i.var_int_arr_arr_a[n][n2 - 1] = (n6 &= 0xFFFFFDFF) << 8 | n5;
                    }
                    this.a(n, n2 - 1, 1, 0, 0);
                    this.a(n, n2 - 1, -1, 0, 0);
                }
                i.var_byte_arr_arr_c[n][n2] = 24;
            }
            i.var_int_arr_arr_a[n][n2] = n3 << 8 | 7;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void ce() {
        block11: {
            var1_1 = this.bE;
            var2_2 = this.bF;
            var3_3 = i.var_int_arr_arr_a[var1_1][var2_2] >> 8;
            if (var3_3 >= 6) break block11;
            switch (var3_3) {
                case -1: {
                    if (Math.abs(this.aP - var1_1) >= 4 || Math.abs(this.aQ - var2_2) >= 4) break;
                    var3_3 = 3;
                    break;
                }
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    switch (this.var_byte_k) {
                        case 1: {
                            if (!this.boolean_d(var1_1, var2_2 - 1)) break;
                            ** GOTO lbl25
                        }
                        case 2: {
                            if (!this.boolean_d(var1_1 + 1, var2_2)) break;
                            ** GOTO lbl25
                        }
                        case 3: {
                            if (!this.boolean_d(var1_1, var2_2 + 1)) break;
                            ** GOTO lbl25
                        }
                        case 4: {
                            if (!this.boolean_d(var1_1 - 1, var2_2)) break;
lbl25:
                            // 4 sources

                            var3_3 = 3;
                        }
                    }
                    break;
                }
                default: {
                    if ((i.aN & 1) != 0) break;
                    ++var3_3;
                }
            }
            i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
            i.var_int_arr_arr_a[var1_1][var2_2] = var3_3 << 8 | 3;
            return;
        }
        i.var_byte_arr_arr_c[var1_1][var2_2] = 0;
    }

    private void z(int n) {
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = var_int_arr_arr_a[n2][n3] >> 8;
        i.var_int_arr_arr_a[n2][n3] = n4 << 8 | n;
        if (var_byte_arr_arr_b[n2][n3] <= 0) {
            if (n4 == 0) {
                if (this.boolean_d(n2, n3) && this.aR <= 0) {
                    int n5;
                    i i2;
                    this.aS &= 0xFFFFF7FF;
                    i.var_int_arr_arr_a[n2][n3] = 0x100 | n;
                    if (Math.abs(this.var_long_k - System.currentTimeMillis()) >= 5000L) {
                        i2 = this;
                        n5 = 40;
                    } else {
                        i2 = this;
                        n5 = 48;
                    }
                    i2.n(n5);
                    this.C(3);
                    return;
                }
            } else if ((aN >> 1 & 1) == 0 && var_a_arr_a[n == 14 ? 8 : 22] != null && n4 < var_a_arr_a[n == 14 ? 8 : 22].int_a(0) - 1) {
                i.var_int_arr_arr_a[n2][n3] = n4 + 1 << 8 | n;
                i.var_byte_arr_arr_c[n2][n3] = 24;
            }
        }
    }

    private boolean boolean_i(int n, int n2) {
        int n3 = n2 - 1;
        int n4 = n - 1;
        int n5 = n + 1;
        return var_byte_arr_arr_b[n][n3] <= 6 && (i.boolean_j(n, n3) && ((var_int_arr_arr_b[n][n3] & 7) == 3 || var_byte_arr_arr_a[n][n2] != 16 && var_byte_arr_arr_a[n][n3] != 1) || var_byte_arr_arr_a[n][n3] == 46 || var_byte_arr_arr_a[n][n3] == 14 || var_byte_arr_arr_a[n][n3] == 48) || var_byte_arr_arr_b[n5][n2] <= 0 && var_byte_arr_arr_a[n5][n2] == 14 && (var_int_arr_arr_b[n5][n2] & 8) != 0 && (var_int_arr_arr_b[n5][n2] & 7) != 3 || var_byte_arr_arr_b[n4][n2] <= 0 && var_byte_arr_arr_a[n4][n2] == 14 && (var_int_arr_arr_b[n4][n2] & 8) == 0 && (var_int_arr_arr_b[n4][n2] & 7) != 3;
    }

    private static boolean boolean_j(int n, int n2) {
        if (var_byte_arr_arr_a[n][n2] >= 0) {
            switch (var_byte_arr_arr_a[n][n2]) {
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

    private static void q(int n, int n2) {
        int n3 = n - 1;
        int n4 = n + 1;
        int n5 = n2 - 1;
        int n6 = n2 + 1;
        i.var_byte_arr_arr_c[n3][n5] = 48;
        i.var_byte_arr_arr_c[n][n5] = 48;
        i.var_byte_arr_arr_c[n4][n5] = 48;
        i.var_byte_arr_arr_c[n3][n2] = 48;
        i.var_byte_arr_arr_c[n][n2] = 48;
        i.var_byte_arr_arr_c[n4][n2] = 48;
        i.var_byte_arr_arr_c[n3][n6] = 48;
        i.var_byte_arr_arr_c[n][n6] = 48;
        i.var_byte_arr_arr_c[n4][n6] = 48;
    }

    private void cf() {
        this.var_byte_h = var_byte_arr_i[10];
        this.ch = this.cf;
        this.cg = this.ce;
        this.var_int_U = this.var_int_P;
        this.bZ = this.var_int_ax;
        this.bX = this.aZ;
        this.bY = this.bb;
        this.bS = this.aP;
        this.bT = this.aQ;
        this.bU = this.aU;
        this.bV = this.aV;
        this.bW = this.var_int_an;
        this.var_int_Y = this.var_int_X;
        this.ca = this.var_int_ab;
        this.cb = this.var_int_aa;
        cn = cm;
        if (var_byte_arr_m != null) {
            System.arraycopy(var_byte_arr_m, 0, var_byte_arr_o, 0, var_byte_arr_m.length);
        }
        for (int j = 0; j < this.var_int_av; ++j) {
            System.arraycopy(var_int_arr_arr_b[j], 0, var_int_arr_arr_c[j], 0, this.var_int_aw);
            System.arraycopy(var_byte_arr_arr_b[j], 0, var_byte_arr_arr_d[j], 0, this.var_int_aw);
            System.arraycopy(var_byte_arr_arr_a[j], 0, var_byte_arr_arr_e[j], 0, this.var_int_aw);
            System.arraycopy(var_int_arr_arr_a[j], 0, var_int_arr_arr_d[j], 0, this.var_int_aw);
        }
        this.ck();
    }

    private void cg() {
        int n;
        int n2;
        int n3;
        block21: {
            block20: {
                int n4;
                int[] nArray;
                block19: {
                    cE = -1;
                    this.aC = -1;
                    this.aB = -1;
                    this.aA = -1;
                    this.bg = 0;
                    this.bh = 0;
                    this.var_boolean_C = true;
                    this.ci = this.bS * 24 - 120;
                    this.cj = this.bT * 24 - 160 + 40;
                    this.bl = 0;
                    if (!this.var_boolean_o) break block19;
                    this.bm = 15;
                    this.var_boolean_o = false;
                    i.var_int_arr_arr_d[37][7] = -1;
                    nArray = var_int_arr_arr_d[39];
                    n4 = 5;
                    break block20;
                }
                if (!this.var_boolean_p) break block21;
                this.bm = 17;
                this.var_boolean_p = false;
                i.var_int_arr_arr_d[46][7] = -1;
                nArray = var_int_arr_arr_d[50];
                n4 = 7;
            }
            nArray[n4] = -1;
        }
        this.var_boolean_r = false;
        this.var_int_am = 70;
        i.var_byte_arr_i[10] = this.var_byte_h;
        this.var_int_P = this.var_int_U;
        this.cf = this.ch;
        this.ce = this.cg;
        this.var_int_ax = this.bZ;
        this.bb = this.bY;
        this.aZ = this.bX;
        var_g_arr_a[0].void_a(2);
        this.aS = 2;
        this.bj = 0;
        this.aP = this.bS;
        this.aQ = this.bT;
        this.aU = this.bU;
        this.aV = this.bV;
        this.var_int_X = this.var_int_Y;
        switch (this.var_byte_i) {
            case 5: {
                this.L();
                break;
            }
            case 3: {
                this.var_int_af = 5;
                break;
            }
            case 4: {
                this.var_int_ad = 0;
                this.var_int_ag = 0;
                this.var_int_af = 3;
                this.var_boolean_i = false;
                break;
            }
            case 1: {
                this.var_int_aa = this.cb;
                this.var_int_ab = this.ca;
            }
        }
        cm = cn;
        if (var_byte_arr_m != null) {
            System.arraycopy(var_byte_arr_o, 0, var_byte_arr_m, 0, var_byte_arr_m.length);
        }
        for (n3 = 0; n3 < this.var_int_av; ++n3) {
            System.arraycopy(var_int_arr_arr_c[n3], 0, var_int_arr_arr_b[n3], 0, this.var_int_aw);
            System.arraycopy(var_byte_arr_arr_d[n3], 0, var_byte_arr_arr_b[n3], 0, this.var_int_aw);
            System.arraycopy(var_byte_arr_arr_e[n3], 0, var_byte_arr_arr_a[n3], 0, this.var_int_aw);
            System.arraycopy(var_int_arr_arr_d[n3], 0, var_int_arr_arr_a[n3], 0, this.var_int_aw);
        }
        n3 = this.var_int_aw - 1;
        for (n2 = 1; n2 < n3; ++n2) {
            n = this.var_int_av - 1;
            for (int j = 1; j < n; ++j) {
                byte by = var_byte_arr_arr_a[j][n2];
                int n5 = var_int_arr_arr_a[j][n2] & 0xFF;
                if ((by <= -1 || by >= 80) && (n5 <= -1 || n5 >= 80)) continue;
                i.q(j, n2);
            }
        }
        if (var_g_arr_a[2] != null) {
            var_g_arr_a[2].void_a(0);
            i.var_byte_arr_arr_a[18][63] = -1;
        }
        this.var_int_an = this.bW;
        this.B();
        if (this.var_boolean_j) {
            this.cl();
        }
        if (var_byte_arr_e != null) {
            for (n2 = 0; n2 < this.var_int_aw; ++n2) {
                for (n = 0; n < this.var_int_av; ++n) {
                    if (var_byte_arr_arr_a[n][n2] != 48) continue;
                    this.bE = n;
                    this.bF = n2;
                    if ((var_int_arr_arr_b[n][n2] & 8) == 0) {
                        this.d((byte)48);
                        continue;
                    }
                    this.bG();
                }
            }
        }
    }

    public static void a(short s, short s2, byte by, int n) {
        i.var_byte_arr_arr_a[s][s2] = by;
        i.var_int_arr_arr_b[s][s2] = n;
    }

    private static boolean b(int n, int n2, int n3, int n4) {
        return Math.abs(n - n3) < 24 && Math.abs(n2 - n4) < 24;
    }

    private static boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dp = 0;
        cfr_renamed_0 = 0;
        dr = 100;
        dq = 100;
        if (Math.abs(n - n5) > 1 || Math.abs(n2 - n6) > 1) {
            return false;
        }
        cfr_renamed_0 = n * 24 + var_byte_arr_g[n3] * n4;
        dp = n2 * 24 + var_byte_arr_g[8 + n3] * n4;
        dq = n5 * 24 + var_byte_arr_g[n7] * n8;
        dr = n6 * 24 + var_byte_arr_g[8 + n7] * n8;
        return i.b(cfr_renamed_0, dp, dq, dr);
    }

    /*
     * Unable to fully structure code
     */
    private void ch() {
        block59: {
            block66: {
                block67: {
                    block57: {
                        block61: {
                            block65: {
                                block64: {
                                    block63: {
                                        block62: {
                                            block60: {
                                                block58: {
                                                    var1_1 = this.bE;
                                                    var2_2 = this.bF;
                                                    var3_3 = i.var_byte_arr_arr_b[var1_1][var2_2];
                                                    var4_4 = i.var_int_arr_arr_b[var1_1][var2_2];
                                                    var5_5 = i.var_byte_arr_arr_a[var1_1][var2_2];
                                                    var10_6 = i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[var1_1][var2_2] != 0;
                                                    var11_7 = var4_4 & 7;
                                                    if (var10_6 && i.var_int_arr_arr_e[var1_1][var2_2] != 3) {
                                                        var6_8 = -1;
                                                        var7_9 = 1;
                                                        v0 = var2_2 - 1;
                                                    } else {
                                                        var6_8 = 1;
                                                        var7_9 = 3;
                                                        v0 = var2_2 + 1;
                                                    }
                                                    var8_10 = v0;
                                                    var12_11 = (this.aS & 4096) == 0 ? this.var_byte_k : 0;
                                                    var13_12 = i.a(var1_1, var2_2, var11_7, var3_3, this.aP, this.aQ, (int)var12_11, this.aR);
                                                    if (var5_5 == 1 && var13_12) {
                                                        this.r(var1_1, var2_2);
                                                        return;
                                                    }
                                                    var14_13 = (i.var_int_arr_arr_a[var1_1][var2_2] & 255) == 35;
                                                    var15_14 = i.var_byte_arr_arr_a[var1_1][var8_10];
                                                    if (var15_14 == 9 && var3_3 <= 0) {
                                                        var16_15 = (byte)(i.var_int_arr_arr_a[var1_1][var8_10] & 255);
                                                        var17_16 = (i.var_int_arr_arr_b[var1_1][var8_10] & 0xFC00000) >> 22;
                                                        if (var17_16 != 34) {
                                                            if (var17_16 == 33) {
                                                                if (var16_15 == -1) {
                                                                    i.var_int_arr_arr_a[var1_1][var8_10] = 32;
                                                                }
                                                                this.aP = var1_1;
                                                                this.aQ = var8_10;
                                                                i.var_byte_arr_arr_a[var1_1][var8_10] = -1;
                                                                this.aR = 0;
                                                                this.aT = 0;
                                                                this.void_a(2, 48, 0);
                                                            } else if (i.var_byte_arr_arr_a[var1_1][var8_10] == 19 || i.var_byte_arr_arr_a[var1_1][var8_10] == 43 || i.var_byte_arr_arr_a[var1_1][var8_10] == 45 || i.var_byte_arr_arr_a[var1_1][var8_10] == 46 || i.var_byte_arr_arr_a[var1_1][var8_10] == 49 || i.var_byte_arr_arr_a[var1_1][var8_10] == 11) {
                                                                i.var_byte_arr_arr_a[var1_1][var8_10] = -1;
                                                                this.p(var1_1, var8_10);
                                                            }
                                                        }
                                                    }
                                                    if (var3_3 > 0 || var14_13) break block57;
                                                    if (var11_7 != var7_9 || !this.boolean_d(var1_1, var8_10) || !i.boolean_f(var1_1, var8_10)) break block58;
                                                    if ((var5_5 == 0 || var5_5 == 9) && var6_8 > 0) {
                                                        this.void_a(2, 48, 0);
                                                    } else if (var5_5 == 1) {
                                                        i.var_int_arr_arr_b[var1_1][var8_10] = var4_4 & -8 | 3;
                                                        i.var_byte_arr_arr_b[var1_1][var8_10] = 18;
                                                        i.var_byte_arr_arr_a[var1_1][var8_10] = 1;
                                                        i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                                        this.void_b(var1_1, var2_2);
                                                    } else if (var5_5 == 8) {
                                                        var4_4 &= -4063233;
                                                    }
                                                    i.var_int_arr_arr_b[var1_1][var2_2] = var4_4 & -8 | 0;
                                                    break block59;
                                                }
                                                if (!i.boolean_f(var1_1, var8_10) && i.var_byte_arr_arr_a[var1_1][var8_10] != 21 || this.boolean_d(var1_1, var2_2) && this.aT <= 0 || (this.boolean_d(var1_1, var8_10) || i.b(i.cfr_renamed_0, i.dp, i.dq, i.dr - 1)) && this.aT <= 0 && this.aW == 0 && (var5_5 == 0 || var11_7 != var7_9)) break block60;
                                                if (var6_8 > 0 || i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[var1_1][var8_10] != 0) {
                                                    var4_4 += 131072;
                                                    var4_4 = var4_4 & -8 | var7_9;
                                                    i.var_int_arr_arr_b[var1_1][var8_10] = var4_4 | -2147483648;
                                                    i.var_byte_arr_arr_b[var1_1][var8_10] = 18;
                                                    i.var_byte_arr_arr_a[var1_1][var8_10] = var5_5;
                                                    i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                                    i.q(var1_1, var2_2);
                                                    i.var_byte_arr_arr_c[var1_1][var2_2 + 2 * var6_8] = 24;
                                                    this.void_b(var1_1, var2_2);
                                                } else {
                                                    i.var_int_arr_arr_b[var1_1][var2_2] = var4_4 = var4_4 & -4063240 | 0;
                                                    i.var_byte_arr_arr_b[var1_1][var8_10] = 0;
                                                }
                                                break block59;
                                            }
                                            if (!i.boolean_j(var1_1, var8_10)) break block61;
                                            if (var6_8 >= 0 || i.var_int_arr_arr_e != null && i.var_int_arr_arr_e[var1_1][var8_10] != 0 || i.var_byte_arr_arr_a[var1_1][var2_2 + 1] >= 0) break block62;
                                            i.var_int_arr_arr_b[var1_1][var2_2 + 1] = var4_4 & -8 | 3;
                                            i.var_int_arr_arr_b[var1_1][var2_2 + 1] = i.var_int_arr_arr_b[var1_1][var2_2 + 1] | -2147483648;
                                            i.var_byte_arr_arr_a[var1_1][var2_2 + 1] = var5_5;
                                            i.var_byte_arr_arr_b[var1_1][var2_2 + 1] = 18;
                                            i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                                            break block59;
                                        }
                                        if (i.var_byte_arr_arr_b[var1_1][var8_10] > 0) break block59;
                                        var16_15 = (var4_4 & 0x3E0000) >> 17;
                                        if (var16_15 >= 2) {
                                            if (var5_5 == 8) {
                                                i.var_byte_arr_arr_a[var1_1][var2_2] = 54;
                                                i.var_int_arr_arr_b[var1_1][var2_2] = 0;
                                                i.q(var1_1, var2_2);
                                                return;
                                            }
                                            if (i.var_byte_arr_arr_a[var1_1][var8_10] == 8) {
                                                i.var_byte_arr_arr_a[var1_1][var8_10] = 54;
                                                i.var_int_arr_arr_b[var1_1][var8_10] = 0;
                                                i.q(var1_1, var8_10);
                                                return;
                                            }
                                        }
                                        var4_4 &= -4063233;
                                        if (!i.boolean_f(var1_1 - 1, var2_2) || !i.boolean_f(var1_1 - 1, var8_10) || this.boolean_d(var1_1 - 1, var2_2)) break block63;
                                        i.var_byte_arr_arr_b[var1_1][var2_2] = (byte)(((var4_4 & 28672) >> 12) + 1);
                                        i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
                                        var4_4 = var4_4 & -8 | 4;
                                        v1 = var4_4 & -3073;
                                        v2 = 2048;
                                        break block64;
                                    }
                                    if (!i.boolean_f(var1_1 + 1, var2_2) || !i.boolean_f(var1_1 + 1, var8_10) || this.boolean_d(var1_1 + 1, var2_2)) break block65;
                                    i.var_byte_arr_arr_b[var1_1][var2_2] = (byte)(((var4_4 & 28672) >> 12) + 1);
                                    i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
                                    var4_4 = var4_4 & -8 | 2;
                                    v1 = var4_4 & -3073;
                                    v2 = 1024;
                                }
                                var4_4 = v1 | v2;
                                var4_4 |= 512;
                            }
                            i.var_int_arr_arr_b[var1_1][var2_2] = var4_4;
                            break block59;
                        }
                        if (var5_5 == 8) {
                            var16_15 = (var4_4 & 0x3E0000) >> 17;
                            if (var16_15 >= 2) {
                                i.var_byte_arr_arr_a[var1_1][var2_2] = 54;
                                i.var_int_arr_arr_b[var1_1][var2_2] = 0;
                                i.q(var1_1, var2_2);
                                return;
                            }
                            var4_4 &= -4063233;
                        } else {
                            var4_4 = var4_4 & -3073 | 0;
                            var4_4 &= -4063233;
                            i.var_int_arr_arr_b[var1_1][var2_2] = var4_4 &= -8;
                        }
                        break block59;
                    }
                    if (var14_13) break block59;
                    if ((var4_4 & 512) != 0) break block66;
                    if (var11_7 != 3 || (i.var_int_arr_arr_a[var1_1][var2_2] & 255) != 6 || var3_3 > 12) {
                        var3_3 = (byte)(var3_3 - 6);
                    } else {
                        var3_3 = (byte)(var3_3 - (i.aN & 1));
                        i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
                    }
                    if (var3_3 != 0 && var3_3 != 12) break block67;
                    switch (var4_4 & 3072) {
                        case 2048: {
                            v3 = var4_4 & -57;
                            v4 = var4_4 - 8;
                            ** GOTO lbl148
                        }
                        case 1024: {
                            v3 = var4_4 & -57;
                            v4 = var4_4 + 8;
lbl148:
                            // 2 sources

                            var4_4 = v3 | v4 & 56;
                        }
                    }
                    if (var3_3 == 0) {
                        if ((i.var_int_arr_arr_a[var1_1][var2_2] & 255) == 6) {
                            var4_4 &= -449;
                        }
                        if (var11_7 == var7_9) {
                            if (!(var5_5 != 0 && var5_5 != 9 || var6_8 <= 0 || i.boolean_f(var1_1, var2_2 + 1))) {
                                i.t(200);
                                this.C(14);
                                this.bj = 10;
                                if (var5_5 == 9 && this.aT > 0 && this.boolean_d(var1_1, var2_2)) {
                                    this.void_a(1, 0, 0);
                                    this.B();
                                }
                                v5 = i.boolean_j(var1_1, var2_2 + 1);
                                var16_15 = (int)v5;
                                if (!v5) {
                                    var4_4 = var4_4 & -449 | 64;
                                }
                            }
                            i.var_byte_arr_arr_c[var1_1][var2_2] = 30;
                            if (!this.boolean_d(var1_1, var8_10)) {
                                var4_4 = var4_4 & -8 | 0;
                            }
                        }
                    }
                }
                i.var_byte_arr_arr_b[var1_1][var2_2] = var3_3;
                i.var_int_arr_arr_b[var1_1][var2_2] = var4_4;
                break block59;
            }
            var16_15 = 0;
            var17_16 = 0;
            if (var11_7 == 4) {
                v6 = -1;
            } else if (var11_7 == 2) {
                v6 = var16_15 = 1;
            }
            if (i.boolean_f(var1_1, var8_10) && !this.boolean_d(var1_1, var8_10)) {
                if ((var3_3 = (int)(var3_3 - 6)) <= 0) {
                    var3_3 = 0;
                    var4_4 &= -513;
                    var4_4 = var4_4 & -8 | 0;
                }
                i.var_byte_arr_arr_b[var1_1][var2_2] = var3_3;
                i.var_int_arr_arr_b[var1_1][var2_2] = var4_4;
                i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
            } else if (i.boolean_f(var1_1 + var16_15, var2_2) && !this.boolean_d(var1_1 + var16_15, var2_2) && i.boolean_f(var1_1 + var16_15, var8_10) && !this.boolean_d(var1_1 + var16_15, var8_10) && (i.var_int_arr_arr_b[var1_1][var8_10] & 512) == 0) {
                if (var3_3 >= 6 || (i.aN & 3) == 0) {
                    var3_3 = (byte)(var3_3 + 1);
                }
                if (var3_3 >= 12) {
                    var4_4 &= -513;
                    if (var16_15 != 0) {
                        var3_3 = 6;
                        i.var_byte_arr_arr_a[var1_1][var2_2] = -1;
                        if (i.boolean_f(var1_1 + var16_15, var8_10)) {
                            var3_3 = 12;
                            var4_4 = var4_4 & -8 | var7_9;
                            var17_16 = var6_8;
                        }
                    } else {
                        var4_4 = var4_4 & -8 | 0;
                        var3_3 = 0;
                    }
                    i.var_int_arr_arr_b[var1_1 + var16_15][var2_2 + var17_16] = var4_4 | -2147483648;
                    i.var_byte_arr_arr_b[var1_1 + var16_15][var2_2 + var17_16] = var3_3;
                    i.var_byte_arr_arr_a[var1_1 + var16_15][var2_2 + var17_16] = var5_5;
                    i.q(var1_1, var2_2);
                    i.var_byte_arr_arr_c[var1_1][var2_2 + 2 * var6_8] = 24;
                } else {
                    i.var_byte_arr_arr_b[var1_1][var2_2] = var3_3;
                    i.var_int_arr_arr_b[var1_1][var2_2] = var4_4;
                    i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
                }
            } else {
                if ((var3_3 = (int)(var3_3 - 6)) <= 0) {
                    var3_3 = 0;
                    var4_4 &= -513;
                    var4_4 = var4_4 & -8 | 0;
                }
                i.var_byte_arr_arr_b[var1_1][var2_2] = var3_3;
                i.var_int_arr_arr_b[var1_1][var2_2] = var4_4;
                i.var_byte_arr_arr_c[var1_1][var2_2] = 24;
                this.void_c(var1_1, var2_2);
            }
        }
        var16_15 = var4_4 & 0x20000000;
        var17_16 = i.var_byte_arr_arr_b[var1_1][var2_2];
        var18_17 = var4_4 & 0x40000000;
        var19_18 = 0;
        if (var16_15 == 0 && var17_16 != 0 || var18_17 == 0 && var10_6) {
            this.void_b(var1_1, var2_2);
        }
        if (var16_15 != 0 && var17_16 == 0 || var18_17 != 0 && !var10_6) {
            this.void_c(var1_1, var2_2);
        }
        var19_18 = (var4_4 & 512) != 0 ? 1 : (var17_16 != 0 || var16_15 != 0 ? 2 : (var10_6 != false ? 3 : (i.var_int_arr_arr_a[var1_1][var2_2] > -1 && i.var_int_arr_arr_a[var1_1][var2_2] < 38 ? 4 : ((i.boolean_f(var1_1 - 1, var2_2) != false || i.boolean_f(var1_1 + 1, var2_2) != false) && i.boolean_j(var1_1, var2_2 + 1) != false && (i.var_int_arr_arr_b[var1_1][var2_2 + 1] & 7) == 0 && var1_1 != this.bg && var2_2 != this.bh ? 6 : 0))));
        var4_4 = var4_4 & -536870913 | (var17_16 != 0 ? 0x20000000 : 0);
        var4_4 = var4_4 & -1073741825 | (var10_6 != false ? 0x40000000 : 0);
        i.var_int_arr_arr_b[var1_1][var2_2] = var4_4 = var4_4 & 0x7FFFFFFF | (var19_18 != 0 ? -2147483648 : 0);
        var20_19 = ((i.var_int_arr_arr_b[var1_1][var2_2] & 448) >> 6) - 1;
        if (var20_19 >= 0 && var20_19 < 5) {
            i.var_int_arr_arr_b[var1_1][var2_2] = i.var_int_arr_arr_b[var1_1][var2_2] & -449 | i.var_int_arr_arr_b[var1_1][var2_2] + 64 & 448;
        }
    }

    private void r(int n, int n2) {
        this.d(n, n2, 3);
        ++this.aZ;
        i.var_byte_arr_arr_a[n][n2] = -1;
        --this.var_int_P;
        this.bi = 0;
        if (this.var_int_P == 0) {
            i.var_byte_arr_arr_a[this.var_int_Q][this.var_int_R] = -1;
        }
        if (var_byte_arr_arr_a[n][n2 - 1] == -1) {
            this.void_b(n, n2 - 1);
        }
        this.void_b(n, n2);
        this.B();
    }

    private static a a(String string, int n, int n2, int n3) {
        a a2 = null;
        try {
            a2 = new a();
            byte[] byArray = i.byte_arr_a(string, n);
            a2.a(byArray, 0);
            for (int j = n2; j <= n3; ++j) {
                a2.a(j, 0, -1, -1);
            }
            a2.var_int_b = n2;
            a2.var_byte_arr_g = null;
            System.gc();
        }
        catch (Exception exception) {}
        return a2;
    }

    public static a a_a(String string, int n) {
        return i.a_a(string, n, 0);
    }

    private static a a_a(String string, int n, int n2) {
        return i.a(string, n, n2, n2);
    }

    private static Image[] javax_microedition_lcdui_Image_arr_a(String string, int n) {
        return i.javax_microedition_lcdui_Image_arr_a(string, n, 0);
    }

    private static Image[] javax_microedition_lcdui_Image_arr_a(String string, int n, int n2) {
        a a2 = null;
        try {
            a2 = new a();
            byte[] byArray = i.byte_arr_a(string, n);
            a2.a(byArray, 0);
            a2.a(n2, 0, -1, -1);
            i.a(a2, false);
            System.gc();
        }
        catch (Exception exception) {}
        return a2.var_javax_microedition_lcdui_Image_arr_arr_a[n2];
    }

    private static Image javax_microedition_lcdui_Image_a(String string, int n) {
        Image image = null;
        try {
            byte[] byArray = i.byte_arr_a(string, n);
            image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            System.gc();
        }
        catch (Exception exception) {}
        return image;
    }

    public static byte[] byte_arr_a(String string, int n) {
        byte[] byArray = null;
        InputStream inputStream = string.getClass().getResourceAsStream(string);
        try {
            int n2 = inputStream.read() << 3;
            byArray = new byte[n2];
            inputStream.read(byArray);
            int n3 = i.b(byArray, n << 3);
            int n4 = i.b(byArray, (n << 3) + 4);
            inputStream.skip(n3);
            byArray = new byte[n4];
            inputStream.read(byArray);
            inputStream.close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    private void ci() {
        if (a.h == null) {
            InputStream inputStream = this.getClass().getResourceAsStream("/mc");
            a.h = new byte[256];
            try {
                inputStream.read(a.h);
                inputStream.close();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static final int a(a a2, String string, int n) {
        int n2;
        if (n != -1 && (n2 = string.indexOf(10)) != -1) {
            string = string.substring(0, n2);
        }
        if ((n2 = string.indexOf(125)) != -1) {
            string = string.substring(0, n2);
        }
        a2.void_a(string);
        return a.var_int_c;
    }

    public static int a(a a2) {
        return a2.var_int_e + (a2.var_byte_arr_a[1] & 0xFF);
    }

    public static void void_b(int n) {
        e.c = n;
    }

    private boolean boolean_a(Graphics graphics) {
        ++e.var_int_b;
        switch (e.c) {
            case 0: {
                this.A();
                this.var_e_a = new e();
                this.cj();
                this.var_h_a.e();
                i.void_b(1);
                this.var_boolean_al = false;
                break;
            }
            case 1: {
                e.a();
                var_boolean_V = false;
                break;
            }
            case 2: {
                e.b();
                this.A();
                var_byte_l = (byte)9;
                this.br = 8;
                this.bs = 0;
                break;
            }
            case 3: {
                this.var_e_a.a(graphics);
                break;
            }
            case 4: {
                i.void_b(0);
                this.var_e_a = null;
                System.gc();
                return false;
            }
        }
        return true;
    }

    private void cj() {
        if ((var_byte_arr_j[0] & 1) == 0) {
            this.var_boolean_al = true;
            var_byte_arr_j[0] = (byte)(var_byte_arr_j[0] | 1);
            this.I();
        }
    }

    private static int a(InputStream inputStream) throws IOException {
        return inputStream.read() & 0xFF | (inputStream.read() & 0xFF) << 8;
    }

    private static int int_g(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        switch (n) {
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
        }
        return 0;
    }

    private void ck() {
        if (!this.var_boolean_j) {
            return;
        }
        if (var_int_arr_arr_f == null) {
            var_int_arr_arr_f = new int[this.var_int_av][this.var_int_aw];
        }
        for (int j = 0; j < this.var_int_av; ++j) {
            System.arraycopy(var_int_arr_arr_e[j], 0, var_int_arr_arr_f[j], 0, this.var_int_aw);
        }
        if (var_long_arr_c == null) {
            var_long_arr_c = new long[15];
        }
        System.arraycopy(var_long_arr_a, 0, var_long_arr_c, 0, var_long_arr_a.length);
        if (var_long_arr_d == null) {
            var_long_arr_d = new long[15];
        }
        System.arraycopy(var_long_arr_b, 0, var_long_arr_d, 0, var_long_arr_b.length);
        this.var_byte_y = this.var_byte_x;
        this.dC = this.ds;
        this.dD = this.dt;
        this.dE = this.du;
        this.var_byte_z = this.var_byte_v;
        this.dF = this.dx;
        this.dG = this.dy;
        this.dH = this.dz;
        this.var_byte_A = this.var_byte_w;
        this.dI = this.dA;
        this.dJ = this.dB;
        var_boolean_an = this.var_boolean_am;
        this.dK = this.dv;
        this.dL = this.dw;
    }

    private void cl() {
        this.var_boolean_am = var_boolean_an;
        this.dv = this.dK;
        this.dw = this.dL;
        for (int j = 0; j < this.var_int_av; ++j) {
            System.arraycopy(var_int_arr_arr_f[j], 0, var_int_arr_arr_e[j], 0, this.var_int_aw);
        }
        System.arraycopy(var_long_arr_c, 0, var_long_arr_a, 0, var_long_arr_a.length);
        System.arraycopy(var_long_arr_d, 0, var_long_arr_b, 0, var_long_arr_b.length);
        this.var_byte_x = this.var_byte_y;
        this.ds = this.dC;
        this.dt = this.dD;
        this.du = this.dE;
        this.var_byte_v = this.var_byte_z;
        this.dx = this.dF;
        this.dy = this.dG;
        this.dz = this.dH;
        this.var_byte_w = this.var_byte_A;
        this.dA = this.dI;
        this.dB = this.dJ;
    }

    private void cm() {
        if (this.var_boolean_j) {
            this.cn();
            var_int_arr_arr_e = new int[this.var_int_av][this.var_int_aw];
            this.bC();
        }
    }

    private void cn() {
        if (this.var_boolean_j) {
            var_long_arr_a = new long[15];
            var_long_arr_c = new long[15];
            var_long_arr_b = new long[15];
            var_long_arr_d = new long[15];
            this.var_byte_x = (byte)3;
            this.var_boolean_am = true;
            this.ds = -1;
            this.dt = 0;
            this.du = 0;
            this.var_byte_v = 0;
            this.dx = 0;
            this.dy = 0;
            this.dz = 0;
            this.var_byte_w = 0;
            this.dA = 0;
            this.dB = -1;
            this.dv = 0;
            this.dw = 0;
        }
    }

    private byte byte_a(byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 0;
        while (by6 < 15 && i.a(by5, (byte)0, (byte)4) != 0) {
            by6 = (byte)(by5 + 1);
        }
        if (by5 < 15) {
            this.void_a(by5, (byte)1, (byte)0, (byte)4);
            this.void_a(by5, by4, (byte)4, (byte)2);
            this.void_a(by5, by, (byte)6, (byte)7);
            this.void_a(by5, by, (byte)27, (byte)7);
            this.void_a(by5, by2, (byte)13, (byte)7);
            this.void_a(by5, by3, (byte)20, (byte)7);
            return by5;
        }
        return -1;
    }

    private static int int_a(int n, byte by, byte by2, byte by3) {
        n >>>= by * 9 + by2;
        return n &= ~(-1 << by3);
    }

    private void void_a(int n, int n2, byte by, byte n3, byte by2, byte by3) {
        int n4 = var_int_arr_arr_e[n][n2];
        int n5 = i.int_a(n4, by, by2, by3);
        byte by4 = (byte)(by * 9 + by2);
        n4 ^= (n5 <<= by4);
        int n6 = n3;
        i.var_int_arr_arr_e[n][n2] = n4 |= (n6 <<= by4);
        i.var_byte_arr_arr_c[n][n2] = 24;
        i.var_byte_arr_arr_c[n][n2 + 1] = 24;
    }

    private static int int_a(int n, byte by, byte by2) {
        return (int)(var_long_arr_a[n - 1] >>> by & (-1L << by2 ^ 0xFFFFFFFFFFFFFFFFL));
    }

    private void void_a(int n, byte by, byte by2, byte by3) {
        long l = i.int_a(n, by2, by3);
        long l2 = var_long_arr_a[--n];
        l2 ^= (l <<= by2);
        long l3 = by;
        i.var_long_arr_a[n] = l2 |= (l3 <<= by2);
    }

    private static int a(byte by, byte by2, byte by3) {
        long l = var_long_arr_b[by];
        l >>>= by2;
        return (int)(l &= -1L << by3 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private void void_a(byte by, byte n, byte by2, byte by3) {
        long l = i.a(by, by2, by3);
        long l2 = var_long_arr_b[by];
        l2 ^= (l <<= by2);
        int n2 = n;
        i.var_long_arr_b[by] = l2 |= (long)(n2 <<= by2);
    }

    private byte byte_b(int n, int n2) {
        byte by;
        byte by2 = by = 0;
        while (by2 < 15) {
            if (n == i.a(by, (byte)13, (byte)7) && n2 == i.a(by, (byte)20, (byte)7)) {
                return by;
            }
            by2 = (byte)(by + 1);
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private byte byte_a(int n, int n2, byte by) {
        int n3 = this.byte_b(n, n2);
        if (n3 < 0) return -1;
        this.void_a((byte)n3, by, (byte)0, (byte)4);
        switch (by) {
            case 3: {
                return (byte)39;
            }
            case 1: {
                return (byte)38;
            }
            case 2: {
                return (byte)39;
            }
        }
        return (byte)n3;
    }

    private void co() {
        if (!this.var_boolean_j) {
            return;
        }
        if (this.ds >= 0 && this.dB >= 0) {
            ++this.ds;
            this.cq();
        }
        switch (this.var_byte_x) {
            case 2: {
                byte by;
                byte by2 = by = 1;
                while (by2 <= 15) {
                    switch (i.int_a((int)by, (byte)28, (byte)3)) {
                        case 3: {
                            i.f(by);
                            break;
                        }
                        case 2: {
                            if (this.dB < 0) break;
                            ++this.dB;
                            this.g(by);
                            break;
                        }
                        case 1: 
                        case 6: 
                        case 7: {
                            this.h(by);
                        }
                    }
                    by2 = (byte)(by + 1);
                }
                break;
            }
            case 1: {
                this.var_byte_x = (byte)2;
                return;
            }
            case 4: {
                this.cp();
                this.var_byte_x = (byte)2;
                return;
            }
            case 5: {
                this.u(this.dx, this.dy);
            }
        }
    }

    private static void f(byte by) {
        i.var_long_arr_a[by - 1] = 0L;
    }

    /*
     * Unable to fully structure code
     */
    private void cp() {
        v0 = var1_1 = 0;
        while (v0 < 15) {
            block6: {
                if (i.a(var1_1, (byte)0, (byte)4) != 3) break block6;
                var2_2 = i.a(var1_1, (byte)13, (byte)7);
                var3_3 = i.a(var1_1, (byte)20, (byte)7);
                var4_4 = i.a(var1_1, (byte)4, (byte)2);
                i.var_long_arr_b[var1_1] = 0L;
                var5_5 = 0;
                var6_6 = 0;
                switch (var4_4) {
                    case 0: {
                        ++var3_3;
                        var5_5 = 0;
                        v1 = 0;
                        ** GOTO lbl25
                    }
                    case 1: {
                        ++var2_2;
                        v2 = 1;
                        ** GOTO lbl23
                    }
                    case 2: {
                        --var2_2;
                        v2 = -1;
lbl23:
                        // 2 sources

                        var5_5 = v2;
                        v1 = 2;
lbl25:
                        // 2 sources

                        var6_6 = v1;
                    }
                }
                this.byte_a(var2_2, var3_3, (byte)7, var5_5, var6_6, this.byte_b(var2_2, var3_3));
            }
            v0 = (byte)(var1_1 + 1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cq() {
        var2_2 = i.int_a((int)this.var_byte_w, (byte)20, (byte)6);
        var3_3 = i.int_a((int)this.var_byte_w, (byte)47, (byte)2);
        switch (var3_3) {
            case 1: {
                if (var2_2 == this.dA) {
                    this.ds = -1;
                    this.dB = -1;
                    i.f(this.var_byte_w);
                    this.var_byte_x = (byte)4;
                    return;
                }
                var4_4 = (byte)i.int_a((int)this.var_byte_w, (byte)49, (byte)5);
                if (this.ds == 0 || this.ds % var4_4 != 0) break;
                this.ds = 0;
                var5_6 = (byte)i.int_a((int)this.var_byte_w, (byte)26, (byte)2);
                if (var5_6 < 0) break;
                v0 = var6_8 = 0;
                while (v0 < var4_4) {
                    i.c(var1_1 - var6_8, var2_2, var5_6);
                    var7_10 = var5_6;
                    var8_12 = var2_2;
                    var7_10 = (byte)(var7_10 + 1);
                    if (var7_10 > 2) {
                        var7_10 = 0;
                        ++var8_12;
                    }
                    var9_13 = i.int_a(i.var_int_arr_arr_e[var1_1 - var6_8][var8_12], var7_10, (byte)3, (byte)4);
                    if (var8_12 != this.dA || var5_6 != 2 ? var9_13 != 12 && var9_13 != 9 : var9_13 != 0 && var9_13 != 3) {
                        this.void_a(var1_1 - var6_8, var8_12, var7_10, (byte)7, (byte)3, (byte)4);
                    }
                    v0 = (byte)(var6_8 + 1);
                }
                if (var5_6 == 2) {
                    this.void_a((int)this.var_byte_w, (byte)0, (byte)47, (byte)2);
                    this.void_a((int)this.var_byte_w, (byte)0, (byte)26, (byte)2);
                    v1 = this;
                    v2 = this.var_byte_w;
                    v3 = (byte)(++var2_2);
                    v4 = 20;
                    v5 = 6;
                } else {
                    v1 = this;
                    v2 = this.var_byte_w;
                    v3 = var5_6 = (byte)(var5_6 + 1);
                    v4 = 26;
                    v5 = 2;
                }
                ** GOTO lbl85
            }
            case 0: {
                this.void_a((int)this.var_byte_w, (byte)1, (byte)47, (byte)2);
                var4_5 = i.int_a((int)this.var_byte_w, (byte)49, (byte)5);
                var5_7 = (byte)i.int_a((int)this.var_byte_w, (byte)45, (byte)2);
                var6_9 = 0;
                if (var5_7 != 0) {
                    if (var5_7 == 2) {
                        for (var1_1 = i.int_a((int)this.var_byte_w, 14, 6); var1_1 >= this.dx && (byte)(i.var_byte_arr_arr_a[var1_1 + 1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 35; ++var1_1) {
                        }
                    } else {
                        while (var1_1 <= this.dx && (byte)(i.var_byte_arr_arr_a[var1_1 + 1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 35) {
                            ++var1_1;
                        }
                    }
                } else if ((byte)(i.var_byte_arr_arr_a[var1_1 + 1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 35) {
                    while ((byte)(i.var_byte_arr_arr_a[var1_1 + 1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 35) {
                        ++var1_1;
                    }
                } else {
                    while (var6_9 < var4_5) {
                        ++var6_9;
                        if ((byte)(i.var_byte_arr_arr_a[var1_1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1][var2_2] != 35) {
                            var6_9 = var4_5;
                            continue;
                        }
                        --var1_1;
                    }
                }
                if (this.dz != 2 && var1_1 <= this.dx) {
                    while ((byte)(i.var_byte_arr_arr_a[var1_1 + 1][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 + 1][var2_2] != 35) {
                        ++var1_1;
                    }
                }
                this.void_a((int)this.var_byte_w, (byte)var1_1, (byte)14, (byte)6);
                v6 = 1;
                while ((byte)(i.var_byte_arr_arr_a[var1_1 - (var7_11 = v6)][var2_2] - 80) < 0 && i.var_byte_arr_arr_a[var1_1 - var7_11][var2_2] != 10 && i.var_byte_arr_arr_a[var1_1 - var7_11][var2_2] != 37 && i.var_byte_arr_arr_a[var1_1 - var7_11][var2_2] != 34 && i.var_byte_arr_arr_a[var1_1 - var7_11][var2_2] != 35) {
                    v6 = (byte)(var7_11 + 1);
                }
                v1 = this;
                v2 = this.var_byte_w;
                v3 = (byte)var7_11;
                v4 = 49;
                v5 = 5;
lbl85:
                // 3 sources

                v1.void_a((int)v2, v3, (byte)v4, (byte)v5);
            }
        }
    }

    private void g(byte by) {
        int n = i.int_a((int)by, (byte)14, (byte)6);
        int n2 = i.int_a((int)by, (byte)20, (byte)6);
        int n3 = i.int_a((int)by, (byte)0, (byte)7);
        int n4 = i.int_a((int)by, (byte)7, (byte)7);
        int n5 = i.int_a((int)by, (byte)47, (byte)2);
        byte by2 = (byte)i.int_a((int)by, (byte)54, (byte)3);
        byte by3 = (byte)i.a(by2, (byte)6, (byte)7);
        switch (n5) {
            case 1: {
                byte by4 = (byte)i.int_a((int)by, (byte)49, (byte)5);
                if (this.dB == 0 || this.dB % by4 != 0) break;
                this.dB = 0;
                byte by5 = (byte)i.int_a((int)by, (byte)26, (byte)2);
                byte by6 = (byte)i.int_a((int)by, (byte)57, (byte)1);
                if (by5 < 0) break;
                if (by6 != 1) {
                    byte by7;
                    byte by8 = by7 = 0;
                    while (by8 < by4) {
                        this.void_a(n - by7, n2, by5, (byte)7, (byte)3, (byte)4);
                        this.void_a((int)by, by5, (byte)43, (byte)2);
                        this.void_a(n - by7, n2, by5, by, (byte)0, (byte)3);
                        by8 = (byte)(by7 + 1);
                    }
                    if (this.dt > 0) {
                        byte by9;
                        by7 = by5;
                        int n6 = n2;
                        if ((by7 = (byte)(by7 + 1)) > 2) {
                            by7 = 0;
                            ++n6;
                        }
                        byte by10 = by9 = 0;
                        while (by10 < by4) {
                            if ((byte)(var_byte_arr_arr_a[n - by9][n6] - 80) < 0 && var_byte_arr_arr_a[n - by9][n6] != 10 && var_byte_arr_arr_a[n - by9][n6] != 37 && var_byte_arr_arr_a[n - by9][n6] != 34 && var_byte_arr_arr_a[n - by9][n6] != 35) {
                                this.void_a(n - by9, n6, by7, (byte)8, (byte)3, (byte)4);
                            }
                            by10 = (byte)(by9 + 1);
                        }
                    }
                    ++this.dt;
                }
                if (by6 == 1 || (n4 >= n3 || by3 == 0) && by5 == this.var_byte_v) {
                    if (by6 == 1) {
                        this.void_a((int)by, (byte)0, (byte)57, (byte)1);
                    }
                    this.void_a((int)by, (byte)3, (byte)28, (byte)3);
                    if (by3 == 0) {
                        this.void_a(by2, (byte)3, (byte)0, (byte)4);
                        this.void_a((int)by, (byte)5, (byte)28, (byte)3);
                        if (this.ds == -1) {
                            this.dB = -1;
                            this.var_byte_x = (byte)4;
                        }
                        return;
                    }
                }
                if (by5 == 0) {
                    this.void_a((int)by, (byte)0, (byte)47, (byte)2);
                    this.void_a((int)by, (byte)2, (byte)26, (byte)2);
                    return;
                }
                by5 = (byte)(by5 - 1);
                this.void_a((int)by, by5, (byte)26, (byte)2);
                return;
            }
            case 0: {
                byte by11;
                boolean bl;
                int n7;
                byte by12;
                this.void_a((int)by, (byte)1, (byte)47, (byte)2);
                this.void_a((int)by, (byte)(--n2), (byte)20, (byte)6);
                boolean bl2 = false;
                if ((byte)(var_byte_arr_arr_a[n][n2] - 80) >= 0 || var_byte_arr_arr_a[n][n2] == 10 || var_byte_arr_arr_a[n][n2] == 37 || var_byte_arr_arr_a[n][n2] == 34 || var_byte_arr_arr_a[n][n2] == 35) {
                    while ((byte)(var_byte_arr_arr_a[n][n2] - 80) >= 0 || var_byte_arr_arr_a[n][n2] == 10 || var_byte_arr_arr_a[n][n2] == 37 || var_byte_arr_arr_a[n][n2] == 34 || var_byte_arr_arr_a[n][n2] == 35) {
                        n += -1;
                    }
                } else {
                    while ((byte)(var_byte_arr_arr_a[n + 1][n2] - 80) < 0 && var_byte_arr_arr_a[n + 1][n2] != 10 && var_byte_arr_arr_a[n + 1][n2] != 37 && var_byte_arr_arr_a[n + 1][n2] != 34 && var_byte_arr_arr_a[n + 1][n2] != 35) {
                        ++n;
                    }
                }
                this.void_a((int)by, (byte)n, (byte)14, (byte)6);
                byte by13 = 1;
                while ((byte)(var_byte_arr_arr_a[n - (by12 = by13)][n2] - 80) < 0 && var_byte_arr_arr_a[n - by12][n2] != 10 && var_byte_arr_arr_a[n - by12][n2] != 37 && var_byte_arr_arr_a[n - by12][n2] != 34 && var_byte_arr_arr_a[n - by12][n2] != 35) {
                    by13 = (byte)(by12 + 1);
                }
                this.void_a((int)by, by12, (byte)49, (byte)5);
                int n8 = by3 - by12;
                byte by14 = 0;
                this.var_byte_v = 0;
                if (n8 < 0) {
                    n7 = -n8;
                    n7 *= 3;
                    byte by15 = 0;
                    int n9 = by12 + n8;
                    if (n9 * 3 - by12 != 0 && (n9 *= 3) <= by12 * 3 / 2) {
                        by15 = 1;
                    }
                    this.var_byte_v = (byte)(n7 /= by12);
                    this.var_byte_v = (byte)(this.var_byte_v + by15);
                    if (this.var_byte_v > 2) {
                        this.void_a((int)by, (byte)1, (byte)57, (byte)1);
                    }
                    by14 = (byte)Math.abs(n8);
                    bl = false;
                }
                if ((n4 += by12 - by14) > n3) {
                    n7 = n3 - n4;
                    n4 += n7;
                    by11 = (byte)(bl - n7);
                }
                this.void_a((int)by, (byte)n4, (byte)7, (byte)7);
                this.void_a(by2, by11, (byte)6, (byte)7);
            }
        }
    }

    private byte a(byte by, int n, int n2, byte by2, byte by3, byte by4, boolean bl) {
        byte by5 = 0;
        if ((byte)(var_byte_arr_arr_a[n + by4][n2] - 80) >= 0 || var_byte_arr_arr_a[n + by4][n2] == 10 || var_byte_arr_arr_a[n + by4][n2] == 37 || var_byte_arr_arr_a[n + by4][n2] == 34 || var_byte_arr_arr_a[n + by4][n2] == 35) {
            by5 = -2;
        } else {
            by5 = by4;
            if (by2 != by4) {
                this.void_a((int)by, by4 < 0 ? (byte)2 : (byte)by4, (byte)45, (byte)2);
            }
            this.void_a((int)by, (byte)(n += by4), (byte)31, (byte)6);
            this.void_a(n, n2, by3, by, (byte)0, (byte)3);
            if (bl) {
                i.c(n, n2, by3);
            } else {
                int n3;
                byte by6;
                int n4;
                int n5;
                i i2;
                int n6;
                int n7 = 0;
                int n8 = 0;
                int n9 = i.int_a((int)by, (byte)28, (byte)3);
                if (by4 > 0) {
                    n7 = n9 == 6 && this.dx == n && this.dy == n2 ? 11 : 4;
                    n6 = 9;
                } else {
                    n7 = n9 == 6 && this.dx == n && this.dy == n2 ? 14 : 5;
                    n6 = n8 = 12;
                }
                if ((byte)(var_byte_arr_arr_a[n][n2 + 1] - 80) >= 0 || var_byte_arr_arr_a[n + by4][n2] == 10 || var_byte_arr_arr_a[n + by4][n2] == 37 || var_byte_arr_arr_a[n + by4][n2] == 34 || var_byte_arr_arr_a[n + by4][n2] == 35) {
                    i2 = this;
                    n5 = n;
                    n4 = n2;
                    by6 = by3;
                    n3 = n7;
                } else {
                    i2 = this;
                    n5 = n;
                    n4 = n2;
                    by6 = by3;
                    n3 = n8;
                }
                i2.void_a(n5, n4, by6, (byte)n3, (byte)3, (byte)4);
            }
        }
        return by5;
    }

    private boolean boolean_d(int n) {
        return n != -1 && i.byte_a(n, (byte)6, (byte)1) == 1;
    }

    private static byte byte_a(int n, byte by, byte by2) {
        return (byte)(n >>> by & ~(0xFFFFFF << by2));
    }

    private static boolean boolean_a(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = true;
        boolean bl3 = bl = true;
        while (bl) {
            bl = true;
            n -= n3;
            if (n3 == 0) {
                if ((byte)(var_byte_arr_arr_a[n - 1][n2] - 80) < 0 && var_byte_arr_arr_a[n - 1][n2] != 10 && var_byte_arr_arr_a[n - 1][n2] != 37 && var_byte_arr_arr_a[n - 1][n2] != 34 && (var_byte_arr_arr_a[n - 1][n2] != 35 || (byte)(var_byte_arr_arr_a[n + 1][n2] - 80) < 0) && var_byte_arr_arr_a[n + 1][n2] != 10 && var_byte_arr_arr_a[n + 1][n2] != 37 && var_byte_arr_arr_a[n + 1][n2] != 34 && var_byte_arr_arr_a[n + 1][n2] != 35) continue;
                bl2 = true;
                bl3 = false;
                continue;
            }
            if ((byte)(var_byte_arr_arr_a[n][n2 + 1] - 80) < 0 && var_byte_arr_arr_a[n][n2 + 1] != 10 && var_byte_arr_arr_a[n][n2 + 1] != 37 && var_byte_arr_arr_a[n][n2 + 1] != 34 && var_byte_arr_arr_a[n][n2 + 1] != 35) {
                bl = false;
            }
            if ((byte)(var_byte_arr_arr_a[n][n2] - 80) >= 0 || var_byte_arr_arr_a[n][n2] == 10 || var_byte_arr_arr_a[n][n2] == 37 || var_byte_arr_arr_a[n][n2] == 34 || var_byte_arr_arr_a[n][n2] == 35) {
                bl2 = bl;
                bl3 = false;
                continue;
            }
            if (bl) continue;
            return bl;
        }
        return bl2;
    }

    private void h(byte by) {
        int n;
        boolean bl;
        int n2;
        byte by2;
        byte by3;
        int n3;
        int n4;
        block19: {
            block20: {
                byte by4;
                block24: {
                    int n5;
                    byte by5;
                    int n6;
                    int n7;
                    int n8;
                    byte by6;
                    i i2;
                    block23: {
                        block21: {
                            block22: {
                                n4 = i.int_a((int)by, (byte)31, (byte)6);
                                n3 = i.int_a((int)by, (byte)37, (byte)6);
                                by3 = (byte)i.int_a((int)by, (byte)43, (byte)2);
                                by2 = (byte)i.int_a(var_int_arr_arr_e[n4][n3], by3, (byte)7, (byte)2);
                                n2 = i.int_a((int)by, (byte)45, (byte)2);
                                byte by7 = (byte)i.int_a((int)by, (byte)28, (byte)3);
                                bl = by7 == 7;
                                n = 0;
                                if (n2 > 1) {
                                    n2 = -1;
                                }
                                if (by2 == 0) {
                                    by4 = (byte)(by3 + 1);
                                    int n9 = n3;
                                    if (by3 == 2) {
                                        by4 = 0;
                                        n9 = n3 + 1;
                                    }
                                    if (i.int_a(var_int_arr_arr_e[n4][n9], by4, (byte)3, (byte)4) == 7) {
                                        this.dt = 1;
                                        if (bl) {
                                            i.f(by);
                                            this.var_byte_x = (byte)3;
                                            this.var_boolean_am = true;
                                            return;
                                        }
                                        int n10 = by4 - 1;
                                        if (n10 < 0) {
                                            n10 = 2;
                                        }
                                        this.dB = 0;
                                        byte by8 = (byte)i.int_a(var_int_arr_arr_e[n4][n9], by4, (byte)0, (byte)3);
                                        byte by9 = (byte)i.int_a((int)by, (byte)54, (byte)3);
                                        this.void_a((int)by8, by9, (byte)54, (byte)3);
                                        this.void_a((int)by8, (byte)2, (byte)28, (byte)3);
                                        this.void_a((int)by8, (byte)0, (byte)47, (byte)2);
                                        this.void_a((int)by8, (byte)n10, (byte)26, (byte)2);
                                        this.void_a((int)by8, (byte)n4, (byte)14, (byte)6);
                                        this.void_a((int)by8, (byte)n9, (byte)20, (byte)6);
                                        this.void_a((int)by8, (byte)0, (byte)57, (byte)1);
                                        i.f(by);
                                        return;
                                    }
                                }
                                if (by3 != 2 || by2 != 0) break block19;
                                if ((byte)(var_byte_arr_arr_a[n4][n3 + 1] - 80) < 0 && var_byte_arr_arr_a[n4][n3 + 1] != 10 && var_byte_arr_arr_a[n4][n3 + 1] != 37 && var_byte_arr_arr_a[n4][n3 + 1] != 34 && var_byte_arr_arr_a[n4][n3 + 1] != 35) break block20;
                                if (n2 != 0) break block21;
                                if (bl) {
                                    i.c(n4, n3, by3);
                                } else {
                                    this.void_a(n4, n3, by3, (byte)15, (byte)3, (byte)4);
                                }
                                n = this.a(by, n4, n3, (byte)n2, by3, (byte)1, bl);
                                if (n >= 0) break block22;
                                i2 = this;
                                by6 = by;
                                n8 = n4;
                                n7 = n3;
                                n6 = n2;
                                by5 = by3;
                                n5 = -1;
                                break block23;
                            }
                            if ((byte)(var_byte_arr_arr_a[n4 + -1][n3] - 80) < 0 && var_byte_arr_arr_a[n4 + -1][n3] != 10 && var_byte_arr_arr_a[n4 + -1][n3] != 37 && var_byte_arr_arr_a[n4 + -1][n3] != 34 && var_byte_arr_arr_a[n4 + -1][n3] != 35) {
                                this.byte_a(n4 - 1, n3, bl ? (byte)7 : 5, (byte)-1, (byte)2, (byte)i.int_a((int)by, (byte)54, (byte)3));
                            }
                            break block24;
                        }
                        i2 = this;
                        by6 = by;
                        n8 = n4;
                        n7 = n3;
                        n6 = n2;
                        by5 = by3;
                        n5 = n2;
                    }
                    n = i2.a(by6, n8, n7, (byte)n6, by5, (byte)n5, bl);
                }
                if (n == -2) {
                    int n11;
                    int n12;
                    byte by10;
                    byte by11;
                    i i3;
                    by4 = var_int_arr_arr_b[n4][n3 + 1];
                    if (this.boolean_d((int)by4) && i.boolean_a(n4, n3, n2)) {
                        this.dt = 0;
                        this.dB = 0;
                        this.void_a((int)by, (byte)2, (byte)28, (byte)3);
                        this.void_a((int)by, i.byte_a((int)by4, (byte)0, (byte)6), (byte)0, (byte)7);
                        this.void_a((int)by, (byte)2, (byte)26, (byte)2);
                        this.void_a((int)by, (byte)n4, (byte)14, (byte)6);
                        i3 = this;
                        by11 = by;
                        by10 = (byte)(n3 + 1);
                        n12 = 20;
                        n11 = 6;
                    } else {
                        i3 = this;
                        by11 = by;
                        by10 = 3;
                        n12 = 28;
                        n11 = 3;
                    }
                    i3.void_a((int)by11, by10, (byte)n12, (byte)n11);
                    n4 += n2;
                } else {
                    n2 = n;
                    n4 += n2;
                }
                break block19;
            }
            if (n2 != 0) {
                n2 = 0;
                this.void_a((int)by, (byte)0, (byte)45, (byte)2);
            }
        }
        if (n != -2) {
            switch (n2) {
                case 0: {
                    this.a(by, n4, n3, by3, bl);
                    return;
                }
                case -1: 
                case 1: {
                    this.a(n4, n3, by3, by2);
                }
            }
        }
    }

    private void a(int n, int n2, byte by, byte by2) {
        if ((by2 = (byte)(by2 + 1)) > 2) {
            by2 = 0;
        }
        this.void_a(n, n2, by, by2, (byte)7, (byte)2);
    }

    private void a(byte by, int n, int n2, byte by2, boolean bl) {
        byte by3;
        byte by4;
        int n3;
        int n4;
        i i2;
        if (!bl && i.int_a(var_int_arr_arr_e[n][n2], by2, (byte)3, (byte)4) == 0) {
            this.void_a(n, n2, by2, (byte)3, (byte)3, (byte)4);
        }
        if ((by2 = (byte)(by2 + 1)) > 2) {
            by2 = 0;
            this.void_a((int)by, (byte)(++n2), (byte)37, (byte)6);
        }
        this.void_a((int)by, by2, (byte)43, (byte)2);
        if (bl) {
            i2 = this;
            n4 = n;
            n3 = n2;
            by4 = by2;
            by3 = 6;
        } else {
            this.void_a(n, n2, by2, by, (byte)0, (byte)3);
            i2 = this;
            n4 = n;
            n3 = n2;
            by4 = by2;
            by3 = 0;
        }
        i2.void_a(n4, n3, by4, by3, (byte)3, (byte)4);
    }

    private void s(int n, int n2) {
        this.var_byte_x = 1;
        this.byte_a(n, n2 + 1, (byte)0, (byte)0, (byte)0, this.byte_b(n, n2));
    }

    private static void c(int n, int n2, byte by) {
        int n3 = var_int_arr_arr_e[n][n2];
        byte by2 = (byte)(by * 9);
        int n4 = n3 >>> by2;
        n4 &= 0x1FF;
        i.var_int_arr_arr_e[n][n2] = n3 ^= (n4 <<= by2);
        i.var_byte_arr_arr_c[n][n2] = 24;
    }

    private byte byte_a(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 1;
        while (by6 <= 15 && i.int_a((int)by5, (byte)28, (byte)3) != 0) {
            by6 = (byte)(by5 + 1);
        }
        i.var_long_arr_a[by5 - 1] = 0L;
        if (by == 7) {
            i.c(n, n2, by3);
            this.void_a((int)by5, (byte)7, (byte)28, (byte)3);
        } else {
            this.void_a((int)by5, (byte)1, (byte)28, (byte)3);
            this.void_a((int)by5, by4, (byte)54, (byte)3);
            this.void_a(n, n2, by3, by5, (byte)0, (byte)3);
            this.void_a(n, n2, by3, by, (byte)3, (byte)4);
        }
        this.void_a((int)by5, (byte)n, (byte)31, (byte)6);
        this.void_a((int)by5, (byte)n2, (byte)37, (byte)6);
        this.void_a((int)by5, by3, (byte)43, (byte)2);
        if (by2 < 0) {
            by2 = (byte)2;
        }
        this.void_a((int)by5, by2, (byte)45, (byte)2);
        return by5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n, int n2, int n3, byte by) {
        byte by2 = (byte)i.int_a(n3, by, (byte)0, (byte)3);
        int n4 = i.int_a((int)by2, (byte)31, (byte)6);
        int n5 = i.int_a((int)by2, (byte)37, (byte)6);
        int n6 = i.int_a((int)by2, (byte)43, (byte)2);
        int n7 = i.int_a(n3, by, (byte)3, (byte)4);
        if (n4 == n && n5 == n2 && n6 == by) {
            switch (n7) {
                case 4: {
                    return 2;
                }
                case 5: {
                    return 4;
                }
            }
            return n7 << 1;
        }
        switch (n7) {
            case 6: {
                i.c(n, n2, by);
            }
        }
        return n7 << 1;
    }

    private void t(int n, int n2) {
        if (this.var_boolean_j) {
            int n3 = var_int_arr_arr_e[n - 1][n2] != 0 ? -1 : (this.dz = var_int_arr_arr_e[n + 1][n2] != 0 ? 1 : 0);
            if (this.dz == 0) {
                int n4 = this.dz = var_int_arr_arr_e[n][n2 - 1] != 0 ? 2 : 0;
            }
            if (this.dz != 0) {
                this.var_byte_x = (byte)5;
                this.C(13);
                this.dx = n;
                this.dy = n2;
            }
        }
    }

    private int int_f(int n, int n2) {
        byte by = 0;
        boolean bl = true;
        int n3 = 0;
        int n4 = this.dz;
        int n5 = 0;
        block0: while (true) {
            int n6 = 0;
            while (var_int_arr_arr_e[n + n4][n2 - 1] != 0 && (byte)(var_byte_arr_arr_a[n][n2] - 80) >= 0 || var_byte_arr_arr_a[n][n2] == 10 || var_byte_arr_arr_a[n][n2] == 37 || var_byte_arr_arr_a[n][n2] == 34 || var_byte_arr_arr_a[n][n2] == 35) {
                n += n4;
            }
            int n7 = 0;
            while ((byte)(var_byte_arr_arr_a[n + (n3 = n7)][n2] - 80) < 0 && var_byte_arr_arr_a[n + n3][n2] != 10 && var_byte_arr_arr_a[n + n3][n2] != 37 && var_byte_arr_arr_a[n + n3][n2] != 34 && var_byte_arr_arr_a[n + n3][n2] != 35) {
                if (bl) {
                    bl = false;
                    by = this.byte_a(n, n2, (byte)8, (byte)-2, (byte)2, (byte)0);
                    this.void_a((int)by, (byte)5, (byte)28, (byte)3);
                    this.void_a((int)by, (byte)n, (byte)14, (byte)6);
                    this.void_a((int)by, (byte)n2, (byte)20, (byte)6);
                }
                this.void_a(n + n3, n2, (byte)2, by, (byte)0, (byte)3);
                n7 = n3 + n4;
            }
            n3 = Math.abs(n3);
            n5 += n3;
            ++n2;
            while (true) {
                if (var_int_arr_arr_e[n][n2] != 0) continue block0;
                if (n6 >= n3 || (n += n4) < 0 || n == this.var_int_av) {
                    if (n5 > 0) {
                        this.void_a((int)by, (byte)n5, (byte)7, (byte)7);
                    }
                    return n5;
                }
                ++n6;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void u(int var1_1, int var2_2) {
        this.ds = 0;
        var3_3 = 0;
        if (this.dz > 1) {
            v0 = i.var_int_arr_arr_e[var1_1];
            v1 = var2_2 - 1;
        } else {
            v0 = i.var_int_arr_arr_e[var1_1 + this.dz];
            v1 = var2_2;
        }
        var3_3 = v0[v1];
        this.var_byte_w = (byte)i.int_a(var3_3, (byte)2, (byte)0, (byte)3);
        this.void_a((int)this.var_byte_w, (byte)0, (byte)47, (byte)2);
        var4_4 = i.int_a((int)this.var_byte_w, (byte)7, (byte)7);
        var5_5 = 0;
        var6_6 = 0;
        var7_7 = 0;
        var8_8 = 0;
        var9_9 = 0;
        switch (this.dz) {
            case 2: {
                var5_5 = 0;
                var6_6 = var1_1;
                var7_7 = var2_2;
                var8_8 = var4_4;
                var9_9 = var2_2 - 1;
                this.dy = -1;
                this.dx = -1;
                break;
            }
            default: {
                var5_5 = this.dz;
                var6_6 = var1_1 + var5_5;
                var5_5 = var5_5 < 0 ? 1 : 2;
                var7_7 = var2_2 + 1;
                var8_8 = var4_4 - this.int_f(var6_6, var7_7);
                var9_9 = var2_2;
                this.dx = var1_1;
                this.dy = var2_2;
            }
        }
        this.void_a((int)this.var_byte_w, (byte)var5_5, (byte)45, (byte)2);
        this.dA = var7_7;
        this.byte_a((byte)var8_8, (byte)var6_6, (byte)var9_9, (byte)var5_5);
        var10_10 = this.byte_b(var6_6, var9_9);
        this.void_a(var10_10, (byte)2, (byte)0, (byte)4);
        this.var_byte_x = 1;
        switch (this.dz) {
            case 2: {
                v2 = this;
                v3 = var6_6;
                v4 = var2_2;
                v5 = 3;
                v6 = 0;
                v7 = 0;
                ** GOTO lbl67
            }
            case 1: {
                v2 = this;
                v3 = var6_6 - 1;
                v4 = var2_2;
                v5 = 14;
                v6 = -1;
                ** GOTO lbl66
            }
            case -1: {
                v2 = this;
                v3 = var6_6 + 1;
                v4 = var2_2;
                v5 = 11;
                v6 = 1;
lbl66:
                // 2 sources

                v7 = 2;
lbl67:
                // 2 sources

                var10_10 = v2.byte_a(v3, v4, v5, v6, v7, var10_10);
            }
        }
        this.void_a((int)var10_10, (byte)6, (byte)28, (byte)3);
        this.dz = 0;
    }

    private void v(int n, int n2) {
        byte by = this.byte_a(n, n2, (byte)2);
        if (by > 0) {
            i.var_byte_arr_arr_a[n][n2] = -1;
            this.s(n, n2);
        }
    }

    private static int b(a a2, int n) {
        int n2 = (n << 2) + 3;
        return a2.var_byte_arr_c[n2] & 0xFF;
    }

    private static int c(a a2, int n) {
        int n2 = (n << 2) + 2;
        return a2.var_byte_arr_c[n2] & 0xFF;
    }

    private static void A(int n) {
        try {
            var_a_a = n <= 5 ? i.a_a("/tips.f", n) : null;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i.byte_arr_a("/tipst.f", 0));
            int n2 = byteArrayInputStream.read();
            byte[] byArray = new byte[(n2 + 1) * 2];
            byteArrayInputStream.read(byArray);
            int n3 = i.a(byArray, (n %= n2) << 1);
            int n4 = i.a(byArray, n + 1 << 1);
            byteArrayInputStream.skip(n3);
            var_byte_arr_f = new byte[n4 - n3];
            byteArrayInputStream.read(var_byte_arr_f);
            byteArrayInputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void cr() {
        i.var_a_arr_a[41].var_int_e = 5;
        int n = 0;
        ++n;
        int n2 = var_byte_arr_f[0];
        this.var_boolean_Q = false;
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        graphics.setColor(798521);
        graphics.fillRoundRect(20, 60, 200, 200, 8, 8);
        graphics.setColor(13540096);
        graphics.drawRoundRect(20, 60, 200, 200, 8, 8);
        int n3 = 0;
        boolean bl = true;
        for (int j = 0; j <= n2; ++j) {
            block9: {
                int n4;
                int n5;
                block8: {
                    int n6;
                    block7: {
                        byte by;
                        if (j == n2) {
                            if (bl) {
                                bl = false;
                                j = -1;
                                n = 1;
                                n3 -= 4;
                                n3 = 60 + (200 - n3 >> 1);
                                continue;
                            }
                            return;
                        }
                        if ((by = var_byte_arr_f[n++]) != 0) break block7;
                        n += 2;
                        n6 = i.a(var_byte_arr_f, n += 2);
                        int n7 = n += 2;
                        n += n6;
                        byte by2 = var_byte_arr_f[n++];
                        int n8 = n;
                        n += by2;
                        n5 = n3 -= 3;
                        n4 = this.a(graphics, var_byte_arr_f, var_a_arr_a[41], n7, n6, bl ? -1 : n3, var_a_a, n8, 192);
                        break block8;
                    }
                    n += 2;
                    n += 2;
                    n6 = var_byte_arr_f[n++] & 0xFF;
                    if (var_a_a == null) break block9;
                    if (!bl) {
                        var_a_a.a(graphics, n6, (240 - i.var_a_a.var_byte_arr_c[(n6 << 2) + 2] & 0xFF) >> 1, n3, 0, 0, 0);
                    }
                    n5 = n3;
                    n4 = i.var_a_a.var_byte_arr_c[(n6 << 2) + 3] & 0xFF;
                }
                n3 = n5 + n4;
            }
            n3 += 4;
        }
    }

    private static void a(Graphics graphics, a a2, String string, int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        int n7;
        int n8;
        block12: {
            int n9;
            int n10;
            block11: {
                block10: {
                    block9: {
                        int n11;
                        int n12;
                        block8: {
                            block7: {
                                a2.var_int_e = n4;
                                if (string.endsWith("\n")) {
                                    string = string.substring(0, string.length() - 1);
                                }
                                string = i.java_lang_String_a(string, 230);
                                n8 = i.a(a2, string, bl ? -1 : 0);
                                n7 = a2.int_a(string);
                                n6 = n;
                                n5 = n2;
                                if ((n3 & 0x20) == 0) break block7;
                                n12 = n5;
                                n11 = n7;
                                break block8;
                            }
                            if ((n3 & 2) == 0) break block9;
                            n12 = n5;
                            n11 = n7 >> 1;
                        }
                        n5 = n12 - n11;
                    }
                    if ((n3 & 8) == 0) break block10;
                    n10 = n6;
                    n9 = n8;
                    break block11;
                }
                if ((n3 & 1) == 0) break block12;
                n10 = n6;
                n9 = n8 >> 1;
            }
            n6 = n10 - n9;
        }
        graphics.setColor(798521);
        graphics.fillRoundRect(n6 - 5, n5 - 5, n8 + 10, n7 + 10, 10, 10);
        graphics.setColor(13540096);
        graphics.drawRoundRect(n6 - 5, n5 - 5, n8 + 10, n7 + 10, 10, 10);
        a2.b(graphics, string, n, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(Graphics graphics, byte[] byArray, a a2, int n, int n2, int n3, a a3, int n4, int n5) {
        int n6 = 0;
        int n7 = a2.var_int_e + (a2.var_byte_arr_a[1] & 0xFF);
        int n8 = 0;
        int n9 = n3 -= a2.var_byte_arr_d[2];
        boolean bl = n3 != -1;
        int n10 = a2.var_int_b;
        int n11 = n;
        boolean bl2 = true;
        int n12 = n;
        int n13 = 0;
        int n14 = n;
        while (true) {
            block17: {
                int n15;
                int n16;
                block23: {
                    int n17;
                    int n18;
                    int n19;
                    byte[] byArray2;
                    int n20;
                    int n21;
                    block21: {
                        block24: {
                            block22: {
                                block19: {
                                    block20: {
                                        block18: {
                                            block16: {
                                                if (n14 > n + n2) {
                                                    a2.var_int_b = n10;
                                                    return n9 - n3;
                                                }
                                                n21 = 10;
                                                if (n14 < n + n2) {
                                                    n21 = byArray[n14] & 0xFF;
                                                }
                                                if (!bl2 || n8 <= n5) break block16;
                                                n8 = n13;
                                                byArray[n12] = 10;
                                                n14 = n12 - 1;
                                                break block17;
                                            }
                                            if (n21 != 10) break block18;
                                            if (bl2 && bl) {
                                                n8 = 120 - (n8 >> 1);
                                                n14 = n11 - 1;
                                                n6 = 0;
                                            } else {
                                                n8 = 0;
                                                n11 = n14 + 1;
                                                n9 += n7;
                                                n7 = a2.var_int_e + (a2.var_byte_arr_a[1] & 0xFF);
                                            }
                                            if (bl) {
                                                bl2 = !bl2;
                                            }
                                            break block17;
                                        }
                                        if (n21 <= 32) break block19;
                                        if (n21 != 64 || a3 == null) break block20;
                                        if (!bl2 && bl) {
                                            a3.a(graphics, byArray[n6 + n4], n8, n9, 0, 0, 0);
                                        }
                                        n8 += i.c(a3, byArray[n6 + n4]);
                                        n20 = i.b(a3, (int)byArray[n6 + n4]);
                                        if (n20 > n7) {
                                            n7 = n20;
                                        }
                                        ++n6;
                                        break block17;
                                    }
                                    byArray2 = a.h;
                                    n19 = n21;
                                    break block21;
                                }
                                if (n21 != 32) break block22;
                                n12 = n14;
                                n13 = n8;
                                n16 = n8;
                                n15 = a2.var_byte_arr_a[0] & 0xFF;
                                break block23;
                            }
                            if (n21 != 1) break block24;
                            a2.var_int_b = byArray[++n14];
                            break block17;
                        }
                        if (n21 != 2) break block17;
                        byArray2 = byArray;
                        n19 = ++n14;
                    }
                    n21 = byArray2[n19] & 0xFF;
                    if (n21 >= a2.b(0)) {
                        n20 = n21 - a2.b(0);
                        if (!bl2 && bl) {
                            a2.a(graphics, n20, n8, n9, 0, 0, 0);
                        }
                        n16 = n8;
                        n18 = a2.var_byte_arr_c[(n20 << 2) + 2] & 0xFF;
                        n17 = a2.var_byte_arr_c[n20 << 2] & 0xFF;
                    } else {
                        n20 = (a2.var_byte_arr_d[n21 << 2] & 0xFF) << 1;
                        if (!bl2 && bl) {
                            a2.a(graphics, 0, n21, n8, n9, 0);
                        }
                        n16 = n8;
                        n18 = a2.var_byte_arr_a[n20] & 0xFF;
                        n17 = a2.var_byte_arr_d[(n21 << 2) + 1];
                    }
                    n15 = n18 - n17;
                }
                n8 = n16 + (n15 + a2.var_byte_arr_d[1]);
            }
            ++n14;
        }
    }

    private void cs() {
        this.var_boolean_G = false;
        i.a(var_a_arr_a[23], true);
        i.var_a_arr_a[23] = null;
        i.a(var_a_arr_a[24], true);
        i.var_a_arr_a[24] = null;
        i.a(var_a_arr_a[25], true);
        i.var_a_arr_a[25] = null;
        i.a(var_a_arr_a[26], true);
        i.var_a_arr_a[26] = null;
        i.a(var_a_arr_a[17], true);
        i.var_a_arr_a[17] = null;
        this.var_int_arr_c = null;
        var_javax_microedition_lcdui_Image_g = null;
        var_javax_microedition_lcdui_Graphics_c = null;
        System.gc();
    }

    private void ct() {
        this.void_g();
        this.var_boolean_av = true;
        this.var_boolean_aw = true;
        this.var_boolean_ao = true;
        var_byte_l = (byte)21;
        this.bs = 0;
        this.br = 14;
        this.dM = 100;
        if (this.var_int_aq > this.int_b(this.var_int_ap)) {
            this.var_int_aq = this.int_b(this.var_int_ap);
        }
        this.cu();
    }

    private void cu() {
        var_long_arr_arr_a = new long[12][12];
        this.var_int_arr_c = new int[20];
    }

    private static int a(long l, byte by, byte by2) {
        l >>>= by;
        return (int)(l &= -1L << by2 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private void a(int n, int n2, int n3, byte by, byte by2) {
        long l = var_long_arr_arr_a[n][n2];
        long l2 = i.a(l, by, by2);
        l ^= (l2 <<= by);
        long l3 = n3;
        i.var_long_arr_arr_a[n][n2] = l |= (l3 <<= by);
    }

    private void cv() {
        if (this.var_boolean_av) {
            var_javax_microedition_lcdui_Image_g = Image.createImage((int)186, (int)226);
        }
        if (this.var_boolean_aw) {
            this.var_boolean_aw = false;
            this.var_boolean_ax = true;
            this.cB();
            this.cA();
        }
        if (this.var_boolean_ax) {
            this.var_javax_microedition_lcdui_Graphics_a.drawImage(var_javax_microedition_lcdui_Image_g, 27, 56, 0);
            this.cC();
            this.cz();
            this.cw();
            this.cx();
        }
        if (this.var_boolean_ax && this.dX == this.dZ && this.dY == this.ea) {
            this.var_boolean_ax = false;
        }
    }

    private void cw() {
        int n;
        StringBuffer stringBuffer;
        Graphics graphics;
        a a2;
        long l = var_long_arr_arr_a[this.dX][this.dY];
        int n2 = i.a(l, (byte)6, (byte)5);
        if (n2 < this.dM) {
            a2 = var_a_arr_a[41];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            stringBuffer = new StringBuffer().append(var_java_lang_StringBuffer_a.toString());
            n = n2;
        } else {
            a2 = var_a_arr_a[41];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            stringBuffer = new StringBuffer().append(var_java_lang_StringBuffer_b.toString());
            n = n2 - this.dM;
        }
        a2.a(graphics, stringBuffer.append(n + 1).toString(), 8, 45, 6);
    }

    private void cx() {
        int n;
        if (this.dX != this.dZ || this.dY != this.ea) {
            return;
        }
        long l = var_long_arr_arr_a[this.dX][this.dY];
        int n2 = i.a(l, (byte)6, (byte)5);
        int n3 = 0;
        n3 = this.int_b(this.var_int_ap, n2);
        if (n3 > (n = this.int_c(this.var_int_ap, n2))) {
            n3 = n;
        }
        var_java_lang_StringBuffer_c.delete(0, var_java_lang_StringBuffer_c.length());
        var_java_lang_StringBuffer_c.append(n3);
        var_java_lang_StringBuffer_c.append('/');
        var_java_lang_StringBuffer_c.append(n);
        var_a_arr_a[41].void_a(var_java_lang_StringBuffer_c.toString());
        int n4 = a.var_int_c + 6 + 14;
        int n5 = 37 + this.dX * 13 + 6;
        int n6 = 73 + this.dY * 13 + 6;
        int n7 = n5 - (n4 >> 1) + 0;
        int n8 = n6 - 17 + -31;
        if (n8 <= 63) {
            n8 = 63;
            n7 = n5 + 20;
            if (n7 + n4 >= 200) {
                n7 = n5 - n4 + -20;
            }
        }
        if (n7 <= 35) {
            n7 = 35;
        }
        if (n7 + n4 >= 200) {
            n7 = 150;
        }
        i.a(this.var_javax_microedition_lcdui_Graphics_a, n7, n8, n4, 17, 37042, 0);
        var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_StringBuffer_c.toString(), n7 + 2, n8 + 2 - 1, 20);
        if (var_a_arr_a[17] != null) {
            var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 10, n7 + n4 - 2 - 14, n8 + 2 - 1, 0, 0, 0);
        }
    }

    private void cy() {
        this.en = 0;
        this.ek = 0;
        this.el = 0;
        this.var_boolean_as = false;
        this.var_boolean_ar = true;
        this.var_boolean_aq = false;
        this.em = 2;
        this.eo = 2;
        this.var_boolean_at = false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_g() {
        block32: {
            block31: {
                var1_1 = false;
                var2_2 = this.ek >> 1;
                if (this.em < 0) {
                    v0 = this;
                    v1 = 2;
                } else {
                    v2 = this;
                    v0 = v2;
                    v1 = v0.em = v2.em - 1;
                }
                if (this.dZ == 0 && this.ea == 0) {
                    this.dZ = this.dX;
                    this.ea = this.dY;
                }
                if (this.em == 0) {
                    if (this.el == var2_2) {
                        v3 = true;
                    } else {
                        ++this.el;
                        v3 = false;
                    }
                    var1_1 = v3;
                }
                var3_3 = i.var_long_arr_arr_a[this.dX][this.dY];
                var5_4 = i.a(var3_3, (byte)3, (byte)3);
                var6_5 = i.var_long_arr_arr_a[this.dZ][this.ea];
                var8_6 = i.a(var6_5, (byte)3, (byte)3);
                var9_7 = 0;
                var10_8 = 0;
                var10_8 = var5_4 == 1 || var8_6 == 1 ? 1 : var5_4;
                switch (var10_8) {
                    case 0: {
                        v4 = 2;
                        ** GOTO lbl33
                    }
                    case 1: {
                        v4 = 8;
lbl33:
                        // 2 sources

                        var9_7 = v4;
                    }
                }
                var11_9 = 0;
                var12_10 = this.var_boolean_at != false ? var2_2 - 1 : 0;
                v5 = var13_11 = this.var_boolean_at != false ? -1 : 1;
                while (var11_9 < this.el) {
                    var14_12 = var12_10 * 2;
                    i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, var9_7, this.var_int_arr_c[var14_12], this.var_int_arr_c[var14_12 + 1], 0, 0, 0);
                    ++var11_9;
                    var12_10 += var13_11;
                }
                var14_12 = 0;
                var15_13 = 0;
                switch (var5_4) {
                    case 0: {
                        var15_13 = 0;
                        v6 = 0;
                        ** GOTO lbl53
                    }
                    case 1: {
                        var15_13 = 2;
                        v6 = 9;
lbl53:
                        // 2 sources

                        var14_12 = v6;
                    }
                }
                var16_14 = this.dX * 13 + var15_13 + 37;
                var17_15 = this.dY * 13 + var15_13 + 73;
                i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, var14_12, var16_14, var17_15, 0, 0, 0);
                var18_16 = this.var_boolean_ap != false ? 7 : 6;
                i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, var18_16, var16_14 + 6, var17_15 + 6, 0, 0, 0);
                var19_17 = true;
                if (var11_9 == var2_2) {
                    if (this.eo < 0) {
                        v7 = this;
                        v8 = 2;
                    } else {
                        v9 = this;
                        v7 = v9;
                        v8 = v7.eo = v9.eo - 1;
                    }
                    if (this.eo == 0) {
                        this.eo = 1;
                        var19_17 = false;
                    }
                }
                if (var19_17) break block31;
                switch (var8_6) {
                    case 0: {
                        var15_13 = 0;
                        v10 = 0;
                        ** GOTO lbl80
                    }
                    case 1: {
                        var15_13 = 2;
                        v10 = 9;
lbl80:
                        // 2 sources

                        var14_12 = v10;
                    }
                }
                break block32;
            }
            switch (var8_6) {
                case 0: {
                    var15_13 = 0;
                    v11 = 1;
                    ** GOTO lbl91
                }
                case 1: {
                    var15_13 = 2;
                    v11 = 5;
lbl91:
                    // 2 sources

                    var14_12 = v11;
                }
            }
        }
        var16_14 = this.dZ * 13 + var15_13 + 37;
        var17_15 = this.ea * 13 + var15_13 + 73;
        i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, var14_12, var16_14, var17_15, 0, 0, 0);
        if (!var19_17) {
            if (this.en == i.var_a_arr_a[9].int_a(0)) {
                --this.en;
                this.var_boolean_as = true;
                v12 = true;
            } else {
                v12 = var1_1 = false;
            }
            if (!this.var_boolean_O) {
                i.var_a_arr_a[9].a(this.var_javax_microedition_lcdui_Graphics_a, this.en, var16_14, var17_15, 0, 0, 0);
            }
            ++this.en;
        }
        return var1_1;
    }

    private void cz() {
        int n = 37 + this.dX * 13 + 6;
        int n2 = 73 + this.dY * 13 + 6;
        if (this.dX != this.dZ || this.dY != this.ea) {
            int n3 = 37 + this.dZ * 13 + 6;
            int n4 = 73 + this.ea * 13 + 6;
            if ((this.byte_a(this.var_int_ap, this.var_int_aq + 1) & 2) != 0 && this.var_int_aq + 1 == eb || this.var_int_aq == eb) {
                this.var_boolean_aq = true;
            }
            if (!this.var_boolean_aq) {
                this.var_boolean_aq = this.boolean_g();
                if (this.var_boolean_aq) {
                    this.var_boolean_aw = true;
                    return;
                }
            } else {
                boolean bl = this.c(n, n2, n3, n4);
                if (bl) {
                    this.dX = this.dZ;
                    this.dY = this.ea;
                    return;
                }
            }
        } else if (this.var_boolean_ax) {
            int n5 = this.var_boolean_ap ? 7 : 6;
            var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, n5, n, n2, 0, 0, 0);
        }
    }

    private boolean c(int n, int n2, int n3, int n4) {
        block9: {
            block10: {
                int n5;
                block8: {
                    if (this.var_boolean_ao) {
                        this.var_boolean_ao = false;
                        this.dO = n;
                        this.dP = n2;
                        this.dQ = 0;
                        this.dR = n3 - n;
                        this.dS = n4 - n2;
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
                    this.var_boolean_ap = this.dV <= 0;
                    int n6 = n5 = this.var_boolean_ap ? 7 : 6;
                    if (this.dS > this.dR) break block8;
                    this.dT = 2 * this.dR;
                    this.dU = 2 * this.dS;
                    if (this.dV < 0 && this.dO <= n3 || this.dV > 0 && this.dO >= n3) {
                        n3 = 37 + this.dZ * 13 + 6;
                        n4 = 73 + this.ea * 13 + 6;
                        var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, n5, n3, n4, 0, 0, 0);
                        this.var_boolean_ao = true;
                        return true;
                    }
                    var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, n5, this.dO, this.dP, 0, 0, 0);
                    this.dO += this.dV;
                    this.dQ += this.dU;
                    if (this.dQ <= this.dR) break block9;
                    this.dP += this.dW;
                    break block10;
                }
                this.dT = 2 * this.dS;
                this.dU = 2 * this.dR;
                if (this.dW < 0 && this.dP <= n4 || this.dW > 0 && this.dP >= n4) {
                    n3 = 37 + this.dZ * 13 + 6;
                    n4 = 73 + this.ea * 13 + 6;
                    var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, n5, n3, n4, 0, 0, 0);
                    this.var_boolean_ao = true;
                    return true;
                }
                var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, n5, this.dO, this.dP, 0, 0, 0);
                this.dP += this.dW;
                this.dQ += this.dU;
                if (this.dQ <= this.dS) break block9;
                this.dO += this.dV;
            }
            this.dQ -= this.dT;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, int var2_2, long var3_3, int var5_4, int var6_5) {
        var7_6 = i.a(var3_3, (byte)6, (byte)5);
        this.dN |= 1 << var7_6;
        var8_7 = i.a(var3_3, (byte)11, (byte)3);
        var9_8 = 14;
        var10_9 = 0;
        while (var10_9 < var8_7) {
            block24: {
                block27: {
                    block26: {
                        block25: {
                            var11_10 = 37 + var1_1 * 13;
                            var12_11 = 73 + var2_2 * 13;
                            var13_12 = i.a(var3_3, (byte)var9_8, (byte)4);
                            var14_13 = i.a(var3_3, (byte)(var9_8 += 4), (byte)4);
                            var15_14 = var13_12;
                            var16_15 = var14_13;
                            var17_16 = i.var_long_arr_arr_a[var15_14][var16_15];
                            var19_17 = i.a(var17_16, (byte)6, (byte)5);
                            var20_18 = this.dN;
                            if ((var20_18 &= 1 << var19_17) > 0) break block24;
                            var15_14 = 37 + var15_14 * 13;
                            var16_15 = 73 + var16_15 * 13;
                            this.ec = var11_10 += 6;
                            this.ed = var12_11 += 6;
                            this.ee = 0;
                            this.ef = (var15_14 += 6) - var11_10;
                            this.eg = (var16_15 += 6) - var12_11;
                            this.eh = 0;
                            this.ei = 0;
                            this.ej = 1;
                            var21_19 = 1;
                            var22_20 = 1;
                            if (this.ef < 0) {
                                var21_19 = -1;
                                this.ef = -this.ef;
                            }
                            if (this.eg < 0) {
                                var22_20 = -1;
                                this.eg = -this.eg;
                            }
                            var23_21 = 0;
                            var24_22 = i.a(var17_16, (byte)0, (byte)3);
                            var25_23 = i.a(var17_16, (byte)3, (byte)3);
                            if (var5_4 == 1) {
                                var25_23 = var5_4;
                            }
                            if (var6_5 != 1) break block25;
                            if (var25_23 == 1) break block24;
                            var24_22 = var6_5;
                        }
                        if (!this.var_boolean_as && var19_17 == i.eb) {
                            var24_22 = 1;
                        }
                        if (var24_22 != 0) break block26;
                        switch (var25_23) {
                            case 0: {
                                v0 = 2;
                                ** GOTO lbl53
                            }
                            case 1: {
                                v0 = 8;
lbl53:
                                // 2 sources

                                var23_21 = v0;
                            }
                        }
                        break block27;
                    }
                    switch (var25_23) {
                        case 0: {
                            v1 = 3;
                            break;
                        }
                        case 1: {
                            v1 = var23_21 = 4;
                        }
                    }
                }
                if (this.eg <= this.ef) {
                    this.eh = this.ef << 1;
                    this.ei = this.eg << 1;
                    while (true) {
                        if (this.ej % 8 == 0) {
                            i.var_a_arr_a[17].a(i.var_javax_microedition_lcdui_Graphics_c, var23_21, this.ec - 27, this.ed - 56, 0, 0, 0);
                            if (this.var_boolean_ar) {
                                this.w(var7_6, var19_17);
                            }
                        }
                        if (this.ec != var15_14) {
                            this.ec += var21_19;
                            this.ee += this.ei;
                            if (this.ee > this.ef) {
                                this.ed += var22_20;
                                this.ee -= this.eh;
                            }
                            ++this.ej;
                            continue;
                        }
                        break;
                    }
                } else {
                    this.eh = 2 * this.eg;
                    this.ei = 2 * this.ef;
                    while (true) {
                        if (this.ej % 8 == 0) {
                            i.var_a_arr_a[17].a(i.var_javax_microedition_lcdui_Graphics_c, var23_21, this.ec - 27, this.ed - 56, 0, 0, 0);
                            if (this.var_boolean_ar) {
                                this.w(var7_6, var19_17);
                            }
                        }
                        if (this.ed == var16_15) break;
                        this.ed += var22_20;
                        this.ee += this.ei;
                        if (this.ee > this.eg) {
                            this.ec += var21_19;
                            this.ee -= this.eh;
                        }
                        ++this.ej;
                    }
                }
            }
            ++var10_9;
            var9_8 += 4;
        }
    }

    private void w(int n, int n2) {
        block6: {
            block7: {
                i i2;
                block5: {
                    if (this.var_boolean_au) break block5;
                    long l = var_long_arr_arr_a[this.cx][this.cy];
                    int n3 = i.a(l, (byte)6, (byte)5);
                    if ((n2 != eb || n != n3) && (n != eb || n2 != n3)) break block6;
                    if (n == eb && n2 == n3) {
                        this.var_boolean_at = true;
                    }
                    i2 = this;
                    break block7;
                }
                if ((n2 != eb || n != eb - 1) && (n != eb || n2 != eb - 1)) break block6;
                if (n == eb && n2 == eb - 1) {
                    this.var_boolean_at = true;
                }
                i2 = this;
            }
            i2.var_int_arr_c[this.ek++] = this.ec;
            this.var_int_arr_c[this.ek++] = this.ed;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cA() {
        this.dN = 0;
        if ((this.byte_a(this.var_int_ap, this.var_int_aq + 1) & 2) != 0 && this.var_int_aq + 1 == i.eb || this.var_int_aq == i.eb) {
            this.var_boolean_ar = false;
            this.var_boolean_as = true;
        }
        for (var1_1 = 0; var1_1 < 12; ++var1_1) {
            for (var2_2 = 0; var2_2 < 12; ++var2_2) {
                block17: {
                    block16: {
                        var3_3 = i.var_long_arr_arr_a[var1_1][var2_2];
                        var5_4 = false;
                        if (var3_3 == 0L) continue;
                        var6_5 = i.a(var3_3, (byte)3, (byte)3);
                        var7_6 = i.a(var3_3, (byte)6, (byte)5);
                        var8_7 = this.var_boolean_as == false && var7_6 == i.eb && var7_6 != 0 ? 1 : i.a(var3_3, (byte)0, (byte)3);
                        var9_8 = -1;
                        var10_9 = -1;
                        var11_10 = -1;
                        if (var8_7 != 0) break block16;
                        var5_4 = this.int_b(this.var_int_ap, var7_6) == this.int_c(this.var_int_ap, var7_6);
                        switch (var6_5) {
                            case 0: {
                                var10_9 = 17;
                                var11_10 = 0;
                                var12_11 = i.a(var3_3, (byte)11, (byte)3);
                                v0 = var12_11 > 2 ? 13 : 0;
                                ** GOTO lbl29
                            }
                            case 1: {
                                var10_9 = 18;
                                var11_10 = 2;
                                v0 = 9;
lbl29:
                                // 2 sources

                                var9_8 = v0;
                            }
                        }
                        break block17;
                    }
                    switch (var6_5) {
                        case 0: {
                            var11_10 = 0;
                            var9_8 = 1;
                        }
                    }
                }
                this.a(var1_1, var2_2, var3_3, var6_5, var8_7);
                if (var11_10 == -1 || var9_8 == -1) continue;
                if (var5_4 && var10_9 != -1) {
                    i.var_a_arr_a[17].a(i.var_javax_microedition_lcdui_Graphics_c, var10_9, var1_1 * 13 + var11_10 + 37 - 27, var2_2 * 13 + var11_10 + 73 - 56, 0, 0, 0);
                }
                i.var_a_arr_a[17].a(i.var_javax_microedition_lcdui_Graphics_c, var9_8, var1_1 * 13 + var11_10 + 37 - 27, var2_2 * 13 + var11_10 + 73 - 56, 0, 0, 0);
                var12_11 = -1;
                switch (this.var_int_ap) {
                    case 0: {
                        if (var7_6 != 8) break;
                        v1 = 52;
                        break;
                    }
                    case 1: {
                        if (var7_6 != 9) break;
                        v1 = 53;
                        break;
                    }
                    case 2: {
                        if (var7_6 != 10) break;
                        v1 = var12_11 = 54;
                    }
                }
                if (var12_11 == -1) continue;
                i.var_a_arr_a[var12_11].a(i.var_javax_microedition_lcdui_Graphics_c, 0, var1_1 * 13 + -8 + 37 - 27, var2_2 * 13 + -8 + 73 - 56, 0, 0, 0);
            }
        }
        this.var_boolean_ar = false;
    }

    /*
     * Unable to fully structure code
     */
    private void cB() {
        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
        var1_1 = 0;
        var2_2 = 0;
        var3_3 = 0;
        var4_4 = -1;
        var5_5 = 0;
        switch (this.var_int_ap) {
            case 0: {
                var1_1 = 939282;
                var2_2 = 3111750;
                var3_3 = 8635434;
                var5_5 = 24;
                v0 = 28;
                ** GOTO lbl28
            }
            case 1: {
                var1_1 = 869201;
                var2_2 = 4022666;
                var3_3 = 5873874;
                var5_5 = 25;
                v0 = 29;
                ** GOTO lbl28
            }
            case 2: {
                var1_1 = 5210510;
                var2_2 = 3711421;
                var3_3 = 7469567;
                var5_5 = 26;
                v0 = 30;
lbl28:
                // 3 sources

                var4_4 = v0;
            }
        }
        this.var_javax_microedition_lcdui_Graphics_a.setColor(var1_1);
        this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 320);
        i.var_a_arr_a[var5_5].a(this.var_javax_microedition_lcdui_Graphics_a, 0, 120, 0, 0, 0, 0);
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_String_arr_a[var4_4], 8, 6, 20);
        i.var_javax_microedition_lcdui_Graphics_c = i.var_javax_microedition_lcdui_Image_g.getGraphics();
        i.var_javax_microedition_lcdui_Graphics_c.setColor(var1_1);
        i.var_javax_microedition_lcdui_Graphics_c.fillRect(0, 0, 186, 226);
        i.var_a_arr_a[23].a(i.var_javax_microedition_lcdui_Graphics_c, 0, 93, 113, 0, 0, 0);
        this.var_javax_microedition_lcdui_Graphics_a.setColor(var2_2);
        this.var_javax_microedition_lcdui_Graphics_a.fillRoundRect(2, 282, 236, 22, 8, 8);
        this.var_javax_microedition_lcdui_Graphics_a.setColor(var3_3);
        this.var_javax_microedition_lcdui_Graphics_a.drawRoundRect(2, 282, 236, 22, 8, 8);
        this.void_a();
        this.void_b();
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_String_arr_a[96], 222, 311, 10);
        if (i.var_a_arr_a[17] != null) {
            i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 12, 11, 284, 0, 0, 0);
            i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 10, 155, 285, 0, 0, 0);
            i.var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 11, 80, 285, 0, 0, 0);
        }
        i.var_java_lang_StringBuffer_c.delete(0, i.var_java_lang_StringBuffer_c.length());
        i.var_java_lang_StringBuffer_c.append(this.var_int_ao);
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_StringBuffer_c.toString(), 39, 285, 20);
        i.var_java_lang_StringBuffer_c.delete(0, i.var_java_lang_StringBuffer_c.length());
        i.var_java_lang_StringBuffer_c.append(i.a(i.var_byte_arr_i, 4));
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_StringBuffer_c.toString(), 100, 285, 20);
        i.var_java_lang_StringBuffer_c.delete(0, i.var_java_lang_StringBuffer_c.length());
        var6_6 = i.a(i.var_byte_arr_i, 6);
        var8_7 = i.var_byte_arr_i[0];
        if (var6_6 >= var8_7) {
            i.var_java_lang_StringBuffer_c.append(var6_6).append("/").append(var6_6);
        } else {
            i.var_java_lang_StringBuffer_c.append(var6_6).append("/").append(var8_7);
        }
        i.var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, i.var_java_lang_StringBuffer_c.toString(), 175, 285, 20);
        this.var_boolean_av = false;
    }

    /*
     * Unable to fully structure code
     */
    private void cC() {
        var1_1 = 0;
        var2_2 = 0;
        switch (this.var_int_ap) {
            case 0: {
                var1_1 = 3111750;
                v0 = 8635434;
                ** GOTO lbl15
            }
            case 1: {
                var1_1 = 4022666;
                v0 = 5873874;
                ** GOTO lbl15
            }
            case 2: {
                var1_1 = 3711421;
                v0 = 7469567;
lbl15:
                // 3 sources

                var2_2 = v0;
            }
        }
        this.var_javax_microedition_lcdui_Graphics_a.setColor(var1_1);
        this.var_javax_microedition_lcdui_Graphics_a.fillRoundRect(2, 34, 236, 22, 8, 8);
        this.var_javax_microedition_lcdui_Graphics_a.setColor(var2_2);
        this.var_javax_microedition_lcdui_Graphics_a.drawRoundRect(2, 34, 236, 22, 8, 8);
    }

    /*
     * Unable to fully structure code
     */
    private void cD() {
        block32: {
            block35: {
                block34: {
                    if (this.dX != this.dZ || this.dY != this.ea) break block32;
                    var1_1 = -1;
                    if (i.boolean_a(4097)) {
                        var1_1 = 2;
                    } else if (i.boolean_a(262146)) {
                        var1_1 = 3;
                    } else if (i.boolean_a(16388)) {
                        var1_1 = 4;
                    } else if (i.boolean_a(65544)) {
                        var1_1 = 1;
                    } else {
                        if (i.boolean_a(32944)) {
                            if (System.currentTimeMillis() - this.var_long_o < 2000L) {
                                return;
                            }
                            var2_2 = i.var_long_arr_arr_a[this.dX][this.dY];
                            var4_4 = i.a(var2_2, (byte)6, (byte)5);
                            this.A();
                            this.cs();
                            System.gc();
                            this.var_int_aq = var4_4;
                            this.t();
                            i.var_int_W = 0;
                            return;
                        }
                        if (i.boolean_a(64)) {
                            this.var_boolean_I = true;
                            this.var_boolean_G = true;
                            this.var_boolean_K = true;
                            this.bs = 0;
                            i.var_byte_l = (byte)28;
                            i.var_int_W = 0;
                            return;
                        }
                    }
                    i.var_int_W = 0;
                    if (var1_1 == -1) break block32;
                    var2_3 = this.dX;
                    var3_6 = this.dY;
                    var4_5 = i.var_long_arr_arr_a[var2_3][var3_6];
                    var6_7 = i.a(var4_5, (byte)11, (byte)3);
                    var7_8 = 14;
                    var8_9 = -1;
                    var9_10 = -1;
                    var10_11 = 0;
                    while (var10_11 < var6_7) {
                        block33: {
                            var11_12 = i.a(var4_5, (byte)var7_8, (byte)4);
                            var13_14 = i.var_long_arr_arr_a[var11_12][var12_13 = i.a(var4_5, (byte)(var7_8 += 4), (byte)4)];
                            var15_17 = i.a(var13_14, (byte)0, (byte)3);
                            if (var15_17 == 1) break block33;
                            switch (var1_1) {
                                case 1: {
                                    if (var11_12 <= var2_3) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 4: {
                                    if (var11_12 >= var2_3) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 2: {
                                    if (var12_13 >= var3_6) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 3: {
                                    if (var12_13 <= var3_6) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
lbl78:
                                    // 4 sources

                                    var8_9 = v0;
                                }
                            }
                        }
                        ++var10_11;
                        var7_8 += 4;
                    }
                    if (var8_9 == -1) break block32;
                    var10_11 = -1;
                    if (var9_10 == -1) break block34;
                    var7_8 = 14 + var8_9 * 2 * 4;
                    var11_12 = i.a(var4_5, (byte)var7_8, (byte)4);
                    var12_13 = i.a(var4_5, (byte)(var7_8 += 4), (byte)4);
                    var7_8 = 14 + var9_10 * 2 * 4;
                    var13_15 = i.a(var4_5, (byte)var7_8, (byte)4);
                    var14_18 = i.a(var4_5, (byte)(var7_8 += 4), (byte)4);
                    switch (var1_1) {
                        case 1: 
                        case 4: {
                            if (var3_6 != var12_13) ** GOTO lbl97
                            v1 = var8_9;
                            ** GOTO lbl108
lbl97:
                            // 1 sources

                            if (var3_6 == var14_18) ** GOTO lbl-1000
                            v1 = Math.abs(var2_3 - var11_12) > Math.abs(var2_3 - var13_15) ? var8_9 : var9_10;
                            ** GOTO lbl108
                        }
                        case 2: 
                        case 3: {
                            if (var2_3 == var11_12) {
                                v1 = var8_9;
                            } else if (var2_3 != var13_15 && var11_12 > var13_15) {
                                v1 = var8_9;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v1 = var9_10;
                            }
lbl108:
                            // 5 sources

                            var10_11 = v1;
                        }
                    }
                    break block35;
                }
                var10_11 = var8_9;
            }
            if (var10_11 != -1) {
                var7_8 = 14 + var10_11 * 2 * 4;
                var11_12 = i.a(var4_5, (byte)var7_8, (byte)4);
                var13_16 = i.var_long_arr_arr_a[var11_12][var12_13 = i.a(var4_5, (byte)(var7_8 += 4), (byte)4)];
                var15_17 = i.a(var13_16, (byte)0, (byte)3);
                if (var15_17 == 0) {
                    this.dZ = var11_12;
                    this.ea = var12_13;
                    this.var_boolean_ax = true;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void B(int var1_1) {
        try {
            switch (var1_1) {
                case 0: {
                    if (this.var_boolean_H) {
                        this.E();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 1: {
                    if (this.var_boolean_I) {
                        this.A();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 2: {
                    if (this.var_boolean_F) {
                        this.k();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 3: {
                    if (this.var_boolean_G) {
                        this.cs();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 4: {
                    i.var_a_arr_a[41].var_int_b = 0;
                    i.var_java_lang_StringBuffer_c.delete(0, i.var_java_lang_StringBuffer_c.length());
                    switch (this.var_int_ap) {
                        case 0: {
                            i.var_java_lang_StringBuffer_c.append("/map_angkor.out");
                            break;
                        }
                        case 1: {
                            i.var_java_lang_StringBuffer_c.append("/map_scotland.out");
                            break;
                        }
                        case 2: {
                            i.var_java_lang_StringBuffer_c.append("/map_tibet.out");
                        }
                    }
                    i.var_long_arr_arr_a = new long[12][12];
                    this.var_int_arr_c = new int[20];
                    this.a(i.var_java_lang_StringBuffer_c.toString());
                    break;
                }
                case 5: {
                    i.var_a_arr_a[17] = i.a_a("/ms.f", 0);
                    i.var_a_arr_a[23] = i.a_a("/ms.f", 1);
                    break;
                }
                case 6: {
                    switch (this.var_int_ap) {
                        case 0: {
                            v0 = i.var_a_arr_a;
                            v1 = 24;
                            v2 = "/ms.f";
                            v3 = 2;
                            ** GOTO lbl66
                        }
                        case 1: {
                            v0 = i.var_a_arr_a;
                            v1 = 25;
                            v2 = "/ms.f";
                            v3 = 3;
                            ** GOTO lbl66
                        }
                        case 2: {
                            v0 = i.var_a_arr_a;
                            v1 = 26;
                            v2 = "/ms.f";
                            v3 = 4;
lbl66:
                            // 3 sources

                            v0[v1] = i.a_a(v2, v3);
                        }
                    }
                    break;
                }
                case 7: {
                    if (i.var_a_arr_a[54] == null) {
                        i.var_a_arr_a[54] = i.a_a("/mmv.f", 1);
                    }
                    this.var_int_v = i.c(i.var_a_arr_a[54], 0) >> 1;
                    this.var_int_w = i.b(i.var_a_arr_a[54], 0) >> 1;
                    break;
                }
                case 8: {
                    if (i.var_a_arr_a[53] == null) {
                        i.var_a_arr_a[53] = i.a_a("/mmv.f", 2);
                        break;
                    }
                    ** GOTO lbl94
                }
                case 9: {
                    if (i.var_a_arr_a[52] == null) {
                        i.var_a_arr_a[52] = i.a_a("/mmv.f", 3);
                        break;
                    }
                    ** GOTO lbl94
                }
                case 10: {
                    if (this.var_boolean_ab) {
                        this.cy();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 14: {
                    if (this.var_boolean_A) {
                        this.var_boolean_A = false;
                    }
                    this.cE();
                    i.var_byte_l = (byte)15;
                }
lbl94:
                // 9 sources

                default: {
                    return;
                }
            }
        }
        catch (Exception v4) {}
    }

    private void a(String string) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream(string);
        int n = inputStream.read();
        n = ((byte)n & 0xFF) + ((byte)inputStream.read() & 0xFF) * 256;
        int n2 = inputStream.read();
        var_byte_arr_f = new byte[n];
        inputStream.read(var_byte_arr_f);
        inputStream.close();
        int n3 = 0;
        for (int j = 0; j < n2; ++j) {
            byte by = var_byte_arr_f[n3++];
            byte by2 = var_byte_arr_f[n3++];
            byte by3 = var_byte_arr_f[n3++];
            int n4 = var_byte_arr_f[n3++];
            if (by3 == 1 && n4 < this.dM) {
                this.dM = n4;
            }
            int n5 = var_byte_arr_f[n3++];
            this.a((int)by, (int)by2, 1, (byte)0, (byte)3);
            this.a((int)by, (int)by2, (int)by3, (byte)3, (byte)3);
            this.a((int)by, (int)by2, n4, (byte)6, (byte)5);
            this.a((int)by, (int)by2, n5, (byte)11, (byte)3);
            byte by4 = 14;
            for (int k = 0; k < n5; ++k) {
                byte by5 = var_byte_arr_f[n3++];
                this.a((int)by, (int)by2, (int)by5, by4, (byte)4);
                by4 = (byte)(by4 + 4);
                byte by6 = var_byte_arr_f[n3++];
                this.a((int)by, (int)by2, (int)by6, by4, (byte)4);
                by4 = (byte)(by4 + 4);
            }
        }
        var_byte_arr_f = null;
        System.gc();
    }

    private void cE() {
        this.dX = -1;
        if (!this.var_boolean_ab) {
            this.var_int_aq = eb;
        }
        this.var_boolean_ab = false;
        for (int j = 0; j < 12; ++j) {
            for (int k = 0; k < 12; ++k) {
                int n;
                int n2;
                int n3;
                i i2;
                long l = var_long_arr_arr_a[j][k];
                if (l == 0L) continue;
                int n4 = i.a(l, (byte)6, (byte)5);
                boolean bl = (this.byte_a(this.var_int_ap, n4) & 0x40) != 0;
                if (bl || n4 == 0) {
                    i2 = this;
                    n3 = j;
                    n2 = k;
                    n = 0;
                } else {
                    i2 = this;
                    n3 = j;
                    n2 = k;
                    n = 1;
                }
                i2.a(n3, n2, n, (byte)0, (byte)3);
                if (n4 == this.var_int_aq) {
                    this.dX = j;
                    this.dY = k;
                }
                if (n4 == eb) {
                    this.dZ = j;
                    this.ea = k;
                }
                this.var_boolean_ap = false;
            }
        }
    }

    private void cF() {
        i.var_a_arr_a[17] = i.a_a("/ms.f", 0);
        this.aO();
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = graphics.getClipX();
        int n9 = graphics.getClipY();
        int n10 = graphics.getClipWidth();
        int n11 = graphics.getClipHeight();
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setClip(n - 3, n2, n3 + 6, n4);
        for (n7 = n2; n7 <= n2 + n4; n7 += 8) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][7], n, n7, 24);
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][5], n + n3, n7, 20);
        }
        graphics.setClip(n, n2 - 3, n3, n4 + 6);
        for (n7 = n; n7 <= n + n3; n7 += 8) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][4], n7, n2, 36);
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][6], n7, n2 + n4, 20);
        }
        graphics.setClip(n - 3, n2 - 3, n3 + 6, n4 + 6);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][0], n, n2, 40);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][1], n + n3, n2, 36);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][2], n, n2 + n4, 24);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][3], n + n3, n2 + n4, 20);
        graphics.setClip(n8, n9, n10, n11);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = graphics.getClipX();
        int n10 = graphics.getClipY();
        int n11 = graphics.getClipWidth();
        int n12 = graphics.getClipHeight();
        i.a(graphics, n, n2, n3, n4, n5, n6);
        i.a(graphics, n + 10, n2 - 3 - n8, n7, n8, n5, n6);
        graphics.setClip(n + 10 - 3, n2 - 3, n7 + 6, 3);
        graphics.setColor(n5);
        graphics.fillRect(n + 10 - 3, n2 - 3, n7 + 6, 3);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][3], n + 10, n2 - 3, 24);
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_arr_b[n6][2], n + 10 + n7, n2 - 3, 20);
        graphics.setClip(n9, n10, n11, n12);
    }

    private void cG() {
        int n;
        int n2;
        int n3;
        int n4;
        String string;
        Graphics graphics;
        a a2;
        if (this.var_int_c == this.ep && !this.var_boolean_aw) {
            return;
        }
        if (this.var_int_c != this.ep) {
            this.var_boolean_aw = true;
        }
        this.var_javax_microedition_lcdui_Graphics_a.setClip(0, 0, 240, 320);
        if (this.var_boolean_aw) {
            this.a(this.var_javax_microedition_lcdui_Graphics_a, true);
            this.var_javax_microedition_lcdui_Graphics_a.setColor(0);
            this.var_javax_microedition_lcdui_Graphics_a.fillRect(0, 0, 240, 15);
            this.var_javax_microedition_lcdui_Graphics_a.setColor(0xFFFFFF);
            this.var_javax_microedition_lcdui_Graphics_a.drawLine(0, 15, 240, 15);
            var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[72], 120, 0, 17);
            i.a(this.var_javax_microedition_lcdui_Graphics_a, 10, 35, 220, 90, 4273165, 0);
            if (this.var_int_d != -1) {
                var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, i.java_lang_String_a(this.var_java_lang_String_a, 200), 120, 280, 17);
            }
            if (this.var_boolean_Z) {
                this.var_boolean_Z = false;
                var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, this.var_java_lang_String_a, 120, 191, 1);
            }
            var_a_arr_a[41].b(this.var_javax_microedition_lcdui_Graphics_a, this.var_java_lang_String_f, 120, 260, 17);
            this.void_a();
            this.void_b();
            this.var_boolean_aw = false;
        }
        if (this.var_int_c != this.ep) {
            this.var_javax_microedition_lcdui_Graphics_a.setColor(4273165);
            this.var_javax_microedition_lcdui_Graphics_a.fillRect(20, 43 + (this.ep >= 0 ? this.ep : this.var_int_c) * 20 + 2, 7, 9);
        }
        var_a_arr_a[17].a(this.var_javax_microedition_lcdui_Graphics_a, 14, 20, 43 + this.var_int_c * 20 + 2, 0, 0, 0);
        i.a(this.var_javax_microedition_lcdui_Graphics_a, 10, 155, 220, 70, 4273165, 0);
        if (this.var_int_d != -1) {
            String string2 = var_java_lang_String_arr_a[74] + " " + this.var_java_lang_StringBuffer_d.toString() + "\n" + var_java_lang_String_arr_a[42];
            i.var_a_arr_a[41].var_int_e = 0;
            a2 = var_a_arr_a[41];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            string = string2;
            n4 = 120;
            n3 = 185;
        } else {
            a2 = var_a_arr_a[41];
            graphics = this.var_javax_microedition_lcdui_Graphics_a;
            string = this.var_java_lang_String_a;
            n4 = 120;
            n3 = 191;
        }
        a2.b(graphics, string, n4, n3, 1);
        int n5 = 0;
        for (int j = 0; j < 4; ++j) {
            n5 = 43 + 20 * j;
            var_a_arr_a[46].a(this.var_javax_microedition_lcdui_Graphics_a, 0 + j, 27, n5, 0, 0, 0);
            var_a_arr_a[41].a(this.var_javax_microedition_lcdui_Graphics_a, var_java_lang_String_arr_a[85 + j], 53, n5, 0);
        }
        Image[] imageArray = i.var_a_arr_a[0].var_javax_microedition_lcdui_Image_arr_arr_a[0];
        int n6 = imageArray[11].getWidth();
        int n7 = imageArray[15].getWidth();
        this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[11], 100, 160, 0);
        for (n2 = 0; n2 < 8; ++n2) {
            n = n2 >= 4 ? 13 : 15;
            this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[n], 100 + n6, 160, 0);
            n6 += n7;
        }
        n2 = this.var_int_c;
        n = n6;
        n6 -= n7 * 4;
        for (int j = 0; j <= n2; ++j) {
            this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[15], 100 + n6, 160, 0);
            n6 += n7;
        }
        this.var_javax_microedition_lcdui_Graphics_a.drawImage(imageArray[17], 100 + n, 160, 0);
        if (this.var_int_c != this.ep) {
            this.ep = this.var_int_c;
        }
    }

    private static void a(int n, int n2, short s) {
        for (int j = 0; j < var_short_arr_arr_a[n].length; j += 2) {
            if (n2 != var_short_arr_arr_a[n][j]) continue;
            i.var_short_arr_arr_a[n][j + 1] = s;
            return;
        }
    }

    private void C(int n) {
        this.var_h_a.b(n);
    }

    /*
     * Unable to fully structure code
     */
    private void cH() {
        switch (this.aM) {
            case 0: {
                this.eq = 0;
                this.er = 0;
                this.aM = 1;
                return;
            }
            case 1: {
                i.var_byte_arr_s = i.byte_arr_a("/cr.f", 0);
                var1_1 = 0;
                while (var1_1 < i.var_byte_arr_s.length) {
                    if (i.var_byte_arr_s[var1_1] == 92 && i.var_byte_arr_s[var1_1 + 1] == 110) {
                        i.var_byte_arr_s[var1_1++] = 10;
                        i.var_byte_arr_s[var1_1++] = 32;
                        continue;
                    }
                    ++var1_1;
                }
                var1_1 = 0;
                while (i.var_byte_arr_s[var1_1] != 36) {
                    ++var1_1;
                }
                var2_3 = 0;
                while (var2_3 < GloftDIRU.var_byte_arr_a.length) {
                    i.var_byte_arr_s[var1_1] = GloftDIRU.var_byte_arr_a[var2_3];
                    ++var2_3;
                    ++var1_1;
                }
                this.aM = 2;
                return;
            }
            case 2: {
                if (!i.boolean_a(4097)) ** GOTO lbl38
                var2_4 = 0;
                if (this.eq < 240) ** GOTO lbl-1000
                this.eq -= 3;
                if (this.eq >= 240) ** GOTO lbl59
                v0 = this;
                v1 = 240;
                ** GOTO lbl58
lbl38:
                // 1 sources

                if (!i.boolean_a(262146)) ** GOTO lbl44
                v2 = this;
                v0 = v2;
                v3 = v2.eq;
                v4 = 3;
                ** GOTO lbl57
lbl44:
                // 1 sources

                if (i.boolean_a(64)) {
                    if (this.var_boolean_g) {
                        this.bs = 0;
                        this.br = 8;
                        i.var_byte_l = (byte)9;
                        this.var_boolean_g = false;
                    } else {
                        this.aM = 3;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v5 = this;
                    v0 = v5;
                    v3 = v5.eq;
                    v4 = 1;
lbl57:
                    // 2 sources

                    v1 = v3 + v4;
lbl58:
                    // 2 sources

                    v0.eq = v1;
                }
lbl59:
                // 4 sources

                var2_4 = -this.eq;
                for (var1_2 = 0; var1_2 < i.var_byte_arr_s.length && var2_4 <= -340; ++var1_2) {
                    if (i.var_byte_arr_s[var1_2] != 10) continue;
                    var2_4 += 17;
                }
                this.er = var1_2;
                if (this.er < i.var_byte_arr_s.length) break;
                this.er = 0;
                this.eq = 0;
                return;
            }
            case 3: {
                i.var_byte_arr_s = null;
                System.gc();
                i.var_byte_l = (byte)4;
                this.aM = 2;
                this.void_a(0);
                this.var_h_a.b(19);
            }
        }
    }

    private void cI() {
        if (this.aM != 2) {
            return;
        }
        Graphics graphics = this.var_javax_microedition_lcdui_Graphics_a;
        graphics.setColor(0, 0, 0);
        graphics.fillRect(0, 0, 240, 320);
        int n = 0;
        int n2 = -17;
        int n3 = this.er;
        int n4 = 0;
        int n5 = n4 = this.eq >= 340 ? -(this.eq % 17) : 340 - this.eq - 17;
        for (int j = this.er; j < var_byte_arr_s.length && n2 < 340; ++j) {
            if (var_byte_arr_s[j] != 10) continue;
            i.var_a_arr_a[41].var_int_b = 0;
            this.a(graphics, var_byte_arr_s, var_a_arr_a[41], n3, j - n3, n2 + n4, null, 0, 234);
            n2 += 17;
            n3 = j + 1;
        }
        n = 0;
        for (int j = 6; j > 0; --j) {
            graphics.setColor(0);
            graphics.fillRect(0, n, 240, j);
            graphics.fillRect(0, 320 - n - j, 240, j);
            n += j + 1;
        }
        this.void_a();
    }

    private void cJ() {
        if (es > 0) {
            es = (int)((long)es - (System.currentTimeMillis() - this.var_long_p));
            this.var_long_p = System.currentTimeMillis();
            if (es <= 0) {
                this.c(true);
            }
        }
    }

    private void a(String string, int n, int n2, int n3, int n4, int n5) {
        this.var_long_p = System.currentTimeMillis();
        es = n3;
        this.et = n;
        this.eu = n2;
        this.var_java_lang_String_g = i.java_lang_String_a(string, 220);
        this.ev = n4;
        this.ew = n5;
    }

    private void c(boolean bl) {
        es = 0;
        if (bl) {
            this.var_boolean_aw = true;
        }
    }

    private static boolean boolean_h() {
        return es > 0;
    }

    private void cK() {
        a a2 = var_a_arr_a[41];
        if (es <= 0) {
            return;
        }
        int n = a2.var_int_e;
        a2.var_int_e = 3;
        a2.void_a(this.var_java_lang_String_g);
        int n2 = a.var_int_d;
        int n3 = a.var_int_c;
        if (this.et == -1) {
            this.et = 240 - n3 >> 1;
        }
        if (this.eu == -1) {
            this.eu = 320 - n2 >> 1;
        }
        this.var_javax_microedition_lcdui_Graphics_a.setClip(this.et - 6, this.eu - 3, n3 + 12, n2 + 6);
        i.a(this.var_javax_microedition_lcdui_Graphics_a, this.et - 6, this.eu - 3, n3 + 12, n2 + 6, this.ev, this.ew);
        a2.b(this.var_javax_microedition_lcdui_Graphics_a, this.var_java_lang_String_g, this.et, this.eu, 0);
        a2.var_int_e = n;
    }

    public static String java_lang_String_a(String string, int n) {
        a a2 = var_a_arr_a[41];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        StringBuffer stringBuffer = new StringBuffer(string);
        for (int j = 0; j <= stringBuffer.length(); ++j) {
            int n6;
            block7: {
                int n7;
                int n8;
                block10: {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    block9: {
                        block8: {
                            block6: {
                                n12 = 10;
                                if (j < stringBuffer.length()) {
                                    n12 = stringBuffer.charAt(j) & 0xFF;
                                }
                                if (n2 > n && n3 != n5) {
                                    n2 = n4;
                                    stringBuffer.setCharAt(n3, '\n');
                                    j = n3 - 1;
                                    n5 = n3;
                                    continue;
                                }
                                if (n12 != 10) break block6;
                                n6 = 0;
                                break block7;
                            }
                            if (n12 <= 32) break block8;
                            if (n12 == 64) {
                                n2 += 14;
                                continue;
                            }
                            break block9;
                        }
                        if (n12 != 32) continue;
                        n3 = j;
                        n4 = n2;
                        n8 = n2;
                        n7 = a2.var_byte_arr_a[0] & 0xFF;
                        break block10;
                    }
                    n12 = a.h[n12] & 0xFF;
                    if (n12 >= a2.b(0)) {
                        n11 = n12 - a2.b(0);
                        n8 = n2;
                        n10 = a2.var_byte_arr_c[(n11 << 2) + 2] & 0xFF;
                        n9 = a2.var_byte_arr_c[n11 << 2] & 0xFF;
                    } else {
                        n11 = (a2.var_byte_arr_d[n12 << 2] & 0xFF) << 1;
                        n8 = n2;
                        n10 = a2.var_byte_arr_a[n11] & 0xFF;
                        n9 = a2.var_byte_arr_d[(n12 << 2) + 1];
                    }
                    n7 = n10 - n9;
                }
                n6 = n8 + (n7 + a2.var_byte_arr_d[1]);
            }
            n2 = n6;
        }
        return stringBuffer.toString();
    }

    private static void cL() {
        if (var_a_arr_a[41] != null) {
            i.var_a_arr_a[41] = null;
            System.gc();
        }
        i.var_a_arr_a[41] = new a();
        byte[] byArray = i.byte_arr_a("/ui.f", 1);
        var_a_arr_a[41].a(byArray, 0);
        var_a_arr_a[41].a(0, 0, -1, -1);
        var_a_arr_a[41].a(1, 0, -1, -1);
        var_a_arr_a[41].a(2, 0, -1, -1);
        i.var_a_arr_a[41].var_byte_arr_g = null;
    }

    static {
        var_boolean_arr_a = new boolean[]{true, false, false};
        var_boolean_arr_b = new boolean[]{false, false, false};
        var_byte_arr_a = new byte[16];
        var_byte_arr_b = new byte[8];
        var_byte_arr_c = new byte[8];
        var_byte_m = var_byte_l = 0;
        var_byte_arr_g = new byte[]{0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0};
        var_byte_arr_h = new byte[]{0, 3, 4, 1, 2, 5, 6};
        var_byte_arr_i = null;
        var_byte_arr_j = null;
        var_c_arr_a = null;
        var_byte_arr_p = null;
        var_boolean_D = false;
        var_javax_microedition_lcdui_Image_d = null;
        var_javax_microedition_lcdui_Graphics_b = null;
        cC = 0;
        cD = 0;
        cE = -1;
        cF = -1;
        cG = -1;
        cH = -1;
        var_javax_microedition_lcdui_Image_e = null;
        cM = 0;
        cN = 0;
        cO = 0;
        var_javax_microedition_lcdui_Image_f = null;
        var_boolean_U = false;
        var_boolean_V = true;
        var_byte_s = 0;
        var_int_arr_b = new int[]{512, 16384, 131072, 131072, 4096};
        dg = 0;
        dh = 0;
        di = 0;
        var_byte_arr_q = new byte[16];
        var_byte_arr_r = new byte[16];
        var_boolean_ak = false;
        var_long_arr_a = new long[15];
        var_long_arr_b = new long[15];
        var_short_arr_arr_a = new short[][]{{0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6}, {0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6}, {0, 28, 1, 29, 2, 30, 3, 31}, {0, 32, 1, 33}, {0, 45, 1, 46}, {0, 33, 1, 50}, {0, 25, 4, 27}, {0, 101, 1, 100}};
        var_int_arr_d = new int[]{28, 29, 30};
        var_int_arr_arr_g = new int[][]{{8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47}};
        var_byte_arr_s = null;
        var_java_lang_String_arr_b = new String[]{"/w0.bin", "/w1.bin", "/w2.bin"};
        es = 0;
    }
}

