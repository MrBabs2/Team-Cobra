package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10921c;

/* renamed from: q.a.d0.e.e.b1 */
/* compiled from: ObservableFromArray */
public final class C10996b1<T> extends C11482n<T> {

    /* renamed from: f */
    final T[] f29190f;

    /* renamed from: q.a.d0.e.e.b1$a */
    /* compiled from: ObservableFromArray */
    static final class C10997a<T> extends C10921c<T> {

        /* renamed from: f */
        final C11490u<? super T> f29191f;

        /* renamed from: g */
        final T[] f29192g;

        /* renamed from: h */
        int f29193h;

        /* renamed from: i */
        boolean f29194i;

        /* renamed from: j */
        volatile boolean f29195j;

        C10997a(C11490u<? super T> uVar, T[] tArr) {
            this.f29191f = uVar;
            this.f29192g = tArr;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f29194i = true;
            return 1;
        }

        public void clear() {
            this.f29193h = this.f29192g.length;
        }

        public void dispose() {
            this.f29195j = true;
        }

        public boolean isDisposed() {
            return this.f29195j;
        }

        public boolean isEmpty() {
            return this.f29193h == this.f29192g.length;
        }

        public T poll() {
            int i = this.f29193h;
            T[] tArr = this.f29192g;
            if (i == tArr.length) {
                return null;
            }
            this.f29193h = i + 1;
            T t = tArr[i];
            C10910b.m36861a(t, "The array element is null");
            return t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36794a() {
            T[] tArr = this.f29192g;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C11490u<? super T> uVar = this.f29191f;
                    uVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f29191f.onNext(t);
            }
            if (!isDisposed()) {
                this.f29191f.onComplete();
            }
        }
    }

    public C10996b1(T[] tArr) {
        this.f29190f = tArr;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C10997a aVar = new C10997a(uVar, this.f29190f);
        uVar.onSubscribe(aVar);
        if (!aVar.f29194i) {
            aVar.mo36794a();
        }
    }
}
