package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcry implements zzdti<zzcrv> {

    /* renamed from: a */
    private final zzdtu<Executor> f20872a;

    /* renamed from: b */
    private final zzdtu<zzawm> f20873b;

    private zzcry(zzdtu<Executor> zzdtu, zzdtu<zzawm> zzdtu2) {
        this.f20872a = zzdtu;
        this.f20873b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcry m22944a(zzdtu<Executor> zzdtu, zzdtu<zzawm> zzdtu2) {
        return new zzcry(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcrv(this.f20872a.get(), this.f20873b.get());
    }
}
