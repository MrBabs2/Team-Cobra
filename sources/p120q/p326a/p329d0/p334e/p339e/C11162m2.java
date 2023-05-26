package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.m2 */
/* compiled from: ObservableReduceSeedSingle */
public final class C11162m2<T, R> extends C11496w<R> {

    /* renamed from: f */
    final C11488s<T> f29755f;

    /* renamed from: g */
    final R f29756g;

    /* renamed from: h */
    final C10849c<R, ? super T, R> f29757h;

    /* renamed from: q.a.d0.e.e.m2$a */
    /* compiled from: ObservableReduceSeedSingle */
    static final class C11163a<T, R> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super R> f29758f;

        /* renamed from: g */
        final C10849c<R, ? super T, R> f29759g;

        /* renamed from: h */
        R f29760h;

        /* renamed from: i */
        C10842c f29761i;

        C11163a(C11498y<? super R> yVar, C10849c<R, ? super T, R> cVar, R r) {
            this.f29758f = yVar;
            this.f29760h = r;
            this.f29759g = cVar;
        }

        public void dispose() {
            this.f29761i.dispose();
        }

        public boolean isDisposed() {
            return this.f29761i.isDisposed();
        }

        public void onComplete() {
            R r = this.f29760h;
            if (r != null) {
                this.f29760h = null;
                this.f29758f.onSuccess(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f29760h != null) {
                this.f29760h = null;
                this.f29758f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }

        public void onNext(T t) {
            R r = this.f29760h;
            if (r != null) {
                try {
                    R a = this.f29759g.mo7653a(r, t);
                    C10910b.m36861a(a, "The reducer returned a null value");
                    this.f29760h = a;
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29761i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29761i, cVar)) {
                this.f29761i = cVar;
                this.f29758f.onSubscribe(this);
            }
        }
    }

    public C11162m2(C11488s<T> sVar, R r, C10849c<R, ? super T, R> cVar) {
        this.f29755f = sVar;
        this.f29756g = r;
        this.f29757h = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super R> yVar) {
        this.f29755f.subscribe(new C11163a(yVar, this.f29757h, this.f29756g));
    }
}
