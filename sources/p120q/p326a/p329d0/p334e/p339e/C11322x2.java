package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.x2 */
/* compiled from: ObservableSampleWithObservable */
public final class C11322x2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11488s<?> f30328g;

    /* renamed from: h */
    final boolean f30329h;

    /* renamed from: q.a.d0.e.e.x2$a */
    /* compiled from: ObservableSampleWithObservable */
    static final class C11323a<T> extends C11325c<T> {

        /* renamed from: j */
        final AtomicInteger f30330j = new AtomicInteger();

        /* renamed from: k */
        volatile boolean f30331k;

        C11323a(C11490u<? super T> uVar, C11488s<?> sVar) {
            super(uVar, sVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37045b() {
            this.f30331k = true;
            if (this.f30330j.getAndIncrement() == 0) {
                mo37050c();
                this.f30332f.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37046d() {
            if (this.f30330j.getAndIncrement() == 0) {
                do {
                    boolean z = this.f30331k;
                    mo37050c();
                    if (z) {
                        this.f30332f.onComplete();
                        return;
                    }
                } while (this.f30330j.decrementAndGet() != 0);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.x2$b */
    /* compiled from: ObservableSampleWithObservable */
    static final class C11324b<T> extends C11325c<T> {
        C11324b(C11490u<? super T> uVar, C11488s<?> sVar) {
            super(uVar, sVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37045b() {
            this.f30332f.onComplete();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37046d() {
            mo37050c();
        }
    }

    /* renamed from: q.a.d0.e.e.x2$c */
    /* compiled from: ObservableSampleWithObservable */
    static abstract class C11325c<T> extends AtomicReference<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30332f;

        /* renamed from: g */
        final C11488s<?> f30333g;

        /* renamed from: h */
        final AtomicReference<C10842c> f30334h = new AtomicReference<>();

        /* renamed from: i */
        C10842c f30335i;

        C11325c(C11490u<? super T> uVar, C11488s<?> sVar) {
            this.f30332f = uVar;
            this.f30333g = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37049a(C10842c cVar) {
            return C10867d.m36778c(this.f30334h, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo37045b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37050c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f30332f.onNext(andSet);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo37046d();

        public void dispose() {
            C10867d.m36773a(this.f30334h);
            this.f30335i.dispose();
        }

        public boolean isDisposed() {
            return this.f30334h.get() == C10867d.DISPOSED;
        }

        public void onComplete() {
            C10867d.m36773a(this.f30334h);
            mo37045b();
        }

        public void onError(Throwable th) {
            C10867d.m36773a(this.f30334h);
            this.f30332f.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30335i, cVar)) {
                this.f30335i = cVar;
                this.f30332f.onSubscribe(this);
                if (this.f30334h.get() == null) {
                    this.f30333g.subscribe(new C11326d(this));
                }
            }
        }

        /* renamed from: a */
        public void mo37048a(Throwable th) {
            this.f30335i.dispose();
            this.f30332f.onError(th);
        }

        /* renamed from: a */
        public void mo37047a() {
            this.f30335i.dispose();
            mo37045b();
        }
    }

    /* renamed from: q.a.d0.e.e.x2$d */
    /* compiled from: ObservableSampleWithObservable */
    static final class C11326d<T> implements C11490u<Object> {

        /* renamed from: f */
        final C11325c<T> f30336f;

        C11326d(C11325c<T> cVar) {
            this.f30336f = cVar;
        }

        public void onComplete() {
            this.f30336f.mo37047a();
        }

        public void onError(Throwable th) {
            this.f30336f.mo37048a(th);
        }

        public void onNext(Object obj) {
            this.f30336f.mo37046d();
        }

        public void onSubscribe(C10842c cVar) {
            this.f30336f.mo37049a(cVar);
        }
    }

    public C11322x2(C11488s<T> sVar, C11488s<?> sVar2, boolean z) {
        super(sVar);
        this.f30328g = sVar2;
        this.f30329h = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11455e eVar = new C11455e(uVar);
        if (this.f30329h) {
            this.f29150f.subscribe(new C11323a(eVar, this.f30328g));
        } else {
            this.f29150f.subscribe(new C11324b(eVar, this.f30328g));
        }
    }
}
