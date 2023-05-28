package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcix implements zzdti<zzbuz<zzbro>> {

    /* renamed from: a */
    private final zzdtu<zzcjg> f20257a;

    /* renamed from: b */
    private final zzdtu<Executor> f20258b;

    private zzcix(zzdtu<zzcjg> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20257a = zzdtu;
        this.f20258b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcix m22578a(zzdtu<zzcjg> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcix(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20257a.get(), this.f20258b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
