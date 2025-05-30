/*
 * Decompiled with CFR 0.152.
 */
public abstract class bp
extends bo {
    int a = 0;
    int b = 0;

    public abstract void a();

    public final int a(short[] sArray, int n) {
        int n2;
        this.a();
        short s = sArray[n];
        int n3 = (this.b >>> 11) * s;
        if ((this.a ^ Integer.MIN_VALUE) < (n3 ^ Integer.MIN_VALUE)) {
            this.b = n3;
            sArray[n] = (short)(s + (2048 - s >>> 5));
            n2 = 0;
        } else {
            this.b -= n3;
            this.a -= n3;
            sArray[n] = (short)(s - (s >>> 5));
            n2 = 1;
        }
        return n2;
    }

    public final int b(short[] sArray) {
        int n = 1;
        while ((n = n << 1 | this.a(sArray, n)) < sArray.length) {
        }
        return n - sArray.length;
    }

    public final int c(short[] sArray) {
        int n = 1;
        int n2 = 0;
        int n3 = 0;
        do {
            int n4 = this.a(sArray, n);
            n = n << 1 | n4;
            n3 |= n4 << n2++;
        } while (n < sArray.length);
        return n3;
    }
}
