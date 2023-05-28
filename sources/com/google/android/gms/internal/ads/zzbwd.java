package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbwd implements zzdti<zzbuz<zzbsr>> {

    /* renamed from: a */
    private final zzdtu<Context> f19536a;

    /* renamed from: b */
    private final zzdtu<zzbai> f19537b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f19538c;

    /* renamed from: d */
    private final zzdtu<zzcxv> f19539d;

    private zzbwd(zzbvz zzbvz, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzcxv> zzdtu4) {
        this.f19536a = zzdtu;
        this.f19537b = zzdtu2;
        this.f19538c = zzdtu3;
        this.f19539d = zzdtu4;
    }

    /* renamed from: a */
    public static zzbwd m21972a(zzbvz zzbvz, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzcxv> zzdtu4) {
        return new zzbwd(zzbvz, zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(new C7656kf(this.f19536a.get(), this.f19537b.get(), this.f19538c.get(), this.f19539d.get()), zzbbm.f18749b);
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
