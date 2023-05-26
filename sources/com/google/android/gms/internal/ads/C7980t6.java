package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.t6 */
final /* synthetic */ class C7980t6 implements Runnable {

    /* renamed from: f */
    private final zzbbr f16894f;

    C7980t6(zzbbr zzbbr) {
        this.f16894f = zzbbr;
    }

    public final void run() {
        this.f16894f.mo27903a(new TimeoutException());
    }
}
