package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Callable;

/* renamed from: q.a.d0.g.l */
/* compiled from: ScheduledDirectTask */
public final class C11410l extends C11386a implements Callable<Void> {
    public C11410l(Runnable runnable) {
        super(runnable);
    }

    public Void call() throws Exception {
        this.f30503g = Thread.currentThread();
        try {
            this.f30502f.run();
            return null;
        } finally {
            lazySet(C11386a.f30500h);
            this.f30503g = null;
        }
    }
}
