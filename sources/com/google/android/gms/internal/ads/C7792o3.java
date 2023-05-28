package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.o3 */
final class C7792o3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f16418f;

    /* renamed from: g */
    private final /* synthetic */ zzaqx f16419g;

    C7792o3(zzaqx zzaqx, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16419g = zzaqx;
        this.f16418f = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f16419g.mo27570a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16418f;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f16418f;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
