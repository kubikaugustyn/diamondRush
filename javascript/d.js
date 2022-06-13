var __author__ = "kubik.augustyn@post.cz"

class d {//public final class d
    constructor() {
        this.randA = new Random(System.currentTimeMillis())// public static Random a;
    }

    a(n, n2) {// public static int a(final int n, final int n2)
        return n + Math.abs(this.randA.nextInt()) % (n2 - n)// return n + Math.abs(d.a.nextInt()) % (n2 - n);
    }

    // static {
    // d.a = new Random(System.currentTimeMillis());
    // }
}
