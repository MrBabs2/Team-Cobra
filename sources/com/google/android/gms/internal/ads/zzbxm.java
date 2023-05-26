package com.google.android.gms.internal.ads;

public final class zzbxm implements zzdti<zzbxk> {

    /* renamed from: a */
    private final zzbxk f19604a;

    private zzbxm(zzbxk zzbxk) {
        this.f19604a = zzbxk;
    }

    /* renamed from: a */
    public static zzbxm m22006a(zzbxk zzbxk) {
        return new zzbxm(zzbxk);
    }

    public final /* synthetic */ Object get() {
        zzbxk zzbxk = this.f19604a;
        if (zzbxk != null) {
            zzdto.m24236a(zzbxk, "Cannot return null from a non-@Nullable @Provides method");
            return zzbxk;
        }
        throw null;
    }
}
