package p123rx;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.CompositeException;
import p123rx.p126m.C12492l;
import p123rx.p126m.C12495m;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.p128t.C12885a;
import p123rx.p128t.C12887c;
import p123rx.p128t.C12888d;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p401n.p402a.C12530d;
import p123rx.p401n.p402a.C12544f;
import p123rx.p401n.p406e.C12791l;
import p123rx.p401n.p406e.C12792m;
import p123rx.p410p.C12834b;
import p123rx.p411q.C12844c;
import p123rx.schedulers.Schedulers;

/* renamed from: rx.b */
/* compiled from: Completable */
public class C5328b {

    /* renamed from: b */
    static final C5328b f9565b = new C5328b(new C5341f(), false);

    /* renamed from: c */
    static final C5328b f9566c = new C5328b(new C5354m(), false);

    /* renamed from: a */
    private final C5366w f9567a;

    /* renamed from: rx.b$a */
    /* compiled from: Completable */
    static class C5329a implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5368e f9568f;

        /* renamed from: rx.b$a$a */
        /* compiled from: Completable */
        class C5330a extends C12475j<Object> {

            /* renamed from: f */
            final /* synthetic */ C12464c f9569f;

            C5330a(C5329a aVar, C12464c cVar) {
                this.f9569f = cVar;
            }

            public void onCompleted() {
                this.f9569f.onCompleted();
            }

            public void onError(Throwable th) {
                this.f9569f.onError(th);
            }

            public void onNext(Object obj) {
            }
        }

        C5329a(C5368e eVar) {
            this.f9568f = eVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5330a aVar = new C5330a(this, cVar);
            cVar.mo18613a(aVar);
            this.f9568f.mo18668b(aVar);
        }
    }

    /* renamed from: rx.b$b */
    /* compiled from: Completable */
    static class C5331b implements C5366w {

        /* renamed from: f */
        final /* synthetic */ Single f9570f;

        /* renamed from: rx.b$b$a */
        /* compiled from: Completable */
        class C5332a extends C12474i<Object> {

            /* renamed from: g */
            final /* synthetic */ C12464c f9571g;

            C5332a(C5331b bVar, C12464c cVar) {
                this.f9571g = cVar;
            }

            /* renamed from: a */
            public void mo18573a(Object obj) {
                this.f9571g.onCompleted();
            }

            public void onError(Throwable th) {
                this.f9571g.onError(th);
            }
        }

        C5331b(Single single) {
            this.f9570f = single;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5332a aVar = new C5332a(this, cVar);
            cVar.mo18613a(aVar);
            this.f9570f.mo18560a(aVar);
        }
    }

    /* renamed from: rx.b$c */
    /* compiled from: Completable */
    class C5333c implements C12464c {

        /* renamed from: f */
        final /* synthetic */ CountDownLatch f9572f;

        /* renamed from: g */
        final /* synthetic */ Throwable[] f9573g;

        C5333c(C5328b bVar, CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f9572f = countDownLatch;
            this.f9573g = thArr;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
        }

        public void onCompleted() {
            this.f9572f.countDown();
        }

        public void onError(Throwable th) {
            this.f9573g[0] = th;
            this.f9572f.countDown();
        }
    }

    /* renamed from: rx.b$d */
    /* compiled from: Completable */
    class C5334d implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5373h f9574f;

        /* renamed from: g */
        final /* synthetic */ long f9575g;

        /* renamed from: h */
        final /* synthetic */ TimeUnit f9576h;

        /* renamed from: i */
        final /* synthetic */ boolean f9577i;

        /* renamed from: rx.b$d$a */
        /* compiled from: Completable */
        class C5335a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C5383b f9579f;

            /* renamed from: g */
            final /* synthetic */ C5373h.C5374a f9580g;

            /* renamed from: h */
            final /* synthetic */ C12464c f9581h;

            /* renamed from: rx.b$d$a$a */
            /* compiled from: Completable */
            class C5336a implements C5377a {
                C5336a() {
                }

                public void call() {
                    try {
                        C5335a.this.f9581h.onCompleted();
                    } finally {
                        C5335a.this.f9580g.unsubscribe();
                    }
                }
            }

            /* renamed from: rx.b$d$a$b */
            /* compiled from: Completable */
            class C5337b implements C5377a {

                /* renamed from: f */
                final /* synthetic */ Throwable f9584f;

                C5337b(Throwable th) {
                    this.f9584f = th;
                }

                public void call() {
                    try {
                        C5335a.this.f9581h.onError(this.f9584f);
                    } finally {
                        C5335a.this.f9580g.unsubscribe();
                    }
                }
            }

            C5335a(C5383b bVar, C5373h.C5374a aVar, C12464c cVar) {
                this.f9579f = bVar;
                this.f9580g = aVar;
                this.f9581h = cVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                this.f9579f.mo18721a(kVar);
                this.f9581h.mo18613a(this.f9579f);
            }

            public void onCompleted() {
                C5383b bVar = this.f9579f;
                C5373h.C5374a aVar = this.f9580g;
                C5336a aVar2 = new C5336a();
                C5334d dVar = C5334d.this;
                bVar.mo18721a(aVar.mo18712a(aVar2, dVar.f9575g, dVar.f9576h));
            }

            public void onError(Throwable th) {
                if (C5334d.this.f9577i) {
                    C5383b bVar = this.f9579f;
                    C5373h.C5374a aVar = this.f9580g;
                    C5337b bVar2 = new C5337b(th);
                    C5334d dVar = C5334d.this;
                    bVar.mo18721a(aVar.mo18712a(bVar2, dVar.f9575g, dVar.f9576h));
                    return;
                }
                this.f9581h.onError(th);
            }
        }

        C5334d(C5373h hVar, long j, TimeUnit timeUnit, boolean z) {
            this.f9574f = hVar;
            this.f9575g = j;
            this.f9576h = timeUnit;
            this.f9577i = z;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5383b bVar = new C5383b();
            C5373h.C5374a createWorker = this.f9574f.createWorker();
            bVar.mo18721a((C5375k) createWorker);
            C5328b.this.mo18604b((C12464c) new C5335a(bVar, createWorker, cVar));
        }
    }

    /* renamed from: rx.b$e */
    /* compiled from: Completable */
    class C5338e implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5377a f9586f;

        /* renamed from: g */
        final /* synthetic */ C5377a f9587g;

        /* renamed from: h */
        final /* synthetic */ C5378b f9588h;

        /* renamed from: i */
        final /* synthetic */ C5378b f9589i;

        /* renamed from: j */
        final /* synthetic */ C5377a f9590j;

        /* renamed from: rx.b$e$a */
        /* compiled from: Completable */
        class C5339a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C12464c f9592f;

            /* renamed from: rx.b$e$a$a */
            /* compiled from: Completable */
            class C5340a implements C5377a {

                /* renamed from: f */
                final /* synthetic */ C5375k f9594f;

                C5340a(C5375k kVar) {
                    this.f9594f = kVar;
                }

                public void call() {
                    try {
                        C5338e.this.f9590j.call();
                    } catch (Throwable th) {
                        C12844c.m41417b(th);
                    }
                    this.f9594f.unsubscribe();
                }
            }

            C5339a(C12464c cVar) {
                this.f9592f = cVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                try {
                    C5338e.this.f9589i.call(kVar);
                    this.f9592f.mo18613a(C12889e.m41501a(new C5340a(kVar)));
                } catch (Throwable th) {
                    kVar.unsubscribe();
                    this.f9592f.mo18613a(C12889e.m41502b());
                    this.f9592f.onError(th);
                }
            }

            public void onCompleted() {
                try {
                    C5338e.this.f9586f.call();
                    this.f9592f.onCompleted();
                    try {
                        C5338e.this.f9587g.call();
                    } catch (Throwable th) {
                        C12844c.m41417b(th);
                    }
                } catch (Throwable th2) {
                    this.f9592f.onError(th2);
                }
            }

            public void onError(Throwable th) {
                try {
                    C5338e.this.f9588h.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, th2}));
                }
                this.f9592f.onError(th);
                try {
                    C5338e.this.f9587g.call();
                } catch (Throwable th3) {
                    C12844c.m41417b(th3);
                }
            }
        }

        C5338e(C5377a aVar, C5377a aVar2, C5378b bVar, C5378b bVar2, C5377a aVar3) {
            this.f9586f = aVar;
            this.f9587g = aVar2;
            this.f9588h = bVar;
            this.f9589i = bVar2;
            this.f9590j = aVar3;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5328b.this.mo18604b((C12464c) new C5339a(cVar));
        }
    }

    /* renamed from: rx.b$f */
    /* compiled from: Completable */
    static class C5341f implements C5366w {
        C5341f() {
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            cVar.mo18613a(C12889e.m41502b());
            cVar.onCompleted();
        }
    }

    /* renamed from: rx.b$g */
    /* compiled from: Completable */
    class C5342g implements C5378b<Throwable> {

        /* renamed from: f */
        final /* synthetic */ C5377a f9596f;

        C5342g(C5328b bVar, C5377a aVar) {
            this.f9596f = aVar;
        }

        /* renamed from: a */
        public void call(Throwable th) {
            this.f9596f.call();
        }
    }

    /* renamed from: rx.b$h */
    /* compiled from: Completable */
    class C5343h implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5373h f9597f;

        /* renamed from: rx.b$h$a */
        /* compiled from: Completable */
        class C5344a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C5373h.C5374a f9599f;

            /* renamed from: g */
            final /* synthetic */ C12464c f9600g;

            /* renamed from: h */
            final /* synthetic */ C12791l f9601h;

            /* renamed from: rx.b$h$a$a */
            /* compiled from: Completable */
            class C5345a implements C5377a {
                C5345a() {
                }

                public void call() {
                    try {
                        C5344a.this.f9600g.onCompleted();
                    } finally {
                        C5344a.this.f9601h.unsubscribe();
                    }
                }
            }

            /* renamed from: rx.b$h$a$b */
            /* compiled from: Completable */
            class C5346b implements C5377a {

                /* renamed from: f */
                final /* synthetic */ Throwable f9603f;

                C5346b(Throwable th) {
                    this.f9603f = th;
                }

                public void call() {
                    try {
                        C5344a.this.f9600g.onError(this.f9603f);
                    } finally {
                        C5344a.this.f9601h.unsubscribe();
                    }
                }
            }

            C5344a(C5343h hVar, C5373h.C5374a aVar, C12464c cVar, C12791l lVar) {
                this.f9599f = aVar;
                this.f9600g = cVar;
                this.f9601h = lVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                this.f9601h.mo40914a(kVar);
            }

            public void onCompleted() {
                this.f9599f.mo18710a(new C5345a());
            }

            public void onError(Throwable th) {
                this.f9599f.mo18710a(new C5346b(th));
            }
        }

        C5343h(C5373h hVar) {
            this.f9597f = hVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C12791l lVar = new C12791l();
            C5373h.C5374a createWorker = this.f9597f.createWorker();
            lVar.mo40914a((C5375k) createWorker);
            cVar.mo18613a(lVar);
            C5328b.this.mo18604b((C12464c) new C5344a(this, createWorker, cVar, lVar));
        }
    }

    /* renamed from: rx.b$i */
    /* compiled from: Completable */
    class C5347i implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5379n f9605f;

        /* renamed from: rx.b$i$a */
        /* compiled from: Completable */
        class C5348a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C12464c f9607f;

            C5348a(C12464c cVar) {
                this.f9607f = cVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                this.f9607f.mo18613a(kVar);
            }

            public void onCompleted() {
                this.f9607f.onCompleted();
            }

            public void onError(Throwable th) {
                boolean z = false;
                try {
                    z = ((Boolean) C5347i.this.f9605f.call(th)).booleanValue();
                } catch (Throwable th2) {
                    C12472a.m40945c(th2);
                    th = new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, th2}));
                }
                if (z) {
                    this.f9607f.onCompleted();
                } else {
                    this.f9607f.onError(th);
                }
            }
        }

        C5347i(C5379n nVar) {
            this.f9605f = nVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5328b.this.mo18604b((C12464c) new C5348a(cVar));
        }
    }

    /* renamed from: rx.b$j */
    /* compiled from: Completable */
    class C5349j implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5379n f9609f;

        /* renamed from: rx.b$j$a */
        /* compiled from: Completable */
        class C5350a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C12464c f9611f;

            /* renamed from: g */
            final /* synthetic */ C12888d f9612g;

            /* renamed from: rx.b$j$a$a */
            /* compiled from: Completable */
            class C5351a implements C12464c {
                C5351a() {
                }

                /* renamed from: a */
                public void mo18613a(C5375k kVar) {
                    C5350a.this.f9612g.mo41109a(kVar);
                }

                public void onCompleted() {
                    C5350a.this.f9611f.onCompleted();
                }

                public void onError(Throwable th) {
                    C5350a.this.f9611f.onError(th);
                }
            }

            C5350a(C12464c cVar, C12888d dVar) {
                this.f9611f = cVar;
                this.f9612g = dVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                this.f9612g.mo41109a(kVar);
            }

            public void onCompleted() {
                this.f9611f.onCompleted();
            }

            public void onError(Throwable th) {
                try {
                    C5328b bVar = (C5328b) C5349j.this.f9609f.call(th);
                    if (bVar == null) {
                        this.f9611f.onError(new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, new NullPointerException("The completable returned is null")})));
                        return;
                    }
                    bVar.mo18604b((C12464c) new C5351a());
                } catch (Throwable th2) {
                    this.f9611f.onError(new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, th2})));
                }
            }
        }

        C5349j(C5379n nVar) {
            this.f9609f = nVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C12888d dVar = new C12888d();
            cVar.mo18613a(dVar);
            C5328b.this.mo18604b((C12464c) new C5350a(cVar, dVar));
        }
    }

    /* renamed from: rx.b$k */
    /* compiled from: Completable */
    class C5352k implements C12464c {

        /* renamed from: f */
        final /* synthetic */ C12887c f9615f;

        C5352k(C5328b bVar, C12887c cVar) {
            this.f9615f = cVar;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f9615f.mo41107a(kVar);
        }

        public void onCompleted() {
            this.f9615f.unsubscribe();
        }

        public void onError(Throwable th) {
            C12844c.m41417b(th);
            this.f9615f.unsubscribe();
            C5328b.m10160a(th);
        }
    }

    /* renamed from: rx.b$m */
    /* compiled from: Completable */
    static class C5354m implements C5366w {
        C5354m() {
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            cVar.mo18613a(C12889e.m41502b());
        }
    }

    /* renamed from: rx.b$n */
    /* compiled from: Completable */
    class C5355n implements C12464c {

        /* renamed from: f */
        final /* synthetic */ C12475j f9620f;

        C5355n(C5328b bVar, C12475j jVar) {
            this.f9620f = jVar;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f9620f.add(kVar);
        }

        public void onCompleted() {
            this.f9620f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f9620f.onError(th);
        }
    }

    /* renamed from: rx.b$o */
    /* compiled from: Completable */
    class C5356o implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5373h f9621f;

        /* renamed from: rx.b$o$a */
        /* compiled from: Completable */
        class C5357a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12464c f9623f;

            /* renamed from: g */
            final /* synthetic */ C5373h.C5374a f9624g;

            C5357a(C12464c cVar, C5373h.C5374a aVar) {
                this.f9623f = cVar;
                this.f9624g = aVar;
            }

            public void call() {
                try {
                    C5328b.this.mo18604b(this.f9623f);
                } finally {
                    this.f9624g.unsubscribe();
                }
            }
        }

        C5356o(C5373h hVar) {
            this.f9621f = hVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C5373h.C5374a createWorker = this.f9621f.createWorker();
            createWorker.mo18710a(new C5357a(cVar, createWorker));
        }
    }

    /* renamed from: rx.b$p */
    /* compiled from: Completable */
    class C5358p implements C5368e.C5370a<T> {
        C5358p() {
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            C5328b.this.mo18597a(jVar);
        }
    }

    /* renamed from: rx.b$q */
    /* compiled from: Completable */
    class C5359q implements Single.C5327j<T> {

        /* renamed from: f */
        final /* synthetic */ C12495m f9627f;

        /* renamed from: rx.b$q$a */
        /* compiled from: Completable */
        class C5360a implements C12464c {

            /* renamed from: f */
            final /* synthetic */ C12474i f9629f;

            C5360a(C12474i iVar) {
                this.f9629f = iVar;
            }

            /* renamed from: a */
            public void mo18613a(C5375k kVar) {
                this.f9629f.mo40654b(kVar);
            }

            public void onCompleted() {
                try {
                    Object call = C5359q.this.f9627f.call();
                    if (call == null) {
                        this.f9629f.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f9629f.mo18573a(call);
                    }
                } catch (Throwable th) {
                    this.f9629f.onError(th);
                }
            }

            public void onError(Throwable th) {
                this.f9629f.onError(th);
            }
        }

        C5359q(C12495m mVar) {
            this.f9627f = mVar;
        }

        /* renamed from: a */
        public void call(C12474i<? super T> iVar) {
            C5328b.this.mo18604b((C12464c) new C5360a(iVar));
        }
    }

    /* renamed from: rx.b$r */
    /* compiled from: Completable */
    class C5361r implements C12495m<T> {

        /* renamed from: f */
        final /* synthetic */ Object f9631f;

        C5361r(C5328b bVar, Object obj) {
            this.f9631f = obj;
        }

        public T call() {
            return this.f9631f;
        }
    }

    /* renamed from: rx.b$s */
    /* compiled from: Completable */
    static class C5362s implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C12495m f9632f;

        C5362s(C12495m mVar) {
            this.f9632f = mVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            try {
                C5328b bVar = (C5328b) this.f9632f.call();
                if (bVar == null) {
                    cVar.mo18613a(C12889e.m41502b());
                    cVar.onError(new NullPointerException("The completable returned is null"));
                    return;
                }
                bVar.mo18604b(cVar);
            } catch (Throwable th) {
                cVar.mo18613a(C12889e.m41502b());
                cVar.onError(th);
            }
        }
    }

    /* renamed from: rx.b$t */
    /* compiled from: Completable */
    static class C5363t implements C5366w {

        /* renamed from: f */
        final /* synthetic */ Throwable f9633f;

        C5363t(Throwable th) {
            this.f9633f = th;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            cVar.mo18613a(C12889e.m41502b());
            cVar.onError(this.f9633f);
        }
    }

    /* renamed from: rx.b$u */
    /* compiled from: Completable */
    static class C5364u implements C5366w {

        /* renamed from: f */
        final /* synthetic */ C5377a f9634f;

        C5364u(C5377a aVar) {
            this.f9634f = aVar;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C12885a aVar = new C12885a();
            cVar.mo18613a(aVar);
            try {
                this.f9634f.call();
                if (!aVar.isUnsubscribed()) {
                    cVar.onCompleted();
                }
            } catch (Throwable th) {
                if (!aVar.isUnsubscribed()) {
                    cVar.onError(th);
                }
            }
        }
    }

    /* renamed from: rx.b$v */
    /* compiled from: Completable */
    static class C5365v implements C5366w {

        /* renamed from: f */
        final /* synthetic */ Callable f9635f;

        C5365v(Callable callable) {
            this.f9635f = callable;
        }

        /* renamed from: a */
        public void call(C12464c cVar) {
            C12885a aVar = new C12885a();
            cVar.mo18613a(aVar);
            try {
                this.f9635f.call();
                if (!aVar.isUnsubscribed()) {
                    cVar.onCompleted();
                }
            } catch (Throwable th) {
                if (!aVar.isUnsubscribed()) {
                    cVar.onError(th);
                }
            }
        }
    }

    /* renamed from: rx.b$w */
    /* compiled from: Completable */
    public interface C5366w extends C5378b<C12464c> {
    }

    /* renamed from: rx.b$x */
    /* compiled from: Completable */
    public interface C5367x extends C5379n<C12464c, C12464c> {
    }

    protected C5328b(C5366w wVar) {
        this.f9567a = C12844c.m41405a(wVar);
    }

    /* renamed from: a */
    public static C5328b m10159a(C5328b... bVarArr) {
        m10162b(bVarArr);
        if (bVarArr.length == 0) {
            return m10170f();
        }
        if (bVarArr.length == 1) {
            return bVarArr[0];
        }
        return m10158a((C5366w) new C12530d(bVarArr));
    }

    /* renamed from: b */
    public static C5328b m10166b(C12495m<? extends C5328b> mVar) {
        m10162b(mVar);
        return m10158a((C5366w) new C5362s(mVar));
    }

    /* renamed from: c */
    static NullPointerException m10168c(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: d */
    public static C5328b m10169d(C5377a aVar) {
        m10162b(aVar);
        return m10158a((C5366w) new C5364u(aVar));
    }

    /* renamed from: f */
    public static C5328b m10170f() {
        C5366w a = C12844c.m41405a(f9565b.f9567a);
        C5328b bVar = f9565b;
        if (a == bVar.f9567a) {
            return bVar;
        }
        return new C5328b(a, false);
    }

    /* renamed from: g */
    public static C5328b m10171g() {
        C5366w a = C12844c.m41405a(f9566c.f9567a);
        C5328b bVar = f9566c;
        if (a == bVar.f9567a) {
            return bVar;
        }
        return new C5328b(a, false);
    }

    /* renamed from: e */
    public final <T> C5368e<T> mo18610e() {
        return C5368e.m10253b(new C5358p());
    }

    protected C5328b(C5366w wVar, boolean z) {
        this.f9567a = z ? C12844c.m41405a(wVar) : wVar;
    }

    /* renamed from: b */
    public static C5328b m10163b(Throwable th) {
        m10162b(th);
        return m10158a((C5366w) new C5363t(th));
    }

    /* renamed from: c */
    public final C5328b mo18607c(C5377a aVar) {
        return mo18591a(C12492l.m40956a(), C12492l.m40956a(), C12492l.m40956a(), C12492l.m40956a(), aVar);
    }

    /* renamed from: d */
    public final C5375k mo18609d() {
        C12887c cVar = new C12887c();
        mo18604b((C12464c) new C5352k(this, cVar));
        return cVar;
    }

    /* renamed from: c */
    public final C5328b mo18605c() {
        return m10165b((C5368e<?>) mo18610e().mo18686f());
    }

    /* renamed from: b */
    public static C5328b m10165b(C5368e<?> eVar) {
        m10162b(eVar);
        return m10158a((C5366w) new C5329a(eVar));
    }

    /* renamed from: c */
    public final C5328b mo18608c(C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>> nVar) {
        return m10165b((C5368e<?>) mo18610e().mo18701m(nVar));
    }

    /* renamed from: rx.b$l */
    /* compiled from: Completable */
    class C5353l implements C12464c {

        /* renamed from: f */
        boolean f9616f;

        /* renamed from: g */
        final /* synthetic */ C5377a f9617g;

        /* renamed from: h */
        final /* synthetic */ C12887c f9618h;

        /* renamed from: i */
        final /* synthetic */ C5378b f9619i;

        C5353l(C5328b bVar, C5377a aVar, C12887c cVar, C5378b bVar2) {
            this.f9617g = aVar;
            this.f9618h = cVar;
            this.f9619i = bVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18623a(Throwable th) {
            try {
                this.f9619i.call(th);
            } catch (Throwable th2) {
                this.f9618h.unsubscribe();
                throw th2;
            }
            this.f9618h.unsubscribe();
        }

        public void onCompleted() {
            if (!this.f9616f) {
                this.f9616f = true;
                try {
                    this.f9617g.call();
                    this.f9618h.unsubscribe();
                } catch (Throwable th) {
                    mo18623a(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f9616f) {
                this.f9616f = true;
                mo18623a(th);
                return;
            }
            C12844c.m41417b(th);
            C5328b.m10160a(th);
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f9618h.mo41107a(kVar);
        }
    }

    /* renamed from: c */
    public final C5328b mo18606c(C5328b bVar) {
        m10162b(bVar);
        return m10159a(bVar, this);
    }

    /* renamed from: a */
    public static C5328b m10158a(C5366w wVar) {
        m10162b(wVar);
        try {
            return new C5328b(wVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12844c.m41417b(th);
            throw m10168c(th);
        }
    }

    /* renamed from: b */
    public static C5328b m10164b(Single<?> single) {
        m10162b(single);
        return m10158a((C5366w) new C5331b(single));
    }

    /* renamed from: b */
    public static C5328b m10167b(C5328b... bVarArr) {
        m10162b(bVarArr);
        return m10158a((C5366w) new C12544f(bVarArr));
    }

    /* renamed from: b */
    static <T> T m10162b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static C5328b m10157a(Callable<?> callable) {
        m10162b(callable);
        return m10158a((C5366w) new C5365v(callable));
    }

    /* renamed from: b */
    public final C5328b mo18599b(C5328b bVar) {
        m10162b(bVar);
        return m10159a(this, bVar);
    }

    /* renamed from: a */
    public final void mo18595a() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        mo18604b((C12464c) new C5333c(this, countDownLatch, thArr));
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    C12472a.m40944b(thArr[0]);
                    throw null;
                }
            } catch (InterruptedException e) {
                C12472a.m40944b(e);
                throw null;
            }
        } else if (thArr[0] != null) {
            C12472a.m40944b(thArr[0]);
            throw null;
        }
    }

    /* renamed from: b */
    public final C5328b mo18602b(C5378b<? super C5375k> bVar) {
        return mo18591a(bVar, C12492l.m40956a(), C12492l.m40956a(), C12492l.m40956a(), C12492l.m40956a());
    }

    /* renamed from: b */
    public final C5328b mo18601b(C5377a aVar) {
        return mo18591a(C12492l.m40956a(), new C5342g(this, aVar), aVar, C12492l.m40956a(), C12492l.m40956a());
    }

    /* renamed from: b */
    public final C5328b mo18598b() {
        return mo18592a((C5379n<? super Throwable, Boolean>) C12792m.m41298a());
    }

    /* renamed from: b */
    public final C5328b mo18603b(C5379n<? super Throwable, ? extends C5328b> nVar) {
        m10162b(nVar);
        return m10158a((C5366w) new C5349j(nVar));
    }

    /* renamed from: b */
    public final void mo18604b(C12464c cVar) {
        m10162b(cVar);
        try {
            C12844c.m41406a(this, this.f9567a).call(cVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12472a.m40945c(th);
            Throwable a = C12844c.m41402a(th);
            C12844c.m41417b(a);
            throw m10168c(a);
        }
    }

    /* renamed from: a */
    public final <T> C5368e<T> mo18593a(C5368e<T> eVar) {
        m10162b(eVar);
        return eVar.mo18642a((C5368e<U>) mo18610e());
    }

    /* renamed from: a */
    public final <T> Single<T> mo18583a(Single<T> single) {
        m10162b(single);
        return single.mo18555a((C5368e<?>) mo18610e());
    }

    /* renamed from: a */
    public final C5328b mo18587a(C5328b bVar) {
        return mo18599b(bVar);
    }

    /* renamed from: a */
    public final C5328b mo18585a(long j, TimeUnit timeUnit) {
        return mo18586a(j, timeUnit, Schedulers.computation(), false);
    }

    /* renamed from: a */
    public final C5328b mo18586a(long j, TimeUnit timeUnit, C5373h hVar, boolean z) {
        m10162b(timeUnit);
        m10162b(hVar);
        return m10158a((C5366w) new C5334d(hVar, j, timeUnit, z));
    }

    /* renamed from: b */
    public final C5328b mo18600b(C5373h hVar) {
        m10162b(hVar);
        return m10158a((C5366w) new C5356o(hVar));
    }

    /* renamed from: a */
    public final C5328b mo18589a(C5377a aVar) {
        return mo18591a(C12492l.m40956a(), C12492l.m40956a(), aVar, C12492l.m40956a(), C12492l.m40956a());
    }

    /* renamed from: a */
    public final C5328b mo18590a(C5378b<? super Throwable> bVar) {
        return mo18591a(C12492l.m40956a(), bVar, C12492l.m40956a(), C12492l.m40956a(), C12492l.m40956a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5328b mo18591a(C5378b<? super C5375k> bVar, C5378b<? super Throwable> bVar2, C5377a aVar, C5377a aVar2, C5377a aVar3) {
        m10162b(bVar);
        m10162b(bVar2);
        m10162b(aVar);
        m10162b(aVar2);
        m10162b(aVar3);
        return m10158a((C5366w) new C5338e(aVar, aVar2, bVar2, bVar, aVar3));
    }

    /* renamed from: a */
    public final C5328b mo18588a(C5373h hVar) {
        m10162b(hVar);
        return m10158a((C5366w) new C5343h(hVar));
    }

    /* renamed from: a */
    public final C5328b mo18592a(C5379n<? super Throwable, Boolean> nVar) {
        m10162b(nVar);
        return m10158a((C5366w) new C5347i(nVar));
    }

    /* renamed from: a */
    public final C5375k mo18594a(C5377a aVar, C5378b<? super Throwable> bVar) {
        m10162b(aVar);
        m10162b(bVar);
        C12887c cVar = new C12887c();
        mo18604b((C12464c) new C5353l(this, aVar, cVar, bVar));
        return cVar;
    }

    /* renamed from: a */
    static void m10160a(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public final void mo18596a(C12464c cVar) {
        if (!(cVar instanceof C12834b)) {
            cVar = new C12834b(cVar);
        }
        mo18604b(cVar);
    }

    /* renamed from: a */
    public final <T> void mo18597a(C12475j<T> jVar) {
        m10161a(jVar, true);
    }

    /* renamed from: a */
    private <T> void m10161a(C12475j<T> jVar, boolean z) {
        m10162b(jVar);
        if (z) {
            try {
                jVar.onStart();
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C12472a.m40945c(th);
                Throwable c = C12844c.m41418c(th);
                C12844c.m41417b(c);
                throw m10168c(c);
            }
        }
        mo18604b((C12464c) new C5355n(this, jVar));
        C12844c.m41411a((C5375k) jVar);
    }

    /* renamed from: a */
    public final <T> Single<T> mo18584a(C12495m<? extends T> mVar) {
        m10162b(mVar);
        return Single.m10122a(new C5359q(mVar));
    }

    /* renamed from: a */
    public final <T> Single<T> mo18582a(T t) {
        m10162b(t);
        return mo18584a(new C5361r(this, t));
    }
}
