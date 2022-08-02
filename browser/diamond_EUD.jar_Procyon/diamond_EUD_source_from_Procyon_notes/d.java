import java.util.Vector;
import java.io.InputStream;
import java.io.IOException;
import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class d
{
    private static d a;
    private static DataInputStream a;
    private static String a;
    
    private d() {
    }
    
    public static String a(String string, final String str, final String str2) {
        int i;
        do {
            if ((i = string.indexOf(str)) >= 0) {
                string = string.substring(0, i) + str2 + string.substring(i + str.length());
            }
        } while (i >= 0);
        return string;
    }
    
    public static String a(final int n) {
        return a(n, null);
    }
    
    private static synchronized String a(int utf, final String[] array) {
        if (d.a == null) {
            d.a = System.getProperty("microedition.locale");
        }
        try {
            if (d.a == null) {
                d.a = new d();
            }
            if (d.a == null) {
                InputStream in;
                if ((in = d.a.getClass().getResourceAsStream("/lang." + d.a)) == null) {
                    in = d.a.getClass().getResourceAsStream("/lang.xx");
                }
                if (in == null) {
                    return "X";
                }
                (d.a = new DataInputStream(in)).mark(512);
            }
            d.a.skipBytes(n << 1);
            d.a.skipBytes(d.a.readUnsignedShort() - (n << 1) - 2);
            utf = (int)d.a.readUTF();
            if (!d.a.markSupported()) {
                d.a.close();
                d.a = null;
            }
            else {
                try {
                    d.a.reset();
                }
                catch (IOException ex) {
                    d.a.close();
                    d.a = null;
                }
            }
            return (String)utf;
        }
        catch (IOException ex2) {
            d.a = null;
            return "E";
        }
    }
    
    private static boolean a(final String s, final String s2, int index, int n) {
        while (index != s.length() || n != s2.length()) {
            if (index == s.length() || n == s2.length()) {
                return false;
            }
            switch (s2.charAt(n)) {
                case '?': {
                    ++index;
                    ++n;
                    continue;
                }
                case '*': {
                    if (n == s2.length() - 1) {
                        return true;
                    }
                    if (a(s, s2, index, n + 1)) {
                        return true;
                    }
                    ++index;
                    continue;
                }
                default: {
                    if (s.charAt(index) == s2.charAt(n)) {
                        ++index;
                        ++n;
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private static StringBuffer a(final InputStream inputStream) {
        final StringBuffer sb = new StringBuffer();
        try {
            if ((char)inputStream.read() != ' ') {
                return sb;
            }
            int read;
            while ((read = inputStream.read()) >= 0) {
                if ((char)read != '\r') {
                    if ((char)read == '\n') {
                        sb.append((Object)a(inputStream));
                        break;
                    }
                    sb.append((char)read);
                }
            }
        }
        catch (IOException ex) {}
        return sb;
    }
    
    static {
        d.a = null;
        d.a = null;
        final String property = System.getProperty("microedition.platform");
        boolean b = false;
        final StringBuffer sb = new StringBuffer();
        if (d.a == null) {
            d.a = new d();
        }
        Label_0266: {
            final InputStream resourceAsStream;
            if ((resourceAsStream = d.a.getClass().getResourceAsStream("/META-INF/MANIFEST.MF")) != null) {
                while (true) {
                    Label_0140: {
                        try {
                            int read;
                            while ((read = resourceAsStream.read()) >= 0) {
                                if ((char)read != '\r') {
                                    if ((char)read == '\n') {
                                        if (sb.toString().trim().startsWith("Nokia-Platform:")) {
                                            sb.append((Object)a(resourceAsStream));
                                            break Label_0140;
                                        }
                                        sb.delete(0, sb.length());
                                    }
                                    else {
                                        sb.append((char)read);
                                    }
                                }
                            }
                            break Label_0266;
                        }
                        catch (IOException ex) {
                            continue;
                        }
                        continue;
                    }
                    String obj = sb.toString().trim().substring(15);
                    final Vector vector = new Vector<String>();
                    int index;
                    while ((index = obj.indexOf("@")) != -1) {
                        vector.addElement(obj.substring(0, index));
                        obj = obj.substring(index + 1, obj.length());
                    }
                    vector.addElement(obj);
                    for (int i = 0; i < vector.size(); ++i) {
                        if (a(property, vector.elementAt(i).trim(), 0, 0)) {
                            b = true;
                            break;
                        }
                    }
                    break;
                }
            }
            if (!b) {
                System.exit(0);
            }
        }
        d.a = null;
    }
}
