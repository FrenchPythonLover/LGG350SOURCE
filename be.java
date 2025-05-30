/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class be
extends ag {
    private int d = 0;
    private int e = 1;
    private ag a;
    private ag b;
    private ah a;
    private ah b;
    private ah c;
    private static ah d = new ah();
    private static ah e = new ah();
    protected boolean a;
    private boolean b;
    protected int a = 0;
    protected int b = 1;
    protected int c = 0;

    public be() {
        this(false);
    }

    public be(boolean bl) {
        this.b = bl;
        this.a = false;
    }

    public final int a() {
        return this.c;
    }

    public final void a() {
        this.a = true;
        this.a = 0;
        this.c();
    }

    public final void b() {
        this.a = false;
        this.d = this.e;
        this.a = this.b;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.a(false);
    }

    public boolean a(boolean bl) {
        if (this.b == -1) {
            return bl;
        }
        return this.d >= this.e;
    }

    public void c() {
        this.d = 0;
        if (this.a != null && this.b != null) {
            this.b.a(d, this.b, this.a);
            this.b = bj.a((af)d.a());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d() {
        if (!this.a) {
            return true;
        }
        if (this.d >= this.e) {
            return true;
        }
        ++this.d;
        if (this.a == null) return false;
        if (this.d == this.e) {
            this.a.a(d, this.a, this.c);
            if (this.b != -1 && ++this.a >= this.b) return true;
            this.c();
            return false;
        } else {
            if (this.c == null) return false;
            int n = this.b == null ? 0 : this.b.a();
            if (n != this.c.a()) {
                return false;
            }
            e.a(n);
            for (int i = 0; i < n; ++i) {
                if (this.b.b(i) == 1) {
                    int n2 = this.b.a(i);
                    int n3 = this.c.a(i);
                    e.a(i, n2 + (n3 - n2) * this.d / this.e);
                    continue;
                }
                e.a(i, this.b.a(i));
            }
            this.a.a(d, this.a, e);
        }
        return false;
    }

    public boolean a(ah ah2, int n) {
        switch (n) {
            case -310: 
            case -309: 
            case -307: 
            case -280: 
            case -279: {
                ah2.a(ag.b);
                break;
            }
            case -308: {
                ah2.c(this.b);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public final boolean a(int n, boolean bl, Object object, int n2) {
        switch (n) {
            case -308: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.b = n2;
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public boolean a(ah ah2, af af2, int n, ah ah3) {
        boolean bl = true;
        switch (n) {
            case -309: {
                this.a();
                break;
            }
            case -280: {
                this.b();
                break;
            }
            case -307: {
                af af3 = (af)ah3.a(4);
                af af4 = (af)ah3.a(3);
                ag ag2 = (ag)ah3.a(2);
                int n2 = ah3.a(1);
                ag ag3 = (ag)ah3.a(0);
                af2 = this;
                this.a = ag3;
                ((be)af2).e = n2;
                if (ag2 != null) {
                    ((be)af2).b = ag2;
                    ((be)af2).a = bj.a(af4);
                    ((be)af2).b = new ah();
                } else if (af4 != null) {
                    ((be)af2).b = bj.a(af4);
                }
                ((be)af2).c = af3 != null ? bj.a(af3) : null;
                break;
            }
            case -75: {
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }
}
