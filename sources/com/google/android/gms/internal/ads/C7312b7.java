package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzard
/* renamed from: com.google.android.gms.internal.ads.b7 */
final class C7312b7<T> implements zzbbh<T> {

    /* renamed from: f */
    private final T f14559f;

    /* renamed from: g */
    private final C7349c7 f14560g;

    C7312b7(T t) {
        this.f14559f = t;
        C7349c7 c7Var = new C7349c7();
        this.f14560g = c7Var;
        c7Var.mo25767a();
    }

    /* renamed from: b */
    public final void mo25573b(Runnable runnable, Executor executor) {
        this.f14560g.mo25768a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f14559f;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f14559f;
    }
}
