package p015cm.aptoide.p016pt.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.C8450a;
import com.google.android.material.bottomnavigation.C8453c;
import com.google.android.material.snackbar.Snackbar;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.presenter.MainView;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.DeepLinkManager;
import p112n.p118g.p119b.C5305c;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.view.MainActivity */
public class MainActivity extends BottomNavigationActivity implements MainView, DeepLinkManager.DeepLinkView {
    private C12871b<String> authenticationSubject;
    private ProgressDialog autoUpdateDialog;
    @Inject
    DeepLinkManager deepLinkManager;
    /* access modifiers changed from: private */
    public C5305c<Void> installErrorsDismissEvent;
    private InstallManager installManager;
    @Inject
    MarketResourceFormatter marketResourceFormatter;
    @Inject
    Presenter presenter;
    private ProgressDialog progressDialog;
    @Inject
    Resources resources;
    private View snackBarLayout;
    private Snackbar snackbar;
    @Inject
    ThemeAnalytics themeAnalytics;
    private View updatesBadge;
    private TextView updatesNumber;

    private void handleNewIntent(Intent intent) {
        if (isAuthenticationDeepLink(intent).booleanValue()) {
            this.authenticationSubject.onNext(intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.AUTH_TOKEN));
            return;
        }
        this.deepLinkManager.showDeepLink(intent);
    }

    private Boolean isAuthenticationDeepLink(Intent intent) {
        return Boolean.valueOf(intent.getBooleanExtra(DeepLinkIntentReceiver.DeepLinksTargets.APTOIDE_AUTH, false));
    }

    private void setupUpdatesNotification() {
        C8453c cVar = (C8453c) this.bottomNavigationView.getChildAt(0);
        C8450a aVar = (C8450a) cVar.getChildAt(4);
        View inflate = LayoutInflater.from(this).inflate(C1086R.layout.updates_badge, cVar, false);
        this.updatesBadge = inflate;
        this.updatesNumber = (TextView) inflate.findViewById(C1086R.C1088id.updates_badge);
        aVar.addView(this.updatesBadge);
        aVar.setVisibility(0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15282a(View view) {
        this.installManager.retryTimedOutInstallations().mo18587a(this.installManager.cleanTimedOutInstalls()).mo18609d();
    }

    public void dismissAutoUpdateDialog() {
        ProgressDialog progressDialog2 = this.autoUpdateDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.autoUpdateDialog.dismiss();
        }
    }

    public void dismissInstallationError() {
        Snackbar snackbar2 = this.snackbar;
        if (snackbar2 != null) {
            snackbar2.mo31960b();
        }
    }

    public C5368e<Void> getInstallErrorsDismiss() {
        return this.installErrorsDismissEvent;
    }

    public Intent getIntentAfterCreate() {
        return getIntent();
    }

    public void hideLoadingView() {
        this.progressDialog.hide();
    }

    public C5368e<String> onAuthenticationIntent() {
        return this.authenticationSubject;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        this.snackBarLayout = findViewById(C1086R.C1088id.snackbar_layout);
        this.installErrorsDismissEvent = C5305c.m10045o();
        this.authenticationSubject = C12871b.m41468p();
        this.themeAnalytics.setDarkThemeUserProperty(this.themeManager.getDarkThemeMode());
        this.progressDialog = GenericDialogs.createGenericPleaseWaitDialog(this, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        setupUpdatesNotification();
        attachPresenter(this.presenter);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.autoUpdateDialog = null;
        this.installErrorsDismissEvent = null;
        this.installManager = null;
        this.updatesBadge = null;
        this.snackBarLayout = null;
        this.snackbar = null;
        this.progressDialog = null;
        this.authenticationSubject = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public void showGenericErrorMessage() {
        ShowMessage.asLongSnack((Activity) this, getString(C1086R.string.all_message_general_error));
    }

    public void showInstallationError(int i) {
        String str;
        if (i == 1) {
            str = getString(C1086R.string.f3456xaa2d1690);
        } else {
            str = getString(C1086R.string.generalscreen_short_root_install_timeout_error_message, new Object[]{Integer.valueOf(i)});
        }
        C44951 r0 = new Snackbar.C8598b() {
            public void onDismissed(Snackbar snackbar, int i) {
                super.onDismissed(snackbar, i);
                if (i == 0) {
                    MainActivity.this.installErrorsDismissEvent.call(null);
                }
            }
        };
        Snackbar a = Snackbar.m28076a(this.snackBarLayout, (CharSequence) str, -2);
        a.mo32011a((int) C1086R.string.generalscreen_short_root_install_timeout_error_action, (View.OnClickListener) new C4498a1(this));
        a.mo31956a(r0);
        Snackbar snackbar2 = a;
        this.snackbar = snackbar2;
        snackbar2.mo31972k();
    }

    public void showInstallationSuccessMessage() {
        ShowMessage.asSnack(this.snackBarLayout, (int) C1086R.string.generalscreen_short_root_install_success_install);
    }

    public void showLoadingView() {
        this.progressDialog.show();
    }

    public void showStoreAlreadyAdded() {
        ShowMessage.asLongSnack((Activity) this, getString(C1086R.string.store_already_added));
    }

    public void showStoreFollowed(String str) {
        ShowMessage.asLongSnack((Activity) this, AptoideUtils.StringU.getFormattedString(C1086R.string.store_followed, getResources(), str));
    }

    public void showUnknownErrorMessage() {
        Snackbar.m28075a(findViewById(16908290), (int) C1086R.string.unknown_error, -1).mo31972k();
    }

    public void showUpdatesBadge(int i) {
        if (i > 0) {
            this.updatesNumber.setVisibility(0);
            this.updatesNumber.setBackground(getResources().getDrawable(C1086R.C1087drawable.updates_badge_circle));
            this.updatesNumber.setTextSize(10.0f);
            this.updatesNumber.setText(String.valueOf(i));
            return;
        }
        this.updatesNumber.setVisibility(0);
        this.updatesNumber.setBackground(getResources().getDrawable(C1086R.C1087drawable.updates_badge_circle_small));
        this.updatesNumber.setTextSize(6.0f);
    }
}
