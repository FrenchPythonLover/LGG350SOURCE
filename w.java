/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.SocketConnection;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class w
implements HttpConnection {
    private static Hashtable a = new Hashtable<String, String>();
    private InputStream a;
    private OutputStream a;
    private StringBuffer a;
    private int a;
    private int b;
    private int c;
    private static String a;
    private static byte[] a;
    private static byte[] b;
    private static byte[] c;
    private static byte[] d;
    private int d = -1;
    private long a;
    private long b;
    private Vector a = 0L;
    private Vector b;
    private Hashtable b;
    private static boolean a;
    private String b = 0L;
    private String c = 0;

    private String a() {
        int n;
        this.a.setLength(0);
        while ((n = this.a.read()) >= 0) {
            if (n == 13) continue;
            if (n == 10) break;
            this.a.append((char)n);
        }
        return this.a.toString();
    }

    private void a() {
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append("socket://");
        stringBuffer.append((String)null).append(':').append(0);
        stringBuffer = (SocketConnection)Connector.open((String)stringBuffer.toString());
        stringBuffer.setSocketOption((byte)0, 0);
        this.a = stringBuffer.openInputStream();
        this.a = stringBuffer.openOutputStream();
    }

    private int a() {
        Object object;
        Object object2;
        if (-1 != this.d) {
            return this.d;
        }
        try {
            this.a = System.currentTimeMillis();
            object2 = this;
            if (((w)object2).a == null) {
                ((w)object2).a();
            }
            try {
                for (int i = 0; i < 3; ++i) {
                    try {
                        ((w)object2).a.write(((w)object2).b.getBytes());
                        break;
                    }
                    catch (IOException iOException) {
                        if (i == 2) {
                            ((w)object2).a = null;
                            ((w)object2).a = null;
                            throw iOException;
                        }
                        ((w)object2).a();
                        continue;
                    }
                }
            }
            catch (IOException iOException) {
                ((w)object2).a = null;
                throw iOException;
            }
            ((w)object2).a.write(a);
            ((w)object2).a.write(((String)null).getBytes());
            ((w)object2).a.write(a);
            ((w)object2).a.write(d);
            ((w)object2).a.write(b);
            object = ((w)object2).b.keys();
            while (object.hasMoreElements()) {
                String string = (String)object.nextElement();
                if (string == null) continue;
                String string2 = (String)((w)object2).b.get(string);
                if (string2 == null) {
                    string2 = "";
                }
                ((w)object2).a.write(string.getBytes());
                ((w)object2).a.write(c);
                ((w)object2).a.write(string2.getBytes());
                ((w)object2).a.write(b);
            }
            ((w)object2).a.write("Host: ".getBytes());
            ((w)object2).a.write(((String)null).getBytes());
            ((w)object2).a.write(b);
            ((w)object2).a.write(b);
            ((w)object2).a.flush();
            this.a = System.currentTimeMillis() - this.a;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            throw iOException;
        }
        this.b = System.currentTimeMillis();
        object2 = null;
        object = this;
        synchronized (object) {
            object2 = this.a();
        }
        this.b = System.currentTimeMillis() - this.b;
        try {
            int n = ((String)object2).indexOf(32) + 1;
            int n2 = ((String)object2).indexOf(32, n);
            this.d = Integer.parseInt(((String)object2).substring(n, n2));
        }
        catch (Exception exception) {
            throw new IOException("Invalid status line: " + (String)object2);
        }
        return this.d;
    }

    public final void setRequestProperty(String string, String string2) {
        if (string == null || string2 == null) {
            return;
        }
        this.b.isEmpty();
        this.b.put(string, string2);
    }

    public final InputStream openInputStream() {
        this.a();
        w w2 = this;
        if (w2.a.isEmpty()) {
            String string;
            w2.a();
            while ((string = w2.a()) != null && string.length() != 0) {
                int n = string.indexOf(58);
                if (n < 0) {
                    throw new IOException("Invalid header line: " + string);
                }
                Object object = string.substring(0, n).trim().toLowerCase().intern();
                String string2 = string = string.substring(n + 1, string.length()).trim();
                string = object;
                object = w2;
                try {
                    if (string == "content-length") {
                        ((w)object).a = Integer.parseInt(string2);
                    } else if (string == "content-type") {
                        ((w)object).c = string2;
                    }
                    ((w)object).a.addElement(string);
                    ((w)object).b.addElement(string2);
                }
                catch (Exception exception) {}
            }
        }
        return new y(this);
    }

    public final int getResponseCode() {
        this.a();
        return this.d;
    }

    public final void close() {
        if (this.b > 0) {
            w w2 = this;
            w2.a.removeAllElements();
            w2.b.removeAllElements();
            w2.d = -1;
            w2.b.clear();
            if (w2.c < w2.a && w2.a != null) {
                try {
                    w2.a.skip(w2.a - w2.c);
                }
                catch (IOException iOException) {
                    try {
                        w2.b = 0;
                        w2.a.close();
                    }
                    catch (Exception exception) {}
                }
            }
            w2.a = 0;
            w2.c = 0;
            --this.b;
            return;
        }
        if (this.b == 0 && this.a != null) {
            this.a.close();
        }
    }

    public w() {
        new x(this);
        this.c = null;
        this.a = new Vector(8);
        this.b = new Vector(8);
        this.b = new Hashtable(10);
        this.a = new StringBuffer(128);
    }

    public final String getURL() {
        return null;
    }

    public final String getProtocol() {
        return "http";
    }

    public final String getHost() {
        return null;
    }

    public final String getFile() {
        return null;
    }

    public final String getRef() {
        return "";
    }

    public final String getQuery() {
        return null;
    }

    public final int getPort() {
        return 0;
    }

    public final String getRequestMethod() {
        return this.b;
    }

    public final void setRequestMethod(String string) {
        this.b = string;
    }

    public final String getRequestProperty(String string) {
        return (String)this.b.get(string);
    }

    public final String getResponseMessage() {
        byte[] byArray = d.a((InputStream)this.openInputStream(), (int)this.a);
        return new String(byArray, "utf8");
    }

    public final long getExpiration() {
        return -1L;
    }

    public final long getDate() {
        return -1L;
    }

    public final long getLastModified() {
        return -1L;
    }

    public final String getHeaderField(String string) {
        if (string == null) {
            return null;
        }
        int n = this.a.indexOf(string);
        if (n == -1) {
            return null;
        }
        return (String)this.b.elementAt(n);
    }

    public final int getHeaderFieldInt(String string, int n) {
        return 0;
    }

    public final long getHeaderFieldDate(String string, long l) {
        return 0L;
    }

    public final String getHeaderField(int n) {
        if (n < 0 || n >= this.b.size()) {
            return null;
        }
        return (String)this.b.elementAt(n);
    }

    public final String getHeaderFieldKey(int n) {
        if (n < 0 || n >= this.a.size()) {
            return null;
        }
        return (String)this.a.elementAt(n);
    }

    public final String getType() {
        return this.c;
    }

    public final String getEncoding() {
        return null;
    }

    public final long getLength() {
        return this.a;
    }

    public final DataInputStream openDataInputStream() {
        return new DataInputStream(this.openDataInputStream());
    }

    public final OutputStream openOutputStream() {
        return this.a;
    }

    public final DataOutputStream openDataOutputStream() {
        return new DataOutputStream(this.a);
    }

    static InputStream a(w w2) {
        return w2.a;
    }

    static int a(w w2) {
        return w2.b;
    }

    static int b(w w2) {
        return w2.c;
    }

    static int c(w w2) {
        return w2.a;
    }

    static int d(w w2) {
        return w2.c++;
    }

    static int a(w w2, int n) {
        return w2.c += n;
    }

    static {
        a.put("User-Agent", "Thomas Lib");
        a = "HTTP/1.1";
        a = new byte[]{32};
        b = "\r\n".getBytes();
        c = new byte[]{58};
        d = a.getBytes();
        a = false;
        new Hashtable(2);
    }
}
