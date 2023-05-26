package p123rx.p410p;

import p123rx.C5372f;
import p123rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.p.a */
/* compiled from: Observers */
public final class C12832a {

    /* renamed from: a */
    private static final C5372f<Object> f33049a = new C12833a();

    /* renamed from: rx.p.a$a */
    /* compiled from: Observers */
    static class C12833a implements C5372f<Object> {
        C12833a() {
        }

        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        public final void onNext(Object obj) {
        }
    }

    /* renamed from: a */
    public static <T> C5372f<T> m41388a() {
        return f33049a;
    }
}
