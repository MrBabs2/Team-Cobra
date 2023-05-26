package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.x6 */
final /* synthetic */ class C8128x6 implements Runnable {

    /* renamed from: f */
    private final zzbbh f17171f;

    /* renamed from: g */
    private final Future f17172g;

    C8128x6(zzbbh zzbbh, Future future) {
        this.f17171f = zzbbh;
        this.f17172g = future;
    }

    public final void run() {
        zzbbh zzbbh = this.f17171f;
        Future future = this.f17172g;
        if (zzbbh.isCancelled()) {
            future.cancel(true);
        }
    }
}
