package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.f */
/* compiled from: SerialExecutor */
public class C0938f implements Executor {

    /* renamed from: f */
    private final ArrayDeque<C0939a> f3258f = new ArrayDeque<>();

    /* renamed from: g */
    private final Executor f3259g;

    /* renamed from: h */
    private final Object f3260h = new Object();

    /* renamed from: i */
    private volatile Runnable f3261i;

    /* renamed from: androidx.work.impl.utils.f$a */
    /* compiled from: SerialExecutor */
    static class C0939a implements Runnable {

        /* renamed from: f */
        final C0938f f3262f;

        /* renamed from: g */
        final Runnable f3263g;

        C0939a(C0938f fVar, Runnable runnable) {
            this.f3262f = fVar;
            this.f3263g = runnable;
        }

        public void run() {
            try {
                this.f3263g.run();
            } finally {
                this.f3262f.mo4931a();
            }
        }
    }

    public C0938f(Executor executor) {
        this.f3259g = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4931a() {
        synchronized (this.f3260h) {
            Runnable poll = this.f3258f.poll();
            this.f3261i = poll;
            if (poll != null) {
                this.f3259g.execute(this.f3261i);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f3260h) {
            this.f3258f.add(new C0939a(this, runnable));
            if (this.f3261i == null) {
                mo4931a();
            }
        }
    }
}
