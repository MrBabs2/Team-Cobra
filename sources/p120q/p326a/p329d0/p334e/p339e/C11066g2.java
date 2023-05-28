package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p346e0.C11448a;

/* renamed from: q.a.d0.e.e.g2 */
/* compiled from: ObservablePublishAlt */
public final class C11066g2<T> extends C11448a<T> implements Object<T> {

    /* renamed from: f */
    final C11488s<T> f29420f;

    /* renamed from: g */
    final AtomicReference<C11068b<T>> f29421g = new AtomicReference<>();

    /* renamed from: q.a.d0.e.e.g2$a */
    /* compiled from: ObservablePublishAlt */
    static final class C11067a<T> extends AtomicReference<C11068b<T>> implements C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29422f;

        C11067a(C11490u<? super T> uVar, C11068b<T> bVar) {
            this.f29422f = uVar;
            lazySet(bVar);
        }

        public void dispose() {
            C11068b bVar = (C11068b) getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo36847b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: q.a.d0.e.e.g2$b */
    /* compiled from: ObservablePublishAlt */
    static final class C11068b<T> extends AtomicReference<C11067a<T>[]> implements C11490u<T>, C10842c {

        /* renamed from: j */
        static final C11067a[] f29423j = new C11067a[0];

        /* renamed from: k */
        static final C11067a[] f29424k = new C11067a[0];

        /* renamed from: f */
        final AtomicBoolean f29425f = new AtomicBoolean();

        /* renamed from: g */
        final AtomicReference<C11068b<T>> f29426g;

        /* renamed from: h */
        final AtomicReference<C10842c> f29427h;

        /* renamed from: i */
        Throwable f29428i;

        C11068b(AtomicReference<C11068b<T>> atomicReference) {
            this.f29426g = atomicReference;
            this.f29427h = new AtomicReference<>();
            lazySet(f29423j);
        }

        /* renamed from: a */
        public boolean mo36846a(C11067a<T> aVar) {
            C11067a[] aVarArr;
            C11067a[] aVarArr2;
            do {
                aVarArr = (C11067a[]) get();
                if (aVarArr == f29424k) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C11067a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo36847b(C11067a<T> aVar) {
            C11067a<T>[] aVarArr;
            C11067a[] aVarArr2;
            do {
                aVarArr = (C11067a[]) get();
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
                        aVarArr2 = f29423j;
                        if (length != 1) {
                            aVarArr2 = new C11067a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            getAndSet(f29424k);
            this.f29426g.compareAndSet(this, (Object) null);
            C10867d.m36773a(this.f29427h);
        }

        public boolean isDisposed() {
            return get() == f29424k;
        }

        public void onComplete() {
            this.f29427h.lazySet(C10867d.DISPOSED);
            for (C11067a aVar : (C11067a[]) getAndSet(f29424k)) {
                aVar.f29422f.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f29428i = th;
            this.f29427h.lazySet(C10867d.DISPOSED);
            for (C11067a aVar : (C11067a[]) getAndSet(f29424k)) {
                aVar.f29422f.onError(th);
            }
        }

        public void onNext(T t) {
            for (C11067a aVar : (C11067a[]) get()) {
                aVar.f29422f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29427h, cVar);
        }
    }

    public C11066g2(C11488s<T> sVar) {
        this.f29420f = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36838a(p120q.p326a.p328c0.C10853g<? super p120q.p326a.p327b0.C10842c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r0 = r4.f29421g
            java.lang.Object r0 = r0.get()
            q.a.d0.e.e.g2$b r0 = (p120q.p326a.p329d0.p334e.p339e.C11066g2.C11068b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            q.a.d0.e.e.g2$b r1 = new q.a.d0.e.e.g2$b
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r2 = r4.f29421g
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r2 = r4.f29421g
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f29425f
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f29425f
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.mo8098a(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            q.a.s<T> r5 = r4.f29420f
            r5.subscribe(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p036io.reactivex.exceptions.C9034a.m29708a(r5)
            java.lang.RuntimeException r5 = p120q.p326a.p329d0.p345j.C11435j.m37463a((java.lang.Throwable) r5)
            goto L_0x004a
        L_0x0049:
            throw r5
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11066g2.mo36838a(q.a.c0.g):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribeActual(p120q.p326a.C11490u<? super T> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r0 = r3.f29421g
            java.lang.Object r0 = r0.get()
            q.a.d0.e.e.g2$b r0 = (p120q.p326a.p329d0.p334e.p339e.C11066g2.C11068b) r0
            if (r0 != 0) goto L_0x001b
            q.a.d0.e.e.g2$b r1 = new q.a.d0.e.e.g2$b
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r2 = r3.f29421g
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.g2$b<T>> r2 = r3.f29421g
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            r0 = r1
        L_0x001b:
            q.a.d0.e.e.g2$a r1 = new q.a.d0.e.e.g2$a
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.mo36846a(r1)
            if (r2 == 0) goto L_0x0033
            boolean r4 = r1.isDisposed()
            if (r4 == 0) goto L_0x0032
            r0.mo36847b(r1)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Throwable r0 = r0.f29428i
            if (r0 == 0) goto L_0x003b
            r4.onError(r0)
            goto L_0x003e
        L_0x003b:
            r4.onComplete()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11066g2.subscribeActual(q.a.u):void");
    }

    /* renamed from: a */
    public void mo36845a(C10842c cVar) {
        this.f29421g.compareAndSet((C11068b) cVar, (Object) null);
    }
}
