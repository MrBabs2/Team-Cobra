package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11907f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11916o;

/* renamed from: kotlin.h0.u.e.k0.k.d */
/* compiled from: AbstractStrictEqualityTypeChecker.kt */
public final class C11829d {

    /* renamed from: a */
    public static final C11829d f31532a = new C11829d();

    private C11829d() {
    }

    /* renamed from: b */
    private final boolean m38956b(C11916o oVar, C11908g gVar, C11908g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        C11910i a = oVar.mo38499a(gVar);
        C11910i a2 = oVar.mo38499a(gVar2);
        if (a != null && a2 != null) {
            return m38955a(oVar, a, a2);
        }
        C11907f d = oVar.mo38519d(gVar);
        C11907f d2 = oVar.mo38519d(gVar2);
        if (d == null || d2 == null || !m38955a(oVar, oVar.mo38518c(d), oVar.mo38518c(d2)) || !m38955a(oVar, oVar.mo38498a(d), oVar.mo38498a(d2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo38445a(C11916o oVar, C11908g gVar, C11908g gVar2) {
        C10202j.m34178b(oVar, "context");
        C10202j.m34178b(gVar, "a");
        C10202j.m34178b(gVar2, "b");
        return m38956b(oVar, gVar, gVar2);
    }

    /* renamed from: a */
    private final boolean m38955a(C11916o oVar, C11910i iVar, C11910i iVar2) {
        if (oVar.mo38510b((C11908g) iVar) == oVar.mo38510b((C11908g) iVar2) && oVar.mo38522e(iVar) == oVar.mo38522e(iVar2)) {
            if ((oVar.mo38530h(iVar) == null) == (oVar.mo38530h(iVar2) == null) && oVar.mo38508a(oVar.mo38503a(iVar), oVar.mo38503a(iVar2))) {
                if (oVar.mo38506a(iVar, iVar2)) {
                    return true;
                }
                int b = oVar.mo38510b((C11908g) iVar);
                for (int i = 0; i < b; i++) {
                    C11912k a = oVar.mo38502a((C11908g) iVar, i);
                    C11912k a2 = oVar.mo38502a((C11908g) iVar2, i);
                    if (oVar.mo38507a(a) != oVar.mo38507a(a2)) {
                        return false;
                    }
                    if (!oVar.mo38507a(a) && (oVar.mo38513b(a) != oVar.mo38513b(a2) || !m38956b(oVar, oVar.mo38517c(a), oVar.mo38517c(a2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
