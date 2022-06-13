import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public final class d
{
    public static Random a;
    
    public static int a(final int n, final int n2) {
        return n + Math.abs(d.a.nextInt()) % (n2 - n);
    }
    
    static {
        d.a = new Random(System.currentTimeMillis());
    }
}
