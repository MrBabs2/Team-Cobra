package p015cm.aptoide.p016pt.app;

import java.util.List;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAdError;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.GenericResponseV2;
import p015cm.aptoide.p016pt.donations.Donation;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.InvalidAppException;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.AppcPromotionNotificationStringProvider;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppsList;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.app.AppViewManager */
public class AppViewManager {
    private final AdsManager adsManager;
    private final AppCenter appCenter;
    private final AppCoinsManager appCoinsManager;
    private final AppViewAnalytics appViewAnalytics;
    private final AppViewModelManager appViewModelManager;
    private final AppcMigrationManager appcMigrationManager;
    private boolean appcPromotionImpressionSent = false;
    private final AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider;
    private AppsFlyerManager appsFlyerManager;
    private final AptoideAccountManager aptoideAccountManager;
    private SimilarAppsViewModel cachedAppcSimilarAppsViewModel;
    private PromotionViewModel cachedPromotionViewModel;
    private SimilarAppsViewModel cachedSimilarAppsViewModel;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final FlagManager flagManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private boolean isFirstLoad = true;
    private final int limit;
    private final LocalNotificationSyncManager localNotificationSyncManager;
    private final String marketName;
    private boolean migrationImpressionSent = false;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final PromotionsManager promotionsManager;
    private final ReviewsManager reviewsManager;
    private SearchAdResult searchAdResult;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final StoreUtilsProxy storeUtilsProxy;

    public AppViewManager(AppViewModelManager appViewModelManager2, InstallManager installManager2, DownloadFactory downloadFactory2, AppCenter appCenter2, ReviewsManager reviewsManager2, AdsManager adsManager2, FlagManager flagManager2, StoreUtilsProxy storeUtilsProxy2, AptoideAccountManager aptoideAccountManager2, MoPubAdsManager moPubAdsManager2, DownloadStateParser downloadStateParser2, AppViewAnalytics appViewAnalytics2, NotificationAnalytics notificationAnalytics2, InstallAnalytics installAnalytics2, int i, String str, AppCoinsManager appCoinsManager2, PromotionsManager promotionsManager2, AppcMigrationManager appcMigrationManager2, LocalNotificationSyncManager localNotificationSyncManager2, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider2, DynamicSplitsManager dynamicSplitsManager2, SplitAnalyticsMapper splitAnalyticsMapper2, AppsFlyerManager appsFlyerManager2) {
        this.appViewModelManager = appViewModelManager2;
        this.installManager = installManager2;
        this.downloadFactory = downloadFactory2;
        this.appCenter = appCenter2;
        this.reviewsManager = reviewsManager2;
        this.adsManager = adsManager2;
        this.flagManager = flagManager2;
        this.storeUtilsProxy = storeUtilsProxy2;
        this.aptoideAccountManager = aptoideAccountManager2;
        this.moPubAdsManager = moPubAdsManager2;
        this.downloadStateParser = downloadStateParser2;
        this.appViewAnalytics = appViewAnalytics2;
        this.notificationAnalytics = notificationAnalytics2;
        this.installAnalytics = installAnalytics2;
        this.limit = i;
        this.marketName = str;
        this.appCoinsManager = appCoinsManager2;
        this.promotionsManager = promotionsManager2;
        this.appcMigrationManager = appcMigrationManager2;
        this.localNotificationSyncManager = localNotificationSyncManager2;
        this.appcPromotionNotificationStringProvider = appcPromotionNotificationStringProvider2;
        this.dynamicSplitsManager = dynamicSplitsManager2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
        this.appsFlyerManager = appsFlyerManager2;
    }

    /* renamed from: a */
    static /* synthetic */ ReviewsViewModel m4552a(ReviewRequestResult reviewRequestResult) {
        return new ReviewsViewModel(reviewRequestResult.getReviewList(), reviewRequestResult.isLoading(), reviewRequestResult.getError());
    }

    /* renamed from: a */
    static /* synthetic */ RoomDownload m4553a(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* renamed from: b */
    static /* synthetic */ RoomDownload m4558b(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* access modifiers changed from: private */
    /* renamed from: createDownload */
    public C5368e<RoomDownload> mo6953a(DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, AppModel appModel, DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(appModel).mo18687f(new C1401i(this, action, appModel, dynamicSplitsModel)).mo18649a((C5378b<? super Throwable>) new C1409m(this, appModel, action, offerResponseStatus, z, dynamicSplitsModel));
    }

    private C5368e<List<Promotion>> getPromotions() {
        return this.appViewModelManager.getAppModel().mo18568c(new C1426u(this));
    }

    private Single<AppsList> loadAppcRecommended(int i, String str) {
        return this.appCenter.loadAppcRecommendedApps(i, str);
    }

    private Single<AppsList> loadRecommended(int i, String str) {
        return this.appCenter.loadRecommendedApps(i, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: mergeToPromotionViewModel */
    public PromotionViewModel mo6943a(WalletApp walletApp, List<Promotion> list, AppViewModel appViewModel) {
        return new PromotionViewModel(walletApp, list, appViewModel);
    }

    private void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str, String str2, boolean z) {
        setupDownloadEvents(roomDownload, action, j, str2, (String) null, offerResponseStatus, str, z);
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    /* renamed from: b */
    public /* synthetic */ Single mo6965b(AppModel appModel) {
        return this.adsManager.loadAds(appModel.getPackageName(), appModel.getStore().getName()).mo18569d(C1944y0.f4551f);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo6967c(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    public C5328b cancelDownload(String str, String str2, int i) {
        return this.installManager.cancelInstall(str, str2, i);
    }

    public C5328b downloadApp(DownloadModel.Action action, long j, String str, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        DownloadModel.Action action2 = action;
        WalletAdsOfferManager.OfferResponseStatus offerResponseStatus2 = offerResponseStatus;
        boolean z2 = z;
        return getAppModel().mo18568c(new C1412n(this, action, offerResponseStatus2, z2)).mo18664b(new C1422s(this, action, j, str, str2, offerResponseStatus2, z2)).mo18664b(new C1406k0(this, action)).mo18689g(new C1395f(this)).mo18696k();
    }

    public C5368e<DownloadModel> downloadStarted() {
        return this.appViewModelManager.observeAppViewModel().mo18687f(C1403j.f3885f).mo18681d(C1407l.f3890f);
    }

    public Single<Boolean> flagApk(String str, String str2, FlagsVote.VoteType voteType) {
        return this.flagManager.flagApk(str, str2, voteType.name().toLowerCase()).mo18569d(C1386a0.f3855f);
    }

    public Single<WalletAdsOfferManager.OfferResponseStatus> getAdsVisibilityStatus() {
        return this.moPubAdsManager.getAdsVisibilityStatus();
    }

    public Single<AppModel> getAppModel() {
        return this.appViewModelManager.getAppModel();
    }

    public Single<AppViewModel> getAppViewModel() {
        return this.appViewModelManager.getAppViewModel();
    }

    public SimilarAppsViewModel getCachedAppcSimilarAppsViewModel() {
        return this.cachedAppcSimilarAppsViewModel;
    }

    public SimilarAppsViewModel getCachedSimilarAppsViewModel() {
        return this.cachedSimilarAppsViewModel;
    }

    public Promotion getClaimablePromotion(List<Promotion> list, Promotion.ClaimAction claimAction) {
        return this.promotionsManager.getClaimablePromotion(list, claimAction);
    }

    public String getMarketName() {
        return this.marketName;
    }

    public SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }

    public Single<List<Donation>> getTopDonations(String str) {
        return C10832d.m36727a(this.appCoinsManager.getDonationsList(str));
    }

    public void handleAdsLogic(SearchAdResult searchAdResult2) {
        this.adsManager.handleAdsLogic(searchAdResult2);
    }

    public boolean hasClaimablePromotion(Promotion.ClaimAction claimAction) {
        PromotionViewModel promotionViewModel = this.cachedPromotionViewModel;
        return (promotionViewModel == null || getClaimablePromotion(promotionViewModel.getPromotions(), claimAction) == null) ? false : true;
    }

    public boolean isAppcPromotionImpressionSent() {
        return this.appcPromotionImpressionSent;
    }

    public boolean isMigrationImpressionSent() {
        return this.migrationImpressionSent;
    }

    public Single<SearchAdResult> loadAdsFromAppView() {
        return getAppModel().mo18559a(new C1416p(this));
    }

    public Single<SimilarAppsViewModel> loadAppcSimilarAppsViewModel(String str) {
        SimilarAppsViewModel similarAppsViewModel = this.cachedAppcSimilarAppsViewModel;
        if (similarAppsViewModel != null) {
            return Single.m10119a(similarAppsViewModel);
        }
        return loadAppcRecommended(this.limit, str).mo18569d(new C1405k(this));
    }

    public C5368e<DownloadModel> loadDownloadModel(String str, String str2, int i, String str3, long j, boolean z) {
        return C5368e.m10247a(this.installManager.getInstall(str, str2, i), this.appcMigrationManager.isMigrationApp(str2, str3, i, j, z), new C1392d0(this));
    }

    public C5368e<PromotionViewModel> loadPromotionViewModel() {
        C5368e c = C5368e.m10257c(new PromotionViewModel());
        PromotionViewModel promotionViewModel = this.cachedPromotionViewModel;
        if (promotionViewModel != null) {
            return C5368e.m10246a(C5368e.m10257c(promotionViewModel), this.promotionsManager.getWalletApp(), observeAppViewModel(), new C1391d(this));
        }
        return getPromotions().mo18681d(C1390c0.f3861f).mo18687f(new C1393e(this)).mo18664b(new C1398g0(this)).mo18679d(c);
    }

    public Single<ReviewsViewModel> loadReviewsViewModel(String str, String str2, String str3) {
        return this.reviewsManager.loadReviews(str, str2, 3, str3).mo18569d(C1418q.f3916f);
    }

    public Single<SimilarAppsViewModel> loadSimilarAppsViewModel(String str, List<String> list) {
        SimilarAppsViewModel similarAppsViewModel = this.cachedSimilarAppsViewModel;
        if (similarAppsViewModel != null) {
            return Single.m10119a(similarAppsViewModel);
        }
        return this.adsManager.loadAd(str, list).mo18559a(new C1400h0(this, str));
    }

    public C5368e<AppViewModel> observeAppViewModel() {
        return this.appViewModelManager.observeAppViewModel();
    }

    public C5328b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public Single<Boolean> registerAppsFlyerImpression(String str) {
        if (str.equals("com.igg.android.lordsmobile")) {
            return this.appsFlyerManager.registerImpression();
        }
        return Single.m10119a(true);
    }

    public C5328b resumeDownload(String str, long j, DownloadModel.Action action, String str2, boolean z) {
        return this.installManager.getDownload(str).mo18559a(new C1394e0(this, action, j, str2, z)).mo18558a((C5378b<Throwable>) C1420r.f3918f).mo18566b(new C1402i0(this));
    }

    public void scheduleNotification(String str, String str2, String str3, String str4) {
        LocalNotificationSyncManager localNotificationSyncManager2 = this.localNotificationSyncManager;
        String format = String.format(this.appcPromotionNotificationStringProvider.getNotificationTitle(), new Object[]{str});
        String notificationBody = this.appcPromotionNotificationStringProvider.getNotificationBody();
        localNotificationSyncManager2.schedule(format, notificationBody, str2, C1086R.string.promo_update2appc_notification_claim_button, "aptoideinstall://package=" + str3 + "&store=" + str4 + "&show_install_popup=false", LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION, 7, LocalNotificationSyncManager.FIVE_MINUTES);
    }

    public void sendAppOpenAnalytics(String str, String str2, String str3, boolean z, boolean z2) {
        if (this.isFirstLoad) {
            this.appViewAnalytics.sendAppViewOpenedFromEvent(str, str2, str3, z, z2);
            this.isFirstLoad = false;
        }
    }

    public void sendEditorsAppOpenAnalytics(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        if (this.isFirstLoad) {
            this.appViewAnalytics.sendAppViewOpenedFromEvent(str, str2, str3, z, z2);
            this.appViewAnalytics.sendEditorsChoiceClickEvent(str, str4);
            this.isFirstLoad = false;
        }
    }

    public void setAppcPromotionImpressionSent() {
        this.appcPromotionImpressionSent = true;
    }

    public void setMigrationImpressionSent() {
        this.migrationImpressionSent = true;
    }

    public void setSearchAdResult(SearchAdResult searchAdResult2) {
        this.searchAdResult = searchAdResult2;
    }

    public void setupMigratorUninstallEvent(String str) {
        this.installAnalytics.uninstallStarted(str, AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPVIEW);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }

    public C5328b subscribeStore(String str) {
        return C5328b.m10169d(new C1414o(this, str));
    }

    public void unscheduleNotificationSync() {
        this.localNotificationSyncManager.unschedule(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION);
    }

    private void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j, String str, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str3, boolean z) {
        DownloadModel.Action action2 = action;
        long j2 = j;
        int campaignId = this.notificationAnalytics.getCampaignId(roomDownload.getPackageName(), j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(roomDownload.getPackageName(), j2);
        this.appViewAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, action, AnalyticsManager.Action.CLICK, str, str2, offerResponseStatus, str3, z, this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPVIEW, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, action2 != null && action2.equals(DownloadModel.Action.MIGRATE), roomDownload.hasAppc(), roomDownload.hasSplits(), offerResponseStatus.toString(), str, str3, z, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
    }

    /* renamed from: a */
    public /* synthetic */ SimilarAppsViewModel mo6945a(AppsList appsList) {
        SimilarAppsViewModel similarAppsViewModel = new SimilarAppsViewModel((ApplicationAd) null, appsList.getList(), appsList.isLoading(), appsList.getError(), (ApplicationAdError) null);
        this.cachedAppcSimilarAppsViewModel = similarAppsViewModel;
        return similarAppsViewModel;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6949a(String str, MinimalAdRequestResult minimalAdRequestResult) {
        return loadRecommended(this.limit, str).mo18569d(new C1943y(this, minimalAdRequestResult));
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo6966b(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    public C5328b downloadApp(WalletApp walletApp) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(walletApp.getMd5sum())).mo18568c(new C1388b0(this, walletApp)).mo18692i(new C1941x(this, walletApp)).mo18689g(new C1404j0(this)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ SimilarAppsViewModel mo6944a(MinimalAdRequestResult minimalAdRequestResult, AppsList appsList) {
        SimilarAppsViewModel similarAppsViewModel = new SimilarAppsViewModel(minimalAdRequestResult.getAd(), appsList.getList(), appsList.isLoading(), appsList.getError(), minimalAdRequestResult.getError());
        this.cachedSimilarAppsViewModel = similarAppsViewModel;
        return similarAppsViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4555a(GenericResponseV2 genericResponseV2) {
        return Boolean.valueOf(genericResponseV2.isOk() && !genericResponseV2.hasErrors());
    }

    /* renamed from: a */
    public /* synthetic */ void mo6963a(String str) {
        this.storeUtilsProxy.subscribeStore(str, (SuccessRequestListener<GetStoreMeta>) null, (ErrorRequestListener) null, this.aptoideAccountManager);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6952a(DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, AppModel appModel) {
        return C5368e.m10257c(appModel).mo18692i(new C1399h(this, appModel)).mo18687f(new C1428v(this, action, offerResponseStatus, z, appModel));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6946a(AppModel appModel, AppModel appModel2) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(appModel.getMd5()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6958a(DownloadModel.Action action, long j, String str, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, action, j, str, str2, offerResponseStatus, roomDownload.getStoreName(), z);
        DownloadModel.Action action2 = action;
        if (DownloadModel.Action.MIGRATE.equals(action)) {
            setupMigratorUninstallEvent(roomDownload.getPackageName());
            return;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo6959a(DownloadModel.Action action, RoomDownload roomDownload) {
        if (action == DownloadModel.Action.MIGRATE) {
            this.appcMigrationManager.addMigrationCandidate(roomDownload.getPackageName());
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6950a(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6954a(DownloadModel.Action action, AppModel appModel, DynamicSplitsModel dynamicSplitsModel, AppModel appModel2) {
        return C5368e.m10257c(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(action), appModel.getAppName(), appModel.getPackageName(), appModel.getMd5(), appModel.getIcon(), appModel.getVersionName(), appModel.getVersionCode(), appModel.getPath(), appModel.getPathAlt(), appModel.getObb(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getSize(), appModel.getSplits(), appModel.getRequiredSplits(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), appModel.getOemId(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6957a(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, DynamicSplitsModel dynamicSplitsModel, Throwable th) {
        DownloadModel.Action action2 = action;
        if (th instanceof InvalidAppException) {
            this.appViewAnalytics.sendInvalidAppEventError(appModel.getPackageName(), appModel.getVersionCode(), action, offerResponseStatus, action2 != null && action2.equals(DownloadModel.Action.MIGRATE), !appModel.getSplits().isEmpty(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), z, th, appModel.getObb() != null, this.splitAnalyticsMapper.getSplitTypesAsString(appModel.hasSplits(), dynamicSplitsModel.getDynamicSplitsList()));
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6955a(WalletApp walletApp, DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(walletApp.getDownloadModel().getAction()), walletApp.getAppName(), walletApp.getPackageName(), walletApp.getMd5sum(), walletApp.getIcon(), walletApp.getVersionName(), walletApp.getVersionCode(), walletApp.getPath(), walletApp.getPathAlt(), walletApp.getObb(), false, walletApp.getSize(), walletApp.getSplits(), walletApp.getRequiredSplits(), walletApp.getTrustedBadge(), walletApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6948a(WalletApp walletApp, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C1397g(this, roomDownload, walletApp)).mo18569d(new C1939w(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6962a(RoomDownload roomDownload, WalletApp walletApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        setupDownloadEvents(roomDownload, walletApp.getDownloadModel().getAction(), walletApp.getId(), offerResponseStatus, walletApp.getStoreName(), walletApp.getTrustedBadge(), false);
    }

    /* renamed from: a */
    public /* synthetic */ DownloadModel mo6941a(Install install, Boolean bool) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), bool.booleanValue()), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6947a(DownloadModel.Action action, long j, String str, boolean z, RoomDownload roomDownload) {
        RoomDownload roomDownload2 = roomDownload;
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C1945z(this, roomDownload2, action, j, str, z)).mo18569d(new C1424t(roomDownload2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6961a(RoomDownload roomDownload, DownloadModel.Action action, long j, String str, boolean z, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        setupDownloadEvents(roomDownload, action, j, offerResponseStatus, roomDownload.getStoreName(), str, z);
    }

    /* renamed from: a */
    public /* synthetic */ PromotionViewModel mo6942a(PromotionViewModel promotionViewModel, WalletApp walletApp, AppViewModel appViewModel) {
        return mo6943a(walletApp, promotionViewModel.getPromotions(), appViewModel);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6956a(List list) {
        return C5368e.m10246a(C5368e.m10257c(list), this.promotionsManager.getWalletApp(), observeAppViewModel(), new C1396f0(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6960a(PromotionViewModel promotionViewModel) {
        this.cachedPromotionViewModel = promotionViewModel;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6951a(AppModel appModel) {
        return this.promotionsManager.getPromotionsForPackage(appModel.getPackageName());
    }
}
