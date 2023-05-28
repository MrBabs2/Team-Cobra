package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class p30 implements ThreadFactory {

    /* renamed from: f */
    private final /* synthetic */ String f16556f;

    p30(String str) {
        this.f16556f = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f16556f);
    }
}
