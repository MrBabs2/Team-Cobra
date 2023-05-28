package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

public final class zzcgz implements zzdti<zzbbh<zzcxu>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20177a;

    /* renamed from: b */
    private final zzdtu<zzchl> f20178b;

    /* renamed from: c */
    private final zzdtu<zzchq> f20179c;

    /* renamed from: d */
    private final zzdtu<zzbbh<zzarx>> f20180d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f20181e;

    private zzcgz(zzdtu<zzczt> zzdtu, zzdtu<zzchl> zzdtu2, zzdtu<zzchq> zzdtu3, zzdtu<zzbbh<zzarx>> zzdtu4, zzdtu<zzcxv> zzdtu5) {
        this.f20177a = zzdtu;
        this.f20178b = zzdtu2;
        this.f20179c = zzdtu3;
        this.f20180d = zzdtu4;
        this.f20181e = zzdtu5;
    }

    /* renamed from: a */
    public static zzcgz m22534a(zzdtu<zzczt> zzdtu, zzdtu<zzchl> zzdtu2, zzdtu<zzchq> zzdtu3, zzdtu<zzbbh<zzarx>> zzdtu4, zzdtu<zzcxv> zzdtu5) {
        return new zzcgz(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        zzcze<E, O2> zzcze;
        zzczt zzczt = this.f20177a.get();
        zzchl zzchl = this.f20178b.get();
        zzchq zzchq = this.f20179c.get();
        zzbbh zzbbh = this.f20180d.get();
        zzk.zzlm().mo29843a();
        if (this.f20181e.get().f21167d.f22999x != null) {
            zzcze = zzczt.mo28850a(zzczs.SERVER_TRANSACTION, zzbbh).mo28859a(zzchq.mo28695a()).mo28856a();
        } else {
            zzcze = zzczt.mo28850a(zzczs.SERVER_TRANSACTION, zzbbh).mo28858a(zzchl).mo28856a();
        }
        zzdto.m24236a(zzcze, "Cannot return null from a non-@Nullable @Provides method");
        return zzcze;
    }
}
