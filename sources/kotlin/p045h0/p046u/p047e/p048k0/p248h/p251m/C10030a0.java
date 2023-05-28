package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.h.m.a0 */
/* compiled from: constantValues.kt */
public final class C10030a0 extends C10032b0<Short> {
    public C10030a0(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: a */
    public C11824b0 mo35235a(C10393y yVar) {
        C11901j0 o;
        C10202j.m34178b(yVar, "module");
        C9933a aVar = C9333g.f25907k.f25953e0;
        C10202j.m34174a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.uShort");
        C10342e a = C10376t.m35016a(yVar, aVar);
        if (a != null && (o = a.mo35445o()) != null) {
            return o;
        }
        C11901j0 c = C11958u.m39559c("Unsigned type UShort not found");
        C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy…d type UShort not found\")");
        return c;
    }

    public String toString() {
        return ((Number) mo35244a()).shortValue() + ".toUShort()";
    }
}
