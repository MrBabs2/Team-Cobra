package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10838a0;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.y */
/* compiled from: ObservableConcatWithSingle */
public final class C11329y<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10838a0<? extends T> f30344g;

    /* renamed from: q.a.d0.e.e.y$a */
    /* compiled from: ObservableConcatWithSingle */
    static final class C11330a<T> extends AtomicReference<C10842c> implements C11490u<T>, C11498y<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30345f;

        /* renamed from: g */
        C10838a0<? extends T> f30346g;

        /* renamed from: h */
        boolean f30347h;

        C11330a(C11490u<? super T> uVar, C10838a0<? extends T> a0Var) {
            this.f30345f = uVar;
            this.f30346g = a0Var;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            this.f30347h = true;
            C10867d.m36774a((AtomicReference<C10842c>) this, (C10842c) null);
            C10838a0<? extends T> a0Var = this.f30346g;
            this.f30346g = null;
            a0Var.mo36638a(this);
        }

        public void onError(Throwable th) {
            this.f30345f.onError(th);
        }

        public void onNext(T t) {
            this.f30345f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar) && !this.f30347h) {
                this.f30345f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f30345f.onNext(t);
            this.f30345f.onComplete();
        }
    }

    public C11329y(C11482n<T> nVar, C10838a0<? extends T> a0Var) {
        super(nVar);
        this.f30344g = a0Var;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11330a(uVar, this.f30344g));
    }
}
