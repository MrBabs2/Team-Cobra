package p120q.p326a.p329d0.p334e.p339e;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11437k;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.l4 */
/* compiled from: ObservableWithLatestFromMany */
public final class C11150l4<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C11488s<?>[] f29714g;

    /* renamed from: h */
    final Iterable<? extends C11488s<?>> f29715h;

    /* renamed from: i */
    final C10861o<? super Object[], R> f29716i;

    /* renamed from: q.a.d0.e.e.l4$a */
    /* compiled from: ObservableWithLatestFromMany */
    final class C11151a implements C10861o<T, R> {
        C11151a() {
        }

        public R apply(T t) throws Exception {
            R apply = C11150l4.this.f29716i.apply(new Object[]{t});
            C10910b.m36861a(apply, "The combiner returned a null value");
            return apply;
        }
    }

    /* renamed from: q.a.d0.e.e.l4$c */
    /* compiled from: ObservableWithLatestFromMany */
    static final class C11153c extends AtomicReference<C10842c> implements C11490u<Object> {

        /* renamed from: f */
        final C11152b<?, ?> f29725f;

        /* renamed from: g */
        final int f29726g;

        /* renamed from: h */
        boolean f29727h;

        C11153c(C11152b<?, ?> bVar, int i) {
            this.f29725f = bVar;
            this.f29726g = i;
        }

        /* renamed from: a */
        public void mo36910a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onComplete() {
            this.f29725f.mo36908a(this.f29726g, this.f29727h);
        }

        public void onError(Throwable th) {
            this.f29725f.mo36907a(this.f29726g, th);
        }

        public void onNext(Object obj) {
            if (!this.f29727h) {
                this.f29727h = true;
            }
            this.f29725f.mo36906a(this.f29726g, obj);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }
    }

    public C11150l4(C11488s<T> sVar, C11488s<?>[] sVarArr, C10861o<? super Object[], R> oVar) {
        super(sVar);
        this.f29714g = sVarArr;
        this.f29715h = null;
        this.f29716i = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        int i;
        C11488s<?>[] sVarArr = this.f29714g;
        if (sVarArr == null) {
            sVarArr = new C11488s[8];
            try {
                i = 0;
                for (C11488s<?> sVar : this.f29715h) {
                    if (i == sVarArr.length) {
                        sVarArr = (C11488s[]) Arrays.copyOf(sVarArr, (i >> 1) + i);
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
            new C11295v1(this.f29150f, new C11151a()).subscribeActual(uVar);
            return;
        }
        C11152b bVar = new C11152b(uVar, this.f29716i, i);
        uVar.onSubscribe(bVar);
        bVar.mo36909a(sVarArr, i);
        this.f29150f.subscribe(bVar);
    }

    /* renamed from: q.a.d0.e.e.l4$b */
    /* compiled from: ObservableWithLatestFromMany */
    static final class C11152b<T, R> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29718f;

        /* renamed from: g */
        final C10861o<? super Object[], R> f29719g;

        /* renamed from: h */
        final C11153c[] f29720h;

        /* renamed from: i */
        final AtomicReferenceArray<Object> f29721i;

        /* renamed from: j */
        final AtomicReference<C10842c> f29722j;

        /* renamed from: k */
        final C11428c f29723k;

        /* renamed from: l */
        volatile boolean f29724l;

        C11152b(C11490u<? super R> uVar, C10861o<? super Object[], R> oVar, int i) {
            this.f29718f = uVar;
            this.f29719g = oVar;
            C11153c[] cVarArr = new C11153c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C11153c(this, i2);
            }
            this.f29720h = cVarArr;
            this.f29721i = new AtomicReferenceArray<>(i);
            this.f29722j = new AtomicReference<>();
            this.f29723k = new C11428c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36909a(C11488s<?>[] sVarArr, int i) {
            C11153c[] cVarArr = this.f29720h;
            AtomicReference<C10842c> atomicReference = this.f29722j;
            for (int i2 = 0; i2 < i && !C10867d.m36775a(atomicReference.get()) && !this.f29724l; i2++) {
                sVarArr[i2].subscribe(cVarArr[i2]);
            }
        }

        public void dispose() {
            C10867d.m36773a(this.f29722j);
            for (C11153c a : this.f29720h) {
                a.mo36910a();
            }
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f29722j.get());
        }

        public void onComplete() {
            if (!this.f29724l) {
                this.f29724l = true;
                mo36905a(-1);
                C11437k.m37469a((C11490u<?>) this.f29718f, (AtomicInteger) this, this.f29723k);
            }
        }

        public void onError(Throwable th) {
            if (this.f29724l) {
                C11459a.m37531b(th);
                return;
            }
            this.f29724l = true;
            mo36905a(-1);
            C11437k.m37468a((C11490u<?>) this.f29718f, th, (AtomicInteger) this, this.f29723k);
        }

        public void onNext(T t) {
            if (!this.f29724l) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.f29721i;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = t;
                while (i < length) {
                    Object obj = atomicReferenceArray.get(i);
                    if (obj != null) {
                        i++;
                        objArr[i] = obj;
                    } else {
                        return;
                    }
                }
                try {
                    R apply = this.f29719g.apply(objArr);
                    C10910b.m36861a(apply, "combiner returned a null value");
                    C11437k.m37467a(this.f29718f, apply, (AtomicInteger) this, this.f29723k);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29722j, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36906a(int i, Object obj) {
            this.f29721i.set(i, obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36907a(int i, Throwable th) {
            this.f29724l = true;
            C10867d.m36773a(this.f29722j);
            mo36905a(i);
            C11437k.m37468a((C11490u<?>) this.f29718f, th, (AtomicInteger) this, this.f29723k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36908a(int i, boolean z) {
            if (!z) {
                this.f29724l = true;
                mo36905a(i);
                C11437k.m37469a((C11490u<?>) this.f29718f, (AtomicInteger) this, this.f29723k);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36905a(int i) {
            C11153c[] cVarArr = this.f29720h;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].mo36910a();
                }
            }
        }
    }

    public C11150l4(C11488s<T> sVar, Iterable<? extends C11488s<?>> iterable, C10861o<? super Object[], R> oVar) {
        super(sVar);
        this.f29714g = null;
        this.f29715h = iterable;
        this.f29716i = oVar;
    }
}
