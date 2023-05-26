package kotlin.p045h0.p046u.p047e.p222j0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.j0.h */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C9313h {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m30124b(C9933a aVar) {
        String a = aVar.mo34987e().mo34994a();
        C10202j.m34174a((Object) a, "relativeClassName.asString()");
        String a2 = C12130v.m40043a(a, '.', '$', false, 4, (Object) null);
        C9934b d = aVar.mo34986d();
        C10202j.m34174a((Object) d, "packageFqName");
        if (d.mo34996b()) {
            return a2;
        }
        return aVar.mo34986d() + '.' + a2;
    }
}
