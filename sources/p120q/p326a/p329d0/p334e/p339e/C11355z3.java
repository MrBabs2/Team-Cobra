package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.z3 */
/* compiled from: ObservableTimeoutTimed */
public final class C11355z3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f30419g;

    /* renamed from: h */
    final TimeUnit f30420h;

    /* renamed from: i */
    final C11491v f30421i;

    /* renamed from: j */
    final C11488s<? extends T> f30422j;

    /* renamed from: q.a.d0.e.e.z3$a */
    /* compiled from: ObservableTimeoutTimed */
    static final class C11356a<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f30423f;

        /* renamed from: g */
        final AtomicReference<C10842c> f30424g;

        C11356a(C11490u<? super T> uVar, AtomicReference<C10842c> atomicReference) {
            this.f30423f = uVar;
            this.f30424g = atomicReference;
        }

        public void onComplete() {
            this.f30423f.onComplete();
        }

        public void onError(Throwable th) {
            this.f30423f.onError(th);
        }

        public void onNext(T t) {
            this.f30423f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36774a(this.f30424g, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.z3$b */
    /* compiled from: ObservableTimeoutTimed */
    static final class C11357b<T> extends AtomicReference<C10842c> implements C11490u<T>, C10842c, C11359d {

        /* renamed from: f */
        final C11490u<? super T> f30425f;

        /* renamed from: g */
        final long f30426g;

        /* renamed from: h */
        final TimeUnit f30427h;

        /* renamed from: i */
        final C11491v.C11494c f30428i;

        /* renamed from: j */
        final C10871h f30429j = new C10871h();

        /* renamed from: k */
        final AtomicLong f30430k = new AtomicLong();

        /* renamed from: l */
        final AtomicReference<C10842c> f30431l = new AtomicReference<>();

        /* renamed from: m */
        C11488s<? extends T> f30432m;

        C11357b(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar, C11488s<? extends T> sVar) {
            this.f30425f = uVar;
            this.f30426g = j;
            this.f30427h = timeUnit;
            this.f30428i = cVar;
            this.f30432m = sVar;
        }

        /* renamed from: a */
        public void mo37061a(long j) {
            if (this.f30430k.compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a(this.f30431l);
                C11488s<? extends T> sVar = this.f30432m;
                this.f30432m = null;
                sVar.subscribe(new C11356a(this.f30425f, this));
                this.f30428i.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37077b(long j) {
            this.f30429j.mo36672a(this.f30428i.mo37117a(new C11360e(j, this), this.f30426g, this.f30427h));
        }

        public void dispose() {
            C10867d.m36773a(this.f30431l);
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f30428i.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            if (this.f30430k.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30429j.dispose();
                this.f30425f.onComplete();
                this.f30428i.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f30430k.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30429j.dispose();
                this.f30425f.onError(th);
                this.f30428i.dispose();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            long j = this.f30430k.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f30430k.compareAndSet(j, j2)) {
                    ((C10842c) this.f30429j.get()).dispose();
                    this.f30425f.onNext(t);
                    mo37077b(j2);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30431l, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.z3$c */
    /* compiled from: ObservableTimeoutTimed */
    static final class C11358c<T> extends AtomicLong implements C11490u<T>, C10842c, C11359d {

        /* renamed from: f */
        final C11490u<? super T> f30433f;

        /* renamed from: g */
        final long f30434g;

        /* renamed from: h */
        final TimeUnit f30435h;

        /* renamed from: i */
        final C11491v.C11494c f30436i;

        /* renamed from: j */
        final C10871h f30437j = new C10871h();

        /* renamed from: k */
        final AtomicReference<C10842c> f30438k = new AtomicReference<>();

        C11358c(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v.C11494c cVar) {
            this.f30433f = uVar;
            this.f30434g = j;
            this.f30435h = timeUnit;
            this.f30436i = cVar;
        }

        /* renamed from: a */
        public void mo37061a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C10867d.m36773a(this.f30438k);
                this.f30433f.onError(new TimeoutException(C11435j.m37464a(this.f30434g, this.f30435h)));
                this.f30436i.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37078b(long j) {
            this.f30437j.mo36672a(this.f30436i.mo37117a(new C11360e(j, this), this.f30434g, this.f30435h));
        }

        public void dispose() {
            C10867d.m36773a(this.f30438k);
            this.f30436i.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30438k.get());
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30437j.dispose();
                this.f30433f.onComplete();
                this.f30436i.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f30437j.dispose();
                this.f30433f.onError(th);
                this.f30436i.dispose();
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((C10842c) this.f30437j.get()).dispose();
                    this.f30433f.onNext(t);
                    mo37078b(j2);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30438k, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.z3$d */
    /* compiled from: ObservableTimeoutTimed */
    interface C11359d {
        /* renamed from: a */
        void mo37061a(long j);
    }

    /* renamed from: q.a.d0.e.e.z3$e */
    /* compiled from: ObservableTimeoutTimed */
    static final class C11360e implements Runnable {

        /* renamed from: f */
        final C11359d f30439f;

        /* renamed from: g */
        final long f30440g;

        C11360e(long j, C11359d dVar) {
            this.f30440g = j;
            this.f30439f = dVar;
        }

        public void run() {
            this.f30439f.mo37061a(this.f30440g);
        }
    }

    public C11355z3(C11482n<T> nVar, long j, TimeUnit timeUnit, C11491v vVar, C11488s<? extends T> sVar) {
        super(nVar);
        this.f30419g = j;
        this.f30420h = timeUnit;
        this.f30421i = vVar;
        this.f30422j = sVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        if (this.f30422j == null) {
            C11358c cVar = new C11358c(uVar, this.f30419g, this.f30420h, this.f30421i.mo37114a());
            uVar.onSubscribe(cVar);
            cVar.mo37078b(0);
            this.f29150f.subscribe(cVar);
            return;
        }
        C11357b bVar = new C11357b(uVar, this.f30419g, this.f30420h, this.f30421i.mo37114a(), this.f30422j);
        uVar.onSubscribe(bVar);
        bVar.mo37077b(0);
        this.f29150f.subscribe(bVar);
    }
}
