import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d {
  private static d a;
  
  private static DataInputStream a;
  
  private static String a;
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    while (true) {
      int i;
      if ((i = paramString1.indexOf(paramString2)) >= 0)
        paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length()); 
      if (i < 0)
        return paramString1; 
    } 
  }
  
  public static String a(int paramInt) {
    return a(paramInt, null);
  }
  
  private static synchronized String a(int paramInt, String[] paramArrayOfString) {
    if (a == null)
      a = System.getProperty("microedition.locale"); 
    try {
      if (a == null)
        a = (String)new d(); 
      if (a == null) {
        InputStream inputStream;
        if ((inputStream = a.getClass().getResourceAsStream("/lang." + a)) == null)
          inputStream = a.getClass().getResourceAsStream("/lang.xx"); 
        if (inputStream == null)
          return "X"; 
        (a = (String)new DataInputStream(inputStream)).mark(512);
      } 
      a.skipBytes(paramInt << 1);
      int i = a.readUnsignedShort();
      a.skipBytes(i - (paramInt << 1) - 2);
      String str = a.readUTF();
      if (!a.markSupported()) {
        a.close();
        a = null;
      } else {
        try {
          a.reset();
        } catch (IOException iOException) {
          a.close();
          a = null;
        } 
      } 
      return str;
    } catch (IOException iOException) {
      a = null;
      return "E";
    } 
  }
  
  private static boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    while (true) {
      if (paramInt1 == paramString1.length() && paramInt2 == paramString2.length())
        return true; 
      if (paramInt1 == paramString1.length() || paramInt2 == paramString2.length())
        return false; 
      switch (paramString2.charAt(paramInt2)) {
        case '?':
          paramInt1++;
          paramInt2++;
          continue;
        case '*':
          if (paramInt2 == paramString2.length() - 1)
            return true; 
          if (a(paramString1, paramString2, paramInt1, paramInt2 + 1) == true)
            return true; 
          paramInt1++;
          continue;
      } 
      if (paramString1.charAt(paramInt1) == paramString2.charAt(paramInt2)) {
        paramInt1++;
        paramInt2++;
        continue;
      } 
      return false;
    } 
  }
  
  private static StringBuffer a(InputStream paramInputStream) {
    StringBuffer stringBuffer = new StringBuffer();
    try {
      int i;
      if ((char)(i = paramInputStream.read()) != ' ')
        return stringBuffer; 
      while ((i = paramInputStream.read()) >= 0) {
        if ((char)i != '\r') {
          if ((char)i == '\n') {
            stringBuffer.append(a(paramInputStream));
            break;
          } 
          stringBuffer.append((char)i);
        } 
      } 
    } catch (IOException iOException) {}
    return stringBuffer;
  }
  
  static {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic d.a : Ld;
    //   4: aconst_null
    //   5: putstatic d.a : Ljava/io/DataInputStream;
    //   8: ldc 'microedition.platform'
    //   10: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   13: astore_0
    //   14: iconst_0
    //   15: istore_1
    //   16: new java/lang/StringBuffer
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_2
    //   24: getstatic d.a : Ld;
    //   27: ifnonnull -> 40
    //   30: new d
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putstatic d.a : Ld;
    //   40: getstatic d.a : Ld;
    //   43: invokevirtual getClass : ()Ljava/lang/Class;
    //   46: ldc '/META-INF/MANIFEST.MF'
    //   48: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   51: dup
    //   52: astore_3
    //   53: ifnull -> 258
    //   56: aload_3
    //   57: invokevirtual read : ()I
    //   60: dup
    //   61: istore #4
    //   63: ifge -> 69
    //   66: goto -> 266
    //   69: iload #4
    //   71: i2c
    //   72: bipush #13
    //   74: if_icmpeq -> 133
    //   77: iload #4
    //   79: i2c
    //   80: bipush #10
    //   82: if_icmpne -> 125
    //   85: aload_2
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokevirtual trim : ()Ljava/lang/String;
    //   92: ldc 'Nokia-Platform:'
    //   94: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   97: ifeq -> 112
    //   100: aload_2
    //   101: aload_3
    //   102: invokestatic a : (Ljava/io/InputStream;)Ljava/lang/StringBuffer;
    //   105: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   108: pop
    //   109: goto -> 140
    //   112: aload_2
    //   113: iconst_0
    //   114: aload_2
    //   115: invokevirtual length : ()I
    //   118: invokevirtual delete : (II)Ljava/lang/StringBuffer;
    //   121: pop
    //   122: goto -> 56
    //   125: aload_2
    //   126: iload #4
    //   128: i2c
    //   129: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   132: pop
    //   133: goto -> 56
    //   136: pop
    //   137: goto -> 56
    //   140: aload_2
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: invokevirtual trim : ()Ljava/lang/String;
    //   147: bipush #15
    //   149: invokevirtual substring : (I)Ljava/lang/String;
    //   152: astore #4
    //   154: new java/util/Vector
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: astore_2
    //   162: aload #4
    //   164: ldc '@'
    //   166: invokevirtual indexOf : (Ljava/lang/String;)I
    //   169: dup
    //   170: istore_3
    //   171: iconst_m1
    //   172: if_icmpeq -> 204
    //   175: aload_2
    //   176: aload #4
    //   178: iconst_0
    //   179: iload_3
    //   180: invokevirtual substring : (II)Ljava/lang/String;
    //   183: invokevirtual addElement : (Ljava/lang/Object;)V
    //   186: aload #4
    //   188: iload_3
    //   189: iconst_1
    //   190: iadd
    //   191: aload #4
    //   193: invokevirtual length : ()I
    //   196: invokevirtual substring : (II)Ljava/lang/String;
    //   199: astore #4
    //   201: goto -> 162
    //   204: aload_2
    //   205: aload #4
    //   207: invokevirtual addElement : (Ljava/lang/Object;)V
    //   210: iconst_0
    //   211: istore_3
    //   212: iload_3
    //   213: aload_2
    //   214: invokevirtual size : ()I
    //   217: if_icmpge -> 258
    //   220: aload_0
    //   221: aload_2
    //   222: iload_3
    //   223: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   226: checkcast java/lang/String
    //   229: invokevirtual trim : ()Ljava/lang/String;
    //   232: astore #5
    //   234: dup
    //   235: astore #4
    //   237: aload #5
    //   239: iconst_0
    //   240: iconst_0
    //   241: invokestatic a : (Ljava/lang/String;Ljava/lang/String;II)Z
    //   244: ifeq -> 252
    //   247: iconst_1
    //   248: istore_1
    //   249: goto -> 258
    //   252: iinc #3, 1
    //   255: goto -> 212
    //   258: iload_1
    //   259: ifne -> 266
    //   262: iconst_0
    //   263: invokestatic exit : (I)V
    //   266: aconst_null
    //   267: putstatic d.a : Ljava/lang/String;
    //   270: return
    // Exception table:
    //   from	to	target	type
    //   56	66	136	java/io/IOException
    //   69	109	136	java/io/IOException
    //   112	133	136	java/io/IOException
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\d.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */