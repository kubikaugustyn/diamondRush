import javax.microedition.lcdui.Graphics;

public final class g {
    public int var_int_a;
    public int b;
    public int c;
    public int d;
    public int e;
    public a var_a_a;
    public int f;
    public int g;
    public int h;
    public g var_g_a;

    public g() {
    }

    public g(a a2, int n, int n2, g g2) {
        this.var_int_a = n << 0;
        this.b = n2 << 0;
        this.var_a_a = a2;
        this.var_g_a = g2;
    }

    public final void void_a(int n) {
        if (n != this.f) {
            this.f = n;
            this.g = 0;
            this.h = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    public final void void_a() {
        int n = (this.var_a_a.var_short_arr_b[this.f] + this.g) * 5;
        this.c = (this.var_a_a.var_byte_arr_f[n + 2] << 0) * 1 / 1;
        if ((this.e & 1) != 0) {
            this.c = -this.c;
        }
        this.d = (this.var_a_a.var_byte_arr_f[n + 3] << 0) * 1 / 1;
        if ((this.e & 2) != 0) {
            this.d = -this.d;
        }
        this.var_int_a += this.c;
        this.b += this.d;
    }

    public final boolean boolean_a() {
        if (this.g != this.var_a_a.int_a(this.f) - 1) {
            return false;
        }
        int n = this.var_a_a.a(this.f, this.g);
        return n == 0 || this.h == n - 1;
    }

    public final void a(Graphics graphics) {
        g g2;
        if (this.var_a_a == null) {
            return;
        }
        int n = this.var_int_a;
        int n2 = this.b;
        g g3 = this;
        while ((g2 = g3.var_g_a) != null) {
            n += g2.var_int_a;
            n2 += g2.b;
            g3 = g2;
        }
        n = g.int_a(n) + 0;
        n2 = g.b(n2) + 0;
        if (this.h >= 0) {
            this.var_a_a.a(graphics, this.f, this.g, n, n2, this.e, 0, 0);
            return;
        }
        if (this.f >= 0) {
            this.var_a_a.a(graphics, this.f, n, n2, this.e);
            return;
        }
        if (this.g >= 0) {
            this.var_a_a.a(graphics, this.g, n, n2, this.e, 0, 0);
        }
    }

    public final void b() {
        if (this.var_a_a == null) {
            return;
        }
        if (this.h < 0) {
            return;
        }
        int n = this.var_a_a.a(this.f, this.g);
        if (n == 0) {
            return;
        }
        ++this.h;
        if (n > this.h) {
            return;
        }
        this.h = 0;
        ++this.g;
        if (this.g >= this.var_a_a.int_a(this.f)) {
            this.g = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    private static int int_a(int n) {
        return (n >> 0) * 1 / 1;
    }

    private static int b(int n) {
        return (n >> 0) * 1 / 1;
    }
}