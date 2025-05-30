/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class av
extends ag {
    public static final int[] a;
    public boolean a;
    public byte a;
    public int[] b;
    public String a;
    public int a;
    public int[] c;
    public int[] d;
    public int b;
    public int[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = -1;
    public int i = Integer.MIN_VALUE;
    public boolean b;
    public int j;
    public int k;
    public byte b;
    protected long a;
    public byte c;
    public int[] j = Integer.MIN_VALUE;
    public int l = 0xE6E6E6;
    public int m = 8;
    public boolean c;
    public int[] k = 0;
    public int n = 255;
    public boolean d;
    public boolean e = -1;
    public int o = 255;
    public int p = 0xFFCC66;
    public int q = 4;
    public int r;
    public boolean f = -1;
    public int s = -1;
    public boolean g = -1;
    public int t = -1;
    private String b;
    public int u = 64;
    private String c;
    public int v = 0;
    private String d;
    public int w = 8;
    public int x;
    public byte d;
    public int y = Integer.MIN_VALUE;
    public int z = Integer.MIN_VALUE;
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public String[] a;
    public av a;
    public static int C;
    private bc a = null;

    public final void a() {
        if (this.a != null) {
            this.a.a();
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final void b() {
        this.a = 0;
        this.b = null;
        this.a = null;
        this.a = 0;
        this.c = null;
        this.d = null;
        this.b = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = Integer.MIN_VALUE;
        this.b = false;
        this.j = Integer.MIN_VALUE;
        this.k = 0;
        this.b = 0;
        this.a = 0L;
        this.c = 0;
        this.j = null;
        this.l = 0xE6E6E6;
        this.m = 8;
        this.a = false;
        this.c = false;
        this.k = null;
        this.n = 255;
        this.o = 255;
        this.p = 0xFFCC66;
        this.q = 4;
        this.f = false;
        this.s = -1;
        this.g = false;
        this.t = -1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.v = 0;
        this.u = 64;
        this.w = 8;
        this.x = 0;
        this.d = 0;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        if (this.a != null) {
            this.a.o = false;
        }
    }

    public final void a(String string) {
        Object object = null;
        Object object2 = null;
        int n2 = string.indexOf(58);
        int n3 = string.indexOf(59);
        while (n2 != -1) {
            object = string.substring(0, n2).trim().toUpperCase();
            if (n3 != -1) {
                object2 = string.substring(n2 + 1, n3).trim();
                string = string.substring(n3 + 1);
            } else {
                object2 = string.substring(n2 + 1);
                string = "";
            }
            n2 = string.indexOf(58);
            n3 = string.indexOf(59);
            if ("MARGIN".equals(object)) {
                this.k = bj.a((String)object2, false, Integer.MIN_VALUE, 0);
                this.k = av.a(this.k);
            }
            if ("BACKGROUND-COLOR".equals(object)) {
                this.e((String)object2);
                continue;
            }
            if ("BORDER-COLOR".equals(object)) {
                this.d = bj.a((String)object2, true, Integer.MIN_VALUE, 0);
                this.d = av.a(this.d);
                continue;
            }
            if ("SCROLLBAR-FACE-COLOR".equals(object)) {
                this.j = bj.a((String)object2, true, Integer.MIN_VALUE, 0);
                this.a |= 0x8000000L;
                continue;
            }
            if ("BORDER-WIDTH".equals(object)) {
                this.c = bj.a((String)object2, false, Integer.MIN_VALUE, 0);
                this.c = av.a(this.c);
                continue;
            }
            if ("PADDING".equals(object)) {
                this.e = bj.a((String)object2, false, Integer.MIN_VALUE, 0);
                this.e = av.a(this.e);
                continue;
            }
            if ("DROP-SHADOW".equals(object)) {
                object = this;
                int n4 = ((String)object2).indexOf(32);
                String string2 = ((String)object2).substring(0, n4).toUpperCase();
                object2 = bj.a(((String)object2).substring(n4 + 1), true, Integer.MIN_VALUE, 0);
                if ("TOP".equals(string2)) {
                    ((av)object).f = av.a((int[])object2, 1, -1, 0, 0);
                    continue;
                }
                if ("BOTTOM".equals(string2)) {
                    ((av)object).h = av.a((int[])object2, 1, -1, 0, 0);
                    continue;
                }
                if ("LEFT".equals(string2)) {
                    ((av)object).i = av.a((int[])object2, 1, -1, 0, 0);
                    continue;
                }
                if ("RIGHT".equals(string2)) {
                    ((av)object).g = av.a((int[])object2, 1, -1, 0, 0);
                    continue;
                }
                if ("TOP-LEFT".equals(string2)) {
                    ((av)object).f = av.a((int[])object2, -1, -1, 1, 0);
                    ((av)object).i = av.a((int[])object2, -1, -1, 1, 0);
                    continue;
                }
                if ("TOP-RIGHT".equals(string2)) {
                    ((av)object).f = av.a((int[])object2, 1, 1, 0, -1);
                    ((av)object).g = av.a((int[])object2, -1, -1, 1, 0);
                    continue;
                }
                if ("BOTTOM-LEFT".equals(string2)) {
                    ((av)object).h = av.a((int[])object2, -1, -1, 1, 0);
                    ((av)object).i = av.a((int[])object2, 1, 1, 0, -1);
                    continue;
                }
                if (!"BOTTOM-RIGHT".equals(string2)) continue;
                ((av)object).h = av.a((int[])object2, 1, 1, 0, -1);
                ((av)object).g = av.a((int[])object2, 1, 1, 0, -1);
                continue;
            }
            if ("BACKGROUND-IMAGE".equals(object)) {
                this.f((String)object2);
                continue;
            }
            if ("COLOR".equals(object)) {
                this.a = bj.c((String)object2, 0);
                this.a |= 4L;
                continue;
            }
            if ("HIGHLIGHT-COLOR".equals(object)) {
                this.p = bj.c((String)object2, 0);
                this.a |= 0x40000000L;
                continue;
            }
            if ("BORDER-ARC".equals(object)) {
                this.b = bj.b((String)object2, 0);
                this.a |= 0x40L;
                continue;
            }
            if ("ALIGN".equals(object)) {
                this.n((String)object2);
                continue;
            }
            if ("MAX-WIDTH".equals(object)) {
                this.e = bj.b((String)object2, -1);
                this.a |= 0x80L;
                continue;
            }
            if ("MAX-HEIGHT".equals(object)) {
                this.f = bj.b((String)object2, -1);
                this.a |= 0x100L;
                continue;
            }
            if ("MIN-WIDTH".equals(object)) {
                this.g = bj.b((String)object2, -1);
                this.a |= 0x400L;
                continue;
            }
            if ("MIN-HEIGHT".equals(object)) {
                this.h = bj.b((String)object2, -1);
                this.a |= 0x200L;
                continue;
            }
            if ("WIDTH".equals(object)) {
                this.g((String)object2);
                continue;
            }
            if ("HEIGHT".equals(object)) {
                this.h((String)object2);
                continue;
            }
            if ("BACKGROUND-POSITION".equals(object)) {
                object = bg.a((String)object2);
                this.i = bj.b(((bg)object).a(), Integer.MIN_VALUE);
                this.a |= 0x1000L;
                if (!((bg)object).hasMoreElements()) continue;
                this.j = bj.b(((bg)object).a(), Integer.MIN_VALUE);
                this.a |= 0x2000L;
                continue;
            }
            if ("TOP".equals(object)) {
                this.a((String)object2, 0);
                continue;
            }
            if ("BOTTOM".equals(object)) {
                this.b((String)object2, 0);
                continue;
            }
            if ("LEFT".equals(object)) {
                this.c((String)object2, 0);
                continue;
            }
            if ("RIGHT".equals(object)) {
                this.d((String)object2, 0);
                continue;
            }
            if ("BACKGROUND-OPACITY".equals(object)) {
                if (((String)object2).length() > 1 && ((String)object2).lastIndexOf(37) == ((String)object2).length() - 1) {
                    object2 = ((String)object2).substring(0, ((String)object2).length() - 1);
                }
                this.n = 255 * Math.min(100, bj.a((String)object2, -1)) / 100;
                this.a |= 0x80000L;
                continue;
            }
            if ("OPACITY".equals(object)) {
                this.o = 255 * Math.min(100, bj.a((String)object2, -1)) / 100;
                this.a |= 0x100000L;
                continue;
            }
            if ("BORDER-STYLE".equals(object)) {
                this.i((String)object2);
                continue;
            }
            if ("SCROLLBAR-HORIZONTAL-ORIENTATION".equals(object)) {
                this.j((String)object2);
                continue;
            }
            if ("SCROLLBAR-TRACK-COLOR".equals(object)) {
                this.l = bj.c((String)object2, 0);
                this.a |= 0x10000000L;
                continue;
            }
            if ("SCROLLBAR-ALIGNMENT".equals(object)) {
                this.k((String)object2);
                this.a |= 0x20000000L;
                continue;
            }
            if ("FONT-FAMILY".equals(object)) {
                object = this;
                this.b = ((String)object2).toUpperCase().intern();
                ((av)object).u = "SYSTEM".equals(((av)object).b) || "DEFAULT".equals(((av)object).b) ? 64 : ((av)object).b.hashCode();
                ((av)object).a |= 0x200000L;
                continue;
            }
            if ("FONT-STYLE".equals(object)) {
                object = this;
                this.c = ((String)object2).toUpperCase().trim().intern();
                ((av)object).v = "BOLD".equals(((av)object).c) ? 1 : ("ITALIC".equals(((av)object).c) ? 2 : 0);
                ((av)object).a |= 0x400000L;
                continue;
            }
            if ("FONT-SIZE".equals(object)) {
                object = this;
                this.d = ((String)object2).toUpperCase().intern();
                ((av)object).w = "LARGE".equals(((av)object).d) ? 16 : ("MEDIUM".equals(((av)object).d) ? 0 : 8);
                ((av)object).a |= 0x800000L;
                continue;
            }
            if ("TEXT-DECORATION".equals(object)) {
                this.o((String)object2);
                continue;
            }
            if ("TEXT-ALIGN".equals(object)) {
                this.p((String)object2);
                continue;
            }
            if ("POSITION".equals(object)) {
                this.q((String)object2);
                continue;
            }
            if ("VISIBILITY".equals(object)) {
                this.m((String)object2);
                continue;
            }
            if ("BACKGROUND-REPEAT".equals(object)) {
                this.l((String)object2);
                continue;
            }
            if ("FOCUS".equals(object)) {
                this.a = this.a & 0xFFFFFFFFFFFFFFFEL | ("DISABLE".equals(object2) ? 1L : 0L);
                this.a |= 0x400000000L;
                continue;
            }
            if ("SCROLLBAR".equals(object)) {
                object = this;
                ((av)object).c = "AUTO".equals(object2 = ((String)object2).toUpperCase()) ? (byte)2 : ("TRUE".equals(object2) ? (byte)1 : 0);
                ((av)object).a |= 0x800000000L;
                continue;
            }
            if ("AUTO-SCROLL".equals(object)) {
                this.c = bj.a((String)object2);
                this.a |= 0x1000000000L;
                continue;
            }
            if ("BACKGROUND-ATTACHMENT".equals(object)) {
                this.d((String)object2);
                continue;
            }
            if ("BORDER".equals(object)) {
                this.c((String)object2);
                continue;
            }
            if (!"BACKGROUND".equals(object)) continue;
            this.b((String)object2);
        }
        if (am.a && am.a(this.u, this.v, this.w, null) == null) {
            if (this.b == null) {
                this.b = "DEFAULT";
            }
            if (this.c == null) {
                this.c = "PLAIN";
            }
            if (this.d == null) {
                this.d = "MEDIUM";
            }
            q.c.addElement(q.a + this.b + "-" + this.c + "-" + this.d + ".mbf");
        }
    }

    private void a(String string, int n2) {
        this.y = string != null ? bj.b(string, Integer.MIN_VALUE) : n2;
        this.a |= 0x8000000000L;
        this.A = Integer.MIN_VALUE;
        this.a &= 0xFFFFFDFFFFFFFFFFL;
    }

    private void b(String string, int n2) {
        this.A = string != null ? bj.b(string, Integer.MIN_VALUE) : n2;
        this.a |= 0x20000000000L;
        this.y = Integer.MIN_VALUE;
        this.a &= 0xFFFFFF7FFFFFFFFFL;
    }

    private void c(String string, int n2) {
        this.z = string != null ? bj.b(string, Integer.MIN_VALUE) : n2;
        this.a |= 0x10000000000L;
        this.B = Integer.MIN_VALUE;
        this.a &= 0xFFFFFBFFFFFFFFFFL;
    }

    private void d(String string, int n2) {
        this.B = string != null ? bj.b(string, Integer.MIN_VALUE) : n2;
        this.a |= 0x40000000000L;
        this.z = Integer.MIN_VALUE;
        this.a &= 0xFFFFFEFFFFFFFFFFL;
    }

    private void b(String object) {
        object = bg.a((String)object);
        this.e(((bg)object).a());
        if (((bg)object).hasMoreElements()) {
            this.f(((bg)object).a());
            if (((bg)object).hasMoreElements()) {
                this.l(((bg)object).a());
                if (((bg)object).hasMoreElements()) {
                    this.d(((bg)object).a());
                    if (((bg)object).hasMoreElements()) {
                        this.i = bj.b(((bg)object).a(), Integer.MIN_VALUE);
                        this.a |= 0x1000L;
                        if (((bg)object).hasMoreElements()) {
                            this.j = bj.b(((bg)object).a(), Integer.MIN_VALUE);
                            this.a |= 0x2000L;
                        }
                    }
                }
            }
        }
    }

    private void c(String object) {
        object = bg.a((String)object);
        this.c = bj.a(((bg)object).a(), false, Integer.MIN_VALUE, 0);
        this.c = av.a(this.c);
        if (((bg)object).hasMoreElements()) {
            this.i(((bg)object).a());
            if (((bg)object).hasMoreElements()) {
                this.d = bj.a(((bg)object).a(), true, Integer.MIN_VALUE, 0);
                this.d = av.a(this.d);
            }
        }
    }

    private void d(String string) {
        if ("FIXED".equals(string = string.toUpperCase())) {
            this.b = true;
            this.a |= 0x2000000000L;
        }
    }

    private void e(String string) {
        this.d = false;
        this.e = true;
        this.b = bj.a(string, true, Integer.MIN_VALUE, 0);
    }

    private void f(String string) {
        this.a = string;
        if (this.a.length() > 5 && "url(".equals(string = this.a.substring(0, 4).toLowerCase()) && this.a.lastIndexOf(41) == this.a.length() - 1) {
            this.a = this.a.substring(4, this.a.length() - 1);
        }
        an.a(bj.a(q.a(), this.a, false), 2, null);
        this.d = false;
        this.e = true;
        this.a |= 2L;
    }

    private void g(String string) {
        if ("*".equals(string = string.trim())) {
            this.s = Integer.MIN_VALUE;
        } else if (string.length() > 1 && string.lastIndexOf(37) == string.length() - 1) {
            this.s = bj.a(string.substring(0, string.length() - 1), -1);
            if (this.s < 0) {
                this.s = -1;
            } else if (this.s > 100) {
                this.s = 100;
            }
            this.f = true;
        } else {
            this.s = string.length() > 2 && string.indexOf("px") == string.length() - 2 ? bj.a(string.substring(0, string.length() - 2), -1) : bj.a(string, -1);
        }
        this.a |= 0x100000000L;
    }

    private void h(String string) {
        if ("*".equals(string = string.trim())) {
            this.t = Integer.MIN_VALUE;
        } else if (string.length() > 1 && string.lastIndexOf(37) == string.length() - 1) {
            this.t = bj.a(string.substring(0, string.length() - 1), -1);
            if (this.t < 0) {
                this.t = -1;
            } else if (this.t > 100) {
                this.t = 100;
            }
            this.g = true;
        } else {
            this.t = string.length() > 2 && string.indexOf("px") == string.length() - 2 ? bj.a(string.substring(0, string.length() - 2), -1) : bj.a(string, -1);
        }
        this.a |= 0x200000000L;
    }

    private void i(String string) {
        this.k = "DOTTED".equals(string.toUpperCase()) ? 1 : 0;
        this.a |= 0x2000000L;
    }

    private void j(String string) {
        this.a = "HORIZONTAL".equals(string.toUpperCase());
        this.a |= 0x100000000000L;
    }

    private void k(String string) {
        this.m = "LEFT".equals(string.toUpperCase()) ? 4 : 8;
    }

    private void l(String string) {
        if ("REPEAT-X".equals(string = string.toUpperCase())) {
            this.a = 1;
            this.a |= 0x800L;
            return;
        }
        if ("REPEAT-Y".equals(string)) {
            this.a = (byte)2;
            this.a |= 0x800L;
            return;
        }
        if ("REPEAT".equals(string)) {
            this.a = 0;
            this.a |= 0x800L;
            return;
        }
        this.a = (byte)3;
        this.a |= 0x800L;
    }

    private void m(String string) {
        if ("HIDDEN".equals(string = string.toUpperCase())) {
            this.b = (byte)2;
            this.a |= 0x4000000L;
            return;
        }
        if ("COLLAPSE".equals(string)) {
            this.b = 1;
            this.a |= 0x4000000L;
            return;
        }
        this.b = 0;
        this.a |= 0x4000000L;
    }

    private static int[] a(int[] nArray, int n2, int n3, int n4, int n5) {
        int[] nArray2 = new int[nArray.length * 3];
        int n6 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            n6 = i * 3;
            nArray2[n6] = n2 * (i + 1);
            nArray2[n6 + 1] = n3 * (i + 1);
            nArray2[n6 + 2] = nArray[i];
        }
        int n7 = (nArray.length - 1) * 3;
        nArray2[n7] = nArray2[n7] + n4;
        int n8 = (nArray.length - 1) * 3 + 1;
        nArray2[n8] = nArray2[n8] + n5;
        return nArray2;
    }

    private static String a(int n2) {
        switch (n2) {
            case 4: {
                return "left";
            }
            case 8: {
                return "right";
            }
            case 16: {
                return "top";
            }
            case 32: {
                return "bottom";
            }
            case 1: {
                return "center";
            }
            case 2: {
                return "middle";
            }
        }
        return null;
    }

    private void n(String string) {
        int n2 = string.indexOf(32);
        String string2 = null;
        while (n2 != -1 || string.length() > 0) {
            string2 = n2 != -1 ? string.substring(0, n2) : string;
            if ("LEFT".equals(string2 = string2.trim().toUpperCase())) {
                this.c = 4;
                this.a |= 0x10L;
            } else if ("RIGHT".equals(string2)) {
                this.c = 8;
                this.a |= 0x10L;
            } else if ("CENTER".equals(string2)) {
                this.c = 1;
                this.a |= 0x10L;
            } else if ("TOP".equals(string2)) {
                this.d = 16;
                this.a |= 0x20L;
            } else if ("BOTTOM".equals(string2)) {
                this.d = 32;
                this.a |= 0x20L;
            } else if ("MIDDLE".equals(string2)) {
                this.d = 2;
                this.a |= 0x20L;
            }
            if (n2 == -1) break;
            string = string.substring(n2 + 1);
            n2 = string.indexOf(32);
        }
    }

    private void o(String string) {
        if ("UNDERLINE".equals(string = string.toUpperCase().trim())) {
            this.x = 1;
            this.a |= 0x1000000L;
            return;
        }
        if ("OVERLINE".equals(string)) {
            this.x = 2;
            this.a |= 0x1000000L;
            return;
        }
        if ("LINE-THROUGH".equals(string)) {
            this.x = 3;
            this.a |= 0x1000000L;
            return;
        }
        this.x = 0;
        this.a |= 0x1000000L;
    }

    private void p(String string) {
        if ("RIGHT".equals(string = string.toUpperCase())) {
            this.q = 8;
        } else if ("CENTER".equals(string)) {
            this.q = 1;
        }
        this.a |= 0x80000000L;
    }

    private void q(String string) {
        this.d = "FIXED".equals(string = string.toUpperCase()) ? (byte)3 : ("ABSOLUTE".equals(string) ? (byte)2 : ("RELATIVE".equals(string) ? (byte)1 : 0));
        this.a |= 0x4000000000L;
    }

    public final void a(av av2) {
        if (av2.k != null) {
            this.k = bj.a(av2.k);
        }
        if (av2.b != null && !av2.b.equals(this.b)) {
            this.d = false;
            this.e = true;
            this.b = bj.a(av2.b);
        }
        if (av2.c != null) {
            this.c = bj.a(av2.c);
        }
        if (av2.d != null) {
            this.d = bj.a(av2.d);
        }
        if (av2.e != null) {
            this.e = bj.a(av2.e);
        }
        if (av2.f != null) {
            this.f = bj.a(av2.f);
            if (this.a != null) {
                this.a.o = true;
            }
        }
        if (av2.g != null) {
            this.g = bj.a(av2.g);
            if (this.a != null) {
                this.a.o = true;
            }
        }
        if (av2.h != null) {
            this.h = bj.a(av2.h);
            if (this.a != null) {
                this.a.o = true;
            }
        }
        if (av2.i != null) {
            this.i = bj.a(av2.i);
            if (this.a != null) {
                this.a.o = true;
            }
        }
        if (av2.a != null && !av2.a.equals(this.a)) {
            this.d = false;
            this.e = true;
            this.a = bj.b(av2.a);
        }
        if (0L != (av2.a & 4L)) {
            this.a = av2.a;
            this.a |= 4L;
        }
        if (0L != (av2.a & 0x40L)) {
            this.b = av2.b;
            this.a |= 0x40L;
        }
        if (0L != (av2.a & 0x10L)) {
            this.c = av2.c;
            this.a |= 0x10L;
        }
        if (0L != (av2.a & 0x20L)) {
            this.d = av2.d;
            this.a |= 0x20L;
        }
        if (0L != (av2.a & 0x80L)) {
            this.e = av2.e;
            this.a |= 0x80L;
        }
        if (0L != (av2.a & 0x100L)) {
            this.f = av2.f;
            this.a |= 0x100L;
        }
        if (0L != (av2.a & 0x200L)) {
            this.h = av2.h;
            this.a |= 0x200L;
        }
        if (0L != (av2.a & 0x400L)) {
            this.g = av2.g;
            this.a |= 0x400L;
        }
        if (0L != (av2.a & 0x100000000L)) {
            this.f = av2.f;
            this.s = av2.s;
            this.a |= 0x100000000L;
        }
        if (0L != (av2.a & 0x200000000L)) {
            this.g = av2.g;
            this.t = av2.t;
            this.a |= 0x200000000L;
        }
        if (0L != (av2.a & 0x800L)) {
            this.a = av2.a;
            this.a |= 0x800L;
        }
        if (0L != (av2.a & 0x1000L)) {
            this.i = av2.i;
            this.a |= 0x1000L;
        }
        if (0L != (av2.a & 0x2000L)) {
            this.j = av2.j;
            this.a |= 0x2000L;
        }
        if (0L != (av2.a & 0x80000L)) {
            this.n = av2.n;
            this.a |= 0x80000L;
        }
        if (0L != (av2.a & 0x100000L)) {
            this.o = av2.o;
            this.a |= 0x100000L;
        }
        if (0L != (av2.a & 0x200000L)) {
            this.u = av2.u;
            this.a |= 0x200000L;
        }
        if (0L != (av2.a & 0x400000L)) {
            this.v = av2.v;
            this.a |= 0x400000L;
        }
        if (0L != (av2.a & 0x800000L)) {
            this.w = av2.w;
            this.a |= 0x800000L;
        }
        if (0L != (av2.a & 0x1000000L)) {
            this.x = av2.x;
            this.a |= 0x1000000L;
        }
        if (0L != (av2.a & 0x2000000L)) {
            this.k = av2.k;
            this.a |= 0x2000000L;
        }
        if (0L != (av2.a & 0x4000000L)) {
            this.b = av2.b;
            this.a |= 0x4000000L;
        }
        if (0L != (av2.a & 0x8000000L)) {
            this.j = av2.j;
            this.a |= 0x8000000L;
        }
        if (0L != (av2.a & 0x10000000L)) {
            this.l = av2.l;
            this.a |= 0x10000000L;
        }
        if (0L != (av2.a & 0x100000000000L)) {
            this.a = av2.a;
            this.a |= 0x100000000000L;
        }
        if (0L != (av2.a & 0x20000000L)) {
            this.m = av2.m;
            this.a |= 0x20000000L;
        }
        if (0L != (av2.a & 0x40000000L)) {
            this.p = av2.p;
            this.a |= 0x40000000L;
        }
        if (0L != (av2.a & 0x80000000L)) {
            this.q = av2.q;
            this.a |= 0x80000000L;
        }
        if (0L != (av2.a & 0x400000000L)) {
            this.a = this.a & 0xFFFFFFFFFFFFFFFEL | av2.a & 1L;
            this.a |= 0x400000000L;
        }
        if (0L != (av2.a & 0x800000000L)) {
            this.c = av2.c;
            this.a |= 0x800000000L;
        }
        if (0L != (av2.a & 0x1000000000L)) {
            this.c = av2.c;
            this.a |= 0x1000000000L;
        }
        if (0L != (av2.a & 0x2000000000L)) {
            this.b = av2.b;
            this.a |= 0x2000000000L;
        }
        if (0L != (av2.a & 0x4000000000L)) {
            this.d = av2.d;
            this.a |= 0x4000000000L;
        }
        if (0L != (av2.a & 0x8000000000L)) {
            this.a((String)null, av2.y);
        }
        if (0L != (av2.a & 0x10000000000L)) {
            this.c((String)null, av2.z);
        }
        if (0L != (av2.a & 0x20000000000L)) {
            this.b((String)null, av2.A);
        }
        if (0L != (av2.a & 0x40000000000L)) {
            this.d(null, av2.B);
        }
    }

    protected final void b(av av2) {
        if (av2 == null) {
            return;
        }
        if ((this.a & 4L) == 0L && (av2.a & 4L) != 0L) {
            this.a = av2.a;
            this.a |= 4L;
        }
        if ((this.a & 0x100000L) == 0L && (av2.a & 0x100000L) != 0L) {
            this.o = av2.o;
            this.a |= 0x100000L;
        }
        if ((this.a & 0x200000L) == 0L && (av2.a & 0x200000L) != 0L) {
            this.u = av2.u;
            this.a |= 0x200000L;
        }
        if ((this.a & 0x400000L) == 0L && (av2.a & 0x400000L) != 0L) {
            this.v = av2.v;
            this.a |= 0x400000L;
        }
        if ((this.a & 0x800000L) == 0L && (av2.a & 0x800000L) != 0L) {
            this.w = av2.w;
            this.a |= 0x800000L;
        }
        if ((this.a & 0x1000000L) == 0L && (av2.a & 0x1000000L) != 0L) {
            this.x = av2.x;
            this.a |= 0x1000000L;
        }
        if ((this.a & 0x2000000L) == 0L && (av2.a & 0x2000000L) != 0L) {
            this.k = av2.k;
            this.a |= 0x2000000L;
        }
        if ((this.a & 0x40000000L) == 0L && (av2.a & 0x40000000L) != 0L) {
            this.p = av2.p;
            this.a |= 0x40000000L;
        }
        if ((this.a & 0x80000000L) == 0L && (av2.a & 0x80000000L) != 0L) {
            this.q = av2.q;
            this.a |= 0x80000000L;
        }
    }

    private static int[] a(int[] nArray) {
        if (nArray != null) {
            switch (nArray.length) {
                case 1: {
                    return new int[]{nArray[0], nArray[0], nArray[0], nArray[0]};
                }
                case 2: {
                    return new int[]{nArray[0], nArray[1], nArray[0], nArray[1]};
                }
                case 3: {
                    return new int[]{nArray[0], nArray[1], nArray[2], 0};
                }
            }
        }
        return nArray;
    }

    public final boolean a(ah object, int n2) {
        switch (n2) {
            case -364: {
                String string;
                byte by = this.d;
                switch (by) {
                    case 3: {
                        string = "fixed";
                        break;
                    }
                    case 2: {
                        string = "absolute";
                        break;
                    }
                    case 1: {
                        string = "relative";
                        break;
                    }
                    default: {
                        string = "static";
                    }
                }
                ((ah)object).a(string);
                break;
            }
            case -357: {
                ((ah)object).a(!this.b ? "scroll" : "fixed");
                break;
            }
            case -318: {
                ah ah2 = object;
                object = this;
                String string = null;
                switch (((av)object).a) {
                    case 1: {
                        string = "repeat-x";
                        break;
                    }
                    case 2: {
                        string = "repeat-y";
                        break;
                    }
                    case 0: {
                        string = "repeat";
                        break;
                    }
                    case 3: {
                        string = "no-repeat";
                    }
                }
                ah2.a(string);
                break;
            }
            case -320: {
                ((ah)object).a(this.a);
                break;
            }
            case -330: {
                ((ah)object).a(av.a(this.c));
                break;
            }
            case -331: {
                ((ah)object).a(av.a(this.d));
                break;
            }
            case -332: {
                ((ah)object).a(av.a(this.c) + " " + av.a(this.d));
                break;
            }
            case -339: {
                int n3 = this.k;
                ((ah)object).a(n3 == 1 ? "dotted" : "solid");
                break;
            }
            case -340: {
                String string;
                byte by = this.b;
                switch (by) {
                    case 2: {
                        string = "hidden";
                        break;
                    }
                    case 1: {
                        string = "collapse";
                        break;
                    }
                    default: {
                        string = "visible";
                    }
                }
                ((ah)object).a(string);
                break;
            }
            case -346: {
                ah ah3 = object;
                object = this;
                ah3.a(((av)object).m == 8 ? "right" : "left");
                break;
            }
            case -353: {
                ((ah)object).a(this.b);
                break;
            }
            case -354: {
                ((ah)object).a(this.d);
                break;
            }
            case -352: {
                ((ah)object).a(this.c);
                break;
            }
            case -355: {
                String string;
                int n4 = this.x;
                switch (n4) {
                    case 1: {
                        string = "underline";
                        break;
                    }
                    case 2: {
                        string = "overline";
                        break;
                    }
                    case 3: {
                        string = "line-through";
                        break;
                    }
                    default: {
                        string = "none";
                    }
                }
                ((ah)object).a(string);
                break;
            }
            case -356: {
                String string;
                int n5 = this.q;
                switch (n5) {
                    case 8: {
                        string = "RIGHT";
                        break;
                    }
                    case 1: {
                        string = "CENTER";
                        break;
                    }
                    default: {
                        string = "LEFT";
                    }
                }
                ((ah)object).a(string);
                break;
            }
            case -347: {
                ((ah)object).a(this.k);
                break;
            }
            case -319: {
                ((ah)object).a(this.b);
                break;
            }
            case -323: {
                ((ah)object).a(this.d);
                break;
            }
            case -322: {
                ((ah)object).a(this.c);
                break;
            }
            case -325: {
                ((ah)object).a(this.e);
                break;
            }
            case -326: {
                ((ah)object).a(this.f);
                break;
            }
            case -327: {
                ((ah)object).a(this.g);
                break;
            }
            case -328: {
                ((ah)object).a(this.h);
                break;
            }
            case -329: {
                ((ah)object).a(this.i);
                break;
            }
            case -344: {
                ((ah)object).a(this.j);
                break;
            }
            case -365: {
                ((ah)object).a(this.a ? "horizontal" : "vertical");
                break;
            }
            case -360: {
                ((ah)object).c(this.y);
                break;
            }
            case -361: {
                ((ah)object).c(this.B);
                break;
            }
            case -362: {
                ((ah)object).c(this.A);
                break;
            }
            case -363: {
                ((ah)object).c(this.z);
                break;
            }
            case -321: {
                ((ah)object).c(this.a);
                break;
            }
            case -324: {
                ((ah)object).c(this.b);
                break;
            }
            case -333: {
                ((ah)object).c(this.e);
                break;
            }
            case -334: {
                ((ah)object).c(this.f);
                break;
            }
            case -335: {
                ((ah)object).c(this.g);
                break;
            }
            case -336: {
                ((ah)object).c(this.h);
                break;
            }
            case -68: {
                if (this.f) {
                    ((ah)object).a(this.s + "%");
                    break;
                }
                if (this.s == Integer.MIN_VALUE) {
                    ((ah)object).a("*");
                    break;
                }
                ((ah)object).c(this.s);
                break;
            }
            case -69: {
                if (this.g) {
                    ((ah)object).a(this.t + "%");
                    break;
                }
                if (this.t == Integer.MIN_VALUE) {
                    ((ah)object).a("*");
                    break;
                }
                ((ah)object).c(this.t);
                break;
            }
            case -337: {
                ((ah)object).c(this.i);
                break;
            }
            case -338: {
                ((ah)object).c(this.j);
                break;
            }
            case -345: {
                ((ah)object).c(this.l);
                break;
            }
            case -349: {
                this.d = false;
                ((ah)object).c(this.n * 100 / 255);
                break;
            }
            case -350: {
                ((ah)object).c(this.o * 100 / 255);
            }
            case -351: {
                ((ah)object).c(this.p);
                break;
            }
            case -341: {
                ((ah)object).a((this.a & 1L) != 0L ? "disable" : "focus");
                break;
            }
            case -342: {
                ((ah)object).a(this.c == 1);
                break;
            }
            case -343: {
                ((ah)object).a(this.c);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    public final boolean a(int n2, boolean bl, Object object, int n3) {
        boolean bl2 = true;
        switch (n2) {
            case -364: {
                this.q(bj.a(object, ""));
                break;
            }
            case -357: {
                this.d(bj.a(object, ""));
                break;
            }
            case -318: {
                this.l(bj.a(object, ""));
                break;
            }
            case -320: {
                this.a = bj.a(object, "");
                break;
            }
            case -330: {
                String string = bj.a(object, "");
                av av2 = this;
                string = string.toUpperCase();
                if ("RIGHT".equals(string)) {
                    av2.c = 8;
                    av2.a |= 0x10L;
                    break;
                }
                if ("CENTER".equals(string)) {
                    av2.c = 1;
                    av2.a |= 0x10L;
                    break;
                }
                av2.c = 4;
                av2.a |= 0x10L;
                break;
            }
            case -331: {
                String string = bj.a(object, "");
                av av3 = this;
                string = string.toUpperCase();
                if ("BOTTOM".equals(string)) {
                    av3.d = 32;
                    av3.a |= 0x20L;
                    break;
                }
                if ("MIDDLE".equals(string)) {
                    av3.d = 2;
                    av3.a |= 0x20L;
                    break;
                }
                av3.d = 16;
                av3.a |= 0x20L;
                break;
            }
            case -332: {
                this.n(bj.a(object, ""));
                break;
            }
            case -339: {
                this.i(bj.a(object, ""));
                break;
            }
            case -340: {
                this.m(bj.a(object, ""));
                if (this.a == null) break;
                if (this.b == 1 || this.a.d()) {
                    this.a.e(this.b == 1);
                    break;
                }
                this.a.d(this.b == 0);
                break;
            }
            case -365: {
                this.j(bj.a(object, "vertical"));
                break;
            }
            case -346: {
                this.k(bj.a(object, ""));
                break;
            }
            case -355: {
                this.o(bj.a(object, ""));
                break;
            }
            case -356: {
                this.p(bj.a(object, ""));
                break;
            }
            case -68: {
                this.g(bj.a(object, ""));
                if (this.a == null) break;
                this.a.q();
                break;
            }
            case -69: {
                this.h(bj.a(object, ""));
                if (this.a == null) break;
                this.a.q();
                break;
            }
            case -347: {
                this.k = bj.a((String)object, false, Integer.MIN_VALUE, 0);
                this.k = av.a(this.k);
                break;
            }
            case -319: {
                this.b = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.d = false;
                this.e = true;
                break;
            }
            case -323: {
                this.d = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.d = av.a(this.d);
                break;
            }
            case -322: {
                this.c = bj.a((String)object, false, Integer.MIN_VALUE, 0);
                this.c = av.a(this.c);
                break;
            }
            case -325: {
                this.e = bj.a((String)object, false, Integer.MIN_VALUE, 0);
                this.e = av.a(this.e);
                break;
            }
            case -326: {
                int[] nArray = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.f = av.a(nArray, 1, -1, 0, 0);
                break;
            }
            case -327: {
                int[] nArray = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.g = av.a(nArray, 1, -1, 0, 0);
                break;
            }
            case -328: {
                int[] nArray = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.h = av.a(nArray, 1, -1, 0, 0);
                break;
            }
            case -329: {
                int[] nArray = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                this.i = av.a(nArray, 1, -1, 0, 0);
                break;
            }
            case -344: {
                this.j = bj.a((String)object, true, Integer.MIN_VALUE, 0);
                break;
            }
            case -360: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.a((String)null, n3);
                break;
            }
            case -361: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.d(null, n3);
                break;
            }
            case -362: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.b((String)null, n3);
                break;
            }
            case -363: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.c((String)null, n3);
                break;
            }
            case -321: {
                this.a = bl ? n3 : bj.c((String)object, 0);
                this.a |= 4L;
                break;
            }
            case -324: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.b = n3;
                this.a |= 0x40L;
                break;
            }
            case -333: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.e = n3;
                this.a |= 0x80L;
                break;
            }
            case -334: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.f = n3;
                this.a |= 0x100L;
                break;
            }
            case -335: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.g = n3;
                this.a |= 0x400L;
                break;
            }
            case -336: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.h = n3;
                this.a |= 0x200L;
                break;
            }
            case -337: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.i = n3;
                this.a |= 0x1000L;
                break;
            }
            case -338: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.j = n3;
                this.a |= 0x2000L;
                break;
            }
            case -345: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.l = n3;
                this.a |= 0x10000000L;
                break;
            }
            case -349: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.n = 255 * Math.min(100, n3) / 100;
                this.a |= 0x80000L;
                break;
            }
            case -350: {
                this.o = 255 * Math.min(100, n3) / 100;
                this.a |= 0x100000L;
                break;
            }
            case -351: {
                if (!bl) {
                    throw new RuntimeException();
                }
                this.p = n3;
                this.a |= 0x40000000L;
                break;
            }
            case -341: {
                n2 = "DISABLE".equals(object.toString().toUpperCase()) ? 1 : 0;
                this.a = this.a & 0xFFFFFFFFFFFFFFFEL | (n2 != 0 ? 1L : 0L);
                this.a |= 0x400000000L;
                break;
            }
            case -342: {
                n2 = bj.a(object, false) ? 1 : 0;
                this.c = n2 != 0 ? (byte)1 : 0;
                this.a |= 0x800000000L;
                break;
            }
            case -343: {
                this.c = bj.a(object, false);
                this.a |= 0x1000000000L;
                break;
            }
            case -358: {
                this.b((String)object);
                break;
            }
            case -359: {
                this.c((String)object);
                break;
            }
            default: {
                bl2 = false;
            }
        }
        if (bl2) {
            q.a((byte)1);
        }
        return bl2;
    }

    public final boolean a(ah ah2, af af2, int n2, ah ah3) {
        throw new NoSuchElementException("no such method");
    }

    public static String a(Vector vector, String string, boolean n2) {
        C = n2 != 0 ? 0x40000000 : 0;
        String string2 = null;
        Object object = null;
        boolean bl = true;
        int n3 = string.length();
        char c = string.charAt(n3 - 1);
        block5: for (n2 = n3 - 1; n2 >= 0; --n2) {
            char c2 = c;
            if (n2 > 0) {
                c = string.charAt(n2 - 1);
            }
            if (bl) {
                if (n2 != 0 && " >+\r\n\t".indexOf(c) == -1) continue;
                if (string2 != null) {
                    vector.addElement(string2);
                }
                string2 = null;
                int n4 = n3;
                int n5 = n2;
                Object object2 = string;
                Vector vector2 = vector;
                object2 = bg.a(((String)object2).substring(n5, n4), ".:#", true);
                String string3 = null;
                while (((bg)object2).hasMoreElements()) {
                    String string4 = ((bg)object2).a();
                    if (string4.charAt(0) == '#') {
                        vector2.addElement("#");
                        string4 = ((bg)object2).a();
                        string3 = "#" + string4;
                        vector2.addElement(string4);
                        C += 0x800000;
                        continue;
                    }
                    if (string4.charAt(0) == '.') {
                        vector2.addElement("class");
                        string4 = ((bg)object2).a();
                        vector2.addElement(string4);
                        if (string3 == null) {
                            string3 = "." + string4;
                        }
                        C += 131072;
                        continue;
                    }
                    if (string4.charAt(0) == ':') {
                        vector2.addElement("pseudo");
                        string4 = ((bg)object2).a().toUpperCase();
                        vector2.addElement(string4);
                        C += 131072;
                        continue;
                    }
                    if (string4.equals("*")) continue;
                    vector2.addElement("element");
                    vector2.addElement(string4);
                    if (string3 == null) {
                        string3 = string4;
                    }
                    C += 2048;
                }
                if (string3 == null) {
                    string3 = "*";
                }
                object2 = string3;
                bl = false;
                if (object != null) continue;
                object = object2;
                continue;
            }
            switch (c2) {
                case '>': {
                    string2 = "hasparent";
                    continue block5;
                }
                case '\t': 
                case '\n': 
                case '\r': 
                case ' ': {
                    if (string2 != null) continue block5;
                    string2 = "hasancestor";
                    continue block5;
                }
                case '+': {
                    string2 = "preceededby";
                    continue block5;
                }
                default: {
                    n3 = n2 + 1;
                    bl = true;
                }
            }
        }
        return object;
    }

    public final boolean a(String[] stringArray) {
        if (stringArray.length != this.a.length) {
            return false;
        }
        for (int i = stringArray.length - 1; i >= 0; --i) {
            if (stringArray[i].equalsIgnoreCase(this.a[i])) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(bc object, int n2) {
        Object object2;
        while (true) {
            Object object3;
            block17: {
                if (this.a == null) {
                    return true;
                }
                if (object == null) {
                    return false;
                }
                while (true) {
                    if (n2 >= this.a.length) {
                        return true;
                    }
                    if ((object2 = this.a[n2++]) == "element") {
                        if (this.a[n2++].equalsIgnoreCase(((bc)object).f())) continue;
                        return false;
                    }
                    if (object2 == "#") {
                        if (this.a[n2++].equals(((bc)object).e())) continue;
                        return false;
                    }
                    if (object2 == "class") {
                        object2 = this.a[n2++];
                        if (((bc)object).i == null) {
                            return false;
                        }
                        object3 = bg.a(((bc)object).i, ", ");
                        boolean bl = false;
                        while (!bl && ((bg)object3).hasMoreElements()) {
                            String string = ((bg)object3).a();
                            if (!((String)object2).equals(string)) continue;
                            bl = true;
                        }
                        ((bg)object3).b();
                        if (bl) continue;
                        return false;
                    }
                    if (object2 != "pseudo") break block17;
                    if (((String)(object2 = this.a[n2++])).equals("FOCUS") ? !((bc)object).i : (((String)object2).equals("DISABLE") ? !((bc)object).j : ((String)object2).equals("FIRST-CHILD") && ((object3 = ((bc)object).b()) == null || ((ai)object3).a((bc)object) != null))) break;
                }
                return false;
            }
            if (object2 == "preceededby") {
                object2 = ((bc)object).b();
                if (object2 == null) {
                    return false;
                }
                object = object3 = ((ai)object2).a((bc)object);
                continue;
            }
            if (object2 != "hasparent") break;
            object = ((bc)object).b();
        }
        if (object2 != "hasancestor") {
            if (((String)object2).intern() != object2) {
                throw new Error((String)object2 + " unconstant");
            }
            throw new Error("unknown match operator " + (String)object2);
        }
        object2 = ((bc)object).b();
        while (object2 != null) {
            if (this.a((bc)object2, n2)) {
                return true;
            }
            object2 = ((bc)object2).b();
        }
        return false;
    }

    public static void a(Vector vector) {
        int n2 = vector.size();
        for (int i = 0; i < n2; ++i) {
            av av2 = (av)vector.elementAt(i);
            for (int j = i + 1; j < n2; ++j) {
                av av3 = (av)vector.elementAt(j);
                if (av2.r <= av3.r) continue;
                vector.setElementAt(av2, j);
                vector.setElementAt(av3, i);
                av2 = av3;
            }
        }
    }

    public final void a(bc bc2) {
        this.a = bc2;
    }

    static {
        int[] nArray = new int[]{0, 0, 0, 0};
        a = new int[]{0, 0, 0, 0};
    }
}
