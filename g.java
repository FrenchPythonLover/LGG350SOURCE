/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lge.oem.virtualkeypad.VirtualKeypadListener
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.io.SocketConnection
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.Sprite
 *  javax.microedition.rms.RecordEnumeration
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import com.lge.oem.virtualkeypad.VirtualKeypadListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g
implements VirtualKeypadListener,
Runnable {
    private static byte[] e;
    private DataOutputStream Code;
    private Connection Code;
    private byte[] I;
    private static boolean aL;
    private static byte Code;
    private static Object Code;
    private String[] I;
    private static byte B;
    static int h;
    private Object[] Z;
    private Hashtable I;
    private Object[] I;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int K;
    private int L;
    private int M;
    static Font[] Code;
    static Hashtable Code;
    private byte I;
    private static Random Code;
    private static int aL;
    private g Z;
    private static e Code;
    private static boolean bi;
    private static int ax;
    private boolean aS;
    static String i;
    private static Image B;
    private Image Z;
    private byte[] Z;
    private static Object[] J;
    private Image I;
    private int N;
    private Image Code;
    private int O;
    private int P;
    private int Q;
    static Object[] Code;
    static boolean ay;
    private static boolean bd;
    private static boolean br;
    private static final int[] I;
    private f Code;
    private C Code;
    static boolean aG;
    private static final int[] Z;
    private int[] a;
    private short[] Code;
    private short[] I;
    private byte[] J;
    private static int[] J;
    boolean aJ;
    private int[] B;
    private static int aQ;
    private static byte Z;
    private static byte[] a;
    private static int R;
    private static int aK;
    private static int[] C;
    private static int S;
    private static boolean aK;
    private byte[] B;
    private I[] Code;
    private I Code;
    private static byte[] C;
    private static byte J;
    private static Image C;
    private static Image J;
    public boolean Code;
    static String Code;
    static String I;
    static String g;
    static String Z;
    static boolean al;
    static boolean B;
    static boolean ag;
    static String J;
    static boolean H;
    static String B;
    static String C;
    static String a;
    static String b;
    static String c;
    static String d;
    private long a;
    private boolean aV;
    private int[] b;
    private g J;
    private static byte[] b;
    private g C;
    private static long b;
    private String o;
    public B Code;
    private g B;
    public String e;
    static long J;
    private String p;
    private g a;
    public static String f;
    static int Code;
    static int b;
    private static int V;
    private static int aM;
    static boolean l;
    private static boolean aM;
    private static int T;
    static boolean s;
    private static boolean aN;
    private static boolean aO;
    private static boolean aP;
    private static boolean aQ;
    private static int U;
    private static byte C;
    private static byte a;
    private static String s;
    private static String q;
    private static String r;
    public Vector Code;
    static int Z;
    private DataInputStream Code;
    private DataInputStream I;
    private DataOutputStream I;
    public long Code;
    public long I;
    private boolean aR;
    private g b;
    private g c;
    static boolean I;
    public boolean Z;
    public boolean J;
    private g d;
    private g e;
    private g f;
    private g g;
    private static boolean aT;
    public boolean C;
    private static boolean bs;
    private static g h;
    static int I;
    public boolean a;
    B Z;
    B I;
    g Code;
    private Vector e;
    private char[] Code;
    private int W;
    private int X;
    private int Y;
    private int aa;
    private int ab;
    static int[] Code;
    int J;
    static boolean b;
    private StringBuffer Code;
    private Vector f;
    private Vector g;
    static int g;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean aU;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private boolean aW;
    private boolean aX;
    private static char[][] Code;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    static int B;
    static String h;
    static long Z;
    static boolean K;
    private static boolean aY;
    private static boolean aZ;
    static int C;
    static boolean h;
    static boolean i;
    static boolean az;
    private static boolean ba;
    static String n;
    private static boolean bb;
    private static boolean bc;
    static boolean j;
    static boolean k;
    static boolean m;
    static boolean n;
    static boolean o;
    static boolean p;
    static boolean q;
    static boolean r;
    static boolean t;
    static boolean u;
    static boolean v;
    static boolean ah;
    static boolean w;
    static boolean x;
    static boolean y;
    static boolean z;
    static boolean A;
    private static boolean be;
    static boolean D;
    private static boolean bf;
    private static boolean bg;
    static boolean E;
    static boolean F;
    static boolean G;
    static boolean L;
    static boolean M;
    static boolean N;
    static boolean O;
    static boolean P;
    private static boolean bh;
    static int a;
    static boolean Q;
    static String j;
    static int c;
    static boolean R;
    static boolean S;
    static boolean T;
    static boolean U;
    static boolean V;
    static boolean W;
    static boolean X;
    static int j;
    static int d;
    static int e;
    static boolean Y;
    static boolean aa;
    static boolean ab;
    static boolean ac;
    private static boolean bj;
    private static int ay;
    static boolean ad;
    static boolean ae;
    static int f;
    static boolean af;
    private static boolean bk;
    private static boolean bl;
    private static boolean bm;
    static boolean ai;
    static boolean aj;
    static boolean ak;
    static boolean am;
    static boolean an;
    private static boolean bn;
    static boolean ao;
    private static boolean bo;
    private static boolean bp;
    static boolean ap;
    static boolean aq;
    static boolean ar;
    static int i;
    static boolean as;
    static boolean at;
    static boolean au;
    static int k;
    static int l;
    static boolean av;
    static boolean aw;
    static boolean ax;
    private static int az;
    static int m;
    static long B;
    static long C;
    static boolean aA;
    static int n;
    static boolean aB;
    static String k;
    static String[] Code;
    static boolean aC;
    static int o;
    static int p;
    static int q;
    static String l;
    static Vector I;
    static g I;
    static int r;
    static int s;
    static int t;
    static int u;
    private static int aA;
    static Vector Z;
    static boolean aD;
    static boolean aE;
    static int v;
    private static int aB;
    static Vector J;
    static Vector B;
    static Vector C;
    static Vector a;
    static Vector b;
    static int w;
    static boolean aF;
    static Vector c;
    static Vector d;
    static String m;
    private static byte[] c;
    private static String[] Z;
    static int A;
    private static String[] J;
    private static String[] B;
    private static int aC;
    private static int aD;
    private static int aE;
    static final byte[] Code;
    private static byte[] d;
    private static g i;
    private static g j;
    private static boolean bq;
    private static byte[][] Code;
    private static byte[] f;
    private static byte[] g;
    static int x;
    static int y;
    private static J Code;
    private static int aF;
    private static int aG;
    private static int aH;
    private static int aI;
    private static Hashtable Z;
    private static Stack Code;
    private static int aJ;
    private static int aN;
    private static int aO;
    private static int[] c;
    private static int[] d;
    private static int[] e;
    private static int[] f;
    private static int[] g;
    private static int[] h;
    private static byte[] h;
    static int z;
    static boolean aH;
    private static int aP;
    private static Hashtable J;
    private static Integer Code;
    private static byte[] i;
    private static byte[] j;
    private static boolean bt;
    private static char[] I;
    private static int[] i;
    boolean aI;
    private static g[] Code;
    private static g[] I;
    private static g k;
    private static g l;
    private static g m;
    private static g n;
    private static g o;

    private static void S() {
        B = -1;
        J = 32768L;
        ax = 256;
        a = 400;
        b = 2;
        d = -1;
        e = -1;
        f = -1;
        g = 1;
        bl = true;
        h = -1;
        Code = new Random(System.currentTimeMillis());
        ak = true;
        al = false;
        am = false;
        an = true;
        bn = false;
        ao = false;
        bo = false;
        bp = false;
        ap = true;
        i = 1;
        as = false;
        j = 0;
        au = true;
        k = 0;
        l = 0;
        aw = true;
        ax = true;
        az = -1;
        m = 0;
        ay = false;
        az = false;
        B = 0L;
        C = 0L;
        aA = false;
        n = -1;
        aB = true;
        k = "classic";
        Code = new String[3];
        p = -1;
        I = new Vector();
        r = 0;
        s = 0;
        t = -1;
        u = 0;
        aA = -1;
        Z = new Vector();
        aD = false;
        v = 0;
        aB = -1;
        J = null;
        B = new Vector();
        C = new Vector();
        a = null;
        b = new Vector();
        w = 0;
        aF = false;
        c = null;
        d = new Vector();
        m = "";
        c = null;
        n = "";
        B = null;
        s = null;
        aC = 1024;
        aD = 0x100000;
        aE = 0x40000000;
        Code = new byte[8];
        d = new byte[8];
        bq = false;
        e = new byte[32];
        f = new byte[32];
        y = -1;
        Z = null;
        J = null;
        Code = new Stack();
        br = false;
        c = new int[64];
        d = null;
        aG = false;
        aH = false;
        I = new g('\u0000');
        J = new Hashtable<String, Integer>(6);
        J.put("http", new Integer(80));
        J.put("https", new Integer(443));
        J.put("ftp", new Integer(21));
        J.put("rtsp", new Integer(554));
        Code = new Integer(0);
        i = new byte[]{34, 34, 35, 35, 37, 37, 39, 39};
        j = new byte[]{33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 38, 38, 39, 39, 40, 40, 40, 40, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 48, 48, 49, 49, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 65, 65, 65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68, 69, 69, 69, 69, 70, 70, 70, 70, 71, 71, 71, 71, 72, 72, 73, 73, 74, 74, 74, 74};
        I = new char[]{'\u0000', '\t', '\n', '\u000b', '\f', '\r', '\u000e', '\u001c', '\u001f', ' ', '!', '#', '&', '+', ',', '-', '.', '0', ':', ';', 'A', '[', 'a', '{', '\u007f', '\u0085', '\u0086', '\u00a0', '\u00a1', '\u00a2', '\u00a6', '\u00aa', '\u00ab', '\u00ad', '\u00ae', '\u00b0', '\u00b2', '\u00b4', '\u00b5', '\u00b6', '\u00b9', '\u00ba', '\u00bb', '\u00c0', '\u00d7', '\u00d8', '\u00f7', '\u00f8', '\u02b9', '\u02bb', '\u02c2', '\u02d0', '\u02d2', '\u02e0', '\u02e5', '\u02ee', '\u02ef', '\u0300', '\u0374', '\u037a', '\u037e', '\u0386', '\u0387', '\u0388', '\u03f6', '\u03f7', '\u0483', '\u048a', '\u058a', '\u0591', '\u05be', '\u05bf', '\u05c0', '\u05c1', '\u05c3', '\u05c4', '\u05c6', '\u05c7', '\u05d0', '\u0600', '\u060c', '\u060d', '\u060e', '\u0610', '\u061b', '\u064b', '\u0660', '\u066a', '\u066b', '\u066d', '\u0670', '\u0671', '\u06d6', '\u06dd', '\u06de', '\u06e5', '\u06e7', '\u06e9', '\u06ea', '\u06ee', '\u06f0', '\u06fa', '\u070f', '\u0710', '\u0711', '\u0712', '\u0730', '\u074d', '\u07a6', '\u07b1', '\u07c0', '\u07eb', '\u07f4', '\u07f6', '\u07fa', '\u0901', '\u0903', '\u093c', '\u093d', '\u0941', '\u0949', '\u094d', '\u0950', '\u0951', '\u0958', '\u0962', '\u0964', '\u0981', '\u0982', '\u09bc', '\u09bd', '\u09c1', '\u09c7', '\u09cd', '\u09ce', '\u09e2', '\u09e6', '\u09f2', '\u09f4', '\u0a01', '\u0a03', '\u0a3c', '\u0a3e', '\u0a41', '\u0a59', '\u0a70', '\u0a72', '\u0a81', '\u0a83', '\u0abc', '\u0abd', '\u0ac1', '\u0ac9', '\u0acd', '\u0ad0', '\u0ae2', '\u0ae6', '\u0af1', '\u0b01', '\u0b02', '\u0b3c', '\u0b3d', '\u0b3f', '\u0b40', '\u0b41', '\u0b47', '\u0b4d', '\u0b57', '\u0b82', '\u0b83', '\u0bc0', '\u0bc1', '\u0bcd', '\u0bd7', '\u0bf3', '\u0bf9', '\u0bfa', '\u0c01', '\u0c3e', '\u0c41', '\u0c46', '\u0c60', '\u0cbc', '\u0cbd', '\u0ccc', '\u0cd5', '\u0ce2', '\u0ce6', '\u0cf1', '\u0d02', '\u0d41', '\u0d46', '\u0d4d', '\u0d57', '\u0dca', '\u0dcf', '\u0dd2', '\u0dd8', '\u0e31', '\u0e32', '\u0e34', '\u0e3f', '\u0e40', '\u0e47', '\u0e4f', '\u0eb1', '\u0eb2', '\u0eb4', '\u0ebd', '\u0ec8', '\u0ed0', '\u0f18', '\u0f1a', '\u0f35', '\u0f36', '\u0f37', '\u0f38', '\u0f39', '\u0f3a', '\u0f3e', '\u0f71', '\u0f7f', '\u0f80', '\u0f85', '\u0f86', '\u0f88', '\u0f90', '\u0fbe', '\u0fc6', '\u0fc7', '\u102d', '\u1031', '\u1032', '\u1038', '\u1039', '\u1040', '\u1058', '\u10a0', '\u135f', '\u1360', '\u1390', '\u13a0', '\u1680', '\u1681', '\u169b', '\u16a0', '\u1712', '\u1720', '\u1732', '\u1735', '\u1752', '\u1760', '\u1772', '\u1780', '\u17b7', '\u17be', '\u17c6', '\u17c7', '\u17c9', '\u17d4', '\u17db', '\u17dc', '\u17dd', '\u17e0', '\u17f0', '\u180b', '\u180e', '\u1810', '\u18a9', '\u1900', '\u1920', '\u1923', '\u1927', '\u1930', '\u1932', '\u1933', '\u1939', '\u1940', '\u1946', '\u19de', '\u1a00', '\u1a17', '\u1a19', '\u1b00', '\u1b04', '\u1b34', '\u1b35', '\u1b36', '\u1b3b', '\u1b3c', '\u1b3d', '\u1b42', '\u1b43', '\u1b6b', '\u1b74', '\u1dc0', '\u1e00', '\u1fbd', '\u1fbe', '\u1fbf', '\u1fc2', '\u1fcd', '\u1fd0', '\u1fdd', '\u1fe0', '\u1fed', '\u1ff2', '\u1ffd', '\u2000', '\u200b', '\u200e', '\u200f', '\u2010', '\u2028', '\u2029', '\u202a', '\u202b', '\u202c', '\u202d', '\u202e', '\u202f', '\u2030', '\u2035', '\u2044', '\u2045', '\u205f', '\u2060', '\u2070', '\u2071', '\u2074', '\u207a', '\u207c', '\u207f', '\u2080', '\u208a', '\u208c', '\u2090', '\u20a0', '\u20d0', '\u2100', '\u2102', '\u2103', '\u2107', '\u2108', '\u210a', '\u2114', '\u2115', '\u2116', '\u2119', '\u211e', '\u2124', '\u2125', '\u2126', '\u2127', '\u2128', '\u2129', '\u212a', '\u212e', '\u212f', '\u213a', '\u213c', '\u2140', '\u2145', '\u214a', '\u214e', '\u2153', '\u2160', '\u2190', '\u2212', '\u2213', '\u2214', '\u2336', '\u237b', '\u2395', '\u2396', '\u2488', '\u249c', '\u24ea', '\u26ac', '\u26ad', '\u2800', '\u2900', '\u2c00', '\u2ce5', '\u2d00', '\u2e00', '\u3000', '\u3001', '\u3005', '\u3008', '\u3021', '\u302a', '\u3030', '\u3031', '\u3036', '\u3038', '\u303d', '\u3041', '\u3099', '\u309b', '\u309d', '\u30a0', '\u30a1', '\u30fb', '\u30fc', '\u31c0', '\u31f0', '\u321d', '\u3220', '\u3250', '\u3260', '\u327c', '\u327f', '\u32b1', '\u32c0', '\u32cc', '\u32d0', '\u3377', '\u337b', '\u33de', '\u33e0', '\u33ff', '\u3400', '\u4dc0', '\u4e00', '\ua490', '\ua800', '\ua802', '\ua803', '\ua806', '\ua807', '\ua80b', '\ua80c', '\ua825', '\ua827', '\ua828', '\ua840', '\ua874', '\uac00', '\ufb1d', '\ufb1e', '\ufb1f', '\ufb29', '\ufb2a', '\ufb50', '\ufd3e', '\ufd50', '\ufdfd', '\ufe00', '\ufe10', '\ufe20', '\ufe30', '\ufe50', '\ufe51', '\ufe52', '\ufe54', '\ufe55', '\ufe56', '\ufe5f', '\ufe60', '\ufe62', '\ufe64', '\ufe69', '\ufe6b', '\ufe70', '\ufeff', '\uff01', '\uff03', '\uff06', '\uff0b', '\uff0c', '\uff0d', '\uff0e', '\uff10', '\uff1a', '\uff1b', '\uff21', '\uff3b', '\uff41', '\uff5b', '\uff66', '\uffe0', '\uffe2', '\uffe5', '\uffe8'};
        i = new int[]{15, 17, 16, 17, 18, 16, 15, 16, 17, 18, 19, 11, 19, 10, 13, 10, 13, 9, 13, 19, 1, 19, 1, 19, 15, 16, 15, 13, 19, 11, 19, 1, 19, 15, 19, 11, 9, 19, 1, 19, 9, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 14, 19, 1, 19, 1, 19, 1, 19, 1, 14, 1, 19, 14, 2, 14, 2, 14, 2, 14, 2, 14, 2, 3, 13, 3, 19, 14, 3, 14, 12, 11, 12, 3, 14, 3, 14, 3, 14, 3, 14, 19, 14, 3, 9, 3, 15, 3, 14, 3, 14, 3, 14, 3, 2, 14, 2, 19, 2, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 11, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 11, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 19, 11, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 11, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 19, 1, 18, 1, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 11, 1, 14, 1, 19, 14, 18, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 19, 1, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 18, 15, 1, 2, 19, 18, 16, 4, 6, 8, 5, 7, 13, 11, 19, 13, 19, 18, 15, 9, 1, 9, 10, 19, 1, 9, 10, 19, 1, 11, 14, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 11, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 10, 11, 19, 1, 19, 1, 19, 9, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 18, 19, 1, 19, 1, 14, 19, 1, 19, 1, 19, 1, 14, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 14, 1, 14, 1, 14, 1, 14, 1, 19, 1, 19, 1, 2, 14, 2, 10, 2, 3, 19, 3, 19, 14, 19, 14, 19, 13, 19, 13, 19, 13, 19, 11, 19, 10, 19, 11, 19, 3, 15, 19, 11, 19, 10, 13, 10, 13, 9, 13, 19, 1, 19, 1, 19, 1, 11, 19, 11, 19};
        aQ = 0;
        bs = false;
        bt = false;
    }

    /*
     * Unable to fully structure code
     */
    static void h() {
        block144: {
            block136: {
                block143: {
                    block142: {
                        block141: {
                            block140: {
                                block139: {
                                    block138: {
                                        block137: {
                                            block135: {
                                                var0 = g.Code("platform-handles-downloads");
                                                if (var0 != null && var0.toLowerCase().equals("true")) {
                                                    g.am = true;
                                                }
                                                if ((var0 = g.Code("com.lge.device.havekeyboard")) != null && var0.toLowerCase().equals("false")) {
                                                    g.an = false;
                                                }
                                                if ((var0 = g.Code("com.lge.disable.volumekey.scroll")) != null && var0.toLowerCase().equals("true")) {
                                                    g.bn = true;
                                                }
                                                if ((var0 = g.Code("com.lge.prefer-native-input")) != null && var0.toLowerCase().equals("true")) {
                                                    g.ao = true;
                                                }
                                                var0 = (g.h = Browser.Code.getAppProperty("Operette-UA")) == null ? "" : g.h.toLowerCase();
                                                var1_1 = g.Code("microedition.platform");
                                                var1_1 = var1_1 == null ? "" : var1_1.toLowerCase();
                                                var2_2 = g.Code("device.model");
                                                var2_2 = var2_2 == null ? "" : var2_2.toLowerCase();
                                                var3_5 = Browser.Code.numAlphaLevels();
                                                g.p = var3_5 > 2;
                                                g.q = var3_5 >= 16;
                                                g.r = var3_5 > 4;
                                                g.m = Code.Code.hasPointerEvents();
                                                g.n = Code.Code.hasPointerMotionEvents();
                                                v0 = new char[]{'\u05e0', '\u05e1', '\u05e2'};
                                                g.at = true;
                                                if (System.getProperty("microedition.pim.version") != null && g.I("javax.microedition.pim.PIM") && Browser.Code.checkPermission("javax.microedition.pim.ContactList.read") != 0) {
                                                    g.al = true;
                                                }
                                                g.W = System.getProperty("microedition.io.file.FileConnection.version") != null;
                                                g.d = Browser.Code.checkPermission("javax.microedition.io.Connector.file.read");
                                                g.e = Browser.Code.checkPermission("javax.microedition.io.Connector.file.write");
                                                if (var0.indexOf("sagem") >= 0) {
                                                    g.B = 5;
                                                    g.U = true;
                                                    g.al = false;
                                                }
                                                if (var1_1.startsWith("vs")) {
                                                    g.B = 8;
                                                }
                                                if (!var1_1.startsWith("rim wireless") && !var1_1.startsWith("blackberry")) break block135;
                                                g.B = 7;
                                                break block136;
                                            }
                                            if (var1_1.indexOf("nokia") < 0 && !var1_1.equals("siemens_sx1") && !var1_1.equals("sendo x") && !var1_1.equals("panasonic x700")) break block137;
                                            g.B = 0;
                                            break block136;
                                        }
                                        if (!g.I("com.siemens.mp.lcdui.Image")) break block138;
                                        g.B = 2;
                                        break block136;
                                    }
                                    if (!g.I("com.motorola.phonebook.PhoneBookRecord") && !g.I("com.motorola.Dialer") && !g.I("com.motorola.phone.Dialer") && !g.I("com.motorola.graphics.j3d.Light") && !g.I("com.motorola.lwt.ComponentScreen") && !g.I("com.motorola.game.GameScreen") && !g.I("com.motorola.funlight.FunLight") && !g.I("com.motorola.multimedia.Lighting") && !g.I("com.motorola.io.ConnectorEvent") && !g.I("com.motorola.extensions.ScalableJPGImage") && g.Code("batterylevel") == null && g.Code("BatteryLevel") == null && !g.I("com.mot.iden.multimedia.Lighting")) break block139;
                                    g.B = 1;
                                    break block136;
                                }
                                if (var1_1.indexOf("sonyericsson") < 0 && !var1_1.equals("symbian os") && !var1_1.startsWith("w302") && (g.Code("com.sonyericsson.IMEI") == null && g.Code("com.sonyericsson.imei") == null || var1_1.startsWith("sonimxp3.20"))) break block140;
                                g.B = 3;
                                break block136;
                            }
                            if (!g.I("com.samsung.util.AudioClip") && !g.I("com.samsung.util.LCDLight") && !g.I("com.samsung.util.SM") && !g.I("com.samsung.util.SMS") && !g.I("com.samsung.util.Vibration") && !var2_2.startsWith("sgh")) break block141;
                            g.B = 4;
                            break block136;
                        }
                        if (!var1_1.startsWith("sagem")) break block142;
                        g.U = false;
                        g.B = 5;
                        break block143;
                    }
                    if (!var1_1.startsWith("micromax") && !var1_1.startsWith("nexiannx-g868") && !var1_1.equals("nexian") && !var1_1.startsWith("maui")) break block136;
                }
                g.al = false;
            }
            var4_7 = g.I("com.jblend.util.Case");
            var5_10 = g.Code("microedition.profiles");
            var6_11 = Code.Code.getWidth();
            var7_12 = Code.Code.getHeight();
            var8_13 = Browser.Code.numColors();
            var9_14 = g.Code("microedition.configuration");
            v1 = var9_15 = var9_14 != null && var9_14.indexOf("CLDC-1.1") >= 0;
            if (var6_11 <= 128 && g.B != 3) {
                g.as = true;
            }
            var10_16 = false;
            switch (g.B) {
                case 3: {
                    if (var1_1.indexOf("t270") == -1 && var1_1.indexOf("t280") == -1) {
                        g.bi = true;
                    }
                    g.b = 3;
                    if (var1_1.indexOf("symbian") >= 0) {
                        g.b = 0;
                    } else if (var1_1.indexOf("p910") >= 0) {
                        g.b = 0;
                    } else if (var1_1.indexOf("m600") >= 0 || var1_1.indexOf("p1") >= 0 || var1_1.indexOf("p9") >= 0) {
                        g.b = 10;
                    }
                    break block144;
                }
                case 0: {
                    g.b = 4;
                    if (var1_1.indexOf("e61") != -1 || var1_1.indexOf("e62") != -1 || var1_1.indexOf("e63") != -1 || var1_1.indexOf("e71") != -1 || var1_1.startsWith("nokia9300/") || var1_1.startsWith("nokia9300i/") || var1_1.startsWith("nokia9500/")) {
                        g.b = 10;
                        g.bi = true;
                    }
                    if (var1_1.startsWith("nokian") || var1_1.startsWith("nokiae") || System.getProperty("com.nokia.mid.ui.version") != null || var1_1.startsWith("nokia6124") || var1_1.startsWith("nokia6120") || var1_1.startsWith("nokia6121") || var1_1.startsWith("nokia5700") || var1_1.startsWith("nokia6110") || var1_1.startsWith("nokia5500")) {
                        g.bi = true;
                    }
                    if (var1_1.startsWith("nokiae90-1/")) {
                        g.bi = false;
                    }
                    if (g.m) {
                        break;
                    }
                    break block144;
                }
                case 1: {
                    g.b = g.I("com.mot.iden.multimedia.Lighting") != false ? 6 : 5;
                    if (g.m) {
                        break;
                    }
                    break block144;
                }
                case 2: {
                    g.b = 7;
                    if (var1_1.startsWith("sk6r")) {
                        g.b = 0;
                    }
                    break block144;
                }
                case 4: {
                    if (var1_1.startsWith("gt-m8800")) {
                        g.c = 1;
                    }
                    if (var2_2.endsWith("sgh-l700")) {
                        g.j = 1;
                    }
                    g.b = 8;
                    if (var0.indexOf("sgh-d900") != -1) {
                        g.bi = true;
                    }
                    if (var0.startsWith("samsung-sgh-e380")) {
                        g.al = false;
                    }
                    break block144;
                }
                case 7: {
                    g.b = 0;
                    g.bi = true;
                    break block144;
                }
                default: {
                    g.b = 2;
                    if (g.m && var1_1.indexOf("emulator") == -1) {
                        g.c = 1;
                    }
                    if (!var1_1.startsWith("lg-kc550")) ** GOTO lbl136
                    g.c = 0;
                    g.bi = true;
                    break block144;
lbl136:
                    // 1 sources

                    if (!var1_1.startsWith("lg-kf510")) ** GOTO lbl140
                    g.m = false;
                    g.n = false;
                    break block144;
lbl140:
                    // 1 sources

                    if (g.B == 8 && var1_1.startsWith("vs")) break block144;
                    if (var1_1.indexOf("motoq") < 0) ** GOTO lbl147
                    g.bi = false;
                    g.b = 10;
                    g.c = 1;
                    g.Q = true;
                    break block144;
lbl147:
                    // 1 sources

                    if (var1_1.indexOf("palm treo 700w") < 0) ** GOTO lbl152
                    g.bi = true;
                    g.b = 10;
                    g.Q = true;
                    break block144;
lbl152:
                    // 1 sources

                    if (!var4_7 && !var1_1.equals("jbed-fastdac") && var1_1.indexOf("windows") < 0 && var1_1.indexOf("intent") < 0 && (!var1_1.equals("jbed") || var7_12 <= 128 || var6_11 <= 128)) break block144;
                }
            }
            g.c = 1;
        }
        if (g.I("com.sprintpcs.util.System") && g.b == 2) {
            g.b = 9;
            g.bi = true;
        }
        if (g.B == 0) {
            if (var6_11 < 176) {
                g.aZ = true;
            }
            if (var6_11 == 176) {
                g.h = true;
                g.bi = true;
                g.ax = 150;
            }
            if (var6_11 == 240 && var7_12 == 248 && var9_15) {
                g.bc = true;
            }
            if (var1_1.indexOf("3220") >= 0) {
                g.k = true;
            }
            if (var1_1.startsWith("nokiae65-1/") != false && g.I((String)var1_1, "/0633.18.02") <= 0 || var1_1.startsWith("nokia5500d/") != false && g.I((String)var1_1, "/04.60") <= 0 || var1_1.startsWith("nokiae50-1/") != false && g.I((String)var1_1, "/07.13.0.0") <= 0 || var1_1.startsWith("nokiae61i-1/") && g.I((String)var1_1, "/0633.22.05") <= 0) {
                g.V = true;
            }
            if (var1_1.startsWith("nokia3230/")) {
                g.y = true;
            }
            if (var1_1.startsWith("nokia6260/")) {
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia6600/")) {
                g.y = true;
                g.u = true;
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia6620/")) {
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia6630/")) {
                g.z = true;
                if (g.I((String)var1_1, "/6.03.40") < 0) {
                    g.W = false;
                }
            }
            if (var1_1.startsWith("nokia6670/")) {
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia6680/")) {
                g.aa = true;
            }
            if (var1_1.startsWith("nokia7610/")) {
                g.y = true;
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia7710/")) {
                g.y = true;
                g.w = true;
                g.ag = true;
            }
            if (var1_1.startsWith("nokia9300/") || var1_1.startsWith("nokia9300i/")) {
                g.w = true;
                g.ag = true;
                g.M = true;
            }
            if (var1_1.startsWith("nokia9500/")) {
                g.w = true;
                g.ag = true;
                g.M = true;
            }
            if (var1_1.startsWith("nokiae90-1/")) {
                g.M = true;
            }
            if (var1_1.startsWith("nokiae66-1/") || var1_1.startsWith("nokian82/") || var1_1.startsWith("nokia5800d-1/") || var1_1.startsWith("nokian79-1/")) {
                g.O = true;
                g.ah = true;
            }
            if (var1_1.startsWith("nokian72/") || var1_1.startsWith("nokian70/") || var1_1.startsWith("nokian70-1/")) {
                g.v = true;
            }
            g.i = "rtyfghvbnmuj";
            g.j = "1234567890*#";
        }
        if (g.B == 3) {
            if (var6_11 <= 176) {
                g.aZ = true;
            }
            if (var1_1.indexOf("p990") >= 0 || var1_1.indexOf("m600") >= 0 || var1_1.indexOf("w950") >= 0) {
                g.S = true;
                if (var1_1.indexOf("p990") < 0) {
                    g.T = true;
                }
            }
            if (var1_1.indexOf("p910") >= 0) {
                g.E = true;
                g.s = true;
                g.ag = true;
            }
            if (var1_1.indexOf("symbian") >= 0) {
                g.s = true;
                g.ag = true;
            }
            if (g.I("javax.wireless.messaging.MultipartMessage") && !g.I("javax.microedition.amms.GlobalManager")) {
                g.C = 2475;
            }
            if (var1_1.startsWith("sonyericssonp1") || var1_1.startsWith("sonyericssonm600")) {
                g.i = "ertyuidfghjkcxvbnm \ufffd\ufffc";
                g.j = "1122334455667788990*#";
            }
            if (var6_11 <= 176) {
                g.x = true;
                var11_17 = Image.createImage((int)1, (int)1);
                var12_18 = var11_17.getGraphics();
                var12_18.setColor(0);
                var12_18.fillRect(0, 0, 1, 1);
                v2 = new int[1];
                var13_19 = v2;
                v2[0] = -1;
                Image.createRGBImage((int[])var13_19, (int)1, (int)1, (boolean)false);
                var13_19[0] = -2147483648;
                var14_20 = Image.createRGBImage((int[])var13_19, (int)1, (int)1, (boolean)true);
                var12_18.drawImage(var14_20, 0, 0, 20);
                var11_17.getRGB(var13_19, 0, 1, 0, 0, 1, 1);
                if ((var13_19[0] & 255) > 16) {
                    g.p = false;
                    g.q = false;
                }
            }
        }
        if (g.B == 1) {
            g.W = g.W != false && g.d != 0 && g.e != 0;
            g.R = true;
            g.C = 1024;
            g.ay = 290;
            if (var6_11 <= 176) {
                g.i = true;
            }
            if (var1_1.indexOf("symbian") >= 0) {
                g.s = true;
                g.ag = true;
            }
            if (var4_7) {
                g.p = false;
                g.q = false;
                g.r = false;
                g.i = "ertdfgxcv+zb";
                g.j = "1234567890*#";
            }
            if (g.I("com.mot.iden.multimedia.Lighting")) {
                g.aY = true;
                g.ag = true;
                g.af = true;
                g.j = true;
                g.l = true;
                g.o = true;
                g.bd = true;
                g.q = false;
            }
        }
        if (g.B == 4) {
            g.bl = false;
            if (var2_2.endsWith("sgh-gt-b2700")) {
                g.m = false;
                g.n = false;
            }
            if (var2_2.startsWith("sgh-g400")) {
                g.m = false;
                g.n = false;
            }
            if (var1_1.startsWith("s7220")) {
                g.m = false;
                g.n = false;
            }
            if (var1_1.startsWith("s7350")) {
                g.m = false;
                g.n = false;
            }
            if (var1_1.equals("j2me") && var3_5 == 2 && var9_15 && var6_11 == 240 && var7_12 == 286 && var8_13 == 65536) {
                g.bf = true;
                g.C = 256;
            }
            if (var6_11 == 240 && var7_12 == 279 && var8_13 == 65536 && var3_5 == 256 && var9_15) {
                g.D = true;
            }
            g.be = true;
            if (var6_11 == 320 && var7_12 == 186 && var8_13 == 65536 && var3_5 == 65536) {
                g.ab = true;
            }
            if (var6_11 == 128 && var7_12 == 144 || var6_11 == 176 && var7_12 == 204 || var6_11 == 220 && var7_12 == 160) {
                g.aY = true;
            }
            if (var1_1.startsWith("gt-m8800")) {
                g.N = true;
            }
            if (var1_1.startsWith("sgh-p310") || var0.indexOf("x820") != -1 || var0.indexOf("sghd830") != -1 || var0.indexOf("sgh-e25") != -1) {
                g.W = false;
            }
            if (var0.indexOf("sgh-e250") != -1 || var0.indexOf("sgh-e370") != -1 || var0.indexOf("sgh-d900") != -1 || var0.indexOf("sphm500") != -1 || var0.indexOf("sphm610") != -1 || var0.indexOf("spha800") != -1 || var0.indexOf("spha900") != -1) {
                g.Q = true;
            }
            if (var1_1.startsWith("sgh-t459")) {
                g.X = true;
                g.C = 1024;
            }
            if (var1_1.startsWith("samsung gt-c3510") || var1_1.startsWith("samsung gt-b3410") || var1_1.startsWith("samsung gt-b5722") || var1_1.startsWith("samsung sgh-d980")) {
                g.m = true;
                g.n = true;
            }
        }
        if (var1_1.indexOf("sxg75") >= 0 || var1_1.indexOf("ef81") >= 0) {
            g.bc = true;
            g.B = 2;
        } else if (g.B == 2) {
            g.ba = true;
            g.j = true;
            g.ag = true;
            g.Q = true;
            g.F = true;
            if (var6_11 < 176) {
                g.aZ = true;
            }
            if (var1_1.indexOf("s68") >= 0) {
                g.A = true;
            }
            if (var1_1.indexOf("el71") >= 0 || var1_1.indexOf("e71") >= 0) {
                g.bh = true;
            }
            if (var1_1.indexOf("c6") >= 0 || var1_1.indexOf("cx6") >= 0 || var1_1.indexOf("m6") >= 0 || var1_1.indexOf("sl75") >= 0) {
                g.ah = true;
            }
        }
        if (g.B == 8 && var1_1.startsWith("vs")) {
            g.R = true;
            g.ad = true;
        }
        if (g.B == 7) {
            g.F = true;
            g.i = "wersdfzxc\u0089aq";
            g.j = "1234567890*#";
            g.ad = true;
            g.P = true;
            g.ah = true;
            var10_16 = true;
        }
        if (g.B == -1) {
            if (var1_1.startsWith("wx320kr") || var1_1.startsWith("wx340k") || var1_1.startsWith("wx333k")) {
                g.ad = true;
            }
            if (var1_1.startsWith("windows ce")) {
                g.bc = true;
                if (!Code.Code.hasPointerEvents() || var1_1.indexOf("palm treo 700w") >= 0) {
                    g.ad = true;
                }
                g.bj = true;
            }
            if (var4_7) {
                g.R = true;
                if (var1_1.equals("j2me") != false && var6_11 == 320 && var7_12 == 186 || var6_11 == 240 && var7_12 == 268 || var6_11 == 320 && var7_12 == 250) {
                    var2_2 = Font.getFont((int)64, (int)0, (int)8);
                    var4_8 = Font.getFont((int)64, (int)1, (int)8);
                    var11_17 = Font.getFont((int)64, (int)1, (int)16);
                    if (var4_8.stringWidth(g.Code(7)) <= var2_2.stringWidth(g.Code(7))) {
                        if (var4_8.stringWidth(g.Code(7)) <= var11_17.stringWidth(g.Code(7))) {
                            g.bq = true;
                            g.Code = new byte[6][2048];
                            for (var2_3 = 0; var2_3 < 6; ++var2_3) {
                                for (var4_9 = 0; var4_9 < 2048; ++var4_9) {
                                    g.Code[var2_3][var4_9] = -1;
                                }
                            }
                        } else {
                            g.l = true;
                        }
                    }
                }
            } else if (var1_1.equals("j2me")) {
                g.bc = true;
                if (var6_11 == 128 && var7_12 == 129) {
                    g.t = true;
                }
            }
            if (var1_1.equals("jbed")) {
                g.bg = true;
                if (var6_11 == 128 && (var7_12 == 110 || var7_12 == 142)) {
                    g.t = true;
                }
                if (var0.startsWith("semc-venus")) {
                    g.j = 1;
                    g.ai = true;
                }
            }
            if (var1_1.equals("jbed-fastdac")) {
                g.ad = true;
                g.bc = true;
                g.C = 260;
            }
            if (var1_1.equals("intent jte")) {
                if (!Code.Code.hasPointerEvents()) {
                    g.ad = true;
                }
                g.ae = true;
            }
            if (var1_1.equals("jbed-fastbcc") && var6_11 == 240 && var7_12 == 325 && var8_13 == 65536 && var3_5 == 256 && var9_15) {
                g.j = 2;
                g.m = true;
                g.n = true;
            }
            if (var1_1.startsWith("maui") || var1_1.startsWith("fly-sx210")) {
                g.ah = true;
            }
            if (var1_1.startsWith("lg-kc910")) {
                g.N = true;
            }
            if (var1_1.startsWith("lg-kc550")) {
                g.m = false;
                g.n = false;
            }
            if (var1_1.startsWith("htc touch diamond p3700") || var1_1.startsWith("htc touch pro t7272") || var1_1.startsWith("htc touch hd t8282")) {
                g.j = 2;
            }
            if (var1_1.startsWith("htc s740")) {
                g.ai = true;
                g.bm = true;
                g.ah = true;
            }
            if (var1_1.startsWith("htc touch pro t7272")) {
                g.ai = true;
            }
            if (var1_1.startsWith("amoi8512")) {
                g.aj = true;
            }
            if (var0.indexOf("t-mobile vairy touch ii/") >= 0) {
                g.m = true;
                g.n = true;
            }
        }
        if (g.I("com.sprintpcs.util.System") || var5_10 != null && var5_10.indexOf("SPRINTPCS-1.0") >= 0) {
            if (var1_1.endsWith("sph-m800") || var1_1.endsWith("sph-m810")) {
                g.b = 0;
                g.bc = true;
                g.P = true;
            }
            var10_16 = true;
            if (g.B == -1) {
                if (var6_11 == 176 && (var7_12 == 177 || var7_12 == 182) || var6_11 == 128 && var7_12 == 136) {
                    g.R = true;
                }
                if (var6_11 == 176 && var7_12 == 185 && var8_13 == 65536 && var3_5 == 256) {
                    g.r = false;
                }
                if (Code.Code.hasRepeatEvents() && var3_5 == 256) {
                    g.Q = true;
                }
            }
        }
        if (!var10_16) {
            g.Y = g.I("javax.wireless.messaging.MessageConnection") != false && g.I("javax.wireless.messaging.TextMessage") != false;
        }
        if (var0.indexOf("spha900") != -1 || var0.indexOf("spha920") != -1) {
            g.bk = true;
            return;
        }
        var0 = Image.createImage((int)10, (int)20);
        var1_1 = var0.getGraphics();
        var2_4 = Image.createImage((int)10, (int)10);
        var3_6 = new Sprite(var2_4);
        var2_4 = var2_4.getGraphics();
        var3_6.setTransform(5);
        var2_4.setColor(0);
        var2_4.fillRect(0, 0, 5, 5);
        var3_6.setPosition(0, 0);
        var3_6.paint((Graphics)var1_1);
        var2_4.setColor(0xFFFFFF);
        var2_4.fillRect(0, 0, 10, 10);
        var2_4.setColor(0);
        var2_4.fillRect(5, 0, 5, 5);
        var3_6.setPosition(0, 10);
        var3_6.paint((Graphics)var1_1);
        var1_1 = new int[1];
        var0.getRGB((int[])var1_1, 0, 1, 9, 19, 1, 1);
        if ((var1_1[0] & 0xFFFFFF) != 0) {
            g.ah = true;
        }
    }

    private byte[] Code(e e2, int n) {
        Object object = Code;
        synchronized (object) {
            int n2;
            int n3;
            int n4;
            int n5;
            Object[] objectArray = e2.Code();
            int[] nArray = e2.Code();
            f.Z();
            String string = (String)objectArray[53];
            if ("myopera:async".equals(string)) {
                I = false;
                for (n5 = 0; n5 < objectArray.length; ++n5) {
                    objectArray[n5] = this.I[n5];
                    nArray[n5] = this.a[n5];
                }
                objectArray[53] = this.g() ? "server:test" : "myopera:sync";
                objectArray[38] = null;
            }
            n5 = 0;
            Object object2 = this.J();
            if (!this.aS) {
                byte[] byArray = ((String)object2 + "\u0000" + I + "\u0000").getBytes();
                n5 = 41 + byArray.length + this.d.I.length + (this.I() ? g.Z(1).length() : 0) + (this.Code == null ? 2 : 0) + this.d.J.length;
                this.b = this.c;
                this.c = null;
                if (this.K > 0) {
                    this.I = null;
                    this.b = null;
                    this.K = 0;
                }
                if (this.I != null) {
                    n5 += 8 + this.I.length;
                } else {
                    for (int i = 0; i < 110; ++i) {
                        this.I[i] = null;
                        this.a[i] = 0;
                    }
                    this.b = null;
                    I = false;
                }
                if (this.b == null) {
                    n5 += 8;
                }
            }
            if (this.a.d()) {
                objectArray[77] = null;
                objectArray[73] = null;
                objectArray[79] = null;
            }
            nArray[0] = 13;
            objectArray[40] = object2;
            objectArray[33] = g.Z(2);
            if (g == null) {
                g.B(false);
            }
            objectArray[6] = g;
            String string2 = Browser.Code.getAppProperty("OM-Install-Referrer");
            objectArray[100] = string2 != null ? string2 : "";
            int n6 = 4;
            for (int i = 0; i < 110; ++i) {
                if (objectArray[i] != null) {
                    if (!(!(objectArray[i] instanceof byte[]) || this.I[i] instanceof byte[] && g.I((byte[])objectArray[i], (byte[])this.I[i]))) {
                        n6 += 7 + ((byte[])objectArray[i]).length;
                        continue;
                    }
                    if (this.I[i] != null && objectArray[i].equals(this.I[i]) || !(objectArray[i] instanceof String)) continue;
                    n6 += n4 + ((n4 = g.Z((String)objectArray[i])) <= 254 ? 4 : 7);
                    continue;
                }
                if (this.a[i] == nArray[i] && this.I[i] == null) continue;
                int n7 = n6;
                n6 = nArray[i] <= 254 ? n7 + 4 : n7 + 7;
            }
            n5 += n6 + 16 + 8 * (n6 / 65529);
            J j = null;
            if (string.equals("myopera:logout") || (string.startsWith("myopera:login") || string.startsWith("myopera:signup")) && (!I || Code.Code != Code.Z) || Code.Z && (!I || Code.B || Code.Code != Code.I)) {
                g.Code(J);
                n4 = string.startsWith("myopera:login") || (Code.J & 1) != 0 ? 1 : 0;
                int n8 = string.startsWith("myopera:login") || (Code.J & 2) != 0 ? 1 : 0;
                j = new J();
                DataOutputStream dataOutputStream = new DataOutputStream(j);
                dataOutputStream.write(6);
                dataOutputStream.writeUTF(Code.B);
                dataOutputStream.writeInt(Code.Code);
                dataOutputStream.write(Code.J | string.equals("myopera:logout") << 3);
                dataOutputStream.writeUTF(Code.Z);
                dataOutputStream.writeUTF(Code.J);
                n3 = j.size();
                dataOutputStream.writeShort(0);
                int n9 = 0;
                n8 = n8 != 0 ? J.size() - v : 0;
                int n10 = 0;
                n4 = n8 + (n4 != 0 ? a.size() : 0);
                boolean bl = false;
                for (int i = 0; i < n4; ++i) {
                    Object[] objectArray2;
                    if (i < n8) {
                        objectArray2 = (Object[])J.elementAt(i + v);
                    } else {
                        objectArray2 = (Object[])a.elementAt(i - n8);
                        n10 = 1;
                    }
                    int n11 = g.Code(objectArray2, 5);
                    if (n11 == 83) continue;
                    ++n9;
                    if (n11 == 97) {
                        objectArray2[5] = new Integer(65);
                        n11 = 65;
                        bl = true;
                    }
                    int n12 = n10 == 0 ? 0 : i - n8 + 1;
                    dataOutputStream.write(n12);
                    dataOutputStream.write(n11);
                    n11 = n10 * -3 + 31;
                    dataOutputStream.write(n11);
                    if (n10 == 0) {
                        dataOutputStream.write((byte[])objectArray2[7], 0, 16);
                    }
                    if ((n11 & 2) != 0) {
                        dataOutputStream.write((byte[])objectArray2[8], 0, 16);
                    }
                    if (n10 != 0 && (g.Code(objectArray2, 9) & 2) != 0) {
                        dataOutputStream.writeUTF("");
                        dataOutputStream.writeUTF("");
                        dataOutputStream.writeShort(0);
                        continue;
                    }
                    dataOutputStream.writeUTF((String)objectArray2[0]);
                    dataOutputStream.writeUTF((String)objectArray2[1]);
                    byte[] byArray = (byte[])objectArray2[2];
                    objectArray2 = byArray;
                    if (byArray == null || objectArray2.length == 0) {
                        dataOutputStream.writeShort(0);
                        continue;
                    }
                    dataOutputStream.writeShort(objectArray2.length);
                    dataOutputStream.write((byte[])objectArray2, 0, objectArray2.length);
                }
                g.Code(n9, j.Code(), n3);
                if (bl) {
                    g.Code(J, false);
                    g.Code(a, false);
                }
                n5 += 25 + j.size() + 8 * (j.size() / 1014);
            }
            J j2 = new J(n5);
            DataOutputStream dataOutputStream = new DataOutputStream(j2);
            int n13 = 0;
            if (!this.aS) {
                n13 = 0;
                if (this.Code == null) {
                    dataOutputStream.write(1);
                    dataOutputStream.write(2);
                    n13 = 2;
                }
                dataOutputStream.write(1);
                dataOutputStream.write(this.d.B, 0, 8);
                dataOutputStream.writeInt(this.d.B[0]);
                ((OutputStream)dataOutputStream).write(this.d.I);
                dataOutputStream.writeShort(n);
                ((OutputStream)dataOutputStream).write(this.d.J);
                n = j2.size();
                dataOutputStream.writeUTF(this.I() ? g.Z(1) : "");
                this.C.Z(j2.Code(), n13, j2.size() - n13);
                this.e.Z(j2.Code(), n13, j2.size() - n13);
                this.C.J(j2.Code(), j2.size(), 16);
                j2.Code(j2.size() + 16);
                this.f.C(j2.Code(), n, j2.size() - n);
                n13 = j2.size();
                byte[] byArray = ((String)object2 + "\u0000" + I + "\u0000").getBytes();
                g.Code(j2, 128, 3, byArray.length);
                ((OutputStream)dataOutputStream).write(byArray);
                if (this.I != null) {
                    g.Code(j2, 15, 0, 8);
                    ((OutputStream)dataOutputStream).write(this.I);
                }
                if (this.b == null) {
                    g.Code(j2, 16, 0, 0);
                }
            }
            if (j != null) {
                g.Code(j2, 5, 0, 1);
                dataOutputStream.write(1);
                int n14 = j.size();
                for (int i = 0; i < n14; i += 1014) {
                    n3 = Math.min(n14 - i, 1014);
                    g.Code(j2, 10, 0, n3);
                    System.arraycopy(j.Code(), i, j2.Code(), j2.size(), n3);
                    j2.Code(j2.size() + n3);
                }
                g.Code(j2, 6, 0, 0);
                I = true;
                Code.Z = Code.Code;
            }
            if ("myopera:logout".equals(string)) {
                I = false;
            }
            ++this.K;
            g.Code(j2, 5, e2.I(), 0);
            g.Code(j2, 22, e2.I(), Math.min(n6, 65529));
            dataOutputStream.writeInt(n6 - 4 + g.Code(e2.Code(false)));
            for (n2 = 0; n2 < 110; ++n2) {
                if (objectArray[n2] != null) {
                    if (!(!(objectArray[n2] instanceof byte[]) || this.I[n2] instanceof byte[] && g.I((byte[])objectArray[n2], (byte[])this.I[n2]))) {
                        dataOutputStream.write(1);
                        dataOutputStream.writeShort(n2);
                        dataOutputStream.writeInt(((byte[])objectArray[n2]).length);
                        ((OutputStream)dataOutputStream).write((byte[])objectArray[n2]);
                    } else if ((this.I[n2] == null || !objectArray[n2].equals(this.I[n2])) && objectArray[n2] instanceof String) {
                        if (g.Z((String)objectArray[n2]) <= 254) {
                            dataOutputStream.write(0);
                            dataOutputStream.write(n2 >> 16);
                            int n15 = j2.size();
                            dataOutputStream.writeUTF((String)objectArray[n2]);
                            j2.Code()[n15] = (byte)n2;
                        } else {
                            dataOutputStream.write(1);
                            dataOutputStream.writeShort(n2);
                            string = (String)objectArray[n2];
                            object2 = new byte[g.Z(string)];
                            int n16 = 0;
                            for (n3 = 0; n3 < string.length(); ++n3) {
                                n16 += g.Code((int)string.charAt(n3), (byte[])object2, n16);
                            }
                            dataOutputStream.writeInt(((Object)object2).length);
                            ((OutputStream)dataOutputStream).write((byte[])object2);
                        }
                    }
                } else if (this.a[n2] != nArray[n2] || this.I[n2] != null) {
                    int n17 = nArray[n2];
                    if (n17 <= 254) {
                        dataOutputStream.write(2);
                        dataOutputStream.writeShort(n2);
                        dataOutputStream.write(n17);
                    } else {
                        dataOutputStream.write(3);
                        dataOutputStream.writeShort(n2);
                        dataOutputStream.writeInt(n17);
                    }
                }
                this.I[n2] = objectArray[n2];
                this.a[n2] = nArray[n2];
            }
            n2 = j2.size() - n6;
            while (n6 > 65529) {
                System.arraycopy(j2.Code(), n2 + 65529, j2.Code(), n2 + 65529 + 8, n6 - 65529);
                j2.Code((n2 += 65537) - 8);
                g.Code(j2, 22, e2.I(), Math.min(n6 -= 65529, 65529));
            }
            this.B(j2.Code(), n13, n5);
            this.aS = true;
            return j2.Code();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final synchronized void Code(String var1_1, String var2_5, String var3_8, Hashtable var4_9) {
        if (var1_1.length() == 0) {
            return;
        }
        if (this.Code != null && this.E >= 0) {
            this.Code.Code();
        }
        var5_8 = g.Code((String)var1_1);
        var6_9 = -1;
        if (this.Code != null) {
            var6_9 = g.Code(this.Code.Code);
        }
        if (g.Code((String)var1_1, "menu:")) {
            Code.Code.Code(g.I((String)var1_1), (String)var3_6, 2, this);
            return;
        }
        if (g.Code((String)var1_1, "si:")) {
            this.Code.Code.Code(g.I((String)var1_1));
            Code.Code.I(this);
            Code.Code.I(this.Code);
            return;
        }
        if (this.Code(16) && var5_8 == 132) {
            this.a(-8, 0);
            return;
        }
        if (this.Code != null && this.Code(2)) {
            if (var5_8 == 115) {
                this.Code.d();
                return;
            }
            Code.Code.I(this);
            if (var5_8 != 114 || this.Code.Code(2)) {
                this.Code.Code((String)var1_1, (String)var2_4, (String)var3_6);
            }
            if (var5_8 == 129 && this.Code.Code(16)) {
                Code.Code.I(this.Code);
            }
            return;
        }
        if (this.Code != null && this.Code(8) && var6_9 == 76) {
            Code.Code.I(this);
            if (var5_8 != 114) {
                this.Code.Code((String)var1_1, (String)var2_4, (String)var3_6);
            }
            return;
        }
        if (g.Code((String)var1_1, "nint:")) {
            if (this.Code != null && this.Code.Code()) {
                return;
            }
            var1_1 = g.I((String)var1_1);
            var5_8 = g.Code((String)var1_1);
        }
        if (g.Code((String)var1_1, "dialog:")) {
            Code.Code.Code(g.I((String)var1_1), (String)var3_6, 4, this);
            return;
        }
        if (g.Code((String)var1_1, "overlay:")) {
            Code.Code.Code(g.I((String)var1_1), (String)var3_6, 8, this);
            return;
        }
        if (g.Code((String)var1_1, "openno:")) {
            for (var2_4 = this; var2_4 != null && var2_4.Code(8); var2_4 = var2_4.I()) {
                Code.Code.I((g)var2_4);
            }
            Code.Code.I(g.I((String)var1_1));
            return;
        }
        if (g.Code((String)var1_1, "get:")) {
            var2_4 = new f(37);
            new f(37).I = g.I((String)var1_1);
            var2_4.Code = this;
            var2_4.Code = this.Code.Code;
            g.Code((Runnable)var2_4);
            return;
        }
        if (g.Code((String)var1_1, "cwd:")) {
            C.Code(g.I((String)var1_1));
            var1_1 = new f(36);
            new f(36).Code = this;
            g.Code((Runnable)var1_1);
            return;
        }
        if (g.Code((String)var1_1, "put:")) {
            var1_1 = g.I((String)var1_1);
            this.Code.Code.Code((String)var1_1, false);
            Code.Code.I(this);
            return;
        }
        if (g.Code((String)var1_1, "mkdir:")) {
            Code.Code(g.Code(171), "", 0, false);
            return;
        }
        if (g.Code((String)var1_1, "open:") && g.Code((String)var2_4) != -1) {
            this.I = new B(this);
            var1_1 = g.I((String)var1_1);
            this.I.Code(var1_1.substring(var1_1.indexOf(58) + 1));
            return;
        }
        if (g.Code((String)var1_1, "sets:")) {
            C.Code(true);
            Code.Code.I(this);
            Code.Code.Code(g.I(134), null, "r");
            return;
        }
        if (g.Code((String)var1_1, "set:")) {
            var1_1 = new f(39);
            new f(39).Code = Code.Code(1);
            g.Code((Runnable)var1_1);
            Code.Code.I(this);
            return;
        }
        var7_11 = false;
        if (g.Code((String)var1_1, "tssr:")) {
            g.as ^= true;
            var1_1 = g.I((String)var1_1);
            var5_8 = g.Code((String)var1_1);
        }
        if (g.Code((String)var1_1, "timg:")) {
            var7_11 = true;
            var1_1 = g.I((String)var1_1);
            var5_8 = g.Code((String)var1_1);
        }
        if (this.Code != null && this.Code.d) {
            if (var5_8 == 115) {
                this.Code.B(false);
                return;
            }
            if (var6_9 == 60 && var5_8 == 116) {
                this.Code.B(false);
                return;
            }
            if (var6_9 == 60 && var5_8 == 81 && C.Code != null) {
                this.Code("cwd:..", null, null);
                return;
            }
            if (var5_8 == 113) {
                this.Code.Code.Code(B.Code(this.Code.Code), false);
            } else if (var5_8 != 114) {
                if (var6_9 == 54) {
                    var1_2 = Integer.parseInt((String)var1_1);
                    if (B.Code == g.J || B.Code == Code.I) {
                        System.arraycopy((Object[])B.Code.elementAt(var1_2), 0, B.I, 0, 3);
                        this.Code.Code.J = "keep";
                        this.Code.Z();
                    } else {
                        B.d = var1_2 - 1;
                    }
                } else {
                    this.Code.Code.Code((String)var1_1, false);
                }
            }
            Code.Code.I(this);
            return;
        }
        if (var5_8 == 115 && this.Code != null) {
            this.Code.d();
            return;
        }
        this.J = var5_8;
        switch (var5_8) {
            case 79: {
                Browser.Code();
                return;
            }
            case 80: {
                this.Code.B = null;
                if (g.b() != 0 && !g.ao) {
                    this.b();
                    Code.Code.Code("", null, 16, this);
                    break;
                }
                Code.Code.J("www.");
                break;
            }
            case 130: {
                Code.Code.J(this.p);
                break;
            }
            case 131: {
                this.Code("");
                break;
            }
            case 120: {
                Code.Code.b();
                break;
            }
            case 39: {
                if ((this.Code != null ? (this.Code.Code != null ? this.Code.Code : "") : "").startsWith("server:")) break;
                Code.Code.Code(g.K ^ true);
                break;
            }
            case 92: 
            case 93: 
            case 96: {
                this.M();
                break;
            }
            case 81: {
                this.C(-1, 0);
                break;
            }
            case 117: {
                this.Code.I(true);
                break;
            }
            case 82: {
                this.C(1, 0);
                break;
            }
            case 97: {
                this.Code(g.J, -1);
                break;
            }
            case 98: {
                this.Code(g.J, 1);
                break;
            }
            case 41: {
                this.Code(g.c, -1);
                break;
            }
            case 42: {
                this.Code(g.c, 1);
                break;
            }
            case 137: {
                this.Code(g.d, -1);
                break;
            }
            case 138: {
                this.Code(g.d, 1);
                break;
            }
            case 140: {
                this.Code(true, null, "s=1&r=2");
                break;
            }
            case 110: {
                this.O();
                break;
            }
            case 83: {
                this.Code(true, var7_11, null);
                break;
            }
            case 119: {
                this.Code.e();
                break;
            }
            case 113: {
                if (this.Code(16)) {
                    this.Code(-5, 0);
                    break;
                }
                if (var6_9 == 60 && this.Code != null) {
                    g.b = false;
                    this.Code(false, null, this.Code.Z);
                    break;
                }
                Code.Code.I(this);
                break;
            }
            case 114: {
                Code.J = false;
                if (!this.Code(1)) {
                    if (g.W && Code.Code.Code == this) break;
                    if (g.W) {
                        Code.Code.I();
                    }
                    Code.Code.I(this);
                    break;
                }
                this.C(-1, 65);
                break;
            }
            case 116: {
                if (var6_9 == 73) {
                    this.Code.Z();
                    this.C(-1, 65);
                    break;
                }
                if (var6_9 != 101 && var6_9 != 100 && var6_9 != 45 && var6_9 != 44 && var6_9 != 52 && var6_9 != 89 && var6_9 != 141) ** GOTO lbl259
                Code.Code.I(this);
                if (var6_9 != 100 && var6_9 != 89) ** GOTO lbl248
                if (B.d >= 0) {
                    v0 = this.Code;
                    v1 = g.a;
                } else {
                    v0 = this.Code;
                    v1 = g.J;
                }
                ** GOTO lbl250
lbl248:
                // 1 sources

                v0 = this.Code;
                v1 = var6_9 == 52 ? g.a : (var6_9 == 141 ? g.d : (var6_9 > 47 ? g.J : g.c));
lbl250:
                // 3 sources

                v0.Code(v1);
                if (var6_9 != 89) {
                    this.Code.Code = true;
                    this.Code.Code(true, false, null);
                }
                if (var6_9 <= 47) break;
                Code.J = false;
                if (Code.Code == Code.I) break;
                this.Code(g.I(49), null, null);
                break;
lbl259:
                // 1 sources

                if (var6_9 == 47) {
                    this.Code.Code(g.c);
                    g.m = g.c.size() - 1;
                    Code.Code.I(g.I(109));
                    break;
                }
                if (var6_9 == 135) {
                    Code.Code.I(this);
                    var1_1 = new f(41);
                    new f(41).Code = (B)B.I[8];
                    var1_1.Code = this;
                    var1_1.Z = this.Code.Code();
                    var1_1.C = (String)this.Code.Code.get("a");
                    g.Code((Runnable)var1_1);
                    break;
                }
                if (var6_9 == 154) {
                    if (g.W && Code.Code.Code == this) break;
                    var1_1 = (String)this.Code.Code.get("a");
                    var2_4 = (String)this.Code.Code.get("b");
                    if (var1_1 == null || var1_1.length() == 0) break;
                    Code.Code.Code((String)var2_4, (String)var1_1, this);
                    break;
                }
                this.M();
                break;
            }
            case 121: {
                switch (var6_9) {
                    case 43: 
                    case 50: 
                    case 99: 
                    case 139: 
                    case 149: {
                        var1_3 = this.Code.B();
                        if (var6_9 == 139) {
                            var2_4 = g.Code(g.d, var1_3);
                            var3_6 = new f(40);
                            new f(40).I = "file:///" + var2_4[0];
                            g.Code((Runnable)var3_6);
                        }
                        if (var6_9 == 149) {
                            var2_4 = new f(43);
                            new f(43).Code = (C)g.B.elementAt(var1_3);
                            var2_4.Code.Code = true;
                            g.Code((Runnable)var2_4);
                            var2_4 = g.B;
                            synchronized (var2_4) {
                                g.B.removeElementAt(var1_3);
                                g.n();
                            }
                        } else {
                            g.I(var6_9 == 99 ? g.J : (var6_9 == 50 ? g.a : (var6_9 == 139 ? g.d : g.c)), var1_3);
                        }
                        Code.Code.I(this);
                        this.Code.Code = true;
                        this.Code.Code(true, false, null);
                        if (var6_9 != 99 && var6_9 != 50) break;
                        Code.J = false;
                        if (Code.Code == Code.I) break;
                        this.Code(g.I(49), null, null);
                        break;
                    }
                    case 32: {
                        Code.Code.removeAllElements();
                        Code.I.removeAllElements();
                        Code.g();
                        g.Z("h1");
                        g.Code = null;
                        g.J(false);
                        Code.Code.I(this);
                        Code.Code.I(g.I(65));
                        break;
                    }
                    case 33: {
                        Code.Code.I(this);
                        Code.Code.I("server:reset");
                        break;
                    }
                    case 126: {
                        Code.Code.I(this);
                        this.Code.Z();
                        break;
                    }
                    case 46: {
                        Code.Code.I(this);
                        Code.Code.I(g.I(127));
                        break;
                    }
                    case 144: {
                        Code.Code.I(this);
                        Code.Z(false);
                        break;
                    }
                    case 155: {
                        Code.Code.I(this);
                        var1_1 = new f(44);
                        new f(44).Code = this;
                        g.Code((Runnable)var1_1);
                        break;
                    }
                    case 153: {
                        Code.Code.I(this);
                        Code.Code.J();
                        break;
                    }
                    default: {
                        this.M();
                        break;
                    }
                }
                break;
            }
            case 122: {
                Code.J = false;
                if (!Code.Code.I(this)) {
                    this.C(-1, 65);
                }
                if (var6_9 == 126) {
                    g.ak = false;
                }
                if (var6_9 != 153 && var6_9 != 155) break;
                Code.Code.Z();
                break;
            }
            case 49: {
                if (!Code.Z) break;
                var1_1 = new f(31);
                new f(31).Code = this;
                g.Code((Runnable)var1_1);
                break;
            }
            case 94: {
                var1_1 = this.Code.J();
                if (var1_1 == null || var1_1.length() <= 0 || var1_1.startsWith("myopera:///b/f/")) break;
                this.Code((String)var1_1 + "/c/", this.Code.Code, this.Code.Code());
                break;
            }
            case 53: {
                if (g.I((String)var3_6, "b")) {
                    B.I[0] = g.I((String)var3_6, "b");
                }
                this.Code("server:gettitle?u=" + (String)B.I[0], null, null);
                break;
            }
            case 59: {
                this.Code.I(false);
                break;
            }
            case 127: {
                Code.Code(g.Code(141), this.e, 0, false);
                break;
            }
            case 51: {
                if (this.Code == null) break;
                this.Code.h();
                break;
            }
            case 134: {
                if (C.Code(false)) {
                    this.Code("dialog:" + g.I(135), null, (String)var3_6);
                    break;
                }
                this.Code(true, "", "s=1&r=1");
                break;
            }
            case 150: {
                ((C)g.B.elementAt((int)this.B())).Code = true;
                break;
            }
            case 151: {
                C.Code((C)g.B.elementAt(this.B()), null);
                break;
            }
            case 152: {
                var1_1 = g.B;
                synchronized (var1_1) {
                    var2_5 = (reference)false;
                    while (var2_5 < g.B.size()) {
                        var3_6 = (C)g.B.elementAt((int)var2_5);
                        if (var3_6.Code == 1 || var3_6.Code == 2) {
                            if (var3_6.Code == 1) {
                                C.Code((C)var3_6);
                            }
                            g.B.removeElementAt((int)var2_5);
                            continue;
                        }
                        ++var2_5;
                    }
                    g.n();
                }
                this.Code = true;
                this.Code(true, false, null);
                break;
            }
            case 142: {
                g.Code();
                Code.Code.I("server:setup");
                break;
            }
            case 63: {
                if (!this.Code.b) break;
                Code.Code.I("share:list?url=" + g.Code(this.Code.Code, true) + "&title=" + g.Code(this.Code.I, true));
                break;
            }
            default: {
                if (g.Code((String)var1_1, "bookmark:")) {
                    Code.Code.I("ext:" + (String)g.Code(g.J, g.J((String)var1_1))[0]);
                    break;
                }
                if (g.Code((String)var1_1, "download:")) break;
                if (g.Code((String)var1_1, "search:")) {
                    g.m = g.J((String)var1_1);
                    Code.Code((String)g.Code(g.c, g.m)[1], "", 0, false);
                    break;
                }
                if (g.Code((String)var1_1, "speeddial:")) {
                    if (g.Code(g.Code(g.a, g.J((String)var1_1)))) {
                        Code.Code.I("dialog:" + g.I(52));
                        break;
                    }
                    if ((var1_1 = (String)g.Code(g.a, g.J((String)var1_1))[0]).equals("www.")) break;
                    Code.Code.I("ext:" + (String)var1_1);
                    break;
                }
                if (g.Code((String)var1_1, "spl:")) {
                    Code.Code.I("ext:" + (String)g.Code(g.I, g.J((String)var1_1))[0]);
                    break;
                }
                if (g.Code((String)var1_1) == 65 && !g.az) {
                    Code.Code.I((String)var1_1);
                    break;
                }
                if (g.Code((String)var1_1, "history:")) {
                    var6_10 = (Object[])Code.I.elementAt(g.J((String)var1_1));
                } else {
                    var8_12 = 0;
                    if (g.Code((String)var1_1, "scl:")) {
                        var8_12 = 52;
                        var1_1 = g.I((String)var1_1);
                        var2_4 = null;
                    } else if (g.Code((String)var1_1, "ext:") && (var1_1 = g.I((String)var1_1)).length() == 0) {
                        return;
                    }
                    v2 = new Object[12];
                    var6_10 = v2;
                    v2[0] = var1_1;
                    var6_10[3] = var3_6;
                    var6_10[7] = new int[6];
                    var6_10[11] = var4_7;
                    var6_10[10] = new Integer(var8_12);
                }
                this.Code(var6_10, (String)var2_4, false, var7_11, false, false, null);
            }
        }
        this.J = var5_8;
    }

    private void Code(String string, Vector vector) {
        for (int i = 0; i < vector.size(); ++i) {
            block10: {
                Object object;
                Object object2 = null;
                if (vector == Code.Code) {
                    object = (String)vector.elementAt(i);
                } else {
                    object = (String)g.Code(vector, i)[0];
                    object2 = g.Code(vector, i)[2];
                }
                Object object3 = string;
                String string2 = object;
                int n = string2.indexOf("://");
                int n2 = string2.indexOf("www.");
                int n3 = 0;
                if (g.Code(string2, "http://", 0) && !g.Code((String)object3, "http://", 0)) {
                    n3 = 7;
                }
                if (!((g.Code(string2, (String)object3, n3) ? 0 : (n2 == 0 && g.Code(string2, (String)object3, n3 + 4) ? 4 : (n != -1 && g.Code(string2, (String)object3, n + 3) ? n + 3 : (n != -1 && n2 == n + 3 && g.Code(string2, (String)object3, n2 + 4) ? n2 + 7 : -1)))) == -1 && string.length() != 0 || ((String)object).equals("www."))) {
                    int n4 = 0;
                    int n5 = 0;
                    if (g.Code((String)object, "http://", 0)) {
                        n4 += 7;
                    }
                    if (((String)object).charAt(((String)object).length() - 1) == '/') {
                        n = ((String)object).indexOf("://");
                        int n6 = n = n == -1 ? n4 : n + 3;
                        if (((String)object).indexOf(47, n) == ((String)object).length() - 1) {
                            ++n5;
                        }
                    }
                    String string3 = ((String)object).substring(n4, ((String)object).length() - n5);
                    Object object4 = object2;
                    object2 = this.g;
                    object = object4;
                    object3 = this.e;
                    string2 = string3;
                    n = string3.indexOf("://");
                    String string4 = n == -1 ? string2 : string2.substring(n + 3);
                    for (n3 = 0; n3 < ((Vector)object3).size(); ++n3) {
                        String string5 = (String)((Vector)object3).elementAt(n3);
                        int n7 = string5.indexOf("://");
                        String string6 = n7 == -1 ? string5 : string5.substring(n7 + 3);
                        int n8 = string2.compareTo(string5);
                        int n9 = string4.compareTo(string6);
                        if (n8 != 0) {
                            if (n9 >= 0 && (n9 != 0 || (n8 >= 0 || n7 == -1) && n != -1)) continue;
                            ((Vector)object3).insertElementAt(string2, n3);
                            ((Vector)object2).insertElementAt(object, n3);
                        }
                        break block10;
                    }
                    ((Vector)object3).addElement(string2);
                    ((Vector)object2).addElement(object);
                }
            }
            if (this.e.size() <= 50) continue;
            this.e.removeElementAt(this.e.size() - 1);
            this.g.removeElementAt(this.e.size() - 1);
        }
    }

    private static void Code(int[] nArray, int[] nArray2) {
        int n = nArray.length - g.Code(0, nArray);
        int n2 = nArray2.length - g.Code(0, nArray2);
        int n3 = nArray.length - n - (nArray2.length - n2);
        int[] nArray3 = new int[nArray2.length - n2 + n3];
        n3 <<= 5;
        while (n3 >= 0) {
            int n4;
            int n5;
            int[] nArray4 = nArray3;
            int n6 = n3;
            int[] nArray5 = nArray2;
            int n7 = n6 >>> 5;
            int n8 = nArray5.length - n2;
            if ((n6 &= 0x1F) == 0) {
                System.arraycopy(nArray5, n2, nArray4, nArray4.length - n8 - n7, n8);
            } else {
                n5 = 32 - n6;
                n4 = nArray5[n2] >>> n5;
                if (n4 != 0) {
                    ++n7;
                }
                int n9 = nArray4.length - n8 - n7;
                if (n4 != 0) {
                    nArray4[n9++] = n4;
                }
                n4 = nArray5[n2];
                for (int i = n2 + 1; i < n8; ++i) {
                    int n10 = nArray5[i];
                    nArray4[n9++] = n4 << n6 | n10 >>> n5;
                    n4 = n10;
                }
                nArray4[n9] = nArray5[n8 + n2 - 1] << n6;
            }
            int n11 = nArray4.length - n8 - n7;
            block2: while (true) {
                long l;
                int[] nArray6 = nArray3;
                int n12 = n11;
                int[] nArray7 = nArray;
                n8 = nArray.length - g.Code(n, nArray7);
                if (nArray7.length - n8 != nArray6.length - (n12 = nArray6.length - g.Code(n12, nArray6))) {
                    if (nArray7.length - n8 - (nArray6.length - n12) < 0) break;
                } else {
                    while (n8 < nArray7.length - 1 && nArray7[n8] == nArray6[n12]) {
                        ++n8;
                        ++n12;
                    }
                    if ((int)(((long)nArray7[n8] & 0xFFFFFFFFL) - ((long)nArray6[n12] & 0xFFFFFFFFL) >> 63) < 0) break;
                }
                nArray6 = nArray3;
                n12 = n11;
                nArray7 = nArray;
                n8 = nArray.length - 1;
                n5 = nArray6.length - 1;
                n4 = 0;
                do {
                    l = ((long)nArray7[n8] & 0xFFFFFFFFL) - ((long)nArray6[n5--] & 0xFFFFFFFFL) + (long)n4;
                    nArray7[n8--] = (int)l;
                    n4 = (int)(l >> 63);
                } while (n5 >= n12);
                while (true) {
                    if (n8 < n || l >= 0L) continue block2;
                    l = ((long)nArray7[n8] & 0xFFFFFFFFL) + (long)n4;
                    nArray7[n8--] = (int)l;
                }
                break;
            }
            --n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int Code(byte[] byArray, int n, int n2) {
        this.L = 0;
        if (this.F == this.E) {
            this.F = 0;
        }
        int n3 = n2;
        n2 = this.E - this.F;
        int n4 = n3;
        n2 = n3 < n2 ? n4 : n2;
        this.H = this.F + n2;
        n2 = this.F;
        block9: while (this.H != this.F && this.N < this.O) {
            switch (this.D) {
                case 7: {
                    return 0;
                }
                case 0: {
                    this.Q = 0;
                    this.K = this.B(16);
                    this.B(16);
                    this.D = 3;
                }
                case 3: {
                    while (this.K > 0) {
                        --this.K;
                        this.I[this.F++] = (byte)this.d();
                        if (this.H != this.F) continue;
                        break block9;
                    }
                    break;
                }
                case 1: {
                    for (n4 = 0; n4 < 144; ++n4) {
                        this.J[n4] = 8;
                    }
                    while (n4 < 256) {
                        this.J[n4] = 9;
                        ++n4;
                    }
                    while (n4 < 280) {
                        this.J[n4] = 7;
                        ++n4;
                    }
                    while (n4 < 288) {
                        this.J[n4] = 8;
                        ++n4;
                    }
                    g.Code(this.J, 288, this.Code);
                    for (n4 = 0; n4 < 32; ++n4) {
                        this.J[n4] = 5;
                    }
                    g.Code(this.J, 32, this.I);
                    this.D = 4;
                }
                case 4: {
                    if (!this.a()) break;
                    break block9;
                }
                case 2: {
                    n4 = this.B(5) + 257;
                    int n5 = this.B(5) + 1;
                    int n6 = this.B(4) + 4;
                    for (int i = 0; i < 19; ++i) {
                        int n7 = i < 3 ? i + 16 : (i == 3 ? 0 : ((i & 1) == 1 ? 7 - (i - 5 >>> 1) : 8 + (i - 4 >>> 1)));
                        this.J[n7] = i < n6 ? (byte)this.B(3) : (byte)0;
                    }
                    short[] sArray = new short[36];
                    g.Code(this.J, 19, sArray);
                    g.Code(this.Code(sArray, n4), n4, this.Code);
                    g.Code(this.Code(sArray, n5), n5, this.I);
                    this.D = 5;
                }
                case 5: {
                    if (this.a()) break block9;
                }
            }
            if (this.M == 1) {
                this.D = 7;
                break;
            }
            this.M = this.B(1);
            this.D = this.B(2);
        }
        if (byArray != null) {
            System.arraycopy(this.I, n2, byArray, n, this.F - n2);
        }
        return this.F - n2;
    }

    private static char Code(char c) {
        if (c >= ' ' && c <= '\u00ff') {
            return (char)(c - 32);
        }
        if (c >= '\u0410' && c <= '\u044f' && aK) {
            return (char)(c - 816);
        }
        if (aK) {
            switch (c) {
                case '\u0401': {
                    return '\u0120';
                }
                case '\u0451': {
                    return '\u0121';
                }
                case '\u0407': {
                    return '\u0122';
                }
                case '\u0457': {
                    return '\u0123';
                }
                case '\u040e': {
                    return '\u0124';
                }
                case '\u045e': {
                    return '\u0125';
                }
                case '\u0491': {
                    return '\u0126';
                }
                case '\u0492': {
                    return '\u0127';
                }
                case '\u0406': {
                    return '\u0128';
                }
                case '\u0456': {
                    return '\u0129';
                }
            }
        }
        switch (c) {
            case '\u2022': {
                return 'u';
            }
            case '\u2013': {
                return 'v';
            }
            case '\u2026': {
                return 'e';
            }
            case '\u20ac': {
                return 'f';
            }
            case '\u2020': {
                return 'g';
            }
            case '\u2030': {
                return 'h';
            }
            case '\u201e': {
                return 'i';
            }
            case '\u2122': {
                return 'j';
            }
            case '\u201d': {
                return 't';
            }
            case '\u2014': {
                return 'w';
            }
            case '\u201c': {
                return 's';
            }
            case '\u2018': {
                return 'q';
            }
            case '\u2019': {
                return 'r';
            }
        }
        return (char)(R - 1);
    }

    /*
     * Unable to fully structure code
     */
    private static String Z(String var0, String var1_1) {
        block19: {
            block20: {
                block18: {
                    if (var0 != null) break block18;
                    v0 = null;
                    break block19;
                }
                var2_3 = var0.length();
                var3_4 = var0.indexOf(":/");
                var4_5 = var0.indexOf(58);
                if (var3_4 < 0 || var3_4 > 10) break block20;
                v0 = var0;
                break block19;
            }
            if (var4_5 == -1 || var3_4 != -1) ** GOTO lbl-1000
            if (var4_5 + 1 == var2_3) {
                v0 = var0;
            } else {
                v1 = var0.charAt(var4_5 + 1);
                var2_3 = v1;
                if (v1 < '0' || var2_3 > 57) {
                    v0 = var0;
                } else lbl-1000:
                // 2 sources

                {
                    v0 = var0 = "http://" + var0;
                }
            }
        }
        if (v0 == null) {
            return "";
        }
        var2_3 = var0.indexOf("https://");
        var3_4 = var0.indexOf(47, var2_3 + 8);
        var4_6 = new StringBuffer(var0);
        if (var1_1 != null && var1_1.length() > 0 && var2_3 == -1) {
            var5_7 = var1_1.indexOf("={\"c\":");
            if (var5_7 != -1) {
                var1_1 = var1_1.substring(0, var5_7);
            }
            var1_1 = g.J(var1_1);
            var4_6.append('?').append(var1_1);
        }
        if (var2_3 != -1 && var3_4 != -1) {
            var4_6.delete(var3_4, var4_6.length());
        }
        var1_2 = 0;
        var2_3 = 0;
        for (var3_4 = var4_6.length() - 1; var3_4 >= 0; --var3_4) {
            v2 = var4_6.charAt(var3_4);
            var5_7 = v2;
            if (v2 < '!' || var5_7 > 126 || "\"#;<>[]^`{|}~\\".indexOf(var5_7) >= 0) {
                var4_6.deleteCharAt(var3_4);
                continue;
            }
            if (var5_7 == 61) {
                var1_2 = 1;
            } else if (var5_7 == 38) {
                var2_3 = 0;
                var1_2 = 0;
            } else if (var5_7 == 46) {
                var2_3 = 1;
            }
            if (var3_4 <= var0.length() || var1_2 == 0 || var2_3 == 0) continue;
            var4_6.deleteCharAt(var3_4);
        }
        var4_6.setLength(127);
        if (var4_6.charAt(126) == '%') {
            var4_6.setLength(126);
        } else if (var4_6.charAt(125) == '%') {
            var4_6.setLength(125);
        }
        return var4_6.toString().trim();
    }

    private void Code(Object[] objectArray, String string, boolean bl, boolean bl2, Hashtable hashtable, String string2) {
        this.I = new B(this);
        this.I.Code = bl2;
        if (objectArray != null) {
            this.I.Code(objectArray);
        }
        if (hashtable != null) {
            this.I.Code = hashtable;
        }
        if (string2 != null) {
            this.I.Code = string2;
        }
        this.I.I = bl;
        this.I.Code(string, bl2);
    }

    private static synchronized void Code(DataOutputStream dataOutputStream) {
        dataOutputStream.writeBoolean(aQ);
        dataOutputStream.writeByte(C);
        dataOutputStream.writeByte(a);
        dataOutputStream.writeUTF(r == null ? "" : r);
        dataOutputStream.writeUTF(q == null ? "" : q);
        dataOutputStream.writeByte(Code);
        dataOutputStream.writeByte(Code.size());
        Enumeration enumeration = Code.keys();
        while (enumeration.hasMoreElements()) {
            Object object = (String)enumeration.nextElement();
            dataOutputStream.writeUTF((String)object);
            object = (g)((Object[])Code.get(object))[0];
            g.Code(dataOutputStream, ((g)object).B);
            dataOutputStream.writeLong(((g)object).a);
            ((OutputStream)dataOutputStream).write(((g)object).Z);
            dataOutputStream.write(((g)object).I.length);
            ((OutputStream)dataOutputStream).write(((g)object).I);
            if (Code[1] == null) {
                dataOutputStream.writeInt(0);
                continue;
            }
            g.Code(dataOutputStream, ((g)object).a);
            g.Code(dataOutputStream, ((g)object).b);
        }
    }

    private static boolean Code(String string, boolean n) {
        boolean bl = false;
        if (g.B() || n != 0) {
            for (n = 0; n < string.length(); ++n) {
                int n2;
                int n3 = string.charAt(n);
                if (n3 >= 65512) {
                    n2 = 19;
                } else if (I[aQ] <= n3 && I[aQ + 1] > n3) {
                    n2 = i[aQ];
                } else {
                    int n4;
                    int n5;
                    if (n3 < 256) {
                        n5 = 49;
                        n4 = 0;
                    } else {
                        n5 = I.length;
                        n4 = 0;
                    }
                    while (true) {
                        int n6;
                        if (I[n6 = n5 + n4 >> 1] <= n3) {
                            if (I[n6 + 1] > n3) {
                                aQ = n6;
                                n2 = i[n6];
                                break;
                            }
                            n4 = n6;
                            continue;
                        }
                        n5 = n6;
                    }
                }
                n3 = n2;
                if (n2 == 1) break;
                if (n3 != 2 && n3 != 3) continue;
                bl = true;
                break;
            }
        }
        return bl;
    }

    final synchronized void Code(B object) {
        if (object != this.Code && object != this.I) {
            return;
        }
        switch (((B)object).C) {
            case 1: {
                Code.Code.d();
                return;
            }
            case 2: {
                Code.Code.c();
                return;
            }
            case 4: {
                this.Code(this.I, false);
                this.I = null;
                return;
            }
            case 5: 
            case 6: 
            case 7: {
                if (this.Code != null) {
                    object = this.Code;
                    Object[] objectArray = ((B)object).Code;
                    ((C)object).Code = null;
                    if (objectArray == null || objectArray[4] == null) {
                        ((C)object).Code = 1;
                        g.n();
                        return;
                    }
                    C.I((C)object, objectArray);
                    return;
                }
                if (((B)object).Code != null) {
                    if (((B)object).Code[4] != null && am) {
                        g.I((String)((B)object).Code[4]);
                    } else if (((B)object).Code[4] != null) {
                        f f2 = new f(47);
                        new f(47).Code = ((B)object).Code;
                        f2.Code = this;
                        g.Code(f2);
                    } else if (((B)object).Code[5] != null) {
                        g.I((String)((B)object).Code[5]);
                    }
                }
                this.I = null;
                if (!((B)object).Code()) {
                    Code.Code.e();
                }
                g.a();
                if (!bh) break;
                object = new f(12);
                Code.Code.Code.schedule((TimerTask)object, 4000L);
            }
        }
    }

    final boolean I(int n) {
        if (n == -1 && this.Code != null && this.Code.B) {
            n = 0;
        }
        return this.E + n >= 0 && this.E + n < this.Code.size();
    }

    final int B() {
        String string = this.Code.Z();
        if (g.Code(string, "bookmark:") || g.Code(string, "speeddial:") || g.Code(string, "search:") || g.Code(string, "open:") || g.Code(string, "download:")) {
            return g.J(string);
        }
        return -1;
    }

    static void I(String string) {
        Object object;
        if (!(string == null || string.indexOf("&url=rtsp://") == -1 && string.indexOf("rtsp://") == -1 || (object = g.Code("com.lge.wifi.connected")) == null || ((String)object).toLowerCase().equals("true"))) {
            string = g.Code("com.lge.rtsp.error.message");
            if (string != null && !string.equals("")) {
                Code.Code(string);
                return;
            }
            Code.Code("Streaming is available only with WIFI connection.");
            return;
        }
        object = new f(6);
        new f(6).Code = string;
        g.Code((Runnable)object);
    }

    public final void Code(B b, int n, String object) {
        int n2;
        int n3;
        int n4;
        this.Code = b;
        int n5 = 0;
        for (n4 = 0; n4 < ((String)object).length(); ++n4) {
            n3 = ((String)object).charAt(n4);
            n2 = n3;
            if (1536 <= n2 && n2 <= 1791) {
                n5 = 1;
                break;
            }
            if ((64336 > n3 || n3 > 65023) && (65136 > n3 || n3 > 65278)) continue;
            n5 = 1;
            break;
        }
        this.Code.i = n;
        while (this.Code.i < this.Code.I.length) {
            this.O = this.Code.i;
            n = this.Code.J();
            if (n == 84 || n == 66 || n == 73 || n == 70) {
                this.Code.C();
            }
            if (n == 84) {
                this.H = this.Code.e;
                this.ab = this.Code.f;
                this.Code.i += 4;
                this.Code.J();
                String string = this.Code.I();
                if (n5 != 0) {
                    object = g.C((String)object);
                    string = g.C(string);
                }
                this.M = this.Code.i;
                n4 = this.a(this.Code.i);
                this.E = 0;
                while (this.E < string.length()) {
                    int[][] nArray;
                    n3 = n5;
                    n2 = 1;
                    int n6 = this.Code.size();
                    int n7 = n4;
                    int n8 = this.ab;
                    int n9 = this.H;
                    String string2 = string;
                    int n10 = this.E;
                    int n11 = this.O;
                    Object object2 = object;
                    g g2 = this;
                    block3: while (true) {
                        int n12;
                        int n13;
                        int n14;
                        int n15;
                        int n16;
                        if (((String)object2).length() <= string2.length() - n10) {
                            if (string2.regionMatches(true, n10, (String)object2, 0, ((String)object2).length())) {
                                n3 = n2;
                                n2 = n6;
                                n6 = n10 + ((String)object2).length();
                                n7 = n11;
                                n8 = g2.ab;
                                n9 = g2.H;
                                int n17 = g2.E;
                                n10 = g2.O;
                                g g3 = g2;
                                int[][] nArray2 = new int[n3][10];
                                int n18 = 0;
                                while (true) {
                                    int n19;
                                    boolean bl = true;
                                    g3.Code.i = n10 + 1;
                                    g3.Code.C();
                                    g3.Code.i = n10 + 15;
                                    n16 = g3.Code.J() - (j << 1);
                                    String string3 = g3.Code.I();
                                    n15 = g3.Code.g;
                                    if (g.Code(string3, true)) {
                                        bl = false;
                                        n15 = Math.min(g.Code(n16, string3), g3.Code.g);
                                    }
                                    n14 = 0;
                                    n13 = 0;
                                    for (n19 = 0; n19 < n17; ++n19) {
                                        if (string3.charAt(n19) != '\n') continue;
                                        ++n14;
                                        n13 = n19 + 1;
                                    }
                                    n19 = g.J(n16);
                                    n13 = g.Code(n16, string3.substring(n13, n17));
                                    n12 = n17;
                                    if (n10 == n7) {
                                        n7 = g.Code(n16, string3.substring(n17, n6));
                                        nArray2[n18] = g.Code(n10, n12, n6 -= n12, bl ? n13 : n15 - n13 - n7, n19 * n14, n7, n19, n9, n8, n2);
                                        nArray = nArray2;
                                        break block3;
                                    }
                                    n15 = g3.a(g3.Code.i);
                                    g3.Code.C();
                                    int n20 = n9 + g3.Code.e;
                                    int n21 = n8 + g3.Code.f;
                                    n17 = g.Code(n16, string3.substring(n17, string3.length()));
                                    n16 = string3.length() - n12;
                                    nArray2[n18] = g.Code(n10, n12, n16, bl ? n13 : 0, n19 * n14, n17, n19, n9, n8, n2);
                                    n10 = n15;
                                    n17 = 0;
                                    n9 = n20;
                                    n8 = n21;
                                    ++n18;
                                }
                            }
                            nArray = null;
                            break;
                        }
                        if (n7 == -1 || !string2.regionMatches(true, n10, (String)object2, 0, string2.length() - n10)) {
                            nArray = null;
                            break;
                        }
                        g2.Code.i = n11 + 1;
                        g2.Code.C();
                        n11 = g2.Code.g;
                        n16 = g2.Code.h;
                        g2.Code.i = n7 + 1;
                        g2.Code.C();
                        int n22 = n9 + g2.Code.e;
                        n15 = n8 + g2.Code.f;
                        n14 = g2.Code.g;
                        n13 = g2.Code.h;
                        g2.Code.i += 4;
                        g2.Code.J();
                        String string4 = g2.Code.I();
                        if (n3 != 0) {
                            string4 = g.C(string4);
                        }
                        n12 = g2.a(g2.Code.i);
                        int n23 = n9;
                        int n24 = n8;
                        int n25 = n11;
                        n8 = n13;
                        n9 = n14;
                        n11 = n16;
                        n16 = n25;
                        n14 = n24;
                        n13 = n23;
                        if (n14 >= n15 + n8 || n14 + n11 <= n15 || (n13 < n22 ? n13 + n16 != n22 : n13 != n22 + n9)) {
                            if (((String)object2).charAt(string2.length() - n10) == ' ' && ((String)object2).length() > string2.length() - n10 + 1) {
                                String string5 = ((String)object2).substring(string2.length() - n10 + 1);
                                int n26 = n7;
                                ++n2;
                                n7 = n12;
                                n8 = n15;
                                n9 = n22;
                                string2 = string4;
                                n10 = 0;
                                n11 = n26;
                                object2 = string5;
                                continue;
                            }
                            nArray = null;
                            break;
                        }
                        String string6 = ((String)object2).substring(string2.length() - n10);
                        int n27 = n7;
                        ++n2;
                        n7 = n12;
                        n8 = n15;
                        n9 = n22;
                        string2 = string4;
                        n10 = 0;
                        n11 = n27;
                        object2 = string6;
                    }
                    int[][] nArray3 = nArray;
                    if (nArray != null) {
                        this.Code.addElement(nArray3);
                    }
                    ++this.E;
                }
                this.Code.i = this.M;
                continue;
            }
            this.Code.I(n);
        }
        g g4 = this;
        Enumeration enumeration = g4.Code.elements();
        while (enumeration.hasMoreElements()) {
            object = (int[][])enumeration.nextElement();
            n4 = 0;
            while (n4 < ((Object)object).length) {
                Object object3 = object[n4];
                Integer n28 = new Integer((int)object3[0]);
                if (g4.I.containsKey(n28)) {
                    ((Vector)g4.I.get(n28)).addElement(object3);
                    ++n4;
                    continue;
                }
                Vector<Object> vector = new Vector<Object>();
                vector.addElement(object3);
                g4.I.put(n28, vector);
                ++n4;
            }
        }
    }

    private g(String string) {
        this.aJ = true;
        this.aI = true;
        this.e = true;
        this.e = string;
    }

    static Vector I(int n) {
        switch (n) {
            case 101: {
                return J;
            }
            case 52: {
                return a;
            }
            case 141: {
                return d;
            }
        }
        return c;
    }

    g() {
        this.aJ = true;
        this.aI = true;
        this.g = true;
        this.Code = new Vector();
        this.I = new Hashtable();
        this.H = 0;
        this.ab = 0;
    }

    private synchronized e Code(int n) {
        for (int i = 0; i < this.Code.size(); ++i) {
            e e2 = (e)this.Code.elementAt(i);
            if (e2.I() != n) continue;
            return e2;
        }
        return null;
    }

    private void Code(boolean bl, int n) {
        if (this.J(n)) {
            if (bl) {
                this.run();
                return;
            }
            g.Code(this);
        }
    }

    public final void virtualKeypadCompleted(String string) {
        Code.Code.Code(string, this.Code);
    }

    private g(char c) {
        this.aJ = true;
        this.I = new byte[4];
        this.B = new int[64];
        this.y();
    }

    private g(short s) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.I = new byte[64];
        this.B = new byte[32];
    }

    private static int Code(int n, int[] nArray) {
        while (nArray[n] == 0) {
            if (++n != nArray.length) continue;
            return 0;
        }
        return nArray.length - n;
    }

    private g(byte[] byArray, byte by) {
        this.D = 6;
        this.Code = new short[574];
        this.I = new short[62];
        this.J = new byte[288];
        this.I = byArray;
        this.E = byArray.length;
        if (Z[0] == 0) {
            int n;
            g.Z[0] = 1;
            g.Z[1] = 2;
            for (n = 1; n < 29; ++n) {
                g.Z[n + 1] = (1 << n / 2) + (1 << (n - 1) / 2) + 1;
            }
            by = (byte)3;
            for (n = 0; n < 28; ++n) {
                g.I[n] = by;
                by = (byte)(by + (n < 8 ? 1 : 1 << (n - 4) / 4));
            }
            g.I[28] = 258;
        }
    }

    private static void Code(J j, int n, int n2, int n3) {
        j.Code(j.size() + 8);
        g.Code(j.Code(), j.size() - 8, n, n2, n3);
    }

    private g(String string, String string2, int n, String string3, int n2) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.e = string;
        this.p = string2;
        this.D = n;
        this.o = string3;
        this.K = n2;
    }

    private int a(int n) {
        if (n >= this.Code.I.length || this.Code.J() != 84) {
            return -1;
        }
        return n;
    }

    private void z() {
        int n;
        int n2;
        for (n2 = 16; n2 <= 63; ++n2) {
            n = this.B[n2 - 2];
            int n3 = ((n >>> 17 | n << 15) ^ (n >>> 19 | n << 13) ^ n >>> 10) + this.B[n2 - 7];
            n = this.B[n2 - 15];
            this.B[n2] = n3 + ((n >>> 7 | n << 25) ^ (n >>> 18 | n << 14) ^ n >>> 3) + this.B[n2 - 16];
        }
        n2 = this.L;
        n = this.K;
        int n4 = this.D;
        int n5 = this.E;
        int n6 = this.P;
        int n7 = this.Q;
        int n8 = this.O;
        int n9 = this.H;
        int n10 = 0;
        for (int i = 0; i < 8; ++i) {
            int n11 = g.I(n6, n7, n8) + J[n10];
            int n12 = n10++;
            n9 += g.Z(n2, n, n4);
            int n13 = g.I(n5 += (n9 += n11 + this.B[n12]), n6, n7) + J[n10];
            int n14 = n10++;
            n8 += g.Z(n9, n2, n);
            int n15 = g.I(n4 += (n8 += n13 + this.B[n14]), n5, n6) + J[n10];
            int n16 = n10++;
            n7 += g.Z(n8, n9, n2);
            int n17 = g.I(n += (n7 += n15 + this.B[n16]), n4, n5) + J[n10];
            int n18 = n10++;
            n6 += g.Z(n7, n8, n9);
            int n19 = g.I(n2 += (n6 += n17 + this.B[n18]), n, n4) + J[n10];
            int n20 = n10++;
            n5 += g.Z(n6, n7, n8);
            int n21 = g.I(n9 += (n5 += n19 + this.B[n20]), n2, n) + J[n10];
            int n22 = n10++;
            n4 += g.Z(n5, n6, n7);
            int n23 = g.I(n8 += (n4 += n21 + this.B[n22]), n9, n2) + J[n10];
            int n24 = n10++;
            n += g.Z(n4, n5, n6);
            n6 += (n2 += g.I(n7 += (n += n23 + this.B[n24]), n8, n9) + J[n10] + this.B[n10++]);
            n2 += g.Z(n, n4, n5);
        }
        this.L += n2;
        this.K += n;
        this.D += n4;
        this.E += n5;
        this.P += n6;
        this.Q += n7;
        this.O += n8;
        this.H += n9;
        this.N = 0;
        for (n2 = 0; n2 < 16; ++n2) {
            this.B[n2] = 0;
        }
    }

    private static Object[] Code(String string, boolean bl) {
        Integer n;
        String string2;
        String string3;
        String string4 = "";
        string = string.toLowerCase();
        while (string.startsWith("<")) {
            string = string.substring(string.indexOf(62) + 1);
        }
        int n2 = string.indexOf(58);
        if (n2 != -1 && (string3 = string.substring(0, n2)).indexOf(46) == -1) {
            string = string.substring(n2 + 1);
        } else {
            string3 = "http";
        }
        if (!J.containsKey(string3)) {
            string2 = "";
            n = Code;
        } else {
            int n3;
            if (string.startsWith("//")) {
                string = string.substring(2);
            }
            if ((n2 = string.indexOf(63)) != -1) {
                string4 = string.substring(n2);
                string = string.substring(0, n2);
            }
            if ((n3 = string.indexOf(47)) != -1) {
                string2 = string.substring(0, n3);
                string = string.substring(n3);
            } else {
                string2 = string;
                string = "";
            }
            n3 = string2.indexOf(64);
            if (n3 != -1) {
                string2 = string2.substring(n3 + 1);
            }
            if (bl && string2.startsWith("www.")) {
                string2 = string2.substring(4);
            }
            if ((n3 = string2.indexOf(58)) != -1) {
                n = Integer.valueOf(string2.substring(n3 + 1));
                string2 = string2.substring(0, n3);
            } else {
                n = (Integer)J.get(string3);
            }
        }
        return new Object[]{string3, string2, n, string, string4};
    }

    static void Code(Object object) {
        Object object2 = object;
        synchronized (object2) {
            object.notifyAll();
            return;
        }
    }

    private boolean d() {
        return (this.L & 4) != 0;
    }

    final void I(int n) {
        if (this.Code != null) {
            this.Code.Code(n);
        }
    }

    final boolean Code(int n, int n2) {
        if (this.Code(16)) {
            return n >= this.O && n <= this.O + this.Q && n2 >= this.K && n2 <= this.K + this.at + this.ap;
        }
        return n >= this.O && n <= this.O + this.Q && n2 >= this.K && n2 <= this.K + this.G;
    }

    private int I(boolean bl) {
        if (bl) {
            return Math.max(this.ap * this.ao / this.e.size(), m ? Math.max(this.ap >> 3, 5) : 5);
        }
        return Math.max(this.G * this.G / Math.max(this.Code.c(), this.G), m ? Math.max(this.G >> 3, 5) : 5);
    }

    final void I(Graphics graphics) {
        g.Code(graphics, this.O, this.K, this.L, this.G);
        this.Code.I(graphics, this.O, this.K);
    }

    private g(boolean bl, byte by) {
        int n;
        Image image;
        this.aJ = true;
        this.aI = true;
        if (C == null) {
            DataInputStream dataInputStream = null;
            try {
                dataInputStream = g.Code(0);
                aK = dataInputStream.readByte() > 0;
                if (aK) {
                    R = 299;
                    S = 14;
                } else {
                    R = 225;
                    S = 10;
                }
                byte[] byArray = new byte[R];
                byte[] byArray2 = new byte[R];
                int n2 = 0;
                Z = dataInputStream.readByte();
                for (int i = 0; i < R; ++i) {
                    short s = (short)(n2 + dataInputStream.readByte());
                    n2 = s;
                    byArray[i] = (byte)s;
                }
                J = dataInputStream.readByte();
                for (n2 = 0; n2 < R; ++n2) {
                    byArray2[n2] = (byte)(byArray[n2] + dataInputStream.readByte());
                }
                C = byArray;
                a = byArray2;
            }
            catch (Throwable throwable) {
                try {
                    ((InputStream)dataInputStream).close();
                }
                catch (Throwable throwable2) {}
                throw throwable;
            }
            try {
                ((InputStream)dataInputStream).close();
            }
            catch (Throwable throwable) {}
        }
        if (bl) {
            image = g.Code(4);
            this.I = a;
            Code = J;
            this.K = 4;
        } else {
            image = g.Code(5);
            this.I = C;
            Code = Z;
            this.K = 7;
        }
        if (image == null) {
            return;
        }
        this.L = image.getWidth();
        this.Q = image.getHeight();
        this.Code = new I[this.K];
        for (by = 0; by < this.K; by = (byte)(by + 1)) {
            this.Code[by] = new I();
        }
        this.G = 0;
        int[] nArray = new int[this.L * this.Q];
        image.getRGB(nArray, 0, this.L, 0, 0, this.L, this.Q);
        this.B = new byte[this.L * this.Q];
        this.B = new int[8];
        int n3 = nArray.length;
        for (n = 0; n < n3; ++n) {
            this.B[n] = 7 - ((nArray[n] & 0xFF) >> 5);
            this.B[this.B[n]] = 255 - (nArray[n] & 0xFF);
        }
        this.B[0] = 0;
        if (!p) {
            for (n3 = 0; n3 < this.B.length; ++n3) {
                this.B[n3] = n3 < 3 ? 0 : 255;
            }
        }
        this.Z = new byte[R];
        this.J = new byte[R];
        n3 = 0;
        int n4 = 0;
        for (n = 0; n < R; ++n) {
            if (n3 + this.I[n] >= this.L) {
                n3 = 0;
                n4 = (byte)(n4 + 1);
            }
            this.Z[n] = n3;
            this.J[n] = n4;
            n3 = (byte)(n3 + this.I[n]);
        }
        this.I[0] = this.I[0];
    }

    final B Code() {
        if (this.Code != null && this.Code.C <= 4) {
            return this.Code;
        }
        return this.I;
    }

    private static void Code(int[] nArray, int n) {
        while (n-- > 0) {
            nArray[n] = 0;
        }
    }

    private static boolean Z(String string, String string2) {
        char c;
        int n = string.length();
        int n2 = string2.length();
        int n3 = 0;
        do {
            if (n == n3) {
                return n2 == n3;
            }
            c = string.charAt(n3);
            if (c != '*') continue;
            String string3 = string.substring(n3 + 1);
            string = string2.substring(n3);
            string2 = string3;
            n = string.length();
            n2 = 0;
            do {
                if (!g.Z(string2, string.substring(n2))) continue;
                return true;
            } while (n > n2++);
            return false;
        } while (n3 < n2 && c == string2.charAt(n3++));
        return false;
    }

    static boolean Code(String string, String string2) {
        if (string == null) {
            return false;
        }
        return string.startsWith(string2);
    }

    public static int Code(int n, int n2, int n3) {
        return Math.max(Math.min(n, n3), n2);
    }

    public static void I(int n, byte[] byArray, int n2) {
        byArray[n2] = n >> 24;
        byArray[n2 + 1] = (byte)(n >> 16);
        byArray[n2 + 2] = (byte)(n >> 8);
        byArray[n2 + 3] = (byte)n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean Code(e object) {
        String string;
        if (this.Z[0] != 72 || this.Z[1] != 84 || this.Z[2] != 84 || this.Z[3] != 80) {
            return false;
        }
        this.B(5, 7);
        if (this.a.c() && this.Z[8] == 32 && this.Z[9] == 51 && this.Z[10] == 48 && (this.Z[11] == 49 || this.Z[11] == 50 || this.Z[11] == 51 || this.Z[11] == 55)) {
            this.G = 1;
            string = null;
            try {
                string = this.Z("location");
            }
            catch (Throwable throwable) {}
            if (string == null || string.length() == 0) {
                return false;
            }
            if (object != null) {
                if (((e)object).Code(string)) {
                    this.Z((e)object);
                    g.I((e)object);
                    g.F();
                } else {
                    ((e)object).close();
                }
            }
            Object object2 = Code;
            synchronized (object2) {
            }
        } else {
            if (this.Z[8] == 32 && this.Z[9] == 52 && this.Z[10] == 48 && this.Z[11] == 51) {
                this.G = 2;
                object = new StringBuffer();
                try {
                    this.Z((String)null);
                    int string2 = 0;
                    while (++string2 <= 256) {
                        this.B(0, 1);
                        if (this.Z[0] > 32) {
                            ((StringBuffer)object).append((char)this.Z[0]);
                            if (string2 != 4 || ((StringBuffer)object).toString().toLowerCase().equals("http")) continue;
                            ((StringBuffer)object).setLength(0);
                        }
                        break;
                    }
                }
                catch (Throwable throwable) {}
                f = ((StringBuffer)object).length() > 4 ? ((StringBuffer)object).toString() : null;
                this.Code(false, 4);
                Code.Code.I(g.I(62));
                return true;
            }
            return false;
        }
        {
            e e2 = Code;
            while (true) {
                if (e2 == null) {
                    // MONITOREXIT @DISABLED, blocks:[3, 7, 11] lbl49 : MonitorExitStatement: MONITOREXIT : var3_4
                    this.Code(false, 0);
                    return true;
                }
                if (e2.Code() == this.D && !e2.Z() && e2 != object) {
                    if (e2.Code(string)) {
                        g.F();
                    } else {
                        e2.close();
                    }
                }
                e2 = e2.Code();
            }
        }
    }

    private static String C(String string) {
        StringBuffer stringBuffer = null;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if ('\ufe80' > c || c > '\ufefc') continue;
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer(string);
            }
            if (c < '\ufef5') {
                stringBuffer.setCharAt(i, 1536 + (0xFF & j[c - 65152]));
                continue;
            }
            stringBuffer.setCharAt(i, '\u0644');
            stringBuffer.insert(++i, 1536 + (0xFF & g.i[c - 65269]));
        }
        if (stringBuffer == null) {
            return string;
        }
        return stringBuffer.toString();
    }

    private void B(int n) {
        this.Code(n >> 24);
        this.Code((byte)(n >>> 16));
        this.Code((byte)(n >>> 8));
        this.Code((byte)n);
    }

    private static String J(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (!(c > '/' && c < ':' || c > '@' && c < '[' || c > '`' && c < '{' || "-_.~".indexOf(c) != -1 || "%&=".indexOf(c) != -1)) {
                stringBuffer.append('%').append(Integer.toString(c, 16));
                ++n;
                continue;
            }
            stringBuffer.append(c);
            ++n;
        }
        return stringBuffer.toString();
    }

    static void Code(StringBuffer stringBuffer, String string) {
        stringBuffer.ensureCapacity(stringBuffer.length() + string.length());
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (c == '\u0000') {
                stringBuffer.append("%00");
                ++n;
                continue;
            }
            if ("%&=".indexOf(c) >= 0) {
                stringBuffer.append('%').append(Integer.toString(c, 16));
                ++n;
                continue;
            }
            stringBuffer.append(c);
            ++n;
        }
    }

    static void w() {
        g.J((int)System.currentTimeMillis());
    }

    private static int B(String string) {
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            n = n * 31 + string.charAt(i);
        }
        return n;
    }

    private boolean i() {
        return !this.Code.Code(2) && this.Code != null && g.Code(this.Code.Code) != 123;
    }

    final void Code(int n, int n2) {
        if (this.Code(16)) {
            this.a(n, n2);
            return;
        }
        int n3 = this.Code.h();
        int n4 = this.Code.i();
        switch (n) {
            case -5: {
                this.Code.d();
                return;
            }
            case 1: {
                this.Code.Code(0, -1, n2);
                return;
            }
            case 6: {
                this.Code.Code(0, 1, n2);
                return;
            }
            case 2: {
                if (this.Code(2)) {
                    if (g.B()) {
                        this.Code.c();
                        return;
                    }
                    Code.Code.I(this);
                    return;
                }
                this.Code.Code(-1, 0, n2);
                return;
            }
            case 5: {
                if (this.Code(2)) {
                    if (g.B()) {
                        Code.Code.I(this);
                        return;
                    }
                    this.Code.c();
                    return;
                }
                this.Code.Code(1, 0, n2);
                return;
            }
            case 52: {
                this.Code.Code(-n3, 0, true, true);
                return;
            }
            case 54: {
                this.Code.Code(n3, 0, true, true);
                return;
            }
            case -9: 
            case 50: {
                if (bn && n == -9) break;
                this.Code.Code(0, -n4, true, true);
                return;
            }
            case -10: 
            case 56: {
                if (bn && n == -10) break;
                this.Code.Code(0, n4, true, true);
                return;
            }
            case 53: {
                if (!this.Code.I()) {
                    this.J = 117;
                }
                this.Code.I(this.Code.I() ^ true);
                return;
            }
            case 48: {
                Code.Code.I(true);
                return;
            }
            case 49: {
                this.Code.Code(false);
            }
        }
    }

    private void C(int n, int n2) {
        boolean bl;
        boolean bl2 = bl = n < 0;
        if (n == -1 && this.Code != null && this.Code.B) {
            n = 0;
        }
        if (!this.I(n)) {
            if (n2 > 0) {
                Code.Code.I(g.I(n2));
            }
            return;
        }
        this.H = this.E + n;
        Object[] objectArray = (Object[])this.Code.elementAt(this.H);
        this.Code(objectArray, null, false, false, this.a, bl, null);
    }

    final void C() {
        if (this.Code(16)) {
            if (bi) {
                Code.B = 36;
                Code.C = 10;
            } else {
                Code.B = 25;
                if (this.ag > 0 && this.ak > 0) {
                    Code.C = 26;
                }
            }
            Code.a = 23;
            return;
        }
        Code.B = 0;
        Code.C = this.I(-1) * -19 + 23;
        Code.a = 23;
        if (this.Code != null) {
            if (this.Code.J()) {
                Code.a = 27;
            } else if (this.Code.B()) {
                Code.a = 29;
            }
            if (this.Code.Z()) {
                if (aw) {
                    Code.C = 12;
                } else if (this.E > 0 && ((Object[])this.Code.elementAt(this.E - 1))[8] == this.Code) {
                    Code.C = 4;
                }
            }
            if (g.I(60).equals(this.Code.Code)) {
                String string = this.Code.J();
                if (g.Code(string, "cwd:") || g.Code(string, "get:")) {
                    this.Code.Code = 1;
                } else if (g.Code(string, "put:")) {
                    this.Code.Code = 7;
                }
            }
            if (this.Code.Code >= 0) {
                Code.B = this.Code.Code;
            }
            if (this.Code.I >= 0) {
                Code.C = this.Code.I;
            }
            if (this.Code.B >= 0) {
                Code.a = this.Code.B;
            }
        }
    }

    private static int Z(String string) {
        int n = 0;
        int n2 = 0;
        while (n2 < string.length()) {
            char c = string.charAt(n2);
            if (c > '\u0000' && c <= '\u007f') {
                ++n;
                ++n2;
                continue;
            }
            if (c > '\u07ff') {
                n += 3;
                ++n2;
                continue;
            }
            n += 2;
            ++n2;
        }
        return n;
    }

    private int d() {
        while (this.N >= this.O) {
            this.Z.a(true);
        }
        ++this.L;
        return this.Z[this.N++] & 0xFF;
    }

    static boolean Code(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return n < n5 + n7 && n + n3 > n5 && n2 < n6 + n8 && n2 + n4 > n6;
    }

    static void Code(DataOutputStream dataOutputStream, int n) {
        dataOutputStream.writeShort(n >> 8);
        dataOutputStream.write(n);
    }

    private static int J(String string) {
        int n = (string = g.I(string)).indexOf(58);
        if (n != -1) {
            string = string.substring(0, n);
        }
        return Integer.parseInt(string);
    }

    private static int Code(int n, byte[] byArray, int n2) {
        if (n <= 127) {
            byArray[n2] = (byte)n;
            return 1;
        }
        if (n <= 2047) {
            byArray[n2++] = (byte)(0xC0 | n >> 6);
            byArray[n2] = (byte)(0x80 | n & 0x3F);
            return 2;
        }
        byArray[n2++] = (byte)(0xE0 | n >> 12);
        byArray[n2++] = (byte)(0x80 | n >> 6 & 0x3F);
        byArray[n2] = (byte)(0x80 | n & 0x3F);
        return 3;
    }

    public static void Code(int n, byte[] byArray, int n2) {
        byArray[n2] = (byte)(n >> 8);
        byArray[n2 + 1] = (byte)n;
    }

    private boolean Code(long l) {
        return this.a < l || this.a - 1814400000L > l;
    }

    public static void Z(int n, byte[] byArray, int n2) {
        byArray[n2] = (byte)(n >> 16);
        byArray[n2 + 1] = (byte)(n >> 8);
        byArray[n2 + 2] = (byte)n;
    }

    private boolean b() {
        if (!az) {
            return false;
        }
        long l = System.currentTimeMillis();
        return this.Code(l) && this.Code(l - b);
    }

    private g(int n, int n2, String string, int n3, int n4, String string2, String string3) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.G = n;
        this.L = n2;
        this.o = string;
        this.K = n3;
        this.Q = n4;
        this.e = string2;
        this.p = string3;
    }

    final synchronized void Code(String string, String string2, String string3) {
        this.Code(string, string2, string3, null);
    }

    private byte[] Code(short[] sArray, int n) {
        byte[] byArray = new byte[n];
        int n2 = 0;
        while (n2 < n) {
            int n3 = this.Code(sArray);
            if (n3 < 16) {
                byArray[n2++] = (byte)n3;
                continue;
            }
            int n4 = this.B(n3 == 18 ? 7 : n3 - 14) + 3;
            if (n3 == 18) {
                n4 += 8;
            }
            n3 = n3 > 16 ? 0 : byArray[n2 - 1];
            while (n4-- > 0) {
                byArray[n2++] = n3;
            }
        }
        return byArray;
    }

    public g(boolean bl) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.Code = bl;
    }

    private void L() {
        this.H();
        this.d.A();
        int n = ((this.Z[1] & 0xFF) << 2) + 128;
        int n2 = this.Z[2] & 0xFF;
        this.B(5, n2 + 166 + n);
        this.G();
        this.d.I = new byte[n2 + 1];
        b = this.d.I;
        System.arraycopy(this.Z, 2, this.d.I, 0, n2 + 1);
        int[] nArray = g.Code(this.Z, n2 + 3, 160);
        int[] nArray2 = g.Code(this.Z, n2 + 163, n);
        n = n2 + 163 + n;
        byte[] byArray = this.Z;
        this.d.a = (long)g.Z(this.Z, n) << 32 | (long)g.Z(byArray, n + 4) & 0xFFFFFFFFL;
        this.d.a = nArray;
        this.d.b = nArray2;
        if (!aL) {
            b = System.currentTimeMillis() - (this.d.a - 1209600000L);
            aL = true;
        }
    }

    private void a(int n, int n2) {
        if (Code == null) {
            return;
        }
        if (n == -6 || n == -7) {
            return;
        }
        if (n == -11 && b == 2) {
            n = 49;
        }
        boolean bl = this.af != -1 && this.ae == n && System.currentTimeMillis() - this.I < 1000L;
        boolean bl2 = false;
        boolean bl3 = true;
        if (this.af != -1 && !bl) {
            bl2 = this.Code(true);
        }
        switch (n) {
            case -5: {
                this.Code = null;
                if (bl2) break;
                if (this.ac != -1 && this.ac == this.e.size() - 1) {
                    Code.Code.J(this.p);
                } else {
                    String string;
                    Code.Code.I(this);
                    if (this.ac == -1 || this.e.size() == 0) {
                        string = this.p;
                        Code.Code.Z(string);
                    } else if (this.ac == this.e.size() - 2) {
                        Code.Code.I((String)g.Code(c, 0)[0], this.p);
                        string = this.p;
                    } else {
                        string = (String)this.e.elementAt(this.ac);
                        Code.Code.Z(string);
                    }
                    B b = this.Code.Code;
                    if (string != null && g.Code(b.Code) == 65) {
                        b.Code.put("o:a", string);
                    }
                }
                bl3 = false;
                break;
            }
            case 1: {
                int n3;
                g g2;
                if (bl2) break;
                if (this.ac < 0) {
                    g2 = this;
                    n3 = this.e.size();
                } else {
                    g g3 = this;
                    g2 = g3;
                    n3 = g3.ac;
                }
                g2.ac = n3 - 1;
                if (this.e.size() == 0) {
                    bl3 = true;
                    break;
                }
                bl3 = false;
                break;
            }
            case 6: {
                if (bl2) break;
                if (this.aR) {
                    this.ag = this.Code.length();
                } else {
                    this.ac = this.ac >= this.e.size() - 1 ? -1 : ++this.ac;
                }
                if (this.e.size() == 0) {
                    bl3 = true;
                    break;
                }
                bl3 = false;
                break;
            }
            case -8: {
                if (this.aR) {
                    this.Code = new StringBuffer();
                } else if ((bl2 || this.ac == -1) && this.Code.length() > 0 && this.ag > 0) {
                    this.Code.deleteCharAt(--this.ag);
                }
                this.ac = -1;
                break;
            }
            case 2: {
                if (this.ac != -1 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer((String)this.e.elementAt(this.ac));
                    this.ac = -1;
                }
                this.ag = Math.max(0, this.ag - 1);
                break;
            }
            case 5: {
                if (this.aR) {
                    this.ag = this.Code.length();
                    break;
                }
                if (bl2) break;
                if (this.ac != -1 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer((String)this.e.elementAt(this.ac));
                    this.ac = -1;
                    this.ag = this.Code.length();
                    break;
                }
                this.ag = Math.min(this.Code.length(), this.ag + 1);
                break;
            }
            default: {
                n2 = g.Code(n, this.af, n2 > 0);
                if (n2 == -1) break;
                if (this.aR) {
                    this.Code = new StringBuffer();
                }
                if (n2 == 8 || n2 == 127) {
                    if ((bl2 || this.ac == -1) && this.Code.length() > 0 && this.ag > 0) {
                        this.Code.deleteCharAt(--this.ag);
                    }
                    this.ac = -1;
                    break;
                }
                this.af = (char)n2;
                if (!g.B(n)) {
                    bl2 = this.Code(true);
                    break;
                }
                bl3 = false;
            }
        }
        if (bl3) {
            this.Z(bl2);
        }
        this.g();
        this.aR = false;
        this.I = System.currentTimeMillis();
        this.ae = n;
    }

    g(int n, g g2) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.c = true;
        this.Code = new Vector(30);
        this.E = -1;
        this.H = -1;
        this.a = false;
        this.e = "";
        this.J = false;
        this.e = new Vector();
        this.f = new Vector();
        this.g = new Vector();
        this.ac = -1;
        this.ad = 0;
        this.ae = Integer.MAX_VALUE;
        this.I = 0L;
        this.af = -1;
        this.Code = null;
        this.C = false;
        this.ag = 0;
        this.ah = 0;
        this.aR = false;
        this.F = n;
        this.Code = g2;
        if (n == 16) {
            this.au = g.J(0);
            this.av = this.au + 5;
            this.I = this.Z = g.Code(Code.J, 0, Code.J.length, 256, null);
            this.aV = Code.f > 128;
            this.aw = Math.max(this.au, this.Z.getHeight()) + 5;
            int n2 = n = g2.Code != null && g.Code(g2.Code.Code) == 65 ? 1 : 0;
            if (!(g2.Code == null || g2.Code.Code == null || g.Code(g2.Code.Code) != -1 || g2.Code.C || g2.Code.Code.startsWith("myopera:") || g2.Code.Code.startsWith("feed:") || g2.Code.Code.startsWith("sk:") || g2.Code.Code.startsWith("share:"))) {
                this.Code = new StringBuffer(g2.Code.Code);
                this.aR = true;
            } else {
                String string = "www.";
                if (n != 0) {
                    g2.Code.Z(true);
                    g2 = g2.Code.Code.get("o:a");
                    if (g2 != null && g2 instanceof String) {
                        string = (String)((Object)g2);
                    }
                }
                this.Code = new StringBuffer(string);
                this.ag = this.Code.length();
            }
            if (n == 0) {
                this.ab = (int)System.currentTimeMillis();
                Code.f();
                this.D = -this.aw - 9;
            }
        }
        this.I();
    }

    final void I() {
        this.O = 0;
        this.K = Code.Code.Z() ? Code.d : 0;
        this.Q = Code.f;
        this.G = Code.g - (Code.Code.J() ? Code.c : 0) - this.K;
        this.P = this.L = this.Q;
        int n = 0;
        int n2 = 0;
        if (this.Code != null) {
            n = this.Code.C();
            n2 = this.Code.a();
        }
        if (this.Code(16)) {
            this.P = this.L = (this.Q = this.Code.P);
            if (this.e.size() > 0) {
                this.Z(false);
            }
            this.g();
        } else if (this.Code(2)) {
            int n3;
            int n4;
            int n5 = ad ? 0 : Code.c;
            this.P = this.Q;
            this.Q = this.L = n;
            this.G = Math.min(n2, Code.g);
            if (this.Code.Code(2)) {
                n4 = g.B() ? this.Code.O - this.Q + 6 : this.Code.O + this.Code.Q - 6;
                n3 = this.Code.K + this.Code.a() - 10;
                if (n3 + this.G > Code.g - n5) {
                    n3 += 20 - this.G;
                }
            } else if (this.Code == null || g.Code(this.Code.Code) != 123) {
                int n6 = n4 = L ? Code.f - this.Q : 0;
                n3 = L ? Code.d - 4 : Code.g + 4;
            } else {
                n4 = this.Code.O + this.Code.C();
                n3 = this.Code.K + this.Code.a();
            }
            this.O = g.Code(n4, 0, Code.f - this.Q);
            n4 = L && this.i() ? n3 : Math.max(n3, this.K);
            this.K = g.Code(n4, 0, Code.g - n5 - this.G + 4);
        }
        if (this.Code(8)) {
            this.P = Code.f * 9 / 10;
            this.Q = this.L = Math.min(n, this.P);
            this.G = Math.min(n2, (Code.g << 3) / 10);
            if (n2 > this.G) {
                this.Q += 4;
            }
            this.O = (Code.f - this.Q) / 2;
            this.K = (Code.g - this.G) / 2;
            if (this.Code != null) {
                this.Code.Z(this.G - this.I(false));
            }
        }
        if (this.Code(1) && (this.Code == null || this.L != this.Code.getWidth() || this.G != this.Code.getHeight())) {
            this.Code = null;
            try {
                this.Code = Image.createImage((int)this.L, (int)this.G);
                this.aS = true;
            }
            catch (Throwable throwable) {}
        }
        if (this.Code != null) {
            this.Code.Code(0, 0, false, false);
        }
    }

    private void B(byte[] byArray, int n, int n2) {
        int n3;
        for (int i = n; i < n2; i += n3 + 6) {
            n3 = g.I(byArray, i + 4);
            this.C.a(this.O++);
            this.C.Z(byArray, i + 4, n3 + 2);
            this.C.J(byArray, i, 4);
        }
        this.f.C(byArray, n, n2 - n);
    }

    static void Code(Runnable runnable) {
        new Thread(runnable).start();
    }

    static String[] Code(String objectArray) {
        String[] stringArray = new String[2];
        objectArray = g.Code((String)objectArray, false);
        stringArray[0] = (String)objectArray[1] + ':' + objectArray[2];
        stringArray[1] = "http://10.0.0.172:80" + (String)objectArray[3] + (String)objectArray[4];
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    private g(int var1_1, byte var2_3, boolean var3_4) {
        block19: {
            block18: {
                this.aJ = true;
                this.aI = true;
                this.d = true;
                this.a = true;
                super();
                this.Code = new Vector<E>();
                this.Z = new byte[1024];
                this.I = new Object[110];
                this.a = new int[110];
                this.C = false;
                this.D = var1_1;
                if (var3_4) {
                    this.a = g.Z(var1_1);
                    this.C = true;
                } else {
                    this.a = g.I(var1_1);
                }
                var1_1 = 0;
                var3_5 = this;
                var4_6 = g.e();
                if (var4_6 != 460) break block18;
                v0 = 1;
                break block19;
            }
            if (var4_6 != -1) ** GOTO lbl-1000
            var4_7 = g.I((int)0).o;
            var5_10 = var4_7.indexOf(46);
            var6_11 = var4_7.indexOf("cn");
            var4_6 = var4_7.indexOf("china");
            if (var6_11 >= 0 && var6_11 < var5_10 || var4_6 >= 0 && var4_6 < var5_10) {
                v0 = 1;
            } else {
                var4_8 = System.getProperty("wireless.messaging.sms.smsc");
                if (var4_8 != null) {
                    v0 = var4_8.startsWith("+86") || var4_8.startsWith("0086") ? 1 : 0;
                } else if (g.Z(1).length() == 0 && (var4_8 = System.getProperty("microedition.locale")) != null) {
                    v0 = (int)var4_8.toLowerCase().endsWith("cn");
                } else lbl-1000:
                // 2 sources

                {
                    v0 = 0;
                }
            }
        }
        var4_6 = v0;
        var3_5.I = new String[var4_6 + 2];
        if (!var3_5.a.e()) {
            v1 = var3_5.I;
            v2 = 0;
            v3 = "socket://" + var3_5.a.o + ":" + var3_5.a.Q;
        } else {
            v1 = var3_5.I;
            v2 = 0;
            v3 = v1[v2] = "socket://do_not_use_me:0";
        }
        if (var4_6 != 0) {
            var3_5.I[1] = "http://10.0.0.172:80/";
        }
        var3_5.I[var3_5.I.length - 1] = var3_5.Z();
        if (this.I.length != g.Code) {
            g.Code = this.I.length;
            g.Code();
            var1_1 = 1;
        }
        if ((var4_9 = (Object[])g.Code.get(var3_5 = this.a.Code())) != null) {
            this.Z = var4_9;
            this.d = (g)var4_9[0];
        } else {
            this.d = new g(g.Code(g.Code(this.a.e), 0, 160));
            this.Z = new Object[2];
            this.Z[0] = this.d;
            this.Z[1] = "";
            g.Code.put(var3_5, this.Z);
            var1_1 = 1;
        }
        if (var1_1 != 0) {
            g.J(false);
        }
        if (var2_3 != -1) {
            v4 = var2_3;
        } else {
            var1_2 = this;
            v4 = g.C >= 0 && var1_2.a.e() == false ? g.C : (g.a >= 0 ? g.a : 1);
        }
        this.I = v4;
        this.E();
        v5 = this;
        if (g.az && g.z >= 160) {
            v5.aR = true;
            return;
        }
        v5.aR = false;
    }

    private static synchronized void Code(DataInputStream dataInputStream) {
        aQ = dataInputStream.readBoolean();
        C = dataInputStream.readByte();
        a = dataInputStream.readByte();
        String string = dataInputStream.readUTF();
        r = string.length() == 0 ? null : string;
        string = dataInputStream.readUTF();
        q = string.length() == 0 ? null : string;
        Code = dataInputStream.readByte();
        int n = dataInputStream.readByte();
        for (int i = 0; i < n; ++i) {
            String string2 = dataInputStream.readUTF();
            g g2 = new g(g.Code(dataInputStream));
            new g(g.Code(dataInputStream)).a = dataInputStream.readLong();
            dataInputStream.readFully(g2.Z);
            int n2 = dataInputStream.readUnsignedByte();
            if (n2 != 0) {
                g2.I = new byte[n2];
                dataInputStream.readFully(g2.I);
                b = g2.I;
            }
            g2.a = g.Code(dataInputStream);
            g2.b = g.Code(dataInputStream);
            if (g2.b()) continue;
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = g2;
            objectArray2[1] = "";
            Code.put(string2, objectArray2);
        }
    }

    final boolean Code(g g2) {
        return g2.Code(this.O, this.K) && g2.Code(this.O + this.Q, this.K + this.Q);
    }

    static void i() {
        if (bc) {
            return;
        }
        Image image = g.Code(6);
        if (image != null && image.getWidth() == 1) {
            bb = true;
            return;
        }
        bb = false;
    }

    private void Code(byte[] byArray) {
        int n = this.G << 3;
        this.Code((byte)-128);
        while (this.F != 0) {
            this.Code((byte)0);
        }
        g g2 = this;
        if (g2.N > 14) {
            g2.z();
        }
        g2.B[15] = n;
        this.z();
        g.J(this.L, byArray, 0);
        g.J(this.K, byArray, 4);
        g.J(this.D, byArray, 8);
        g.J(this.E, byArray, 12);
        g.J(this.P, byArray, 16);
        g.J(this.Q, byArray, 20);
        g.J(this.O, byArray, 24);
        g.J(this.H, byArray, 28);
        this.y();
    }

    private g(byte by) {
        this(new byte[32768], 0);
    }

    private static void J(int n, byte[] byArray, int n2) {
        byArray[n2] = n >> 24;
        byArray[n2 + 1] = (byte)(n >>> 16);
        byArray[n2 + 2] = (byte)(n >>> 8);
        byArray[n2 + 3] = (byte)n;
    }

    private void Code(byte[] byArray, int n, int n2) {
        this.Z = byArray;
        this.N = n;
        this.O = n + n2;
    }

    private static int e() {
        try {
            return Integer.parseInt(System.getProperty("com.sonyericsson.net.mcc"));
        }
        catch (Throwable throwable) {
            return -1;
        }
    }

    static {
        k = new g("i", "*", 0, "/firsttime/*", 1);
        l = new g("sk", "*", 0, "/*", 1);
        m = new g("server", "*", 0, "setup", 1);
        n = new g(0, 0, "server4.operamini.com", 80, 1080, "c1dd7ab77e2c967746fe10681026c920f864811321bcb8be6bbfa5a03fda4e16c9c8db3af280f7703366e778e93c55e7159a8852d2b1381e521a337f22b1406cddf41a3114aecb4f4bfe79e0c5aa2ba8824fc989cb8bdcbf8ec5cef5176bfd4059f229b91bfa025126b295f9c409e75f6f6415ee094fd7f5dfd395a1f431668c5a08e88de891dc4dd38d4e9aa9b9c00dc604a0428e3aa5a28ccfa75af099147b", "server4.operamini.com");
        g.S();
        b = true;
        B = (byte)-1;
        aQ = true;
        C = (byte)-1;
        a = (byte)-1;
        q = "";
        r = "";
        Code = new Hashtable();
        Code = new Object();
        V = -1;
        g = "-";
        Z = -1;
        b = new byte[0];
        J = "";
        C = "";
        J = g.Code(g.Code("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), 0, 256);
        I = new int[29];
        Z = new int[30];
    }

    private int Code(Graphics graphics, char c, int n, int n2) {
        if ((c = g.Code(c)) != '\u0000') {
            byte by = this.J[c];
            g g2 = this;
            if (g2.Code.Code[by] == null) {
                int n3 = Code * g2.L;
                int n4 = by * n3;
                for (int i = 0; i < n3; ++i) {
                    g.C[i] = g2.Code.Code[g2.B[i + n4]];
                }
                g2.Code.Code[by] = Image.createRGBImage((int[])C, (int)g2.L, (int)Code, (boolean)true);
            }
            graphics.drawRegion(g2.Code.Code[by], (int)this.Z[c], 0, (int)this.I[c], (int)Code, 0, n, n2, 0);
        }
        return this.I[c];
    }

    private static int C(int n) {
        switch ((n & 0xFF) >> 4) {
            case 12: 
            case 13: {
                return 2;
            }
            case 14: {
                return 3;
            }
            case 15: {
                return 4;
            }
        }
        return 1;
    }

    private final int B(int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (this.Q == 0) {
                this.P = this.d();
                this.Q = 8;
            }
            n2 |= (this.P & 1) << i;
            this.P >>>= 1;
            --this.Q;
        }
        return n2;
    }

    private static final void Code(byte[] byArray, int n, short[] sArray) {
        int n2;
        for (n2 = 0; n2 < sArray.length; ++n2) {
            sArray[n2] = 0;
        }
        n2 = 2;
        int n3 = 0;
        for (int i = 1; i <= 16; ++i) {
            for (int n4 = 0; n4 < n; n4 = (int)((short)(n4 + 1))) {
                if (byArray[n4] != i) continue;
                int n5 = 0;
                int n6 = i - 1;
                while (n6 >= 0) {
                    if ((n3 & 1 << n6) != 0) {
                        ++n5;
                    }
                    if (n6 == 0) break;
                    if (sArray[n5] == 0) {
                        sArray[n5] = n2;
                        n5 = n2;
                        n2 = (short)(n2 + 2);
                        --n6;
                        continue;
                    }
                    n5 = sArray[n5];
                    --n6;
                }
                sArray[n5] = (short)(n4 | 0x8000);
                ++n3;
            }
            n3 <<= 1;
        }
    }

    private int Code(short[] sArray) {
        int n = 0;
        while (n >= 0) {
            if (this.Q == 0) {
                this.P = this.d();
                this.Q = 8;
            }
            n = sArray[n + (this.P & 1)];
            this.P >>>= 1;
            --this.Q;
        }
        return n & 0xFFF;
    }

    private static synchronized boolean j() {
        if (A != 0) {
            g.T();
            g.J(false);
            return true;
        }
        return false;
    }

    final void Code(boolean bl, boolean bl2, Hashtable hashtable) {
        if (this.Code == null) {
            return;
        }
        this.Code(this.Code.Code(), this.Code.J, true, bl2, bl, false, hashtable);
    }

    private boolean C() {
        while (this.K-- > 0) {
            this.I[this.F++] = this.I[this.G++];
            if (this.G == this.E) {
                this.G = 0;
            }
            if (this.H != this.F) continue;
            return true;
        }
        return false;
    }

    private void Code(byte by) {
        this.I[this.F++] = by;
        if (this.F == this.I.length) {
            this.Code(this.I, 0);
            this.F = 0;
        }
        ++this.G;
    }

    private boolean a() {
        int n;
        if (this.K > 0 && this.C()) {
            return true;
        }
        while ((n = this.Code(this.Code)) != 256) {
            if (n > 256) {
                this.K = I[n -= 257];
                if (n > 7 && n != 28) {
                    this.K += this.B(n / 4 - 1);
                }
                n = this.Code(this.I);
                int n2 = Z[n];
                if (n > 3) {
                    n2 += this.B(n / 2 - 1);
                }
                this.G = this.F - n2;
                if (this.G < 0) {
                    this.G = this.E + this.G;
                }
                if (this.C()) {
                    return true;
                }
            } else {
                this.I[this.F++] = (byte)n;
            }
            if (this.H != this.F) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean h() {
        var1_1 = g.Code;
        synchronized (var1_1) {
            block27: {
                block26: {
                    if (!g.aO) {
                        return false;
                    }
                    var2_2 = g.U;
                    g.aO = false;
                    g.aP = true;
                    try {
                        if (g.B >= this.I.length - 1) {
                            g.B = (byte)-1;
                        }
                        var3_4 = this;
                        var4_5 = false;
                        var5_6 = false;
lbl14:
                        // 3 sources

                        while (true) {
                            if (!var4_5) {
                                g.B = (byte)(g.B + 1);
                            }
                            if (g.B < this.I.length) ** GOTO lbl46
                            if (var5_6) {
                                g.K();
                                g.aP = false;
                            }
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    catch (Throwable v0) {
                        try {
                            g.K();
                            return true;
                        }
                        finally {
                            g.aP = false;
                            g.F();
                        }
                    }
                    g.F();
                    return true;
lbl-1000:
                    // 1 sources

                    {
                        var5_7 = g.Z(this.D);
                        if (!this.a.p.equals(var5_7.p) || !this.a.e.equals(var5_7.e) || this.a.K != var5_7.K) break block26;
                        g.K();
                        g.aP = false;
                    }
                    g.F();
                    return true;
                }
                var5_6 = true;
                {
                    block28: {
                        var6_8 = g.Code.elements();
                        while (var6_8.hasMoreElements()) {
                            ((g)((Object[])var6_8.nextElement())[0]).A();
                        }
                        g.B = 0;
lbl46:
                        // 2 sources

                        if (!this.I[g.B].startsWith("socket://") || g.C < 0 && !g.ac && !g.ab && !this.a.e()) break block28;
                        if (g.ac || g.ab) {
                            g.Code((byte)-2, null);
                        }
                        var4_5 = false;
                        ** GOTO lbl14
                    }
                    this.d.A();
                    g.J(false);
                    if (var3_4 == null) {
                        var3_4 = g.Code(this.D, g.B, var5_6);
                    } else {
                        var3_4.I = null;
                        var3_4.c = null;
                        var3_4.I = g.B;
                        g.Code(var3_4);
                    }
                    while (g.aQ && !var3_4.Z && !var3_4.f()) {
                        g.Code(g.Code, 1000);
                    }
                    if (g.aQ && var2_2 == g.U) break block27;
                    g.aP = false;
                }
                g.F();
                return true;
            }
            var4_5 = var3_4.G == 1 && var4_5 == false;
            if (var3_4.G != 2) ** GOTO lbl-1000
            {
                g.c(4);
                g.B = (byte)-1;
                g.J(false);
                g.aP = false;
            }
            g.F();
            return true;
lbl-1000:
            // 1 sources

            {
                if (var3_4.g() && !var4_5 && !this.I[g.B + 1].startsWith("socket://")) {
                    g.Code((byte)-2, null);
                }
                var3_4.Code(false, 0);
                var3_4 = null;
                ** continue;
            }
        }
    }

    private void I(byte[] byArray, int n, int n2) {
        while (this.F != 0 && n2 > 0) {
            this.Code(byArray[n]);
            ++n;
            --n2;
        }
        while (n2 > this.I.length) {
            this.Code(byArray, n);
            n += this.I.length;
            n2 -= this.I.length;
            this.G += this.I.length;
        }
        while (n2 > 0) {
            this.Code(byArray[n]);
            ++n;
            --n2;
        }
    }

    private void Code(byte[] byArray, int n) {
        this.B[this.N++] = (byArray[n] & 0xFF) << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
        if (this.N == 16) {
            this.z();
        }
    }

    private static int B(byte[] byArray, int n) {
        switch (g.C(byArray[n])) {
            case 1: {
                return byArray[n];
            }
            case 2: {
                return (byArray[n] & 0x1F) << 6 | byArray[n + 1] & 0x3F;
            }
            case 3: {
                return (byArray[n] & 0xF) << 12 | (byArray[n + 1] & 0x3F) << 6 | byArray[n + 2] & 0x3F;
            }
        }
        return (byArray[n] & 7) << 18 | (byArray[n + 1] & 0x3F) << 12 | (byArray[n + 2] & 0x3F) << 6 | byArray[n + 3] & 0x3F;
    }

    private void y() {
        this.G = 0;
        this.F = 0;
        int n = this.I.length;
        byte[] byArray = this.I;
        while (n-- > 0) {
            byArray[n] = 0;
        }
        this.N = 0;
        g.Code(this.B, this.B.length);
        this.L = 1779033703;
        this.K = -1150833019;
        this.D = 1013904242;
        this.E = -1521486534;
        this.P = 1359893119;
        this.Q = -1694144372;
        this.O = 528734635;
        this.H = 1541459225;
    }

    private static int I(int n, int n2, int n3) {
        return ((n >>> 6 | n << 26) ^ (n >>> 11 | n << 21) ^ (n >>> 25 | n << 7)) + (n & n2 ^ ~n & n3);
    }

    private static int Z(int n, int n2, int n3) {
        return ((n >>> 2 | n << 30) ^ (n >>> 13 | n << 19) ^ (n >>> 22 | n << 10)) + (n & n2 ^ n & n3 ^ n2 & n3);
    }

    public static int J(byte[] byArray, int n) {
        return ((byArray[n] & 0xFF) << 16) + ((byArray[n + 1] & 0xFF) << 8) + (byArray[n + 2] & 0xFF);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Code() {
        Object object = Code;
        synchronized (object) {
            if (!aP) {
                g.Code((byte)-1, null);
                g.I((byte)-1, null);
                ++U;
                aQ = true;
                g g2 = h;
                if (g2 != null) {
                    g2.Code |= true;
                    try {
                        g2.Code(false, 0);
                    }
                    catch (Throwable throwable) {}
                }
            }
            return;
        }
    }

    static e Code(Object[] object, int[] nArray, int n) {
        object = new e((Object[])object, nArray, n);
        g.I((e)object);
        g.F();
        return object;
    }

    public static int Code(byte[] byArray, int n, char[] cArray, int n2, int n3) {
        while (n3 > 0) {
            int n4 = g.B(byArray, n);
            int n5 = g.C(byArray[n]);
            n3 -= n5;
            n += n5;
            if (n4 <= 65535) {
                cArray[n2++] = (char)n4;
                continue;
            }
            cArray[n2++] = (char)(0xD800 | n4 - 65536 >> 10);
            cArray[n2++] = 0xDC00 | n4 & 0x3FF;
        }
        return n2;
    }

    private int I(String string) {
        int n = string.length();
        String string2 = string;
        g g2 = this;
        int n2 = 0;
        n = Math.min(n, string2.length());
        for (int i = 0; i < n; ++i) {
            n2 += g2.I[g.Code(string2.charAt(i))];
        }
        return n2;
    }

    private void I(byte[] byArray, int n) {
        this.C = new g(byArray, n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void f() {
        Code code = Code.Code;
        synchronized (code) {
            switch (g.b()) {
                case 2: {
                    Code = g.Code("\u0001\u0004\u00020 0\u00171./:_-~%$?=&!+#*@,;\\'()1\u0001**\u0001##");
                    break;
                }
                case 3: {
                    Code = g.Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                    break;
                }
                case 4: {
                    Code = g.Code("\u0001\u0002\u00020 0\u0000#");
                    break;
                }
                case 5: {
                    Code = g.Code("\u0001\u0003\u000100\u0001* \u0000#");
                    break;
                }
                case 6: {
                    Code = g.Code("\u0001\u0002\u00170./:_-~%$?=&!+#*@,;\\'()0\u0001# ");
                    break;
                }
                case 7: {
                    Code = g.Code("\u0001\u0003\u00170./:_-~%$?=&!+#*@,;\\'()0\u00021 1\u0000#");
                    break;
                }
                case 8: {
                    Code = g.Code("\u0001\u0002\u000100\u0001# ");
                    break;
                }
                case 9: {
                    Code = g.Code("\u0001\u0002\u000100\u0001# ");
                    break;
                }
                case 10: {
                    Code = g.Code("\u0002\u0000");
                    break;
                }
                default: {
                    Code = null;
                }
            }
            return;
        }
    }

    private String Z(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            this.B(0, 1);
            if (this.Z[0] == 13) {
                this.B(0, 1);
            }
            if (this.Z[0] == 10) {
                String string2;
                int n;
                if (stringBuffer.length() == 0) {
                    if (string == null) break;
                    break;
                }
                if (string != null && (n = (string2 = stringBuffer.toString()).indexOf(58)) >= 0 && string2.toLowerCase().startsWith(string)) {
                    return string2.substring(n + 1).trim();
                }
                stringBuffer.setLength(0);
                continue;
            }
            stringBuffer.append((char)this.Z[0]);
        }
        return null;
    }

    private boolean e() {
        return this.Q == 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static g Code(int n, byte by, boolean bl) {
        Object object = Code;
        synchronized (object) {
            if (h == null || g.h.D != n) {
                void var2_2;
                void var1_1;
                g g2 = h;
                h = new g(n, (byte)var1_1, (boolean)var2_2);
                if (g2 != null) {
                    g2.Code(false, 0);
                }
                g.Code(h);
            } else {
                g.Code(Code);
            }
            return h;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void Code(Object object, int n) {
        Object object2 = object;
        synchronized (object2) {
            try {
                void var1_1;
                object.wait((long)var1_1);
            }
            catch (InterruptedException interruptedException) {}
            return;
        }
    }

    static void a() {
        if (P) {
            f.Code();
            return;
        }
        Code.Code.repaint();
    }

    private void M() {
        this.Code.Code.put("s", "1");
        this.Code(this.Code.Code, this.Code.Code, this.Code.Code(), this.Code.I);
    }

    private void E() {
        if (this.I[this.I].indexOf("10.0.0.172") != -1) {
            aM = true;
            return;
        }
        aM = false;
    }

    private boolean g() {
        return this.I[this.I].startsWith("socket://");
    }

    private void C(int n) {
        int n2;
        if (this.Code != null && this.Code.Code != null && this.Code.Code == n) {
            return;
        }
        for (n2 = 0; n2 < this.K; ++n2) {
            if (n != this.Code[n2].Code || this.Code[n2].Code == null) continue;
            this.Code = this.Code[n2];
            return;
        }
        this.G = (this.G + 1) % this.K;
        this.Code = this.Code[this.G];
        this.Code.Code = new Image[S];
        if (C == null || C.length < this.L * Code) {
            C = new int[this.L * Code];
        }
        this.Code.Code = n;
        this.Code.Code = new int[8];
        for (n2 = 0; n2 < 8; ++n2) {
            this.Code.Code[n2] = this.B[n2] << 24 | n & 0xFFFFFF;
        }
    }

    private static int[] Code(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[nArray2.length];
        int[] nArray4 = new int[nArray2.length << 1];
        g.Code(nArray4, nArray, nArray);
        g.Code(nArray4, nArray2);
        System.arraycopy(nArray4, nArray4.length - nArray3.length, nArray3, 0, nArray3.length);
        g.Code(nArray4, nArray4.length);
        g.Code(nArray4, nArray3, nArray);
        g.Code(nArray4, nArray2);
        System.arraycopy(nArray4, nArray4.length - nArray3.length, nArray3, 0, nArray3.length);
        return nArray3;
    }

    private static int[] Code(int[] nArray, int[] nArray2, int[] nArray3) {
        for (int i = nArray3.length - 1; i >= 0; --i) {
            long l = (long)nArray3[i] & 0xFFFFFFFFL;
            long l2 = 0L;
            for (int j = nArray2.length - 1; j >= 0; --j) {
                nArray[i + j + 1] = (int)(l2 += l * ((long)nArray2[j] & 0xFFFFFFFFL) + ((long)nArray[i + j + 1] & 0xFFFFFFFFL));
                l2 >>>= 32;
            }
            nArray[i] = (int)l2;
        }
        return nArray;
    }

    g(B b, String string) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.Code = b;
        this.o = string;
    }

    private g(int[] nArray) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.J = new g(0);
        this.I = new byte[0];
        this.Z = new byte[8];
        this.B = new byte[32];
        this.B = nArray;
    }

    private g(byte[] byArray, int n) {
        this.aJ = true;
        this.aI = true;
        this.d = true;
        this.B = new g('\u0000');
        this.I = new byte[64];
        this.B = new byte[64];
        this.J = new byte[32];
        System.arraycopy(byArray, n, this.I, 0, 32);
        System.arraycopy(byArray, n, this.B, 0, 32);
        int n2 = 0;
        while (n2 < 64) {
            int n3 = n2;
            this.B[n3] = (byte)(this.B[n3] ^ 0x36);
            int n4 = n2++;
            this.I[n4] = (byte)(this.I[n4] ^ 0x5C);
        }
        this.B.I(this.B, 0, 64);
    }

    private synchronized void A() {
        this.b = null;
        this.a = null;
        this.J = null;
        System.arraycopy(this.B, 0, this.Z, 0, 8);
    }

    private void a(int n) {
        this.B.B(n);
    }

    private synchronized int Code(g g2) {
        if (this.J == null) {
            return -1;
        }
        byte[] byArray = g2.Z;
        g2.Z[0] = (byte)(this.G >> 16);
        byArray[1] = (byte)this.G;
        this.J.Z(byArray, 2);
        this.J.J(byArray, 0);
        g2.C = new g(byArray, 0);
        g2.C.Z(this.Z, 0, 8);
        this.J.J(byArray, 0);
        g2.e = new g(byArray, 0);
        g2.e.Z(this.Z, 0, 8);
        this.J.J(byArray, 0);
        g2.f = new g(byArray);
        g2.f.C(byArray, 0, 1024);
        this.J.J(byArray, 0);
        g2.g = new g(byArray);
        g2.g.C(byArray, 0, 1024);
        return this.G++;
    }

    private synchronized void D() {
        int n;
        byte[] byArray;
        if (this.b() || this.b == null) {
            this.A();
            return;
        }
        if (this.a != null) {
            g g2 = new g('\u0000');
            byArray = g.Code(g.Code(this.a, this.B));
            if (byArray[0] != 0 || byArray[1] != 1 || byArray[byArray.length - 32 - 1] != 0) {
                this.A();
                return;
            }
            for (n = 2; n < byArray.length - 32 - 2; ++n) {
                if (byArray[n] == -1) continue;
                this.A();
                return;
            }
            g2.B((int)(this.a >> 32));
            g2.B((int)this.a);
            g2.I(g.Code(this.b), 0, this.b.length << 2);
            g2.Code(byArray);
            for (int i = 0; i < 32; ++i) {
                if (byArray[i] == byArray[i + byArray.length - 32]) continue;
                this.A();
                return;
            }
            this.a = null;
            if (Code[1] != null) {
                g.J(false);
            }
        }
        if (this.J == null) {
            g g3 = g.Code(this.B);
            byArray = new byte[this.b.length << 2];
            for (n = 2; n < byArray.length - 32; ++n) {
                while (byArray[n] == 0) {
                    g3.J(byArray, n);
                }
            }
            byArray[0] = 0;
            byArray[1] = 2;
            byArray[byArray.length - 32 - 1] = 0;
            g3.J(byArray, byArray.length - 32);
            this.J.I(byArray, byArray.length - 32);
            g3.I(byArray, byArray.length - 32);
            this.J = g.Code(g.Code(g.Code(byArray, 0, byArray.length), this.b));
            this.G = 0;
        }
    }

    private void Z(byte[] byArray, int n, int n2) {
        this.B.I(byArray, n, n2);
    }

    private void J(byte[] byArray, int n, int n2) {
        this.B.Code(this.J);
        this.B.I(this.I, 0, 64);
        this.B.I(this.J, 0, 32);
        this.B.Code(this.J);
        System.arraycopy(this.J, 0, byArray, n, n2);
        this.B.I(this.B, 0, 64);
    }

    public final g Code() {
        return this.a;
    }

    public static String Code(byte[] byArray, int n) {
        int n2 = g.I(byArray, n);
        return g.Code(byArray, n += 2, n + n2);
    }

    private static String Code(byte[] byArray, int n, int n2) {
        StringBuffer stringBuffer = new StringBuffer(n2 - n);
        while (n < n2) {
            int n3 = g.B(byArray, n);
            if (n3 <= 65535) {
                stringBuffer.append((char)n3);
            } else {
                stringBuffer.append((char)(0xD800 | n3 - 65536 >> 10));
                stringBuffer.append((char)(0xDC00 | n3 & 0x3FF));
            }
            n += g.C(byArray[n]);
        }
        return stringBuffer.toString();
    }

    public static int Code(byte[] byArray, int n) {
        return (byArray[n] << 8) + (byArray[n + 1] & 0xFF);
    }

    public static int I(byte[] byArray, int n) {
        return ((byArray[n] & 0xFF) << 8) + (byArray[n + 1] & 0xFF);
    }

    public static int Z(byte[] byArray, int n) {
        return (byArray[n] << 24) + ((byArray[n + 1] & 0xFF) << 16) + ((byArray[n + 2] & 0xFF) << 8) + (byArray[n + 3] & 0xFF);
    }

    private void Z(byte[] byArray, int n) {
        for (int i = n; i < 64; ++i) {
            this.I[i] = 0;
        }
        System.arraycopy(byArray, 0, this.I, 0, Math.min(64, n));
        this.C.Z(this.I, 0, 64);
        this.C.J(this.B, 0, 32);
    }

    private void J(byte[] byArray, int n) {
        this.C.Z(this.B, 0, 32);
        this.C.Z(this.I, 0, 64);
        this.C.J(byArray, n, 32);
        this.C.Z(this.B, 0, 32);
        this.C.J(this.B, 0, 32);
    }

    private static int Code(Hashtable hashtable) {
        if (hashtable == null) {
            return 0;
        }
        int n = 7;
        Enumeration enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            Object[] objectArray = (Object[])hashtable.get(string);
            n = n + (2 + g.Z(string)) + (2 + g.Z((String)objectArray[0])) + (4 + (Integer)objectArray[1]);
        }
        return n;
    }

    private static int I(String string, String string2) {
        if (string == null || string.indexOf(47) == -1 || string2.indexOf(47) == -1) {
            return 0;
        }
        return string.substring(string.indexOf(47)).compareTo(string2.substring(string2.indexOf(47)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Code(boolean bl) {
        Object object = Code;
        synchronized (object) {
            if (ac != bl) {
                ac = bl;
                g.Code();
            }
            return;
        }
    }

    static void Code(int n, String string, boolean bl) {
        if (Code[n] == null || !Code[n].equals(string)) {
            g.Code[n] = string;
            if (n == 1 && bl) {
                g.J(false);
            }
        }
    }

    private static void Code(DataOutputStream dataOutputStream, int[] nArray) {
        if (nArray != null) {
            dataOutputStream.writeShort(nArray.length);
            ((OutputStream)dataOutputStream).write(g.Code(nArray));
            return;
        }
        dataOutputStream.writeShort(0);
    }

    private static InputStream Code(String string) {
        return Runtime.getRuntime().getClass().getResourceAsStream(string);
    }

    private static void Code(byte[] byArray, int n, int n2, int n3, int n4) {
        byArray[n + 4] = (byte)(n4 + 2 >> 8);
        byArray[n + 4 + 1] = (byte)(n4 + 2);
        byArray[n + 4 + 2] = (byte)n2;
        byArray[n + 4 + 3] = (byte)n3;
    }

    private void O() {
        B b = this.Code();
        if (b != null && b.C != 5 && !b.Code()) {
            b.B();
        }
    }

    final void B() {
        if (!this.Code(16)) {
            this.Code.g();
        }
    }

    private boolean c() {
        return (this.L & 1) != 0;
    }

    public final String Code() {
        return this.p + this.e.substring(0, 8);
    }

    public static boolean Code() {
        return aM;
    }

    private String Z() {
        return "http://" + this.a.o + ":" + this.a.K + "/";
    }

    public static void Code(int n) {
        if (n != T) {
            g.c(0);
            T = n;
            aN = true;
        }
    }

    private String J() {
        return (String)this.Z[1];
    }

    private static void K() {
        g.c(0);
        g.Code((byte)-2, null);
        g.I((byte)-2, null);
        B = (byte)-1;
        g.J(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(int n) {
        Object object = Code;
        synchronized (object) {
            while (Code != null) {
                Code.I(n);
                Code = Code.Code();
            }
            return;
        }
    }

    private static boolean I(String string, String string2) {
        return g.I(string, string2) != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private e Code() {
        Object object = Code;
        synchronized (object) {
            do {
                block8: {
                    block9: {
                        block7: {
                            if (Code != null && this.D == Code.Code()) break block7;
                            if (!this.J) break block8;
                            break block9;
                        }
                        if (this.Z) {
                            g.F();
                            return null;
                        }
                        e e2 = Code;
                        Code = e2.Code();
                        int n = 1;
                        while (true) {
                            if (this.Code(n) == null) {
                                this.Code.addElement(e2);
                                e2.Code(this, n);
                                g.F();
                                return e2;
                            }
                            ++n;
                        }
                    }
                    for (int i = 0; i < this.Code.size(); ++i) {
                        e e3 = (e)this.Code.elementAt(i);
                        if (e3.B() == 0) continue;
                        return e3;
                    }
                }
                this.J = false;
                g.Code(Code, 0);
            } while (!this.Z);
            g.F();
            return null;
        }
    }

    private static void I(e e2) {
        Object object = Code;
        synchronized (object) {
            e2.Code(Code);
            Code = e2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void F() {
        Object object = Code;
        synchronized (object) {
            if (aP) {
                return;
            }
            if (aN) {
                aN = false;
                g.Code();
            }
            if (Code == null) {
                return;
            }
            int n = Code.Code();
            g g2 = g.I(n);
            if (C == -2 && a == -2) {
                g.Code((byte)-1, null);
                g.I((byte)-1, null);
            }
            if (g2.e() && a == -2) {
                g.I((byte)-1, null);
            }
            if ((g2.e() && a == -1 || !g2.e() && (C == -1 || C == -2 && a == -1)) && !aO) {
                ++U;
                B = (byte)-1;
                aQ = true;
                aO = true;
            }
            g.Code(n, (aQ << 1) + -1, false);
            return;
        }
    }

    static String I() {
        if (B) {
            return (aT ? "*" : "") + V + ":" + g;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean J(int n) {
        Object object = Code;
        synchronized (object) {
            if (h == this) {
                h = null;
            }
            boolean bl = aQ || this.Code;
            int n2 = 0;
            while (n2 < this.Code.size()) {
                e e2 = (e)this.Code.elementAt(n2);
                if (!(e2.Z() || e2.Code() || !bl && e2.I())) {
                    if (!bl) {
                        e2.Z();
                    }
                    e2.Code();
                    g.I(e2);
                    ++n2;
                    continue;
                }
                e2.I(n);
                ++n2;
            }
            this.Code.removeAllElements();
            if (!this.Z) {
                this.Z = true;
                this.Code = null;
                this.Code = null;
                g.F();
                g.Code(Code);
                return true;
            }
            return false;
        }
    }

    final void d() {
        if (this.Code == null || this.aX) {
            return;
        }
        g.Code(this.Code.getGraphics(), 0, 0, this.Code.getWidth(), this.Code.getHeight(), -2130706432, false);
        this.aX = true;
    }

    final void e() {
        if (this.aX) {
            this.aS = true;
            this.aX = false;
        }
    }

    static void Code(e e2, boolean bl) {
        Object object = Code;
        synchronized (object) {
            if (!e2.Z()) {
                e2.I(0);
                g g2 = e2.Code();
                if (g2 != null) {
                    if (g2.g()) {
                        g2.J = true;
                        e2.Z(bl + 6);
                        g.Code(Code);
                    }
                } else if (Code != null) {
                    Code = Code.Code(e2);
                }
            }
            return;
        }
    }

    final void c() {
        if (this.aW) {
            this.aS = true;
            this.aW = false;
        }
    }

    private void P() {
        if (this.aX) {
            this.aX = false;
            this.d();
            return;
        }
        if (this.aW) {
            this.aW = false;
            this.b();
        }
    }

    final void b() {
        if (this.Code == null || this.aW) {
            return;
        }
        g.Code(this.Code.getGraphics(), 0, 0, this.Code.getWidth(), this.Code.getHeight(), 0x21000000, false);
        this.aW = true;
    }

    private synchronized void b(int n) {
        this.Z(this.Code(n));
    }

    private synchronized void Z(e e2) {
        if (e2 != null) {
            this.Code.removeElement(e2);
        }
    }

    private static char[][] Code(String string) {
        Object object;
        switch (string.charAt(0)) {
            case '\u0001': {
                object = g.Code("\u0000\f\u00020+0\u00171./:_-~%$?=&!+#*@,;\\'()1\u00042abc2\u00043def3\u00044ghi4\u00045jkl5\u00046mno6\u00057pqrs7\u00048tuv8\u00059wxyz9\u0000*\u0003# *#");
                break;
            }
            case '\u0002': {
                object = new char[1][1];
                object[0][0] = '\u0001';
                break;
            }
            case '\u0003': {
                char[][] cArrayArray = new char[25][];
                object = cArrayArray;
                cArrayArray[0] = new char[1];
                object[0][0] = '\u0001';
                String string2 = "QWERTYUIOPASDFGHJKZXCVBN";
                string2 = string2 + string2.toLowerCase();
                for (int i = 1; i <= 24; ++i) {
                    object[i] = new char[3];
                    char c = string2.charAt(2 * (i - 1));
                    object[i][1] = c;
                    object[i][0] = c;
                    object[i][2] = string2.charAt(2 * (i - 1) + 1);
                }
                break;
            }
            default: {
                object = new char[1][1];
            }
        }
        int n = string.charAt(1);
        char[][] cArrayArray = new char[n + ((char[][])object).length][];
        System.arraycopy(object, 0, cArrayArray, 0, ((char[][])object).length);
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            int n3 = string.charAt(n2++) + '\u0001';
            cArrayArray[((char[][])object).length + i] = new char[n3];
            string.getChars(n2, n2 + n3, cArrayArray[((char[][])object).length + i], 0);
            n2 += n3;
        }
        return cArrayArray;
    }

    final boolean Z() {
        return this.Code(24);
    }

    private void C(boolean bl) {
        this.Code(bl, 0);
    }

    private synchronized void d(int n) {
        this.I = System.currentTimeMillis();
        this.Q = n;
    }

    private synchronized void G() {
        this.H();
        this.Q = 0;
    }

    private synchronized void H() {
        if (this.Z) {
            throw new IOException();
        }
        this.a = System.currentTimeMillis();
    }

    private synchronized boolean f() {
        return this.Q > 0 && (this.a >= this.I ? Math.max(this.a, this.Code) + 240000L : (this.g() ? this.I : Math.max(this.I, this.Code)) + (long)this.Q) - System.currentTimeMillis() < 0L;
    }

    private void J(e e2) {
        int n;
        if (e2 == null) {
            return;
        }
        Hashtable hashtable = e2.Code(true);
        if (hashtable == null) {
            return;
        }
        int n2 = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(1);
        I = n = g.Code(hashtable);
        Z = 0;
        J j = new J(4104);
        DataOutputStream dataOutputStream = new DataOutputStream(j);
        g.Code(j, 22, e2.I(), 7);
        dataOutputStream.write(1);
        dataOutputStream.writeShort(9);
        dataOutputStream.writeInt(n - 7);
        this.B(j.Code(), 0, 15);
        this.B(j.Code(), 15);
        j.Code(0);
        InputStream inputStream = null;
        try {
            Enumeration enumeration = hashtable.keys();
            while (enumeration.hasMoreElements()) {
                int n3;
                String string = (String)enumeration.nextElement();
                Object[] objectArray = (Object[])hashtable.get(string);
                int n4 = g.Z(string) + g.Z((String)objectArray[0]) + 8;
                g.Code(j, 22, e2.I(), n4);
                dataOutputStream.writeUTF(string);
                dataOutputStream.writeUTF((String)objectArray[0]);
                int n5 = (Integer)objectArray[1];
                dataOutputStream.writeInt(n5);
                this.B(j.Code(), 0, n4 + 8);
                this.B(j.Code(), n4 + 8);
                j.Code(0);
                inputStream = Code.Code.Code((String)objectArray[2]).openInputStream();
                objectArray = j.Code();
                n4 = 0;
                while (!e2.Z() && (n3 = inputStream.read((byte[])objectArray, 8, 4096)) >= 0 && n4 < n5) {
                    n4 += n3;
                    Z += n3;
                    g.Code((byte[])objectArray, 0, 22, e2.I(), n3);
                    this.B((byte[])objectArray, 0, n3 + 8);
                    this.B((byte[])objectArray, n3 + 8);
                }
            }
        }
        catch (Throwable throwable) {
            Z = -1;
            try {
                inputStream.close();
            }
            catch (Throwable throwable2) {}
            Thread.currentThread().setPriority(n2);
            Code.Code.c();
            throw throwable;
        }
        {
            try {
                inputStream.close();
            }
            catch (Throwable throwable) {}
            continue;
        }
        Z = -1;
        try {
            inputStream.close();
        }
        catch (Throwable throwable) {}
        Thread.currentThread().setPriority(n2);
        Code.Code.c();
    }

    final synchronized void Code(e e2) {
        if (this.f()) {
            this.Code(false, 2);
            if (e2.Z()) {
                throw new IOException();
            }
        }
    }

    private void Code(e object, byte[] byArray) {
        String string;
        String string2;
        String string3 = this.I[this.I];
        int n = string3.indexOf(59);
        if (n >= 0) {
            string2 = string3.substring(n);
            string3 = string3.substring(0, n);
        } else {
            string2 = "";
        }
        V = this.D;
        aT = this.C;
        if (this.g()) {
            if (this.Code == null) {
                string3 = (SocketConnection)Connector.open((String)(string3 + string2), (int)3, (boolean)(bj ^ true));
                this.Code = string3;
                if (bl) {
                    string3.setSocketOption((byte)1, 0);
                }
                this.I = this.Code = string3.openDataOutputStream();
                this.I = this.Code = string3.openDataInputStream();
            }
            this.B(byArray, byArray.length);
            this.J((e)object);
            return;
        }
        Object object2 = "";
        if (object != null) {
            object2 = ((e)object).Code();
            string = (String)object2[53];
            object2 = (String)object2[42];
        } else {
            string = "server:test";
        }
        if ((this.a.L & 2) != 0) {
            object2 = g.Z(string, (String)object2);
            if (string != null && (string.startsWith("b:") || string.startsWith("javascript:"))) {
                object2 = g.Z((String)((e)object).Code()[38], null);
            } else if ("".equals(object2)) {
                object2 = string != null ? string : "internal";
            }
            string3 = string3 + (String)object2;
        }
        object2 = (HttpConnection)Connector.open((String)(string3 + string2), (int)3, (boolean)(bj ^ true));
        this.Code = object2;
        object2.setRequestMethod("POST");
        if (string3.startsWith("http://10.0.0.172")) {
            string3 = g.Code(this.Z())[0];
            object2.setRequestProperty("X-Online-Host", string3);
        }
        object2.setRequestProperty("Content-Type", "application/xml");
        this.I = this.Code = object2.openDataOutputStream();
        this.B(byArray, byArray.length);
        this.J((e)object);
        this.Code.close();
        this.Code = null;
        this.I = this.Code = object2.openDataInputStream();
        int n2 = object2.getResponseCode();
        if (n2 == 301 || n2 == 302 || n2 == 303 || n2 == 307) {
            String string4;
            this.G = 1;
            if (object != null && this.a.c() && (string4 = object2.getHeaderField("Location")) != null && string4.length() > 0) {
                if (((e)object).Code(string4)) {
                    this.Z((e)object);
                    g.I((e)object);
                    g.F();
                } else {
                    ((e)object).close();
                }
            }
            this.C(false);
            return;
        }
        if (n2 == 403) {
            this.G = 2;
            try {
                int n3;
                object = new StringBuffer();
                n2 = 0;
                while ((n3 = this.Code.read()) > 32 && ++n2 <= 256) {
                    ((StringBuffer)object).append((char)n3);
                    if (n2 != 4 || ((StringBuffer)object).toString().toLowerCase().equals("http")) continue;
                    ((StringBuffer)object).setLength(0);
                    break;
                }
                f = ((StringBuffer)object).length() > 0 ? ((StringBuffer)object).toString() : null;
            }
            catch (Throwable throwable) {}
            this.Code(false, 4);
            Code.Code.I(g.I(62));
        }
    }

    final void Code(String string, Hashtable hashtable) {
        if (this.Code == null) {
            return;
        }
        this.N();
        this.Code(null, this.Code.J, false, true, hashtable, string);
    }

    final boolean Code(boolean bl) {
        if (this.af != -1 && (bl || System.currentTimeMillis() - this.I >= 1000L)) {
            this.Code.insert(this.ag, (char)this.af);
            ++this.ag;
            this.af = -1;
            return true;
        }
        return false;
    }

    static String Code(long l) {
        if (l < 1024L) {
            return l + "B";
        }
        return (l /= 1024L) + "kB";
    }

    final void I(boolean bl) {
        if (this.F == 16) {
            this.D = Code.Code(this.D, 0, -this.aw, this.ab);
            return;
        }
        if (this.Code != null) {
            this.Code.J(bl);
        }
        this.N -= this.W;
        this.W = Code.Code(this.W, 0, this.aa, this.ab);
        this.N += this.W;
    }

    private void B(byte[] byArray, int n) {
        this.Code.write(byArray, 0, n);
        B += (long)n;
        C += (long)n;
        if (this.g()) {
            this.Code.flush();
        }
        this.Code = System.currentTimeMillis();
    }

    private void B(int n, int n2) {
        this.Code.readFully(this.Z, n, n2);
        B += (long)n2;
        C += (long)n2;
    }

    private static void Code(byte by, String string) {
        C = by;
        q = string;
    }

    private static void I(byte by, String string) {
        a = by;
        r = string;
    }

    private void a(boolean bl) {
        block16: while (true) {
            this.B(0, 6);
            this.g.C(this.Z, 0, 6);
            int n = g.I(this.Z, 4);
            if (n > 1014) {
                throw new IOException();
            }
            this.B(6, n);
            this.a = System.currentTimeMillis();
            this.g.C(this.Z, 6, n);
            this.e.a(this.L++);
            this.e.Z(this.Z, 4, n + 2);
            this.e.J(this.Z, 1020, 4);
            if (this.Z[1020] != this.Z[0] || this.Z[1021] != this.Z[1] || this.Z[1022] != this.Z[2] || this.Z[1023] != this.Z[3]) {
                throw new IOException();
            }
            byte by = this.Z[6];
            byte by2 = this.Z[7];
            n -= 2;
            switch (by) {
                default: {
                    continue block16;
                }
                case 11: {
                    this.b.Z = this;
                    this.b.Code(this.Z, 8, n);
                    if (bl) {
                        return;
                    }
                }
                case 6: 
                case 10: {
                    e e2 = this.Code((int)by2);
                    int n2 = 8;
                    int n3 = 0;
                    block17: do {
                        if (e2 == null) {
                            if (by != 11) continue block16;
                            while (true) {
                                if (this.b.Code(null, 0, 1024) <= 0) continue block16;
                            }
                        }
                        while (e2.Code() == null) {
                            if (e2.Z()) {
                                e2 = null;
                                continue block17;
                            }
                            g.Code((Object)e2, 1000);
                        }
                        int n4 = Math.min(e2.J(), n);
                        switch (by) {
                            case 10: {
                                System.arraycopy(this.Z, n2, e2.Code(), e2.Z(), n4);
                                int n5 = n4 - n;
                                n3 = (n5 | -n5) >>> 31 ^ 1;
                                e2.J(n4);
                                break;
                            }
                            case 11: {
                                n4 = this.b.Code(e2.Code(), e2.Z(), e2.J());
                                n3 = (n4 | -n4) >>> 31 ^ 1;
                                e2.J(this.b.L);
                                break;
                            }
                            case 6: {
                                e2.J();
                                g.Code(e2, true);
                                g g2 = this;
                                if (!g2.aR || g2.g()) continue block16;
                                g2.c = g2.b;
                                continue block16;
                            }
                        }
                        e2.Code(n4);
                        n2 += n4;
                        n -= n4;
                    } while (n3 == 0);
                    continue block16;
                }
                case 7: {
                    this.b(by2);
                    continue block16;
                }
                case 9: {
                    this.K = Math.max(this.K - 1, 0);
                    e e3 = this.Code((int)by2);
                    if (e3 != null) {
                        e3.I();
                    }
                    g.B(false);
                    continue block16;
                }
                case 4: {
                    this.C(true);
                    continue block16;
                }
                case 15: {
                    if (!this.aR) continue block16;
                    if (this.I != null) {
                        System.arraycopy(this.Z, 8, this.I, 0, 8);
                        this.Code = true;
                        this.C(true);
                        return;
                    }
                    this.I = new byte[8];
                    System.arraycopy(this.Z, 8, this.I, 0, 8);
                    continue block16;
                }
                case 17: {
                    this.b = new g(0);
                    continue block16;
                }
                case 20: {
                    String string = g.Code(this.Z, 8, n + 8);
                    g.Code(new g(string));
                    continue block16;
                }
                case 5: 
            }
            n = this.Z[8];
            e e4 = new e();
            this.Code.addElement(e4);
            e4.Code(this, by2);
            if (n == 1) {
                f f2 = new f(30);
                new f(30).Code = e4;
                g.Code(f2);
                continue;
            }
            e4.close();
        }
    }

    final boolean I() {
        return this.aR;
    }

    final void Code(C c) {
        this.Code = c;
    }

    final C Code() {
        return this.Code;
    }

    final boolean Code(int n) {
        return (n & this.F) != 0;
    }

    final g I() {
        return this.Code;
    }

    final int I() {
        return this.G;
    }

    final int Code() {
        return this.L;
    }

    final int Z() {
        return this.P;
    }

    final int J() {
        return this.G;
    }

    final void Code(boolean bl, String string, String string2) {
        f f2 = new f(38);
        new f(38).Code = this;
        f2.Z = string2;
        f2.B = string;
        string = g.I(60);
        f2.J = bl ? "overlay:" + string : string;
        g.Code(f2);
    }

    private int f() {
        return Math.max(this.L * this.L / Math.max(this.Code.b(), this.L), 5);
    }

    private void N() {
        this.O();
        if (this.Code != null) {
            this.Code.i();
        }
    }

    private void Code(Object[] objectArray, String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, Hashtable hashtable) {
        this.N();
        B b = B.Code(objectArray);
        if (bl || b == null) {
            this.Code(objectArray, string, bl2, bl3, hashtable, null);
            return;
        }
        b.Code(objectArray);
        this.Code(b, bl4);
        this.Code(b);
    }

    final void Z() {
        this.Code(false, false, null);
    }

    final void Code(int n, int n2, String object) {
        this.Code.Code();
        Object[] objectArray = this.Code.I();
        int n3 = ((String)objectArray[0]).indexOf(35);
        if (n3 >= 0) {
            objectArray[0] = ((String)objectArray[0]).substring(0, n3);
        }
        objectArray[0] = objectArray[0] + "#" + (String)object;
        int[] nArray = (int[])objectArray[7];
        object = nArray;
        nArray[2] = nArray[2] + (n - object[0]);
        Object object2 = object;
        object2[3] = object2[3] + (n2 - object[1]);
        object[0] = n;
        object[1] = n2;
        this.Code(objectArray, null, false, false, false, false, null);
    }

    static int Code(int n, char[] cArray, int n2, int n3) {
        if ((n = g.Code(n)) >= 6) {
            int n4;
            g g2 = g.Code(n);
            n = n3;
            char[] cArray2 = cArray;
            g g3 = g2;
            int n5 = 0;
            n = n4 + n;
            for (n4 = n2; n4 < n; ++n4) {
                n5 += g3.I[g.Code(cArray2[n4])];
            }
            return n5;
        }
        if (!bq) {
            return Code[n].charsWidth(cArray, n2, n3);
        }
        return g.Z(n, cArray, n2, n3);
    }

    private static int[] Code(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        return new int[]{n, n2, n3, n4, n5, n6, n7, n8, n9, n10};
    }

    static boolean Code(Object[] objectArray, int n) {
        return (g.Code(objectArray, 3) & n) != 0;
    }

    final void J() {
        this.Code = new Vector(30);
        this.H = -1;
        this.E = -1;
    }

    private static void I(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(Code[20]);
        graphics.drawLine(n, n3, n2, n3);
        int n5 = n3 + n4;
        graphics.drawLine(n, n5, n2, n5);
        graphics.drawLine(n + 1, n5 += n4, n2 - 1, n5);
        graphics.drawLine(n + 2, n5 += n4, n2 - 2, n5);
        graphics.drawLine(n + 4, n5 += n4, n2 - 4, n5);
        graphics.setColor(Code[3]);
        graphics.drawLine(n + 1, n3, n2 - 1, n3);
        graphics.drawLine(n + 1, n3 += n4, n2 - 1, n3);
        graphics.drawLine(n + 2, n3 += n4, n2 - 2, n3);
        int n6 = n3 + n4;
        graphics.drawLine(n + 4, n6, n2 - 4, n6);
    }

    final int C() {
        return g.Code(this.Code.f(), 0, this.L - 1);
    }

    private void Code(Vector vector, int n) {
        int n2;
        int n3 = n2 = this.B();
        Vector vector2 = vector;
        if (vector2 == J) {
            Object[] objectArray = (Object[])J.elementAt(n3);
            if (g.Code(objectArray, 5) != 97) {
                objectArray[5] = new Integer(77);
                int n4 = g.Code(objectArray, 6);
                objectArray[6] = new Integer(n4 | 2);
            }
            g.Code(vector2, n3, n3 + n);
            if (Code.Code == null) {
                if (Code.Code != Code.I) {
                    f.I();
                }
            } else {
                Code.Code.Code = System.currentTimeMillis() + 10000L;
            }
        } else {
            g.Code(vector2, n3, n3 + n);
        }
        this.Code(n > 0 ? 6 : 1, 0);
        this.Code = true;
        this.Code(true, false, null);
    }

    final int a() {
        return g.Code(this.Code.g(), 0, this.G - 1);
    }

    private void Code(B runnable, boolean bl) {
        Object[] objectArray;
        boolean bl2 = true;
        if (runnable == null) {
            return;
        }
        if (this.Code != runnable) {
            if (this.Code != null) {
                boolean bl3;
                Runnable runnable2;
                this.Code.Code();
                if (this.Code != null) {
                    objectArray = this.Code.getGraphics();
                    this.X = 0;
                    this.Y = 0;
                    g.Code((Graphics)objectArray, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 0xFFFFFF);
                    if (!P) {
                        this.Code.Z((Graphics)objectArray, -this.Code.d(), -this.Code.e());
                    }
                    if (this.Code) {
                        this.aS = true;
                        this.Code = false;
                    } else {
                        f.I = true;
                        if (g.B()) {
                            g g2 = this;
                            g2.W = this.H < this.E || this.E >= 0 && this.Code.B ? this.Code.getWidth() : -this.Code.getWidth();
                        } else {
                            g g3 = this;
                            g3.W = this.H < this.E || this.E >= 0 && this.Code.B ? -this.Code.getWidth() : this.Code.getWidth();
                        }
                        this.aa = this.W;
                        this.ab = (int)System.currentTimeMillis();
                    }
                }
                if (!m) {
                    Code.Code.I(false);
                }
                this.I(0);
                if (!aw) {
                    runnable2 = runnable;
                    bl3 = false;
                } else if (((B)runnable).c && !bl && aw && !((B)runnable).Code) {
                    runnable2 = runnable;
                    bl3 = true;
                } else if (((B)runnable).Code) {
                    runnable2 = runnable;
                    bl3 = ((B)runnable).Code != null && ((B)runnable).Code[4] == 1;
                } else {
                    runnable2 = runnable;
                    bl3 = ((B)runnable).I();
                }
                ((B)runnable2).I(bl3);
                ((B)runnable).f();
                this.N = ((B)runnable).d();
                this.M = ((B)runnable).e();
            } else if (!bl) {
                ((B)runnable).I(true);
            }
            ((B)runnable).f();
            if (bl && this.Code != null && g.Code(this.Code.Code) == 73) {
                bl2 = false;
            }
            this.Code = runnable;
            this.Code.J();
            f.J();
            Code.f();
        }
        if (bl2) {
            runnable = this;
            Object[] objectArray2 = ((g)runnable).Code.Code();
            Code.Code(objectArray2);
            if (!((g)runnable).Code.B) {
                if (!((g)runnable).Code.Code()) {
                    Object[] objectArray3 = g.Code();
                    Code = objectArray3;
                    objectArray3[1] = ((g)runnable).Code.I;
                    g.Code[0] = ((g)runnable).Code.Code;
                    g.Code[2] = ((g)runnable).Code.Code;
                }
                if (((g)runnable).H == ((g)runnable).E) {
                    bl2 = false;
                    if (((g)runnable).E >= 0) {
                        objectArray = (Object[])((g)runnable).Code.elementAt(((g)runnable).E);
                        if (((g)runnable).Code.Code() && objectArray != null && objectArray2 != null && objectArray.length > 0 && objectArray2.length > 0 && objectArray2[0] != null && objectArray2[0].equals(objectArray[0])) {
                            bl2 = true;
                        }
                    }
                    if (!((g)runnable).Code.Code && !bl2 && ((g)runnable).Code.c) {
                        ++((g)runnable).E;
                        ((g)runnable).Code.setSize(((g)runnable).E + 1);
                    }
                    if (((g)runnable).E > 30) {
                        ((g)runnable).Code.removeElementAt(0);
                        --((g)runnable).E;
                    }
                    ((g)runnable).H = ((g)runnable).E;
                }
                ((g)runnable).E = ((g)runnable).H;
                ((g)runnable).Code.setElementAt(objectArray2, ((g)runnable).E);
            }
            for (int i = 0; i < ((g)runnable).Code.size(); ++i) {
            }
            for (int i = 0; i < Code.I.size(); ++i) {
            }
        }
        if (this.Code != null) {
            this.Code.I();
        }
    }

    final void Z(int n, int n2) {
        if (this.Code(16)) {
            if (n2 - this.K < this.at && this.ai < this.at) {
                int n3;
                if (this.aR || this.e.size() == 0) {
                    this.aR = false;
                    this.Z(true);
                    this.g();
                } else if (this.ac >= 0 && this.ac < this.e.size() - 2) {
                    this.Code = new StringBuffer((String)this.e.elementAt(this.ac));
                    this.Z(true);
                    this.g();
                }
                n2 = this.O + 4 + this.ar + this.ah;
                for (n3 = 0; n3 < this.Code.length && g.Code(0, this.Code, 0, n3) + g.Code(0, this.Code[n3], true) / 2 + n2 < n; ++n3) {
                }
                this.ag = n3;
                this.ac = -1;
                this.g();
                g.a();
                return;
            }
            if (!this.aU) {
                n = (this.ai - this.at) / this.av;
                if (n == (n2 = (n2 - this.K - this.at) / this.av) && n2 >= 0 && n2 < this.ao) {
                    if (this.ac == n2 + this.ad) {
                        this.a(-5, 0);
                    } else {
                        this.ac = n2 + this.ad;
                        this.g();
                    }
                }
                g.a();
                return;
            }
        } else {
            this.Code.Z(n - this.O, n2 - this.K);
        }
    }

    final void J(int n, int n2) {
        this.J = -1;
        boolean bl = this.Code(16);
        n -= this.O;
        n2 -= this.K;
        if (bl) {
            if (n2 > this.at && Math.abs(n2 - this.ai) > 6) {
                this.aU = true;
                this.ad = g.Code(this.aj - 2 * (n2 - this.ai) / this.av, 0, this.e.size() - this.ao);
            }
            g.a();
            return;
        }
        this.Code.J(n, n2);
    }

    final int[][] Code(int n) {
        return (int[][])this.Code.elementAt(n);
    }

    final void I(int n, int n2) {
        boolean bl = this.Code(16);
        this.aU = false;
        if (this.Code == null && !bl) {
            return;
        }
        n -= this.O;
        n2 -= this.K;
        if (bl) {
            if (this.af != -1 && this.Code(true)) {
                this.Z(true);
                this.g();
                return;
            }
            this.ai = n2;
            this.aj = this.ad;
            return;
        }
        if (n < this.L && n2 < this.G) {
            this.Code.I(n, n2);
        }
    }

    private void J(Graphics graphics) {
        g g2;
        int n;
        int n2;
        if (this.Code == null) {
            return;
        }
        int n3 = this.i();
        int n4 = this.K + 4 - this.Code.e();
        int n5 = this.Code.c() - 8;
        g.Code(graphics, this.O, n4, this.Q, n5, Code[3]);
        if (n3 == 0 || !L) {
            int n6;
            Graphics graphics2;
            if (n4 > 0) {
                graphics2 = graphics;
                g g3 = this;
                if (q) {
                    n6 = g3.O;
                    n2 = n4 - 4 - 6;
                    n = g3.O + g3.Q - 4;
                    if (n3 == 0) {
                        n6 += 4;
                        graphics2.drawImage(Code.Z, g3.O - 6, n2, 0);
                    }
                    for (int i = n6; i < n; ++i) {
                        graphics2.drawImage(Code.J, i, n2, 0);
                    }
                    graphics2.drawImage(Code.B, n, n2, 0);
                } else {
                    g.I(graphics2, g3.O, g3.O + g3.Q - 1, g3.K + 3, -1);
                    if (n3 != 0) {
                        g.Code(graphics2, g3.O, g3.K, 4, 4, Code[3]);
                        graphics2.setColor(Code[20]);
                        graphics2.drawLine(g3.O, g3.K - 1, g3.O + 3, g3.K - 1);
                    }
                }
            }
            graphics2 = graphics;
            g2 = this;
            if (q) {
                for (n6 = n4; n6 < n4 + n5; ++n6) {
                    graphics2.drawImage(Code.a, g2.O + g2.Q, n6, 0);
                }
            } else {
                graphics2.setColor(Code[20]);
                graphics2.drawLine(g2.O + g2.Q, n4, g2.O + g2.Q, n4 + n5 - 1);
            }
        }
        if (n3 == 0 || L) {
            int n7 = n4 + n5;
            g2 = graphics;
            g g4 = this;
            if (q) {
                n2 = g4.O + 4;
                n = g4.O + g4.Q;
                if (n3 == 0) {
                    g2.drawImage(Code.b, n -= 4, n7, 0);
                }
                for (n3 = n2; n3 < n; ++n3) {
                    g2.drawImage(Code.c, n3, n7, 0);
                }
                g2.drawImage(Code.d, g4.O - 6, n7, 0);
            } else {
                g.I((Graphics)g2, g4.O, g4.O + g4.Q - 1, n7, 1);
                if (n3 != 0) {
                    g.Code((Graphics)g2, g4.O + g4.Q - 4, n7, 4, 4, Code[3]);
                    g2.setColor(Code[20]);
                    g2.drawLine(g4.O + g4.Q - 4, n7 + 4, g4.O + g4.Q + 1, n7 + 4);
                }
            }
            g g5 = this;
            if (q) {
                for (n7 = n4; n7 < n4 + n5; ++n7) {
                    graphics.drawImage(Code.C, g5.O - 6, n7, 0);
                }
                return;
            }
            graphics.setColor(Code[20]);
            graphics.drawLine(g5.O - 1, n4, g5.O - 1, n7 - 1);
        }
    }

    private int Code(boolean bl) {
        if (bl) {
            int n = this.at + 1;
            if (this.ad < 0) {
                return n;
            }
            return n + (this.ap - this.I(true)) * this.ad / (this.e.size() - this.ao);
        }
        return this.M * (this.G - this.I(false)) / Math.max(Math.max(this.Code.c(), this.G) - this.G, 1);
    }

    private void B(Graphics graphics) {
        if (System.currentTimeMillis() > this.Code) {
            return;
        }
        g.Code(graphics, this.O, this.K, this.Q, this.G);
        int n = this.L;
        int n2 = this.G;
        g g2 = this;
        if (g2.Code != null && g2.Code.c() > g2.G) {
            g.Z(graphics, this.O + n - 4, this.K + this.Code(false), 4, this.I(false));
        }
        g g3 = this;
        if (g3.Code != null && g3.Code.b() > g3.L) {
            g3 = this;
            g.Z(graphics, this.O + g3.N * (g3.L - g3.f()) / Math.max(Math.max(g3.Code.b(), g3.L) - g3.L, 1), this.K + n2 - 4, this.f(), 4);
        }
        g.Z(graphics);
    }

    final void g() {
        this.p = this.Code.toString();
        this.Code = new char[this.Code.length()];
        this.Code.getChars(0, this.Code.length(), this.Code, 0);
        this.ag = Math.min(this.ag, this.Code.length());
        this.ak = g.Code(0, this.p);
        this.al = this.af == -1 ? 0 : g.Code(0, (char)this.af, true);
        this.am = g.Code(0, this.Code, 0, this.ag);
        this.at = this.aw + 4;
        this.an = (this.G - this.at - 7) / this.av;
        this.ao = Math.min(this.an, this.e.size());
        this.ap = 2 + this.ao * this.av;
        byte[] byArray = this.ac >= 0 && this.ac < this.e.size() - 1 ? (byte[])this.g.elementAt(this.ac) : null;
        this.I = byArray == null ? this.Z : g.Code(byArray, byArray);
        this.aq = this.Q - 10;
        this.ar = this.aV ? this.Z.getWidth() + 5 : 2;
        this.as = Math.max(g.Code(0, 'M', true), this.aq / 10) + 2;
        this.ah = g.Code(this.ah, -this.am, this.aq - this.ar - this.as - this.am - this.al);
        this.ah = Math.max(this.ah, Math.min(0, this.aq - this.ar - this.as - this.ak));
        this.ad = g.Code(this.ad, this.ac - this.ao + 1, g.Code(this.ac, 0, this.e.size() - this.ao));
    }

    private static void Code(DataInputStream dataInputStream, int n) {
        while (n-- > 0) {
            g.J(dataInputStream.readInt());
        }
    }

    static String I(byte[] byArray, int n) {
        n = Math.min(n, 128);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; ++i) {
            if ((byArray[i] & 0xFF) < 16) {
                stringBuffer.append('0');
            }
            stringBuffer.append(Integer.toString(byArray[i] & 0xFF, 16));
        }
        return stringBuffer.toString();
    }

    private static void Z(Graphics graphics, int n, int n2, int n3, int n4) {
        g.Code(graphics, n + 1, n2, n3 - 2, n4, Code[17]);
        graphics.drawLine(n, n2 + 1, n, n2 + n4 - 2);
        graphics.drawLine(n + n3 - 1, n2 + 1, n + n3 - 1, n2 + n4 - 2);
    }

    static boolean Z(int n) {
        return (n & 1) != 0;
    }

    final void Code(Graphics graphics) {
        if (this.F == 2) {
            this.J(graphics);
        }
        if (this.F == 16) {
            int n;
            String string;
            int n2 = this.K + this.D;
            if (this.Code == null) {
                this.Code = new f(33);
                this.Code.Code = this;
                Code.Code.Code.schedule((TimerTask)this.Code, 100L, 100L);
            }
            if (this.Code.Code != null && g.Code(this.Code.Code.Code) != 65) {
                g.Code(graphics, this.O, n2, this.Q, this.aw + 10, Code[59], Code[60]);
                if (Code.Code.I != null) {
                    g.Code(graphics, this.O, n2, this.Q, this.G);
                    graphics.drawImage(Code.Code.I, this.O, n2 + this.aw + 9, 0);
                    g.Z(graphics);
                }
            } else {
                g.Code(graphics, this.O, n2, this.Q, this.aw + 9, Code[61]);
            }
            g.Code(graphics, this.O + 3, n2 + 5, this.aq + 4, this.aw, Code[16]);
            int n3 = Code[7];
            graphics.setColor(n3);
            graphics.drawLine(this.O + 4, n2 + 5, this.O + 5 + this.aq, n2 + 5);
            graphics.drawLine(this.O + 4, n2 + 4 + this.aw, this.O + 5 + this.aq, n2 + 4 + this.aw);
            graphics.drawLine(this.O + 3, n2 + 5, this.O + 3, n2 + 4 + this.aw);
            graphics.drawLine(this.O + 6 + this.aq, n2 + 5, this.O + 6 + this.aq, n2 + 4 + this.aw);
            graphics.setColor(Code[4]);
            graphics.drawLine(this.O + 4, n2 + 6, this.O + 3 + this.aq + 2, n2 + 6);
            graphics.setColor(Code[5]);
            graphics.drawLine(this.O + 4, n2 + 7, this.O + 3 + this.aq + 2, n2 + 7);
            graphics.setColor(Code[6]);
            graphics.drawLine(this.O + 4, n2 + 8, this.O + 3 + this.aq + 2, n2 + 8);
            n3 = Math.max(0, (this.aw - this.I.getHeight()) / 2 + 1);
            int n4 = (this.Z.getWidth() - this.I.getWidth()) / 2;
            if (this.aV) {
                if (this.I == this.Z) {
                    graphics.drawImage(this.I, this.O + 6, n2 + 5 + n3, 20);
                } else {
                    graphics.drawImage(this.I, this.O + 6 + n4, n2 + 5 + n3, 20);
                }
            }
            if (this.af != -1) {
                graphics.setColor(Code[62]);
                graphics.fillRect(this.O + 3 + this.ar + this.ah + this.am, n2 + 8, this.al + 2, this.au);
                char[] cArray = new char[1];
                char[] cArray2 = cArray;
                cArray[0] = (char)this.af;
                graphics.setColor(-16777216);
                g.Code(graphics, 0, cArray2, 0, 1, this.O + 4 + this.ar + this.ah + this.am, n2 + 8);
                this.ak += this.al;
            } else if (!this.C && !this.aR && this.ac == -1) {
                graphics.setColor(Code[63]);
                graphics.drawLine(this.O + 4 + this.ar + this.ah + this.am, n2 + 8, this.O + 4 + this.ar + this.ah + this.am, n2 + 7 + this.au);
            }
            g.Code(graphics, this.O + 4 + this.ar, n2 + 6, this.aq - this.ar + 2, this.av + 2);
            graphics.setColor(-16777216);
            if (this.al > 0 && this.ag < this.Code.length) {
                g.Code(graphics, 0, this.Code, 0, this.ag, this.O + 4 + this.ar + this.ah, n2 + 8);
                g.Code(graphics, 0, this.Code, this.ag, this.Code.length - this.ag, this.O + 4 + this.ar + this.ah + this.am + this.al, n2 + 8);
            } else {
                if (this.aR) {
                    g.Code(graphics, this.O + 4 + this.ar + this.ah, n2 + 8, this.ak, this.au + 1, Code[64]);
                    graphics.setColor(-16777216);
                }
                g.Code(graphics, 0, this.Code, 0, this.Code.length, this.O + 4 + this.ar + this.ah, n2 + 8);
            }
            if (this.af == -1 && this.ac >= 0 && this.ac < this.e.size() - 2 && (n4 = g.Z(string = (String)this.e.elementAt(this.ac), this.p)) != -1) {
                n = g.Code(0, string.substring(n4 + this.Code.length()));
                g.Code(graphics, this.O + 4 + this.ar + this.ah + this.ak, n2 + 8, n, this.au + 1, Code[64]);
                graphics.setColor(-16777216);
                g.Code(graphics, 0, string.substring(n4 + this.Code.length()), this.O + 4 + this.ar + this.ah + this.ak, n2 + 8, 20);
            }
            g.Z(graphics);
            if (this.e.size() > 0) {
                int n5;
                int n6;
                g.Code(graphics, this.O + 3, n2 + this.at + 1, this.Q - 7, this.ap - 1, Code[16]);
                graphics.setColor(Code[7]);
                graphics.drawRect(this.O + 3, n2 + this.at, this.Q - 7, this.ap);
                if (q) {
                    int n7 = this.O + 3;
                    n4 = n2 + this.at;
                    n = this.O + this.Q - 3;
                    n6 = n4 + this.ap + 1;
                    graphics.drawImage(Code.e, n, n4, 0);
                    for (n5 = n4 + 4; n5 < n6; ++n5) {
                        graphics.drawImage(Code.f, n, n5, 0);
                    }
                    graphics.drawImage(Code.g, n, n6, 0);
                    for (n5 = n7; n5 < n; ++n5) {
                        graphics.drawImage(Code.h, n5, n6, 0);
                    }
                    graphics.drawImage(Code.i, n7 - 4, n6, 0);
                    for (n = n4 + 4; n < n6; ++n) {
                        graphics.drawImage(Code.j, n7 - 4, n, 0);
                    }
                    graphics.drawImage(Code.k, n7 - 4, n4, 0);
                }
                int n8 = this.Q - 8;
                if (this.ao < this.e.size()) {
                    n8 -= 4;
                    g.Z(graphics, this.O + this.L - 4 - 4, n2 + this.Code(true), 3, this.I(true) - 2);
                }
                n4 = Math.min(this.ao, this.e.size());
                n = 0;
                while (n < n4) {
                    String string2;
                    n6 = n2 + this.at + 1 + n * this.av;
                    n5 = n6 + this.av;
                    int n9 = this.O + 4;
                    int n10 = n9 + n8 - 1;
                    if (this.ac == n + this.ad) {
                        graphics.setColor(Code[10]);
                        graphics.drawLine(n9, n6, n10, n6);
                        g.Code(graphics, n9, n6 + 1, n8, this.av - 1, Code[11], Code[12]);
                        graphics.setColor(Code[13]);
                        graphics.drawLine(n9, n5 - 1, n10, n5 - 1);
                        graphics.setColor(Code[14]);
                        graphics.drawLine(n9, n5, n10, n5);
                        n5 = -16777216;
                        if ((Code.Code[36] >> 8 & 0xFF) > 127) {
                            n5 = 0xFFFFFF;
                        }
                        graphics.setColor(n5);
                    } else {
                        if (n + 1 < n4) {
                            graphics.setColor(Code[15]);
                            graphics.drawLine(n9, n5, n10, n5);
                        }
                        graphics.setColor(-16777216);
                    }
                    if (this.f.elementAt(n + this.ad) == null) {
                        string2 = g.Code(0, (String)this.e.elementAt(n + this.ad), n8 - 1, "...");
                        this.f.setElementAt(string2, n + this.ad);
                    } else {
                        string2 = (String)this.f.elementAt(n + this.ad);
                    }
                    if (g.Code(string2)) {
                        g.Code(graphics, 0, string2, this.O + 4 + n8 - g.Code(0, string2), n6 + (this.av - this.au) / 2, 20);
                        ++n;
                        continue;
                    }
                    g.Code(graphics, 0, string2, this.O + 6, n6 + (this.av - this.au) / 2, 20);
                    ++n;
                }
            }
            return;
        }
        if (this.Code != null && this.Code.C >= 4) {
            B b = this.Code;
            synchronized (b) {
                int n = this.Code.d() - this.N;
                int n11 = this.Code.e() - this.M;
                this.N += n;
                this.M += n11;
                g.Code(graphics, this.O, this.K, this.Code(), this.I());
                if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
                    if (this.Code != null) {
                        Graphics graphics2 = this.Code.getGraphics();
                        this.X = (this.X + n) % this.Code.getWidth();
                        if (this.X < 0) {
                            this.X += this.Code.getWidth();
                        }
                        this.Y = (this.Y + n11) % this.Code.getHeight();
                        if (this.Y < 0) {
                            this.Y += this.Code.getHeight();
                        }
                        if (this.J == 117) {
                            this.aS = true;
                        }
                        if (this.aS || n != 0 && n11 != 0 || n11 != 0 && this.X != 0 || n != 0 && this.Y != 0) {
                            this.aS = true;
                        } else {
                            this.Code.Code(this.W - this.N, -this.M);
                            int n12 = n > 0 ? this.Code.getWidth() - n : 0;
                            int n13 = n11 > 0 ? this.Code.getHeight() - n11 : 0;
                            int n14 = n11 == 0 ? Math.abs(n) : this.Code.getWidth();
                            int n15 = n = n == 0 ? Math.abs(n11) : this.Code.getHeight();
                            if (n14 == 0) {
                                n12 = this.Code.e;
                                n13 = this.Code.f;
                                n14 = this.Code.g;
                                n = this.Code.h;
                            } else if (this.Code.g > 0 && this.Code.h > 0 && g.Code(this.Code.e, this.Code.f, this.Code.g, this.Code.h, 0, 0, this.Code.getWidth(), this.Code.getHeight())) {
                                if (this.Code.e < n12) {
                                    n14 += n12 - this.Code.e;
                                    n12 = this.Code.e;
                                }
                                n14 = Math.max(n12 + n14, this.Code.e + this.Code.g) - n12;
                                if (this.Code.f < n13) {
                                    n += n13 - this.Code.f;
                                    n13 = this.Code.f;
                                }
                                n = Math.max(n13 + n, this.Code.f + this.Code.h) - n13;
                            }
                            n11 = this.Code.getWidth() - this.X;
                            int n16 = this.Code.getHeight() - this.Y;
                            if (n12 < n11 && n12 + n14 > n11) {
                                if (n13 < n16 && n13 + n > n16) {
                                    this.aS = true;
                                } else {
                                    this.J(graphics2, n12, n13, n11 - n12, n);
                                    this.J(graphics2, n11, n13, n14 - n11 + n12, n);
                                }
                            } else if (n13 < n16 && n13 + n > n16) {
                                this.J(graphics2, n12, n13, n14, n16 - n13);
                                this.J(graphics2, n12, n16, n14, n - n16 + n13);
                            } else {
                                this.J(graphics2, n12, n13, n14, n);
                            }
                        }
                        if (this.aS) {
                            this.aS = false;
                            this.X = this.W > 0 ? this.Code.getWidth() - this.W : -this.W;
                            this.Y = 0;
                            graphics2.setClip(Math.max(0, -this.W), 0, Math.min(this.Code.getWidth(), this.Code.getWidth() - this.W), this.Code.getHeight());
                            g.Code(graphics2, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 0xFFFFFF);
                            this.Code.Z(graphics2, -this.N, -this.M);
                            this.P();
                        }
                        if (this.X != 0) {
                            graphics.drawImage(this.Code, this.O - this.X, this.K, 20);
                            g.Code(graphics, this.O + this.Code.getWidth() - this.X, this.K, this.X, this.I());
                            graphics.drawImage(this.Code, this.O + this.Code.getWidth() - this.X, this.K, 20);
                            g.Z(graphics);
                        } else {
                            graphics.drawImage(this.Code, this.O, this.K - this.Y, 20);
                            g.Code(graphics, this.O, this.K + this.Code.getHeight() - this.Y, this.Code(), this.Y);
                            graphics.drawImage(this.Code, this.O, this.K + this.Code.getHeight() - this.Y, 20);
                            g.Z(graphics);
                        }
                    } else {
                        this.W = 0;
                        if (this.Code(1) || this.Code(4)) {
                            g.Code(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight(), 0xFFFFFF);
                        }
                        if (this.Code(8)) {
                            if (p) {
                                g.Code(graphics, this.O, this.K, this.Code(), this.G, 0xD9FFFFFF & Code[42], true);
                            } else {
                                g.I(graphics, this.O, this.K, this.Code(), this.G, Code[43]);
                            }
                        }
                        this.Code.Z(graphics, this.O - this.N, this.K - this.M);
                        this.P();
                    }
                    this.Code.Code(graphics, this.O + this.W - this.N, this.K - this.M);
                }
                this.B(graphics);
                g.Z(graphics);
                return;
            }
        }
        g.Code(graphics, this.O, this.K, this.Q, this.G, 0xFFFFFF);
    }

    static void Z(int n) {
        z += n;
        if (aH) {
            Code.Code.c();
            if (z >= 160) {
                aH = false;
                g.J(false);
                g.Code((Object)I);
            }
        }
    }

    static Image Code(int n) {
        try {
            byte[] byArray = g.Code(n);
            if (byArray.length == 0) {
                return null;
            }
            if (byArray[0] == 67) {
                return g.Code(byArray, 0, byArray.length, 256, null);
            }
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void C(byte[] byArray, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            this.O = this.O + 1 & 0xFF;
            this.E = this.J[this.O] + this.E & 0xFF;
            byte by = this.J[this.O];
            this.J[this.O] = this.J[this.E];
            this.J[this.E] = by;
            byArray[n + i] = (byte)(byArray[n + i] ^ this.J[this.J[this.O] + this.J[this.E] & 0xFF]);
        }
    }

    static String I(String string) {
        return string.substring(string.indexOf(58) + 1);
    }

    static synchronized void J(int n) {
        I.B(n);
    }

    static int b() {
        boolean bl;
        boolean bl2 = bl = bm && Code.h > Code.i;
        if (c == 0) {
            if (bl) {
                return 0;
            }
            return b;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static void s() {
        block4: {
            if (g.k) break block4;
            if (g.i != null) ** GOTO lbl5
            try {
                g.i = new g(false, 0);
lbl5:
                // 2 sources

                if (g.j == null) {
                    g.j = new g(true, 0);
                    return;
                }
            }
            catch (OutOfMemoryError v0) {
                System.gc();
                g.k = true;
                g.g = null;
                return;
            }
            catch (Throwable v1) {}
        }
    }

    private void J(Graphics graphics, int n, int n2, int n3, int n4) {
        if (n < 0) {
            n3 += n;
            n = 0;
        }
        if (n2 < 0) {
            n4 += n2;
            n2 = 0;
        }
        n2 += this.Y;
        int n5 = this.X;
        int n6 = this.Y;
        if ((n += this.X) >= this.Code.getWidth()) {
            n5 -= this.Code.getWidth();
            n3 = Math.min((n -= this.Code.getWidth()) + n3, this.X) - n;
        }
        if (n2 >= this.Code.getHeight()) {
            n6 -= this.Code.getHeight();
            n4 = Math.min((n2 -= this.Code.getHeight()) + n4, this.Y) - n2;
        }
        n = Math.max(n, -this.W);
        graphics.setClip(n, n2, n3, n4);
        if (graphics.getClipWidth() > 0 && graphics.getClipHeight() > 0) {
            g.Code(graphics, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 0xFFFFFF);
            this.Code.Z(graphics, this.W + n5 - this.N, n6 - this.M);
            if (this.aX) {
                g.Code(graphics, 0, 0, this.Code.getWidth(), this.Code.getHeight(), -2130706432, false);
                return;
            }
            if (this.aW) {
                g.Code(graphics, 0, 0, this.Code.getWidth(), this.Code.getHeight(), 0x21000000, false);
            }
        }
    }

    static boolean Code(String string) {
        return g.Code(string, false);
    }

    final void Code(String string) {
        this.Code = new StringBuffer(string);
        this.Z(true);
        this.ag = this.Code.length();
        this.g();
    }

    static int Code(int n, int n2, boolean n3) {
        if (Code != null) {
            for (int i = Code.length - 1; i > 0; --i) {
                if (Code[i][0] != (char)n) continue;
                n = Code[i].length - 1;
                if (n3 != 0 && n > 1) {
                    return Code[i][n];
                }
                for (n3 = 1; n3 < n && n2 != -1; ++n3) {
                    if (Code[i][n3] != (char)n2) continue;
                    return Code[i][n3 + 1];
                }
                if (n > 0) {
                    return Code[i][1];
                }
                return -1;
            }
            if ((Code[0][0] & '\u0001') != 0 && (n == 8 || n >= 32 && n <= 255)) {
                return n;
            }
            if ((Code[0][0] & 2) == 0 && n >= 32) {
                try {
                    String string = Code.Code.getKeyName(n);
                    if (string.length() == 1 && Character.toLowerCase(string.charAt(0)) == Character.toLowerCase((char)n) || n == 32 && string.toLowerCase().equals("space")) {
                        return n;
                    }
                }
                catch (Throwable throwable) {}
            }
        }
        return -1;
    }

    private static boolean B(int n) {
        for (int i = Code.length - 1; i > 0; --i) {
            if (Code[i][0] != (char)n) continue;
            return Code[i].length > 2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    final void Z(boolean var1_1) {
        block9: {
            block8: {
                this.e = new Vector<E>();
                this.g = new Vector<E>();
                var2_2 = new String(this.Code);
                if (this.Code.length() > 0) {
                    if (var2_2.indexOf(32) < 0) {
                        this.Code(var2_2, Code.Code);
                        this.Code(var2_2, Code.I);
                        this.Code(var2_2, g.a);
                        this.Code(var2_2, g.J);
                        if (this.Code.length() == 1 && this.Code.charAt(0) == 'w') {
                            this.e.insertElementAt("www.", 0);
                            this.g.insertElementAt(null, 0);
                        }
                        var3_3 = var2_2.indexOf(46);
                        var4_4 = var2_2.indexOf("www.");
                        if (g.s.length() > 0 && this.Code.charAt(this.Code.length() - 1) == '.' && (var3_3 != this.Code.length() - 1 || var3_3 < 3 || var4_4 == -1 || var4_4 == var3_3 - 4) && var2_2.indexOf(47, var3_3) == -1 && var2_2.indexOf(32) == -1) {
                            var3_3 = 0;
                            while ((var4_4 = g.s.indexOf(44, var3_3)) != -1) {
                                this.e.insertElementAt(var2_2 + g.s.substring(var3_3, var4_4), 0);
                                this.g.insertElementAt(null, 0);
                                var3_3 = var4_4 + 1;
                            }
                        }
                    }
                    this.e.addElement(g.Code(158, this.Code.toString()));
                    this.g.addElement(g.Code(g.c, 0)[2]);
                }
                this.e.addElement(g.Code(159));
                this.g.addElement(null);
                if (this.e.size() != 0) break block8;
                v0 = this;
                ** GOTO lbl-1000
            }
            if (var1_1) {
                v0 = this;
                ** if (this.e.size() <= 2 && (this.e.size() != 2 || var2_2.indexOf((int)32) < 0)) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    v1 = 0;
                    ** GOTO lbl37
                }
            }
            break block9;
lbl-1000:
            // 2 sources

            {
                v1 = -1;
            }
lbl37:
            // 2 sources

            v0.ac = v1;
            this.ad = 0;
        }
        this.f = new Vector<E>();
        this.f.setSize(this.e.size());
    }

    /*
     * Exception decompiling
     */
    private static void R() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[FORLOOP]], but top level block is 2[TRYBLOCK]
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

    static Calendar Code(boolean bl, boolean bl2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date(g.Code(bl, bl2)));
        return calendar;
    }

    private static char[] Code(int n) {
        byte[] byArray = g.Code(n);
        char[] cArray = new char[byArray.length / 2];
        int n2 = 0;
        for (int i = 0; i < byArray.length; i += 2) {
            cArray[n2++] = (char)(byArray[i] << 8 | byArray[i + 1] & 0xFF);
        }
        return cArray;
    }

    static int[] Code(int[] nArray, int n) {
        n &= 0xFFFFFF;
        for (int i = 0; i < nArray.length; ++i) {
            if ((nArray[i] & 0xFFFFFF) != 0xFFFFFF) continue;
            nArray[i] = nArray[i] & 0xFF000000 | n;
        }
        return nArray;
    }

    private static int[] Code(byte[] byArray, int n, int n2) {
        int[] nArray = new int[n2 / 4];
        int n3 = nArray.length;
        while (--n3 >= 0) {
            nArray[n3] = byArray[n + (n3 << 2)] << 24 | (byArray[n + (n3 << 2) + 1] & 0xFF) << 16 | (byArray[n + (n3 << 2) + 2] & 0xFF) << 8 | byArray[n + (n3 << 2) + 3] & 0xFF;
        }
        return nArray;
    }

    static Image Code(byte[] object, Object object2) {
        int n = -1;
        if (object == null || ((byte[])object).length == 0 || object2 == null) {
            object = Code.J;
            object2 = Code.J;
        }
        if (h) {
            Image image;
            if (Z == null) {
                Z = new Hashtable(20);
                J = new Object[20];
            }
            if ((image = (Image)Z.get(object2)) != null) {
                return image;
            }
            for (int i = 0; i < 20; ++i) {
                if (J[i] != null) continue;
                n = i;
                break;
            }
            if (n == -1) {
                n = (Code.nextInt() & Integer.MAX_VALUE) % 20;
                Z.remove(J[n]);
            }
        }
        Object[] objectArray = new Object[3];
        object = g.Code(object, 0, ((byte[])object).length, 256, (Object[])(p && !bd ? null : objectArray));
        if (objectArray[0] != null) {
            if ((Integer)objectArray[2] != Code.e) {
                objectArray[0] = g.Code((int[])objectArray[0], (int)((Integer)objectArray[1]), (int)((Integer)objectArray[2]), Code.e, true);
                objectArray[1] = new Integer(Code.e);
                objectArray[2] = new Integer(Code.e);
            }
            int[] nArray = new int[1];
            object = nArray;
            nArray[0] = 0xFFFFFF;
            object = g.Code(objectArray, (int[])object, 0);
        } else if (object.getHeight() != Code.e && !bd) {
            object = g.Code((Image)object, 0, Code.e, true);
        }
        if (h) {
            Z.put(object2, object);
            g.J[n] = object2;
        }
        return object;
    }

    private static g Code(int n) {
        if (g.Z(n)) {
            return j;
        }
        return i;
    }

    private g(byte[] byArray) {
        int n;
        this.aJ = true;
        this.aI = true;
        this.f = true;
        this.J = new byte[256];
        for (n = 0; n < 256; ++n) {
            this.J[n] = (byte)n;
        }
        n = 0;
        int n2 = 0;
        for (int i = 0; i < 256; ++i) {
            n2 = byArray[n] + this.J[i] + n2 & 0xFF;
            byte by = this.J[i];
            this.J[i] = this.J[n2];
            this.J[n2] = by;
            n = (n + 1) % 32;
        }
    }

    private static int[] Code(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedShort();
        if (n == 0) {
            return null;
        }
        byte[] byArray = new byte[n << 2];
        dataInputStream.readFully(byArray);
        return g.Code(byArray, 0, byArray.length);
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [10 : 1024->1028)] java.lang.Throwable
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

    static synchronized void J(boolean bl) {
        int n = 0;
        boolean bl2 = false;
        while (bl2 ? n < 2 : n <= 0) {
            J j = new J();
            try {
                OutputStream outputStream = new DataOutputStream(j);
                ((DataOutputStream)outputStream).write(9);
                ((DataOutputStream)outputStream).writeUTF(g.Z(1));
                ((DataOutputStream)outputStream).writeUTF(":");
                ((DataOutputStream)outputStream).write(az << 1);
                ((DataOutputStream)outputStream).writeBoolean(z >= 160);
                outputStream.write(new byte[14]);
                ((DataOutputStream)outputStream).write(59);
                ((DataOutputStream)outputStream).writeBoolean(ar);
                ((DataOutputStream)outputStream).writeInt(i);
                ((DataOutputStream)outputStream).writeBoolean(aq);
                ((DataOutputStream)outputStream).writeBoolean(ay);
                ((DataOutputStream)outputStream).writeBoolean(au);
                ((DataOutputStream)outputStream).writeBoolean(av);
                ((DataOutputStream)outputStream).writeInt(k);
                ((DataOutputStream)outputStream).writeInt(l);
                ((DataOutputStream)outputStream).writeInt(f);
                ((DataOutputStream)outputStream).writeInt(h);
                ((DataOutputStream)outputStream).writeLong(Z);
                ((DataOutputStream)outputStream).writeLong(C);
                ((DataOutputStream)outputStream).writeUTF(g.n);
                ((DataOutputStream)outputStream).writeInt(m);
                ((DataOutputStream)outputStream).writeInt(az);
                ((DataOutputStream)outputStream).writeInt(g.j);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).write((aB ^ 1) * 3);
                ((DataOutputStream)outputStream).writeInt(g.n);
                ((DataOutputStream)outputStream).writeBoolean(aB);
                ((DataOutputStream)outputStream).writeUTF(k);
                ((DataOutputStream)outputStream).writeBoolean(ap);
                ((DataOutputStream)outputStream).write(ac << 1);
                ((DataOutputStream)outputStream).write(-1);
                ((DataOutputStream)outputStream).writeBoolean(true);
                byte[] byArray = new byte[32];
                I.Code(byArray);
                I.I(byArray, 0, 32);
                outputStream.write(byArray);
                ((DataOutputStream)outputStream).writeLong(0L);
                ((DataOutputStream)outputStream).writeLong(0L);
                ((DataOutputStream)outputStream).write(0);
                ((DataOutputStream)outputStream).writeShort(0);
                ((DataOutputStream)outputStream).writeShort(0);
                ((DataOutputStream)outputStream).writeBoolean(bo);
                ((DataOutputStream)outputStream).writeBoolean(as);
                ((DataOutputStream)outputStream).writeBoolean(aw);
                ((DataOutputStream)outputStream).writeBoolean(G);
                ((DataOutputStream)outputStream).writeBoolean(K && !bk);
                ((DataOutputStream)outputStream).writeBoolean(H);
                ((DataOutputStream)outputStream).writeUTF(Code.B);
                ((DataOutputStream)outputStream).writeInt(Code.Code);
                ((DataOutputStream)outputStream).writeInt(Code.I);
                ((DataOutputStream)outputStream).writeBoolean(Code.B);
                ((DataOutputStream)outputStream).writeBoolean(Code.Z);
                ((DataOutputStream)outputStream).writeUTF(Code.J);
                ((DataOutputStream)outputStream).writeUTF(Code.Z);
                ((DataOutputStream)outputStream).write(Code.J);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeBoolean(false);
                int n2 = Code.Code.size();
                ((DataOutputStream)outputStream).write(n2);
                for (int i = 0; i < n2; ++i) {
                    ((DataOutputStream)outputStream).writeUTF((String)Code.Code.elementAt(i));
                }
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeInt(c);
                ((DataOutputStream)outputStream).writeUTF(m);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeByte(d.size());
                for (n2 = 0; n2 < d.size(); ++n2) {
                    Object[] objectArray = (Object[])d.elementAt(n2);
                    ((DataOutputStream)outputStream).writeUTF((String)objectArray[0]);
                    ((DataOutputStream)outputStream).writeUTF((String)objectArray[1]);
                    objectArray = (byte[])objectArray[2];
                    ((DataOutputStream)outputStream).writeShort(objectArray.length);
                    outputStream.write((byte[])objectArray);
                }
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeInt(q);
                ((DataOutputStream)outputStream).writeUTF(l != null ? l : "");
                ((DataOutputStream)outputStream).writeByte(ax ? 1 : 0);
                ((DataOutputStream)outputStream).writeInt(r);
                g.Code((DataOutputStream)outputStream, I);
                ((DataOutputStream)outputStream).writeInt(0);
                ((DataOutputStream)outputStream).writeBoolean(false);
                ((DataOutputStream)outputStream).writeByte(0);
                ((DataOutputStream)outputStream).writeByte(aF ? 1 : 0);
                ((DataOutputStream)outputStream).writeInt(w);
                g.Code((DataOutputStream)outputStream, b);
                g.Z((DataOutputStream)outputStream);
                g.Code((DataOutputStream)outputStream);
                ((DataOutputStream)outputStream).writeInt(0);
                ((DataOutputStream)outputStream).writeInt(s);
                ((DataOutputStream)outputStream).writeInt(t);
                outputStream.write(Code.Z);
                ((DataOutputStream)outputStream).writeInt(0);
                ((DataOutputStream)outputStream).writeUTF("");
                ((DataOutputStream)outputStream).writeUTF("");
                ((DataOutputStream)outputStream).writeUTF("");
                ((DataOutputStream)outputStream).writeUTF("");
                ((DataOutputStream)outputStream).writeUTF("");
                ((DataOutputStream)outputStream).writeBoolean(aL);
                ((DataOutputStream)outputStream).writeLong(b);
                ((DataOutputStream)outputStream).writeInt(aB);
                ((DataOutputStream)outputStream).write(e, 0, 32);
                ((DataOutputStream)outputStream).write(f, 0, 32);
                ((DataOutputStream)outputStream).writeByte(o);
                ((DataOutputStream)outputStream).writeInt(p);
                ((DataOutputStream)outputStream).writeInt(u);
                ((DataOutputStream)outputStream).writeInt(aA);
                outputStream = new J();
                g.I(new DataOutputStream(outputStream));
                aA = g.Code(aA, ((ByteArrayOutputStream)outputStream).toByteArray(), "b", false);
            }
            catch (IOException iOException) {}
            if (!g.Code("s", j.toByteArray(), null, bl)) {
                bl2 = true;
                Code.Code(1);
                Code.Code.removeAllElements();
                try {
                    RecordStore.deleteRecordStore((String)"h1");
                }
                catch (RecordStoreException recordStoreException) {}
                g.Code(t, "b");
                t = -1;
            }
            ++n;
        }
    }

    static void B(boolean n) {
        if (n == 0 && g != null && g.length == 32) {
            return;
        }
        Object object = new g('\u0000');
        Code = new J(33);
        x = (6 + ((k ^ 1) << 1)) * 17312;
        g.s();
        if (!k) {
            if (i == null || j == null) {
                if (n != 0) {
                    k = true;
                }
            } else {
                ((g)object).B(-1988150126);
                ((g)object).B(-1319564848);
            }
        }
        for (int i = 0; i < 6; ++i) {
            g.e(i);
        }
        ((g)object).I(Code.Code(), 0, Code.size());
        Code.reset();
        g.Code(g.Code(89), 5);
        ((g)object).I(Code.Code(), 0, Code.size());
        Code.reset();
        Object object2 = (System.getProperty("microedition.platform") + System.getProperty("device.software.version")).getBytes();
        ((g)object).I((byte[])object2, 0, ((byte[])object2).length);
        object2 = new byte[32];
        ((g)object).Code((byte[])object2);
        if (!g.I((byte[])object2, e) || g.I(f, new byte[32])) {
            e = object2;
            object = g.Code(90);
            object2 = new g('\u0000');
            for (int i = 0; i < 6; ++i) {
                g.e(i);
                g.Code(5 == i ? g.Code() : (char[])object, i);
                super.I(Code.Code(), 0, Code.size());
                Code.reset();
            }
            if (!k) {
                object = g.Code(93);
                Code.write((byte[])object, 0, ((Object)object).length);
                super.I(Code.Code(), 0, Code.size());
                Code.reset();
            }
            super.Code(f);
            g.J(false);
        }
        Code.write(f, 0, 32);
        if (n != 0) {
            for (n = 0; n < 6; ++n) {
                Code.write(n);
                g.e(n);
                g.b(n, 1);
            }
            if (!k) {
                for (n = 6; n < 8; ++n) {
                    Code.write(n);
                    Code.write(Code - 2);
                    Code.write(2);
                    g.b(n, 1);
                }
            }
        }
        g = Code.toByteArray();
        Code = null;
        y = -1;
    }

    private static String Z(int n) {
        if (Code[n] != null) {
            return Code[n];
        }
        return "";
    }

    final boolean J() {
        return this.Code.size() > 0;
    }

    static long Code(boolean bl, boolean bl2) {
        long l = System.currentTimeMillis();
        if (bl2) {
            l += (long)(k * 60 * 60 * 1000 + g.l * 60 * 1000);
        }
        if (bl) {
            l += 1800000L;
        }
        return l;
    }

    static void j() {
        System.gc();
        if (aY) {
            Z = Runtime.getRuntime().freeMemory() * 10L / 8L;
            return;
        }
        if (aZ && Z > 0L) {
            return;
        }
        Vector<byte[]> vector = new Vector<byte[]>(ax);
        int n = 0;
        try {
            System.gc();
            while (vector.size() <= ax) {
                vector.addElement(new byte[8192]);
                ++n;
            }
        }
        catch (Throwable throwable) {}
        System.gc();
        Z = (n << 13) + 4;
    }

    static void u() {
        if (h) {
            Z = new Hashtable(20);
            J = new Object[20];
            return;
        }
        Z = null;
        J = null;
    }

    static Object[] Code(Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length];
        System.arraycopy(objectArray, 0, objectArray2, 0, objectArray.length);
        return objectArray2;
    }

    static boolean Code(Object[] objectArray) {
        return (objectArray[0].equals("www.") || objectArray[0].equals("")) && objectArray[1].equals("");
    }

    static void m() {
        if (aB == -1) {
            return;
        }
        try {
            Object object = g.Code(aB, "b");
            if (object == null) {
                return;
            }
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            object = dataInputStream;
            if (dataInputStream.readByte() != 1) {
                return;
            }
            int n = ((DataInputStream)object).readShort();
            for (int i = 0; i < n; ++i) {
                C c = new C();
                new C().Code = ((DataInputStream)object).readByte();
                c.Code = ((DataInputStream)object).readInt();
                c.I = ((DataInputStream)object).readInt();
                c.J = ((DataInputStream)object).readUTF();
                c.B = ((DataInputStream)object).readUTF();
                c.C = ((DataInputStream)object).readUTF();
                B.addElement(c);
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static void k() {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = g.Code(64);
            I = dataInputStream.readUTF();
            Z = dataInputStream.readUTF();
            if (Z != null && Z.indexOf("-") != -1) {
                J = Z.substring(Z.indexOf("-") + 1);
            }
            Code = dataInputStream.readUTF();
            d = dataInputStream.readUTF();
            a = dataInputStream.readUTF();
            b = dataInputStream.readUTF();
            c = dataInputStream.readUTF();
            B = dataInputStream.readUTF();
            C = dataInputStream.readUTF();
            ar = dataInputStream.readBoolean();
            i = dataInputStream.readInt();
            dataInputStream.readBoolean();
            aq = dataInputStream.readBoolean();
            dataInputStream.readBoolean();
            av = dataInputStream.readBoolean();
            k = dataInputStream.readBoolean();
        }
        catch (Throwable throwable) {
            ((InputStream)dataInputStream).close();
            return;
        }
        try {
            ((InputStream)dataInputStream).close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static synchronized void l() {
        try {
            Object object = (byte[])g.Code("s").firstElement();
            if (object != null) {
                int n;
                object = new ByteArrayInputStream((byte[])object);
                DataInputStream dataInputStream = new DataInputStream((InputStream)object);
                object = dataInputStream;
                int n2 = dataInputStream.readUnsignedByte();
                bp |= n2 < 9;
                if (n2 < 9) {
                    g.Code((InputStream)object, 5L);
                    object.readUTF();
                    g.Code((InputStream)object, 6L);
                    String string = object.readUTF();
                    if (string.length() == 64) {
                        g.Code[1] = string;
                    }
                    g.Code((DataInputStream)object, Integer.MAX_VALUE);
                    return;
                }
                if (n2 != 9) {
                    g.Code((DataInputStream)object, Integer.MAX_VALUE);
                    return;
                }
                String string = object.readUTF();
                if (string.length() >= 64) {
                    g.Code(1, string, false);
                }
                object.readUTF();
                az = object.readByte() >= 2;
                z = object.readBoolean() * 160;
                g.Code((InputStream)object, 14L);
                int n3 = object.readUnsignedByte();
                bp |= n3 < 59;
                if (n3 == 58) {
                    n3 = 59;
                }
                if (n3 != 59) {
                    g.Code((DataInputStream)object, Integer.MAX_VALUE);
                    return;
                }
                ar = object.readBoolean();
                i = object.readInt();
                aq = object.readBoolean();
                ay = object.readBoolean();
                au = object.readBoolean();
                av = object.readBoolean();
                k = object.readInt();
                l = object.readInt();
                f = object.readInt();
                if (f < g) {
                    af = true;
                }
                h = object.readInt();
                Z = object.readLong();
                C = object.readLong();
                object.readUTF();
                bt = false;
                m = object.readInt();
                m = 0;
                az = object.readInt();
                j = object.readInt();
                object.readBoolean();
                n3 = object.readByte();
                g.n = object.readInt();
                if (n3 == 3) {
                    aB = object.readBoolean();
                    k = object.readUTF();
                } else {
                    object.readBoolean();
                    object.readUTF();
                }
                ap = object.readBoolean();
                int n4 = object.readByte() - 2;
                ac = (n4 | -n4) >>> 31 ^ 1;
                object.readByte();
                object.readBoolean();
                g.Code((DataInputStream)object, 8);
                object.readLong();
                object.readLong();
                n3 = object.readUnsignedByte();
                g.Code((InputStream)object, (long)n3);
                n3 = object.readUnsignedShort() << 2;
                g.Code((InputStream)object, (long)n3);
                n3 = object.readUnsignedShort() << 2;
                g.Code((InputStream)object, (long)n3);
                bo = object.readBoolean();
                as = object.readBoolean();
                aw = object.readBoolean();
                G = object.readBoolean();
                K = object.readBoolean();
                H = object.readBoolean();
                Code.B = object.readUTF();
                Code.Code = object.readInt();
                Code.I = object.readInt();
                Code.B = object.readBoolean();
                Code.Z = object.readBoolean();
                Code.J = object.readUTF();
                Code.Z = object.readUTF();
                Code.J = object.readUnsignedByte();
                object.readBoolean();
                object.readBoolean();
                n3 = object.readByte();
                for (n = 0; n < n3; ++n) {
                    Code.Code.addElement(object.readUTF());
                }
                object.readBoolean();
                object.readBoolean();
                object.readBoolean();
                object.readBoolean();
                c = object.readInt();
                m = object.readUTF();
                object.readBoolean();
                n3 = object.readByte();
                for (n = 0; n < n3; ++n) {
                    Object[] objectArray = new Object[3];
                    Object[] objectArray2 = objectArray;
                    objectArray[0] = object.readUTF();
                    objectArray2[1] = object.readUTF();
                    byte[] byArray = new byte[object.readShort()];
                    object.readFully(byArray);
                    objectArray2[2] = byArray;
                    d.addElement(objectArray2);
                }
                object.readBoolean();
                object.readBoolean();
                q = object.readInt();
                l = object.readUTF();
                ax = object.readByte() & 1;
                r = object.readInt();
                I = g.Code((DataInputStream)object);
                object.readInt();
                object.readBoolean();
                n3 = object.readUnsignedByte();
                for (n = 0; n < n3; ++n) {
                    object.readUTF();
                    object.readUTF();
                    object.readUTF();
                    object.readUnsignedShort();
                    object.readUnsignedShort();
                }
                int n5 = object.readByte() - 1;
                aF = (n5 | -n5) >>> 31 ^ 1;
                w = object.readInt();
                b = g.Code((DataInputStream)object);
                g.I((DataInputStream)object);
                g.Code((DataInputStream)object);
                object.readInt();
                s = object.readInt();
                t = object.readInt();
                n3 = object.readByte() & 0xFF;
                byte[] byArray = new byte[(n3 << 2) + 1];
                byte[] byArray2 = byArray;
                byArray[0] = (byte)n3;
                object.readFully(byArray2, 1, n3 << 2);
                Code.Z = byArray2;
                object.readInt();
                object.readUTF();
                object.readUTF();
                object.readUTF();
                object.readUTF();
                object.readUTF();
                aL = object.readBoolean();
                b = object.readLong();
                aB = object.readInt();
                object.readFully(e, 0, 32);
                object.readFully(f, 0, 32);
                o = object.readUnsignedByte();
                p = object.readInt();
                u = object.readInt();
                aA = object.readInt();
                if (aA != -1) {
                    object = g.Code(aA, "b");
                    Z = g.Code(new DataInputStream(new ByteArrayInputStream((byte[])object)), true);
                }
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static Object[] Code() {
        Object[] objectArray = new Object[11];
        Object[] objectArray2 = objectArray;
        objectArray[0] = "www.";
        objectArray2[1] = "";
        objectArray2[3] = new Integer(0);
        objectArray2[4] = new Integer(3);
        objectArray2[5] = new Integer(97);
        objectArray2[6] = new Integer(0);
        objectArray2[7] = g.I();
        objectArray2[8] = g.Code();
        objectArray2[9] = new Integer(0);
        objectArray2[10] = new Integer(0);
        return objectArray2;
    }

    private static boolean Code(Object[] object, Vector vector) {
        object = (String)object[0];
        for (int i = 0; i < vector.size(); ++i) {
            if (!((String)((Object[])vector.elementAt(i))[0]).equals(object)) continue;
            return true;
        }
        return false;
    }

    private static void I(DataOutputStream dataOutputStream) {
        dataOutputStream.write(aD | aE << 1);
        dataOutputStream.write(Z.size());
        for (int i = 0; i < Z.size(); ++i) {
            Object[] objectArray = (Object[])Z.elementAt(i);
            dataOutputStream.write((Integer)objectArray[objectArray.length - 2]);
            dataOutputStream.write(objectArray.length - 2);
            for (int j = 0; j < objectArray.length - 2; ++j) {
                Object[] objectArray2 = (Object[])objectArray[j];
                byte[] byArray = (byte[])objectArray2[2];
                dataOutputStream.writeShort((short)byArray.length);
                ((OutputStream)dataOutputStream).write(byArray);
                dataOutputStream.writeUTF((String)objectArray2[1]);
                dataOutputStream.writeUTF((String)objectArray2[0]);
                objectArray2 = (byte[])objectArray2[3];
                dataOutputStream.writeShort((short)objectArray2.length);
                ((OutputStream)dataOutputStream).write((byte[])objectArray2);
            }
            dataOutputStream.write((Integer)objectArray[objectArray.length - 1]);
        }
    }

    private static int Code(RecordStore recordStore, byte[] byArray) {
        byArray = g.Code(byArray);
        return recordStore.addRecord(byArray, 0, byArray.length);
    }

    static void Code(InputStream inputStream, long l) {
        while (l > 0L) {
            l -= inputStream.skip(l);
        }
    }

    final int c() {
        return this.Code.size();
    }

    final Vector Code(int n) {
        return (Vector)this.I.get(new Integer(n));
    }

    static String Code(String string) {
        if ((string = System.getProperty(string)) != null) {
            g.I(string.getBytes());
        }
        return string;
    }

    public static void Code(Vector vector) {
        if (vector.size() > 0) {
            byte[] byArray = new byte[16];
            int n = 0;
            if (vector == J && v > 0) {
                n = v;
            }
            while (n < vector.size()) {
                if (g.Code((Object[])vector.elementAt(n), 5) != 82) {
                    byte[] byArray2 = (byte[])((Object[])vector.elementAt(n))[8];
                    if (!g.Code(byArray, byArray2)) {
                        ((Object[])vector.elementAt((int)n))[8] = byArray;
                    }
                    byArray = (byte[])((Object[])vector.elementAt(n))[7];
                }
                ++n;
            }
        }
    }

    private static boolean I(String string) {
        try {
            Class.forName(string);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }

    private static void Code(DataOutputStream dataOutputStream, Vector vector) {
        int n = vector != null ? vector.size() : 0;
        dataOutputStream.writeByte(n);
        int n2 = 0;
        while (n2 < n) {
            Object[] objectArray = g.Code(vector, n2);
            dataOutputStream.writeUTF((String)objectArray[1]);
            dataOutputStream.writeUTF((String)objectArray[0]);
            byte[] byArray = (byte[])objectArray[2];
            objectArray = byArray;
            if (byArray != null) {
                dataOutputStream.writeShort(objectArray.length);
                ((OutputStream)dataOutputStream).write((byte[])objectArray);
                ++n2;
                continue;
            }
            dataOutputStream.writeShort(0);
            ++n2;
        }
    }

    static String Code(int n) {
        if (B == null) {
            g.R();
        }
        if (B == null || n >= B.length || B[n] == null) {
            return "";
        }
        return B[n];
    }

    static Vector Code(DataInputStream dataInputStream) {
        int n = dataInputStream.readByte();
        Vector<Object[]> vector = new Vector<Object[]>(n);
        for (int i = 0; i < n; ++i) {
            Object[] objectArray = new Object[4];
            Object[] objectArray2 = objectArray;
            objectArray[1] = dataInputStream.readUTF();
            objectArray2[0] = dataInputStream.readUTF();
            short s = dataInputStream.readShort();
            byte[] byArray = new byte[s];
            dataInputStream.readFully(byArray, 0, s);
            objectArray2[2] = byArray;
            vector.addElement(objectArray2);
        }
        return vector;
    }

    static Vector Code(DataInputStream dataInputStream, boolean bl) {
        int n = dataInputStream.readUnsignedByte();
        int n2 = n & 2;
        aE = (n2 | -n2) >>> 31;
        aD = n & 1;
        Vector<Object[]> vector = new Vector<Object[]>();
        int n3 = dataInputStream.readUnsignedByte();
        for (int i = 0; i < n3; ++i) {
            int n4 = dataInputStream.readUnsignedByte();
            Object[] objectArray = new Object[dataInputStream.readUnsignedByte() + 2];
            Object[] objectArray2 = objectArray;
            objectArray[objectArray.length - 2] = new Integer(n4);
            for (n4 = 0; n4 < objectArray2.length - 2; ++n4) {
                Object[] objectArray3 = new Object[4];
                byte[] byArray = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(byArray, 0, byArray.length);
                objectArray3[2] = byArray;
                objectArray3[1] = dataInputStream.readUTF();
                objectArray3[0] = dataInputStream.readUTF();
                byArray = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(byArray, 0, byArray.length);
                objectArray3[3] = byArray;
                objectArray2[n4] = objectArray3;
            }
            n4 = 0;
            if (bl) {
                n4 = dataInputStream.readUnsignedByte();
            }
            objectArray2[objectArray2.length - 1] = new Integer(n4);
            vector.addElement(objectArray2);
        }
        return vector;
    }

    static Object[] Code(int n) {
        Object[] objectArray = (Object[])Z.elementAt(n);
        int n2 = (Integer)objectArray[objectArray.length - 1];
        return (Object[])objectArray[n2];
    }

    static int Code(Object[] objectArray, int n) {
        if (n < objectArray.length) {
            return (Integer)objectArray[n];
        }
        return 0;
    }

    static void n() {
        try {
            J j = new J();
            DataOutputStream dataOutputStream = new DataOutputStream(j);
            Vector vector = B;
            synchronized (vector) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeShort(B.size() - C.size());
                int n = 0;
                while (n < B.size()) {
                    C c = (C)B.elementAt(n);
                    if (C.contains(c)) {
                        ++n;
                        continue;
                    }
                    dataOutputStream.writeByte(c.Code == 0 ? 3 : (int)c.Code);
                    dataOutputStream.writeInt(c.Code);
                    dataOutputStream.writeInt(c.I);
                    dataOutputStream.writeUTF(c.J);
                    dataOutputStream.writeUTF(c.B);
                    dataOutputStream.writeUTF(c.C);
                    ++n;
                }
                int n2 = aB;
                if ((aB = g.Code(aB, j.toByteArray(), "b", false)) != n2) {
                    g.J(false);
                }
                return;
            }
        }
        catch (IOException iOException) {
            return;
        }
    }

    static String Code(String string, String string2, String string3) {
        int n = string.indexOf(string2);
        if (n < 0) {
            return string;
        }
        return string.substring(0, n) + string3 + string.substring(n + string2.length());
    }

    static void o() {
        Vector vector = B;
        synchronized (vector) {
            Object[] objectArray = new Object[C.size()];
            C.copyInto(objectArray);
            for (int i = 0; i < objectArray.length; ++i) {
                C c = (C)objectArray[i];
                if (c.Code == 0) continue;
                B.removeElement(c);
                C.removeElement(c);
            }
            {
                continue;
            }
            return;
        }
    }

    private static void Q() {
        Object[] objectArray;
        Object[] objectArray2;
        int n;
        Object[] objectArray3;
        Object object;
        Object object2 = g.Code("Operator-Bookmarks");
        if (object2 == null || object2.length() <= 0) {
            object = null;
        } else {
            Vector<Object[]> vector = new Vector<Object[]>();
            objectArray3 = ",";
            Object object3 = object2;
            while ((n = object3.indexOf((String)objectArray3)) >= 0) {
                objectArray2 = object2.substring(0, n).trim();
                if (objectArray2.length() > 0) {
                    vector.addElement(objectArray2);
                }
                object3 = object2.substring(n + objectArray3.length());
            }
            if ((object2 = object2.trim()).length() > 0) {
                vector.addElement((Object[])object2);
            }
            if (vector.size() <= 0) {
                object = null;
            } else {
                object2 = new String[vector.size()];
                for (int i = 0; i < vector.size(); ++i) {
                    object2[i] = (String)vector.elementAt(i);
                }
                object = object2 = object2;
            }
        }
        if (object == null || ((String)object2).length == 0 || ((String)object2).length % 2 != 0) {
            objectArray = null;
        } else {
            int n2 = ((String)object2).length / 2;
            objectArray3 = new Vector(n2);
            for (n = 0; n < n2; ++n) {
                Object[] objectArray4 = g.Code();
                objectArray2 = objectArray4;
                objectArray4[1] = object2[n << 1];
                objectArray2[0] = object2[(n << 1) + 1];
                objectArray2[3] = new Integer(g.Code(objectArray2, 3) | 0xFFFFFF80);
                objectArray3.addElement(objectArray2);
            }
            objectArray = object2 = objectArray3;
        }
        if (objectArray != null && object2.size() > 0) {
            for (int i = object2.size() - 1; i >= 0; --i) {
                objectArray3 = (Object[])object2.elementAt(i);
                J.insertElementAt(objectArray3, 0);
            }
            v = object2.size();
        }
    }

    static void Code(StringBuffer stringBuffer, int n, int n2) {
        if (n2 <= 0 || n == n2) {
            g.Code(stringBuffer, n, n, true);
            return;
        }
        g.Code(stringBuffer, n, n2, false);
        stringBuffer.append('/');
        g.Code(stringBuffer, n2, n2, true);
    }

    public static boolean Code(Vector vector) {
        int n = g.Code(vector, new byte[16], true);
        for (int i = 0; i < vector.size(); ++i) {
            if (n == -1) {
                return false;
            }
            Object e2 = vector.elementAt(n);
            if (i != n) {
                vector.setElementAt(vector.elementAt(i), n);
                vector.setElementAt(e2, i);
            }
            n = g.Code(vector, (byte[])((Object[])e2)[7], true);
        }
        return true;
    }

    private static int Z(String string, String string2) {
        int n = Math.max(0, 0);
        if (string2.length() == 0) {
            return n;
        }
        if (n <= string.length() - string2.length()) {
            for (int i = n; i <= string.length() - string2.length(); ++i) {
                if (!g.Code(string, string2, n)) continue;
                return i;
            }
        }
        return -1;
    }

    static void p() {
        Object object;
        J = g.Code(true, "b1", 0);
        a = g.Code(true, "sp", 0);
        c = g.Code(true, "u", 0);
        if (J == null) {
            J = new Vector();
        }
        boolean bl = false;
        if (a == null) {
            a = new Vector();
            bl = true;
        }
        while (a.size() < 9) {
            Object[] objectArray = g.Code();
            object = objectArray;
            objectArray[5] = new Integer(83);
            a.addElement(object);
        }
        if (c == null) {
            c = g.Code(false, null, 67);
        } else if (bp) {
            object = g.Code(false, null, 67);
            if (((Vector)object).size() > 0) {
                c.setElementAt(((Vector)object).elementAt(0), 0);
            }
            g.Code(c, false);
        }
        if (!bo) {
            object = g.Code(false, null, 66);
            int n = 0;
            for (int i = 0; i < ((Vector)object).size(); ++i) {
                Object[] objectArray = (Object[])((Vector)object).elementAt(i);
                if (g.Code((String)objectArray[0]) != -1 || g.Code(objectArray, J)) continue;
                if (g.Code(objectArray, 1)) {
                    if (!bl) continue;
                    a.setElementAt(objectArray, n++);
                    continue;
                }
                J.addElement(objectArray);
            }
            g.Code(J, true);
            g.Code(a, true);
        }
        bo = true;
        g.q();
        g.Q();
    }

    private static int Z(int n, char[] cArray, int n2, int n3) {
        int n4 = 0;
        for (int i = n2; i < n2 + n3; ++i) {
            n4 += g.Code(n, cArray[i]);
        }
        return n4;
    }

    private static void Code(Vector vector, int n, int n2) {
        if (vector != null) {
            Object e2 = vector.elementAt(n);
            Object e3 = vector.elementAt(n2);
            vector.setElementAt(e2, n2);
            vector.setElementAt(e3, n);
            g.Code(vector, true);
        }
    }

    static void Code(Vector vector, Object[] objectArray) {
        if (vector != null && objectArray != null) {
            vector.addElement(objectArray);
            g.Code(vector, true);
        }
    }

    static void q() {
        if (aF) {
            b.removeAllElements();
            return;
        }
        for (int i = 0; i < b.size(); ++i) {
            Object[] objectArray = (Object[])b.elementAt(i);
            Object[] objectArray2 = objectArray;
            objectArray[3] = g.Code(objectArray2, a) ? new Object() : null;
        }
    }

    public static void Code(Vector vector, boolean bl) {
        if (vector == d) {
            g.J(false);
            return;
        }
        if (bl && (vector == J || vector == a)) {
            if (!Code.Z || vector == J && (Code.J & 2) != 0 || vector == a && (Code.J & 1) != 0) {
                ++Code.Code;
            }
            g.J(false);
        }
        g.Code(vector == J ? "b1" : (vector == c ? "u" : "sp"), vector);
        if (vector == a) {
            Code.I = true;
        }
    }

    static void r() {
        if (!g.Code("u", c)) {
            aA = true;
            return;
        }
        aA = false;
    }

    static Object[] Code(Vector vector, int n) {
        if (vector != null) {
            return (Object[])vector.elementAt(n);
        }
        return null;
    }

    private static byte[] Code() {
        if (c == null) {
            c = new byte[16];
            for (int i = 0; i < 16; ++i) {
                g.c[i] = -1;
            }
        }
        return c;
    }

    private static byte[] I() {
        byte[] byArray = new byte[16];
        for (int i = 0; i < 16; ++i) {
            byArray[i] = (byte)Code.nextInt();
        }
        return byArray;
    }

    private static boolean Code(String string, String string2, int n) {
        if (n < 0 || n > string.length() - string2.length()) {
            return false;
        }
        for (int i = string2.length() - 1; i >= 0; --i) {
            if (Character.toLowerCase(string.charAt(i + n)) == Character.toLowerCase(string2.charAt(i))) continue;
            return false;
        }
        return true;
    }

    static void Code(Vector vector, Object[] objectArray, int n) {
        if (vector != null) {
            if (vector == a) {
                if ((g.Code(objectArray, 9) & 2) != 0) {
                    Code.Code((Integer)objectArray[10], true);
                }
                objectArray[9] = new Integer(1);
                objectArray[10] = new Integer(0);
            }
            if (n + 1 > vector.size()) {
                vector.setSize(n + 1);
            }
            vector.setElementAt(objectArray, n);
            g.Code(vector, true);
        }
    }

    static int I(int n, char[] cArray, int n2, int n3) {
        if (g.Code(n, cArray, 0, n2) <= n3) {
            return n2;
        }
        int n4 = 0;
        int n5 = 0;
        while (n2 - n4 > 1) {
            n5 = (n2 + n4) / 2;
            if (g.Code(n, cArray, 0, n5) >= n3) {
                n2 = n5;
                continue;
            }
            n4 = n5;
        }
        if (g.Code(n, cArray, 0, n5) > n3) {
            n5 = n4;
        }
        return n5;
    }

    private static String a(String string) {
        int n = string.indexOf(46);
        int n2 = string.lastIndexOf(45, n - 1);
        try {
            int n3 = Integer.parseInt(string.substring(n2, n));
            if (n3 >= -255 && n3 < 0) {
                string = string.substring(0, n2) + string.substring(n);
            }
            return string;
        }
        catch (Throwable throwable) {
            return string;
        }
    }

    static String Code(int n, String string, int n2, String string2) {
        if (string2 == null) {
            string2 = "...";
        }
        if (g.Code(n, string = string.substring(0, Math.min(string.length(), 4096))) <= n2) {
            return string;
        }
        n2 -= g.Code(n, string2);
        char[] cArray = string.toCharArray();
        n = g.I(n, cArray, cArray.length, n2);
        return string.substring(0, n) + string2;
    }

    static boolean Code(String string, Vector vector) {
        boolean bl = false;
        if (vector == null) {
            return false;
        }
        boolean bl2 = false;
        int n = 0;
        Vector<byte[]> vector2 = new Vector<byte[]>(vector.size());
        while (bl2 ? n < 2 : n <= 0) {
            int n2 = 0;
            try {
                if (string.equals("b1") && v > 0) {
                    n2 = v;
                }
                while (n2 < vector.size()) {
                    J j = new J();
                    DataOutputStream dataOutputStream = new DataOutputStream(j);
                    Object[] objectArray = (Object[])vector.elementAt(n2);
                    dataOutputStream.write(n2);
                    dataOutputStream.writeUTF((String)objectArray[0]);
                    dataOutputStream.writeUTF((String)objectArray[1] != null ? (String)objectArray[1] : (String)objectArray[0]);
                    byte[] byArray = (byte[])objectArray[2];
                    if (byArray == null || i && "h1".equals(string) && n2 < vector.size() - 3) {
                        dataOutputStream.writeShort(0);
                    } else {
                        dataOutputStream.writeShort(byArray.length);
                        ((OutputStream)dataOutputStream).write(byArray);
                    }
                    if (objectArray[3] == null) {
                        dataOutputStream.writeUTF("");
                    } else if (objectArray[3] instanceof String) {
                        dataOutputStream.writeUTF((String)objectArray[3]);
                    } else if (string.equals("b1") || string.equals("sp")) {
                        dataOutputStream.write(g.Code(objectArray, 3) | 8);
                        dataOutputStream.write(3);
                        dataOutputStream.write(g.Code(objectArray, 5));
                        dataOutputStream.write(g.Code(objectArray, 6));
                        ((OutputStream)dataOutputStream).write((byte[])objectArray[7]);
                        ((OutputStream)dataOutputStream).write((byte[])objectArray[8]);
                        dataOutputStream.writeByte((byte)g.Code(objectArray, 9));
                        dataOutputStream.writeInt(g.Code(objectArray, 10));
                    } else {
                        dataOutputStream.write(g.Code(objectArray, 3));
                    }
                    vector2.addElement(j.toByteArray());
                    ++n2;
                }
                bl = g.Code(string, null, vector2, false);
                if (!bl) {
                    bl2 = true;
                    Code.Code(1);
                }
                ++n;
            }
            catch (IOException iOException) {
                bl2 = true;
                ++n;
            }
        }
        return bl;
    }

    static boolean Code(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return true;
        }
        return false;
    }

    private static void Code(StringBuffer stringBuffer, char c) {
        stringBuffer.append('%');
        if (c < '\u0010') {
            stringBuffer.append('0');
        }
        stringBuffer.append(Integer.toHexString(c));
    }

    public static int Code(String objectArray, String string) {
        try {
            objectArray = g.Code((String)objectArray, true);
            for (int i = 0; i < Code.length; ++i) {
                String string2 = (String)objectArray[3];
                int n = (Integer)objectArray[2];
                String string3 = (String)objectArray[1];
                String string4 = (String)objectArray[0];
                g g2 = Code[i];
                if (!g.Z(g2.e, string4) || !g.Z(g2.p, string3) || g2.D != 0 && n != g2.D || !g.Z(g2.o, string2)) {
                    continue;
                }
                if (g.Code[i].K == 255) {
                    return g.Code(string, null);
                }
                return g.Code[i].K;
            }
            return 0;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    static String Code(String string, boolean bl) {
        if (string == null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string.length());
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (c <= '\u007f') {
                if (bl && c == ' ') {
                    stringBuffer.append('+');
                    ++n;
                    continue;
                }
                if (c == '%' || c <= ' ') {
                    g.Code(stringBuffer, c);
                    ++n;
                    continue;
                }
                if (bl && "&=?#:".indexOf(c) >= 0) {
                    g.Code(stringBuffer, c);
                    ++n;
                    continue;
                }
                stringBuffer.append(c);
                ++n;
                continue;
            }
            if (c > '\u07ff') {
                g.Code(stringBuffer, (char)(0xE0 | c >> 12 & 0xF));
                g.Code(stringBuffer, (char)(0x80 | c >> 6 & 0x3F));
            } else {
                g.Code(stringBuffer, (char)(0xC0 | c >> 6 & 0x1F));
            }
            g.Code(stringBuffer, (char)(0x80 | c & 0x3F));
            ++n;
        }
        return stringBuffer.toString();
    }

    private static int Code(int n, char c) {
        if (!bq || c == ' ' || c > '\u07ff') {
            return Code[n].charWidth(c);
        }
        if (Code[n][c] != -1) {
            return Code[n][c];
        }
        int n2 = Code[Code.length - 1].getHeight();
        if (J == null) {
            J = Image.createImage((int)32, (int)n2);
        }
        Object object = J.getGraphics();
        object.setColor(-1);
        object.fillRect(0, 0, 32, n2);
        object.setColor(0);
        object.setFont(Code[n]);
        object.drawChar(c, 0, 0, 20);
        object = new int[n2 << 5];
        J.getRGB((int[])object, 0, 32, 0, 0, 32, n2);
        Graphics graphics = object[((Graphics)object).length - 1];
        int n3 = 0;
        for (n2 = (n2 << 5) - 1; n2 >= 0; --n2) {
            if (object[n2] == graphics) continue;
            n3 = Math.max(n2 & 0x1F, n3);
            n2 &= 0xFFFFFFE0;
        }
        byte by = (byte)(n3 + 2);
        g.Code[n][c] = by;
        return by;
    }

    private static String Code(String string, int n) {
        int n2 = string.indexOf(46);
        if (n2 > 0) {
            string = string.substring(0, n2) + '-' + n + string.substring(n2);
        }
        return string;
    }

    static int Code(int n, String string) {
        if ((n = g.Code(n)) >= 6) {
            return g.Code(n).I(string);
        }
        if (!bq) {
            return Code[n].stringWidth(string);
        }
        return g.Z(n, string.toCharArray(), 0, string.length());
    }

    private static int Code(int n, char c, boolean bl) {
        if (bl) {
            n = g.Code(n);
        }
        if (n >= 6) {
            g g2 = g.Code(n);
            n = c;
            return g2.I[g.Code((char)n)];
        }
        return g.Code(n, c);
    }

    static void x() {
        if (Code == null) {
            g.T();
        }
    }

    private static synchronized void Z(DataOutputStream dataOutputStream) {
        g g2;
        int n;
        dataOutputStream.writeInt("server4.operamini.com".hashCode());
        dataOutputStream.writeInt(A);
        dataOutputStream.writeByte(I.length);
        for (n = 0; n < I.length; ++n) {
            g2 = I[n];
            dataOutputStream.writeByte(g2.G);
            dataOutputStream.writeByte(g2.L);
            dataOutputStream.writeUTF(g2.o);
            dataOutputStream.writeShort(g2.K);
            dataOutputStream.writeShort(g2.Q);
            dataOutputStream.writeUTF(g2.e);
        }
        dataOutputStream.writeByte(Code.length);
        for (n = 0; n < Code.length; ++n) {
            g2 = Code[n];
            dataOutputStream.writeUTF(g2.e);
            dataOutputStream.writeUTF(g2.p);
            dataOutputStream.writeShort(g2.D);
            dataOutputStream.writeUTF(g2.o);
            dataOutputStream.writeByte(g2.K);
        }
    }

    static String I(String string, String string2) {
        if (string != null && string2 != null) {
            string = '&' + string + '&';
            if (string.indexOf('&' + string2 + '&') >= 0) {
                return "";
            }
            int n = string.indexOf('&' + string2 + '=');
            if (n >= 0) {
                int n2 = n + (string2.length() + 2);
                return g.B(string.substring(n2, string.indexOf(38, n2)));
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static Vector Code(boolean var0, String var1_1, int var2_2) {
        block25: {
            block24: {
                var3_3 = null;
                var4_4 = null;
                var5_5 = 0;
                var6_6 = null;
                if (!var0) ** GOTO lbl19
                var6_6 = g.Code(var1_1);
                var7_7 = var6_6.size();
                if (var7_7 != 0) break block24;
                try {
                    null.close();
                    return null;
                }
                catch (Throwable v0) {
                    return null;
                }
            }
            var5_5 = var1_1.equals("h1");
            break block25;
lbl19:
            // 1 sources

            var4_4 = g.Code(var2_2);
            var7_7 = var4_4.readUnsignedByte();
        }
        var3_3 = new Vector<Object[]>(var7_7);
        var8_8 = 0;
        while (var8_8 < var7_7) {
            if (var0) {
                var4_4 = new DataInputStream(new ByteArrayInputStream((byte[])var6_6.elementAt(var8_8)));
                var4_4.read();
            }
            v1 = new Object[var5_5 + 11];
            var9_9 = v1;
            v1[0] = var4_4.readUTF();
            var9_9[1] = var4_4.readUTF();
            var10_10 = var4_4.readShort();
            if (var10_10 > 0) {
                var10_11 = new byte[var10_10];
                var4_4.readFully(var10_11);
                var9_9[2] = var10_11;
            }
            if (var5_5 != 0) {
                var9_9[3] = var4_4.readUTF();
            } else {
                v2 = var2_2 - 66;
                var10_10 = (v2 | -v2) >>> 31 ^ 1;
                var11_13 = var4_4.readByte();
                var9_9[3] = new Integer(var11_13);
                var12_14 = new byte[16];
                var13_15 = new byte[16];
                for (var14_16 = 0; var14_16 < 16; ++var14_16) {
                    var13_15[var14_16] = -1;
                }
                if ((var11_13 & 8) != 0) {
                    var11_13 = var4_4.readByte();
                    var9_9[5] = new Integer(var4_4.readByte());
                    var9_9[6] = new Integer(var4_4.readByte());
                    var4_4.readFully(var12_14);
                    if (var11_13 > 1) {
                        var4_4.readFully(var13_15);
                    }
                    if (var11_13 > 2) {
                        var9_9[9] = new Integer(var4_4.readByte());
                        var9_9[10] = new Integer(var4_4.readInt());
                    } else {
                        var10_10 = 1;
                    }
                } else {
                    var9_9[5] = new Integer(97);
                    var9_9[6] = new Integer(0);
                    for (var11_13 = 0; var11_13 < 16; ++var11_13) {
                        var12_14[var11_13] = (byte)g.Code.nextInt();
                    }
                }
                var9_9[4] = new Integer(3);
                var9_9[7] = var12_14;
                var9_9[8] = var13_15;
                if (var10_10 != 0 && ("sp".equals(var1_1) || g.Code(var9_9, 1)) && !g.Code(var9_9)) {
                    var9_9[9] = new Integer(4);
                    var9_9[10] = new Integer(g.B((String)var9_9[1] + ((var10_12 = (String)var9_9[0]).length() > 2 && var10_12.indexOf(47) == 1 ? var10_12.substring(2) : var10_12)));
                } else if (var10_10 != 0) {
                    var9_9[9] = new Integer(0);
                    var9_9[10] = new Integer(0);
                }
            }
            if (var9_9[1].equals("o:X")) {
                ++var8_8;
                continue;
            }
            if (var9_9[0].equals("o:u")) {
                ++var8_8;
                continue;
            }
            var3_3.addElement(var9_9);
            ++var8_8;
        }
        try {
            var4_4.close();
            return var3_3;
            catch (Throwable v3) {
                var4_4.close();
                return var3_3;
            }
        }
        catch (Throwable v4) {
            return var3_3;
        }
    }

    private static boolean I(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return false;
        }
        for (int i = 0; i < byArray.length; ++i) {
            if (byArray[i] == byArray2[i]) continue;
            return false;
        }
        return true;
    }

    static synchronized void Code(int n, byte[] object) {
        try {
            object = new DataInputStream(new ByteArrayInputStream((byte[])object));
            g.Code(n, (DataInputStream)object, false);
            g.J(false);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static byte[] Code(byte[] byArray) {
        if (byArray.length < ay) {
            byte[] byArray2 = new byte[ay];
            System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
            return byArray2;
        }
        return byArray;
    }

    private static boolean Code(byte[] byArray, byte[] byArray2) {
        if (byArray == null || byArray2 == null) {
            return false;
        }
        for (int i = 0; i < 16; ++i) {
            if (byArray[i] == byArray2[i]) continue;
            return false;
        }
        return true;
    }

    static int Code(Vector vector, byte[] byArray, boolean bl) {
        for (int i = 0; i < vector.size(); ++i) {
            if (!g.Code(byArray, (byte[])((Object[])vector.elementAt(i))[bl + 7])) continue;
            return i;
        }
        return -1;
    }

    static void Code(StringBuffer stringBuffer, int n, int n2, boolean bl) {
        if (n < 0) {
            stringBuffer.append('?');
            return;
        }
        boolean bl2 = true;
        if (n2 >= aE) {
            n2 = aE;
            bl2 = false;
        } else if (n2 >= aD) {
            n2 = aD;
            bl2 = false;
        } else {
            n2 = n2 >= aC / 2 ? aC : 1;
        }
        int n3 = n / n2;
        n -= n3 * n2;
        if (bl2) {
            n = n3 + (n << 1 >= n2 ? 1 : 0);
            stringBuffer.append(n);
        } else {
            n = n * 10 / n2;
            stringBuffer.append(n3);
            if (n3 > 0 || n > 0) {
                stringBuffer.append('.').append(n);
            }
        }
        if (bl) {
            stringBuffer.append(' ');
            if (n2 >= aE) {
                stringBuffer.append('G');
            } else if (n2 >= aD) {
                stringBuffer.append('M');
            } else if (n2 >= aC) {
                stringBuffer.append('k');
            }
            stringBuffer.append('B');
        }
    }

    private static synchronized void I(DataInputStream dataInputStream) {
        int n = dataInputStream.readInt();
        g.Code(dataInputStream.readInt(), dataInputStream, true);
        if (n != "server4.operamini.com".hashCode()) {
            g.T();
        }
    }

    private static char[] Code() {
        int n;
        char[] cArray = new char[588];
        char[] cArray2 = g.Code(92);
        int n2 = 313;
        for (n = 0; n < cArray2.length; n = (int)((char)(n + 2))) {
            for (char c = cArray2[n]; c <= cArray2[n + 1]; c = (char)(c + '\u0001')) {
                cArray[n2++] = c;
            }
        }
        int n3 = 0;
        char[] cArray3 = cArray;
        n = 313;
        char[] cArray4 = cArray;
        int n4 = 0;
        char[] cArray5 = g.Code(91);
        while (n4 < cArray5.length || n < cArray4.length) {
            cArray3[n3++] = n == cArray4.length ? cArray5[n4++] : (n4 != cArray5.length && cArray5[n4] < cArray4[n] ? cArray5[n4++] : cArray4[n++]);
        }
        return cArray;
    }

    private static void c(int n, int n2) {
        aG <<= n2;
        aG |= n & (1 << n2) - 1;
        aF += n2;
        while (aF >= 8) {
            Code.write(aG >> (aF -= 8));
        }
    }

    private static void I(Vector vector, int n) {
        if (vector != null) {
            Object[] objectArray = g.Code(vector, n);
            boolean bl = vector == a;
            if (bl && (g.Code(objectArray, 9) & 2) != 0) {
                Code.Code((Integer)objectArray[10], true);
            }
            objectArray[1] = "";
            objectArray[0] = bl ? "www." : "";
            objectArray[2] = null;
            if (bl) {
                objectArray[10] = new Integer(0);
                objectArray[9] = new Integer(0);
            }
            if (g.Code(objectArray, 5) == 97) {
                if (!bl) {
                    vector.removeElementAt(n);
                } else {
                    objectArray[5] = new Integer(83);
                }
            } else if (vector == d) {
                vector.removeElementAt(n);
            } else {
                objectArray[5] = new Integer(82);
            }
            g.Code(vector, true);
        }
    }

    static void t() {
        int n;
        g.d[g.Code((int)0)] = -128;
        g.Code[g.Code((int)0)] = -128;
        g.d[g.Code((int)1)] = -128;
        g.Code[g.Code((int)1)] = -128;
        for (n = 0; n <= 14; ++n) {
            g.I(g.Code(0), Code.Code[n].getLabel());
            g.I(g.Code(1), Code.Code[n].getLabel());
        }
        for (n = 20; n <= 23; ++n) {
            g.I(g.Code(0), g.Code(n));
            g.I(g.Code(1), g.Code(n));
        }
        g.Code[6] = d[g.Code(0)];
        g.Code[7] = d[g.Code(1)];
        g.d[6] = d[g.Code(0)];
        g.d[7] = d[g.Code(1)];
        for (n = 0; n < 6; ++n) {
            g.d[n] = -128;
            g.Code[n] = -128;
            g.I(n, "\u00c5\u8ba4\u5343I[jg");
        }
        Code[6] = (byte)(Code[6] - d[g.Code(0)]);
        Code[7] = (byte)(Code[7] - d[g.Code(1)]);
        d[6] = (byte)(d[6] - d[g.Code(0)]);
        d[7] = (byte)(d[7] - d[g.Code(1)]);
    }

    static String Code(int n, String string) {
        return g.Code(g.Code(n), "%s", string);
    }

    static String Code(String string, String string2) {
        return g.Code(g.Code(g.Code(216), "%0", string), "%1", string2);
    }

    static void Code(StringBuffer stringBuffer, char c, char c2) {
        for (int i = 0; i < stringBuffer.length(); ++i) {
            if (stringBuffer.charAt(i) != c) continue;
            if (c2 == '\u0000') {
                stringBuffer.deleteCharAt(i);
                --i;
                continue;
            }
            stringBuffer.setCharAt(i, c2);
        }
    }

    static int Code(String string) {
        if (string != null && string.startsWith("o:")) {
            return string.charAt(2);
        }
        return -1;
    }

    static String I(int n) {
        return "o:" + (char)n;
    }

    static DataInputStream Code(int n) {
        DataInputStream dataInputStream;
        if ((n & 0x40) == 0) {
            g.v();
            dataInputStream = new DataInputStream(new ByteArrayInputStream(h));
        } else {
            dataInputStream = new DataInputStream(g.Code((n & 0x40) == 0 ? "/t" : "/v"));
        }
        g.Code(n, dataInputStream);
        return dataInputStream;
    }

    private static void I(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        g.Code(graphics, n, n2, n3, n4);
        g.Code(graphics, n, n2 + 5, n3, n4 - 10, n5);
        n5 = 20;
        for (int i = 0; i < 5; ++i) {
            n5 = n5 / 2 + 1;
            graphics.drawLine(n + (n5 >> 1), n2 + i, n + n3 - (n5 >> 1) - 1, n2 + i);
            graphics.drawLine(n + (n5 >> 1), n2 + n4 - i - 1, n + n3 - (n5 >> 1) - 1, n2 + n4 - i - 1);
        }
        g.Z(graphics);
    }

    static int Z(int n) {
        return g.J(n) + Code[n + 6] + d[n + 6];
    }

    static int J(int n) {
        if ((n = g.Code(n)) >= 6) {
            return Code;
        }
        return Code[n].getHeight() + Code[n] + d[n];
    }

    static String Code(int n, int n2, boolean bl) {
        String string = null;
        Object object = null;
        if (n == 42) {
            Object object2;
            if (n2 == 48) {
                string = "feed:start//" + System.currentTimeMillis();
                object = g.Code(34);
            }
            if (n2 == 42) {
                string = g.I(120);
                object = g.Code(51);
            } else if (n2 == 35) {
                if (ah) {
                    return null;
                }
                string = g.I(39);
                object = g.Code(176);
            } else if (n2 >= 49 && n2 <= 57 && (object2 = g.Code(a, n2 - 49)) != null && !g.Code((Object[])object2)) {
                string = "ext:" + object2[0];
                if (((String)(object2 = (object2 = (String)object2[1]) == null || ((String)object2).length() == 0 ? string : object2)).startsWith("http://")) {
                    object2 = ((String)object2).substring(7);
                } else if (((String)object2).startsWith("https://")) {
                    object2 = ((String)object2).substring(8);
                }
                if (((String)object2).startsWith("www.")) {
                    object2 = ((String)object2).substring(4);
                }
                object = object2;
            }
        } else if (n == 35) {
            int n3;
            String string2 = "";
            switch (n2) {
                case 49: {
                    n2 = 80;
                    n3 = 24;
                    break;
                }
                case 50: {
                    n2 = 90;
                    n3 = 7;
                    break;
                }
                case 51: {
                    n2 = 119;
                    n3 = 52;
                    break;
                }
                case 52: {
                    n2 = 65;
                    n3 = 42;
                    break;
                }
                case 53: {
                    n2 = 86;
                    n3 = 16;
                    break;
                }
                case 54: {
                    string2 = "nint:";
                    n2 = 77;
                    n3 = 49;
                    break;
                }
                case 55: {
                    string2 = "nint:dialog:";
                    n2 = 89;
                    n3 = 105;
                    break;
                }
                case 56: {
                    n2 = 73;
                    n3 = 9;
                    break;
                }
                case 57: {
                    n2 = 109;
                    n3 = 47;
                    break;
                }
                case 48: {
                    n2 = 83;
                    n3 = 5;
                    break;
                }
                case 35: {
                    n2 = 82;
                    n3 = 32;
                    break;
                }
                case 42: {
                    n2 = 127;
                    n3 = 141;
                    break;
                }
                default: {
                    return null;
                }
            }
            string = string2 + g.I(n2);
            object = g.Code(n3);
        }
        if (bl) {
            return object;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Image Code(byte[] byArray, int n, int n2, int n3, Object[] objectArray) {
        Image image = null;
        int n4 = 0;
        ++n4;
        while (true) {
            Object object;
            if (bg && n != 0) {
                try {
                    object = new byte[n2];
                    System.arraycopy(byArray, n, object, 0, n2);
                    byArray = object;
                    n = 0;
                }
                catch (Throwable throwable) {}
            } else {
                int n5;
                if (byArray[n] == 82 || byArray[n] == 67) {
                    try {
                        byte by = byArray[n + 1];
                        n5 = byArray[n + 2];
                        int[] nArray = new int[by * n5];
                        int n6 = n + 3;
                        if (byArray[n] == 82) {
                            for (int i = 0; i < by * n5; ++i, n6 += 4) {
                                nArray[i] = g.Z(byArray, n6);
                            }
                        } else {
                            byte[] byArray2 = new byte[by * n5 << 1];
                            g g2 = new g(byArray2, 0);
                            g2.Code(byArray, n + 3, n2 - 3);
                            g2.Code(null, 0, byArray2.length);
                            for (int i = 0; i < by * n5 << 1; ++i) {
                                int n7 = (byArray2[i] & 0xF0) >>> 4 | byArray2[i] & 0xF0;
                                int n8 = (byArray2[i] & 0xF) << 4 | byArray2[i] & 0xF;
                                int n9 = (byArray2[++i] & 0xF0) >>> 4 | byArray2[i] & 0xF0;
                                int n10 = (byArray2[i] & 0xF) << 4 | byArray2[i] & 0xF;
                                nArray[i >> 1] = (n7 << 24) + (n8 << 16) + (n9 << 8) + n10;
                            }
                        }
                        if (objectArray != null && objectArray.length == 3) {
                            objectArray[0] = nArray;
                            objectArray[1] = new Integer(by);
                            objectArray[2] = new Integer(n5);
                            return null;
                        }
                        return Image.createRGBImage((int[])nArray, (int)by, (int)n5, (boolean)true);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                }
                if (bb || byArray[n] == -119) {
                    image = Image.createImage((byte[])byArray, (int)n, (int)n2);
                    if (n3 != 256) {
                        if (w || s || af) {
                            return null;
                        }
                        int n11 = byArray[n] - -119;
                        image = g.Code(image, 0, (image.getHeight() * n3 << 8) + 65535 >> 16, ((n11 | -n11) >>> 31 ^ 1) != 0);
                    }
                } else {
                    object = new a();
                    if (n3 == 256) {
                        if (((a)object).Code(byArray, n, n2, 0, false) == 0 && ((a)object).Code != 0 && ((a)object).I != 0) {
                            image = Image.createRGBImage((int[])((a)object).Code, (int)((a)object).Code, (int)((a)object).I, (boolean)false);
                        }
                    } else {
                        if (af) {
                            return null;
                        }
                        n5 = 3;
                        while (256 >> n5 <= n3) {
                            --n5;
                        }
                        int n12 = ((a)object).Code(byArray, n, n2, n5, true);
                        if ((n12 & 0xFFFF0000) >> n5 + 16 != 0 && (n12 & 0xFFFF) >> n5 != 0) {
                            if (((a)object).Code(byArray, n, n2, n5, false) == 0) {
                                int n13 = (((a)object).Z * n3 << 8) + 65535 >> 16;
                                int[] nArray = g.Code(((a)object).Code, ((a)object).Code, ((a)object).I, n13, false);
                                image = Image.createRGBImage((int[])nArray, (int)(nArray.length / n13), (int)n13, (boolean)true);
                            }
                        } else {
                            return null;
                        }
                    }
                }
                if (image != null && image.getHeight() == 0) {
                    image = null;
                }
            }
            if (image != null || n4 >= 2) break;
            int n14 = n4 - 1;
            Code.I(((n14 | -n14) >>> 31) * 3);
            ++n4;
        }
        return image;
    }

    private static void I(int n, String string) {
        if (string.length() == 0) {
            return;
        }
        if (n >= 6) {
            return;
        }
        Font font = Code[n];
        int n2 = font.stringWidth(string);
        int n3 = font.charWidth(string.charAt(0));
        int n4 = font.getHeight() + 10;
        Image image = Image.createImage((int)n2, (int)n4);
        Graphics graphics = image.getGraphics();
        int[] nArray = new int[n2];
        g.Code(graphics, 0, 0, n2, n4, 0xFFFFFF);
        image.getRGB(nArray, 0, 1, 0, 0, 1, 1);
        int n5 = nArray[0];
        graphics.setColor(0);
        graphics.setFont(font);
        graphics.drawString(string, 0, 10, 0);
        int n6 = 0;
        int n7 = 0;
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n4 - 1; i >= 0; --i) {
            image.getRGB(nArray, 0, n2, 0, i, n2, 1);
            for (int j = 0; j < n2; ++j) {
                if (nArray[j] == n5) continue;
                if (!bl) {
                    bl = true;
                    n7 = i + 1 - n4;
                }
                bl2 = j >= n3;
                n6 = -i;
            }
        }
        if (bl2) {
            ++n6;
        }
        g.Code[n] = (byte)Math.max(Code[n], n6 + 10);
        g.d[n] = (byte)Math.max(d[n], n7);
    }

    static char[] Code(String string) {
        char[] cArray = new char[2];
        if (g.Code(string, "speeddial:")) {
            string = string.substring(12);
        }
        block0: for (int i = 0; i < 2; ++i) {
            char c = "#*".charAt(i);
            for (int j = 0; j < 12; ++j) {
                char c2 = "1234567890#*".charAt(j);
                String string2 = g.Code((int)c, (int)c2, false);
                if (string2 == null || !string2.equals(string) && !string2.equals("ext:" + string) && !string2.equals("nint:" + string) && (!string2.startsWith("feed:start") || !string.startsWith("feed:start"))) continue;
                cArray[0] = c;
                cArray[1] = c2;
                break block0;
            }
        }
        return cArray;
    }

    static int Code(int n) {
        return (g.Code((j << 1) + n, 0, k * -2 + 6) & 0xFFFFFFFE) + (n & 1);
    }

    static int I(int n) {
        return n - (j << 1);
    }

    static void Code(Graphics graphics, int n, char[] cArray, int n2, int n3, int n4, int n5) {
        if ((n = g.Code(n)) >= 6) {
            g g2 = g.Code(n);
            int n6 = n5;
            n = n4;
            int n7 = n3;
            char[] cArray2 = cArray;
            Graphics graphics2 = graphics;
            g g3 = g2;
            n7 = n2 + n7;
            g3.C(graphics2.getColor());
            while (n2 < n7) {
                n += g3.Code(graphics2, cArray2[n2], n, n6);
                ++n2;
            }
            return;
        }
        graphics.setFont(Code[n]);
        if (bf) {
            graphics.drawString(new String(cArray, n2, n3), n4, n5 + Code[n], 20);
            return;
        }
        graphics.drawChars(cArray, n2, n3, n4, n5 + Code[n], 20);
    }

    static void Code(Graphics graphics, int n, String string, int n2, int n3, int n4) {
        if ((n = g.Code(n)) >= 6) {
            g g2 = g.Code(n);
            int n5 = 0;
            n = n4;
            int n6 = n3;
            String string2 = string;
            Graphics graphics2 = graphics;
            g g3 = g2;
            int n7 = string2.length();
            if (n7 != 0) {
                if ((n & 1) != 0) {
                    n2 -= g3.I(string2) / 2;
                } else if ((n & 8) != 0) {
                    n2 -= g3.I(string2);
                }
                n = graphics2.getClipX();
                int n8 = graphics2.getClipY();
                int n9 = graphics2.getClipWidth();
                int n10 = graphics2.getClipHeight();
                g3.C(graphics2.getColor());
                int n11 = 0;
                while (n11 < n7) {
                    int n12 = g3.Code(graphics2, string2.charAt(n11), n2, n6);
                    if (n2 + n12 > n5) {
                        n5 = Math.max(n5, n);
                        graphics2.setClip(n5, n8, n9 + n - n5, n10);
                        n5 = Integer.MAX_VALUE;
                        --n11;
                        ++n11;
                        continue;
                    }
                    n2 += n12;
                    ++n11;
                }
                graphics2.setClip(n, n8, n9, n10);
            }
            return;
        }
        graphics.setFont(Code[n]);
        graphics.drawString(string, n2, n3 + Code[n], n4);
    }

    static void Code(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        int n7 = n5 >> 8 & 0xFF00;
        int n8 = n5 & 0xFF00;
        n5 = n5 << 8 & 0xFF00;
        int n9 = ((n6 >> 8 & 0xFF00) - n7) / n4;
        int n10 = ((n6 & 0xFF00) - n8) / n4;
        n6 = ((n6 << 8 & 0xFF00) - n5) / n4;
        n3 = n + n3 - 1;
        n4 = n2 + n4 - 1;
        while (n2 < n4) {
            graphics.setColor((n7 & 0xFF00) << 8 | n8 & 0xFF00 | n5 >> 8);
            graphics.drawLine(n, n2, n3, n2);
            n7 += n9;
            n8 += n10;
            n5 += n6;
            ++n2;
        }
    }

    private static void e(int n) {
        int n2 = Math.max(0, g.J(n - (j << 1)) - (Code[n].getBaselinePosition() > 0 ? Code[n].getBaselinePosition() : Code[n].getHeight() + d[n]) - Code[n]);
        n = g.J(n - (j << 1)) - n2;
        Code.write(n);
        Code.write(n2);
    }

    public static Image Code(Object[] objectArray, int[] nArray, int n) {
        if (objectArray.length != 3) {
            return null;
        }
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        objectArray = (int[])objectArray[0];
        int[] nArray2 = new int[n2 * n3];
        for (int i = 0; i < n3; ++i) {
            int n4 = g.Code(i + n + nArray.length - n3 - 1, 0, nArray.length - 1);
            int n5 = 0;
            while (n5 < n2) {
                int n6 = i * n2 + n5;
                reference var10_10 = (objectArray[n6] >>> 24) + true;
                int n7 = 0xFF0000;
                if (var10_10 > 4) {
                    for (int j = 0; j < 3; ++j) {
                        int n8 = n6;
                        nArray2[n8] = nArray2[n8] | var10_10 * (objectArray[n6] & n7) + (256 - var10_10) * (nArray[n4] & n7) >>> 8 & n7;
                        n7 >>= 8;
                    }
                    ++n5;
                    continue;
                }
                if (var10_10 > 252) {
                    nArray2[n6] = (int)objectArray[n6];
                    ++n5;
                    continue;
                }
                nArray2[n6] = nArray[n4];
                ++n5;
            }
        }
        return Image.createRGBImage((int[])nArray2, (int)n2, (int)n3, (boolean)false);
    }

    private static void Code(char[] cArray, int n) {
        for (int i = 0; i < cArray.length; ++i) {
            Code.write(Math.max(0, g.Code(n, cArray[i], false)));
        }
    }

    private static void b(int n, int n2) {
        aF = 0;
        aH = 4;
        aI = 1 << aH - 1;
        int n3 = 0;
        int n4 = Integer.MAX_VALUE;
        int n5 = 0;
        int[] nArray = new int[]{1, 31, 128, 159, 2143, 2303, 6830, 6911, 7296, 7375, 11098, 11263, 11826, 11903, 13312, 19903, 19904, 19967, 19968, 40907, 40908, 40959, 42648, 42751, 42922, 43001, 43823, 43967, 44032, 55215, 55296, 63743, 65536};
        int n6 = 0;
        while (n2 <= 65535) {
            int n7 = g.Code(n, (char)n2++, false);
            ++y;
            int n8 = n7 - n3;
            n3 = n7;
            n7 = Math.abs(n8);
            if (n8 == n4 && n2 - 1 != nArray[n6]) {
                ++n5;
                continue;
            }
            if (n5 > 0) {
                if (n5 < 4) {
                    for (int i = 0; i < n5; ++i) {
                        g.c(n4, aH);
                    }
                    n5 = 0;
                } else {
                    g.c(aI, aH);
                    if (n5 <= 1 << (aH << 1) - 1) {
                        g.c(n5, aH << 1);
                        n5 = 0;
                    } else {
                        g.c(2, aH << 1);
                        g.c(n5, 16);
                        n5 = 0;
                    }
                }
            }
            while (n7 >>> aH - 1 != 0) {
                g.c(aI, aH);
                g.c(1, aH << 1);
                aI = 1 << ++aH - 1;
            }
            g.c(n8, aH);
            if (n2 - 1 == nArray[n6]) {
                n8 = 0;
                g.c(0, aH);
                n5 = nArray[n6 + 1] - nArray[n6] - 1;
                n2 = nArray[n6 + 1] + 1;
                n6 += 2;
            }
            n4 = n8;
        }
        if (n5 > 0) {
            g.c(aI, aH);
            g.c(2, aH << 1);
            g.c(n5, 16);
        }
        g.c(aI, aH);
        g.c(3, aH << 1);
        if (aF != 0) {
            Code.write(aG << 8 - aF);
        }
    }

    static Image Code(Image image, int n, int n2, boolean bl) {
        n = image.getHeight() - n;
        int n3 = image.getWidth();
        int[] nArray = new int[n3 * n];
        image.getRGB(nArray, 0, n3, 0, 0, n3, n);
        int[] nArray2 = g.Code(nArray, n3, n, n2, bl);
        return Image.createRGBImage((int[])nArray2, (int)(nArray2.length / n2), (int)n2, (boolean)true);
    }

    static int[] Code(int[] nArray, int n, int n2, int n3, boolean bl) {
        int n4 = Math.max(1, n * n3 / n2);
        int n5 = (n2 << 8) / n3;
        int[] nArray2 = new int[n4 * n3];
        for (int i = 0; i < n3; ++i) {
            int n6 = Math.min(i * n5 / 256, n2);
            int n7 = i * n5 - (n6 << 8);
            for (int j = 0; j < n4; ++j) {
                int n8 = Math.min(j * n5 / 256, n);
                int n9 = n4 * i + j;
                int n10 = j * n5 - (n8 << 8);
                int n11 = Math.min(n8 + 1, n - 1);
                int n12 = Math.min(n6 + 1, n2 - 1);
                int n13 = nArray[n * n6 + n8];
                int n14 = nArray[n * n6 + n11];
                n8 = nArray[n * n12 + n8];
                n11 = nArray[n * n12 + n11];
                nArray2[n9] = 0;
                for (n12 = bl ? 24 : 16; n12 >= 0; n12 -= 8) {
                    int n15 = n9;
                    nArray2[n15] = nArray2[n15] + (((n13 >> n12 & 0xFF) * (255 - n10) * (255 - n7) + (n14 >> n12 & 0xFF) * n10 * (255 - n7) + (n8 >> n12 & 0xFF) * (255 - n10) * n7 + (n11 >> n12 & 0xFF) * n10 * n7) / 65025 << n12);
                }
                if (bl) continue;
                int n16 = n9;
                nArray2[n16] = nArray2[n16] | 0xFF000000;
            }
        }
        return nArray2;
    }

    static Image Code(Image image, int n, int n2, int n3, int n4, int n5) {
        if (bd) {
            return Image.createImage((Image)image, (int)n, (int)n2, (int)n3, (int)n4, (int)n5);
        }
        int[] nArray = new int[n3 * n4];
        image.getRGB(nArray, 0, n3, n, n2, n3, n4);
        if (n5 == 6) {
            int n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        if (!p) {
            for (int i = 0; i < nArray.length; ++i) {
                if (nArray[i] >>> 24 == 255) continue;
                int n7 = i;
                nArray[n7] = nArray[n7] & 0xFFFFFF;
            }
        }
        return Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)true);
    }

    static void Z(Graphics graphics) {
        if (br) {
            br = false;
            graphics.setClip(aJ, aK, aL, aM);
            return;
        }
        int[] nArray = (int[])Code.pop();
        graphics.setClip(nArray[0], nArray[1], nArray[2], nArray[3]);
    }

    static void Code(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        if (br) {
            int[] nArray = new int[4];
            int[] nArray2 = nArray;
            nArray[0] = aJ;
            nArray2[1] = aK;
            nArray2[2] = aL;
            nArray2[3] = aM;
            Code.push(nArray2);
        }
        br = true;
        aJ = graphics.getClipX();
        aK = graphics.getClipY();
        aL = graphics.getClipWidth();
        aM = graphics.getClipHeight();
        n3 = n;
        int n8 = n4;
        Graphics graphics2 = graphics;
        int n9 = graphics2.getClipX();
        if (g.Code(n3, n2, n = n3, n8, n9, n7 = graphics2.getClipY(), n6 = graphics2.getClipWidth(), n5 = graphics2.getClipHeight())) {
            graphics2.setClip(Math.max(n3, n9), Math.max(n2, n7), n3 < n9 ? (n3 + n > n9 + n6 ? n6 : n3 + n - n9) : (n9 + n6 > n3 + n ? n : n9 + n6 - n3), n2 < n7 ? (n2 + n8 > n7 + n5 ? n5 : n2 + n8 - n7) : (n7 + n5 > n2 + n8 ? n8 : n7 + n5 - n2));
            return;
        }
        graphics2.setClip(0, 0, 0, 0);
    }

    static void Code(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        graphics.setColor(n5);
        if (be) {
            g.Code(graphics, n, n2, n3, n4);
            n = graphics.getClipX();
            n2 = graphics.getClipY();
            n3 = graphics.getClipWidth();
            n4 = graphics.getClipHeight();
            if (n4 > 0 && n3 > 0) {
                graphics.fillRect(n, n2, n3, n4);
                graphics.drawLine(n, n2 + n4 - 1, n + n3 - 1, n2 + n4 - 1);
            }
            g.Z(graphics);
            return;
        }
        graphics.fillRect(n, n2, n3, n4);
    }

    static void Code(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6 = n5 >>> 24;
        if (n6 == 0) {
            return;
        }
        if (n6 >= 254) {
            g.Code(graphics, n, n2, n3, n4, n5);
            return;
        }
        if (!p) {
            return;
        }
        if (aN != n5 || aO != n6) {
            int n7;
            for (n7 = 0; n7 < c.length; ++n7) {
                g.c[n7] = n5;
            }
            if (x) {
                if (d == null || d.length != 64) {
                    d = new int[64];
                    for (n7 = 0; n7 < d.length; ++n7) {
                        g.d[n7] = -1;
                    }
                }
                Image.createRGBImage((int[])d, (int)8, (int)8, (boolean)false);
            }
            if (!w) {
                B = Image.createRGBImage((int[])c, (int)8, (int)8, (boolean)true);
            }
            aN = n5;
            aO = n6;
            if (bl) {
                e = new int[]{n6, n6, n6, n6, (n6 << 1) / 3, n6, n6, n6, n6, n6 / 3, n6, n6, n6, (n6 << 1) / 3, 0, n6, n6, (n6 << 1) / 3, 0, 0, (n6 << 1) / 3, n6 / 3, 0, 0, 0};
                for (n6 = 0; n6 < e.length; ++n6) {
                    g.e[n6] = n5 & 0xFFFFFF | e[n6] << 24;
                }
                if (w) {
                    h = new int[25];
                    f = new int[25];
                    g = new int[25];
                    n5 = 0;
                    for (n6 = 0; n6 < 5; ++n6) {
                        for (n7 = 0; n7 < 5; ++n7) {
                            g.h[n5] = e[(4 - n6) * 5 + (4 - n7)];
                            g.g[n5] = e[(4 - n6) * 5 + n7];
                            g.f[n5++] = e[n6 * 5 + (4 - n7)];
                        }
                    }
                } else {
                    C = Image.createRGBImage((int[])e, (int)5, (int)5, (boolean)true);
                }
            }
        }
        if (bl) {
            n3 -= 10;
            n += 5;
        }
        g.Code(graphics, n, n2, n3, n4);
        for (n5 = n; n5 < n + n3; n5 += 8) {
            n6 = n2;
            while (n6 < n2 + n4) {
                if (w) {
                    graphics.drawRGB(c, 0, 8, n5, n6, 8, 8, true);
                    n6 += 8;
                    continue;
                }
                graphics.drawImage(B, n5, n6, 20);
                n6 += 8;
            }
        }
        g.Z(graphics);
        if (bl) {
            g.Code(graphics, n -= 5, n2 += 5, n3 += 10, n4 -= 10);
            n5 = n2;
            while (n5 < n2 + n4) {
                if (w) {
                    graphics.drawRGB(c, 0, 8, n - 3, n5, 8, 8, true);
                    graphics.drawRGB(c, 0, 8, n + n3 - 5, n5, 8, 8, true);
                    n5 += 8;
                    continue;
                }
                graphics.drawImage(B, n - 3, n5, 20);
                graphics.drawImage(B, n + n3 - 5, n5, 20);
                n5 += 8;
            }
            g.Z(graphics);
            g.Code(graphics, n, n2 -= 5, n3, n4 += 10);
            if (w) {
                graphics.drawRGB(g, 0, 5, n + n3 - 5, n2, 5, 5, true);
                graphics.drawRGB(e, 0, 5, n + n3 - 5, n2 + n4 - 5, 5, 5, true);
                graphics.drawRGB(h, 0, 5, n, n2, 5, 5, true);
                graphics.drawRGB(f, 0, 5, n, n2 + n4 - 5, 5, 5, true);
            } else {
                graphics.drawRegion(C, 0, 0, 5, 5, 3, n, n2, 20);
                graphics.drawRegion(C, 0, 0, 5, 5, 6, n + n3 - 5, n2, 20);
                graphics.drawRegion(C, 0, 0, 5, 5, 5, n, n2 + n4 - 5, 20);
                graphics.drawRegion(C, 0, 0, 5, 5, 0, n + n3 - 5, n2 + n4 - 5, 20);
            }
            g.Z(graphics);
        }
    }

    public static void Code(InputStream inputStream) {
        try {
            inputStream.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static void Z(String string) {
        try {
            RecordStore.deleteRecordStore((String)string);
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
    }

    public static void Code(OutputStream outputStream) {
        try {
            outputStream.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void Code(Connection connection) {
        try {
            connection.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static String B(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(string.length());
        int n;
        while ((n = string.indexOf(37)) >= 0) {
            stringBuffer.append(string.substring(0, n)).append((char)Integer.parseInt(string.substring(n + 1, n + 3), 16));
            string = string.substring(n + 3, string.length());
        }
        return stringBuffer.append(string).toString();
    }

    private static byte[] Code(String string) {
        byte[] byArray = new byte[string.length() / 2];
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)Integer.parseInt(string.substring(i << 1, (i << 1) + 2), 16);
        }
        return byArray;
    }

    private static byte[] Code(int[] nArray) {
        byte[] byArray = new byte[nArray.length << 2];
        int n = byArray.length;
        while (--n >= 0) {
            byArray[n] = (byte)(nArray[n / 4] >> 8 * (3 - n % 4));
        }
        return byArray;
    }

    private static synchronized Vector Code(String string) {
        RecordStore recordStore = null;
        Vector<byte[]> vector = new Vector<byte[]>();
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            recordStore.getSizeAvailable();
            if ("s".equals(string)) {
                string = recordStore.enumerateRecords(null, null, false);
                int n = -1;
                int n2 = string.numRecords();
                for (int i = 0; i < n2; ++i) {
                    int n3 = string.nextRecordId();
                    n = Math.max(n, n3);
                }
                vector.addElement(recordStore.getRecord(n));
            } else {
                int n = recordStore.getNumRecords();
                int n4 = 1;
                while (n4 <= n) {
                    try {
                        byte[] byArray = recordStore.getRecord(n4);
                        vector.addElement(byArray);
                        ++n4;
                    }
                    catch (RecordStoreException recordStoreException) {
                        ++n4;
                    }
                }
            }
        }
        catch (Throwable throwable) {}
        try {
            recordStore.closeRecordStore();
            return vector;
        }
        catch (Throwable throwable) {
            return vector;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static synchronized boolean Code(String string, byte[] object, Vector vector, boolean n) {
        boolean bl;
        RecordStore recordStore;
        block10: {
            void var2_7;
            recordStore = null;
            bl = true;
            try {
                int n2;
                if ("s".equals(string) && (!ba || n2 != 0)) {
                    recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                    int n3 = g.Code(recordStore, object);
                    RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
                    int n4 = recordEnumeration.numRecords();
                    for (n2 = 0; n2 < n4; ++n2) {
                        int n5 = recordEnumeration.nextRecordId();
                        if (n5 == n3) continue;
                        recordStore.deleteRecord(n5);
                    }
                    break block10;
                }
                try {
                    RecordStore.deleteRecordStore((String)string);
                }
                catch (RecordStoreException recordStoreException) {}
                recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
                if (object != null) {
                    g.Code(recordStore, object);
                    break block10;
                }
                if (var2_7 == null) break block10;
            }
            catch (Throwable throwable) {
                bl = false;
                break block10;
            }
            for (int i = 0; i < var2_7.size(); ++i) {
                byte[] byArray = (byte[])var2_7.elementAt(i);
                g.Code(recordStore, byArray);
            }
        }
        try {
            recordStore.closeRecordStore();
            return bl;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Loose catch block
     */
    static void Code(int n, String string) {
        RecordStore recordStore = null;
        recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
        recordStore.deleteRecord(n);
        {
            catch (Throwable throwable) {
                recordStore.closeRecordStore();
                return;
            }
        }
        try {
            recordStore.closeRecordStore();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static byte[] Code(int n, String string) {
        byte[] byArray;
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            byArray = recordStore.getRecord(n);
        }
        catch (Throwable throwable) {
            try {
                recordStore.closeRecordStore();
                return null;
            }
            catch (Throwable throwable2) {
                return null;
            }
        }
        try {
            recordStore.closeRecordStore();
            return byArray;
        }
        catch (Throwable throwable) {
            return byArray;
        }
    }

    static void v() {
        if (h == null) {
            Object object;
            byte[] byArray;
            block5: {
                byArray = g.Code(1, "r");
                if (byArray == null) {
                    return;
                }
                g g2 = new g('\u0000');
                g2.I(byArray, 0, byArray.length);
                object = new byte[32];
                g2.Code((byte[])object);
                if (g.I((byte[])object, g.Code(70))) break block5;
                try {
                    RecordStore.deleteRecordStore((String)"r");
                    return;
                }
                catch (Throwable | RecordStoreException throwable) {
                    return;
                }
            }
            int n = g.I(byArray, 0);
            h = new byte[n];
            g g3 = new g(h, 0);
            object = g3;
            g3.Code(byArray, 2, byArray.length - 2);
            super.Code(null, 0, n);
            aG = true;
        }
    }

    private static int Code(int n, DataInputStream dataInputStream) {
        g.Code((InputStream)dataInputStream, (long)(4 * (n & 0x3F)));
        n = dataInputStream.readInt();
        int n2 = dataInputStream.readInt() + 4 - n;
        g.Code((InputStream)dataInputStream, (long)n);
        return n2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static synchronized int Code(int n, byte[] byArray, String string, boolean bl) {
        if (bl) {
            try {
                RecordStore.deleteRecordStore((String)string);
            }
            catch (RecordStoreException recordStoreException) {}
        }
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            if (n == -1) {
                n = g.Code(recordStore, byArray);
                try {
                    recordStore.closeRecordStore();
                    return n;
                }
                catch (Throwable throwable) {
                    return n;
                }
            }
            string = recordStore;
            byArray = g.Code(byArray);
            string.setRecord(n, byArray, 0, byArray.length);
        }
        catch (Throwable throwable) {
            try {
                recordStore.closeRecordStore();
                return -1;
            }
            catch (Throwable throwable2) {
                return -1;
            }
        }
        {
            recordStore.closeRecordStore();
            return n;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static byte[] Code(int var0) {
        block9: {
            var1_3 = null;
            if ((var0 & 64) != 0) ** GOTO lbl13
            try {
                g.v();
                var0 = 4 * (var0 & 63);
                var2_4 = g.Z(g.h, var0);
                var3_6 = g.Z(g.h, var0 + 4) + 4 - var2_4;
                var4_7 = new byte[var3_6];
                System.arraycopy(g.h, var0 + var2_4 + 8, var4_7, 0, var3_6);
                var0_1 = var4_7;
                v0 = null;
                break block9;
lbl13:
                // 1 sources

                var1_3 = new DataInputStream(g.Code((var0 & 64) == 0 ? "/t" : "/v"));
                var0 = g.Code(var0, (DataInputStream)var1_3);
                var2_5 = new byte[var0];
                var1_3.readFully(var2_5, 0, var0);
                var0_1 = var2_5;
                v0 = var1_3;
            }
            catch (Exception v1) {
                try {
                    var1_3.close();
                    return null;
                }
                catch (Throwable v2) {
                    return null;
                }
            }
            catch (Throwable var0_2) {
                try {
                    var1_3.close();
                    throw var0_2;
                }
                catch (Throwable v3) {}
                throw var0_2;
            }
        }
        try {
            v0.close();
            return var0_1;
        }
        catch (Throwable v4) {
            return var0_1;
        }
    }

    static boolean B() {
        if (bt) {
            return bs;
        }
        if (B == null) {
            g.R();
        }
        String[] stringArray = new String[]{"ar", "dv", "ha", "he", "fa", "ps", "ur", "yi"};
        String string = n.toLowerCase();
        if (string.length() >= 2) {
            for (int i = 0; i < stringArray.length; ++i) {
                if (stringArray[i].compareTo(string.substring(0, 2)) != 0) continue;
                bs = true;
                break;
            }
        }
        bt = true;
        return bs;
    }

    private static synchronized void I(byte[] byArray) {
        I.I(byArray, 0, byArray.length);
    }

    static synchronized g Code(byte[] byArray) {
        g.J(aP++);
        I.Code(byArray);
        I.I(byArray, 0, 32);
        g g2 = new g(0);
        g2.I(byArray, 0);
        byte[] byArray2 = b;
        g2.Z(byArray2, byArray2.length);
        g2.J(byArray, 0);
        return g2;
    }

    private static synchronized void Code(int n, DataInputStream dataInputStream, boolean bl) {
        g[] gArray;
        int n2;
        g.T();
        g g2 = null;
        int n3 = dataInputStream.readUnsignedByte();
        g[] gArray2 = new g[n3];
        for (int i = 0; i < n3; ++i) {
            n2 = dataInputStream.readUnsignedByte();
            int n4 = dataInputStream.readUnsignedByte();
            String string = dataInputStream.readUTF();
            int n5 = dataInputStream.readUnsignedShort();
            int n6 = dataInputStream.readUnsignedShort();
            String string2 = dataInputStream.readUTF();
            gArray2[i] = new g(n2, n4, string, n5, n6, string2, string);
            if (gArray2[i].G != 255) continue;
            g2 = gArray2[i];
        }
        n3 = dataInputStream.readUnsignedByte();
        if (bl) {
            gArray = new g[n3];
            n2 = 0;
        } else {
            g[] gArray3 = new g[n3 + 3];
            gArray = gArray3;
            gArray3[0] = m;
            gArray[n3 + 1] = l;
            gArray[n3 + 2] = k;
            n2 = 0;
        }
        while (n2 < n3) {
            gArray[n2 + (bl ^ 1)] = new g(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUnsignedShort(), dataInputStream.readUTF(), dataInputStream.readUnsignedByte());
            ++n2;
        }
        o = g2;
        I = gArray2;
        Code = gArray;
        A = n;
        return;
    }

    private static void T() {
        Code = new g[]{k, m, l};
        I = new g[0];
        o = null;
        A = 0;
    }

    private static g I(int n) {
        g g2;
        int n2;
        g[] gArray;
        int n3;
        int n4;
        String string;
        int n5;
        String string2;
        String string3;
        block7: {
            string3 = null;
            string2 = null;
            n5 = 0;
            string = null;
            n4 = 0;
            n3 = 0;
            g[] gArray2 = new g[3];
            gArray = gArray2;
            gArray2[0] = g.n;
            gArray[1] = o;
            for (n2 = 0; n2 < I.length; ++n2) {
                if (g.I[n2].G != n) continue;
                g2 = I[n2];
                break block7;
            }
            g2 = null;
        }
        gArray[2] = g2;
        n2 = 0;
        for (int i = 0; i < 3; ++i) {
            g g3 = gArray[i];
            if (g3 == null) continue;
            if (g3.o.length() != 0) {
                string2 = string3 = g3.o;
                n2 = i;
            }
            if (g3.e.length() != 0) {
                string = g3.e;
            }
            n5 = g3.L;
            n4 = g3.K;
            n3 = g3.Q;
        }
        if (n2 == 2) {
            string2 = g.a(string2);
        } else if (n != 0) {
            string3 = g.Code(string3, n);
        }
        return new g(n, n5, string3, n4, n3, string, string2);
    }

    private static g Z(int n) {
        return new g(n, g.n.L, g.Code(g.n.o, 1), g.n.K, g.n.Q, g.n.e, g.n.o);
    }
}
