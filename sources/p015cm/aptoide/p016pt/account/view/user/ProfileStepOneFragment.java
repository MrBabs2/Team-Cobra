package p015cm.aptoide.p016pt.account.view.user;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.LoginSignupManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepOneFragment */
public class ProfileStepOneFragment extends BaseToolbarFragment implements ProfileStepOneView, NotBottomNavigationView {
    public static final String IS_EXTERNAL_LOGIN = "facebook_google";
    private static final int LAYOUT = 2131493048;
    @Inject
    AccountAnalytics accountAnalytics;
    @Inject
    AccountNavigator accountNavigator;
    private Button continueBtn;
    private boolean externalLogin;
    @Inject
    LoginSignupManager loginSignupManager;
    private Button moreInfoBtn;
    @Inject
    ScreenOrientationManager orientationManager;
    @Inject
    ThemeManager themeManager;
    private ProgressDialog waitDialog;

    public static ProfileStepOneFragment newInstance() {
        return new ProfileStepOneFragment();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo6596a(Void voidR) {
        return Boolean.valueOf(this.externalLogin);
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.continueBtn = (Button) view.findViewById(C1086R.C1088id.logged_in_continue);
        this.moreInfoBtn = (Button) view.findViewById(C1086R.C1088id.logged_in_more_info_button);
    }

    public C5368e<Boolean> continueButtonClick() {
        return C10695a.m36221a(this.continueBtn).mo18694j(new C1251b0(this));
    }

    public void dismissWaitDialog() {
        this.orientationManager.unlock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.waitDialog.dismiss();
        }
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_profile_step_one;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ProfileStepOneFragment.class.getSimpleName());
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle != null) {
            this.externalLogin = bundle.getBoolean(IS_EXTERNAL_LOGIN, false);
        }
    }

    public C5368e<Void> moreInfoButtonClick() {
        return C10695a.m36221a(this.moreInfoBtn);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.waitDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId, getContext().getString(C1086R.string.please_wait));
    }

    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.waitDialog.dismiss();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(IS_EXTERNAL_LOGIN, this.externalLogin);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        loadExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar) {
        super.setupToolbarDetails(toolbar);
        toolbar.setTitle((int) C1086R.string.create_profile_logged_in_activity_title);
    }

    public void setupViews() {
        super.setupViews();
        attachPresenter(new ProfileStepOnePresenter(this, CrashReport.getInstance(), ((AptoideApplication) getActivity().getApplicationContext()).getAccountManager(), this.accountNavigator, this.accountAnalytics, this.loginSignupManager));
    }

    public C5328b showGenericErrorMessage() {
        return ShowMessage.asLongObservableSnack((Fragment) this, (int) C1086R.string.unknown_error);
    }

    public void showWaitDialog() {
        this.orientationManager.lock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && !progressDialog.isShowing()) {
            this.waitDialog.show();
        }
    }
}
