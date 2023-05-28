package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcfd implements zzdti<zzbuz<zzbtk>> {

    /* renamed from: a */
    private final zzdtu<zzcfb> f20098a;

    /* renamed from: b */
    private final zzdtu<Executor> f20099b;

    private zzcfd(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20098a = zzdtu;
        this.f20099b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfd m22462a(zzdtu<zzcfb> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfd(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f20098a.get(), this.f20099b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
