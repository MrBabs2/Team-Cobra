package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c0 */
/* compiled from: ObservableDebounce */
public final class C11006c0<T, U> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<U>> f29223g;

    /* renamed from: q.a.d0.e.e.c0$a */
    /* compiled from: ObservableDebounce */
    static final class C11007a<T, U> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29224f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<U>> f29225g;

        /* renamed from: h */
        C10842c f29226h;

        /* renamed from: i */
        final AtomicReference<C10842c> f29227i = new AtomicReference<>();

        /* renamed from: j */
        volatile long f29228j;

        /* renamed from: k */
        boolean f29229k;

        /* renamed from: q.a.d0.e.e.c0$a$a */
        /* compiled from: ObservableDebounce */
        static final class C11008a<T, U> extends C11453c<U> {

            /* renamed from: g */
            final C11007a<T, U> f29230g;

            /* renamed from: h */
            final long f29231h;

            /* renamed from: i */
            final T f29232i;

            /* renamed from: j */
            boolean f29233j;

            /* renamed from: k */
            final AtomicBoolean f29234k = new AtomicBoolean();

            C11008a(C11007a<T, U> aVar, long j, T t) {
                this.f29230g = aVar;
                this.f29231h = j;
                this.f29232i = t;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo36805b() {
                if (this.f29234k.compareAndSet(false, true)) {
                    this.f29230g.mo36804a(this.f29231h, this.f29232i);
                }
            }

            public void onComplete() {
                if (!this.f29233j) {
                    this.f29233j = true;
                    mo36805b();
                }
            }

            public void onError(Throwable th) {
                if (this.f29233j) {
                    C11459a.m37531b(th);
                    return;
                }
                this.f29233j = true;
                this.f29230g.onError(th);
            }

            public void onNext(U u) {
                if (!this.f29233j) {
                    this.f29233j = true;
                    dispose();
                    mo36805b();
                }
            }
        }

        C11007a(C11490u<? super T> uVar, C10861o<? super T, ? extends C11488s<U>> oVar) {
            this.f29224f = uVar;
            this.f29225g = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36804a(long j, T t) {
            if (j == this.f29228j) {
                this.f29224f.onNext(t);
            }
        }

        public void dispose() {
            this.f29226h.dispose();
            C10867d.m36773a(this.f29227i);
        }

        public boolean isDisposed() {
            return this.f29226h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29229k) {
                this.f29229k = true;
                C10842c cVar = this.f29227i.get();
                if (cVar != C10867d.DISPOSED) {
                    C11008a aVar = (C11008a) cVar;
                    if (aVar != null) {
                        aVar.mo36805b();
                    }
                    C10867d.m36773a(this.f29227i);
                    this.f29224f.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            C10867d.m36773a(this.f29227i);
            this.f29224f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29229k) {
                long j = this.f29228j + 1;
                this.f29228j = j;
                C10842c cVar = this.f29227i.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                try {
                    Object apply = this.f29225g.apply(t);
                    C10910b.m36861a(apply, "The ObservableSource supplied is null");
                    C11488s sVar = (C11488s) apply;
                    C11008a aVar = new C11008a(this, j, t);
                    if (this.f29227i.compareAndSet(cVar, aVar)) {
                        sVar.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    dispose();
                    this.f29224f.onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29226h, cVar)) {
                this.f29226h = cVar;
                this.f29224f.onSubscribe(this);
            }
        }
    }

    public C11006c0(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<U>> oVar) {
        super(sVar);
        this.f29223g = oVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11007a(new C11455e(uVar), this.f29223g));
    }
}
