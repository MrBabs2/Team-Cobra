package p120q.p326a.p329d0.p342g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10866c;

/* renamed from: q.a.d0.g.m */
/* compiled from: ScheduledRunnable */
public final class C11411m extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C10842c {

    /* renamed from: g */
    static final Object f30571g = new Object();

    /* renamed from: h */
    static final Object f30572h = new Object();

    /* renamed from: i */
    static final Object f30573i = new Object();

    /* renamed from: j */
    static final Object f30574j = new Object();

    /* renamed from: f */
    final Runnable f30575f;

    public C11411m(Runnable runnable, C10866c cVar) {
        super(3);
        this.f30575f = runnable;
        lazySet(0, cVar);
    }

    /* renamed from: a */
    public void mo37153a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f30574j) {
                if (obj == f30572h) {
                    future.cancel(false);
                    return;
                } else if (obj == f30573i) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f30574j
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f30572h
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f30573i
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f30573i
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f30572h
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f30574j
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f30571g
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            q.a.d0.a.c r0 = (p120q.p326a.p329d0.p330a.C10866c) r0
            r0.mo36647c(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p342g.C11411m.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f30571g || obj == f30574j) {
            return true;
        }
        return false;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f30575f.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f30571g || !compareAndSet(0, obj3, f30574j) || obj3 == null)) {
                ((C10866c) obj3).mo36647c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f30572h || obj2 == f30573i || compareAndSet(1, obj2, f30574j)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f30574j));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f30571g || !compareAndSet(0, obj4, f30574j) || obj4 == null)) {
            ((C10866c) obj4).mo36647c(this);
        }
        do {
            obj = get(1);
            if (obj == f30572h || obj == f30573i || compareAndSet(1, obj, f30574j)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f30574j));
    }
}
