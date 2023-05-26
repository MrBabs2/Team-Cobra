package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm */
final class C8218zm implements zzban<zzbpc> {

    /* renamed from: a */
    private final /* synthetic */ zzbxo f17654a;

    /* renamed from: b */
    private final /* synthetic */ zzcpp f17655b;

    C8218zm(zzcpp zzcpp, zzbxo zzbxo) {
        this.f17655b = zzcpp;
        this.f17654a = zzbxo;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        this.f17654a.mo26809c().onAdFailedToLoad(zzcgm.m22526a(th));
        zzcya.m23109a(th, "AdLoaderShim.onFailure");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzbpc zzbpc = (zzbpc) obj;
        synchronized (this.f17655b) {
            String unused = this.f17655b.f20763m = zzbpc.mo28385b();
            String unused2 = this.f17655b.f20764n = zzbpc.mo28387e();
            zzbpc.mo26812c();
        }
    }
}
