package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pu */
final class C7856pu extends zzdnd {

    /* renamed from: d */
    private final byte[] f16603d;

    /* renamed from: e */
    private int f16604e;

    /* renamed from: f */
    private int f16605f;

    /* renamed from: g */
    private int f16606g;

    /* renamed from: h */
    private int f16607h;

    /* renamed from: i */
    private int f16608i;

    /* renamed from: j */
    private int f16609j;

    private C7856pu(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f16609j = Integer.MAX_VALUE;
        this.f16603d = bArr;
        this.f16604e = i2 + i;
        this.f16606g = i;
        this.f16607h = i;
    }

    /* renamed from: A */
    private final byte m17881A() throws IOException {
        int i = this.f16606g;
        if (i != this.f16604e) {
            byte[] bArr = this.f16603d;
            this.f16606g = i + 1;
            return bArr[i];
        }
        throw zzdok.m24047a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m17883v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f16606g
            int r1 = r5.f16604e
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f16603d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f16606g = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f16606g = r1
            return r0
        L_0x006b:
            long r0 = r5.mo26437u()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7856pu.m17883v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m17884w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f16606g
            int r1 = r11.f16604e
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f16603d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f16606g = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r1 = r1 ^ r3
            r2 = r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r3 = r3 ^ r5
        L_0x006e:
            r2 = r3
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x006e
        L_0x00b3:
            r1 = r0
            goto L_0x006e
        L_0x00b5:
            r11.f16606g = r1
            return r2
        L_0x00b8:
            long r0 = r11.mo26437u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7856pu.m17884w():long");
    }

    /* renamed from: x */
    private final int m17885x() throws IOException {
        int i = this.f16606g;
        if (this.f16604e - i >= 4) {
            byte[] bArr = this.f16603d;
            this.f16606g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzdok.m24047a();
    }

    /* renamed from: y */
    private final long m17886y() throws IOException {
        int i = this.f16606g;
        if (this.f16604e - i >= 8) {
            byte[] bArr = this.f16603d;
            this.f16606g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzdok.m24047a();
    }

    /* renamed from: z */
    private final void m17887z() {
        int i = this.f16604e + this.f16605f;
        this.f16604e = i;
        int i2 = i - this.f16607h;
        int i3 = this.f16609j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f16605f = i4;
            this.f16604e = i - i4;
            return;
        }
        this.f16605f = 0;
    }

    /* renamed from: a */
    public final void mo26414a(int i) throws zzdok {
        if (this.f16608i != i) {
            throw zzdok.m24051e();
        }
    }

    /* renamed from: b */
    public final boolean mo26416b(int i) throws IOException {
        int d;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f16604e - this.f16606g >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f16603d;
                    int i4 = this.f16606g;
                    this.f16606g = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzdok.m24049c();
            }
            while (i3 < 10) {
                if (m17881A() < 0) {
                    i3++;
                }
            }
            throw zzdok.m24049c();
            return true;
        } else if (i2 == 1) {
            m17882f(8);
            return true;
        } else if (i2 == 2) {
            m17882f(m17883v());
            return true;
        } else if (i2 == 3) {
            do {
                d = mo26419d();
                if (d == 0 || !mo26416b(d)) {
                    mo26414a(((i >>> 3) << 3) | 4);
                }
                d = mo26419d();
                break;
            } while (!mo26416b(d));
            mo26414a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m17882f(4);
                return true;
            }
            throw zzdok.m24052f();
        }
    }

    /* renamed from: c */
    public final String mo26418c() throws IOException {
        int v = m17883v();
        if (v > 0 && v <= this.f16604e - this.f16606g) {
            String str = new String(this.f16603d, this.f16606g, v, zzdod.f21586a);
            this.f16606g += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzdok.m24048b();
            }
            throw zzdok.m24047a();
        }
    }

    /* renamed from: d */
    public final int mo26419d() throws IOException {
        if (mo26435s()) {
            this.f16608i = 0;
            return 0;
        }
        int v = m17883v();
        this.f16608i = v;
        if ((v >>> 3) != 0) {
            return v;
        }
        throw zzdok.m24050d();
    }

    /* renamed from: e */
    public final long mo26421e() throws IOException {
        return m17884w();
    }

    /* renamed from: f */
    public final long mo26422f() throws IOException {
        return m17884w();
    }

    /* renamed from: g */
    public final int mo26423g() throws IOException {
        return m17883v();
    }

    /* renamed from: h */
    public final long mo26424h() throws IOException {
        return m17886y();
    }

    /* renamed from: i */
    public final int mo26425i() throws IOException {
        return m17885x();
    }

    /* renamed from: j */
    public final boolean mo26426j() throws IOException {
        return m17884w() != 0;
    }

    /* renamed from: k */
    public final String mo26427k() throws IOException {
        int v = m17883v();
        if (v > 0) {
            int i = this.f16604e;
            int i2 = this.f16606g;
            if (v <= i - i2) {
                String c = C7711lx.m17534c(this.f16603d, i2, v);
                this.f16606g += v;
                return c;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw zzdok.m24048b();
        }
        throw zzdok.m24047a();
    }

    /* renamed from: l */
    public final zzdmr mo26428l() throws IOException {
        byte[] bArr;
        int v = m17883v();
        if (v > 0) {
            int i = this.f16604e;
            int i2 = this.f16606g;
            if (v <= i - i2) {
                zzdmr a = zzdmr.m23764a(this.f16603d, i2, v);
                this.f16606g += v;
                return a;
            }
        }
        if (v == 0) {
            return zzdmr.f21488g;
        }
        if (v > 0) {
            int i3 = this.f16604e;
            int i4 = this.f16606g;
            if (v <= i3 - i4) {
                int i5 = v + i4;
                this.f16606g = i5;
                bArr = Arrays.copyOfRange(this.f16603d, i4, i5);
                return zzdmr.m23763a(bArr);
            }
        }
        if (v > 0) {
            throw zzdok.m24047a();
        } else if (v == 0) {
            bArr = zzdod.f21587b;
            return zzdmr.m23763a(bArr);
        } else {
            throw zzdok.m24048b();
        }
    }

    /* renamed from: m */
    public final int mo26429m() throws IOException {
        return m17883v();
    }

    /* renamed from: n */
    public final int mo26430n() throws IOException {
        return m17883v();
    }

    /* renamed from: o */
    public final int mo26431o() throws IOException {
        return m17885x();
    }

    /* renamed from: p */
    public final long mo26432p() throws IOException {
        return m17886y();
    }

    /* renamed from: q */
    public final int mo26433q() throws IOException {
        return zzdnd.m23783e(m17883v());
    }

    /* renamed from: r */
    public final long mo26434r() throws IOException {
        return zzdnd.m23781a(m17884w());
    }

    /* renamed from: s */
    public final boolean mo26435s() throws IOException {
        return this.f16606g == this.f16604e;
    }

    /* renamed from: t */
    public final int mo26436t() {
        return this.f16606g - this.f16607h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final long mo26437u() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m17881A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzdok.m24049c();
    }

    /* renamed from: f */
    private final void m17882f(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f16604e;
            int i3 = this.f16606g;
            if (i <= i2 - i3) {
                this.f16606g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzdok.m24048b();
        }
        throw zzdok.m24047a();
    }

    /* renamed from: a */
    public final double mo26413a() throws IOException {
        return Double.longBitsToDouble(m17886y());
    }

    /* renamed from: d */
    public final void mo26420d(int i) {
        this.f16609j = i;
        m17887z();
    }

    /* renamed from: c */
    public final int mo26417c(int i) throws zzdok {
        if (i >= 0) {
            int t = i + mo26436t();
            int i2 = this.f16609j;
            if (t <= i2) {
                this.f16609j = t;
                m17887z();
                return i2;
            }
            throw zzdok.m24047a();
        }
        throw zzdok.m24048b();
    }

    /* renamed from: b */
    public final float mo26415b() throws IOException {
        return Float.intBitsToFloat(m17885x());
    }
}
