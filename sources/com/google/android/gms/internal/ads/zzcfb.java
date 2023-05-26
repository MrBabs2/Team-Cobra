package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzcfb implements zzbro, zzbsr, zzbtk {

    /* renamed from: f */
    private final zzcfi f20093f;

    /* renamed from: g */
    private final String f20094g = ((String) zzyt.m25670e().mo27163a(zzacu.f17829O));

    /* renamed from: h */
    private final zzdae f20095h;

    public zzcfb(zzcfi zzcfi, zzdae zzdae) {
        this.f20093f = zzcfi;
        this.f20095h = zzdae;
    }

    /* renamed from: a */
    private final void m22458a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f20094g).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        String uri = buildUpon.build().toString();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17825N)).booleanValue()) {
            this.f20095h.mo28873a(uri);
        }
        zzawz.m20167e(uri);
    }

    public final void onAdFailedToLoad(int i) {
        m22458a(this.f20093f.mo28673a());
    }

    public final void onAdLoaded() {
        m22458a(this.f20093f.mo28673a());
    }

    /* renamed from: a */
    public final void mo26178a(zzarx zzarx) {
        this.f20093f.mo28674a(zzarx.f18438f);
    }

    /* renamed from: a */
    public final void mo26179a(zzcxu zzcxu) {
        this.f20093f.mo28675a(zzcxu);
    }
}
