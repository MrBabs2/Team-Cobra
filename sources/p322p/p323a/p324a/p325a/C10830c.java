package p322p.p323a.p324a.p325a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11471i;
import p120q.p326a.p329d0.p344i.C11424b;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p415t.p416a.C12934a;
import p415t.p416a.C12936c;

/* renamed from: p.a.a.a.c */
/* compiled from: FlowableV2ToObservableV1 */
final class C10830c<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C12934a<T> f28909f;

    /* renamed from: p.a.a.a.c$a */
    /* compiled from: FlowableV2ToObservableV1 */
    static final class C10831a<T> extends AtomicReference<C12936c> implements C11471i<T>, C5375k, C12473g {

        /* renamed from: f */
        final C12475j<? super T> f28910f;

        /* renamed from: g */
        final AtomicLong f28911g = new AtomicLong();

        C10831a(C12475j<? super T> jVar) {
            this.f28910f = jVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            C11424b.m37438a((AtomicReference<C12936c>) this, this.f28911g, cVar);
        }

        public boolean isUnsubscribed() {
            return C11424b.CANCELLED == get();
        }

        public void onComplete() {
            this.f28910f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f28910f.onError(th);
        }

        public void onNext(T t) {
            this.f28910f.onNext(t);
        }

        public void request(long j) {
            if (j != 0) {
                C11424b.m37435a((AtomicReference<C12936c>) this, this.f28911g, j);
            }
        }

        public void unsubscribe() {
            C11424b.m37437a((AtomicReference<C12936c>) this);
        }
    }

    C10830c(C12934a<T> aVar) {
        this.f28909f = aVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C10831a aVar = new C10831a(jVar);
        jVar.add(aVar);
        jVar.setProducer(aVar);
        this.f28909f.mo37219a(aVar);
    }
}
