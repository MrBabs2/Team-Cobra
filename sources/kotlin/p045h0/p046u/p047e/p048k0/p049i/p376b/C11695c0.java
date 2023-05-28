package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9848t;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9853u;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9859v0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;

/* renamed from: kotlin.h0.u.e.k0.i.b.c0 */
/* compiled from: ProtoEnumFlags.kt */
public final class C11695c0 {

    /* renamed from: a */
    public static final C11695c0 f31280a = new C11695c0();

    private C11695c0() {
    }

    /* renamed from: a */
    public final C10238b.C10239a mo38269a(C9848t tVar) {
        if (tVar != null) {
            int i = C11693b0.f31271a[tVar.ordinal()];
            if (i == 1) {
                return C10238b.C10239a.DECLARATION;
            }
            if (i == 2) {
                return C10238b.C10239a.FAKE_OVERRIDE;
            }
            if (i == 3) {
                return C10238b.C10239a.DELEGATION;
            }
            if (i == 4) {
                return C10238b.C10239a.SYNTHESIZED;
            }
        }
        return C10238b.C10239a.DECLARATION;
    }

    /* renamed from: a */
    public final C10388w mo38271a(C9853u uVar) {
        if (uVar != null) {
            int i = C11693b0.f31273c[uVar.ordinal()];
            if (i == 1) {
                return C10388w.FINAL;
            }
            if (i == 2) {
                return C10388w.OPEN;
            }
            if (i == 3) {
                return C10388w.ABSTRACT;
            }
            if (i == 4) {
                return C10388w.SEALED;
            }
        }
        return C10388w.FINAL;
    }

    /* renamed from: a */
    public final C10237a1 mo38268a(C9859v0 v0Var) {
        C10237a1 a1Var;
        if (v0Var != null) {
            switch (C11693b0.f31275e[v0Var.ordinal()]) {
                case 1:
                    a1Var = C10397z0.f28191d;
                    break;
                case 2:
                    a1Var = C10397z0.f28188a;
                    break;
                case 3:
                    a1Var = C10397z0.f28189b;
                    break;
                case 4:
                    a1Var = C10397z0.f28190c;
                    break;
                case 5:
                    a1Var = C10397z0.f28192e;
                    break;
                case 6:
                    a1Var = C10397z0.f28193f;
                    break;
            }
        }
        a1Var = C10397z0.f28188a;
        C10202j.m34174a((Object) a1Var, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return a1Var;
    }

    /* renamed from: a */
    public final C10345f mo38270a(C9775f.C9778c cVar) {
        if (cVar != null) {
            switch (C11693b0.f31276f[cVar.ordinal()]) {
                case 1:
                    return C10345f.CLASS;
                case 2:
                    return C10345f.INTERFACE;
                case 3:
                    return C10345f.ENUM_CLASS;
                case 4:
                    return C10345f.ENUM_ENTRY;
                case 5:
                    return C10345f.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return C10345f.OBJECT;
            }
        }
        return C10345f.CLASS;
    }

    /* renamed from: a */
    public final C11838f1 mo38267a(C9811l0.C9814c cVar) {
        C10202j.m34178b(cVar, "variance");
        int i = C11693b0.f31278h[cVar.ordinal()];
        if (i == 1) {
            return C11838f1.IN_VARIANCE;
        }
        if (i == 2) {
            return C11838f1.OUT_VARIANCE;
        }
        if (i == 3) {
            return C11838f1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final C11838f1 mo38266a(C9782g0.C9784b.C9787c cVar) {
        C10202j.m34178b(cVar, "projection");
        int i = C11693b0.f31279i[cVar.ordinal()];
        if (i == 1) {
            return C11838f1.IN_VARIANCE;
        }
        if (i == 2) {
            return C11838f1.OUT_VARIANCE;
        }
        if (i == 3) {
            return C11838f1.INVARIANT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }
}
