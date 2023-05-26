package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.u */
/* compiled from: ObservableConcatMap */
public final class C11278u<T, U> extends C10980a<T, U> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<? extends U>> f30151g;

    /* renamed from: h */
    final int f30152h;

    /* renamed from: i */
    final C11434i f30153i;

    /* renamed from: q.a.d0.e.e.u$a */
    /* compiled from: ObservableConcatMap */
    static final class C11279a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f30154f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends R>> f30155g;

        /* renamed from: h */
        final int f30156h;

        /* renamed from: i */
        final C11428c f30157i = new C11428c();

        /* renamed from: j */
        final C11280a<R> f30158j;

        /* renamed from: k */
        final boolean f30159k;

        /* renamed from: l */
        C10918g<T> f30160l;

        /* renamed from: m */
        C10842c f30161m;

        /* renamed from: n */
        volatile boolean f30162n;

        /* renamed from: o */
        volatile boolean f30163o;

        /* renamed from: p */
        volatile boolean f30164p;

        /* renamed from: q */
        int f30165q;

        /* renamed from: q.a.d0.e.e.u$a$a */
        /* compiled from: ObservableConcatMap */
        static final class C11280a<R> extends AtomicReference<C10842c> implements C11490u<R> {

            /* renamed from: f */
            final C11490u<? super R> f30166f;

            /* renamed from: g */
            final C11279a<?, R> f30167g;

            C11280a(C11490u<? super R> uVar, C11279a<?, R> aVar) {
                this.f30166f = uVar;
                this.f30167g = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo37012a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                C11279a<?, R> aVar = this.f30167g;
                aVar.f30162n = false;
                aVar.mo37011a();
            }

            public void onError(Throwable th) {
                C11279a<?, R> aVar = this.f30167g;
                if (aVar.f30157i.mo37169a(th)) {
                    if (!aVar.f30159k) {
                        aVar.f30161m.dispose();
                    }
                    aVar.f30162n = false;
                    aVar.mo37011a();
                    return;
                }
                C11459a.m37531b(th);
            }

            public void onNext(R r) {
                this.f30166f.onNext(r);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            }
        }

        C11279a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, boolean z) {
            this.f30154f = uVar;
            this.f30155g = oVar;
            this.f30156h = i;
            this.f30159k = z;
            this.f30158j = new C11280a<>(uVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37011a() {
            if (getAndIncrement() == 0) {
                C11490u<? super R> uVar = this.f30154f;
                C10918g<T> gVar = this.f30160l;
                C11428c cVar = this.f30157i;
                while (true) {
                    if (!this.f30162n) {
                        if (this.f30164p) {
                            gVar.clear();
                            return;
                        } else if (this.f30159k || ((Throwable) cVar.get()) == null) {
                            boolean z = this.f30163o;
                            try {
                                T poll = gVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.f30164p = true;
                                    Throwable a = cVar.mo37168a();
                                    if (a != null) {
                                        uVar.onError(a);
                                        return;
                                    } else {
                                        uVar.onComplete();
                                        return;
                                    }
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f30155g.apply(poll);
                                        C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                                        C11488s sVar = (C11488s) apply;
                                        if (sVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) sVar).call();
                                                if (call != null && !this.f30164p) {
                                                    uVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C9034a.m29708a(th);
                                                cVar.mo37169a(th);
                                            }
                                        } else {
                                            this.f30162n = true;
                                            sVar.subscribe(this.f30158j);
                                        }
                                    } catch (Throwable th2) {
                                        C9034a.m29708a(th2);
                                        this.f30164p = true;
                                        this.f30161m.dispose();
                                        gVar.clear();
                                        cVar.mo37169a(th2);
                                        uVar.onError(cVar.mo37168a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C9034a.m29708a(th3);
                                this.f30164p = true;
                                this.f30161m.dispose();
                                cVar.mo37169a(th3);
                                uVar.onError(cVar.mo37168a());
                                return;
                            }
                        } else {
                            gVar.clear();
                            this.f30164p = true;
                            uVar.onError(cVar.mo37168a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f30164p = true;
            this.f30161m.dispose();
            this.f30158j.mo37012a();
        }

        public boolean isDisposed() {
            return this.f30164p;
        }

        public void onComplete() {
            this.f30163o = true;
            mo37011a();
        }

        public void onError(Throwable th) {
            if (this.f30157i.mo37169a(th)) {
                this.f30163o = true;
                mo37011a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            if (this.f30165q == 0) {
                this.f30160l.offer(t);
            }
            mo37011a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30161m, cVar)) {
                this.f30161m = cVar;
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(3);
                    if (a == 1) {
                        this.f30165q = a;
                        this.f30160l = bVar;
                        this.f30163o = true;
                        this.f30154f.onSubscribe(this);
                        mo37011a();
                        return;
                    } else if (a == 2) {
                        this.f30165q = a;
                        this.f30160l = bVar;
                        this.f30154f.onSubscribe(this);
                        return;
                    }
                }
                this.f30160l = new C11385c(this.f30156h);
                this.f30154f.onSubscribe(this);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.u$b */
    /* compiled from: ObservableConcatMap */
    static final class C11281b<T, U> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super U> f30168f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends U>> f30169g;

        /* renamed from: h */
        final C11282a<U> f30170h;

        /* renamed from: i */
        final int f30171i;

        /* renamed from: j */
        C10918g<T> f30172j;

        /* renamed from: k */
        C10842c f30173k;

        /* renamed from: l */
        volatile boolean f30174l;

        /* renamed from: m */
        volatile boolean f30175m;

        /* renamed from: n */
        volatile boolean f30176n;

        /* renamed from: o */
        int f30177o;

        /* renamed from: q.a.d0.e.e.u$b$a */
        /* compiled from: ObservableConcatMap */
        static final class C11282a<U> extends AtomicReference<C10842c> implements C11490u<U> {

            /* renamed from: f */
            final C11490u<? super U> f30178f;

            /* renamed from: g */
            final C11281b<?, ?> f30179g;

            C11282a(C11490u<? super U> uVar, C11281b<?, ?> bVar) {
                this.f30178f = uVar;
                this.f30179g = bVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo37015a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                this.f30179g.mo37014b();
            }

            public void onError(Throwable th) {
                this.f30179g.dispose();
                this.f30178f.onError(th);
            }

            public void onNext(U u) {
                this.f30178f.onNext(u);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            }
        }

        C11281b(C11490u<? super U> uVar, C10861o<? super T, ? extends C11488s<? extends U>> oVar, int i) {
            this.f30168f = uVar;
            this.f30169g = oVar;
            this.f30171i = i;
            this.f30170h = new C11282a<>(uVar, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37013a() {
            if (getAndIncrement() == 0) {
                while (!this.f30175m) {
                    if (!this.f30174l) {
                        boolean z = this.f30176n;
                        try {
                            T poll = this.f30172j.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f30175m = true;
                                this.f30168f.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f30169g.apply(poll);
                                    C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                                    C11488s sVar = (C11488s) apply;
                                    this.f30174l = true;
                                    sVar.subscribe(this.f30170h);
                                } catch (Throwable th) {
                                    C9034a.m29708a(th);
                                    dispose();
                                    this.f30172j.clear();
                                    this.f30168f.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C9034a.m29708a(th2);
                            dispose();
                            this.f30172j.clear();
                            this.f30168f.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f30172j.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37014b() {
            this.f30174l = false;
            mo37013a();
        }

        public void dispose() {
            this.f30175m = true;
            this.f30170h.mo37015a();
            this.f30173k.dispose();
            if (getAndIncrement() == 0) {
                this.f30172j.clear();
            }
        }

        public boolean isDisposed() {
            return this.f30175m;
        }

        public void onComplete() {
            if (!this.f30176n) {
                this.f30176n = true;
                mo37013a();
            }
        }

        public void onError(Throwable th) {
            if (this.f30176n) {
                C11459a.m37531b(th);
                return;
            }
            this.f30176n = true;
            dispose();
            this.f30168f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30176n) {
                if (this.f30177o == 0) {
                    this.f30172j.offer(t);
                }
                mo37013a();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30173k, cVar)) {
                this.f30173k = cVar;
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(3);
                    if (a == 1) {
                        this.f30177o = a;
                        this.f30172j = bVar;
                        this.f30176n = true;
                        this.f30168f.onSubscribe(this);
                        mo37013a();
                        return;
                    } else if (a == 2) {
                        this.f30177o = a;
                        this.f30172j = bVar;
                        this.f30168f.onSubscribe(this);
                        return;
                    }
                }
                this.f30172j = new C11385c(this.f30171i);
                this.f30168f.onSubscribe(this);
            }
        }
    }

    public C11278u(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<? extends U>> oVar, int i, C11434i iVar) {
        super(sVar);
        this.f30151g = oVar;
        this.f30153i = iVar;
        this.f30152h = Math.max(8, i);
    }

    public void subscribeActual(C11490u<? super U> uVar) {
        if (!C11337y2.m37296a(this.f29150f, uVar, this.f30151g)) {
            if (this.f30153i == C11434i.IMMEDIATE) {
                this.f29150f.subscribe(new C11281b(new C11455e(uVar), this.f30151g, this.f30152h));
            } else {
                this.f29150f.subscribe(new C11279a(uVar, this.f30151g, this.f30152h, this.f30153i == C11434i.END));
            }
        }
    }
}
