package p015cm.aptoide.p016pt.account.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.C0430c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.login.SendMagicLinkView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.magiclink.MagicLinkView;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkPresenter;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.presenter.CompositePresenter;
import p015cm.aptoide.p016pt.presenter.LoginSignUpCredentialsView;
import p015cm.aptoide.p016pt.presenter.LoginSignupCredentialsFlavorPresenter;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment */
public class LoginSignUpCredentialsFragment extends GooglePlayServicesFragment implements LoginSignUpCredentialsView, MagicLinkView, NotBottomNavigationView {
    public static final String CLEAN_BACK_STACK = "clean_back_stack";
    public static final String DISMISS_TO_NAVIGATE_TO_MAIN_VIEW = "dismiss_to_navigate_to_main_view";
    public static final String HAS_MAGIC_LINK_ERROR = "has_magic_link_error";
    public static final String MAGIC_LINK_ERROR_MESSAGE = "magic_link_error_message";
    private static final String USERNAME_KEY = "username_key";
    @Inject
    AccountAnalytics accountAnalytics;
    private BottomSheetBehavior<View> bottomSheetBehavior;
    private Drawable checkboxDrawable;
    private Button connectWithEmailButton;
    private RxAlertDialog facebookEmailRequiredDialog;
    private View facebookLoginButton;
    private Button googleLoginButton;
    private View loginSignupSelectionArea;
    @Inject
    @Named
    String marketName;
    @Inject
    ScreenOrientationManager orientationManager;
    @Inject
    LoginSignupCredentialsFlavorPresenter presenter;
    /* access modifiers changed from: private */
    public C12871b<Void> privacyPolicySubject;
    private ProgressDialog progressDialog;
    private View rootView;
    @Inject
    SendMagicLinkPresenter sendMagicLinkPresenter;
    private SendMagicLinkView sendMagicLinkView;
    private View socialLoginArea;
    private TextView termsAndConditions;
    /* access modifiers changed from: private */
    public C12871b<Void> termsAndConditionsSubject;
    private CheckBox termsConditionsCheckBox;
    @Inject
    ThemeManager themeManager;

    /* renamed from: a */
    static /* synthetic */ Void m4393a(DialogInterface dialogInterface) {
        return null;
    }

    /* access modifiers changed from: private */
    public void changeBottomSheetHeight(int i) {
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.mo31083e(5);
            this.bottomSheetBehavior.mo31078c((int) (((float) i) * getResources().getDisplayMetrics().density));
            this.bottomSheetBehavior.mo31083e(4);
        }
    }

    private AccountAnalytics.StartupClickOrigin getStartupClickOrigin() {
        return AccountAnalytics.StartupClickOrigin.MAIN;
    }

    private void hideSocialLoginArea() {
        this.socialLoginArea.setVisibility(8);
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2) {
        return newInstance(z, z2, false, "");
    }

    private void setAptoideLoginAreaVisible() {
        this.sendMagicLinkView.setVisibility(0);
        this.termsAndConditions.setVisibility(8);
        this.termsConditionsCheckBox.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo6365a(Void voidR) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo6368b(Void voidR) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo6370c(Void voidR) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    public void dismiss() {
        getActivity().finish();
    }

    public C5368e<Boolean> facebookSignUpEvent() {
        return C10695a.m36221a(this.facebookLoginButton).mo18694j(new C1319x0(this)).mo18664b(new C1160a1(this));
    }

    public C5368e<Void> facebookSignUpWithRequiredPermissionsInEvent() {
        return this.facebookEmailRequiredDialog.positiveClicks().mo18694j(C1245u0.f3676f);
    }

    public Context getApplicationContext() {
        return getActivity().getApplicationContext();
    }

    public C5368e<String> getEmailTextChangeEvent() {
        return this.sendMagicLinkView.getEmailChangeEvent();
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(LoginSignUpCredentialsFragment.class.getSimpleName());
    }

    public C5368e<String> getMagicLinkClick() {
        return this.sendMagicLinkView.getMagicLinkSubmit();
    }

    public C5368e<Void> getSecureLoginTextClick() {
        return this.sendMagicLinkView.getSecureLoginTextClick();
    }

    public C5368e<Boolean> googleSignUpEvent() {
        return C10695a.m36221a(this.googleLoginButton).mo18694j(new C1323z0(this)).mo18664b(new C1317w0(this));
    }

    public void hideFacebookLogin() {
        this.facebookLoginButton.setVisibility(8);
    }

    public void hideGoogleLogin() {
        this.googleLoginButton.setVisibility(8);
    }

    public void hideKeyboard() {
        super.hideKeyboard();
    }

    public void hideLoading() {
        this.progressDialog.dismiss();
    }

    public void lockScreenRotation() {
        this.orientationManager.lock();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        getActivity().getWindow().setSoftInputMode(16);
        this.privacyPolicySubject = C12871b.m41468p();
        this.termsAndConditionsSubject = C12871b.m41468p();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.fragment_login_sign_up_credentials, viewGroup, false);
    }

    public void onDestroy() {
        this.privacyPolicySubject = null;
        this.termsAndConditionsSubject = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        getActivity().getWindow().setSoftInputMode(32);
        unregisterClickHandler(this.presenter);
        unlockScreenRotation();
        this.termsAndConditions = null;
        this.sendMagicLinkView = null;
        this.termsConditionsCheckBox = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.rootView = getActivity().findViewById(16908290);
        this.googleLoginButton = (Button) view.findViewById(C1086R.C1088id.google_login_button);
        this.facebookLoginButton = view.findViewById(C1086R.C1088id.fb_login_button);
        this.loginSignupSelectionArea = view.findViewById(C1086R.C1088id.login_signup_selection_layout);
        this.sendMagicLinkView = (SendMagicLinkView) view.findViewById(C1086R.C1088id.send_magic_link_view);
        this.socialLoginArea = view.findViewById(C1086R.C1088id.social_login_area);
        this.connectWithEmailButton = (Button) view.findViewById(C1086R.C1088id.show_login_with_aptoide_area);
        this.facebookEmailRequiredDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.facebook_email_permission_regected_message).setPositiveButton(C1086R.string.facebook_grant_permission_button).setNegativeButton(17039360).build();
        this.termsConditionsCheckBox = (CheckBox) view.findViewById(C1086R.C1088id.tc_checkbox);
        this.termsAndConditions = (TextView) view.findViewById(C1086R.C1088id.terms_and_conditions);
        this.progressDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        try {
            this.bottomSheetBehavior = BottomSheetBehavior.m27260b(view.getRootView().findViewById(C1086R.C1088id.login_signup_layout));
        } catch (IllegalArgumentException unused) {
        }
        attachPresenter(new CompositePresenter(Arrays.asList(new Presenter[]{this.presenter, this.sendMagicLinkPresenter})));
        registerClickHandler(this.presenter);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    public C5368e<Void> privacyPolicyClickEvent() {
        return this.privacyPolicySubject;
    }

    public void removeLoadingScreen() {
        hideKeyboard();
        hideLoading();
    }

    public void removeTextFieldError() {
        this.sendMagicLinkView.resetTextFieldError();
    }

    public void setCobrandText() {
    }

    public void setEmailInvalidError() {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(getString(C1086R.string.login_error_invalid_email), true));
    }

    public void setInitialState() {
        this.sendMagicLinkView.setState(SendMagicLinkView.State.Initial.INSTANCE);
    }

    public void setLoadingScreen() {
        showLoading();
    }

    public void showAptoideLoginArea() {
        setAptoideLoginAreaVisible();
        hideSocialLoginArea();
        this.termsConditionsCheckBox.setVisibility(8);
        this.termsAndConditions.setVisibility(8);
    }

    public C5368e<Boolean> showAptoideLoginAreaClick() {
        return C10695a.m36221a(this.connectWithEmailButton).mo18694j(new C1315v0(this));
    }

    public void showError(String str) {
        Snackbar.m28076a(this.rootView, (CharSequence) str, 0).mo31972k();
    }

    public void showFacebookLogin() {
        this.facebookLoginButton.setVisibility(0);
    }

    public void showFacebookPermissionsRequiredError(Throwable th) {
        if (!this.facebookEmailRequiredDialog.isShowing()) {
            this.facebookEmailRequiredDialog.show();
        }
    }

    public void showGoogleLogin() {
        this.googleLoginButton.setVisibility(0);
    }

    public void showLoading() {
        this.progressDialog.show();
    }

    public void showMagicLinkError(String str) {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(str, false));
    }

    public void showTCandPP() {
        this.checkboxDrawable = C0430c.m2127a(this.termsConditionsCheckBox);
        this.termsConditionsCheckBox.setVisibility(0);
        C11562 r0 = new ClickableSpan() {
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.termsAndConditionsSubject != null) {
                    LoginSignUpCredentialsFragment.this.termsAndConditionsSubject.onNext(null);
                }
            }
        };
        C11573 r2 = new ClickableSpan() {
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.privacyPolicySubject != null) {
                    LoginSignUpCredentialsFragment.this.privacyPolicySubject.onNext(null);
                }
            }
        };
        String string = getString(C1086R.string.terms_and_conditions_privacy_sign_up_message);
        String string2 = getString(C1086R.string.settings_terms_conditions);
        String string3 = getString(C1086R.string.settings_privacy_policy);
        String format = String.format(string, new Object[]{string2, string3});
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(r0, format.indexOf(string2), format.indexOf(string2) + string2.length(), 33);
        spannableString.setSpan(r2, format.indexOf(string3), format.indexOf(string3) + string3.length(), 33);
        this.termsAndConditions.setText(spannableString);
        this.termsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        this.termsAndConditions.setVisibility(0);
    }

    public void showTermsConditionError() {
        Snackbar a = Snackbar.m28076a(this.rootView, (CharSequence) getString(C1086R.string.signup_message_no_tandc_error), -1);
        if (getResources().getConfiguration().orientation == 1) {
            a.mo31956a(new Snackbar.C8598b() {
                public void onDismissed(Snackbar snackbar, int i) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(298);
                }

                public void onShown(Snackbar snackbar) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(330);
                }
            });
        }
        a.mo31972k();
        Drawable.ConstantState constantState = this.checkboxDrawable.getConstantState();
        if (constantState != null) {
            Drawable mutate = constantState.newDrawable().mutate();
            mutate.setColorFilter(getResources().getColor(C1086R.color.red), PorterDuff.Mode.SRC_ATOP);
            this.termsConditionsCheckBox.setButtonDrawable(mutate);
        }
        this.termsConditionsCheckBox.setOnCheckedChangeListener(new C1321y0(this));
    }

    public void showUnknownError() {
        showMagicLinkError(getString(C1086R.string.all_message_general_error));
    }

    public C5368e<Void> termsAndConditionsClickEvent() {
        return this.termsAndConditionsSubject;
    }

    public boolean tryCloseLoginBottomSheet(boolean z) {
        if (this.sendMagicLinkView.getVisibility() != 0) {
            return false;
        }
        this.sendMagicLinkView.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(0);
        this.socialLoginArea.setVisibility(0);
        if (!z) {
            return true;
        }
        this.termsConditionsCheckBox.setVisibility(0);
        this.termsAndConditions.setVisibility(0);
        return true;
    }

    public void unlockScreenRotation() {
        this.orientationManager.unlock();
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2, boolean z3, String str) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment = new LoginSignUpCredentialsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DISMISS_TO_NAVIGATE_TO_MAIN_VIEW, z);
        bundle.putBoolean(CLEAN_BACK_STACK, z2);
        bundle.putBoolean("has_magic_link_error", z3);
        bundle.putString("magic_link_error_message", str);
        loginSignUpCredentialsFragment.setArguments(bundle);
        return loginSignUpCredentialsFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo6367a(Boolean bool) {
        this.accountAnalytics.clickIn(AccountAnalytics.StartupClick.CONNECT_FACEBOOK, getStartupClickOrigin());
    }

    /* renamed from: b */
    public /* synthetic */ void mo6369b(Boolean bool) {
        this.accountAnalytics.clickIn(AccountAnalytics.StartupClick.CONNECT_GOOGLE, getStartupClickOrigin());
    }

    /* renamed from: a */
    public /* synthetic */ void mo6366a(CompoundButton compoundButton, boolean z) {
        this.termsConditionsCheckBox.setButtonDrawable(this.checkboxDrawable);
    }
}
