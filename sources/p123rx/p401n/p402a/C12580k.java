package p123rx.p401n.p402a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p126m.C5379n;
import p123rx.p128t.C12888d;
import p123rx.p401n.p403b.C12704a;
import p123rx.p401n.p406e.C12761e;
import p123rx.p401n.p406e.C12775j;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;
import p123rx.p410p.C12838e;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.k */
/* compiled from: OnSubscribeConcatMap */
public final class C12580k<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e<? extends T> f32444f;

    /* renamed from: g */
    final C5379n<? super T, ? extends C5368e<? extends R>> f32445g;

    /* renamed from: h */
    final int f32446h;

    /* renamed from: i */
    final int f32447i;

    /* renamed from: rx.n.a.k$a */
    /* compiled from: OnSubscribeConcatMap */
    class C12581a implements C12473g {

        /* renamed from: f */
        final /* synthetic */ C12584d f32448f;

        C12581a(C12580k kVar, C12584d dVar) {
            this.f32448f = dVar;
        }

        public void request(long j) {
            this.f32448f.mo40730b(j);
        }
    }

    /* renamed from: rx.n.a.k$b */
    /* compiled from: OnSubscribeConcatMap */
    static final class C12582b<T, R> implements C12473g {

        /* renamed from: f */
        final R f32449f;

        /* renamed from: g */
        final C12584d<T, R> f32450g;

        /* renamed from: h */
        boolean f32451h;

        public C12582b(R r, C12584d<T, R> dVar) {
            this.f32449f = r;
            this.f32450g = dVar;
        }

        public void request(long j) {
            if (!this.f32451h && j > 0) {
                this.f32451h = true;
                C12584d<T, R> dVar = this.f32450g;
                dVar.mo40731b(this.f32449f);
                dVar.mo40728a(1);
            }
        }
    }

    /* renamed from: rx.n.a.k$c */
    /* compiled from: OnSubscribeConcatMap */
    static final class C12583c<T, R> extends C12475j<R> {

        /* renamed from: f */
        final C12584d<T, R> f32452f;

        /* renamed from: g */
        long f32453g;

        public C12583c(C12584d<T, R> dVar) {
            this.f32452f = dVar;
        }

        public void onCompleted() {
            this.f32452f.mo40728a(this.f32453g);
        }

        public void onError(Throwable th) {
            this.f32452f.mo40729a(th, this.f32453g);
        }

        public void onNext(R r) {
            this.f32453g++;
            this.f32452f.mo40731b(r);
        }

        public void setProducer(C12473g gVar) {
            this.f32452f.f32457i.mo40845a(gVar);
        }
    }

    public C12580k(C5368e<? extends T> eVar, C5379n<? super T, ? extends C5368e<? extends R>> nVar, int i, int i2) {
        this.f32444f = eVar;
        this.f32445g = nVar;
        this.f32446h = i;
        this.f32447i = i2;
    }

    /* renamed from: a */
    public void call(C12475j<? super R> jVar) {
        C12584d dVar = new C12584d(this.f32447i == 0 ? new C12838e<>(jVar) : jVar, this.f32445g, this.f32446h, this.f32447i);
        jVar.add(dVar);
        jVar.add(dVar.f32461m);
        jVar.setProducer(new C12581a(this, dVar));
        if (!jVar.isUnsubscribed()) {
            this.f32444f.mo18668b(dVar);
        }
    }

    /* renamed from: rx.n.a.k$d */
    /* compiled from: OnSubscribeConcatMap */
    static final class C12584d<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super R> f32454f;

        /* renamed from: g */
        final C5379n<? super T, ? extends C5368e<? extends R>> f32455g;

        /* renamed from: h */
        final int f32456h;

        /* renamed from: i */
        final C12704a f32457i = new C12704a();

        /* renamed from: j */
        final Queue<Object> f32458j;

        /* renamed from: k */
        final AtomicInteger f32459k = new AtomicInteger();

        /* renamed from: l */
        final AtomicReference<Throwable> f32460l = new AtomicReference<>();

        /* renamed from: m */
        final C12888d f32461m;

        /* renamed from: n */
        volatile boolean f32462n;

        /* renamed from: o */
        volatile boolean f32463o;

        public C12584d(C12475j<? super R> jVar, C5379n<? super T, ? extends C5368e<? extends R>> nVar, int i, int i2) {
            Queue<Object> queue;
            this.f32454f = jVar;
            this.f32455g = nVar;
            this.f32456h = i2;
            if (C12828z.m41379a()) {
                queue = new C12821s<>(i);
            } else {
                queue = new C12799e<>(i);
            }
            this.f32458j = queue;
            this.f32461m = new C12888d();
            request((long) i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40729a(Throwable th, long j) {
            if (!C12761e.m41256a(this.f32460l, th)) {
                mo40733c(th);
            } else if (this.f32456h == 0) {
                Throwable a = C12761e.m41254a(this.f32460l);
                if (!C12761e.m41255a(a)) {
                    this.f32454f.onError(a);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f32457i.mo40844a(j);
                }
                this.f32463o = false;
                mo40727a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40730b(long j) {
            if (j > 0) {
                this.f32457i.request(j);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40733c(Throwable th) {
            C12844c.m41417b(th);
        }

        public void onCompleted() {
            this.f32462n = true;
            mo40727a();
        }

        public void onError(Throwable th) {
            if (C12761e.m41256a(this.f32460l, th)) {
                this.f32462n = true;
                if (this.f32456h == 0) {
                    Throwable a = C12761e.m41254a(this.f32460l);
                    if (!C12761e.m41255a(a)) {
                        this.f32454f.onError(a);
                    }
                    this.f32461m.unsubscribe();
                    return;
                }
                mo40727a();
                return;
            }
            mo40733c(th);
        }

        public void onNext(T t) {
            if (!this.f32458j.offer(C12558h.m41020d(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            mo40727a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40731b(R r) {
            this.f32454f.onNext(r);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40732b(Throwable th) {
            unsubscribe();
            if (C12761e.m41256a(this.f32460l, th)) {
                Throwable a = C12761e.m41254a(this.f32460l);
                if (!C12761e.m41255a(a)) {
                    this.f32454f.onError(a);
                    return;
                }
                return;
            }
            mo40733c(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40728a(long j) {
            if (j != 0) {
                this.f32457i.mo40844a(j);
            }
            this.f32463o = false;
            mo40727a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40727a() {
            if (this.f32459k.getAndIncrement() == 0) {
                int i = this.f32456h;
                while (!this.f32454f.isUnsubscribed()) {
                    if (!this.f32463o) {
                        if (i != 1 || this.f32460l.get() == null) {
                            boolean z = this.f32462n;
                            Object poll = this.f32458j.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable a = C12761e.m41254a(this.f32460l);
                                if (a == null) {
                                    this.f32454f.onCompleted();
                                    return;
                                } else if (!C12761e.m41255a(a)) {
                                    this.f32454f.onError(a);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    C5368e eVar = (C5368e) this.f32455g.call(C12558h.m41018b(poll));
                                    if (eVar == null) {
                                        mo40732b((Throwable) new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (eVar != C5368e.m10265n()) {
                                        if (eVar instanceof C12775j) {
                                            this.f32463o = true;
                                            this.f32457i.mo40845a((C12473g) new C12582b(((C12775j) eVar).mo40900o(), this));
                                        } else {
                                            C12583c cVar = new C12583c(this);
                                            this.f32461m.mo41109a(cVar);
                                            if (!cVar.isUnsubscribed()) {
                                                this.f32463o = true;
                                                eVar.mo18668b(cVar);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable th) {
                                    C12472a.m40945c(th);
                                    mo40732b(th);
                                    return;
                                }
                            }
                        } else {
                            Throwable a2 = C12761e.m41254a(this.f32460l);
                            if (!C12761e.m41255a(a2)) {
                                this.f32454f.onError(a2);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f32459k.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
