package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.f.d */
/* compiled from: SingleFlatMap */
public final class C11366d<T, R> extends C11496w<R> {

    /* renamed from: f */
    final C10838a0<? extends T> f30448f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C10838a0<? extends R>> f30449g;

    /* renamed from: q.a.d0.e.f.d$a */
    /* compiled from: SingleFlatMap */
    static final class C11367a<T, R> extends AtomicReference<C10842c> implements C11498y<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super R> f30450f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C10838a0<? extends R>> f30451g;

        /* renamed from: q.a.d0.e.f.d$a$a */
        /* compiled from: SingleFlatMap */
        static final class C11368a<R> implements C11498y<R> {

            /* renamed from: f */
            final AtomicReference<C10842c> f30452f;

            /* renamed from: g */
            final C11498y<? super R> f30453g;

            C11368a(AtomicReference<C10842c> atomicReference, C11498y<? super R> yVar) {
                this.f30452f = atomicReference;
                this.f30453g = yVar;
            }

            public void onError(Throwable th) {
                this.f30453g.onError(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a(this.f30452f, cVar);
            }

            public void onSuccess(R r) {
                this.f30453g.onSuccess(r);
            }
        }

        C11367a(C11498y<? super R> yVar, C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
            this.f30450f = yVar;
            this.f30451g = oVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onError(Throwable th) {
            this.f30450f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar)) {
                this.f30450f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f30451g.apply(t);
                C10910b.m36861a(apply, "The single returned by the mapper is null");
                C10838a0 a0Var = (C10838a0) apply;
                if (!isDisposed()) {
                    a0Var.mo36638a(new C11368a(this, this.f30450f));
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30450f.onError(th);
            }
        }
    }

    public C11366d(C10838a0<? extends T> a0Var, C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        this.f30449g = oVar;
        this.f30448f = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super R> yVar) {
        this.f30448f.mo36638a(new C11367a(yVar, this.f30449g));
    }
}
