package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcuj implements zzdti<zzcuh> {

    /* renamed from: a */
    private final zzdtu<Context> f20965a;

    /* renamed from: b */
    private final zzdtu<String> f20966b;

    private zzcuj(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2) {
        this.f20965a = zzdtu;
        this.f20966b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcuj m22996a(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2) {
        return new zzcuj(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcuh(this.f20965a.get(), this.f20966b.get());
    }
}
