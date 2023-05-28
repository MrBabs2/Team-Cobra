package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbwj implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzdtu<Context> f19545a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f19546b;

    private zzbwj(zzbvz zzbvz, zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2) {
        this.f19545a = zzdtu;
        this.f19546b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbwj m21977a(zzbvz zzbvz, zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2) {
        return new zzbwj(zzbvz, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzavf zzavf = new zzavf(this.f19545a.get(), this.f19546b.get().f21169f);
        zzdto.m24236a(zzavf, "Cannot return null from a non-@Nullable @Provides method");
        return zzavf;
    }
}
