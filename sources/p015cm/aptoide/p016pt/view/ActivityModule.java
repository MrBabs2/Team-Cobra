package p015cm.aptoide.p016pt.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.view.WindowManager;
import androidx.appcompat.app.C0076d;
import androidx.fragment.app.C0462h;
import com.facebook.C6365d;
import com.facebook.login.C6527g;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Map;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AppShortcutsAnalytics;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.DeepLinkAnalytics;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.ImagePickerNavigator;
import p015cm.aptoide.p016pt.account.view.PhotoFileGenerator;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreNavigator;
import p015cm.aptoide.p016pt.account.view.user.ManageUserNavigator;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.view.AppViewNavigator;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateRepository;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateService;
import p015cm.aptoide.p016pt.autoupdate.Service;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationAnalytics;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreRepository;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallCompletedNotifier;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentResultNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.notification.ContentPuller;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationSyncScheduler;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p015cm.aptoide.p016pt.permission.PermissionProvider;
import p015cm.aptoide.p016pt.presenter.MainPresenter;
import p015cm.aptoide.p016pt.presenter.MainView;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.ApkFyManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.view.DeepLinkManager;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsNavigator;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p015cm.aptoide.p016pt.view.settings.MyAccountNavigator;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallAnalytics;
import p015cm.aptoide.p016pt.wallet.WalletInstallConfiguration;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p015cm.aptoide.p016pt.wallet.WalletInstallNavigator;
import p015cm.aptoide.p016pt.wallet.WalletInstallPresenter;
import p015cm.aptoide.p016pt.wallet.WalletInstallView;
import p112n.p118g.p119b.C5303a;
import p112n.p118g.p119b.C5305c;
import p123rx.p124l.p125c.C5376a;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.ActivityModule */
public class ActivityModule {
    private final C0076d activity;
    private final String fileProviderAuthority;
    private final boolean firstCreated;
    private final Intent intent;
    private final NotificationSyncScheduler notificationSyncScheduler;
    private final View view;

    public ActivityModule(C0076d dVar, Intent intent2, NotificationSyncScheduler notificationSyncScheduler2, View view2, boolean z, String str) {
        this.activity = dVar;
        this.intent = intent2;
        this.notificationSyncScheduler = notificationSyncScheduler2;
        this.view = view2;
        this.firstCreated = z;
        this.fileProviderAuthority = str;
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AccountNavigator provideAccountNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, C6365d dVar, GoogleApiClient googleApiClient, AccountAnalytics accountAnalytics, BottomNavigationNavigator bottomNavigationNavigator, ThemeManager themeManager) {
        return new AccountNavigator(bottomNavigationNavigator, fragmentNavigator, aptoideAccountManager, (ActivityNavigator) this.activity, C6527g.m13804b(), dVar, googleApiClient, C5305c.m10045o(), "http://m.aptoide.com/account/password-recovery", accountAnalytics, themeManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AccountPermissionProvider provideAccountPermissionProvider() {
        return new AccountPermissionProvider((PermissionProvider) this.activity);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ApkFyManager provideApkFy(@Named("secureShared") SharedPreferences sharedPreferences) {
        return new ApkFyManager(this.activity, this.intent, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AutoUpdateManager provideAutoUpdateManager(DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, @Named("local-version-code") int i, AutoUpdateRepository autoUpdateRepository) {
        return new AutoUpdateManager(downloadFactory, permissionManager, installManager, downloadAnalytics, i, autoUpdateRepository, Build.VERSION.SDK_INT, ((AptoideApplication) this.activity.getApplication()).getDefaultSharedPreferences());
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public BottomNavigationMapper provideBottomNavigationMapper() {
        return new BottomNavigationMapper();
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public BottomNavigationNavigator provideBottomNavigationNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        return new BottomNavigationNavigator(fragmentNavigator, bottomNavigationAnalytics, searchAnalytics, themeManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public int provideClientSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public DeepLinkManager provideDeepLinkManager(StoreUtilsProxy storeUtilsProxy, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator, SearchNavigator searchNavigator, @Named("default") SharedPreferences sharedPreferences, RoomStoreRepository roomStoreRepository, NavigationTracker navigationTracker, SearchAnalytics searchAnalytics, DeepLinkAnalytics deepLinkAnalytics, AppShortcutsAnalytics appShortcutsAnalytics, AptoideAccountManager aptoideAccountManager, StoreAnalytics storeAnalytics, AdsRepository adsRepository, AppNavigator appNavigator, InstallManager installManager, NewFeature newFeature, ThemeManager themeManager, ThemeAnalytics themeAnalytics, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        AppShortcutsAnalytics appShortcutsAnalytics2 = appShortcutsAnalytics;
        AptoideAccountManager aptoideAccountManager2 = aptoideAccountManager;
        return new DeepLinkManager(storeUtilsProxy, fragmentNavigator, bottomNavigationNavigator, searchNavigator, (DeepLinkManager.DeepLinkView) this.activity, sharedPreferences, roomStoreRepository, navigationTracker, searchAnalytics, appShortcutsAnalytics2, aptoideAccountManager2, deepLinkAnalytics, storeAnalytics, adsRepository, appNavigator, installManager, newFeature, themeManager, themeAnalytics, readyToInstallNotificationManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public C0462h provideFragmentManager() {
        return this.activity.getSupportFragmentManager();
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ImagePickerNavigator provideImagePickerNavigator() {
        return new ImagePickerNavigator((ActivityNavigator) this.activity);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ListStoreAppsNavigator provideListStoreAppsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new ListStoreAppsNavigator(fragmentNavigator, appNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public int provideLocalVersionCode(@Named("package-name") String str) {
        try {
            return this.activity.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public FragmentNavigator provideMainFragmentNavigator(Map<Integer, Result> map, C5303a<Map<Integer, Result>> aVar, C0462h hVar) {
        return new FragmentResultNavigator(hVar, C1086R.C1088id.fragment_placeholder, 17432576, 17432577, map, aVar);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public Presenter provideMainPresenter(RootInstallationRetryHandler rootInstallationRetryHandler, ApkFyManager apkFyManager, InstallManager installManager, @Named("default") SharedPreferences sharedPreferences, @Named("secureShared") SharedPreferences sharedPreferences2, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, DeepLinkManager deepLinkManager, BottomNavigationNavigator bottomNavigationNavigator, UpdatesManager updatesManager, AutoUpdateManager autoUpdateManager, RootAvailabilityManager rootAvailabilityManager, BottomNavigationMapper bottomNavigationMapper, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AgentPersistence agentPersistence) {
        InstallManager installManager2 = installManager;
        CrashReport instance = CrashReport.getInstance();
        ContentPuller contentPuller = r8;
        ContentPuller contentPuller2 = new ContentPuller(this.activity);
        NotificationSyncScheduler notificationSyncScheduler2 = this.notificationSyncScheduler;
        InstallCompletedNotifier installCompletedNotifier = r14;
        MainView mainView = (MainView) this.view;
        InstallCompletedNotifier installCompletedNotifier2 = new InstallCompletedNotifier(C5305c.m10045o(), installManager, CrashReport.getInstance());
        return new MainPresenter(mainView, installManager2, rootInstallationRetryHandler, instance, apkFyManager, contentPuller, notificationSyncScheduler2, installCompletedNotifier, sharedPreferences, sharedPreferences2, fragmentNavigator, deepLinkManager, this.firstCreated, (AptoideBottomNavigator) this.activity, C5376a.m10346b(), Schedulers.m10352io(), bottomNavigationNavigator, updatesManager, autoUpdateManager, (PermissionService) this.activity, rootAvailabilityManager, bottomNavigationMapper, aptoideAccountManager, accountNavigator, agentPersistence);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ManageStoreNavigator provideManageStoreNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        return new ManageStoreNavigator(fragmentNavigator, bottomNavigationNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ManageUserNavigator provideManageUserNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        return new ManageUserNavigator(fragmentNavigator, bottomNavigationNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public MyAccountNavigator provideMyAccountNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator, AppNavigator appNavigator, ThemeManager themeManager, SocialMediaNavigator socialMediaNavigator) {
        return new MyAccountNavigator(fragmentNavigator, accountNavigator, appNavigator, themeManager, socialMediaNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public String providePackageName() {
        return this.activity.getPackageName();
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public PhotoFileGenerator providePhotoFileGenerator() {
        C0076d dVar = this.activity;
        return new PhotoFileGenerator(dVar, dVar.getExternalFilesDir(Environment.DIRECTORY_PICTURES), this.fileProviderAuthority);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ScreenOrientationManager provideScreenOrientationManager() {
        C0076d dVar = this.activity;
        return new ScreenOrientationManager(dVar, (WindowManager) dVar.getSystemService("window"));
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public UriToPathResolver provideUriToPathResolver() {
        return new UriToPathResolver(this.activity.getContentResolver());
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AppCoinsInfoNavigator providesAppCoinsInfoNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, SocialMediaNavigator socialMediaNavigator, CatappultNavigator catappultNavigator) {
        return new AppCoinsInfoNavigator(fragmentNavigator, socialMediaNavigator, catappultNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AppNavigator providesAppNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new AppNavigator(fragmentNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AppViewNavigator providesAppViewNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator, CatappultNavigator catappultNavigator) {
        return new AppViewNavigator(fragmentNavigator, (ActivityNavigator) this.activity, appNavigator, catappultNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AutoUpdateRepository providesAutoUpdateRepository(AutoUpdateService autoUpdateService) {
        return new AutoUpdateRepository(autoUpdateService);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public AutoUpdateService providesAutoUpdateService(Service service, @Named("package-name") String str, @Named("client-sdk-version") int i) {
        return new AutoUpdateService(service, str, i);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public BottomNavigationAnalytics providesBottomNavigationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new BottomNavigationAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public CatappultNavigator providesCatappultNavigator(ExternalNavigator externalNavigator) {
        return new CatappultNavigator(externalNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ClaimPromotionsNavigator providesClaimPromotionsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new ClaimPromotionsNavigator(fragmentNavigator, (ActivityResultNavigator) this.activity, appNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public DialogUtils providesDialogUtils(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, MarketResourceFormatter marketResourceFormatter, ThemeManager themeManager, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new DialogUtils(aptoideAccountManager, accountNavigator, bodyInterceptor, okHttpClient, factory, aptoideInstalledAppsRepository, tokenInvalidator, sharedPreferences, marketResourceFormatter, themeManager, userFeedbackAnalytics);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public DonationsAnalytics providesDonationsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new DonationsAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ExternalNavigator providesExternalNavigator(ThemeManager themeManager) {
        return new ExternalNavigator(this.activity.getApplicationContext(), themeManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ListAppsMoreRepository providesListAppsMoreRepository(StoreCredentialsProvider storeCredentialsProvider, @Named("default") OkHttpClient okHttpClient, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new ListAppsMoreRepository(storeCredentialsProvider, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, this.activity.getResources(), this.activity.getWindowManager(), appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public PromotionsNavigator providesPromotionsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new PromotionsNavigator(fragmentNavigator, appNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public float providesScreenHeight(Resources resources) {
        return (float) resources.getDisplayMetrics().heightPixels;
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    @Named
    public float providesScreenWidth(Resources resources) {
        return (float) resources.getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public SearchNavigator providesSearchNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return new SearchNavigator(fragmentNavigator, appNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public SocialMediaNavigator providesSocialMediaNavigator(ExternalNavigator externalNavigator) {
        return new SocialMediaNavigator(externalNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public ThemeManager providesThemeManager() {
        C0076d dVar = this.activity;
        return new ThemeManager(dVar, ((AptoideApplication) dVar.getApplicationContext()).getDefaultSharedPreferences());
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public WalletInstallAnalytics providesWalletInstallAnalytics(DownloadAnalytics downloadAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, DownloadStateParser downloadStateParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new WalletInstallAnalytics(downloadAnalytics, notificationAnalytics, installAnalytics, downloadStateParser, analyticsManager, navigationTracker, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public WalletInstallConfiguration providesWalletInstallConfiguration() {
        return new WalletInstallConfiguration(this.intent.getStringExtra("packageName"), this.intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.WALLET_PACKAGE_NAME_KEY));
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public WalletInstallManager providesWalletInstallManager(InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        return new WalletInstallManager(this.activity.getPackageManager(), installManager, downloadFactory, downloadStateParser, moPubAdsManager, walletInstallAnalytics, aptoideInstalledAppsRepository, walletAppProvider, appInstallerStatusReceiver, dynamicSplitsManager);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public WalletInstallNavigator providesWalletInstallNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new WalletInstallNavigator(fragmentNavigator);
    }

    /* access modifiers changed from: package-private */
    @ActivityScope
    public WalletInstallPresenter providesWalletInstallPresenter(WalletInstallConfiguration walletInstallConfiguration, WalletInstallNavigator walletInstallNavigator, WalletInstallManager walletInstallManager, WalletInstallAnalytics walletInstallAnalytics, MoPubAdsManager moPubAdsManager) {
        return new WalletInstallPresenter((WalletInstallView) this.view, walletInstallManager, walletInstallNavigator, new PermissionManager(), (PermissionService) this.activity, C5376a.m10346b(), Schedulers.m10352io(), walletInstallConfiguration, walletInstallAnalytics, moPubAdsManager);
    }
}
