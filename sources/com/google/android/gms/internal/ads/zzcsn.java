package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzcsn implements zzdti<zzcsk<zzcvf>> {

    /* renamed from: a */
    private final zzdtu<C7367cp> f20908a;

    /* renamed from: b */
    private final zzdtu<Clock> f20909b;

    public zzcsn(zzdtu<C7367cp> zzdtu, zzdtu<Clock> zzdtu2) {
        this.f20908a = zzdtu;
        this.f20909b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzcsk zzcsk = new zzcsk(this.f20908a.get(), ((Long) zzyt.m25670e().mo27163a(zzacu.f17874Z0)).longValue(), this.f20909b.get());
        zzdto.m24236a(zzcsk, "Cannot return null from a non-@Nullable @Provides method");
        return zzcsk;
    }
}
