package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

public final class zzbqp implements zzdti<zzbuz<zzo>> {

    /* renamed from: a */
    private final zzdtu<zzbpv> f19415a;

    private zzbqp(zzbqo zzbqo, zzdtu<zzbpv> zzdtu) {
        this.f19415a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqp m21803a(zzbqo zzbqo, zzdtu<zzbpv> zzdtu) {
        return new zzbqp(zzbqo, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19415a.get(), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
