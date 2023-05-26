package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.concurrent.Callable;
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

/* renamed from: q.a.d0.e.e.o */
/* compiled from: ObservableBufferExactBoundary */
public final class C11196o<T, U extends Collection<? super T>, B> extends C10980a<T, U> {

    /* renamed from: g */
    final C11488s<B> f29859g;

    /* renamed from: h */
    final Callable<U> f29860h;

    /* renamed from: q.a.d0.e.e.o$a */
    /* compiled from: ObservableBufferExactBoundary */
    static final class C11197a<T, U extends Collection<? super T>, B> extends C11453c<B> {

        /* renamed from: g */
        final C11198b<T, U, B> f29861g;

        C11197a(C11198b<T, U, B> bVar) {
            this.f29861g = bVar;
        }

        public void onComplete() {
            this.f29861g.onComplete();
        }

        public void onError(Throwable th) {
            this.f29861g.onError(th);
        }

        public void onNext(B b) {
            this.f29861g.mo36942f();
        }
    }

    /* renamed from: q.a.d0.e.e.o$b */
    /* compiled from: ObservableBufferExactBoundary */
    static final class C11198b<T, U extends Collection<? super T>, B> extends C10934p<T, U, U> implements C11490u<T>, C10842c {

        /* renamed from: l */
        final Callable<U> f29862l;

        /* renamed from: m */
        final C11488s<B> f29863m;

        /* renamed from: n */
        C10842c f29864n;

        /* renamed from: o */
        C10842c f29865o;

        /* renamed from: p */
        U f29866p;

        C11198b(C11490u<? super U> uVar, Callable<U> callable, C11488s<B> sVar) {
            super(uVar, new C11382a());
            this.f29862l = callable;
            this.f29863m = sVar;
        }

        public void dispose() {
            if (!this.f29011i) {
                this.f29011i = true;
                this.f29865o.dispose();
                this.f29864n.dispose();
                if (mo36736d()) {
                    this.f29010h.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36942f() {
            try {
                U call = this.f29862l.call();
                C10910b.m36861a(call, "The buffer supplied is null");
                U u = (Collection) call;
                synchronized (this) {
                    U u2 = this.f29866p;
                    if (u2 != null) {
                        this.f29866p = u;
                        mo36730a(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                dispose();
                this.f29009g.onError(th);
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
                U r0 = r3.f29866p     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                r1 = 0
                r3.f29866p = r1     // Catch:{ all -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11196o.C11198b.onComplete():void");
        }

        public void onError(Throwable th) {
            dispose();
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.f29866p;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29864n, cVar)) {
                this.f29864n = cVar;
                try {
                    U call = this.f29862l.call();
                    C10910b.m36861a(call, "The buffer supplied is null");
                    this.f29866p = (Collection) call;
                    C11197a aVar = new C11197a(this);
                    this.f29865o = aVar;
                    this.f29009g.onSubscribe(this);
                    if (!this.f29011i) {
                        this.f29863m.subscribe(aVar);
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29011i = true;
                    cVar.dispose();
                    C10868e.m36781a(th, (C11490u<?>) this.f29009g);
                }
            }
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super U> uVar, U u) {
            this.f29009g.onNext(u);
        }
    }

    public C11196o(C11488s<T> sVar, C11488s<B> sVar2, Callable<U> callable) {
        super(sVar);
        this.f29859g = sVar2;
        this.f29860h = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        this.f29150f.subscribe(new C11198b(new C11455e(uVar), this.f29860h, this.f29859g));
    }
}
