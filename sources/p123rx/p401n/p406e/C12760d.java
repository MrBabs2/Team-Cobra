package p123rx.p401n.p406e;

import java.util.concurrent.CountDownLatch;
import p123rx.C5375k;

/* renamed from: rx.n.e.d */
/* compiled from: BlockingUtils */
public final class C12760d {
    /* renamed from: a */
    public static void m41253a(CountDownLatch countDownLatch, C5375k kVar) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                kVar.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
