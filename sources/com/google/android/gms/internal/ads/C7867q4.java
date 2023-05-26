package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.q4 */
final class C7867q4 implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f16640f = new AtomicInteger(1);

    C7867q4(zzavg zzavg) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f16640f.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
