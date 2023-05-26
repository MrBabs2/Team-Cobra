package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class zzchg implements zzdti<PackageInfo> {

    /* renamed from: a */
    private final zzdtu<Context> f20198a;

    /* renamed from: b */
    private final zzdtu<ApplicationInfo> f20199b;

    private zzchg(zzdtu<Context> zzdtu, zzdtu<ApplicationInfo> zzdtu2) {
        this.f20198a = zzdtu;
        this.f20199b = zzdtu2;
    }

    /* renamed from: a */
    public static zzchg m22543a(zzdtu<Context> zzdtu, zzdtu<ApplicationInfo> zzdtu2) {
        return new zzchg(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return zzcgt.m22532a(this.f20198a.get(), this.f20199b.get());
    }
}
