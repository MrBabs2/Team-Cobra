package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.x0 */
/* compiled from: ObservableFlatMapCompletableCompletable */
public final class C11317x0<T> extends C10839b implements C10912a<T> {

    /* renamed from: f */
    final C11488s<T> f30315f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C11450f> f30316g;

    /* renamed from: h */
    final boolean f30317h;

    public C11317x0(C11488s<T> sVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
        this.f30315f = sVar;
        this.f30316g = oVar;
        this.f30317h = z;
    }

    /* renamed from: a */
    public C11482n<T> mo36701a() {
        return C11459a.m37519a(new C11304w0(this.f30315f, this.f30316g, this.f30317h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        this.f30315f.subscribe(new C11318a(dVar, this.f30316g, this.f30317h));
    }

    /* renamed from: q.a.d0.e.e.x0$a */
    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class C11318a<T> extends AtomicInteger implements C10842c, C11490u<T> {

        /* renamed from: f */
        final C10863d f30318f;

        /* renamed from: g */
        final C11428c f30319g = new C11428c();

        /* renamed from: h */
        final C10861o<? super T, ? extends C11450f> f30320h;

        /* renamed from: i */
        final boolean f30321i;

        /* renamed from: j */
        final C10841b f30322j = new C10841b();

        /* renamed from: k */
        C10842c f30323k;

        /* renamed from: l */
        volatile boolean f30324l;

        /* renamed from: q.a.d0.e.e.x0$a$a */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C11319a extends AtomicReference<C10842c> implements C10863d, C10842c {
            C11319a() {
            }

            public void dispose() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public boolean isDisposed() {
                return C10867d.m36775a((C10842c) get());
            }

            public void onComplete() {
                C11318a.this.mo37043a(this);
            }

            public void onError(Throwable th) {
                C11318a.this.mo37044a(this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11318a(C10863d dVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
            this.f30318f = dVar;
            this.f30320h = oVar;
            this.f30321i = z;
            lazySet(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37043a(C11318a<T>.C0000a aVar) {
            this.f30322j.mo36647c(aVar);
            onComplete();
        }

        public void dispose() {
            this.f30324l = true;
            this.f30323k.dispose();
            this.f30322j.dispose();
        }

        public boolean isDisposed() {
            return this.f30323k.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f30319g.mo37168a();
                if (a != null) {
                    this.f30318f.onError(a);
                } else {
                    this.f30318f.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f30319g.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (!this.f30321i) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f30318f.onError(this.f30319g.mo37168a());
                }
            } else if (decrementAndGet() == 0) {
                this.f30318f.onError(this.f30319g.mo37168a());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f30320h.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null CompletableSource");
                C11450f fVar = (C11450f) apply;
                getAndIncrement();
                C11319a aVar = new C11319a();
                if (!this.f30324l && this.f30322j.mo36646b(aVar)) {
                    fVar.mo36640a(aVar);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30323k.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30323k, cVar)) {
                this.f30323k = cVar;
                this.f30318f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37044a(C11318a<T>.C0000a aVar, Throwable th) {
            this.f30322j.mo36647c(aVar);
            onError(th);
        }
    }
}
