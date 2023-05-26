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

/* renamed from: q.a.d0.e.e.j */
/* compiled from: ObservableAnySingle */
public final class C11105j<T> extends C11496w<Boolean> implements C10912a<Boolean> {

    /* renamed from: f */
    final C11488s<T> f29561f;

    /* renamed from: g */
    final C10862p<? super T> f29562g;

    /* renamed from: q.a.d0.e.e.j$a */
    /* compiled from: ObservableAnySingle */
    static final class C11106a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super Boolean> f29563f;

        /* renamed from: g */
        final C10862p<? super T> f29564g;

        /* renamed from: h */
        C10842c f29565h;

        /* renamed from: i */
        boolean f29566i;

        C11106a(C11498y<? super Boolean> yVar, C10862p<? super T> pVar) {
            this.f29563f = yVar;
            this.f29564g = pVar;
        }

        public void dispose() {
            this.f29565h.dispose();
        }

        public boolean isDisposed() {
            return this.f29565h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29566i) {
                this.f29566i = true;
                this.f29563f.onSuccess(false);
            }
        }

        public void onError(Throwable th) {
            if (this.f29566i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29566i = true;
            this.f29563f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29566i) {
                try {
                    if (this.f29564g.mo36663a(t)) {
                        this.f29566i = true;
                        this.f29565h.dispose();
                        this.f29563f.onSuccess(true);
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29565h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29565h, cVar)) {
                this.f29565h = cVar;
                this.f29563f.onSubscribe(this);
            }
        }
    }

    public C11105j(C11488s<T> sVar, C10862p<? super T> pVar) {
        this.f29561f = sVar;
        this.f29562g = pVar;
    }

    /* renamed from: a */
    public C11482n<Boolean> mo36701a() {
        return C11459a.m37519a(new C11089i(this.f29561f, this.f29562g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super Boolean> yVar) {
        this.f29561f.subscribe(new C11106a(yVar, this.f29562g));
    }
}
