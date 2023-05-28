package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.e.m3 */
/* compiled from: ObservableSwitchIfEmpty */
public final class C11164m3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11488s<? extends T> f29762g;

    /* renamed from: q.a.d0.e.e.m3$a */
    /* compiled from: ObservableSwitchIfEmpty */
    static final class C11165a<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f29763f;

        /* renamed from: g */
        final C11488s<? extends T> f29764g;

        /* renamed from: h */
        final C10871h f29765h = new C10871h();

        /* renamed from: i */
        boolean f29766i = true;

        C11165a(C11490u<? super T> uVar, C11488s<? extends T> sVar) {
            this.f29763f = uVar;
            this.f29764g = sVar;
        }

        public void onComplete() {
            if (this.f29766i) {
                this.f29766i = false;
                this.f29764g.subscribe(this);
                return;
            }
            this.f29763f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29763f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29766i) {
                this.f29766i = false;
            }
            this.f29763f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            this.f29765h.mo36673b(cVar);
        }
    }

    public C11164m3(C11488s<T> sVar, C11488s<? extends T> sVar2) {
        super(sVar);
        this.f29762g = sVar2;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11165a aVar = new C11165a(uVar, this.f29762g);
        uVar.onSubscribe(aVar.f29765h);
        this.f29150f.subscribe(aVar);
    }
}
