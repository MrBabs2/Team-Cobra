package p015cm.aptoide.p016pt.account;

import com.aptoide.authentication.model.OAuth2;
import p015cm.aptoide.p016pt.networking.Authentication;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.d */
/* compiled from: lambda */
public final /* synthetic */ class C1115d implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AccountServiceV3 f3533f;

    /* renamed from: g */
    private final /* synthetic */ OAuth2 f3534g;

    public /* synthetic */ C1115d(AccountServiceV3 accountServiceV3, OAuth2 oAuth2) {
        this.f3533f = accountServiceV3;
        this.f3534g = oAuth2;
    }

    public final Object call(Object obj) {
        return this.f3533f.mo6228a(this.f3534g, (Authentication) obj);
    }
}
