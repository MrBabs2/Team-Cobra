package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
public final class zzbar {
    /* renamed from: a */
    public static <V> void m20546a(zzbbh<V> zzbbh, zzban<? super V> zzban, Executor executor) {
        zzbbh.mo25573b(new C7795o6(zzban, zzbbh), executor);
    }

    /* renamed from: b */
    public static <V> zzbbc<V> m20551b(Iterable<? extends zzbbh<? extends V>> iterable) {
        return new zzbbc<>(iterable);
    }

    /* renamed from: a */
    public static <A, B> zzbbh<B> m20543a(zzbbh<A> zzbbh, zzbam<A, B> zzbam, Executor executor) {
        zzbbr zzbbr = new zzbbr();
        zzbbh.mo25573b(new C7832p6(zzbbr, zzbam, zzbbh), executor);
        m20548a(zzbbr, zzbbh);
        return zzbbr;
    }

    /* renamed from: a */
    public static <A, B> zzbbh<B> m20542a(zzbbh<A> zzbbh, zzbal<? super A, ? extends B> zzbal, Executor executor) {
        zzbbr zzbbr = new zzbbr();
        zzbbh.mo25573b(new C7869q6(zzbbr, zzbal, zzbbh), executor);
        m20548a(zzbbr, zzbbh);
        return zzbbr;
    }

    /* renamed from: a */
    public static <V> zzbbh<List<V>> m20545a(Iterable<? extends zzbbh<? extends V>> iterable) {
        zzbbr zzbbr = new zzbbr();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh a : iterable) {
            atomicInteger.incrementAndGet();
            m20548a(zzbbr, a);
        }
        C7906r6 r6Var = new C7906r6(iterable, zzbbr);
        for (zzbbh zzbbh : iterable) {
            zzbbh.mo25573b(new C7943s6(zzbbh, atomicInteger, r6Var, zzbbr), zzbbm.f18749b);
        }
        return zzbbr;
    }

    /* renamed from: a */
    public static <V> zzbbh<V> m20541a(zzbbh<V> zzbbh, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzbbr zzbbr = new zzbbr();
        m20548a(zzbbr, zzbbh);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C7980t6(zzbbr), j, timeUnit);
        m20547a(zzbbh, zzbbr);
        zzbbr.mo25573b(new C8017u6(schedule), zzbbm.f18749b);
        return zzbbr;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> zzbbh<V> m20544a(zzbbh<? extends V> zzbbh, Class<X> cls, zzbal<? super X, ? extends V> zzbal, Executor executor) {
        zzbbr zzbbr = new zzbbr();
        m20548a(zzbbr, zzbbh);
        zzbbh.mo25573b(new C8054v6(zzbbr, zzbbh, cls, zzbal, executor), zzbbm.f18749b);
        return zzbbr;
    }

    /* renamed from: a */
    public static <V> zzbbc<V> m20540a(zzbbh<? extends V>... zzbbhArr) {
        return m20551b(Arrays.asList(zzbbhArr));
    }

    /* renamed from: a */
    public static <T> C7312b7<T> m20539a(T t) {
        return new C7312b7<>(t);
    }

    /* renamed from: a */
    public static <T> C7275a7<T> m20538a(Throwable th) {
        return new C7275a7<>(th);
    }

    /* renamed from: a */
    private static <V> void m20547a(zzbbh<? extends V> zzbbh, zzbbr<V> zzbbr) {
        m20548a(zzbbr, zzbbh);
        zzbbh.mo25573b(new C8091w6(zzbbr, zzbbh), zzbbm.f18749b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <A, B> void m20548a(zzbbh<A> zzbbh, Future<B> future) {
        zzbbh.mo25573b(new C8128x6(zzbbh, future), zzbbm.f18749b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m20550a(com.google.android.gms.internal.ads.zzbbr r1, com.google.android.gms.internal.ads.zzbbh r2, java.lang.Class r3, com.google.android.gms.internal.ads.zzbal r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo27904b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.b7 r2 = m20539a(r2)
            com.google.android.gms.internal.ads.zzbbh r2 = m20542a(r2, r4, (java.util.concurrent.Executor) r5)
            m20547a(r2, r1)
            return
        L_0x002a:
            r1.mo27903a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbar.m20550a(com.google.android.gms.internal.ads.zzbbr, com.google.android.gms.internal.ads.zzbbh, java.lang.Class, com.google.android.gms.internal.ads.zzbal, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m20549a(zzbbr zzbbr, zzbal zzbal, zzbbh zzbbh) {
        if (!zzbbr.isCancelled()) {
            try {
                m20547a(zzbal.zzf(zzbbh.get()), zzbbr);
            } catch (CancellationException unused) {
                zzbbr.cancel(true);
            } catch (ExecutionException e) {
                zzbbr.mo27903a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzbbr.mo27903a(e2);
            } catch (Exception e3) {
                zzbbr.mo27903a(e3);
            }
        }
    }
}
