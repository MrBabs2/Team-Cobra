package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.u6 */
final /* synthetic */ class C8017u6 implements Runnable {

    /* renamed from: f */
    private final Future f16943f;

    C8017u6(Future future) {
        this.f16943f = future;
    }

    public final void run() {
        Future future = this.f16943f;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
