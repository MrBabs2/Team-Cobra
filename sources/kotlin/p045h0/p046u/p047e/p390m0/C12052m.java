package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9524k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9539y;

/* renamed from: kotlin.h0.u.e.m0.m */
/* compiled from: ReflectJavaConstructor.kt */
public final class C12052m extends C12057r implements C9524k {

    /* renamed from: a */
    private final Constructor<?> f31810a;

    public C12052m(Constructor<?> constructor) {
        C10202j.m34178b(constructor, "member");
        this.f31810a = constructor;
    }

    /* renamed from: f */
    public List<C9539y> mo34049f() {
        Type[] genericParameterTypes = m39818i().getGenericParameterTypes();
        C10202j.m34174a((Object) genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C10529o.m35736a();
        }
        Class<?> declaringClass = m39818i().getDeclaringClass();
        C10202j.m34174a((Object) declaringClass, "klass");
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C10516j.m35593a(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = m39818i().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C10202j.m34174a((Object) parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C10516j.m35593a(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C10202j.m34174a((Object) genericParameterTypes, "realTypes");
            C10202j.m34174a((Object) parameterAnnotations, "realAnnotations");
            return mo38686a(genericParameterTypes, parameterAnnotations, m39818i().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + m39818i());
    }

    public List<C12065x> getTypeParameters() {
        TypeVariable[] typeParameters = m39818i().getTypeParameters();
        C10202j.m34174a((Object) typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new C12065x(xVar));
        }
        return arrayList;
    }

    /* renamed from: i */
    public Constructor<?> m39818i() {
        return this.f31810a;
    }
}
