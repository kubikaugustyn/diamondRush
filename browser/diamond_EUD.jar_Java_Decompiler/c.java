import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class c {
  private static long a = 1000L;
  
  private static String a = "/demoSpr.bin";
  
  private static String b = "/demo.f";
  
  public static f[] a = null;
  
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
  
  private static i a = null;
  
  private short[] a = null;
  
  private int h;
  
  public c(i parami) {
    this.a = false;
    this.a = null;
    this.b = false;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = -1;
    this.a = false;
    this.a = new short[16];
    a = (short[])parami;
  }
  
  private void a(Graphics paramGraphics, byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_2
    //   6: iload_3
    //   7: baload
    //   8: dup
    //   9: istore #9
    //   11: lookupswitch default -> 1263, 1 -> 259, 2 -> 1070, 4 -> 728, 12 -> 145, 13 -> 598, 18 -> 76, 27 -> 874
    //   76: aload_2
    //   77: iload_3
    //   78: bipush #7
    //   80: iadd
    //   81: baload
    //   82: ifeq -> 1263
    //   85: aload_2
    //   86: iload_3
    //   87: iconst_3
    //   88: iadd
    //   89: baload
    //   90: sipush #255
    //   93: iand
    //   94: aload_2
    //   95: iload_3
    //   96: iconst_3
    //   97: iadd
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: sipush #255
    //   104: iand
    //   105: bipush #8
    //   107: ishl
    //   108: iadd
    //   109: aload_2
    //   110: iload_3
    //   111: iconst_3
    //   112: iadd
    //   113: iconst_2
    //   114: iadd
    //   115: baload
    //   116: sipush #255
    //   119: iand
    //   120: bipush #16
    //   122: ishl
    //   123: iadd
    //   124: istore #10
    //   126: aload_1
    //   127: iload #10
    //   129: invokevirtual setColor : (I)V
    //   132: aload_1
    //   133: iconst_0
    //   134: iconst_0
    //   135: sipush #240
    //   138: sipush #320
    //   141: invokevirtual fillRect : (IIII)V
    //   144: return
    //   145: aload_0
    //   146: getfield b : I
    //   149: istore #10
    //   151: aload_1
    //   152: ldc 16777215
    //   154: invokevirtual setColor : (I)V
    //   157: iload #10
    //   159: iconst_5
    //   160: if_icmple -> 166
    //   163: iconst_5
    //   164: istore #10
    //   166: getstatic c.a : Li;
    //   169: getfield h : I
    //   172: bipush #24
    //   174: imul
    //   175: istore_2
    //   176: getstatic c.a : Li;
    //   179: getfield i : I
    //   182: bipush #24
    //   184: imul
    //   185: istore_3
    //   186: aload_0
    //   187: getfield c : I
    //   190: istore #4
    //   192: aload_0
    //   193: getfield d : I
    //   196: istore #5
    //   198: aload_1
    //   199: iload_2
    //   200: getstatic c.a : Li;
    //   203: getfield a : I
    //   206: isub
    //   207: iconst_5
    //   208: iload #10
    //   210: isub
    //   211: imul
    //   212: iload #4
    //   214: iload #10
    //   216: imul
    //   217: iadd
    //   218: iconst_5
    //   219: idiv
    //   220: iload_3
    //   221: getstatic c.a : Li;
    //   224: getfield b : I
    //   227: isub
    //   228: iconst_5
    //   229: iload #10
    //   231: isub
    //   232: imul
    //   233: iload #5
    //   235: iload #10
    //   237: imul
    //   238: iadd
    //   239: iconst_5
    //   240: idiv
    //   241: iload #10
    //   243: bipush #102
    //   245: imul
    //   246: iconst_5
    //   247: idiv
    //   248: iload #10
    //   250: bipush #38
    //   252: imul
    //   253: iconst_5
    //   254: idiv
    //   255: invokevirtual fillRect : (IIII)V
    //   258: return
    //   259: aload_0
    //   260: getfield b : I
    //   263: istore #10
    //   265: aload_2
    //   266: iload_3
    //   267: iconst_2
    //   268: iadd
    //   269: invokestatic a : ([BI)I
    //   272: i2s
    //   273: istore #4
    //   275: aload_2
    //   276: iload_3
    //   277: iconst_4
    //   278: iadd
    //   279: invokestatic a : ([BI)I
    //   282: i2s
    //   283: istore #5
    //   285: aload_2
    //   286: iload_3
    //   287: bipush #6
    //   289: iadd
    //   290: invokestatic a : ([BI)I
    //   293: i2s
    //   294: istore #8
    //   296: aload_2
    //   297: iload_3
    //   298: bipush #8
    //   300: iadd
    //   301: invokestatic a : ([BI)I
    //   304: i2s
    //   305: istore #6
    //   307: aload_2
    //   308: iload_3
    //   309: bipush #10
    //   311: iadd
    //   312: invokestatic a : ([BI)I
    //   315: i2s
    //   316: istore #7
    //   318: iload #6
    //   320: sipush #10000
    //   323: if_icmpne -> 335
    //   326: getstatic c.a : Li;
    //   329: getfield c : I
    //   332: i2s
    //   333: istore #6
    //   335: iload #7
    //   337: sipush #10000
    //   340: if_icmpne -> 352
    //   343: getstatic c.a : Li;
    //   346: getfield d : I
    //   349: i2s
    //   350: istore #7
    //   352: iload #10
    //   354: iload #8
    //   356: if_icmple -> 363
    //   359: iload #8
    //   361: istore #10
    //   363: iload #4
    //   365: bipush #108
    //   367: isub
    //   368: i2s
    //   369: istore #4
    //   371: iload #5
    //   373: bipush #108
    //   375: isub
    //   376: i2s
    //   377: istore #5
    //   379: getstatic c.a : Li;
    //   382: iload #4
    //   384: iload #10
    //   386: imul
    //   387: iload #6
    //   389: iload #8
    //   391: iload #10
    //   393: isub
    //   394: imul
    //   395: iadd
    //   396: iload #8
    //   398: idiv
    //   399: i2s
    //   400: putfield c : I
    //   403: getstatic c.a : Li;
    //   406: iload #5
    //   408: iload #10
    //   410: imul
    //   411: iload #7
    //   413: iload #8
    //   415: iload #10
    //   417: isub
    //   418: imul
    //   419: iadd
    //   420: iload #8
    //   422: idiv
    //   423: i2s
    //   424: putfield d : I
    //   427: getstatic c.a : Li;
    //   430: getfield e : I
    //   433: bipush #24
    //   435: imul
    //   436: sipush #240
    //   439: isub
    //   440: istore_0
    //   441: getstatic c.a : Li;
    //   444: getfield f : I
    //   447: bipush #24
    //   449: imul
    //   450: sipush #320
    //   453: isub
    //   454: bipush #80
    //   456: iadd
    //   457: istore_1
    //   458: getstatic c.a : Li;
    //   461: getfield c : I
    //   464: iload_0
    //   465: if_icmple -> 475
    //   468: getstatic c.a : Li;
    //   471: iload_0
    //   472: goto -> 488
    //   475: getstatic c.a : Li;
    //   478: getfield c : I
    //   481: ifge -> 491
    //   484: getstatic c.a : Li;
    //   487: iconst_0
    //   488: putfield c : I
    //   491: getstatic c.a : Li;
    //   494: getfield d : I
    //   497: iload_1
    //   498: if_icmple -> 508
    //   501: getstatic c.a : Li;
    //   504: iload_1
    //   505: goto -> 521
    //   508: getstatic c.a : Li;
    //   511: getfield d : I
    //   514: ifge -> 524
    //   517: getstatic c.a : Li;
    //   520: iconst_0
    //   521: putfield d : I
    //   524: getstatic c.a : Li;
    //   527: getstatic c.a : Li;
    //   530: getfield c : I
    //   533: putfield a : I
    //   536: getstatic c.a : Li;
    //   539: getstatic c.a : Li;
    //   542: getfield d : I
    //   545: putfield b : I
    //   548: getstatic c.a : Li;
    //   551: getfield a : I
    //   554: iload_0
    //   555: if_icmple -> 570
    //   558: getstatic c.a : Li;
    //   561: dup
    //   562: getfield a : I
    //   565: iload_0
    //   566: isub
    //   567: putfield a : I
    //   570: getstatic c.a : Li;
    //   573: getfield b : I
    //   576: iload_1
    //   577: if_icmple -> 588
    //   580: getstatic c.a : Li;
    //   583: iload_1
    //   584: putfield b : I
    //   587: return
    //   588: getstatic c.a : Li;
    //   591: getfield b : I
    //   594: ifge -> 1263
    //   597: return
    //   598: aload_0
    //   599: getfield b : I
    //   602: istore #10
    //   604: aload_2
    //   605: iload_3
    //   606: iconst_2
    //   607: iadd
    //   608: invokestatic a : ([BI)I
    //   611: i2s
    //   612: istore #4
    //   614: aload_2
    //   615: iload_3
    //   616: iconst_4
    //   617: iadd
    //   618: invokestatic a : ([BI)I
    //   621: i2s
    //   622: istore #5
    //   624: aload_2
    //   625: iload_3
    //   626: bipush #6
    //   628: iadd
    //   629: invokestatic a : ([BI)I
    //   632: i2s
    //   633: istore #8
    //   635: aload_2
    //   636: iload_3
    //   637: bipush #8
    //   639: iadd
    //   640: invokestatic a : ([BI)I
    //   643: i2s
    //   644: istore #6
    //   646: aload_2
    //   647: iload_3
    //   648: bipush #10
    //   650: iadd
    //   651: invokestatic a : ([BI)I
    //   654: i2s
    //   655: istore #7
    //   657: iload #10
    //   659: iload #8
    //   661: if_icmple -> 668
    //   664: iload #8
    //   666: istore #10
    //   668: iload #4
    //   670: iload #10
    //   672: imul
    //   673: iload #6
    //   675: iload #8
    //   677: iload #10
    //   679: isub
    //   680: imul
    //   681: iadd
    //   682: iload #8
    //   684: idiv
    //   685: i2s
    //   686: istore #4
    //   688: iload #5
    //   690: iload #10
    //   692: imul
    //   693: iload #7
    //   695: iload #8
    //   697: iload #10
    //   699: isub
    //   700: imul
    //   701: iadd
    //   702: iload #8
    //   704: idiv
    //   705: i2s
    //   706: istore #5
    //   708: iload #9
    //   710: bipush #13
    //   712: if_icmpne -> 1263
    //   715: aload_0
    //   716: iload #4
    //   718: putfield c : I
    //   721: aload_0
    //   722: iload #5
    //   724: putfield d : I
    //   727: return
    //   728: aload_0
    //   729: getfield b : I
    //   732: istore #10
    //   734: aload_2
    //   735: iload_3
    //   736: iconst_2
    //   737: iadd
    //   738: invokestatic a : ([BI)I
    //   741: i2s
    //   742: istore #6
    //   744: aload_2
    //   745: iload_3
    //   746: iconst_4
    //   747: iadd
    //   748: invokestatic a : ([BI)I
    //   751: i2s
    //   752: istore #7
    //   754: aload_2
    //   755: iload_3
    //   756: bipush #6
    //   758: iadd
    //   759: invokestatic a : ([BI)I
    //   762: i2s
    //   763: istore #4
    //   765: aload_2
    //   766: iload_3
    //   767: bipush #6
    //   769: iadd
    //   770: invokestatic a : ([BI)I
    //   773: i2s
    //   774: istore #5
    //   776: aload_2
    //   777: iload_3
    //   778: bipush #14
    //   780: iadd
    //   781: invokestatic a : ([BI)I
    //   784: i2s
    //   785: istore #8
    //   787: iload #10
    //   789: iload #8
    //   791: if_icmple -> 798
    //   794: iload #8
    //   796: istore #10
    //   798: iload #4
    //   800: iload #10
    //   802: imul
    //   803: iload #6
    //   805: iload #8
    //   807: iload #10
    //   809: isub
    //   810: imul
    //   811: iadd
    //   812: iload #8
    //   814: idiv
    //   815: i2s
    //   816: istore_0
    //   817: iload #5
    //   819: iload #10
    //   821: imul
    //   822: iload #7
    //   824: iload #8
    //   826: iload #10
    //   828: isub
    //   829: imul
    //   830: iadd
    //   831: iload #8
    //   833: idiv
    //   834: i2s
    //   835: istore #4
    //   837: aload_2
    //   838: iload_3
    //   839: bipush #10
    //   841: iadd
    //   842: invokestatic a : ([BI)I
    //   845: i2s
    //   846: istore #5
    //   848: aload_2
    //   849: iload_3
    //   850: bipush #12
    //   852: iadd
    //   853: invokestatic a : ([BI)I
    //   856: i2s
    //   857: istore_2
    //   858: getstatic c.a : [Lf;
    //   861: iload #5
    //   863: aaload
    //   864: aload_1
    //   865: iload_2
    //   866: iload_0
    //   867: iload #4
    //   869: iconst_0
    //   870: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   873: return
    //   874: getstatic i.a : Lh;
    //   877: getfield a : Ljavax/microedition/lcdui/Font;
    //   880: getstatic i.a : [Ljava/lang/String;
    //   883: bipush #30
    //   885: aaload
    //   886: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   889: bipush #10
    //   891: iadd
    //   892: istore_0
    //   893: getstatic i.a : Lh;
    //   896: getfield a : Ljavax/microedition/lcdui/Font;
    //   899: invokevirtual getHeight : ()I
    //   902: iconst_4
    //   903: iadd
    //   904: istore #4
    //   906: aconst_null
    //   907: astore #5
    //   909: new java/lang/String
    //   912: dup
    //   913: aload_2
    //   914: iload_3
    //   915: bipush #8
    //   917: iadd
    //   918: aload_2
    //   919: iload_3
    //   920: iconst_2
    //   921: iadd
    //   922: invokestatic a : ([BI)I
    //   925: i2s
    //   926: ldc 'ISO-8859-1'
    //   928: invokespecial <init> : ([BIILjava/lang/String;)V
    //   931: astore #5
    //   933: goto -> 937
    //   936: pop
    //   937: aload #5
    //   939: ifnull -> 962
    //   942: aload #5
    //   944: invokevirtual trim : ()Ljava/lang/String;
    //   947: invokestatic parseInt : (Ljava/lang/String;)I
    //   950: istore_2
    //   951: getstatic i.b : [Ljava/lang/String;
    //   954: iload_2
    //   955: aaload
    //   956: astore #5
    //   958: goto -> 962
    //   961: pop
    //   962: aload #5
    //   964: sipush #220
    //   967: invokestatic a : (Ljava/lang/String;I)[Ljava/lang/String;
    //   970: arraylength
    //   971: getstatic i.a : Lh;
    //   974: getfield a : Ljavax/microedition/lcdui/Font;
    //   977: invokevirtual getHeight : ()I
    //   980: imul
    //   981: bipush #6
    //   983: iadd
    //   984: istore_2
    //   985: aload_1
    //   986: bipush #6
    //   988: sipush #197
    //   991: sipush #226
    //   994: iload_2
    //   995: bipush #73
    //   997: iconst_1
    //   998: iload_0
    //   999: iload #4
    //   1001: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIIIII)V
    //   1004: aload_1
    //   1005: aload #5
    //   1007: bipush #8
    //   1009: sipush #210
    //   1012: sipush #220
    //   1015: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1018: getstatic i.a : Lh;
    //   1021: aload_1
    //   1022: getstatic i.a : [Ljava/lang/String;
    //   1025: bipush #30
    //   1027: aaload
    //   1028: bipush #19
    //   1030: sipush #200
    //   1033: bipush #20
    //   1035: invokevirtual b : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1038: getstatic i.g : I
    //   1041: iconst_2
    //   1042: idiv
    //   1043: iconst_4
    //   1044: irem
    //   1045: iconst_2
    //   1046: if_icmpge -> 1263
    //   1049: aload_1
    //   1050: getstatic i.a : [[Ljavax/microedition/lcdui/Image;
    //   1053: iconst_0
    //   1054: aaload
    //   1055: bipush #9
    //   1057: aaload
    //   1058: sipush #223
    //   1061: sipush #197
    //   1064: bipush #17
    //   1066: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1069: return
    //   1070: aload_2
    //   1071: iload_3
    //   1072: bipush #6
    //   1074: iadd
    //   1075: invokestatic a : ([BI)I
    //   1078: i2s
    //   1079: istore #4
    //   1081: aload_2
    //   1082: iload_3
    //   1083: iconst_4
    //   1084: iadd
    //   1085: invokestatic a : ([BI)I
    //   1088: i2s
    //   1089: dup
    //   1090: istore_0
    //   1091: sipush #10000
    //   1094: if_icmpne -> 1101
    //   1097: sipush #-240
    //   1100: istore_0
    //   1101: aconst_null
    //   1102: astore #5
    //   1104: new java/lang/String
    //   1107: dup
    //   1108: aload_2
    //   1109: iload_3
    //   1110: bipush #11
    //   1112: iadd
    //   1113: aload_2
    //   1114: iload_3
    //   1115: iconst_2
    //   1116: iadd
    //   1117: invokestatic a : ([BI)I
    //   1120: i2s
    //   1121: ldc 'ISO-8859-1'
    //   1123: invokespecial <init> : ([BIILjava/lang/String;)V
    //   1126: astore #5
    //   1128: goto -> 1132
    //   1131: pop
    //   1132: aload #5
    //   1134: ifnull -> 1157
    //   1137: aload #5
    //   1139: invokevirtual trim : ()Ljava/lang/String;
    //   1142: invokestatic parseInt : (Ljava/lang/String;)I
    //   1145: istore_2
    //   1146: getstatic i.b : [Ljava/lang/String;
    //   1149: iload_2
    //   1150: aaload
    //   1151: astore #5
    //   1153: goto -> 1157
    //   1156: pop
    //   1157: aload #5
    //   1159: sipush #222
    //   1162: invokestatic a : (Ljava/lang/String;I)[Ljava/lang/String;
    //   1165: arraylength
    //   1166: getstatic i.a : Lh;
    //   1169: getfield a : Ljavax/microedition/lcdui/Font;
    //   1172: invokevirtual getHeight : ()I
    //   1175: imul
    //   1176: iconst_2
    //   1177: iadd
    //   1178: istore_2
    //   1179: aload_1
    //   1180: iload_0
    //   1181: iload #4
    //   1183: bipush #11
    //   1185: isub
    //   1186: sipush #226
    //   1189: iload_2
    //   1190: bipush #73
    //   1192: iconst_0
    //   1193: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   1196: aload_1
    //   1197: aload #5
    //   1199: iload_0
    //   1200: iconst_2
    //   1201: iadd
    //   1202: iload #4
    //   1204: iconst_2
    //   1205: iadd
    //   1206: sipush #222
    //   1209: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1212: getstatic i.g : I
    //   1215: iconst_2
    //   1216: idiv
    //   1217: iconst_4
    //   1218: irem
    //   1219: iconst_2
    //   1220: if_icmpge -> 1251
    //   1223: aload_1
    //   1224: getstatic i.a : [[Ljavax/microedition/lcdui/Image;
    //   1227: iconst_0
    //   1228: aaload
    //   1229: bipush #9
    //   1231: aaload
    //   1232: iload_0
    //   1233: sipush #226
    //   1236: iadd
    //   1237: bipush #10
    //   1239: isub
    //   1240: iload #4
    //   1242: iload_2
    //   1243: iadd
    //   1244: iconst_2
    //   1245: iadd
    //   1246: bipush #17
    //   1248: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1251: aload_1
    //   1252: iconst_0
    //   1253: iconst_0
    //   1254: sipush #240
    //   1257: sipush #320
    //   1260: invokevirtual setClip : (IIII)V
    //   1263: return
    // Exception table:
    //   from	to	target	type
    //   909	933	936	java/lang/Exception
    //   942	958	961	java/lang/Exception
    //   1104	1128	1131	java/lang/Exception
    //   1137	1153	1156	java/lang/Exception
  }
  
  private void a(byte[] paramArrayOfbyte, int paramInt) {
    String str2;
    short s2;
    String str1;
    short s1;
    short s3;
    switch ((short)paramArrayOfbyte[paramInt]) {
      case 7:
        paramArrayOfbyte[paramInt + 1] = 1;
        return;
      case 27:
        if (i.a != null)
          return; 
        str2 = null;
        try {
          str2 = new String(paramArrayOfbyte, paramInt + 8, (short)i.a(paramArrayOfbyte, paramInt + 2), "ISO-8859-1");
        } catch (Exception exception) {}
        a(str2, 196);
        s2 = (short)(paramArrayOfbyte[paramInt + 6] & 0xFF);
        s3 = (short)(paramArrayOfbyte[paramInt + 8] & 0xFF);
        if (s2 + s3 >= this.h) {
          paramArrayOfbyte[paramInt + 7] = 1;
          return;
        } 
        paramArrayOfbyte[paramInt + 6] = (byte)(s2 + s3);
        return;
      case 2:
        str1 = null;
        try {
          str1 = new String(paramArrayOfbyte, paramInt + 11, (short)i.a(paramArrayOfbyte, paramInt + 2), "ISO-8859-1");
        } catch (Exception exception) {}
        a(str1, 222);
        s1 = (short)(paramArrayOfbyte[paramInt + 9] & 0xFF);
        s3 = (short)(paramArrayOfbyte[paramInt + 8] & 0xFF);
        paramArrayOfbyte[paramInt + 9] = (s1 + s3 >= this.h) ? 1 : (byte)(s1 + s3);
        break;
    } 
  }
  
  public final void a() {
    if (this.a == null)
      return; 
    if (Math.abs(this.b - System.currentTimeMillis()) < a)
      return; 
    if (this.a[0] == 0) {
      short s = this.a[1];
      int j = 2 + (s << 2);
      for (byte b = 0; b < s; b++) {
        int k = i.b((byte[])this.a, 2 + (b << 2));
        a((byte[])this.a, j);
        j += k;
      } 
    } else {
      a((byte[])this.a, 0);
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: dup
    //   10: astore_2
    //   11: getfield a : [B
    //   14: ifnonnull -> 21
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: aload_2
    //   22: getfield a : [B
    //   25: iconst_0
    //   26: baload
    //   27: lookupswitch default -> 72, 25 -> 52, 26 -> 52
    //   52: aload_0
    //   53: getfield a : [[B
    //   56: ifnull -> 71
    //   59: aload_0
    //   60: getfield a : I
    //   63: aload_0
    //   64: getfield a : [[B
    //   67: arraylength
    //   68: if_icmplt -> 133
    //   71: return
    //   72: aload_1
    //   73: iconst_0
    //   74: invokevirtual setColor : (I)V
    //   77: aload_1
    //   78: iconst_0
    //   79: iconst_0
    //   80: sipush #240
    //   83: bipush #42
    //   85: invokevirtual fillRect : (IIII)V
    //   88: aload_1
    //   89: iconst_0
    //   90: sipush #278
    //   93: sipush #240
    //   96: bipush #42
    //   98: invokevirtual fillRect : (IIII)V
    //   101: getstatic i.a : Lh;
    //   104: aload_1
    //   105: getstatic i.a : [Ljava/lang/String;
    //   108: bipush #65
    //   110: aaload
    //   111: iconst_2
    //   112: sipush #320
    //   115: getstatic i.a : Lh;
    //   118: getfield a : Ljavax/microedition/lcdui/Font;
    //   121: invokevirtual getHeight : ()I
    //   124: bipush #10
    //   126: isub
    //   127: isub
    //   128: bipush #36
    //   130: invokevirtual b : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   133: aload_0
    //   134: getfield a : [B
    //   137: iconst_0
    //   138: baload
    //   139: ifne -> 200
    //   142: aload_0
    //   143: getfield a : [B
    //   146: iconst_1
    //   147: baload
    //   148: istore_2
    //   149: iconst_2
    //   150: iload_2
    //   151: iconst_2
    //   152: ishl
    //   153: iadd
    //   154: istore_3
    //   155: iconst_0
    //   156: istore #4
    //   158: iload #4
    //   160: iload_2
    //   161: if_icmpge -> 210
    //   164: aload_0
    //   165: getfield a : [B
    //   168: iconst_2
    //   169: iload #4
    //   171: iconst_2
    //   172: ishl
    //   173: iadd
    //   174: invokestatic b : ([BI)I
    //   177: istore #5
    //   179: aload_0
    //   180: aload_1
    //   181: aload_0
    //   182: getfield a : [B
    //   185: iload_3
    //   186: invokespecial a : (Ljavax/microedition/lcdui/Graphics;[BI)V
    //   189: iload_3
    //   190: iload #5
    //   192: iadd
    //   193: istore_3
    //   194: iinc #4, 1
    //   197: goto -> 158
    //   200: aload_0
    //   201: aload_1
    //   202: aload_0
    //   203: getfield a : [B
    //   206: iconst_0
    //   207: invokespecial a : (Ljavax/microedition/lcdui/Graphics;[BI)V
    //   210: aload_0
    //   211: getfield b : Z
    //   214: ifeq -> 381
    //   217: aload_1
    //   218: iconst_0
    //   219: invokevirtual setColor : (I)V
    //   222: aload_1
    //   223: aload_0
    //   224: getfield c : I
    //   227: iconst_3
    //   228: isub
    //   229: aload_0
    //   230: getfield d : I
    //   233: iconst_3
    //   234: isub
    //   235: bipush #109
    //   237: bipush #45
    //   239: invokevirtual fillRect : (IIII)V
    //   242: getstatic c.a : [Lf;
    //   245: aload_0
    //   246: getfield f : I
    //   249: aaload
    //   250: aload_1
    //   251: iconst_0
    //   252: aload_0
    //   253: getfield b : I
    //   256: getstatic c.a : [Lf;
    //   259: aload_0
    //   260: getfield f : I
    //   263: aaload
    //   264: iconst_0
    //   265: invokevirtual a : (I)I
    //   268: irem
    //   269: aload_0
    //   270: getfield c : I
    //   273: aload_0
    //   274: getfield d : I
    //   277: iconst_0
    //   278: iconst_0
    //   279: iconst_0
    //   280: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   283: getstatic c.a : [Lf;
    //   286: iconst_0
    //   287: aaload
    //   288: aload_1
    //   289: aload_0
    //   290: getfield e : I
    //   293: aload_0
    //   294: getfield c : I
    //   297: aload_0
    //   298: getfield d : I
    //   301: iconst_0
    //   302: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   305: aload_0
    //   306: getfield g : I
    //   309: iflt -> 381
    //   312: getstatic i.b : Z
    //   315: ifeq -> 332
    //   318: aload_0
    //   319: getfield g : I
    //   322: iconst_2
    //   323: if_icmpne -> 332
    //   326: aload_0
    //   327: bipush #7
    //   329: putfield g : I
    //   332: getstatic i.b : Z
    //   335: ifeq -> 353
    //   338: aload_0
    //   339: getfield g : I
    //   342: bipush #6
    //   344: if_icmpne -> 353
    //   347: aload_0
    //   348: bipush #8
    //   350: putfield g : I
    //   353: getstatic c.a : [Lf;
    //   356: iconst_1
    //   357: aaload
    //   358: aload_1
    //   359: aload_0
    //   360: getfield g : I
    //   363: aload_0
    //   364: getfield c : I
    //   367: bipush #90
    //   369: iadd
    //   370: aload_0
    //   371: getfield d : I
    //   374: bipush #-6
    //   376: iadd
    //   377: iconst_0
    //   378: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   381: return
  }
  
  public final byte[] a() {
    short[] arrayOfShort = this.a;
    c c1 = this;
    for (byte b = 0; b < arrayOfShort.length; b++)
      c1.b(arrayOfShort[b], 0); 
    this.b = false;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = -1;
    this.a = false;
    this.a = false;
    this.b = System.currentTimeMillis();
    return b();
  }
  
  private void b(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte[paramInt] != 0) {
      paramArrayOfbyte[paramInt + 1] = 0;
      switch (paramArrayOfbyte[paramInt]) {
        case 27:
          paramArrayOfbyte[paramInt + 6] = 0;
          a(paramArrayOfbyte, paramInt + 4, (short)-240);
        case 2:
          paramArrayOfbyte[paramInt + 9] = 0;
          a(paramArrayOfbyte, paramInt + 4, (short)-240);
          paramArrayOfbyte[paramInt + 10] = 0;
          break;
      } 
      return;
    } 
    byte b = paramArrayOfbyte[paramInt + 1];
    int j = paramInt + 2 + (b << 2);
    for (byte b1 = 0; b1 < b; b1++) {
      int k = i.b(paramArrayOfbyte, paramInt + 2 + (b1 << 2));
      b(paramArrayOfbyte, j);
      j += k;
    } 
  }
  
  public final byte[] b() {
    this.b = false;
    this.a = (this.a == null || this.a >= this.a.length) ? null : this.a[this.a++];
    return (byte[])this.a;
  }
  
  public final void b() {
    if (this.a[0] == 0) {
      short s = this.a[1];
      int j = 2 + (s << 2);
      for (byte b = 0; b < s; b++) {
        int k = i.b((byte[])this.a, 2 + (b << 2));
        c((byte[])this.a, j);
        j += k;
      } 
    } else {
      c((byte[])this.a, 0);
    } 
    this.b++;
  }
  
  private void c(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: baload
    //   3: i2s
    //   4: istore_3
    //   5: aload_0
    //   6: getfield a : Z
    //   9: ifeq -> 74
    //   12: iload_3
    //   13: lookupswitch default -> 67, 5 -> 64, 9 -> 64, 10 -> 64, 25 -> 64, 26 -> 64
    //   64: goto -> 74
    //   67: aload_1
    //   68: iload_2
    //   69: iconst_1
    //   70: iadd
    //   71: iconst_1
    //   72: bastore
    //   73: return
    //   74: iload_3
    //   75: tableswitch default -> 1020, 1 -> 635, 2 -> 952, 3 -> 1020, 4 -> 720, 5 -> 866, 6 -> 745, 7 -> 1020, 8 -> 899, 9 -> 900, 10 -> 485, 11 -> 454, 12 -> 404, 13 -> 554, 14 -> 382, 15 -> 382, 16 -> 196, 17 -> 196, 18 -> 196, 19 -> 1020, 20 -> 1020, 21 -> 1020, 22 -> 1020, 23 -> 1020, 24 -> 1020, 25 -> 766, 26 -> 822, 27 -> 936
    //   196: aload_0
    //   197: getfield b : I
    //   200: iconst_2
    //   201: irem
    //   202: ifne -> 206
    //   205: return
    //   206: iload_2
    //   207: iload_3
    //   208: bipush #18
    //   210: if_icmpne -> 217
    //   213: iconst_2
    //   214: goto -> 218
    //   217: iconst_4
    //   218: iadd
    //   219: istore #4
    //   221: aload_1
    //   222: iload #4
    //   224: baload
    //   225: istore #5
    //   227: iconst_m1
    //   228: istore #6
    //   230: iload_2
    //   231: iload_3
    //   232: bipush #18
    //   234: if_icmpne -> 242
    //   237: bipush #7
    //   239: goto -> 243
    //   242: iconst_5
    //   243: iadd
    //   244: istore #7
    //   246: aload_1
    //   247: iload #7
    //   249: baload
    //   250: ifeq -> 257
    //   253: iconst_1
    //   254: goto -> 258
    //   257: iconst_0
    //   258: istore #8
    //   260: iload_3
    //   261: bipush #18
    //   263: if_icmpeq -> 276
    //   266: aload_1
    //   267: iload_2
    //   268: iconst_2
    //   269: iadd
    //   270: invokestatic a : ([BI)I
    //   273: i2s
    //   274: istore #6
    //   276: iload #8
    //   278: ifeq -> 331
    //   281: iconst_0
    //   282: istore #8
    //   284: aload_0
    //   285: iconst_m1
    //   286: putfield g : I
    //   289: iload #5
    //   291: iconst_1
    //   292: isub
    //   293: i2b
    //   294: dup
    //   295: istore #5
    //   297: ifne -> 360
    //   300: aload_1
    //   301: iload_2
    //   302: iconst_1
    //   303: iadd
    //   304: iconst_1
    //   305: bastore
    //   306: iload_3
    //   307: bipush #18
    //   309: if_icmpeq -> 360
    //   312: aload_0
    //   313: iload_3
    //   314: bipush #16
    //   316: if_icmpne -> 324
    //   319: iload #6
    //   321: goto -> 325
    //   324: iconst_m1
    //   325: putfield g : I
    //   328: goto -> 360
    //   331: iload #5
    //   333: ifle -> 354
    //   336: iconst_1
    //   337: istore #8
    //   339: iload_3
    //   340: bipush #18
    //   342: if_icmpeq -> 360
    //   345: aload_0
    //   346: iload #6
    //   348: putfield g : I
    //   351: goto -> 360
    //   354: aload_1
    //   355: iload_2
    //   356: iconst_1
    //   357: iadd
    //   358: iconst_1
    //   359: bastore
    //   360: aload_1
    //   361: iload #7
    //   363: iload #8
    //   365: ifeq -> 372
    //   368: iconst_1
    //   369: goto -> 373
    //   372: iconst_0
    //   373: i2b
    //   374: bastore
    //   375: aload_1
    //   376: iload #4
    //   378: iload #5
    //   380: bastore
    //   381: return
    //   382: aload_0
    //   383: iload_3
    //   384: bipush #14
    //   386: if_icmpne -> 393
    //   389: iconst_1
    //   390: goto -> 394
    //   393: iconst_0
    //   394: putfield b : Z
    //   397: aload_1
    //   398: iload_2
    //   399: iconst_1
    //   400: iadd
    //   401: iconst_1
    //   402: bastore
    //   403: return
    //   404: aload_1
    //   405: iload_2
    //   406: iconst_2
    //   407: iadd
    //   408: invokestatic a : ([BI)I
    //   411: i2s
    //   412: istore_3
    //   413: aload_1
    //   414: iload_2
    //   415: iconst_4
    //   416: iadd
    //   417: invokestatic a : ([BI)I
    //   420: i2s
    //   421: istore #4
    //   423: aload_0
    //   424: iload_3
    //   425: putfield c : I
    //   428: aload_0
    //   429: iload #4
    //   431: putfield d : I
    //   434: aload_0
    //   435: getfield b : I
    //   438: iconst_5
    //   439: if_icmple -> 1020
    //   442: aload_1
    //   443: iload_2
    //   444: iconst_1
    //   445: iadd
    //   446: iconst_1
    //   447: bastore
    //   448: aload_0
    //   449: iconst_1
    //   450: putfield b : Z
    //   453: return
    //   454: aload_0
    //   455: aload_1
    //   456: iload_2
    //   457: iconst_4
    //   458: iadd
    //   459: invokestatic a : ([BI)I
    //   462: i2s
    //   463: putfield f : I
    //   466: aload_0
    //   467: aload_1
    //   468: iload_2
    //   469: iconst_2
    //   470: iadd
    //   471: invokestatic a : ([BI)I
    //   474: i2s
    //   475: putfield e : I
    //   478: aload_1
    //   479: iload_2
    //   480: iconst_1
    //   481: iadd
    //   482: iconst_1
    //   483: bastore
    //   484: return
    //   485: aload_1
    //   486: iload_2
    //   487: iconst_2
    //   488: iadd
    //   489: baload
    //   490: istore_3
    //   491: aload_0
    //   492: getfield b : I
    //   495: ifne -> 525
    //   498: getstatic c.a : Li;
    //   501: getstatic c.a : Li;
    //   504: getfield k : I
    //   507: bipush #-8
    //   509: iand
    //   510: iload_3
    //   511: ior
    //   512: putfield k : I
    //   515: getstatic c.a : Li;
    //   518: iload_3
    //   519: putfield a : B
    //   522: goto -> 547
    //   525: getstatic c.a : Li;
    //   528: getfield j : I
    //   531: ifgt -> 547
    //   534: getstatic c.a : Li;
    //   537: iconst_0
    //   538: putfield a : B
    //   541: aload_1
    //   542: iload_2
    //   543: iconst_1
    //   544: iadd
    //   545: iconst_1
    //   546: bastore
    //   547: getstatic c.a : Li;
    //   550: invokevirtual a : ()V
    //   553: return
    //   554: aload_1
    //   555: iload_2
    //   556: bipush #8
    //   558: iadd
    //   559: invokestatic a : ([BI)I
    //   562: i2s
    //   563: sipush #10000
    //   566: if_icmpne -> 582
    //   569: aload_1
    //   570: iload_2
    //   571: bipush #8
    //   573: iadd
    //   574: aload_0
    //   575: getfield c : I
    //   578: i2s
    //   579: invokestatic a : ([BIS)V
    //   582: aload_1
    //   583: iload_2
    //   584: bipush #10
    //   586: iadd
    //   587: invokestatic a : ([BI)I
    //   590: i2s
    //   591: sipush #10000
    //   594: if_icmpne -> 610
    //   597: aload_1
    //   598: iload_2
    //   599: bipush #10
    //   601: iadd
    //   602: aload_0
    //   603: getfield d : I
    //   606: i2s
    //   607: invokestatic a : ([BIS)V
    //   610: aload_1
    //   611: iload_2
    //   612: bipush #6
    //   614: iadd
    //   615: invokestatic a : ([BI)I
    //   618: i2s
    //   619: istore_3
    //   620: aload_0
    //   621: getfield b : I
    //   624: iload_3
    //   625: if_icmple -> 1020
    //   628: aload_1
    //   629: iload_2
    //   630: iconst_1
    //   631: iadd
    //   632: iconst_1
    //   633: bastore
    //   634: return
    //   635: aload_1
    //   636: iload_2
    //   637: bipush #8
    //   639: iadd
    //   640: invokestatic a : ([BI)I
    //   643: i2s
    //   644: sipush #10000
    //   647: if_icmpne -> 665
    //   650: aload_1
    //   651: iload_2
    //   652: bipush #8
    //   654: iadd
    //   655: getstatic c.a : Li;
    //   658: getfield c : I
    //   661: i2s
    //   662: invokestatic a : ([BIS)V
    //   665: aload_1
    //   666: iload_2
    //   667: bipush #10
    //   669: iadd
    //   670: invokestatic a : ([BI)I
    //   673: i2s
    //   674: sipush #10000
    //   677: if_icmpne -> 695
    //   680: aload_1
    //   681: iload_2
    //   682: bipush #10
    //   684: iadd
    //   685: getstatic c.a : Li;
    //   688: getfield d : I
    //   691: i2s
    //   692: invokestatic a : ([BIS)V
    //   695: aload_1
    //   696: iload_2
    //   697: bipush #6
    //   699: iadd
    //   700: invokestatic a : ([BI)I
    //   703: i2s
    //   704: istore_3
    //   705: aload_0
    //   706: getfield b : I
    //   709: iload_3
    //   710: if_icmple -> 1020
    //   713: aload_1
    //   714: iload_2
    //   715: iconst_1
    //   716: iadd
    //   717: iconst_1
    //   718: bastore
    //   719: return
    //   720: aload_1
    //   721: iload_2
    //   722: bipush #14
    //   724: iadd
    //   725: invokestatic a : ([BI)I
    //   728: i2s
    //   729: istore_3
    //   730: aload_0
    //   731: getfield b : I
    //   734: iload_3
    //   735: if_icmple -> 1020
    //   738: aload_1
    //   739: iload_2
    //   740: iconst_1
    //   741: iadd
    //   742: iconst_1
    //   743: bastore
    //   744: return
    //   745: aload_0
    //   746: getfield b : I
    //   749: aload_1
    //   750: iload_2
    //   751: iconst_2
    //   752: iadd
    //   753: invokestatic b : ([BI)I
    //   756: if_icmple -> 1020
    //   759: aload_1
    //   760: iload_2
    //   761: iconst_1
    //   762: iadd
    //   763: iconst_1
    //   764: bastore
    //   765: return
    //   766: aload_1
    //   767: iload_2
    //   768: iconst_2
    //   769: iadd
    //   770: invokestatic a : ([BI)I
    //   773: i2s
    //   774: istore_3
    //   775: aload_1
    //   776: iload_2
    //   777: iconst_4
    //   778: iadd
    //   779: invokestatic a : ([BI)I
    //   782: i2s
    //   783: istore #4
    //   785: aload_1
    //   786: iload_2
    //   787: bipush #6
    //   789: iadd
    //   790: baload
    //   791: istore_0
    //   792: aload_1
    //   793: iload_2
    //   794: bipush #7
    //   796: iadd
    //   797: baload
    //   798: istore #5
    //   800: getstatic i.a : [[I
    //   803: iload_3
    //   804: aaload
    //   805: iload #4
    //   807: iload #5
    //   809: bipush #8
    //   811: ishl
    //   812: iload_0
    //   813: ior
    //   814: iastore
    //   815: aload_1
    //   816: iload_2
    //   817: iconst_1
    //   818: iadd
    //   819: iconst_1
    //   820: bastore
    //   821: return
    //   822: aload_1
    //   823: iload_2
    //   824: iconst_2
    //   825: iadd
    //   826: invokestatic a : ([BI)I
    //   829: i2s
    //   830: istore_3
    //   831: aload_1
    //   832: iload_2
    //   833: iconst_4
    //   834: iadd
    //   835: invokestatic a : ([BI)I
    //   838: i2s
    //   839: istore #4
    //   841: aload_1
    //   842: iload_2
    //   843: bipush #6
    //   845: iadd
    //   846: invokestatic b : ([BI)I
    //   849: istore_0
    //   850: getstatic i.b : [[I
    //   853: iload_3
    //   854: aaload
    //   855: iload #4
    //   857: iload_0
    //   858: iastore
    //   859: aload_1
    //   860: iload_2
    //   861: iconst_1
    //   862: iadd
    //   863: iconst_1
    //   864: bastore
    //   865: return
    //   866: aload_1
    //   867: iload_2
    //   868: iconst_2
    //   869: iadd
    //   870: invokestatic a : ([BI)I
    //   873: i2s
    //   874: aload_1
    //   875: iload_2
    //   876: iconst_4
    //   877: iadd
    //   878: invokestatic a : ([BI)I
    //   881: i2s
    //   882: aload_1
    //   883: iload_2
    //   884: bipush #6
    //   886: iadd
    //   887: baload
    //   888: iconst_0
    //   889: invokestatic a : (SSBI)V
    //   892: aload_1
    //   893: iload_2
    //   894: iconst_1
    //   895: iadd
    //   896: iconst_1
    //   897: bastore
    //   898: return
    //   899: return
    //   900: aload_1
    //   901: iload_2
    //   902: iconst_2
    //   903: iadd
    //   904: invokestatic a : ([BI)I
    //   907: i2s
    //   908: aload_1
    //   909: iload_2
    //   910: iconst_4
    //   911: iadd
    //   912: invokestatic a : ([BI)I
    //   915: i2s
    //   916: iconst_0
    //   917: aload_1
    //   918: iload_2
    //   919: bipush #6
    //   921: iadd
    //   922: invokestatic a : ([BI)I
    //   925: i2s
    //   926: invokestatic a : (SSBI)V
    //   929: aload_1
    //   930: iload_2
    //   931: iconst_1
    //   932: iadd
    //   933: iconst_1
    //   934: bastore
    //   935: return
    //   936: aload_1
    //   937: iload_2
    //   938: bipush #7
    //   940: iadd
    //   941: baload
    //   942: ifeq -> 1020
    //   945: aload_1
    //   946: iload_2
    //   947: iconst_1
    //   948: iadd
    //   949: iconst_1
    //   950: bastore
    //   951: return
    //   952: aload_1
    //   953: iload_2
    //   954: iconst_4
    //   955: iadd
    //   956: invokestatic a : ([BI)I
    //   959: i2s
    //   960: dup
    //   961: istore_3
    //   962: sipush #10000
    //   965: if_icmpne -> 972
    //   968: sipush #-226
    //   971: istore_3
    //   972: iload_3
    //   973: bipush #30
    //   975: iadd
    //   976: i2s
    //   977: istore_3
    //   978: aload_1
    //   979: iload_2
    //   980: bipush #10
    //   982: iadd
    //   983: baload
    //   984: ifne -> 999
    //   987: iload_3
    //   988: bipush #7
    //   990: if_icmple -> 1012
    //   993: bipush #7
    //   995: istore_3
    //   996: goto -> 1012
    //   999: iload_3
    //   1000: sipush #240
    //   1003: if_icmple -> 1012
    //   1006: aload_1
    //   1007: iload_2
    //   1008: iconst_1
    //   1009: iadd
    //   1010: iconst_1
    //   1011: bastore
    //   1012: aload_1
    //   1013: iload_2
    //   1014: iconst_4
    //   1015: iadd
    //   1016: iload_3
    //   1017: invokestatic a : ([BIS)V
    //   1020: return
  }
  
  public final boolean a() {
    boolean bool = true;
    if (this.a[0] == 0) {
      short s = this.a[1];
      int j = 2 + (s << 2);
      byte b = 0;
      while (b < s) {
        int k = i.b((byte[])this.a, 2 + (b << 2));
        if (bool = (bool && this.a[j + 1] == 1) ? true : false) {
          j += k;
          b++;
        } 
      } 
    } else {
      bool = (this.a[1] == 1) ? true : false;
    } 
    return bool;
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: new java/io/ByteArrayInputStream
    //   3: dup
    //   4: getstatic c.b : Ljava/lang/String;
    //   7: getstatic c.a : Li;
    //   10: invokevirtual getClass : ()Ljava/lang/Class;
    //   13: pop
    //   14: iconst_0
    //   15: invokestatic a : (Ljava/lang/String;I)[B
    //   18: invokespecial <init> : ([B)V
    //   21: astore_2
    //   22: iconst_4
    //   23: newarray byte
    //   25: astore_3
    //   26: aload_2
    //   27: aload_3
    //   28: iconst_0
    //   29: iconst_2
    //   30: invokevirtual read : ([BII)I
    //   33: pop
    //   34: iconst_0
    //   35: istore #4
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: iconst_2
    //   41: invokevirtual read : ([BII)I
    //   44: pop
    //   45: aload_3
    //   46: iconst_0
    //   47: invokestatic a : ([BI)I
    //   50: i2s
    //   51: iload_1
    //   52: if_icmpne -> 2021
    //   55: aload_2
    //   56: aload_3
    //   57: iconst_0
    //   58: iconst_2
    //   59: invokevirtual read : ([BII)I
    //   62: pop
    //   63: aload_3
    //   64: iconst_0
    //   65: invokestatic a : ([BI)I
    //   68: i2s
    //   69: istore #5
    //   71: aload_2
    //   72: aload_3
    //   73: iconst_0
    //   74: iconst_4
    //   75: invokevirtual read : ([BII)I
    //   78: pop
    //   79: aload_3
    //   80: iconst_0
    //   81: invokestatic b : ([BI)I
    //   84: newarray byte
    //   86: astore_3
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual read : ([B)I
    //   92: pop
    //   93: aload_2
    //   94: invokevirtual close : ()V
    //   97: aconst_null
    //   98: astore_2
    //   99: iconst_1
    //   100: istore #4
    //   102: iconst_0
    //   103: istore #6
    //   105: aload_3
    //   106: iconst_0
    //   107: invokestatic a : ([BI)I
    //   110: i2s
    //   111: istore #7
    //   113: iinc #6, 2
    //   116: iload #7
    //   118: ifeq -> 451
    //   121: iload #7
    //   123: newarray short
    //   125: astore #8
    //   127: iconst_0
    //   128: istore #9
    //   130: iload #9
    //   132: iload #7
    //   134: if_icmpge -> 158
    //   137: aload #8
    //   139: iload #9
    //   141: aload_3
    //   142: iload #6
    //   144: invokestatic a : ([BI)I
    //   147: i2s
    //   148: sastore
    //   149: iinc #6, 2
    //   152: iinc #9, 1
    //   155: goto -> 130
    //   158: iconst_1
    //   159: istore #11
    //   161: iload #11
    //   163: iload #7
    //   165: if_icmpge -> 227
    //   168: aload #8
    //   170: iload #11
    //   172: saload
    //   173: istore #9
    //   175: iload #11
    //   177: dup
    //   178: istore #10
    //   180: ifle -> 214
    //   183: aload #8
    //   185: iload #10
    //   187: iconst_1
    //   188: isub
    //   189: saload
    //   190: iload #9
    //   192: if_icmple -> 214
    //   195: aload #8
    //   197: iload #10
    //   199: aload #8
    //   201: iload #10
    //   203: iconst_1
    //   204: isub
    //   205: saload
    //   206: sastore
    //   207: iload #10
    //   209: iconst_1
    //   210: isub
    //   211: goto -> 177
    //   214: aload #8
    //   216: iload #10
    //   218: iload #9
    //   220: sastore
    //   221: iinc #11, 1
    //   224: goto -> 161
    //   227: aload_0
    //   228: invokevirtual getClass : ()Ljava/lang/Class;
    //   231: getstatic c.a : Ljava/lang/String;
    //   234: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   237: astore #11
    //   239: iconst_4
    //   240: newarray byte
    //   242: astore #12
    //   244: aload #11
    //   246: aload #12
    //   248: iconst_0
    //   249: iconst_2
    //   250: invokevirtual read : ([BII)I
    //   253: pop
    //   254: aload #12
    //   256: iconst_0
    //   257: invokestatic a : ([BI)I
    //   260: i2s
    //   261: istore #13
    //   263: getstatic c.a : [Lf;
    //   266: ifnonnull -> 277
    //   269: iload #13
    //   271: anewarray f
    //   274: putstatic c.a : [Lf;
    //   277: iconst_0
    //   278: istore #14
    //   280: iload #14
    //   282: iload #7
    //   284: if_icmpge -> 446
    //   287: aload #8
    //   289: iload #14
    //   291: saload
    //   292: istore #15
    //   294: iconst_0
    //   295: istore #16
    //   297: iload #16
    //   299: ifne -> 440
    //   302: aload #11
    //   304: aload #12
    //   306: iconst_0
    //   307: iconst_2
    //   308: invokevirtual read : ([BII)I
    //   311: pop
    //   312: aload #12
    //   314: iconst_0
    //   315: invokestatic a : ([BI)I
    //   318: i2s
    //   319: istore #17
    //   321: iload #15
    //   323: iload #17
    //   325: if_icmpne -> 331
    //   328: iconst_1
    //   329: istore #16
    //   331: aload #11
    //   333: aload #12
    //   335: iconst_0
    //   336: iconst_4
    //   337: invokevirtual read : ([BII)I
    //   340: pop
    //   341: aload #12
    //   343: iconst_0
    //   344: invokestatic b : ([BI)I
    //   347: istore #18
    //   349: iload #16
    //   351: ifne -> 375
    //   354: getstatic c.a : [Lf;
    //   357: iload #15
    //   359: aaload
    //   360: ifnull -> 375
    //   363: aload #11
    //   365: iload #18
    //   367: i2l
    //   368: invokevirtual skip : (J)J
    //   371: pop2
    //   372: goto -> 297
    //   375: iload #18
    //   377: newarray byte
    //   379: astore #12
    //   381: aload #11
    //   383: aload #12
    //   385: invokevirtual read : ([B)I
    //   388: pop
    //   389: getstatic c.a : [Lf;
    //   392: iload #15
    //   394: new f
    //   397: dup
    //   398: invokespecial <init> : ()V
    //   401: aastore
    //   402: getstatic c.a : [Lf;
    //   405: iload #15
    //   407: aaload
    //   408: aload #12
    //   410: iconst_0
    //   411: invokevirtual a : ([BI)V
    //   414: getstatic c.a : [Lf;
    //   417: iload #15
    //   419: aaload
    //   420: iconst_0
    //   421: iconst_0
    //   422: iconst_m1
    //   423: iconst_m1
    //   424: invokevirtual a : (IIII)V
    //   427: getstatic c.a : [Lf;
    //   430: iload #15
    //   432: aaload
    //   433: aconst_null
    //   434: putfield d : [B
    //   437: goto -> 297
    //   440: iinc #14, 1
    //   443: goto -> 280
    //   446: aload #11
    //   448: invokevirtual close : ()V
    //   451: iload #5
    //   453: anewarray [B
    //   456: astore #8
    //   458: iconst_0
    //   459: istore #9
    //   461: aconst_null
    //   462: astore #10
    //   464: iconst_0
    //   465: istore #11
    //   467: iconst_0
    //   468: istore #13
    //   470: iconst_0
    //   471: istore #14
    //   473: iload #14
    //   475: iload #5
    //   477: if_icmplt -> 485
    //   480: iload #13
    //   482: ifeq -> 2012
    //   485: iload #13
    //   487: ifne -> 497
    //   490: aload #8
    //   492: astore #12
    //   494: goto -> 507
    //   497: aload #10
    //   499: astore #12
    //   501: iinc #13, -1
    //   504: iinc #14, -1
    //   507: aload_3
    //   508: iload #6
    //   510: iinc #6, 1
    //   513: baload
    //   514: sipush #255
    //   517: iand
    //   518: istore #15
    //   520: aconst_null
    //   521: astore #16
    //   523: iload #15
    //   525: tableswitch default -> 1801, 0 -> 1778, 1 -> 1144, 2 -> 1567, 3 -> 1801, 4 -> 985, 5 -> 1426, 6 -> 1239, 7 -> 1138, 8 -> 1801, 9 -> 1681, 10 -> 1750, 11 -> 794, 12 -> 842, 13 -> 890, 14 -> 979, 15 -> 979, 16 -> 739, 17 -> 739, 18 -> 652, 19 -> 1801, 20 -> 1801, 21 -> 1801, 22 -> 1801, 23 -> 1801, 24 -> 1801, 25 -> 1334, 26 -> 1266, 27 -> 1496
    //   652: aload_3
    //   653: iload #6
    //   655: iinc #6, 1
    //   658: baload
    //   659: sipush #255
    //   662: iand
    //   663: i2s
    //   664: istore #17
    //   666: aload_3
    //   667: iload #6
    //   669: iinc #6, 1
    //   672: baload
    //   673: sipush #255
    //   676: iand
    //   677: aload_3
    //   678: iload #6
    //   680: iinc #6, 1
    //   683: baload
    //   684: sipush #255
    //   687: iand
    //   688: bipush #8
    //   690: ishl
    //   691: iadd
    //   692: aload_3
    //   693: iload #6
    //   695: iinc #6, 1
    //   698: baload
    //   699: sipush #255
    //   702: iand
    //   703: bipush #16
    //   705: ishl
    //   706: iadd
    //   707: istore #18
    //   709: bipush #8
    //   711: newarray byte
    //   713: dup
    //   714: astore #16
    //   716: iconst_2
    //   717: iload #17
    //   719: invokestatic a : ([BIS)V
    //   722: aload #16
    //   724: iconst_3
    //   725: iload #18
    //   727: invokestatic a : ([BII)V
    //   730: aload #16
    //   732: bipush #7
    //   734: iconst_0
    //   735: bastore
    //   736: goto -> 1801
    //   739: aload_3
    //   740: iload #6
    //   742: invokestatic a : ([BI)I
    //   745: i2s
    //   746: istore #7
    //   748: iinc #6, 2
    //   751: aload_3
    //   752: iload #6
    //   754: iinc #6, 1
    //   757: baload
    //   758: sipush #255
    //   761: iand
    //   762: i2s
    //   763: istore #17
    //   765: bipush #6
    //   767: newarray byte
    //   769: dup
    //   770: astore #16
    //   772: iconst_2
    //   773: iload #7
    //   775: invokestatic a : ([BIS)V
    //   778: aload #16
    //   780: iconst_4
    //   781: iload #17
    //   783: invokestatic a : ([BIS)V
    //   786: aload #16
    //   788: iconst_5
    //   789: iconst_0
    //   790: bastore
    //   791: goto -> 1801
    //   794: aload_3
    //   795: iload #6
    //   797: invokestatic a : ([BI)I
    //   800: i2s
    //   801: istore #7
    //   803: iinc #6, 2
    //   806: aload_3
    //   807: iload #6
    //   809: invokestatic a : ([BI)I
    //   812: i2s
    //   813: istore #17
    //   815: iinc #6, 2
    //   818: bipush #6
    //   820: newarray byte
    //   822: dup
    //   823: astore #16
    //   825: iconst_2
    //   826: iload #7
    //   828: invokestatic a : ([BIS)V
    //   831: aload #16
    //   833: iconst_4
    //   834: iload #17
    //   836: invokestatic a : ([BIS)V
    //   839: goto -> 1801
    //   842: aload_3
    //   843: iload #6
    //   845: invokestatic a : ([BI)I
    //   848: i2s
    //   849: istore #7
    //   851: iinc #6, 2
    //   854: aload_3
    //   855: iload #6
    //   857: invokestatic a : ([BI)I
    //   860: i2s
    //   861: istore #17
    //   863: iinc #6, 2
    //   866: bipush #6
    //   868: newarray byte
    //   870: dup
    //   871: astore #16
    //   873: iconst_2
    //   874: iload #7
    //   876: invokestatic a : ([BIS)V
    //   879: aload #16
    //   881: iconst_4
    //   882: iload #17
    //   884: invokestatic a : ([BIS)V
    //   887: goto -> 1801
    //   890: aload_3
    //   891: iload #6
    //   893: invokestatic a : ([BI)I
    //   896: i2s
    //   897: istore #7
    //   899: iinc #6, 2
    //   902: aload_3
    //   903: iload #6
    //   905: invokestatic a : ([BI)I
    //   908: i2s
    //   909: istore #17
    //   911: iinc #6, 2
    //   914: aload_3
    //   915: iload #6
    //   917: invokestatic a : ([BI)I
    //   920: i2s
    //   921: istore #18
    //   923: iinc #6, 2
    //   926: bipush #12
    //   928: newarray byte
    //   930: dup
    //   931: astore #16
    //   933: iconst_2
    //   934: iload #7
    //   936: invokestatic a : ([BIS)V
    //   939: aload #16
    //   941: iconst_4
    //   942: iload #17
    //   944: invokestatic a : ([BIS)V
    //   947: aload #16
    //   949: bipush #6
    //   951: iload #18
    //   953: invokestatic a : ([BIS)V
    //   956: aload #16
    //   958: bipush #8
    //   960: sipush #10000
    //   963: invokestatic a : ([BIS)V
    //   966: aload #16
    //   968: bipush #10
    //   970: sipush #10000
    //   973: invokestatic a : ([BIS)V
    //   976: goto -> 1801
    //   979: iconst_2
    //   980: newarray byte
    //   982: goto -> 1799
    //   985: aload_3
    //   986: iload #6
    //   988: invokestatic a : ([BI)I
    //   991: i2s
    //   992: istore #17
    //   994: iinc #6, 2
    //   997: aload_3
    //   998: iload #6
    //   1000: invokestatic a : ([BI)I
    //   1003: i2s
    //   1004: istore #19
    //   1006: iinc #6, 2
    //   1009: aload_3
    //   1010: iload #6
    //   1012: invokestatic a : ([BI)I
    //   1015: i2s
    //   1016: istore #20
    //   1018: iinc #6, 2
    //   1021: aload_3
    //   1022: iload #6
    //   1024: invokestatic a : ([BI)I
    //   1027: i2s
    //   1028: istore #21
    //   1030: iinc #6, 2
    //   1033: aload_3
    //   1034: iload #6
    //   1036: invokestatic a : ([BI)I
    //   1039: i2s
    //   1040: istore #22
    //   1042: iinc #6, 2
    //   1045: aload_3
    //   1046: iload #6
    //   1048: invokestatic a : ([BI)I
    //   1051: i2s
    //   1052: istore #7
    //   1054: iinc #6, 2
    //   1057: aload_3
    //   1058: iload #6
    //   1060: invokestatic a : ([BI)I
    //   1063: i2s
    //   1064: istore #18
    //   1066: iinc #6, 2
    //   1069: bipush #16
    //   1071: newarray byte
    //   1073: dup
    //   1074: astore #16
    //   1076: iconst_2
    //   1077: iload #17
    //   1079: invokestatic a : ([BIS)V
    //   1082: aload #16
    //   1084: iconst_4
    //   1085: iload #19
    //   1087: invokestatic a : ([BIS)V
    //   1090: aload #16
    //   1092: bipush #6
    //   1094: iload #20
    //   1096: invokestatic a : ([BIS)V
    //   1099: aload #16
    //   1101: bipush #8
    //   1103: iload #21
    //   1105: invokestatic a : ([BIS)V
    //   1108: aload #16
    //   1110: bipush #10
    //   1112: iload #22
    //   1114: invokestatic a : ([BIS)V
    //   1117: aload #16
    //   1119: bipush #12
    //   1121: iload #7
    //   1123: invokestatic a : ([BIS)V
    //   1126: aload #16
    //   1128: bipush #14
    //   1130: iload #18
    //   1132: invokestatic a : ([BIS)V
    //   1135: goto -> 1801
    //   1138: iconst_2
    //   1139: newarray byte
    //   1141: goto -> 1799
    //   1144: aload_3
    //   1145: iload #6
    //   1147: invokestatic a : ([BI)I
    //   1150: bipush #24
    //   1152: imul
    //   1153: i2s
    //   1154: istore #7
    //   1156: iinc #6, 2
    //   1159: aload_3
    //   1160: iload #6
    //   1162: invokestatic a : ([BI)I
    //   1165: bipush #24
    //   1167: imul
    //   1168: i2s
    //   1169: istore #17
    //   1171: iinc #6, 2
    //   1174: aload_3
    //   1175: iload #6
    //   1177: invokestatic a : ([BI)I
    //   1180: i2s
    //   1181: istore #18
    //   1183: iinc #6, 2
    //   1186: bipush #12
    //   1188: newarray byte
    //   1190: dup
    //   1191: astore #16
    //   1193: iconst_2
    //   1194: iload #7
    //   1196: invokestatic a : ([BIS)V
    //   1199: aload #16
    //   1201: iconst_4
    //   1202: iload #17
    //   1204: invokestatic a : ([BIS)V
    //   1207: aload #16
    //   1209: bipush #6
    //   1211: iload #18
    //   1213: invokestatic a : ([BIS)V
    //   1216: aload #16
    //   1218: bipush #8
    //   1220: sipush #10000
    //   1223: invokestatic a : ([BIS)V
    //   1226: aload #16
    //   1228: bipush #10
    //   1230: sipush #10000
    //   1233: invokestatic a : ([BIS)V
    //   1236: goto -> 1801
    //   1239: aload_3
    //   1240: iload #6
    //   1242: invokestatic b : ([BI)I
    //   1245: istore #7
    //   1247: iinc #6, 4
    //   1250: bipush #6
    //   1252: newarray byte
    //   1254: dup
    //   1255: astore #16
    //   1257: iconst_2
    //   1258: iload #7
    //   1260: invokestatic a : ([BII)V
    //   1263: goto -> 1801
    //   1266: aload_3
    //   1267: iload #6
    //   1269: invokestatic a : ([BI)I
    //   1272: i2s
    //   1273: istore #7
    //   1275: iinc #6, 2
    //   1278: aload_3
    //   1279: iload #6
    //   1281: invokestatic a : ([BI)I
    //   1284: i2s
    //   1285: istore #17
    //   1287: iinc #6, 2
    //   1290: aload_3
    //   1291: iload #6
    //   1293: invokestatic b : ([BI)I
    //   1296: istore #18
    //   1298: iinc #6, 4
    //   1301: bipush #10
    //   1303: newarray byte
    //   1305: dup
    //   1306: astore #16
    //   1308: iconst_2
    //   1309: iload #7
    //   1311: invokestatic a : ([BIS)V
    //   1314: aload #16
    //   1316: iconst_4
    //   1317: iload #17
    //   1319: invokestatic a : ([BIS)V
    //   1322: aload #16
    //   1324: bipush #6
    //   1326: iload #18
    //   1328: invokestatic a : ([BII)V
    //   1331: goto -> 1801
    //   1334: aload_3
    //   1335: iload #6
    //   1337: invokestatic a : ([BI)I
    //   1340: i2s
    //   1341: istore #7
    //   1343: iinc #6, 2
    //   1346: aload_3
    //   1347: iload #6
    //   1349: invokestatic a : ([BI)I
    //   1352: i2s
    //   1353: istore #17
    //   1355: iinc #6, 2
    //   1358: aload_3
    //   1359: iload #6
    //   1361: iinc #6, 1
    //   1364: baload
    //   1365: sipush #255
    //   1368: iand
    //   1369: i2s
    //   1370: istore #18
    //   1372: aload_3
    //   1373: iload #6
    //   1375: iinc #6, 1
    //   1378: baload
    //   1379: sipush #255
    //   1382: iand
    //   1383: i2s
    //   1384: istore #19
    //   1386: bipush #8
    //   1388: newarray byte
    //   1390: dup
    //   1391: astore #16
    //   1393: iconst_2
    //   1394: iload #7
    //   1396: invokestatic a : ([BIS)V
    //   1399: aload #16
    //   1401: iconst_4
    //   1402: iload #17
    //   1404: invokestatic a : ([BIS)V
    //   1407: aload #16
    //   1409: bipush #6
    //   1411: iload #18
    //   1413: i2b
    //   1414: bastore
    //   1415: aload #16
    //   1417: bipush #7
    //   1419: iload #19
    //   1421: i2b
    //   1422: bastore
    //   1423: goto -> 1801
    //   1426: aload_3
    //   1427: iload #6
    //   1429: invokestatic a : ([BI)I
    //   1432: i2s
    //   1433: istore #7
    //   1435: iinc #6, 2
    //   1438: aload_3
    //   1439: iload #6
    //   1441: invokestatic a : ([BI)I
    //   1444: i2s
    //   1445: istore #17
    //   1447: iinc #6, 2
    //   1450: aload_3
    //   1451: iload #6
    //   1453: iinc #6, 1
    //   1456: baload
    //   1457: sipush #255
    //   1460: iand
    //   1461: i2s
    //   1462: istore #18
    //   1464: bipush #7
    //   1466: newarray byte
    //   1468: dup
    //   1469: astore #16
    //   1471: iconst_2
    //   1472: iload #7
    //   1474: invokestatic a : ([BIS)V
    //   1477: aload #16
    //   1479: iconst_4
    //   1480: iload #17
    //   1482: invokestatic a : ([BIS)V
    //   1485: aload #16
    //   1487: bipush #6
    //   1489: iload #18
    //   1491: i2b
    //   1492: bastore
    //   1493: goto -> 1801
    //   1496: aload_3
    //   1497: iload #6
    //   1499: invokestatic a : ([BI)I
    //   1502: i2s
    //   1503: istore #7
    //   1505: iinc #6, 2
    //   1508: iload #7
    //   1510: bipush #8
    //   1512: iadd
    //   1513: newarray byte
    //   1515: dup
    //   1516: astore #16
    //   1518: iconst_2
    //   1519: iload #7
    //   1521: invokestatic a : ([BIS)V
    //   1524: aload #16
    //   1526: iconst_4
    //   1527: sipush #10000
    //   1530: invokestatic a : ([BIS)V
    //   1533: aload #16
    //   1535: bipush #6
    //   1537: iconst_0
    //   1538: bastore
    //   1539: aload #16
    //   1541: bipush #7
    //   1543: iconst_0
    //   1544: bastore
    //   1545: aload_3
    //   1546: iload #6
    //   1548: aload #16
    //   1550: bipush #8
    //   1552: iload #7
    //   1554: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1557: iload #6
    //   1559: iload #7
    //   1561: iadd
    //   1562: istore #6
    //   1564: goto -> 1801
    //   1567: aload_3
    //   1568: iload #6
    //   1570: iinc #6, 1
    //   1573: baload
    //   1574: sipush #255
    //   1577: iand
    //   1578: i2s
    //   1579: istore #18
    //   1581: aload_3
    //   1582: iload #6
    //   1584: invokestatic a : ([BI)I
    //   1587: i2s
    //   1588: istore #17
    //   1590: iinc #6, 2
    //   1593: aload_3
    //   1594: iload #6
    //   1596: invokestatic a : ([BI)I
    //   1599: i2s
    //   1600: istore #7
    //   1602: iinc #6, 2
    //   1605: iload #7
    //   1607: bipush #11
    //   1609: iadd
    //   1610: newarray byte
    //   1612: dup
    //   1613: astore #16
    //   1615: iconst_2
    //   1616: iload #7
    //   1618: invokestatic a : ([BIS)V
    //   1621: aload #16
    //   1623: iconst_4
    //   1624: sipush #10000
    //   1627: invokestatic a : ([BIS)V
    //   1630: aload #16
    //   1632: bipush #6
    //   1634: iload #17
    //   1636: invokestatic a : ([BIS)V
    //   1639: aload #16
    //   1641: bipush #8
    //   1643: iload #18
    //   1645: i2b
    //   1646: bastore
    //   1647: aload #16
    //   1649: bipush #9
    //   1651: iconst_0
    //   1652: bastore
    //   1653: aload #16
    //   1655: bipush #10
    //   1657: iconst_0
    //   1658: bastore
    //   1659: aload_3
    //   1660: iload #6
    //   1662: aload #16
    //   1664: bipush #11
    //   1666: iload #7
    //   1668: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1671: iload #6
    //   1673: iload #7
    //   1675: iadd
    //   1676: istore #6
    //   1678: goto -> 1801
    //   1681: aload_3
    //   1682: iload #6
    //   1684: invokestatic a : ([BI)I
    //   1687: i2s
    //   1688: istore #7
    //   1690: iinc #6, 2
    //   1693: aload_3
    //   1694: iload #6
    //   1696: invokestatic a : ([BI)I
    //   1699: i2s
    //   1700: istore #17
    //   1702: iinc #6, 2
    //   1705: aload_3
    //   1706: iload #6
    //   1708: invokestatic a : ([BI)I
    //   1711: i2s
    //   1712: istore #18
    //   1714: iinc #6, 2
    //   1717: bipush #8
    //   1719: newarray byte
    //   1721: dup
    //   1722: astore #16
    //   1724: iconst_2
    //   1725: iload #7
    //   1727: invokestatic a : ([BIS)V
    //   1730: aload #16
    //   1732: iconst_4
    //   1733: iload #17
    //   1735: invokestatic a : ([BIS)V
    //   1738: aload #16
    //   1740: bipush #6
    //   1742: iload #18
    //   1744: invokestatic a : ([BIS)V
    //   1747: goto -> 1801
    //   1750: aload_3
    //   1751: iload #6
    //   1753: iinc #6, 1
    //   1756: baload
    //   1757: sipush #255
    //   1760: iand
    //   1761: i2s
    //   1762: istore #7
    //   1764: iconst_3
    //   1765: newarray byte
    //   1767: dup
    //   1768: astore #16
    //   1770: iconst_2
    //   1771: iload #7
    //   1773: i2b
    //   1774: bastore
    //   1775: goto -> 1801
    //   1778: aload_3
    //   1779: iload #6
    //   1781: iinc #6, 1
    //   1784: baload
    //   1785: sipush #255
    //   1788: iand
    //   1789: i2s
    //   1790: dup
    //   1791: istore #13
    //   1793: anewarray [B
    //   1796: astore #10
    //   1798: aconst_null
    //   1799: astore #16
    //   1801: aload #16
    //   1803: ifnull -> 1848
    //   1806: aload #16
    //   1808: iconst_0
    //   1809: iload #15
    //   1811: i2b
    //   1812: bastore
    //   1813: aload #16
    //   1815: iconst_1
    //   1816: iconst_0
    //   1817: bastore
    //   1818: aload #12
    //   1820: aload #10
    //   1822: if_acmpne -> 1838
    //   1825: aload #12
    //   1827: iload #11
    //   1829: aload #16
    //   1831: aastore
    //   1832: iinc #11, 1
    //   1835: goto -> 1848
    //   1838: aload #12
    //   1840: iload #9
    //   1842: aload #16
    //   1844: aastore
    //   1845: iinc #9, 1
    //   1848: aload #12
    //   1850: aload #10
    //   1852: if_acmpne -> 2006
    //   1855: iload #13
    //   1857: ifne -> 2006
    //   1860: iconst_0
    //   1861: istore #17
    //   1863: iconst_0
    //   1864: istore #18
    //   1866: iload #18
    //   1868: aload #10
    //   1870: arraylength
    //   1871: if_icmpge -> 1891
    //   1874: iload #17
    //   1876: aload #10
    //   1878: iload #18
    //   1880: aaload
    //   1881: arraylength
    //   1882: iadd
    //   1883: istore #17
    //   1885: iinc #18, 1
    //   1888: goto -> 1866
    //   1891: iconst_2
    //   1892: aload #10
    //   1894: arraylength
    //   1895: iconst_2
    //   1896: ishl
    //   1897: iadd
    //   1898: iload #17
    //   1900: iadd
    //   1901: newarray byte
    //   1903: dup
    //   1904: astore #16
    //   1906: iconst_0
    //   1907: iconst_0
    //   1908: bastore
    //   1909: aload #16
    //   1911: iconst_1
    //   1912: aload #10
    //   1914: arraylength
    //   1915: i2b
    //   1916: bastore
    //   1917: iconst_2
    //   1918: aload #10
    //   1920: arraylength
    //   1921: iconst_2
    //   1922: ishl
    //   1923: iadd
    //   1924: istore #18
    //   1926: iconst_0
    //   1927: istore #7
    //   1929: iload #7
    //   1931: aload #10
    //   1933: arraylength
    //   1934: if_icmpge -> 1990
    //   1937: aload #16
    //   1939: iconst_2
    //   1940: iload #7
    //   1942: iconst_2
    //   1943: ishl
    //   1944: iadd
    //   1945: aload #10
    //   1947: iload #7
    //   1949: aaload
    //   1950: arraylength
    //   1951: invokestatic a : ([BII)V
    //   1954: aload #10
    //   1956: iload #7
    //   1958: aaload
    //   1959: iconst_0
    //   1960: aload #16
    //   1962: iload #18
    //   1964: aload #10
    //   1966: iload #7
    //   1968: aaload
    //   1969: arraylength
    //   1970: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1973: iload #18
    //   1975: aload #10
    //   1977: iload #7
    //   1979: aaload
    //   1980: arraylength
    //   1981: iadd
    //   1982: istore #18
    //   1984: iinc #7, 1
    //   1987: goto -> 1929
    //   1990: aload #8
    //   1992: iload #9
    //   1994: aload #16
    //   1996: aastore
    //   1997: iconst_0
    //   1998: istore #11
    //   2000: aconst_null
    //   2001: astore #10
    //   2003: iinc #9, 1
    //   2006: iinc #14, 1
    //   2009: goto -> 473
    //   2012: aload_0
    //   2013: aload #8
    //   2015: putfield a : [[B
    //   2018: goto -> 2052
    //   2021: aload_2
    //   2022: ldc2_w 2
    //   2025: invokevirtual skip : (J)J
    //   2028: pop2
    //   2029: aload_2
    //   2030: aload_3
    //   2031: iconst_0
    //   2032: iconst_4
    //   2033: invokevirtual read : ([BII)I
    //   2036: pop
    //   2037: aload_3
    //   2038: iconst_0
    //   2039: invokestatic b : ([BI)I
    //   2042: istore #5
    //   2044: aload_2
    //   2045: iload #5
    //   2047: i2l
    //   2048: invokevirtual skip : (J)J
    //   2051: pop2
    //   2052: iload #4
    //   2054: ifeq -> 37
    //   2057: return
    //   2058: pop
    //   2059: return
    // Exception table:
    //   from	to	target	type
    //   0	2057	2058	java/lang/Exception
  }
  
  public static int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    String[] arrayOfString = a(paramString, paramInt3);
    for (paramInt3 = 0; paramInt3 < arrayOfString.length; paramInt3++) {
      i.a.b(paramGraphics, arrayOfString[paramInt3], paramInt1, paramInt2, 17);
      paramInt2 += ((h)i.a).a.getHeight();
    } 
    return paramInt2;
  }
  
  private static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 += 14;
    try {
      String[] arrayOfString = a(paramString, paramInt3);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b] == null)
          return; 
        if (arrayOfString[b].trim().equals("") || arrayOfString[b].trim().equals(" "))
          return; 
        i.a.b(paramGraphics, arrayOfString[b], paramInt1, paramInt2, i.b ? 8 : 4);
        paramInt2 += ((h)i.a).a.getHeight();
      } 
      return;
    } catch (Exception exception) {
      null.printStackTrace();
      return;
    } 
  }
  
  public static String[] a(String paramString, int paramInt) {
    // Byte code:
    //   0: new java/util/Vector
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: ldc ''
    //   10: astore_3
    //   11: aload_0
    //   12: bipush #32
    //   14: invokestatic a : (Ljava/lang/String;C)[Ljava/lang/String;
    //   17: astore_0
    //   18: iconst_0
    //   19: istore #4
    //   21: iload #4
    //   23: aload_0
    //   24: arraylength
    //   25: if_icmpge -> 745
    //   28: aload_0
    //   29: iload #4
    //   31: aaload
    //   32: astore #5
    //   34: getstatic i.a : Lh;
    //   37: getfield a : Ljavax/microedition/lcdui/Font;
    //   40: aload #5
    //   42: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   45: iload_1
    //   46: if_icmplt -> 360
    //   49: new java/lang/StringBuffer
    //   52: dup
    //   53: invokespecial <init> : ()V
    //   56: aload_3
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: aload #5
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: iload_1
    //   69: invokestatic b : (Ljava/lang/String;I)[Ljava/lang/String;
    //   72: dup
    //   73: astore_3
    //   74: arraylength
    //   75: iconst_1
    //   76: if_icmple -> 235
    //   79: aload_3
    //   80: aload_3
    //   81: arraylength
    //   82: iconst_1
    //   83: isub
    //   84: aaload
    //   85: invokevirtual trim : ()Ljava/lang/String;
    //   88: dup
    //   89: astore #5
    //   91: invokevirtual length : ()I
    //   94: iconst_1
    //   95: if_icmpne -> 235
    //   98: aload #5
    //   100: ldc '.'
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifne -> 168
    //   108: aload #5
    //   110: ldc ','
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifne -> 168
    //   118: aload #5
    //   120: ldc ';'
    //   122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   125: ifne -> 168
    //   128: aload #5
    //   130: ldc '?'
    //   132: invokevirtual equals : (Ljava/lang/Object;)Z
    //   135: ifne -> 168
    //   138: aload #5
    //   140: ldc '''
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifne -> 168
    //   148: aload #5
    //   150: ldc '"'
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: ifne -> 168
    //   158: aload #5
    //   160: ldc '!'
    //   162: invokevirtual equals : (Ljava/lang/Object;)Z
    //   165: ifeq -> 235
    //   168: aload_3
    //   169: aload_3
    //   170: arraylength
    //   171: iconst_2
    //   172: isub
    //   173: aaload
    //   174: astore #6
    //   176: new java/lang/StringBuffer
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: aload #6
    //   185: aload #6
    //   187: invokevirtual length : ()I
    //   190: iconst_1
    //   191: isub
    //   192: invokevirtual charAt : (I)C
    //   195: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   198: aload #5
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   203: invokevirtual toString : ()Ljava/lang/String;
    //   206: astore #5
    //   208: aload_3
    //   209: aload_3
    //   210: arraylength
    //   211: iconst_2
    //   212: isub
    //   213: aload #6
    //   215: iconst_0
    //   216: aload #6
    //   218: invokevirtual length : ()I
    //   221: iconst_1
    //   222: isub
    //   223: invokevirtual substring : (II)Ljava/lang/String;
    //   226: aastore
    //   227: aload_3
    //   228: aload_3
    //   229: arraylength
    //   230: iconst_1
    //   231: isub
    //   232: aload #5
    //   234: aastore
    //   235: aload_3
    //   236: astore #6
    //   238: iconst_0
    //   239: istore_3
    //   240: iload_3
    //   241: aload #6
    //   243: arraylength
    //   244: iconst_1
    //   245: isub
    //   246: if_icmpge -> 294
    //   249: aload #6
    //   251: iload_3
    //   252: aaload
    //   253: ifnull -> 288
    //   256: aload #6
    //   258: iload_3
    //   259: aaload
    //   260: ldc ''
    //   262: invokevirtual equals : (Ljava/lang/Object;)Z
    //   265: ifne -> 288
    //   268: aload #6
    //   270: iload_3
    //   271: aaload
    //   272: ldc ' '
    //   274: invokevirtual equals : (Ljava/lang/Object;)Z
    //   277: ifne -> 288
    //   280: aload_2
    //   281: aload #6
    //   283: iload_3
    //   284: aaload
    //   285: invokevirtual addElement : (Ljava/lang/Object;)V
    //   288: iinc #3, 1
    //   291: goto -> 240
    //   294: new java/lang/StringBuffer
    //   297: dup
    //   298: invokespecial <init> : ()V
    //   301: ldc ''
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   306: aload #6
    //   308: aload #6
    //   310: arraylength
    //   311: iconst_1
    //   312: isub
    //   313: aaload
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   317: ldc ' '
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   322: invokevirtual toString : ()Ljava/lang/String;
    //   325: astore_3
    //   326: iload #4
    //   328: aload_0
    //   329: arraylength
    //   330: iconst_1
    //   331: isub
    //   332: if_icmpne -> 739
    //   335: aload_3
    //   336: ifnull -> 739
    //   339: aload_3
    //   340: ldc ''
    //   342: invokevirtual equals : (Ljava/lang/Object;)Z
    //   345: ifne -> 739
    //   348: aload_3
    //   349: ldc ' '
    //   351: invokevirtual equals : (Ljava/lang/Object;)Z
    //   354: ifne -> 739
    //   357: goto -> 734
    //   360: getstatic i.a : Lh;
    //   363: getfield a : Ljavax/microedition/lcdui/Font;
    //   366: new java/lang/StringBuffer
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: aload_3
    //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   377: aload #5
    //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   382: ldc ' '
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   387: invokevirtual toString : ()Ljava/lang/String;
    //   390: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   393: iload_1
    //   394: if_icmpge -> 648
    //   397: aload_0
    //   398: arraylength
    //   399: iconst_2
    //   400: if_icmple -> 638
    //   403: iload #4
    //   405: aload_0
    //   406: arraylength
    //   407: iconst_2
    //   408: isub
    //   409: if_icmpne -> 638
    //   412: aload_0
    //   413: aload_0
    //   414: arraylength
    //   415: iconst_1
    //   416: isub
    //   417: aaload
    //   418: invokevirtual trim : ()Ljava/lang/String;
    //   421: dup
    //   422: astore #6
    //   424: invokevirtual length : ()I
    //   427: iconst_1
    //   428: if_icmpne -> 638
    //   431: getstatic i.a : Lh;
    //   434: getfield a : Ljavax/microedition/lcdui/Font;
    //   437: new java/lang/StringBuffer
    //   440: dup
    //   441: invokespecial <init> : ()V
    //   444: aload_3
    //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   448: ldc ' '
    //   450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   453: aload #5
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   458: ldc ' '
    //   460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   463: aload #6
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   468: invokevirtual toString : ()Ljava/lang/String;
    //   471: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   474: iload_1
    //   475: if_icmplt -> 638
    //   478: aload #6
    //   480: ldc '.'
    //   482: invokevirtual equals : (Ljava/lang/Object;)Z
    //   485: ifne -> 548
    //   488: aload #6
    //   490: ldc ','
    //   492: invokevirtual equals : (Ljava/lang/Object;)Z
    //   495: ifne -> 548
    //   498: aload #6
    //   500: ldc ';'
    //   502: invokevirtual equals : (Ljava/lang/Object;)Z
    //   505: ifne -> 548
    //   508: aload #6
    //   510: ldc '?'
    //   512: invokevirtual equals : (Ljava/lang/Object;)Z
    //   515: ifne -> 548
    //   518: aload #6
    //   520: ldc '''
    //   522: invokevirtual equals : (Ljava/lang/Object;)Z
    //   525: ifne -> 548
    //   528: aload #6
    //   530: ldc '"'
    //   532: invokevirtual equals : (Ljava/lang/Object;)Z
    //   535: ifne -> 548
    //   538: aload #6
    //   540: ldc '!'
    //   542: invokevirtual equals : (Ljava/lang/Object;)Z
    //   545: ifeq -> 638
    //   548: aload_3
    //   549: ifnull -> 575
    //   552: aload_3
    //   553: ldc ''
    //   555: invokevirtual equals : (Ljava/lang/Object;)Z
    //   558: ifne -> 575
    //   561: aload_3
    //   562: ldc ' '
    //   564: invokevirtual equals : (Ljava/lang/Object;)Z
    //   567: ifne -> 575
    //   570: aload_2
    //   571: aload_3
    //   572: invokevirtual addElement : (Ljava/lang/Object;)V
    //   575: ldc ''
    //   577: astore_3
    //   578: new java/lang/StringBuffer
    //   581: dup
    //   582: invokespecial <init> : ()V
    //   585: aload_3
    //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   589: aload #5
    //   591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   594: ldc ' '
    //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   599: aload #6
    //   601: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   604: invokevirtual toString : ()Ljava/lang/String;
    //   607: dup
    //   608: astore_3
    //   609: ifnull -> 745
    //   612: aload_3
    //   613: ldc ''
    //   615: invokevirtual equals : (Ljava/lang/Object;)Z
    //   618: ifne -> 745
    //   621: aload_3
    //   622: ldc ' '
    //   624: invokevirtual equals : (Ljava/lang/Object;)Z
    //   627: ifne -> 745
    //   630: aload_2
    //   631: aload_3
    //   632: invokevirtual addElement : (Ljava/lang/Object;)V
    //   635: goto -> 745
    //   638: new java/lang/StringBuffer
    //   641: dup
    //   642: invokespecial <init> : ()V
    //   645: goto -> 685
    //   648: aload_3
    //   649: ifnull -> 675
    //   652: aload_3
    //   653: ldc ''
    //   655: invokevirtual equals : (Ljava/lang/Object;)Z
    //   658: ifne -> 675
    //   661: aload_3
    //   662: ldc ' '
    //   664: invokevirtual equals : (Ljava/lang/Object;)Z
    //   667: ifne -> 675
    //   670: aload_2
    //   671: aload_3
    //   672: invokevirtual addElement : (Ljava/lang/Object;)V
    //   675: ldc ''
    //   677: astore_3
    //   678: new java/lang/StringBuffer
    //   681: dup
    //   682: invokespecial <init> : ()V
    //   685: aload_3
    //   686: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   689: aload #5
    //   691: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   694: ldc ' '
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   699: invokevirtual toString : ()Ljava/lang/String;
    //   702: astore_3
    //   703: iload #4
    //   705: aload_0
    //   706: arraylength
    //   707: iconst_1
    //   708: isub
    //   709: if_icmpne -> 739
    //   712: aload_3
    //   713: ifnull -> 739
    //   716: aload_3
    //   717: ldc ''
    //   719: invokevirtual equals : (Ljava/lang/Object;)Z
    //   722: ifne -> 739
    //   725: aload_3
    //   726: ldc ' '
    //   728: invokevirtual equals : (Ljava/lang/Object;)Z
    //   731: ifne -> 739
    //   734: aload_2
    //   735: aload_3
    //   736: invokevirtual addElement : (Ljava/lang/Object;)V
    //   739: iinc #4, 1
    //   742: goto -> 21
    //   745: aload_2
    //   746: invokestatic a : (Ljava/util/Vector;)[Ljava/lang/String;
    //   749: areturn
  }
  
  private static String[] b(String paramString, int paramInt) {
    Vector vector = new Vector();
    String str = "";
    for (byte b = 0; b < paramString.length(); b++) {
      char c1 = paramString.charAt(b);
      vector.addElement(str);
      str = ((((h)i.a).a.stringWidth(str + c1) < paramInt) ? str : "") + c1;
      if (b == paramString.length() - 1 && str != null && !str.equals("") && !str.equals(" "))
        vector.addElement(str); 
    } 
    return a(vector);
  }
  
  private static String[] a(Vector paramVector) {
    String[] arrayOfString = new String[paramVector.size()];
    Enumeration enumeration = paramVector.elements();
    for (byte b = 0; enumeration.hasMoreElements(); b++) {
      String str;
      if (!(str = ((String)enumeration.nextElement()).trim()).equals("") && !str.equals(" "))
        arrayOfString[b] = str; 
    } 
    return arrayOfString;
  }
  
  public static String[] a(String paramString, char paramChar) {
    Vector vector = new Vector();
    String str = "";
    for (byte b = 0; b < paramString.length(); b++) {
      char c1;
      if ((c1 = paramString.charAt(b)) != paramChar)
        str = str + c1; 
      if (c1 == paramChar || c1 == '\n' || b == paramString.length() - 1) {
        vector.addElement(str);
        str = "";
      } 
    } 
    return a(vector);
  }
  
  private void a(String paramString, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield h : I
    //   5: aload_1
    //   6: invokevirtual length : ()I
    //   9: istore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: iconst_0
    //   17: istore #6
    //   19: iload #6
    //   21: iload_3
    //   22: if_icmpge -> 288
    //   25: aload_1
    //   26: iload_3
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual charAt : (I)C
    //   32: bipush #10
    //   34: if_icmpne -> 38
    //   37: return
    //   38: aload_1
    //   39: iload #6
    //   41: invokevirtual charAt : (I)C
    //   44: dup
    //   45: istore #7
    //   47: bipush #32
    //   49: if_icmple -> 72
    //   52: iload #4
    //   54: getstatic i.a : Lh;
    //   57: getfield a : Ljavax/microedition/lcdui/Font;
    //   60: iload #7
    //   62: i2c
    //   63: invokevirtual charWidth : (C)I
    //   66: iadd
    //   67: istore #4
    //   69: goto -> 231
    //   72: iload #7
    //   74: bipush #32
    //   76: if_icmpne -> 172
    //   79: iload #6
    //   81: iconst_1
    //   82: iadd
    //   83: iload_3
    //   84: if_icmpge -> 172
    //   87: aload_1
    //   88: iload #6
    //   90: iconst_1
    //   91: iadd
    //   92: invokevirtual charAt : (I)C
    //   95: bipush #63
    //   97: if_icmpeq -> 126
    //   100: aload_1
    //   101: iload #6
    //   103: iconst_1
    //   104: iadd
    //   105: invokevirtual charAt : (I)C
    //   108: bipush #33
    //   110: if_icmpeq -> 126
    //   113: aload_1
    //   114: iload #6
    //   116: iconst_1
    //   117: iadd
    //   118: invokevirtual charAt : (I)C
    //   121: bipush #58
    //   123: if_icmpne -> 172
    //   126: iload #4
    //   128: getstatic i.a : Lh;
    //   131: getfield a : Ljavax/microedition/lcdui/Font;
    //   134: iload #7
    //   136: i2c
    //   137: invokevirtual charWidth : (C)I
    //   140: iadd
    //   141: istore #4
    //   143: aload_1
    //   144: iload #6
    //   146: iconst_1
    //   147: iadd
    //   148: invokevirtual charAt : (I)C
    //   151: pop
    //   152: iload #4
    //   154: getstatic i.a : Lh;
    //   157: getfield a : Ljavax/microedition/lcdui/Font;
    //   160: iload #7
    //   162: i2c
    //   163: invokevirtual charWidth : (C)I
    //   166: iadd
    //   167: istore #4
    //   169: goto -> 231
    //   172: iload #7
    //   174: bipush #32
    //   176: if_icmpne -> 199
    //   179: iload #4
    //   181: getstatic i.a : Lh;
    //   184: getfield a : Ljavax/microedition/lcdui/Font;
    //   187: iload #7
    //   189: i2c
    //   190: invokevirtual charWidth : (C)I
    //   193: iadd
    //   194: istore #4
    //   196: goto -> 276
    //   199: iload #7
    //   201: bipush #10
    //   203: if_icmpne -> 282
    //   206: iconst_0
    //   207: istore #4
    //   209: aload_0
    //   210: getfield a : [S
    //   213: aload_0
    //   214: dup
    //   215: getfield h : I
    //   218: dup_x1
    //   219: iconst_1
    //   220: iadd
    //   221: putfield h : I
    //   224: iload #6
    //   226: i2s
    //   227: sastore
    //   228: goto -> 282
    //   231: iload #4
    //   233: iload_2
    //   234: if_icmple -> 265
    //   237: iload #5
    //   239: iconst_1
    //   240: isub
    //   241: istore #6
    //   243: aload_0
    //   244: getfield a : [S
    //   247: aload_0
    //   248: dup
    //   249: getfield h : I
    //   252: dup_x1
    //   253: iconst_1
    //   254: iadd
    //   255: putfield h : I
    //   258: iload #6
    //   260: i2s
    //   261: sastore
    //   262: iconst_0
    //   263: istore #4
    //   265: aload_1
    //   266: iload #6
    //   268: invokevirtual charAt : (I)C
    //   271: bipush #32
    //   273: if_icmpne -> 282
    //   276: iload #6
    //   278: iconst_1
    //   279: iadd
    //   280: istore #5
    //   282: iinc #6, 1
    //   285: goto -> 19
    //   288: aload_0
    //   289: getfield a : [S
    //   292: aload_0
    //   293: dup
    //   294: getfield h : I
    //   297: dup_x1
    //   298: iconst_1
    //   299: iadd
    //   300: putfield h : I
    //   303: iload_3
    //   304: i2s
    //   305: sastore
    //   306: return
    //   307: pop
    //   308: return
    // Exception table:
    //   from	to	target	type
    //   0	37	307	java/lang/Exception
    //   38	306	307	java/lang/Exception
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt, short paramShort) {
    paramArrayOfbyte[paramInt] = (byte)paramShort;
    paramArrayOfbyte[paramInt + 1] = (byte)(paramShort >> 8);
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1] = (byte)paramInt2;
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 >> 8);
    paramArrayOfbyte[paramInt1 + 2] = (byte)(paramInt2 >> 16);
    paramArrayOfbyte[paramInt1 + 3] = (byte)(paramInt2 >>> 24);
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */