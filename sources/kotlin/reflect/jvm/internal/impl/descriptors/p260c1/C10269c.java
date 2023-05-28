package kotlin.reflect.jvm.internal.impl.descriptors.p260c1;

import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1.c */
/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface C10269c {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1.c$a */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C10270a implements C10269c {

        /* renamed from: a */
        public static final C10270a f27949a = new C10270a();

        private C10270a() {
        }

        /* renamed from: a */
        public boolean mo33827a(C10342e eVar, C10360m0 m0Var) {
            C10202j.m34178b(eVar, "classDescriptor");
            C10202j.m34178b(m0Var, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1.c$b */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C10271b implements C10269c {

        /* renamed from: a */
        public static final C10271b f27950a = new C10271b();

        private C10271b() {
        }

        /* renamed from: a */
        public boolean mo33827a(C10342e eVar, C10360m0 m0Var) {
            C10202j.m34178b(eVar, "classDescriptor");
            C10202j.m34178b(m0Var, "functionDescriptor");
            return !m0Var.getAnnotations().mo33886b(C10272d.m34333a());
        }
    }

    /* renamed from: a */
    boolean mo33827a(C10342e eVar, C10360m0 m0Var);
}
