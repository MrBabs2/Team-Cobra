package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class zzcza implements zzdti<ScheduledExecutorService> {

    /* renamed from: a */
    private final zzdtu<ThreadFactory> f21227a;

    public zzcza(zzdtu<ThreadFactory> zzdtu) {
        this.f21227a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f21227a.get());
        zzdto.m24236a(scheduledThreadPoolExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return scheduledThreadPoolExecutor;
    }
}
