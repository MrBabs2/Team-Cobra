package p120q.p326a.p329d0.p334e.p339e;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p333d.C10934p;
import p120q.p326a.p329d0.p341f.C11382a;
import p120q.p326a.p329d0.p345j.C11439m;
import p120q.p326a.p347f0.C11455e;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.j4 */
/* compiled from: ObservableWindowTimed */
public final class C11119j4<T> extends C10980a<T, C11482n<T>> {

    /* renamed from: g */
    final long f29613g;

    /* renamed from: h */
    final long f29614h;

    /* renamed from: i */
    final TimeUnit f29615i;

    /* renamed from: j */
    final C11491v f29616j;

    /* renamed from: k */
    final long f29617k;

    /* renamed from: l */
    final int f29618l;

    /* renamed from: m */
    final boolean f29619m;

    /* renamed from: q.a.d0.e.e.j4$a */
    /* compiled from: ObservableWindowTimed */
    static final class C11120a<T> extends C10934p<T, Object, C11482n<T>> implements C10842c {

        /* renamed from: l */
        final long f29620l;

        /* renamed from: m */
        final TimeUnit f29621m;

        /* renamed from: n */
        final C11491v f29622n;

        /* renamed from: o */
        final int f29623o;

        /* renamed from: p */
        final boolean f29624p;

        /* renamed from: q */
        final long f29625q;

        /* renamed from: r */
        final C11491v.C11494c f29626r;

        /* renamed from: s */
        long f29627s;

        /* renamed from: t */
        long f29628t;

        /* renamed from: u */
        C10842c f29629u;

        /* renamed from: v */
        C11476d<T> f29630v;

        /* renamed from: w */
        volatile boolean f29631w;

        /* renamed from: x */
        final C10871h f29632x = new C10871h();

        /* renamed from: q.a.d0.e.e.j4$a$a */
        /* compiled from: ObservableWindowTimed */
        static final class C11121a implements Runnable {

            /* renamed from: f */
            final long f29633f;

            /* renamed from: g */
            final C11120a<?> f29634g;

            C11121a(long j, C11120a<?> aVar) {
                this.f29633f = j;
                this.f29634g = aVar;
            }

            public void run() {
                C11120a<?> aVar = this.f29634g;
                if (!aVar.f29011i) {
                    aVar.f29010h.offer(this);
                } else {
                    aVar.f29631w = true;
                }
                if (aVar.mo36736d()) {
                    aVar.mo36891g();
                }
            }
        }

        C11120a(C11490u<? super C11482n<T>> uVar, long j, TimeUnit timeUnit, C11491v vVar, int i, long j2, boolean z) {
            super(uVar, new C11382a());
            this.f29620l = j;
            this.f29621m = timeUnit;
            this.f29622n = vVar;
            this.f29623o = i;
            this.f29625q = j2;
            this.f29624p = z;
            if (z) {
                this.f29626r = vVar.mo37114a();
            } else {
                this.f29626r = null;
            }
        }

        public void dispose() {
            this.f29011i = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36890f() {
            C10867d.m36773a((AtomicReference<C10842c>) this.f29632x);
            C11491v.C11494c cVar = this.f29626r;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36891g() {
            C11382a aVar = (C11382a) this.f29010h;
            C11490u<? super V> uVar = this.f29009g;
            C11476d<T> dVar = this.f29630v;
            int i = 1;
            while (!this.f29631w) {
                boolean z = this.f29012j;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C11121a;
                if (z && (z2 || z3)) {
                    this.f29630v = null;
                    aVar.clear();
                    Throwable th = this.f29013k;
                    if (th != null) {
                        dVar.onError(th);
                    } else {
                        dVar.onComplete();
                    }
                    mo36890f();
                    return;
                } else if (z2) {
                    i = mo36729a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C11121a aVar2 = (C11121a) poll;
                    if (!this.f29624p || this.f29628t == aVar2.f29633f) {
                        dVar.onComplete();
                        this.f29627s = 0;
                        dVar = C11476d.m37562a(this.f29623o);
                        this.f29630v = dVar;
                        uVar.onNext(dVar);
                    }
                } else {
                    C11439m.m37479b(poll);
                    dVar.onNext(poll);
                    long j = this.f29627s + 1;
                    if (j >= this.f29625q) {
                        this.f29628t++;
                        this.f29627s = 0;
                        dVar.onComplete();
                        dVar = C11476d.m37562a(this.f29623o);
                        this.f29630v = dVar;
                        this.f29009g.onNext(dVar);
                        if (this.f29624p) {
                            C10842c cVar = (C10842c) this.f29632x.get();
                            cVar.dispose();
                            C11491v.C11494c cVar2 = this.f29626r;
                            C11121a aVar3 = new C11121a(this.f29628t, this);
                            long j2 = this.f29620l;
                            C10842c a = cVar2.mo37604a(aVar3, j2, j2, this.f29621m);
                            if (!this.f29632x.compareAndSet(cVar, a)) {
                                a.dispose();
                            }
                        }
                    } else {
                        this.f29627s = j;
                    }
                }
            }
            this.f29629u.dispose();
            aVar.clear();
            mo36890f();
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        public void onComplete() {
            this.f29012j = true;
            if (mo36736d()) {
                mo36891g();
            }
            this.f29009g.onComplete();
        }

        public void onError(Throwable th) {
            this.f29013k = th;
            this.f29012j = true;
            if (mo36736d()) {
                mo36891g();
            }
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29631w) {
                if (mo36737e()) {
                    C11476d<T> dVar = this.f29630v;
                    dVar.onNext(t);
                    long j = this.f29627s + 1;
                    if (j >= this.f29625q) {
                        this.f29628t++;
                        this.f29627s = 0;
                        dVar.onComplete();
                        C11476d<T> a = C11476d.m37562a(this.f29623o);
                        this.f29630v = a;
                        this.f29009g.onNext(a);
                        if (this.f29624p) {
                            ((C10842c) this.f29632x.get()).dispose();
                            C11491v.C11494c cVar = this.f29626r;
                            C11121a aVar = new C11121a(this.f29628t, this);
                            long j2 = this.f29620l;
                            C10867d.m36774a((AtomicReference<C10842c>) this.f29632x, cVar.mo37604a(aVar, j2, j2, this.f29621m));
                        }
                    } else {
                        this.f29627s = j;
                    }
                    if (mo36729a(-1) == 0) {
                        return;
                    }
                } else {
                    C10917f<U> fVar = this.f29010h;
                    C11439m.m37483e(t);
                    fVar.offer(t);
                    if (!mo36736d()) {
                        return;
                    }
                }
                mo36891g();
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10842c cVar2;
            if (C10867d.m36776a(this.f29629u, cVar)) {
                this.f29629u = cVar;
                C11490u<? super V> uVar = this.f29009g;
                uVar.onSubscribe(this);
                if (!this.f29011i) {
                    C11476d<T> a = C11476d.m37562a(this.f29623o);
                    this.f29630v = a;
                    uVar.onNext(a);
                    C11121a aVar = new C11121a(this.f29628t, this);
                    if (this.f29624p) {
                        C11491v.C11494c cVar3 = this.f29626r;
                        long j = this.f29620l;
                        cVar2 = cVar3.mo37604a(aVar, j, j, this.f29621m);
                    } else {
                        C11491v vVar = this.f29622n;
                        long j2 = this.f29620l;
                        cVar2 = vVar.mo37112a(aVar, j2, j2, this.f29621m);
                    }
                    this.f29632x.mo36672a(cVar2);
                }
            }
        }
    }

    /* renamed from: q.a.d0.e.e.j4$b */
    /* compiled from: ObservableWindowTimed */
    static final class C11122b<T> extends C10934p<T, Object, C11482n<T>> implements C11490u<T>, C10842c, Runnable {

        /* renamed from: t */
        static final Object f29635t = new Object();

        /* renamed from: l */
        final long f29636l;

        /* renamed from: m */
        final TimeUnit f29637m;

        /* renamed from: n */
        final C11491v f29638n;

        /* renamed from: o */
        final int f29639o;

        /* renamed from: p */
        C10842c f29640p;

        /* renamed from: q */
        C11476d<T> f29641q;

        /* renamed from: r */
        final C10871h f29642r = new C10871h();

        /* renamed from: s */
        volatile boolean f29643s;

        C11122b(C11490u<? super C11482n<T>> uVar, long j, TimeUnit timeUnit, C11491v vVar, int i) {
            super(uVar, new C11382a());
            this.f29636l = j;
            this.f29637m = timeUnit;
            this.f29638n = vVar;
            this.f29639o = i;
        }

        public void dispose() {
            this.f29011i = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36893f() {
            C11382a aVar = (C11382a) this.f29010h;
            C11490u<? super V> uVar = this.f29009g;
            C11476d<T> dVar = this.f29641q;
            int i = 1;
            while (true) {
                boolean z = this.f29643s;
                boolean z2 = this.f29012j;
                Object poll = aVar.poll();
                if (!z2 || !(poll == null || poll == f29635t)) {
                    if (poll == null) {
                        i = mo36729a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f29635t) {
                        dVar.onComplete();
                        if (!z) {
                            dVar = C11476d.m37562a(this.f29639o);
                            this.f29641q = dVar;
                            uVar.onNext(dVar);
                        } else {
                            this.f29640p.dispose();
                        }
                    } else {
                        C11439m.m37479b(poll);
                        dVar.onNext(poll);
                    }
                }
            }
            this.f29641q = null;
            aVar.clear();
            Throwable th = this.f29013k;
            if (th != null) {
                dVar.onError(th);
            } else {
                dVar.onComplete();
            }
            this.f29642r.dispose();
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        public void onComplete() {
            this.f29012j = true;
            if (mo36736d()) {
                mo36893f();
            }
            this.f29009g.onComplete();
        }

        public void onError(Throwable th) {
            this.f29013k = th;
            this.f29012j = true;
            if (mo36736d()) {
                mo36893f();
            }
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29643s) {
                if (mo36737e()) {
                    this.f29641q.onNext(t);
                    if (mo36729a(-1) == 0) {
                        return;
                    }
                } else {
                    C10917f<U> fVar = this.f29010h;
                    C11439m.m37483e(t);
                    fVar.offer(t);
                    if (!mo36736d()) {
                        return;
                    }
                }
                mo36893f();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29640p, cVar)) {
                this.f29640p = cVar;
                this.f29641q = C11476d.m37562a(this.f29639o);
                C11490u<? super V> uVar = this.f29009g;
                uVar.onSubscribe(this);
                uVar.onNext(this.f29641q);
                if (!this.f29011i) {
                    C11491v vVar = this.f29638n;
                    long j = this.f29636l;
                    this.f29642r.mo36672a(vVar.mo37112a(this, j, j, this.f29637m));
                }
            }
        }

        public void run() {
            if (this.f29011i) {
                this.f29643s = true;
            }
            this.f29010h.offer(f29635t);
            if (mo36736d()) {
                mo36893f();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.j4$c */
    /* compiled from: ObservableWindowTimed */
    static final class C11123c<T> extends C10934p<T, Object, C11482n<T>> implements C10842c, Runnable {

        /* renamed from: l */
        final long f29644l;

        /* renamed from: m */
        final long f29645m;

        /* renamed from: n */
        final TimeUnit f29646n;

        /* renamed from: o */
        final C11491v.C11494c f29647o;

        /* renamed from: p */
        final int f29648p;

        /* renamed from: q */
        final List<C11476d<T>> f29649q = new LinkedList();

        /* renamed from: r */
        C10842c f29650r;

        /* renamed from: s */
        volatile boolean f29651s;

        /* renamed from: q.a.d0.e.e.j4$c$a */
        /* compiled from: ObservableWindowTimed */
        final class C11124a implements Runnable {

            /* renamed from: f */
            private final C11476d<T> f29652f;

            C11124a(C11476d<T> dVar) {
                this.f29652f = dVar;
            }

            public void run() {
                C11123c.this.mo36895a(this.f29652f);
            }
        }

        /* renamed from: q.a.d0.e.e.j4$c$b */
        /* compiled from: ObservableWindowTimed */
        static final class C11125b<T> {

            /* renamed from: a */
            final C11476d<T> f29654a;

            /* renamed from: b */
            final boolean f29655b;

            C11125b(C11476d<T> dVar, boolean z) {
                this.f29654a = dVar;
                this.f29655b = z;
            }
        }

        C11123c(C11490u<? super C11482n<T>> uVar, long j, long j2, TimeUnit timeUnit, C11491v.C11494c cVar, int i) {
            super(uVar, new C11382a());
            this.f29644l = j;
            this.f29645m = j2;
            this.f29646n = timeUnit;
            this.f29647o = cVar;
            this.f29648p = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36895a(C11476d<T> dVar) {
            this.f29010h.offer(new C11125b(dVar, false));
            if (mo36736d()) {
                mo36896f();
            }
        }

        public void dispose() {
            this.f29011i = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36896f() {
            C11382a aVar = (C11382a) this.f29010h;
            C11490u<? super V> uVar = this.f29009g;
            List<C11476d<T>> list = this.f29649q;
            int i = 1;
            while (!this.f29651s) {
                boolean z = this.f29012j;
                Object poll = aVar.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof C11125b;
                if (z && (z2 || z3)) {
                    aVar.clear();
                    Throwable th = this.f29013k;
                    if (th != null) {
                        for (C11476d<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (C11476d<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    this.f29647o.dispose();
                    return;
                } else if (z2) {
                    i = mo36729a(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C11125b bVar = (C11125b) poll;
                    if (!bVar.f29655b) {
                        list.remove(bVar.f29654a);
                        bVar.f29654a.onComplete();
                        if (list.isEmpty() && this.f29011i) {
                            this.f29651s = true;
                        }
                    } else if (!this.f29011i) {
                        C11476d a = C11476d.m37562a(this.f29648p);
                        list.add(a);
                        uVar.onNext(a);
                        this.f29647o.mo37117a(new C11124a(a), this.f29644l, this.f29646n);
                    }
                } else {
                    for (C11476d<T> onNext : list) {
                        onNext.onNext(poll);
                    }
                }
            }
            this.f29650r.dispose();
            aVar.clear();
            list.clear();
            this.f29647o.dispose();
        }

        public boolean isDisposed() {
            return this.f29011i;
        }

        public void onComplete() {
            this.f29012j = true;
            if (mo36736d()) {
                mo36896f();
            }
            this.f29009g.onComplete();
        }

        public void onError(Throwable th) {
            this.f29013k = th;
            this.f29012j = true;
            if (mo36736d()) {
                mo36896f();
            }
            this.f29009g.onError(th);
        }

        public void onNext(T t) {
            if (mo36737e()) {
                for (C11476d<T> onNext : this.f29649q) {
                    onNext.onNext(t);
                }
                if (mo36729a(-1) == 0) {
                    return;
                }
            } else {
                this.f29010h.offer(t);
                if (!mo36736d()) {
                    return;
                }
            }
            mo36896f();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29650r, cVar)) {
                this.f29650r = cVar;
                this.f29009g.onSubscribe(this);
                if (!this.f29011i) {
                    C11476d a = C11476d.m37562a(this.f29648p);
                    this.f29649q.add(a);
                    this.f29009g.onNext(a);
                    this.f29647o.mo37117a(new C11124a(a), this.f29644l, this.f29646n);
                    C11491v.C11494c cVar2 = this.f29647o;
                    long j = this.f29645m;
                    cVar2.mo37604a(this, j, j, this.f29646n);
                }
            }
        }

        public void run() {
            C11125b bVar = new C11125b(C11476d.m37562a(this.f29648p), true);
            if (!this.f29011i) {
                this.f29010h.offer(bVar);
            }
            if (mo36736d()) {
                mo36896f();
            }
        }
    }

    public C11119j4(C11488s<T> sVar, long j, long j2, TimeUnit timeUnit, C11491v vVar, long j3, int i, boolean z) {
        super(sVar);
        this.f29613g = j;
        this.f29614h = j2;
        this.f29615i = timeUnit;
        this.f29616j = vVar;
        this.f29617k = j3;
        this.f29618l = i;
        this.f29619m = z;
    }

    public void subscribeActual(C11490u<? super C11482n<T>> uVar) {
        C11455e eVar = new C11455e(uVar);
        long j = this.f29613g;
        long j2 = this.f29614h;
        if (j == j2) {
            long j3 = this.f29617k;
            if (j3 == Long.MAX_VALUE) {
                this.f29150f.subscribe(new C11122b(eVar, this.f29613g, this.f29615i, this.f29616j, this.f29618l));
            } else {
                this.f29150f.subscribe(new C11120a(eVar, j, this.f29615i, this.f29616j, this.f29618l, j3, this.f29619m));
            }
        } else {
            this.f29150f.subscribe(new C11123c(eVar, j, j2, this.f29615i, this.f29616j.mo37114a(), this.f29618l));
        }
    }
}
