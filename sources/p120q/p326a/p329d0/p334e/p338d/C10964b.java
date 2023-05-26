package p120q.p326a.p329d0.p334e.p338d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11479k;
import p120q.p326a.C11480l;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.b */
/* compiled from: ObservableConcatMapMaybe */
public final class C10964b<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11482n<T> f29078f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C11480l<? extends R>> f29079g;

    /* renamed from: h */
    final C11434i f29080h;

    /* renamed from: i */
    final int f29081i;

    public C10964b(C11482n<T> nVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, C11434i iVar, int i) {
        this.f29078f = nVar;
        this.f29079g = oVar;
        this.f29080h = iVar;
        this.f29081i = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        if (!C10979g.m36947a((Object) this.f29078f, this.f29079g, uVar)) {
            this.f29078f.subscribe(new C10965a(uVar, this.f29079g, this.f29081i, this.f29080h));
        }
    }

    /* renamed from: q.a.d0.e.d.b$a */
    /* compiled from: ObservableConcatMapMaybe */
    static final class C10965a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29082f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11480l<? extends R>> f29083g;

        /* renamed from: h */
        final C11428c f29084h = new C11428c();

        /* renamed from: i */
        final C10966a<R> f29085i = new C10966a<>(this);

        /* renamed from: j */
        final C10917f<T> f29086j;

        /* renamed from: k */
        final C11434i f29087k;

        /* renamed from: l */
        C10842c f29088l;

        /* renamed from: m */
        volatile boolean f29089m;

        /* renamed from: n */
        volatile boolean f29090n;

        /* renamed from: o */
        R f29091o;

        /* renamed from: p */
        volatile int f29092p;

        /* renamed from: q.a.d0.e.d.b$a$a */
        /* compiled from: ObservableConcatMapMaybe */
        static final class C10966a<R> extends AtomicReference<C10842c> implements C11479k<R> {

            /* renamed from: f */
            final C10965a<?, R> f29093f;

            C10966a(C10965a<?, R> aVar) {
                this.f29093f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36759a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                this.f29093f.mo36758b();
            }

            public void onError(Throwable th) {
                this.f29093f.mo36757a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            }

            public void onSuccess(R r) {
                this.f29093f.mo36756a(r);
            }
        }

        C10965a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, int i, C11434i iVar) {
            this.f29082f = uVar;
            this.f29083g = oVar;
            this.f29087k = iVar;
            this.f29086j = new C11385c(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36756a(R r) {
            this.f29091o = r;
            this.f29092p = 2;
            mo36755a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36758b() {
            this.f29092p = 0;
            mo36755a();
        }

        public void dispose() {
            this.f29090n = true;
            this.f29088l.dispose();
            this.f29085i.mo36759a();
            if (getAndIncrement() == 0) {
                this.f29086j.clear();
                this.f29091o = null;
            }
        }

        public boolean isDisposed() {
            return this.f29090n;
        }

        public void onComplete() {
            this.f29089m = true;
            mo36755a();
        }

        public void onError(Throwable th) {
            if (this.f29084h.mo37169a(th)) {
                if (this.f29087k == C11434i.IMMEDIATE) {
                    this.f29085i.mo36759a();
                }
                this.f29089m = true;
                mo36755a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            this.f29086j.offer(t);
            mo36755a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29088l, cVar)) {
                this.f29088l = cVar;
                this.f29082f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36757a(Throwable th) {
            if (this.f29084h.mo37169a(th)) {
                if (this.f29087k != C11434i.END) {
                    this.f29088l.dispose();
                }
                this.f29092p = 0;
                mo36755a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36755a() {
            if (getAndIncrement() == 0) {
                C11490u<? super R> uVar = this.f29082f;
                C11434i iVar = this.f29087k;
                C10917f<T> fVar = this.f29086j;
                C11428c cVar = this.f29084h;
                int i = 1;
                while (true) {
                    if (this.f29090n) {
                        fVar.clear();
                        this.f29091o = null;
                    } else {
                        int i2 = this.f29092p;
                        if (cVar.get() == null || !(iVar == C11434i.IMMEDIATE || (iVar == C11434i.BOUNDARY && i2 == 0))) {
                            boolean z = false;
                            if (i2 == 0) {
                                boolean z2 = this.f29089m;
                                T poll = fVar.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    Throwable a = cVar.mo37168a();
                                    if (a == null) {
                                        uVar.onComplete();
                                        return;
                                    } else {
                                        uVar.onError(a);
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        Object apply = this.f29083g.apply(poll);
                                        C10910b.m36861a(apply, "The mapper returned a null MaybeSource");
                                        C11480l lVar = (C11480l) apply;
                                        this.f29092p = 1;
                                        lVar.mo37244a(this.f29085i);
                                    } catch (Throwable th) {
                                        C9034a.m29708a(th);
                                        this.f29088l.dispose();
                                        fVar.clear();
                                        cVar.mo37169a(th);
                                        uVar.onError(cVar.mo37168a());
                                        return;
                                    }
                                }
                            } else if (i2 == 2) {
                                R r = this.f29091o;
                                this.f29091o = null;
                                uVar.onNext(r);
                                this.f29092p = 0;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                fVar.clear();
                this.f29091o = null;
                uVar.onError(cVar.mo37168a());
            }
        }
    }
}
