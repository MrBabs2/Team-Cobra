package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdad implements zzdti<zzalr> {

    /* renamed from: a */
    private final zzdtu<Context> f21285a;

    /* renamed from: b */
    private final zzdtu<zzbai> f21286b;

    public zzdad(zzdac zzdac, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2) {
        this.f21285a = zzdtu;
        this.f21286b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzalr b = new zzalk().mo27372b(this.f21285a.get(), this.f21286b.get());
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
