package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzard
public final class zzaxg {

    /* renamed from: a */
    public static final zzbbl f18648a = zzbbm.m20558a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m20261a("Default")));

    /* renamed from: b */
    public static final zzbbl f18649b;

    /* renamed from: c */
    public static final ScheduledExecutorService f18650c = new ScheduledThreadPoolExecutor(3, m20261a("Schedule"));

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m20261a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f18649b = zzbbm.m20558a(threadPoolExecutor);
    }

    /* renamed from: a */
    public static <T> zzbbh<T> m20260a(Callable<T> callable) {
        return f18648a.mo27892a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m20261a(String str) {
        return new C7384d5(str);
    }

    /* renamed from: a */
    public static zzbbh<?> m20259a(Runnable runnable) {
        return f18648a.mo27891a(runnable);
    }
}
