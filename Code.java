/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lge.oem.virtualkeypad.VirtualKeypad
 *  com.lge.oem.virtualkeypad.VirtualKeypadListener
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.List
 *  javax.microedition.lcdui.Screen
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.lcdui.game.Sprite
 */
import com.lge.oem.virtualkeypad.VirtualKeypad;
import com.lge.oem.virtualkeypad.VirtualKeypadListener;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.game.Sprite;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class Code
extends Canvas
implements Runnable,
CommandListener {
    private int u;
    private int j;
    static Vector Code;
    private Image o;
    private int q;
    static byte[] Z;
    static boolean Code;
    static int a;
    private Image p;
    private int r;
    private int p;
    static Image C;
    private Image r = 0;
    static Code Code;
    private static f I;
    private int o;
    public static f Code;
    private static boolean e;
    private boolean d;
    public static String B;
    public static int Code;
    static boolean b;
    private int k = (int)System.currentTimeMillis();
    static Image d;
    static byte[] Code;
    static byte[] I;
    Object Code;
    static int[] Code;
    static boolean I;
    private Image l;
    static String Code;
    static String I;
    static int B;
    public static boolean Z;
    public static String Z;
    public static String J;
    public static int I;
    public static int Z;
    private String a;
    public static boolean J;
    public static boolean B;
    public static boolean C;
    public static boolean a;
    private Image[] Z;
    public static int J;
    static String C;
    static final Command[] Code;
    static int C;
    private boolean j = 0;
    private boolean f = false;
    private static int l;
    private static int m;
    private static int n;
    private static final int[] Z;
    private long Code;
    private static boolean h;
    private f Z;
    private boolean g;
    private f J;
    private static long I;
    private static long Z;
    int b;
    private TimerTask I;
    private static Vector Z;
    private boolean i;
    static int c;
    static int d;
    static int e;
    public static int f;
    public static int g;
    static int h;
    static int i;
    static Image e;
    private Image m;
    static C Code;
    static Image h;
    private Image n;
    private Image[] Code;
    private int[] J;
    private int[] B;
    private Image[] I;
    private int[] C;
    private int[] a = "";
    Image Code;
    private Image q = -1;
    private Image s;
    private int s;
    static Image Z;
    static byte[] J;
    int[] I;
    private int[] b;
    Timer Code;
    Image I;
    private Image t;
    static Image J;
    private static VirtualKeypad Code;
    static Image B;
    static boolean c;
    static Image a;
    private static Sprite Code;
    static Image b;
    static Image c;
    static Image f;
    static Image g;
    static Image i;
    static Image j;
    static Image k;
    private TimerTask Code;
    private static boolean k;
    private static boolean l;
    private static int t;
    private static Image u;
    private static Graphics Code;
    private static Graphics I;
    private static f B;
    private TextBox Code = new Timer();
    private static TextBox I;
    private static int v;
    static Vector I;

    static String Code(int n, boolean bl, Calendar calendar) {
        Calendar calendar2;
        Calendar calendar3 = calendar2 = calendar != null ? calendar : g.Code(false, bl);
        if (n < 0 || n > 23) {
            n = calendar2.get(11);
        }
        int n2 = calendar2.get(12);
        if (g.av) {
            return (n < 10 ? "0" : "") + n + ":" + (n2 < 10 ? "0" : "") + n2;
        }
        boolean bl2 = true;
        if (n >= 12) {
            bl2 = false;
            n -= 12;
        }
        return (n == 0 ? 12 : n) + ":" + (n2 < 10 ? "0" : "") + n2 + (bl2 ? " AM" : " PM");
    }

    public final void run() {
        this.setCommandListener(this);
        g.w();
        f = h = this.getWidth();
        g = i = this.getHeight();
        if (g.K) {
            f = i;
            g = h;
        }
        this.Code(g.K);
        int n = g.au;
        Code code = this;
        if (n != 0) {
            if (code.I == null) {
                code.I = new f(2);
                n = Calendar.getInstance().get(13);
                code.Code.scheduleAtFixedRate(code.I, (61 - n) * 1000, 60000L);
                code.i();
            }
        } else if (code.I != null) {
            code.I.cancel();
            code.I = null;
            code.c();
        }
        ++this.j;
        if (g.f < 0) {
            this.l = Image.createImage((int)80, (int)80);
            if (g.ag) {
                g.f = 3;
            } else {
                long l = System.currentTimeMillis() + 1000L;
                do {
                    this.l = g.Code(this.l, 0, 80 - (g.f << 1), true);
                } while (System.currentTimeMillis() < l && ++g.f < 10);
            }
            if (g.f < g.g) {
                g.af = true;
                g.aq = false;
            }
        }
        if (g.h < 0) {
            this.l = Image.createImage((int)h, (int)i);
            Graphics graphics = Image.createImage((int)h, (int)i).getGraphics();
            long l = System.currentTimeMillis() + 500L;
            do {
                ++g.h;
                graphics.drawImage(this.l, 0, 0, 20);
            } while (System.currentTimeMillis() < l);
            int n2 = 10;
            if (g.B == 0) {
                n2 = 87;
            }
            if (g.h < n2) {
                g.aq = false;
            }
        }
        this.repaint();
        this.serviceRepaints();
        Code code2 = this;
        int n3 = 4;
        int n4 = 3;
        int n5 = 2;
        int n6 = 6;
        int n7 = 8;
        switch (g.B) {
            case 3: {
                n4 = 2;
                break;
            }
            case 2: {
                n4 = 8;
            }
        }
        if (g.ad) {
            n7 = 1;
            n5 = 1;
            n6 = 1;
            n4 = 1;
            n3 = 8;
        }
        if (g.T) {
            n4 = 8;
        }
        Code.Code[0] = new Command(g.Code(28), 1, 1);
        Code.Code[1] = new Command(g.Code(43), 1, 1);
        Code.Code[2] = new Command(g.Code(70), 1, 1);
        Code.Code[10] = new Command(g.Code(1), n4, 10);
        Code.Code[3] = new Command(g.Code(3), n6, 20);
        Code.Code[15] = new Command(g.Code(6), 8, 20);
        Code.Code[18] = new Command(g.Code(106), 8, 20);
        Code.Code[11] = new Command(g.Code(19), n7, 20);
        Code.Code[17] = new Command(g.Code(5), 1, 20);
        Code.Code[12] = new Command(g.Code(4), n5, 10);
        Code.Code[14] = new Command(g.Code(10), 7, 10);
        Code.Code[4] = new Command(g.Code(4), n5, 10);
        Code.Code[5] = new Command(g.Code(11), n3, 1);
        Code.Code[6] = new Command(g.Code(12), n4, 10);
        Code.Code[8] = new Command(g.Code(62), 1, 1);
        Code.Code[9] = new Command(g.Code(0), n3, 1);
        Code.Code[7] = new Command(g.Code(17), 1, 1);
        Code.Code[16] = new Command(g.Code(66), 1, 10);
        Code.Code[13] = new Command(g.Code(104), 1, 1);
        Code.Code[19] = new Command(g.Code(108), 8, 20);
        Code.Code[20] = new Command(g.Code(21), 1, 1);
        Code.Code[21] = new Command(g.Code(109), 1, 1);
        Code.Code[22] = new Command(g.Code(135), 1, 1);
        Code.Code[37] = new Command(g.Code(35), 1, 1);
        Code.Code[38] = new Command(g.Code(3), n5, 1);
        Code.Code[27] = new Command(g.Code(174), 1, 1);
        Code.Code[28] = new Command("", 1, 1);
        Code.Code[29] = new Command(g.Code(15), n3, 1);
        Code.Code[24] = new Command(g.Code(142), 1, 1);
        Code.Code[25] = new Command(g.Code(28), 1, 1);
        Code.Code[26] = new Command(g.Code(14), n4, 10);
        Code.Code[36] = new Command(g.Code(160), n3, 1);
        if (Code[23] == null) {
            Code.Code[23] = new Command("", 2, 1);
        }
        B = 23;
        C = 23;
        a = 23;
        code2.Code = Code.Code();
        this.I();
        g.f();
        Z.addElement(new g(1, null));
        I = g.Code(true, "h1", 0);
        if (I == null) {
            I = new Vector(30);
        }
        g.p();
        g.j();
        if (g.Z > 200000L) {
            g.h = true;
        }
        if (g.Z < (long)((this.getWidth() * this.getHeight() << 2) + 50000)) {
            g.ah = true;
        }
        ++this.j;
        this.repaint();
        this.serviceRepaints();
        boolean bl = false;
        if (!g.aG) {
            bl = true;
            g.az = false;
            this.j();
            while (b) {
                g.Code(this, 0);
            }
            if (!g.aG) {
                this.d = true;
                this.repaint();
                return;
            }
        }
        g.i();
        this.Z();
        ++this.j;
        this.repaint();
        this.serviceRepaints();
        if (!bl) {
            this.j();
        }
        this.d = true;
        this.repaint();
        this.serviceRepaints();
        g.J(false);
    }

    final void Z(String string) {
        if (!(string = string.trim()).equals("www.") && string.length() > 0) {
            if (!g.aC) {
                if (Code.contains(string)) {
                    Code.removeElement(string);
                }
                if (Code.size() > 30) {
                    Code.removeElement(Code.firstElement());
                }
                Code.addElement(string);
            }
            if ("debug:".equals(string)) {
                e = true;
            }
            if (e && "opera:routing".equals(string)) {
                g.B = !g.B;
            }
            this.I("ext:" + string);
        }
    }

    final boolean I(g g2) {
        boolean bl = false;
        if (g2.Code(16)) {
            g2.Code.c();
        }
        if (Z.size() > 1) {
            g2.J = true;
            Z.removeElement(g2);
            this.b();
            bl = true;
        }
        this.repaint();
        f.J();
        return bl;
    }

    final void I(String string, String string2) {
        if (string2 == null || string2.trim().length() == 0) {
            return;
        }
        if (string.startsWith("http://")) {
            string2 = g.Code(string2, true);
        }
        this.I("ext:" + g.Code(string, "%s", string2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void Code(boolean bl) {
        if (bl != g.K) {
            g.K = bl;
            try {
                Code.I();
                Code.sizeChanged(-1, -1);
                this.k();
            }
            catch (Throwable throwable) {
                g.L = (bl && (!g.m || g.N)) ^ (g.M && h > 300) || g.O && h > i;
                throw throwable;
            }
        }
        if ((bl && (!g.m || g.N)) ^ (g.M && h > 300) || g.O && h > i) {
            g.L = true;
            return;
        }
        g.L = false;
    }

    final Image Code(int n) {
        if (this.I == null) {
            this.I = new Image[4];
            this.I[0] = g.Code(87);
            this.I[1] = g.Code(85);
            this.I[2] = g.Code(84);
            this.I[3] = g.Code(86);
        }
        return this.I[n];
    }

    static {
        Z = new byte[]{0};
        I = true;
        Z = "";
        J = "";
        B = "0";
        Code = 1;
        J = 3;
        Code = new Command[39];
        Z = new int[]{1, 6, 2, 5, 50, 52, 54, 56};
        int[] nArray = new int[]{54, 54, 55, 55, 52, 55, 50, 55, 50, 52, 51};
        I = -1L;
        Z = new Vector();
        c = 0;
        d = 0;
        e = 0;
        b = true;
        c = false;
        Code = new Vector();
    }

    static void Code(Integer n, boolean bl) {
        if (n != 0) {
            byte[] byArray = new byte[Z.length + 4];
            Code.Z[0] = (byte)((byArray.length - 1) / 4);
            System.arraycopy(Z, 0, byArray, 0, Z.length);
            g.I((int)n, byArray, byArray.length - 4);
            Z = byArray;
            Code = true;
            if (bl) {
                g.J(false);
            }
        }
    }

    private void l() {
        if (b) {
            return;
        }
        if (g.ad) {
            for (int i = 0; i < Code.length; ++i) {
                if (Code[i] == null || i == 23 || i == 28) continue;
                this.removeCommand(Code[i]);
                if (B != i && C != i && a != i) continue;
                if (i == 1) {
                    if (i == a) continue;
                    this.addCommand(Code[i]);
                    continue;
                }
                if (i == a) continue;
                this.addCommand(Code[i]);
            }
            l = B;
            m = C;
            n = a;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void I(int var0, int var1_1) {
        block12: {
            if (var0 < 2 && var0 >= 0) ** GOTO lbl27
            try {
                var2_4 = new Vector<E>();
                var3_7 = new Vector<E>();
                if (Code.I != null) {
                    for (var4_9 = Code.I.size() - 1; var4_9 >= 0; --var4_9) {
                        Code.Code(var0, var2_4, var3_7, (Object[])Code.I.elementAt(var4_9));
                    }
                }
                for (var4_9 = 0; var4_9 < Code.Z.size(); ++var4_9) {
                    var5_12 = (g)Code.Z.elementAt(var4_9);
                    for (var6_13 = var5_12.Code.size() - 1; var6_13 >= 0; --var6_13) {
                        Code.Code(var0, var2_4, var3_7, (Object[])var5_12.Code.elementAt(var6_13));
                    }
                }
                var0 = var3_7.size() - 1;
                while (var0 >= 0) {
                    var4_10 = (Object[])var3_7.elementAt(var0);
                    var5_12 = (B)var4_10[8];
                    if (var2_4.contains(var5_12)) {
                        var5_12.Code(2);
                        var4_10[8] = null;
                        --var0;
                        continue;
                    }
                    var5_12.Code(var1_1 + 1);
                    --var0;
                }
lbl27:
                // 2 sources

                var0 = Code.Z.size();
                while (var0-- > 0) {
                    ((g)Code.Z.elementAt(var0)).I(var1_1);
                }
                if (var1_1 <= 0) break block12;
                g.u();
            }
            catch (OutOfMemoryError v0) {
                for (var0 = 0; var0 < Code.I.size(); ++var0) {
                    var1_2 = (Object[])Code.I.elementAt(var0);
                    var2_5 = (B)var1_2[8];
                    if (var2_5 == null || var2_5.Code.Code == var2_5) continue;
                    var1_2[8] = null;
                }
                for (var0 = 0; var0 < Code.Z.size(); ++var0) {
                    var1_3 = (g)Code.Z.elementAt(var0);
                    for (var2_6 = 0; var2_6 < var1_3.Code.size(); ++var2_6) {
                        var3_8 = (Object[])var1_3.Code.elementAt(var2_6);
                        var4_11 = (B)var3_8[8];
                        if (var4_11 == null || var4_11.Code.Code == var4_11) continue;
                        var3_8[8] = null;
                    }
                }
            }
        }
        System.gc();
    }

    private static void Code(int n, Vector vector, Vector vector2, Object[] objectArray) {
        B b = (B)objectArray[8];
        if (b != null && !vector2.contains(objectArray) && b.Code.Code != b) {
            vector2.addElement(objectArray);
            if (!vector.contains(b)) {
                if (n < 0) {
                    for (n = 0; n < vector.size() && ((B)vector.elementAt((int)n)).Code <= b.Code; ++n) {
                    }
                    vector.insertElementAt(b, n);
                    if (vector.size() > 5) {
                        vector.removeElementAt(vector.size() - 1);
                        return;
                    }
                } else {
                    vector.addElement(b);
                }
            }
        }
    }

    static void Code(Object[] objectArray) {
        B b = (B)objectArray[8];
        if (b != null && !b.J) {
            for (int i = 0; i < I.size(); ++i) {
                if (!objectArray[0].equals(((Object[])I.elementAt(i))[0])) continue;
                I.removeElementAt(i);
                break;
            }
            if (I.size() >= 30) {
                I.removeElementAt(0);
            }
            I.addElement(objectArray);
        }
    }

    private void k() {
        g g2 = Code.Code(1);
        if (g2 != null && g2.Code != null) {
            if (g2.Code.Z) {
                if (g2.Code.B() != f) {
                    g2.Code = true;
                    g2.Z();
                    return;
                }
            } else if (g2.Code.B() > f && g.ak) {
                this.I("overlay:" + g.I(126));
            }
        }
    }

    private void j() {
        if (Code.C()) {
            g.Code();
            this.I(g.C);
            return;
        }
        this.I(g.I(65));
    }

    final void i() {
        this.a = Code.Code(-1, true, null);
    }

    static void Code(String string, String string2) {
        StringBuffer stringBuffer = new StringBuffer();
        g.Code(stringBuffer.append("a="), string);
        if (string2 != null) {
            g.Code(stringBuffer.append("&b="), string2);
        }
        Code.Code().Code("overlay:" + g.I(70), null, stringBuffer.toString());
    }

    static int Code(int n, int n2, int n3, int n4) {
        return Code.Code(n, n2, n3, n4, 160);
    }

    public final void Code(String string, boolean bl) {
        block15: {
            Object object;
            Code.destroyKeypad();
            Code = null;
            if (Code.Code().Code != null && Code.Code().Code.b != 97 && string.indexOf(10) != -1 || string.indexOf(8232) != -1 || string.indexOf(8233) != -1) {
                object = new StringBuffer(string);
                g.Code((StringBuffer)object, '\u2029', '\n');
                g.Code((StringBuffer)object, '\u2028', '\n');
                if (Code.Code().Code.b != 97) {
                    g.Code((StringBuffer)object, '\n', (bl ^ 1) << 5);
                }
                string = ((StringBuffer)object).toString();
            }
            if (Code.Code().Code(16)) {
                Code.Code().Code(string);
            } else if (g.Code(Code.Code().Code.Code) == 109) {
                this.I((String)g.Code(g.c, g.m)[0], string);
            } else if (Code.Code().J == 127) {
                try {
                    object = Code.Code().Code;
                    g g2 = Code.Code();
                    if (((B)object).Code(string) == 0) {
                        g2.Code("overlay:" + g.I(46), null, null);
                        break block15;
                    }
                    ((B)object).h();
                    g2.Z = true;
                    ((B)object).Z = ((B)object).Code;
                    ((B)object).J = ((B)object).I;
                    ((B)object).Code = 24;
                    ((B)object).I = 3;
                }
                catch (Throwable throwable) {}
            } else if (g.Code(Code.Code().Code.Code) == 60) {
                if (string.length() > 0) {
                    object = new f(35);
                    new f(35).I = string;
                    ((f)object).Code = Code.Code();
                    g.Code((Runnable)object);
                }
            } else if (!Code.Code().Code.Code(string, false)) {
                this.Z(string);
            }
        }
        this.repaint();
    }

    Code() {
    }

    static void C() {
        if (!Code) {
            Z = new byte[]{0};
        }
    }

    private static void Code(String string, String string2, int n, int n2, boolean bl) {
        Code = new VirtualKeypad(string, string2, n, n2);
        Code.setVirtualKeypadListener((VirtualKeypadListener)new g(bl));
        Code.invokeKeypad();
    }

    final void e() {
        if (this.Code != null) {
            this.Code.cancel();
            this.Code = null;
        }
    }

    public final void Code() {
        Code = this;
        g.k();
        g.h();
        g.l();
        g.x();
        Code.J();
        if (!g.ay) {
            g.Z("eurls");
            g.Z("b");
            g.Z("se");
        }
        if (g.p != -1 && g.Code(g.p, "b") == null) {
            g.p = -1;
        }
        g.v();
        g.s();
        if (g.W) {
            try {
                Code = new C(0);
            }
            catch (Throwable throwable) {
                g.W = false;
            }
        }
        g.m();
        Code = g.Code + " hifi" + (g.I.length() > 0 ? " " : "") + g.I + (g.Z.length() > 0 ? " " : "") + g.Z + " v. 4.5.40307, 20150312";
        I = "Opera Mini/4.5.40307/hifi/" + g.I + "/" + g.Z;
        this.j = g.m;
        int n = g.l ^ 1;
        Font[] fontArray = new Font[6];
        g.Code = fontArray;
        fontArray[0] = Font.getFont((int)64, (int)0, (int)8);
        g.Code[1] = Font.getFont((int)64, (int)n, (int)8);
        g.Code[2] = Font.getFont((int)64, (int)0, (int)0);
        g.Code[3] = Font.getFont((int)64, (int)n, (int)0);
        g.Code[4] = Font.getFont((int)64, (int)0, (int)16);
        g.Code[5] = Font.getFont((int)64, (int)n, (int)16);
        if (!g.E && !g.ad) {
            this.setFullScreenMode(true);
        }
        Browser.Code.setCurrent((Displayable)this);
        new Thread(this).start();
    }

    private static void Code(Screen screen) {
        if (screen != null && g.s) {
            screen.addCommand(Code[14]);
        }
    }

    private static String Code() {
        B b = Code.Code().Code;
        if (b != null) {
            return b.Code;
        }
        return "";
    }

    public final synchronized void commandAction(Command object, Displayable displayable) {
        if (this.f) {
            this.f = false;
            return;
        }
        if (object == Code[3] && Code.Code().Z) {
            Code.Code().Code.i();
            return;
        }
        if (g.S && object == Code[4] && this.o == -11) {
            this.f = true;
        }
        if (object == Code[14]) {
            Browser.Code();
            return;
        }
        if (this.b()) {
            return;
        }
        if (displayable == this) {
            this.I(Code.Code((Command)object));
            return;
        }
        Code code = this;
        if (object == Code[4] || object == Code[10]) {
            if (displayable instanceof List) {
                code = this.Code;
            }
        } else if (object == Code[9] || object == List.SELECT_COMMAND || object == Code[19]) {
            if (displayable instanceof List) {
                object = (List)displayable;
                int n = object.getSelectedIndex();
                if (n >= 0) {
                    this.Code.setString(object.getString(n));
                }
                code = this.Code;
            } else if (displayable instanceof TextBox) {
                block43: {
                    Object object2;
                    String string = ((TextBox)displayable).getString();
                    if (Code.Code().Code != null && Code.Code().Code.b != 97 && string.indexOf(10) != -1 || string.indexOf(8232) != -1 || string.indexOf(8233) != -1) {
                        object2 = new StringBuffer(string);
                        g.Code((StringBuffer)object2, '\u2029', '\n');
                        g.Code((StringBuffer)object2, '\u2028', '\n');
                        if (Code.Code().Code.b != 97) {
                            g.Code((StringBuffer)object2, '\n', displayable == this.Code ? (char)'\u0000' : ' ');
                        }
                        string = ((StringBuffer)object2).toString();
                    }
                    if (object == Code[19]) {
                        this.I(g.I(47));
                    } else if (Code.Code().Code(16)) {
                        Code.Code().Code(string);
                    } else if (g.Code(Code.Code().Code.Code) == 109) {
                        this.I((String)g.Code(g.c, g.m)[0], string);
                    } else if (Code.Code().J == 127) {
                        try {
                            object2 = Code.Code().Code;
                            object = Code.Code();
                            if (((B)object2).Code(string) == 0) {
                                ((g)object).Code("overlay:" + g.I(46), null, null);
                                break block43;
                            }
                            ((B)object2).h();
                            ((g)object).Z = true;
                            ((B)object2).Z = ((B)object2).Code;
                            ((B)object2).J = ((B)object2).I;
                            ((B)object2).Code = 24;
                            ((B)object2).I = 3;
                        }
                        catch (Throwable throwable) {}
                    } else if (g.Code(Code.Code().Code.Code) == 60) {
                        if (string.length() > 0) {
                            object2 = new f(35);
                            new f(35).I = string;
                            ((f)object2).Code = Code.Code();
                            g.Code((Runnable)object2);
                        }
                    } else if (!Code.Code().Code.Code(string, false)) {
                        this.Z(string);
                    }
                }
                if (g.z) {
                    object = new Alert(g.Code, g.Code(22), null, AlertType.INFO);
                    object.setTimeout(50);
                    Browser.Code.setCurrent((Alert)object, (Displayable)this);
                    code = null;
                }
            }
        } else {
            code = null;
            if (object == Code[15]) {
                this.n();
            } else if (object == Code[18]) {
                try {
                    object = Code.Code(1);
                    if (g.Code(((g)object).Code.Code) == -1) {
                        this.Code.setString(((g)object).Code.Code);
                    }
                }
                catch (Throwable throwable) {
                    this.Code.setString("www.");
                }
            } else if (object == Code[11] && this.Code != null && Browser.Code.getCurrent() == this.Code) {
                this.Code.setString("www.");
            }
        }
        if (g.y && code == this) {
            this.setFullScreenMode(true);
        }
        if (code != null) {
            Browser.Code.setCurrent((Displayable)code);
        }
    }

    private static boolean a() {
        g g2 = Code.Code();
        return g2 != null && g2.Code(16);
    }

    static boolean Code() {
        for (int i = 0; i < Z.size(); ++i) {
            if (((g)Code.Z.elementAt((int)i)).I == null) continue;
            return true;
        }
        return false;
    }

    private static boolean C() {
        return !g.az && g.C.length() > 0;
    }

    final void I() {
        Object object;
        g.t();
        c = Math.max(g.Z(0), g.Z(1)) + 3;
        d = Math.max(10, g.J(1)) + 3;
        if (g.m) {
            int n = g.J(0);
            B.c = Math.max(18, (n + 6) * 140 / 100) - n;
            c += (B.c &= 0xFFFFFFFE) - 2;
        }
        c = Math.max(c, c < 16 ? 14 : 18);
        Code = new int[72];
        this.I = new int[d];
        this.b = new int[c];
        Image image = null;
        if (!g.aB || g.aC) {
            object = g.Code(g.aC ? g.p : g.n, "b");
            if (object != null) {
                image = Image.createImage((byte[])object, (int)0, (int)((byte[])object).length);
            }
            if (image == null || image.getWidth() < 135) {
                image = null;
                g.aB = true;
            }
        }
        if (image == null) {
            image = g.Code(68);
        }
        if (image != null) {
            image.getRGB(Code, 0, Code.length, 0, 21, Code.length, 1);
            if (B.I == null) {
                Image[] imageArray = new Image[2];
                B.I = imageArray;
                imageArray[0] = g.Code(image, 124, 0, 11, 10, 0);
                B.I[1] = g.Code(image, 124, 10, 11, 10, 0);
                if (g.q) {
                    Z = g.Code(image, 103, 0, 10, 10, 0);
                    J = g.Code(image, 113, 0, 1, 10, 0);
                    B = g.Code(image, 114, 0, 10, 10, 0);
                    C = g.Code(image, 103, 10, 6, 1, 0);
                    a = g.Code(image, 118, 10, 6, 1, 0);
                    d = g.Code(image, 103, 11, 10, 10, 0);
                    c = g.Code(image, 113, 11, 1, 10, 0);
                    b = g.Code(image, 114, 11, 10, 10, 0);
                }
            }
            this.p = g.Code(Image.createImage((Image)image, (int)62, (int)0, (int)20, (int)22, (int)0), 1, d, false);
            this.q = g.Code(Image.createImage((Image)image, (int)82, (int)0, (int)20, (int)22, (int)0), 1, d, false);
            this.Code = g.Code(Image.createImage((Image)image, (int)42, (int)0, (int)20, (int)20, (int)0), 0, c - 1, false);
            object = g.Code(Image.createImage((Image)image, (int)102, (int)0, (int)1, (int)22, (int)0), 1, c, false);
            image = g.Code(Image.createImage((Image)image, (int)0, (int)0, (int)42, (int)22, (int)0), 1, d, false);
            Image.createImage((Image)image, (int)0, (int)0, (int)1, (int)d, (int)0).getRGB(this.I, 0, 1, 0, 0, 1, d);
            Image.createImage((Image)object, (int)0, (int)0, (int)1, (int)c, (int)0).getRGB(this.b, 0, 1, 0, 0, 1, c);
        }
        this.o = image;
        g.Code = Code;
        e = Math.min(16, d - 4);
        g.u();
        Code.m();
    }

    final void Z() {
        block9: {
            Object object = g.Code(8);
            Object[] objectArray = new Object[3];
            g.Code(object, 0, ((byte[])object).length, 256, objectArray);
            objectArray[0] = g.Code((int[])objectArray[0], Code[71]);
            if (c < 18) {
                objectArray[0] = g.Code((int[])objectArray[0], (int)((Integer)objectArray[1]), (int)((Integer)objectArray[2]), 12, true);
                objectArray[1] = new Integer(((int[])objectArray[0]).length / 12);
                objectArray[2] = new Integer(12);
            }
            this.r = Image.createRGBImage((int[])((int[])objectArray[0]), (int)((Integer)objectArray[1]), (int)((Integer)objectArray[2]), (boolean)true);
            this.s = (c - this.r.getHeight()) / 2 - 1;
            this.s = g.Code(objectArray, this.b, -this.s);
            if (e == null && g.q) {
                Image image = g.Code(2);
                object = image;
                if (image != null) {
                    e = g.Code((Image)object, 4, 0, 4, 4, 0);
                    f = g.Code((Image)object, 4, 4, 4, 1, 0);
                    g = g.Code((Image)object, 4, 5, 4, 4, 0);
                    h = g.Code((Image)object, 4, 4, 4, 1, 6);
                    i = g.Code((Image)object, 0, 5, 4, 4, 0);
                    j = g.Code((Image)object, 0, 4, 4, 1, 0);
                    k = g.Code((Image)object, 0, 0, 4, 4, 0);
                }
            }
            if (B.Code == null) {
                B.Code = new Image[6];
                if (g.r) {
                    int n = 0;
                    while (true) {
                        int n2 = ++n;
                        if (g.w || g.s ? n2 < 5 : n2 < 6) {
                            B.Code[n] = g.Code(n + 71);
                            continue;
                        }
                        break block9;
                        break;
                    }
                }
                for (int i = 0; i < 5; ++i) {
                    B.Code[i] = g.Code(i + 77);
                }
            }
        }
        if (J == null) {
            J = g.Code(3);
        }
    }

    static void J() {
        int n = 4 + (g.aF ^ 1) + (g.aD ^ 1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(n);
            dataOutputStream.writeByte(4);
            dataOutputStream.writeInt(g.q);
            dataOutputStream.writeByte(17);
            dataOutputStream.writeInt(g.A);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeInt(g.r);
            if (!g.aF) {
                dataOutputStream.writeByte(15);
                dataOutputStream.writeInt(g.w);
            }
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(g.s);
            if (!g.aD) {
                dataOutputStream.writeByte(35);
                dataOutputStream.writeInt(g.u);
            }
        }
        catch (IOException iOException) {}
        Code = byteArrayOutputStream.toByteArray();
    }

    static void B() {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Vector vector = g.a;
        int n2 = n = 0;
        Vector vector2 = vector;
        while (true) {
            try {
                if (n2 >= vector2.size()) break;
                Object[] objectArray = g.Code(vector, n);
                int n3 = g.Code(objectArray, 9);
                int n4 = n3 & 2;
                int n5 = n3 & 4;
                n3 = (n4 | -n4) >>> 31 << 6 | ((n5 | -n5) >>> 31) * 224 | (n3 & 1) << 7;
                dataOutputStream.writeByte((byte)(n + 1 | n3));
                if ((n3 & 0x40) != 0) {
                    dataOutputStream.writeInt(g.Code(objectArray, 10));
                }
                n2 = ++n;
                vector2 = vector;
                continue;
            }
            catch (IOException iOException) {}
            break;
        }
        I = byteArrayOutputStream.toByteArray();
        I = false;
    }

    static void Z(boolean bl) {
        if (I == null) {
            return;
        }
        if (bl && v > I.getMaxSize()) {
            Code.I("overlay:" + g.I(144));
            return;
        }
        Browser.Code.setCurrent((Displayable)I);
        if (!g.H) {
            g.H = true;
            g.J(false);
        }
    }

    final synchronized void Code(String string, String string2, String string3) {
        if (string != null) {
            String string4 = g.I(string);
            if (string4.equals(g.I(66))) {
                c = false;
            } else if (string4.startsWith("rtsp://") || string.startsWith("rtsp://")) {
                g.I(string.startsWith("rtsp://") ? string : string4);
                return;
            }
            if (!g.az && (string.equals(g.I(65)) || string.equals(g.B))) {
                g.az = true;
                g.J(false);
            }
            Code.Code().Code(string, string2, string3);
        }
    }

    final boolean Code(g g2) {
        if (g.y >= 0) {
            return false;
        }
        boolean bl = false;
        g g3;
        while ((g3 = (g)Z.elementAt(Z.size() - 1)) != g2) {
            this.I(g3);
            bl = true;
        }
        return bl;
    }

    private static int Code(int n, int n2) {
        if (g.K) {
            return n2;
        }
        return n;
    }

    private int I(int n) {
        if (Code.a() && g.Code(n, -1, false) != -1) {
            return n;
        }
        if (g.O && h > i) {
            if (n == -6) {
                return -7;
            }
            if (n == -7) {
                return -6;
            }
            if (this.J == null) {
                switch (n) {
                    case 50: {
                        return 52;
                    }
                    case 56: {
                        return 54;
                    }
                    case 52: {
                        return 56;
                    }
                    case 54: {
                        return 50;
                    }
                    default: {
                        return n;
                    }
                }
            }
        } else if (g.K) {
            switch (n) {
                case 1: {
                    return 2;
                }
                case 6: {
                    return 5;
                }
                case 2: {
                    return 6;
                }
                case 5: {
                    return 1;
                }
            }
            if (this.J == null) {
                switch (n) {
                    case 50: {
                        return 52;
                    }
                    case 56: {
                        return 54;
                    }
                    case 52: {
                        return 56;
                    }
                    case 54: {
                        return 50;
                    }
                }
            }
            if (!g.M || h <= 300) {
                if (n == -6) {
                    return -7;
                }
                if (n == -7) {
                    return -6;
                }
            }
        }
        return n;
    }

    protected final synchronized void sizeChanged(int n, int n2) {
        if (h == 0 || i == 0 || n == h && n2 == i) {
            return;
        }
        n = this.getWidth();
        n2 = this.getHeight();
        if (g.K) {
            f = n2;
            g = n;
        } else {
            g = n2;
            f = n;
        }
        h = n;
        i = n2;
        this.I = null;
        this.Code(g.K);
        for (n = 0; n < Z.size(); ++n) {
            g g2 = (g)Z.elementAt(n);
            if (g2.Code == null) continue;
            g2.Code.b();
        }
        Code.m();
        if (g.ai) {
            this.k();
        }
        if (u != null && (u.getWidth() != f || u.getHeight() != g)) {
            n = u.getWidth() * u.getHeight() << 1;
            if (Browser.Code.numColors() > 65536) {
                n <<= 1;
            }
            g.J -= (long)n;
            Code = null;
            u = null;
        }
        this.repaint();
    }

    private static String Code(Command command) {
        if (command == Code[0]) {
            return "menu:" + g.I(66);
        }
        if (command == Code[11]) {
            return "dialog:" + g.I(32);
        }
        if (command == Code[2]) {
            return "menu:" + g.I(68);
        }
        if (command == Code[4]) {
            return g.I(81);
        }
        if (command == Code[3]) {
            return g.I(110);
        }
        if (command == Code[9] || command == Code[36]) {
            return g.I(113);
        }
        if (command == Code[10]) {
            return g.I(114);
        }
        if (command == Code[1] || command == Code[29]) {
            return g.I(115);
        }
        if (command == Code[7]) {
            return g.I(116);
        }
        if (command == Code[5]) {
            return g.I(121);
        }
        if (command == Code[6]) {
            return g.I(122);
        }
        if (command == Code[12] || command == Code[38]) {
            return g.I(117);
        }
        if (command == Code[13]) {
            if (Code.Code().equals("myopera:terms")) {
                return "myopera:signup";
            }
            return g.B;
        }
        if (command == Code[20]) {
            return g.I(92);
        }
        if (command == Code[22]) {
            return g.I(96);
        }
        if (command == Code[8]) {
            return g.I(93);
        }
        if (command == Code[21]) {
            return g.I(94);
        }
        if (command == Code[17]) {
            return g.I(83);
        }
        if (command == Code[37]) {
            return "openno:" + C;
        }
        if (command == Code[27]) {
            return g.I(59);
        }
        if (command == Code[24]) {
            return g.I(51);
        }
        if (command == Code[25]) {
            return "menu:" + g.I(128);
        }
        if (command == Code[26]) {
            return g.I(132);
        }
        return null;
    }

    static boolean B() {
        return k;
    }

    private int Code(int n) {
        int n2;
        boolean bl = Code.a();
        if (bl && g.Code(n, -1, false) != -1) {
            return n;
        }
        int n3 = -7;
        if (g.K) {
            n3 = -6;
        }
        int n4 = n3;
        if (B == 2 || bl) {
            n3 = -8;
        }
        String string = null;
        try {
            string = this.getKeyName(n);
        }
        catch (Throwable throwable) {}
        if (g.i != null && (n2 = g.i.indexOf((char)n)) >= 0) {
            return g.j.charAt(n2);
        }
        if (g.B == 3) {
            if (n == -14) {
                return -6;
            }
            if (n == -13) {
                return -7;
            }
            if (n == -20 || n == -22) {
                return 0;
            }
            if (n == -11) {
                if (Code.Code().Code != null && Code.Code().Code.Code.equals(g.I(60))) {
                    return n;
                }
                return n4;
            }
        }
        if (string != null) {
            if ((string = string.toLowerCase()).equals("sk2(left)")) {
                return -6;
            }
            if (string.equals("sk1(right)")) {
                return -7;
            }
            if (g.U && n == -7) {
                return -6;
            }
            if (g.U && n == -6) {
                return -7;
            }
            if (n == 105) {
                return -6;
            }
            if (g.aj && n == 42 && string.equals("start")) {
                return 42;
            }
            if (n == -20 && string.equals("symbol")) {
                return -11;
            }
            if (string.indexOf("soft") >= 0) {
                if (string.charAt(string.length() - 1) == '1' || string.startsWith("left")) {
                    return -6;
                }
                if (string.charAt(string.length() - 1) == '2' || string.charAt(string.length() - 1) == '4' || string.startsWith("right")) {
                    return -7;
                }
            }
            if (string.equals("clear") || string.equals("backspace") || string.equals("back")) {
                return n3;
            }
            if (string.equals("select") || string.equals("ok") || string.equals("send") || string.equals("fire") || string.equals("navi-center") || string.equals("start") || string.equals("enter")) {
                return -5;
            }
            if (string.equals("up") || string.equals("navi-up") || string.equals("up arrow")) {
                return 1;
            }
            if (string.equals("down") || string.equals("navi-down") || string.equals("down arrow")) {
                return 6;
            }
            if (string.equals("left") || string.equals("navi-left") || string.equals("left arrow")) {
                return 2;
            }
            if (string.equals("right") || string.equals("navi-right") || string.equals("right arrow")) {
                return 5;
            }
            if (string.equals("sidedown") || string.equals("vol. down")) {
                return -10;
            }
            if (string.equals("sideup") || string.equals("vol. up")) {
                return -9;
            }
            if (string.equals("q") || string.equals("w")) {
                return -6;
            }
            if (string.equals("o") || string.equals("p")) {
                return -7;
            }
        }
        if (n == -11 && g.B == 0) {
            return 0;
        }
        if (n == -22 && g.B == 2) {
            return 0;
        }
        if (n == -6 || n == -21 || n == 21 || n == 65 || n == 66 || n == -202 || n == 113 || n == 57345) {
            return -6;
        }
        if (n == -7 || n == -22 || n == 22 || n == 67 || n == 68 || n == 106 || n == -203 || n == 112 || n == 57346) {
            return -7;
        }
        if (n == -5 || n == -10 || n == -20 || n == 20 || n == 23 || n == -14 || n == -26 || n == -200 || n == 13) {
            return -5;
        }
        if (n == -8 || n == -11 || n == -16 || n == -19 || n == -204) {
            return n3;
        }
        switch (n) {
            case 35: 
            case 42: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return n;
            }
        }
        try {
            int n5 = this.getGameAction(n);
            if (n5 != 0) {
                if (n5 == 8) {
                    return -5;
                }
                return n5;
            }
            return n;
        }
        catch (Throwable throwable) {
            return n;
        }
    }

    private static int I(int n, int n2) {
        if (g.K) {
            return h - n;
        }
        return n2;
    }

    private boolean b() {
        boolean bl = false;
        this.r = 0;
        if (this.J != null) {
            this.J.cancel();
            this.J = null;
        }
        if (Code.Code().Code(8) && Code.Code().Code.Code.equals(g.I(76))) {
            this.I(Code.Code());
            bl = true;
        }
        this.c();
        return bl;
    }

    final int Code() {
        return this.r;
    }

    private void Code(int n, int n2) {
        int n3;
        if (!this.d || b) {
            return;
        }
        this.Code((Graphics)null);
        this.j = false;
        if (B != null) {
            B.cancel();
            B = null;
        }
        if (g.B == 3 && n == -11) {
            this.commandAction(Code[4], (Displayable)this);
            return;
        }
        g g2 = Code.Code();
        if (g2 == null) {
            return;
        }
        g2.J = -1;
        if (g2.Code(1) || g2.Code(8) && n != 1 && n != 6 && n != 2 && n != 5) {
            n3 = this.r;
            if (n3 != 0) {
                if (g.az && !b) {
                    String string = g.Code(n3, n, false);
                    this.b();
                    this.I(string);
                }
                return;
            }
            if (n == 35 || n == 42) {
                if (g.az && !b && !this.Code((Graphics)null) && g2.Code(1) && g.Code(Code.Code()) != 73 && !Code.Code().startsWith("sk:")) {
                    this.r = n;
                    this.c();
                    Code code = this;
                    this.J = new f(4);
                    code.Code.schedule((TimerTask)code.J, 1500L);
                }
                return;
            }
        }
        if (n == -6) {
            if (g.ad) {
                return;
            }
            this.commandAction(Code[B], (Displayable)this);
        } else if (n == -7) {
            if (g.ad) {
                return;
            }
            this.commandAction(Code[C], (Displayable)this);
        } else if (n == -8 && g2.Code != null && g2.B() != -1) {
            n3 = g.Code(g2.Code.Code);
            int n4 = -1;
            switch (n3) {
                case 90: {
                    n4 = 99;
                    break;
                }
                case 91: {
                    n4 = 50;
                    break;
                }
                case 109: {
                    if (g2.B() > 0) {
                        n4 = 43;
                        break;
                    }
                    n4 = -1;
                    break;
                }
                case 136: {
                    n4 = 139;
                }
            }
            if (n4 != -1) {
                this.I("dialog:" + g.I(n4));
            }
        } else if (n == -5 && a > 0 && a != 23 && a != 29) {
            if (a == 28 && B >= 0) {
                this.commandAction(Code[B], (Displayable)this);
                return;
            }
            this.commandAction(Code[a], (Displayable)this);
            return;
        }
        g2.Code(n, n2);
        if (g.P) {
            f.Code();
            return;
        }
        this.repaint();
    }

    private static boolean Code(int n) {
        if (Code.a()) {
            return n != -5 && n != -6 && (n != -7 || C == 26);
        }
        return g.Code(Z, n);
    }

    final synchronized void a() {
        long l = System.currentTimeMillis();
        if (this.q >= 0 && l >= this.Code) {
            this.Code = l + 40L;
            this.g = true;
            Code.f();
            return;
        }
        if (l >= this.Code + 20000L) {
            this.Z.cancel();
            this.Z = null;
        }
    }

    protected final synchronized void keyRepeated(int n) {
        if (g.aH) {
            return;
        }
        if (this.Code != null) {
            return;
        }
        if (g.Q && Code.Code(this.I(this.Code(n)))) {
            this.g = true;
            Code.f();
        }
    }

    protected final synchronized void showNotify() {
        this.q = -1;
        this.repaint();
    }

    protected final synchronized void keyPressed(int n) {
        try {
            g.w();
            g.J(n);
            if (g.aH && !Code.Code(this.Code(n))) {
                return;
            }
            if (this.Code != null) {
                return;
            }
            if (g.V && n == -6 && I + 100L > System.currentTimeMillis()) {
                h = true;
                return;
            }
            if (g.B == -1 && n == this.o + 100) {
                this.getKeyName(n);
            }
            if (g.ae && n == 59440) {
                return;
            }
            this.o = n;
            if (n == -11 && g.B == 3) {
                g.R = true;
            }
            n = this.I(this.Code(n));
            this.q = -1;
            if (!g.R || Code.Code(n)) {
                this.Code(n, 0);
                if (Code.Code(n)) {
                    Code code = this;
                    this.p = n;
                    code.q = 0;
                    code.Code = System.currentTimeMillis() + (long)g.a;
                    if (!g.Q && code.Z == null) {
                        code.Z = new f(0);
                        code.Code.schedule((TimerTask)code.Z, 40L, 40L);
                    }
                }
            }
            return;
        }
        catch (Throwable throwable) {
            Code.I(2, 1);
            return;
        }
    }

    protected final synchronized void keyReleased(int n) {
        g.w();
        g.J(n);
        g.Z(8);
        if (g.aH && !Code.Code(this.Code(n))) {
            return;
        }
        if (this.Code != null) {
            return;
        }
        if (g.V) {
            I = -1L;
            if (n == -6) {
                if (h) {
                    h = false;
                    return;
                }
                I = System.currentTimeMillis();
            }
            h = false;
        }
        if (n != this.o) {
            return;
        }
        this.o = Integer.MAX_VALUE;
        this.q = -1;
        n = this.I(this.Code(n));
        if (g.R && !Code.Code(n)) {
            this.Code(n, 0);
            if (n == -11 && g.B == 3) {
                g.R = false;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean Code(Graphics var1_1) {
        block48: {
            block47: {
                block46: {
                    block45: {
                        block44: {
                            var2_2 = true;
                            var3_3 /* !! */  = 0;
                            var4_5 = 0;
                            var5_6 = new StringBuffer();
                            var6_7 = 0;
                            Code.B = 23;
                            Code.C = 23;
                            if (!g.aH) break block44;
                            var3_3 /* !! */  = 160;
                            var4_5 = g.z;
                            ** GOTO lbl72
                        }
                        if (g.y < 0) break block45;
                        var3_3 /* !! */  = g.x;
                        var4_5 = g.y;
                        var6_7 = 2;
                        ** GOTO lbl72
                    }
                    if (!g.W || g.Z < 0) break block46;
                    g.Code(173);
                    Code.C = 3;
                    var3_3 /* !! */  = g.I;
                    var4_5 = g.Z;
                    var7_8 = g.Code(172);
                    var5_6.append((String)var7_8).append(' ');
                    g.Code((StringBuffer)var5_6, (int)var4_5, var3_3 /* !! */ );
                    ** GOTO lbl72
                }
                if (Code.Code(1) == null) {
                    return false;
                }
                var7_8 = Code.Code(1).Code();
                if (var7_8 == null && Code.Code(4) != null) {
                    var7_8 = Code.Code(4).Code();
                }
                if (var7_8 == null || var7_8.a || var7_8 == null) break block47;
                var3_4 = Code.Code(8);
                if (var3_4 != null && var3_4.Code != null) {
                    Code.B = var3_4.Code.Code;
                    Code.C = var3_4.Code.I;
                } else if (var7_8.Z() && g.aw) {
                    Code.C = 38;
                } else {
                    Code.C = 3;
                    if (var7_8 != null && g.C.equals(var7_8.Code)) {
                        Code.C = 23;
                    }
                }
                var3_3 /* !! */  = var7_8.Code();
                var4_5 = var7_8.I();
                switch (var7_8.C) {
                    case 1: {
                        var5_6.append(g.Code(20));
                        var6_7 = 1;
                        ** GOTO lbl72
                    }
                    case 2: {
                        var5_6.append(g.Code(22));
                        var6_7 = 1;
                        ** GOTO lbl72
                    }
                    case 3: 
                    case 4: {
                        var5_6.append(g.Code(23));
                        var5_6.append(' ').append(var7_8.Z() / 1000).append("kB").append('/').append(var3_3 /* !! */  / 1000).append("kB");
                        ** GOTO lbl72
                    }
                    default: {
                        if (!g.ad) break block48;
                    }
                }
            }
            var2_2 = false;
            Code.Code().C();
lbl72:
            // 7 sources

            if (!g.ad) break block48;
            if (Code.B != Code.l || Code.C != Code.m || Code.a != Code.n) {
                this.l();
            }
            if (!var2_2) {
                return false;
            }
        }
        if (var1_1 == null) {
            return var2_2;
        }
        var7_9 = 0;
        var8_10 = 0;
        var9_11 = Code.g - Code.c;
        var10_12 = Code.f;
        if (!g.ad) {
            var1_1.setColor(Code.Code[27]);
            var1_1.drawLine(0, var9_11, var10_12 - 1, var9_11);
            for (var7_9 = 0; var7_9 < Code.c; ++var7_9) {
                var1_1.setColor(this.b[var7_9]);
                var1_1.drawLine(0, var9_11 + var7_9 + 1, var10_12 - 1, var9_11 + var7_9 + 1);
            }
            var11_13 = Code.Code[Code.B].getLabel();
            if (Code.B == 21 && Code.c()) {
                var11_13 = "";
            }
            var12_14 = Code.Code[Code.C].getLabel();
            var13_15 = Code.Code[Code.a].getLabel();
            if (g.L) {
                var11_13 = "";
            }
            var7_9 = g.Code(0, var11_13) + (Code.B == 23 || g.L != false ? 0 : 8);
            v0 = Code.C - 23;
            var8_10 = g.Code(0, var12_14) + ((v0 | -v0) >>> 31 << 3);
            v1 = Code.a - 23;
            var14_16 = g.Code(1, var13_15) + ((v1 | -v1) >>> 31 << 3);
            if (var7_9 >= (var10_12 - var14_16) / 2 || var8_10 >= (var10_12 - var14_16) / 2) {
                var11_13 = g.Code(0, var11_13, (var10_12 - var14_16) / 2 - 1, ".");
                var7_9 = g.Code(0, var11_13);
                var12_14 = g.Code(0, var12_14, (var10_12 - var14_16) / 2 - 1, ".");
                var8_10 = g.Code(0, var12_14);
            }
            v2 = var15_17 = Code.C == 12 || Code.C == 38 || Code.C == 3 && Code.Code().Code() != null && Code.Code().Code().Z() != false && g.aw != false;
            if (this.r != null) {
                var15_17 = this.r.getWidth() + 3 + var8_10 < (var10_12 - var14_16) / 2 - 1 ? var15_17 & true : false;
            }
            if (var15_17) {
                var8_10 += this.r.getWidth() + 2;
            }
            var1_1.setColor(Code.Code[1]);
            if (this.Code == Code.Code[Code.B] && Code.Code[Code.B] != Code.Code[23]) {
                g.Code(var1_1, 0, var9_11 + 2, var7_9, Code.c - 1, Code.Code[8], Code.Code[9]);
                var1_1.setColor(Code.Code[2]);
            }
            Code.Code(var1_1, 0, var11_13, 4, 20);
            var1_1.setColor(Code.Code[1]);
            if (this.Code == Code.Code[Code.C] && Code.Code[Code.C] != Code.Code[23]) {
                g.Code(var1_1, var10_12 - var8_10, var9_11 + 2, var8_10, Code.c - 1, Code.Code[8], Code.Code[9]);
                var1_1.setColor(Code.Code[2]);
                if (var15_17) {
                    var1_1.drawImage(this.r, var10_12 - var8_10 + 3, Code.g - this.r.getHeight() - this.s, 20);
                }
            } else if (var15_17) {
                var1_1.drawImage(this.s, var10_12 - var8_10 + 3, Code.g - this.r.getHeight() - this.s, 20);
            }
            Code.Code(var1_1, 0, var12_14, var10_12 - 4, 24);
            if (this.Code == Code.Code[Code.a] && Code.Code[Code.a] != Code.Code[23]) {
                g.Code(var1_1, var10_12 / 2 - var14_16 / 2, var9_11 + 2, var14_16, Code.c - 1, Code.Code[8], Code.Code[9]);
            }
            var1_1.setColor(Code.Code[1]);
            if (!g.L) {
                Code.Code(var1_1, 1, var13_15, 0 + var10_12 / 2, 17);
            }
        }
        if (var2_2) {
            Code.Code(var1_1, var7_9, Code.g - Code.c, Code.f - var8_10 - var7_9, Code.c, var4_5, var3_3 /* !! */ , (StringBuffer)var5_6, var6_7);
        } else if (Code.a == 23 && var7_9 + (var3_3 /* !! */  = g.Code(0, this.a)) / 2 + 1 < var10_12 / 2 && var8_10 + var3_3 /* !! */  / 2 + 1 < var10_12 / 2) {
            var3_3 /* !! */  = this.r;
            var4_5 = 32;
            if (g.an && var3_3 /* !! */  == 0 && (var5_6 = Code.Code().Code) != null && var5_6.Code() && (var5_6 = Code.Code().Code.Z()) != null) {
                var5_6 = g.Code((String)var5_6);
                if (!Code.Code().Code(2) || Code.c) {
                    var3_3 /* !! */  = (int)var5_6[0];
                    var4_5 = (char)var5_6[1];
                } else if (var5_6[0] != false && Code.B == null) {
                    Code.B = new f(24);
                    this.Code.schedule((TimerTask)Code.B, 1500L);
                }
            }
            if (var3_3 /* !! */  != 0) {
                var1_1.drawImage(this.Code, var10_12 / 2 - 1, var9_11 + 1, 24);
                var1_1.drawImage(this.Code, var10_12 / 2, var9_11 + 1, 20);
                var1_1.setColor(Code.Code[32]);
                if (g.B()) {
                    Code.Code(var1_1, 1, String.valueOf(var4_5), (var10_12 - this.Code.getWidth()) / 2 - 1, 17);
                    Code.Code(var1_1, 1, String.valueOf((char)var3_3 /* !! */ ), (var10_12 + this.Code.getWidth()) / 2, 17);
                } else {
                    Code.Code(var1_1, 1, String.valueOf((char)var3_3 /* !! */ ), (var10_12 - this.Code.getWidth()) / 2 - 1, 17);
                    Code.Code(var1_1, 1, String.valueOf(var4_5), (var10_12 + this.Code.getWidth()) / 2, 17);
                }
            } else {
                var1_1.setColor(Code.Code[1]);
                Code.Code(var1_1, 0, this.a, var10_12 / 2, 17);
            }
        }
        return var2_2;
    }

    private static void Code(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, StringBuffer stringBuffer, int n7) {
        String string;
        n5 = g.Code(n5, 0, n6);
        int n8 = n6 != 0 ? (int)((long)n3 * (long)n5 / (long)n6) : 0;
        g.Code(graphics, n, ++n2, n8, n4, Code[40], Code[41]);
        int n9 = n3 - n8;
        graphics.setColor(Code[51]);
        graphics.drawLine(n + n8, n2, n3 - 1, n2);
        if (n9 >= 2) {
            g.Code(graphics, n + n8, n2 + 1, n9, n4 - 1, Code[30], Code[31]);
        }
        if (n8 > 0) {
            g.Code(graphics, n + n8 - 1, n2 + 1, 1, n4 - 1, Code[48], Code[49]);
            graphics.setColor(Code[47]);
            graphics.drawLine(n, n2, n + n8 - 2, n2);
            graphics.setColor(Code[50]);
            graphics.drawLine(n + n8 - 1, n2, n + n8 - 1, n2);
            if (n9 > 0) {
                graphics.setColor(Code[51]);
                graphics.drawLine(n + n8, n2 + 1, n + n8, n2 + n4 - 2);
            }
        }
        graphics.setColor(Code[29]);
        if (n7 == 2) {
            stringBuffer.append(' ').append(n5 * 100 / Math.max(n6, 1)).append('%');
        }
        n2 = stringBuffer.length();
        n4 = g.Code(0, stringBuffer.toString());
        if (n7 == 1) {
            n5 = (int)(System.currentTimeMillis() - Z >> 9) & 3;
            stringBuffer.append("...".substring(0, n5));
        }
        if ((n3 - n4 >> 1) + (n6 = g.Code(0, string = stringBuffer.toString())) > n3) {
            stringBuffer.delete(0, n2);
            if (n7 != 1) {
                stringBuffer.insert(0, "...");
            }
            string = g.Code(0, string, n3, stringBuffer.toString());
            n4 = g.Code(0, string);
        }
        Code.Code(graphics, 0, string, n + n3 / 2 - n4 / 2, 20);
    }

    final void d() {
        if (this.Code == null) {
            Z = System.currentTimeMillis();
            this.Code = new f(1);
            this.Code.schedule(this.Code, 0L, 500L);
        }
    }

    private Object Code(int n, int n2) {
        int n3 = Z.size();
        while (n3-- > 0) {
            g g2 = (g)Z.elementAt(n3);
            if (!g2.Code(n, n2)) continue;
            return g2;
        }
        this.Code((Graphics)null);
        if (this.J() && (n2 > g - c || g.L && n2 < c)) {
            int n4;
            n3 = g.Code(1, Code[B].getLabel()) + 4;
            int n5 = n4 = C == 12 ? f - g.Code(1, Code[C].getLabel()) - this.r.getWidth() - 8 : f - g.Code(1, Code[C].getLabel()) - 4;
            if (n3 < f / 3) {
                n3 = f / 3;
            }
            if (n4 > f / 3 << 1) {
                n4 = f / 3 << 1;
            }
            if (g.L) {
                if (n > n4 && n2 > g - c) {
                    return Code[C];
                }
                if (n > f - n3 && n2 < c) {
                    return Code[B];
                }
            } else if (n2 > g - c) {
                if (n > n4) {
                    return Code[C];
                }
                if (n >= n3 && n <= n4) {
                    return Code[a];
                }
                if (n < n3) {
                    return Code[B];
                }
            }
        }
        return null;
    }

    protected final synchronized void pointerDragged(int n, int n2) {
        g.w();
        g.J(n);
        g.J(n2);
        g.Z(1);
        if (g.aH) {
            return;
        }
        int n3 = n;
        n = Code.Code(n, n2);
        n2 = Code.I(n3, n2);
        Object object = this.Code;
        boolean bl = object instanceof g;
        if (bl && (bl = ((g)object).aJ)) {
            bl = bl;
            if (bl && (bl = ((g)object).aI)) {
                bl = bl;
                if (bl) {
                    boolean bl2;
                    if (((g)object).g) {
                        bl2 = bl = false;
                    }
                    if (bl2) {
                        boolean bl3;
                        if (((g)object).f) {
                            bl3 = bl = false;
                        }
                        if (bl3) {
                            boolean bl4;
                            if (((g)object).e) {
                                bl4 = bl = false;
                            }
                            if (bl4 && (bl = ((g)object).d)) {
                                bl = ((g)object).c;
                            }
                        }
                    }
                }
            }
        }
        if (bl) {
            object = this.Code(n, n2);
            boolean bl5 = object instanceof g;
            if (bl5 && (bl5 = ((g)object).aJ)) {
                bl5 = bl5;
                if (bl5 && (bl5 = ((g)object).aI)) {
                    bl5 = bl5;
                    if (bl5) {
                        boolean bl6;
                        if (((g)object).g) {
                            bl6 = bl5 = false;
                        }
                        if (bl6) {
                            boolean bl7;
                            if (((g)object).f) {
                                bl7 = bl5 = false;
                            }
                            if (bl7) {
                                boolean bl8;
                                if (((g)object).e) {
                                    bl8 = bl5 = false;
                                }
                                if (bl8 && (bl5 = ((g)object).d)) {
                                    bl5 = ((g)object).c;
                                }
                            }
                        }
                    }
                }
            }
            if (bl5 && ((g)object).Code(2)) {
                this.Code = object;
            }
            ((g)this.Code).J(n, n2);
            return;
        }
        if (this.Code(n, n2) != this.Code) {
            this.Code = null;
            this.c();
        }
    }

    protected final synchronized void pointerReleased(int n, int n2) {
        g.w();
        g.J(n);
        g.J(n2);
        g.Z(1);
        if (g.aH) {
            return;
        }
        int n3 = n;
        int n4 = n2;
        n = Code.Code(n, n2);
        n2 = Code.I(n3, n2);
        this.pointerDragged(n3, n4);
        Object object = this.Code;
        boolean bl = object instanceof g;
        if (bl && (bl = ((g)object).aJ)) {
            bl = bl;
            if (bl && (bl = ((g)object).aI)) {
                bl = bl;
                if (bl) {
                    boolean bl2;
                    if (((g)object).g) {
                        bl2 = bl = false;
                    }
                    if (bl2) {
                        boolean bl3;
                        if (((g)object).f) {
                            bl3 = bl = false;
                        }
                        if (bl3) {
                            boolean bl4;
                            if (((g)object).e) {
                                bl4 = bl = false;
                            }
                            if (bl4 && (bl = ((g)object).d)) {
                                bl = ((g)object).c;
                            }
                        }
                    }
                }
            }
        }
        if (bl) {
            ((g)this.Code).Z(n, n2);
        } else if (this.Code(n, n2) == this.Code && this.Code instanceof Command) {
            this.commandAction((Command)this.Code, (Displayable)this);
            this.c();
        }
        this.Code = null;
    }

    protected final synchronized void pointerPressed(int n, int n2) {
        this.q = -1;
        this.j = true;
        ++this.b;
        g.w();
        g.J(n);
        g.J(n2);
        g.Z(1);
        if (g.aH) {
            return;
        }
        int n3 = n;
        int n4 = n2;
        n = Code.Code(n, n2);
        n2 = Code.I(n3, n2);
        this.Code = this.Code(n, n2);
        if (this.Code instanceof Command) {
            if (g.Code(Code.Code((Command)this.Code), "menu:")) {
                this.pointerReleased(n3, n4);
                this.Code = Code.Code();
            }
            this.c();
            return;
        }
        Object object = this.Code;
        boolean bl = object instanceof g;
        if (bl && (bl = ((g)object).aJ)) {
            bl = bl;
            if (bl && (bl = ((g)object).aI)) {
                bl = bl;
                if (bl) {
                    boolean bl2;
                    if (((g)object).g) {
                        bl2 = bl = false;
                    }
                    if (bl2) {
                        boolean bl3;
                        if (((g)object).f) {
                            bl3 = bl = false;
                        }
                        if (bl3) {
                            boolean bl4;
                            if (((g)object).e) {
                                bl4 = bl = false;
                            }
                            if (bl4 && (bl = ((g)object).d)) {
                                bl = ((g)object).c;
                            }
                        }
                    }
                }
            }
        }
        if (bl) {
            if (!this.Code((g)this.Code) || ((g)this.Code).Code(2)) {
                object = new f(49);
                new f(49).Code = this.b;
                this.Code.schedule((TimerTask)object, 1000L);
                ((g)this.Code).I(n, n2);
                return;
            }
            this.Code = null;
        }
    }

    static boolean Code(int n, boolean bl) {
        g g2 = Code.Code(g.I(n));
        if (g2 != null && (bl || g2.I == null)) {
            g2.Code = true;
            g2.Z();
            return true;
        }
        return false;
    }

    static void Code(String string) {
        Code.Code(g.Code(37), string);
    }

    static g Code(int n) {
        int n2 = Z.size();
        while (n2-- > 0) {
            g g2 = (g)Z.elementAt(n2);
            if (!g2.Code(n)) continue;
            return g2;
        }
        return null;
    }

    static g Code(String string) {
        int n = Z.size();
        while (n-- > 0) {
            g g2 = (g)Z.elementAt(n);
            if (g2.Code == null || !string.equals(g2.Code.Code)) continue;
            return g2;
        }
        return null;
    }

    static g Code() {
        if (Z.isEmpty()) {
            return null;
        }
        return (g)Z.lastElement();
    }

    static B Code() {
        return Code.Code().Code;
    }

    static boolean Code(B b) {
        return Code.Code().Code == b;
    }

    private static boolean c() {
        Object object = Code.Code(1);
        return object != null && ((g)object).Code != null && ((object = ((g)object).Code.J()) == null || !((String)object).startsWith("myopera:///b/g/"));
    }

    final void Code(String string, String string2, int n, g g2) {
        g g3 = new g(n, g2);
        Z.addElement(g3);
        g3.Code(string, null, string2);
        g3.I();
        if (g.P) {
            f.Code();
        } else {
            this.repaint();
        }
        f.J();
    }

    private static void m() {
        for (int i = 0; i < Z.size(); ++i) {
            ((g)Z.elementAt(i)).I();
        }
    }

    final boolean I() {
        return this.j || Code.Code().Code == null;
    }

    final void I(boolean bl) {
        this.j = bl;
    }

    final boolean Z() {
        return !g.G || g.L && this.J();
    }

    final boolean J() {
        return (!g.G || Code.a() || Z.size() > 0 && Code.Code().Code != null && (Code.Code().Code.Code > 0 || Code.Code().Code.I > 0)) && !g.ad || this.Code((Graphics)null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void paint(Graphics var1_1) {
        var2_4 = this;
        synchronized (var2_4) {
            var3_5 = this;
            if (var3_5.d && !Code.b) ** GOTO lbl66
            try {
                g.Code(var1_1, var1_1.getClipX(), var1_1.getClipY(), var1_1.getClipWidth(), var1_1.getClipHeight(), 0xFFFFFF);
                if (var3_5.m == null) {
                    if (g.s != 0 && g.t != -1) {
                        v0 = g.Code(g.t, "b");
                        var4_6 /* !! */  = (Image)v0;
                        if (v0 != null) {
                            var3_5.n = Image.createImage((byte[])var4_6 /* !! */ , (int)0, (int)((Image)var4_6 /* !! */ ).length);
                        }
                    } else {
                        var3_5.n = g.Code(83);
                    }
                    var3_5.m = g.Code(69);
                }
                if (var3_5.Code == null) {
                    var4_6 /* !! */  = g.Code(82);
                    var3_5.Code = new Image[4];
                    var3_5.Code[0] = Image.createImage((Image)var4_6 /* !! */ , (int)0, (int)0, (int)4, (int)8, (int)0);
                    var3_5.Code[1] = Image.createImage((Image)var4_6 /* !! */ , (int)5, (int)0, (int)4, (int)8, (int)0);
                    var3_5.Code[2] = Image.createImage((Image)var4_6 /* !! */ , (int)9, (int)0, (int)5, (int)8, (int)0);
                    var3_5.Code[3] = Image.createImage((Image)var4_6 /* !! */ , (int)15, (int)0, (int)5, (int)8, (int)0);
                    var3_5.J = new int[8];
                    var3_5.B = new int[8];
                    var4_6 /* !! */ .getRGB(var3_5.J, 0, 1, 4, 0, 1, 8);
                    var4_6 /* !! */ .getRGB(var3_5.B, 0, 1, 14, 0, 1, 8);
                }
                var4_7 = Code.i > 225 ? Code.i * 80 / 100 : Code.i - 45;
                var5_9 = Math.min(Code.h - 10, 180);
                var6_12 = var4_7 - 4;
                var7_13 = var4_7 - 4 - 15;
                var8_14 = g.Code[0].getHeight();
                var9_15 = var4_7 + 4;
                var8_14 = var9_15 + Math.min(15, (Code.i - var9_15 - var8_14) / 2);
                if (var3_5.m != null && var3_5.Code != null && var4_7 > 0) {
                    var4_7 = var7_13 - var3_5.m.getHeight();
                    if (var3_5.n != null) {
                        if (var3_5.n.getHeight() <= var4_7) {
                            var7_13 = g.Code(Code.i * 40 / 100 - var3_5.n.getHeight() / 2, 0, var4_7 - 15 - var3_5.n.getHeight());
                            var1_1.drawImage(var3_5.n, Code.h / 2, var7_13, 17);
                            var7_13 = var4_7 - var7_13 - var3_5.n.getHeight();
                            if (var7_13 < 15) {
                                var4_7 += (15 - var7_13) / 2;
                            }
                        } else {
                            g.Code(g.t, "b");
                            g.t = -1;
                            var3_5.n = null;
                        }
                    }
                    var1_1.drawImage(var3_5.m, Code.h / 2, var4_7, 17);
                    var4_7 = 1024;
                    var7_13 = 256 * (1 + var3_5.j);
                    if (Code.C()) {
                        var9_16 = new StringBuffer(g.Code(113));
                        var7_13 += ((int)System.currentTimeMillis() - var3_5.k << 10) / (60000 * Math.max(1, g.Code));
                        var4_7 += 1024;
                    } else {
                        var9_16 = new StringBuffer(g.Code(134));
                    }
                    var10_17 = (Code.h - var5_9) / 2;
                    var4_7 = var5_9 * var7_13 / var4_7;
                    var4_7 = Math.max(var3_5.u, var4_7);
                    Code.Code(var1_1, var10_17, var6_12, var5_9, var4_7, var3_5.Code, var3_5.J, var3_5.B);
                    var1_1.setColor(0);
                    var1_1.setFont(g.Code[0]);
                    var5_10 = var9_16.append("...").toString();
                    var1_1.drawString(var5_10, Code.h / 2, var8_14, 17);
                    var3_5.u = var4_7;
                }
                ** GOTO lbl132
lbl66:
                // 1 sources

                var3_5.m = null;
                var3_5.n = null;
                var3_5.Code = null;
                var3_5.J = null;
                var3_5.B = null;
                if (g.F || g.K) {
                    if (Code.u == null) {
                        var4_8 = Code.h * Code.i << 1;
                        if (Browser.Code.numColors() > 65536) {
                            var4_8 <<= 1;
                        }
                        if (g.K) {
                            Code.u = Image.createImage((int)Code.i, (int)Code.h);
                            Code.Code = new Sprite(Code.u);
                            Code.Code.setTransform(5);
                            Code.Code.setPosition(0, 0);
                        } else {
                            Code.u = Image.createImage((int)Code.h, (int)Code.i);
                        }
                        Code.Code = Code.u.getGraphics();
                        g.J += (long)var4_8;
                    }
                    Code.I = var1_1;
                    var1_1 = Code.Code;
                    var1_1.setClip(0, 0, Code.u.getWidth(), Code.u.getHeight());
                }
                Code.l = false;
                if (var3_5.g && var3_5.q >= 0) {
                    var3_5.Code(var3_5.p, ++var3_5.q);
                }
                var3_5.g = false;
                Code.t = (int)System.currentTimeMillis();
                for (var4_8 = 0; var4_8 < Code.f; var4_8 += var5_11) {
                    if (g.K) {
                        var5_11 = var4_8 == 0 && Code.f != Code.u.getWidth() ? Code.f % Code.u.getWidth() : Code.u.getWidth();
                        var1_1.translate(-var4_8 - var1_1.getTranslateX(), -var1_1.getTranslateY());
                        var1_1.setClip(-var1_1.getTranslateX(), 0, var5_11, Code.u.getHeight());
                    } else {
                        var5_11 = Code.f;
                    }
                    var3_5.Code(var1_1);
                    if (!g.F && !g.K) continue;
                    if (g.K) {
                        Code.I.setClip(0, 0, Code.h, Code.i);
                        Code.Code.setPosition(0, var4_8);
                        Code.Code.paint(Code.I);
                        continue;
                    }
                    Code.I.drawImage(Code.u, 0, 0, 20);
                }
                if (g.K) {
                    var1_2 = Code.I.getClipX() + Code.I.getClipWidth() - 1;
                    var4_8 = Code.I.getClipY() + Code.I.getClipHeight() - 1;
                    Code.I.drawLine(var1_2, var4_8, var1_2, var4_8);
                }
                if (Code.l) {
                    if (g.P) {
                        f.Code();
                    } else {
                        var3_5.repaint();
                    }
                } else if (Code.k) {
                    Code.k = false;
                    if (Code.I != null) {
                        Code.I.cancel();
                    }
                    Code.I = new f(48);
                    var3_5.Code.schedule((TimerTask)Code.I, 1100L);
                    f.I = false;
                    f.Code(Code.Code().Code);
                }
                ** GOTO lbl132
            }
            catch (Throwable v1) {
                Code.Code(2);
lbl132:
                // 5 sources

                return;
            }
        }
    }

    final void b() {
        g.G ^= true;
        Code.m();
        this.repaint();
    }

    protected final synchronized void hideNotify() {
        this.q = -1;
    }

    final void c() {
        if (g.A) {
            this.repaint();
            return;
        }
        int n = g - c;
        int n2 = f;
        int n3 = c;
        if (g.P) {
            f.Code();
            return;
        }
        if (!this.d || b) {
            this.repaint();
            return;
        }
        int n4 = Math.max(0, 0);
        int n5 = Math.max(n, 0);
        if (g.K) {
            this.repaint(n4, 0, n + n3 - n5, n2 - n4);
            return;
        }
        this.repaint(n4, n5, n2 - n4, n + n3 - n5);
    }

    static void f() {
        if (!k) {
            k = true;
            Code.repaint();
        }
        l = true;
    }

    private static void Code(Graphics graphics, int n, String string, int n2, int n3) {
        int n4 = g - c / 2 - 1 - (g.J(n) + g.Code[n + 6]) / 2;
        g.Code(graphics, n, string, n2, n4, n3);
    }

    static int Code(int n, int n2, int n3, int n4, int n5) {
        if (!g.aq && n5 == 160) {
            return n2;
        }
        n4 = Math.max(0, t - n4);
        if (n == n2 || n4 >= n5) {
            return n2;
        }
        k = true;
        l = true;
        if (n5 == 160) {
            return n3 + (int)((long)(n2 - n3) * (long)n4 * (long)(160 * (n4 + 160) - n4 * n4) / 4096000L);
        }
        long l = n5;
        long l2 = n5 - n4;
        long l3 = n2 - n3;
        return n2 - (int)(l3 * l2 * l2 / l / l);
    }

    final void Code(Graphics graphics, int n, int n2, int n3, int n4) {
        if (this.Z == null) {
            Image image = g.Code(88);
            this.Z = new Image[4];
            this.Z[0] = Image.createImage((Image)image, (int)0, (int)0, (int)3, (int)5, (int)0);
            this.Z[1] = Image.createImage((Image)image, (int)4, (int)0, (int)4, (int)5, (int)0);
            this.Z[2] = Image.createImage((Image)image, (int)8, (int)0, (int)3, (int)5, (int)0);
            this.Z[3] = Image.createImage((Image)image, (int)12, (int)0, (int)4, (int)5, (int)0);
            this.C = new int[5];
            this.a = new int[5];
            image.getRGB(this.C, 0, 1, 3, 0, 1, 5);
            image.getRGB(this.a, 0, 1, 11, 0, 1, 5);
        }
        Code.Code(graphics, n, n2, n3, n4, this.Z, this.C, this.a);
    }

    private static void Code(Graphics graphics, int n, int n2, int n3, int n4, Image[] imageArray, int[] nArray, int[] nArray2) {
        int n5;
        int n6;
        if (n4 != n3) {
            if (n4 - imageArray[2].getWidth() < 0) {
                graphics.drawImage(imageArray[2], n, n2, 0);
            }
            n6 = n + Math.max(n4, imageArray[2].getWidth());
            n5 = n + n3 - imageArray[3].getWidth();
            n6 = Math.min(n6, n5);
            for (int i = 0; i < nArray2.length; ++i) {
                graphics.setColor(nArray2[i]);
                graphics.drawLine(n6, n2 + i, n5, n2 + i);
            }
            graphics.drawImage(imageArray[3], n + n3 - imageArray[3].getWidth() + 1, n2, 0);
        }
        if (n4 >= imageArray[0].getWidth()) {
            graphics.drawImage(imageArray[0], n, n2, 0);
            int n7 = n + imageArray[0].getWidth();
            n6 = Math.min(n + n4, n + n3);
            for (n5 = 0; n5 < nArray.length; ++n5) {
                graphics.setColor(nArray[n5]);
                graphics.drawLine(n7, n2 + n5, n6, n2 + n5);
            }
            if (n4 > n3 - imageArray[1].getWidth()) {
                graphics.drawImage(imageArray[1], n + n3 - imageArray[1].getWidth() + 1, n2, 0);
            }
        }
    }

    private void Code(Graphics graphics) {
        String string;
        Object object;
        int n;
        if (this.i != this.J()) {
            this.i ^= true;
            Code.m();
        }
        int n2 = -1;
        int n3 = 0;
        Runnable runnable = null;
        g g2 = null;
        for (n = Z.size() - 1; n >= 0; --n) {
            object = (g)Z.elementAt(n);
            if (((g)object).Code(8)) {
                if (g2 != null) continue;
                g2 = object;
            }
            if (n2 < 0 && ((g)object).Code(21)) {
                n2 = n;
            }
            ((g)object).I(this.q >= 0);
            if (runnable != null && ((g)object).Code((g)runnable) && !((g)runnable).Z()) continue;
            n3 = n;
            runnable = object;
        }
        while (n3 < Z.size()) {
            runnable = (g)Z.elementAt(n3);
            if (!((g)runnable).Code(8) || runnable == g2) {
                ((g)runnable).Code(graphics);
            }
            if (n2 == n3) {
                int n4;
                Object object2;
                if (this.I == null) {
                    runnable = this;
                    n = f;
                    if (g.x) {
                        int n5 = n * 10;
                        object2 = new int[n5];
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2[n4] = -1;
                        }
                        Image.createRGBImage((int[])object2, (int)n, (int)10, (boolean)false);
                    }
                    object = new int[n * 3];
                    object2 = new int[n << 1];
                    for (n4 = 0; n4 < n; ++n4) {
                        object[n4] = -2113929216;
                        object[n4 + n] = 0x3D000000;
                        object[n4 + (n << 1)] = 0x12000000;
                        object2[n4] = 0x8000000;
                        object2[n4 + n] = 0x1A000000;
                    }
                    ((Code)runnable).I = Image.createRGBImage((int[])object, (int)n, (int)3, (boolean)true);
                    ((Code)runnable).t = Image.createRGBImage((int[])object2, (int)n, (int)2, (boolean)true);
                }
                if (this.i) {
                    if (graphics.getClipY() + graphics.getClipHeight() > g - c) {
                        this.Code(graphics);
                    }
                    if (graphics.getClipY() + graphics.getClipHeight() > g - c - 2 && g.p) {
                        graphics.drawImage(this.t, 0, g - c - 2, 20);
                    }
                }
                if (this.Z()) {
                    if (graphics.getClipY() < d) {
                        int n6;
                        runnable = graphics;
                        Object object3 = this;
                        object = null;
                        object2 = null;
                        n4 = 0;
                        int n7 = 2;
                        int n8 = 0;
                        B b = Code.Code((int)5).Code;
                        int n9 = f;
                        for (n6 = 0; n6 < d; ++n6) {
                            runnable.setColor(((Code)object3).I[n6]);
                            runnable.drawLine(0, n6, n9, n6);
                        }
                        if (g.L && !g.ad) {
                            String string2 = Code[B].getLabel();
                            if (B == 21 && Code.c()) {
                                string2 = "";
                            }
                            runnable.setColor(Code[1]);
                            g.Code((Graphics)runnable, 1, string2, n9 - 2, 1, 24);
                            n9 -= g.Code(1, string2) + 4;
                        }
                        if (b != null) {
                            object2 = b.I;
                            object = b.Code();
                            n8 = b.a;
                            if (object != null) {
                                n7 = 2 + (4 + e);
                            }
                        }
                        if (!g.K && g.B == 0) {
                            switch (object3.getHeight()) {
                                case 160: {
                                    n4 = 13;
                                    break;
                                }
                                case 208: {
                                    n4 = 17;
                                    break;
                                }
                                case 320: {
                                    n4 = 22;
                                    break;
                                }
                                case 416: {
                                    n4 = 28;
                                }
                            }
                        }
                        n7 += n4;
                        if (((Code)object3).o != null) {
                            n6 = runnable.getClipX();
                            int n10 = runnable.getClipY();
                            int n11 = runnable.getClipWidth();
                            g.Code((Graphics)runnable, n6, n10, n11, d);
                            if (!g.L) {
                                runnable.drawImage(((Code)object3).o, n9, 0, 24);
                                n9 -= ((Code)object3).o.getWidth();
                            }
                            if (n8 == 3) {
                                runnable.drawImage(((Code)object3).p, n9, (d - ((Code)object3).p.getHeight()) / 2, 24);
                                n9 -= ((Code)object3).p.getWidth();
                            }
                            g.Z((Graphics)runnable);
                        }
                        if (a || C) {
                            runnable.drawImage(((Code)object3).q, n9, (d - ((Code)object3).q.getHeight()) / 2, 24);
                            n9 -= ((Code)object3).q.getWidth();
                        }
                        if (object2 != null) {
                            int n12;
                            object3 = g.Code(1, (String)object2, n9 - n7, null);
                            runnable.setColor(Code[0]);
                            g.Code((Graphics)runnable, 1, (String)object3, n7, 1, 20);
                            if (g.Code(b.Code) != -1 && ((String)object3).equals(g.Code) && (n12 = ((String)object3).indexOf(32)) != -1) {
                                runnable.setColor(Code[39]);
                                g.Code((Graphics)runnable, 1, ((String)object3).substring(0, n12), n7, 1, 20);
                            }
                        }
                        if (object != null) {
                            runnable.drawImage((Image)object, n4 + 2, (d - e - 1) / 2, 20);
                        }
                    }
                    if (graphics.getClipY() < d + 3 && g.p) {
                        g g3;
                        runnable = Code.Code(16);
                        g g4 = g3 = runnable != null ? ((g)runnable).I() : null;
                        if (runnable != null && g3 != null && g3.Code != null && g.Code(g3.Code.Code) != 65) {
                            graphics.drawImage(this.I, f, d, 20);
                        } else {
                            graphics.drawImage(this.I, 0, d, 20);
                        }
                    }
                }
            }
            ++n3;
        }
        if (!this.I()) {
            Code.Code().I(graphics);
        }
        if ((string = g.I()) != null) {
            n3 = (f - g.Code(0, string)) / 2;
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 1, f, g.J(0));
            graphics.setColor(0);
            g.Code(graphics, 0, string, n3, 1, 20);
        }
    }

    /*
     * Unable to fully structure code
     */
    static void Code(String var0, String var1_1, int var2_2, boolean var3_3) {
        var4_4 = var1_1.length();
        var5_5 = Code.Code().Code;
        if (var5_5 != null) {
            var5_5.i();
        }
        var5_6 = Math.max(5524, var1_1.length());
        if (g.C > 0) {
            var5_6 = g.C;
        }
        while (var5_6 > 255) {
            if (var1_1.length() > var5_6) {
                var1_1 = var1_1.substring(0, var5_6);
            }
            if (var0 != null) ** GOTO lbl14
            try {
                var0 = g.Code(40);
lbl14:
                // 2 sources

                Code.Code(var0, var1_1, var5_6, var2_2, false);
                return;
            }
            catch (Throwable v0) {
                block10: {
                    try {
                        var1_1 = new TextBox("", var1_1, var5_6, var2_2);
                    }
                    catch (Throwable v1) {
                        break block10;
                    }
                    if (var0 == null) {
                        var0 = g.Code(40);
                    }
                    var1_1.setTitle(var0);
                    var1_1.addCommand(Code.Code[9]);
                    var1_1.addCommand(Code.Code[10]);
                    if (var3_3) {
                        var1_1.addCommand(Code.Code[19]);
                    }
                    Code.Code((Screen)var1_1);
                    Code.Code.f = g.t;
                    var1_1.setCommandListener((CommandListener)Code.Code);
                    Code.I = var1_1;
                    Code.v = var4_4;
                    Code.Z(true);
                    return;
                }
                var5_6 -= var5_6 / 10;
            }
        }
    }

    private void n() {
        if (g.y) {
            this.setFullScreenMode(false);
        }
        List list = new List(g.Code(6), 3);
        for (int i = Code.size() - 1; i >= 0; --i) {
            String string = (String)Code.elementAt(i);
            list.append(string, null);
        }
        list.setSelectCommand(Code[9]);
        list.addCommand(Code[4]);
        Code.Code((Screen)list);
        list.setCommandListener((CommandListener)this);
        Browser.Code.setCurrent((Displayable)list);
    }

    final void I(String string) {
        if ((g.C.equals(string) || g.Code(string) == 65) && g.p < 0) {
            this.Code("sk:///s/private?version=3", string, null);
            return;
        }
        this.Code(string, null, null);
    }

    final void J(String string) {
        try {
            Code.Code(g.Code(39), string != null ? string : "www.", 400, 524292, true);
            return;
        }
        catch (Throwable throwable) {
            try {
                Code.Code(g.Code(39), string != null ? string : "www.", 200, 0, true);
                return;
            }
            catch (Throwable throwable2) {
                if (g.y) {
                    this.setFullScreenMode(false);
                }
                if (g.u) {
                    this.Code = Code.Code();
                } else {
                    this.Code.removeCommand(Code[9]);
                    this.Code.removeCommand(Code[10]);
                    this.Code.removeCommand(Code[15]);
                    this.Code.removeCommand(Code[18]);
                    this.Code.removeCommand(Code[14]);
                    this.Code.removeCommand(Code[11]);
                }
                this.Code.addCommand(Code[9]);
                this.Code.addCommand(Code[10]);
                this.Code.addCommand(Code[11]);
                if (Code.size() > 0) {
                    this.Code.addCommand(Code[15]);
                }
                B b = Code.Code((int)1).Code;
                if (g.Code(b.Code) == -1 && !b.C) {
                    this.Code.addCommand(Code[18]);
                }
                Code.Code((Screen)this.Code);
                this.Code.setCommandListener((CommandListener)this);
                if (string == null) {
                    this.Code.setString("www.");
                } else {
                    this.Code.setString(string);
                }
                Browser.Code.setCurrent((Displayable)this.Code);
                return;
            }
        }
    }

    private static TextBox Code() {
        try {
            return new TextBox(g.Code(39), "www.", 400, 524292);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new TextBox(g.Code(39), "www.", 200, 0);
        }
    }

    static void I(int n) {
        Code.I(n - 1, n);
    }

    static void Code(int n) {
        Code.I(n, n - 1);
    }

    static void g() {
        for (int i = 0; i < I.size(); ++i) {
            ((Object[])Code.I.elementAt((int)i))[8] = null;
        }
        g g2 = (g)Z.firstElement();
        for (int i = 0; i < g2.Code.size(); ++i) {
            ((Object[])g2.Code.elementAt((int)i))[8] = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void h() {
        try {
            for (int i = 0; i < I.size(); ++i) {
                B b = (B)((Object[])I.elementAt(i))[8];
                if (b == null) continue;
                b.Code = null;
            }
            g g2 = (g)Z.firstElement();
            if (g2 != null && g2.Code != null) {
                for (int i = 0; i < g2.Code.size(); ++i) {
                    B b = (B)((Object[])g2.Code.elementAt(i))[8];
                    if (b == null) continue;
                    b.Code = null;
                }
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}
