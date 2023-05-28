package p015cm.aptoide.p016pt.view.settings;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0074c;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.preference.C0585g;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.SettingsManager;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.notification.NotificationSyncScheduler;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdatesFragment;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.util.SettingsConstants;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.dialog.EditableTextDialog;
import p015cm.aptoide.p016pt.view.feedback.SendFeedbackFragment;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p015cm.aptoide.p016pt.view.p031rx.RxPreference;
import p015cm.aptoide.p016pt.view.settings.InputDialog;
import p050l.p051a.p058o.C4824d;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.view.settings.SettingsFragment */
public class SettingsFragment extends C0585g implements SharedPreferences.OnSharedPreferenceChangeListener, NotBottomNavigationView {
    private static final String ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY = "Maturepin";
    private static final String ADULT_CONTENT_PREFERENCE_VIEW_KEY = "matureChkBox";
    private static final String ADULT_CONTENT_WITH_PIN_PREFERENCE_VIEW_KEY = "matureChkBoxWithPin";
    private static final String APP_THEME_PREFERENCE_KEY = "appTheme";
    private static final String DELETE_ACCOUNT = "deleteAccount";
    private static final String EXCLUDED_UPDATES_PREFERENCE_KEY = "excludedUpdates";
    private static final String PRIVACY_POLICY_PREFERENCE_KEY = "privacyPolicy";
    private static final String REMOVE_ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY = "removeMaturepin";
    private static final String SEND_FEEDBACK_PREFERENCE_KEY = "sendFeedback";
    private static final String TAG = SettingsFragment.class.getSimpleName();
    private static final String TERMS_AND_CONDITIONS_PREFERENCE_KEY = "termsConditions";
    private AptoideAccountManager accountManager;
    private AdultContentAnalytics adultContentAnalytics;
    private RxAlertDialog adultContentConfirmationDialog;
    private SwitchPreferenceCompat adultContentPreferenceView;
    private SwitchPreferenceCompat adultContentWithPinPreferenceView;
    private RxAlertDialog appThemeDialog;
    /* access modifiers changed from: private */
    public Context context;
    private Preference deleteAccount;
    private EditableTextDialog enableAdultContentPinDialog;
    private Preference excludedUpdates;
    @Inject
    FileManager fileManager;
    private InputDialog fileMaxCacheDialog;
    private Preference fileMaxCachePreferenceView;
    private FragmentNavigator fragmentNavigator;
    @Inject
    @Named
    String marketName;
    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private NotificationSyncScheduler notificationSyncScheduler;
    private Preference pinPreferenceView;
    private Preference privacyPolicy;
    private EditableTextDialog removePinDialog;
    private Preference removePinPreferenceView;
    private Preference sendFeedback;
    private EditableTextDialog setPinDialog;
    private SettingsManager settingsManager;
    private SharedPreferences sharedPreferences;
    private SwitchPreferenceCompat socialCampaignNotifications;
    private C5383b subscriptions;
    @Inject
    SupportEmailProvider supportEmailProvider;
    private Preference termsAndConditions;
    @Inject
    ThemeAnalytics themeAnalytics;
    @Inject
    ThemeManager themeManager;
    protected Toolbar toolbar;
    private boolean trackAnalytics;
    @Inject
    UpdateRepository updatesRepository;

    /* renamed from: cm.aptoide.pt.view.settings.SettingsFragment$2 */
    static /* synthetic */ class C53852 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cm.aptoide.pt.themes.ThemeManager$ThemeOption[] r0 = p015cm.aptoide.p016pt.themes.ThemeManager.ThemeOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption = r0
                cm.aptoide.pt.themes.ThemeManager$ThemeOption r1 = p015cm.aptoide.p016pt.themes.ThemeManager.ThemeOption.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.themes.ThemeManager$ThemeOption r1 = p015cm.aptoide.p016pt.themes.ThemeManager.ThemeOption.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.themes.ThemeManager$ThemeOption r1 = p015cm.aptoide.p016pt.themes.ThemeManager.ThemeOption.SYSTEM_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.settings.SettingsFragment.C53852.<clinit>():void");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10451a(DialogInterface dialogInterface, int i) {
    }

    private String getFormattedDensity(int i) {
        String str = i != 120 ? i != 160 ? i != 213 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "" : " xxxhdpi" : " xxhdpi" : " xhdpi" : " hdpi" : " tvdpi" : " mdpi" : " ldpi";
        return i + str;
    }

    private String getThemeString(ThemeManager.ThemeOption themeOption) {
        int i = C53852.$SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption[themeOption.ordinal()];
        if (i == 1) {
            return getString(C1086R.string.settings_dark_theme_dark);
        }
        if (i != 2) {
            return getString(C1086R.string.settings_dark_theme_system);
        }
        return getString(C1086R.string.settings_dark_theme_light);
    }

    private void handleDeleteAccountVisibility() {
        this.subscriptions.mo18721a(this.accountManager.accountStatus().mo18644a(C5376a.m10346b()).mo18664b(new C5456l3(this)).mo18693i());
    }

    private void handleSocialNotifications(Boolean bool) {
        this.notificationSyncScheduler.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            this.notificationSyncScheduler.schedule();
        } else {
            this.notificationSyncScheduler.removeSchedules();
        }
    }

    public static Fragment newInstance() {
        return new SettingsFragment();
    }

    private void openDeleteAccountView(String str) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1086R.string.settings_url_delete_account, str), getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    private void rollbackCheck(SwitchPreferenceCompat switchPreferenceCompat) {
        switchPreferenceCompat.mo3277f(!switchPreferenceCompat.mo3117X());
    }

    private void setAdultContentContent() {
        if (this.settingsManager.showAdultContent()) {
            this.adultContentConfirmationDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.are_you_adult).setPositiveButton(C1086R.string.yes).setNegativeButton(C1086R.string.f3457no).build();
            this.enableAdultContentPinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.request_adult_pin).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).setView(C1086R.layout.dialog_request_input).setEditText(C1086R.C1088id.input).build();
            this.removePinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.request_adult_pin).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).setView(C1086R.layout.dialog_request_input).setEditText(C1086R.C1088id.input).build();
            this.setPinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.asksetadultpinmessage).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).setView(C1086R.layout.dialog_request_input).setEditText(C1086R.C1088id.input).build();
        }
    }

    private void setAdultContentViews() {
        if (this.settingsManager.showAdultContent()) {
            this.adultContentPreferenceView = (SwitchPreferenceCompat) findPreference(ADULT_CONTENT_PREFERENCE_VIEW_KEY);
            this.adultContentWithPinPreferenceView = (SwitchPreferenceCompat) findPreference(ADULT_CONTENT_WITH_PIN_PREFERENCE_VIEW_KEY);
            this.pinPreferenceView = findPreference(ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY);
            this.removePinPreferenceView = findPreference(REMOVE_ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY);
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("adultContent");
        if (preferenceCategory != null) {
            getPreferenceScreen().mo3243e(preferenceCategory);
        }
    }

    private void setGDPR() {
        if (this.settingsManager.showGDPR()) {
            this.termsAndConditions = findPreference(TERMS_AND_CONDITIONS_PREFERENCE_KEY);
            this.privacyPolicy = findPreference(PRIVACY_POLICY_PREFERENCE_KEY);
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("about");
        Preference findPreference = findPreference(TERMS_AND_CONDITIONS_PREFERENCE_KEY);
        Preference findPreference2 = findPreference(PRIVACY_POLICY_PREFERENCE_KEY);
        if (findPreference != null) {
            preferenceCategory.mo3243e(findPreference);
        }
        if (findPreference2 != null) {
            preferenceCategory.mo3243e(findPreference2);
        }
    }

    private void setupAdultContentClickHandlers() {
        if (this.settingsManager.showAdultContent()) {
            this.subscriptions.mo18721a(this.adultContentConfirmationDialog.positiveClicks().mo18664b(new C5420f3(this)).mo18687f(new C5494s2(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.adultContentConfirmationDialog.negativeClicks().mo18664b(new C5475o4(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.enableAdultContentPinDialog.negativeClicks().mo18664b(new C5473o2(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(RxPreference.clicks(this.adultContentWithPinPreferenceView).mo18687f(new C5463m4(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.removePinDialog.positiveClicks().mo18687f(new C5402c3(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.enableAdultContentPinDialog.positiveClicks().mo18664b(new C5433h4(this)).mo18687f(new C5509v2(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.accountManager.hasMatureContentEnabled().mo18644a(C5376a.m10346b()).mo18664b(new C5520x3(this)).mo18664b(new C5495s3(this)).mo18693i());
            this.subscriptions.mo18721a(RxPreference.clicks(this.adultContentPreferenceView).mo18687f(new C5462m3(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(RxPreference.clicks(this.pinPreferenceView).mo18664b(new C5396b3(this)).mo18693i());
            this.subscriptions.mo18721a(RxPreference.clicks(this.fileMaxCachePreferenceView).mo18664b(new C5391a4(this)).mo18693i());
            this.subscriptions.mo18721a(this.accountManager.pinRequired().mo18644a(C5376a.m10346b()).mo18664b(new C5397b4(this)).mo18693i());
            this.subscriptions.mo18721a(RxPreference.clicks(this.removePinPreferenceView).mo18664b(new C5515w3(this)).mo18693i());
            this.subscriptions.mo18721a(this.setPinDialog.positiveClicks().mo18681d(C5390a3.f9652f).mo18687f(new C5469n4(this)).mo18686f().mo18693i());
            this.subscriptions.mo18721a(this.fileMaxCacheDialog.positiveClicks().mo18681d(C5415e4.f9677f).mo18694j(C5480p3.f9745f).mo18697k(C5468n3.f9733f).mo18664b(new C5408d3(this)).mo18686f().mo18693i());
        }
    }

    private void setupAppTheme() {
        Preference findPreference = findPreference(APP_THEME_PREFERENCE_KEY);
        findPreference.mo3142a((CharSequence) getThemeString(this.themeManager.getThemeOption()));
        ThemeManager.ThemeOption[] values = ThemeManager.ThemeOption.values();
        ThemeManager.ThemeOption themeOption = this.themeManager.getThemeOption();
        CharSequence[] charSequenceArr = new CharSequence[values.length];
        int i = 0;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].equals(themeOption)) {
                i = i2;
            }
            charSequenceArr[i2] = getThemeString(values[i2]);
        }
        this.appThemeDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setTitleSmall(C1086R.string.settings_dark_theme_dialog_title).setSingleChoiceItems(charSequenceArr, i).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).build();
        this.subscriptions.mo18721a(RxPreference.clicks(findPreference).mo18664b(new C5403c4(this)).mo18693i());
        this.subscriptions.mo18721a(this.appThemeDialog.positiveClicks().mo18694j(new C5510v3(this, values)).mo18664b(new C5426g3(this, findPreference, charSequenceArr)).mo18686f().mo18693i());
    }

    private void setupClickHandlers() {
        handleDeleteAccountVisibility();
        Preference findPreference = findPreference(SettingsConstants.CHECK_AUTO_UPDATE);
        findPreference.mo3197b((CharSequence) this.marketResourceFormatter.formatString(getContext(), C1086R.string.setting_category_autoupdate_title, new String[0]));
        findPreference.mo3142a((CharSequence) this.marketResourceFormatter.formatString(getContext(), C1086R.string.setting_category_autoupdate_message, new String[0]));
        this.subscriptions.mo18721a(RxPreference.clicks(this.deleteAccount).mo18687f(new C5432h3(this)).mo18669c().mo18664b(new C5451k4(this)).mo18693i());
        this.subscriptions.mo18721a(RxPreference.clicks(this.socialCampaignNotifications).mo18675c(new C5474o3(this)));
        this.subscriptions.mo18721a(RxPreference.clicks(this.excludedUpdates).mo18675c(new C5485q3(this)));
        this.subscriptions.mo18721a(RxPreference.clicks(this.sendFeedback).mo18675c(new C5519x2(this)));
        if (this.settingsManager.showGDPR()) {
            this.subscriptions.mo18721a(RxPreference.clicks(this.termsAndConditions).mo18675c(new C5427g4(this)));
            this.subscriptions.mo18721a(RxPreference.clicks(this.privacyPolicy).mo18675c(new C5450k3(this)));
        }
        findPreference(SettingsConstants.FILTER_APPS).mo3184a((Preference.C0564d) new C5414e3(this));
        findPreference(SettingsConstants.CLEAR_CACHE).mo3184a((Preference.C0564d) new C5490r3(this));
        findPreference(SettingsConstants.HARDWARE_SPECS).mo3184a((Preference.C0564d) new C5444j3(this, getFormattedDensity(AptoideUtils.ScreenU.getDensityDpi(getActivity().getWindowManager()))));
        findPreference(SettingsConstants.ABOUT_DIALOG).mo3184a((Preference.C0564d) new Preference.C0564d() {
            public boolean onPreferenceClick(Preference preference) {
                String str;
                int i;
                View inflate = LayoutInflater.from(SettingsFragment.this.context).inflate(C1086R.layout.dialog_about, (ViewGroup) null);
                try {
                    str = SettingsFragment.this.getActivity().getPackageManager().getPackageInfo(SettingsFragment.this.getActivity().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    CrashReport.getInstance().log(e);
                    str = "";
                }
                try {
                    i = SettingsFragment.this.getActivity().getPackageManager().getPackageInfo(SettingsFragment.this.getActivity().getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e2) {
                    CrashReport.getInstance().log(e2);
                    i = 0;
                }
                ((TextView) inflate.findViewById(C1086R.C1088id.aptoide_version)).setText(SettingsFragment.this.getString(C1086R.string.version) + " " + str + " (" + i + ")");
                ((TextView) inflate.findViewById(C1086R.C1088id.credits)).setMovementMethod(LinkMovementMethod.getInstance());
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C1086R.C1088id.contact_layout);
                ((TextView) inflate.findViewById(C1086R.C1088id.contact_text)).setText(SettingsFragment.this.supportEmailProvider.getEmail());
                if (SettingsFragment.this.supportEmailProvider.isAptoideSupport()) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(4);
                }
                C0074c.C0075a aVar = new C0074c.C0075a(new C4824d(SettingsFragment.this.context, SettingsFragment.this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId));
                aVar.mo229b(inflate);
                aVar.mo230b((CharSequence) SettingsFragment.this.getString(C1086R.string.settings_about_us));
                aVar.mo212a(17301569);
                aVar.mo233c(17039370, (DialogInterface.OnClickListener) C5461m2.f9726f);
                aVar.mo225a().show();
                return true;
            }
        });
        setupAdultContentClickHandlers();
    }

    private void setupFileMaxCacheDialog() {
        this.fileMaxCacheDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.settings_maxFileCache_title).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).setView(C1086R.layout.dialog_request_input).setEditText(C1086R.C1088id.input).build();
    }

    private boolean shouldRefreshUpdates(String str) {
        return str.equals(ManagedKeys.UPDATES_FILTER_ALPHA_BETA_KEY) || str.equals(ManagedKeys.HWSPECS_FILTER) || str.equals(ManagedKeys.UPDATES_SYSTEM_APPS_KEY);
    }

    /* access modifiers changed from: private */
    /* renamed from: trackLock */
    public void mo18866h() {
        if (this.trackAnalytics) {
            this.trackAnalytics = false;
            this.adultContentAnalytics.lock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: trackUnlock */
    public void mo18862f() {
        if (this.trackAnalytics) {
            this.trackAnalytics = false;
            this.adultContentAnalytics.unlock();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo18835a(View view) {
        getActivity().onBackPressed();
    }

    /* renamed from: b */
    public /* synthetic */ void mo18846b(Account account) {
        openDeleteAccountView(account.getEmail());
    }

    /* renamed from: c */
    public /* synthetic */ void mo18855c(Throwable th) {
        ShowMessage.asSnack((Fragment) this, (int) C1086R.string.ws_error_SYS_1);
        th.printStackTrace();
    }

    /* renamed from: e */
    public /* synthetic */ void mo18860e() {
        this.adultContentWithPinPreferenceView.mo3209d(true);
    }

    /* renamed from: f */
    public /* synthetic */ void mo18863f(Preference preference) {
        this.appThemeDialog.show();
    }

    /* renamed from: g */
    public /* synthetic */ void mo18865g(Preference preference) {
        this.fragmentNavigator.navigateTo(ExcludedUpdatesFragment.newInstance(), true);
    }

    /* renamed from: h */
    public /* synthetic */ void mo18867h(Preference preference) {
        this.fragmentNavigator.navigateTo(SendFeedbackFragment.newInstance(), true);
    }

    /* renamed from: i */
    public /* synthetic */ void mo18869i(Preference preference) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1086R.string.all_url_terms_conditions), getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    /* renamed from: k */
    public /* synthetic */ boolean mo18871k(Preference preference) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) preference;
        boolean z = false;
        if (switchPreferenceCompat.mo3117X()) {
            switchPreferenceCompat.mo3277f(true);
            z = true;
        } else {
            switchPreferenceCompat.mo3277f(false);
        }
        ManagerPreferences.setHWSpecsFilter(z, this.sharedPreferences);
        return true;
    }

    /* renamed from: l */
    public /* synthetic */ boolean mo18872l(Preference preference) {
        ProgressDialog createGenericPleaseWaitDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        this.subscriptions.mo18721a(GenericDialogs.createGenericContinueCancelMessage(getContext(), getString(C1086R.string.storage_dialog_title, this.marketName), getString(C1086R.string.clear_cache_dialog_message), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18681d(C5438i3.f9702f).mo18664b(new C5514w2(createGenericPleaseWaitDialog)).mo18687f(new C5409d4(this)).mo18644a(C5376a.m10346b()).mo18673c((C5377a) new C5439i4(createGenericPleaseWaitDialog)).mo18655a(new C5421f4(this), (C5378b<Throwable>) new C5504u2(this)));
        return false;
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo18873m(Preference preference) {
        return this.accountManager.accountStatus();
    }

    /* renamed from: n */
    public /* synthetic */ void mo18874n(Preference preference) {
        handleSocialNotifications(Boolean.valueOf(((SwitchPreferenceCompat) preference).mo3117X()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((BaseActivity) getContext()).getActivityComponent().inject(this);
        this.trackAnalytics = true;
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.subscriptions = new C5383b();
        this.fragmentNavigator = ((ActivityResultNavigator) getActivity()).getFragmentNavigator();
        this.notificationSyncScheduler = ((AptoideApplication) getContext().getApplicationContext()).getNotificationSyncScheduler();
        ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker().registerScreen(ScreenTagHistory.Builder.build(SettingsFragment.class.getSimpleName()));
        this.adultContentAnalytics = ((AptoideApplication) getContext().getApplicationContext()).getAdultContentAnalytics();
        this.settingsManager = ((AptoideApplication) getContext().getApplicationContext()).getSettingsManager();
        setAdultContentContent();
        setupFileMaxCacheDialog();
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(C1086R.xml.settings);
        SharedPreferences defaultSharedPreferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.sharedPreferences = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        this.subscriptions.mo18720a();
        this.toolbar = null;
        this.adultContentPreferenceView = null;
        this.adultContentWithPinPreferenceView = null;
        this.socialCampaignNotifications = null;
        this.pinPreferenceView = null;
        this.fileMaxCachePreferenceView = null;
        this.removePinPreferenceView = null;
        this.excludedUpdates = null;
        this.sendFeedback = null;
        this.termsAndConditions = null;
        this.privacyPolicy = null;
        this.deleteAccount = null;
        this.context = null;
        super.onDestroyView();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
        if (shouldRefreshUpdates(str)) {
            this.updatesRepository.sync(true, false, true).mo18594a((C5377a) C5524y2.f9790f, (C5378b<? super Throwable>) C5529z2.f9795f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.context = getContext();
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        C0076d dVar = (C0076d) getActivity();
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null) {
            dVar.setSupportActionBar(toolbar2);
            this.toolbar.setTitle((int) C1086R.string.settings_title_settings);
            this.toolbar.setNavigationOnClickListener(new C5525y3(this));
            C0069a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo188d(true);
            }
        }
        setAdultContentViews();
        this.excludedUpdates = findPreference(EXCLUDED_UPDATES_PREFERENCE_KEY);
        this.sendFeedback = findPreference(SEND_FEEDBACK_PREFERENCE_KEY);
        setGDPR();
        setupAppTheme();
        this.deleteAccount = findPreference(DELETE_ACCOUNT);
        this.socialCampaignNotifications = (SwitchPreferenceCompat) findPreference(ManagedKeys.CAMPAIGN_SOCIAL_NOTIFICATIONS_PREFERENCE_VIEW_KEY);
        this.fileMaxCachePreferenceView = findPreference(ManagedKeys.MAX_FILE_CACHE);
        setupClickHandlers();
    }

    /* renamed from: a */
    public /* synthetic */ ThemeManager.ThemeOption mo18830a(ThemeManager.ThemeOption[] themeOptionArr, DialogInterface dialogInterface) {
        return themeOptionArr[this.appThemeDialog.getCheckedItem()];
    }

    /* renamed from: e */
    public /* synthetic */ void mo18861e(Preference preference) {
        this.removePinDialog.show();
    }

    /* renamed from: g */
    public /* synthetic */ void mo18864g() {
        this.adultContentWithPinPreferenceView.mo3209d(true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo18836a(Preference preference, CharSequence[] charSequenceArr, ThemeManager.ThemeOption themeOption) {
        preference.mo3142a(charSequenceArr[this.appThemeDialog.getCheckedItem()]);
        this.themeManager.setThemeOption(themeOption);
        this.themeManager.resetToBaseTheme();
        this.themeAnalytics.sendThemeChangedEvent(themeOption, TAG);
        this.themeAnalytics.setDarkThemeUserProperty(this.themeManager.getDarkThemeMode());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo18843b(DialogInterface dialogInterface) {
        return this.accountManager.enable().mo18589a((C5377a) new C5500t3(this)).mo18588a(C5376a.m10346b()).mo18601b((C5377a) new C5505u3(this)).mo18610e();
    }

    /* renamed from: c */
    public /* synthetic */ void mo18851c() {
        this.adultContentPreferenceView.mo3209d(true);
    }

    /* renamed from: d */
    public /* synthetic */ void mo18858d(DialogInterface dialogInterface) {
        rollbackCheck(this.adultContentWithPinPreferenceView);
    }

    /* renamed from: j */
    public /* synthetic */ void mo18870j(Preference preference) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1086R.string.all_url_privacy_policy), getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    /* renamed from: c */
    public /* synthetic */ void mo18852c(DialogInterface dialogInterface) {
        rollbackCheck(this.adultContentPreferenceView);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo18850c(CharSequence charSequence) {
        return this.accountManager.enable(Integer.valueOf(charSequence.toString()).intValue()).mo18589a((C5377a) new C5455l2(this)).mo18588a(C5376a.m10346b()).mo18590a((C5378b<? super Throwable>) new C5467n2(this)).mo18601b((C5377a) new C5499t2(this)).mo18610e();
    }

    /* renamed from: d */
    public /* synthetic */ void mo18859d(Preference preference) {
        this.fileMaxCacheDialog.showWithInput(String.valueOf(ManagerPreferences.getCacheLimit(this.sharedPreferences)));
    }

    /* renamed from: i */
    public /* synthetic */ void mo18868i() {
        this.adultContentPreferenceView.mo3209d(true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo18837a(Account account) {
        this.deleteAccount.mo3212e(account.isLoggedIn());
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo18856d(CharSequence charSequence) {
        return this.accountManager.requirePin(Integer.valueOf(charSequence.toString()).intValue()).mo18610e();
    }

    /* renamed from: b */
    public /* synthetic */ void mo18848b(CharSequence charSequence) {
        this.adultContentWithPinPreferenceView.mo3209d(false);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18832a(GenericDialogs.EResponse eResponse) {
        return this.fileManager.deleteCache(true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo18849b(Throwable th) {
        if (th instanceof SecurityException) {
            ShowMessage.asSnack((Activity) getActivity(), (int) C1086R.string.adult_pin_wrong);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo18853c(Preference preference) {
        this.setPinDialog.show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18840a(Long l) {
        ShowMessage.asSnack((Fragment) this, AptoideUtils.StringU.getFormattedString(C1086R.string.freed_space, getContext().getResources(), AptoideUtils.StringU.formatBytes(l.longValue(), false)));
    }

    /* renamed from: b */
    public /* synthetic */ void mo18847b(Boolean bool) {
        this.adultContentWithPinPreferenceView.mo3277f(bool.booleanValue());
    }

    /* renamed from: c */
    public /* synthetic */ void mo18854c(Boolean bool) {
        if (bool.booleanValue()) {
            this.pinPreferenceView.mo3212e(false);
            this.removePinPreferenceView.mo3212e(true);
            this.adultContentWithPinPreferenceView.mo3212e(true);
            this.adultContentPreferenceView.mo3212e(false);
            return;
        }
        this.pinPreferenceView.mo3212e(true);
        this.removePinPreferenceView.mo3212e(false);
        this.adultContentWithPinPreferenceView.mo3212e(false);
        this.adultContentPreferenceView.mo3212e(true);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo18844b(Preference preference) {
        if (((SwitchPreferenceCompat) preference).mo3117X()) {
            this.adultContentConfirmationDialog.show();
            return C5368e.m10265n();
        }
        this.adultContentPreferenceView.mo3209d(false);
        return this.accountManager.disable().mo18589a((C5377a) new C5489r2(this)).mo18588a(C5376a.m10346b()).mo18601b((C5377a) new C5445j4(this)).mo18610e();
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo18842a(String str, Preference preference) {
        C0074c.C0075a aVar = new C0074c.C0075a(this.context, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        aVar.mo230b((CharSequence) getString(C1086R.string.setting_hwspecstitle));
        aVar.mo212a(17301569);
        aVar.mo220a((CharSequence) getString(C1086R.string.setting_sdk_version) + ": " + AptoideUtils.SystemU.getSdkVer() + "\n" + getString(C1086R.string.setting_screen_size) + ": " + AptoideUtils.ScreenU.getScreenSize(getContext().getResources()) + "\n" + getString(C1086R.string.setting_esgl_version) + ": " + AptoideUtils.SystemU.getGlEsVer((ActivityManager) getContext().getSystemService("activity")) + "\n" + getString(C1086R.string.screenCode) + ": " + AptoideUtils.ScreenU.getNumericScreenSize(getContext().getResources()) + "/" + AptoideUtils.ScreenU.getDensityDpi((WindowManager) getContext().getSystemService("window")) + "\n" + getString(C1086R.string.cpuAbi) + ": " + AptoideUtils.SystemU.getAbis() + "\n" + getString(C1086R.string.setting_density) + ": " + str);
        aVar.mo222a(false);
        aVar.mo231b((CharSequence) getString(17039370), (DialogInterface.OnClickListener) C5484q2.f9749f);
        aVar.mo225a().show();
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo18834a(DialogInterface dialogInterface) {
        this.adultContentPreferenceView.mo3209d(false);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18831a(Preference preference) {
        if (((SwitchPreferenceCompat) preference).mo3117X()) {
            this.enableAdultContentPinDialog.show();
            return C5368e.m10265n();
        }
        this.adultContentWithPinPreferenceView.mo3209d(false);
        return this.accountManager.disable().mo18589a((C5377a) new C5457l4(this)).mo18588a(C5376a.m10346b()).mo18601b((C5377a) new C5479p2(this)).mo18610e();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18833a(CharSequence charSequence) {
        return this.accountManager.removePin(Integer.valueOf(charSequence.toString()).intValue()).mo18588a(C5376a.m10346b()).mo18590a((C5378b<? super Throwable>) new C5530z3(this)).mo18610e();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18841a(Throwable th) {
        if (th instanceof SecurityException) {
            ShowMessage.asSnack((Activity) getActivity(), (int) C1086R.string.adult_pin_wrong);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo18838a(Boolean bool) {
        this.adultContentPreferenceView.mo3277f(bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ void mo18839a(Integer num) {
        ManagerPreferences.setCacheLimit(num.intValue(), this.sharedPreferences);
    }
}
