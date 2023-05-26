package com.google.android.gms.internal.ads;

public final class zzbzh implements zzdti<zzbyt> {

    /* renamed from: a */
    private final zzbzf f19767a;

    private zzbzh(zzbzf zzbzf) {
        this.f19767a = zzbzf;
    }

    /* renamed from: a */
    public static zzbzh m22195a(zzbzf zzbzf) {
        return new zzbzh(zzbzf);
    }

    /* renamed from: b */
    public static zzbyt m22196b(zzbzf zzbzf) {
        zzbyt a = zzbzf.mo28580a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m22196b(this.f19767a);
    }
}
