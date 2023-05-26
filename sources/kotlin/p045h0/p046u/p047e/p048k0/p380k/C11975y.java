package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.k.y */
/* compiled from: flexibleTypes.kt */
public final class C11975y {
    /* renamed from: a */
    public static final C11966v m39643a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$asFlexibleType");
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 != null) {
            return (C11966v) x0;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    /* renamed from: b */
    public static final boolean m39644b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isFlexible");
        return b0Var.mo38439x0() instanceof C11966v;
    }

    /* renamed from: c */
    public static final C11901j0 m39645c(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$lowerIfFlexible");
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 instanceof C11966v) {
            return ((C11966v) x0).mo38609z0();
        }
        if (x0 instanceof C11901j0) {
            return (C11901j0) x0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final C11901j0 m39646d(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$upperIfFlexible");
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 instanceof C11966v) {
            return ((C11966v) x0).mo38607A0();
        }
        if (x0 instanceof C11901j0) {
            return (C11901j0) x0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
