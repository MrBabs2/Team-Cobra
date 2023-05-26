package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
public final class zzazg {

    /* renamed from: a */
    private HandlerThread f18700a = null;

    /* renamed from: b */
    private Handler f18701b = null;

    /* renamed from: c */
    private int f18702c = 0;

    /* renamed from: d */
    private final Object f18703d = new Object();

    /* renamed from: a */
    public final Handler mo27863a() {
        return this.f18701b;
    }

    /* renamed from: b */
    public final Looper mo27864b() {
        Looper looper;
        synchronized (this.f18703d) {
            if (this.f18702c != 0) {
                Preconditions.m16038a(this.f18700a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f18700a == null) {
                zzawz.m20167e("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f18700a = handlerThread;
                handlerThread.start();
                this.f18701b = new zzdbh(this.f18700a.getLooper());
                zzawz.m20167e("Looper thread started.");
            } else {
                zzawz.m20167e("Resuming the looper thread");
                this.f18703d.notifyAll();
            }
            this.f18702c++;
            looper = this.f18700a.getLooper();
        }
        return looper;
    }
}
