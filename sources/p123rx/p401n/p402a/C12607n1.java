package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.n1 */
/* compiled from: SingleObserveOn */
public final class C12607n1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single.C5327j<T> f32518f;

    /* renamed from: g */
    final C5373h f32519g;

    /* renamed from: rx.n.a.n1$a */
    /* compiled from: SingleObserveOn */
    static final class C12608a<T> extends C12474i<T> implements C5377a {

        /* renamed from: g */
        final C12474i<? super T> f32520g;

        /* renamed from: h */
        final C5373h.C5374a f32521h;

        /* renamed from: i */
        T f32522i;

        /* renamed from: j */
        Throwable f32523j;

        public C12608a(C12474i<? super T> iVar, C5373h.C5374a aVar) {
            this.f32520g = iVar;
            this.f32521h = aVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            this.f32522i = t;
            this.f32521h.mo18710a(this);
        }

        public void call() {
            try {
                Throwable th = this.f32523j;
                if (th != null) {
                    this.f32523j = null;
                    this.f32520g.onError(th);
                } else {
                    T t = this.f32522i;
                    this.f32522i = null;
                    this.f32520g.mo18573a(t);
                }
            } finally {
                this.f32521h.unsubscribe();
            }
        }

        public void onError(Throwable th) {
            this.f32523j = th;
            this.f32521h.mo18710a(this);
        }
    }

    public C12607n1(Single.C5327j<T> jVar, C5373h hVar) {
        this.f32518f = jVar;
        this.f32519g = hVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C5373h.C5374a createWorker = this.f32519g.createWorker();
        C12608a aVar = new C12608a(iVar, createWorker);
        iVar.mo40654b(createWorker);
        iVar.mo40654b(aVar);
        this.f32518f.call(aVar);
    }
}
