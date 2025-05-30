/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemCommandListener
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.PlayerListener
 *  javax.microedition.media.control.RecordControl
 *  javax.microedition.media.control.VideoControl
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.RecordControl;
import javax.microedition.media.control.VideoControl;
import javax.microedition.media.control.VolumeControl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ap
extends bc
implements CommandListener,
ItemCommandListener,
PlayerListener {
    private static Object q;
    private Command a;
    private Command b;
    private Command c;
    private Command d;
    private Command e;
    private Command f;
    private Command g;
    private Command h;
    private String b;
    private String c;
    String a;
    private Form a;
    private ay a;
    public static Player a;
    public static VideoControl a;
    private VolumeControl a;
    private byte[] a;
    private String d;
    private String e;
    public Object a;
    public Object c;
    public Object d = null;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    private int a;
    private int b;
    private String f;
    private String k;
    private VideoControl b;
    private RecordControl a;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private ByteArrayOutputStream a = null;

    private ap() {
    }

    private ap(String string, byte[] byArray, String string2) {
        this.d = string;
        this.a = byArray;
        this.e = string2;
    }

    public final void a() {
        ap.x();
        this.a = null;
        this.b = null;
        this.a = null;
        this.a = null;
        a = null;
        this.a = null;
    }

    public static ap a(String object, byte[] byArray, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        object = new ap((String)object, byArray, string);
        ((bc)object).o("video");
        ((ap)object).h = (Command)bj.a(string2, 0);
        ((ap)object).i = bj.a(string3, 0);
        ((ap)object).a = new Form(string4);
        ((ap)object).a = new Command(string5, 8, 0);
        ((ap)object).c = new Command(string7, 8, 0);
        ((ap)object).d = new Command(string8, 8, 0);
        ((ap)object).b = new Command(string9, 8, 0);
        ((ap)object).e = new Command(string10, 2, 1);
        super.h();
        ((ap)object).a.setCommandListener((CommandListener)object);
        ((ap)object).b = string5;
        ((ap)object).c = string6;
        super.i();
        return object;
    }

    public static ap a(String object, byte[] byArray, String string) {
        object = new ap((String)object, byArray, string);
        ((bc)object).o("audio");
        super.i();
        return object;
    }

    private void g() {
        this.a.removeCommand(this.a);
        this.a.removeCommand(this.c);
        this.a.removeCommand(this.d);
        this.a.removeCommand(this.b);
        this.a.removeCommand(this.e);
    }

    private void h() {
        this.a.addCommand(this.a);
        this.a.addCommand(this.c);
        this.a.addCommand(this.d);
        this.a.addCommand(this.b);
        this.a.addCommand(this.e);
    }

    private void i() {
        try {
            a = this.a != null ? Manager.createPlayer((InputStream)new ByteArrayInputStream(this.a), (String)this.e) : (this.d.indexOf("local:") != -1 ? Manager.createPlayer((InputStream)this.getClass().getResourceAsStream(this.d.substring("local:".length())), (String)this.e) : (this.d.indexOf("cid:") != -1 ? Manager.createPlayer((InputStream)new ByteArrayInputStream((byte[])q.a(this.d.substring("cid:".length()))), (String)this.e) : Manager.createPlayer((String)this.d)));
            a.addPlayerListener((PlayerListener)this);
            a.realize();
            a.prefetch();
            this.e = a.getContentType();
            if ("video".equals(this.f()) && a == null) {
                try {
                    a = (VideoControl)a.getControl("VideoControl");
                    if (a != null) {
                        Item item = (Item)a.initDisplayMode(0, null);
                        item.setLayout(3);
                        if (this.h != false && this.i != false) {
                            a.setDisplaySize((int)this.h, (int)this.i);
                        }
                        this.a.append(item);
                        q.a().setCurrent((Displayable)this.a);
                    }
                }
                catch (Exception exception) {}
            }
            this.a = (VolumeControl)a.getControl("VolumeControl");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (string == "bufferingStarted") {
            if (this.a != null) {
                q.a(this, this.a);
                return;
            }
        } else if (string == "bufferingStopped") {
            if (this.c != null) {
                q.a(this, this.c);
                return;
            }
        } else if (string == "closed") {
            if (this.d != null) {
                q.a(this, this.d);
                return;
            }
        } else if (string == "durationUpdated") {
            if (this.e != null) {
                q.a(this, this.e);
                return;
            }
        } else if (string == "endOfMedia") {
            if (this.f != null) {
                q.a(this, this.f);
                return;
            }
        } else if (string == "error") {
            if (this.g != null) {
                q.a(this, this.g);
                return;
            }
        } else if (string == "recordError") {
            if (this.h != null) {
                q.a(this, this.h);
                return;
            }
        } else if (string == "recordStarted") {
            if (this.i != null) {
                q.a(this, this.i);
                return;
            }
        } else if (string == "recordStopped") {
            ap.a(0L);
            if (this.j != null) {
                q.a(this, this.j);
                return;
            }
        } else if (string == "sizeChanged") {
            if (this.k != null) {
                q.a(this, this.k);
                return;
            }
        } else if (string == "started") {
            if ("video".equals(this.f())) {
                this.g();
                this.a = new Command(this.c, 8, 0);
                this.h();
            }
            if (this.l != null) {
                q.a(this, this.l);
                return;
            }
        } else if (string == "stopped") {
            if ("video".equals(this.f())) {
                this.g();
                this.a = new Command(this.b, 8, 0);
                this.h();
            }
            if (this.m != null) {
                q.a(this, this.m);
                return;
            }
        } else if (string == "stoppedAtTime") {
            if (this.n != null) {
                q.a(this, this.n);
                return;
            }
        } else if (string == "volumeChanged") {
            if (this.o != null) {
                q.a(this, this.o);
                return;
            }
        } else if (string == "deviceAvailable" && this.p != null) {
            q.a(this, this.p);
        }
    }

    private static void j() {
        try {
            a.start();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void t() {
        try {
            a.stop();
            a.setMediaTime(0L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void u() {
        try {
            a.stop();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void a(long l) {
        try {
            a.setMediaTime(l);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static long a() {
        return a.getMediaTime();
    }

    private static long b() {
        return a.getDuration();
    }

    public final void commandAction(Command command, Item item) {
        if (command == this.f) {
            new Thread(new aq(this)).start();
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        block12: {
            try {
                if (command == this.e) {
                    new Thread(new ar(this)).start();
                    break block12;
                }
                if (command == this.a) {
                    if (this.b.equals(this.a.getLabel())) {
                        ap.j();
                    } else {
                        ap.u();
                    }
                    break block12;
                }
                if (command == this.b) {
                    ap.t();
                    break block12;
                }
                if (command == this.c) {
                    long l = ap.b();
                    ap.a(ap.a() - l / 10L);
                    break block12;
                }
                if (command == this.d) {
                    long l = ap.b();
                    ap.a(ap.a() + l / 10L);
                    break block12;
                }
                if (command == this.f) {
                    new Thread(new as(this)).start();
                    break block12;
                }
                if (command == this.g) {
                    this.v();
                    break block12;
                }
                if (command == this.h) {
                    this.w();
                    q.a(this.n, this);
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static synchronized ap a(int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n3, String string11, String string12, Object object) {
        q = object;
        object = new ap();
        new ap().b = n3;
        ((ap)object).a = n2;
        ((ap)object).a = string;
        ((ap)object).o = string10;
        ((ap)object).p = string12;
        if (n2 != 1) {
            ((ap)object).a = new Form(string);
            ((ap)object).a = new ay(string6, string7, (ap)object);
            ((ap)object).a.setCommandListener((CommandListener)object);
            ((ap)object).f = string2;
            ((ap)object).k = string3;
            ((ap)object).l = string4;
            ((ap)object).m = string5;
            ((ap)object).n = string11;
        }
        switch (n2) {
            case 0: {
                if (!super.b()) break;
                ((ap)object).f = new Command(string6, 8, 1);
                ((ap)object).a.addCommand(((ap)object).f);
                ((ap)object).e = new Command(string7, 2, 4);
                ((ap)object).a.addCommand(((ap)object).e);
                q.a().setCurrent((Displayable)((ap)object).a);
                break;
            }
            case 2: {
                Object object2 = object;
                try {
                    a = Manager.createPlayer((String)((ap)object2).f);
                    a.realize();
                    ((ap)object2).b = (VideoControl)a.getControl("VideoControl");
                    if (((ap)object2).b != null) {
                        string = (Item)((ap)object2).b.initDisplayMode(0, null);
                        string.setLayout(3);
                        ((ap)object2).a.append((Item)string);
                        if (((ap)object2).l != null && ((ap)object2).m != null) {
                            ((ap)object2).b.setDisplaySize(bj.a(((ap)object2).l, 100), bj.a(((ap)object2).m, 100));
                        }
                    }
                    a.start();
                }
                catch (Exception exception) {}
                ((ap)object).g = new Command(string8, 4, 0);
                ((ap)object).h = new Command(string9, 4, 0);
                ((ap)object).e = new Command(string7, 2, 1);
                ((ap)object).a.addCommand(((ap)object).g);
                ((ap)object).a.addCommand(((ap)object).e);
                q.a().setCurrent((Displayable)((ap)object).a);
                break;
            }
            case 1: {
                try {
                    a = Manager.createPlayer((String)"capture://audio");
                    a.realize();
                    a.start();
                    break;
                }
                catch (Exception exception) {}
            }
        }
        return object;
    }

    private void a(Exception exception, String string) {
        if (q.a != null && q != null) {
            this.b();
            ah ah2 = new ah();
            ah2.a(2);
            ah2.a(exception.toString());
            ah2.a(1, string);
            try {
                q.b = false;
                q.d = false;
                q.e = false;
                System.currentTimeMillis();
                if (q instanceof af && ((af)q).a()) {
                    ((af)q).a(new ah(), null, ah2);
                } else {
                    q.a.a(new ah(), q.toString(), ah2);
                }
                q.a((byte)2);
                return;
            }
            catch (RuntimeException runtimeException) {}
        }
    }

    private boolean b() {
        boolean bl = true;
        try {
            a = Manager.createPlayer((String)this.f);
            a.realize();
            this.b = (VideoControl)a.getControl("VideoControl");
            if (this.b != null) {
                this.b.initDisplayMode(1, (Object)this.a);
                int n2 = this.a.getHeight() - this.a.a - this.a.b;
                int n3 = this.a.getWidth();
                int n4 = this.b.getSourceWidth();
                int n5 = this.b.getSourceHeight();
                n4 = n4 * 100000 / n5;
                if (n3 * 100000 / n2 > n4) {
                    n3 = n2;
                    n2 = n4 * n2 / 100000;
                } else {
                    n2 = n3;
                    n3 = n3 * 100000 / n4;
                }
                this.b.setDisplaySize(n2, n3);
                this.b.setDisplayLocation(this.a.getWidth() - n2 >> 1, this.a.getHeight() - n3 >> 1);
                this.b.setVisible(true);
            }
            a.start();
        }
        catch (Exception exception) {
            ap.x();
            this.a(exception, exception.toString());
            bl = false;
        }
        return bl;
    }

    protected final void b() {
        this.b.setVisible(false);
        q.a(null, this);
    }

    protected final void c() {
        try {
            q.a(this.o, (Object)this.b.getSnapshot(this.k));
            q.a(this.n, this);
            return;
        }
        catch (Exception exception) {
            this.a.delete(0);
            this.b.setVisible(false);
            if (this.p == null) {
                this.p = "You can not take a photo at this time as your phone memory is full.";
            }
            try {
                a.stop();
            }
            catch (Exception exception2) {}
            this.a(exception, exception.toString());
            return;
        }
    }

    private void v() {
        if (this.a == 2) {
            this.a.removeCommand(this.g);
            this.a.addCommand(this.h);
        }
        this.a = (RecordControl)a.getControl("RecordControl");
        this.a = new ByteArrayOutputStream();
        this.a.setRecordStream((OutputStream)this.a);
        try {
            if (this.b != 0) {
                this.a.setRecordSizeLimit(this.b);
            }
            this.a.startRecord();
            this.e = this.a.getContentType();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void w() {
        try {
            this.a.commit();
            this.a.stopRecord();
            q.a(this.o, (Object)this.a.toByteArray());
            ap.x();
            this.a.close();
            this.a = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void x() {
        if (a != null) {
            try {
                if (a.getState() != 0) {
                    a.stop();
                    a.deallocate();
                    a.close();
                }
            }
            catch (Exception exception) {}
        }
        a = null;
    }

    public final boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -288: {
                    ah2.a(this.a);
                    break;
                }
                case -289: {
                    ah2.a(this.c);
                    break;
                }
                case -290: {
                    ah2.a(this.d);
                    break;
                }
                case -291: {
                    ah2.a(this.e);
                    break;
                }
                case -292: {
                    ah2.a(this.f);
                    break;
                }
                case -293: {
                    ah2.a(this.g);
                    break;
                }
                case -294: {
                    ah2.a(this.h);
                    break;
                }
                case -295: {
                    ah2.a(this.i);
                    break;
                }
                case -296: {
                    ah2.a(this.j);
                    break;
                }
                case -297: {
                    ah2.a(this.k);
                    break;
                }
                case -298: {
                    ah2.a(this.l);
                    break;
                }
                case -299: {
                    ah2.a(this.m);
                    break;
                }
                case -300: {
                    ah2.a(this.n);
                    break;
                }
                case -301: {
                    ah2.a(this.o);
                    break;
                }
                case -302: {
                    ah2.a(this.p);
                    break;
                }
                case -305: {
                    ah2.a(this.e);
                    break;
                }
                case -304: 
                case -303: 
                case -287: 
                case -286: 
                case -285: 
                case -284: 
                case -283: 
                case -282: 
                case -281: 
                case -280: 
                case -279: 
                case -278: {
                    ah2.a(ag.b);
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
        if (!(bl = super.a(n2, bl, object, n3))) {
            switch (n2) {
                case -288: {
                    this.a = object;
                    break;
                }
                case -289: {
                    this.c = object;
                    break;
                }
                case -290: {
                    this.d = object;
                    break;
                }
                case -291: {
                    this.e = object;
                    break;
                }
                case -292: {
                    this.f = object;
                    break;
                }
                case -293: {
                    this.g = object;
                    break;
                }
                case -294: {
                    this.h = object;
                    break;
                }
                case -295: {
                    this.i = object;
                    break;
                }
                case -296: {
                    this.j = object;
                    break;
                }
                case -297: {
                    this.k = object;
                    break;
                }
                case -298: {
                    this.l = object;
                    break;
                }
                case -299: {
                    this.m = object;
                    break;
                }
                case -300: {
                    this.n = object;
                    break;
                }
                case -301: {
                    this.o = object;
                    break;
                }
                case -302: {
                    this.p = object;
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(ah ah2, af af2, int n2, ah ah3) {
        if (!super.a(ah2, af2, n2, ah3)) {
            switch (n2) {
                case -278: {
                    ap.j();
                    ah2.a(null);
                    break;
                }
                case -279: {
                    ap.u();
                    ah2.a(null);
                    break;
                }
                case -280: {
                    ap.t();
                    ah2.a(null);
                    break;
                }
                case -282: {
                    ap.a(ah3.a(0));
                    ah2.a(null);
                    break;
                }
                case -281: {
                    ah2.c((int)ap.a());
                    break;
                }
                case -283: {
                    ah2.c((int)ap.b());
                    break;
                }
                case -284: {
                    af2 = this;
                    ah2.c(((ap)af2).a.getLevel());
                    break;
                }
                case -285: {
                    n2 = ah3.a(0);
                    af2 = this;
                    ((ap)af2).a.setLevel(n2);
                    ah2.a(null);
                    break;
                }
                case -286: {
                    af2 = this;
                    ah2.a(((ap)af2).a.isMuted());
                    break;
                }
                case -287: {
                    n2 = ah3.a(0) ? 1 : 0;
                    af2 = this;
                    ((ap)af2).a.setMute(n2 != 0);
                    ah2.a(null);
                    break;
                }
                case -303: {
                    this.v();
                    ah2.a(null);
                    break;
                }
                case -304: {
                    this.w();
                    ah2.a(null);
                    break;
                }
                default: {
                    throw new NoSuchElementException("no such method");
                }
            }
        }
        return true;
    }
}
