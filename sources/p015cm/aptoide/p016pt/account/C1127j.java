package p015cm.aptoide.p016pt.account;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.TermsAndConditionsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserInfo;
import p123rx.p126m.C12497p;

/* renamed from: cm.aptoide.pt.account.j */
/* compiled from: lambda */
public final /* synthetic */ class C1127j implements C12497p {

    /* renamed from: a */
    private final /* synthetic */ AccountServiceV3 f3552a;

    /* renamed from: b */
    private final /* synthetic */ String f3553b;

    public /* synthetic */ C1127j(AccountServiceV3 accountServiceV3, String str) {
        this.f3552a = accountServiceV3;
        this.f3553b = str;
    }

    public final Object call(Object obj, Object obj2, Object obj3) {
        return this.f3552a.mo6225a(this.f3553b, (GetUserInfo) obj, (List) obj2, (TermsAndConditionsResponse) obj3);
    }
}
