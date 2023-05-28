package p120q.p326a.p329d0.p334e.p335a;

import p120q.p326a.C10838a0;
import p120q.p326a.C10839b;
import p120q.p326a.C10863d;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.e.a.c */
/* compiled from: CompletableFromSingle */
public final class C10941c<T> extends C10839b {

    /* renamed from: f */
    final C10838a0<T> f29018f;

    /* renamed from: q.a.d0.e.a.c$a */
    /* compiled from: CompletableFromSingle */
    static final class C10942a<T> implements C11498y<T> {

        /* renamed from: f */
        final C10863d f29019f;

        C10942a(C10863d dVar) {
            this.f29019f = dVar;
        }

        public void onError(Throwable th) {
            this.f29019f.onError(th);
        }

        public void onSubscribe(C10842c cVar) {
            this.f29019f.onSubscribe(cVar);
        }

        public void onSuccess(T t) {
            this.f29019f.onComplete();
        }
    }

    public C10941c(C10838a0<T> a0Var) {
        this.f29018f = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        this.f29018f.mo36638a(new C10942a(dVar));
    }
}
