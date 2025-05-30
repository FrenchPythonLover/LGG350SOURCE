/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.TimerTask;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class f
extends TimerTask
implements Runnable {
    private static boolean Z;
    public B Code;
    private int I;
    private static f Code;
    private static Object Code;
    static boolean Code;
    static boolean I;
    private static f Z;
    private static f I;
    String Code;
    InputStream Code;
    long Code;
    String I;
    String Z;
    String J;
    String B;
    String C;
    C Code;
    Object[] Code;
    g Code;
    int Code;
    private static boolean J;

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[CASE]], but top level block is 0[TRYBLOCK]
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

    f(int n) {
        this.I = n;
    }

    static synchronized void Code() {
        if (I == null) {
            I = new f(27);
            new Thread(I).start();
        }
        f f2 = I;
        synchronized (f2) {
            J = true;
            I.notify();
            return;
        }
    }

    static synchronized void Code(B b) {
        if (!g.j) {
            Runnable runnable;
            if (Code == null) {
                Code = new f(23);
                runnable = new Thread(Code);
                ((Thread)runnable).setPriority(1);
                ((Thread)runnable).start();
            }
            runnable = Code;
            synchronized (runnable) {
                f.Code.Code = b;
                Z = true;
                Code.notify();
                return;
            }
        }
    }

    static void I() {
        Code.Code = new f(32);
        new f(32).Code = System.currentTimeMillis() + 10000L;
        Code.Code.Code.schedule((TimerTask)Code.Code, 10000L, 2000L);
    }

    static void Z() {
        Code.Code = null;
    }

    static void J() {
        B b = Code.Code();
        if (Z != null) {
            if (f.Z.Code == b) {
                return;
            }
            Z.cancel();
            Z = null;
        }
        if (b != null && b.C != null) {
            Z = new f(34);
            new f(34).Code = b;
            Code.Code.Code.schedule((TimerTask)Z, b.k, 2000L);
        }
    }

    static {
        Code = new Object();
    }
}
