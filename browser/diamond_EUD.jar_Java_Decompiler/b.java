import javax.microedition.lcdui.Graphics;

public final class b {
  public int a;
  
  public int b;
  
  private int g;
  
  private int h;
  
  public int c;
  
  public f a;
  
  public int d;
  
  public int e;
  
  public int f;
  
  private b a;
  
  public b() {}
  
  public b(f paramf, int paramInt1, int paramInt2, b paramb) {
    this.a = false;
    this.b = 0;
    this.a = (b)paramf;
    this.a = null;
  }
  
  public final void a(int paramInt) {
    if (paramInt != this.d) {
      this.d = paramInt;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.h = 0;
    } 
  }
  
  public final void a() {
    int i = (((f)this.a).a[this.d] + this.e) * 5;
    this.g = ((f)this.a).c[i + 2];
    if ((this.c & 0x1) != 0)
      this.g = -this.g; 
    this.h = ((f)this.a).c[i + 3];
    if ((this.c & 0x2) != 0)
      this.h = -this.h; 
    this.a += this.g;
    this.b += this.h;
  }
  
  public final boolean a() {
    int i;
    return (this.e != this.a.a(this.d) - 1) ? false : (((i = this.a.a(this.d, this.e)) == 0 || this.f == i - 1));
  }
  
  public final void a(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lf;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield a : I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield b : I
    //   17: istore_3
    //   18: aload_0
    //   19: getfield a : Lb;
    //   22: dup
    //   23: astore #4
    //   25: ifnull -> 49
    //   28: iload_2
    //   29: aload #4
    //   31: getfield a : I
    //   34: iadd
    //   35: istore_2
    //   36: iload_3
    //   37: aload #4
    //   39: getfield b : I
    //   42: iadd
    //   43: istore_3
    //   44: aload #4
    //   46: goto -> 19
    //   49: iload_2
    //   50: dup
    //   51: istore #4
    //   53: istore_2
    //   54: iload_3
    //   55: dup
    //   56: istore #4
    //   58: istore_3
    //   59: aload_0
    //   60: getfield f : I
    //   63: iflt -> 91
    //   66: aload_0
    //   67: getfield a : Lf;
    //   70: aload_1
    //   71: aload_0
    //   72: getfield d : I
    //   75: aload_0
    //   76: getfield e : I
    //   79: iload_2
    //   80: iload_3
    //   81: aload_0
    //   82: getfield c : I
    //   85: iconst_0
    //   86: iconst_0
    //   87: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   90: return
    //   91: aload_0
    //   92: getfield d : I
    //   95: iflt -> 117
    //   98: aload_0
    //   99: getfield a : Lf;
    //   102: aload_1
    //   103: aload_0
    //   104: getfield d : I
    //   107: iload_2
    //   108: iload_3
    //   109: aload_0
    //   110: getfield c : I
    //   113: invokevirtual b : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   116: return
    //   117: aload_0
    //   118: getfield e : I
    //   121: iflt -> 142
    //   124: aload_0
    //   125: getfield a : Lf;
    //   128: aload_1
    //   129: aload_0
    //   130: getfield e : I
    //   133: iload_2
    //   134: iload_3
    //   135: aload_0
    //   136: getfield c : I
    //   139: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   142: return
  }
  
  public final void b() {
    if (this.a == null)
      return; 
    if (this.f < 0)
      return; 
    int i;
    if ((i = this.a.a(this.d, this.e)) == 0)
      return; 
    this.f++;
    if (i > this.f)
      return; 
    this.f = 0;
    this.e++;
    if (this.e >= this.a.a(this.d)) {
      this.e = 0;
      this.g = 0;
      this.h = 0;
    } 
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */