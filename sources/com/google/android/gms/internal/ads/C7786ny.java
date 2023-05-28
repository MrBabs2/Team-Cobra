package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ny */
final class C7786ny implements ThreadFactory {

    /* renamed from: f */
    private final ThreadFactory f16405f = Executors.defaultThreadFactory();

    /* renamed from: g */
    private final AtomicInteger f16406g = new AtomicInteger(1);

    C7786ny() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f16405f.newThread(runnable);
        int andIncrement = this.f16406g.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
