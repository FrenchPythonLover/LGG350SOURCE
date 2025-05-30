/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j {
    public ByteArrayOutputStream a;
    public DataOutputStream a;
    public String[] a;
    public int[] a;
    public int a = new DataOutputStream(this.a);

    public final void a(int n) {
        this.a();
        try {
            this.a.writeByte(1);
            this.a.writeByte(n);
        }
        catch (IOException iOException) {}
        this.a = 0;
    }

    public void a() {
        try {
            if (this.a == -1) {
                return;
            }
            bj.a(this.a, this.a);
            for (int i = 0; i < this.a; ++i) {
                this.a.writeByte(this.a[i]);
                this.b(this.a[i]);
            }
            this.a = -1;
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void b(int n) {
        try {
            this.a();
            this.a.writeByte(2);
            this.a.writeByte(n);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void a(String string) {
        this.a();
        this.b(string);
    }

    private void b(String object) {
        try {
            object = ((String)object).getBytes();
            this.a.writeByte(3);
            bj.a(this.a, ((Object)object).length);
            this.a.write((byte[])object);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}
