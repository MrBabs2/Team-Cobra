package p015cm.aptoide.p016pt.account;

import com.aptoide.authentication.model.OAuth2;
import p015cm.aptoide.accountmanager.Account;
import p050l.p075h.p083k.C5004d;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.e */
/* compiled from: lambda */
public final /* synthetic */ class C1117e implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ OAuth2 f3536f;

    public /* synthetic */ C1117e(OAuth2 oAuth2) {
        this.f3536f = oAuth2;
    }

    public final Object call(Object obj) {
        return C5004d.m8890a((Account) obj, Boolean.valueOf(this.f3536f.getSignup()));
    }
}
