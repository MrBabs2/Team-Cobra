package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p263z.C10545a;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.c */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C9188c {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.c$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9189a extends C9188c {

        /* renamed from: a */
        private final List<Method> f25710a;

        /* renamed from: b */
        private final Class<?> f25711b;

        /* renamed from: kotlin.h0.u.e.c$a$a */
        /* compiled from: Comparisons.kt */
        public static final class C9190a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Method method = (Method) t;
                C10202j.m34174a((Object) method, "it");
                String name = method.getName();
                Method method2 = (Method) t2;
                C10202j.m34174a((Object) method2, "it");
                return C10545a.m35829a(name, method2.getName());
            }
        }

        /* renamed from: kotlin.h0.u.e.c$a$b */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C9191b extends C10203k implements C9113l<Method, String> {

            /* renamed from: f */
            public static final C9191b f25712f = new C9191b();

            C9191b() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(Method method) {
                C10202j.m34174a((Object) method, "it");
                Class<?> returnType = method.getReturnType();
                C10202j.m34174a((Object) returnType, "it.returnType");
                return C12029b.m39749c(returnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9189a(Class<?> cls) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(cls, "jClass");
            this.f25711b = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C10202j.m34174a((Object) declaredMethods, "jClass.declaredMethods");
            this.f25710a = C10519k.m35642c((T[]) declaredMethods, new C9190a());
        }

        /* renamed from: a */
        public String mo33551a() {
            return C10539w.m35773a(this.f25710a, "", "<init>(", ")V", 0, (CharSequence) null, C9191b.f25712f, 24, (Object) null);
        }

        /* renamed from: b */
        public final List<Method> mo33552b() {
            return this.f25710a;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.c$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9192b extends C9188c {

        /* renamed from: a */
        private final Constructor<?> f25713a;

        /* renamed from: kotlin.h0.u.e.c$b$a */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C9193a extends C10203k implements C9113l<Class<?>, String> {

            /* renamed from: f */
            public static final C9193a f25714f = new C9193a();

            C9193a() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(Class<?> cls) {
                C10202j.m34174a((Object) cls, "it");
                return C12029b.m39749c(cls);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9192b(Constructor<?> constructor) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(constructor, "constructor");
            this.f25713a = constructor;
        }

        /* renamed from: a */
        public String mo33551a() {
            Class[] parameterTypes = this.f25713a.getParameterTypes();
            C10202j.m34174a((Object) parameterTypes, "constructor.parameterTypes");
            return C10519k.m35615a(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C9193a.f25714f, 24, (Object) null);
        }

        /* renamed from: b */
        public final Constructor<?> mo33555b() {
            return this.f25713a;
        }
    }

    /* renamed from: kotlin.h0.u.e.c$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9194c extends C9188c {

        /* renamed from: a */
        private final Method f25715a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9194c(Method method) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(method, "method");
            this.f25715a = method;
        }

        /* renamed from: a */
        public String mo33551a() {
            return C9216e0.m29954b(this.f25715a);
        }

        /* renamed from: b */
        public final Method mo33557b() {
            return this.f25715a;
        }
    }

    /* renamed from: kotlin.h0.u.e.c$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9195d extends C9188c {

        /* renamed from: a */
        private final String f25716a;

        /* renamed from: b */
        private final C9920e.C9922b f25717b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9195d(C9920e.C9922b bVar) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(bVar, RoomInstalled.SIGNATURE);
            this.f25717b = bVar;
            this.f25716a = bVar.mo34924a();
        }

        /* renamed from: a */
        public String mo33551a() {
            return this.f25716a;
        }

        /* renamed from: b */
        public final String mo33558b() {
            return this.f25717b.mo34925b();
        }
    }

    /* renamed from: kotlin.h0.u.e.c$e */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9196e extends C9188c {

        /* renamed from: a */
        private final String f25718a;

        /* renamed from: b */
        private final C9920e.C9922b f25719b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9196e(C9920e.C9922b bVar) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(bVar, RoomInstalled.SIGNATURE);
            this.f25719b = bVar;
            this.f25718a = bVar.mo34924a();
        }

        /* renamed from: a */
        public String mo33551a() {
            return this.f25718a;
        }

        /* renamed from: b */
        public final String mo33559b() {
            return this.f25719b.mo34925b();
        }

        /* renamed from: c */
        public final String mo33560c() {
            return this.f25719b.mo34926c();
        }
    }

    private C9188c() {
    }

    /* renamed from: a */
    public abstract String mo33551a();

    public /* synthetic */ C9188c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
