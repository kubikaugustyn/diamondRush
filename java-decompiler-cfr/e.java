import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e {
  public static Image[] a;

  public static a a;

  public static a b;

  public static String[] a;

  public static String[] b;

  public static int a;

  public static int b;

  public static int c;

  public boolean a;

  public int d;

  public e() {
    a = new Image[5];
    a = new String[5];
  }

  private static void a(String paramString) {
    if (paramString == null)
      return;
    try {
      i.a.platformRequest(paramString);
      return;
    } catch (Exception exception) {
      return;
    }
  }

  public static void a() {
    // Byte code:
    //   0: getstatic i.a : [La;
    //   3: bipush #41
    //   5: aaload
    //   6: putstatic e.b : La;
    //   9: getstatic e.b : La;
    //   12: iconst_1
    //   13: putfield e : I
    //   16: ldc '/tips.f'
    //   18: iconst_0
    //   19: invokestatic a : (Ljava/lang/String;I)La;
    //   22: putstatic e.a : La;
    //   25: getstatic e.b : [Ljava/lang/String;
    //   28: ifnonnull -> 97
    //   31: iconst_0
    //   32: istore_0
    //   33: ldc '/lang_IGA.f'
    //   35: bipush #15
    //   37: invokestatic a : (Ljava/lang/String;I)[Ljava/lang/String;
    //   40: putstatic e.b : [Ljava/lang/String;
    //   43: getstatic e.b : [Ljava/lang/String;
    //   46: bipush #7
    //   48: getstatic e.b : [Ljava/lang/String;
    //   51: bipush #7
    //   53: aaload
    //   54: sipush #170
    //   57: invokestatic a : (Ljava/lang/String;I)Ljava/lang/String;
    //   60: aastore
    //   61: getstatic e.b : [Ljava/lang/String;
    //   64: bipush #8
    //   66: getstatic e.b : [Ljava/lang/String;
    //   69: bipush #8
    //   71: aaload
    //   72: sipush #170
    //   75: invokestatic a : (Ljava/lang/String;I)Ljava/lang/String;
    //   78: aastore
    //   79: getstatic e.b : [Ljava/lang/String;
    //   82: bipush #9
    //   84: getstatic e.b : [Ljava/lang/String;
    //   87: bipush #9
    //   89: aaload
    //   90: sipush #170
    //   93: invokestatic a : (Ljava/lang/String;I)Ljava/lang/String;
    //   96: aastore
    //   97: bipush #10
    //   99: istore_0
    //   100: iconst_0
    //   101: istore_1
    //   102: iload_0
    //   103: bipush #14
    //   105: if_icmpgt -> 173
    //   108: getstatic e.a : [Ljava/lang/String;
    //   111: iload_1
    //   112: getstatic i.a : LGloftDIRU;
    //   115: getstatic e.b : [Ljava/lang/String;
    //   118: iload_0
    //   119: aaload
    //   120: invokevirtual getAppProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   123: aastore
    //   124: getstatic e.a : [Ljava/lang/String;
    //   127: iload_1
    //   128: aaload
    //   129: ifnull -> 164
    //   132: getstatic e.a : [Ljava/lang/String;
    //   135: iload_1
    //   136: aaload
    //   137: ldc 'no'
    //   139: invokevirtual compareTo : (Ljava/lang/String;)I
    //   142: ifeq -> 158
    //   145: getstatic e.a : [Ljava/lang/String;
    //   148: iload_1
    //   149: aaload
    //   150: ldc ''
    //   152: invokevirtual compareTo : (Ljava/lang/String;)I
    //   155: ifne -> 164
    //   158: getstatic e.a : [Ljava/lang/String;
    //   161: iload_1
    //   162: aconst_null
    //   163: aastore
    //   164: iinc #0, 1
    //   167: iinc #1, 1
    //   170: goto -> 102
    //   173: getstatic e.b : [Ljava/lang/String;
    //   176: iconst_3
    //   177: new java/lang/StringBuffer
    //   180: dup
    //   181: getstatic e.b : [Ljava/lang/String;
    //   184: iconst_3
    //   185: aaload
    //   186: invokespecial <init> : (Ljava/lang/String;)V
    //   189: ldc '\\n'
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   194: getstatic e.b : [Ljava/lang/String;
    //   197: iconst_4
    //   198: aaload
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: ldc '\\n
