package p015cm.aptoide.p016pt.account.view.user;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepTwoFragment */
public class ProfileStepTwoFragment extends BaseToolbarFragment implements ProfileStepTwoView, NotBottomNavigationView {
    private static final int LAYOUT = 2131493049;
    @Inject
    AccountAnalytics accountAnalytics;
    private AccountNavigator accountNavigator;
    private Button continueBtn;
    private TextView createProfileTitle;
    private boolean externalLogin;
    @Inject
    LoginSignupManager loginSignupManager;
    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private Button privateProfileBtn;
    @Inject
    ThemeManager themeManager;
    private ProgressDialog waitDialog;

    public static ProfileStepTwoFragment newInstance() {
        return new ProfileStepTwoFragment();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo6616a(Void voidR) {
        return Boolean.valueOf(this.externalLogin);
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo6617b(Void voidR) {
        return Boolean.valueOf(this.externalLogin);
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.continueBtn = (Button) view.findViewById(C1086R.C1088id.logged_in_continue);
        this.privateProfileBtn = (Button) view.findViewById(C1086R.C1088id.logged_in_private_button);
        TextView textView = (TextView) view.findViewById(C1086R.C1088id.create_profile_title);
        this.createProfileTitle = textView;
        textView.setText(this.marketResourceFormatter.formatString(getContext(), C1086R.string.create_profile_pub_pri, new String[0]));
    }

    public C5368e<Boolean> continueButtonClick() {
        return C10695a.m36221a(this.continueBtn).mo18694j(new C1301t0(this));
    }

    public void dismissWaitDialog() {
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.waitDialog.dismiss();
        }
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_profile_step_two;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ProfileStepTwoFragment.class.getSimpleName());
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle != null) {
            this.externalLogin = bundle.getBoolean(ProfileStepOneFragment.IS_EXTERNAL_LOGIN, false);
        }
    }

    public C5368e<Boolean> makePrivateProfileButtonClick() {
        return C10695a.m36221a(this.privateProfileBtn).mo18694j(new C1303u0(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
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
        bundle.putBoolean(ProfileStepOneFragment.IS_EXTERNAL_LOGIN, this.externalLogin);
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
        attachPresenter(new ProfileStepTwoPresenter(this, ((AptoideApplication) getContext().getApplicationContext()).getAccountManager(), CrashReport.getInstance(), this.accountNavigator, this.accountAnalytics, this.loginSignupManager));
    }

    public C5328b showGenericErrorMessage() {
        return C5328b.m10169d(new C1305v0(this)).mo18587a(ShowMessage.asLongObservableSnack((Fragment) this, (int) C1086R.string.unknown_error));
    }

    public void showWaitDialog() {
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog != null && !progressDialog.isShowing()) {
            this.waitDialog.show();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo6618b() {
        this.waitDialog.dismiss();
    }
}
