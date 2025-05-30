/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ad
extends ag {
    public static ad a;
    public static ad b;
    public static ad c;
    public static ad d;
    public static ad e;
    public static ad f;
    public static ad g;
    public static ad h;
    public static ad i;
    public static ad j;
    public static ad k;
    public static ad l;
    public static ad m;
    public static ad n;
    public static ad o;
    public static ad p;
    public static ad q;
    public static ad r;
    public static ad s;
    public static ad t;
    public static ad u;
    private static Random a;
    private final byte a;
    public Object a;
    public af a;

    public static ad a(byte by) {
        switch (by) {
            case 1: {
                if (a == null) {
                    a = new ad(5);
                }
                return a;
            }
            case 15: {
                if (e == null) {
                    e = new ad(16);
                }
                return e;
            }
            case 18: {
                if (l == null) {
                    l = new ad(19);
                }
                return l;
            }
            case 2: {
                if (b == null) {
                    b = new ad(6);
                }
                return b;
            }
            case 3: {
                if (c == null) {
                    c = new ad(7);
                }
                return c;
            }
            case 4: {
                if (d == null) {
                    d = new ad(8);
                }
                return d;
            }
            case 21: {
                if (m == null) {
                    m = new ad(22);
                }
                return m;
            }
            case 24: {
                if (o == null) {
                    o = new ad(25);
                }
                return o;
            }
            case 27: {
                if (q == null) {
                    q = new ad(28);
                }
                return q;
            }
            case 30: {
                if (s == null) {
                    s = new ad(31);
                }
                return s;
            }
        }
        throw new RuntimeException("can't construct objType " + by);
    }

    public static ad b(byte by) {
        block16: while (true) {
            switch (by) {
                case 11: {
                    return null;
                }
                case 1: {
                    if (f == null) {
                        f = new ad(11);
                    }
                    return f;
                }
                case 15: {
                    if (j == null) {
                        j = new ad(17);
                        new ad(17).a = new Boolean(false);
                    }
                    return j;
                }
                case 5: 
                case 6: 
                case 7: 
                case 9: 
                case 16: 
                case 19: 
                case 22: 
                case 25: 
                case 28: 
                case 31: {
                    by = (byte)4;
                    continue block16;
                }
                case 18: {
                    if (k == null) {
                        k = new ad(20);
                    }
                    return k;
                }
                case 4: 
                case 8: {
                    if (i == null) {
                        i = new ad(14);
                    }
                    return i;
                }
                case 14: {
                    by = 1;
                    continue block16;
                }
                case 3: {
                    if (g == null) {
                        g = new ad(12);
                    }
                    return g;
                }
                case 2: {
                    if (h == null) {
                        h = new ad(13);
                        new ad(13).a = "";
                    }
                    return h;
                }
                case 21: {
                    if (n == null) {
                        n = new ad(23);
                    }
                    return n;
                }
                case 24: {
                    if (p == null) {
                        p = new ad(26);
                    }
                    return p;
                }
                case 27: {
                    if (r == null) {
                        r = new ad(29);
                    }
                    return r;
                }
                case 26: 
                case 29: {
                    by = (byte)21;
                    continue block16;
                }
                case 30: {
                    return null;
                }
            }
            by = 1;
        }
    }

    public final void a(ah ah2, af af2, ah ah3) {
        switch (this.a) {
            case 5: 
            case 22: 
            case 25: 
            case 28: {
                ah2.a(this.a(ah2, ah3));
                return;
            }
            case 16: {
                if (ah3.a() == 0) {
                    ah3.a(1);
                    ah3.a(0, 0);
                }
                ah3.a(0);
                ah2.a(ah3.a(0));
                return;
            }
            case 19: {
                if (ah3.a() == 0) {
                    ah3.a(1);
                    ah3.a(0, 0);
                }
                ah3.c(0);
                ah2.c(ah3.a(0));
                return;
            }
            case 7: {
                ah2.a(ad.a(ah3));
                return;
            }
            case 14: {
                ah2.a(ab.a());
                return;
            }
            case 4: {
                ab ab2 = (ab)this.a;
                this.a(ah2, "pc");
                int n = ah2.b();
                Object[] objectArray = this.a(ah2, "__closureArgs__") ? (Object[])ah2.a() : null;
                ab2.a(ah2, af2, n, ah3, objectArray);
                return;
            }
            case 6: {
                if (ah3 == null || ah3.a == 0) {
                    ah2.a("");
                    return;
                }
                ah2.a(ah3.a(0));
                return;
            }
            case 9: {
                this.a(ah2, "propid");
                ((ag)this.a).a(ah2, af2, ah2.b(), ah3);
                return;
            }
            case 31: {
                ah2.a(new Date().toString());
                return;
            }
        }
        throw new RuntimeException();
    }

    public static ad a(ag ag2, int n) {
        ad ad2 = new ad(9);
        new ad(9).a = ag2;
        ad2.a_("propid", new Integer(n));
        return ad2;
    }

    private static ad a(ah ah2) {
        ad ad2 = new ad(3);
        if (ah2 != null && ah2.a > 0) {
            int n = 0;
            if (ah2.a == 1 && ah2.b(0) == 1) {
                n = 1;
            }
            if (n != 0) {
                if (ah2.a(0) > 0) {
                    ad2.a(ah2.a(0) - 1, ab.a());
                }
            } else {
                for (n = ah2.a - 1; n >= 0; --n) {
                    Object object = ah2.b(n) ? ah2.a(n) : (Object)new int[]{ah2.a(n)};
                    ad2.a(n, object);
                }
            }
        }
        return ad2;
    }

    public final af a(ah object, ah ah2) {
        switch (this.a) {
            case 5: {
                if (ah2 == null || ah2.a == 0 || ah2.a(0) == null || ah2.a(0) == ab.a()) {
                    return new ad(1);
                }
                return ah2.b();
            }
            case 16: {
                ad ad2 = new ad(15);
                if (ah2.a() == 0) {
                    ah2.a(1);
                    ah2.a(0, 0);
                }
                ah2.a(0);
                ad2.a = ah2.a(0);
                return ad2;
            }
            case 22: {
                ad ad3 = new ad(21);
                if (ah2.a > 0) {
                    ad3.a_("message", ah2.a(0));
                }
                ad3.a_("name", "Error");
                if (ab.a > 0) {
                    ad3.a_("lineno", new Integer(ab.a));
                }
                return ad3;
            }
            case 25: {
                ad ad4 = new ad(24);
                if (ah2.a > 0) {
                    ad4.a_("message", ah2.a(0));
                }
                ad4.a_("name", "TypeError");
                if (ab.a > 0) {
                    ad4.a_("lineno", new Integer(ab.a));
                }
                return ad4;
            }
            case 28: {
                ad ad5 = new ad(27);
                if (ah2.a > 0) {
                    ad5.a_("message", ah2.a(0));
                }
                ad5.a_("name", "RangeError");
                if (ab.a > 0) {
                    ad5.a_("lineno", new Integer(ab.a));
                }
                return ad5;
            }
            case 19: {
                ad ad6 = new ad(18);
                if (ah2.a() == 0) {
                    ah2.a(1);
                    ah2.a(0, 0);
                }
                ah2.c(0);
                ad6.a = ah2.a(0);
                return ad6;
            }
            case 6: {
                object = ah2 != null && ah2.a > 0 ? ah2.a(0) : "";
                Object object2 = object;
                ad ad7 = new ad(2);
                new ad(2).a = object2;
                ad ad8 = ad7;
                return ad8;
            }
            case 7: {
                ad ad9 = ad.a(ah2);
                return ad9;
            }
            case 31: {
                object = Calendar.getInstance();
                ((Calendar)object).set(14, 0);
                ((Calendar)object).set(13, 0);
                ((Calendar)object).set(12, 0);
                ((Calendar)object).set(11, 0);
                ((Calendar)object).set(5, 0);
                switch (ah2.a) {
                    default: {
                        ((Calendar)object).set(13, ah2.c(5));
                    }
                    case 5: {
                        ((Calendar)object).set(12, ah2.c(4));
                    }
                    case 4: {
                        ((Calendar)object).set(11, ah2.c(3));
                    }
                    case 3: {
                        ((Calendar)object).set(5, ah2.c(2));
                    }
                    case 2: {
                        ((Calendar)object).set(2, ah2.c(1));
                        ((Calendar)object).set(1, ah2.c(0));
                        break;
                    }
                    case 1: {
                        throw new RuntimeException("1-argument form of Date ctor not supported");
                    }
                    case 0: {
                        ((Calendar)object).setTime(new Date());
                    }
                }
                ad ad10 = new ad(30);
                new ad(30).a = object;
                return ad10;
            }
            case 4: {
                ad ad11 = new ad(1);
                if (object == null) {
                    object = new ah();
                }
                this.a((ah)object, "prototype");
                af af2 = (af)((ah)object).a();
                ad ad12 = ad11;
                ad11.a = af2;
                this.a((ah)object, ad11, ah2);
                return ad11;
            }
        }
        throw new ClassCastException("can't construct objtype " + this.a);
    }

    public ad(byte by) {
        this.a = by;
    }

    public ad(Vector vector) {
        this.a = (byte)3;
        this.a = vector;
    }

    public ad(Object[] objectArray) {
        this.a = (byte)3;
        for (int i = objectArray.length - 1; i >= 0; --i) {
            this.a(i, objectArray[i]);
        }
    }

    public ad(Hashtable hashtable) {
        this.a = 1;
        this.a(hashtable);
    }

    private static Object a(Vector serializable, int n) {
        if ((serializable = serializable.elementAt(n)) instanceof int[]) {
            serializable = new Integer(((int[])serializable)[0]);
        }
        return serializable;
    }

    private static void a(ah ah2, ad ad2, int n, ah ah3) {
        Vector<Object> vector = (Vector<Object>)ad2.a;
        if (vector == null) {
            ad2.a = vector = new Vector<Object>();
        }
        int n2 = vector.size();
        switch (n) {
            case -26: {
                if (n2 > 0) {
                    ad2.b(ah2, n2 - 1);
                    vector.setSize(n2 - 1);
                    return;
                }
                ah2.a(ab.a());
                return;
            }
            case -28: {
                for (n = 0; n < ah3.a; ++n) {
                    ad2.a(n2++, ah3.a(n));
                }
                ah2.a(0, ah3, ah3.a - 1);
                return;
            }
            case -32: {
                --n2;
                for (n = 0; n < n2; ++n, --n2) {
                    ah2 = vector.elementAt(n);
                    vector.setElementAt(vector.elementAt(n2), n);
                    vector.setElementAt(ah2, n2);
                }
                return;
            }
            case -33: {
                if (n2 > 0) {
                    ad2.b(ah2, 0);
                    vector.removeElementAt(0);
                    return;
                }
                ah2.a(ab.a());
                return;
            }
            case -36: {
                af af2 = null;
                ah ah4 = null;
                if (ah3.a > 0 && !(af2 = (af)ah3.a(0)).a()) {
                    throw new ClassCastException("noncallable object to sort");
                }
                int n3 = vector.size();
                for (n = 0; n < n3 - 1; ++n) {
                    for (n2 = n + 1; n2 < n3; ++n2) {
                        int n4;
                        String string;
                        if (af2 == null) {
                            ad2.b(ah2, n);
                            string = ah2.toString();
                            ad2.b(ah2, n2);
                            n4 = string.compareTo(ah2.toString());
                        } else {
                            if (ah4 == null) {
                                ah4 = new ah(2);
                            }
                            ad2.b(ah2, n);
                            ah4.a(0, ah2, 0);
                            ad2.b(ah2, n2);
                            ah4.a(1, ah2, 0);
                            af2.a(ah2, null, ah4);
                            n4 = ah2.b();
                        }
                        if (n4 <= 0) continue;
                        string = vector.elementAt(n);
                        vector.setElementAt(vector.elementAt(n2), n);
                        vector.setElementAt(string, n2);
                    }
                }
                ah2.a(ad2);
                return;
            }
            case -37: {
                int n5 = ah3.a(0);
                int n6 = ah3.a > 1 ? ah3.a(1) : vector.size() - n5;
                ad ad3 = ad.a(null);
                for (n = 0; n < n6; ++n) {
                    ad3.a(n, vector.elementAt(n5));
                    vector.removeElementAt(n5);
                }
                ah2.a(ad3);
                if (ah3.a > 2) {
                    vector.setSize(vector.size() + ah3.a - 2);
                    for (n = vector.size() - 1; n >= n5 + ah3.a - 2; --n) {
                        vector.setElementAt(vector.elementAt(n - (ah3.a - 2)), n);
                    }
                    n = n5;
                    for (n2 = 2; n2 < ah3.a; ++n2) {
                        vector.setElementAt(ah3.a(n2), n);
                        ++n;
                    }
                }
                return;
            }
            case -46: {
                vector.setSize(vector.size() + ah3.a);
                for (n = vector.size() - 1; n >= ah3.a; --n) {
                    vector.setElementAt(vector.elementAt(n - ah3.a), n);
                }
                for (n = 0; n < ah3.a; ++n) {
                    vector.setElementAt(ah3.a(n), n);
                }
                ah2.a(null);
                return;
            }
            case -13: {
                ad ad4 = ad.a(null);
                int n7 = 0;
                for (n = 0; n < vector.size(); ++n) {
                    ad4.a(n7++, ad.a(vector, n));
                }
                ad ad5 = ad.a((byte)3);
                for (n = 0; n < ah3.a; ++n) {
                    if (ad5.a(ah2, ah3.a(n))) {
                        ad ad6 = (ad)ah3.a(n);
                        Vector vector2 = (Vector)ad6.a;
                        if (ad6.a == 3) {
                            for (n2 = 0; n2 < vector2.size(); ++n2) {
                                ad4.a(n7++, ad.a(vector2, n2));
                            }
                            continue;
                        }
                        ad4.a(n7++, ah3.a(n));
                        continue;
                    }
                    ad4.a(n7++, ah3.a(n));
                }
                ah2.a(ad4);
                return;
            }
            case -47: 
            case -44: {
                ah3 = null;
            }
            case -19: {
                Object object = ah3 != null && ah3.a > 0 && ah3.b(0) != 6 ? ah3.a(0) : ",";
                StringBuffer stringBuffer = new StringBuffer();
                for (n = 0; n < n2; ++n) {
                    ad2.b(ah2, n);
                    int n8 = ah2.c();
                    if (n8 != 4 && n8 != 6) {
                        stringBuffer.append(ah2.toString());
                    }
                    if (n >= n2 - 1) continue;
                    stringBuffer.append((String)object);
                }
                ah2.a(stringBuffer.toString());
                return;
            }
            case -34: {
                int n9;
                ad ad7 = ad.a(null);
                int n10 = ah3.a(0);
                if (n10 < 0) {
                    n10 += vector.size();
                }
                if ((n9 = ah3.a > 1 ? ah3.a(1) - 1 : vector.size() - 1) < 0) {
                    n9 += vector.size();
                }
                n = n10;
                n2 = 0;
                while (n <= n9) {
                    ad7.a(n2, vector.elementAt(n));
                    ++n;
                    ++n2;
                }
                ah2.a(ad7);
                return;
            }
            case -18: {
                int n11 = ah3.a > 1 ? ah3.a(1) : 0;
                if (n11 < 0) {
                    n11 += vector.size();
                }
                ah ah5 = new ah();
                for (n = n11; n < vector.size(); ++n) {
                    ah5.a(ah3.a(0));
                    ad2.b(ah2, n);
                    if (!ab.a(ah5, ah2)) continue;
                    ah2.c(n);
                    return;
                }
                ah2.c(-1);
                return;
            }
            case -20: {
                int n12 = ah3.a > 1 ? ah3.a(1) : vector.size();
                if (n12 < 0) {
                    n12 += vector.size() + 1;
                }
                ah ah6 = new ah();
                for (n = n12 - 1; n >= 0; --n) {
                    ah6.a(0, ah3, 0);
                    ad2.b(ah2, n);
                    if (!ab.a(ah6, ah2)) continue;
                    ah2.c(n);
                    return;
                }
                ah2.c(-1);
                return;
            }
            case -15: {
                af af3 = (af)ah3.a(0);
                if (!af3.a()) {
                    throw new ClassCastException();
                }
                af af4 = null;
                if (ah3.a > 1) {
                    af4 = (af)ah3.a(1);
                }
                ad ad8 = ad.a(null);
                if (vector != null) {
                    int n13 = vector.size();
                    ah ah7 = new ah(1);
                    int n14 = 0;
                    for (n = 0; n < n13; ++n) {
                        ad2.b(ah7, n);
                        ah7.a(1);
                        af3.a(ah2, af4, ah7);
                        if (!ah2.c()) continue;
                        ad2.b(ah2, n);
                        ad8.a(n14++, (Object)ah2);
                    }
                }
                ah2.a(ad8);
                return;
            }
            case -16: {
                af af5 = (af)ah3.a(0);
                if (!af5.a()) {
                    throw new ClassCastException();
                }
                af af6 = null;
                if (ah3.a > 1) {
                    af6 = (af)ah3.a(1);
                }
                if (vector != null) {
                    int n15 = vector.size();
                    ah ah8 = new ah(3);
                    for (n = 0; n < n15; ++n) {
                        ad2.b(ah8, n);
                        ah8.a(1, n);
                        ah8.a(2, ad2);
                        ah8.a(3);
                        af5.a(ah2, af6, ah8);
                    }
                }
                ah2.a(null);
                return;
            }
            case -14: {
                af af7 = (af)ah3.a(0);
                if (!af7.a()) {
                    throw new ClassCastException();
                }
                af af8 = null;
                if (ah3.a > 1) {
                    af8 = (af)ah3.a(1);
                }
                if (vector != null) {
                    int n16 = vector.size();
                    ah ah9 = new ah(1);
                    ah2.a(true);
                    for (n = 0; n < n16; ++n) {
                        ad2.b(ah9, n);
                        af7.a(ah2, af8, ah9);
                        if (ah2.c()) continue;
                        ah2.a(false);
                        return;
                    }
                }
                return;
            }
            case -23: {
                af af9 = (af)ah3.a(0);
                if (!af9.a()) {
                    throw new ClassCastException();
                }
                af af10 = null;
                if (ah3.a > 1) {
                    af10 = (af)ah3.a(1);
                }
                ad ad9 = ad.a(null);
                if (vector != null) {
                    int n17 = vector.size();
                    ah ah10 = new ah(1);
                    int n18 = 0;
                    for (n = 0; n < n17; ++n) {
                        ad2.b(ah10, n);
                        af9.a(ah2, af10, ah10);
                        ad9.a(n18++, ah2.a());
                    }
                }
                ah2.a(ad9);
                return;
            }
            case -35: {
                af af11 = (af)ah3.a(0);
                if (!af11.a()) {
                    throw new ClassCastException();
                }
                af af12 = null;
                if (ah3.a > 1) {
                    af12 = (af)ah3.a(1);
                }
                if (vector != null) {
                    int n19 = vector.size();
                    ah ah11 = new ah(1);
                    ah2.c(1);
                    for (n = 0; n < n19; ++n) {
                        ad2.b(ah11, n);
                        af11.a(ah2, af12, ah11);
                        if (!ah2.c()) continue;
                        ah2.a(true);
                        return;
                    }
                }
                ah2.a(false);
                return;
            }
            case -377: {
                Object[] objectArray;
                if (vector == null) {
                    objectArray = new Object[]{};
                } else {
                    objectArray = new Object[vector.size()];
                    vector.copyInto(objectArray);
                    for (n = 0; n < objectArray.length; ++n) {
                        if (!(objectArray[n] instanceof int[]) || ((int[])objectArray[n]).length != 1) continue;
                        objectArray[n] = new Integer(((int[])objectArray[n])[0]);
                    }
                }
                ah2.a(objectArray);
                return;
            }
            case -378: {
                if (vector == null) {
                    ad2.a = vector = new Vector();
                }
                int n20 = vector.size();
                for (n = 0; n < n20; ++n) {
                    Object e = vector.elementAt(n);
                    if (!(e instanceof int[]) || ((int[])e).length != 1) continue;
                    vector.setElementAt(new Integer(((int[])e)[0]), n);
                }
                ah2.a(vector);
                return;
            }
        }
        throw new RuntimeException("unknown array method");
    }

    private static void a(ah ah2, String string, int n, ah ah3) {
        switch (n) {
            case -11: {
                try {
                    n = ah3.a > 0 && ah3.a(0) != null ? ah3.a(0) : 0;
                    ah2.a(string.substring(n, n + 1));
                    return;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    ah2.a("");
                    return;
                }
            }
            case -12: {
                try {
                    n = ah3.a > 0 && ah3.a(0) != null ? ah3.a(0) : 0;
                    ah2.c(string.charAt(n));
                    return;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    ah2.c(-1);
                    return;
                }
            }
            case -13: {
                StringBuffer stringBuffer = new StringBuffer(string);
                for (int i = 0; i < ah3.a; ++i) {
                    stringBuffer.append(ah.a(ah3.a(i)));
                }
                ah2.a(stringBuffer.toString());
                return;
            }
            case -18: {
                switch (ah3.a) {
                    case 0: {
                        ah2.c(-1);
                        return;
                    }
                    case 1: {
                        ah2.c(string.indexOf(ah.a(ah3.a(0))));
                        return;
                    }
                }
                ah2.c(string.indexOf((String)ah3.a(0), ah3.c(1)));
                return;
            }
            case -20: {
                Object object = ah3.a(0);
                int n2 = string.length();
                if (ah3.a > 1) {
                    n2 = ah3.c(1) + 1;
                }
                if (((String)object).length() == 0) {
                    ah2.c(string.length());
                    if (n2 < string.length()) {
                        ah2.c(n2 - 1);
                    }
                    return;
                }
                int n3 = 0;
                int n4 = -1;
                while (n3 < n2) {
                    int n5 = string.indexOf((String)object, n3);
                    if (n5 < 0 || n5 >= n2) {
                        ah2.c(n4);
                        return;
                    }
                    n4 = n5;
                    n3 = n5 + 1;
                }
                ah2.c(n4);
                return;
            }
            case -22: {
                ah2.c(string.compareTo((String)ah3.a(0)));
                return;
            }
            case -34: {
                n = ah3.c(0);
                int n6 = string.length();
                if (ah3.a > 1) {
                    n6 = ah3.c(1);
                }
                if (n < 0) {
                    n += string.length();
                }
                if (n6 < 0) {
                    n6 += string.length();
                }
                ah2.a(string.substring(n, n6));
                return;
            }
            case -39: {
                int n7;
                n = ah3.c(0);
                if (n > string.length() || string.length() == 0) {
                    ah2.a("");
                    return;
                }
                if (n < 0) {
                    n = string.length() + n;
                }
                if (n < 0) {
                    n = 0;
                }
                if ((n7 = ah3.a > 1 ? ah3.c(1) : string.length()) <= 0) {
                    ah2.a("");
                    return;
                }
                if (n + n7 > string.length()) {
                    n7 = string.length() - n;
                }
                ah2.a(string.substring(n, n + n7));
                return;
            }
            case -40: {
                if (ah3.a == 0) {
                    ah2.a(string);
                    return;
                }
                n = ah3.c(0);
                int n8 = string.length();
                if (ah3.a > 1) {
                    n8 = ah3.c(1);
                }
                if (n8 < 0) {
                    n8 = 0;
                }
                if (n < 0) {
                    n = 0;
                }
                if (n8 > string.length() - 1) {
                    n8 = string.length();
                }
                if (n > string.length() - 1) {
                    n = string.length();
                }
                if (n8 == n) {
                    ah2.a("");
                    return;
                }
                if (n < n8) {
                    ah2.a(string.substring(n, n8));
                    return;
                }
                ah2.a(string.substring(n8, n));
                return;
            }
            case -38: {
                ad ad2 = ad.a(null);
                int n9 = Integer.MAX_VALUE;
                if (ah3.a > 1) {
                    n9 = ah3.c(1);
                }
                if (ah3.a <= 0) {
                    ad2.a(0, (Object)string);
                    ah2.a(ad2);
                    return;
                }
                Object object = null;
                ad ad3 = null;
                Object object2 = ah3.a(0);
                int n10 = 0;
                Object object3 = object2;
                if (object3 instanceof ad && ((ad)object3).a == 32) {
                    ad3 = (ad)object2;
                } else {
                    object = ah3.a(0);
                    n10 = ((String)object).length();
                }
                if (string.length() == 0) {
                    if (n10 > 0) {
                        ad2.a(0, (Object)"");
                    }
                    ah2.a(ad2);
                    return;
                }
                int n11 = 0;
                int n12 = 0;
                while (n12 < string.length() && n11 < n9) {
                    af af2;
                    if (ad3 == null && n10 == 0) {
                        ad2.a(n12, (Object)string.substring(n12, n12 + 1));
                        ++n12;
                        continue;
                    }
                    if (ad3 == null) {
                        int n13 = string.indexOf((String)object, n12);
                        if (n13 < 0) {
                            ad2.a(n11++, (Object)string.substring(n12));
                            n12 = string.length();
                            continue;
                        }
                        ad2.a(n11++, (Object)string.substring(n12, n13));
                        n12 = n13 + n10;
                        if (n12 != string.length() || n11 >= n9) continue;
                        ad2.a(n11++, (Object)"");
                        continue;
                    }
                    ah3.a(2);
                    ah3.a(0, string);
                    ah3.a(1, n12);
                    int n14 = ad.a(ah2, ad3, ah3);
                    if (n14 < 0) {
                        ad2.a(n11++, (Object)string.substring(n12));
                        n12 = string.length();
                        continue;
                    }
                    if (!ad3.a(ah2, "lastIndex")) {
                        throw new RuntimeException("regexp error");
                    }
                    int n15 = ah2.d();
                    ad2.a(n11++, (Object)string.substring(n12, n14));
                    n12 = n15;
                    if (!ad3.a(ah2, "lma") || !(af2 = ah2.b()).a(ah2, "length")) continue;
                    n15 = ah2.b();
                    for (int i = 1; i < n15; ++i) {
                        if (af2.b(ah2, i)) {
                            ad2.a(n11++, (Object)ah2.toString());
                            continue;
                        }
                        ad2.a(n11++, (Object)"");
                    }
                }
                ah2.a(ad2);
                return;
            }
            case -64: {
                ad ad4 = (ad)ah3.a(0);
                ah3.a(string);
                ah2.c(ad.a(ah2, ad4, ah3));
                return;
            }
            case -63: {
                ad ad5 = (ad)ah3.a(0);
                boolean bl = ad5.a(ah2, "global");
                if (bl && ah2.c()) {
                    Vector<String> vector = new Vector<String>();
                    int n16 = 0;
                    while (n16 < string.length()) {
                        ah3.a(2);
                        ah3.a(0, string);
                        ah3.a(1, n16);
                        int n17 = ad.a(ah2, ad5, ah3);
                        if (n17 < 0 || !ad5.a(ah2, "lastIndex")) break;
                        vector.addElement(string.substring(n17, ah2.d()));
                        n16 = ah2.b();
                    }
                    if (vector.isEmpty()) {
                        ah2.a(null);
                        return;
                    }
                    ah2.a(new ad(vector));
                    return;
                }
                ah3.a(1);
                ah3.a(string);
                if (ad.a(ah2, ad5, ah3) >= 0) {
                    if (ad5.a(ah2, "lma")) break;
                    throw new RuntimeException("String.match() not implemented.");
                }
                ah2.a(null);
                return;
            }
            case -43: 
            case -41: {
                ah2.a(string.toLowerCase());
                return;
            }
            case -45: 
            case -42: {
                ah2.a(string.toUpperCase());
                return;
            }
            case -65: {
                ah2.a(string.trim());
                return;
            }
            case -47: 
            case -44: {
                ah2.a(string);
                return;
            }
            default: {
                throw new RuntimeException("unknown string method");
            }
        }
    }

    public final boolean a(ah ah2, int n) {
        if (n == -6) {
            ah2.a(this.a());
            return true;
        }
        switch (this.a) {
            case 11: {
                switch (n) {
                    case -382: 
                    case -50: 
                    case -49: 
                    case -48: 
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 32: {
                switch (n) {
                    case -62: 
                    case -61: 
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 22: {
                if (n != -27) break;
                ah2.a(ad.b((byte)21));
                return true;
            }
            case 25: {
                if (n != -27) break;
                ah2.a(ad.b((byte)24));
                return true;
            }
            case 28: {
                if (n != -27) break;
                ah2.a(ad.b((byte)27));
                return true;
            }
            case 23: 
            case 26: 
            case 29: {
                switch (n) {
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 19: {
                switch (n) {
                    case -56: {
                        ah2.c(Integer.MAX_VALUE);
                        return true;
                    }
                    case -55: {
                        ah2.c(Integer.MIN_VALUE);
                        return true;
                    }
                    case -27: {
                        ah2.a(ad.b((byte)18));
                        return true;
                    }
                }
                break;
            }
            case 17: {
                switch (n) {
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 20: {
                switch (n) {
                    case -48: 
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 10: {
                switch (n) {
                    case -29: 
                    case -25: 
                    case -24: 
                    case -7: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 33: {
                switch (n) {
                    case -399: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 14: {
                switch (n) {
                    case -47: 
                    case -44: 
                    case -10: 
                    case -9: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 6: {
                switch (n) {
                    case -17: {
                        ah2.a(ag.b);
                        return true;
                    }
                    case -27: {
                        ah2.a(ad.b((byte)2));
                        return true;
                    }
                }
                break;
            }
            case 8: {
                switch (n) {
                    case -27: {
                        ah2.a(ad.b((byte)4));
                        return true;
                    }
                }
                break;
            }
            case 7: {
                switch (n) {
                    case -27: {
                        ah2.a(ad.b((byte)3));
                        return true;
                    }
                    case -380: 
                    case -379: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 5: {
                switch (n) {
                    case -27: {
                        ah2.a(ad.b((byte)1));
                        return true;
                    }
                    case -383: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                break;
            }
            case 16: {
                switch (n) {
                    case -27: {
                        ah2.a(ad.b((byte)15));
                        return true;
                    }
                }
                break;
            }
            case 2: {
                switch (n) {
                    case -21: {
                        ah2.c(this.a.toString().length());
                        return true;
                    }
                }
                break;
            }
            case 13: {
                switch (n) {
                    case -65: 
                    case -64: 
                    case -63: 
                    case -47: 
                    case -45: 
                    case -44: 
                    case -43: 
                    case -42: 
                    case -41: 
                    case -40: 
                    case -39: 
                    case -38: 
                    case -34: 
                    case -22: 
                    case -20: 
                    case -18: 
                    case -13: 
                    case -12: 
                    case -11: {
                        ah2.a(ag.b);
                        return true;
                    }
                    case -21: {
                        ah2.c(0);
                        return true;
                    }
                }
                return false;
            }
            case 12: {
                switch (n) {
                    case -378: 
                    case -377: 
                    case -47: 
                    case -46: 
                    case -44: 
                    case -37: 
                    case -36: 
                    case -35: 
                    case -34: 
                    case -33: 
                    case -32: 
                    case -28: 
                    case -26: 
                    case -23: 
                    case -20: 
                    case -19: 
                    case -18: 
                    case -16: 
                    case -15: 
                    case -14: 
                    case -13: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
                return false;
            }
            case 3: {
                switch (n) {
                    case -21: {
                        if (this.a != null) {
                            ah2.c(((Vector)this.a).size());
                        } else {
                            ah2.c(0);
                        }
                        return true;
                    }
                }
                break;
            }
            case 30: {
                switch (n) {
                    case -394: 
                    case -393: 
                    case -391: 
                    case -390: 
                    case -389: 
                    case -388: 
                    case -387: 
                    case -386: 
                    case -47: 
                    case -44: {
                        ah2.a(ag.b);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(int n, boolean bl, Object object, int n2) {
        if (n == -6) {
            this.a = (af)object;
            return true;
        }
        if (this.a == 3) {
            if (n == -21) {
                Vector vector = (Vector)this.a;
                if (bl) {
                    if (vector == null) {
                        this.a = vector = new Vector(n2);
                    }
                    ad.a(vector, n2);
                }
                return true;
            }
        } else if (this.a == 2 && n == -21) {
            return true;
        }
        return false;
    }

    static void a(Vector vector, int n) {
        vector.setSize(n);
        for (int i = n - vector.size(); i > 0; --i) {
            vector.setElementAt(ab.a(), n - i);
        }
    }

    private Object a(Object object) {
        if (object instanceof Vector) {
            object = (Vector)object;
            int n = ((Vector)object).size();
            for (int i = 0; i < n; ++i) {
                Object object2;
                Object e = ((Vector)object).elementAt(i);
                if (e == (object2 = this.a(e))) continue;
                ((Vector)object).setElementAt(object2, i);
            }
            return new ad((Vector)object);
        }
        if (object instanceof Hashtable) {
            object = (Hashtable)object;
            ad ad2 = new ad((Hashtable)object);
            Enumeration enumeration = ((Hashtable)object).keys();
            while (enumeration.hasMoreElements()) {
                Object object3;
                String string = (String)enumeration.nextElement();
                Object v = ((Hashtable)object).get(string);
                if (v == (object3 = this.a(v))) continue;
                ((af)ad2).a_(string, object3);
            }
            return ad2;
        }
        if (object == a.a) {
            return null;
        }
        return object;
    }

    public final boolean a(ah object, af object2, int n, ah ah2) {
        if (object2 == null) {
            object2 = this;
        }
        switch (this.a) {
            case 11: {
                switch (n) {
                    case -48: 
                    case -47: 
                    case -44: {
                        ((ah)object).a("[object " + ((af)object2).a_() + "]");
                        return true;
                    }
                    case -49: {
                        ((ah)object).a(((af)object2).c((ah)object, (String)ah2.a(0)));
                        return true;
                    }
                    case -50: {
                        boolean bl = false;
                        try {
                            af af2 = (af)ah2.a(0);
                            af2 = af2.a();
                            while (af2 != null) {
                                if (object2 == af2) {
                                    bl = true;
                                    af2 = null;
                                    continue;
                                }
                                af2 = af2.a();
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            bl = false;
                        }
                        ((ah)object).a(bl);
                        return true;
                    }
                    case -382: {
                        ((ah)object).a(((af)object2).a());
                        return true;
                    }
                }
                break;
            }
            case 5: {
                switch (n) {
                    case -383: {
                        ad ad2 = new ad((Hashtable)ah2.a(0));
                        ((ah)object).a(ad2);
                        return true;
                    }
                }
            }
            case 32: {
                switch (n) {
                    case -47: 
                    case -44: {
                        ((ah)object).a("[regex]");
                        return true;
                    }
                    case -62: {
                        int n2 = ad.a((ah)object, (af)object2, ah2);
                        ((ah)object).a(n2 >= 0);
                        return true;
                    }
                    case -61: {
                        ad ad3 = (ad)object2;
                        n = 0;
                        boolean bl = ad3.a((ah)object, "global");
                        if (bl && ((ah)object).c()) {
                            ad3.a((ah)object, "lastIndex");
                            n = ((ah)object).d();
                        }
                        ah2.a(2);
                        ah2.a(1, n);
                        ad.a((ah)object, (af)object2, ah2);
                        if (!((af)object2).a((ah)object, "lma")) {
                            throw new RuntimeException("regex.exec() not implemented.");
                        }
                        return true;
                    }
                }
                break;
            }
            case 23: 
            case 26: 
            case 29: {
                switch (n) {
                    case -47: 
                    case -44: {
                        StringBuffer stringBuffer = new StringBuffer();
                        ((af)object2).a((ah)object, "name");
                        stringBuffer.append(((ah)object).toString());
                        stringBuffer.append(": ");
                        ((af)object2).a((ah)object, "message");
                        stringBuffer.append(((ah)object).toString());
                        ((ah)object).a(stringBuffer.toString());
                        return true;
                    }
                }
                break;
            }
            case 17: {
                switch (n) {
                    case -44: {
                        ((ah)object).a(((ad)object2).a.toString());
                        return true;
                    }
                    case -47: {
                        ((ah)object).a(((ad)object2).a);
                        return true;
                    }
                }
                break;
            }
            case 20: {
                switch (n) {
                    case -48: 
                    case -44: {
                        Integer n3 = (Integer)((ad)object2).a;
                        n = 10;
                        if (ah2 != null && ah2.a > 1) {
                            ah2.c(0);
                            n = ah2.a(0);
                        }
                        ((ah)object).a(Integer.toString(n3, n));
                        return true;
                    }
                    case -47: {
                        ((ah)object).a(((ad)object2).a);
                        return true;
                    }
                }
                break;
            }
            case 10: {
                switch (n) {
                    case -29: {
                        if (a == null) {
                            a = new Random(System.currentTimeMillis());
                        }
                        int n4 = a.nextInt();
                        ((ah)object).c(n4 & Integer.MAX_VALUE);
                        return true;
                    }
                    case -7: {
                        ah2.c(0);
                        int n5 = ah2.a(0);
                        if (n5 < 0) {
                            n5 = -n5;
                        }
                        ((ah)object).c(n5);
                        return true;
                    }
                    case -25: {
                        int n6 = Integer.MAX_VALUE;
                        if (ah2 != null && ah2.a > 0) {
                            for (int i = 0; i < ah2.a; ++i) {
                                ah2.c(i);
                                if (ah2.a(i) >= n6) continue;
                                n6 = ah2.a(i);
                            }
                        }
                        ((ah)object).c(n6);
                        return true;
                    }
                    case -24: {
                        int n7 = Integer.MIN_VALUE;
                        if (ah2 != null && ah2.a > 0) {
                            for (int i = 0; i < ah2.a; ++i) {
                                ah2.c(i);
                                if (ah2.a(i) <= n7) continue;
                                n7 = ah2.a(i);
                            }
                        }
                        ((ah)object).c(n7);
                        return true;
                    }
                    case -47: 
                    case -44: {
                        ((ah)object).a("Math global object");
                        return true;
                    }
                }
                break;
            }
            case 33: {
                switch (n) {
                    case -399: {
                        Object object3 = ah2;
                        object2 = object;
                        object = this;
                        if (((ah)object3).a > 1) {
                            throw new RuntimeException("JSON.parse() not implemented with >1 argument");
                        }
                        try {
                            object3 = ((ah)object3).a <= 0 ? "undefined" : ((ah)object3).a(0);
                            object3 = new a((String)object3);
                            object3 = object3.a();
                            if (!(object3 instanceof Hashtable) && !(object3 instanceof Vector)) {
                                throw new RuntimeException("JSON syntax error" + object3.getClass());
                            }
                            object = (af)super.a(object3);
                            ((ah)object2).a(object);
                        }
                        catch (RuntimeException runtimeException) {
                            object3 = runtimeException;
                            throw runtimeException;
                        }
                        catch (Exception exception) {
                            throw new RuntimeException(exception.getMessage());
                        }
                        return true;
                    }
                }
                break;
            }
            case 14: {
                switch (n) {
                    case -47: 
                    case -44: {
                        ((ah)object).a("Function=" + super.toString());
                        return true;
                    }
                    case -10: 
                    case -9: {
                        ah ah3;
                        af af3 = (af)ah2.a(0);
                        if (n == -10) {
                            ah3 = new ah(ah2.a - 1);
                            for (int i = 0; i < ah3.a; ++i) {
                                ah3.a(i, ah2, i + 1);
                            }
                        } else {
                            af af4 = (af)ah2.a(1);
                            af4.a((ah)object, "length");
                            ah3 = new ah(((ah)object).b());
                            for (int i = 0; i < ah3.a; ++i) {
                                af4.b((ah)object, i);
                                ah3.a(((ah)object).a());
                            }
                        }
                        if (!((af)object2).a()) {
                            throw new ClassCastException();
                        }
                        ((af)object2).a((ah)object, af3, ah3);
                        return true;
                    }
                }
                break;
            }
            case 6: {
                if (n != -17) break;
                char[] cArray = new char[ah2.a];
                for (n = ah2.a - 1; n >= 0; --n) {
                    ah2.c(n);
                    cArray[n] = (char)ah2.a(n);
                }
                ((ah)object).a(new String(cArray));
                return true;
            }
            case 13: {
                ad.a((ah)object, (String)((ad)object2).a, n, ah2);
                return true;
            }
            case 12: {
                ad.a((ah)object, (ad)object2, n, ah2);
                return true;
            }
            case 7: {
                switch (n) {
                    case -379: {
                        ad ad4 = new ad((Object[])ah2.a(0));
                        ((ah)object).a(ad4);
                        return true;
                    }
                    case -380: {
                        ((ah)object).a(new ad((Vector)ah2.a(0)));
                        return true;
                    }
                }
            }
            case 30: {
                Calendar calendar = (Calendar)this.a;
                switch (n) {
                    case -393: {
                        ((ah)object).c(calendar.get(2));
                        return true;
                    }
                    case -386: {
                        ((ah)object).c(calendar.get(5));
                        return true;
                    }
                    case -387: {
                        ((ah)object).c(calendar.get(7));
                        return true;
                    }
                    case -388: {
                        ((ah)object).c(calendar.get(1));
                        return true;
                    }
                    case -389: {
                        ((ah)object).c(calendar.get(11));
                        return true;
                    }
                    case -390: {
                        ((ah)object).c(calendar.get(12));
                        return true;
                    }
                    case -391: {
                        ((ah)object).c(calendar.get(13));
                        return true;
                    }
                    case -394: {
                        ((ah)object).c(calendar.getTimeZone().getOffset(1, calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(7), (calendar.get(11) * 60 + calendar.get(12)) * 60 * 1000) / 60000);
                        return true;
                    }
                    case -44: {
                        ((ah)object).a(calendar.getTime().toString());
                        return true;
                    }
                    case -47: {
                        ((ah)object).c((int)(calendar.getTime().getTime() / 1000L));
                        return true;
                    }
                }
            }
        }
        throw new NoSuchElementException("no such method " + n + " in type " + this.a);
    }

    private static int a(ah ah2, af af2, ah ah3) {
        if (ah2 == null) {
            ah2 = new ah();
        }
        af2 = (ad)af2;
        if (((ad)af2).a != 32) {
            throw new ClassCastException("called regex match on a non-regex");
        }
        ab ab2 = (ab)((ad)af2).a;
        ((ad)af2).a(ah2, "pc");
        int n = ah2.b();
        ab2.a(ah2, af2, n, ah3, null);
        return ah2.b();
    }

    public final boolean a(ah object, Object object2) {
        try {
            object2 = (af)object2;
            if (object == null) {
                object = new ah();
            }
            if (!this.a((ah)object, "prototype")) {
                return false;
            }
            object = ((ah)object).a();
            for (object2 = ((af)object2).a(); object2 != null; object2 = ((af)object2).a()) {
                if (object2 != object) continue;
                return true;
            }
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    public final String toString() {
        ah ah2 = new ah();
        this.b(ah2, this, "toString", null);
        return (String)ah2.a();
    }

    public final af a() {
        if (this.a == null) {
            this.a = ad.b(this.a);
        }
        return this.a;
    }

    public final boolean b(ah ah2, int n) {
        Object e;
        if (this.a != 3 || n < 0) {
            return super.a(ah2, String.valueOf(n));
        }
        Vector vector = (Vector)this.a;
        try {
            e = vector.elementAt(n);
        }
        catch (Exception exception) {
            return false;
        }
        if (e instanceof int[]) {
            ah2.c(((int[])e)[0]);
        } else {
            ah2.a(e);
        }
        return true;
    }

    public final void a(int n, Object object) {
        int n2;
        if (this.a != 3 || n < 0) {
            super.a_(String.valueOf(n), object);
            return;
        }
        Vector<Object> vector = (Vector<Object>)this.a;
        if (vector == null) {
            this.a = vector = new Vector<Object>();
        }
        if (n > (n2 = vector.size()) - 1) {
            ad.a(vector, n + 1);
        }
        if (object instanceof ah) {
            if (((ah)object).e()) {
                object = ((ah)object).a();
            } else {
                Object object2 = vector.elementAt(n);
                object2 = object2 instanceof int[] ? (Object)((int[])object2) : (Object)new int[1];
                object2[0] = ((ah)object).b();
                object = object2;
            }
        }
        vector.setElementAt(object, n);
    }

    public final boolean a(ah ah2, String string) {
        if (this.a != 3) {
            return super.a(ah2, string);
        }
        if (ah.a(string)) {
            try {
                int n = Integer.parseInt(string);
                return this.b(ah2, n);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return super.a(ah2, string);
    }

    public final void a_(String string, Object object) {
        if (this.a != 3) {
            super.a_(string, object);
            return;
        }
        if (ah.a(string)) {
            try {
                int n = Integer.parseInt(string);
                this.a(n, object);
                return;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        super.a_(string, object);
    }

    public final boolean c(ah ah2, int n) {
        if (this.a == 3) {
            Vector vector;
            if (ah2 == null) {
                ah2 = new ah();
            }
            if ((vector = (Vector)this.a) != null && n >= 0 && n < vector.size()) {
                return true;
            }
        }
        return super.d(ah2, String.valueOf(n));
    }

    public final boolean a(int n) {
        if (this.a != 3) {
            return super.a(String.valueOf(n));
        }
        Vector vector = (Vector)this.a;
        if (vector != null && n >= 0 && n < vector.size()) {
            vector.setElementAt(ab.a(), n);
            return true;
        }
        return false;
    }

    public final boolean a(String string) {
        if (this.a != 3) {
            return super.a(string);
        }
        try {
            int n = Integer.parseInt(string);
            return this.a(n);
        }
        catch (NumberFormatException numberFormatException) {
            return super.a(string);
        }
    }

    public final String a_() {
        switch (this.a) {
            case 1: 
            case 10: 
            case 11: 
            case 33: {
                return "Object";
            }
            case 2: 
            case 13: {
                return "String";
            }
            case 3: 
            case 12: {
                return "Array";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 14: 
            case 16: 
            case 19: 
            case 22: 
            case 25: 
            case 28: 
            case 31: {
                return "Function";
            }
            case 15: 
            case 17: {
                return "Boolean";
            }
            case 18: 
            case 20: {
                return "Number";
            }
            case 21: 
            case 23: {
                return "Error";
            }
            case 24: 
            case 26: {
                return "TypeError";
            }
            case 27: 
            case 29: {
                return "RangeError";
            }
            case 30: {
                return "Date";
            }
        }
        throw new RuntimeException();
    }

    public final boolean a() {
        switch (this.a) {
            case 1: 
            case 2: 
            case 3: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 20: 
            case 21: 
            case 23: 
            case 24: 
            case 26: 
            case 27: 
            case 29: 
            case 32: 
            case 33: {
                return false;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 14: 
            case 16: 
            case 19: 
            case 22: 
            case 25: 
            case 28: 
            case 31: {
                return true;
            }
        }
        throw new RuntimeException();
    }

    final boolean b(ah ah2, String string) {
        int n = ad.a(string);
        if (n == 0) {
            return true;
        }
        return !this.a(ah2, n);
    }

    public final Vector a(ah object, Vector vector) {
        vector = super.a((ah)object, vector);
        if (this.a == 3 && (object = (Vector)this.a) != null) {
            int n = ((Vector)object).size();
            for (int i = 0; i < n; ++i) {
                vector.addElement(String.valueOf(i));
            }
        }
        return vector;
    }
}
