package p015cm.aptoide.p016pt.account.view;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.presenter.LoginSignUpView;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.BackButton;

/* renamed from: cm.aptoide.pt.account.view.LoginSignUpPresenter */
public class LoginSignUpPresenter extends BottomSheetBehavior.C8460e implements Presenter, BackButton.ClickHandler {
    private static final String TAG = "cm.aptoide.pt.account.view.LoginSignUpPresenter";
    private final boolean dismissToNavigateToMainView;
    private boolean hasMagicLinkError;
    private String magicLinkErrorMessage;
    private final boolean navigateToHome;
    private final FragmentNavigator navigatorChild;
    private final LoginSignUpView view;

    public LoginSignUpPresenter(LoginSignUpView loginSignUpView, FragmentNavigator fragmentNavigator, boolean z, boolean z2, boolean z3, String str) {
        this.view = loginSignUpView;
        this.navigatorChild = fragmentNavigator;
        this.dismissToNavigateToMainView = z;
        this.navigateToHome = z2;
        this.hasMagicLinkError = z3;
        this.magicLinkErrorMessage = str;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m4400b(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6425a(View.LifecycleEvent lifecycleEvent) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment;
        try {
            loginSignUpCredentialsFragment = (LoginSignUpCredentialsFragment) this.navigatorChild.getFragment();
        } catch (ClassCastException e) {
            Logger.getInstance().mo12981e(TAG, (Throwable) e);
            loginSignUpCredentialsFragment = null;
        }
        if (loginSignUpCredentialsFragment == null) {
            this.navigatorChild.navigateToWithoutBackSave(LoginSignUpCredentialsFragment.newInstance(this.dismissToNavigateToMainView, this.navigateToHome, this.hasMagicLinkError, this.magicLinkErrorMessage), true);
        }
    }

    public boolean handle() {
        if (!this.view.bottomSheetIsExpanded()) {
            return false;
        }
        this.view.setBottomSheetState(4);
        return true;
    }

    public void onSlide(android.view.View view2, float f) {
    }

    public void onStateChanged(android.view.View view2, int i) {
        if (i == 3) {
            this.view.expandBottomSheet();
        } else if (i == 4) {
            this.view.collapseBottomSheet();
        }
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C1166c1.f3589f).mo18664b(new C1163b1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18693i();
    }
}
