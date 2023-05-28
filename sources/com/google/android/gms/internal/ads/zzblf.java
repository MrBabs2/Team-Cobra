package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzblf implements zzdti<zzayu> {

    /* renamed from: a */
    private final zzdtu<Context> f19129a;

    public zzblf(zzdtu<Context> zzdtu) {
        this.f19129a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        zzayu zzayu = new zzayu(this.f19129a.get());
        zzdto.m24236a(zzayu, "Cannot return null from a non-@Nullable @Provides method");
        return zzayu;
    }
}
