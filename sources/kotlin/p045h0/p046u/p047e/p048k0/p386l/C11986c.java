package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.l.c */
/* compiled from: modifierChecks.kt */
public abstract class C11986c {

    /* renamed from: a */
    private final boolean f31691a;

    /* renamed from: kotlin.h0.u.e.k0.l.c$a */
    /* compiled from: modifierChecks.kt */
    public static final class C11987a extends C11986c {

        /* renamed from: b */
        public static final C11987a f31692b = new C11987a();

        private C11987a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.c$b */
    /* compiled from: modifierChecks.kt */
    public static final class C11988b extends C11986c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11988b(String str) {
            super(false, (DefaultConstructorMarker) null);
            C10202j.m34178b(str, "error");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.l.c$c */
    /* compiled from: modifierChecks.kt */
    public static final class C11989c extends C11986c {

        /* renamed from: b */
        public static final C11989c f31693b = new C11989c();

        private C11989c() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    private C11986c(boolean z) {
        this.f31691a = z;
    }

    /* renamed from: a */
    public final boolean mo38629a() {
        return this.f31691a;
    }

    public /* synthetic */ C11986c(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
