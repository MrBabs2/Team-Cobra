package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11758h;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11759i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;

/* renamed from: kotlin.h0.u.e.k0.c.b.f */
/* compiled from: JavaClassDataFinder.kt */
public final class C9709f implements C11759i {

    /* renamed from: a */
    private final C9719m f26689a;

    /* renamed from: b */
    private final C9706e f26690b;

    public C9709f(C9719m mVar, C9706e eVar) {
        C10202j.m34178b(mVar, "kotlinClassFinder");
        C10202j.m34178b(eVar, "deserializedDescriptorResolver");
        this.f26689a = mVar;
        this.f26690b = eVar;
    }

    /* renamed from: a */
    public C11758h mo34289a(C9933a aVar) {
        C10202j.m34178b(aVar, "classId");
        C9724o a = C9723n.m31362a(this.f26689a, aVar);
        if (a == null) {
            return null;
        }
        boolean a2 = C10202j.m34176a((Object) a.mo33665d(), (Object) aVar);
        if (!C10485x.f28360a || a2) {
            return this.f26690b.mo34284a(a);
        }
        throw new AssertionError("Class with incorrect id found: expected " + aVar + ", actual " + a.mo33665d());
    }
}
