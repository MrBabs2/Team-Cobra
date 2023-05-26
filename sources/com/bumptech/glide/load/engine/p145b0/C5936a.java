package com.bumptech.glide.load.engine.p145b0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.engine.b0.a */
/* compiled from: GlideExecutor */
public final class C5936a implements ExecutorService {

    /* renamed from: g */
    private static final long f10837g = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h */
    private static volatile int f10838h;

    /* renamed from: f */
    private final ExecutorService f10839f;

    /* renamed from: com.bumptech.glide.load.engine.b0.a$a */
    /* compiled from: GlideExecutor */
    private static final class C5937a implements ThreadFactory {

        /* renamed from: f */
        private final String f10840f;

        /* renamed from: g */
        final C5939b f10841g;

        /* renamed from: h */
        final boolean f10842h;

        /* renamed from: i */
        private int f10843i;

        /* renamed from: com.bumptech.glide.load.engine.b0.a$a$a */
        /* compiled from: GlideExecutor */
        class C5938a extends Thread {
            C5938a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C5937a.this.f10842h) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C5937a.this.f10841g.mo20138a(th);
                }
            }
        }

        C5937a(String str, C5939b bVar, boolean z) {
            this.f10840f = str;
            this.f10841g = bVar;
            this.f10842h = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C5938a aVar;
            aVar = new C5938a(runnable, "glide-" + this.f10840f + "-thread-" + this.f10843i);
            this.f10843i = this.f10843i + 1;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b0.a$b */
    /* compiled from: GlideExecutor */
    public interface C5939b {

        /* renamed from: a */
        public static final C5939b f10845a = new C5941b();

        /* renamed from: b */
        public static final C5939b f10846b = f10845a;

        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$a */
        /* compiled from: GlideExecutor */
        class C5940a implements C5939b {
            C5940a() {
            }

            /* renamed from: a */
            public void mo20138a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$b */
        /* compiled from: GlideExecutor */
        class C5941b implements C5939b {
            C5941b() {
            }

            /* renamed from: a */
            public void mo20138a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$c */
        /* compiled from: GlideExecutor */
        class C5942c implements C5939b {
            C5942c() {
            }

            /* renamed from: a */
            public void mo20138a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            new C5940a();
            new C5942c();
        }

        /* renamed from: a */
        void mo20138a(Throwable th);
    }

    C5936a(ExecutorService executorService) {
        this.f10839f = executorService;
    }

    /* renamed from: a */
    public static C5936a m11745a(int i, String str, C5939b bVar) {
        return new C5936a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5937a(str, bVar, true)));
    }

    /* renamed from: b */
    public static C5936a m11747b(int i, String str, C5939b bVar) {
        return new C5936a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5937a(str, bVar, false)));
    }

    /* renamed from: c */
    public static C5936a m11748c() {
        return m11745a(1, "disk-cache", C5939b.f10846b);
    }

    /* renamed from: d */
    public static C5936a m11749d() {
        return m11747b(m11743a(), "source", C5939b.f10846b);
    }

    /* renamed from: e */
    public static C5936a m11750e() {
        return new C5936a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f10837g, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C5937a("source-unlimited", C5939b.f10846b, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f10839f.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f10839f.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f10839f.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f10839f.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f10839f.isShutdown();
    }

    public boolean isTerminated() {
        return this.f10839f.isTerminated();
    }

    public void shutdown() {
        this.f10839f.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f10839f.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f10839f.submit(runnable);
    }

    public String toString() {
        return this.f10839f.toString();
    }

    /* renamed from: a */
    public static C5936a m11744a(int i, C5939b bVar) {
        return new C5936a(new ThreadPoolExecutor(0, i, f10837g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5937a("animation", bVar, true)));
    }

    /* renamed from: b */
    public static C5936a m11746b() {
        return m11744a(m11743a() >= 4 ? 2 : 1, C5939b.f10846b);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f10839f.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f10839f.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f10839f.submit(runnable, t);
    }

    /* renamed from: a */
    public static int m11743a() {
        if (f10838h == 0) {
            f10838h = Math.min(4, C5943b.m11755a());
        }
        return f10838h;
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f10839f.submit(callable);
    }
}
