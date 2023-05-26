package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11479k;
import p120q.p326a.C11480l;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.z1 */
/* compiled from: ObservableMergeWithMaybe */
public final class C11350z1<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11480l<? extends T> f30402g;

    public C11350z1(C11482n<T> nVar, C11480l<? extends T> lVar) {
        super(nVar);
        this.f30402g = lVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11351a aVar = new C11351a(uVar);
        uVar.onSubscribe(aVar);
        this.f29150f.subscribe(aVar);
        this.f30402g.mo37244a(aVar.f30405h);
    }

    /* renamed from: q.a.d0.e.e.z1$a */
    /* compiled from: ObservableMergeWithMaybe */
    static final class C11351a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30403f;

        /* renamed from: g */
        final AtomicReference<C10842c> f30404g = new AtomicReference<>();

        /* renamed from: h */
        final C11352a<T> f30405h = new C11352a<>(this);

        /* renamed from: i */
        final C11428c f30406i = new C11428c();

        /* renamed from: j */
        volatile C10917f<T> f30407j;

        /* renamed from: k */
        T f30408k;

        /* renamed from: l */
        volatile boolean f30409l;

        /* renamed from: m */
        volatile boolean f30410m;

        /* renamed from: n */
        volatile int f30411n;

        /* renamed from: q.a.d0.e.e.z1$a$a */
        /* compiled from: ObservableMergeWithMaybe */
        static final class C11352a<T> extends AtomicReference<C10842c> implements C11479k<T> {

            /* renamed from: f */
            final C11351a<T> f30412f;

            C11352a(C11351a<T> aVar) {
                this.f30412f = aVar;
            }

            public void onComplete() {
                this.f30412f.mo37076d();
            }

            public void onError(Throwable th) {
                this.f30412f.mo37073a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(T t) {
                this.f30412f.mo37072a(t);
            }
        }

        C11351a(C11490u<? super T> uVar) {
            this.f30403f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37072a(T t) {
            if (compareAndSet(0, 1)) {
                this.f30403f.onNext(t);
                this.f30411n = 2;
            } else {
                this.f30408k = t;
                this.f30411n = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo37074b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37074b() {
            C11490u<? super T> uVar = this.f30403f;
            int i = 1;
            while (!this.f30409l) {
                if (this.f30406i.get() != null) {
                    this.f30408k = null;
                    this.f30407j = null;
                    uVar.onError(this.f30406i.mo37168a());
                    return;
                }
                int i2 = this.f30411n;
                if (i2 == 1) {
                    T t = this.f30408k;
                    this.f30408k = null;
                    this.f30411n = 2;
                    uVar.onNext(t);
                    i2 = 2;
                }
                boolean z = this.f30410m;
                C10917f<T> fVar = this.f30407j;
                T poll = fVar != null ? fVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.f30407j = null;
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
            this.f30408k = null;
            this.f30407j = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C10917f<T> mo37075c() {
            C10917f<T> fVar = this.f30407j;
            if (fVar != null) {
                return fVar;
            }
            C11385c cVar = new C11385c(C11482n.bufferSize());
            this.f30407j = cVar;
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37076d() {
            this.f30411n = 2;
            mo37071a();
        }

        public void dispose() {
            this.f30409l = true;
            C10867d.m36773a(this.f30404g);
            C10867d.m36773a((AtomicReference<C10842c>) this.f30405h);
            if (getAndIncrement() == 0) {
                this.f30407j = null;
                this.f30408k = null;
            }
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30404g.get());
        }

        public void onComplete() {
            this.f30410m = true;
            mo37071a();
        }

        public void onError(Throwable th) {
            if (this.f30406i.mo37169a(th)) {
                C10867d.m36773a((AtomicReference<C10842c>) this.f30405h);
                mo37071a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f30403f.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mo37075c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            mo37074b();
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30404g, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37073a(Throwable th) {
            if (this.f30406i.mo37169a(th)) {
                C10867d.m36773a(this.f30404g);
                mo37071a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37071a() {
            if (getAndIncrement() == 0) {
                mo37074b();
            }
        }
    }
}
