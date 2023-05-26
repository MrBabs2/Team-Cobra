package p120q.p326a.p329d0.p334e.p338d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.f */
/* compiled from: ObservableSwitchMapSingle */
public final class C10976f<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11482n<T> f29136f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C10838a0<? extends R>> f29137g;

    /* renamed from: h */
    final boolean f29138h;

    public C10976f(C11482n<T> nVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
        this.f29136f = nVar;
        this.f29137g = oVar;
        this.f29138h = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        if (!C10979g.m36948b(this.f29136f, this.f29137g, uVar)) {
            this.f29136f.subscribe(new C10977a(uVar, this.f29137g, this.f29138h));
        }
    }

    /* renamed from: q.a.d0.e.d.f$a */
    /* compiled from: ObservableSwitchMapSingle */
    static final class C10977a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: n */
        static final C10978a<Object> f29139n = new C10978a<>((C10977a) null);

        /* renamed from: f */
        final C11490u<? super R> f29140f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C10838a0<? extends R>> f29141g;

        /* renamed from: h */
        final boolean f29142h;

        /* renamed from: i */
        final C11428c f29143i = new C11428c();

        /* renamed from: j */
        final AtomicReference<C10978a<R>> f29144j = new AtomicReference<>();

        /* renamed from: k */
        C10842c f29145k;

        /* renamed from: l */
        volatile boolean f29146l;

        /* renamed from: m */
        volatile boolean f29147m;

        /* renamed from: q.a.d0.e.d.f$a$a */
        /* compiled from: ObservableSwitchMapSingle */
        static final class C10978a<R> extends AtomicReference<C10842c> implements C11498y<R> {

            /* renamed from: f */
            final C10977a<?, R> f29148f;

            /* renamed from: g */
            volatile R f29149g;

            C10978a(C10977a<?, R> aVar) {
                this.f29148f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36776a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onError(Throwable th) {
                this.f29148f.mo36774a(this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(R r) {
                this.f29149g = r;
                this.f29148f.mo36775b();
            }
        }

        C10977a(C11490u<? super R> uVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
            this.f29140f = uVar;
            this.f29141g = oVar;
            this.f29142h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36773a() {
            C10978a<Object> andSet = this.f29144j.getAndSet(f29139n);
            if (andSet != null && andSet != f29139n) {
                andSet.mo36776a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36775b() {
            if (getAndIncrement() == 0) {
                C11490u<? super R> uVar = this.f29140f;
                C11428c cVar = this.f29143i;
                AtomicReference<C10978a<R>> atomicReference = this.f29144j;
                int i = 1;
                while (!this.f29147m) {
                    if (cVar.get() == null || this.f29142h) {
                        boolean z = this.f29146l;
                        C10978a aVar = atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable a = cVar.mo37168a();
                            if (a != null) {
                                uVar.onError(a);
                                return;
                            } else {
                                uVar.onComplete();
                                return;
                            }
                        } else if (z2 || aVar.f29149g == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            uVar.onNext(aVar.f29149g);
                        }
                    } else {
                        uVar.onError(cVar.mo37168a());
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f29147m = true;
            this.f29145k.dispose();
            mo36773a();
        }

        public boolean isDisposed() {
            return this.f29147m;
        }

        public void onComplete() {
            this.f29146l = true;
            mo36775b();
        }

        public void onError(Throwable th) {
            if (this.f29143i.mo37169a(th)) {
                if (!this.f29142h) {
                    mo36773a();
                }
                this.f29146l = true;
                mo36775b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            C10978a<Object> aVar;
            C10978a aVar2 = this.f29144j.get();
            if (aVar2 != null) {
                aVar2.mo36776a();
            }
            try {
                Object apply = this.f29141g.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null SingleSource");
                C10838a0 a0Var = (C10838a0) apply;
                C10978a aVar3 = new C10978a(this);
                do {
                    aVar = this.f29144j.get();
                    if (aVar == f29139n) {
                        return;
                    }
                } while (!this.f29144j.compareAndSet(aVar, aVar3));
                a0Var.mo36638a(aVar3);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29145k.dispose();
                this.f29144j.getAndSet(f29139n);
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29145k, cVar)) {
                this.f29145k = cVar;
                this.f29140f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36774a(C10978a<R> aVar, Throwable th) {
            if (!this.f29144j.compareAndSet(aVar, (Object) null) || !this.f29143i.mo37169a(th)) {
                C11459a.m37531b(th);
                return;
            }
            if (!this.f29142h) {
                this.f29145k.dispose();
                mo36773a();
            }
            mo36775b();
        }
    }
}
