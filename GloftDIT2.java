/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GloftDIT2
extends Z0 {
    public static GloftDIT2 a;
    public static boolean a;
    private static j a;
    public static int a;
    public static boolean b;
    private boolean c = false;

    public void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        a = this;
    }

    public void startApp() {
        j.s = false;
        if (j.a() && (a == 0 || a == 1 && a)) {
            super.startApp();
        } else {
            if (a == null) {
                a = new j();
            }
            a.a();
            a = 1;
        }
    }

    public void pauseApp() {
        j.s = true;
        if (j.a()) {
            try {
                super.pauseApp();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public void destroyApp(boolean bl) {
        if (j.a()) {
            try {
                super.destroyApp(true);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    static {
        a = false;
        a = 0;
        b = false;
    }

    public GloftDIT2() {
        this.a();
    }
}
