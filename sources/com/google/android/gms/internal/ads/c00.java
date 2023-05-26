package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class c00 implements Executor {

    /* renamed from: f */
    private final /* synthetic */ Handler f14689f;

    c00(zzi zzi, Handler handler) {
        this.f14689f = handler;
    }

    public final void execute(Runnable runnable) {
        this.f14689f.post(runnable);
    }
}
