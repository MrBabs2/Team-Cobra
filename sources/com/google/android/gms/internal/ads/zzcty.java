package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class zzcty implements zzdti<zzctw> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f20948a;

    /* renamed from: b */
    private final zzdtu<Context> f20949b;

    /* renamed from: c */
    private final zzdtu<Set<String>> f20950c;

    private zzcty(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2, zzdtu<Set<String>> zzdtu3) {
        this.f20948a = zzdtu;
        this.f20949b = zzdtu2;
        this.f20950c = zzdtu3;
    }

    /* renamed from: a */
    public static zzcty m22985a(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2, zzdtu<Set<String>> zzdtu3) {
        return new zzcty(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzctw(this.f20948a.get(), this.f20949b.get(), this.f20950c.get());
    }
}
