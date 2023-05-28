package com.google.android.gms.internal.ads;

public final class zzbrd implements zzdti<String> {

    /* renamed from: a */
    private final zzdtu<zzbqe> f19443a;

    private zzbrd(zzbqy zzbqy, zzdtu<zzbqe> zzdtu) {
        this.f19443a = zzdtu;
    }

    /* renamed from: a */
    public static zzbrd m21827a(zzbqy zzbqy, zzdtu<zzbqe> zzdtu) {
        return new zzbrd(zzbqy, zzdtu);
    }

    public final /* synthetic */ Object get() {
        String a = this.f19443a.get().mo28395a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
