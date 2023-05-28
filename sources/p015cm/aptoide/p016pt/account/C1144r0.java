package p015cm.aptoide.p016pt.account;

import p015cm.aptoide.accountmanager.AccountService;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C1144r0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AccountService f3570f;

    /* renamed from: g */
    private final /* synthetic */ FacebookLoginResult f3571g;

    public /* synthetic */ C1144r0(AccountService accountService, FacebookLoginResult facebookLoginResult) {
        this.f3570f = accountService;
        this.f3571g = facebookLoginResult;
    }

    public final Object call(Object obj) {
        return this.f3570f.createAccount((String) obj, this.f3571g.getResult().mo21221a().mo20788k(), FacebookSignUpAdapter.TYPE);
    }
}
