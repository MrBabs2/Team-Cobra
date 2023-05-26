package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11479k;
import p120q.p326a.C11480l;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.y0 */
/* compiled from: ObservableFlatMapMaybe */
public final class C11331y0<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11480l<? extends R>> f30348g;

    /* renamed from: h */
    final boolean f30349h;

    public C11331y0(C11488s<T> sVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
        super(sVar);
        this.f30348g = oVar;
        this.f30349h = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        this.f29150f.subscribe(new C11332a(uVar, this.f30348g, this.f30349h));
    }

    /* renamed from: q.a.d0.e.e.y0$a */
    /* compiled from: ObservableFlatMapMaybe */
    static final class C11332a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f30350f;

        /* renamed from: g */
        final boolean f30351g;

        /* renamed from: h */
        final C10841b f30352h = new C10841b();

        /* renamed from: i */
        final AtomicInteger f30353i = new AtomicInteger(1);

        /* renamed from: j */
        final C11428c f30354j = new C11428c();

        /* renamed from: k */
        final C10861o<? super T, ? extends C11480l<? extends R>> f30355k;

        /* renamed from: l */
        final AtomicReference<C11385c<R>> f30356l = new AtomicReference<>();

        /* renamed from: m */
        C10842c f30357m;

        /* renamed from: n */
        volatile boolean f30358n;

        /* renamed from: q.a.d0.e.e.y0$a$a */
        /* compiled from: ObservableFlatMapMaybe */
        final class C11333a extends AtomicReference<C10842c> implements C11479k<R>, C10842c {
            C11333a() {
            }

            public void dispose() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public boolean isDisposed() {
                return C10867d.m36775a((C10842c) get());
            }

            public void onComplete() {
                C11332a.this.mo37052a(this);
            }

            public void onError(Throwable th) {
                C11332a.this.mo37054a((C11332a<T, R>.C0000a) this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(R r) {
                C11332a.this.mo37053a((C11332a<T, R>.C0000a) this, r);
            }
        }

        C11332a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
            this.f30350f = uVar;
            this.f30355k = oVar;
            this.f30351g = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37053a(C11332a<T, R>.C0000a aVar, R r) {
            this.f30352h.mo36647c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f30350f.onNext(r);
                    if (this.f30353i.decrementAndGet() != 0) {
                        z = false;
                    }
                    C11385c cVar = this.f30356l.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo37056c();
                    }
                    Throwable a = this.f30354j.mo37168a();
                    if (a != null) {
                        this.f30350f.onError(a);
                        return;
                    } else {
                        this.f30350f.onComplete();
                        return;
                    }
                }
            }
            C11385c d = mo37057d();
            synchronized (d) {
                d.offer(r);
            }
            this.f30353i.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo37056c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37055b() {
            if (getAndIncrement() == 0) {
                mo37056c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37056c() {
            C11490u<? super R> uVar = this.f30350f;
            AtomicInteger atomicInteger = this.f30353i;
            AtomicReference<C11385c<R>> atomicReference = this.f30356l;
            int i = 1;
            while (!this.f30358n) {
                if (this.f30351g || ((Throwable) this.f30354j.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C11385c cVar = atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f30354j.mo37168a();
                        if (a != null) {
                            uVar.onError(a);
                            return;
                        } else {
                            uVar.onComplete();
                            return;
                        }
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        uVar.onNext(poll);
                    }
                } else {
                    Throwable a2 = this.f30354j.mo37168a();
                    mo37051a();
                    uVar.onError(a2);
                    return;
                }
            }
            mo37051a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C11385c<R> mo37057d() {
            C11385c<R> cVar;
            do {
                C11385c<R> cVar2 = this.f30356l.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C11385c<>(C11482n.bufferSize());
            } while (!this.f30356l.compareAndSet((Object) null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f30358n = true;
            this.f30357m.dispose();
            this.f30352h.dispose();
        }

        public boolean isDisposed() {
            return this.f30358n;
        }

        public void onComplete() {
            this.f30353i.decrementAndGet();
            mo37055b();
        }

        public void onError(Throwable th) {
            this.f30353i.decrementAndGet();
            if (this.f30354j.mo37169a(th)) {
                if (!this.f30351g) {
                    this.f30352h.dispose();
                }
                mo37055b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f30355k.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null MaybeSource");
                C11480l lVar = (C11480l) apply;
                this.f30353i.getAndIncrement();
                C11333a aVar = new C11333a();
                if (!this.f30358n && this.f30352h.mo36646b(aVar)) {
                    lVar.mo37244a(aVar);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30357m.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30357m, cVar)) {
                this.f30357m = cVar;
                this.f30350f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37054a(C11332a<T, R>.C0000a aVar, Throwable th) {
            this.f30352h.mo36647c(aVar);
            if (this.f30354j.mo37169a(th)) {
                if (!this.f30351g) {
                    this.f30357m.dispose();
                    this.f30352h.dispose();
                }
                this.f30353i.decrementAndGet();
                mo37055b();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37052a(C11332a<T, R>.C0000a aVar) {
            this.f30352h.mo36647c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f30353i.decrementAndGet() != 0) {
                        z = false;
                    }
                    C11385c cVar = this.f30356l.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable a = this.f30354j.mo37168a();
                        if (a != null) {
                            this.f30350f.onError(a);
                            return;
                        } else {
                            this.f30350f.onComplete();
                            return;
                        }
                    } else if (decrementAndGet() != 0) {
                        mo37056c();
                        return;
                    } else {
                        return;
                    }
                }
            }
            this.f30353i.decrementAndGet();
            mo37055b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37051a() {
            C11385c cVar = this.f30356l.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }
}
