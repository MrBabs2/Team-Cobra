package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.FutureTask;

/* renamed from: com.flurry.sdk.b1 */
public final class C6748b1<V> extends FutureTask<V> {

    /* renamed from: f */
    private final WeakReference<Runnable> f12561f;

    public C6748b1(Runnable runnable, V v) {
        super(runnable, v);
        new WeakReference((Object) null);
        this.f12561f = new WeakReference<>(runnable);
    }

    /* renamed from: a */
    public final Runnable mo23542a() {
        return (Runnable) this.f12561f.get();
    }
}
