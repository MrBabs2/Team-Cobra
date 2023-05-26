package p123rx.p401n.p404c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.n.c.d */
/* compiled from: GenericScheduledExecutorService */
public final class C12725d implements C12739k {

    /* renamed from: g */
    private static final ScheduledExecutorService[] f32869g = new ScheduledExecutorService[0];

    /* renamed from: h */
    private static final ScheduledExecutorService f32870h;

    /* renamed from: i */
    public static final C12725d f32871i = new C12725d();

    /* renamed from: j */
    private static int f32872j;

    /* renamed from: f */
    private final AtomicReference<ScheduledExecutorService[]> f32873f = new AtomicReference<>(f32869g);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f32870h = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    private C12725d() {
        start();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m41209a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = f32871i.f32873f.get();
        if (scheduledExecutorServiceArr == f32869g) {
            return f32870h;
        }
        int i = f32872j + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f32872j = i;
        return scheduledExecutorServiceArr[i];
    }

    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f32873f.get();
            scheduledExecutorServiceArr2 = f32869g;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.f32873f.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C12730h.m41215a(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = C12726e.m41210a();
        }
        if (this.f32873f.compareAndSet(f32869g, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!C12730h.m41219c(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C12730h.m41216a((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }
}
