package com.flurry.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.l2 */
public class C6916l2 extends C6774c5 {

    /* renamed from: m */
    private static final ThreadLocal<C6916l2> f12962m = new ThreadLocal<>();

    /* renamed from: l */
    private Thread f12963l;

    public C6916l2(String str, C6833g4 g4Var) {
        super(str, g4Var, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23594b(Runnable runnable) {
        if (Thread.currentThread() == this.f12963l) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public Future<Void> mo23563c(Runnable runnable) {
        return super.mo23563c(runnable);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23564d(java.lang.Runnable r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = r2.f12963l     // Catch:{ all -> 0x0021 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x001c
            boolean r0 = r3 instanceof com.flurry.sdk.C6833g4.C6835b     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0017
            com.flurry.sdk.g4 r0 = r2.f12786f     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001a
            com.flurry.sdk.g4 r0 = r2.f12786f     // Catch:{ all -> 0x0021 }
            r0.mo23564d(r3)     // Catch:{ all -> 0x0021 }
            goto L_0x001a
        L_0x0017:
            r3.run()     // Catch:{ all -> 0x0021 }
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            super.mo23564d(r3)
            return
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6916l2.mo23564d(java.lang.Runnable):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo23565f(Runnable runnable) {
        C6916l2 l2Var;
        Thread thread;
        synchronized (this) {
            l2Var = f12962m.get();
            f12962m.set(this);
            thread = this.f12963l;
            this.f12963l = Thread.currentThread();
        }
        try {
            mo23595e(runnable);
            synchronized (this) {
                this.f12963l = thread;
                f12962m.set(l2Var);
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f12963l = thread;
                f12962m.set(l2Var);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo23647g(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
