
import javax.microedition.lcdui.Displayable;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.rms.RecordStore;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.Canvas;

public final class i extends Canvas implements Runnable {
    private int integer_l;
    private int integer_m;
    private boolean boolean_c;
    private boolean boolean_d;
    private int integer_n;
    private int integer_o;
    private String string_a;
    private boolean boolean_e;
    private int integer_p;
    private int integer_q;
    private int integer_r;
    private int integer_s;
    private int integer_t;
    private String string_b;
    private String string_c;
    private int integer_u;
    private boolean boolean_f;
    private boolean boolean_g;
    private byte byte_c;
    private int integer_v;
    private int integer_w;
    private int integer_x;
    private int integer_y;
    private int integer_z;
    private int integer_A;
    private int integer_B;
    private static boolean[] boolean_arr_a;
    private int integer_C;
    private static boolean[] boolean_arr_b;
    private boolean boolean_h;
    private int integer_D;
    private int integer_E;
    private int integer_F;
    private int integer_G;
    private int integer_H;
    private int integer_I;
    private int integer_J;
    private int integer_K;
    private boolean boolean_i;
    private int integer_L;
    private int integer_M;
    private int integer_N;
    private int integer_O;
    private int integer_P;
    private int integer_Q;
    private int integer_R;
    private int integer_S;
    private boolean boolean_j;
    private boolean boolean_k;
    private int integer_T;
    private int integer_U;
    private int integer_V;
    private int integer_W;
    private int integer_X;
    private int integer_Y;
    private int integer_Z;
    private byte byte_d;
    private byte byte_e;
    private byte byte_f;
    private byte byte_g;
    private byte byte_h;
    private byte byte_i;
    private boolean boolean_l;
    private int integer_aa;
    private int integer_ab;
    private int integer_ac;
    private static byte[] byte_arr_a;
    private static byte[] byte_arr_b;
    private static byte[] byte_arr_c;
    private int integer_ad;
    private int integer_ae;
    private byte byte_j;
    private static boolean boolean_m;
    private int integer_af;
    private int integer_ag;
    private static int integer_ah;
    private boolean boolean_n;
    private boolean boolean_o;
    private int integer_ai;
    private int integer_aj;
    private static byte[] byte_arr_d;
    private byte byte_k;
    private int integer_ak;
    private int integer_al;
    private int integer_am;
    private int integer_an;
    private boolean boolean_p;
    private int integer_ao;
    private int integer_ap;
    private int integer_aq;
    private int integer_ar;
    private int integer_as;
    private int integer_at;
    private boolean boolean_q;
    private boolean boolean_r;
    private boolean boolean_s;
    private boolean boolean_t;
    private int integer_au;
    private int integer_av;
    private static byte[] byte_arr_e;
    private int integer_aw;
    private int integer_ax;
    private int integer_ay;
    public byte byte_a;
    private byte byte_l;
    private int integer_az;
    private int integer_aA;
    private int integer_aB;
    public int integer_a;
    public int integer_b;
    public int integer_c;
    public int integer_d;
    public int integer_e;
    public int integer_f;
    private int integer_aC;
    private int integer_aD;
    private int integer_aE;
    private int integer_aF;
    private int integer_aG;
    private int integer_aH;
    private int integer_aI;
    private int integer_aJ;
    private int integer_aK;
    private int integer_aL;
    private int integer_aM;
    private int integer_aN;
    private int integer_aO;
    private int integer_aP;
    private int integer_aQ;
    public static byte byte_b;
    private int integer_aR;
    private static byte byte_m;
    private boolean boolean_u;
    private static int integer_aS;
    public static int integer_g;
    private long long_a;
    private boolean boolean_v;
    public int integer_h;
    public int integer_i;
    public int integer_j;
    public int integer_k;
    private int integer_aT;
    private boolean boolean_w;
    private int integer_aU;
    private int integer_aV;
    private boolean boolean_x;
    private byte byte_n;
    private int integer_aW;
    private long long_b;
    private int integer_aX;
    private int integer_aY;
    private int integer_aZ;
    private int integer_ba;
    private int integer_bb;
    private int integer_bc;
    private int integer_bd;
    private int integer_be;
    private int integer_bf;
    private byte byte_o;
    private int integer_bg;
    private int integer_bh;
    private int integer_bi;
    private int integer_bj;
    private int integer_bk;
    private int integer_bl;
    private int integer_bm;
    private boolean boolean_y;
    private int integer_bn;
    private boolean boolean_z;
    private int integer_bo;
    private int integer_bp;
    private int integer_bq;
    private int integer_br;
    private int integer_bs;
    private int integer_bt;
    private int integer_bu;
    private int integer_bv;
    private int integer_bw;
    private int integer_bx;
    private int integer_by;
    private int integer_bz;
    private int integer_bA;
    private int integer_bB;
    private int integer_bC;
    private boolean boolean_A;
    private int integer_bD;
    private int integer_bE;
    private int integer_bF;
    private int integer_bG;
    private int integer_bH;
    private int integer_bI;
    private int integer_bJ;
    private int integer_bK;
    private int integer_bL;
    private int integer_bM;
    private int integer_bN;
    private int integer_bO;
    private int integer_bP;
    private int integer_bQ;
    private int integer_bR;
    private int integer_bS;
    private int integer_bT;
    private int integer_bU;
    private int integer_bV;
    private int integer_bW;
    private int integer_bX;
    private int integer_bY;
    private int integer_bZ;
    private int integer_ca;
    private int integer_cb;
    private boolean boolean_B;
    private int integer_cc;
    private int integer_cd;
    private InputStream inputstream_a;
    private byte byte_p;
    private byte byte_q;
    private boolean boolean_C;
    private int integer_ce;
    private int integer_cf;
    private int integer_cg;
    private int integer_ch;
    private Graphics graphics_a;
    private static Image image_image_a;
    private static Image image_image_b;
    private static Image image_image_c;
    private static Image[][] image_arr_arr_b;
    public static Image[][] image_arr_arr_a;
    public static f[] f_arr_a;
    private static h h_b;
    public static h h_a;
    private static f f_a;
    private static byte[] byte_arr_f;
    private static b[] b_arr_a;
    private static f f_b;
    private static byte[] byte_arr_g;
    private static byte[] byte_arr_h;
    private long long_c;
    private long long_d;
    private boolean boolean_D;
    private static byte[] byte_arr_i;
    private static byte[] byte_arr_j;
    public static int[][] integer_arr_arr_a;
    public static int[][] integer_arr_arr_b;
    private static byte[][] byte_arr_arr_a;
    private static byte[][] byte_arr_arr_b;
    private static byte[][] byte_arr_arr_c;
    private static byte[] byte_arr_k;
    private boolean boolean_E;
    private int integer_ci;
    private int integer_cj;
    private int integer_ck;
    private int integer_cl;
    private static byte[] byte_arr_l;
    private static byte[] byte_arr_m;
    private static int integer_cm;
    private static int integer_cn;
    private static byte[] byte_arr_n;
    private static int[][] integer_arr_arr_c;
    private static int[][] integer_arr_arr_d;
    private static byte[][] byte_arr_arr_d;
    private static byte[][] byte_arr_arr_e;
    private static byte[] byte_arr_o;
    public j j_a;// final
    private c c_a;
    private static c[] c_arra_a;
    private static byte[] byte_arr_p;
    private Thread thread_a;
    public static GloftDIRU gloftdiru_a;
    private int integer_co;
    private int integer_cp;
    private int integer_cq;
    private int integer_cr;
    private int integer_cs;
    private static f f_c;
    private int integer_ct;
    private byte byte_r;
    public static boolean boolean_a;
    private static String string_d;
    private long long_e;
    private long long_f;
    private boolean boolean_F;
    private boolean boolean_G;
    private boolean boolean_H;
    private boolean boolean_I;
    private boolean boolean_J;
    private boolean boolean_K;
    private boolean boolean_L;
    private boolean boolean_M;
    private boolean boolean_N;
    private int integer_cu;
    private int integer_cv;
    private int integer_cw;
    private boolean boolean_O;
    private boolean boolean_P;
    private int integer_cx;
    private int integer_cy;
    private boolean boolean_Q;
    private boolean boolean_R;
    private int integer_cz;
    private int integer_cA;
    private boolean boolean_S;
    private boolean boolean_T;
    private int integer_cB;
    private static Image image_image_d;
    private static Graphics graphics_b;
    private static int integer_cC;
    private static int integer_cD;
    private static int integer_cE;
    private static int integer_cF;
    private static int integer_cG;
    private static int integer_cH;
    private int integer_cI;
    private int integer_cJ;
    private int integer_cK;
    private int integer_cL;
    private static Image image_image_e;
    private static int integer_cM;
    private static int integer_cN;
    private static int integer_cO;
    private int integer_cP;
    private int integer_cQ;
    private int integer_cR;
    private int integer_cS;
    private int integer_cT;
    private int integer_cU;
    private int integer_cV;
    private boolean boolean_U;
    private int integer_cW;
    private int integer_cX;
    private int integer_cY;
    private int integer_cZ;
    private int integer_da;
    private int integer_db;
    private long long_g;
    private int integer_dc;
    private static boolean boolean_V;
    private static boolean boolean_W;
    private long long_h;
    private boolean boolean_X;
    private boolean boolean_Y;
    private boolean boolean_Z;
    private boolean boolean_aa;
    private boolean boolean_ab;
    private int integer_dd;
    private int[] integer_arr_a;
    private static byte byte_s;
    private static int[] integer_arr_b;
    private static int integer_de;
    private static int integer_df;
    private static int integer_dg;
    private byte byte_t;
    private byte byte_u;
    private boolean boolean_ac;
    private static byte[] byte_arr_q;
    private static byte[] byte_arr_r;
    private long long_i;
    private boolean boolean_ad;
    private int integer_dh;
    private boolean boolean_ae;
    private long long_j;
    private long long_k;
    private boolean boolean_af;
    private long long_l;
    private boolean boolean_ag;
    private boolean boolean_ah;
    private boolean boolean_ai;
    private boolean boolean_aj;
    private String string_e;
    private int integer_di;
    private int integer_dj;
    private int integer_dk;
    private int integer_dl;
    private static boolean boolean_ak;
    private static int integer_dm;
    private static int integer_dn;
    private static int integer_do;
    private static int integer_dp;
    private boolean boolean_al;
    private int integer_dq;
    private int integer_dr;
    private int integer_ds;
    private byte byte_v;
    private int integer_dt;
    private int integer_du;
    private int integer_dv;
    private int integer_dw;
    private int integer_dx;
    private byte byte_w;
    private int integer_dy;
    private int integer_dz;
    private byte byte_x;
    private byte byte_y;
    private int integer_dA;
    private int integer_dB;
    private int integer_dC;
    private byte byte_z;
    private int integer_dD;
    private int integer_dE;
    private int integer_dF;
    private byte byte_A;
    private int integer_dG;
    private int integer_dH;
    private static f f_d;
    private static int[][] integer_arr_arr_e;
    private static long[] long_arr_a;
    private static long[] long_arr_b;
    private static int[][] integer_arr_arr_f;
    private static long[] long_arr_c;
    private static long[] long_arr_d;
    private static boolean boolean_am;
    private int integer_dI;
    private int integer_dJ;
    private static String string_f;
    private static long[][] long_arr_arr_a;
    private static StringBuffer string_buffer_a;
    private static StringBuffer string_buffer_b;
    private static StringBuffer string_buffer_c;
    private static Image image_image_f;
    private static Graphics graphics_c;
    private int integer_dK;
    private int integer_dL;
    private int integer_dM;
    private int integer_dN;
    private int integer_dO;
    private int integer_dP;
    private int integer_dQ;
    private int integer_dR;
    private int integer_dS;
    private int integer_dT;
    private int integer_dU;
    private boolean boolean_an;
    private boolean boolean_ao;
    private int integer_dV;
    private int integer_dW;
    private int integer_dX;
    private int integer_dY;
    private static int integer_dZ;
    private int integer_ea;
    private int integer_eb;
    private int integer_ec;
    private int integer_ed;
    private int integer_ee;
    private int integer_ef;
    private int integer_eg;
    private int integer_eh;
    private boolean boolean_ap;
    private boolean boolean_aq;
    private boolean boolean_ar;
    private int[] integer_arr_c;
    private int integer_ei;
    private int integer_ej;
    private int integer_ek;
    private int integer_el;
    private int integer_em;
    private boolean boolean_as;
    private boolean boolean_at;
    private boolean boolean_au;
    private long long_m;
    private int integer_en;
    private String string_g;
    private StringBuffer string_buffer_d;
    private boolean boolean_av;
    private boolean boolean_aw;
    private int integer_eo;
    private int integer_ep;
    private static short[][] short_arr_arr_a;
    private static int[] integer_arr_d;
    private static int[][] integer_arr_arr_g;
    private static String[] string_arr_c;
    public static String[] string_arr_a;
    public static String[] string_arr_b;
    public static boolean boolean_b;
    private static byte[] byte_arr_s;
    private static String[] string_arr_d;
    private static int integer_eq;
    private long long_n;
    private String string_h;
    private int integer_er;
    private int integer_es;
    private int integer_et;
    private int integer_eu;
    
    public i(final GloftDIRU gloftdiru_a) {
        this.integer_l = 40;
        this.boolean_c = false;
        this.integer_n = 0;
        this.integer_o = a.integer_arr_a[this.integer_n];
        this.string_a = "";
        this.boolean_e = true;
        this.integer_p = 0;
        this.integer_q = 0;
        this.integer_r = 0;
        this.integer_s = this.integer_q;
        this.integer_t = this.integer_r;
        this.string_b = "";
        this.string_c = "";
        this.integer_u = -1;
        this.boolean_f = false;
        this.boolean_g = true;
        this.integer_c = 0;
        this.integer_v = 0;
        this.integer_w = 0;
        this.integer_x = 0;
        this.integer_y = 0;
        this.integer_z = 0;
        this.integer_A = 0;
        this.integer_B = 0;
        this.integer_C = 0;
        this.boolean_h = false;
        this.integer_D = -1;
        this.integer_E = 10;
        this.integer_F = 10;
        this.integer_G = 0;
        this.integer_H = 0;
        this.integer_I = 0;
        this.integer_J = 0;
        this.integer_K = 0;
        this.boolean_i = false;
        this.integer_L = 0;
        this.integer_M = -1;
        this.integer_N = -1;
        this.integer_O = 0;
        this.integer_P = 0;
        this.integer_Q = 0;
        this.integer_R = 0;
        this.integer_S = 0;
        this.boolean_j = false;
        this.boolean_k = false;
        this.integer_T = 0;
        this.integer_U = 0;
        this.integer_V = 0;
        this.integer_W = 0;
        this.integer_X = 0;
        this.integer_Y = 0;
        this.integer_Z = 0;
        this.integer_d = 1;
        this.integer_e = 1;
        this.integer_f = 3;
        this.integer_g = 3;
        this.integer_h = 2;
        this.integer_i = 0;
        this.boolean_l = false;
        this.integer_ag = 0;
        this.boolean_n = true;
        this.integer_k = 0;
        this.integer_ak = 0;
        this.boolean_q = false;
        this.boolean_r = false;
        this.boolean_s = false;
        this.boolean_t = false;
        this.integer_a = 0;
        this.integer_l = 0;
        this.boolean_u = false;
        this.integer_aY = 0;
        this.integer_ba = 0;
        this.integer_bm = -1;
        this.integer_bD = 0;
        this.integer_bW = 0;
        this.integer_bX = 0;
        this.integer_bY = 0;
        this.integer_bZ = 0;
        this.integer_ca = 0;
        this.integer_cb = 0;
        this.boolean_C = false;
        this.boolean_D = false;
        //this.a = null;
        this.integer_co = -1;
        this.integer_cp = -1;
        this.integer_r = 0;
        this.boolean_F = false;
        this.boolean_G = false;
        this.boolean_H = false;
        this.boolean_I = false;
        this.boolean_J = false;
        this.boolean_K = false;
        this.boolean_L = false;
        this.boolean_M = false;
        this.boolean_N = false;
        this.integer_cu = -1;
        this.boolean_P = false;
        this.boolean_Q = false;
        this.boolean_R = false;
        this.integer_cP = -1;
        this.integer_cQ = -1;
        this.integer_cR = -1;
        this.integer_cS = -1;
        this.integer_cT = -1;
        this.integer_cU = -1;
        this.integer_cV = -1;
        this.boolean_U = true;
        this.integer_da = 3;
        this.integer_db = -1;
        this.long_g = 0L;
        this.integer_dc = -1;
        this.long_h = 0L;
        this.boolean_ab = false;
        this.integer_dd = 0;
        this.integer_arr_a = new int[] { 0, 0, 0, 0, 0 };
        this.boolean_ac = false;
        this.long_i = 0L;
        this.integer_dh = 0;
        this.long_j = 0L;
        this.long_k = 0L;
        this.boolean_af = false;
        this.boolean_aj = false;
        this.integer_di = 0;
        this.boolean_al = true;
        this.integer_dq = -1;
        this.integer_dz = -1;
        this.integer_x = 3;
        this.integer_dK = 100;
        this.boolean_an = true;
        this.boolean_ap = true;
        this.boolean_aq = true;
        this.boolean_ar = true;
        this.integer_ek = 2;
        this.integer_em = 2;
        this.boolean_at = true;
        this.boolean_au = true;
        this.long_m = 0L;
        this.integer_en = -1;
        this.string_buffer_d = new StringBuffer();
        this.boolean_av = true;
        this.boolean_aw = true;
        this.long_n = System.currentTimeMillis();
        this.integer_aD = -1;
        this.integer_aF = -1;
        this.integer_aH = -1;
        i.b_arr_a = new b[6];
        i.f_arr_a = new f[61];
        if (f.byte_arr_e == null) {
            final InputStream resourceAsStream = this.getClass().getResourceAsStream("/mc");
            f.byte_arr_e = new byte[256];
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

    public void paint(Graphics grphcs) {

    }

    public void run() {

    }

    public static void b() {

    }
    
    public void c() {

    }

    public void d() {

    }
}
