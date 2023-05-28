package kotlin.p045h0.p046u.p047e.p390m0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9526m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.m0.o */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C12054o extends C12033d implements C9526m {

    /* renamed from: c */
    private final Enum<?> f31811c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12054o(C9939f fVar, Enum<?> enumR) {
        super(fVar);
        C10202j.m34178b(enumR, DonationsAnalytics.VALUE);
        this.f31811c = enumR;
    }

    /* renamed from: b */
    public C9933a mo34050b() {
        Class<?> cls = this.f31811c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C10202j.m34174a((Object) cls, "enumClass");
        return C12029b.m39748b(cls);
    }

    /* renamed from: d */
    public C9939f mo34051d() {
        return C9939f.m33302b(this.f31811c.name());
    }
}
