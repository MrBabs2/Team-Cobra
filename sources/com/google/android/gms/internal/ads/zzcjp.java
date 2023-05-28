package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class zzcjp implements zzdti<zzcjm> {

    /* renamed from: a */
    private final zzdtu<Context> f20290a;

    /* renamed from: b */
    private final zzdtu<zzbbh<Bundle>> f20291b;

    /* renamed from: c */
    private final zzdtu<zzcji> f20292c;

    /* renamed from: d */
    private final zzdtu<zzcjc> f20293d;

    private zzcjp(zzdtu<Context> zzdtu, zzdtu<zzbbh<Bundle>> zzdtu2, zzdtu<zzcji> zzdtu3, zzdtu<zzcjc> zzdtu4) {
        this.f20290a = zzdtu;
        this.f20291b = zzdtu2;
        this.f20292c = zzdtu3;
        this.f20293d = zzdtu4;
    }

    /* renamed from: a */
    public static zzcjp m22612a(zzdtu<Context> zzdtu, zzdtu<zzbbh<Bundle>> zzdtu2, zzdtu<zzcji> zzdtu3, zzdtu<zzcjc> zzdtu4) {
        return new zzcjp(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        return new zzcjm(this.f20290a.get(), this.f20291b.get(), this.f20292c.get(), this.f20293d.get());
    }
}
