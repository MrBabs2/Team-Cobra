package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9530q;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9539y;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p390m0.C12063w;

/* renamed from: kotlin.h0.u.e.m0.s */
/* compiled from: ReflectJavaMethod.kt */
public final class C12058s extends C12057r implements C9530q {

    /* renamed from: a */
    private final Method f31814a;

    public C12058s(Method method) {
        C10202j.m34178b(method, "member");
        this.f31814a = method;
    }

    /* renamed from: E */
    public boolean mo34057E() {
        return C9530q.C9531a.m30863a(this);
    }

    /* renamed from: f */
    public List<C9539y> mo34058f() {
        Type[] genericParameterTypes = mo38685i().getGenericParameterTypes();
        C10202j.m34174a((Object) genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo38685i().getParameterAnnotations();
        C10202j.m34174a((Object) parameterAnnotations, "member.parameterAnnotations");
        return mo38686a(genericParameterTypes, parameterAnnotations, mo38685i().isVarArgs());
    }

    public List<C12065x> getTypeParameters() {
        TypeVariable[] typeParameters = mo38685i().getTypeParameters();
        C10202j.m34174a((Object) typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new C12065x(xVar));
        }
        return arrayList;
    }

    /* renamed from: m */
    public C9515b mo34060m() {
        Object defaultValue = mo38685i().getDefaultValue();
        if (defaultValue != null) {
            return C12033d.f31792b.mo38670a(defaultValue, (C9939f) null);
        }
        return null;
    }

    public C12063w getReturnType() {
        C12063w.C12064a aVar = C12063w.f31817a;
        Type genericReturnType = mo38685i().getGenericReturnType();
        C10202j.m34174a((Object) genericReturnType, "member.genericReturnType");
        return aVar.mo38696a(genericReturnType);
    }

    /* renamed from: i */
    public Method m39838i() {
        return this.f31814a;
    }
}
