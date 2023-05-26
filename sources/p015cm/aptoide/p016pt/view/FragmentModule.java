package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import org.parceler.C12420e;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.ErrorsMapper;
import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.ImageInfoProvider;
import p015cm.aptoide.p016pt.account.view.ImagePickerNavigator;
import p015cm.aptoide.p016pt.account.view.ImagePickerPresenter;
import p015cm.aptoide.p016pt.account.view.ImagePickerView;
import p015cm.aptoide.p016pt.account.view.ImageValidator;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsFragment;
import p015cm.aptoide.p016pt.account.view.PhotoFileGenerator;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailPresenter;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailView;
import p015cm.aptoide.p016pt.account.view.magiclink.MagicLinkView;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkNavigator;
import p015cm.aptoide.p016pt.account.view.magiclink.SendMagicLinkPresenter;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreNavigator;
import p015cm.aptoide.p016pt.account.view.store.ManageStorePresenter;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreView;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p015cm.aptoide.p016pt.account.view.user.CreateUserErrorMapper;
import p015cm.aptoide.p016pt.account.view.user.ManageUserNavigator;
import p015cm.aptoide.p016pt.account.view.user.ManageUserPresenter;
import p015cm.aptoide.p016pt.account.view.user.ManageUserView;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.AdsManager;
import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingManager;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.AppViewManager;
import p015cm.aptoide.p016pt.app.AppViewModelManager;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.FlagManager;
import p015cm.aptoide.p016pt.app.FlagService;
import p015cm.aptoide.p016pt.app.ReviewsManager;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerManager;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoView;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.AppViewNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewPresenter;
import p015cm.aptoide.p016pt.app.view.AppViewView;
import p015cm.aptoide.p016pt.app.view.MoreBundleManager;
import p015cm.aptoide.p016pt.app.view.MoreBundlePresenter;
import p015cm.aptoide.p016pt.app.view.MoreBundleView;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogFragment;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogPresenter;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.download.view.DownloadDialogProvider;
import p015cm.aptoide.p016pt.download.view.DownloadNavigator;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceManager;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigator;
import p015cm.aptoide.p016pt.editorial.CardId;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.editorial.EditorialManager;
import p015cm.aptoide.p016pt.editorial.EditorialNavigator;
import p015cm.aptoide.p016pt.editorial.EditorialPresenter;
import p015cm.aptoide.p016pt.editorial.EditorialRepository;
import p015cm.aptoide.p016pt.editorial.EditorialService;
import p015cm.aptoide.p016pt.editorial.EditorialView;
import p015cm.aptoide.p016pt.editorial.Slug;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListRepository;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListService;
import p015cm.aptoide.p016pt.editorialList.EditorialListAnalytics;
import p015cm.aptoide.p016pt.editorialList.EditorialListManager;
import p015cm.aptoide.p016pt.editorialList.EditorialListNavigator;
import p015cm.aptoide.p016pt.editorialList.EditorialListPresenter;
import p015cm.aptoide.p016pt.editorialList.EditorialListView;
import p015cm.aptoide.p016pt.feature.NewFeatureDialogPresenter;
import p015cm.aptoide.p016pt.feature.NoBehaviourNewFeatureListener;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.EskillsPreferencesManager;
import p015cm.aptoide.p016pt.home.Home;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeContainerNavigator;
import p015cm.aptoide.p016pt.home.HomeContainerPresenter;
import p015cm.aptoide.p016pt.home.HomeContainerView;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.home.HomePresenter;
import p015cm.aptoide.p016pt.home.HomeView;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.home.apps.AppsFragmentView;
import p015cm.aptoide.p016pt.home.apps.AppsManager;
import p015cm.aptoide.p016pt.home.apps.AppsNavigator;
import p015cm.aptoide.p016pt.home.apps.AppsPresenter;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListAnalytics;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListConfiguration;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListManager;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListPresenter;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcNavigator;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsConfiguration;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreFragment;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreManager;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMorePresenter;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreRepository;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentResultNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.notification.AppcPromotionNotificationStringProvider;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.UpdatesNotificationManager;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.permission.AccountPermissionProvider;
import p015cm.aptoide.p016pt.presenter.LoginSignUpCredentialsView;
import p015cm.aptoide.p016pt.presenter.LoginSignupCredentialsFlavorPresenter;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogPresenter;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogView;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsManager;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionViewAppMapper;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p015cm.aptoide.p016pt.promotions.PromotionsPresenter;
import p015cm.aptoide.p016pt.promotions.PromotionsView;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.repository.request.RewardAppCoinsAppsRepository;
import p015cm.aptoide.p016pt.search.SearchManager;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.SearchRepository;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.view.SearchResultPresenter;
import p015cm.aptoide.p016pt.search.view.SearchResultView;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresNavigator;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresPresenter;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresView;
import p015cm.aptoide.p016pt.themes.NewFeatureDialogView;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.wizard.WizardPresenter;
import p015cm.aptoide.p016pt.view.wizard.WizardView;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p112n.p118g.p119b.C5303a;
import p123rx.p124l.p125c.C5376a;
import p123rx.p127s.C12871b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.view.FragmentModule */
public class FragmentModule {
    private final Bundle arguments;
    private final Fragment fragment;
    private final boolean isCreateStoreUserPrivacyEnabled;
    private final String packageName;
    private final Bundle savedInstance;

    public FragmentModule(Fragment fragment2, Bundle bundle, Bundle bundle2, boolean z, String str) {
        this.fragment = fragment2;
        this.savedInstance = bundle;
        this.arguments = bundle2;
        this.isCreateStoreUserPrivacyEnabled = z;
        this.packageName = str;
    }

    private EditorialConfiguration getEditorialConfiguration() {
        String string = this.arguments.getString("cardId", "");
        if (string.equals("")) {
            return new EditorialConfiguration(new Slug(this.arguments.getString("slug", "")));
        }
        return new EditorialConfiguration(new CardId(string));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialListAnalytics editorialListAnalytics(NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        return new EditorialListAnalytics(navigationTracker, analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AccountErrorMapper provideAccountErrorMapper() {
        return new AccountErrorMapper(this.fragment.getContext(), new ErrorsMapper());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public CheckYourEmailPresenter provideCheckYourEmailPresenter(CheckYourEmailNavigator checkYourEmailNavigator) {
        return new CheckYourEmailPresenter((CheckYourEmailView) this.fragment, checkYourEmailNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public CreateUserErrorMapper provideCreateUserErrorMapper(AccountErrorMapper accountErrorMapper) {
        return new CreateUserErrorMapper(this.fragment.getContext(), accountErrorMapper, this.fragment.getResources());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EarnAppcListPresenter provideEarnAppCoinsListPresenter(CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager, AppNavigator appNavigator, EarnAppcListConfiguration earnAppcListConfiguration, EarnAppcListManager earnAppcListManager, MoPubAdsManager moPubAdsManager, EarnAppcListAnalytics earnAppcListAnalytics, EarnAppcNavigator earnAppcNavigator) {
        return new EarnAppcListPresenter((EarnAppcListFragment) this.fragment, C5376a.m10346b(), crashReport, rewardAppCoinsAppsRepository, analyticsManager, appNavigator, earnAppcListConfiguration, earnAppcListManager, new PermissionManager(), (PermissionService) this.fragment.getContext(), moPubAdsManager, earnAppcListAnalytics, earnAppcNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EarnAppcListAnalytics provideEarnAppcListAnalytics(DownloadAnalytics downloadAnalytics) {
        return new EarnAppcListAnalytics(downloadAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EarnAppcListManager provideEarnAppcListManager(WalletAppProvider walletAppProvider, WalletInstallManager walletInstallManager) {
        return new EarnAppcListManager(walletAppProvider, walletInstallManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EarnAppcNavigator provideEarnAppcNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new EarnAppcNavigator(fragmentNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    @Named
    public FragmentNavigator provideHomeFragmentNavigator(Map<Integer, Result> map, C5303a<Map<Integer, Result>> aVar) {
        return new FragmentResultNavigator(this.fragment.getChildFragmentManager(), C1086R.C1088id.main_home_container_content, 17432576, 17432577, map, aVar);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ImagePickerPresenter provideImagePickerPresenter(AccountPermissionProvider accountPermissionProvider, PhotoFileGenerator photoFileGenerator, ImageValidator imageValidator, UriToPathResolver uriToPathResolver, ImagePickerNavigator imagePickerNavigator) {
        return new ImagePickerPresenter((ImagePickerView) this.fragment, CrashReport.getInstance(), accountPermissionProvider, photoFileGenerator, imageValidator, C5376a.m10346b(), uriToPathResolver, imagePickerNavigator, this.fragment.getActivity().getContentResolver(), ImageLoader.with(this.fragment.getContext()), Schedulers.m10352io());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ImageValidator provideImageValidator(ImageInfoProvider imageInfoProvider) {
        return new ImageValidator(Schedulers.computation(), imageInfoProvider);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public LoginSignupCredentialsFlavorPresenter provideLoginSignUpPresenter(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AccountErrorMapper accountErrorMapper, AccountAnalytics accountAnalytics, @Named("facebookLoginPermissions") List<String> list, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration) {
        return new LoginSignupCredentialsFlavorPresenter((LoginSignUpCredentialsView) this.fragment, aptoideAccountManager, CrashReport.getInstance(), loginSignUpCredentialsConfiguration, accountNavigator, list, accountErrorMapper, accountAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ManageStoreErrorMapper provideManageStoreErrorMapper() {
        return new ManageStoreErrorMapper(this.fragment.getResources(), new ErrorsMapper());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ManageStorePresenter provideManageStorePresenter(UriToPathResolver uriToPathResolver, ManageStoreNavigator manageStoreNavigator, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, AccountAnalytics accountAnalytics) {
        return new ManageStorePresenter((ManageStoreView) this.fragment, CrashReport.getInstance(), uriToPathResolver, this.packageName, manageStoreNavigator, this.arguments.getBoolean("go_to_home", true), manageStoreErrorMapper, aptoideAccountManager, this.arguments.getInt(FragmentNavigator.REQUEST_CODE_EXTRA), accountAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ManageUserPresenter provideManageUserPresenter(AptoideAccountManager aptoideAccountManager, CreateUserErrorMapper createUserErrorMapper, ManageUserNavigator manageUserNavigator, UriToPathResolver uriToPathResolver, AccountAnalytics accountAnalytics) {
        return new ManageUserPresenter((ManageUserView) this.fragment, CrashReport.getInstance(), aptoideAccountManager, createUserErrorMapper, manageUserNavigator, this.arguments.getBoolean("is_edit", false), uriToPathResolver, this.isCreateStoreUserPrivacyEnabled, this.savedInstance == null, accountAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public SearchResultPresenter provideSearchResultPresenter(SearchAnalytics searchAnalytics, SearchNavigator searchNavigator, SearchManager searchManager, TrendingManager trendingManager, SearchSuggestionManager searchSuggestionManager, BottomNavigationMapper bottomNavigationMapper, DownloadViewActionPresenter downloadViewActionPresenter) {
        return new SearchResultPresenter((SearchResultView) this.fragment, searchAnalytics, searchNavigator, CrashReport.getInstance(), C5376a.m10346b(), searchManager, trendingManager, searchSuggestionManager, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, Schedulers.m10352io(), downloadViewActionPresenter);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public SendMagicLinkPresenter provideSendMagicLinkPresenter(AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, AgentPersistence agentPersistence) {
        return new SendMagicLinkPresenter((MagicLinkView) this.fragment, aptoideAccountManager, sendMagicLinkNavigator, C5376a.m10346b(), agentPersistence);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppCoinsInfoPresenter providesAppCoinsInfoPresenter(AppCoinsInfoNavigator appCoinsInfoNavigator, InstallManager installManager, CrashReport crashReport, SocialMediaAnalytics socialMediaAnalytics, AppCoinsManager appCoinsManager) {
        return new AppCoinsInfoPresenter((AppCoinsInfoView) this.fragment, appCoinsInfoNavigator, installManager, crashReport, "com.appcoins.wallet", C5376a.m10346b(), socialMediaAnalytics, appCoinsManager, this.arguments.getBoolean(AppCoinsInfoFragment.NAVIGATE_TO_ESKILLS, false));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppMapper providesAppMapper() {
        return new AppMapper();
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppViewConfiguration providesAppViewConfiguration() {
        long j = this.arguments.getLong(AppViewFragment.BundleKeys.APP_ID.name(), -1);
        return new AppViewConfiguration(j, this.arguments.getString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), (String) null), this.arguments.getString(AppViewFragment.BundleKeys.STORE_NAME.name(), (String) null), this.arguments.getString(AppViewFragment.BundleKeys.STORE_THEME.name(), ""), (SearchAdResult) C12420e.m40844a(this.arguments.getParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name())), (AppViewFragment.OpenType) this.arguments.getSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name()), this.arguments.getString(AppViewFragment.BundleKeys.MD5.name(), ""), this.arguments.getString(AppViewFragment.BundleKeys.UNAME.name(), ""), this.arguments.getDouble(AppViewFragment.BundleKeys.APPC.name(), -1.0d), this.arguments.getString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), ""), this.arguments.getString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), ""), this.arguments.getString(AppViewFragment.BundleKeys.DOWNLOAD_CONVERSION_URL.name(), ""), this.arguments.getString(AppViewFragment.BundleKeys.OEM_ID.name(), (String) null), this.arguments.getBoolean(AppViewFragment.BundleKeys.ESKILLS.name(), false));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppViewManager providesAppViewManager(AppViewModelManager appViewModelManager, InstallManager installManager, DownloadFactory downloadFactory, AppCenter appCenter, ReviewsManager reviewsManager, AdsManager adsManager, FlagManager flagManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager, DownloadStateParser downloadStateParser, AppViewAnalytics appViewAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, Resources resources, WindowManager windowManager, @Named("marketName") String str, AppCoinsManager appCoinsManager, MoPubAdsManager moPubAdsManager, PromotionsManager promotionsManager, AppcMigrationManager appcMigrationManager, LocalNotificationSyncManager localNotificationSyncManager, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, AppsFlyerManager appsFlyerManager) {
        return new AppViewManager(appViewModelManager, installManager, downloadFactory, appCenter, reviewsManager, adsManager, flagManager, storeUtilsProxy, aptoideAccountManager, moPubAdsManager, downloadStateParser, appViewAnalytics, notificationAnalytics, installAnalytics, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * 6, str, appCoinsManager, promotionsManager, appcMigrationManager, localNotificationSyncManager, appcPromotionNotificationStringProvider, dynamicSplitsManager, splitAnalyticsMapper, appsFlyerManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppViewModelManager providesAppViewModelManager(AppViewConfiguration appViewConfiguration, StoreManager storeManager, @Named("marketName") String str, AppCenter appCenter, DownloadStateParser downloadStateParser, InstallManager installManager, AppcMigrationManager appcMigrationManager, AppCoinsAdvertisingManager appCoinsAdvertisingManager, AppCoinsManager appCoinsManager) {
        return new AppViewModelManager(appViewConfiguration, storeManager, str, appCenter, downloadStateParser, installManager, appcMigrationManager, appCoinsAdvertisingManager, appCoinsManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppViewPresenter providesAppViewPresenter(AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, PromotionsNavigator promotionsNavigator) {
        return new AppViewPresenter((AppViewView) this.fragment, accountNavigator, appViewAnalytics, campaignAnalytics, appViewNavigator, appViewManager, aptoideAccountManager, C5376a.m10346b(), crashReport, new PermissionManager(), (PermissionService) this.fragment.getContext(), promotionsNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppcPromotionNotificationStringProvider providesAppcPromotionNotificationStringProvider() {
        return new AppcPromotionNotificationStringProvider(this.fragment.getContext().getString(C1086R.string.promo_update2appc_claim_notification_title), this.fragment.getContext().getString(C1086R.string.promo_update2appc_claim_notification_body));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppsManager providesAppsManager(UpdatesManager updatesManager, InstallManager installManager, AppMapper appMapper, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, UpdatesAnalytics updatesAnalytics, DownloadFactory downloadFactory, MoPubAdsManager moPubAdsManager, AptoideInstallManager aptoideInstallManager, UpdatesNotificationManager updatesNotificationManager, @Named("secureShared") SharedPreferences sharedPreferences, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new AppsManager(updatesManager, installManager, appMapper, downloadAnalytics, installAnalytics, updatesAnalytics, this.fragment.getContext().getPackageManager(), this.fragment.getContext(), downloadFactory, moPubAdsManager, aptoideInstallManager, updatesNotificationManager, sharedPreferences, dynamicSplitsManager, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppsNavigator providesAppsNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator) {
        return new AppsNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, appNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AppsPresenter providesAppsPresenter(AppsManager appsManager, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator) {
        return new AppsPresenter((AppsFragmentView) this.fragment, appsManager, C5376a.m10346b(), Schedulers.m10352io(), CrashReport.getInstance(), new PermissionManager(), (PermissionService) this.fragment.getContext(), aptoideAccountManager, appsNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public AutoUpdateDialogPresenter providesAutoUpdateDialogPresenter(CrashReport crashReport, AutoUpdateManager autoUpdateManager) {
        return new AutoUpdateDialogPresenter((AutoUpdateDialogFragment) this.fragment, crashReport, autoUpdateManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public BundleEvent providesBundleEvent() {
        return new BundleEvent(this.arguments.getString("title"), this.arguments.getString("action"));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public CheckYourEmailNavigator providesCheckYourEmailNavigator() {
        return new CheckYourEmailNavigator((ActivityNavigator) this.fragment.getActivity());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ClaimPromotionDialogPresenter providesClaimPromotionDialogPresenter(ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        return new ClaimPromotionDialogPresenter((ClaimPromotionDialogView) this.fragment, new C5383b(), C5376a.m10346b(), claimPromotionsManager, promotionsAnalytics, claimPromotionsNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ClaimPromotionsManager providesClaimPromotionsManager(PromotionsManager promotionsManager) {
        return new ClaimPromotionsManager(promotionsManager, this.arguments.getString("package_name", BuildConfig.APTOIDE_THEME), this.arguments.getString("promotion_id", BuildConfig.APTOIDE_THEME));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public NewFeatureDialogPresenter providesDarkthemeDialogPresenter(NewFeatureManager newFeatureManager) {
        return new NewFeatureDialogPresenter((NewFeatureDialogView) this.fragment, newFeatureManager, new NoBehaviourNewFeatureListener());
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public DownloadDialogProvider providesDownloadDialogManager(ThemeManager themeManager) {
        return new DownloadDialogProvider(this.fragment, themeManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public DownloadNavigator providesDownloadNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        Fragment fragment2 = this.fragment;
        return new DownloadNavigator(fragment2, fragment2.getContext().getPackageManager(), fragmentNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public DownloadViewActionPresenter providesDownloadViewActionPresenter(InstallManager installManager, MoPubAdsManager moPubAdsManager, PermissionManager permissionManager, AppcMigrationManager appcMigrationManager, DownloadDialogProvider downloadDialogProvider, DownloadNavigator downloadNavigator, DownloadFactory downloadFactory, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, NotificationAnalytics notificationAnalytics, CrashReport crashReport, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new DownloadViewActionPresenter(installManager, moPubAdsManager, permissionManager, appcMigrationManager, downloadDialogProvider, downloadNavigator, (PermissionService) this.fragment.getActivity(), Schedulers.m10352io(), C5376a.m10346b(), downloadFactory, downloadAnalytics, installAnalytics, notificationAnalytics, crashReport, dynamicSplitsManager, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialAnalytics providesEditorialAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new EditorialAnalytics(downloadAnalytics, analyticsManager, navigationTracker, this.arguments.getBoolean(EditorialFragment.FROM_HOME), installAnalytics, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialListManager providesEditorialListManager(EditorialCardListRepository editorialCardListRepository, ReactionsManager reactionsManager, AppCoinsManager appCoinsManager) {
        return new EditorialListManager(editorialCardListRepository, reactionsManager, appCoinsManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialListNavigator providesEditorialListNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator) {
        return new EditorialListNavigator(fragmentNavigator, accountNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialListPresenter providesEditorialListPresenter(EditorialListManager editorialListManager, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator, EditorialListAnalytics editorialListAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new EditorialListPresenter((EditorialListView) this.fragment, editorialListManager, aptoideAccountManager, editorialListNavigator, editorialListAnalytics, CrashReport.getInstance(), C5376a.m10346b(), userFeedbackAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialCardListRepository providesEditorialListRepository(EditorialCardListService editorialCardListService) {
        return new EditorialCardListRepository(editorialCardListService);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialManager providesEditorialManager(EditorialRepository editorialRepository, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, EditorialAnalytics editorialAnalytics, ReactionsManager reactionsManager, MoPubAdsManager moPubAdsManager, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        return new EditorialManager(editorialRepository, getEditorialConfiguration(), installManager, downloadFactory, downloadStateParser, notificationAnalytics, installAnalytics, editorialAnalytics, reactionsManager, moPubAdsManager, dynamicSplitsManager, splitAnalyticsMapper);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialNavigator providesEditorialNavigator(AppNavigator appNavigator, AccountNavigator accountNavigator, SocialMediaNavigator socialMediaNavigator, @Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new EditorialNavigator((ActivityNavigator) this.fragment.getActivity(), fragmentNavigator, appNavigator, accountNavigator, socialMediaNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialPresenter providesEditorialPresenter(EditorialManager editorialManager, CrashReport crashReport, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        return new EditorialPresenter((EditorialView) this.fragment, editorialManager, C5376a.m10346b(), crashReport, new PermissionManager(), (PermissionService) this.fragment.getContext(), editorialAnalytics, editorialNavigator, userFeedbackAnalytics, moPubAdsManager, socialMediaAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialRepository providesEditorialRepository(EditorialService editorialService) {
        return new EditorialRepository(editorialService);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EditorialCardListService providesEditorialService(@Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences) {
        return new EditorialCardListService(bodyInterceptor, okHttpClient, tokenInvalidator, WebService.getDefaultConverter(), sharedPreferences, 10);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public FlagManager providesFlagManager(FlagService flagService) {
        return new FlagManager(flagService);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public FlagService providesFlagService(@Named("defaultInterceptorV3") BodyInterceptor<p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody> bodyInterceptor, @Named("default") OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences) {
        return new FlagService(bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public MoreBundleManager providesGetStoreManager(BundlesRepository bundlesRepository) {
        return new MoreBundleManager(bundlesRepository);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public MoreBundlePresenter providesGetStoreWidgetsPresenter(MoreBundleManager moreBundleManager, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        return new MoreBundlePresenter((MoreBundleView) this.fragment, moreBundleManager, C5376a.m10346b(), crashReport, homeNavigator, adMapper, bundleEvent, homeAnalytics, chipManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public Home providesHome(BundlesRepository bundlesRepository, PromotionsManager promotionsManager, PromotionsPreferencesManager promotionsPreferencesManager, BlacklistManager blacklistManager, @Named("homePromotionsId") String str, ReactionsManager reactionsManager, ComingSoonNotificationManager comingSoonNotificationManager) {
        return new Home(bundlesRepository, promotionsManager, promotionsPreferencesManager, blacklistManager, str, reactionsManager, comingSoonNotificationManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public HomeAnalytics providesHomeAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return new HomeAnalytics(navigationTracker, analyticsManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public HomeContainerNavigator providesHomeContainerNavigator(@Named("home-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new HomeContainerNavigator(fragmentNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public HomeContainerPresenter providesHomeContainerPresenter(AptoideAccountManager aptoideAccountManager, HomeContainerNavigator homeContainerNavigator, HomeNavigator homeNavigator, HomeAnalytics homeAnalytics, Home home, ChipManager chipManager, EskillsPreferencesManager eskillsPreferencesManager) {
        return new HomeContainerPresenter((HomeContainerView) this.fragment, C5376a.m10346b(), aptoideAccountManager, homeContainerNavigator, homeNavigator, homeAnalytics, home, chipManager, eskillsPreferencesManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public HomeNavigator providesHomeNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator, AccountNavigator accountNavigator, ThemeManager themeManager) {
        return new HomeNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper, appNavigator, (ActivityNavigator) this.fragment.getActivity(), accountNavigator, themeManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public HomePresenter providesHomePresenter(Home home, HomeNavigator homeNavigator, AdMapper adMapper, AptoideAccountManager aptoideAccountManager, HomeAnalytics homeAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return new HomePresenter((HomeView) this.fragment, home, C5376a.m10346b(), CrashReport.getInstance(), homeNavigator, adMapper, homeAnalytics, userFeedbackAnalytics);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public EarnAppcListConfiguration providesListAppsConfiguration() {
        return new EarnAppcListConfiguration(this.arguments.getString("title"), this.arguments.getString(StoreTabGridRecyclerFragment.BundleCons.TAG));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ListAppsConfiguration providesListAppsMoreConfiguration() {
        return new ListAppsConfiguration(this.fragment.getArguments().getString("title"), this.arguments.getString(StoreTabGridRecyclerFragment.BundleCons.TAG), this.arguments.getString("action"), this.arguments.getString("name"), Long.valueOf(this.arguments.getLong(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID)));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ListAppsMoreManager providesListAppsMoreManager(ListAppsMoreRepository listAppsMoreRepository, AdsRepository adsRepository) {
        return new ListAppsMoreManager(listAppsMoreRepository, adsRepository);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public ListAppsMorePresenter providesListAppsMorePresenter(CrashReport crashReport, AppNavigator appNavigator, @Named("default") SharedPreferences sharedPreferences, ListAppsConfiguration listAppsConfiguration, ListAppsMoreManager listAppsMoreManager) {
        return new ListAppsMorePresenter((ListAppsMoreFragment) this.fragment, C5376a.m10346b(), crashReport, appNavigator, sharedPreferences, listAppsConfiguration, listAppsMoreManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public LoginSignUpCredentialsConfiguration providesLoginSignUpCredentialsConfiguration() {
        String string = this.arguments.getString("magic_link_error_message");
        if (string == null) {
            string = "";
        }
        return new LoginSignUpCredentialsConfiguration(this.arguments.getBoolean(LoginSignUpCredentialsFragment.DISMISS_TO_NAVIGATE_TO_MAIN_VIEW), this.arguments.getBoolean(LoginSignUpCredentialsFragment.CLEAN_BACK_STACK), this.arguments.getBoolean("has_magic_link_error"), string);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public MyStoresNavigator providesMyStoreNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper) {
        return new MyStoresNavigator(fragmentNavigator, (AptoideBottomNavigator) this.fragment.getActivity(), bottomNavigationMapper);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public MyStoresPresenter providesMyStorePresenter(AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator) {
        return new MyStoresPresenter((MyStoresView) this.fragment, C5376a.m10346b(), aptoideAccountManager, myStoresNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public OutOfSpaceDialogPresenter providesOutOfSpaceDialogPresenter(CrashReport crashReport, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        return new OutOfSpaceDialogPresenter((OutOfSpaceDialogFragment) this.fragment, crashReport, C5376a.m10346b(), Schedulers.m10352io(), outOfSpaceManager, outOfSpaceNavigator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public OutOfSpaceManager providesOutOfSpaceManager(InstallManager installManager, InstallAppSizeValidator installAppSizeValidator) {
        return new OutOfSpaceManager(installManager, this.arguments.getLong(OutOfSpaceDialogFragment.APP_SIZE), C12871b.m41468p(), installAppSizeValidator);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public OutOfSpaceNavigator providesOutOfSpaceNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator) {
        return new OutOfSpaceNavigator(fragmentNavigator, this.arguments.getString("package_name"));
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public PromotionViewAppMapper providesPromotionViewAppMapper(DownloadStateParser downloadStateParser) {
        return new PromotionViewAppMapper(downloadStateParser);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public PromotionsPresenter providesPromotionsPresenter(PromotionsManager promotionsManager, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, @Named("homePromotionsId") String str, MoPubAdsManager moPubAdsManager) {
        return new PromotionsPresenter((PromotionsView) this.fragment, promotionsManager, new PermissionManager(), (PermissionService) this.fragment.getContext(), C5376a.m10346b(), promotionsAnalytics, promotionsNavigator, str, moPubAdsManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public RewardAppCoinsAppsRepository providesRewardAppCoinsAppsRepository(@Named("default") OkHttpClient okHttpClient, @Named("mature-pool-v7") BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, @Named("default") SharedPreferences sharedPreferences, InstallManager installManager, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        return new RewardAppCoinsAppsRepository(okHttpClient, WebService.getDefaultConverter(), bodyInterceptor, tokenInvalidator, sharedPreferences, installManager, appBundlesVisibilityManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public SearchManager providesSearchManager(AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository, DownloadStatusManager downloadStatusManager, AppCenter appCenter) {
        return new SearchManager(aptoideAccountManager, searchRepository, downloadStatusManager, appCenter);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public SendMagicLinkNavigator providesSendMagicLinkNavigator(@Named("main-fragment-navigator") FragmentNavigator fragmentNavigator, ThemeManager themeManager) {
        return new SendMagicLinkNavigator(fragmentNavigator, this.fragment.getContext(), themeManager);
    }

    /* access modifiers changed from: package-private */
    @FragmentScope
    public WizardPresenter providesWizardPresenter(AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountAnalytics accountAnalytics) {
        return new WizardPresenter((WizardView) this.fragment, aptoideAccountManager, crashReport, accountAnalytics);
    }
}
