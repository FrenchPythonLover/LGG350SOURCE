/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aw
extends ai {
    private boolean p;
    private ai a;
    private int C;
    private int D;
    private int E;
    public int e;
    private int F;
    private int G;
    private int H;
    private Vector a = new Vector();

    public aw(String string, String string2, String string3) {
        super(false);
        String string4 = "[tab]";
        aw aw2 = this;
        ((ai)this).a = string4;
        boolean bl = true;
        try {
            this.e = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            bl = false;
        }
        finally {
            if (!bl) {
                this.e = "RIGHT".equals(string = string.toUpperCase()) ? 1 : ("BOTTOM".equals(string) ? 2 : ("LEFT".equals(string) ? 3 : 0));
            }
        }
        string2 = string2.toUpperCase();
        this.F = "INNER".equals(string2) || "1".equals(string2) ? 1 : 0;
        this.o("tabcontainer");
        this.p = bj.a(string3);
        switch (this.e) {
            case 0: 
            case 2: {
                this.a = new ai(true);
                break;
            }
            case 1: 
            case 3: {
                this.a = new ai(false);
            }
        }
        new Vector();
    }

    public final void a() {
        this.a.a();
        this.a = null;
        this.a = null;
        super.a();
    }

    /*
     * WARNING - void declaration
     */
    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (g && f && this.e() == 0) {
            int n9 = u.j;
            int n10 = u.k;
            boolean bl = this.a(n9, n10);
            n9 = bl ? 1 : 0;
            if (bl) {
                this.b(graphics, this.f, this.g, this.h, this.i);
            } else {
                this.a(graphics, this.f, this.g, this.h, this.i);
            }
            this.d = true;
            if (this.p) {
                ((bd)((Object)this.a)).a(this.D).a(graphics, n, n2, n3, n4, n5, n6, n7, n8);
            } else if (((bd)((Object)this.a)).a() > 0) {
                int n11 = n8;
                int n12 = n7;
                int n13 = n6;
                int n14 = n5;
                int n15 = n4;
                int n16 = n3;
                int n17 = n2;
                int n18 = n;
                Graphics graphics2 = graphics;
                aw aw2 = this;
                switch (aw2.e) {
                    case 0: {
                        void var25_67;
                        int n19 = n18;
                        int n20 = n17;
                        int n21 = n16;
                        int n22 = n15;
                        int n23 = n14;
                        int n24 = n13;
                        n13 = n11;
                        n14 = n12;
                        n15 = n24;
                        n16 = n23;
                        n17 = n22;
                        n18 = n21;
                        int n26 = n20;
                        int n27 = n19;
                        Graphics graphics3 = graphics2;
                        aw aw3 = aw2;
                        ai ai2 = aw3.a;
                        bd bd2 = ai2.a;
                        int n28 = bd2.a();
                        int n25 = 0;
                        int[] nArray = new int[n28];
                        reference var24_62 = aw3.a.h + (aw3.E << 1);
                        if (var24_62 > aw3.h) {
                            aw3.G += aw3.H;
                            if (aw3.G > 0) {
                                aw3.G = 0;
                            } else if (aw3.G < aw3.h - var24_62) {
                                aw3.G = aw3.h - var24_62;
                            }
                        }
                        u.a(aw3.G + aw3.E, aw3.E);
                        aw3.a.a(graphics3, n27, n26, n18, n17, n16, n15, n14, n13);
                        u.a(-aw3.E, -aw3.E);
                        graphics3.setColor(((av)((Object)aw3.a)).d == null ? 0 : ((av)((Object)aw3.a)).d[0]);
                        boolean bl2 = false;
                        while (var25_67 < n28) {
                            graphics3.fillRect(aw3.f + n25 - var25_67, aw3.g, aw3.E, (int)(aw3.a.i + aw3.E));
                            nArray[var25_67] = n25 += bd2.a((int)var25_67).h + aw3.E;
                            if (aw3.D == var25_67) {
                                aw3.a(n25, aw3.D == 0 ? 0 : nArray[var25_67 - true], aw3.h);
                            }
                            ++var25_67;
                        }
                        graphics3.fillRect(aw3.f + aw3.a.h + aw3.E, aw3.g, aw3.E, (int)(aw3.a.i + aw3.E));
                        if (aw3.F == 1) {
                            graphics3.fillRect(aw3.f + aw3.h - aw3.E, aw3.g, aw3.E, (int)(aw3.a.i + aw3.E));
                            graphics3.fillRect(aw3.f, aw3.g, aw3.h, aw3.E);
                            graphics3.fillRect(aw3.f, aw3.g + aw3.a.i, (int)(aw3.a.h + aw3.E), aw3.E);
                        } else {
                            graphics3.fillRect(aw3.f, aw3.g, (int)(aw3.a.h + aw3.E), aw3.E);
                            if (aw3.D != 0) {
                                graphics3.fillRect(aw3.f, aw3.g + aw3.a.i, nArray[aw3.D - 1] - aw3.D, aw3.E);
                            }
                            if (aw3.D == n28 - 1) {
                                graphics3.fillRect(aw3.f + aw3.a.h + aw3.E, aw3.g + aw3.a.i, aw3.h - aw3.a.h, aw3.E);
                            } else {
                                int n29 = Math.max(aw3.h, (int)(aw3.a.h + aw3.E));
                                graphics3.fillRect(aw3.f + nArray[aw3.D] - aw3.D, aw3.g + aw3.a.i, n29 - nArray[aw3.D] + aw3.D, aw3.E);
                            }
                        }
                        u.a(-aw3.G, 0);
                        break;
                    }
                    case 1: {
                        int n30 = n18;
                        int n31 = n17;
                        int n32 = n16;
                        int n33 = n15;
                        int n34 = n14;
                        int n35 = n13;
                        n13 = n11;
                        n14 = n12;
                        n15 = n35;
                        n16 = n34;
                        n17 = n33;
                        n18 = n32;
                        int n36 = n31;
                        int n37 = n30;
                        Graphics graphics3 = graphics2;
                        aw aw4 = aw2;
                        n12 = aw4.h - (aw4.a.h + (aw4.E << 1));
                        u.a(n12, 0);
                        Object object = aw4.a;
                        object = ((ai)object).a;
                        int n38 = ((bd)object).a();
                        int n39 = 0;
                        int[] nArray = new int[n38];
                        reference var25_69 = aw4.a.i + aw4.E;
                        if (var25_69 > aw4.i) {
                            aw4.G += aw4.H;
                            if (aw4.G > 0) {
                                aw4.G = 0;
                            } else if (aw4.G < aw4.i - var25_69) {
                                aw4.G = aw4.i - var25_69;
                            }
                        }
                        u.a(aw4.E, aw4.E + aw4.G);
                        aw4.a.a(graphics3, n37, n36, n18, n17, n16, n15, n14, n13);
                        u.a(-aw4.E, -aw4.E);
                        graphics3.setColor(((av)((Object)aw4.a)).d == null ? 0 : ((av)((Object)aw4.a)).d[0]);
                        for (n37 = 0; n37 < n38; ++n37) {
                            graphics3.fillRect(aw4.f, aw4.g + n39 - n37, (int)(aw4.a.h + (aw4.E << 1)), aw4.E);
                            nArray[n37] = n39 += ((bd)object).a((int)n37).i + aw4.E;
                            if (aw4.D != n37) continue;
                            aw4.a(n39, aw4.D == 0 ? 0 : nArray[n37 - 1], aw4.i);
                        }
                        graphics3.fillRect(aw4.f, aw4.g + aw4.a.i, (int)(aw4.a.h + (aw4.E << 1)), aw4.E);
                        if (aw4.F == 1) {
                            graphics3.fillRect(aw4.f, aw4.g + aw4.i - aw4.E, (int)(aw4.a.h + (aw4.E << 1)), aw4.E);
                            graphics3.fillRect(aw4.f + aw4.a.h + aw4.E, aw4.g, aw4.E, aw4.i);
                            graphics3.fillRect(aw4.f, aw4.g, aw4.E, (int)aw4.a.i);
                        } else {
                            graphics3.fillRect(aw4.f + aw4.a.h + aw4.E, aw4.g, aw4.E, (int)(aw4.a.i + aw4.E));
                            if (aw4.D != 0) {
                                graphics3.fillRect(aw4.f, aw4.g, aw4.E, nArray[aw4.D - 1] - aw4.D);
                            }
                            if (aw4.D == n38 - 1) {
                                graphics3.fillRect(aw4.f, aw4.g + aw4.a.i, aw4.E, aw4.i - aw4.a.i);
                            } else {
                                n37 = Math.max(aw4.i, (int)(aw4.a.i + aw4.E));
                                graphics3.fillRect(aw4.f, aw4.g + nArray[aw4.D] - aw4.D, aw4.E, n37 - nArray[aw4.D] + aw4.D);
                            }
                        }
                        u.a(-n12, -aw4.G);
                        break;
                    }
                    case 2: {
                        int n40 = n18;
                        int n41 = n17;
                        int n42 = n16;
                        int n43 = n15;
                        int n44 = n14;
                        int n45 = n13;
                        n13 = n11;
                        n14 = n12;
                        n15 = n45;
                        n16 = n44;
                        n17 = n43;
                        n18 = n42;
                        int n46 = n41;
                        int n47 = n40;
                        Graphics graphics4 = graphics2;
                        aw aw5 = aw2;
                        n12 = aw5.i - (aw5.a.i + (aw5.E << 1));
                        u.a(0, n12);
                        Object object = aw5.a;
                        object = ((ai)object).a;
                        int n48 = ((bd)object).a();
                        int n49 = 0;
                        int[] nArray = new int[n48];
                        reference var25_70 = aw5.a.h + (aw5.E << 1);
                        if (var25_70 > aw5.h) {
                            aw5.G += aw5.H;
                            if (aw5.G > 0) {
                                aw5.G = 0;
                            } else if (aw5.G < aw5.h - var25_70) {
                                aw5.G = aw5.h - var25_70;
                            }
                        }
                        u.a(aw5.G + aw5.E, aw5.E);
                        aw5.a.a(graphics4, n47, n46, n18, n17, n16, n15, n14, n13);
                        u.a(-aw5.E, -aw5.E);
                        graphics4.setColor(((av)((Object)aw5.a)).d == null ? 0 : ((av)((Object)aw5.a)).d[0]);
                        for (n47 = 0; n47 < n48; ++n47) {
                            graphics4.fillRect(aw5.f + n49 - n47, aw5.g, aw5.E, (int)(aw5.a.i + aw5.E));
                            nArray[n47] = n49 += ((bd)object).a((int)n47).h + aw5.E;
                            if (aw5.D != n47) continue;
                            aw5.a(n49, aw5.D == 0 ? 0 : nArray[n47 - 1], aw5.h);
                        }
                        graphics4.fillRect(aw5.f + (aw5.a.h + aw5.E), aw5.g, aw5.E, (int)(aw5.a.i + aw5.E));
                        if (aw5.F == 1) {
                            graphics4.fillRect(aw5.f + aw5.h - aw5.E, aw5.g, aw5.E, (int)(aw5.a.i + aw5.E));
                            graphics4.fillRect(aw5.f, aw5.g, (int)(aw5.a.h + aw5.E), aw5.E);
                            graphics4.fillRect(aw5.f, aw5.g + aw5.a.i, aw5.h, aw5.E);
                        } else {
                            if (aw5.D != 0) {
                                graphics4.fillRect(aw5.f, aw5.g, nArray[aw5.D - 1] - aw5.D, aw5.E);
                            }
                            if (aw5.D == n48 - 1) {
                                graphics4.fillRect(aw5.f + aw5.a.h + aw5.E, aw5.g, aw5.h - aw5.a.h, aw5.E);
                            } else {
                                n47 = Math.max(aw5.h, (int)(aw5.a.h + aw5.E));
                                graphics4.fillRect(aw5.f + nArray[aw5.D] - aw5.D, aw5.g, n47 - nArray[aw5.D] + aw5.D, aw5.E);
                            }
                            graphics4.fillRect(aw5.f, aw5.g + aw5.a.i, (int)(aw5.a.h + aw5.E), aw5.E);
                        }
                        u.a(-aw5.G, -n12);
                        break;
                    }
                    case 3: {
                        void var25_72;
                        int n50 = n18;
                        int n51 = n17;
                        int n52 = n16;
                        int n53 = n15;
                        int n54 = n14;
                        int n55 = n13;
                        n13 = n11;
                        n14 = n12;
                        n15 = n55;
                        n16 = n54;
                        n17 = n53;
                        n18 = n52;
                        int n57 = n51;
                        int n58 = n50;
                        Graphics graphics5 = graphics2;
                        aw aw6 = aw2;
                        ai ai3 = aw6.a;
                        bd bd3 = ai3.a;
                        int n59 = bd3.a();
                        int n56 = 0;
                        int[] nArray = new int[n59];
                        reference var24_65 = aw6.a.i + aw6.E;
                        if (var24_65 > aw6.i) {
                            aw6.G += aw6.H;
                            if (aw6.G > 0) {
                                aw6.G = 0;
                            } else if (aw6.G < aw6.i - var24_65) {
                                aw6.G = aw6.i - var24_65;
                                aw6.H = 0;
                            }
                        }
                        u.a(aw6.E, aw6.E + aw6.G);
                        aw6.a.a(graphics5, n58, n57, n18, n17, n16, n15, n14, n13);
                        u.a(-aw6.E, -aw6.E);
                        graphics5.setColor(((av)((Object)aw6.a)).d == null ? 0 : ((av)((Object)aw6.a)).d[0]);
                        boolean bl3 = false;
                        while (var25_72 < n59) {
                            graphics5.fillRect(aw6.f, aw6.g + n56 - var25_72, (int)(aw6.a.h + (aw6.E << 1)), aw6.E);
                            nArray[var25_72] = n56 += bd3.a((int)var25_72).i + aw6.E;
                            if (aw6.D == var25_72) {
                                aw6.a(n56, aw6.D == 0 ? 0 : nArray[var25_72 - true], aw6.i);
                            }
                            ++var25_72;
                        }
                        graphics5.fillRect(aw6.f, aw6.g + aw6.a.i, (int)(aw6.a.h + (aw6.E << 1)), aw6.E);
                        if (aw6.F == 1) {
                            graphics5.fillRect(aw6.f, aw6.g + aw6.i - aw6.E, (int)(aw6.a.h + (aw6.E << 1)), aw6.E);
                            graphics5.fillRect(aw6.f, aw6.g, aw6.E, aw6.i);
                            graphics5.fillRect(aw6.f + aw6.a.h + aw6.E, aw6.g, aw6.E, (int)aw6.a.i);
                        } else {
                            graphics5.fillRect(aw6.f, aw6.g, aw6.E, (int)(aw6.a.i + aw6.E));
                            if (aw6.D != 0) {
                                graphics5.fillRect(aw6.f + aw6.a.h + aw6.E, aw6.g, aw6.E, nArray[aw6.D - 1] - aw6.D);
                            }
                            if (aw6.D == n59 - 1) {
                                graphics5.fillRect(aw6.f + aw6.a.h + aw6.E, aw6.g + aw6.a.i, aw6.E, aw6.i - aw6.a.i);
                            } else {
                                int n60 = Math.max(aw6.i, (int)(aw6.a.i + aw6.E));
                                graphics5.fillRect(aw6.f + aw6.a.h + aw6.E, aw6.g + nArray[aw6.D] - aw6.D, aw6.E, n60 - nArray[aw6.D] + aw6.D);
                            }
                        }
                        u.a(0, -aw6.G);
                    }
                }
                int n61 = n8;
                int n62 = n7;
                n13 = n6;
                n14 = n5;
                n15 = n4;
                n16 = n3;
                n17 = n2;
                n18 = n;
                Graphics graphics4 = graphics;
                aw aw4 = this;
                switch (aw4.e) {
                    case 0: {
                        reference var20_53 = aw4.a.i + aw4.E;
                        u.a(0, (int)var20_53);
                        ((bd)((Object)aw4.a)).a(aw4.D).a(graphics4, n18, n17, n16, n15, n14, n13, n62, n61);
                        u.a(0, (int)(-var20_53));
                        break;
                    }
                    case 3: {
                        reference var21_47 = aw4.a.h + (aw4.E << 1);
                        u.a((int)var21_47, 0);
                        ((bd)((Object)aw4.a)).a(aw4.D).a(graphics4, n18, n17, n16, n15, n14, n13, n62, n61);
                        u.a((int)(-var21_47), 0);
                        break;
                    }
                    case 1: 
                    case 2: {
                        ((bd)((Object)aw4.a)).a(aw4.D).a(graphics4, n18, n17, n16, n15, n14, n13, n62, n61);
                    }
                }
            }
            this.a(graphics);
            u.a(-this.A, -this.B);
        }
    }

    private void a(int n, int n2, int n3) {
        if (n + this.G > n3) {
            this.H = this.H != 0 && this.H >= -16 ? (this.H <<= 1) : -1;
            this.a.s();
            this.f();
            return;
        }
        if (n2 + this.G < 0) {
            this.H = this.H != 0 && this.H <= 16 ? (this.H <<= 1) : 1;
            this.a.s();
            this.f();
            return;
        }
        this.H = 0;
    }

    public final void a(int n, int n2) {
        int n3;
        int n4;
        super.a(n, n2);
        int n5 = ((av)((Object)this.a)).s != -1 ? (((av)((Object)this.a)).f ? ((av)((Object)this.a)).s * n / 100 : ((av)((Object)this.a)).s) : (n4 = this.l ? this.y * n / 100 : this.y);
        int n6 = ((av)((Object)this.a)).t != -1 ? (((av)((Object)this.a)).g ? ((av)((Object)this.a)).t * n2 / 100 : ((av)((Object)this.a)).t) : (n3 = this.m ? this.z * n2 / 100 : this.z);
        if (this.p) {
            bc bc2 = ((bd)((Object)this.a)).a(this.D);
            bc2.b(n4);
            bc2.c(n3);
            bc2.a(n, n2);
        } else {
            switch (this.e) {
                case 0: 
                case 2: {
                    int n7;
                    ag ag2;
                    int n8 = n2;
                    n3 = n;
                    aw aw2 = this;
                    Object object = aw2.a;
                    object = ((ai)object).a;
                    int n9 = ((bd)object).a();
                    if (n9 <= 0) break;
                    if (aw2.E != 0) {
                        ag2 = new av();
                        aw2.a.a((av)ag2);
                    }
                    ag2 = null;
                    int n10 = 0;
                    aw2.a.a(Integer.MAX_VALUE, n8);
                    for (n7 = 0; n7 < n9; ++n7) {
                        ag2 = ((bd)object).a(n7);
                        n10 = Math.max(((bc)ag2).i, n10);
                    }
                    for (n7 = 0; n7 < n9; ++n7) {
                        ag2 = ((bd)object).a(n7);
                        ((bc)ag2).c(n10);
                        ((bc)ag2).m = false;
                    }
                    aw2.a.a(Integer.MAX_VALUE, n8);
                    ag2 = ((bd)((Object)aw2.a)).a(aw2.D);
                    int n11 = ((av)((Object)aw2.a)).s != -1 ? (((av)((Object)aw2.a)).f ? ((av)((Object)aw2.a)).s * n3 / 100 : ((av)((Object)aw2.a)).s) : (n7 = aw2.l ? aw2.y * n3 / 100 : aw2.y);
                    int n12 = ((av)((Object)aw2.a)).t != -1 ? (((av)((Object)aw2.a)).g ? ((av)((Object)aw2.a)).t * n8 / 100 : ((av)((Object)aw2.a)).t) : (aw2.m ? aw2.z * n8 / 100 : aw2.z);
                    ((bc)ag2).b(n7);
                    ((bc)ag2).c(n12 - (aw2.E << 1) - aw2.a.i);
                    ((bc)ag2).a(n3, n8);
                    break;
                }
                case 1: 
                case 3: {
                    int n13;
                    ag ag3;
                    int n14 = n2;
                    n3 = n;
                    aw aw3 = this;
                    Object object = aw3.a;
                    object = ((ai)object).a;
                    int n15 = ((bd)object).a();
                    if (n15 <= 0) break;
                    if (aw3.E != 0) {
                        ag3 = new av();
                        aw3.a.a((av)ag3);
                    }
                    ag3 = null;
                    int n16 = 0;
                    int n17 = 0;
                    aw3.a.a(n3, n14);
                    for (n13 = 0; n13 < n15; ++n13) {
                        ag3 = ((bd)object).a(n13);
                        n16 = Math.max(((bc)ag3).i, n16);
                        n17 = Math.max(((bc)ag3).h, n17);
                    }
                    for (n13 = 0; n13 < n15; ++n13) {
                        ag3 = ((bd)object).a(n13);
                        ((bc)ag3).c(n16);
                        ((bc)ag3).b(n17);
                        ((bc)ag3).l = false;
                        ((bc)ag3).m = false;
                    }
                    aw3.a.a(n3, n14);
                    ag3 = ((bd)((Object)aw3.a)).a(aw3.D);
                    int n18 = ((av)((Object)aw3.a)).s != -1 ? (((av)((Object)aw3.a)).f ? ((av)((Object)aw3.a)).s * n3 / 100 : ((av)((Object)aw3.a)).s) : (n13 = aw3.l ? aw3.y * n3 / 100 : aw3.y);
                    int n19 = ((av)((Object)aw3.a)).t != -1 ? (((av)((Object)aw3.a)).g ? ((av)((Object)aw3.a)).t * n14 / 100 : ((av)((Object)aw3.a)).t) : (aw3.m ? aw3.z * n14 / 100 : aw3.z);
                    ((bc)ag3).b(n13 - (aw3.E << 1) - aw3.a.h);
                    ((bc)ag3).c(n19);
                    ((bc)ag3).a(n3, n14);
                }
            }
        }
        this.o();
        this.b(n, n2);
    }

    public final ai a(int n, int n2) {
        return ((ai)((bd)((Object)this.a)).a(this.D)).a(n, n2);
    }

    private static bc a(String string, String string2) {
        bc bc2 = null;
        if (string != null) {
            bc2 = new aj(string, false, "NOWRAP");
        } else if (string2 != null) {
            bc2 = new an(string2, 0, true);
        }
        if (bc2 != null) {
            bc2.o("tab");
        }
        return bc2;
    }

    public final bc a(String string) {
        bc bc2 = this.a.a(string);
        if (bc2 == null) {
            bc2 = super.a(string);
        }
        return bc2;
    }

    public final bc a(String object, String objectArray, Object object2, Object object3, Object object4) {
        if ((object = aw.a((String)object, (String)objectArray)) != null) {
            this.a.a((bc)object);
            objectArray = new Object[]{object2, object3, object4};
            this.a.addElement(objectArray);
        }
        return object;
    }

    public final void a(ai ai2) {
        ((bd)((Object)this.a)).a(ai2);
        ai2.e(this);
    }

    public final void b(Hashtable object) {
        super.b((Hashtable)object);
        if (this.a != null) {
            int n = this.a.a.a();
            while (--n >= 0) {
                this.a.a.a(n).b((Hashtable)object);
            }
        }
        object = this;
        av av2 = new av();
        av2.a((av)((Object)((aw)object).a));
        if (!((aw)object).p) {
            int n = ((aw)object).E = av2.c != null ? av2.c[0] : 0;
            if (((av)((Object)((aw)object).a)).c != null) {
                switch (((aw)object).e) {
                    case 0: {
                        av2.c[0] = 0;
                        break;
                    }
                    case 1: {
                        av2.c[1] = 0;
                        break;
                    }
                    case 2: {
                        av2.c[2] = 0;
                        break;
                    }
                    case 3: {
                        av2.c[3] = 0;
                    }
                }
            }
        }
        int n = ((bd)((Object)((aw)object).a)).a();
        while (--n >= 0) {
            ((bd)((Object)((aw)object).a)).a(n).a(av2);
        }
    }

    public final Object[] a(Hashtable hashtable) {
        bc bc2 = null;
        if (this.a != null) {
            bc2 = this.a.a.a(this.D);
            this.a.a.a(this.D).i = true;
            bc2.b(hashtable);
            this.a = ((Object[])this.a.elementAt(this.D))[0];
            this.c = ((Object[])this.a.elementAt(this.D))[1];
        }
        this.i = true;
        return new Object[]{bc2, this.c};
    }

    public final Object a(Hashtable hashtable) {
        bc bc2 = null;
        if (this.a != null && this.a.a.a() > this.C) {
            bc2 = this.a.a.a(this.C);
            this.a.a.a(this.C).i = false;
            bc2.b(hashtable);
            this.d = ((Object[])this.a.elementAt(this.D))[2];
        }
        this.i = false;
        return this.d;
    }

    public void c(Hashtable hashtable) {
        if (this.D < this.a.a.a() - 1) {
            this.C = this.D++;
            this.a(hashtable);
            ai.m();
            this.a.s();
            q.a((byte)8);
        }
    }

    public void d(Hashtable hashtable) {
        if (this.D > 0) {
            this.C = this.D--;
            this.a(hashtable);
            ai.m();
            this.a.s();
            q.a((byte)8);
        }
    }

    public final void a(boolean bl, Vector vector, Vector vector2) {
        switch (this.e) {
            case 0: {
                Vector vector3 = vector2;
                vector2 = vector;
                boolean bl2 = bl;
                aw aw2 = this;
                int n2 = vector2.size();
                ai ai2 = aw2.a;
                int n3 = ai2.a.a();
                for (int i = 0; i < n3; ++i) {
                    vector3.addElement(aw2);
                }
                vector2.addElement(vector3);
                aw2.a(aw2.D, bl2, vector2, new Vector());
                q.a(n2);
                return;
            }
            case 1: {
                this.a(bl, vector);
                return;
            }
            case 2: {
                this.b(bl, vector, vector2);
                return;
            }
            case 3: {
                this.b(bl, vector);
            }
        }
    }

    private void a(int n2, boolean bl, Vector vector, Vector vector2) {
        bc bc2 = ((bd)((Object)this.a)).a(n2);
        if (bc2 instanceof ai) {
            ((ai)bc2).a(bl, vector, vector2);
        }
    }

    private void b(boolean bl, Vector vector, Vector vector2) {
        this.a(this.D, bl, vector, new Vector());
        ai ai2 = this.a;
        int n2 = ai2.a.a();
        int n3 = vector.size();
        for (int i = 0; i < n2; ++i) {
            vector2.addElement(this);
        }
        vector.addElement(vector2);
        q.a(n3);
    }

    private void a(boolean n2, Vector vector) {
        int n3 = vector.size();
        this.a(this.D, n2 != 0, vector, new Vector());
        n2 = vector.size();
        Vector<aw> vector2 = null;
        for (int i = n3; i < n2; ++i) {
            vector2 = (Vector<aw>)vector.elementAt(i);
            vector2.addElement(this);
        }
        q.a(n3);
        if (vector.size() > 0) {
            vector2 = (Vector)vector.elementAt(0);
        } else {
            vector2 = new Vector<aw>();
            vector2.addElement(this);
            vector.addElement(vector2);
        }
        q.b(vector2.size() - 1);
    }

    private void b(boolean n2, Vector vector) {
        int n3 = vector.size();
        this.a(this.D, n2 != 0, vector, new Vector());
        n2 = vector.size();
        Vector<aw> vector2 = null;
        for (int i = n3; i < n2; ++i) {
            vector2 = (Vector<aw>)vector.elementAt(i);
            vector2.insertElementAt(this, 0);
        }
        q.a(n3);
        if (vector.size() > 0) {
            vector.elementAt(0);
        } else {
            vector2 = new Vector<aw>();
            vector2.addElement(this);
            vector.addElement(vector2);
        }
        q.b(0);
    }

    public final boolean a(ah ah2, int n2) {
        boolean bl = super.a(ah2, n2);
        if (!bl) {
            switch (n2) {
                case -138: {
                    ah2.a(this.p);
                    break;
                }
                case -147: 
                case -146: 
                case -145: 
                case -142: 
                case -141: 
                case -140: 
                case -139: {
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
                case -138: {
                    this.p = bj.a(object, false);
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

    public final boolean a(ah objectArray, af af2, int n2, ah object) {
        if (!super.a((ah)objectArray, af2, n2, (ah)object)) {
            switch (n2) {
                case -139: {
                    af2 = this.a(((ah)object).b(0), ((ah)object).b(1), ((ah)object).a(2), ((ah)object).a(3), ((ah)object).a(4));
                    this.a((ai)((ah)object).a(5));
                    this.b(q.d);
                    this.G = 0;
                    objectArray.a(af2);
                    q.a((byte)1);
                    break;
                }
                case -140: {
                    int n3 = ((ah)object).b();
                    objectArray = this;
                    if (objectArray.a.a(n3, true) && objectArray.a(n3, true) && ((bd)((Object)objectArray.a)).a() > 0) {
                        if (objectArray.D > n3) {
                            objectArray.C = objectArray.D--;
                        } else if (objectArray.D == n3) {
                            if (objectArray.D != 0) {
                                --objectArray.D;
                            }
                            objectArray.a(q.d);
                        }
                    }
                    this.G = 0;
                    q.a((byte)1);
                    break;
                }
                case -141: {
                    int n4 = ((ah)object).a(0);
                    String string = ((ah)object).b(1);
                    Object object2 = ((ah)object).a(5);
                    Object object3 = ((ah)object).a(4);
                    Object object4 = ((ah)object).a(3);
                    object = ((ah)object).b(2);
                    Object object5 = string;
                    int n5 = n4;
                    objectArray = this;
                    object5 = aw.a((String)object5, (String)object);
                    if (n5 < ((bd)((Object)objectArray.a)).a()) {
                        object = objectArray.a;
                        object = ((ai)object).a.a(n5);
                        ((bc)object5).i = ((bc)object).i;
                        ((bc)object).a((bc)object5);
                        Object[] objectArray2 = (Object[])objectArray.a.elementAt(n5);
                        objectArray = objectArray2;
                        objectArray2[0] = object4;
                        objectArray[1] = object3;
                        objectArray[2] = object2;
                    }
                    this.b(q.d);
                    q.a((byte)1);
                    break;
                }
                case -142: {
                    ai ai2 = (ai)((ah)object).a(1);
                    int n6 = ((ah)object).a(0);
                    objectArray = this;
                    if (n6 < ((bd)((Object)objectArray.a)).a()) {
                        ((bd)((Object)objectArray.a)).a(n6).a(ai2);
                    }
                    this.b(q.d);
                    q.a((byte)1);
                    break;
                }
                case -143: {
                    ah ah2 = objectArray;
                    int n7 = ((ah)object).a(0);
                    objectArray = this;
                    ai ai3 = null;
                    if (n7 < ((bd)((Object)objectArray.a)).a()) {
                        ai3 = (ai)((bd)((Object)objectArray.a)).a(n7);
                    }
                    ah2.a(ai3);
                    break;
                }
                case -145: {
                    objectArray.c(((bd)((Object)this.a)).a());
                    break;
                }
                case -146: {
                    this.c(q.d);
                    break;
                }
                case -147: {
                    this.d(q.d);
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
