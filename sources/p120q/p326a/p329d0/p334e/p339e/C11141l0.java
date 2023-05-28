package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p333d.C10919a;

/* renamed from: q.a.d0.e.e.l0 */
/* compiled from: ObservableDoAfterNext */
public final class C11141l0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10853g<? super T> f29698g;

    /* renamed from: q.a.d0.e.e.l0$a */
    /* compiled from: ObservableDoAfterNext */
    static final class C11142a<T> extends C10919a<T, T> {

        /* renamed from: k */
        final C10853g<? super T> f29699k;

        C11142a(C11490u<? super T> uVar, C10853g<? super T> gVar) {
            super(uVar);
            this.f29699k = gVar;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return mo36705b(i);
        }

        public void onNext(T t) {
            this.f28972f.onNext(t);
            if (this.f28976j == 0) {
                try {
                    this.f29699k.mo8098a(t);
                } catch (Throwable th) {
                    mo36704a(th);
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f28974h.poll();
            if (poll != null) {
                this.f29699k.mo8098a(poll);
            }
            return poll;
        }
    }

    public C11141l0(C11488s<T> sVar, C10853g<? super T> gVar) {
        super(sVar);
        this.f29698g = gVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11142a(uVar, this.f29698g));
    }
}
