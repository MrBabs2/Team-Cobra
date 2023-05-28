package p120q.p326a.p329d0.p334e.p340f;

import p120q.p326a.C10838a0;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p333d.C10927i;

/* renamed from: q.a.d0.e.f.i */
/* compiled from: SingleToObservable */
public final class C11376i<T> extends C11482n<T> {

    /* renamed from: f */
    final C10838a0<? extends T> f30470f;

    /* renamed from: q.a.d0.e.f.i$a */
    /* compiled from: SingleToObservable */
    static final class C11377a<T> extends C10927i<T> implements C11498y<T> {

        /* renamed from: h */
        C10842c f30471h;

        C11377a(C11490u<? super T> uVar) {
            super(uVar);
        }

        public void dispose() {
            super.dispose();
            this.f30471h.dispose();
        }

        public void onError(Throwable th) {
            mo36716a(th);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30471h, cVar)) {
                this.f30471h = cVar;
                this.f28987f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36715a(t);
        }
    }

    public C11376i(C10838a0<? extends T> a0Var) {
        this.f30470f = a0Var;
    }

    /* renamed from: a */
    public static <T> C11498y<T> m37334a(C11490u<? super T> uVar) {
        return new C11377a(uVar);
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f30470f.mo36638a(m37334a(uVar));
    }
}
