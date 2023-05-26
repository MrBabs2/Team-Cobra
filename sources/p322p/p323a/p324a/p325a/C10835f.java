package p322p.p323a.p324a.p325a;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C10838a0;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p123rx.C12474i;
import p123rx.C5375k;
import p123rx.Single;

/* renamed from: p.a.a.a.f */
/* compiled from: SingleV2ToSingleV1 */
final class C10835f<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final C10838a0<T> f28914f;

    /* renamed from: p.a.a.a.f$a */
    /* compiled from: SingleV2ToSingleV1 */
    static final class C10836a<T> extends AtomicReference<C10842c> implements C11498y<T>, C5375k {

        /* renamed from: f */
        final C12474i<? super T> f28915f;

        C10836a(C12474i<? super T> iVar) {
            this.f28915f = iVar;
        }

        public boolean isUnsubscribed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onError(Throwable th) {
            this.f28915f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void onSuccess(T t) {
            this.f28915f.mo18573a(t);
        }

        public void unsubscribe() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }
    }

    C10835f(C10838a0<T> a0Var) {
        this.f28914f = a0Var;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C10836a aVar = new C10836a(iVar);
        iVar.mo40654b(aVar);
        this.f28914f.mo36638a(aVar);
    }
}
