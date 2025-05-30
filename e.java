/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class e
extends InputStream {
    private e Code;
    private g Code;
    private Object[] Code;
    private int[] Code;
    private Hashtable Code;
    private int Code;
    private boolean Code;
    private int I;
    private boolean I;
    private int Z;
    private byte[] Code;
    private int J;
    private int B;
    private int C;
    private int a;
    private int b = 0;
    private byte[] I = new byte[1];

    final byte[] Code() {
        return this.Code;
    }

    public final void close() {
        g.Code(this, false);
    }

    final void Code(g g2, int n) {
        this.Code = g2;
        this.Code = n;
    }

    e() {
    }

    public final boolean Z() {
        return this.Code;
    }

    final boolean Code(String string) {
        int n;
        if (this.b >= 3) {
            return false;
        }
        ++this.b;
        this.a = n = g.Code(string, null);
        this.Code = null;
        if (this.b == 1) {
            this.Code[90] = this.Code[53];
        }
        this.Code[53] = string;
        this.Code[46] = 0;
        return true;
    }

    public final int read(byte[] byArray, int n, int n2) {
        block0: while (true) {
            this.J = n;
            this.B = n2;
            this.Code = byArray;
            g.Code((Object)this);
            while (true) {
                if (this.Code) {
                    if (this.I) {
                        return -1;
                    }
                    throw new IOException();
                }
                g g2 = this.Code;
                if (g2 != null) {
                    g2.Code(this);
                }
                if (this.Code == null) {
                    if (this.B == 0) continue block0;
                    return this.B;
                }
                g.Code((Object)this, 1000);
            }
            break;
        }
    }

    final void I() {
        this.Code = null;
        this.Code = null;
    }

    final void J(int n) {
        this.C += n;
    }

    e(Object[] objectArray, int[] nArray, int n) {
        this.Code = objectArray;
        this.Code = nArray;
        this.a = n;
        nArray[46] = 0;
        this.Code = (Hashtable)objectArray[9];
        objectArray[9] = null;
    }

    final int J() {
        return this.B;
    }

    final int Code() {
        return this.a;
    }

    final g Code() {
        return this.Code;
    }

    final void Code() {
        this.Code = null;
    }

    final void Code(e e2) {
        this.Code = e2;
    }

    final e Code() {
        return this.Code;
    }

    final e Code(e e2) {
        if (e2 == this) {
            e2 = this.Code;
            this.Code = null;
            return e2;
        }
        e e3 = this;
        while (e3.Code != null) {
            if (e3.Code == e2) {
                e3.Code = e2.Code;
                e2.Code = null;
                break;
            }
            e3 = e3.Code;
        }
        return this;
    }

    final int I() {
        return this.Code;
    }

    final Object[] Code() {
        return this.Code;
    }

    final int[] Code() {
        return this.Code;
    }

    final Hashtable Code(boolean bl) {
        Hashtable hashtable = this.Code;
        if (bl) {
            this.Code = null;
        }
        return hashtable;
    }

    final boolean I() {
        return this.Code[46] != 0;
    }

    final int Z() {
        return this.J;
    }

    final boolean Code() {
        return this.Code == null;
    }

    final void J() {
        this.I = true;
        g.Code((Object)this);
    }

    final void Z() {
        this.Code[46] = 1;
    }

    final void Z(int n) {
        this.I = n;
    }

    final synchronized void Code(int n) {
        this.B = n;
        this.Code = null;
        this.notifyAll();
    }

    public final int read() {
        if (this.read(this.I, 0, 1) < 0) {
            return -1;
        }
        return this.I[0] & 0xFF;
    }

    final void I(int n) {
        this.Code = true;
        this.Z = n;
        g.Code((Object)this);
    }

    final int B() {
        return this.I;
    }

    public final int C() {
        return this.Z;
    }

    public final int a() {
        return this.C;
    }

    public final boolean J() {
        if (this.Code == null) {
            return false;
        }
        return this.Code.I();
    }

    final g I() {
        return this.Code.Code();
    }
}
