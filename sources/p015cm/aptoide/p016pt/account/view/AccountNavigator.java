package p015cm.aptoide.p016pt.account.view;

import android.content.Intent;
import android.net.Uri;
import com.facebook.C6365d;
import com.facebook.C6366e;
import com.facebook.FacebookException;
import com.facebook.login.C6527g;
import com.facebook.login.C6533h;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Collection;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.FacebookLoginResult;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreViewModel;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepTwoFragment;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p112n.p118g.p119b.C5305c;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.account.view.AccountNavigator */
public class AccountNavigator {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final ActivityNavigator activityNavigator;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final C6365d callbackManager;
    private final GoogleApiClient client;
    private final C6527g facebookLoginManager;
    /* access modifiers changed from: private */
    public final C5305c<FacebookLoginResult> facebookLoginSubject;
    private final FragmentNavigator fragmentNavigator;
    private final String recoverPasswordUrl;
    private final ThemeManager themeManager;

    public AccountNavigator(BottomNavigationNavigator bottomNavigationNavigator2, FragmentNavigator fragmentNavigator2, AptoideAccountManager aptoideAccountManager, ActivityNavigator activityNavigator2, C6527g gVar, C6365d dVar, GoogleApiClient googleApiClient, C5305c<FacebookLoginResult> cVar, String str, AccountAnalytics accountAnalytics2, ThemeManager themeManager2) {
        this.bottomNavigationNavigator = bottomNavigationNavigator2;
        this.fragmentNavigator = fragmentNavigator2;
        this.accountManager = aptoideAccountManager;
        this.activityNavigator = activityNavigator2;
        this.facebookLoginManager = gVar;
        this.callbackManager = dVar;
        this.client = googleApiClient;
        this.facebookLoginSubject = cVar;
        this.recoverPasswordUrl = str;
        this.accountAnalytics = accountAnalytics2;
        this.themeManager = themeManager2;
    }

    /* renamed from: a */
    static /* synthetic */ FacebookLoginResult m4347a(Result result, FacebookLoginResult facebookLoginResult) {
        return facebookLoginResult;
    }

    /* renamed from: a */
    public /* synthetic */ ConnectionResult mo6281a(int i) throws Exception {
        ConnectionResult a = this.client.mo24938a();
        if (a.mo24846t()) {
            this.activityNavigator.navigateForResult(Auth.f13432f.mo24750a(this.client), i);
        }
        return a;
    }

    public void clearBackStackUntilLogin() {
        for (int i = 0; i < this.fragmentNavigator.getBackStackEntryCount(); i++) {
            String tagByBackStackEntry = this.fragmentNavigator.getTagByBackStackEntry(i);
            if (this.fragmentNavigator.getFragment(tagByBackStackEntry) instanceof LoginSignUpFragment) {
                this.fragmentNavigator.popBackStackUntil(tagByBackStackEntry);
                return;
            }
        }
    }

    public C5368e<FacebookLoginResult> facebookSignUpResults() {
        return C5368e.m10247a(this.activityNavigator.results().mo18681d(new C1164c(this)), this.facebookLoginSubject, C1167d.f3590f);
    }

    public C5368e<GoogleSignInResult> googleSignUpResults(int i) {
        return this.activityNavigator.results(i).mo18694j(C1158a.f3581f).mo18664b(new C1161b(this));
    }

    public void navigateToAccountView(AccountAnalytics.AccountOrigins accountOrigins) {
        if (this.accountManager.isLoggedIn()) {
            this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
            return;
        }
        this.accountAnalytics.enterAccountScreen(accountOrigins);
        this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false), true);
    }

    public void navigateToCreateProfileView() {
        this.fragmentNavigator.navigateTo(ManageUserFragment.newInstanceToCreate(), true);
    }

    public void navigateToCreateStoreView() {
        this.fragmentNavigator.navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), true), true);
    }

    public void navigateToFacebookSignUpForResult(Collection<String> collection) {
        this.facebookLoginManager.mo21215a(this.callbackManager, (C6366e<C6533h>) new C6366e<C6533h>() {
            public void onCancel() {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult((C6533h) null, 1, (FacebookException) null));
            }

            public void onError(FacebookException facebookException) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult((C6533h) null, 99, facebookException));
            }

            public void onSuccess(C6533h hVar) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(hVar, 0, (FacebookException) null));
            }
        });
        this.facebookLoginManager.mo21218b(this.activityNavigator.getActivity(), collection);
    }

    public Single<ConnectionResult> navigateToGoogleSignUpForResult(int i) {
        return Single.m10126b(new C1170e(this, i)).mo18563b(Schedulers.m10352io());
    }

    public void navigateToHomeView() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void navigateToLoginError() {
        this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false, true, this.activityNavigator.getActivity().getString(C1086R.string.login_error_magic_link_expired)), true);
    }

    public void navigateToPrivacyPolicy() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1086R.string.all_url_privacy_policy), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public void navigateToProfileStepTwoView() {
        this.fragmentNavigator.navigateTo(ProfileStepTwoFragment.newInstance(), true);
    }

    public void navigateToRecoverPasswordView() {
        this.activityNavigator.navigateTo(Uri.parse(this.recoverPasswordUrl));
    }

    public void navigateToTermsAndConditions() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1086R.string.all_url_terms_conditions), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public void popView() {
        this.fragmentNavigator.popBackStack();
    }

    public void popViewWithResult(int i, boolean z) {
        this.fragmentNavigator.popWithResult(new Result(i, z ? -1 : 0, (Intent) null));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6283a(GoogleSignInResult googleSignInResult) {
        this.client.mo24949d();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo6282a(Result result) {
        return Boolean.valueOf(this.callbackManager.onActivityResult(result.getRequestCode(), result.getResultCode(), result.getData()));
    }
}
