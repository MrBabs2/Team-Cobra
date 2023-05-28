package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcyr implements zzdti<Context> {

    /* renamed from: a */
    private final zzdtu<zzcym> f21219a;

    private zzcyr(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        this.f21219a = zzdtu;
    }

    /* renamed from: a */
    public static zzcyr m23125a(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        return new zzcyr(zzcyo, zzdtu);
    }

    public final /* synthetic */ Object get() {
        Context context = this.f21219a.get().f21209a;
        zzdto.m24236a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
