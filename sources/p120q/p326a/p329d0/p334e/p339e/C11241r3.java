package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p341f.C11385c;

/* renamed from: q.a.d0.e.e.r3 */
/* compiled from: ObservableTakeLastTimed */
public final class C11241r3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f30044g;

    /* renamed from: h */
    final long f30045h;

    /* renamed from: i */
    final TimeUnit f30046i;

    /* renamed from: j */
    final C11491v f30047j;

    /* renamed from: k */
    final int f30048k;

    /* renamed from: l */
    final boolean f30049l;

    /* renamed from: q.a.d0.e.e.r3$a */
    /* compiled from: ObservableTakeLastTimed */
    static final class C11242a<T> extends AtomicBoolean implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30050f;

        /* renamed from: g */
        final long f30051g;

        /* renamed from: h */
        final long f30052h;

        /* renamed from: i */
        final TimeUnit f30053i;

        /* renamed from: j */
        final C11491v f30054j;

        /* renamed from: k */
        final C11385c<Object> f30055k;

        /* renamed from: l */
        final boolean f30056l;

        /* renamed from: m */
        C10842c f30057m;

        /* renamed from: n */
        volatile boolean f30058n;

        /* renamed from: o */
        Throwable f30059o;

        C11242a(C11490u<? super T> uVar, long j, long j2, TimeUnit timeUnit, C11491v vVar, int i, boolean z) {
            this.f30050f = uVar;
            this.f30051g = j;
            this.f30052h = j2;
            this.f30053i = timeUnit;
            this.f30054j = vVar;
            this.f30055k = new C11385c<>(i);
            this.f30056l = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36978a() {
            Throwable th;
            if (compareAndSet(false, true)) {
                C11490u<? super T> uVar = this.f30050f;
                C11385c<Object> cVar = this.f30055k;
                boolean z = this.f30056l;
                long a = this.f30054j.mo37600a(this.f30053i) - this.f30052h;
                while (!this.f30058n) {
                    if (z || (th = this.f30059o) == null) {
                        Object poll = cVar.poll();
                        if (poll == null) {
                            Throwable th2 = this.f30059o;
                            if (th2 != null) {
                                uVar.onError(th2);
                                return;
                            } else {
                                uVar.onComplete();
                                return;
                            }
                        } else {
                            Object poll2 = cVar.poll();
                            if (((Long) poll).longValue() >= a) {
                                uVar.onNext(poll2);
                            }
                        }
                    } else {
                        cVar.clear();
                        uVar.onError(th);
                        return;
                    }
                }
                cVar.clear();
            }
        }

        public void dispose() {
            if (!this.f30058n) {
                this.f30058n = true;
                this.f30057m.dispose();
                if (compareAndSet(false, true)) {
                    this.f30055k.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f30058n;
        }

        public void onComplete() {
            mo36978a();
        }

        public void onError(Throwable th) {
            this.f30059o = th;
            mo36978a();
        }

        public void onNext(T t) {
            C11385c<Object> cVar = this.f30055k;
            long a = this.f30054j.mo37600a(this.f30053i);
            long j = this.f30052h;
            long j2 = this.f30051g;
            boolean z = j2 == Long.MAX_VALUE;
            cVar.mo37109a(Long.valueOf(a), t);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.mo37108a()).longValue() <= a - j || (!z && ((long) (cVar.mo37110b() >> 1)) > j2)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30057m, cVar)) {
                this.f30057m = cVar;
                this.f30050f.onSubscribe(this);
            }
        }
    }

    public C11241r3(C11488s<T> sVar, long j, long j2, TimeUnit timeUnit, C11491v vVar, int i, boolean z) {
        super(sVar);
        this.f30044g = j;
        this.f30045h = j2;
        this.f30046i = timeUnit;
        this.f30047j = vVar;
        this.f30048k = i;
        this.f30049l = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11242a(uVar, this.f30044g, this.f30045h, this.f30046i, this.f30047j, this.f30048k, this.f30049l));
    }
}
