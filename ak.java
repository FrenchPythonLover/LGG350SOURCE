/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ak {
    private static byte[][] a = new byte[16][];
    public static int a;
    public static int b;
    public static bd[] a;

    public static void a() {
        if (a != null) {
            for (int i = 0; i < 16; ++i) {
                if (a[i] != null) {
                    int n = a[i].a();
                    for (int j = 0; j < n; ++j) {
                        a[i].a(j).a();
                    }
                    a[i].a();
                }
                ak.a[i] = null;
            }
        }
        a = null;
        a = null;
    }

    public static void b() {
        if (a != null) {
            int n;
            for (n = 0; n < 16; ++n) {
                if (n != 13 && a[n] != null) {
                    a[n].a();
                }
                ak.a[n] = null;
            }
            if (a[13] != null) {
                n = a[13].a();
                bc bc2 = null;
                for (int i = 0; i < n; ++i) {
                    bc2 = a[13].a(i);
                    bc2.d(false);
                }
            }
        }
        a = new byte[16][];
    }

    public static void a(int n) {
        if (a != null && a[13] != null) {
            a[13].a();
        }
    }

    public static bd[] a(int n, bc bc2, bd[] bdArray) {
        if (bdArray == null) {
            bdArray = new bd[16];
        }
        if (bdArray[n] == null) {
            bdArray[n] = new bd();
        }
        bdArray[n].a(bc2);
        return bdArray;
    }

    public static void a(bd[] bdArray) {
        a = bdArray;
    }

    public static void a(int n, bc bc2) {
        if (a[n] == null) {
            ak.a[n] = new bd();
        }
        a[n].a(bc2);
    }

    public static void a(bc bc2) {
        if (a != null) {
            for (int i = 0; i < 16 && !ak.a(i, bc2); ++i) {
            }
        }
    }

    public static boolean a(int n, bc bc2) {
        if (a[n] == null) {
            ak.a[n] = new bd();
        }
        return a[n].a(bc2);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n = 0;
        bc bc2 = null;
        for (n5 = 0; n5 < 16; ++n5) {
            if (a[n5] == null) continue;
            n = a[n5].a();
            for (n6 = 0; n6 < n; ++n6) {
                bc2 = a[n5].a(n6);
                if (!bc2.c()) continue;
                a = 0;
                b = 0;
                if (!bc2.h) continue;
                if (n5 == 5) {
                    bc2.a(graphics, 0, 0, bc2.h, bc2.i, 0, 0, n7, n8);
                    continue;
                }
                bc2.a(graphics, 0, 0, n3, n4, 0, 0, n7, n8);
            }
        }
    }

    public static void a(int n, int n2) {
        int n3 = 0;
        for (int i = 0; i < 16; ++i) {
            if (a[i] == null) continue;
            n3 = a[i].a();
            for (int j = 0; j < n3; ++j) {
                a[i].a(j).a(n, n2);
                a[i].a(j).a(n, n2, 0, true);
            }
        }
        if (au.a != null) {
            au.a.a(n, n2, 0, true);
        }
    }

    public static void c() {
        int n = 0;
        for (int i = 0; i < 16; ++i) {
            if (a[i] == null) continue;
            n = a[i].a();
            for (int j = 0; j < n; ++j) {
                a[i].a(j).r();
            }
        }
        if (au.a != null) {
            au.a.r();
        }
    }

    public static bc a(String string) {
        bc bc2 = null;
        if (string != null) {
            bc bc3 = null;
            for (int i = 0; i < 16; ++i) {
                if (a[i] == null) continue;
                int n = a[i].a();
                while (--n >= 0) {
                    bc3 = a[i].a(n);
                    if (bc3 instanceof ai) {
                        bc2 = ((ai)bc3).a(string);
                    } else if (string.equals(bc3.e())) {
                        bc2 = bc3;
                    }
                    if (bc2 == null) continue;
                    return bc2;
                }
            }
            if (au.a != null && string.equals(au.a.g)) {
                return au.a;
            }
        }
        return bc2;
    }

    public static ai a(int n, int n2, int n3) {
        bc bc2 = null;
        if (a[n] != null) {
            int n4 = a[n].a();
            while (--n4 >= 0) {
                bc2 = a[n].a(n4);
                if (!(bc2 instanceof ai) || !bc2.c()) continue;
                return ((ai)bc2).a(0, n3);
            }
        }
        return null;
    }

    public static ai a(int n, int n2) {
        bc bc2 = null;
        if (a[n] != null) {
            int n3 = a[n].a();
            while (--n3 >= 0) {
                bc2 = a[n].a(n3);
                if (!(bc2 instanceof ai) || !bc2.c()) continue;
                return ((ai)bc2).a(n2);
            }
        }
        return null;
    }

    public static void a(int n, Vector vector) {
        bc bc2 = null;
        if (a[n] != null) {
            int n2 = a[n].a();
            while (--n2 >= 0) {
                bc2 = a[n].a(n2);
                if (!(bc2 instanceof ai)) continue;
                ((ai)bc2).a(false, vector, new Vector());
            }
        }
    }

    public static void b(int n) {
        bc bc2 = null;
        if (a[n] != null) {
            int n2 = a[n].a();
            while (--n2 >= 0) {
                bc2 = a[n].a(n2);
                if (!(bc2 instanceof ai)) continue;
                ((ai)bc2).b(true);
            }
        }
    }

    public static byte[] a(int n) {
        return a[n];
    }

    public static void a(int n, byte[] byArray) {
        ak.a[n] = byArray;
    }

    static {
        a = new bd[16];
    }
}
