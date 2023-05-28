package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class o00 implements ThreadFactory {

    /* renamed from: f */
    private final /* synthetic */ String f16411f;

    o00(String str) {
        this.f16411f = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f16411f);
    }
}
