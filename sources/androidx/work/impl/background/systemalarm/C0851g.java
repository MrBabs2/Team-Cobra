package androidx.work.impl.background.systemalarm;

import androidx.work.C0834i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.background.systemalarm.g */
/* compiled from: WorkTimer */
class C0851g {

    /* renamed from: f */
    private static final String f3052f = C0834i.m3721a("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f3053a = new C0852a(this);

    /* renamed from: b */
    private final ScheduledExecutorService f3054b = Executors.newSingleThreadScheduledExecutor(this.f3053a);

    /* renamed from: c */
    final Map<String, C0854c> f3055c = new HashMap();

    /* renamed from: d */
    final Map<String, C0853b> f3056d = new HashMap();

    /* renamed from: e */
    final Object f3057e = new Object();

    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    /* compiled from: WorkTimer */
    class C0852a implements ThreadFactory {

        /* renamed from: f */
        private int f3058f = 0;

        C0852a(C0851g gVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f3058f);
            this.f3058f = this.f3058f + 1;
            return newThread;
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    /* compiled from: WorkTimer */
    interface C0853b {
        /* renamed from: a */
        void mo4747a(String str);
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    /* compiled from: WorkTimer */
    static class C0854c implements Runnable {

        /* renamed from: f */
        private final C0851g f3059f;

        /* renamed from: g */
        private final String f3060g;

        C0854c(C0851g gVar, String str) {
            this.f3059f = gVar;
            this.f3060g = str;
        }

        public void run() {
            synchronized (this.f3059f.f3057e) {
                if (this.f3059f.f3055c.remove(this.f3060g) != null) {
                    C0853b remove = this.f3059f.f3056d.remove(this.f3060g);
                    if (remove != null) {
                        remove.mo4747a(this.f3060g);
                    }
                } else {
                    C0834i.m3720a().mo4726a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f3060g}), new Throwable[0]);
                }
            }
        }
    }

    C0851g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4766a(String str, long j, C0853b bVar) {
        synchronized (this.f3057e) {
            C0834i.m3720a().mo4726a(f3052f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo4765a(str);
            C0854c cVar = new C0854c(this, str);
            this.f3055c.put(str, cVar);
            this.f3056d.put(str, bVar);
            this.f3054b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4765a(String str) {
        synchronized (this.f3057e) {
            if (this.f3055c.remove(str) != null) {
                C0834i.m3720a().mo4726a(f3052f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f3056d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4764a() {
        if (!this.f3054b.isShutdown()) {
            this.f3054b.shutdownNow();
        }
    }
}
