/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 */
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class an
extends bc {
    private int a;
    private static Image a;
    private Image b;
    private String a;
    private int b;
    private int c = 0;
    private Sprite a;
    private int d = -1;
    private int e = -1;
    private int C;
    private boolean a;
    private boolean b;

    public an(byte[] byArray, int n, boolean bl, int n2, int n3) {
        this.o("image");
        this.b = n;
        this.d = n2;
        this.e = n3;
        this.b = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        this.b = this.a(this.b, n2, n3, true);
        this.c();
    }

    public an(String string, int n, boolean bl) {
        this(string, n, bl, -1, -1, null, false, 0);
    }

    public an(String string, int n, boolean bl, String string2) {
        this(string, n, true, -1, -1, string2, false, 0);
    }

    public an(String object, int n2, boolean bl, int n3, int n4, String string, boolean bl2, int n5) {
        if (object != null) {
            this.a = bj.a(q.a(), (String)object, false);
        }
        if (bl) {
            this.o("image");
        }
        this.b = n2;
        this.d = n3;
        this.e = n4;
        this.a = bl2;
        this.C = n5;
        String string2 = string;
        object = this;
        if (string2 != null) {
            ((an)object).a = "HIGH".equals(string2 = string2.toUpperCase()) ? 2 : 1;
        }
        an.a(this.a, this.a, this);
    }

    public final void a() {
        super.a();
        this.a = null;
        this.b = null;
        this.a = null;
    }

    private static boolean a(String string, String object) {
        object = q.b.get(object);
        Image image = null;
        if (object instanceof byte[]) {
            image = Image.createImage((byte[])((byte[])object), (int)0, (int)((byte[])object).length);
        } else if (object instanceof Image) {
            image = (Image)object;
        } else if (object instanceof t) {
            object = ((t)object).a;
            image = Image.createImage((byte[])((t)object).a, (int)0, (int)((Object)object).length);
        }
        if (image != null) {
            q.a.put(string, image);
            return true;
        }
        return false;
    }

    public static void a(String string, int n2, an an2) {
        if (string != null && string.trim().length() > 0) {
            String string2;
            if (string.startsWith("cid:") && q.b.containsKey(string2 = string.substring(4))) {
                an.a(string, string2);
            }
            string2 = null;
            if (q.e.containsKey(string)) {
                q.a.put(string, q.e.get(string));
                return;
            }
            if (!q.a.containsKey(string)) {
                if (string.startsWith("cid:")) {
                    String string3 = string.substring(4);
                    an.a(string, string3);
                    return;
                }
                if (string.startsWith("local:")) {
                    String string4 = string.substring(6);
                    try {
                        string2 = Image.createImage((String)string4);
                        q.a.put(string, string2);
                    }
                    catch (IOException iOException) {
                        return;
                    }
                } else {
                    if (string.startsWith("file:///")) {
                        q.f.put(string, an2);
                    }
                    q.a.put(string, "null");
                    if (n2 != 0) {
                        q.c.addElement(string);
                        return;
                    }
                    Vector<String> vector = new Vector<String>();
                    vector.addElement("GET");
                    vector.addElement(string);
                    vector.addElement(null);
                    vector.addElement(null);
                    vector.addElement(null);
                    vector.addElement(null);
                    ((Vector)q.a.elementAt(1)).addElement(vector);
                }
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (g && f) {
            this.a(u.j, u.k);
            super.a(graphics, n2, n3, n4, n5, n6, n7, n8, n9);
            if (this.b == null && this.a == null) {
                this.a(false);
            }
            this.a(graphics, this.l, this.m, this.n, this.o);
            if (this.b != null) {
                graphics.drawImage(this.b, this.l + u.j, this.m + u.k, 20);
            } else if (this.a != null) {
                this.a.setPosition(this.l + u.j, this.m + u.k);
                this.a.paint(graphics);
            } else if (this.b) {
                graphics.setColor(0xCCCCCC);
                graphics.drawRect(this.l + u.j, this.m + u.k, this.n, this.o);
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(this.l + u.j + 1, this.m + u.k + 1, this.n - 2, this.o - 2);
                graphics.drawImage(a, u.j + (this.l + this.n >> 1), u.k + (this.m + this.o >> 1), 3);
            }
            this.a(graphics);
            u.a(-this.A, -this.B);
        }
    }

    public final void a(boolean bl) {
        if (this.a != null) {
            Object v2 = q.e.get(this.a);
            if (v2 != null) {
                int n2 = q.b.size();
                while (--n2 >= 0) {
                    if (!this.a.equals(q.b.elementAt(n2))) continue;
                    q.b.removeElementAt(n2);
                    q.b.addElement(this.a);
                    break;
                }
            } else {
                v2 = q.a.get(this.a);
            }
            if (v2 != null && !"null".equals(v2)) {
                this.b = (Image)v2;
                this.b = this.a(this.b, this.d, this.e, true);
                this.c();
                if (this.b != null) {
                    if (this.h != this.b.getWidth() && this.i != this.b.getHeight() && !bl) {
                        an.m();
                        return;
                    }
                } else if (this.a != null && this.h != this.a.getWidth() && this.i != this.a.getHeight() && !bl) {
                    an.m();
                }
            }
        }
    }

    public final void a(int n2, int n3) {
        super.a(n2, n3);
        if (this.b == null && this.a == null) {
            this.a(false);
        }
        if (this.b != null) {
            this.h = this.b.getWidth();
            this.i = this.b.getHeight();
        } else if (this.a != null) {
            this.h = this.a.getWidth();
            this.i = this.a.getHeight();
        }
        this.o();
        this.b(n2, n3);
    }

    public final void a(Object object) {
        this.a((String)object);
    }

    public final Object a() {
        return this.b;
    }

    public final void e() {
        int n2 = this.a;
        this.a(n2.a);
    }

    private void c() {
        if (this.b != 0) {
            this.a = new Sprite(this.b, this.b.getWidth() / this.b, this.b.getHeight());
            this.a(this.c);
            this.b = null;
        }
    }

    private void a(String string) {
        if (string != null && !string.equals(this.a)) {
            this.a = bj.a(q.a(), string, false);
            an.a(this.a, this.a, this);
            this.b = null;
        }
    }

    private void c(Image image) {
        this.b = image;
        an.m();
    }

    public final void a(Image image) {
        this.c(this.a(image, this.d, this.e, false));
    }

    public final void a(int n2) {
        while (n2 < 0) {
            n2 += this.b;
        }
        this.c = n2 % this.b;
        if (this.a != null) {
            try {
                this.a.setFrame(this.c);
                this.s();
                return;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        }
    }

    public final Image a() {
        return this.b;
    }

    public final void b(Image image) {
        this.b = image;
    }

    private Image a(Image image, int n2, int n3, boolean bl) {
        if (n2 != -1 && n3 != -1) {
            image = this.a ? bj.a(image, n2, n3, this.a, this.C) : bj.a(image, n2, n3);
            if (bl) {
                q.a.put(this.a, image);
            }
        }
        return image;
    }

    public final boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -90: {
                    ah2.a(this.a);
                    break;
                }
                case -91: {
                    ah2.a(this.b);
                    break;
                }
                case -92: {
                    ah2.a(this.a);
                    break;
                }
                case -93: {
                    ah2.c(this.c);
                    break;
                }
                case -94: {
                    ah2.c(this.b);
                    break;
                }
                case -98: 
                case -97: 
                case -96: 
                case -95: {
                    ah2.a(ag.b);
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
        boolean bl2 = super.a(n2, bl, object, n3);
        if (!bl2) {
            switch (n2) {
                case -90: {
                    this.a = bj.a(object, "");
                    this.b = null;
                    this.a = null;
                    if (this.a != null) {
                        this.a = bj.a(q.a(), this.a, false);
                    }
                    an.a(this.a, this.a, this);
                    break;
                }
                case -91: {
                    this.c((Image)object);
                    break;
                }
                case -93: {
                    if (!bl) {
                        throw new RuntimeException();
                    }
                    if (this.c == n3 || n3 < 0 || n3 >= this.b) break;
                    this.a(n3);
                    break;
                }
                case -94: {
                    this.b = n3;
                    break;
                }
                case -92: {
                    this.a = (Sprite)object;
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
        switch (n2) {
            case -97: {
                this.a(0);
                return true;
            }
            case -95: {
                this.a(this.c + 1);
                return true;
            }
            case -96: {
                this.a(this.c - 1);
                return true;
            }
            case -98: {
                this.a(this.b - 1);
                return true;
            }
        }
        if (super.a(ah2, af2, n2, ah3)) {
            return true;
        }
        throw new NoSuchElementException("no such method");
    }

    public final void b() {
        this.b = true;
    }

    static {
        try {
            a = Image.createImage((String)"/broken.png");
        }
        catch (Exception exception) {}
    }
}
