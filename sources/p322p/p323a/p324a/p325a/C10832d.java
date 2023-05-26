package p322p.p323a.p324a.p325a;

import p120q.p326a.C10837a;
import p120q.p326a.C10838a0;
import p120q.p326a.C10839b;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11496w;
import p120q.p326a.p329d0.p331b.C10910b;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p415t.p416a.C12934a;

/* renamed from: p.a.a.a.d */
/* compiled from: RxJavaInterop */
public final class C10832d {
    /* renamed from: a */
    public static <T> C11496w<T> m36726a(Single<T> single) {
        C10910b.m36861a(single, "source is null");
        return new C10833e(single);
    }

    /* renamed from: a */
    public static C10839b m36725a(C5328b bVar) {
        C10910b.m36861a(bVar, "source is null");
        return new C10826a(bVar);
    }

    /* renamed from: a */
    public static <T> C5368e<T> m36730a(C12934a<T> aVar) {
        C10910b.m36861a(aVar, "source is null");
        return C5368e.m10253b(new C10830c(aVar));
    }

    /* renamed from: a */
    public static <T> C5368e<T> m36729a(C11488s<T> sVar, C10837a aVar) {
        C10910b.m36861a(sVar, "source is null");
        C10910b.m36861a(aVar, "strategy is null");
        return m36730a(C11482n.wrap(sVar).toFlowable(aVar));
    }

    /* renamed from: a */
    public static <T> Single<T> m36727a(C10838a0<T> a0Var) {
        C10910b.m36861a(a0Var, "source is null");
        return Single.m10122a(new C10835f(a0Var));
    }

    /* renamed from: a */
    public static C5328b m36728a(C11450f fVar) {
        C10910b.m36861a(fVar, "source is null");
        return C5328b.m10158a((C5328b.C5366w) new C10828b(fVar));
    }
}
