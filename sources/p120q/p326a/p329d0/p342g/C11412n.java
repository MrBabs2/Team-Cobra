package p120q.p326a.p329d0.p342g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p328c0.C10861o;

/* renamed from: q.a.d0.g.n */
/* compiled from: SchedulerPoolFactory */
public final class C11412n {

    /* renamed from: a */
    public static final boolean f30576a;

    /* renamed from: b */
    public static final int f30577b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f30578c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f30579d = new ConcurrentHashMap();

    /* renamed from: q.a.d0.g.n$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C11413a implements Runnable {
        C11413a() {
        }

        public void run() {
            Iterator it = new ArrayList(C11412n.f30579d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C11412n.f30579d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: q.a.d0.g.n$b */
    /* compiled from: SchedulerPoolFactory */
    static final class C11414b implements C10861o<String, String> {
        C11414b() {
        }

        /* renamed from: a */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        C11414b bVar = new C11414b();
        boolean a = m37418a(true, "rx2.purge-enabled", true, true, (C10861o<String, String>) bVar);
        f30576a = a;
        f30577b = m37413a(a, "rx2.purge-period-seconds", 1, 1, (C10861o<String, String>) bVar);
        m37415a();
    }

    /* renamed from: a */
    public static void m37415a() {
        m37416a(f30576a);
    }

    /* renamed from: a */
    static void m37416a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = f30578c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C11407j("RxSchedulerPurge"));
                    if (f30578c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C11413a aVar = new C11413a();
                        int i = f30577b;
                        newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    static int m37413a(boolean z, String str, int i, int i2, C10861o<String, String> oVar) {
        if (!z) {
            return i2;
        }
        try {
            String apply = oVar.apply(str);
            if (apply == null) {
                return i;
            }
            return Integer.parseInt(apply);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    static boolean m37418a(boolean z, String str, boolean z2, boolean z3, C10861o<String, String> oVar) {
        if (!z) {
            return z3;
        }
        try {
            String apply = oVar.apply(str);
            if (apply == null) {
                return z2;
            }
            return "true".equals(apply);
        } catch (Throwable unused) {
            return z2;
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m37414a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m37417a(f30576a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    static void m37417a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f30579d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
