package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9519f;
import kotlin.p045h0.p046u.p047e.p390m0.C12063w;

/* renamed from: kotlin.h0.u.e.m0.i */
/* compiled from: ReflectJavaArrayType.kt */
public final class C12040i extends C12063w implements C9519f {

    /* renamed from: b */
    private final C12063w f31796b;

    /* renamed from: c */
    private final Type f31797c;

    public C12040i(Type type) {
        C12063w wVar;
        C10202j.m34178b(type, "reflectType");
        this.f31797c = type;
        Type J = mo38672J();
        if (J instanceof GenericArrayType) {
            C12063w.C12064a aVar = C12063w.f31817a;
            Type genericComponentType = ((GenericArrayType) J).getGenericComponentType();
            C10202j.m34174a((Object) genericComponentType, "genericComponentType");
            wVar = aVar.mo38696a(genericComponentType);
        } else {
            if (J instanceof Class) {
                Class cls = (Class) J;
                if (cls.isArray()) {
                    C12063w.C12064a aVar2 = C12063w.f31817a;
                    Class<?> componentType = cls.getComponentType();
                    C10202j.m34174a((Object) componentType, "getComponentType()");
                    wVar = aVar2.mo38696a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo38672J().getClass() + "): " + mo38672J());
        }
        this.f31796b = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public Type mo38672J() {
        return this.f31797c;
    }

    /* renamed from: i */
    public C12063w m39773i() {
        return this.f31796b;
    }
}
