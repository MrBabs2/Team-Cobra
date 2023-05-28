package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.e.e.l1 */
/* compiled from: ObservableIgnoreElements */
public final class C11143l1<T> extends C10980a<T, T> {

    /* renamed from: q.a.d0.e.e.l1$a */
    /* compiled from: ObservableIgnoreElements */
    static final class C11144a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29700f;

        /* renamed from: g */
        C10842c f29701g;

        C11144a(C11490u<? super T> uVar) {
            this.f29700f = uVar;
        }

        public void dispose() {
            this.f29701g.dispose();
        }

        public boolean isDisposed() {
            return this.f29701g.isDisposed();
        }

        public void onComplete() {
            this.f29700f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29700f.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(C10842c cVar) {
            this.f29701g = cVar;
            this.f29700f.onSubscribe(this);
        }
    }

    public C11143l1(C11488s<T> sVar) {
        super(sVar);
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11144a(uVar));
    }
}
