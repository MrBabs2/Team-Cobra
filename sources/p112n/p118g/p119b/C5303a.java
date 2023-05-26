package p112n.p118g.p119b;

import p112n.p118g.p119b.C10718e;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: n.g.b.a */
/* compiled from: BehaviorRelay */
public class C5303a<T> extends C5306d<T, T> {

    /* renamed from: h */
    private static final Object[] f9511h = new Object[0];

    /* renamed from: g */
    private final C10718e<T> f9512g;

    /* renamed from: n.g.b.a$a */
    /* compiled from: BehaviorRelay */
    static class C5304a implements C5378b<C10718e.C10720b<T>> {

        /* renamed from: f */
        final /* synthetic */ C10718e f9513f;

        C5304a(C10718e eVar) {
            this.f9513f = eVar;
        }

        /* renamed from: a */
        public void call(C10718e.C10720b<T> bVar) {
            bVar.mo36380a(this.f9513f.mo36374a());
        }
    }

    protected C5303a(C5368e.C5370a<T> aVar, C10718e<T> eVar) {
        super(aVar);
        this.f9512g = eVar;
    }

    /* renamed from: a */
    private static <T> C5303a<T> m10042a(T t, boolean z) {
        C10718e eVar = new C10718e();
        if (z) {
            eVar.mo36378b(C10716b.m36236a(t));
        }
        eVar.f28742i = new C5304a(eVar);
        return new C5303a<>(eVar, eVar);
    }

    /* renamed from: o */
    public static <T> C5303a<T> m10043o() {
        return m10042a((Object) null, false);
    }

    public void call(T t) {
        if (this.f9512g.mo36374a() == null || this.f9512g.f28740g) {
            Object a = C10716b.m36236a(t);
            for (C10718e.C10720b b : this.f9512g.mo36377a(a)) {
                b.mo36381b(a);
            }
        }
    }
}
