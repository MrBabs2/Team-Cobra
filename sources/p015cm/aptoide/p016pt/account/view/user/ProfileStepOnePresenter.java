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
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepOnePresenter */
public class ProfileStepOnePresenter implements Presenter {
    private static final String TAG = "ProfileStepOnePresenter";
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private LoginSignupManager loginSignupManager;
    private final ProfileStepOneView view;

    public ProfileStepOnePresenter(ProfileStepOneView profileStepOneView, CrashReport crashReport2, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator2, AccountAnalytics accountAnalytics2, LoginSignupManager loginSignupManager2) {
        this.view = profileStepOneView;
        this.crashReport = crashReport2;
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator2;
        this.accountAnalytics = accountAnalytics2;
        this.loginSignupManager = loginSignupManager2;
    }

    /* renamed from: a */
    static /* synthetic */ void m4460a(Object obj) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4462c(Void voidR) {
    }

    private C5328b makeUserProfilePublic() {
        return this.accountManager.updateAccount(Account.Access.PUBLIC).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1284m0(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6608a(Void voidR) {
        this.accountAnalytics.accountProfileAction(1, AccountAnalytics.ProfileAction.MORE_INFO);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6609b(View.LifecycleEvent lifecycleEvent) {
        return this.view.moreInfoButtonClick().mo18664b(new C1254c0(this)).mo18664b(new C1287n0(this));
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C1278k0.f3713f).mo18687f(new C1295q0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1297r0.f3734f, (C5378b<Throwable>) new C1269h0(this));
        this.view.getLifecycleEvent().mo18681d(C1263f0.f3695f).mo18687f(new C1275j0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1272i0.f3706f, (C5378b<Throwable>) new C1266g0(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6605a(View.LifecycleEvent lifecycleEvent) {
        return this.view.continueButtonClick().mo18664b(new C1290o0(this)).mo18687f(new C1257d0(this)).mo18649a((C5378b<? super Throwable>) C1260e0.f3692f).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo6615c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo6614c(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* renamed from: b */
    public /* synthetic */ void mo6613b(Void voidR) {
        this.accountNavigator.navigateToProfileStepTwoView();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6610b(Boolean bool) {
        return makeUserProfilePublic().mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C1293p0(this)).mo18589a((C5377a) new C1299s0(this)).mo18589a((C5377a) new C1281l0(this, bool)).mo18610e();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6606a() {
        this.accountAnalytics.accountProfileAction(1, AccountAnalytics.ProfileAction.CONTINUE);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6607a(Boolean bool) {
        if (bool.booleanValue() || !this.loginSignupManager.shouldShowCreateStore()) {
            this.accountNavigator.navigateToHomeView();
        } else {
            this.accountNavigator.navigateToCreateStoreView();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo6611b() {
        this.view.dismissWaitDialog();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6604a(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* renamed from: b */
    public /* synthetic */ void mo6612b(Throwable th) {
        this.crashReport.log(th);
    }
}
