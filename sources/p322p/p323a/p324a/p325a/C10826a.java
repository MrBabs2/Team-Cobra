package p322p.p323a.p324a.p325a;

import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.p327b0.C10842c;
import p123rx.C12464c;
import p123rx.C5328b;
import p123rx.C5375k;

/* renamed from: p.a.a.a.a */
/* compiled from: CompletableV1ToCompletableV2 */
final class C10826a extends C10839b {

    /* renamed from: f */
    final C5328b f28903f;

    /* renamed from: p.a.a.a.a$a */
    /* compiled from: CompletableV1ToCompletableV2 */
    static final class C10827a implements C12464c, C10842c {

        /* renamed from: f */
        final C10863d f28904f;

        /* renamed from: g */
        C5375k f28905g;

        C10827a(C10863d dVar) {
            this.f28904f = dVar;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f28905g = kVar;
            this.f28904f.onSubscribe(this);
        }

        public void dispose() {
            this.f28905g.unsubscribe();
        }

        public boolean isDisposed() {
            return this.f28905g.isUnsubscribed();
        }

        public void onCompleted() {
            this.f28904f.onComplete();
        }

        public void onError(Throwable th) {
            this.f28904f.onError(th);
        }
    }

    C10826a(C5328b bVar) {
        this.f28903f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        this.f28903f.mo18596a((C12464c) new C10827a(dVar));
    }
}
