package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.C12475j;
import p123rx.p401n.p403b.C12707c;

/* renamed from: rx.n.a.m1 */
/* compiled from: SingleLiftObservableOperator */
final class C12603m1<T> extends C12474i<T> {

    /* renamed from: g */
    final C12475j<? super T> f32511g;

    C12603m1(C12475j<? super T> jVar) {
        this.f32511g = jVar;
    }

    /* renamed from: a */
    public void mo18573a(T t) {
        this.f32511g.setProducer(new C12707c(this.f32511g, t));
    }

    public void onError(Throwable th) {
        this.f32511g.onError(th);
    }
}
