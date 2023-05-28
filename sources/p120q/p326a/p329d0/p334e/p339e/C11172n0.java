package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.n0 */
/* compiled from: ObservableDoOnEach */
public final class C11172n0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10853g<? super T> f29792g;

    /* renamed from: h */
    final C10853g<? super Throwable> f29793h;

    /* renamed from: i */
    final C10847a f29794i;

    /* renamed from: j */
    final C10847a f29795j;

    /* renamed from: q.a.d0.e.e.n0$a */
    /* compiled from: ObservableDoOnEach */
    static final class C11173a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29796f;

        /* renamed from: g */
        final C10853g<? super T> f29797g;

        /* renamed from: h */
        final C10853g<? super Throwable> f29798h;

        /* renamed from: i */
        final C10847a f29799i;

        /* renamed from: j */
        final C10847a f29800j;

        /* renamed from: k */
        C10842c f29801k;

        /* renamed from: l */
        boolean f29802l;

        C11173a(C11490u<? super T> uVar, C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar, C10847a aVar2) {
            this.f29796f = uVar;
            this.f29797g = gVar;
            this.f29798h = gVar2;
            this.f29799i = aVar;
            this.f29800j = aVar2;
        }

        public void dispose() {
            this.f29801k.dispose();
        }

        public boolean isDisposed() {
            return this.f29801k.isDisposed();
        }

        public void onComplete() {
            if (!this.f29802l) {
                try {
                    this.f29799i.run();
                    this.f29802l = true;
                    this.f29796f.onComplete();
                    try {
                        this.f29800j.run();
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        C11459a.m37531b(th);
                    }
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29802l) {
                C11459a.m37531b(th);
                return;
            }
            this.f29802l = true;
            try {
                this.f29798h.mo8098a(th);
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                th = new CompositeException(th, th2);
            }
            this.f29796f.onError(th);
            try {
                this.f29800j.run();
            } catch (Throwable th3) {
                C9034a.m29708a(th3);
                C11459a.m37531b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f29802l) {
                try {
                    this.f29797g.mo8098a(t);
                    this.f29796f.onNext(t);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29801k.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29801k, cVar)) {
                this.f29801k = cVar;
                this.f29796f.onSubscribe(this);
            }
        }
    }

    public C11172n0(C11488s<T> sVar, C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar, C10847a aVar2) {
        super(sVar);
        this.f29792g = gVar;
        this.f29793h = gVar2;
        this.f29794i = aVar;
        this.f29795j = aVar2;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11173a(uVar, this.f29792g, this.f29793h, this.f29794i, this.f29795j));
    }
}
