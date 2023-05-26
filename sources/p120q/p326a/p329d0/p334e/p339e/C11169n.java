package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10934p;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p347f0.C11453c;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.n */
/* compiled from: ObservableBufferBoundarySupplier */
public final class C11169n<T, U extends Collection<? super T>, B> extends C10980a<T, U> {

    /* renamed from: g */
    final Callable<? extends C11488s<B>> f29783g;

    /* renamed from: h */
    final Callable<U> f29784h;

    /* renamed from: q.a.d0.e.e.n$a */
    /* compiled from: ObservableBufferBoundarySupplier */
    static final class C11170a<T, U extends Collection<? super T>, B> extends C11453c<B> {

        /* renamed from: g */
        final C11171b<T, U, B> f29785g;

        /* renamed from: h */
        boolean f29786h;

        C11170a(C11171b<T, U, B> bVar) {
            this.f29785g = bVar;
        }

        public void onComplete() {
            if (!this.f29786h) {
                this.f29786h = true;
                this.f29785g.mo36926g();
            }
        }

        public void onError(Throwable th) {
            if (this.f29786h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29786h = true;
            this.f29785g.onError(th);
        }

        public void onNext(B b) {
            if (!this.f29786h) {
                this.f29786h = true;
                dispose();
                this.f29785g.mo36926g();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.n$b */
    /* compiled from: ObservableBufferBoundarySupplier */
    static final class C11171b<T, U extends Collection<? super T>, B> extends C10934p<T, U, U> implements C11490u<T>, C10842c {

        /* renamed from: l */
        final Callable<U> f29787l;

        /* renamed from: m */
        final Callable<? extends C11488s<B>> f29788m;

        /* renamed from: n */
        C10842c f29789n;

        /* renamed from: o */
        final AtomicReference<C10842c> f29790o = new AtomicReference<>();

        /* renamed from: p */
        U f29791p;

        C11171b(C11490u<? super U> uVar, Callable<U> callable, Callable<? extends C11488s<B>> callable2) {
            super(uVar, new C11382a());
            this.f29787l = callable;
            this.f29788m = callable2;
        }

        public void dispose() {
            if (!this.f29011i) {
                this.f29011i = true;
                this.f29789n.dispose();
                mo36925f();
                if (mo36736d()) {
                    this.f29010h.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36925f() {
            C10867d.m36773a(this.f29790o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36926g() {
            try {
                U call = this.f29787l.call();
                C10910b.m36861a(call, "The buffer supplied is null");
                U u = (Collection) call;
                try {
                    Object call2 = this.f29788m.call();
                    C10910b.m36861a(call2, "The boundary ObservableSource supplied is null");
                    C11488s sVar = (C11488s) call2;
                    C11170a aVar = new C11170a(this);
                    if (C10867d.m36774a(this.f29790o, (C10842c) aVar)) {
                        synchronized (this) {
                            U u2 = this.f29791p;
                            if (u2 != null) {
                                this.f29791p = u;
                                sVar.subscribe(aVar);
                                mo36730a(u2, false, this);
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29011i = true;
                    this.f29789n.dispose();
                    this.f29009g.onError(th);
                }
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                dispose();
                this.f29009g.onError(th2);
            }
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            p120q.p326a.p329d0.p345j.C11445q.m37498a(r3.f29010h, r3.f29009g, false, r3, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            r3.f29010h.offer(r0);
            r3.f29012j = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (mo36736d() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r3 = this;
                monitor-enter(r3)
                U r0 = r3.f29791p     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f29791p = r1     // Catch:{ all -> 0x0022 }
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                q.a.d0.c.f<U> r1 = r3.f29010h
                r1.offer(r0)
                r0 = 1
                r3.f29012j = r0
                boolean r0 = r3.mo36736d()
                if (r0 == 0) goto L_0x0021
                q.a.d0.c.f<U> r0 = r3.f29010h
                q.a.u<? super V> r1 = r3.f29009g
                r2 = 0
                p120q.p326a.p329d0.p345j.C11445q.m37498a(r0, r1, r2, r3, r3)
            L_0x0021:
                return
            L_0x0022:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11169n.C11171b.onComplete():void");
        }

        public void onError(Throwable th) {
            dispose();
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.f29791p;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29789n, cVar)) {
                this.f29789n = cVar;
                C11490u<? super V> uVar = this.f29009g;
                try {
                    U call = this.f29787l.call();
                    C10910b.m36861a(call, "The buffer supplied is null");
                    this.f29791p = (Collection) call;
                    try {
                        Object call2 = this.f29788m.call();
                        C10910b.m36861a(call2, "The boundary ObservableSource supplied is null");
                        C11488s sVar = (C11488s) call2;
                        C11170a aVar = new C11170a(this);
                        this.f29790o.set(aVar);
                        uVar.onSubscribe(this);
                        if (!this.f29011i) {
                            sVar.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        this.f29011i = true;
                        cVar.dispose();
                        C10868e.m36781a(th, (C11490u<?>) uVar);
                    }
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    this.f29011i = true;
                    cVar.dispose();
                    C10868e.m36781a(th2, (C11490u<?>) uVar);
                }
            }
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super U> uVar, U u) {
            this.f29009g.onNext(u);
        }
    }

    public C11169n(C11488s<T> sVar, Callable<? extends C11488s<B>> callable, Callable<U> callable2) {
        super(sVar);
        this.f29783g = callable;
        this.f29784h = callable2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        this.f29150f.subscribe(new C11171b(new C11455e(uVar), this.f29784h, this.f29783g));
    }
}
