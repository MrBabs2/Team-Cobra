package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: f */
    private final String f14274f;

    /* renamed from: g */
    private final AtomicInteger f14275g;

    /* renamed from: h */
    private final ThreadFactory f14276h;

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f14276h.newThread(new C7254a(runnable, 0));
        String str = this.f14274f;
        int andIncrement = this.f14275g.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private NumberedThreadFactory(String str, int i) {
        this.f14275g = new AtomicInteger();
        this.f14276h = Executors.defaultThreadFactory();
        Preconditions.m16038a(str, (Object) "Name must not be null");
        this.f14274f = str;
    }
}
