package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.j1 */
/* compiled from: SingleDoOnSubscribe */
public final class C12579j1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single.C5327j<T> f32442f;

    /* renamed from: g */
    final C5377a f32443g;

    public C12579j1(Single.C5327j<T> jVar, C5377a aVar) {
        this.f32442f = jVar;
        this.f32443g = aVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        try {
            this.f32443g.call();
            this.f32442f.call(iVar);
        } catch (Throwable th) {
            C12472a.m40945c(th);
            iVar.onError(th);
        }
    }
}
