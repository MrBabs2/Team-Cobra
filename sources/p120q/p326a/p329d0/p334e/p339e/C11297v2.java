package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11428c;
import p120q.p326a.p329d0.p345j.C11437k;
import p120q.p326a.p350i0.C11472a;
import p120q.p326a.p350i0.C11475c;

/* renamed from: q.a.d0.e.e.v2 */
/* compiled from: ObservableRetryWhen */
public final class C11297v2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super C11482n<Throwable>, ? extends C11488s<?>> f30242g;

    public C11297v2(C11488s<T> sVar, C10861o<? super C11482n<Throwable>, ? extends C11488s<?>> oVar) {
        super(sVar);
        this.f30242g = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11475c b = C11472a.m37553c().mo37237b();
        try {
            Object apply = this.f30242g.apply(b);
            C10910b.m36861a(apply, "The handler returned a null ObservableSource");
            C11488s sVar = (C11488s) apply;
            C11298a aVar = new C11298a(uVar, b, this.f29150f);
            uVar.onSubscribe(aVar);
            sVar.subscribe(aVar.f30247j);
            aVar.mo37032c();
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }

    /* renamed from: q.a.d0.e.e.v2$a */
    /* compiled from: ObservableRetryWhen */
    static final class C11298a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30243f;

        /* renamed from: g */
        final AtomicInteger f30244g = new AtomicInteger();

        /* renamed from: h */
        final C11428c f30245h = new C11428c();

        /* renamed from: i */
        final C11475c<Throwable> f30246i;

        /* renamed from: j */
        final C11298a<T>.C0000a f30247j = new C11299a();

        /* renamed from: k */
        final AtomicReference<C10842c> f30248k = new AtomicReference<>();

        /* renamed from: l */
        final C11488s<T> f30249l;

        /* renamed from: m */
        volatile boolean f30250m;

        /* renamed from: q.a.d0.e.e.v2$a$a */
        /* compiled from: ObservableRetryWhen */
        final class C11299a extends AtomicReference<C10842c> implements C11490u<Object> {
            C11299a() {
            }

            public void onComplete() {
                C11298a.this.mo37029a();
            }

            public void onError(Throwable th) {
                C11298a.this.mo37030a(th);
            }

            public void onNext(Object obj) {
                C11298a.this.mo37031b();
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11298a(C11490u<? super T> uVar, C11475c<Throwable> cVar, C11488s<T> sVar) {
            this.f30243f = uVar;
            this.f30246i = cVar;
            this.f30249l = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37030a(Throwable th) {
            C10867d.m36773a(this.f30248k);
            C11437k.m37468a((C11490u<?>) this.f30243f, th, (AtomicInteger) this, this.f30245h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37031b() {
            mo37032c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37032c() {
            if (this.f30244g.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f30250m) {
                        this.f30250m = true;
                        this.f30249l.subscribe(this);
                    }
                    if (this.f30244g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            C10867d.m36773a(this.f30248k);
            C10867d.m36773a((AtomicReference<C10842c>) this.f30247j);
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30248k.get());
        }

        public void onComplete() {
            C10867d.m36773a((AtomicReference<C10842c>) this.f30247j);
            C11437k.m37469a((C11490u<?>) this.f30243f, (AtomicInteger) this, this.f30245h);
        }

        public void onError(Throwable th) {
            C10867d.m36774a(this.f30248k, (C10842c) null);
            this.f30250m = false;
            this.f30246i.onNext(th);
        }

        public void onNext(T t) {
            C11437k.m37467a(this.f30243f, t, (AtomicInteger) this, this.f30245h);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36774a(this.f30248k, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37029a() {
            C10867d.m36773a(this.f30248k);
            C11437k.m37469a((C11490u<?>) this.f30243f, (AtomicInteger) this, this.f30245h);
        }
    }
}
