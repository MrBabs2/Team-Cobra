package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10934p;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p329d0.p345j.C11445q;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.p */
/* compiled from: ObservableBufferTimed */
public final class C11208p<T, U extends Collection<? super T>> extends C10980a<T, U> {

    /* renamed from: g */
    final long f29897g;

    /* renamed from: h */
    final long f29898h;

    /* renamed from: i */
    final TimeUnit f29899i;

    /* renamed from: j */
    final C11491v f29900j;

    /* renamed from: k */
    final Callable<U> f29901k;

    /* renamed from: l */
    final int f29902l;

    /* renamed from: m */
    final boolean f29903m;

    /* renamed from: q.a.d0.e.e.p$a */
    /* compiled from: ObservableBufferTimed */
    static final class C11209a<T, U extends Collection<? super T>> extends C10934p<T, U, U> implements Runnable, C10842c {

        /* renamed from: l */
        final Callable<U> f29904l;

        /* renamed from: m */
        final long f29905m;

        /* renamed from: n */
        final TimeUnit f29906n;

        /* renamed from: o */
        final int f29907o;

        /* renamed from: p */
        final boolean f29908p;

        /* renamed from: q */
        final C11491v.C11494c f29909q;

        /* renamed from: r */
        U f29910r;

        /* renamed from: s */
        C10842c f29911s;

        /* renamed from: t */
        C10842c f29912t;

        /* renamed from: u */
        long f29913u;

        /* renamed from: v */
        long f29914v;

        C11209a(C11490u<? super U> uVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C11491v.C11494c cVar) {
            super(uVar, new C11382a());
            this.f29904l = callable;
            this.f29905m = j;
            this.f29906n = timeUnit;
            this.f29907o = i;
            this.f29908p = z;
            this.f29909q = cVar;
        }

        public void dispose() {
            if (!this.f29011i) {
                this.f29011i = true;
                this.f29912t.dispose();
                this.f29909q.dispose();
                synchronized (this) {
                    this.f29910r = null;
                }
            }
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        public void onComplete() {
            U u;
            this.f29909q.dispose();
            synchronized (this) {
                u = this.f29910r;
                this.f29910r = null;
            }
            if (u != null) {
                this.f29010h.offer(u);
                this.f29012j = true;
                if (mo36736d()) {
                    C11445q.m37498a(this.f29010h, this.f29009g, false, this, this);
                }
            }
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f29910r = null;
            }
            this.f29009g.onError(th);
            this.f29909q.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f29908p == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f29911s.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo36733b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = r7.f29904l.call();
            p120q.p326a.p329d0.p331b.C10910b.m36861a(r8, "The buffer supplied is null");
            r8 = (java.util.Collection) r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f29910r = r8;
            r7.f29914v++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
            if (r7.f29908p == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r0 = r7.f29909q;
            r4 = r7.f29905m;
            r7.f29911s = r0.mo37604a(r7, r4, r4, r7.f29906n);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            p036io.reactivex.exceptions.C9034a.m29708a(r8);
            r7.f29009g.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f29910r     // Catch:{ all -> 0x0065 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0065 }
                int r8 = r0.size()     // Catch:{ all -> 0x0065 }
                int r1 = r7.f29907o     // Catch:{ all -> 0x0065 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0014:
                r8 = 0
                r7.f29910r = r8     // Catch:{ all -> 0x0065 }
                long r1 = r7.f29913u     // Catch:{ all -> 0x0065 }
                r3 = 1
                long r1 = r1 + r3
                r7.f29913u = r1     // Catch:{ all -> 0x0065 }
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                boolean r8 = r7.f29908p
                if (r8 == 0) goto L_0x0028
                q.a.b0.c r8 = r7.f29911s
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo36733b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f29904l     // Catch:{ all -> 0x0058 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0058 }
                java.lang.String r0 = "The buffer supplied is null"
                p120q.p326a.p329d0.p331b.C10910b.m36861a(r8, (java.lang.String) r0)     // Catch:{ all -> 0x0058 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0058 }
                monitor-enter(r7)
                r7.f29910r = r8     // Catch:{ all -> 0x0055 }
                long r0 = r7.f29914v     // Catch:{ all -> 0x0055 }
                long r0 = r0 + r3
                r7.f29914v = r0     // Catch:{ all -> 0x0055 }
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                boolean r8 = r7.f29908p
                if (r8 == 0) goto L_0x0054
                q.a.v$c r0 = r7.f29909q
                long r4 = r7.f29905m
                java.util.concurrent.TimeUnit r6 = r7.f29906n
                r1 = r7
                r2 = r4
                q.a.b0.c r8 = r0.mo37604a(r1, r2, r4, r6)
                r7.f29911s = r8
            L_0x0054:
                return
            L_0x0055:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                throw r8
            L_0x0058:
                r8 = move-exception
                p036io.reactivex.exceptions.C9034a.m29708a(r8)
                q.a.u<? super V> r0 = r7.f29009g
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0065:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11208p.C11209a.onNext(java.lang.Object):void");
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29912t, cVar)) {
                this.f29912t = cVar;
                try {
                    U call = this.f29904l.call();
                    C10910b.m36861a(call, "The buffer supplied is null");
                    this.f29910r = (Collection) call;
                    this.f29009g.onSubscribe(this);
                    C11491v.C11494c cVar2 = this.f29909q;
                    long j = this.f29905m;
                    this.f29911s = cVar2.mo37604a(this, j, j, this.f29906n);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    cVar.dispose();
                    C10868e.m36781a(th, (C11490u<?>) this.f29009g);
                    this.f29909q.dispose();
                }
            }
        }

        public void run() {
            try {
                U call = this.f29904l.call();
                C10910b.m36861a(call, "The bufferSupplier returned a null buffer");
                U u = (Collection) call;
                synchronized (this) {
                    U u2 = this.f29910r;
                    if (u2 != null) {
                        if (this.f29913u == this.f29914v) {
                            this.f29910r = u;
                            mo36733b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                dispose();
                this.f29009g.onError(th);
            }
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super U> uVar, U u) {
            uVar.onNext(u);
        }
    }

    /* renamed from: q.a.d0.e.e.p$b */
    /* compiled from: ObservableBufferTimed */
    static final class C11210b<T, U extends Collection<? super T>> extends C10934p<T, U, U> implements Runnable, C10842c {

        /* renamed from: l */
        final Callable<U> f29915l;

        /* renamed from: m */
        final long f29916m;

        /* renamed from: n */
        final TimeUnit f29917n;

        /* renamed from: o */
        final C11491v f29918o;

        /* renamed from: p */
        C10842c f29919p;

        /* renamed from: q */
        U f29920q;

        /* renamed from: r */
        final AtomicReference<C10842c> f29921r = new AtomicReference<>();

        C11210b(C11490u<? super U> uVar, Callable<U> callable, long j, TimeUnit timeUnit, C11491v vVar) {
            super(uVar, new C11382a());
            this.f29915l = callable;
            this.f29916m = j;
            this.f29917n = timeUnit;
            this.f29918o = vVar;
        }

        public void dispose() {
            C10867d.m36773a(this.f29921r);
            this.f29919p.dispose();
        }

        public boolean isDisposed() {
            return this.f29921r.get() == C10867d.DISPOSED;
        }

        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f29920q;
                this.f29920q = null;
            }
            if (u != null) {
                this.f29010h.offer(u);
                this.f29012j = true;
                if (mo36736d()) {
                    C11445q.m37498a(this.f29010h, this.f29009g, false, (C10842c) null, this);
                }
            }
            C10867d.m36773a(this.f29921r);
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f29920q = null;
            }
            this.f29009g.onError(th);
            C10867d.m36773a(this.f29921r);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.f29920q;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29919p, cVar)) {
                this.f29919p = cVar;
                try {
                    U call = this.f29915l.call();
                    C10910b.m36861a(call, "The buffer supplied is null");
                    this.f29920q = (Collection) call;
                    this.f29009g.onSubscribe(this);
                    if (!this.f29011i) {
                        C11491v vVar = this.f29918o;
                        long j = this.f29916m;
                        C10842c a = vVar.mo37112a(this, j, j, this.f29917n);
                        if (!this.f29921r.compareAndSet((Object) null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    dispose();
                    C10868e.m36781a(th, (C11490u<?>) this.f29009g);
                }
            }
        }

        public void run() {
            U u;
            try {
                U call = this.f29915l.call();
                C10910b.m36861a(call, "The bufferSupplier returned a null buffer");
                U u2 = (Collection) call;
                synchronized (this) {
                    u = this.f29920q;
                    if (u != null) {
                        this.f29920q = u2;
                    }
                }
                if (u == null) {
                    C10867d.m36773a(this.f29921r);
                } else {
                    mo36730a(u, false, this);
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29009g.onError(th);
                dispose();
            }
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super U> uVar, U u) {
            this.f29009g.onNext(u);
        }
    }

    public C11208p(C11488s<T> sVar, long j, long j2, TimeUnit timeUnit, C11491v vVar, Callable<U> callable, int i, boolean z) {
        super(sVar);
        this.f29897g = j;
        this.f29898h = j2;
        this.f29899i = timeUnit;
        this.f29900j = vVar;
        this.f29901k = callable;
        this.f29902l = i;
        this.f29903m = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        if (this.f29897g == this.f29898h && this.f29902l == Integer.MAX_VALUE) {
            this.f29150f.subscribe(new C11210b(new C11455e(uVar), this.f29901k, this.f29897g, this.f29899i, this.f29900j));
            return;
        }
        C11491v.C11494c a = this.f29900j.mo37114a();
        if (this.f29897g == this.f29898h) {
            this.f29150f.subscribe(new C11209a(new C11455e(uVar), this.f29901k, this.f29897g, this.f29899i, this.f29902l, this.f29903m, a));
        } else {
            this.f29150f.subscribe(new C11211c(new C11455e(uVar), this.f29901k, this.f29897g, this.f29898h, this.f29899i, a));
        }
    }

    /* renamed from: q.a.d0.e.e.p$c */
    /* compiled from: ObservableBufferTimed */
    static final class C11211c<T, U extends Collection<? super T>> extends C10934p<T, U, U> implements Runnable, C10842c {

        /* renamed from: l */
        final Callable<U> f29922l;

        /* renamed from: m */
        final long f29923m;

        /* renamed from: n */
        final long f29924n;

        /* renamed from: o */
        final TimeUnit f29925o;

        /* renamed from: p */
        final C11491v.C11494c f29926p;

        /* renamed from: q */
        final List<U> f29927q = new LinkedList();

        /* renamed from: r */
        C10842c f29928r;

        /* renamed from: q.a.d0.e.e.p$c$a */
        /* compiled from: ObservableBufferTimed */
        final class C11212a implements Runnable {

            /* renamed from: f */
            private final U f29929f;

            C11212a(U u) {
                this.f29929f = u;
            }

            public void run() {
                synchronized (C11211c.this) {
                    C11211c.this.f29927q.remove(this.f29929f);
                }
                C11211c cVar = C11211c.this;
                cVar.mo36733b(this.f29929f, false, cVar.f29926p);
            }
        }

        /* renamed from: q.a.d0.e.e.p$c$b */
        /* compiled from: ObservableBufferTimed */
        final class C11213b implements Runnable {

            /* renamed from: f */
            private final U f29931f;

            C11213b(U u) {
                this.f29931f = u;
            }

            public void run() {
                synchronized (C11211c.this) {
                    C11211c.this.f29927q.remove(this.f29931f);
                }
                C11211c cVar = C11211c.this;
                cVar.mo36733b(this.f29931f, false, cVar.f29926p);
            }
        }

        C11211c(C11490u<? super U> uVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C11491v.C11494c cVar) {
            super(uVar, new C11382a());
            this.f29922l = callable;
            this.f29923m = j;
            this.f29924n = j2;
            this.f29925o = timeUnit;
            this.f29926p = cVar;
        }

        public void dispose() {
            if (!this.f29011i) {
                this.f29011i = true;
                mo36958f();
                this.f29928r.dispose();
                this.f29926p.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36958f() {
            synchronized (this) {
                this.f29927q.clear();
            }
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f29927q);
                this.f29927q.clear();
            }
            for (Collection offer : arrayList) {
                this.f29010h.offer(offer);
            }
            this.f29012j = true;
            if (mo36736d()) {
                C11445q.m37498a(this.f29010h, this.f29009g, false, this.f29926p, this);
            }
        }

        public void onError(Throwable th) {
            this.f29012j = true;
            mo36958f();
            this.f29009g.onError(th);
            this.f29926p.dispose();
        }

        public void onNext(T t) {
            synchronized (this) {
                for (U add : this.f29927q) {
                    add.add(t);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29928r, cVar)) {
                this.f29928r = cVar;
                try {
                    U call = this.f29922l.call();
                    C10910b.m36861a(call, "The buffer supplied is null");
                    Collection collection = (Collection) call;
                    this.f29927q.add(collection);
                    this.f29009g.onSubscribe(this);
                    C11491v.C11494c cVar2 = this.f29926p;
                    long j = this.f29924n;
                    cVar2.mo37604a(this, j, j, this.f29925o);
                    this.f29926p.mo37117a(new C11213b(collection), this.f29923m, this.f29925o);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    cVar.dispose();
                    C10868e.m36781a(th, (C11490u<?>) this.f29009g);
                    this.f29926p.dispose();
                }
            }
        }

        public void run() {
            if (!this.f29011i) {
                try {
                    U call = this.f29922l.call();
                    C10910b.m36861a(call, "The bufferSupplier returned a null buffer");
                    Collection collection = (Collection) call;
                    synchronized (this) {
                        if (!this.f29011i) {
                            this.f29927q.add(collection);
                            this.f29926p.mo37117a(new C11212a(collection), this.f29923m, this.f29925o);
                        }
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29009g.onError(th);
                    dispose();
                }
            }
        }

        /* renamed from: a */
        public void mo36731a(C11490u<? super U> uVar, U u) {
            uVar.onNext(u);
        }
    }
}
