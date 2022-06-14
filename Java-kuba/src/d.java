import java.util.Random;

public final class d {
    public static Random a = new Random(System.currentTimeMillis());

    public static int a(int n, int n2) {
        return n + Math.abs(a.nextInt()) % (n2 - n);
    }
}