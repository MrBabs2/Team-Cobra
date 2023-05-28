package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcbc implements zzdti<zzcau> {

    /* renamed from: a */
    private final zzdtu<Context> f19882a;

    /* renamed from: b */
    private final zzdtu<zzcan> f19883b;

    /* renamed from: c */
    private final zzdtu<zzdh> f19884c;

    /* renamed from: d */
    private final zzdtu<zzbai> f19885d;

    /* renamed from: e */
    private final zzdtu<zza> f19886e;

    /* renamed from: f */
    private final zzdtu<zzwj> f19887f;

    /* renamed from: g */
    private final zzdtu<Executor> f19888g;

    /* renamed from: h */
    private final zzdtu<zzcxv> f19889h;

    /* renamed from: i */
    private final zzdtu<zzcbi> f19890i;

    /* renamed from: j */
    private final zzdtu<ScheduledExecutorService> f19891j;

    public zzcbc(zzdtu<Context> zzdtu, zzdtu<zzcan> zzdtu2, zzdtu<zzdh> zzdtu3, zzdtu<zzbai> zzdtu4, zzdtu<zza> zzdtu5, zzdtu<zzwj> zzdtu6, zzdtu<Executor> zzdtu7, zzdtu<zzcxv> zzdtu8, zzdtu<zzcbi> zzdtu9, zzdtu<ScheduledExecutorService> zzdtu10) {
        this.f19882a = zzdtu;
        this.f19883b = zzdtu2;
        this.f19884c = zzdtu3;
        this.f19885d = zzdtu4;
        this.f19886e = zzdtu5;
        this.f19887f = zzdtu6;
        this.f19888g = zzdtu7;
        this.f19889h = zzdtu8;
        this.f19890i = zzdtu9;
        this.f19891j = zzdtu10;
    }

    public final /* synthetic */ Object get() {
        return new zzcau(this.f19882a.get(), this.f19883b.get(), this.f19884c.get(), this.f19885d.get(), this.f19886e.get(), this.f19887f.get(), this.f19888g.get(), this.f19889h.get(), this.f19890i.get(), this.f19891j.get());
    }
}
