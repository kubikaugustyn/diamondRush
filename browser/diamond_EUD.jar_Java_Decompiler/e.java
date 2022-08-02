import java.util.Random;

public final class e {
  private static Random a = new Random(System.currentTimeMillis());
  
  public static int a(int paramInt1, int paramInt2) {
    return paramInt1 + Math.abs(a.nextInt()) % (paramInt2 - paramInt1);
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */