package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.h */
/* compiled from: ObservableAmb */
public final class C11074h<T> extends C11482n<T> {

    /* renamed from: f */
    final C11488s<? extends T>[] f29448f;

    /* renamed from: g */
    final Iterable<? extends C11488s<? extends T>> f29449g;

    /* renamed from: q.a.d0.e.e.h$b */
    /* compiled from: ObservableAmb */
    static final class C11076b<T> extends AtomicReference<C10842c> implements C11490u<T> {

        /* renamed from: f */
        final C11075a<T> f29453f;

        /* renamed from: g */
        final int f29454g;

        /* renamed from: h */
        final C11490u<? super T> f29455h;

        /* renamed from: i */
        boolean f29456i;

        C11076b(C11075a<T> aVar, int i, C11490u<? super T> uVar) {
            this.f29453f = aVar;
            this.f29454g = i;
            this.f29455h = uVar;
        }

        /* renamed from: a */
        public void mo36855a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onComplete() {
            if (this.f29456i) {
                this.f29455h.onComplete();
            } else if (this.f29453f.mo36854a(this.f29454g)) {
                this.f29456i = true;
                this.f29455h.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29456i) {
                this.f29455h.onError(th);
            } else if (this.f29453f.mo36854a(this.f29454g)) {
                this.f29456i = true;
                this.f29455h.onError(th);
            } else {
                C11459a.m37531b(th);
            }
        }

        public void onNext(T t) {
            if (this.f29456i) {
                this.f29455h.onNext(t);
            } else if (this.f29453f.mo36854a(this.f29454g)) {
                this.f29456i = true;
                this.f29455h.onNext(t);
            } else {
                ((C10842c) get()).dispose();
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    public C11074h(C11488s<? extends T>[] sVarArr, Iterable<? extends C11488s<? extends T>> iterable) {
        this.f29448f = sVarArr;
        this.f29449g = iterable;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        int i;
        C11488s<? extends T>[] sVarArr = this.f29448f;
        if (sVarArr == null) {
            sVarArr = new C11488s[8];
            try {
                i = 0;
                for (C11488s<? extends T> sVar : this.f29449g) {
                    if (sVar == null) {
                        C10868e.m36781a((Throwable) new NullPointerException("One of the sources is null"), (C11490u<?>) uVar);
                        return;
                    }
                    if (i == sVarArr.length) {
                        C11488s<? extends T>[] sVarArr2 = new C11488s[((i >> 2) + i)];
                        System.arraycopy(sVarArr, 0, sVarArr2, 0, i);
                        sVarArr = sVarArr2;
                    }
                    int i2 = i + 1;
                    sVarArr[i] = sVar;
                    i = i2;
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10868e.m36781a(th, (C11490u<?>) uVar);
                return;
            }
        } else {
            i = sVarArr.length;
        }
        if (i == 0) {
            C10868e.m36785a((C11490u<?>) uVar);
        } else if (i == 1) {
            sVarArr[0].subscribe(uVar);
        } else {
            new C11075a(uVar, i).mo36853a(sVarArr);
        }
    }

    /* renamed from: q.a.d0.e.e.h$a */
    /* compiled from: ObservableAmb */
    static final class C11075a<T> implements C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29450f;

        /* renamed from: g */
        final C11076b<T>[] f29451g;

        /* renamed from: h */
        final AtomicInteger f29452h = new AtomicInteger();

        C11075a(C11490u<? super T> uVar, int i) {
            this.f29450f = uVar;
            this.f29451g = new C11076b[i];
        }

        /* renamed from: a */
        public void mo36853a(C11488s<? extends T>[] sVarArr) {
            C11076b<T>[] bVarArr = this.f29451g;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr[i] = new C11076b<>(this, i2, this.f29450f);
                i = i2;
            }
            this.f29452h.lazySet(0);
            this.f29450f.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f29452h.get() == 0; i3++) {
                sVarArr[i3].subscribe(bVarArr[i3]);
            }
        }

        public void dispose() {
            if (this.f29452h.get() != -1) {
                this.f29452h.lazySet(-1);
                for (C11076b<T> a : this.f29451g) {
                    a.mo36855a();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29452h.get() == -1;
        }

        /* renamed from: a */
        public boolean mo36854a(int i) {
            int i2 = this.f29452h.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.f29452h.compareAndSet(0, i)) {
                    return false;
                }
                C11076b<T>[] bVarArr = this.f29451g;
                int length = bVarArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        bVarArr[i3].mo36855a();
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }
    }
}
