/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a {
    private short[] J;
    private int s;
    private int[] C;
    private int[] e;
    private int[] B;
    private int J;
    public int Code;
    public int I;
    private int[] I;
    private static short[] Code;
    private static short[] I;
    private static short[] Z;
    private static int[] Z;
    private short[][] Code;
    private static int[] J;
    private byte[] Code;
    private int B = new int[3];
    private int C = new int[3];
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] a = new int[3];
    private int e;
    private int f;
    private int[] f;
    private int r;
    private int g;
    private int h;
    private int[] b = new int[3];
    private int i;
    private int[] c = new int[3];
    private int j;
    private int k;
    private int l;
    private int m;
    private int[] d = new int[3];
    private int n;
    private int o;
    private byte[][] Code;
    private int p;
    int[] Code;
    private int q;
    int Z;
    private int[][] Code = new byte[3][];
    private int[][] I;
    private byte[][] I;
    private byte[][] Z;
    private int[][] Z;
    private int t = -1;
    private int u;

    public final int Code(byte[] byArray, int n, int n2, int n3, boolean bl) {
        this.Code = byArray;
        this.B = n;
        this.C = n2;
        this.J = n3;
        int n4 = 0;
        block17: while (n4 == 0) {
            while (this.b > 0) {
                if (this.b >= this.C) {
                    this.b -= this.C;
                    return 0;
                }
                this.B += this.b;
                this.C -= this.b;
                this.b = 0;
            }
            switch (this.a) {
                default: {
                    continue block17;
                }
                case 1: 
                case 2: {
                    if (this.C < 2) {
                        return this.C;
                    }
                    block19: while (this.C >= 2 && n4 == 0 && this.b == 0 && (this.a == 1 || this.a == 2)) {
                        if ((this.Code[this.B] & 0xFF) != 255) {
                            ++this.B;
                            --this.C;
                            continue;
                        }
                        switch (this.Code[this.B + 1] & 0xFF) {
                            case 192: 
                            case 193: {
                                if (this.C < 4) {
                                    return this.C;
                                }
                                this.c = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
                                if (this.C < 10) {
                                    return this.C;
                                }
                                this.B += 4;
                                this.C -= 4;
                                this.c -= 2;
                                this.q = (this.Code[this.B + 3] & 0xFF) << 8 | this.Code[this.B + 4] & 0xFF;
                                this.Z = (this.Code[this.B + 1] & 0xFF) << 8 | this.Code[this.B + 2] & 0xFF;
                                if (bl) {
                                    this.a = 0;
                                    return this.q << 16 | this.Z;
                                }
                                this.Code = this.q >> this.J;
                                this.I = this.Z >> this.J;
                                this.Code = new int[this.Code * this.I];
                                this.d = this.Code[this.B + 5] & 0xFF;
                                a a2 = this;
                                for (n2 = 0; n2 < 3; ++n2) {
                                    a2.e[n2 << 1] = 0;
                                    a2.e[(n2 << 1) + 1] = 4;
                                }
                                a2.Z();
                                this.B += 6;
                                this.C -= 6;
                                this.c -= 6;
                                this.a = 3;
                                continue block19;
                            }
                            case 218: {
                                if (this.C < 4) {
                                    return this.C;
                                }
                                this.c = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
                                if (this.C < this.c + 2) {
                                    return this.C;
                                }
                                this.i = this.Code[this.B + 4] & 0xFF;
                                this.B += 5;
                                this.C -= 5;
                                this.c -= 3;
                                for (n = 0; n < this.i; ++n) {
                                    n2 = this.Code[this.B] & 0xFF;
                                    this.c[n] = n;
                                    for (n3 = 0; n3 < this.d; ++n3) {
                                        if (n2 != this.B[n3]) continue;
                                        this.c[n] = n3;
                                        n3 = this.d;
                                    }
                                    n2 = this.Code[this.B + 1] & 0xFF;
                                    this.e[this.c[n] << 1] = n2 >> 4;
                                    this.e[(this.c[n] << 1) + 1] = 4 + (n2 & 0xF);
                                    this.B += 2;
                                    this.C -= 2;
                                    this.c -= 2;
                                }
                                this.Z();
                                this.k = 0;
                                this.j = 0;
                                this.l = 0;
                                this.p = 0;
                                this.I();
                                this.B += this.c;
                                this.C -= this.c;
                                this.a = 4;
                                continue block19;
                            }
                            case 196: {
                                n4 = this.I();
                                continue block19;
                            }
                            case 219: {
                                n4 = this.Z();
                                continue block19;
                            }
                            case 221: {
                                if (this.C < 4) {
                                    return this.C;
                                }
                                this.b = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
                                if (this.C < 6) {
                                    return this.C;
                                }
                                this.m = (this.Code[this.B + 4] & 0xFF) << 8 | this.Code[this.B + 5] & 0xFF;
                                this.l = 0;
                                this.B += 6;
                                this.C -= 6;
                                this.b -= 4;
                                continue block19;
                            }
                            case 217: {
                                this.B += 2;
                                this.C -= 2;
                                this.a = 6;
                                continue block19;
                            }
                            case 0: 
                            case 255: {
                                ++this.B;
                                --this.C;
                                continue block19;
                            }
                        }
                        if (this.C < 4) {
                            return this.C;
                        }
                        this.b = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
                        this.B += 4;
                        this.C -= 4;
                        this.b -= 2;
                    }
                    continue block17;
                }
                case 3: {
                    if (this.C < this.d * 3) {
                        return this.C;
                    }
                    for (n = 0; n < this.d; ++n) {
                        this.B[n] = this.Code[this.B] & 0xFF;
                        n2 = this.Code[this.B + 1] & 0xFF;
                        n3 = n2 & 0xF;
                        if ((n2 >>>= 4) > this.f) {
                            this.f = n2;
                        }
                        if (n3 > this.e) {
                            this.e = n3;
                        }
                        this.a[n] = n2;
                        this.C[n] = n3;
                        this.f[n] = this.Code[this.B + 2] & 0xFF;
                        this.B += 3;
                        this.C -= 3;
                        this.c -= 3;
                    }
                    if (this.c > 0) {
                        this.b = this.c;
                    }
                    n = 0;
                    while (n < this.d) {
                        this.b[n] = ((this.q * this.a[n] + this.f - 1) / this.f + 7) / 8;
                        if (this.J == 0) {
                            this.Code[n] = new byte[64 * this.b[n] * this.C[n]];
                            ++n;
                            continue;
                        }
                        this.Code[n] = new byte[64 * this.C[n] * this.a[n]];
                        ++n;
                    }
                    this.p = 0;
                    if (this.d > 1) {
                        this.g = (this.f << 3) * ((this.q + 8 * this.f - 1) / (this.f << 3));
                        this.h = (this.e << 3) * ((this.Z + 8 * this.e - 1) / (this.e << 3));
                    }
                    this.a = 2;
                    continue block17;
                }
                case 5: {
                    while (this.a == 5) {
                        if (this.C < 2) {
                            return this.C;
                        }
                        if ((this.Code[this.B] & 0xFF) == 255 && this.Code[this.B + 1] != 0) {
                            if ((this.Code[this.B + 1] & 0xFF) >= 208 && (this.Code[this.B + 1] & 0xFF) <= 215) {
                                this.a = 4;
                                this.B += 2;
                                this.C -= 2;
                                continue;
                            }
                            this.a = 2;
                            continue;
                        }
                        ++this.B;
                        --this.C;
                    }
                    continue block17;
                }
                case 4: {
                    n4 = this.Code();
                    continue block17;
                }
                case 6: {
                    return 0;
                }
                case 0: 
            }
            if (this.C < 2) {
                return this.C;
            }
            this.B += 2;
            this.C -= 2;
            this.a = 1;
        }
        if (n4 == -2) {
            return this.C;
        }
        return n4;
    }

    private void J() {
        while (this.s <= 24 && this.C > 0) {
            int n = this.Code[this.B] & 0xFF;
            if (n == 255) {
                if (this.C < 2 || this.Code[this.B + 1] != 0) {
                    return;
                }
                ++this.B;
                --this.C;
            }
            ++this.B;
            --this.C;
            this.r |= n << 24 - this.s;
            this.s += 8;
        }
    }

    private void I() {
        if (this.i == 1) {
            int n = this.c[this.j];
            this.n = ((this.a[n] * this.q + this.f - 1) / this.f + 7) / 8;
            this.d[this.c[this.j]] = 0;
            return;
        }
        this.n = 0;
        for (int i = 0; i < this.i; ++i) {
            this.n += this.C[this.c[i]] * this.a[this.c[i]];
            this.d[this.c[i]] = 0;
        }
        this.o = this.n;
        this.n *= this.g / (8 * this.f);
    }

    private void Z() {
        for (int i = 0; i < 3; ++i) {
            this.J[i] = 0;
        }
        this.r = 0;
        this.s = 0;
    }

    private static int Code(int n, int n2) {
        if (n2 < 1 << n - 1) {
            return n2 + (-1 << n) + 1;
        }
        return n2;
    }

    private int I(int n, int n2) {
        int n3 = n2 - 1;
        if ((n2 = this.Code(n2)) < 0) {
            return n2;
        }
        while (n3 < 16 && n2 > this.Code[n][n3]) {
            ++n3;
            int n4 = this.Code(1);
            if (n4 < 0) {
                return n4;
            }
            n2 = n2 << 1 | n4;
        }
        n2 = this.Code[n][n3] + (n2 - this.I[n][n3]);
        return this.I[n][n2] & 0xFF;
    }

    private int Code() {
        short[] sArray = new short[64];
        if (this.J != 0 && this.I == null) {
            this.I = new int[this.e * this.f << 6];
        }
        do {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            block22: {
                n7 = this.c[this.j];
                for (int i = 0; i < 64; ++i) {
                    sArray[i] = 0;
                }
                short[] sArray2 = sArray;
                a a2 = this;
                n6 = a2.C;
                n5 = a2.r;
                n4 = a2.s;
                n3 = a2.e[n7 << 1];
                if ((n3 = a2.I(n3)) < 0) {
                    a2.B -= n6 - a2.C;
                    a2.C = n6;
                    a2.r = n5;
                    a2.s = n4;
                    n2 = n3;
                } else {
                    int n8 = a2.Code(n3);
                    if (n8 < 0) {
                        a2.B -= n6 - a2.C;
                        a2.C = n6;
                        a2.r = n5;
                        a2.s = n4;
                        n2 = n8;
                    } else {
                        n3 = a.Code(n3, n8);
                        sArray2[0] = (short)(n3 + a2.J[n7]);
                        n3 = a2.e[(n7 << 1) + 1];
                        n8 = 1;
                        while (n8 < 64) {
                            int n9 = a2.I(n3);
                            if (n9 < 0) {
                                a2.B -= n6 - a2.C;
                                a2.C = n6;
                                a2.r = n5;
                                a2.s = n4;
                                n2 = n9;
                                break block22;
                            }
                            int n10 = n9 & 0xF;
                            n9 >>= 4;
                            if (n10 == 0) {
                                if (n9 != 15) break;
                                n8 += n9;
                                ++n8;
                                continue;
                            }
                            int n11 = a2.Code(n10);
                            if (n11 < 0) {
                                a2.B -= n6 - a2.C;
                                a2.C = n6;
                                a2.r = n5;
                                a2.s = n4;
                                n2 = n11;
                                break block22;
                            }
                            if ((n8 += n9) >= 64) {
                                n8 = 63;
                            }
                            sArray2[n8] = (short)a.Code(n10, n11);
                            ++n8;
                        }
                        a2.J[n7] = sArray2[0];
                        n2 = n = 0;
                    }
                }
            }
            if (n2 != 0) {
                return n;
            }
            n = this.d[n7] / (this.C[n7] * this.a[n7]);
            int n12 = this.d[n7] % (this.C[n7] * this.a[n7]);
            if ((n = this.a[n7] * n + n12 % this.a[n7]) < this.b[n7]) {
                if (this.J == 0) {
                    n = n + (n12 / this.a[n7] * this.b[n7] << 3) << 3;
                    this.Code(n7, sArray, this.Code[n7], n, this.b[n7] << 3);
                } else {
                    n = n12 / this.a[n7] * (this.a[n7] << 6) + (n12 % this.a[n7] << 3);
                    this.Code(n7, sArray, this.Code[n7], n, this.a[n7] << 3);
                }
            }
            int n13 = n7;
            this.d[n13] = this.d[n13] + 1;
            --this.n;
            if (this.n % this.o == 0 && this.J != 0) {
                this.Code(true);
                a a3 = this;
                n12 = a3.t % a3.q;
                n6 = a3.t / a3.q;
                n12 >>= a3.J;
                n12 = (n6 >>= a3.J) * a3.Code + n12;
                n5 = 0;
                for (n4 = 0; n4 < a3.e << 3 >> a3.J && n4 + n6 < a3.I; ++n4) {
                    for (n3 = 0; n3 < a3.u >> a3.J; ++n3) {
                        a3.Code[n12 + n3] = a3.I[n5 + (n3 << a3.J)];
                    }
                    n12 += a3.Code;
                    n5 += a3.f << 3 << a3.J;
                }
                this.t = -1;
            }
            if (this.n == 0) {
                if (this.J == 0) {
                    this.Code(false);
                }
                ++this.p;
                if (this.i > 1 && this.p >= this.h / (8 * this.e) || this.i == 1 && this.p >= ((this.C[n7] * this.Z + this.e - 1) / this.e + 7) / 8) {
                    this.a = 2;
                    return 0;
                }
                this.I();
            }
            ++this.k;
            if (this.k < this.C[n7] * this.a[n7] && this.i != 1) continue;
            this.k = 0;
            ++this.j;
            if (this.j < this.i) continue;
            this.j = 0;
            ++this.l;
        } while (this.l != this.m || this.m <= 0);
        this.l = 0;
        this.Z();
        this.a = 5;
        return 0;
    }

    private int I() {
        if (this.C < 4) {
            return -2;
        }
        int n = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
        if (this.C < n + 2) {
            return -2;
        }
        n -= 2;
        this.B += 4;
        this.C -= 4;
        while (n > 0) {
            int n2;
            int n3;
            int n4;
            int n5 = this.Code[this.B] & 0xF | (this.Code[this.B] & 0x10) >> 2;
            ++this.B;
            --this.C;
            --n;
            int n6 = 0;
            short[] sArray = new short[16];
            int n7 = 0;
            for (n4 = 0; n4 < 16; ++n4) {
                sArray[n4] = this.Code[this.B + n4] & 0xFF;
                n7 += sArray[n4];
            }
            int[] nArray = new int[n7 + 1];
            int[] nArray2 = new int[n7];
            for (n3 = 0; n3 < 16; ++n3) {
                n2 = 1;
                while (n2 <= sArray[n3]) {
                    nArray[n6] = n3 + 1;
                    ++n2;
                    ++n6;
                }
            }
            nArray[n6] = 0;
            n3 = 0;
            n2 = 0;
            int n8 = nArray[0];
            while (nArray[n3] != 0) {
                while (nArray[n3] == n8) {
                    nArray2[n3] = n2++;
                    ++n3;
                }
                if (nArray[n3] == 0) continue;
                while (nArray[n3] != n8) {
                    n2 <<= 1;
                    ++n8;
                }
            }
            this.I[n5] = new int[16];
            this.Code[n5] = new int[16];
            this.Code[n5] = new short[16];
            n4 = 0;
            n3 = 0;
            while (n3 < 16) {
                if (sArray[n3] == 0) {
                    this.Code[n5][n3] = -1;
                    ++n3;
                    continue;
                }
                this.Code[n5][n3] = (short)n4;
                this.I[n5][n3] = nArray2[n4];
                this.Code[n5][n3] = nArray2[n4 += sArray[n3] - 1];
                ++n4;
                ++n3;
            }
            this.B += 16;
            this.C -= 16;
            n -= 16;
            this.I[n5] = new byte[n6];
            for (n4 = 0; n4 < n6; ++n4) {
                this.I[n5][n4] = this.Code[this.B + n4];
            }
            this.B += n6;
            this.C -= n6;
            n -= n6;
            this.Z[n5] = new byte[512];
            for (n6 = 0; n6 < 256; ++n6) {
                this.Z[n5][n6] = 9;
            }
            n6 = 0;
            for (n4 = 1; n4 <= 8; ++n4) {
                for (n3 = 0; n3 < sArray[n4 - 1]; ++n3) {
                    n2 = nArray2[n6] << 8 - n4;
                    for (n8 = 0; n8 < 1 << 8 - n4; ++n8) {
                        this.Z[n5][n2 | n8] = (byte)n4;
                        this.Z[n5][256 + (n2 | n8)] = this.I[n5][n6];
                    }
                    ++n6;
                }
            }
        }
        return 0;
    }

    public a() {
        this.e = new int[6];
        this.Code = new int[16][];
        this.I = new int[16][];
        this.Code = new short[16][];
        this.I = new byte[16][];
        this.Z = new byte[16][];
        this.J = new short[3];
        this.f = new int[3];
        this.Z = new int[4][];
        a.Code();
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.m = 0;
        for (int i = 0; i < 3; ++i) {
            this.Code[i] = null;
            this.Code[i] = null;
            this.I[i] = null;
            this.Code[i] = null;
            this.I[i] = null;
            this.Z[i] = null;
        }
    }

    private int Code(int n) {
        if (n == 0) {
            return 0;
        }
        if (this.s < n) {
            this.J();
            if (this.s < n) {
                return -2;
            }
        }
        int n2 = this.r >>> 32 - n;
        this.r <<= n;
        this.s -= n;
        return n2;
    }

    private int I(int n) {
        int n2;
        byte by;
        if (this.s < 8) {
            this.J();
            if (this.s < 8) {
                return this.I(n, 1);
            }
        }
        if ((by = this.Z[n][n2 = this.r >>> 24]) <= 8) {
            this.r <<= by;
            this.s -= by;
            return this.Z[n][n2 + 256] & 0xFF;
        }
        return this.I(n, 9);
    }

    private static synchronized void Code() {
        if (Code == null) {
            DataInputStream dataInputStream = null;
            try {
                int n;
                dataInputStream = g.Code(1);
                Code = new short[768];
                I = new short[256];
                Z = new short[256];
                Z = new int[64];
                J = new int[64];
                short s = 0;
                for (n = 0; n < 768; ++n) {
                    a.Code[n] = s = (short)(s + dataInputStream.readShort());
                }
                s = 0;
                for (n = 0; n < 256; ++n) {
                    a.I[n] = s = (short)(s + dataInputStream.readShort());
                }
                s = 0;
                for (n = 0; n < 256; ++n) {
                    a.Z[n] = s = (short)(s + dataInputStream.readShort());
                }
                s = 0;
                for (n = 0; n < 64; ++n) {
                    s = (short)(s + dataInputStream.readShort());
                    a.Z[n] = s;
                }
                s = 0;
                for (n = 0; n < 64; ++n) {
                    s = (short)(s + dataInputStream.readShort());
                    a.J[n] = s;
                }
            }
            catch (Throwable throwable) {
                g.Code((InputStream)dataInputStream);
            }
            g.Code((InputStream)dataInputStream);
            return;
        }
    }

    private void Code(boolean bl) {
        int n = this.e << 3;
        int n2 = n * this.p;
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[3];
        int[] nArray4 = new int[3];
        if (this.d == 3) {
            nArray[0] = 0;
            nArray2[0] = (this.C[0] << 11) / this.e;
            nArray4[0] = (this.a[0] << 11) / this.f;
            nArray[1] = 0;
            nArray2[1] = (this.C[1] << 11) / this.e;
            nArray4[1] = (this.a[1] << 11) / this.f;
            nArray[2] = 0;
            nArray2[2] = (this.C[2] << 11) / this.e;
            nArray4[2] = (this.a[2] << 11) / this.f;
        }
        if (!bl) {
            this.u = this.q;
        } else {
            int n3 = this.u = this.n == 0 ? this.q % (this.f << 3) : this.f << 3;
            if (this.u == 0) {
                this.u = this.f << 3;
            }
        }
        nArray4 = bl ? this.I : this.Code;
        for (int i = 0; i < n; ++i) {
            int n4;
            int n5;
            int[] nArray5;
            int n6;
            int[] nArray6;
            int n7;
            int[] nArray7;
            if (n2 + i >= this.Z || this.d != 3) continue;
            int n8 = (n2 + i) * this.q;
            if (bl) {
                n8 += ((this.b[0] + 1 & 0xFFFFFFFE) << 3) - ((this.n / this.o + 1) * this.f << 3);
                if (this.t == -1) {
                    this.t = n8;
                }
                n8 = i * this.f << 3;
            }
            int n9 = nArray[0] >> 11;
            if (bl) {
                nArray7 = this.a;
                n7 = 0;
            } else {
                nArray7 = this.b;
                n7 = 0;
            }
            int n10 = n9 * (nArray7[n7] << 3);
            nArray[0] = nArray[0] + nArray2[0];
            nArray3[0] = 0;
            int n11 = nArray[1] >> 11;
            if (bl) {
                nArray6 = this.a;
                n6 = 1;
            } else {
                nArray6 = this.b;
                n6 = 1;
            }
            int n12 = n11 * (nArray6[n6] << 3);
            nArray[1] = nArray[1] + nArray2[1];
            nArray3[1] = 0;
            int n13 = nArray[2] >> 11;
            if (bl) {
                nArray5 = this.a;
                n5 = 2;
            } else {
                nArray5 = this.b;
                n5 = 2;
            }
            int n14 = n13 * (nArray5[n5] << 3);
            nArray[2] = nArray[2] + nArray2[2];
            nArray3[2] = 0;
            if (this.a[0] != 2 || this.a[1] != 1 || this.a[2] != 1) continue;
            for (n4 = 0; n4 < this.u >> 1; ++n4) {
                int n15 = this.Code[0][n10 + (n4 << 1)] & 0xFF;
                int n16 = this.Code[1][n12 + n4] & 0xFF;
                int n17 = this.Code[2][n14 + n4] & 0xFF;
                short s = I[n17];
                short s2 = Z[n16];
                n16 -= 128;
                n16 = n16 * 705 + (n17 -= 128) * 1463 + 1024 >> 11;
                n17 = Code[n15 + s + 256];
                short s3 = Code[n15 - n16 + 256];
                n15 = Code[n15 + s2 + 256];
                nArray4[n8++] = n17 << 16 | s3 << 8 | n15;
                n15 = this.Code[0][n10 + (n4 << 1) + 1] & 0xFF;
                n17 = Code[n15 + s + 256];
                n16 = Code[n15 - n16 + 256];
                n15 = Code[n15 + s2 + 256];
                nArray4[n8++] = n17 << 16 | n16 << 8 | n15;
            }
            if ((this.q & 1) == 0 || this.n != 0) continue;
            n4 = bl ? 8 * this.f : this.q;
            n10 = this.Code[0][n10 + n4 - 1] & 0xFF;
            n12 = this.Code[1][n12 + (n4 - 1 >> 1)] & 0xFF;
            n14 = this.Code[2][n14 + (n4 - 1 >> 1)] & 0xFF;
            n4 = Code[n10 + Z[n12] + 256];
            n12 -= 128;
            n12 = Code[n10 - (n12 * 705 + (n14 -= 128) * 1463 + 1024 >> 11) + 256];
            n10 = Code[n10 + I[n14 + 128] + 256];
            nArray4[n8] = n10 << 16 | n12 << 8 | n4;
        }
    }

    private int Z() {
        if (this.C < 4) {
            return -2;
        }
        int n = (this.Code[this.B + 2] & 0xFF) << 8 | this.Code[this.B + 3] & 0xFF;
        if (this.C < n + 2) {
            return -2;
        }
        this.B += 4;
        this.C -= 4;
        n -= 2;
        while (n > 0) {
            int n2;
            int n3 = this.Code[this.B] & 0xF0;
            int n4 = (n3 | -n3) >>> 31;
            int n5 = this.Code[this.B] & 0xF;
            ++this.B;
            --this.C;
            --n;
            this.Z[n5] = new int[64];
            if (n4 != 0) {
                for (n4 = 0; n4 < 64; ++n4) {
                    n2 = Z[n4];
                    this.Z[n5][n4] = ((this.Code[this.B + (n2 << 1)] & 0xFF) << 8 | this.Code[this.B + (n2 << 1) + 1] & 0xFF) * J[n4];
                }
                this.B += 128;
                this.C -= 128;
                n -= 128;
                continue;
            }
            for (n4 = 0; n4 < 64; ++n4) {
                n2 = Z[n4];
                this.Z[n5][n4] = (this.Code[this.B + n2] & 0xFF) * J[n4];
            }
            this.B += 64;
            this.C -= 64;
            n -= 64;
        }
        return 0;
    }

    private void Code(int n, short[] sArray, byte[] byArray, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int[] nArray = new int[64];
        int n11 = 0;
        while (n11 < 8) {
            if (sArray[Z[n11 + 8]] == 0 && sArray[Z[n11 + 16]] == 0 && sArray[Z[n11 + 24]] == 0 && sArray[Z[n11 + 32]] == 0 && sArray[Z[n11 + 40]] == 0 && sArray[Z[n11 + 48]] == 0 && sArray[Z[n11 + 56]] == 0) {
                nArray[n11] = n10 = sArray[Z[n11]] * this.Z[this.f[n]][n11];
                nArray[n11 + 8] = n10;
                nArray[n11 + 16] = n10;
                nArray[n11 + 24] = n10;
                nArray[n11 + 32] = n10;
                nArray[n11 + 40] = n10;
                nArray[n11 + 48] = n10;
                nArray[n11 + 56] = n10;
                ++n11;
                continue;
            }
            nArray[n11] = sArray[Z[n11]] * this.Z[this.f[n]][n11];
            nArray[n11 + 8] = sArray[Z[n11 + 8]] * this.Z[this.f[n]][n11 + 8];
            nArray[n11 + 16] = sArray[Z[n11 + 16]] * this.Z[this.f[n]][n11 + 16];
            nArray[n11 + 24] = sArray[Z[n11 + 24]] * this.Z[this.f[n]][n11 + 24];
            nArray[n11 + 32] = sArray[Z[n11 + 32]] * this.Z[this.f[n]][n11 + 32];
            nArray[n11 + 40] = sArray[Z[n11 + 40]] * this.Z[this.f[n]][n11 + 40];
            nArray[n11 + 48] = sArray[Z[n11 + 48]] * this.Z[this.f[n]][n11 + 48];
            nArray[n11 + 56] = sArray[Z[n11 + 56]] * this.Z[this.f[n]][n11 + 56];
            n10 = nArray[n11];
            n9 = nArray[n11 + 32];
            n8 = nArray[n11 + 16] - nArray[n11 + 48];
            n7 = nArray[n11 + 16] + nArray[n11 + 48];
            n6 = n10 - n9;
            n8 = (n8 >> 8) * 362 - n7;
            n5 = n6 - n8;
            n8 = n6 + n8;
            n10 += n9;
            n9 = n10 - n7;
            n10 += n7;
            n7 = nArray[n11 + 40] - nArray[n11 + 24];
            n6 = nArray[n11 + 8] + nArray[n11 + 56];
            n4 = nArray[n11 + 24] + nArray[n11 + 40];
            int n12 = n6 + n4;
            n6 = (n6 - n4 >> 8) * 362;
            n4 = nArray[n11 + 8] - nArray[n11 + 56];
            int n13 = (n7 + n4 >> 8) * 196;
            n7 = (-n7 >> 8) * 277 - n13;
            n4 = (n4 >> 8) * 669 - n13 - n12;
            n6 = n4 - n6;
            nArray[n11] = n10 + n12;
            nArray[n11 + 8] = n8 + n4;
            nArray[n11 + 16] = n5 - n6;
            nArray[n11 + 24] = n9 - (n7 -= n6);
            nArray[n11 + 32] = n9 + n7;
            nArray[n11 + 40] = n5 + n6;
            nArray[n11 + 48] = n8 - n4;
            nArray[n11 + 56] = n10 - n12;
            ++n11;
        }
        for (n = 0; n < 64; n += 8) {
            int n14;
            if (nArray[n + 1] == 0 && nArray[n + 2] == 0 && nArray[n + 3] == 0 && nArray[n + 4] == 0 && nArray[n + 5] == 0 && nArray[n + 6] == 0 && nArray[n + 7] == 0) {
                byArray[n2] = n14 = (int)((byte)Code[(nArray[n] + 1024 >> 11) + 128 + 256]);
                byArray[n2 + 1] = n14;
                byArray[n2 + 2] = n14;
                byArray[n2 + 3] = n14;
                byArray[n2 + 4] = n14;
                byArray[n2 + 5] = n14;
                byArray[n2 + 6] = n14;
                byArray[n2 + 7] = n14;
            } else {
                n14 = nArray[n];
                n11 = nArray[n + 4];
                n10 = nArray[n + 2] - nArray[n + 6];
                n9 = nArray[n + 2] + nArray[n + 6];
                n8 = n14 - n11;
                n10 = (n10 >> 8) * 362 - n9;
                n7 = n8 - n10;
                n10 = n8 + n10;
                n14 += n11;
                n11 = n14 - n9;
                n14 += n9;
                n9 = nArray[n + 5] - nArray[n + 3];
                n8 = nArray[n + 1] + nArray[n + 7];
                n6 = nArray[n + 3] + nArray[n + 5];
                n5 = n8 + n6;
                n8 = (n8 - n6 >> 8) * 362;
                n6 = nArray[n + 1] - nArray[n + 7];
                n4 = (n9 + n6 >> 8) * 196;
                n9 = (-n9 >> 8) * 277 - n4;
                n6 = (n6 >> 8) * 669 - n4 - n5;
                n8 = n6 - n8;
                byArray[n2] = (byte)Code[(n14 + n5 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 1] = (byte)Code[(n10 + n6 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 2] = (byte)Code[(n7 - n8 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 3] = (byte)Code[(n11 - (n9 -= n8) + 1024 >> 11) + 128 + 256];
                byArray[n2 + 4] = (byte)Code[(n11 + n9 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 5] = (byte)Code[(n7 + n8 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 6] = (byte)Code[(n10 - n6 + 1024 >> 11) + 128 + 256];
                byArray[n2 + 7] = (byte)Code[(n14 - n5 + 1024 >> 11) + 128 + 256];
            }
            n2 += n3;
        }
    }
}
