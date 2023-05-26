package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10838a0;
import p120q.p326a.C11491v;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.f.g */
/* compiled from: SingleObserveOn */
public final class C11372g<T> extends C11496w<T> {

    /* renamed from: f */
    final C10838a0<T> f30459f;

    /* renamed from: g */
    final C11491v f30460g;

    /* renamed from: q.a.d0.e.f.g$a */
    /* compiled from: SingleObserveOn */
    static final class C11373a<T> extends AtomicReference<C10842c> implements C11498y<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11498y<? super T> f30461f;

        /* renamed from: g */
        final C11491v f30462g;

        /* renamed from: h */
        T f30463h;

        /* renamed from: i */
        Throwable f30464i;

        C11373a(C11498y<? super T> yVar, C11491v vVar) {
            this.f30461f = yVar;
            this.f30462g = vVar;
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onError(Throwable th) {
            this.f30464i = th;
            C10867d.m36774a((AtomicReference<C10842c>) this, this.f30462g.mo37125a((Runnable) this));
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36778c(this, cVar)) {
                this.f30461f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f30463h = t;
            C10867d.m36774a((AtomicReference<C10842c>) this, this.f30462g.mo37125a((Runnable) this));
        }

        public void run() {
            Throwable th = this.f30464i;
            if (th != null) {
                this.f30461f.onError(th);
            } else {
                this.f30461f.onSuccess(this.f30463h);
            }
        }
    }

    public C11372g(C10838a0<T> a0Var, C11491v vVar) {
        this.f30459f = a0Var;
        this.f30460g = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        this.f30459f.mo36638a(new C11373a(yVar, this.f30460g));
    }
}
