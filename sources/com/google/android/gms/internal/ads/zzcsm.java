package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzcsm implements zzdti<zzcsk<zzcsg>> {

    /* renamed from: a */
    private final zzdtu<zzcsh> f20906a;

    /* renamed from: b */
    private final zzdtu<Clock> f20907b;

    public zzcsm(zzdtu<zzcsh> zzdtu, zzdtu<Clock> zzdtu2) {
        this.f20906a = zzdtu;
        this.f20907b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzcsk zzcsk = new zzcsk(this.f20906a.get(), 10000, this.f20907b.get());
        zzdto.m24236a(zzcsk, "Cannot return null from a non-@Nullable @Provides method");
        return zzcsk;
    }
}
