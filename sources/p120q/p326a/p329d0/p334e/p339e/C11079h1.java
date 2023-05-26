package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11458g;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.h1 */
/* compiled from: ObservableGenerate */
public final class C11079h1<T, S> extends C11482n<T> {

    /* renamed from: f */
    final Callable<S> f29462f;

    /* renamed from: g */
    final C10849c<S, C11458g<T>, S> f29463g;

    /* renamed from: h */
    final C10853g<? super S> f29464h;

    public C11079h1(Callable<S> callable, C10849c<S, C11458g<T>, S> cVar, C10853g<? super S> gVar) {
        this.f29462f = callable;
        this.f29463g = cVar;
        this.f29464h = gVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            C11080a aVar = new C11080a(uVar, this.f29463g, this.f29464h, this.f29462f.call());
            uVar.onSubscribe(aVar);
            aVar.mo36856a();
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }

    /* renamed from: q.a.d0.e.e.h1$a */
    /* compiled from: ObservableGenerate */
    static final class C11080a<T, S> implements C11458g<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29465f;

        /* renamed from: g */
        final C10849c<S, ? super C11458g<T>, S> f29466g;

        /* renamed from: h */
        final C10853g<? super S> f29467h;

        /* renamed from: i */
        S f29468i;

        /* renamed from: j */
        volatile boolean f29469j;

        /* renamed from: k */
        boolean f29470k;

        /* renamed from: l */
        boolean f29471l;

        C11080a(C11490u<? super T> uVar, C10849c<S, ? super C11458g<T>, S> cVar, C10853g<? super S> gVar, S s) {
            this.f29465f = uVar;
            this.f29466g = cVar;
            this.f29467h = gVar;
            this.f29468i = s;
        }

        /* renamed from: a */
        public void mo36856a() {
            S s = this.f29468i;
            if (this.f29469j) {
                this.f29468i = null;
                m37015a(s);
                return;
            }
            C10849c<S, ? super C11458g<T>, S> cVar = this.f29466g;
            while (!this.f29469j) {
                this.f29471l = false;
                try {
                    s = cVar.mo7653a(s, this);
                    if (this.f29470k) {
                        this.f29469j = true;
                        this.f29468i = null;
                        m37015a(s);
                        return;
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29468i = null;
                    this.f29469j = true;
                    mo36857a(th);
                    m37015a(s);
                    return;
                }
            }
            this.f29468i = null;
            m37015a(s);
        }

        public void dispose() {
            this.f29469j = true;
        }

        public boolean isDisposed() {
            return this.f29469j;
        }

        public void onNext(T t) {
            if (this.f29470k) {
                return;
            }
            if (this.f29471l) {
                mo36857a((Throwable) new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                mo36857a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f29471l = true;
                this.f29465f.onNext(t);
            }
        }

        /* renamed from: a */
        private void m37015a(S s) {
            try {
                this.f29467h.mo8098a(s);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b(th);
            }
        }

        /* renamed from: a */
        public void mo36857a(Throwable th) {
            if (this.f29470k) {
                C11459a.m37531b(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f29470k = true;
            this.f29465f.onError(th);
        }
    }
}
