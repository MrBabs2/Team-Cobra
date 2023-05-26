package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

public final class zzcwz implements zzdti<ApplicationInfo> {

    /* renamed from: a */
    private final zzcwx f21092a;

    public zzcwz(zzcwx zzcwx) {
        this.f21092a = zzcwx;
    }

    /* renamed from: a */
    public static ApplicationInfo m23052a(zzcwx zzcwx) {
        ApplicationInfo f = zzcwx.mo28810f();
        zzdto.m24236a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public final /* synthetic */ Object get() {
        return m23052a(this.f21092a);
    }
}
