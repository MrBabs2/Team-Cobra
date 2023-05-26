package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.i2 */
public final class C6868i2 {

    /* renamed from: a */
    private static final Map<C6870b, C6793d2> f12848a;

    /* renamed from: com.flurry.sdk.i2$a */
    static /* synthetic */ class C6869a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12849a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.flurry.sdk.i2$b[] r0 = com.flurry.sdk.C6868i2.C6870b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12849a = r0
                com.flurry.sdk.i2$b r1 = com.flurry.sdk.C6868i2.C6870b.PUBLIC_API     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12849a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.i2$b r1 = com.flurry.sdk.C6868i2.C6870b.CORE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.i2$b r1 = com.flurry.sdk.C6868i2.C6870b.DATA_PROCESSOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.i2$b r1 = com.flurry.sdk.C6868i2.C6870b.PROVIDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12849a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.flurry.sdk.i2$b r1 = com.flurry.sdk.C6868i2.C6870b.CONFIG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6868i2.C6869a.<clinit>():void");
        }
    }

    /* renamed from: com.flurry.sdk.i2$b */
    public enum C6870b {
        CORE,
        DATA_PROCESSOR,
        PROVIDER,
        PUBLIC_API,
        REPORTS,
        CONFIG,
        MISC
    }

    /* renamed from: com.flurry.sdk.i2$c */
    static class C6871c implements RejectedExecutionHandler {
        private C6871c() {
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C6792d1.m14476a(6, "ActorFactory", runnable.toString() + "is rejected");
        }

        /* synthetic */ C6871c(byte b) {
            this();
        }
    }

    /* renamed from: com.flurry.sdk.i2$d */
    static class C6872d implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f12858f = new AtomicInteger(0);

        /* renamed from: g */
        private final String f12859g = "Flurry #";

        C6872d() {
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f12859g + this.f12858f.incrementAndGet());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(10);
            return thread;
        }
    }

    static {
        Executor executor;
        HashMap hashMap = new HashMap();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        for (C6870b bVar : C6870b.values()) {
            String name = bVar.name();
            int i = C6869a.f12849a[bVar.ordinal()];
            if (i == 1) {
                executor = m14605a();
            } else if (i == 2) {
                executor = m14606a(availableProcessors);
            } else if (i == 3) {
                executor = m14605a();
            } else if (i == 4) {
                executor = m14606a(availableProcessors);
            } else if (i != 5) {
                executor = m14605a();
            } else {
                executor = m14605a();
            }
            hashMap.put(bVar, new C6793d2(executor, name));
        }
        f12848a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static synchronized C6793d2 m14604a(C6870b bVar) {
        C6793d2 d2Var;
        synchronized (C6868i2.class) {
            d2Var = f12848a.get(bVar);
        }
        return d2Var;
    }

    /* renamed from: a */
    private static Executor m14606a(int i) {
        return new ThreadPoolExecutor(0, i, 6, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6872d(), new C6871c((byte) 0));
    }

    /* renamed from: a */
    private static Executor m14605a() {
        return new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6872d(), new C6871c((byte) 0));
    }
}
