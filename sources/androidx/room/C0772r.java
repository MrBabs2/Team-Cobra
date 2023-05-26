package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.r */
/* compiled from: TransactionExecutor */
class C0772r implements Executor {

    /* renamed from: f */
    private final Executor f2845f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f2846g = new ArrayDeque<>();

    /* renamed from: h */
    private Runnable f2847h;

    /* renamed from: androidx.room.r$a */
    /* compiled from: TransactionExecutor */
    class C0773a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f2848f;

        C0773a(Runnable runnable) {
            this.f2848f = runnable;
        }

        public void run() {
            try {
                this.f2848f.run();
            } finally {
                C0772r.this.mo4451a();
            }
        }
    }

    C0772r(Executor executor) {
        this.f2845f = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo4451a() {
        Runnable poll = this.f2846g.poll();
        this.f2847h = poll;
        if (poll != null) {
            this.f2845f.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f2846g.offer(new C0773a(runnable));
        if (this.f2847h == null) {
            mo4451a();
        }
    }
}
