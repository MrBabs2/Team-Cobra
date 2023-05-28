package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.OnErrorThrowable;
import p123rx.p126m.C5379n;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.w */
/* compiled from: OnSubscribeMap */
public final class C12674w<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e<T> f32727f;

    /* renamed from: g */
    final C5379n<? super T, ? extends R> f32728g;

    /* renamed from: rx.n.a.w$a */
    /* compiled from: OnSubscribeMap */
    static final class C12675a<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super R> f32729f;

        /* renamed from: g */
        final C5379n<? super T, ? extends R> f32730g;

        /* renamed from: h */
        boolean f32731h;

        public C12675a(C12475j<? super R> jVar, C5379n<? super T, ? extends R> nVar) {
            this.f32729f = jVar;
            this.f32730g = nVar;
        }

        public void onCompleted() {
            if (!this.f32731h) {
                this.f32729f.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.f32731h) {
                C12844c.m41417b(th);
                return;
            }
            this.f32731h = true;
            this.f32729f.onError(th);
        }

        public void onNext(T t) {
            try {
                this.f32729f.onNext(this.f32730g.call(t));
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(OnErrorThrowable.m40933a(th, t));
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32729f.setProducer(gVar);
        }
    }

    public C12674w(C5368e<T> eVar, C5379n<? super T, ? extends R> nVar) {
        this.f32727f = eVar;
        this.f32728g = nVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super R> jVar) {
        C12675a aVar = new C12675a(jVar, this.f32728g);
        jVar.add(aVar);
        this.f32727f.mo18668b(aVar);
    }
}
