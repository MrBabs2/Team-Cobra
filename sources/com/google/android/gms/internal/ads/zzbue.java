package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbue implements zzdti<Set<zzbuz<zzbrs>>> {

    /* renamed from: a */
    private final zzbtv f19493a;

    public zzbue(zzbtv zzbtv) {
        this.f19493a = zzbtv;
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbrs>> d = this.f19493a.mo28434d();
        zzdto.m24236a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
