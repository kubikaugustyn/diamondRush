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

public final class j implements Runnable, PlayerListener
{
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private long a;
    private static Player[] a;
    public static boolean a;
    private static boolean b;
    private static boolean c;
    private ByteArrayInputStream a;
    private InputStream a;
    private byte[] a;
    private Thread a;
    
    public j() {
        this.a = 0L;
    }
    
    public final void a(final int n) {
        if (j.a == null) {
            j.a = new Player[21];
        }
        try {
            final byte[] array = new byte[i.a(this.a, (n << 3) + 4)];
            this.a.read(array);
            this.a = new ByteArrayInputStream(array);
            (j.a[n] = Manager.createPlayer((InputStream)this.a, "audio/midi")).addPlayerListener((PlayerListener)this);
            j.a[n].realize();
            ((VolumeControl)((Controllable)j.a[n]).getControl("VolumeControl")).setLevel(100);
            this.a.close();
            this.a = null;
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    public final void a() {
        j.b = false;
        (this.a = new Thread(this)).setPriority(1);
        this.a.start();
    }
    
    public final void b() {
        if (j.a == null) {
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
            j.a = -1;
            j.e = -1;
            j.c = 0;
            this.a.close();
            this.a = null;
            this.a = null;
            System.gc();
        }
        catch (Exception ex) {}
    }
    
    public final void d() {
        if (j.a != null) {
            this.e();
            for (int length = j.a.length, i = 0; i < length; ++i) {
                if (j.a[i] != null) {
                    j.a[i].close();
                    j.a[i] = null;
                }
            }
        }
        j.a = null;
        j.b = true;
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
    
    public final synchronized void run() {
        while (!j.b) {
            final j j;
            try {
                j.wait();
            }
            catch (Exception ex) {}
            if (j.c) {
                try {
                    boolean b = false;
                    switch (j.a) {
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
                            b = false;
                            break;
                        }
                        default: {
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        j.a[j.a].deallocate();
                        j.e = -1;
                    }
                    j.a = -1;
                    j.c = false;
                }
                catch (Exception ex2) {}
                finally {
                    j.c = 0;
                }
            }
            if (j.b != -1) {
                try {
                    if (j.e != -1 && j.b != j.e) {
                        j.a[j.e].deallocate();
                        j.e = -1;
                    }
                    if (j.e == -1) {
                        j.a[j.b].prefetch();
                        j.e = j.b;
                    }
                    j.a[j.b].start();
                    j.a = j.b;
                    j.c = j.d;
                    j.a = System.currentTimeMillis();
                    continue;
                }
                catch (Exception ex3) {
                    continue;
                }
                finally {
                    j.b = -1;
                }
                break;
            }
        }
    }
    
    public final synchronized void b(final int b) {
        if (j.a) {
            if (j.a != -1) {
                if (j.c >= a(b) && (j.c != a(b) || Math.abs(System.currentTimeMillis() - this.a) <= 50L)) {
                    return;
                }
                j.c = true;
            }
            else {
                j.c = 0;
            }
            final int a;
            if ((a = a(b)) >= j.c) {
                j.b = b;
                j.d = a;
                this.notify();
            }
        }
    }
    
    public final synchronized void e() {
        if (j.a != -1) {
            j.c = true;
        }
        this.notify();
    }
    
    public static synchronized boolean a() {
        return j.a != -1;
    }
    
    public final void playerUpdate(final Player player, final String s, final Object o) {
        if (j.a != null && j.a != -1 && s.equals("endOfMedia")) {
            this.e();
        }
    }
    
    static {
        j.a = -1;
        j.b = -1;
        j.e = -1;
        j.c = false;
    }
}
