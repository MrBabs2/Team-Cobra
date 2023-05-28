package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.OnErrorThrowable;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.j0 */
/* compiled from: OperatorCast */
public class C12577j0<T, R> implements C5368e.C5371b<R, T> {

    /* renamed from: f */
    final Class<R> f32438f;

    /* renamed from: rx.n.a.j0$a */
    /* compiled from: OperatorCast */
    static final class C12578a<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super R> f32439f;

        /* renamed from: g */
        final Class<R> f32440g;

        /* renamed from: h */
        boolean f32441h;

        public C12578a(C12475j<? super R> jVar, Class<R> cls) {
            this.f32439f = jVar;
            this.f32440g = cls;
        }

        public void onCompleted() {
            if (!this.f32441h) {
                this.f32439f.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.f32441h) {
                C12844c.m41417b(th);
                return;
            }
            this.f32441h = true;
            this.f32439f.onError(th);
        }

        public void onNext(T t) {
            try {
                this.f32439f.onNext(this.f32440g.cast(t));
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(OnErrorThrowable.m40933a(th, t));
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32439f.setProducer(gVar);
        }
    }

    public C12577j0(Class<R> cls) {
        this.f32438f = cls;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super R> jVar) {
        C12578a aVar = new C12578a(jVar, this.f32438f);
        jVar.add(aVar);
        return aVar;
    }
}
