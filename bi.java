/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bi
implements Runnable {
    private volatile int a;
    private volatile boolean a = false;

    private bi(bh bh2, byte by) {
    }

    public final void run() {
        while (!this.a) {
            ++this.a;
        }
    }

    public final byte[] a(int n, boolean bl) {
        Thread thread = new Thread(this);
        byte[] byArray = new byte[n];
        this.a = 0;
        this.a = false;
        int n2 = 0;
        thread.start();
        if (!bl) {
            n <<= 3;
        }
        for (int i = 0; i < n; ++i) {
            while (this.a == n2) {
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedException) {}
            }
            n2 = this.a;
            if (bl) {
                byArray[i] = (byte)n2;
                continue;
            }
            int n3 = i / 8;
            byArray[n3] = (byte)(byArray[n3] << 1 | n2 & 1);
        }
        this.a = true;
        return byArray;
    }

    public bi(bh bh2) {
        this(bh2, 0);
    }
}
