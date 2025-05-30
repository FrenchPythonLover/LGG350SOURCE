/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b {
    f[] a;
    int a;
    int b;
    int c;
    int d;

    public b() {
    }

    public static byte[] a(Object object) {
        if (object instanceof Vector) {
            object = (Vector)object;
            e e2 = new e();
            e2.a((Vector)object);
            return e2.toByteArray();
        }
        if (object instanceof Hashtable) {
            object = (Hashtable)object;
            e e3 = new e();
            e3.a((Hashtable)object);
            return e3.toByteArray();
        }
        return new byte[]{0};
    }

    public static Object a(byte[] object) {
        d d2 = new d(object);
        object = d2;
        return d2.a();
    }

    public static void a(InputStream object, aa object2) {
        object = new d((InputStream)object);
        object.read();
        int n2 = object.a();
        b b2 = new b(n2);
        object2 = new c(n2, (aa)object2, b2);
        object2 = new Thread((Runnable)object2);
        ((Thread)object2).start();
        Thread.sleep(500L);
        for (int i = 0; i < n2; ++i) {
            int n3 = object.read();
            if (n3 != 4) {
                throw new RuntimeException("Expected an MMF part, got a " + n3);
            }
            f f2 = object.a();
            b2.a(f2);
        }
        ((Thread)object2).join();
    }

    private b(int n2) {
        this.a = n2 > 0 ? n2 : 1;
        this.a = new f[this.a];
        this.c = 0;
        this.d = 0;
        this.b = 0;
    }

    public synchronized boolean a() {
        return this.b == this.a;
    }

    public synchronized void a(f f2) {
        while (this.a()) {
            this.wait();
        }
        this.a[this.c] = f2;
        this.c = (this.c + 1) % this.a;
        ++this.b;
        this.notifyAll();
    }

    public synchronized f a() {
        while (this.b == 0) {
            this.wait();
        }
        f f2 = this.a[this.d];
        this.a[this.d] = null;
        this.d = (this.d + 1) % this.a;
        --this.b;
        this.notifyAll();
        return f2;
    }
}
