import javax.microedition.media.Controllable;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.media.Manager;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

// 
// Decompiled by Procyon v0.5.36
// 

public final class h implements Runnable, PlayerListener
{
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public long a;
    public static Player[] a;
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public ByteArrayInputStream a;
    public InputStream a;
    public byte[] a;
    public Thread a;
    
    public h() {
        this.a = 0L;
    }
    
    public final void a(final int n) {
        if (h.a == null) {
            h.a = new Player[21];
        }
        try {
            final byte[] array = new byte[i.a(this.a, n * 8 + 4)];
            this.a.read(array);
            this.a = new ByteArrayInputStream(array);
            (h.a[n] = Manager.createPlayer((InputStream)this.a, "audio/midi")).addPlayerListener((PlayerListener)this);
            h.a[n].realize();
            ((VolumeControl)((Controllable)h.a[n]).getControl("VolumeControl")).setLevel(100);
            this.a.close();
            this.a = null;
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    public final void a() {
        h.b = false;
        (this.a = new Thread(this)).setPriority(1);
        this.a.start();
    }
    
    public final void b() {
        if (h.a == null) {
            try {
                (this.a = this.getClass().getResourceAsStream("/snd.f")).skip(1L);
                ((InputStream)(Object)(this.a = new byte[168])).read(this.a);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public final void c() {
        try {
            h.a = -1;
            h.e = -1;
            h.c = 0;
            this.a.close();
            this.a = null;
            this.a = null;
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    public final void d() {
        if (h.a != null) {
            this.e();
            for (int length = h.a.length, i = 0; i < length; ++i) {
                if (h.a[i] != null) {
                    h.a[i].close();
                    h.a[i] = null;
                }
            }
        }
        h.a = null;
        h.b = true;
    }
    
    private static int a(final int n) {
        switch (n) {
            case 1:
            case 2:
            case 4:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20: {
                return 30;
            }
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13: {
                return 20;
            }
            case 0:
            case 5:
            case 6:
            case 10:
            case 14: {
                return 10;
            }
            default: {
                return 0;
            }
        }
    }
    
    private static boolean a(final int n) {
        switch (n) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14: {
                return false;
            }
            default: {
                return true;
            }
        }
    }
    
    public final synchronized void run() {
        while (!h.b) {
            try {
                this.wait();
            }
            catch (Exception ex) {}
            if (h.c) {
                try {
                    if (a(h.a)) {
                        h.a[h.a].deallocate();
                        h.e = -1;
                    }
                    h.a = -1;
                    h.c = false;
                }
                catch (Exception ex2) {}
                finally {
                    h.c = 0;
                }
            }
            if (h.b != -1) {
                try {
                    if (h.e != -1 && h.b != h.e) {
                        h.a[h.e].deallocate();
                        h.e = -1;
                    }
                    if (h.e == -1) {
                        h.a[h.b].prefetch();
                        h.e = h.b;
                    }
                    h.a[h.b].start();
                    h.a = h.b;
                    h.c = h.d;
                    this.a = System.currentTimeMillis();
                    continue;
                }
                catch (Exception ex3) {
                    continue;
                }
                finally {
                    h.b = -1;
                }
                break;
            }
        }
    }
    
    public final synchronized void b(final int b) {
        if (h.a) {
            if (h.a != -1) {
                if (h.c >= a(b) && (h.c != a(b) || Math.abs(System.currentTimeMillis() - this.a) <= 50L)) {
                    return;
                }
                h.c = true;
            }
            else {
                h.c = 0;
            }
            final int a;
            if ((a = a(b)) >= h.c) {
                h.b = b;
                h.d = a;
                this.notify();
            }
        }
    }
    
    public final synchronized void e() {
        if (h.a != -1) {
            h.c = true;
        }
        this.notify();
    }
    
    public static synchronized boolean a() {
        return h.a != -1;
    }
    
    public final void playerUpdate(final Player player, final String s, final Object o) {
        if (h.a != null && h.a != -1 && s.equals("endOfMedia")) {
            this.e();
        }
    }
    
    static {
        h.a = -1;
        h.b = -1;
        h.e = -1;
        h.c = false;
    }
}
