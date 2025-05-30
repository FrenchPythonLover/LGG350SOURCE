/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k {
    public static Vector a = new Vector();
    private static volatile int a = 0;
    private static volatile int b = 0;
    private static volatile int c = 2;
    private static Class a;

    public static n a(n n2) {
        if (n2 == null) {
            return null;
        }
        if (a == c || n2.a_()) {
            throw new m("Those bunch of of requests are cancelling");
        }
        a.addElement(n2);
        return n2;
    }

    public static n a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return k.a(new o(inputStream));
    }

    public static void a(n n2) {
        if (n2 == null) {
            return;
        }
        a.removeElement(n2);
    }

    public static boolean a() {
        return a == c;
    }

    public static boolean b() {
        return a.size() > 0 && q.a != null;
    }

    public static void b(n n2) {
        if (a.size() <= 0 || a == c) {
            return;
        }
        Class clazz = a == null ? (a = k.a("k")) : a;
        synchronized (clazz) {
            if (a.size() <= 0 || a == c) {
                return;
            }
            a = c;
        }
        new Thread(new l()).start();
        try {
            n2.a();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static int a(int n2) {
        a = n2;
        return a;
    }

    static int a() {
        return 0;
    }
}
