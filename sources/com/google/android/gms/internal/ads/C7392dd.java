package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.dd */
final /* synthetic */ class C7392dd implements Runnable {

    /* renamed from: f */
    private final AtomicReference f15008f;

    C7392dd(AtomicReference atomicReference) {
        this.f15008f = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f15008f.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
