package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11481m;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c */
/* compiled from: BlockingObservableLatest */
public final class C11004c<T> implements Iterable<T> {

    /* renamed from: f */
    final C11488s<T> f29219f;

    /* renamed from: q.a.d0.e.e.c$a */
    /* compiled from: BlockingObservableLatest */
    static final class C11005a<T> extends C11453c<C11481m<T>> implements Iterator<T> {

        /* renamed from: g */
        C11481m<T> f29220g;

        /* renamed from: h */
        final Semaphore f29221h = new Semaphore(0);

        /* renamed from: i */
        final AtomicReference<C11481m<T>> f29222i = new AtomicReference<>();

        C11005a() {
        }

        /* renamed from: a */
        public void onNext(C11481m<T> mVar) {
            if (this.f29222i.getAndSet(mVar) == null) {
                this.f29221h.release();
            }
        }

        public boolean hasNext() {
            C11481m<T> mVar = this.f29220g;
            if (mVar == null || !mVar.mo37249d()) {
                if (this.f29220g == null) {
                    try {
                        C11430e.m37453a();
                        this.f29221h.acquire();
                        C11481m<T> andSet = this.f29222i.getAndSet((Object) null);
                        this.f29220g = andSet;
                        if (andSet.mo37249d()) {
                            throw C11435j.m37463a(andSet.mo37246a());
                        }
                    } catch (InterruptedException e) {
                        dispose();
                        this.f29220g = C11481m.m37580a((Throwable) e);
                        throw C11435j.m37463a((Throwable) e);
                    }
                }
                return this.f29220g.mo37250e();
            }
            throw C11435j.m37463a(this.f29220g.mo37246a());
        }

        public T next() {
            if (hasNext()) {
                T b = this.f29220g.mo37247b();
                this.f29220g = null;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            C11459a.m37531b(th);
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public C11004c(C11488s<T> sVar) {
        this.f29219f = sVar;
    }

    public Iterator<T> iterator() {
        C11005a aVar = new C11005a();
        C11482n.wrap(this.f29219f).materialize().subscribe(aVar);
        return aVar;
    }
}
