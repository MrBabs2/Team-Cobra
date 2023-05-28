package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbjr implements zzdti<Context> {

    /* renamed from: a */
    private final zzbjn f19061a;

    public zzbjr(zzbjn zzbjn) {
        this.f19061a = zzbjn;
    }

    public final /* synthetic */ Object get() {
        Context b = this.f19061a.mo28235b();
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
