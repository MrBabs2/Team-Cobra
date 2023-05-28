package p120q.p326a.p329d0.p334e.p340f;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10853g;

/* renamed from: q.a.d0.e.f.b */
/* compiled from: SingleDoOnSuccess */
public final class C11363b<T> extends C11496w<T> {

    /* renamed from: f */
    final C10838a0<T> f30443f;

    /* renamed from: g */
    final C10853g<? super T> f30444g;

    /* renamed from: q.a.d0.e.f.b$a */
    /* compiled from: SingleDoOnSuccess */
    final class C11364a implements C11498y<T> {

        /* renamed from: f */
        final C11498y<? super T> f30445f;

        C11364a(C11498y<? super T> yVar) {
            this.f30445f = yVar;
        }

        public void onError(Throwable th) {
            this.f30445f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            this.f30445f.onSubscribe(cVar);
        }

        public void onSuccess(T t) {
            try {
                C11363b.this.f30444g.mo8098a(t);
                this.f30445f.onSuccess(t);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30445f.onError(th);
            }
        }
    }

    public C11363b(C10838a0<T> a0Var, C10853g<? super T> gVar) {
        this.f30443f = a0Var;
        this.f30444g = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        this.f30443f.mo36638a(new C11364a(yVar));
    }
}
