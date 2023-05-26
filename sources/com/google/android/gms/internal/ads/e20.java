package com.google.android.gms.internal.ads;

final class e20 {

    /* renamed from: a */
    public final int f15045a;

    /* renamed from: b */
    public int f15046b;

    /* renamed from: c */
    public int f15047c;

    /* renamed from: d */
    public long f15048d;

    /* renamed from: e */
    private final boolean f15049e;

    /* renamed from: f */
    private final zzst f15050f;

    /* renamed from: g */
    private final zzst f15051g;

    /* renamed from: h */
    private int f15052h;

    /* renamed from: i */
    private int f15053i;

    public e20(zzst zzst, zzst zzst2, boolean z) {
        this.f15051g = zzst;
        this.f15050f = zzst2;
        this.f15049e = z;
        zzst2.mo29727b(12);
        this.f15045a = zzst2.mo29740l();
        zzst.mo29727b(12);
        this.f15053i = zzst.mo29740l();
        zzsk.m25219b(zzst.mo29730d() != 1 ? false : true, "first_chunk must be 1");
        this.f15046b = -1;
    }

    /* renamed from: a */
    public final boolean mo25854a() {
        long j;
        int i = this.f15046b + 1;
        this.f15046b = i;
        if (i == this.f15045a) {
            return false;
        }
        if (this.f15049e) {
            j = this.f15050f.mo29741m();
        } else {
            j = this.f15050f.mo29738j();
        }
        this.f15048d = j;
        if (this.f15046b == this.f15052h) {
            this.f15047c = this.f15051g.mo29740l();
            this.f15051g.mo29729c(4);
            int i2 = this.f15053i - 1;
            this.f15053i = i2;
            this.f15052h = i2 > 0 ? this.f15051g.mo29740l() - 1 : -1;
        }
        return true;
    }
}
