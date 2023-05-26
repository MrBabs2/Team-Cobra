package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbuh implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbtv f19496a;

    private zzbuh(zzbtv zzbtv) {
        this.f19496a = zzbtv;
    }

    /* renamed from: a */
    public static zzbuh m21917a(zzbtv zzbtv) {
        return new zzbuh(zzbtv);
    }

    /* renamed from: b */
    public static Set<zzbuz<zzbsr>> m21918b(zzbtv zzbtv) {
        Set<zzbuz<zzbsr>> b = zzbtv.mo28432b();
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public final /* synthetic */ Object get() {
        return m21918b(this.f19496a);
    }
}
