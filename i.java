/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;

public final class i {
    private static Hashtable a = new Hashtable();

    public static void a(String string, f f2) {
        if (string == null || f2 == null) {
            return;
        }
        a.put(string, f2);
    }

    public static f a(Object object) {
        if (!a.containsKey(object)) {
            return null;
        }
        if ((object = (f)a.get(object)) == null) {
            return null;
        }
        return object;
    }

    public static String a() {
        Enumeration<Object> enumeration = a.elements();
        Object object = "";
        while (enumeration.hasMoreElements()) {
            f f2 = (f)enumeration.nextElement();
            if (f2 == null) continue;
            StringBuffer stringBuffer = new StringBuffer().append((String)object).append(" ");
            object = f2;
            object = stringBuffer.append(((f)object).c).toString();
        }
        enumeration = q.b.keys();
        while (enumeration.hasMoreElements()) {
            object = (String)object + " " + enumeration.nextElement();
        }
        return object;
    }
}
