package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.airbnb.epoxy.w */
/* compiled from: HandlerExecutor */
class C5638w implements Executor {

    /* renamed from: f */
    final Handler f9934f;

    C5638w(Handler handler) {
        this.f9934f = handler;
    }

    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.f9934f.getLooper()) {
            runnable.run();
        } else {
            this.f9934f.post(runnable);
        }
    }
}
