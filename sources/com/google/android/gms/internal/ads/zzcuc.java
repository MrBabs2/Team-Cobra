package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class zzcuc implements zzdti<zzcub> {

    /* renamed from: a */
    private final zzdtu<ApplicationInfo> f20956a;

    /* renamed from: b */
    private final zzdtu<PackageInfo> f20957b;

    private zzcuc(zzdtu<ApplicationInfo> zzdtu, zzdtu<PackageInfo> zzdtu2) {
        this.f20956a = zzdtu;
        this.f20957b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcuc m22989a(zzdtu<ApplicationInfo> zzdtu, zzdtu<PackageInfo> zzdtu2) {
        return new zzcuc(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcub(this.f20956a.get(), this.f20957b.get());
    }
}
