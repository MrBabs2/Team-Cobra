package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9839r0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0;

/* renamed from: kotlin.h0.u.e.k0.d.x0.k */
/* compiled from: VersionRequirement.kt */
public final class C9886k {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C9886k f27281b = new C9886k(C10529o.m35736a());

    /* renamed from: c */
    public static final C9887a f27282c = new C9887a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<C9839r0> f27283a;

    /* renamed from: kotlin.h0.u.e.k0.d.x0.k$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C9887a {
        private C9887a() {
        }

        /* renamed from: a */
        public final C9886k mo34868a() {
            return C9886k.f27281b;
        }

        public /* synthetic */ C9887a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9886k mo34869a(C9850t0 t0Var) {
            C10202j.m34178b(t0Var, "table");
            if (t0Var.mo34793i() == 0) {
                return mo34868a();
            }
            List<C9839r0> j = t0Var.mo34794j();
            C10202j.m34174a((Object) j, "table.requirementList");
            return new C9886k(j, (DefaultConstructorMarker) null);
        }
    }

    private C9886k(List<C9839r0> list) {
        this.f27283a = list;
    }

    public /* synthetic */ C9886k(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* renamed from: a */
    public final C9839r0 mo34867a(int i) {
        return (C9839r0) C10539w.m35792d(this.f27283a, i);
    }
}
