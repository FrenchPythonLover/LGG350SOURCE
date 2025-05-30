/*
 * Decompiled with CFR 0.152.
 */
final class bl
extends bh {
    private final bk e;

    private bl(bk bk2, byte by) {
        this.e = bk2;
    }

    final int a(int n) {
        if (this.e.m.a(this.a, 0) == 0) {
            return this.e.m.b(this.c[n]) + 2;
        }
        if (this.e.m.a(this.a, 1) == 0) {
            return this.e.m.b(this.d[n]) + 2 + 8;
        }
        return this.e.m.b(this.b) + 2 + 8 + 8;
    }

    bl(bk bk2) {
        this(bk2, 0);
    }
}
