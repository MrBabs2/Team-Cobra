package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbun implements zzdti<zzcmu> {

    /* renamed from: a */
    private final zzbtv f19500a;

    /* renamed from: b */
    private final zzdtu<Clock> f19501b;

    private zzbun(zzbtv zzbtv, zzdtu<Clock> zzdtu) {
        this.f19500a = zzbtv;
        this.f19501b = zzdtu;
    }

    /* renamed from: a */
    public static zzbun m21924a(zzbtv zzbtv, zzdtu<Clock> zzdtu) {
        return new zzbun(zzbtv, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzcmu a = this.f19500a.mo28430a(this.f19501b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
