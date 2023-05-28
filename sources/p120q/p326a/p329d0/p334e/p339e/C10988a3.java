package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.a3 */
/* compiled from: ObservableScanSeed */
public final class C10988a3<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10849c<R, ? super T, R> f29170g;

    /* renamed from: h */
    final Callable<R> f29171h;

    /* renamed from: q.a.d0.e.e.a3$a */
    /* compiled from: ObservableScanSeed */
    static final class C10989a<T, R> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29172f;

        /* renamed from: g */
        final C10849c<R, ? super T, R> f29173g;

        /* renamed from: h */
        R f29174h;

        /* renamed from: i */
        C10842c f29175i;

        /* renamed from: j */
        boolean f29176j;

        C10989a(C11490u<? super R> uVar, C10849c<R, ? super T, R> cVar, R r) {
            this.f29172f = uVar;
            this.f29173g = cVar;
            this.f29174h = r;
        }

        public void dispose() {
            this.f29175i.dispose();
        }

        public boolean isDisposed() {
            return this.f29175i.isDisposed();
        }

        public void onComplete() {
            if (!this.f29176j) {
                this.f29176j = true;
                this.f29172f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29176j) {
                C11459a.m37531b(th);
                return;
            }
            this.f29176j = true;
            this.f29172f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29176j) {
                try {
                    R a = this.f29173g.mo7653a(this.f29174h, t);
                    C10910b.m36861a(a, "The accumulator returned a null value");
                    this.f29174h = a;
                    this.f29172f.onNext(a);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29175i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29175i, cVar)) {
                this.f29175i = cVar;
                this.f29172f.onSubscribe(this);
                this.f29172f.onNext(this.f29174h);
            }
        }
    }

    public C10988a3(C11488s<T> sVar, Callable<R> callable, C10849c<R, ? super T, R> cVar) {
        super(sVar);
        this.f29170g = cVar;
        this.f29171h = callable;
    }

    public void subscribeActual(C11490u<? super R> uVar) {
        try {
            R call = this.f29171h.call();
            C10910b.m36861a(call, "The seed supplied is null");
            this.f29150f.subscribe(new C10989a(uVar, this.f29170g, call));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }
}
