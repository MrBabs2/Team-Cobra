package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbnn implements zzdti<zzbso> {

    /* renamed from: a */
    private final zzbnk f19248a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzbsr>>> f19249b;

    public zzbnn(zzbnk zzbnk, zzdtu<Set<zzbuz<zzbsr>>> zzdtu) {
        this.f19248a = zzbnk;
        this.f19249b = zzdtu;
    }

    /* renamed from: a */
    public static zzbso m21407a(zzbnk zzbnk, Set<zzbuz<zzbsr>> set) {
        zzbso a = zzbnk.mo26322a(set);
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m21407a(this.f19248a, this.f19249b.get());
    }
}
