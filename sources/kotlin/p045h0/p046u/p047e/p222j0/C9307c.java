package kotlin.p045h0.p046u.p047e.p222j0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10036f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.C9100a;

/* renamed from: kotlin.h0.u.e.j0.c */
/* compiled from: ReflectKotlinClass.kt */
final class C9307c {

    /* renamed from: a */
    public static final C9307c f25875a = new C9307c();

    private C9307c() {
    }

    /* renamed from: b */
    private final void m30104b(Class<?> cls, C9724o.C9728d dVar) {
        int i;
        Constructor[] constructorArr;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            C9939f d = C9939f.m33304d("<init>");
            C10202j.m34174a((Object) d, "Name.special(\"<init>\")");
            C9320m mVar = C9320m.f25888a;
            C10202j.m34174a((Object) constructor, "constructor");
            C9724o.C9729e a = dVar.mo34253a(d, mVar.mo33683a((Constructor<?>) constructor));
            if (a != null) {
                for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                    C10202j.m34174a((Object) annotation, "annotation");
                    m30103a((C9724o.C9727c) a, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C10202j.m34174a((Object) parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class a2 = C9100a.m29804a(C9100a.m29806a(annotation2));
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            C9933a b = C12029b.m39748b(a2);
                            int i6 = length2;
                            C10202j.m34174a((Object) annotation2, "annotation");
                            C9724o.C9725a a3 = a.mo34254a(i3 + length2, b, new C9306b(annotation2));
                            if (a3 != null) {
                                f25875a.m30101a(a3, annotation2, (Class<?>) a2);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                            length2 = i6;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i7 = length;
                        int i8 = length2;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                a.mo34256a();
            } else {
                constructorArr = declaredConstructors;
                i = length;
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: c */
    private final void m30105c(Class<?> cls, C9724o.C9728d dVar) {
        for (Field field : cls.getDeclaredFields()) {
            C10202j.m34174a((Object) field, "field");
            C9939f b = C9939f.m33302b(field.getName());
            C10202j.m34174a((Object) b, "Name.identifier(field.name)");
            C9724o.C9727c a = dVar.mo34252a(b, C9320m.f25888a.mo33684a(field), (Object) null);
            if (a != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    C10202j.m34174a((Object) annotation, "annotation");
                    m30103a(a, annotation);
                }
                a.mo34256a();
            }
        }
    }

    /* renamed from: d */
    private final void m30106d(Class<?> cls, C9724o.C9728d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C10202j.m34174a((Object) method, "method");
            C9939f b = C9939f.m33302b(method.getName());
            C10202j.m34174a((Object) b, "Name.identifier(method.name)");
            C9724o.C9729e a = dVar.mo34253a(b, C9320m.f25888a.mo33685a(method));
            if (a != null) {
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    C10202j.m34174a((Object) annotation, "annotation");
                    m30103a((C9724o.C9727c) a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C10202j.m34174a((Object) parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotationArr = parameterAnnotations[i2];
                    int length3 = annotationArr.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotationArr[i3];
                        Class a2 = C9100a.m29804a(C9100a.m29806a(annotation2));
                        C9933a b2 = C12029b.m39748b(a2);
                        Method[] methodArr2 = declaredMethods;
                        C10202j.m34174a((Object) annotation2, "annotation");
                        C9724o.C9725a a3 = a.mo34254a(i2, b2, new C9306b(annotation2));
                        if (a3 != null) {
                            f25875a.m30101a(a3, annotation2, (Class<?>) a2);
                        }
                        i3++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                a.mo34256a();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: a */
    public final void mo33656a(Class<?> cls, C9724o.C9727c cVar) {
        C10202j.m34178b(cls, "klass");
        C10202j.m34178b(cVar, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            C10202j.m34174a((Object) annotation, "annotation");
            m30103a(cVar, annotation);
        }
        cVar.mo34256a();
    }

    /* renamed from: a */
    public final void mo33657a(Class<?> cls, C9724o.C9728d dVar) {
        C10202j.m34178b(cls, "klass");
        C10202j.m34178b(dVar, "memberVisitor");
        m30106d(cls, dVar);
        m30104b(cls, dVar);
        m30105c(cls, dVar);
    }

    /* renamed from: a */
    private final void m30103a(C9724o.C9727c cVar, Annotation annotation) {
        Class a = C9100a.m29804a(C9100a.m29806a(annotation));
        C9724o.C9725a a2 = cVar.mo34255a(C12029b.m39748b(a), new C9306b(annotation));
        if (a2 != null) {
            f25875a.m30101a(a2, annotation, (Class<?>) a);
        }
    }

    /* renamed from: a */
    private final void m30101a(C9724o.C9725a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke != null) {
                    C10202j.m34174a((Object) method, "method");
                    C9939f b = C9939f.m33302b(method.getName());
                    C10202j.m34174a((Object) b, "Name.identifier(method.name)");
                    m30102a(aVar, b, invoke);
                    i++;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo34277a();
    }

    /* renamed from: a */
    private final C10036f m30100a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C10202j.m34174a((Object) cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C9933a b = C12029b.m39748b(cls);
            C9367c cVar = C9367c.f26064m;
            C9934b a = b.mo34983a();
            C10202j.m34174a((Object) a, "javaClassId.asSingleFqName()");
            C9933a a2 = cVar.mo33800a(a);
            if (a2 != null) {
                b = a2;
            }
            return new C10036f(b, i);
        } else if (C10202j.m34176a((Object) cls, (Object) Void.TYPE)) {
            C9933a a3 = C9933a.m33260a(C9333g.f25907k.f25950d.mo35016h());
            C10202j.m34174a((Object) a3, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new C10036f(a3, i);
        } else {
            C10081d a4 = C10081d.m33928a(cls.getName());
            C10202j.m34174a((Object) a4, "JvmPrimitiveType.get(currentClass.name)");
            C9340h e = a4.mo35289e();
            C10202j.m34174a((Object) e, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                C9933a a5 = C9933a.m33260a(e.mo33732a());
                C10202j.m34174a((Object) a5, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                return new C10036f(a5, i - 1);
            }
            C9933a a6 = C9933a.m33260a(e.mo33734e());
            C10202j.m34174a((Object) a6, "ClassId.topLevel(primitiveType.typeFqName)");
            return new C10036f(a6, i);
        }
    }

    /* renamed from: a */
    private final void m30102a(C9724o.C9725a aVar, C9939f fVar, Object obj) {
        Class<?> cls = obj.getClass();
        if (C10202j.m34176a((Object) cls, (Object) Class.class)) {
            if (obj != null) {
                aVar.mo34280a(fVar, m30100a((Class) obj));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
        } else if (C9314i.f25881a.contains(cls)) {
            aVar.mo34278a(fVar, obj);
        } else if (C12029b.m39753g(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C10202j.m34174a((Object) cls, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
            C9933a b = C12029b.m39748b(cls);
            if (obj != null) {
                C9939f b2 = C9939f.m33302b(((Enum) obj).name());
                C10202j.m34174a((Object) b2, "Name.identifier((value as Enum<*>).name)");
                aVar.mo34279a(fVar, b, b2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class[] interfaces = cls.getInterfaces();
            C10202j.m34174a((Object) interfaces, "clazz.interfaces");
            Class cls2 = (Class) C10519k.m35651i(interfaces);
            C10202j.m34174a((Object) cls2, "annotationClass");
            C9724o.C9725a a = aVar.mo34275a(fVar, C12029b.m39748b(cls2));
            if (a == null) {
                return;
            }
            if (obj != null) {
                m30101a(a, (Annotation) obj, (Class<?>) cls2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Annotation");
        } else if (cls.isArray()) {
            C9724o.C9726b a2 = aVar.mo34276a(fVar);
            if (a2 != null) {
                Class<?> componentType = cls.getComponentType();
                C10202j.m34174a((Object) componentType, "componentType");
                int i = 0;
                if (componentType.isEnum()) {
                    C9933a b3 = C12029b.m39748b(componentType);
                    if (obj != null) {
                        Object[] objArr = (Object[]) obj;
                        int length = objArr.length;
                        while (i < length) {
                            Object obj2 = objArr[i];
                            if (obj2 != null) {
                                C9939f b4 = C9939f.m33302b(((Enum) obj2).name());
                                C10202j.m34174a((Object) b4, "Name.identifier((element as Enum<*>).name)");
                                a2.mo34272a(b3, b4);
                                i++;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                } else if (C10202j.m34176a((Object) componentType, (Object) Class.class)) {
                    if (obj != null) {
                        Object[] objArr2 = (Object[]) obj;
                        int length2 = objArr2.length;
                        while (i < length2) {
                            Object obj3 = objArr2[i];
                            if (obj3 != null) {
                                a2.mo34273a(m30100a((Class) obj3));
                                i++;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                } else if (obj != null) {
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        a2.mo34271a(objArr3[i]);
                        i++;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                }
                a2.mo34270a();
            }
        } else {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
    }
}
