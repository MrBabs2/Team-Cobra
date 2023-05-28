package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.v */
/* compiled from: OnSubscribeLift */
public final class C12671v<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e.C5370a<T> f32719f;

    /* renamed from: g */
    final C5368e.C5371b<? extends R, ? super T> f32720g;

    public C12671v(C5368e.C5370a<T> aVar, C5368e.C5371b<? extends R, ? super T> bVar) {
        this.f32719f = aVar;
        this.f32720g = bVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super R> jVar) {
        C12475j jVar2;
        try {
            jVar2 = (C12475j) C12844c.m41409a(this.f32720g).call(jVar);
            jVar2.onStart();
            this.f32719f.call(jVar2);
        } catch (Throwable th) {
            C12472a.m40945c(th);
            jVar.onError(th);
        }
    }
}
