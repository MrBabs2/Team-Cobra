package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbqw implements zzdti<zzbam<zzcxm, zzayb>> {

    /* renamed from: a */
    private final zzdtu<Context> f19427a;

    /* renamed from: b */
    private final zzdtu<zzbai> f19428b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f19429c;

    public zzbqw(zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxv> zzdtu3) {
        this.f19427a = zzdtu;
        this.f19428b = zzdtu2;
        this.f19429c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        C7765nd ndVar = new C7765nd(this.f19427a.get(), this.f19428b.get(), this.f19429c.get());
        zzdto.m24236a(ndVar, "Cannot return null from a non-@Nullable @Provides method");
        return ndVar;
    }
}
