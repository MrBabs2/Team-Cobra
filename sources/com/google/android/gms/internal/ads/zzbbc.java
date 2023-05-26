package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbbc<V> {

    /* renamed from: a */
    private final zzbbr<Void> f18747a = new zzbbr<>();

    zzbbc(Iterable<? extends zzbbh<? extends V>> iterable) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbbh b : iterable) {
            atomicInteger.incrementAndGet();
            zzbar.m20548a(this.f18747a, b);
        }
        if (atomicInteger.get() == 0) {
            this.f18747a.mo27904b(null);
            return;
        }
        for (zzbbh b2 : iterable) {
            b2.mo25573b(new C8165y6(this, atomicInteger), zzbbm.f18749b);
        }
    }

    /* renamed from: a */
    public final <C> zzbbh<C> mo27900a(Callable<C> callable, Executor executor) {
        return zzbar.m20542a(this.f18747a, new C8202z6(callable), executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27901a(AtomicInteger atomicInteger) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.f18747a.mo27904b(null);
        }
    }
}
