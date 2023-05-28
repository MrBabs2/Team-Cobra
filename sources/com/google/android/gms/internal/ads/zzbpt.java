package com.google.android.gms.internal.ads;

public final class zzbpt implements zzdti<String> {

    /* renamed from: a */
    private final zzbpr f19386a;

    private zzbpt(zzbpr zzbpr) {
        this.f19386a = zzbpr;
    }

    /* renamed from: a */
    public static zzbpt m21773a(zzbpr zzbpr) {
        return new zzbpt(zzbpr);
    }

    /* renamed from: b */
    public static String m21774b(zzbpr zzbpr) {
        String c = zzbpr.mo28393c();
        zzdto.m24236a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public final /* synthetic */ Object get() {
        return m21774b(this.f19386a);
    }
}
