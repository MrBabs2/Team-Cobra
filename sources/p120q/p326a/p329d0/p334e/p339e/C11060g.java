package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.g */
/* compiled from: ObservableAllSingle */
public final class C11060g<T> extends C11496w<Boolean> implements C10912a<Boolean> {

    /* renamed from: f */
    final C11488s<T> f29406f;

    /* renamed from: g */
    final C10862p<? super T> f29407g;

    /* renamed from: q.a.d0.e.e.g$a */
    /* compiled from: ObservableAllSingle */
    static final class C11061a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super Boolean> f29408f;

        /* renamed from: g */
        final C10862p<? super T> f29409g;

        /* renamed from: h */
        C10842c f29410h;

        /* renamed from: i */
        boolean f29411i;

        C11061a(C11498y<? super Boolean> yVar, C10862p<? super T> pVar) {
            this.f29408f = yVar;
            this.f29409g = pVar;
        }

        public void dispose() {
            this.f29410h.dispose();
        }

        public boolean isDisposed() {
            return this.f29410h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29411i) {
                this.f29411i = true;
                this.f29408f.onSuccess(true);
            }
        }

        public void onError(Throwable th) {
            if (this.f29411i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29411i = true;
            this.f29408f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29411i) {
                try {
                    if (!this.f29409g.mo36663a(t)) {
                        this.f29411i = true;
                        this.f29410h.dispose();
                        this.f29408f.onSuccess(false);
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29410h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29410h, cVar)) {
                this.f29410h = cVar;
                this.f29408f.onSubscribe(this);
            }
        }
    }

    public C11060g(C11488s<T> sVar, C10862p<? super T> pVar) {
        this.f29406f = sVar;
        this.f29407g = pVar;
    }

    /* renamed from: a */
    public C11482n<Boolean> mo36701a() {
        return C11459a.m37519a(new C11042f(this.f29406f, this.f29407g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super Boolean> yVar) {
        this.f29406f.subscribe(new C11061a(yVar, this.f29407g));
    }
}
