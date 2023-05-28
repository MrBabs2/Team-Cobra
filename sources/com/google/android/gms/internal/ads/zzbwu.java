package com.google.android.gms.internal.ads;

public final class zzbwu implements zzdti<zzbbh<zzbvx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f19557a;

    /* renamed from: b */
    private final zzdtu<zzbbh<zzcxu>> f19558b;

    /* renamed from: c */
    private final zzdtu<zzblq> f19559c;

    /* renamed from: d */
    private final zzdtu<zzcmx<zzbvx>> f19560d;

    public zzbwu(zzdtu<zzczt> zzdtu, zzdtu<zzbbh<zzcxu>> zzdtu2, zzdtu<zzblq> zzdtu3, zzdtu<zzcmx<zzbvx>> zzdtu4) {
        this.f19557a = zzdtu;
        this.f19558b = zzdtu2;
        this.f19559c = zzdtu3;
        this.f19560d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzbbh a = zzbqq.m21804a(this.f19557a.get(), this.f19558b.get(), this.f19559c.get(), this.f19560d.get());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
