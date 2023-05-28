package p120q.p326a.p329d0.p333d;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.d.l */
/* compiled from: FutureObserver */
public final class C10930l<T> extends CountDownLatch implements C11490u<T>, Future<T>, C10842c {

    /* renamed from: f */
    T f28997f;

    /* renamed from: g */
    Throwable f28998g;

    /* renamed from: h */
    final AtomicReference<C10842c> f28999h = new AtomicReference<>();

    public C10930l() {
        super(1);
    }

    public boolean cancel(boolean z) {
        C10842c cVar;
        C10867d dVar;
        do {
            cVar = this.f28999h.get();
            if (cVar == this || cVar == (dVar = C10867d.DISPOSED)) {
                return false;
            }
        } while (!this.f28999h.compareAndSet(cVar, dVar));
        if (cVar != null) {
            cVar.dispose();
        }
        countDown();
        return true;
    }

    public void dispose() {
    }

    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C11430e.m37453a();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f28998g;
            if (th == null) {
                return this.f28997f;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public boolean isCancelled() {
        return C10867d.m36775a(this.f28999h.get());
    }

    public boolean isDisposed() {
        return isDone();
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public void onComplete() {
        C10842c cVar;
        if (this.f28997f == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            cVar = this.f28999h.get();
            if (cVar == this || cVar == C10867d.DISPOSED) {
                return;
            }
        } while (!this.f28999h.compareAndSet(cVar, this));
        countDown();
    }

    public void onError(Throwable th) {
        C10842c cVar;
        if (this.f28998g == null) {
            this.f28998g = th;
            do {
                cVar = this.f28999h.get();
                if (cVar == this || cVar == C10867d.DISPOSED) {
                    C11459a.m37531b(th);
                    return;
                }
            } while (!this.f28999h.compareAndSet(cVar, this));
            countDown();
            return;
        }
        C11459a.m37531b(th);
    }

    public void onNext(T t) {
        if (this.f28997f != null) {
            this.f28999h.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f28997f = t;
    }

    public void onSubscribe(C10842c cVar) {
        C10867d.m36778c(this.f28999h, cVar);
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C11430e.m37453a();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(C11435j.m37464a(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f28998g;
            if (th == null) {
                return this.f28997f;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
