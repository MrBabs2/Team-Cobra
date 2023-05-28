package com.flurry.sdk;

import com.flurry.sdk.C6831g2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.c1 */
public class C6760c1<T extends C6831g2> {

    /* renamed from: a */
    private final C7096z0<Object, T> f12592a = new C7096z0<>();

    /* renamed from: b */
    private final HashMap<T, Object> f12593b = new HashMap<>();

    /* renamed from: c */
    final HashMap<T, Future<?>> f12594c = new HashMap<>();

    /* renamed from: d */
    private final ThreadPoolExecutor f12595d;

    /* renamed from: com.flurry.sdk.c1$b */
    class C6764b extends ThreadPoolExecutor.DiscardPolicy {

        /* renamed from: com.flurry.sdk.c1$b$a */
        class C6765a extends C6816f2 {
            C6765a(C6764b bVar, C6831g2 g2Var) {
            }

            /* renamed from: a */
            public final void mo23531a() {
            }
        }

        C6764b() {
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            C6831g2 a = C6760c1.m14407a(runnable);
            if (a != null) {
                synchronized (C6760c1.this.f12594c) {
                    C6760c1.this.f12594c.remove(a);
                }
                C6760c1.this.mo23548a(a);
                new C6765a(this, a).run();
            }
        }
    }

    public C6760c1(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        C6761a aVar = new C6761a(timeUnit, blockingQueue);
        this.f12595d = aVar;
        aVar.setRejectedExecutionHandler(new C6764b());
        this.f12595d.setThreadFactory(new C7097z1(str));
    }

    /* renamed from: b */
    private synchronized void m14408b(Object obj, T t) {
        List<T> a;
        C7096z0<Object, T> z0Var = this.f12592a;
        if (!(obj == null || (a = z0Var.mo23742a(obj, false)) == null)) {
            a.remove(t);
            if (a.size() == 0) {
                z0Var.f13364a.remove(obj);
            }
        }
        this.f12593b.remove(t);
    }

    /* renamed from: c */
    private synchronized void m14409c(Object obj, T t) {
        this.f12592a.mo23743a(obj, t);
        this.f12593b.put(t, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo23548a(T t) {
        m14408b(this.f12593b.get(t), t);
    }

    /* renamed from: a */
    public final synchronized void mo23549a(Object obj, T t) {
        if (obj != null) {
            m14409c(obj, t);
            this.f12595d.submit(t);
        }
    }

    /* renamed from: a */
    static /* synthetic */ C6831g2 m14407a(Runnable runnable) {
        if (runnable instanceof C6748b1) {
            return (C6831g2) ((C6748b1) runnable).mo23542a();
        }
        if (runnable instanceof C6831g2) {
            return (C6831g2) runnable;
        }
        C6792d1.m14476a(6, "TrackedThreadPoolExecutor", "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }

    /* renamed from: com.flurry.sdk.c1$a */
    class C6761a extends ThreadPoolExecutor {

        /* renamed from: com.flurry.sdk.c1$a$a */
        class C6762a extends C6816f2 {
            C6762a(C6761a aVar, C6831g2 g2Var) {
            }

            /* renamed from: a */
            public final void mo23531a() {
            }
        }

        /* renamed from: com.flurry.sdk.c1$a$b */
        class C6763b extends C6816f2 {
            C6763b(C6761a aVar, C6831g2 g2Var) {
            }

            /* renamed from: a */
            public final void mo23531a() {
            }
        }

        C6761a(TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(0, 5, 5000, timeUnit, blockingQueue);
        }

        /* access modifiers changed from: protected */
        public final void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            C6831g2 a = C6760c1.m14407a(runnable);
            if (a != null) {
                synchronized (C6760c1.this.f12594c) {
                    C6760c1.this.f12594c.remove(a);
                }
                C6760c1.this.mo23548a(a);
                new C6763b(this, a).run();
            }
        }

        /* access modifiers changed from: protected */
        public final void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
            C6831g2 a = C6760c1.m14407a(runnable);
            if (a != null) {
                new C6762a(this, a).run();
            }
        }

        /* access modifiers changed from: protected */
        public final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
            C6748b1 b1Var = new C6748b1(runnable, v);
            synchronized (C6760c1.this.f12594c) {
                C6760c1.this.f12594c.put((C6831g2) runnable, b1Var);
            }
            return b1Var;
        }

        /* access modifiers changed from: protected */
        public final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
            throw new UnsupportedOperationException("Callable not supported");
        }
    }
}
