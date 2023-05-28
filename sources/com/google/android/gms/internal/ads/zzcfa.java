package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcfa implements zzdti<zzcex> {

    /* renamed from: a */
    private final zzdtu<zzwj> f20091a;

    /* renamed from: b */
    private final zzdtu<Map<zzczs, zzcez>> f20092b;

    private zzcfa(zzdtu<zzwj> zzdtu, zzdtu<Map<zzczs, zzcez>> zzdtu2) {
        this.f20091a = zzdtu;
        this.f20092b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfa m22457a(zzdtu<zzwj> zzdtu, zzdtu<Map<zzczs, zzcez>> zzdtu2) {
        return new zzcfa(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcex(this.f20091a.get(), this.f20092b.get());
    }
}
