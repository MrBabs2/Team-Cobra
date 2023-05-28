package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10920b;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.w0 */
/* compiled from: ObservableFlatMapCompletable */
public final class C11304w0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11450f> f30266g;

    /* renamed from: h */
    final boolean f30267h;

    public C11304w0(C11488s<T> sVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
        super(sVar);
        this.f30266g = oVar;
        this.f30267h = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11305a(uVar, this.f30266g, this.f30267h));
    }

    /* renamed from: q.a.d0.e.e.w0$a */
    /* compiled from: ObservableFlatMapCompletable */
    static final class C11305a<T> extends C10920b<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f30268f;

        /* renamed from: g */
        final C11428c f30269g = new C11428c();

        /* renamed from: h */
        final C10861o<? super T, ? extends C11450f> f30270h;

        /* renamed from: i */
        final boolean f30271i;

        /* renamed from: j */
        final C10841b f30272j = new C10841b();

        /* renamed from: k */
        C10842c f30273k;

        /* renamed from: l */
        volatile boolean f30274l;

        /* renamed from: q.a.d0.e.e.w0$a$a */
        /* compiled from: ObservableFlatMapCompletable */
        final class C11306a extends AtomicReference<C10842c> implements C10863d, C10842c {
            C11306a() {
            }

            public void dispose() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public boolean isDisposed() {
                return C10867d.m36775a((C10842c) get());
            }

            public void onComplete() {
                C11305a.this.mo37034a((C11305a<T>.C0000a) this);
            }

            public void onError(Throwable th) {
                C11305a.this.mo37035a(this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11305a(C11490u<? super T> uVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
            this.f30268f = uVar;
            this.f30270h = oVar;
            this.f30271i = z;
            lazySet(1);
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return i & 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37034a(C11305a<T>.C0000a aVar) {
            this.f30272j.mo36647c(aVar);
            onComplete();
        }

        public void clear() {
        }

        public void dispose() {
            this.f30274l = true;
            this.f30273k.dispose();
            this.f30272j.dispose();
        }

        public boolean isDisposed() {
            return this.f30273k.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f30269g.mo37168a();
                if (a != null) {
                    this.f30268f.onError(a);
                } else {
                    this.f30268f.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f30269g.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (!this.f30271i) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f30268f.onError(this.f30269g.mo37168a());
                }
            } else if (decrementAndGet() == 0) {
                this.f30268f.onError(this.f30269g.mo37168a());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f30270h.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null CompletableSource");
                C11450f fVar = (C11450f) apply;
                getAndIncrement();
                C11306a aVar = new C11306a();
                if (!this.f30274l && this.f30272j.mo36646b(aVar)) {
                    fVar.mo36640a(aVar);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30273k.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30273k, cVar)) {
                this.f30273k = cVar;
                this.f30268f.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37035a(C11305a<T>.C0000a aVar, Throwable th) {
            this.f30272j.mo36647c(aVar);
            onError(th);
        }
    }
}
