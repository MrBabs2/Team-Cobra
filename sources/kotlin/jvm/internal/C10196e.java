package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.C4789l;
import kotlin.C9125d;
import kotlin.p045h0.C9154c;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.C9101b;
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

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001KB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010B\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020GH\u0016J\u0012\u0010H\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010J\u001a\u00020-H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R(\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0014\u001a\u0004\b2\u0010\u000bR\u0016\u00103\u001a\u0004\u0018\u00010-8VX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010/R \u00105\u001a\b\u0012\u0004\u0012\u0002060\b8VX\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0014\u001a\u0004\b8\u0010\u000bR \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR\u001c\u0010=\u001a\u0004\u0018\u00010>8VX\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010A¨\u0006L"}, mo16641d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "sealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "supertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "typeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "visibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.jvm.internal.e */
/* compiled from: ClassReference.kt */
public final class C10196e implements C9154c<Object>, C10195d {

    /* renamed from: g */
    private static final Map<Class<? extends C9125d<?>>, Integer> f27835g;

    /* renamed from: h */
    private static final HashMap<String, String> f27836h;

    /* renamed from: i */
    private static final HashMap<String, String> f27837i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final HashMap<String, String> f27838j;

    /* renamed from: k */
    public static final C10197a f27839k = new C10197a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final Class<?> f27840f;

    /* renamed from: kotlin.jvm.internal.e$a */
    /* compiled from: ClassReference.kt */
    public static final class C10197a {
        private C10197a() {
        }

        /* renamed from: a */
        public final String mo35372a(Class<?> cls) {
            String str;
            C10202j.m34178b(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                C10202j.m34174a((Object) componentType, "componentType");
                if (componentType.isPrimitive() && (str = (String) C10196e.f27838j.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 != null) {
                    return str2;
                }
                return "kotlin.Array";
            }
            String str3 = (String) C10196e.f27838j.get(cls.getName());
            return str3 != null ? str3 : cls.getCanonicalName();
        }

        public /* synthetic */ C10197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = 0;
        List b = C10529o.m35741b((T[]) new Class[]{C9102a.class, C9113l.class, C9117p.class, C9118q.class, C9119r.class, C9120s.class, C9121t.class, C9122u.class, C9123v.class, C9124w.class, C9103b.class, C9104c.class, C9105d.class, C9106e.class, C9107f.class, C9108g.class, C9109h.class, C9110i.class, C9111j.class, C9112k.class, C9114m.class, C9115n.class, C9116o.class});
        ArrayList arrayList = new ArrayList(C10531p.m35750a(b, 10));
        for (Object next : b) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(C10481t.m35502a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C10525m.m35693c();
                throw null;
            }
        }
        f27835g = C10518j0.m35602a(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f27836h = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f27837i = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f27836h);
        hashMap3.putAll(f27837i);
        Collection<String> values = f27836h.values();
        C10202j.m34174a((Object) values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C10202j.m34174a((Object) str, "kotlinName");
            sb.append(C12131w.m40092b(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C10221n a = C10481t.m35502a(sb2, str + ".Companion");
            hashMap3.put(a.mo35391c(), a.mo35392d());
        }
        for (Map.Entry next2 : f27835g.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f27838j = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10515i0.m35582a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C12131w.m40092b((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public C10196e(Class<?> cls) {
        C10202j.m34178b(cls, "jClass");
        this.f27840f = cls;
    }

    /* renamed from: f */
    private final Void m34157f() {
        throw new C9101b();
    }

    /* renamed from: a */
    public Class<?> mo33537a() {
        return this.f27840f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10196e) && C10202j.m34176a((Object) C9100a.m29807b(this), (Object) C9100a.m29807b((C9154c) obj));
    }

    public List<Annotation> getAnnotations() {
        m34157f();
        throw null;
    }

    public int hashCode() {
        return C9100a.m29807b(this).hashCode();
    }

    public boolean isAbstract() {
        m34157f();
        throw null;
    }

    /* renamed from: k */
    public boolean mo33510k() {
        m34157f();
        throw null;
    }

    /* renamed from: l */
    public String mo33511l() {
        return f27839k.mo35372a(mo33537a());
    }

    /* renamed from: m */
    public Object mo33512m() {
        m34157f();
        throw null;
    }

    /* renamed from: n */
    public boolean mo33513n() {
        m34157f();
        throw null;
    }

    public String toString() {
        return mo33537a().toString() + " (Kotlin reflection is not available)";
    }
}
