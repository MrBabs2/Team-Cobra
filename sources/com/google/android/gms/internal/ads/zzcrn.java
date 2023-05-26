package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcrn implements zzdti<zzcrk> {

    /* renamed from: a */
    private final zzdtu<zzbbh<String>> f20851a;

    /* renamed from: b */
    private final zzdtu<Executor> f20852b;

    private zzcrn(zzdtu<zzbbh<String>> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20851a = zzdtu;
        this.f20852b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcrn m22937a(zzdtu<zzbbh<String>> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcrn(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcrk(this.f20851a.get(), this.f20852b.get());
    }
}
