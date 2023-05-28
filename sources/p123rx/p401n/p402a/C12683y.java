package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12465d;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p127s.C12874c;
import p123rx.p127s.C5380a;
import p123rx.p127s.C5382d;
import p123rx.p128t.C12888d;
import p123rx.p401n.p403b.C12704a;
import p123rx.p410p.C12839f;
import p123rx.schedulers.Schedulers;

/* renamed from: rx.n.a.y */
/* compiled from: OnSubscribeRedo */
public final class C12683y<T> implements C5368e.C5370a<T> {

    /* renamed from: k */
    static final C5379n<C5368e<? extends C12465d<?>>, C5368e<?>> f32750k = new C12684a();

    /* renamed from: f */
    final C5368e<T> f32751f;

    /* renamed from: g */
    private final C5379n<? super C5368e<? extends C12465d<?>>, ? extends C5368e<?>> f32752g;

    /* renamed from: h */
    final boolean f32753h;

    /* renamed from: i */
    final boolean f32754i;

    /* renamed from: j */
    private final C5373h f32755j;

    /* renamed from: rx.n.a.y$a */
    /* compiled from: OnSubscribeRedo */
    static class C12684a implements C5379n<C5368e<? extends C12465d<?>>, C5368e<?>> {

        /* renamed from: rx.n.a.y$a$a */
        /* compiled from: OnSubscribeRedo */
        class C12685a implements C5379n<C12465d<?>, C12465d<?>> {
            C12685a(C12684a aVar) {
            }

            /* renamed from: a */
            public C12465d<?> call(C12465d<?> dVar) {
                return C12465d.m40911a(null);
            }
        }

        C12684a() {
        }

        /* renamed from: a */
        public C5368e<?> call(C5368e<? extends C12465d<?>> eVar) {
            return eVar.mo18694j(new C12685a(this));
        }
    }

    /* renamed from: rx.n.a.y$b */
    /* compiled from: OnSubscribeRedo */
    class C12686b implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C12475j f32756f;

        /* renamed from: g */
        final /* synthetic */ C5382d f32757g;

        /* renamed from: h */
        final /* synthetic */ C12704a f32758h;

        /* renamed from: i */
        final /* synthetic */ AtomicLong f32759i;

        /* renamed from: j */
        final /* synthetic */ C12888d f32760j;

        /* renamed from: rx.n.a.y$b$a */
        /* compiled from: OnSubscribeRedo */
        class C12687a extends C12475j<T> {

            /* renamed from: f */
            boolean f32762f;

            C12687a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m41174a() {
                /*
                    r5 = this;
                L_0x0000:
                    rx.n.a.y$b r0 = p123rx.p401n.p402a.C12683y.C12686b.this
                    java.util.concurrent.atomic.AtomicLong r0 = r0.f32759i
                    long r0 = r0.get()
                    r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 == 0) goto L_0x001f
                    rx.n.a.y$b r2 = p123rx.p401n.p402a.C12683y.C12686b.this
                    java.util.concurrent.atomic.AtomicLong r2 = r2.f32759i
                    r3 = 1
                    long r3 = r0 - r3
                    boolean r0 = r2.compareAndSet(r0, r3)
                    if (r0 == 0) goto L_0x0000
                L_0x001f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12683y.C12686b.C12687a.m41174a():void");
            }

            public void onCompleted() {
                if (!this.f32762f) {
                    this.f32762f = true;
                    unsubscribe();
                    C12686b.this.f32757g.onNext(C12465d.m40913i());
                }
            }

            public void onError(Throwable th) {
                if (!this.f32762f) {
                    this.f32762f = true;
                    unsubscribe();
                    C12686b.this.f32757g.onNext(C12465d.m40912a(th));
                }
            }

            public void onNext(T t) {
                if (!this.f32762f) {
                    C12686b.this.f32756f.onNext(t);
                    m41174a();
                    C12686b.this.f32758h.mo40844a(1);
                }
            }

            public void setProducer(C12473g gVar) {
                C12686b.this.f32758h.mo40845a(gVar);
            }
        }

        C12686b(C12475j jVar, C5382d dVar, C12704a aVar, AtomicLong atomicLong, C12888d dVar2) {
            this.f32756f = jVar;
            this.f32757g = dVar;
            this.f32758h = aVar;
            this.f32759i = atomicLong;
            this.f32760j = dVar2;
        }

        public void call() {
            if (!this.f32756f.isUnsubscribed()) {
                C12687a aVar = new C12687a();
                this.f32760j.mo41109a(aVar);
                C12683y.this.f32751f.mo18668b(aVar);
            }
        }
    }

    /* renamed from: rx.n.a.y$c */
    /* compiled from: OnSubscribeRedo */
    class C12688c implements C5368e.C5371b<C12465d<?>, C12465d<?>> {

        /* renamed from: rx.n.a.y$c$a */
        /* compiled from: OnSubscribeRedo */
        class C12689a extends C12475j<C12465d<?>> {

            /* renamed from: f */
            final /* synthetic */ C12475j f32765f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12689a(C12475j jVar, C12475j jVar2) {
                super(jVar);
                this.f32765f = jVar2;
            }

            /* renamed from: a */
            public void onNext(C12465d<?> dVar) {
                if (dVar.mo40638f() && C12683y.this.f32753h) {
                    this.f32765f.onCompleted();
                } else if (!dVar.mo40639g() || !C12683y.this.f32754i) {
                    this.f32765f.onNext(dVar);
                } else {
                    this.f32765f.onError(dVar.mo40633b());
                }
            }

            public void onCompleted() {
                this.f32765f.onCompleted();
            }

            public void onError(Throwable th) {
                this.f32765f.onError(th);
            }

            public void setProducer(C12473g gVar) {
                gVar.request(Long.MAX_VALUE);
            }
        }

        C12688c() {
        }

        /* renamed from: a */
        public C12475j<? super C12465d<?>> call(C12475j<? super C12465d<?>> jVar) {
            return new C12689a(jVar, jVar);
        }
    }

    /* renamed from: rx.n.a.y$d */
    /* compiled from: OnSubscribeRedo */
    class C12690d implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C5368e f32767f;

        /* renamed from: g */
        final /* synthetic */ C12475j f32768g;

        /* renamed from: h */
        final /* synthetic */ AtomicLong f32769h;

        /* renamed from: i */
        final /* synthetic */ C5373h.C5374a f32770i;

        /* renamed from: j */
        final /* synthetic */ C5377a f32771j;

        /* renamed from: k */
        final /* synthetic */ AtomicBoolean f32772k;

        /* renamed from: rx.n.a.y$d$a */
        /* compiled from: OnSubscribeRedo */
        class C12691a extends C12475j<Object> {
            C12691a(C12475j jVar) {
                super(jVar);
            }

            public void onCompleted() {
                C12690d.this.f32768g.onCompleted();
            }

            public void onError(Throwable th) {
                C12690d.this.f32768g.onError(th);
            }

            public void onNext(Object obj) {
                if (C12690d.this.f32768g.isUnsubscribed()) {
                    return;
                }
                if (C12690d.this.f32769h.get() > 0) {
                    C12690d dVar = C12690d.this;
                    dVar.f32770i.mo18710a(dVar.f32771j);
                    return;
                }
                C12690d.this.f32772k.compareAndSet(false, true);
            }

            public void setProducer(C12473g gVar) {
                gVar.request(Long.MAX_VALUE);
            }
        }

        C12690d(C12683y yVar, C5368e eVar, C12475j jVar, AtomicLong atomicLong, C5373h.C5374a aVar, C5377a aVar2, AtomicBoolean atomicBoolean) {
            this.f32767f = eVar;
            this.f32768g = jVar;
            this.f32769h = atomicLong;
            this.f32770i = aVar;
            this.f32771j = aVar2;
            this.f32772k = atomicBoolean;
        }

        public void call() {
            this.f32767f.mo18668b(new C12691a(this.f32768g));
        }
    }

    /* renamed from: rx.n.a.y$e */
    /* compiled from: OnSubscribeRedo */
    class C12692e implements C12473g {

        /* renamed from: f */
        final /* synthetic */ AtomicLong f32774f;

        /* renamed from: g */
        final /* synthetic */ C12704a f32775g;

        /* renamed from: h */
        final /* synthetic */ AtomicBoolean f32776h;

        /* renamed from: i */
        final /* synthetic */ C5373h.C5374a f32777i;

        /* renamed from: j */
        final /* synthetic */ C5377a f32778j;

        C12692e(C12683y yVar, AtomicLong atomicLong, C12704a aVar, AtomicBoolean atomicBoolean, C5373h.C5374a aVar2, C5377a aVar3) {
            this.f32774f = atomicLong;
            this.f32775g = aVar;
            this.f32776h = atomicBoolean;
            this.f32777i = aVar2;
            this.f32778j = aVar3;
        }

        public void request(long j) {
            if (j > 0) {
                C12502a.m40960a(this.f32774f, j);
                this.f32775g.request(j);
                if (this.f32776h.compareAndSet(true, false)) {
                    this.f32777i.mo18710a(this.f32778j);
                }
            }
        }
    }

    private C12683y(C5368e<T> eVar, C5379n<? super C5368e<? extends C12465d<?>>, ? extends C5368e<?>> nVar, boolean z, boolean z2, C5373h hVar) {
        this.f32751f = eVar;
        this.f32752g = nVar;
        this.f32753h = z;
        this.f32754i = z2;
        this.f32755j = hVar;
    }

    /* renamed from: a */
    public static <T> C5368e<T> m41169a(C5368e<T> eVar) {
        return m41170a(eVar, f32750k);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m41170a(C5368e<T> eVar, C5379n<? super C5368e<? extends C12465d<?>>, ? extends C5368e<?>> nVar) {
        return C5368e.m10253b(new C12683y(eVar, nVar, true, false, Schedulers.trampoline()));
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        C5373h.C5374a createWorker = this.f32755j.createWorker();
        jVar.add(createWorker);
        C12888d dVar = new C12888d();
        jVar.add(dVar);
        C12874c o = C5380a.m10348p().mo18717o();
        o.mo18654a(C12839f.m41392a());
        C12704a aVar = new C12704a();
        C12475j<? super T> jVar2 = jVar;
        C5373h.C5374a aVar2 = createWorker;
        C12686b bVar = new C12686b(jVar2, o, aVar, atomicLong, dVar);
        createWorker.mo18710a(new C12690d(this, (C5368e) this.f32752g.call(o.mo18640a(new C12688c())), jVar2, atomicLong, aVar2, bVar, atomicBoolean));
        jVar.setProducer(new C12692e(this, atomicLong, aVar, atomicBoolean, aVar2, bVar));
    }
}
