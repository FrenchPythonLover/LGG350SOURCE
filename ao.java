/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ao
extends bc {
    private aj a;
    protected ai a;
    private int a;
    private int b;
    private int c;
    private am a;
    private int d;
    private int e;
    public Vector a;
    public Object a;
    private String a;
    private an a = new aj("", false, "NOWRAP");

    public ao(String string) {
        this.o("menulist");
        this.a = new ai(false);
        this.a = new Vector();
        this.a = string;
        if (!bj.b(string)) {
            this.a = new an(this.a, 1, false);
            return;
        }
        this.a = am.a();
        this.c = this.a.a();
        this.b = this.a.a(">");
    }

    public final void a() {
        this.a.a();
        this.a = null;
        this.a.removeAllElements();
        this.a = null;
        this.a = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        this.a.a();
        this.a = null;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (g && f) {
            int n9 = u.j;
            int n10 = u.k;
            this.a(n9, n10);
            super.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
            u.a(this.l, this.m);
            bc bc2 = this.a;
            bc2 = (ai)bc2.a.a(this.a);
            bc2 = bc2.a.a(0);
            if (!this.a.b().equals(((aj)bc2).b())) {
                this.a.b(((aj)bc2).b());
            }
            this.a.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
            if (g) {
                u.a(this.d, this.e);
                if (this.a != null) {
                    this.a.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
                } else {
                    graphics.setColor(((av)((Object)this.a)).a);
                    ((am)this.a.a()).a(graphics, ">", 0, 0, 4, 0);
                }
                u.a(-this.d, -this.e);
            }
            u.a(-this.l, -this.m);
        }
    }

    public final void a(int n, int n2) {
        bc bc2;
        int n3;
        super.a(n, n2);
        Object object = this.a;
        object = ((ai)object).a;
        this.h = 0;
        this.i = 0;
        int n4 = n3 = ((bd)object).a();
        while (--n4 >= 0) {
            bc2 = ((bd)object).a(n4);
            ((bd)object).a(n4).y = -1;
            bc2.a(n, n2);
            if (bc2.h > this.h) {
                this.h = bc2.h;
            }
            if (bc2.i <= this.i) continue;
            this.i = bc2.i;
        }
        if (this.a != null) {
            this.a.a(n, n2);
            this.c = this.a.i;
            this.b = this.a.h;
        }
        this.a.a(n, n2);
        this.a.h = this.h;
        this.h += this.b + 6;
        if (this.i < this.c) {
            this.i = this.c;
        }
        this.o();
        this.b(n, n2);
        this.d = this.n - this.b;
        this.e = this.o - this.c >> 1;
        n4 = n3;
        while (--n4 >= 0) {
            bc2 = ((bd)object).a(n4);
            ((bd)object).a(n4).y = this.d;
            bc2.a(n, n2);
            bc2.a(n, n2, 0, true);
        }
    }

    public final void a(Object object) {
    }

    public final Object a() {
        return ((String[])this.a.elementAt(this.a))[1];
    }

    public final void e() {
        bc bc2 = this.a;
        int n = bj.a(((s)((Object)bc2)).a, 0);
        bc2 = this;
        this.a = n;
    }

    public final void b(Hashtable hashtable) {
        super.b(hashtable);
        ((av)((Object)this.a.a)).a = ((av)((Object)this.a)).a;
        ((av)((Object)this.a.a)).u = ((av)((Object)this.a)).u;
        ((av)((Object)this.a.a)).w = ((av)((Object)this.a)).w;
        ((av)((Object)this.a.a)).v = ((av)((Object)this.a)).v;
        ((av)((Object)this.a.a)).x = ((av)((Object)this.a)).x;
        ((av)((Object)this.a.a)).q = ((av)((Object)this.a)).q;
        this.a.a(this.a, hashtable, (boolean)this.a.i, (boolean)this.a.j);
    }

    public final void a(String string, String object) {
        this.a.addElement(new String[]{string, object});
        object = new ai(false);
        ((bc)object).o("menulistitem");
        bc bc2 = this.a;
        ((ai)object).a = Integer.toString(((ai)bc2).a.a());
        bc2 = new aj(string, false, Integer.toString(1));
        new aj(string, false, Integer.toString(1)).g = string;
        bc2.o("menulistitemtext");
        ((ai)object).a(bc2);
        this.a.a((bc)object);
    }

    public final void b() {
        this.a.removeAllElements();
        this.a.a(true);
    }

    public final void a(int n) {
        this.a = n;
    }

    public final int a() {
        return this.a;
    }

    public final void c() {
        ak.a(11, this.a);
        this.a.a.e = bj.a(((av)((Object)this.a)).e);
        this.a.a.c = bj.a(((av)((Object)this.a)).c);
        this.a.a.b = bj.a(((av)((Object)this.a)).b);
        this.a.a.f = bj.a(((av)((Object)this.a)).f);
        this.a.a.g = bj.a(((av)((Object)this.a)).g);
        this.a.a.h = bj.a(((av)((Object)this.a)).h);
        this.a.a.i = bj.a(((av)((Object)this.a)).i);
        this.a.a.a = ((av)((Object)this.a)).a;
        this.a.a.u = ((av)((Object)this.a)).u;
        this.a.a.w = ((av)((Object)this.a)).w;
        this.a.a.v = ((av)((Object)this.a)).v;
        this.a.a.x = ((av)((Object)this.a)).x;
        this.a.a.q = ((av)((Object)this.a)).q;
        this.a.a.d = ((av)((Object)this.a)).d;
        this.a.a.b = ((av)((Object)this.a)).b;
        if (((av)((Object)this.a)).a != null && !((av)((Object)this.a)).a.equals(this.a.a.a)) {
            this.a.a.d = false;
            this.a.a.e = true;
            this.a.a.a = bj.b(((av)((Object)this.a)).a);
        }
        this.a.a.a = ((av)((Object)this.a)).a;
        this.a.a.i = ((av)((Object)this.a)).i;
        this.a.a.j = ((av)((Object)this.a)).j;
        if (this.a.a.n != ((av)((Object)this.a)).n) {
            this.a.a.n = ((av)((Object)this.a)).n;
            this.a.a.d = false;
        }
        this.a.a.c = 1;
        this.a.a.m = ((av)((Object)this.a)).m;
        this.a.a.l = ((av)((Object)this.a)).l;
        this.a.a.j = ((av)((Object)this.a)).j;
        this.a.a.c = 1;
        this.a.y = this.h;
        this.a.a.d = (byte)3;
        this.a.a.z = this.j;
        int n2 = q.b();
        if (au.a != null) {
            n2 -= au.a.c();
        }
        this.a.a(q.a(), q.b());
        int n3 = this.k + this.i;
        if (n2 - n3 > this.k) {
            if (this.a.i + n3 > n2) {
                this.a.c(n2 - n3 - 5);
            }
            this.a.a.y = n3;
            if (this.a.a.c != null) {
                this.a.a.y -= this.a.a.c[0];
                return;
            }
        } else {
            if (this.a.i > this.k) {
                this.a.z = this.k - 5;
                this.a.a.y = 5;
            } else {
                this.a.a.y = this.k - this.a.i;
            }
            if (this.a.a.c != null) {
                this.a.a.y += this.a.a.c[0];
            }
        }
    }

    public final void g() {
        ak.a(11, this.a);
    }

    public final boolean a(ah object, int n2) {
        boolean bl = super.a((ah)object, n2);
        if (!bl) {
            switch (n2) {
                case -313: {
                    ((ah)object).c(this.a);
                    break;
                }
                case -312: {
                    ((ah)object).a(this.a);
                    break;
                }
                case -315: {
                    ah ah2 = object;
                    object = this;
                    ah2.a(((String[])((ao)object).a.elementAt(((ao)object).a))[1]);
                    break;
                }
                case -314: {
                    ah ah3 = object;
                    object = this;
                    ah3.a(((String[])((ao)object).a.elementAt(((ao)object).a))[0]);
                    break;
                }
                case -316: {
                    ((ah)object).a(ag.b);
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(int n2, boolean bl, Object object, int n3) {
        boolean bl2 = super.a(n2, bl, object, n3);
        if (!bl2) {
            switch (n2) {
                case -313: {
                    if (!bl) {
                        throw new RuntimeException();
                    }
                    this.a = n3;
                    break;
                }
                case -312: {
                    this.a = bj.a(object, "");
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(ah ah2, af af2, int n2, ah ah3) {
        if (!super.a(ah2, af2, n2, ah3)) {
            switch (n2) {
                case -316: {
                    this.a(ah3.b(0), ah3.b(1));
                    ao.m();
                    break;
                }
                default: {
                    throw new NoSuchElementException("no such method");
                }
            }
        }
        return true;
    }
}
