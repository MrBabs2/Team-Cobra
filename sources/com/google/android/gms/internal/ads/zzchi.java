package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzchi implements zzdti<zzchv> {

    /* renamed from: a */
    private final zzdtu<Context> f20201a;

    private zzchi(zzdtu<Context> zzdtu) {
        this.f20201a = zzdtu;
    }

    /* renamed from: a */
    public static zzchi m22545a(zzdtu<Context> zzdtu) {
        return new zzchi(zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzchv zzchv = new zzchv(this.f20201a.get());
        zzdto.m24236a(zzchv, "Cannot return null from a non-@Nullable @Provides method");
        return zzchv;
    }
}
