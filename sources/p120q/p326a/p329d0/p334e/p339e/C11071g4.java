package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.g4 */
/* compiled from: ObservableWindowBoundary */
public final class C11071g4<T, B> extends C10980a<T, C11482n<T>> {

    /* renamed from: g */
    final C11488s<B> f29433g;

    /* renamed from: h */
    final int f29434h;

    /* renamed from: q.a.d0.e.e.g4$a */
    /* compiled from: ObservableWindowBoundary */
    static final class C11072a<T, B> extends C11453c<B> {

        /* renamed from: g */
        final C11073b<T, B> f29435g;

        /* renamed from: h */
        boolean f29436h;

        C11072a(C11073b<T, B> bVar) {
            this.f29435g = bVar;
        }

        public void onComplete() {
            if (!this.f29436h) {
                this.f29436h = true;
                this.f29435g.mo36850b();
            }
        }

        public void onError(Throwable th) {
            if (this.f29436h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29436h = true;
            this.f29435g.mo36849a(th);
        }

        public void onNext(B b) {
            if (!this.f29436h) {
                this.f29435g.mo36851c();
            }
        }
    }

    public C11071g4(C11488s<T> sVar, C11488s<B> sVar2, int i) {
        super(sVar);
        this.f29433g = sVar2;
        this.f29434h = i;
    }

    public void subscribeActual(C11490u<? super C11482n<T>> uVar) {
        C11073b bVar = new C11073b(uVar, this.f29434h);
        uVar.onSubscribe(bVar);
        this.f29433g.subscribe(bVar.f29440h);
        this.f29150f.subscribe(bVar);
    }

    /* renamed from: q.a.d0.e.e.g4$b */
    /* compiled from: ObservableWindowBoundary */
    static final class C11073b<T, B> extends AtomicInteger implements C11490u<T>, C10842c, Runnable {

        /* renamed from: p */
        static final Object f29437p = new Object();

        /* renamed from: f */
        final C11490u<? super C11482n<T>> f29438f;

        /* renamed from: g */
        final int f29439g;

        /* renamed from: h */
        final C11072a<T, B> f29440h = new C11072a<>(this);

        /* renamed from: i */
        final AtomicReference<C10842c> f29441i = new AtomicReference<>();

        /* renamed from: j */
        final AtomicInteger f29442j = new AtomicInteger(1);

        /* renamed from: k */
        final C11382a<Object> f29443k = new C11382a<>();

        /* renamed from: l */
        final C11428c f29444l = new C11428c();

        /* renamed from: m */
        final AtomicBoolean f29445m = new AtomicBoolean();

        /* renamed from: n */
        volatile boolean f29446n;

        /* renamed from: o */
        C11476d<T> f29447o;

        C11073b(C11490u<? super C11482n<T>> uVar, int i) {
            this.f29438f = uVar;
            this.f29439g = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36849a(Throwable th) {
            C10867d.m36773a(this.f29441i);
            if (this.f29444l.mo37169a(th)) {
                this.f29446n = true;
                mo36848a();
                return;
            }
            C11459a.m37531b(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36850b() {
            C10867d.m36773a(this.f29441i);
            this.f29446n = true;
            mo36848a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36851c() {
            this.f29443k.offer(f29437p);
            mo36848a();
        }

        public void dispose() {
            if (this.f29445m.compareAndSet(false, true)) {
                this.f29440h.dispose();
                if (this.f29442j.decrementAndGet() == 0) {
                    C10867d.m36773a(this.f29441i);
                }
            }
        }

        public boolean isDisposed() {
            return this.f29445m.get();
        }

        public void onComplete() {
            this.f29440h.dispose();
            this.f29446n = true;
            mo36848a();
        }

        public void onError(Throwable th) {
            this.f29440h.dispose();
            if (this.f29444l.mo37169a(th)) {
                this.f29446n = true;
                mo36848a();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            this.f29443k.offer(t);
            mo36848a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this.f29441i, cVar)) {
                mo36851c();
            }
        }

        public void run() {
            if (this.f29442j.decrementAndGet() == 0) {
                C10867d.m36773a(this.f29441i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36848a() {
            if (getAndIncrement() == 0) {
                C11490u<? super C11482n<T>> uVar = this.f29438f;
                C11382a<Object> aVar = this.f29443k;
                C11428c cVar = this.f29444l;
                int i = 1;
                while (this.f29442j.get() != 0) {
                    C11476d<T> dVar = this.f29447o;
                    boolean z = this.f29446n;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable a = cVar.mo37168a();
                            if (a == null) {
                                if (dVar != null) {
                                    this.f29447o = null;
                                    dVar.onComplete();
                                }
                                uVar.onComplete();
                                return;
                            }
                            if (dVar != null) {
                                this.f29447o = null;
                                dVar.onError(a);
                            }
                            uVar.onError(a);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f29437p) {
                            dVar.onNext(poll);
                        } else {
                            if (dVar != null) {
                                this.f29447o = null;
                                dVar.onComplete();
                            }
                            if (!this.f29445m.get()) {
                                C11476d<T> a2 = C11476d.m37563a(this.f29439g, (Runnable) this);
                                this.f29447o = a2;
                                this.f29442j.getAndIncrement();
                                uVar.onNext(a2);
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable a3 = cVar.mo37168a();
                        if (dVar != null) {
                            this.f29447o = null;
                            dVar.onError(a3);
                        }
                        uVar.onError(a3);
                        return;
                    }
                }
                aVar.clear();
                this.f29447o = null;
            }
        }
    }
}
