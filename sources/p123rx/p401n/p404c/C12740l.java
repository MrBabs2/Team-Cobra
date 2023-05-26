package p123rx.p401n.p404c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12464c;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p127s.C12871b;
import p123rx.p128t.C12889e;
import p123rx.p401n.p402a.C12512b;
import p123rx.p410p.C12836d;

/* renamed from: rx.n.c.l */
/* compiled from: SchedulerWhen */
public class C12740l extends C5373h implements C5375k {

    /* renamed from: i */
    static final C5375k f32907i = new C12744c();

    /* renamed from: j */
    static final C5375k f32908j = C12889e.m41502b();

    /* renamed from: f */
    private final C5373h f32909f;

    /* renamed from: g */
    private final C5372f<C5368e<C5328b>> f32910g;

    /* renamed from: h */
    private final C5375k f32911h;

    /* renamed from: rx.n.c.l$a */
    /* compiled from: SchedulerWhen */
    class C12741a implements C5379n<C12748g, C5328b> {

        /* renamed from: f */
        final /* synthetic */ C5373h.C5374a f32912f;

        /* renamed from: rx.n.c.l$a$a */
        /* compiled from: SchedulerWhen */
        class C12742a implements C5328b.C5366w {

            /* renamed from: f */
            final /* synthetic */ C12748g f32913f;

            C12742a(C12748g gVar) {
                this.f32913f = gVar;
            }

            /* renamed from: a */
            public void call(C12464c cVar) {
                cVar.mo18613a(this.f32913f);
                this.f32913f.m41238b(C12741a.this.f32912f, cVar);
            }
        }

        C12741a(C12740l lVar, C5373h.C5374a aVar) {
            this.f32912f = aVar;
        }

        /* renamed from: a */
        public C5328b call(C12748g gVar) {
            return C5328b.m10158a((C5328b.C5366w) new C12742a(gVar));
        }
    }

    /* renamed from: rx.n.c.l$c */
    /* compiled from: SchedulerWhen */
    static class C12744c implements C5375k {
        C12744c() {
        }

        public boolean isUnsubscribed() {
            return false;
        }

        public void unsubscribe() {
        }
    }

    /* renamed from: rx.n.c.l$d */
    /* compiled from: SchedulerWhen */
    static class C12745d extends C12748g {

        /* renamed from: f */
        private final C5377a f32918f;

        /* renamed from: g */
        private final long f32919g;

        /* renamed from: h */
        private final TimeUnit f32920h;

        public C12745d(C5377a aVar, long j, TimeUnit timeUnit) {
            this.f32918f = aVar;
            this.f32919g = j;
            this.f32920h = timeUnit;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5375k mo40874a(C5373h.C5374a aVar, C12464c cVar) {
            return aVar.mo18712a(new C12747f(this.f32918f, cVar), this.f32919g, this.f32920h);
        }
    }

    /* renamed from: rx.n.c.l$e */
    /* compiled from: SchedulerWhen */
    static class C12746e extends C12748g {

        /* renamed from: f */
        private final C5377a f32921f;

        public C12746e(C5377a aVar) {
            this.f32921f = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5375k mo40874a(C5373h.C5374a aVar, C12464c cVar) {
            return aVar.mo18710a(new C12747f(this.f32921f, cVar));
        }
    }

    /* renamed from: rx.n.c.l$f */
    /* compiled from: SchedulerWhen */
    static class C12747f implements C5377a {

        /* renamed from: f */
        private C12464c f32922f;

        /* renamed from: g */
        private C5377a f32923g;

        public C12747f(C5377a aVar, C12464c cVar) {
            this.f32923g = aVar;
            this.f32922f = cVar;
        }

        public void call() {
            try {
                this.f32923g.call();
            } finally {
                this.f32922f.onCompleted();
            }
        }
    }

    /* renamed from: rx.n.c.l$g */
    /* compiled from: SchedulerWhen */
    static abstract class C12748g extends AtomicReference<C5375k> implements C5375k {
        public C12748g() {
            super(C12740l.f32907i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m41238b(C5373h.C5374a aVar, C12464c cVar) {
            C5375k kVar = (C5375k) get();
            if (kVar != C12740l.f32908j && kVar == C12740l.f32907i) {
                C5375k a = mo40874a(aVar, cVar);
                if (!compareAndSet(C12740l.f32907i, a)) {
                    a.unsubscribe();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C5375k mo40874a(C5373h.C5374a aVar, C12464c cVar);

        public boolean isUnsubscribed() {
            return ((C5375k) get()).isUnsubscribed();
        }

        public void unsubscribe() {
            C5375k kVar;
            C5375k kVar2 = C12740l.f32908j;
            do {
                kVar = (C5375k) get();
                if (kVar == C12740l.f32908j) {
                    return;
                }
            } while (!compareAndSet(kVar, kVar2));
            if (kVar != C12740l.f32907i) {
                kVar.unsubscribe();
            }
        }
    }

    public C12740l(C5379n<C5368e<C5368e<C5328b>>, C5328b> nVar, C5373h hVar) {
        this.f32909f = hVar;
        C12871b p = C12871b.m41468p();
        this.f32910g = new C12836d(p);
        this.f32911h = nVar.call(p.mo18676d()).mo18609d();
    }

    public C5373h.C5374a createWorker() {
        C5373h.C5374a createWorker = this.f32909f.createWorker();
        C12512b p = C12512b.m40981p();
        C12836d dVar = new C12836d(p);
        C5368e j = p.mo18694j(new C12741a(this, createWorker));
        C12743b bVar = new C12743b(this, createWorker, dVar);
        this.f32910g.onNext(j);
        return bVar;
    }

    public boolean isUnsubscribed() {
        return this.f32911h.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f32911h.unsubscribe();
    }

    /* renamed from: rx.n.c.l$b */
    /* compiled from: SchedulerWhen */
    class C12743b extends C5373h.C5374a {

        /* renamed from: f */
        private final AtomicBoolean f32915f = new AtomicBoolean();

        /* renamed from: g */
        final /* synthetic */ C5373h.C5374a f32916g;

        /* renamed from: h */
        final /* synthetic */ C5372f f32917h;

        C12743b(C12740l lVar, C5373h.C5374a aVar, C5372f fVar) {
            this.f32916g = aVar;
            this.f32917h = fVar;
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            C12745d dVar = new C12745d(aVar, j, timeUnit);
            this.f32917h.onNext(dVar);
            return dVar;
        }

        public boolean isUnsubscribed() {
            return this.f32915f.get();
        }

        public void unsubscribe() {
            if (this.f32915f.compareAndSet(false, true)) {
                this.f32916g.unsubscribe();
                this.f32917h.onCompleted();
            }
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            C12746e eVar = new C12746e(aVar);
            this.f32917h.onNext(eVar);
            return eVar;
        }
    }
}
