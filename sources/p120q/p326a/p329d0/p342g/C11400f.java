package p120q.p326a.p329d0.p342g;

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
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10868e;

/* renamed from: q.a.d0.g.f */
/* compiled from: IoScheduler */
public final class C11400f extends C11491v {

    /* renamed from: d */
    static final C11407j f30545d;

    /* renamed from: e */
    static final C11407j f30546e;

    /* renamed from: f */
    private static final long f30547f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: g */
    private static final TimeUnit f30548g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final C11403c f30549h;

    /* renamed from: i */
    static final C11401a f30550i;

    /* renamed from: b */
    final ThreadFactory f30551b;

    /* renamed from: c */
    final AtomicReference<C11401a> f30552c;

    /* renamed from: q.a.d0.g.f$b */
    /* compiled from: IoScheduler */
    static final class C11402b extends C11491v.C11494c {

        /* renamed from: f */
        private final C10841b f30559f;

        /* renamed from: g */
        private final C11401a f30560g;

        /* renamed from: h */
        private final C11403c f30561h;

        /* renamed from: i */
        final AtomicBoolean f30562i = new AtomicBoolean();

        C11402b(C11401a aVar) {
            this.f30560g = aVar;
            this.f30559f = new C10841b();
            this.f30561h = aVar.mo37139b();
        }

        /* renamed from: a */
        public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f30559f.isDisposed()) {
                return C10868e.INSTANCE;
            }
            return this.f30561h.mo37145a(runnable, j, timeUnit, this.f30559f);
        }

        public void dispose() {
            if (this.f30562i.compareAndSet(false, true)) {
                this.f30559f.dispose();
                this.f30560g.mo37138a(this.f30561h);
            }
        }

        public boolean isDisposed() {
            return this.f30562i.get();
        }
    }

    /* renamed from: q.a.d0.g.f$c */
    /* compiled from: IoScheduler */
    static final class C11403c extends C11405h {

        /* renamed from: h */
        private long f30563h = 0;

        C11403c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo37143a(long j) {
            this.f30563h = j;
        }

        /* renamed from: b */
        public long mo37144b() {
            return this.f30563h;
        }
    }

    static {
        C11403c cVar = new C11403c(new C11407j("RxCachedThreadSchedulerShutdown"));
        f30549h = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f30545d = new C11407j("RxCachedThreadScheduler", max);
        f30546e = new C11407j("RxCachedWorkerPoolEvictor", max);
        C11401a aVar = new C11401a(0, (TimeUnit) null, f30545d);
        f30550i = aVar;
        aVar.mo37141d();
    }

    public C11400f() {
        this(f30545d);
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11402b(this.f30552c.get());
    }

    /* renamed from: b */
    public void mo37136b() {
        C11401a aVar = new C11401a(f30547f, f30548g, this.f30551b);
        if (!this.f30552c.compareAndSet(f30550i, aVar)) {
            aVar.mo37141d();
        }
    }

    /* renamed from: q.a.d0.g.f$a */
    /* compiled from: IoScheduler */
    static final class C11401a implements Runnable {

        /* renamed from: f */
        private final long f30553f;

        /* renamed from: g */
        private final ConcurrentLinkedQueue<C11403c> f30554g;

        /* renamed from: h */
        final C10841b f30555h;

        /* renamed from: i */
        private final ScheduledExecutorService f30556i;

        /* renamed from: j */
        private final Future<?> f30557j;

        /* renamed from: k */
        private final ThreadFactory f30558k;

        C11401a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f30553f = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f30554g = new ConcurrentLinkedQueue<>();
            this.f30555h = new C10841b();
            this.f30558k = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C11400f.f30546e);
                long j2 = this.f30553f;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f30556i = scheduledExecutorService;
            this.f30557j = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37138a(C11403c cVar) {
            cVar.mo37143a(mo37140c() + this.f30553f);
            this.f30554g.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C11403c mo37139b() {
            if (this.f30555h.isDisposed()) {
                return C11400f.f30549h;
            }
            while (!this.f30554g.isEmpty()) {
                C11403c poll = this.f30554g.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C11403c cVar = new C11403c(this.f30558k);
            this.f30555h.mo36646b(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo37140c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37141d() {
            this.f30555h.dispose();
            Future<?> future = this.f30557j;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f30556i;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo37137a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37137a() {
            if (!this.f30554g.isEmpty()) {
                long c = mo37140c();
                Iterator<C11403c> it = this.f30554g.iterator();
                while (it.hasNext()) {
                    C11403c next = it.next();
                    if (next.mo37144b() > c) {
                        return;
                    }
                    if (this.f30554g.remove(next)) {
                        this.f30555h.mo36645a((C10842c) next);
                    }
                }
            }
        }
    }

    public C11400f(ThreadFactory threadFactory) {
        this.f30551b = threadFactory;
        this.f30552c = new AtomicReference<>(f30550i);
        mo37136b();
    }
}
