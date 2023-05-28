package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbuy implements zzdti<zzbuv> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzbuu>>> f19503a;

    private zzbuy(zzdtu<Set<zzbuz<zzbuu>>> zzdtu) {
        this.f19503a = zzdtu;
    }

    /* renamed from: a */
    public static zzbuy m21934a(zzdtu<Set<zzbuz<zzbuu>>> zzdtu) {
        return new zzbuy(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzbuv(this.f19503a.get());
    }
}
