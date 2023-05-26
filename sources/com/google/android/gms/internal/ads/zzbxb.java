package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbxb implements zzdti<zzbxa> {

    /* renamed from: a */
    private final zzdtu<Context> f19574a;

    /* renamed from: b */
    private final zzdtu<zzbgz> f19575b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f19576c;

    /* renamed from: d */
    private final zzdtu<zzbai> f19577d;

    /* renamed from: e */
    private final zzdtu<Integer> f19578e;

    private zzbxb(zzdtu<Context> zzdtu, zzdtu<zzbgz> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<Integer> zzdtu5) {
        this.f19574a = zzdtu;
        this.f19575b = zzdtu2;
        this.f19576c = zzdtu3;
        this.f19577d = zzdtu4;
        this.f19578e = zzdtu5;
    }

    /* renamed from: a */
    public static zzbxb m21995a(zzdtu<Context> zzdtu, zzdtu<zzbgz> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<Integer> zzdtu5) {
        return new zzbxb(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        return new zzbxa(this.f19574a.get(), this.f19575b.get(), this.f19576c.get(), this.f19577d.get(), this.f19578e.get().intValue());
    }
}
