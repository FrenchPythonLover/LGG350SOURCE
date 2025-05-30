/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class af {
    private Hashtable a = null;
    private static Object a = new Object();

    af() {
    }

    public String a_() {
        return "Object";
    }

    public boolean a(ah ah2, String string) {
        if (this.a == null || !this.a.containsKey(string)) {
            af af2 = this.a();
            if (af2 != null) {
                return af2.a(ah2, string);
            }
            ah2.a(ab.a());
            return false;
        }
        Object v = this.a.get(string);
        if (v instanceof int[]) {
            ah2.c(((int[])v)[0]);
        } else if (v == a) {
            ah2.a(null);
        } else {
            ah2.a(v);
        }
        return true;
    }

    public boolean b(ah ah2, int n) {
        return this.a(ah2, String.valueOf(n));
    }

    public final boolean c(ah ah2, String string) {
        if (this.a == null) {
            return false;
        }
        if ((string = this.a.get(string)) instanceof int[]) {
            ah2.c(((int[])string)[0]);
        } else if (string == a) {
            ah2.a(null);
        } else {
            ah2.a(string);
        }
        return string != null;
    }

    public void b(ah ah2, af af2, String string, ah ah3) {
        af af3;
        if (af2 == null) {
            af2 = this;
        }
        if (this.c(ah2, string)) {
            af3 = (af)ah2.a();
            if (!af3.a()) {
                throw new ClassCastException();
            }
            if (af2 == null) {
                af2 = this;
            }
            af3.a(ah2, af2, ah3);
        }
        if ((af3 = this.a()) != null) {
            af3.b(ah2, af2, string, ah3);
        }
        throw new RuntimeException("no such method " + string);
    }

    public boolean d(ah ah2, String string) {
        if (this.a != null && this.a.containsKey(string)) {
            return true;
        }
        af af2 = this.a();
        if (af2 != null) {
            return af2.d(ah2, string);
        }
        return false;
    }

    public boolean c(ah ah2, int n) {
        return this.d(ah2, String.valueOf(n));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a_(String string, Object object) {
        if (this.a == null) {
            this.a = new Hashtable();
        }
        if (object instanceof ah) {
            object = (ah)object;
            Object v = this.a.get(string);
            if (v instanceof int[] && ((ah)object).a()) {
                ((int[])v)[0] = ((ah)object).b();
                return;
            }
            if (!((ah)object).e()) {
                int[] nArray = new int[1];
                int[] nArray2 = nArray;
                nArray[0] = ((ah)object).b();
                this.a.put(string, nArray2);
                return;
            }
            if ((object = ((ah)object).a()) == null) {
                object = a;
            }
            this.a.put(string, object);
            return;
        }
        if (object == null) {
            object = a;
        }
        this.a.put(string, object);
    }

    public void a(int n, Object object) {
        this.a_(String.valueOf(n), object);
    }

    public boolean a(String string) {
        if (this.a != null) {
            return this.a.remove(string) != null;
        }
        return false;
    }

    public boolean a(int n) {
        return this.a(String.valueOf(n));
    }

    public af a() {
        if (this.a == null) {
            return null;
        }
        return (af)this.a.get("__proto__");
    }

    public final String[] a() {
        Vector vector = this.a((ah)null, (Vector)null);
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public Vector a(ah ah2, Vector vector) {
        Object object;
        if (vector == null) {
            vector = new Vector<String>();
        }
        if (ah2 == null) {
            ah2 = new ah();
        }
        int n = vector.size() - 1;
        if (this.a != null) {
            object = this.a.keys();
            while (object.hasMoreElements()) {
                String string = (String)object.nextElement();
                if (!this.b(ah2, string) || n >= 0 && vector.lastIndexOf(string) >= 0) continue;
                vector.addElement(string);
            }
        }
        if ((object = this.a()) != null) {
            ((af)object).a(ah2, vector);
        }
        return vector;
    }

    boolean b(ah ah2, String string) {
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(": {");
        if (this.a != null) {
            Enumeration enumeration = this.a.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                stringBuffer.append(string);
                stringBuffer.append(":");
                stringBuffer.append(this.a.get(string).toString());
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public final void a(ah ah2, int n) {
        String string = n == 1 ? "valueOf" : "toString";
        if (!this.d(ah2, string)) {
            ah2.a(this.toString());
            return;
        }
        try {
            this.b(ah2, null, string, null);
        }
        catch (Exception exception) {
            throw new ClassCastException("Type error");
        }
        if (ah2.d()) {
            return;
        }
        string = n == 1 ? "toString" : "valueOf";
        try {
            this.b(ah2, null, string, null);
        }
        catch (Exception exception) {
            throw new ClassCastException("Type error");
        }
        if (ah2.d()) {
            return;
        }
        throw new ClassCastException("Type error - nonprimitive");
    }

    public void a(ah ah2, af af2, ah ah3) {
        throw new Error();
    }

    public af a(ah ah2, ah ah3) {
        throw new Error();
    }

    public boolean a(ah ah2, Object object) {
        throw new Error();
    }

    public boolean a() {
        return false;
    }

    public final Hashtable a() {
        Enumeration enumeration = this.a.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            Object v = this.a.get(string);
            if (!(v instanceof int[]) || ((int[])v).length != 1) continue;
            this.a.put(string, new Integer(((int[])v)[0]));
        }
        return this.a;
    }

    final void a(Hashtable hashtable) {
        this.a = hashtable;
    }
}
