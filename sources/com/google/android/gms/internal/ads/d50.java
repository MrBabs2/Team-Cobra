package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class d50 implements Runnable {

    /* renamed from: f */
    private final zzbbr f14816f;

    /* renamed from: g */
    private final Future f14817g;

    d50(zzbbr zzbbr, Future future) {
        this.f14816f = zzbbr;
        this.f14817g = future;
    }

    public final void run() {
        zzbbr zzbbr = this.f14816f;
        Future future = this.f14817g;
        if (zzbbr.isCancelled()) {
            future.cancel(true);
        }
    }
}
