package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.CompositeException;
import p123rx.p126m.C5378b;

/* renamed from: rx.n.a.i1 */
/* compiled from: SingleDoOnEvent */
public final class C12572i1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single<T> f32410f;

    /* renamed from: g */
    final C5378b<? super T> f32411g;

    /* renamed from: h */
    final C5378b<Throwable> f32412h;

    /* renamed from: rx.n.a.i1$a */
    /* compiled from: SingleDoOnEvent */
    static final class C12573a<T> extends C12474i<T> {

        /* renamed from: g */
        final C12474i<? super T> f32413g;

        /* renamed from: h */
        final C5378b<? super T> f32414h;

        /* renamed from: i */
        final C5378b<Throwable> f32415i;

        C12573a(C12474i<? super T> iVar, C5378b<? super T> bVar, C5378b<Throwable> bVar2) {
            this.f32413g = iVar;
            this.f32414h = bVar;
            this.f32415i = bVar2;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            try {
                this.f32414h.call(t);
                this.f32413g.mo18573a(t);
            } catch (Throwable th) {
                C12472a.m40942a(th, (C12474i<?>) this, (Object) t);
            }
        }

        public void onError(Throwable th) {
            try {
                this.f32415i.call(th);
                this.f32413g.onError(th);
            } catch (Throwable th2) {
                C12472a.m40945c(th2);
                this.f32413g.onError(new CompositeException(th, th2));
            }
        }
    }

    public C12572i1(Single<T> single, C5378b<? super T> bVar, C5378b<Throwable> bVar2) {
        this.f32410f = single;
        this.f32411g = bVar;
        this.f32412h = bVar2;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12573a aVar = new C12573a(iVar, this.f32411g, this.f32412h);
        iVar.mo40654b(aVar);
        this.f32410f.mo18560a(aVar);
    }
}
