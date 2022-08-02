import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class b
{
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
    
    public b() {
    }
    
    public b(final f a, final int n, final int n2, final b b) {
        this.a = 0;
        this.b = 0;
        this.a = a;
        this.a = null;
    }
    
    public final void a(final int d) {
        if (d != this.d) {
            this.d = d;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
        }
    }
    
    public final void a() {
        final int n = (this.a.a[this.d] + this.e) * 5;
        this.g = this.a.c[n + 2];
        if ((this.c & 0x1) != 0x0) {
            this.g = -this.g;
        }
        this.h = this.a.c[n + 3];
        if ((this.c & 0x2) != 0x0) {
            this.h = -this.h;
        }
        this.a += this.g;
        this.b += this.h;
    }
    
    public final boolean a() {
        final int a;
        return this.e == this.a.a(this.d) - 1 && ((a = this.a.a(this.d, this.e)) == 0 || this.f == a - 1);
    }
    
    public final void a(final Graphics graphics) {
        if (this.a == null) {
            return;
        }
        int a = this.a;
        int b = this.b;
        b b2 = this;
        b a2;
        while ((a2 = b2.a) != null) {
            a += a2.a;
            b += a2.b;
            b2 = a2;
        }
        final int n = a;
        final int n2 = b;
        if (this.f >= 0) {
            this.a.a(graphics, this.d, this.e, n, n2, this.c, 0, 0);
            return;
        }
        if (this.d >= 0) {
            this.a.b(graphics, this.d, n, n2, this.c);
            return;
        }
        if (this.e >= 0) {
            this.a.a(graphics, this.e, n, n2, this.c);
        }
    }
    
    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.f < 0) {
            return;
        }
        final int a;
        if ((a = this.a.a(this.d, this.e)) == 0) {
            return;
        }
        ++this.f;
        if (a > this.f) {
            return;
        }
        this.f = 0;
        ++this.e;
        if (this.e >= this.a.a(this.d)) {
            this.e = 0;
            this.g = 0;
            this.h = 0;
        }
    }
}
