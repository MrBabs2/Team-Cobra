package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: rx.n.a.x0 */
/* compiled from: OperatorSkip */
public final class C12681x0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final int f32746f;

    /* renamed from: rx.n.a.x0$a */
    /* compiled from: OperatorSkip */
    class C12682a extends C12475j<T> {

        /* renamed from: f */
        int f32747f;

        /* renamed from: g */
        final /* synthetic */ C12475j f32748g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12682a(C12475j jVar, C12475j jVar2) {
            super(jVar);
            this.f32748g = jVar2;
        }

        public void onCompleted() {
            this.f32748g.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32748g.onError(th);
        }

        public void onNext(T t) {
            int i = this.f32747f;
            if (i >= C12681x0.this.f32746f) {
                this.f32748g.onNext(t);
            } else {
                this.f32747f = i + 1;
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32748g.setProducer(gVar);
            gVar.request((long) C12681x0.this.f32746f);
        }
    }

    public C12681x0(int i) {
        if (i >= 0) {
            this.f32746f = i;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i);
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        return new C12682a(jVar, jVar);
    }
}
