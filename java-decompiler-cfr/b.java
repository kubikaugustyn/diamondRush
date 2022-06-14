import javax.microedition.lcdui.Graphics;

public final class b {
  public static byte[][] a;

  public static byte a = false;

  public static byte b = 4;

  public static int a = false;

  public static byte[][] b;

  public static byte c = 0;

  public static byte d = 2;

  public static boolean a = false;

  public static int b = 0;

  public static void a(int paramInt) {
    a = (byte)(a + b);
    if (a > 24) {
      a = false;
      for (byte b1 = 12; b1 >= 1; b1--) {
        for (byte b2 = 0; b2 < 12; b2++)
          a[b2][b1] = a[b2][b1 - 1];
      }
      b(paramInt);
    }
    if (a) {
      c = (byte)(c + d);
      if (c > 24) {
        c = 0;
        for (byte b1 = 12; b1 >= 1; b1--) {
          for (byte b2 = 0; b2 < 12; b2++)
            b[b2][b1] = b[b2][b1 - 1];
        }
        b(paramInt);
      }
    }
  }

  public static void b(int paramInt) {
    int i;
    for (i = 0; i < 12; i++)
      a[i][0] = false;
    if (a)
      for (i = 0; i < 12; i++)
        b[i][0] = 0;
    int j = 0;
    byte b1 = 0;
    while (b1 < paramInt) {
      while (true) {
        i = d.a(0, 12);
        if (a[i][0])
          continue;
        j = d.a(1, 3);
        a[i][0] = (byte)j;
        b1++;
      }
    }
    if (a) {
      b1 = 0;
      while (b1 < paramInt) {
        while (true) {
          i = d.a(0, 12);
          if (b[i][0] != 0)
            continue;
          j = d.a(1, 3);
          b[i][0] = (byte)j;
          b1++;
        }
      }
    }
  }

  public static void a(Graphics paramGraphics) {
    byte b1;
    for (b1 = 0; b1 < 12; b1++) {
      for (byte b2 = 0; b2 < 13; b2++) {
        if (a[b1][b2] == 2) {

        } else {
          continue;
        }
        i.a[i.a(2)].a(paramGraphics, (a[b1][b2] == true) ? a : 0, b1 * 24, (b2 - 1) * 24 + a, 0, 0, 0);
        continue;
      }
    }
    if (a)
      for (b1 = 0; b1 < 12; b1++) {
        for (byte b2 = 0; b2 < 13; b2++) {
          if (b[b1][b2] == 1 || b[b1][b2] == 2)
            i.a[i.a(2)].a(paramGraphics, 0, b1 * 24, (b2 - 1) * 24 + c, 0, 0, 0);
        }
      }
    a = (a + 1) % b;
  }
}
