package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbzg implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzdtu<Context> f19765a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f19766b;

    private zzbzg(zzbzf zzbzf, zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2) {
        this.f19765a = zzdtu;
        this.f19766b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbzg m22194a(zzbzf zzbzf, zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2) {
        return new zzbzg(zzbzf, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzavf zzavf = new zzavf(this.f19765a.get(), this.f19766b.get().f21169f);
        zzdto.m24236a(zzavf, "Cannot return null from a non-@Nullable @Provides method");
        return zzavf;
    }
}
