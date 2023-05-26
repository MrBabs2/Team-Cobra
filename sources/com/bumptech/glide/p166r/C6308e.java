package com.bumptech.glide.p166r;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.r.e */
/* compiled from: Executors */
public final class C6308e {

    /* renamed from: a */
    private static final Executor f11559a = new C6309a();

    /* renamed from: b */
    private static final Executor f11560b = new C6310b();

    /* renamed from: com.bumptech.glide.r.e$a */
    /* compiled from: Executors */
    class C6309a implements Executor {

        /* renamed from: f */
        private final Handler f11561f = new Handler(Looper.getMainLooper());

        C6309a() {
        }

        public void execute(Runnable runnable) {
            this.f11561f.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.r.e$b */
    /* compiled from: Executors */
    class C6310b implements Executor {
        C6310b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m12962a() {
        return f11560b;
    }

    /* renamed from: b */
    public static Executor m12963b() {
        return f11559a;
    }
}
