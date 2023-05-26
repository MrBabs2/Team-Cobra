package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzcso implements zzdti<zzcxk> {

    /* renamed from: a */
    private final zzdtu<Clock> f20910a;

    public zzcso(zzdtu<Clock> zzdtu) {
        this.f20910a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        zzcxk zzcxk = new zzcxk(this.f20910a.get());
        zzdto.m24236a(zzcxk, "Cannot return null from a non-@Nullable @Provides method");
        return zzcxk;
    }
}
