package p123rx.p401n.p406e;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.n.e.i */
/* compiled from: RxThreadFactory */
public final class C12773i extends AtomicLong implements ThreadFactory {

    /* renamed from: g */
    public static final ThreadFactory f32960g = new C12774a();

    /* renamed from: f */
    final String f32961f;

    /* renamed from: rx.n.e.i$a */
    /* compiled from: RxThreadFactory */
    static class C12774a implements ThreadFactory {
        C12774a() {
        }

        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public C12773i(String str) {
        this.f32961f = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f32961f + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
