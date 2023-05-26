package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbjq implements zzdti<Context> {

    /* renamed from: a */
    private final zzbjn f19060a;

    public zzbjq(zzbjn zzbjn) {
        this.f19060a = zzbjn;
    }

    /* renamed from: a */
    public static Context m21230a(zzbjn zzbjn) {
        Context a = zzbjn.mo28234a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m21230a(this.f19060a);
    }
}
