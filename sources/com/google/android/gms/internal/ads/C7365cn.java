package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cn */
final class C7365cn implements zzban<zzbvx> {

    /* renamed from: a */
    private final /* synthetic */ zzbws f14764a;

    /* renamed from: b */
    private final /* synthetic */ zzcqd f14765b;

    C7365cn(zzcqd zzcqd, zzbws zzbws) {
        this.f14765b = zzcqd;
        this.f14764a = zzbws;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        synchronized (this.f14765b) {
            zzbbh unused = this.f14765b.f20795o = null;
            this.f14764a.mo26024a().onAdFailedToLoad(zzcgm.m22526a(th));
            zzcya.m23109a(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzbvx zzbvx = (zzbvx) obj;
        synchronized (this.f14765b) {
            zzbbh unused = this.f14765b.f20795o = null;
            zzbvx unused2 = this.f14765b.f20794n = zzbvx;
            zzbvx.mo26812c();
        }
    }
}
