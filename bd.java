/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bd {
    private bc[] a;
    private int a = new bc[0];
    private static int b = 0;
    private static int c = 1;

    public final void a(bc bc2) {
        if (this.a.length <= this.a) {
            this.b(0);
        }
        this.a[this.a++] = bc2;
    }

    public final bc a(int n) {
        return this.a[n];
    }

    public final bc a() {
        return this.a[0];
    }

    public final int a(bc bc2) {
        boolean bl = false;
        bc bc3 = bc2;
        bd bd2 = this;
        if (bd2.a <= 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < bd2.a; ++i) {
            if (!bc3.equals(bd2.a[i])) continue;
            return i;
        }
        return -1;
    }

    public final void a(bc bc2, int n) {
        if (n != 0 && (n < 0 || n >= this.a)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.a.length <= this.a) {
            this.b(0);
        }
        this.a(n, c);
        this.a[n] = bc2;
    }

    public final void a() {
        int n = this.a;
        while (--n >= 0) {
            this.a[n] = null;
        }
        this.a = 0;
    }

    public final boolean a(bc bc2) {
        int n = -1;
        try {
            n = this.a(bc2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        if (n != -1) {
            this.a(n, 0);
            return true;
        }
        return false;
    }

    public final void a(int n) {
        if (n < 0 || n >= this.a) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.a(n, 0);
    }

    public final int a() {
        return this.a;
    }

    private void a(int n, int n2) {
        if (n2 == c) {
            System.arraycopy(this.a, n, this.a, n + 1, this.a++);
            return;
        }
        System.arraycopy(this.a, n + 1, this.a, n, this.a--);
    }

    private void b(int n) {
        n = 0 > this.a.length ? 0 : this.a.length + 10;
        bc[] bcArray = new bc[n];
        System.arraycopy(this.a, 0, bcArray, 0, this.a.length);
        this.a = bcArray;
    }
}
