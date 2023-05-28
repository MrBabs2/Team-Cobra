package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.h.m.r */
/* compiled from: constantValues.kt */
public final class C10056r extends C10037g<C10058b> {

    /* renamed from: b */
    public static final C10057a f27649b = new C10057a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.h.m.r$a */
    /* compiled from: constantValues.kt */
    public static final class C10057a {
        private C10057a() {
        }

        /* renamed from: a */
        public final C10037g<?> mo35260a(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, "argumentType");
            if (C11830d0.m38958a(b0Var)) {
                return null;
            }
            C11824b0 b0Var2 = b0Var;
            int i = 0;
            while (C9333g.m30181c(b0Var2)) {
                b0Var2 = ((C11965u0) C10539w.m35809i(b0Var2.mo35226u0())).getType();
                C10202j.m34174a((Object) b0Var2, "type.arguments.single().type");
                i++;
            }
            C10349h b = b0Var2.mo35227v0().mo33781b();
            if (b instanceof C10342e) {
                C9933a a = C10071a.m33884a(b);
                if (a != null) {
                    return new C10056r(a, i);
                }
                return new C10056r((C10058b) new C10058b.C10059a(b0Var));
            } else if (!(b instanceof C10375s0)) {
                return null;
            } else {
                C9933a a2 = C9933a.m33260a(C9333g.f25907k.f25944a.mo35016h());
                C10202j.m34174a((Object) a2, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                return new C10056r(a2, 0);
            }
        }

        public /* synthetic */ C10057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.m.r$b */
    /* compiled from: constantValues.kt */
    public static abstract class C10058b {

        /* renamed from: kotlin.h0.u.e.k0.h.m.r$b$a */
        /* compiled from: constantValues.kt */
        public static final class C10059a extends C10058b {

            /* renamed from: a */
            private final C11824b0 f27650a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10059a(C11824b0 b0Var) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(b0Var, "type");
                this.f27650a = b0Var;
            }

            /* renamed from: a */
            public final C11824b0 mo35261a() {
                return this.f27650a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C10059a) && C10202j.m34176a((Object) this.f27650a, (Object) ((C10059a) obj).f27650a);
                }
                return true;
            }

            public int hashCode() {
                C11824b0 b0Var = this.f27650a;
                if (b0Var != null) {
                    return b0Var.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "LocalClass(type=" + this.f27650a + ")";
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.h.m.r$b$b */
        /* compiled from: constantValues.kt */
        public static final class C10060b extends C10058b {

            /* renamed from: a */
            private final C10036f f27651a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10060b(C10036f fVar) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(fVar, DonationsAnalytics.VALUE);
                this.f27651a = fVar;
            }

            /* renamed from: a */
            public final int mo35265a() {
                return this.f27651a.mo35239c();
            }

            /* renamed from: b */
            public final C9933a mo35266b() {
                return this.f27651a.mo35240d();
            }

            /* renamed from: c */
            public final C10036f mo35267c() {
                return this.f27651a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C10060b) && C10202j.m34176a((Object) this.f27651a, (Object) ((C10060b) obj).f27651a);
                }
                return true;
            }

            public int hashCode() {
                C10036f fVar = this.f27651a;
                if (fVar != null) {
                    return fVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "NormalClass(value=" + this.f27651a + ")";
            }
        }

        private C10058b() {
        }

        public /* synthetic */ C10058b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10056r(C10058b bVar) {
        super(bVar);
        C10202j.m34178b(bVar, DonationsAnalytics.VALUE);
    }

    /* renamed from: a */
    public C11824b0 mo35235a(C10393y yVar) {
        C10202j.m34178b(yVar, "module");
        C10249g a = C10249g.f27910c.mo35429a();
        C10342e q = yVar.mo35561l().mo33721q();
        C10202j.m34174a((Object) q, "module.builtIns.kClass");
        return C11827c0.m38950a(a, q, (List<? extends C11965u0>) C10527n.m35729a(new C11970w0(mo35259b(yVar))));
    }

    /* renamed from: b */
    public final C11824b0 mo35259b(C10393y yVar) {
        C10202j.m34178b(yVar, "module");
        C10058b bVar = (C10058b) mo35244a();
        if (bVar instanceof C10058b.C10059a) {
            return ((C10058b.C10059a) mo35244a()).mo35261a();
        }
        if (bVar instanceof C10058b.C10060b) {
            C10036f c = ((C10058b.C10060b) mo35244a()).mo35267c();
            C9933a a = c.mo35237a();
            int b = c.mo35238b();
            C10342e a2 = C10376t.m35016a(yVar, a);
            if (a2 != null) {
                C11901j0 o = a2.mo35445o();
                C10202j.m34174a((Object) o, "descriptor.defaultType");
                C11824b0 f = C11924a.m39422f(o);
                for (int i = 0; i < b; i++) {
                    f = yVar.mo35561l().mo33698a(C11838f1.INVARIANT, f);
                    C10202j.m34174a((Object) f, "module.builtIns.getArray…Variance.INVARIANT, type)");
                }
                return f;
            }
            C11901j0 c2 = C11958u.m39559c("Unresolved type: " + a + " (arrayDimensions=" + b + ')');
            C10202j.m34174a((Object) c2, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
            return c2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10056r(C10036f fVar) {
        this((C10058b) new C10058b.C10060b(fVar));
        C10202j.m34178b(fVar, DonationsAnalytics.VALUE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10056r(C9933a aVar, int i) {
        this(new C10036f(aVar, i));
        C10202j.m34178b(aVar, "classId");
    }
}
