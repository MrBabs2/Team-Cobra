package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11876m;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11905d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.l */
/* compiled from: SpecialTypes.kt */
public final class C11925l extends C11939n implements C11922k, C11905d {

    /* renamed from: g */
    public static final C11926a f31626g = new C11926a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C11901j0 f31627f;

    /* renamed from: kotlin.h0.u.e.k0.k.l$a */
    /* compiled from: SpecialTypes.kt */
    public static final class C11926a {
        private C11926a() {
        }

        /* renamed from: b */
        private final boolean m39433b(C11834e1 e1Var) {
            return C11924a.m39417a(e1Var) && !C11876m.f31590a.mo38545a(e1Var);
        }

        /* renamed from: a */
        public final C11925l mo38576a(C11834e1 e1Var) {
            C10202j.m34178b(e1Var, "type");
            if (e1Var instanceof C11925l) {
                return (C11925l) e1Var;
            }
            if (!m39433b(e1Var)) {
                return null;
            }
            if (e1Var instanceof C11966v) {
                C11966v vVar = (C11966v) e1Var;
                boolean a = C10202j.m34176a((Object) vVar.mo38609z0().mo35227v0(), (Object) vVar.mo38607A0().mo35227v0());
                if (C10485x.f28360a && !a) {
                    throw new AssertionError("DefinitelyNotNullType for flexible type (" + e1Var + ") can be created only from type variable with the same constructor for bounds");
                }
            }
            return new C11925l(C11975y.m39645c(e1Var), (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C11926a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C11925l(C11901j0 j0Var) {
        this.f31627f = j0Var;
    }

    /* renamed from: B */
    public boolean mo34092B() {
        mo34095y0().mo35227v0();
        return mo34095y0().mo35227v0().mo33781b() instanceof C10375s0;
    }

    /* renamed from: a */
    public final C11901j0 mo38575a() {
        return this.f31627f;
    }

    public String toString() {
        return mo34095y0() + "!!";
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C11901j0 mo34095y0() {
        return this.f31627f;
    }

    public /* synthetic */ C11925l(C11901j0 j0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0Var);
    }

    /* renamed from: a */
    public C11824b0 mo34093a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "replacement");
        return C11938m0.m39469a(b0Var.mo38439x0());
    }

    /* renamed from: a */
    public C11925l m39430a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C11925l(mo34095y0().mo34006a(gVar));
    }

    /* renamed from: a */
    public C11901j0 m39429a(boolean z) {
        return z ? mo34095y0().mo34007a(z) : this;
    }
}
