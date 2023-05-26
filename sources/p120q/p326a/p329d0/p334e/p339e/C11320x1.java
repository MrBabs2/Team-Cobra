package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11481m;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.x1 */
/* compiled from: ObservableMaterialize */
public final class C11320x1<T> extends C10980a<T, C11481m<T>> {

    /* renamed from: q.a.d0.e.e.x1$a */
    /* compiled from: ObservableMaterialize */
    static final class C11321a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super C11481m<T>> f30326f;

        /* renamed from: g */
        C10842c f30327g;

        C11321a(C11490u<? super C11481m<T>> uVar) {
            this.f30326f = uVar;
        }

        public void dispose() {
            this.f30327g.dispose();
        }

        public boolean isDisposed() {
            return this.f30327g.isDisposed();
        }

        public void onComplete() {
            this.f30326f.onNext(C11481m.m37581f());
            this.f30326f.onComplete();
        }

        public void onError(Throwable th) {
            this.f30326f.onNext(C11481m.m37580a(th));
            this.f30326f.onComplete();
        }

        public void onNext(T t) {
            this.f30326f.onNext(C11481m.m37579a(t));
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30327g, cVar)) {
                this.f30327g = cVar;
                this.f30326f.onSubscribe(this);
            }
        }
    }

    public C11320x1(C11488s<T> sVar) {
        super(sVar);
    }

    public void subscribeActual(C11490u<? super C11481m<T>> uVar) {
        this.f29150f.subscribe(new C11321a(uVar));
    }
}
