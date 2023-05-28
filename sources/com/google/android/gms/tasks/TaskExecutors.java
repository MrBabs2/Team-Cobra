package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class TaskExecutors {

    /* renamed from: a */
    public static final Executor f23705a = new C8399a();

    /* renamed from: com.google.android.gms.tasks.TaskExecutors$a */
    private static final class C8399a implements Executor {

        /* renamed from: f */
        private final Handler f23706f = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f23706f.post(runnable);
        }
    }

    static {
        new C8405f();
    }

    private TaskExecutors() {
    }
}
