import javax.microedition.lcdui.Graphics;

public final class g {
  public int a;

  public int b;

  public int c;

  public int d;

  public int e;

  public a a;

  public int f;

  public int g;

  public int h;

  public g a;

  public g() {}

  public g(a parama, int paramInt1, int paramInt2, g paramg) {
    this.a = paramInt1 << 0;
    this.b = paramInt2 << 0;
    this.a = (g)parama;
    this.a = paramg;
  }

  public final void a(int paramInt) {
    if (paramInt != this.f) {
      this.f = paramInt;
      this.g = 0;
      this.h = 0;
      this.c = 0;
      this.d = 0;
    }
  }

  public final void a() {
    int i = (((a)this.a).b[this.f] + this.g) * 5;
    this.c = (((a)this.a).f[i + 2] << 0) * 1 / 1;
    if ((this.e & 0x1) != 0)
      this.c = -this.c;
    this.d = (((a)this.a).f[i + 3] << 0) * 1 / 1;
    if ((this.e & 0x2) != 0)
      this.d = -this.d;
    this.a += this.c;
    this.b += this.d;
  }

  public final boolean a() {
    int i;
    return (this.g != this.a.a(this.f) - 1) ? false : (((i = this.a.a(this.f, this.g)) == 0 || this.h == i - 1));
  }

  public final void a(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : La;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield a : I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield b : I
    //   17: istore_3
    //   18: aload_0
    //   19: getfield a : Lg;
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
    //   50: invokestatic a : (I)I
    //   53: iconst_0
    //   54: iadd
    //   55: istore_2
    //   56: iload_3
    //   57: invokestatic b : (I)I
    //   60: iconst_0
    //   61: iadd
    //   62: istore_3
    //   63: aload_0
    //   64: getfield h : I
    //   67: iflt -> 95
    //   70: aload_0
    //   71: getfield a : La;
    //   74: aload_1
    //   75: aload_0
    //   76: getfield f : I
    //   79: aload_0
    //   80: getfield g : I
    //   83: iload_2
    //   84: iload_3
    //   85: aload_0
    //   86: getfield e : I
    //   89: iconst_0
    //   90: iconst_0
    //   91: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   94: return
    //   95: aload_0
    //   96: getfield f : I
    //   99: iflt -> 121
    //   102: aload_0
    //   103: getfield a : La;
    //   106: aload_1
    //   107: aload_0
    //   108: getfield f : I
    //   111: iload_2
    //   112: iload_3
    //   113: aload_0
    //   114: getfield e : I
    //   117: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   120: return
    //   121: aload_0
    //   122: getfield g : I
    //   125: iflt -> 148
    //   128: aload_0
    //   129: getfield a : La;
    //   132: aload_1
    //   133: aload_0
    //   134: getfield g : I
    //   137: iload_2
    //   138: iload_3
    //   139: aload_0
    //   140: getfield e : I
    //   143: iconst_0
    //   144: iconst_0
    //   145: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   148: return
  }

  public final void b() {
    if (this.a == null)
      return;
    if (this.h < 0)
      return;
    int i;
    if ((i = this.a.a(this.f, this.g)) == 0)
      return;
    this.h++;
    if (i > this.h)
      return;
    this.h = 0;
    this.g++;
    if (this.g >= this.a.a(this.f)) {
      this.g = 0;
      this.c = 0;
      this.d = 0;
    }
  }

  private static int a(int paramInt) {
    return (paramInt >> 0) * 1 / 1;
  }

  private static int b(int paramInt) {
    return (paramInt >> 0) * 1 / 1;
  }
}
