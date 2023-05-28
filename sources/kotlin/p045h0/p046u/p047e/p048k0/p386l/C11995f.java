package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11984b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.l.f */
/* compiled from: modifierChecks.kt */
public abstract class C11995f implements C11984b {

    /* renamed from: a */
    private final String f31704a;

    /* renamed from: kotlin.h0.u.e.k0.l.f$a */
    /* compiled from: modifierChecks.kt */
    public static final class C11996a extends C11995f {

        /* renamed from: b */
        public static final C11996a f31705b = new C11996a();

        private C11996a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return uVar.mo35403X() != null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.f$b */
    /* compiled from: modifierChecks.kt */
    public static final class C11997b extends C11995f {

        /* renamed from: b */
        public static final C11997b f31706b = new C11997b();

        private C11997b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return (uVar.mo35403X() == null && uVar.mo35405b0() == null) ? false : true;
        }
    }

    private C11995f(String str) {
        this.f31704a = str;
    }

    /* renamed from: a */
    public String mo38626a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C11984b.C11985a.m39682a(this, uVar);
    }

    public String getDescription() {
        return this.f31704a;
    }

    public /* synthetic */ C11995f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
