package p322p.p323a.p324a.p325a;

import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p123rx.C12474i;
import p123rx.Single;

/* renamed from: p.a.a.a.e */
/* compiled from: SingleV1ToSingleV2 */
final class C10833e<T> extends C11496w<T> {

    /* renamed from: f */
    final Single<T> f28912f;

    /* renamed from: p.a.a.a.e$a */
    /* compiled from: SingleV1ToSingleV2 */
    static final class C10834a<T> extends C12474i<T> implements C10842c {

        /* renamed from: g */
        final C11498y<? super T> f28913g;

        C10834a(C11498y<? super T> yVar) {
            this.f28913g = yVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            if (t == null) {
                this.f28913g.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f28913g.onSuccess(t);
            }
        }

        public void dispose() {
            unsubscribe();
        }

        public boolean isDisposed() {
            return isUnsubscribed();
        }

        public void onError(Throwable th) {
            this.f28913g.onError(th);
        }
    }

    C10833e(Single<T> single) {
        this.f28912f = single;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        C10834a aVar = new C10834a(yVar);
        yVar.onSubscribe(aVar);
        this.f28912f.mo18560a(aVar);
    }
}
