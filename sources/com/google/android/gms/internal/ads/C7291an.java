package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.an */
final class C7291an implements zzban<zzbnf> {

    /* renamed from: a */
    private final /* synthetic */ zzboc f14491a;

    /* renamed from: b */
    private final /* synthetic */ zzcpt f14492b;

    C7291an(zzcpt zzcpt, zzboc zzboc) {
        this.f14492b = zzcpt;
        this.f14491a = zzboc;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        synchronized (this.f14492b) {
            zzbbh unused = this.f14492b.f20775p = null;
            this.f14491a.mo25826a().onAdFailedToLoad(zzcgm.m22526a(th));
            this.f14492b.f20771l.mo28421b(60);
            zzcya.m23109a(th, "BannerAdManagerShim.onFailure");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzbnf zzbnf = (zzbnf) obj;
        synchronized (this.f14492b) {
            zzbbh unused = this.f14492b.f20775p = null;
            if (this.f14492b.f20774o != null) {
                this.f14492b.f20774o.mo28384a();
            }
            zzbnf unused2 = this.f14492b.f20774o = zzbnf;
            this.f14492b.f20767h.removeAllViews();
            this.f14492b.f20767h.addView(zzbnf.mo26814g());
            zzbnf.mo26812c();
            this.f14492b.f20771l.mo28421b(zzbnf.mo26816i());
        }
    }
}
