package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d7 */
final /* synthetic */ class C7386d7 implements Runnable {

    /* renamed from: f */
    private final Executor f14824f;

    /* renamed from: g */
    private final Runnable f14825g;

    C7386d7(Executor executor, Runnable runnable) {
        this.f14824f = executor;
        this.f14825g = runnable;
    }

    public final void run() {
        this.f14824f.execute(this.f14825g);
    }
}
