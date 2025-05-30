/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ah {
    private Vector a;
    private int[] a;
    int a = 0;
    private static Object a = new Integer(-810759428);
    private static Boolean a;
    private static Boolean b;
    private static final Object b;

    public ah(int n) {
        this.a = n;
    }

    public ah() {
    }

    public final void a(int n) {
        this.a = n;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int n) {
        this.a = 0;
        this.a(0, a);
        this.a(1, n);
    }

    public final void a(int n, Object object) {
        if (n > this.a.size() - 1) {
            this.a.setSize(n + 1);
        }
        this.a.setElementAt(object, n);
    }

    public final void a(Object object) {
        this.a(0, object);
    }

    public final void a(int n, int n2) {
        if (n >= this.a.length) {
            int[] nArray = new int[n + 10];
            for (int i = 0; i < this.a.length; ++i) {
                nArray[i] = this.a[i];
            }
            this.a = nArray;
        }
        if (n >= this.a.size()) {
            this.a.setSize(n + 1);
        }
        this.a.setElementAt(b, n);
        this.a[n] = n2;
    }

    public final void c(int n) {
        this.a(0, n);
    }

    private void a(int n, boolean bl) {
        if (a == null) {
            a = new Boolean(true);
            b = new Boolean(false);
        }
        this.a(n, bl ? a : b);
    }

    public final void a(boolean bl) {
        this.a(0, bl);
    }

    public final boolean a(Object object) {
        return this.a.elementAt(0) == object;
    }

    public final int a(int n) {
        Object e = this.a.elementAt(n);
        if (e == b) {
            return this.a[n];
        }
        if (e instanceof Integer) {
            return (Integer)e;
        }
        throw new ClassCastException("can't get int val of non-int");
    }

    public final int b() {
        return this.a(0);
    }

    public final Object a(int n) {
        Object e = this.a.elementAt(n);
        if (e == b) {
            return new Integer(this.a[n]);
        }
        return e;
    }

    public final Object a() {
        Object e = this.a.elementAt(0);
        if (e == b) {
            return new Integer(this.a[0]);
        }
        return e;
    }

    public final af a() {
        return (af)this.a(0);
    }

    public final int b(int n) {
        Object e = this.a.elementAt(n);
        if (e == a) {
            return 8;
        }
        if (e == b || e instanceof Integer) {
            return 1;
        }
        if (e == ab.a()) {
            return 6;
        }
        if (e == null) {
            return 4;
        }
        if (e instanceof String) {
            return 3;
        }
        if (e instanceof Boolean) {
            return 5;
        }
        if (e instanceof af) {
            return 2;
        }
        return 7;
    }

    public final int c() {
        return this.b(0);
    }

    public final boolean a() {
        Object e = this.a.elementAt(0);
        return e == b || e instanceof Integer;
    }

    public final boolean b() {
        return this.a.elementAt(0) == null;
    }

    private boolean c(int n) {
        Object e = this.a.elementAt(n);
        if (e == b) {
            return this.a[n] != 0;
        }
        if (e == null || e == ab.a()) {
            return false;
        }
        if (e instanceof Integer) {
            return (Integer)e != 0;
        }
        if (e instanceof String) {
            return ((String)e).length() != 0;
        }
        if (e instanceof Boolean) {
            return (Boolean)e;
        }
        return true;
    }

    public final boolean c() {
        return this.c(0);
    }

    public final void d(int n) {
        Object object = this.a.elementAt(0);
        ah ah2 = this;
        switch (ah2.b(0)) {
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return;
            }
            case 7: {
                object = object.toString();
                ah2 = this;
                ah2.a(0, object);
                return;
            }
            case 2: {
                ((af)object).a(this, 1);
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean d() {
        ah ah2 = this;
        switch (ah2.b(0)) {
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return true;
            }
        }
        return false;
    }

    public final int c(int n) {
        block9: while (true) {
            Object object = this.a.elementAt(n);
            switch (this.b(n)) {
                case 1: {
                    return this.a(n);
                }
                case 3: {
                    int n2;
                    object = (String)object;
                    int n3 = 10;
                    object = ((String)object).trim();
                    if (((String)object).length() == 0) {
                        n2 = 0;
                    } else {
                        if (ah.a((String)object)) {
                            try {
                                char c;
                                if (((String)object).charAt(0) == '+' && ((String)object).length() > 1) {
                                    object = ((String)object).substring(1);
                                }
                                if (((String)object).length() > 2 && ((c = ((String)object).charAt(1)) == 'x' || c == 'X')) {
                                    n3 = 16;
                                    object = ((String)object).substring(2);
                                }
                                n2 = Integer.parseInt((String)object, n3);
                            }
                            catch (NumberFormatException numberFormatException) {}
                        }
                        n2 = 0;
                    }
                    this.a(n, n2);
                    return n2;
                }
                case 4: 
                case 6: {
                    this.a(n, 0);
                    return 0;
                }
                case 5: {
                    int n4 = (Boolean)object != false ? 1 : 0;
                    this.a(n, n4);
                    return n4;
                }
                case 2: 
                case 7: {
                    this.d(1);
                    continue block9;
                }
            }
            break;
        }
        throw new RuntimeException();
    }

    public final int d() {
        return this.c(0);
    }

    public final boolean a(int n) {
        if (this.b(n) == 5) {
            return (Boolean)this.a(n);
        }
        boolean bl = this.c(n);
        this.a(n, bl);
        return bl;
    }

    public final af b() {
        byte by;
        ah ah2 = this;
        switch (ah2.b(0)) {
            case 4: 
            case 6: {
                throw new ClassCastException("Type Error - null/undefined cannot be converted to ScriptableObject");
            }
            case 7: {
                Object object = this.a();
                if (object instanceof Vector) {
                    return new ad((Vector)object);
                }
                if (object instanceof Object[]) {
                    return new ad((Object[])object);
                }
                if (object instanceof Hashtable) {
                    return new ad((Hashtable)object);
                }
                throw new ClassCastException("Type Error - value is not a ScriptableObject");
            }
            case 2: {
                return (af)this.a();
            }
            case 1: {
                by = 18;
                break;
            }
            case 3: {
                by = 2;
                break;
            }
            case 5: {
                by = 15;
                break;
            }
            default: {
                throw new ClassCastException("Type Error - unknown type " + this.a().getClass().toString() + " cannot be converted to ScriptableObject");
            }
        }
        int n = 1;
        ah2 = this;
        this.a = n;
        return ad.a(by).a(null, this);
    }

    public final String a(int n) {
        Object e = this.a.elementAt(n);
        switch (this.b(n)) {
            case 4: {
                return "null";
            }
            case 6: {
                return "undefined";
            }
            case 2: 
            case 3: 
            case 5: 
            case 7: {
                return e.toString();
            }
            case 1: {
                if (e == b) {
                    return String.valueOf(this.a[n]);
                }
                return e.toString();
            }
            case 8: {
                return "Subroutine method.";
            }
        }
        throw new RuntimeException();
    }

    public final String b(int n) {
        int n2 = n;
        ah ah2 = this;
        ah2 = ah2.a.elementAt(n2);
        if (ah2 == null) {
            return null;
        }
        return this.a(n);
    }

    public final String toString() {
        return this.a(0);
    }

    public static String a(Object object) {
        if (object == ab.a()) {
            return "undefined";
        }
        if (object == null) {
            return "null";
        }
        return object.toString();
    }

    public final boolean e() {
        return this.a.elementAt(0) != b;
    }

    public final boolean b(int n) {
        return this.a.elementAt(n) != b;
    }

    public final void a(int n, ah ah2, int n2) {
        if (ah2.b(n2)) {
            this.a(n, ah2.a(n2));
            return;
        }
        this.a(n, ah2.a(n2));
    }

    public final void a() {
        this.a.removeAllElements();
    }

    public static final boolean a(String string) {
        if (string.length() <= 0) {
            return false;
        }
        char c = string.charAt(0);
        return Character.isDigit(c) || c == '-' || c == '+';
    }

    static {
        b = new Object();
    }
}
