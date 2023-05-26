package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbqf implements zzdti<zzbqe> {

    /* renamed from: a */
    private final zzdtu<Clock> f19401a;

    /* renamed from: b */
    private final zzdtu<zzawj> f19402b;

    private zzbqf(zzdtu<Clock> zzdtu, zzdtu<zzawj> zzdtu2) {
        this.f19401a = zzdtu;
        this.f19402b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqf m21790a(zzdtu<Clock> zzdtu, zzdtu<zzawj> zzdtu2) {
        return new zzbqf(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzbqe(this.f19401a.get(), this.f19402b.get());
    }
}
