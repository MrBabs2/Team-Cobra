package p015cm.aptoide.p016pt.view.settings;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.settings.MyAccountPresenter */
public class MyAccountPresenter implements Presenter {
    private static final int EDIT_STORE_REQUEST_CODE = 1230;
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final MyAccountNavigator myAccountNavigator;
    private final C5373h scheduler;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final MyAccountView view;

    public MyAccountPresenter(MyAccountView myAccountView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, C5373h hVar, MyAccountNavigator myAccountNavigator2, AccountAnalytics accountAnalytics2, SocialMediaAnalytics socialMediaAnalytics2) {
        this.view = myAccountView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport2;
        this.scheduler = hVar;
        this.myAccountNavigator = myAccountNavigator2;
        this.accountAnalytics = accountAnalytics2;
        this.socialMediaAnalytics = socialMediaAnalytics2;
    }

    /* renamed from: a */
    static /* synthetic */ void m10368a(Object obj) {
    }

    /* renamed from: b */
    static /* synthetic */ void m10370b(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* renamed from: h */
    static /* synthetic */ void m10371h(Account account) {
    }

    private void handleAptoideBackupCardViewClick() {
        this.view.getLifecycleEvent().mo18681d(C5395b2.f9657f).mo18687f(new C5486r(this)).mo18664b(new C5487r0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5423g0.f9685f, (C5378b<Throwable>) new C5411e0(this));
    }

    private void handleAptoideTvCardViewClick() {
        this.view.getLifecycleEvent().mo18681d(C5424g1.f9686f).mo18687f(new C5460m1(this)).mo18664b(new C5452l(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5503u1.f9768f, (C5378b<Throwable>) new C5394b1(this));
    }

    private void handleAptoideUploaderCardViewClick() {
        this.view.getLifecycleEvent().mo18681d(C5422g.f9684f).mo18687f(new C5498t1(this)).mo18664b(new C5506v(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5470o.f9735f, (C5378b<Throwable>) new C5413e2(this));
    }

    private void handleSocialMediaPromotionClick() {
        this.view.getLifecycleEvent().mo18681d(C5528z1.f9794f).mo18687f(new C5441j0(this)).mo18664b(new C5440j(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5502u0.f9767f, (C5378b<Throwable>) new C5412e1(this));
    }

    /* renamed from: i */
    static /* synthetic */ void m10372i(Account account) {
    }

    /* renamed from: j */
    static /* synthetic */ void m10373j(Account account) {
    }

    /* renamed from: k */
    static /* synthetic */ void m10374k(Account account) {
    }

    /* renamed from: l */
    static /* synthetic */ void m10375l(Account account) {
    }

    /* renamed from: l */
    static /* synthetic */ void m10376l(Void voidR) {
    }

    /* renamed from: m */
    static /* synthetic */ void m10377m(Void voidR) {
    }

    /* renamed from: n */
    static /* synthetic */ void m10378n(Void voidR) {
    }

    /* renamed from: o */
    static /* synthetic */ void m10379o(Void voidR) {
    }

    /* renamed from: p */
    static /* synthetic */ void m10382p(Void voidR) {
    }

    /* renamed from: q */
    static /* synthetic */ void m10384q(Void voidR) {
    }

    /* renamed from: r */
    static /* synthetic */ void m10386r(Void voidR) {
    }

    private C5368e<Void> signOutClick() {
        return this.view.signOutClick().mo18687f(new C5419f2(this)).mo18686f();
    }

    private boolean storeExistsInAccount(Account account) {
        return account.getStore().getId() != 0;
    }

    /* renamed from: a */
    public /* synthetic */ void mo18769a(SocialMediaView.SocialMediaType socialMediaType) {
        this.myAccountNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    /* renamed from: c */
    public /* synthetic */ void mo18779c(Account account) {
        this.myAccountNavigator.navigateToUserView(account.getId(), account.getStore().getTheme());
    }

    public void checkIfStoreIsInvalidAndRefresh() {
        this.view.getLifecycleEvent().mo18681d(C5428h.f9692f).mo18687f(new C5425g2(this)).mo18681d(new C5482q0(this)).mo18687f(new C5518x1(this)).mo18687f(new C5418f1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5454l1.f9719f, (C5378b<Throwable>) C5453l0.f9718f);
    }

    /* renamed from: d */
    public /* synthetic */ void mo18785d(Account account) {
        this.myAccountNavigator.navigateToEditProfileView();
    }

    /* renamed from: e */
    public /* synthetic */ void mo18791e(Void voidR) {
        this.myAccountNavigator.navigateToLoginView(AccountAnalytics.AccountOrigins.MY_ACCOUNT);
    }

    /* renamed from: f */
    public /* synthetic */ void mo18795f(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo18796g(View.LifecycleEvent lifecycleEvent) {
        return this.view.loginClick();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo18800h(View.LifecycleEvent lifecycleEvent) {
        return this.view.userClick();
    }

    public void handleCreateStoreClick() {
        this.view.getLifecycleEvent().mo18681d(C5459m0.f9724f).mo18687f(new C5517x0(this)).mo18664b(new C5512w0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5430h1.f9694f, (C5378b<Throwable>) new C5410e(this));
    }

    public void handleLogOutClick() {
        this.view.getLifecycleEvent().mo18681d(C5508v1.f9773f).mo18687f(new C5466n1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5416f.f9678f, (C5378b<Throwable>) new C5437i2(this));
    }

    public void handleLoginClick() {
        this.view.getLifecycleEvent().mo18681d(C5405d0.f9667f).mo18687f(new C5429h0(this)).mo18664b(new C5497t0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5481q.f9746f, (C5378b<Throwable>) new C5491s(this));
    }

    public void handleProfileDisplayableClick() {
        this.view.getLifecycleEvent().mo18681d(C5404d.f9666f).mo18687f(new C5501u(this)).mo18687f(new C5449k2(this)).mo18664b(new C5471o0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5400c1.f9662f, (C5378b<Throwable>) new C5458m(this));
    }

    public void handleProfileEditClick() {
        this.view.getLifecycleEvent().mo18681d(C5431h2.f9695f).mo18687f(new C5492s0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5483q1.f9748f, (C5378b<Throwable>) new C5472o1(this));
    }

    public void handleSettingsClicked() {
        this.view.getLifecycleEvent().mo18681d(C5521y.f9787f).mo18687f(new C5488r1(this)).mo18664b(new C5526z(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5406d1.f9668f, (C5378b<Throwable>) new C5442j1(this));
    }

    public void handleStoreDisplayableClick() {
        this.view.getLifecycleEvent().mo18681d(C5493s1.f9758f).mo18687f(new C5476p(this)).mo18687f(new C5387a0(this)).mo18664b(new C5389a2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5443j2.f9707f, (C5378b<Throwable>) new C5516x(this));
    }

    public void handleStoreEditClick() {
        this.view.getLifecycleEvent().mo18681d(C5435i0.f9699f).mo18687f(new C5388a1(this)).mo18644a(this.scheduler).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C5522y0(this), (C5378b<Throwable>) new C5464n(this));
    }

    public void handleStoreEditResult() {
        this.view.getLifecycleEvent().mo18681d(C5434i.f9698f).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18687f(new C5511w(this)).mo18687f(new C5407d2(this)).mo18644a(this.scheduler).mo18664b(new C5478p1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5527z0.f9793f, (C5378b<Throwable>) new C5401c2(this));
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo18812i(View.LifecycleEvent lifecycleEvent) {
        return this.view.editUserProfileClick().mo18687f(new C5465n0(this)).mo18664b(new C5507v0(this));
    }

    /* renamed from: j */
    public /* synthetic */ void mo18817j(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo18818k(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo18821l(View.LifecycleEvent lifecycleEvent) {
        return this.view.storeClick();
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo18823m(View.LifecycleEvent lifecycleEvent) {
        return this.view.editStoreClick().mo18687f(new C5496t(this)).mo18694j(C5448k1.f9713f);
    }

    /* renamed from: n */
    public /* synthetic */ void mo18826n(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo18827o(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    public void populateAccountViews() {
        this.view.getLifecycleEvent().mo18681d(C5436i1.f9700f).mo18687f(new C5393b0(this)).mo18644a(this.scheduler).mo18664b(new C5399c0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C5417f0.f9679f, (C5378b<Throwable>) new C5477p0(this));
    }

    public void present() {
        populateAccountViews();
        checkIfStoreIsInvalidAndRefresh();
        handleLoginClick();
        handleLogOutClick();
        handleCreateStoreClick();
        handleStoreEditClick();
        handleStoreEditResult();
        handleStoreDisplayableClick();
        handleProfileEditClick();
        handleProfileDisplayableClick();
        handleSettingsClicked();
        handleAptoideTvCardViewClick();
        handleAptoideUploaderCardViewClick();
        handleAptoideBackupCardViewClick();
        handleSocialMediaPromotionClick();
    }

    /* renamed from: d */
    public /* synthetic */ void mo18787d(Void voidR) {
        this.myAccountNavigator.navigateToCreateStore();
    }

    /* renamed from: e */
    public /* synthetic */ void mo18789e(Account account) {
        this.myAccountNavigator.navigateToStoreView(account.getStore().getName(), account.getStore().getTheme());
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo18793f(Void voidR) {
        return this.accountManager.accountStatus().mo18669c();
    }

    /* renamed from: g */
    public /* synthetic */ void mo18798g(Account account) {
        this.view.showAccount(account);
    }

    /* renamed from: h */
    public /* synthetic */ void mo18801h(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo18816j(Void voidR) {
        return this.view.getStore();
    }

    /* renamed from: k */
    public /* synthetic */ void mo18820k(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: l */
    public /* synthetic */ void mo18822l(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo18825n(View.LifecycleEvent lifecycleEvent) {
        return this.myAccountNavigator.editStoreResult(EDIT_STORE_REQUEST_CODE);
    }

    /* renamed from: o */
    public /* synthetic */ void mo18828o(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18767a(Boolean bool) {
        return this.accountManager.accountStatus().mo18669c();
    }

    /* renamed from: d */
    public /* synthetic */ void mo18786d(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ void mo18799g(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: h */
    public /* synthetic */ void mo18802h(Void voidR) {
        this.myAccountNavigator.navigateToSettings();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo18815j(View.LifecycleEvent lifecycleEvent) {
        return this.view.settingsClicked();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo18819k(Void voidR) {
        return this.accountManager.logout().mo18588a(this.scheduler).mo18589a((C5377a) new C5447k0(this)).mo18590a((C5378b<? super Throwable>) new C5513w1(this)).mo18610e();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo18773b(Account account) {
        return this.view.getStore().mo18694j(C5523y1.f9789f).mo18644a(this.scheduler).mo18664b(new C5446k(this));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo18784d(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideUploaderCardViewClick();
    }

    /* renamed from: f */
    public /* synthetic */ void mo18794f(Account account) {
        this.view.showAccount(account);
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo18797g(Void voidR) {
        return this.accountManager.accountStatus().mo18669c();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo18813i(Void voidR) {
        return this.accountManager.accountStatus().mo18669c();
    }

    /* renamed from: m */
    public /* synthetic */ void mo18824m(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18766a(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* renamed from: c */
    public /* synthetic */ void mo18780c(Store store) {
        this.myAccountNavigator.navigateToEditStoreView(store, EDIT_STORE_REQUEST_CODE);
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo18792f(View.LifecycleEvent lifecycleEvent) {
        return signOutClick();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo18765a(Account account) {
        return Boolean.valueOf(!storeExistsInAccount(account) && account.hasStore());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo18778c(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideTvCardViewClick();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo18788e(View.LifecycleEvent lifecycleEvent) {
        return this.view.createStoreClick();
    }

    /* renamed from: i */
    public /* synthetic */ void mo18814i(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo18782c(Void voidR) {
        this.myAccountNavigator.navigateToUploader();
        this.accountAnalytics.sendPromoteAptoideUploaderEvent();
    }

    /* renamed from: e */
    public /* synthetic */ void mo18790e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo18774b(Store store) {
        return this.accountManager.updateAccount().mo18610e();
    }

    /* renamed from: c */
    public /* synthetic */ void mo18781c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo18770a(Store store) {
        this.view.refreshUI(store);
    }

    /* renamed from: b */
    public /* synthetic */ void mo18777b(Void voidR) {
        this.view.startAptoideTvWebView();
        this.accountAnalytics.sendPromoteAptoideTVEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18768a() {
        this.view.showLoginAccountDisplayable();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18772a(Void voidR) {
        this.myAccountNavigator.navigateToBackupApps();
        this.accountAnalytics.sendPromoteAptoideBackupAppsEvent();
    }

    /* renamed from: b */
    public /* synthetic */ void mo18776b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo18775b(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideBackupCardViewClick();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18771a(Throwable th) {
        this.crashReport.log(th);
    }
}
