/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class o
implements n {
    private InputStream a;
    private boolean a;

    public o(InputStream inputStream) {
        this.a = inputStream;
    }

    public final void a() {
        try {
            this.a = true;
            this.a.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof o)) {
            return false;
        }
        return this.a == ((o)object).a;
    }

    public final boolean a_() {
        return this.a;
    }
}
