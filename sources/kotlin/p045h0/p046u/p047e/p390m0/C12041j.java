package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10216x;
import kotlin.jvm.internal.C10218z;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9514a0;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9523j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p390m0.C12036f;
import kotlin.p045h0.p046u.p047e.p390m0.C12059t;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.j */
/* compiled from: ReflectJavaClass.kt */
public final class C12041j extends C12053n implements C9520g, C12036f, C12059t {

    /* renamed from: a */
    private final Class<?> f31798a;

    /* renamed from: kotlin.h0.u.e.m0.j$a */
    /* compiled from: ReflectJavaClass.kt */
    static final /* synthetic */ class C12042a extends C10200h implements C9113l<Member, Boolean> {

        /* renamed from: g */
        public static final C12042a f31799g = new C12042a();

        C12042a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo38677a(Member member) {
            C10202j.m34178b(member, "p1");
            return member.isSynthetic();
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo38677a((Member) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$b */
    /* compiled from: ReflectJavaClass.kt */
    static final /* synthetic */ class C12043b extends C10200h implements C9113l<Constructor<?>, C12052m> {

        /* renamed from: g */
        public static final C12043b f31800g = new C12043b();

        C12043b() {
            super(1);
        }

        /* renamed from: a */
        public final C12052m invoke(Constructor<?> constructor) {
            C10202j.m34178b(constructor, "p1");
            return new C12052m(constructor);
        }

        public final String getName() {
            return "<init>";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C12052m.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$c */
    /* compiled from: ReflectJavaClass.kt */
    static final /* synthetic */ class C12044c extends C10200h implements C9113l<Member, Boolean> {

        /* renamed from: g */
        public static final C12044c f31801g = new C12044c();

        C12044c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo38679a(Member member) {
            C10202j.m34178b(member, "p1");
            return member.isSynthetic();
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo38679a((Member) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$d */
    /* compiled from: ReflectJavaClass.kt */
    static final /* synthetic */ class C12045d extends C10200h implements C9113l<Field, C12055p> {

        /* renamed from: g */
        public static final C12045d f31802g = new C12045d();

        C12045d() {
            super(1);
        }

        /* renamed from: a */
        public final C12055p invoke(Field field) {
            C10202j.m34178b(field, "p1");
            return new C12055p(field);
        }

        public final String getName() {
            return "<init>";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C12055p.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$e */
    /* compiled from: ReflectJavaClass.kt */
    static final class C12046e extends C10203k implements C9113l<Class<?>, Boolean> {

        /* renamed from: f */
        public static final C12046e f31803f = new C12046e();

        C12046e() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo38681a(Class<?> cls) {
            C10202j.m34174a((Object) cls, "it");
            String simpleName = cls.getSimpleName();
            C10202j.m34174a((Object) simpleName, "it.simpleName");
            return simpleName.length() == 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo38681a((Class) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$f */
    /* compiled from: ReflectJavaClass.kt */
    static final class C12047f extends C10203k implements C9113l<Class<?>, C9939f> {

        /* renamed from: f */
        public static final C12047f f31804f = new C12047f();

        C12047f() {
            super(1);
        }

        /* renamed from: a */
        public final C9939f invoke(Class<?> cls) {
            C10202j.m34174a((Object) cls, "it");
            String simpleName = cls.getSimpleName();
            if (!C9939f.m33303c(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C9939f.m33302b(simpleName);
            }
            return null;
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$g */
    /* compiled from: ReflectJavaClass.kt */
    static final class C12048g extends C10203k implements C9113l<Method, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C12041j f31805f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12048g(C12041j jVar) {
            super(1);
            this.f31805f = jVar;
        }

        /* renamed from: a */
        public final boolean mo38683a(Method method) {
            C10202j.m34174a((Object) method, "method");
            return !method.isSynthetic() && (!this.f31805f.mo34040t() || !this.f31805f.m39774a(method));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo38683a((Method) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.m0.j$h */
    /* compiled from: ReflectJavaClass.kt */
    static final /* synthetic */ class C12049h extends C10200h implements C9113l<Method, C12058s> {

        /* renamed from: g */
        public static final C12049h f31806g = new C12049h();

        C12049h() {
            super(1);
        }

        /* renamed from: a */
        public final C12058s invoke(Method method) {
            C10202j.m34178b(method, "p1");
            return new C12058s(method);
        }

        public final String getName() {
            return "<init>";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C12058s.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public C12041j(Class<?> cls) {
        C10202j.m34178b(cls, "klass");
        this.f31798a = cls;
    }

    /* renamed from: B */
    public C9514a0 mo34032B() {
        return null;
    }

    /* renamed from: I */
    public boolean mo34061I() {
        return C12059t.C12060a.m39844d(this);
    }

    /* renamed from: c */
    public C9934b mo34036c() {
        C9934b a = C12029b.m39748b(this.f31798a).mo34983a();
        C10202j.m34174a((Object) a, "klass.classId.asSingleFqName()");
        return a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12041j) && C10202j.m34176a((Object) this.f31798a, (Object) ((C12041j) obj).f31798a);
    }

    public C9939f getName() {
        C9939f b = C9939f.m33302b(this.f31798a.getSimpleName());
        C10202j.m34174a((Object) b, "Name.identifier(klass.simpleName)");
        return b;
    }

    public List<C12065x> getTypeParameters() {
        TypeVariable[] typeParameters = this.f31798a.getTypeParameters();
        C10202j.m34174a((Object) typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new C12065x(xVar));
        }
        return arrayList;
    }

    public C10237a1 getVisibility() {
        return C12059t.C12060a.m39841a(this);
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return C12036f.C12037a.m39767b(this);
    }

    public int hashCode() {
        return this.f31798a.hashCode();
    }

    public boolean isAbstract() {
        return C12059t.C12060a.m39842b(this);
    }

    public boolean isFinal() {
        return C12059t.C12060a.m39843c(this);
    }

    /* renamed from: l */
    public boolean mo34039l() {
        return this.f31798a.isAnnotation();
    }

    /* renamed from: t */
    public boolean mo34040t() {
        return this.f31798a.isEnum();
    }

    public String toString() {
        return C12041j.class.getName() + ": " + this.f31798a;
    }

    /* renamed from: w */
    public int mo38676w() {
        return this.f31798a.getModifiers();
    }

    /* renamed from: z */
    public boolean mo34042z() {
        return this.f31798a.isInterface();
    }

    /* renamed from: D */
    public List<C9939f> m39778D() {
        Class[] declaredClasses = this.f31798a.getDeclaredClasses();
        C10202j.m34174a((Object) declaredClasses, "klass.declaredClasses");
        return C12090n.m39931g(C12090n.m39928e(C12090n.m39922b(C10519k.m35643c((T[]) declaredClasses), C12046e.f31803f), C12047f.f31804f));
    }

    /* renamed from: F */
    public List<C12058s> m39780F() {
        Method[] declaredMethods = this.f31798a.getDeclaredMethods();
        C10202j.m34174a((Object) declaredMethods, "klass.declaredMethods");
        return C12090n.m39931g(C12090n.m39926d(C12090n.m39921a(C10519k.m35643c((T[]) declaredMethods), new C12048g(this)), C12049h.f31806g));
    }

    /* renamed from: g */
    public C12041j m39787g() {
        Class<?> declaringClass = this.f31798a.getDeclaringClass();
        if (declaringClass != null) {
            return new C12041j(declaringClass);
        }
        return null;
    }

    public List<C12032c> getAnnotations() {
        return C12036f.C12037a.m39765a(this);
    }

    /* renamed from: j */
    public List<C12052m> m39790j() {
        Constructor[] declaredConstructors = this.f31798a.getDeclaredConstructors();
        C10202j.m34174a((Object) declaredConstructors, "klass.declaredConstructors");
        return C12090n.m39931g(C12090n.m39926d(C12090n.m39922b(C10519k.m35643c((T[]) declaredConstructors), C12042a.f31799g), C12043b.f31800g));
    }

    /* renamed from: o */
    public Class<?> m39793o() {
        return this.f31798a;
    }

    /* renamed from: v */
    public List<C12055p> m39796v() {
        Field[] declaredFields = this.f31798a.getDeclaredFields();
        C10202j.m34174a((Object) declaredFields, "klass.declaredFields");
        return C12090n.m39931g(C12090n.m39926d(C12090n.m39922b(C10519k.m35643c((T[]) declaredFields), C12044c.f31801g), C12045d.f31802g));
    }

    /* renamed from: a */
    public C12032c m39784a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C12036f.C12037a.m39766a(this, bVar);
    }

    /* renamed from: a */
    public Collection<C9523j> mo34035a() {
        Type type = Object.class;
        if (C10202j.m34176a((Object) this.f31798a, (Object) type)) {
            return C10529o.m35736a();
        }
        C10218z zVar = new C10218z(2);
        Type genericSuperclass = this.f31798a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        zVar.mo35386a((Object) type);
        Type[] genericInterfaces = this.f31798a.getGenericInterfaces();
        C10202j.m34174a((Object) genericInterfaces, "klass.genericInterfaces");
        zVar.mo35388b(genericInterfaces);
        List<Type> b = C10529o.m35741b((T[]) (Type[]) zVar.mo35387a((Object[]) new Type[zVar.mo35385a()]));
        ArrayList arrayList = new ArrayList(C10531p.m35750a(b, 10));
        for (Type lVar : b) {
            arrayList.add(new C12051l(lVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m39774a(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032 || !name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            Class[] parameterTypes = method.getParameterTypes();
            C10202j.m34174a((Object) parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        }
    }
}
