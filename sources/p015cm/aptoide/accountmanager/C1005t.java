package p015cm.aptoide.accountmanager;

import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.accountmanager.t */
/* compiled from: lambda */
public final /* synthetic */ class C1005t implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AccountService f3393f;

    /* renamed from: g */
    private final /* synthetic */ AptoideCredentials f3394g;

    public /* synthetic */ C1005t(AccountService accountService, AptoideCredentials aptoideCredentials) {
        this.f3393f = accountService;
        this.f3394g = aptoideCredentials;
    }

    public final Object call(Object obj) {
        return AptoideSignUpAdapter.m4183a(this.f3393f, this.f3394g, (Throwable) obj);
    }
}
