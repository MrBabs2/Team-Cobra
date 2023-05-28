package p322p.p323a.p324a.p325a;

import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.p327b0.C10842c;
import p123rx.C12464c;
import p123rx.C5328b;
import p123rx.C5375k;

/* renamed from: p.a.a.a.b */
/* compiled from: CompletableV2ToCompletableV1 */
final class C10828b implements C5328b.C5366w {

    /* renamed from: f */
    final C11450f f28906f;

    /* renamed from: p.a.a.a.b$a */
    /* compiled from: CompletableV2ToCompletableV1 */
    static final class C10829a implements C10863d, C5375k {

        /* renamed from: f */
        final C12464c f28907f;

        /* renamed from: g */
        C10842c f28908g;

        C10829a(C12464c cVar) {
            this.f28907f = cVar;
        }

        public boolean isUnsubscribed() {
            return this.f28908g.isDisposed();
        }

        public void onComplete() {
            this.f28907f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f28907f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            this.f28908g = cVar;
            this.f28907f.mo18613a(this);
        }

        public void unsubscribe() {
            this.f28908g.dispose();
        }
    }

    C10828b(C11450f fVar) {
        this.f28906f = fVar;
    }

    /* renamed from: a */
    public void call(C12464c cVar) {
        this.f28906f.mo36640a(new C10829a(cVar));
    }
}
