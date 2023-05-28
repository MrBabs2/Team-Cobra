package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.a */
/* compiled from: ReflectJavaMember.kt */
final class C12027a {

    /* renamed from: a */
    private static C12028a f31782a;

    /* renamed from: b */
    public static final C12027a f31783b = new C12027a();

    /* renamed from: kotlin.h0.u.e.m0.a$a */
    /* compiled from: ReflectJavaMember.kt */
    public static final class C12028a {

        /* renamed from: a */
        private final Method f31784a;

        /* renamed from: b */
        private final Method f31785b;

        public C12028a(Method method, Method method2) {
            this.f31784a = method;
            this.f31785b = method2;
        }

        /* renamed from: a */
        public final Method mo38662a() {
            return this.f31785b;
        }

        /* renamed from: b */
        public final Method mo38663b() {
            return this.f31784a;
        }
    }

    private C12027a() {
    }

    /* renamed from: a */
    public final C12028a mo38660a(Member member) {
        C10202j.m34178b(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C12028a(cls.getMethod("getParameters", new Class[0]), C12029b.m39751e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C12028a((Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    public final List<String> mo38661b(Member member) {
        Method a;
        C10202j.m34178b(member, "member");
        C12028a aVar = f31782a;
        if (aVar == null) {
            aVar = mo38660a(member);
            f31782a = aVar;
        }
        Method b = aVar.mo38663b();
        if (b == null || (a = aVar.mo38662a()) == null) {
            return null;
        }
        Object invoke = b.invoke(member, new Object[0]);
        if (invoke != null) {
            Object[] objArr = (Object[]) invoke;
            ArrayList arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object invoke2 = a.invoke(objArr[i], new Object[0]);
                if (invoke2 != null) {
                    arrayList.add((String) invoke2);
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
    }
}
