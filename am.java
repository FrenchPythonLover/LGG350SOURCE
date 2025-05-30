/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lge.lcdui.OemFont
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
import com.lge.lcdui.OemFont;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class am {
    public static boolean a = false;
    private Font a;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private am() {
    }

    public final void a() {
        this.a = null;
    }

    public final int a(char c) {
        return this.a.charWidth(c);
    }

    public final int a() {
        return this.b;
    }

    public final int a(String string) {
        return this.a.stringWidth(string);
    }

    public final int a(String string, int n, int n2) {
        return this.a.substringWidth(string, n, n2);
    }

    public final void a(Graphics object, String string, int n, int n2, int n3, int n4) {
        int n5 = 0;
        object.setFont(this.a);
        if (this.a != 0 || n3 != 4) {
            n5 = this.a.stringWidth(string);
        }
        switch (n3) {
            case 8: {
                if (n4 <= n5) break;
                n += n4 - n5;
                break;
            }
            case 1: {
                if (n4 <= n5) break;
                n += n4 - n5 >> 1;
            }
        }
        object.drawString(string, n + u.j, n2 + u.k + 1, 20);
        if (this.a != 0) {
            n4 = this.a;
            n3 = n5;
            string = object;
            object = this;
            n5 = n2;
            switch (n4) {
                case 1: {
                    n5 = n2 + (object.b - 2);
                    break;
                }
                case 3: {
                    n5 = n2 + (object.b >> 1);
                    break;
                }
                case 2: {
                    ++n5;
                }
            }
            string.drawLine(n + u.j, n5 + u.k, n + n3 + u.j, n5 + u.k);
        }
    }

    public static am a(int n, int n2, int n3, am am2) {
        try {
            am am3 = new am();
            new am().a = OemFont.getOemFont((int)OemFont.OEM_FONT_SET_SMALL, (int)0, (int)n2, (int)n3);
            am3.b = am3.a.getHeight();
            return am3;
        }
        catch (Exception exception) {
            if (am2 == null || n2 != am2.c || n != am2.e || n3 != am2.d) {
                am am4 = new am();
                new am().a = Font.getFont((int)0, (int)n2, (int)n3);
                am4.b = am4.a.getHeight();
                am4.e = n;
                am4.c = n2;
                am4.d = n3;
                return am4;
            }
            return am2;
        }
    }

    public static am a() {
        try {
            am am2 = new am();
            new am().a = OemFont.getOemFont((int)OemFont.OEM_FONT_SET_SMALL, (int)0, (int)0, (int)0);
            am2.b = am2.a.getHeight();
            return am2;
        }
        catch (Exception exception) {
            am am3 = new am();
            new am().a = Font.getDefaultFont();
            am3.b = am3.a.getHeight();
            return am3;
        }
    }

    public final void a(int n) {
        this.a = n;
    }
}
