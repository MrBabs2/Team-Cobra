package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.q3 */
/* compiled from: ObservableTakeLastOne */
public final class C11231q3<T> extends C10980a<T, T> {

    /* renamed from: q.a.d0.e.e.q3$a */
    /* compiled from: ObservableTakeLastOne */
    static final class C11232a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30014f;

        /* renamed from: g */
        C10842c f30015g;

        /* renamed from: h */
        T f30016h;

        C11232a(C11490u<? super T> uVar) {
            this.f30014f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36973a() {
            T t = this.f30016h;
            if (t != null) {
                this.f30016h = null;
                this.f30014f.onNext(t);
            }
            this.f30014f.onComplete();
        }

        public void dispose() {
            this.f30016h = null;
            this.f30015g.dispose();
        }

        public boolean isDisposed() {
            return this.f30015g.isDisposed();
        }

        public void onComplete() {
            mo36973a();
        }

        public void onError(Throwable th) {
            this.f30016h = null;
            this.f30014f.onError(th);
        }

        public void onNext(T t) {
            this.f30016h = t;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30015g, cVar)) {
                this.f30015g = cVar;
                this.f30014f.onSubscribe(this);
            }
        }
    }

    public C11231q3(C11488s<T> sVar) {
        super(sVar);
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11232a(uVar));
    }
}
