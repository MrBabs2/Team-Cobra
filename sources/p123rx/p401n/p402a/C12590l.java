package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12495m;
import p123rx.p410p.C12839f;

/* renamed from: rx.n.a.l */
/* compiled from: OnSubscribeDefer */
public final class C12590l<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C12495m<? extends C5368e<? extends T>> f32481f;

    public C12590l(C12495m<? extends C5368e<? extends T>> mVar) {
        this.f32481f = mVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        try {
            ((C5368e) this.f32481f.call()).mo18668b(C12839f.m41394a(jVar));
        } catch (Throwable th) {
            C12472a.m40939a(th, (C5372f<?>) jVar);
        }
    }
}
