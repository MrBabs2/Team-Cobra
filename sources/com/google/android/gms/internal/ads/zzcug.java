package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcug implements zzdti<zzcue> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f20961a;

    /* renamed from: b */
    private final zzdtu<Bundle> f20962b;

    private zzcug(zzdtu<zzbbl> zzdtu, zzdtu<Bundle> zzdtu2) {
        this.f20961a = zzdtu;
        this.f20962b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcug m22993a(zzdtu<zzbbl> zzdtu, zzdtu<Bundle> zzdtu2) {
        return new zzcug(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcue(this.f20961a.get(), this.f20962b.get());
    }
}
