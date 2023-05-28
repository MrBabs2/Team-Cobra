package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10838a0;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.a2 */
/* compiled from: ObservableMergeWithSingle */
public final class C10985a2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10838a0<? extends T> f29159g;

    public C10985a2(C11482n<T> nVar, C10838a0<? extends T> a0Var) {
        super(nVar);
        this.f29159g = a0Var;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C10986a aVar = new C10986a(uVar);
        uVar.onSubscribe(aVar);
        this.f29150f.subscribe(aVar);
        this.f29159g.mo36638a(aVar.f29162h);
    }

    /* renamed from: q.a.d0.e.e.a2$a */
    /* compiled from: ObservableMergeWithSingle */
    static final class C10986a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29160f;

        /* renamed from: g */
        final AtomicReference<C10842c> f29161g = new AtomicReference<>();

        /* renamed from: h */
        final C10987a<T> f29162h = new C10987a<>(this);

        /* renamed from: i */
        final C11428c f29163i = new C11428c();

        /* renamed from: j */
        volatile C10917f<T> f29164j;

        /* renamed from: k */
        T f29165k;

        /* renamed from: l */
        volatile boolean f29166l;

        /* renamed from: m */
        volatile boolean f29167m;

        /* renamed from: n */
        volatile int f29168n;

        /* renamed from: q.a.d0.e.e.a2$a$a */
        /* compiled from: ObservableMergeWithSingle */
        static final class C10987a<T> extends AtomicReference<C10842c> implements C11498y<T> {

            /* renamed from: f */
            final C10986a<T> f29169f;

            C10987a(C10986a<T> aVar) {
                this.f29169f = aVar;
            }

            public void onError(Throwable th) {
                this.f29169f.mo36779a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(T t) {
                this.f29169f.mo36778a(t);
            }
        }

        C10986a(C11490u<? super T> uVar) {
            this.f29160f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36778a(T t) {
            if (compareAndSet(0, 1)) {
                this.f29160f.onNext(t);
                this.f29168n = 2;
            } else {
                this.f29165k = t;
                this.f29168n = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo36780b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36780b() {
            C11490u<? super T> uVar = this.f29160f;
            int i = 1;
            while (!this.f29166l) {
                if (this.f29163i.get() != null) {
                    this.f29165k = null;
                    this.f29164j = null;
                    uVar.onError(this.f29163i.mo37168a());
                    return;
                }
                int i2 = this.f29168n;
                if (i2 == 1) {
                    T t = this.f29165k;
                    this.f29165k = null;
                    this.f29168n = 2;
                    uVar.onNext(t);
                    i2 = 2;
                }
                boolean z = this.f29167m;
                C10917f<T> fVar = this.f29164j;
                T poll = fVar != null ? fVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.f29164j = null;
                    uVar.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    uVar.onNext(poll);
                }
            }
            this.f29165k = null;
            this.f29164j = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C10917f<T> mo36781c() {
            C10917f<T> fVar = this.f29164j;
            if (fVar != null) {
                return fVar;
            }
            C11385c cVar = new C11385c(C11482n.bufferSize());
            this.f29164j = cVar;
            return cVar;
        }

        public void dispose() {
            this.f29166l = true;
            C10867d.m36773a(this.f29161g);
            C10867d.m36773a((AtomicReference<C10842c>) this.f29162h);
            if (getAndIncrement() == 0) {
                this.f29164j = null;
                this.f29165k = null;
            }
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f29161g.get());
        }

        public void onComplete() {
            this.f29167m = true;
            mo36777a();
        }

        public void onError(Throwable th) {
            if (this.f29163i.mo37169a(th)) {
                C10867d.m36773a((AtomicReference<C10842c>) this.f29162h);
                mo36777a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f29160f.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo36781c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo36780b();
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29161g, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36779a(Throwable th) {
            if (this.f29163i.mo37169a(th)) {
                C10867d.m36773a(this.f29161g);
                mo36777a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36777a() {
            if (getAndIncrement() == 0) {
                mo36780b();
            }
        }
    }
}
