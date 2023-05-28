package p120q.p326a.p329d0.p334e.p338d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11434i;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.a */
/* compiled from: ObservableConcatMapCompletable */
public final class C10961a<T> extends C10839b {

    /* renamed from: f */
    final C11482n<T> f29062f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C11450f> f29063g;

    /* renamed from: h */
    final C11434i f29064h;

    /* renamed from: i */
    final int f29065i;

    public C10961a(C11482n<T> nVar, C10861o<? super T, ? extends C11450f> oVar, C11434i iVar, int i) {
        this.f29062f = nVar;
        this.f29063g = oVar;
        this.f29064h = iVar;
        this.f29065i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        if (!C10979g.m36946a((Object) this.f29062f, this.f29063g, dVar)) {
            this.f29062f.subscribe(new C10962a(dVar, this.f29063g, this.f29064h, this.f29065i));
        }
    }

    /* renamed from: q.a.d0.e.d.a$a */
    /* compiled from: ObservableConcatMapCompletable */
    static final class C10962a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C10863d f29066f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11450f> f29067g;

        /* renamed from: h */
        final C11434i f29068h;

        /* renamed from: i */
        final C11428c f29069i = new C11428c();

        /* renamed from: j */
        final C10963a f29070j = new C10963a(this);

        /* renamed from: k */
        final int f29071k;

        /* renamed from: l */
        C10918g<T> f29072l;

        /* renamed from: m */
        C10842c f29073m;

        /* renamed from: n */
        volatile boolean f29074n;

        /* renamed from: o */
        volatile boolean f29075o;

        /* renamed from: p */
        volatile boolean f29076p;

        /* renamed from: q.a.d0.e.d.a$a$a */
        /* compiled from: ObservableConcatMapCompletable */
        static final class C10963a extends AtomicReference<C10842c> implements C10863d {

            /* renamed from: f */
            final C10962a<?> f29077f;

            C10963a(C10962a<?> aVar) {
                this.f29077f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36753a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                this.f29077f.mo36752b();
            }

            public void onError(Throwable th) {
                this.f29077f.mo36751a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36774a((AtomicReference<C10842c>) this, cVar);
            }
        }

        C10962a(C10863d dVar, C10861o<? super T, ? extends C11450f> oVar, C11434i iVar, int i) {
            this.f29066f = dVar;
            this.f29067g = oVar;
            this.f29068h = iVar;
            this.f29071k = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36751a(Throwable th) {
            if (!this.f29069i.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (this.f29068h == C11434i.IMMEDIATE) {
                this.f29076p = true;
                this.f29073m.dispose();
                Throwable a = this.f29069i.mo37168a();
                if (a != C11435j.f30621a) {
                    this.f29066f.onError(a);
                }
                if (getAndIncrement() == 0) {
                    this.f29072l.clear();
                }
            } else {
                this.f29074n = false;
                mo36750a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36752b() {
            this.f29074n = false;
            mo36750a();
        }

        public void dispose() {
            this.f29076p = true;
            this.f29073m.dispose();
            this.f29070j.mo36753a();
            if (getAndIncrement() == 0) {
                this.f29072l.clear();
            }
        }

        public boolean isDisposed() {
            return this.f29076p;
        }

        public void onComplete() {
            this.f29075o = true;
            mo36750a();
        }

        public void onError(Throwable th) {
            if (!this.f29069i.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (this.f29068h == C11434i.IMMEDIATE) {
                this.f29076p = true;
                this.f29070j.mo36753a();
                Throwable a = this.f29069i.mo37168a();
                if (a != C11435j.f30621a) {
                    this.f29066f.onError(a);
                }
                if (getAndIncrement() == 0) {
                    this.f29072l.clear();
                }
            } else {
                this.f29075o = true;
                mo36750a();
            }
        }

        public void onNext(T t) {
            if (t != null) {
                this.f29072l.offer(t);
            }
            mo36750a();
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29073m, cVar)) {
                this.f29073m = cVar;
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(3);
                    if (a == 1) {
                        this.f29072l = bVar;
                        this.f29075o = true;
                        this.f29066f.onSubscribe(this);
                        mo36750a();
                        return;
                    } else if (a == 2) {
                        this.f29072l = bVar;
                        this.f29066f.onSubscribe(this);
                        return;
                    }
                }
                this.f29072l = new C11385c(this.f29071k);
                this.f29066f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36750a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C11428c cVar = this.f29069i;
                C11434i iVar = this.f29068h;
                while (!this.f29076p) {
                    if (!this.f29074n) {
                        if (iVar != C11434i.BOUNDARY || cVar.get() == null) {
                            boolean z2 = this.f29075o;
                            C11450f fVar = null;
                            try {
                                T poll = this.f29072l.poll();
                                if (poll != null) {
                                    Object apply = this.f29067g.apply(poll);
                                    C10910b.m36861a(apply, "The mapper returned a null CompletableSource");
                                    fVar = (C11450f) apply;
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.f29076p = true;
                                    Throwable a = cVar.mo37168a();
                                    if (a != null) {
                                        this.f29066f.onError(a);
                                        return;
                                    } else {
                                        this.f29066f.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.f29074n = true;
                                    fVar.mo36640a(this.f29070j);
                                }
                            } catch (Throwable th) {
                                C9034a.m29708a(th);
                                this.f29076p = true;
                                this.f29072l.clear();
                                this.f29073m.dispose();
                                cVar.mo37169a(th);
                                this.f29066f.onError(cVar.mo37168a());
                                return;
                            }
                        } else {
                            this.f29076p = true;
                            this.f29072l.clear();
                            this.f29066f.onError(cVar.mo37168a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f29072l.clear();
            }
        }
    }
}
