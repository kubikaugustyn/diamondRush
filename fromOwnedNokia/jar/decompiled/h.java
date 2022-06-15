import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.Font;

// 
// Decompiled by Procyon v0.5.36
// 

public final class h
{
    public static int a;
    public static int b;
    private static int e;
    public static int c;
    public int d;
    public int[] a;
    public int[] b;
    private static byte[] a;
    public Font a;
    
    public h(final int e) {
        this.d = 0;
        this.a = new int[2];
        this.b = new int[3];
        h.e = e;
        h.c = 16777215;
        (this.a = Font.getFont(0, 1, e))[0] = 4;
        this.a[1] = 14;
        this.b[0] = 0;
        this.b[0] = 0;
        this.b[0] = 0;
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/mc");
        h.a = new byte[256];
        try {
            resourceAsStream.read(h.a);
            resourceAsStream.close();
        }
        catch (Exception ex) {}
    }
    
    public static int a() {
        return h.e;
    }
    
    public final void a(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        final String[] a = a(s);
        final int height = this.a.getHeight();
        for (int i = 0; i < a.length; ++i) {
            this.b(graphics, a[i], n, n2 + i * height, n3);
        }
    }
    
    private static String[] a(final Vector vector) {
        final String[] array = new String[vector.size()];
        final Enumeration<String> elements = vector.elements();
        int n = 0;
        while (elements.hasMoreElements()) {
            array[n] = elements.nextElement().trim();
            ++n;
        }
        return array;
    }
    
    private static String[] a(final String s) {
        final Vector<String> vector = new Vector<String>();
        String string = "";
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            string += char1;
            if (char1 == '\n' || i == s.length() - 1) {
                vector.addElement(string);
                string = "";
            }
        }
        return a(vector);
    }
    
    public final void a(final String s) {
        h.a = 0;
        final String[] a = a(s);
        for (int i = 0; i < a.length; ++i) {
            final int stringWidth;
            if ((stringWidth = this.a.stringWidth(a[i])) > h.a) {
                h.a = stringWidth;
            }
        }
        h.b = a.length * this.a.getHeight();
    }
    
    public final void a(final Graphics graphics, final String s, final int n, int n2, final int color, final int n3) {
        n2 -= 12;
        this.a(s);
        graphics.setColor(color);
        graphics.setFont(this.a);
        graphics.drawString(s, n, n2, 0);
    }
    
    public final void b(final Graphics graphics, final String s, int n, int n2, final int n3) {
        n2 -= 12;
        Label_0046: {
            if ((n3 & 0x2B) != 0x0) {
                this.a(s);
                int n4;
                int a;
                if ((n3 & 0x8) != 0x0) {
                    n4 = n;
                    a = h.a;
                }
                else {
                    if ((n3 & 0x1) == 0x0) {
                        break Label_0046;
                    }
                    n4 = n;
                    a = h.a >> 1;
                }
                n = n4 - a;
            }
        }
        graphics.setColor(16777215);
        graphics.setFont(this.a);
        graphics.drawString(s, n, n2, 0);
    }
    
    public static void a() {
        h.c = 16777215;
    }
    
    public static void a(final int c) {
        h.c = c;
    }
    
    public final int a(final String s) {
        int n = 1;
        for (int length = s.length(), i = s.indexOf(10); i != -1; i = ((i < length - 1) ? s.indexOf(10, i + 1) : -1)) {
            ++n;
        }
        return this.a.getHeight() * n;
    }
    
    static {
        h.e = 0;
        h.c = 0;
    }
}
