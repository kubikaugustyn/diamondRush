import java.util.Random;

public final class d {
  public static Random a = new Random(System.currentTimeMillis());

  public static int a(int paramInt1, int paramInt2) {
    return paramInt1 + Math.abs(a.nextInt()) % (paramInt2 - paramInt1);
  }
}
