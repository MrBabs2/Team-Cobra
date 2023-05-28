package p123rx.p127s;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p410p.C12836d;

/* renamed from: rx.s.c */
/* compiled from: SerializedSubject */
public class C12874c<T, R> extends C5382d<T, R> {

    /* renamed from: g */
    private final C12836d<T> f33103g;

    /* renamed from: rx.s.c$a */
    /* compiled from: SerializedSubject */
    class C12875a implements C5368e.C5370a<R> {

        /* renamed from: f */
        final /* synthetic */ C5382d f33104f;

        C12875a(C5382d dVar) {
            this.f33104f = dVar;
        }

        /* renamed from: a */
        public void call(C12475j<? super R> jVar) {
            this.f33104f.mo18668b(jVar);
        }
    }

    public C12874c(C5382d<T, R> dVar) {
        super(new C12875a(dVar));
        this.f33103g = new C12836d<>(dVar);
    }

    public void onCompleted() {
        this.f33103g.onCompleted();
    }

    public void onError(Throwable th) {
        this.f33103g.onError(th);
    }

    public void onNext(T t) {
        this.f33103g.onNext(t);
    }
}
