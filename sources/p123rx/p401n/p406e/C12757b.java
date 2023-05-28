package p123rx.p401n.p406e;

import p123rx.C12475j;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: rx.n.e.b */
/* compiled from: ActionSubscriber */
public final class C12757b<T> extends C12475j<T> {

    /* renamed from: f */
    final C5378b<? super T> f32942f;

    /* renamed from: g */
    final C5378b<Throwable> f32943g;

    /* renamed from: h */
    final C5377a f32944h;

    public C12757b(C5378b<? super T> bVar, C5378b<Throwable> bVar2, C5377a aVar) {
        this.f32942f = bVar;
        this.f32943g = bVar2;
        this.f32944h = aVar;
    }

    public void onCompleted() {
        this.f32944h.call();
    }

    public void onError(Throwable th) {
        this.f32943g.call(th);
    }

    public void onNext(T t) {
        this.f32942f.call(t);
    }
}
