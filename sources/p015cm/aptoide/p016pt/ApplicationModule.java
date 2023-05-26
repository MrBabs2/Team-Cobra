package p015cm.aptoide.p016pt;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.app.C0373i;
import androidx.room.C0752i;
import androidx.room.C0753j;
import com.aptoide.authentication.AptoideAuthentication;
import com.aptoide.authentication.network.RemoteAuthenticationService;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.facebook.C4716f;
import com.facebook.C6365d;
import com.facebook.internal.C6422d;
import com.facebook.login.C6527g;
import com.facebook.p032t.C4728g;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.liulishuo.filedownloader.services.C8900d;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p015cm.aptoide.accountmanager.AccountFactory;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.AptoideBiAnalytics;
import p015cm.aptoide.analytics.implementation.AptoideBiEventService;
import p015cm.aptoide.analytics.implementation.EventsPersistence;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;
import p015cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.FacebookEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.IndicativeEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.RakamEventLogger;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService;
import p015cm.aptoide.analytics.implementation.persistence.SharedPreferencesSessionPersistence;
import p015cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import p015cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsMapper;
import p015cm.aptoide.p016pt.aab.DynamicSplitsRemoteService;
import p015cm.aptoide.p016pt.aab.DynamicSplitsService;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.abtesting.ABTestCenterRepository;
import p015cm.aptoide.p016pt.abtesting.ABTestManager;
import p015cm.aptoide.p016pt.abtesting.ABTestService;
import p015cm.aptoide.p016pt.abtesting.ABTestServiceProvider;
import p015cm.aptoide.p016pt.abtesting.AbTestCacheValidator;
import p015cm.aptoide.p016pt.abtesting.ExperimentModel;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.AccountServiceV3;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.AndroidAccountManagerPersistence;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p015cm.aptoide.p016pt.account.DatabaseStoreDataPersist;
import p015cm.aptoide.p016pt.account.FacebookSignUpAdapter;
import p015cm.aptoide.p016pt.account.GoogleSignUpAdapter;
import p015cm.aptoide.p016pt.account.LoginPreferences;
import p015cm.aptoide.p016pt.account.MatureBodyInterceptorV7;
import p015cm.aptoide.p016pt.account.MatureContentPersistence;
import p015cm.aptoide.p016pt.account.OAuthModeProvider;
import p015cm.aptoide.p016pt.account.view.ImageInfoProvider;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p015cm.aptoide.p016pt.account.view.user.NewsletterManager;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.AdsUserPropertyManager;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.MoPubAnalytics;
import p015cm.aptoide.p016pt.ads.PackageRepositoryVersionCodeProvider;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.TrackerFilter;
import p015cm.aptoide.p016pt.analytics.analytics.AnalyticsBodyInterceptorV7;
import p015cm.aptoide.p016pt.app.AdsManager;
import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingManager;
import p015cm.aptoide.p016pt.app.AppCoinsService;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.ReviewsManager;
import p015cm.aptoide.p016pt.app.ReviewsRepository;
import p015cm.aptoide.p016pt.app.ReviewsService;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerManager;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerRepository;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerService;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallRepository;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationPersistence;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationRepository;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.autoupdate.Service;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistPersistence;
import p015cm.aptoide.p016pt.blacklist.BlacklistUnitMapper;
import p015cm.aptoide.p016pt.blacklist.Blacklister;
import p015cm.aptoide.p016pt.bonus.BonusAppcRemoteService;
import p015cm.aptoide.p016pt.bonus.BonusAppcService;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomAppComingSoonPersistence;
import p015cm.aptoide.p016pt.database.RoomAppcMigrationPersistence;
import p015cm.aptoide.p016pt.database.RoomAptoideInstallPersistence;
import p015cm.aptoide.p016pt.database.RoomDownloadPersistence;
import p015cm.aptoide.p016pt.database.RoomEventMapper;
import p015cm.aptoide.p016pt.database.RoomEventPersistence;
import p015cm.aptoide.p016pt.database.RoomExperimentMapper;
import p015cm.aptoide.p016pt.database.RoomExperimentPersistence;
import p015cm.aptoide.p016pt.database.RoomInstallationMapper;
import p015cm.aptoide.p016pt.database.RoomInstallationPersistence;
import p015cm.aptoide.p016pt.database.RoomInstalledPersistence;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.RoomStorePersistence;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.RoomUpdatePersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.NetworkOperatorManager;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p015cm.aptoide.p016pt.dataprovider.cache.POSTCacheInterceptor;
import p015cm.aptoide.p016pt.dataprovider.cache.POSTCacheKeyAlgorithm;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p015cm.aptoide.p016pt.download.AppValidationAnalytics;
import p015cm.aptoide.p016pt.download.AppValidator;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadApkPathsProvider;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.DownloadInstallationProvider;
import p015cm.aptoide.p016pt.download.DownloadMirrorEventInterceptor;
import p015cm.aptoide.p016pt.download.FileDownloadManagerProvider;
import p015cm.aptoide.p016pt.download.Md5Comparator;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.download.SplitTypeSubFileTypeMapper;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppFileMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.downloadmanager.DownloadStatusMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.RetryFileDownloadManagerProvider;
import p015cm.aptoide.p016pt.downloadmanager.RetryFileDownloaderProvider;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.editorial.EditorialService;
import p015cm.aptoide.p016pt.editorialList.EditorialListAnalytics;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationPersistence;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.EskillsPreferencesManager;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.home.bundles.BundleDataSource;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper;
import p015cm.aptoide.p016pt.home.bundles.RemoteBundleDataSource;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.FilePathProvider;
import p015cm.aptoide.p016pt.install.ForegroundManager;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallEvents;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.Installer;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.PackageInstallerManager;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.install.RootInstallNotificationEventReceiver;
import p015cm.aptoide.p016pt.install.RootInstallerProvider;
import p015cm.aptoide.p016pt.install.installer.DefaultInstaller;
import p015cm.aptoide.p016pt.install.installer.InstallationProvider;
import p015cm.aptoide.p016pt.install.installer.RootInstallErrorNotificationFactory;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.link.AptoideInstallParser;
import p015cm.aptoide.p016pt.logger.AnalyticsLogcatLogger;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV7;
import p015cm.aptoide.p016pt.networking.Cdn;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.networking.MultipartBodyInterceptor;
import p015cm.aptoide.p016pt.networking.NoAuthenticationBodyInterceptorV3;
import p015cm.aptoide.p016pt.networking.NoOpTokenInvalidator;
import p015cm.aptoide.p016pt.networking.RefreshTokenInvalidator;
import p015cm.aptoide.p016pt.networking.UserAgentInterceptor;
import p015cm.aptoide.p016pt.networking.UserAgentInterceptorV8;
import p015cm.aptoide.p016pt.notification.AptoideWorkerFactory;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationIdsMapper;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.notification.RoomLocalNotificationSyncMapper;
import p015cm.aptoide.p016pt.notification.RoomLocalNotificationSyncPersistence;
import p015cm.aptoide.p016pt.notification.SystemNotificationShower;
import p015cm.aptoide.p016pt.notification.UpdatesNotificationManager;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.packageinstaller.AppInstaller;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferencesImplementation;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.promotions.PromotionViewAppMapper;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p015cm.aptoide.p016pt.promotions.PromotionsService;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.ReactionsRemoteService;
import p015cm.aptoide.p016pt.reactions.network.ReactionsService;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.root.RootValueSaver;
import p015cm.aptoide.p016pt.search.SearchHostProvider;
import p015cm.aptoide.p016pt.search.SearchRepository;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionRemoteRepository;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionService;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingService;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreCredentialsProviderImpl;
import p015cm.aptoide.p016pt.store.StorePersistence;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.AlarmSyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.updates.UpdateMapper;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppCenterRepository;
import p015cm.aptoide.p016pt.view.app.AppService;
import p015cm.aptoide.p016pt.view.settings.SupportEmailProvider;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p112n.p118g.p119b.C5303a;
import p112n.p118g.p119b.C5305c;
import p112n.p312h.p313a.C10794q;
import p112n.p312h.p313a.p318f0.C10763c;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p127s.C12871b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;
import p264m.p265a.p266a.C10551a;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/* renamed from: cm.aptoide.pt.ApplicationModule */
public class ApplicationModule {
    private static final String DONATIONS_URL = "https://api.blockchainds.com/";
    private final AptoideApplication application;

    public ApplicationModule(AptoideApplication aptoideApplication) {
        this.application = aptoideApplication;
    }

    private int getInstallingStateTimeout() {
        if (Build.VERSION.SDK_INT >= 21) {
            return BuildConfig.INSTALLING_STATE_INSTALLER_TIMEOUT_IN_MILLIS_21_PLUS;
        }
        return 60000;
    }

    private int[] getSQLiteIntArrayVersions() {
        int[] iArr = new int[61];
        for (int i = 0; i <= 60; i++) {
            iArr[i + 0] = i;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadApkPathsProvider downloadApkPathsProvider(OemidProvider oemidProvider) {
        return new DownloadApkPathsProvider(oemidProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadStatusMapper downloadStatusMapper() {
        return new DownloadStatusMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FilePathProvider filePathManager(@Named("cachePath") String str, @Named("apkPath") String str2, @Named("obbPath") String str3) {
        return new FilePathProvider(str2, str3, str);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AccountAnalytics provideAccountAnalytics(NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        return new AccountAnalytics(navigationTracker, CrashReport.getInstance(), analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AccountFactory provideAccountFactory() {
        return new AccountFactory();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AccountManager provideAccountManager() {
        return AccountManager.get(this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AccountService provideAccountService(@Named("default") OkHttpClient okHttpClient, @Named("long-timeout") OkHttpClient okHttpClient2, @Named("default") SharedPreferences sharedPreferences, AuthenticationPersistence authenticationPersistence, TokenInvalidator tokenInvalidator, @Named("pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("web-v7") BodyInterceptor<BaseBody> bodyInterceptor2, @Named("multipart") MultipartBodyInterceptor multipartBodyInterceptor, @Named("no-authentication-v3") BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor3, @Named("defaultInterceptorV3") BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor4, @Named("default") ObjectMapper objectMapper, Converter.Factory factory, @Named("extraID") String str, AccountFactory accountFactory, OAuthModeProvider oAuthModeProvider, AptoideAuthenticationRx aptoideAuthenticationRx) {
        return new AccountServiceV3(accountFactory, okHttpClient, okHttpClient2, factory, objectMapper, sharedPreferences, str, tokenInvalidator, authenticationPersistence, bodyInterceptor3, bodyInterceptor4, multipartBodyInterceptor, bodyInterceptor2, bodyInterceptor, oAuthModeProvider, aptoideAuthenticationRx);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BodyInterceptor<BaseBody> provideAccountSettingsBodyInterceptorPoolV7(@Named("pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, AdultContent adultContent) {
        return new MatureBodyInterceptorV7(bodyInterceptor, adultContent);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideAccountType() {
        return "cm.aptoide.pt";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdsRepository provideAdsRepository(IdsRepository idsRepository, AptoideAccountManager aptoideAccountManager, @Named("default") OkHttpClient okHttpClient, QManager qManager, @Named("default") SharedPreferences sharedPreferences, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, ConnectivityManager connectivityManager, OemidProvider oemidProvider) {
        return new AdsRepository(idsRepository, aptoideAccountManager, okHttpClient, WebService.getDefaultConverter(), qManager, sharedPreferences, this.application.getApplicationContext(), connectivityManager, this.application.getResources(), adsApplicationVersionCodeProvider, C2704g0.f5542a, oemidProvider.getOemid(), new MinimalAdMapper());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdultContentAnalytics provideAdultContentAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new AdultContentAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public AnalyticsBodyInterceptorV7 provideAnalyticsBodyInterceptorV7(AuthenticationPersistence authenticationPersistence, IdsRepository idsRepository, @Named("default") SharedPreferences sharedPreferences, Resources resources, QManager qManager, @Named("aptoidePackage") String str, AptoideMd5Manager aptoideMd5Manager) {
        return new AnalyticsBodyInterceptorV7(idsRepository, authenticationPersistence, aptoideMd5Manager, str, resources, BuildConfig.VERSION_CODE, qManager, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AndroidAccountProvider provideAndroidAccountProvider(AccountManager accountManager, @Named("accountType") String str) {
        return new AndroidAccountProvider(accountManager, str, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideApkPath(@Named("cachePath") String str) {
        return str + "apks/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public C4728g provideAppEventsLogger() {
        return C4728g.m7729b((Context) this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideAccountManager provideAptoideAccountManager(AdultContent adultContent, GoogleApiClient googleApiClient, StoreManager storeManager, AccountService accountService, LoginPreferences loginPreferences, AccountPersistence accountPersistence, @Named("facebookLoginPermissions") List<String> list) {
        C4716f.m7694c(this.application);
        return new AptoideAccountManager.Builder().setAccountPersistence(new MatureContentPersistence(accountPersistence, adultContent)).setAccountService(accountService).setAdultService(adultContent).registerSignUpAdapter(GoogleSignUpAdapter.TYPE, new GoogleSignUpAdapter(googleApiClient, loginPreferences)).registerSignUpAdapter(FacebookSignUpAdapter.TYPE, new FacebookSignUpAdapter(list, C6527g.m13804b(), loginPreferences)).setStoreManager(storeManager).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideApplicationAnalytics provideAptoideApplicationAnalytics(AnalyticsManager analyticsManager) {
        return new AptoideApplicationAnalytics(analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideDownloadManager provideAptoideDownloadManager(DownloadsRepository downloadsRepository, DownloadStatusMapper downloadStatusMapper, @Named("cachePath") String str, DownloadAppMapper downloadAppMapper, AppDownloaderProvider appDownloaderProvider, @Named("apkPath") String str2, @Named("obbPath") String str3, DownloadAnalytics downloadAnalytics, FilePathProvider filePathProvider) {
        FileUtils.createDir(str2);
        FileUtils.createDir(str3);
        return new AptoideDownloadManager(downloadsRepository, downloadStatusMapper, str, downloadAppMapper, appDownloaderProvider, downloadAnalytics, new FileUtils(), filePathProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Collection<String> provideAptoideEvents() {
        return Arrays.asList(new String[]{FirstLaunchAnalytics.FIRST_LAUNCH_BI, FirstLaunchAnalytics.PLAY_PROTECT_EVENT, AppViewAnalytics.OPEN_APP_VIEW, NotificationAnalytics.NOTIFICATION_EVENT_NAME, AccountAnalytics.APTOIDE_EVENT_NAME, DownloadAnalytics.DOWNLOAD_EVENT_NAME, InstallAnalytics.INSTALL_EVENT_NAME, PromotionsAnalytics.VALENTINE_MIGRATOR});
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideAptoidePackage() {
        return "cm.aptoide.pt";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AuthenticationPersistence provideAuthenticationPersistence(AndroidAccountProvider androidAccountProvider) {
        return new AuthenticationPersistence(androidAccountProvider, (AccountManager) this.application.getSystemService("account"));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BodyInterceptor<BaseBody> provideBodyInterceptorPoolV7(AuthenticationPersistence authenticationPersistence, IdsRepository idsRepository, @Named("default") SharedPreferences sharedPreferences, Resources resources, QManager qManager, @Named("aptoidePackage") String str, AptoideMd5Manager aptoideMd5Manager) {
        return new BodyInterceptorV7(idsRepository, authenticationPersistence, aptoideMd5Manager, str, qManager, Cdn.POOL, sharedPreferences, resources, BuildConfig.VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BodyInterceptor<BaseBody> provideBodyInterceptorWebV7(AuthenticationPersistence authenticationPersistence, IdsRepository idsRepository, @Named("default") SharedPreferences sharedPreferences, Resources resources, QManager qManager, @Named("aptoidePackage") String str, AptoideMd5Manager aptoideMd5Manager) {
        return new BodyInterceptorV7(idsRepository, authenticationPersistence, aptoideMd5Manager, str, qManager, Cdn.WEB, sharedPreferences, resources, BuildConfig.VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public CacheHelper provideCacheHelper(@Named("default") SharedPreferences sharedPreferences, @Named("cachePath") String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new CacheHelper.FolderToManage(new File(str), PullingContentService.UPDATES_INTERVAL));
        linkedList.add(new CacheHelper.FolderToManage(new File(str + "icons/"), PullingContentService.UPDATES_INTERVAL));
        linkedList.add(new CacheHelper.FolderToManage(new File(this.application.getCacheDir() + "image_manager_disk_cache/"), PullingContentService.UPDATES_INTERVAL));
        return new CacheHelper(ManagerPreferences.getCacheLimit(sharedPreferences), linkedList, new FileUtils());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideCachePath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/.aptoide/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public C6365d provideCallbackManager() {
        return new C6422d();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ContentResolver provideContentResolver() {
        return this.application.getContentResolver();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DeepLinkAnalytics provideDeepLinkAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new DeepLinkAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public List<String> provideDefaultFollowedStores() {
        return Arrays.asList(new String[]{DeepLinkIntentReceiver.DeepLinksTargets.APPS, "catappult"});
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Installer provideDefaultInstaller(InstallationProvider installationProvider, @Named("default") SharedPreferences sharedPreferences, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RootAvailabilityManager rootAvailabilityManager, InstallerAnalytics installerAnalytics, AppInstaller appInstaller, AppInstallerStatusReceiver appInstallerStatusReceiver, RootInstallerProvider rootInstallerProvider) {
        return new DefaultInstaller(this.application.getPackageManager(), installationProvider, appInstaller, new FileUtils(), ToolboxManager.isDebug(sharedPreferences), aptoideInstalledAppsRepository, BuildConfig.ROOT_TIMEOUT, rootAvailabilityManager, sharedPreferences, installerAnalytics, getInstallingStateTimeout(), appInstallerStatusReceiver, rootInstallerProvider, this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Preferences provideDefaultPreferences(@Named("default") SharedPreferences sharedPreferences) {
        return new Preferences(sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadFactory provideDownloadFactory(@Named("marketName") String str, DownloadApkPathsProvider downloadApkPathsProvider, @Named("cachePath") String str2, AppValidator appValidator, SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper) {
        return new DownloadFactory(str, downloadApkPathsProvider, str2, appValidator, splitTypeSubFileTypeMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadPersistence provideDownloadPersistence(AptoideDatabase aptoideDatabase) {
        return new RoomDownloadPersistence(aptoideDatabase.downloadDAO());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadsRepository provideDownloadsRepository(DownloadPersistence downloadPersistence) {
        return new DownloadsRepository(downloadPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideExtraID() {
        return "";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Collection<String> provideFacebookEvents() {
        return Arrays.asList(new String[]{InstallAnalytics.APPLICATION_INSTALL, InstallAnalytics.NOTIFICATION_APPLICATION_INSTALL, InstallAnalytics.EDITORS_APPLICATION_INSTALL, DownloadAnalytics.EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, DownloadAnalytics.NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, DownloadAnalytics.DOWNLOAD_COMPLETE_EVENT, SearchAnalytics.SEARCH, SearchAnalytics.NO_RESULTS, SearchAnalytics.APP_CLICK, SearchAnalytics.SEARCH_START, SearchAnalytics.AB_SEARCH_ACTION, SearchAnalytics.AB_SEARCH_IMPRESSION, AppViewAnalytics.EDITORS_CHOICE_CLICKS, AppViewAnalytics.APP_VIEW_OPEN_FROM, AppViewAnalytics.APP_VIEW_INTERACT, AppViewAnalytics.DONATIONS_IMPRESSION, NotificationAnalytics.NOTIFICATION_RECEIVED, NotificationAnalytics.NOTIFICATION_IMPRESSION, NotificationAnalytics.NOTIFICATION_PRESSED, StoreAnalytics.STORES_TAB_INTERACT, StoreAnalytics.STORES_OPEN, StoreAnalytics.STORES_INTERACT, AccountAnalytics.SIGN_UP_EVENT_NAME, AccountAnalytics.LOGIN_EVENT_NAME, UpdatesAnalytics.UPDATE_EVENT, PageViewsAnalytics.PAGE_VIEW_EVENT, FirstLaunchAnalytics.FIRST_LAUNCH, FirstLaunchAnalytics.PLAY_PROTECT_EVENT, InstallEvents.ROOT_V2_COMPLETE, InstallEvents.ROOT_V2_START, AppViewAnalytics.SIMILAR_APP_INTERACT, AccountAnalytics.LOGIN_SIGN_UP_START_SCREEN, AccountAnalytics.CREATE_USER_PROFILE, AccountAnalytics.PROFILE_SETTINGS, AccountAnalytics.ENTRY, DeepLinkAnalytics.FACEBOOK_APP_LAUNCH, AppViewAnalytics.CLICK_INSTALL, AppShortcutsAnalytics.APPS_SHORTCUTS, AccountAnalytics.CREATE_YOUR_STORE, HomeAnalytics.HOME_INTERACT, HomeAnalytics.CURATION_CARD_CLICK, HomeAnalytics.CURATION_CARD_IMPRESSION, HomeAnalytics.HOME_CHIP_INTERACT, AccountAnalytics.PROMOTE_APTOIDE_EVENT_NAME, EditorialListAnalytics.EDITORIAL_BN_CURATION_CARD_CLICK, EditorialListAnalytics.EDITORIAL_BN_CURATION_CARD_IMPRESSION, BottomNavigationAnalytics.BOTTOM_NAVIGATION_INTERACT, DownloadAnalytics.DOWNLOAD_INTERACT, DonationsAnalytics.DONATIONS_INTERACT, EditorialAnalytics.CURATION_CARD_INSTALL, EditorialAnalytics.EDITORIAL_BN_CURATION_CARD_INSTALL, EditorialAnalytics.REACTION_INTERACT, PromotionsAnalytics.PROMOTION_DIALOG, PromotionsAnalytics.PROMOTIONS_INTERACT, PromotionsAnalytics.VALENTINE_MIGRATOR, AppViewAnalytics.ADS_BLOCK_BY_OFFER, AppViewAnalytics.APPC_SIMILAR_APP_INTERACT, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, AppViewAnalytics.BONUS_GAME_WALLET_OFFER_19, DeepLinkAnalytics.APPCOINS_WALLET_DEEPLINK, InstallEvents.MIUI_INSTALLATION_ABOVE_20_EVENT_NAME, AptoideApplicationAnalytics.IS_ANDROID_TV, ThemeAnalytics.DARK_THEME_INTERACT_EVENT, UserFeedbackAnalytics.USER_FEEDBACK_EVENT_NAME, InstallEvents.IS_INSTALLATION_TYPE_EVENT_NAME, AppValidationAnalytics.INVALID_DOWNLOAD_PATH_EVENT, SocialMediaAnalytics.PROMOTE_SOCIAL_MEDIA_EVENT_NAME, HomeAnalytics.VANILLA_PROMOTIONAL_CARDS});
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FileUtils provideFileUtils() {
        return new FileUtils();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Collection<String> provideFlurryEvents() {
        return new LinkedList(Arrays.asList(new String[]{InstallAnalytics.APPLICATION_INSTALL, DownloadAnalytics.EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, DownloadAnalytics.DOWNLOAD_COMPLETE_EVENT, AppViewAnalytics.HOME_PAGE_EDITORS_CHOICE_FLURRY, AppViewAnalytics.APP_VIEW_OPEN_FROM, StoreAnalytics.STORES_TAB_INTERACT, StoreAnalytics.STORES_OPEN, StoreAnalytics.STORES_INTERACT, AccountAnalytics.SIGN_UP_EVENT_NAME, AccountAnalytics.LOGIN_EVENT_NAME, FirstLaunchAnalytics.FIRST_LAUNCH, AccountAnalytics.LOGIN_SIGN_UP_START_SCREEN, AccountAnalytics.CREATE_USER_PROFILE, AccountAnalytics.CREATE_YOUR_STORE, AccountAnalytics.PROFILE_SETTINGS, AdultContentAnalytics.ADULT_CONTENT, DeepLinkAnalytics.APP_LAUNCH, DeepLinkAnalytics.FACEBOOK_APP_LAUNCH, AppViewAnalytics.CLICK_INSTALL, InstallAnalytics.NOTIFICATION_APPLICATION_INSTALL, InstallAnalytics.EDITORS_APPLICATION_INSTALL, DownloadAnalytics.NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, SearchAnalytics.SEARCH, SearchAnalytics.NO_RESULTS, SearchAnalytics.APP_CLICK, SearchAnalytics.SEARCH_START, SearchAnalytics.AB_SEARCH_ACTION, SearchAnalytics.AB_SEARCH_IMPRESSION, AppViewAnalytics.EDITORS_CHOICE_CLICKS, AppViewAnalytics.APP_VIEW_INTERACT, AppViewAnalytics.DONATIONS_IMPRESSION, NotificationAnalytics.NOTIFICATION_RECEIVED, NotificationAnalytics.NOTIFICATION_IMPRESSION, NotificationAnalytics.NOTIFICATION_PRESSED, UpdatesAnalytics.UPDATE_EVENT, PageViewsAnalytics.PAGE_VIEW_EVENT, FirstLaunchAnalytics.PLAY_PROTECT_EVENT, InstallEvents.ROOT_V2_COMPLETE, InstallEvents.ROOT_V2_START, AppViewAnalytics.SIMILAR_APP_INTERACT, AccountAnalytics.ENTRY, AppShortcutsAnalytics.APPS_SHORTCUTS, HomeAnalytics.HOME_INTERACT, HomeAnalytics.CURATION_CARD_CLICK, HomeAnalytics.CURATION_CARD_IMPRESSION, HomeAnalytics.HOME_CHIP_INTERACT, AccountAnalytics.PROMOTE_APTOIDE_EVENT_NAME, EditorialListAnalytics.EDITORIAL_BN_CURATION_CARD_CLICK, EditorialListAnalytics.EDITORIAL_BN_CURATION_CARD_IMPRESSION, BottomNavigationAnalytics.BOTTOM_NAVIGATION_INTERACT, DownloadAnalytics.DOWNLOAD_INTERACT, DonationsAnalytics.DONATIONS_INTERACT, EditorialAnalytics.CURATION_CARD_INSTALL, EditorialAnalytics.EDITORIAL_BN_CURATION_CARD_INSTALL, EditorialAnalytics.REACTION_INTERACT, PromotionsAnalytics.PROMOTION_DIALOG, PromotionsAnalytics.PROMOTIONS_INTERACT, PromotionsAnalytics.VALENTINE_MIGRATOR, AppViewAnalytics.ADS_BLOCK_BY_OFFER, AppViewAnalytics.APPC_SIMILAR_APP_INTERACT, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, AppViewAnalytics.BONUS_GAME_WALLET_OFFER_19, DeepLinkAnalytics.APPCOINS_WALLET_DEEPLINK, InstallEvents.MIUI_INSTALLATION_ABOVE_20_EVENT_NAME, AptoideApplicationAnalytics.IS_ANDROID_TV, ThemeAnalytics.DARK_THEME_INTERACT_EVENT, UserFeedbackAnalytics.USER_FEEDBACK_EVENT_NAME, InstallEvents.IS_INSTALLATION_TYPE_EVENT_NAME, AppValidationAnalytics.INVALID_DOWNLOAD_PATH_EVENT, SocialMediaAnalytics.PROMOTE_SOCIAL_MEDIA_EVENT_NAME, HomeAnalytics.VANILLA_PROMOTIONAL_CARDS}));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Map<Integer, Result> provideFragmentNavigatorMap() {
        return new HashMap();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public C5303a<Map<Integer, Result>> provideFragmentNavigatorRelay() {
        return C5303a.m10043o();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public GoogleApiClient provideGoogleApiClient() {
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.application);
        Api<GoogleSignInOptions> api = Auth.f13431e;
        GoogleSignInOptions.Builder builder2 = new GoogleSignInOptions.Builder(GoogleSignInOptions.f13547t);
        builder2.mo24770b();
        builder2.mo24767a(BuildConfig.GMS_SERVER_ID);
        builder.mo24955a(api, builder2.mo24769a());
        return builder.mo24958a();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideHomePromotionsId() {
        return BuildConfig.HOME_PROMOTION_ID;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public IdsRepository provideIdsRepository(@Named("default") SharedPreferences sharedPreferences, ContentResolver contentResolver) {
        Context applicationContext = this.application.getApplicationContext();
        return new IdsRepository(SecurePreferencesImplementation.getInstance(applicationContext, sharedPreferences), applicationContext, Settings.Secure.getString(contentResolver, "android_id"));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideImageCachePatch(@Named("cachePath") String str) {
        return str + "icons/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InstallAnalytics provideInstallAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return new InstallAnalytics(CrashReport.getInstance(), analyticsManager, navigationTracker, new HashMap(), connectivityManager, telephonyManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InstallationProvider provideInstallationProvider(AptoideDownloadManager aptoideDownloadManager, DownloadPersistence downloadPersistence, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        return new DownloadInstallationProvider(aptoideDownloadManager, downloadPersistence, aptoideInstalledAppsRepository, new MinimalAdMapper(), roomStoredMinimalAdPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideInstalledAppsRepository provideInstalledRepository(RoomInstalledPersistence roomInstalledPersistence, FileUtils fileUtils) {
        return new AptoideInstalledAppsRepository(roomInstalledPersistence, this.application.getPackageManager(), fileUtils);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InvalidRefreshTokenLogoutManager provideInvalidRefreshTokenLogoutManager(AptoideAccountManager aptoideAccountManager, TokenInvalidator tokenInvalidator) {
        return new InvalidRefreshTokenLogoutManager(aptoideAccountManager, (RefreshTokenInvalidator) tokenInvalidator);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public L2Cache provideL2Cache() {
        return new L2Cache(new POSTCacheKeyAlgorithm(), new File(this.application.getCacheDir(), "aptoide.wscache"));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public OkHttpClient provideLongTimeoutOkHttpClient(@Named("user-agent") Interceptor interceptor, @Named("default") SharedPreferences sharedPreferences, @Named("retrofit-log") Interceptor interceptor2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(interceptor);
        builder.addInterceptor(interceptor2);
        builder.connectTimeout(2, TimeUnit.MINUTES);
        builder.readTimeout(2, TimeUnit.MINUTES);
        builder.writeTimeout(2, TimeUnit.MINUTES);
        if (ToolboxManager.isToolboxEnableRetrofitLogs(sharedPreferences)) {
            builder.addInterceptor(interceptor2);
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideMarketName() {
        return BuildConfig.MARKET_NAME;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public MarketResourceFormatter provideMarketResourceFormatter(@Named("marketName") String str) {
        return new MarketResourceFormatter(str);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public MultipartBodyInterceptor provideMultipartBodyInterceptor(IdsRepository idsRepository, AuthenticationPersistence authenticationPersistence, RequestBodyFactory requestBodyFactory) {
        return new MultipartBodyInterceptor(idsRepository, requestBodyFactory, authenticationPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NavigationTracker provideNavigationTracker(PageViewsAnalytics pageViewsAnalytics, AnalyticsLogger analyticsLogger) {
        return new NavigationTracker(new ArrayList(), new TrackerFilter(), pageViewsAnalytics, analyticsLogger);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> provideNoAuthenticationBodyInterceptorV3(IdsRepository idsRepository, @Named("aptoidePackage") String str, AptoideMd5Manager aptoideMd5Manager) {
        return new NoAuthenticationBodyInterceptorV3(idsRepository, aptoideMd5Manager, str);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public ObjectMapper provideNonNullObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NotificationAnalytics provideNotificationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new NotificationAnalytics(new AptoideInstallParser(), analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NotificationProvider provideNotificationProvider(RoomNotificationPersistence roomNotificationPersistence) {
        return new NotificationProvider(roomNotificationPersistence, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public OAuthModeProvider provideOAuthModeProvider() {
        return new OAuthModeProvider();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideObbPath(@Named("cachePath") String str) {
        return str + "obb/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public OkHttpClient provideOkHttpClient(@Named("default") OkHttpClient.Builder builder, @Named("user-agent") Interceptor interceptor) {
        builder.addInterceptor(interceptor);
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PageViewsAnalytics providePageViewsAnalytics(AnalyticsManager analyticsManager) {
        return new PageViewsAnalytics(analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PermissionManager providePermissionManager() {
        return new PermissionManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PromotionsManager providePromotionsManager(InstallManager installManager, PromotionViewAppMapper promotionViewAppMapper, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, PromotionsAnalytics promotionsAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, PromotionsService promotionsService, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MoPubAdsManager moPubAdsManager, WalletAppProvider walletAppProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new PromotionsManager(promotionViewAppMapper, installManager, downloadFactory, downloadStateParser, promotionsAnalytics, notificationAnalytics, installAnalytics, this.application.getApplicationContext().getPackageManager(), promotionsService, aptoideInstalledAppsRepository, moPubAdsManager, walletAppProvider, dynamicSplitsManager, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public QManager provideQManager(Resources resources, WindowManager windowManager) {
        return new QManager(resources, (ActivityManager) this.application.getSystemService("activity"), windowManager, (UiModeManager) this.application.getSystemService("uimode"));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RequestBodyFactory provideRequestBodyFactory() {
        return new RequestBodyFactory();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Resources provideResources() {
        return this.application.getResources();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Interceptor provideRetrofitLogInterceptor() {
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomInstalledPersistence provideRoomInstalledPersistence(AptoideDatabase aptoideDatabase, RoomInstallationPersistence roomInstallationPersistence, RoomInstallationMapper roomInstallationMapper) {
        return new RoomInstalledPersistence(aptoideDatabase.installedDao(), roomInstallationPersistence, roomInstallationMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomNotificationPersistence provideRoomNotificationPersistence(AptoideDatabase aptoideDatabase) {
        return new RoomNotificationPersistence(aptoideDatabase.notificationDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RootAvailabilityManager provideRootAvailabilityManager(@Named("secure") final SecurePreferences securePreferences) {
        return new RootAvailabilityManager(new RootValueSaver() {
            final String IS_PHONE_ROOTED = "IS_PHONE_ROOTED";

            public Single<Boolean> isPhoneRoot() {
                return securePreferences.getBoolean("IS_PHONE_ROOTED", false).mo18669c().mo18700m();
            }

            public C5328b save(boolean z) {
                return securePreferences.save("IS_PHONE_ROOTED", z);
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RootInstallationRetryHandler provideRootInstallationRetryHandler(InstallManager installManager) {
        Intent intent = new Intent(this.application, RootInstallNotificationEventReceiver.class);
        intent.setAction(RootInstallNotificationEventReceiver.ROOT_INSTALL_RETRY_ACTION);
        C0373i.C0374a aVar = new C0373i.C0374a((int) C1086R.C1087drawable.ic_refresh_action_black, (CharSequence) this.application.getString(C1086R.string.generalscreen_short_root_install_timeout_error_action), PendingIntent.getBroadcast(this.application, 2, intent, 134217728));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.application, 3, intent.setAction(RootInstallNotificationEventReceiver.ROOT_INSTALL_DISMISS_ACTION), 134217728);
        SystemNotificationShower systemNotificationShower = this.application.getSystemNotificationShower();
        C5305c o = C5305c.m10045o();
        AptoideApplication aptoideApplication = this.application;
        return new RootInstallationRetryHandler(230498, systemNotificationShower, installManager, o, 0, aptoideApplication, new RootInstallErrorNotificationFactory(230498, BitmapFactory.decodeResource(aptoideApplication.getResources(), C1086R.mipmap.ic_launcher), aVar, broadcast));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideSearchBaseUrl(@Named("default") SharedPreferences sharedPreferences) {
        return new SearchHostProvider(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences), BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, BuildConfig.APTOIDE_WEB_SERVICES_SEARCH_HOST, BuildConfig.APTOIDE_WEB_SERVICES_SEARCH_SSL_HOST).getSearchHost();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SecureCoderDecoder provideSecureCoderDecoder(@Named("default") SharedPreferences sharedPreferences) {
        return new SecureCoderDecoder.Builder(this.application, sharedPreferences).create();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SplitTypeSubFileTypeMapper provideSplitTypeSubFileTypeMapper() {
        return new SplitTypeSubFileTypeMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public StoreManager provideStoreManager(@Named("default") OkHttpClient okHttpClient, @Named("multipart") MultipartBodyInterceptor multipartBodyInterceptor, @Named("defaultInterceptorV3") BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor2, @Named("default") SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, RequestBodyFactory requestBodyFactory, @Named("default") ObjectMapper objectMapper, RoomStoreRepository roomStoreRepository) {
        return new StoreManager(okHttpClient, WebService.getDefaultConverter(), multipartBodyInterceptor, bodyInterceptor, bodyInterceptor2, sharedPreferences, tokenInvalidator, requestBodyFactory, objectMapper, roomStoreRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideStoreName() {
        return DeepLinkIntentReceiver.DeepLinksTargets.APPS;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public StoreUtilsProxy provideStoreUtilsProxy(AptoideAccountManager aptoideAccountManager, RoomStoreRepository roomStoreRepository, @Named("default") OkHttpClient okHttpClient, @Named("default") SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, StoreCredentialsProvider storeCredentialsProvider) {
        return new StoreUtilsProxy(aptoideAccountManager, bodyInterceptor, storeCredentialsProvider, roomStoreRepository, okHttpClient, WebService.getDefaultConverter(), tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SyncScheduler provideSyncScheduler(SyncStorage syncStorage) {
        return new AlarmSyncScheduler(this.application, syncStorage);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SyncStorage provideSyncStorage(RoomLocalNotificationSyncPersistence roomLocalNotificationSyncPersistence) {
        return new SyncStorage(new HashMap(), roomLocalNotificationSyncPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public TokenInvalidator provideTokenInvalidator(@Named("default") OkHttpClient okHttpClient, @Named("default") SharedPreferences sharedPreferences, AuthenticationPersistence authenticationPersistence, @Named("no-authentication-v3") BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor, @Named("extraID") String str) {
        return new RefreshTokenInvalidator(bodyInterceptor, okHttpClient, WebService.getDefaultConverter(), sharedPreferences, str, new NoOpTokenInvalidator(), authenticationPersistence, C12871b.m41468p());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Interceptor provideUserAgentInterceptor(AndroidAccountProvider androidAccountProvider, IdsRepository idsRepository, @Named("partnerID") String str) {
        return new UserAgentInterceptor(idsRepository, str, new DisplayMetrics(), AptoideUtils.SystemU.TERMINAL_INFO, AptoideUtils.Core.getDefaultVername(this.application));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Interceptor provideUserAgentInterceptorV8(IdsRepository idsRepository, @Named("aptoidePackage") String str, AuthenticationPersistence authenticationPersistence, AptoideMd5Manager aptoideMd5Manager) {
        return new UserAgentInterceptorV8(idsRepository, AptoideUtils.SystemU.getRelease(), Build.VERSION.SDK_INT, AptoideUtils.SystemU.getModel(), AptoideUtils.SystemU.getProduct(), System.getProperty("os.arch"), new DisplayMetrics(), AptoideUtils.Core.getDefaultVername(this.application).replace("aptoide-", ""), str, aptoideMd5Manager, BuildConfig.VERSION_CODE, authenticationPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public OkHttpClient provideV8OkHttpClient(@Named("default") OkHttpClient.Builder builder, @Named("user-agent-v8") Interceptor interceptor) {
        builder.addInterceptor(interceptor);
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public OkHttpClient provideWebSocketOkHttpClient(@Named("user-agent") Interceptor interceptor, @Named("default") SharedPreferences sharedPreferences, @Named("retrofit-log") Interceptor interceptor2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(interceptor);
        builder.addInterceptor(interceptor2);
        builder.connectTimeout(2, TimeUnit.MINUTES);
        builder.readTimeout(1, TimeUnit.MINUTES);
        builder.writeTimeout(1, TimeUnit.MINUTES);
        builder.pingInterval(10, TimeUnit.SECONDS);
        if (ToolboxManager.isToolboxEnableRetrofitLogs(sharedPreferences)) {
            builder.addInterceptor(interceptor2);
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WindowManager provideWindowManager() {
        return (WindowManager) this.application.getSystemService("window");
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesABRetrofit(@Named("ab-testing-base-host") String str, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ABTestCenterRepository providesABTestCenterRepository(ABTestService aBTestService, RoomExperimentPersistence roomExperimentPersistence, @Named("ab-test-local-cache") HashMap<String, ExperimentModel> hashMap, AbTestCacheValidator abTestCacheValidator) {
        return new ABTestCenterRepository(aBTestService, hashMap, roomExperimentPersistence, abTestCacheValidator);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public ABTestManager providesABTestManager(ABTestCenterRepository aBTestCenterRepository) {
        return new ABTestManager(aBTestCenterRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ABTestService providesABTestService(@Named("ab-test-service-provider") ABTestServiceProvider aBTestServiceProvider, IdsRepository idsRepository) {
        return new ABTestService(aBTestServiceProvider, idsRepository, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public ABTestServiceProvider providesABTestServiceProvider(@Named("default") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2, @Named("default") SharedPreferences sharedPreferences) {
        return new ABTestServiceProvider(okHttpClient, factory, factory2, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ABTestService.ABTestingService providesABTestServiceV7(@Named("retrofit-AB") Retrofit retrofit) {
        return (ABTestService.ABTestingService) retrofit.create(ABTestService.ABTestingService.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesABTestingBaseHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_AB_TESTING_HOST);
        sb.append("/api/v1/");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AbTestCacheValidator providesAbTestCacheValidator(@Named("ab-test-local-cache") HashMap<String, ExperimentModel> hashMap) {
        return new AbTestCacheValidator(hashMap);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public HashMap<String, ExperimentModel> providesAbTestLocalCache() {
        return new HashMap<>();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AccountPersistence providesAccountPersistence(AccountManager accountManager, DatabaseStoreDataPersist databaseStoreDataPersist, AccountFactory accountFactory, AndroidAccountProvider androidAccountProvider, AuthenticationPersistence authenticationPersistence) {
        return new AndroidAccountManagerPersistence(accountManager, databaseStoreDataPersist, accountFactory, androidAccountProvider, authenticationPersistence, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdMapper providesAdMapper() {
        return new AdMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdsApplicationVersionCodeProvider providesAdsApplicationVersionCodeProvider(PackageRepository packageRepository) {
        return new PackageRepositoryVersionCodeProvider(packageRepository, this.application.getPackageName());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdsManager providesAdsManager(AdsRepository adsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        return new AdsManager(adsRepository, roomStoredMinimalAdPersistence, new MinimalAdMapper());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AgentPersistence providesAgentPersistence(@Named("secureShared") SharedPreferences sharedPreferences) {
        return new AgentPersistence(sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AnalyticsLogger providesAnalyticsDebugLogger() {
        return new AnalyticsLogcatLogger();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AnalyticsManager providesAnalyticsManager(@Named("aptoideLogger") EventLogger eventLogger, @Named("facebook") EventLogger eventLogger2, @Named("flurryLogger") EventLogger eventLogger3, HttpKnockEventLogger httpKnockEventLogger, @Named("aptoideEvents") Collection<String> collection, @Named("facebookEvents") Collection<String> collection2, @Named("flurryEvents") Collection<String> collection3, @Named("flurrySession") SessionLogger sessionLogger, @Named("aptoideSession") SessionLogger sessionLogger2, @Named("normalizer") AnalyticsEventParametersNormalizer analyticsEventParametersNormalizer, @Named("rakamEventLogger") EventLogger eventLogger4, @Named("rakamEvents") Collection<String> collection4, @Named("indicativeEventLogger") EventLogger eventLogger5, @Named("indicativeEvents") Collection<String> collection5, AnalyticsLogger analyticsLogger) {
        EventLogger eventLogger6 = eventLogger;
        Collection<String> collection6 = collection;
        EventLogger eventLogger7 = eventLogger2;
        Collection<String> collection7 = collection2;
        EventLogger eventLogger8 = eventLogger3;
        Collection<String> collection8 = collection3;
        EventLogger eventLogger9 = eventLogger4;
        Collection<String> collection9 = collection4;
        SessionLogger sessionLogger3 = sessionLogger;
        SessionLogger sessionLogger4 = sessionLogger2;
        HttpKnockEventLogger httpKnockEventLogger2 = httpKnockEventLogger;
        AnalyticsEventParametersNormalizer analyticsEventParametersNormalizer2 = analyticsEventParametersNormalizer;
        return new AnalyticsManager.Builder().addLogger(eventLogger, collection).addLogger(eventLogger2, collection2).addLogger(eventLogger3, collection3).addLogger(eventLogger4, collection4).addLogger(eventLogger5, collection5).addSessionLogger(sessionLogger).addSessionLogger(sessionLogger2).setKnockLogger(httpKnockEventLogger).setAnalyticsNormalizer(analyticsEventParametersNormalizer).setDebugLogger(analyticsLogger).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public AnalyticsEventParametersNormalizer providesAnalyticsNormalizer() {
        return new AnalyticsEventParametersNormalizer();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesApiChainBDSRetrofit(@Named("v8") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2, @Named("apichain-bds-base-host") String str) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesApichainBdsBaseHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_APICHAIN_BDS_HOST);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppBundlesVisibilityManager providesAppBundlesVisibilityManager(AppBundlesVisibilitySettingsProvider appBundlesVisibilitySettingsProvider) {
        return new AppBundlesVisibilityManager(AptoideUtils.isMIUIwithAABFix(), AptoideUtils.isDeviceMIUI(), appBundlesVisibilitySettingsProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppBundlesVisibilitySettingsProvider providesAppBundlesVisibilitySettingsProvider(@Named("default") SharedPreferences sharedPreferences) {
        return new AppBundlesVisibilitySettingsProvider(sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppCenter providesAppCenter(AppCenterRepository appCenterRepository) {
        return new AppCenter(appCenterRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppCenterRepository providesAppCenterRepository(AppService appService) {
        return new AppCenterRepository(appService, new HashMap());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppCoinsAdvertisingManager providesAppCoinsAdvertisingManager(AppCoinsService appCoinsService) {
        return new AppCoinsAdvertisingManager(appCoinsService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppCoinsManager providesAppCoinsManager(DonationsService donationsService, BonusAppcService bonusAppcService) {
        return new AppCoinsManager(donationsService, bonusAppcService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppCoinsService providesAppCoinsService(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new AppCoinsService(okHttpClient, tokenInvalidator, sharedPreferences, bodyInterceptor, factory, appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppComingSoonRegistrationManager providesAppComingSoonPreferencesManager(AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence) {
        return new AppComingSoonRegistrationManager(appComingSoonRegistrationPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppComingSoonRegistrationPersistence providesAppComingSoonRegistrationPersistence(AptoideDatabase aptoideDatabase) {
        return new RoomAppComingSoonPersistence(aptoideDatabase.appComingSoonRegistrationDAO());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppDownloaderProvider providesAppDownloaderProvider(RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        return new AppDownloaderProvider(retryFileDownloaderProvider, downloadAnalytics);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppInBackgroundTracker providesAppInBackgroundTracker() {
        return new AppInBackgroundTracker();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppInstaller providesAppInstaller(AppInstallerStatusReceiver appInstallerStatusReceiver) {
        return new AppInstaller(this.application.getApplicationContext(), new C1090a(appInstallerStatusReceiver));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppInstallerStatusReceiver providesAppInstallerStatusReceiver() {
        return new AppInstallerStatusReceiver(C12871b.m41468p());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppService providesAppService(StoreCredentialsProvider storeCredentialsProvider, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, SplitsMapper splitsMapper, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new AppService(storeCredentialsProvider, bodyInterceptor, okHttpClient, WebService.getDefaultConverter(), tokenInvalidator, sharedPreferences, splitsMapper, appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppShortcutsAnalytics providesAppShortcutsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new AppShortcutsAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppValidationAnalytics providesAppValidationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new AppValidationAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppValidator providesAppValidator(AppValidationAnalytics appValidationAnalytics) {
        return new AppValidator(appValidationAnalytics);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppViewAnalytics providesAppViewAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, StoreAnalytics storeAnalytics, InstallAnalytics installAnalytics) {
        return new AppViewAnalytics(downloadAnalytics, analyticsManager, navigationTracker, storeAnalytics, installAnalytics);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppcMigrationPersistence providesAppcMigrationAccessor(AptoideDatabase aptoideDatabase) {
        return new RoomAppcMigrationPersistence(aptoideDatabase.migratedAppDAO());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppcMigrationManager providesAppcMigrationManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AppcMigrationRepository appcMigrationRepository) {
        return new AppcMigrationManager(aptoideInstalledAppsRepository, appcMigrationRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppcMigrationRepository providesAppcMigrationService(AppcMigrationPersistence appcMigrationPersistence) {
        return new AppcMigrationRepository(appcMigrationPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesAppsFlyerBaseUrl() {
        return "https://impression.appsflyer.com";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppsFlyerManager providesAppsFlyerManager(AppsFlyerRepository appsFlyerRepository) {
        return new AppsFlyerManager(appsFlyerRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppsFlyerRepository providesAppsFlyerRepository(AppsFlyerService appsFlyerService) {
        return new AppsFlyerRepository(appsFlyerService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesAppsFlyerRetrofit(@Named("appsflyer-host") String str, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addConverterFactory(factory).addCallAdapterFactory(factory2).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AppsFlyerService providesAppsFlyerService(@Named("apps-flyer-retrofit") Retrofit retrofit) {
        return (AppsFlyerService) retrofit.create(AppsFlyerService.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideAuthenticationRx providesAptoideAuthentication(@Named("base-webservices-host") String str, @Named("default") OkHttpClient okHttpClient) {
        return new AptoideAuthenticationRx(new AptoideAuthentication(new RemoteAuthenticationService(str, okHttpClient)));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public AptoideBiEventLogger providesAptoideBILogger(EventsPersistence eventsPersistence, AptoideBiEventService aptoideBiEventService, @Named("default") SharedPreferences sharedPreferences, AnalyticsLogger analyticsLogger) {
        return new AptoideBiEventLogger(new AptoideBiAnalytics(eventsPersistence, new SharedPreferencesSessionPersistence(sharedPreferences), aptoideBiEventService, new C5383b(), Schedulers.computation(), 0, 60000, CrashReport.getInstance(), analyticsLogger), BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RetrofitAptoideBiService.ServiceV7 providesAptoideBiService(@Named("retrofit-v7") Retrofit retrofit) {
        return (RetrofitAptoideBiService.ServiceV7) retrofit.create(RetrofitAptoideBiService.ServiceV7.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideDatabase providesAptoideDataBase(RoomMigrationProvider roomMigrationProvider) {
        C0753j.C0754a<AptoideDatabase> a = C0752i.m3482a(this.application.getApplicationContext(), AptoideDatabase.class, "aptoide.db");
        a.mo4405a(getSQLiteIntArrayVersions());
        a.mo4406a(roomMigrationProvider.getMigrations());
        return a.mo4407b();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public EventLogger providesAptoideEventLogger(@Named("aptoide") AptoideBiEventLogger aptoideBiEventLogger) {
        return aptoideBiEventLogger;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideInstallManager providesAptoideInstallManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AptoideInstallRepository aptoideInstallRepository) {
        return new AptoideInstallManager(aptoideInstalledAppsRepository, aptoideInstallRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideInstallPersistence providesAptoideInstallPersistence(AptoideDatabase aptoideDatabase) {
        return new RoomAptoideInstallPersistence(aptoideDatabase.aptoideInstallDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideInstallRepository providesAptoideInstallRepository(AptoideInstallPersistence aptoideInstallPersistence) {
        return new AptoideInstallRepository(aptoideInstallPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideMd5Manager providesAptoideMd5Manager(PreferencesPersister preferencesPersister) {
        return new AptoideMd5Manager(preferencesPersister, this.application.getPackageManager(), this.application.getPackageName(), BuildConfig.VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public SessionLogger providesAptoideSessionLogger(@Named("aptoide") AptoideBiEventLogger aptoideBiEventLogger) {
        return aptoideBiEventLogger;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesAutoUpdateBaseHost() {
        return "http://imgs.aptoide.com/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesAutoUpdateRetrofit(@Named("default") OkHttpClient okHttpClient, @Named("auto-update-base-host") String str, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Service providesAutoUpdateService(@Named("retrofit-v7") Retrofit retrofit) {
        return (Service) retrofit.create(Service.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesBaseHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesBaseRakamHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_RAKAM_HOST);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesBaseSecondaryHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_READ_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesBaseWebservicesHost(@Named("default") SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BlacklistManager providesBlacklistManager(Blacklister blacklister, BlacklistUnitMapper blacklistUnitMapper) {
        return new BlacklistManager(blacklister, blacklistUnitMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BlacklistPersistence providesBlacklistPersistence(@Named("default") SharedPreferences sharedPreferences) {
        return new BlacklistPersistence(sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Blacklister providesBlacklister(BlacklistPersistence blacklistPersistence) {
        return new Blacklister(blacklistPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> providesBodyInterceptorV3(IdsRepository idsRepository, QManager qManager, @Named("default") SharedPreferences sharedPreferences, NetworkOperatorManager networkOperatorManager, AuthenticationPersistence authenticationPersistence, @Named("aptoidePackage") String str, AptoideMd5Manager aptoideMd5Manager) {
        return new BodyInterceptorV3(idsRepository, aptoideMd5Manager, str, qManager, sharedPreferences, BodyInterceptorV3.RESPONSE_MODE_JSON, Build.VERSION.SDK_INT, networkOperatorManager, authenticationPersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BonusAppcService providesBonusAppcService(BonusAppcRemoteService.ServiceApi serviceApi) {
        return new BonusAppcRemoteService(serviceApi);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BonusAppcRemoteService.ServiceApi providesBonusAppcServiceApi(@Named("retrofit-apichain-bds") Retrofit retrofit) {
        return (BonusAppcRemoteService.ServiceApi) retrofit.create(BonusAppcRemoteService.ServiceApi.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BundlesRepository providesBundleRepository(@Named("remote") BundleDataSource bundleDataSource) {
        return new BundlesRepository(bundleDataSource, new HashMap(), new HashMap(), 5);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BlacklistUnitMapper providesBundleToBlacklistUnitMapper() {
        return new BlacklistUnitMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public BundlesResponseMapper providesBundlesMapper(InstallManager installManager, WalletAdsOfferCardManager walletAdsOfferCardManager, BlacklistManager blacklistManager, DownloadStateParser downloadStateParser, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        return new BundlesResponseMapper(installManager, walletAdsOfferCardManager, blacklistManager, downloadStateParser, appComingSoonRegistrationManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public CallAdapter.Factory providesCallAdapterFactory() {
        return RxJavaCallAdapterFactory.create();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public CampaignAnalytics providesCampaignAnalytics(AnalyticsManager analyticsManager) {
        return new CampaignAnalytics(new HashMap(), analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public CaptionBackgroundPainter providesCaptionBackgroundPainter() {
        return new CaptionBackgroundPainter(this.application.getApplicationContext().getResources());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ChipManager providesChipManager() {
        return new ChipManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ComingSoonNotificationManager providesComingSoonNotificationManager(AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        return new ComingSoonNotificationManager(this.application.getApplicationContext(), appComingSoonRegistrationManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ConnectivityManager providesConnectivityManager() {
        return (ConnectivityManager) this.application.getSystemService("connectivity");
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Converter.Factory providesConverterFactory() {
        return WebService.getDefaultConverter();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public CrashReport providesCrashReports() {
        return CrashReport.getInstance();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DatabaseStoreDataPersist providesDatabaseStoreDataPersist(RoomStoreRepository roomStoreRepository) {
        return new DatabaseStoreDataPersist(new DatabaseStoreDataPersist.DatabaseStoreMapper(), roomStoreRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public DecimalFormat providesDecimalFormat() {
        return new DecimalFormat("0.0");
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public SharedPreferences providesDefaultSharedPerefences() {
        return PreferenceManager.getDefaultSharedPreferences(this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesDonationsRetrofit(@Named("v8") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(DONATIONS_URL).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DonationsService providesDonationsService(DonationsService.ServiceV8 serviceV8) {
        return new DonationsService(serviceV8);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DonationsService.ServiceV8 providesDonationsServiceV8(@Named("retrofit-donations") Retrofit retrofit) {
        return (DonationsService.ServiceV8) retrofit.create(DonationsService.ServiceV8.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadAnalytics providesDownloadAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return new DownloadAnalytics(connectivityManager, telephonyManager, navigationTracker, analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadAppFileMapper providesDownloadAppFileMapper() {
        return new DownloadAppFileMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadAppMapper providesDownloadAppMapper(DownloadAppFileMapper downloadAppFileMapper) {
        return new DownloadAppMapper(downloadAppFileMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadStateParser providesDownloadStateParser() {
        return new DownloadStateParser();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DownloadStatusManager providesDownloadStatusManager(InstallManager installManager, AppcMigrationManager appcMigrationManager) {
        return new DownloadStatusManager(installManager, appcMigrationManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DynamicSplitsRemoteService.DynamicSplitsApi providesDynamicSplitsApi(@Named("retrofit-v7") Retrofit retrofit) {
        return (DynamicSplitsRemoteService.DynamicSplitsApi) retrofit.create(DynamicSplitsRemoteService.DynamicSplitsApi.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DynamicSplitsManager providesDynamicSplitsManager(DynamicSplitsService dynamicSplitsService) {
        return new DynamicSplitsManager(dynamicSplitsService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DynamicSplitsMapper providesDynamicSplitsMapper() {
        return new DynamicSplitsMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public DynamicSplitsService providesDynamicSplitsService(DynamicSplitsRemoteService.DynamicSplitsApi dynamicSplitsApi, DynamicSplitsMapper dynamicSplitsMapper) {
        return new DynamicSplitsRemoteService(dynamicSplitsApi, dynamicSplitsMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public EditorialService providesEditorialService(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, SplitsMapper splitsMapper) {
        return new EditorialService(bodyInterceptor, okHttpClient, tokenInvalidator, factory, sharedPreferences, splitsMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public EskillsPreferencesManager providesEskillPreferencesManager(PreferencesPersister preferencesPersister) {
        return new EskillsPreferencesManager(preferencesPersister);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public EventsPersistence providesEventsPersistence(AptoideDatabase aptoideDatabase, RoomEventMapper roomEventMapper) {
        return new RoomEventPersistence(aptoideDatabase.eventDAO(), roomEventMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public EventLogger providesFacebookEventLogger(C4728g gVar, AnalyticsLogger analyticsLogger) {
        return new FacebookEventLogger(gVar, analyticsLogger);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public List<String> providesFacebookLoginPermissions() {
        return Collections.singletonList("email");
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FileDownloaderProvider providesFileDownloaderProvider(@Named("cachePath") String str, @Named("user-agent") Interceptor interceptor, AuthenticationPersistence authenticationPersistence, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, Md5Comparator md5Comparator) {
        OkHttpClient.Builder readTimeout = new OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(new DownloadMirrorEventInterceptor(downloadAnalytics, installAnalytics)).connectTimeout(20, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS);
        AptoideApplication aptoideApplication = this.application;
        C8900d.C8901a aVar = new C8900d.C8901a();
        aVar.mo32783a((C10763c.C10764a) new C10551a.C10552a(readTimeout));
        C10794q.m36614a((Context) aptoideApplication, aVar);
        return new FileDownloadManagerProvider(str, C10794q.m36615e(), md5Comparator);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FileManager providesFileManager(CacheHelper cacheHelper, @Named("cachePath") String str, AptoideDownloadManager aptoideDownloadManager, L2Cache l2Cache) {
        return new FileManager(cacheHelper, new FileUtils(), new String[]{this.application.getCacheDir().getPath(), str}, aptoideDownloadManager, l2Cache);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FirstLaunchAnalytics providesFirstLaunchAnalytics(AnalyticsManager analyticsManager, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient, GmsStatusValueProvider gmsStatusValueProvider) {
        return new FirstLaunchAnalytics(analyticsManager, analyticsLogger, safetyNetClient, this.application.getPackageName(), gmsStatusValueProvider, BuildConfig.VERSION_CODE);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FirstLaunchManager providesFirstLaunchManager(@Named("default") SharedPreferences sharedPreferences, IdsRepository idsRepository, FollowedStoresManager followedStoresManager, RootAvailabilityManager rootAvailabilityManager, AptoideAccountManager aptoideAccountManager, AptoideShortcutManager aptoideShortcutManager) {
        return new FirstLaunchManager(sharedPreferences, idsRepository, followedStoresManager, rootAvailabilityManager, aptoideAccountManager, aptoideShortcutManager, this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public EventLogger providesFlurryEventLogger(@Named("flurry") FlurryEventLogger flurryEventLogger) {
        return flurryEventLogger;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public FlurryEventLogger providesFlurryLogger(AnalyticsLogger analyticsLogger) {
        return new FlurryEventLogger(this.application, analyticsLogger);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public SessionLogger providesFlurrySessionLogger(@Named("flurry") FlurryEventLogger flurryEventLogger) {
        return flurryEventLogger;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public FollowedStoresManager providesFollowedStoresManager(StoreCredentialsProvider storeCredentialsProvider, @Named("default-followed-stores") List<String> list, StoreUtilsProxy storeUtilsProxy, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, AptoideAccountManager aptoideAccountManager, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences) {
        return new FollowedStoresManager(storeCredentialsProvider, list, storeUtilsProxy, bodyInterceptor, aptoideAccountManager, okHttpClient, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ForegroundManager providesForegroundManager() {
        return new ForegroundManager(this.application.getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public GmsStatusValueProvider providesGmsStatusValueProvider() {
        return new GmsStatusValueProvider(this.application.getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ImageInfoProvider providesImageInfoProvider() {
        return new ImageInfoProvider(this.application.getContentResolver());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public EventLogger providesIndicativeEventLogger(AnalyticsLogger analyticsLogger) {
        return new IndicativeEventLogger(analyticsLogger);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Collection<String> providesIndicativeEvents() {
        return Arrays.asList(new String[]{InstallAnalytics.CLICK_ON_INSTALL, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, InstallAnalytics.RAKAM_INSTALL_EVENT, SearchAnalytics.SEARCH, SearchAnalytics.SEARCH_RESULT_CLICK, FirstLaunchAnalytics.FIRST_LAUNCH_RAKAM, HomeAnalytics.VANILLA_PROMOTIONAL_CARDS});
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InstallAppSizeValidator providesInstallAppSizeValidator(FilePathProvider filePathProvider) {
        return new InstallAppSizeValidator(filePathProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InstallManager providesInstallManager(AptoideDownloadManager aptoideDownloadManager, @Named("default") Installer installer, RootAvailabilityManager rootAvailabilityManager, @Named("default") SharedPreferences sharedPreferences, @Named("secureShared") SharedPreferences sharedPreferences2, DownloadsRepository downloadsRepository, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, PackageInstallerManager packageInstallerManager, ForegroundManager foregroundManager, AptoideInstallManager aptoideInstallManager, InstallAppSizeValidator installAppSizeValidator, FileManager fileManager) {
        return new InstallManager(this.application, aptoideDownloadManager, installer, rootAvailabilityManager, sharedPreferences, sharedPreferences2, downloadsRepository, aptoideInstalledAppsRepository, packageInstallerManager, foregroundManager, aptoideInstallManager, installAppSizeValidator, fileManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomInstallationPersistence providesInstallationAccessor(AptoideDatabase aptoideDatabase) {
        return new RoomInstallationPersistence(aptoideDatabase.installationDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public InstallerAnalytics providesInstallerAnalytics(AnalyticsManager analyticsManager, InstallAnalytics installAnalytics, @Named("default") SharedPreferences sharedPreferences, RootAvailabilityManager rootAvailabilityManager, NavigationTracker navigationTracker) {
        return new InstallEvents(analyticsManager, installAnalytics, sharedPreferences, rootAvailabilityManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public LaunchManager providesLaunchManager(FirstLaunchManager firstLaunchManager, UpdateLaunchManager updateLaunchManager, @Named("secureShared") SharedPreferences sharedPreferences) {
        return new LaunchManager(firstLaunchManager, updateLaunchManager, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesLoadTopReactionsRetrofit(@Named("reactions-host") String str, @Named("v8") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public LocalNotificationSyncManager providesLocalNotificationSyncManager(SyncScheduler syncScheduler, NotificationProvider notificationProvider) {
        return new LocalNotificationSyncManager(syncScheduler, true, notificationProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public LoginSignupManager providesLoginSignupManager() {
        return new LoginSignupManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public MapToJsonMapper providesMapToJsonMapper() {
        return new MapToJsonMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Md5Comparator providesMd5Comparator(@Named("cachePath") String str) {
        return new Md5Comparator(str);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public MoPubAdsManager providesMoPubAdsManager(WalletAdsOfferManager walletAdsOfferManager) {
        return new MoPubAdsManager(walletAdsOfferManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdsUserPropertyManager providesMoPubAdsService(MoPubAdsManager moPubAdsManager, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MoPubAnalytics moPubAnalytics, CrashReport crashReport) {
        return new AdsUserPropertyManager(moPubAdsManager, aptoideInstalledAppsRepository, moPubAnalytics, crashReport, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public MoPubAnalytics providesMoPubAnalytics() {
        return new MoPubAnalytics();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public MyAccountManager providesMyAccountManager() {
        return new MyAccountManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NetworkOperatorManager providesNetworkOperatorManager(TelephonyManager telephonyManager) {
        return new NetworkOperatorManager(telephonyManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NewFeature providesNewFeature() {
        return new NewFeature("dark_theme", this.application.getString(C1086R.string.dark_theme_notification_title), this.application.getString(C1086R.string.dark_theme_notification_body), "turn_it_on", C1086R.string.dark_theme_notification_button);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NewFeatureManager providesNewFeatureManager(@Named("default") SharedPreferences sharedPreferences, NewFeature newFeature, LocalNotificationSyncManager localNotificationSyncManager) {
        return new NewFeatureManager(sharedPreferences, localNotificationSyncManager, newFeature);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public NewsletterManager providesNewsletterManager() {
        return new NewsletterManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public OemidProvider providesOemidProvider() {
        return new OemidProvider();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public OkHttpClient.Builder providesOkHttpBuilder(L2Cache l2Cache, @Named("default") SharedPreferences sharedPreferences, @Named("retrofit-log") Interceptor interceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(45, TimeUnit.SECONDS);
        builder.writeTimeout(45, TimeUnit.SECONDS);
        builder.cache(new Cache(this.application.getCacheDir(), 10485760));
        builder.addInterceptor(new POSTCacheInterceptor(l2Cache));
        if (ToolboxManager.isToolboxEnableRetrofitLogs(sharedPreferences)) {
            builder.addInterceptor(interceptor);
        }
        return builder;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PackageInstallerManager providesPackageInstallerManager() {
        return new PackageInstallerManager(AptoideUtils.isDeviceMIUI(), AptoideUtils.isMIUIwithAABFix());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PackageRepository providesPackageRepository() {
        return new PackageRepository(this.application.getPackageManager());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PromotionViewAppMapper providesPromotionViewAppMapper(DownloadStateParser downloadStateParser) {
        return new PromotionViewAppMapper(downloadStateParser);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PromotionsAnalytics providesPromotionsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        return new PromotionsAnalytics(analyticsManager, navigationTracker, downloadAnalytics, installAnalytics);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PromotionsPreferencesManager providesPromotionsPreferencesManager(PreferencesPersister preferencesPersister) {
        return new PromotionsPreferencesManager(preferencesPersister);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PromotionsService providesPromotionsService(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, @Named("default") SharedPreferences sharedPreferences, SplitsMapper splitsMapper, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new PromotionsService(bodyInterceptor, okHttpClient, tokenInvalidator, factory, sharedPreferences, splitsMapper, appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public EventLogger providesRakamEventLogger(AnalyticsLogger analyticsLogger, MapToJsonMapper mapToJsonMapper) {
        return new RakamEventLogger(analyticsLogger, mapToJsonMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Collection<String> providesRakamEvents() {
        return Arrays.asList(new String[]{InstallAnalytics.CLICK_ON_INSTALL, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, InstallAnalytics.RAKAM_INSTALL_EVENT, SearchAnalytics.SEARCH, SearchAnalytics.SEARCH_RESULT_CLICK, FirstLaunchAnalytics.FIRST_LAUNCH_RAKAM, HomeAnalytics.VANILLA_PROMOTIONAL_CARDS});
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesReactionsHost() {
        return "https://api.aptoide.com/";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReactionsManager providesReactionsManager(ReactionsService reactionsService) {
        return new ReactionsManager(reactionsService, new HashMap());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReactionsService providesReactionsService(ReactionsRemoteService.ServiceV8 serviceV8) {
        return new ReactionsRemoteService(serviceV8, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReactionsRemoteService.ServiceV8 providesReactionsServiceV8(@Named("retrofit-load-top-reactions") Retrofit retrofit) {
        return (ReactionsRemoteService.ServiceV8) retrofit.create(ReactionsRemoteService.ServiceV8.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReadyToInstallNotificationManager providesReadyToInstallNotificationManager(InstallManager installManager) {
        return new ReadyToInstallNotificationManager(installManager, new NotificationIdsMapper());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public BundleDataSource providesRemoteBundleDataSource(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, BundlesResponseMapper bundlesResponseMapper, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, AptoideAccountManager aptoideAccountManager, PackageRepository packageRepository, IdsRepository idsRepository, QManager qManager, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, OemidProvider oemidProvider, AppBundlesVisibilityManager appBundlesVisibilityManager, StoreCredentialsProvider storeCredentialsProvider, AppCoinsManager appCoinsManager) {
        IdsRepository idsRepository2 = idsRepository;
        Resources resources2 = resources;
        WindowManager windowManager2 = windowManager;
        ConnectivityManager connectivityManager2 = connectivityManager;
        AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider2 = adsApplicationVersionCodeProvider;
        StoreCredentialsProvider storeCredentialsProvider2 = storeCredentialsProvider;
        HashMap hashMap = r1;
        HashMap hashMap2 = new HashMap();
        WSWidgetsUtils wSWidgetsUtils = r1;
        WSWidgetsUtils wSWidgetsUtils2 = new WSWidgetsUtils();
        return new RemoteBundleDataSource(5, hashMap, bodyInterceptor, okHttpClient, factory, bundlesResponseMapper, tokenInvalidator, sharedPreferences, wSWidgetsUtils, storeCredentialsProvider2, idsRepository2, AdNetworkUtils.isGooglePlayServicesAvailable(this.application.getApplicationContext()), oemidProvider.getOemid(), aptoideAccountManager, qManager.getFilters(ManagerPreferences.getHWSpecsFilter(sharedPreferences)), resources2, windowManager2, connectivityManager2, adsApplicationVersionCodeProvider2, packageRepository, 10, 10, appBundlesVisibilityManager, appCoinsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideBiEventService providesRetrofitAptoideBiService(RetrofitAptoideBiService.ServiceV7 serviceV7, @Named("analytics-interceptor") AnalyticsBodyInterceptorV7 analyticsBodyInterceptorV7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new RetrofitAptoideBiService(simpleDateFormat, serviceV7, analyticsBodyInterceptorV7);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RetryFileDownloaderProvider providesRetryFileDownloaderProvider(FileDownloaderProvider fileDownloaderProvider) {
        return new RetryFileDownloadManagerProvider(fileDownloaderProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReviewsManager providesReviewsManager(ReviewsRepository reviewsRepository) {
        return new ReviewsManager(reviewsRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReviewsRepository providesReviewsRepository(ReviewsService reviewsService) {
        return new ReviewsRepository(reviewsService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ReviewsService providesReviewsService(StoreCredentialsProvider storeCredentialsProvider, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences) {
        return new ReviewsService(storeCredentialsProvider, bodyInterceptor, okHttpClient, WebService.getDefaultConverter(), tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomEventMapper providesRoomEventMapper(@Named("default") ObjectMapper objectMapper) {
        return new RoomEventMapper(objectMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomEventPersistence providesRoomEventPersistence(AptoideDatabase aptoideDatabase, RoomEventMapper roomEventMapper) {
        return new RoomEventPersistence(aptoideDatabase.eventDAO(), roomEventMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomExperimentMapper providesRoomExperimentMapper() {
        return new RoomExperimentMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomExperimentPersistence providesRoomExperimentPersistence(AptoideDatabase aptoideDatabase, RoomExperimentMapper roomExperimentMapper) {
        return new RoomExperimentPersistence(aptoideDatabase.experimentDAO(), roomExperimentMapper);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomInstallationMapper providesRoomInstallationMapper() {
        return new RoomInstallationMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomLocalNotificationSyncPersistence providesRoomLocalNotificationSyncPersistence(AptoideDatabase aptoideDatabase, NotificationProvider notificationProvider) {
        return new RoomLocalNotificationSyncPersistence(new RoomLocalNotificationSyncMapper(), notificationProvider, aptoideDatabase.localNotificationSyncDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomMigrationProvider providesRoomMigrationProvider() {
        return new RoomMigrationProvider();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomStoredMinimalAdPersistence providesRoomStoreMinimalAdPersistence(AptoideDatabase aptoideDatabase) {
        return new RoomStoredMinimalAdPersistence(aptoideDatabase.storeMinimalAdDAO());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RoomStoreRepository providesRoomStoreRepository(StorePersistence storePersistence) {
        return new RoomStoreRepository(storePersistence);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public RootInstallerProvider providesRootInstallerProvider(InstallerAnalytics installerAnalytics) {
        return new RootInstallerProvider(installerAnalytics, this.application.getApplicationContext().getPackageName());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SafetyNetClient providesSafetyNetClient() {
        return SafetyNet.m26859a(this.application);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SearchAnalytics providesSearchAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new SearchAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SearchRepository providesSearchRepository(RoomStoreRepository roomStoreRepository, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager, OemidProvider oemidProvider) {
        return new SearchRepository(roomStoreRepository, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager, oemidProvider);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SearchSuggestionManager providesSearchSuggestionManager(SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        return new SearchSuggestionManager(new SearchSuggestionService(searchSuggestionRemoteRepository), Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SearchSuggestionRemoteRepository providesSearchSuggestionRemoteRepository(Retrofit retrofit) {
        return (SearchSuggestionRemoteRepository) retrofit.create(SearchSuggestionRemoteRepository.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public Retrofit providesSearchSuggestionsRetrofit(@Named("ws-prod-suggestions-base-url") String str, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addConverterFactory(factory).addCallAdapterFactory(factory2).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public SecurePreferences providesSecurePerefences(@Named("default") SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        return new SecurePreferences(sharedPreferences, secureCoderDecoder);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public SharedPreferences providesSecureSharedPreferences(@Named("default") SharedPreferences sharedPreferences) {
        return SecurePreferencesImplementation.getInstance(this.application.getApplicationContext(), sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SettingsManager providesSettingsManager() {
        return new SettingsManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideShortcutManager providesShortcutManager() {
        return new AptoideShortcutManager();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SocialMediaAnalytics providesSocialMediaAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new SocialMediaAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SplitsMapper providesSplitsMapper() {
        return new SplitsMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public StoreAnalytics providesStoreAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new StoreAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public StoreCredentialsProvider providesStoreCredentialsProvider(RoomStoreRepository roomStoreRepository) {
        return new StoreCredentialsProviderImpl(roomStoreRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public StorePersistence providesStorePersistence(AptoideDatabase aptoideDatabase) {
        return new RoomStorePersistence(aptoideDatabase.storeDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SupportEmailProvider providesSupportEmailProvider(@Named("support-email") String str) {
        return new SupportEmailProvider(str, this.application.getString(C1086R.string.aptoide_email));
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public TelephonyManager providesTelephonyManager() {
        return (TelephonyManager) this.application.getSystemService("phone");
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public ThemeAnalytics providesThemeAnalytics(AnalyticsManager analyticsManager) {
        return new ThemeAnalytics(analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public TrendingManager providesTrendingManager(TrendingService trendingService) {
        return new TrendingManager(trendingService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public TrendingService providesTrendingService(StoreCredentialsProvider storeCredentialsProvider, @Named("default") SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, Converter.Factory factory, @Named("default") OkHttpClient okHttpClient, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new TrendingService(storeCredentialsProvider, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdateLaunchManager providesUpdateLaunchManager(FollowedStoresManager followedStoresManager) {
        return new UpdateLaunchManager(followedStoresManager);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdateMapper providesUpdateMapper() {
        return new UpdateMapper();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdatePersistence providesUpdatePersistence(AptoideDatabase aptoideDatabase) {
        return new RoomUpdatePersistence(aptoideDatabase.updateDao());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdateRepository providesUpdateRepository(UpdatePersistence updatePersistence, RoomStoreRepository roomStoreRepository, IdsRepository idsRepository, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager, UpdateMapper updateMapper, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        return new UpdateRepository(updatePersistence, roomStoreRepository, idsRepository, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager, updateMapper, aptoideInstalledAppsRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdatesAnalytics providesUpdatesAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics) {
        return new UpdatesAnalytics(analyticsManager, navigationTracker, installAnalytics);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdatesManager providesUpdatesManager(UpdateRepository updateRepository) {
        return new UpdatesManager(updateRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UpdatesNotificationManager providesUpdatesNotificationManager() {
        return new UpdatesNotificationManager(this.application.getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AptoideWorkerFactory providesUpdatesNotificationWorkerFactory(UpdateRepository updateRepository, @Named("default") SharedPreferences sharedPreferences, AptoideInstallManager aptoideInstallManager, SyncScheduler syncScheduler, SyncStorage syncStorage, CrashReport crashReport, AppCenter appCenter) {
        return new AptoideWorkerFactory(updateRepository, sharedPreferences, aptoideInstallManager, new AppMapper(), syncScheduler, syncStorage, crashReport, appCenter);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public UserFeedbackAnalytics providesUserFeedbackAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new UserFeedbackAnalytics(analyticsManager, navigationTracker);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public PreferencesPersister providesUserPreferencesPersister(@Named("default") SharedPreferences sharedPreferences) {
        return new PreferencesPersister(sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesV7Retrofit(@Named("base-host") String str, @Named("default") OkHttpClient okHttpClient, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public Retrofit providesV7SecondaryRetrofit(@Named("default") OkHttpClient okHttpClient, @Named("base-secondary-host") String str, Converter.Factory factory, @Named("rx") CallAdapter.Factory factory2) {
        return new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WalletAppProvider providesWalletAppProvider(AppCenter appCenter, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, InstallManager installManager, DownloadStateParser downloadStateParser) {
        return new WalletAppProvider(appCenter, aptoideInstalledAppsRepository, installManager, downloadStateParser);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WalletService providesWalletService(WalletService.ServiceV7 serviceV7) {
        return new WalletService(serviceV7, Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WalletService.ServiceV7 providesWalletServiceV8(@Named("retrofit-v7-secondary") Retrofit retrofit) {
        return (WalletService.ServiceV7) retrofit.create(WalletService.ServiceV7.class);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public HttpKnockEventLogger providesknockEventLogger(@Named("default") OkHttpClient okHttpClient) {
        return new HttpKnockEventLogger(okHttpClient);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public SplitAnalyticsMapper splitAnalyticsMapper() {
        return new SplitAnalyticsMapper();
    }
}
