package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.z */
/* compiled from: ObservableCount */
public final class C11345z<T> extends C10980a<T, Long> {

    /* renamed from: q.a.d0.e.e.z$a */
    /* compiled from: ObservableCount */
    static final class C11346a implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11490u<? super Long> f30387f;

        /* renamed from: g */
        C10842c f30388g;

        /* renamed from: h */
        long f30389h;

        C11346a(C11490u<? super Long> uVar) {
            this.f30387f = uVar;
        }

        public void dispose() {
            this.f30388g.dispose();
        }

        public boolean isDisposed() {
            return this.f30388g.isDisposed();
        }

        public void onComplete() {
            this.f30387f.onNext(Long.valueOf(this.f30389h));
            this.f30387f.onComplete();
        }

        public void onError(Throwable th) {
            this.f30387f.onError(th);
        }

        public void onNext(Object obj) {
            this.f30389h++;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30388g, cVar)) {
                this.f30388g = cVar;
                this.f30387f.onSubscribe(this);
            }
        }
    }

    public C11345z(C11488s<T> sVar) {
        super(sVar);
    }

    public void subscribeActual(C11490u<? super Long> uVar) {
        this.f29150f.subscribe(new C11346a(uVar));
    }
}
