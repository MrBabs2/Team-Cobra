package kotlin.p045h0.p046u.p047e.p390m0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9535u;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;

/* renamed from: kotlin.h0.u.e.m0.v */
/* compiled from: ReflectJavaPrimitiveType.kt */
public final class C12062v extends C12063w implements C9535u {

    /* renamed from: b */
    private final Class<?> f31816b;

    public C12062v(Class<?> cls) {
        C10202j.m34178b(cls, "reflectType");
        this.f31816b = cls;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public Class<?> m39851J() {
        return this.f31816b;
    }

    public C9340h getType() {
        if (C10202j.m34176a((Object) m39851J(), (Object) Void.TYPE)) {
            return null;
        }
        C10081d a = C10081d.m33928a(m39851J().getName());
        C10202j.m34174a((Object) a, "JvmPrimitiveType.get(reflectType.name)");
        return a.mo35289e();
    }
}
