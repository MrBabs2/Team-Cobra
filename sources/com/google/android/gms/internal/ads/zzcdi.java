package com.google.android.gms.internal.ads;

public final class zzcdi implements zzdti<zzbbh<zzcdb>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20000a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f20001b;

    /* renamed from: c */
    private final zzdtu<zzblq> f20002c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzcdb>> f20003d;

    public zzcdi(zzdtu<zzczt> zzdtu, zzdtu<zzbbh<zzcxu>> zzdtu2, zzdtu<zzblq> zzdtu3, zzdtu<zzcmx<zzcdb>> zzdtu4) {
        this.f20000a = zzdtu;
        this.f20001b = zzdtu2;
        this.f20002c = zzdtu3;
        this.f20003d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzbbh a = zzbqq.m21804a(this.f20000a.get(), this.f20001b.get(), this.f20002c.get(), this.f20003d.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
