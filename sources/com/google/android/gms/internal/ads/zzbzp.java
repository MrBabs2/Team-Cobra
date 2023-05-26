package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzbzp implements zzdti<zzbzl> {

    /* renamed from: a */
    private final zzdtu<Context> f19793a;

    /* renamed from: b */
    private final zzdtu<zzaxb> f19794b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f19795c;

    /* renamed from: d */
    private final zzdtu<zzbyx> f19796d;

    /* renamed from: e */
    private final zzdtu<zzbyt> f19797e;

    /* renamed from: f */
    private final zzdtu<zzbzt> f19798f;

    /* renamed from: g */
    private final zzdtu<Executor> f19799g;

    /* renamed from: h */
    private final zzdtu<Executor> f19800h;

    private zzbzp(zzdtu<Context> zzdtu, zzdtu<zzaxb> zzdtu2, zzdtu<zzcxv> zzdtu3, zzdtu<zzbyx> zzdtu4, zzdtu<zzbyt> zzdtu5, zzdtu<zzbzt> zzdtu6, zzdtu<Executor> zzdtu7, zzdtu<Executor> zzdtu8) {
        this.f19793a = zzdtu;
        this.f19794b = zzdtu2;
        this.f19795c = zzdtu3;
        this.f19796d = zzdtu4;
        this.f19797e = zzdtu5;
        this.f19798f = zzdtu6;
        this.f19799g = zzdtu7;
        this.f19800h = zzdtu8;
    }

    /* renamed from: a */
    public static zzbzp m22233a(zzdtu<Context> zzdtu, zzdtu<zzaxb> zzdtu2, zzdtu<zzcxv> zzdtu3, zzdtu<zzbyx> zzdtu4, zzdtu<zzbyt> zzdtu5, zzdtu<zzbzt> zzdtu6, zzdtu<Executor> zzdtu7, zzdtu<Executor> zzdtu8) {
        return new zzbzp(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6, zzdtu7, zzdtu8);
    }

    public final /* synthetic */ Object get() {
        return new zzbzl(this.f19793a.get(), this.f19794b.get(), this.f19795c.get(), this.f19796d.get(), this.f19797e.get(), this.f19798f.get(), this.f19799g.get(), this.f19800h.get());
    }
}
