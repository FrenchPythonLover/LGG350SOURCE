/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.file.FileConnection
 *  javax.microedition.io.file.FileSystemRegistry
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordEnumeration
 *  javax.microedition.rms.RecordStore
 *  javax.wireless.messaging.BinaryMessage
 *  javax.wireless.messaging.Message
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bj {
    public static StringBuffer a = new StringBuffer();
    public static int a = 150;
    public static int b;
    public static boolean a;
    public static long a;
    private static Random a;
    public static String[] a;
    private static String a;
    private static byte[] a;

    public static String a(String string) {
        if (string != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int n = 0;
            try {
                while (true) {
                    char c;
                    if ((c = string.charAt(n++)) >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        stringBuffer.append(c);
                        continue;
                    }
                    stringBuffer.append("%");
                    if (c <= '\u000f') {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(c));
                }
            }
            catch (Exception exception) {
                return stringBuffer.toString();
            }
        }
        return null;
    }

    public static String a(String string, String string2, boolean bl) {
        int n;
        CharSequence charSequence = "";
        if (string2.indexOf("http:") == -1 && string2.indexOf("https:") == -1 && string2.indexOf("local:") == -1 && string2.indexOf("cid:") == -1 && string2.indexOf("rtsp:") == -1 && string2.indexOf("rtp:") == -1 && string2.indexOf("file:") == -1 && string2.indexOf("bundle") == -1 && !bj.b(string)) {
            if (string2.indexOf("//") == 0) {
                n = string.indexOf("//");
                if (n != -1) {
                    charSequence = string.substring(0, n) + string2;
                }
            } else if (string2.indexOf("../") == 0) {
                n = 1;
                charSequence = string2.substring(3);
                string = string.substring(0, string.length() - 1);
                int n2 = 0;
                while (((String)charSequence).indexOf("../") == 0) {
                    ++n;
                    charSequence = ((String)charSequence).substring(3);
                }
                for (int i = 0; i < n && (n2 = string.lastIndexOf(47)) != -1; ++i) {
                    string = string.substring(0, n2);
                }
                charSequence = string + "/" + (String)charSequence;
            } else if (string2.indexOf("./") == 0) {
                charSequence = string + string2.substring(2);
            } else if (string2.indexOf("/") == 0) {
                n = string.indexOf("//");
                int n3 = 0;
                charSequence = n != -1 && (n3 = string.indexOf(47, n + 2)) != -1 ? string.substring(0, n3) + string2 : string + string2;
            } else {
                charSequence = string + string2;
            }
        } else {
            charSequence = string2;
        }
        if (bl && ((String)charSequence).indexOf("https:") == -1 && (n = ((String)charSequence).indexOf("http:")) != -1) {
            charSequence = new StringBuffer((String)charSequence);
            charSequence = ((StringBuffer)charSequence).insert(n + 4, 's').toString();
        }
        return charSequence;
    }

    public static int[] a(String object, boolean bl, int n, int n2) {
        Object object2 = new int[10];
        n2 = ((String)object).indexOf(32);
        Object object3 = null;
        int n3 = 0;
        while (n2 != -1 || ((String)object).length() > 0) {
            object3 = n2 != -1 ? ((String)object).substring(0, n2) : object;
            object3 = ((String)object3).trim();
            if (n3 >= ((int[])object2).length) {
                int[] nArray = new int[((int[])object2).length << 1];
                System.arraycopy(object2, 0, nArray, 0, ((int[])object2).length);
                object2 = nArray;
            }
            object2[n3] = bl || (n3 + 1) % Integer.MIN_VALUE == 0 ? bj.c((String)object3, 0) : bj.a((String)object3, 0);
            ++n3;
            if (n2 == -1) break;
            object = ((String)object).substring(n2 + 1);
            n2 = ((String)object).indexOf(32);
        }
        int n4 = n3;
        object = new int[n4];
        System.arraycopy(object2, 0, object, 0, n4);
        Object object4 = object;
        object2 = object4;
        return object4;
    }

    public static int a(String string, int n) {
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {}
        return n;
    }

    public static int b(String string, int n) {
        if (string.length() > 2 && string.indexOf("px") == string.length() - 2) {
            string = string.substring(0, string.length() - 2);
        }
        return bj.a(string, n);
    }

    public static int c(String string, int n) {
        if (string.length() == 7) {
            try {
                n = Integer.parseInt(string.substring(1), 16);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return n;
    }

    public static boolean a(String string) {
        boolean bl = "1".equals(string = string.toUpperCase()) || "TRUE".equals(string);
        return bl;
    }

    public static String a(Object object, String string) {
        if (object != null) {
            return object.toString();
        }
        return string;
    }

    public static boolean a(Object object, boolean bl) {
        try {
            bl = (Boolean)object;
        }
        catch (Exception exception) {}
        return bl;
    }

    public static int[] a(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        return nArray2;
    }

    public static String b(String string) {
        if (string == null) {
            return null;
        }
        return new String(string);
    }

    public static String[] a(String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length << 1];
        System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
        return stringArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] a(InputStream inputStream) {
        int n = 0;
        byte[] byArray = new byte[]{};
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        try {
            while (-1 != (n = inputStream.read(byArray2 = new byte[2048]))) {
                byArray3 = byArray;
                byArray = new byte[byArray.length + n];
                System.arraycopy(byArray3, 0, byArray, 0, byArray3.length);
                System.arraycopy(byArray2, 0, byArray, byArray3.length, n);
            }
        }
        catch (IOException iOException) {
            try {
                if (inputStream == null) return byArray;
                inputStream.close();
                return byArray;
            }
            catch (IOException iOException2) {
                return byArray;
            }
        }
        catch (Throwable throwable) {
            try {
                if (inputStream == null) throw throwable;
                inputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {}
            throw throwable;
        }
        try {
            if (inputStream == null) return byArray;
            inputStream.close();
            return byArray;
        }
        catch (IOException iOException) {
            return byArray;
        }
    }

    public static Hashtable a(af af2) {
        Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
        String[] stringArray = af2.a();
        ah ah2 = new ah();
        int n = stringArray.length;
        while (--n >= 0) {
            af2.a(ah2, stringArray[n]);
            hashtable.put(stringArray[n], ah2.a());
            ah2.a();
            ah2.a(0);
        }
        return hashtable;
    }

    public static boolean b(String string) {
        return string == null || string.trim().length() == 0;
    }

    public static void a(int[] nArray, int n, int n2, int n3, int n4) {
        nArray[0] = n;
        nArray[1] = n2;
        nArray[2] = n3;
        nArray[3] = n4;
    }

    public static void b(int[] nArray, int n, int n2, int n3, int n4) {
        int n5;
        if (n < nArray[0]) {
            n5 = nArray[0] - n;
            nArray[0] = n;
            nArray[2] = nArray[2] + n5;
        }
        if (n + n3 > nArray[0] + nArray[2]) {
            n5 = n + n3 - (nArray[0] + nArray[2]);
            nArray[2] = nArray[2] + n5;
        }
        if (n2 < nArray[1]) {
            n5 = nArray[1] - n2;
            nArray[1] = n2;
            nArray[3] = nArray[3] + n5;
        }
        if (n2 + n4 > nArray[1] + nArray[3]) {
            n5 = n2 + n4 - (nArray[1] + nArray[3]);
            nArray[3] = nArray[3] + n5;
        }
    }

    public static void a(int n) {
        b = n;
    }

    public static boolean a(String string, byte[] byArray) {
        boolean bl = false;
        try {
            string = (FileConnection)Connector.open((String)string);
            string.create();
            DataOutputStream dataOutputStream = string.openDataOutputStream();
            dataOutputStream.write(byArray);
            dataOutputStream.close();
            string.close();
            bl = true;
        }
        catch (IOException iOException) {
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        return bl;
    }

    public static byte[] a(String string, boolean bl) {
        byte[] byArray = null;
        try {
            if (string.indexOf("local:") == 0) {
                InputStream inputStream = null;
                if (!bl) {
                    inputStream = string.getClass().getResourceAsStream(string.substring("local:".length()));
                    byArray = (byte[])bj.a(inputStream, false);
                }
                if (byArray == null) {
                    inputStream = string.getClass().getResourceAsStream(string.substring("local:".length()));
                    byArray = bj.a(inputStream);
                    inputStream.close();
                }
            } else {
                FileConnection fileConnection;
                if (!bl) {
                    fileConnection = (FileConnection)Connector.open((String)string);
                    byArray = (byte[])bj.a(fileConnection.openInputStream(), false);
                }
                if (byArray == null) {
                    fileConnection = (FileConnection)Connector.open((String)string);
                    byArray = bj.a(fileConnection.openInputStream());
                    fileConnection.close();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return byArray;
    }

    public static Vector a(String string, String[] stringArray, long l, Object object) {
        q.q = 0;
        Object object2 = "Card/";
        Object object3 = null;
        try {
            object3 = (FileConnection)Connector.open((String)("file:///" + (String)object2), (int)1);
            if (!object3.exists()) {
                a = true;
            }
        }
        catch (Exception exception) {
            a = true;
        }
        finally {
            try {
                if (object3 != null) {
                    object3.close();
                }
            }
            catch (Exception exception) {}
        }
        object2 = new Vector();
        boolean bl = false;
        try {
            if (string == null) {
                Enumeration enumeration = FileSystemRegistry.listRoots();
                while (enumeration.hasMoreElements()) {
                    bl = bj.a((Vector)object2, (String)enumeration.nextElement(), true, stringArray, l) || bl;
                }
            } else {
                bg bg2 = bg.a(string, ",");
                object3 = null;
                while (bg2.a()) {
                    object3 = bg2.a().trim();
                    bl = bj.a((Vector)object2, (String)object3, true, stringArray, l) || bl;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        if (bl && object != null) {
            q.a(null, object);
        }
        q.q = 100;
        return object2;
    }

    private static boolean a(Vector vector, String string, boolean bl, String[] stringArray, long l) {
        if (string.indexOf("file:///") == 0) {
            string = string.substring("file:///".length());
        }
        FileConnection fileConnection = (FileConnection)Connector.open((String)("file:///" + string), (int)1);
        boolean bl2 = false;
        if (fileConnection.exists()) {
            int n2 = a.nextInt() % 5 + 1;
            q.q = q.q + n2 < 99 ? (q.q += n2) : 99;
            if (fileConnection.isDirectory()) {
                if (bl) {
                    Enumeration enumeration = fileConnection.list();
                    while (enumeration.hasMoreElements()) {
                        bl2 = bj.a(vector, string + enumeration.nextElement(), bl, stringArray, l) || bl2;
                    }
                }
            } else {
                String string2 = string.toUpperCase();
                bl = false;
                int n3 = stringArray.length;
                while (--n3 >= 0) {
                    if (!string2.endsWith(stringArray[n3])) continue;
                    bl = true;
                    break;
                }
                if (bl) {
                    try {
                        if (fileConnection.fileSize() > l) {
                            bl2 = true;
                        } else {
                            vector.addElement("file:///" + string);
                            System.out.println("file:/// " + string);
                            System.out.println(vector.size());
                        }
                    }
                    catch (Exception exception) {}
                }
            }
        }
        fileConnection.close();
        return bl2;
    }

    /*
     * Loose catch block
     */
    public static Image a(String string) {
        Image image;
        block18: {
            InputStream inputStream;
            FileConnection fileConnection;
            block17: {
                image = null;
                fileConnection = null;
                inputStream = null;
                String string2 = string.toUpperCase();
                if (string2.endsWith("JPEG") || string2.endsWith("JPG")) {
                    fileConnection = (FileConnection)Connector.open((String)string, (int)1);
                    inputStream = fileConnection.openInputStream();
                    image = (Image)bj.a(inputStream, true);
                }
                if (image != null) break block17;
                fileConnection = (FileConnection)Connector.open((String)string, (int)1);
                inputStream = fileConnection.openInputStream();
                image = Image.createImage((InputStream)inputStream);
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileConnection != null) {
                    fileConnection.close();
                }
                break block18;
            }
            catch (Exception exception) {}
            break block18;
            catch (Exception exception) {
                try {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                catch (Throwable throwable) {
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileConnection != null) {
                            fileConnection.close();
                        }
                    }
                    catch (Exception exception3) {}
                    throw throwable;
                }
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileConnection != null) {
                        fileConnection.close();
                    }
                }
                catch (Exception exception4) {}
            }
        }
        return image;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object a(InputStream object, boolean bl) {
        Object object2;
        DataInputStream dataInputStream;
        block31: {
            dataInputStream = new DataInputStream((InputStream)object);
            byte[] byArray = new byte[50000];
            byte[] byArray2 = new byte[1024];
            int n2 = 0;
            object2 = null;
            try {
                dataInputStream.read(byArray2, 0, 1024);
                ++n2;
                byArray[0] = -1;
                byte by = byArray2[1];
                int n3 = byArray2[0];
                if (!((n3 & 0xFF) == 255 && (by & 0xFF) == 216)) break block31;
                n3 = 2;
                by = 0;
                int n4 = 1;
                int n5 = -1;
                do {
                    switch (n4) {
                        case 0: {
                            if (dataInputStream.read(byArray2, 0, 1024) == -1) {
                                by = 1;
                                byArray = null;
                                break;
                            }
                            n4 = n5;
                            n3 = 0;
                            break;
                        }
                        case 1: 
                        case 3: {
                            if (n3 == 1024) {
                                n5 = n4;
                                n4 = 0;
                                break;
                            }
                            if (byArray2[n3] == -1) {
                                if (n4 == 3) {
                                    byArray[n2++] = byArray2[n3];
                                }
                                n4 = n4 == 1 ? 2 : 4;
                                ++n3;
                                break;
                            }
                            if (n4 == 3) {
                                byArray[n2++] = byArray2[n3];
                            }
                            ++n3;
                            break;
                        }
                        case 2: {
                            if (n3 == 1024) {
                                n5 = n4;
                                n4 = 0;
                                break;
                            }
                            if ((byArray2[n3] & 0xFF) != 216) {
                                n4 = 1;
                            } else {
                                n4 = 3;
                                byArray[n2++] = byArray2[n3];
                            }
                            ++n3;
                            break;
                        }
                        case 4: {
                            if (n3 == 1024) {
                                n5 = n4;
                                n4 = 0;
                                break;
                            }
                            if ((byArray2[n3] & 0xFF) == 217) {
                                byArray[n2++] = byArray2[n3];
                                byArray[n2++] = -1;
                                by = 1;
                                break;
                            }
                            byArray[n2++] = byArray2[n3];
                            ++n3;
                            n4 = 3;
                            break;
                        }
                    }
                } while (by == 0);
                if (byArray == null) break block31;
                if (bl) {
                    Image image;
                    object2 = image = Image.createImage((byte[])byArray, (int)0, (int)(n2 - 1));
                } else {
                    byte[] byArray3 = new byte[n2 - 1];
                    System.arraycopy(byArray, 0, byArray3, 0, n2 - 1);
                    object2 = byArray3;
                }
            }
            catch (Exception exception) {
                try {
                    if (object != null) {
                        ((InputStream)object).close();
                    }
                    dataInputStream.close();
                    return object2;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return object2;
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object != null) {
                        ((InputStream)object).close();
                    }
                    dataInputStream.close();
                    throw throwable;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
        }
        try {
            if (object != null) {
                ((InputStream)object).close();
            }
            dataInputStream.close();
            return object2;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return object2;
        }
    }

    public static Image a(Image image, int n2, int n3) {
        if (image != null) {
            Image image2;
            int n4 = image.getWidth();
            int n5 = image.getHeight();
            n2 = (n4 << 9 << 2) / (n2 << 2);
            n3 = (n5 << 9) / n3;
            n2 = Math.max(n2, n3);
            int n6 = 9;
            if (image == null) {
                image2 = null;
            } else {
                n3 = image.getWidth();
                n4 = image.getHeight();
                int[] nArray = new int[n3];
                int n7 = (n4 << 9) / n2;
                n5 = (n3 << 9) / n2;
                int n8 = 0;
                int n9 = n2;
                int[] nArray2 = new int[n5];
                Image image3 = Image.createImage((int)n5, (int)n7);
                if (image3 == null) {
                    image2 = null;
                } else {
                    Graphics graphics = image3.getGraphics();
                    if (graphics == null) {
                        image2 = null;
                    } else {
                        for (int i = 0; i < n7; ++i) {
                            int n10 = 0;
                            int n11 = Math.max(0, Math.min(n3 - 1, 0));
                            int n12 = Math.max(0, Math.min(n4 - 1, n8 >> 9));
                            image.getRGB(nArray, 0, n3, n11, n12, n3, 1);
                            for (n11 = 0; n11 < n5; ++n11) {
                                nArray2[n11] = nArray[Math.max(0, Math.min(nArray.length, n10 >> 9))];
                                n10 += n9;
                            }
                            graphics.drawRGB(nArray2, 0, n5, 0, i, n5, 1, false);
                            n8 += n2;
                        }
                        image2 = image3;
                    }
                }
            }
            image = image2;
        }
        return image;
    }

    public static ah a(af af2) {
        ah ah2 = new ah();
        af2.a(ah2, "length");
        int n2 = ah2.b();
        ah ah3 = new ah(n2);
        for (int i = 0; i < n2; ++i) {
            af2.b(ah2, i);
            ah3.a(i, ah2.a());
        }
        return ah3;
    }

    public static final Image a(Image image, int n2, int n3, boolean bl, int n4) {
        Image image2;
        if (bl) {
            int n5;
            image2 = Image.createImage((int)n2, (int)n3);
            int n6 = image.getWidth();
            int n7 = image.getHeight();
            if (n2 * 100000 / n3 > (n6 = n6 * 100000 / n7)) {
                n5 = n3;
                n7 = n6 * n3 / 100000;
            } else {
                n7 = n2;
                n5 = n2 * 100000 / n6;
            }
            Graphics graphics = image2.getGraphics();
            if (n4 != 0xFFFFFF) {
                graphics.setColor(n4);
                graphics.fillRect(0, 0, n2, n3);
            }
            graphics.drawImage(bj.a(image, n7, n5), n2 - n7 >> 1, n3 - n5 >> 1, 20);
        } else {
            image2 = bj.a(image, n2, n3);
        }
        return image2;
    }

    public static void a(int[] nArray, int n2) {
        int n3 = -1;
        n3 = -1;
        int[] nArray2 = nArray;
        int n4 = nArray.length;
        for (int i = 0; i < n4; ++i) {
            int n5 = 0;
            int n6 = nArray2[i] & 0xFFFFFF;
            if (-1 == n6) {
                n5 = 0;
            } else if (-1 == n6) {
                n5 = 255;
            } else if (n2 > 0) {
                n5 = n2;
            }
            nArray2[i] = n6 += (n5 <<= 24);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string, Object object) {
        RecordStore recordStore = null;
        try {
            bj.a(string, true);
            recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF(string);
            if (object instanceof String) {
                dataOutputStream.writeChar(115);
                dataOutputStream.writeUTF(object.toString());
            } else if (object instanceof Image) {
                dataOutputStream.writeChar(109);
                int n2 = ((Image)object).getWidth();
                int n3 = ((Image)object).getHeight();
                int[] nArray = new int[n2 * n3];
                ((Image)object).getRGB(nArray, 0, n2, 0, 0, n2, n3);
                dataOutputStream.write(bj.a(nArray));
            } else if (object instanceof byte[]) {
                dataOutputStream.writeChar(98);
                dataOutputStream.write((byte[])object);
            } else {
                dataOutputStream.writeChar(79);
                dataOutputStream.write((byte[])object);
            }
            byte[] byArray = byteArrayOutputStream.toByteArray();
            recordStore.addRecord(byArray, 0, byArray.length);
            dataOutputStream.close();
            byteArrayOutputStream.close();
        }
        catch (Exception exception) {
            try {
                if (recordStore == null) return;
                recordStore.closeRecordStore();
                return;
            }
            catch (Exception exception2) {}
            return;
        }
        catch (Throwable throwable) {
            try {
                if (recordStore == null) throw throwable;
                recordStore.closeRecordStore();
                throw throwable;
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            if (recordStore == null) return;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {}
    }

    public static Object a(String string) {
        return bj.a(string, false);
    }

    public static Object b(String string) {
        return bj.a(string, true);
    }

    public static void a() {
        try {
            RecordStore.deleteRecordStore((String)a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object a(String string, boolean bl) {
        Object object = null;
        RecordStore recordStore = null;
        FilterInputStream filterInputStream = null;
        try {
            recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            while (recordEnumeration.hasNextElement()) {
                int n2 = recordEnumeration.nextRecordId();
                byte[] byArray = recordStore.getRecord(n2);
                if (!bj.b(string, byArray)) continue;
                filterInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                ((DataInputStream)filterInputStream).readUTF();
                char c = ((DataInputStream)filterInputStream).readChar();
                switch (c) {
                    case 's': {
                        object = ((DataInputStream)filterInputStream).readUTF();
                        break;
                    }
                    case 'm': {
                        byte[] byArray2 = bj.a(filterInputStream);
                        object = byArray2;
                        object = Image.createImage((byte[])byArray2, (int)0, (int)((byte[])object).length);
                        break;
                    }
                    case 'O': 
                    case 'b': {
                        object = bj.a(filterInputStream);
                        break;
                    }
                }
                if (bl) {
                    recordStore.deleteRecord(n2);
                }
                break;
            }
        }
        catch (Exception exception) {
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                if (recordStore == null) return object;
                recordStore.closeRecordStore();
                return object;
            }
            catch (Exception exception2) {
                return object;
            }
        }
        catch (Throwable throwable) {
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                if (recordStore == null) throw throwable;
                recordStore.closeRecordStore();
                throw throwable;
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
            if (recordStore == null) return object;
            recordStore.closeRecordStore();
            return object;
        }
        catch (Exception exception) {
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean b(String string, byte[] byArray) {
        boolean bl = false;
        FilterInputStream filterInputStream = null;
        try {
            filterInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            bl = string.equals(((DataInputStream)filterInputStream).readUTF());
        }
        catch (IOException iOException) {
            try {
                if (filterInputStream == null) return bl;
                filterInputStream.close();
                return bl;
            }
            catch (IOException iOException2) {
                return bl;
            }
        }
        catch (Throwable throwable) {
            try {
                if (filterInputStream == null) throw throwable;
                filterInputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {}
            throw throwable;
        }
        try {
            if (filterInputStream == null) return bl;
            filterInputStream.close();
            return bl;
        }
        catch (IOException iOException) {
            return bl;
        }
    }

    public static void a(String string) {
        a = string;
    }

    public static String a() {
        return a;
    }

    private static byte[] a(int[] nArray) {
        byte[] byArray = new byte[nArray.length << 2];
        for (int i = 0; i < nArray.length; ++i) {
            byArray[i << 2] = nArray[i] >> 24;
            byArray[(i << 2) + 1] = (byte)(nArray[i] >> 16);
            byArray[(i << 2) + 2] = (byte)(nArray[i] >> 8);
            byArray[(i << 2) + 3] = (byte)nArray[i];
        }
        return byArray;
    }

    public static Hashtable a() {
        Hashtable hashtable = new Hashtable();
        return hashtable;
    }

    public static void a(String string, String string2) {
        string = "sms://+" + string;
        try {
            String string3 = string;
            string3 = (MessageConnection)Connector.open((String)string3);
            TextMessage textMessage = (TextMessage)string3.newMessage("text");
            if (string != null) {
                textMessage.setAddress(string);
            }
            textMessage.setPayloadText(string2);
            string3.send((Message)textMessage);
            string3.close();
            return;
        }
        catch (Exception exception) {
            System.out.println("sendTextMessage " + exception);
            return;
        }
    }

    public static void b(String string, Object object) {
        string = "sms://+" + string;
        try {
            if (object != null) {
                Object object2 = null;
                object2 = string;
                MessageConnection messageConnection = (MessageConnection)Connector.open((String)object2);
                BinaryMessage binaryMessage = (BinaryMessage)messageConnection.newMessage("binary");
                if (string != null) {
                    binaryMessage.setAddress(string);
                }
                if (object instanceof Image) {
                    string = (Image)object;
                    object2 = bj.a((Image)string);
                    binaryMessage.setPayloadData((byte[])object2);
                } else {
                    binaryMessage.setPayloadData((byte[])object);
                }
                messageConnection.send((Message)binaryMessage);
                messageConnection.close();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static byte[] a(Image object) {
        int n2 = 0;
        int[] nArray = new int[object.getWidth() * object.getHeight()];
        object.getRGB(nArray, 0, object.getWidth(), 0, 0, object.getWidth(), object.getHeight());
        object = new byte[object.getWidth() * object.getHeight() << 2];
        for (int i = 0; i < nArray.length; ++i) {
            int n3 = nArray[i];
            int n4 = n3 >> 24;
            int n5 = n3 >> 16 & 0xFF;
            int n6 = n3 >> 8 & 0xFF;
            object[n2] = (Image)((byte)(n3 &= 0xFF));
            object[n2 + 1] = (Image)((byte)n6);
            object[n2 + 2] = (Image)((byte)n5);
            object[n2 + 3] = (Image)((byte)n4);
            n2 += 4;
        }
        return object;
    }

    public static Calendar a(String object) {
        Calendar calendar = null;
        try {
            object = bg.a(((String)object).trim(), " ");
            if (((bg)object).a() == 4) {
                Object object2 = ((bg)object).a();
                ((String)object2).substring(0, 3);
                object2 = ((bg)object).a();
                Object object3 = ((bg)object).a();
                object = ((bg)object).a();
                object = TimeZone.getTimeZone((String)object);
                object2 = bg.a((String)object2, "-");
                object3 = bg.a((String)object3, ":");
                int n2 = Integer.parseInt(((bg)object2).a());
                int n3 = 0;
                String string = ((bg)object2).a();
                int n4 = Integer.parseInt(((bg)object2).a());
                int n5 = Integer.parseInt(((bg)object3).a());
                int n6 = Integer.parseInt(((bg)object3).a());
                int n7 = Integer.parseInt(((bg)object3).a());
                if (string.equals("Jan")) {
                    n3 = 0;
                } else if (string.equals("Feb")) {
                    n3 = 1;
                } else if (string.equals("Mar")) {
                    n3 = 2;
                } else if (string.equals("Apr")) {
                    n3 = 3;
                } else if (string.equals("May")) {
                    n3 = 4;
                } else if (string.equals("Jun")) {
                    n3 = 5;
                } else if (string.equals("Jul")) {
                    n3 = 6;
                } else if (string.equals("Aug")) {
                    n3 = 7;
                } else if (string.equals("Sep")) {
                    n3 = 8;
                } else if (string.equals("Oct")) {
                    n3 = 9;
                } else if (string.equals("Nov")) {
                    n3 = 10;
                } else if (string.equals("Dec")) {
                    n3 = 11;
                }
                calendar = Calendar.getInstance((TimeZone)object);
                calendar.set(5, n2);
                calendar.set(2, n3);
                calendar.set(1, n4);
                calendar.set(11, n5);
                calendar.set(12, n6);
                calendar.set(13, n7);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return calendar;
    }

    public static String b() {
        StringBuffer stringBuffer = new StringBuffer();
        if (q.c.size() > 0) {
            Enumeration enumeration = q.c.keys();
            while (enumeration.hasMoreElements()) {
                Object object = (String)enumeration.nextElement();
                Hashtable hashtable = (Hashtable)q.c.get(object);
                if (!hashtable.containsKey("expires")) continue;
                stringBuffer.append("<k>" + (String)object + "</k>\t");
                object = hashtable.keys();
                while (object.hasMoreElements()) {
                    String string = (String)object.nextElement();
                    Object v2 = hashtable.get(string);
                    if (!(v2 instanceof String)) continue;
                    stringBuffer.append(string + "=" + v2 + "\t");
                }
            }
        }
        return stringBuffer.toString();
    }

    public static Hashtable a(String object) {
        Hashtable hashtable = new Hashtable();
        String string = "";
        Hashtable<String, Object> hashtable2 = new Hashtable<String, Object>();
        object = bg.a((String)object, "\t");
        while (((bg)object).hasMoreElements()) {
            Object object2 = ((bg)object).a();
            if (object2.indexOf("<k>") == 0) {
                string = object2.substring(3, object2.length() - 4);
                hashtable2 = new Hashtable();
                hashtable.put(string, hashtable2);
                continue;
            }
            object2 = bg.a((String)object2, "=");
            object2 = object2.a();
            String string2 = object2[0];
            String string3 = object2[1];
            if (string2.equals("cookie")) {
                string3 = string3 + "=" + (((String[])object2).length > 2 ? object2[2] : "");
            } else if (string2.equals("expires")) {
                object2 = bj.a(string3);
                Calendar calendar = Calendar.getInstance();
                if (calendar.after(object2)) {
                    hashtable.remove(string);
                } else {
                    hashtable2.put("calendar", object2);
                }
            }
            hashtable2.put(string2, string3);
        }
        return hashtable;
    }

    public static void a(OutputStream outputStream, int n2) {
        if (a == null) {
            a = new byte[5];
        }
        int n3 = 4;
        do {
            bj.a[n3] = (byte)(n2 & 0x7F | (4 != n3 ? 128 : 0));
            --n3;
        } while ((n2 >>= 7) > 0);
        outputStream.write(a, n3 + 1, 4 - n3);
    }

    public static String c(String string) {
        int n2;
        char[] cArray = string.toCharArray();
        int n3 = n2 = cArray.length;
        while (n2 > 0 && cArray[n2 - 1] <= ' ') {
            --n2;
        }
        if (n2 < n3) {
            return string.substring(0, n2);
        }
        return string;
    }

    static {
        Calendar.getInstance();
        a = 0L;
        a = new Random();
        a = new String[]{"JPEG", "JPG"};
    }
}
