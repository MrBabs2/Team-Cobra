package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class zzche implements zzdti<ApplicationInfo> {

    /* renamed from: a */
    private final zzdtu<Context> f20196a;

    private zzche(zzdtu<Context> zzdtu) {
        this.f20196a = zzdtu;
    }

    /* renamed from: a */
    public static zzche m22541a(zzdtu<Context> zzdtu) {
        return new zzche(zzdtu);
    }

    public final /* synthetic */ Object get() {
        ApplicationInfo applicationInfo = this.f20196a.get().getApplicationInfo();
        zzdto.m24236a(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }
}
