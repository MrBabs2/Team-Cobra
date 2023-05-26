package com.google.android.gms.internal.ads;

public final class zzcoy implements zzdti<zzcow> {

    /* renamed from: a */
    private final zzcow f20723a;

    private zzcoy(zzcow zzcow) {
        this.f20723a = zzcow;
    }

    /* renamed from: a */
    public static zzcoy m22759a(zzcow zzcow) {
        return new zzcoy(zzcow);
    }

    public final /* synthetic */ Object get() {
        zzcow zzcow = this.f20723a;
        if (zzcow != null) {
            zzdto.m24236a(zzcow, "Cannot return null from a non-@Nullable @Provides method");
            return zzcow;
        }
        throw null;
    }
}
