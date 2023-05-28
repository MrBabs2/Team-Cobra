package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {

    /* renamed from: f */
    private final Handler f14271f;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.f14271f = new zze(looper);
    }

    public void execute(Runnable runnable) {
        this.f14271f.post(runnable);
    }
}
