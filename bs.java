/*
 * Decompiled with CFR 0.152.
 */
public final class bs {
    private static final bs a = new bs(0, new int[0]);
    private static final bs b = new bs(new byte[]{1});
    private int[] c;
    private long d = -1L;
    private int e = -1;
    private int f = -1;
    private int g;

    public bs(byte[] byArray) {
        this.c = bs.a(byArray);
        this.g = 1;
    }

    private bs() {
    }

    private bs(int n, int[] nArray) {
        if (nArray.length > 0) {
            this.g = n;
            for (n = 0; n < nArray.length && nArray[n] == 0; ++n) {
            }
            if (n == 0) {
                this.c = nArray;
                return;
            }
            int[] nArray2 = new int[nArray.length - n];
            System.arraycopy(nArray, n, nArray2, 0, nArray2.length);
            this.c = nArray2;
            if (nArray2.length == 0) {
                this.g = 0;
            }
            return;
        }
        this.c = nArray;
        this.g = 0;
    }

    public final int a() {
        if (this.e == -1) {
            this.e = this.g == 0 ? 0 : this.b(0, this.c);
        }
        return this.e;
    }

    public final int a(Object object) {
        return this.b((bs)object);
    }

    public final bs a(bs bs2, bs bs3) {
        int[] nArray;
        Object object;
        bs bs4;
        bs bs5;
        Object object2;
        Object object3;
        if (bs3.g <= 0) {
            throw new ArithmeticException();
        }
        if ((bs3.c[bs3.c.length - 1] & 1) != 1) {
            throw new ArithmeticException();
        }
        if (bs3.c(b)) {
            return a;
        }
        if (bs2.g == 0) {
            return b;
        }
        if (this.g == 0) {
            return a;
        }
        Object object4 = bs3;
        if (((bs)object4).d != -1L) {
            object3 = ((bs)object4).d;
        } else if ((((bs)object4).c[((bs)object4).c.length - 1] & 1) == 0) {
            object3 = -1L;
        } else {
            long l = (long)(~((bs)object4).c[((bs)object4).c.length - 1] | 1) & 0xFFFFFFFFL;
            if (0x100000000L < 0L) {
                throw new ArithmeticException();
            }
            object2 = new long[2];
            if (bs.a(l, (long[])object2) != 1L) {
                throw new ArithmeticException();
            }
            if (object2[0] < 0L) {
                object2[0] = object2[0] + 0x100000000L;
            }
            object3 = ((bs)object4).d = (Object)object2[0];
        }
        Object object5 = object3;
        int n = 32 * bs3.c.length;
        object4 = this;
        if (((bs)object4).g == 0 || ((bs)object4).c.length == 0) {
            bs5 = a;
        } else if (n == 0) {
            bs5 = object4;
        } else {
            if (n < 0) {
                throw new RuntimeException();
            }
            bs4 = new bs(((bs)object4).g, bs.a(((bs)object4).c, n));
            if (((bs)object4).f != -1) {
                int n2 = bs4.f = ((bs)object4).g > 0 ? ((bs)object4).f : ((bs)object4).f + n;
            }
            if (((bs)object4).e != -1) {
                bs4.e = ((bs)object4).e + n;
            }
            bs5 = bs4;
        }
        bs bs6 = bs3;
        object4 = bs5;
        if (bs6.g <= 0) {
            throw new ArithmeticException();
        }
        bs bs7 = object4;
        object4 = bs6;
        object2 = bs7;
        if (((bs)object4).g == 0) {
            throw new ArithmeticException();
        }
        if (((bs)object2).g == 0) {
            object = a;
        } else if (bs.b(0, ((bs)object2).c, 0, ((bs)object4).c) < 0) {
            object = object2;
        } else {
            nArray = new int[((bs)object2).c.length];
            System.arraycopy(((bs)object2).c, 0, nArray, 0, nArray.length);
            nArray = super.c(nArray, ((bs)object4).c);
            object = new bs(((bs)object2).g, nArray);
        }
        bs4 = object;
        bs bs8 = ((bs)object).g >= 0 ? bs4 : bs4.a(bs6);
        object4 = bs8.c;
        if (bs8.c.length > bs3.c.length) {
            throw new ArithmeticException();
        }
        object2 = new int[bs3.c.length + 1];
        if (((Object)object4).length < bs3.c.length) {
            int[] nArray2 = new int[bs3.c.length];
            System.arraycopy(object4, 0, nArray2, nArray2.length - ((Object)object4).length, ((Object)object4).length);
            object4 = nArray2;
        }
        nArray = new int[bs3.c.length];
        for (int i = 0; i < bs2.c.length; ++i) {
            int n3 = bs2.c[i];
            int n4 = 0;
            if (i == 0) {
                while (n3 > 0) {
                    n3 <<= 1;
                    ++n4;
                }
                System.arraycopy(object4, 0, nArray, 0, ((Object)object4).length);
                n3 <<= 1;
                ++n4;
            }
            while (n3 != 0) {
                bs.a((int[])object2, nArray, nArray, bs3.c, object5);
                ++n4;
                if (n3 < 0) {
                    bs.a((int[])object2, nArray, (int[])object4, bs3.c, object5);
                }
                n3 <<= 1;
            }
            while (n4 < 32) {
                bs.a((int[])object2, nArray, nArray, bs3.c, object5);
                ++n4;
            }
        }
        bs.a((int[])object4);
        object4[((Object)object4).length - 1] = true;
        bs.a((int[])object2, nArray, (int[])object4, bs3.c, object5);
        bs bs9 = new bs(1, nArray);
        if (bs2.g > 0) {
            return bs9;
        }
        bs6 = bs3;
        object4 = bs9;
        if (bs6.g != 1) {
            throw new ArithmeticException();
        }
        bs4 = new bs();
        if (!bs.a((bs)object4, bs6, bs4).c(b)) {
            throw new ArithmeticException();
        }
        if (bs4.b(a) < 0) {
            bs4 = bs4.a(bs6);
        }
        return bs4;
    }

    public final byte[] b() {
        int n;
        if (this.g == 0) {
            return new byte[1];
        }
        if (this.g < 0) {
            throw new RuntimeException();
        }
        byte[] byArray = new byte[this.a() / 8 + 1];
        int n2 = this.c.length;
        int n3 = byArray.length;
        while (n2 > 1) {
            n = this.c[--n2];
            byArray[--n3] = (byte)n;
            byArray[--n3] = (byte)(n >>> 8);
            byArray[--n3] = (byte)(n >>> 16);
            byArray[--n3] = n >> 24;
        }
        n = this.c[0];
        while ((n & 0xFFFFFF00) != 0) {
            byArray[--n3] = (byte)n;
            n >>>= 8;
        }
        byArray[--n3] = (byte)n;
        return byArray;
    }

    private static int a(int n) {
        if (n < 32768) {
            if (n < 128) {
                if (n < 8) {
                    if (n < 2) {
                        if (n <= 0) {
                            if (n < 0) {
                                return 32;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    if (n < 4) {
                        return 2;
                    }
                    return 3;
                }
                if (n < 32) {
                    if (n < 16) {
                        return 4;
                    }
                    return 5;
                }
                if (n < 64) {
                    return 6;
                }
                return 7;
            }
            if (n < 2048) {
                if (n < 512) {
                    if (n < 256) {
                        return 8;
                    }
                    return 9;
                }
                if (n < 1024) {
                    return 10;
                }
                return 11;
            }
            if (n < 8192) {
                if (n < 4096) {
                    return 12;
                }
                return 13;
            }
            if (n < 16384) {
                return 14;
            }
            return 15;
        }
        if (n < 0x800000) {
            if (n < 524288) {
                if (n < 131072) {
                    if (n < 65536) {
                        return 16;
                    }
                    return 17;
                }
                if (n < 262144) {
                    return 18;
                }
                return 19;
            }
            if (n < 0x200000) {
                if (n < 0x100000) {
                    return 20;
                }
                return 21;
            }
            if (n < 0x400000) {
                return 22;
            }
            return 23;
        }
        if (n < 0x8000000) {
            if (n < 0x2000000) {
                if (n < 0x1000000) {
                    return 24;
                }
                return 25;
            }
            if (n < 0x4000000) {
                return 26;
            }
            return 27;
        }
        if (n < 0x20000000) {
            if (n < 0x10000000) {
                return 28;
            }
            return 29;
        }
        if (n < 0x40000000) {
            return 30;
        }
        return 31;
    }

    private static bs a(bs bs2, bs bs3, bs bs4) {
        bs bs5 = b;
        bs bs6 = a;
        while (bs3.g > 0) {
            bs bs7;
            Object[] objectArray;
            int[] nArray;
            bs[] bsArray;
            bs bs8 = bs3;
            if (bs8.g == 0) {
                throw new ArithmeticException();
            }
            bs[] bsArray2 = new bs[2];
            if (bs2.g == 0) {
                bsArray2[0] = bsArray2[1] = a;
                bsArray = bsArray2;
            } else if (bs8.b(b) == 0) {
                bsArray2[0] = bs2;
                bsArray2[1] = a;
                bsArray = bsArray2;
            } else {
                nArray = new int[bs2.c.length];
                System.arraycopy(bs2.c, 0, nArray, 0, nArray.length);
                objectArray = bs2.b(nArray, bs8.c);
                bsArray2[0] = new bs(bs2.g * bs8.g, (int[])objectArray);
                bsArray2[1] = new bs(bs2.g, nArray);
                bsArray = bsArray2;
            }
            objectArray = bsArray;
            bs8 = objectArray[0];
            bs2 = bs6;
            if (bs2.g == 0 || bs8.g == 0) {
                bs7 = a;
            } else {
                nArray = new int[(bs2.a() + bs8.a()) / 32 + 1];
                bs.a(nArray, bs2.c, bs8.c);
                bs7 = new bs(bs2.g * bs8.g, nArray);
            }
            bs2 = bs5.d(bs7);
            bs5 = bs6;
            bs6 = bs2;
            bs2 = bs3;
            bs3 = objectArray[1];
        }
        if (bs4 != null) {
            bs4.g = bs5.g;
            bs4.c = bs5.c;
        }
        return bs2;
    }

    private static int[] a(byte[] byArray) {
        int n;
        for (n = 0; n < byArray.length && byArray[n] == 0; ++n) {
        }
        if (n >= byArray.length) {
            return new int[0];
        }
        int n2 = (byArray.length - n + 3) / 4;
        int n3 = (byArray.length - n) % 4;
        if (n3 == 0) {
            n3 = 4;
        }
        int[] nArray = new int[n2];
        int n4 = 0;
        int n5 = 0;
        while (n < byArray.length) {
            n4 = n4 << 8 | byArray[n] & 0xFF;
            if (--n3 <= 0) {
                nArray[n5] = n4;
                ++n5;
                n3 = 4;
                n4 = 0;
            }
            ++n;
        }
        return nArray;
    }

    private static void a(int n, int[] nArray, int n2) {
        int n3;
        int n4;
        int n5 = (n2 >>> 5) + n;
        n2 &= 0x1F;
        int n6 = nArray.length - 1;
        if (n5 != n) {
            n4 = n5 - n;
            for (n3 = n6; n3 >= n5; --n3) {
                nArray[n3] = nArray[n3 - n4];
            }
            for (n3 = n5 - 1; n3 >= n; --n3) {
                nArray[n3] = 0;
            }
        }
        if (n2 != 0) {
            n4 = 32 - n2;
            n3 = nArray[n6];
            for (n = n6; n >= n5 + 1; --n) {
                n6 = nArray[n - 1];
                nArray[n] = n3 >>> n2 | n6 << n4;
                n3 = n6;
            }
            int n7 = n5;
            nArray[n7] = nArray[n7] >>> n2;
        }
    }

    private static void a(int n, int[] nArray) {
        int n2;
        int n3 = nArray[n2];
        for (n2 = nArray.length - 1; n2 > n; --n2) {
            int n4 = nArray[n2 - 1];
            nArray[n2] = n3 >>> 1 | n4 << 31;
            n3 = n4;
        }
        int n5 = n;
        nArray[n5] = nArray[n5] >>> 1;
    }

    private bs a(bs bs2) {
        int[] nArray;
        if (bs2.g == 0 || bs2.c.length == 0) {
            return this;
        }
        if (this.g == 0 || this.c.length == 0) {
            return bs2;
        }
        if (bs2.g < 0) {
            if (this.g > 0) {
                return this.d(bs2.c());
            }
        } else if (this.g < 0) {
            return bs2.d(this.c());
        }
        int[] nArray2 = bs2.c;
        bs2 = this;
        if (bs2.c.length < nArray2.length) {
            nArray = nArray2;
            nArray2 = bs2.c;
        } else {
            nArray = bs2.c;
        }
        int n = Integer.MAX_VALUE;
        if (nArray.length == nArray2.length) {
            n = Integer.MAX_VALUE - nArray2[0];
        }
        n = (nArray[0] ^ Integer.MIN_VALUE) >= n ? 1 : 0;
        int[] nArray3 = new int[nArray.length + n];
        System.arraycopy(nArray, 0, nArray3, n, nArray.length);
        nArray3 = bs.a(nArray3, nArray2);
        return new bs(bs2.g, nArray3);
    }

    private static int[] a(int[] nArray, int[] nArray2) {
        int n = nArray.length - 1;
        int n2 = nArray2.length - 1;
        long l = 0L;
        while (n2 >= 0) {
            nArray[n--] = (int)(l += ((long)nArray[n] & 0xFFFFFFFFL) + ((long)nArray2[n2--] & 0xFFFFFFFFL));
            l >>>= 32;
        }
        while (n >= 0 && l != 0L) {
            nArray[n--] = (int)(l += (long)nArray[n] & 0xFFFFFFFFL);
            l >>>= 32;
        }
        return nArray;
    }

    private int b(int n, int[] nArray) {
        if (nArray.length == 0) {
            return 0;
        }
        while (n != nArray.length && nArray[n] == 0) {
            ++n;
        }
        if (n == nArray.length) {
            return 0;
        }
        int n2 = 32 * (nArray.length - n - 1) + bs.a(nArray[n]);
        if (this.g < 0) {
            int n3 = nArray[n];
            int n4 = 0;
            for (int i = 0; i < 31 && n4 <= 1; ++i) {
                if ((n3 & 1) == 1) {
                    ++n4;
                }
                n3 >>= 1;
            }
            n3 = n4 == 1 ? 1 : 0;
            ++n;
            while (n < nArray.length && n3 != 0) {
                n3 = nArray[n] == 0 ? 1 : 0;
                ++n;
            }
            n2 -= n3 != 0 ? 1 : 0;
        }
        return n2;
    }

    private static int a(int n, int[] nArray, int n2, int[] nArray2) {
        int n3 = nArray.length - nArray2.length - (n - n2);
        if (n3 != 0) {
            if (n3 < 0) {
                return -1;
            }
            return 1;
        }
        while (n < nArray.length) {
            int n4;
            if ((n3 = nArray[n++]) == (n4 = nArray2[n2++])) continue;
            if ((n3 ^ Integer.MIN_VALUE) < (n4 ^ Integer.MIN_VALUE)) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    private int b(bs bs2) {
        if (this.g < bs2.g) {
            return -1;
        }
        if (this.g > bs2.g) {
            return 1;
        }
        if (this.g == 0) {
            return 0;
        }
        return this.g * bs.b(0, this.c, 0, bs2.c);
    }

    private static int b(int n, int[] nArray, int n2, int[] nArray2) {
        while (n != nArray.length && nArray[n] == 0) {
            ++n;
        }
        while (n2 != nArray2.length && nArray2[n2] == 0) {
            ++n2;
        }
        return bs.a(n, nArray, n2, nArray2);
    }

    private int[] b(int[] nArray, int[] nArray2) {
        int[] nArray3;
        int n = bs.b(0, nArray, 0, nArray2);
        if (n > 0) {
            int[] nArray4;
            int[] nArray5;
            n = this.b(0, nArray) - this.b(0, nArray2);
            if (n > 1) {
                nArray5 = bs.a(nArray2, n - 1);
                nArray3 = bs.a(bs.b.c, n - 1);
                if (n % 32 == 0) {
                    nArray4 = new int[n / 32 + 1];
                    System.arraycopy(nArray3, 0, nArray4, 1, nArray4.length - 1);
                    nArray4[0] = 0;
                    nArray3 = nArray4;
                }
            } else {
                nArray5 = new int[nArray.length];
                nArray3 = new int[1];
                System.arraycopy(nArray2, 0, nArray5, nArray5.length - nArray2.length, nArray2.length);
                nArray3[0] = 1;
            }
            nArray4 = new int[nArray3.length];
            bs.a(nArray, 0, nArray5);
            System.arraycopy(nArray3, 0, nArray4, 0, nArray3.length);
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                if (bs.b(n2, nArray, n3, nArray5) >= 0) {
                    bs.a(nArray, n3, nArray5);
                    bs.a(nArray3, nArray4);
                    continue;
                }
                n = bs.b(n2, nArray, 0, nArray2);
                if (n <= 0) break;
                if (nArray[n2] == 0) {
                    ++n2;
                }
                if ((n = this.b(n3, nArray5) - this.b(n2, nArray)) == 0) {
                    bs.a(n3, nArray5);
                    bs.a(n4, nArray4);
                } else {
                    bs.a(n3, nArray5, n);
                    bs.a(n4, nArray4, n);
                }
                if (nArray5[n3] == 0) {
                    ++n3;
                }
                if (nArray4[n4] != 0) continue;
                ++n4;
            }
            if (n == 0) {
                bs.a(nArray3, bs.b.c);
                for (int i = n2; i != nArray.length; ++i) {
                    nArray[i] = 0;
                }
            }
        } else if (n == 0) {
            int[] nArray6 = new int[1];
            nArray3 = nArray6;
            nArray6[0] = 1;
        } else {
            int[] nArray7 = new int[1];
            nArray3 = nArray7;
            nArray7[0] = 0;
        }
        return nArray3;
    }

    private static long a(long l, long[] lArray) {
        long l2;
        long l3 = 1L;
        long l4 = l;
        long l5 = 0L;
        long l6 = 0x100000000L;
        while (l6 > 0L) {
            long l7 = l4 / l6;
            long l8 = l3 - l5 * l7;
            l3 = l5;
            l5 = l8;
            l8 = l4 - l6 * l7;
            l4 = l6;
            l6 = l8;
        }
        lArray[0] = l3;
        lArray[1] = l2 = (l4 - l3 * l) / 0x100000000L;
        return l4;
    }

    private boolean c(bs bs2) {
        if (bs2 == this) {
            return true;
        }
        if (bs2 == null) {
            return false;
        }
        if (bs2.g != this.g || bs2.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; ++i) {
            if (bs2.c[i] == this.c[i]) continue;
            return false;
        }
        return true;
    }

    private static int[] a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n = nArray3.length;
        if (n <= 0) {
            return nArray;
        }
        int n2 = nArray.length - nArray2.length;
        while (true) {
            long l = (long)nArray3[--n] & 0xFFFFFFFFL;
            long l2 = 0L;
            for (int i = nArray2.length - 1; i >= 0; --i) {
                nArray[n2 + i] = (int)(l2 += l * ((long)nArray2[i] & 0xFFFFFFFFL) + ((long)nArray[n2 + i] & 0xFFFFFFFFL));
                l2 >>>= 32;
            }
            --n2;
            if (n <= 0) {
                if (n2 < 0) break;
                nArray[n2] = (int)l2;
                break;
            }
            nArray[n2] = (int)l2;
        }
        return nArray;
    }

    private static void a(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, long l) {
        int n;
        int n2 = nArray4.length;
        int n3 = n2 - 1;
        long l2 = (long)nArray3[n3] & 0xFFFFFFFFL;
        for (n = 0; n <= n2; ++n) {
            nArray[n] = 0;
        }
        for (n = n2; n > 0; --n) {
            long l3 = (long)nArray2[n - 1] & 0xFFFFFFFFL;
            long l4 = (((long)nArray[n2] & 0xFFFFFFFFL) + (l3 * l2 & 0xFFFFFFFFL) & 0xFFFFFFFFL) * l & 0xFFFFFFFFL;
            long l5 = l3 * l2;
            long l6 = l4 * ((long)nArray4[n3] & 0xFFFFFFFFL);
            long l7 = ((long)nArray[n2] & 0xFFFFFFFFL) + (l5 & 0xFFFFFFFFL) + (l6 & 0xFFFFFFFFL);
            long l8 = (l5 >>> 32) + (l6 >>> 32) + (l7 >>> 32);
            for (int i = n3; i > 0; --i) {
                l5 = l3 * ((long)nArray3[i - 1] & 0xFFFFFFFFL);
                l6 = l4 * ((long)nArray4[i - 1] & 0xFFFFFFFFL);
                l7 = ((long)nArray[i] & 0xFFFFFFFFL) + (l5 & 0xFFFFFFFFL) + (l6 & 0xFFFFFFFFL) + (l8 & 0xFFFFFFFFL);
                l8 = (l8 >>> 32) + (l5 >>> 32) + (l6 >>> 32) + (l7 >>> 32);
                nArray[i + 1] = (int)l7;
            }
            nArray[1] = (int)(l8 += (long)nArray[0] & 0xFFFFFFFFL);
            nArray[0] = (int)(l8 >>> 32);
        }
        if (bs.b(0, nArray, 0, nArray4) >= 0) {
            bs.a(nArray, 0, nArray4);
        }
        System.arraycopy(nArray, 1, nArray2, 0, n2);
    }

    private bs c() {
        if (this.g == 0) {
            return this;
        }
        return new bs(-this.g, this.c);
    }

    private int[] c(int[] nArray, int[] nArray2) {
        int n;
        int n2;
        for (n2 = 0; n2 < nArray.length && nArray[n2] == 0; ++n2) {
        }
        for (n = 0; n < nArray2.length && nArray2[n] == 0; ++n) {
        }
        int n3 = bs.a(n2, nArray, n, nArray2);
        if (n3 > 0) {
            int[] nArray3;
            n3 = this.b(n, nArray2);
            int n4 = this.b(n2, nArray);
            int n5 = n4 - n3;
            int n6 = 0;
            int n7 = n3;
            if (n5 > 0) {
                nArray3 = bs.a(nArray2, n5);
                n7 += n5;
            } else {
                n3 = nArray2.length - n;
                nArray3 = new int[n3];
                System.arraycopy(nArray2, n, nArray3, 0, n3);
            }
            block2: while (true) {
                if (n7 < n4 || bs.a(n2, nArray, n6, nArray3) >= 0) {
                    bs.a(nArray, n6, nArray3);
                    while (nArray[n2] == 0) {
                        if (++n2 != nArray.length) continue;
                        return nArray;
                    }
                    n3 = bs.a(n2, nArray, n, nArray2);
                    if (n3 <= 0) break;
                    n4 = 32 * (nArray.length - n2 - 1) + bs.a(nArray[n2]);
                }
                if ((n5 = n7 - n4) < 2) {
                    bs.a(n6, nArray3);
                    --n7;
                } else {
                    bs.a(n6, nArray3, n5);
                    n7 -= n5;
                }
                while (true) {
                    if (nArray3[n6] != 0) continue block2;
                    ++n6;
                }
                break;
            }
        }
        if (n3 == 0) {
            for (n3 = n2; n3 < nArray.length; ++n3) {
                nArray[n3] = 0;
            }
        }
        return nArray;
    }

    private static int[] a(int[] nArray, int n) {
        int[] nArray2;
        int n2 = n >>> 5;
        int n3 = nArray.length;
        if ((n &= 0x1F) == 0) {
            nArray2 = new int[n3 + n2];
            System.arraycopy(nArray, 0, nArray2, 0, n3);
        } else {
            int n4 = 0;
            int n5 = 32 - n;
            int n6 = nArray[0] >>> n5;
            if (n6 != 0) {
                int[] nArray3 = new int[n3 + n2 + 1];
                nArray2 = nArray3;
                ++n4;
                nArray3[0] = n6;
            } else {
                nArray2 = new int[n3 + n2];
            }
            n6 = nArray[0];
            for (int i = 0; i < n3 - 1; ++i) {
                int n7 = nArray[i + 1];
                nArray2[n4++] = n6 << n | n7 >>> n5;
                n6 = n7;
            }
            nArray2[n4] = nArray[n3 - 1] << n;
        }
        return nArray2;
    }

    private bs d(bs bs2) {
        bs bs3;
        if (bs2.g == 0 || bs2.c.length == 0) {
            return this;
        }
        if (this.g == 0 || this.c.length == 0) {
            return bs2.c();
        }
        if (this.g != bs2.g) {
            return this.a(bs2.c());
        }
        int n = bs.b(0, this.c, 0, bs2.c);
        if (n == 0) {
            return a;
        }
        if (n < 0) {
            bs3 = bs2;
            bs2 = this;
        } else {
            bs3 = this;
        }
        int[] nArray = new int[bs3.c.length];
        System.arraycopy(bs3.c, 0, nArray, 0, nArray.length);
        return new bs(this.g * n, bs.a(nArray, 0, bs2.c));
    }

    private static int[] a(int[] nArray, int n, int[] nArray2) {
        int n2 = nArray.length;
        int n3 = nArray2.length;
        int n4 = 0;
        do {
            long l = ((long)nArray[--n2] & 0xFFFFFFFFL) - ((long)nArray2[--n3] & 0xFFFFFFFFL) + (long)n4;
            nArray[n2] = (int)l;
            n4 = (int)(l >> 63);
        } while (n3 > n);
        if (n4 != 0) {
            int n5;
            do {
                n5 = --n2;
            } while ((nArray[n5] = nArray[n5] - 1) == -1);
        }
        return nArray;
    }

    private static void a(int[] nArray) {
        for (int i = 0; i != nArray.length; ++i) {
            nArray[i] = 0;
        }
    }

    static {
        bs.a.f = 0;
        bs.a.e = 0;
        bs.b.f = 1;
        bs.b.e = 1;
    }
}
