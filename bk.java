/*
 * Decompiled with CFR 0.152.
 */
public final class bk
extends bg {
    private final bm n;
    private be o;
    private final bl p = new bl(this);
    final bp m;
    private final bl q = new bl(this);

    public bk(be be2, bp bp2, int n, int n2, int n3) {
        super(n3);
        this.o = be2;
        this.m = bp2;
        this.n = new bm(this, n, n2);
        this.a();
    }

    public final void b() {
        be be2 = this.o;
        if (be2.e > 0) {
            be2.a(be2.d, be2.e);
        }
        while (true) {
            int n;
            block20: {
                bk bk2;
                int n2;
                block22: {
                    int n3;
                    block21: {
                        int n4;
                        block19: {
                            int n5;
                            int n6;
                            int n7;
                            be2 = this.o;
                            if (!(be2.f < be2.c)) break;
                            n4 = this.o.f & this.j;
                            if (this.m.a(this.d[this.l.a], n4) == 0) {
                                bm bm2 = this.n;
                                int n8 = bm2.d.o.f;
                                n7 = bm2.d.o.a(0);
                                Object object = bm2;
                                int n9 = n7 >> 8 - ((bi)object).a;
                                n6 = (n8 & ((bi)object).b) << ((bi)object).a;
                                n8 = n9 + n6;
                                object = bm2.c[n8];
                                n7 = 1;
                                if (((bn)object).b.d.l.a < 7) {
                                    while ((n7 = n7 << 1 | ((bn)object).b.d.m.a(((bn)object).a, n7)) < 256) {
                                    }
                                } else {
                                    n8 = ((bn)object).b.d.o.a(((bn)object).b.d.k[0]);
                                    n9 = 256;
                                    do {
                                        n6 = (n8 <<= 1) & n9;
                                        n5 = ((bn)object).b.d.m.a(((bn)object).a, n9 + n6 + n7);
                                        n7 = n7 << 1 | n5;
                                        n9 &= 0 - n5 ^ ~n6;
                                    } while (n7 < 256);
                                }
                                byte by = (byte)n7;
                                Object object2 = ((bn)object).b.d.o;
                                ((be)object2).a[((be)object2).f++] = (ag)by;
                                if (((be)object2).b < ((be)object2).f) {
                                    ((be)object2).b = ((be)object2).f;
                                }
                                object2 = ((bn)object).b.d.l;
                                if (((br)object2).a <= 3) {
                                    ((br)object2).a = 0;
                                    continue;
                                }
                                if (((br)object2).a <= 9) {
                                    ((br)object2).a -= 3;
                                    continue;
                                }
                                ((br)object2).a -= 6;
                                continue;
                            }
                            if (this.m.a(this.e, this.l.a) != 0) break block19;
                            n2 = n4;
                            bk bk3 = this;
                            bp bp2 = null;
                            bk3.l.a = bk3.l.a < 7 ? 7 : 10;
                            bk3.k[3] = bk3.k[2];
                            bk3.k[2] = bk3.k[1];
                            bk3.k[1] = bk3.k[0];
                            int n10 = bk3.p.a(n2);
                            n7 = bk3.m.b(bk3.b[n10 < 6 ? n10 - 2 : 3]);
                            if (n7 < 4) {
                                bk3.k[0] = n7;
                            } else {
                                n2 = (n7 >> 1) - 1;
                                bk3.k[0] = (2 | n7 & 1) << n2;
                                if (n7 < 14) {
                                    bk3.k[0] = bk3.k[0] | bk3.m.c(bk3.c[n7 - 4]);
                                } else {
                                    int n11 = bk3.k[0];
                                    n6 = n2 - 4;
                                    bp2 = bk3.m;
                                    n5 = 0;
                                    do {
                                        bp2.a();
                                        bp2.b >>>= 1;
                                        n2 = bp2.a - bp2.b >>> 31;
                                        bp2.a -= bp2.b & n2 - 1;
                                        n5 = n5 << 1 | 1 - n2;
                                    } while (--n6 != 0);
                                    bk3.k[0] = n11 | n5 << 4;
                                    bk3.k[0] = bk3.k[0] | bk3.m.c(bk3.a);
                                }
                            }
                            n = n10;
                            break block20;
                        }
                        n2 = n4;
                        bk2 = this;
                        if (bk2.m.a(bk2.f, bk2.l.a) != 0) break block21;
                        if (bk2.m.a(bk2.g[bk2.l.a], n2) != 0) break block22;
                        bk2.l.a = bk2.l.a < 7 ? 9 : 11;
                        n = 1;
                        break block20;
                    }
                    if (bk2.m.a(bk2.h, bk2.l.a) == 0) {
                        n3 = bk2.k[1];
                    } else {
                        if (bk2.m.a(bk2.i, bk2.l.a) == 0) {
                            n3 = bk2.k[2];
                        } else {
                            n3 = bk2.k[3];
                            bk2.k[3] = bk2.k[2];
                        }
                        bk2.k[2] = bk2.k[1];
                    }
                    bk2.k[1] = bk2.k[0];
                    bk2.k[0] = n3;
                }
                bk2.l.a = bk2.l.a < 7 ? 8 : 11;
                n = bk2.q.a(n2);
            }
            int n12 = n;
            this.o.a(this.k[0], n12);
        }
        this.m.a();
    }

    public final void a() {
        super.a();
        bm bm2 = this.n;
        for (int i = 0; i < bm2.c.length; ++i) {
            bo.a((short[])bm2.c[i].a);
        }
        this.p.a();
        this.q.a();
    }
}
