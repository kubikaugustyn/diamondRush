import javax.microedition.lcdui.Graphics;

public final class g {
  public static byte[][] a;
  
  private static byte a = 0;
  
  private static byte b = 4;
  
  private static int b = 0;
  
  private static byte c = 0;
  
  private static byte d = 2;
  
  private static boolean a = 0;
  
  public static int a = 0;
  
  public static void a(int paramInt) {
    if ((a = (byte)(a + b)) > 24) {
      a = 0;
      for (paramInt = 12; paramInt >= 1; paramInt--) {
        for (byte b = 0; b < 12; b++)
          a[b][paramInt] = a[b][paramInt - 1]; 
      } 
      b(3);
    } 
  }
  
  public static void b(int paramInt) {
    int i;
    for (i = 0; i < 12; i++)
      a[i][0] = 0; 
    int j = 0;
    byte b = 0;
    while (b < paramInt) {
      while (true) {
        i = e.a(0, 12);
        if (a[i][0] == 0) {
          j = e.a(1, 3);
          a[i][0] = (byte)j;
          b++;
        } 
      } 
    } 
  }
  
  public static void a(Graphics paramGraphics) {
    for (byte b = 0; b < 12; b++) {
      for (byte b1 = 0; b1 < 13; b1++) {
        if (a[b][b1] == 2) {
        
        } else {
          continue;
        } 
        i.a[i.a(2)].a(paramGraphics, (a[b][b1] == 1) ? b : 0, b * 24, (b1 - 1) * 24 + a, 0);
        continue;
      } 
    } 
    b = (b + 1) % a;
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */