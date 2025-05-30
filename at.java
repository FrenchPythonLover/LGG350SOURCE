/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.NoSuchElementException;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class at
extends bc {
    private String a;
    private int a;
    private int[] a;

    public at(String string, String string2) {
        this.o("shape");
        this.a = string2;
        this.a(string);
        this.b(string2);
    }

    private void a(String string) {
        boolean bl = true;
        try {
            this.a = Integer.parseInt(string);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
            return;
        }
        finally {
            if (!bl) {
                if ("LINE".equals(string = string.toUpperCase())) {
                    this.a = 0;
                } else if ("RECT".equals(string)) {
                    this.a = 1;
                } else if ("ARC".equals(string)) {
                    this.a = 2;
                } else if ("ROUND-RECT".equals(string)) {
                    this.a = 3;
                } else if ("TRIANGLE".equals(string)) {
                    this.a = 4;
                } else if ("FILLED-RECT".equals(string)) {
                    this.a = 5;
                } else if ("FILLED-ARC".equals(string)) {
                    this.a = 6;
                } else if ("FILLED-ROUND-RECT".equals(string)) {
                    this.a = 7;
                } else if ("FILLED-TRIANGLE".equals(string)) {
                    this.a = 8;
                }
            }
        }
    }

    private void b(String string) {
        try {
            string = string.trim();
            switch (this.a) {
                case 0: 
                case 1: 
                case 5: {
                    this.a = new int[4];
                    break;
                }
                case 2: 
                case 3: 
                case 4: 
                case 6: 
                case 7: 
                case 8: {
                    this.a = new int[6];
                }
            }
            int n = 0;
            boolean bl = false;
            for (int i = 0; i < this.a.length; ++i) {
                n = string.indexOf(44);
                if (n == -1) {
                    n = string.length();
                    bl = true;
                }
                this.a[i] = bj.a(string.substring(0, n), 0);
                if (bl) break;
                string = string.substring(n + 1);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a() {
        super.a();
        this.a = null;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (g && f) {
            int n9 = u.j;
            int n10 = u.k;
            this.a(n9, n10);
            super.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
            graphics.setColor(((av)((Object)this.a)).a);
            if (((av)((Object)this.a)).k != 0) {
                graphics.setStrokeStyle(1);
            }
            u.a(this.l, this.m);
            switch (this.a) {
                case 0: {
                    graphics.drawLine(this.a[0] + u.j, this.a[1] + u.k, this.a[2] + u.j, this.a[3] + u.k);
                    break;
                }
                case 1: {
                    graphics.drawRect(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3]);
                    break;
                }
                case 5: {
                    graphics.fillRect(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3]);
                    break;
                }
                case 2: {
                    graphics.drawArc(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3], this.a[4], this.a[5]);
                    break;
                }
                case 3: {
                    graphics.drawRoundRect(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3], this.a[4], this.a[5]);
                    break;
                }
                case 4: {
                    int[] nArray = this.a;
                    Graphics graphics2 = graphics;
                    graphics2.drawLine(nArray[0] + u.j, nArray[1] + u.k, nArray[2] + u.j, nArray[3] + u.k);
                    graphics2.drawLine(nArray[2] + u.j, nArray[3] + u.k, nArray[4] + u.j, nArray[5] + u.k);
                    graphics2.drawLine(nArray[0] + u.j, nArray[1] + u.k, nArray[4] + u.j, nArray[5] + u.k);
                    break;
                }
                case 6: {
                    graphics.fillArc(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3], this.a[4], this.a[5]);
                    break;
                }
                case 7: {
                    graphics.fillRoundRect(this.a[0] + u.j, this.a[1] + u.k, this.a[2], this.a[3], this.a[4], this.a[5]);
                    break;
                }
                case 8: {
                    graphics.fillTriangle(this.a[0] + u.j, this.a[1] + u.k, this.a[2] + u.j, this.a[3] + u.k, this.a[4] + u.j, this.a[5] + u.k);
                }
            }
            if (((av)((Object)this.a)).k != 0) {
                graphics.setStrokeStyle(0);
            }
            u.a(-this.l - this.A, -this.m - this.B);
        }
    }

    public final void a(int n, int n2) {
        super.a(n, n2);
        this.o();
        this.b(n, n2);
    }

    public final void a(Object object) {
        this.b((String)object);
    }

    public final Object a() {
        return null;
    }

    public final void e() {
    }

    public final boolean a(ah ah2, int n) {
        boolean bl = super.a(ah2, n);
        if (!bl) {
            switch (n) {
                case -87: {
                    ah2.c(this.a);
                    break;
                }
                case -88: {
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

    public final boolean a(int n, boolean bl, Object object, int n2) {
        if (!(bl = super.a(n, bl, object, n2))) {
            switch (n) {
                case -87: {
                    this.a(bj.a(object, ""));
                    at.m();
                    break;
                }
                case -88: {
                    this.b(bj.a(object, ""));
                    this.a = bj.a(object, "");
                    at.m();
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

    public final boolean a(ah ah2, af af2, int n, ah ah3) {
        if (super.a(ah2, af2, n, ah3)) {
            return true;
        }
        throw new NoSuchElementException("no such method");
    }
}
