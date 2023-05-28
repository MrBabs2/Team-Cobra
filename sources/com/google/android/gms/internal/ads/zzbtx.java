package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbtx implements zzdti<zzbrm> {

    /* renamed from: a */
    private final zzbtv f19488a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzbro>>> f19489b;

    private zzbtx(zzbtv zzbtv, zzdtu<Set<zzbuz<zzbro>>> zzdtu) {
        this.f19488a = zzbtv;
        this.f19489b = zzdtu;
    }

    /* renamed from: a */
    public static zzbtx m21907a(zzbtv zzbtv, zzdtu<Set<zzbuz<zzbro>>> zzdtu) {
        return new zzbtx(zzbtv, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbrm a = this.f19488a.mo28429a(this.f19489b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
