/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class B
implements Runnable {
    private int L;
    String Code;
    long Code;
    static Image[] Code;
    byte[] Code;
    static Vector Code;
    g Code;
    boolean Code;
    private boolean m;
    String J;
    private String c;
    String C;
    boolean I;
    boolean c = true;
    private boolean p;
    private boolean f;
    private boolean g;
    private String a;
    Hashtable Code;
    private int[] a;
    private static String e;
    private String b;
    String I;
    String Z;
    private int l;
    Image Code;
    boolean Z;
    private boolean h;
    boolean J;
    private Vector I;
    boolean B;
    boolean C;
    private boolean i;
    private boolean j;
    private boolean k;
    int Code;
    int I;
    int Z;
    int J;
    int B;
    private int m = -1;
    private int n;
    boolean a;
    int C;
    private Hashtable Z;
    private DataOutputStream Code;
    private e Code;
    private boolean l;
    public int a = 1;
    private String[] Code;
    private char Code;
    private boolean n;
    public boolean b;
    int[] Code;
    private Object[] Z;
    Object[] Code;
    private static final int aE;
    private static int o;
    private boolean o;
    private int p;
    private int q;
    private boolean s;
    private int r;
    private int s;
    private int N;
    private boolean t;
    private int t = false;
    private int u;
    private int[] I;
    private int[] Z;
    private int[] J;
    private int[] B;
    private int x;
    private int v;
    private int w;
    private int y;
    private int z;
    private int A;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int K;
    private int M;
    private int[] C = 0;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al = 0;
    private int am = 40;
    private int an = 25;
    byte[] I;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private Hashtable J;
    private Integer Code;
    private int at;
    private Vector J = -1;
    String B;
    int b = false;
    private int aO = -1;
    private boolean q;
    private boolean r;
    private int au;
    Hashtable I;
    private String d;
    boolean d;
    private String[] I;
    private J Code = new int[6];
    private J I;
    private DataOutputStream I;
    private int av;
    private int aw = 0;
    private int ax;
    private int ay;
    private int az;
    private int aA;
    private J Z;
    private DataOutputStream Z;
    private int aB = 0;
    private int aC = 0;
    private int aD;
    static Image[] I;
    private Vector Z = new Object[12];
    static int c;
    static Object[] I;
    static int d;
    int e;
    int f;
    int g;
    int h;
    private int aF;
    private int aG;
    int i;
    private static char[] Code;
    private static String[] Z;
    public static int j;
    private static String f;
    int k;
    private static boolean u;
    private Hashtable B = -1;
    private int aH;
    private int aI;
    private static int[] b;
    private static int[] c;
    private static int[] d;
    private static int aJ;
    private static int aK;
    private int aL;
    private int aM;
    private int aN;
    boolean e = false;
    private g I = new int[12];

    /*
     * Exception decompiling
     */
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 6 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public final void Code(Vector vector) {
        if (this.Code.get("a") != null) {
            B.I[1] = this.Code.get("a");
        }
        if (this.Code.get("b") != null) {
            B.I[0] = this.Code.get("b");
        }
        if (((String)I[1]).length() == 0) {
            B.I[1] = g.Code(72);
        }
        String string = g.I(this.Code(), "s");
        Object[] objectArray = d == -1 ? null : g.Code(vector, d);
        if (objectArray != null && objectArray[1].equals(I[1]) && objectArray[0].equals(I[0]) && (objectArray[2] == null && I[2] == null || objectArray[2] != null && objectArray[2].equals(I[2]) || I[2] != null && I[2].equals(objectArray[2])) && vector == g.d && string == null) {
            return;
        }
        if (vector == g.a) {
            Integer n;
            int n2;
            Object[] objectArray2;
            int n3 = g.Code(objectArray, 5);
            if (n3 == 97 || n3 == 83 && g.Code(objectArray)) {
                objectArray2 = I;
                n2 = 5;
                n = new Integer(97);
            } else {
                objectArray2 = I;
                n2 = 5;
                n = new Integer(65);
            }
            objectArray2[n2] = n;
            B.I[6] = new Integer(28);
        } else if (g.Code(I, 5) != 97 && vector != g.d) {
            B.I[5] = new Integer(77);
            B.I[6] = new Integer(31);
        }
        if (string != null && vector == g.d) {
            g.d.removeElementAt(d);
            g.d.insertElementAt(I, 0);
            g.Code(g.d, true);
            return;
        }
        if (d == -1) {
            g.Code(vector, I);
            return;
        }
        g.Code(vector, I, d);
    }

    final Image Code() {
        if ((this.Code == null || this.Code.getHeight() != Code.e) && this.Code != null) {
            Object[] objectArray = new Object[3];
            g.Code(this.Code, 0, this.Code.length, 256, objectArray);
            if (objectArray[0] != null) {
                if ((Integer)objectArray[2] != Code.e) {
                    objectArray[0] = g.Code((int[])objectArray[0], (int)((Integer)objectArray[1]), (int)((Integer)objectArray[2]), Code.e, true);
                    objectArray[1] = new Integer(Code.e);
                    objectArray[2] = new Integer(Code.e);
                }
                int n = (Code.d - Code.e) / 2;
                this.Code = g.Code(objectArray, Code.Code.I, -n);
            }
        }
        return this.Code;
    }

    private void Code(Vector vector, boolean bl) {
        this.d = bl;
        this.k = true;
        this.Code = 2;
        if (this.d) {
            this.I = g.Code(41);
            this.Code = 1;
            this.I = 10;
        } else if (vector == g.J) {
            this.I = g.Code(7);
            this.Code(null, g.I(91), g.Code(33), -10, false, false, true, -16777216);
            if (Code.Z) {
                this.Code(null, "myopera:///b", g.Code(179), -9, false, false, true, -16777216);
            }
            this.Code(null, "myopera:///n", g.Code(180), -12, false, false, true, -16777216);
            if (g.W) {
                this.Code(null, g.I(136), g.Code(146), -9, false, false, true, -16777216);
            }
            this.Code(null, "feed:start//" + System.currentTimeMillis(), g.Code(34), -7, false, false, false, -16777216);
        } else if (vector == g.a) {
            this.I = g.Code(33);
        } else if (vector == g.c) {
            this.I = g.Code(47);
        } else if (vector == g.d) {
            this.I = g.Code(146);
        }
        this.Code(vector, false, -1);
    }

    public final void Z() {
        Object object;
        int n;
        g.as = this.Code.containsKey("b");
        g.aq = this.Code.containsKey("d");
        g.av = this.Code.containsKey("e");
        g.aw = this.Code.containsKey("i");
        g.ar = this.Code.containsKey("a");
        if (this.Code.containsKey("c")) {
            g.i = Integer.parseInt((String)this.Code.get("c"));
        }
        if (this.Code.containsKey("g") && (n = Integer.parseInt((String)this.Code.get("g"))) != g.j) {
            g.j = n;
            g.s();
            Code.g();
            Code.Code.I();
            Code.Code.Z();
            this.Code.a = true;
        }
        Code.Code.Code(this.Code.containsKey("m"));
        if (this.Code.containsKey("l") ^ g.G) {
            Code.Code.b();
        }
        if ((object = this.Code.get("f")) != null) {
            g.Code(object.equals("http://"));
        }
        if (g.I.size() > 0 || g.b.size() > 0) {
            g.ax = this.Code.containsKey("z");
        }
        if ((object = (String)this.Code.get("k")) != null) {
            try {
                int n2 = Integer.parseInt(object);
                int n3 = g.Code(false, false).get(11);
                int n4 = g.Code(false, false).get(12);
                g.k = n2 / 2 - n3;
                if ((n2 & 1) == 0 && n4 < 30 || (n2 & 1) == 1 && n4 >= 30) {
                    g.l = 0;
                } else {
                    g.l = 30;
                    if (n4 >= 30) {
                        --g.k;
                    }
                }
            }
            catch (NumberFormatException numberFormatException) {}
        }
        if (this.q) {
            g.c = this.Code.containsKey("u") ^ 1;
            g.f();
        }
        int n5 = g.aC - this.Code.containsKey("A");
        if ((n5 | -n5) >>> 31 != 0) {
            if (!g.aC) {
                g.o = Math.max(1, g.o + 1 & 0xFF);
                this.Code.Code("overlay:" + g.I(156), null, null);
            } else {
                this.Code.J();
                g.o();
            }
            g.aC ^= true;
            Code.h();
            I = null;
            Code.Code.I();
            Code.Code.Z();
        }
        Code.Code.i();
        g.J(false);
    }

    final void Code(String object, boolean bl) {
        this.Code = bl;
        this.J = object;
        if (!this.Code()) {
            object = new Thread(this);
            ((Thread)object).setPriority(10);
            ((Thread)object).start();
            this.Code.d();
            while (this.C == 0) {
                Thread.yield();
            }
            return;
        }
        int n = g.Code(this.Code);
        B b = this;
        switch (n) {
            case 129: 
            case 130: 
            case 131: 
            case 132: {
                return;
            }
        }
        Object object2 = b;
        b.Z = true;
        ((B)object2).h = true;
        ((B)object2).J = true;
        ((B)object2).m = true;
        ((B)object2).ax = 3;
        ((B)object2).ay = 3;
        ((B)object2).p = 0;
        try {
            if (((B)object2).Code.Code(8)) {
                ((B)object2).ax += 5;
                ((B)object2).ay += 5;
                ((B)object2).aA += 2;
            }
            ((B)object2).Code = new J(2000);
            ((B)object2).Code = new DataOutputStream(((B)object2).Code);
            ((B)object2).I = new J(1000);
            ((B)object2).I = new DataOutputStream(((B)object2).I);
            ((B)object2).Z = new J(1000);
            ((B)object2).Z = new DataOutputStream(((B)object2).Z);
            ((B)object2).Code.write(0);
            ((B)object2).I.writeInt(-1);
            ((B)object2).I.writeInt(0);
            b.a(5);
            switch (n) {
                case 65: {
                    b.l();
                    break;
                }
                case 90: {
                    b.Code(g.J, false);
                    break;
                }
                case 91: {
                    b.Code(g.a, false);
                    break;
                }
                case 109: {
                    b.Code(g.c, false);
                    break;
                }
                case 54: {
                    n = b.Code.indexOf(38);
                    if (n >= 0) {
                        char c = b.Code.charAt(n + 3);
                        if (c == 'h') {
                            Code = Code.I;
                        } else if (c == 'b') {
                            Code = g.J;
                        }
                        b.Code = b.Code.substring(0, n);
                    }
                    b.Code(Code, true);
                    break;
                }
                case 86: {
                    B b2 = b;
                    b.Code = Code.I.size() > 0 ? 11 : 23;
                    b2.k = true;
                    b2.I = g.Code(16);
                    b2.C(false);
                    break;
                }
                case 148: {
                    b.n();
                    break;
                }
                case 74: {
                    b.q();
                    break;
                }
                case 88: 
                case 104: {
                    if (n == 104) {
                        g.C = 0L;
                        g.B = 0L;
                        g.J(false);
                    }
                    b.s();
                    break;
                }
                case 77: {
                    b.t();
                    break;
                }
                case 76: {
                    b.r();
                    break;
                }
                case 73: {
                    b.p();
                    break;
                }
                case 66: {
                    B b3 = b;
                    b3.x();
                    b3.B(80, 39);
                    b3.B(65, 46);
                    b3.B(90, 7);
                    if (g.W && ((object2 = g.Code("platform-handles-downloads")) == null || !((String)object2).toLowerCase().equals("true"))) {
                        b3.B(148, 209);
                    }
                    b3.Code(67, 36, true, false, false);
                    b3.B(79, 10);
                    b3.y();
                    break;
                }
                case 68: {
                    b.z();
                    break;
                }
                case 67: {
                    b.A();
                    break;
                }
                case 70: {
                    B b4 = b;
                    b.B = 28;
                    b4.Code = 9;
                    b4.I = 23;
                    object2 = g.I(b4.Z, "a");
                    String string = g.I(b4.Z, "b");
                    if (g.Code((String)object2)) {
                        b4.t = true;
                    }
                    b4.Code((String)object2, 0, Code.Code[44]);
                    b4.t = false;
                    b4.a(5);
                    if (string == null) break;
                    if (g.Code(string)) {
                        b4.t = true;
                    }
                    b4.Code(string, 0, Code.Code[44]);
                    b4.t = false;
                    break;
                }
                case 112: {
                    b.K();
                    break;
                }
                case 32: 
                case 33: {
                    b.B(n);
                    break;
                }
                case 99: {
                    b.I(g.J);
                    break;
                }
                case 149: {
                    n = b.Code.I().B();
                    C c = (C)g.B.elementAt(n);
                    b.I(g.Code(210), g.Code(211, c.B));
                    break;
                }
                case 155: {
                    b.I(g.Code(217), g.Code(218));
                    break;
                }
                case 153: {
                    String string = g.I(b.Z, "a");
                    object2 = g.I(b.Z, "r");
                    b.I(g.Code(215), g.Code(string, (String)object2));
                    break;
                }
                case 154: {
                    b.o();
                    break;
                }
                case 43: {
                    b.I(g.c);
                    break;
                }
                case 50: {
                    b.I(g.a);
                    break;
                }
                case 139: {
                    b.I(g.d);
                    break;
                }
                case 45: 
                case 52: 
                case 101: 
                case 141: {
                    Vector vector = g.I(n);
                    int n2 = (b.Code.I() != null ? b.Code.I() : b.Code).B();
                    if (!"keep".equals(b.J)) {
                        I = g.Code(g.Code(vector, n2));
                        d = n2;
                    }
                    b.Z(vector);
                    break;
                }
                case 89: 
                case 100: {
                    if (!"keep".equals(b.J)) {
                        I = g.Code();
                        if (g.Code != null) {
                            B.I[1] = g.Code[1];
                            B.I[0] = g.Code[0];
                            B.I[2] = g.Code[2];
                        }
                        d = -1;
                        Code = null;
                    }
                    b.Z(null);
                    break;
                }
                case 44: {
                    if (!"keep".equals(b.J)) {
                        I = g.Code();
                        d = -1;
                    }
                    b.Z(g.c);
                    break;
                }
                case 47: {
                    if (!"keep".equals(b.J)) {
                        I = g.Code();
                        d = -1;
                        B.I[1] = b.Code.Code.I;
                        B.I[0] = b.Code.Code.c;
                        B.I[2] = b.Code.Code.Code;
                    }
                    b.Z(g.c);
                    break;
                }
                case 126: {
                    b.L();
                    break;
                }
                case 123: {
                    b.D();
                    break;
                }
                case 124: {
                    b.E();
                    break;
                }
                case 37: {
                    b.F();
                    break;
                }
                case 40: {
                    b.G();
                    break;
                }
                case 34: {
                    B b5 = b;
                    b.I = 23;
                    b.Code = 23;
                    if (g.Code(g.Code(100))) {
                        b5.t = true;
                    }
                    b5.Code(g.Code(100), 0, Code.Code[44]);
                    b5.t = false;
                    break;
                }
                case 144: {
                    b.M();
                    break;
                }
                case 60: {
                    if (g.b && g.e != 1 && g.d != 1) {
                        b.J(0);
                        break;
                    }
                    b.H();
                    break;
                }
                case 143: {
                    b.J(1);
                    break;
                }
                case 156: {
                    b.J(2);
                    break;
                }
                case 36: {
                    b.u();
                    break;
                }
                case 62: {
                    b.v();
                    break;
                }
                case 46: {
                    b.w();
                    break;
                }
                case 128: {
                    B b6 = b;
                    b6.x();
                    b6.B(113, 160);
                    b6.B(129, 1);
                    b6.y();
                    break;
                }
                case 136: {
                    b.Code(g.d, false);
                    break;
                }
                case 135: {
                    I = g.Code();
                    d = -1;
                    B.I[1] = b.Code.Code.Code.I;
                    B.I[0] = b.Code.Code.Code.Code;
                    B.I[2] = b.Code.Code.Code.Code;
                    B.I[8] = b.Code.Code.Code;
                    b.Z(g.d);
                }
            }
            b.a(5);
            b.k();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    final void J() {
        Enumeration enumeration = this.I.elements();
        while (enumeration.hasMoreElements()) {
            this.Code.remove(enumeration.nextElement());
        }
        this.I.removeAllElements();
    }

    final synchronized String Code() {
        Object object;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.Code.Code(1)) {
            int n = this.U;
            object = this;
            int n2 = ((B)object).I(n, 5);
            stringBuffer.append("x=").append(String.valueOf(this.T)).append("&y=").append(String.valueOf(n + ((B)object).C[n2 * 6] - ((B)object).C[n2 * 6 + 5]));
        }
        Enumeration enumeration = this.Code.keys();
        while (enumeration.hasMoreElements()) {
            object = (String)enumeration.nextElement();
            if (((String)object).startsWith("o:")) continue;
            g.Code(stringBuffer.append("&"), (String)object);
            g.Code(stringBuffer.append("="), this.Code.get(object).toString());
        }
        return stringBuffer.toString();
    }

    static String Code(Hashtable object) {
        StringBuffer stringBuffer = new StringBuffer();
        object = ((Hashtable)object).elements();
        while (object.hasMoreElements()) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append("\u0000");
            }
            stringBuffer.append((String)object.nextElement());
        }
        return stringBuffer.toString();
    }

    static B Code(Object[] objectArray) {
        if (objectArray.length <= 8) {
            return null;
        }
        return (B)objectArray[8];
    }

    private void P() {
        this.Z.Code()[this.aB] = (byte)((this.Z.size() - this.aB) / 10);
        this.aB = 0;
    }

    final boolean Code() {
        return g.Code(this.Code) != -1;
    }

    private void c(int n, int n2) {
        int n3 = (int)System.currentTimeMillis();
        B.Code(this.I, this.J, n, n3);
        B.Code(this.Z, this.B, n2, n3);
    }

    private void N() {
        this.Code = 5;
        this.I = 6;
        this.B = 28;
        this.h = true;
        this.B = true;
    }

    B(g g2) {
        this.Z = new int[12];
        this.J = new int[10];
        this.B = new int[10];
        this.Z = new Hashtable();
        this.J = new Hashtable();
        this.Code = new Hashtable();
        this.I = new Vector();
        this.B = new Hashtable();
        this.Code = g2;
        this.x = this.w = 256;
        this.n = Code.f;
    }

    private void L() {
        this.N();
        this.I = g.Code(110);
        if (g.Code(g.Code(111))) {
            this.t = true;
        }
        this.Code(g.Code(111), 0, Code.Code[44]);
        this.t = false;
        this.a(5);
        if (g.Code(g.Code(112))) {
            this.t = true;
        }
        this.Code(g.Code(112), 0, Code.Code[44]);
        this.t = false;
    }

    final void Code(String string) {
        this.a = true;
        g.Code(new g(this, string));
    }

    final Object[] Code() {
        this.Code();
        return this.Z;
    }

    final void Code() {
        this.Code[0] = this.t;
        this.Code[1] = this.u;
        this.Code[2] = this.T;
        this.Code[3] = this.U;
        this.Code[4] = this.I() ? 1 : 0;
        this.Code[5] = this.p();
        this.Z[0] = this.Code;
        this.Z[1] = this.I;
        this.Z[2] = this.Code;
        this.Z[3] = this.Z;
        this.Z[4] = this.a;
        this.Z[7] = this.Code;
        if (this.Code() && (this.I[this.aj] == 76 || this.I[this.aj] == 42)) {
            int n = this.aj;
            int n2 = ++n;
            ++n;
            n = 10 * (this.I[n2] & 0xFF) + n;
            n += g.I(this.I, n);
            this.Z[9] = g.Code(this.I, n += 2);
        }
        if (!this.h) {
            this.Z[8] = this;
        }
        this.Z[10] = new Integer(this.l);
    }

    final Object[] I() {
        this.Z = new Object[12];
        this.Code = new int[6];
        this.Code();
        return this.Z;
    }

    final void I() {
        if (this.Code != null) {
            if (this.Code) {
                this.t = this.Code[0];
                this.u = this.Code[1];
                this.ak = this.Code[5];
            }
            this.b(this.Code[0], this.Code[1]);
            this.T = this.Code[2];
            this.U = this.Code[3];
        }
    }

    final void Code(Object[] objectArray) {
        this.Z = objectArray;
        this.Code = (String)objectArray[0];
        this.I = (String)objectArray[1];
        this.Code = (byte[])objectArray[2];
        this.Z = (String)objectArray[3];
        if (objectArray.length > 4) {
            this.a = (String)objectArray[4];
            this.Code = (int[])objectArray[7];
            if (this.Code != null) {
                if (this.Code || g.Code(this.Code) == 65) {
                    this.t = this.Code[0];
                    this.u = this.Code[1];
                    this.ak = this.Code[5];
                }
                this.b(this.Code[0], this.Code[1]);
                this.T = this.Code[2];
                this.U = this.Code[3];
            } else {
                this.Code = new int[6];
            }
            if (objectArray[10] != null) {
                this.l = (Integer)objectArray[10];
            }
        }
    }

    private void k() {
        int n;
        int n2;
        if (this.Code.Code(8)) {
            this.aA += 2;
        }
        B b = this;
        if (b.Z.size() != 0) {
            int n3;
            byte[] byArray = b.Z.Code();
            int n4 = n2 = b.Code.size();
            int n5 = 0;
            for (n = 0; n != b.Z.size(); n += n3 + 1) {
                if (b.aj <= 0 && b.ak == n5) {
                    b.aj = n2 + n;
                }
                ++n5;
                n4 = b.Code.size();
                b.Code.write(byArray[n++]);
                if (n == b.ah) {
                    b.aj = n4;
                }
                int n6 = n;
                n += g.I(byArray, n) + 2;
                n += g.I(byArray, n) + 2;
                int n7 = n - n6;
                n3 = byArray[n];
                b.Code.write(n3);
                b.Code.write(byArray, n + 1, n3 *= 10);
                b.Code.write(byArray, n6, n7);
            }
            b.ah = n2;
            b.ai = n4;
        }
        b.Z = null;
        b.Z = null;
        g.I(this.I.size() - 8, this.I.Code(), 4);
        int n8 = this.Code.size();
        this.aq += n8 + this.I.size() - 8;
        this.I = new byte[this.aq];
        System.arraycopy(this.Code.Code(), 0, this.I, 0, n8);
        this.ao = n8;
        int n9 = 0;
        do {
            n = g.Z(this.I.Code(), n9);
            n2 = g.Z(this.I.Code(), n9 + 4);
            System.arraycopy(this.I.Code(), n9 + 8, this.I, n8, n2);
            n8 += n2;
        } while ((n9 = n) >= 0);
        this.Code = null;
        this.Code = null;
        this.I = null;
        this.I = null;
        this.ap = this.aq;
        this.q = Math.max(this.q, this.aA);
        if (this.C()) {
            this.p = Math.min(this.p, this.Code.Z());
        }
        this.U();
        this.C[6] = this.ao;
        this.C[7] = this.aq;
        if (this.aj > 0) {
            this.C(this.aj);
            n8 = this.f - this.Code.I() / 2 + o;
            if (this.Code.Code(2)) {
                n8 = this.f == 4 ? 0 : this.f;
            }
            this.b(0, n8);
        }
        this.X();
        if (this.aj <= 0) {
            this.aj = this.ah;
        }
        this.b(4);
        this.b(5);
    }

    final void B() {
        this.b(7);
        this.R();
    }

    private void R() {
        g.Code(this.Code);
        this.Code = null;
    }

    private void G() {
        g.aH = true;
        this.I = 23;
        this.Code = 23;
        if (g.Code(g.Code(85))) {
            this.t = true;
        }
        this.Code(g.Code(85), 0, Code.Code[44]);
        this.t = false;
        this.a(5);
        if (g.Code(g.m ? g.Code(224) : g.Code(86))) {
            this.t = true;
        }
        this.Code(g.m ? g.Code(224) : g.Code(86), 0, Code.Code[44]);
        this.t = false;
    }

    private void O() {
        this.az = this.ax;
        this.aA += this.av + this.aw;
        this.av = 0;
    }

    private void x() {
        this.Code = 1;
        this.I = 10;
        this.k = true;
        this.ax = 6;
        this.az = 6;
        this.ay = 6;
        this.aA = 4;
        this.Z = new Vector();
    }

    private void l() {
        this.I = g.Code;
        this.aA = (g.m << 1) + 4;
        this.Code("o:a", "www.", Code.J, 49, Code.Code[54]);
        this.a((g.m << 1) + 4);
        this.az += 6;
        while (g.m >= g.c.size()) {
            --g.m;
        }
        if (g.m >= 0) {
            Object[] objectArray = g.Code(g.c, g.m);
            this.Code("http://m.yahoo.com/opera/search?p=", (String)objectArray[1], null, 129, Code.Code[54]);
        }
        this.a((g.m << 1) + 4);
        if (g.ax && g.I.size() > 0) {
            this.Code(g.I, true, -1);
        }
        if (!g.aD && !g.aE) {
            this.m();
        }
        this.Z(g.Code(7), g.I(90));
        this.aA -= 3;
        this.Code(g.a, true, -1);
        this.C(4);
        this.a(5);
        if (g.ax) {
            this.Code(g.b, true, -1);
        }
        this.Code(null, Code.Z ? "myopera:logout" : "myopera:login", Code.Z ? g.Code(177, Code.J) : g.Code(178), -11, false, false, false, -16777216);
        if (!g.aD && g.aE) {
            this.m();
        }
        if (Code.I.size() > 0) {
            this.Z(g.Code(16), g.I(86));
            this.aA -= 3;
            this.C(true);
        }
        if (g.W && !g.d.isEmpty()) {
            this.Z(g.Code(146), g.I(136));
            this.aA -= 3;
            this.Code(g.d, true, 3);
        }
    }

    private void p() {
        String string;
        String string2;
        this.Code = 7;
        this.B = 23;
        this.I = 10;
        this.B = true;
        this.I = g.Code(9);
        this.aA -= 5;
        this.Z(g.Code(102), null);
        this.aA -= 3;
        this.Code(0, g.Code(13), "a", g.ar ? "" : null, -1);
        int n = this.k();
        this.C("0", g.Code(115));
        this.C("1", g.Code(116));
        this.C("2", g.Code(117));
        this.Q();
        this.Code(2, g.Code(114) + ":", "c", String.valueOf(g.i), n);
        n = this.k();
        if (!g.k) {
            this.C("3", g.Code(73));
        }
        this.C("0", g.Code(74));
        this.C("1", g.Code(75));
        this.C("2", g.Code(76));
        this.Q();
        this.Code(2, g.Code(79) + ":", "g", String.valueOf(g.j), n);
        this.Code(0, g.Code(89), "b", g.as ? "" : null, -1);
        if (g.p != -1) {
            this.Code(0, g.Code(222), "A", g.aC ? "" : null, -1);
        }
        this.Z(g.Code(78), null);
        this.aA -= 3;
        this.Code(1, g.Code(138) + "...", "sk:///l/" + g.k + "?version=" + 3, null, -1);
        this.Code(0, g.Code(77), "d", g.aq ? "" : null, -1);
        if (!(g.ah || (string2 = g.Code("com.lge.disable-landscape")) != null && string2.toLowerCase().equals("true"))) {
            this.Code(0, g.Code(175), "m", g.K ? "" : null, -1);
        }
        if (!g.m) {
            this.Code(0, g.Code(107), "l", g.G ? "" : null, -1);
        }
        this.Code(0, g.Code(118), "i", g.aw ? "" : null, -1);
        if (g.b != 0 && !g.ao) {
            this.Code(0, g.Code(161), "u", g.c == 0 ? "" : null, -1);
        }
        if (g.I.size() > 0 || g.b.size() > 0) {
            this.Code(0, g.Code(207), "z", g.ax ? "" : null, -1);
        }
        if (!g.ad) {
            this.Code(0, g.Code(25), "e", g.av ? "" : null, -1);
            int n2 = this.k();
            string = Code.Code(-1, true, null);
            int n3 = g.Code(false, false).get(12);
            Calendar calendar = g.Code(false, false);
            Calendar calendar2 = g.Code(true, false);
            int n4 = 0;
            for (int i = 0; i < 48; i += 2) {
                String string3 = Code.Code(i / 2, false, n3 >= 30 ? calendar2 : calendar);
                this.C(String.valueOf(i), string3);
                if (string3.equals(string)) {
                    n4 = i;
                }
                string3 = Code.Code(i / 2, false, n3 >= 30 ? calendar : calendar2);
                this.C(String.valueOf(i + 1), string3);
                if (!string3.equals(string)) continue;
                n4 = i + 1;
            }
            this.Q();
            this.Code(2, g.Code(64), "k", String.valueOf(n4), n2);
        }
        this.Z(g.Code(48), null);
        this.aA -= 3;
        int n5 = this.k();
        if (!g.ab) {
            this.C("socket://", "Socket/HTTP");
        }
        this.C("http://", "HTTP");
        this.Q();
        string = g.ac ? "http://" : "socket://";
        this.Code(2, g.Code(50) + ":", "f", string, n5);
        this.Code(1, g.Code(205) + "...", g.I(142), null, -1);
        this.Code(1, g.Code(97) + "...", "dialog:" + g.I(33), null, -1);
        this.aA -= 5;
    }

    private void m() {
        if (g.aD || g.Z.size() == 0) {
            return;
        }
        int n = 0;
        while (n < g.Z.size()) {
            Object[] objectArray = g.Code(n);
            Object[] objectArray2 = (Object[])g.Z.elementAt(n);
            if (((Integer)objectArray2[objectArray2.length - 2] & 1) != 0) {
                String string = (String)objectArray[0];
                this.Z((String)objectArray[1], "".equals(string) ? null : "scl:" + string);
                this.aA -= 3;
                ++n;
                continue;
            }
            this.Code("scl:" + (String)objectArray[0], (String)objectArray[1], -11000 - n, -12000 - n, false, false, false, -16777216);
            ++n;
        }
    }

    private void Code(String string, String string2) {
        int n;
        int n2 = 0;
        while (true) {
            if ((n = g.Code(0, string2) + (string != null && g.Code(string, "menu:") ? (g.J(0) + 4) / 3 + 2 : 0) + this.az + this.ay) <= this.Code.Z()) break;
            string2 = string2.substring(0, string2.length() - (n2 * 3 + 1)) + "...";
            n2 = 1;
        }
        this.p = Math.max(this.p, n);
        this.Z.addElement(string);
        this.Z.addElement(string2);
    }

    private void I(String string, String string2) {
        this.N();
        this.I = string;
        this.Code(0, this.aA, this.j() + this.ax + this.ay, 1, 0);
        if (g.Code(string)) {
            this.t = true;
        }
        this.Code(string, 1, Code.Code[44]);
        this.t = false;
        this.a(5);
        this.Code(this.ax, this.aA++, this.j(), 1, Code.Code[45]);
        this.a(5);
        if (g.Code(string2)) {
            this.t = true;
        }
        this.Code(string2, 0, Code.Code[44]);
        this.t = false;
    }

    private void B(int n) {
        this.N();
        this.I = "";
        String string = "";
        switch (n) {
            case 32: {
                this.I = g.Code(96);
                string = g.Code(98);
                break;
            }
            case 33: {
                this.I = g.Code(97);
                string = g.Code(99);
            }
        }
        if (g.Code(string)) {
            this.t = true;
        }
        this.Code(string, 0, -16777216);
        this.t = false;
    }

    private void C(int n, int n2) {
        if (this.Code(n)) {
            this.O();
        }
        this.p = Math.max(this.p, this.az + n + this.ay);
        this.av = Math.max(this.av, n2);
        this.Code(this.az, this.aA, n, n2);
    }

    private void Code(int n, String string, String string2, String string3, int n2) {
        int n3 = this.aA;
        this.a(c / 2);
        int n4 = this.ay;
        int n5 = this.ax;
        if (g.B()) {
            B b;
            int n6 = -1;
            if (n == 0) {
                this.az = 30;
                this.ax = 30;
                b = this;
            } else {
                this.az = 12;
                this.ax = 12;
                b = this;
            }
            b.ay = 12;
            this.t = true;
            int n7 = this.Code(string, 0, -16777216);
            this.t = false;
            this.ay = n4;
            if (n == 0) {
                n = g.J(0) + this.aA - n3 - c / 2;
                this.az = 12;
                this.aA = n3 + c / 2;
                n6 = this.Code(string2, "", string3 != null ? 2 : 0, n);
                this.av = n;
            } else if (n == 2) {
                this.az = 12;
                this.t = true;
                n6 = this.Code(string2, string3, 32, n2, n7);
                this.t = false;
            }
            this.ax = n5;
            this.a(c / 2 + 1);
            if (n6 >= 0) {
                this.I("", n6);
            } else {
                this.Code((byte)76, "", string2, false);
            }
            this.Code(0, n3, this.p, this.aA - n3 - 1);
            this.P();
            this.Code(0, this.aA - 1, this.p, 1, Code.Code[15]);
            return;
        }
        this.az = 12;
        this.ax = 12;
        int n8 = -1;
        this.ay = n == 0 ? 30 : 12;
        this.Code(string, 0, -16777216);
        this.ay = n4;
        if (n == 0) {
            n = g.J(0) + this.aA - n3 - c / 2;
            this.az = this.Code.Z() - 12 - 12;
            this.aA = n3 + c / 2;
            n8 = this.Code(string2, "", string3 != null ? 2 : 0, n);
            this.av = n;
        } else if (n == 2) {
            this.az += 4;
            n8 = this.Code(string2, string3, 64, n2, 0);
        }
        this.ax = n5;
        this.a(c / 2 + 1);
        if (n8 >= 0) {
            this.I("", n8);
        } else {
            this.Code((byte)76, "", string2, false);
        }
        this.Code(0, n3, this.p, this.aA - n3 - 1);
        this.P();
        this.Code(0, this.aA - 1, this.p, 1, Code.Code[15]);
    }

    private void n() {
        int n;
        this.aA -= 5;
        this.I(false);
        this.Code = 2;
        this.I = g.Code(209);
        int n2 = 0;
        while (n2 < g.B.size()) {
            int n3;
            C c = (C)g.B.elementAt(n2);
            String string = c.B;
            String string2 = "download:" + n2 + ":";
            StringBuffer stringBuffer = new StringBuffer(" ");
            if (c.Code != c.I) {
                stringBuffer.append("000/");
            }
            n = c.I != -1 ? c.I : 500;
            g.Code(stringBuffer, n, n, true);
            n = g.Code(0, stringBuffer.toString());
            int n4 = this.aA;
            if (g.B()) {
                n3 = this.ay;
                int n5 = this.ax + this.j() + this.ay - 6 - 23;
                int n6 = n5 - 6;
                this.aA += 7;
                this.az = n5;
                this.I(-10000 - n2, this.az, this.aA, 23, 23);
                this.az = 6;
                this.t = true;
                this.ay = 35;
                this.Code(g.Code(0, string, n6 - 6 - n, null), 0, -16777216);
                this.ay = n3;
                this.t = false;
                this.az = 6;
                stringBuffer.insert(0, (char)(32 + (char)(n2 + 10000)));
                stringBuffer.insert(0, '\u0000');
                this.Code(stringBuffer.toString(), 0, -16777216, this.az, this.aA);
                this.O();
                this.az = 6;
                this.Code(new String(new char[]{'\u0000', (char)(32 + (char)(n2 + 20000))}), 0, -16777216, this.az, this.aA);
                n = this.aA + g.J(0);
                this.aA += 6;
                this.C(n6 - 6, 5);
                this.I(-9000 - n2, this.az, this.aA, n6 - 6, 5);
                this.aA += 12;
                this.aA = Math.max(Math.max(this.aA, n4 + 23 + 12), n);
                this.Code(0, this.aA, this.j() + this.ax + this.ay, 1, Code.Code[15]);
                ++this.aA;
                this.Code((byte)42, string, string2, false, 0, n4, this.j() + this.ax + this.ay, this.aA - n4 - 1);
                ++n2;
                continue;
            }
            n3 = this.ax + this.j() - 6;
            this.aA += 7;
            this.az = 6;
            this.I(-10000 - n2, this.az, this.aA, 23, 23);
            this.az = 35;
            this.Code(g.Code(0, string, n3 - 35 - n, null), 0, -16777216);
            this.az = n3 - n;
            stringBuffer.insert(0, (char)(32 + (char)(n2 + 10000)));
            stringBuffer.insert(0, '\u0000');
            this.Code(stringBuffer.toString(), 0, -16777216, this.az, this.aA);
            this.O();
            this.az = 35;
            this.Code(new String(new char[]{'\u0000', (char)(32 + (char)(n2 + 20000))}), 0, -16777216, this.az, this.aA);
            n = this.aA + g.J(0);
            this.aA += 6;
            this.C(n3 - 35, 5);
            this.I(-9000 - n2, this.az, this.aA, n3 - 35, 5);
            this.aA += 12;
            this.aA = Math.max(Math.max(this.aA, n4 + 35), n);
            this.Code(0, this.aA, this.j() + this.ax + this.ay, 1, Code.Code[15]);
            ++this.aA;
            this.Code((byte)42, string, string2, false, 0, n4, this.j() + this.ax + this.ay, this.aA - n4 - 1);
            ++n2;
        }
        Object object = new f(42);
        new f(42).Code = this;
        Code.Code.Code.schedule((TimerTask)object, 1000L, 1000L);
        if (C.Code != null) {
            object = new StringBuffer("u=");
            g.Code((StringBuffer)object, (String)C.Code[0]);
            ((StringBuffer)object).append("&r=");
            if (C.Code[1] != null) {
                n = (Integer)C.Code[1];
                g.Code((StringBuffer)object, n, n, true);
            }
            f f2 = new f(38);
            new f(38).Code = this.Code;
            f2.Z = ((StringBuffer)object).toString();
            f2.B = this.Code;
            f2.J = "overlay:" + g.I(154);
            g.Code(f2);
        }
    }

    private void B(int n, int n2) {
        this.Code(g.I(n), n2);
    }

    private void Code(int n, String string) {
        if (g.Code(g.Code(n))) {
            this.t = true;
            this.Code(g.Code(n) + ": " + string, 0, -16777216);
            this.t = false;
        } else {
            this.Code(g.Code(n) + ": ", 1, -16777216);
            this.Code(string, 0, -16777216);
        }
        this.O();
    }

    private void a(int n) {
        this.O();
        this.aA += n;
    }

    private void Q() {
        byte[] byArray = this.Code.Code();
        g.Z(this.aD, byArray, this.au);
    }

    private void o() {
        this.aA -= 5;
        int n = g.J(0) + c;
        this.Code(0, this.aA, this.j() + this.ax + this.ay, 1, 0);
        String string = g.I(this.Z, "u");
        String string2 = g.I(this.Z, "r");
        int n2 = g.Code(1, string2);
        this.I = g.Code(219);
        this.Code = 7;
        this.I = 10;
        if (g.B()) {
            n2 = g.Code(1, this.I);
            int n3 = g.Code(1, g.Code(220));
            int n4 = g.Code(1, g.Code(221));
            this.Code(string2, 1, Code.Code[44], this.az, this.aA + c / 2);
            this.Code(this.I, 1, Code.Code[44], this.az + this.j() - n2, this.aA + c / 2);
            this.aA += n;
            this.Code(this.ax, this.aA++, this.j(), 1, Code.Code[45]);
            this.Code(g.Code(220), 1, Code.Code[44], this.az + this.j() - n3, this.aA + c / 2);
            this.aA += n;
            this.Code.put("a", string);
            this.Code("a", string, null, 0, Code.Code[44]);
            this.O();
            this.Code(g.Code(221), 1, Code.Code[44], this.az + this.j() - n4, this.aA + c / 2);
            this.aA += n;
            String string3 = C.Code(false);
            this.d = C.Code(true);
            if (string3 == null) {
                Code.Code.Code();
                string3 = C.I;
                this.d = C.Z;
            }
            this.Code("b", string3, Code.Code[44], this.j());
            return;
        }
        this.Code(this.I, 1, Code.Code[44], this.az, this.aA + c / 2);
        this.Code(string2, 1, Code.Code[44], this.az + this.j() - n2, this.aA + c / 2);
        this.aA += n;
        this.Code(this.ax, this.aA++, this.j(), 1, Code.Code[45]);
        this.Code(g.Code(220), 1, Code.Code[44], this.az, this.aA + c / 2);
        this.aA += n;
        this.Code.put("a", string);
        this.Code("a", string, null, 0, Code.Code[44]);
        this.O();
        this.Code(g.Code(221), 1, Code.Code[44], this.az, this.aA + c / 2);
        this.aA += n;
        String string4 = C.Code(false);
        this.d = C.Code(true);
        if (string4 == null) {
            Code.Code.Code();
            string4 = C.I;
            this.d = C.Z;
        }
        this.Code("b", string4, Code.Code[44], this.j());
    }

    private void Code(String string, int n) {
        this.Code(string, g.Code(n));
    }

    private void q() {
        this.Code = 23;
        this.k = true;
        this.I = g.Code(35);
        if (g.an) {
            this.J(g.I(76), g.Code(29));
            this.O();
        }
        if (g.a != null && g.a.length() > 0) {
            this.J(g.a, g.Code(18));
            this.O();
        }
        if (g.d != null && g.d.length() > 0) {
            String string = "";
            Object[] objectArray = g.Code;
            if (g.Code != null && objectArray[0] != null && ((String)objectArray[0]).startsWith("http")) {
                string = (String)objectArray[0];
            }
            long l = g.Z - g.J;
            StringBuffer stringBuffer = new StringBuffer(g.d);
            stringBuffer.append("?w=").append(Code.h).append("&h=").append(Code.i).append("&m=").append(l).append("&ma=").append(g.B).append("&pl=").append(g.Code(g.Code("microedition.platform"), true)).append("&url=").append(g.Code(string, true)).append("&mo=").append(g.Code("device.model: " + g.Code("device.model"), true));
            this.J(stringBuffer.toString(), g.Code(61));
            this.O();
        }
        this.J(g.I(88), g.Code(2));
    }

    private void r() {
        this.Code = 23;
        int n = -16777216;
        if (this.Code.Code(8)) {
            this.I = 10;
            n = Code.Code[44];
            this.az = this.ax;
        }
        this.I = g.Code(29);
        this.aw = 1;
        String string = g.I(this.Z, "a");
        if (string == null) {
            string = "#*";
        }
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            for (int j = 0; j < 12; ++j) {
                int n2;
                int n3 = n2 = "1234567890#*".charAt(j);
                n2 = n;
                int n4 = n3;
                char c2 = c;
                B b = this;
                String string2 = g.Code((int)c2, n4, true);
                if (string2 == null) continue;
                int n5 = g.J(1);
                int n6 = g.Code(1, String.valueOf(c2));
                int n7 = g.Code(1, String.valueOf((char)n4));
                int n8 = n5 + 2;
                if (g.B()) {
                    b.az += b.j() - n8;
                    b.Code(b.az, b.aA, n8, n8, Code.Code[26]);
                    b.az += n8;
                    b.Code(String.valueOf(c2), 1, Code.Code[28], b.az - n8 / 2 - n6 / 2, b.aA + n8 / 2 - n5 / 2 - 1);
                    b.az -= (n8 << 1) + 1;
                    b.Code(b.az, b.aA, n8, n8, Code.Code[26]);
                    b.az += n8;
                    b.Code(String.valueOf((char)n4), 1, Code.Code[28], b.az - n8 / 2 - n7 / 2, b.aA + n8 / 2 - n5 / 2 - 1);
                    b.az = b.ax;
                    n4 = b.ay;
                    b.ay = n4 + (n8 << 1) + 3;
                    b.t = true;
                    b.Code(string2, 0, n2);
                    b.t = false;
                    b.ay = n4;
                } else {
                    b.Code(b.az, b.aA, n8, n8, Code.Code[26]);
                    b.az += n8;
                    b.Code(String.valueOf(c2), 1, Code.Code[28], b.az - n8 / 2 - n6 / 2, b.aA + n8 / 2 - n5 / 2 - 1);
                    ++b.az;
                    b.Code(b.az, b.aA, n8, n8, Code.Code[26]);
                    b.az += n8;
                    b.Code(String.valueOf((char)n4), 1, Code.Code[28], b.az - n8 / 2 - n7 / 2, b.aA + n8 / 2 - n5 / 2 - 1);
                    b.az += 2;
                    n4 = b.ax;
                    b.ax = b.az;
                    b.Code(string2, 0, n2);
                    b.ax = n4;
                }
                b.a(2);
            }
        }
    }

    private void t() {
        this.Code = 23;
        this.I = g.Code(45);
        B b = this.Code.Code;
        String string = b.Code;
        if (!string.startsWith("<imgs>") && g.Code(string) == -1) {
            this.Code.Z = b;
        }
        b = this.Code.Z;
        this.Z(g.Code(81), null);
        if (g.B()) {
            this.t = true;
        }
        this.B("<imgs>" + b.Code, g.Code(80));
        this.t = false;
        this.a(5);
        this.Z(g.Code(56), null);
        this.Code(65, b.I);
        this.Code(63, b.Code);
        this.Code(58, g.Code((long)b.as));
        if (g.Code(g.Code(57))) {
            this.t = true;
            if (b.Code != null) {
                int n = this.Code(b.Code);
                this.ap = this.Code.size();
                this.I = this.Code.Code();
                int n2 = this.Code(n, 0, 0).getWidth();
                this.Code(g.Code(57) + ": ", 0, -16777216);
                this.az = this.ax;
                this.az += this.j() - n2 - g.Code(0, g.Code(57) + ": ");
                this.Code(n, false, 1);
            } else {
                this.Code(g.Code(57) + ": " + g.Code(131), 0, -16777216);
            }
            this.t = false;
        } else {
            this.Code(g.Code(57) + ": ", 1, -16777216);
            if (b.Code != null) {
                this.Code(this.Code(b.Code), false, 1);
            } else {
                this.Code(g.Code(131), 0, -16777216);
            }
        }
        this.a(5);
        this.Z(g.Code(59), null);
        if (b.a < 2) {
            this.Code(60, g.Code(12));
            return;
        }
        this.Code(60, g.Code(11));
        if (b.Code != null) {
            if (b.Code[4].length() > 0) {
                if (g.Code(g.Code(94))) {
                    this.t = true;
                }
                this.Code(g.Code(94) + ": " + b.Code[4], 0, -16777216);
                this.t = false;
                this.O();
            }
            if (g.Code(g.Code(119))) {
                this.t = true;
            }
            this.Code(g.Code(119) + " " + b.Code[0], 0, -16777216);
            this.t = false;
            this.O();
            if (g.Code(g.Code(120))) {
                this.t = true;
            }
            this.Code(g.Code(120) + " " + b.Code[6], 0, -16777216);
            this.t = false;
            this.O();
            if (g.Code(g.Code(121))) {
                this.t = true;
            }
            this.Code(g.Code(121) + " " + b.Code[2], 0, -16777216);
            this.t = false;
            this.O();
            if (g.Code(g.Code(122))) {
                this.t = true;
            }
            this.Code(g.Code(122) + " " + b.Code[3], 0, -16777216);
            this.t = false;
            this.O();
            this.O();
        }
    }

    private void J(int n) {
        this.Code = 9;
        this.I = 37;
        Code.C = g.b;
        this.B = 23;
        this.I = "";
        int n2 = Code.Code[44];
        String string = "";
        if (n == 0) {
            string = g.Code(168);
            if (Browser.Code.getAppProperty("MIDlet-Jar-RSA-SHA1") != null) {
                string = g.Code(169);
            }
        } else if (n == 1) {
            this.I = g.Code(37);
            string = g.Code(153) + " " + g.Code(154);
        } else if (n == 2) {
            string = g.Code(223);
            Code.C = g.c;
        }
        if (this.I.length() > 0) {
            if (g.B()) {
                this.t = true;
            }
            this.Code(this.I, 0, n2);
            this.t = false;
            this.a(5);
        }
        if (g.Code(string)) {
            this.t = true;
        }
        this.Code(string + " " + g.Code(170, g.Code(35)), 0, n2);
        this.t = false;
    }

    private void s() {
        this.Code = 23;
        this.I = g.Code(2);
        int n = this.Code(g.Code(69));
        this.Code(n, true, -1);
        this.a(5);
        this.Code(Code.Code, 0, -16777216);
        this.O();
        this.a(5);
        this.Code("Copyright (c) 2005-2015 ", 0, -16777216);
        this.B("http://www.opera.com/", "Opera Software ASA");
        this.Code(". ", 0, -16777216);
        this.Code("All rights reserved.", 0, -16777216);
        this.O();
        this.a(5);
        if (g.B()) {
            String string;
            B b;
            String string2;
            B b2;
            this.t = true;
            this.B("opera:about", g.Code(82));
            this.t = false;
            this.a(5);
            if (g.Code(g.Code(67))) {
                this.t = true;
                b2 = this;
                string2 = g.Code(67) + " " + g.Code(g.B);
            } else {
                this.Code(g.Code(67) + " ", 0, -16777216);
                b2 = this;
                string2 = g.Code(g.B);
            }
            b2.Code(string2, 0, -16777216);
            this.t = false;
            this.O();
            if (g.Code(g.Code(68))) {
                this.t = true;
                b = this;
                string = g.Code(68) + " " + g.Code(g.C);
            } else {
                this.Code(g.Code(68) + " ", 0, -16777216);
                b = this;
                string = g.Code(g.C);
            }
            b.Code(string, 0, -16777216);
            this.t = false;
            this.O();
            if (g.Code(g.Code(19))) {
                this.t = true;
            }
            this.B(g.I(104), "[" + g.Code(19) + "]");
            this.t = false;
            this.O();
            return;
        }
        this.B("opera:about", g.Code(82));
        this.a(5);
        this.Code(g.Code(67) + " ", 1, -16777216);
        this.Code(g.Code(g.B), 0, -16777216);
        this.O();
        this.Code(g.Code(68) + " ", 1, -16777216);
        this.Code(g.Code(g.C), 0, -16777216);
        this.O();
        this.B(g.I(104), "[" + g.Code(19) + "]");
        this.O();
    }

    private void u() {
        if (!g.az) {
            this.Code = 23;
            this.I = 14;
        }
        this.B = true;
        this.J = true;
        this.I = g.Code(37);
        if (g.Code(g.Code(83))) {
            this.t = true;
        }
        this.Code(g.Code(83), 1, -16777216);
        this.t = false;
        this.a(5);
        String string = g.I(this.Z, "b");
        if (string == null) {
            string = g.Code(84, g.a);
        }
        if (g.Code(string)) {
            this.t = true;
        }
        this.Code(string, 0, -16777216);
        this.t = false;
        if (g.az && !g.Code(87).equals(string)) {
            this.O();
            this.a(5);
            if (g.Code(g.Code(205))) {
                this.t = true;
            }
            this.B(g.I(142), g.Code(205));
            this.t = false;
        }
        if ((string = f).length() > 0 && g.az) {
            this.O();
            this.a(5);
            if (g.Code(g.Code(137))) {
                this.t = true;
            }
            this.B(string, g.Code(137));
            this.t = false;
        }
    }

    private void M() {
        this.N();
        this.I = g.Code(139);
        if (g.Code(g.Code(140))) {
            this.t = true;
        }
        this.Code(g.Code(140) + " " + g.Code(136), 0, Code.Code[44]);
        this.t = false;
    }

    private void w() {
        this.J = true;
        this.B = true;
        this.N();
        if (g.Code(g.Code(144))) {
            this.t = true;
        }
        this.Code(g.Code(144) + " " + g.Code(143), 0, Code.Code[44]);
        this.t = false;
    }

    private void v() {
        this.J = true;
        this.B = true;
        this.I = g.Code(189);
        if (g.Code(g.Code(189))) {
            this.t = true;
        }
        this.Code(g.Code(189), 0, -16777216);
        this.t = false;
        if (g.f != null) {
            this.a(5);
            this.Code((byte)87, g.f, g.f, false);
            this.Code(g.f, 0, Code.Code[53]);
            this.P();
        }
    }

    private void B(String string, String string2) {
        String string3 = string;
        string = string2;
        string2 = string3;
        B b = this;
        b.Code((byte)76, string, string2, false);
        b.Code(string, 0, Code.Code[53]);
        b.P();
    }

    private void Code(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        String string = null;
        if (!bl3) {
            string = g.I(n);
            if (bl) {
                string = "menu:" + string;
            }
            if (bl2) {
                string = "dialog:" + string;
            }
        }
        this.Code(string, n2);
    }

    private void A() {
        this.x();
        g g2 = this.Code;
        while (g2.Code(2)) {
            g2 = g2.I();
        }
        B b = g2.Code;
        if (g2.I(1)) {
            this.B(82, 32);
        }
        if (b != null && !b.Code()) {
            if (!b.i) {
                this.B(77, 45);
            }
            if (!b.j) {
                this.Code(89, 8, false, true, false);
            }
            if (b.b) {
                this.B(63, 208);
            }
            this.B(83, 5);
            this.B(127, 141);
            if (g.W && !b.a) {
                this.B(134, 145);
            }
        }
        this.B(86, 16);
        this.B(73, 9);
        this.B(74, 35);
        this.y();
    }

    private void y() {
        String string;
        int n;
        int n2 = g.J(0) + c;
        for (n = 0; n < this.Z.size(); n += 2) {
            string = (String)this.Z.elementAt(n);
            if (string == null || !g.Code(string, "menu:")) continue;
            this.p = Math.min(this.Code.Z(), this.p + n2 / 3);
            break;
        }
        n = 0;
        while (n < this.Z.size()) {
            int n3;
            string = (String)this.Z.elementAt(n++);
            String string2 = (String)this.Z.elementAt(n++);
            if (string == null) {
                if (g.B()) {
                    int n4 = g.Code(0, string2);
                    n3 = this.p;
                    this.Code(string2, 0, Code.Code[35], this.p - n4 - this.ay, this.aA + c / 2);
                    this.p = n3;
                } else {
                    this.Code(string2, 0, Code.Code[35], this.az, this.aA + c / 2);
                }
            } else {
                if (g.B()) {
                    n3 = g.Code(0, string2);
                    int n5 = this.p;
                    this.Code(string2, 0, Code.Code[34], this.p - n3 - this.ay, this.aA + c / 2);
                    this.p = n5;
                } else {
                    this.Code(string2, 0, Code.Code[34], this.az, this.aA + c / 2);
                }
                if (g.Code(string, "menu:")) {
                    if (g.B()) {
                        this.I(this.az + this.ay + n2 / 3 - 1, n2, Code.Code[34]);
                    } else {
                        this.I(this.p, n2, Code.Code[34]);
                    }
                }
                this.Code((byte)76, "", string, false);
                this.Code(0, this.aA, this.p, n2);
                this.P();
            }
            this.aA += n2;
        }
        this.Z = null;
        this.aA += -1;
    }

    private void D() {
        this.x();
        B b = this.Code.I().Code;
        String string = b.Z();
        int n = this.Code.I().B();
        if (g.Code(string, "bookmark:")) {
            this.Code(101, 15, false, true, false);
            this.Code(99, 14, false, true, false);
            int n2 = g.v;
            if (n > n2) {
                this.Code(97, 30, false, false, false);
            }
            if (n >= n2 && n != g.J.size() - 1) {
                this.Code(98, 31, false, false, false);
            }
        } else if (g.Code(string, "speeddial:")) {
            boolean bl = n < 0 || g.Code(g.Code(g.a, n));
            this.Code(52, 15, false, true, false);
            this.Code(50, 19, false, true, bl);
        } else if (g.Code(string, "search:")) {
            this.Code(45, 15, false, true, n <= 0);
            this.Code(43, 14, false, true, n <= 0);
        } else {
            int n3;
            this.aA += c / 2;
            this.Code("fittoscreen", "on", b.g << 1, g.J(0));
            this.az += this.ax;
            this.aA -= c / 2;
            this.Code((g.as == b.g ? "tssr:" : "") + g.I(83), g.Code(89));
            if (!b.f) {
                this.Code((g.ar ? "" : "timg:") + g.I(83), g.Code(13));
            }
            this.B(83, 5);
            if (!b.i) {
                this.B(77, 94);
            }
            if (string != null) {
                this.Code(124, 95, true, false, false);
            }
            if ((n3 = b.Code(b.T, b.U, 1, 1, 0, true)) != 0) {
                this.Code(b.Code(n3, 105), g.Code(103));
            }
        }
        this.y();
    }

    private void z() {
        boolean bl;
        Vector vector;
        this.x();
        int n = 0;
        int n2 = 0;
        int n3 = Code.Code(1).B();
        int n4 = g.Code(this.Code.I().Code.Code);
        if (n4 == 109) {
            vector = g.c;
            n2 = 1;
            n = 56;
        } else if (n4 == 90) {
            vector = g.J;
            n2 = g.v;
        } else if (n4 == 136) {
            vector = g.d;
            n = -40;
        } else {
            if (n4 == 148) {
                if (n3 >= 0) {
                    C c = (C)g.B.elementAt(n3);
                    byte by = c.Code;
                    this.Code(150, 212, false, false, (by | -by) >>> 31);
                    this.Code(151, 213, false, false, c.Code != 3 && c.Code != 1);
                    this.Code("overlay:" + g.I(149), 210);
                }
                this.Code(152, 214, false, false, false);
                this.y();
                return;
            }
            n = n3 < 0 || g.Code(g.Code(g.a, n3)) ? 1 : 0;
            this.Code(52, 15, false, true, n3 < 0);
            this.Code(50, 19, false, true, n != 0);
            this.y();
            return;
        }
        boolean bl2 = bl = n3 < n2 || g.Code(g.Code(vector, n3), 2);
        if (vector != g.d) {
            this.Code(100 - n, 44, false, true, false);
        }
        this.Code(101 - n, 15, false, true, bl);
        this.Code(99 - n, 14, false, true, bl);
        this.Code(97 - n, 30, false, false, n3 <= n2);
        this.Code(98 - n, 31, false, false, n3 == vector.size() - 1 || n3 < n2);
        if (vector == g.d) {
            this.Code(g.I(140), 156);
        }
        if (n == 0) {
            this.Code(49, 90, false, false, Code.Z ^ true);
        }
        this.y();
    }

    private void H() {
        boolean bl = "1".equals(g.I(this.Z, "s"));
        int n = 0;
        String string = g.I(this.Z, "r");
        if (string != null) {
            n = Integer.parseInt(string);
        }
        this.ak = 0;
        this.J = Code.Code.Code(bl);
        this.I = C.Code();
        this.d = true;
        this.Code = 1;
        this.I = 10;
        int n2 = g.J(0) + c;
        this.Code(0, this.aA, this.j() + this.ax + this.ay, 1, 0);
        if (n > 0) {
            if (g.B()) {
                this.t = true;
            }
            this.Code(g.Code(155), 1, Code.Code[44]);
            this.t = false;
            this.O();
        }
        Object object = "...";
        int n3 = this.I.lastIndexOf(47, this.I.length() - 2);
        if (n3 > 0) {
            object = (String)object + this.I.substring(n3);
        }
        if (g.B()) {
            String string2 = g.Code(0, this.I, this.j(), (String)object);
            n3 = g.Code(0, string2);
            this.Code(g.Code(0, this.I, this.j(), (String)object), 0, Code.Code[44], this.az + this.j() - n3, this.aA + c / 2);
        } else {
            this.Code(g.Code(0, this.I, this.j(), (String)object), 0, Code.Code[44], this.az, this.aA + c / 2);
        }
        if (bl && !C.Code()) {
            String string3;
            String string4;
            byte by;
            B b;
            if (n == 1) {
                b = this;
                by = 76;
                string4 = "new file";
                string3 = "sets:";
            } else if (n == 2) {
                b = this;
                by = 76;
                string4 = "new file";
                string3 = "set:";
            } else {
                b = this;
                by = 76;
                string4 = "new file";
                string3 = "put:" + C.Code();
            }
            b.Code(by, string4, string3, false);
            this.Code(0, this.aA, this.p, n2);
            this.P();
        }
        this.aA += n2;
        this.O();
        this.Code(this.ax, this.aA++, this.j(), 1, Code.Code[45]);
        for (n = 0; n < this.J.size(); ++n) {
            object = (Object[])this.J.elementAt(n);
            String string5 = (String)object[0];
            int n4 = (Integer)object[1];
            String string6 = null;
            if ((n4 & 4) != 0) {
                string6 = "+".equals(object[0]) ? "mkdir:" : "cwd:";
            } else if (!bl && (n4 & 1) != 0) {
                string6 = "get:";
            }
            if (string6 == null) continue;
            object = (String)object[2];
            String string7 = "...";
            int n5 = ((String)object).lastIndexOf(47);
            if (n5 != -1) {
                string7 = string7 + ((String)object).substring(n5);
            }
            if (g.B()) {
                String string8 = g.Code(0, (String)object, this.j(), string7);
                n5 = g.Code(0, string8);
                this.Code(g.Code(0, (String)object, this.j(), string7), 0, Code.Code[44], this.ax + this.j() - n5, this.aA + c / 2);
            } else {
                this.Code(g.Code(0, (String)object, this.j(), string7), 0, Code.Code[44], this.ax, this.aA + c / 2);
            }
            this.Code((byte)76, (String)object, string6 + string5, false);
            this.Code(0, this.aA, this.p, n2);
            this.P();
            this.aA += n2;
        }
    }

    private void E() {
        this.x();
        g g2 = this.Code;
        while (g2.Code(2)) {
            g2 = g2.I();
        }
        String string = g2.Code.Z();
        this.Code = g2.Code.Code;
        this.I = g2.Code.I;
        this.Code = g2.Code.Code;
        this.Code(string, g.Code(91));
        this.Code("timg:" + string, g.Code(g.ar + 92));
        this.Code("overlay:" + g.I(37), 94);
        this.y();
    }

    private void F() {
        this.Code = 9;
        String string = Code.Code((int)1).Code.Z();
        if (g.Code(g.Code(63))) {
            this.t = true;
        }
        this.Code(g.Code(63) + ":", 1, Code.Code[44]);
        this.t = false;
        this.O();
        this.Code(string, 0, Code.Code[44]);
    }

    private void K() {
        this.aA -= 5;
        this.d = true;
        B b = this.Code.I().Code;
        int n = g.I(this.Z, "b").equals("0") ^ 1;
        this.Code = (n << 3) + 1;
        this.I = 10;
        this.I = g.Code(41);
        String string = "\u0000" + g.I(this.Z, "a") + "\u0000";
        int n2 = b.au;
        int n3 = g.J(b.I, n2);
        n2 += 3;
        int n4 = this.ax;
        for (int i = 0; i < n3; ++i) {
            int n5;
            String string2 = g.Code(b.I, n2);
            n2 += g.I(b.I, n2) + 2;
            String string3 = g.Code(b.I, n2);
            n2 += g.I(b.I, n2) + 2;
            int n6 = this.aA;
            this.aA += c / 2;
            int n7 = n5 = string.indexOf("\u0000" + string2 + "\u0000") >= 0 ? 1 : 0;
            if (n != 0) {
                int n8;
                if (g.B()) {
                    this.t = true;
                    int n9 = this.ay;
                    int n10 = this.az;
                    this.ay = 6;
                    this.az = this.ax + this.j() - 12;
                    n8 = this.Code(String.valueOf(i), string2, n5 << 1, g.J(0));
                    this.az = n10;
                    this.ay += 18;
                    this.ax = this.az;
                    this.Code(string3, n5, -16777216);
                    this.ay = n9;
                    this.t = false;
                } else {
                    this.az = 6;
                    n8 = this.Code(String.valueOf(i), string2, n5 << 1, g.J(0));
                    this.az += 6;
                    this.ax = this.az;
                    this.Code(string3, n5, -16777216);
                }
                this.O();
                this.I("", n8);
            } else {
                this.az = 5;
                if (g.B()) {
                    this.t = true;
                } else {
                    this.ax += 10;
                }
                this.Code(string3, 0, -16777216);
                this.t = false;
                this.O();
                this.Code((byte)42, "", string2, n5 != 0);
            }
            this.ax = n4;
            this.a(c / 2);
            int n11 = this.j() + this.ax + this.ay;
            this.Code(n4, n6, n11, this.aA - n6);
            this.P();
            this.Code(0, this.aA++, n11, 1, Code.Code[15]);
        }
    }

    private void Code(Vector vector, boolean bl, int n) {
        int n2;
        String string = null;
        if (vector == g.J) {
            string = "bookmark:";
            n2 = -1000;
        } else if (vector == g.c) {
            string = "search:";
            n2 = -2000;
        } else if (vector == g.a) {
            string = "speeddial:";
            n2 = -4000;
        } else if (vector == Code.I) {
            n2 = -3000;
        } else if (vector == g.d) {
            string = "open:";
            n2 = -5000;
        } else if (vector == g.I) {
            string = "spl:";
            n2 = -7000;
        } else {
            n2 = vector == g.b ? -8000 : -3999;
        }
        n = n >= 0 ? Math.min(n, vector.size()) : vector.size();
        for (int i = 0; i < n; ++i) {
            boolean bl2;
            Object[] objectArray = g.Code(vector, i);
            boolean bl3 = vector == Code.I || vector == g.d ? false : (bl2 = g.Code(objectArray, 5) == 82);
            if (vector == g.b) {
                boolean bl4 = bl2;
                if (objectArray[3] != null) {
                    bl4 = bl4 | true;
                }
                bl2 = bl4;
            }
            String string2 = null;
            boolean bl5 = false;
            int n3 = -16777216;
            if (vector == g.a && (bl5 = g.Code(objectArray)) && !bl) {
                string2 = g.Code(128);
            }
            if (this.d) {
                string2 = (String)objectArray[1];
                string = "";
                objectArray = null;
                if (vector != g.J && vector != Code.I && i > 0) {
                    bl2 = false;
                    if (g.Code(g.Code(g.a, i - 1))) {
                        n3 = Code.Code[52];
                    }
                }
            }
            if (bl && bl5 || bl2 && vector != g.a) continue;
            this.Code(objectArray, string == null ? null : string + i + (string.length() > 0 ? ":" : ""), string2, n2 - i, false, vector == g.c && this.ak == 0 ? i == g.m : false, false, n3);
        }
    }

    private void Z(Vector vector) {
        if (vector == g.J || vector == g.a || vector == null) {
            Code.J = true;
        }
        this.Code = 7;
        this.I = 10;
        this.B = true;
        String string = (String)I[1];
        if (vector == g.J || vector == null) {
            this.I = g.Code(7);
        } else if (vector == g.a) {
            this.I = g.Code(33);
        } else if (vector == g.c) {
            this.I = g.Code(47);
        } else if (vector == g.d) {
            this.I = g.Code(145);
        }
        this.Z(g.Code(65), null);
        this.Code("a", string, (byte[])I[2], 0, -16777216);
        this.a(5);
        if (vector == g.d) {
            this.a(c - 5);
            if (vector.size() > 2 && d == -1) {
                this.Code(0, this.aA - 1, this.p, 1, Code.Code[15]);
                this.Code(0, g.Code(157), "s", "1", -1);
            }
        } else {
            this.Z(g.Code(63), null);
            this.Code("b", (String)I[0], null, 48, -16777216);
            this.a(c - 4);
            if (g.B()) {
                this.t = true;
            }
            this.B(g.I(53), g.Code(129));
            this.t = false;
            this.a(5);
        }
        if (vector == g.a) {
            if (g.B()) {
                this.t = true;
            }
            if (g.J.size() > 0) {
                this.B("dialog:" + g.I(54) + "&l=b", g.Code(132));
                this.O();
            }
            if (Code.I.size() > 0) {
                this.B("dialog:" + g.I(54) + "&l=h", g.Code(133));
                this.O();
            }
            this.t = false;
        }
        if (vector == null) {
            if (g.B()) {
                this.t = true;
            }
            this.Code(g.Code(33), 0, -16777216);
            this.t = false;
            this.O();
            this.a(2);
            if (Code == null) {
                vector = new Vector<Object[]>();
                Object[] objectArray = g.Code();
                Object[] objectArray2 = objectArray;
                objectArray[1] = "- " + g.Code(131) + " -";
                vector.addElement(objectArray2);
                for (int i = 0; i < g.a.size(); ++i) {
                    Object[] objectArray3 = g.Code((Object[])g.a.elementAt(i));
                    if (g.Code(objectArray3)) {
                        objectArray3[1] = g.Code(130);
                    }
                    vector.addElement(objectArray3);
                }
                Code = vector;
                d = -1;
            }
            this.Code("$", "", null, 129, -16777216);
        }
        if (vector == g.c && string.length() == 0) {
            this.Code(g.Code(127, g.Code(108)), 0, Code.Code[52]);
        }
    }

    private void I(Vector vector) {
        int n;
        int n2;
        String string;
        B b;
        if (vector == g.J || vector == g.a) {
            Code.J = true;
        }
        this.N();
        int n3 = this.Code.I().B();
        if (vector == g.J) {
            this.I = g.Code(26);
            if (g.Code(g.Code(27))) {
                this.t = true;
            }
            b = this;
            string = g.Code(27);
        } else if (vector == g.c) {
            this.I = g.Code(123);
            if (g.Code(g.Code(124))) {
                this.t = true;
            }
            b = this;
            string = g.Code(124);
        } else if (vector == g.d) {
            this.I = g.Code(150);
            if (g.Code(g.Code(151))) {
                this.t = true;
            }
            b = this;
            string = g.Code(151);
        } else {
            this.I = g.Code(125);
            if (g.Code(g.Code(126))) {
                this.t = true;
            }
            b = this;
            string = g.Code(126);
        }
        b.Code(string, 0, -16777216);
        this.t = false;
        this.a(5);
        Object[] objectArray = g.Code(vector, n3);
        if (vector == g.J) {
            n2 = -1000;
            n = n3;
        } else if (vector == g.a) {
            n2 = -4000;
            n = n3;
        } else if (vector == g.d) {
            n2 = -5000;
            n = n3;
        } else {
            n2 = -2000;
            n = n3;
        }
        this.Code(objectArray, null, null, n2 - n, true, false, false, Code.Code[52]);
    }

    private void C(boolean n) {
        int n2 = Code.I.size();
        int n3 = 0;
        if (n != 0) {
            n3 = n2 - Math.min(3, n2);
        }
        for (n = n2 - 1; n >= n3; --n) {
            this.Code((Object[])Code.I.elementAt(n), "history:" + n + ":", null, -3000 - n, false, false, false, -16777216);
        }
    }

    private void Z(int n, int n2, int n3) {
        int n4 = this.Code.Code(8) * 38 + 7;
        n4 = Code.Code[n4] & 0xFEFFFFFF;
        this.Code(this.az + 1, this.aA + n3, n - 2, 1, n4);
        this.Code(this.az + 1, this.aA + n3 + n2 - 1, n - 2, 1, n4);
        this.Code(this.az, this.aA + n3, 1, n2, n4);
        this.Code(this.az + n - 1, this.aA + n3, 1, n2, n4);
        if (!this.Code.Code(8)) {
            this.Code(this.az + 1, this.aA + 1 + n3, n - 2, 1, Code.Code[4] & 0xFEFFFFFF);
            this.Code(this.az + 1, this.aA + 2 + n3, n - 2, 1, Code.Code[5] & 0xFEFFFFFF);
            this.Code(this.az + 1, this.aA + 3 + n3, n - 2, 1, Code.Code[6] & 0xFEFFFFFF);
        }
    }

    private int Code(String string, String string2, int n, int n2) {
        int n3 = n2 = n2 == -1 ? 0 : (n2 - 12) / 2;
        if ((n & 2) != 0) {
            n &= 0xFFFFFFFD;
            this.Code.put(string, string2);
        }
        this.Code(this.az, this.aA + n2, 12, 12, Code.Code[16] & 0xFEFFFFFF);
        this.Z(12, 12, n2);
        int n4 = this.Code(this.az, this.aA + n2, 12, 12, 'c', n, string, string2, 0, 0);
        this.az += 13;
        return n4;
    }

    private void Z(String string, String string2) {
        this.O();
        int n = this.aA;
        int n2 = g.J(0) + 6;
        if (string2 != null) {
            this.Code((byte)76, string, string2, false, 3, this.aA + 2, this.p - 6, n2 - 4);
        }
        this.C(n2);
        this.a(3);
        if (g.B()) {
            this.t = true;
        }
        this.Code(string, 1, -16777216);
        this.t = false;
        this.O();
        this.aA = n + n2 + 4;
    }

    private void Code(String string, String string2, int n, int n2) {
        this.Code.put(string, string2);
        int n3 = g.J(0) + 5;
        this.C(n2, n3);
        this.Z(n2, n3, 0);
        int n4 = this.Code(this.az + 3, this.aA + 3, n2 - 4, n3 - 4, 'F', 0, string, string2, 0, n);
        this.I("", n4);
        this.Code(this.az + 1, this.aA + 1, n2 - 2, n3 - 2);
        this.P();
        if (g.B()) {
            this.I(this.az + (this.ay << 1) + n3 / 3 - 1, n3, n);
        } else {
            this.I(this.az + n2, n3, n);
        }
        this.az += n2;
    }

    private void Code(byte by, String string, String string2, boolean bl, int n, int n2, int n3, int n4) {
        this.Code(by, string, string2, bl);
        B.Code(this.Z, n, n2, n3, n4);
        this.P();
    }

    private void Code(byte by, String string, String string2, boolean bl) {
        if (this.Z[9] != null && this.Z[9].equals(string2)) {
            this.ak = this.aC;
        }
        ++this.aC;
        this.Z.write(by);
        if (bl) {
            this.ah = this.Z.size();
        }
        this.Z.writeUTF(string);
        this.Z.writeUTF(string2);
        this.aB = this.Z.size();
        this.Z.write(0);
    }

    private void I(String string, int n) {
        ++this.aC;
        this.Z.write(73);
        this.Z.writeUTF(string);
        this.Z.writeShort(3);
        g.Code(this.Z, n);
        this.aB = this.Z.size();
        this.Z.write(0);
    }

    private void I(int n, int n2, int n3, int n4, int n5) {
        this.I.write(73);
        B.Code(this.I, n2, n3, n4, n5);
        this.I.writeInt(0);
        this.I.write(0);
        this.I.write(0);
        this.I.write(0);
        g.Code(this.I, n);
    }

    private void Code(int n, int n2, int n3, int n4, int n5) {
        this.Code(n, n2, n3, n4);
        this.I.write(66);
        B.Code(this.I, n, n2, n3, n4);
        this.I.writeInt(n5);
    }

    private static void Code(DataOutputStream dataOutputStream, int n, int n2, int n3, int n4) {
        dataOutputStream.writeShort(n);
        g.Code(dataOutputStream, n2);
        dataOutputStream.writeShort(n3);
        g.Code(dataOutputStream, n4);
    }

    private void J(String string, String string2) {
        this.Code(string, string2, 0, 0, false, false, false, -16777216);
    }

    private void J(int n, int n2, int n3) {
        this.ap = this.Code.size();
        this.I = this.Code.Code();
        Image image = this.Code(n, 0, 0);
        int n4 = image.getWidth();
        int n5 = image.getHeight();
        this.Code(n2, n3, n4, n5);
        this.I(n, n2, n3, n4, n5);
    }

    private int Code(byte[] byArray) {
        int n = byArray.length;
        byte[] byArray2 = byArray;
        B b = this;
        int n2 = b.Code.size();
        b.Code.writeShort(n);
        b.Code.write(byArray2, 0, n);
        return n2;
    }

    private void Code(Object[] objectArray, String string, String string2, int n, boolean bl, boolean bl2, boolean bl3, int n2) {
        if (string2 == null) {
            string2 = "";
        }
        if (string == null) {
            string = "";
        }
        if (objectArray != null) {
            string2 = string2 + (String)objectArray[1];
            string = string + (String)objectArray[0];
        }
        this.Code(string, string2, n, 0, bl, bl2, bl3, n2);
    }

    private void Code(String string, String string2, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3) {
        this.az = 4;
        this.a(c / 2);
        if (g.B()) {
            Image image = null;
            int n4 = 0;
            Image image2 = null;
            int n5 = 0;
            int n6 = 0;
            int n7 = this.ay;
            if (n != 0 && (image = this.Code(n, 0, 0)) != null) {
                n4 = image.getWidth() + 4;
            }
            if (n2 != 0 && (image2 = this.Code(n2, 0, 0)) != null) {
                n5 = image2.getWidth();
            }
            if (bl3) {
                n6 = (g.J(0) + 2) / 3 + 4;
            }
            String string3 = g.Code(0, string2, this.j() - n4 - n5 - n6, null);
            g.Code(0, string3);
            this.az += n6;
            if (bl3) {
                this.I(this.az, g.J(0) + 2, n3);
            }
            if (image2 != null) {
                this.Code(n2, false, 0);
            }
            this.t = true;
            this.ay += n4;
            this.Code(string3, 0, n3);
            this.ay = n7;
            this.t = false;
            if (image != null) {
                this.az = this.ax + this.j() - image.getWidth();
                this.Code(n, false, 0);
            }
        } else {
            if (n != 0 && this.Code(n, 0, 0) != null) {
                this.Code(n, false, 0);
                this.az += 4;
            }
            Image image = null;
            int n8 = 0;
            if (n2 != 0 && (image = this.Code(n2, 0, 0)) != null) {
                n8 = image.getWidth() + 4;
            }
            this.Code(g.Code(0, string2, this.j() - this.az - n8, null), 0, n3);
            if (image != null) {
                this.az = this.j() - image.getWidth();
                this.Code(n2, false, 0);
            }
            if (bl3) {
                this.I(this.j(), g.J(0) + 2, n3);
                this.az = this.j();
            }
        }
        n = this.j() + this.ax + this.ay;
        if (!bl) {
            this.Code((byte)42, string2, string, bl2, 0, this.aA - c / 2, n, this.av + c);
        }
        this.O();
        this.a(c / 2);
        this.Code(0, this.aA++, n, 1, Code.Code[15]);
    }

    private void S() {
        int n;
        int n2;
        DataInputStream dataInputStream = new DataInputStream(this.Code);
        while ((n2 = dataInputStream.readUnsignedByte()) == 255) {
            this.b(2);
            this.aH = dataInputStream.readUnsignedByte();
        }
        this.as = n2 << 16 | dataInputStream.readUnsignedShort();
        this.b(3);
        n2 = (dataInputStream.readUnsignedByte() << 16) + dataInputStream.readUnsignedShort();
        block28: for (int i = 0; i < n2; i += n + 3) {
            int n3 = dataInputStream.readByte();
            n = dataInputStream.readUnsignedShort();
            switch (n3) {
                case 82: {
                    byte[] byArray = new byte[n];
                    dataInputStream.readFully(byArray, 0, n);
                    g.Code(-1, byArray, "r", true);
                    g.s();
                    g.aG = true;
                    continue block28;
                }
                case 102: {
                    n3 = Thread.currentThread().getPriority();
                    Thread.currentThread().setPriority(5);
                    Code.b = false;
                    this.Code.Code("overlay:" + g.I(34), null, null);
                    Code.Code.d();
                    B b = this;
                    b.Code.close();
                    b.l = true;
                    g.B(true);
                    Code.Code.I(Code.Code(8));
                    Code.Code.e();
                    Thread.currentThread().setPriority(n3);
                    continue block28;
                }
                case 99: {
                    Object object;
                    n3 = dataInputStream.readByte();
                    for (int j = 0; j != n3; ++j) {
                        int n4 = dataInputStream.readShort();
                        int n5 = -1;
                        if (n4 == 1) {
                            n5 = dataInputStream.readByte();
                        }
                        n4 = dataInputStream.readInt();
                        object = new byte[dataInputStream.readUnsignedShort()];
                        dataInputStream.readFully((byte[])object);
                        B.Code(n5, n4, (byte[])object);
                    }
                    Code.J();
                    g.J(false);
                    continue block28;
                }
                case 35: {
                    int n6;
                    ++Code.Code;
                    Code.J = true;
                    Vector<Object[]> vector = new Vector<Object[]>(9);
                    for (n6 = 0; n6 < 9; ++n6) {
                        vector.addElement(g.Code(g.Code(g.a, n6)));
                    }
                    n6 = Code.I ? 1 : 0;
                    try {
                        int n7 = dataInputStream.readByte();
                        int n8 = 0;
                        while (n8 < n7) {
                            int n9;
                            byte by = dataInputStream.readByte();
                            int n10 = dataInputStream.readUnsignedShort();
                            byte[] byArray = null;
                            if (n10 > 0) {
                                byArray = new byte[n10];
                                dataInputStream.readFully(byArray);
                            }
                            String string = dataInputStream.readUTF();
                            String string2 = dataInputStream.readUTF();
                            int n11 = dataInputStream.readInt();
                            if (n6 != 0) {
                                ++n8;
                                continue;
                            }
                            int n12 = n9 = string2.length() == 0 && string.length() == 0 && n10 == 0 ? 1 : 0;
                            if (by <= 0 || by > 9 || n9 == 0 && (string2.length() == 0 || string.length() == 0 || n10 == 0) || (g.Code(g.Code(vector, by - 1), 9) & 1) != 0) {
                                Code.Code(new Integer(n11), false);
                                ++n8;
                                continue;
                            }
                            Object[] objectArray = g.Code(vector, by - 1);
                            n10 = g.Code(objectArray, 5);
                            if (n10 == 97) {
                                objectArray[5] = new Integer(83);
                            } else if (n10 == 83 && (g.Code(objectArray, 9) & 4) != 0) {
                                objectArray[5] = new Integer(82);
                            }
                            objectArray[0] = string2;
                            objectArray[1] = string;
                            objectArray[2] = byArray;
                            objectArray[9] = new Integer((n9 ^ 1) << 1);
                            objectArray[10] = new Integer(n9 != 0 ? 0 : n11);
                            ++n8;
                        }
                        if (n6 == 0) {
                            g.aF = true;
                            g.q();
                            g.a = vector;
                            g.Code(g.a, true);
                        }
                    }
                    catch (Throwable throwable) {}
                    Code.J = false;
                    continue block28;
                }
                case 103: {
                    Code.C();
                    continue block28;
                }
                case 110: {
                    n3 = dataInputStream.readUnsignedShort();
                    byte[] byArray = new byte[n3];
                    String string = dataInputStream.readUTF();
                    dataInputStream.readFully(byArray);
                    if ("private".equals(string)) {
                        g.p = g.Code(g.p, byArray, "b", false);
                        g.J(false);
                        this.B();
                        Code.Code.I(this.J);
                        continue block28;
                    }
                    if (!this.Code.J()) continue block28;
                    if (n3 == 0) {
                        g.aB = true;
                    } else {
                        g.aB = false;
                        g.n = g.Code(g.n, byArray, "b", false);
                    }
                    g.J(false);
                    Code.h();
                    I = null;
                    Code.Code.I();
                    Code.Code.Z();
                    continue block28;
                }
                default: {
                    Object object;
                    if (this.Code.J()) {
                        switch (n3) {
                            case 70: {
                                this.Code = new Object[7];
                                this.Code[0] = dataInputStream.readUTF();
                                long l = dataInputStream.readLong();
                                if (l > 0L) {
                                    this.Code[1] = new Integer((int)l);
                                }
                                this.Code[2] = dataInputStream.readUTF();
                                this.Code[3] = dataInputStream.readUTF();
                                n3 = dataInputStream.readByte();
                                block32: for (int j = 0; j < n3; ++j) {
                                    char c = (char)dataInputStream.readByte();
                                    String string = dataInputStream.readUTF();
                                    switch (c) {
                                        case 'o': {
                                            this.Code[5] = string;
                                            continue block32;
                                        }
                                        case 's': {
                                            this.Code[4] = string;
                                        }
                                    }
                                }
                                continue block28;
                            }
                            case 75: {
                                n3 = dataInputStream.readUnsignedByte();
                                String string = dataInputStream.readUTF();
                                if (n3 == 0) {
                                    g g2 = this.Code.I();
                                    ((Object[])g.Code.get((Object)g2.Code()))[1] = string;
                                    break;
                                }
                                g.Code(n3, string, true);
                                break;
                            }
                            case 68: {
                                String string = dataInputStream.readUTF();
                                String string3 = dataInputStream.readUTF();
                                dataInputStream.readUTF();
                                Code.Code(string, string3);
                                break;
                            }
                            case 114: {
                                String string = dataInputStream.readUTF();
                                this.B();
                                this.Code.Code(string, this.Code, null);
                                break;
                            }
                            case 101: {
                                this.k = dataInputStream.readInt();
                                this.Code = (char)dataInputStream.readByte();
                                this.C = dataInputStream.readUTF();
                                if (Code.Code() != this && Code.Code().Code() != this) continue block28;
                                f.J();
                                break;
                            }
                            case 67: {
                                n3 = dataInputStream.readUnsignedByte();
                                this.h |= n3 & 1;
                                int n13 = n3 & 2;
                                this.B |= (n13 | -n13) >>> 31;
                                int n14 = n3 & 4;
                                this.J |= (n14 | -n14) >>> 31;
                                break;
                            }
                            case 83: {
                                Object[] objectArray = g.Code();
                                Object[] objectArray2 = objectArray;
                                objectArray[0] = dataInputStream.readUTF();
                                objectArray2[1] = dataInputStream.readUTF();
                                short s = dataInputStream.readShort();
                                if (s > 0) {
                                    objectArray2[2] = new byte[s];
                                    dataInputStream.readFully((byte[])objectArray2[2]);
                                }
                                g.c.setElementAt(objectArray2, 0);
                                g.r();
                                break;
                            }
                            case 115: {
                                String string = dataInputStream.readUTF();
                                String string4 = dataInputStream.readUTF();
                                new d(string, string4).Code();
                                break;
                            }
                            case 112: {
                                g.I(dataInputStream.readUTF());
                                break;
                            }
                            case 73: {
                                n3 = dataInputStream.readByte();
                                String[] stringArray = new String[dataInputStream.readByte()];
                                for (int j = 0; j < stringArray.length; ++j) {
                                    stringArray[j] = dataInputStream.readUTF();
                                }
                                if (n3 != 99 || stringArray.length != 2) continue block28;
                                this.I = stringArray;
                                break;
                            }
                            case 52: {
                                n3 = dataInputStream.readUnsignedByte();
                                for (int j = 0; j < n3; ++j) {
                                    int n15 = dataInputStream.readUnsignedByte();
                                    int n16 = dataInputStream.readUnsignedByte();
                                    object = dataInputStream.readUTF();
                                    if (n15 >= g.Z.size()) continue;
                                    Object[] objectArray = (Object[])g.Z.elementAt(n15);
                                    Object[] objectArray3 = objectArray;
                                    objectArray[objectArray.length - 1] = new Integer(n16);
                                    if (((String)object).length() <= 0) continue;
                                    ((Object[])objectArray3[n16])[1] = object;
                                }
                                continue block28;
                            }
                            default: {
                                g.Code((InputStream)dataInputStream, (long)n);
                                break;
                            }
                        }
                        continue block28;
                    }
                    g.Code((InputStream)dataInputStream, (long)n);
                }
            }
        }
        this.Code(dataInputStream);
        this.b(5);
    }

    /*
     * Exception decompiling
     */
    private static void Code(int var0, int var1_3, byte[] var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 114->331)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    private int Code(int n, int n2, int n3, int n4, char c, int n5, String string, String string2, int n6, int n7) {
        this.I.write(70);
        B.Code(this.I, n, n2, n3, n4);
        this.I.writeInt(n7);
        this.I.write(c);
        this.I.write(n5);
        this.I.writeUTF(string);
        this.I.writeUTF(string2);
        g.Code(this.I, n6);
        n7 = this.Code.size();
        this.Code.write(70);
        B.Code(this.Code, n, n2, n3, n4);
        this.Code.writeInt(0);
        this.Code.write(c);
        this.Code.write(n5);
        this.Code.writeUTF(string);
        this.Code.writeUTF(string2);
        g.Code(this.Code, n6);
        return n7;
    }

    private int k() {
        this.aD = 0;
        this.au = this.Code.size();
        g.Code(this.Code, 0);
        return this.au;
    }

    private void C(int n) {
        int n2 = this.j() + this.ax + this.ay;
        this.Code(0, this.aA, n2, 1, Code.Code[57]);
        this.Code(0, this.aA + n - 1, n2, 1, Code.Code[58]);
        int n3 = Code.Code[55];
        int n4 = Code.Code[56];
        int n5 = n3 >> 8 & 0xFF00;
        int n6 = n3 & 0xFF00;
        n3 = n3 << 8 & 0xFF00;
        int n7 = ((n4 >> 8 & 0xFF00) - n5) / (n -= 2);
        int n8 = ((n4 & 0xFF00) - n6) / n;
        n4 = ((n4 << 8 & 0xFF00) - n3) / n;
        for (int i = 0; i < n; ++i) {
            int n9 = 0xFF000000 | (n5 & 0xFF00) << 8 | n6 & 0xFF00 | n3 >> 8;
            this.Code(0, this.aA + 1 + i, n2, 1, n9);
            n5 += n7;
            n6 += n8;
            n3 += n4;
        }
    }

    private void b(int n) {
        if (n <= this.C) {
            return;
        }
        this.C = n;
        if (!(this.Code() || n != 7 && n != 5 && n != 6)) {
            this.Code.e();
        }
        if (n == 7 || n == 4 || n == 5 || n == 6) {
            if (n == 4 && this.Code != null && this.Code[4] == 1) {
                this.I(true);
            }
            Code.b = false;
            g.Code((Object)Code.Code);
        }
        if (!g.az && g.C.equals(this.Code)) {
            this.Code = 13;
            this.I = 14;
            this.h = true;
            this.B = true;
        }
        this.Code.Code(this);
        if (!u && n == 5 && g.Code(this.Code) == 65) {
            u = true;
            String string = g.Code("com.lge.browser.launchurl");
            if (string != null && string.length() > 0) {
                Code.Code.I(string);
            }
        }
    }

    private void C(String string, String string2) {
        ++this.aD;
        this.Code.writeUTF(string);
        this.Code.writeUTF(string2);
    }

    private boolean Code(int n) {
        return this.az + n + this.ay > this.Code.Z();
    }

    private void I(int n, int n2, int n3) {
        int n4 = 1;
        while (n4 < n2 / 3) {
            if (g.B()) {
                this.Code(n - n4 - this.ay, this.aA + n2 / 2 - (n2 / 3 - n4) + 1, 1, (n2 / 3 - n4 << 1) - 1, n3);
                ++n4;
                continue;
            }
            this.Code(n - n4 - this.ay, this.aA + n2 / 2 - n4 + 1, 1, (n4 << 1) - 1, n3);
            ++n4;
        }
    }

    private int j() {
        return this.Code.Z() - this.ax - this.ay;
    }

    private void Code(int n, int n2, int n3, int n4) {
        this.p = Math.max(this.p, n + n3);
        this.q = Math.max(n2 + n4, this.q);
        if (this.aB > 0) {
            B.Code(this.Z, n, n2, n3, n4);
        }
    }

    private void Code(String string, int n, int n2, int n3, int n4) {
        int n5 = g.Code(n, string);
        int n6 = g.J(n);
        this.Code(n3, n4, n5, n6);
        this.I.write(84);
        B.Code(this.I, n3, n4, n5, n6);
        this.I.writeInt(n2);
        this.I.write(g.Code(n));
        this.I.writeUTF(string);
    }

    private int Code(String string, int n, int n2) {
        int n3;
        int n4;
        while (true) {
            if ((n4 = string.indexOf(10)) >= 0) {
                if (n4 > 0) {
                    this.Code(string.substring(0, n4), n, n2);
                }
                this.O();
                string = string.substring(n4 + 1, string.length());
                continue;
            }
            n4 = g.Code(n, string);
            if (n4 <= (n3 = this.Code.Z() - Math.min(this.az, this.ax) - this.ay)) break;
            n4 = string.lastIndexOf(32, string.length());
            while (n4 > 0 && g.Code(n, string.substring(0, n4)) > n3) {
                n4 = string.substring(0, n4).lastIndexOf(32);
            }
            if (n4 > 0 && n4 != string.length()) {
                this.Code(string.substring(0, n4), n, n2);
                this.O();
                string = string.substring(n4 + 1);
                continue;
            }
            if (this.Code(g.Code(n, string.substring(0, 3)))) {
                this.O();
            }
            n4 = this.Code.Z() - this.ay - this.az;
            char[] cArray = string.toCharArray();
            n4 = Math.max(g.I(n, cArray, cArray.length, n4), 1);
            this.Code(string.substring(0, n4), n, n2);
            string = string.substring(n4);
        }
        int n5 = g.J(n);
        if (this.t) {
            if (this.Code(n4)) {
                this.O();
            }
            this.az = this.ax + n3 - n4;
        }
        this.C(n4, n5);
        this.I.write(84);
        B.Code(this.I, this.az, this.aA, n4, n5);
        this.I.writeInt(n2);
        this.I.write(g.Code(n));
        this.I.writeUTF(string);
        this.az += n4;
        return n4;
    }

    private int Code(String string, String string2, int n, int n2, int n3) {
        int n4;
        int n5 = this.Code.Z() - this.az - 12;
        int n6 = g.J(0);
        if (this.t) {
            if (this.j() - (this.az + n3) < this.j() / 3) {
                this.O();
                this.a(5);
            }
            n5 = this.Code.Z() - this.az - n3 - 12 - 4;
        } else if (this.j() - this.az < this.j() / 3) {
            this.O();
            this.a(5);
        }
        this.C(n5, n6);
        if (this.t) {
            this.I(this.az + this.ay + n6 / 3 - 1, n6, -16777216);
            n4 = this.Code(this.az + n6 / 2 + 4, this.aA, n5 - n6 / 2 - 4, n6, 's', n, string, string2, n2, -16777216);
        } else {
            this.I(this.Code.Z() + this.ay - 12, n6, -16777216);
            n4 = this.Code(this.az, this.aA, n5 - n6 / 2 - 4, n6, 's', n, string, string2, n2, -16777216);
        }
        this.az += n5;
        return n4;
    }

    private void Code(int n, boolean bl, int n2) {
        this.ap = this.Code.size();
        this.I = this.Code.Code();
        Image image = this.Code(n, 0, 0);
        int n3 = image.getWidth();
        int n4 = image.getHeight();
        if (bl) {
            this.az = this.Code.Z() / 2 - n3 / 2;
            this.az = Math.max(0, this.az);
        }
        if (n2 >= 0) {
            this.aA += (g.J(n2) - n4) / 2;
        }
        this.C(n3, n4);
        this.I(n, this.az, this.aA, n3, n4);
        if (n2 >= 0) {
            this.aA -= (g.J(n2) - n4) / 2;
        }
        this.az += n3;
    }

    private void Code(String string, String string2, byte[] byArray, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        B b;
        int n7 = this.j();
        int n8 = n2;
        int n9 = n;
        byte[] byArray2 = byArray;
        String string3 = string2;
        String string4 = string;
        B b2 = this;
        int n10 = g.J(0);
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        if (byArray2 != null && byArray2.length == 0) {
            byArray2 = null;
        }
        if (byArray2 != null) {
            n14 = b2.Code(byArray2);
            b2.ap = b2.Code.size();
            b2.I = b2.Code.Code();
            Image image = b2.Code(n14, 0, 0);
            n11 = image.getWidth() + 3;
            n12 = Math.max(0, (image.getHeight() - n10) / 2);
            n13 = Math.max(0, (n10 - image.getHeight() + 1) / 2);
            n10 = Math.max(n10, image.getHeight());
        }
        b2.C(n7, n10 += 5);
        b2.Z(n7, n10, 0);
        if (byArray2 != null) {
            if (g.B() && string4.compareTo("o:a") != 0 && string4.compareTo("b") != 0) {
                b2.J(n14, b2.az + n7 - n11, b2.aA + 3 + n13);
            } else {
                b2.J(n14, b2.az + 3, b2.aA + 3 + n13);
            }
        }
        if ((n9 & 0x80) != 0) {
            int n15 = b2.az + n7 - n10 / 2 - 6;
            n13 = b2.aA + n10 / 2 - 1;
            if (g.B() && string4.compareTo("o:a") != 0 && string4.compareTo("b") != 0) {
                n15 = b2.az + n10 / 2;
            }
            for (n14 = 7; n14 > 0; n14 -= 2) {
                b2.Code(n15, n13, n14, 1, -16777216);
                ++n15;
                ++n13;
            }
        }
        if (g.B() && string4.compareTo("o:a") != 0 && string4.compareTo("b") != 0) {
            int n16 = g.Code(0, string3);
            if (n16 > n7 - 4 - n11 - ((n9 & 0x80) != 0 ? n10 : 0)) {
                int n17 = n7 - 4 - n11;
                if ((n9 & 0x80) != 0) {
                    n17 = n16 = n17 - n10;
                }
            }
            if (string4.compareTo("$") == 0 || string4.compareTo("a") == 0) {
                int n18 = n7 - 4 - n11;
                if ((n9 & 0x80) != 0) {
                    n18 = n18 - n10;
                }
                n16 = n18;
            }
            b = b2;
            n6 = b2.az + n7 - 4 - n11 - n16;
            n5 = b2.aA + 3 + n12;
            n4 = n7 - 4 - n11;
            n3 = (n9 & 0x80) != 0 ? n10 : 0;
        } else {
            b = b2;
            n6 = b2.az + 3 + n11;
            n5 = b2.aA + 3 + n12;
            n4 = n7 - 4 - n11;
            n3 = (n9 & 0x80) != 0 ? n10 : 0;
        }
        n8 = b.Code(n6, n5, n4 - n3, n10 - 4, 'x', n9, string4, string3, 0, n8);
        b2.I("", n8);
        b2.Code(b2.az + 1, b2.aA + 1, n7 - 2, n10 - 2);
        b2.P();
        b2.az += n7;
    }

    static void Code(g object) {
        if (g.z < 160 && g.az) {
            ((g)object).Code("overlay:" + g.I(40), null, null);
            while (g.aH) {
                g.Code(g.I, 1000);
            }
            Code.Code.I(Code.Code(8));
        }
        if (g.z >= 160 && g.Code[1] == null) {
            byte[] byArray = new byte[32];
            object = byArray;
            g.Code(byArray);
            g.Code(1, g.I((byte[])object, ((Object)object).length), true);
        }
    }

    private void Code(DataInputStream dataInputStream) {
        int n;
        byte[] byArray = new byte[3];
        int n2 = 0;
        while ((n2 += dataInputStream.read(byArray, n2, 3 - n2)) < 3) {
        }
        this.aq = g.J(byArray, 0);
        for (n = 0; n <= 3; ++n) {
            try {
                this.I = new byte[this.aq];
                break;
            }
            catch (Throwable throwable) {
                Code.Code(n);
                continue;
            }
        }
        if (this.I == null) {
            this.I = new byte[this.aq];
        }
        this.ap = 0;
        n = 0;
        while (this.aq > this.ap) {
            block11: {
                this.ap += dataInputStream.read(this.I, this.ap, Math.min(1024, this.aq - this.ap));
                f.Code(this);
                if (this.ao == 0) {
                    B b = this;
                    int n3 = 11;
                    for (int i = 0; i < 4; ++i) {
                        if (n3 + 2 < b.ap) {
                            n3 += g.Code(b.I, n3) + 2;
                            continue;
                        }
                        break block11;
                    }
                    if (b.ap >= (n3 += 5)) {
                        this.T();
                        n = this.ao;
                        if (this.a != null && this.a.startsWith("server:gettitle")) {
                            B.I[1] = this.I;
                            B.I[2] = this.Code;
                            this.Code.Code.J = "keep";
                            this.B();
                            this.Code.Z();
                        }
                        this.f();
                        this.b(4);
                    }
                }
            }
            if (this.ao <= 0) continue;
            n = this.I(n);
            this.c(1000);
        }
    }

    final boolean Code(String string, boolean bl) {
        if (this.B == null) {
            return false;
        }
        String string2 = this.B;
        this.B = null;
        this.q |= "u".equals(string2);
        if (this.b == 70) {
            this.d = null;
        }
        if (string == null) {
            this.Code.remove(string2);
        } else {
            this.Code.put(string2, string);
        }
        this.a();
        if (this.r) {
            String string3 = this.Code;
            String string4 = "";
            if (string2.equals("o:a")) {
                Code.Code.Z(string);
                return true;
            }
            switch (g.Code(string3)) {
                case 65: 
                case 118: {
                    string3 = string2 + string;
                    break;
                }
                default: {
                    string4 = this.Code();
                }
            }
            if (bl) {
                this.Code.remove(string2);
            }
            this.Code.Code(string3, this.Code, string4, this.I);
        }
        return true;
    }

    private synchronized void I(Integer n, Image object) {
        this.Code = null;
        if (this.Code.Code != this) {
            return;
        }
        int n2 = 0;
        if (n != null) {
            this.Code(n, (Image)object);
            n2 = object != null ? n : 0;
        }
        object = this.B.keys();
        while (object.hasMoreElements()) {
            Integer n3 = (Integer)object.nextElement();
            Integer n4 = (Integer)this.B.get(n3);
            int n5 = n2 - n4;
            if (!this.Code((int)n3, ((n5 | -n5) >>> 31 ^ 1) != 0, false) || this.Z.containsKey(n4) || this.J.containsKey(n4)) continue;
            int n6 = n4 & 0x20000000;
            if (((n6 | -n6) >>> 31 ^ this.I()) == 0 || !this.Code() && this.ap < (n4 & 0x1FFFFFFF) + 2 + g.I(this.I, n4 & 0x1FFFFFFF)) continue;
            this.Code = n4;
        }
        if (this.Code != null) {
            f.Code(this);
            return;
        }
        if (n != null) {
            f.Code = false;
            this.c(0);
        }
    }

    final void i() {
        if (this.Code.Z) {
            this.Code.J = 0;
            this.Code.Z = false;
            this.I = null;
            this.aO = -1;
            this.Code = this.Z;
            this.B = this.m;
            this.I = this.J;
            this.a();
            this.c(0);
        }
    }

    private synchronized void T() {
        this.i = 0;
        this.ar = this.J();
        this.p = this.o();
        this.q = this.l();
        this.J();
        this.J();
        this.J();
        this.o();
        this.I = this.I();
        int n = this.o();
        if (n > 0) {
            byte[] byArray = this.Code = new byte[n];
            B b = this;
            System.arraycopy(b.I, b.i, byArray, 0, n);
            b.i += n;
        }
        this.b = this.I();
        this.a = this.Code;
        this.Code = this.B();
        n = this.J();
        this.c = n & 1;
        this.a = (n & 6) >>> 1;
        int n2 = n & 0x10;
        this.b = (n2 | -n2) >>> 31;
        if (this.Code != null) {
            this.B();
        }
        if (this.ar >= 12) {
            this.R = this.J();
            this.S = this.l();
        }
        if (!this.c && this.Code.Code != null && this.Code.Code != this.Code.I) {
            this.r = this.t = this.Code.Code.r;
            this.s = this.u = this.Code.Code.s;
            this.T = this.Code.Code.T;
            this.U = this.Code.Code.U;
            this.Code.Code = true;
            this.I(false);
        }
        this.Z = null;
        this.I = new Hashtable();
        this.ao = this.i;
        this.U();
    }

    final void Code(boolean bl) {
        if (bl) {
            this.Code = null;
        }
        if (this.Code == null) {
            this.I((Integer)null, (Image)null);
            return;
        }
        f.Code = true;
        this.I(this.Code, this.Code(this.Code));
    }

    final synchronized void Code(int n) {
        if (n > 0) {
            this.Z.clear();
            return;
        }
        if (n >= 0) {
            Hashtable hashtable = new Hashtable();
            Enumeration enumeration = this.B.keys();
            while (enumeration.hasMoreElements()) {
                Integer n2 = (Integer)enumeration.nextElement();
                Integer n3 = (Integer)this.B.get(n2);
                if (!this.Z.containsKey(n3) || !this.Code((int)n2, false, true)) continue;
                hashtable.put(n3, this.Z.get(n3));
            }
            this.Z = hashtable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final synchronized void B(boolean bl) {
        Object object = this;
        if (((B)object).aj <= 0 || ((B)object).Code.I != null || ((B)object).e) {
            return;
        }
        this.a(bl);
        this.i = this.aj;
        this.b = this.I[this.i];
        this.c = null;
        int n = this.r();
        switch (this.b) {
            case 42: 
            case 76: {
                this.Code.Code(this.B(), this.Code, this.Code(), this.I);
                return;
            }
            case 83: {
                this.B = this.I();
                this.r = true;
                this.i = n;
                this.Code(this.I(), true);
                return;
            }
            case 73: {
                this.i += 2;
                this.i = this.l();
                this.i += 15;
                this.b = this.J();
                int n2 = this.J();
                this.B = this.I();
                object = this.I();
                if ((n2 & 8) != 0) {
                    object = "";
                }
                String string = (String)this.Code.get(this.B);
                Object object2 = string;
                if (this.B.equals("http://m.yahoo.com/opera/search?p=")) {
                    Code.Code.I(g.I(109));
                    return;
                }
                if (this.B.equals("$")) {
                    Code.Code.I("dialog:" + g.I(54));
                    return;
                }
                if (object2 == null) {
                    object2 = object;
                }
                int n3 = 0;
                switch (n2 & 0x30) {
                    case 16: {
                        n3 = 2;
                        break;
                    }
                    case 32: {
                        n3 = 3;
                        break;
                    }
                    case 48: {
                        n3 = 4;
                    }
                }
                this.r = n2 & 1;
                switch (this.b) {
                    case 83: 
                    case 85: 
                    case 120: {
                        if (n3 == 4) {
                            if (g.b() != 0 && g.Code(this.Code) == 65 && !g.ao) {
                                this.Code.b();
                                Code.Code.Code("", null, 16, this.Code);
                                return;
                            }
                            Code.Code.J((String)object2);
                            return;
                        }
                        Code.Code(null, (String)object2, n3, this.c != null && this.c.length() > 0);
                        return;
                    }
                    case 112: {
                        if (g.v) {
                            Code.Code(null, (String)object2, n3, false);
                            return;
                        }
                        Code.Code(null, (String)object2, n3 | 0x10000, false);
                        return;
                    }
                    case 97: {
                        Code.Code(null, (String)object2, 0, false);
                        return;
                    }
                    case 99: {
                        this.Code((String)(string != null ? null : object), false);
                        return;
                    }
                    case 114: {
                        this.Code((String)object, false);
                        return;
                    }
                    case 115: {
                        object = new StringBuffer();
                        g.Code(((StringBuffer)object).append("a="), (String)object2);
                        ((StringBuffer)object).append("&b=").append(n2 & 4);
                        this.au = this.l();
                        this.Code.Code("dialog:" + g.I(112), this.Code, ((StringBuffer)object).toString());
                        return;
                    }
                    case 102: {
                        this.Code.Code(true, this.Code, "s=0");
                        return;
                    }
                    case 70: {
                        if (!this.Code()) return;
                        C.Code("/");
                        this.Code.Code(true, this.Code, "s=1");
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 119: {
                if (g.am) {
                    g.I(this.B());
                    return;
                }
                if (g.W) {
                    this.e = true;
                    String string = this.B();
                    int n4 = this.Code(this.aj, 'o');
                    String string2 = n4 >= 0 ? g.Code(this.I, n4) : string;
                    String string3 = string.substring(string.lastIndexOf(47) + 1);
                    int n5 = string3.indexOf(63);
                    if (n5 > 0) {
                        string3 = string3.substring(0, n5);
                    }
                    Object[] objectArray = new Object[7];
                    Object[] objectArray2 = objectArray;
                    objectArray[0] = string3;
                    objectArray2[2] = this.c;
                    objectArray2[3] = string2;
                    objectArray2[4] = string;
                    f f2 = new f(47);
                    new f(47).Code = objectArray2;
                    f2.Code = this.Code;
                    f2.B = this.Code;
                    f2.Code = this;
                    g.Code(f2);
                    return;
                }
            }
            case 80: 
            case 87: 
            case 105: {
                g.I(this.B());
                return;
            }
            case 78: {
                this.i += 2;
                this.Code.Code(this.o(), this.l(), this.I());
                return;
            }
            case 67: {
                this.W();
                this.aj = this.Code(this.T, this.U, 1, 1, 0, false);
            }
        }
    }

    final boolean Code(boolean bl) {
        if (!this.Code.Code(2) && this.Code.I == null && this.Code != null && !this.Code.startsWith("myopera:") && !this.Code.startsWith("sk:") && !this.Code.startsWith("server:") && (!this.Code() || g.Code(this.Code) == 90 && g.Code(this.Code(this.aj, 76), "bookmark:") || g.Code(this.Code) == 91 && g.Code(this.Code(this.aj, 76), "speeddial:") || g.Code(this.Code) == 109 && g.Code(this.Code(this.aj, 76), "search:")) && g.az) {
            this.a(bl);
            this.Code.Code("menu:" + g.I(123), null, null);
            return true;
        }
        return false;
    }

    private void a(int n, int n2) {
        this.e = this.Z(this.e);
        this.f = this.Z(this.f);
        this.g = this.Z(this.g);
        this.h = this.Z(this.h);
        if (this.g == 0) {
            this.g = 1;
        }
        if (this.h == 0) {
            this.h = 1;
        }
        this.e += n;
        this.f += n2;
    }

    private boolean C() {
        return this.m || this.p <= this.Code.Code();
    }

    final void f() {
        this.w = this.x;
        this.r = this.t;
        this.s = this.u;
    }

    private Image Code(Integer n) {
        int n2 = (n & 0x40000000) != 0 ? 256 * this.Code.Code() / this.p : 256;
        int n3 = n & 0x1FFFFFFF;
        int n4 = g.I(this.I, n3);
        return g.Code(this.I, n3 + 2, n4, n2, null);
    }

    final void j() {
        switch (this.Code) {
            case 'r': {
                this.Code.Code(this.C, this.C.equals(this.Code) ? this.Code : null);
                return;
            }
            case 'u': {
                this.Code.Code(false, false, this.Code);
                return;
            }
            case 'l': {
                this.Code.Code(true, false, this.Code);
                return;
            }
        }
    }

    static {
        o = 16;
        aE = Math.max(25 + Font.getFont((int)64, (int)1, (int)16).getHeight(), 2 + (Font.getFont((int)64, (int)1, (int)16).getHeight() << 1));
        c = 6;
        d = -1;
        Code = new char[512];
        f = "";
        u = false;
        aJ = -1;
        aK = -1;
    }

    final void Code(String string, int n, Object object) {
        if (this.I == null) {
            this.I = new Hashtable();
        }
        this.I.put(this.B, new Object[]{string, new Integer(n), object});
        this.Code(string, false);
    }

    final synchronized boolean B() {
        if (this.aj == 0 || this.I[this.aj] != 73) {
            return false;
        }
        int n = this.i;
        this.i = this.aj;
        this.r();
        this.i += 2;
        this.i = this.l();
        this.i += 15;
        int n2 = this.J();
        this.i = n;
        return n2 == 120 || n2 == 97 || n2 == 112 || n2 == 102 || n2 == 70 || n2 == 115 || n2 == 85 || n2 == 83;
    }

    final void Z(int n) {
        if (n != 0) {
            this.c();
            this.Code.I();
            this.Code(0, 0 / n - this.e(), false, false);
            this.s = this.u;
        }
    }

    final void I(int n) {
        switch (n) {
            case 84: {
                this.i += 5;
                this.i = this.o() + this.i;
                return;
            }
            case 73: {
                this.i += 10;
                return;
            }
            case 66: {
                this.i += 4;
                return;
            }
            case 70: {
                this.i += 6;
                this.i = this.o() + this.i;
                this.i = this.o() + this.i + 3;
                return;
            }
            case 83: {
                this.i = this.l() + this.i;
                return;
            }
            case 76: {
                this.i += 9;
                return;
            }
            case 77: {
                ++this.i;
                this.i = this.l() + this.i;
            }
        }
    }

    private synchronized int Code(int n, char c) {
        int n2 = this.i;
        this.i = n;
        ++this.i;
        this.i = 10 * this.J() + this.i;
        this.i = this.o() + this.i;
        int n3 = -1;
        for (n = this.J(); n > 0; --n) {
            if (this.J() == c) {
                n3 = this.i;
            }
            this.i = this.o() + this.i;
        }
        this.i = n2;
        return n3;
    }

    final void e() {
        if (this.I()) {
            if (this.U >= this.q - this.Code.I()) {
                this.Code(0, this.Code.I() / 2 - this.U, false);
            } else if (this.I() && this.U < this.N) {
                this.Code(this.M + this.Code.Code() / 2 - this.T, this.N + this.Code.I() / 2 - this.U, false);
            } else {
                this.Code(0, this.q - this.Code.I() / 2 + this.J(1) - this.U, false);
            }
            Code.Code.I(false);
            return;
        }
        if (this.u >= this.q - this.Code.I()) {
            this.Z(false);
        } else if (this.u < this.N) {
            this.Code(this.M - this.t, this.N - this.u, false, false);
        } else {
            this.Code(0, this.q, false, false);
        }
        Code.Code.I(true);
    }

    private synchronized void Code(Integer n, Image image) {
        if (image != null) {
            this.Z.put(n, image);
            return;
        }
        this.J.put(n, n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private synchronized Image Code(int var1_1, int var2_5, int var3_7) {
        block12: {
            block14: {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    block15: {
                                        block13: {
                                            if (var1_1 < -9000 && var1_1 > -11000) {
                                                return null;
                                            }
                                            var4_9 = 256;
                                            if (this.w < 128) {
                                                var4_9 = 256 * this.Code.Code() / this.p;
                                            }
                                            v0 = var4_9 - 256;
                                            var3_8 = new Integer(var1_1 | ((v0 | -v0) >>> 31 ^ 1) * 0x20000000 | (var4_9 == 256 || (var3_7 & 4) != 0 ? 0 : 0x40000000));
                                            if (this.J.containsKey(var3_8)) {
                                                return null;
                                            }
                                            if (this.Z.containsKey(var3_8)) {
                                                return (Image)this.Z.get(var3_8);
                                            }
                                            if (var1_1 >= 0) break block12;
                                            if (var1_1 <= -1000) break block13;
                                            v1 = var1_1 <= -43 && var1_1 >= -46 ? Code.Code.Code(-43 - var1_1) : (var1_1 == -41 ? Code.Code.Code : g.Code(g.Code(-var1_1), (Object)("" + var1_1)));
                                            break block14;
                                        }
                                        if (var1_1 <= -3000) break block15;
                                        v2 = var1_1 <= -2000 ? g.c : g.J;
                                        if (var1_1 <= -2000) {
                                            v3 = -2000;
                                            v4 = var1_1;
                                        } else {
                                            v3 = -1000;
                                            v4 = var1_1;
                                        }
                                        v5 = (byte[])g.Code(v2, v3 - v4)[2];
                                        v1 = g.Code(v5, (Object)v5);
                                        break block14;
                                    }
                                    if (-3000 - var1_1 >= Code.I.size() || -3000 - var1_1 < 0) break block16;
                                    v6 = (byte[])((Object[])Code.I.elementAt(-3000 - var1_1))[2];
                                    v1 = g.Code(v6, (Object)v6);
                                    break block14;
                                }
                                if (-4000 - var1_1 == -1) ** GOTO lbl-1000
                                if (-4000 - var1_1 >= g.a.size() || -4000 - var1_1 < 0) break block17;
                                v7 = (byte[])((Object[])g.a.elementAt(-4000 - var1_1))[2];
                                v1 = g.Code(v7, (Object)v7);
                                break block14;
                            }
                            if (-5000 - var1_1 >= g.d.size() || -5000 - var1_1 < 0) break block18;
                            v8 = (byte[])((Object[])g.d.elementAt(-5000 - var1_1))[2];
                            v1 = g.Code(v8, (Object)v8);
                            break block14;
                        }
                        if (-7000 - var1_1 >= g.I.size() || -7000 - var1_1 < 0) break block19;
                        if (!g.p) ** GOTO lbl-1000
                        v9 = (byte[])((Object[])g.I.elementAt(-7000 - var1_1))[2];
                        var1_2 /* !! */  = (Image)v9;
                        var2_6 = g.Code(v9, 0, ((Image)var1_2 /* !! */ ).length, 256, null);
                        v1 = var2_6.getWidth() == 1 && var2_6.getHeight() == 1 ? var2_6 : g.Code((byte[])var1_2 /* !! */ , var1_2 /* !! */ );
                        break block14;
                    }
                    if (-8000 - var1_1 >= g.b.size() || -8000 - var1_1 < 0) break block20;
                    v10 = (byte[])((Object[])g.b.elementAt(-8000 - var1_1))[2];
                    v1 = g.Code(v10, (Object)v10);
                    break block14;
                }
                if ((-11000 - var1_1 >= g.Z.size() || -11000 - var1_1 < 0) && (-12000 - var1_1 >= g.Z.size() || -12000 - var1_1 < 0)) ** GOTO lbl-1000
                var2_5 = var1_1 <= -12000 ? 1 : 0;
                v11 = (byte[])g.Code(var2_5 * -1000 + -11000 - var1_1)[var2_5 + 2];
                var1_2 /* !! */  = (Image)v11;
                if (v11.length > 0) {
                    v1 = g.Code((byte[])var1_2 /* !! */ , var1_2 /* !! */ );
                } else lbl-1000:
                // 4 sources

                {
                    v1 = var1_2 /* !! */  = null;
                }
            }
            if (var4_9 != 256) {
                var1_2 /* !! */  = g.Code(var1_2 /* !! */ , 0, B.Code(var1_2 /* !! */ .getHeight(), var4_9), true);
            }
            this.Code(var3_8, var1_2 /* !! */ );
            return var1_2 /* !! */ ;
        }
        if (var2_5 == 0) {
            var1_3 = this.Code(var3_8);
            this.Code(var3_8, var1_3);
            return var1_3;
        }
        if (g.j) {
            if (var1_1 + 2 <= this.ap && var1_1 + g.I(this.I, var1_1) <= this.ap) {
                var1_4 = this.Code(var3_8);
                this.Code(var3_8, var1_4);
                return var1_4;
            }
            this.a();
            return null;
        }
        this.B.put(new Integer(var2_5 | var3_8 & 0x60000000), var3_8);
        f.Code(this);
        return null;
    }

    final boolean J() {
        return this.I() && this.w == this.x && this.U >= this.Q;
    }

    final void Code(Graphics graphics, int n, int n2) {
        int n3;
        int n4 = this.w;
        if (this.U < this.Q || this.ag != 0) {
            this.w = 256;
        }
        int n5 = n3 = this.d || this.I[this.aj] == 42 || g.Code(this.Code) == 73 || g.Code(this.Code) == 135 && this.aj != this.ah ? 1 : 0;
        if (this.Code.Code(2) || this.d && this.Code.Code(8)) {
            this.s = (Code.Code[36] & 0xFF) > 127;
            this.Code(graphics, n, n2, Code.Code[8], Code.Code[9], 0, true, false);
            this.s = false;
        } else if (Code.Code(g.I(66)) == null && (this.d || this.ag > 0 || this.C() || !this.I() && Code.Code(this) && !Code.Code.I())) {
            if (n3 != 0) {
                this.Code(graphics, n, n2, Code.Code[11], Code.Code[12], 0, true, true);
            } else {
                int n6 = n3 = this.I[this.aj] == 73 ? 0 : 0x29000000 | Code.Code[21] & 0xFFFFFF;
                int n7 = 0xFF000000 | Code.Code[21];
                this.Code(graphics, n, n2, n6, n6, n7, false, false);
            }
        }
        this.w = n4;
    }

    private void X() {
        if (!this.C()) {
            this.aj = this.Code(this.T, this.U, 1, 1, 0, false);
        }
    }

    final void b() {
        if (!this.Z()) {
            this.x = 256;
            this.f();
            return;
        }
        if (this.w != 256 && 256 * this.Code.Code() / this.p != this.w) {
            this.x = 256 * this.Code.Code() / this.p;
            this.f();
        }
    }

    private void U() {
        this.C = new int[9];
        this.C[1] = this.q;
        this.C[2] = 6;
        this.C[4] = 3;
        this.O = 1;
    }

    final int I() {
        if (this.C == 2) {
            this.aI = Math.min(this.aI + Math.max((this.aH * 10 - this.aI) / 5, 0) + 4, 1000);
            return this.aI + 250;
        }
        return this.as / 3 + (this.Z() << 1) / 3;
    }

    final int Code() {
        if (this.C == 2) {
            return 4375;
        }
        return this.as;
    }

    final int J() {
        return this.I[this.i++] & 0xFF;
    }

    final int Z() {
        if (this.Code != null) {
            return this.Code.a();
        }
        return 0;
    }

    private int o() {
        this.i += 2;
        return g.I(this.I, this.i - 2);
    }

    private int Z(int n) {
        return n * this.w + 255 >> 8;
    }

    private int l() {
        this.i += 3;
        return g.J(this.I, this.i - 3);
    }

    private int m() {
        return this.l() << 8 >> 8;
    }

    private int n() {
        B b = this;
        b.i += 4;
        int n = g.Z(b.I, b.i - 4);
        if (this.s && n >>> 24 != 254) {
            n = n & 0xFF000000 | 0xFFFFFF - (n & 0xFFFFFF);
        }
        return n;
    }

    private String B() {
        String string = this.I();
        if (string != null && string.length() > 0 && string.charAt(0) == '\u0000') {
            return this.b + string.substring(1, string.length());
        }
        return string;
    }

    final int a() {
        return this.q;
    }

    final int i() {
        return this.Code.I() - o;
    }

    final void C() {
        this.e = this.o();
        this.f = this.l();
        this.g = this.o();
        this.h = this.l();
    }

    final String I() {
        String string = g.Code(this.I, this.i);
        this.i = this.o() + this.i;
        return string;
    }

    private synchronized void a(boolean bl) {
        int n;
        if (!this.C() || bl) {
            return;
        }
        int n2 = -1;
        int n3 = -1;
        int n4 = 0;
        this.i = this.aj + 1;
        for (int i = this.J(); i > 0; --i) {
            this.C();
            this.f = this.B(this.f);
            int n5 = Math.min(this.f + this.h, this.s + this.Code.I()) - Math.max(this.f, this.s);
            if (n5 <= n4) continue;
            n4 = n5;
            n = this.e + this.g / 2;
            n3 = this.f + this.h / 2;
        }
        this.T = n;
        this.U = n3;
    }

    private synchronized int I(int n) {
        this.i = n;
        block13: while (this.i < this.I.length && this.ap == this.I.length || this.i < this.ap - 16) {
            int n2 = this.i;
            int n3 = this.J();
            block0 : switch (n3) {
                case 83: {
                    this.i = this.l() + this.i;
                    break;
                }
                case 76: {
                    n = this.l();
                    if (this.C() && n > 0) {
                        this.aj = n;
                    }
                    this.ah = this.l();
                    this.ai = this.l();
                    if (this.Code == null || this.Code.J() || this.a == null || this.a.equals(g.C)) break;
                    this.aj = 0;
                    this.ah = 0;
                    this.ai = 0;
                    break;
                }
                case 77: {
                    int n4;
                    n2 = this.J();
                    n3 = this.l();
                    if (this.i + n3 > this.ap) {
                        return n;
                    }
                    switch (n2) {
                        case 115: {
                            if (this.ar >= 13) {
                                n = this.i + n3;
                                this.Code = this.Code(n);
                                this.B = this.Code(n);
                                this.I = this.Code(n);
                                break;
                            }
                            this.Code = this.J();
                            this.I = this.J();
                            break;
                        }
                        case 67: {
                            this.O = (n3 -= 8) / 6;
                            this.C = new int[(this.o() << 1) + this.O * 7];
                            this.P = this.J();
                            this.M = this.o();
                            this.N = this.l();
                            n = 0;
                            if (this.Code != null && this.Code.indexOf(35) != -1) {
                                n = 1;
                            }
                            if (this.c && !this.Code) {
                                if (this.I()) {
                                    this.Code(this.M + this.Code.Code() / 2 - this.T, this.N + this.Code.I() / 2 - this.U, true);
                                } else if (this.Z() || !g.aw || n != 0) {
                                    this.Code(this.M - this.t, this.N - this.u, false, true);
                                }
                                this.f();
                            }
                            n = this.O * 6;
                            n2 = 0;
                            n3 = 0;
                            while (n3 / 6 < this.O) {
                                n4 = this.l();
                                this.C[n3++] = n2;
                                this.C[n3++] = n4;
                                this.C[n3++] = n;
                                int n5 = ++n3;
                                ++n3;
                                this.C[n5] = this.J();
                                ++n3;
                                n += 2 * this.o() + 1;
                                n2 += n4;
                            }
                            this.V();
                            break;
                        }
                        case 84: {
                            this.al = n3 / 12;
                            this.a = new int[n3];
                            for (n = 0; n < this.al << 2; ++n) {
                                this.a[n] = this.l();
                            }
                            break block0;
                        }
                        case 83: {
                            this.Code = new String[7];
                            for (n = 0; n < 7; ++n) {
                                this.Code[n] = this.I();
                            }
                            break block0;
                        }
                        case 80: {
                            this.J();
                            break;
                        }
                        case 82: {
                            n = this.J();
                            int n6 = n & 4;
                            this.j = (n6 | -n6) >>> 31;
                            if (this.j) {
                                g.Code = g.Code();
                            }
                            int n7 = n & 2;
                            this.i = (n7 | -n7) >>> 31;
                            B b = this;
                            if ((n & 8) != 0) {
                                b.C = true;
                                break;
                            }
                            b.C = false;
                            break;
                        }
                        default: {
                            this.i += n3;
                            break;
                        }
                    }
                    break;
                }
                default: {
                    this.C();
                    this.I(n3);
                    if (this.i > this.ap) break block13;
                    if (!this.a) {
                        this.e = (short)this.e + this.aF;
                        this.f = (this.f << 8 >> 8) + this.aG;
                        g.Code(this.e, this.I, n2 + 1);
                        g.Z(this.f, this.I, n2 + 3);
                        this.aF = this.e;
                        this.aG = this.f;
                    }
                    n = this.i;
                    B b = this;
                    int n4 = b.I(b.f, 0);
                    do {
                        int n8 = b.C[n4 * 6 + 2];
                        while (b.C[n8 + 2] != 0) {
                            n8 += 2;
                        }
                        if (b.C[n8] == 0) {
                            b.C[n8] = n2;
                        } else if (b.C[n8 + 1] + b.P < n2) {
                            b.C[n8 += 2] = n2;
                        }
                        b.C[n8 + 1] = n;
                    } while (++n4 < b.O && b.f + b.h > b.C[n4 * 6]);
                    this.I(this.e, this.f, this.g, this.h);
                }
            }
            n = this.i;
        }
        return n;
    }

    final void I(boolean bl) {
        if (bl) {
            if (this.Z()) {
                this.x = 256 * this.Code.Code() / this.p;
                this.E = this.w;
                this.F = (int)System.currentTimeMillis();
                f.I = true;
                this.b(0, this.U >= this.Q ? this.Code(this.U, -this.Code.I() / 2, this.x) : this.u);
            } else if (!this.I()) {
                this.x = 256;
                this.f();
            }
        } else if (this.I()) {
            this.x = 256;
            this.E = this.w;
            this.F = (int)System.currentTimeMillis();
            f.I = true;
            if (this.U >= this.Q) {
                int n = this.Code.Code();
                int n2 = this.Code.I();
                n2 = g.Code(this.U - n2 / 2, this.Q, this.q - n2);
                int n3 = g.Code(this.J(this.Z(this.T, n2), this.T - n / 2), 0, this.p - n);
                this.b(n3, n2);
                this.X();
            }
        }
        this.a();
    }

    private int Code(int n) {
        if (this.i == n) {
            return 23;
        }
        switch (this.J()) {
            case 99: {
                return this.J();
            }
            case 117: {
                this.J();
                this.i = this.o() + this.i;
                return 23;
            }
            case 115: {
                this.i = this.o() + this.i;
                this.i = this.o() + this.i;
                return 23;
            }
            case 108: {
                this.i = this.o() + this.i;
                this.J();
                return 23;
            }
        }
        this.i = n;
        return 23;
    }

    private void I(Graphics graphics, int n, int n2, int n3, int n4) {
        if (n4 < 0) {
            return;
        }
        g.Code(graphics, n, n2 += this.Z(this.C[n3 * 6 + 5]), this.p, this.C[n4 * 6] + this.C[n4 * 6 + 1]);
        n2 -= this.Z(this.C[n3 * 6]);
        this.i = 0;
        while (true) {
            int n5;
            int n6;
            int n7 = Integer.MAX_VALUE;
            block1: for (n6 = n3; n6 <= n4; ++n6) {
                n5 = this.C[n6 * 6 + 3];
                while (this.C[n5] != 0) {
                    this.C[n6 * 6 + 3] = n5;
                    if (this.C[n5 + 1] > this.i) {
                        n7 = g.Code(n7, this.i, this.C[n5]);
                        continue block1;
                    }
                    n5 += 2;
                }
            }
            if (n7 == Integer.MAX_VALUE) break;
            n6 = n7;
            do {
                n5 = n6;
                for (int i = n3; i <= n4; ++i) {
                    int n8 = this.C[i * 6 + 3];
                    while (this.C[n8] != 0 && this.C[n8] <= n6 + this.P) {
                        this.C[i * 6 + 3] = n8;
                        n6 = Math.max(n6, this.C[n8 + 1]);
                        n8 += 2;
                    }
                }
            } while (n5 != n6);
            this.Z(graphics, n, n2, n7, n6);
        }
        g.Z(graphics);
    }

    private void V() {
        int n = 0;
        this.Q = 0;
        for (int i = 0; i < this.O; ++i) {
            this.C[i * 6 + 5] = n;
            if ((this.C[i * 6 + 4] & 1) == 0) continue;
            n += this.C[i * 6 + 1];
            if ((this.C[i * 6 + 4] & 2) != 0) continue;
            this.Q += this.C[i * 6 + 1];
        }
        this.q = n;
    }

    private void W() {
        int n = this.o() + this.i;
        while (this.i < n) {
            int n2 = this.J();
            int n3 = this.o();
            this.C[n3 * 6 + 4] = this.C[n3 * 6 + 4] & 0xFFFFFFFE | n2;
        }
        this.V();
        this.a();
    }

    private int J(int n) {
        return (n << 8) / this.w;
    }

    private boolean Code(Graphics graphics) {
        return g.Code(this.e, this.f, this.g, this.h, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight());
    }

    private boolean Code(int n, boolean bl, boolean bl2) {
        boolean bl3;
        n &= 0x1FFFFFFF;
        int n2 = this.e;
        int n3 = this.f;
        int n4 = this.g;
        int n5 = this.h;
        int n6 = this.i;
        int n7 = this.w;
        int n8 = this.r;
        int n9 = this.s;
        if (bl2) {
            int n10 = this.w = 256 * this.Code.Code() / this.p;
            this.r = g.Code(this.r, 0, this.p - (this.Code.Code() << 8) / n10);
            int n11 = this.w;
            this.s = g.Code(this.s, 0, this.q - (this.Code.I() << 8) / n11);
        }
        this.i = n;
        this.C();
        this.f = this.B(this.f);
        boolean bl4 = false;
        if (this.f >= 0) {
            this.a(-this.Z(this.r), -this.Z(this.s));
            bl3 = g.Code(this.e, this.f, this.g, this.h, 0, 0, this.Code.Code(), this.Code.I());
            if (bl3 && bl) {
                this.i = n;
                this.C();
                this.I(this.e, this.f, this.g, this.h);
                this.c(1000);
            }
        }
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = n5;
        this.i = n6;
        this.w = n7;
        this.r = n8;
        this.s = n9;
        return bl3;
    }

    private synchronized void I(int n, int n2, int n3, int n4) {
        if (this.K > 0 && this.L > 0) {
            int n5 = this.G + this.K;
            this.G = Math.min(this.G, n);
            this.K = Math.max(n + n3, n5) - this.G;
            n = this.H + this.L;
            this.H = Math.min(this.H, n2);
            this.L = Math.max(n2 + n4, n) - this.H;
            return;
        }
        this.G = n;
        this.H = n2;
        this.K = n3;
        this.L = n4;
    }

    final void a() {
        this.I(0, 0, Math.max(this.p, this.Code.Code()), Math.max(this.q, this.Code.I()));
    }

    private void c(int n) {
        if (this.K > 0 && (int)System.currentTimeMillis() - this.at >= n) {
            this.at = (int)System.currentTimeMillis();
            g.a();
        }
    }

    final void Code(int n, int n2) {
        this.e = this.G;
        this.f = this.B(this.H);
        this.g = this.K;
        this.h = this.L;
        if (this.K > 0 && this.L > 0) {
            this.a(n, n2);
            this.f += this.Q - this.Z(this.Q);
            if (this.f < this.Q) {
                this.f = 0;
                this.h += this.Q;
                this.g += this.K;
            }
        }
        this.K = 0;
        this.L = 0;
    }

    final int d() {
        return this.Z(this.r);
    }

    final boolean I() {
        return this.w != 256 && 256 * this.Code.Code() / this.p <= this.w;
    }

    final int b() {
        return this.Z(this.p);
    }

    final boolean Z() {
        return !this.I() && !this.Code() && this.p != 0 && this.Code.Code() != 0 && 256 * this.Code.Code() / this.p < 128;
    }

    final int e() {
        if (this.s < this.Q) {
            return this.s;
        }
        return this.Z(this.s - this.Q) + this.Q;
    }

    final int f() {
        if (this.U < this.Q) {
            return this.T - this.d();
        }
        return this.Z(this.T - this.r);
    }

    final int B() {
        return this.n;
    }

    final int C() {
        return this.p;
    }

    final int c() {
        return this.Z(this.q - this.Q) + this.Q;
    }

    final int g() {
        if (this.U < this.Q) {
            return this.U - this.e();
        }
        if (this.s < this.Q) {
            return this.Z(this.U - this.Q) - this.s + this.Q;
        }
        return this.Z(this.U - this.s);
    }

    private int Code(int n, int n2, int n3) {
        if (n < this.Q && n + n2 < this.Q) {
            return n + n2;
        }
        if (n < this.Q) {
            return this.Q + (n2 - (this.Q - n) << 8) / n3;
        }
        if (n + (n2 << 8) / n3 < this.Q) {
            return this.Q + (n2 + B.Code(n - this.Q, n3));
        }
        return n + (n2 << 8) / n3;
    }

    final int h() {
        return this.Code.Code();
    }

    private static int Code(int n, int n2) {
        return n * n2 + 255 >> 8;
    }

    private int B(int n) {
        int n2 = this.I(n, 0);
        if ((this.C[n2 * 6 + 4] & 1) == 0) {
            return -1;
        }
        return n - this.C[n2 * 6] + this.C[n2 * 6 + 5];
    }

    private synchronized int I(int n, int n2) {
        int n3 = -1;
        int n4 = this.O;
        while (n4 - n3 > 1) {
            int n5 = n3 + n4 >>> 1;
            if (this.C[n5 * 6 + n2] > n) {
                n4 = n5;
                continue;
            }
            n3 = n5;
        }
        for (n = Math.max(n3, 0); n > 0 && this.C[n * 6 + n2] == this.C[(n - 1) * 6 + n2]; --n) {
        }
        if (n2 == 5) {
            while ((this.C[n * 6 + 4] & 1) == 0) {
                ++n;
            }
        }
        return n;
    }

    final void I(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        if (this.J()) {
            n4 = this.Code.Code();
            int n5 = this.Code.I();
            int n6 = g.Code(this.U - n5 / 2, this.Q, this.q - n5);
            int n7 = n + this.Z(g.Code(this.J(this.Z(this.T, n6), this.T - n4 / 2), 0, this.p - n4));
            n6 = this.s < this.Q ? n2 + this.Z(n6 - this.Q) - this.s + this.Q : n2 + this.Z(n6 - this.s);
            n4 = this.Z(n4) - 1;
            n5 = this.Z(n5) - 1;
            if (g.r && Code[5] != null) {
                n4 = n6;
                n5 = n7;
                Graphics graphics2 = graphics;
                B b = this;
                int n8 = b.Z(b.Code.Code());
                n7 = b.Z(b.Code.I());
                int n9 = n8 > 9 ? n8 - 9 : 1;
                int n10 = n7 > 9 ? n7 - 9 : 1;
                int n11 = n8 > 9 ? 30 : n8 + 21;
                int n12 = n7 > 9 ? 30 : n7 + 21;
                g.Code(graphics2, n5 - 21, n4 - 21, n11, n12);
                graphics2.drawImage(Code[5], n5 - 21, n4 - 21, 0);
                g.Z(graphics2);
                g.Code(graphics2, n5 + n9, n4 - 21, 30, n12);
                graphics2.drawImage(Code[5], n5 + n8 - 59, n4 - 21, 0);
                g.Z(graphics2);
                g.Code(graphics2, n5 - 21, n4 + n10, n11, 30);
                graphics2.drawImage(Code[5], n5 - 21, n4 + n7 - 63, 0);
                g.Z(graphics2);
                g.Code(graphics2, n5 + n9, n4 + n10, 30, 30);
                graphics2.drawImage(Code[5], n5 + n8 - 59, n4 + n7 - 63, 0);
                g.Z(graphics2);
                if (n9 > 1) {
                    n9 = (n8 - 18) / 19;
                    if (n9 > 0) {
                        for (n11 = 0; n11 < n9; ++n11) {
                            g.Code(graphics2, n5 + 9 + n11 * 19, n4 - 21, 19, 30);
                            graphics2.drawImage(Code[5], n5 - 21 + n11 * 19, n4 - 21, 0);
                            g.Z(graphics2);
                            g.Code(graphics2, n5 + 9 + n11 * 19, n4 + n7 - 9, 19, 30);
                            graphics2.drawImage(Code[5], n5 - 21 + n11 * 19, n4 + n7 - 63, 0);
                            g.Z(graphics2);
                        }
                    }
                    if ((n11 = n8 - 18 - n9 * 19) > 0) {
                        g.Code(graphics2, n5 + 9 + n9 * 19, n4 - 21, n11, 30);
                        graphics2.drawImage(Code[5], n5 - 21 + n9 * 19, n4 - 21, 0);
                        g.Z(graphics2);
                        g.Code(graphics2, n5 + 9 + n9 * 19, n4 + n7 - 9, n11, 30);
                        graphics2.drawImage(Code[5], n5 - 21 + n9 * 19, n4 + n7 - 63, 0);
                        g.Z(graphics2);
                    }
                }
                if (n10 > 1) {
                    n9 = (n7 - 18) / 24;
                    if (n9 > 0) {
                        for (n10 = 0; n10 < n9; ++n10) {
                            g.Code(graphics2, n5 - 21, n4 + 9 + n10 * 24, 30, 24);
                            graphics2.drawImage(Code[5], n5 - 21, n4 - 22 + n10 * 24, 0);
                            g.Z(graphics2);
                            g.Code(graphics2, n5 + n8 - 9, n4 + 9 + n10 * 24, 30, 24);
                            graphics2.drawImage(Code[5], n5 + n8 - 59, n4 - 22 + n10 * 24, 0);
                            g.Z(graphics2);
                        }
                    }
                    if ((n10 = n7 - 18 - n9 * 24) > 0) {
                        g.Code(graphics2, n5 - 21, n4 + 9 + n9 * 24, 30, n10);
                        graphics2.drawImage(Code[5], n5 - 21, n4 - 22 + n9 * 24, 0);
                        g.Z(graphics2);
                        g.Code(graphics2, n5 + n8 - 9, n4 + 9 + n9 * 24, 30, n10);
                        graphics2.drawImage(Code[5], n5 + n8 - 59, n4 - 22 + n9 * 24, 0);
                        g.Z(graphics2);
                    }
                }
                if (g.D) {
                    graphics2.setColor(0);
                    graphics2.drawRect(n5, n4, n8 - 1, n7 - 1);
                    graphics2.setColor(0xFFFFFF);
                    graphics2.drawRect(n5 + 1, n4 + 1, n8 - 3, n7 - 3);
                }
                n3 = 2;
            } else {
                graphics.setColor(0);
                graphics.drawRect(n7, n6, n4, n5);
                graphics.setColor(0xFFFFFF);
                graphics.drawRect(n7 + 1, n6 + 1, n4 - 2, n5 - 2);
                n3 = 2;
            }
        } else {
            if (this.C()) {
                g.Z(graphics);
                return;
            }
            B b = this.Code.Code();
            n3 = b != null && b.C < 5 || f.Code ? (this.aj > 0 ? 4 : 3) : (this.aj > 0 ? 1 : 0);
        }
        n4 = n3;
        g.Z(graphics);
        if (this.Code.Z) {
            n4 = 0;
        }
        graphics.drawImage(Code[n4], this.Code.C() + n - 5, this.Code.a() + n2 - 3, 20);
    }

    private void Z(Graphics graphics, int n, int n2, int n3, int n4) {
        this.i = n3;
        block16: while (this.i < n4) {
            n3 = this.i;
            int n5 = this.J();
            if (n5 == 83 || n5 == 76 || n5 == 77) {
                this.I(n5);
                continue;
            }
            this.C();
            int n6 = this.h;
            this.a(n, n2);
            if (this.Code(graphics)) {
                String string;
                int n7 = this.n();
                switch (n5) {
                    default: {
                        continue block16;
                    }
                    case 84: {
                        Object object;
                        n5 = g.I(this.J());
                        int n8 = this.o();
                        char[] cArray = Code;
                        if (n8 > Code.length) {
                            cArray = new char[n8];
                        }
                        int n9 = g.Code(this.I, this.i, cArray, 0, n8);
                        if (this.Code() && cArray[0] == '\u0000') {
                            int n10 = cArray[1] - 32;
                            Object object2 = null;
                            if (n10 >= 10000 && n10 < 10000 + g.B.size()) {
                                object2 = (C)g.B.elementAt(n10 - 10000);
                                StringBuffer stringBuffer = new StringBuffer();
                                object = stringBuffer;
                                g.Code(stringBuffer, ((C)object2).Code, ((C)object2).I);
                                object2 = ((StringBuffer)object).toString();
                                if (!g.B()) {
                                    int n11 = g.Code(n5, (String)object2);
                                    this.e = this.ax + this.j() - 6 - n11;
                                    this.g = n11;
                                }
                            }
                            if (n10 >= 20000 && n10 < 20000 + g.B.size()) {
                                C c = (C)g.B.elementAt(n10 - 20000);
                                if (Z == null) {
                                    String[] stringArray = new String[3];
                                    Z = stringArray;
                                    stringArray[0] = g.Code(173) + ".";
                                    B.Z[1] = g.Code(173) + "..";
                                    B.Z[2] = g.Code(173) + "...";
                                    e = g.Code(n5, g.Code(167), this.ax + this.j() - 6 - this.e, null);
                                }
                                if (c.I <= 0 && c.Code == 0) {
                                    object2 = Z[j];
                                } else if (c.Code == 2) {
                                    object2 = e;
                                }
                                if (g.B() && object2 != null) {
                                    int n12 = g.Code(n5, (String)object2);
                                    this.e = this.ax + this.j() + this.ay - 12 - 23 - n12;
                                    this.g = n12;
                                }
                            }
                            if ((this.g = g.Code(n5, cArray = object2 != null ? ((String)object2).toCharArray() : new char[]{' '}, 0, n9 = cArray.length)) != this.g) {
                                this.I[this.i - 12] = (byte)(this.g >> 8);
                                this.I[this.i - 11] = (byte)this.g;
                            }
                        }
                        this.Code(graphics, cArray, n9, n7, n5, n6);
                        if (this.I != null) {
                            Vector vector = this.I.Code(n3);
                            if (vector == null) {
                                this.i += n8;
                                continue block16;
                            }
                            for (n7 = 0; n7 < vector.size(); ++n7) {
                                object = (int[])vector.elementAt(n7);
                                int n13 = object[9] - this.aO;
                                int n14 = (n13 | -n13) >>> 31 ^ 1;
                                int n15 = n14 != 0 ? Code.Code[70] : Code.Code[68];
                                n14 = n14 != 0 ? Code.Code[69] : Code.Code[67];
                                graphics.setColor(n15);
                                n15 = this.e + object[3];
                                int n16 = this.f + object[4];
                                graphics.fillRect(n15, n16, (int)object[5], (int)object[6]);
                                g.Code(graphics, n15, n16, (int)object[5], (int)object[6]);
                                this.Code(graphics, cArray, n9, n14, n5, n6);
                                g.Z(graphics);
                            }
                        }
                        this.i += n8;
                        continue block16;
                    }
                    case 73: {
                        n3 = this.e - this.J();
                        n5 = this.f - this.J();
                        n6 = this.J();
                        int n17 = this.m();
                        int n18 = n6 & (this.w >= 128 ? 4 : 2);
                        int n19 = (n18 | -n18) >>> 31 ^ 1;
                        int n20 = n6 & 8;
                        int n21 = (n20 | -n20) >>> 31;
                        Image image = null;
                        if (this.S + n17 <= -9000 && this.S + n17 > -9000 - g.B.size()) {
                            C c = (C)g.B.elementAt(-(this.S + n17 - -9000));
                            if (n19 == 0 || c.I <= 0 || c.Code == 2) continue block16;
                            int n22 = (int)((long)this.g * (long)c.Code / (long)c.I);
                            Code.Code.Code(graphics, this.e, this.f, this.g, n22);
                            continue block16;
                        }
                        if (this.S + n17 <= -10000 && this.S + n17 > -10000 - g.B.size()) {
                            C c = (C)g.B.elementAt(-(this.S + n17 - -10000));
                            n17 = -43 - c.Code - this.S;
                        }
                        if (n19 != 0) {
                            image = this.Code(this.S + n17, this.i - 20, n6);
                        }
                        if (n19 != 0 && image != null) {
                            g.Code(graphics, this.e, this.f, this.g, this.h);
                            n6 = image.getWidth();
                            n7 = image.getHeight();
                            if (n3 + n6 < graphics.getClipX()) {
                                n3 = graphics.getClipX() - (graphics.getClipX() - n3) % n6;
                            }
                            if (n5 + n7 < graphics.getClipY()) {
                                n5 = graphics.getClipY() - (graphics.getClipY() - n5) % n7;
                            }
                            n17 = graphics.getClipX() + graphics.getClipWidth();
                            n19 = graphics.getClipY() + graphics.getClipHeight();
                            while (n3 < n17) {
                                for (n21 = n5; n21 < n19; n21 += n7) {
                                    graphics.drawImage(image, n3, n21, 20);
                                }
                                n3 += n6;
                            }
                            g.Z(graphics);
                            continue block16;
                        }
                        if (n19 == 0 && n21 == 0) continue block16;
                        g.Code(graphics, this.e, this.f, this.g, this.h, n7 | 0xFF000000, false);
                        continue block16;
                    }
                    case 66: {
                        g.Code(graphics, this.e, this.f, this.g, this.h, n7, false);
                        continue block16;
                    }
                    case 70: 
                }
                n3 = 0;
                n5 = 0;
                int n23 = this.J();
                int n24 = this.J();
                String string2 = this.I();
                String string3 = this.I();
                int n25 = this.l();
                String string4 = string = (String)this.Code.get(string2);
                if (string == null) {
                    string4 = string3;
                }
                char[] cArray = null;
                Image image = null;
                switch (n23) {
                    case 112: {
                        if (!this.I.contains(string2)) {
                            this.I.addElement(string2);
                        }
                        cArray = new char[string4.length()];
                        for (n23 = 0; n23 < cArray.length; ++n23) {
                            cArray[n23] = 42;
                        }
                        break;
                    }
                    case 97: {
                        cArray = string4.toCharArray();
                        n23 = 0;
                        n24 = 1;
                        boolean bl = true;
                        for (int i = 0; i < cArray.length; ++i) {
                            if (cArray[i] == '\n') {
                                n23 = 0;
                                continue;
                            }
                            if (cArray[i] != ' ') continue;
                            if (bl) {
                                bl = false;
                                n23 = g.Code(0, cArray, 0, i);
                            }
                            while (i + n24 < cArray.length && cArray[i + n24] != ' ') {
                                ++n24;
                            }
                            if (n23 + (n24 = g.Code(0, cArray, i, n24)) > this.g) {
                                cArray[i] = 10;
                                n23 = 0;
                            }
                            n23 += n24;
                            n24 = 1;
                        }
                        break;
                    }
                    case 70: {
                        String string5;
                        int n26;
                        if (!this.Code()) break;
                        cArray = (this.d != null ? this.d : string4).toCharArray();
                        if (!g.B() || (n26 = g.Code(0, string5 = new String(cArray))) >= this.g - 2) break;
                        n3 = this.e + (this.g - 2 - n26);
                        n5 = n26;
                        break;
                    }
                    case 83: 
                    case 85: 
                    case 120: {
                        String string6;
                        int n27;
                        cArray = string4.toCharArray();
                        if (string2.equals("$")) {
                            String string7;
                            int n28;
                            cArray = ((String)((Object[])Code.elementAt(d + 1))[1]).toCharArray();
                            if (!g.B() || (n28 = g.Code(0, string7 = new String(cArray))) >= this.g) break;
                            n3 = this.e + (this.g - n28);
                            n5 = n28;
                            break;
                        }
                        if (!string2.equals("a") || !g.B() || (n27 = g.Code(0, string6 = new String(cArray))) >= this.g) break;
                        n3 = this.e + (this.g - n27);
                        n5 = n27;
                        break;
                    }
                    case 99: {
                        int n29 = n24 & 2;
                        if (((string != null ? 1 : 0) ^ (n29 | -n29) >>> 31) == 0) break;
                        if (g.o) {
                            graphics.setColor(Code.Code[65]);
                            graphics.drawLine(this.e + 1, this.f + 1, this.e + this.g - 2, this.f + this.h - 2);
                            graphics.drawLine(this.e + 1, this.f + this.h - 2, this.e + this.g - 2, this.f + 1);
                            break;
                        }
                        if (I == null) break;
                        image = I[0];
                        break;
                    }
                    case 114: {
                        if (!(string != null ? string.equals(string3) : (n24 & 2) != 0)) break;
                        if (g.o) {
                            graphics.setColor(Code.Code[66]);
                            graphics.fillArc(this.e + 1, this.f + 1, this.g - 3, this.h - 3, -90, 360);
                            break;
                        }
                        if (I == null) break;
                        image = I[1];
                        break;
                    }
                    case 115: {
                        n23 = this.i;
                        this.i = n25;
                        string3 = "\u0000" + string4 + "\u0000";
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i = this.l(); i > 0; --i) {
                            boolean bl;
                            String string8 = this.I();
                            string4 = this.I();
                            boolean bl2 = bl = string3.indexOf("\u0000" + string8 + "\u0000") >= 0;
                            if ((n24 & 4) == 0) {
                                if (!bl) continue;
                                stringBuffer.append(string4).append("\n");
                                break;
                            }
                            if (bl) {
                                stringBuffer.append("*");
                            }
                            stringBuffer.append(string4).append("\n");
                        }
                        this.i = n23;
                        cArray = stringBuffer.toString().toCharArray();
                        if ((n24 & 0x40) != 0 && this.Code()) {
                            cArray = g.Code(0, stringBuffer.toString(), this.g, "...").toCharArray();
                            this.e = this.e + this.g - g.Code(0, cArray, 0, cArray.length);
                            break;
                        }
                        if ((n24 & 0x20) == 0 || !this.Code()) break;
                        cArray = g.Code(0, stringBuffer.toString(), this.g, "...").toCharArray();
                        break;
                    }
                    case 102: {
                        Object[] objectArray;
                        cArray = this.I != null && (objectArray = (Object[])this.I.get(string2)) != null ? (objectArray[0] + ", " + (Integer)objectArray[1] / 1000 + " kB").toCharArray() : g.Code(182).toCharArray();
                    }
                }
                if (cArray != null) {
                    int n30 = this.e;
                    n24 = this.g;
                    if (g.B() && (n3 != 0 || n5 != 0)) {
                        this.e = n3;
                        this.g = n5;
                    }
                    g.Code(graphics, this.e, this.f, this.g, this.h);
                    this.Code(graphics, cArray, cArray.length, n7, 0, n6);
                    this.e = n30;
                    this.g = n24;
                    g.Z(graphics);
                }
                if (image == null || this.w != 256) continue;
                graphics.drawImage(image, this.e + this.g / 2, this.f + this.h / 2, 3);
                continue;
            }
            this.I(n5);
        }
    }

    private void Code(Graphics graphics, char[] cArray, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8 = 1;
        int n9 = Math.max(n4 / g.J(n3), 1);
        for (n6 = 0; n6 < n && n8 <= n9; n8 += (n7 | -n7) >>> 31 ^ 1, ++n6) {
            n7 = cArray[n6] - 10;
        }
        n = n8;
        if (this.w >= 200) {
            graphics.setColor(n2);
        } else {
            if (b == null || b.length < 2 * Code.f) {
                c = null;
                d = null;
                b = null;
                c = new int[2 * Code.f];
                d = new int[c.length];
                b = new int[c.length];
                aJ = -1;
                aK = -1;
                Random random = new Random(4711L);
                for (n5 = 0; n5 < b.length >> 1; ++n5) {
                    B.b[n5] = random.nextInt() & 0x7F;
                    B.b[n5 + (B.b.length >> 1)] = b[n5] + 64;
                }
            }
            if ((n9 = g.Z(n3) << 6) != aK || n2 != aJ) {
                for (n5 = 0; n5 < d.length; ++n5) {
                    B.d[n5] = n9 + b[n5] << 24 | n2 & 0xFFFFFF;
                }
                aK = n9;
                aJ = n2;
            }
        }
        while (n6 > 0) {
            n9 = this.f + this.Z(n4 * --n / n8);
            n5 = 0;
            if (n == 0) {
                n5 = n6;
                n6 = 0;
            } else {
                while (n6 > 0 && cArray[n6 - 1] != '\n') {
                    ++n5;
                    --n6;
                }
            }
            if (this.w >= 200) {
                g.Code(graphics, n3, cArray, n6, n5, this.e, n9);
            } else {
                int n10 = this.Z(g.Code(n3, cArray, n6, n5));
                if ((n10 = Math.min((c.length >> 1) - 1, n10)) <= 0 || n9 < 0) {
                    --n6;
                    continue;
                }
                int n11 = Math.max(n10 / n5, 1);
                if (g.af || !g.p || g.s) {
                    graphics.setColor(n2);
                    graphics.drawLine(this.e, n9, this.e + n10, n9);
                } else {
                    int n12;
                    int n13 = (n6 << 1 | n5 << 2 ^ n10) % (c.length / 2 - n10) & 0xFFFFFFFE;
                    for (n12 = 0; n12 < n10; ++n12) {
                        B.c[n12] = d[n13 + n12];
                        B.c[n10 + n12] = d[(d.length >> 1) + n13 + n12];
                    }
                    for (n13 = n6; n13 < n6 + n5; ++n13) {
                        if (cArray[n13] != ' ') continue;
                        for (n12 = 0; n12 < n11; ++n12) {
                            int n14 = (n13 - n6) * n11 + n12;
                            if (n14 < c.length) {
                                B.c[n14] = 0;
                            }
                            if ((n14 = (n13 - n6) * n11 + n10 + n12) >= c.length) continue;
                            B.c[n14] = 0;
                        }
                    }
                    n5 = Math.max(0, -this.e);
                    if (n10 > n5) {
                        try {
                            graphics.drawRGB(c, n5, n10 - n5, this.e + n5, n9, n10 - n5, 2, true);
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                    }
                }
            }
            --n6;
        }
    }

    private void Code(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        int n6;
        int n7;
        int n8;
        int n9;
        if (this.aj <= 0) {
            return;
        }
        this.i = this.aj;
        this.J();
        int n10 = this.J();
        Vector<Integer> vector = new Vector<Integer>();
        int n11 = Integer.MAX_VALUE;
        block0: while (n10-- > 0) {
            this.C();
            this.f = this.B(this.f);
            --this.e;
            --this.f;
            ++this.h;
            if (n5 != 0) {
                this.e -= 2;
                this.f -= 2;
                this.g += 4;
                this.h += 3;
            }
            this.a(n, n2);
            n11 = Math.min(n11, this.f);
            n9 = this.e;
            n8 = n9 + this.g;
            n7 = 0;
            while (true) {
                n6 = 0x7FFFFFFE;
                if (n7 < vector.size()) {
                    n6 = (Integer)vector.elementAt(n7);
                }
                if (n6 >= n9) {
                    vector.insertElementAt(new Integer(n9), n7++);
                    vector.insertElementAt(new Integer(this.f), n7++);
                    vector.insertElementAt(new Integer(this.f + this.h), n7++);
                    vector.insertElementAt(new Integer(1), n7++);
                    vector.insertElementAt(new Integer(this.g > 40 && this.h > aE && !bl ? 1 : 0), n7++);
                    n9 = Integer.MAX_VALUE;
                }
                if (n6 > n8) {
                    vector.insertElementAt(new Integer(this.g > 40 && this.h > aE && !bl ? -1 : 0), n7);
                    vector.insertElementAt(new Integer(-1), n7);
                    vector.insertElementAt(new Integer(this.f + this.h), n7);
                    vector.insertElementAt(new Integer(this.f), n7);
                    vector.insertElementAt(new Integer(n8), n7);
                    continue block0;
                }
                n7 += 5;
            }
        }
        n10 = n11;
        while (n11 != Integer.MAX_VALUE) {
            n9 = Integer.MAX_VALUE;
            n8 = 0;
            n7 = 0;
            n6 = 0;
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            while (n14 < vector.size()) {
                int n15 = n7;
                int n16 = n6;
                int n17 = (Integer)vector.elementAt(n14) + 1;
                n12 += n13;
                n13 = 0;
                do {
                    vector.elementAt(n14++);
                    int n18 = (Integer)vector.elementAt(n14++);
                    int n19 = (Integer)vector.elementAt(n14++);
                    int n20 = (Integer)vector.elementAt(n14++);
                    int n21 = (Integer)vector.elementAt(n14++);
                    if (n18 > n11) {
                        n9 = Math.min(n9, n18);
                    }
                    if (n19 > n11) {
                        n9 = Math.min(n9, n19);
                    }
                    if (n18 < n11 && n19 >= n11) {
                        n7 += n20;
                        n13 += n21;
                    }
                    if (n18 > n11 || n19 <= n11) continue;
                    n6 += n20;
                } while (n14 < vector.size() && (Integer)vector.elementAt(n14) <= n17);
                --n17;
                if (n12 == 0 && n15 > 0) {
                    if (bl2) {
                        graphics.setColor(Code.Code[10]);
                        graphics.drawLine(0, n10, this.p - 1, n10);
                        g.Code(graphics, 0, n10 + 1, this.p, n11 - n10 - 1, n3, n4);
                        graphics.setColor(Code.Code[13]);
                        graphics.drawLine(0, n11 - 1, this.p - 1, n11 - 1);
                        graphics.setColor(Code.Code[14]);
                        graphics.drawLine(0, n11, this.p - 1, n11);
                    } else if (n3 == n4) {
                        g.Code(graphics, n8 + 1, n10 + 1, n17 - n8, n11 - n10, n3, false);
                    } else {
                        g.Code(graphics, n8 + 1, n10 + 1, n17 - n8, n11 - n10, n3, n4);
                    }
                    if (bl) {
                        if (bl2) {
                            this.s = (Code.Code[36] >> 8 & 0xFF) > 127;
                            g.Code(graphics, n8 + 1, n10 + 1, n17 - n8, n11 - n10 - 1);
                            this.Z(graphics, n, n2);
                            g.Z(graphics);
                            this.s = false;
                        } else {
                            g.Code(graphics, n8 + 1, n10 + 1, n17 - n8, n11 - n10);
                            this.Z(graphics, n, n2);
                            g.Z(graphics);
                        }
                    }
                }
                if (!bl2) {
                    int n22 = n15;
                    int n23 = n7;
                    if (((n22 | -n22) >>> 31 ^ 1 ^ ((n23 | -n23) >>> 31 ^ 1)) != 0) {
                        g.Code(graphics, n17, n10 + 1, 2, n11 - n10, n5, false);
                    }
                    int n24 = n15;
                    int n25 = n16;
                    if (((n24 | -n24) >>> 31 ^ 1 ^ ((n25 | -n25) >>> 31 ^ 1)) != 0) {
                        g.Code(graphics, n8 + 1, n11, n17 - n8, 2, n5, false);
                    }
                }
                n8 = n17;
            }
            n10 = n11;
            n11 = n9;
        }
    }

    final void d() {
        if (this.I() && this.U >= this.Q) {
            this.I(false);
            return;
        }
        this.B(false);
    }

    final synchronized void Z(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        this.at = (int)System.currentTimeMillis();
        this.Code = System.currentTimeMillis();
        if (this.Q > 0) {
            n4 = g.j;
            g.j = true;
            n3 = this.w;
            this.w = 256;
            int n5 = Math.min(graphics.getClipY() - n2, this.q - 1);
            int n6 = Math.min(n5 + graphics.getClipHeight() - 1, this.Q - 1);
            this.Code(graphics, n, n2, n5, n6);
            this.w = n3;
            n2 += this.Q - this.Z(this.Q);
            g.j = n4;
        }
        n4 = Math.min(Math.max(this.Q, this.J(graphics.getClipY() - n2)), this.q - 1);
        n3 = Math.min(n4 + this.J(graphics.getClipHeight() - 1), this.q - 1);
        this.Code(graphics, n, n2, n4, n3);
    }

    static void Code(B b) {
        b.b(5);
    }

    static void Code(B b, DataInputStream dataInputStream) {
        b.Code(dataInputStream);
    }

    private void Code(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = n3 = this.I(n3, 5);
        while (true) {
            if (n5 == this.O) {
                this.I(graphics, n, n2, n3, n5 - 1);
                return;
            }
            this.C[n5 * 6 + 3] = this.C[n5 * 6 + 2];
            if ((this.C[n5 * 6 + 4] & 1) == 0) {
                this.I(graphics, n, n2, n3, n5 - 1);
                do {
                    if (++n3 != this.O) continue;
                    return;
                } while ((this.C[n3 * 6 + 4] & 1) == 0);
                n5 = n3 - 1;
            } else if (this.C[n5 * 6 + 5] > n4) {
                this.I(graphics, n, n2, n3, n5 - 1);
                return;
            }
            ++n5;
        }
    }

    private synchronized int Code(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7;
        int n8;
        if (this.ah == 0) {
            return 0;
        }
        if (n4 < 0) {
            n8 = n3 + (-n4 - 1 << 1);
            n7 = n2 + n4 - 1;
            n6 = -n4;
        } else {
            n8 = n3 + (n4 - 1 << 1);
            n7 = n2;
            n6 = n4;
        }
        this.aL = 0;
        this.aM = 0;
        int n9 = n + n3 / 2 - n8 / 2;
        int n10 = 0;
        this.aN = Integer.MAX_VALUE;
        this.i = this.ah;
        while (this.i <= this.ai) {
            int n11 = n6;
            int n12 = n8;
            int n13 = n7;
            int n14 = n9;
            B b = this;
            int n15 = 0;
            int n16 = b.i;
            int n17 = b.J();
            for (int i = b.J(); i > 0; --i) {
                int n18;
                b.C();
                b.f = b.B(b.f);
                if (b.f < 0 || !g.Code(b.e, b.f, b.g, b.h, n14, n13, n12, n11) || (!bl ? n17 == 105 : n17 != 105)) continue;
                int n19 = n + n3 / 2;
                if (b.e + b.g <= n19) {
                    n19 = b.e + b.g - 1;
                } else if (b.e > n19) {
                    n19 = b.e;
                }
                int n20 = -1;
                if (n4 < 0 && b.f < n13 + b.e + b.g - n14 && b.f < n13 - b.e + n14 + n12) {
                    n20 = n13;
                    if (b.f + (b.h - 1) / 2 < n2 && n16 != n5) {
                        n20 = b.f + (b.h - 1) / 2;
                    }
                }
                if (n4 > 0 && b.f + b.h > n13 - b.e - b.g + n && b.f + b.h > n13 + n11 + b.e - n14 - n12) {
                    n20 = n2 + n4 - 1;
                    if (b.f + (b.h - 1) / 2 > n2 && n16 != n5) {
                        n20 = b.f + (b.h - 1) / 2;
                    }
                }
                if (n20 < 0 || !g.Code(b.e, b.f, b.g, b.h, n19, n20, 1, 1) || (n18 = (n + n3 / 2 - n19) * (n + n3 / 2 - n19) + (n2 - n20) * (n2 - n20)) >= b.aN) continue;
                b.aN = n18;
                b.aL = n19;
                b.aM = n20;
                n15 = n16;
            }
            b.Y();
            n11 = n15;
            if (n11 <= 0) continue;
            n10 = n11;
        }
        return n10;
    }

    private synchronized int p() {
        if (this.aj <= 0) {
            return 0;
        }
        this.i = this.ah;
        int n = 0;
        while (this.i < this.aj) {
            ++n;
            ++this.i;
            this.i = 10 * this.J() + this.i;
            this.Y();
        }
        return n;
    }

    private int q() {
        int n;
        do {
            if (this.i > this.ai) {
                return this.i;
            }
            n = this.i;
            this.J();
            int n2 = this.J();
            this.C();
            this.i += n2 * 10 - 10;
            this.Y();
        } while (this.I[n] == 105 || (this.C[this.I(this.f, 0) * 6 + 4] & 1) == 0);
        return n;
    }

    private int J(int n, int n2) {
        if (n >= 0) {
            if (this.a[(n << 2) + 2] > n2 + this.Code.Code() && n2 < this.a[n << 2]) {
                n2 = Math.min(this.a[n << 2], this.a[(n << 2) + 2] - this.Code.Code());
            }
            if (this.a[n << 2] < n2 && n2 + this.Code.Code() > this.a[(n << 2) + 2]) {
                n2 = Math.max(this.a[n << 2], this.a[(n << 2) + 2] - this.Code.Code());
            }
        }
        return n2;
    }

    private static int B(int n, int n2) {
        int n3 = 0;
        if (n2 != 0) {
            n3 = Math.abs((n * 1000 << 1) / n2);
        }
        return n3;
    }

    private static int Z(int n, int n2, int n3) {
        int n4 = n2 - (n = Math.abs(n) * n / 1200);
        if (n4 < 0) {
            n = n2;
        } else if (n4 > n3) {
            n = n2 - n3;
        }
        return n;
    }

    private synchronized String Code(int n, int n2) {
        this.i = n;
        if (this.I[n] == n2 || n2 == 76 && this.I[n] == 42) {
            this.r();
            return this.B();
        }
        return "";
    }

    final synchronized String Z() {
        if (this.aj <= 0) {
            return null;
        }
        this.i = this.aj;
        byte by = this.I[this.i];
        this.r();
        if (by == 76 || by == 42) {
            return this.B();
        }
        return null;
    }

    final synchronized String J() {
        return this.Code(this.aj, 76);
    }

    private synchronized int C(int n) {
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        int n5 = 0;
        this.i = n;
        this.J();
        for (n = this.J(); n > 0; --n) {
            this.C();
            n2 = Math.min(n2, this.e);
            n3 = Math.min(n3, this.f);
            n4 = Math.max(n4, this.e + this.g);
            n5 = Math.max(n5, this.f + this.h);
        }
        this.Y();
        this.e = n2;
        this.f = this.B(n3);
        this.g = n4 - n2;
        this.h = n5 - n3;
        return this.i;
    }

    private void Y() {
        this.i = this.o() + this.i;
        if (this.ar >= 13) {
            for (int i = this.J(); i > 0; --i) {
                ++this.i;
                this.i = this.o() + this.i;
            }
            return;
        }
        this.i = this.o() + this.i;
    }

    private int r() {
        if (this.ar >= 13) {
            int n = this.Code(this.i, 't');
            if (n != -1) {
                int n2 = this.i;
                this.i = n;
                this.c = this.I();
                this.i = n2;
            }
            ++this.i;
            this.i = 10 * this.J() + this.i;
            return n;
        }
        ++this.i;
        int n = this.i = 10 * this.J() + this.i;
        this.c = this.I();
        return n;
    }

    private int I(int n, int n2, int n3) {
        int n4 = n + Math.min(0, n3);
        int n5 = Math.abs(n3) + this.Code.Code();
        for (int i = 0; i < this.al; ++i) {
            if (!g.Code(n4, n2 + this.an, n5, this.Code.I() - 2 * this.an, this.a[i << 2], this.a[(i << 2) + 1], this.a[(i << 2) + 2] - this.a[i << 2], this.a[(i << 2) + 3] - this.a[(i << 2) + 1])) continue;
            if (n3 > 0) {
                if (this.a[(i << 2) + 2] <= n + this.Code.Code()) continue;
                n3 = Math.min(n3, Math.max(this.a[(i << 2) + 2] - n - this.Code.Code(), this.a[i << 2] - n));
                continue;
            }
            if (this.a[i << 2] >= n) continue;
            n3 = Math.max(n3, Math.min(this.a[i << 2] - n, this.a[(i << 2) + 2] - n - this.Code.Code()));
        }
        return n3;
    }

    private int Z(int n, int n2) {
        for (int i = 0; i < this.al; ++i) {
            if (!g.Code(n, n2 + this.an, 1, this.Code.I() - 2 * this.an, this.a[i << 2], this.a[(i << 2) + 1], this.a[(i << 2) + 2] - this.a[i << 2], this.a[(i << 2) + 3] - this.a[(i << 2) + 1])) continue;
            return i;
        }
        return -1;
    }

    final void Code(int n, int n2, boolean bl, boolean bl2) {
        if (this.I() && bl) {
            if (this.U >= this.Q && this.U + n2 < this.Q) {
                this.T = this.Z(this.T);
            } else if (this.U < this.Q && this.U + n2 >= this.Q) {
                this.T = this.J(this.T);
            }
            this.Code(n, n2, false);
            return;
        }
        if (bl2) {
            Code.Code.I(true);
        }
        if (n != 0) {
            n = this.I(this.t, this.u, n);
        }
        this.T -= this.t;
        this.U -= this.u;
        this.b(this.t + n, this.Code(this.u, n2, this.w));
        this.T += this.t;
        this.U += this.u;
    }

    final synchronized void c() {
        int n = 0;
        this.i = this.ah;
        while (this.i <= this.ai && n < this.aj) {
            int n2 = this.i;
            this.r();
            if (!g.Code(this.I(), "menu:")) continue;
            n = n2;
        }
        if (n > 0) {
            this.aj = n;
            this.B(false);
        }
    }

    private void Code(int n, int n2, boolean n3) {
        this.T = g.Code(this.T + n, 0, this.p - 1);
        this.U = g.Code(this.U + n2, 0, this.q - 1);
        this.X();
        n = this.t;
        n2 = -1;
        if (n3 != 0) {
            int n4;
            block2: {
                B b = this;
                for (n3 = 0; n3 < b.al; ++n3) {
                    if (b.T <= b.am + b.a[n3 << 2] || b.T > b.a[(n3 << 2) + 2] - b.am || b.U <= 0 + b.a[(n3 << 2) + 1] || b.U > b.a[(n3 << 2) + 3]) continue;
                    n4 = n3;
                    break block2;
                }
                n4 = -1;
            }
            n2 = n4;
            n = this.J(n2, n);
        }
        n2 = n2 < 0 ? 40 : 0;
        n = g.Code(n, this.T + n2 - this.Code.Code(), this.T - n2);
        n2 = g.Code(this.u, this.Code(this.U, 50 - this.Code.I(), this.w), this.Code(this.U, -50, this.w));
        this.b(n, n2);
    }

    /*
     * Unable to fully structure code
     */
    final synchronized void Code(int var1_1, int var2_2, int var3_3) {
        block28: {
            block26: {
                block27: {
                    this.aa();
                    if (this.C()) {
                        if (var1_1 != 0) {
                            this.Code(0, var1_1 * this.i(), false, false);
                            return;
                        }
                        if (var3_3 >= 8 && this.u > 0 && this.u < this.q - this.Code.I()) {
                            this.Code(0, var2_2 * (var3_3 + 39), false, false);
                            return;
                        }
                        var1_1 = 0;
                        if (this.aj > 0) {
                            this.C(this.aj);
                            var1_1 = (int)g.Code(0, this.f, 1, this.h, 0, this.u, 1, this.Code.I());
                        }
                        if ((var3_3 = this.ah) > 0) {
                            this.i = var3_3;
                            var3_3 = this.q();
                        }
                        var5_6 = var4_4 = var3_3;
                        if (var3_3 > 0 && var3_3 <= this.ai) {
                            do {
                                var6_8 = var5_6;
                                var5_6 = var4_4;
                                this.i = var4_4 = this.C(var4_4);
                                var4_4 = this.q();
                                this.C(var5_6);
                                if (var2_2 < 0) {
                                    if (var1_1 != 0) {
                                        if (var5_6 != this.aj && var4_4 != this.aj) continue;
                                        break;
                                    }
                                    if (this.f + this.h <= this.u + this.Code.I()) continue;
                                    var5_6 = var6_8;
                                    this.C(var5_6);
                                    break;
                                }
                                if (var1_1 == 0 ? this.f >= this.u : var5_6 > this.aj) break;
                            } while (var4_4 <= this.ai);
                            this.i = var4_4;
                            var4_4 = var4_4 > this.ai ? var5_6 : this.ai;
                            var6_8 = this.u;
                            if (var2_2 < 0) {
                                if (!(var5_6 != var3_3 && this.f >= var6_8 || var5_6 != this.aj && this.f + this.h >= var6_8 + B.o || var6_8 <= 0)) {
                                    var6_8 -= 44;
                                }
                            } else if (!(var5_6 != var4_4 && this.f + this.h <= var6_8 + this.Code.I() || var5_6 != this.aj && this.f <= var6_8 + this.Code.I() - B.o || var6_8 + this.Code.I() >= this.q)) {
                                var6_8 += 44;
                            }
                            if (this.k) {
                                if (var2_2 < 0 && this.u == 0 && (var1_1 == 0 || this.aj == var3_3)) {
                                    var6_8 = this.q - this.Code.I();
                                    this.aj = var5_6 = var4_4;
                                }
                                if (var2_2 > 0 && this.u + this.Code.I() >= this.q && (var1_1 == 0 || this.aj == var4_4)) {
                                    var6_8 = 0;
                                    this.aj = var5_6 = var3_3;
                                }
                                this.C(var5_6);
                            }
                            if (var6_8 == this.u) {
                                this.aj = var5_6;
                            }
                            this.b(this.t, var6_8);
                            return;
                        }
                        this.b(this.t, this.u + var2_2 * 44);
                        return;
                    }
                    if (var3_3 >= 5) break block26;
                    if (this.I() && this.U >= this.Q) {
                        if (this.Q > 0 && this.U + var2_2 * (44 + (var3_3 << 1)) < this.Q) {
                            this.T = this.Z(this.T);
                            this.U = this.Q - 1;
                            this.Code(var1_1, var2_2, var3_3);
                            return;
                        }
                        this.Code(var1_1 * (44 + (var3_3 << 1)), var2_2 * (44 + (var3_3 << 1)), false);
                        this.r = this.t;
                        this.s = this.u;
                        return;
                    }
                    var4_5 = this.T;
                    var5_7 = this.U;
                    this.aj = var2_2 != 0 ? this.Code(this.T - 1, this.U + var2_2, 3, var2_2 * 22, this.aj, false) : this.Code(this.T + var1_1, this.U, var1_1 * 22, 1, this.aj, false);
                    if (this.U >= this.Q || this.U + (this.aj > 0 ? this.aM - this.U : var2_2 * 22) < this.Q) break block27;
                    v0 = this;
                    v1 = this.J(this.T) - this.T;
                    v2 = this.Code(this.U, 22, this.w) - this.U;
                    ** GOTO lbl-1000
                }
                if (this.aj > 0) {
                    v0 = this;
                    v1 = this.aL - this.T;
                    v2 = g.Code(this.aM, this.U - 44, this.U + 44) - this.U;
                    v3 = true;
                } else {
                    v0 = this;
                    v1 = var1_1 * 22;
                    v2 = var2_2 * 22;
                    if (var3_3 < 5) {
                        v3 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v3 = false;
                    }
                }
                v0.Code(v1, v2, v3);
                if (Math.abs(this.t - this.r) <= Math.abs(var4_5 - this.T)) {
                    this.r = this.t;
                }
                if (Math.abs(this.u - this.s) <= Math.abs(var5_7 - this.U)) {
                    this.s = this.u;
                    return;
                }
                break block28;
            }
            if (var3_3 == 5) {
                this.V = (int)System.currentTimeMillis();
                this.W = this.T;
                this.X = this.U;
                this.Y = var1_1;
                this.aa = var2_2;
            }
        }
    }

    private void b(int n, int n2) {
        int n3 = n;
        n = this.x;
        n = g.Code(n3, 0, this.p - (this.Code.Code() << 8) / n);
        int n4 = n2;
        n2 = this.x;
        n2 = g.Code(n4, 0, this.q - (this.Code.I() << 8) / n2);
        if (this.t != n) {
            this.r = g.Code(Code.Code(this.r, this.t, this.y, this.z), 0, this.p - this.J(this.Code.Code()));
            this.t = n;
            this.y = this.r;
            this.z = (int)System.currentTimeMillis();
        }
        if (this.u != n2) {
            this.s = g.Code(Code.Code(this.s, this.u, this.A, this.D), 0, this.q - this.J(this.Code.I()));
            this.u = n2;
            this.A = this.s;
            this.D = (int)System.currentTimeMillis();
        }
        if (this.I()) {
            f.I = true;
        }
        Code.f();
    }

    final void Z(boolean bl) {
        if (bl) {
            this.aj = this.ah;
        }
        this.Code(0, -this.q, false, false);
    }

    final void J(boolean bl) {
        if (this.x != this.w) {
            this.a();
        }
        this.w = Code.Code(this.w, this.x, this.E, this.F);
        if (g.af) {
            this.w = this.x;
        }
        if (!(this.C() || this.Y == 0 && this.aa == 0)) {
            if (bl) {
                int n;
                int n2;
                int n3 = (int)System.currentTimeMillis() - this.V;
                int n4 = this.W + this.Y * this.J(n3 / 2 + n3 * n3 / 5000) - this.T;
                if (Math.abs(n4) > this.J(this.Code.Code() / 2)) {
                    n4 = this.Y * this.J(this.Code.Code() / 2);
                }
                if (Math.abs(n2 = this.X + this.aa * this.J(n3 / 2 + n3 * n3 / 5000) - this.U) > this.J(this.Code.I() / 2)) {
                    n = this.aa * this.J(this.Code.I() / 2);
                }
                if (this.U < this.Q && this.U + n >= this.Q) {
                    this.W = this.T = this.J(this.T);
                }
                if (this.Q > 0 && this.U >= this.Q && this.U + n < this.Q) {
                    this.W = this.T = this.Z(this.T);
                }
                this.Code(n4, n, false);
                this.r = this.t;
                this.s = this.u;
                Code.f();
            } else {
                this.Code(0, 0, true);
                this.Y = 0;
                this.aa = 0;
            }
        }
        this.r = Code.Code(this.r, this.t, this.y, this.z, this.v);
        this.s = Code.Code(this.s, this.u, this.A, this.D, this.v);
        if (this.U < this.Q) {
            this.T = Math.min(this.T, this.Z(this.p - 1));
        }
        if (Code.B()) {
            this.Code.Code = System.currentTimeMillis() + 1000L;
            return;
        }
        this.aa();
    }

    final void I(int n, int n2) {
        this.ab = n;
        this.ac = n2;
        this.U = this.Code(this.s, n2, this.w);
        this.T = this.r + (this.U >= this.Q ? this.J(n) : n);
        this.ag = this.aj = !this.I() || this.U < this.Q ? this.Code(this.T, this.U, 1, 1, -1, false) : 0;
        this.n = false;
        this.o = false;
        this.p = false;
        if (this.ag > 0 && g.Code(this.Code(this.ag, 76), "menu:")) {
            this.B(false);
            return;
        }
        B b = this;
        b.I[11] = 0;
        b.Z[11] = 0;
        b.t = b.r;
        b.u = b.s;
        this.c(n, n2);
        g.a();
    }

    final void Z(int n, int n2) {
        int n3;
        if (!this.o && this.ag == this.aj) {
            if (this.n) {
                this.Code(true);
            } else if (this.I() && this.U >= this.Q) {
                this.I(false);
            } else {
                Code.Code.Code(this.Code);
                this.B(this.Code.Code(2) ^ true);
            }
        }
        this.c(n, n2);
        B b = this;
        n2 = b.Code(b.Z, b.B);
        if (n2 != 0) {
            n3 = B.Z(n2, b.s, Math.max(0, b.q - b.J(b.Code.I())));
            b.v = B.B(n3, n2);
            b.A = b.s;
            b.u = b.s - n3;
            b.D = (int)System.currentTimeMillis();
        }
        if ((n3 = b.Code(b.I, b.J)) != 0 && Math.abs(n3) * 100 / (Math.abs(n2) + 1) >= 70) {
            n2 = B.Z(n3, b.r, Math.max(0, b.p - b.J(b.Code.Code())));
            b.v = Math.max(b.v, B.B(n2, n3));
            b.y = b.r;
            b.t = b.r - n2;
            b.z = (int)System.currentTimeMillis();
        }
        Code.f();
        this.ag = 0;
    }

    final void g() {
        if (!this.o && this.ag >= 0) {
            this.n = true;
            if (g.n) {
                this.p = this.o = this.Code(true);
                this.n = this.o;
            }
        }
    }

    final void J(int n, int n2) {
        if (!this.p) {
            this.c(n, n2);
            if (this.ag >= 0 && (Math.abs(this.ab - n) > 6 || Math.abs(this.ac - n2) > 6)) {
                this.aj = 0;
                this.ag = -1;
                if (g.n) {
                    this.ab = n;
                    this.ac = n2;
                }
                this.ad = this.ae = this.t;
                this.af = this.ac;
            }
            if (this.ag < 0) {
                int n3 = this.ab - n;
                int n4 = this.Code(this.u, this.ac - n2, this.w);
                int n5 = this.t;
                if (this.ad == this.ae) {
                    if (Math.abs(this.ac - this.af) > 10) {
                        this.ae = -1;
                    } else if (n3 > 20) {
                        this.ae += this.I(n5, n4, this.p - this.Code.Code() - n5);
                    } else if (n3 < -20) {
                        this.ad += this.I(n5, n4, -n5);
                    }
                }
                if (this.ae < this.ad) {
                    int n6;
                    B b = this;
                    int n7 = n5 + Math.min(0, 0 * b.Code.Code());
                    int n8 = (Math.abs(0) + 1) * b.Code.Code();
                    int n9 = -1;
                    int n10 = Integer.MAX_VALUE;
                    for (int i = 0; i < b.al; ++i) {
                        if (!g.Code(n7, n4 + b.an, n8, b.Code.I() - 2 * b.an, b.a[i << 2], b.a[(i << 2) + 1], b.a[(i << 2) + 2] - b.a[i << 2], b.a[(i << 2) + 3] - b.a[(i << 2) + 1]) || Math.abs(b.J(i, n5) - n5) >= n10) continue;
                        n9 = i;
                        n10 = Math.abs(b.J(i, n5) - n5);
                    }
                    int n11 = n6 = Math.abs(n10) <= b.Code.Code() - b.am ? n9 : -1;
                    if (Math.abs(n5 - this.J(n6, n5)) < this.Code.Code() / 2) {
                        n5 = this.J(n6, n5);
                    }
                }
                if (this.ae > this.ad) {
                    n5 = g.Code(n5 + n3, this.ad, this.ae);
                    this.ab = n;
                }
                n3 = this.x;
                this.r = this.t = g.Code(n5, 0, this.p - (this.Code.Code() << 8) / n3);
                n3 = this.x;
                this.s = this.u = g.Code(n4, 0, this.q - (this.Code.I() << 8) / n3);
                this.ac = n2;
                this.Code.Code = System.currentTimeMillis() + 1000L;
            }
            this.U = this.Code(this.s, n2, this.w);
            this.T = this.r + (this.U >= this.Q ? this.J(n) : n);
            g.a();
        }
    }

    private void aa() {
        if (this.v != 160) {
            this.v = 160;
            this.U = this.Code(this.s, this.Code.I() / 2, this.w);
            this.T = this.r + (this.U >= this.Q ? this.J(this.j() / 2) : this.j() / 2);
        }
    }

    private static void Code(int[] nArray, int[] nArray2, int n, int n2) {
        if (nArray[11] > 0) {
            if (n - nArray[(nArray[10] + nArray[11] - 1) % 10] == 0) {
                if (nArray[11] == 1) {
                    nArray[11] = nArray[11] - 1;
                }
            } else if (nArray[11] >= 2 && (nArray[(nArray[10] + 1) % 10] - nArray[nArray[10]]) * (n - nArray[(nArray[10] + nArray[11] - 1) % 10]) < 0) {
                nArray[10] = nArray[10] + (nArray[11] - 1);
                nArray[11] = 1;
                if (nArray[10] >= 10) {
                    nArray[10] = nArray[10] - 10;
                }
            }
        }
        while (nArray[11] > 0 && nArray2[nArray[10]] + 200 < n2) {
            nArray[11] = nArray[11] - 1;
            nArray[10] = nArray[10] + 1;
            if (nArray[10] != 10) continue;
            nArray[10] = 0;
        }
        nArray2[(nArray[10] + nArray[11]) % 10] = n2;
        nArray[(nArray[10] + nArray[11]) % 10] = n;
        if (nArray[11] < 10) {
            nArray[11] = nArray[11] + 1;
            return;
        }
        nArray[10] = nArray[10] + 1;
        if (nArray[10] == 10) {
            nArray[10] = 0;
        }
    }

    private int Code(int[] nArray, int[] nArray2) {
        if (nArray[11] < 2) {
            return 0;
        }
        if (nArray2[(nArray[10] + nArray[11] - 1) % 10] - nArray2[nArray[10]] == 0) {
            return 0;
        }
        int n = nArray[11] > 3 ? nArray[11] - 1 : nArray[11];
        int n2 = 0;
        int n3 = 1;
        while (n3 < n) {
            int n4 = nArray[(nArray[10] + n3) % 10] - nArray[nArray[10]];
            int n5 = nArray2[(nArray[10] + n3) % 10] - nArray2[nArray[10]];
            if (n5 == 0) {
                ++n3;
                continue;
            }
            n4 = n4 * 1000 / n5;
            n2 = n2 == 0 ? n4 : (n2 + n4) / 2;
            ++n3;
        }
        if (Math.abs(n2) < 50) {
            return 0;
        }
        return this.J(g.Code(n2, -4000, 4000));
    }

    public final int Code(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        if (string.equals(this.Code.e) && this.I != null) {
            this.h();
            return this.I.c();
        }
        this.Code.e = string;
        string = string.toLowerCase();
        this.I = new g();
        this.I.Code(this, this.ao, string);
        return this.I.c();
    }

    final void h() {
        if (!this.I.J()) {
            return;
        }
        int n = this.I.c();
        ++this.aO;
        this.aO %= n;
        if (this.aO < 0) {
            return;
        }
        int[] nArray = this.I.Code(this.aO)[0];
        int n2 = nArray[3] + nArray[5] / 2 + nArray[7];
        int n3 = nArray[4] + nArray[6] + nArray[8] - 1;
        if ((this.C[this.I(n3, 0) * 6 + 4] & 1) == 0) {
            this.aj = this.Code(0, this.B(n3), this.p, 10, this.aj, false);
            if (this.aj != -1 && this.I[this.aj] == 67) {
                this.B(false);
            }
        }
        n3 = this.B(n3);
        int n4 = this.am;
        this.am = 0;
        this.Code(n2 - this.T, n3 - this.U, true);
        this.am = n4;
        if (this.I()) {
            this.I(false);
        }
        this.a();
    }
}
