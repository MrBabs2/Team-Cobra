package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbuc implements zzdti<Set<zzbuz<zzxr>>> {

    /* renamed from: a */
    private final zzbtv f19491a;

    private zzbuc(zzbtv zzbtv) {
        this.f19491a = zzbtv;
    }

    /* renamed from: a */
    public static zzbuc m21913a(zzbtv zzbtv) {
        return new zzbuc(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzxr>> g = this.f19491a.mo28437g();
        zzdto.m24236a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
