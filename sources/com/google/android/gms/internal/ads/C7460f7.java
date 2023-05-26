package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.f7 */
final class C7460f7 implements Executor {

    /* renamed from: f */
    private final Handler f15194f = new zzaxa(Looper.getMainLooper());

    C7460f7() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzk.zzlg();
                zzaxi.m20276a(zzk.zzlk().mo27731a(), th);
                throw th;
            }
        } else {
            this.f15194f.post(runnable);
        }
    }
}
