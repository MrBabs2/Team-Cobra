package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzchh implements zzdti<String> {

    /* renamed from: a */
    private final zzdtu<Context> f20200a;

    private zzchh(zzdtu<Context> zzdtu) {
        this.f20200a = zzdtu;
    }

    /* renamed from: a */
    public static zzchh m22544a(zzdtu<Context> zzdtu) {
        return new zzchh(zzdtu);
    }

    public final /* synthetic */ Object get() {
        String packageName = this.f20200a.get().getPackageName();
        zzdto.m24236a(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
