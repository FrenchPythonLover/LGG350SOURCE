/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Browser
extends MIDlet {
    private boolean I;
    private static boolean Z;
    static boolean Code;
    static Browser Code;
    static Display Code;

    protected void pauseApp() {
        this.I = true;
    }

    static void Code() {
        g.n();
        Code.destroyApp(false);
        Code.notifyDestroyed();
    }

    protected void startApp() {
        Code = this;
        Code = Display.getDisplay((MIDlet)this);
        if (this.I) {
            this.I = false;
            return;
        }
        if (Z) {
            return;
        }
        Z = true;
        String string = "debug";
        String string2 = this.getAppProperty("OM-Campaign");
        if (string2 != null && string2.toLowerCase().indexOf(string.toLowerCase()) != -1) {
            g.B = true;
        }
        new Code().Code();
    }

    protected void destroyApp(boolean bl) {
        Code = true;
        if (Code.Code != null) {
            g.J(true);
            g.Code("h1", Code.I);
            if (!g.ae) {
                Code.Code.Code.cancel();
            }
        }
        Z = false;
    }
}
