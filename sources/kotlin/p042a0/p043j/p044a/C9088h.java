package kotlin.p042a0.p043j.p044a;

import java.lang.reflect.Method;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo16641d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.a0.j.a.h */
/* compiled from: DebugMetadata.kt */
final class C9088h {

    /* renamed from: a */
    private static final C9089a f25664a = new C9089a((Method) null, (Method) null, (Method) null);

    /* renamed from: b */
    public static C9089a f25665b;

    /* renamed from: c */
    public static final C9088h f25666c = new C9088h();

    /* renamed from: kotlin.a0.j.a.h$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C9089a {

        /* renamed from: a */
        public final Method f25667a;

        /* renamed from: b */
        public final Method f25668b;

        /* renamed from: c */
        public final Method f25669c;

        public C9089a(Method method, Method method2, Method method3) {
            this.f25667a = method;
            this.f25668b = method2;
            this.f25669c = method3;
        }
    }

    private C9088h() {
    }

    /* renamed from: b */
    private final C9089a m29793b(C9082a aVar) {
        try {
            C9089a aVar2 = new C9089a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f25665b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C9089a aVar3 = f25664a;
            f25665b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: a */
    public final String mo33467a(C9082a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C10202j.m34178b(aVar, "continuation");
        C9089a aVar2 = f25665b;
        if (aVar2 == null) {
            aVar2 = m29793b(aVar);
        }
        Object obj = null;
        if (aVar2 == f25664a || (method = aVar2.f25667a) == null || (invoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVar2.f25668b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.f25669c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            obj = invoke3;
        }
        return (String) obj;
    }
}
