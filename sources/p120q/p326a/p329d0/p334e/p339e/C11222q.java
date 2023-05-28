package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.e.e.q */
/* compiled from: ObservableCache */
public final class C11222q<T> extends C10980a<T, T> implements C11490u<T> {

    /* renamed from: p */
    static final C11223a[] f29962p = new C11223a[0];

    /* renamed from: q */
    static final C11223a[] f29963q = new C11223a[0];

    /* renamed from: g */
    final AtomicBoolean f29964g = new AtomicBoolean();

    /* renamed from: h */
    final int f29965h;

    /* renamed from: i */
    final AtomicReference<C11223a<T>[]> f29966i;

    /* renamed from: j */
    volatile long f29967j;

    /* renamed from: k */
    final C11224b<T> f29968k;

    /* renamed from: l */
    C11224b<T> f29969l;

    /* renamed from: m */
    int f29970m;

    /* renamed from: n */
    Throwable f29971n;

    /* renamed from: o */
    volatile boolean f29972o;

    /* renamed from: q.a.d0.e.e.q$a */
    /* compiled from: ObservableCache */
    static final class C11223a<T> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29973f;

        /* renamed from: g */
        final C11222q<T> f29974g;

        /* renamed from: h */
        C11224b<T> f29975h;

        /* renamed from: i */
        int f29976i;

        /* renamed from: j */
        long f29977j;

        /* renamed from: k */
        volatile boolean f29978k;

        C11223a(C11490u<? super T> uVar, C11222q<T> qVar) {
            this.f29973f = uVar;
            this.f29974g = qVar;
            this.f29975h = qVar.f29968k;
        }

        public void dispose() {
            if (!this.f29978k) {
                this.f29978k = true;
                this.f29974g.mo36966b(this);
            }
        }

        public boolean isDisposed() {
            return this.f29978k;
        }
    }

    /* renamed from: q.a.d0.e.e.q$b */
    /* compiled from: ObservableCache */
    static final class C11224b<T> {

        /* renamed from: a */
        final T[] f29979a;

        /* renamed from: b */
        volatile C11224b<T> f29980b;

        C11224b(int i) {
            this.f29979a = new Object[i];
        }
    }

    public C11222q(C11482n<T> nVar, int i) {
        super(nVar);
        this.f29965h = i;
        C11224b<T> bVar = new C11224b<>(i);
        this.f29968k = bVar;
        this.f29969l = bVar;
        this.f29966i = new AtomicReference<>(f29962p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36965a(C11223a<T> aVar) {
        C11223a[] aVarArr;
        C11223a[] aVarArr2;
        do {
            aVarArr = (C11223a[]) this.f29966i.get();
            if (aVarArr != f29963q) {
                int length = aVarArr.length;
                aVarArr2 = new C11223a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!this.f29966i.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36966b(C11223a<T> aVar) {
        C11223a<T>[] aVarArr;
        C11223a[] aVarArr2;
        do {
            aVarArr = (C11223a[]) this.f29966i.get();
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
                        aVarArr2 = f29962p;
                    } else {
                        C11223a[] aVarArr3 = new C11223a[(length - 1)];
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
        } while (!this.f29966i.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36967c(C11223a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.f29977j;
            int i = aVar.f29976i;
            C11224b<T> bVar = aVar.f29975h;
            C11490u<? super T> uVar = aVar.f29973f;
            int i2 = this.f29965h;
            int i3 = 1;
            while (!aVar.f29978k) {
                boolean z = this.f29972o;
                boolean z2 = this.f29967j == j;
                if (z && z2) {
                    aVar.f29975h = null;
                    Throwable th = this.f29971n;
                    if (th != null) {
                        uVar.onError(th);
                        return;
                    } else {
                        uVar.onComplete();
                        return;
                    }
                } else if (!z2) {
                    if (i == i2) {
                        bVar = bVar.f29980b;
                        i = 0;
                    }
                    uVar.onNext(bVar.f29979a[i]);
                    i++;
                    j++;
                } else {
                    aVar.f29977j = j;
                    aVar.f29976i = i;
                    aVar.f29975h = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            aVar.f29975h = null;
        }
    }

    public void onComplete() {
        this.f29972o = true;
        for (C11223a c : (C11223a[]) this.f29966i.getAndSet(f29963q)) {
            mo36967c(c);
        }
    }

    public void onError(Throwable th) {
        this.f29971n = th;
        this.f29972o = true;
        for (C11223a c : (C11223a[]) this.f29966i.getAndSet(f29963q)) {
            mo36967c(c);
        }
    }

    public void onNext(T t) {
        int i = this.f29970m;
        if (i == this.f29965h) {
            C11224b<T> bVar = new C11224b<>(i);
            bVar.f29979a[0] = t;
            this.f29970m = 1;
            this.f29969l.f29980b = bVar;
            this.f29969l = bVar;
        } else {
            this.f29969l.f29979a[i] = t;
            this.f29970m = i + 1;
        }
        this.f29967j++;
        for (C11223a c : (C11223a[]) this.f29966i.get()) {
            mo36967c(c);
        }
    }

    public void onSubscribe(C10842c cVar) {
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11223a aVar = new C11223a(uVar, this);
        uVar.onSubscribe(aVar);
        mo36965a(aVar);
        if (this.f29964g.get() || !this.f29964g.compareAndSet(false, true)) {
            mo36967c(aVar);
        } else {
            this.f29150f.subscribe(this);
        }
    }
}
