package p120q.p326a.p350i0;

import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p345j.C11425a;
import p120q.p326a.p329d0.p345j.C11439m;

/* renamed from: q.a.i0.b */
/* compiled from: SerializedSubject */
final class C11474b<T> extends C11475c<T> implements C11425a.C11426a<Object> {

    /* renamed from: f */
    final C11475c<T> f30698f;

    /* renamed from: g */
    boolean f30699g;

    /* renamed from: h */
    C11425a<Object> f30700h;

    /* renamed from: i */
    volatile boolean f30701i;

    C11474b(C11475c<T> cVar) {
        this.f30698f = cVar;
    }

    /* renamed from: a */
    public boolean mo36663a(Object obj) {
        return C11439m.m37480b(obj, this.f30698f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37236c() {
        C11425a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f30700h;
                if (aVar == null) {
                    this.f30699g = false;
                    return;
                }
                this.f30700h = null;
            }
            aVar.mo37164a((C11425a.C11426a<? super Object>) this);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f30701i) {
            synchronized (this) {
                if (!this.f30701i) {
                    this.f30701i = true;
                    if (this.f30699g) {
                        C11425a<Object> aVar = this.f30700h;
                        if (aVar == null) {
                            aVar = new C11425a<>(4);
                            this.f30700h = aVar;
                        }
                        aVar.mo37163a(C11439m.m37474a());
                        return;
                    }
                    this.f30699g = true;
                    this.f30698f.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p120q.p326a.p348g0.C11459a.m37531b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f30698f.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f30701i
            if (r0 == 0) goto L_0x0008
            p120q.p326a.p348g0.C11459a.m37531b((java.lang.Throwable) r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f30701i     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f30701i = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f30699g     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            q.a.d0.j.a<java.lang.Object> r0 = r2.f30700h     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            q.a.d0.j.a r0 = new q.a.d0.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f30700h = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = p120q.p326a.p329d0.p345j.C11439m.m37475a((java.lang.Throwable) r3)     // Catch:{ all -> 0x003b }
            r0.mo37166b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f30699g = r1     // Catch:{ all -> 0x003b }
            r1 = 0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            p120q.p326a.p348g0.C11459a.m37531b((java.lang.Throwable) r3)
            return
        L_0x0035:
            q.a.i0.c<T> r0 = r2.f30698f
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p350i0.C11474b.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f30701i) {
            synchronized (this) {
                if (!this.f30701i) {
                    if (this.f30699g) {
                        C11425a<Object> aVar = this.f30700h;
                        if (aVar == null) {
                            aVar = new C11425a<>(4);
                            this.f30700h = aVar;
                        }
                        C11439m.m37483e(t);
                        aVar.mo37163a(t);
                        return;
                    }
                    this.f30699g = true;
                    this.f30698f.onNext(t);
                    mo37236c();
                }
            }
        }
    }

    public void onSubscribe(C10842c cVar) {
        boolean z = true;
        if (!this.f30701i) {
            synchronized (this) {
                if (!this.f30701i) {
                    if (this.f30699g) {
                        C11425a<Object> aVar = this.f30700h;
                        if (aVar == null) {
                            aVar = new C11425a<>(4);
                            this.f30700h = aVar;
                        }
                        aVar.mo37163a(C11439m.m37476a(cVar));
                        return;
                    }
                    this.f30699g = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.dispose();
            return;
        }
        this.f30698f.onSubscribe(cVar);
        mo37236c();
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f30698f.subscribe(uVar);
    }
}
