package p015cm.aptoide.p016pt.account.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.presenter.LoginSignUpView;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;

/* renamed from: cm.aptoide.pt.account.view.LoginSignUpFragment */
public class LoginSignUpFragment extends BaseToolbarFragment implements LoginSignUpView, NotBottomNavigationView {
    private static final String ACCOUNT_TYPE = "account_type";
    private static final String AUTH_TYPE = "auth_type";
    private static final String BOTTOM_SHEET_WITH_BOTTOM_BAR = "bottom_sheet_expanded";
    private static final String DISMISS_TO_NAVIGATE_TO_MAIN_VIEW = "dismiss_to_navigate_to_main_view";
    public static final String HAS_MAGIC_LINK_ERROR = "has_magic_link_error";
    private static final String IS_NEW_ACCOUNT = "is_new_account";
    private static final String IS_WIZARD = "is_wizard";
    public static final String MAGIC_LINK_ERROR_MESSAGE = "magic_link_error_message";
    private static final String NAVIGATE_TO_HOME = "clean_back_stack";
    private BottomSheetBehavior<View> bottomSheetBehavior;
    private boolean dismissToNavigateToMainView;
    private boolean hasMagicLinkError;
    private boolean isWizard;
    private LoginBottomSheet loginBottomSheet;
    private String magicLinkErrorMessage;
    private View mainContent;
    private boolean navigateToHome;
    private int originalBottomPadding;
    private LoginSignUpPresenter presenter;
    private String toolbarTitle;
    private boolean withBottomBar;

    public static LoginSignUpFragment newInstance(boolean z, boolean z2, boolean z3, boolean z4) {
        return newInstance(z, z2, z3, "", "", true, z4, false, "");
    }

    public void bindViews(View view) {
        super.bindViews(view);
        try {
            this.bottomSheetBehavior = BottomSheetBehavior.m27260b(view.findViewById(C1086R.C1088id.login_signup_layout));
        } catch (IllegalArgumentException unused) {
        }
        if (this.bottomSheetBehavior != null) {
            View findViewById = view.findViewById(C1086R.C1088id.main_content);
            this.mainContent = findViewById;
            this.originalBottomPadding = this.withBottomBar ? findViewById.getPaddingBottom() : 0;
            this.toolbarTitle = getString(C1086R.string.my_account_title_my_account);
            this.mainContent.setPadding(0, 0, 0, this.originalBottomPadding);
            this.bottomSheetBehavior.mo31083e(4);
        }
    }

    public boolean bottomSheetIsExpanded() {
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.bottomSheetBehavior;
        return bottomSheetBehavior2 != null && bottomSheetBehavior2.mo31077c() == 3;
    }

    public void collapseBottomSheet() {
        this.loginBottomSheet.collapse();
        this.mainContent.setPadding(0, 0, 0, this.originalBottomPadding);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return hasToolbar();
    }

    public void expandBottomSheet() {
        this.loginBottomSheet.expand();
        this.mainContent.setPadding(0, 0, 0, 0);
    }

    public int getContentViewId() {
        return this.isWizard ? C1086R.layout.fragment_login_signup_wizard_layout : C1086R.layout.fragment_login_sign_up;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(LoginSignUpFragment.class.getSimpleName());
    }

    /* access modifiers changed from: protected */
    public boolean hasToolbar() {
        return this.toolbarTitle != null;
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.withBottomBar = bundle.getBoolean(BOTTOM_SHEET_WITH_BOTTOM_BAR);
        this.dismissToNavigateToMainView = bundle.getBoolean("dismiss_to_navigate_to_main_view");
        this.navigateToHome = bundle.getBoolean("clean_back_stack");
        this.isWizard = bundle.getBoolean(IS_WIZARD);
        this.hasMagicLinkError = bundle.getBoolean("has_magic_link_error");
        String string = bundle.getString("magic_link_error_message");
        this.magicLinkErrorMessage = string;
        if (string == null) {
            this.magicLinkErrorMessage = "";
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof LoginBottomSheet) {
            this.loginBottomSheet = (LoginBottomSheet) context;
            return;
        }
        throw new IllegalStateException("Context should implement " + LoginBottomSheet.class.getSimpleName());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onDestroyView() {
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.mo31075b((BottomSheetBehavior.C8460e) null);
            this.bottomSheetBehavior = null;
        }
        LoginSignUpPresenter loginSignUpPresenter = this.presenter;
        if (loginSignUpPresenter != null) {
            unregisterClickHandler(loginSignUpPresenter);
        }
        super.onDestroyView();
    }

    public void setBottomSheetState(int i) {
        this.bottomSheetBehavior.mo31083e(4);
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) "");
    }

    public void setupViews() {
        super.setupViews();
        LoginSignUpPresenter loginSignUpPresenter = new LoginSignUpPresenter(this, getFragmentChildNavigator(C1086R.C1088id.login_signup_layout), this.dismissToNavigateToMainView, this.navigateToHome, this.hasMagicLinkError, this.magicLinkErrorMessage);
        this.presenter = loginSignUpPresenter;
        attachPresenter(loginSignUpPresenter);
        registerClickHandler(this.presenter);
        this.bottomSheetBehavior.mo31075b((BottomSheetBehavior.C8460e) this.presenter);
        this.bottomSheetBehavior.mo31071a(false);
        this.bottomSheetBehavior.mo31081d(true);
    }

    public static LoginSignUpFragment newInstance(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return newInstance(z, z2, z3, "", "", true, z4, z5, str);
    }

    public static LoginSignUpFragment newInstance(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, boolean z6, String str3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(BOTTOM_SHEET_WITH_BOTTOM_BAR, z);
        bundle.putBoolean("dismiss_to_navigate_to_main_view", z2);
        bundle.putBoolean("clean_back_stack", z3);
        bundle.putString("account_type", str);
        bundle.putString("auth_type", str2);
        bundle.putBoolean(IS_NEW_ACCOUNT, z4);
        bundle.putBoolean(IS_WIZARD, z5);
        bundle.putBoolean("has_magic_link_error", z6);
        bundle.putString("magic_link_error_message", str3);
        LoginSignUpFragment loginSignUpFragment = new LoginSignUpFragment();
        loginSignUpFragment.setArguments(bundle);
        return loginSignUpFragment;
    }
}
