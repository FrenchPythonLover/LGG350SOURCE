/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;

public class Widget
extends MIDlet {
    public void startApp() {
        Widget widget = this;
        try {
            String string = widget.getAppProperty("Widget-URL");
            if (string != null) {
                widget.platformRequest(string);
            }
        }
        catch (Exception exception) {}
        this.destroyApp(true);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
        this.notifyDestroyed();
    }
}
