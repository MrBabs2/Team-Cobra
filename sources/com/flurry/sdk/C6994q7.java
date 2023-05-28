package com.flurry.sdk;

import java.lang.Thread;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.flurry.sdk.q7 */
public final class C6994q7 {

    /* renamed from: c */
    private static C6994q7 f13139c;

    /* renamed from: a */
    final Thread.UncaughtExceptionHandler f13140a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b */
    final Map<Thread.UncaughtExceptionHandler, Void> f13141b = new WeakHashMap();

    /* renamed from: com.flurry.sdk.q7$a */
    final class C6995a implements Thread.UncaughtExceptionHandler {
        private C6995a() {
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            for (Thread.UncaughtExceptionHandler uncaughtException : C6994q7.this.mo23701a()) {
                try {
                    uncaughtException.uncaughtException(thread, th);
                } catch (Throwable unused) {
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C6994q7.this.f13140a;
            if (uncaughtExceptionHandler != null) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (Throwable unused2) {
                }
            }
        }

        /* synthetic */ C6995a(C6994q7 q7Var, byte b) {
            this();
        }
    }

    private C6994q7() {
        Thread.setDefaultUncaughtExceptionHandler(new C6995a(this, (byte) 0));
    }

    /* renamed from: b */
    public static synchronized C6994q7 m14850b() {
        C6994q7 q7Var;
        synchronized (C6994q7.class) {
            if (f13139c == null) {
                f13139c = new C6994q7();
            }
            q7Var = f13139c;
        }
        return q7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<Thread.UncaughtExceptionHandler> mo23701a() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.f13141b) {
            keySet = this.f13141b.keySet();
        }
        return keySet;
    }
}
