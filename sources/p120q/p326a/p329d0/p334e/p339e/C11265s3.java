package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11437k;

/* renamed from: q.a.d0.e.e.s3 */
/* compiled from: ObservableTakeUntil */
public final class C11265s3<T, U> extends C10980a<T, T> {

    /* renamed from: g */
    final C11488s<? extends U> f30109g;

    public C11265s3(C11488s<T> sVar, C11488s<? extends U> sVar2) {
        super(sVar);
        this.f30109g = sVar2;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11266a aVar = new C11266a(uVar);
        uVar.onSubscribe(aVar);
        this.f30109g.subscribe(aVar.f30112h);
        this.f29150f.subscribe(aVar);
    }

    /* renamed from: q.a.d0.e.e.s3$a */
    /* compiled from: ObservableTakeUntil */
    static final class C11266a<T, U> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30110f;

        /* renamed from: g */
        final AtomicReference<C10842c> f30111g = new AtomicReference<>();

        /* renamed from: h */
        final C11266a<T, U>.C0000a f30112h = new C11267a();

        /* renamed from: i */
        final C11428c f30113i = new C11428c();

        /* renamed from: q.a.d0.e.e.s3$a$a */
        /* compiled from: ObservableTakeUntil */
        final class C11267a extends AtomicReference<C10842c> implements C11490u<U> {
            C11267a() {
            }

            public void onComplete() {
                C11266a.this.mo37000a();
            }

            public void onError(Throwable th) {
                C11266a.this.mo37001a(th);
            }

            public void onNext(U u) {
                C10867d.m36773a((AtomicReference<C10842c>) this);
                C11266a.this.mo37000a();
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11266a(C11490u<? super T> uVar) {
            this.f30110f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37001a(Throwable th) {
            C10867d.m36773a(this.f30111g);
            C11437k.m37468a((C11490u<?>) this.f30110f, th, (AtomicInteger) this, this.f30113i);
        }

        public void dispose() {
            C10867d.m36773a(this.f30111g);
            C10867d.m36773a((AtomicReference<C10842c>) this.f30112h);
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30111g.get());
        }

        public void onComplete() {
            C10867d.m36773a((AtomicReference<C10842c>) this.f30112h);
            C11437k.m37469a((C11490u<?>) this.f30110f, (AtomicInteger) this, this.f30113i);
        }

        public void onError(Throwable th) {
            C10867d.m36773a((AtomicReference<C10842c>) this.f30112h);
            C11437k.m37468a((C11490u<?>) this.f30110f, th, (AtomicInteger) this, this.f30113i);
        }

        public void onNext(T t) {
            C11437k.m37467a(this.f30110f, t, (AtomicInteger) this, this.f30113i);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30111g, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37000a() {
            C10867d.m36773a(this.f30111g);
            C11437k.m37469a((C11490u<?>) this.f30110f, (AtomicInteger) this, this.f30113i);
        }
    }
}
