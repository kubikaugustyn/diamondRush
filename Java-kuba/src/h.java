import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class h
implements Runnable,
PlayerListener {
    public static int var_int_a;
    public static int var_int_b;
    public static int var_int_c;
    public static int d;
    public static int e;
    public long var_long_a = 0L;
    public static Player[] var_javax_microedition_media_Player_arr_a;
    public static boolean var_boolean_a;
    public static boolean var_boolean_b;
    public static boolean var_boolean_c;
    public ByteArrayInputStream var_java_io_ByteArrayInputStream_a;
    public InputStream var_java_io_InputStream_a;
    public byte[] var_byte_arr_a;
    public Thread var_java_lang_Thread_a;

    public final void void_a(int n) {
        if (var_javax_microedition_media_Player_arr_a == null) {
            var_javax_microedition_media_Player_arr_a = new Player[21];
        }
        try {
            int n2 = i.a(this.var_byte_arr_a, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.var_java_io_InputStream_a.read(byArray);
            this.var_java_io_ByteArrayInputStream_a = new ByteArrayInputStream(byArray);
            h.var_javax_microedition_media_Player_arr_a[n] = Manager.createPlayer((InputStream)this.var_java_io_ByteArrayInputStream_a, (String)"audio/midi");
            var_javax_microedition_media_Player_arr_a[n].addPlayerListener((PlayerListener)this);
            var_javax_microedition_media_Player_arr_a[n].realize();
            ((VolumeControl)var_javax_microedition_media_Player_arr_a[n].getControl("VolumeControl")).setLevel(100);
            this.var_java_io_ByteArrayInputStream_a.close();
            this.var_java_io_ByteArrayInputStream_a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void void_a() {
        var_boolean_b = false;
        this.var_java_lang_Thread_a = new Thread(this);
        this.var_java_lang_Thread_a.setPriority(1);
        this.var_java_lang_Thread_a.start();
    }

    public final void b() {
        if (var_javax_microedition_media_Player_arr_a == null) {
            try {
                this.var_java_io_InputStream_a = this.getClass().getResourceAsStream("/snd.f");
                this.var_java_io_InputStream_a.skip(1L);
                this.var_byte_arr_a = new byte[168];
                this.var_java_io_InputStream_a.read(this.var_byte_arr_a);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    public final void c() {
        try {
            var_int_a = -1;
            e = -1;
            var_int_c = 0;
            this.var_java_io_InputStream_a.close();
            this.var_java_io_InputStream_a = null;
            this.var_byte_arr_a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        if (var_javax_microedition_media_Player_arr_a != null) {
            this.e();
            int n = var_javax_microedition_media_Player_arr_a.length;
            for (int j = 0; j < n; ++j) {
                if (var_javax_microedition_media_Player_arr_a[j] == null) continue;
                var_javax_microedition_media_Player_arr_a[j].close();
                h.var_javax_microedition_media_Player_arr_a[j] = null;
            }
        }
        var_javax_microedition_media_Player_arr_a = null;
        var_boolean_b = true;
    }

    private static int int_a(int n) {
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
        }
        return 0;
    }

    private static boolean boolean_a(int n) {
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
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void run() {
        while (!var_boolean_b) {
            try {
                this.wait();
            }
            catch (Exception exception) {}
            if (var_boolean_c) {
                try {
                    if (h.boolean_a(var_int_a)) {
                        var_javax_microedition_media_Player_arr_a[var_int_a].deallocate();
                        e = -1;
                    }
                    var_int_a = -1;
                    var_boolean_c = false;
                }
                catch (Exception exception) {
                }
                finally {
                    var_int_c = 0;
                }
            }
            if (var_int_b == -1) continue;
            try {
                if (e != -1 && var_int_b != e) {
                    var_javax_microedition_media_Player_arr_a[e].deallocate();
                    e = -1;
                }
                if (e == -1) {
                    var_javax_microedition_media_Player_arr_a[var_int_b].prefetch();
                    e = var_int_b;
                }
                var_javax_microedition_media_Player_arr_a[var_int_b].start();
                var_int_a = var_int_b;
                var_int_c = d;
                this.var_long_a = System.currentTimeMillis();
            }
            catch (Exception exception) {
            }
            finally {
                var_int_b = -1;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final synchronized void b(int n) {
        if (!var_boolean_a) return;
        if (var_int_a != -1) {
            if (var_int_c >= h.int_a(n) && (var_int_c != h.int_a(n) || Math.abs(System.currentTimeMillis() - this.var_long_a) <= 50L)) return;
            var_boolean_c = true;
        } else {
            var_int_c = 0;
        }
        int n2 = h.int_a(n);
        if (n2 < var_int_c) return;
        var_int_b = n;
        d = n2;
        this.notify();
    }

    public final synchronized void e() {
        if (var_int_a != -1) {
            var_boolean_c = true;
        }
        this.notify();
    }

    public static synchronized boolean boolean_a() {
        return var_int_a != -1;
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (var_javax_microedition_media_Player_arr_a != null && var_int_a != -1 && string.equals("endOfMedia")) {
            this.e();
        }
    }

    static {
        var_int_a = -1;
        var_int_b = -1;
        e = -1;
        var_boolean_c = false;
    }
}