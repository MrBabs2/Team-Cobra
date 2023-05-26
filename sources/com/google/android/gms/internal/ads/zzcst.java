package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcst implements zzdti<zzcsp> {

    /* renamed from: a */
    private final zzdtu<Context> f20913a;

    /* renamed from: b */
    private final zzdtu<zzbbl> f20914b;

    private zzcst(zzdtu<Context> zzdtu, zzdtu<zzbbl> zzdtu2) {
        this.f20913a = zzdtu;
        this.f20914b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcst m22958a(zzdtu<Context> zzdtu, zzdtu<zzbbl> zzdtu2) {
        return new zzcst(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcsp(this.f20913a.get(), this.f20914b.get());
    }
}
