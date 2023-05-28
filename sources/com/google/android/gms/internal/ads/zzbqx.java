package com.google.android.gms.internal.ads;

public final class zzbqx implements zzdti<zzbtb> {

    /* renamed from: a */
    private final zzdtu<zzbtb> f19430a;

    private zzbqx(zzdtu<zzbtb> zzdtu) {
        this.f19430a = zzdtu;
    }

    /* renamed from: a */
    public static zzbqx m21809a(zzdtu<zzbtb> zzdtu) {
        return new zzbqx(zzdtu);
    }

    public final /* synthetic */ Object get() {
        zzbtb zzbtb = this.f19430a.get();
        zzdto.m24236a(zzbtb, "Cannot return null from a non-@Nullable @Provides method");
        return zzbtb;
    }
}
