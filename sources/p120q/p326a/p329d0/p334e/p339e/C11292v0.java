package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
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
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p341f.C11384b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.v0 */
/* compiled from: ObservableFlatMap */
public final class C11292v0<T, U> extends C10980a<T, U> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<? extends U>> f30213g;

    /* renamed from: h */
    final boolean f30214h;

    /* renamed from: i */
    final int f30215i;

    /* renamed from: j */
    final int f30216j;

    /* renamed from: q.a.d0.e.e.v0$a */
    /* compiled from: ObservableFlatMap */
    static final class C11293a<T, U> extends AtomicReference<C10842c> implements C11490u<U> {

        /* renamed from: f */
        final long f30217f;

        /* renamed from: g */
        final C11294b<T, U> f30218g;

        /* renamed from: h */
        volatile boolean f30219h;

        /* renamed from: i */
        volatile C10918g<U> f30220i;

        /* renamed from: j */
        int f30221j;

        C11293a(C11294b<T, U> bVar, long j) {
            this.f30217f = j;
            this.f30218g = bVar;
        }

        /* renamed from: a */
        public void mo37019a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onComplete() {
            this.f30219h = true;
            this.f30218g.mo37027c();
        }

        public void onError(Throwable th) {
            if (this.f30218g.f30231m.mo37169a(th)) {
                C11294b<T, U> bVar = this.f30218g;
                if (!bVar.f30226h) {
                    bVar.mo37026b();
                }
                this.f30219h = true;
                this.f30218g.mo37027c();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(U u) {
            if (this.f30221j == 0) {
                this.f30218g.mo37020a(u, this);
            } else {
                this.f30218g.mo37027c();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar) && (cVar instanceof C10913b)) {
                C10913b bVar = (C10913b) cVar;
                int a = bVar.mo36665a(7);
                if (a == 1) {
                    this.f30221j = a;
                    this.f30220i = bVar;
                    this.f30219h = true;
                    this.f30218g.mo37027c();
                } else if (a == 2) {
                    this.f30221j = a;
                    this.f30220i = bVar;
                }
            }
        }
    }

    public C11292v0(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<? extends U>> oVar, boolean z, int i, int i2) {
        super(sVar);
        this.f30213g = oVar;
        this.f30214h = z;
        this.f30215i = i;
        this.f30216j = i2;
    }

    public void subscribeActual(C11490u<? super U> uVar) {
        if (!C11337y2.m37296a(this.f29150f, uVar, this.f30213g)) {
            this.f29150f.subscribe(new C11294b(uVar, this.f30213g, this.f30214h, this.f30215i, this.f30216j));
        }
    }

    /* renamed from: q.a.d0.e.e.v0$b */
    /* compiled from: ObservableFlatMap */
    static final class C11294b<T, U> extends AtomicInteger implements C10842c, C11490u<T> {

        /* renamed from: v */
        static final C11293a<?, ?>[] f30222v = new C11293a[0];

        /* renamed from: w */
        static final C11293a<?, ?>[] f30223w = new C11293a[0];

        /* renamed from: f */
        final C11490u<? super U> f30224f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends U>> f30225g;

        /* renamed from: h */
        final boolean f30226h;

        /* renamed from: i */
        final int f30227i;

        /* renamed from: j */
        final int f30228j;

        /* renamed from: k */
        volatile C10917f<U> f30229k;

        /* renamed from: l */
        volatile boolean f30230l;

        /* renamed from: m */
        final C11428c f30231m = new C11428c();

        /* renamed from: n */
        volatile boolean f30232n;

        /* renamed from: o */
        final AtomicReference<C11293a<?, ?>[]> f30233o;

        /* renamed from: p */
        C10842c f30234p;

        /* renamed from: q */
        long f30235q;

        /* renamed from: r */
        long f30236r;

        /* renamed from: s */
        int f30237s;

        /* renamed from: t */
        Queue<C11488s<? extends U>> f30238t;

        /* renamed from: u */
        int f30239u;

        C11294b(C11490u<? super U> uVar, C10861o<? super T, ? extends C11488s<? extends U>> oVar, boolean z, int i, int i2) {
            this.f30224f = uVar;
            this.f30225g = oVar;
            this.f30226h = z;
            this.f30227i = i;
            this.f30228j = i2;
            if (i != Integer.MAX_VALUE) {
                this.f30238t = new ArrayDeque(i);
            }
            this.f30233o = new AtomicReference<>(f30222v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37021a(C11488s<? extends U> sVar) {
            C11488s<? extends U> poll;
            while (sVar instanceof Callable) {
                if (mo37023a((Callable) sVar) && this.f30227i != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.f30238t.poll();
                        if (poll == null) {
                            this.f30239u--;
                            z = true;
                        }
                    }
                    if (z) {
                        mo37027c();
                        return;
                    }
                    sVar = poll;
                } else {
                    return;
                }
            }
            long j = this.f30235q;
            this.f30235q = 1 + j;
            C11293a aVar = new C11293a(this, j);
            if (mo37024a(aVar)) {
                sVar.subscribe(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37025b(C11293a<T, U> aVar) {
            C11293a<T, U>[] aVarArr;
            C11293a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C11293a[]) this.f30233o.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f30222v;
                        } else {
                            C11293a<?, ?>[] aVarArr3 = new C11293a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f30233o.compareAndSet(aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37027c() {
            if (getAndIncrement() == 0) {
                mo37028d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37028d() {
            int i;
            int i2;
            C11490u<? super U> uVar = this.f30224f;
            int i3 = 1;
            while (!mo37022a()) {
                C10917f<U> fVar = this.f30229k;
                if (fVar != null) {
                    while (!mo37022a()) {
                        U poll = fVar.poll();
                        if (poll != null) {
                            uVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.f30230l;
                C10917f<U> fVar2 = this.f30229k;
                C11293a[] aVarArr = (C11293a[]) this.f30233o.get();
                int length = aVarArr.length;
                int i4 = 0;
                if (this.f30227i != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f30238t.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((fVar2 == null || fVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.f30236r;
                        int i5 = this.f30237s;
                        if (length <= i5 || aVarArr[i5].f30217f != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && aVarArr[i5].f30217f != j; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f30237s = i5;
                            this.f30236r = aVarArr[i5].f30217f;
                        }
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            if (!mo37022a()) {
                                C11293a aVar = aVarArr[i5];
                                C10918g<U> gVar = aVar.f30220i;
                                if (gVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = gVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            uVar.onNext(poll2);
                                            if (mo37022a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C9034a.m29708a(th);
                                            aVar.mo37019a();
                                            this.f30231m.mo37169a(th);
                                            if (!mo37022a()) {
                                                mo37025b(aVar);
                                                i8++;
                                                i2 = i5 + 1;
                                                if (i2 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f30219h;
                                C10918g<U> gVar2 = aVar.f30220i;
                                if (z2 && (gVar2 == null || gVar2.isEmpty())) {
                                    mo37025b(aVar);
                                    if (!mo37022a()) {
                                        i8++;
                                    } else {
                                        return;
                                    }
                                }
                                i2 = i5 + 1;
                                if (i2 != length) {
                                    i7++;
                                }
                                i2 = 0;
                                i7++;
                            } else {
                                return;
                            }
                        }
                        this.f30237s = i5;
                        this.f30236r = aVarArr[i5].f30217f;
                        i4 = i8;
                    }
                    if (i4 == 0) {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else if (this.f30227i != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i4 - 1;
                            if (i4 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                C11488s poll3 = this.f30238t.poll();
                                if (poll3 == null) {
                                    this.f30239u--;
                                } else {
                                    mo37021a(poll3);
                                }
                            }
                            i4 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable a = this.f30231m.mo37168a();
                    if (a == C11435j.f30621a) {
                        return;
                    }
                    if (a == null) {
                        uVar.onComplete();
                        return;
                    } else {
                        uVar.onError(a);
                        return;
                    }
                }
            }
        }

        public void dispose() {
            Throwable a;
            if (!this.f30232n) {
                this.f30232n = true;
                if (mo37026b() && (a = this.f30231m.mo37168a()) != null && a != C11435j.f30621a) {
                    C11459a.m37531b(a);
                }
            }
        }

        public boolean isDisposed() {
            return this.f30232n;
        }

        public void onComplete() {
            if (!this.f30230l) {
                this.f30230l = true;
                mo37027c();
            }
        }

        public void onError(Throwable th) {
            if (this.f30230l) {
                C11459a.m37531b(th);
            } else if (this.f30231m.mo37169a(th)) {
                this.f30230l = true;
                mo37027c();
            } else {
                C11459a.m37531b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f30230l) {
                try {
                    Object apply = this.f30225g.apply(t);
                    C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                    C11488s sVar = (C11488s) apply;
                    if (this.f30227i != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f30239u == this.f30227i) {
                                this.f30238t.offer(sVar);
                                return;
                            }
                            this.f30239u++;
                        }
                    }
                    mo37021a(sVar);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30234p.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30234p, cVar)) {
                this.f30234p = cVar;
                this.f30224f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37026b() {
            C11293a<?, ?>[] aVarArr;
            this.f30234p.dispose();
            C11293a<?, ?>[] aVarArr2 = (C11293a[]) this.f30233o.get();
            C11293a<?, ?>[] aVarArr3 = f30223w;
            if (aVarArr2 == aVarArr3 || (aVarArr = (C11293a[]) this.f30233o.getAndSet(aVarArr3)) == f30223w) {
                return false;
            }
            for (C11293a<?, ?> a : aVarArr) {
                a.mo37019a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37024a(C11293a<T, U> aVar) {
            C11293a<?, ?>[] aVarArr;
            C11293a[] aVarArr2;
            do {
                aVarArr = (C11293a[]) this.f30233o.get();
                if (aVarArr == f30223w) {
                    aVar.mo37019a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C11293a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f30233o.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37023a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C10917f<U> fVar = this.f30229k;
                    if (fVar == null) {
                        if (this.f30227i == Integer.MAX_VALUE) {
                            fVar = new C11385c<>(this.f30228j);
                        } else {
                            fVar = new C11384b<>(this.f30227i);
                        }
                        this.f30229k = fVar;
                    }
                    if (!fVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f30224f.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo37028d();
                return true;
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30231m.mo37169a(th);
                mo37027c();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37020a(U u, C11293a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C10918g gVar = aVar.f30220i;
                if (gVar == null) {
                    gVar = new C11385c(this.f30228j);
                    aVar.f30220i = gVar;
                }
                gVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f30224f.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo37028d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37022a() {
            if (this.f30232n) {
                return true;
            }
            Throwable th = (Throwable) this.f30231m.get();
            if (this.f30226h || th == null) {
                return false;
            }
            mo37026b();
            Throwable a = this.f30231m.mo37168a();
            if (a != C11435j.f30621a) {
                this.f30224f.onError(a);
            }
            return true;
        }
    }
}
