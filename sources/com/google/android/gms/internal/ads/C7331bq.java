package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.bq */
final class C7331bq implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f14655f = new AtomicInteger(1);

    C7331bq() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f14655f.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
