/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ab
extends ag {
    private static Object a = new Object();
    public static boolean a = false;
    private static af a;
    private long a;
    private static ah a;
    public static int a;
    private String a;
    private byte[] a;
    private int b;
    private Vector a;
    private int c;
    private int d;
    private String b;
    private int e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private Vector b;
    private int[] a = new Vector();

    public static void a() {
        a = null;
    }

    public ab(byte[] byArray) {
        this.b = new Vector();
        this.a = new int[20];
    }

    public static final Object a() {
        return a;
    }

    private static void a(ah ah2) {
        ah2.a(a);
        a = ah2;
    }

    public final synchronized void a(ah ah2, String string, ah ah3) {
        this.a(ah2, null, string, ah3);
    }

    public final synchronized void a(ah ah2, af af2, String string, ah ah3) {
        int n = this.b(string);
        if (n < 0) {
            throw new RuntimeException("no function named " + string);
        }
        this.a(ah2, af2, n, ah3, null);
    }

    private int b(String string) {
        ac ac2;
        Object var2_2 = null;
        int n = -1;
        for (int i = 0; i < this.a.size() && (n = ac.a(ac2 = (ac)this.a.elementAt(i), string)) < 0; ++i) {
        }
        return n;
    }

    final synchronized void a(ah ah2, af af2, int n, ah ah3, Object[] object) {
        int n2 = this.e;
        this.e = n;
        n = 0;
        if (object != null) {
            n = ((Object[])object).length;
            Object[] objectArray = object;
            object = this;
            int n3 = objectArray.length;
            for (int i = 0; i < n3; ++i) {
                super.a(objectArray[i]);
            }
        }
        if (ah3 != null) {
            n += ah3.a;
            for (int i = 0; i < ah3.a; ++i) {
                if (ah3.b(i)) {
                    this.a(ah3.a(i));
                    continue;
                }
                this.b(ah3.a(i));
            }
        }
        this.a(n, n2, af2);
        this.d(ah2);
    }

    public final synchronized boolean a(ah ah2, int n) {
        switch (n) {
            case -4: {
                ah2.a(ad.a((byte)1));
                return true;
            }
            case -2: {
                ah2.a(ad.a((byte)4));
                return true;
            }
            case -53: {
                ah2.a(ad.a((byte)15));
                return true;
            }
            case -54: {
                ah2.a(ad.a((byte)18));
                return true;
            }
            case -5: {
                ah2.a(ad.a((byte)2));
                return true;
            }
            case -1: {
                ah2.a(ad.a((byte)3));
                return true;
            }
            case -57: {
                ah2.a(ad.a((byte)21));
                return true;
            }
            case -59: {
                ah2.a(ad.a((byte)27));
                return true;
            }
            case -58: {
                ah2.a(ad.a((byte)24));
                return true;
            }
            case -385: {
                ah2.a(ad.a((byte)30));
                return true;
            }
            case -3: {
                if (ad.t == null) {
                    ad.t = new ad(10);
                }
                ah2.a(ad.t);
                return true;
            }
            case -400: {
                if (ad.u == null) {
                    ad.u = new ad(33);
                }
                ah2.a(ad.u);
                return true;
            }
            case -51: {
                ah2.a(ag.b);
                return true;
            }
            case -52: {
                ah2.a(a);
                return true;
            }
            case -381: {
                ah2.c((int)(System.currentTimeMillis() - this.a));
                return true;
            }
            case -397: 
            case -396: 
            case -376: 
            case -60: {
                ah2.a(ag.b);
                return true;
            }
            case -384: {
                ah2.a(this.a);
                return true;
            }
            case -395: {
                if (a == null) {
                    a = new ad(1);
                }
                ah2.a(a);
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean a(int n, boolean bl, Object object, int n2) {
        switch (n) {
            case -384: {
                this.a = (String)object;
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean a(ah object, af object2, int n, ah ah2) {
        switch (n) {
            case -51: {
                int n2;
                object2 = ah2.a(0);
                n = 10;
                if (ah2.a > 1) {
                    ah2.c(1);
                    n = ah2.a(1);
                }
                if ((n2 = ((String)object2).length()) > 0 && ((String)object2).charAt(0) == '+') {
                    object2 = ((String)object2).substring(1);
                }
                if (((String)object2).length() > 1) {
                    n2 = ((String)object2).charAt(1);
                    if (ah2.a < 2 && ((String)object2).charAt(0) == '0' && n2 == 120 || n2 == 88) {
                        n = 16;
                        object2 = ((String)object2).substring(2);
                    }
                }
                try {
                    ((ah)object).c(Integer.parseInt((String)object2, n));
                }
                catch (NumberFormatException numberFormatException) {
                    ((ah)object).a(a);
                }
                return true;
            }
            case -60: {
                ah ah3 = object;
                int n3 = ah2.a(0);
                object = this;
                ad ad2 = new ad(32);
                new ad(32).a = object;
                ad2.a_("pc", new Integer(n3));
                ah3.a(ad2);
                return true;
            }
            case -376: {
                object2 = this.a(this.e);
                ah ah4 = object;
                object = object2;
                int n4 = ah2.a(0) + ((ac)object).c;
                int n5 = ah2.a(1);
                ah2 = ah2.a > 2 ? (Object[])ah2.a(2) : null;
                n = n5;
                int n6 = n4;
                object = this;
                ad ad3 = new ad(4);
                new ad(4).a = ad.b((byte)4);
                ad3.a = object;
                ad3.a_("pc", new Integer(n6));
                ad3.a_("length", new Integer(n));
                ad3.a_("prototype", new ad(1));
                if (ah2 != null) {
                    ad3.a_("__closureArgs__", ah2);
                }
                ah4.a(ad3);
                return true;
            }
            case -397: 
            case -396: {
                if (!this.a((ah)object, "Page")) {
                    throw new RuntimeException("no Page defined");
                }
                object2 = ((ah)object).a();
                ((af)object2).b((ah)object, (af)object2, "getValue", ah2);
                return true;
            }
        }
        throw new RuntimeException("no global method " + n);
    }

    private ac a(int n) {
        ac ac2 = null;
        for (int i = 0; i < this.a.size(); ++i) {
            ac ac3 = ac2 = (ac)this.a.elementAt(i);
            if (ac2.c <= n) continue;
            return (ac)this.a.elementAt(i - 1);
        }
        return ac2;
    }

    public final void a(byte[] object) {
        byte[] byArray = object;
        ah ah2 = new ah();
        object = this;
        if (byArray != null) {
            ac ac2 = new ac((ab)object, byArray);
            byte[] byArray2 = new byte[((ab)object).a.length + byArray.length];
            System.arraycopy(((ab)object).a, 0, byArray2, 0, ((ab)object).a.length);
            System.arraycopy(byArray, 0, byArray2, ((ab)object).a.length, byArray.length);
            ((ab)object).a = byArray2;
            ((ab)object).a.addElement(ac2);
            int n = ac.a(ac2, "$MAIN$");
            if (n >= 0) {
                if (ah2 == null) {
                    ah2 = new ah();
                }
                ((ab)object).a(ah2, null, n, null, null);
            }
        }
    }

    private int a(byte[] byArray, int n) {
        if (n + 3 > this.b - 1) {
            throw new RuntimeException("access illegal offset");
        }
        return (byArray[n] & 0xFF) << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    private final Object b() {
        return this.b;
    }

    private String b() {
        int n = this.g;
        int n2 = this.h;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append((String)this.b.elementAt(this.h + 6));
            stringBuffer.append('@');
            stringBuffer.append(a);
            while (n >= 0) {
                stringBuffer.append('\n');
                n = this.a[n2 + 4];
                n2 = this.a[n2 + 2];
                stringBuffer.append((String)this.b.elementAt(n2 + 7));
                stringBuffer.append('+');
                stringBuffer.append(this.a[n2 + 7 + 1]);
            }
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        return stringBuffer.toString();
    }

    private final void b() {
        this.b(this.h - this.g);
    }

    private void a(Object object) {
        ++this.f;
        this.b.setSize(this.f + 1);
        this.b.setElementAt(object, this.f);
    }

    private final void a(int n) {
        if (this.a.length - 1 > n) {
            return;
        }
        n = (n << 5) + (n << 6) >> 6;
        int[] nArray = new int[n];
        for (int i = 0; i < this.a.length; ++i) {
            nArray[i] = this.a[i];
        }
        this.a = nArray;
    }

    private void b(int n) {
        ab ab2 = this;
        this.a(ab2.b);
        if (this.f > this.a.length - 1) {
            this.a(this.f);
        }
        this.a[this.f] = n;
    }

    private final void b(ah ah2) {
        if (ah2.e()) {
            this.a(ah2.a());
            return;
        }
        this.b(ah2.b());
    }

    private final void a(int n, ah ah2) {
        for (int i = n - 1; i >= 0; --i) {
            if (this.f < 0) {
                throw new RuntimeException("pop of empty stack");
            }
            Object e = this.b.elementAt(this.f);
            ab ab2 = this;
            if (e == ab2.b) {
                ah2.a(i, this.a[this.f]);
            } else {
                ah2.a(i, e);
            }
            --this.f;
        }
        ah2.a = n;
    }

    private final void c(int n) {
        n = this.h + 7 + n;
        Object object = this.b.elementAt(this.f);
        this.b.setElementAt(object, n);
        Object e = object;
        object = this;
        if (e == ((ab)object).b) {
            this.a[n] = this.a[this.f];
        }
        --this.f;
    }

    private final void d(int n) {
        n = this.f - n;
        Object e = this.b.elementAt(n);
        ab ab2 = this;
        if (e == ab2.b) {
            this.b(this.a[n]);
            return;
        }
        this.a(e);
    }

    private final void e(int n) {
        n = this.f - n;
        Object e = this.b.elementAt(n);
        this.a(n);
        int n2 = this.a[n];
        this.b.setElementAt(this.b.elementAt(this.f), n);
        this.a[n] = this.a[this.f];
        this.b.setElementAt(e, this.f);
        this.a[this.f] = n2;
    }

    private final void c() {
        if (this.f < 0) {
            throw new RuntimeException("pop of empty stack");
        }
        this.b.setElementAt(null, this.f);
        --this.f;
    }

    private final Object c() {
        if (this.f < 0) {
            throw new RuntimeException("pop of empty stack");
        }
        Object object = this.b.elementAt(this.f);
        ab ab2 = this;
        if (object == ab2.b) {
            object = new Integer(this.a[this.f]);
        }
        --this.f;
        return object;
    }

    private final int a() {
        if (this.f < 0) {
            throw new RuntimeException("pop of empty stack");
        }
        Object e = this.b.elementAt(this.f);
        ab ab2 = this;
        int n = e != ab2.b ? (Integer)e : this.a[this.f];
        --this.f;
        return n;
    }

    private final void c(ah ah2) {
        if (this.f < 0) {
            throw new RuntimeException("pop of empty stack");
        }
        Object e = this.b.elementAt(this.f);
        ab ab2 = this;
        if (e == ab2.b) {
            ah2.c(this.a[this.f]);
        } else {
            ah2.a(e);
        }
        --this.f;
    }

    private final int b() {
        if (this.i < 0) {
            return -1;
        }
        while (this.f > this.i) {
            this.b.setElementAt(null, this.f--);
        }
        int n = this.a();
        this.g = this.a();
        this.i = this.a();
        this.h = this.a();
        return n;
    }

    private final void f(int n) {
        this.b(this.h);
        this.b(this.i);
        this.b(this.g);
        this.b(n);
        this.i = this.f;
    }

    private final void a(int n, int n2, af af2) {
        int n3 = this.f;
        this.a((Object)null);
        this.b(this.h);
        this.b(this.i);
        this.b(this.g);
        this.b(n2);
        this.a(af2);
        this.h = n3;
        this.g = this.h - n;
    }

    private final int c() {
        this.f = this.g;
        this.e = this.a[this.h + 5];
        this.g = this.a[this.h + 4];
        this.i = this.a[this.h + 3];
        this.h = this.a[this.h + 2];
        return this.e;
    }

    private final af b() {
        return (af)this.b.elementAt(this.h + 6);
    }

    private final int a(int n) {
        n = this.h + 7 + n;
        Object e = this.b.elementAt(n);
        Object object = e;
        object = this;
        if (e == ((ab)object).b) {
            return this.a[n];
        }
        return (Integer)this.b.elementAt(n);
    }

    private final void a(ah ah2, int n, int n2) {
        n = this.h + 7 + n;
        Object e = this.b.elementAt(n);
        this.a(n);
        ab ab2 = this;
        if (e == ab2.b) {
            int n3 = n;
            this.a[n3] = this.a[n3] + n2;
            return;
        }
        ah2.a(e);
        this.a[n] = ah2.d() + n2;
        ab2 = this;
        this.b.setElementAt(ab2.b, n);
    }

    private final void g(int n) {
        n = this.h + 7 + n;
        Object e = this.b.elementAt(n);
        ab ab2 = this;
        if (e == ab2.b) {
            this.b(this.a[n]);
            return;
        }
        this.a(e);
    }

    private final Object a(int n) {
        int n2 = this.h - this.g;
        int n3 = this.g + 1 + n;
        if (n3 <= this.h) {
            Object object = this.b.elementAt(n3);
            ab ab2 = this;
            if (object == ab2.b) {
                object = new Integer(this.a[n3]);
            }
            return object;
        }
        Vector vector = (Vector)this.b.elementAt(this.h + 1);
        if (vector == null || n - n2 >= vector.size()) {
            return a;
        }
        return vector.elementAt(n - n2);
    }

    private final void h(int n) {
        int n2 = this.h - this.g;
        int n3 = this.g + 1 + n;
        if (n3 > this.h) {
            Vector vector = (Vector)this.b.elementAt(this.h + 1);
            if (vector == null || n - n2 >= vector.size()) {
                this.a(a);
                return;
            }
            this.a(vector.elementAt(n - n2));
            return;
        }
        Object e = this.b.elementAt(n3);
        ab ab2 = this;
        if (e == ab2.b) {
            this.b(this.a[n3]);
            return;
        }
        this.a(e);
    }

    private final void b(int n, Object object) {
        int n2 = this.h - this.g;
        int n3 = this.g + 1 + n;
        if (n3 > this.h) {
            Vector<Object> vector = (Vector<Object>)this.b.elementAt(this.h + 1);
            if (vector == null) {
                vector = new Vector<Object>();
                this.b.setElementAt(vector, this.h + 1);
            }
            n -= n2;
            for (n2 = 0; n2 <= n; ++n2) {
                if (n2 < vector.size()) continue;
                vector.setSize(n2 + 1);
                vector.setElementAt(a, n2);
            }
            vector.setElementAt(object, n);
            return;
        }
        this.b.setElementAt(object, n3);
    }

    private final int d() {
        Object e = this.b.elementAt(this.f);
        ab ab2 = this;
        if (e == ab2.b) {
            return this.a[this.f];
        }
        return (Integer)e;
    }

    private static int a(ah ah2, ah ah3) {
        ah2.d(1);
        ah3.d(1);
        if (ah2.c() == 3 && ah3.c() == 3) {
            return ah2.a().toString().compareTo(ah3.a().toString());
        }
        ah2.d();
        ah3.d();
        return ah2.b() - ah3.b();
    }

    public static boolean a(ah ah2, ah ah3) {
        int n = ah2.c();
        if (n != ah3.c()) {
            return false;
        }
        switch (n) {
            case 4: 
            case 6: {
                return true;
            }
            case 1: {
                return ah2.b() == ah3.b();
            }
            case 3: {
                return 0 == ((String)ah2.a()).compareTo((String)ah3.a());
            }
            case 5: {
                return ((Boolean)ah2.a()).booleanValue() == ((Boolean)ah3.a()).booleanValue();
            }
        }
        return ah2.a() == ah3.a();
    }

    private static boolean b(ah ah2, ah ah3) {
        while (true) {
            int n;
            int n2;
            if ((n2 = ah2.c()) == (n = ah3.c())) {
                switch (n2) {
                    case 4: 
                    case 6: {
                        return true;
                    }
                    case 1: {
                        return ah2.b() == ah3.b();
                    }
                    case 3: {
                        return 0 == ((String)ah2.a()).compareTo((String)ah3.a());
                    }
                    case 5: {
                        return ((Boolean)ah2.a()).booleanValue() == ((Boolean)ah3.a()).booleanValue();
                    }
                }
                return ah2.a() == ah3.a();
            }
            if (n2 == 4 && n == 6 || n == 4 && n2 == 6) {
                return true;
            }
            if (n2 == 1 && n == 3) {
                ah3.d();
                continue;
            }
            if (n == 1 && n2 == 3) {
                ah2.d();
                continue;
            }
            if (n2 == 5) {
                ah2.d();
                continue;
            }
            if (n == 5) {
                ah3.d();
                continue;
            }
            if (!(n2 != 1 && n2 != 3 || n != 7 && n != 2)) {
                ah3.d(1);
                continue;
            }
            if (n != 1 && n != 3 || n2 != 7 && n2 != 2) break;
            ah2.d(1);
        }
        return false;
    }

    private static void a(ah ah2, ah ah3) {
        ah2.d(1);
        ah3.d(1);
        if (ah2.c() == 3 || ah3.c() == 3) {
            ah2.a(ah2.toString() + ah3.toString());
            return;
        }
        ah2.d();
        ah3.d();
        ah2.c(ah2.b() + ah3.b());
    }

    public final boolean a(ah ah2, String string) {
        if (super.a(ah2, string)) {
            return true;
        }
        int n = this.b(string);
        if (n >= 0) {
            ah ah3 = new ah();
            ah3.b(n);
            ah2.a(ah3);
            return true;
        }
        return false;
    }

    private synchronized void d(ah ah2) {
        Object object;
        int n = this.g;
        if (a != null) {
            object = a;
            a = (ah)((ah)object).a();
        } else {
            object = new ah();
        }
        ah ah3 = object;
        ah ah4 = ah2;
        int n2 = ac.a(this.a(this.e));
        block145: while (true) {
            Object object2;
            try {
                block146: while (true) {
                    int n3 = n2;
                    Object object3 = this;
                    this.d = 0;
                    ((ab)object3).b = null;
                    int n4 = ((ab)object3).e + n3;
                    Object object4 = ((ab)object3).a;
                    v0.c = object4[n4];
                    switch (((ab)object3).c) {
                        case 3: 
                        case 46: 
                        case 48: 
                        case 49: 
                        case 50: 
                        case 51: 
                        case 52: 
                        case 53: 
                        case 54: 
                        case 55: 
                        case 56: 
                        case 57: 
                        case 58: 
                        case 74: 
                        case 122: 
                        case 125: 
                        case 126: {
                            ((ab)object3).e += 2;
                            ((ab)object3).d = object4[n4 + 1];
                            break;
                        }
                        case 16: 
                        case 23: 
                        case 30: 
                        case 31: 
                        case 32: 
                        case 78: 
                        case 80: 
                        case 90: 
                        case 111: 
                        case 116: 
                        case 117: {
                            ((ab)object3).e += 2;
                            ((ab)object3).d = object4[n4 + 1] & 0xFF;
                            break;
                        }
                        case 13: 
                        case 39: 
                        case 40: 
                        case 41: 
                        case 42: 
                        case 43: 
                        case 44: 
                        case 47: 
                        case 121: 
                        case 123: {
                            ((ab)object3).e += 3;
                            ((ab)object3).d = object4[n4 + 1] << 8 | object4[n4 + 2] & 0xFF;
                            break;
                        }
                        case 2: 
                        case 45: 
                        case 1103: {
                            ((ab)object3).e += 5;
                            ((ab)object3).d = (object4[n4 + 1] & 0xFF) << 24 | (object4[n4 + 2] & 0xFF) << 16 | (object4[n4 + 3] & 0xFF) << 8 | object4[n4 + 4] & 0xFF;
                            break;
                        }
                        case 1: 
                        case 88: 
                        case 89: {
                            ((ab)object3).e += 3;
                            ((ab)object3).d = (object4[n4 + 1] & 0xFF) << 8 | object4[n4 + 2] & 0xFF;
                            ((ab)object3).b = ac.a(super.a(((ab)object3).e), ((ab)object3).d);
                            break;
                        }
                        case 124: {
                            ((ab)object3).e += 2;
                            ((ab)object3).d = object4[n4 + 1] & 0xFF;
                            ((ab)object3).b = ac.a(super.a(((ab)object3).e), ((ab)object3).d);
                            break;
                        }
                        case 11: 
                        case 12: 
                        case 14: 
                        case 15: 
                        case 22: 
                        case 29: 
                        case 38: 
                        case 59: 
                        case 60: 
                        case 61: 
                        case 62: 
                        case 63: 
                        case 64: 
                        case 65: 
                        case 66: 
                        case 67: 
                        case 68: 
                        case 69: 
                        case 70: 
                        case 71: 
                        case 72: 
                        case 73: 
                        case 75: 
                        case 76: 
                        case 77: 
                        case 79: 
                        case 81: 
                        case 82: 
                        case 83: 
                        case 84: 
                        case 85: 
                        case 86: 
                        case 87: 
                        case 91: 
                        case 92: 
                        case 93: 
                        case 94: 
                        case 95: 
                        case 96: 
                        case 97: 
                        case 98: 
                        case 99: 
                        case 100: 
                        case 101: 
                        case 102: 
                        case 103: 
                        case 104: 
                        case 105: 
                        case 106: 
                        case 107: 
                        case 112: 
                        case 113: 
                        case 114: 
                        case 115: 
                        case 118: 
                        case 119: 
                        case 120: {
                            ++((ab)object3).e;
                            break;
                        }
                        case 4: {
                            ++((ab)object3).e;
                            ((ab)object3).d = -1;
                            break;
                        }
                        case 5: 
                        case 17: 
                        case 24: 
                        case 33: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 0;
                            break;
                        }
                        case 6: 
                        case 18: 
                        case 25: 
                        case 34: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 1;
                            break;
                        }
                        case 7: 
                        case 19: 
                        case 26: 
                        case 35: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 2;
                            break;
                        }
                        case 8: 
                        case 20: 
                        case 27: 
                        case 36: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 3;
                            break;
                        }
                        case 9: 
                        case 21: 
                        case 28: 
                        case 37: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 4;
                            break;
                        }
                        case 10: {
                            ++((ab)object3).e;
                            ((ab)object3).d = 10;
                            break;
                        }
                        default: {
                            throw new RuntimeException("bad opcode " + new Integer(((ab)object3).c));
                        }
                    }
                    switch (this.c) {
                        case 1: 
                        case 124: {
                            this.a((Object)this.b);
                            continue block146;
                        }
                        case 2: 
                        case 123: {
                            int n5 = this.d;
                            object3 = this.a(this.e);
                            if (n5 > ((ac)object3).b - 1 || n5 < 0) {
                                throw new RuntimeException("bad int constant number");
                            }
                            this.b(ab.c(((ac)object3).a, ((ac)object3).a + (n5 << 2)));
                            continue block146;
                        }
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: {
                            this.b(this.d);
                            continue block146;
                        }
                        case 11: {
                            this.a((Object)null);
                            continue block146;
                        }
                        case 12: {
                            int n6;
                            object3 = this;
                            Object e = ((ab)object3).b.elementAt(((ab)object3).f);
                            object4 = e;
                            if (e == super.b()) {
                                object4 = new Integer(((ab)object3).a[((ab)object3).f]);
                            }
                            Object object5 = object4;
                            if (a > 0) {
                                System.err.println("throw at line " + a);
                                object4 = this.b();
                                if (object4 != null) {
                                    System.err.println("backtrace:");
                                    System.err.println((String)object4);
                                }
                            }
                            if (this.i <= n || (n6 = this.b()) == -1) {
                                throw new ae(object5);
                            }
                            if (object5 instanceof ae) {
                                object5 = ((ae)object5).a();
                            }
                            this.e = n6;
                            this.a(object5);
                            continue block146;
                        }
                        case 13: {
                            this.f(this.e + this.d);
                            continue block146;
                        }
                        case 14: {
                            this.b();
                            continue block146;
                        }
                        case 15: {
                            this.b();
                            continue block146;
                        }
                        case 16: 
                        case 17: 
                        case 18: 
                        case 19: 
                        case 20: 
                        case 21: {
                            this.h(this.d);
                            continue block146;
                        }
                        case 22: {
                            this.a(this.a(this.a()));
                            continue block146;
                        }
                        case 23: 
                        case 24: 
                        case 25: 
                        case 26: 
                        case 27: 
                        case 28: {
                            this.g(this.d);
                            continue block146;
                        }
                        case 29: {
                            this.g(this.a());
                            continue block146;
                        }
                        case 30: {
                            this.a(ah3, this.d, 1);
                            continue block146;
                        }
                        case 31: {
                            this.a(ah3, this.d, -1);
                            continue block146;
                        }
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                        case 36: 
                        case 37: {
                            this.c(this.d);
                            continue block146;
                        }
                        case 38: {
                            Object object6 = this.c();
                            object4 = object6;
                            if (object6 == ab.a()) {
                                System.out.print("undefined");
                                continue block145;
                            }
                            System.out.print(object4);
                            continue block146;
                        }
                        case 39: {
                            this.a(0, this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 40: {
                            this.a(1, this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 41: {
                            this.a(2, this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 42: {
                            this.a(3, this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 43: {
                            this.a(4, this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 44: {
                            this.a(this.a(), this.e, null);
                            this.e += this.d;
                            continue block146;
                        }
                        case 45: {
                            this.e = this.d;
                            continue block146;
                        }
                        case 46: 
                        case 47: {
                            this.e += this.d;
                            continue block146;
                        }
                        case 48: {
                            this.c(ah3);
                            if (!ah3.a() || ah3.b() != 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 49: {
                            this.c(ah3);
                            if (!ah3.a() || ah3.b() <= 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 50: {
                            this.c(ah3);
                            if (!ah3.a() || ah3.b() >= 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 51: {
                            this.c(ah3);
                            if (!ah3.a() || ah3.b() < 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 52: {
                            this.c(ah3);
                            if (!ah3.a() || ah3.b() > 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 53: {
                            this.c(ah3);
                            if (ah3.a() && ah3.b() == 0) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 54: {
                            this.c(ah3);
                            if (!ah3.b()) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 55: {
                            this.c(ah3);
                            if (ah3.b()) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 56: {
                            this.c(ah3);
                            if (!ah3.c()) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 57: {
                            this.c(ah3);
                            if (ah3.c()) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 58: {
                            this.c(ah3);
                            if (ah3.c() != 6) continue block145;
                            this.e += this.d;
                            continue block146;
                        }
                        case 59: {
                            object3 = this.c();
                            this.b(this.c().toString().compareTo(object3.toString()));
                            continue block146;
                        }
                        case 60: {
                            this.c(ah4);
                            this.c(ah3);
                            this.b(ab.a(ah3, ah4));
                            ah4.a(null);
                            continue block146;
                        }
                        case 61: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.a(ab.a(ah3, ah4));
                            this.b(ah3);
                            ah4.a(null);
                            continue block146;
                        }
                        case 62: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.a(ab.b(ah3, ah4));
                            this.b(ah3);
                            ah4.a(null);
                            continue block146;
                        }
                        case 63: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() * ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 64: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() / ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 65: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() - ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 66: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() + ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 67: {
                            object3 = this.c();
                            this.a((Object)(this.c().toString() + object3.toString()));
                            continue block146;
                        }
                        case 68: {
                            this.c(ah4);
                            this.c(ah3);
                            ab.a(ah3, ah4);
                            this.b(ah3);
                            ah4.a(null);
                            continue block146;
                        }
                        case 69: {
                            int n7 = this.a();
                            this.a(n7, ah4);
                            object2 = (af)this.c();
                            object4 = null;
                            n4 = -1;
                            try {
                                ah ah5;
                                Object object7 = this.c();
                                object4 = object7;
                                if (object7 instanceof ah && (ah5 = (ah)object4).c() == 8) {
                                    n4 = ah5.a(1);
                                }
                                if (n4 < 0) {
                                    af af2 = (af)object4;
                                    if (!af2.a()) {
                                        throw new ClassCastException("object not callable at line " + a);
                                    }
                                    af2.a(ah3, (af)object2, ah4);
                                } else {
                                    this.a(ah3, (af)object2, n4, ah4, null);
                                }
                            }
                            catch (ClassCastException classCastException) {
                                if (object4 == ab.a()) {
                                    throw new ClassCastException("attempt to call undefined function");
                                }
                                throw classCastException;
                            }
                            this.b(ah3);
                            ah4.a();
                            continue block146;
                        }
                        case 70: {
                            int n8 = this.a();
                            this.a(n8, ah4);
                            String string = this.c().toString();
                            this.c(ah3);
                            object2 = ah3.b();
                            ((af)object2).b(ah3, (af)object2, string, ah4);
                            this.b(ah3);
                            ah3.a(null);
                            ah4.a();
                            continue block146;
                        }
                        case 71: {
                            Object[] objectArray = new Object[1];
                            object3 = objectArray;
                            objectArray[0] = this.c();
                            this.a(object3);
                            continue block146;
                        }
                        case 72: {
                            Object[] objectArray = (Object[])this.c();
                            object3 = objectArray;
                            objectArray[0] = this.c();
                            continue block146;
                        }
                        case 73: {
                            object3 = (Object[])this.c();
                            this.a(object3[0]);
                            continue block146;
                        }
                        case 74: {
                            int n9 = this.d;
                            object4 = ab.a();
                            n4 = 0;
                            while (true) {
                                if (n4 >= n9) continue block145;
                                this.a(object4);
                                ++n4;
                            }
                        }
                        case 75: {
                            int n10 = this.a();
                            n4 = 0;
                            while (true) {
                                if (n4 >= n10) continue block145;
                                this.a(ab.a());
                                ++n4;
                            }
                        }
                        case 76: {
                            this.a(this);
                            continue block146;
                        }
                        case 77: {
                            this.d(0);
                            continue block146;
                        }
                        case 78: {
                            this.d(this.d);
                            continue block146;
                        }
                        case 79: {
                            this.c();
                            continue block146;
                        }
                        case 80: {
                            int n11 = this.d;
                            n4 = 0;
                            while (true) {
                                if (n4 >= n11) continue block145;
                                this.c();
                                ++n4;
                            }
                        }
                        case 81: {
                            boolean bl;
                            this.c(ah3);
                            this.c(ah4);
                            Object object8 = ah4.a();
                            object4 = object8;
                            if (object8 instanceof Object[] || object4 instanceof Vector) {
                                try {
                                    if (ah3.c() == 1) {
                                        int n12 = ah3.b();
                                        if (object4 instanceof Vector) {
                                            object4 = (Vector)object4;
                                            this.a(((Vector)object4).elementAt(n12));
                                            continue block145;
                                        }
                                        this.a(((Object[])object4)[n12]);
                                        continue block145;
                                    }
                                    if (!"length".equals(ah3.a())) continue block145;
                                    if (object4 instanceof Vector) {
                                        Vector vector = (Vector)object4;
                                        this.b(vector.size());
                                        continue block145;
                                    }
                                    this.b(((Object[])object4).length);
                                }
                                catch (Exception exception) {
                                    this.a(ab.a());
                                }
                                continue block146;
                            }
                            if (object4 instanceof Hashtable) {
                                this.a(((Hashtable)object4).get(ah3.toString()));
                                continue block146;
                            }
                            object2 = ah4.b();
                            if (ah3.c() == 1) {
                                bl = ((af)object2).b(ah3, ah3.b());
                            } else {
                                String string = ah3.a().toString();
                                bl = false;
                                if (ah.a(string)) {
                                    try {
                                        int n13 = Integer.parseInt(string);
                                        bl = ((af)object2).b(ah3, n13);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                }
                                if (!bl) {
                                    bl = ((af)object2).a(ah3, string);
                                }
                            }
                            if (bl) {
                                this.b(ah3);
                            } else {
                                this.a(ab.a());
                            }
                            ah3.a(null);
                            continue block146;
                        }
                        case 82: {
                            af af3;
                            this.c(ah4);
                            this.c(ah3);
                            Object object9 = this.c();
                            object4 = object9;
                            if (object9 instanceof Object[]) {
                                int n14 = ah3.b();
                                ((Object[])object4)[n14] = ah4.a();
                                continue block146;
                            }
                            if (object4 instanceof Vector) {
                                if (ah3.c() == 1) {
                                    int n15 = ah3.b();
                                    if (n15 >= ((Vector)(object4 = (Object)((Vector)object4))).size()) {
                                        ad.a((Vector)object4, n15 + 1);
                                    }
                                    ((Vector)object4).setElementAt(ah4.a(), n15);
                                    continue block146;
                                }
                                if ("length".equals(ah3.a())) {
                                    Vector vector = (Vector)object4;
                                    ad.a(vector, ah4.b());
                                    continue block146;
                                }
                            } else if (object4 instanceof Hashtable) {
                                ((Hashtable)object4).put(ah3.toString(), ah4.a());
                                continue block146;
                            }
                            if (ah3.c() == 1) {
                                int n16 = ah3.b();
                                ah3.a(object4);
                                af3 = ah3.b();
                                af3.a(n16, (Object)ah4);
                            } else {
                                String string = ah3.toString();
                                ah3.a(object4);
                                af3 = ah3.b();
                                if (ah.a(string)) {
                                    try {
                                        int n17 = Integer.parseInt(string);
                                        af3.a(n17, (Object)ah4);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        af3.a_(string, ah4);
                                    }
                                } else {
                                    af3.a_(string, ah4);
                                }
                            }
                            ah4.a(null);
                            continue block146;
                        }
                        case 83: {
                            continue block146;
                        }
                        case 84: {
                            this.c(ah2);
                            if (n >= this.g) {
                                this.c();
                                ab.a(ah3);
                                return;
                            }
                            if (this.c() < 0) {
                                ab.a(ah3);
                                return;
                            }
                            this.b(ah2);
                            continue block146;
                        }
                        case 85: {
                            ah2.a(null);
                            if (n >= this.g) {
                                this.c();
                                ab.a(ah3);
                                return;
                            }
                            if (this.c() < 0) {
                                ab.a(ah3);
                                return;
                            }
                            this.a((Object)null);
                            continue block146;
                        }
                        case 86: {
                            int n18 = this.a();
                            this.a(n18, ah4);
                            af af4 = (af)this.c();
                            if (!af4.a()) {
                                throw new ClassCastException("object not callable at line " + a);
                            }
                            this.a(af4.a(ah3, ah4));
                            ah4.a();
                            continue block146;
                        }
                        case 87: {
                            Object object10 = this.c();
                            object4 = object10;
                            if (object10 == ab.a()) {
                                System.out.println("undefined");
                                continue block145;
                            }
                            System.out.println(object4);
                            continue block146;
                        }
                        case 88: {
                            if (this.a(ah3, this.b)) {
                                this.b(ah3);
                            } else {
                                this.a(ab.a());
                            }
                            ah3.a(null);
                            continue block146;
                        }
                        case 89: {
                            this.c(ah3);
                            this.a_(this.b, ah3);
                            continue block146;
                        }
                        case 90: {
                            this.b(this.d, this.c());
                            continue block146;
                        }
                        case 91: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() % ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 92: {
                            this.c(ah3);
                            ah3.d();
                            this.b(-ah3.b());
                            continue block146;
                        }
                        case 93: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() << ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 94: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() >> ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 120: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b((int)(((long)ah3.b() & 0xFFFFFFFFL) >> ah4.b()));
                            ah4.a(null);
                            continue block146;
                        }
                        case 95: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() & ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 96: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() | ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 97: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            this.b(ah3.b() ^ ah4.b());
                            ah4.a(null);
                            continue block146;
                        }
                        case 98: {
                            this.c(ah3);
                            ah3.d();
                            this.b(~ah3.b());
                            continue block146;
                        }
                        case 99: {
                            object2 = this.b();
                            if (object2 == null) {
                                object2 = this;
                            }
                            this.a(object2);
                            continue block146;
                        }
                        case 100: {
                            ah3.a(true);
                            this.b(ah3);
                            continue block146;
                        }
                        case 101: {
                            ah3.a(false);
                            this.b(ah3);
                            continue block146;
                        }
                        case 102: {
                            this.a(ab.a());
                            continue block146;
                        }
                        case 103: {
                            this.c(ah3);
                            boolean bl = ah3.c();
                            this.c(ah3);
                            bl = bl && ah3.c();
                            ah3.a(bl);
                            this.b(ah3);
                            continue block146;
                        }
                        case 104: {
                            this.c(ah3);
                            boolean bl = ah3.c();
                            this.c(ah3);
                            bl = bl || ah3.c();
                            ah3.a(bl);
                            this.b(ah3);
                            continue block146;
                        }
                        case 105: {
                            this.c(ah3);
                            ah3.a(!ah3.c());
                            this.b(ah3);
                            continue block146;
                        }
                        case 106: {
                            object3 = (af)this.c();
                            object4 = this.c();
                            if (!((af)object3).a()) {
                                throw new ClassCastException("object not callable at line " + a);
                            }
                            ah3.a(((af)object3).a(ah3, object4));
                            this.b(ah3);
                            continue block146;
                        }
                        case 107: {
                            this.c(ah3);
                            switch (ah3.c()) {
                                case 6: {
                                    this.a((Object)"undefined");
                                    continue block146;
                                }
                                case 4: {
                                    this.a((Object)"object");
                                    continue block146;
                                }
                                case 1: {
                                    this.a((Object)"number");
                                    continue block146;
                                }
                                case 3: {
                                    this.a((Object)"string");
                                    continue block146;
                                }
                                case 5: {
                                    this.a((Object)"boolean");
                                    continue block146;
                                }
                                case 2: {
                                    if (((af)ah3.a()).a_().equals("Function")) {
                                        this.a((Object)"function");
                                        continue block146;
                                    }
                                    this.a((Object)"object");
                                    continue block146;
                                }
                            }
                            this.a((Object)"javaobject");
                            continue block146;
                        }
                        case 111: {
                            this.e(this.d);
                            continue block146;
                        }
                        case 112: {
                            this.c(ah3);
                            Object object11 = ah3.a();
                            object4 = object11;
                            if (object11 instanceof Object[] || object4 instanceof Vector) {
                                int n19 = object4 instanceof Object[] ? ((Object[])object4).length : ((Vector)object4).size();
                                Vector vector = new Vector(n19);
                                object4 = vector;
                                vector.setSize(n19);
                                for (int i = 0; i < n19; ++i) {
                                    ((Vector)object4).setElementAt(new Integer(i), i);
                                }
                                this.a(object4);
                                continue block146;
                            }
                            if (object4 instanceof Hashtable) {
                                Hashtable hashtable = (Hashtable)object4;
                                int n20 = hashtable.size();
                                Vector vector = new Vector(n20);
                                vector.setSize(n20);
                                n20 = 0;
                                object3 = hashtable.keys();
                                while (object3.hasMoreElements()) {
                                    vector.setElementAt(object3.nextElement(), n20++);
                                }
                                this.a(vector);
                                continue block146;
                            }
                            object2 = ah3.b();
                            this.a(((af)object2).a(ah3, (Vector)null));
                            continue block146;
                        }
                        case 113: {
                            boolean bl;
                            this.c(ah3);
                            this.c(ah4);
                            object2 = ah4.b();
                            ah4.a(null);
                            if (ah3.c() == 1) {
                                bl = ((af)object2).c(ah3, ah3.b());
                            } else {
                                String string = ah3.a().toString();
                                try {
                                    Integer n21 = Integer.valueOf(string);
                                    bl = ((af)object2).c(ah3, n21);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    bl = ((af)object2).d(ah3, string);
                                }
                            }
                            ah3.a(bl);
                            this.b(ah3);
                            ah3.a(null);
                            object4 = null;
                            continue block146;
                        }
                        case 114: {
                            this.c(ah3);
                            if (ah3.c()) {
                                this.b(ah3);
                            } else {
                                this.a((Object)null);
                            }
                            ah3.a(null);
                            continue block146;
                        }
                        case 115: {
                            int n22 = this.a();
                            Object[] objectArray = new Object[n22];
                            while (--n22 >= 0) {
                                objectArray[n22] = this.c();
                            }
                            this.a(objectArray);
                            continue block146;
                        }
                        case 116: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            int n23 = (int)((long)ah3.b() * (long)ah4.b() >> this.d);
                            this.b(n23);
                            ah4.a(null);
                            continue block146;
                        }
                        case 117: {
                            this.c(ah4);
                            this.c(ah3);
                            ah3.d();
                            ah4.d();
                            int n24 = (int)((long)ah3.b() / (long)ah4.b() << this.d);
                            this.b(n24);
                            ah4.a(null);
                            continue block146;
                        }
                        case 118: {
                            this.e = this.a();
                            continue block146;
                        }
                        case 119: {
                            this.c(ah3);
                            Object object12 = this.c();
                            object4 = object12;
                            if (object12 instanceof Hashtable) {
                                String string = ah3.toString();
                                ah3.a(true);
                                this.b(ah3);
                                ((Hashtable)object4).remove(string);
                                continue block146;
                            }
                            if (!(object4 instanceof af)) {
                                ah3.a(true);
                                this.b(ah3);
                                continue block146;
                            }
                            af af5 = (af)object4;
                            if (ah3.c() == 1) {
                                af5.a(ah3.b());
                                ah3.a(true);
                                this.b(ah3);
                                continue block146;
                            }
                            String string = ah3.a().toString();
                            try {
                                object4 = Integer.valueOf(string);
                                af5.a((Integer)object4);
                                ah3.a(true);
                                this.b(ah3);
                            }
                            catch (NumberFormatException numberFormatException) {
                                af5.a(string);
                                ah3.a(true);
                                this.b(ah3);
                            }
                            continue block145;
                        }
                        case 121: {
                            a = this.d;
                            continue block146;
                        }
                        case 122: {
                            int n25 = this.d();
                            int n26 = ac.a(this.a(this.e)) + this.e;
                            int n27 = this.a[n26] << 8 & 0xFF00 | this.a[n26 + 1] & 0xFF;
                            int n28 = this.a[n26 + 2] << 8 & 0xFF00 | this.a[n26 + 3] & 0xFF;
                            this.e += 4;
                            if (n25 < n27 || n25 > n28) continue block145;
                            this.c();
                            this.e += this.d;
                            continue block146;
                        }
                        case 126: {
                            this.a(ah3, this.d, 1);
                        }
                        case 125: {
                            int n29 = this.a(this.d);
                            this.c(ah3);
                            String string = ah3.toString();
                            if (n29 >= string.length()) {
                                this.b(-1);
                                continue block145;
                            }
                            this.b(string.charAt(n29));
                            continue block146;
                        }
                    }
                    break;
                }
                throw new RuntimeException("unknown opcode " + Integer.toString(this.c));
            }
            catch (ae ae2) {
                int n30;
                if (this.i <= n || (n30 = this.b()) == -1) {
                    throw ae2;
                }
                this.a(ae2.a());
                this.e = n30;
                continue;
            }
            catch (RuntimeException runtimeException) {
                int n31;
                Object object13 = this.b();
                if (this.a != null) {
                    System.err.println("exception in function " + this.a);
                    if (object13 != null) {
                        System.err.println("backtrace:");
                        System.err.println((String)object13);
                    }
                }
                if (a > 0) {
                    System.err.println("exception at line " + a);
                }
                if (this.i <= n || (n31 = this.b()) == -1) {
                    runtimeException.printStackTrace();
                    throw runtimeException;
                }
                int n32 = runtimeException instanceof ClassCastException ? -58 : (runtimeException instanceof IndexOutOfBoundsException || runtimeException instanceof NegativeArraySizeException || runtimeException instanceof ArithmeticException || runtimeException instanceof NoSuchElementException ? -59 : -57);
                this.a(ah3, n32);
                object = ah3.a();
                ah4.a = 1;
                ah4.a(0, runtimeException.toString());
                object2 = ((af)object).a(ah3, ah4);
                this.e = n31;
                this.a(object2);
                continue;
            }
            break;
        }
    }

    static byte[] a(ab ab2) {
        return ab2.a;
    }

    static int a(ab ab2, int n) {
        return ab2.b += n;
    }

    static int a(ab ab2, byte[] byArray, int n) {
        n = 4;
        if (n > ab2.b - 1) {
            throw new RuntimeException("access illegal offset");
        }
        return byArray[n];
    }

    static int b(ab ab2, byte[] byArray, int n) {
        return ab2.a(byArray, n);
    }

    static int b(ab ab2, int n) {
        int n2 = n;
        byte[] byArray = ab2.a;
        if (n2 + 1 > ab2.b - 1) {
            throw new RuntimeException("access illegal offset");
        }
        return ((byArray[n2] & 0xFF) << 8 | byArray[n2 + 1] & 0xFF) & 0xFFFF;
    }

    static int c(ab ab2, int n) {
        return ab2.a(ab2.a, n);
    }

    static {
        a = null;
    }
}
