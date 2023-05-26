package p120q.p326a.p329d0.p345j;

import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11490u;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12935b;

/* renamed from: q.a.d0.j.k */
/* compiled from: HalfSerializer */
public final class C11437k {
    /* renamed from: a */
    public static <T> void m37470a(C12935b<? super T> bVar, T t, AtomicInteger atomicInteger, C11428c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo37168a();
                if (a != null) {
                    bVar.onError(a);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m37471a(C12935b<?> bVar, Throwable th, AtomicInteger atomicInteger, C11428c cVar) {
        if (!cVar.mo37169a(th)) {
            C11459a.m37531b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(cVar.mo37168a());
        }
    }

    /* renamed from: a */
    public static void m37472a(C12935b<?> bVar, AtomicInteger atomicInteger, C11428c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo37168a();
            if (a != null) {
                bVar.onError(a);
            } else {
                bVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> void m37467a(C11490u<? super T> uVar, T t, AtomicInteger atomicInteger, C11428c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            uVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo37168a();
                if (a != null) {
                    uVar.onError(a);
                } else {
                    uVar.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m37468a(C11490u<?> uVar, Throwable th, AtomicInteger atomicInteger, C11428c cVar) {
        if (!cVar.mo37169a(th)) {
            C11459a.m37531b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            uVar.onError(cVar.mo37168a());
        }
    }

    /* renamed from: a */
    public static void m37469a(C11490u<?> uVar, AtomicInteger atomicInteger, C11428c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo37168a();
            if (a != null) {
                uVar.onError(a);
            } else {
                uVar.onComplete();
            }
        }
    }
}
