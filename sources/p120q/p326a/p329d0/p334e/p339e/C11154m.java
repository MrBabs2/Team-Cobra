package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10841b;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.m */
/* compiled from: ObservableBufferBoundary */
public final class C11154m<T, U extends Collection<? super T>, Open, Close> extends C10980a<T, U> {

    /* renamed from: g */
    final Callable<U> f29728g;

    /* renamed from: h */
    final C11488s<? extends Open> f29729h;

    /* renamed from: i */
    final C10861o<? super Open, ? extends C11488s<? extends Close>> f29730i;

    /* renamed from: q.a.d0.e.e.m$b */
    /* compiled from: ObservableBufferBoundary */
    static final class C11157b<T, C extends Collection<? super T>> extends AtomicReference<C10842c> implements C11490u<Object>, C10842c {

        /* renamed from: f */
        final C11155a<T, C, ?, ?> f29744f;

        /* renamed from: g */
        final long f29745g;

        C11157b(C11155a<T, C, ?, ?> aVar, long j) {
            this.f29744f = aVar;
            this.f29745g = j;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return get() == C10867d.DISPOSED;
        }

        public void onComplete() {
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f29744f.mo36915a(this, this.f29745g);
            }
        }

        public void onError(Throwable th) {
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f29744f.mo36913a((C10842c) this, th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(Object obj) {
            C10842c cVar = (C10842c) get();
            C10867d dVar = C10867d.DISPOSED;
            if (cVar != dVar) {
                lazySet(dVar);
                cVar.dispose();
                this.f29744f.mo36915a(this, this.f29745g);
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    public C11154m(C11488s<T> sVar, C11488s<? extends Open> sVar2, C10861o<? super Open, ? extends C11488s<? extends Close>> oVar, Callable<U> callable) {
        super(sVar);
        this.f29729h = sVar2;
        this.f29730i = oVar;
        this.f29728g = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        C11155a aVar = new C11155a(uVar, this.f29729h, this.f29730i, this.f29728g);
        uVar.onSubscribe(aVar);
        this.f29150f.subscribe(aVar);
    }

    /* renamed from: q.a.d0.e.e.m$a */
    /* compiled from: ObservableBufferBoundary */
    static final class C11155a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super C> f29731f;

        /* renamed from: g */
        final Callable<C> f29732g;

        /* renamed from: h */
        final C11488s<? extends Open> f29733h;

        /* renamed from: i */
        final C10861o<? super Open, ? extends C11488s<? extends Close>> f29734i;

        /* renamed from: j */
        final C10841b f29735j = new C10841b();

        /* renamed from: k */
        final AtomicReference<C10842c> f29736k = new AtomicReference<>();

        /* renamed from: l */
        final C11428c f29737l = new C11428c();

        /* renamed from: m */
        volatile boolean f29738m;

        /* renamed from: n */
        final C11385c<C> f29739n = new C11385c<>(C11482n.bufferSize());

        /* renamed from: o */
        volatile boolean f29740o;

        /* renamed from: p */
        long f29741p;

        /* renamed from: q */
        Map<Long, C> f29742q = new LinkedHashMap();

        /* renamed from: q.a.d0.e.e.m$a$a */
        /* compiled from: ObservableBufferBoundary */
        static final class C11156a<Open> extends AtomicReference<C10842c> implements C11490u<Open>, C10842c {

            /* renamed from: f */
            final C11155a<?, ?, Open, ?> f29743f;

            C11156a(C11155a<?, ?, Open, ?> aVar) {
                this.f29743f = aVar;
            }

            public void dispose() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public boolean isDisposed() {
                return get() == C10867d.DISPOSED;
            }

            public void onComplete() {
                lazySet(C10867d.DISPOSED);
                this.f29743f.mo36914a(this);
            }

            public void onError(Throwable th) {
                lazySet(C10867d.DISPOSED);
                this.f29743f.mo36913a((C10842c) this, th);
            }

            public void onNext(Open open) {
                this.f29743f.mo36912a(open);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11155a(C11490u<? super C> uVar, C11488s<? extends Open> sVar, C10861o<? super Open, ? extends C11488s<? extends Close>> oVar, Callable<C> callable) {
            this.f29731f = uVar;
            this.f29732g = callable;
            this.f29733h = sVar;
            this.f29734i = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36912a(Open open) {
            try {
                C call = this.f29732g.call();
                C10910b.m36861a(call, "The bufferSupplier returned a null Collection");
                Collection collection = (Collection) call;
                Object apply = this.f29734i.apply(open);
                C10910b.m36861a(apply, "The bufferClose returned a null ObservableSource");
                C11488s sVar = (C11488s) apply;
                long j = this.f29741p;
                this.f29741p = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.f29742q;
                    if (map != null) {
                        map.put(Long.valueOf(j), collection);
                        C11157b bVar = new C11157b(this, j);
                        this.f29735j.mo36646b(bVar);
                        sVar.subscribe(bVar);
                    }
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10867d.m36773a(this.f29736k);
                onError(th);
            }
        }

        public void dispose() {
            if (C10867d.m36773a(this.f29736k)) {
                this.f29740o = true;
                this.f29735j.dispose();
                synchronized (this) {
                    this.f29742q = null;
                }
                if (getAndIncrement() != 0) {
                    this.f29739n.clear();
                }
            }
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f29736k.get());
        }

        public void onComplete() {
            this.f29735j.dispose();
            synchronized (this) {
                Map<Long, C> map = this.f29742q;
                if (map != null) {
                    for (C offer : map.values()) {
                        this.f29739n.offer(offer);
                    }
                    this.f29742q = null;
                    this.f29738m = true;
                    mo36911a();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29737l.mo37169a(th)) {
                this.f29735j.dispose();
                synchronized (this) {
                    this.f29742q = null;
                }
                this.f29738m = true;
                mo36911a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f29742q;
                if (map != null) {
                    for (C add : map.values()) {
                        add.add(t);
                    }
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this.f29736k, cVar)) {
                C11156a aVar = new C11156a(this);
                this.f29735j.mo36646b(aVar);
                this.f29733h.subscribe(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36914a(C11156a<Open> aVar) {
            this.f29735j.mo36647c(aVar);
            if (this.f29735j.mo36643a() == 0) {
                C10867d.m36773a(this.f29736k);
                this.f29738m = true;
                mo36911a();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r4 == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.f29738m = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            mo36911a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36915a(p120q.p326a.p329d0.p334e.p339e.C11154m.C11157b<T, C> r4, long r5) {
            /*
                r3 = this;
                q.a.b0.b r0 = r3.f29735j
                r0.mo36647c(r4)
                q.a.b0.b r4 = r3.f29735j
                int r4 = r4.mo36643a()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<q.a.b0.c> r4 = r3.f29736k
                p120q.p326a.p329d0.p330a.C10867d.m36773a((java.util.concurrent.atomic.AtomicReference<p120q.p326a.p327b0.C10842c>) r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C> r1 = r3.f29742q     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001d:
                q.a.d0.f.c<C> r1 = r3.f29739n     // Catch:{ all -> 0x0035 }
                java.util.Map<java.lang.Long, C> r2 = r3.f29742q     // Catch:{ all -> 0x0035 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0035 }
                java.lang.Object r5 = r2.remove(r5)     // Catch:{ all -> 0x0035 }
                r1.offer(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                r3.f29738m = r0
            L_0x0031:
                r3.mo36911a()
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11154m.C11155a.mo36915a(q.a.d0.e.e.m$b, long):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36913a(C10842c cVar, Throwable th) {
            C10867d.m36773a(this.f29736k);
            this.f29735j.mo36647c(cVar);
            onError(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36911a() {
            if (getAndIncrement() == 0) {
                C11490u<? super C> uVar = this.f29731f;
                C11385c<C> cVar = this.f29739n;
                int i = 1;
                while (!this.f29740o) {
                    boolean z = this.f29738m;
                    if (!z || this.f29737l.get() == null) {
                        Collection collection = (Collection) cVar.poll();
                        boolean z2 = collection == null;
                        if (z && z2) {
                            uVar.onComplete();
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            uVar.onNext(collection);
                        }
                    } else {
                        cVar.clear();
                        uVar.onError(this.f29737l.mo37168a());
                        return;
                    }
                }
                cVar.clear();
            }
        }
    }
}
