package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.km */
final class C7663km implements zzbsn {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f16012a;

    /* renamed from: b */
    private final /* synthetic */ zzcjy f16013b;

    C7663km(zzcoe zzcoe, zzbbr zzbbr, zzcjy zzcjy) {
        this.f16012a = zzbbr;
        this.f16013b = zzcjy;
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17788D2)).booleanValue()) {
            i = 3;
        }
        zzbbr zzbbr = this.f16012a;
        String str = this.f16013b.f20302a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("adapter ");
        sb.append(str);
        sb.append(" failed to load");
        zzbbr.mo27903a(new zzcmw(sb.toString(), i));
    }

    public final synchronized void onAdLoaded() {
        this.f16012a.mo27904b(null);
    }
}
