/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s {
    public String a;
    public Vector a;

    public s(String string) {
    }

    public final void a(String object) {
        if (object != null && !((String)object).equals(this.a)) {
            this.a = object;
            object = this;
            if (((s)object).a != null) {
                bc bc2 = null;
                int n = ((s)object).a.size();
                while (--n >= 0) {
                    bc2 = (bc)((s)object).a.elementAt(n);
                    bc2.e();
                }
            }
        }
    }

    public final Object a(boolean bl) {
        if (bl) {
            return ((bc)this.a.elementAt(0)).a();
        }
        return this.a;
    }
}
