package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

public final class zzcgy implements zzdti<zzbbh<zzarx>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20167a;

    /* renamed from: b */
    private final zzdtu<zzbbh<Bundle>> f20168b;

    /* renamed from: c */
    private final zzdtu<zzbai> f20169c;

    /* renamed from: d */
    private final zzdtu<ApplicationInfo> f20170d;

    /* renamed from: e */
    private final zzdtu<String> f20171e;

    /* renamed from: f */
    private final zzdtu<List<String>> f20172f;

    /* renamed from: g */
    private final zzdtu<PackageInfo> f20173g;

    /* renamed from: h */
    private final zzdtu<zzbbh<String>> f20174h;

    /* renamed from: i */
    private final zzdtu<zzaxb> f20175i;

    /* renamed from: j */
    private final zzdtu<String> f20176j;

    private zzcgy(zzdtu<zzczt> zzdtu, zzdtu<zzbbh<Bundle>> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<ApplicationInfo> zzdtu4, zzdtu<String> zzdtu5, zzdtu<List<String>> zzdtu6, zzdtu<PackageInfo> zzdtu7, zzdtu<zzbbh<String>> zzdtu8, zzdtu<zzaxb> zzdtu9, zzdtu<String> zzdtu10) {
        this.f20167a = zzdtu;
        this.f20168b = zzdtu2;
        this.f20169c = zzdtu3;
        this.f20170d = zzdtu4;
        this.f20171e = zzdtu5;
        this.f20172f = zzdtu6;
        this.f20173g = zzdtu7;
        this.f20174h = zzdtu8;
        this.f20175i = zzdtu9;
        this.f20176j = zzdtu10;
    }

    /* renamed from: a */
    public static zzcgy m22533a(zzdtu<zzczt> zzdtu, zzdtu<zzbbh<Bundle>> zzdtu2, zzdtu<zzbai> zzdtu3, zzdtu<ApplicationInfo> zzdtu4, zzdtu<String> zzdtu5, zzdtu<List<String>> zzdtu6, zzdtu<PackageInfo> zzdtu7, zzdtu<zzbbh<String>> zzdtu8, zzdtu<zzaxb> zzdtu9, zzdtu<String> zzdtu10) {
        return new zzcgy(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5, zzdtu6, zzdtu7, zzdtu8, zzdtu9, zzdtu10);
    }

    public final /* synthetic */ Object get() {
        zzbbh zzbbh = this.f20168b.get();
        zzbbh zzbbh2 = this.f20174h.get();
        zzcze a = this.f20167a.get().mo28848a(zzczs.REQUEST_PARCEL, (zzbbh<?>[]) new zzbbh[]{zzbbh, zzbbh2}).mo28852a(new C8214zi(zzbbh, this.f20169c.get(), this.f20170d.get(), this.f20171e.get(), this.f20172f.get(), this.f20173g.get(), zzbbh2, this.f20175i.get(), this.f20176j.get())).mo28856a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
