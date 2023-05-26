package p015cm.aptoide.p016pt;

import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import androidx.fragment.app.C0462h;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.facebook.C6365d;
import com.facebook.p032t.C4728g;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.safetynet.SafetyNetClient;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AccountFactory;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.AptoideBiEventService;
import p015cm.aptoide.analytics.implementation.EventsPersistence;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;
import p015cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import p015cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService;
import p015cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import p015cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsMapper;
import p015cm.aptoide.p016pt.aab.DynamicSplitsRemoteService;
import p015cm.aptoide.p016pt.aab.DynamicSplitsService;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p015cm.aptoide.p016pt.account.DatabaseStoreDataPersist;
import p015cm.aptoide.p016pt.account.LoginPreferences;
import p015cm.aptoide.p016pt.account.OAuthModeProvider;
import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.ImageInfoProvider;
import p015cm.aptoide.p016pt.account.view.ImagePickerNavigator;
import p015cm.aptoide.p016pt.account.view.ImagePickerPresenter;
import p015cm.aptoide.p016pt.account.view.ImageValidator;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsFragment;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsFragment_MembersInjector;
import p015cm.aptoide.p016pt.account.view.PhotoFileGenerator;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailFragment;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailFragment_MembersInjector;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailPresenter;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkPresenter;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment_MembersInjector;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreNavigator;
import p015cm.aptoide.p016pt.account.view.store.ManageStorePresenter;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p015cm.aptoide.p016pt.account.view.user.CreateUserErrorMapper;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment_MembersInjector;
import p015cm.aptoide.p016pt.account.view.user.ManageUserNavigator;
import p015cm.aptoide.p016pt.account.view.user.ManageUserPresenter;
import p015cm.aptoide.p016pt.account.view.user.NewsletterManager;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepOneFragment;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepOneFragment_MembersInjector;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepTwoFragment;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepTwoFragment_MembersInjector;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.AdsUserPropertyManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.MoPubAnalytics;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.analytics.AnalyticsBodyInterceptorV7;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity_MembersInjector;
import p015cm.aptoide.p016pt.app.AdsManager;
import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingManager;
import p015cm.aptoide.p016pt.app.AppCoinsService;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.AppViewManager;
import p015cm.aptoide.p016pt.app.AppViewModelManager;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.FlagManager;
import p015cm.aptoide.p016pt.app.FlagService;
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
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment_MembersInjector;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment_MembersInjector;
import p015cm.aptoide.p016pt.app.view.AppViewNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewPresenter;
import p015cm.aptoide.p016pt.app.view.MoreBundleFragment;
import p015cm.aptoide.p016pt.app.view.MoreBundleFragment_MembersInjector;
import p015cm.aptoide.p016pt.app.view.MoreBundleManager;
import p015cm.aptoide.p016pt.app.view.MoreBundlePresenter;
import p015cm.aptoide.p016pt.app.view.OtherVersionsFragment;
import p015cm.aptoide.p016pt.app.view.OtherVersionsFragment_MembersInjector;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p015cm.aptoide.p016pt.app.view.donations.view.DonateDialogFragment;
import p015cm.aptoide.p016pt.app.view.donations.view.DonateDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogFragment;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogPresenter;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateRepository;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateService;
import p015cm.aptoide.p016pt.autoupdate.Service;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistPersistence;
import p015cm.aptoide.p016pt.blacklist.BlacklistUnitMapper;
import p015cm.aptoide.p016pt.blacklist.Blacklister;
import p015cm.aptoide.p016pt.bonus.BonusAppcRemoteService;
import p015cm.aptoide.p016pt.bonus.BonusAppcService;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity_MembersInjector;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationAnalytics;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.comments.view.CommentDialogFragment;
import p015cm.aptoide.p016pt.comments.view.CommentDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.comments.view.CommentListFragment;
import p015cm.aptoide.p016pt.comments.view.CommentListFragment_MembersInjector;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomEventMapper;
import p015cm.aptoide.p016pt.database.RoomInstallationMapper;
import p015cm.aptoide.p016pt.database.RoomInstallationPersistence;
import p015cm.aptoide.p016pt.database.RoomInstalledPersistence;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.dataprovider.NetworkOperatorManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p015cm.aptoide.p016pt.download.AppValidationAnalytics;
import p015cm.aptoide.p016pt.download.AppValidator;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadApkPathsProvider;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.Md5Comparator;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.download.SplitTypeSubFileTypeMapper;
import p015cm.aptoide.p016pt.download.view.DownloadDialogProvider;
import p015cm.aptoide.p016pt.download.view.DownloadNavigator;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceManager;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigator;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppFileMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.downloadmanager.DownloadStatusMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.RetryFileDownloaderProvider;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.editorial.EditorialFragment_MembersInjector;
import p015cm.aptoide.p016pt.editorial.EditorialManager;
import p015cm.aptoide.p016pt.editorial.EditorialNavigator;
import p015cm.aptoide.p016pt.editorial.EditorialPresenter;
import p015cm.aptoide.p016pt.editorial.EditorialRepository;
import p015cm.aptoide.p016pt.editorial.EditorialService;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListRepository;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListService;
import p015cm.aptoide.p016pt.editorialList.EditorialListAnalytics;
import p015cm.aptoide.p016pt.editorialList.EditorialListFragment;
import p015cm.aptoide.p016pt.editorialList.EditorialListFragment_MembersInjector;
import p015cm.aptoide.p016pt.editorialList.EditorialListManager;
import p015cm.aptoide.p016pt.editorialList.EditorialListNavigator;
import p015cm.aptoide.p016pt.editorialList.EditorialListPresenter;
import p015cm.aptoide.p016pt.feature.NewFeatureDialogPresenter;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationPersistence;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.EskillsPreferencesManager;
import p015cm.aptoide.p016pt.home.Home;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.home.HomeContainerFragment_MembersInjector;
import p015cm.aptoide.p016pt.home.HomeContainerNavigator;
import p015cm.aptoide.p016pt.home.HomeContainerPresenter;
import p015cm.aptoide.p016pt.home.HomeFragment;
import p015cm.aptoide.p016pt.home.HomeFragment_MembersInjector;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.home.HomePresenter;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.home.apps.AppsFragment;
import p015cm.aptoide.p016pt.home.apps.AppsFragment_MembersInjector;
import p015cm.aptoide.p016pt.home.apps.AppsManager;
import p015cm.aptoide.p016pt.home.apps.AppsNavigator;
import p015cm.aptoide.p016pt.home.apps.AppsPresenter;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.home.bundles.BundleDataSource;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListAnalytics;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListConfiguration;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment_MembersInjector;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListManager;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListPresenter;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcNavigator;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsConfiguration;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreFragment;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreFragment_MembersInjector;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreManager;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMorePresenter;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreRepository;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.DownloadService;
import p015cm.aptoide.p016pt.install.DownloadService_MembersInjector;
import p015cm.aptoide.p016pt.install.FilePathProvider;
import p015cm.aptoide.p016pt.install.ForegroundManager;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.InstalledIntentService;
import p015cm.aptoide.p016pt.install.InstalledIntentService_MembersInjector;
import p015cm.aptoide.p016pt.install.Installer;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.PackageInstallerManager;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.install.RootInstallerProvider;
import p015cm.aptoide.p016pt.install.installer.InstallationProvider;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.networking.MultipartBodyInterceptor;
import p015cm.aptoide.p016pt.notification.AppcPromotionNotificationStringProvider;
import p015cm.aptoide.p016pt.notification.AptoideWorkerFactory;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p015cm.aptoide.p016pt.notification.PullingContentService_MembersInjector;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.notification.RoomLocalNotificationSyncPersistence;
import p015cm.aptoide.p016pt.notification.UpdatesNotificationManager;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.notification.view.InboxFragment;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.packageinstaller.AppInstaller;
import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.LocalPersistenceAdultContent;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;
import p015cm.aptoide.p016pt.presenter.LoginSignupCredentialsFlavorPresenter;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogFragment;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogPresenter;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsManager;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionViewAppMapper;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p015cm.aptoide.p016pt.promotions.PromotionsFragment;
import p015cm.aptoide.p016pt.promotions.PromotionsFragment_MembersInjector;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p015cm.aptoide.p016pt.promotions.PromotionsPresenter;
import p015cm.aptoide.p016pt.promotions.PromotionsService;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.ReactionsRemoteService;
import p015cm.aptoide.p016pt.reactions.network.ReactionsService;
import p015cm.aptoide.p016pt.repository.request.RewardAppCoinsAppsRepository;
import p015cm.aptoide.p016pt.reviews.LatestReviewsFragment;
import p015cm.aptoide.p016pt.reviews.LatestReviewsFragment_MembersInjector;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment_MembersInjector;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.search.SearchManager;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.SearchRepository;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionRemoteRepository;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingService;
import p015cm.aptoide.p016pt.search.view.SearchResultFragment;
import p015cm.aptoide.p016pt.search.view.SearchResultFragment_MembersInjector;
import p015cm.aptoide.p016pt.search.view.SearchResultPresenter;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StorePersistence;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.AddStoreDialog;
import p015cm.aptoide.p016pt.store.view.AddStoreDialog_MembersInjector;
import p015cm.aptoide.p016pt.store.view.ListStoresFragment;
import p015cm.aptoide.p016pt.store.view.ListStoresFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.PrivateStoreDialog;
import p015cm.aptoide.p016pt.store.view.PrivateStoreDialog_MembersInjector;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.store.view.StoreFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.TopStoresFragment;
import p015cm.aptoide.p016pt.store.view.TopStoresFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresNavigator;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresPresenter;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresSubscribedFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresSubscribedFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoresFragment;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoresFragment_MembersInjector;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.NewFeatureDialogFragment;
import p015cm.aptoide.p016pt.themes.NewFeatureDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment_MembersInjector;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment_MembersInjector;
import p015cm.aptoide.p016pt.toolbox.ToolboxContentProvider;
import p015cm.aptoide.p016pt.toolbox.ToolboxContentProvider_MembersInjector;
import p015cm.aptoide.p016pt.updates.UpdateMapper;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdatesFragment;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdatesFragment_MembersInjector;
import p015cm.aptoide.p016pt.util.ApkFyManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p015cm.aptoide.p016pt.view.ActivityComponent;
import p015cm.aptoide.p016pt.view.ActivityModule;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideAccountNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideAccountPermissionProviderFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideApkFyFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideAutoUpdateManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideBottomNavigationMapperFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideBottomNavigationNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideClientSdkVersionFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideDeepLinkManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideFragmentManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideImagePickerNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideListStoreAppsNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideLocalVersionCodeFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideMainFragmentNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideMainPresenterFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideManageStoreNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideManageUserNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideMyAccountNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidePackageNameFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidePhotoFileGeneratorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideScreenOrientationManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvideUriToPathResolverFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesAppCoinsInfoNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesAppNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesAppViewNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesAutoUpdateRepositoryFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesAutoUpdateServiceFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesBottomNavigationAnalyticsFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesCatappultNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesClaimPromotionsNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesDialogUtilsFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesDonationsAnalyticsFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesExternalNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesListAppsMoreRepositoryFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesPromotionsNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesScreenHeightFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesScreenWidthFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesSearchNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesSocialMediaNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesThemeManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesWalletInstallAnalyticsFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesWalletInstallConfigurationFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesWalletInstallManagerFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesWalletInstallNavigatorFactory;
import p015cm.aptoide.p016pt.view.ActivityModule_ProvidesWalletInstallPresenterFactory;
import p015cm.aptoide.p016pt.view.AppCoinsInfoNavigator;
import p015cm.aptoide.p016pt.view.AppCoinsInfoPresenter;
import p015cm.aptoide.p016pt.view.AppViewConfiguration;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.BundleEvent;
import p015cm.aptoide.p016pt.view.C4493xf1dd651;
import p015cm.aptoide.p016pt.view.C4494xd0ca61e4;
import p015cm.aptoide.p016pt.view.DeepLinkManager;
import p015cm.aptoide.p016pt.view.FragmentComponent;
import p015cm.aptoide.p016pt.view.FragmentModule;
import p015cm.aptoide.p016pt.view.FragmentModule_EditorialListAnalyticsFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideAccountErrorMapperFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideCheckYourEmailPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideCreateUserErrorMapperFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideEarnAppCoinsListPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideEarnAppcListAnalyticsFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideEarnAppcListManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideEarnAppcNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideHomeFragmentNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideImagePickerPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideImageValidatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideLoginSignUpPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideManageStoreErrorMapperFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideManageStorePresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideManageUserPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideSearchResultPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvideSendMagicLinkPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppCoinsInfoPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppMapperFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppViewConfigurationFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppViewManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppViewModelManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppViewPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppsManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppsNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAppsPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesAutoUpdateDialogPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesBundleEventFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesCheckYourEmailNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesClaimPromotionDialogPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesClaimPromotionsManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesDarkthemeDialogPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesDownloadDialogManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesDownloadNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesDownloadViewActionPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialAnalyticsFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialListManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialListNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialListPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialListRepositoryFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialRepositoryFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesEditorialServiceFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesFlagManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesFlagServiceFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesGetStoreManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesGetStoreWidgetsPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomeAnalyticsFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomeContainerNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomeContainerPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomeFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomeNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesHomePresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesListAppsConfigurationFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesListAppsMoreConfigurationFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesListAppsMoreManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesListAppsMorePresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesMyStoreNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesMyStorePresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesOutOfSpaceManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesOutOfSpaceNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesPromotionsPresenterFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesSearchManagerFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesSendMagicLinkNavigatorFactory;
import p015cm.aptoide.p016pt.view.FragmentModule_ProvidesWizardPresenterFactory;
import p015cm.aptoide.p016pt.view.MainActivity;
import p015cm.aptoide.p016pt.view.MainActivity_MembersInjector;
import p015cm.aptoide.p016pt.view.ThemedActivityView;
import p015cm.aptoide.p016pt.view.ThemedActivityView_MembersInjector;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppCenterRepository;
import p015cm.aptoide.p016pt.view.app.AppService;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsFragment;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsNavigator;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p015cm.aptoide.p016pt.view.feedback.SendFeedbackFragment;
import p015cm.aptoide.p016pt.view.feedback.SendFeedbackFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.fragment.BaseBottomSheetDialogFragment;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.fragment.DescriptionFragment;
import p015cm.aptoide.p016pt.view.fragment.DescriptionFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.settings.MyAccountNavigator;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.settings.SupportEmailProvider;
import p015cm.aptoide.p016pt.view.wizard.WizardFragment;
import p015cm.aptoide.p016pt.view.wizard.WizardFragmentProvider;
import p015cm.aptoide.p016pt.view.wizard.WizardFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.wizard.WizardPageTwoFragment;
import p015cm.aptoide.p016pt.view.wizard.WizardPageTwoFragment_MembersInjector;
import p015cm.aptoide.p016pt.view.wizard.WizardPresenter;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallActivity;
import p015cm.aptoide.p016pt.wallet.WalletInstallActivity_MembersInjector;
import p015cm.aptoide.p016pt.wallet.WalletInstallAnalytics;
import p015cm.aptoide.p016pt.wallet.WalletInstallConfiguration;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p015cm.aptoide.p016pt.wallet.WalletInstallNavigator;
import p015cm.aptoide.p016pt.wallet.WalletInstallPresenter;
import p112n.p118g.p119b.C5303a;
import p320o.p321b.C10823a;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.DaggerApplicationComponent */
public final class DaggerApplicationComponent implements ApplicationComponent {
    private Provider<DownloadApkPathsProvider> downloadApkPathsProvider;
    private Provider<DownloadStatusMapper> downloadStatusMapperProvider;
    private Provider<FilePathProvider> filePathManagerProvider;
    /* access modifiers changed from: private */
    public Provider<AccountAnalytics> provideAccountAnalyticsProvider;
    private Provider<AccountFactory> provideAccountFactoryProvider;
    private Provider<AccountManager> provideAccountManagerProvider;
    private Provider<AccountService> provideAccountServiceProvider;
    /* access modifiers changed from: private */
    public Provider<BodyInterceptor<BaseBody>> provideAccountSettingsBodyInterceptorPoolV7Provider;
    private Provider<String> provideAccountTypeProvider;
    /* access modifiers changed from: private */
    public Provider<AdsRepository> provideAdsRepositoryProvider;
    private Provider<AdultContentAnalytics> provideAdultContentAnalyticsProvider;
    private Provider<AdultContent> provideAdultContentProvider;
    private Provider<AnalyticsBodyInterceptorV7> provideAnalyticsBodyInterceptorV7Provider;
    private Provider<AndroidAccountProvider> provideAndroidAccountProvider;
    private Provider<String> provideApkPathProvider;
    private Provider<C4728g> provideAppEventsLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<AptoideAccountManager> provideAptoideAccountManagerProvider;
    private Provider<AptoideDownloadManager> provideAptoideDownloadManagerProvider;
    private Provider<Collection<String>> provideAptoideEventsProvider;
    private Provider<String> provideAptoidePackageProvider;
    private Provider<AuthenticationPersistence> provideAuthenticationPersistenceProvider;
    private Provider<BodyInterceptor<BaseBody>> provideBodyInterceptorPoolV7Provider;
    private Provider<BodyInterceptor<BaseBody>> provideBodyInterceptorWebV7Provider;
    private Provider<CacheHelper> provideCacheHelperProvider;
    private Provider<String> provideCachePathProvider;
    /* access modifiers changed from: private */
    public Provider<C6365d> provideCallbackManagerProvider;
    private Provider<ContentResolver> provideContentResolverProvider;
    /* access modifiers changed from: private */
    public Provider<DeepLinkAnalytics> provideDeepLinkAnalyticsProvider;
    private Provider<List<String>> provideDefaultFollowedStoresProvider;
    private Provider<Installer> provideDefaultInstallerProvider;
    private Provider<Preferences> provideDefaultPreferencesProvider;
    /* access modifiers changed from: private */
    public Provider<DownloadFactory> provideDownloadFactoryProvider;
    private Provider<DownloadPersistence> provideDownloadPersistenceProvider;
    private Provider<DownloadsRepository> provideDownloadsRepositoryProvider;
    private Provider<String> provideExtraIDProvider;
    private Provider<Collection<String>> provideFacebookEventsProvider;
    private Provider<FileUtils> provideFileUtilsProvider;
    private Provider<Collection<String>> provideFlurryEventsProvider;
    /* access modifiers changed from: private */
    public Provider<Map<Integer, Result>> provideFragmentNavigatorMapProvider;
    /* access modifiers changed from: private */
    public Provider<C5303a<Map<Integer, Result>>> provideFragmentNavigatorRelayProvider;
    /* access modifiers changed from: private */
    public Provider<GoogleApiClient> provideGoogleApiClientProvider;
    /* access modifiers changed from: private */
    public Provider<String> provideHomePromotionsIdProvider;
    /* access modifiers changed from: private */
    public Provider<IdsRepository> provideIdsRepositoryProvider;
    /* access modifiers changed from: private */
    public Provider<InstallAnalytics> provideInstallAnalyticsProvider;
    private Provider<InstallationProvider> provideInstallationProvider;
    /* access modifiers changed from: private */
    public Provider<AptoideInstalledAppsRepository> provideInstalledRepositoryProvider;
    private Provider<InvalidRefreshTokenLogoutManager> provideInvalidRefreshTokenLogoutManagerProvider;
    private Provider<L2Cache> provideL2CacheProvider;
    private Provider<LocalPersistenceAdultContent> provideLocalAdultContentProvider;
    private Provider<LoginPreferences> provideLoginPreferencesProvider;
    private Provider<OkHttpClient> provideLongTimeoutOkHttpClientProvider;
    /* access modifiers changed from: private */
    public Provider<String> provideMarketNameProvider;
    /* access modifiers changed from: private */
    public Provider<MarketResourceFormatter> provideMarketResourceFormatterProvider;
    private Provider<MultipartBodyInterceptor> provideMultipartBodyInterceptorProvider;
    /* access modifiers changed from: private */
    public Provider<NavigationTracker> provideNavigationTrackerProvider;
    private Provider<BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody>> provideNoAuthenticationBodyInterceptorV3Provider;
    private Provider<ObjectMapper> provideNonNullObjectMapperProvider;
    /* access modifiers changed from: private */
    public Provider<NotificationAnalytics> provideNotificationAnalyticsProvider;
    private Provider<NotificationProvider> provideNotificationProvider;
    private Provider<OAuthModeProvider> provideOAuthModeProvider;
    private Provider<String> provideObbPathProvider;
    /* access modifiers changed from: private */
    public Provider<OkHttpClient> provideOkHttpClientProvider;
    private Provider<PageViewsAnalytics> providePageViewsAnalyticsProvider;
    private Provider<String> providePartnerIDProvider;
    /* access modifiers changed from: private */
    public Provider<PermissionManager> providePermissionManagerProvider;
    /* access modifiers changed from: private */
    public Provider<PromotionsManager> providePromotionsManagerProvider;
    private Provider<QManager> provideQManagerProvider;
    private Provider<RequestBodyFactory> provideRequestBodyFactoryProvider;
    /* access modifiers changed from: private */
    public Provider<Resources> provideResourcesProvider;
    private Provider<Interceptor> provideRetrofitLogInterceptorProvider;
    private Provider<RoomInstalledPersistence> provideRoomInstalledPersistenceProvider;
    private Provider<RoomNotificationPersistence> provideRoomNotificationPersistenceProvider;
    /* access modifiers changed from: private */
    public Provider<RootAvailabilityManager> provideRootAvailabilityManagerProvider;
    /* access modifiers changed from: private */
    public Provider<RootInstallationRetryHandler> provideRootInstallationRetryHandlerProvider;
    private Provider<String> provideSearchBaseUrlProvider;
    private Provider<SecureCoderDecoder> provideSecureCoderDecoderProvider;
    private Provider<SplitTypeSubFileTypeMapper> provideSplitTypeSubFileTypeMapperProvider;
    /* access modifiers changed from: private */
    public Provider<StoreManager> provideStoreManagerProvider;
    /* access modifiers changed from: private */
    public Provider<StoreUtilsProxy> provideStoreUtilsProxyProvider;
    private Provider<SyncScheduler> provideSyncSchedulerProvider;
    private Provider<SyncStorage> provideSyncStorageProvider;
    /* access modifiers changed from: private */
    public Provider<TokenInvalidator> provideTokenInvalidatorProvider;
    private Provider<Interceptor> provideUserAgentInterceptorProvider;
    private Provider<Interceptor> provideUserAgentInterceptorV8Provider;
    private Provider<OkHttpClient> provideV8OkHttpClientProvider;
    /* access modifiers changed from: private */
    public Provider<WindowManager> provideWindowManagerProvider;
    private Provider<AccountPersistence> providesAccountPersistenceProvider;
    /* access modifiers changed from: private */
    public Provider<AdMapper> providesAdMapperProvider;
    private Provider<AdsApplicationVersionCodeProvider> providesAdsApplicationVersionCodeProvider;
    /* access modifiers changed from: private */
    public Provider<AdsManager> providesAdsManagerProvider;
    /* access modifiers changed from: private */
    public Provider<AgentPersistence> providesAgentPersistenceProvider;
    private Provider<AnalyticsLogger> providesAnalyticsDebugLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<AnalyticsManager> providesAnalyticsManagerProvider;
    private Provider<AnalyticsEventParametersNormalizer> providesAnalyticsNormalizerProvider;
    private Provider<Retrofit> providesApiChainBDSRetrofitProvider;
    private Provider<String> providesApichainBdsBaseHostProvider;
    /* access modifiers changed from: private */
    public Provider<AppBundlesVisibilityManager> providesAppBundlesVisibilityManagerProvider;
    private Provider<AppBundlesVisibilitySettingsProvider> providesAppBundlesVisibilitySettingsProvider;
    /* access modifiers changed from: private */
    public Provider<AppCenter> providesAppCenterProvider;
    private Provider<AppCenterRepository> providesAppCenterRepositoryProvider;
    /* access modifiers changed from: private */
    public Provider<AppCoinsAdvertisingManager> providesAppCoinsAdvertisingManagerProvider;
    /* access modifiers changed from: private */
    public Provider<AppCoinsManager> providesAppCoinsManagerProvider;
    private Provider<AppCoinsService> providesAppCoinsServiceProvider;
    private Provider<AppComingSoonRegistrationManager> providesAppComingSoonPreferencesManagerProvider;
    private Provider<AppComingSoonRegistrationPersistence> providesAppComingSoonRegistrationPersistenceProvider;
    private Provider<AppDownloaderProvider> providesAppDownloaderProvider;
    private Provider<AppInBackgroundTracker> providesAppInBackgroundTrackerProvider;
    private Provider<AppInstaller> providesAppInstallerProvider;
    /* access modifiers changed from: private */
    public Provider<AppInstallerStatusReceiver> providesAppInstallerStatusReceiverProvider;
    private Provider<AppService> providesAppServiceProvider;
    /* access modifiers changed from: private */
    public Provider<AppShortcutsAnalytics> providesAppShortcutsAnalyticsProvider;
    private Provider<AppValidationAnalytics> providesAppValidationAnalyticsProvider;
    private Provider<AppValidator> providesAppValidatorProvider;
    /* access modifiers changed from: private */
    public Provider<AppViewAnalytics> providesAppViewAnalyticsProvider;
    private Provider<AppcMigrationPersistence> providesAppcMigrationAccessorProvider;
    /* access modifiers changed from: private */
    public Provider<AppcMigrationManager> providesAppcMigrationManagerProvider;
    private Provider<AppcMigrationRepository> providesAppcMigrationServiceProvider;
    private Provider<String> providesAppsFlyerBaseUrlProvider;
    /* access modifiers changed from: private */
    public Provider<AppsFlyerManager> providesAppsFlyerManagerProvider;
    private Provider<AppsFlyerRepository> providesAppsFlyerRepositoryProvider;
    private Provider<Retrofit> providesAppsFlyerRetrofitProvider;
    private Provider<AppsFlyerService> providesAppsFlyerServiceProvider;
    private Provider<AptoideAuthenticationRx> providesAptoideAuthenticationProvider;
    private Provider<AptoideBiEventLogger> providesAptoideBILoggerProvider;
    private Provider<RetrofitAptoideBiService.ServiceV7> providesAptoideBiServiceProvider;
    private Provider<AptoideDatabase> providesAptoideDataBaseProvider;
    private Provider<EventLogger> providesAptoideEventLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<AptoideInstallManager> providesAptoideInstallManagerProvider;
    private Provider<AptoideInstallPersistence> providesAptoideInstallPersistenceProvider;
    private Provider<AptoideInstallRepository> providesAptoideInstallRepositoryProvider;
    private Provider<AptoideMd5Manager> providesAptoideMd5ManagerProvider;
    private Provider<SessionLogger> providesAptoideSessionLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<Service> providesAutoUpdateServiceProvider;
    private Provider<String> providesBaseHostProvider;
    private Provider<String> providesBaseRakamHostProvider;
    private Provider<String> providesBaseSecondaryHostProvider;
    private Provider<String> providesBaseWebservicesHostProvider;
    /* access modifiers changed from: private */
    public Provider<BlacklistManager> providesBlacklistManagerProvider;
    private Provider<BlacklistPersistence> providesBlacklistPersistenceProvider;
    private Provider<Blacklister> providesBlacklisterProvider;
    /* access modifiers changed from: private */
    public Provider<BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody>> providesBodyInterceptorV3Provider;
    private Provider<BonusAppcRemoteService.ServiceApi> providesBonusAppcServiceApiProvider;
    private Provider<BonusAppcService> providesBonusAppcServiceProvider;
    /* access modifiers changed from: private */
    public Provider<BundlesRepository> providesBundleRepositoryProvider;
    private Provider<BlacklistUnitMapper> providesBundleToBlacklistUnitMapperProvider;
    private Provider<BundlesResponseMapper> providesBundlesMapperProvider;
    private Provider<CallAdapter.Factory> providesCallAdapterFactoryProvider;
    /* access modifiers changed from: private */
    public Provider<CampaignAnalytics> providesCampaignAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<CaptionBackgroundPainter> providesCaptionBackgroundPainterProvider;
    /* access modifiers changed from: private */
    public Provider<ChipManager> providesChipManagerProvider;
    /* access modifiers changed from: private */
    public Provider<ComingSoonNotificationManager> providesComingSoonNotificationManagerProvider;
    private Provider<ConnectivityManager> providesConnectivityManagerProvider;
    /* access modifiers changed from: private */
    public Provider<Converter.Factory> providesConverterFactoryProvider;
    /* access modifiers changed from: private */
    public Provider<CrashReport> providesCrashReportsProvider;
    private Provider<DatabaseStoreDataPersist> providesDatabaseStoreDataPersistProvider;
    /* access modifiers changed from: private */
    public Provider<DecimalFormat> providesDecimalFormatProvider;
    /* access modifiers changed from: private */
    public Provider<SharedPreferences> providesDefaultSharedPerefencesProvider;
    private Provider<Retrofit> providesDonationsRetrofitProvider;
    private Provider<DonationsService> providesDonationsServiceProvider;
    private Provider<DonationsService.ServiceV8> providesDonationsServiceV8Provider;
    /* access modifiers changed from: private */
    public Provider<DownloadAnalytics> providesDownloadAnalyticsProvider;
    private Provider<DownloadAppFileMapper> providesDownloadAppFileMapperProvider;
    private Provider<DownloadAppMapper> providesDownloadAppMapperProvider;
    /* access modifiers changed from: private */
    public Provider<DownloadStateParser> providesDownloadStateParserProvider;
    /* access modifiers changed from: private */
    public Provider<DownloadStatusManager> providesDownloadStatusManagerProvider;
    private Provider<DynamicSplitsRemoteService.DynamicSplitsApi> providesDynamicSplitsApiProvider;
    /* access modifiers changed from: private */
    public Provider<DynamicSplitsManager> providesDynamicSplitsManagerProvider;
    private Provider<DynamicSplitsMapper> providesDynamicSplitsMapperProvider;
    private Provider<DynamicSplitsService> providesDynamicSplitsServiceProvider;
    /* access modifiers changed from: private */
    public Provider<EditorialService> providesEditorialServiceProvider;
    /* access modifiers changed from: private */
    public Provider<EskillsPreferencesManager> providesEskillPreferencesManagerProvider;
    private Provider<EventsPersistence> providesEventsPersistenceProvider;
    private Provider<EventLogger> providesFacebookEventLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<List<String>> providesFacebookLoginPermissionsProvider;
    private Provider<FileDownloaderProvider> providesFileDownloaderProvider;
    /* access modifiers changed from: private */
    public Provider<FileManager> providesFileManagerProvider;
    /* access modifiers changed from: private */
    public Provider<FirstLaunchAnalytics> providesFirstLaunchAnalyticsProvider;
    private Provider<FirstLaunchManager> providesFirstLaunchManagerProvider;
    private Provider<EventLogger> providesFlurryEventLoggerProvider;
    private Provider<FlurryEventLogger> providesFlurryLoggerProvider;
    private Provider<SessionLogger> providesFlurrySessionLoggerProvider;
    private Provider<FollowedStoresManager> providesFollowedStoresManagerProvider;
    private Provider<ForegroundManager> providesForegroundManagerProvider;
    private Provider<GmsStatusValueProvider> providesGmsStatusValueProvider;
    /* access modifiers changed from: private */
    public Provider<ImageInfoProvider> providesImageInfoProvider;
    private Provider<EventLogger> providesIndicativeEventLoggerProvider;
    private Provider<Collection<String>> providesIndicativeEventsProvider;
    /* access modifiers changed from: private */
    public Provider<InstallAppSizeValidator> providesInstallAppSizeValidatorProvider;
    /* access modifiers changed from: private */
    public Provider<InstallManager> providesInstallManagerProvider;
    private Provider<RoomInstallationPersistence> providesInstallationAccessorProvider;
    private Provider<InstallerAnalytics> providesInstallerAnalyticsProvider;
    private Provider<LaunchManager> providesLaunchManagerProvider;
    private Provider<Retrofit> providesLoadTopReactionsRetrofitProvider;
    /* access modifiers changed from: private */
    public Provider<LocalNotificationSyncManager> providesLocalNotificationSyncManagerProvider;
    /* access modifiers changed from: private */
    public Provider<LoginSignupManager> providesLoginSignupManagerProvider;
    private Provider<MapToJsonMapper> providesMapToJsonMapperProvider;
    private Provider<Md5Comparator> providesMd5ComparatorProvider;
    /* access modifiers changed from: private */
    public Provider<MoPubAdsManager> providesMoPubAdsManagerProvider;
    private Provider<AdsUserPropertyManager> providesMoPubAdsServiceProvider;
    private Provider<MoPubAnalytics> providesMoPubAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<MyAccountManager> providesMyAccountManagerProvider;
    private Provider<NetworkOperatorManager> providesNetworkOperatorManagerProvider;
    /* access modifiers changed from: private */
    public Provider<NewFeatureManager> providesNewFeatureManagerProvider;
    /* access modifiers changed from: private */
    public Provider<NewFeature> providesNewFeatureProvider;
    /* access modifiers changed from: private */
    public Provider<NewsletterManager> providesNewsletterManagerProvider;
    private Provider<OemidProvider> providesOemidProvider;
    private Provider<OkHttpClient.Builder> providesOkHttpBuilderProvider;
    private Provider<PackageInstallerManager> providesPackageInstallerManagerProvider;
    private Provider<PackageRepository> providesPackageRepositoryProvider;
    private Provider<PromotionViewAppMapper> providesPromotionViewAppMapperProvider;
    /* access modifiers changed from: private */
    public Provider<PromotionsAnalytics> providesPromotionsAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<PromotionsPreferencesManager> providesPromotionsPreferencesManagerProvider;
    private Provider<PromotionsService> providesPromotionsServiceProvider;
    private Provider<EventLogger> providesRakamEventLoggerProvider;
    private Provider<Collection<String>> providesRakamEventsProvider;
    private Provider<String> providesReactionsHostProvider;
    /* access modifiers changed from: private */
    public Provider<ReactionsManager> providesReactionsManagerProvider;
    private Provider<ReactionsService> providesReactionsServiceProvider;
    private Provider<ReactionsRemoteService.ServiceV8> providesReactionsServiceV8Provider;
    /* access modifiers changed from: private */
    public Provider<ReadyToInstallNotificationManager> providesReadyToInstallNotificationManagerProvider;
    private Provider<BundleDataSource> providesRemoteBundleDataSourceProvider;
    private Provider<AptoideBiEventService> providesRetrofitAptoideBiServiceProvider;
    private Provider<RetryFileDownloaderProvider> providesRetryFileDownloaderProvider;
    /* access modifiers changed from: private */
    public Provider<ReviewsManager> providesReviewsManagerProvider;
    private Provider<ReviewsRepository> providesReviewsRepositoryProvider;
    private Provider<ReviewsService> providesReviewsServiceProvider;
    private Provider<RoomEventMapper> providesRoomEventMapperProvider;
    private Provider<RoomInstallationMapper> providesRoomInstallationMapperProvider;
    private Provider<RoomLocalNotificationSyncPersistence> providesRoomLocalNotificationSyncPersistenceProvider;
    private Provider<RoomMigrationProvider> providesRoomMigrationProvider;
    /* access modifiers changed from: private */
    public Provider<RoomStoredMinimalAdPersistence> providesRoomStoreMinimalAdPersistenceProvider;
    /* access modifiers changed from: private */
    public Provider<RoomStoreRepository> providesRoomStoreRepositoryProvider;
    private Provider<RootInstallerProvider> providesRootInstallerProvider;
    private Provider<SafetyNetClient> providesSafetyNetClientProvider;
    /* access modifiers changed from: private */
    public Provider<SearchAnalytics> providesSearchAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<SearchRepository> providesSearchRepositoryProvider;
    /* access modifiers changed from: private */
    public Provider<SearchSuggestionManager> providesSearchSuggestionManagerProvider;
    private Provider<SearchSuggestionRemoteRepository> providesSearchSuggestionRemoteRepositoryProvider;
    private Provider<Retrofit> providesSearchSuggestionsRetrofitProvider;
    private Provider<SecurePreferences> providesSecurePerefencesProvider;
    /* access modifiers changed from: private */
    public Provider<SharedPreferences> providesSecureSharedPreferencesProvider;
    private Provider<SettingsManager> providesSettingsManagerProvider;
    private Provider<AptoideShortcutManager> providesShortcutManagerProvider;
    /* access modifiers changed from: private */
    public Provider<SocialMediaAnalytics> providesSocialMediaAnalyticsProvider;
    private Provider<SplitsMapper> providesSplitsMapperProvider;
    /* access modifiers changed from: private */
    public Provider<StoreAnalytics> providesStoreAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<StoreCredentialsProvider> providesStoreCredentialsProvider;
    private Provider<StorePersistence> providesStorePersistenceProvider;
    private Provider<String> providesSupportEmailProvider;
    /* access modifiers changed from: private */
    public Provider<SupportEmailProvider> providesSupportEmailProvider2;
    private Provider<TelephonyManager> providesTelephonyManagerProvider;
    /* access modifiers changed from: private */
    public Provider<ThemeAnalytics> providesThemeAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<TrendingManager> providesTrendingManagerProvider;
    private Provider<TrendingService> providesTrendingServiceProvider;
    private Provider<UpdateLaunchManager> providesUpdateLaunchManagerProvider;
    private Provider<UpdateMapper> providesUpdateMapperProvider;
    /* access modifiers changed from: private */
    public Provider<UpdatePersistence> providesUpdatePersistenceProvider;
    /* access modifiers changed from: private */
    public Provider<UpdateRepository> providesUpdateRepositoryProvider;
    /* access modifiers changed from: private */
    public Provider<UpdatesAnalytics> providesUpdatesAnalyticsProvider;
    /* access modifiers changed from: private */
    public Provider<UpdatesManager> providesUpdatesManagerProvider;
    /* access modifiers changed from: private */
    public Provider<UpdatesNotificationManager> providesUpdatesNotificationManagerProvider;
    private Provider<AptoideWorkerFactory> providesUpdatesNotificationWorkerFactoryProvider;
    /* access modifiers changed from: private */
    public Provider<UserFeedbackAnalytics> providesUserFeedbackAnalyticsProvider;
    private Provider<PreferencesPersister> providesUserPreferencesPersisterProvider;
    private Provider<Retrofit> providesV7RetrofitProvider;
    private Provider<Retrofit> providesV7SecondaryRetrofitProvider;
    private Provider<WalletAdsOfferCardManager> providesWalletAdsOfferCardManagerProvider;
    private Provider<WalletAdsOfferManager> providesWalletAdsOfferManagerProvider;
    /* access modifiers changed from: private */
    public Provider<WalletAppProvider> providesWalletAppProvider;
    /* access modifiers changed from: private */
    public Provider<WalletService> providesWalletServiceProvider;
    private Provider<WalletService.ServiceV7> providesWalletServiceV8Provider;
    private Provider<HttpKnockEventLogger> providesknockEventLoggerProvider;
    /* access modifiers changed from: private */
    public Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    /* renamed from: cm.aptoide.pt.DaggerApplicationComponent$ActivityComponentImpl */
    private final class ActivityComponentImpl implements ActivityComponent {
        /* access modifiers changed from: private */
        public Provider<AccountNavigator> provideAccountNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<AccountPermissionProvider> provideAccountPermissionProvider;
        private Provider<ApkFyManager> provideApkFyProvider;
        /* access modifiers changed from: private */
        public Provider<AutoUpdateManager> provideAutoUpdateManagerProvider;
        /* access modifiers changed from: private */
        public Provider<BottomNavigationMapper> provideBottomNavigationMapperProvider;
        private Provider<BottomNavigationNavigator> provideBottomNavigationNavigatorProvider;
        private Provider<Integer> provideClientSdkVersionProvider;
        private Provider<DeepLinkManager> provideDeepLinkManagerProvider;
        private Provider<C0462h> provideFragmentManagerProvider;
        /* access modifiers changed from: private */
        public Provider<ImagePickerNavigator> provideImagePickerNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<ListStoreAppsNavigator> provideListStoreAppsNavigatorProvider;
        private Provider<Integer> provideLocalVersionCodeProvider;
        /* access modifiers changed from: private */
        public Provider<FragmentNavigator> provideMainFragmentNavigatorProvider;
        private Provider<Presenter> provideMainPresenterProvider;
        /* access modifiers changed from: private */
        public Provider<ManageStoreNavigator> provideManageStoreNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<ManageUserNavigator> provideManageUserNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<MyAccountNavigator> provideMyAccountNavigatorProvider;
        private Provider<String> providePackageNameProvider;
        /* access modifiers changed from: private */
        public Provider<PhotoFileGenerator> providePhotoFileGeneratorProvider;
        /* access modifiers changed from: private */
        public Provider<ScreenOrientationManager> provideScreenOrientationManagerProvider;
        /* access modifiers changed from: private */
        public Provider<UriToPathResolver> provideUriToPathResolverProvider;
        /* access modifiers changed from: private */
        public Provider<AppCoinsInfoNavigator> providesAppCoinsInfoNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<AppNavigator> providesAppNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<AppViewNavigator> providesAppViewNavigatorProvider;
        private Provider<AutoUpdateRepository> providesAutoUpdateRepositoryProvider;
        private Provider<AutoUpdateService> providesAutoUpdateServiceProvider;
        private Provider<BottomNavigationAnalytics> providesBottomNavigationAnalyticsProvider;
        private Provider<CatappultNavigator> providesCatappultNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<ClaimPromotionsNavigator> providesClaimPromotionsNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<DialogUtils> providesDialogUtilsProvider;
        private Provider<DonationsAnalytics> providesDonationsAnalyticsProvider;
        private Provider<ExternalNavigator> providesExternalNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<ListAppsMoreRepository> providesListAppsMoreRepositoryProvider;
        /* access modifiers changed from: private */
        public Provider<PromotionsNavigator> providesPromotionsNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<Float> providesScreenHeightProvider;
        /* access modifiers changed from: private */
        public Provider<Float> providesScreenWidthProvider;
        /* access modifiers changed from: private */
        public Provider<SearchNavigator> providesSearchNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<SocialMediaNavigator> providesSocialMediaNavigatorProvider;
        /* access modifiers changed from: private */
        public Provider<ThemeManager> providesThemeManagerProvider;
        private Provider<WalletInstallAnalytics> providesWalletInstallAnalyticsProvider;
        private Provider<WalletInstallConfiguration> providesWalletInstallConfigurationProvider;
        /* access modifiers changed from: private */
        public Provider<WalletInstallManager> providesWalletInstallManagerProvider;
        private Provider<WalletInstallNavigator> providesWalletInstallNavigatorProvider;
        private Provider<WalletInstallPresenter> providesWalletInstallPresenterProvider;

        /* renamed from: cm.aptoide.pt.DaggerApplicationComponent$ActivityComponentImpl$FragmentComponentImpl */
        private final class FragmentComponentImpl implements FragmentComponent {
            private Provider<EditorialListAnalytics> editorialListAnalyticsProvider;
            private Provider<AccountErrorMapper> provideAccountErrorMapperProvider;
            private Provider<CheckYourEmailPresenter> provideCheckYourEmailPresenterProvider;
            private Provider<CreateUserErrorMapper> provideCreateUserErrorMapperProvider;
            private Provider<EarnAppcListPresenter> provideEarnAppCoinsListPresenterProvider;
            private Provider<EarnAppcListAnalytics> provideEarnAppcListAnalyticsProvider;
            private Provider<EarnAppcListManager> provideEarnAppcListManagerProvider;
            private Provider<EarnAppcNavigator> provideEarnAppcNavigatorProvider;
            private Provider<FragmentNavigator> provideHomeFragmentNavigatorProvider;
            private Provider<ImagePickerPresenter> provideImagePickerPresenterProvider;
            private Provider<ImageValidator> provideImageValidatorProvider;
            private Provider<LoginSignupCredentialsFlavorPresenter> provideLoginSignUpPresenterProvider;
            private Provider<ManageStoreErrorMapper> provideManageStoreErrorMapperProvider;
            private Provider<ManageStorePresenter> provideManageStorePresenterProvider;
            private Provider<ManageUserPresenter> provideManageUserPresenterProvider;
            private Provider<SearchResultPresenter> provideSearchResultPresenterProvider;
            private Provider<SendMagicLinkPresenter> provideSendMagicLinkPresenterProvider;
            private Provider<AppCoinsInfoPresenter> providesAppCoinsInfoPresenterProvider;
            private Provider<AppMapper> providesAppMapperProvider;
            private Provider<AppViewConfiguration> providesAppViewConfigurationProvider;
            private Provider<AppViewManager> providesAppViewManagerProvider;
            private Provider<AppViewModelManager> providesAppViewModelManagerProvider;
            private Provider<AppViewPresenter> providesAppViewPresenterProvider;
            private Provider<AppcPromotionNotificationStringProvider> providesAppcPromotionNotificationStringProvider;
            private Provider<AppsManager> providesAppsManagerProvider;
            private Provider<AppsNavigator> providesAppsNavigatorProvider;
            private Provider<AppsPresenter> providesAppsPresenterProvider;
            private Provider<AutoUpdateDialogPresenter> providesAutoUpdateDialogPresenterProvider;
            private Provider<BundleEvent> providesBundleEventProvider;
            private Provider<CheckYourEmailNavigator> providesCheckYourEmailNavigatorProvider;
            private Provider<ClaimPromotionDialogPresenter> providesClaimPromotionDialogPresenterProvider;
            private Provider<ClaimPromotionsManager> providesClaimPromotionsManagerProvider;
            private Provider<NewFeatureDialogPresenter> providesDarkthemeDialogPresenterProvider;
            private Provider<DownloadDialogProvider> providesDownloadDialogManagerProvider;
            private Provider<DownloadNavigator> providesDownloadNavigatorProvider;
            private Provider<DownloadViewActionPresenter> providesDownloadViewActionPresenterProvider;
            private Provider<EditorialAnalytics> providesEditorialAnalyticsProvider;
            private Provider<EditorialListManager> providesEditorialListManagerProvider;
            private Provider<EditorialListNavigator> providesEditorialListNavigatorProvider;
            private Provider<EditorialListPresenter> providesEditorialListPresenterProvider;
            private Provider<EditorialCardListRepository> providesEditorialListRepositoryProvider;
            private Provider<EditorialManager> providesEditorialManagerProvider;
            private Provider<EditorialNavigator> providesEditorialNavigatorProvider;
            private Provider<EditorialPresenter> providesEditorialPresenterProvider;
            private Provider<EditorialRepository> providesEditorialRepositoryProvider;
            private Provider<EditorialCardListService> providesEditorialServiceProvider;
            private Provider<FlagManager> providesFlagManagerProvider;
            private Provider<FlagService> providesFlagServiceProvider;
            private Provider<MoreBundleManager> providesGetStoreManagerProvider;
            private Provider<MoreBundlePresenter> providesGetStoreWidgetsPresenterProvider;
            private Provider<HomeAnalytics> providesHomeAnalyticsProvider;
            private Provider<HomeContainerNavigator> providesHomeContainerNavigatorProvider;
            private Provider<HomeContainerPresenter> providesHomeContainerPresenterProvider;
            private Provider<HomeNavigator> providesHomeNavigatorProvider;
            private Provider<HomePresenter> providesHomePresenterProvider;
            private Provider<Home> providesHomeProvider;
            private Provider<EarnAppcListConfiguration> providesListAppsConfigurationProvider;
            private Provider<ListAppsConfiguration> providesListAppsMoreConfigurationProvider;
            private Provider<ListAppsMoreManager> providesListAppsMoreManagerProvider;
            private Provider<ListAppsMorePresenter> providesListAppsMorePresenterProvider;
            private Provider<LoginSignUpCredentialsConfiguration> providesLoginSignUpCredentialsConfigurationProvider;
            private Provider<MyStoresNavigator> providesMyStoreNavigatorProvider;
            private Provider<MyStoresPresenter> providesMyStorePresenterProvider;
            private Provider<OutOfSpaceDialogPresenter> providesOutOfSpaceDialogPresenterProvider;
            private Provider<OutOfSpaceManager> providesOutOfSpaceManagerProvider;
            private Provider<OutOfSpaceNavigator> providesOutOfSpaceNavigatorProvider;
            private Provider<PromotionsPresenter> providesPromotionsPresenterProvider;
            private Provider<RewardAppCoinsAppsRepository> providesRewardAppCoinsAppsRepositoryProvider;
            private Provider<SearchManager> providesSearchManagerProvider;
            private Provider<SendMagicLinkNavigator> providesSendMagicLinkNavigatorProvider;
            private Provider<WizardFragmentProvider> providesWizardFragmentProvider;
            private Provider<WizardPresenter> providesWizardPresenterProvider;

            private void initialize(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
                FragmentModule fragmentModule2 = fragmentModule;
                this.provideAccountErrorMapperProvider = C10823a.m36716a(FragmentModule_ProvideAccountErrorMapperFactory.create(fragmentModule));
                this.providesLoginSignUpCredentialsConfigurationProvider = C10823a.m36716a(C4494xd0ca61e4.create(fragmentModule));
                this.provideLoginSignUpPresenterProvider = C10823a.m36716a(FragmentModule_ProvideLoginSignUpPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, ActivityComponentImpl.this.provideAccountNavigatorProvider, this.provideAccountErrorMapperProvider, DaggerApplicationComponent.this.provideAccountAnalyticsProvider, DaggerApplicationComponent.this.providesFacebookLoginPermissionsProvider, this.providesLoginSignUpCredentialsConfigurationProvider));
                this.providesSendMagicLinkNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesSendMagicLinkNavigatorFactory.create(fragmentModule2, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider, ActivityComponentImpl.this.providesThemeManagerProvider));
                this.provideSendMagicLinkPresenterProvider = C10823a.m36716a(FragmentModule_ProvideSendMagicLinkPresenterFactory.create(fragmentModule2, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesSendMagicLinkNavigatorProvider, DaggerApplicationComponent.this.providesAgentPersistenceProvider));
                this.provideImageValidatorProvider = C10823a.m36716a(FragmentModule_ProvideImageValidatorFactory.create(fragmentModule2, DaggerApplicationComponent.this.providesImageInfoProvider));
                this.provideImagePickerPresenterProvider = C10823a.m36716a(FragmentModule_ProvideImagePickerPresenterFactory.create(fragmentModule, ActivityComponentImpl.this.provideAccountPermissionProvider, ActivityComponentImpl.this.providePhotoFileGeneratorProvider, this.provideImageValidatorProvider, ActivityComponentImpl.this.provideUriToPathResolverProvider, ActivityComponentImpl.this.provideImagePickerNavigatorProvider));
                this.provideCreateUserErrorMapperProvider = C10823a.m36716a(FragmentModule_ProvideCreateUserErrorMapperFactory.create(fragmentModule2, this.provideAccountErrorMapperProvider));
                this.provideManageUserPresenterProvider = C10823a.m36716a(FragmentModule_ProvideManageUserPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.provideCreateUserErrorMapperProvider, ActivityComponentImpl.this.provideManageUserNavigatorProvider, ActivityComponentImpl.this.provideUriToPathResolverProvider, DaggerApplicationComponent.this.provideAccountAnalyticsProvider));
                this.provideManageStoreErrorMapperProvider = C10823a.m36716a(FragmentModule_ProvideManageStoreErrorMapperFactory.create(fragmentModule));
                this.provideManageStorePresenterProvider = C10823a.m36716a(FragmentModule_ProvideManageStorePresenterFactory.create(fragmentModule, ActivityComponentImpl.this.provideUriToPathResolverProvider, ActivityComponentImpl.this.provideManageStoreNavigatorProvider, this.provideManageStoreErrorMapperProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.provideAccountAnalyticsProvider));
                this.providesSearchManagerProvider = C10823a.m36716a(FragmentModule_ProvidesSearchManagerFactory.create(fragmentModule2, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.providesSearchRepositoryProvider, DaggerApplicationComponent.this.providesDownloadStatusManagerProvider, DaggerApplicationComponent.this.providesAppCenterProvider));
                this.providesDownloadDialogManagerProvider = C10823a.m36716a(FragmentModule_ProvidesDownloadDialogManagerFactory.create(fragmentModule2, ActivityComponentImpl.this.providesThemeManagerProvider));
                this.providesDownloadNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesDownloadNavigatorFactory.create(fragmentModule2, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider));
                FragmentModule fragmentModule3 = fragmentModule2;
                this.providesDownloadViewActionPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesDownloadViewActionPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, DaggerApplicationComponent.this.providePermissionManagerProvider, DaggerApplicationComponent.this.providesAppcMigrationManagerProvider, this.providesDownloadDialogManagerProvider, this.providesDownloadNavigatorProvider, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, DaggerApplicationComponent.this.provideNotificationAnalyticsProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, DaggerApplicationComponent.this.providesDynamicSplitsManagerProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider));
                this.provideSearchResultPresenterProvider = C10823a.m36716a(FragmentModule_ProvideSearchResultPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.providesSearchAnalyticsProvider, ActivityComponentImpl.this.providesSearchNavigatorProvider, this.providesSearchManagerProvider, DaggerApplicationComponent.this.providesTrendingManagerProvider, DaggerApplicationComponent.this.providesSearchSuggestionManagerProvider, ActivityComponentImpl.this.provideBottomNavigationMapperProvider, this.providesDownloadViewActionPresenterProvider));
                this.providesMyStoreNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesMyStoreNavigatorFactory.create(fragmentModule3, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider, ActivityComponentImpl.this.provideBottomNavigationMapperProvider));
                this.providesMyStorePresenterProvider = C10823a.m36716a(FragmentModule_ProvidesMyStorePresenterFactory.create(fragmentModule3, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesMyStoreNavigatorProvider));
                this.providesHomeProvider = C10823a.m36716a(FragmentModule_ProvidesHomeFactory.create(fragmentModule, DaggerApplicationComponent.this.providesBundleRepositoryProvider, DaggerApplicationComponent.this.providePromotionsManagerProvider, DaggerApplicationComponent.this.providesPromotionsPreferencesManagerProvider, DaggerApplicationComponent.this.providesBlacklistManagerProvider, DaggerApplicationComponent.this.provideHomePromotionsIdProvider, DaggerApplicationComponent.this.providesReactionsManagerProvider, DaggerApplicationComponent.this.providesComingSoonNotificationManagerProvider));
                this.providesHomeNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesHomeNavigatorFactory.create(fragmentModule, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider, ActivityComponentImpl.this.provideBottomNavigationMapperProvider, ActivityComponentImpl.this.providesAppNavigatorProvider, ActivityComponentImpl.this.provideAccountNavigatorProvider, ActivityComponentImpl.this.providesThemeManagerProvider));
                this.providesHomeAnalyticsProvider = C10823a.m36716a(FragmentModule_ProvidesHomeAnalyticsFactory.create(fragmentModule3, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider));
                this.providesHomePresenterProvider = C10823a.m36716a(FragmentModule_ProvidesHomePresenterFactory.create(fragmentModule, this.providesHomeProvider, this.providesHomeNavigatorProvider, DaggerApplicationComponent.this.providesAdMapperProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesHomeAnalyticsProvider, DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider));
                this.providesAppMapperProvider = C10823a.m36716a(FragmentModule_ProvidesAppMapperFactory.create(fragmentModule));
                this.providesAppsManagerProvider = C10823a.m36716a(FragmentModule_ProvidesAppsManagerFactory.create(fragmentModule, DaggerApplicationComponent.this.providesUpdatesManagerProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, this.providesAppMapperProvider, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, DaggerApplicationComponent.this.providesUpdatesAnalyticsProvider, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, DaggerApplicationComponent.this.providesAptoideInstallManagerProvider, DaggerApplicationComponent.this.providesUpdatesNotificationManagerProvider, DaggerApplicationComponent.this.providesSecureSharedPreferencesProvider, DaggerApplicationComponent.this.providesDynamicSplitsManagerProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider));
                this.providesAppsNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesAppsNavigatorFactory.create(fragmentModule3, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider, ActivityComponentImpl.this.provideBottomNavigationMapperProvider, ActivityComponentImpl.this.providesAppNavigatorProvider));
                this.providesAppsPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesAppsPresenterFactory.create(fragmentModule3, this.providesAppsManagerProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesAppsNavigatorProvider));
                Provider<AppViewConfiguration> a = C10823a.m36716a(FragmentModule_ProvidesAppViewConfigurationFactory.create(fragmentModule));
                this.providesAppViewConfigurationProvider = a;
                this.providesAppViewModelManagerProvider = C10823a.m36716a(FragmentModule_ProvidesAppViewModelManagerFactory.create(fragmentModule, a, DaggerApplicationComponent.this.provideStoreManagerProvider, DaggerApplicationComponent.this.provideMarketNameProvider, DaggerApplicationComponent.this.providesAppCenterProvider, DaggerApplicationComponent.this.providesDownloadStateParserProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesAppcMigrationManagerProvider, DaggerApplicationComponent.this.providesAppCoinsAdvertisingManagerProvider, DaggerApplicationComponent.this.providesAppCoinsManagerProvider));
                Provider<FlagService> a2 = C10823a.m36716a(FragmentModule_ProvidesFlagServiceFactory.create(fragmentModule3, DaggerApplicationComponent.this.providesBodyInterceptorV3Provider, DaggerApplicationComponent.this.provideOkHttpClientProvider, DaggerApplicationComponent.this.provideTokenInvalidatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider));
                this.providesFlagServiceProvider = a2;
                this.providesFlagManagerProvider = C10823a.m36716a(FragmentModule_ProvidesFlagManagerFactory.create(fragmentModule3, a2));
                this.providesAppcPromotionNotificationStringProvider = C10823a.m36716a(C4493xf1dd651.create(fragmentModule));
                FragmentModule fragmentModule4 = fragmentModule3;
                this.providesAppViewManagerProvider = C10823a.m36716a(FragmentModule_ProvidesAppViewManagerFactory.create(fragmentModule, this.providesAppViewModelManagerProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providesAppCenterProvider, DaggerApplicationComponent.this.providesReviewsManagerProvider, DaggerApplicationComponent.this.providesAdsManagerProvider, this.providesFlagManagerProvider, DaggerApplicationComponent.this.provideStoreUtilsProxyProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.providesDownloadStateParserProvider, DaggerApplicationComponent.this.providesAppViewAnalyticsProvider, DaggerApplicationComponent.this.provideNotificationAnalyticsProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, DaggerApplicationComponent.this.provideResourcesProvider, DaggerApplicationComponent.this.provideWindowManagerProvider, DaggerApplicationComponent.this.provideMarketNameProvider, DaggerApplicationComponent.this.providesAppCoinsManagerProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, DaggerApplicationComponent.this.providePromotionsManagerProvider, DaggerApplicationComponent.this.providesAppcMigrationManagerProvider, DaggerApplicationComponent.this.providesLocalNotificationSyncManagerProvider, this.providesAppcPromotionNotificationStringProvider, DaggerApplicationComponent.this.providesDynamicSplitsManagerProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider, DaggerApplicationComponent.this.providesAppsFlyerManagerProvider));
                this.providesAppViewPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesAppViewPresenterFactory.create(fragmentModule, ActivityComponentImpl.this.provideAccountNavigatorProvider, DaggerApplicationComponent.this.providesAppViewAnalyticsProvider, DaggerApplicationComponent.this.providesCampaignAnalyticsProvider, ActivityComponentImpl.this.providesAppViewNavigatorProvider, this.providesAppViewManagerProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, ActivityComponentImpl.this.providesPromotionsNavigatorProvider));
                this.providesGetStoreManagerProvider = C10823a.m36716a(FragmentModule_ProvidesGetStoreManagerFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesBundleRepositoryProvider));
                this.providesBundleEventProvider = C10823a.m36716a(FragmentModule_ProvidesBundleEventFactory.create(fragmentModule));
                this.providesGetStoreWidgetsPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesGetStoreWidgetsPresenterFactory.create(fragmentModule, this.providesGetStoreManagerProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, this.providesHomeNavigatorProvider, DaggerApplicationComponent.this.providesAdMapperProvider, this.providesBundleEventProvider, this.providesHomeAnalyticsProvider, DaggerApplicationComponent.this.providesChipManagerProvider));
                this.providesWizardPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesWizardPresenterFactory.create(fragmentModule4, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, DaggerApplicationComponent.this.provideAccountAnalyticsProvider));
                this.providesWizardFragmentProvider = C10823a.m36716a(FlavourFragmentModule_ProvidesWizardFragmentProviderFactory.create(flavourFragmentModule, ActivityComponentImpl.this.providesThemeManagerProvider));
                this.providesAppCoinsInfoPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesAppCoinsInfoPresenterFactory.create(fragmentModule, ActivityComponentImpl.this.providesAppCoinsInfoNavigatorProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, DaggerApplicationComponent.this.providesSocialMediaAnalyticsProvider, DaggerApplicationComponent.this.providesAppCoinsManagerProvider));
                this.providesEditorialRepositoryProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialRepositoryFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesEditorialServiceProvider));
                this.providesEditorialAnalyticsProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialAnalyticsFactory.create(fragmentModule, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider));
                this.providesEditorialManagerProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialManagerFactory.create(fragmentModule, this.providesEditorialRepositoryProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providesDownloadStateParserProvider, DaggerApplicationComponent.this.provideNotificationAnalyticsProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, this.providesEditorialAnalyticsProvider, DaggerApplicationComponent.this.providesReactionsManagerProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, DaggerApplicationComponent.this.providesDynamicSplitsManagerProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider));
                this.providesEditorialNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialNavigatorFactory.create(fragmentModule4, ActivityComponentImpl.this.providesAppNavigatorProvider, ActivityComponentImpl.this.provideAccountNavigatorProvider, ActivityComponentImpl.this.providesSocialMediaNavigatorProvider, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider));
                this.providesEditorialPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialPresenterFactory.create(fragmentModule, this.providesEditorialManagerProvider, DaggerApplicationComponent.this.providesCrashReportsProvider, this.providesEditorialAnalyticsProvider, this.providesEditorialNavigatorProvider, DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, DaggerApplicationComponent.this.providesSocialMediaAnalyticsProvider));
                this.providesPromotionsPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesPromotionsPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.providePromotionsManagerProvider, DaggerApplicationComponent.this.providesPromotionsAnalyticsProvider, ActivityComponentImpl.this.providesPromotionsNavigatorProvider, DaggerApplicationComponent.this.provideHomePromotionsIdProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider));
                Provider<ClaimPromotionsManager> a3 = C10823a.m36716a(FragmentModule_ProvidesClaimPromotionsManagerFactory.create(fragmentModule4, DaggerApplicationComponent.this.providePromotionsManagerProvider));
                this.providesClaimPromotionsManagerProvider = a3;
                this.providesClaimPromotionDialogPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesClaimPromotionDialogPresenterFactory.create(fragmentModule4, a3, DaggerApplicationComponent.this.providesPromotionsAnalyticsProvider, ActivityComponentImpl.this.providesClaimPromotionsNavigatorProvider));
                Provider<FragmentNavigator> a4 = C10823a.m36716a(FragmentModule_ProvideHomeFragmentNavigatorFactory.create(fragmentModule4, DaggerApplicationComponent.this.provideFragmentNavigatorMapProvider, DaggerApplicationComponent.this.provideFragmentNavigatorRelayProvider));
                this.provideHomeFragmentNavigatorProvider = a4;
                this.providesHomeContainerNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesHomeContainerNavigatorFactory.create(fragmentModule4, a4));
                this.providesHomeContainerPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesHomeContainerPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesHomeContainerNavigatorProvider, this.providesHomeNavigatorProvider, this.providesHomeAnalyticsProvider, this.providesHomeProvider, DaggerApplicationComponent.this.providesChipManagerProvider, DaggerApplicationComponent.this.providesEskillPreferencesManagerProvider));
                Provider<EditorialCardListService> a5 = C10823a.m36716a(FragmentModule_ProvidesEditorialServiceFactory.create(fragmentModule4, DaggerApplicationComponent.this.provideAccountSettingsBodyInterceptorPoolV7Provider, DaggerApplicationComponent.this.provideOkHttpClientProvider, DaggerApplicationComponent.this.provideTokenInvalidatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider));
                this.providesEditorialServiceProvider = a5;
                Provider<EditorialCardListRepository> a6 = C10823a.m36716a(FragmentModule_ProvidesEditorialListRepositoryFactory.create(fragmentModule4, a5));
                this.providesEditorialListRepositoryProvider = a6;
                this.providesEditorialListManagerProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialListManagerFactory.create(fragmentModule4, a6, DaggerApplicationComponent.this.providesReactionsManagerProvider, DaggerApplicationComponent.this.providesAppCoinsManagerProvider));
                this.providesEditorialListNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialListNavigatorFactory.create(fragmentModule4, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider, ActivityComponentImpl.this.provideAccountNavigatorProvider));
                this.editorialListAnalyticsProvider = C10823a.m36716a(FragmentModule_EditorialListAnalyticsFactory.create(fragmentModule4, DaggerApplicationComponent.this.provideNavigationTrackerProvider, DaggerApplicationComponent.this.providesAnalyticsManagerProvider));
                this.providesEditorialListPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesEditorialListPresenterFactory.create(fragmentModule, this.providesEditorialListManagerProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.providesEditorialListNavigatorProvider, this.editorialListAnalyticsProvider, DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider));
                this.providesRewardAppCoinsAppsRepositoryProvider = C10823a.m36716a(FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory.create(fragmentModule, DaggerApplicationComponent.this.provideOkHttpClientProvider, DaggerApplicationComponent.this.provideAccountSettingsBodyInterceptorPoolV7Provider, DaggerApplicationComponent.this.provideTokenInvalidatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesAppBundlesVisibilityManagerProvider));
                this.providesListAppsConfigurationProvider = C10823a.m36716a(FragmentModule_ProvidesListAppsConfigurationFactory.create(fragmentModule));
                this.provideEarnAppcListManagerProvider = C10823a.m36716a(FragmentModule_ProvideEarnAppcListManagerFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesWalletAppProvider, ActivityComponentImpl.this.providesWalletInstallManagerProvider));
                this.provideEarnAppcListAnalyticsProvider = C10823a.m36716a(FragmentModule_ProvideEarnAppcListAnalyticsFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider));
                this.provideEarnAppcNavigatorProvider = C10823a.m36716a(FragmentModule_ProvideEarnAppcNavigatorFactory.create(fragmentModule4, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider));
                this.provideEarnAppCoinsListPresenterProvider = C10823a.m36716a(FragmentModule_ProvideEarnAppCoinsListPresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.providesCrashReportsProvider, this.providesRewardAppCoinsAppsRepositoryProvider, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, ActivityComponentImpl.this.providesAppNavigatorProvider, this.providesListAppsConfigurationProvider, this.provideEarnAppcListManagerProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, this.provideEarnAppcListAnalyticsProvider, this.provideEarnAppcNavigatorProvider));
                this.providesListAppsMoreConfigurationProvider = C10823a.m36716a(FragmentModule_ProvidesListAppsMoreConfigurationFactory.create(fragmentModule));
                this.providesListAppsMoreManagerProvider = C10823a.m36716a(FragmentModule_ProvidesListAppsMoreManagerFactory.create(fragmentModule4, ActivityComponentImpl.this.providesListAppsMoreRepositoryProvider, DaggerApplicationComponent.this.provideAdsRepositoryProvider));
                this.providesListAppsMorePresenterProvider = C10823a.m36716a(FragmentModule_ProvidesListAppsMorePresenterFactory.create(fragmentModule, DaggerApplicationComponent.this.providesCrashReportsProvider, ActivityComponentImpl.this.providesAppNavigatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, this.providesListAppsMoreConfigurationProvider, this.providesListAppsMoreManagerProvider));
                this.providesAutoUpdateDialogPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesAutoUpdateDialogPresenterFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesCrashReportsProvider, ActivityComponentImpl.this.provideAutoUpdateManagerProvider));
                this.providesDarkthemeDialogPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesDarkthemeDialogPresenterFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesNewFeatureManagerProvider));
                Provider<CheckYourEmailNavigator> a7 = C10823a.m36716a(FragmentModule_ProvidesCheckYourEmailNavigatorFactory.create(fragmentModule));
                this.providesCheckYourEmailNavigatorProvider = a7;
                this.provideCheckYourEmailPresenterProvider = C10823a.m36716a(FragmentModule_ProvideCheckYourEmailPresenterFactory.create(fragmentModule4, a7));
                this.providesOutOfSpaceManagerProvider = C10823a.m36716a(FragmentModule_ProvidesOutOfSpaceManagerFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesInstallAppSizeValidatorProvider));
                this.providesOutOfSpaceNavigatorProvider = C10823a.m36716a(FragmentModule_ProvidesOutOfSpaceNavigatorFactory.create(fragmentModule4, ActivityComponentImpl.this.provideMainFragmentNavigatorProvider));
                this.providesOutOfSpaceDialogPresenterProvider = C10823a.m36716a(FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory.create(fragmentModule4, DaggerApplicationComponent.this.providesCrashReportsProvider, this.providesOutOfSpaceManagerProvider, this.providesOutOfSpaceNavigatorProvider));
            }

            private AddStoreDialog injectAddStoreDialog(AddStoreDialog addStoreDialog) {
                BaseDialogFragment_MembersInjector.injectThemeManager(addStoreDialog, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                AddStoreDialog_MembersInjector.injectStoreCredentialsProvider(addStoreDialog, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                AddStoreDialog_MembersInjector.injectStoreUtilsProxy(addStoreDialog, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                return addStoreDialog;
            }

            private AppCoinsInfoFragment injectAppCoinsInfoFragment(AppCoinsInfoFragment appCoinsInfoFragment) {
                AppCoinsInfoFragment_MembersInjector.injectAppCoinsInfoPresenter(appCoinsInfoFragment, this.providesAppCoinsInfoPresenterProvider.get());
                AppCoinsInfoFragment_MembersInjector.injectScreenWidth(appCoinsInfoFragment, ((Float) ActivityComponentImpl.this.providesScreenWidthProvider.get()).floatValue());
                AppCoinsInfoFragment_MembersInjector.injectScreenHeight(appCoinsInfoFragment, ((Float) ActivityComponentImpl.this.providesScreenHeightProvider.get()).floatValue());
                return appCoinsInfoFragment;
            }

            private AppViewFragment injectAppViewFragment(AppViewFragment appViewFragment) {
                AppViewFragment_MembersInjector.injectPresenter(appViewFragment, this.providesAppViewPresenterProvider.get());
                AppViewFragment_MembersInjector.injectDialogUtils(appViewFragment, (DialogUtils) ActivityComponentImpl.this.providesDialogUtilsProvider.get());
                AppViewFragment_MembersInjector.injectMarketName(appViewFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                AppViewFragment_MembersInjector.injectOneDecimalFormat(appViewFragment, (DecimalFormat) DaggerApplicationComponent.this.providesDecimalFormatProvider.get());
                AppViewFragment_MembersInjector.injectThemeManager(appViewFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                AppViewFragment_MembersInjector.injectRoomStoredMinimalAdPersistence(appViewFragment, (RoomStoredMinimalAdPersistence) DaggerApplicationComponent.this.providesRoomStoreMinimalAdPersistenceProvider.get());
                return appViewFragment;
            }

            private AppsFragment injectAppsFragment(AppsFragment appsFragment) {
                AppsFragment_MembersInjector.injectAppsPresenter(appsFragment, this.providesAppsPresenterProvider.get());
                AppsFragment_MembersInjector.injectThemeManager(appsFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return appsFragment;
            }

            private AutoUpdateDialogFragment injectAutoUpdateDialogFragment(AutoUpdateDialogFragment autoUpdateDialogFragment) {
                BaseDialogFragment_MembersInjector.injectThemeManager(autoUpdateDialogFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                AutoUpdateDialogFragment_MembersInjector.injectPresenter(autoUpdateDialogFragment, this.providesAutoUpdateDialogPresenterProvider.get());
                return autoUpdateDialogFragment;
            }

            private CheckYourEmailFragment injectCheckYourEmailFragment(CheckYourEmailFragment checkYourEmailFragment) {
                CheckYourEmailFragment_MembersInjector.injectPresenter(checkYourEmailFragment, this.provideCheckYourEmailPresenterProvider.get());
                return checkYourEmailFragment;
            }

            private ClaimPromotionDialogFragment injectClaimPromotionDialogFragment(ClaimPromotionDialogFragment claimPromotionDialogFragment) {
                BaseDialogFragment_MembersInjector.injectThemeManager(claimPromotionDialogFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                ClaimPromotionDialogFragment_MembersInjector.injectPresenter(claimPromotionDialogFragment, this.providesClaimPromotionDialogPresenterProvider.get());
                ClaimPromotionDialogFragment_MembersInjector.injectClaimPromotionsManager(claimPromotionDialogFragment, this.providesClaimPromotionsManagerProvider.get());
                ClaimPromotionDialogFragment_MembersInjector.injectIdsRepository(claimPromotionDialogFragment, (IdsRepository) DaggerApplicationComponent.this.provideIdsRepositoryProvider.get());
                ClaimPromotionDialogFragment_MembersInjector.injectPromotionsAnalytics(claimPromotionDialogFragment, (PromotionsAnalytics) DaggerApplicationComponent.this.providesPromotionsAnalyticsProvider.get());
                ClaimPromotionDialogFragment_MembersInjector.injectNavigator(claimPromotionDialogFragment, (ClaimPromotionsNavigator) ActivityComponentImpl.this.providesClaimPromotionsNavigatorProvider.get());
                return claimPromotionDialogFragment;
            }

            private CommentDialogFragment injectCommentDialogFragment(CommentDialogFragment commentDialogFragment) {
                BaseDialogFragment_MembersInjector.injectThemeManager(commentDialogFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                CommentDialogFragment_MembersInjector.injectUserFeedbackAnalytics(commentDialogFragment, (UserFeedbackAnalytics) DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider.get());
                return commentDialogFragment;
            }

            private CommentListFragment injectCommentListFragment(CommentListFragment commentListFragment) {
                CommentListFragment_MembersInjector.injectAnalyticsManager(commentListFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                CommentListFragment_MembersInjector.injectNavigationTracker(commentListFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                CommentListFragment_MembersInjector.injectThemeManager(commentListFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                CommentListFragment_MembersInjector.injectStoreCredentialsProvider(commentListFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                return commentListFragment;
            }

            private DescriptionFragment injectDescriptionFragment(DescriptionFragment descriptionFragment) {
                DescriptionFragment_MembersInjector.injectAppBundlesVisibilityManager(descriptionFragment, (AppBundlesVisibilityManager) DaggerApplicationComponent.this.providesAppBundlesVisibilityManagerProvider.get());
                DescriptionFragment_MembersInjector.injectThemeManager(descriptionFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                DescriptionFragment_MembersInjector.injectStoreCredentialsProvider(descriptionFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                return descriptionFragment;
            }

            private EarnAppcListFragment injectEarnAppcListFragment(EarnAppcListFragment earnAppcListFragment) {
                EarnAppcListFragment_MembersInjector.injectPresenter(earnAppcListFragment, this.provideEarnAppCoinsListPresenterProvider.get());
                EarnAppcListFragment_MembersInjector.injectThemeManager(earnAppcListFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return earnAppcListFragment;
            }

            private EditorialFragment injectEditorialFragment(EditorialFragment editorialFragment) {
                EditorialFragment_MembersInjector.injectPresenter(editorialFragment, this.providesEditorialPresenterProvider.get());
                EditorialFragment_MembersInjector.injectScreenWidth(editorialFragment, ((Float) ActivityComponentImpl.this.providesScreenWidthProvider.get()).floatValue());
                EditorialFragment_MembersInjector.injectScreenHeight(editorialFragment, ((Float) ActivityComponentImpl.this.providesScreenHeightProvider.get()).floatValue());
                EditorialFragment_MembersInjector.injectThemeManager(editorialFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                EditorialFragment_MembersInjector.injectCaptionBackgroundPainter(editorialFragment, (CaptionBackgroundPainter) DaggerApplicationComponent.this.providesCaptionBackgroundPainterProvider.get());
                return editorialFragment;
            }

            private EditorialListFragment injectEditorialListFragment(EditorialListFragment editorialListFragment) {
                EditorialListFragment_MembersInjector.injectPresenter(editorialListFragment, this.providesEditorialListPresenterProvider.get());
                EditorialListFragment_MembersInjector.injectCaptionBackgroundPainter(editorialListFragment, (CaptionBackgroundPainter) DaggerApplicationComponent.this.providesCaptionBackgroundPainterProvider.get());
                EditorialListFragment_MembersInjector.injectThemeAttributeProvider(editorialListFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return editorialListFragment;
            }

            private ExcludedUpdatesFragment injectExcludedUpdatesFragment(ExcludedUpdatesFragment excludedUpdatesFragment) {
                ExcludedUpdatesFragment_MembersInjector.injectUpdatesPersistence(excludedUpdatesFragment, (UpdatePersistence) DaggerApplicationComponent.this.providesUpdatePersistenceProvider.get());
                return excludedUpdatesFragment;
            }

            private GridRecyclerSwipeWithToolbarFragment injectGridRecyclerSwipeWithToolbarFragment(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
                GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(gridRecyclerSwipeWithToolbarFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                return gridRecyclerSwipeWithToolbarFragment;
            }

            private HomeContainerFragment injectHomeContainerFragment(HomeContainerFragment homeContainerFragment) {
                HomeContainerFragment_MembersInjector.injectPresenter(homeContainerFragment, this.providesHomeContainerPresenterProvider.get());
                HomeContainerFragment_MembersInjector.injectThemeManager(homeContainerFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return homeContainerFragment;
            }

            private HomeFragment injectHomeFragment(HomeFragment homeFragment) {
                HomeFragment_MembersInjector.injectPresenter(homeFragment, this.providesHomePresenterProvider.get());
                HomeFragment_MembersInjector.injectMarketName(homeFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                HomeFragment_MembersInjector.injectCaptionBackgroundPainter(homeFragment, (CaptionBackgroundPainter) DaggerApplicationComponent.this.providesCaptionBackgroundPainterProvider.get());
                HomeFragment_MembersInjector.injectThemeManager(homeFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return homeFragment;
            }

            private LatestReviewsFragment injectLatestReviewsFragment(LatestReviewsFragment latestReviewsFragment) {
                LatestReviewsFragment_MembersInjector.injectAnalyticsManager(latestReviewsFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                LatestReviewsFragment_MembersInjector.injectNavigationTracker(latestReviewsFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                LatestReviewsFragment_MembersInjector.injectStoreCredentialsProvider(latestReviewsFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                return latestReviewsFragment;
            }

            private ListAppsMoreFragment injectListAppsMoreFragment(ListAppsMoreFragment listAppsMoreFragment) {
                ListAppsMoreFragment_MembersInjector.injectPresenter(listAppsMoreFragment, this.providesListAppsMorePresenterProvider.get());
                return listAppsMoreFragment;
            }

            private ListStoreAppsFragment injectListStoreAppsFragment(ListStoreAppsFragment listStoreAppsFragment) {
                ListStoreAppsFragment_MembersInjector.injectListStoreAppsNavigator(listStoreAppsFragment, (ListStoreAppsNavigator) ActivityComponentImpl.this.provideListStoreAppsNavigatorProvider.get());
                ListStoreAppsFragment_MembersInjector.injectAppCenter(listStoreAppsFragment, (AppCenter) DaggerApplicationComponent.this.providesAppCenterProvider.get());
                return listStoreAppsFragment;
            }

            private ListStoresFragment injectListStoresFragment(ListStoresFragment listStoresFragment) {
                StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(listStoresFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(listStoresFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(listStoresFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(listStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(listStoresFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(listStoresFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(listStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                ListStoresFragment_MembersInjector.injectAnalyticsManager(listStoresFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                ListStoresFragment_MembersInjector.injectNavigationTracker(listStoresFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                return listStoresFragment;
            }

            private LoginSignUpCredentialsFragment injectLoginSignUpCredentialsFragment(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment) {
                LoginSignUpCredentialsFragment_MembersInjector.injectPresenter(loginSignUpCredentialsFragment, this.provideLoginSignUpPresenterProvider.get());
                LoginSignUpCredentialsFragment_MembersInjector.injectSendMagicLinkPresenter(loginSignUpCredentialsFragment, this.provideSendMagicLinkPresenterProvider.get());
                LoginSignUpCredentialsFragment_MembersInjector.injectOrientationManager(loginSignUpCredentialsFragment, (ScreenOrientationManager) ActivityComponentImpl.this.provideScreenOrientationManagerProvider.get());
                LoginSignUpCredentialsFragment_MembersInjector.injectAccountAnalytics(loginSignUpCredentialsFragment, (AccountAnalytics) DaggerApplicationComponent.this.provideAccountAnalyticsProvider.get());
                LoginSignUpCredentialsFragment_MembersInjector.injectMarketName(loginSignUpCredentialsFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                LoginSignUpCredentialsFragment_MembersInjector.injectThemeManager(loginSignUpCredentialsFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return loginSignUpCredentialsFragment;
            }

            private ManageStoreFragment injectManageStoreFragment(ManageStoreFragment manageStoreFragment) {
                ManageStoreFragment_MembersInjector.injectImagePickerPresenter(manageStoreFragment, this.provideImagePickerPresenterProvider.get());
                ManageStoreFragment_MembersInjector.injectManageStorePresenter(manageStoreFragment, this.provideManageStorePresenterProvider.get());
                ManageStoreFragment_MembersInjector.injectOrientationManager(manageStoreFragment, (ScreenOrientationManager) ActivityComponentImpl.this.provideScreenOrientationManagerProvider.get());
                ManageStoreFragment_MembersInjector.injectThemeManager(manageStoreFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return manageStoreFragment;
            }

            private ManageUserFragment injectManageUserFragment(ManageUserFragment manageUserFragment) {
                ManageUserFragment_MembersInjector.injectImagePickerPresenter(manageUserFragment, this.provideImagePickerPresenterProvider.get());
                ManageUserFragment_MembersInjector.injectManageUserPresenter(manageUserFragment, this.provideManageUserPresenterProvider.get());
                ManageUserFragment_MembersInjector.injectOrientationManager(manageUserFragment, (ScreenOrientationManager) ActivityComponentImpl.this.provideScreenOrientationManagerProvider.get());
                ManageUserFragment_MembersInjector.injectNewsletterManager(manageUserFragment, (NewsletterManager) DaggerApplicationComponent.this.providesNewsletterManagerProvider.get());
                ManageUserFragment_MembersInjector.injectThemeManager(manageUserFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return manageUserFragment;
            }

            private MoreBundleFragment injectMoreBundleFragment(MoreBundleFragment moreBundleFragment) {
                MoreBundleFragment_MembersInjector.injectPresenter(moreBundleFragment, this.providesGetStoreWidgetsPresenterProvider.get());
                MoreBundleFragment_MembersInjector.injectMarketName(moreBundleFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                MoreBundleFragment_MembersInjector.injectCaptionBackgroundPainter(moreBundleFragment, (CaptionBackgroundPainter) DaggerApplicationComponent.this.providesCaptionBackgroundPainterProvider.get());
                MoreBundleFragment_MembersInjector.injectThemeAttributeProvider(moreBundleFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return moreBundleFragment;
            }

            private MyAccountFragment injectMyAccountFragment(MyAccountFragment myAccountFragment) {
                MyAccountFragment_MembersInjector.injectMyAccountNavigator(myAccountFragment, (MyAccountNavigator) ActivityComponentImpl.this.provideMyAccountNavigatorProvider.get());
                MyAccountFragment_MembersInjector.injectAccountAnalytics(myAccountFragment, (AccountAnalytics) DaggerApplicationComponent.this.provideAccountAnalyticsProvider.get());
                MyAccountFragment_MembersInjector.injectMyAccountManager(myAccountFragment, (MyAccountManager) DaggerApplicationComponent.this.providesMyAccountManagerProvider.get());
                MyAccountFragment_MembersInjector.injectMarketName(myAccountFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                MyAccountFragment_MembersInjector.injectThemeManager(myAccountFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                MyAccountFragment_MembersInjector.injectSocialMediaAnalytics(myAccountFragment, (SocialMediaAnalytics) DaggerApplicationComponent.this.providesSocialMediaAnalyticsProvider.get());
                return myAccountFragment;
            }

            private MyStoresFragment injectMyStoresFragment(MyStoresFragment myStoresFragment) {
                StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                MyStoresFragment_MembersInjector.injectMyStoresPresenter(myStoresFragment, this.providesMyStorePresenterProvider.get());
                MyStoresFragment_MembersInjector.injectStoreRepository(myStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                return myStoresFragment;
            }

            private MyStoresSubscribedFragment injectMyStoresSubscribedFragment(MyStoresSubscribedFragment myStoresSubscribedFragment) {
                StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresSubscribedFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresSubscribedFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                MyStoresSubscribedFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                MyStoresSubscribedFragment_MembersInjector.injectNavigationTracker(myStoresSubscribedFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                MyStoresSubscribedFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                MyStoresSubscribedFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                MyStoresSubscribedFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                return myStoresSubscribedFragment;
            }

            private NewFeatureDialogFragment injectNewFeatureDialogFragment(NewFeatureDialogFragment newFeatureDialogFragment) {
                NewFeatureDialogFragment_MembersInjector.injectPresenter(newFeatureDialogFragment, this.providesDarkthemeDialogPresenterProvider.get());
                return newFeatureDialogFragment;
            }

            private OtherVersionsFragment injectOtherVersionsFragment(OtherVersionsFragment otherVersionsFragment) {
                OtherVersionsFragment_MembersInjector.injectStoreRepository(otherVersionsFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                return otherVersionsFragment;
            }

            private OutOfSpaceDialogFragment injectOutOfSpaceDialogFragment(OutOfSpaceDialogFragment outOfSpaceDialogFragment) {
                BaseDialogFragment_MembersInjector.injectThemeManager(outOfSpaceDialogFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                OutOfSpaceDialogFragment_MembersInjector.injectPresenter(outOfSpaceDialogFragment, this.providesOutOfSpaceDialogPresenterProvider.get());
                return outOfSpaceDialogFragment;
            }

            private PrivateStoreDialog injectPrivateStoreDialog(PrivateStoreDialog privateStoreDialog) {
                BaseDialogFragment_MembersInjector.injectThemeManager(privateStoreDialog, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                PrivateStoreDialog_MembersInjector.injectStoreUtilsProxy(privateStoreDialog, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                return privateStoreDialog;
            }

            private ProfileStepOneFragment injectProfileStepOneFragment(ProfileStepOneFragment profileStepOneFragment) {
                ProfileStepOneFragment_MembersInjector.injectOrientationManager(profileStepOneFragment, (ScreenOrientationManager) ActivityComponentImpl.this.provideScreenOrientationManagerProvider.get());
                ProfileStepOneFragment_MembersInjector.injectAccountNavigator(profileStepOneFragment, (AccountNavigator) ActivityComponentImpl.this.provideAccountNavigatorProvider.get());
                ProfileStepOneFragment_MembersInjector.injectAccountAnalytics(profileStepOneFragment, (AccountAnalytics) DaggerApplicationComponent.this.provideAccountAnalyticsProvider.get());
                ProfileStepOneFragment_MembersInjector.injectLoginSignupManager(profileStepOneFragment, (LoginSignupManager) DaggerApplicationComponent.this.providesLoginSignupManagerProvider.get());
                ProfileStepOneFragment_MembersInjector.injectThemeManager(profileStepOneFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return profileStepOneFragment;
            }

            private ProfileStepTwoFragment injectProfileStepTwoFragment(ProfileStepTwoFragment profileStepTwoFragment) {
                ProfileStepTwoFragment_MembersInjector.injectAccountAnalytics(profileStepTwoFragment, (AccountAnalytics) DaggerApplicationComponent.this.provideAccountAnalyticsProvider.get());
                ProfileStepTwoFragment_MembersInjector.injectLoginSignupManager(profileStepTwoFragment, (LoginSignupManager) DaggerApplicationComponent.this.providesLoginSignupManagerProvider.get());
                ProfileStepTwoFragment_MembersInjector.injectMarketResourceFormatter(profileStepTwoFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
                ProfileStepTwoFragment_MembersInjector.injectThemeManager(profileStepTwoFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return profileStepTwoFragment;
            }

            private PromotionsFragment injectPromotionsFragment(PromotionsFragment promotionsFragment) {
                PromotionsFragment_MembersInjector.injectPromotionsPresenter(promotionsFragment, this.providesPromotionsPresenterProvider.get());
                PromotionsFragment_MembersInjector.injectThemeManager(promotionsFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return promotionsFragment;
            }

            private RateAndReviewsFragment injectRateAndReviewsFragment(RateAndReviewsFragment rateAndReviewsFragment) {
                RateAndReviewsFragment_MembersInjector.injectAppBundlesVisibilityManager(rateAndReviewsFragment, (AppBundlesVisibilityManager) DaggerApplicationComponent.this.providesAppBundlesVisibilityManagerProvider.get());
                RateAndReviewsFragment_MembersInjector.injectAppNavigator(rateAndReviewsFragment, (AppNavigator) ActivityComponentImpl.this.providesAppNavigatorProvider.get());
                RateAndReviewsFragment_MembersInjector.injectMarketName(rateAndReviewsFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                RateAndReviewsFragment_MembersInjector.injectMarketResourceFormatter(rateAndReviewsFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
                RateAndReviewsFragment_MembersInjector.injectThemeManager(rateAndReviewsFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                RateAndReviewsFragment_MembersInjector.injectDialogUtils(rateAndReviewsFragment, (DialogUtils) ActivityComponentImpl.this.providesDialogUtilsProvider.get());
                RateAndReviewsFragment_MembersInjector.injectAptoideInstalledAppsRepository(rateAndReviewsFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                RateAndReviewsFragment_MembersInjector.injectStoreCredentialsProvider(rateAndReviewsFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                RateAndReviewsFragment_MembersInjector.injectUserFeedbackAnalytics(rateAndReviewsFragment, (UserFeedbackAnalytics) DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider.get());
                return rateAndReviewsFragment;
            }

            private RecommendedStoresFragment injectRecommendedStoresFragment(RecommendedStoresFragment recommendedStoresFragment) {
                StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(recommendedStoresFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(recommendedStoresFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(recommendedStoresFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                RecommendedStoresFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                RecommendedStoresFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                RecommendedStoresFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                return recommendedStoresFragment;
            }

            private SearchResultFragment injectSearchResultFragment(SearchResultFragment searchResultFragment) {
                SearchResultFragment_MembersInjector.injectSearchResultPresenter(searchResultFragment, this.provideSearchResultPresenterProvider.get());
                SearchResultFragment_MembersInjector.injectThemeManager(searchResultFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return searchResultFragment;
            }

            private SendFeedbackFragment injectSendFeedbackFragment(SendFeedbackFragment sendFeedbackFragment) {
                SendFeedbackFragment_MembersInjector.injectAptoideInstalledAppsRepository(sendFeedbackFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                return sendFeedbackFragment;
            }

            private SettingsFragment injectSettingsFragment(SettingsFragment settingsFragment) {
                SettingsFragment_MembersInjector.injectMarketName(settingsFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                SettingsFragment_MembersInjector.injectMarketResourceFormatter(settingsFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
                SettingsFragment_MembersInjector.injectSupportEmailProvider(settingsFragment, (SupportEmailProvider) DaggerApplicationComponent.this.providesSupportEmailProvider2.get());
                SettingsFragment_MembersInjector.injectThemeManager(settingsFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                SettingsFragment_MembersInjector.injectThemeAnalytics(settingsFragment, (ThemeAnalytics) DaggerApplicationComponent.this.providesThemeAnalyticsProvider.get());
                SettingsFragment_MembersInjector.injectUpdatesRepository(settingsFragment, (UpdateRepository) DaggerApplicationComponent.this.providesUpdateRepositoryProvider.get());
                SettingsFragment_MembersInjector.injectFileManager(settingsFragment, (FileManager) DaggerApplicationComponent.this.providesFileManagerProvider.get());
                return settingsFragment;
            }

            private StoreFragment injectStoreFragment(StoreFragment storeFragment) {
                StoreFragment_MembersInjector.injectAnalyticsManager(storeFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreFragment_MembersInjector.injectNavigationTracker(storeFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                StoreFragment_MembersInjector.injectAppNavigator(storeFragment, (AppNavigator) ActivityComponentImpl.this.providesAppNavigatorProvider.get());
                StoreFragment_MembersInjector.injectMarketName(storeFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreFragment_MembersInjector.injectThemeManager(storeFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreFragment_MembersInjector.injectMarketResourceFormatter(storeFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
                StoreFragment_MembersInjector.injectStoreCredentialsProvider(storeFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreFragment_MembersInjector.injectStoreRepository(storeFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                return storeFragment;
            }

            private StoreTabWidgetsGridRecyclerFragment injectStoreTabWidgetsGridRecyclerFragment(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
                StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(storeTabWidgetsGridRecyclerFragment, (StoreUtilsProxy) DaggerApplicationComponent.this.provideStoreUtilsProxyProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(storeTabWidgetsGridRecyclerFragment, (AptoideInstalledAppsRepository) DaggerApplicationComponent.this.provideInstalledRepositoryProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(storeTabWidgetsGridRecyclerFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(storeTabWidgetsGridRecyclerFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(storeTabWidgetsGridRecyclerFragment, (StoreCredentialsProvider) DaggerApplicationComponent.this.providesStoreCredentialsProvider.get());
                StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
                return storeTabWidgetsGridRecyclerFragment;
            }

            private TimeLineFollowersFragment injectTimeLineFollowersFragment(TimeLineFollowersFragment timeLineFollowersFragment) {
                GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowersFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                TimeLineFollowersFragment_MembersInjector.injectThemeManager(timeLineFollowersFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return timeLineFollowersFragment;
            }

            private TimeLineFollowingFragment injectTimeLineFollowingFragment(TimeLineFollowingFragment timeLineFollowingFragment) {
                GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowingFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
                TimeLineFollowingFragment_MembersInjector.injectThemeManager(timeLineFollowingFragment, (ThemeManager) ActivityComponentImpl.this.providesThemeManagerProvider.get());
                return timeLineFollowingFragment;
            }

            private TopStoresFragment injectTopStoresFragment(TopStoresFragment topStoresFragment) {
                TopStoresFragment_MembersInjector.injectAnalyticsManager(topStoresFragment, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
                TopStoresFragment_MembersInjector.injectNavigationTracker(topStoresFragment, (NavigationTracker) DaggerApplicationComponent.this.provideNavigationTrackerProvider.get());
                return topStoresFragment;
            }

            private WizardFragment injectWizardFragment(WizardFragment wizardFragment) {
                WizardFragment_MembersInjector.injectWizardPresenter(wizardFragment, this.providesWizardPresenterProvider.get());
                WizardFragment_MembersInjector.injectWizardFragmentProvider(wizardFragment, this.providesWizardFragmentProvider.get());
                return wizardFragment;
            }

            private WizardPageTwoFragment injectWizardPageTwoFragment(WizardPageTwoFragment wizardPageTwoFragment) {
                WizardPageTwoFragment_MembersInjector.injectMarketResourceFormatter(wizardPageTwoFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
                return wizardPageTwoFragment;
            }

            public void inject(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment) {
                injectLoginSignUpCredentialsFragment(loginSignUpCredentialsFragment);
            }

            public void inject(InboxFragment inboxFragment) {
            }

            public void inject(WizardFragmentProvider wizardFragmentProvider) {
            }

            private FragmentComponentImpl(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
                initialize(fragmentModule, flavourFragmentModule);
            }

            public void inject(ManageUserFragment manageUserFragment) {
                injectManageUserFragment(manageUserFragment);
            }

            public void inject(ManageStoreFragment manageStoreFragment) {
                injectManageStoreFragment(manageStoreFragment);
            }

            public void inject(SearchResultFragment searchResultFragment) {
                injectSearchResultFragment(searchResultFragment);
            }

            public void inject(StoreFragment storeFragment) {
                injectStoreFragment(storeFragment);
            }

            public void inject(CommentListFragment commentListFragment) {
                injectCommentListFragment(commentListFragment);
            }

            public void inject(TopStoresFragment topStoresFragment) {
                injectTopStoresFragment(topStoresFragment);
            }

            public void inject(LatestReviewsFragment latestReviewsFragment) {
                injectLatestReviewsFragment(latestReviewsFragment);
            }

            public void inject(ListStoresFragment listStoresFragment) {
                injectListStoresFragment(listStoresFragment);
            }

            public void inject(MyStoresSubscribedFragment myStoresSubscribedFragment) {
                injectMyStoresSubscribedFragment(myStoresSubscribedFragment);
            }

            public void inject(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
                injectStoreTabWidgetsGridRecyclerFragment(storeTabWidgetsGridRecyclerFragment);
            }

            public void inject(RecommendedStoresFragment recommendedStoresFragment) {
                injectRecommendedStoresFragment(recommendedStoresFragment);
            }

            public void inject(MyStoresFragment myStoresFragment) {
                injectMyStoresFragment(myStoresFragment);
            }

            public void inject(ProfileStepOneFragment profileStepOneFragment) {
                injectProfileStepOneFragment(profileStepOneFragment);
            }

            public void inject(ProfileStepTwoFragment profileStepTwoFragment) {
                injectProfileStepTwoFragment(profileStepTwoFragment);
            }

            public void inject(ListStoreAppsFragment listStoreAppsFragment) {
                injectListStoreAppsFragment(listStoreAppsFragment);
            }

            public void inject(HomeFragment homeFragment) {
                injectHomeFragment(homeFragment);
            }

            public void inject(AppsFragment appsFragment) {
                injectAppsFragment(appsFragment);
            }

            public void inject(MyAccountFragment myAccountFragment) {
                injectMyAccountFragment(myAccountFragment);
            }

            public void inject(AppViewFragment appViewFragment) {
                injectAppViewFragment(appViewFragment);
            }

            public void inject(RateAndReviewsFragment rateAndReviewsFragment) {
                injectRateAndReviewsFragment(rateAndReviewsFragment);
            }

            public void inject(MoreBundleFragment moreBundleFragment) {
                injectMoreBundleFragment(moreBundleFragment);
            }

            public void inject(WizardFragment wizardFragment) {
                injectWizardFragment(wizardFragment);
            }

            public void inject(AppCoinsInfoFragment appCoinsInfoFragment) {
                injectAppCoinsInfoFragment(appCoinsInfoFragment);
            }

            public void inject(EditorialFragment editorialFragment) {
                injectEditorialFragment(editorialFragment);
            }

            public void inject(PromotionsFragment promotionsFragment) {
                injectPromotionsFragment(promotionsFragment);
            }

            public void inject(DescriptionFragment descriptionFragment) {
                injectDescriptionFragment(descriptionFragment);
            }

            public void inject(TimeLineFollowingFragment timeLineFollowingFragment) {
                injectTimeLineFollowingFragment(timeLineFollowingFragment);
            }

            public void inject(TimeLineFollowersFragment timeLineFollowersFragment) {
                injectTimeLineFollowersFragment(timeLineFollowersFragment);
            }

            public void inject(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
                injectGridRecyclerSwipeWithToolbarFragment(gridRecyclerSwipeWithToolbarFragment);
            }

            public void inject(SettingsFragment settingsFragment) {
                injectSettingsFragment(settingsFragment);
            }

            public void inject(WizardPageTwoFragment wizardPageTwoFragment) {
                injectWizardPageTwoFragment(wizardPageTwoFragment);
            }

            public void inject(ClaimPromotionDialogFragment claimPromotionDialogFragment) {
                injectClaimPromotionDialogFragment(claimPromotionDialogFragment);
            }

            public void inject(HomeContainerFragment homeContainerFragment) {
                injectHomeContainerFragment(homeContainerFragment);
            }

            public void inject(EditorialListFragment editorialListFragment) {
                injectEditorialListFragment(editorialListFragment);
            }

            public void inject(EarnAppcListFragment earnAppcListFragment) {
                injectEarnAppcListFragment(earnAppcListFragment);
            }

            public void inject(ListAppsMoreFragment listAppsMoreFragment) {
                injectListAppsMoreFragment(listAppsMoreFragment);
            }

            public void inject(AutoUpdateDialogFragment autoUpdateDialogFragment) {
                injectAutoUpdateDialogFragment(autoUpdateDialogFragment);
            }

            public void inject(NewFeatureDialogFragment newFeatureDialogFragment) {
                injectNewFeatureDialogFragment(newFeatureDialogFragment);
            }

            public void inject(CommentDialogFragment commentDialogFragment) {
                injectCommentDialogFragment(commentDialogFragment);
            }

            public void inject(SendFeedbackFragment sendFeedbackFragment) {
                injectSendFeedbackFragment(sendFeedbackFragment);
            }

            public void inject(ExcludedUpdatesFragment excludedUpdatesFragment) {
                injectExcludedUpdatesFragment(excludedUpdatesFragment);
            }

            public void inject(OtherVersionsFragment otherVersionsFragment) {
                injectOtherVersionsFragment(otherVersionsFragment);
            }

            public void inject(AddStoreDialog addStoreDialog) {
                injectAddStoreDialog(addStoreDialog);
            }

            public void inject(PrivateStoreDialog privateStoreDialog) {
                injectPrivateStoreDialog(privateStoreDialog);
            }

            public void inject(CheckYourEmailFragment checkYourEmailFragment) {
                injectCheckYourEmailFragment(checkYourEmailFragment);
            }

            public void inject(OutOfSpaceDialogFragment outOfSpaceDialogFragment) {
                injectOutOfSpaceDialogFragment(outOfSpaceDialogFragment);
            }
        }

        private void initialize(ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
            ActivityModule activityModule2 = activityModule;
            this.providesThemeManagerProvider = C10823a.m36716a(ActivityModule_ProvidesThemeManagerFactory.create(activityModule));
            this.provideFragmentManagerProvider = C10823a.m36716a(ActivityModule_ProvideFragmentManagerFactory.create(activityModule));
            this.provideMainFragmentNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideMainFragmentNavigatorFactory.create(activityModule2, DaggerApplicationComponent.this.provideFragmentNavigatorMapProvider, DaggerApplicationComponent.this.provideFragmentNavigatorRelayProvider, this.provideFragmentManagerProvider));
            Provider<BottomNavigationAnalytics> a = C10823a.m36716a(ActivityModule_ProvidesBottomNavigationAnalyticsFactory.create(activityModule2, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider));
            this.providesBottomNavigationAnalyticsProvider = a;
            this.provideBottomNavigationNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideBottomNavigationNavigatorFactory.create(activityModule2, this.provideMainFragmentNavigatorProvider, a, DaggerApplicationComponent.this.providesSearchAnalyticsProvider, this.providesThemeManagerProvider));
            this.provideAccountNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideAccountNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.provideCallbackManagerProvider, DaggerApplicationComponent.this.provideGoogleApiClientProvider, DaggerApplicationComponent.this.provideAccountAnalyticsProvider, this.provideBottomNavigationNavigatorProvider, this.providesThemeManagerProvider));
            this.provideBottomNavigationMapperProvider = C10823a.m36716a(ActivityModule_ProvideBottomNavigationMapperFactory.create(activityModule));
            this.provideApkFyProvider = C10823a.m36716a(ActivityModule_ProvideApkFyFactory.create(activityModule2, DaggerApplicationComponent.this.providesSecureSharedPreferencesProvider));
            Provider<AppNavigator> a2 = C10823a.m36716a(ActivityModule_ProvidesAppNavigatorFactory.create(activityModule2, this.provideMainFragmentNavigatorProvider));
            this.providesAppNavigatorProvider = a2;
            this.providesSearchNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesSearchNavigatorFactory.create(activityModule2, this.provideMainFragmentNavigatorProvider, a2));
            ActivityModule activityModule3 = activityModule2;
            this.provideDeepLinkManagerProvider = C10823a.m36716a(ActivityModule_ProvideDeepLinkManagerFactory.create(activityModule, DaggerApplicationComponent.this.provideStoreUtilsProxyProvider, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider, this.providesSearchNavigatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider, DaggerApplicationComponent.this.providesSearchAnalyticsProvider, DaggerApplicationComponent.this.provideDeepLinkAnalyticsProvider, DaggerApplicationComponent.this.providesAppShortcutsAnalyticsProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, DaggerApplicationComponent.this.providesStoreAnalyticsProvider, DaggerApplicationComponent.this.provideAdsRepositoryProvider, this.providesAppNavigatorProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesNewFeatureProvider, this.providesThemeManagerProvider, DaggerApplicationComponent.this.providesThemeAnalyticsProvider, DaggerApplicationComponent.this.providesReadyToInstallNotificationManagerProvider));
            Provider<String> a3 = C10823a.m36716a(ActivityModule_ProvidePackageNameFactory.create(activityModule));
            this.providePackageNameProvider = a3;
            this.provideLocalVersionCodeProvider = C10823a.m36716a(ActivityModule_ProvideLocalVersionCodeFactory.create(activityModule3, a3));
            this.provideClientSdkVersionProvider = C10823a.m36716a(ActivityModule_ProvideClientSdkVersionFactory.create(activityModule));
            Provider<AutoUpdateService> a4 = C10823a.m36716a(ActivityModule_ProvidesAutoUpdateServiceFactory.create(activityModule3, DaggerApplicationComponent.this.providesAutoUpdateServiceProvider, this.providePackageNameProvider, this.provideClientSdkVersionProvider));
            this.providesAutoUpdateServiceProvider = a4;
            this.providesAutoUpdateRepositoryProvider = C10823a.m36716a(ActivityModule_ProvidesAutoUpdateRepositoryFactory.create(activityModule3, a4));
            this.provideAutoUpdateManagerProvider = C10823a.m36716a(ActivityModule_ProvideAutoUpdateManagerFactory.create(activityModule, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providePermissionManagerProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider, this.provideLocalVersionCodeProvider, this.providesAutoUpdateRepositoryProvider));
            this.provideMainPresenterProvider = C10823a.m36716a(ActivityModule_ProvideMainPresenterFactory.create(activityModule, DaggerApplicationComponent.this.provideRootInstallationRetryHandlerProvider, this.provideApkFyProvider, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, DaggerApplicationComponent.this.providesSecureSharedPreferencesProvider, this.provideMainFragmentNavigatorProvider, this.provideDeepLinkManagerProvider, this.provideBottomNavigationNavigatorProvider, DaggerApplicationComponent.this.providesUpdatesManagerProvider, this.provideAutoUpdateManagerProvider, DaggerApplicationComponent.this.provideRootAvailabilityManagerProvider, this.provideBottomNavigationMapperProvider, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.provideAccountNavigatorProvider, DaggerApplicationComponent.this.providesAgentPersistenceProvider));
            this.providesWalletInstallConfigurationProvider = C10823a.m36716a(ActivityModule_ProvidesWalletInstallConfigurationFactory.create(activityModule));
            ActivityModule activityModule4 = activityModule;
            this.providesWalletInstallNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesWalletInstallNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider));
            this.providesWalletInstallAnalyticsProvider = C10823a.m36716a(ActivityModule_ProvidesWalletInstallAnalyticsFactory.create(activityModule, DaggerApplicationComponent.this.providesDownloadAnalyticsProvider, DaggerApplicationComponent.this.provideNotificationAnalyticsProvider, DaggerApplicationComponent.this.provideInstallAnalyticsProvider, DaggerApplicationComponent.this.providesDownloadStateParserProvider, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider, DaggerApplicationComponent.this.splitAnalyticsMapperProvider));
            Provider<WalletInstallManager> a5 = C10823a.m36716a(ActivityModule_ProvidesWalletInstallManagerFactory.create(activityModule, DaggerApplicationComponent.this.providesInstallManagerProvider, DaggerApplicationComponent.this.provideDownloadFactoryProvider, DaggerApplicationComponent.this.providesDownloadStateParserProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider, this.providesWalletInstallAnalyticsProvider, DaggerApplicationComponent.this.provideInstalledRepositoryProvider, DaggerApplicationComponent.this.providesWalletAppProvider, DaggerApplicationComponent.this.providesAppInstallerStatusReceiverProvider, DaggerApplicationComponent.this.providesDynamicSplitsManagerProvider));
            this.providesWalletInstallManagerProvider = a5;
            this.providesWalletInstallPresenterProvider = C10823a.m36716a(ActivityModule_ProvidesWalletInstallPresenterFactory.create(activityModule, this.providesWalletInstallConfigurationProvider, this.providesWalletInstallNavigatorProvider, a5, this.providesWalletInstallAnalyticsProvider, DaggerApplicationComponent.this.providesMoPubAdsManagerProvider));
            this.providesDonationsAnalyticsProvider = C10823a.m36716a(ActivityModule_ProvidesDonationsAnalyticsFactory.create(activityModule4, DaggerApplicationComponent.this.providesAnalyticsManagerProvider, DaggerApplicationComponent.this.provideNavigationTrackerProvider));
            this.provideScreenOrientationManagerProvider = C10823a.m36716a(ActivityModule_ProvideScreenOrientationManagerFactory.create(activityModule));
            this.provideAccountPermissionProvider = C10823a.m36716a(ActivityModule_ProvideAccountPermissionProviderFactory.create(activityModule));
            this.providePhotoFileGeneratorProvider = C10823a.m36716a(ActivityModule_ProvidePhotoFileGeneratorFactory.create(activityModule));
            this.provideUriToPathResolverProvider = C10823a.m36716a(ActivityModule_ProvideUriToPathResolverFactory.create(activityModule));
            this.provideImagePickerNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideImagePickerNavigatorFactory.create(activityModule));
            this.provideManageUserNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideManageUserNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider));
            this.provideManageStoreNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideManageStoreNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.provideBottomNavigationNavigatorProvider));
            this.provideListStoreAppsNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideListStoreAppsNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            Provider<ExternalNavigator> a6 = C10823a.m36716a(ActivityModule_ProvidesExternalNavigatorFactory.create(activityModule4, this.providesThemeManagerProvider));
            this.providesExternalNavigatorProvider = a6;
            Provider<SocialMediaNavigator> a7 = C10823a.m36716a(ActivityModule_ProvidesSocialMediaNavigatorFactory.create(activityModule4, a6));
            this.providesSocialMediaNavigatorProvider = a7;
            this.provideMyAccountNavigatorProvider = C10823a.m36716a(ActivityModule_ProvideMyAccountNavigatorFactory.create(activityModule, this.provideMainFragmentNavigatorProvider, this.provideAccountNavigatorProvider, this.providesAppNavigatorProvider, this.providesThemeManagerProvider, a7));
            Provider<CatappultNavigator> a8 = C10823a.m36716a(ActivityModule_ProvidesCatappultNavigatorFactory.create(activityModule4, this.providesExternalNavigatorProvider));
            this.providesCatappultNavigatorProvider = a8;
            this.providesAppViewNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesAppViewNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider, a8));
            this.providesPromotionsNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesPromotionsNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            this.providesDialogUtilsProvider = C10823a.m36716a(ActivityModule_ProvidesDialogUtilsFactory.create(activityModule, DaggerApplicationComponent.this.provideAptoideAccountManagerProvider, this.provideAccountNavigatorProvider, DaggerApplicationComponent.this.provideAccountSettingsBodyInterceptorPoolV7Provider, DaggerApplicationComponent.this.provideOkHttpClientProvider, DaggerApplicationComponent.this.providesConverterFactoryProvider, DaggerApplicationComponent.this.provideInstalledRepositoryProvider, DaggerApplicationComponent.this.provideTokenInvalidatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, DaggerApplicationComponent.this.provideMarketResourceFormatterProvider, this.providesThemeManagerProvider, DaggerApplicationComponent.this.providesUserFeedbackAnalyticsProvider));
            this.providesAppCoinsInfoNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesAppCoinsInfoNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.providesSocialMediaNavigatorProvider, this.providesCatappultNavigatorProvider));
            this.providesScreenWidthProvider = C10823a.m36716a(ActivityModule_ProvidesScreenWidthFactory.create(activityModule4, DaggerApplicationComponent.this.provideResourcesProvider));
            this.providesScreenHeightProvider = C10823a.m36716a(ActivityModule_ProvidesScreenHeightFactory.create(activityModule4, DaggerApplicationComponent.this.provideResourcesProvider));
            this.providesClaimPromotionsNavigatorProvider = C10823a.m36716a(ActivityModule_ProvidesClaimPromotionsNavigatorFactory.create(activityModule4, this.provideMainFragmentNavigatorProvider, this.providesAppNavigatorProvider));
            this.providesListAppsMoreRepositoryProvider = C10823a.m36716a(ActivityModule_ProvidesListAppsMoreRepositoryFactory.create(activityModule, DaggerApplicationComponent.this.providesStoreCredentialsProvider, DaggerApplicationComponent.this.provideOkHttpClientProvider, DaggerApplicationComponent.this.provideAccountSettingsBodyInterceptorPoolV7Provider, DaggerApplicationComponent.this.provideTokenInvalidatorProvider, DaggerApplicationComponent.this.providesDefaultSharedPerefencesProvider, DaggerApplicationComponent.this.providesConverterFactoryProvider, DaggerApplicationComponent.this.providesAppBundlesVisibilityManagerProvider));
        }

        private ActivityResultNavigator injectActivityResultNavigator(ActivityResultNavigator activityResultNavigator) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(activityResultNavigator, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(activityResultNavigator, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(activityResultNavigator, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            return activityResultNavigator;
        }

        private AnalyticsActivity injectAnalyticsActivity(AnalyticsActivity analyticsActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(analyticsActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(analyticsActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(analyticsActivity, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(analyticsActivity, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(analyticsActivity, (FirstLaunchAnalytics) DaggerApplicationComponent.this.providesFirstLaunchAnalyticsProvider.get());
            return analyticsActivity;
        }

        private BaseDialogFragment injectBaseDialogFragment(BaseDialogFragment baseDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(baseDialogFragment, this.providesThemeManagerProvider.get());
            return baseDialogFragment;
        }

        private BottomNavigationActivity injectBottomNavigationActivity(BottomNavigationActivity bottomNavigationActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(bottomNavigationActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(bottomNavigationActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(bottomNavigationActivity, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(bottomNavigationActivity, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(bottomNavigationActivity, (FirstLaunchAnalytics) DaggerApplicationComponent.this.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(bottomNavigationActivity, this.providesThemeManagerProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(bottomNavigationActivity, this.provideBottomNavigationMapperProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(bottomNavigationActivity, this.provideBottomNavigationNavigatorProvider.get());
            return bottomNavigationActivity;
        }

        private DonateDialogFragment injectDonateDialogFragment(DonateDialogFragment donateDialogFragment) {
            BaseDialogFragment_MembersInjector.injectThemeManager(donateDialogFragment, this.providesThemeManagerProvider.get());
            DonateDialogFragment_MembersInjector.injectWalletService(donateDialogFragment, (WalletService) DaggerApplicationComponent.this.providesWalletServiceProvider.get());
            DonateDialogFragment_MembersInjector.injectAppNavigator(donateDialogFragment, this.providesAppNavigatorProvider.get());
            DonateDialogFragment_MembersInjector.injectDonationsAnalytics(donateDialogFragment, this.providesDonationsAnalyticsProvider.get());
            return donateDialogFragment;
        }

        private MainActivity injectMainActivity(MainActivity mainActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(mainActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(mainActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(mainActivity, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(mainActivity, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(mainActivity, (FirstLaunchAnalytics) DaggerApplicationComponent.this.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(mainActivity, this.providesThemeManagerProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(mainActivity, this.provideBottomNavigationMapperProvider.get());
            BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(mainActivity, this.provideBottomNavigationNavigatorProvider.get());
            MainActivity_MembersInjector.injectPresenter(mainActivity, this.provideMainPresenterProvider.get());
            MainActivity_MembersInjector.injectResources(mainActivity, (Resources) DaggerApplicationComponent.this.provideResourcesProvider.get());
            MainActivity_MembersInjector.injectMarketResourceFormatter(mainActivity, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
            MainActivity_MembersInjector.injectThemeAnalytics(mainActivity, (ThemeAnalytics) DaggerApplicationComponent.this.providesThemeAnalyticsProvider.get());
            MainActivity_MembersInjector.injectDeepLinkManager(mainActivity, this.provideDeepLinkManagerProvider.get());
            return mainActivity;
        }

        private SettingsFragment injectSettingsFragment(SettingsFragment settingsFragment) {
            SettingsFragment_MembersInjector.injectMarketName(settingsFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            SettingsFragment_MembersInjector.injectMarketResourceFormatter(settingsFragment, (MarketResourceFormatter) DaggerApplicationComponent.this.provideMarketResourceFormatterProvider.get());
            SettingsFragment_MembersInjector.injectSupportEmailProvider(settingsFragment, (SupportEmailProvider) DaggerApplicationComponent.this.providesSupportEmailProvider2.get());
            SettingsFragment_MembersInjector.injectThemeManager(settingsFragment, this.providesThemeManagerProvider.get());
            SettingsFragment_MembersInjector.injectThemeAnalytics(settingsFragment, (ThemeAnalytics) DaggerApplicationComponent.this.providesThemeAnalyticsProvider.get());
            SettingsFragment_MembersInjector.injectUpdatesRepository(settingsFragment, (UpdateRepository) DaggerApplicationComponent.this.providesUpdateRepositoryProvider.get());
            SettingsFragment_MembersInjector.injectFileManager(settingsFragment, (FileManager) DaggerApplicationComponent.this.providesFileManagerProvider.get());
            return settingsFragment;
        }

        private StoreTabGridRecyclerFragment injectStoreTabGridRecyclerFragment(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment) {
            StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabGridRecyclerFragment, (RoomStoreRepository) DaggerApplicationComponent.this.providesRoomStoreRepositoryProvider.get());
            StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabGridRecyclerFragment, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            return storeTabGridRecyclerFragment;
        }

        private ThemedActivityView injectThemedActivityView(ThemedActivityView themedActivityView) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(themedActivityView, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(themedActivityView, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(themedActivityView, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(themedActivityView, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(themedActivityView, (FirstLaunchAnalytics) DaggerApplicationComponent.this.providesFirstLaunchAnalyticsProvider.get());
            ThemedActivityView_MembersInjector.injectThemeManager(themedActivityView, this.providesThemeManagerProvider.get());
            return themedActivityView;
        }

        private WalletInstallActivity injectWalletInstallActivity(WalletInstallActivity walletInstallActivity) {
            ActivityResultNavigator_MembersInjector.injectThemeManager(walletInstallActivity, this.providesThemeManagerProvider.get());
            ActivityResultNavigator_MembersInjector.injectAccountNavigator(walletInstallActivity, this.provideAccountNavigatorProvider.get());
            ActivityResultNavigator_MembersInjector.injectMarketName(walletInstallActivity, (String) DaggerApplicationComponent.this.provideMarketNameProvider.get());
            AnalyticsActivity_MembersInjector.injectAnalyticsManager(walletInstallActivity, (AnalyticsManager) DaggerApplicationComponent.this.providesAnalyticsManagerProvider.get());
            AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(walletInstallActivity, (FirstLaunchAnalytics) DaggerApplicationComponent.this.providesFirstLaunchAnalyticsProvider.get());
            WalletInstallActivity_MembersInjector.injectPresenter(walletInstallActivity, this.providesWalletInstallPresenterProvider.get());
            return walletInstallActivity;
        }

        public void inject(BaseActivity baseActivity) {
        }

        public void inject(MainActivity mainActivity) {
            injectMainActivity(mainActivity);
        }

        public void inject(DialogUtils dialogUtils) {
        }

        public void inject(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        }

        public FragmentComponent plus(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule) {
            C10825c.m36717a(fragmentModule);
            C10825c.m36717a(flavourFragmentModule);
            return new FragmentComponentImpl(fragmentModule, flavourFragmentModule);
        }

        private ActivityComponentImpl(ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
            initialize(activityModule, flavourActivityModule);
        }

        public void inject(ThemedActivityView themedActivityView) {
            injectThemedActivityView(themedActivityView);
        }

        public void inject(WalletInstallActivity walletInstallActivity) {
            injectWalletInstallActivity(walletInstallActivity);
        }

        public void inject(ActivityResultNavigator activityResultNavigator) {
            injectActivityResultNavigator(activityResultNavigator);
        }

        public void inject(AnalyticsActivity analyticsActivity) {
            injectAnalyticsActivity(analyticsActivity);
        }

        public void inject(BottomNavigationActivity bottomNavigationActivity) {
            injectBottomNavigationActivity(bottomNavigationActivity);
        }

        public void inject(DonateDialogFragment donateDialogFragment) {
            injectDonateDialogFragment(donateDialogFragment);
        }

        public void inject(SettingsFragment settingsFragment) {
            injectSettingsFragment(settingsFragment);
        }

        public void inject(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment) {
            injectStoreTabGridRecyclerFragment(storeTabGridRecyclerFragment);
        }

        public void inject(BaseDialogFragment baseDialogFragment) {
            injectBaseDialogFragment(baseDialogFragment);
        }
    }

    /* renamed from: cm.aptoide.pt.DaggerApplicationComponent$Builder */
    public static final class Builder {
        private ApplicationModule applicationModule;
        private FlavourApplicationModule flavourApplicationModule;

        public Builder applicationModule(ApplicationModule applicationModule2) {
            C10825c.m36717a(applicationModule2);
            this.applicationModule = applicationModule2;
            return this;
        }

        public ApplicationComponent build() {
            C10825c.m36719a(this.applicationModule, ApplicationModule.class);
            C10825c.m36719a(this.flavourApplicationModule, FlavourApplicationModule.class);
            return new DaggerApplicationComponent(this.applicationModule, this.flavourApplicationModule);
        }

        public Builder flavourApplicationModule(FlavourApplicationModule flavourApplicationModule2) {
            C10825c.m36717a(flavourApplicationModule2);
            this.flavourApplicationModule = flavourApplicationModule2;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        ApplicationModule applicationModule2 = applicationModule;
        Provider<RoomMigrationProvider> a = C10823a.m36716a(ApplicationModule_ProvidesRoomMigrationProviderFactory.create(applicationModule));
        this.providesRoomMigrationProvider = a;
        Provider<AptoideDatabase> a2 = C10823a.m36716a(ApplicationModule_ProvidesAptoideDataBaseFactory.create(applicationModule2, a));
        this.providesAptoideDataBaseProvider = a2;
        this.provideRoomNotificationPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvideRoomNotificationPersistenceFactory.create(applicationModule2, a2));
        this.providesInstallationAccessorProvider = C10823a.m36716a(ApplicationModule_ProvidesInstallationAccessorFactory.create(applicationModule2, this.providesAptoideDataBaseProvider));
        Provider<RoomInstallationMapper> a3 = C10823a.m36716a(ApplicationModule_ProvidesRoomInstallationMapperFactory.create(applicationModule));
        this.providesRoomInstallationMapperProvider = a3;
        this.provideRoomInstalledPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvideRoomInstalledPersistenceFactory.create(applicationModule2, this.providesAptoideDataBaseProvider, this.providesInstallationAccessorProvider, a3));
        Provider<FileUtils> a4 = C10823a.m36716a(ApplicationModule_ProvideFileUtilsFactory.create(applicationModule));
        this.provideFileUtilsProvider = a4;
        this.provideInstalledRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvideInstalledRepositoryFactory.create(applicationModule2, this.provideRoomInstalledPersistenceProvider, a4));
        Provider<SharedPreferences> a5 = C10823a.m36716a(ApplicationModule_ProvidesDefaultSharedPerefencesFactory.create(applicationModule));
        this.providesDefaultSharedPerefencesProvider = a5;
        this.providesBaseRakamHostProvider = C10823a.m36716a(ApplicationModule_ProvidesBaseRakamHostFactory.create(applicationModule2, a5));
        Provider<DownloadPersistence> a6 = C10823a.m36716a(ApplicationModule_ProvideDownloadPersistenceFactory.create(applicationModule2, this.providesAptoideDataBaseProvider));
        this.provideDownloadPersistenceProvider = a6;
        this.provideDownloadsRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvideDownloadsRepositoryFactory.create(applicationModule2, a6));
        this.downloadStatusMapperProvider = C10823a.m36716a(ApplicationModule_DownloadStatusMapperFactory.create(applicationModule));
        this.provideCachePathProvider = C10823a.m36716a(ApplicationModule_ProvideCachePathFactory.create(applicationModule));
        Provider<DownloadAppFileMapper> a7 = C10823a.m36716a(ApplicationModule_ProvidesDownloadAppFileMapperFactory.create(applicationModule));
        this.providesDownloadAppFileMapperProvider = a7;
        this.providesDownloadAppMapperProvider = C10823a.m36716a(ApplicationModule_ProvidesDownloadAppMapperFactory.create(applicationModule2, a7));
        this.provideAccountManagerProvider = C10823a.m36716a(ApplicationModule_ProvideAccountManagerFactory.create(applicationModule));
        Provider<String> a8 = C10823a.m36716a(ApplicationModule_ProvideAccountTypeFactory.create(applicationModule));
        this.provideAccountTypeProvider = a8;
        this.provideAndroidAccountProvider = C10823a.m36716a(ApplicationModule_ProvideAndroidAccountProviderFactory.create(applicationModule2, this.provideAccountManagerProvider, a8));
        Provider<ContentResolver> a9 = C10823a.m36716a(ApplicationModule_ProvideContentResolverFactory.create(applicationModule));
        this.provideContentResolverProvider = a9;
        this.provideIdsRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvideIdsRepositoryFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider, a9));
        Provider<String> a10 = C10823a.m36716a(FlavourApplicationModule_ProvidePartnerIDFactory.create(flavourApplicationModule));
        this.providePartnerIDProvider = a10;
        this.provideUserAgentInterceptorProvider = C10823a.m36716a(ApplicationModule_ProvideUserAgentInterceptorFactory.create(applicationModule2, this.provideAndroidAccountProvider, this.provideIdsRepositoryProvider, a10));
        this.provideAuthenticationPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvideAuthenticationPersistenceFactory.create(applicationModule2, this.provideAndroidAccountProvider));
        Provider<ObjectMapper> a11 = C10823a.m36716a(ApplicationModule_ProvideNonNullObjectMapperFactory.create(applicationModule));
        this.provideNonNullObjectMapperProvider = a11;
        Provider<RoomEventMapper> a12 = C10823a.m36716a(ApplicationModule_ProvidesRoomEventMapperFactory.create(applicationModule2, a11));
        this.providesRoomEventMapperProvider = a12;
        this.providesEventsPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvidesEventsPersistenceFactory.create(applicationModule2, this.providesAptoideDataBaseProvider, a12));
        this.providesBaseHostProvider = C10823a.m36716a(ApplicationModule_ProvidesBaseHostFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.provideL2CacheProvider = C10823a.m36716a(ApplicationModule_ProvideL2CacheFactory.create(applicationModule));
        Provider<Interceptor> a13 = C10823a.m36716a(ApplicationModule_ProvideRetrofitLogInterceptorFactory.create(applicationModule));
        this.provideRetrofitLogInterceptorProvider = a13;
        Provider<OkHttpClient.Builder> a14 = C10823a.m36716a(ApplicationModule_ProvidesOkHttpBuilderFactory.create(applicationModule2, this.provideL2CacheProvider, this.providesDefaultSharedPerefencesProvider, a13));
        this.providesOkHttpBuilderProvider = a14;
        this.provideOkHttpClientProvider = C10823a.m36716a(ApplicationModule_ProvideOkHttpClientFactory.create(applicationModule2, a14, this.provideUserAgentInterceptorProvider));
        this.providesConverterFactoryProvider = C10823a.m36716a(ApplicationModule_ProvidesConverterFactoryFactory.create(applicationModule));
        Provider<CallAdapter.Factory> a15 = C10823a.m36716a(ApplicationModule_ProvidesCallAdapterFactoryFactory.create(applicationModule));
        this.providesCallAdapterFactoryProvider = a15;
        Provider<Retrofit> a16 = C10823a.m36716a(ApplicationModule_ProvidesV7RetrofitFactory.create(applicationModule2, this.providesBaseHostProvider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, a15));
        this.providesV7RetrofitProvider = a16;
        this.providesAptoideBiServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesAptoideBiServiceFactory.create(applicationModule2, a16));
        this.provideResourcesProvider = C10823a.m36716a(ApplicationModule_ProvideResourcesFactory.create(applicationModule));
        Provider<WindowManager> a17 = C10823a.m36716a(ApplicationModule_ProvideWindowManagerFactory.create(applicationModule));
        this.provideWindowManagerProvider = a17;
        this.provideQManagerProvider = C10823a.m36716a(ApplicationModule_ProvideQManagerFactory.create(applicationModule2, this.provideResourcesProvider, a17));
        this.provideAptoidePackageProvider = C10823a.m36716a(ApplicationModule_ProvideAptoidePackageFactory.create(applicationModule));
        Provider<PreferencesPersister> a18 = C10823a.m36716a(ApplicationModule_ProvidesUserPreferencesPersisterFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesUserPreferencesPersisterProvider = a18;
        Provider<AptoideMd5Manager> a19 = C10823a.m36716a(ApplicationModule_ProvidesAptoideMd5ManagerFactory.create(applicationModule2, a18));
        this.providesAptoideMd5ManagerProvider = a19;
        Provider<AnalyticsBodyInterceptorV7> a20 = C10823a.m36716a(ApplicationModule_ProvideAnalyticsBodyInterceptorV7Factory.create(applicationModule, this.provideAuthenticationPersistenceProvider, this.provideIdsRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.provideResourcesProvider, this.provideQManagerProvider, this.provideAptoidePackageProvider, a19));
        this.provideAnalyticsBodyInterceptorV7Provider = a20;
        this.providesRetrofitAptoideBiServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory.create(applicationModule2, this.providesAptoideBiServiceProvider, a20));
        Provider<AnalyticsLogger> a21 = C10823a.m36716a(ApplicationModule_ProvidesAnalyticsDebugLoggerFactory.create(applicationModule));
        this.providesAnalyticsDebugLoggerProvider = a21;
        Provider<AptoideBiEventLogger> a22 = C10823a.m36716a(ApplicationModule_ProvidesAptoideBILoggerFactory.create(applicationModule2, this.providesEventsPersistenceProvider, this.providesRetrofitAptoideBiServiceProvider, this.providesDefaultSharedPerefencesProvider, a21));
        this.providesAptoideBILoggerProvider = a22;
        this.providesAptoideEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesAptoideEventLoggerFactory.create(applicationModule2, a22));
        Provider<C4728g> a23 = C10823a.m36716a(ApplicationModule_ProvideAppEventsLoggerFactory.create(applicationModule));
        this.provideAppEventsLoggerProvider = a23;
        this.providesFacebookEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesFacebookEventLoggerFactory.create(applicationModule2, a23, this.providesAnalyticsDebugLoggerProvider));
        Provider<FlurryEventLogger> a24 = C10823a.m36716a(ApplicationModule_ProvidesFlurryLoggerFactory.create(applicationModule2, this.providesAnalyticsDebugLoggerProvider));
        this.providesFlurryLoggerProvider = a24;
        this.providesFlurryEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesFlurryEventLoggerFactory.create(applicationModule2, a24));
        this.providesknockEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesknockEventLoggerFactory.create(applicationModule2, this.provideOkHttpClientProvider));
        this.provideAptoideEventsProvider = C10823a.m36716a(ApplicationModule_ProvideAptoideEventsFactory.create(applicationModule));
        this.provideFacebookEventsProvider = C10823a.m36716a(ApplicationModule_ProvideFacebookEventsFactory.create(applicationModule));
        this.provideFlurryEventsProvider = C10823a.m36716a(ApplicationModule_ProvideFlurryEventsFactory.create(applicationModule));
        this.providesFlurrySessionLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesFlurrySessionLoggerFactory.create(applicationModule2, this.providesFlurryLoggerProvider));
        this.providesAptoideSessionLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesAptoideSessionLoggerFactory.create(applicationModule2, this.providesAptoideBILoggerProvider));
        this.providesAnalyticsNormalizerProvider = C10823a.m36716a(ApplicationModule_ProvidesAnalyticsNormalizerFactory.create(applicationModule));
        Provider<MapToJsonMapper> a25 = C10823a.m36716a(ApplicationModule_ProvidesMapToJsonMapperFactory.create(applicationModule));
        this.providesMapToJsonMapperProvider = a25;
        this.providesRakamEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesRakamEventLoggerFactory.create(applicationModule2, this.providesAnalyticsDebugLoggerProvider, a25));
        this.providesRakamEventsProvider = C10823a.m36716a(ApplicationModule_ProvidesRakamEventsFactory.create(applicationModule));
        this.providesIndicativeEventLoggerProvider = C10823a.m36716a(ApplicationModule_ProvidesIndicativeEventLoggerFactory.create(applicationModule2, this.providesAnalyticsDebugLoggerProvider));
        Provider<Collection<String>> a26 = C10823a.m36716a(ApplicationModule_ProvidesIndicativeEventsFactory.create(applicationModule));
        this.providesIndicativeEventsProvider = a26;
        Provider<Collection<String>> provider = a26;
        Provider<AnalyticsManager> a27 = C10823a.m36716a(ApplicationModule_ProvidesAnalyticsManagerFactory.create(applicationModule, this.providesAptoideEventLoggerProvider, this.providesFacebookEventLoggerProvider, this.providesFlurryEventLoggerProvider, this.providesknockEventLoggerProvider, this.provideAptoideEventsProvider, this.provideFacebookEventsProvider, this.provideFlurryEventsProvider, this.providesFlurrySessionLoggerProvider, this.providesAptoideSessionLoggerProvider, this.providesAnalyticsNormalizerProvider, this.providesRakamEventLoggerProvider, this.providesRakamEventsProvider, this.providesIndicativeEventLoggerProvider, provider, this.providesAnalyticsDebugLoggerProvider));
        this.providesAnalyticsManagerProvider = a27;
        ApplicationModule applicationModule3 = applicationModule;
        Provider<PageViewsAnalytics> a28 = C10823a.m36716a(ApplicationModule_ProvidePageViewsAnalyticsFactory.create(applicationModule3, a27));
        this.providePageViewsAnalyticsProvider = a28;
        this.provideNavigationTrackerProvider = C10823a.m36716a(ApplicationModule_ProvideNavigationTrackerFactory.create(applicationModule3, a28, this.providesAnalyticsDebugLoggerProvider));
        this.providesConnectivityManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesConnectivityManagerFactory.create(applicationModule));
        Provider<TelephonyManager> a29 = C10823a.m36716a(ApplicationModule_ProvidesTelephonyManagerFactory.create(applicationModule));
        this.providesTelephonyManagerProvider = a29;
        this.providesDownloadAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesDownloadAnalyticsFactory.create(applicationModule3, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesConnectivityManagerProvider, a29));
        this.provideInstallAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvideInstallAnalyticsFactory.create(applicationModule3, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesConnectivityManagerProvider, this.providesTelephonyManagerProvider));
        Provider<Md5Comparator> a30 = C10823a.m36716a(ApplicationModule_ProvidesMd5ComparatorFactory.create(applicationModule3, this.provideCachePathProvider));
        this.providesMd5ComparatorProvider = a30;
        Provider<FileDownloaderProvider> a31 = C10823a.m36716a(ApplicationModule_ProvidesFileDownloaderProviderFactory.create(applicationModule, this.provideCachePathProvider, this.provideUserAgentInterceptorProvider, this.provideAuthenticationPersistenceProvider, this.providesDownloadAnalyticsProvider, this.provideInstallAnalyticsProvider, a30));
        this.providesFileDownloaderProvider = a31;
        Provider<RetryFileDownloaderProvider> a32 = C10823a.m36716a(ApplicationModule_ProvidesRetryFileDownloaderProviderFactory.create(applicationModule3, a31));
        this.providesRetryFileDownloaderProvider = a32;
        this.providesAppDownloaderProvider = C10823a.m36716a(ApplicationModule_ProvidesAppDownloaderProviderFactory.create(applicationModule3, a32, this.providesDownloadAnalyticsProvider));
        this.provideApkPathProvider = C10823a.m36716a(ApplicationModule_ProvideApkPathFactory.create(applicationModule3, this.provideCachePathProvider));
        Provider<String> a33 = C10823a.m36716a(ApplicationModule_ProvideObbPathFactory.create(applicationModule3, this.provideCachePathProvider));
        this.provideObbPathProvider = a33;
        Provider<FilePathProvider> a34 = C10823a.m36716a(ApplicationModule_FilePathManagerFactory.create(applicationModule3, this.provideCachePathProvider, this.provideApkPathProvider, a33));
        this.filePathManagerProvider = a34;
        this.provideAptoideDownloadManagerProvider = C10823a.m36716a(ApplicationModule_ProvideAptoideDownloadManagerFactory.create(applicationModule, this.provideDownloadsRepositoryProvider, this.downloadStatusMapperProvider, this.provideCachePathProvider, this.providesDownloadAppMapperProvider, this.providesAppDownloaderProvider, this.provideApkPathProvider, this.provideObbPathProvider, this.providesDownloadAnalyticsProvider, a34));
        this.providesUpdatePersistenceProvider = C10823a.m36716a(ApplicationModule_ProvidesUpdatePersistenceFactory.create(applicationModule3, this.providesAptoideDataBaseProvider));
        Provider<StorePersistence> a35 = C10823a.m36716a(ApplicationModule_ProvidesStorePersistenceFactory.create(applicationModule3, this.providesAptoideDataBaseProvider));
        this.providesStorePersistenceProvider = a35;
        this.providesRoomStoreRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvidesRoomStoreRepositoryFactory.create(applicationModule3, a35));
        this.provideBodyInterceptorPoolV7Provider = C10823a.m36716a(ApplicationModule_ProvideBodyInterceptorPoolV7Factory.create(applicationModule, this.provideAuthenticationPersistenceProvider, this.provideIdsRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.provideResourcesProvider, this.provideQManagerProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        this.provideDefaultPreferencesProvider = C10823a.m36716a(ApplicationModule_ProvideDefaultPreferencesFactory.create(applicationModule3, this.providesDefaultSharedPerefencesProvider));
        Provider<SecureCoderDecoder> a36 = C10823a.m36716a(ApplicationModule_ProvideSecureCoderDecoderFactory.create(applicationModule3, this.providesDefaultSharedPerefencesProvider));
        this.provideSecureCoderDecoderProvider = a36;
        Provider<SecurePreferences> a37 = C10823a.m36716a(ApplicationModule_ProvidesSecurePerefencesFactory.create(applicationModule3, this.providesDefaultSharedPerefencesProvider, a36));
        this.providesSecurePerefencesProvider = a37;
        this.provideLocalAdultContentProvider = C10823a.m36716a(FlavourApplicationModule_ProvideLocalAdultContentFactory.create(flavourApplicationModule, this.provideDefaultPreferencesProvider, a37));
        this.provideLongTimeoutOkHttpClientProvider = C10823a.m36716a(ApplicationModule_ProvideLongTimeoutOkHttpClientFactory.create(applicationModule3, this.provideUserAgentInterceptorProvider, this.providesDefaultSharedPerefencesProvider, this.provideRetrofitLogInterceptorProvider));
        this.provideNoAuthenticationBodyInterceptorV3Provider = C10823a.m36716a(C1076xcbc5ac1.create(applicationModule3, this.provideIdsRepositoryProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        Provider<String> a38 = C10823a.m36716a(ApplicationModule_ProvideExtraIDFactory.create(applicationModule));
        this.provideExtraIDProvider = a38;
        this.provideTokenInvalidatorProvider = C10823a.m36716a(ApplicationModule_ProvideTokenInvalidatorFactory.create(applicationModule, this.provideOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideAuthenticationPersistenceProvider, this.provideNoAuthenticationBodyInterceptorV3Provider, a38));
        this.provideBodyInterceptorWebV7Provider = C10823a.m36716a(ApplicationModule_ProvideBodyInterceptorWebV7Factory.create(applicationModule, this.provideAuthenticationPersistenceProvider, this.provideIdsRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.provideResourcesProvider, this.provideQManagerProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        Provider<RequestBodyFactory> a39 = C10823a.m36716a(ApplicationModule_ProvideRequestBodyFactoryFactory.create(applicationModule));
        this.provideRequestBodyFactoryProvider = a39;
        this.provideMultipartBodyInterceptorProvider = C10823a.m36716a(ApplicationModule_ProvideMultipartBodyInterceptorFactory.create(applicationModule3, this.provideIdsRepositoryProvider, this.provideAuthenticationPersistenceProvider, a39));
        Provider<NetworkOperatorManager> a40 = C10823a.m36716a(ApplicationModule_ProvidesNetworkOperatorManagerFactory.create(applicationModule3, this.providesTelephonyManagerProvider));
        this.providesNetworkOperatorManagerProvider = a40;
        this.providesBodyInterceptorV3Provider = C10823a.m36716a(ApplicationModule_ProvidesBodyInterceptorV3Factory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideQManagerProvider, this.providesDefaultSharedPerefencesProvider, a40, this.provideAuthenticationPersistenceProvider, this.provideAptoidePackageProvider, this.providesAptoideMd5ManagerProvider));
        this.provideAccountFactoryProvider = C10823a.m36716a(ApplicationModule_ProvideAccountFactoryFactory.create(applicationModule));
        this.provideOAuthModeProvider = C10823a.m36716a(ApplicationModule_ProvideOAuthModeProviderFactory.create(applicationModule));
        Provider<String> a41 = C10823a.m36716a(ApplicationModule_ProvidesBaseWebservicesHostFactory.create(applicationModule3, this.providesDefaultSharedPerefencesProvider));
        this.providesBaseWebservicesHostProvider = a41;
        Provider<AptoideAuthenticationRx> a42 = C10823a.m36716a(ApplicationModule_ProvidesAptoideAuthenticationFactory.create(applicationModule3, a41, this.provideOkHttpClientProvider));
        this.providesAptoideAuthenticationProvider = a42;
        this.provideAccountServiceProvider = C10823a.m36716a(ApplicationModule_ProvideAccountServiceFactory.create(applicationModule, this.provideOkHttpClientProvider, this.provideLongTimeoutOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideAuthenticationPersistenceProvider, this.provideTokenInvalidatorProvider, this.provideBodyInterceptorPoolV7Provider, this.provideBodyInterceptorWebV7Provider, this.provideMultipartBodyInterceptorProvider, this.provideNoAuthenticationBodyInterceptorV3Provider, this.providesBodyInterceptorV3Provider, this.provideNonNullObjectMapperProvider, this.providesConverterFactoryProvider, this.provideExtraIDProvider, this.provideAccountFactoryProvider, this.provideOAuthModeProvider, a42));
    }

    private void initialize2(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        ApplicationModule applicationModule2 = applicationModule;
        Provider<AdultContent> a = C10823a.m36716a(FlavourApplicationModule_ProvideAdultContentFactory.create(flavourApplicationModule, this.provideLocalAdultContentProvider, this.provideAccountServiceProvider));
        this.provideAdultContentProvider = a;
        this.provideAccountSettingsBodyInterceptorPoolV7Provider = C10823a.m36716a(C1075xe98d65dc.create(applicationModule2, this.provideBodyInterceptorPoolV7Provider, a));
        Provider<AppBundlesVisibilitySettingsProvider> a2 = C10823a.m36716a(C1078xe6960c5f.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesAppBundlesVisibilitySettingsProvider = a2;
        this.providesAppBundlesVisibilityManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory.create(applicationModule2, a2));
        Provider<UpdateMapper> a3 = C10823a.m36716a(ApplicationModule_ProvidesUpdateMapperFactory.create(applicationModule));
        this.providesUpdateMapperProvider = a3;
        this.providesUpdateRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvidesUpdateRepositoryFactory.create(applicationModule, this.providesUpdatePersistenceProvider, this.providesRoomStoreRepositoryProvider, this.provideIdsRepositoryProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesAppBundlesVisibilityManagerProvider, a3, this.provideInstalledRepositoryProvider));
        this.provideCacheHelperProvider = C10823a.m36716a(ApplicationModule_ProvideCacheHelperFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider, this.provideCachePathProvider));
        this.provideGoogleApiClientProvider = C10823a.m36716a(ApplicationModule_ProvideGoogleApiClientFactory.create(applicationModule));
        this.provideStoreManagerProvider = C10823a.m36716a(ApplicationModule_ProvideStoreManagerFactory.create(applicationModule, this.provideOkHttpClientProvider, this.provideMultipartBodyInterceptorProvider, this.providesBodyInterceptorV3Provider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideRequestBodyFactoryProvider, this.provideNonNullObjectMapperProvider, this.providesRoomStoreRepositoryProvider));
        this.provideLoginPreferencesProvider = C10823a.m36716a(FlavourApplicationModule_ProvideLoginPreferencesFactory.create(flavourApplicationModule));
        Provider<DatabaseStoreDataPersist> a4 = C10823a.m36716a(ApplicationModule_ProvidesDatabaseStoreDataPersistFactory.create(applicationModule2, this.providesRoomStoreRepositoryProvider));
        this.providesDatabaseStoreDataPersistProvider = a4;
        this.providesAccountPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvidesAccountPersistenceFactory.create(applicationModule, this.provideAccountManagerProvider, a4, this.provideAccountFactoryProvider, this.provideAndroidAccountProvider, this.provideAuthenticationPersistenceProvider));
        Provider<List<String>> a5 = C10823a.m36716a(ApplicationModule_ProvidesFacebookLoginPermissionsFactory.create(applicationModule));
        this.providesFacebookLoginPermissionsProvider = a5;
        this.provideAptoideAccountManagerProvider = C10823a.m36716a(ApplicationModule_ProvideAptoideAccountManagerFactory.create(applicationModule, this.provideAdultContentProvider, this.provideGoogleApiClientProvider, this.provideStoreManagerProvider, this.provideAccountServiceProvider, this.provideLoginPreferencesProvider, this.providesAccountPersistenceProvider, a5));
        this.provideRootAvailabilityManagerProvider = C10823a.m36716a(ApplicationModule_ProvideRootAvailabilityManagerFactory.create(applicationModule2, this.providesSecurePerefencesProvider));
        Provider<NotificationProvider> a6 = C10823a.m36716a(ApplicationModule_ProvideNotificationProviderFactory.create(applicationModule2, this.provideRoomNotificationPersistenceProvider));
        this.provideNotificationProvider = a6;
        Provider<RoomLocalNotificationSyncPersistence> a7 = C10823a.m36716a(C1081xc7529b2c.create(applicationModule2, this.providesAptoideDataBaseProvider, a6));
        this.providesRoomLocalNotificationSyncPersistenceProvider = a7;
        Provider<SyncStorage> a8 = C10823a.m36716a(ApplicationModule_ProvideSyncStorageFactory.create(applicationModule2, a7));
        this.provideSyncStorageProvider = a8;
        this.provideSyncSchedulerProvider = C10823a.m36716a(ApplicationModule_ProvideSyncSchedulerFactory.create(applicationModule2, a8));
        Provider<PackageRepository> a9 = C10823a.m36716a(ApplicationModule_ProvidesPackageRepositoryFactory.create(applicationModule));
        this.providesPackageRepositoryProvider = a9;
        this.providesAdsApplicationVersionCodeProvider = C10823a.m36716a(C1077x234ee129.create(applicationModule2, a9));
        Provider<OemidProvider> a10 = C10823a.m36716a(ApplicationModule_ProvidesOemidProviderFactory.create(applicationModule));
        this.providesOemidProvider = a10;
        this.provideAdsRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvideAdsRepositoryFactory.create(applicationModule, this.provideIdsRepositoryProvider, this.provideAptoideAccountManagerProvider, this.provideOkHttpClientProvider, this.provideQManagerProvider, this.providesDefaultSharedPerefencesProvider, this.providesAdsApplicationVersionCodeProvider, this.providesConnectivityManagerProvider, a10));
        this.providesNewFeatureProvider = C10823a.m36716a(ApplicationModule_ProvidesNewFeatureFactory.create(applicationModule));
        Provider<LocalNotificationSyncManager> a11 = C10823a.m36716a(ApplicationModule_ProvidesLocalNotificationSyncManagerFactory.create(applicationModule2, this.provideSyncSchedulerProvider, this.provideNotificationProvider));
        this.providesLocalNotificationSyncManagerProvider = a11;
        this.providesNewFeatureManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesNewFeatureManagerFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider, this.providesNewFeatureProvider, a11));
        Provider<RoomStoredMinimalAdPersistence> a12 = C10823a.m36716a(ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory.create(applicationModule2, this.providesAptoideDataBaseProvider));
        this.providesRoomStoreMinimalAdPersistenceProvider = a12;
        this.provideInstallationProvider = C10823a.m36716a(ApplicationModule_ProvideInstallationProviderFactory.create(applicationModule2, this.provideAptoideDownloadManagerProvider, this.provideDownloadPersistenceProvider, this.provideInstalledRepositoryProvider, a12));
        this.providesInstallerAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesInstallerAnalyticsFactory.create(applicationModule, this.providesAnalyticsManagerProvider, this.provideInstallAnalyticsProvider, this.providesDefaultSharedPerefencesProvider, this.provideRootAvailabilityManagerProvider, this.provideNavigationTrackerProvider));
        Provider<AppInstallerStatusReceiver> a13 = C10823a.m36716a(ApplicationModule_ProvidesAppInstallerStatusReceiverFactory.create(applicationModule));
        this.providesAppInstallerStatusReceiverProvider = a13;
        this.providesAppInstallerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppInstallerFactory.create(applicationModule2, a13));
        Provider<RootInstallerProvider> a14 = C10823a.m36716a(ApplicationModule_ProvidesRootInstallerProviderFactory.create(applicationModule2, this.providesInstallerAnalyticsProvider));
        this.providesRootInstallerProvider = a14;
        this.provideDefaultInstallerProvider = C10823a.m36716a(ApplicationModule_ProvideDefaultInstallerFactory.create(applicationModule, this.provideInstallationProvider, this.providesDefaultSharedPerefencesProvider, this.provideInstalledRepositoryProvider, this.provideRootAvailabilityManagerProvider, this.providesInstallerAnalyticsProvider, this.providesAppInstallerProvider, this.providesAppInstallerStatusReceiverProvider, a14));
        this.providesSecureSharedPreferencesProvider = C10823a.m36716a(ApplicationModule_ProvidesSecureSharedPreferencesFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesPackageInstallerManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesPackageInstallerManagerFactory.create(applicationModule));
        this.providesForegroundManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesForegroundManagerFactory.create(applicationModule));
        Provider<AptoideInstallPersistence> a15 = C10823a.m36716a(ApplicationModule_ProvidesAptoideInstallPersistenceFactory.create(applicationModule2, this.providesAptoideDataBaseProvider));
        this.providesAptoideInstallPersistenceProvider = a15;
        Provider<AptoideInstallRepository> a16 = C10823a.m36716a(ApplicationModule_ProvidesAptoideInstallRepositoryFactory.create(applicationModule2, a15));
        this.providesAptoideInstallRepositoryProvider = a16;
        this.providesAptoideInstallManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAptoideInstallManagerFactory.create(applicationModule2, this.provideInstalledRepositoryProvider, a16));
        this.providesInstallAppSizeValidatorProvider = C10823a.m36716a(ApplicationModule_ProvidesInstallAppSizeValidatorFactory.create(applicationModule2, this.filePathManagerProvider));
        Provider<FileManager> a17 = C10823a.m36716a(ApplicationModule_ProvidesFileManagerFactory.create(applicationModule2, this.provideCacheHelperProvider, this.provideCachePathProvider, this.provideAptoideDownloadManagerProvider, this.provideL2CacheProvider));
        this.providesFileManagerProvider = a17;
        Provider<InstallManager> a18 = C10823a.m36716a(ApplicationModule_ProvidesInstallManagerFactory.create(applicationModule, this.provideAptoideDownloadManagerProvider, this.provideDefaultInstallerProvider, this.provideRootAvailabilityManagerProvider, this.providesDefaultSharedPerefencesProvider, this.providesSecureSharedPreferencesProvider, this.provideDownloadsRepositoryProvider, this.provideInstalledRepositoryProvider, this.providesPackageInstallerManagerProvider, this.providesForegroundManagerProvider, this.providesAptoideInstallManagerProvider, this.providesInstallAppSizeValidatorProvider, a17));
        this.providesInstallManagerProvider = a18;
        this.providesReadyToInstallNotificationManagerProvider = C10823a.m36716a(C1080xa0c4ceda.create(applicationModule2, a18));
        this.providesThemeAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesThemeAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider));
        Provider<StoreCredentialsProvider> a19 = C10823a.m36716a(ApplicationModule_ProvidesStoreCredentialsProviderFactory.create(applicationModule2, this.providesRoomStoreRepositoryProvider));
        this.providesStoreCredentialsProvider = a19;
        this.provideStoreUtilsProxyProvider = C10823a.m36716a(ApplicationModule_ProvideStoreUtilsProxyFactory.create(applicationModule, this.provideAptoideAccountManagerProvider, this.providesRoomStoreRepositoryProvider, this.provideOkHttpClientProvider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, a19));
        Provider<TrendingService> a20 = C10823a.m36716a(ApplicationModule_ProvidesTrendingServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.providesConverterFactoryProvider, this.provideOkHttpClientProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.providesAppBundlesVisibilityManagerProvider));
        this.providesTrendingServiceProvider = a20;
        this.providesTrendingManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesTrendingManagerFactory.create(applicationModule2, a20));
        this.provideAdultContentAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvideAdultContentAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.provideNotificationAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvideNotificationAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        Provider<String> a21 = C10823a.m36716a(ApplicationModule_ProvideSearchBaseUrlFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.provideSearchBaseUrlProvider = a21;
        Provider<Retrofit> a22 = C10823a.m36716a(ApplicationModule_ProvidesSearchSuggestionsRetrofitFactory.create(applicationModule2, a21, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesSearchSuggestionsRetrofitProvider = a22;
        Provider<SearchSuggestionRemoteRepository> a23 = C10823a.m36716a(C1082xf5423e59.create(applicationModule2, a22));
        this.providesSearchSuggestionRemoteRepositoryProvider = a23;
        this.providesSearchSuggestionManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesSearchSuggestionManagerFactory.create(applicationModule2, a23));
        this.providesSafetyNetClientProvider = C10823a.m36716a(ApplicationModule_ProvidesSafetyNetClientFactory.create(applicationModule));
        Provider<GmsStatusValueProvider> a24 = C10823a.m36716a(ApplicationModule_ProvidesGmsStatusValueProviderFactory.create(applicationModule));
        this.providesGmsStatusValueProvider = a24;
        this.providesFirstLaunchAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesFirstLaunchAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.providesAnalyticsDebugLoggerProvider, this.providesSafetyNetClientProvider, a24));
        this.provideInvalidRefreshTokenLogoutManagerProvider = C10823a.m36716a(ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory.create(applicationModule2, this.provideAptoideAccountManagerProvider, this.provideTokenInvalidatorProvider));
        this.provideRootInstallationRetryHandlerProvider = C10823a.m36716a(ApplicationModule_ProvideRootInstallationRetryHandlerFactory.create(applicationModule2, this.providesInstallManagerProvider));
        this.providesShortcutManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesShortcutManagerFactory.create(applicationModule));
        this.providesSettingsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesSettingsManagerFactory.create(applicationModule));
        this.provideDefaultFollowedStoresProvider = C10823a.m36716a(ApplicationModule_ProvideDefaultFollowedStoresFactory.create(applicationModule));
        Provider<WalletAdsOfferManager> a25 = C10823a.m36716a(FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory.create(flavourApplicationModule));
        this.providesWalletAdsOfferManagerProvider = a25;
        this.providesMoPubAdsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesMoPubAdsManagerFactory.create(applicationModule2, a25));
        this.providesMoPubAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesMoPubAnalyticsFactory.create(applicationModule));
        Provider<CrashReport> a26 = C10823a.m36716a(ApplicationModule_ProvidesCrashReportsFactory.create(applicationModule));
        this.providesCrashReportsProvider = a26;
        this.providesMoPubAdsServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesMoPubAdsServiceFactory.create(applicationModule2, this.providesMoPubAdsManagerProvider, this.provideInstalledRepositoryProvider, this.providesMoPubAnalyticsProvider, a26));
        Provider<SplitsMapper> a27 = C10823a.m36716a(ApplicationModule_ProvidesSplitsMapperFactory.create(applicationModule));
        this.providesSplitsMapperProvider = a27;
        Provider<AppService> a28 = C10823a.m36716a(ApplicationModule_ProvidesAppServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, a27, this.providesAppBundlesVisibilityManagerProvider));
        this.providesAppServiceProvider = a28;
        Provider<AppCenterRepository> a29 = C10823a.m36716a(ApplicationModule_ProvidesAppCenterRepositoryFactory.create(applicationModule2, a28));
        this.providesAppCenterRepositoryProvider = a29;
        Provider<AppCenter> a30 = C10823a.m36716a(ApplicationModule_ProvidesAppCenterFactory.create(applicationModule2, a29));
        this.providesAppCenterProvider = a30;
        this.providesUpdatesNotificationWorkerFactoryProvider = C10823a.m36716a(C1083x444edd3e.create(applicationModule, this.providesUpdateRepositoryProvider, this.providesDefaultSharedPerefencesProvider, this.providesAptoideInstallManagerProvider, this.provideSyncSchedulerProvider, this.provideSyncStorageProvider, this.providesCrashReportsProvider, a30));
        Provider<FollowedStoresManager> a31 = C10823a.m36716a(ApplicationModule_ProvidesFollowedStoresManagerFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideDefaultFollowedStoresProvider, this.provideStoreUtilsProxyProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideAptoideAccountManagerProvider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider));
        this.providesFollowedStoresManagerProvider = a31;
        this.providesFirstLaunchManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesFirstLaunchManagerFactory.create(applicationModule, this.providesDefaultSharedPerefencesProvider, this.provideIdsRepositoryProvider, a31, this.provideRootAvailabilityManagerProvider, this.provideAptoideAccountManagerProvider, this.providesShortcutManagerProvider));
        Provider<UpdateLaunchManager> a32 = C10823a.m36716a(ApplicationModule_ProvidesUpdateLaunchManagerFactory.create(applicationModule2, this.providesFollowedStoresManagerProvider));
        this.providesUpdateLaunchManagerProvider = a32;
        this.providesLaunchManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesLaunchManagerFactory.create(applicationModule2, this.providesFirstLaunchManagerProvider, a32, this.providesSecureSharedPreferencesProvider));
        this.providesAppInBackgroundTrackerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppInBackgroundTrackerFactory.create(applicationModule));
        Provider<Interceptor> a33 = C10823a.m36716a(ApplicationModule_ProvideUserAgentInterceptorV8Factory.create(applicationModule2, this.provideIdsRepositoryProvider, this.provideAptoidePackageProvider, this.provideAuthenticationPersistenceProvider, this.providesAptoideMd5ManagerProvider));
        this.provideUserAgentInterceptorV8Provider = a33;
        Provider<OkHttpClient> a34 = C10823a.m36716a(ApplicationModule_ProvideV8OkHttpClientFactory.create(applicationModule2, this.providesOkHttpBuilderProvider, a33));
        this.provideV8OkHttpClientProvider = a34;
        Provider<Retrofit> a35 = C10823a.m36716a(ApplicationModule_ProvidesDonationsRetrofitFactory.create(applicationModule2, a34, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesDonationsRetrofitProvider = a35;
        Provider<DonationsService.ServiceV8> a36 = C10823a.m36716a(ApplicationModule_ProvidesDonationsServiceV8Factory.create(applicationModule2, a35));
        this.providesDonationsServiceV8Provider = a36;
        this.providesDonationsServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesDonationsServiceFactory.create(applicationModule2, a36));
        Provider<String> a37 = C10823a.m36716a(ApplicationModule_ProvidesApichainBdsBaseHostFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesApichainBdsBaseHostProvider = a37;
        Provider<Retrofit> a38 = C10823a.m36716a(ApplicationModule_ProvidesApiChainBDSRetrofitFactory.create(applicationModule2, this.provideV8OkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider, a37));
        this.providesApiChainBDSRetrofitProvider = a38;
        Provider<BonusAppcRemoteService.ServiceApi> a39 = C10823a.m36716a(ApplicationModule_ProvidesBonusAppcServiceApiFactory.create(applicationModule2, a38));
        this.providesBonusAppcServiceApiProvider = a39;
        Provider<BonusAppcService> a40 = C10823a.m36716a(ApplicationModule_ProvidesBonusAppcServiceFactory.create(applicationModule2, a39));
        this.providesBonusAppcServiceProvider = a40;
        this.providesAppCoinsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppCoinsManagerFactory.create(applicationModule2, this.providesDonationsServiceProvider, a40));
        this.providesCampaignAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesCampaignAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider));
        Provider<AppcMigrationPersistence> a41 = C10823a.m36716a(ApplicationModule_ProvidesAppcMigrationAccessorFactory.create(applicationModule2, this.providesAptoideDataBaseProvider));
        this.providesAppcMigrationAccessorProvider = a41;
        Provider<AppcMigrationRepository> a42 = C10823a.m36716a(ApplicationModule_ProvidesAppcMigrationServiceFactory.create(applicationModule2, a41));
        this.providesAppcMigrationServiceProvider = a42;
        this.providesAppcMigrationManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppcMigrationManagerFactory.create(applicationModule2, this.provideInstalledRepositoryProvider, a42));
        this.provideMarketNameProvider = C10823a.m36716a(ApplicationModule_ProvideMarketNameFactory.create(applicationModule));
        this.downloadApkPathsProvider = C10823a.m36716a(ApplicationModule_DownloadApkPathsProviderFactory.create(applicationModule2, this.providesOemidProvider));
        Provider<AppValidationAnalytics> a43 = C10823a.m36716a(ApplicationModule_ProvidesAppValidationAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppValidationAnalyticsProvider = a43;
        this.providesAppValidatorProvider = C10823a.m36716a(ApplicationModule_ProvidesAppValidatorFactory.create(applicationModule2, a43));
        Provider<SplitTypeSubFileTypeMapper> a44 = C10823a.m36716a(ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory.create(applicationModule));
        this.provideSplitTypeSubFileTypeMapperProvider = a44;
        this.provideDownloadFactoryProvider = C10823a.m36716a(ApplicationModule_ProvideDownloadFactoryFactory.create(applicationModule, this.provideMarketNameProvider, this.downloadApkPathsProvider, this.provideCachePathProvider, this.providesAppValidatorProvider, a44));
        this.provideFragmentNavigatorMapProvider = C10823a.m36716a(ApplicationModule_ProvideFragmentNavigatorMapFactory.create(applicationModule));
        this.provideFragmentNavigatorRelayProvider = C10823a.m36716a(ApplicationModule_ProvideFragmentNavigatorRelayFactory.create(applicationModule));
        this.provideCallbackManagerProvider = C10823a.m36716a(ApplicationModule_ProvideCallbackManagerFactory.create(applicationModule));
    }

    private void initialize3(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        ApplicationModule applicationModule2 = applicationModule;
        this.provideAccountAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvideAccountAnalyticsFactory.create(applicationModule2, this.provideNavigationTrackerProvider, this.providesAnalyticsManagerProvider));
        this.providesSearchAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesSearchAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.provideDeepLinkAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvideDeepLinkAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppShortcutsAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesAppShortcutsAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesStoreAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesStoreAnalyticsFactory.create(applicationModule2, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesUpdatesManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesUpdatesManagerFactory.create(applicationModule2, this.providesUpdateRepositoryProvider));
        this.providePermissionManagerProvider = C10823a.m36716a(ApplicationModule_ProvidePermissionManagerFactory.create(applicationModule));
        this.providesAutoUpdateServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesAutoUpdateServiceFactory.create(applicationModule2, this.providesV7RetrofitProvider));
        this.providesAgentPersistenceProvider = C10823a.m36716a(ApplicationModule_ProvidesAgentPersistenceFactory.create(applicationModule2, this.providesSecureSharedPreferencesProvider));
        this.provideMarketResourceFormatterProvider = C10823a.m36716a(ApplicationModule_ProvideMarketResourceFormatterFactory.create(applicationModule2, this.provideMarketNameProvider));
        this.providesDownloadStateParserProvider = C10823a.m36716a(ApplicationModule_ProvidesDownloadStateParserFactory.create(applicationModule));
        this.splitAnalyticsMapperProvider = C10823a.m36716a(ApplicationModule_SplitAnalyticsMapperFactory.create(applicationModule));
        this.providesWalletAppProvider = C10823a.m36716a(ApplicationModule_ProvidesWalletAppProviderFactory.create(applicationModule2, this.providesAppCenterProvider, this.provideInstalledRepositoryProvider, this.providesInstallManagerProvider, this.providesDownloadStateParserProvider));
        this.providesDynamicSplitsApiProvider = C10823a.m36716a(ApplicationModule_ProvidesDynamicSplitsApiFactory.create(applicationModule2, this.providesV7RetrofitProvider));
        Provider<DynamicSplitsMapper> a = C10823a.m36716a(ApplicationModule_ProvidesDynamicSplitsMapperFactory.create(applicationModule));
        this.providesDynamicSplitsMapperProvider = a;
        Provider<DynamicSplitsService> a2 = C10823a.m36716a(ApplicationModule_ProvidesDynamicSplitsServiceFactory.create(applicationModule2, this.providesDynamicSplitsApiProvider, a));
        this.providesDynamicSplitsServiceProvider = a2;
        this.providesDynamicSplitsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesDynamicSplitsManagerFactory.create(applicationModule2, a2));
        Provider<String> a3 = C10823a.m36716a(ApplicationModule_ProvidesBaseSecondaryHostFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesBaseSecondaryHostProvider = a3;
        Provider<Retrofit> a4 = C10823a.m36716a(ApplicationModule_ProvidesV7SecondaryRetrofitFactory.create(applicationModule2, this.provideOkHttpClientProvider, a3, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesV7SecondaryRetrofitProvider = a4;
        Provider<WalletService.ServiceV7> a5 = C10823a.m36716a(ApplicationModule_ProvidesWalletServiceV8Factory.create(applicationModule2, a4));
        this.providesWalletServiceV8Provider = a5;
        this.providesWalletServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesWalletServiceFactory.create(applicationModule2, a5));
        Provider<String> a6 = C10823a.m36716a(FlavourApplicationModule_ProvidesSupportEmailFactory.create(flavourApplicationModule));
        this.providesSupportEmailProvider = a6;
        this.providesSupportEmailProvider2 = C10823a.m36716a(ApplicationModule_ProvidesSupportEmailProviderFactory.create(applicationModule2, a6));
        this.providesImageInfoProvider = C10823a.m36716a(ApplicationModule_ProvidesImageInfoProviderFactory.create(applicationModule));
        this.providesNewsletterManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesNewsletterManagerFactory.create(applicationModule));
        this.providesSearchRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvidesSearchRepositoryFactory.create(applicationModule, this.providesRoomStoreRepositoryProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.providesDefaultSharedPerefencesProvider, this.provideTokenInvalidatorProvider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesAppBundlesVisibilityManagerProvider, this.providesOemidProvider));
        this.providesDownloadStatusManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesDownloadStatusManagerFactory.create(applicationModule2, this.providesInstallManagerProvider, this.providesAppcMigrationManagerProvider));
        this.providesLoginSignupManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesLoginSignupManagerFactory.create(applicationModule));
        Provider<BlacklistPersistence> a7 = C10823a.m36716a(ApplicationModule_ProvidesBlacklistPersistenceFactory.create(applicationModule2, this.providesDefaultSharedPerefencesProvider));
        this.providesBlacklistPersistenceProvider = a7;
        this.providesBlacklisterProvider = C10823a.m36716a(ApplicationModule_ProvidesBlacklisterFactory.create(applicationModule2, a7));
        Provider<BlacklistUnitMapper> a8 = C10823a.m36716a(ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory.create(applicationModule));
        this.providesBundleToBlacklistUnitMapperProvider = a8;
        Provider<BlacklistManager> a9 = C10823a.m36716a(ApplicationModule_ProvidesBlacklistManagerFactory.create(applicationModule2, this.providesBlacklisterProvider, a8));
        this.providesBlacklistManagerProvider = a9;
        this.providesWalletAdsOfferCardManagerProvider = C10823a.m36716a(C1085x7d1c8138.create(flavourApplicationModule, a9, this.providesPackageRepositoryProvider));
        Provider<AppComingSoonRegistrationPersistence> a10 = C10823a.m36716a(C1079xde208b8c.create(applicationModule2, this.providesAptoideDataBaseProvider));
        this.providesAppComingSoonRegistrationPersistenceProvider = a10;
        Provider<AppComingSoonRegistrationManager> a11 = C10823a.m36716a(ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory.create(applicationModule2, a10));
        this.providesAppComingSoonPreferencesManagerProvider = a11;
        Provider<BundlesResponseMapper> a12 = C10823a.m36716a(ApplicationModule_ProvidesBundlesMapperFactory.create(applicationModule, this.providesInstallManagerProvider, this.providesWalletAdsOfferCardManagerProvider, this.providesBlacklistManagerProvider, this.providesDownloadStateParserProvider, a11));
        this.providesBundlesMapperProvider = a12;
        ApplicationModule applicationModule3 = applicationModule2;
        Provider<BundleDataSource> a13 = C10823a.m36716a(ApplicationModule_ProvidesRemoteBundleDataSourceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, a12, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.provideAptoideAccountManagerProvider, this.providesPackageRepositoryProvider, this.provideIdsRepositoryProvider, this.provideQManagerProvider, this.provideResourcesProvider, this.provideWindowManagerProvider, this.providesConnectivityManagerProvider, this.providesAdsApplicationVersionCodeProvider, this.providesOemidProvider, this.providesAppBundlesVisibilityManagerProvider, this.providesStoreCredentialsProvider, this.providesAppCoinsManagerProvider));
        this.providesRemoteBundleDataSourceProvider = a13;
        this.providesBundleRepositoryProvider = C10823a.m36716a(ApplicationModule_ProvidesBundleRepositoryFactory.create(applicationModule3, a13));
        this.providesPromotionViewAppMapperProvider = C10823a.m36716a(ApplicationModule_ProvidesPromotionViewAppMapperFactory.create(applicationModule3, this.providesDownloadStateParserProvider));
        this.providesPromotionsAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesPromotionsAnalyticsFactory.create(applicationModule3, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesDownloadAnalyticsProvider, this.provideInstallAnalyticsProvider));
        Provider<PromotionsService> a14 = C10823a.m36716a(ApplicationModule_ProvidesPromotionsServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesConverterFactoryProvider, this.providesDefaultSharedPerefencesProvider, this.providesSplitsMapperProvider, this.providesAppBundlesVisibilityManagerProvider));
        this.providesPromotionsServiceProvider = a14;
        this.providePromotionsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidePromotionsManagerFactory.create(applicationModule, this.providesInstallManagerProvider, this.providesPromotionViewAppMapperProvider, this.provideDownloadFactoryProvider, this.providesDownloadStateParserProvider, this.providesPromotionsAnalyticsProvider, this.provideNotificationAnalyticsProvider, this.provideInstallAnalyticsProvider, a14, this.provideInstalledRepositoryProvider, this.providesMoPubAdsManagerProvider, this.providesWalletAppProvider, this.providesDynamicSplitsManagerProvider, this.splitAnalyticsMapperProvider));
        ApplicationModule applicationModule4 = applicationModule;
        this.providesPromotionsPreferencesManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesPromotionsPreferencesManagerFactory.create(applicationModule4, this.providesUserPreferencesPersisterProvider));
        this.provideHomePromotionsIdProvider = C10823a.m36716a(ApplicationModule_ProvideHomePromotionsIdFactory.create(applicationModule));
        Provider<String> a15 = C10823a.m36716a(ApplicationModule_ProvidesReactionsHostFactory.create(applicationModule));
        this.providesReactionsHostProvider = a15;
        Provider<Retrofit> a16 = C10823a.m36716a(ApplicationModule_ProvidesLoadTopReactionsRetrofitFactory.create(applicationModule4, a15, this.provideV8OkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesLoadTopReactionsRetrofitProvider = a16;
        Provider<ReactionsRemoteService.ServiceV8> a17 = C10823a.m36716a(ApplicationModule_ProvidesReactionsServiceV8Factory.create(applicationModule4, a16));
        this.providesReactionsServiceV8Provider = a17;
        Provider<ReactionsService> a18 = C10823a.m36716a(ApplicationModule_ProvidesReactionsServiceFactory.create(applicationModule4, a17));
        this.providesReactionsServiceProvider = a18;
        this.providesReactionsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesReactionsManagerFactory.create(applicationModule4, a18));
        this.providesComingSoonNotificationManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesComingSoonNotificationManagerFactory.create(applicationModule4, this.providesAppComingSoonPreferencesManagerProvider));
        this.providesAdMapperProvider = C10823a.m36716a(ApplicationModule_ProvidesAdMapperFactory.create(applicationModule));
        this.providesUserFeedbackAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesUserFeedbackAnalyticsFactory.create(applicationModule4, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesCaptionBackgroundPainterProvider = C10823a.m36716a(ApplicationModule_ProvidesCaptionBackgroundPainterFactory.create(applicationModule));
        this.providesUpdatesAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesUpdatesAnalyticsFactory.create(applicationModule4, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.provideInstallAnalyticsProvider));
        this.providesUpdatesNotificationManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesUpdatesNotificationManagerFactory.create(applicationModule));
        this.providesMyAccountManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesMyAccountManagerFactory.create(applicationModule));
        this.providesSocialMediaAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesSocialMediaAnalyticsFactory.create(applicationModule4, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider));
        this.providesAppViewAnalyticsProvider = C10823a.m36716a(ApplicationModule_ProvidesAppViewAnalyticsFactory.create(applicationModule, this.providesDownloadAnalyticsProvider, this.providesAnalyticsManagerProvider, this.provideNavigationTrackerProvider, this.providesStoreAnalyticsProvider, this.provideInstallAnalyticsProvider));
        Provider<AppCoinsService> a19 = C10823a.m36716a(ApplicationModule_ProvidesAppCoinsServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesConverterFactoryProvider, this.providesAppBundlesVisibilityManagerProvider));
        this.providesAppCoinsServiceProvider = a19;
        this.providesAppCoinsAdvertisingManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory.create(applicationModule4, a19));
        Provider<ReviewsService> a20 = C10823a.m36716a(ApplicationModule_ProvidesReviewsServiceFactory.create(applicationModule, this.providesStoreCredentialsProvider, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider));
        this.providesReviewsServiceProvider = a20;
        Provider<ReviewsRepository> a21 = C10823a.m36716a(ApplicationModule_ProvidesReviewsRepositoryFactory.create(applicationModule4, a20));
        this.providesReviewsRepositoryProvider = a21;
        this.providesReviewsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesReviewsManagerFactory.create(applicationModule4, a21));
        this.providesAdsManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAdsManagerFactory.create(applicationModule4, this.provideAdsRepositoryProvider, this.providesRoomStoreMinimalAdPersistenceProvider));
        Provider<String> a22 = C10823a.m36716a(ApplicationModule_ProvidesAppsFlyerBaseUrlFactory.create(applicationModule));
        this.providesAppsFlyerBaseUrlProvider = a22;
        Provider<Retrofit> a23 = C10823a.m36716a(ApplicationModule_ProvidesAppsFlyerRetrofitFactory.create(applicationModule4, a22, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.providesCallAdapterFactoryProvider));
        this.providesAppsFlyerRetrofitProvider = a23;
        Provider<AppsFlyerService> a24 = C10823a.m36716a(ApplicationModule_ProvidesAppsFlyerServiceFactory.create(applicationModule4, a23));
        this.providesAppsFlyerServiceProvider = a24;
        Provider<AppsFlyerRepository> a25 = C10823a.m36716a(ApplicationModule_ProvidesAppsFlyerRepositoryFactory.create(applicationModule4, a24));
        this.providesAppsFlyerRepositoryProvider = a25;
        this.providesAppsFlyerManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesAppsFlyerManagerFactory.create(applicationModule4, a25));
        this.providesDecimalFormatProvider = C10823a.m36716a(ApplicationModule_ProvidesDecimalFormatFactory.create(applicationModule));
        this.providesChipManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesChipManagerFactory.create(applicationModule));
        this.providesEditorialServiceProvider = C10823a.m36716a(ApplicationModule_ProvidesEditorialServiceFactory.create(applicationModule, this.provideAccountSettingsBodyInterceptorPoolV7Provider, this.provideOkHttpClientProvider, this.providesConverterFactoryProvider, this.provideTokenInvalidatorProvider, this.providesDefaultSharedPerefencesProvider, this.providesSplitsMapperProvider));
        this.providesEskillPreferencesManagerProvider = C10823a.m36716a(ApplicationModule_ProvidesEskillPreferencesManagerFactory.create(applicationModule4, this.providesUserPreferencesPersisterProvider));
    }

    private AptoideApplication injectAptoideApplication(AptoideApplication aptoideApplication) {
        AptoideApplication_MembersInjector.injectAptoideDatabase(aptoideApplication, this.providesAptoideDataBaseProvider.get());
        AptoideApplication_MembersInjector.injectNotificationPersistence(aptoideApplication, this.provideRoomNotificationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAptoideInstalledAppsRepository(aptoideApplication, this.provideInstalledRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectRakamBaseHost(aptoideApplication, this.providesBaseRakamHostProvider.get());
        AptoideApplication_MembersInjector.injectAptoideDownloadManager(aptoideApplication, this.provideAptoideDownloadManagerProvider.get());
        AptoideApplication_MembersInjector.injectUpdateRepository(aptoideApplication, this.providesUpdateRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectCacheHelper(aptoideApplication, this.provideCacheHelperProvider.get());
        AptoideApplication_MembersInjector.injectAccountManager(aptoideApplication, this.provideAptoideAccountManagerProvider.get());
        AptoideApplication_MembersInjector.injectPreferences(aptoideApplication, this.provideDefaultPreferencesProvider.get());
        AptoideApplication_MembersInjector.injectSecurePreferences(aptoideApplication, this.providesSecurePerefencesProvider.get());
        AptoideApplication_MembersInjector.injectAdultContent(aptoideApplication, this.provideAdultContentProvider.get());
        AptoideApplication_MembersInjector.injectIdsRepository(aptoideApplication, this.provideIdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectDefaultClient(aptoideApplication, this.provideOkHttpClientProvider.get());
        AptoideApplication_MembersInjector.injectRootAvailabilityManager(aptoideApplication, this.provideRootAvailabilityManagerProvider.get());
        AptoideApplication_MembersInjector.injectAuthenticationPersistence(aptoideApplication, this.provideAuthenticationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAlarmSyncScheduler(aptoideApplication, this.provideSyncSchedulerProvider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorPoolV7(aptoideApplication, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorWebV7(aptoideApplication, this.provideBodyInterceptorWebV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorV3(aptoideApplication, this.providesBodyInterceptorV3Provider.get());
        AptoideApplication_MembersInjector.injectHttpClientCache(aptoideApplication, this.provideL2CacheProvider.get());
        AptoideApplication_MembersInjector.injectQManager(aptoideApplication, this.provideQManagerProvider.get());
        AptoideApplication_MembersInjector.injectTokenInvalidator(aptoideApplication, this.provideTokenInvalidatorProvider.get());
        AptoideApplication_MembersInjector.injectPackageRepository(aptoideApplication, this.providesPackageRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectApplicationVersionCodeProvider(aptoideApplication, this.providesAdsApplicationVersionCodeProvider.get());
        AptoideApplication_MembersInjector.injectAdsRepository(aptoideApplication, this.provideAdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectSyncStorage(aptoideApplication, this.provideSyncStorageProvider.get());
        AptoideApplication_MembersInjector.injectNavigationTracker(aptoideApplication, this.provideNavigationTrackerProvider.get());
        AptoideApplication_MembersInjector.injectNewFeature(aptoideApplication, this.providesNewFeatureProvider.get());
        AptoideApplication_MembersInjector.injectNewFeatureManager(aptoideApplication, this.providesNewFeatureManagerProvider.get());
        AptoideApplication_MembersInjector.injectReadyToInstallNotificationManager(aptoideApplication, this.providesReadyToInstallNotificationManagerProvider.get());
        AptoideApplication_MembersInjector.injectThemeAnalytics(aptoideApplication, this.providesThemeAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectAccountSettingsBodyInterceptorPoolV7(aptoideApplication, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectStoreCredentials(aptoideApplication, this.providesStoreCredentialsProvider.get());
        AptoideApplication_MembersInjector.injectStoreUtilsProxy(aptoideApplication, this.provideStoreUtilsProxyProvider.get());
        AptoideApplication_MembersInjector.injectTrendingManager(aptoideApplication, this.providesTrendingManagerProvider.get());
        AptoideApplication_MembersInjector.injectAdultContentAnalytics(aptoideApplication, this.provideAdultContentAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectNotificationAnalytics(aptoideApplication, this.provideNotificationAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectSearchSuggestionManager(aptoideApplication, this.providesSearchSuggestionManagerProvider.get());
        AptoideApplication_MembersInjector.injectAnalyticsManager(aptoideApplication, this.providesAnalyticsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirstLaunchAnalytics(aptoideApplication, this.providesFirstLaunchAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectInvalidRefreshTokenLogoutManager(aptoideApplication, this.provideInvalidRefreshTokenLogoutManagerProvider.get());
        AptoideApplication_MembersInjector.injectRootInstallationRetryHandler(aptoideApplication, this.provideRootInstallationRetryHandlerProvider.get());
        AptoideApplication_MembersInjector.injectShortcutManager(aptoideApplication, this.providesShortcutManagerProvider.get());
        AptoideApplication_MembersInjector.injectSettingsManager(aptoideApplication, this.providesSettingsManagerProvider.get());
        AptoideApplication_MembersInjector.injectInstallManager(aptoideApplication, this.providesInstallManagerProvider.get());
        AptoideApplication_MembersInjector.injectDefaultFollowedStores(aptoideApplication, this.provideDefaultFollowedStoresProvider.get());
        AptoideApplication_MembersInjector.injectAdsUserPropertyManager(aptoideApplication, this.providesMoPubAdsServiceProvider.get());
        AptoideApplication_MembersInjector.injectOemidProvider(aptoideApplication, this.providesOemidProvider.get());
        AptoideApplication_MembersInjector.injectAptoideMd5Manager(aptoideApplication, this.providesAptoideMd5ManagerProvider.get());
        AptoideApplication_MembersInjector.injectAptoideWorkerFactory(aptoideApplication, this.providesUpdatesNotificationWorkerFactoryProvider.get());
        AptoideApplication_MembersInjector.injectLaunchManager(aptoideApplication, this.providesLaunchManagerProvider.get());
        AptoideApplication_MembersInjector.injectAppInBackgroundTracker(aptoideApplication, this.providesAppInBackgroundTrackerProvider.get());
        AptoideApplication_MembersInjector.injectAppCoinsManager(aptoideApplication, this.providesAppCoinsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFileManager(aptoideApplication, this.providesFileManagerProvider.get());
        return aptoideApplication;
    }

    private DownloadService injectDownloadService(DownloadService downloadService) {
        DownloadService_MembersInjector.injectDownloadManager(downloadService, this.provideAptoideDownloadManagerProvider.get());
        DownloadService_MembersInjector.injectAppInBackgroundTracker(downloadService, this.providesAppInBackgroundTrackerProvider.get());
        DownloadService_MembersInjector.injectNotificationProvider(downloadService, this.provideNotificationProvider.get());
        return downloadService;
    }

    private InstalledIntentService injectInstalledIntentService(InstalledIntentService installedIntentService) {
        InstalledIntentService_MembersInjector.injectInstallAnalytics(installedIntentService, this.provideInstallAnalyticsProvider.get());
        InstalledIntentService_MembersInjector.injectCampaignAnalytics(installedIntentService, this.providesCampaignAnalyticsProvider.get());
        InstalledIntentService_MembersInjector.injectAppcMigrationManager(installedIntentService, this.providesAppcMigrationManagerProvider.get());
        InstalledIntentService_MembersInjector.injectRoomStoredMinimalAdPersistence(installedIntentService, this.providesRoomStoreMinimalAdPersistenceProvider.get());
        InstalledIntentService_MembersInjector.injectUpdatesRepository(installedIntentService, this.providesUpdateRepositoryProvider.get());
        InstalledIntentService_MembersInjector.injectAptoideInstallManager(installedIntentService, this.providesAptoideInstallManagerProvider.get());
        InstalledIntentService_MembersInjector.injectFileUtils(installedIntentService, this.provideFileUtilsProvider.get());
        return installedIntentService;
    }

    private NotificationApplicationView injectNotificationApplicationView(NotificationApplicationView notificationApplicationView) {
        AptoideApplication_MembersInjector.injectAptoideDatabase(notificationApplicationView, this.providesAptoideDataBaseProvider.get());
        AptoideApplication_MembersInjector.injectNotificationPersistence(notificationApplicationView, this.provideRoomNotificationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAptoideInstalledAppsRepository(notificationApplicationView, this.provideInstalledRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectRakamBaseHost(notificationApplicationView, this.providesBaseRakamHostProvider.get());
        AptoideApplication_MembersInjector.injectAptoideDownloadManager(notificationApplicationView, this.provideAptoideDownloadManagerProvider.get());
        AptoideApplication_MembersInjector.injectUpdateRepository(notificationApplicationView, this.providesUpdateRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectCacheHelper(notificationApplicationView, this.provideCacheHelperProvider.get());
        AptoideApplication_MembersInjector.injectAccountManager(notificationApplicationView, this.provideAptoideAccountManagerProvider.get());
        AptoideApplication_MembersInjector.injectPreferences(notificationApplicationView, this.provideDefaultPreferencesProvider.get());
        AptoideApplication_MembersInjector.injectSecurePreferences(notificationApplicationView, this.providesSecurePerefencesProvider.get());
        AptoideApplication_MembersInjector.injectAdultContent(notificationApplicationView, this.provideAdultContentProvider.get());
        AptoideApplication_MembersInjector.injectIdsRepository(notificationApplicationView, this.provideIdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectDefaultClient(notificationApplicationView, this.provideOkHttpClientProvider.get());
        AptoideApplication_MembersInjector.injectRootAvailabilityManager(notificationApplicationView, this.provideRootAvailabilityManagerProvider.get());
        AptoideApplication_MembersInjector.injectAuthenticationPersistence(notificationApplicationView, this.provideAuthenticationPersistenceProvider.get());
        AptoideApplication_MembersInjector.injectAlarmSyncScheduler(notificationApplicationView, this.provideSyncSchedulerProvider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorPoolV7(notificationApplicationView, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorWebV7(notificationApplicationView, this.provideBodyInterceptorWebV7Provider.get());
        AptoideApplication_MembersInjector.injectBodyInterceptorV3(notificationApplicationView, this.providesBodyInterceptorV3Provider.get());
        AptoideApplication_MembersInjector.injectHttpClientCache(notificationApplicationView, this.provideL2CacheProvider.get());
        AptoideApplication_MembersInjector.injectQManager(notificationApplicationView, this.provideQManagerProvider.get());
        AptoideApplication_MembersInjector.injectTokenInvalidator(notificationApplicationView, this.provideTokenInvalidatorProvider.get());
        AptoideApplication_MembersInjector.injectPackageRepository(notificationApplicationView, this.providesPackageRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectApplicationVersionCodeProvider(notificationApplicationView, this.providesAdsApplicationVersionCodeProvider.get());
        AptoideApplication_MembersInjector.injectAdsRepository(notificationApplicationView, this.provideAdsRepositoryProvider.get());
        AptoideApplication_MembersInjector.injectSyncStorage(notificationApplicationView, this.provideSyncStorageProvider.get());
        AptoideApplication_MembersInjector.injectNavigationTracker(notificationApplicationView, this.provideNavigationTrackerProvider.get());
        AptoideApplication_MembersInjector.injectNewFeature(notificationApplicationView, this.providesNewFeatureProvider.get());
        AptoideApplication_MembersInjector.injectNewFeatureManager(notificationApplicationView, this.providesNewFeatureManagerProvider.get());
        AptoideApplication_MembersInjector.injectReadyToInstallNotificationManager(notificationApplicationView, this.providesReadyToInstallNotificationManagerProvider.get());
        AptoideApplication_MembersInjector.injectThemeAnalytics(notificationApplicationView, this.providesThemeAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectAccountSettingsBodyInterceptorPoolV7(notificationApplicationView, this.provideAccountSettingsBodyInterceptorPoolV7Provider.get());
        AptoideApplication_MembersInjector.injectStoreCredentials(notificationApplicationView, this.providesStoreCredentialsProvider.get());
        AptoideApplication_MembersInjector.injectStoreUtilsProxy(notificationApplicationView, this.provideStoreUtilsProxyProvider.get());
        AptoideApplication_MembersInjector.injectTrendingManager(notificationApplicationView, this.providesTrendingManagerProvider.get());
        AptoideApplication_MembersInjector.injectAdultContentAnalytics(notificationApplicationView, this.provideAdultContentAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectNotificationAnalytics(notificationApplicationView, this.provideNotificationAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectSearchSuggestionManager(notificationApplicationView, this.providesSearchSuggestionManagerProvider.get());
        AptoideApplication_MembersInjector.injectAnalyticsManager(notificationApplicationView, this.providesAnalyticsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFirstLaunchAnalytics(notificationApplicationView, this.providesFirstLaunchAnalyticsProvider.get());
        AptoideApplication_MembersInjector.injectInvalidRefreshTokenLogoutManager(notificationApplicationView, this.provideInvalidRefreshTokenLogoutManagerProvider.get());
        AptoideApplication_MembersInjector.injectRootInstallationRetryHandler(notificationApplicationView, this.provideRootInstallationRetryHandlerProvider.get());
        AptoideApplication_MembersInjector.injectShortcutManager(notificationApplicationView, this.providesShortcutManagerProvider.get());
        AptoideApplication_MembersInjector.injectSettingsManager(notificationApplicationView, this.providesSettingsManagerProvider.get());
        AptoideApplication_MembersInjector.injectInstallManager(notificationApplicationView, this.providesInstallManagerProvider.get());
        AptoideApplication_MembersInjector.injectDefaultFollowedStores(notificationApplicationView, this.provideDefaultFollowedStoresProvider.get());
        AptoideApplication_MembersInjector.injectAdsUserPropertyManager(notificationApplicationView, this.providesMoPubAdsServiceProvider.get());
        AptoideApplication_MembersInjector.injectOemidProvider(notificationApplicationView, this.providesOemidProvider.get());
        AptoideApplication_MembersInjector.injectAptoideMd5Manager(notificationApplicationView, this.providesAptoideMd5ManagerProvider.get());
        AptoideApplication_MembersInjector.injectAptoideWorkerFactory(notificationApplicationView, this.providesUpdatesNotificationWorkerFactoryProvider.get());
        AptoideApplication_MembersInjector.injectLaunchManager(notificationApplicationView, this.providesLaunchManagerProvider.get());
        AptoideApplication_MembersInjector.injectAppInBackgroundTracker(notificationApplicationView, this.providesAppInBackgroundTrackerProvider.get());
        AptoideApplication_MembersInjector.injectAppCoinsManager(notificationApplicationView, this.providesAppCoinsManagerProvider.get());
        AptoideApplication_MembersInjector.injectFileManager(notificationApplicationView, this.providesFileManagerProvider.get());
        return notificationApplicationView;
    }

    private PullingContentService injectPullingContentService(PullingContentService pullingContentService) {
        PullingContentService_MembersInjector.injectMarketName(pullingContentService, this.provideMarketNameProvider.get());
        PullingContentService_MembersInjector.injectDownloadFactory(pullingContentService, this.provideDownloadFactoryProvider.get());
        PullingContentService_MembersInjector.injectUpdateRepository(pullingContentService, this.providesUpdateRepositoryProvider.get());
        return pullingContentService;
    }

    private ToolboxContentProvider injectToolboxContentProvider(ToolboxContentProvider toolboxContentProvider) {
        ToolboxContentProvider_MembersInjector.injectAuthenticationPersistence(toolboxContentProvider, this.provideAuthenticationPersistenceProvider.get());
        ToolboxContentProvider_MembersInjector.injectSharedPreferences(toolboxContentProvider, this.providesDefaultSharedPerefencesProvider.get());
        ToolboxContentProvider_MembersInjector.injectAccountManager(toolboxContentProvider, this.provideAptoideAccountManagerProvider.get());
        return toolboxContentProvider;
    }

    public void inject(AptoideApplication aptoideApplication) {
        injectAptoideApplication(aptoideApplication);
    }

    public ActivityComponent plus(ActivityModule activityModule, FlavourActivityModule flavourActivityModule) {
        C10825c.m36717a(activityModule);
        C10825c.m36717a(flavourActivityModule);
        return new ActivityComponentImpl(activityModule, flavourActivityModule);
    }

    private DaggerApplicationComponent(ApplicationModule applicationModule, FlavourApplicationModule flavourApplicationModule) {
        initialize(applicationModule, flavourApplicationModule);
        initialize2(applicationModule, flavourApplicationModule);
        initialize3(applicationModule, flavourApplicationModule);
    }

    public void inject(NotificationApplicationView notificationApplicationView) {
        injectNotificationApplicationView(notificationApplicationView);
    }

    public void inject(ToolboxContentProvider toolboxContentProvider) {
        injectToolboxContentProvider(toolboxContentProvider);
    }

    public void inject(DownloadService downloadService) {
        injectDownloadService(downloadService);
    }

    public void inject(InstalledIntentService installedIntentService) {
        injectInstalledIntentService(installedIntentService);
    }

    public void inject(PullingContentService pullingContentService) {
        injectPullingContentService(pullingContentService);
    }
}
