package kotlin;

import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.i */
/* compiled from: LazyJVM.kt */
class C10181i {
    /* renamed from: a */
    public static <T> C9134f<T> m34134a(C9102a<? extends T> aVar) {
        C10202j.m34178b(aVar, "initializer");
        return new C10228r(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static <T> C9134f<T> m34135a(C10219k kVar, C9102a<? extends T> aVar) {
        C10202j.m34178b(kVar, "mode");
        C10202j.m34178b(aVar, "initializer");
        int i = C9142g.f25679a[kVar.ordinal()];
        if (i == 1) {
            return new C10228r(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new C10226q(aVar);
        }
        if (i == 3) {
            return new C10484w(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
