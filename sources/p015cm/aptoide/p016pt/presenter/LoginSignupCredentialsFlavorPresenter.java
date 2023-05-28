package p015cm.aptoide.p016pt.presenter;

import java.util.Collection;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.ThrowableToStringMapper;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.presenter.LoginSignupCredentialsFlavorPresenter */
public class LoginSignupCredentialsFlavorPresenter extends LoginSignUpCredentialsPresenter {
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final LoginSignUpCredentialsView view;

    public LoginSignupCredentialsFlavorPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator2, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics) {
        super(loginSignUpCredentialsView, aptoideAccountManager, crashReport2, loginSignUpCredentialsConfiguration, accountNavigator2, collection, throwableToStringMapper, accountAnalytics);
        this.view = loginSignUpCredentialsView;
        this.errorMapper = throwableToStringMapper;
        this.crashReport = crashReport2;
        this.accountNavigator = accountNavigator2;
    }

    /* renamed from: e */
    static /* synthetic */ void m6708e(Void voidR) {
    }

    /* renamed from: f */
    static /* synthetic */ void m6709f(Void voidR) {
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m6710h(Boolean bool) {
        return bool;
    }

    private void handleClickOnPrivacyPolicy() {
        this.view.getLifecycleEvent().mo18681d(C3598a1.f6644f).mo18687f(new C3696t0(this)).mo18664b(new C3686r0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3721y0.f6767f, (C5378b<Throwable>) new C3691s0(this));
    }

    private void handleClickOnTermsAndConditions() {
        this.view.getLifecycleEvent().mo18681d(C3604b1.f6650f).mo18687f(new C3610c1(this)).mo18664b(new C3632g1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3716x0.f6762f, (C5378b<Throwable>) new C3622e1(this));
    }

    private void handleConnectWithEmailClick() {
        this.view.getLifecycleEvent().mo18681d(C3681q0.f6727f).mo18687f(new C3726z0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3701u0.f6747f, (C5378b<Throwable>) new C3627f1(this));
    }

    /* renamed from: i */
    static /* synthetic */ void m6711i(Boolean bool) {
    }

    private void showTCandPP() {
        this.view.getLifecycleEvent().mo18681d(C3711w0.f6757f).mo18664b(new C3637h1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }

    /* renamed from: c */
    public /* synthetic */ void mo13448c(Void voidR) {
        this.accountNavigator.navigateToPrivacyPolicy();
    }

    /* renamed from: d */
    public /* synthetic */ void mo13449d(Void voidR) {
        this.accountNavigator.navigateToTermsAndConditions();
    }

    /* renamed from: g */
    public /* synthetic */ void mo13450g(Boolean bool) {
        this.view.showAptoideLoginArea();
    }

    /* renamed from: h */
    public /* synthetic */ void mo13451h(Throwable th) {
        this.crashReport.log(th);
    }

    public boolean handle() {
        return this.view.tryCloseLoginBottomSheet(true);
    }

    /* renamed from: i */
    public /* synthetic */ void mo13452i(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: j */
    public /* synthetic */ void mo13453j(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    public void present() {
        showTCandPP();
        super.present();
        handleConnectWithEmailClick();
        handleClickOnTermsAndConditions();
        handleClickOnPrivacyPolicy();
    }

    /* renamed from: r */
    public /* synthetic */ C5368e mo13454r(View.LifecycleEvent lifecycleEvent) {
        return this.view.privacyPolicyClickEvent();
    }

    /* renamed from: s */
    public /* synthetic */ C5368e mo13455s(View.LifecycleEvent lifecycleEvent) {
        return this.view.termsAndConditionsClickEvent();
    }

    /* renamed from: t */
    public /* synthetic */ C5368e mo13456t(View.LifecycleEvent lifecycleEvent) {
        return this.view.showAptoideLoginAreaClick().mo18664b(new C3613c4(this)).mo18681d(C3616d1.f6662f).mo18664b(new C3706v0(this)).mo18686f();
    }

    /* renamed from: u */
    public /* synthetic */ void mo13457u(View.LifecycleEvent lifecycleEvent) {
        this.view.showTCandPP();
    }
}
