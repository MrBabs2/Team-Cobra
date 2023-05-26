package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcyv implements zzdti<Executor> {

    /* renamed from: a */
    private static final zzcyv f21222a = new zzcyv();

    /* renamed from: a */
    public static zzcyv m23128a() {
        return f21222a;
    }

    public final /* synthetic */ Object get() {
        Executor executor = zzbbm.f18748a;
        zzdto.m24236a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
