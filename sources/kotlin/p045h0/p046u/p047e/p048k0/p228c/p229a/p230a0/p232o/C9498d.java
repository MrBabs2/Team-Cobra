package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9664l;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11940n0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11943o0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.d */
/* compiled from: JavaTypeResolver.kt */
public final class C9498d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C9934b f26345a = new C9934b("java.lang.Class");

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.d$a */
    /* compiled from: JavaTypeResolver.kt */
    static final class C9499a extends C10203k implements C9102a<C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C10375s0 f26346f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9499a(C10375s0 s0Var) {
            super(0);
            this.f26346f = s0Var;
        }

        public final C11901j0 invoke() {
            C11901j0 c = C11958u.m39559c("Can't compute erased upper bound of type parameter `" + this.f26346f + '`');
            C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy… type parameter `$this`\")");
            return c;
        }
    }

    /* renamed from: a */
    public static final C11965u0 m30792a(C10375s0 s0Var, C9491a aVar) {
        C10202j.m34178b(s0Var, "typeParameter");
        C10202j.m34178b(aVar, "attr");
        if (aVar.mo33993b() == C9664l.SUPERTYPE) {
            return new C11970w0(C11943o0.m39490a(s0Var));
        }
        return new C11940n0(s0Var);
    }

    /* renamed from: a */
    public static /* synthetic */ C9491a m30788a(C9664l lVar, boolean z, C10375s0 s0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            s0Var = null;
        }
        return m30787a(lVar, z, s0Var);
    }

    /* renamed from: a */
    public static final C9491a m30787a(C9664l lVar, boolean z, C10375s0 s0Var) {
        C10202j.m34178b(lVar, "$this$toAttributes");
        return new C9491a(lVar, (C9492b) null, z, s0Var, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static /* synthetic */ C11824b0 m30791a(C10375s0 s0Var, C10375s0 s0Var2, C9102a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            s0Var2 = null;
        }
        if ((i & 2) != 0) {
            aVar = new C9499a(s0Var);
        }
        return m30790a(s0Var, s0Var2, (C9102a<? extends C11824b0>) aVar);
    }

    /* renamed from: a */
    public static final C11824b0 m30790a(C10375s0 s0Var, C10375s0 s0Var2, C9102a<? extends C11824b0> aVar) {
        C10202j.m34178b(s0Var, "$this$getErasedUpperBound");
        C10202j.m34178b(aVar, "defaultValue");
        if (s0Var == s0Var2) {
            return (C11824b0) aVar.invoke();
        }
        List<C11824b0> upperBounds = s0Var.getUpperBounds();
        C10202j.m34174a((Object) upperBounds, "upperBounds");
        C11824b0 b0Var = (C11824b0) C10539w.m35799e(upperBounds);
        if (b0Var.mo35227v0().mo33781b() instanceof C10342e) {
            C10202j.m34174a((Object) b0Var, "firstUpperBound");
            return C11924a.m39422f(b0Var);
        }
        if (s0Var2 != null) {
            s0Var = s0Var2;
        }
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (b != null) {
            while (true) {
                C10375s0 s0Var3 = (C10375s0) b;
                if (!(!C10202j.m34176a((Object) s0Var3, (Object) s0Var))) {
                    return (C11824b0) aVar.invoke();
                }
                List<C11824b0> upperBounds2 = s0Var3.getUpperBounds();
                C10202j.m34174a((Object) upperBounds2, "current.upperBounds");
                C11824b0 b0Var2 = (C11824b0) C10539w.m35799e(upperBounds2);
                if (b0Var2.mo35227v0().mo33781b() instanceof C10342e) {
                    C10202j.m34174a((Object) b0Var2, "nextUpperBound");
                    return C11924a.m39422f(b0Var2);
                }
                b = b0Var2.mo35227v0().mo33781b();
                if (b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }
}
