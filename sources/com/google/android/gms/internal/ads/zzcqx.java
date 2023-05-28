package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzcqx implements zzdti<Set<String>> {

    /* renamed from: a */
    private final zzcqt f20825a;

    public zzcqx(zzcqt zzcqt) {
        this.f20825a = zzcqt;
    }

    public final /* synthetic */ Object get() {
        Set<String> a = this.f20825a.mo28777a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
