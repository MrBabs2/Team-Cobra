package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C10481t;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9103b;
import kotlin.p215c0.p216c.C9104c;
import kotlin.p215c0.p216c.C9105d;
import kotlin.p215c0.p216c.C9106e;
import kotlin.p215c0.p216c.C9107f;
import kotlin.p215c0.p216c.C9108g;
import kotlin.p215c0.p216c.C9109h;
import kotlin.p215c0.p216c.C9110i;
import kotlin.p215c0.p216c.C9111j;
import kotlin.p215c0.p216c.C9112k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9114m;
import kotlin.p215c0.p216c.C9115n;
import kotlin.p215c0.p216c.C9116o;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p215c0.p216c.C9118q;
import kotlin.p215c0.p216c.C9119r;
import kotlin.p215c0.p216c.C9120s;
import kotlin.p215c0.p216c.C9121t;
import kotlin.p215c0.p216c.C9122u;
import kotlin.p215c0.p216c.C9123v;
import kotlin.p215c0.p216c.C9124w;
import kotlin.p262y.C10525m;
import kotlin.p391i0.C12079h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, mo16641d2 = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.b */
/* compiled from: reflectClassUtil.kt */
public final class C12029b {

    /* renamed from: a */
    private static final List<C9154c<? extends Object>> f31786a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f31787b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f31788c;

    /* renamed from: kotlin.h0.u.e.m0.b$a */
    /* compiled from: reflectClassUtil.kt */
    static final class C12030a extends C10203k implements C9113l<ParameterizedType, ParameterizedType> {

        /* renamed from: f */
        public static final C12030a f31789f = new C12030a();

        C12030a() {
            super(1);
        }

        /* renamed from: a */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            C10202j.m34178b(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (!(ownerType instanceof ParameterizedType)) {
                ownerType = null;
            }
            return (ParameterizedType) ownerType;
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.b$b */
    /* compiled from: reflectClassUtil.kt */
    static final class C12031b extends C10203k implements C9113l<ParameterizedType, C12079h<? extends Type>> {

        /* renamed from: f */
        public static final C12031b f31790f = new C12031b();

        C12031b() {
            super(1);
        }

        /* renamed from: a */
        public final C12079h<Type> invoke(ParameterizedType parameterizedType) {
            C10202j.m34178b(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C10202j.m34174a((Object) actualTypeArguments, "it.actualTypeArguments");
            return C10519k.m35643c((T[]) actualTypeArguments);
        }
    }

    static {
        int i = 0;
        List<C9154c<? extends Object>> b = C10529o.m35741b((T[]) new C9154c[]{C10216x.m34186a(Boolean.TYPE), C10216x.m34186a(Byte.TYPE), C10216x.m34186a(Character.TYPE), C10216x.m34186a(Double.TYPE), C10216x.m34186a(Float.TYPE), C10216x.m34186a(Integer.TYPE), C10216x.m34186a(Long.TYPE), C10216x.m34186a(Short.TYPE)});
        f31786a = b;
        ArrayList arrayList = new ArrayList(C10531p.m35750a(b, 10));
        for (C9154c cVar : b) {
            arrayList.add(C10481t.m35502a(C9100a.m29807b(cVar), C9100a.m29808c(cVar)));
        }
        f31787b = C10518j0.m35602a(arrayList);
        List<C9154c<? extends Object>> list = f31786a;
        ArrayList arrayList2 = new ArrayList(C10531p.m35750a(list, 10));
        for (C9154c cVar2 : list) {
            arrayList2.add(C10481t.m35502a(C9100a.m29808c(cVar2), C9100a.m29807b(cVar2)));
        }
        f31788c = C10518j0.m35602a(arrayList2);
        List b2 = C10529o.m35741b((T[]) new Class[]{C9102a.class, C9113l.class, C9117p.class, C9118q.class, C9119r.class, C9120s.class, C9121t.class, C9122u.class, C9123v.class, C9124w.class, C9103b.class, C9104c.class, C9105d.class, C9106e.class, C9107f.class, C9108g.class, C9109h.class, C9110i.class, C9111j.class, C9112k.class, C9114m.class, C9115n.class, C9116o.class});
        ArrayList arrayList3 = new ArrayList(C10531p.m35750a(b2, 10));
        for (Object next : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(C10481t.m35502a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C10525m.m35693c();
                throw null;
            }
        }
        Map<K, V> unused = C10518j0.m35602a(arrayList3);
    }

    /* renamed from: a */
    public static final Class<?> m39746a(Class<?> cls) {
        C10202j.m34178b(cls, "$this$createArrayType");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    public static final C9933a m39748b(Class<?> cls) {
        C9933a b;
        C9933a a;
        C10202j.m34178b(cls, "$this$classId");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C10202j.m34174a((Object) simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null && (b = m39748b(declaringClass)) != null && (a = b.mo34982a(C9939f.m33302b(cls.getSimpleName()))) != null) {
                        return a;
                    }
                    C9933a a2 = C9933a.m33260a(new C9934b(cls.getName()));
                    C10202j.m34174a((Object) a2, "ClassId.topLevel(FqName(name))");
                    return a2;
                }
            }
            C9934b bVar = new C9934b(cls.getName());
            return new C9933a(bVar.mo34998c(), C9934b.m33272c(bVar.mo35000e()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    /* renamed from: c */
    public static final String m39749c(Class<?> cls) {
        C10202j.m34178b(cls, "$this$desc");
        if (C10202j.m34176a((Object) cls, (Object) Void.TYPE)) {
            return "V";
        }
        String name = m39746a(cls).getName();
        C10202j.m34174a((Object) name, "createArrayType().name");
        if (name != null) {
            String substring = name.substring(1);
            C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return C12130v.m40043a(substring, '.', '/', false, 4, (Object) null);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public static final Class<?> m39750d(Class<?> cls) {
        C10202j.m34178b(cls, "$this$primitiveByWrapper");
        return f31787b.get(cls);
    }

    /* renamed from: e */
    public static final ClassLoader m39751e(Class<?> cls) {
        C10202j.m34178b(cls, "$this$safeClassLoader");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C10202j.m34174a((Object) systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: f */
    public static final Class<?> m39752f(Class<?> cls) {
        C10202j.m34178b(cls, "$this$wrapperByPrimitive");
        return f31788c.get(cls);
    }

    /* renamed from: g */
    public static final boolean m39753g(Class<?> cls) {
        C10202j.m34178b(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
        return Enum.class.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static final List<Type> m39747a(Type type) {
        C10202j.m34178b(type, "$this$parameterizedTypeArguments");
        if (!(type instanceof ParameterizedType)) {
            return C10529o.m35736a();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C12090n.m39931g(C12090n.m39924c(C12083l.m39906a(type, C12030a.f31789f), C12031b.f31790f));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C10202j.m34174a((Object) actualTypeArguments, "actualTypeArguments");
        return C10519k.m35653k(actualTypeArguments);
    }
}
