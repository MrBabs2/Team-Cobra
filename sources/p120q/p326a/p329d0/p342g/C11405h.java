package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10866c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.g.h */
/* compiled from: NewThreadWorker */
public class C11405h extends C11491v.C11494c implements C10842c {

    /* renamed from: f */
    private final ScheduledExecutorService f30566f;

    /* renamed from: g */
    volatile boolean f30567g;

    public C11405h(ThreadFactory threadFactory) {
        this.f30566f = C11412n.m37414a(threadFactory);
    }

    /* renamed from: a */
    public C10842c mo37116a(Runnable runnable) {
        return mo37117a(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: b */
    public C10842c mo37148b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C11410l lVar = new C11410l(C11459a.m37512a(runnable));
        if (j <= 0) {
            try {
                future = this.f30566f.submit(lVar);
            } catch (RejectedExecutionException e) {
                C11459a.m37531b((Throwable) e);
                return C10868e.INSTANCE;
            }
        } else {
            future = this.f30566f.schedule(lVar, j, timeUnit);
        }
        lVar.mo37111a(future);
        return lVar;
    }

    public void dispose() {
        if (!this.f30567g) {
            this.f30567g = true;
            this.f30566f.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.f30567g;
    }

    /* renamed from: a */
    public C10842c mo37117a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f30567g) {
            return C10868e.INSTANCE;
        }
        return mo37145a(runnable, j, timeUnit, (C10866c) null);
    }

    /* renamed from: a */
    public C11411m mo37145a(Runnable runnable, long j, TimeUnit timeUnit, C10866c cVar) {
        Future future;
        C11411m mVar = new C11411m(C11459a.m37512a(runnable), cVar);
        if (cVar != null && !cVar.mo36646b(mVar)) {
            return mVar;
        }
        if (j <= 0) {
            try {
                future = this.f30566f.submit(mVar);
            } catch (RejectedExecutionException e) {
                if (cVar != null) {
                    cVar.mo36645a(mVar);
                }
                C11459a.m37531b((Throwable) e);
            }
        } else {
            future = this.f30566f.schedule(mVar, j, timeUnit);
        }
        mVar.mo37153a(future);
        return mVar;
    }

    /* renamed from: b */
    public C10842c mo37147b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C11459a.m37512a(runnable);
        if (j2 <= 0) {
            C11399e eVar = new C11399e(a, this.f30566f);
            if (j <= 0) {
                try {
                    future = this.f30566f.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C11459a.m37531b((Throwable) e);
                    return C10868e.INSTANCE;
                }
            } else {
                future = this.f30566f.schedule(eVar, j, timeUnit);
            }
            eVar.mo37133a(future);
            return eVar;
        }
        C11409k kVar = new C11409k(a);
        try {
            kVar.mo37111a(this.f30566f.scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C11459a.m37531b((Throwable) e2);
            return C10868e.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo37146a() {
        if (!this.f30567g) {
            this.f30567g = true;
            this.f30566f.shutdown();
        }
    }
}
