package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzcit implements zzdti<zzcig> {

    /* renamed from: a */
    private final zzdtu<Context> f20242a;

    /* renamed from: b */
    private final zzdtu<Executor> f20243b;

    /* renamed from: c */
    private final zzdtu<zzasm> f20244c;

    /* renamed from: d */
    private final zzdtu<zzblp> f20245d;

    /* renamed from: e */
    private final zzdtu<zzasl> f20246e;

    private zzcit(zzdtu<Context> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<zzasm> zzdtu3, zzdtu<zzblp> zzdtu4, zzdtu<zzasl> zzdtu5) {
        this.f20242a = zzdtu;
        this.f20243b = zzdtu2;
        this.f20244c = zzdtu3;
        this.f20245d = zzdtu4;
        this.f20246e = zzdtu5;
    }

    /* renamed from: a */
    public static zzcit m22574a(zzdtu<Context> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<zzasm> zzdtu3, zzdtu<zzblp> zzdtu4, zzdtu<zzasl> zzdtu5) {
        return new zzcit(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        return new zzcig(this.f20242a.get(), this.f20243b.get(), this.f20244c.get(), this.f20245d.get(), this.f20246e.get());
    }
}
