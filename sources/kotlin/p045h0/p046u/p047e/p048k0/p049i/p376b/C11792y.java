package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;

/* renamed from: kotlin.h0.u.e.k0.i.b.y */
/* compiled from: NameResolverUtil.kt */
public final class C11792y {
    /* renamed from: a */
    public static final C9933a m38824a(C9875c cVar, int i) {
        C10202j.m34178b(cVar, "$this$getClassId");
        C9933a a = C9933a.m33259a(cVar.mo34853a(i), cVar.mo34854b(i));
        C10202j.m34174a((Object) a, "ClassId.fromString(getQu… isLocalClassName(index))");
        return a;
    }

    /* renamed from: b */
    public static final C9939f m38825b(C9875c cVar, int i) {
        C10202j.m34178b(cVar, "$this$getName");
        C9939f a = C9939f.m33300a(cVar.getString(i));
        C10202j.m34174a((Object) a, "Name.guessByFirstCharacter(getString(index))");
        return a;
    }
}
