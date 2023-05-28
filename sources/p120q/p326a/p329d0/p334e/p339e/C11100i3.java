package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p341f.C11385c;

/* renamed from: q.a.d0.e.e.i3 */
/* compiled from: ObservableSkipLastTimed */
public final class C11100i3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29529g;

    /* renamed from: h */
    final TimeUnit f29530h;

    /* renamed from: i */
    final C11491v f29531i;

    /* renamed from: j */
    final int f29532j;

    /* renamed from: k */
    final boolean f29533k;

    /* renamed from: q.a.d0.e.e.i3$a */
    /* compiled from: ObservableSkipLastTimed */
    static final class C11101a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29534f;

        /* renamed from: g */
        final long f29535g;

        /* renamed from: h */
        final TimeUnit f29536h;

        /* renamed from: i */
        final C11491v f29537i;

        /* renamed from: j */
        final C11385c<Object> f29538j;

        /* renamed from: k */
        final boolean f29539k;

        /* renamed from: l */
        C10842c f29540l;

        /* renamed from: m */
        volatile boolean f29541m;

        /* renamed from: n */
        volatile boolean f29542n;

        /* renamed from: o */
        Throwable f29543o;

        C11101a(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v vVar, int i, boolean z) {
            this.f29534f = uVar;
            this.f29535g = j;
            this.f29536h = timeUnit;
            this.f29537i = vVar;
            this.f29538j = new C11385c<>(i);
            this.f29539k = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36873a() {
            if (getAndIncrement() == 0) {
                C11490u<? super T> uVar = this.f29534f;
                C11385c<Object> cVar = this.f29538j;
                boolean z = this.f29539k;
                TimeUnit timeUnit = this.f29536h;
                C11491v vVar = this.f29537i;
                long j = this.f29535g;
                int i = 1;
                while (!this.f29541m) {
                    boolean z2 = this.f29542n;
                    Long l = (Long) cVar.mo37108a();
                    boolean z3 = l == null;
                    long a = vVar.mo37600a(timeUnit);
                    if (!z3 && l.longValue() > a - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.f29543o;
                            if (th != null) {
                                this.f29538j.clear();
                                uVar.onError(th);
                                return;
                            } else if (z3) {
                                uVar.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.f29543o;
                            if (th2 != null) {
                                uVar.onError(th2);
                                return;
                            } else {
                                uVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z3) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        cVar.poll();
                        uVar.onNext(cVar.poll());
                    }
                }
                this.f29538j.clear();
            }
        }

        public void dispose() {
            if (!this.f29541m) {
                this.f29541m = true;
                this.f29540l.dispose();
                if (getAndIncrement() == 0) {
                    this.f29538j.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29541m;
        }

        public void onComplete() {
            this.f29542n = true;
            mo36873a();
        }

        public void onError(Throwable th) {
            this.f29543o = th;
            this.f29542n = true;
            mo36873a();
        }

        public void onNext(T t) {
            this.f29538j.mo37109a(Long.valueOf(this.f29537i.mo37600a(this.f29536h)), t);
            mo36873a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29540l, cVar)) {
                this.f29540l = cVar;
                this.f29534f.onSubscribe(this);
            }
        }
    }

    public C11100i3(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar, int i, boolean z) {
        super(sVar);
        this.f29529g = j;
        this.f29530h = timeUnit;
        this.f29531i = vVar;
        this.f29532j = i;
        this.f29533k = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11101a(uVar, this.f29529g, this.f29530h, this.f29531i, this.f29532j, this.f29533k));
    }
}
