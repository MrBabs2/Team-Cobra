package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9540z;
import kotlin.p045h0.p046u.p047e.p390m0.C12063w;

/* renamed from: kotlin.h0.u.e.m0.z */
/* compiled from: ReflectJavaWildcardType.kt */
public final class C12067z extends C12063w implements C9540z {

    /* renamed from: b */
    private final WildcardType f31823b;

    public C12067z(WildcardType wildcardType) {
        C10202j.m34178b(wildcardType, "reflectType");
        this.f31823b = wildcardType;
    }

    /* renamed from: C */
    public boolean mo34075C() {
        Type[] upperBounds = mo38672J().getUpperBounds();
        C10202j.m34174a((Object) upperBounds, "reflectType.upperBounds");
        return !C10202j.m34176a((Object) (Type) C10519k.m35648f(upperBounds), (Object) Object.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public WildcardType m39864J() {
        return this.f31823b;
    }

    /* renamed from: u */
    public C12063w m39866u() {
        Type[] upperBounds = mo38672J().getUpperBounds();
        Type[] lowerBounds = mo38672J().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo38672J());
        } else if (lowerBounds.length == 1) {
            C12063w.C12064a aVar = C12063w.f31817a;
            C10202j.m34174a((Object) lowerBounds, "lowerBounds");
            Object i = C10519k.m35651i(lowerBounds);
            C10202j.m34174a(i, "lowerBounds.single()");
            return aVar.mo38696a((Type) i);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            C10202j.m34174a((Object) upperBounds, "upperBounds");
            Type type = (Type) C10519k.m35651i(upperBounds);
            if (!(!C10202j.m34176a((Object) type, (Object) Object.class))) {
                return null;
            }
            C12063w.C12064a aVar2 = C12063w.f31817a;
            C10202j.m34174a((Object) type, "ub");
            return aVar2.mo38696a(type);
        }
    }
}
