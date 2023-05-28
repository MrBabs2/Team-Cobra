package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11984b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.l.l */
/* compiled from: modifierChecks.kt */
public abstract class C12014l implements C11984b {

    /* renamed from: a */
    private final String f31759a;

    /* renamed from: kotlin.h0.u.e.k0.l.l$a */
    /* compiled from: modifierChecks.kt */
    public static final class C12015a extends C12014l {

        /* renamed from: b */
        private final int f31760b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C12015a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f31760b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p386l.C12014l.C12015a.<init>(int):void");
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return uVar.mo35407f().size() >= this.f31760b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.l$b */
    /* compiled from: modifierChecks.kt */
    public static final class C12016b extends C12014l {

        /* renamed from: b */
        private final int f31761b;

        public C12016b(int i) {
            super("must have exactly " + i + " value parameters", (DefaultConstructorMarker) null);
            this.f31761b = i;
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return uVar.mo35407f().size() == this.f31761b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.l$c */
    /* compiled from: modifierChecks.kt */
    public static final class C12017c extends C12014l {

        /* renamed from: b */
        public static final C12017c f31762b = new C12017c();

        private C12017c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return uVar.mo35407f().isEmpty();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.l$d */
    /* compiled from: modifierChecks.kt */
    public static final class C12018d extends C12014l {

        /* renamed from: b */
        public static final C12018d f31763b = new C12018d();

        private C12018d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo38627b(C10382u uVar) {
            C10202j.m34178b(uVar, "functionDescriptor");
            return uVar.mo35407f().size() == 1;
        }
    }

    private C12014l(String str) {
        this.f31759a = str;
    }

    /* renamed from: a */
    public String mo38626a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C11984b.C11985a.m39682a(this, uVar);
    }

    public String getDescription() {
        return this.f31759a;
    }

    public /* synthetic */ C12014l(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
