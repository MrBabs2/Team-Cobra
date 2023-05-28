package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcid implements zzdti<C7660kj> {

    /* renamed from: a */
    private final zzdtu<Context> f20231a;

    /* renamed from: b */
    private final zzdtu<zzavg> f20232b;

    private zzcid(zzdtu<Context> zzdtu, zzdtu<zzavg> zzdtu2) {
        this.f20231a = zzdtu;
        this.f20232b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcid m22566a(zzdtu<Context> zzdtu, zzdtu<zzavg> zzdtu2) {
        return new zzcid(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new C7660kj(this.f20231a.get(), this.f20232b.get());
    }
}
