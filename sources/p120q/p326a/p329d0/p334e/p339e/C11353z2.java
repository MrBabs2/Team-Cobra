package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.z2 */
/* compiled from: ObservableScan */
public final class C11353z2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10849c<T, T, T> f30413g;

    /* renamed from: q.a.d0.e.e.z2$a */
    /* compiled from: ObservableScan */
    static final class C11354a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f30414f;

        /* renamed from: g */
        final C10849c<T, T, T> f30415g;

        /* renamed from: h */
        C10842c f30416h;

        /* renamed from: i */
        T f30417i;

        /* renamed from: j */
        boolean f30418j;

        C11354a(C11490u<? super T> uVar, C10849c<T, T, T> cVar) {
            this.f30414f = uVar;
            this.f30415g = cVar;
        }

        public void dispose() {
            this.f30416h.dispose();
        }

        public boolean isDisposed() {
            return this.f30416h.isDisposed();
        }

        public void onComplete() {
            if (!this.f30418j) {
                this.f30418j = true;
                this.f30414f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f30418j) {
                C11459a.m37531b(th);
                return;
            }
            this.f30418j = true;
            this.f30414f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30418j) {
                C11490u<? super T> uVar = this.f30414f;
                T t2 = this.f30417i;
                if (t2 == null) {
                    this.f30417i = t;
                    uVar.onNext(t);
                    return;
                }
                try {
                    T a = this.f30415g.mo7653a(t2, t);
                    C10910b.m36861a(a, "The value returned by the accumulator is null");
                    this.f30417i = a;
                    uVar.onNext(a);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30416h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30416h, cVar)) {
                this.f30416h = cVar;
                this.f30414f.onSubscribe(this);
            }
        }
    }

    public C11353z2(C11488s<T> sVar, C10849c<T, T, T> cVar) {
        super(sVar);
        this.f30413g = cVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11354a(uVar, this.f30413g));
    }
}
