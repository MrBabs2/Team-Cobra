package p123rx.p401n.p404c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12773i;
import p123rx.p401n.p406e.C12791l;

/* renamed from: rx.n.c.b */
/* compiled from: EventLoopsScheduler */
public final class C12715b extends C5373h implements C12739k {

    /* renamed from: h */
    static final int f32841h;

    /* renamed from: i */
    static final C12720c f32842i;

    /* renamed from: j */
    static final C12719b f32843j = new C12719b((ThreadFactory) null, 0);

    /* renamed from: f */
    final ThreadFactory f32844f;

    /* renamed from: g */
    final AtomicReference<C12719b> f32845g = new AtomicReference<>(f32843j);

    /* renamed from: rx.n.c.b$b */
    /* compiled from: EventLoopsScheduler */
    static final class C12719b {

        /* renamed from: a */
        final int f32854a;

        /* renamed from: b */
        final C12720c[] f32855b;

        /* renamed from: c */
        long f32856c;

        C12719b(ThreadFactory threadFactory, int i) {
            this.f32854a = i;
            this.f32855b = new C12720c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f32855b[i2] = new C12720c(threadFactory);
            }
        }

        /* renamed from: a */
        public C12720c mo40859a() {
            int i = this.f32854a;
            if (i == 0) {
                return C12715b.f32842i;
            }
            C12720c[] cVarArr = this.f32855b;
            long j = this.f32856c;
            this.f32856c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo40860b() {
            for (C12720c unsubscribe : this.f32855b) {
                unsubscribe.unsubscribe();
            }
        }
    }

    /* renamed from: rx.n.c.b$c */
    /* compiled from: EventLoopsScheduler */
    static final class C12720c extends C12730h {
        C12720c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f32841h = intValue;
        C12720c cVar = new C12720c(C12773i.f32960g);
        f32842i = cVar;
        cVar.unsubscribe();
    }

    public C12715b(ThreadFactory threadFactory) {
        this.f32844f = threadFactory;
        start();
    }

    /* renamed from: a */
    public C5375k mo40858a(C5377a aVar) {
        return this.f32845g.get().mo40859a().mo40864b(aVar, -1, TimeUnit.NANOSECONDS);
    }

    public C5373h.C5374a createWorker() {
        return new C12716a(this.f32845g.get().mo40859a());
    }

    public void shutdown() {
        C12719b bVar;
        C12719b bVar2;
        do {
            bVar = this.f32845g.get();
            bVar2 = f32843j;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f32845g.compareAndSet(bVar, bVar2));
        bVar.mo40860b();
    }

    public void start() {
        C12719b bVar = new C12719b(this.f32844f, f32841h);
        if (!this.f32845g.compareAndSet(f32843j, bVar)) {
            bVar.mo40860b();
        }
    }

    /* renamed from: rx.n.c.b$a */
    /* compiled from: EventLoopsScheduler */
    static final class C12716a extends C5373h.C5374a {

        /* renamed from: f */
        private final C12791l f32846f = new C12791l();

        /* renamed from: g */
        private final C5383b f32847g;

        /* renamed from: h */
        private final C12791l f32848h;

        /* renamed from: i */
        private final C12720c f32849i;

        /* renamed from: rx.n.c.b$a$a */
        /* compiled from: EventLoopsScheduler */
        class C12717a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C5377a f32850f;

            C12717a(C5377a aVar) {
                this.f32850f = aVar;
            }

            public void call() {
                if (!C12716a.this.isUnsubscribed()) {
                    this.f32850f.call();
                }
            }
        }

        /* renamed from: rx.n.c.b$a$b */
        /* compiled from: EventLoopsScheduler */
        class C12718b implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C5377a f32852f;

            C12718b(C5377a aVar) {
                this.f32852f = aVar;
            }

            public void call() {
                if (!C12716a.this.isUnsubscribed()) {
                    this.f32852f.call();
                }
            }
        }

        C12716a(C12720c cVar) {
            C5383b bVar = new C5383b();
            this.f32847g = bVar;
            this.f32848h = new C12791l(this.f32846f, bVar);
            this.f32849i = cVar;
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            if (isUnsubscribed()) {
                return C12889e.m41502b();
            }
            return this.f32849i.mo40862a((C5377a) new C12717a(aVar), 0, (TimeUnit) null, this.f32846f);
        }

        public boolean isUnsubscribed() {
            return this.f32848h.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f32848h.unsubscribe();
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return C12889e.m41502b();
            }
            return this.f32849i.mo40863a((C5377a) new C12718b(aVar), j, timeUnit, this.f32847g);
        }
    }
}
