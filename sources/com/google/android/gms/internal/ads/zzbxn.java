package com.google.android.gms.internal.ads;

public final class zzbxn implements zzdti<zzbzc> {

    /* renamed from: a */
    private final zzbxk f19605a;

    private zzbxn(zzbxk zzbxk) {
        this.f19605a = zzbxk;
    }

    /* renamed from: a */
    public static zzbxn m22007a(zzbxk zzbxk) {
        return new zzbxn(zzbxk);
    }

    /* renamed from: b */
    public static zzbzc m22008b(zzbxk zzbxk) {
        zzbzc a = zzbxk.mo28470a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m22008b(this.f19605a);
    }
}
