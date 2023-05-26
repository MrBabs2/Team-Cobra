package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbqs implements zzdti<zzbqr> {

    /* renamed from: a */
    private final zzdtu<Context> f19421a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f19422b;

    /* renamed from: c */
    private final zzdtu<zzbai> f19423c;

    /* renamed from: d */
    private final zzdtu<zzaxb> f19424d;

    /* renamed from: e */
    private final zzdtu<zzcgb> f19425e;

    private zzbqs(zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<zzaxb> zzdtu4, zzdtu<zzcgb> zzdtu5) {
        this.f19421a = zzdtu;
        this.f19422b = zzdtu2;
        this.f19423c = zzdtu3;
        this.f19424d = zzdtu4;
        this.f19425e = zzdtu5;
    }

    /* renamed from: a */
    public static zzbqs m21807a(zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<zzaxb> zzdtu4, zzdtu<zzcgb> zzdtu5) {
        return new zzbqs(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        return new zzbqr(this.f19421a.get(), this.f19422b.get(), this.f19423c.get(), this.f19424d.get(), this.f19425e.get());
    }
}
