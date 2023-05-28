package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcbu implements zzdti<zzcbp> {

    /* renamed from: a */
    private final zzdtu<Executor> f19907a;

    /* renamed from: b */
    private final zzdtu<zzbmy> f19908b;

    /* renamed from: c */
    private final zzdtu<zzbva> f19909c;

    public zzcbu(zzdtu<Executor> zzdtu, zzdtu<zzbmy> zzdtu2, zzdtu<zzbva> zzdtu3) {
        this.f19907a = zzdtu;
        this.f19908b = zzdtu2;
        this.f19909c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcbp(this.f19907a.get(), this.f19908b.get(), this.f19909c.get());
    }
}
