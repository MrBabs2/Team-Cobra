package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: rx.n.a.u1 */
/* compiled from: SingleToObservable */
public final class C12670u1<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final Single.C5327j<T> f32718f;

    public C12670u1(Single.C5327j<T> jVar) {
        this.f32718f = jVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12603m1 m1Var = new C12603m1(jVar);
        jVar.add(m1Var);
        this.f32718f.call(m1Var);
    }
}
