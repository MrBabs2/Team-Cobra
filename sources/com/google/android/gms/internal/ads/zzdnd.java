package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzdnd {

    /* renamed from: a */
    int f21491a;

    /* renamed from: b */
    int f21492b;

    /* renamed from: c */
    C7893qu f21493c;

    private zzdnd() {
        this.f21492b = 100;
    }

    /* renamed from: a */
    public static long m23781a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static zzdnd m23782a(byte[] bArr, int i, int i2, boolean z) {
        C7856pu puVar = new C7856pu(bArr, i, i2, z);
        try {
            puVar.mo26417c(i2);
            return puVar;
        } catch (zzdok e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m23783e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract double mo26413a() throws IOException;

    /* renamed from: a */
    public abstract void mo26414a(int i) throws zzdok;

    /* renamed from: b */
    public abstract float mo26415b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo26416b(int i) throws IOException;

    /* renamed from: c */
    public abstract int mo26417c(int i) throws zzdok;

    /* renamed from: c */
    public abstract String mo26418c() throws IOException;

    /* renamed from: d */
    public abstract int mo26419d() throws IOException;

    /* renamed from: d */
    public abstract void mo26420d(int i);

    /* renamed from: e */
    public abstract long mo26421e() throws IOException;

    /* renamed from: f */
    public abstract long mo26422f() throws IOException;

    /* renamed from: g */
    public abstract int mo26423g() throws IOException;

    /* renamed from: h */
    public abstract long mo26424h() throws IOException;

    /* renamed from: i */
    public abstract int mo26425i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo26426j() throws IOException;

    /* renamed from: k */
    public abstract String mo26427k() throws IOException;

    /* renamed from: l */
    public abstract zzdmr mo26428l() throws IOException;

    /* renamed from: m */
    public abstract int mo26429m() throws IOException;

    /* renamed from: n */
    public abstract int mo26430n() throws IOException;

    /* renamed from: o */
    public abstract int mo26431o() throws IOException;

    /* renamed from: p */
    public abstract long mo26432p() throws IOException;

    /* renamed from: q */
    public abstract int mo26433q() throws IOException;

    /* renamed from: r */
    public abstract long mo26434r() throws IOException;

    /* renamed from: s */
    public abstract boolean mo26435s() throws IOException;

    /* renamed from: t */
    public abstract int mo26436t();
}
