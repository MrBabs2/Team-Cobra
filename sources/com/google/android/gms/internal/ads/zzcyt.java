package com.google.android.gms.internal.ads;

public final class zzcyt implements zzdti<zzawu> {

    /* renamed from: a */
    private final zzdtu<zzcym> f21221a;

    private zzcyt(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        this.f21221a = zzdtu;
    }

    /* renamed from: a */
    public static zzcyt m23127a(zzcyo zzcyo, zzdtu<zzcym> zzdtu) {
        return new zzcyt(zzcyo, zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzawu zzawu = this.f21221a.get().f21211c;
        zzdto.m24236a(zzawu, "Cannot return null from a non-@Nullable @Provides method");
        return zzawu;
    }
}
