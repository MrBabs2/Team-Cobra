package p015cm.aptoide.p016pt;

import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.networking.RefreshTokenInvalidator;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.InvalidRefreshTokenLogoutManager */
public class InvalidRefreshTokenLogoutManager {
    private AptoideAccountManager aptoideAccountManager;
    private RefreshTokenInvalidator refreshTokenInvalidator;

    public InvalidRefreshTokenLogoutManager(AptoideAccountManager aptoideAccountManager2, RefreshTokenInvalidator refreshTokenInvalidator2) {
        this.aptoideAccountManager = aptoideAccountManager2;
        this.refreshTokenInvalidator = refreshTokenInvalidator2;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6027a(Void voidR) {
        return this.aptoideAccountManager.logout();
    }

    public void start() {
        this.refreshTokenInvalidator.getLogoutSubject().mo18689g(new C1955c0(this)).mo18693i();
    }
}
