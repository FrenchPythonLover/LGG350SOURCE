/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ax
extends bc {
    public static Hashtable a = new Hashtable();
    private int a;
    private boolean a;
    private String a;
    private an a;
    private boolean b;

    public ax(int n, String string, String string2, String object) {
        this.h = string2;
        this.j = object;
        this.a = n;
        if (n == 0) {
            this.o("checkbox");
        } else {
            this.o("radio");
        }
        object = null;
        if (string2 != null) {
            if (a.containsKey(string2)) {
                object = (Vector)a.get(string2);
            } else {
                object = new Vector();
                if (n == 1) {
                    ((Vector)object).addElement(this);
                }
                a.put(string2, object);
            }
            ((Vector)object).addElement(this);
        }
        this.a = string;
        if (string != null) {
            this.a = new an(string, 2, false);
        }
    }

    public final void a() {
        super.a();
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        block8: {
            Image image;
            block10: {
                Graphics graphics2;
                block9: {
                    if (!g || !f) break block8;
                    graphics2 = graphics;
                    image = null;
                    if (((av)((Object)this.a)).o != 255) {
                        image = Image.createImage((int)this.h, (int)this.i);
                        graphics2 = image.getGraphics();
                    }
                    int n9 = u.j;
                    int n10 = u.k;
                    this.a(n9, n10);
                    super.a(graphics2, n, n2, n3, n4, n5, n6, n7, n8);
                    if (this.a != null) break block9;
                    graphics2.setColor(((av)((Object)this.a)).a);
                    switch (this.a) {
                        case 0: {
                            graphics2.drawRect(this.l + u.j, this.m + u.k, this.n - 1, this.o - 1);
                            if (this.a) {
                                graphics2.drawLine(this.l + u.j, this.m + u.k, this.l + this.n - 1 + u.j, this.m + this.o - 1 + u.k);
                                graphics2.drawLine(this.l + u.j, this.m + this.o - 1 + u.k, this.l + this.n - 1 + u.j, this.m + u.k);
                                break;
                            }
                            break block10;
                        }
                        case 1: {
                            graphics2.drawArc(this.l + u.j, this.m + u.k, this.n - 1, this.o - 1, 0, 360);
                            if (this.a) {
                                graphics2.fillArc(this.l + this.f + 1 + u.j, this.m + this.g + 1 + u.k, this.n - 3, this.o - 3, 0, 360);
                            } else {
                                break;
                            }
                        }
                    }
                    break block10;
                }
                u.a(this.l, this.m);
                this.a.a(graphics2, n, n2, n3, n4, n5, n6, n7, n8);
                u.a(-this.l, -this.m);
            }
            if (image != null) {
                image = ax.a(image, ((av)((Object)this.a)).o);
                graphics.drawImage(image, u.j, u.k, 20);
            }
            u.a(-this.A, -this.B);
        }
    }

    public final void a(int n, int n2) {
        super.a(n, n2);
        if (this.a != null) {
            this.a.a(n, n2);
            this.i = this.a.i;
            this.h = this.a.h;
        } else {
            this.i = 11;
            this.h = 11;
        }
        this.o();
        this.b(n, n2);
    }

    public final void a(Object object) {
        this.a((String)object);
    }

    public final Object a() {
        if (this.j != null) {
            Vector vector = (Vector)a.get(this.h);
            if (this.a == 0) {
                int n = vector.size();
                Vector<String> vector2 = new Vector<String>();
                ax ax2 = null;
                for (int i = 0; i < n; ++i) {
                    ax2 = (ax)vector.elementAt(i);
                    if (!ax2.b) continue;
                    vector2.addElement(ax2.j != null ? ax2.j : "on");
                }
                if (vector2.size() > 1) {
                    return vector2;
                }
                if (vector2.size() > 0) {
                    return vector2.elementAt(0);
                }
                return "";
            }
            return ((ax)vector.elementAt((int)0)).j;
        }
        if (this.a == 0) {
            return new Boolean(this.a);
        }
        return ((s)((Object)this.a)).a(false);
    }

    public final void e() {
        Object object = this.a;
        object = ((s)object).a;
        if (this.j == null) {
            this.a((String)object);
            return;
        }
        this.a(this.j.equals(object));
    }

    private void a(String string) {
        this.a = string.equals(this.g);
        if (this.a != null) {
            this.a.a(this.a ? 1 : 0);
        }
        this.s();
        q.a((byte)2);
    }

    public final void b() {
        Vector vector = (Vector)a.get(this.h);
        if (vector != null) {
            boolean bl;
            ax ax2;
            if (this.a == 1) {
                ax ax3 = (ax)vector.elementAt(0);
                ((ax)vector.elementAt(0)).b = false;
                ax3.a = false;
                if (ax3.a != null) {
                    ax3.a.a(this.a ? 1 : 0);
                }
                ax3.s();
                vector.removeElementAt(0);
                vector.insertElementAt(this, 0);
                this.b = true;
                ax2 = this;
                bl = true;
            } else {
                this.b = !this.b;
                ax2 = this;
                bl = ax2.a = !this.a;
            }
        }
        if (this.a != null) {
            this.a.a(this.a ? 1 : 0);
        }
        this.s();
        q.a((byte)2);
    }

    public final void a(boolean bl) {
        if (this.b != bl) {
            this.b();
        }
    }

    public final boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -85: {
                    ah2.a(this.a);
                    break;
                }
                case -90: {
                    ah2.a(this.a);
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(int n2, boolean bl, Object object, int n3) {
        if (!(bl = super.a(n2, bl, object, n3))) {
            switch (n2) {
                case -85: {
                    if (this.a == bj.a(object, false)) break;
                    this.b();
                    break;
                }
                case -90: {
                    this.a = (String)object;
                    this.a = new an(this.a, 2, false);
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(ah ah2, af af2, int n2, ah ah3) {
        if (!super.a(ah2, af2, n2, ah3)) {
            throw new NoSuchElementException("no such method");
        }
        return true;
    }

    public static void c() {
        if (a == null) {
            a = new Hashtable();
            return;
        }
        a.clear();
    }
}
