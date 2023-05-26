package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbwe implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzbvz f19540a;

    /* renamed from: b */
    private final zzdtu<zzbxc> f19541b;

    private zzbwe(zzbvz zzbvz, zzdtu<zzbxc> zzdtu) {
        this.f19540a = zzbvz;
        this.f19541b = zzdtu;
    }

    /* renamed from: a */
    public static zzbwe m21973a(zzbvz zzbvz, zzdtu<zzbxc> zzdtu) {
        return new zzbwe(zzbvz, zzdtu);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrl>> a = this.f19540a.mo26551a(this.f19541b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
