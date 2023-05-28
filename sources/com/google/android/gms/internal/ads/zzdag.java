package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdag implements zzdti<zzdae> {

    /* renamed from: a */
    private final zzdtu<Executor> f21295a;

    /* renamed from: b */
    private final zzdtu<zzbah> f21296b;

    /* renamed from: c */
    private final zzdtu<zzcmu> f21297c;

    /* renamed from: d */
    private final zzdtu<zzbai> f21298d;

    /* renamed from: e */
    private final zzdtu<String> f21299e;

    /* renamed from: f */
    private final zzdtu<String> f21300f;

    /* renamed from: g */
    private final zzdtu<Context> f21301g;

    /* renamed from: h */
    private final zzdtu<Clock> f21302h;

    private zzdag(zzdtu<Executor> zzdtu, zzdtu<zzbah> zzdtu2, zzdtu<zzcmu> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<String> zzdtu5, zzdtu<String> zzdtu6, zzdtu<Context> zzdtu7, zzdtu<Clock> zzdtu8) {
        this.f21295a = zzdtu;
        this.f21296b = zzdtu2;
        this.f21297c = zzdtu3;
        this.f21298d = zzdtu4;
        this.f21299e = zzdtu5;
        this.f21300f = zzdtu6;
        this.f21301g = zzdtu7;
        this.f21302h = zzdtu8;
    }

    /* renamed from: a */
    public static zzdag m23191a(zzdtu<Executor> zzdtu, zzdtu<zzbah> zzdtu2, zzdtu<zzcmu> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<String> zzdtu5, zzdtu<String> zzdtu6, zzdtu<Context> zzdtu7, zzdtu<Clock> zzdtu8) {
        return new zzdag(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6, zzdtu7, zzdtu8);
    }

    public final /* synthetic */ Object get() {
        return new zzdae(this.f21295a.get(), this.f21296b.get(), this.f21297c.get(), this.f21298d.get(), this.f21299e.get(), this.f21300f.get(), this.f21301g.get(), this.f21302h.get());
    }
}
