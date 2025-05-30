/*
 * Decompiled with CFR 0.152.
 */
final class az
implements Runnable {
    private final ay a;

    az(ay ay2) {
        this.a = ay2;
    }

    public final void run() {
        long l = System.currentTimeMillis();
        while (l + 2000L > System.currentTimeMillis()) {
            this.a.repaint();
            try {
                Thread.sleep(30L);
            }
            catch (Exception exception) {}
        }
    }
}
