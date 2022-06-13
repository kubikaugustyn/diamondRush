import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class a {
  public static int[] a = new int[4096];

  public byte[] a;

  public byte[] b;

  public short[] a;

  public byte[] c;

  public byte[] d;

  public byte[] e;

  public short[] b;

  public byte[] f;

  public int[][] a;

  public int[][] b;

  public int a;

  public int b;

  public boolean a;

  public short a;

  public byte[] g;

  public short[] c;

  public Image[][] a;

  public static int c;

  public static int d;

  public static byte[] h;

  public int e = 0;

  public static int f = -1;

  public static int g = -1;

  public final void a(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: invokestatic gc : ()V
    //   3: iinc #2, 1
    //   6: iinc #2, 1
    //   9: iconst_0
    //   10: istore_3
    //   11: iinc #2, 1
    //   14: iinc #2, 1
    //   17: iinc #2, 1
    //   20: iinc #2, 1
    //   23: aload_1
    //   24: iload_2
    //   25: iinc #2, 1
    //   28: baload
    //   29: sipush #255
    //   32: iand
    //   33: aload_1
    //   34: iload_2
    //   35: iinc #2, 1
    //   38: baload
    //   39: sipush #255
    //   42: iand
    //   43: bipush #8
    //   45: ishl
    //   46: iadd
    //   47: i2s
    //   48: dup
    //   49: istore #5
    //   51: ifle -> 87
    //   54: aload_0
    //   55: iload #5
    //   57: iconst_1
    //   58: ishl
    //   59: newarray byte
    //   61: putfield a : [B
    //   64: aload_1
    //   65: iload_2
    //   66: aload_0
    //   67: getfield a : [B
    //   70: iconst_0
    //   71: aload_0
    //   72: getfield a : [B
    //   75: arraylength
    //   76: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   79: iload_2
    //   80: aload_0
    //   81: getfield a : [B
    //   84: arraylength
    //   85: iadd
    //   86: istore_2
    //   87: aload_1
    //   88: iload_2
    //   89: iinc #2, 1
    //   92: baload
    //   93: sipush #255
    //   96: iand
    //   97: aload_1
    //   98: iload_2
    //   99: iinc #2, 1
    //   102: baload
    //   103: sipush #255
    //   106: iand
    //   107: bipush #8
    //   109: ishl
    //   110: iadd
    //   111: i2s
    //   112: dup
    //   113: istore #6
    //   115: ifle -> 151
    //   118: aload_0
    //   119: iload #6
    //   121: iconst_2
    //   122: ishl
    //   123: newarray byte
    //   125: putfield d : [B
    //   128: aload_1
    //   129: iload_2
    //   130: aload_0
    //   131: getfield d : [B
    //   134: iconst_0
    //   135: aload_0
    //   136: getfield d : [B
    //   139: arraylength
    //   140: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   143: iload_2
    //   144: aload_0
    //   145: getfield d : [B
    //   148: arraylength
    //   149: iadd
    //   150: istore_2
    //   151: aload_1
    //   152: iload_2
    //   153: iinc #2, 1
    //   156: baload
    //   157: sipush #255
    //   160: iand
    //   161: aload_1
    //   162: iload_2
    //   163: iinc #2, 1
    //   166: baload
    //   167: sipush #255
    //   170: iand
    //   171: bipush #8
    //   173: ishl
    //   174: iadd
    //   175: i2s
    //   176: dup
    //   177: istore #7
    //   179: ifle -> 305
    //   182: aload_0
    //   183: iload #7
    //   185: newarray byte
    //   187: putfield b : [B
    //   190: aload_0
    //   191: iload #7
    //   193: newarray short
    //   195: putfield a : [S
    //   198: iconst_0
    //   199: istore #8
    //   201: iload #8
    //   203: iload #7
    //   205: if_icmpge -> 262
    //   208: aload_0
    //   209: getfield b : [B
    //   212: iload #8
    //   214: aload_1
    //   215: iload_2
    //   216: iinc #2, 1
    //   219: baload
    //   220: bastore
    //   221: iinc #2, 1
    //   224: aload_0
    //   225: getfield a : [S
    //   228: iload #8
    //   230: aload_1
    //   231: iload_2
    //   232: iinc #2, 1
    //   235: baload
    //   236: sipush #255
    //   239: iand
    //   240: aload_1
    //   241: iload_2
    //   242: iinc #2, 1
    //   245: baload
    //   246: sipush #255
    //   249: iand
    //   250: bipush #8
    //   252: ishl
    //   253: iadd
    //   254: i2s
    //   255: sastore
    //   256: iinc #8, 1
    //   259: goto -> 201
    //   262: iload #7
    //   264: iconst_2
    //   265: ishl
    //   266: istore #8
    //   268: aload_0
    //   269: iload #8
    //   271: newarray byte
    //   273: putfield c : [B
    //   276: iconst_0
    //   277: istore #9
    //   279: iload #9
    //   281: iload #8
    //   283: if_icmpge -> 305
    //   286: aload_0
    //   287: getfield c : [B
    //   290: iload #9
    //   292: aload_1
    //   293: iload_2
    //   294: iinc #2, 1
    //   297: baload
    //   298: bastore
    //   299: iinc #9, 1
    //   302: goto -> 279
    //   305: aload_1
    //   306: iload_2
    //   307: iinc #2, 1
    //   310: baload
    //   311: sipush #255
    //   314: iand
    //   315: aload_1
    //   316: iload_2
    //   317: iinc #2, 1
    //   320: baload
    //   321: sipush #255
    //   324: iand
    //   325: bipush #8
    //   327: ishl
    //   328: iadd
    //   329: i2s
    //   330: dup
    //   331: istore #8
    //   333: ifle -> 369
    //   336: aload_0
    //   337: iload #8
    //   339: iconst_5
    //   340: imul
    //   341: newarray byte
    //   343: putfield f : [B
    //   346: aload_1
    //   347: iload_2
    //   348: aload_0
    //   349: getfield f : [B
    //   352: iconst_0
    //   353: aload_0
    //   354: getfield f : [B
    //   357: arraylength
    //   358: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   361: iload_2
    //   362: aload_0
    //   363: getfield f : [B
    //   366: arraylength
    //   367: iadd
    //   368: istore_2
    //   369: aload_1
    //   370: iload_2
    //   371: iinc #2, 1
    //   374: baload
    //   375: sipush #255
    //   378: iand
    //   379: aload_1
    //   380: iload_2
    //   381: iinc #2, 1
    //   384: baload
    //   385: sipush #255
    //   388: iand
    //   389: bipush #8
    //   391: ishl
    //   392: iadd
    //   393: i2s
    //   394: dup
    //   395: istore #9
    //   397: ifle -> 480
    //   400: aload_0
    //   401: iload #9
    //   403: newarray byte
    //   405: putfield e : [B
    //   408: aload_0
    //   409: iload #9
    //   411: newarray short
    //   413: putfield b : [S
    //   416: iconst_0
    //   417: istore #10
    //   419: iload #10
    //   421: iload #9
    //   423: if_icmpge -> 480
    //   426: aload_0
    //   427: getfield e : [B
    //   430: iload #10
    //   432: aload_1
    //   433: iload_2
    //   434: iinc #2, 1
    //   437: baload
    //   438: bastore
    //   439: iinc #2, 1
    //   442: aload_0
    //   443: getfield b : [S
    //   446: iload #10
    //   448: aload_1
    //   449: iload_2
    //   450: iinc #2, 1
    //   453: baload
    //   454: sipush #255
    //   457: iand
    //   458: aload_1
    //   459: iload_2
    //   460: iinc #2, 1
    //   463: baload
    //   464: sipush #255
    //   467: iand
    //   468: bipush #8
    //   470: ishl
    //   471: iadd
    //   472: i2s
    //   473: sastore
    //   474: iinc #10, 1
    //   477: goto -> 419
    //   480: iload #5
    //   482: ifgt -> 489
    //   485: invokestatic gc : ()V
    //   488: return
    //   489: aload_1
    //   490: iload_2
    //   491: iinc #2, 1
    //   494: baload
    //   495: sipush #255
    //   498: iand
    //   499: aload_1
    //   500: iload_2
    //   501: iinc #2, 1
    //   504: baload
    //   505: sipush #255
    //   508: iand
    //   509: bipush #8
    //   511: ishl
    //   512: iadd
    //   513: i2s
    //   514: istore #10
    //   516: aload_0
    //   517: aload_1
    //   518: iload_2
    //   519: iinc #2, 1
    //   522: baload
    //   523: sipush #255
    //   526: iand
    //   527: putfield a : I
    //   530: aload_1
    //   531: iload_2
    //   532: iinc #2, 1
    //   535: baload
    //   536: sipush #255
    //   539: iand
    //   540: istore #11
    //   542: aload_0
    //   543: bipush #16
    //   545: anewarray [I
    //   548: putfield b : [[I
    //   551: iconst_0
    //   552: istore #12
    //   554: iload #12
    //   556: aload_0
    //   557: getfield a : I
    //   560: if_icmpge -> 1079
    //   563: aload_0
    //   564: getfield b : [[I
    //   567: iload #12
    //   569: iload #11
    //   571: newarray int
    //   573: aastore
    //   574: iload #10
    //   576: lookupswitch default -> 1073, -30584 -> 620, 17476 -> 725, 21781 -> 864, 25861 -> 971
    //   620: iconst_0
    //   621: istore #13
    //   623: iload #13
    //   625: iload #11
    //   627: if_icmpge -> 1073
    //   630: aload_1
    //   631: iload_2
    //   632: iinc #2, 1
    //   635: baload
    //   636: sipush #255
    //   639: iand
    //   640: dup
    //   641: istore #14
    //   643: aload_1
    //   644: iload_2
    //   645: iinc #2, 1
    //   648: baload
    //   649: sipush #255
    //   652: iand
    //   653: bipush #8
    //   655: ishl
    //   656: iadd
    //   657: dup
    //   658: istore #14
    //   660: aload_1
    //   661: iload_2
    //   662: iinc #2, 1
    //   665: baload
    //   666: sipush #255
    //   669: iand
    //   670: bipush #16
    //   672: ishl
    //   673: iadd
    //   674: dup
    //   675: istore #14
    //   677: aload_1
    //   678: iload_2
    //   679: iinc #2, 1
    //   682: baload
    //   683: sipush #255
    //   686: iand
    //   687: bipush #24
    //   689: ishl
    //   690: iadd
    //   691: dup
    //   692: istore #14
    //   694: ldc -16777216
    //   696: iand
    //   697: ldc -16777216
    //   699: if_icmpeq -> 707
    //   702: aload_0
    //   703: iconst_1
    //   704: putfield a : Z
    //   707: aload_0
    //   708: getfield b : [[I
    //   711: iload #12
    //   713: aaload
    //   714: iload #13
    //   716: iload #14
    //   718: iastore
    //   719: iinc #13, 1
    //   722: goto -> 623
    //   725: iconst_0
    //   726: istore #13
    //   728: iload #13
    //   730: iload #11
    //   732: if_icmpge -> 1073
    //   735: aload_1
    //   736: iload_2
    //   737: iinc #2, 1
    //   740: baload
    //   741: sipush #255
    //   744: iand
    //   745: dup
    //   746: istore #14
    //   748: aload_1
    //   749: iload_2
    //   750: iinc #2, 1
    //   753: baload
    //   754: sipush #255
    //   757: iand
    //   758: bipush #8
    //   760: ishl
    //   761: iadd
    //   762: dup
    //   763: istore #14
    //   765: ldc 61440
    //   767: iand
    //   768: ldc 61440
    //   770: if_icmpeq -> 778
    //   773: aload_0
    //   774: iconst_1
    //   775: putfield a : Z
    //   778: aload_0
    //   779: getfield b : [[I
    //   782: iload #12
    //   784: aaload
    //   785: iload #13
    //   787: iload #14
    //   789: ldc 61440
    //   791: iand
    //   792: bipush #16
    //   794: ishl
    //   795: iload #14
    //   797: ldc 61440
    //   799: iand
    //   800: bipush #12
    //   802: ishl
    //   803: ior
    //   804: iload #14
    //   806: sipush #3840
    //   809: iand
    //   810: bipush #12
    //   812: ishl
    //   813: ior
    //   814: iload #14
    //   816: sipush #3840
    //   819: iand
    //   820: bipush #8
    //   822: ishl
    //   823: ior
    //   824: iload #14
    //   826: sipush #240
    //   829: iand
    //   830: bipush #8
    //   832: ishl
    //   833: ior
    //   834: iload #14
    //   836: sipush #240
    //   839: iand
    //   840: iconst_4
    //   841: ishl
    //   842: ior
    //   843: iload #14
    //   845: bipush #15
    //   847: iand
    //   848: iconst_4
    //   849: ishl
    //   850: ior
    //   851: iload #14
    //   853: bipush #15
    //   855: iand
    //   856: ior
    //   857: iastore
    //   858: iinc #13, 1
    //   861: goto -> 728
    //   864: iconst_0
    //   865: istore #13
    //   867: iload #13
    //   869: iload #11
    //   871: if_icmpge -> 1073
    //   874: aload_1
    //   875: iload_2
    //   876: iinc #2, 1
    //   879: baload
    //   880: sipush #255
    //   883: iand
    //   884: dup
    //   885: istore #14
    //   887: aload_1
    //   888: iload_2
    //   889: iinc #2, 1
    //   892: baload
    //   893: sipush #255
    //   896: iand
    //   897: bipush #8
    //   899: ishl
    //   900: iadd
    //   901: istore #14
    //   903: ldc -16777216
    //   905: istore #15
    //   907: iload #14
    //   909: ldc 32768
    //   911: iand
    //   912: ldc 32768
    //   914: if_icmpeq -> 925
    //   917: iconst_0
    //   918: istore #15
    //   920: aload_0
    //   921: iconst_1
    //   922: putfield a : Z
    //   925: aload_0
    //   926: getfield b : [[I
    //   929: iload #12
    //   931: aaload
    //   932: iload #13
    //   934: iload #15
    //   936: iload #14
    //   938: sipush #31744
    //   941: iand
    //   942: bipush #9
    //   944: ishl
    //   945: ior
    //   946: iload #14
    //   948: sipush #992
    //   951: iand
    //   952: bipush #6
    //   954: ishl
    //   955: ior
    //   956: iload #14
    //   958: bipush #31
    //   960: iand
    //   961: iconst_3
    //   962: ishl
    //   963: ior
    //   964: iastore
    //   965: iinc #13, 1
    //   968: goto -> 867
    //   971: iconst_0
    //   972: istore #13
    //   974: iload #13
    //   976: iload #11
    //   978: if_icmpge -> 1073
    //   981: aload_1
    //   982: iload_2
    //   983: iinc #2, 1
    //   986: baload
    //   987: sipush #255
    //   990: iand
    //   991: dup
    //   992: istore #14
    //   994: aload_1
    //   995: iload_2
    //   996: iinc #2, 1
    //   999: baload
    //   1000: sipush #255
    //   1003: iand
    //   1004: bipush #8
    //   1006: ishl
    //   1007: iadd
    //   1008: istore #14
    //   1010: ldc -16777216
    //   1012: istore #15
    //   1014: iload #14
    //   1016: ldc 63519
    //   1018: if_icmpne -> 1029
    //   1021: iconst_0
    //   1022: istore #15
    //   1024: aload_0
    //   1025: iconst_1
    //   1026: putfield a : Z
    //   1029: aload_0
    //   1030: getfield b : [[I
    //   1033: iload #12
    //   1035: aaload
    //   1036: iload #13
    //   1038: iload #15
    //   1040: iload #14
    //   1042: ldc 63488
    //   1044: iand
    //   1045: bipush #8
    //   1047: ishl
    //   1048: ior
    //   1049: iload #14
    //   1051: sipush #2016
    //   1054: iand
    //   1055: iconst_5
    //   1056: ishl
    //   1057: ior
    //   1058: iload #14
    //   1060: bipush #31
    //   1062: iand
    //   1063: iconst_3
    //   1064: ishl
    //   1065: ior
    //   1066: iastore
    //   1067: iinc #13, 1
    //   1070: goto -> 974
    //   1073: iinc #12, 1
    //   1076: goto -> 554
    //   1079: aload_0
    //   1080: aload_1
    //   1081: iload_2
    //   1082: iinc #2, 1
    //   1085: baload
    //   1086: sipush #255
    //   1089: iand
    //   1090: aload_1
    //   1091: iload_2
    //   1092: iinc #2, 1
    //   1095: baload
    //   1096: sipush #255
    //   1099: iand
    //   1100: bipush #8
    //   1102: ishl
    //   1103: iadd
    //   1104: i2s
    //   1105: putfield a : S
    //   1108: iload #5
    //   1110: ifle -> 1273
    //   1113: aload_0
    //   1114: iload #5
    //   1116: newarray short
    //   1118: putfield c : [S
    //   1121: iconst_0
    //   1122: istore #12
    //   1124: iload_2
    //   1125: istore #13
    //   1127: iconst_0
    //   1128: istore #14
    //   1130: iload #14
    //   1132: iload #5
    //   1134: if_icmpge -> 1196
    //   1137: aload_1
    //   1138: iload #13
    //   1140: iinc #13, 1
    //   1143: baload
    //   1144: sipush #255
    //   1147: iand
    //   1148: aload_1
    //   1149: iload #13
    //   1151: iinc #13, 1
    //   1154: baload
    //   1155: sipush #255
    //   1158: iand
    //   1159: bipush #8
    //   1161: ishl
    //   1162: iadd
    //   1163: i2s
    //   1164: istore #15
    //   1166: aload_0
    //   1167: getfield c : [S
    //   1170: iload #14
    //   1172: iload #12
    //   1174: i2s
    //   1175: sastore
    //   1176: iload #13
    //   1178: iload #15
    //   1180: iadd
    //   1181: istore #13
    //   1183: iload #12
    //   1185: iload #15
    //   1187: iadd
    //   1188: istore #12
    //   1190: iinc #14, 1
    //   1193: goto -> 1130
    //   1196: aload_0
    //   1197: iload #12
    //   1199: newarray byte
    //   1201: putfield g : [B
    //   1204: iconst_0
    //   1205: istore #14
    //   1207: iload #14
    //   1209: iload #5
    //   1211: if_icmpge -> 1273
    //   1214: aload_1
    //   1215: iload_2
    //   1216: iinc #2, 1
    //   1219: baload
    //   1220: sipush #255
    //   1223: iand
    //   1224: aload_1
    //   1225: iload_2
    //   1226: iinc #2, 1
    //   1229: baload
    //   1230: sipush #255
    //   1233: iand
    //   1234: bipush #8
    //   1236: ishl
    //   1237: iadd
    //   1238: i2s
    //   1239: istore #15
    //   1241: aload_1
    //   1242: iload_2
    //   1243: aload_0
    //   1244: getfield g : [B
    //   1247: aload_0
    //   1248: getfield c : [S
    //   1251: iload #14
    //   1253: saload
    //   1254: ldc 65535
    //   1256: iand
    //   1257: iload #15
    //   1259: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1262: iload_2
    //   1263: iload #15
    //   1265: iadd
    //   1266: istore_2
    //   1267: iinc #14, 1
    //   1270: goto -> 1207
    //   1273: invokestatic gc : ()V
    //   1276: return
    //   1277: dup
    //   1278: astore_3
    //   1279: invokevirtual printStackTrace : ()V
    //   1282: return
    // Exception table:
    //   from	to	target	type
    //   0	488	1277	java/lang/Exception
    //   489	1276	1277	java/lang/Exception
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : [B
    //   4: ifnonnull -> 8
    //   7: return
    //   8: iload_3
    //   9: iconst_m1
    //   10: if_icmpne -> 23
    //   13: aload_0
    //   14: getfield a : [B
    //   17: arraylength
    //   18: iconst_1
    //   19: ishr
    //   20: iconst_1
    //   21: isub
    //   22: istore_3
    //   23: aload_0
    //   24: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   27: ifnonnull -> 41
    //   30: aload_0
    //   31: aload_0
    //   32: getfield a : I
    //   35: anewarray [Ljavax/microedition/lcdui/Image;
    //   38: putfield a : [[Ljavax/microedition/lcdui/Image;
    //   41: aload_0
    //   42: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   45: iload_1
    //   46: aaload
    //   47: ifnonnull -> 66
    //   50: aload_0
    //   51: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   54: iload_1
    //   55: aload_0
    //   56: getfield a : [B
    //   59: arraylength
    //   60: iconst_1
    //   61: ishr
    //   62: anewarray javax/microedition/lcdui/Image
    //   65: aastore
    //   66: iload #4
    //   68: iflt -> 105
    //   71: iload_2
    //   72: istore #5
    //   74: iload #5
    //   76: iload_3
    //   77: if_icmpgt -> 270
    //   80: aload_0
    //   81: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   84: iload_1
    //   85: aaload
    //   86: iload #5
    //   88: aload_0
    //   89: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   92: iload #4
    //   94: aaload
    //   95: iload #5
    //   97: aaload
    //   98: aastore
    //   99: iinc #5, 1
    //   102: goto -> 74
    //   105: aload_0
    //   106: getfield b : I
    //   109: istore #5
    //   111: aload_0
    //   112: iload_1
    //   113: putfield b : I
    //   116: invokestatic gc : ()V
    //   119: iload_2
    //   120: istore #6
    //   122: iload #6
    //   124: iload_3
    //   125: if_icmpgt -> 261
    //   128: iload #6
    //   130: iconst_1
    //   131: ishl
    //   132: istore #7
    //   134: aload_0
    //   135: getfield a : [B
    //   138: iload #7
    //   140: baload
    //   141: sipush #255
    //   144: iand
    //   145: istore #8
    //   147: aload_0
    //   148: getfield a : [B
    //   151: iload #7
    //   153: iconst_1
    //   154: iadd
    //   155: baload
    //   156: sipush #255
    //   159: iand
    //   160: istore #9
    //   162: iload #8
    //   164: ifle -> 255
    //   167: iload #9
    //   169: ifgt -> 175
    //   172: goto -> 255
    //   175: aload_0
    //   176: iload #6
    //   178: invokespecial a : (I)[I
    //   181: dup
    //   182: astore #10
    //   184: ifnonnull -> 190
    //   187: goto -> 255
    //   190: iconst_0
    //   191: istore #11
    //   193: iload #8
    //   195: iload #9
    //   197: imul
    //   198: istore #12
    //   200: iconst_0
    //   201: istore #13
    //   203: iload #13
    //   205: iload #12
    //   207: if_icmpge -> 235
    //   210: aload #10
    //   212: iload #13
    //   214: iaload
    //   215: ldc -16777216
    //   217: iand
    //   218: ldc -16777216
    //   220: if_icmpeq -> 229
    //   223: iconst_1
    //   224: istore #11
    //   226: goto -> 235
    //   229: iinc #13, 1
    //   232: goto -> 203
    //   235: aload_0
    //   236: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   239: iload_1
    //   240: aaload
    //   241: iload #6
    //   243: aload #10
    //   245: iload #8
    //   247: iload #9
    //   249: iload #11
    //   251: invokestatic createRGBImage : ([IIIZ)Ljavax/microedition/lcdui/Image;
    //   254: aastore
    //   255: iinc #6, 1
    //   258: goto -> 122
    //   261: invokestatic gc : ()V
    //   264: aload_0
    //   265: iload #5
    //   267: putfield b : I
    //   270: invokestatic gc : ()V
    //   273: return
  }

  public final void a(int paramInt) {
    if (this.a == null)
      return;
    if (this.a == null)
      return;
    if (this.a[paramInt] == null)
      return;
    for (byte b = 0; b < (this.a[paramInt]).length; b++)
      this.a[paramInt][b] = null;
    this.a[paramInt] = null;
    this.a--;
  }

  public final String toString() {
    // Byte code:
    //   0: new java/lang/String
    //   3: invokespecial <init> : ()V
    //   6: aconst_null
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: iload_3
    //   13: aload_0
    //   14: getfield a : [B
    //   17: arraylength
    //   18: iconst_2
    //   19: idiv
    //   20: if_icmpge -> 61
    //   23: iload_2
    //   24: iconst_2
    //   25: aload_0
    //   26: getfield a : [B
    //   29: iconst_2
    //   30: iload_3
    //   31: imul
    //   32: baload
    //   33: sipush #255
    //   36: iand
    //   37: imul
    //   38: aload_0
    //   39: getfield a : [B
    //   42: iconst_2
    //   43: iload_3
    //   44: imul
    //   45: iconst_1
    //   46: iadd
    //   47: baload
    //   48: sipush #255
    //   51: iand
    //   52: imul
    //   53: iadd
    //   54: istore_2
    //   55: iinc #3, 1
    //   58: goto -> 12
    //   61: new java/lang/StringBuffer
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: ldc 'raw/full: '
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   73: aload_0
    //   74: getfield g : [B
    //   77: arraylength
    //   78: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   81: ldc '/'
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   86: iload_2
    //   87: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: dup
    //   94: astore_1
    //   95: areturn
  }

  public final int a(int paramInt1, int paramInt2) {
    return this.f[(this.b[paramInt1] + paramInt2) * 5 + 1] & 0xFF;
  }

  public final int a(int paramInt) {
    return this.e[paramInt] & 0xFF;
  }

  public final int b(int paramInt) {
    return this.b[paramInt] & 0xFF;
  }

  public final int a(String paramString) {
    byte b = 1;
    int i = paramString.length();
    int j;
    for (j = paramString.indexOf('\n'); j != -1; j = (j < i - 1) ? paramString.indexOf('\n', j + 1) : -1)
      b++;
    return this.e * (b - 1) + this.a[1] * b;
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    int i = (this.b[paramInt1] + paramInt2) * 5;
    int j = this.f[i] & 0xFF;
    if ((paramInt5 & 0x20) != 0) {
      paramInt6 = ((paramInt5 & 0x1) != 0) ? (paramInt6 + this.f[i + 2]) : (paramInt6 - this.f[i + 2]);
      paramInt7 = ((paramInt5 & 0x2) != 0) ? (paramInt7 + this.f[i + 3]) : (paramInt7 - this.f[i + 3]);
    }
    a(paramGraphics, j, paramInt3 - paramInt6, paramInt4 - paramInt7, paramInt5 ^ this.f[i + 4] & 0xF, paramInt6, paramInt7);
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = this.b[paramInt1] & 0xFF;
    for (byte b = 0; b < i; b++)
      a(paramGraphics, paramInt1, b, paramInt2, paramInt3, paramInt4);
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : [S
    //   4: iload_2
    //   5: saload
    //   6: iload_3
    //   7: iadd
    //   8: iconst_2
    //   9: ishl
    //   10: istore #7
    //   12: aload_0
    //   13: getfield d : [B
    //   16: iload #7
    //   18: iconst_3
    //   19: iadd
    //   20: baload
    //   21: sipush #255
    //   24: iand
    //   25: istore #8
    //   27: aload_0
    //   28: getfield d : [B
    //   31: iload #7
    //   33: baload
    //   34: sipush #255
    //   37: iand
    //   38: istore #9
    //   40: iload #6
    //   42: iconst_1
    //   43: iand
    //   44: ifeq -> 62
    //   47: iload #4
    //   49: aload_0
    //   50: getfield d : [B
    //   53: iload #7
    //   55: iconst_1
    //   56: iadd
    //   57: baload
    //   58: isub
    //   59: goto -> 74
    //   62: iload #4
    //   64: aload_0
    //   65: getfield d : [B
    //   68: iload #7
    //   70: iconst_1
    //   71: iadd
    //   72: baload
    //   73: iadd
    //   74: istore #4
    //   76: iload #6
    //   78: iconst_2
    //   79: iand
    //   80: ifeq -> 98
    //   83: iload #5
    //   85: aload_0
    //   86: getfield d : [B
    //   89: iload #7
    //   91: iconst_2
    //   92: iadd
    //   93: baload
    //   94: isub
    //   95: goto -> 110
    //   98: iload #5
    //   100: aload_0
    //   101: getfield d : [B
    //   104: iload #7
    //   106: iconst_2
    //   107: iadd
    //   108: baload
    //   109: iadd
    //   110: istore #5
    //   112: iload #6
    //   114: iconst_1
    //   115: iand
    //   116: ifeq -> 137
    //   119: iload #4
    //   121: aload_0
    //   122: getfield a : [B
    //   125: iload #9
    //   127: iconst_1
    //   128: ishl
    //   129: baload
    //   130: sipush #255
    //   133: iand
    //   134: isub
    //   135: istore #4
    //   137: iload #6
    //   139: iconst_2
    //   140: iand
    //   141: ifeq -> 164
    //   144: iload #5
    //   146: aload_0
    //   147: getfield a : [B
    //   150: iload #9
    //   152: iconst_1
    //   153: ishl
    //   154: iconst_1
    //   155: iadd
    //   156: baload
    //   157: sipush #255
    //   160: iand
    //   161: isub
    //   162: istore #5
    //   164: aload_0
    //   165: aload_1
    //   166: iload #9
    //   168: iload #4
    //   170: iload #5
    //   172: iload #6
    //   174: iload #8
    //   176: bipush #15
    //   178: iand
    //   179: ixor
    //   180: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   183: return
  }

  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_2
    //   1: iconst_1
    //   2: ishl
    //   3: istore #6
    //   5: aload_0
    //   6: getfield a : [B
    //   9: iload #6
    //   11: baload
    //   12: sipush #255
    //   15: iand
    //   16: istore #7
    //   18: aload_0
    //   19: getfield a : [B
    //   22: iload #6
    //   24: iconst_1
    //   25: iadd
    //   26: baload
    //   27: sipush #255
    //   30: iand
    //   31: istore #8
    //   33: iload #7
    //   35: ifle -> 43
    //   38: iload #8
    //   40: ifgt -> 44
    //   43: return
    //   44: aconst_null
    //   45: astore #9
    //   47: aload_0
    //   48: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   51: ifnull -> 79
    //   54: aload_0
    //   55: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   58: aload_0
    //   59: getfield b : I
    //   62: aaload
    //   63: ifnull -> 79
    //   66: aload_0
    //   67: getfield a : [[Ljavax/microedition/lcdui/Image;
    //   70: aload_0
    //   71: getfield b : I
    //   74: aaload
    //   75: iload_2
    //   76: aaload
    //   77: astore #9
    //   79: aload #9
    //   81: ifnonnull -> 111
    //   84: aload_0
    //   85: iload_2
    //   86: invokespecial a : (I)[I
    //   89: dup
    //   90: astore #10
    //   92: ifnonnull -> 96
    //   95: return
    //   96: aload #10
    //   98: iload #7
    //   100: iload #8
    //   102: aload_0
    //   103: getfield a : Z
    //   106: invokestatic createRGBImage : ([IIIZ)Ljavax/microedition/lcdui/Image;
    //   109: astore #9
    //   111: aload #9
    //   113: invokevirtual getWidth : ()I
    //   116: istore #7
    //   118: aload #9
    //   120: invokevirtual getHeight : ()I
    //   123: istore #8
    //   125: iload #5
    //   127: iconst_1
    //   128: iand
    //   129: ifeq -> 165
    //   132: iload #5
    //   134: iconst_2
    //   135: iand
    //   136: ifeq -> 152
    //   139: aload_1
    //   140: aload #9
    //   142: iconst_0
    //   143: iconst_0
    //   144: iload #7
    //   146: iload #8
    //   148: iconst_3
    //   149: goto -> 195
    //   152: aload_1
    //   153: aload #9
    //   155: iconst_0
    //   156: iconst_0
    //   157: iload #7
    //   159: iload #8
    //   161: iconst_2
    //   162: goto -> 195
    //   165: iload #5
    //   167: iconst_2
    //   168: iand
    //   169: ifeq -> 185
    //   172: aload_1
    //   173: aload #9
    //   175: iconst_0
    //   176: iconst_0
    //   177: iload #7
    //   179: iload #8
    //   181: iconst_1
    //   182: goto -> 195
    //   185: aload_1
    //   186: aload #9
    //   188: iconst_0
    //   189: iconst_0
    //   190: iload #7
    //   192: iload #8
    //   194: iconst_0
    //   195: iload_3
    //   196: iload #4
    //   198: iconst_0
    //   199: invokevirtual drawRegion : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   202: return
  }

  private int[] a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : [B
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
    //   21: getfield a : [B
    //   24: iload_2
    //   25: baload
    //   26: sipush #255
    //   29: iand
    //   30: istore_3
    //   31: aload_0
    //   32: getfield a : [B
    //   35: iload_2
    //   36: iconst_1
    //   37: iadd
    //   38: baload
    //   39: sipush #255
    //   42: iand
    //   43: istore #4
    //   45: getstatic a.a : [I
    //   48: astore #5
    //   50: aload_0
    //   51: getfield b : [[I
    //   54: aload_0
    //   55: getfield b : I
    //   58: aaload
    //   59: dup
    //   60: astore #6
    //   62: ifnonnull -> 67
    //   65: aconst_null
    //   66: areturn
    //   67: aload_0
    //   68: getfield g : [B
    //   71: astore #7
    //   73: aload_0
    //   74: getfield c : [S
    //   77: iload_1
    //   78: saload
    //   79: ldc 65535
    //   81: iand
    //   82: istore #8
    //   84: iconst_0
    //   85: istore #9
    //   87: iload_3
    //   88: iload #4
    //   90: imul
    //   91: istore #10
    //   93: aload_0
    //   94: getfield a : S
    //   97: sipush #10225
    //   100: if_icmpne -> 193
    //   103: iload #9
    //   105: iload #10
    //   107: if_icmpge -> 700
    //   110: aload #7
    //   112: iload #8
    //   114: iinc #8, 1
    //   117: baload
    //   118: sipush #255
    //   121: iand
    //   122: dup
    //   123: istore #11
    //   125: bipush #127
    //   127: if_icmple -> 177
    //   130: aload #7
    //   132: iload #8
    //   134: iinc #8, 1
    //   137: baload
    //   138: sipush #255
    //   141: iand
    //   142: istore #12
    //   144: aload #6
    //   146: iload #12
    //   148: iaload
    //   149: istore #13
    //   151: iinc #11, -128
    //   154: iload #11
    //   156: dup
    //   157: iconst_1
    //   158: isub
    //   159: istore #11
    //   161: ifle -> 103
    //   164: aload #5
    //   166: iload #9
    //   168: iinc #9, 1
    //   171: iload #13
    //   173: iastore
    //   174: goto -> 154
    //   177: aload #5
    //   179: iload #9
    //   181: iinc #9, 1
    //   184: aload #6
    //   186: iload #11
    //   188: iaload
    //   189: iastore
    //   190: goto -> 103
    //   193: aload_0
    //   194: getfield a : S
    //   197: sipush #5632
    //   200: if_icmpne -> 256
    //   203: iload #9
    //   205: iload #10
    //   207: if_icmpge -> 700
    //   210: aload #5
    //   212: iload #9
    //   214: iinc #9, 1
    //   217: aload #6
    //   219: aload #7
    //   221: iload #8
    //   223: baload
    //   224: iconst_4
    //   225: ishr
    //   226: bipush #15
    //   228: iand
    //   229: iaload
    //   230: iastore
    //   231: aload #5
    //   233: iload #9
    //   235: iinc #9, 1
    //   238: aload #6
    //   240: aload #7
    //   242: iload #8
    //   244: baload
    //   245: bipush #15
    //   247: iand
    //   248: iaload
    //   249: iastore
    //   250: iinc #8, 1
    //   253: goto -> 203
    //   256: aload_0
    //   257: getfield a : S
    //   260: sipush #1024
    //   263: if_icmpne -> 358
    //   266: iload #9
    //   268: iload #10
    //   270: if_icmpge -> 700
    //   273: aload #5
    //   275: iload #9
    //   277: iinc #9, 1
    //   280: aload #6
    //   282: aload #7
    //   284: iload #8
    //   286: baload
    //   287: bipush #6
    //   289: ishr
    //   290: iconst_3
    //   291: iand
    //   292: iaload
    //   293: iastore
    //   294: aload #5
    //   296: iload #9
    //   298: iinc #9, 1
    //   301: aload #6
    //   303: aload #7
    //   305: iload #8
    //   307: baload
    //   308: iconst_4
    //   309: ishr
    //   310: iconst_3
    //   311: iand
    //   312: iaload
    //   313: iastore
    //   314: aload #5
    //   316: iload #9
    //   318: iinc #9, 1
    //   321: aload #6
    //   323: aload #7
    //   325: iload #8
    //   327: baload
    //   328: iconst_2
    //   329: ishr
    //   330: iconst_3
    //   331: iand
    //   332: iaload
    //   333: iastore
    //   334: aload #5
    //   336: iload #9
    //   338: iinc #9, 1
    //   341: aload #6
    //   343: aload #7
    //   345: iload #8
    //   347: baload
    //   348: iconst_3
    //   349: iand
    //   350: iaload
    //   351: iastore
    //   352: iinc #8, 1
    //   355: goto -> 266
    //   358: aload_0
    //   359: getfield a : S
    //   362: sipush #512
    //   365: if_icmpne -> 541
    //   368: iload #9
    //   370: iload #10
    //   372: if_icmpge -> 700
    //   375: aload #5
    //   377: iload #9
    //   379: iinc #9, 1
    //   382: aload #6
    //   384: aload #7
    //   386: iload #8
    //   388: baload
    //   389: bipush #7
    //   391: ishr
    //   392: iconst_1
    //   393: iand
    //   394: iaload
    //   395: iastore
    //   396: aload #5
    //   398: iload #9
    //   400: iinc #9, 1
    //   403: aload #6
    //   405: aload #7
    //   407: iload #8
    //   409: baload
    //   410: bipush #6
    //   412: ishr
    //   413: iconst_1
    //   414: iand
    //   415: iaload
    //   416: iastore
    //   417: aload #5
    //   419: iload #9
    //   421: iinc #9, 1
    //   424: aload #6
    //   426: aload #7
    //   428: iload #8
    //   430: baload
    //   431: iconst_5
    //   432: ishr
    //   433: iconst_1
    //   434: iand
    //   435: iaload
    //   436: iastore
    //   437: aload #5
    //   439: iload #9
    //   441: iinc #9, 1
    //   444: aload #6
    //   446: aload #7
    //   448: iload #8
    //   450: baload
    //   451: iconst_4
    //   452: ishr
    //   453: iconst_1
    //   454: iand
    //   455: iaload
    //   456: iastore
    //   457: aload #5
    //   459: iload #9
    //   461: iinc #9, 1
    //   464: aload #6
    //   466: aload #7
    //   468: iload #8
    //   470: baload
    //   471: iconst_3
    //   472: ishr
    //   473: iconst_1
    //   474: iand
    //   475: iaload
    //   476: iastore
    //   477: aload #5
    //   479: iload #9
    //   481: iinc #9, 1
    //   484: aload #6
    //   486: aload #7
    //   488: iload #8
    //   490: baload
    //   491: iconst_2
    //   492: ishr
    //   493: iconst_1
    //   494: iand
    //   495: iaload
    //   496: iastore
    //   497: aload #5
    //   499: iload #9
    //   501: iinc #9, 1
    //   504: aload #6
    //   506: aload #7
    //   508: iload #8
    //   510: baload
    //   511: iconst_1
    //   512: ishr
    //   513: iconst_1
    //   514: iand
    //   515: iaload
    //   516: iastore
    //   517: aload #5
    //   519: iload #9
    //   521: iinc #9, 1
    //   524: aload #6
    //   526: aload #7
    //   528: iload #8
    //   530: baload
    //   531: iconst_1
    //   532: iand
    //   533: iaload
    //   534: iastore
    //   535: iinc #8, 1
    //   538: goto -> 368
    //   541: aload_0
    //   542: getfield a : S
    //   545: sipush #22018
    //   548: if_icmpne -> 584
    //   551: iload #9
    //   553: iload #10
    //   555: if_icmpge -> 700
    //   558: aload #5
    //   560: iload #9
    //   562: iinc #9, 1
    //   565: aload #6
    //   567: aload #7
    //   569: iload #8
    //   571: iinc #8, 1
    //   574: baload
    //   575: sipush #255
    //   578: iand
    //   579: iaload
    //   580: iastore
    //   581: goto -> 551
    //   584: aload_0
    //   585: getfield a : S
    //   588: sipush #22258
    //   591: if_icmpne -> 700
    //   594: iload #9
    //   596: iload #10
    //   598: if_icmpge -> 700
    //   601: aload #7
    //   603: iload #8
    //   605: iinc #8, 1
    //   608: baload
    //   609: sipush #255
    //   612: iand
    //   613: dup
    //   614: istore #11
    //   616: bipush #127
    //   618: if_icmple -> 660
    //   621: iinc #11, -128
    //   624: iload #11
    //   626: dup
    //   627: iconst_1
    //   628: isub
    //   629: istore #11
    //   631: ifle -> 594
    //   634: aload #5
    //   636: iload #9
    //   638: iinc #9, 1
    //   641: aload #6
    //   643: aload #7
    //   645: iload #8
    //   647: iinc #8, 1
    //   650: baload
    //   651: sipush #255
    //   654: iand
    //   655: iaload
    //   656: iastore
    //   657: goto -> 624
    //   660: aload #6
    //   662: aload #7
    //   664: iload #8
    //   666: iinc #8, 1
    //   669: baload
    //   670: sipush #255
    //   673: iand
    //   674: iaload
    //   675: istore #12
    //   677: iload #11
    //   679: dup
    //   680: iconst_1
    //   681: isub
    //   682: istore #11
    //   684: ifle -> 594
    //   687: aload #5
    //   689: iload #9
    //   691: iinc #9, 1
    //   694: iload #12
    //   696: iastore
    //   697: goto -> 677
    //   700: aload #5
    //   702: areturn
  }

  public final void a(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic a.c : I
    //   4: aload_0
    //   5: getfield a : [B
    //   8: iconst_1
    //   9: baload
    //   10: sipush #255
    //   13: iand
    //   14: putstatic a.d : I
    //   17: iconst_0
    //   18: istore_2
    //   19: getstatic a.f : I
    //   22: iflt -> 31
    //   25: getstatic a.f : I
    //   28: goto -> 32
    //   31: iconst_0
    //   32: istore_3
    //   33: getstatic a.g : I
    //   36: iflt -> 45
    //   39: getstatic a.g : I
    //   42: goto -> 49
    //   45: aload_1
    //   46: invokevirtual length : ()I
    //   49: istore #4
    //   51: iload_3
    //   52: istore #5
    //   54: iload #5
    //   56: iload #4
    //   58: if_icmpge -> 290
    //   61: aload_1
    //   62: iload #5
    //   64: invokevirtual charAt : (I)C
    //   67: dup
    //   68: istore #6
    //   70: bipush #32
    //   72: if_icmple -> 88
    //   75: getstatic a.h : [B
    //   78: iload #6
    //   80: baload
    //   81: sipush #255
    //   84: iand
    //   85: goto -> 181
    //   88: iload #6
    //   90: bipush #32
    //   92: if_icmpne -> 109
    //   95: iload_2
    //   96: aload_0
    //   97: getfield a : [B
    //   100: iconst_0
    //   101: baload
    //   102: sipush #255
    //   105: iand
    //   106: goto -> 275
    //   109: iload #6
    //   111: bipush #10
    //   113: if_icmpne -> 154
    //   116: iload_2
    //   117: getstatic a.c : I
    //   120: if_icmple -> 127
    //   123: iload_2
    //   124: putstatic a.c : I
    //   127: iconst_0
    //   128: istore_2
    //   129: getstatic a.d : I
    //   132: aload_0
    //   133: getfield e : I
    //   136: aload_0
    //   137: getfield a : [B
    //   140: iconst_1
    //   141: baload
    //   142: sipush #255
    //   145: iand
    //   146: iadd
    //   147: iadd
    //   148: putstatic a.d : I
    //   151: goto -> 284
    //   154: iload #6
    //   156: iconst_1
    //   157: if_icmpne -> 166
    //   160: iinc #5, 1
    //   163: goto -> 284
    //   166: iload #6
    //   168: iconst_2
    //   169: if_icmpne -> 284
    //   172: iinc #5, 1
    //   175: aload_1
    //   176: iload #5
    //   178: invokevirtual charAt : (I)C
    //   181: dup
    //   182: istore #6
    //   184: aload_0
    //   185: iconst_0
    //   186: invokevirtual b : (I)I
    //   189: if_icmplt -> 234
    //   192: iload #6
    //   194: aload_0
    //   195: iconst_0
    //   196: invokevirtual b : (I)I
    //   199: isub
    //   200: istore #7
    //   202: iload_2
    //   203: aload_0
    //   204: getfield c : [B
    //   207: iload #7
    //   209: iconst_2
    //   210: ishl
    //   211: iconst_2
    //   212: iadd
    //   213: baload
    //   214: sipush #255
    //   217: iand
    //   218: aload_0
    //   219: getfield c : [B
    //   222: iload #7
    //   224: iconst_2
    //   225: ishl
    //   226: baload
    //   227: sipush #255
    //   230: iand
    //   231: goto -> 274
    //   234: aload_0
    //   235: getfield d : [B
    //   238: iload #6
    //   240: iconst_2
    //   241: ishl
    //   242: baload
    //   243: sipush #255
    //   246: iand
    //   247: iconst_1
    //   248: ishl
    //   249: istore #7
    //   251: iload_2
    //   252: aload_0
    //   253: getfield a : [B
    //   256: iload #7
    //   258: baload
    //   259: sipush #255
    //   262: iand
    //   263: aload_0
    //   264: getfield d : [B
    //   267: iload #6
    //   269: iconst_2
    //   270: ishl
    //   271: iconst_1
    //   272: iadd
    //   273: baload
    //   274: isub
    //   275: aload_0
    //   276: getfield d : [B
    //   279: iconst_1
    //   280: baload
    //   281: iadd
    //   282: iadd
    //   283: istore_2
    //   284: iinc #5, 1
    //   287: goto -> 54
    //   290: iload_2
    //   291: getstatic a.c : I
    //   294: if_icmple -> 301
    //   297: iload_2
    //   298: putstatic a.c : I
    //   301: getstatic a.c : I
    //   304: ifle -> 320
    //   307: getstatic a.c : I
    //   310: aload_0
    //   311: getfield d : [B
    //   314: iconst_1
    //   315: baload
    //   316: isub
    //   317: putstatic a.c : I
    //   320: return
  }

  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload #4
    //   2: aload_0
    //   3: getfield d : [B
    //   6: iconst_2
    //   7: baload
    //   8: isub
    //   9: istore #4
    //   11: iload #5
    //   13: bipush #43
    //   15: iand
    //   16: ifeq -> 87
    //   19: aload_0
    //   20: aload_2
    //   21: invokevirtual a : (Ljava/lang/String;)V
    //   24: iload #5
    //   26: bipush #8
    //   28: iand
    //   29: ifeq -> 39
    //   32: iload_3
    //   33: getstatic a.c : I
    //   36: goto -> 52
    //   39: iload #5
    //   41: iconst_1
    //   42: iand
    //   43: ifeq -> 54
    //   46: iload_3
    //   47: getstatic a.c : I
    //   50: iconst_1
    //   51: ishr
    //   52: isub
    //   53: istore_3
    //   54: iload #5
    //   56: bipush #32
    //   58: iand
    //   59: ifeq -> 70
    //   62: iload #4
    //   64: getstatic a.d : I
    //   67: goto -> 84
    //   70: iload #5
    //   72: iconst_2
    //   73: iand
    //   74: ifeq -> 87
    //   77: iload #4
    //   79: getstatic a.d : I
    //   82: iconst_1
    //   83: ishr
    //   84: isub
    //   85: istore #4
    //   87: iload_3
    //   88: istore #6
    //   90: iload #4
    //   92: istore #7
    //   94: aload_0
    //   95: getfield b : I
    //   98: istore #8
    //   100: getstatic a.f : I
    //   103: iflt -> 112
    //   106: getstatic a.f : I
    //   109: goto -> 113
    //   112: iconst_0
    //   113: istore #9
    //   115: getstatic a.g : I
    //   118: iflt -> 127
    //   121: getstatic a.g : I
    //   124: goto -> 131
    //   127: aload_2
    //   128: invokevirtual length : ()I
    //   131: istore #10
    //   133: iload #9
    //   135: istore #11
    //   137: iload #11
    //   139: iload #10
    //   141: if_icmpge -> 402
    //   144: aload_2
    //   145: iload #11
    //   147: invokevirtual charAt : (I)C
    //   150: dup
    //   151: istore #12
    //   153: bipush #32
    //   155: if_icmple -> 171
    //   158: getstatic a.h : [B
    //   161: iload #12
    //   163: baload
    //   164: sipush #255
    //   167: iand
    //   168: goto -> 263
    //   171: iload #12
    //   173: bipush #32
    //   175: if_icmpne -> 193
    //   178: iload #6
    //   180: aload_0
    //   181: getfield a : [B
    //   184: iconst_0
    //   185: baload
    //   186: sipush #255
    //   189: iand
    //   190: goto -> 386
    //   193: iload #12
    //   195: bipush #10
    //   197: if_icmpne -> 226
    //   200: iload_3
    //   201: istore #6
    //   203: iload #7
    //   205: aload_0
    //   206: getfield e : I
    //   209: aload_0
    //   210: getfield a : [B
    //   213: iconst_1
    //   214: baload
    //   215: sipush #255
    //   218: iand
    //   219: iadd
    //   220: iadd
    //   221: istore #7
    //   223: goto -> 396
    //   226: iload #12
    //   228: iconst_1
    //   229: if_icmpne -> 248
    //   232: iinc #11, 1
    //   235: aload_0
    //   236: aload_2
    //   237: iload #11
    //   239: invokevirtual charAt : (I)C
    //   242: putfield b : I
    //   245: goto -> 396
    //   248: iload #12
    //   250: iconst_2
    //   251: if_icmpne -> 396
    //   254: iinc #11, 1
    //   257: aload_2
    //   258: iload #11
    //   260: invokevirtual charAt : (I)C
    //   263: dup
    //   264: istore #12
    //   266: aload_0
    //   267: iconst_0
    //   268: invokevirtual b : (I)I
    //   271: if_icmplt -> 331
    //   274: iload #12
    //   276: aload_0
    //   277: iconst_0
    //   278: invokevirtual b : (I)I
    //   281: isub
    //   282: istore #13
    //   284: aload_0
    //   285: aload_1
    //   286: iload #13
    //   288: iload #6
    //   290: iload #7
    //   292: iconst_0
    //   293: iconst_0
    //   294: iconst_0
    //   295: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   298: iload #6
    //   300: aload_0
    //   301: getfield c : [B
    //   304: iload #13
    //   306: iconst_2
    //   307: ishl
    //   308: iconst_2
    //   309: iadd
    //   310: baload
    //   311: sipush #255
    //   314: iand
    //   315: aload_0
    //   316: getfield c : [B
    //   319: iload #13
    //   321: iconst_2
    //   322: ishl
    //   323: baload
    //   324: sipush #255
    //   327: iand
    //   328: goto -> 385
    //   331: aload_0
    //   332: getfield d : [B
    //   335: iload #12
    //   337: iconst_2
    //   338: ishl
    //   339: baload
    //   340: sipush #255
    //   343: iand
    //   344: iconst_1
    //   345: ishl
    //   346: istore #13
    //   348: aload_0
    //   349: aload_1
    //   350: iconst_0
    //   351: iload #12
    //   353: iload #6
    //   355: iload #7
    //   357: iconst_0
    //   358: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   361: iload #6
    //   363: aload_0
    //   364: getfield a : [B
    //   367: iload #13
    //   369: baload
    //   370: sipush #255
    //   373: iand
    //   374: aload_0
    //   375: getfield d : [B
    //   378: iload #12
    //   380: iconst_2
    //   381: ishl
    //   382: iconst_1
    //   383: iadd
    //   384: baload
    //   385: isub
    //   386: aload_0
    //   387: getfield d : [B
    //   390: iconst_1
    //   391: baload
    //   392: iadd
    //   393: iadd
    //   394: istore #6
    //   396: iinc #11, 1
    //   399: goto -> 137
    //   402: aload_0
    //   403: iload #8
    //   405: putfield b : I
    //   408: return
  }

  public final void b(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: aload_2
    //   4: invokevirtual length : ()I
    //   7: istore #7
    //   9: bipush #100
    //   11: newarray int
    //   13: astore #8
    //   15: iconst_0
    //   16: istore #9
    //   18: iload #9
    //   20: iload #7
    //   22: if_icmpge -> 52
    //   25: aload_2
    //   26: iload #9
    //   28: invokevirtual charAt : (I)C
    //   31: bipush #10
    //   33: if_icmpne -> 46
    //   36: aload #8
    //   38: iload #6
    //   40: iinc #6, 1
    //   43: iload #9
    //   45: iastore
    //   46: iinc #9, 1
    //   49: goto -> 18
    //   52: aload #8
    //   54: iload #6
    //   56: iinc #6, 1
    //   59: iload #7
    //   61: iastore
    //   62: aload_0
    //   63: getfield e : I
    //   66: aload_0
    //   67: getfield a : [B
    //   70: iconst_1
    //   71: baload
    //   72: sipush #255
    //   75: iand
    //   76: iadd
    //   77: istore #9
    //   79: iload #5
    //   81: bipush #32
    //   83: iand
    //   84: ifeq -> 99
    //   87: iload #4
    //   89: iload #9
    //   91: iload #6
    //   93: iconst_1
    //   94: isub
    //   95: imul
    //   96: goto -> 117
    //   99: iload #5
    //   101: iconst_2
    //   102: iand
    //   103: ifeq -> 120
    //   106: iload #4
    //   108: iload #9
    //   110: iload #6
    //   112: iconst_1
    //   113: isub
    //   114: imul
    //   115: iconst_1
    //   116: ishr
    //   117: isub
    //   118: istore #4
    //   120: iconst_0
    //   121: istore #10
    //   123: iload #10
    //   125: iload #6
    //   127: if_icmpge -> 182
    //   130: iload #10
    //   132: ifle -> 147
    //   135: aload #8
    //   137: iload #10
    //   139: iconst_1
    //   140: isub
    //   141: iaload
    //   142: iconst_1
    //   143: iadd
    //   144: goto -> 148
    //   147: iconst_0
    //   148: putstatic a.f : I
    //   151: aload #8
    //   153: iload #10
    //   155: iaload
    //   156: putstatic a.g : I
    //   159: aload_0
    //   160: aload_1
    //   161: aload_2
    //   162: iload_3
    //   163: iload #4
    //   165: iload #10
    //   167: iload #9
    //   169: imul
    //   170: iadd
    //   171: iload #5
    //   173: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   176: iinc #10, 1
    //   179: goto -> 123
    //   182: iconst_m1
    //   183: putstatic a.f : I
    //   186: iconst_m1
    //   187: putstatic a.g : I
    //   190: return
  }

  public final void a(boolean paramBoolean) {
    this.a = null;
    this.b = null;
    this.a = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.b = null;
    this.f = null;
    if (this.a != null) {
      for (byte b = 0; b < this.a.length; b++)
        this.a[b] = null;
      this.a = (Image[][])null;
    }
    if (this.b != null) {
      for (byte b = 0; b < this.b.length; b++)
        this.b[b] = null;
      this.b = (int[][])null;
    }
    this.g = null;
    this.c = null;
    if (paramBoolean && this.a != null) {
      for (byte b = 0; b < this.a.length; b++) {
        if (this.a[b] != null)
          for (byte b1 = 0; b1 < (this.a[b]).length; b1++)
            this.a[b][b1] = null;
      }
      this.a = (Image[][])null;
    }
  }
}
