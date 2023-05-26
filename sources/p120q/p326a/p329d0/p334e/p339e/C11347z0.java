package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.z0 */
/* compiled from: ObservableFlatMapSingle */
public final class C11347z0<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C10838a0<? extends R>> f30390g;

    /* renamed from: h */
    final boolean f30391h;

    public C11347z0(C11488s<T> sVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
        super(sVar);
        this.f30390g = oVar;
        this.f30391h = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        this.f29150f.subscribe(new C11348a(uVar, this.f30390g, this.f30391h));
    }

    /* renamed from: q.a.d0.e.e.z0$a */
    /* compiled from: ObservableFlatMapSingle */
    static final class C11348a<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f30392f;

        /* renamed from: g */
        final boolean f30393g;

        /* renamed from: h */
        final C10841b f30394h = new C10841b();

        /* renamed from: i */
        final AtomicInteger f30395i = new AtomicInteger(1);

        /* renamed from: j */
        final C11428c f30396j = new C11428c();

        /* renamed from: k */
        final C10861o<? super T, ? extends C10838a0<? extends R>> f30397k;

        /* renamed from: l */
        final AtomicReference<C11385c<R>> f30398l = new AtomicReference<>();

        /* renamed from: m */
        C10842c f30399m;

        /* renamed from: n */
        volatile boolean f30400n;

        /* renamed from: q.a.d0.e.e.z0$a$a */
        /* compiled from: ObservableFlatMapSingle */
        final class C11349a extends AtomicReference<C10842c> implements C11498y<R>, C10842c {
            C11349a() {
            }

            public void dispose() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public boolean isDisposed() {
                return C10867d.m36775a((C10842c) get());
            }

            public void onError(Throwable th) {
                C11348a.this.mo37067a((C11348a<T, R>.C0000a) this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }

            public void onSuccess(R r) {
                C11348a.this.mo37066a((C11348a<T, R>.C0000a) this, r);
            }
        }

        C11348a(C11490u<? super R> uVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, boolean z) {
            this.f30392f = uVar;
            this.f30397k = oVar;
            this.f30393g = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37066a(C11348a<T, R>.C0000a aVar, R r) {
            this.f30394h.mo36647c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f30392f.onNext(r);
                    if (this.f30395i.decrementAndGet() != 0) {
                        z = false;
                    }
                    C11385c cVar = this.f30398l.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo37069c();
                    }
                    Throwable a = this.f30396j.mo37168a();
                    if (a != null) {
                        this.f30392f.onError(a);
                        return;
                    } else {
                        this.f30392f.onComplete();
                        return;
                    }
                }
            }
            C11385c d = mo37070d();
            synchronized (d) {
                d.offer(r);
            }
            this.f30395i.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo37069c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37068b() {
            if (getAndIncrement() == 0) {
                mo37069c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37069c() {
            C11490u<? super R> uVar = this.f30392f;
            AtomicInteger atomicInteger = this.f30395i;
            AtomicReference<C11385c<R>> atomicReference = this.f30398l;
            int i = 1;
            while (!this.f30400n) {
                if (this.f30393g || ((Throwable) this.f30396j.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C11385c cVar = atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f30396j.mo37168a();
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
                    Throwable a2 = this.f30396j.mo37168a();
                    mo37065a();
                    uVar.onError(a2);
                    return;
                }
            }
            mo37065a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C11385c<R> mo37070d() {
            C11385c<R> cVar;
            do {
                C11385c<R> cVar2 = this.f30398l.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C11385c<>(C11482n.bufferSize());
            } while (!this.f30398l.compareAndSet((Object) null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f30400n = true;
            this.f30399m.dispose();
            this.f30394h.dispose();
        }

        public boolean isDisposed() {
            return this.f30400n;
        }

        public void onComplete() {
            this.f30395i.decrementAndGet();
            mo37068b();
        }

        public void onError(Throwable th) {
            this.f30395i.decrementAndGet();
            if (this.f30396j.mo37169a(th)) {
                if (!this.f30393g) {
                    this.f30394h.dispose();
                }
                mo37068b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f30397k.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null SingleSource");
                C10838a0 a0Var = (C10838a0) apply;
                this.f30395i.getAndIncrement();
                C11349a aVar = new C11349a();
                if (!this.f30400n && this.f30394h.mo36646b(aVar)) {
                    a0Var.mo36638a(aVar);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30399m.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30399m, cVar)) {
                this.f30399m = cVar;
                this.f30392f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37067a(C11348a<T, R>.C0000a aVar, Throwable th) {
            this.f30394h.mo36647c(aVar);
            if (this.f30396j.mo37169a(th)) {
                if (!this.f30393g) {
                    this.f30399m.dispose();
                    this.f30394h.dispose();
                }
                this.f30395i.decrementAndGet();
                mo37068b();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37065a() {
            C11385c cVar = this.f30398l.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }
}
