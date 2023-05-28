package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import java.util.Set;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.n */
/* compiled from: signatureEnhancement.kt */
public final class C9603n {
    /* renamed from: a */
    public static final C9550d m30983a(C9554g gVar, C9552e eVar, boolean z, boolean z2) {
        if (!z2 || gVar != C9554g.NOT_NULL) {
            return new C9550d(gVar, eVar, false, z);
        }
        return new C9550d(gVar, eVar, true, z);
    }

    /* renamed from: a */
    public static final <T> T m30982a(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<T> q;
        C10202j.m34178b(set, "$this$select");
        C10202j.m34178b(t, "low");
        C10202j.m34178b(t2, "high");
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (!C10202j.m34176a((Object) t4, (Object) t) || !C10202j.m34176a((Object) t3, (Object) t2)) {
                return t3 != null ? t3 : t4;
            }
            return null;
        }
        if (!(t3 == null || (q = C10539w.m35818q(C10532p0.m35755a(set, t3))) == null)) {
            set = q;
        }
        return C10539w.m35812k(set);
    }

    /* renamed from: a */
    public static final C9554g m30984a(Set<? extends C9554g> set, C9554g gVar, boolean z) {
        C10202j.m34178b(set, "$this$select");
        C9554g gVar2 = C9554g.FORCE_FLEXIBILITY;
        return gVar == gVar2 ? gVar2 : (C9554g) m30982a(set, C9554g.NOT_NULL, C9554g.NULLABLE, gVar, z);
    }
}
