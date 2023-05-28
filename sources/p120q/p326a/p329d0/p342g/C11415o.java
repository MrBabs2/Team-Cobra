package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.g.o */
/* compiled from: SingleScheduler */
public final class C11415o extends C11491v {

    /* renamed from: c */
    static final C11407j f30580c = new C11407j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    static final ScheduledExecutorService f30581d;

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f30582b;

    /* renamed from: q.a.d0.g.o$a */
    /* compiled from: SingleScheduler */
    static final class C11416a extends C11491v.C11494c {

        /* renamed from: f */
        final ScheduledExecutorService f30583f;

        /* renamed from: g */
        final C10841b f30584g = new C10841b();

        /* renamed from: h */
        volatile boolean f30585h;

        C11416a(ScheduledExecutorService scheduledExecutorService) {
            this.f30583f = scheduledExecutorService;
        }

        /* renamed from: a */
        public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f30585h) {
                return C10868e.INSTANCE;
            }
            C11411m mVar = new C11411m(C11459a.m37512a(runnable), this.f30584g);
            this.f30584g.mo36646b(mVar);
            if (j <= 0) {
                try {
                    future = this.f30583f.submit(mVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C11459a.m37531b((Throwable) e);
                    return C10868e.INSTANCE;
                }
            } else {
                future = this.f30583f.schedule(mVar, j, timeUnit);
            }
            mVar.mo37153a(future);
            return mVar;
        }

        public void dispose() {
            if (!this.f30585h) {
                this.f30585h = true;
                this.f30584g.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f30585h;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f30581d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C11415o() {
        this(f30580c);
    }

    /* renamed from: a */
    static ScheduledExecutorService m37420a(ThreadFactory threadFactory) {
        return C11412n.m37414a(threadFactory);
    }

    public C11415o(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f30582b = atomicReference;
        atomicReference.lazySet(m37420a(threadFactory));
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11416a(this.f30582b.get());
    }

    /* renamed from: a */
    public C10842c mo37113a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C11410l lVar = new C11410l(C11459a.m37512a(runnable));
        if (j <= 0) {
            try {
                future = this.f30582b.get().submit(lVar);
            } catch (RejectedExecutionException e) {
                C11459a.m37531b((Throwable) e);
                return C10868e.INSTANCE;
            }
        } else {
            future = this.f30582b.get().schedule(lVar, j, timeUnit);
        }
        lVar.mo37111a(future);
        return lVar;
    }

    /* renamed from: a */
    public C10842c mo37112a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C11459a.m37512a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f30582b.get();
            C11399e eVar = new C11399e(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C11459a.m37531b((Throwable) e);
                    return C10868e.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo37133a(future);
            return eVar;
        }
        C11409k kVar = new C11409k(a);
        try {
            kVar.mo37111a(this.f30582b.get().scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C11459a.m37531b((Throwable) e2);
            return C10868e.INSTANCE;
        }
    }
}
