package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10024b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.k.h1.j */
/* compiled from: NewCapturedType.kt */
public final class C11873j implements C10024b {

    /* renamed from: a */
    private final C11965u0 f31587a;

    /* renamed from: b */
    private List<? extends C11834e1> f31588b;

    public C11873j(C11965u0 u0Var, List<? extends C11834e1> list) {
        C10202j.m34178b(u0Var, "projection");
        this.f31587a = u0Var;
        this.f31588b = list;
    }

    /* renamed from: b */
    public C10349h mo33781b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo33782c() {
        return false;
    }

    /* renamed from: d */
    public C11965u0 mo35228d() {
        return this.f31587a;
    }

    public List<C10375s0> getParameters() {
        return C10529o.m35736a();
    }

    /* renamed from: l */
    public C9333g mo35232l() {
        C11824b0 type = mo35228d().getType();
        C10202j.m34174a((Object) type, "projection.type");
        return C11924a.m39418b(type);
    }

    public String toString() {
        return "CapturedType(" + mo35228d() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11873j(C11965u0 u0Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u0Var, (i & 2) != 0 ? null : list);
    }

    /* renamed from: a */
    public final void mo38539a(List<? extends C11834e1> list) {
        C10202j.m34178b(list, "supertypes");
        boolean z = this.f31588b == null;
        if (!C10485x.f28360a || z) {
            this.f31588b = list;
            return;
        }
        throw new AssertionError("Already initialized! oldValue = " + this.f31588b + ", newValue = " + list);
    }

    /* renamed from: a */
    public List<C11834e1> m39184a() {
        List<? extends C11834e1> list = this.f31588b;
        return list != null ? list : C10529o.m35736a();
    }
}
