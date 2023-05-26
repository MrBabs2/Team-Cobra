package p123rx.p127s;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p401n.p402a.C12502a;

/* renamed from: rx.s.b */
/* compiled from: PublishSubject */
public final class C12871b<T> extends C5382d<T, T> {

    /* renamed from: g */
    final C12873b<T> f33096g;

    /* renamed from: rx.s.b$a */
    /* compiled from: PublishSubject */
    static final class C12872a<T> extends AtomicLong implements C12473g, C5375k, C5372f<T> {

        /* renamed from: f */
        final C12873b<T> f33097f;

        /* renamed from: g */
        final C12475j<? super T> f33098g;

        /* renamed from: h */
        long f33099h;

        public C12872a(C12873b<T> bVar, C12475j<? super T> jVar) {
            this.f33097f = bVar;
            this.f33098g = jVar;
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f33098g.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f33098g.onError(th);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.f33099h;
                if (j != j2) {
                    this.f33099h = j2 + 1;
                    this.f33098g.onNext(t);
                    return;
                }
                unsubscribe();
                this.f33098g.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            long j2;
            if (C12502a.m40961a(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || compareAndSet(j2, C12502a.m40959a(j2, j))) {
                    }
                    j2 = get();
                    return;
                } while (compareAndSet(j2, C12502a.m40959a(j2, j)));
            }
        }

        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f33097f.mo41085b(this);
            }
        }
    }

    protected C12871b(C12873b<T> bVar) {
        super(bVar);
        this.f33096g = bVar;
    }

    /* renamed from: p */
    public static <T> C12871b<T> m41468p() {
        return new C12871b<>(new C12873b());
    }

    public void onCompleted() {
        this.f33096g.onCompleted();
    }

    public void onError(Throwable th) {
        this.f33096g.onError(th);
    }

    public void onNext(T t) {
        this.f33096g.onNext(t);
    }

    /* renamed from: rx.s.b$b */
    /* compiled from: PublishSubject */
    static final class C12873b<T> extends AtomicReference<C12872a<T>[]> implements C5368e.C5370a<T>, C5372f<T> {

        /* renamed from: g */
        static final C12872a[] f33100g = new C12872a[0];

        /* renamed from: h */
        static final C12872a[] f33101h = new C12872a[0];

        /* renamed from: f */
        Throwable f33102f;

        public C12873b() {
            lazySet(f33100g);
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            C12872a aVar = new C12872a(this, jVar);
            jVar.add(aVar);
            jVar.setProducer(aVar);
            if (!mo41084a(aVar)) {
                Throwable th = this.f33102f;
                if (th != null) {
                    jVar.onError(th);
                } else {
                    jVar.onCompleted();
                }
            } else if (aVar.isUnsubscribed()) {
                mo41085b(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41085b(C12872a<T> aVar) {
            C12872a<T>[] aVarArr;
            C12872a[] aVarArr2;
            do {
                aVarArr = (C12872a[]) get();
                if (aVarArr != f33101h && aVarArr != f33100g) {
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
                            aVarArr2 = f33100g;
                        } else {
                            C12872a[] aVarArr3 = new C12872a[(length - 1)];
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
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void onCompleted() {
            for (C12872a onCompleted : (C12872a[]) getAndSet(f33101h)) {
                onCompleted.onCompleted();
            }
        }

        public void onError(Throwable th) {
            this.f33102f = th;
            ArrayList arrayList = null;
            for (C12872a onError : (C12872a[]) getAndSet(f33101h)) {
                try {
                    onError.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            C12472a.m40943a((List<? extends Throwable>) arrayList);
        }

        public void onNext(T t) {
            for (C12872a onNext : (C12872a[]) get()) {
                onNext.onNext(t);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo41084a(C12872a<T> aVar) {
            C12872a[] aVarArr;
            C12872a[] aVarArr2;
            do {
                aVarArr = (C12872a[]) get();
                if (aVarArr == f33101h) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12872a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }
    }
}
