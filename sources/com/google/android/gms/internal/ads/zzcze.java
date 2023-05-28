package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzcze<E, V> implements zzbbh<V> {

    /* renamed from: f */
    private final E f21229f;

    /* renamed from: g */
    private final String f21230g;

    /* renamed from: h */
    private final zzbbh<V> f21231h;

    public zzcze(E e, String str, zzbbh<V> zzbbh) {
        this.f21229f = e;
        this.f21230g = str;
        this.f21231h = zzbbh;
    }

    /* renamed from: a */
    public final E mo28840a() {
        return this.f21229f;
    }

    /* renamed from: b */
    public final void mo25573b(Runnable runnable, Executor executor) {
        this.f21231h.mo25573b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f21231h.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f21231h.get();
    }

    public final boolean isCancelled() {
        return this.f21231h.isCancelled();
    }

    public final boolean isDone() {
        return this.f21231h.isDone();
    }

    public final String toString() {
        String str = this.f21230g;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo28841b() {
        return this.f21230g;
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f21231h.get(j, timeUnit);
    }
}
