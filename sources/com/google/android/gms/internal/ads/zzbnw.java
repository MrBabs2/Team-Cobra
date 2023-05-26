package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbnw implements zzdti<Set<zzbuz<zzue>>> {

    /* renamed from: a */
    private final zzdtu<zzbov> f19265a;

    public zzbnw(zzbnk zzbnk, zzdtu<zzbov> zzdtu) {
        this.f19265a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new zzbuz(this.f19265a.get(), zzbbm.f18749b));
        zzdto.m24236a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
