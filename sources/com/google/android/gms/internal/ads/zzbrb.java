package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbrb implements zzdti<Context> {

    /* renamed from: a */
    private final zzbqy f19440a;

    /* renamed from: b */
    private final zzdtu<Context> f19441b;

    private zzbrb(zzbqy zzbqy, zzdtu<Context> zzdtu) {
        this.f19440a = zzbqy;
        this.f19441b = zzdtu;
    }

    /* renamed from: a */
    public static zzbrb m21825a(zzbqy zzbqy, zzdtu<Context> zzdtu) {
        return new zzbrb(zzbqy, zzdtu);
    }

    public final /* synthetic */ Object get() {
        Context a = this.f19440a.mo28397a(this.f19441b.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
