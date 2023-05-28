package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hn */
final class C7549hn implements zzban<zzcdb> {

    /* renamed from: a */
    private final /* synthetic */ zzcdf f15535a;

    /* renamed from: b */
    private final /* synthetic */ zzcqj f15536b;

    C7549hn(zzcqj zzcqj, zzcdf zzcdf) {
        this.f15536b = zzcqj;
        this.f15535a = zzcdf;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        synchronized (this.f15536b) {
            zzbbh unused = this.f15536b.f20808f = null;
            this.f15535a.mo26173a().onAdFailedToLoad(zzcgm.m22526a(th));
            zzcya.m23109a(th, "NonagonRewardedVideoAdImpl.onFailure");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzcdb zzcdb = (zzcdb) obj;
        synchronized (this.f15536b) {
            zzbbh unused = this.f15536b.f20808f = null;
            zzcdb unused2 = this.f15536b.f20809g = zzcdb;
            zzcdb.mo26812c();
        }
    }
}
