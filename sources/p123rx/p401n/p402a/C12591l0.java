package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.l0 */
/* compiled from: OperatorDelay */
public final class C12591l0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final long f32482f;

    /* renamed from: g */
    final TimeUnit f32483g;

    /* renamed from: h */
    final C5373h f32484h;

    /* renamed from: rx.n.a.l0$a */
    /* compiled from: OperatorDelay */
    class C12592a extends C12475j<T> {

        /* renamed from: f */
        boolean f32485f;

        /* renamed from: g */
        final /* synthetic */ C5373h.C5374a f32486g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32487h;

        /* renamed from: rx.n.a.l0$a$a */
        /* compiled from: OperatorDelay */
        class C12593a implements C5377a {
            C12593a() {
            }

            public void call() {
                C12592a aVar = C12592a.this;
                if (!aVar.f32485f) {
                    aVar.f32485f = true;
                    aVar.f32487h.onCompleted();
                }
            }
        }

        /* renamed from: rx.n.a.l0$a$b */
        /* compiled from: OperatorDelay */
        class C12594b implements C5377a {

            /* renamed from: f */
            final /* synthetic */ Throwable f32490f;

            C12594b(Throwable th) {
                this.f32490f = th;
            }

            public void call() {
                C12592a aVar = C12592a.this;
                if (!aVar.f32485f) {
                    aVar.f32485f = true;
                    aVar.f32487h.onError(this.f32490f);
                    C12592a.this.f32486g.unsubscribe();
                }
            }
        }

        /* renamed from: rx.n.a.l0$a$c */
        /* compiled from: OperatorDelay */
        class C12595c implements C5377a {

            /* renamed from: f */
            final /* synthetic */ Object f32492f;

            C12595c(Object obj) {
                this.f32492f = obj;
            }

            public void call() {
                C12592a aVar = C12592a.this;
                if (!aVar.f32485f) {
                    aVar.f32487h.onNext(this.f32492f);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12592a(C12475j jVar, C5373h.C5374a aVar, C12475j jVar2) {
            super(jVar);
            this.f32486g = aVar;
            this.f32487h = jVar2;
        }

        public void onCompleted() {
            C5373h.C5374a aVar = this.f32486g;
            C12593a aVar2 = new C12593a();
            C12591l0 l0Var = C12591l0.this;
            aVar.mo18712a(aVar2, l0Var.f32482f, l0Var.f32483g);
        }

        public void onError(Throwable th) {
            this.f32486g.mo18710a(new C12594b(th));
        }

        public void onNext(T t) {
            C5373h.C5374a aVar = this.f32486g;
            C12595c cVar = new C12595c(t);
            C12591l0 l0Var = C12591l0.this;
            aVar.mo18712a(cVar, l0Var.f32482f, l0Var.f32483g);
        }
    }

    public C12591l0(long j, TimeUnit timeUnit, C5373h hVar) {
        this.f32482f = j;
        this.f32483g = timeUnit;
        this.f32484h = hVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C5373h.C5374a createWorker = this.f32484h.createWorker();
        jVar.add(createWorker);
        return new C12592a(jVar, createWorker, jVar);
    }
}
