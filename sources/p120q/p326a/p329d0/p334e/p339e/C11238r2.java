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

/* renamed from: q.a.d0.e.e.r2 */
/* compiled from: ObservableRepeatWhen */
public final class C11238r2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super C11482n<Object>, ? extends C11488s<?>> f30034g;

    public C11238r2(C11488s<T> sVar, C10861o<? super C11482n<Object>, ? extends C11488s<?>> oVar) {
        super(sVar);
        this.f30034g = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11475c b = C11472a.m37553c().mo37237b();
        try {
            Object apply = this.f30034g.apply(b);
            C10910b.m36861a(apply, "The handler returned a null ObservableSource");
            C11488s sVar = (C11488s) apply;
            C11239a aVar = new C11239a(uVar, b, this.f29150f);
            uVar.onSubscribe(aVar);
            sVar.subscribe(aVar.f30039j);
            aVar.mo36977c();
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }

    /* renamed from: q.a.d0.e.e.r2$a */
    /* compiled from: ObservableRepeatWhen */
    static final class C11239a<T> extends AtomicInteger implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30035f;

        /* renamed from: g */
        final AtomicInteger f30036g = new AtomicInteger();

        /* renamed from: h */
        final C11428c f30037h = new C11428c();

        /* renamed from: i */
        final C11475c<Object> f30038i;

        /* renamed from: j */
        final C11239a<T>.C0000a f30039j = new C11240a();

        /* renamed from: k */
        final AtomicReference<C10842c> f30040k = new AtomicReference<>();

        /* renamed from: l */
        final C11488s<T> f30041l;

        /* renamed from: m */
        volatile boolean f30042m;

        /* renamed from: q.a.d0.e.e.r2$a$a */
        /* compiled from: ObservableRepeatWhen */
        final class C11240a extends AtomicReference<C10842c> implements C11490u<Object> {
            C11240a() {
            }

            public void onComplete() {
                C11239a.this.mo36974a();
            }

            public void onError(Throwable th) {
                C11239a.this.mo36975a(th);
            }

            public void onNext(Object obj) {
                C11239a.this.mo36976b();
            }

            public void onSubscribe(C10842c cVar) {
                C10867d.m36778c(this, cVar);
            }
        }

        C11239a(C11490u<? super T> uVar, C11475c<Object> cVar, C11488s<T> sVar) {
            this.f30035f = uVar;
            this.f30038i = cVar;
            this.f30041l = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36975a(Throwable th) {
            C10867d.m36773a(this.f30040k);
            C11437k.m37468a((C11490u<?>) this.f30035f, th, (AtomicInteger) this, this.f30037h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36976b() {
            mo36977c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36977c() {
            if (this.f30036g.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f30042m) {
                        this.f30042m = true;
                        this.f30041l.subscribe(this);
                    }
                    if (this.f30036g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            C10867d.m36773a(this.f30040k);
            C10867d.m36773a((AtomicReference<C10842c>) this.f30039j);
        }

        public boolean isDisposed() {
            return C10867d.m36775a(this.f30040k.get());
        }

        public void onComplete() {
            C10867d.m36774a(this.f30040k, (C10842c) null);
            this.f30042m = false;
            this.f30038i.onNext(0);
        }

        public void onError(Throwable th) {
            C10867d.m36773a((AtomicReference<C10842c>) this.f30039j);
            C11437k.m37468a((C11490u<?>) this.f30035f, th, (AtomicInteger) this, this.f30037h);
        }

        public void onNext(T t) {
            C11437k.m37467a(this.f30035f, t, (AtomicInteger) this, this.f30037h);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f30040k, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36974a() {
            C10867d.m36773a(this.f30040k);
            C11437k.m37469a((C11490u<?>) this.f30035f, (AtomicInteger) this, this.f30037h);
        }
    }
}
