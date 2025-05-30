/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lge.oem.virtualkeypad.VirtualKeypad
 *  com.lge.oem.virtualkeypad.VirtualKeypadListener
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 */
import com.lge.oem.virtualkeypad.VirtualKeypad;
import com.lge.oem.virtualkeypad.VirtualKeypadListener;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class al
implements VirtualKeypadListener {
    VirtualKeypad a;
    CommandListener a;
    Command a;
    String a;

    public al(String string, String string2, int n, int n2) {
        this.a = new VirtualKeypad(string, string2, n, n2);
        this.a.setVirtualKeypadListener((VirtualKeypadListener)this);
    }

    public final void virtualKeypadCompleted(String string) {
        this.a = string;
        this.a.destroyKeypad();
        this.a.commandAction(this.a, null);
    }
}
