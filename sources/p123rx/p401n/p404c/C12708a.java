package p123rx.p401n.p404c;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12773i;

/* renamed from: rx.n.c.a */
/* compiled from: CachedThreadScheduler */
public final class C12708a extends C5373h implements C12739k {

    /* renamed from: h */
    private static final long f32820h = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());

    /* renamed from: i */
    private static final TimeUnit f32821i = TimeUnit.SECONDS;

    /* renamed from: j */
    static final C12714c f32822j;

    /* renamed from: k */
    static final C12709a f32823k;

    /* renamed from: f */
    final ThreadFactory f32824f;

    /* renamed from: g */
    final AtomicReference<C12709a> f32825g = new AtomicReference<>(f32823k);

    /* renamed from: rx.n.c.a$b */
    /* compiled from: CachedThreadScheduler */
    static final class C12712b extends C5373h.C5374a implements C5377a {

        /* renamed from: f */
        private final C5383b f32834f = new C5383b();

        /* renamed from: g */
        private final C12709a f32835g;

        /* renamed from: h */
        private final C12714c f32836h;

        /* renamed from: i */
        final AtomicBoolean f32837i;

        /* renamed from: rx.n.c.a$b$a */
        /* compiled from: CachedThreadScheduler */
        class C12713a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C5377a f32838f;

            C12713a(C5377a aVar) {
                this.f32838f = aVar;
            }

            public void call() {
                if (!C12712b.this.isUnsubscribed()) {
                    this.f32838f.call();
                }
            }
        }

        C12712b(C12709a aVar) {
            this.f32835g = aVar;
            this.f32837i = new AtomicBoolean();
            this.f32836h = aVar.mo40851b();
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            return mo18712a(aVar, 0, (TimeUnit) null);
        }

        public void call() {
            this.f32835g.mo40850a(this.f32836h);
        }

        public boolean isUnsubscribed() {
            return this.f32834f.isUnsubscribed();
        }

        public void unsubscribe() {
            if (this.f32837i.compareAndSet(false, true)) {
                this.f32836h.mo18710a((C5377a) this);
            }
            this.f32834f.unsubscribe();
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            if (this.f32834f.isUnsubscribed()) {
                return C12889e.m41502b();
            }
            C12735j b = this.f32836h.mo40864b(new C12713a(aVar), j, timeUnit);
            this.f32834f.mo18721a((C5375k) b);
            b.mo40870a(this.f32834f);
            return b;
        }
    }

    /* renamed from: rx.n.c.a$c */
    /* compiled from: CachedThreadScheduler */
    static final class C12714c extends C12730h {

        /* renamed from: n */
        private long f32840n = 0;

        C12714c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo40856a(long j) {
            this.f32840n = j;
        }

        /* renamed from: d */
        public long mo40857d() {
            return this.f32840n;
        }
    }

    static {
        C12714c cVar = new C12714c(C12773i.f32960g);
        f32822j = cVar;
        cVar.unsubscribe();
        C12709a aVar = new C12709a((ThreadFactory) null, 0, (TimeUnit) null);
        f32823k = aVar;
        aVar.mo40853d();
    }

    public C12708a(ThreadFactory threadFactory) {
        this.f32824f = threadFactory;
        start();
    }

    public C5373h.C5374a createWorker() {
        return new C12712b(this.f32825g.get());
    }

    public void shutdown() {
        C12709a aVar;
        C12709a aVar2;
        do {
            aVar = this.f32825g.get();
            aVar2 = f32823k;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f32825g.compareAndSet(aVar, aVar2));
        aVar.mo40853d();
    }

    public void start() {
        C12709a aVar = new C12709a(this.f32824f, f32820h, f32821i);
        if (!this.f32825g.compareAndSet(f32823k, aVar)) {
            aVar.mo40853d();
        }
    }

    /* renamed from: rx.n.c.a$a */
    /* compiled from: CachedThreadScheduler */
    static final class C12709a {

        /* renamed from: a */
        private final ThreadFactory f32826a;

        /* renamed from: b */
        private final long f32827b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C12714c> f32828c;

        /* renamed from: d */
        private final C5383b f32829d;

        /* renamed from: e */
        private final ScheduledExecutorService f32830e;

        /* renamed from: f */
        private final Future<?> f32831f;

        /* renamed from: rx.n.c.a$a$a */
        /* compiled from: CachedThreadScheduler */
        class C12710a implements ThreadFactory {

            /* renamed from: f */
            final /* synthetic */ ThreadFactory f32832f;

            C12710a(C12709a aVar, ThreadFactory threadFactory) {
                this.f32832f = threadFactory;
            }

            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f32832f.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: rx.n.c.a$a$b */
        /* compiled from: CachedThreadScheduler */
        class C12711b implements Runnable {
            C12711b() {
            }

            public void run() {
                C12709a.this.mo40849a();
            }
        }

        C12709a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f32826a = threadFactory;
            this.f32827b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f32828c = new ConcurrentLinkedQueue<>();
            this.f32829d = new C5383b();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new C12710a(this, threadFactory));
                C12730h.m41219c(scheduledExecutorService);
                C12711b bVar = new C12711b();
                long j2 = this.f32827b;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(bVar, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f32830e = scheduledExecutorService;
            this.f32831f = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40850a(C12714c cVar) {
            cVar.mo40856a(mo40852c() + this.f32827b);
            this.f32828c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12714c mo40851b() {
            if (this.f32829d.isUnsubscribed()) {
                return C12708a.f32822j;
            }
            while (!this.f32828c.isEmpty()) {
                C12714c poll = this.f32828c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C12714c cVar = new C12714c(this.f32826a);
            this.f32829d.mo18721a((C5375k) cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo40852c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo40853d() {
            try {
                if (this.f32831f != null) {
                    this.f32831f.cancel(true);
                }
                if (this.f32830e != null) {
                    this.f32830e.shutdownNow();
                }
            } finally {
                this.f32829d.unsubscribe();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40849a() {
            if (!this.f32828c.isEmpty()) {
                long c = mo40852c();
                Iterator<C12714c> it = this.f32828c.iterator();
                while (it.hasNext()) {
                    C12714c next = it.next();
                    if (next.mo40857d() > c) {
                        return;
                    }
                    if (this.f32828c.remove(next)) {
                        this.f32829d.mo18722b(next);
                    }
                }
            }
        }
    }
}
