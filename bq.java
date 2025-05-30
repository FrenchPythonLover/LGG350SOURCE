/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class bq
extends bp {
    final byte[] c;
    int d = 0;
    int e = 0;

    public bq(h h2) {
        this.c = h2.j(15000);
        if (this.c == null) {
            throw new NullPointerException();
        }
    }

    public final void a() {
        if ((this.b & 0xFF000000) == 0) {
            try {
                this.a = this.a << 8 | this.c[this.e++] & 0xFF;
                this.b <<= 8;
                return;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new IOException();
            }
        }
    }
}
