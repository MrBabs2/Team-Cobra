package p112n.p118g.p119b;

import p112n.p118g.p119b.C10718e;
import p123rx.C5368e;

/* renamed from: n.g.b.c */
/* compiled from: PublishRelay */
public class C5305c<T> extends C5306d<T, T> {

    /* renamed from: g */
    private final C10718e<T> f9514g;

    protected C5305c(C5368e.C5370a<T> aVar, C10718e<T> eVar) {
        super(aVar);
        this.f9514g = eVar;
    }

    /* renamed from: o */
    public static <T> C5305c<T> m10045o() {
        C10718e eVar = new C10718e();
        return new C5305c<>(eVar, eVar);
    }

    public void call(T t) {
        for (C10718e.C10720b onNext : this.f9514g.mo36379b()) {
            onNext.onNext(t);
        }
    }
}
