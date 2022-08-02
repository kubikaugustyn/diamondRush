import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f {
  private static int[] a = new int[4096];
  
  private byte[] f;
  
  private byte[] g;
  
  private short[] b;
  
  public byte[] a;
  
  private byte[] h;
  
  public byte[] b;
  
  public short[] a;
  
  public byte[] c;
  
  private int[][] a;
  
  private int b;
  
  public int a;
  
  private boolean a;
  
  private short a;
  
  public byte[] d;
  
  private short[] c;
  
  public Image[][] a;
  
  public static byte[] e;
  
  public final void a(byte[] paramArrayOfbyte, int paramInt) {
    try {
      System.gc();
      paramInt++;
      paramInt++;
      paramInt++;
      paramInt++;
      paramInt++;
      paramInt++;
      paramInt++;
      paramInt++;
      short s1;
      if ((s1 = (short)((paramArrayOfbyte[6] & 0xFF) + ((paramArrayOfbyte[7] & 0xFF) << 8))) > 0) {
        this.f = new byte[s1 << 1];
        System.arraycopy(paramArrayOfbyte, 8, this.f, 0, this.f.length);
        paramInt = 8 + this.f.length;
      } 
      short s2;
      if ((s2 = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8))) > 0) {
        this.h = new byte[s2 << 2];
        System.arraycopy(paramArrayOfbyte, paramInt, this.h, 0, this.h.length);
        paramInt += this.h.length;
      } 
      if ((s2 = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8))) > 0) {
        this.g = new byte[s2];
        this.b = new short[s2];
        int k;
        for (k = 0; k < s2; k++) {
          this.g[k] = paramArrayOfbyte[paramInt++];
          paramInt++;
          this.b[k] = (short)((paramArrayOfbyte[++paramInt] & 0xFF) + ((paramArrayOfbyte[++paramInt] & 0xFF) << 8));
        } 
        k = s2 << 2;
        this.a = (Image[][])new byte[k];
        for (s2 = 0; s2 < k; s2++)
          this.a[s2] = paramArrayOfbyte[paramInt++]; 
      } 
      short s3;
      if ((s3 = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8))) > 0) {
        this.c = (short[])new byte[s3 * 5];
        System.arraycopy(paramArrayOfbyte, paramInt, this.c, 0, this.c.length);
        paramInt += this.c.length;
      } 
      if ((s2 = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8))) > 0) {
        this.b = new byte[s2];
        this.a = (Image[][])new short[s2];
        for (s3 = 0; s3 < s2; s3++) {
          this.b[s3] = paramArrayOfbyte[paramInt++];
          paramInt++;
          this.a[s3] = (short)((paramArrayOfbyte[++paramInt] & 0xFF) + ((paramArrayOfbyte[++paramInt] & 0xFF) << 8));
        } 
      } 
      if (s1 <= 0) {
        System.gc();
        return;
      } 
      s3 = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8));
      this.b = paramArrayOfbyte[paramInt++] & 0xFF;
      int i = paramArrayOfbyte[paramInt++] & 0xFF;
      this.a = (Image[][])new int[16][];
      int j;
      for (j = 0; j < this.b; j++) {
        byte b;
        this.a[j] = (Image[])new int[i];
        switch (s3) {
          case -30584:
            for (b = 0; b < i; b++) {
              int k;
              if (((k = (paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 16) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 24)) & 0xFF000000) != -16777216)
                this.a = true; 
              this.a[j][b] = k;
            } 
            break;
          case 17476:
            for (b = 0; b < i; b++) {
              int k;
              if (((k = (paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8)) & 0xF000) != 61440)
                this.a = true; 
              this.a[j][b] = (k & 0xF000) << 16 | (k & 0xF000) << 12 | (k & 0xF00) << 12 | (k & 0xF00) << 8 | (k & 0xF0) << 8 | (k & 0xF0) << 4 | (k & 0xF) << 4 | k & 0xF;
            } 
            break;
          case 21781:
            for (b = 0; b < i; b++) {
              int k = (paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8);
              int m = -16777216;
              if ((k & 0x8000) != 32768) {
                m = 0;
                this.a = true;
              } 
              this.a[j][b] = m | (k & 0x7C00) << 9 | (k & 0x3E0) << 6 | (k & 0x1F) << 3;
            } 
            break;
          case 25861:
            for (b = 0; b < i; b++) {
              int k = (paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8);
              int m = -16777216;
              if (k == 63519) {
                m = 0;
                this.a = true;
              } 
              this.a[j][b] = m | (k & 0xF800) << 8 | (k & 0x7E0) << 5 | (k & 0x1F) << 3;
            } 
            break;
        } 
      } 
      this.a = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8));
      if (s1 > 0) {
        this.c = new short[s1];
        j = 0;
        int k = paramInt;
        byte b;
        for (b = 0; b < s1; b++) {
          short s = (short)((paramArrayOfbyte[k++] & 0xFF) + ((paramArrayOfbyte[k++] & 0xFF) << 8));
          this.c[b] = (short)j;
          k += s;
          j += s;
        } 
        this.d = new byte[j];
        for (b = 0; b < s1; b++) {
          short s = (short)((paramArrayOfbyte[paramInt++] & 0xFF) + ((paramArrayOfbyte[paramInt++] & 0xFF) << 8));
          System.arraycopy(paramArrayOfbyte, paramInt, this.d, this.c[b] & 0xFFFF, s);
          paramInt += s;
        } 
      } 
      System.gc();
      return;
    } catch (Exception exception) {
      null.printStackTrace();
      return;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.f == null)
      return; 
    if (paramInt3 == -1)
      paramInt3 = (this.f.length >> 1) - 1; 
    if (this.a == null)
      this.a = new Image[this.b][]; 
    if (this.a[paramInt1] == null)
      this.a[paramInt1] = new Image[this.f.length >> 1]; 
    Image[][] arrayOfImage = this.a;
    this.a = paramInt1;
    System.gc();
    for (paramInt4 = 0; paramInt4 <= paramInt3; paramInt4++) {
      int i = paramInt4 << 1;
      int j = this.f[i] & 0xFF;
      i = this.f[i + 1] & 0xFF;
      int[] arrayOfInt;
      if (j > 0 && i > 0 && (arrayOfInt = a(paramInt4)) != null) {
        boolean bool = false;
        int k = j * i;
        for (byte b = 0; b < k; b++) {
          if ((arrayOfInt[b] & 0xFF000000) != -16777216) {
            bool = true;
            break;
          } 
        } 
        this.a[paramInt1][paramInt4] = Image.createRGBImage(arrayOfInt, j, i, bool);
      } 
    } 
    System.gc();
    this.a = arrayOfImage;
    System.gc();
  }
  
  public final void a(int paramInt) {
    if (this.f == null)
      return; 
    if (this.a == null)
      return; 
    if (this.a[0] == null)
      return; 
    for (paramInt = 0; paramInt < (this.a[0]).length; paramInt++)
      this.a[0][paramInt] = null; 
    this.a[0] = null;
    this.b--;
  }
  
  public final String toString() {
    int i = 0;
    for (byte b = 0; b < this.f.length / 2; b++)
      i += 2 * (this.f[b * 2] & 0xFF) * (this.f[b * 2 + 1] & 0xFF); 
    return "raw/full: " + this.d.length + "/" + i;
  }
  
  public final int a(int paramInt1, int paramInt2) {
    return this.c[(this.a[paramInt1] + paramInt2) * 5 + 1] & 0xFF;
  }
  
  public final int a(int paramInt) {
    return this.b[paramInt] & 0xFF;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    paramInt1 = (this.a[paramInt1] + paramInt2) * 5;
    paramInt2 = this.c[paramInt1] & 0xFF;
    if ((paramInt5 & 0x20) != 0) {
      paramInt6 = ((paramInt5 & 0x1) != 0) ? (0 + this.c[paramInt1 + 2]) : (0 - this.c[paramInt1 + 2]);
      paramInt7 = ((paramInt5 & 0x2) != 0) ? (0 + this.c[paramInt1 + 3]) : (0 - this.c[paramInt1 + 3]);
    } 
    a(paramGraphics, paramInt2, paramInt3 - paramInt6, paramInt4 - paramInt7, paramInt5 ^ this.c[paramInt1 + 4] & 0xF);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.g[paramInt1] & 0xFF;
    for (byte b = 0; b < i; b++) {
      int i1 = paramInt4;
      int n = paramInt3;
      int m = paramInt2;
      int k = b;
      int j = paramInt1;
      Graphics graphics = paramGraphics;
      f f1;
      j = (f1 = this).b[j] + k << 2;
      k = f1.h[j + 3] & 0xFF;
      int i2 = f1.h[j] & 0xFF;
      m = ((i1 & 0x1) != 0) ? (m - f1.h[j + 1]) : (m + f1.h[j + 1]);
      n = ((i1 & 0x2) != 0) ? (n - f1.h[j + 2]) : (n + f1.h[j + 2]);
      if ((i1 & 0x1) != 0)
        m -= f1.f[i2 << 1] & 0xFF; 
      if ((i1 & 0x2) != 0)
        n -= f1.f[(i2 << 1) + 1] & 0xFF; 
      f1.b(graphics, i2, m, n, i1 ^ k & 0xF);
    } 
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 << 1;
    int j = this.f[i] & 0xFF;
    i = this.f[i + 1] & 0xFF;
    if (j <= 0 || i <= 0)
      return; 
    Image image = null;
    if (this.a != null && this.a[this.a] != null)
      image = this.a[this.a][paramInt1]; 
    if (image == null) {
      int[] arrayOfInt;
      if ((arrayOfInt = a(paramInt1)) == null)
        return; 
      image = Image.createRGBImage(arrayOfInt, j, i, this.a);
    } 
    j = image.getWidth();
    i = image.getHeight();
    paramGraphics.drawRegion(image, 0, 0, j, i, ((paramInt4 & 0x1) != 0) ? (((paramInt4 & 0x2) != 0) ? 3 : 2) : (((paramInt4 & 0x2) != 0) ? 1 : 0), paramInt2, paramInt3, 0);
  }
  
  private int[] a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [B
    //   4: ifnull -> 14
    //   7: aload_0
    //   8: getfield c : [S
    //   11: ifnonnull -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: iload_1
    //   17: iconst_1
    //   18: ishl
    //   19: istore_2
    //   20: aload_0
    //   21: getfield f : [B
    //   24: iload_2
    //   25: baload
    //   26: sipush #255
    //   29: iand
    //   30: istore_3
    //   31: aload_0
    //   32: getfield f : [B
    //   35: iload_2
    //   36: iconst_1
    //   37: iadd
    //   38: baload
    //   39: sipush #255
    //   42: iand
    //   43: istore_2
    //   44: getstatic f.a : [I
    //   47: astore #4
    //   49: aload_0
    //   50: getfield a : [[I
    //   53: aload_0
    //   54: getfield a : I
    //   57: aaload
    //   58: dup
    //   59: astore #5
    //   61: ifnonnull -> 66
    //   64: aconst_null
    //   65: areturn
    //   66: aload_0
    //   67: getfield d : [B
    //   70: astore #6
    //   72: aload_0
    //   73: getfield c : [S
    //   76: iload_1
    //   77: saload
    //   78: ldc 65535
    //   80: iand
    //   81: istore_1
    //   82: iconst_0
    //   83: istore #7
    //   85: iload_3
    //   86: iload_2
    //   87: imul
    //   88: istore_2
    //   89: aload_0
    //   90: getfield a : S
    //   93: sipush #10225
    //   96: if_icmpne -> 178
    //   99: iload #7
    //   101: iload_2
    //   102: if_icmpge -> 655
    //   105: aload #6
    //   107: iload_1
    //   108: iinc #1, 1
    //   111: baload
    //   112: sipush #255
    //   115: iand
    //   116: dup
    //   117: istore_0
    //   118: bipush #127
    //   120: if_icmple -> 163
    //   123: aload #6
    //   125: iload_1
    //   126: iinc #1, 1
    //   129: baload
    //   130: sipush #255
    //   133: iand
    //   134: istore_3
    //   135: aload #5
    //   137: iload_3
    //   138: iaload
    //   139: istore_3
    //   140: iinc #0, -128
    //   143: iload_0
    //   144: dup
    //   145: iconst_1
    //   146: isub
    //   147: istore_0
    //   148: ifle -> 99
    //   151: aload #4
    //   153: iload #7
    //   155: iinc #7, 1
    //   158: iload_3
    //   159: iastore
    //   160: goto -> 143
    //   163: aload #4
    //   165: iload #7
    //   167: iinc #7, 1
    //   170: aload #5
    //   172: iload_0
    //   173: iaload
    //   174: iastore
    //   175: goto -> 99
    //   178: aload_0
    //   179: getfield a : S
    //   182: sipush #5632
    //   185: if_icmpne -> 238
    //   188: iload #7
    //   190: iload_2
    //   191: if_icmpge -> 655
    //   194: aload #4
    //   196: iload #7
    //   198: iinc #7, 1
    //   201: aload #5
    //   203: aload #6
    //   205: iload_1
    //   206: baload
    //   207: iconst_4
    //   208: ishr
    //   209: bipush #15
    //   211: iand
    //   212: iaload
    //   213: iastore
    //   214: aload #4
    //   216: iload #7
    //   218: iinc #7, 1
    //   221: aload #5
    //   223: aload #6
    //   225: iload_1
    //   226: baload
    //   227: bipush #15
    //   229: iand
    //   230: iaload
    //   231: iastore
    //   232: iinc #1, 1
    //   235: goto -> 188
    //   238: aload_0
    //   239: getfield a : S
    //   242: sipush #1024
    //   245: if_icmpne -> 335
    //   248: iload #7
    //   250: iload_2
    //   251: if_icmpge -> 655
    //   254: aload #4
    //   256: iload #7
    //   258: iinc #7, 1
    //   261: aload #5
    //   263: aload #6
    //   265: iload_1
    //   266: baload
    //   267: bipush #6
    //   269: ishr
    //   270: iconst_3
    //   271: iand
    //   272: iaload
    //   273: iastore
    //   274: aload #4
    //   276: iload #7
    //   278: iinc #7, 1
    //   281: aload #5
    //   283: aload #6
    //   285: iload_1
    //   286: baload
    //   287: iconst_4
    //   288: ishr
    //   289: iconst_3
    //   290: iand
    //   291: iaload
    //   292: iastore
    //   293: aload #4
    //   295: iload #7
    //   297: iinc #7, 1
    //   300: aload #5
    //   302: aload #6
    //   304: iload_1
    //   305: baload
    //   306: iconst_2
    //   307: ishr
    //   308: iconst_3
    //   309: iand
    //   310: iaload
    //   311: iastore
    //   312: aload #4
    //   314: iload #7
    //   316: iinc #7, 1
    //   319: aload #5
    //   321: aload #6
    //   323: iload_1
    //   324: baload
    //   325: iconst_3
    //   326: iand
    //   327: iaload
    //   328: iastore
    //   329: iinc #1, 1
    //   332: goto -> 248
    //   335: aload_0
    //   336: getfield a : S
    //   339: sipush #512
    //   342: if_icmpne -> 509
    //   345: iload #7
    //   347: iload_2
    //   348: if_icmpge -> 655
    //   351: aload #4
    //   353: iload #7
    //   355: iinc #7, 1
    //   358: aload #5
    //   360: aload #6
    //   362: iload_1
    //   363: baload
    //   364: bipush #7
    //   366: ishr
    //   367: iconst_1
    //   368: iand
    //   369: iaload
    //   370: iastore
    //   371: aload #4
    //   373: iload #7
    //   375: iinc #7, 1
    //   378: aload #5
    //   380: aload #6
    //   382: iload_1
    //   383: baload
    //   384: bipush #6
    //   386: ishr
    //   387: iconst_1
    //   388: iand
    //   389: iaload
    //   390: iastore
    //   391: aload #4
    //   393: iload #7
    //   395: iinc #7, 1
    //   398: aload #5
    //   400: aload #6
    //   402: iload_1
    //   403: baload
    //   404: iconst_5
    //   405: ishr
    //   406: iconst_1
    //   407: iand
    //   408: iaload
    //   409: iastore
    //   410: aload #4
    //   412: iload #7
    //   414: iinc #7, 1
    //   417: aload #5
    //   419: aload #6
    //   421: iload_1
    //   422: baload
    //   423: iconst_4
    //   424: ishr
    //   425: iconst_1
    //   426: iand
    //   427: iaload
    //   428: iastore
    //   429: aload #4
    //   431: iload #7
    //   433: iinc #7, 1
    //   436: aload #5
    //   438: aload #6
    //   440: iload_1
    //   441: baload
    //   442: iconst_3
    //   443: ishr
    //   444: iconst_1
    //   445: iand
    //   446: iaload
    //   447: iastore
    //   448: aload #4
    //   450: iload #7
    //   452: iinc #7, 1
    //   455: aload #5
    //   457: aload #6
    //   459: iload_1
    //   460: baload
    //   461: iconst_2
    //   462: ishr
    //   463: iconst_1
    //   464: iand
    //   465: iaload
    //   466: iastore
    //   467: aload #4
    //   469: iload #7
    //   471: iinc #7, 1
    //   474: aload #5
    //   476: aload #6
    //   478: iload_1
    //   479: baload
    //   480: iconst_1
    //   481: ishr
    //   482: iconst_1
    //   483: iand
    //   484: iaload
    //   485: iastore
    //   486: aload #4
    //   488: iload #7
    //   490: iinc #7, 1
    //   493: aload #5
    //   495: aload #6
    //   497: iload_1
    //   498: baload
    //   499: iconst_1
    //   500: iand
    //   501: iaload
    //   502: iastore
    //   503: iinc #1, 1
    //   506: goto -> 345
    //   509: aload_0
    //   510: getfield a : S
    //   513: sipush #22018
    //   516: if_icmpne -> 550
    //   519: iload #7
    //   521: iload_2
    //   522: if_icmpge -> 655
    //   525: aload #4
    //   527: iload #7
    //   529: iinc #7, 1
    //   532: aload #5
    //   534: aload #6
    //   536: iload_1
    //   537: iinc #1, 1
    //   540: baload
    //   541: sipush #255
    //   544: iand
    //   545: iaload
    //   546: iastore
    //   547: goto -> 519
    //   550: aload_0
    //   551: getfield a : S
    //   554: sipush #22258
    //   557: if_icmpne -> 655
    //   560: iload #7
    //   562: iload_2
    //   563: if_icmpge -> 655
    //   566: aload #6
    //   568: iload_1
    //   569: iinc #1, 1
    //   572: baload
    //   573: sipush #255
    //   576: iand
    //   577: dup
    //   578: istore_0
    //   579: bipush #127
    //   581: if_icmple -> 620
    //   584: iinc #0, -128
    //   587: iload_0
    //   588: dup
    //   589: iconst_1
    //   590: isub
    //   591: istore_0
    //   592: ifle -> 560
    //   595: aload #4
    //   597: iload #7
    //   599: iinc #7, 1
    //   602: aload #5
    //   604: aload #6
    //   606: iload_1
    //   607: iinc #1, 1
    //   610: baload
    //   611: sipush #255
    //   614: iand
    //   615: iaload
    //   616: iastore
    //   617: goto -> 587
    //   620: aload #5
    //   622: aload #6
    //   624: iload_1
    //   625: iinc #1, 1
    //   628: baload
    //   629: sipush #255
    //   632: iand
    //   633: iaload
    //   634: istore_3
    //   635: iload_0
    //   636: dup
    //   637: iconst_1
    //   638: isub
    //   639: istore_0
    //   640: ifle -> 560
    //   643: aload #4
    //   645: iload #7
    //   647: iinc #7, 1
    //   650: iload_3
    //   651: iastore
    //   652: goto -> 635
    //   655: aload #4
    //   657: areturn
  }
  
  public final void a(boolean paramBoolean) {
    this.f = null;
    this.g = null;
    this.b = null;
    this.a = null;
    this.h = null;
    this.b = null;
    this.a = null;
    this.c = null;
    if (this.a != null) {
      for (byte b = 0; b < this.a.length; b++)
        this.a[b] = null; 
      this.a = null;
    } 
    this.d = null;
    this.c = null;
    if (paramBoolean && this.a != null) {
      for (byte b = 0; b < this.a.length; b++) {
        if (this.a[b] != null)
          for (paramBoolean = false; paramBoolean < (this.a[b]).length; paramBoolean++)
            this.a[b][paramBoolean] = null;  
      } 
      this.a = null;
    } 
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */