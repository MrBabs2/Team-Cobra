package p123rx.p401n.p406e;

import p123rx.C5372f;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: rx.n.e.a */
/* compiled from: ActionObserver */
public final class C12756a<T> implements C5372f<T> {

    /* renamed from: f */
    final C5378b<? super T> f32939f;

    /* renamed from: g */
    final C5378b<? super Throwable> f32940g;

    /* renamed from: h */
    final C5377a f32941h;

    public C12756a(C5378b<? super T> bVar, C5378b<? super Throwable> bVar2, C5377a aVar) {
        this.f32939f = bVar;
        this.f32940g = bVar2;
        this.f32941h = aVar;
    }

    public void onCompleted() {
        this.f32941h.call();
    }

    public void onError(Throwable th) {
        this.f32940g.call(th);
    }

    public void onNext(T t) {
        this.f32939f.call(t);
    }
}
