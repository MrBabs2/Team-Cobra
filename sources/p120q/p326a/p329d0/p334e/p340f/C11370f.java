package p120q.p326a.p329d0.p334e.p340f;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.f.f */
/* compiled from: SingleMap */
public final class C11370f<T, R> extends C11496w<R> {

    /* renamed from: f */
    final C10838a0<? extends T> f30455f;

    /* renamed from: g */
    final C10861o<? super T, ? extends R> f30456g;

    /* renamed from: q.a.d0.e.f.f$a */
    /* compiled from: SingleMap */
    static final class C11371a<T, R> implements C11498y<T> {

        /* renamed from: f */
        final C11498y<? super R> f30457f;

        /* renamed from: g */
        final C10861o<? super T, ? extends R> f30458g;

        C11371a(C11498y<? super R> yVar, C10861o<? super T, ? extends R> oVar) {
            this.f30457f = yVar;
            this.f30458g = oVar;
        }

        public void onError(Throwable th) {
            this.f30457f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            this.f30457f.onSubscribe(cVar);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f30458g.apply(t);
                C10910b.m36861a(apply, "The mapper function returned a null value.");
                this.f30457f.onSuccess(apply);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                onError(th);
            }
        }
    }

    public C11370f(C10838a0<? extends T> a0Var, C10861o<? super T, ? extends R> oVar) {
        this.f30455f = a0Var;
        this.f30456g = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super R> yVar) {
        this.f30455f.mo36638a(new C11371a(yVar, this.f30456g));
    }
}
