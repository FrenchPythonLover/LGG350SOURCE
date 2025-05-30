/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;

final class J
extends ByteArrayOutputStream {
    final void Code(int n) {
        this.count = n;
    }

    J() {
    }

    J(int n) {
        super(n);
    }

    final byte[] Code() {
        return this.buf;
    }
}
