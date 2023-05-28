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
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.c */
/* compiled from: ObservableConcatMapSingle */
public final class C10967c<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11482n<T> f29094f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C10838a0<? extends R>> f29095g;

    /* renamed from: h */
    final C11434i f29096h;

    /* renamed from: i */
    final int f29097i;

    public C10967c(C11482n<T> nVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, C11434i iVar, int i) {
        this.f29094f = nVar;
        this.f29095g = oVar;
        this.f29096h = iVar;
        this.f29097i = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        if (!C10979g.m36948b(this.f29094f, this.f29095g, uVar)) {
            this.f29094f.subscribe(new C10968a(uVar, this.f29095g, this.f29097i, this.f29096h));
        }
    }

    /* renamed from: q.a.d0.e.d.c$a */
    /* compiled from: ObservableConcatMapSingle */
    static final class C10968a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29098f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C10838a0<? extends R>> f29099g;

        /* renamed from: h */
        final C11428c f29100h = new C11428c();

        /* renamed from: i */
        final C10969a<R> f29101i = new C10969a<>(this);

        /* renamed from: j */
        final C10917f<T> f29102j;

        /* renamed from: k */
        final C11434i f29103k;

        /* renamed from: l */
        C10842c f29104l;

        /* renamed from: m */
        volatile boolean f29105m;

        /* renamed from: n */
        volatile boolean f29106n;

        /* renamed from: o */
        R f29107o;

        /* renamed from: p */
        volatile int f29108p;

        /* renamed from: q.a.d0.e.d.c$a$a */
        /* compiled from: ObservableConcatMapSingle */
        static final class C10969a<R> extends AtomicReference<C10842c> implements C11498y<R> {

            /* renamed from: f */
            final C10968a<?, R> f29109f;

            C10969a(C10968a<?, R> aVar) {
                this.f29109f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36763a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onError(Throwable th) {
                this.f29109f.mo36762a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            }

            public void onSuccess(R r) {
                this.f29109f.mo36761a(r);
            }
        }

        C10968a(C11490u<? super R> uVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, int i, C11434i iVar) {
            this.f29098f = uVar;
            this.f29099g = oVar;
            this.f29103k = iVar;
            this.f29102j = new C11385c(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36761a(R r) {
            this.f29107o = r;
            this.f29108p = 2;
            mo36760a();
        }

        public void dispose() {
            this.f29106n = true;
            this.f29104l.dispose();
            this.f29101i.mo36763a();
            if (getAndIncrement() == 0) {
                this.f29102j.clear();
                this.f29107o = null;
            }
        }

        public boolean isDisposed() {
            return this.f29106n;
        }

        public void onComplete() {
            this.f29105m = true;
            mo36760a();
        }

        public void onError(Throwable th) {
            if (this.f29100h.mo37169a(th)) {
                if (this.f29103k == C11434i.IMMEDIATE) {
                    this.f29101i.mo36763a();
                }
                this.f29105m = true;
                mo36760a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            this.f29102j.offer(t);
            mo36760a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29104l, cVar)) {
                this.f29104l = cVar;
                this.f29098f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36762a(Throwable th) {
            if (this.f29100h.mo37169a(th)) {
                if (this.f29103k != C11434i.END) {
                    this.f29104l.dispose();
                }
                this.f29108p = 0;
                mo36760a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36760a() {
            if (getAndIncrement() == 0) {
                C11490u<? super R> uVar = this.f29098f;
                C11434i iVar = this.f29103k;
                C10917f<T> fVar = this.f29102j;
                C11428c cVar = this.f29100h;
                int i = 1;
                while (true) {
                    if (this.f29106n) {
                        fVar.clear();
                        this.f29107o = null;
                    } else {
                        int i2 = this.f29108p;
                        if (cVar.get() == null || !(iVar == C11434i.IMMEDIATE || (iVar == C11434i.BOUNDARY && i2 == 0))) {
                            boolean z = false;
                            if (i2 == 0) {
                                boolean z2 = this.f29105m;
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
                                        Object apply = this.f29099g.apply(poll);
                                        C10910b.m36861a(apply, "The mapper returned a null SingleSource");
                                        C10838a0 a0Var = (C10838a0) apply;
                                        this.f29108p = 1;
                                        a0Var.mo36638a(this.f29101i);
                                    } catch (Throwable th) {
                                        C9034a.m29708a(th);
                                        this.f29104l.dispose();
                                        fVar.clear();
                                        cVar.mo37169a(th);
                                        uVar.onError(cVar.mo37168a());
                                        return;
                                    }
                                }
                            } else if (i2 == 2) {
                                R r = this.f29107o;
                                this.f29107o = null;
                                uVar.onNext(r);
                                this.f29108p = 0;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                fVar.clear();
                this.f29107o = null;
                uVar.onError(cVar.mo37168a());
            }
        }
    }
}
