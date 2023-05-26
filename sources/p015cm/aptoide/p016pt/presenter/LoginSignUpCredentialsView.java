package p015cm.aptoide.p016pt.presenter;

import android.content.Context;
import p015cm.aptoide.p016pt.account.view.GooglePlayServicesView;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.presenter.LoginSignUpCredentialsView */
public interface LoginSignUpCredentialsView extends GooglePlayServicesView {
    void dismiss();

    C5368e<Boolean> facebookSignUpEvent();

    C5368e<Void> facebookSignUpWithRequiredPermissionsInEvent();

    Context getApplicationContext();

    C5368e<Boolean> googleSignUpEvent();

    void hideFacebookLogin();

    void hideGoogleLogin();

    void hideKeyboard();

    void hideLoading();

    void lockScreenRotation();

    C5368e<Void> privacyPolicyClickEvent();

    void setCobrandText();

    void showAptoideLoginArea();

    C5368e<Boolean> showAptoideLoginAreaClick();

    void showError(String str);

    void showFacebookLogin();

    void showFacebookPermissionsRequiredError(Throwable th);

    void showGoogleLogin();

    void showLoading();

    void showMagicLinkError(String str);

    void showTCandPP();

    void showTermsConditionError();

    C5368e<Void> termsAndConditionsClickEvent();

    boolean tryCloseLoginBottomSheet(boolean z);

    void unlockScreenRotation();
}
