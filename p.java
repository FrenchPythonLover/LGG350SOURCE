/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class p {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public int a;
    public int b;
    public Vector a;
    public byte[] a;
    public Vector b;
    public String a;
    public byte[] b;
    Hashtable a = new Vector();
    String b = 0;
    public String c;
    public String d;
    String e = "";
    public String f = "";

    public p(String string) {
        this.a = string;
    }

    public final void a(String string, byte[] byArray) {
        if (this.a == null) {
            this.a = new Hashtable();
        }
        this.a.put(string, byArray);
    }

    public final byte[] a(String string) {
        byte[] byArray = null;
        if (string != null) {
            if (this.a != null) {
                byArray = (byte[])this.a.get(string);
            }
        } else {
            byArray = this.b;
        }
        return byArray;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final void a(String charSequence) {
        int n = charSequence.indexOf("https:");
        if (n != -1) {
            charSequence = new StringBuffer((String)charSequence);
            charSequence = ((StringBuffer)charSequence).deleteCharAt(n + 4).toString();
        }
        this.e = charSequence;
    }
}
