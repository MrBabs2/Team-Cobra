package p120q.p326a.p329d0.p334e.p338d;

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
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.d.d */
/* compiled from: ObservableSwitchMapCompletable */
public final class C10970d<T> extends C10839b {

    /* renamed from: f */
    final C11482n<T> f29110f;

    /* renamed from: g */
    final C10861o<? super T, ? extends C11450f> f29111g;

    /* renamed from: h */
    final boolean f29112h;

    public C10970d(C11482n<T> nVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
        this.f29110f = nVar;
        this.f29111g = oVar;
        this.f29112h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        if (!C10979g.m36946a((Object) this.f29110f, this.f29111g, dVar)) {
            this.f29110f.subscribe(new C10971a(dVar, this.f29111g, this.f29112h));
        }
    }

    /* renamed from: q.a.d0.e.d.d$a */
    /* compiled from: ObservableSwitchMapCompletable */
    static final class C10971a<T> implements C11490u<T>, C10842c {

        /* renamed from: m */
        static final C10972a f29113m = new C10972a((C10971a<?>) null);

        /* renamed from: f */
        final C10863d f29114f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11450f> f29115g;

        /* renamed from: h */
        final boolean f29116h;

        /* renamed from: i */
        final C11428c f29117i = new C11428c();

        /* renamed from: j */
        final AtomicReference<C10972a> f29118j = new AtomicReference<>();

        /* renamed from: k */
        volatile boolean f29119k;

        /* renamed from: l */
        C10842c f29120l;

        /* renamed from: q.a.d0.e.d.d$a$a */
        /* compiled from: ObservableSwitchMapCompletable */
        static final class C10972a extends AtomicReference<C10842c> implements C10863d {

            /* renamed from: f */
            final C10971a<?> f29121f;

            C10972a(C10971a<?> aVar) {
                this.f29121f = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo36767a() {
                C10867d.m36773a((AtomicReference<C10842c>) this);
            }

            public void onComplete() {
                this.f29121f.mo36765a(this);
            }

            public void onError(Throwable th) {
                this.f29121f.mo36766a(this, th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C10971a(C10863d dVar, C10861o<? super T, ? extends C11450f> oVar, boolean z) {
            this.f29114f = dVar;
            this.f29115g = oVar;
            this.f29116h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36764a() {
            C10972a andSet = this.f29118j.getAndSet(f29113m);
            if (andSet != null && andSet != f29113m) {
                andSet.mo36767a();
            }
        }

        public void dispose() {
            this.f29120l.dispose();
            mo36764a();
        }

        public boolean isDisposed() {
            return this.f29118j.get() == f29113m;
        }

        public void onComplete() {
            this.f29119k = true;
            if (this.f29118j.get() == null) {
                Throwable a = this.f29117i.mo37168a();
                if (a == null) {
                    this.f29114f.onComplete();
                } else {
                    this.f29114f.onError(a);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f29117i.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (this.f29116h) {
                onComplete();
            } else {
                mo36764a();
                Throwable a = this.f29117i.mo37168a();
                if (a != C11435j.f30621a) {
                    this.f29114f.onError(a);
                }
            }
        }

        public void onNext(T t) {
            C10972a aVar;
            try {
                Object apply = this.f29115g.apply(t);
                C10910b.m36861a(apply, "The mapper returned a null CompletableSource");
                C11450f fVar = (C11450f) apply;
                C10972a aVar2 = new C10972a(this);
                do {
                    aVar = this.f29118j.get();
                    if (aVar == f29113m) {
                        return;
                    }
                } while (!this.f29118j.compareAndSet(aVar, aVar2));
                if (aVar != null) {
                    aVar.mo36767a();
                }
                fVar.mo36640a(aVar2);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29120l.dispose();
                onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29120l, cVar)) {
                this.f29120l = cVar;
                this.f29114f.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36766a(C10972a aVar, Throwable th) {
            if (!this.f29118j.compareAndSet(aVar, (Object) null) || !this.f29117i.mo37169a(th)) {
                C11459a.m37531b(th);
            } else if (!this.f29116h) {
                dispose();
                Throwable a = this.f29117i.mo37168a();
                if (a != C11435j.f30621a) {
                    this.f29114f.onError(a);
                }
            } else if (this.f29119k) {
                this.f29114f.onError(this.f29117i.mo37168a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36765a(C10972a aVar) {
            if (this.f29118j.compareAndSet(aVar, (Object) null) && this.f29119k) {
                Throwable a = this.f29117i.mo37168a();
                if (a == null) {
                    this.f29114f.onComplete();
                } else {
                    this.f29114f.onError(a);
                }
            }
        }
    }
}
