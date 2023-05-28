package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.OnErrorThrowable;
import p123rx.p126m.C5379n;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.o */
/* compiled from: OnSubscribeFilter */
public final class C12609o<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5368e<T> f32524f;

    /* renamed from: g */
    final C5379n<? super T, Boolean> f32525g;

    /* renamed from: rx.n.a.o$a */
    /* compiled from: OnSubscribeFilter */
    static final class C12610a<T> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super T> f32526f;

        /* renamed from: g */
        final C5379n<? super T, Boolean> f32527g;

        /* renamed from: h */
        boolean f32528h;

        public C12610a(C12475j<? super T> jVar, C5379n<? super T, Boolean> nVar) {
            this.f32526f = jVar;
            this.f32527g = nVar;
            request(0);
        }

        public void onCompleted() {
            if (!this.f32528h) {
                this.f32526f.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.f32528h) {
                C12844c.m41417b(th);
                return;
            }
            this.f32528h = true;
            this.f32526f.onError(th);
        }

        public void onNext(T t) {
            try {
                if (this.f32527g.call(t).booleanValue()) {
                    this.f32526f.onNext(t);
                } else {
                    request(1);
                }
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(OnErrorThrowable.m40933a(th, t));
            }
        }

        public void setProducer(C12473g gVar) {
            super.setProducer(gVar);
            this.f32526f.setProducer(gVar);
        }
    }

    public C12609o(C5368e<T> eVar, C5379n<? super T, Boolean> nVar) {
        this.f32524f = eVar;
        this.f32525g = nVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12610a aVar = new C12610a(jVar, this.f32525g);
        jVar.add(aVar);
        this.f32524f.mo18668b(aVar);
    }
}
