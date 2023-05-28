package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqy;

public final class zzbrf implements zzdti<zzbqy.zza> {

    /* renamed from: a */
    private final zzbqy f19445a;

    private zzbrf(zzbqy zzbqy) {
        this.f19445a = zzbqy;
    }

    /* renamed from: a */
    public static zzbrf m21830a(zzbqy zzbqy) {
        return new zzbrf(zzbqy);
    }

    public final /* synthetic */ Object get() {
        zzbqy.zza a = this.f19445a.mo28398a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
