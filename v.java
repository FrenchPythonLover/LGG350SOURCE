/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 */
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import javax.microedition.io.Connector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class v
implements Runnable {
    private Object[] a;
    private Object[] b;
    private Object[] c;
    private int a;
    private long a;
    private Thread a;
    public static String a = null;
    private volatile boolean a = 1;

    public final void a() {
        this.c = this.a;
    }

    public final void a(ah ah2, ah ah3, ab ab2, Object object) {
        Object[] objectArray;
        Object[] objectArray2 = objectArray = this.c != null ? this.c : this.a;
        while (objectArray != null) {
            Object object2;
            ah3.a(objectArray[2]);
            ah3.a(1);
            try {
                if (object instanceof String) {
                    ab2.a(ah2, (String)object, ah3);
                } else {
                    ((af)object).a(ah2, null, ah3);
                }
            }
            catch (Exception objectArray3) {
                object2 = objectArray3;
                objectArray3.printStackTrace();
                ah3.a(false);
            }
            if (ah2.c()) {
                objectArray = (Object[])objectArray[0];
                continue;
            }
            object2 = objectArray;
            objectArray = (Object[])objectArray[0];
            Object[] objectArray4 = object2;
            object2 = this;
            if (objectArray4[1] == null) {
                object2.a = (Object[])objectArray4[0];
            } else {
                ((Object[])objectArray4[1])[0] = objectArray4[0];
            }
            if (objectArray4[0] == null) {
                object2.b = (Object[])objectArray4[1];
                continue;
            }
            ((Object[])objectArray4[0])[1] = objectArray4[1];
        }
        this.c = null;
    }

    public final synchronized void b() {
        if (a == null) {
            return;
        }
        switch (this.a) {
            case 1: {
                if (System.currentTimeMillis() <= this.a) break;
                v v2 = this;
                try {
                    v2.a = 2;
                    v2.a = new Thread(v2);
                    v2.a.start();
                    break;
                }
                catch (Exception exception) {
                    v2.a = null;
                    v2.a = 1;
                    do {
                        v2.a += 1000L;
                    } while (v2.a < System.currentTimeMillis());
                    exception.printStackTrace();
                    return;
                }
            }
            case 2: {
                if (this.a != null && this.a.isAlive()) break;
                this.a = null;
                this.a = 1;
                this.a = System.currentTimeMillis() + (long)(this.a ? 1000 : 0);
                return;
            }
            default: {
                throw new Error();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        w w2 = null;
        Object object = null;
        this.a = false;
        try {
            System.currentTimeMillis();
            w2 = (w)Connector.open((String)a);
            int n2 = w2.getResponseCode();
            if (n2 != 200) {
                throw new IOException("message poll got " + n2);
            }
            object = w2.openDataInputStream();
            while (true) {
                block37: {
                    try {
                        if (((DataInputStream)object).readByte() == 127) break block37;
                        ((FilterInputStream)object).close();
                        object = null;
                        w2.close();
                        w2 = null;
                    }
                    catch (IOException iOException) {
                        try {
                            if (object != null) {
                                ((FilterInputStream)object).close();
                            }
                        }
                        catch (IOException iOException2) {
                            object = iOException2;
                            iOException2.printStackTrace();
                        }
                        try {
                            if (w2 == null) return;
                            w2.close();
                            return;
                        }
                        catch (IOException iOException3) {
                            object = iOException3;
                            iOException3.printStackTrace();
                        }
                        return;
                    }
                    try {
                        if (object != null) {
                            ((FilterInputStream)object).close();
                        }
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    try {
                        if (w2 == null) return;
                        w2.close();
                        return;
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    return;
                }
                n2 = ((DataInputStream)object).readInt();
                if (n2 > 65536) {
                    throw new EOFException("invalid msglen in asynch read thread: " + n2);
                }
                int n3 = 0;
                Object[] objectArray = new byte[n2];
                for (int i = 0; i != n2; i += n3) {
                    n3 = ((DataInputStream)object).read((byte[])objectArray, i, n2 - i);
                    if (n3 != -1) continue;
                    throw new EOFException("short read while reading asynch message");
                }
                v v2 = this;
                synchronized (v2) {
                    Object object2 = new String((byte[])objectArray, "UTF-8");
                    this.a = true;
                    String string = object2;
                    object2 = this;
                    Object[] objectArray2 = new Object[3];
                    objectArray = objectArray2;
                    objectArray2[2] = string;
                    objectArray[1] = (byte)((v)object2).b;
                    if (((v)object2).b != null) {
                        objectArray[1] = (byte)((v)object2).b;
                        ((v)object2).b[0] = objectArray;
                    } else {
                        ((v)object2).a = objectArray;
                    }
                    ((v)object2).b = objectArray;
                    q.a((byte)13);
                    if (this.c == null) {
                        this.c = this.b;
                    }
                }
                continue;
                break;
            }
        }
        catch (ClassCastException classCastException) {
            throw new IllegalArgumentException("Not an HTTP URL");
        }
        catch (IOException iOException) {
            IOException iOException4 = iOException;
            iOException.printStackTrace();
            try {
                if (object != null) {
                    ((FilterInputStream)object).close();
                }
            }
            catch (IOException iOException5) {
                object = iOException5;
                iOException5.printStackTrace();
            }
            try {
                if (w2 == null) return;
                w2.close();
                return;
            }
            catch (IOException iOException6) {
                object = iOException6;
                iOException6.printStackTrace();
            }
            return;
        }
        catch (Throwable throwable) {
            try {
                if (object != null) {
                    ((FilterInputStream)object).close();
                }
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            try {
                if (w2 == null) throw throwable;
                w2.close();
                throw throwable;
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
    }
}
