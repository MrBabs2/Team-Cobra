package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcha implements zzdti<zzbbh<Bundle>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20187a;

    /* renamed from: b */
    private final zzdtu<zzcvb<Bundle>> f20188b;

    private zzcha(zzdtu<zzczt> zzdtu, zzdtu<zzcvb<Bundle>> zzdtu2) {
        this.f20187a = zzdtu;
        this.f20188b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcha m22537a(zzdtu<zzczt> zzdtu, zzdtu<zzcvb<Bundle>> zzdtu2) {
        return new zzcha(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzcze a = this.f20187a.get().mo28849a(zzczs.SIGNALS).mo28853a(this.f20188b.get().mo28800a(new Bundle())).mo28856a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
