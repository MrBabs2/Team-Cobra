package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p346e0.C11448a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.f2 */
/* compiled from: ObservablePublish */
public final class C11051f2<T> extends C11448a<T> implements Object<T> {

    /* renamed from: f */
    final C11488s<T> f29368f;

    /* renamed from: g */
    final AtomicReference<C11053b<T>> f29369g;

    /* renamed from: h */
    final C11488s<T> f29370h;

    /* renamed from: q.a.d0.e.e.f2$a */
    /* compiled from: ObservablePublish */
    static final class C11052a<T> extends AtomicReference<Object> implements C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29371f;

        C11052a(C11490u<? super T> uVar) {
            this.f29371f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36839a(C11053b<T> bVar) {
            if (!compareAndSet((Object) null, bVar)) {
                bVar.mo36841b(this);
            }
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C11053b) andSet).mo36841b(this);
            }
        }

        public boolean isDisposed() {
            return get() == this;
        }
    }

    /* renamed from: q.a.d0.e.e.f2$b */
    /* compiled from: ObservablePublish */
    static final class C11053b<T> implements C11490u<T>, C10842c {

        /* renamed from: j */
        static final C11052a[] f29372j = new C11052a[0];

        /* renamed from: k */
        static final C11052a[] f29373k = new C11052a[0];

        /* renamed from: f */
        final AtomicReference<C11053b<T>> f29374f;

        /* renamed from: g */
        final AtomicReference<C11052a<T>[]> f29375g = new AtomicReference<>(f29372j);

        /* renamed from: h */
        final AtomicBoolean f29376h;

        /* renamed from: i */
        final AtomicReference<C10842c> f29377i = new AtomicReference<>();

        C11053b(AtomicReference<C11053b<T>> atomicReference) {
            this.f29374f = atomicReference;
            this.f29376h = new AtomicBoolean();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36840a(C11052a<T> aVar) {
            C11052a[] aVarArr;
            C11052a[] aVarArr2;
            do {
                aVarArr = (C11052a[]) this.f29375g.get();
                if (aVarArr == f29373k) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C11052a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f29375g.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36841b(C11052a<T> aVar) {
            C11052a[] aVarArr;
            C11052a[] aVarArr2;
            do {
                aVarArr = (C11052a[]) this.f29375g.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f29372j;
                        } else {
                            C11052a[] aVarArr3 = new C11052a[(length - 1)];
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
            } while (!this.f29375g.compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            if (((C11052a[]) this.f29375g.getAndSet(f29373k)) != f29373k) {
                this.f29374f.compareAndSet(this, (Object) null);
                C10867d.m36773a(this.f29377i);
            }
        }

        public boolean isDisposed() {
            return this.f29375g.get() == f29373k;
        }

        public void onComplete() {
            this.f29374f.compareAndSet(this, (Object) null);
            for (C11052a aVar : (C11052a[]) this.f29375g.getAndSet(f29373k)) {
                aVar.f29371f.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f29374f.compareAndSet(this, (Object) null);
            C11052a[] aVarArr = (C11052a[]) this.f29375g.getAndSet(f29373k);
            if (aVarArr.length != 0) {
                for (C11052a aVar : aVarArr) {
                    aVar.f29371f.onError(th);
                }
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            for (C11052a aVar : (C11052a[]) this.f29375g.get()) {
                aVar.f29371f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29377i, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.f2$c */
    /* compiled from: ObservablePublish */
    static final class C11054c<T> implements C11488s<T> {

        /* renamed from: f */
        private final AtomicReference<C11053b<T>> f29378f;

        C11054c(AtomicReference<C11053b<T>> atomicReference) {
            this.f29378f = atomicReference;
        }

        public void subscribe(C11490u<? super T> uVar) {
            C11052a aVar = new C11052a(uVar);
            uVar.onSubscribe(aVar);
            while (true) {
                C11053b bVar = this.f29378f.get();
                if (bVar == null || bVar.isDisposed()) {
                    C11053b bVar2 = new C11053b(this.f29378f);
                    if (!this.f29378f.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo36840a(aVar)) {
                    aVar.mo36839a(bVar);
                    return;
                }
            }
        }
    }

    private C11051f2(C11488s<T> sVar, C11488s<T> sVar2, AtomicReference<C11053b<T>> atomicReference) {
        this.f29370h = sVar;
        this.f29368f = sVar2;
        this.f29369g = atomicReference;
    }

    /* renamed from: a */
    public static <T> C11448a<T> m36995a(C11488s<T> sVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C11459a.m37515a(new C11051f2(new C11054c(atomicReference), sVar, atomicReference));
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29370h.subscribe(uVar);
    }

    /* renamed from: a */
    public C11488s<T> mo36837a() {
        return this.f29368f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36838a(p120q.p326a.p328c0.C10853g<? super p120q.p326a.p327b0.C10842c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.f2$b<T>> r0 = r4.f29369g
            java.lang.Object r0 = r0.get()
            q.a.d0.e.e.f2$b r0 = (p120q.p326a.p329d0.p334e.p339e.C11051f2.C11053b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            q.a.d0.e.e.f2$b r1 = new q.a.d0.e.e.f2$b
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.f2$b<T>> r2 = r4.f29369g
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<q.a.d0.e.e.f2$b<T>> r2 = r4.f29369g
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f29376h
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f29376h
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.mo8098a(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            q.a.s<T> r5 = r4.f29368f
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
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11051f2.mo36838a(q.a.c0.g):void");
    }
}
