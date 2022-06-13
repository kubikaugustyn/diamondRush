import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class g
{
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
    
    public g() {
    }
    
    public g(final a a, final int n, final int n2, final g a2) {
        this.a = n << 0;
        this.b = n2 << 0;
        this.a = a;
        this.a = a2;
    }
    
    public final void a(final int f) {
        if (f != this.f) {
            this.f = f;
            this.g = 0;
            this.h = 0;
            this.c = 0;
            this.d = 0;
        }
    }
    
    public final void a() {
        final int n = (this.a.b[this.f] + this.g) * 5;
        this.c = (this.a.f[n + 2] << 0) * 1 / 1;
        if ((this.e & 0x1) != 0x0) {
            this.c = -this.c;
        }
        this.d = (this.a.f[n + 3] << 0) * 1 / 1;
        if ((this.e & 0x2) != 0x0) {
            this.d = -this.d;
        }
        this.a += this.c;
        this.b += this.d;
    }
    
    public final boolean a() {
        final int a;
        return this.g == this.a.a(this.f) - 1 && ((a = this.a.a(this.f, this.g)) == 0 || this.h == a - 1);
    }
    
    public final void a(final Graphics graphics) {
        if (this.a == null) {
            return;
        }
        int a = this.a;
        int b = this.b;
        g g = this;
        g a2;
        while ((a2 = g.a) != null) {
            a += a2.a;
            b += a2.b;
            g = a2;
        }
        final int n = a(a) + 0;
        final int n2 = b(b) + 0;
        if (this.h >= 0) {
            this.a.a(graphics, this.f, this.g, n, n2, this.e, 0, 0);
            return;
        }
        if (this.f >= 0) {
            this.a.a(graphics, this.f, n, n2, this.e);
            return;
        }
        if (this.g >= 0) {
            this.a.a(graphics, this.g, n, n2, this.e, 0, 0);
        }
    }
    
    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.h < 0) {
            return;
        }
        final int a;
        if ((a = this.a.a(this.f, this.g)) == 0) {
            return;
        }
        ++this.h;
        if (a > this.h) {
            return;
        }
        this.h = 0;
        ++this.g;
        if (this.g >= this.a.a(this.f)) {
            this.g = 0;
            this.c = 0;
            this.d = 0;
        }
    }
    
    private static int a(final int n) {
        return (n >> 0) * 1 / 1;
    }
    
    private static int b(final int n) {
        return (n >> 0) * 1 / 1;
    }
}
