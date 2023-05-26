package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11437k;

/* renamed from: q.a.d0.e.e.y1 */
/* compiled from: ObservableMergeWithCompletable */
public final class C11334y1<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11450f f30360g;

    public C11334y1(C11482n<T> nVar, C11450f fVar) {
        super(nVar);
        this.f30360g = fVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11335a aVar = new C11335a(uVar);
        uVar.onSubscribe(aVar);
        this.f29150f.subscribe(aVar);
        this.f30360g.mo36640a(aVar.f30363h);
    }

    /* renamed from: q.a.d0.e.e.y1$a */
    /* compiled from: ObservableMergeWithCompletable */
    static final class C11335a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30361f;

        /* renamed from: g */
        final AtomicReference<C10842c> f30362g = new AtomicReference<>();

        /* renamed from: h */
        final C11336a f30363h = new C11336a(this);

        /* renamed from: i */
        final C11428c f30364i = new C11428c();

        /* renamed from: j */
        volatile boolean f30365j;

        /* renamed from: k */
        volatile boolean f30366k;

        /* renamed from: q.a.d0.e.e.y1$a$a */
        /* compiled from: ObservableMergeWithCompletable */
        static final class C11336a extends AtomicReference<C10842c> implements C10863d {

            /* renamed from: f */
            final C11335a<?> f30367f;

            C11336a(C11335a<?> aVar) {
                this.f30367f = aVar;
            }

            public void onComplete() {
                this.f30367f.mo37058a();
            }

            public void onError(Throwable th) {
                this.f30367f.mo37059a(th);
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11335a(C11490u<? super T> uVar) {
            this.f30361f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37059a(Throwable th) {
            C10867d.m36773a(this.f30362g);
            C11437k.m37468a((C11490u<?>) this.f30361f, th, (AtomicInteger) this, this.f30364i);
        }

        public void dispose() {
            C10867d.m36773a(this.f30362g);
            C10867d.m36773a((AtomicReference<C10842c>) this.f30363h);
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30362g.get());
        }

        public void onComplete() {
            this.f30365j = true;
            if (this.f30366k) {
                C11437k.m37469a((C11490u<?>) this.f30361f, (AtomicInteger) this, this.f30364i);
            }
        }

        public void onError(Throwable th) {
            C10867d.m36773a((AtomicReference<C10842c>) this.f30363h);
            C11437k.m37468a((C11490u<?>) this.f30361f, th, (AtomicInteger) this, this.f30364i);
        }

        public void onNext(T t) {
            C11437k.m37467a(this.f30361f, t, (AtomicInteger) this, this.f30364i);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30362g, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37058a() {
            this.f30366k = true;
            if (this.f30365j) {
                C11437k.m37469a((C11490u<?>) this.f30361f, (AtomicInteger) this, this.f30364i);
            }
        }
    }
}
