package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11984b;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.l.k */
/* compiled from: modifierChecks.kt */
public abstract class C12007k implements C11984b {

    /* renamed from: a */
    private final String f31750a;

    /* renamed from: b */
    private final String f31751b;

    /* renamed from: c */
    private final C9113l<C9333g, C11824b0> f31752c;

    /* renamed from: kotlin.h0.u.e.k0.l.k$a */
    /* compiled from: modifierChecks.kt */
    public static final class C12008a extends C12007k {

        /* renamed from: d */
        public static final C12008a f31753d = new C12008a();

        /* renamed from: kotlin.h0.u.e.k0.l.k$a$a */
        /* compiled from: modifierChecks.kt */
        static final class C12009a extends C10203k implements C9113l<C9333g, C11901j0> {

            /* renamed from: f */
            public static final C12009a f31754f = new C12009a();

            C12009a() {
                super(1);
            }

            /* renamed from: a */
            public final C11901j0 invoke(C9333g gVar) {
                C10202j.m34178b(gVar, "$receiver");
                C11901j0 e = gVar.mo33709e();
                C10202j.m34174a((Object) e, "booleanType");
                return e;
            }
        }

        private C12008a() {
            super("Boolean", C12009a.f31754f, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.k$b */
    /* compiled from: modifierChecks.kt */
    public static final class C12010b extends C12007k {

        /* renamed from: d */
        public static final C12010b f31755d = new C12010b();

        /* renamed from: kotlin.h0.u.e.k0.l.k$b$a */
        /* compiled from: modifierChecks.kt */
        static final class C12011a extends C10203k implements C9113l<C9333g, C11901j0> {

            /* renamed from: f */
            public static final C12011a f31756f = new C12011a();

            C12011a() {
                super(1);
            }

            /* renamed from: a */
            public final C11901j0 invoke(C9333g gVar) {
                C10202j.m34178b(gVar, "$receiver");
                C11901j0 p = gVar.mo33720p();
                C10202j.m34174a((Object) p, "intType");
                return p;
            }
        }

        private C12010b() {
            super("Int", C12011a.f31756f, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.k$c */
    /* compiled from: modifierChecks.kt */
    public static final class C12012c extends C12007k {

        /* renamed from: d */
        public static final C12012c f31757d = new C12012c();

        /* renamed from: kotlin.h0.u.e.k0.l.k$c$a */
        /* compiled from: modifierChecks.kt */
        static final class C12013a extends C10203k implements C9113l<C9333g, C11901j0> {

            /* renamed from: f */
            public static final C12013a f31758f = new C12013a();

            C12013a() {
                super(1);
            }

            /* renamed from: a */
            public final C11901j0 invoke(C9333g gVar) {
                C10202j.m34178b(gVar, "$receiver");
                C11901j0 E = gVar.mo33695E();
                C10202j.m34174a((Object) E, "unitType");
                return E;
            }
        }

        private C12012c() {
            super("Unit", C12013a.f31758f, (DefaultConstructorMarker) null);
        }
    }

    private C12007k(String str, C9113l<? super C9333g, ? extends C11824b0> lVar) {
        this.f31751b = str;
        this.f31752c = lVar;
        this.f31750a = "must return " + this.f31751b;
    }

    /* renamed from: a */
    public String mo38626a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C11984b.C11985a.m39682a(this, uVar);
    }

    /* renamed from: b */
    public boolean mo38627b(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C10202j.m34176a((Object) uVar.getReturnType(), (Object) this.f31752c.invoke(C10071a.m33892b((C10359m) uVar)));
    }

    public String getDescription() {
        return this.f31750a;
    }

    public /* synthetic */ C12007k(String str, C9113l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }
}
