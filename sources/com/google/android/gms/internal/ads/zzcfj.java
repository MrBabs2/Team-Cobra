package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcfj implements zzdti<zzcfi> {

    /* renamed from: a */
    private final zzdtu<Context> f20108a;

    /* renamed from: b */
    private final zzdtu<String> f20109b;

    private zzcfj(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2) {
        this.f20108a = zzdtu;
        this.f20109b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfj m22470a(zzdtu<Context> zzdtu, zzdtu<String> zzdtu2) {
        return new zzcfj(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcfi(this.f20108a.get(), this.f20109b.get());
    }
}
