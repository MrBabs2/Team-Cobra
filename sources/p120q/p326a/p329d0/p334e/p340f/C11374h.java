package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10838a0;
import p120q.p326a.C11491v;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10871h;

/* renamed from: q.a.d0.e.f.h */
/* compiled from: SingleSubscribeOn */
public final class C11374h<T> extends C11496w<T> {

    /* renamed from: f */
    final C10838a0<? extends T> f30465f;

    /* renamed from: g */
    final C11491v f30466g;

    /* renamed from: q.a.d0.e.f.h$a */
    /* compiled from: SingleSubscribeOn */
    static final class C11375a<T> extends AtomicReference<C10842c> implements C11498y<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11498y<? super T> f30467f;

        /* renamed from: g */
        final C10871h f30468g = new C10871h();

        /* renamed from: h */
        final C10838a0<? extends T> f30469h;

        C11375a(C11498y<? super T> yVar, C10838a0<? extends T> a0Var) {
            this.f30467f = yVar;
            this.f30469h = a0Var;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f30468g.dispose();
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onError(Throwable th) {
            this.f30467f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void onSuccess(T t) {
            this.f30467f.onSuccess(t);
        }

        public void run() {
            this.f30469h.mo36638a(this);
        }
    }

    public C11374h(C10838a0<? extends T> a0Var, C11491v vVar) {
        this.f30465f = a0Var;
        this.f30466g = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        C11375a aVar = new C11375a(yVar, this.f30465f);
        yVar.onSubscribe(aVar);
        aVar.f30468g.mo36672a(this.f30466g.mo37125a((Runnable) aVar));
    }
}
