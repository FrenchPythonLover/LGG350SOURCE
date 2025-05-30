/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.icc.morpheus.MorpheusMidlet
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 *  javax.microedition.midlet.MIDlet
 */
import com.icc.morpheus.MorpheusMidlet;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class q
extends ag
implements Runnable,
n {
    public static ab a;
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static boolean a;
    public static int l;
    public static int m;
    public static String a;
    public static int n;
    public static int o;
    public static int p;
    public static String b;
    public static String c;
    private static String h;
    public static q a;
    public static char[][] a;
    public static boolean[] a;
    public static Hashtable a;
    public static Vector a;
    public static Sprite a;
    public static boolean b;
    public static volatile boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static Hashtable b;
    public static Hashtable c;
    public static Hashtable d;
    public static Hashtable e;
    public static Vector b;
    public static Vector c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static long a;
    private static long j;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    private static long k;
    public static long i;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static Stack a;
    public static boolean g;
    public static p a;
    public Vector d;
    public ai a;
    public ao a;
    public int u;
    public static boolean h;
    public static boolean i;
    public static int v;
    private static int x;
    public static Hashtable f;
    private static boolean o;
    private static boolean p;
    public static boolean j;
    public static boolean k;
    private static boolean q;
    private static boolean r;
    public static boolean l;
    private static int y;
    private static String i;
    private static StringBuffer a;
    private static Vector e;
    private static byte[] a;
    private static int z;
    private static Stack b;
    private static Stack c;
    private static u a;
    private static ah a;
    private static ah b;
    private static Display a;
    private Thread a;
    private Thread b;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ai b;
    private Hashtable g = new Hashtable();
    private Hashtable h = new Hashtable();
    private aj a;
    private MIDlet a;
    private aa a;
    private Object a;
    private String j;
    public static int w;
    public static volatile boolean m;
    public static volatile boolean n;
    private boolean w;
    private int A;
    private long l;
    private String k;
    private Hashtable i;
    private String l;
    private String m;
    private byte[] b;
    private boolean x;
    private bf a;
    private Vector f = new Vector();
    private v a = null;
    private String n = null;
    private static StringBuffer b;
    private boolean y;
    private ai c;
    private String o;
    private boolean z;
    private static boolean A;
    private static boolean B;
    private static p b;

    public q(MIDlet object, Display display) {
        Display display2 = display;
        display = object;
        object = this;
        this.a = display;
        a = display2;
        if (!((q)object).b()) {
            ((q)object).b();
        }
        a = object;
        d = display.getAppProperty("httype");
        e = display.getAppProperty("m-version");
        f = display.getAppProperty("MIDlet-Version");
        g = display.getAppProperty("icc-collab");
        a = display.getAppProperty("font-url");
        display.getAppProperty("content-encoding");
        ((q)object).a = new v();
        u.i = Integer.parseInt(display.getAppProperty("TOUCH-SWIPE-DIST"));
    }

    private static void c() {
        Object object;
        ak.a();
        if (ax.a != null) {
            ax.a.clear();
        }
        ax.a = null;
        if (au.a != null) {
            au.a.a();
        }
        i = false;
        if (a != null) {
            object = a;
            if (((q)object).d != null) {
                ((q)object).d.removeAllElements();
            }
            ((q)object).d = null;
            ((q)object).a = null;
            ((q)object).a = null;
            ((q)object).a = null;
            ((q)object).a = null;
            ((q)object).c = null;
            ((q)object).a = null;
            ((q)object).b = null;
            ((q)object).a = null;
            ((q)object).a = null;
            ((q)object).a = null;
            if (((q)object).h != null) {
                ((q)object).h.clear();
            }
            ((q)object).h = null;
            if (((q)object).g != null) {
                ((q)object).g.clear();
            }
            ((q)object).g = null;
            ((q)object).b = null;
            ((q)object).a = null;
            ((q)object).b = null;
        }
        if ((a = null) != null) {
            a.clear();
        }
        if ((a = null) != null) {
            a.removeAllElements();
        }
        if ((a = null) != null) {
            a.removeAllElements();
        }
        a = null;
        if (c != null) {
            c.removeAllElements();
        }
        c = null;
        if (b != null) {
            b.removeAllElements();
        }
        b = null;
        if (e != null) {
            e.clear();
        }
        if (f != null) {
            f.clear();
        }
        f = null;
        e = null;
        if (d != null) {
            object = d.elements();
            while (object.hasMoreElements()) {
                ((av)object.nextElement()).a();
            }
            d.clear();
        }
        d = null;
        if (c != null) {
            try {
                object = bj.b();
                bj.a(c, object);
            }
            catch (Exception exception) {
                // empty catch block
            }
            c.clear();
        }
        c = null;
        if (b != null) {
            b.clear();
        }
        b = null;
        a = null;
        a = null;
        b = null;
        a = null;
        if (a != null) {
            a.a();
        }
        a = null;
        if (c != null) {
            c.removeAllElements();
        }
        c = null;
        if (b != null) {
            b.removeAllElements();
        }
        b = null;
        a = null;
        e = null;
        a = null;
        a = null;
        a = null;
        ab.a();
        a = null;
        bg.a();
        ad.a = null;
        ad.b = null;
        ad.c = null;
        ad.d = null;
        ad.e = null;
        ad.f = null;
        ad.g = null;
        ad.h = null;
        ad.i = null;
        ad.j = null;
        ad.k = null;
        ad.l = null;
        ad.m = null;
        ad.n = null;
        ad.o = null;
        ad.p = null;
        ad.q = null;
        ad.r = null;
        ad.s = null;
        ad.t = null;
        ad.u = null;
        bc.b = null;
        bc.a = null;
        aj.c();
        b = null;
        a = false;
    }

    private void d() {
        Object object;
        try {
            a = new Sprite(Image.createImage((String)"/loading.png"), 42, 42);
        }
        catch (Exception exception) {}
        q.e();
        bj.a(this.a.getAppProperty("rms-name"));
        Object object2 = bj.a(c);
        if (object2 != null) {
            c = bj.a((String)object2);
        }
        this.s = true;
        this.a = new Thread(this);
        this.a.start();
        a = new u(this);
        n = a.getWidth();
        o = a.getHeight();
        a.setCurrent((Displayable)a);
        object2 = this;
        try {
            object = object2.getClass().getResourceAsStream("/DEFAULT-PLAIN-MEDIUM.mbf");
            bj.a((InputStream)object);
            ((InputStream)object).close();
            object = object2.getClass().getResourceAsStream("/DEFAULT-BOLD-MEDIUM.mbf");
            bj.a((InputStream)object);
            ((InputStream)object).close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        object = System.getProperty("microedition.locale");
        am.a = object != null && ((String)object).length() >= 2 ? ("TH".equals(object = ((String)object).substring(0, 2).toUpperCase()) || "JA".equals(object) || "ZH".equals(object) || "HI".equals(object) || "KO".equals(object) ? false : false) : false;
        g = true;
        object = ((q)object2).a.getAppProperty("entry-url");
        String string = "twitter";
        String string2 = (String)bj.a(string + "Token");
        if (string2 != null) {
            if (((String)object).startsWith("http:")) {
                object = "https:" + ((String)object).substring(5);
            }
            object = ((String)object).indexOf(63) == -1 ? (String)object + "?" : (String)object + "&";
            object = (String)object + string + "Token=" + string2 + "&" + string + "UID=" + bj.a(string + "UID");
        }
        if ((string = q.a(false, null)) != null && !string.trim().equals("")) {
            object = string;
        }
        if (object == null) {
            throw new NoSuchElementException("jad parameter missing: entry-url");
        }
        super.a((String)object, null, null, null, "GET");
    }

    private static void e() {
        String[] stringArray = new String[]{"5", "2", "2", "7"};
        b.setLength(0);
        for (int i = 0; i < stringArray.length; ++i) {
            b.append(stringArray[i]);
            a.append(' ');
        }
        i = b.toString();
    }

    private void f() {
        int n2 = this.f.size();
        for (int i = 0; i < n2; ++i) {
            Object[] objectArray = (Object[])this.f.elementAt(i);
            if (!((Boolean)objectArray[2]).booleanValue()) continue;
            this.f.removeElementAt(i);
            --i;
            --n2;
        }
    }

    private static String a(boolean bl, String string) {
        String string2 = null;
        String string3 = bj.a();
        bj.a("$icc_internal$");
        if (bl) {
            if (string == null) {
                bj.b(h);
            } else {
                bj.a(h, (Object)string);
            }
        } else {
            string2 = (String)bj.a(h);
        }
        bj.a(string3);
        return string2;
    }

    private void g() {
        ak.b();
        q.n();
        ai ai2 = new ai(false);
        ai2.b();
        ai2.j("main");
        bc bc2 = new aj("System Options", false, "0");
        ag ag2 = new av();
        ((av)ag2).a("alignment:hcenter;font-style:bold;");
        bc2.a((av)ag2);
        ai2.a(bc2);
        bc2 = new bc();
        bc2.b((String)null, "2");
        ai2.a(bc2);
        ag2 = new ai(false);
        bc2 = new aj("Benchmark", false, "0");
        String string = "[:SYSTEM_BENCHMARK:]";
        ag ag3 = ag2;
        ((ai)ag2).a = string;
        ((ai)ag2).a(bc2);
        ai2.a((bc)ag2);
        ag2 = new ai(false);
        bc2 = new aj("Debug", false, "0");
        string = "[:SYSTEM_DEBUG:]";
        ag3 = ag2;
        ((ai)ag2).a = string;
        ((ai)ag2).a(bc2);
        ai2.a((bc)ag2);
        ag2 = new ai(false);
        bc2 = new aj("System Configuration", false, "0");
        string = "[:SYSTEM_CONFIG:]";
        ag3 = ag2;
        ((ai)ag2).a = string;
        ((ai)ag2).a(bc2);
        ai2.a((bc)ag2);
        ag2 = new ai(false);
        bc2 = new aj("System Information", false, "0");
        string = "[:SYSTEM_INFO:]";
        ag3 = ag2;
        ((ai)ag2).a = string;
        ((ai)ag2).a(bc2);
        ai2.a((bc)ag2);
        ag2 = new ai(false);
        bc2 = new aj("Back", false, "0");
        string = "Page.back(s:none)";
        ag3 = ag2;
        ((ai)ag2).a = string;
        ((ai)ag2).a(bc2);
        ai2.a((bc)ag2);
        ak.a(5, ai2);
        this.h.put("main", ai2);
        this.h.put("main:stylesheet:", d);
        this.u = 5;
        this.a(true, true);
    }

    private void h() {
        ak.b();
        q.n();
        ai ai2 = new ai(false);
        ai2.b();
        ai2.j("main");
        ai2.b(a.getWidth());
        ai2.c(a.getHeight());
        Object object = new av();
        object.a("scrollbar:true;scrollbar-face-color: #661133 #661133 #773344;scrollbar-track-color:#FFFFFF;");
        ai2.a((av)object);
        ai2.a((byte)1);
        bc bc2 = new aj("System Console", false, "0");
        object = new av();
        object.a("alignment:hcenter;font-style:bold;");
        bc2.a((av)object);
        ai2.a(bc2);
        bc2 = new bc();
        bc2.b((String)null, "2");
        ai2.a(bc2);
        bc2 = new aj("JAD Properties", false, "0");
        bc2.a((av)object);
        ai2.a(bc2);
        object = new String[]{"MIDlet-Name", "MIDlet-Version", "m-version", "rms-name", "config-url", "server-url"};
        Object object2 = new av();
        ((av)object2).a("alignment:left;font-style:bold;");
        for (int i = 0; i < ((String[])object).length; ++i) {
            bc2 = new aj(object[i] + ":", false, "0");
            bc2.a((av)object2);
            ai2.a(bc2);
            bc2 = new aj(this.a.getAppProperty(object[i]), false, "0");
            ai2.a(bc2);
        }
        bc2 = new bc();
        bc2.b((String)null, "2");
        ai ai3 = new ai(false);
        bc2 = new aj("Back", false, "0");
        object2 = "[:SYSTEM_MENU:]";
        object = ai3;
        ai3.a = object2;
        ai3.a(bc2);
        ai2.a(ai3);
        ak.a(5, ai2);
        this.h.put("main", ai2);
        this.u = 5;
        this.a(true, true);
    }

    private void a(String string, byte[] byArray, Hashtable hashtable, String string2, String string3) {
        h = 0L;
        g = 0L;
        f = 0L;
        b = 0L;
        this.k = string;
        this.b = byArray;
        this.i = hashtable;
        this.l = string2;
        this.m = string3;
        q.a((byte)12);
        e = true;
    }

    private static void a(String object, ai ai2, av av2) {
        object = new aj((String)object, false, "0");
        ((bc)object).a(av2);
        ai2.a((bc)object);
    }

    public static void a(p p2, Hashtable hashtable, String string, boolean bl, byte[] object) {
        if (object == null) {
            p p3 = p2;
            object = p3;
            object = p3.b;
        }
        Object object2 = string;
        p p4 = p2;
        p2.b = object2;
        if (bl) {
            if (p2.a()) {
                p2.a(string, (byte[])object);
            } else {
                object2 = object;
                p4 = p2;
                p2.b = (byte[])object2;
            }
            q.a(p2);
        } else {
            p2.a(string, (byte[])object);
        }
        hashtable.clear();
    }

    private static void a(p p2) {
        a.push(p2);
        int n2 = a.size();
        if (n2 > c) {
            q.c(n2 - c - 1);
        }
    }

    private static void c(int n2) {
        while (n2 >= 0) {
            p p2;
            p p3 = p2 = (p)a.elementAt(n2);
            if (p2.a != null) {
                p p4 = p2;
                p2.a = null;
                p4 = null;
                p3 = p2;
                p2.b = (byte[])p4;
                p4 = null;
                p3 = p2;
                p2.a = (byte[])p4;
                q.b(p2);
                return;
            }
            --n2;
        }
    }

    private static void b(p p2) {
        int n2 = p2.a.size();
        String string = null;
        for (int i = 0; i < n2; ++i) {
            string = (String)p2.a.elementAt(i);
            if (!b.containsKey(string)) continue;
            t t2 = (t)b.get(string);
            if (--t2.a > 0) continue;
            b.remove(string);
        }
        p2.a.removeAllElements();
    }

    private void a(String string, Hashtable hashtable, String string2, boolean bl, String string3) {
        if (bl) {
            q.a(a, this.h, this.b.e(), true, null);
        } else {
            q.b(a);
        }
        this.a(string, null, hashtable, string2 == null ? "NONE" : string2, string3);
    }

    private void a(String string, p p2, boolean bl, String string2, boolean bl2) {
        if (bl) {
            p p3 = new p(null);
            Object object = this.b.e();
            p p4 = p3;
            p3.b = object;
            object = a;
            p4 = p3;
            p3.a = ((p)object).a;
            p4 = a;
            object = p4.c;
            p4 = p3;
            p3.c = object;
            p4 = a;
            object = p4.a;
            p4 = p3;
            p3.a = (byte[])object;
            p4 = a;
            object = p4.d;
            p4 = p3;
            p3.d = object;
            p4 = a;
            p3.a(p4.e);
            p4 = a;
            if (p4.f != null) {
                p4 = a;
                object = new String(p4.f);
                p4 = p3;
                p3.f = object;
            }
            object = null;
            p4 = a;
            a.f = object;
            q.a(p3);
        }
        if (bl2) {
            q.a(a, this.h, this.b.e(), false, null);
        }
        this.a(null, p2.a(string), null, string2, "GET");
    }

    private void b(String string, boolean bl) {
        if (a.size() > 0) {
            this.x = true;
            p p2 = (p)a.pop();
            if (p2 == null) {
                return;
            }
            if (bl) {
                this.a(p2, string);
            } else if (p2.a()) {
                Object object = p2;
                object = ((p)object).b;
                this.a((String)object, p2, false, string, false);
            } else if (p2.a(null) != null) {
                q.b(a);
                this.a(null, p2.a(null), null, string, "GET");
            } else {
                p p3 = p2;
                if (p3.a != null) {
                    p3 = p2;
                    this.a(p3.a, null, null, string, "GET");
                }
            }
            a = p2;
        }
    }

    private void a(p p2, String string) {
        this.a(p2.a, null, null, string, "GET");
    }

    private void i() {
        Vector vector = null;
        int n2 = this.d.size();
        while (--n2 >= 0) {
            vector = (Vector)this.d.elementAt(n2);
            int n3 = vector.size();
            while (--n3 >= 0) {
                ((ai)vector.elementAt(n3)).h();
            }
        }
    }

    private boolean c() {
        boolean bl = true;
        if (this.u == 13) {
            this.o();
        } else if (this.u == 12) {
            this.c(null, false);
        } else if (this.u == 14) {
            this.c(null, false);
        } else if (this.u == 15) {
            this.c(null, false);
        } else if (this.u == 11) {
            this.a((String)null, true);
        } else {
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void j() {
        ag ag2;
        int n2;
        Object object;
        int n3;
        block66: {
            block67: {
                this.a = null;
                n3 = w;
                this.A = this.w ? (this.A = this.A + 1) : 0;
                w = Integer.MIN_VALUE;
                if (n3 == Integer.MIN_VALUE) return;
                if (n3 == i) {
                    if (!o) {
                        if (this.c()) return;
                    }
                    if (au.a == null) return;
                    if (j) return;
                    this.b(au.a, au.a.b());
                    return;
                }
                if (n3 == j) {
                    if (b) {
                        k.b(this);
                        return;
                    }
                    if (!p) {
                        if (this.c()) return;
                    }
                    if (au.a == null) return;
                    if (k) return;
                    this.b(au.a, au.a.c());
                    return;
                }
                if (n3 == h) {
                    if (q.a.b != null) {
                        this.b(null, q.a.b);
                        return;
                    }
                    if (this.a != null && this.u == 11) {
                        this.a((String)null, false);
                        return;
                    }
                    if (this.d.size() <= 0) return;
                    ai ai2 = this.a;
                    this.b(this.a, ai2.a);
                    return;
                }
                if (this.u && n3 != Integer.MIN_VALUE) {
                    this.a.a(n3, a, (Displayable)a, this.A, false, null);
                    return;
                }
                if (n3 != Integer.MIN_VALUE && n3 >= 48 && n3 <= 59) {
                    if (this.a == null) return;
                    ai ai3 = this.a;
                    if (!ai3.e) return;
                    ai ai4 = this.a;
                    if (ai4.a == null) return;
                    ai4 = this.a;
                    this.b(this.a, ai4.a);
                    this.a.a(n3, a, (Displayable)a, this.A, false, null);
                    return;
                }
                if (n3 == k) {
                    if (!q) {
                        if (this.c()) return;
                    }
                    if (q.a.a == null) {
                        if (this.u != 5) return;
                        if (r) return;
                        q.a(null, "Page.back", null);
                        return;
                    }
                    if (r) return;
                    this.b(null, q.a.a);
                    return;
                }
                if (!this.t) break block66;
                object = d;
                n2 = n3;
                ag2 = (aw)this.a;
                if (((aw)ag2).e != 0 && ((aw)ag2).e != 2) break block67;
                if (n2 == g) {
                    ((aw)ag2).c((Hashtable)object);
                    break block66;
                } else if (n2 == f) {
                    ((aw)ag2).d((Hashtable)object);
                }
                break block66;
            }
            if (((aw)ag2).e == 3 || ((aw)ag2).e == 1) {
                if (n2 == e) {
                    ((aw)ag2).c((Hashtable)object);
                } else if (n2 == d) {
                    ((aw)ag2).d((Hashtable)object);
                }
            }
        }
        if (n3 == f) {
            if (q.a.c != null) {
                this.b(null, q.a.c);
                return;
            }
            ag2 = this;
            if (((q)ag2).a != null) {
                object = ((q)ag2).a;
                super.b(((q)ag2).a, ((ai)object).m);
            }
            if (super.b(f)) return;
            n2 = 0;
            if (((q)ag2).t) {
                aw aw2 = (aw)((q)ag2).a;
                n2 = aw2.e;
                if (n2 == 0) return;
                if (n2 == 2) {
                    return;
                }
            }
            if (q.a.a <= 0) return;
            super.p();
            --q.a.a;
            super.b(false);
            return;
        }
        if (n3 == g) {
            if (q.a.d != null) {
                this.b(null, q.a.d);
                return;
            }
            ag2 = this;
            if (((q)ag2).a != null) {
                ai ai5 = ((q)ag2).a;
                super.b(((q)ag2).a, ai5.n);
            }
            if (super.b(g)) return;
            n2 = 0;
            if (((q)ag2).t) {
                aw aw3 = (aw)((q)ag2).a;
                n2 = aw3.e;
                if (n2 == 0) return;
                if (n2 == 2) {
                    return;
                }
            }
            if (((q)ag2).d == null) return;
            if (q.a.b >= ((q)ag2).d.size()) return;
            object = (Vector)((q)ag2).d.elementAt(q.a.b);
            if (q.a.a >= ((Vector)object).size() - 1) return;
            super.p();
            ++q.a.a;
            super.b(false);
            return;
        }
        if (n3 == e) {
            if (q.a.f != null) {
                this.b(null, q.a.f);
                return;
            }
            ag2 = this;
            n2 = 0;
            if (((q)ag2).a != null) {
                ai ai6 = ((q)ag2).a;
                super.b(((q)ag2).a, ai6.p);
            }
            if (super.b(e)) return;
            int n4 = -1;
            if (((q)ag2).t) {
                aw aw4 = (aw)((q)ag2).a;
                n4 = aw4.e;
                if (n4 == 3) return;
                if (n4 == 1) {
                    return;
                }
            }
            Vector vector = null;
            boolean bl = false;
            if (((q)ag2).d.size() > q.a.b + 1) {
                vector = (Vector)((q)ag2).d.elementAt(q.a.b + 1);
                if (q.a.a > vector.size() - 1) {
                    q.a.a = 0;
                }
                ai ai7 = (ai)vector.elementAt(q.a.a);
                bl = ai7.d;
                if (bl) {
                    if (n4 == 0) {
                        q.a.a = 0;
                    }
                    super.p();
                    ++q.a.b;
                    super.b(false);
                } else {
                    n2 = 1;
                }
            }
            super.i();
            if (n2 != 0) {
                q.a((byte)14);
                return;
            }
            if (bl) return;
            q.a((byte)6);
            return;
        }
        if (n3 == d) {
            Object object2;
            if (q.a.e != null) {
                this.b(null, q.a.e);
                return;
            }
            ag2 = this;
            n2 = 0;
            if (((q)ag2).a != null) {
                ai ai8 = ((q)ag2).a;
                super.b(((q)ag2).a, ai8.o);
            }
            if (super.b(d)) return;
            int n5 = -1;
            if (((q)ag2).t) {
                object2 = (aw)((q)ag2).a;
                n5 = ((aw)object2).e;
                if (n5 == 3) return;
                if (n5 == 1) {
                    return;
                }
            }
            n3 = 0;
            object2 = null;
            if (q.a.b > 0) {
                object2 = (Vector)((q)ag2).d.elementAt(q.a.b - 1);
                if (q.a.a > ((Vector)object2).size() - 1) {
                    q.a.a = 0;
                }
                object2 = (ai)((Vector)object2).elementAt(q.a.a);
                boolean bl = ((ai)object2).d;
                n3 = bl ? 1 : 0;
                if (bl) {
                    if (n5 == 2) {
                        q.a.a = 0;
                    }
                    super.p();
                    --q.a.b;
                    super.b(false);
                } else {
                    n2 = 1;
                }
            }
            super.i();
            if (n2 != 0) {
                q.a((byte)15);
                return;
            }
            if (n3 != 0) return;
            q.a((byte)7);
            return;
        }
        switch (n3) {
            case 49: {
                if (q.a.g == null) return;
                this.b(null, q.a.g);
                return;
            }
            case 50: {
                if (q.a.h == null) return;
                this.b(null, q.a.h);
                return;
            }
            case 51: {
                if (q.a.i == null) return;
                this.b(null, q.a.i);
                return;
            }
            case 52: {
                if (q.a.j == null) return;
                this.b(null, q.a.j);
                return;
            }
            case 53: {
                if (q.a.k == null) return;
                this.b(null, q.a.k);
                return;
            }
            case 54: {
                if (q.a.l == null) return;
                this.b(null, q.a.l);
                return;
            }
            case 55: {
                if (q.a.m == null) return;
                this.b(null, q.a.m);
                return;
            }
            case 56: {
                if (q.a.n == null) return;
                this.b(null, q.a.n);
                return;
            }
            case 57: {
                if (q.a.o == null) return;
                this.b(null, q.a.o);
                return;
            }
            case 48: {
                if (q.a.p == null) return;
                this.b(null, q.a.p);
                return;
            }
            case 42: {
                if (q.a.q == null) return;
                this.b(null, q.a.q);
                return;
            }
            case 35: {
                if (q.a.r == null) return;
                this.b(null, q.a.r);
                return;
            }
        }
    }

    public final void a(int n2, boolean bl) {
        if ((m || !n) && n2 == j) {
            this.b();
            return;
        }
        w = n2;
        a.deleteCharAt(a.length() - 1);
        a.insert(0, (char)n2);
        if (a.toString().equals(i)) {
            q.a(a, this.h, this.b.e(), true, null);
            this.g();
        }
        this.w = bl;
    }

    public final void a(boolean bl) {
        w = Integer.MIN_VALUE;
        this.s = bl;
        this.A = 0;
    }

    public static void a(byte by) {
        if (by == 2) {
            B = true;
            return;
        }
        if (by == 1) {
            A = true;
            return;
        }
        q.a[q.z++] = by;
    }

    public static void a(af objectArray, Object object) {
        if (object != null) {
            objectArray = new Object[]{objectArray, object};
            e.insertElementAt(objectArray, 0);
        }
    }

    private void k() {
        if (b && !u.c) {
            if (w == j) {
                this.j();
            }
            Thread.currentThread().setPriority(1);
            if (w == j) {
                this.j();
            }
            a.b();
        } else if (!d || u.c) {
            Thread.currentThread().setPriority(5);
            if (!b && c) {
                c = false;
            }
            boolean bl = false;
            if (!u.b) {
                Object object;
                Object object2;
                this.j();
                if (u.b != null) {
                    bl = true;
                    this.p();
                    q.a.b = u.g;
                    q.a.a = u.h;
                    a.b(false);
                }
                q q2 = this;
                int n2 = e.size();
                while (--n2 >= 0) {
                    object2 = (Object[])e.elementAt(n2);
                    object = (af)object2[0];
                    Object object3 = object2[1];
                    e.removeElementAt(n2);
                    q2.b((af)object, object3);
                }
                n2 = 0;
                object2 = null;
                object = null;
                boolean bl2 = true;
                block1: for (int i = 0; i < a.size() && bl2; ++i) {
                    object2 = (Vector)a.elementAt(i);
                    n2 = ((Vector)object2).size();
                    for (int j = 0; j < n2; ++j) {
                        object = (Vector)((Vector)object2).elementAt(j);
                        for (int i2 = 0; i2 < a.length; ++i2) {
                            if (!a[i2]) {
                                q.a[i2] = true;
                                z z2 = new z(null, ((Vector)object).elementAt(0).toString(), ((Vector)object).elementAt(1).toString(), (Hashtable)((Vector)object).elementAt(2), (Hashtable)((Vector)object).elementAt(3), i2, i == 1);
                                if (((Vector)object).elementAt(5) != null) {
                                    z2.a((ab)((Vector)object).elementAt(4), ((Vector)object).elementAt(5));
                                }
                                new Thread(z2).start();
                                ((Vector)object2).removeElement(object);
                                --j;
                                --n2;
                                break;
                            }
                            bl2 = false;
                        }
                        if (!bl2) continue block1;
                    }
                }
            }
            this.m();
            if (!u.b) {
                this.l();
                if (u.b != null && bl) {
                    ai ai2 = u.b;
                    q.a(u.b, ai2.a);
                    u.b = null;
                }
            }
        }
        if (bj.a) {
            if (bj.a == 0L) {
                bj.a = System.currentTimeMillis();
            }
            if (bj.a + 3000L > System.currentTimeMillis()) {
                if (!u.d) {
                    a.c();
                } else {
                    u.d = false;
                }
            } else {
                bj.a = false;
                bj.a = 0L;
                q.a((byte)1);
            }
        }
        this.a.b();
    }

    private boolean b(int n2) {
        String string;
        boolean bl = false;
        bc bc2 = null;
        if (this.a != null) {
            string = null;
            if (n2 == e) {
                ai ai2 = this.a;
                string = ai2.d;
            } else if (n2 == d) {
                ai ai3 = this.a;
                string = ai3.c;
            } else if (n2 == g) {
                ai ai4 = this.a;
                string = ai4.b;
            } else if (n2 == f) {
                ai ai5 = this.a;
                string = ai5.a;
            }
            if (string != null) {
                bc2 = ak.a(string);
            }
        }
        if (bc2 != null && bc2 instanceof ai) {
            ai ai6 = (ai)bc2;
            if (ai6.d) {
                string = null;
                int n3 = -1;
                int n4 = -1;
                int n5 = this.d.size();
                while (--n5 >= 0) {
                    Vector vector = (Vector)this.d.elementAt(n5);
                    n4 = vector.indexOf(bc2);
                    if (n4 == -1) continue;
                    n3 = n5;
                    break;
                }
                if (n3 != -1 && n4 != -1) {
                    this.p();
                    q.a.b = n3;
                    q.a.a = n4;
                    this.b(false);
                    bl = true;
                }
            }
        }
        return bl;
    }

    private void l() {
        int n2 = this.f.size();
        if (n2 > 0) {
            long l = System.currentTimeMillis();
            for (int i = 0; i < n2; ++i) {
                Object[] objectArray = (Object[])this.f.elementAt(i);
                if (l <= (Long)objectArray[1]) continue;
                this.f.removeElementAt(i);
                --i;
                --n2;
                this.b(null, objectArray[0]);
            }
        }
    }

    private void m() {
        if (this.a != null) {
            if (!this.a.c()) {
                this.a.d();
                q.a((byte)2);
            } else {
                this.a = null;
            }
        }
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        int n3 = 0;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n4 = 0;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        int n5 = 0;
        while (z > n5) {
            switch (a[n5++]) {
                case 18: {
                    bl14 = true;
                    break;
                }
                case 4: {
                    n2 = 1;
                    break;
                }
                case 5: {
                    n3 = 1;
                    break;
                }
                case 3: {
                    bl2 = true;
                    break;
                }
                case 6: {
                    ++t;
                    bl5 = true;
                    bl = true;
                    break;
                }
                case 7: {
                    ++t;
                    bl6 = true;
                    bl = true;
                    break;
                }
                case 14: {
                    bl10 = true;
                    bl = true;
                    break;
                }
                case 15: {
                    bl11 = true;
                    bl = true;
                    break;
                }
                case 16: {
                    bl12 = true;
                    bl3 = true;
                    bl = true;
                    break;
                }
                case 8: {
                    n4 = 1;
                    bl = true;
                    break;
                }
                case 9: {
                    bl7 = true;
                    bl = true;
                    break;
                }
                case 10: {
                    bl8 = true;
                    bl = true;
                    break;
                }
                case 13: {
                    bl4 = true;
                    break;
                }
                case 11: {
                    bl9 = true;
                    break;
                }
                case 12: {
                    z = 0;
                    this.q();
                    this.b = new Thread(this);
                    this.b.start();
                    return;
                }
                case 17: {
                    bl13 = true;
                    break;
                }
                case 19: {
                    bl15 = true;
                }
            }
        }
        z = 0;
        if (A) {
            bl3 = true;
            bl = true;
        } else if (B) {
            bl = true;
        }
        A = false;
        B = false;
        if (bl14) {
            int n6 = this.z;
            Object object = this.o;
            q q2 = this;
            if (object == null) {
                int n7 = b.size();
                object = (String)b.elementAt(n7 - 2);
            } else {
                b.indexOf(object);
            }
            bc bc2 = ak.a((String)object);
            if (bc2 != null) {
                ai ai2;
                if (n6 != 0 && q2.u == 13) {
                    ai2 = (ai)bc2;
                    if (ai2.d == 12) {
                        q2.o();
                    }
                }
                bc2.d(n6 != 0);
                q2.i();
                if (n6 != 0) {
                    ak.a(q2.u, new byte[]{(byte)q.a.b, (byte)q.a.a});
                    ai2 = (ai)bc2;
                    n6 = ai2.d;
                    q2.a(q2.u, (String)object);
                    if (n6 == 0) {
                        q2.u = 12;
                    } else {
                        q2.u = n6 + 12 + 1;
                        if (q2.a != null) {
                            int n8 = q2.a.g();
                            n6 = q2.a.f();
                            object = (ai)bc2;
                            if ((((ai)object).a.d | ((ai)object).a.c) == 0 && ((ai)object).a.d == 0) {
                                ((ai)object).a.d = (byte)3;
                                int n9 = a.getWidth();
                                int n10 = a.getHeight() - (au.a != null ? au.a.i : 0);
                                ((ai)object).a(a.getWidth(), a.getHeight());
                                int n11 = n9 - n6;
                                ((ai)object).a.z = n11 > ((ai)object).h + 15 ? n6 + 15 : (n11 > ((ai)object).h ? n6 + (n11 - ((ai)object).h) : n9 - ((ai)object).h);
                                ((ai)object).a.y = n10 > ((ai)object).i + n8 ? n8 : n10 - ((ai)object).i;
                            }
                        }
                    }
                    ak.b(q2.u);
                    ak.a(a.getWidth(), a.getHeight());
                    q2.a(true, true);
                } else {
                    q2.p();
                    q2.u = q.c();
                    byte[] byArray = ak.a(q2.u);
                    if (byArray != null) {
                        q.a.b = byArray[0];
                        q.a.a = byArray[1];
                    } else {
                        q.a.b = 0;
                        q.a.a = 0;
                    }
                    q2.a(false, true);
                }
                q.a((byte)1);
            }
        }
        if (n2 != 0) {
            ai ai3 = this.b;
            q.a(this.b, ai3.e);
        }
        if (n3 != 0) {
            ai ai4 = this.b;
            q.a(this.b, ai4.f);
        }
        if (bl7) {
            ak.a(a.getWidth(), a.getHeight());
            this.a(true, true);
        } else if (n4 != 0) {
            ak.a(a.getWidth(), a.getHeight());
            this.a(false, true);
        } else if (bl8) {
            ak.a(a.getWidth(), a.getHeight());
            this.a(false, false);
            Object var4_5 = null;
            n3 = -1;
            n2 = -1;
            n4 = this.d.size();
            while (--n4 >= 0) {
                Vector vector = (Vector)this.d.elementAt(n4);
                n2 = vector.indexOf(this.a);
                if (n2 == -1) continue;
                n3 = n4;
                break;
            }
            if (n3 != -1 && n2 != -1) {
                q.a.b = n3;
                q.a.a = n2;
            }
        }
        if (bl5) {
            this.a(true, null, true);
            bl3 = true;
        }
        if (bl6) {
            this.a(false, null, true);
            bl3 = true;
        }
        if (bl13 && u.a != null) {
            x = v;
            x = v > 40 || v < -40 ? (x -= (v >>= 2)) : (v > 20 || v < -20 ? (x -= (v >>= 1)) : 0);
            ak.a(this.u, v);
            u.a.s();
            bl = true;
            if (x != 0) {
                v = x;
                q.a((byte)17);
            } else {
                v = 0;
            }
        }
        if (bl10) {
            ai ai5;
            Vector vector = (Vector)this.d.elementAt(q.a.b + 1);
            if (q.a.a > vector.size() - 1) {
                q.a.a = 0;
            }
            if (this.a(true, ai5 = (ai)vector.elementAt(q.a.a), true)) {
                this.p();
                ++q.a.b;
                this.b(false);
            }
            bl3 = true;
        } else if (bl11) {
            ai ai6 = null;
            if (q.a.b > 0) {
                Vector vector = (Vector)this.d.elementAt(q.a.b - 1);
                if (q.a.a > vector.size() - 1) {
                    q.a.a = 0;
                }
                ai6 = (ai)vector.elementAt(q.a.a);
            }
            if (this.a(false, ai6, true)) {
                this.p();
                --q.a.b;
                this.b(false);
            }
            bl3 = true;
        }
        if (bl12) {
            ak.c();
        }
        if (bl3) {
            ak.a(a.getWidth(), a.getHeight());
        }
        if (bl4) {
            ai ai7 = this.b;
            if (ai7.h != null && a != null) {
                ai7 = this.b;
                this.a.a(a, b, a, ai7.h);
            }
        }
        if (bl9) {
            this.a(this.n, null, true);
            bl = true;
        }
        if (bl15) {
            this.i();
        }
        if (bl) {
            bc.f = true;
            boolean bl16 = this.b == null || this.b.a.b == null && this.b.a.a == null;
            a.a(bl16);
        } else if (bl2) {
            a.a(false);
        }
        bc.f = false;
    }

    private void c(p p2) {
        Object object;
        k = System.currentTimeMillis();
        a = new ab(null);
        ab.a = false;
        a.a_("Page", this);
        Object object2 = p2;
        object2 = ((p)object2).b;
        if (object2 != null) {
            for (int j = 0; j < ((Vector)object2).size(); ++j) {
                object = i.a(((Vector)object2).elementAt(j));
                if (object == null) continue;
                a.a(((f)object).a);
            }
        }
        object = p2;
        a.a(((p)object).a);
        k = System.currentTimeMillis() - k;
    }

    private void b(af af2, Object object) {
        System.gc();
        Object object2 = null;
        if (object instanceof af) {
            object = (af)object;
            b.a(0);
            ((af)object).a(a, af2, b);
            return;
        }
        if (object != null) {
            object2 = object.toString();
        }
        if (object2 != null) {
            if ("[:SYSTEM_BENCHMARK:]".equals(object2)) {
                af2 = this;
                object2 = new av();
                ((av)object2).a("font-style:bold;color:#ff0000");
                ag ag2 = new av();
                ((av)ag2).a("color:#ff0000");
                ag2 = new ai(false);
                av av2 = new av();
                av2.a("background-color:#FFFFFF");
                ((bc)ag2).a(av2);
                ak.a(5, (bc)ag2);
                ((q)af2).h.put("main", ag2);
                ((q)af2).h.put("main:stylesheet:", d);
                ((q)af2).u = 5;
                q.a("Content Length:" + a, (ai)ag2, (av)object2);
                q.a("Total(time):" + j, (ai)ag2, (av)object2);
                q.a("Connect&Read:" + b, (ai)ag2, (av)object2);
                q.a("Header Parsing:" + i, (ai)ag2, (av)object2);
                q.a("MMF Decoding:" + d, (ai)ag2, (av)object2);
                q.a("CSS Parsing:" + h, (ai)ag2, (av)object2);
                q.a("Script Loading:" + k, (ai)ag2, (av)object2);
                q.a("Xmp Parsing:" + e, (ai)ag2, (av)object2);
                ak.a(10, (bc)ag2);
                q.a((byte)1);
                return;
            }
            if ("[:SYSTEM_DEBUG:]".equals(object2)) {
                af2 = this;
                ak.b();
                q.n();
                object = new ai(false);
                ((ai)object).b();
                ((bc)object).j("main");
                ((bc)object).b(a.getWidth());
                ((bc)object).c(a.getHeight());
                object2 = new av();
                ((av)object2).a("scrollbar:true;scrollbar-face-color: #661133 #661133 #773344;scrollbar-track-color:#FFFFFF;");
                ((bc)object).a((av)object2);
                ((ai)object).a((byte)1);
                bc bc2 = new aj("Debug Screen", false, "0");
                object2 = new av();
                ((av)object2).a("alignment:hcenter;font-style:bold;");
                bc2.a((av)object2);
                ((ai)object).a(bc2);
                bc2 = new bc();
                bc2.b((String)null, "2");
                ((ai)object).a(bc2);
                bc2 = new aj("Debug Information:", false, "0");
                object2 = new av();
                ((av)object2).a("alignment:left;font-style:bold;");
                bc2.a((av)object2);
                ((ai)object).a(bc2);
                bc2 = new aj(bj.a.toString() + bj.a.length(), false, "0");
                object2 = new av();
                ((av)object2).a("alignment:left;");
                bc2.a((av)object2);
                ((ai)object).a(bc2);
                ai ai2 = new ai(false);
                bc2 = new aj("Back", false, "0");
                String string = "[:SYSTEM_MENU:]";
                ai ai3 = ai2;
                ai2.a = string;
                ai2.a(bc2);
                ((ai)object).a(ai2);
                ak.a(5, (bc)object);
                ((q)af2).h.put("main", object);
                ((q)af2).h.put("main:stylesheet:", d);
                ((q)af2).u = 5;
                super.a(true, true);
                return;
            }
            if ("[:SYSTEM_CONFIG:]".equals(object2)) {
                af2 = this;
                ak.b();
                q.n();
                object = new ai(false);
                ((ai)object).b();
                ((bc)object).j("main");
                object2 = new aj("System Configuration", false, "0");
                ag ag3 = new av();
                ag3.a("alignment:hcenter;font-style:bold;");
                ((bc)object2).a((av)ag3);
                ((ai)object).a((bc)object2);
                ag3 = new bc();
                ((bc)ag3).b((String)null, "2");
                ((ai)object).a((bc)ag3);
                object2 = new aj("Set Buffer Size:", false, "0");
                ag3 = new av();
                ag3.a("alignment:left;font-style:bold;");
                ((bc)object2).a((av)ag3);
                ((ai)object).a((bc)object2);
                ai ai4 = new ai(false);
                object2 = new aj(Integer.toString(bj.a), true, null);
                ((bc)object2).j("buffer_TextBox");
                ag ag4 = new av();
                ((av)ag4).a("border-width:1;border-color:#ff0000;");
                ((bc)object2).a((av)ag4);
                String string = "triggerInput(s:buffer_TextBox)";
                ai ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                object2 = new aj("Set Server URL:", false, "0");
                ((bc)object2).a((av)ag3);
                ((ai)object).a((bc)object2);
                ai4 = new ai(false);
                object2 = new aj(b, true, null);
                ((bc)object2).j("url_TextBox");
                ((bc)object2).a((av)ag4);
                string = "triggerInput(s:url_TextBox)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(true);
                object2 = new aj("Current Mode: ", false, "0");
                ag4 = new aj("None Set", false, "0");
                if (bj.b == 0) {
                    ag4 = new aj("LOCAL", false, "0");
                } else if (bj.b == 1) {
                    ag4 = new aj("SERVER", false, "0");
                } else if (bj.b == 2) {
                    ag4 = new aj("BOTH", false, "0");
                } else if (bj.b == 3) {
                    ag4 = new aj("DISABLE", false, "0");
                } else if (bj.b == 4) {
                    ag4 = new aj("DEBUG", false, "0");
                }
                ((bc)object2).a((av)ag3);
                ai4.a((bc)object2);
                ai4.a((bc)ag4);
                ((ai)object).a(ai4);
                object2 = new aj("Set Mode:", false, "0");
                ((bc)object2).a((av)ag3);
                ((ai)object).a((bc)object2);
                ai4 = new ai(true);
                object2 = new aj("LOCAL", false, "0");
                ((bc)object2).a((av)ag3);
                ag4 = new ax(1, null, "mygroup", "0");
                ((bc)ag4).j(Integer.toString(0));
                ((bc)ag4).a("debug_setMode", ((q)af2).g);
                string = "Page.setValue(s:debug_setMode,s:0)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)ag4);
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(true);
                object2 = new aj("SERVER", false, "0");
                ((bc)object2).a((av)ag3);
                ag4 = new ax(1, null, "mygroup", "1");
                ((bc)ag4).j(Integer.toString(1));
                ((bc)ag4).a("debug_setMode", ((q)af2).g);
                string = "Page.setValue(s:debug_setMode,s:1)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)ag4);
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(true);
                object2 = new aj("BOTH", false, "0");
                ((bc)object2).a((av)ag3);
                ag4 = new ax(1, null, "mygroup", "2");
                ((bc)ag4).j(Integer.toString(2));
                ((bc)ag4).a("debug_setMode", ((q)af2).g);
                string = "Page.setValue(s:debug_setMode,s:2)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)ag4);
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(true);
                object2 = new aj("DISABLE", false, "0");
                ((bc)object2).a((av)ag3);
                ag4 = new ax(1, null, "mygroup", "3");
                ((bc)ag4).j(Integer.toString(3));
                ((bc)ag4).a("debug_setMode", ((q)af2).g);
                string = "Page.setValue(s:debug_setMode,s:3)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)ag4);
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(true);
                object2 = new aj("DEBUG", false, "0");
                ((bc)object2).a((av)ag3);
                ag4 = new ax(1, null, "mygroup", "4");
                ((bc)ag4).j(Integer.toString(4));
                ((bc)ag4).a("debug_setMode", ((q)af2).g);
                string = "Page.setValue(s:debug_setMode,s:4)";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)ag4);
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(false);
                object2 = new aj("Save", false, "0");
                string = "[:SYSTEM_SAVE_CONFIG:]";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ai4 = new ai(false);
                object2 = new aj("Back", false, "0");
                string = "[:SYSTEM_MENU:]";
                ai5 = ai4;
                ai4.a = string;
                ai4.a((bc)object2);
                ((ai)object).a(ai4);
                ak.a(5, (bc)object);
                ((q)af2).h.put("main", object);
                ((q)af2).h.put("main:stylesheet:", d);
                ((q)af2).u = 5;
                super.a(true, true);
                return;
            }
            if ("[:SYSTEM_INFO:]".equals(object2)) {
                this.h();
                return;
            }
            if ("[:SYSTEM_MENU:]".equals(object2)) {
                this.g();
                return;
            }
            if ("[:SYSTEM_SAVE_CONFIG:]".equals(object2)) {
                b = ak.a("url_TextBox").a().toString();
                bj.a = Integer.parseInt(ak.a("buffer_TextBox").a().toString());
                bj.a(Integer.parseInt((String)this.b("debug_setMode")));
                return;
            }
            if ("[:soft-key-toggle-native-input:]".equals(object2)) {
                if (au.a != null) {
                    object = au.a.c();
                    if (object != null) {
                        this.o();
                        ((aj)object).a(a, (Displayable)a, null);
                    }
                    return;
                }
            } else if ("[:soft-key-toggle-input-type:]".equals(object2)) {
                if (au.a != null) {
                    object = au.a.c();
                    if (object != null) {
                        ((aj)object).g();
                        au.a.a((aj)object);
                    }
                    return;
                }
            } else {
                int n2;
                if ("[:soft-key-copy-text:]".equals(object2)) {
                    au.a.i();
                    this.o();
                    return;
                }
                if ("[:soft-key-paste-text:]".equals(object2)) {
                    au.a.j();
                    this.o();
                    return;
                }
                int n3 = ((String)object2).indexOf(40);
                if (n3 != -1 && (n2 = ((String)object2).lastIndexOf(41)) != -1) {
                    String string = ((String)object2).substring(n3 + 1, n2).trim();
                    String string2 = ((String)object2).substring(0, n3).trim();
                    q.a(af2, string2, string);
                }
            }
        }
    }

    private static void n() {
        d = new Hashtable();
        av av2 = new av();
        d.put("vbox", av2);
        av2 = new av();
        new av().b = new int[1];
        av2.b[0] = 0xFFFFFF;
        d.put(":F:vbox", av2);
    }

    private void a(String string, Object object, String string2, String object2, boolean bl, String string3, String object3) {
        w = Integer.MIN_VALUE;
        if ((object3 = ak.a((String)object3)) != null) {
            u.c = ((bc)object3).f();
            u.d = ((bc)object3).g();
            u.e = ((bc)object3).b();
            u.f = ((bc)object3).c();
        }
        if (this.u == 5 && this.a != null) {
            object3 = this.a.e();
            if (object3 == null) {
                object3 = Long.toString(System.currentTimeMillis());
                this.a.j((String)object3);
            }
            Object object4 = object3;
            object3 = a;
            a.f = object4;
        }
        this.j = object2;
        object3 = null;
        if (string.indexOf("local:") != -1) {
            this.v = true;
            this.a(string.substring("local:".length()), a, true, string2, bl);
            return;
        }
        this.v = false;
        object2 = null;
        int n2 = 0;
        Hashtable hashtable = new Hashtable();
        if (object != null) {
            if (object instanceof String) {
                if (((String)(object = object.toString())).length() > 0) {
                    boolean bl2 = false;
                    int n3 = 0;
                    int n4 = 0;
                    Object object5 = null;
                    object2 = null;
                    while (!bl2) {
                        if ((n4 = ((String)object).indexOf(32, n4)) == -1) {
                            object3 = ((String)object).substring(n3, ((String)object).length());
                            bl2 = true;
                        } else {
                            object3 = ((String)object).substring(n3, n4);
                            n3 = ++n4;
                        }
                        object2 = (s)this.g.get(object3);
                        if (object2 != null) {
                            object5 = ((s)object2).a(true);
                            if (object5 == null) continue;
                            ++n2;
                            hashtable.put(object3, object5);
                            continue;
                        }
                        object2 = ak.a((String)object3);
                        if (object2 == null) continue;
                        object5 = ((bc)object2).a();
                        object2 = ((bc)object2).d();
                        if (object5 == null) continue;
                        ++n2;
                        hashtable.put(object2 == null ? object3 : object2, object5);
                    }
                }
            } else {
                hashtable = ((ad)object).a();
                int n5 = n2 = hashtable.isEmpty() ? 0 : 1;
            }
        }
        if (n2 == 0) {
            hashtable = null;
        }
        this.a(string, hashtable, string2, bl, string3);
    }

    private static void a(String string) {
        String string2 = null;
        if (string != null && string.length() > 0) {
            boolean bl = false;
            int n2 = 0;
            int n3 = 0;
            block0: while (!bl) {
                if ((n3 = string.indexOf(32, n3)) == -1) {
                    string2 = string.substring(n2, string.length());
                    bl = true;
                } else {
                    string2 = string.substring(n2, n3);
                    n2 = ++n3;
                }
                p p2 = null;
                boolean bl2 = false;
                int n4 = a.size();
                while (--n4 >= 0) {
                    p2 = (p)a.elementAt(n4);
                    if (string2.equals(p2.c)) {
                        bl2 = true;
                        continue;
                    }
                    if (!bl2) continue;
                    int n5 = a.size();
                    while (--n5 > n4) {
                        p p3 = (p)a.pop();
                        p2 = p3;
                        p2 = p3;
                        p3.a = null;
                        p2.b = null;
                        if (p2.a == null) continue;
                        p2.a.clear();
                        p2.a = null;
                    }
                    continue block0;
                }
            }
        }
    }

    private Object b(String object) {
        Object object2 = null;
        s s2 = (s)this.g.get(object);
        if (s2 != null) {
            object2 = s2.a(true);
        } else if ((object = ak.a((String)object)) != null) {
            object2 = (String)((bc)object).a();
        }
        return object2;
    }

    private static Object a(int n2, boolean bl) {
        if (au.a != null) {
            switch (n2) {
                case 0: {
                    if (bl) {
                        return au.a.b();
                    }
                    return au.a.b();
                }
                case 1: {
                    if (bl) {
                        return au.a.c();
                    }
                    return au.a.c();
                }
            }
        }
        return null;
    }

    private void c(String string, boolean bl) {
        this.o = string;
        this.z = bl;
        q.a((byte)18);
    }

    private void o() {
        if (au.a != null) {
            this.i();
            ai ai2 = au.a.a();
            if (ai2.c()) {
                this.p();
                ai2.d(false);
                this.u = q.c();
                byte[] byArray = ak.a(this.u);
                if (byArray != null) {
                    q.a.b = byArray[0];
                    q.a.a = byArray[1];
                } else {
                    q.a.b = 0;
                    q.a.a = 0;
                }
                this.a(false, true);
                this.u = au.a.b();
            } else if (ak.a[13] != null && ak.a[13].a() > 0) {
                Object object = (ai)ak.a[13].a(0);
                if (((ai)object).a.a() > 0) {
                    au.a.a((aj)null);
                    if (this.a != null) {
                        int n2;
                        object = this.a;
                        object = ((ai)object).a;
                        int n3 = n2 = ((bd)object).a();
                        while (--n3 >= 0) {
                            bc bc2 = ((bd)object).a(n3);
                            if (!(bc2 instanceof aj) || !"textbox".equals(bc2.f())) continue;
                            au.a.a((aj)bc2);
                            break;
                        }
                    }
                    au.a.c(this.u);
                    this.u = false;
                    ai2.d(true);
                    ak.a(this.u, new byte[]{(byte)q.a.b, (byte)q.a.a});
                    this.a(this.u, "");
                    this.u = 13;
                    ak.b(this.u);
                    q.a((byte)9);
                }
            }
            q.a((byte)1);
        }
    }

    public final void a(String object, boolean bl) {
        if (object != null) {
            bc bc2 = ak.a((String)object);
            if (bc2 != null) {
                ((ao)bc2).c();
                this.i();
                ak.a(this.u, new byte[]{(byte)q.a.b, (byte)q.a.a});
                this.a(this.u, (String)object);
                this.u = 11;
                this.a = (ao)bc2;
                q.a.b = this.a.a();
                q.a.a = 0;
            }
        } else {
            try {
                this.a.g();
                if (this.d != null) {
                    object = this.a;
                    int n2 = Integer.parseInt((String)((ai)object).a);
                    if (this.a.a() != n2 && !bl) {
                        this.a.a(n2);
                        object = this.a;
                        object = ((ao)object).a;
                        if (object != null) {
                            q.a(this.a, object);
                        }
                    }
                    this.u = q.c();
                    byte[] byArray = ak.a(this.u);
                    object = byArray;
                    if (byArray != null) {
                        q.a.b = (int)object[0];
                        q.a.a = (int)object[1];
                    } else {
                        q.a.b = 0;
                        q.a.a = 0;
                    }
                    this.a = null;
                }
            }
            catch (ClassCastException classCastException) {}
        }
        q.a((byte)8);
        q.a((byte)1);
    }

    private void a(int n2, String string) {
        if (b.size() > 1 && (Integer)b.peek() == n2) {
            b.pop();
            b.pop();
        }
        b.push(string);
        b.push(new Integer(this.u));
    }

    private static int c() {
        int n2 = (Integer)b.pop();
        b.pop();
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private static void a(af var0, String var1_1, String var2_2) {
        if (q.a != null) {
            var3_3 = false;
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = false;
            var7_10 = 0;
            var8_11 = 0;
            var9_12 = new Object[20];
            if (var2_2 != null) {
                var2_2 = var2_2.trim();
                var6_7 = null;
                ** if (var2_2 == null || var2_2.length() <= 0) goto lbl42
                while (!var3_3) {
                    var6_8 = var2_2.indexOf(40, var5_5);
                    var7_10 = var2_2.indexOf(41, var5_5);
                    if ((var5_5 = var2_2.indexOf(44, var5_5)) == -1) {
                        var6_7 = var2_2.substring(var4_4, var2_2.length());
                        var3_3 = true;
                    } else {
                        if (var6_8 != -1 && var6_8 < var5_5 && var7_10 != -1) {
                            var6_7 = var2_2.substring(var4_4, var7_10 + 1);
                            var5_5 = var2_2.indexOf(44, var7_10);
                            if (var5_5 == -1) {
                                var3_3 = true;
                            }
                        } else {
                            var6_7 = var2_2.substring(var4_4, var5_5);
                        }
                        var4_4 = ++var5_5;
                    }
                    if ((var6_7 = var6_7.trim()).length() <= 2) continue;
                    v0 = var6_7.charAt(0);
                    var7_10 = v0;
                    switch (v0) {
                        case 's': {
                            var9_12[var8_11++] = var6_7.substring(2);
                            break;
                        }
                        case 'i': {
                            var9_12[var8_11++] = new Integer(bj.a(var6_7.substring(2), 0));
                            break;
                        }
                        case 'b': {
                            var9_12[var8_11++] = new Boolean(bj.a(var6_7.substring(2)));
                        }
                    }
lbl-1000:
                    // 2 sources

                    {
                    }
                }
            }
lbl42:
            // 4 sources

            var6_9 = null;
            if (var8_11 > 0) {
                var6_9 = new Object[var8_11];
                System.arraycopy(var9_12, 0, var6_9, 0, var8_11);
            }
            q.b.a();
            q.a.a();
            q.b.a(0);
            if (var6_9 != null) {
                q.b.a(var6_9.length);
                for (var7_10 = 0; var7_10 < var6_9.length; ++var7_10) {
                    q.b.a(var7_10, var6_9[var7_10]);
                }
            }
            try {
                if (var1_1.indexOf("Page.") == -1) {
                    q.a.a(q.a, var0, var1_1, q.b);
                } else {
                    q.a.b(q.a, null, var1_1.substring("Page.".length()), q.b);
                }
                return;
            }
            catch (RuntimeException v1) {
                return;
            }
            catch (Throwable var10_13) {
                throw var10_13;
            }
        }
    }

    private void b(boolean bl) {
        if (this.d != null) {
            if (q.a.b >= this.d.size()) {
                q.a.b = 0;
            }
            if (q.a.b < this.d.size()) {
                int n2 = q.a.b;
                Vector vector = (Vector)this.d.elementAt(n2);
                if (q.a.a >= vector.size()) {
                    q.a.a = 0;
                }
                if (q.a.a < vector.size()) {
                    int n3 = q.a.a;
                    this.c = this.a;
                    this.a = (ai)((Vector)this.d.elementAt(n2)).elementAt(n3);
                    Object[] objectArray = this.a.a(d);
                    if (bl) {
                        q.a((bc)objectArray[0], objectArray[1]);
                    } else {
                        this.b((bc)objectArray[0], objectArray[1]);
                    }
                    if (this.a instanceof aw) {
                        this.t = true;
                    }
                    q.a((byte)1);
                }
                return;
            }
        } else {
            q.a.a = 0;
            q.a.b = 0;
        }
    }

    private void p() {
        this.t = false;
        if (this.a != null) {
            this.a = this.a.a(d);
            this.b(this.a, this.a);
            q.a((byte)1);
        }
    }

    private void a(boolean bl, boolean bl2) {
        if (bl) {
            q.a.b = 0;
            q.a.a = 0;
        }
        this.d = new Vector();
        ak.a(this.u, this.d);
        if (!bj.b(this.j) && ak.a(this.j) != null) {
            this.a(this.j, null, true);
            return;
        }
        if (this.d != null && bl2 && this.d.size() != 0) {
            this.b(true);
            if (this.a != null) {
                ai ai2 = this.a;
                if (!ai2.d) {
                    this.a(null, this.a, true);
                }
            }
        }
    }

    private void a(String object, ai ai2, boolean n2) {
        if (object != null) {
            ai2 = (ai)ak.a((String)object);
        }
        if (ai2 != null && ai2 instanceof ai) {
            bc.g = false;
            ak.b(this.u);
            if (!this.a(true, ai2, false)) {
                this.j = null;
                return;
            }
            object = ai2;
            if (((ai)object).d) {
                object = null;
                n2 = -1;
                int n3 = -1;
                int n4 = this.d.size();
                while (--n4 >= 0) {
                    Vector vector = (Vector)this.d.elementAt(n4);
                    n3 = vector.indexOf(ai2);
                    if (n3 == -1) continue;
                    n2 = n4;
                    break;
                }
                if (n2 != -1 && n3 != -1) {
                    this.p();
                    q.a.b = n2;
                    q.a.a = n3;
                    this.b(true);
                }
            }
        }
        this.j = null;
    }

    private boolean a(boolean bl, ai ai2, boolean bl2) {
        ai ai3;
        int n2;
        bc.g = false;
        this.i();
        a.a(false);
        int n3 = 0;
        do {
            if (ai2 != null) {
                ai3 = ai2;
                if (ai3.d) break;
            }
            if ((ai3 = ak.a(this.u, 0, bl ? 1 : -1)) == null) {
                bc.g = true;
                return false;
            }
            a.a(false);
        } while (!bl2 || (n3 += a) <= (n2 = ai3.c()) >> 2);
        bc.g = true;
        if (ai2 != null) {
            ai3 = ai2;
            if (ai3.d) {
                return true;
            }
        }
        return false;
    }

    public static void a(int n2) {
        q.a.b = n2;
    }

    public static void b(int n2) {
        q.a.a = n2;
    }

    public static void a(String string, Object object) {
        if (object == null || "null".equals(object)) {
            b.remove(string);
            return;
        }
        b.put(string, object);
    }

    public static Object a(String string) {
        return b.get(string);
    }

    public final void run() {
        if (Thread.currentThread().equals(this.b)) {
            block72: {
                try {
                    Thread.sleep(b);
                }
                catch (Exception exception) {}
                String string = this.m;
                String string2 = this.l;
                Hashtable hashtable = this.i;
                byte[] byArray = this.b;
                Object object = this.k;
                q q2 = this;
                j = System.currentTimeMillis();
                Thread.currentThread().setPriority(10);
                Object object2 = null;
                try {
                    Object object3;
                    r = 0;
                    q = 0;
                    if (!q2.v) {
                        b = true;
                    }
                    if (q2.b != null) {
                        object3 = q2.b;
                        q2.b(q2.b, ((ai)object3).g);
                        object3 = q2.b;
                        if (((ai)object3).g != null) {
                            ak.a(a.getWidth(), a.getHeight());
                            bc.f = true;
                            a.a(true);
                        }
                    }
                    object3 = q2;
                    q2.t = false;
                    ((q)object3).a = null;
                    ((q)object3).a = null;
                    ((q)object3).a = null;
                    ((q)object3).c = null;
                    if (a.size() < 2) {
                        a.removeAllElements();
                        object2 = new Vector();
                        a.addElement(object2);
                    } else {
                        object2 = (Vector)a.elementAt(0);
                        Vector vector = null;
                        for (int i2 = 0; i2 < ((Vector)object2).size(); ++i2) {
                            vector = (Vector)((Vector)object2).elementAt(i2);
                            if (!"1".equals(vector.elementAt(6))) continue;
                            vector.setElementAt(null, 4);
                            vector.setElementAt(null, 5);
                        }
                        a.removeElementAt(1);
                    }
                    object2 = new Vector();
                    a.addElement(object2);
                    ((q)object3).f();
                    a.clear();
                    ax.c();
                    b.removeAllElements();
                    c.removeAllElements();
                    f.clear();
                    if (!c) {
                        b = a;
                    } else if (b != null) {
                        a = b;
                    }
                    c = false;
                    if (q2.a != null) {
                        q2.a.b();
                    }
                    object2 = null;
                    if (object != null) {
                        String string3;
                        if (a != null) {
                            object3 = a;
                            string3 = ((p)object3).e;
                        } else {
                            string3 = null;
                        }
                        object2 = bj.a(string3, (String)object, q2.y);
                        q2.y = false;
                        if (((String)object2).startsWith("bundle:")) {
                            object2 = ((String)object2).substring(((String)object2).indexOf(58) + 1);
                        }
                    }
                    object = a;
                    if (byArray == null && !q2.x) {
                        object = new p((String)object2);
                    }
                    l = false;
                    object3 = object2 = new aa((String)object2, byArray, hashtable, (p)object, string, q2);
                    if (((aa)object2).d || c || q2.b != Thread.currentThread()) {
                        object3 = object2;
                        if (((aa)object3).a != null) {
                            ((aa)object3).a.removeAllElements();
                        }
                        ((aa)object3).d = null;
                        ((aa)object3).e = null;
                        ((aa)object3).a = null;
                        ((aa)object3).b = null;
                        ((aa)object3).a = null;
                        ((aa)object3).b = null;
                        ((aa)object3).c = null;
                        ((aa)object3).a = null;
                        ((aa)object3).b = null;
                        ((aa)object3).a = null;
                        ((aa)object3).a = null;
                        ((aa)object3).a = null;
                        break block72;
                    }
                    q2.a = object2;
                    a = object;
                    if (q2.j == null || q2.j.equals("")) {
                        object3 = object;
                        q2.j = ((p)object3).f;
                    }
                    object3 = object2;
                    if (((aa)object3).b) {
                        if (q2.b != null) {
                            q2.b.a();
                        }
                        q2.b = null;
                    }
                    if (q2.d != null) {
                        q2.d.removeAllElements();
                        q2.d = null;
                    }
                    q2.u = 5;
                    q2.c((p)object);
                    object3 = object2;
                    object = ((aa)object3).a;
                    object3 = q2;
                    q2.b = object;
                    ((q)object3).u = false;
                    object3 = q2.a;
                    object3 = ((aa)object3).b;
                    d = object3;
                    if (object3 == null) {
                        d = new Hashtable();
                    }
                    object3 = object2;
                    object = ((aa)object3).c;
                    object3 = q2;
                    q2.g = object;
                    object3 = object2;
                    object = ((aa)object3).d;
                    object3 = q2;
                    q2.h = object;
                    if (!l) {
                        if (au.a != null) {
                            au.a.a();
                        }
                        au.a = null;
                    }
                    q = 100;
                    b = a;
                    q2.b.b(d);
                    object3 = q2.b;
                    if (((ai)object3).e != null) {
                        q.a((byte)4);
                    }
                    object3 = q2.b;
                    if (((ai)object3).f != null) {
                        q.a((byte)5);
                    }
                    object3 = q2.b;
                    if (((ai)object3).h != null) {
                        q2.a.a();
                        q.a((byte)13);
                    }
                    try {
                        i = System.currentTimeMillis();
                        if (c.size() > 0) {
                            object3 = new z(null, "POST", q.a.a.getAppProperty("aux-servlet-url") + "/multifetch", c, null, -1, false);
                            try {
                                k.a((n)object3);
                                object = ((z)object3).b();
                                z.a((HttpConnection)object, null);
                                object2 = bj.a(object.openInputStream());
                                aa.a(null, (byte[])object2);
                                c.removeAllElements();
                            }
                            catch (Exception exception) {
                            }
                            finally {
                                k.a((n)object3);
                            }
                        }
                        i = System.currentTimeMillis() - i;
                    }
                    catch (Exception exception) {}
                    q.a((byte)8);
                    q.a((byte)1);
                    if (string2 != null) {
                        u.b = true;
                        if ("LEFT".equals(string2 = string2.toUpperCase())) {
                            u.a = -a.getWidth();
                        } else if ("RIGHT".equals(string2)) {
                            u.a = a.getWidth();
                        } else if ("BOTTOM".equals(string2)) {
                            u.b = a.getHeight();
                        } else if ("TOP".equals(string2)) {
                            u.b = -a.getHeight();
                        } else if ("TOP-LEFT".equals(string2)) {
                            u.a = -a.getWidth();
                            u.b = -a.getHeight();
                        } else if ("TOP-RIGHT".equals(string2)) {
                            u.a = a.getWidth();
                            u.b = -a.getHeight();
                        } else if ("BOTTOM-LEFT".equals(string2)) {
                            u.a = -a.getWidth();
                            u.b = a.getHeight();
                        } else if ("BOTTOM-RIGHT".equals(string2)) {
                            u.a = a.getWidth();
                            u.b = a.getHeight();
                        } else if ("BOX-OUT".equals(string2)) {
                            u.a = true;
                        } else {
                            u.b = false;
                        }
                    }
                }
                catch (Exception exception) {
                    object2 = exception;
                    exception.printStackTrace();
                }
                finally {
                    b = false;
                    d = false;
                    e = false;
                    o = false;
                    p = false;
                    j = false;
                    k = false;
                    q = false;
                    r = false;
                    if (au.a != null) {
                        if (au.a.a != null) {
                            au.a.a.d(true);
                        }
                        if (au.a.b != null) {
                            au.a.b.d(true);
                        }
                    }
                }
                j = System.currentTimeMillis() - j;
                h = true;
                w = Integer.MIN_VALUE;
            }
            if (!c) {
                this.k = null;
                this.b = null;
                this.i = null;
                this.l = null;
                this.m = null;
                this.x = false;
                return;
            }
        } else {
            while (i) {
                try {
                    this.l = System.currentTimeMillis();
                    if (this.s) {
                        this.k();
                    }
                    this.l = System.currentTimeMillis() - this.l;
                    long l = (long)p - this.l;
                    if (l < 0L) {
                        l = 0L;
                    }
                    Thread.sleep(l);
                }
                catch (Exception exception) {}
            }
        }
    }

    private static aj a(String string, boolean bl, String string2) {
        return new aj(string, bl, string2);
    }

    public static Display a() {
        return a;
    }

    public static void a(String string, ap ap2) {
        a.setCurrent((Displayable)a);
        q.a(null, (Object)string);
        if (ap2 != null) {
            ap2.a();
        }
    }

    public static u a() {
        return a;
    }

    public static int a() {
        return a.getWidth();
    }

    public static int b() {
        return a.getHeight();
    }

    private boolean b(String string) {
        boolean bl = true;
        try {
            boolean bl2 = this.a.platformRequest(string);
            if (bl2) {
                this.b();
            }
        }
        catch (Exception exception) {
            bl = false;
        }
        return bl;
    }

    public final void b() {
        ((MorpheusMidlet)this.a).destroyApp(true);
        this.a.notifyDestroyed();
    }

    public final boolean b() {
        boolean bl = true;
        Object object = this.a.getAppProperty("MIDlet-Permissions");
        if (object == null || ((String)object).trim().length() == 0) {
            return true;
        }
        if ((object = bg.a((String)object, ",")) == null) {
            return false;
        }
        String string = null;
        while (((bg)object).a()) {
            string = ((bg)object).a().trim();
            if (this.a.checkPermission(string) != 0) continue;
            bl = false;
            break;
        }
        return bl;
    }

    public static String a() {
        Object object = null;
        if (a != null) {
            object = a;
            object = ((p)object).e;
        }
        return object;
    }

    private void q() {
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(String object) {
        DataOutputStream dataOutputStream = null;
        InputStream inputStream = null;
        try {
            object = (HttpConnection)Connector.open((String)object);
            object.setRequestMethod("POST");
            dataOutputStream = object.openDataOutputStream();
            a.a(dataOutputStream);
            inputStream = object.openInputStream();
            object = new byte[256];
            while (inputStream.read((byte[])object, 0, ((Object)object).length) > 0) {
            }
        }
        catch (Exception exception) {
            try {
                throw new RuntimeException(exception.getClass().getName() + " " + exception.getMessage());
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
                catch (Exception exception2) {}
                try {
                    if (dataOutputStream == null) throw throwable;
                    dataOutputStream.close();
                    throw throwable;
                }
                catch (Exception exception3) {}
                throw throwable;
            }
        }
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        catch (Exception exception) {}
        try {
            if (dataOutputStream == null) return;
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {}
    }

    public final boolean a(ah ah2, int n2) {
        switch (n2) {
            case -398: 
            case -367: 
            case -275: 
            case -274: 
            case -267: 
            case -266: 
            case -265: 
            case -264: 
            case -255: 
            case -254: 
            case -253: 
            case -252: 
            case -251: 
            case -250: 
            case -249: 
            case -248: 
            case -247: 
            case -246: 
            case -245: 
            case -244: 
            case -236: 
            case -235: 
            case -233: 
            case -232: 
            case -231: 
            case -230: 
            case -229: 
            case -228: 
            case -227: 
            case -226: 
            case -225: 
            case -224: 
            case -223: 
            case -222: 
            case -221: 
            case -220: 
            case -219: 
            case -218: 
            case -217: 
            case -216: 
            case -215: 
            case -214: 
            case -213: 
            case -212: 
            case -211: 
            case -210: 
            case -209: 
            case -208: 
            case -207: 
            case -206: 
            case -205: 
            case -204: 
            case -203: 
            case -202: 
            case -201: 
            case -200: 
            case -199: 
            case -197: 
            case -196: 
            case -195: 
            case -191: 
            case -190: 
            case -189: 
            case -188: 
            case -187: 
            case -186: 
            case -185: 
            case -184: 
            case -183: 
            case -182: 
            case -181: 
            case -180: 
            case -179: 
            case -178: 
            case -177: 
            case -176: 
            case -175: 
            case -174: 
            case -172: 
            case -171: 
            case -170: 
            case -169: 
            case -168: 
            case -167: 
            case -166: 
            case -165: 
            case -164: 
            case -163: 
            case -162: 
            case -161: 
            case -160: 
            case -159: 
            case -157: 
            case -156: 
            case -155: 
            case -154: 
            case -153: 
            case -152: 
            case -151: 
            case -150: 
            case -149: 
            case -134: 
            case -133: {
                ah2.a(ag.b);
                break;
            }
            case -198: {
                ah2.a(this.a.getAppProperty("m-version"));
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public final boolean a(int n2, boolean bl, Object object, int n3) {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean a(ah var1_1, af var2_5, int var3_8, ah var4_16) {
        switch (var3_8) {
            case -150: 
            case -149: {
                var1_1.a(ak.a(var4_16.b(0)));
                break;
            }
            case -200: {
                var1_1.a(new be());
                break;
            }
            case -204: {
                var1_1.a(new bf(var4_16.a() > 0 && var4_16.a(0) == 1 ? 2 : 1));
                break;
            }
            case -205: {
                this.q();
                break;
            }
            case -151: {
                var2_5 = q.a(var4_16.b(0), false, var4_16.b(1));
                var2_5.b(q.d);
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -158: {
                var2_5 = new bc();
                var2_5.l();
                if (var4_16.a() > 0) {
                    var4_16.a(0);
                }
                var1_1.a(var2_5);
                var1_1.a(var2_5);
                break;
            }
            case -152: {
                var2_5 = q.a(var4_16.b(0), true, "0");
                var2_5.b(q.d);
                if (var4_16.a() > 1) {
                    var4_16.a(1);
                }
                var1_1.a(var2_5);
                break;
            }
            case -154: {
                var2_5 = new bc();
                var2_5.b(var4_16.b(0), var4_16.b(1));
                var2_5.b(q.d);
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -155: {
                var2_5 = new bc();
                var2_5.k();
                var2_5.b(var4_16.a(0));
                var2_5.c(var4_16.a(1));
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -156: {
                var2_5 = new at(var4_16.b(0), var4_16.b(1));
                var2_5.b(q.d);
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -157: {
                var2_5 = new an(var4_16.b(0), var4_16.a() > 1 ? var4_16.a(1) : 0, true);
                var2_5.b(q.d);
                if (var4_16.a() > 1) {
                    var4_16.a(1);
                }
                var1_1.a(var2_5);
                break;
            }
            case -159: {
                v0 = (byte[])var4_16.a(0);
                v1 = var4_16.a(1);
                v2 = var4_16.a(2);
                v3 = var4_16.a(3);
                if (var4_16.a() > 4) {
                    var4_16.a(4);
                }
                if (var4_16.a() > 5) {
                    var4_16.a(5);
                }
                var2_5 = new an(v0, v1, true, v2, v3);
                var2_5.b(q.d);
                if (var4_16.a() > 6) {
                    var4_16.a(6);
                }
                var1_1.a(var2_5);
                break;
            }
            case -160: {
                var2_5 = new an(var4_16.b(0), var4_16.a(1), true, var4_16.a(2), var4_16.a(3), null, var4_16.a() > 4 ? var4_16.a(4) : false, var4_16.a() > 5 ? var4_16.a(5) : 0xFFFFFF);
                var2_5.b(q.d);
                if (var4_16.a() > 6) {
                    var4_16.a(6);
                }
                var1_1.a(var2_5);
                break;
            }
            case -161: {
                var2_5 = new ax(1, var4_16.b(0), var4_16.b(1), var4_16.b(2));
                var2_5.b(q.d);
                if (var4_16.a() > 3) {
                    var4_16.a(3);
                }
                var1_1.a(var2_5);
                break;
            }
            case -162: {
                var2_5 = new ax(0, var4_16.b(0), var4_16.b(1), var4_16.b(2));
                var2_5.b(q.d);
                if (var4_16.a() > 3) {
                    var4_16.a(3);
                }
                var1_1.a(var2_5);
                break;
            }
            case -163: {
                var2_5 = new ai(false);
                var2_5.b(q.d);
                if (var4_16.a() > 0) {
                    var4_16.a(0);
                }
                var1_1.a(var2_5);
                break;
            }
            case -164: {
                var2_5 = new ai(true);
                var2_5.b(q.d);
                if (var4_16.a() > 0) {
                    var4_16.a(0);
                }
                var1_1.a(var2_5);
                break;
            }
            case -166: {
                var2_5 = new ai(false);
                var2_5.c();
                var2_5.b(q.d);
                if (var4_16.a() > 0) {
                    var4_16.a(0);
                }
                ak.a(12, (bc)var2_5);
                var1_1.a(var2_5);
                break;
            }
            case -165: {
                var64_18 = q.a;
                var2_5 = bj.a(var64_18.e, var4_16.b(0), false);
                var2_5 = ap.a((String)var2_5, null, var4_16.b(1));
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -167: {
                var2_5 = ap.a(null, (byte[])var4_16.a(0), var4_16.b(1));
                if (var4_16.a() > 2) {
                    var4_16.a(2);
                }
                var1_1.a(var2_5);
                break;
            }
            case -168: {
                var64_19 = q.a;
                var2_5 = bj.a(var64_19.e, var4_16.b(0), false);
                var2_5 = ap.a((String)var2_5, null, var4_16.b(1), var4_16.b(2), var4_16.b(3), var4_16.b(4), var4_16.b(5), var4_16.b(6), var4_16.b(7), var4_16.b(8), var4_16.b(9), var4_16.b(10));
                var1_1.a(var2_5);
                break;
            }
            case -169: {
                var2_5 = ap.a(null, (byte[])var4_16.a(0), var4_16.b(1), var4_16.b(2), var4_16.b(3), var4_16.b(4), var4_16.b(5), var4_16.b(6), var4_16.b(7), var4_16.b(8), var4_16.b(9), var4_16.b(10));
                var1_1.a(var2_5);
                break;
            }
            case -170: {
                var2_5 = new ao(var4_16.b(0));
                var2_5.b(q.d);
                if (var4_16.a() > 0) {
                    var4_16.a(0);
                }
                var1_1.a(var2_5);
                break;
            }
            case -172: {
                ak.a(var4_16.a(0) + 5, (bc)var4_16.a(1));
                q.a((byte)1);
                break;
            }
            case -133: {
                var2_5 = (bc)var4_16.a(0);
                this.b.a((bc)var2_5);
                if (var2_5 instanceof ai) {
                    q.a((byte)9);
                } else {
                    q.a((byte)1);
                }
                var1_1.a(null);
                break;
            }
            case -134: {
                ak.a((bc)var4_16.a(0));
                q.a((byte)1);
                var1_1.a(null);
                break;
            }
            case -174: {
                ak.b(this.u);
                q.a((byte)1);
                var1_1.a(null);
                break;
            }
            case -175: {
                q.a(var4_16.b(0), var4_16.a(1));
                var1_1.a(null);
                break;
            }
            case -176: {
                var64_20 = var4_16.b(0);
                var1_1.a(q.b.get(var64_20));
                break;
            }
            case -177: {
                q.a(var4_16.b(0), null);
                break;
            }
            case -178: {
                bj.a(var4_16.b(0), var4_16.a(1));
                var1_1.a(null);
                break;
            }
            case -179: {
                var1_1.a(bj.a(var4_16.b(0)));
                break;
            }
            case -180: {
                var1_1.a(bj.b(var4_16.b(0)));
                break;
            }
            case -181: {
                bj.a();
                var1_1.a(null);
                break;
            }
            case -182: {
                v4 = var4_16.b(0);
                v5 = var4_16.b(1);
                v6 = var4_16.b(2);
                v7 = var4_16.b(3);
                v8 = var4_16.b(4);
                v9 = var4_16.b(5);
                var4_16.b(6);
                var2_5 = ap.a(0, v4, v5, v6, v7, v8, v9, var4_16.b(7), null, null, var4_16.b(8), -1, var4_16.b(9), var4_16.a() > 10 ? var4_16.b(10) : null, var4_16.a() > 11 ? var4_16.a(11) : null);
                var1_1.a(var2_5);
                break;
            }
            case -183: {
                var2_5 = ap.a(2, var4_16.b(0), var4_16.b(1), null, var4_16.b(2), var4_16.b(3), null, var4_16.b(4), var4_16.b(5), var4_16.b(6), var4_16.b(7), var4_16.a(8), var4_16.b(9), var4_16.a() > 10 ? var4_16.b(10) : null, null);
                var1_1.a(var2_5);
                break;
            }
            case -184: {
                var2_5 = ap.a(1, null, null, null, null, null, null, null, null, null, var4_16.b(0), var4_16.a(1), null, var4_16.a() > 2 ? var4_16.b(2) : null, null);
                var1_1.a(var2_5);
                break;
            }
            case -185: {
                var1_1.a(bj.a());
                break;
            }
            case -186: {
                var1_1.a(null);
                System.gc();
                break;
            }
            case -203: {
                this.y = true;
            }
            case -202: {
                q.w = -2147483648;
                var2_5 = var4_16.b(0);
                var3_9 = var4_16.b(1);
                var5_24 = bj.a((af)var4_16.a(2));
                var6_30 = bj.a((af)var4_16.a(3));
                var7_31 = var4_16.a(4);
                var4_17 = var4_16.a(5);
                var8_32 = false;
                var64_21 = q.a;
                var3_9 = bj.a(var64_21.e, var3_9, this.y);
                this.y = false;
                try {
                    var8_32 = bj.a(var6_30.get("asynchronous"), false);
                }
                catch (Exception v10) {}
                var9_38 = new Hashtable<String, String>();
                q.r = 0;
                q.q = 0;
                try {
                    if (var8_32) {
                        var9_38.put("status", Integer.toString(202));
                        var9_38.put("message", "Accepted");
                        var8_33 = new Vector<Object>();
                        var8_33.addElement(var2_5);
                        var8_33.addElement(var3_9);
                        var8_33.addElement(var5_24);
                        var8_33.addElement(var6_30);
                        var8_33.addElement(q.a);
                        var8_33.addElement(var7_31);
                        var8_33.addElement(var4_17 != false ? "1" : "0");
                        ((Vector)q.a.elementAt(0)).addElement(var8_33);
                    } else {
                        try {
                            q.b = true;
                            q.a.b();
                            q.q = 10;
                            var8_34 = new z(null, (String)var2_5, var3_9, var5_24, var6_30, -1, false);
                            q.q = 30;
                            var8_34.a(q.a, var7_31);
                            q.w = -2147483648;
                            q.d = true;
                            q.e = true;
                            var9_38.put("status", Integer.toString(202));
                            var9_38.put("message", "Accepted");
                            new Thread(var8_34).start();
                            q.q = 40;
                        }
                        catch (Exception var8_35) {
                            q.b = false;
                            q.d = false;
                            q.e = false;
                        }
                    }
                }
                catch (Exception var8_36) {
                    // empty catch block
                }
                var1_1.a(var9_38);
                break;
            }
            case -195: {
                var1_1.a(this.b(var4_16.b(0)));
                if (!var4_16.a(1)) break;
                this.b();
                break;
            }
            case -196: {
                var1_1.a(this.b("tel:" + var4_16.b(0)));
                break;
            }
            case -197: {
                this.b();
                break;
            }
            case -201: {
                var3_8 = var4_16.a() > 1 ? (var4_16.a(1) > 0 ? 1 : 0) : 0;
                var2_5 = (be)var4_16.a(0);
                var1_1 = this;
                if (var2_5 == null) break;
                if (var1_1.a == null) {
                    if (var2_5.a() == 0) {
                        var1_1.a = new bf(var3_8 != 0 ? 2 : 1);
                        var1_1.a.a((be)var2_5);
                    } else {
                        var1_1.a = (bf)var2_5;
                    }
                    var1_1.a.a();
                    break;
                }
                if (var3_8 != 0) {
                    if (var1_1.a.a() == 2) {
                        var1_1.a.a((be)var2_5);
                        break;
                    }
                    var4_16 = new bf(2);
                    var4_16.a();
                    var4_16.a(var1_1.a, true);
                    var4_16.a((be)var2_5);
                    var1_1.a = var4_16;
                    break;
                }
                if (var1_1.a.a() == 1) {
                    var1_1.a.a((be)var2_5);
                    break;
                }
                var4_16 = new bf(1);
                var4_16.a();
                var4_16.a(var1_1.a, true);
                var4_16.a((be)var2_5);
                var1_1.a = var4_16;
                break;
            }
            case -199: {
                var8_37 = (af)var4_16.a(0);
                var2_5 = (Object[])var4_16.a(1);
                var3_10 = new ah(((String[])var2_5).length);
                for (var5_25 = 0; var5_25 < ((Object)var2_5).length; ++var5_25) {
                    var3_10.a(var5_25, var2_5[var5_25]);
                }
                var8_37.a((ah)var1_1, var8_37, var3_10);
                break;
            }
            case -206: {
                var1_1.a(System.getProperty(var4_16.b(0)));
                break;
            }
            case -207: {
                var1_1.a(this.a.getAppProperty(var4_16.b(0)));
                break;
            }
            case -208: {
                q.a.removeAllElements();
                break;
            }
            case -209: {
                this.c(var4_16.b(0), var4_16.a(1));
                break;
            }
            case -219: {
                var2_6 = var4_16.a(1);
                var1_1 = var4_16.b(0);
                var4_16 = ak.a((String)var1_1);
                if (var4_16 == null || !(var4_16 instanceof ai)) break;
                ((ai)var4_16).a(var2_6, q.d);
                q.a((byte)10);
                q.a((byte)1);
                break;
            }
            case -220: {
                q.a(var4_16.b(0));
                break;
            }
            case -210: {
                var3_11 = var4_16.b(1);
                var2_5 = var4_16.b(0);
                var1_1 = this;
                var4_16 = (s)var1_1.g.get(var2_5);
                if (var4_16 != null) {
                    var4_16.a(var3_11);
                    q.a((byte)1);
                    break;
                }
                var5_26 = ak.a((String)var2_5);
                if (var5_26 == null) break;
                var5_26.a((Object)var3_11);
                q.a((byte)1);
                break;
            }
            case -211: {
                var1_1.a(this.b(var4_16.b(0)));
                break;
            }
            case -212: {
                var3_12 = var4_16.b(1);
                var2_5 = var4_16.b(0);
                var1_1 = this;
                var4_16 = (s)var1_1.g.get(var2_5);
                if (var4_16 == null) break;
                var64_22 = var4_16;
                if (var4_16.a == null) ** GOTO lbl-1000
                var64_22 = var4_16;
                if (var4_16.a.equals(var3_12)) {
                    v11 = "";
                } else lbl-1000:
                // 2 sources

                {
                    v11 = var3_12;
                }
                var4_16.a(v11);
                q.a((byte)1);
                break;
            }
            case -247: {
                var1_1 = var4_16.b(0);
                var3_13 = ak.a((String)var1_1);
                if (!(var3_13 instanceof ax)) break;
                ((ax)var3_13).b();
                break;
            }
            case -218: {
                v12 = var4_16.b(0);
                v13 = (int)(var4_16.a() > 1 ? var4_16.a(1) : 0);
                var4_16 = var4_16.a() > 2 ? var4_16.a(2) : null;
                var3_8 = v13;
                var2_5 = v12;
                var1_1 = this;
                var5_27 = false;
                var2_5 = (aj)ak.a((String)var2_5);
                if (var2_5 == null) break;
                var5_27 = q.y == -2147483648 ? var2_5.a(q.h, q.a, (Displayable)q.a, var1_1.A, (boolean)var3_8, (String)var4_16) : var2_5.a(q.y, q.a, (Displayable)q.a, var1_1.A, (boolean)var3_8, (String)var4_16);
                q.y = -2147483648;
                var1_1.u = var5_27;
                if (var1_1.u) {
                    var1_1.a = var2_5;
                    break;
                }
                var1_1.a = null;
                break;
            }
            case -227: 
            case -226: 
            case -225: {
                var4_16.a(0);
                var4_16.b(1);
                var4_16.b(2);
                var4_16.b(3);
                var4_16.b(4);
                var4_16.b(5);
                var4_16.a(6);
                var4_16.a(7);
                var4_16.a(8);
                var4_16.a(9);
                var4_16.a(10);
                var4_16.b(11);
                var4_16.b(12);
                var1_1.a(null);
                break;
            }
            case -213: {
                var5_28 = var4_16.b(0).toUpperCase().trim();
                var1_2 = 0;
                if ("RIGHT".equals(var5_28)) {
                    var1_2 = 1;
                } else if ("CENTER".equals(var5_28)) {
                    var1_2 = 2;
                }
                var3_14 = var4_16.b(2);
                var2_5 = var4_16.a(1);
                if (au.a != null) {
                    switch (var1_2) {
                        case 0: {
                            au.a.b(var2_5);
                            au.a.a(var3_14);
                            break;
                        }
                        case 1: {
                            au.a.c(var2_5);
                            au.a.b(var3_14);
                            break;
                        }
                        case 2: {
                            au.a.c(var3_14);
                        }
                    }
                }
                break;
            }
            case -214: {
                var2_5 = var4_16.b(0).toUpperCase().trim();
                var3_8 = 0;
                if ("RIGHT".equals(var2_5)) {
                    var3_8 = 1;
                }
                var1_1.a(q.a(var3_8, false));
                break;
            }
            case -215: {
                var2_5 = var4_16.b(0).toUpperCase().trim();
                var3_8 = 0;
                if ("RIGHT".equals(var2_5)) {
                    var3_8 = 1;
                }
                var1_1.a(q.a(var3_8, true));
                break;
            }
            case -216: {
                this.o();
                break;
            }
            case -217: {
                this.a(var4_16.b(0), false);
                break;
            }
            case -190: {
                this.y = true;
            }
            case -189: 
            case -187: {
                this.a(var4_16.b(0), var4_16.a() > 1 ? var4_16.a(1) : null, var4_16.a() > 2 ? var4_16.b(2) : null, var4_16.a() > 3 ? var4_16.b(3) : null, var4_16.a() > 4 ? var4_16.a(4) : true, "POST", var4_16.a() > 5 ? var4_16.b(5) : null);
                break;
            }
            case -188: {
                this.a(var4_16.b(0), var4_16.a() > 1 ? var4_16.a(1) : null, var4_16.a() > 2 ? var4_16.b(2) : null, var4_16.a() > 3 ? var4_16.b(3) : null, var4_16.a() > 4 ? var4_16.a(4) : true, "GET", var4_16.a() > 5 ? var4_16.b(5) : null);
                break;
            }
            case -191: {
                this.b(var4_16.a() > 0 ? var4_16.b(0) : null, var4_16.a() > 1 ? var4_16.a(1) : false);
                break;
            }
            case -251: {
                this.a(q.a, var4_16.a() > 0 ? var4_16.b(0) : null);
                break;
            }
            case -244: {
                break;
            }
            case -221: {
                bj.a(var4_16.b(0), var4_16.b(1));
                break;
            }
            case -222: {
                bj.b(var4_16.b(0), var4_16.a(1));
                break;
            }
            case -223: {
                var1_1.a(bj.a(var4_16.a() > 0 ? var4_16.b(0) : null, bj.a, var4_16.a() > 1 ? (long)var4_16.a(1) : 0x7FFFFFFFFFFFFFFFL, var4_16.a() > 2 ? var4_16.a(2) : null));
                break;
            }
            case -224: {
                var2_5 = bg.a(var4_16.b(0).toUpperCase(), ", ").a();
                var1_1.a(bj.a(var4_16.a() > 1 ? var4_16.b(1) : null, (String[])var2_5, var4_16.a() > 2 ? (long)var4_16.a(2) : 0x7FFFFFFFFFFFFFFFL, var4_16.a() > 3 ? var4_16.a(3) : null));
                break;
            }
            case -228: {
                var1_1 = ak.a(var4_16.b(0));
                if (var1_1 == null) break;
                var1_1.d();
                break;
            }
            case -229: {
                var1_1 = var4_16.a(0);
                var2_7 = var4_16.a(1);
                var3_8 = (int)var4_16.a(2);
                if (var1_1 instanceof af && var3_8 == 0) {
                    throw new RuntimeException("setTimeout handler must be a string if purgeIfContextChanged is false");
                }
                v14 = new Object[3];
                var4_16 = v14;
                v14[0] = var1_1;
                var4_16[1] = new Long((long)var2_7 + System.currentTimeMillis());
                var4_16[2] = new Boolean((boolean)var3_8);
                this.f.addElement(var4_16);
                break;
            }
            case -230: {
                var1_1.c(q.a.getWidth());
                break;
            }
            case -231: {
                var1_1.c(q.a.getHeight());
                break;
            }
            case -232: {
                var1_1.c((int)Runtime.getRuntime().totalMemory());
                break;
            }
            case -233: {
                var1_1.c((int)Runtime.getRuntime().freeMemory());
                break;
            }
            case -255: {
                var1_1.a(new String((byte[])var4_16.a(0)));
                break;
            }
            case -254: {
                q.c();
                break;
            }
            case -264: {
                q.a(true, var4_16.b(0));
                break;
            }
            case -265: {
                q.o = var4_16.a(0);
                var1_3 = var4_16.a(1);
                if (q.j == var1_3) break;
                if (au.a != null && au.a.a != null) {
                    au.a.a.d(var1_3 == false);
                }
                q.j = var1_3;
                break;
            }
            case -266: {
                q.p = var4_16.a(0);
                var1_4 = var4_16.a(1);
                if (q.k == var1_4) break;
                if (au.a != null && au.a.b != null) {
                    au.a.b.d(var1_4 == false);
                }
                q.k = var1_4;
                break;
            }
            case -267: {
                q.q = var4_16.a(0);
                q.r = var4_16.a(1);
                break;
            }
            case -274: {
                q.r = 0;
                q.q = 0;
                var1_1 = var4_16.a();
                if (var1_1 == null) break;
                q.f = false;
                q.b = true;
                q.d = true;
                q.e = true;
                new Thread(new r(var1_1, q.a)).start();
                break;
            }
            case -275: {
                if (u.a != null) {
                    u.a.a();
                }
                u.a = null;
                u.a = new aj((String)var4_16.a(0), false, "Wrap");
                if (var4_16.a() > 1) {
                    u.a.k((String)var4_16.a(1));
                    u.a.b(q.d);
                    break;
                }
                u.a.a.b = new int[]{0xFFFFFF};
                u.a.a.d = new int[]{0xCCCCCC, 0xCCCCCC, 0xCCCCCC, 0xCCCCCC};
                u.a.a.b = 5;
                u.a.a.q = 1;
                break;
            }
            case -235: {
                var1_1.a(bj.a(var4_16.b(0), (byte[])var4_16.a(1)));
                break;
            }
            case -236: {
                var1_1.a(bj.a(var4_16.b(0), var4_16.a() > 1 ? var4_16.a(1) : false));
                break;
            }
            case -245: {
                var2_5 = null;
                var3_15 = new a(var4_16.b(0));
                try {
                    var2_5 = var4_16.b(0).trim().charAt(0) == '{' ? var3_15.a() : var3_15.a();
                }
                catch (Exception v15) {
                    var2_5 = null;
                }
                catch (Throwable var5_29) {
                    throw var5_29;
                }
                var1_1.a(var2_5);
                break;
            }
            case -246: {
                this.n = var4_16.b(0);
                q.a((byte)11);
                break;
            }
            case -398: {
                v.a = var4_16.b(0);
                break;
            }
            case -253: {
                var1_1.a(q.a.size() > 0);
                break;
            }
            case -248: {
                var1_1.a(this.a);
                break;
            }
            case -249: {
                var1_1.a(this.c);
                break;
            }
            case -250: {
                q.a(null, (Object)var4_16.b(0));
                break;
            }
            case -252: {
                var64_23 = q.a;
                var1_1.a(var64_23.a);
                break;
            }
            case -367: {
                q.b(var4_16.b(0));
                break;
            }
            default: {
                throw new NoSuchElementException("no such method");
            }
        }
        return true;
    }

    public final void a() {
        Object object = b;
        if (object == null) {
            return;
        }
        if (object == a) {
            c = true;
            b = false;
            d = false;
            e = false;
            w = Integer.MIN_VALUE;
            if (au.a != null) {
                this.i();
                object = au.a.a();
                if (((bc)object).c()) {
                    bc[] bcArray = ((ai)object).a();
                    if (bcArray != null) {
                        for (int i2 = 0; i2 < bcArray.length; ++i2) {
                            bc bc2 = bcArray[i2];
                            if (!(bc2 instanceof ai)) continue;
                            bc2 = (ai)bc2;
                            ((ai)bc2).a(d);
                        }
                    }
                    ((ai)object).a(d);
                    ((bc)object).d(false);
                    this.u = au.a.b();
                }
            }
            this.u = 5;
            ak.a(a.getWidth(), a.getHeight());
            this.a(true, true);
            return;
        }
        c = true;
        p p2 = object;
        this.a(p2.a, ((p)object).a(null), null, "", "GET");
    }

    public final boolean a_() {
        return c;
    }

    static {
        a = 6;
        b = 30;
        c = 5;
        d = -1;
        e = -2;
        f = -3;
        g = -4;
        h = -5;
        i = -6;
        j = -7;
        k = -8;
        l = 3;
        m = 10;
        p = b;
        c = "_HTTP-COOKIE_";
        h = "_ENTRY-URL_";
        a = null;
        a = null;
        a = new boolean[l];
        a = new Hashtable();
        a = new Vector();
        b = new Hashtable();
        c = new Hashtable();
        d = new Hashtable();
        e = new Hashtable();
        b = new Vector();
        c = new Vector();
        a = new Stack();
        g = false;
        i = true;
        f = new Hashtable();
        y = Integer.MIN_VALUE;
        a = new StringBuffer();
        e = new Vector();
        a = new byte[1000];
        z = 0;
        b = new Stack();
        c = new Stack();
        a = new ah();
        b = new ah();
        w = Integer.MIN_VALUE;
        m = false;
        n = false;
        b = new StringBuffer();
        b = null;
    }
}
