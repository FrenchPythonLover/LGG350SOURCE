/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class y
extends InputStream {
    private final w a;

    y(w w2) {
        this.a = w2;
    }

    public final int read() {
        if (w.b(this.a) >= w.c(this.a)) {
            return -1;
        }
        int n = w.a(this.a).read();
        w.d(this.a);
        return n;
    }

    public final int read(byte[] byArray, int n, int n2) {
        if (w.b(this.a) >= w.c(this.a)) {
            return -1;
        }
        int n3 = w.a(this.a).read(byArray, n, n2);
        w.a(this.a, n3);
        return n3;
    }

    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    public final int available() {
        return w.a(this.a).available();
    }
}
