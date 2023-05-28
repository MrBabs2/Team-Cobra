package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzard
/* renamed from: com.google.android.gms.internal.ads.a7 */
final class C7275a7<T> implements zzbbh<T> {

    /* renamed from: f */
    private final Throwable f14410f;

    /* renamed from: g */
    private final C7349c7 f14411g;

    C7275a7(Throwable th) {
        this.f14410f = th;
        C7349c7 c7Var = new C7349c7();
        this.f14411g = c7Var;
        c7Var.mo25767a();
    }

    /* renamed from: b */
    public final void mo25573b(Runnable runnable, Executor executor) {
        this.f14411g.mo25768a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f14410f);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f14410f);
    }
}
