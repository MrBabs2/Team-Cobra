package p050l.p059b.p060a.p061a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l.b.a.a.b */
/* compiled from: DefaultTaskExecutor */
public class C4837b extends C4839c {

    /* renamed from: a */
    private final Object f8287a = new Object();

    /* renamed from: b */
    private final ExecutorService f8288b = Executors.newFixedThreadPool(4, new C4838a(this));

    /* renamed from: c */
    private volatile Handler f8289c;

    /* renamed from: l.b.a.a.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C4838a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f8290f = new AtomicInteger(0);

        C4838a(C4837b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f8290f.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public void mo16840a(Runnable runnable) {
        this.f8288b.execute(runnable);
    }

    /* renamed from: b */
    public void mo16842b(Runnable runnable) {
        if (this.f8289c == null) {
            synchronized (this.f8287a) {
                if (this.f8289c == null) {
                    this.f8289c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f8289c.post(runnable);
    }

    /* renamed from: a */
    public boolean mo16841a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
