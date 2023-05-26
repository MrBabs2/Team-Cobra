package p123rx.p410p;

import p123rx.C12475j;
import p123rx.C5372f;

/* renamed from: rx.p.f */
/* compiled from: Subscribers */
public final class C12839f {

    /* renamed from: rx.p.f$a */
    /* compiled from: Subscribers */
    static class C12840a extends C12475j<T> {

        /* renamed from: f */
        final /* synthetic */ C5372f f33062f;

        C12840a(C5372f fVar) {
            this.f33062f = fVar;
        }

        public void onCompleted() {
            this.f33062f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f33062f.onError(th);
        }

        public void onNext(T t) {
            this.f33062f.onNext(t);
        }
    }

    /* renamed from: rx.p.f$b */
    /* compiled from: Subscribers */
    static class C12841b extends C12475j<T> {

        /* renamed from: f */
        final /* synthetic */ C12475j f33063f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12841b(C12475j jVar, C12475j jVar2) {
            super(jVar);
            this.f33063f = jVar2;
        }

        public void onCompleted() {
            this.f33063f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f33063f.onError(th);
        }

        public void onNext(T t) {
            this.f33063f.onNext(t);
        }
    }

    /* renamed from: a */
    public static <T> C12475j<T> m41392a() {
        return m41393a(C12832a.m41388a());
    }

    /* renamed from: a */
    public static <T> C12475j<T> m41393a(C5372f<? super T> fVar) {
        return new C12840a(fVar);
    }

    /* renamed from: a */
    public static <T> C12475j<T> m41394a(C12475j<? super T> jVar) {
        return new C12841b(jVar, jVar);
    }
}
