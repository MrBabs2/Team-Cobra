package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: rx.n.a.d0 */
/* compiled from: OnSubscribeThrow */
public final class C12532d0<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    private final Throwable f32318f;

    public C12532d0(Throwable th) {
        this.f32318f = th;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        jVar.onError(this.f32318f);
    }
}
