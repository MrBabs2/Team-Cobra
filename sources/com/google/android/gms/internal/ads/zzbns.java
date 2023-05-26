package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbns implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzbnk f19255a;

    /* renamed from: b */
    private final zzdtu<Context> f19256b;

    /* renamed from: c */
    private final zzdtu<zzbai> f19257c;

    /* renamed from: d */
    private final zzdtu<zzcxm> f19258d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f19259e;

    public zzbns(zzbnk zzbnk, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzcxv> zzdtu4) {
        this.f19255a = zzbnk;
        this.f19256b = zzdtu;
        this.f19257c = zzdtu2;
        this.f19258d = zzdtu3;
        this.f19259e = zzdtu4;
    }

    /* renamed from: a */
    public static zzbuz<zzbsr> m21412a(zzbnk zzbnk, Context context, zzbai zzbai, zzcxm zzcxm, zzcxv zzcxv) {
        zzbuz<zzbsr> zzbuz = new zzbuz<>(new C7281ad(context, zzbai, zzcxm, zzcxv), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }

    public final /* synthetic */ Object get() {
        return m21412a(this.f19255a, this.f19256b.get(), this.f19257c.get(), this.f19258d.get(), this.f19259e.get());
    }
}
