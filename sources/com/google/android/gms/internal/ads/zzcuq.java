package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcuq implements zzdti<zzcul> {

    /* renamed from: a */
    private final zzdtu<zzbbl> f20974a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f20975b;

    /* renamed from: c */
    private final zzdtu<String> f20976c;

    /* renamed from: d */
    private final zzdtu<zzcpf> f20977d;

    /* renamed from: e */
    private final zzdtu<Context> f20978e;

    /* renamed from: f */
    private final zzdtu<zzcxv> f20979f;

    private zzcuq(zzdtu<zzbbl> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<String> zzdtu3, zzdtu<zzcpf> zzdtu4, zzdtu<Context> zzdtu5, zzdtu<zzcxv> zzdtu6) {
        this.f20974a = zzdtu;
        this.f20975b = zzdtu2;
        this.f20976c = zzdtu3;
        this.f20977d = zzdtu4;
        this.f20978e = zzdtu5;
        this.f20979f = zzdtu6;
    }

    /* renamed from: a */
    public static zzcuq m23003a(zzdtu<zzbbl> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<String> zzdtu3, zzdtu<zzcpf> zzdtu4, zzdtu<Context> zzdtu5, zzdtu<zzcxv> zzdtu6) {
        return new zzcuq(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6);
    }

    public final /* synthetic */ Object get() {
        return new zzcul(this.f20974a.get(), this.f20975b.get(), this.f20976c.get(), this.f20977d.get(), this.f20978e.get(), this.f20979f.get());
    }
}
