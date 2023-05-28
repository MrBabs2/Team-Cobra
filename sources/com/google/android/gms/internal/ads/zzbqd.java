package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbqd implements zzdti<zzawj> {

    /* renamed from: a */
    private final zzdtu<Clock> f19396a;

    /* renamed from: b */
    private final zzdtu<zzawu> f19397b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f19398c;

    private zzbqd(zzdtu<Clock> zzdtu, zzdtu<zzawu> zzdtu2, zzdtu<zzcxv> zzdtu3) {
        this.f19396a = zzdtu;
        this.f19397b = zzdtu2;
        this.f19398c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbqd m21784a(zzdtu<Clock> zzdtu, zzdtu<zzawu> zzdtu2, zzdtu<zzcxv> zzdtu3) {
        return new zzbqd(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        zzawj a = this.f19397b.get().mo27755a(this.f19396a.get(), this.f19398c.get().f21169f);
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
