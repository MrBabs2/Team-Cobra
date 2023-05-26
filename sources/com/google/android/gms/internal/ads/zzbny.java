package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbny implements zzdti<zzbuz<zzue>> {

    /* renamed from: a */
    private final zzdtu<zzboz> f19268a;

    /* renamed from: b */
    private final zzdtu<Executor> f19269b;

    public zzbny(zzbnk zzbnk, zzdtu<zzboz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19268a = zzdtu;
        this.f19269b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19268a.get(), this.f19269b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
