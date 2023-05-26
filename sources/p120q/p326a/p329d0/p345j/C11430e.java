package p120q.p326a.p329d0.p345j;

import java.util.concurrent.CountDownLatch;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p342g.C11406i;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.j.e */
/* compiled from: BlockingHelper */
public final class C11430e {
    /* renamed from: a */
    public static void m37454a(CountDownLatch countDownLatch, C10842c cVar) {
        if (countDownLatch.getCount() != 0) {
            try {
                m37453a();
                countDownLatch.await();
            } catch (InterruptedException e) {
                cVar.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m37453a() {
        if (!C11459a.m37527a()) {
            return;
        }
        if ((Thread.currentThread() instanceof C11406i) || C11459a.m37532b()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }
}
