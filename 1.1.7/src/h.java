import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import java.io.InputStream;
import javax.microedition.lcdui.Font;

public final class h
{
    public static int integer_a;
    public static int integer_b;
    private static int integer_e;
    public static int integer_c;
    public int integer_d;
    public int[] integer_arr_a;
    public int[] integer_arr_b;
    private static byte[] byte_arr_a;
    public Font font_a;
    
    public h(final int e) {
        this.integer_d = 0;
        this.integer_arr_a = new int[2];
        this.integer_arr_b = new int[3];
        h.integer_e = e;
        h.integer_c = 16777215;
        this.font_a = Font.getFont(0, 1, e);
        this.integer_arr_a[0] = 4;
        this.integer_arr_a[1] = 14;
        this.integer_arr_b[0] = 0;
        this.integer_arr_b[0] = 0;
        this.integer_arr_b[0] = 0;
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/mc");
        h.byte_arr_a = new byte[256];
        try {
            resourceAsStream.read(h.byte_arr_a);
            resourceAsStream.close();
        }
        catch (Exception ex) {}
    }
    
    public static int a() {
        return h.integer_e;
    }
    
    public final void void_a(final Graphics graphics, final String s, final int n, final int n2, final int n3) {
        final String[] a = a(s);
        final int height = this.font_a.getHeight();
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
    
    public final void void_a(final String s) {
        h.integer_a = 0;
        final String[] a = a(s);
        for (int i = 0; i < a.length; ++i) {
            final int stringWidth;
            if ((stringWidth = this.font_a.stringWidth(a[i])) > h.integer_a) {
                h.integer_a = stringWidth;
            }
        }
        h.integer_b = a.length * this.font_a.getHeight();
    }
    
    public final void void_a(final Graphics graphics, final String s, final int n, int n2, final int color, final int n3) {
        n2 -= 12;
        this.a(s);
        graphics.setColor(color);
        graphics.setFont(this.font_a);
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
                    a = h.integer_a;
                }
                else {
                    if ((n3 & 0x1) == 0x0) {
                        break Label_0046;
                    }
                    n4 = n;
                    a = h.integer_a >> 1;
                }
                n = n4 - a;
            }
        }
        graphics.setColor(16777215);
        graphics.setFont(this.font_a);
        graphics.drawString(s, n, n2, 0);
    }
    
    public static void void_a() {
        h.integer_c = 16777215;
    }
    
    public static void void_a(final int c) {
        h.integer_c = c;
    }
    
    public final int integer_a(final String s) {
        int n = 1;
        for (int length = s.length(), i = s.indexOf(10); i != -1; i = ((i < length - 1) ? s.indexOf(10, i + 1) : -1)) {
            ++n;
        }
        return this.font_a.getHeight() * n;
    }
    
    static {
        h.integer_e = 0;
        h.integer_c = 0;
    }
}
