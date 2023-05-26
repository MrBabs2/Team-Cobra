package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p332c.C10916e;
import p120q.p326a.p329d0.p334e.p339e.C11337y2;

/* renamed from: q.a.d0.e.e.r1 */
/* compiled from: ObservableJust */
public final class C11237r1<T> extends C11482n<T> implements C10916e<T> {

    /* renamed from: f */
    private final T f30033f;

    public C11237r1(T t) {
        this.f30033f = t;
    }

    public T call() {
        return this.f30033f;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11337y2.C11338a aVar = new C11337y2.C11338a(uVar, this.f30033f);
        uVar.onSubscribe(aVar);
        aVar.run();
    }
}
