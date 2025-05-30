/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class x
extends h {
    private final w a;

    x(w w2) {
        this.a = w2;
    }

    public final void run() {
        if (w.a(this.a) == null) {
            return;
        }
        try {
            w w2 = this.a;
            synchronized (w2) {
                if (w.a(this.a) > 0) {
                    return;
                }
                w.a(this.a).read();
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
    }
}
