package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: f */
    private final String f14272f;

    /* renamed from: g */
    private final ThreadFactory f14273g;

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f14273g.newThread(new C7254a(runnable, 0));
        newThread.setName(this.f14272f);
        return newThread;
    }
}
