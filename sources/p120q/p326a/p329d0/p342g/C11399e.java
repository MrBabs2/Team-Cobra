package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.g.e */
/* compiled from: InstantPeriodicTask */
final class C11399e implements Callable<Void>, C10842c {

    /* renamed from: k */
    static final FutureTask<Void> f30539k = new FutureTask<>(C10872a.f28932b, (Object) null);

    /* renamed from: f */
    final Runnable f30540f;

    /* renamed from: g */
    final AtomicReference<Future<?>> f30541g = new AtomicReference<>();

    /* renamed from: h */
    final AtomicReference<Future<?>> f30542h = new AtomicReference<>();

    /* renamed from: i */
    final ExecutorService f30543i;

    /* renamed from: j */
    Thread f30544j;

    C11399e(Runnable runnable, ExecutorService executorService) {
        this.f30540f = runnable;
        this.f30543i = executorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37133a(Future<?> future) {
        Future future2;
        do {
            future2 = this.f30542h.get();
            if (future2 == f30539k) {
                future.cancel(this.f30544j != Thread.currentThread());
                return;
            }
        } while (!this.f30542h.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37134b(Future<?> future) {
        Future future2;
        do {
            future2 = this.f30541g.get();
            if (future2 == f30539k) {
                future.cancel(this.f30544j != Thread.currentThread());
                return;
            }
        } while (!this.f30541g.compareAndSet(future2, future));
    }

    public void dispose() {
        Future andSet = this.f30542h.getAndSet(f30539k);
        boolean z = true;
        if (!(andSet == null || andSet == f30539k)) {
            andSet.cancel(this.f30544j != Thread.currentThread());
        }
        Future andSet2 = this.f30541g.getAndSet(f30539k);
        if (andSet2 != null && andSet2 != f30539k) {
            if (this.f30544j == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.f30542h.get() == f30539k;
    }

    public Void call() throws Exception {
        this.f30544j = Thread.currentThread();
        try {
            this.f30540f.run();
            mo37134b(this.f30543i.submit(this));
            this.f30544j = null;
        } catch (Throwable th) {
            this.f30544j = null;
            C11459a.m37531b(th);
        }
        return null;
    }
}
