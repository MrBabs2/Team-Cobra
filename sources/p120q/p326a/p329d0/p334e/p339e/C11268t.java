package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;

/* renamed from: q.a.d0.e.e.t */
/* compiled from: ObservableCombineLatest */
public final class C11268t<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11488s<? extends T>[] f30115f;

    /* renamed from: g */
    final Iterable<? extends C11488s<? extends T>> f30116g;

    /* renamed from: h */
    final C10861o<? super Object[], ? extends R> f30117h;

    /* renamed from: i */
    final int f30118i;

    /* renamed from: j */
    final boolean f30119j;

    /* renamed from: q.a.d0.e.e.t$a */
    /* compiled from: ObservableCombineLatest */
    static final class C11269a<T, R> extends AtomicReference<C10842c> implements C11490u<T> {

        /* renamed from: f */
        final C11270b<T, R> f30120f;

        /* renamed from: g */
        final int f30121g;

        C11269a(C11270b<T, R> bVar, int i) {
            this.f30120f = bVar;
            this.f30121g = i;
        }

        /* renamed from: a */
        public void mo37002a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onComplete() {
            this.f30120f.mo37004a(this.f30121g);
        }

        public void onError(Throwable th) {
            this.f30120f.mo37006a(this.f30121g, th);
        }

        public void onNext(T t) {
            this.f30120f.mo37005a(this.f30121g, t);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    public C11268t(C11488s<? extends T>[] sVarArr, Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f30115f = sVarArr;
        this.f30116g = iterable;
        this.f30117h = oVar;
        this.f30118i = i;
        this.f30119j = z;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        int i;
        C11488s<? extends T>[] sVarArr = this.f30115f;
        if (sVarArr == null) {
            sVarArr = new C11488s[8];
            i = 0;
            for (C11488s<? extends T> sVar : this.f30116g) {
                if (i == sVarArr.length) {
                    C11488s<? extends T>[] sVarArr2 = new C11488s[((i >> 2) + i)];
                    System.arraycopy(sVarArr, 0, sVarArr2, 0, i);
                    sVarArr = sVarArr2;
                }
                sVarArr[i] = sVar;
                i++;
            }
        } else {
            i = sVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            C10868e.m36785a((C11490u<?>) uVar);
            return;
        }
        new C11270b(uVar, this.f30117h, i2, this.f30118i, this.f30119j).mo37008a(sVarArr);
    }

    /* renamed from: q.a.d0.e.e.t$b */
    /* compiled from: ObservableCombineLatest */
    static final class C11270b<T, R> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11490u<? super R> f30122f;

        /* renamed from: g */
        final C10861o<? super Object[], ? extends R> f30123g;

        /* renamed from: h */
        final C11269a<T, R>[] f30124h;

        /* renamed from: i */
        Object[] f30125i;

        /* renamed from: j */
        final C11385c<Object[]> f30126j;

        /* renamed from: k */
        final boolean f30127k;

        /* renamed from: l */
        volatile boolean f30128l;

        /* renamed from: m */
        volatile boolean f30129m;

        /* renamed from: n */
        final C11428c f30130n = new C11428c();

        /* renamed from: o */
        int f30131o;

        /* renamed from: p */
        int f30132p;

        C11270b(C11490u<? super R> uVar, C10861o<? super Object[], ? extends R> oVar, int i, int i2, boolean z) {
            this.f30122f = uVar;
            this.f30123g = oVar;
            this.f30127k = z;
            this.f30125i = new Object[i];
            C11269a<T, R>[] aVarArr = new C11269a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C11269a<>(this, i3);
            }
            this.f30124h = aVarArr;
            this.f30126j = new C11385c<>(i2);
        }

        /* renamed from: a */
        public void mo37008a(C11488s<? extends T>[] sVarArr) {
            C11269a<T, R>[] aVarArr = this.f30124h;
            int length = aVarArr.length;
            this.f30122f.onSubscribe(this);
            for (int i = 0; i < length && !this.f30129m && !this.f30128l; i++) {
                sVarArr[i].subscribe(aVarArr[i]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37009b() {
            if (getAndIncrement() == 0) {
                C11385c<Object[]> cVar = this.f30126j;
                C11490u<? super R> uVar = this.f30122f;
                boolean z = this.f30127k;
                int i = 1;
                while (!this.f30128l) {
                    if (z || this.f30130n.get() == null) {
                        boolean z2 = this.f30129m;
                        Object[] poll = cVar.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            mo37007a((C11385c<?>) cVar);
                            Throwable a = this.f30130n.mo37168a();
                            if (a == null) {
                                uVar.onComplete();
                                return;
                            } else {
                                uVar.onError(a);
                                return;
                            }
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object apply = this.f30123g.apply(poll);
                                C10910b.m36861a(apply, "The combiner returned a null value");
                                uVar.onNext(apply);
                            } catch (Throwable th) {
                                C9034a.m29708a(th);
                                this.f30130n.mo37169a(th);
                                mo37003a();
                                mo37007a((C11385c<?>) cVar);
                                uVar.onError(this.f30130n.mo37168a());
                                return;
                            }
                        }
                    } else {
                        mo37003a();
                        mo37007a((C11385c<?>) cVar);
                        uVar.onError(this.f30130n.mo37168a());
                        return;
                    }
                }
                mo37007a((C11385c<?>) cVar);
            }
        }

        public void dispose() {
            if (!this.f30128l) {
                this.f30128l = true;
                mo37003a();
                if (getAndIncrement() == 0) {
                    mo37007a((C11385c<?>) this.f30126j);
                }
            }
        }

        public boolean isDisposed() {
            return this.f30128l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37003a() {
            for (C11269a<T, R> a : this.f30124h) {
                a.mo37002a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37007a(C11385c<?> cVar) {
            synchronized (this) {
                this.f30125i = null;
            }
            cVar.clear();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo37009b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37005a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f30125i     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f30131o     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f30131o = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                q.a.d0.f.c<java.lang.Object[]> r4 = r3.f30126j     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo37009b()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11268t.C11270b.mo37005a(int, java.lang.Object):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r0 = r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37006a(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                q.a.d0.j.c r0 = r2.f30130n
                boolean r0 = r0.mo37169a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f30127k
                r0 = 1
                if (r4 == 0) goto L_0x002d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f30125i     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x002a }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f30132p     // Catch:{ all -> 0x002a }
                int r1 = r1 + r0
                r2.f30132p = r1     // Catch:{ all -> 0x002a }
                int r4 = r4.length     // Catch:{ all -> 0x002a }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f30129m = r0     // Catch:{ all -> 0x002a }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                r0 = r3
                goto L_0x002d
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            L_0x002d:
                if (r0 == 0) goto L_0x0032
                r2.mo37003a()
            L_0x0032:
                r2.mo37009b()
                goto L_0x0039
            L_0x0036:
                p120q.p326a.p348g0.C11459a.m37531b((java.lang.Throwable) r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11268t.C11270b.mo37006a(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            mo37003a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            mo37009b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37004a(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f30125i     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f30132p     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f30132p = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f30129m = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.mo37003a()
            L_0x0021:
                r3.mo37009b()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11268t.C11270b.mo37004a(int):void");
        }
    }
}
