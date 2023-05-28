package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10870g;
import p120q.p326a.p346e0.C11448a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.o2 */
/* compiled from: ObservableRefCount */
public final class C11202o2<T> extends C11482n<T> {

    /* renamed from: f */
    final C11448a<T> f29875f;

    /* renamed from: g */
    final int f29876g;

    /* renamed from: h */
    final long f29877h;

    /* renamed from: i */
    final TimeUnit f29878i;

    /* renamed from: j */
    final C11491v f29879j;

    /* renamed from: k */
    C11203a f29880k;

    /* renamed from: q.a.d0.e.e.o2$a */
    /* compiled from: ObservableRefCount */
    static final class C11203a extends AtomicReference<C10842c> implements Runnable, C10853g<C10842c> {

        /* renamed from: f */
        final C11202o2<?> f29881f;

        /* renamed from: g */
        C10842c f29882g;

        /* renamed from: h */
        long f29883h;

        /* renamed from: i */
        boolean f29884i;

        /* renamed from: j */
        boolean f29885j;

        C11203a(C11202o2<?> o2Var) {
            this.f29881f = o2Var;
        }

        public void run() {
            this.f29881f.mo36949e(this);
        }

        /* renamed from: a */
        public void mo8098a(C10842c cVar) throws Exception {
            C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            synchronized (this.f29881f) {
                if (this.f29885j) {
                    ((C10870g) this.f29881f.f29875f).mo36671a(cVar);
                }
            }
        }
    }

    /* renamed from: q.a.d0.e.e.o2$b */
    /* compiled from: ObservableRefCount */
    static final class C11204b<T> extends AtomicBoolean implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29886f;

        /* renamed from: g */
        final C11202o2<T> f29887g;

        /* renamed from: h */
        final C11203a f29888h;

        /* renamed from: i */
        C10842c f29889i;

        C11204b(C11490u<? super T> uVar, C11202o2<T> o2Var, C11203a aVar) {
            this.f29886f = uVar;
            this.f29887g = o2Var;
            this.f29888h = aVar;
        }

        public void dispose() {
            this.f29889i.dispose();
            if (compareAndSet(false, true)) {
                this.f29887g.mo36945a(this.f29888h);
            }
        }

        public boolean isDisposed() {
            return this.f29889i.isDisposed();
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f29887g.mo36948d(this.f29888h);
                this.f29886f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f29887g.mo36948d(this.f29888h);
                this.f29886f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            this.f29886f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29889i, cVar)) {
                this.f29889i = cVar;
                this.f29886f.onSubscribe(this);
            }
        }
    }

    public C11202o2(C11448a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, (C11491v) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36945a(p120q.p326a.p329d0.p334e.p339e.C11202o2.C11203a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            q.a.d0.e.e.o2$a r0 = r5.f29880k     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            q.a.d0.e.e.o2$a r0 = r5.f29880k     // Catch:{ all -> 0x0041 }
            if (r0 == r6) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            long r0 = r6.f29883h     // Catch:{ all -> 0x0041 }
            r2 = 1
            long r0 = r0 - r2
            r6.f29883h = r0     // Catch:{ all -> 0x0041 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r6.f29884i     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            long r0 = r5.f29877h     // Catch:{ all -> 0x0041 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r5.mo36949e(r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0027:
            q.a.d0.a.h r0 = new q.a.d0.a.h     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r6.f29882g = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            q.a.v r1 = r5.f29879j
            long r2 = r5.f29877h
            java.util.concurrent.TimeUnit r4 = r5.f29878i
            q.a.b0.c r6 = r1.mo37113a(r6, r2, r4)
            r0.mo36672a(r6)
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11202o2.mo36945a(q.a.d0.e.e.o2$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36946b(C11203a aVar) {
        C10842c cVar = aVar.f29882g;
        if (cVar != null) {
            cVar.dispose();
            aVar.f29882g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36947c(C11203a aVar) {
        C11448a<T> aVar2 = this.f29875f;
        if (aVar2 instanceof C10842c) {
            ((C10842c) aVar2).dispose();
        } else if (aVar2 instanceof C10870g) {
            ((C10870g) aVar2).mo36671a((C10842c) aVar.get());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36948d(C11203a aVar) {
        synchronized (this) {
            if (this.f29875f instanceof C11081h2) {
                if (this.f29880k != null && this.f29880k == aVar) {
                    this.f29880k = null;
                    mo36946b(aVar);
                }
                long j = aVar.f29883h - 1;
                aVar.f29883h = j;
                if (j == 0) {
                    mo36947c(aVar);
                }
            } else if (this.f29880k != null && this.f29880k == aVar) {
                mo36946b(aVar);
                long j2 = aVar.f29883h - 1;
                aVar.f29883h = j2;
                if (j2 == 0) {
                    this.f29880k = null;
                    mo36947c(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36949e(C11203a aVar) {
        synchronized (this) {
            if (aVar.f29883h == 0 && aVar == this.f29880k) {
                this.f29880k = null;
                C10842c cVar = (C10842c) aVar.get();
                C10867d.m36773a((AtomicReference<C10842c>) aVar);
                if (this.f29875f instanceof C10842c) {
                    ((C10842c) this.f29875f).dispose();
                } else if (this.f29875f instanceof C10870g) {
                    if (cVar == null) {
                        aVar.f29885j = true;
                    } else {
                        ((C10870g) this.f29875f).mo36671a(cVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11203a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f29880k;
            if (aVar == null) {
                aVar = new C11203a(this);
                this.f29880k = aVar;
            }
            long j = aVar.f29883h;
            if (j == 0 && aVar.f29882g != null) {
                aVar.f29882g.dispose();
            }
            long j2 = j + 1;
            aVar.f29883h = j2;
            z = true;
            if (aVar.f29884i || j2 != ((long) this.f29876g)) {
                z = false;
            } else {
                aVar.f29884i = true;
            }
        }
        this.f29875f.subscribe(new C11204b(uVar, this, aVar));
        if (z) {
            this.f29875f.mo36838a(aVar);
        }
    }

    public C11202o2(C11448a<T> aVar, int i, long j, TimeUnit timeUnit, C11491v vVar) {
        this.f29875f = aVar;
        this.f29876g = i;
        this.f29877h = j;
        this.f29878i = timeUnit;
        this.f29879j = vVar;
    }
}
