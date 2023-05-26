package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

public final class zzccv implements zzdti<zzccj> {

    /* renamed from: a */
    private final zzdtu<Context> f19974a;

    /* renamed from: b */
    private final zzdtu<Executor> f19975b;

    /* renamed from: c */
    private final zzdtu<zzdh> f19976c;

    /* renamed from: d */
    private final zzdtu<zzbai> f19977d;

    /* renamed from: e */
    private final zzdtu<zza> f19978e;

    /* renamed from: f */
    private final zzdtu<zzbhf> f19979f;

    public zzccv(zzdtu<Context> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<zzdh> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<zza> zzdtu5, zzdtu<zzbhf> zzdtu6) {
        this.f19974a = zzdtu;
        this.f19975b = zzdtu2;
        this.f19976c = zzdtu3;
        this.f19977d = zzdtu4;
        this.f19978e = zzdtu5;
        this.f19979f = zzdtu6;
    }

    public final /* synthetic */ Object get() {
        return new zzccj(this.f19974a.get(), this.f19975b.get(), this.f19976c.get(), this.f19977d.get(), this.f19978e.get(), this.f19979f.get());
    }
}
