/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ac {
    private int d;
    private int e;
    int a;
    int b;
    private int f;
    private int g;
    private String[] a;
    private int h;
    private int i;
    private int j;
    private int k;
    int c;
    final ab a;

    ac(ab object, byte[] byArray) {
        this.a = object;
        this.a = null;
        object = this;
        ((ac)object).c = ab.a(((ac)object).a) == null ? 0 : ab.a(((ac)object).a).length;
        ((ac)object).e = byArray[0] & 0xFF;
        ((ac)object).e = (((ac)object).e << 8) + (byArray[1] & 0xFF);
        ((ac)object).e = (((ac)object).e << 8) + (byArray[2] & 0xFF);
        ((ac)object).e = (((ac)object).e << 8) + (byArray[3] & 0xFF);
        ab.a(((ac)object).a, ((ac)object).e);
        ((ac)object).d = ab.a(((ac)object).a, byArray, 4);
        if (((ac)object).d < 0 || ((ac)object).d > 2) {
            throw new RuntimeException("Unsupported version");
        }
        ((ac)object).a = ab.b(((ac)object).a, byArray, 5) + 8;
        ((ac)object).b = ab.b(((ac)object).a, byArray, ((ac)object).a - 4);
        if (((ac)object).b + 1 << 2 != ab.b(((ac)object).a, byArray, ((ac)object).a - 8)) {
            throw new RuntimeException("Bad size on int constants section");
        }
        ((ac)object).h = ab.b(((ac)object).a, byArray, 13) + 4;
        ab.b(((ac)object).a, byArray, ((ac)object).h - 4);
        ((ac)object).f = ab.b(((ac)object).a, byArray, 9) + 8;
        ((ac)object).g = ab.b(((ac)object).a, byArray, ((ac)object).f - 4);
        ab.b(((ac)object).a, byArray, ab.b(((ac)object).a, byArray, 17));
        ((ac)object).i = ab.b(((ac)object).a, byArray, 17) + 4;
        ((ac)object).j = ab.b(((ac)object).a, byArray, 21) + 8;
        ((ac)object).k = ab.b(((ac)object).a, byArray, ((ac)object).j - 4);
        if ((((ac)object).k << 2 << 1) + 4 != ab.b(((ac)object).a, byArray, ab.b(((ac)object).a, byArray, 21))) {
            throw new RuntimeException("Bad size on function table section");
        }
        ((ac)object).a += ((ac)object).c;
        ((ac)object).h += ((ac)object).c;
        ((ac)object).f += ((ac)object).c;
        ((ac)object).j += ((ac)object).c;
    }

    String a(int n) {
        String string;
        if (n > this.g - 1 || n < 0) {
            throw new RuntimeException("bad string constant number");
        }
        if (this.a == null) {
            this.a = new String[this.g];
        }
        if (this.a[n] != null) {
            return this.a[n];
        }
        int n2 = this.f + (n << 2);
        int n3 = ab.b(this.a, n2);
        n2 = ab.b(this.a, n2 + 2);
        try {
            string = new String(ab.a(this.a), this.h + n3, n2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new Error("UTF-8 not supported?");
        }
        this.a[n] = string;
        return string;
    }

    static int a(ac ac2, String string) {
        for (int i = 0; i < ac2.k; ++i) {
            String string2 = ac2.a(ab.c(ac2.a, ac2.j + (i << 3)));
            if (!string.equals(string2)) continue;
            return ab.c(ac2.a, ac2.j + (i << 3) + 4) + ac2.c;
        }
        return -1;
    }

    static String a(ac ac2, int n) {
        return ac2.a(n);
    }

    static int a(ac ac2) {
        return ac2.i;
    }
}
