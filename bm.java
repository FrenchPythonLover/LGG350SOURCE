/*
 * Decompiled with CFR 0.152.
 */
final class bm
extends bi {
    bn[] c;
    final bk d;

    bm(bk bk2, int n, int n2) {
        super(n, n2);
        this.d = bk2;
        this.c = new bn[1 << n + n2];
        for (int i = 0; i < this.c.length; ++i) {
            this.c[i] = new bn(this);
        }
    }
}
