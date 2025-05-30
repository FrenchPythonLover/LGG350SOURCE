/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class au
extends ai {
    public static au a = null;
    private ai a;
    private ai c;
    private ai d;
    private ai e;
    private ai f;
    public aj a;
    public aj b;
    private aj c;
    private aj d;
    private aj e;
    private Object q;
    private Object r;
    private static String k = null;
    private boolean p;

    public au(String string, String string2, String string3, String string4, boolean bl) {
        super(true);
        this.o("softkeys");
        if (string == null) {
            string = "";
        }
        this.a = new aj(string, false, Integer.toString(1));
        ((bd)((Object)this.a)).a(this.a);
        if (string2 == null) {
            string2 = "";
        }
        this.b = new aj(string2, false, Integer.toString(1));
        ((bd)((Object)this.a)).a(this.b);
        this.q = string3;
        this.r = string4;
        this.a = new ai(false);
        this.a.o("softkeysoptions");
        this.a.a = (byte)3;
        this.a.j("[sofkeys-options]");
        this.c = new aj("", false, Integer.toString(1));
        if (bl) {
            a = this;
        }
    }

    public final void a() {
        super.a();
        if (this.a != null) {
            this.a.a();
        }
        if (this.c != null) {
            this.c.a();
        }
        if (this.d != null) {
            this.d.a();
        }
        if (this.e != null) {
            this.e.a();
        }
        if (this.f != null) {
            this.f.a();
        }
        a = null;
    }

    public final void a(ai ai2) {
        this.d = ai2;
        this.d = au.a(this.d, "[:soft-key-toggle-input-type:]");
    }

    public final void b(ai ai2) {
        this.c = ai2;
        au.a(this.c, "[:soft-key-toggle-native-input:]");
    }

    public final void c(ai ai2) {
        this.f = ai2;
        au.a(this.f, "[:soft-key-copy-text:]");
    }

    public final void d(ai ai2) {
        this.e = ai2;
        au.a(this.e, "[:soft-key-paste-text:]");
    }

    private static aj a(ai object, Object object2) {
        Object object3 = object2;
        object2 = object;
        ((ai)object).a = object3;
        ((ai)object).a.b = (byte)2;
        object2 = object;
        object = ((ai)object2).a;
        if (((bd)object).a() > 0 && (object2 = ((bd)object).a(0)) instanceof aj) {
            return (aj)((bd)object).a(0);
        }
        return null;
    }

    public final void b(Hashtable hashtable) {
        super.b(hashtable);
        this.a.b(hashtable);
        this.b.b(hashtable);
        ((av)((Object)this.b.a)).c = 8;
        this.a.b(hashtable);
    }

    public final Object b() {
        return this.q;
    }

    public final void b(Object object) {
        this.q = object;
    }

    public final Object c() {
        return this.r;
    }

    public final void c(Object object) {
        this.r = object;
    }

    public final void a(String string) {
        this.a.b(string);
        this.a(q.a(), q.b());
    }

    public final void b(String string) {
        this.b.b(string);
        this.a(q.a(), q.b());
    }

    public final void c(String string) {
        this.c.b(string);
    }

    public final String b() {
        return this.a.b();
    }

    public final String c() {
        return this.b.b();
    }

    public final aj a() {
        return this.a;
    }

    public final aj b() {
        return this.b;
    }

    public final void a(bc bc2) {
        this.a.a(bc2);
    }

    public final void a(int n2, int n3) {
        this.y = q.n;
        ((av)((Object)this.a.a)).a = ((av)((Object)this.a)).a;
        ((av)((Object)this.a.a)).u = ((av)((Object)this.a)).u;
        ((av)((Object)this.a.a)).w = ((av)((Object)this.a)).w;
        ((av)((Object)this.a.a)).v = ((av)((Object)this.a)).v;
        ((av)((Object)this.a.a)).x = ((av)((Object)this.a)).x;
        ((av)((Object)this.a.a)).q = 4;
        ((av)((Object)this.a.a)).f = true;
        ((av)((Object)this.a.a)).s = 40;
        ((av)((Object)this.b.a)).a = ((av)((Object)this.a)).a;
        ((av)((Object)this.b.a)).u = ((av)((Object)this.a)).u;
        ((av)((Object)this.b.a)).w = ((av)((Object)this.a)).w;
        ((av)((Object)this.b.a)).v = ((av)((Object)this.a)).v;
        ((av)((Object)this.b.a)).x = ((av)((Object)this.a)).x;
        ((av)((Object)this.b.a)).q = 8;
        ((av)((Object)this.b.a)).f = true;
        ((av)((Object)this.b.a)).s = 50;
        ((av)((Object)this.b.a)).c = 8;
        super.a(n2, n3);
    }

    public final ai a() {
        return this.a;
    }

    public final void a(aj aj2) {
        boolean bl = aj2 != null;
        this.e = aj2;
        if (this.f != null) {
            this.f.d(false);
            if (this.e != null && this.f != null && !this.e.b().equals("") && k == null) {
                this.f.d(bl);
            }
        }
        if (this.e != null) {
            this.e.d(false);
            if (this.e != null && k != null) {
                this.e.d(bl);
            }
        }
        au.m();
    }

    public final void i() {
        String string;
        k = string = this.e.b();
    }

    public final void j() {
        String string = this.e.b();
        string = string + k;
        this.e.a((Object)string);
        k = null;
    }

    public final aj c() {
        return this.e;
    }

    public final void c(boolean bl) {
        this.p = bl;
    }

    public final boolean b() {
        return this.p;
    }
}
