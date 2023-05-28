package p015cm.aptoide.p016pt.account.view.user;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.LoginSignupManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepTwoPresenter */
public class ProfileStepTwoPresenter implements Presenter {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private LoginSignupManager loginSignupManager;
    private final ProfileStepTwoView view;

    public ProfileStepTwoPresenter(ProfileStepTwoView profileStepTwoView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, AccountNavigator accountNavigator2, AccountAnalytics accountAnalytics2, LoginSignupManager loginSignupManager2) {
        this.view = profileStepTwoView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport2;
        this.accountNavigator = accountNavigator2;
        this.accountAnalytics = accountAnalytics2;
        this.loginSignupManager = loginSignupManager2;
    }

    /* renamed from: a */
    static /* synthetic */ void m4482a(Void voidR) {
    }

    /* renamed from: g */
    static /* synthetic */ Void m4483g(Boolean bool) {
        return null;
    }

    /* renamed from: h */
    static /* synthetic */ Void m4484h(Boolean bool) {
        return null;
    }

    private C5328b makeAccountPrivate() {
        return this.accountManager.updateAccount(Account.Access.UNLISTED).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1307w0(this));
    }

    private C5328b makeAccountPublic() {
        return this.accountManager.updateAccount(Account.Access.PUBLIC).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1258d1(this));
    }

    private void navigate(boolean z) {
        if (z || !this.loginSignupManager.shouldShowCreateStore()) {
            this.accountNavigator.navigateToHomeView();
        } else {
            this.accountNavigator.navigateToCreateStoreView();
        }
    }

    private C5328b sendAnalytics(AccountAnalytics.ProfileAction profileAction) {
        return C5328b.m10169d(new C1267g1(this, profileAction));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6629a(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* renamed from: b */
    public /* synthetic */ void mo6632b() {
        this.view.dismissWaitDialog();
    }

    /* renamed from: c */
    public /* synthetic */ void mo6634c(Boolean bool) {
        navigate(bool.booleanValue());
    }

    /* renamed from: d */
    public /* synthetic */ C5328b mo6636d(Boolean bool) {
        return makeAccountPublic().mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C1279k1(this)).mo18589a((C5377a) new C1264f1(this)).mo18589a((C5377a) new C1252b1(this, bool));
    }

    /* renamed from: e */
    public /* synthetic */ void mo6638e(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* renamed from: f */
    public /* synthetic */ void mo6639f(Boolean bool) {
        navigate(bool.booleanValue());
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C1313z0.f3750f).mo18687f(new C1270h1(this.view.continueButtonClick().mo18664b(new C1285m1(this)).mo18689g(new C1288n1(this)).mo18686f().mo18694j(C1311y0.f3748f), this.view.makePrivateProfileButtonClick().mo18664b(new C1309x0(this)).mo18689g(new C1261e1(this)).mo18686f().mo18694j(C1276j1.f3711f))).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1273i1.f3707f, (C5378b<Throwable>) new C1249a1(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6627a() {
        sendAnalytics(AccountAnalytics.ProfileAction.CONTINUE);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo6630b(Boolean bool) {
        return makeAccountPrivate().mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C1255c1(this)).mo18589a((C5377a) new C1291o1(this)).mo18589a((C5377a) new C1282l1(this, bool));
    }

    /* renamed from: c */
    public /* synthetic */ void mo6633c() {
        sendAnalytics(AccountAnalytics.ProfileAction.PRIVATE_PROFILE);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4480a(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: c */
    public /* synthetic */ void mo6635c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6626a(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* renamed from: d */
    public /* synthetic */ void mo6637d() {
        this.view.dismissWaitDialog();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo6631b(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6628a(AccountAnalytics.ProfileAction profileAction) {
        this.accountAnalytics.accountProfileAction(2, profileAction);
    }
}
