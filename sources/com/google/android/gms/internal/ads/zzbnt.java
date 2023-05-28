package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbnt implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbnk f19260a;

    /* renamed from: b */
    private final zzdtu<zzbov> f19261b;

    public zzbnt(zzbnk zzbnk, zzdtu<zzbov> zzdtu) {
        this.f19260a = zzbnk;
        this.f19261b = zzdtu;
    }

    /* renamed from: a */
    public static Set<zzbuz<zzbsr>> m21413a(zzbnk zzbnk, zzbov zzbov) {
        Set<zzbuz<zzbsr>> singleton = Collections.singleton(new zzbuz(zzbov, zzbbm.f18749b));
        zzdto.m24236a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    public final /* synthetic */ Object get() {
        return m21413a(this.f19260a, this.f19261b.get());
    }
}
