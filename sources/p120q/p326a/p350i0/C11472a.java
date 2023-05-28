package p120q.p326a.p350i0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.i0.a */
/* compiled from: PublishSubject */
public final class C11472a<T> extends C11475c<T> {

    /* renamed from: h */
    static final C11473a[] f30692h = new C11473a[0];

    /* renamed from: i */
    static final C11473a[] f30693i = new C11473a[0];

    /* renamed from: f */
    final AtomicReference<C11473a<T>[]> f30694f = new AtomicReference<>(f30693i);

    /* renamed from: g */
    Throwable f30695g;

    C11472a() {
    }

    /* renamed from: c */
    public static <T> C11472a<T> m37553c() {
        return new C11472a<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo37231a(C11473a<T> aVar) {
        C11473a[] aVarArr;
        C11473a[] aVarArr2;
        do {
            aVarArr = (C11473a[]) this.f30694f.get();
            if (aVarArr == f30692h) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11473a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f30694f.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37232b(C11473a<T> aVar) {
        C11473a<T>[] aVarArr;
        C11473a[] aVarArr2;
        do {
            aVarArr = (C11473a[]) this.f30694f.get();
            if (aVarArr != f30692h && aVarArr != f30693i) {
                int length = aVarArr.length;
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
                        aVarArr2 = f30693i;
                    } else {
                        C11473a[] aVarArr3 = new C11473a[(length - 1)];
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
        } while (!this.f30694f.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        C11473a<T>[] aVarArr = this.f30694f.get();
        C11473a<T>[] aVarArr2 = f30692h;
        if (aVarArr != aVarArr2) {
            for (C11473a a : (C11473a[]) this.f30694f.getAndSet(aVarArr2)) {
                a.mo37233a();
            }
        }
    }

    public void onError(Throwable th) {
        C10910b.m36861a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C11473a<T>[] aVarArr = this.f30694f.get();
        C11473a<T>[] aVarArr2 = f30692h;
        if (aVarArr == aVarArr2) {
            C11459a.m37531b(th);
            return;
        }
        this.f30695g = th;
        for (C11473a a : (C11473a[]) this.f30694f.getAndSet(aVarArr2)) {
            a.mo37235a(th);
        }
    }

    public void onNext(T t) {
        C10910b.m36861a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C11473a a : (C11473a[]) this.f30694f.get()) {
            a.mo37234a(t);
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (this.f30694f.get() == f30692h) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11473a aVar = new C11473a(uVar, this);
        uVar.onSubscribe(aVar);
        if (!mo37231a(aVar)) {
            Throwable th = this.f30695g;
            if (th != null) {
                uVar.onError(th);
            } else {
                uVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo37232b(aVar);
        }
    }

    /* renamed from: q.a.i0.a$a */
    /* compiled from: PublishSubject */
    static final class C11473a<T> extends AtomicBoolean implements C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30696f;

        /* renamed from: g */
        final C11472a<T> f30697g;

        C11473a(C11490u<? super T> uVar, C11472a<T> aVar) {
            this.f30696f = uVar;
            this.f30697g = aVar;
        }

        /* renamed from: a */
        public void mo37234a(T t) {
            if (!get()) {
                this.f30696f.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f30697g.mo37232b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }

        /* renamed from: a */
        public void mo37235a(Throwable th) {
            if (get()) {
                C11459a.m37531b(th);
            } else {
                this.f30696f.onError(th);
            }
        }

        /* renamed from: a */
        public void mo37233a() {
            if (!get()) {
                this.f30696f.onComplete();
            }
        }
    }
}
