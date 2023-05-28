package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzcpj implements zzdti<zzcpf> {

    /* renamed from: a */
    private final zzdtu<zzclc> f20732a;

    /* renamed from: b */
    private final zzdtu<Executor> f20733b;

    /* renamed from: c */
    private final zzdtu<Context> f20734c;

    public zzcpj(zzdtu<zzclc> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<Context> zzdtu3) {
        this.f20732a = zzdtu;
        this.f20733b = zzdtu2;
        this.f20734c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcpf(this.f20732a.get(), this.f20733b.get(), this.f20734c.get());
    }
}
