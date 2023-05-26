package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;

/* renamed from: q.a.d0.e.e.b */
/* compiled from: BlockingObservableIterable */
public final class C10992b<T> implements Iterable<T> {

    /* renamed from: f */
    final C11488s<? extends T> f29181f;

    /* renamed from: g */
    final int f29182g;

    /* renamed from: q.a.d0.e.e.b$a */
    /* compiled from: BlockingObservableIterable */
    static final class C10993a<T> extends AtomicReference<C10842c> implements C11490u<T>, Iterator<T>, C10842c {

        /* renamed from: f */
        final C11385c<T> f29183f;

        /* renamed from: g */
        final Lock f29184g;

        /* renamed from: h */
        final Condition f29185h;

        /* renamed from: i */
        volatile boolean f29186i;

        /* renamed from: j */
        volatile Throwable f29187j;

        C10993a(int i) {
            this.f29183f = new C11385c<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f29184g = reentrantLock;
            this.f29185h = reentrantLock.newCondition();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36785a() {
            this.f29184g.lock();
            try {
                this.f29185h.signalAll();
            } finally {
                this.f29184g.unlock();
            }
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
            mo36785a();
        }

        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f29186i;
                boolean isEmpty = this.f29183f.isEmpty();
                if (z) {
                    Throwable th = this.f29187j;
                    if (th != null) {
                        throw C11435j.m37463a(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                C11430e.m37453a();
                this.f29184g.lock();
                while (!this.f29186i && this.f29183f.isEmpty() && !isDisposed()) {
                    try {
                        this.f29185h.await();
                    } catch (InterruptedException e) {
                        C10867d.m36773a((AtomicReference<C10842c>) this);
                        mo36785a();
                        throw C11435j.m37463a((Throwable) e);
                    } catch (Throwable th2) {
                        this.f29184g.unlock();
                        throw th2;
                    }
                }
                this.f29184g.unlock();
            }
            Throwable th3 = this.f29187j;
            if (th3 == null) {
                return false;
            }
            throw C11435j.m37463a(th3);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public T next() {
            if (hasNext()) {
                return this.f29183f.poll();
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
            this.f29186i = true;
            mo36785a();
        }

        public void onError(Throwable th) {
            this.f29187j = th;
            this.f29186i = true;
            mo36785a();
        }

        public void onNext(T t) {
            this.f29183f.offer(t);
            mo36785a();
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public C10992b(C11488s<? extends T> sVar, int i) {
        this.f29181f = sVar;
        this.f29182g = i;
    }

    public Iterator<T> iterator() {
        C10993a aVar = new C10993a(this.f29182g);
        this.f29181f.subscribe(aVar);
        return aVar;
    }
}
