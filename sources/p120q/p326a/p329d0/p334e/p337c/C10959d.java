package p120q.p326a.p329d0.p334e.p337c;

import p120q.p326a.C11479k;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p333d.C10927i;

/* renamed from: q.a.d0.e.c.d */
/* compiled from: MaybeToObservable */
public final class C10959d<T> extends C11482n<T> {

    /* renamed from: q.a.d0.e.c.d$a */
    /* compiled from: MaybeToObservable */
    static final class C10960a<T> extends C10927i<T> implements C11479k<T> {

        /* renamed from: h */
        C10842c f29061h;

        C10960a(C11490u<? super T> uVar) {
            super(uVar);
        }

        public void dispose() {
            super.dispose();
            this.f29061h.dispose();
        }

        public void onComplete() {
            mo36714a();
        }

        public void onError(Throwable th) {
            mo36716a(th);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29061h, cVar)) {
                this.f29061h = cVar;
                this.f28987f.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36715a(t);
        }
    }

    /* renamed from: a */
    public static <T> C11479k<T> m36917a(C11490u<? super T> uVar) {
        return new C10960a(uVar);
    }
}
