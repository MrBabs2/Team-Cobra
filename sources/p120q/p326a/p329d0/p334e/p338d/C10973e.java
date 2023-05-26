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
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.e */
/* compiled from: ObservableSwitchMapMaybe */
public final class C10973e<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11482n<T> f29122f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C11480l<? extends R>> f29123g;

    /* renamed from: h */
    final boolean f29124h;

    public C10973e(C11482n<T> nVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
        this.f29122f = nVar;
        this.f29123g = oVar;
        this.f29124h = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        if (!C10979g.m36947a((Object) this.f29122f, this.f29123g, uVar)) {
            this.f29122f.subscribe(new C10974a(uVar, this.f29123g, this.f29124h));
        }
    }

    /* renamed from: q.a.d0.e.d.e$a */
    /* compiled from: ObservableSwitchMapMaybe */
    static final class C10974a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: n */
        static final C10975a<Object> f29125n = new C10975a<>((C10974a) null);

        /* renamed from: f */
        final C11490u<? super R> f29126f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11480l<? extends R>> f29127g;

        /* renamed from: h */
        final boolean f29128h;

        /* renamed from: i */
        final C11428c f29129i = new C11428c();

        /* renamed from: j */
        final AtomicReference<C10975a<R>> f29130j = new AtomicReference<>();

        /* renamed from: k */
        C10842c f29131k;

        /* renamed from: l */
        volatile boolean f29132l;

        /* renamed from: m */
        volatile boolean f29133m;

        /* renamed from: q.a.d0.e.d.e$a$a */
        /* compiled from: ObservableSwitchMapMaybe */
        static final class C10975a<R> extends AtomicReference<C10842c> implements C11479k<R> {

            /* renamed from: f */
            final C10974a<?, R> f29134f;

            /* renamed from: g */
            volatile R f29135g;

            C10975a(C10974a<?, R> aVar) {
                this.f29134f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36772a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                this.f29134f.mo36769a(this);
            }

            public void onError(Throwable th) {
                this.f29134f.mo36770a(this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(R r) {
                this.f29135g = r;
                this.f29134f.mo36771b();
            }
        }

        C10974a(C11490u<? super R> uVar, C10861o<? super T, ? extends C11480l<? extends R>> oVar, boolean z) {
            this.f29126f = uVar;
            this.f29127g = oVar;
            this.f29128h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36768a() {
            C10975a<Object> andSet = this.f29130j.getAndSet(f29125n);
            if (andSet != null && andSet != f29125n) {
                andSet.mo36772a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36771b() {
            if (getAndIncrement() == 0) {
                C11490u<? super R> uVar = this.f29126f;
                C11428c cVar = this.f29129i;
                AtomicReference<C10975a<R>> atomicReference = this.f29130j;
                int i = 1;
                while (!this.f29133m) {
                    if (cVar.get() == null || this.f29128h) {
                        boolean z = this.f29132l;
                        C10975a aVar = atomicReference.get();
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
                        } else if (z2 || aVar.f29135g == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, (Object) null);
                            uVar.onNext(aVar.f29135g);
                        }
                    } else {
                        uVar.onError(cVar.mo37168a());
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f29133m = true;
            this.f29131k.dispose();
            mo36768a();
        }

        public boolean isDisposed() {
            return this.f29133m;
        }

        public void onComplete() {
            this.f29132l = true;
            mo36771b();
        }

        public void onError(Throwable th) {
            if (this.f29129i.mo37169a(th)) {
                if (!this.f29128h) {
                    mo36768a();
                }
                this.f29132l = true;
                mo36771b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            C10975a<Object> aVar;
            C10975a aVar2 = this.f29130j.get();
            if (aVar2 != null) {
                aVar2.mo36772a();
            }
            try {
                Object apply = this.f29127g.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null MaybeSource");
                C11480l lVar = (C11480l) apply;
                C10975a aVar3 = new C10975a(this);
                do {
                    aVar = this.f29130j.get();
                    if (aVar == f29125n) {
                        return;
                    }
                } while (!this.f29130j.compareAndSet(aVar, aVar3));
                lVar.mo37244a(aVar3);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29131k.dispose();
                this.f29130j.getAndSet(f29125n);
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29131k, cVar)) {
                this.f29131k = cVar;
                this.f29126f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36770a(C10975a<R> aVar, Throwable th) {
            if (!this.f29130j.compareAndSet(aVar, (Object) null) || !this.f29129i.mo37169a(th)) {
                C11459a.m37531b(th);
                return;
            }
            if (!this.f29128h) {
                this.f29131k.dispose();
                mo36768a();
            }
            mo36771b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36769a(C10975a<R> aVar) {
            if (this.f29130j.compareAndSet(aVar, (Object) null)) {
                mo36771b();
            }
        }
    }
}
