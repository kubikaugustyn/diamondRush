import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class h implements Runnable, PlayerListener {
  public static int a = -1;

  public static int b = true;

  public static int c;

  public static int d;

  public static int e = -1;

  public long a;

  public static Player[] a;

  public static boolean a;

  public static boolean b;

  public static boolean c = false;

  public ByteArrayInputStream a;

  public InputStream a;

  public byte[] a;

  public Thread a = 0L;

  public final void a(int paramInt) {
    if (a == null)
      a = (Thread)new Player[21];
    try {
      int i;
      byte[] arrayOfByte = new byte[i = i.a((byte[])this.a, paramInt * 8 + 4)];
      this.a.read(arrayOfByte);
      this.a = (Thread)new ByteArrayInputStream(arrayOfByte);
      a[paramInt] = (Thread)Manager.createPlayer((InputStream)this.a, "audio/midi");
      a[paramInt].addPlayerListener(this);
      a[paramInt].realize();
      ((VolumeControl)a[paramInt].getControl("VolumeControl")).setLevel(100);
      this.a.close();
      this.a = null;
      System.gc();
      return;
    } catch (Exception exception) {
      return;
    }
  }

  public final void a() {
    b = false;
    this.a = new Thread(this);
    this.a.setPriority(1);
    this.a.start();
  }

  public final void b() {
    if (a == null)
      try {
        this.a = (Thread)getClass().getResourceAsStream("/snd.f");
        this.a.skip(1L);
        this.a = (Thread)new byte[168];
        this.a.read((byte[])this.a);
        return;
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      }
  }

  public final void c() {
    try {
      a = -1;
      e = -1;
      c = false;
      this.a.close();
      this.a = null;
      this.a = null;
      System.gc();
      return;
    } catch (Exception exception) {
      return;
    }
  }

  public final void d() {
    if (a != null) {
      e();
      int i = a.length;
      for (byte b = 0; b < i; b++) {
        if (a[b] != null) {
          a[b].close();
          a[b] = null;
        }
      }
    }
    a = null;
    b = true;
  }

  private static int a(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 4:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
        return 30;
      case 3:
      case 7:
      case 8:
      case 9:
      case 11:
      case 12:
      case 13:
        return 20;
      case 0:
      case 5:
      case 6:
      case 10:
      case 14:
        return 10;
    }
    return 0;
  }

  private static boolean a(int paramInt) {
    switch (paramInt) {
      case 0:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
        return false;
    }
    return true;
  }

  public final synchronized void run() {
    while (!b) {
      try {
        wait();
      } catch (Exception exception) {}
      if (c)
        try {
          if (a(a)) {
            a[a].deallocate();
            e = -1;
          }
          a = -1;
          c = false;
        } catch (Exception exception) {

        } finally {
          c = false;
        }
      if (b != -1)
        try {
          if (e != -1 && b != e) {
            a[e].deallocate();
            e = -1;
          }
          if (e == -1) {
            a[b].prefetch();
            e = b;
          }
          a[b].start();
          a = b;
          c = d;
          this.a = System.currentTimeMillis();
        } catch (Exception exception) {

        } finally {
          b = true;
        }
    }
  }

  public final synchronized void b(int paramInt) {
    if (a != null) {
      if (a != -1) {
        if (c < a(paramInt) || (c == a(paramInt) && Math.abs(System.currentTimeMillis() - this.a) > 50L)) {
          c = true;
        } else {
          return;
        }
      } else {
        c = false;
      }
      int i;
      if ((i = a(paramInt)) >= c) {
        b = paramInt;
        d = i;
        notify();
      }
    }
  }

  public final synchronized void e() {
    if (a != -1)
      c = true;
    notify();
  }

  public static synchronized boolean a() {
    return (a != -1);
  }

  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (a != null && a != -1 && paramString.equals("endOfMedia"))
      e();
  }
}
