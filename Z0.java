/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.midlet.MIDlet
 */
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Z0
extends MIDlet
implements Runnable {
    private g a;
    public static Thread a;
    public static int b;
    public static Z0 a;
    public static int[] a;
    public static int c;
    public static int d;
    private boolean a = false;

    public static Z0 a() {
        return a;
    }

    public void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        a = this;
        this.a = new g();
        this.a.b();
        Z0.a(this);
    }

    public void startApp() {
        this.b();
        g.a();
    }

    public void pauseApp() {
        this.a.c();
    }

    public void destroyApp(boolean bl) {
        g.d();
        Z0.e();
        this.notifyDestroyed();
    }

    public void run() {
        Z0.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c() {
        Thread thread = a;
        synchronized (thread) {
            while (Thread.currentThread() == a) {
                try {
                    a.wait();
                    if (a == null) continue;
                    if (b != -1) {
                        int n = Z0.a();
                        if (n == -1 || n < 0 || g.a == null || g.a() == n || g.a != null && d < g.aO[n] && g.a.getState() == 400) continue;
                        try {
                            Z0.d();
                            g.a[n].reset();
                            g.a = (int[])Manager.createPlayer((InputStream)g.a[n], (String)g.e[g.aM[n]]);
                            g.a.realize();
                            g.a.prefetch();
                            if (g.aN[n] == -1) {
                                g.aN[n] = -1;
                            }
                            g.a.setLoopCount((int)g.aN[n]);
                            g.a.start();
                            d = g.aO[n];
                        }
                        catch (Exception exception) {
                            Exception exception2 = exception;
                            exception.printStackTrace();
                        }
                        g.ed = n;
                        continue;
                    }
                    Z0.d();
                }
                catch (InterruptedException interruptedException) {
                    InterruptedException interruptedException2 = interruptedException;
                    interruptedException.printStackTrace();
                    continue;
                }
                break;
            }
            return;
        }
    }

    public static void d() {
        if (g.a != null) {
            try {
                g.a.close();
                g.a = null;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                d.a((Exception)exception, (String)"StopSound-3()");
            }
        }
        d = 10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n, int n2) {
        if (n == -1) {
            return;
        }
        Thread thread = a;
        synchronized (thread) {
            b = n;
            Z0.a(n);
            if (n < 30) {
                g.aN[n] = n2;
            }
            a.notifyAll();
            return;
        }
    }

    public static void a(Runnable runnable) {
        a = new Thread(runnable);
        a.start();
    }

    public static void a(int n) {
        if (c >= a.length) {
            return;
        }
        Z0.a[Z0.c++] = n;
    }

    public static int a() {
        if (c - 1 < 0) {
            return -1;
        }
        return a[--c];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e() {
        Thread thread = a;
        Thread thread2 = a;
        synchronized (thread2) {
            a = null;
            thread.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f() {
        if (a != null) {
            c = 0;
            Thread thread = a;
            synchronized (thread) {
                b = -1;
                a.notifyAll();
                return;
            }
        }
    }

    static {
        b = -1;
        a = new int[20];
        c = 0;
        d = 10;
    }
}
