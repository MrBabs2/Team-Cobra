package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dn */
final class C7402dn implements zzban<zzcdb> {

    /* renamed from: a */
    private final /* synthetic */ zzcdf f15019a;

    /* renamed from: b */
    private final /* synthetic */ zzcqf f15020b;

    C7402dn(zzcqf zzcqf, zzcdf zzcdf) {
        this.f15020b = zzcqf;
        this.f15019a = zzcdf;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        synchronized (this.f15020b) {
            zzbbh unused = this.f15020b.f20797f = null;
            this.f15019a.mo26173a().onAdFailedToLoad(zzcgm.m22526a(th));
            zzcya.m23109a(th, "NonagonRewardedAdImpl.onFailure");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzcdb zzcdb = (zzcdb) obj;
        synchronized (this.f15020b) {
            zzbbh unused = this.f15020b.f20797f = null;
            zzcdb unused2 = this.f15020b.f20798g = zzcdb;
            zzcdb.mo26812c();
        }
    }
}
