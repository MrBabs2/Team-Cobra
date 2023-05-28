package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

public final class zzbyi implements zzdti<zzbva> {

    /* renamed from: a */
    private final zzdtu<Context> f19668a;

    /* renamed from: b */
    private final zzdtu<zzcxm> f19669b;

    public zzbyi(zzdtu<Context> zzdtu, zzdtu<zzcxm> zzdtu2) {
        this.f19668a = zzdtu;
        this.f19669b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzbva zzbva = new zzbva(this.f19668a.get(), new HashSet(), this.f19669b.get());
        zzdto.m24236a(zzbva, "Cannot return null from a non-@Nullable @Provides method");
        return zzbva;
    }
}
