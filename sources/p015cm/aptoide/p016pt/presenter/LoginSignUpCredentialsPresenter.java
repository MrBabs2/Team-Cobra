package p015cm.aptoide.p016pt.presenter;

import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.FacebookLoginResult;
import p015cm.aptoide.p016pt.account.FacebookSignUpAdapter;
import p015cm.aptoide.p016pt.account.FacebookSignUpException;
import p015cm.aptoide.p016pt.account.GoogleSignUpAdapter;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.BackButton;
import p015cm.aptoide.p016pt.view.ThrowableToStringMapper;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.presenter.LoginSignUpCredentialsPresenter */
public abstract class LoginSignUpCredentialsPresenter implements Presenter, BackButton.ClickHandler {
    private static final int RESOLVE_GOOGLE_CREDENTIALS_REQUEST_CODE = 2;
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final LoginSignUpCredentialsConfiguration configuration;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final Collection<String> permissions;
    private final LoginSignUpCredentialsView view;

    public LoginSignUpCredentialsPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator2, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics2) {
        this.view = loginSignUpCredentialsView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport2;
        this.configuration = loginSignUpCredentialsConfiguration;
        this.accountNavigator = accountNavigator2;
        this.permissions = collection;
        this.errorMapper = throwableToStringMapper;
        this.accountAnalytics = accountAnalytics2;
    }

    /* renamed from: b */
    static /* synthetic */ void m6666b(Account account) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6667b(ConnectionResult connectionResult) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6668b(Void voidR) {
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m6669d(Boolean bool) {
        return bool;
    }

    /* renamed from: e */
    static /* synthetic */ void m6670e(Boolean bool) {
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m6671f(Boolean bool) {
        return bool;
    }

    private void handleAccountStatusChangeWhileShowingView() {
        this.view.getLifecycleEvent().mo18681d(C3680q.f6726f).mo18692i(new C3665n(this)).mo18664b(new C3609c0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C3626f0.f6672f, (C5378b<Throwable>) C3636h0.f6682f);
    }

    private void handleFacebookSignUpEvent() {
        this.view.getLifecycleEvent().mo18681d(C3685r.f6731f).mo18664b(new C3651k0(this)).mo18687f(new C3614d(this)).mo18664b(new C3661m0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3700u.f6746f, (C5378b<Throwable>) new C3650k(this));
    }

    private void handleFacebookSignUpResult() {
        this.view.getLifecycleEvent().mo18681d(C3710w.f6756f).mo18687f(new C3597a0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }

    private void handleFacebookSignUpWithRequiredPermissionsEvent() {
        this.view.getLifecycleEvent().mo18681d(C3715x.f6761f).mo18687f(new C3725z(this)).mo18664b(new C3705v(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3602b.f6648f, (C5378b<Throwable>) new C3656l0(this));
    }

    private void handleGoogleSignUpEvent() {
        this.view.getLifecycleEvent().mo18681d(C3646j0.f6692f).mo18664b(new C3670o(this)).mo18687f(new C3690s(this)).mo18664b(new C3671o0(this)).mo18692i(new C3640i(this)).mo18644a(C5376a.m10346b()).mo18664b(new C3596a(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3630g.f6676f, (C5378b<Throwable>) new C3641i0(this));
    }

    private void handleGoogleSignUpResult() {
        this.view.getLifecycleEvent().mo18681d(C3608c.f6654f).mo18687f(new C3615d0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }

    private void handleOpenOptions() {
        this.view.getLifecycleEvent().mo18681d(C3675p.f6721f).mo18664b(new C3666n0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3631g0.f6677f, (C5378b<Throwable>) C3625f.f6671f);
    }

    private void navigateBack() {
        this.accountNavigator.popView();
    }

    private void navigateToMainView() {
        if (this.configuration.getDismissToNavigateToMainView()) {
            this.view.dismiss();
        } else if (this.configuration.getCleanBackStack()) {
            navigateToMainViewCleaningBackStack();
        } else {
            navigateBack();
        }
    }

    private void navigateToMainViewCleaningBackStack() {
        this.accountNavigator.navigateToHomeView();
    }

    /* renamed from: q */
    static /* synthetic */ void m6681q(View.LifecycleEvent lifecycleEvent) {
    }

    private void showOrHideFacebookSignUp() {
        if (this.accountManager.isSignUpEnabled(FacebookSignUpAdapter.TYPE)) {
            this.view.showFacebookLogin();
        } else {
            this.view.hideFacebookLogin();
        }
    }

    private void showOrHideGoogleSignUp() {
        if (this.accountManager.isSignUpEnabled(GoogleSignUpAdapter.TYPE)) {
            this.view.showGoogleLogin();
        } else {
            this.view.hideGoogleLogin();
        }
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13418a(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().mo18669c().mo18700m();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13429b(Boolean bool) {
        this.view.showLoading();
        this.accountAnalytics.sendGoogleLoginButtonPressed();
    }

    /* renamed from: c */
    public /* synthetic */ Single mo13431c(Boolean bool) {
        return this.accountNavigator.navigateToGoogleSignUpForResult(2);
    }

    /* renamed from: d */
    public /* synthetic */ void mo13437d(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* renamed from: e */
    public /* synthetic */ void mo13439e(Throwable th) {
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
        this.accountAnalytics.sendLoginErrorEvent(AccountAnalytics.LoginMethod.GOOGLE, th);
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo13442h(View.LifecycleEvent lifecycleEvent) {
        return this.accountNavigator.googleSignUpResults(2).mo18689g(new C3660m(this)).mo18686f();
    }

    /* renamed from: i */
    public /* synthetic */ void mo13443i(View.LifecycleEvent lifecycleEvent) {
        if (this.configuration.getHasMagicLinkError()) {
            this.view.showAptoideLoginArea();
            this.view.showMagicLinkError(this.configuration.getMagicLinkErrorMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void lockScreenRotation() {
        this.view.lockScreenRotation();
    }

    /* access modifiers changed from: package-private */
    public void navigateToCreateProfile() {
        this.accountNavigator.navigateToCreateProfileView();
    }

    public void present() {
        handleOpenOptions();
        handleGoogleSignUpEvent();
        handleGoogleSignUpResult();
        handleFacebookSignUpResult();
        handleFacebookSignUpEvent();
        handleFacebookSignUpWithRequiredPermissionsEvent();
        handleAccountStatusChangeWhileShowingView();
    }

    /* access modifiers changed from: package-private */
    public void showNotCheckedMessage(boolean z) {
        if (!z) {
            this.view.showTermsConditionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void unlockScreenRotation() {
        this.view.unlockScreenRotation();
    }

    /* renamed from: c */
    public /* synthetic */ void mo13433c() {
        this.accountAnalytics.loginSuccess();
        navigateToMainView();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13428b(View.LifecycleEvent lifecycleEvent) {
        showOrHideFacebookSignUp();
    }

    /* renamed from: f */
    public /* synthetic */ void mo13440f(View.LifecycleEvent lifecycleEvent) {
        showOrHideGoogleSignUp();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo13441g(View.LifecycleEvent lifecycleEvent) {
        return this.view.googleSignUpEvent().mo18664b(new C3619d4(this)).mo18681d(C3645j.f6691f).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13422a(Account account) {
        if (account.isLoggedIn()) {
            navigateBack();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo13427b() {
        this.view.hideLoading();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo13432c(View.LifecycleEvent lifecycleEvent) {
        return this.view.facebookSignUpEvent().mo18664b(new C3619d4(this)).mo18681d(C3720y.f6766f).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ void mo13436d() {
        this.view.hideLoading();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo13438e(View.LifecycleEvent lifecycleEvent) {
        return this.view.facebookSignUpWithRequiredPermissionsInEvent();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13430b(Throwable th) {
        if ((th instanceof FacebookSignUpException) && ((FacebookSignUpException) th).getCode() == 1) {
            this.view.showFacebookPermissionsRequiredError(th);
        }
        this.accountAnalytics.sendLoginErrorEvent(AccountAnalytics.LoginMethod.FACEBOOK, th);
        this.crashReport.log(th);
        this.view.showError(this.errorMapper.map(th));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo13435d(View.LifecycleEvent lifecycleEvent) {
        return this.accountNavigator.facebookSignUpResults().mo18689g(new C3635h(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13423a(ConnectionResult connectionResult) {
        if (!connectionResult.mo24846t()) {
            this.view.showConnectionError(connectionResult);
            this.view.hideLoading();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo13434c(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13420a(GoogleSignInResult googleSignInResult) {
        return this.accountManager.signUp(GoogleSignUpAdapter.TYPE, googleSignInResult).mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C3603b0(this)).mo18601b((C5377a) new C3621e0(this)).mo18590a((C5378b<? super Throwable>) new C3620e(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13424a(Boolean bool) {
        this.view.showLoading();
        this.accountAnalytics.sendFacebookLoginButtonPressed();
        this.accountNavigator.navigateToFacebookSignUpForResult(this.permissions);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13425a(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13426a(Void voidR) {
        this.view.showLoading();
        this.accountNavigator.navigateToFacebookSignUpForResult(this.permissions);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13419a(FacebookLoginResult facebookLoginResult) {
        return this.accountManager.signUp(FacebookSignUpAdapter.TYPE, facebookLoginResult).mo18588a(C5376a.m10346b()).mo18589a((C5377a) new C3695t(this)).mo18601b((C5377a) new C3676p0(this)).mo18590a((C5378b<? super Throwable>) new C3655l(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13421a() {
        this.accountAnalytics.loginSuccess();
        navigateToMainView();
    }
}
