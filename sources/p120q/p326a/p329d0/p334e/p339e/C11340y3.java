package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p339e.C11355z3;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.y3 */
/* compiled from: ObservableTimeout */
public final class C11340y3<T, U, V> extends C10980a<T, T> {

    /* renamed from: g */
    final C11488s<U> f30372g;

    /* renamed from: h */
    final C10861o<? super T, ? extends C11488s<V>> f30373h;

    /* renamed from: i */
    final C11488s<? extends T> f30374i;

    /* renamed from: q.a.d0.e.e.y3$a */
    /* compiled from: ObservableTimeout */
    static final class C11341a extends AtomicReference<C10842c> implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11344d f30375f;

        /* renamed from: g */
        final long f30376g;

        C11341a(long j, C11344d dVar) {
            this.f30376g = j;
            this.f30375f = dVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f30375f.mo37061a(this.f30376g);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f30375f.mo37062a(this.f30376g, th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(Object obj) {
            C10842c cVar = (C10842c) get();
            if (cVar != C10867d.DISPOSED) {
                cVar.dispose();
                lazySet(C10867d.DISPOSED);
                this.f30375f.mo37061a(this.f30376g);
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.y3$d */
    /* compiled from: ObservableTimeout */
    interface C11344d extends C11355z3.C11359d {
        /* renamed from: a */
        void mo37062a(long j, Throwable th);
    }

    public C11340y3(C11482n<T> nVar, C11488s<U> sVar, C10861o<? super T, ? extends C11488s<V>> oVar, C11488s<? extends T> sVar2) {
        super(nVar);
        this.f30372g = sVar;
        this.f30373h = oVar;
        this.f30374i = sVar2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        if (this.f30374i == null) {
            C11343c cVar = new C11343c(uVar, this.f30373h);
            uVar.onSubscribe(cVar);
            cVar.mo37064a((C11488s<?>) this.f30372g);
            this.f29150f.subscribe(cVar);
            return;
        }
        C11342b bVar = new C11342b(uVar, this.f30373h, this.f30374i);
        uVar.onSubscribe(bVar);
        bVar.mo37063a((C11488s<?>) this.f30372g);
        this.f29150f.subscribe(bVar);
    }

    /* renamed from: q.a.d0.e.e.y3$b */
    /* compiled from: ObservableTimeout */
    static final class C11342b<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c, C11344d {

        /* renamed from: f */
        final C11490u<? super T> f30377f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<?>> f30378g;

        /* renamed from: h */
        final C10871h f30379h = new C10871h();

        /* renamed from: i */
        final AtomicLong f30380i;

        /* renamed from: j */
        final AtomicReference<C10842c> f30381j;

        /* renamed from: k */
        C11488s<? extends T> f30382k;

        C11342b(C11490u<? super T> uVar, C10861o<? super T, ? extends C11488s<?>> oVar, C11488s<? extends T> sVar) {
            this.f30377f = uVar;
            this.f30378g = oVar;
            this.f30382k = sVar;
            this.f30380i = new AtomicLong();
            this.f30381j = new AtomicReference<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37063a(C11488s<?> sVar) {
            if (sVar != null) {
                C11341a aVar = new C11341a(0, this);
                if (this.f30379h.mo36672a(aVar)) {
                    sVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            C10867d.m36773a(this.f30381j);
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f30379h.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            if (this.f30380i.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30379h.dispose();
                this.f30377f.onComplete();
                this.f30379h.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f30380i.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30379h.dispose();
                this.f30377f.onError(th);
                this.f30379h.dispose();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            long j = this.f30380i.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f30380i.compareAndSet(j, j2)) {
                    C10842c cVar = (C10842c) this.f30379h.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f30377f.onNext(t);
                    try {
                        Object apply = this.f30378g.apply(t);
                        C10910b.m36861a(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        C11488s sVar = (C11488s) apply;
                        C11341a aVar = new C11341a(j2, this);
                        if (this.f30379h.mo36672a(aVar)) {
                            sVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        this.f30381j.get().dispose();
                        this.f30380i.getAndSet(Long.MAX_VALUE);
                        this.f30377f.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30381j, cVar);
        }

        /* renamed from: a */
        public void mo37061a(long j) {
            if (this.f30380i.compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a(this.f30381j);
                C11488s<? extends T> sVar = this.f30382k;
                this.f30382k = null;
                sVar.subscribe(new C11355z3.C11356a(this.f30377f, this));
            }
        }

        /* renamed from: a */
        public void mo37062a(long j, Throwable th) {
            if (this.f30380i.compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a((AtomicReference<C10842c>) this);
                this.f30377f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }
    }

    /* renamed from: q.a.d0.e.e.y3$c */
    /* compiled from: ObservableTimeout */
    static final class C11343c<T> extends AtomicLong implements C11490u<T>, C10842c, C11344d {

        /* renamed from: f */
        final C11490u<? super T> f30383f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<?>> f30384g;

        /* renamed from: h */
        final C10871h f30385h = new C10871h();

        /* renamed from: i */
        final AtomicReference<C10842c> f30386i = new AtomicReference<>();

        C11343c(C11490u<? super T> uVar, C10861o<? super T, ? extends C11488s<?>> oVar) {
            this.f30383f = uVar;
            this.f30384g = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37064a(C11488s<?> sVar) {
            if (sVar != null) {
                C11341a aVar = new C11341a(0, this);
                if (this.f30385h.mo36672a(aVar)) {
                    sVar.subscribe(aVar);
                }
            }
        }

        public void dispose() {
            C10867d.m36773a(this.f30386i);
            this.f30385h.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30386i.get());
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30385h.dispose();
                this.f30383f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30385h.dispose();
                this.f30383f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    C10842c cVar = (C10842c) this.f30385h.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f30383f.onNext(t);
                    try {
                        Object apply = this.f30384g.apply(t);
                        C10910b.m36861a(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        C11488s sVar = (C11488s) apply;
                        C11341a aVar = new C11341a(j2, this);
                        if (this.f30385h.mo36672a(aVar)) {
                            sVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        this.f30386i.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f30383f.onError(th);
                    }
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30386i, cVar);
        }

        /* renamed from: a */
        public void mo37061a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a(this.f30386i);
                this.f30383f.onError(new TimeoutException());
            }
        }

        /* renamed from: a */
        public void mo37062a(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a(this.f30386i);
                this.f30383f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }
    }
}
