/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.icc.morpheus.MorpheusMidlet
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Image
 */
import com.icc.morpheus.MorpheusMidlet;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class z
implements Runnable,
n {
    private static boolean a = true;
    private int a;
    private String a;
    private String b;
    private Object a;
    private Hashtable a;
    private Hashtable b;
    private Object b;
    private ab a;
    private boolean b;
    private p a;
    private static boolean c = true;
    private static boolean d = true;
    private boolean e = false;
    private HttpConnection a = null;

    public z(p p2, String string, String string2, Object object, Hashtable hashtable, int n2, boolean bl) {
        this.a = n2;
        this.a = string.toUpperCase();
        this.b = string2;
        this.a = object;
        this.a = hashtable;
        this.b = bl;
        this.a = p2;
        try {
            bj.a(hashtable.get("storeReponseBody"), false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final HttpConnection a() {
        HttpConnection httpConnection = this.a(!a);
        if (a) {
            a = false;
        }
        return httpConnection;
    }

    public final HttpConnection b() {
        return this.a(false);
    }

    private HttpConnection a(boolean bl) {
        this.a = null;
        try {
            int n2;
            String string;
            int n3;
            String string2;
            Object object;
            if (this.a.equals("GET") && this.a != null) {
                Object object2 = new StringBuffer();
                boolean bl2 = true;
                if (this.b.indexOf(63) == -1) {
                    ((StringBuffer)object2).append('?');
                    bl2 = false;
                }
                object = ((Hashtable)this.a).keys();
                while (object.hasMoreElements()) {
                    String string3;
                    string2 = (String)object.nextElement();
                    Object v2 = ((Hashtable)this.a).get(string2);
                    String string4 = null;
                    if (v2 instanceof Vector) {
                        Vector vector = (Vector)v2;
                        int n4 = vector.size();
                        for (int j = 0; j < n4; ++j) {
                            ((StringBuffer)object2).append('&');
                            ((StringBuffer)object2).append(bj.a(string2));
                            ((StringBuffer)object2).append('=');
                            ((StringBuffer)object2).append(bj.a(vector.elementAt(j).toString()));
                        }
                        string4 = null;
                        bl2 = false;
                    }
                    if (bl2) {
                        ((StringBuffer)object2).append('&');
                    } else {
                        bl2 = true;
                    }
                    if (v2 instanceof String) {
                        string3 = (String)v2;
                    } else if (v2 instanceof Integer) {
                        string3 = Integer.toString((Integer)v2);
                    } else if (v2 instanceof Boolean) {
                        string3 = string4 = (Boolean)v2 != false ? "true" : "false";
                    }
                    if (string4 == null) continue;
                    ((StringBuffer)object2).append(bj.a(string2));
                    ((StringBuffer)object2).append('=');
                    ((StringBuffer)object2).append(bj.a(string4));
                }
                this.b = this.b + ((StringBuffer)object2).toString();
                if (this.a != null) {
                    String string5 = this.b;
                    object2 = this.a;
                    this.a.a = string5;
                }
            }
            if (!c && d && (n3 = this.b.indexOf("http:")) == 0) {
                this.b = "https:" + this.b.substring(n3 + 5);
                if (this.a != null) {
                    String string6 = this.b;
                    p p2 = this.a;
                    this.a.a = string6;
                }
            }
            this.a = (HttpConnection)Connector.open((String)this.b, (int)3, (boolean)true);
            if (this.a == null) {
                this.a = "GET";
            }
            this.a.setRequestMethod(this.a);
            if ("POST".equals(this.a)) {
                this.a.setRequestProperty("Content-Type", "application/mmf");
            } else {
                this.a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
            Object object3 = System.getProperty("microedition.locale");
            this.a.setRequestProperty("Accept-Language", (String)object3);
            this.a.setRequestProperty("Keep-Alive", "timeout=120, max=100");
            am.a = object3 != null && ((String)object3).length() >= 2 ? ("TH".equals(string = ((String)object3).substring(0, 2).toUpperCase()) || "JA".equals(string) || "ZH".equals(string) || "HI".equals(string) || "KO".equals(string) ? false : false) : false;
            this.a.setRequestProperty("cache-request-directive", "no-transform");
            this.a.setRequestProperty("User-Agent", q.d);
            this.a.setRequestProperty("x-user-agent", q.d);
            this.a.setRequestProperty("X-Interpreter-EnabledChunk", "1");
            this.a.setRequestProperty("X-CachedCIDs", i.a());
            this.a.setRequestProperty("x-morpheus-version", q.e);
            this.a.setRequestProperty("x-midlet-version", q.f);
            this.a.setRequestProperty("x-icc-collab", q.g);
            this.a.setRequestProperty("x-morpheus-timezone", new Date().toString());
            this.a.setRequestProperty("x-morpheus-timestamp", Long.toString(System.currentTimeMillis()));
            this.a.setRequestProperty("Cache-Control", "no-store");
            this.a.setRequestProperty("Connection", "Keep-Alive");
            this.a.setRequestProperty("Proxy-Connection", "Keep-Alive");
            this.a.setRequestProperty("X-Wap-Proxy-Cookie", "none");
            z.a(this.a);
            if (this.a != null) {
                Enumeration enumeration = this.a.keys();
                while (enumeration.hasMoreElements()) {
                    object = (String)enumeration.nextElement();
                    if (((String)object).indexOf("_") != 0) continue;
                    string2 = (String)this.a.get(object);
                    object = ((String)object).substring(1);
                    this.a.setRequestProperty((String)object, string2);
                }
            }
            if (this.a.equals("POST") && this.a != null) {
                try {
                    DataOutputStream dataOutputStream = this.a.openDataOutputStream();
                    object = b.a(this.a);
                    dataOutputStream.write((byte[])object);
                    dataOutputStream.close();
                    if (this.a instanceof Hashtable) {
                        ((Hashtable)this.a).clear();
                    } else {
                        ((Vector)this.a).removeAllElements();
                    }
                    this.a = null;
                }
                catch (Exception exception) {}
            }
            int n5 = n2 = this.a.getResponseCode();
            Object object4 = this.a;
            object3 = this;
            boolean bl3 = false;
            if (n5 >= 300 && n5 <= 399) {
                bl3 = true;
                object4 = object4.getHeaderField("Location");
                if (n5 == 302 || n5 == 307 || n5 == 301) {
                    ((z)object3).b = object4;
                }
            }
            if (bl3) {
                this.a.close();
                this.a = null;
                return this.a(bl);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this.a;
    }

    private static void a(HttpConnection httpConnection) {
        String string = "";
        String string2 = httpConnection.getProtocol();
        String string3 = httpConnection.getHost();
        String string4 = httpConnection.getFile();
        Enumeration enumeration = q.c.keys();
        while (enumeration.hasMoreElements()) {
            Object object;
            String string5 = (String)enumeration.nextElement();
            Hashtable hashtable = (Hashtable)q.c.get(string5);
            String string6 = (String)hashtable.get("domain");
            Object object2 = (String[])hashtable.get("path");
            String string7 = (String)hashtable.get("expires");
            String string8 = (String)hashtable.get("secure");
            if (string3.indexOf(string6) == -1) continue;
            boolean bl = true;
            if (!object2.equals("/")) {
                object = bg.a(string4, "/").a();
                if (((String[])(object2 = bg.a((String)object2, "/").a())).length > ((String[])object).length) {
                    bl = false;
                } else {
                    for (int j = 0; j < ((String[])object2).length; ++j) {
                        if (object2[j].equals(object[j])) continue;
                        bl = false;
                        break;
                    }
                }
            }
            if (!bl || string8 != null && string8.equals("true") && string2.equals("http")) continue;
            if (string7 != null) {
                object = (Calendar)hashtable.get("calendar");
                object2 = Calendar.getInstance();
                if (object2.after(object)) {
                    q.c.remove(string5);
                    continue;
                }
            }
            string = string + (String)hashtable.get("cookie") + "; ";
        }
        if ((string = string + "MORPHEUSGUID=" + MorpheusMidlet.a + ";").length() > 0) {
            httpConnection.setRequestProperty("Cookie", string);
        }
    }

    public static Hashtable a(HttpConnection httpConnection, Hashtable hashtable) {
        if (hashtable == null) {
            hashtable = new Hashtable<String, String>();
        }
        try {
            int n2 = 0;
            while (true) {
                String string = httpConnection.getHeaderFieldKey(n2);
                String string2 = httpConnection.getHeaderField(n2);
                if (string == null && string2 == null) break;
                if (string.toLowerCase().equals("set-cookie")) {
                    if (c) {
                        d = false;
                    }
                    Hashtable<String, Object> hashtable2 = new Hashtable<String, Object>();
                    String string3 = "";
                    String string4 = httpConnection.getHost();
                    String string5 = httpConnection.getFile();
                    hashtable2.put("path", "/");
                    hashtable2.put("domain", string4);
                    bg bg2 = bg.a(string2.trim(), ";");
                    boolean bl = true;
                    while (bg2.a()) {
                        String string6 = bg2.a();
                        Object object = bg.a(string6.trim(), "=");
                        String string7 = "";
                        String string8 = "";
                        try {
                            string7 = ((bg)object).a().toLowerCase();
                            string8 = ((bg)object).a();
                        }
                        catch (NoSuchElementException noSuchElementException) {}
                        if (string7.equals("secure")) {
                            hashtable2.put("secure", "true");
                        } else if (string7.equals("path")) {
                            if (!string5.equals("/") && string5.indexOf(string8) == -1) {
                                bl = false;
                                continue;
                            }
                            hashtable2.put("path", string8);
                        } else if (string7.equals("domain")) {
                            if (string8.indexOf(42) >= 0) {
                                string8 = string8.substring(string8.indexOf(42) + 1);
                            }
                            if (string4.indexOf(string8) == -1) {
                                bl = false;
                                continue;
                            }
                            object = string8.substring(string8.indexOf(46), string8.lastIndexOf(46));
                            if (((String)object).length() == 0) {
                                bl = false;
                                continue;
                            }
                            hashtable2.put("domain", string4);
                        } else if (string7.equals("expires") && (object = bj.a(string8)) != null) {
                            hashtable2.put("calendar", object);
                            hashtable2.put("expires", string8);
                        }
                        if (string7.equals("domain") || string7.equals("path") || string7.equals("expires") || string7.equals("secure")) continue;
                        string3 = string7;
                        hashtable2.put("cookie", string6.toString());
                    }
                    if (bl) {
                        q.c.put(string3 + ":" + string4 + hashtable2.get("path"), hashtable2);
                    }
                }
                hashtable.put(string, string2);
                ++n2;
            }
        }
        catch (Exception exception) {}
        c = false;
        return hashtable;
    }

    private Hashtable a(HttpConnection httpConnection) {
        InputStream inputStream = null;
        this.b = new Hashtable();
        this.b.put("status", "0");
        try {
            int n2 = httpConnection.getResponseCode();
            Object object = httpConnection.getResponseMessage();
            this.b.put("url", httpConnection.getURL());
            this.b.put("status", n2 + "");
            this.b.put("message", object);
            this.b.put("requestMethod", httpConnection.getRequestMethod());
            n2 = bj.a(httpConnection.getHeaderField("Content-Length"), 0);
            object = new byte[n2];
            byte[] byArray = new byte[n2];
            this.b = z.a(httpConnection, this.b);
            int n3 = 0;
            int n4 = 0;
            inputStream = httpConnection.openDataInputStream();
            while ((n4 = inputStream.read((byte[])object)) != -1) {
                System.arraycopy(object, 0, byArray, n3, n4);
                n3 += n4;
            }
            this.b.put("body", n2 == 0 ? "" : new String(byArray, "UTF-8"));
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            this.b.put("error", "Connection Not Found");
        }
        catch (IOException iOException) {
            this.b.put("error", "I/O Exception");
        }
        finally {
            if (this.a != -1) {
                q.a[this.a] = false;
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpConnection != null) {
                httpConnection.close();
            }
        }
        return this.b;
    }

    public final void a(ab ab2, Object object) {
        this.a = ab2;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Hashtable<String, String> hashtable;
        block47: {
            hashtable = null;
            try {
                k.a(this);
                if (this.b) {
                    z z2 = this;
                    object = null;
                    z2.a = null;
                    InputStream inputStream = null;
                    try {
                        if (z2.b.startsWith("http://") || z2.b.startsWith("https://")) {
                            z z3 = z2;
                            z2.a = z3.a(false);
                            if (200 == z2.a.getResponseCode()) {
                                inputStream = z2.a.openDataInputStream();
                                object = Image.createImage((InputStream)inputStream);
                            }
                        } else if (z2.b.startsWith("file:///") && (object = bj.a(z2.b)) == null) {
                            ((an)q.f.get(z2.b)).b();
                            q.a.remove(z2.b);
                            q.e.remove(z2.b);
                            q.f.remove(z2.b);
                            q.a((byte)1);
                        }
                        if (object != null) {
                            if (z2.b.startsWith("file:///")) {
                                q.a.remove(z2.b);
                                q.e.remove(z2.b);
                                ((an)q.f.get(z2.b)).a((Image)object);
                                q.f.remove(z2.b);
                            } else {
                                q.a.put(z2.b, object);
                            }
                            q.a((byte)1);
                        }
                    }
                    catch (IOException iOException) {
                        try {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (z2.a != null) {
                                z2.a.close();
                            }
                            z2.a = null;
                        }
                        catch (IOException iOException2) {}
                        q.a[z2.a] = false;
                        break block47;
                    }
                    catch (Throwable throwable) {
                        try {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (z2.a != null) {
                                z2.a.close();
                            }
                            z2.a = null;
                        }
                        catch (IOException iOException) {}
                        q.a[z2.a] = false;
                        throw throwable;
                    }
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (z2.a != null) {
                            z2.a.close();
                        }
                        z2.a = null;
                    }
                    catch (IOException iOException) {}
                    q.a[z2.a] = false;
                    break block47;
                }
                q.q = 99;
                z z4 = this;
                hashtable = this.a(z4.a(false));
                k.a(this);
                q.q = 100;
                Thread.sleep(30L);
            }
            catch (Exception exception) {
                k.a(this);
                if (this.e) {
                    return;
                }
                if (this.b) return;
                if (this.a == null) return;
                if (this.b == null) return;
                ah ah2 = new ah();
                ah2.a(1);
                try {
                    if (hashtable == null) {
                        hashtable = new Hashtable<String, String>();
                    }
                    if (!hashtable.containsKey("body")) {
                        hashtable.put("body", "{\"errorMessage\": \"" + MorpheusMidlet.g + "\"}");
                    }
                    ah2.a(hashtable);
                    q.b = false;
                    q.d = false;
                    q.e = false;
                    q.w = Integer.MIN_VALUE;
                    System.currentTimeMillis();
                    if (this.b instanceof af && ((af)this.b).a()) {
                        ((af)this.b).a(new ah(), null, ah2);
                    } else {
                        this.a.a(new ah(), this.b.toString(), ah2);
                    }
                    q.a((byte)2);
                    return;
                }
                catch (RuntimeException runtimeException) {}
                return;
            }
            catch (Throwable throwable) {
                k.a(this);
                if (this.e) {
                    return;
                }
                if (this.b) throw throwable;
                if (this.a == null) throw throwable;
                if (this.b == null) throw throwable;
                ah ah3 = new ah();
                ah3.a(1);
                try {
                    if (hashtable == null) {
                        hashtable = new Hashtable();
                    }
                    if (!hashtable.containsKey("body")) {
                        hashtable.put("body", "{\"errorMessage\": \"" + MorpheusMidlet.g + "\"}");
                    }
                    ah3.a(hashtable);
                    q.b = false;
                    q.d = false;
                    q.e = false;
                    q.w = Integer.MIN_VALUE;
                    System.currentTimeMillis();
                    if (this.b instanceof af && ((af)this.b).a()) {
                        ((af)this.b).a(new ah(), null, ah3);
                    } else {
                        this.a.a(new ah(), this.b.toString(), ah3);
                    }
                    q.a((byte)2);
                    throw throwable;
                }
                catch (RuntimeException runtimeException) {}
                throw throwable;
            }
        }
        k.a(this);
        if (this.e) {
            return;
        }
        if (this.b) return;
        if (this.a == null) return;
        if (this.b == null) return;
        object = new ah();
        ((ah)object).a(1);
        try {
            if (hashtable == null) {
                hashtable = new Hashtable();
            }
            if (!hashtable.containsKey("body")) {
                hashtable.put("body", "{\"errorMessage\": \"" + MorpheusMidlet.g + "\"}");
            }
            ((ah)object).a(hashtable);
            q.b = false;
            q.d = false;
            q.e = false;
            q.w = Integer.MIN_VALUE;
            System.currentTimeMillis();
            if (this.b instanceof af && ((af)this.b).a()) {
                ((af)this.b).a(new ah(), null, (ah)object);
            } else {
                this.a.a(new ah(), this.b.toString(), (ah)object);
            }
            q.a((byte)2);
            return;
        }
        catch (RuntimeException runtimeException) {}
    }

    public final void a() {
        this.e = true;
        if (this.a != null) {
            try {
                this.a.close();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final boolean a_() {
        return this.e;
    }
}
