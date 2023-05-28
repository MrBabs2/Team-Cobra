package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ci */
final /* synthetic */ class C7360ci implements zzbij {

    /* renamed from: a */
    private final zzbbr f14758a;

    C7360ci(zzbbr zzbbr) {
        this.f14758a = zzbbr;
    }

    public final void zzae(boolean z) {
        zzbbr zzbbr = this.f14758a;
        if (z) {
            zzbbr.mo27904b(null);
        } else {
            zzbbr.mo27903a(new Exception("Ad Web View failed to load."));
        }
    }
}
