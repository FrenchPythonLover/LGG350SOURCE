/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bg
implements Enumeration {
    private char a;
    private int a;
    private int b;
    private int c;
    private String a;
    private String b;
    private boolean a;
    private boolean b;
    private static Vector a = new Vector();

    public static bg a(String string) {
        return bg.a(string, " \t\n\r\f", false);
    }

    public static bg a(String string, String string2) {
        return bg.a(string, string2, false);
    }

    public static bg a(String object, String string, boolean c) {
        bg bg2 = null;
        char c2 = '\u0001';
        int n = a.size();
        while (--n >= 0) {
            bg2 = (bg)a.elementAt(n);
            if (bg2.a()) continue;
            c2 = '\u0000';
            break;
        }
        if (c2 != '\u0000') {
            if (a.size() > 20) {
                a.removeAllElements();
            }
            bg2 = new bg();
            a.insertElementAt(bg2, 0);
        }
        c2 = c;
        String string2 = string;
        string = object;
        object = bg2;
        bg2.a = 0;
        ((bg)object).b = -1;
        ((bg)object).b = false;
        ((bg)object).a = string;
        ((bg)object).c = ((bg)object).a.length();
        ((bg)object).b = string2;
        ((bg)object).a = c2;
        if (((bg)object).b == null) {
            ((bg)object).a = '\u0000';
        } else {
            char c3 = '\u0000';
            for (int i = 0; i < ((bg)object).b.length(); ++i) {
                c2 = ((bg)object).b.charAt(i);
                if (c3 >= c2) continue;
                c3 = c2;
            }
            ((bg)object).a = c3;
        }
        return bg2;
    }

    private bg() {
    }

    public static void a() {
        a.removeAllElements();
    }

    private int a(int n) {
        char c;
        if (this.b == null) {
            throw new NullPointerException();
        }
        while (!this.a && n < this.c && (c = this.a.charAt(n)) <= this.a && this.b.indexOf(c) >= 0) {
            ++n;
        }
        return n;
    }

    private int b(int n) {
        char c;
        int n2;
        for (n2 = n; n2 < this.c && ((c = this.a.charAt(n2)) > this.a || this.b.indexOf(c) < 0); ++n2) {
        }
        if (this.a && n == n2 && (c = this.a.charAt(n2)) <= this.a && this.b.indexOf(c) >= 0) {
            ++n2;
        }
        return n2;
    }

    public final boolean a() {
        this.b = this.a(this.a);
        return this.b < this.c;
    }

    public final String a() {
        this.a = this.b >= 0 ? this.b : this.a(this.a);
        this.b = false;
        this.b = -1;
        if (this.a >= this.c) {
            throw new NoSuchElementException();
        }
        int n = this.a;
        this.a = this.b(this.a);
        return this.a.substring(n, this.a);
    }

    public final boolean hasMoreElements() {
        return this.a();
    }

    public final Object nextElement() {
        return this.a();
    }

    public final int a() {
        int n = 0;
        int n2 = this.a;
        while (n2 < this.c && (n2 = this.a(n2)) < this.c) {
            n2 = this.b(n2);
            ++n;
        }
        return n;
    }

    public final String[] a() {
        String[] stringArray = new String[this.a()];
        int n = 0;
        while (this.a()) {
            stringArray[n] = this.a();
            ++n;
        }
        return stringArray;
    }

    public final void b() {
        this.c = -1;
    }
}
