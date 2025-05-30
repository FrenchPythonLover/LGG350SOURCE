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
public class ai
extends bc {
    public boolean a;
    public boolean b;
    public boolean c;
    public int a;
    public int b;
    private int e;
    public bd a;
    public Object a;
    public Object c;
    public Object d;
    public boolean d;
    byte a;
    private boolean p;
    public boolean e;
    private aw a;
    private int C;
    private int D;
    private int E;
    public int c;
    private int F;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    private short[] a = new bd();
    public int d;
    private int G;
    private bc b;
    private int H;
    private int I;
    private boolean q;
    private int J;

    public ai(boolean bl) {
        this.p = bl;
        if (!bl) {
            this.o("vbox");
            return;
        }
        this.o("hbox");
    }

    public void a() {
        super.a();
        if (this.a != null) {
            int n = this.a.a();
            while (--n >= 0) {
                bc bc2 = this.a.a(n);
                bc2.a();
            }
            this.a.a();
            this.a = null;
            this.a = null;
        }
    }

    public final void b() {
        this.o("window");
        this.a = 1;
    }

    public final void c() {
        this.o("popup");
        this.a.b = (byte)2;
        this.a = (byte)2;
    }

    public final bc a(bc bc2) {
        int n = this.a.a();
        bc bc3 = null;
        for (int i = 0; i < n; ++i) {
            bc bc4 = this.a.a(i);
            if (bc4 == bc2) {
                return bc3;
            }
            bc3 = bc4;
        }
        return null;
    }

    public void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.d = false;
        if (this.J == 0) {
            int n10;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            Object object = 0;
            Object object2 = 0;
            int n14 = u.j;
            Object object3 = u.k;
            int n15 = 0;
            boolean bl = false;
            n15 = 0;
            int n16 = 0;
            int n17 = 0;
            int n18 = 0;
            int n19 = 0;
            n15 = 0;
            if (!this.p && this.a.d != 16 && this.a.d != 0) {
                this.j += this.f;
            } else if (this.p && this.a.c != 4 && this.a.c != 0) {
                this.k += this.g;
            }
            n14 = this.a(n14, (int)object3) ? 1 : 0;
            if (this.q && this.a.m == 4) {
                this.A += this.a();
                u.a(this.A, 0);
                object3 = u.k;
            }
            super.a(graphics, n2, n3, n4, n5, n6, n7, n8, n9);
            if (this.a != null) {
                n10 = graphics.getClipY();
                if (this.k < n10) {
                    this.a = n10;
                    this.b = (int)(this.i - (n10 - this.k));
                } else {
                    this.a = (int)this.k;
                    this.b = (int)this.i;
                }
            }
            n10 = this.n != false ? (int)(this.m + object3) : n7;
            int n20 = this.n != false ? (int)(this.o + n10) : n9;
            bc bc2 = null;
            if (n14 != 0) {
                this.b(graphics, (int)this.l, (int)this.m, (int)this.n, (int)this.o);
            } else {
                this.a(graphics, (int)this.l, (int)this.m, (int)this.n, (int)this.o);
            }
            ai.a(this.c);
            int n21 = this.a.a();
            for (int i = 0; i < n21; ++i) {
                int n22;
                n15 = object3 + n12;
                bc2 = this.a.a(i);
                boolean bl2 = bl = bc2.a.d == 2 || bc2.a.d == 3;
                if (n15 + this.c > object3 + this.i) {
                    ai.b(bc2);
                    break;
                }
                if (this.p && this.a != null && i < this.a.length && object2 != this.a[i]) {
                    n22 = this.a[i] - object2;
                    u.a(-n11, n22);
                    object2 = this.a[i];
                    n11 = 0;
                    n12 += n22;
                    n17 = n18;
                    n19 = 0;
                    n15 += n22;
                }
                n16 = 0;
                int[] nArray = bc2.a.k == null ? av.a : bc2.a.k;
                n22 = bc2.e();
                if (n22 == 0) {
                    if (bc2.a.d == 16 || bc2.a.d == 0) {
                        n16 = nArray[0] >= 0 && n17 >= 0 ? Math.max(nArray[0], n17) : (nArray[0] < 0 && n17 < 0 ? Math.min(nArray[0], n17) : nArray[0] + n17);
                    }
                    int n23 = n15 + this.c + this.m;
                    n15 = n23 + bc2.i;
                    if (n22 == 0 && (n10 <= n15 && n20 >= n23 || bl || q.a.u == 11)) {
                        n15 = 0;
                        if (!this.p && bc2.a.d != 0 && bc2.a.d != 16) {
                            n15 = n12;
                        }
                        u.a((int)this.l, (int)(this.m + n16 - n15));
                        bc2.a(graphics, n2, n3, n4, n5, (int)this.f, n10, (int)(this.f + this.h), n20);
                        u.a((int)(-this.l), (int)(-this.m - n16 + n15));
                        if (bc2 instanceof ai && ((ai)bc2).a != null) {
                            n15 = n23 + n16;
                            int n24 = n15 + bc2.i;
                            if (n15 >= n10 && n24 <= n20) {
                                ((ai)bc2).d = true;
                            } else if (n15 >= n10 && n15 < n20) {
                                if (60 <= (n20 - n15) * 100 / bc2.i) {
                                    ((ai)bc2).d = true;
                                }
                            } else if (n24 > n10 && n24 <= n20) {
                                if (60 <= (n24 - n10) * 100 / bc2.i) {
                                    ((ai)bc2).d = true;
                                }
                            } else if (n23 <= n10 && n24 >= n20) {
                                ((ai)bc2).d = true;
                            }
                        }
                    } else {
                        if (bc2 instanceof ai) {
                            ((ai)bc2).h();
                        }
                        ai.b(bc2);
                    }
                }
                if (n22 != 2) {
                    if (!this.p) {
                        if (!bl) {
                            n17 = nArray[2];
                            object = bc2.i + n16;
                            u.a(0, object);
                        }
                    } else if (!bl) {
                        n13 = bc2.h + nArray[3] + nArray[1];
                        u.a(n13, 0);
                        n15 = bc2.i + n16;
                        if (n15 > n19) {
                            n19 = n15;
                            n18 = nArray[2];
                        }
                    }
                } else {
                    n13 = 0;
                    object = 0;
                }
                n11 += n13;
                n12 += object;
            }
            ai.a(-this.c);
            u.a(-n11, -n12);
            this.a(graphics);
            u.a(-this.A, -this.B);
            if (g != false) {
                if (this.q) {
                    Graphics graphics2 = graphics;
                    ai ai2 = this;
                    if (ai2.C > 0) {
                        n13 = (ai2.a.z == Integer.MIN_VALUE ? 0 : ai2.a.z) - (ai2.a.B == Integer.MIN_VALUE ? 0 : ai2.a.B);
                        object = (ai2.a.y == Integer.MIN_VALUE ? 0 : ai2.a.y) - (ai2.a.A == Integer.MIN_VALUE ? 0 : ai2.a.A);
                        object = ai2.m + object;
                        object2 = 2;
                        n14 = 3;
                        if (ai2.a.m == 4) {
                            n13 = ai2.t;
                            object2 = 0;
                            n14 = 1;
                        } else {
                            n13 = ai2.t + ai2.u - ai2.F + n13;
                        }
                        u.a(n13, object);
                        object3 = ai2.o - 6;
                        graphics2.setColor(ai2.a.l);
                        graphics2.fillRect(object2 + u.j, 3 + u.k, ai2.F - 2, object3);
                        object2 = 0;
                        object2 = 0;
                        if (ai2.C > 0) {
                            object2 = ai2.o - 6 << 10;
                            object3 = ai2.o * (ai2.o - 6) / ai2.E;
                            object2 = ai2.D * (object2 - (object3 << 10)) / (ai2.C << 10) + (object2 % 1024 >= 512 ? 1 : 0);
                            object3 += object2;
                        }
                        object2 += 4;
                        if (ai2.a.a) {
                            n15 = object3 - object2;
                            for (object3 = 0; object3 < n15; ++object3) {
                                graphics2.setColor(ai2.a.j[object3 % ai2.a.j.length]);
                                graphics2.drawLine(n14 + u.j, object2 + object3 + u.k, n14 + 2 + u.j, object2 + object3 + u.k);
                            }
                        } else {
                            n15 = ai2.a.j.length;
                            while (--n15 >= 0) {
                                graphics2.setColor(ai2.a.j[n15]);
                                graphics2.drawLine(n14 + n15 + u.j, object2 + u.k, n14 + n15 + u.j, object3 + u.k);
                            }
                        }
                        u.a(-n13, -object);
                    }
                }
                if (this.a == 1 && !u.b && au.a != null) {
                    u.a(0, (int)this.i);
                    au.a.a(graphics, n2, n3, n4, n5, n6, n7, n8, n9);
                    u.a(0, (int)(-this.i));
                }
            }
        }
    }

    private static void b(bc bc2) {
        if (bc2 instanceof ai) {
            int n2 = ((ai)bc2).a.a();
            while (--n2 >= 0) {
                ai.b(((ai)bc2).a.a(n2));
            }
            return;
        }
        if (bc2 instanceof aj) {
            ((aj)bc2).b();
        }
    }

    private static void a(int n2) {
        if (n2 != 0) {
            ak.b += n2;
            u.a(0, n2);
        }
    }

    public void a(bc bc2) {
        if (bc2 instanceof aj) {
            if (((aj)bc2).a) {
                this.c(true);
            }
        } else if (bc2 instanceof aw) {
            this.a = (aw)bc2;
        }
        this.a.a(bc2);
        bc2.e(this);
        this.p();
        this.q();
    }

    private void c(boolean bl) {
        if (this.b != null) {
            super.c(bl);
        }
        this.e = bl;
    }

    public final boolean a(int n2, boolean bl) {
        bl = true;
        try {
            bc bc2 = this.a.a(n2);
            this.a.a(n2);
            bc2.a();
            this.p();
        }
        catch (Exception exception) {
            bl = false;
        }
        this.q();
        return bl;
    }

    public final void a(boolean bl) {
        if (bl) {
            bc bc2 = null;
            int n2 = this.a.a();
            while (--n2 >= 0) {
                bc2 = this.a.a(n2);
                bc2.a();
            }
        }
        this.q();
        this.a.a();
    }

    public final bc[] a() {
        bc bc2 = null;
        bc[] bcArray = new bc[this.a.a()];
        int n2 = this.a.a();
        while (--n2 >= 0) {
            bcArray[n2] = bc2 = this.a.a(n2);
        }
        return bcArray;
    }

    public void a(int n2, int n3) {
        this.J = this.e();
        if (this.J != 2) {
            Object object;
            int n4;
            this.q = this.b();
            int n5 = n2;
            bc bc2 = this;
            if (((ai)bc2).a == 1) {
                if (!((ai)bc2).a) {
                    ((ai)bc2).y = ((ai)bc2).y != -1 ? (((ai)bc2).l != false ? ((ai)bc2).y * n5 / 100 : ((ai)bc2).y) : (((ai)bc2).a.s != -1 ? (((ai)bc2).a.s == Integer.MIN_VALUE ? n5 : (((ai)bc2).a.f ? ((ai)bc2).a.s * n5 / 100 : ((ai)bc2).a.s)) : q.n);
                    ((ai)bc2).a = true;
                }
                if (!((ai)bc2).b) {
                    ((ai)bc2).z = ((ai)bc2).z != -1 ? (((ai)bc2).m != false ? ((ai)bc2).z * n3 / 100 : ((ai)bc2).z) : (((ai)bc2).a.t != -1 ? (((ai)bc2).a.t == Integer.MIN_VALUE ? n3 : (((ai)bc2).a.g ? ((ai)bc2).a.t * n3 / 100 : ((ai)bc2).a.t)) : q.o);
                    if (au.a != null) {
                        au.a.a(n5, n3);
                        ((ai)bc2).z -= au.a.i;
                    }
                    ((ai)bc2).b = true;
                }
                n3 = ((ai)bc2).z;
                ((ai)bc2).l = false;
                ((ai)bc2).m = false;
            }
            super.a(n2, n3);
            bc2 = this;
            ((ai)bc2).a(((ai)bc2).a.c);
            if (((ai)bc2).q) {
                if (((ai)bc2).a.j == null) {
                    ((ai)bc2).a.j = new int[]{0xAAAAAA, 0x505050, 0x838383};
                    ((ai)bc2).a.a = true;
                }
                ((ai)bc2).F = ((ai)bc2).a.j.length + 2 + 2;
            }
            bc2 = null;
            n5 = 0;
            int n6 = 0;
            int n7 = 0;
            short s2 = 0;
            n5 = 0;
            n5 = 0;
            n5 = 0;
            int n8 = 0;
            int n9 = 0;
            n5 = this.p + this.q;
            int n10 = this.r + this.s;
            int n11 = this.b != null && this.b.e != 0 ? this.b.e : n2;
            int n12 = this.y == -1 ? (this.a.s == -1 ? 0 : (this.a.f ? this.a.s * n11 / 100 : this.a.s)) : (n4 = this.l != false ? this.y * n11 / 100 : this.y);
            if (this.a.s == Integer.MIN_VALUE) {
                n11 = n2;
                n4 = n2;
            } else if (n4 != 0) {
                n2 = n11;
                n11 = n4;
            } else {
                n11 = n2;
            }
            n11 -= this.a() + n5;
            int n13 = this.a.t == Integer.MIN_VALUE ? n3 : (this.z == -1 ? (this.a.t == -1 ? n3 : (this.a.g ? this.a.t * n3 / 100 : this.a.t)) : (this.m != false ? this.z * n3 / 100 : this.z)) - n10;
            this.b = null;
            int n14 = this.a.a();
            Object object2 = object = this.a.d == 1 ? this : (Object)this.a;
            if (this.p && (this.a == null || this.a.length != n14)) {
                this.a = new short[n14];
            }
            for (int i = 0; i < n14; ++i) {
                int[] nArray;
                boolean bl = false;
                bc2 = this.a.a(i);
                this.a.a(i).a = object;
                if (bc2.e() == 2) continue;
                int[] nArray2 = nArray = bc2.a.k == null ? av.a : bc2.a.k;
                if (!this.p) {
                    if (bc2.a.t == Integer.MIN_VALUE) {
                        this.b = bc2;
                        n5 = ai.a(nArray, n8);
                        this.i += n5 + n8;
                        this.H = nArray[3] + nArray[1];
                        continue;
                    }
                    bc2.a(n11, n13);
                    if (bc2.a.d == 2 || bc2.a.d == 3) continue;
                    n5 = ai.a(nArray, n8);
                    n8 = nArray[2];
                    this.i += bc2.i + n5 + n8;
                    n5 = bc2.h + nArray[3] + nArray[1];
                    if (n5 <= this.h) continue;
                    this.h = n5;
                    continue;
                }
                if (!this.p) continue;
                if (n4 != 0) {
                    this.e = n11;
                }
                if (bc2.a.s == Integer.MIN_VALUE) {
                    this.b = bc2;
                    this.h += nArray[3] + nArray[1];
                    this.I = ai.a(nArray, n8) + nArray[2];
                } else {
                    n5 = n11 - n6;
                    if (n5 < 10) {
                        n5 = n11;
                        bl = true;
                    }
                    bc2.a(n5, n13);
                    n5 = bc2.h + nArray[3] + nArray[1];
                    if (n6 + n5 > n11 && n6 != 0 || bl) {
                        this.a[i] = (short)(n7 + this.i - n9);
                        s2 = this.a[i];
                        n6 = n5;
                        this.i += n7;
                        n7 = 0;
                        n8 = n9;
                    } else {
                        this.a[i] = s2;
                        n6 += n5;
                    }
                    n5 = ai.a(nArray, n8);
                    n5 = bc2.i + n5 + nArray[2];
                    if (n5 > n7) {
                        n9 = Math.min(n5 - n7, nArray[2]);
                        n7 = n5;
                    }
                }
                this.h = Math.max(n6, (int)this.h);
            }
            if (this.b != null) {
                if (!this.p) {
                    this.b.a(n11, n13 - this.i);
                    if (bc2.a.d != 2 && bc2.a.d != 3) {
                        this.i += bc2.i;
                        n5 = bc2.h + this.H;
                        if (n5 > this.h) {
                            this.h = n5;
                        }
                    }
                } else {
                    this.b.a(n11 - this.h, n13);
                    if (bc2.a.d != 2 && bc2.a.d != 3) {
                        this.h += bc2.h;
                        n5 = bc2.h + this.I;
                        if (n5 > this.i) {
                            this.i = n5;
                        }
                    }
                }
            }
            if (this.p) {
                this.i += n7;
            }
            if (this.q || this.a == 1 && 0L == (this.a.a & 0x800000000L)) {
                n5 = n3;
                bc2 = this;
                n5 = ((ai)bc2).z != -1 ? (((ai)bc2).m != false ? ((ai)bc2).z * n5 / 100 : ((ai)bc2).z) : (((ai)bc2).a.g ? ((ai)bc2).a.t * n5 / 100 : (((ai)bc2).a.t == Integer.MIN_VALUE ? n5 : ((ai)bc2).a.t));
                ((ai)bc2).G = (int)(((ai)bc2).i - (n5 - (((ai)bc2).r + ((ai)bc2).s)));
                ((ai)bc2).C = ((ai)bc2).G / q.a + (((ai)bc2).G % q.a > 0 ? 1 : 0);
                ((ai)bc2).E = (int)((ai)bc2).i;
                if (((ai)bc2).C <= 0) {
                    ((ai)bc2).b(false);
                } else if (((ai)bc2).D > 0 && ((ai)bc2).D > ((ai)bc2).C) {
                    n5 = ((ai)bc2).D - ((ai)bc2).C;
                    ((ai)bc2).c += q.a * n5;
                    ((ai)bc2).D = ((ai)bc2).C;
                }
                u.a = this;
            } else {
                this.C = 0;
            }
            this.o();
            this.b(n2, n3);
        } else {
            this.h = false;
            this.i = false;
        }
        if (this.k != false && this.q && this.E > this.i) {
            this.D = this.C;
            this.c = -(this.D * q.a);
        }
        if (this.a == 1 && 0L == (this.a.a & 0x800000000L) && this.E > this.i - this.r - this.s) {
            this.a.c = 1;
            this.a.a |= 0x800000000L;
            this.a(n2, n3);
        }
    }

    private static int a(int[] nArray, int n2) {
        int n3 = 0;
        if (nArray[0] >= 0 && n2 >= 0) {
            if (nArray[0] > n2) {
                n3 = nArray[0] - n2;
            }
        } else if (nArray[0] < 0 && n2 < 0) {
            if (nArray[0] < n2) {
                n3 = n2 - nArray[0];
            }
        } else {
            n3 = nArray[0];
        }
        return n3;
    }

    public final void d() {
        int n2;
        super.d();
        Object var1_1 = null;
        int n3 = n2 = this.a.a();
        while (--n3 >= 0) {
            bc bc2 = this.a.a(n3);
            bc2.d();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(int n2, int n3, int n4, boolean bl) {
        bc bc2 = null;
        reference var6_6 = this.n - this.a();
        int n5 = this.a.a();
        for (int i = 0; i < n5; ++i) {
            void var6_7;
            bc2 = this.a.a(i);
            bc2.a((int)var6_7, (int)this.o, 20, true);
            if (!this.p) continue;
            int[] nArray = bc2.a.k == null ? av.a : bc2.a.k;
            var6_7 -= bc2.h + nArray[3] + nArray[1];
        }
        switch (this.a) {
            case 2: {
                if (this.d != 0) break;
                n4 = 3;
                bl = true;
                break;
            }
            case 3: {
                n4 = 36;
                n3 -= au.a.i;
                bl = false;
                break;
            }
            case 1: {
                this.a.c = 4;
                this.a.d = 16;
            }
        }
        super.a(n2, n3, n4, bl);
    }

    public final void e() {
    }

    public final void f() {
        super.f();
    }

    public Object[] a(Hashtable hashtable) {
        this.a(this, hashtable, true, (boolean)this.j);
        return new Object[]{this, this.c};
    }

    public Object a(Hashtable hashtable) {
        this.a(this, hashtable, false, (boolean)this.j);
        return this.d;
    }

    public final void a(boolean bl, Hashtable hashtable) {
        if (this.j != bl) {
            this.a(this, hashtable, (boolean)this.i, bl);
        }
    }

    protected final void a(ai ai2, Hashtable hashtable, boolean bl, boolean bl2) {
        if (ai2 != null && this.a != null) {
            int n2;
            ai2.i = bl;
            ai2.j = bl2;
            ai2.b(hashtable);
            ai ai3 = ai2;
            bd bd2 = ai3.a;
            int n3 = n2 = bd2.a();
            while (--n3 >= 0) {
                bc bc2 = bd2.a(n3);
                if (bc2 instanceof ai) {
                    this.a((ai)bc2, hashtable, bl, bl2);
                    continue;
                }
                bc2.i = bl;
                bc2.j = bl2;
                bc2.s();
                bc2.b(hashtable);
            }
            ai2.s();
        }
    }

    public bc a(String string) {
        int n2;
        if (string == null) {
            return null;
        }
        if (string.equals(this.g)) {
            return this;
        }
        Object var2_2 = null;
        int n3 = n2 = this.a.a();
        while (--n3 >= 0) {
            bc bc2 = this.a.a(n3);
            if (string.equals(bc2.e())) {
                return bc2;
            }
            if (!(bc2 instanceof ai) || (bc2 = ((ai)bc2).a(string)) == null) continue;
            return bc2;
        }
        return null;
    }

    public ai a(int n2, int n3) {
        ai ai2;
        block10: {
            block11: {
                block12: {
                    block9: {
                        ai2 = null;
                        if (this.a == null) break block9;
                        ai2 = this.a.a(n2, n3);
                        break block10;
                    }
                    if (this.C <= 0) break block11;
                    if (n3 > 0) {
                        if (this.D + n3 < this.C) {
                            this.D += n3;
                            ai2 = this;
                        } else if (this.D < this.C) {
                            this.D = this.C;
                            ai2 = this;
                        }
                    } else if (this.D + n3 > 0) {
                        this.D += n3;
                        ai2 = this;
                    } else if (this.D > 0) {
                        this.D = 0;
                        ai2 = this;
                    }
                    this.c = -(q.a * this.D);
                    if (this.c <= 0) break block12;
                    this.c = 0;
                    break block10;
                }
                if (this.G >= -this.c) break block10;
                this.c = -this.G;
                break block10;
            }
            int n4 = this.a.a();
            bc bc2 = null;
            for (int i = 0; !(i >= n4 || (bc2 = this.a.a(i)) instanceof ai && null != (ai2 = ((ai)bc2).a(n2, n3))); ++i) {
            }
        }
        return ai2;
    }

    public final ai a(int n2) {
        ai ai2;
        block10: {
            block11: {
                block12: {
                    block9: {
                        ai2 = null;
                        if (this.a == null) break block9;
                        ai2 = this.a.a(n2);
                        break block10;
                    }
                    if (this.C <= 0) break block11;
                    if (n2 < 0) {
                        if (-(this.c + n2) < this.G) {
                            this.c += n2;
                            ai2 = this;
                        } else if (-this.c < this.G) {
                            this.c = -this.G;
                            ai2 = this;
                        }
                    } else if (-(this.c + n2) > 0) {
                        this.c += n2;
                        ai2 = this;
                    } else if (-this.c > 0) {
                        this.c = 0;
                        ai2 = this;
                    }
                    this.D = -this.c / q.a + (-this.c % q.a > 0 ? 1 : 0);
                    if (this.c <= 0) break block12;
                    this.c = 0;
                    break block10;
                }
                if (this.G >= -this.c) break block10;
                this.c = -this.G;
                break block10;
            }
            int n3 = this.a.a();
            bc bc2 = null;
            for (int i = 0; !(i >= n3 || (bc2 = this.a.a(i)) instanceof ai && null != (ai2 = ((ai)bc2).a(n2))); ++i) {
            }
        }
        return ai2;
    }

    public final void b(boolean bl) {
        this.c = 0;
        this.D = 0;
        if (bl) {
            ai ai2 = this;
            int n2 = ai2.a.a();
            bc bc2 = null;
            while (--n2 >= 0) {
                bc2 = ai2.a.a(n2);
                if (!(bc2 instanceof ai)) continue;
                ((ai)bc2).b(true);
            }
        }
    }

    public void g() {
        String string = this.f == null ? "none" : this.f;
        this.a = "Page.get(s:" + this.e + ",s:null, s:" + string + ")";
    }

    private boolean b() {
        return this.a.c == 1 && (this.z != -1 || this.a.t != -1);
    }

    public final void a(byte by) {
        this.a.c = by;
    }

    private int a() {
        if (this.q && this.C > 0) {
            return this.F;
        }
        return 0;
    }

    public final void h() {
        bc bc2 = null;
        int n2 = this.a.a();
        while (--n2 >= 0) {
            bc2 = this.a.a(n2);
            if (!(bc2 instanceof ai)) continue;
            ((ai)bc2).h();
        }
        this.d = false;
    }

    public void a(boolean n2, Vector vector, Vector vector2) {
        if (this.c() && this.j == false) {
            if (this.a != null && !"".equals(this.a)) {
                if (!n2) {
                    vector2 = new Vector<ai>();
                    vector.addElement(vector2);
                }
                vector2.addElement(this);
                return;
            }
            n2 = this.a.a();
            bc bc2 = null;
            if (this.p) {
                vector2 = new Vector();
            }
            for (int i = 0; i < n2; ++i) {
                bc2 = this.a.a(i);
                if (!(bc2 instanceof ai)) continue;
                ((ai)bc2).a(this.p, vector, vector2);
            }
            if (this.p && vector2.size() > 0) {
                vector.addElement(vector2);
            }
        }
    }

    public boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -116: {
                    ah2.a(this.a);
                    break;
                }
                case -117: {
                    ah2.a(this.c);
                    break;
                }
                case -118: {
                    ah2.a(this.d);
                    break;
                }
                case -119: {
                    ah2.a(this.b());
                    break;
                }
                case -120: {
                    ah2.a(!this.p ? "vbox" : "hbox");
                    break;
                }
                case -122: {
                    ah2.a(this.f);
                    break;
                }
                case -121: {
                    ah2.a(this.h);
                    break;
                }
                case -123: {
                    ah2.a(this.g);
                    break;
                }
                case -124: {
                    ah2.a(this.e);
                    break;
                }
                case -125: {
                    ah2.a(this.m);
                    break;
                }
                case -126: {
                    ah2.a(this.n);
                    break;
                }
                case -127: {
                    ah2.a(this.o);
                    break;
                }
                case -128: {
                    ah2.a(this.p);
                    break;
                }
                case -129: {
                    ah2.a(this.a);
                    break;
                }
                case -130: {
                    ah2.a(this.b);
                    break;
                }
                case -131: {
                    ah2.a(this.c);
                    break;
                }
                case -132: {
                    ah2.a(this.d);
                    break;
                }
                case -136: 
                case -135: 
                case -134: 
                case -133: {
                    ah2.a(ag.b);
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

    public boolean a(int n2, boolean bl, Object object, int n3) {
        if (!(bl = super.a(n2, bl, object, n3))) {
            switch (n2) {
                case -116: {
                    this.a = object;
                    break;
                }
                case -117: {
                    this.c = object;
                    break;
                }
                case -118: {
                    this.d = object;
                    break;
                }
                case -119: {
                    n2 = bj.a(object, false) ? 1 : 0;
                    this.a.c = n2 != 0 ? (byte)1 : 0;
                    this.a.a |= 0x800000000L;
                    break;
                }
                case -120: {
                    String string = bj.a(object, "").toUpperCase();
                    this.p = "HBOX".equals(string);
                    break;
                }
                case -122: {
                    this.f = object;
                    break;
                }
                case -121: {
                    this.h = object;
                    break;
                }
                case -123: {
                    this.g = object;
                    break;
                }
                case -124: {
                    this.e = object;
                    break;
                }
                case -125: {
                    this.m = object;
                    break;
                }
                case -126: {
                    this.n = object;
                    break;
                }
                case -127: {
                    this.o = object;
                    break;
                }
                case -128: {
                    this.p = object;
                    break;
                }
                case -129: {
                    this.a = bj.a(object, "");
                    break;
                }
                case -130: {
                    this.b = bj.a(object, "");
                    break;
                }
                case -131: {
                    this.c = bj.a(object, "");
                    break;
                }
                case -132: {
                    this.d = bj.a(object, "");
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

    public boolean a(ah ah2, af af2, int n2, ah ah3) {
        boolean bl = true;
        if (!super.a(ah2, af2, n2, ah3)) {
            switch (n2) {
                case -133: {
                    af2 = (bc)ah3.a(0);
                    this.a((bc)af2);
                    ((bc)af2).b(q.d);
                    if (af2 instanceof ai) {
                        q.a((byte)10);
                    } else {
                        q.a((byte)1);
                    }
                    ah2.a(null);
                    break;
                }
                case -134: {
                    boolean bl2 = ah3.a() > 1 ? ah3.a(1) : true;
                    bc bc2 = (bc)ah3.a(0);
                    af2 = this;
                    if (bc2 instanceof ai && ((ai)bc2).e || bc2 instanceof aj && ((aj)bc2).a) {
                        super.c(false);
                    }
                    ((ai)af2).a.a(bc2);
                    if (bl2) {
                        bc2.a();
                    }
                    ((bc)af2).p();
                    ((bc)af2).q();
                    ah2.a(null);
                    q.a((byte)10);
                    break;
                }
                case -135: {
                    this.a(ah3.a() > 0 ? ah3.a(0) : true);
                    ah2.a(null);
                    q.a((byte)10);
                    break;
                }
                case -136: {
                    ah2.a(this.a());
                    break;
                }
                default: {
                    bl = false;
                    if (!"tabccontainer".equals(this.f())) break;
                    throw new NoSuchElementException("no such method");
                }
            }
        }
        return bl;
    }
}
