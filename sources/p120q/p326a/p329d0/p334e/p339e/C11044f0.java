package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.f0 */
/* compiled from: ObservableDelay */
public final class C11044f0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29350g;

    /* renamed from: h */
    final TimeUnit f29351h;

    /* renamed from: i */
    final C11491v f29352i;

    /* renamed from: j */
    final boolean f29353j;

    /* renamed from: q.a.d0.e.e.f0$a */
    /* compiled from: ObservableDelay */
    static final class C11045a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29354f;

        /* renamed from: g */
        final long f29355g;

        /* renamed from: h */
        final TimeUnit f29356h;

        /* renamed from: i */
        final C11491v.C11494c f29357i;

        /* renamed from: j */
        final boolean f29358j;

        /* renamed from: k */
        C10842c f29359k;

        /* renamed from: q.a.d0.e.e.f0$a$a */
        /* compiled from: ObservableDelay */
        final class C11046a implements Runnable {
            C11046a() {
            }

            public void run() {
                try {
                    C11045a.this.f29354f.onComplete();
                } finally {
                    C11045a.this.f29357i.dispose();
                }
            }
        }

        /* renamed from: q.a.d0.e.e.f0$a$b */
        /* compiled from: ObservableDelay */
        final class C11047b implements Runnable {

            /* renamed from: f */
            private final Throwable f29361f;

            C11047b(Throwable th) {
                this.f29361f = th;
            }

            public void run() {
                try {
                    C11045a.this.f29354f.onError(this.f29361f);
                } finally {
                    C11045a.this.f29357i.dispose();
                }
            }
        }

        /* renamed from: q.a.d0.e.e.f0$a$c */
        /* compiled from: ObservableDelay */
        final class C11048c implements Runnable {

            /* renamed from: f */
            private final T f29363f;

            C11048c(T t) {
                this.f29363f = t;
            }

            public void run() {
                C11045a.this.f29354f.onNext(this.f29363f);
            }
        }

        C11045a(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar, boolean z) {
            this.f29354f = uVar;
            this.f29355g = j;
            this.f29356h = timeUnit;
            this.f29357i = cVar;
            this.f29358j = z;
        }

        public void dispose() {
            this.f29359k.dispose();
            this.f29357i.dispose();
        }

        public boolean isDisposed() {
            return this.f29357i.isDisposed();
        }

        public void onComplete() {
            this.f29357i.mo37117a(new C11046a(), this.f29355g, this.f29356h);
        }

        public void onError(Throwable th) {
            this.f29357i.mo37117a(new C11047b(th), this.f29358j ? this.f29355g : 0, this.f29356h);
        }

        public void onNext(T t) {
            this.f29357i.mo37117a(new C11048c(t), this.f29355g, this.f29356h);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29359k, cVar)) {
                this.f29359k = cVar;
                this.f29354f.onSubscribe(this);
            }
        }
    }

    public C11044f0(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        super(sVar);
        this.f29350g = j;
        this.f29351h = timeUnit;
        this.f29352i = vVar;
        this.f29353j = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11455e eVar;
        if (this.f29353j) {
            eVar = uVar;
        } else {
            eVar = new C11455e(uVar);
        }
        this.f29150f.subscribe(new C11045a(eVar, this.f29350g, this.f29351h, this.f29352i.mo37114a(), this.f29353j));
    }
}
