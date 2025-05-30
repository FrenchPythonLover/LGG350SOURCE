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
public class bc
extends ag {
    public static boolean f;
    public static boolean g;
    public av a;
    public static Vector b;
    public static StringBuffer a;
    public boolean h;
    int f;
    int g;
    public int h;
    public int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    private int a;
    private int b;
    private int c;
    private int d;
    int p;
    int q;
    int r;
    int s;
    int t;
    private int e;
    int u;
    private int C;
    int v;
    int w;
    private int D;
    int x;
    private int E = Integer.MIN_VALUE;
    boolean i;
    boolean j;
    boolean k;
    s a;
    ai b;
    bc a;
    String g;
    String h;
    String i;
    private String a;
    private String b;
    String j;
    int y = -1;
    int z = -1;
    boolean l;
    boolean m;
    int A = 0;
    int B = 0;
    boolean n;
    private an a;
    private int F;
    private int G = -1;
    private int H;
    private byte a = (byte)-1;
    private byte b = (byte)-1;
    protected boolean o;

    public bc() {
        this.a = new av();
        this.a.a(this);
    }

    public void a() {
        if (this.a != null) {
            s s2 = this.a;
            if (s2.a != null) {
                s2.a.removeAllElements();
            }
            s2.a = null;
        }
        this.a = null;
        this.a = null;
        this.b = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
    }

    public void b(Hashtable hashtable) {
        if (this.a == null) {
            this.a = new av();
            this.a.a(this);
        } else {
            this.a.b();
        }
        b.removeAllElements();
        this.a(b, hashtable, "*");
        this.a(b, hashtable, this.a);
        if (this.g != null) {
            a.setLength(0);
            a.append("#");
            this.a(b, hashtable, a.append(this.g).toString());
        }
        if (this.i != null) {
            bg bg2 = bg.a(this.i, ", ");
            while (bg2.hasMoreElements()) {
                a.setLength(0);
                a.append(".");
                this.a(b, hashtable, a.append(bg2.a()).toString());
            }
        }
        av.a(b);
        int n = b.size();
        for (int i = 0; i < n; ++i) {
            av av2 = (av)b.elementAt(i);
            this.a.a(av2);
        }
        bc bc2 = this;
        if (bc2.b != null) {
            bc2 = this;
            this.a.b((av)bc2.b.a);
        }
    }

    private void a(Vector vector, Hashtable object, String string) {
        object = (av)((Hashtable)object).get(string);
        while (object != null) {
            if (((av)object).a(this, 0)) {
                vector.addElement(object);
            }
            object = ((av)object).a;
        }
    }

    public final void b(String string, String string2) {
        this.G = 0;
        this.o("separator");
        boolean bl = true;
        if (string == null || string.length() == 0) {
            this.F = 1;
        } else {
            try {
                this.F = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                bl = false;
            }
            finally {
                if (!bl) {
                    this.F = "VERTICAL".equals(string = string.toUpperCase()) ? 0 : 1;
                }
            }
        }
        try {
            this.H = Integer.parseInt(string2);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            this.H = 1;
            return;
        }
    }

    public final void k() {
        this.G = 1;
        this.o("spacer");
    }

    public final void l() {
        this.G = 2;
        this.o("hidden");
    }

    protected void f() {
        if (f) {
            q.a((byte)2);
        }
        this.s();
    }

    protected static void m() {
        q.a((byte)1);
    }

    protected final void b(int n2, int n3) {
        if (this.a.s != -1) {
            this.h = this.a.s == Integer.MIN_VALUE ? n2 : (this.a.f ? this.a.s * n2 / 100 : this.a.s);
        }
        if (this.a.t != -1) {
            this.i = this.a.t == Integer.MIN_VALUE ? n3 : (this.a.g ? this.a.t * n3 / 100 : this.a.t);
            this.n = true;
        }
        if (this.y != -1) {
            this.h = this.l ? this.y * n2 / 100 : this.y;
        }
        if (this.z != -1) {
            this.i = this.m ? this.z * n3 / 100 : this.z;
            this.n = true;
        }
        this.n();
    }

    protected final void n() {
        this.n = this.h - (this.p + this.q);
        this.u = this.n + (this.a.e == null ? 0 : this.a.e[3] + this.a.e[1]);
        this.o = this.i - (this.r + this.s);
        this.C = this.o + (this.a.e == null ? 0 : this.a.e[0] + this.a.e[2]);
    }

    protected final void o() {
        this.i += this.r + this.s;
        this.h += this.q + this.p;
        if (this.a.h != -1 && this.i < this.a.h) {
            this.i = this.a.h;
        }
        if (this.a.f != -1 && this.i > this.a.f) {
            this.i = this.a.f;
        }
        if (this.a.g != -1 && this.h < this.a.g) {
            this.h = this.a.g;
        }
        if (this.a.e != -1 && this.h > this.a.e) {
            this.h = this.a.e;
        }
    }

    protected final boolean a(int n2, int n3) {
        boolean bl = false;
        if (this.a.d == 0 || this.a.d == 1) {
            this.A = 0;
            this.B = 0;
        } else {
            int[] nArray = this.a.k == null ? av.a : this.a.k;
            boolean bl2 = false;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (this.a.y != Integer.MIN_VALUE) {
                n5 = this.a.y;
            } else if (this.a.A != Integer.MIN_VALUE) {
                n5 = this.a.A;
                bl2 = true;
            }
            if (this.a.z != Integer.MIN_VALUE) {
                n4 = this.a.z;
            } else if (this.a.B != Integer.MIN_VALUE) {
                n4 = this.a.B;
                bl2 = true;
            }
            if (this.a.d == 3) {
                if (bl2) {
                    n5 = q.b() - n5;
                }
            } else {
                n6 = ak.b;
                if (this.a != null) {
                    if (bl2) {
                        bc bc2 = this.a;
                        n5 = bc2.i - n5;
                    }
                    bc bc3 = this.a;
                    n4 += bc3.j;
                    bc3 = this.a;
                    n5 += bc3.k;
                } else if (bl2) {
                    n5 = q.b() - n5;
                }
            }
            this.j = this.A = -n2 + n4 + u.a + nArray[0];
            this.k = this.B = -n3 + n5 + u.b + n6 + nArray[3];
            u.a(this.A, this.B);
            bl = true;
        }
        return bl;
    }

    public void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = n2 = this.u > 0 && this.C > 0 ? 1 : 0;
        if (g && f) {
            int n11;
            int n12;
            this.j = u.j + this.f;
            this.k = u.k + this.g;
            if (this.a.a != null || this.a.b != null) {
                this.a(graphics, this.t, this.e, this.u, this.C);
                u.a(this.t, this.e);
                if (this.a.a != null) {
                    Image image;
                    if (this.a == null) {
                        this.a = new an(this.a.a, 0, false);
                    }
                    if (this.a.a() == null) {
                        this.a.a(true);
                    }
                    if ((image = this.a.a()) != null) {
                        n4 = 0;
                        if (this instanceof ai && !this.a.b) {
                            ai ai2 = (ai)this;
                            n4 = ai2.c;
                        }
                        if (this.a.n != 255 && !this.a.d) {
                            n5 = image.getWidth();
                            n6 = image.getHeight();
                            int[] nArray = new int[n5 * n6];
                            image.getRGB(nArray, 0, n5, 0, 0, n5, n6);
                            bj.a(nArray, this.a.n);
                            image = Image.createRGBImage((int[])nArray, (int)n5, (int)n6, (boolean)true);
                            this.a.b(image);
                            this.a.d = true;
                        }
                        if (this.a.a == 1) {
                            n5 = image.getWidth();
                            n6 = this.u / n5 + (this.u % n5 != 0 ? 1 : 0);
                            while (--n6 >= 0) {
                                graphics.drawImage(image, n5 * n6 + u.j, n4 + u.k, 20);
                            }
                        } else if (this.a.a == 2) {
                            n5 = image.getHeight();
                            n6 = n4 % n5;
                            int n13 = (this.C - n6) / n5 + (this.C % n5 != 0 ? 1 : 0);
                            while (--n13 >= 0) {
                                graphics.drawImage(image, u.j, n5 * n13 + n6 + u.k, 20);
                            }
                        } else if (this.a.a == 0) {
                            n5 = image.getWidth();
                            n6 = image.getHeight();
                            int n14 = n4 % n6;
                            n4 = (this.C - n14) / n6 + (this.C % n6 != 0 ? 1 : 0);
                            while (--n4 >= 0) {
                                n7 = this.u / n5 + (this.u % n5 != 0 ? 1 : 0);
                                while (--n7 >= 0) {
                                    graphics.drawImage(image, n5 * n7 + u.j, n6 * n4 + n14 + u.k, 20);
                                }
                            }
                        } else {
                            n5 = 0;
                            n6 = 0;
                            if (this.a.i != Integer.MIN_VALUE) {
                                n5 = this.a.i;
                            }
                            if (this.a.j != Integer.MIN_VALUE) {
                                n6 = this.a.j;
                            }
                            graphics.drawImage(image, n5 + u.j, n6 + n4 + u.k, 20);
                        }
                    }
                } else if (this.a.b != null) {
                    if (this.a != null && this.a.n != 255) {
                        graphics.drawImage(this.a.a(), u.j, u.k, 20);
                    } else {
                        Graphics graphics2 = graphics;
                        Image image = null;
                        n5 = u.j;
                        n6 = u.k;
                        if (this.a.n != 255 && n2 != 0) {
                            image = Image.createImage((int)this.u, (int)this.C);
                            graphics2 = image.getGraphics();
                            n5 = 0;
                            n6 = 0;
                        }
                        if (this.a.b.length == 1) {
                            graphics2.setColor(this.a.b[0]);
                            if (this.a.b <= 0) {
                                graphics2.fillRect(n5, n6, this.u, this.C);
                            } else {
                                graphics.fillRoundRect(n5 + -1, n6 + -1, this.u + 2, this.C + 2, this.a.b, this.a.b);
                            }
                        } else if (n2 != 0) {
                            int n15 = n5;
                            int n16 = n6;
                            int[] nArray = this.a.b;
                            n6 = this.C;
                            n5 = this.u;
                            int n17 = n16;
                            int n18 = n15;
                            Graphics graphics3 = graphics2;
                            n12 = (nArray.length << 10) / n6;
                            n11 = 0;
                            int n19 = 0;
                            for (int i = 0; i < n6; ++i) {
                                n19 = n11 >> 10;
                                if (0 < (n11 >> 10) - 512) {
                                    ++n19;
                                }
                                graphics3.setColor(nArray[n19]);
                                graphics3.drawLine(n18, n17 + i, n18 + n5, n17 + i);
                                n11 += n12;
                            }
                        }
                    }
                }
                u.a(-this.t, -this.e);
                this.a(graphics);
            }
            Graphics graphics4 = graphics;
            bc bc2 = this;
            if (bc2.a.d != null) {
                if (bc2.a.k != 0) {
                    graphics4.setStrokeStyle(bc2.a.k);
                }
                if (bc2.a.b != 0) {
                    graphics4.setColor(bc2.a.d[0]);
                    graphics4.drawRoundRect(bc2.f + u.j, bc2.g + u.k, bc2.h - 1, bc2.i - 1, bc2.a.b, bc2.a.b);
                } else if (bc2.a.c != null && bc2.a.b == 0) {
                    int[] nArray = bc2.a.d;
                    graphics4.setColor(nArray[1]);
                    for (n12 = 0; n12 < bc2.a.c[1]; ++n12) {
                        n5 = n6 = bc2.f + bc2.h - bc2.a.c[1] - bc2.w + n12;
                        n7 = bc2.g + bc2.D + bc2.a.c[0];
                        n11 = n7 + bc2.i - (bc2.D + bc2.x) - 1 - bc2.a.c[2] - bc2.a.c[0];
                        graphics4.drawLine(n5 + u.j, n7 + u.k, n6 + u.j, n11 + u.k);
                    }
                    graphics4.setColor(nArray[3]);
                    for (n12 = 0; n12 < bc2.a.c[3]; ++n12) {
                        n5 = n6 = bc2.f + bc2.v + n12;
                        n7 = bc2.g + bc2.D + bc2.a.c[0];
                        n11 = n7 + bc2.i - (bc2.D + bc2.x) - 1 - bc2.a.c[2] - bc2.a.c[0];
                        graphics4.drawLine(n5 + u.j, n7 + u.k, n6 + u.j, n11 + u.k);
                    }
                    graphics4.setColor(nArray[0]);
                    for (n12 = 0; n12 < bc2.a.c[0]; ++n12) {
                        n5 = bc2.f + bc2.v;
                        n6 = n5 + bc2.h - (bc2.v + bc2.w) - 1;
                        n7 = n11 = bc2.g + bc2.D + n12;
                        graphics4.drawLine(n5 + u.j, n7 + u.k, n6 + u.j, n11 + u.k);
                    }
                    graphics4.setColor(nArray[2]);
                    for (n12 = 0; n12 < bc2.a.c[2]; ++n12) {
                        n5 = bc2.f + bc2.v;
                        n6 = n5 + bc2.h - (bc2.v + bc2.w) - 1;
                        n7 = n11 = bc2.g + bc2.i - bc2.x - bc2.a.c[2] + n12;
                        graphics4.drawLine(n5 + u.j, n7 + u.k, n6 + u.j, n11 + u.k);
                    }
                }
                if (bc2.a.k != 0) {
                    graphics4.setStrokeStyle(0);
                }
            }
            if (this.o) {
                graphics4 = graphics;
                bc2 = this;
                n4 = bc2.h - 1;
                n5 = bc2.i - 1;
                if (bc2.a.f != null) {
                    n6 = 0;
                    for (n7 = 0; n7 < bc2.a.f.length; n7 += 3) {
                        graphics4.setColor(bc2.a.f[n7 + 2]);
                        graphics4.drawLine(bc2.f + bc2.v + bc2.a.f[n7] + u.j, bc2.g - ++n6 + bc2.D + u.k, bc2.f + n4 - bc2.w + bc2.a.f[n7 + 1] + u.j, bc2.g - n6 + bc2.D + u.k);
                    }
                }
                if (bc2.a.g != null) {
                    n6 = 0;
                    for (n7 = 0; n7 < bc2.a.g.length; n7 += 3) {
                        graphics4.setColor(bc2.a.g[n7 + 2]);
                        graphics4.drawLine(bc2.f + n4 + ++n6 - bc2.w + u.j, bc2.g + bc2.D + bc2.a.g[n7] + u.k, bc2.f + n4 + n6 - bc2.w + u.j, bc2.g + n5 - bc2.x + bc2.a.g[n7 + 1] + u.k);
                    }
                }
                if (bc2.a.h != null) {
                    n6 = 0;
                    for (n7 = 0; n7 < bc2.a.h.length; n7 += 3) {
                        graphics4.setColor(bc2.a.h[n7 + 2]);
                        graphics4.drawLine(bc2.f + bc2.v + bc2.a.h[n7] + u.j, bc2.g + n5 + ++n6 - bc2.x + u.k, bc2.f + n4 - bc2.w + bc2.a.h[n7 + 1] + u.j, bc2.g + n5 + n6 - bc2.x + u.k);
                    }
                }
                if (bc2.a.i != null) {
                    n6 = 0;
                    for (n7 = 0; n7 < bc2.a.i.length; n7 += 3) {
                        graphics4.setColor(bc2.a.i[n7 + 2]);
                        graphics4.drawLine(bc2.f - ++n6 + bc2.v + u.j, bc2.g + bc2.D + bc2.a.i[n7] + u.k, bc2.f - n6 + bc2.v + u.j, bc2.g + bc2.i - bc2.x + bc2.a.i[n7 + 1] - 1 + u.k);
                    }
                }
            }
            if (this.G == 0) {
                graphics.setColor(this.a.a);
                if (this.a.k != 0) {
                    graphics.setStrokeStyle(1);
                }
                for (int i = 0; i < this.H; ++i) {
                    if (this.F == 1) {
                        graphics.drawLine(u.j, i + this.g + u.k, n8 + u.j, i + this.g + u.k);
                        continue;
                    }
                    graphics.drawLine(this.f + i + u.j, u.k, this.f + i + u.j, n9 + u.k);
                }
                if (this.a.k != 0) {
                    graphics.setStrokeStyle(0);
                }
            }
        }
    }

    protected static Image a(Image image, int n2) {
        int n3 = image.getWidth();
        int n4 = image.getHeight();
        int[] nArray = new int[n3 * n4];
        image.getRGB(nArray, 0, n3, 0, 0, n3, n4);
        bj.a(nArray, n2);
        return Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)true);
    }

    protected final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        this.b(graphics);
        graphics.clipRect(n2 + u.j, n3 + u.k, n4, n5);
    }

    protected final void b(Graphics graphics, int n2, int n3, int n4, int n5) {
        this.b(graphics);
        graphics.setClip(n2 + u.j, n3 + u.k, n4, n5);
    }

    private void b(Graphics graphics) {
        this.a = graphics.getClipX();
        this.b = graphics.getClipY();
        this.c = graphics.getClipWidth();
        this.d = graphics.getClipHeight();
    }

    protected final void a(Graphics graphics) {
        graphics.setClip(this.a, this.b, this.c, this.d);
    }

    protected final void p() {
        while (true) {
            if (bc2.a.c) {
                bc2.k = true;
                return;
            }
            if (bc2.b == null) break;
            bc bc2 = bc2.b;
        }
    }

    private int a(int n2) {
        int n3 = 0;
        if (this.a.b == 0) {
            if (this.a.c != null) {
                n3 = 0 + this.a.c[n2];
            }
        } else {
            ++n3;
        }
        if (this.a.e != null) {
            n3 += this.a.e[n2];
        }
        return n3;
    }

    public void a(int n2, int n3, int n4, boolean bl) {
        this.f = 0;
        this.g = 0;
        int[] nArray = this.a.k == null ? av.a : this.a.k;
        int n5 = this.a.d | this.a.c;
        if (n5 == 0) {
            n5 = n4;
        }
        block0 : switch (n5) {
            case 4: 
            case 16: 
            case 20: {
                this.f = nArray[3];
                break;
            }
            case 8: 
            case 24: {
                this.f = n2 - this.h - nArray[1];
                break;
            }
            case 32: 
            case 36: {
                this.g = n3 - this.i - nArray[2];
                break;
            }
            case 40: {
                this.f = n2 - this.h - nArray[1];
                this.g = n3 - this.i - nArray[2];
                break;
            }
            case 3: {
                this.f = n2 - this.h - nArray[3] - nArray[1] >> 1;
                this.g = n3 - this.i - nArray[0] - nArray[2] >> 1;
                break;
            }
            default: {
                if (!bl) break;
                switch (n5) {
                    case 2: 
                    case 6: {
                        this.g = n3 - this.i - nArray[0] - nArray[2] >> 1;
                        break block0;
                    }
                    case 10: {
                        this.f = n2 - this.h - nArray[1];
                        this.g = n3 - this.i - nArray[0] - nArray[2] >> 1;
                        break block0;
                    }
                    case 1: 
                    case 17: {
                        this.f = n2 - this.h - nArray[3] - nArray[1] >> 1;
                        break block0;
                    }
                    case 33: {
                        this.f = n2 - this.h - nArray[3] - nArray[1] >> 1;
                        this.g = n3 - this.i - nArray[2];
                    }
                }
            }
        }
        if (this.a.d == 1) {
            if (this.a.z != Integer.MIN_VALUE) {
                this.f += this.a.z;
            } else if (this.a.B != Integer.MIN_VALUE) {
                this.f -= this.a.B;
            }
            if (this.a.y != Integer.MIN_VALUE) {
                this.g += this.a.y;
            } else if (this.a.A != Integer.MIN_VALUE) {
                this.g -= this.a.A;
            }
        }
        this.l = this.f + this.p;
        this.m = this.g + this.r;
        this.t = this.l - (this.a.e == null ? 0 : this.a.e[3]);
        this.e = this.m - (this.a.e == null ? 0 : this.a.e[0]);
        this.s();
    }

    private void a(int[] nArray) {
        for (int i = 0; i < nArray.length; i += 3) {
            this.D = Math.max(this.D, Math.abs(nArray[i]));
            this.x = Math.max(this.x, Math.abs(nArray[i + 1]));
        }
    }

    private void b(int[] nArray) {
        for (int i = 0; i < nArray.length; i += 3) {
            this.v = Math.max(this.v, Math.abs(nArray[i]));
            this.w = Math.max(this.w, Math.abs(nArray[i + 1]));
        }
    }

    public void a(int n2, int n3) {
        if (this.a.e) {
            this.a = null;
            this.a.e = false;
            if (this.a.a != null) {
                an.a(bj.a(q.a(), this.a.a, false), 0, null);
            }
        }
        this.h = 0;
        this.i = 0;
        bc bc2 = this;
        if (bc2.a.f != null) {
            bc2.D = bc2.a.f.length / 3;
            bc2.b(bc2.a.f);
        }
        if (bc2.a.h != null) {
            bc2.x = Math.max(bc2.x, bc2.a.h.length / 3);
            bc2.b(bc2.a.h);
        }
        if (bc2.a.g != null) {
            bc2.w = Math.max(bc2.w, bc2.a.g.length / 3);
            bc2.a(bc2.a.g);
        }
        if (bc2.a.i != null) {
            bc2.v = Math.max(bc2.v, bc2.a.i.length / 3);
            bc2.a(bc2.a.i);
        }
        this.r = this.a(0) + this.D;
        this.q = this.a(1) + this.w;
        this.s = this.a(2) + this.x;
        this.p = this.a(3) + this.v;
        this.l = this.f + this.p + this.v;
        this.m = this.g + this.r + this.D;
        switch (this.G) {
            case 0: {
                if (this.F == 0) {
                    this.h = this.H;
                    break;
                }
                this.i = this.H;
                break;
            }
            case 1: {
                this.b(n2, n3);
                break;
            }
            case 2: {
                this.h = 0;
                this.i = 0;
            }
        }
        this.h = true;
    }

    public void d() {
        bc bc2 = this;
        this.a.y = bc2.j;
        bc2 = this;
        this.a.z = bc2.k;
        if (this.a.d == 0) {
            this.a.d = (byte)2;
        }
    }

    public void a(Object object) {
        this.j = object.toString();
    }

    public Object a() {
        return this.j;
    }

    public final void i(String string) {
        this.b = string;
    }

    public final String d() {
        return this.b;
    }

    public final void a(String object, Hashtable object2) {
        this.h = object;
        s s2 = (s)((Hashtable)object2).get(object);
        if (s2 == null) {
            s2 = new s((String)object);
            ((Hashtable)object2).put(object, s2);
        }
        object2 = this;
        object = s2;
        if (((s)object).a == null) {
            ((s)object).a = new Vector();
        }
        if (!((s)object).a.contains(object2)) {
            ((s)object).a.addElement(object2);
        }
        Object object3 = object2;
        object2 = object;
        object = object3;
        ((bc)object3).a = object2;
    }

    public void e() {
    }

    public final boolean a(bc bc2) {
        boolean bl = false;
        if (this.b != null) {
            Object object = this.b;
            object = ((ai)object).a;
            int n2 = ((bd)object).a(this);
            if (n2 != -1) {
                ((bd)object).a(n2);
                ((bd)object).a(bc2, n2);
                bc2.b = this.b;
                q.a((byte)1);
                this.a();
                bl = true;
            }
        }
        return bl;
    }

    public boolean a(ah object, int n2) {
        switch (n2) {
            case -67: {
                ((ah)object).a(this.g);
                break;
            }
            case -68: {
                if (this.y == -1) {
                    ((ah)object).c(this.h);
                    break;
                }
                if (this.l) {
                    ((ah)object).a(this.y + "%");
                    break;
                }
                ((ah)object).c(this.y);
                break;
            }
            case -69: {
                if (this.z == -1) {
                    ((ah)object).c(this.i);
                    break;
                }
                if (this.m) {
                    ((ah)object).a(this.z + "%");
                    break;
                }
                ((ah)object).c(this.z);
                break;
            }
            case -70: {
                ((ah)object).a(this.h);
                break;
            }
            case -71: {
                ((ah)object).a(this.i);
                break;
            }
            case -72: {
                ((ah)object).a(this.c());
                break;
            }
            case -73: {
                ((ah)object).a(this.e() == 1);
                break;
            }
            case -74: {
                ((ah)object).a(this.i);
                break;
            }
            case -76: 
            case -75: {
                ((ah)object).a(ag.b);
                break;
            }
            case -77: {
                ((ah)object).a(this.a);
                break;
            }
            case -78: {
                ah ah2 = object;
                object = this;
                ah2.c(((bc)object).j);
                break;
            }
            case -79: {
                ah ah3 = object;
                object = this;
                ah3.c(((bc)object).k);
                break;
            }
            case -82: {
                ((ah)object).a(this.b);
                break;
            }
            case -83: {
                if (this.G == 2 || this instanceof ax) {
                    ((ah)object).a(this.j);
                    break;
                }
                ((ah)object).a(null);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public boolean a(int n2, boolean bl, Object object, int n3) {
        this.s();
        switch (n2) {
            case -67: {
                this.g = bj.a(object, "");
                break;
            }
            case -68: {
                if (bl) {
                    this.y = n3;
                    this.l = false;
                } else {
                    this.m((String)object);
                }
                q.a((byte)1);
                break;
            }
            case -69: {
                if (bl) {
                    this.z = n3;
                    this.m = false;
                } else {
                    this.n((String)object);
                }
                q.a((byte)1);
                break;
            }
            case -70: {
                this.h = bj.a(object, "");
                q.a((byte)1);
                break;
            }
            case -71: {
                this.i = bj.a(object, "");
                if (this instanceof ai) {
                    ((ai)this).a((ai)this, q.d, this.i, this.j);
                } else {
                    this.b(q.d);
                }
                q.a((byte)1);
                break;
            }
            case -72: {
                if (bj.a(object, true)) {
                    this.a = 1;
                    this.d(true);
                    break;
                }
                this.a = 0;
                this.d(false);
                break;
            }
            case -73: {
                if (bj.a(object, true)) {
                    this.b = 1;
                    this.d(true);
                } else {
                    this.b = 0;
                    this.d(false);
                }
                q.a((byte)1);
                break;
            }
            case -77: {
                av av2 = (av)object;
                if (av2 != null) {
                    this.a.a(av2);
                } else {
                    this.a = new av();
                }
                q.a((byte)1);
                break;
            }
            case -82: {
                this.b = (String)object;
                break;
            }
            case -83: {
                if (this.G == 2) {
                    if (bl) {
                        this.j = Integer.toString(n3);
                        break;
                    }
                    this.j = (String)object;
                    break;
                }
                if (!(this instanceof ax)) break;
                this.j = (String)object;
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public boolean a(ah ah2, af af2, int n2, ah ah3) {
        boolean bl = true;
        switch (n2) {
            case -76: {
                this.s();
                this.a.z = ah3.a(0);
                this.a.y = ah3.a(1);
                if (this.a.d == 0) {
                    this.a.d = (byte)3;
                }
                int n3 = this.i;
                int n4 = this.h;
                n2 = this.a.y + this.g;
                int n5 = this.a.z + this.f;
                if (n4 <= 0 || n3 <= 0) break;
                q.a().a(n5, n2, n4, n3);
                break;
            }
            case -75: {
                this.a((bc)ah3.a(0));
                break;
            }
            default: {
                if ("separator".equals(this.a) || "spacer".equals(this.a) || "stylesheet".equals(this.a)) {
                    throw new NoSuchElementException("no such method");
                }
                bl = false;
            }
        }
        return bl;
    }

    public final String e() {
        return this.g;
    }

    public final void j(String string) {
        this.g = string;
    }

    public final void k(String string) {
        this.i = string;
    }

    public final void l(String string) {
        try {
            this.E = Integer.parseInt(string);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
    }

    public final int b() {
        return this.h;
    }

    public final int c() {
        return this.i;
    }

    public final void m(String string) {
        if ((string = string.trim()).lastIndexOf(37) == string.length() - 1) {
            this.y = bj.a(string.substring(0, string.length() - 1), -1);
            if (this.y < 0) {
                this.y = -1;
            } else if (this.y > 100) {
                this.y = 100;
            }
            this.l = true;
        } else {
            this.y = bj.a(string, -1);
            this.l = false;
        }
        this.q();
    }

    public final void b(int n2) {
        this.y = this.y == -1 ? n2 : Math.min(n2, this.y);
        this.q();
    }

    public final void n(String string) {
        if ((string = string.trim()).lastIndexOf(37) == string.length() - 1) {
            this.z = bj.a(string.substring(0, string.length() - 1), -1);
            if (this.z < 0) {
                this.z = -1;
            } else if (this.z > 100) {
                this.z = 100;
            }
            this.m = true;
        } else {
            this.z = bj.a(string, -1);
            this.m = false;
        }
        this.q();
    }

    public final void c(int n2) {
        this.z = this.z == -1 ? n2 : Math.min(n2, this.z);
        this.q();
    }

    public final int d() {
        return this.E;
    }

    public final void e(ai ai2) {
        this.b = ai2;
    }

    public final ai b() {
        return this.b;
    }

    public final void a(av av2) {
        this.a.a(av2);
    }

    public final int e() {
        if (this.G != 2) {
            if ((this.a | this.b) == -1) {
                return this.a.b;
            }
            if (this.a == 0) {
                return 2;
            }
            if (this.b == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    protected final void q() {
        while (true) {
            bc2.a.e = true;
            if (bc2.b == null) break;
            bc bc2 = bc2.b;
        }
    }

    protected final void r() {
        this.a.e = true;
        if (this instanceof ai) {
            ai ai2 = (ai)this;
            Object object = ai2;
            object = ai2;
            object = ai2.a;
            if (object != null) {
                int n2 = ((bd)object).a();
                while (--n2 >= 0) {
                    ((bd)object).a(n2).r();
                }
            }
        }
    }

    public final boolean c() {
        return this.e() == 0;
    }

    public final boolean d() {
        return this.a.b == 1;
    }

    public final void d(boolean bl) {
        this.a.b = (byte)(bl ? 0 : 2);
        if (this instanceof ai) {
            q.a((byte)10);
        }
        this.q();
        q.a((byte)1);
        q.a((byte)19);
    }

    public final void e(boolean bl) {
        this.a.b = bl ? (byte)1 : 0;
        this.q();
    }

    public final String f() {
        return this.a;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final void s() {
        if (this.h > 0 && this.i > 0) {
            bc bc2 = this;
            bc bc3 = bc2;
            bc3 = this;
            q.a().a(bc2.j, bc3.k, this.h, this.i);
        }
    }

    public final void o(String string) {
        this.a = string.intern();
    }

    static {
        g = true;
        b = new Vector();
        a = new StringBuffer();
    }
}
