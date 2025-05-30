/*
 * Decompiled with CFR 0.152.
 */
public final class ae
extends RuntimeException {
    private Object a;

    ae(Object object) {
        super(object.toString());
        this.a = object;
    }

    public final Object a() {
        return this.a;
    }

    public final String getMessage() {
        if (ab.a > 0) {
            return "script-thrown exception: '" + this.a.toString() + "' at line " + ab.a;
        }
        return "script-thrown exception: '" + this.a.toString() + "'";
    }
}
