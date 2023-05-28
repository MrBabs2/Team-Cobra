package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11481m;
import p120q.p326a.C11488s;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.e */
/* compiled from: BlockingObservableNext */
public final class C11030e<T> implements Iterable<T> {

    /* renamed from: f */
    final C11488s<T> f29309f;

    /* renamed from: q.a.d0.e.e.e$a */
    /* compiled from: BlockingObservableNext */
    static final class C11031a<T> implements Iterator<T> {

        /* renamed from: f */
        private final C11032b<T> f29310f;

        /* renamed from: g */
        private final C11488s<T> f29311g;

        /* renamed from: h */
        private T f29312h;

        /* renamed from: i */
        private boolean f29313i = true;

        /* renamed from: j */
        private boolean f29314j = true;

        /* renamed from: k */
        private Throwable f29315k;

        /* renamed from: l */
        private boolean f29316l;

        C11031a(C11488s<T> sVar, C11032b<T> bVar) {
            this.f29311g = sVar;
            this.f29310f = bVar;
        }

        /* renamed from: a */
        private boolean m36986a() {
            if (!this.f29316l) {
                this.f29316l = true;
                this.f29310f.mo36830b();
                new C11320x1(this.f29311g).subscribe(this.f29310f);
            }
            try {
                C11481m<T> c = this.f29310f.mo36831c();
                if (c.mo37250e()) {
                    this.f29314j = false;
                    this.f29312h = c.mo37247b();
                    return true;
                }
                this.f29313i = false;
                if (c.mo37248c()) {
                    return false;
                }
                Throwable a = c.mo37246a();
                this.f29315k = a;
                throw C11435j.m37463a(a);
            } catch (InterruptedException e) {
                this.f29310f.dispose();
                this.f29315k = e;
                throw C11435j.m37463a((Throwable) e);
            }
        }

        public boolean hasNext() {
            Throwable th = this.f29315k;
            if (th != null) {
                throw C11435j.m37463a(th);
            } else if (!this.f29313i) {
                return false;
            } else {
                if (!this.f29314j || m36986a()) {
                    return true;
                }
                return false;
            }
        }

        public T next() {
            Throwable th = this.f29315k;
            if (th != null) {
                throw C11435j.m37463a(th);
            } else if (hasNext()) {
                this.f29314j = true;
                return this.f29312h;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: q.a.d0.e.e.e$b */
    /* compiled from: BlockingObservableNext */
    static final class C11032b<T> extends C11453c<C11481m<T>> {

        /* renamed from: g */
        private final BlockingQueue<C11481m<T>> f29317g = new ArrayBlockingQueue(1);

        /* renamed from: h */
        final AtomicInteger f29318h = new AtomicInteger();

        C11032b() {
        }

        /* renamed from: a */
        public void onNext(C11481m<T> mVar) {
            if (this.f29318h.getAndSet(0) == 1 || !mVar.mo37250e()) {
                while (!this.f29317g.offer(mVar)) {
                    C11481m<T> mVar2 = (C11481m) this.f29317g.poll();
                    if (mVar2 != null && !mVar2.mo37250e()) {
                        mVar = mVar2;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36830b() {
            this.f29318h.set(1);
        }

        /* renamed from: c */
        public C11481m<T> mo36831c() throws InterruptedException {
            mo36830b();
            C11430e.m37453a();
            return this.f29317g.take();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            C11459a.m37531b(th);
        }
    }

    public C11030e(C11488s<T> sVar) {
        this.f29309f = sVar;
    }

    public Iterator<T> iterator() {
        return new C11031a(this.f29309f, new C11032b());
    }
}
