package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p401n.p403b.C12704a;
import p123rx.p401n.p405d.C12754a;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.e0 */
/* compiled from: OnSubscribeTimeoutTimedWithFallback */
public final class C12537e0<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5368e<T> f32324f;

    /* renamed from: g */
    final long f32325g;

    /* renamed from: h */
    final TimeUnit f32326h;

    /* renamed from: i */
    final C5373h f32327i;

    /* renamed from: j */
    final C5368e<? extends T> f32328j;

    /* renamed from: rx.n.a.e0$a */
    /* compiled from: OnSubscribeTimeoutTimedWithFallback */
    static final class C12538a<T> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super T> f32329f;

        /* renamed from: g */
        final C12704a f32330g;

        C12538a(C12475j<? super T> jVar, C12704a aVar) {
            this.f32329f = jVar;
            this.f32330g = aVar;
        }

        public void onCompleted() {
            this.f32329f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32329f.onError(th);
        }

        public void onNext(T t) {
            this.f32329f.onNext(t);
        }

        public void setProducer(C12473g gVar) {
            this.f32330g.mo40845a(gVar);
        }
    }

    /* renamed from: rx.n.a.e0$b */
    /* compiled from: OnSubscribeTimeoutTimedWithFallback */
    static final class C12539b<T> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super T> f32331f;

        /* renamed from: g */
        final long f32332g;

        /* renamed from: h */
        final TimeUnit f32333h;

        /* renamed from: i */
        final C5373h.C5374a f32334i;

        /* renamed from: j */
        final C5368e<? extends T> f32335j;

        /* renamed from: k */
        final C12704a f32336k = new C12704a();

        /* renamed from: l */
        final AtomicLong f32337l = new AtomicLong();

        /* renamed from: m */
        final C12754a f32338m = new C12754a();

        /* renamed from: n */
        final C12754a f32339n = new C12754a(this);

        /* renamed from: o */
        long f32340o;

        /* renamed from: rx.n.a.e0$b$a */
        /* compiled from: OnSubscribeTimeoutTimedWithFallback */
        final class C12540a implements C5377a {

            /* renamed from: f */
            final long f32341f;

            C12540a(long j) {
                this.f32341f = j;
            }

            public void call() {
                C12539b.this.mo40691a(this.f32341f);
            }
        }

        C12539b(C12475j<? super T> jVar, long j, TimeUnit timeUnit, C5373h.C5374a aVar, C5368e<? extends T> eVar) {
            this.f32331f = jVar;
            this.f32332g = j;
            this.f32333h = timeUnit;
            this.f32334i = aVar;
            this.f32335j = eVar;
            add(aVar);
            add(this.f32338m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40691a(long j) {
            if (this.f32337l.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f32335j == null) {
                    this.f32331f.onError(new TimeoutException());
                    return;
                }
                long j2 = this.f32340o;
                if (j2 != 0) {
                    this.f32336k.mo40844a(j2);
                }
                C12538a aVar = new C12538a(this.f32331f, this.f32336k);
                if (this.f32339n.mo40878a(aVar)) {
                    this.f32335j.mo18654a(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40692b(long j) {
            this.f32338m.mo40878a(this.f32334i.mo18712a(new C12540a(j), this.f32332g, this.f32333h));
        }

        public void onCompleted() {
            if (this.f32337l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32338m.unsubscribe();
                this.f32331f.onCompleted();
                this.f32334i.unsubscribe();
            }
        }

        public void onError(Throwable th) {
            if (this.f32337l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32338m.unsubscribe();
                this.f32331f.onError(th);
                this.f32334i.unsubscribe();
                return;
            }
            C12844c.m41417b(th);
        }

        public void onNext(T t) {
            long j = this.f32337l.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f32337l.compareAndSet(j, j2)) {
                    C5375k kVar = (C5375k) this.f32338m.get();
                    if (kVar != null) {
                        kVar.unsubscribe();
                    }
                    this.f32340o++;
                    this.f32331f.onNext(t);
                    mo40692b(j2);
                }
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32336k.mo40845a(gVar);
        }
    }

    public C12537e0(C5368e<T> eVar, long j, TimeUnit timeUnit, C5373h hVar, C5368e<? extends T> eVar2) {
        this.f32324f = eVar;
        this.f32325g = j;
        this.f32326h = timeUnit;
        this.f32327i = hVar;
        this.f32328j = eVar2;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12539b bVar = new C12539b(jVar, this.f32325g, this.f32326h, this.f32327i.createWorker(), this.f32328j);
        jVar.add(bVar.f32339n);
        jVar.setProducer(bVar.f32336k);
        bVar.mo40692b(0);
        this.f32324f.mo18654a(bVar);
    }
}
