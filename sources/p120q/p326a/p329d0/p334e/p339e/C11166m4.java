package p120q.p326a.p329d0.p334e.p339e;

import java.util.Arrays;
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

/* renamed from: q.a.d0.e.e.m4 */
/* compiled from: ObservableZip */
public final class C11166m4<T, R> extends C11482n<R> {

    /* renamed from: f */
    final C11488s<? extends T>[] f29767f;

    /* renamed from: g */
    final Iterable<? extends C11488s<? extends T>> f29768g;

    /* renamed from: h */
    final C10861o<? super Object[], ? extends R> f29769h;

    /* renamed from: i */
    final int f29770i;

    /* renamed from: j */
    final boolean f29771j;

    /* renamed from: q.a.d0.e.e.m4$b */
    /* compiled from: ObservableZip */
    static final class C11168b<T, R> implements C11490u<T> {

        /* renamed from: f */
        final C11167a<T, R> f29778f;

        /* renamed from: g */
        final C11385c<T> f29779g;

        /* renamed from: h */
        volatile boolean f29780h;

        /* renamed from: i */
        Throwable f29781i;

        /* renamed from: j */
        final AtomicReference<C10842c> f29782j = new AtomicReference<>();

        C11168b(C11167a<T, R> aVar, int i) {
            this.f29778f = aVar;
            this.f29779g = new C11385c<>(i);
        }

        /* renamed from: a */
        public void mo36923a() {
            C10867d.m36773a(this.f29782j);
        }

        public void onComplete() {
            this.f29780h = true;
            this.f29778f.mo36922d();
        }

        public void onError(Throwable th) {
            this.f29781i = th;
            this.f29780h = true;
            this.f29778f.mo36922d();
        }

        public void onNext(T t) {
            this.f29779g.offer(t);
            this.f29778f.mo36922d();
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29782j, cVar);
        }
    }

    public C11166m4(C11488s<? extends T>[] sVarArr, Iterable<? extends C11488s<? extends T>> iterable, C10861o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f29767f = sVarArr;
        this.f29768g = iterable;
        this.f29769h = oVar;
        this.f29770i = i;
        this.f29771j = z;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        int i;
        C11488s<? extends T>[] sVarArr = this.f29767f;
        if (sVarArr == null) {
            sVarArr = new C11488s[8];
            i = 0;
            for (C11488s<? extends T> sVar : this.f29768g) {
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
        if (i == 0) {
            C10868e.m36785a((C11490u<?>) uVar);
        } else {
            new C11167a(uVar, this.f29769h, i, this.f29771j).mo36918a(sVarArr, this.f29770i);
        }
    }

    /* renamed from: q.a.d0.e.e.m4$a */
    /* compiled from: ObservableZip */
    static final class C11167a<T, R> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29772f;

        /* renamed from: g */
        final C10861o<? super Object[], ? extends R> f29773g;

        /* renamed from: h */
        final C11168b<T, R>[] f29774h;

        /* renamed from: i */
        final T[] f29775i;

        /* renamed from: j */
        final boolean f29776j;

        /* renamed from: k */
        volatile boolean f29777k;

        C11167a(C11490u<? super R> uVar, C10861o<? super Object[], ? extends R> oVar, int i, boolean z) {
            this.f29772f = uVar;
            this.f29773g = oVar;
            this.f29774h = new C11168b[i];
            this.f29775i = new Object[i];
            this.f29776j = z;
        }

        /* renamed from: a */
        public void mo36918a(C11488s<? extends T>[] sVarArr, int i) {
            C11168b<T, R>[] bVarArr = this.f29774h;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C11168b<>(this, i);
            }
            lazySet(0);
            this.f29772f.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f29777k; i3++) {
                sVarArr[i3].subscribe(bVarArr[i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36920b() {
            for (C11168b<T, R> a : this.f29774h) {
                a.mo36923a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36921c() {
            for (C11168b<T, R> bVar : this.f29774h) {
                bVar.f29779g.clear();
            }
        }

        /* renamed from: d */
        public void mo36922d() {
            Throwable th;
            if (getAndIncrement() == 0) {
                C11168b<T, R>[] bVarArr = this.f29774h;
                C11490u<? super R> uVar = this.f29772f;
                T[] tArr = this.f29775i;
                boolean z = this.f29776j;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C11168b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.f29780h;
                            T poll = bVar.f29779g.poll();
                            boolean z3 = poll == null;
                            if (!mo36919a(z2, z3, uVar, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f29780h && !z && (th = bVar.f29781i) != null) {
                            this.f29777k = true;
                            mo36917a();
                            uVar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.f29773g.apply(tArr.clone());
                            C10910b.m36861a(apply, "The zipper returned a null value");
                            uVar.onNext(apply);
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            C9034a.m29708a(th2);
                            mo36917a();
                            uVar.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        public void dispose() {
            if (!this.f29777k) {
                this.f29777k = true;
                mo36920b();
                if (getAndIncrement() == 0) {
                    mo36921c();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29777k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36917a() {
            mo36921c();
            mo36920b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36919a(boolean z, boolean z2, C11490u<? super R> uVar, boolean z3, C11168b<?, ?> bVar) {
            if (this.f29777k) {
                mo36917a();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = bVar.f29781i;
                    if (th != null) {
                        this.f29777k = true;
                        mo36917a();
                        uVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f29777k = true;
                        mo36917a();
                        uVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = bVar.f29781i;
                    this.f29777k = true;
                    mo36917a();
                    if (th2 != null) {
                        uVar.onError(th2);
                    } else {
                        uVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }
}
