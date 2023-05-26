package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.p3 */
final class C7829p3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f16554f;

    /* renamed from: g */
    private final /* synthetic */ zzaqx f16555g;

    C7829p3(zzaqx zzaqx, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16555g = zzaqx;
        this.f16554f = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f16555g.mo27570a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16554f;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f16554f;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
