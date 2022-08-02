import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class h {
  public static int a;
  
  public static int b;
  
  private static int e = 0;
  
  public static int c = 0;
  
  public int d;
  
  public int[] a;
  
  public int[] b;
  
  private static byte[] a;
  
  public Font a;
  
  public h(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield d : I
    //   9: aload_0
    //   10: iconst_2
    //   11: newarray int
    //   13: putfield a : [I
    //   16: aload_0
    //   17: iconst_3
    //   18: newarray int
    //   20: putfield b : [I
    //   23: iload_1
    //   24: putstatic h.e : I
    //   27: ldc 16777215
    //   29: putstatic h.c : I
    //   32: aload_0
    //   33: iconst_0
    //   34: iconst_1
    //   35: iload_1
    //   36: invokestatic getFont : (III)Ljavax/microedition/lcdui/Font;
    //   39: putfield a : Ljavax/microedition/lcdui/Font;
    //   42: aload_0
    //   43: getfield a : [I
    //   46: iconst_0
    //   47: iconst_4
    //   48: iastore
    //   49: aload_0
    //   50: getfield a : [I
    //   53: iconst_1
    //   54: bipush #14
    //   56: iastore
    //   57: aload_0
    //   58: getfield b : [I
    //   61: iconst_0
    //   62: iconst_0
    //   63: iastore
    //   64: aload_0
    //   65: getfield b : [I
    //   68: iconst_0
    //   69: iconst_0
    //   70: iastore
    //   71: aload_0
    //   72: getfield b : [I
    //   75: iconst_0
    //   76: iconst_0
    //   77: iastore
    //   78: aload_0
    //   79: invokevirtual getClass : ()Ljava/lang/Class;
    //   82: ldc '/mc'
    //   84: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   87: astore_0
    //   88: sipush #256
    //   91: newarray byte
    //   93: putstatic h.a : [B
    //   96: aload_0
    //   97: getstatic h.a : [B
    //   100: invokevirtual read : ([B)I
    //   103: pop
    //   104: aload_0
    //   105: invokevirtual close : ()V
    //   108: return
    //   109: pop
    //   110: return
    // Exception table:
    //   from	to	target	type
    //   96	108	109	java/lang/Exception
  }
  
  public static int a() {
    return e;
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    String[] arrayOfString = a(paramString);
    int i = this.a.getHeight();
    for (byte b = 0; b < arrayOfString.length; b++)
      b(paramGraphics, arrayOfString[b], paramInt1, paramInt2 + b * i, paramInt3); 
  }
  
  private static String[] a(Vector paramVector) {
    String[] arrayOfString = new String[paramVector.size()];
    Enumeration enumeration = paramVector.elements();
    for (byte b = 0; enumeration.hasMoreElements(); b++)
      arrayOfString[b] = ((String)enumeration.nextElement()).trim(); 
    return arrayOfString;
  }
  
  private static String[] a(String paramString) {
    Vector vector = new Vector();
    String str = "";
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      str = str + c;
      if (c == '\n' || b == paramString.length() - 1) {
        vector.addElement(str);
        str = "";
      } 
    } 
    return a(vector);
  }
  
  public final void a(String paramString) {
    a = false;
    String[] arrayOfString = a(paramString);
    for (byte b = 0; b < arrayOfString.length; b++) {
      int i;
      if ((i = this.a.stringWidth(arrayOfString[b])) > a)
        a = i; 
    } 
    b = arrayOfString.length * this.a.getHeight();
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 -= 12;
    a(paramString);
    paramGraphics.setColor(paramInt3);
    paramGraphics.setFont(this.a);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, 0);
  }
  
  public final void b(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iinc #4, -12
    //   3: iload #5
    //   5: bipush #43
    //   7: iand
    //   8: ifeq -> 46
    //   11: aload_0
    //   12: aload_2
    //   13: invokevirtual a : (Ljava/lang/String;)V
    //   16: iload #5
    //   18: bipush #8
    //   20: iand
    //   21: ifeq -> 31
    //   24: iload_3
    //   25: getstatic h.a : I
    //   28: goto -> 44
    //   31: iload #5
    //   33: iconst_1
    //   34: iand
    //   35: ifeq -> 46
    //   38: iload_3
    //   39: getstatic h.a : I
    //   42: iconst_1
    //   43: ishr
    //   44: isub
    //   45: istore_3
    //   46: aload_1
    //   47: ldc 16777215
    //   49: invokevirtual setColor : (I)V
    //   52: aload_1
    //   53: aload_0
    //   54: getfield a : Ljavax/microedition/lcdui/Font;
    //   57: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   60: aload_1
    //   61: aload_2
    //   62: iload_3
    //   63: iload #4
    //   65: iconst_0
    //   66: invokevirtual drawString : (Ljava/lang/String;III)V
    //   69: return
  }
  
  public static void a() {
    c = 16777215;
  }
  
  public static void a(int paramInt) {
    c = paramInt;
  }
  
  public final int a(String paramString) {
    byte b = 1;
    int i = paramString.length();
    int j;
    for (j = paramString.indexOf('\n'); j != -1; j = (j < i - 1) ? paramString.indexOf('\n', j + 1) : -1)
      b++; 
    return this.a.getHeight() * b;
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */