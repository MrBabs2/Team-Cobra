package p015cm.aptoide.p016pt.app;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.InstallType;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: cm.aptoide.pt.app.AppViewAnalytics */
public class AppViewAnalytics {
    private static final String ACTION = "Action";
    public static final String ADS_BLOCK_BY_OFFER = "Ads_Block_By_Offer";
    public static final String APPC_SIMILAR_APP_INTERACT = "Appc_Similar_App_Interact";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String APPLICATION_PUBLISHER = "Application Publisher";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_SHORTCUT = "App_Shortcut";
    public static final String APP_VIEW_INTERACT = "App_View_Interact";
    public static final String APP_VIEW_OPEN_FROM = "App_Viewed_Open_From";
    public static final String BONUS_GAME_WALLET_OFFER_19 = "Bonus_Game_Wallet_Offer_19_App_View";
    public static final String BONUS_MIGRATION_APPVIEW = "Bonus_Migration_19_App_View";
    public static final String CLICK_INSTALL = "Clicked on install button";
    private static final String CONTEXT = "context";
    public static final String DONATIONS_IMPRESSION = "Donations_Impression";
    public static final String EDITORS_CHOICE_CLICKS = "Editors_Choice_Clicks";
    public static final String HOME_PAGE_EDITORS_CHOICE_FLURRY = "Home_Page_Editors_Choice";
    private static final String IMPRESSION = "impression";
    private static final String IS_AD = "Is_ad";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String NETWORK = "network";
    public static final String OPEN_APP_VIEW = "OPEN_APP_VIEW";
    private static final String PACKAGE_NAME = "Package_name";
    private static final String POSITION = "Position";
    public static final String SIMILAR_APP_INTERACT = "Similar_App_Interact";
    private static final String TAP_ON_APP = "tap_on_app";
    private static final String TYPE = "type";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final StoreAnalytics storeAnalytics;

    /* renamed from: cm.aptoide.pt.app.AppViewAnalytics$1 */
    static /* synthetic */ class C13831 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.MIGRATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.AppViewAnalytics.C13831.<clinit>():void");
        }
    }

    public AppViewAnalytics(DownloadAnalytics downloadAnalytics2, AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, StoreAnalytics storeAnalytics2, InstallAnalytics installAnalytics2) {
        this.downloadAnalytics = downloadAnalytics2;
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.storeAnalytics = storeAnalytics2;
        this.installAnalytics = installAnalytics2;
    }

    private Map<String, Object> createAppViewDataMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.PACKAGE, str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("app", hashMap);
        if (screenTagHistory != null) {
            hashMap2.put("previous_store", screenTagHistory.getStore());
        } else {
            hashMap2.put("previous_store", APP_SHORTCUT);
        }
        if (screenTagHistory2 != null) {
            hashMap2.put("previous_tag", screenTagHistory2.getTag());
        } else {
            hashMap2.put("previous_tag", APP_SHORTCUT);
        }
        hashMap2.put("appcoins_type", mapAppCoinsInfo(z, z2));
        return hashMap2;
    }

    private HashMap<String, Object> createAppViewedFromMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, boolean z, boolean z2) throws NullPointerException {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (screenTagHistory != null) {
            if (screenTagHistory.getFragment() != null) {
                hashMap.put("fragment", screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                hashMap.put(AccountAnalytics.STORE, screenTagHistory.getStore());
            }
        }
        if (!(screenTagHistory2 == null || screenTagHistory2.getTag() == null)) {
            hashMap.put(StoreTabGridRecyclerFragment.BundleCons.TAG, screenTagHistory2.getTag());
        }
        hashMap.put("appcoins_type", mapAppCoinsInfo(z, z2));
        hashMap.put("package_name", str);
        hashMap.put("application_publisher", str2);
        hashMap.put("trusted_badge", str3);
        return hashMap;
    }

    private Map<String, Object> createEditorsChoiceClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!(screenTagHistory == null || screenTagHistory.getFragment() == null)) {
            hashMap.put("fragment", screenTagHistory.getFragment());
        }
        hashMap.put("package_name", str);
        hashMap.put("position", str2);
        return hashMap;
    }

    private Map<String, Object> createEditorsClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(APPLICATION_NAME, str);
        hashMap.put("Search Position", str2);
        if (!(screenTagHistory == null || screenTagHistory.getFragment() == null)) {
            hashMap.put("fragment", screenTagHistory.getFragment());
        }
        return hashMap;
    }

    private Map<String, Object> createFlagAppEventData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, str);
        hashMap.put("flag_details", str2);
        return hashMap;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private Map<String, Object> createSimilarAppsEventData(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "Open App on Recommended for you");
        hashMap.put("bundle_tag", str);
        return hashMap;
    }

    private HashMap<String, Object> getABTestMap(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("group", str);
        return hashMap;
    }

    private HashMap<String, Object> getSimilarABTestData(boolean z) {
        return getABTestMap(z ? "control" : "appc_bundle");
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String mapAppCoinsInfo(boolean z, boolean z2) {
        return (!z || !z2) ? z ? "AppCoins IAB" : z2 ? "AppCoins Ads" : "None" : "AppCoins Ads IAB";
    }

    private InstallType mapDownloadAction(DownloadModel.Action action) {
        InstallType installType = InstallType.INSTALL;
        int i = C13831.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i == 1) {
            return InstallType.DOWNGRADE;
        }
        if (i == 2) {
            return InstallType.INSTALL;
        }
        if (i == 3) {
            return InstallType.UPDATE;
        }
        if (i != 4 && i != 5) {
            return installType;
        }
        throw new IllegalStateException("Mapping an invalid download action " + action.name());
    }

    private String mapToPromotionOffer(String str) {
        if (str.equals("BONUS_MIGRATION_19")) {
            return BONUS_MIGRATION_APPVIEW;
        }
        return str.equals("BONUS_GAME_WALLET_OFFER_19") ? BONUS_GAME_WALLET_OFFER_19 : "N/A";
    }

    private void sendClickOnClaimAppcWalletPromotion(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "claim");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendClickOnNoThanksWalletInstall(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "no thanks");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendInstallAppcWalletEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "install wallet");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendPromotionImpressionEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, IMPRESSION);
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    private void similarAppInteract(ApplicationAd.Network network, String str, String str2, int i, boolean z) {
        AnalyticsManager.Action action;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(NETWORK, network.getName());
        }
        hashMap.put(ACTION, str);
        hashMap.put(IS_AD, z ? "true" : AdultContentAnalytics.UNLOCK);
        if (str.equals(TAP_ON_APP)) {
            hashMap.put(PACKAGE_NAME, str2);
            hashMap.put(POSITION, Integer.valueOf(i));
        }
        AnalyticsManager analyticsManager2 = this.analyticsManager;
        if (str.equals(IMPRESSION)) {
            action = AnalyticsManager.Action.IMPRESSION;
        } else {
            action = AnalyticsManager.Action.CLICK;
        }
        analyticsManager2.logEvent(hashMap, SIMILAR_APP_INTERACT, action, this.navigationTracker.getViewName(true));
    }

    private void similarAppcAppClick(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, TAP_ON_APP);
        hashMap.put(PACKAGE_NAME, str);
        hashMap.put(POSITION, Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, APPC_SIMILAR_APP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void clickOnInstallButton(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, String str7, boolean z4, boolean z5) {
        String viewName = getViewName(true);
        HashMap hashMap = new HashMap();
        String str8 = str3;
        hashMap.put("type", str8);
        String str9 = str;
        hashMap.put(APPLICATION_NAME, str9);
        hashMap.put(APPLICATION_PUBLISHER, str2);
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z));
        hashMap.put(CONTEXT, viewName);
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        this.installAnalytics.clickOnInstallEvent(str9, str8, z, z2, z3, str4, str5, str6, str7, z4, z5);
        this.analyticsManager.logEvent(hashMap, CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendAppShareEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "App Share"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppViewOpenedFromEvent(String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        this.analyticsManager.logEvent(createAppViewedFromMap(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str4, str2, str3, z, z2), APP_VIEW_OPEN_FROM, AnalyticsManager.Action.CLICK, getViewName(false));
        this.analyticsManager.logEvent(createAppViewDataMap(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str4, z, z2), OPEN_APP_VIEW, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendAppcInfoInteractEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "AppCoins Info View"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppcMigrationAppOpen() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "open");
        this.analyticsManager.logEvent(hashMap, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendAppcMigrationUpdateClick() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "update to appc");
        this.analyticsManager.logEvent(hashMap, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendBadgeClickEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Badge"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendClickOnClaimAppViewPromotion(String str) {
        sendClickOnClaimAppcWalletPromotion(mapToPromotionOffer(str));
    }

    public void sendClickOnNoThanksWallet(String str) {
        sendClickOnNoThanksWalletInstall(mapToPromotionOffer(str));
    }

    public void sendDonateClickAfterInstall() {
        this.analyticsManager.logEvent(createMapData(ACTION, "donate_click_after_install"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendDonateClickTopDonors() {
        this.analyticsManager.logEvent(createMapData(ACTION, "donate_click_top"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendDonateImpressionAfterInstall(String str) {
        this.analyticsManager.logEvent(createMapData(PACKAGE_NAME, str), DONATIONS_IMPRESSION, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendDownloadCancelEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "cancel");
    }

    public void sendDownloadPauseEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "pause");
    }

    public void sendEditorsChoiceClickEvent(String str, String str2) {
        this.analyticsManager.logEvent(createEditorsChoiceClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2), EDITORS_CHOICE_CLICKS, AnalyticsManager.Action.CLICK, getViewName(false));
        this.analyticsManager.logEvent(createEditorsClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2), HOME_PAGE_EDITORS_CHOICE_FLURRY, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendFlagAppEvent(String str) {
        this.analyticsManager.logEvent(createFlagAppEventData("Flag App", str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Follow Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendInstallAppcWallet(String str) {
        sendInstallAppcWalletEvent(mapToPromotionOffer(str));
    }

    public void sendInstallPromotionApp() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "install appc app");
        this.analyticsManager.logEvent(hashMap, BONUS_GAME_WALLET_OFFER_19, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendInvalidAppEventError(String str, int i, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4) {
        this.downloadAnalytics.sendAppNotValidError(str, i, mapDownloadAction(action), offerResponseStatus, z, z2, z3, str2, str3, z4, th, z5, str4);
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenScreenshotEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Screenshot"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenVideoEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Video"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOtherVersionsEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Other Versions"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionImpression(String str) {
        if (str.equals("BONUS_MIGRATION_19")) {
            sendPromotionImpressionEvent(BONUS_MIGRATION_APPVIEW);
        } else if (str.equals("BONUS_GAME_WALLET_OFFER_19")) {
            sendPromotionImpressionEvent(BONUS_GAME_WALLET_OFFER_19);
        }
    }

    public void sendRateThisAppEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Rate This App"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendReadAllEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read All"), APP_VIEW_INTERACT, AnalyticsManager.Action.VIEW, getViewName(true));
    }

    public void sendReadMoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read More"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendRemoteInstallEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Install on TV"), APP_VIEW_INTERACT, AnalyticsManager.Action.INSTALL, getViewName(true));
    }

    public void sendSimilarABTestGroupEvent(boolean z) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("AppViewAnalytics", "similar_apps_control_group: " + z);
    }

    public void sendSimilarAppsInteractEvent(String str) {
        this.analyticsManager.logEvent(createSimilarAppsEventData(str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(Store store) {
        this.storeAnalytics.sendStoreOpenEvent("App View", store.getName(), true);
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i, String str, DownloadModel.Action action, AnalyticsManager.Action action2, String str2, String str3, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str4, boolean z, String str5) {
        DownloadModel.Action action3 = action;
        if (DownloadModel.Action.MIGRATE.equals(action3)) {
            this.downloadAnalytics.migrationClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, InstallType.UPDATE_TO_APPC, action2, offerResponseStatus, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5);
            this.downloadAnalytics.downloadStartEvent(roomDownload, i, str, DownloadAnalytics.AppContext.APPVIEW, action2, true, z);
            return;
        }
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, mapDownloadAction(action3), action2, offerResponseStatus, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5);
        this.downloadAnalytics.downloadStartEvent(roomDownload, i, str, DownloadAnalytics.AppContext.APPVIEW, action2, false, z);
    }

    public void similarAppBundleImpression(ApplicationAd.Network network, boolean z) {
        similarAppInteract(network, IMPRESSION, (String) null, -1, z);
    }

    public void similarAppClick(AppViewSimilarAppsAdapter.SimilarAppType similarAppType, ApplicationAd.Network network, String str, int i, boolean z) {
        if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.APPC_SIMILAR_APPS)) {
            similarAppcAppClick(i, str);
        } else if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.SIMILAR_APPS)) {
            similarAppInteract(network, TAP_ON_APP, str, i, z);
        }
    }

    public void similarAppcAppBundleImpression() {
        HashMap hashMap = new HashMap();
        hashMap.put(IS_AD, false);
        hashMap.put(ACTION.toLowerCase(), AnalyticsManager.Action.IMPRESSION.name().toLowerCase());
        this.analyticsManager.logEvent(hashMap, APPC_SIMILAR_APP_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }
}
