package p112n.p312h.p313a.p318f0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n.h.a.f0.b */
/* compiled from: FileDownloadExecutors */
public class C10761b {

    /* renamed from: n.h.a.f0.b$a */
    /* compiled from: FileDownloadExecutors */
    static class C10762a implements ThreadFactory {

        /* renamed from: f */
        private final String f28822f;

        /* renamed from: g */
        private final ThreadGroup f28823g = Thread.currentThread().getThreadGroup();

        /* renamed from: h */
        private final AtomicInteger f28824h = new AtomicInteger(1);

        static {
            new AtomicInteger(1);
        }

        C10762a(String str) {
            this.f28822f = C10771f.m36520h(str);
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f28823g;
            Thread thread = new Thread(threadGroup, runnable, this.f28822f + this.f28824h.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m36477a(int i, String str) {
        return m36478a(i, new LinkedBlockingQueue(), str);
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m36478a(int i, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 5, TimeUnit.SECONDS, linkedBlockingQueue, new C10762a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
