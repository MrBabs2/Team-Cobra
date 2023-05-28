package p120q.p326a.p329d0.p342g;

import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.g.k */
/* compiled from: ScheduledDirectPeriodicTask */
public final class C11409k extends C11386a implements Runnable {
    public C11409k(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f30503g = Thread.currentThread();
        try {
            this.f30502f.run();
            this.f30503g = null;
        } catch (Throwable th) {
            this.f30503g = null;
            lazySet(C11386a.f30500h);
            C11459a.m37531b(th);
        }
    }
}
