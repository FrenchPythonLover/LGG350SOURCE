/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class c
extends h {
    private final int a;
    private final aa a;
    private final b a;

    c(int n, aa aa2, b b2) {
        this.a = n;
        this.a = aa2;
        this.a = b2;
    }

    public final void run() {
        for (int k = 0; k < this.a; ++k) {
            Object object;
            try {
                Object object2 = this.a.a();
                object = this.a;
                if (!((aa)object).d) {
                    Object object3 = object2;
                    String string = ((f)object3).a;
                    object3 = object2;
                    String string2 = ((f)object3).b;
                    object3 = object2;
                    String string3 = ((f)object3).c;
                    object3 = object2;
                    object3 = ((f)object3).a;
                    if (string2.equals("application/mmf") && string.equals("attributes.mmf")) {
                        object2 = (Hashtable)b.a((byte[])object3);
                        aa.a((Hashtable)object2);
                    } else if (string2.equals("application/morpheus-binary-markup")) {
                        if (!q.g) {
                            ((aa)object).c = true;
                        } else {
                            ((aa)object).a = true;
                            ((aa)object).a = (byte[])object3;
                            ((aa)object).a = new DataInputStream(new ByteArrayInputStream(((aa)object).a));
                            object = ((aa)object).a;
                            object3 = ((aa)object).a;
                            ((aa)object).a.b = (byte[])object;
                        }
                    } else if (string2.equals("application/morpheus-stylesheet")) {
                        q.b.put(string3, new String((byte[])object3));
                    } else if (string2.equals("image/png") || string2.equals("image/jpeg") || string2.equals("image/bmp") || string2.equals("image/gif")) {
                        ((aa)object).b();
                        object2 = Image.createImage((byte[])object3, (int)0, (int)((Object)object3).length);
                        if (q.b.containsKey(string3)) {
                            ++((t)q.b.get((Object)string3)).a;
                        } else {
                            q.b.put(string3, new t((byte[])object3));
                        }
                        if (((aa)object).a != null) {
                            ((aa)object).a.a.addElement(string3);
                        }
                        q.a.put("cid:" + string3, object2);
                    } else if (string2.equals("application/vishnu-bytecode")) {
                        if (string3 == null || "NOCID".equals(string3)) {
                            object = object3;
                            object3 = ((aa)object).a;
                            object2 = object;
                            object = object3;
                            ((p)object3).a = (byte[])object2;
                        } else {
                            i.a(string3, (f)object2);
                        }
                    } else if (string2.equals("application/morpheus-script-chunkcids")) {
                        object = (Vector)b.a((byte[])object3);
                        object3 = ((aa)object).a;
                        ((aa)object).a.b = object;
                    } else if (!(string2.equals("application/morpheus-font") || string2.equals("image/svg+xml") || string2.equals("image/svg-xml"))) {
                        string2.equals("text/html");
                    }
                }
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            q.q = k * 100 / this.a;
        }
    }
}
