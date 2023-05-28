package com.google.android.gms.internal.ads;

public final class zzbuk implements zzdti<zzbtv> {

    /* renamed from: a */
    private final zzbtv f19499a;

    private zzbuk(zzbtv zzbtv) {
        this.f19499a = zzbtv;
    }

    /* renamed from: a */
    public static zzbuk m21921a(zzbtv zzbtv) {
        return new zzbuk(zzbtv);
    }

    public final /* synthetic */ Object get() {
        zzbtv zzbtv = this.f19499a;
        if (zzbtv != null) {
            zzdto.m24236a(zzbtv, "Cannot return null from a non-@Nullable @Provides method");
            return zzbtv;
        }
        throw null;
    }
}
