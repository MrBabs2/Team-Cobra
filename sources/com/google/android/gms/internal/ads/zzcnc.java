package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzcnc implements zzdti<zzcna> {

    /* renamed from: a */
    private final zzdtu<Context> f20642a;

    /* renamed from: b */
    private final zzdtu<Executor> f20643b;

    /* renamed from: c */
    private final zzdtu<zzcdf> f20644c;

    public zzcnc(zzdtu<Context> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<zzcdf> zzdtu3) {
        this.f20642a = zzdtu;
        this.f20643b = zzdtu2;
        this.f20644c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcna(this.f20642a.get(), this.f20643b.get(), this.f20644c.get());
    }
}
