import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public final class e
{
    private static Random a;
    
    public static int a(final int n, final int n2) {
        return n + Math.abs(e.a.nextInt()) % (n2 - n);
    }
    
    static {
        e.a = new Random(System.currentTimeMillis());
    }
}
