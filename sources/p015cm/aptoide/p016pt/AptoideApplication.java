package p015cm.aptoide.p016pt;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.work.C0822b;
import androidx.work.C0975q;
import androidx.work.C0978s;
import com.facebook.C4716f;
import com.facebook.p032t.C4728g;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.account.MatureBodyInterceptorV7;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.AdsUserPropertyManager;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.crashreports.ConsoleLogger;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.leak.LeakTool;
import p015cm.aptoide.p016pt.link.AptoideInstallParser;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.networking.Pnp1AuthorizationInterceptor;
import p015cm.aptoide.p016pt.notification.AptoideWorkerFactory;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationCenter;
import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p015cm.aptoide.p016pt.notification.NotificationPolicyFactory;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.NotificationService;
import p015cm.aptoide.p016pt.notification.NotificationSyncScheduler;
import p015cm.aptoide.p016pt.notification.NotificationsCleaner;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.notification.SystemNotificationShower;
import p015cm.aptoide.p016pt.notification.sync.NotificationSyncFactory;
import p015cm.aptoide.p016pt.notification.sync.NotificationSyncManager;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.PRNGFixes;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferencesImplementation;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p015cm.aptoide.p016pt.view.ActivityModule;
import p015cm.aptoide.p016pt.view.ActivityProvider;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.BaseFragment;
import p015cm.aptoide.p016pt.view.FragmentModule;
import p015cm.aptoide.p016pt.view.FragmentProvider;
import p015cm.aptoide.p016pt.view.configuration.implementation.VanillaActivityProvider;
import p015cm.aptoide.p016pt.view.configuration.implementation.VanillaFragmentProvider;
import p015cm.aptoide.p016pt.view.recycler.DisplayableWidgetMapping;
import p036io.rakam.api.C4759f;
import p036io.rakam.api.C4760h;
import p050l.p099n.C5137a;
import p112n.p113d.p114a.C10562b;
import p112n.p113d.p114a.C5298f;
import p112n.p115f.p116a.p117a.C5299a;
import p112n.p118g.p119b.C5303a;
import p112n.p118g.p119b.C5305c;
import p120q.p121b.C5310b;
import p120q.p121b.p122g.C5313b;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.AptoideApplication */
public abstract class AptoideApplication extends Application {
    static final String CACHE_FILE_NAME = "aptoide.wscache";
    private static final String TAG = AptoideApplication.class.getName();
    private static ActivityProvider activityProvider;
    private static DisplayableWidgetMapping displayableWidgetMapping;
    private static FragmentProvider fragmentProvider;
    @Inject
    AptoideAccountManager accountManager;
    @Inject
    @Named
    BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7;
    private BodyInterceptor<BaseBody> accountSettingsBodyInterceptorWebV7;
    @Inject
    AdsRepository adsRepository;
    @Inject
    AdsUserPropertyManager adsUserPropertyManager;
    @Inject
    AdultContent adultContent;
    @Inject
    AdultContentAnalytics adultContentAnalytics;
    @Inject
    SyncScheduler alarmSyncScheduler;
    @Inject
    AnalyticsManager analyticsManager;
    @Inject
    AppCoinsManager appCoinsManager;
    @Inject
    AppInBackgroundTracker appInBackgroundTracker;
    private ApplicationComponent applicationComponent;
    @Inject
    AdsApplicationVersionCodeProvider applicationVersionCodeProvider;
    private AptoideApplicationAnalytics aptoideApplicationAnalytics;
    @Inject
    AptoideDatabase aptoideDatabase;
    @Inject
    AptoideDownloadManager aptoideDownloadManager;
    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    @Inject
    AptoideMd5Manager aptoideMd5Manager;
    @Inject
    AptoideWorkerFactory aptoideWorkerFactory;
    @Inject
    AuthenticationPersistence authenticationPersistence;
    @Inject
    @Named
    BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    @Inject
    @Named
    BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptorV3;
    @Inject
    @Named
    BodyInterceptor<BaseBody> bodyInterceptorWebV7;
    @Inject
    CacheHelper cacheHelper;
    @Inject
    @Named
    OkHttpClient defaultClient;
    @Inject
    @Named
    List<String> defaultFollowedStores;
    @Inject
    FileManager fileManager;
    @Inject
    FirstLaunchAnalytics firstLaunchAnalytics;
    private Map<Integer, Result> fragmentResultMap;
    private C5303a<Map<Integer, Result>> fragmentResultRelay;
    @Inject
    L2Cache httpClientCache;
    @Inject
    IdsRepository idsRepository;
    @Inject
    InstallManager installManager;
    @Inject
    InvalidRefreshTokenLogoutManager invalidRefreshTokenLogoutManager;
    @Inject
    LaunchManager launchManager;
    private LeakTool leakTool;
    @Inject
    NavigationTracker navigationTracker;
    @Inject
    NewFeature newFeature;
    @Inject
    NewFeatureManager newFeatureManager;
    @Inject
    NotificationAnalytics notificationAnalytics;
    private NotificationCenter notificationCenter;
    @Inject
    RoomNotificationPersistence notificationPersistence;
    private NotificationProvider notificationProvider;
    private NotificationSyncScheduler notificationSyncScheduler;
    private NotificationsCleaner notificationsCleaner;
    private C5305c<NotificationInfo> notificationsPublishRelay;
    @Inject
    OemidProvider oemidProvider;
    @Inject
    PackageRepository packageRepository;
    @Inject
    Preferences preferences;
    @Inject
    QManager qManager;
    @Inject
    @Named
    String rakamBaseHost;
    @Inject
    ReadyToInstallNotificationManager readyToInstallNotificationManager;
    @Inject
    RootAvailabilityManager rootAvailabilityManager;
    @Inject
    RootInstallationRetryHandler rootInstallationRetryHandler;
    @Inject
    SearchSuggestionManager searchSuggestionManager;
    @Inject
    @Named
    SecurePreferences securePreferences;
    @Inject
    SettingsManager settingsManager;
    @Inject
    AptoideShortcutManager shortcutManager;
    @Inject
    StoreCredentialsProvider storeCredentials;
    @Inject
    StoreUtilsProxy storeUtilsProxy;
    @Inject
    SyncStorage syncStorage;
    @Inject
    ThemeAnalytics themeAnalytics;
    @Inject
    TokenInvalidator tokenInvalidator;
    @Inject
    TrendingManager trendingManager;
    @Inject
    UpdateRepository updateRepository;

    /* renamed from: a */
    static /* synthetic */ void m4255a(Void voidR) {
    }

    private void clearFileCache() {
        this.fileManager.purgeCache().mo18561a(C3986s.f7067f, (C5378b<Throwable>) C2028d.f4678f);
    }

    /* renamed from: d */
    static /* synthetic */ void m4258d(Boolean bool) {
    }

    private C5328b generateAptoideUuid() {
        return C5328b.m10169d(new C3421l(this));
    }

    public static ActivityProvider getActivityProvider() {
        return activityProvider;
    }

    public static DisplayableWidgetMapping getDisplayableWidgetMapping() {
        return displayableWidgetMapping;
    }

    public static FragmentProvider getFragmentProvider() {
        return fragmentProvider;
    }

    private NotificationsCleaner getNotificationCleaner() {
        if (this.notificationsCleaner == null) {
            this.notificationsCleaner = new NotificationsCleaner(this.notificationPersistence, Calendar.getInstance(TimeZone.getTimeZone("UTC")), this.accountManager, getNotificationProvider(), CrashReport.getInstance());
        }
        return this.notificationsCleaner;
    }

    /* renamed from: h */
    static /* synthetic */ void m4263h() {
    }

    private C5328b handleAdsUserPropertyToggle() {
        return C5328b.m10169d(new C2705h(this));
    }

    private void initializeFlurry(Context context, String str) {
        C10562b.C5297a aVar = new C10562b.C5297a();
        aVar.mo18292c(false);
        aVar.mo18289a(true);
        aVar.mo18291b(true);
        aVar.mo18288a(C5298f.f9498d);
        aVar.mo18290a(context, str);
    }

    private C5328b initializeIndicative() {
        return C5328b.m10169d(new C3423n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeRakam */
    public void mo5861d() {
        C4760h a = C4759f.m7803a();
        try {
            a.mo16563a((Context) this, new URL(this.rakamBaseHost), BuildConfig.RAKAM_API_KEY);
        } catch (MalformedURLException e) {
            Logger.getInstance().mo12980e(TAG, "error: ", e);
        }
        a.mo16584c(this.idsRepository.getAndroidId());
        a.mo16568a(true);
        a.mo16578b(2);
        a.mo16561a(1);
    }

    private C5328b initializeRakamSdk() {
        return C5328b.m10169d(new C2693f(this)).mo18600b(Schedulers.newThread());
    }

    private C5328b initializeSentry() {
        return C5328b.m10169d(new C4714y(this));
    }

    private C5328b sendAppStartToAnalytics() {
        return this.firstLaunchAnalytics.sendAppStart(this, SecurePreferencesImplementation.getInstance(getApplicationContext(), getDefaultSharedPreferences()), this.idsRepository);
    }

    private C5328b sendAptoideApplicationStartAnalytics(boolean z) {
        return C5328b.m10169d(new C3557p(this, z));
    }

    private C5328b setUpFirstRunAnalytics() {
        return sendAppStartToAnalytics();
    }

    private C5328b setUpInitialAdsUserProperty() {
        return this.idsRepository.getUniqueIdentifier().mo18566b(new C4713x(this)).mo18589a((C5377a) new C3419j(this));
    }

    private void startNotificationCenter() {
        getPreferences().getBoolean(ManagedKeys.CAMPAIGN_SOCIAL_NOTIFICATIONS_PREFERENCE_VIEW_KEY, true).mo18669c().mo18655a(new C2381e(this), (C5378b<Throwable>) C1954c.f4564f);
        getNotificationCenter().setup();
    }

    private void startNotificationCleaner() {
        getNotificationCleaner().setup();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C5137a.m9496c(this);
    }

    public ActivityProvider createActivityProvider() {
        return new VanillaActivityProvider();
    }

    /* access modifiers changed from: protected */
    public DisplayableWidgetMapping createDisplayableWidgetMapping() {
        return DisplayableWidgetMapping.getInstance();
    }

    public FragmentProvider createFragmentProvider() {
        return new VanillaFragmentProvider();
    }

    /* renamed from: f */
    public /* synthetic */ Void mo5863f() throws Exception {
        return this.aptoideMd5Manager.calculateMd5Sum();
    }

    /* renamed from: g */
    public /* synthetic */ void mo5864g() {
        C4759f.m7803a().mo16562a((Application) this);
    }

    public AptoideAccountManager getAccountManager() {
        return this.accountManager;
    }

    public BodyInterceptor<BaseBody> getAccountSettingsBodyInterceptorPoolV7() {
        return this.accountSettingsBodyInterceptorPoolV7;
    }

    public BodyInterceptor<BaseBody> getAccountSettingsBodyInterceptorWebV7() {
        if (this.accountSettingsBodyInterceptorWebV7 == null) {
            this.accountSettingsBodyInterceptorWebV7 = new MatureBodyInterceptorV7(this.bodyInterceptorWebV7, this.adultContent);
        }
        return this.accountSettingsBodyInterceptorWebV7;
    }

    public String getAccountType() {
        return "cm.aptoide.pt";
    }

    public ActivityModule getActivityModule(BaseActivity baseActivity, Intent intent, NotificationSyncScheduler notificationSyncScheduler2, View view, boolean z, String str) {
        return new ActivityModule(baseActivity, intent, notificationSyncScheduler2, view, z, str);
    }

    public AdsRepository getAdsRepository() {
        return this.adsRepository;
    }

    public AdultContentAnalytics getAdultContentAnalytics() {
        return this.adultContentAnalytics;
    }

    public SyncScheduler getAlarmSyncScheduler() {
        return this.alarmSyncScheduler;
    }

    public AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public AppCoinsManager getAppCoinsManager() {
        return this.appCoinsManager;
    }

    public ApplicationComponent getApplicationComponent() {
        if (this.applicationComponent == null) {
            this.applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).flavourApplicationModule(new FlavourApplicationModule(this)).build();
        }
        return this.applicationComponent;
    }

    /* access modifiers changed from: protected */
    public String getAptoidePackage() {
        return "cm.aptoide.pt";
    }

    public AuthenticationPersistence getAuthenticationPersistence() {
        return this.authenticationPersistence;
    }

    public BodyInterceptor<BaseBody> getBodyInterceptorPoolV7() {
        return this.bodyInterceptorPoolV7;
    }

    public BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> getBodyInterceptorV3() {
        return this.bodyInterceptorV3;
    }

    public OkHttpClient getDefaultClient() {
        return this.defaultClient;
    }

    public SharedPreferences getDefaultSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(this);
    }

    public AptoideDownloadManager getDownloadManager() {
        return this.aptoideDownloadManager;
    }

    public String getExtraId() {
        return null;
    }

    public String getFeedbackEmail() {
        return "support@aptoide.com";
    }

    public FragmentModule getFragmentModule(BaseFragment baseFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseFragment, bundle, bundle2, z, str);
    }

    @SuppressLint({"UseSparseArrays"})
    public Map<Integer, Result> getFragmentResultMap() {
        if (this.fragmentResultMap == null) {
            this.fragmentResultMap = new HashMap();
        }
        return this.fragmentResultMap;
    }

    public C5303a<Map<Integer, Result>> getFragmentResultRelay() {
        if (this.fragmentResultRelay == null) {
            this.fragmentResultRelay = C5303a.m10043o();
        }
        return this.fragmentResultRelay;
    }

    public IdsRepository getIdsRepository() {
        return this.idsRepository;
    }

    public InstallManager getInstallManager() {
        return this.installManager;
    }

    public LeakTool getLeakTool() {
        if (this.leakTool == null) {
            this.leakTool = new LeakTool();
        }
        return this.leakTool;
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public NewFeature getNewFeature() {
        return this.newFeature;
    }

    public NewFeatureManager getNewFeatureManager() {
        return this.newFeatureManager;
    }

    public NotificationAnalytics getNotificationAnalytics() {
        return this.notificationAnalytics;
    }

    public NotificationCenter getNotificationCenter() {
        if (this.notificationCenter == null) {
            NotificationProvider notificationProvider2 = getNotificationProvider();
            this.notificationCenter = new NotificationCenter(notificationProvider2, getNotificationSyncScheduler(), new NotificationPolicyFactory(notificationProvider2, this.aptoideInstalledAppsRepository), new NotificationAnalytics(new AptoideInstallParser(), this.analyticsManager, this.navigationTracker));
        }
        return this.notificationCenter;
    }

    public NotificationProvider getNotificationProvider() {
        if (this.notificationProvider == null) {
            this.notificationProvider = new NotificationProvider(new RoomNotificationPersistence(this.aptoideDatabase.notificationDao()), Schedulers.m10352io());
        }
        return this.notificationProvider;
    }

    public NotificationSyncScheduler getNotificationSyncScheduler() {
        if (this.notificationSyncScheduler == null) {
            this.notificationSyncScheduler = new NotificationSyncManager(getAlarmSyncScheduler(), true, new NotificationSyncFactory(new NotificationService("cm.aptoide.pt", new OkHttpClient.Builder().readTimeout(45, TimeUnit.SECONDS).writeTimeout(45, TimeUnit.SECONDS).addInterceptor(new Pnp1AuthorizationInterceptor(getAuthenticationPersistence(), getTokenInvalidator())).build(), WebService.getDefaultConverter(), getIdsRepository(), BuildConfig.VERSION_NAME, getExtraId(), getDefaultSharedPreferences(), getResources(), getAccountManager()), getNotificationProvider()));
        }
        return this.notificationSyncScheduler;
    }

    public C5305c<NotificationInfo> getNotificationsPublishRelay() {
        if (this.notificationsPublishRelay == null) {
            this.notificationsPublishRelay = C5305c.m10045o();
        }
        return this.notificationsPublishRelay;
    }

    public PackageRepository getPackageRepository() {
        return this.packageRepository;
    }

    public String getPartnerId() {
        return this.oemidProvider.getOemid();
    }

    public Preferences getPreferences() {
        return this.preferences;
    }

    public QManager getQManager() {
        return this.qManager;
    }

    public ReadyToInstallNotificationManager getReadyToInstallNotificationManager() {
        return this.readyToInstallNotificationManager;
    }

    public RootAvailabilityManager getRootAvailabilityManager() {
        return this.rootAvailabilityManager;
    }

    public SearchSuggestionManager getSearchSuggestionManager() {
        return this.searchSuggestionManager;
    }

    public SettingsManager getSettingsManager() {
        return this.settingsManager;
    }

    public StoreCredentialsProvider getStoreCredentials() {
        return this.storeCredentials;
    }

    public SyncStorage getSyncStorage() {
        return this.syncStorage;
    }

    /* access modifiers changed from: protected */
    public abstract SystemNotificationShower getSystemNotificationShower();

    public ThemeAnalytics getThemeAnalytics() {
        return this.themeAnalytics;
    }

    public TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public TrendingManager getTrendingManager() {
        return this.trendingManager;
    }

    public String getVersionCode() {
        try {
            return String.valueOf(getPackageManager().getPackageInfo(getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "NaN";
        }
    }

    public AdsApplicationVersionCodeProvider getVersionCodeProvider() {
        return this.applicationVersionCodeProvider;
    }

    public boolean isCreateStoreUserPrivacyEnabled() {
        return true;
    }

    public void onCreate() {
        getApplicationComponent().inject(this);
        this.appInBackgroundTracker.initialize();
        CrashReport.getInstance().addLogger(new ConsoleLogger());
        Logger.setDBG(ToolboxManager.isDebug(getDefaultSharedPreferences()));
        Single.m10126b(new C4409u(this)).mo18563b(Schedulers.m10352io()).mo18556a(C5376a.m10346b()).mo18561a(C3556o.f6573f, (C5378b<Throwable>) C3944q.f7027f);
        try {
            PRNGFixes.apply();
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
        }
        super.onCreate();
        long currentTimeMillis = System.currentTimeMillis();
        getLeakTool().setup(this);
        fragmentProvider = createFragmentProvider();
        activityProvider = createActivityProvider();
        displayableWidgetMapping = createDisplayableWidgetMapping();
        this.analyticsManager.setup();
        this.aptoideApplicationAnalytics = new AptoideApplicationAnalytics(this.analyticsManager);
        C0822b.C0823a aVar = new C0822b.C0823a();
        aVar.mo4681a((C0978s) this.aptoideWorkerFactory);
        aVar.mo4680a(3);
        C0975q.m4145a(this, aVar.mo4682a());
        C4716f.m7694c(this);
        C4728g.m7724a((Application) this);
        C4728g.m7729b((Context) this);
        initializeFlurry(this, BuildConfig.FLURRY_KEY);
        C5328b b = generateAptoideUuid().mo18587a(C5328b.m10167b(initializeRakamSdk(), initializeSentry(), initializeIndicative())).mo18590a((C5378b<? super Throwable>) C4397t.f7555f).mo18598b();
        C5328b[] bVarArr = new C5328b[4];
        bVarArr[0] = setUpInitialAdsUserProperty();
        bVarArr[1] = handleAdsUserPropertyToggle();
        bVarArr[2] = sendAptoideApplicationStartAnalytics(((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4);
        bVarArr[3] = this.aptoideInstalledAppsRepository.syncWithDevice().mo18600b(Schedulers.computation());
        b.mo18587a(C5328b.m10167b(bVarArr)).mo18590a((C5378b<? super Throwable>) C1950b.f4559f).mo18598b().mo18587a(setUpFirstRunAnalytics()).mo18587a(this.launchManager.launch().mo18600b(Schedulers.computation())).mo18594a((C5377a) C3420k.f6389f, (C5378b<? super Throwable>) C3422m.f6391f);
        clearFileCache();
        startNotificationCenter();
        startNotificationCleaner();
        this.rootAvailabilityManager.isRootAvailable().mo18564b(new C3945r(this)).mo18561a(C4490v.f7728f, (C5378b<Throwable>) C2703g.f5541f);
        this.accountManager.accountStatus().mo18694j(C4712w.f7987f).mo18656b().mo18675c(new C3246i(this));
        Logger.getInstance().mo12985v(TAG, String.format("onCreate took %d millis.", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        this.invalidRefreshTokenLogoutManager.start();
        this.installManager.start();
    }

    /* renamed from: a */
    public /* synthetic */ void mo5851a(Boolean bool) {
        this.aptoideApplicationAnalytics.updateDimension(bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5849a(String str) {
        return this.adsUserPropertyManager.setUp(str);
    }

    /* renamed from: b */
    public /* synthetic */ void mo5855b(Boolean bool) {
        if (bool.booleanValue()) {
            this.rootInstallationRetryHandler.start();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo5856c() {
        C5299a.m10016a(getApplicationContext(), BuildConfig.INDICATIVE_KEY);
        C5299a.m10035e(this.idsRepository.getAndroidId());
    }

    /* renamed from: e */
    public /* synthetic */ void mo5862e() {
        C5310b.m10088a(BuildConfig.SENTRY_DSN_KEY, new C5313b(this));
    }

    /* renamed from: a */
    static /* synthetic */ void m4253a(Long l) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "cleaned size: " + AptoideUtils.StringU.formatBytes(l.longValue(), false));
    }

    /* renamed from: b */
    public /* synthetic */ void mo5854b() {
        this.adsUserPropertyManager.start();
    }

    /* renamed from: c */
    public /* synthetic */ void mo5857c(Boolean bool) {
        getNotificationSyncScheduler().setEnabled(bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ void mo5852a(boolean z) {
        this.aptoideApplicationAnalytics.setPackageDimension(getPackageName());
        this.aptoideApplicationAnalytics.setVersionCodeDimension(getVersionCode());
        this.aptoideApplicationAnalytics.sendIsTvEvent(z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo5850a() {
        this.idsRepository.getUniqueIdentifier();
    }
}
