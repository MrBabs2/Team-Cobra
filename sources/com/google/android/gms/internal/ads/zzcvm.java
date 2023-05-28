package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcvm implements zzdti<zzcvk> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f21029a;

    /* renamed from: b */
    private final zzdtu<Context> f21030b;

    private zzcvm(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2) {
        this.f21029a = zzdtu;
        this.f21030b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcvm m23021a(zzdtu<zzbbl> zzdtu, zzdtu<Context> zzdtu2) {
        return new zzcvm(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcvk(this.f21029a.get(), this.f21030b.get());
    }
}
