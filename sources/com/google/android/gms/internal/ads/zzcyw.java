package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;

public final class zzcyw implements zzdti<zzbbl> {

    /* renamed from: a */
    private static final zzcyw f21223a = new zzcyw();

    /* renamed from: a */
    public static zzcyw m23129a() {
        return f21223a;
    }

    public final /* synthetic */ Object get() {
        zzbbl a = zzbbm.m20558a(Executors.newSingleThreadExecutor());
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
