/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.icc.morpheus.MorpheusMidlet
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.GameCanvas
 */
import com.icc.morpheus.MorpheusMidlet;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class u
extends GameCanvas {
    private int[] a;
    public static int a = 0;
    public static int b = 0;
    public static boolean a = false;
    public static boolean b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static boolean c;
    public static boolean d;
    public static aj a;
    private Graphics a;
    private int l = 0;
    private q a;
    private boolean e;
    private int m = 0;
    private int n = 0;
    private static int o;
    public static ai a;
    private static long a;
    private static long b;
    public static int g;
    public static int h;
    public static ai b;
    public static int i;
    private static long c;
    private boolean f;
    private boolean g;
    private bc a = this.getGraphics();
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private ai c;
    private int u;
    private int v;
    private int w;
    private int x;
    private static int y;
    public static int j;
    public static int k;

    public final void a(int n, int n2, int n3, int n4) {
        if (n3 + n4 == 0) {
            return;
        }
        if (this.a[2] == 0 && this.a[3] == 0) {
            bj.a(this.a, n, n2, n3, n4);
        }
        bj.b(this.a, n, n2, n3, n4);
    }

    public u(q object) {
        super(false);
        this.setFullScreenMode(true);
        this.a = object;
        object = this;
        ((u)((Object)object)).a(true, true);
    }

    public final void a() {
        this.a = null;
        if (a != null) {
            a.a();
        }
        a = null;
        if (b != null) {
            b.a();
        }
        b = null;
        if (this.c != null) {
            this.c.a();
        }
        this.c = null;
    }

    /*
     * WARNING - void declaration
     */
    private void a(boolean bl, boolean bl2) {
        void var2_3;
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        try {
            System.out.println("-----Draw Splash-----");
            this.a.setColor(15005693);
            this.a.fillRect(0, 0, this.getWidth(), this.getHeight());
            Image exception = Image.createImage((String)"/lobbyMenu/powerdBy.png");
            this.a.drawImage(exception, n2 - exception.getWidth() >> 1, n3 - 31, 36);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (var2_3 != false) {
            this.flushGraphics();
        }
        c = false;
    }

    public final void b() {
        int n2;
        au au2;
        boolean bl = false;
        if (!q.h) {
            this.a.setClip(0, 0, this.getWidth(), this.getHeight());
            this.a(true, false);
            bl = true;
        }
        if (k.b() && (au2 = au.a) != null && au2.b != null) {
            aj aj2 = au2.b;
            n2 = bc.f ? 1 : 0;
            bc.f = true;
            String string = aj2.b();
            aj2.a(MorpheusMidlet.c);
            try {
                au2.a(au2.b(), au2.c());
                au2.a(this.getWidth(), this.getHeight(), 0, true);
                this.m = 0;
                j = 0;
                k = this.n = this.getHeight() - au2.c();
                this.a.setClip(0, 0, this.getWidth(), this.getHeight());
                au2.a(this.a, 0, 0, this.getWidth(), k, 0, 0, this.getWidth(), this.getHeight());
                this.flushGraphics();
                this.n = 0;
                k = 0;
                this.m = 0;
                j = 0;
            }
            catch (Exception exception) {
            }
            finally {
                aj2.b();
                aj2.a(string);
            }
            bc.f = n2;
        }
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        n2 = q.a.getWidth();
        int n5 = q.a.getHeight();
        int n6 = n3 - n2 >> 1;
        int n7 = n4 - n5 >> 1;
        int n8 = n2 + 30;
        int n9 = n5 + 30;
        int n10 = n3 - n8 >> 1;
        int n11 = n4 - n9 >> 1;
        am am2 = am.a();
        int n12 = am2.a();
        n12 = n4 - n12 >> 1;
        int n13 = q.q - q.r;
        if (q.q == 100) {
            q.r = 100;
        } else if (n13 > 10) {
            q.r += 8;
        } else if (n13 > 6) {
            q.r += 4;
        } else if (n13 > 3) {
            q.r += 2;
        } else if (n13 > 0) {
            ++q.r;
        }
        String string = Integer.toString(q.r);
        if (k.a() || q.c) {
            string = "Cancelling";
        }
        int n14 = n3 - am2.a(string) >> 1;
        if (q.a != null) {
            this.a.setClip(0, 0, n3, n4);
            this.a.setColor(0xDDDDDD);
            this.a.fillRoundRect(n10, n11, n8, n9, 10, 10);
            this.a.setColor(0xFFFFFF);
            this.a.fillRoundRect(n10 + 1, n11 + 1, n8 - 2, n9 - 2, 10, 10);
            this.a.translate(n6, n7);
            q.a.paint(this.a);
            this.a.translate(-n6, -n7);
            q.a.nextFrame();
            this.a.setColor(0);
            am2.a(this.a, string, n14, n12, 1, 0);
            if (q.a.getFrame() == 0) {
                n3 = q.s;
                n4 = 0;
                n6 = 0;
                switch (n3) {
                    case 0: {
                        n3 = 5;
                        n4 = n2 - 1;
                        break;
                    }
                    case 5: {
                        n3 = 3;
                        n4 = n2 - 1;
                        n6 = n5 - 1;
                        break;
                    }
                    case 3: {
                        n3 = 6;
                        n6 = n5 - 1;
                        break;
                    }
                    default: {
                        n3 = 0;
                    }
                }
                q.a.setTransform(n3);
                q.a.setRefPixelPosition(n4, n6);
                q.s = n3;
            }
            if (bl) {
                this.flushGraphics();
                return;
            }
            this.flushGraphics(n10, n11, n8, n9);
        }
    }

    public final void c() {
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        a.a(n2 - 10, n3);
        j = n2 - a.b() >> 1;
        k = n3 / 2 - a.c() / 2;
        bc.g = true;
        bc.f = true;
        a.a(this.a, 0, 0, n2, n3, 0, 0, n2, n3);
        if (!d) {
            this.flushGraphics();
        } else {
            d = true;
        }
        j = 0;
        k = 0;
    }

    public final void a(boolean bl) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (b || !q.e || c) {
            int n6 = this.getWidth();
            int n7 = this.getHeight();
            b = false;
            this.e = false;
            this.m = 0;
            this.n = 0;
            int n8 = 0;
            if (au.a != null) {
                n8 = au.a.c();
            }
            int n9 = n7 - n8;
            int n10 = n6;
            Graphics graphics = this.a;
            u u2 = this;
            if (a == 1 || a == -1) {
                a = 0;
            }
            if (a != 0 || b != 0) {
                if ((c & d & e & f) != Integer.MIN_VALUE) {
                    if (d > n9) {
                        b = 0;
                        a = 0;
                    } else if (d + f > n9) {
                        f = n9 - d;
                    }
                    graphics.setClip(c, d, e, f);
                } else {
                    graphics.setClip(0, 0, n10, n9);
                }
                q.p = 1;
                if (a != 0) {
                    u2.m = a >> 1;
                    if ((a -= u2.m) > 0) {
                        if (a == 1) {
                            a = 0;
                        }
                    } else if (a < 0 && a == -1) {
                        a = 0;
                    }
                }
                if (b != 0) {
                    u2.n = b >> 1;
                    if ((b -= u2.n) > 0) {
                        if (b == 1) {
                            b = 0;
                        }
                    } else if (b < 0 && b == -1) {
                        b = 0;
                    }
                }
                u2.e = true;
                b = true;
            } else {
                f = Integer.MIN_VALUE;
                e = Integer.MIN_VALUE;
                d = Integer.MIN_VALUE;
                c = Integer.MIN_VALUE;
                q.p = q.b;
                graphics.setClip(0, 0, n10, n9);
            }
            graphics.translate(u2.m, u2.n);
            if (!b && bc.g) {
                if (this.a[2] == 0 && this.a[3] == 0) {
                    return;
                }
                n5 = this.a[0];
                n4 = this.a[1];
                n3 = this.a[2];
                n2 = this.a[3];
                this.a[3] = 0;
                this.a[2] = 0;
                this.a[1] = 0;
                this.a[0] = 0;
                this.a.setClip(n5, n4, n3, n2);
            }
            n9 = n7 - n8;
            n10 = n6;
            graphics = this.a;
            u2 = this;
            if (a) {
                ++u2.l;
                n8 = n10 >> 1;
                int n11 = n9 >> 1;
                if ((n10 >>= u2.l) != 0 || (n9 >>= u2.l) != 0) {
                    q.p = 0;
                    graphics.setClip(n10, n9, n8 - n10 << 1, n11 - n9 << 1);
                    u2.e = true;
                    b = true;
                } else {
                    q.p = q.b;
                    u2.l = 0;
                    a = false;
                }
            }
            if (bl) {
                this.a.setColor(0xFFFFFF);
                this.a.fillRect(0, 0, n6, n7);
            }
            ak.a(this.a, 0, 0, n6, n7, 0, 0, n6, n7);
            if (bj.a) {
                this.c();
                b = true;
            }
            if (bc.g) {
                if (b) {
                    this.flushGraphics();
                } else {
                    this.flushGraphics(n5, n4, n3, n2);
                }
            }
            if (this.e) {
                this.a.translate(-this.a.getTranslateX(), -this.a.getTranslateY());
                this.d();
            }
        }
        c = false;
        j = 0;
        k = 0;
    }

    public final void d() {
        this.a(0, 0, this.getWidth(), this.getHeight());
        q.a((byte)2);
    }

    public final void showNotify() {
        this.a.a(true);
        q.a((byte)2);
    }

    public final void hideNotify() {
        if (this.a != null) {
            this.a.a(false);
        }
    }

    protected final void keyPressed(int n2) {
        if (a == 0 && b == 0) {
            this.a.a(n2, false);
        }
    }

    protected final void keyRepeated(int n2) {
        if (a == 0 && b == 0) {
            this.a.a(n2, true);
        }
    }

    protected final void keyReleased(int n2) {
        q.t = 0;
    }

    public final void a(DataOutputStream dataOutputStream) {
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        Image image = Image.createImage((int)n2, (int)n3);
        int[] nArray = new int[n2];
        this.paint(image.getGraphics());
        dataOutputStream.writeInt(1);
        dataOutputStream.writeInt(n2);
        dataOutputStream.writeInt(n3);
        for (int i = 0; i < n3; ++i) {
            image.getRGB(nArray, 0, n2, 0, i, n2, 1);
            int n4 = nArray[0];
            int n5 = 1;
            for (int j = 1; j < nArray.length; ++j) {
                if (n4 == nArray[j] && n5 < 127) {
                    ++n5;
                    continue;
                }
                dataOutputStream.writeByte(n5);
                dataOutputStream.writeInt(n4);
                n4 = nArray[j];
                n5 = 1;
            }
            dataOutputStream.writeByte(n5);
            dataOutputStream.writeInt(n4);
        }
    }

    public final void pointerPressed(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        this.p = -1;
        o = 0;
        this.c = null;
        this.f = false;
        this.g = false;
        this.q = n2;
        this.r = n3;
        y = -1;
        this.u = -1;
        this.v = -1;
        this.x = -1;
        this.w = -1;
        Vector vector = q.a.d;
        if (a != null) {
            n6 = a.f();
            n5 = a.g();
            int n7 = a.b() + n6;
            n4 = a.c() + n5;
            if (n2 >= n6 && n2 <= n7 && n3 >= n5 && n3 <= n4) {
                this.p = n3;
            }
        }
        if (au.a != null && (q.a.u == 5 || ak.a("[sofkeys-options]") == null || ak.a("[sofkeys-options]").c())) {
            n6 = au.a.g();
            n5 = au.a.c() + n6;
            if (n3 >= n6 && n3 <= n5) {
                this.v = n6;
                this.x = n5 + this.v;
                this.a = au.a.a();
                this.u = this.a.f();
                this.w = this.a.b() + this.u;
                if (n2 >= this.u - 10 && n2 <= this.w + 10) {
                    this.f = true;
                    return;
                }
                this.a = au.a.b();
                this.u = this.a.f();
                this.w = this.a.b() + this.u;
                if (n2 >= this.u - 10 && n2 <= this.w + 10) {
                    this.g = true;
                    return;
                }
            }
        }
        if (q.b) {
            return;
        }
        if (vector != null) {
            n4 = n6 = vector.size();
            while (--n4 >= 0) {
                Vector vector2 = (Vector)vector.elementAt(n4);
                n5 = vector2.size();
                while (--n5 >= 0) {
                    ai ai2 = (ai)vector2.elementAt(n5);
                    this.u = ai2.f();
                    this.v = ai2.a;
                    this.w = ai2.b() + this.u;
                    this.x = ai2.b + this.v;
                    ai ai3 = ai2;
                    if (!ai3.d || n2 < this.u || n2 > this.w || n3 < this.v || n3 > this.x) continue;
                    g = n4;
                    h = n5;
                    this.c = ai2;
                    this.s = n2;
                    this.t = n3;
                    return;
                }
            }
        }
    }

    public final void pointerDragged(int n2, int n3) {
        int n4;
        if (q.b) {
            return;
        }
        if (this.c != null && this.c.c) {
            boolean bl;
            n4 = this.s - n2;
            int n5 = this.t - n3;
            if (Math.abs(n4) < 20 && Math.abs(n5) < 20) {
                return;
            }
            this.s = n2;
            this.t = n3;
            boolean bl2 = bl = Math.abs(n4) > Math.abs(n5);
            if (System.currentTimeMillis() - (long)(q.b << 2) > c) {
                if (bl) {
                    if (n4 >= i) {
                        c = System.currentTimeMillis();
                        ai ai2 = this.c;
                        q.a(this.c, ai2.k);
                    } else if (n4 <= -i) {
                        c = System.currentTimeMillis();
                        ai ai3 = this.c;
                        q.a(this.c, ai3.l);
                    }
                } else if (n5 >= i) {
                    c = System.currentTimeMillis();
                    ai ai4 = this.c;
                    q.a(this.c, ai4.i);
                } else if (n5 <= -i) {
                    c = System.currentTimeMillis();
                    ai ai5 = this.c;
                    q.a(this.c, ai5.j);
                }
            }
        }
        if (this.p != -1 && (Math.abs(this.q - n2) >= 20 || Math.abs(this.r - n3) >= 20)) {
            o = n3 - this.p;
            this.p = n3;
            n4 = 0;
            if (o > 0) {
                n4 = 1;
            }
            q.v = o << 1;
            q.a((byte)17);
            if (y == -1) {
                y = n4 != 0 ? 0 : 1;
                return;
            }
            if (n4 != 0) {
                if (y != 0) {
                    this.q = Integer.MIN_VALUE;
                    return;
                }
            } else if (y != 1) {
                this.r = Integer.MIN_VALUE;
            }
        }
    }

    public final void pointerReleased(int n2, int n3) {
        if (q.b) {
            if (this.g) {
                q.w = q.j;
            }
            return;
        }
        if (this.c != null) {
            if (n2 >= this.u && n2 <= this.w && n3 >= this.v && n3 <= this.x && System.currentTimeMillis() - a > b && Math.abs(this.q - n2) < 20 && Math.abs(this.r - n3) < 20) {
                if (q.a.a != null && q.a.u == 11) {
                    q.a.a.a(q.d);
                    this.c.a(q.d);
                    q.a.a = this.c;
                    q.a.a((String)null, false);
                }
                b = this.c;
                a = System.currentTimeMillis();
            }
        } else if (this.f || this.g) {
            if (n2 >= this.u && n2 <= this.u + this.w && n3 >= this.v && n3 <= this.v + this.x && Math.abs(this.q - n2) < 20 && Math.abs(this.r - n3) < 20 && (this.f && !q.j || this.g && !q.k)) {
                Object object = this.f ? au.a.b() : au.a.c();
                q.a(null, object);
            }
        } else if (q.a.u == 13 && ak.a("[sofkeys-options]") != null && ak.a("[sofkeys-options]").c()) {
            bc bc2 = ak.a("[sofkeys-options]");
            int n4 = bc2.f();
            int n5 = bc2.g();
            int n6 = bc2.b() + n4;
            int n7 = bc2.c() + n5;
            if (n2 < n4 || n2 > n6 || n3 < n5 || n3 > n7) {
                q.a(ak.a("[sofkeys-options]"), (Object)"Page.toggleSoftkeyOptionsMenu()");
            }
        }
        this.p = -1;
        this.c = null;
        a = 0L;
    }

    public final void sizeChanged(int n2, int n3) {
        ai ai2;
        q.n = n2;
        q.o = n3;
        if (ak.a != null && ak.a[5] != null && (ai2 = (ai)ak.a[5].a()) != null) {
            ai2.b = false;
            ai2.a = false;
            ai2.c(-1);
            ai2.b(-1);
            this.d();
        }
        if (q.g) {
            c = true;
            this.d();
            q.a((byte)16);
            if (!q.h) {
                u u2 = this;
                u2.a(true, true);
            }
        }
    }

    public static void a(int n2, int n3) {
        j += n2;
        k += n3;
    }

    static {
        c = Integer.MIN_VALUE;
        d = Integer.MIN_VALUE;
        e = Integer.MIN_VALUE;
        f = Integer.MIN_VALUE;
        a = new aj("Unable to retrieve images from external memory", false, "Wrap");
        ((av)((Object)new aj("Unable to retrieve images from external memory", false, "Wrap").a)).b = new int[]{0xFFFFFF};
        ((av)((Object)u.a.a)).d = new int[]{0xCCCCCC, 0xCCCCCC, 0xCCCCCC, 0xCCCCCC};
        ((av)((Object)u.a.a)).b = 5;
        ((av)((Object)u.a.a)).q = 1;
        b = 150L;
        y = -1;
    }
}
