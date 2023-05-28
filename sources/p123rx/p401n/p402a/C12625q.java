package p123rx.p401n.p402a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12474i;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12761e;
import p123rx.p401n.p406e.p407n.C12798d;
import p123rx.p401n.p406e.p408o.C12811i;
import p123rx.p401n.p406e.p408o.C12828z;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.q */
/* compiled from: OnSubscribeFlatMapSingle */
public final class C12625q<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e<T> f32571f;

    /* renamed from: g */
    final C5379n<? super T, ? extends Single<? extends R>> f32572g;

    /* renamed from: h */
    final boolean f32573h;

    /* renamed from: i */
    final int f32574i;

    public C12625q(C5368e<T> eVar, C5379n<? super T, ? extends Single<? extends R>> nVar, boolean z, int i) {
        if (nVar == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.f32571f = eVar;
            this.f32572g = nVar;
            this.f32573h = z;
            this.f32574i = i;
        } else {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
    }

    /* renamed from: a */
    public void call(C12475j<? super R> jVar) {
        C12626a aVar = new C12626a(jVar, this.f32572g, this.f32573h, this.f32574i);
        jVar.add(aVar.f32581l);
        jVar.add(aVar.f32584o);
        jVar.setProducer(aVar.f32584o);
        this.f32571f.mo18668b(aVar);
    }

    /* renamed from: rx.n.a.q$a */
    /* compiled from: OnSubscribeFlatMapSingle */
    static final class C12626a<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super R> f32575f;

        /* renamed from: g */
        final C5379n<? super T, ? extends Single<? extends R>> f32576g;

        /* renamed from: h */
        final boolean f32577h;

        /* renamed from: i */
        final int f32578i;

        /* renamed from: j */
        final AtomicInteger f32579j = new AtomicInteger();

        /* renamed from: k */
        final AtomicInteger f32580k = new AtomicInteger();

        /* renamed from: l */
        final C5383b f32581l = new C5383b();

        /* renamed from: m */
        final AtomicReference<Throwable> f32582m = new AtomicReference<>();

        /* renamed from: n */
        final Queue<Object> f32583n;

        /* renamed from: o */
        final C12626a<T, R>.C0980b f32584o = new C12628b();

        /* renamed from: p */
        volatile boolean f32585p;

        /* renamed from: q */
        volatile boolean f32586q;

        /* renamed from: rx.n.a.q$a$a */
        /* compiled from: OnSubscribeFlatMapSingle */
        final class C12627a extends C12474i<R> {
            C12627a() {
            }

            /* renamed from: a */
            public void mo18573a(R r) {
                C12626a.this.mo40763a((C12626a<T, R>.C0000a) this, r);
            }

            public void onError(Throwable th) {
                C12626a.this.mo40764a((C12626a<T, R>.C0000a) this, th);
            }
        }

        /* renamed from: rx.n.a.q$a$b */
        /* compiled from: OnSubscribeFlatMapSingle */
        final class C12628b extends AtomicLong implements C12473g, C5375k {
            C12628b() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo40765a(long j) {
                C12502a.m40962b(this, j);
            }

            public boolean isUnsubscribed() {
                return C12626a.this.f32586q;
            }

            public void request(long j) {
                if (j > 0) {
                    C12502a.m40960a((AtomicLong) this, j);
                    C12626a.this.mo40762a();
                }
            }

            public void unsubscribe() {
                C12626a.this.f32586q = true;
                C12626a.this.unsubscribe();
                if (C12626a.this.f32579j.getAndIncrement() == 0) {
                    C12626a.this.f32583n.clear();
                }
            }
        }

        C12626a(C12475j<? super R> jVar, C5379n<? super T, ? extends Single<? extends R>> nVar, boolean z, int i) {
            this.f32575f = jVar;
            this.f32576g = nVar;
            this.f32577h = z;
            this.f32578i = i;
            if (C12828z.m41379a()) {
                this.f32583n = new C12811i();
            } else {
                this.f32583n = new C12798d();
            }
            request(i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40763a(C12626a<T, R>.C0000a aVar, R r) {
            this.f32583n.offer(C12558h.m41020d(r));
            this.f32581l.mo18722b(aVar);
            this.f32580k.decrementAndGet();
            mo40762a();
        }

        public void onCompleted() {
            this.f32585p = true;
            mo40762a();
        }

        public void onError(Throwable th) {
            if (this.f32577h) {
                C12761e.m41256a(this.f32582m, th);
            } else {
                this.f32581l.unsubscribe();
                if (!this.f32582m.compareAndSet((Object) null, th)) {
                    C12844c.m41417b(th);
                    return;
                }
            }
            this.f32585p = true;
            mo40762a();
        }

        public void onNext(T t) {
            try {
                Single single = (Single) this.f32576g.call(t);
                if (single != null) {
                    C12627a aVar = new C12627a();
                    this.f32581l.mo18721a((C5375k) aVar);
                    this.f32580k.incrementAndGet();
                    single.mo18560a(aVar);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40764a(C12626a<T, R>.C0000a aVar, Throwable th) {
            if (this.f32577h) {
                C12761e.m41256a(this.f32582m, th);
                this.f32581l.mo18722b(aVar);
                if (!this.f32585p && this.f32578i != Integer.MAX_VALUE) {
                    request(1);
                }
            } else {
                this.f32581l.unsubscribe();
                unsubscribe();
                if (!this.f32582m.compareAndSet((Object) null, th)) {
                    C12844c.m41417b(th);
                    return;
                }
                this.f32585p = true;
            }
            this.f32580k.decrementAndGet();
            mo40762a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40762a() {
            if (this.f32579j.getAndIncrement() == 0) {
                C12475j<? super R> jVar = this.f32575f;
                Queue<Object> queue = this.f32583n;
                boolean z = this.f32577h;
                AtomicInteger atomicInteger = this.f32580k;
                int i = 1;
                do {
                    long j = this.f32584o.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f32586q) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = this.f32585p;
                        if (z || !z2 || this.f32582m.get() == null) {
                            Object poll = queue.poll();
                            boolean z3 = poll == null;
                            if (!z2 || atomicInteger.get() != 0 || !z3) {
                                if (z3) {
                                    break;
                                }
                                jVar.onNext(C12558h.m41018b(poll));
                                j2++;
                            } else if (this.f32582m.get() != null) {
                                jVar.onError(C12761e.m41254a(this.f32582m));
                                return;
                            } else {
                                jVar.onCompleted();
                                return;
                            }
                        } else {
                            queue.clear();
                            jVar.onError(C12761e.m41254a(this.f32582m));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (this.f32586q) {
                            queue.clear();
                            return;
                        } else if (this.f32585p) {
                            if (z) {
                                if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                    if (this.f32582m.get() != null) {
                                        jVar.onError(C12761e.m41254a(this.f32582m));
                                        return;
                                    } else {
                                        jVar.onCompleted();
                                        return;
                                    }
                                }
                            } else if (this.f32582m.get() != null) {
                                queue.clear();
                                jVar.onError(C12761e.m41254a(this.f32582m));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                jVar.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        this.f32584o.mo40765a(j2);
                        if (!this.f32585p && this.f32578i != Integer.MAX_VALUE) {
                            request(j2);
                        }
                    }
                    i = this.f32579j.addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
