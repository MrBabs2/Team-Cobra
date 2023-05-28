package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.g0 */
/* compiled from: ObservableDelaySubscriptionOther */
public final class C11062g0<T, U> extends C11482n<T> {

    /* renamed from: f */
    final C11488s<? extends T> f29412f;

    /* renamed from: g */
    final C11488s<U> f29413g;

    /* renamed from: q.a.d0.e.e.g0$a */
    /* compiled from: ObservableDelaySubscriptionOther */
    final class C11063a implements C11490u<U> {

        /* renamed from: f */
        final C10871h f29414f;

        /* renamed from: g */
        final C11490u<? super T> f29415g;

        /* renamed from: h */
        boolean f29416h;

        /* renamed from: q.a.d0.e.e.g0$a$a */
        /* compiled from: ObservableDelaySubscriptionOther */
        final class C11064a implements C11490u<T> {
            C11064a() {
            }

            public void onComplete() {
                C11063a.this.f29415g.onComplete();
            }

            public void onError(Throwable th) {
                C11063a.this.f29415g.onError(th);
            }

            public void onNext(T t) {
                C11063a.this.f29415g.onNext(t);
            }

            public void onSubscribe(C10842c cVar) {
                C11063a.this.f29414f.mo36673b(cVar);
            }
        }

        C11063a(C10871h hVar, C11490u<? super T> uVar) {
            this.f29414f = hVar;
            this.f29415g = uVar;
        }

        public void onComplete() {
            if (!this.f29416h) {
                this.f29416h = true;
                C11062g0.this.f29412f.subscribe(new C11064a());
            }
        }

        public void onError(Throwable th) {
            if (this.f29416h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29416h = true;
            this.f29415g.onError(th);
        }

        public void onNext(U u) {
            onComplete();
        }

        public void onSubscribe(C10842c cVar) {
            this.f29414f.mo36673b(cVar);
        }
    }

    public C11062g0(C11488s<? extends T> sVar, C11488s<U> sVar2) {
        this.f29412f = sVar;
        this.f29413g = sVar2;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10871h hVar = new C10871h();
        uVar.onSubscribe(hVar);
        this.f29413g.subscribe(new C11063a(hVar, uVar));
    }
}
