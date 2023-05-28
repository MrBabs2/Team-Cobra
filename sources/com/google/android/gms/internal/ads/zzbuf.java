package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbuf implements zzdti<Set<zzbuz<zzbrw>>> {

    /* renamed from: a */
    private final zzbtv f19494a;

    private zzbuf(zzbtv zzbtv) {
        this.f19494a = zzbtv;
    }

    /* renamed from: a */
    public static zzbuf m21915a(zzbtv zzbtv) {
        return new zzbuf(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrw>> h = this.f19494a.mo28438h();
        zzdto.m24236a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
