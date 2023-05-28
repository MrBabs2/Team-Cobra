package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.z0 */
/* compiled from: OperatorSubscribeOn */
public final class C12700z0<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5373h f32797f;

    /* renamed from: g */
    final C5368e<T> f32798g;

    /* renamed from: h */
    final boolean f32799h;

    /* renamed from: rx.n.a.z0$a */
    /* compiled from: OperatorSubscribeOn */
    static final class C12701a<T> extends C12475j<T> implements C5377a {

        /* renamed from: f */
        final C12475j<? super T> f32800f;

        /* renamed from: g */
        final boolean f32801g;

        /* renamed from: h */
        final C5373h.C5374a f32802h;

        /* renamed from: i */
        C5368e<T> f32803i;

        /* renamed from: j */
        Thread f32804j;

        /* renamed from: rx.n.a.z0$a$a */
        /* compiled from: OperatorSubscribeOn */
        class C12702a implements C12473g {

            /* renamed from: f */
            final /* synthetic */ C12473g f32805f;

            /* renamed from: rx.n.a.z0$a$a$a */
            /* compiled from: OperatorSubscribeOn */
            class C12703a implements C5377a {

                /* renamed from: f */
                final /* synthetic */ long f32807f;

                C12703a(long j) {
                    this.f32807f = j;
                }

                public void call() {
                    C12702a.this.f32805f.request(this.f32807f);
                }
            }

            C12702a(C12473g gVar) {
                this.f32805f = gVar;
            }

            public void request(long j) {
                if (C12701a.this.f32804j != Thread.currentThread()) {
                    C12701a aVar = C12701a.this;
                    if (aVar.f32801g) {
                        aVar.f32802h.mo18710a(new C12703a(j));
                        return;
                    }
                }
                this.f32805f.request(j);
            }
        }

        C12701a(C12475j<? super T> jVar, boolean z, C5373h.C5374a aVar, C5368e<T> eVar) {
            this.f32800f = jVar;
            this.f32801g = z;
            this.f32802h = aVar;
            this.f32803i = eVar;
        }

        public void call() {
            C5368e<T> eVar = this.f32803i;
            this.f32803i = null;
            this.f32804j = Thread.currentThread();
            eVar.mo18668b((C12475j<? super T>) this);
        }

        public void onCompleted() {
            try {
                this.f32800f.onCompleted();
            } finally {
                this.f32802h.unsubscribe();
            }
        }

        public void onError(Throwable th) {
            try {
                this.f32800f.onError(th);
            } finally {
                this.f32802h.unsubscribe();
            }
        }

        public void onNext(T t) {
            this.f32800f.onNext(t);
        }

        public void setProducer(C12473g gVar) {
            this.f32800f.setProducer(new C12702a(gVar));
        }
    }

    public C12700z0(C5368e<T> eVar, C5373h hVar, boolean z) {
        this.f32797f = hVar;
        this.f32798g = eVar;
        this.f32799h = z;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C5373h.C5374a createWorker = this.f32797f.createWorker();
        C12701a aVar = new C12701a(jVar, this.f32799h, createWorker, this.f32798g);
        jVar.add(aVar);
        jVar.add(createWorker);
        createWorker.mo18710a(aVar);
    }
}
