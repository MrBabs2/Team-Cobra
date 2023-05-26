package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzccf implements zzdti<zzccd> {

    /* renamed from: a */
    private final zzdtu<Context> f19943a;

    /* renamed from: b */
    private final zzdtu<zzbyt> f19944b;

    /* renamed from: c */
    private final zzdtu<zzbzl> f19945c;

    /* renamed from: d */
    private final zzdtu<zzbyn> f19946d;

    private zzccf(zzdtu<Context> zzdtu, zzdtu<zzbyt> zzdtu2, zzdtu<zzbzl> zzdtu3, zzdtu<zzbyn> zzdtu4) {
        this.f19943a = zzdtu;
        this.f19944b = zzdtu2;
        this.f19945c = zzdtu3;
        this.f19946d = zzdtu4;
    }

    /* renamed from: a */
    public static zzccf m22352a(zzdtu<Context> zzdtu, zzdtu<zzbyt> zzdtu2, zzdtu<zzbzl> zzdtu3, zzdtu<zzbyn> zzdtu4) {
        return new zzccf(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        return new zzccd(this.f19943a.get(), this.f19944b.get(), this.f19945c.get(), this.f19946d.get());
    }
}
