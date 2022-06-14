import javax.microedition.lcdui.Graphics;

public final class c {
  public static long a = 1000L;

  public static String a = "/demoSpr.bin";

  public static String b = "/demo.f";

  public static a[] a = null;

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

  public final short[] a = (short[])null;

  public int h;

  public c(i parami) {
    this.a = false;
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
    this.a = (short[])parami;
  }

  private void a(Graphics paramGraphics, byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_2
    //   6: iload_3
    //   7: iconst_0
    //   8: iadd
    //   9: baload
    //   10: dup
    //   11: istore #13
    //   13: lookupswitch default -> 1314, 1 -> 271, 2 -> 1098, 4 -> 773, 12 -> 149, 13 -> 643, 18 -> 80, 27 -> 925
    //   80: aload_2
    //   81: iload_3
    //   82: bipush #7
    //   84: iadd
    //   85: baload
    //   86: ifeq -> 1314
    //   89: aload_2
    //   90: iload_3
    //   91: iconst_3
    //   92: iadd
    //   93: baload
    //   94: sipush #255
    //   97: iand
    //   98: aload_2
    //   99: iload_3
    //   100: iconst_3
    //   101: iadd
    //   102: iconst_1
    //   103: iadd
    //   104: baload
    //   105: sipush #255
    //   108: iand
    //   109: bipush #8
    //   111: ishl
    //   112: iadd
    //   113: aload_2
    //   114: iload_3
    //   115: iconst_3
    //   116: iadd
    //   117: iconst_2
    //   118: iadd
    //   119: baload
    //   120: sipush #255
    //   123: iand
    //   124: bipush #16
    //   126: ishl
    //   127: iadd
    //   128: istore #14
    //   130: aload_1
    //   131: iload #14
    //   133: invokevirtual setColor : (I)V
    //   136: aload_1
    //   137: iconst_0
    //   138: iconst_0
    //   139: sipush #240
    //   142: sipush #320
    //   145: invokevirtual fillRect : (IIII)V
    //   148: return
    //   149: aload_0
    //   150: getfield b : I
    //   153: istore #14
    //   155: aload_1
    //   156: ldc 16777215
    //   158: invokevirtual setColor : (I)V
    //   161: iload #14
    //   163: iconst_5
    //   164: if_icmple -> 170
    //   167: iconst_5
    //   168: istore #14
    //   170: aload_0
    //   171: getfield a : Li;
    //   174: getfield aP : I
    //   177: bipush #24
    //   179: imul
    //   180: istore #15
    //   182: aload_0
    //   183: getfield a : Li;
    //   186: getfield aQ : I
    //   189: bipush #24
    //   191: imul
    //   192: istore #16
    //   194: aload_0
    //   195: getfield c : I
    //   198: istore #17
    //   200: aload_0
    //   201: getfield d : I
    //   204: istore #18
    //   206: aload_1
    //   207: iload #15
    //   209: aload_0
    //   210: getfield a : Li;
    //   213: getfield ar : I
    //   216: isub
    //   217: iconst_5
    //   218: iload #14
    //   220: isub
    //   221: imul
    //   222: iload #17
    //   224: iload #14
    //   226: imul
    //   227: iadd
    //   228: iconst_5
    //   229: idiv
    //   230: iload #16
    //   232: aload_0
    //   233: getfield a : Li;
    //   236: getfield as : I
    //   239: isub
    //   240: iconst_5
    //   241: iload #14
    //   243: isub
    //   244: imul
    //   245: iload #18
    //   247: iload #14
    //   249: imul
    //   250: iadd
    //   251: iconst_5
    //   252: idiv
    //   253: bipush #102
    //   255: iload #14
    //   257: imul
    //   258: iconst_5
    //   259: idiv
    //   260: bipush #38
    //   262: iload #14
    //   264: imul
    //   265: iconst_5
    //   266: idiv
    //   267: invokevirtual fillRect : (IIII)V
    //   270: return
    //   271: aload_0
    //   272: getfield b : I
    //   275: istore #14
    //   277: aload_2
    //   278: iload_3
    //   279: iconst_2
    //   280: iadd
    //   281: invokestatic a : ([BI)I
    //   284: i2s
    //   285: istore #4
    //   287: aload_2
    //   288: iload_3
    //   289: iconst_4
    //   290: iadd
    //   291: invokestatic a : ([BI)I
    //   294: i2s
    //   295: istore #5
    //   297: aload_2
    //   298: iload_3
    //   299: bipush #6
    //   301: iadd
    //   302: invokestatic a : ([BI)I
    //   305: i2s
    //   306: istore #10
    //   308: aload_2
    //   309: iload_3
    //   310: bipush #8
    //   312: iadd
    //   313: invokestatic a : ([BI)I
    //   316: i2s
    //   317: istore #6
    //   319: aload_2
    //   320: iload_3
    //   321: bipush #10
    //   323: iadd
    //   324: invokestatic a : ([BI)I
    //   327: i2s
    //   328: istore #7
    //   330: iload #6
    //   332: sipush #10000
    //   335: if_icmpne -> 348
    //   338: aload_0
    //   339: getfield a : Li;
    //   342: getfield at : I
    //   345: i2s
    //   346: istore #6
    //   348: iload #7
    //   350: sipush #10000
    //   353: if_icmpne -> 366
    //   356: aload_0
    //   357: getfield a : Li;
    //   360: getfield au : I
    //   363: i2s
    //   364: istore #7
    //   366: iload #14
    //   368: iload #10
    //   370: if_icmple -> 377
    //   373: iload #10
    //   375: istore #14
    //   377: iload #4
    //   379: bipush #108
    //   381: isub
    //   382: i2s
    //   383: istore #4
    //   385: iload #5
    //   387: bipush #108
    //   389: isub
    //   390: i2s
    //   391: istore #5
    //   393: aload_0
    //   394: getfield a : Li;
    //   397: iload #4
    //   399: iload #14
    //   401: imul
    //   402: iload #6
    //   404: iload #10
    //   406: iload #14
    //   408: isub
    //   409: imul
    //   410: iadd
    //   411: iload #10
    //   413: idiv
    //   414: i2s
    //   415: putfield at : I
    //   418: aload_0
    //   419: getfield a : Li;
    //   422: iload #5
    //   424: iload #14
    //   426: imul
    //   427: iload #7
    //   429: iload #10
    //   431: iload #14
    //   433: isub
    //   434: imul
    //   435: iadd
    //   436: iload #10
    //   438: idiv
    //   439: i2s
    //   440: putfield au : I
    //   443: aload_0
    //   444: getfield a : Li;
    //   447: getfield av : I
    //   450: bipush #24
    //   452: imul
    //   453: sipush #240
    //   456: isub
    //   457: istore #19
    //   459: aload_0
    //   460: getfield a : Li;
    //   463: getfield aw : I
    //   466: bipush #24
    //   468: imul
    //   469: sipush #320
    //   472: isub
    //   473: bipush #80
    //   475: iadd
    //   476: istore #20
    //   478: aload_0
    //   479: getfield a : Li;
    //   482: getfield at : I
    //   485: iload #19
    //   487: if_icmple -> 499
    //   490: aload_0
    //   491: getfield a : Li;
    //   494: iload #19
    //   496: goto -> 514
    //   499: aload_0
    //   500: getfield a : Li;
    //   503: getfield at : I
    //   506: ifge -> 517
    //   509: aload_0
    //   510: getfield a : Li;
    //   513: iconst_0
    //   514: putfield at : I
    //   517: aload_0
    //   518: getfield a : Li;
    //   521: getfield au : I
    //   524: iload #20
    //   526: if_icmple -> 538
    //   529: aload_0
    //   530: getfield a : Li;
    //   533: iload #20
    //   535: goto -> 553
    //   538: aload_0
    //   539: getfield a : Li;
    //   542: getfield au : I
    //   545: ifge -> 556
    //   548: aload_0
    //   549: getfield a : Li;
    //   552: iconst_0
    //   553: putfield au : I
    //   556: aload_0
    //   557: getfield a : Li;
    //   560: aload_0
    //   561: getfield a : Li;
    //   564: getfield at : I
    //   567: putfield ar : I
    //   570: aload_0
    //   571: getfield a : Li;
    //   574: aload_0
    //   575: getfield a : Li;
    //   578: getfield au : I
    //   581: putfield as : I
    //   584: aload_0
    //   585: getfield a : Li;
    //   588: getfield ar : I
    //   591: iload #19
    //   593: if_icmple -> 610
    //   596: aload_0
    //   597: getfield a : Li;
    //   600: dup
    //   601: getfield ar : I
    //   604: iload #19
    //   606: isub
    //   607: putfield ar : I
    //   610: aload_0
    //   611: getfield a : Li;
    //   614: getfield as : I
    //   617: iload #20
    //   619: if_icmple -> 632
    //   622: aload_0
    //   623: getfield a : Li;
    //   626: iload #20
    //   628: putfield as : I
    //   631: return
    //   632: aload_0
    //   633: getfield a : Li;
    //   636: getfield as : I
    //   639: ifge -> 1314
    //   642: return
    //   643: aload_0
    //   644: getfield b : I
    //   647: istore #14
    //   649: aload_2
    //   650: iload_3
    //   651: iconst_2
    //   652: iadd
    //   653: invokestatic a : ([BI)I
    //   656: i2s
    //   657: istore #4
    //   659: aload_2
    //   660: iload_3
    //   661: iconst_4
    //   662: iadd
    //   663: invokestatic a : ([BI)I
    //   666: i2s
    //   667: istore #5
    //   669: aload_2
    //   670: iload_3
    //   671: bipush #6
    //   673: iadd
    //   674: invokestatic a : ([BI)I
    //   677: i2s
    //   678: istore #10
    //   680: aload_2
    //   681: iload_3
    //   682: bipush #8
    //   684: iadd
    //   685: invokestatic a : ([BI)I
    //   688: i2s
    //   689: istore #6
    //   691: aload_2
    //   692: iload_3
    //   693: bipush #10
    //   695: iadd
    //   696: invokestatic a : ([BI)I
    //   699: i2s
    //   700: istore #7
    //   702: iload #14
    //   704: iload #10
    //   706: if_icmple -> 713
    //   709: iload #10
    //   711: istore #14
    //   713: iload #4
    //   715: iload #14
    //   717: imul
    //   718: iload #6
    //   720: iload #10
    //   722: iload #14
    //   724: isub
    //   725: imul
    //   726: iadd
    //   727: iload #10
    //   729: idiv
    //   730: i2s
    //   731: istore #17
    //   733: iload #5
    //   735: iload #14
    //   737: imul
    //   738: iload #7
    //   740: iload #10
    //   742: iload #14
    //   744: isub
    //   745: imul
    //   746: iadd
    //   747: iload #10
    //   749: idiv
    //   750: i2s
    //   751: istore #18
    //   753: iload #13
    //   755: bipush #13
    //   757: if_icmpne -> 1314
    //   760: aload_0
    //   761: iload #17
    //   763: putfield c : I
    //   766: aload_0
    //   767: iload #18
    //   769: putfield d : I
    //   772: return
    //   773: aload_0
    //   774: getfield b : I
    //   777: istore #14
    //   779: aload_2
    //   780: iload_3
    //   781: iconst_2
    //   782: iadd
    //   783: invokestatic a : ([BI)I
    //   786: i2s
    //   787: istore #6
    //   789: aload_2
    //   790: iload_3
    //   791: iconst_4
    //   792: iadd
    //   793: invokestatic a : ([BI)I
    //   796: i2s
    //   797: istore #7
    //   799: aload_2
    //   800: iload_3
    //   801: bipush #6
    //   803: iadd
    //   804: invokestatic a : ([BI)I
    //   807: i2s
    //   808: istore #4
    //   810: aload_2
    //   811: iload_3
    //   812: bipush #6
    //   814: iadd
    //   815: invokestatic a : ([BI)I
    //   818: i2s
    //   819: istore #5
    //   821: aload_2
    //   822: iload_3
    //   823: bipush #14
    //   825: iadd
    //   826: invokestatic a : ([BI)I
    //   829: i2s
    //   830: istore #10
    //   832: iload #14
    //   834: iload #10
    //   836: if_icmple -> 843
    //   839: iload #10
    //   841: istore #14
    //   843: iload #4
    //   845: iload #14
    //   847: imul
    //   848: iload #6
    //   850: iload #10
    //   852: iload #14
    //   854: isub
    //   855: imul
    //   856: iadd
    //   857: iload #10
    //   859: idiv
    //   860: i2s
    //   861: istore #8
    //   863: iload #5
    //   865: iload #14
    //   867: imul
    //   868: iload #7
    //   870: iload #10
    //   872: iload #14
    //   874: isub
    //   875: imul
    //   876: iadd
    //   877: iload #10
    //   879: idiv
    //   880: i2s
    //   881: istore #9
    //   883: aload_2
    //   884: iload_3
    //   885: bipush #10
    //   887: iadd
    //   888: invokestatic a : ([BI)I
    //   891: i2s
    //   892: istore #11
    //   894: aload_2
    //   895: iload_3
    //   896: bipush #12
    //   898: iadd
    //   899: invokestatic a : ([BI)I
    //   902: i2s
    //   903: istore #12
    //   905: getstatic c.a : [La;
    //   908: iload #11
    //   910: aaload
    //   911: aload_1
    //   912: iload #12
    //   914: iload #8
    //   916: iload #9
    //   918: iconst_0
    //   919: iconst_0
    //   920: iconst_0
    //   921: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   924: return
    //   925: getstatic i.a : [La;
    //   928: bipush #41
    //   930: aaload
    //   931: iconst_2
    //   932: putfield e : I
    //   935: aload_2
    //   936: iload_3
    //   937: bipush #6
    //   939: iadd
    //   940: baload
    //   941: sipush #255
    //   944: iand
    //   945: istore #21
    //   947: aload_1
    //   948: bipush #6
    //   950: sipush #229
    //   953: sipush #226
    //   956: bipush #35
    //   958: bipush #73
    //   960: iconst_1
    //   961: getstatic i.a : [La;
    //   964: bipush #41
    //   966: aaload
    //   967: getstatic i.a : [Ljava/lang/String;
    //   970: bipush #70
    //   972: aaload
    //   973: iconst_0
    //   974: invokestatic a : (La;Ljava/lang/String;I)I
    //   977: bipush #10
    //   979: iadd
    //   980: bipush #15
    //   982: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIIIII)V
    //   985: aconst_null
    //   986: astore #22
    //   988: new java/lang/String
    //   991: dup
    //   992: aload_2
    //   993: iload_3
    //   994: bipush #8
    //   996: iadd
    //   997: aload_2
    //   998: iload_3
    //   999: iconst_2
    //   1000: iadd
    //   1001: invokestatic a : ([BI)I
    //   1004: i2s
    //   1005: ldc 'ISO-8859-1'
    //   1007: invokespecial <init> : ([BIILjava/lang/String;)V
    //   1010: astore #22
    //   1012: goto -> 1016
    //   1015: pop
    //   1016: aload_0
    //   1017: aload #22
    //   1019: sipush #196
    //   1022: invokespecial a : (Ljava/lang/String;I)V
    //   1025: aload_0
    //   1026: aload_1
    //   1027: aload #22
    //   1029: bipush #22
    //   1031: sipush #231
    //   1034: iload #21
    //   1036: iload #21
    //   1038: iconst_2
    //   1039: iadd
    //   1040: invokespecial a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)V
    //   1043: getstatic i.a : [La;
    //   1046: bipush #41
    //   1048: aaload
    //   1049: aload_1
    //   1050: getstatic i.a : [Ljava/lang/String;
    //   1053: bipush #70
    //   1055: aaload
    //   1056: bipush #19
    //   1058: sipush #211
    //   1061: bipush #20
    //   1063: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1066: getstatic i.aO : I
    //   1069: iconst_2
    //   1070: idiv
    //   1071: iconst_4
    //   1072: irem
    //   1073: iconst_2
    //   1074: if_icmpge -> 1314
    //   1077: aload_1
    //   1078: getstatic i.b : [[Ljavax/microedition/lcdui/Image;
    //   1081: iconst_0
    //   1082: aaload
    //   1083: bipush #9
    //   1085: aaload
    //   1086: sipush #223
    //   1089: sipush #220
    //   1092: bipush #17
    //   1094: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1097: return
    //   1098: getstatic i.a : [La;
    //   1101: bipush #41
    //   1103: aaload
    //   1104: iconst_2
    //   1105: putfield e : I
    //   1108: aload_2
    //   1109: iload_3
    //   1110: bipush #6
    //   1112: iadd
    //   1113: invokestatic a : ([BI)I
    //   1116: i2s
    //   1117: istore #9
    //   1119: aload_2
    //   1120: iload_3
    //   1121: iconst_4
    //   1122: iadd
    //   1123: invokestatic a : ([BI)I
    //   1126: i2s
    //   1127: dup
    //   1128: istore #8
    //   1130: sipush #10000
    //   1133: if_icmpne -> 1141
    //   1136: sipush #-240
    //   1139: istore #8
    //   1141: aload_2
    //   1142: iload_3
    //   1143: bipush #8
    //   1145: iadd
    //   1146: baload
    //   1147: sipush #255
    //   1150: iand
    //   1151: istore #23
    //   1153: aload_2
    //   1154: iload_3
    //   1155: bipush #9
    //   1157: iadd
    //   1158: baload
    //   1159: sipush #255
    //   1162: iand
    //   1163: istore #21
    //   1165: iload #23
    //   1167: getstatic i.a : [La;
    //   1170: bipush #41
    //   1172: aaload
    //   1173: invokestatic a : (La;)I
    //   1176: imul
    //   1177: iconst_4
    //   1178: iadd
    //   1179: iconst_2
    //   1180: isub
    //   1181: istore #24
    //   1183: aload_1
    //   1184: iload #8
    //   1186: iload #9
    //   1188: sipush #226
    //   1191: iload #24
    //   1193: bipush #73
    //   1195: iconst_0
    //   1196: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   1199: aconst_null
    //   1200: astore #22
    //   1202: new java/lang/String
    //   1205: dup
    //   1206: aload_2
    //   1207: iload_3
    //   1208: bipush #11
    //   1210: iadd
    //   1211: aload_2
    //   1212: iload_3
    //   1213: iconst_2
    //   1214: iadd
    //   1215: invokestatic a : ([BI)I
    //   1218: i2s
    //   1219: ldc 'ISO-8859-1'
    //   1221: invokespecial <init> : ([BIILjava/lang/String;)V
    //   1224: astore #22
    //   1226: goto -> 1230
    //   1229: pop
    //   1230: aload_0
    //   1231: aload #22
    //   1233: sipush #222
    //   1236: invokespecial a : (Ljava/lang/String;I)V
    //   1239: aload_0
    //   1240: aload_1
    //   1241: aload #22
    //   1243: iload #8
    //   1245: iconst_2
    //   1246: iadd
    //   1247: iload #9
    //   1249: iconst_2
    //   1250: iadd
    //   1251: iload #21
    //   1253: iload #21
    //   1255: iload #23
    //   1257: iadd
    //   1258: invokespecial a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIII)V
    //   1261: getstatic i.aO : I
    //   1264: iconst_2
    //   1265: idiv
    //   1266: iconst_4
    //   1267: irem
    //   1268: iconst_2
    //   1269: if_icmpge -> 1302
    //   1272: aload_1
    //   1273: getstatic i.b : [[Ljavax/microedition/lcdui/Image;
    //   1276: iconst_0
    //   1277: aaload
    //   1278: bipush #9
    //   1280: aaload
    //   1281: iload #8
    //   1283: sipush #226
    //   1286: iadd
    //   1287: bipush #10
    //   1289: isub
    //   1290: iload #9
    //   1292: iload #24
    //   1294: iadd
    //   1295: iconst_5
    //   1296: isub
    //   1297: bipush #17
    //   1299: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1302: aload_1
    //   1303: iconst_0
    //   1304: iconst_0
    //   1305: sipush #240
    //   1308: sipush #320
    //   1311: invokevirtual setClip : (IIII)V
    //   1314: return
    // Exception table:
    //   from	to	target	type
    //   988	1012	1015	java/lang/Exception
    //   1202	1226	1229	java/lang/Exception
  }

  private void a(byte[] paramArrayOfbyte, int paramInt) {
    String str;
    short s2;
    short s;
    short s1;
    switch (s1 = (short)paramArrayOfbyte[paramInt + 0]) {
      case 7:
        paramArrayOfbyte[paramInt + 1] = 1;
        return;
      case 27:
        if (i.D)
          return;
        str = null;
        try {
          str = new String(paramArrayOfbyte, paramInt + 8, (short)i.a(paramArrayOfbyte, paramInt + 2), "ISO-8859-1");
        } catch (Exception exception) {}
        a(str, 196);
        s2 = (short)(paramArrayOfbyte[paramInt + 6] & 0xFF);
        s = 0;
        if (s2 + 2 >= this.h) {
          paramArrayOfbyte[paramInt + 7] = 1;
          return;
        }
        paramArrayOfbyte[paramInt + 6] = (byte)(s2 + 2);
        return;
      case 2:
        str = null;
        try {
          str = new String(paramArrayOfbyte, paramInt + 11, (short)i.a(paramArrayOfbyte, paramInt + 2), "ISO-8859-1");
        } catch (Exception exception) {}
        a(str, 222);
        s2 = (short)(paramArrayOfbyte[paramInt + 9] & 0xFF);
        s = (short)(paramArrayOfbyte[paramInt + 8] & 0xFF);
        paramArrayOfbyte[paramInt + 9] = (s2 + s >= this.h) ? 1 : (byte)(s2 + s);
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
      int j = 2 + s * 4;
      for (byte b = 0; b < s; b++) {
        int k = i.b((byte[])this.a, 2 + b * 4);
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
    //   1: getfield b : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial a : ()B
    //   12: lookupswitch default -> 60, 25 -> 40, 26 -> 40
    //   40: aload_0
    //   41: getfield a : [[B
    //   44: ifnull -> 59
    //   47: aload_0
    //   48: getfield a : I
    //   51: aload_0
    //   52: getfield a : [[B
    //   55: arraylength
    //   56: if_icmplt -> 111
    //   59: return
    //   60: aload_1
    //   61: iconst_0
    //   62: invokevirtual setColor : (I)V
    //   65: aload_1
    //   66: iconst_0
    //   67: iconst_0
    //   68: sipush #240
    //   71: bipush #42
    //   73: invokevirtual fillRect : (IIII)V
    //   76: aload_1
    //   77: iconst_0
    //   78: sipush #278
    //   81: sipush #240
    //   84: bipush #42
    //   86: invokevirtual fillRect : (IIII)V
    //   89: getstatic i.a : [La;
    //   92: bipush #41
    //   94: aaload
    //   95: aload_1
    //   96: getstatic i.a : [Ljava/lang/String;
    //   99: bipush #53
    //   101: aaload
    //   102: iconst_5
    //   103: sipush #315
    //   106: bipush #36
    //   108: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   111: aload_0
    //   112: getfield a : [B
    //   115: iconst_0
    //   116: baload
    //   117: ifne -> 178
    //   120: aload_0
    //   121: getfield a : [B
    //   124: iconst_1
    //   125: baload
    //   126: istore_2
    //   127: iconst_2
    //   128: iload_2
    //   129: iconst_4
    //   130: imul
    //   131: iadd
    //   132: istore_3
    //   133: iconst_0
    //   134: istore #4
    //   136: iload #4
    //   138: iload_2
    //   139: if_icmpge -> 188
    //   142: aload_0
    //   143: getfield a : [B
    //   146: iconst_2
    //   147: iload #4
    //   149: iconst_4
    //   150: imul
    //   151: iadd
    //   152: invokestatic b : ([BI)I
    //   155: istore #5
    //   157: aload_0
    //   158: aload_1
    //   159: aload_0
    //   160: getfield a : [B
    //   163: iload_3
    //   164: invokespecial a : (Ljavax/microedition/lcdui/Graphics;[BI)V
    //   167: iload_3
    //   168: iload #5
    //   170: iadd
    //   171: istore_3
    //   172: iinc #4, 1
    //   175: goto -> 136
    //   178: aload_0
    //   179: aload_1
    //   180: aload_0
    //   181: getfield a : [B
    //   184: iconst_0
    //   185: invokespecial a : (Ljavax/microedition/lcdui/Graphics;[BI)V
    //   188: aload_0
    //   189: getfield a : Z
    //   192: ifeq -> 324
    //   195: aload_1
    //   196: iconst_0
    //   197: invokevirtual setColor : (I)V
    //   200: aload_1
    //   201: aload_0
    //   202: getfield c : I
    //   205: iconst_3
    //   206: isub
    //   207: aload_0
    //   208: getfield d : I
    //   211: iconst_3
    //   212: isub
    //   213: bipush #109
    //   215: bipush #45
    //   217: invokevirtual fillRect : (IIII)V
    //   220: getstatic c.a : [La;
    //   223: aload_0
    //   224: getfield f : I
    //   227: aaload
    //   228: aload_1
    //   229: iconst_0
    //   230: aload_0
    //   231: getfield b : I
    //   234: getstatic c.a : [La;
    //   237: aload_0
    //   238: getfield f : I
    //   241: aaload
    //   242: iconst_0
    //   243: invokevirtual a : (I)I
    //   246: irem
    //   247: aload_0
    //   248: getfield c : I
    //   251: aload_0
    //   252: getfield d : I
    //   255: iconst_0
    //   256: iconst_0
    //   257: iconst_0
    //   258: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   261: getstatic c.a : [La;
    //   264: iconst_0
    //   265: aaload
    //   266: aload_1
    //   267: aload_0
    //   268: getfield e : I
    //   271: aload_0
    //   272: getfield c : I
    //   275: iconst_0
    //   276: iadd
    //   277: aload_0
    //   278: getfield d : I
    //   281: iconst_0
    //   282: iconst_0
    //   283: iconst_0
    //   284: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   287: aload_0
    //   288: getfield g : I
    //   291: iflt -> 324
    //   294: getstatic c.a : [La;
    //   297: iconst_1
    //   298: aaload
    //   299: aload_1
    //   300: aload_0
    //   301: getfield g : I
    //   304: aload_0
    //   305: getfield c : I
    //   308: bipush #90
    //   310: iadd
    //   311: aload_0
    //   312: getfield d : I
    //   315: bipush #-6
    //   317: iadd
    //   318: iconst_0
    //   319: iconst_0
    //   320: iconst_0
    //   321: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   324: return
  }

  public final byte[] a() {
    a((byte[][])this.a);
    this.a = false;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = -1;
    this.b = false;
    this.a = false;
    this.b = System.currentTimeMillis();
    return b();
  }

  private void b(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte[paramInt + 0] != 0) {
      paramArrayOfbyte[paramInt + 1] = 0;
      switch (paramArrayOfbyte[paramInt + 0]) {
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
    int j = paramInt + 2 + b * 4;
    for (byte b1 = 0; b1 < b; b1++) {
      int k = i.b(paramArrayOfbyte, paramInt + 2 + b1 * 4);
      b(paramArrayOfbyte, j);
      j += k;
    }
  }

  private void a(byte[][] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      b(paramArrayOfbyte[b], 0);
  }

  public final byte[] b() {
    this.b = false;
    this.a = (this.a == null || this.a >= this.a.length) ? null : this.a[this.a++];
    return (byte[])this.a;
  }

  public final void b() {
    if (this.a[0] == 0) {
      short s = this.a[1];
      int j = 2 + s * 4;
      for (byte b = 0; b < s; b++) {
        int k = i.b((byte[])this.a, 2 + b * 4);
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
    //   2: iconst_0
    //   3: iadd
    //   4: baload
    //   5: i2s
    //   6: istore #7
    //   8: aload_0
    //   9: getfield b : Z
    //   12: ifeq -> 78
    //   15: iload #7
    //   17: lookupswitch default -> 71, 5 -> 68, 9 -> 68, 10 -> 68, 25 -> 68, 26 -> 68
    //   68: goto -> 78
    //   71: aload_1
    //   72: iload_2
    //   73: iconst_1
    //   74: iadd
    //   75: iconst_1
    //   76: bastore
    //   77: return
    //   78: iload #7
    //   80: tableswitch default -> 1056, 1 -> 661, 2 -> 988, 3 -> 1056, 4 -> 750, 5 -> 902, 6 -> 777, 7 -> 1056, 8 -> 935, 9 -> 936, 10 -> 500, 11 -> 469, 12 -> 419, 13 -> 578, 14 -> 396, 15 -> 396, 16 -> 204, 17 -> 204, 18 -> 204, 19 -> 1056, 20 -> 1056, 21 -> 1056, 22 -> 1056, 23 -> 1056, 24 -> 1056, 25 -> 798, 26 -> 856, 27 -> 972
    //   204: aload_0
    //   205: getfield b : I
    //   208: iconst_2
    //   209: irem
    //   210: ifne -> 214
    //   213: return
    //   214: iload_2
    //   215: iload #7
    //   217: bipush #18
    //   219: if_icmpne -> 226
    //   222: iconst_2
    //   223: goto -> 227
    //   226: iconst_4
    //   227: iadd
    //   228: istore #8
    //   230: aload_1
    //   231: iload #8
    //   233: baload
    //   234: istore #9
    //   236: iconst_m1
    //   237: istore #10
    //   239: iload_2
    //   240: iload #7
    //   242: bipush #18
    //   244: if_icmpne -> 252
    //   247: bipush #7
    //   249: goto -> 253
    //   252: iconst_5
    //   253: iadd
    //   254: istore #11
    //   256: aload_1
    //   257: iload #11
    //   259: baload
    //   260: ifeq -> 267
    //   263: iconst_1
    //   264: goto -> 268
    //   267: iconst_0
    //   268: istore #12
    //   270: iload #7
    //   272: bipush #18
    //   274: if_icmpeq -> 287
    //   277: aload_1
    //   278: iload_2
    //   279: iconst_2
    //   280: iadd
    //   281: invokestatic a : ([BI)I
    //   284: i2s
    //   285: istore #10
    //   287: iload #12
    //   289: ifeq -> 344
    //   292: iconst_0
    //   293: istore #12
    //   295: aload_0
    //   296: iconst_m1
    //   297: putfield g : I
    //   300: iload #9
    //   302: iconst_1
    //   303: isub
    //   304: i2b
    //   305: dup
    //   306: istore #9
    //   308: ifne -> 374
    //   311: aload_1
    //   312: iload_2
    //   313: iconst_1
    //   314: iadd
    //   315: iconst_1
    //   316: bastore
    //   317: iload #7
    //   319: bipush #18
    //   321: if_icmpeq -> 374
    //   324: aload_0
    //   325: iload #7
    //   327: bipush #16
    //   329: if_icmpne -> 337
    //   332: iload #10
    //   334: goto -> 338
    //   337: iconst_m1
    //   338: putfield g : I
    //   341: goto -> 374
    //   344: iload #9
    //   346: ifle -> 368
    //   349: iconst_1
    //   350: istore #12
    //   352: iload #7
    //   354: bipush #18
    //   356: if_icmpeq -> 374
    //   359: aload_0
    //   360: iload #10
    //   362: putfield g : I
    //   365: goto -> 374
    //   368: aload_1
    //   369: iload_2
    //   370: iconst_1
    //   371: iadd
    //   372: iconst_1
    //   373: bastore
    //   374: aload_1
    //   375: iload #11
    //   377: iload #12
    //   379: ifeq -> 386
    //   382: iconst_1
    //   383: goto -> 387
    //   386: iconst_0
    //   387: i2b
    //   388: bastore
    //   389: aload_1
    //   390: iload #8
    //   392: iload #9
    //   394: bastore
    //   395: return
    //   396: aload_0
    //   397: iload #7
    //   399: bipush #14
    //   401: if_icmpne -> 408
    //   404: iconst_1
    //   405: goto -> 409
    //   408: iconst_0
    //   409: putfield a : Z
    //   412: aload_1
    //   413: iload_2
    //   414: iconst_1
    //   415: iadd
    //   416: iconst_1
    //   417: bastore
    //   418: return
    //   419: aload_1
    //   420: iload_2
    //   421: iconst_2
    //   422: iadd
    //   423: invokestatic a : ([BI)I
    //   426: i2s
    //   427: istore_3
    //   428: aload_1
    //   429: iload_2
    //   430: iconst_4
    //   431: iadd
    //   432: invokestatic a : ([BI)I
    //   435: i2s
    //   436: istore #4
    //   438: aload_0
    //   439: iload_3
    //   440: putfield c : I
    //   443: aload_0
    //   444: iload #4
    //   446: putfield d : I
    //   449: aload_0
    //   450: getfield b : I
    //   453: iconst_5
    //   454: if_icmple -> 1056
    //   457: aload_1
    //   458: iload_2
    //   459: iconst_1
    //   460: iadd
    //   461: iconst_1
    //   462: bastore
    //   463: aload_0
    //   464: iconst_1
    //   465: putfield a : Z
    //   468: return
    //   469: aload_0
    //   470: aload_1
    //   471: iload_2
    //   472: iconst_4
    //   473: iadd
    //   474: invokestatic a : ([BI)I
    //   477: i2s
    //   478: putfield f : I
    //   481: aload_0
    //   482: aload_1
    //   483: iload_2
    //   484: iconst_2
    //   485: iadd
    //   486: invokestatic a : ([BI)I
    //   489: i2s
    //   490: putfield e : I
    //   493: aload_1
    //   494: iload_2
    //   495: iconst_1
    //   496: iadd
    //   497: iconst_1
    //   498: bastore
    //   499: return
    //   500: aload_1
    //   501: iload_2
    //   502: iconst_2
    //   503: iadd
    //   504: baload
    //   505: istore #6
    //   507: aload_0
    //   508: getfield b : I
    //   511: ifne -> 546
    //   514: aload_0
    //   515: getfield a : Li;
    //   518: aload_0
    //   519: getfield a : Li;
    //   522: getfield aS : I
    //   525: bipush #-8
    //   527: iand
    //   528: iload #6
    //   530: ior
    //   531: putfield aS : I
    //   534: aload_0
    //   535: getfield a : Li;
    //   538: iload #6
    //   540: putfield j : B
    //   543: goto -> 570
    //   546: aload_0
    //   547: getfield a : Li;
    //   550: getfield aR : I
    //   553: ifgt -> 570
    //   556: aload_0
    //   557: getfield a : Li;
    //   560: iconst_0
    //   561: putfield j : B
    //   564: aload_1
    //   565: iload_2
    //   566: iconst_1
    //   567: iadd
    //   568: iconst_1
    //   569: bastore
    //   570: aload_0
    //   571: getfield a : Li;
    //   574: invokevirtual c : ()V
    //   577: return
    //   578: aload_1
    //   579: iload_2
    //   580: bipush #8
    //   582: iadd
    //   583: invokestatic a : ([BI)I
    //   586: i2s
    //   587: sipush #10000
    //   590: if_icmpne -> 606
    //   593: aload_1
    //   594: iload_2
    //   595: bipush #8
    //   597: iadd
    //   598: aload_0
    //   599: getfield c : I
    //   602: i2s
    //   603: invokestatic a : ([BIS)V
    //   606: aload_1
    //   607: iload_2
    //   608: bipush #10
    //   610: iadd
    //   611: invokestatic a : ([BI)I
    //   614: i2s
    //   615: sipush #10000
    //   618: if_icmpne -> 634
    //   621: aload_1
    //   622: iload_2
    //   623: bipush #10
    //   625: iadd
    //   626: aload_0
    //   627: getfield d : I
    //   630: i2s
    //   631: invokestatic a : ([BIS)V
    //   634: aload_1
    //   635: iload_2
    //   636: bipush #6
    //   638: iadd
    //   639: invokestatic a : ([BI)I
    //   642: i2s
    //   643: istore #5
    //   645: aload_0
    //   646: getfield b : I
    //   649: iload #5
    //   651: if_icmple -> 1056
    //   654: aload_1
    //   655: iload_2
    //   656: iconst_1
    //   657: iadd
    //   658: iconst_1
    //   659: bastore
    //   660: return
    //   661: aload_1
    //   662: iload_2
    //   663: bipush #8
    //   665: iadd
    //   666: invokestatic a : ([BI)I
    //   669: i2s
    //   670: sipush #10000
    //   673: if_icmpne -> 692
    //   676: aload_1
    //   677: iload_2
    //   678: bipush #8
    //   680: iadd
    //   681: aload_0
    //   682: getfield a : Li;
    //   685: getfield at : I
    //   688: i2s
    //   689: invokestatic a : ([BIS)V
    //   692: aload_1
    //   693: iload_2
    //   694: bipush #10
    //   696: iadd
    //   697: invokestatic a : ([BI)I
    //   700: i2s
    //   701: sipush #10000
    //   704: if_icmpne -> 723
    //   707: aload_1
    //   708: iload_2
    //   709: bipush #10
    //   711: iadd
    //   712: aload_0
    //   713: getfield a : Li;
    //   716: getfield au : I
    //   719: i2s
    //   720: invokestatic a : ([BIS)V
    //   723: aload_1
    //   724: iload_2
    //   725: bipush #6
    //   727: iadd
    //   728: invokestatic a : ([BI)I
    //   731: i2s
    //   732: istore #5
    //   734: aload_0
    //   735: getfield b : I
    //   738: iload #5
    //   740: if_icmple -> 1056
    //   743: aload_1
    //   744: iload_2
    //   745: iconst_1
    //   746: iadd
    //   747: iconst_1
    //   748: bastore
    //   749: return
    //   750: aload_1
    //   751: iload_2
    //   752: bipush #14
    //   754: iadd
    //   755: invokestatic a : ([BI)I
    //   758: i2s
    //   759: istore #5
    //   761: aload_0
    //   762: getfield b : I
    //   765: iload #5
    //   767: if_icmple -> 1056
    //   770: aload_1
    //   771: iload_2
    //   772: iconst_1
    //   773: iadd
    //   774: iconst_1
    //   775: bastore
    //   776: return
    //   777: aload_0
    //   778: getfield b : I
    //   781: aload_1
    //   782: iload_2
    //   783: iconst_2
    //   784: iadd
    //   785: invokestatic b : ([BI)I
    //   788: if_icmple -> 1056
    //   791: aload_1
    //   792: iload_2
    //   793: iconst_1
    //   794: iadd
    //   795: iconst_1
    //   796: bastore
    //   797: return
    //   798: aload_1
    //   799: iload_2
    //   800: iconst_2
    //   801: iadd
    //   802: invokestatic a : ([BI)I
    //   805: i2s
    //   806: istore_3
    //   807: aload_1
    //   808: iload_2
    //   809: iconst_4
    //   810: iadd
    //   811: invokestatic a : ([BI)I
    //   814: i2s
    //   815: istore #4
    //   817: aload_1
    //   818: iload_2
    //   819: bipush #6
    //   821: iadd
    //   822: baload
    //   823: istore #13
    //   825: aload_1
    //   826: iload_2
    //   827: bipush #7
    //   829: iadd
    //   830: baload
    //   831: istore #14
    //   833: getstatic i.a : [[I
    //   836: iload_3
    //   837: aaload
    //   838: iload #4
    //   840: iload #14
    //   842: bipush #8
    //   844: ishl
    //   845: iload #13
    //   847: ior
    //   848: iastore
    //   849: aload_1
    //   850: iload_2
    //   851: iconst_1
    //   852: iadd
    //   853: iconst_1
    //   854: bastore
    //   855: return
    //   856: aload_1
    //   857: iload_2
    //   858: iconst_2
    //   859: iadd
    //   860: invokestatic a : ([BI)I
    //   863: i2s
    //   864: istore_3
    //   865: aload_1
    //   866: iload_2
    //   867: iconst_4
    //   868: iadd
    //   869: invokestatic a : ([BI)I
    //   872: i2s
    //   873: istore #4
    //   875: aload_1
    //   876: iload_2
    //   877: bipush #6
    //   879: iadd
    //   880: invokestatic b : ([BI)I
    //   883: istore #13
    //   885: getstatic i.b : [[I
    //   888: iload_3
    //   889: aaload
    //   890: iload #4
    //   892: iload #13
    //   894: iastore
    //   895: aload_1
    //   896: iload_2
    //   897: iconst_1
    //   898: iadd
    //   899: iconst_1
    //   900: bastore
    //   901: return
    //   902: aload_1
    //   903: iload_2
    //   904: iconst_2
    //   905: iadd
    //   906: invokestatic a : ([BI)I
    //   909: i2s
    //   910: aload_1
    //   911: iload_2
    //   912: iconst_4
    //   913: iadd
    //   914: invokestatic a : ([BI)I
    //   917: i2s
    //   918: aload_1
    //   919: iload_2
    //   920: bipush #6
    //   922: iadd
    //   923: baload
    //   924: iconst_0
    //   925: invokestatic a : (SSBI)V
    //   928: aload_1
    //   929: iload_2
    //   930: iconst_1
    //   931: iadd
    //   932: iconst_1
    //   933: bastore
    //   934: return
    //   935: return
    //   936: aload_1
    //   937: iload_2
    //   938: iconst_2
    //   939: iadd
    //   940: invokestatic a : ([BI)I
    //   943: i2s
    //   944: aload_1
    //   945: iload_2
    //   946: iconst_4
    //   947: iadd
    //   948: invokestatic a : ([BI)I
    //   951: i2s
    //   952: iconst_0
    //   953: aload_1
    //   954: iload_2
    //   955: bipush #6
    //   957: iadd
    //   958: invokestatic a : ([BI)I
    //   961: i2s
    //   962: invokestatic a : (SSBI)V
    //   965: aload_1
    //   966: iload_2
    //   967: iconst_1
    //   968: iadd
    //   969: iconst_1
    //   970: bastore
    //   971: return
    //   972: aload_1
    //   973: iload_2
    //   974: bipush #7
    //   976: iadd
    //   977: baload
    //   978: ifeq -> 1056
    //   981: aload_1
    //   982: iload_2
    //   983: iconst_1
    //   984: iadd
    //   985: iconst_1
    //   986: bastore
    //   987: return
    //   988: aload_1
    //   989: iload_2
    //   990: iconst_4
    //   991: iadd
    //   992: invokestatic a : ([BI)I
    //   995: i2s
    //   996: dup
    //   997: istore_3
    //   998: sipush #10000
    //   1001: if_icmpne -> 1008
    //   1004: sipush #-226
    //   1007: istore_3
    //   1008: iload_3
    //   1009: bipush #30
    //   1011: iadd
    //   1012: i2s
    //   1013: istore_3
    //   1014: aload_1
    //   1015: iload_2
    //   1016: bipush #10
    //   1018: iadd
    //   1019: baload
    //   1020: ifne -> 1035
    //   1023: iload_3
    //   1024: bipush #7
    //   1026: if_icmple -> 1048
    //   1029: bipush #7
    //   1031: istore_3
    //   1032: goto -> 1048
    //   1035: iload_3
    //   1036: sipush #240
    //   1039: if_icmple -> 1048
    //   1042: aload_1
    //   1043: iload_2
    //   1044: iconst_1
    //   1045: iadd
    //   1046: iconst_1
    //   1047: bastore
    //   1048: aload_1
    //   1049: iload_2
    //   1050: iconst_4
    //   1051: iadd
    //   1052: iload_3
    //   1053: invokestatic a : ([BIS)V
    //   1056: return
  }

  public final boolean a() {
    boolean bool = true;
    if (this.a[0] == 0) {
      short s = this.a[1];
      int j = 2 + s * 4;
      for (byte b = 0; b < s; b++) {
        int k = i.b((byte[])this.a, 2 + b * 4);
        if (!(bool = (bool && this.a[j + 1] == 1) ? true : false))
          break;
        j += k;
      }
    } else {
      bool = (this.a[1] == 1) ? true : false;
    }
    return bool;
  }

  private byte a() {
    return (this.a == null) ? -1 : this.a[0];
  }

  public final void a(int paramInt) {
    // Byte code:
    //   0: new java/io/ByteArrayInputStream
    //   3: dup
    //   4: getstatic c.b : Ljava/lang/String;
    //   7: aload_0
    //   8: getfield a : Li;
    //   11: invokevirtual getClass : ()Ljava/lang/Class;
    //   14: pop
    //   15: iconst_0
    //   16: invokestatic a : (Ljava/lang/String;I)[B
    //   19: invokespecial <init> : ([B)V
    //   22: astore_2
    //   23: iconst_4
    //   24: newarray byte
    //   26: astore_3
    //   27: aload_2
    //   28: aload_3
    //   29: iconst_0
    //   30: iconst_2
    //   31: invokevirtual read : ([BII)I
    //   34: pop
    //   35: iconst_0
    //   36: istore #4
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: iconst_2
    //   42: invokevirtual read : ([BII)I
    //   45: pop
    //   46: aload_3
    //   47: iconst_0
    //   48: invokestatic a : ([BI)I
    //   51: i2s
    //   52: dup
    //   53: istore #5
    //   55: iload_1
    //   56: if_icmpne -> 2040
    //   59: aload_2
    //   60: aload_3
    //   61: iconst_0
    //   62: iconst_2
    //   63: invokevirtual read : ([BII)I
    //   66: pop
    //   67: aload_3
    //   68: iconst_0
    //   69: invokestatic a : ([BI)I
    //   72: i2s
    //   73: istore #6
    //   75: aload_2
    //   76: aload_3
    //   77: iconst_0
    //   78: iconst_4
    //   79: invokevirtual read : ([BII)I
    //   82: pop
    //   83: aload_3
    //   84: iconst_0
    //   85: invokestatic b : ([BI)I
    //   88: dup
    //   89: istore #7
    //   91: newarray byte
    //   93: astore_3
    //   94: aload_2
    //   95: aload_3
    //   96: invokevirtual read : ([B)I
    //   99: pop
    //   100: aload_2
    //   101: invokevirtual close : ()V
    //   104: aconst_null
    //   105: astore_2
    //   106: iconst_1
    //   107: istore #4
    //   109: iconst_0
    //   110: istore #8
    //   112: aload_3
    //   113: iconst_0
    //   114: invokestatic a : ([BI)I
    //   117: i2s
    //   118: istore #9
    //   120: iinc #8, 2
    //   123: iload #9
    //   125: ifeq -> 458
    //   128: iload #9
    //   130: newarray short
    //   132: astore #10
    //   134: iconst_0
    //   135: istore #11
    //   137: iload #11
    //   139: iload #9
    //   141: if_icmpge -> 165
    //   144: aload #10
    //   146: iload #11
    //   148: aload_3
    //   149: iload #8
    //   151: invokestatic a : ([BI)I
    //   154: i2s
    //   155: sastore
    //   156: iinc #8, 2
    //   159: iinc #11, 1
    //   162: goto -> 137
    //   165: iconst_1
    //   166: istore #13
    //   168: iload #13
    //   170: iload #9
    //   172: if_icmpge -> 234
    //   175: aload #10
    //   177: iload #13
    //   179: saload
    //   180: istore #11
    //   182: iload #13
    //   184: dup
    //   185: istore #12
    //   187: ifle -> 221
    //   190: aload #10
    //   192: iload #12
    //   194: iconst_1
    //   195: isub
    //   196: saload
    //   197: iload #11
    //   199: if_icmple -> 221
    //   202: aload #10
    //   204: iload #12
    //   206: aload #10
    //   208: iload #12
    //   210: iconst_1
    //   211: isub
    //   212: saload
    //   213: sastore
    //   214: iload #12
    //   216: iconst_1
    //   217: isub
    //   218: goto -> 184
    //   221: aload #10
    //   223: iload #12
    //   225: iload #11
    //   227: sastore
    //   228: iinc #13, 1
    //   231: goto -> 168
    //   234: aload_0
    //   235: invokevirtual getClass : ()Ljava/lang/Class;
    //   238: getstatic c.a : Ljava/lang/String;
    //   241: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   244: astore #13
    //   246: iconst_4
    //   247: newarray byte
    //   249: astore #14
    //   251: aload #13
    //   253: aload #14
    //   255: iconst_0
    //   256: iconst_2
    //   257: invokevirtual read : ([BII)I
    //   260: pop
    //   261: aload #14
    //   263: iconst_0
    //   264: invokestatic a : ([BI)I
    //   267: i2s
    //   268: istore #15
    //   270: getstatic c.a : [La;
    //   273: ifnonnull -> 284
    //   276: iload #15
    //   278: anewarray a
    //   281: putstatic c.a : [La;
    //   284: iconst_0
    //   285: istore #16
    //   287: iload #16
    //   289: iload #9
    //   291: if_icmpge -> 453
    //   294: aload #10
    //   296: iload #16
    //   298: saload
    //   299: istore #17
    //   301: iconst_0
    //   302: istore #18
    //   304: iload #18
    //   306: ifne -> 447
    //   309: aload #13
    //   311: aload #14
    //   313: iconst_0
    //   314: iconst_2
    //   315: invokevirtual read : ([BII)I
    //   318: pop
    //   319: aload #14
    //   321: iconst_0
    //   322: invokestatic a : ([BI)I
    //   325: i2s
    //   326: istore #19
    //   328: iload #17
    //   330: iload #19
    //   332: if_icmpne -> 338
    //   335: iconst_1
    //   336: istore #18
    //   338: aload #13
    //   340: aload #14
    //   342: iconst_0
    //   343: iconst_4
    //   344: invokevirtual read : ([BII)I
    //   347: pop
    //   348: aload #14
    //   350: iconst_0
    //   351: invokestatic b : ([BI)I
    //   354: istore #20
    //   356: iload #18
    //   358: ifne -> 382
    //   361: getstatic c.a : [La;
    //   364: iload #17
    //   366: aaload
    //   367: ifnull -> 382
    //   370: aload #13
    //   372: iload #20
    //   374: i2l
    //   375: invokevirtual skip : (J)J
    //   378: pop2
    //   379: goto -> 304
    //   382: iload #20
    //   384: newarray byte
    //   386: astore #14
    //   388: aload #13
    //   390: aload #14
    //   392: invokevirtual read : ([B)I
    //   395: pop
    //   396: getstatic c.a : [La;
    //   399: iload #17
    //   401: new a
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: aastore
    //   409: getstatic c.a : [La;
    //   412: iload #17
    //   414: aaload
    //   415: aload #14
    //   417: iconst_0
    //   418: invokevirtual a : ([BI)V
    //   421: getstatic c.a : [La;
    //   424: iload #17
    //   426: aaload
    //   427: iconst_0
    //   428: iconst_0
    //   429: iconst_m1
    //   430: iconst_m1
    //   431: invokevirtual a : (IIII)V
    //   434: getstatic c.a : [La;
    //   437: iload #17
    //   439: aaload
    //   440: aconst_null
    //   441: putfield g : [B
    //   444: goto -> 304
    //   447: iinc #16, 1
    //   450: goto -> 287
    //   453: aload #13
    //   455: invokevirtual close : ()V
    //   458: iload #6
    //   460: anewarray [B
    //   463: astore #10
    //   465: iconst_0
    //   466: istore #11
    //   468: aconst_null
    //   469: checkcast [[B
    //   472: astore #12
    //   474: iconst_0
    //   475: istore #13
    //   477: aconst_null
    //   478: astore #14
    //   480: iconst_0
    //   481: istore #15
    //   483: iconst_0
    //   484: istore #16
    //   486: iload #16
    //   488: iload #6
    //   490: if_icmplt -> 498
    //   493: iload #15
    //   495: ifeq -> 2031
    //   498: iload #15
    //   500: ifne -> 510
    //   503: aload #10
    //   505: astore #14
    //   507: goto -> 520
    //   510: aload #12
    //   512: astore #14
    //   514: iinc #15, -1
    //   517: iinc #16, -1
    //   520: aload_3
    //   521: iload #8
    //   523: iinc #8, 1
    //   526: baload
    //   527: sipush #255
    //   530: iand
    //   531: istore #17
    //   533: aconst_null
    //   534: astore #18
    //   536: iload #17
    //   538: tableswitch default -> 1813, 0 -> 1790, 1 -> 1156, 2 -> 1579, 3 -> 1813, 4 -> 997, 5 -> 1438, 6 -> 1251, 7 -> 1150, 8 -> 1813, 9 -> 1693, 10 -> 1762, 11 -> 806, 12 -> 854, 13 -> 902, 14 -> 991, 15 -> 991, 16 -> 751, 17 -> 751, 18 -> 664, 19 -> 1813, 20 -> 1813, 21 -> 1813, 22 -> 1813, 23 -> 1813, 24 -> 1813, 25 -> 1346, 26 -> 1278, 27 -> 1508
    //   664: aload_3
    //   665: iload #8
    //   667: iinc #8, 1
    //   670: baload
    //   671: sipush #255
    //   674: iand
    //   675: i2s
    //   676: istore #19
    //   678: aload_3
    //   679: iload #8
    //   681: iinc #8, 1
    //   684: baload
    //   685: sipush #255
    //   688: iand
    //   689: aload_3
    //   690: iload #8
    //   692: iinc #8, 1
    //   695: baload
    //   696: sipush #255
    //   699: iand
    //   700: bipush #8
    //   702: ishl
    //   703: iadd
    //   704: aload_3
    //   705: iload #8
    //   707: iinc #8, 1
    //   710: baload
    //   711: sipush #255
    //   714: iand
    //   715: bipush #16
    //   717: ishl
    //   718: iadd
    //   719: istore #20
    //   721: bipush #8
    //   723: newarray byte
    //   725: dup
    //   726: astore #18
    //   728: iconst_2
    //   729: iload #19
    //   731: invokestatic a : ([BIS)V
    //   734: aload #18
    //   736: iconst_3
    //   737: iload #20
    //   739: invokestatic a : ([BII)V
    //   742: aload #18
    //   744: bipush #7
    //   746: iconst_0
    //   747: bastore
    //   748: goto -> 1813
    //   751: aload_3
    //   752: iload #8
    //   754: invokestatic a : ([BI)I
    //   757: i2s
    //   758: istore #21
    //   760: iinc #8, 2
    //   763: aload_3
    //   764: iload #8
    //   766: iinc #8, 1
    //   769: baload
    //   770: sipush #255
    //   773: iand
    //   774: i2s
    //   775: istore #19
    //   777: bipush #6
    //   779: newarray byte
    //   781: dup
    //   782: astore #18
    //   784: iconst_2
    //   785: iload #21
    //   787: invokestatic a : ([BIS)V
    //   790: aload #18
    //   792: iconst_4
    //   793: iload #19
    //   795: invokestatic a : ([BIS)V
    //   798: aload #18
    //   800: iconst_5
    //   801: iconst_0
    //   802: bastore
    //   803: goto -> 1813
    //   806: aload_3
    //   807: iload #8
    //   809: invokestatic a : ([BI)I
    //   812: i2s
    //   813: istore #21
    //   815: iinc #8, 2
    //   818: aload_3
    //   819: iload #8
    //   821: invokestatic a : ([BI)I
    //   824: i2s
    //   825: istore #22
    //   827: iinc #8, 2
    //   830: bipush #6
    //   832: newarray byte
    //   834: dup
    //   835: astore #18
    //   837: iconst_2
    //   838: iload #21
    //   840: invokestatic a : ([BIS)V
    //   843: aload #18
    //   845: iconst_4
    //   846: iload #22
    //   848: invokestatic a : ([BIS)V
    //   851: goto -> 1813
    //   854: aload_3
    //   855: iload #8
    //   857: invokestatic a : ([BI)I
    //   860: i2s
    //   861: istore #23
    //   863: iinc #8, 2
    //   866: aload_3
    //   867: iload #8
    //   869: invokestatic a : ([BI)I
    //   872: i2s
    //   873: istore #24
    //   875: iinc #8, 2
    //   878: bipush #6
    //   880: newarray byte
    //   882: dup
    //   883: astore #18
    //   885: iconst_2
    //   886: iload #23
    //   888: invokestatic a : ([BIS)V
    //   891: aload #18
    //   893: iconst_4
    //   894: iload #24
    //   896: invokestatic a : ([BIS)V
    //   899: goto -> 1813
    //   902: aload_3
    //   903: iload #8
    //   905: invokestatic a : ([BI)I
    //   908: i2s
    //   909: istore #23
    //   911: iinc #8, 2
    //   914: aload_3
    //   915: iload #8
    //   917: invokestatic a : ([BI)I
    //   920: i2s
    //   921: istore #24
    //   923: iinc #8, 2
    //   926: aload_3
    //   927: iload #8
    //   929: invokestatic a : ([BI)I
    //   932: i2s
    //   933: istore #25
    //   935: iinc #8, 2
    //   938: bipush #12
    //   940: newarray byte
    //   942: dup
    //   943: astore #18
    //   945: iconst_2
    //   946: iload #23
    //   948: invokestatic a : ([BIS)V
    //   951: aload #18
    //   953: iconst_4
    //   954: iload #24
    //   956: invokestatic a : ([BIS)V
    //   959: aload #18
    //   961: bipush #6
    //   963: iload #25
    //   965: invokestatic a : ([BIS)V
    //   968: aload #18
    //   970: bipush #8
    //   972: sipush #10000
    //   975: invokestatic a : ([BIS)V
    //   978: aload #18
    //   980: bipush #10
    //   982: sipush #10000
    //   985: invokestatic a : ([BIS)V
    //   988: goto -> 1813
    //   991: iconst_2
    //   992: newarray byte
    //   994: goto -> 1811
    //   997: aload_3
    //   998: iload #8
    //   1000: invokestatic a : ([BI)I
    //   1003: i2s
    //   1004: istore #26
    //   1006: iinc #8, 2
    //   1009: aload_3
    //   1010: iload #8
    //   1012: invokestatic a : ([BI)I
    //   1015: i2s
    //   1016: istore #27
    //   1018: iinc #8, 2
    //   1021: aload_3
    //   1022: iload #8
    //   1024: invokestatic a : ([BI)I
    //   1027: i2s
    //   1028: istore #28
    //   1030: iinc #8, 2
    //   1033: aload_3
    //   1034: iload #8
    //   1036: invokestatic a : ([BI)I
    //   1039: i2s
    //   1040: istore #29
    //   1042: iinc #8, 2
    //   1045: aload_3
    //   1046: iload #8
    //   1048: invokestatic a : ([BI)I
    //   1051: i2s
    //   1052: istore #30
    //   1054: iinc #8, 2
    //   1057: aload_3
    //   1058: iload #8
    //   1060: invokestatic a : ([BI)I
    //   1063: i2s
    //   1064: istore #21
    //   1066: iinc #8, 2
    //   1069: aload_3
    //   1070: iload #8
    //   1072: invokestatic a : ([BI)I
    //   1075: i2s
    //   1076: istore #25
    //   1078: iinc #8, 2
    //   1081: bipush #16
    //   1083: newarray byte
    //   1085: dup
    //   1086: astore #18
    //   1088: iconst_2
    //   1089: iload #26
    //   1091: invokestatic a : ([BIS)V
    //   1094: aload #18
    //   1096: iconst_4
    //   1097: iload #27
    //   1099: invokestatic a : ([BIS)V
    //   1102: aload #18
    //   1104: bipush #6
    //   1106: iload #28
    //   1108: invokestatic a : ([BIS)V
    //   1111: aload #18
    //   1113: bipush #8
    //   1115: iload #29
    //   1117: invokestatic a : ([BIS)V
    //   1120: aload #18
    //   1122: bipush #10
    //   1124: iload #30
    //   1126: invokestatic a : ([BIS)V
    //   1129: aload #18
    //   1131: bipush #12
    //   1133: iload #21
    //   1135: invokestatic a : ([BIS)V
    //   1138: aload #18
    //   1140: bipush #14
    //   1142: iload #25
    //   1144: invokestatic a : ([BIS)V
    //   1147: goto -> 1813
    //   1150: iconst_2
    //   1151: newarray byte
    //   1153: goto -> 1811
    //   1156: aload_3
    //   1157: iload #8
    //   1159: invokestatic a : ([BI)I
    //   1162: bipush #24
    //   1164: imul
    //   1165: i2s
    //   1166: istore #23
    //   1168: iinc #8, 2
    //   1171: aload_3
    //   1172: iload #8
    //   1174: invokestatic a : ([BI)I
    //   1177: bipush #24
    //   1179: imul
    //   1180: i2s
    //   1181: istore #24
    //   1183: iinc #8, 2
    //   1186: aload_3
    //   1187: iload #8
    //   1189: invokestatic a : ([BI)I
    //   1192: i2s
    //   1193: istore #25
    //   1195: iinc #8, 2
    //   1198: bipush #12
    //   1200: newarray byte
    //   1202: dup
    //   1203: astore #18
    //   1205: iconst_2
    //   1206: iload #23
    //   1208: invokestatic a : ([BIS)V
    //   1211: aload #18
    //   1213: iconst_4
    //   1214: iload #24
    //   1216: invokestatic a : ([BIS)V
    //   1219: aload #18
    //   1221: bipush #6
    //   1223: iload #25
    //   1225: invokestatic a : ([BIS)V
    //   1228: aload #18
    //   1230: bipush #8
    //   1232: sipush #10000
    //   1235: invokestatic a : ([BIS)V
    //   1238: aload #18
    //   1240: bipush #10
    //   1242: sipush #10000
    //   1245: invokestatic a : ([BIS)V
    //   1248: goto -> 1813
    //   1251: aload_3
    //   1252: iload #8
    //   1254: invokestatic b : ([BI)I
    //   1257: istore #31
    //   1259: iinc #8, 4
    //   1262: bipush #6
    //   1264: newarray byte
    //   1266: dup
    //   1267: astore #18
    //   1269: iconst_2
    //   1270: iload #31
    //   1272: invokestatic a : ([BII)V
    //   1275: goto -> 1813
    //   1278: aload_3
    //   1279: iload #8
    //   1281: invokestatic a : ([BI)I
    //   1284: i2s
    //   1285: istore #23
    //   1287: iinc #8, 2
    //   1290: aload_3
    //   1291: iload #8
    //   1293: invokestatic a : ([BI)I
    //   1296: i2s
    //   1297: istore #24
    //   1299: iinc #8, 2
    //   1302: aload_3
    //   1303: iload #8
    //   1305: invokestatic b : ([BI)I
    //   1308: istore #32
    //   1310: iinc #8, 4
    //   1313: bipush #10
    //   1315: newarray byte
    //   1317: dup
    //   1318: astore #18
    //   1320: iconst_2
    //   1321: iload #23
    //   1323: invokestatic a : ([BIS)V
    //   1326: aload #18
    //   1328: iconst_4
    //   1329: iload #24
    //   1331: invokestatic a : ([BIS)V
    //   1334: aload #18
    //   1336: bipush #6
    //   1338: iload #32
    //   1340: invokestatic a : ([BII)V
    //   1343: goto -> 1813
    //   1346: aload_3
    //   1347: iload #8
    //   1349: invokestatic a : ([BI)I
    //   1352: i2s
    //   1353: istore #23
    //   1355: iinc #8, 2
    //   1358: aload_3
    //   1359: iload #8
    //   1361: invokestatic a : ([BI)I
    //   1364: i2s
    //   1365: istore #24
    //   1367: iinc #8, 2
    //   1370: aload_3
    //   1371: iload #8
    //   1373: iinc #8, 1
    //   1376: baload
    //   1377: sipush #255
    //   1380: iand
    //   1381: i2s
    //   1382: istore #33
    //   1384: aload_3
    //   1385: iload #8
    //   1387: iinc #8, 1
    //   1390: baload
    //   1391: sipush #255
    //   1394: iand
    //   1395: i2s
    //   1396: istore #34
    //   1398: bipush #8
    //   1400: newarray byte
    //   1402: dup
    //   1403: astore #18
    //   1405: iconst_2
    //   1406: iload #23
    //   1408: invokestatic a : ([BIS)V
    //   1411: aload #18
    //   1413: iconst_4
    //   1414: iload #24
    //   1416: invokestatic a : ([BIS)V
    //   1419: aload #18
    //   1421: bipush #6
    //   1423: iload #33
    //   1425: i2b
    //   1426: bastore
    //   1427: aload #18
    //   1429: bipush #7
    //   1431: iload #34
    //   1433: i2b
    //   1434: bastore
    //   1435: goto -> 1813
    //   1438: aload_3
    //   1439: iload #8
    //   1441: invokestatic a : ([BI)I
    //   1444: i2s
    //   1445: istore #23
    //   1447: iinc #8, 2
    //   1450: aload_3
    //   1451: iload #8
    //   1453: invokestatic a : ([BI)I
    //   1456: i2s
    //   1457: istore #24
    //   1459: iinc #8, 2
    //   1462: aload_3
    //   1463: iload #8
    //   1465: iinc #8, 1
    //   1468: baload
    //   1469: sipush #255
    //   1472: iand
    //   1473: i2s
    //   1474: istore #33
    //   1476: bipush #7
    //   1478: newarray byte
    //   1480: dup
    //   1481: astore #18
    //   1483: iconst_2
    //   1484: iload #23
    //   1486: invokestatic a : ([BIS)V
    //   1489: aload #18
    //   1491: iconst_4
    //   1492: iload #24
    //   1494: invokestatic a : ([BIS)V
    //   1497: aload #18
    //   1499: bipush #6
    //   1501: iload #33
    //   1503: i2b
    //   1504: bastore
    //   1505: goto -> 1813
    //   1508: aload_3
    //   1509: iload #8
    //   1511: invokestatic a : ([BI)I
    //   1514: i2s
    //   1515: istore #35
    //   1517: iinc #8, 2
    //   1520: bipush #8
    //   1522: iload #35
    //   1524: iadd
    //   1525: newarray byte
    //   1527: dup
    //   1528: astore #18
    //   1530: iconst_2
    //   1531: iload #35
    //   1533: invokestatic a : ([BIS)V
    //   1536: aload #18
    //   1538: iconst_4
    //   1539: sipush #10000
    //   1542: invokestatic a : ([BIS)V
    //   1545: aload #18
    //   1547: bipush #6
    //   1549: iconst_0
    //   1550: bastore
    //   1551: aload #18
    //   1553: bipush #7
    //   1555: iconst_0
    //   1556: bastore
    //   1557: aload_3
    //   1558: iload #8
    //   1560: aload #18
    //   1562: bipush #8
    //   1564: iload #35
    //   1566: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1569: iload #8
    //   1571: iload #35
    //   1573: iadd
    //   1574: istore #8
    //   1576: goto -> 1813
    //   1579: aload_3
    //   1580: iload #8
    //   1582: iinc #8, 1
    //   1585: baload
    //   1586: sipush #255
    //   1589: iand
    //   1590: i2s
    //   1591: istore #36
    //   1593: aload_3
    //   1594: iload #8
    //   1596: invokestatic a : ([BI)I
    //   1599: i2s
    //   1600: istore #24
    //   1602: iinc #8, 2
    //   1605: aload_3
    //   1606: iload #8
    //   1608: invokestatic a : ([BI)I
    //   1611: i2s
    //   1612: istore #35
    //   1614: iinc #8, 2
    //   1617: bipush #11
    //   1619: iload #35
    //   1621: iadd
    //   1622: newarray byte
    //   1624: dup
    //   1625: astore #18
    //   1627: iconst_2
    //   1628: iload #35
    //   1630: invokestatic a : ([BIS)V
    //   1633: aload #18
    //   1635: iconst_4
    //   1636: sipush #10000
    //   1639: invokestatic a : ([BIS)V
    //   1642: aload #18
    //   1644: bipush #6
    //   1646: iload #24
    //   1648: invokestatic a : ([BIS)V
    //   1651: aload #18
    //   1653: bipush #8
    //   1655: iload #36
    //   1657: i2b
    //   1658: bastore
    //   1659: aload #18
    //   1661: bipush #9
    //   1663: iconst_0
    //   1664: bastore
    //   1665: aload #18
    //   1667: bipush #10
    //   1669: iconst_0
    //   1670: bastore
    //   1671: aload_3
    //   1672: iload #8
    //   1674: aload #18
    //   1676: bipush #11
    //   1678: iload #35
    //   1680: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1683: iload #8
    //   1685: iload #35
    //   1687: iadd
    //   1688: istore #8
    //   1690: goto -> 1813
    //   1693: aload_3
    //   1694: iload #8
    //   1696: invokestatic a : ([BI)I
    //   1699: i2s
    //   1700: istore #23
    //   1702: iinc #8, 2
    //   1705: aload_3
    //   1706: iload #8
    //   1708: invokestatic a : ([BI)I
    //   1711: i2s
    //   1712: istore #24
    //   1714: iinc #8, 2
    //   1717: aload_3
    //   1718: iload #8
    //   1720: invokestatic a : ([BI)I
    //   1723: i2s
    //   1724: istore #37
    //   1726: iinc #8, 2
    //   1729: bipush #8
    //   1731: newarray byte
    //   1733: dup
    //   1734: astore #18
    //   1736: iconst_2
    //   1737: iload #23
    //   1739: invokestatic a : ([BIS)V
    //   1742: aload #18
    //   1744: iconst_4
    //   1745: iload #24
    //   1747: invokestatic a : ([BIS)V
    //   1750: aload #18
    //   1752: bipush #6
    //   1754: iload #37
    //   1756: invokestatic a : ([BIS)V
    //   1759: goto -> 1813
    //   1762: aload_3
    //   1763: iload #8
    //   1765: iinc #8, 1
    //   1768: baload
    //   1769: sipush #255
    //   1772: iand
    //   1773: i2s
    //   1774: istore #38
    //   1776: iconst_3
    //   1777: newarray byte
    //   1779: dup
    //   1780: astore #18
    //   1782: iconst_2
    //   1783: iload #38
    //   1785: i2b
    //   1786: bastore
    //   1787: goto -> 1813
    //   1790: aload_3
    //   1791: iload #8
    //   1793: iinc #8, 1
    //   1796: baload
    //   1797: sipush #255
    //   1800: iand
    //   1801: i2s
    //   1802: dup
    //   1803: istore #15
    //   1805: anewarray [B
    //   1808: astore #12
    //   1810: aconst_null
    //   1811: astore #18
    //   1813: aload #18
    //   1815: ifnull -> 1864
    //   1818: aload #18
    //   1820: iconst_0
    //   1821: iload #17
    //   1823: sipush #255
    //   1826: iand
    //   1827: i2b
    //   1828: bastore
    //   1829: aload #18
    //   1831: iconst_1
    //   1832: iconst_0
    //   1833: bastore
    //   1834: aload #14
    //   1836: aload #12
    //   1838: if_acmpne -> 1854
    //   1841: aload #14
    //   1843: iload #13
    //   1845: aload #18
    //   1847: aastore
    //   1848: iinc #13, 1
    //   1851: goto -> 1864
    //   1854: aload #14
    //   1856: iload #11
    //   1858: aload #18
    //   1860: aastore
    //   1861: iinc #11, 1
    //   1864: aload #14
    //   1866: aload #12
    //   1868: if_acmpne -> 2025
    //   1871: iload #15
    //   1873: ifne -> 2025
    //   1876: iconst_0
    //   1877: istore #19
    //   1879: iconst_0
    //   1880: istore #20
    //   1882: iload #20
    //   1884: aload #12
    //   1886: arraylength
    //   1887: if_icmpge -> 1907
    //   1890: iload #19
    //   1892: aload #12
    //   1894: iload #20
    //   1896: aaload
    //   1897: arraylength
    //   1898: iadd
    //   1899: istore #19
    //   1901: iinc #20, 1
    //   1904: goto -> 1882
    //   1907: iconst_2
    //   1908: aload #12
    //   1910: arraylength
    //   1911: iconst_4
    //   1912: imul
    //   1913: iadd
    //   1914: iload #19
    //   1916: iadd
    //   1917: newarray byte
    //   1919: dup
    //   1920: astore #18
    //   1922: iconst_0
    //   1923: iconst_0
    //   1924: bastore
    //   1925: aload #18
    //   1927: iconst_1
    //   1928: aload #12
    //   1930: arraylength
    //   1931: i2b
    //   1932: bastore
    //   1933: iconst_2
    //   1934: aload #12
    //   1936: arraylength
    //   1937: iconst_4
    //   1938: imul
    //   1939: iadd
    //   1940: istore #20
    //   1942: iconst_0
    //   1943: istore #21
    //   1945: iload #21
    //   1947: aload #12
    //   1949: arraylength
    //   1950: if_icmpge -> 2006
    //   1953: aload #18
    //   1955: iconst_2
    //   1956: iload #21
    //   1958: iconst_4
    //   1959: imul
    //   1960: iadd
    //   1961: aload #12
    //   1963: iload #21
    //   1965: aaload
    //   1966: arraylength
    //   1967: invokestatic a : ([BII)V
    //   1970: aload #12
    //   1972: iload #21
    //   1974: aaload
    //   1975: iconst_0
    //   1976: aload #18
    //   1978: iload #20
    //   1980: aload #12
    //   1982: iload #21
    //   1984: aaload
    //   1985: arraylength
    //   1986: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1989: iload #20
    //   1991: aload #12
    //   1993: iload #21
    //   1995: aaload
    //   1996: arraylength
    //   1997: iadd
    //   1998: istore #20
    //   2000: iinc #21, 1
    //   2003: goto -> 1945
    //   2006: aload #10
    //   2008: iload #11
    //   2010: aload #18
    //   2012: aastore
    //   2013: iconst_0
    //   2014: istore #13
    //   2016: aconst_null
    //   2017: checkcast [[B
    //   2020: astore #12
    //   2022: iinc #11, 1
    //   2025: iinc #16, 1
    //   2028: goto -> 486
    //   2031: aload_0
    //   2032: aload #10
    //   2034: putfield a : [[B
    //   2037: goto -> 2071
    //   2040: aload_2
    //   2041: ldc2_w 2
    //   2044: invokevirtual skip : (J)J
    //   2047: pop2
    //   2048: aload_2
    //   2049: aload_3
    //   2050: iconst_0
    //   2051: iconst_4
    //   2052: invokevirtual read : ([BII)I
    //   2055: pop
    //   2056: aload_3
    //   2057: iconst_0
    //   2058: invokestatic b : ([BI)I
    //   2061: istore #6
    //   2063: aload_2
    //   2064: iload #6
    //   2066: i2l
    //   2067: invokevirtual skip : (J)J
    //   2070: pop2
    //   2071: iload #4
    //   2073: ifeq -> 38
    //   2076: return
    //   2077: pop
    //   2078: return
    // Exception table:
    //   from	to	target	type
    //   0	2076	2077	java/lang/Exception
  }

  private void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: getstatic i.a : [La;
    //   3: bipush #41
    //   5: aaload
    //   6: getfield e : I
    //   9: getstatic i.a : [La;
    //   12: bipush #41
    //   14: aaload
    //   15: getfield a : [B
    //   18: iconst_1
    //   19: baload
    //   20: sipush #255
    //   23: iand
    //   24: iadd
    //   25: istore #7
    //   27: iload #6
    //   29: aload_0
    //   30: getfield h : I
    //   33: if_icmple -> 42
    //   36: aload_0
    //   37: getfield h : I
    //   40: istore #6
    //   42: iload #5
    //   44: istore #8
    //   46: iload #8
    //   48: iload #6
    //   50: if_icmpge -> 116
    //   53: iload #8
    //   55: ifle -> 72
    //   58: aload_0
    //   59: getfield a : [S
    //   62: iload #8
    //   64: iconst_1
    //   65: isub
    //   66: saload
    //   67: iconst_1
    //   68: iadd
    //   69: goto -> 73
    //   72: iconst_0
    //   73: putstatic a.f : I
    //   76: aload_0
    //   77: getfield a : [S
    //   80: iload #8
    //   82: saload
    //   83: putstatic a.g : I
    //   86: getstatic i.a : [La;
    //   89: bipush #41
    //   91: aaload
    //   92: aload_1
    //   93: aload_2
    //   94: iload_3
    //   95: iload #4
    //   97: iload #8
    //   99: iload #5
    //   101: isub
    //   102: iload #7
    //   104: imul
    //   105: iadd
    //   106: iconst_4
    //   107: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   110: iinc #8, 1
    //   113: goto -> 46
    //   116: iconst_m1
    //   117: putstatic a.f : I
    //   120: iconst_m1
    //   121: putstatic a.g : I
    //   124: return
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
    //   22: if_icmpge -> 436
    //   25: aload_1
    //   26: iload #6
    //   28: invokevirtual charAt : (I)C
    //   31: dup
    //   32: istore #7
    //   34: bipush #32
    //   36: if_icmple -> 126
    //   39: getstatic a.h : [B
    //   42: iload #7
    //   44: baload
    //   45: sipush #255
    //   48: iand
    //   49: istore #8
    //   51: getstatic i.a : [La;
    //   54: bipush #41
    //   56: aaload
    //   57: getfield d : [B
    //   60: iload #8
    //   62: iconst_2
    //   63: ishl
    //   64: baload
    //   65: sipush #255
    //   68: iand
    //   69: iconst_1
    //   70: ishl
    //   71: istore #9
    //   73: iload #4
    //   75: getstatic i.a : [La;
    //   78: bipush #41
    //   80: aaload
    //   81: getfield a : [B
    //   84: iload #9
    //   86: baload
    //   87: sipush #255
    //   90: iand
    //   91: getstatic i.a : [La;
    //   94: bipush #41
    //   96: aaload
    //   97: getfield d : [B
    //   100: iload #8
    //   102: iconst_2
    //   103: ishl
    //   104: iconst_1
    //   105: iadd
    //   106: baload
    //   107: isub
    //   108: getstatic i.a : [La;
    //   111: bipush #41
    //   113: aaload
    //   114: getfield d : [B
    //   117: iconst_1
    //   118: baload
    //   119: iadd
    //   120: iadd
    //   121: istore #4
    //   123: goto -> 379
    //   126: iload #7
    //   128: bipush #32
    //   130: if_icmpne -> 305
    //   133: iload #6
    //   135: iconst_1
    //   136: iadd
    //   137: iload_3
    //   138: if_icmpge -> 305
    //   141: aload_1
    //   142: iload #6
    //   144: iconst_1
    //   145: iadd
    //   146: invokevirtual charAt : (I)C
    //   149: bipush #63
    //   151: if_icmpeq -> 180
    //   154: aload_1
    //   155: iload #6
    //   157: iconst_1
    //   158: iadd
    //   159: invokevirtual charAt : (I)C
    //   162: bipush #33
    //   164: if_icmpeq -> 180
    //   167: aload_1
    //   168: iload #6
    //   170: iconst_1
    //   171: iadd
    //   172: invokevirtual charAt : (I)C
    //   175: bipush #58
    //   177: if_icmpne -> 305
    //   180: iload #4
    //   182: getstatic i.a : [La;
    //   185: bipush #41
    //   187: aaload
    //   188: getfield a : [B
    //   191: iconst_0
    //   192: baload
    //   193: sipush #255
    //   196: iand
    //   197: getstatic i.a : [La;
    //   200: bipush #41
    //   202: aaload
    //   203: getfield d : [B
    //   206: iconst_1
    //   207: baload
    //   208: iadd
    //   209: iadd
    //   210: istore #4
    //   212: getstatic a.h : [B
    //   215: aload_1
    //   216: iload #6
    //   218: iconst_1
    //   219: iadd
    //   220: invokevirtual charAt : (I)C
    //   223: baload
    //   224: sipush #255
    //   227: iand
    //   228: istore #9
    //   230: getstatic i.a : [La;
    //   233: bipush #41
    //   235: aaload
    //   236: getfield d : [B
    //   239: iload #9
    //   241: iconst_2
    //   242: ishl
    //   243: baload
    //   244: sipush #255
    //   247: iand
    //   248: iconst_1
    //   249: ishl
    //   250: istore #10
    //   252: iload #4
    //   254: getstatic i.a : [La;
    //   257: bipush #41
    //   259: aaload
    //   260: getfield a : [B
    //   263: iload #10
    //   265: baload
    //   266: sipush #255
    //   269: iand
    //   270: getstatic i.a : [La;
    //   273: bipush #41
    //   275: aaload
    //   276: getfield d : [B
    //   279: iload #9
    //   281: iconst_2
    //   282: ishl
    //   283: iconst_1
    //   284: iadd
    //   285: baload
    //   286: isub
    //   287: getstatic i.a : [La;
    //   290: bipush #41
    //   292: aaload
    //   293: getfield d : [B
    //   296: iconst_1
    //   297: baload
    //   298: iadd
    //   299: iadd
    //   300: istore #4
    //   302: goto -> 379
    //   305: iload #7
    //   307: bipush #32
    //   309: if_icmpne -> 347
    //   312: iload #4
    //   314: getstatic i.a : [La;
    //   317: bipush #41
    //   319: aaload
    //   320: getfield a : [B
    //   323: iconst_0
    //   324: baload
    //   325: sipush #255
    //   328: iand
    //   329: getstatic i.a : [La;
    //   332: bipush #41
    //   334: aaload
    //   335: getfield d : [B
    //   338: iconst_1
    //   339: baload
    //   340: iadd
    //   341: iadd
    //   342: istore #4
    //   344: goto -> 424
    //   347: iload #7
    //   349: bipush #10
    //   351: if_icmpne -> 430
    //   354: iconst_0
    //   355: istore #4
    //   357: aload_0
    //   358: getfield a : [S
    //   361: aload_0
    //   362: dup
    //   363: getfield h : I
    //   366: dup_x1
    //   367: iconst_1
    //   368: iadd
    //   369: putfield h : I
    //   372: iload #6
    //   374: i2s
    //   375: sastore
    //   376: goto -> 430
    //   379: iload #4
    //   381: iload_2
    //   382: if_icmple -> 413
    //   385: iload #5
    //   387: iconst_1
    //   388: isub
    //   389: istore #6
    //   391: aload_0
    //   392: getfield a : [S
    //   395: aload_0
    //   396: dup
    //   397: getfield h : I
    //   400: dup_x1
    //   401: iconst_1
    //   402: iadd
    //   403: putfield h : I
    //   406: iload #6
    //   408: i2s
    //   409: sastore
    //   410: iconst_0
    //   411: istore #4
    //   413: aload_1
    //   414: iload #6
    //   416: invokevirtual charAt : (I)C
    //   419: bipush #32
    //   421: if_icmpne -> 430
    //   424: iload #6
    //   426: iconst_1
    //   427: iadd
    //   428: istore #5
    //   430: iinc #6, 1
    //   433: goto -> 19
    //   436: aload_0
    //   437: getfield a : [S
    //   440: aload_0
    //   441: dup
    //   442: getfield h : I
    //   445: dup_x1
    //   446: iconst_1
    //   447: iadd
    //   448: putfield h : I
    //   451: iload_3
    //   452: i2s
    //   453: sastore
    //   454: return
  }

  private static void a(byte[] paramArrayOfbyte, int paramInt, short paramShort) {
    paramArrayOfbyte[paramInt] = (byte)(paramShort & 0xFF);
    paramArrayOfbyte[paramInt + 1] = (byte)(paramShort >> 8 & 0xFF);
  }

  private static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1] = (byte)(paramInt2 & 0xFF);
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 >> 8 & 0xFF);
    paramArrayOfbyte[paramInt1 + 2] = (byte)(paramInt2 >> 16 & 0xFF);
    paramArrayOfbyte[paramInt1 + 3] = (byte)(paramInt2 >> 24 & 0xFF);
  }
}
