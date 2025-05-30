/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ay
extends Canvas {
    private String a;
    private String b;
    ap a;
    private int c = 3;
    private int d;
    private int e;
    public int a;
    public int b;
    private boolean a;
    private boolean b;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private au a;
    private ai a;
    private aj a;

    public ay(String object, String object2, ap ap2) {
        this.a = object;
        this.b = object2;
        this.a = ap2;
        this.setFullScreenMode(true);
        object = this;
        this.a = new au(((ay)((Object)object)).a, ((ay)((Object)object)).b, null, null, false);
        ((ay)((Object)object)).a.b(q.d);
        ((ay)((Object)object)).a.a(object.getWidth(), object.getHeight());
        ((ay)((Object)object)).a.a(object.getWidth(), object.getHeight(), 0, true);
        object2 = am.a();
        ((ay)((Object)object)).a = ((ay)((Object)object)).a.c() ? ((ay)((Object)object)).a.c() : ((am)object2).a() + (((ay)((Object)object)).c << 1);
        ((ay)((Object)object)).f = object.getHeight() - ((ay)((Object)object)).a;
        ((ay)((Object)object)).g = ((am)object2).a(((ay)((Object)object)).a) + 10;
        ((ay)((Object)object)).h = ((am)object2).a(((ay)((Object)object)).b) + 10;
        ((ay)((Object)object)).i = 2;
        ((ay)((Object)object)).j = object.getWidth() - ((am)object2).a(((ay)((Object)object)).b) - 2;
        ((ay)((Object)object)).a = new ai(false);
        ((ay)((Object)object)).a.o("softkeys");
        ((ay)((Object)object)).a = new aj(((ay)((Object)object)).a.a == null ? "" : ((ay)((Object)object)).a.a, false, "wrap");
        ((ay)((Object)object)).a.a(((ay)((Object)object)).a);
        ((ay)((Object)object)).a.a(((ay)((Object)object)).a, q.d, false, false);
        ((ay)((Object)object)).a.b(object.getWidth());
        ((av)((Object)((ay)((Object)object)).a.a)).c = 1;
        ((av)((Object)((ay)((Object)object)).a.a)).d = 2;
        ((ay)((Object)object)).a.a(object.getWidth(), object.getHeight());
        ((ay)((Object)object)).a.a(object.getWidth(), object.getHeight(), 0, false);
        ((ay)((Object)object)).b = ((ay)((Object)object)).a.c();
    }

    public final void showNotify() {
        az az2 = new az(this);
        new Thread(az2);
    }

    public final void paint(Graphics graphics) {
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        bc.f = true;
        graphics.setClip(0, 0, this.getWidth(), this.getHeight());
        u.k = 0;
        u.j = 0;
        this.a.a(graphics, 0, 0, this.getWidth(), this.getHeight(), 0, 0, this.getWidth(), this.getHeight());
        u.k = this.getHeight() - this.a.c();
        this.a.a(graphics, 0, 0, this.getWidth(), this.getHeight(), 0, 0, this.getWidth(), this.getHeight());
        u.k = 0;
    }

    public final void keyPressed(int n2) {
        if (n2 == q.i) {
            this.a();
            return;
        }
        if (n2 == q.j) {
            this.b();
            return;
        }
        if (n2 == q.h) {
            this.a();
        }
    }

    private void a() {
        Runnable runnable = new ba(this);
        runnable = new Thread(runnable);
        ((Thread)runnable).start();
    }

    private void b() {
        Runnable runnable = new bb(this);
        runnable = new Thread(runnable);
        ((Thread)runnable).start();
    }

    public final void pointerPressed(int n2, int n3) {
        this.d = n2;
        this.e = n3;
        this.a = false;
        this.b = false;
        if (n3 >= this.f && n3 <= this.f + this.a) {
            if (n2 >= this.i - 10 && n2 <= this.i + this.g + 10) {
                this.a = true;
                return;
            }
            if (n2 >= this.j - 10 && n2 <= this.j + this.h + 10) {
                this.b = true;
                return;
            }
        }
    }

    public final void pointerReleased(int n2, int n3) {
        if ((this.a || this.b) && Math.abs(this.d - n2) < 20 && Math.abs(this.e - n3) < 20) {
            if (this.a) {
                this.a();
            }
            if (this.b) {
                this.b();
            }
        }
    }
}
