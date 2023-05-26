package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10864a;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.j3 */
/* compiled from: ObservableSkipUntil */
public final class C11116j3<T, U> extends C10980a<T, T> {

    /* renamed from: g */
    final C11488s<U> f29603g;

    /* renamed from: q.a.d0.e.e.j3$a */
    /* compiled from: ObservableSkipUntil */
    final class C11117a implements C11490u<U> {

        /* renamed from: f */
        final C10864a f29604f;

        /* renamed from: g */
        final C11118b<T> f29605g;

        /* renamed from: h */
        final C11455e<T> f29606h;

        /* renamed from: i */
        C10842c f29607i;

        C11117a(C11116j3 j3Var, C10864a aVar, C11118b<T> bVar, C11455e<T> eVar) {
            this.f29604f = aVar;
            this.f29605g = bVar;
            this.f29606h = eVar;
        }

        public void onComplete() {
            this.f29605g.f29611i = true;
        }

        public void onError(Throwable th) {
            this.f29604f.dispose();
            this.f29606h.onError(th);
        }

        public void onNext(U u) {
            this.f29607i.dispose();
            this.f29605g.f29611i = true;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29607i, cVar)) {
                this.f29607i = cVar;
                this.f29604f.mo36664a(1, cVar);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.j3$b */
    /* compiled from: ObservableSkipUntil */
    static final class C11118b<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f29608f;

        /* renamed from: g */
        final C10864a f29609g;

        /* renamed from: h */
        C10842c f29610h;

        /* renamed from: i */
        volatile boolean f29611i;

        /* renamed from: j */
        boolean f29612j;

        C11118b(C11490u<? super T> uVar, C10864a aVar) {
            this.f29608f = uVar;
            this.f29609g = aVar;
        }

        public void onComplete() {
            this.f29609g.dispose();
            this.f29608f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29609g.dispose();
            this.f29608f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29612j) {
                this.f29608f.onNext(t);
            } else if (this.f29611i) {
                this.f29612j = true;
                this.f29608f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29610h, cVar)) {
                this.f29610h = cVar;
                this.f29609g.mo36664a(0, cVar);
            }
        }
    }

    public C11116j3(C11488s<T> sVar, C11488s<U> sVar2) {
        super(sVar);
        this.f29603g = sVar2;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11455e eVar = new C11455e(uVar);
        C10864a aVar = new C10864a(2);
        eVar.onSubscribe(aVar);
        C11118b bVar = new C11118b(eVar, aVar);
        this.f29603g.subscribe(new C11117a(this, aVar, bVar, eVar));
        this.f29150f.subscribe(bVar);
    }
}
