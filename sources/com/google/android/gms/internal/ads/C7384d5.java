package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.d5 */
final class C7384d5 implements ThreadFactory {

    /* renamed from: f */
    private final AtomicInteger f14814f = new AtomicInteger(1);

    /* renamed from: g */
    private final /* synthetic */ String f14815g;

    C7384d5(String str) {
        this.f14815g = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f14815g;
        int andIncrement = this.f14814f.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
