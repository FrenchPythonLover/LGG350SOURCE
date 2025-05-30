/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.icc.morpheus.MorpheusMidlet
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.TextBox
 */
import com.icc.morpheus.MorpheusMidlet;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aj
extends bc
implements CommandListener {
    private static al a;
    private static short[] a;
    private static String[] a;
    private static short[] b;
    private static String[] b;
    private String a;
    private String[] c;
    private am a;
    private int a;
    private int b;
    boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String b;
    private TextBox a;
    private Displayable a;
    private Display a;
    private int c;
    private int d;
    private int e;
    private long a;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private long b;
    private long c;
    private int N;
    private int O;
    private int P;
    private short[] c;
    private int[][] a;
    private String[] d;
    private char[] a;
    private Vector a;
    private int Q = -1;
    private int R;
    private int S = 50;
    private ao a;
    private String c;
    private Object a;
    private Object c = 0;
    private Object d = 1;
    private Object e = 0;
    private static StringBuffer b;
    private boolean p;

    public aj(String string, boolean bl, String string2) {
        String string3 = this.a = string == null ? "" : string;
        if (bl) {
            this.a = bl;
            this.a(1);
            this.o("textbox");
            if (this.a == 1) {
                this.K = 0;
            }
            this.d = true;
            return;
        }
        this.p(string2);
        this.o("label");
    }

    public final void b() {
        this.a = null;
    }

    private void p(String string) {
        boolean bl = true;
        try {
            this.a = Integer.parseInt(string);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
            return;
        }
        finally {
            if (string != null) {
                if (!bl) {
                    this.a = "NOWRAP".equals(string = string.toUpperCase()) ? 1 : ("MARQUEE".equals(string) ? 2 : ("TICKER".equals(string) ? 3 : 0));
                }
            } else {
                this.a = 0;
            }
        }
    }

    public final void a() {
        super.a();
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = null;
        this.a = null;
        this.a = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        if (this.a != null) {
            this.a.removeAllElements();
        }
        this.a = null;
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        this.a = null;
    }

    public static void c() {
        a = null;
        a = null;
        b = null;
        b = null;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (g && f && this.h) {
            if (this.a != null) {
                this.a.j = this.f();
                this.a.k = this.g();
            }
            int n9 = this.a(u.j, u.k);
            super.a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
            boolean bl = this.e = System.currentTimeMillis() <= this.c + 1000L;
            if (this.a != 0) {
                if (n9 != 0) {
                    this.b(graphics, this.l, this.m, this.n, this.o);
                } else {
                    this.a(graphics, this.l, this.m, this.n, this.o);
                }
            }
            aj aj2 = this;
            if (aj2.a == null) {
                aj2.a = aj2.a == 0 ? (Object)new int[aj2.c.length][] : (int[][])new int[1][];
            }
            block1 : switch (this.a) {
                case 0: {
                    n3 = n4;
                    Graphics graphics2 = graphics;
                    aj2 = this;
                    aj2.b(graphics2);
                    graphics2.setColor(((av)((Object)aj2.a)).a);
                    n4 = u.k;
                    n3 -= n4;
                    n5 = 0;
                    n6 = 0;
                    n7 = aj2.a.a();
                    n8 = aj2.c.length;
                    for (n9 = 0; n9 < n8; ++n9) {
                        int n10;
                        n5 = aj2.m + n7 * n9;
                        n6 = n5 + n7 + n4;
                        if (n5 < n3) {
                            if (aj2.a) {
                                n10 = n9 + aj2.I;
                                if (n10 >= aj2.c.length || n9 >= aj2.c) break block1;
                                if (n6 <= 0) continue;
                                aj2.a.a(graphics2, aj2.c[n10], aj2.l + aj2.c[n10], n5, ((av)((Object)aj2.a)).q, aj2.n);
                                continue;
                            }
                            n10 = aj2.c * (aj2.d - 1) + n9;
                            if (aj2.c != 0 && (n10 >= aj2.c.length || n9 >= aj2.c)) break block1;
                            if (n6 > 0) {
                                aj2.a.a(graphics2, aj2.c[n10], aj2.l + aj2.c[n10], n5, ((av)((Object)aj2.a)).q, aj2.n);
                                continue;
                            }
                            aj2.a[n9] = null;
                            continue;
                        }
                        try {
                            n10 = n9;
                            while (true) {
                                aj2.a[n10++] = null;
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            break block1;
                        }
                    }
                    break;
                }
                case 1: {
                    String string;
                    Graphics graphics3 = graphics;
                    aj2 = this;
                    aj2.h();
                    aj2.b(graphics3);
                    graphics3.setColor(((av)((Object)aj2.a)).a);
                    if (aj2.a) {
                        Graphics graphics4 = graphics3;
                        aj aj3 = aj2;
                        String string2 = aj3.c ? aj3.b : aj3.a;
                        aj3.a.a(graphics4, string2.substring(aj3.K), aj3.l, aj3.m, ((av)((Object)aj3.a)).q, aj3.n);
                        break;
                    }
                    if (aj2.P != 0) {
                        b.setLength(0);
                        string = b.append(aj2.a.substring(0, aj2.P)).append("...").toString();
                        aj2.p = true;
                    } else {
                        string = aj2.a;
                    }
                    aj2.a.a(graphics3, string, aj2.l, aj2.m, ((av)((Object)aj2.a)).q, aj2.n);
                    break;
                }
                case 2: {
                    Graphics graphics5 = graphics;
                    aj2 = this;
                    graphics5.setColor(((av)((Object)aj2.a)).a);
                    aj2.a.a(graphics5, aj2.a, aj2.l + aj2.b, aj2.m, ((av)((Object)aj2.a)).q, aj2.n);
                    if (-aj2.b < aj2.a.a(aj2.a)) {
                        --aj2.b;
                        aj2.f();
                        break;
                    }
                    if (-aj2.b != aj2.a.a(aj2.a)) break;
                    aj2.b = aj2.N;
                    aj2.f();
                    break;
                }
                case 3: {
                    Graphics graphics6 = graphics;
                    aj2 = this;
                    graphics6.setColor(((av)((Object)aj2.a)).a);
                    aj2.O = aj2.a.a(aj2.a) - aj2.N;
                    aj2.a.a(graphics6, aj2.a, aj2.l + aj2.b, aj2.m, ((av)((Object)aj2.a)).q, aj2.n);
                    if (-aj2.b >= aj2.O) break;
                    --aj2.b;
                    aj2.f();
                }
            }
            if (!this.a && this.a != 0) {
                this.a(graphics);
            }
            u.a(-this.A, -this.B);
        }
    }

    private void h() {
        this.b = null;
        if (this.c && this.a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.a >= System.currentTimeMillis()) {
                int n = this.a.length() - 1;
                for (int i = 0; i < n; ++i) {
                    stringBuffer.append('*');
                }
                if (n >= 0) {
                    stringBuffer.append(this.a.charAt(n));
                }
            } else {
                int n = this.a.length();
                for (int i = 0; i < n; ++i) {
                    stringBuffer.append('*');
                }
            }
            if (this.e) {
                stringBuffer.deleteCharAt(this.C - 1);
                stringBuffer.insert(this.C - 1, this.a.charAt(this.C - 1));
            }
            this.b = stringBuffer.toString();
        }
    }

    private void b(Graphics graphics) {
        if (this.b && this.a && this.i) {
            try {
                String string;
                int n2;
                int n3 = this.a.a();
                int n4 = this.C;
                int n5 = 0;
                int n6 = 0;
                if (this.a == 0) {
                    for (n2 = 0; n2 < this.c.length; ++n2) {
                        n6 = this.c[n2].length();
                        if (this.C > (n5 += n6)) continue;
                        n4 = n6 - (n5 - this.C);
                        this.H = n2;
                        if (n4 != this.c[n2].length() || n2 >= this.c.length - 1) break;
                        n4 = 0;
                        ++this.H;
                        break;
                    }
                    if (this.H < this.I) {
                        while (this.H < this.I) {
                            --this.I;
                            --this.J;
                        }
                    } else if (this.H > this.J) {
                        while (this.H > this.J) {
                            ++this.I;
                            ++this.J;
                        }
                    }
                    if (this.c == this.c.length) {
                        this.I = 0;
                        this.J = this.c.length - 1;
                    }
                    string = this.c[this.H];
                    this.F = this.a.a(this.c[this.H].substring(0, n4)) + this.l;
                } else {
                    String string2;
                    n2 = 0;
                    n5 = this.a.length();
                    String string3 = string2 = this.c ? this.b : this.a;
                    if (n5 > this.C) {
                        for (int i = this.K; i < n5 && (n2 += this.a.a(string2.charAt(i))) < this.n; ++i) {
                            this.L = i + 1;
                        }
                    } else {
                        n4 = this.C = this.a.length();
                        int n7 = this.C - 1;
                        while (n7 >= 0 && (n2 += this.a.a(string2.charAt(n7))) < this.n) {
                            this.K = n7--;
                        }
                    }
                    string = string2;
                    this.F = this.a.a(string2, this.K, n4 - this.K) + this.l;
                }
                switch (((av)((Object)this.a)).q) {
                    case 8: {
                        n2 = this.a.a(string);
                        if (this.n <= n2) break;
                        this.F += this.h - n2;
                        break;
                    }
                    case 1: {
                        n2 = this.a.a(string);
                        if (this.n <= n2) break;
                        this.F += this.n - n2 >> 1;
                    }
                }
                this.G = this.m + (this.H - this.I) * n3;
                if (this.e) {
                    int n8 = this.a.a(this.a.charAt(this.C - 1));
                    graphics.setColor(((av)((Object)this.a)).p);
                    graphics.fillRect(this.F - n8 + u.j, this.G + u.k, n8, n3);
                }
                if (this.e < q.b >> 1) {
                    graphics.setColor(0);
                    int n9 = 0;
                    if (this.a.length() != 0) {
                        n9 = -1;
                    }
                    graphics.drawLine(this.F + n9 + u.j, this.G + u.k, this.F + n9 + u.j, this.G + n3 + u.k);
                } else if (this.e > q.b) {
                    this.e = -1;
                }
                ++this.e;
            }
            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {}
            aj.m();
        }
    }

    public final void a(int n2, int n3) {
        int n4 = n2;
        n2 = 0;
        aj aj2 = null;
        int n5 = n3;
        n3 = n4;
        aj2 = this;
        super.a(n3, n5);
        aj2.a = null;
        aj2.a = am.a(((av)((Object)aj2.a)).u, ((av)((Object)aj2.a)).v, ((av)((Object)aj2.a)).w, aj2.a);
        aj2.a.a(((av)((Object)aj2.a)).x);
        if (aj2.a == 0) {
            int n6 = n3;
            if (((av)((Object)aj2.a)).s != -1) {
                n6 = ((av)((Object)aj2.a)).f ? ((av)((Object)aj2.a)).s * n3 / 100 : ((av)((Object)aj2.a)).s;
            }
            if (aj2.y != -1) {
                n6 = aj2.l ? aj2.y * n3 / 100 : aj2.y;
            }
            int n7 = 0;
            Object var8_9 = null;
            int n8 = n6 - (aj2.p + aj2.q + aj2.v + aj2.w);
            am am2 = aj2.a;
            String string = aj2.a;
            aj aj3 = aj2;
            int n9 = 0;
            int n10 = 0;
            n9 = 0;
            int n11 = aj3.a.a();
            int n12 = aj3.l + aj3.s + aj3.x;
            int n13 = n8 - 4;
            boolean bl = true;
            if (string != null) {
                int n14 = string.length();
                int n15 = 0;
                int n16 = 0;
                n8 = 0;
                int n17 = (n7 << 1) - 2;
                while (bl) {
                    int n18;
                    n9 = n13;
                    if (var8_9 != null) {
                        n8 = var8_9[n17];
                        for (n18 = n17; n18 >= 0; n18 -= 2) {
                            if (var8_9[n18 + 1] <= n11 * n10 + n12) continue;
                            n9 -= var8_9[n18];
                            if (n17 == n18) {
                                n8 = 0;
                                break;
                            }
                            n8 -= var8_9[n18];
                            break;
                        }
                        int n19 = n10;
                        a[n19] = (short)(a[n19] - n8);
                    }
                    n7 = 0;
                    n18 = 0;
                    n15 = n16;
                    while (n16 < n14) {
                        n8 = string.charAt(n16);
                        if ((n18 += am2.a((char)n8)) > n9) {
                            if (n15 == n16) {
                                bl = false;
                                ++n16;
                                break;
                            }
                            n7 = 1;
                            break;
                        }
                        if (10 == n8) {
                            ++n16;
                            break;
                        }
                        ++n16;
                    }
                    if (n7 != 0 && (n9 = string.substring(n15, n16).lastIndexOf(32)) > 0 && n16 > n9 + n15) {
                        n16 = n9 + n15;
                    }
                    aj.a[n10] = string.substring(n15, n16);
                    aj.a[n10] = bj.c(a[n10]);
                    if (n16 >= n14) {
                        ++n10;
                        break;
                    }
                    if (a.length == n10) {
                        a = bj.a(a);
                    }
                    if ((n8 = ++n10) < a.length) continue;
                    b = new short[a.length + 100];
                    System.arraycopy(a, 0, b, 0, a.length);
                    a = b;
                    b = null;
                    b = new String[a.length + 100];
                    System.arraycopy(a, 0, b, 0, a.length);
                    a = b;
                    b = null;
                }
            }
            if (aj3.c == null || aj3.c.length != n10) {
                aj3.c = new String[n10];
            }
            if (aj3.c == null || aj3.c.length != n10) {
                aj3.c = new short[n10];
            }
            System.arraycopy(a, 0, aj3.c, 0, n10);
            System.arraycopy(a, 0, aj3.c, 0, n10);
            aj2.h = aj2.c.length > 1 ? n3 : (aj2.c[0] != null ? aj2.a.a(aj2.c[0]) : 0);
            aj2.i = aj2.c.length * aj2.a.a();
        } else if (aj2.a == 1) {
            int n20;
            if (aj2.y != -1 || ((av)((Object)aj2.a)).s != -1) {
                aj2.b(n3, n5);
                aj2.N = aj2.n;
            } else {
                aj2.N = n3 - (aj2.q + aj2.p);
            }
            aj2.P = 0;
            int n21 = 0;
            int n22 = aj2.a.length();
            for (n20 = 0; n20 < n22; ++n20) {
                if (aj2.N >= (n21 += aj2.a.a(aj2.a.charAt(n20)))) continue;
                aj2.P = n20;
                break;
            }
            aj2.i = aj2.a.a();
            if (aj2.P == 0) {
                aj2.h = aj2.a.a(aj2.a);
            } else {
                n20 = aj2.a.a("...");
                n21 = 0;
                n22 = aj2.P;
                while (--n22 >= 0) {
                    if (n20 >= (n21 += aj2.a.a(aj2.a.charAt(n22)))) continue;
                    aj2.P = n22;
                    break;
                }
                aj2.h = aj2.a.a(aj2.a.substring(0, aj2.P) + "...");
                aj2.p = true;
            }
        } else {
            aj2.h = aj2.a.a(aj2.a);
            if (aj2.h > n3) {
                aj2.h = n3;
            }
            aj2.i = aj2.a.a();
        }
        if (aj2.c != 0) {
            aj2.i = aj2.c * aj2.a.a();
        }
        aj2.o();
        aj2.b(n3, n5);
        if (aj2.a && (aj2.y == -1 || !aj2.l && aj2.y > n3) && (((av)((Object)aj2.a)).s == -1 || !((av)((Object)aj2.a)).f && ((av)((Object)aj2.a)).s > n3)) {
            aj2.h = n3;
            aj2.n();
        }
        if (aj2.d != null && aj2.a == null) {
            aj2.a = new ao(null);
            aj2.a.y = aj2.h;
            aj2.a.z = aj2.i;
            aj2.a.a = aj2.a;
        }
        if (aj2.d > aj2.a()) {
            aj2.d = aj2.a();
        }
        aj2.N = aj2.n;
        aj2.s();
    }

    public final void a(Object object) {
        this.b((String)object);
    }

    public final void a(String string) {
        this.a = string;
    }

    public final Object a() {
        return this.a;
    }

    public final void e() {
        al al2 = this.a;
        this.q(((s)((Object)al2)).a);
    }

    private void q(String string) {
        this.p = false;
        String string2 = this.a = string != null ? string : "";
        if (this.a) {
            if (this.a.length() > this.S) {
                this.a = this.a.substring(0, this.S);
            }
            this.C = string.length();
        }
        this.q();
        aj.m();
    }

    public final boolean a(int n2, Display display, Displayable object, int n3, boolean bl, String charSequence) {
        boolean bl2 = false;
        this.b = System.currentTimeMillis();
        int n4 = this.a.length();
        this.d = false;
        if (!this.d) {
            this.a(display, (Displayable)object, (String)charSequence);
        } else {
            int n5 = Integer.MIN_VALUE;
            if (n2 == q.h) {
                if (this.Q != -1 && this.a.size() > 0 && this.c != null) {
                    object = (String)this.a.elementAt(this.Q);
                    if (this.R == 0 && this.c.length() == this.a.length()) {
                        this.a = new String((String)object);
                        this.C = this.a.length();
                    } else {
                        bl = this.R != 0;
                        charSequence = new StringBuffer(this.a);
                        ((StringBuffer)charSequence).delete(this.R + bl, this.R + this.c.length() + bl);
                        ((StringBuffer)charSequence).insert(this.R + bl, (String)object);
                        this.a = ((StringBuffer)charSequence).toString();
                        this.C = this.R + ((String)object).length() + bl;
                    }
                    this.e = 0;
                    this.d(1);
                    this.i();
                    q.a(this, this.a);
                } else {
                    this.b = !this.b;
                    this.C = bl ? 0 : this.a.length();
                    this.K = 0;
                    if (!this.b && this.a != null) {
                        ((s)((Object)this.a)).a(this.a);
                    }
                }
                bl2 = this.b;
                if (!this.b && this.c != null) {
                    q.a(this, this.c);
                }
            }
            if (this.b) {
                if (n2 == q.k) {
                    aj aj2 = this;
                    this.a = 0L;
                    if (aj2.C > 0) {
                        StringBuffer stringBuffer = new StringBuffer(aj2.a);
                        stringBuffer.deleteCharAt(--aj2.C);
                        aj2.a = stringBuffer.toString();
                    }
                    aj2.h();
                    aj2.d(0);
                    q.a(aj2, aj2.a);
                    aj2.i();
                    this.e = 0;
                    this.c = Integer.MIN_VALUE;
                } else {
                    switch (n2) {
                        case 48: {
                            n5 = 0;
                            break;
                        }
                        case 49: {
                            n5 = 1;
                            break;
                        }
                        case 50: {
                            n5 = 2;
                            break;
                        }
                        case 51: {
                            n5 = 3;
                            break;
                        }
                        case 52: {
                            n5 = 4;
                            break;
                        }
                        case 53: {
                            n5 = 5;
                            break;
                        }
                        case 54: {
                            n5 = 6;
                            break;
                        }
                        case 55: {
                            n5 = 7;
                            break;
                        }
                        case 56: {
                            n5 = 8;
                            break;
                        }
                        case 57: {
                            n5 = 9;
                            break;
                        }
                        case 35: {
                            n5 = 10;
                            break;
                        }
                        case 42: {
                            n5 = 11;
                            break;
                        }
                        default: {
                            if (n2 == q.d) {
                                if (this.a == 0) {
                                    if (this.H == 0) {
                                        this.C = 0;
                                    } else {
                                        if (this.H == this.I) {
                                            --this.I;
                                            --this.J;
                                        }
                                        --this.H;
                                        this.t();
                                    }
                                } else if (this.d != null) {
                                    bl2 = this.b = !this.b;
                                    q.a(this, this.d);
                                }
                                if (this.Q >= 0) {
                                    this.a(this.Q, this.Q - 1, q.d);
                                }
                                this.j();
                            }
                            if (n2 == q.e) {
                                if (this.a == 0) {
                                    if (this.H == this.c.length - 1) {
                                        this.C = this.a.length();
                                    } else {
                                        if (this.H == this.J) {
                                            ++this.I;
                                            ++this.J;
                                        }
                                        ++this.H;
                                        this.t();
                                    }
                                } else if (this.e != null) {
                                    bl2 = this.b = !this.b;
                                    q.a(this, this.e);
                                }
                                if (this.Q >= 0) {
                                    this.a(this.Q, this.Q + 1, q.e);
                                }
                                this.j();
                            }
                            if (n2 == q.f) {
                                if (this.C > 0 && this.b > this.c + 1000L) {
                                    --this.C;
                                    this.d(0);
                                    this.i();
                                }
                                this.j();
                            }
                            if (n2 != q.g) break;
                            if (n4 > this.C && this.b > this.c + 1000L) {
                                ++this.C;
                                this.d(1);
                                this.i();
                            }
                            this.j();
                        }
                    }
                    if (n5 != Integer.MIN_VALUE) {
                        if (n5 == this.D && this.b < this.c + 1000L) {
                            if (n3 == 0) {
                                this.E = q.a[n5].length - 1 > this.E ? ++this.E : 0;
                                this.b(q.a[n5][this.E]);
                                this.c = this.b;
                                this.D = n5;
                            } else if (n3 == 3) {
                                this.b((char)(n5 + 48));
                                this.j();
                            }
                        } else if (this.S > this.a.length()) {
                            if (this.M == 3 || this.M == 5) {
                                this.j();
                                this.a((char)(n5 + 48));
                            } else if (n3 == 0 && q.a[n5].length > 0) {
                                this.E = 0;
                                this.a(q.a[n5][this.E]);
                                this.c = this.b;
                                this.D = n5;
                            }
                        }
                    }
                }
                aj.m();
            }
        }
        return bl2;
    }

    private void a(int n2, int n3, int n4) {
        ai ai2 = this.a.a;
        bd bd2 = ai2.a;
        boolean bl = false;
        int n5 = bd2.a();
        if (n4 == q.e && n3 < n5 || n4 == q.d && n3 >= 0) {
            ai ai3 = (ai)bd2.a(n3);
            bl = ai3.d;
        }
        if (bl) {
            ((ai)bd2.a(n2)).a(q.d);
            ((ai)bd2.a(n3)).a(q.d);
            this.Q = n3;
            return;
        }
        this.a.a.a(0, n4 == q.e ? 1 : -1);
    }

    private void i() {
        this.c = null;
        Object var1_1 = null;
        this.Q = -1;
        this.R = 0;
        this.a = new Vector();
        boolean bl = false;
        if (this.d != null) {
            int n2;
            int n3;
            if (this.a.length() <= 0) {
                this.a.g();
                return;
            }
            Vector<Integer> vector = new Vector<Integer>();
            int n4 = this.a.length();
            int n5 = this.a.length;
            block0: for (n3 = 0; n3 < n4; ++n3) {
                char c = this.a.charAt(n3);
                for (n2 = 0; n2 < n5; ++n2) {
                    if (c != this.a[n2]) continue;
                    vector.addElement(new Integer(n3));
                    continue block0;
                }
            }
            n3 = vector.size();
            if (n3 == 0) {
                this.c = this.a;
            } else {
                for (n2 = 0; n2 < n3; ++n2) {
                    n5 = (Integer)vector.elementAt(n2);
                    if (n5 >= this.C) {
                        this.c = this.a.substring(this.R + (this.R == 0 ? 0 : 1), n5);
                        break;
                    }
                    this.R = n5;
                }
                if (this.c == null && this.C > this.R) {
                    this.c = this.a.substring(this.R + 1, n4);
                }
            }
            if (this.c != null && this.c.length() > 0) {
                n2 = this.c.length();
                n5 = this.d.length;
                for (int i = 0; i < n5; ++i) {
                    if (this.d[i].length() <= n2 || !this.c.toUpperCase().equals(this.d[i].substring(0, n2).toUpperCase())) continue;
                    n4 = this.a.size();
                    String string = null;
                    n3 = 0;
                    for (int j = 0; j < n4; ++j) {
                        string = (String)this.a.elementAt(j);
                        if (this.d[i].compareTo(string) > 0) continue;
                        this.a.insertElementAt(this.d[i], j);
                        n3 = 1;
                        break;
                    }
                    if (n3 != 0) continue;
                    this.a.addElement(this.d[i]);
                }
            }
            int n6 = this.a.size();
            this.a.g();
            if (n6 > 0) {
                this.Q = 0;
                this.a.b();
                String string = null;
                for (n5 = 0; n5 < n6; ++n5) {
                    string = (String)this.a.elementAt(n5);
                    this.a.a(string, string);
                }
                this.a.a.i = false;
                this.a.a.h = false;
                this.a.a.a.t = -1;
                this.a.a.a.s = -1;
                this.a.a.z = -1;
                this.a.a.y = -1;
                this.a.a(q.a(), q.b());
                ai ai2 = this.a.a;
                ((ai)ai2.a.a(0)).a(q.d);
                this.a.a.b(false);
                this.a.c();
            }
        }
    }

    private void j() {
        this.e = 0;
        this.c = Integer.MIN_VALUE;
    }

    private void t() {
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; n3 < this.c[this.H].length() && i < this.F; i += this.a.a(this.c[this.H].charAt(n3))) {
            n2 = n3++;
        }
        this.C = n2;
        for (n3 = 0; n3 < this.H; ++n3) {
            this.C += this.c[n3].length();
        }
    }

    private void a(char c) {
        this.a = System.currentTimeMillis() + 1000L;
        StringBuffer stringBuffer = new StringBuffer(this.a);
        if (this.C == 0 && (this.M == 0 || this.M == 4) && !this.c || this.M == 2) {
            stringBuffer.insert(this.C++, new Character(c).toString().toUpperCase());
        } else {
            stringBuffer.insert(this.C++, c);
        }
        this.a = stringBuffer.toString();
        this.h();
        this.d(1);
        q.a(this, this.a);
        this.i();
    }

    private void b(char c) {
        if (this.C > 0) {
            StringBuffer stringBuffer = new StringBuffer(this.a);
            stringBuffer.deleteCharAt(this.C - 1);
            if (this.C == 1 && (this.M == 0 || this.M == 4) || this.M == 2) {
                stringBuffer.insert(this.C - 1, new Character(c).toString().toUpperCase());
            } else {
                stringBuffer.insert(this.C - 1, c);
            }
            this.a = stringBuffer.toString();
        }
        q.a(this, this.a);
        this.i();
    }

    public final void a(Display display, Displayable displayable, String object) {
        if (object == null) {
            object = "";
        }
        if ("".equals(((String)object).trim())) {
            object = "";
        }
        this.a = display;
        this.a = displayable;
        if (this.a.length() <= this.S) {
            int n2 = 0x200000;
            if (this.c) {
                n2 = 65536;
            } else {
                switch (this.M) {
                    case 4: {
                        n2 = 1;
                        break;
                    }
                    case 5: {
                        n2 = 3;
                        break;
                    }
                    case 3: {
                        n2 = 2;
                    }
                }
            }
            try {
                a = null;
                a = new al((String)object, this.a, this.S, n2);
            }
            catch (Exception exception) {
                this.a = new TextBox((String)object, this.a, this.S, n2);
            }
        } else {
            try {
                a = null;
                a = new al("", this.a.substring(0, this.S), this.S, 0);
            }
            catch (Exception exception) {
                this.a = new TextBox("", this.a.substring(0, this.S), this.S, 0);
            }
        }
        if (a == null) {
            this.a.setCommandListener((CommandListener)this);
            this.a.addCommand(new Command(MorpheusMidlet.b, 4, 1));
            this.a.addCommand(new Command(MorpheusMidlet.c, 3, 2));
        } else {
            Command command = new Command(MorpheusMidlet.b, 4, 1);
            object = this;
            al al2 = a;
            a.a = object;
            al2.a = command;
            al2 = a;
            al2.a.invokeKeypad();
        }
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {}
        display.setCurrent((Displayable)this.a);
    }

    private void u() {
        this.a.setCurrent(this.a);
        this.C = this.a.length();
        this.K = 0;
        this.a = null;
        this.a = null;
        this.a = null;
    }

    private void d(int n2) {
        if (this.a == 1) {
            String string;
            String string2 = string = this.c ? this.b : this.a;
            if (n2 == 0) {
                if (this.L > string.length()) {
                    this.L = string.length();
                }
                if (this.K > 0) {
                    n2 = this.a.a(string.charAt(this.K - 1));
                    if (this.a.a(string, this.C, this.L - this.C) >= n2) {
                        --this.K;
                    }
                    return;
                }
            } else if (n2 == 1 && this.C > this.L && this.L != 0) {
                this.L = this.C;
                while (this.n <= this.a.a(string, this.K, this.L - this.K)) {
                    ++this.K;
                }
            }
        }
    }

    public final void commandAction(Command object, Displayable displayable) {
        if (object.getCommandType() == 4) {
            object = this;
            if (a == null) {
                object.b(object.a.getString());
            } else {
                Command command = object;
                object = a;
                command.b(object.a);
            }
            this.u();
            if (this.c != null) {
                q.a(this, this.c);
                return;
            }
        } else if (object.getCommandType() == 3) {
            this.u();
        }
    }

    public final void b(Object object) {
        this.a = object;
    }

    public final void c(Object object) {
        this.c = object;
    }

    public final void d(Object object) {
        this.d = object;
    }

    public final void e(Object object) {
        this.e = object;
    }

    public final String b() {
        return this.a;
    }

    public final void b(String string) {
        if (!this.a.equals(string)) {
            q.a(this, this.a);
        }
        if (this.a != null) {
            ((s)((Object)this.a)).a(string);
        } else {
            this.q(string);
        }
        this.s();
    }

    public final am a() {
        return this.a;
    }

    public final void a(int n2) {
        this.c = n2;
        if (this.a) {
            this.a = this.c <= 1 ? 1 : 0;
            this.I = 0;
            this.J = this.c - 1;
        }
    }

    public final void c(String string) {
        this.S = bj.a(string, 50);
        this.q(this.a);
    }

    public final void d(String string) {
        boolean bl = false;
        try {
            this.M = Integer.parseInt(string);
            if (this.M < 6) {
                bl = true;
            }
        }
        catch (NumberFormatException numberFormatException) {}
        if (!bl) {
            if ("ABC".equals(string)) {
                this.M = 2;
                return;
            }
            if ("abc".equals(string)) {
                this.M = 1;
                return;
            }
            if ("123".equals(string)) {
                this.M = 3;
                return;
            }
            if ("EMAIL".equals(string.trim().toUpperCase())) {
                this.M = this.c == 1 ? 4 : 0;
                return;
            }
            if ("PHONENUMBER".equals(string.trim().toUpperCase())) {
                this.M = this.c == 1 ? 5 : 3;
                return;
            }
            this.M = 0;
        }
    }

    public final void e(String string) {
        this.d = bj.a(string);
    }

    public final void f(String string) {
        this.c = bj.a(string);
    }

    public final void g() {
        if (this.M < 3) {
            ++this.M;
            return;
        }
        this.M = 0;
    }

    public final void g(String string) {
        boolean bl = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String[] stringArray = new String[1000];
        if (string != null) {
            string = string.trim();
            String string2 = null;
            if (string.length() > 0) {
                while (!bl) {
                    if ((n3 = string.indexOf(44, n3)) == -1) {
                        string2 = string.substring(n2, string.length());
                        bl = true;
                    } else {
                        string2 = string.substring(n2, n3);
                        n2 = ++n3;
                    }
                    stringArray[n4++] = string2.trim();
                }
            }
            if (n4 > 0) {
                this.d = new String[n4];
                System.arraycopy(stringArray, 0, this.d, 0, n4);
            }
        }
    }

    public final void h(String string) {
        this.a = string.toCharArray();
    }

    private int a() {
        int n2 = 0;
        if (this.c > 0 && this.c != null) {
            n2 = this.c.length / this.c + (this.c.length % this.c != 0 ? 1 : 0);
        }
        return n2;
    }

    public final boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -101: {
                    ah2.a(this.a);
                    break;
                }
                case -102: {
                    String string = "WRAP";
                    if (this.a == 1) {
                        string = "NOWRAP";
                    } else if (this.a == 2) {
                        string = "MARQUEE";
                    } else if (this.a == 3) {
                        string = "TICKER";
                    }
                    ah2.a(string);
                    break;
                }
                case -103: {
                    ah2.c(this.c);
                    break;
                }
                case -107: {
                    ah2.c(this.S);
                    break;
                }
                case -104: {
                    ah2.a(this.c);
                    break;
                }
                case -105: {
                    ah2.a(this.d);
                    break;
                }
                case -106: {
                    ah2.a(this.a);
                    break;
                }
                case -110: {
                    ah2.c(this.d);
                    break;
                }
                case -111: {
                    ah2.c(this.a());
                    break;
                }
                case -312: {
                    ah2.a(this.a);
                    break;
                }
                case -109: 
                case -108: {
                    ah2.a(ag.b);
                    break;
                }
                case -112: {
                    ah2.a(this.p);
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(int n2, boolean bl, Object object, int n3) {
        boolean bl2 = super.a(n2, bl, object, n3);
        if (!bl2) {
            switch (n2) {
                case -101: {
                    this.b(bj.a(object, ""));
                    break;
                }
                case -102: {
                    this.p(bj.a(object, "0"));
                    break;
                }
                case -103: {
                    if (!bl) {
                        throw new RuntimeException();
                    }
                    this.a(n3);
                    break;
                }
                case -107: {
                    if (!bl) {
                        throw new RuntimeException();
                    }
                    this.S = n3;
                    break;
                }
                case -110: {
                    if (!bl) {
                        throw new RuntimeException();
                    }
                    if (n3 > this.a()) {
                        this.d = this.a();
                        break;
                    }
                    if (n3 <= 0) {
                        this.d = 1;
                        break;
                    }
                    this.d = n3;
                    break;
                }
                case -104: {
                    this.c = bj.a(object, false);
                    break;
                }
                case -105: {
                    this.g((String)object);
                    break;
                }
                case -106: {
                    this.h((String)object);
                    break;
                }
                case -312: {
                    String string = (String)object;
                    aj aj2 = this;
                    this.a = string;
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final boolean a(ah ah2, af af2, int n2, ah ah3) {
        if (!super.a(ah2, af2, n2, ah3)) {
            switch (n2) {
                case -108: {
                    if (this.d >= this.a()) break;
                    ++this.d;
                    this.s();
                    this.f();
                    break;
                }
                case -109: {
                    if (this.d <= 1) break;
                    --this.d;
                    this.s();
                    this.f();
                    break;
                }
                default: {
                    throw new NoSuchElementException("no such method");
                }
            }
        }
        return true;
    }

    static {
        a = new short[200];
        a = new String[200];
        b = null;
        b = null;
        b = new StringBuffer();
    }
}
