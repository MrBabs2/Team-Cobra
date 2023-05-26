package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.k1 */
/* compiled from: ObservableHide */
public final class C11129k1<T> extends C10980a<T, T> {

    /* renamed from: q.a.d0.e.e.k1$a */
    /* compiled from: ObservableHide */
    static final class C11130a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29662f;

        /* renamed from: g */
        C10842c f29663g;

        C11130a(C11490u<? super T> uVar) {
            this.f29662f = uVar;
        }

        public void dispose() {
            this.f29663g.dispose();
        }

        public boolean isDisposed() {
            return this.f29663g.isDisposed();
        }

        public void onComplete() {
            this.f29662f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29662f.onError(th);
        }

        public void onNext(T t) {
            this.f29662f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29663g, cVar)) {
                this.f29663g = cVar;
                this.f29662f.onSubscribe(this);
            }
        }
    }

    public C11129k1(C11488s<T> sVar) {
        super(sVar);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11130a(uVar));
    }
}
