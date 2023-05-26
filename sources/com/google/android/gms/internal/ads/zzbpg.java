package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbpg<AdT> implements zzdti<zzbpf<AdT>> {

    /* renamed from: a */
    private final zzdtu<Map<String, zzcjv<AdT>>> f19373a;

    private zzbpg(zzdtu<Map<String, zzcjv<AdT>>> zzdtu) {
        this.f19373a = zzdtu;
    }

    /* renamed from: a */
    public static <AdT> zzbpg<AdT> m21758a(zzdtu<Map<String, zzcjv<AdT>>> zzdtu) {
        return new zzbpg<>(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzbpf(this.f19373a.get());
    }
}
