package p123rx.p401n.p406e;

import p123rx.C12474i;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p401n.p404c.C12715b;

/* renamed from: rx.n.e.k */
/* compiled from: ScalarSynchronousSingle */
public final class C12784k<T> extends Single<T> {

    /* renamed from: b */
    final T f32979b;

    /* renamed from: rx.n.e.k$a */
    /* compiled from: ScalarSynchronousSingle */
    class C12785a implements Single.C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ Object f32980f;

        C12785a(Object obj) {
            this.f32980f = obj;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            iVar.mo18573a(this.f32980f);
        }
    }

    /* renamed from: rx.n.e.k$b */
    /* compiled from: ScalarSynchronousSingle */
    class C12786b implements Single.C5327j<R> {

        /* renamed from: f */
        final /* synthetic */ C5379n f32981f;

        /* renamed from: rx.n.e.k$b$a */
        /* compiled from: ScalarSynchronousSingle */
        class C12787a extends C12474i<R> {

            /* renamed from: g */
            final /* synthetic */ C12474i f32983g;

            C12787a(C12786b bVar, C12474i iVar) {
                this.f32983g = iVar;
            }

            /* renamed from: a */
            public void mo18573a(R r) {
                this.f32983g.mo18573a(r);
            }

            public void onError(Throwable th) {
                this.f32983g.onError(th);
            }
        }

        C12786b(C5379n nVar) {
            this.f32981f = nVar;
        }

        /* renamed from: a */
        public void call(C12474i<? super R> iVar) {
            Single single = (Single) this.f32981f.call(C12784k.this.f32979b);
            if (single instanceof C12784k) {
                iVar.mo18573a(((C12784k) single).f32979b);
                return;
            }
            C12787a aVar = new C12787a(this, iVar);
            iVar.mo40654b(aVar);
            single.mo18560a(aVar);
        }
    }

    /* renamed from: rx.n.e.k$c */
    /* compiled from: ScalarSynchronousSingle */
    static final class C12788c<T> implements Single.C5327j<T> {

        /* renamed from: f */
        private final C12715b f32984f;

        /* renamed from: g */
        private final T f32985g;

        C12788c(C12715b bVar, T t) {
            this.f32984f = bVar;
            this.f32985g = t;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            iVar.mo40654b(this.f32984f.mo40858a(new C12790e(iVar, this.f32985g)));
        }
    }

    /* renamed from: rx.n.e.k$d */
    /* compiled from: ScalarSynchronousSingle */
    static final class C12789d<T> implements Single.C5327j<T> {

        /* renamed from: f */
        private final C5373h f32986f;

        /* renamed from: g */
        private final T f32987g;

        C12789d(C5373h hVar, T t) {
            this.f32986f = hVar;
            this.f32987g = t;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            C5373h.C5374a createWorker = this.f32986f.createWorker();
            iVar.mo40654b(createWorker);
            createWorker.mo18710a(new C12790e(iVar, this.f32987g));
        }
    }

    /* renamed from: rx.n.e.k$e */
    /* compiled from: ScalarSynchronousSingle */
    static final class C12790e<T> implements C5377a {

        /* renamed from: f */
        private final C12474i<? super T> f32988f;

        /* renamed from: g */
        private final T f32989g;

        C12790e(C12474i<? super T> iVar, T t) {
            this.f32988f = iVar;
            this.f32989g = t;
        }

        public void call() {
            try {
                this.f32988f.mo18573a(this.f32989g);
            } catch (Throwable th) {
                this.f32988f.onError(th);
            }
        }
    }

    protected C12784k(T t) {
        super(new C12785a(t));
        this.f32979b = t;
    }

    /* renamed from: b */
    public static <T> C12784k<T> m41287b(T t) {
        return new C12784k<>(t);
    }

    /* renamed from: c */
    public Single<T> mo40908c(C5373h hVar) {
        if (hVar instanceof C12715b) {
            return Single.m10122a(new C12788c((C12715b) hVar, this.f32979b));
        }
        return Single.m10122a(new C12789d(hVar, this.f32979b));
    }

    /* renamed from: h */
    public <R> Single<R> mo40909h(C5379n<? super T, ? extends Single<? extends R>> nVar) {
        return Single.m10122a(new C12786b(nVar));
    }
}
