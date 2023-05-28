package com.google.android.gms.internal.ads;

final class i20 implements f20 {

    /* renamed from: a */
    private final zzst f15562a;

    /* renamed from: b */
    private final int f15563b = this.f15562a.mo29740l();

    /* renamed from: c */
    private final int f15564c = (this.f15562a.mo29740l() & 255);

    /* renamed from: d */
    private int f15565d;

    /* renamed from: e */
    private int f15566e;

    public i20(c20 c20) {
        zzst zzst = c20.f14694z0;
        this.f15562a = zzst;
        zzst.mo29727b(12);
    }

    /* renamed from: a */
    public final boolean mo25906a() {
        return false;
    }

    /* renamed from: b */
    public final int mo25907b() {
        return this.f15563b;
    }

    /* renamed from: c */
    public final int mo25908c() {
        int i = this.f15564c;
        if (i == 8) {
            return this.f15562a.mo29735g();
        }
        if (i == 16) {
            return this.f15562a.mo29736h();
        }
        int i2 = this.f15565d;
        this.f15565d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f15566e & 15;
        }
        int g = this.f15562a.mo29735g();
        this.f15566e = g;
        return (g & 240) >> 4;
    }
}
