package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbug implements zzdti<Set<zzbuz<zzbrl>>> {

    /* renamed from: a */
    private final zzbtv f19495a;

    private zzbug(zzbtv zzbtv) {
        this.f19495a = zzbtv;
    }

    /* renamed from: a */
    public static zzbug m21916a(zzbtv zzbtv) {
        return new zzbug(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrl>> a = this.f19495a.mo28431a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
