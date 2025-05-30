/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;

final class l
implements Runnable {
    l() {
    }

    public final void run() {
        Enumeration enumeration = k.a.elements();
        while (enumeration.hasMoreElements()) {
            n n2 = (n)enumeration.nextElement();
            try {
                n2.a();
            }
            catch (Exception exception) {}
        }
        k.a.removeAllElements();
        k.a(k.a());
    }
}
