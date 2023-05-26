package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5985p;
import com.bumptech.glide.p166r.C6315j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
/* compiled from: ActiveResources */
final class C5907a {

    /* renamed from: a */
    private final boolean f10793a;

    /* renamed from: b */
    final Map<C6022f, C5912d> f10794b;

    /* renamed from: c */
    private final ReferenceQueue<C5985p<?>> f10795c;

    /* renamed from: d */
    private C5985p.C5986a f10796d;

    /* renamed from: e */
    private volatile boolean f10797e;

    /* renamed from: f */
    private volatile C5911c f10798f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* compiled from: ActiveResources */
    class C5908a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* compiled from: ActiveResources */
        class C5909a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f10799f;

            C5909a(C5908a aVar, Runnable runnable) {
                this.f10799f = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f10799f.run();
            }
        }

        C5908a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C5909a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* compiled from: ActiveResources */
    class C5910b implements Runnable {
        C5910b() {
        }

        public void run() {
            C5907a.this.mo20083a();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* compiled from: ActiveResources */
    interface C5911c {
        /* renamed from: a */
        void mo20092a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$d */
    /* compiled from: ActiveResources */
    static final class C5912d extends WeakReference<C5985p<?>> {

        /* renamed from: a */
        final C6022f f10801a;

        /* renamed from: b */
        final boolean f10802b;

        /* renamed from: c */
        C5992u<?> f10803c;

        C5912d(C6022f fVar, C5985p<?> pVar, ReferenceQueue<? super C5985p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            C5992u<?> uVar;
            C6315j.m12978a(fVar);
            this.f10801a = fVar;
            if (!pVar.mo20241f() || !z) {
                uVar = null;
            } else {
                C5992u<?> e = pVar.mo20240e();
                C6315j.m12978a(e);
                uVar = e;
            }
            this.f10803c = uVar;
            this.f10802b = pVar.mo20241f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20093a() {
            this.f10803c = null;
            clear();
        }
    }

    C5907a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C5908a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20085a(C5985p.C5986a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f10796d = aVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C5985p<?> mo20088b(com.bumptech.glide.load.C6022f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.f, com.bumptech.glide.load.engine.a$d> r0 = r1.f10794b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.C5907a.C5912d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.p r0 = (com.bumptech.glide.load.engine.C5985p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo20084a((com.bumptech.glide.load.engine.C5907a.C5912d) r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5907a.mo20088b(com.bumptech.glide.load.f):com.bumptech.glide.load.engine.p");
    }

    C5907a(boolean z, Executor executor) {
        this.f10794b = new HashMap();
        this.f10795c = new ReferenceQueue<>();
        this.f10793a = z;
        executor.execute(new C5910b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20087a(C6022f fVar, C5985p<?> pVar) {
        C5912d put = this.f10794b.put(fVar, new C5912d(fVar, pVar, this.f10795c, this.f10793a));
        if (put != null) {
            put.mo20093a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20086a(C6022f fVar) {
        C5912d remove = this.f10794b.remove(fVar);
        if (remove != null) {
            remove.mo20093a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20084a(C5912d dVar) {
        synchronized (this.f10796d) {
            synchronized (this) {
                this.f10794b.remove(dVar.f10801a);
                if (dVar.f10802b) {
                    if (dVar.f10803c != null) {
                        C5985p pVar = new C5985p(dVar.f10803c, true, false);
                        pVar.mo20236a(dVar.f10801a, this.f10796d);
                        this.f10796d.mo20203a(dVar.f10801a, pVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20083a() {
        while (!this.f10797e) {
            try {
                mo20084a((C5912d) this.f10795c.remove());
                C5911c cVar = this.f10798f;
                if (cVar != null) {
                    cVar.mo20092a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
