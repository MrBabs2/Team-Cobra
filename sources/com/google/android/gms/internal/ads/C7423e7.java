package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@zzard
/* renamed from: com.google.android.gms.internal.ads.e7 */
final class C7423e7<V> extends FutureTask<V> implements zzbbh<V> {

    /* renamed from: f */
    private final C7349c7 f15071f = new C7349c7();

    C7423e7(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: b */
    public final void mo25573b(Runnable runnable, Executor executor) {
        this.f15071f.mo25768a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f15071f.mo25767a();
    }

    C7423e7(Runnable runnable, V v) {
        super(runnable, v);
    }
}
