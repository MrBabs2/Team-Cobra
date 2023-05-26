package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.h.m.b */
/* compiled from: constantValues.kt */
public final class C10031b extends C10037g<List<? extends C10037g<?>>> {

    /* renamed from: b */
    private final C9113l<C10393y, C11824b0> f27622b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10031b(List<? extends C10037g<?>> list, C9113l<? super C10393y, ? extends C11824b0> lVar) {
        super(list);
        C10202j.m34178b(list, DonationsAnalytics.VALUE);
        C10202j.m34178b(lVar, "computeType");
        this.f27622b = lVar;
    }

    /* renamed from: a */
    public C11824b0 mo35235a(C10393y yVar) {
        C10202j.m34178b(yVar, "module");
        C11824b0 invoke = this.f27622b.invoke(yVar);
        boolean z = C9333g.m30181c(invoke) || C9333g.m30205q(invoke);
        if (!C10485x.f28360a || z) {
            return invoke;
        }
        throw new AssertionError("Type should be an array, but was " + invoke + ": " + ((List) mo35244a()));
    }
}
