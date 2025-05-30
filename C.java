/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.io.InputConnection
 *  javax.microedition.io.file.FileConnection
 *  javax.microedition.io.file.FileSystemRegistry
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class C {
    static String I;
    static String Code;
    static Object[] Code;
    static String Z;
    g Code;
    private C Code;
    private static Vector Code;
    private static String a;
    byte Code;
    int Code;
    int I;
    String J;
    String B;
    String C;
    boolean Code;

    static boolean Code(boolean bl) {
        String string = null;
        if (!bl && g.m != null && g.m.length() > 0) {
            return true;
        }
        if (bl && Code != null && Code.length() > 0) {
            string = Code;
        }
        if (string != null) {
            if (string.startsWith("file:///")) {
                string = string.substring(8);
            }
            if (string.endsWith("/")) {
                string = string.substring(0, string.length() - 1);
            }
            g.m = string;
            g.J(false);
        }
        return g.m.length() > 0;
    }

    private static void Code(Vector vector, Object object) {
        String string = ((String)((Object[])object)[2]).toLowerCase();
        int n = vector.size() - 1;
        if (n < 0 || string.compareTo(((String)((Object[])vector.lastElement())[2]).toLowerCase()) >= 0) {
            vector.addElement(object);
            return;
        }
        while (n > 0 && string.compareTo(((String)((Object[])vector.elementAt(n - 1))[2]).toLowerCase()) < 0) {
            --n;
        }
        vector.insertElementAt(object, n);
    }

    public C() {
    }

    static String Code(boolean bl) {
        if (Code == null) {
            return null;
        }
        String string = (String)Code[2];
        if (string == null) {
            return null;
        }
        if (string.startsWith("image")) {
            string = "photos";
        } else if (string.startsWith("video")) {
            string = "videos";
        } else if (string.startsWith("audio")) {
            string = "music";
        } else {
            return null;
        }
        String string2 = C.Code(string, bl);
        if (string2 != null && string2.startsWith("file:///")) {
            string2 = string2.substring(8);
        }
        return string2;
    }

    public final synchronized boolean Code(Object[] objectArray) {
        if (Code != null) {
            return false;
        }
        Code = objectArray;
        return true;
    }

    static boolean Code() {
        return Code == null;
    }

    public C(byte by) {
    }

    final void Code() {
        if (I != null) {
            return;
        }
        try {
            Object[] objectArray = new Vector();
            C.Code(objectArray);
            if (objectArray.size() > 0) {
                objectArray = (Object[])objectArray.elementAt(0);
                I = (String)objectArray[0];
                Z = (String)objectArray[2];
            }
            return;
        }
        catch (IOException iOException) {
            this.B();
            return;
        }
    }

    public static String Code() {
        if (Code == null) {
            return "/";
        }
        return Code;
    }

    private static void Code(Vector vector) {
        int n;
        Object object;
        String string;
        Object object2 = new String[]{"photos", "graphics", "videos", "music", "tones"};
        for (int i = 0; i < ((String[])object2).length; ++i) {
            string = C.Code(object2[i], false);
            if (string == null || !string.startsWith("file:///")) continue;
            object = C.Code(object2[i], true);
            if (object == null || ((String)object).length() == 1) {
                object = string.substring(8);
            }
            if ((n = ((String)object).lastIndexOf(47, ((String)object).length() - 2)) >= 0) {
                object = ((String)object).substring(n + 1);
            }
            vector.addElement(new Object[]{string.substring(8), new Integer(5), object, null});
        }
        object2 = System.getProperty("fileconn.dir.roots.names");
        Enumeration enumeration = FileSystemRegistry.listRoots();
        if (!enumeration.hasMoreElements()) {
            throw new IOException(g.Code(163));
        }
        while (enumeration.hasMoreElements()) {
            string = (String)enumeration.nextElement();
            object = string;
            if (object2 != null && ((String)object2).length() > 0) {
                n = ((String)object2).indexOf(59);
                if (n != -1) {
                    object = ((String)object2).substring(0, n);
                    object2 = ((String)object2).substring(n + 1);
                } else {
                    object = object2;
                }
            }
            vector.addElement(new Object[]{string, new Integer(5), object, null});
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Vector Code(boolean var1_1) {
        C.Code = new Vector<E>();
        if (C.Code != null) ** GOTO lbl8
        try {
            C.Code(C.Code);
            if (C.Code.size() == 1) {
                C.Code = C.a = (String)((Object[])C.Code.firstElement())[0];
                C.Code = new Vector<E>();
            }
lbl8:
            // 4 sources

            if (C.Code.size() == 0) {
                var2_2 = (FileConnection)Connector.open((String)("file:///" + C.Code), (int)1);
                var3_3 = var2_2.list();
                g.Code((Connection)var2_2);
                var2_2 = new Vector<E>();
                while (var3_3.hasMoreElements()) {
                    var4_5 = (String)var3_3.nextElement();
                    var5_6 = 3 | var4_5.endsWith("/") << 2;
                    if ((var5_6 & 4) == 0 && var1_1) continue;
                    C.Code((Vector)((var5_6 & 4) == 0 ? C.Code : var2_2), (Object)new Object[]{C.Code + var4_5, new Integer(var5_6), var4_5, null});
                }
                for (var3_4 = 0; var3_4 < C.Code.size(); ++var3_4) {
                    var2_2.addElement(C.Code.elementAt(var3_4));
                }
                C.Code = var2_2;
                if (!C.Code()) {
                    if (var1_1 && !g.X) {
                        C.Code.insertElementAt(new Object[]{"+", new Integer(5), "<" + g.Code(171) + ">", null}, 0);
                    }
                    if (C.a == null || !C.a.equals(C.Code)) {
                        C.Code.insertElementAt(new Object[]{"..", new Integer(5), "..", null}, 0);
                    }
                }
            }
            return C.Code;
        }
        catch (Exception v0) {
            this.B();
            return C.Code;
        }
    }

    public static void Code(String string) {
        if ("/".equals(string)) {
            Code = null;
            return;
        }
        if ("..".equals(string)) {
            int n = Code.lastIndexOf(47, Code.length() - 2);
            if (n > 0) {
                Code = Code.substring(0, n + 1);
                return;
            }
            Code = null;
            return;
        }
        Code = string;
    }

    public final synchronized void I() {
        Code = null;
    }

    final void I(String string) {
        FileConnection fileConnection;
        block6: {
            fileConnection = null;
            try {
                if (!string.endsWith("/")) {
                    string = string + "/";
                }
                if ((fileConnection = (FileConnection)Connector.open((String)("file:///" + Code + string), (int)3)).exists()) break block6;
                fileConnection.mkdir();
            }
            catch (Exception exception) {
                try {
                    this.B();
                    return;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    g.Code(fileConnection);
                }
            }
        }
        g.Code((Connection)fileConnection);
        return;
    }

    private static String Code(String string, boolean bl) {
        StringBuffer stringBuffer = new StringBuffer("fileconn.dir.");
        stringBuffer.append(string);
        if (bl) {
            stringBuffer.append(".name");
        }
        return System.getProperty(stringBuffer.toString());
    }

    static void J(String string) {
        FileConnection fileConnection = null;
        DataInputStream dataInputStream = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)("file:///" + string + "/"), (int)1);
            Enumeration enumeration = fileConnection.list("*.obml", false);
            fileConnection.close();
            g.d.removeAllElements();
            while (enumeration.hasMoreElements()) {
                String string2 = (String)enumeration.nextElement();
                String string3 = string + "/" + string2;
                try {
                    fileConnection = (FileConnection)Connector.open((String)("file:///" + string3), (int)1);
                    dataInputStream = fileConnection.openDataInputStream();
                    g.Code((InputStream)dataInputStream, 14L);
                    string3 = dataInputStream.readUTF();
                    short s = dataInputStream.readShort();
                    byte[] byArray = new byte[s];
                    dataInputStream.readFully(byArray, 0, s);
                    g.d.addElement(new Object[]{string + "/" + string2, string3, byArray});
                }
                catch (Throwable throwable) {
                    g.Code((Connection)fileConnection);
                    g.Code(dataInputStream);
                    continue;
                }
                g.Code((Connection)fileConnection);
                g.Code((InputStream)dataInputStream);
            }
        }
        catch (Throwable throwable) {
            g.Code(fileConnection);
            return;
        }
        g.Code((Connection)fileConnection);
    }

    public final int Code(String string) {
        int n;
        FileConnection fileConnection = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)("file:///" + string), (int)1);
            n = (int)fileConnection.fileSize();
        }
        catch (Exception exception) {
            try {
                this.B();
                return -1;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
                g.Code(fileConnection);
            }
        }
        g.Code((Connection)fileConnection);
        return n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static HttpConnection Code(String var0, int var1_1) {
        var2_2 = null;
        var3_3 = null;
        try {
            if (g.Code()) {
                var0 /* !! */  = g.Code((String)var0 /* !! */ );
                var3_3 = var0 /* !! */ [0];
                var0 /* !! */  = var0 /* !! */ [1];
            }
            var2_2 = (HttpConnection)Connector.open((String)g.Code((String)var0 /* !! */ , false));
            if (var3_3 != null) {
                var2_2.setRequestProperty("X-Online-Host", var3_3);
            }
            if (var1_1 != 0) {
                var2_2.setRequestProperty("Range", "bytes=" + var1_1 + "-");
            }
            v0 = var2_2.getResponseCode();
            ** if (!(var1_1 == 0 ? v0 == 200 : v0 == 206)) goto lbl-1000
        }
        catch (Exception v1) {}
lbl15:
        // 1 sources

        return var2_2;
lbl-1000:
        // 1 sources

        {
        }
        g.Code(var2_2);
        return null;
    }

    static void Z(String string) {
        FileConnection fileConnection = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)string, (int)2);
            fileConnection.delete();
        }
        catch (Throwable throwable) {
            g.Code((Connection)fileConnection);
            return;
        }
        g.Code((Connection)fileConnection);
    }

    public final InputConnection Code(String string) {
        try {
            return (InputConnection)Connector.open((String)("file:///" + string), (int)1);
        }
        catch (Exception exception) {
            this.B();
            return null;
        }
    }

    public final void Code(String string, String string2, g g2) {
        if (Code == null) {
            return;
        }
        if (string2 == null) {
            string2 = (String)Code[0];
        }
        if (string2 == null || string2.length() == 0) {
            string2 = "unnamed";
        }
        C c = new C();
        new C().Code = 0;
        c.I = -1;
        if (Code[1] != null) {
            c.I = (Integer)Code[1];
        }
        c.J = (String)Code[3];
        c.B = string2;
        c.C = "file:///" + string;
        this.Code = g2;
        this.Code = c;
        this.Code.Code.e = true;
        g.Code(new f(44));
    }

    private void I(C c) {
        if (this.Code == c && this.Code != null) {
            if (!this.Code.J) {
                Code.Code.I(this.Code);
                this.Code.Code.Code = true;
                this.Code.Code.Code(true, false, null);
            }
            this.Code = null;
            this.Code = null;
        }
    }

    final void Code(boolean bl) {
        long l;
        FileConnection fileConnection = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)(this.Code.C + this.Code.B), (int)3);
            if (bl) {
                fileConnection.delete();
            }
            l = fileConnection.availableSize();
            bl = fileConnection.exists();
        }
        catch (Throwable throwable) {
            try {
                this.Z();
                this.B();
                return;
            }
            finally {
                g.Code(fileConnection);
            }
        }
        g.Code((Connection)fileConnection);
        if (bl) {
            Code.Code().Code("overlay:" + g.I(155), null, null);
            return;
        }
        if (l >= 0L && l < (long)this.Code.I) {
            StringBuffer stringBuffer = new StringBuffer("a=");
            g.Code(stringBuffer, (int)l, (int)l, true);
            stringBuffer.append("&r=");
            g.Code(stringBuffer, this.Code.I, this.Code.I, true);
            Code.Code().Code("overlay:" + g.I(153), null, stringBuffer.toString());
            return;
        }
        this.J();
    }

    final void Z() {
        if (this.Code != null) {
            this.Code.Code.e = false;
        }
        this.Code = null;
        this.Code = null;
    }

    final void J() {
        C.Code(this.Code, Code);
        this.I();
    }

    static void Code(C c, Object[] objectArray) {
        c.Code = 0;
        if (objectArray == null || objectArray[4] == null) {
            c.Code = new g(1, null);
            c.Code.Code(c);
            c.Code.Code(c.J, null, null);
            return;
        }
        C.I(c, objectArray);
    }

    static void I(C object, Object[] objectArray) {
        f f2 = new f(46);
        new f(46).Code = object;
        f2.Code = objectArray;
        object = new Thread(f2);
        ((Thread)object).setPriority(1);
        ((Thread)object).start();
    }

    static void Code(C c) {
        if (c.C == null) {
            return;
        }
        C c2 = c;
        synchronized (c2) {
            C.Z(c.C);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void Z(C c, Object[] object3) {
        Object object2;
        object2 = (String)object2[4];
        C c2 = c;
        synchronized (c2) {
            block23: {
                HttpConnection httpConnection;
                OutputStream outputStream;
                FileConnection fileConnection;
                InputStream inputStream;
                block21: {
                    block22: {
                        g.g = "-";
                        inputStream = null;
                        fileConnection = null;
                        outputStream = null;
                        httpConnection = null;
                        try {
                            if (!c.C.endsWith(c.B)) {
                                c.C = c.C + c.B;
                                fileConnection = (FileConnection)Connector.open((String)c.C, (int)3);
                                fileConnection.create();
                                Vector vector = g.B;
                                synchronized (vector) {
                                    if (g.aC) {
                                        g.C.addElement(c);
                                    }
                                    g.B.insertElementAt(c, 0);
                                    g.n();
                                }
                                this.I(c);
                            } else {
                                fileConnection = (FileConnection)Connector.open((String)c.C, (int)3);
                            }
                            if (!fileConnection.exists()) {
                                fileConnection.create();
                            }
                            c.Code = (int)fileConnection.fileSize();
                            outputStream = fileConnection.openOutputStream((long)c.Code);
                            boolean bl = false;
                            int n = -1;
                            g.g = "NB";
                            httpConnection = C.Code((String)object2, c.Code);
                            if (httpConnection == null) {
                                bl = true;
                            } else {
                                inputStream = httpConnection.openInputStream();
                                long l = httpConnection.getLength();
                                if (l != -1L) {
                                    n = c.Code + (int)l;
                                }
                            }
                            if (c.I == -1) {
                                c.I = n;
                            } else if (n != -1 && c.I != n) {
                                bl = true;
                            }
                            object2 = new byte[512];
                            while (!bl && !c.Code && (n = inputStream.read((byte[])object2)) != -1) {
                                g.B += (long)n;
                                g.C += (long)n;
                                c.Code += n;
                                outputStream.write((byte[])object2, 0, n);
                                Thread.yield();
                            }
                            if (bl) break block21;
                            if (!c.Code) break block22;
                        }
                        catch (Exception exception) {
                            g.Code(outputStream);
                            g.Code(fileConnection);
                            g.Code(inputStream);
                            g.Code(httpConnection);
                            this.I(c);
                            break block23;
                        }
                        catch (Throwable object3) {
                            g.Code(outputStream);
                            g.Code(fileConnection);
                            g.Code(inputStream);
                            g.Code(httpConnection);
                            this.I(c);
                            throw object3;
                        }
                        c.Code = (byte)3;
                        break block21;
                    }
                    if (c.Code >= c.I) {
                        c.Code = (byte)2;
                    }
                }
                g.Code(outputStream);
                g.Code((Connection)fileConnection);
                g.Code(inputStream);
                g.Code((Connection)httpConnection);
                this.I(c);
            }
            c.Code = false;
            if (c.Code == 0) {
                c.Code = 1;
            }
            if (g.C.contains(c) && !g.aC) {
                object2 = new f(45);
                new f(45).Code = c;
                Browser.Code.callSerially((Runnable)object2);
            }
            g.n();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    static int Code(B var0, String var1_3, int var2_4, String var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void B() {
        g g2 = Code.Code(8);
        if (g2 != null) {
            Code.Code.I(g2);
        }
        Code.Code(g.Code(152));
        Code = null;
        this.I();
    }
}
