package com.google.android.gms.internal.ads;

public final class zzcyq implements zzdti<zzcym> {

    /* renamed from: a */
    private final zzdtu<zzcyk> f21217a;

    /* renamed from: b */
    private final zzdtu<String> f21218b;

    private zzcyq(zzcyo zzcyo, zzdtu<zzcyk> zzdtu, zzdtu<String> zzdtu2) {
        this.f21217a = zzdtu;
        this.f21218b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcyq m23124a(zzcyo zzcyo, zzdtu<zzcyk> zzdtu, zzdtu<String> zzdtu2) {
        return new zzcyq(zzcyo, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzcym a = this.f21217a.get().mo28839a(this.f21218b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
