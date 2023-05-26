package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.w3 */
/* compiled from: ObservableThrottleLatest */
public final class C11313w3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f30295g;

    /* renamed from: h */
    final TimeUnit f30296h;

    /* renamed from: i */
    final C11491v f30297i;

    /* renamed from: j */
    final boolean f30298j;

    /* renamed from: q.a.d0.e.e.w3$a */
    /* compiled from: ObservableThrottleLatest */
    static final class C11314a<T> extends AtomicInteger implements C11490u<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super T> f30299f;

        /* renamed from: g */
        final long f30300g;

        /* renamed from: h */
        final TimeUnit f30301h;

        /* renamed from: i */
        final C11491v.C11494c f30302i;

        /* renamed from: j */
        final boolean f30303j;

        /* renamed from: k */
        final AtomicReference<T> f30304k = new AtomicReference<>();

        /* renamed from: l */
        C10842c f30305l;

        /* renamed from: m */
        volatile boolean f30306m;

        /* renamed from: n */
        Throwable f30307n;

        /* renamed from: o */
        volatile boolean f30308o;

        /* renamed from: p */
        volatile boolean f30309p;

        /* renamed from: q */
        boolean f30310q;

        C11314a(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar, boolean z) {
            this.f30299f = uVar;
            this.f30300g = j;
            this.f30301h = timeUnit;
            this.f30302i = cVar;
            this.f30303j = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37041a() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.f30304k;
                C11490u<? super T> uVar = this.f30299f;
                int i = 1;
                while (!this.f30308o) {
                    boolean z = this.f30306m;
                    if (!z || this.f30307n == null) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (!z2 && this.f30303j) {
                                uVar.onNext(andSet);
                            }
                            uVar.onComplete();
                            this.f30302i.dispose();
                            return;
                        }
                        if (z2) {
                            if (this.f30309p) {
                                this.f30310q = false;
                                this.f30309p = false;
                            }
                        } else if (!this.f30310q || this.f30309p) {
                            uVar.onNext(atomicReference.getAndSet((Object) null));
                            this.f30309p = false;
                            this.f30310q = true;
                            this.f30302i.mo37117a(this, this.f30300g, this.f30301h);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                        uVar.onError(this.f30307n);
                        this.f30302i.dispose();
                        return;
                    }
                }
                atomicReference.lazySet((Object) null);
            }
        }

        public void dispose() {
            this.f30308o = true;
            this.f30305l.dispose();
            this.f30302i.dispose();
            if (getAndIncrement() == 0) {
                this.f30304k.lazySet((Object) null);
            }
        }

        public boolean isDisposed() {
            return this.f30308o;
        }

        public void onComplete() {
            this.f30306m = true;
            mo37041a();
        }

        public void onError(Throwable th) {
            this.f30307n = th;
            this.f30306m = true;
            mo37041a();
        }

        public void onNext(T t) {
            this.f30304k.set(t);
            mo37041a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30305l, cVar)) {
                this.f30305l = cVar;
                this.f30299f.onSubscribe(this);
            }
        }

        public void run() {
            this.f30309p = true;
            mo37041a();
        }
    }

    public C11313w3(C11482n<T> nVar, long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        super(nVar);
        this.f30295g = j;
        this.f30296h = timeUnit;
        this.f30297i = vVar;
        this.f30298j = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11314a(uVar, this.f30295g, this.f30296h, this.f30297i.mo37114a(), this.f30298j));
    }
}
