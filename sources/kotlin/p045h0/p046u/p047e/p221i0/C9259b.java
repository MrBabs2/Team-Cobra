package kotlin.p045h0.p046u.p047e.p221i0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C4789l;
import kotlin.C9134f;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10209q;
import kotlin.jvm.internal.C10210r;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10174x;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u0002"}, mo16641d2 = {"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i0.b */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C9259b {

    /* renamed from: a */
    static final /* synthetic */ C9168l[] f25821a;

    /* renamed from: kotlin.h0.u.e.i0.b$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C9260a extends C10203k implements C9113l<Object, Boolean> {

        /* renamed from: f */
        final /* synthetic */ Class f25822f;

        /* renamed from: g */
        final /* synthetic */ List f25823g;

        /* renamed from: h */
        final /* synthetic */ Map f25824h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9260a(Class cls, List list, Map map) {
            super(1);
            this.f25822f = cls;
            this.f25823g = list;
            this.f25824h = map;
        }

        public final boolean invoke(Object obj) {
            boolean z;
            boolean z2;
            C9154c a;
            Class cls = null;
            Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
            if (!(annotation == null || (a = C9100a.m29806a(annotation)) == null)) {
                cls = C9100a.m29804a(a);
            }
            if (C10202j.m34176a((Object) cls, (Object) this.f25822f)) {
                List list = this.f25823g;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Method method = (Method) it.next();
                        Object obj2 = this.f25824h.get(method.getName());
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(zArr, (boolean[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                            }
                        } else if (obj2 instanceof char[]) {
                            char[] cArr = (char[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(cArr, (char[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                            }
                        } else if (obj2 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(bArr, (byte[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        } else if (obj2 instanceof short[]) {
                            short[] sArr = (short[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(sArr, (short[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                            }
                        } else if (obj2 instanceof int[]) {
                            int[] iArr = (int[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(iArr, (int[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                            }
                        } else if (obj2 instanceof float[]) {
                            float[] fArr = (float[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(fArr, (float[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                            }
                        } else if (obj2 instanceof long[]) {
                            long[] jArr = (long[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(jArr, (long[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                            }
                        } else if (obj2 instanceof double[]) {
                            double[] dArr = (double[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(dArr, (double[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                            }
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(objArr, (Object[]) invoke);
                                continue;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                            }
                        } else {
                            z2 = C10202j.m34176a(obj2, invoke);
                            continue;
                        }
                        if (!z2) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.b$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C9261b extends C10203k implements C9102a<Integer> {

        /* renamed from: f */
        final /* synthetic */ Map f25825f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9261b(Map map) {
            super(0);
            this.f25825f = map;
        }

        public final int invoke() {
            int i;
            int i2 = 0;
            for (Map.Entry entry : this.f25825f.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    i = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    i = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    i = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    i = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    i = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    i = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    i = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    i = Arrays.hashCode((double[]) value);
                } else if (value instanceof Object[]) {
                    i = Arrays.hashCode((Object[]) value);
                } else {
                    i = value.hashCode();
                }
                i2 += i ^ (str.hashCode() * 127);
            }
            return i2;
        }
    }

    /* renamed from: kotlin.h0.u.e.i0.b$c */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C9262c implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class f25826a;

        /* renamed from: b */
        final /* synthetic */ C9134f f25827b;

        /* renamed from: c */
        final /* synthetic */ C9168l f25828c;

        /* renamed from: d */
        final /* synthetic */ C9134f f25829d;

        /* renamed from: e */
        final /* synthetic */ C9168l f25830e;

        /* renamed from: f */
        final /* synthetic */ C9260a f25831f;

        /* renamed from: g */
        final /* synthetic */ Map f25832g;

        C9262c(Class cls, C9134f fVar, C9168l lVar, C9134f fVar2, C9168l lVar2, C9260a aVar, Map map) {
            this.f25826a = cls;
            this.f25827b = fVar;
            this.f25828c = lVar;
            this.f25829d = fVar2;
            this.f25830e = lVar2;
            this.f25831f = aVar;
            this.f25832g = map;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            C10202j.m34174a((Object) method, "method");
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f25826a;
                        }
                    } else if (name.equals("hashCode")) {
                        return this.f25829d.getValue();
                    }
                } else if (name.equals("toString")) {
                    return this.f25827b.getValue();
                }
            }
            if (C10202j.m34176a((Object) name, (Object) "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.f25831f.invoke(C10519k.m35651i(objArr)));
            }
            if (this.f25832g.containsKey(name)) {
                return this.f25832g.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C10519k.m35653k(objArr));
            sb.append(')');
            throw new C10174x(sb.toString());
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "", "T", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.i0.b$d */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C9263d extends C10203k implements C9102a<String> {

        /* renamed from: f */
        final /* synthetic */ Class f25833f;

        /* renamed from: g */
        final /* synthetic */ Map f25834g;

        /* renamed from: kotlin.h0.u.e.i0.b$d$a */
        /* compiled from: AnnotationConstructorCaller.kt */
        static final class C9264a extends C10203k implements C9113l<Map.Entry<? extends String, ? extends Object>, String> {

            /* renamed from: f */
            public static final C9264a f25835f = new C9264a();

            C9264a() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(Map.Entry<String, ? extends Object> entry) {
                String str;
                C10202j.m34178b(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                } else {
                    str = value.toString();
                }
                return key + '=' + str;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9263d(Class cls, Map map) {
            super(0);
            this.f25833f = cls;
            this.f25834g = map;
        }

        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.f25833f.getCanonicalName());
            Appendable unused = C10539w.m35771a(this.f25834g.entrySet(), sb, ", ", "(", ")", 0, (CharSequence) null, C9264a.f25835f, 48, (Object) null);
            String sb2 = sb.toString();
            C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    static {
        Class<C9259b> cls = C9259b.class;
        f25821a = new C9168l[]{C10216x.m34191a((C10209q) new C10210r(C10216x.m34187a(cls, "kotlin-reflection"), "hashCode", "<v#0>")), C10216x.m34191a((C10209q) new C10210r(C10216x.m34187a(cls, "kotlin-reflection"), "toString", "<v#1>"))};
    }

    /* renamed from: a */
    public static final /* synthetic */ Void m30048a(int i, String str, Class cls) {
        m30050b(i, str, cls);
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Object m30049b(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C9154c) {
            obj = C9100a.m29804a((C9154c) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (!(objArr instanceof C9154c[])) {
                obj = objArr;
            } else if (obj != null) {
                C9154c[] cVarArr = (C9154c[]) obj;
                ArrayList arrayList = new ArrayList(cVarArr.length);
                for (C9154c a : cVarArr) {
                    arrayList.add(C9100a.m29804a(a));
                }
                obj = arrayList.toArray(new Class[0]);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m30046a(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = arrayList;
        }
        return m30045a(cls, (Map<String, ? extends Object>) map, (List<Method>) list);
    }

    /* renamed from: a */
    public static final <T> T m30045a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C10202j.m34178b(cls, "annotationClass");
        C10202j.m34178b(map, "values");
        C10202j.m34178b(list, "methods");
        C9260a aVar = new C9260a(cls, list, map);
        C9134f a = C10181i.m34134a(new C9261b(map));
        C9168l lVar = f25821a[0];
        C9134f a2 = C10181i.m34134a(new C9263d(cls, map));
        C9168l lVar2 = f25821a[1];
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C9262c(cls, a2, lVar2, a, lVar, aVar, map));
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: b */
    private static final Void m30050b(int i, String str, Class<?> cls) {
        C9154c<?> cVar;
        String str2;
        if (C10202j.m34176a((Object) cls, (Object) Class.class)) {
            cVar = C10216x.m34186a(C9154c.class);
        } else if (!cls.isArray() || !C10202j.m34176a((Object) cls.getComponentType(), (Object) Class.class)) {
            cVar = C9100a.m29805a(cls);
        } else {
            cVar = C10216x.m34186a(C9154c[].class);
        }
        if (C10202j.m34176a((Object) cVar.mo33511l(), (Object) C10216x.m34186a(Object[].class).mo33511l())) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.mo33511l());
            sb.append('<');
            Class<?> componentType = C9100a.m29804a(cVar).getComponentType();
            C10202j.m34174a((Object) componentType, "kotlinClass.java.componentType");
            sb.append(C9100a.m29805a(componentType).mo33511l());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = cVar.mo33511l();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + str2);
    }
}
