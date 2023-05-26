package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.flurry.sdk.z1 */
public final class C7097z1 implements ThreadFactory {

    /* renamed from: f */
    private final ThreadGroup f13366f;

    /* renamed from: g */
    private final int f13367g = 1;

    public C7097z1(String str) {
        this.f13366f = new ThreadGroup(str);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f13366f, runnable);
        thread.setName(this.f13366f.getName() + ":" + thread.getId());
        thread.setPriority(this.f13367g);
        return thread;
    }
}
