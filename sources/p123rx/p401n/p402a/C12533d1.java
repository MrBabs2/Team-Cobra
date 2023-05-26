package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.d1 */
/* compiled from: OperatorTakeUntilPredicate */
public final class C12533d1<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final C5379n<? super T, Boolean> f32319f;

    /* renamed from: rx.n.a.d1$a */
    /* compiled from: OperatorTakeUntilPredicate */
    class C12534a implements C12473g {

        /* renamed from: f */
        final /* synthetic */ C12535b f32320f;

        C12534a(C12533d1 d1Var, C12535b bVar) {
            this.f32320f = bVar;
        }

        public void request(long j) {
            this.f32320f.mo40689a(j);
        }
    }

    /* renamed from: rx.n.a.d1$b */
    /* compiled from: OperatorTakeUntilPredicate */
    final class C12535b extends C12475j<T> {

        /* renamed from: f */
        private final C12475j<? super T> f32321f;

        /* renamed from: g */
        private boolean f32322g;

        C12535b(C12475j<? super T> jVar) {
            this.f32321f = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40689a(long j) {
            request(j);
        }

        public void onCompleted() {
            if (!this.f32322g) {
                this.f32321f.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32322g) {
                this.f32321f.onError(th);
            }
        }

        public void onNext(T t) {
            this.f32321f.onNext(t);
            try {
                if (C12533d1.this.f32319f.call(t).booleanValue()) {
                    this.f32322g = true;
                    this.f32321f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f32322g = true;
                C12472a.m40940a(th, (C5372f<?>) this.f32321f, (Object) t);
                unsubscribe();
            }
        }
    }

    public C12533d1(C5379n<? super T, Boolean> nVar) {
        this.f32319f = nVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12535b bVar = new C12535b(jVar);
        jVar.add(bVar);
        jVar.setProducer(new C12534a(this, bVar));
        return bVar;
    }
}
