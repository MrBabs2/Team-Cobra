package com.google.android.gms.internal.ads;

public final class zzbmu implements zzdti<zzaly> {

    /* renamed from: a */
    private final zzdtu<zzalr> f19208a;

    private zzbmu(zzdtu<zzalr> zzdtu) {
        this.f19208a = zzdtu;
    }

    /* renamed from: a */
    public static zzbmu m21376a(zzdtu<zzalr> zzdtu) {
        return new zzbmu(zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzaly a = this.f19208a.get().mo27374a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
