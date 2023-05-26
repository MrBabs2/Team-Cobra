package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zztv extends zztd {

    /* renamed from: b */
    private static final Logger f23435b = Logger.getLogger(zztv.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f23436c = C8367y2.m26306b();

    /* renamed from: a */
    C8341s0 f23437a;

    /* renamed from: com.google.android.gms.internal.measurement.zztv$a */
    static class C8380a extends zztv {

        /* renamed from: d */
        private final byte[] f23438d;

        /* renamed from: e */
        private final int f23439e;

        /* renamed from: f */
        private int f23440f;

        C8380a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f23438d = bArr;
                    this.f23440f = i;
                    this.f23439e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final void mo30387a(int i, int i2) throws IOException {
            mo30400b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo30401b(int i, int i2) throws IOException {
            mo30387a(i, 0);
            mo30384a(i2);
        }

        /* renamed from: c */
        public final void mo30407c(int i, int i2) throws IOException {
            mo30387a(i, 0);
            mo30400b(i2);
        }

        /* renamed from: d */
        public final void mo30414d(int i, zzvv zzvv) throws IOException {
            mo30387a(i, 2);
            mo30396a(zzvv);
        }

        /* renamed from: e */
        public final void mo30412e(int i, int i2) throws IOException {
            mo30387a(i, 5);
            mo30410d(i2);
        }

        /* renamed from: a */
        public final void mo30388a(int i, long j) throws IOException {
            mo30387a(i, 0);
            mo30394a(j);
        }

        /* renamed from: b */
        public final void mo30405b(byte[] bArr, int i, int i2) throws IOException {
            mo30400b(i2);
            mo30413c(bArr, 0, i2);
        }

        /* renamed from: c */
        public final void mo30408c(int i, long j) throws IOException {
            mo30387a(i, 1);
            mo30409c(j);
        }

        /* renamed from: d */
        public final void mo30410d(int i) throws IOException {
            try {
                byte[] bArr = this.f23438d;
                int i2 = this.f23440f;
                int i3 = i2 + 1;
                this.f23440f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f23438d;
                int i4 = i3 + 1;
                this.f23440f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f23438d;
                int i5 = i4 + 1;
                this.f23440f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f23438d;
                this.f23440f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo30393a(int i, boolean z) throws IOException {
            mo30387a(i, 0);
            mo30381a(z ? (byte) 1 : 0);
        }

        /* renamed from: b */
        public final void mo30403b(int i, zzte zzte) throws IOException {
            mo30387a(1, 3);
            mo30407c(2, i);
            mo30389a(3, zzte);
            mo30387a(1, 4);
        }

        /* renamed from: c */
        public final void mo30409c(long j) throws IOException {
            try {
                byte[] bArr = this.f23438d;
                int i = this.f23440f;
                int i2 = i + 1;
                this.f23440f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f23438d;
                int i3 = i2 + 1;
                this.f23440f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f23438d;
                int i4 = i3 + 1;
                this.f23440f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f23438d;
                int i5 = i4 + 1;
                this.f23440f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f23438d;
                int i6 = i5 + 1;
                this.f23440f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f23438d;
                int i7 = i6 + 1;
                this.f23440f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f23438d;
                int i8 = i7 + 1;
                this.f23440f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f23438d;
                this.f23440f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo30392a(int i, String str) throws IOException {
            mo30387a(i, 2);
            mo30397a(str);
        }

        /* renamed from: a */
        public final void mo30389a(int i, zzte zzte) throws IOException {
            mo30387a(i, 2);
            mo30395a(zzte);
        }

        /* renamed from: b */
        public final void mo30400b(int i) throws IOException {
            if (!zztv.f23436c || mo30380a() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f23438d;
                    int i2 = this.f23440f;
                    this.f23440f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f23438d;
                    int i3 = this.f23440f;
                    this.f23440f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f23438d;
                    int i4 = this.f23440f;
                    this.f23440f = i4 + 1;
                    C8367y2.m26300a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f23438d;
                int i5 = this.f23440f;
                this.f23440f = i5 + 1;
                C8367y2.m26300a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: a */
        public final void mo30395a(zzte zzte) throws IOException {
            mo30400b(zzte.size());
            zzte.mo30205a((zztd) this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo30391a(int i, zzvv zzvv, C8273d2 d2Var) throws IOException {
            mo30387a(i, 2);
            zzsx zzsx = (zzsx) zzvv;
            int a = zzsx.mo30367a();
            if (a == -1) {
                a = d2Var.mo30092c(zzsx);
                zzsx.mo30368a(a);
            }
            mo30400b(a);
            d2Var.mo30088a(zzvv, (C8309k3) this.f23437a);
        }

        /* renamed from: c */
        public final void mo30413c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f23438d, this.f23440f, i2);
                this.f23440f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo30390a(int i, zzvv zzvv) throws IOException {
            mo30387a(1, 3);
            mo30407c(2, i);
            mo30414d(3, zzvv);
            mo30387a(1, 4);
        }

        /* renamed from: a */
        public final void mo30396a(zzvv zzvv) throws IOException {
            mo30400b(zzvv.mo30425b());
            zzvv.mo30424a(this);
        }

        /* renamed from: a */
        public final void mo30381a(byte b) throws IOException {
            try {
                byte[] bArr = this.f23438d;
                int i = this.f23440f;
                this.f23440f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo30384a(int i) throws IOException {
            if (i >= 0) {
                mo30400b(i);
            } else {
                mo30394a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo30394a(long j) throws IOException {
            if (!zztv.f23436c || mo30380a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f23438d;
                    int i = this.f23440f;
                    this.f23440f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f23438d;
                    int i2 = this.f23440f;
                    this.f23440f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23440f), Integer.valueOf(this.f23439e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f23438d;
                    int i3 = this.f23440f;
                    this.f23440f = i3 + 1;
                    C8367y2.m26300a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f23438d;
                int i4 = this.f23440f;
                this.f23440f = i4 + 1;
                C8367y2.m26300a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo30374a(byte[] bArr, int i, int i2) throws IOException {
            mo30413c(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo30397a(String str) throws IOException {
            int i = this.f23440f;
            try {
                int g = zztv.m26567g(str.length() * 3);
                int g2 = zztv.m26567g(str.length());
                if (g2 == g) {
                    int i2 = i + g2;
                    this.f23440f = i2;
                    int a = C8259a3.m25880a(str, this.f23438d, i2, mo30380a());
                    this.f23440f = i;
                    mo30400b((a - i) - g2);
                    this.f23440f = a;
                    return;
                }
                mo30400b(C8259a3.m25879a((CharSequence) str));
                this.f23440f = C8259a3.m25880a(str, this.f23438d, this.f23440f, mo30380a());
            } catch (C8274d3 e) {
                this.f23440f = i;
                mo30398a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final int mo30380a() {
            return this.f23439e - this.f23440f;
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zztv.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zztv() {
    }

    /* renamed from: a */
    public static zztv m26537a(byte[] bArr) {
        return new C8380a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m26538b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m26539b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m26550b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m26561e(int i, long j) {
        return m26560e(i) + m26562e(j);
    }

    /* renamed from: e */
    public static int m26562e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: f */
    public static int m26564f(int i, int i2) {
        return m26560e(i) + m26563f(i2);
    }

    /* renamed from: g */
    public static int m26567g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m26568g(int i, int i2) {
        return m26560e(i) + m26567g(i2);
    }

    /* renamed from: g */
    public static int m26570g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m26572h(int i, int i2) {
        return m26560e(i) + m26567g(m26582l(i2));
    }

    /* renamed from: h */
    public static int m26574h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m26575i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m26576i(int i, int i2) {
        return m26560e(i) + 4;
    }

    /* renamed from: i */
    private static long m26577i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m26578j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m26579j(int i, int i2) {
        return m26560e(i) + 4;
    }

    /* renamed from: k */
    public static int m26581k(int i, int i2) {
        return m26560e(i) + m26563f(i2);
    }

    /* renamed from: l */
    private static int m26582l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: m */
    public static int m26583m(int i) {
        return m26567g(i);
    }

    /* renamed from: a */
    public abstract int mo30380a();

    /* renamed from: a */
    public abstract void mo30381a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo30384a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo30387a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo30388a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo30389a(int i, zzte zzte) throws IOException;

    /* renamed from: a */
    public abstract void mo30390a(int i, zzvv zzvv) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo30391a(int i, zzvv zzvv, C8273d2 d2Var) throws IOException;

    /* renamed from: a */
    public abstract void mo30392a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo30393a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo30394a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo30395a(zzte zzte) throws IOException;

    /* renamed from: a */
    public abstract void mo30396a(zzvv zzvv) throws IOException;

    /* renamed from: a */
    public abstract void mo30397a(String str) throws IOException;

    /* renamed from: b */
    public abstract void mo30400b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo30401b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo30402b(int i, long j) throws IOException {
        mo30388a(i, m26577i(j));
    }

    /* renamed from: b */
    public abstract void mo30403b(int i, zzte zzte) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo30405b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo30406c(int i) throws IOException {
        mo30400b(m26582l(i));
    }

    /* renamed from: c */
    public abstract void mo30407c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo30408c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo30409c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo30410d(int i) throws IOException;

    /* renamed from: d */
    public final void mo30411d(int i, int i2) throws IOException {
        mo30407c(i, m26582l(i2));
    }

    /* renamed from: e */
    public abstract void mo30412e(int i, int i2) throws IOException;

    /* renamed from: c */
    public static int m26553c(int i, zzte zzte) {
        int e = m26560e(i);
        int size = zzte.size();
        return e + m26567g(size) + size;
    }

    /* renamed from: d */
    public static int m26557d(int i, long j) {
        return m26560e(i) + m26562e(j);
    }

    /* renamed from: e */
    public static int m26560e(int i) {
        return m26567g(i << 3);
    }

    /* renamed from: f */
    public static int m26565f(int i, long j) {
        return m26560e(i) + m26562e(m26577i(j));
    }

    /* renamed from: g */
    public static int m26569g(int i, long j) {
        return m26560e(i) + 8;
    }

    /* renamed from: b */
    public final void mo30404b(long j) throws IOException {
        mo30394a(m26577i(j));
    }

    /* renamed from: b */
    public static int m26541b(int i, float f) {
        return m26560e(i) + 4;
    }

    /* renamed from: h */
    public static int m26573h(int i, long j) {
        return m26560e(i) + 8;
    }

    /* renamed from: k */
    public static int m26580k(int i) {
        return m26563f(i);
    }

    /* renamed from: a */
    public final void mo30386a(int i, float f) throws IOException {
        mo30412e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m26540b(int i, double d) {
        return m26560e(i) + 8;
    }

    /* renamed from: d */
    public static int m26558d(int i, zzte zzte) {
        return (m26560e(1) << 1) + m26568g(2, i) + m26553c(3, zzte);
    }

    /* renamed from: f */
    public static int m26563f(int i) {
        if (i >= 0) {
            return m26567g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m26571h(int i) {
        return m26567g(m26582l(i));
    }

    /* renamed from: a */
    public final void mo30385a(int i, double d) throws IOException {
        mo30408c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: b */
    public static int m26546b(int i, boolean z) {
        return m26560e(i) + 1;
    }

    /* renamed from: c */
    public static int m26554c(int i, zzvv zzvv) {
        return (m26560e(1) << 1) + m26568g(2, i) + m26543b(3, zzvv);
    }

    /* renamed from: f */
    public static int m26566f(long j) {
        return m26562e(m26577i(j));
    }

    /* renamed from: a */
    public final void mo30383a(float f) throws IOException {
        mo30410d(Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m26545b(int i, String str) {
        return m26560e(i) + m26549b(str);
    }

    /* renamed from: a */
    public final void mo30382a(double d) throws IOException {
        mo30409c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: b */
    public static int m26543b(int i, zzvv zzvv) {
        return m26560e(i) + m26548b(zzvv);
    }

    /* renamed from: d */
    public static int m26559d(long j) {
        return m26562e(j);
    }

    /* renamed from: a */
    public final void mo30399a(boolean z) throws IOException {
        mo30381a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static int m26534a(int i, zzvc zzvc) {
        int e = m26560e(i);
        int b = zzvc.mo30445b();
        return e + m26567g(b) + b;
    }

    /* renamed from: b */
    static int m26544b(int i, zzvv zzvv, C8273d2 d2Var) {
        return m26560e(i) + m26536a(zzvv, d2Var);
    }

    @Deprecated
    /* renamed from: c */
    static int m26555c(int i, zzvv zzvv, C8273d2 d2Var) {
        int e = m26560e(i) << 1;
        zzsx zzsx = (zzsx) zzvv;
        int a = zzsx.mo30367a();
        if (a == -1) {
            a = d2Var.mo30092c(zzsx);
            zzsx.mo30368a(a);
        }
        return e + a;
    }

    /* renamed from: b */
    public static int m26542b(int i, zzvc zzvc) {
        return (m26560e(1) << 1) + m26568g(2, i) + m26534a(3, zzvc);
    }

    /* renamed from: a */
    public static int m26535a(zzvc zzvc) {
        int b = zzvc.mo30445b();
        return m26567g(b) + b;
    }

    /* renamed from: b */
    public static int m26549b(String str) {
        int i;
        try {
            i = C8259a3.m25879a((CharSequence) str);
        } catch (C8274d3 unused) {
            i = str.getBytes(zzuq.f23509a).length;
        }
        return m26567g(i) + i;
    }

    /* renamed from: a */
    static int m26536a(zzvv zzvv, C8273d2 d2Var) {
        zzsx zzsx = (zzsx) zzvv;
        int a = zzsx.mo30367a();
        if (a == -1) {
            a = d2Var.mo30092c(zzsx);
            zzsx.mo30368a(a);
        }
        return m26567g(a) + a;
    }

    @Deprecated
    /* renamed from: c */
    public static int m26556c(zzvv zzvv) {
        return zzvv.mo30425b();
    }

    /* renamed from: b */
    public static int m26547b(zzte zzte) {
        int size = zzte.size();
        return m26567g(size) + size;
    }

    /* renamed from: b */
    public static int m26551b(byte[] bArr) {
        int length = bArr.length;
        return m26567g(length) + length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30398a(String str, C8274d3 d3Var) throws IOException {
        f23435b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", d3Var);
        byte[] bytes = str.getBytes(zzuq.f23509a);
        try {
            mo30400b(bytes.length);
            mo30374a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static int m26548b(zzvv zzvv) {
        int b = zzvv.mo30425b();
        return m26567g(b) + b;
    }
}
