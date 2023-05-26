package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.l */
/* compiled from: LottieTask */
public class C5672l<T> {

    /* renamed from: g */
    public static Executor f10048g = Executors.newCachedThreadPool();

    /* renamed from: a */
    private Thread f10049a;

    /* renamed from: b */
    private final Set<C5668h<T>> f10050b;

    /* renamed from: c */
    private final Set<C5668h<Throwable>> f10051c;

    /* renamed from: d */
    private final Handler f10052d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final FutureTask<C5671k<T>> f10053e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile C5671k<T> f10054f;

    /* renamed from: com.airbnb.lottie.l$a */
    /* compiled from: LottieTask */
    class C5673a implements Runnable {
        C5673a() {
        }

        public void run() {
            if (C5672l.this.f10054f != null && !C5672l.this.f10053e.isCancelled()) {
                C5671k a = C5672l.this.f10054f;
                if (a.mo19475b() != null) {
                    C5672l.this.m10864a(a.mo19475b());
                } else {
                    C5672l.this.m10865a(a.mo19474a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.l$b */
    /* compiled from: LottieTask */
    class C5674b extends Thread {

        /* renamed from: f */
        private boolean f10056f = false;

        C5674b(String str) {
            super(str);
        }

        public void run() {
            while (!isInterrupted() && !this.f10056f) {
                if (C5672l.this.f10053e.isDone()) {
                    try {
                        C5672l.this.m10860a((C5671k) C5672l.this.f10053e.get());
                    } catch (InterruptedException | ExecutionException e) {
                        C5672l.this.m10860a(new C5671k(e));
                    }
                    this.f10056f = true;
                    C5672l.this.m10868c();
                }
            }
        }
    }

    public C5672l(Callable<C5671k<T>> callable) {
        this(callable, false);
    }

    /* renamed from: d */
    public synchronized C5672l<T> mo19481d(C5668h<T> hVar) {
        this.f10050b.remove(hVar);
        m10868c();
        return this;
    }

    C5672l(Callable<C5671k<T>> callable, boolean z) {
        this.f10050b = new LinkedHashSet(1);
        this.f10051c = new LinkedHashSet(1);
        this.f10052d = new Handler(Looper.getMainLooper());
        this.f10054f = null;
        FutureTask<C5671k<T>> futureTask = new FutureTask<>(callable);
        this.f10053e = futureTask;
        if (z) {
            try {
                m10860a(callable.call());
            } catch (Throwable th) {
                m10860a(new C5671k(th));
            }
        } else {
            f10048g.execute(futureTask);
            m10867b();
        }
    }

    /* renamed from: b */
    public synchronized C5672l<T> mo19479b(C5668h<T> hVar) {
        if (!(this.f10054f == null || this.f10054f.mo19475b() == null)) {
            hVar.mo19384a(this.f10054f.mo19475b());
        }
        this.f10050b.add(hVar);
        m10867b();
        return this;
    }

    /* renamed from: c */
    public synchronized C5672l<T> mo19480c(C5668h<Throwable> hVar) {
        this.f10051c.remove(hVar);
        m10868c();
        return this;
    }

    /* renamed from: d */
    private boolean m10870d() {
        Thread thread = this.f10049a;
        return thread != null && thread.isAlive();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10860a(C5671k<T> kVar) {
        if (this.f10054f == null) {
            this.f10054f = kVar;
            m10859a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m10868c() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m10870d()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.util.Set<com.airbnb.lottie.h<T>> r0 = r1.f10050b     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0015
            com.airbnb.lottie.k<T> r0 = r1.f10054f     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
        L_0x0015:
            java.lang.Thread r0 = r1.f10049a     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            r0 = 0
            r1.f10049a = r0     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "Stopping TaskObserver thread"
            com.airbnb.lottie.C5647c.m10754b(r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C5672l.m10868c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m10867b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m10870d()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001f
            com.airbnb.lottie.k<T> r0 = r2.f10054f     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            com.airbnb.lottie.l$b r0 = new com.airbnb.lottie.l$b     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x0021 }
            r2.f10049a = r0     // Catch:{ all -> 0x0021 }
            r0.start()     // Catch:{ all -> 0x0021 }
            java.lang.String r0 = "Starting TaskObserver thread"
            com.airbnb.lottie.C5647c.m10754b(r0)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C5672l.m10867b():void");
    }

    /* renamed from: a */
    public synchronized C5672l<T> mo19478a(C5668h<Throwable> hVar) {
        if (!(this.f10054f == null || this.f10054f.mo19474a() == null)) {
            hVar.mo19384a(this.f10054f.mo19474a());
        }
        this.f10051c.add(hVar);
        m10867b();
        return this;
    }

    /* renamed from: a */
    private void m10859a() {
        this.f10052d.post(new C5673a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10864a(T t) {
        for (C5668h a : new ArrayList(this.f10050b)) {
            a.mo19384a(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10865a(Throwable th) {
        ArrayList<C5668h> arrayList = new ArrayList<>(this.f10051c);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        for (C5668h a : arrayList) {
            a.mo19384a(th);
        }
    }
}
