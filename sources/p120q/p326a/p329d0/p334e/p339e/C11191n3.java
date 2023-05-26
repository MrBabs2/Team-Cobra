package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.n3 */
/* compiled from: ObservableSwitchMap */
public final class C11191n3<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<? extends R>> f29832g;

    /* renamed from: h */
    final int f29833h;

    /* renamed from: i */
    final boolean f29834i;

    /* renamed from: q.a.d0.e.e.n3$a */
    /* compiled from: ObservableSwitchMap */
    static final class C11192a<T, R> extends AtomicReference<C10842c> implements C11490u<R> {

        /* renamed from: f */
        final C11193b<T, R> f29835f;

        /* renamed from: g */
        final long f29836g;

        /* renamed from: h */
        final int f29837h;

        /* renamed from: i */
        volatile C10918g<R> f29838i;

        /* renamed from: j */
        volatile boolean f29839j;

        C11192a(C11193b<T, R> bVar, long j, int i) {
            this.f29835f = bVar;
            this.f29836g = j;
            this.f29837h = i;
        }

        /* renamed from: a */
        public void mo36936a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onComplete() {
            if (this.f29836g == this.f29835f.f29850o) {
                this.f29839j = true;
                this.f29835f.mo36939b();
            }
        }

        public void onError(Throwable th) {
            this.f29835f.mo36938a(this, th);
        }

        public void onNext(R r) {
            if (this.f29836g == this.f29835f.f29850o) {
                if (r != null) {
                    this.f29838i.offer(r);
                }
                this.f29835f.mo36939b();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar)) {
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(7);
                    if (a == 1) {
                        this.f29838i = bVar;
                        this.f29839j = true;
                        this.f29835f.mo36939b();
                        return;
                    } else if (a == 2) {
                        this.f29838i = bVar;
                        return;
                    }
                }
                this.f29838i = new C11385c(this.f29837h);
            }
        }
    }

    public C11191n3(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, boolean z) {
        super(sVar);
        this.f29832g = oVar;
        this.f29833h = i;
        this.f29834i = z;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        if (!C11337y2.m37296a(this.f29150f, uVar, this.f29832g)) {
            this.f29150f.subscribe(new C11193b(uVar, this.f29832g, this.f29833h, this.f29834i));
        }
    }

    /* renamed from: q.a.d0.e.e.n3$b */
    /* compiled from: ObservableSwitchMap */
    static final class C11193b<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: p */
        static final C11192a<Object, Object> f29840p;

        /* renamed from: f */
        final C11490u<? super R> f29841f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends R>> f29842g;

        /* renamed from: h */
        final int f29843h;

        /* renamed from: i */
        final boolean f29844i;

        /* renamed from: j */
        final C11428c f29845j;

        /* renamed from: k */
        volatile boolean f29846k;

        /* renamed from: l */
        volatile boolean f29847l;

        /* renamed from: m */
        C10842c f29848m;

        /* renamed from: n */
        final AtomicReference<C11192a<T, R>> f29849n = new AtomicReference<>();

        /* renamed from: o */
        volatile long f29850o;

        static {
            C11192a<Object, Object> aVar = new C11192a<>((C11193b) null, -1, 1);
            f29840p = aVar;
            aVar.mo36936a();
        }

        C11193b(C11490u<? super R> uVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, int i, boolean z) {
            this.f29841f = uVar;
            this.f29842g = oVar;
            this.f29843h = i;
            this.f29844i = z;
            this.f29845j = new C11428c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36937a() {
            C11192a<Object, Object> andSet;
            C11192a<Object, Object> aVar = this.f29849n.get();
            C11192a<Object, Object> aVar2 = f29840p;
            if (aVar != aVar2 && (andSet = this.f29849n.getAndSet(aVar2)) != f29840p && andSet != null) {
                andSet.mo36936a();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36939b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                q.a.u<? super R> r0 = r13.f29841f
                java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.n3$a<T, R>> r1 = r13.f29849n
                boolean r2 = r13.f29844i
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.f29847l
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.f29846k
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                q.a.d0.j.c r1 = r13.f29845j
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                q.a.d0.j.c r7 = r13.f29845j
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                q.a.d0.j.c r1 = r13.f29845j
                java.lang.Throwable r1 = r1.mo37168a()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                q.a.d0.e.e.n3$a r5 = (p120q.p326a.p329d0.p334e.p339e.C11191n3.C11192a) r5
                if (r5 == 0) goto L_0x00e9
                q.a.d0.c.g<R> r7 = r5.f29838i
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f29839j
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                q.a.d0.j.c r10 = r13.f29845j
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                q.a.d0.j.c r1 = r13.f29845j
                java.lang.Throwable r1 = r1.mo37168a()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.f29847l
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                q.a.d0.j.c r10 = r13.f29845j
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                q.a.d0.j.c r1 = r13.f29845j
                java.lang.Throwable r1 = r1.mo37168a()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f29839j
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                p036io.reactivex.exceptions.C9034a.m29708a(r8)
                q.a.d0.j.c r11 = r13.f29845j
                r11.mo37169a(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.mo36937a()
                q.a.b0.c r8 = r13.f29848m
                r8.dispose()
                r13.f29846k = r3
                goto L_0x00d0
            L_0x00cd:
                r5.mo36936a()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11191n3.C11193b.mo36939b():void");
        }

        public void dispose() {
            if (!this.f29847l) {
                this.f29847l = true;
                this.f29848m.dispose();
                mo36937a();
            }
        }

        public boolean isDisposed() {
            return this.f29847l;
        }

        public void onComplete() {
            if (!this.f29846k) {
                this.f29846k = true;
                mo36939b();
            }
        }

        public void onError(Throwable th) {
            if (this.f29846k || !this.f29845j.mo37169a(th)) {
                C11459a.m37531b(th);
                return;
            }
            if (!this.f29844i) {
                mo36937a();
            }
            this.f29846k = true;
            mo36939b();
        }

        public void onNext(T t) {
            C11192a<Object, Object> aVar;
            long j = this.f29850o + 1;
            this.f29850o = j;
            C11192a aVar2 = this.f29849n.get();
            if (aVar2 != null) {
                aVar2.mo36936a();
            }
            try {
                Object apply = this.f29842g.apply(t);
                C10910b.m36861a(apply, "The ObservableSource returned is null");
                C11488s sVar = (C11488s) apply;
                C11192a aVar3 = new C11192a(this, j, this.f29843h);
                do {
                    aVar = this.f29849n.get();
                    if (aVar == f29840p) {
                        return;
                    }
                } while (!this.f29849n.compareAndSet(aVar, aVar3));
                sVar.subscribe(aVar3);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29848m.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29848m, cVar)) {
                this.f29848m = cVar;
                this.f29841f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36938a(C11192a<T, R> aVar, Throwable th) {
            if (aVar.f29836g != this.f29850o || !this.f29845j.mo37169a(th)) {
                C11459a.m37531b(th);
                return;
            }
            if (!this.f29844i) {
                this.f29848m.dispose();
                this.f29846k = true;
            }
            aVar.f29839j = true;
            mo36939b();
        }
    }
}
