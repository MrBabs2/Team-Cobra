package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcef implements zzdti<zzwj> {

    /* renamed from: a */
    private final zzdtu<Context> f20054a;

    /* renamed from: b */
    private final zzdtu<String> f20055b;

    /* renamed from: c */
    private final zzdtu<zzbai> f20056c;

    /* renamed from: d */
    private final zzdtu<Integer> f20057d;

    /* renamed from: e */
    private final zzdtu<String> f20058e;

    private zzcef(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<Integer> zzdtu4, zzdtu<String> zzdtu5) {
        this.f20054a = zzdtu;
        this.f20055b = zzdtu2;
        this.f20056c = zzdtu3;
        this.f20057d = zzdtu4;
        this.f20058e = zzdtu5;
    }

    /* renamed from: a */
    public static zzcef m22434a(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<Integer> zzdtu4, zzdtu<String> zzdtu5) {
        return new zzcef(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        String str = this.f20055b.get();
        zzbai zzbai = this.f20056c.get();
        int intValue = this.f20057d.get().intValue();
        String str2 = this.f20058e.get();
        zzwj zzwj = new zzwj(new zzwo(this.f20054a.get()));
        zzxo zzxo = new zzxo();
        zzxo.f22972c = Integer.valueOf(zzbai.f18743g);
        zzxo.f22973d = Integer.valueOf(zzbai.f18744h);
        zzxo.f22974e = Integer.valueOf(zzbai.f18745i ? 0 : 2);
        zzwj.mo29858a((zzwk) new C7471fi(intValue, str, zzxo, str2));
        zzdto.m24236a(zzwj, "Cannot return null from a non-@Nullable @Provides method");
        return zzwj;
    }
}
