/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bf
extends be {
    private Vector a;
    private int d = 0;

    private bf(int n, boolean bl) {
        super(false);
        this.c = n;
        this.a = new Vector();
    }

    public bf(int n) {
        this(n, false);
    }

    public final void c() {
        if (this.c == 1) {
            this.d = 0;
            this.d();
            return;
        }
        for (int i = 0; i < this.a.size(); ++i) {
            be be2 = (be)this.a.elementAt(i);
            if (be2 == null) continue;
            be2.a();
        }
    }

    public final void a(be be2) {
        this.a(be2, false);
    }

    public final void a(be be2, boolean bl) {
        this.a.addElement(be2);
        if (!bl && this.a != false && this.c == 2) {
            be2.a();
        }
    }

    private void d() {
        if (this.d >= this.a.size()) {
            return;
        }
        be be2 = (be)this.a.elementAt(this.d);
        if (be2 != null) {
            be2.a();
        }
    }

    public final boolean d() {
        if (this.a == false) {
            return true;
        }
        if (this.c == 1) {
            be be2 = this;
            be2 = be2.d >= be2.a.size() ? null : (be)be2.a.elementAt(be2.d);
            if (be2 != null && ((be)be2).d()) {
                if (be2.b()) {
                    this.a.removeElementAt(this.d);
                } else {
                    ++this.d;
                }
                if (this.d >= this.a.size() && (this.b == -1 || ++this.a < this.b)) {
                    this.d = 0;
                }
                this.d();
            }
        } else {
            be be3;
            int n;
            boolean bl = true;
            for (n = 0; n < this.a.size(); ++n) {
                be3 = (be)this.a.elementAt(n);
                if (be3 == null || be3.d()) continue;
                bl = false;
            }
            if (bl) {
                for (n = 0; n < this.a.size(); ++n) {
                    be3 = (be)this.a.elementAt(n);
                    if (be3 == null || !be3.b()) continue;
                    this.a.removeElementAt(n);
                    --n;
                }
                if (this.b == -1 || ++this.a < this.b) {
                    for (n = 0; n < this.a.size(); ++n) {
                        be3 = (be)this.a.elementAt(n);
                        be3.a();
                    }
                }
            }
        }
        return this.c();
    }

    public final boolean a(boolean bl) {
        if (this.a == false) {
            return true;
        }
        boolean bl2 = true;
        if (this.c == 1) {
            bl2 = this.b == -1 ? bl : this.d >= this.a.size();
        } else {
            for (int i = 0; i < this.a.size(); ++i) {
                be be2 = (be)this.a.elementAt(i);
                if (be2 == null || be2.a(true)) continue;
                bl2 = false;
            }
        }
        return bl2;
    }

    public final boolean a(ah ah2, int n) {
        switch (n) {
            case -310: 
            case -279: 
            case -201: {
                ah2.a(ag.b);
                break;
            }
            case -307: {
                return false;
            }
            default: {
                return super.a(ah2, n);
            }
        }
        return true;
    }

    public final boolean a(ah object, af af2, int n, ah ah2) {
        switch (n) {
            case -279: {
                object = this;
                this.a = (Vector)false;
                break;
            }
            case -310: {
                object = this;
                this.a = (Vector)true;
                break;
            }
            case -201: {
                af2 = (be)ah2.a(0);
                object = this;
                ((bf)object).a((be)af2, false);
                break;
            }
            default: {
                return super.a((ah)object, af2, n, ah2);
            }
        }
        return true;
    }
}
