package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p348g0.C11459a;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.i4 */
/* compiled from: ObservableWindowBoundarySupplier */
public final class C11102i4<T, B> extends C10980a<T, C11482n<T>> {

    /* renamed from: g */
    final Callable<? extends C11488s<B>> f29544g;

    /* renamed from: h */
    final int f29545h;

    /* renamed from: q.a.d0.e.e.i4$a */
    /* compiled from: ObservableWindowBoundarySupplier */
    static final class C11103a<T, B> extends C11453c<B> {

        /* renamed from: g */
        final C11104b<T, B> f29546g;

        /* renamed from: h */
        boolean f29547h;

        C11103a(C11104b<T, B> bVar) {
            this.f29546g = bVar;
        }

        public void onComplete() {
            if (!this.f29547h) {
                this.f29547h = true;
                this.f29546g.mo36878c();
            }
        }

        public void onError(Throwable th) {
            if (this.f29547h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29547h = true;
            this.f29546g.mo36875a(th);
        }

        public void onNext(B b) {
            if (!this.f29547h) {
                this.f29547h = true;
                dispose();
                this.f29546g.mo36876a(this);
            }
        }
    }

    public C11102i4(C11488s<T> sVar, Callable<? extends C11488s<B>> callable, int i) {
        super(sVar);
        this.f29544g = callable;
        this.f29545h = i;
    }

    public void subscribeActual(C11490u<? super C11482n<T>> uVar) {
        this.f29150f.subscribe(new C11104b(uVar, this.f29545h, this.f29544g));
    }

    /* renamed from: q.a.d0.e.e.i4$b */
    /* compiled from: ObservableWindowBoundarySupplier */
    static final class C11104b<T, B> extends AtomicInteger implements C11490u<T>, C10842c, Runnable {

        /* renamed from: q */
        static final C11103a<Object, Object> f29548q = new C11103a<>((C11104b) null);

        /* renamed from: r */
        static final Object f29549r = new Object();

        /* renamed from: f */
        final C11490u<? super C11482n<T>> f29550f;

        /* renamed from: g */
        final int f29551g;

        /* renamed from: h */
        final AtomicReference<C11103a<T, B>> f29552h = new AtomicReference<>();

        /* renamed from: i */
        final AtomicInteger f29553i = new AtomicInteger(1);

        /* renamed from: j */
        final C11382a<Object> f29554j = new C11382a<>();

        /* renamed from: k */
        final C11428c f29555k = new C11428c();

        /* renamed from: l */
        final AtomicBoolean f29556l = new AtomicBoolean();

        /* renamed from: m */
        final Callable<? extends C11488s<B>> f29557m;

        /* renamed from: n */
        C10842c f29558n;

        /* renamed from: o */
        volatile boolean f29559o;

        /* renamed from: p */
        C11476d<T> f29560p;

        C11104b(C11490u<? super C11482n<T>> uVar, int i, Callable<? extends C11488s<B>> callable) {
            this.f29550f = uVar;
            this.f29551g = i;
            this.f29557m = callable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36874a() {
            C10842c andSet = this.f29552h.getAndSet(f29548q);
            if (andSet != null && andSet != f29548q) {
                andSet.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36877b() {
            if (getAndIncrement() == 0) {
                C11490u<? super C11482n<T>> uVar = this.f29550f;
                C11382a<Object> aVar = this.f29554j;
                C11428c cVar = this.f29555k;
                int i = 1;
                while (this.f29553i.get() != 0) {
                    C11476d<T> dVar = this.f29560p;
                    boolean z = this.f29559o;
                    if (!z || cVar.get() == null) {
                        Object poll = aVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable a = cVar.mo37168a();
                            if (a == null) {
                                if (dVar != null) {
                                    this.f29560p = null;
                                    dVar.onComplete();
                                }
                                uVar.onComplete();
                                return;
                            }
                            if (dVar != null) {
                                this.f29560p = null;
                                dVar.onError(a);
                            }
                            uVar.onError(a);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != f29549r) {
                            dVar.onNext(poll);
                        } else {
                            if (dVar != null) {
                                this.f29560p = null;
                                dVar.onComplete();
                            }
                            if (!this.f29556l.get()) {
                                C11476d<T> a2 = C11476d.m37563a(this.f29551g, (Runnable) this);
                                this.f29560p = a2;
                                this.f29553i.getAndIncrement();
                                try {
                                    Object call = this.f29557m.call();
                                    C10910b.m36861a(call, "The other Callable returned a null ObservableSource");
                                    C11488s sVar = (C11488s) call;
                                    C11103a aVar2 = new C11103a(this);
                                    if (this.f29552h.compareAndSet((Object) null, aVar2)) {
                                        sVar.subscribe(aVar2);
                                        uVar.onNext(a2);
                                    }
                                } catch (Throwable th) {
                                    C9034a.m29708a(th);
                                    cVar.mo37169a(th);
                                    this.f29559o = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable a3 = cVar.mo37168a();
                        if (dVar != null) {
                            this.f29560p = null;
                            dVar.onError(a3);
                        }
                        uVar.onError(a3);
                        return;
                    }
                }
                aVar.clear();
                this.f29560p = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36878c() {
            this.f29558n.dispose();
            this.f29559o = true;
            mo36877b();
        }

        public void dispose() {
            if (this.f29556l.compareAndSet(false, true)) {
                mo36874a();
                if (this.f29553i.decrementAndGet() == 0) {
                    this.f29558n.dispose();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29556l.get();
        }

        public void onComplete() {
            mo36874a();
            this.f29559o = true;
            mo36877b();
        }

        public void onError(Throwable th) {
            mo36874a();
            if (this.f29555k.mo37169a(th)) {
                this.f29559o = true;
                mo36877b();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            this.f29554j.offer(t);
            mo36877b();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29558n, cVar)) {
                this.f29558n = cVar;
                this.f29550f.onSubscribe(this);
                this.f29554j.offer(f29549r);
                mo36877b();
            }
        }

        public void run() {
            if (this.f29553i.decrementAndGet() == 0) {
                this.f29558n.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36876a(C11103a<T, B> aVar) {
            this.f29552h.compareAndSet(aVar, (Object) null);
            this.f29554j.offer(f29549r);
            mo36877b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36875a(Throwable th) {
            this.f29558n.dispose();
            if (this.f29555k.mo37169a(th)) {
                this.f29559o = true;
                mo36877b();
                return;
            }
            C11459a.m37531b(th);
        }
    }
}
