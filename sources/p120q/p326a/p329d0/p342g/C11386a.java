package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10872a;

/* renamed from: q.a.d0.g.a */
/* compiled from: AbstractDirectTask */
abstract class C11386a extends AtomicReference<Future<?>> implements C10842c {

    /* renamed from: h */
    protected static final FutureTask<Void> f30500h = new FutureTask<>(C10872a.f28932b, (Object) null);

    /* renamed from: i */
    protected static final FutureTask<Void> f30501i = new FutureTask<>(C10872a.f28932b, (Object) null);

    /* renamed from: f */
    protected final Runnable f30502f;

    /* renamed from: g */
    protected Thread f30503g;

    C11386a(Runnable runnable) {
        this.f30502f = runnable;
    }

    /* renamed from: a */
    public final void mo37111a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f30500h) {
                if (future2 == f30501i) {
                    future.cancel(this.f30503g != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f30500h && future != (futureTask = f30501i) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f30503g != Thread.currentThread());
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f30500h || future == f30501i;
    }
}
