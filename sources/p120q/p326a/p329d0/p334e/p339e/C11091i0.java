package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11432g;

/* renamed from: q.a.d0.e.e.i0 */
/* compiled from: ObservableDetach */
public final class C11091i0<T> extends C10980a<T, T> {

    /* renamed from: q.a.d0.e.e.i0$a */
    /* compiled from: ObservableDetach */
    static final class C11092a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        C11490u<? super T> f29499f;

        /* renamed from: g */
        C10842c f29500g;

        C11092a(C11490u<? super T> uVar) {
            this.f29499f = uVar;
        }

        public void dispose() {
            C10842c cVar = this.f29500g;
            this.f29500g = C11432g.INSTANCE;
            this.f29499f = C11432g.m37457a();
            cVar.dispose();
        }

        public boolean isDisposed() {
            return this.f29500g.isDisposed();
        }

        public void onComplete() {
            C11490u<? super T> uVar = this.f29499f;
            this.f29500g = C11432g.INSTANCE;
            this.f29499f = C11432g.m37457a();
            uVar.onComplete();
        }

        public void onError(Throwable th) {
            C11490u<? super T> uVar = this.f29499f;
            this.f29500g = C11432g.INSTANCE;
            this.f29499f = C11432g.m37457a();
            uVar.onError(th);
        }

        public void onNext(T t) {
            this.f29499f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29500g, cVar)) {
                this.f29500g = cVar;
                this.f29499f.onSubscribe(this);
            }
        }
    }

    public C11091i0(C11488s<T> sVar) {
        super(sVar);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11092a(uVar));
    }
}
