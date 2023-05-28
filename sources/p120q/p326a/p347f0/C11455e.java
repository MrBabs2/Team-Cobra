package p120q.p326a.p347f0;

import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11425a;
import p120q.p326a.p329d0.p345j.C11439m;

/* renamed from: q.a.f0.e */
/* compiled from: SerializedObserver */
public final class C11455e<T> implements C11490u<T>, C10842c {

    /* renamed from: f */
    final C11490u<? super T> f30647f;

    /* renamed from: g */
    final boolean f30648g;

    /* renamed from: h */
    C10842c f30649h;

    /* renamed from: i */
    boolean f30650i;

    /* renamed from: j */
    C11425a<Object> f30651j;

    /* renamed from: k */
    volatile boolean f30652k;

    public C11455e(C11490u<? super T> uVar) {
        this(uVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37215a() {
        C11425a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f30651j;
                if (aVar == null) {
                    this.f30650i = false;
                    return;
                }
                this.f30651j = null;
            }
        } while (!aVar.mo37165a((C11490u<? super U>) this.f30647f));
    }

    public void dispose() {
        this.f30649h.dispose();
    }

    public boolean isDisposed() {
        return this.f30649h.isDisposed();
    }

    public void onComplete() {
        if (!this.f30652k) {
            synchronized (this) {
                if (!this.f30652k) {
                    if (this.f30650i) {
                        C11425a<Object> aVar = this.f30651j;
                        if (aVar == null) {
                            aVar = new C11425a<>(4);
                            this.f30651j = aVar;
                        }
                        aVar.mo37163a(C11439m.m37474a());
                        return;
                    }
                    this.f30652k = true;
                    this.f30650i = true;
                    this.f30647f.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p120q.p326a.p348g0.C11459a.m37531b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f30647f.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f30652k
            if (r0 == 0) goto L_0x0008
            p120q.p326a.p348g0.C11459a.m37531b((java.lang.Throwable) r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f30652k     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f30650i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f30652k = r1     // Catch:{ all -> 0x0044 }
            q.a.d0.j.a<java.lang.Object> r0 = r2.f30651j     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            q.a.d0.j.a r0 = new q.a.d0.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f30651j = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p120q.p326a.p329d0.p345j.C11439m.m37475a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f30648g     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo37163a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo37166b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f30652k = r1     // Catch:{ all -> 0x0044 }
            r2.f30650i = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p120q.p326a.p348g0.C11459a.m37531b((java.lang.Throwable) r3)
            return
        L_0x003e:
            q.a.u<? super T> r0 = r2.f30647f
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p347f0.C11455e.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f30652k) {
            if (t == null) {
                this.f30649h.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f30652k) {
                    if (this.f30650i) {
                        C11425a<Object> aVar = this.f30651j;
                        if (aVar == null) {
                            aVar = new C11425a<>(4);
                            this.f30651j = aVar;
                        }
                        C11439m.m37483e(t);
                        aVar.mo37163a(t);
                        return;
                    }
                    this.f30650i = true;
                    this.f30647f.onNext(t);
                    mo37215a();
                }
            }
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (C10867d.m36776a(this.f30649h, cVar)) {
            this.f30649h = cVar;
            this.f30647f.onSubscribe(this);
        }
    }

    public C11455e(C11490u<? super T> uVar, boolean z) {
        this.f30647f = uVar;
        this.f30648g = z;
    }
}
