package p015cm.aptoide.p016pt.promotions;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.install.InstallAnalytics;

/* renamed from: cm.aptoide.pt.promotions.PromotionsAnalytics */
public class PromotionsAnalytics {
    private static final String ACTION = "action";
    private static final String ACTION_CLAIM = "claim";
    private static final String ACTION_INSTALL = "install";
    private static final String ACTION_UPDATE = "update";
    private static final String AMOUNT = "amount";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    private static final String PACKAGE = "package";
    public static final String PROMOTIONS_INTERACT = "Promotions_Interact";
    public static final String PROMOTION_DIALOG = "Promotion_Dialog";
    public static final String VALENTINE_MIGRATOR = "Valentine_Migrator";
    private static final String VIEW = "view";
    private final String ACTION_OPEN = "open";
    private final String CANCEL = "cancel";
    private final String NEXT = "next";
    private final String OPEN_WALLET = "open wallet";
    private final String SIGNATURE = RoomInstalled.SIGNATURE;
    private final String WALLET_DIALOG = "wallet dialog";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;

    public PromotionsAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, DownloadAnalytics downloadAnalytics2, InstallAnalytics installAnalytics2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.downloadAnalytics = downloadAnalytics2;
        this.installAnalytics = installAnalytics2;
    }

    private HashMap<String, Object> createPromotionsInteractMap(String str, String str2, float f) {
        HashMap<String, Object> putPromotionAppAction = putPromotionAppAction(str, new HashMap());
        putPromotionAppAction.put("package", str2);
        putPromotionAppAction.put(AMOUNT, Float.valueOf(f));
        return putPromotionAppAction;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private HashMap<String, Object> putPromotionAppAction(String str, HashMap<String, Object> hashMap) {
        hashMap.put("action", str);
        return hashMap;
    }

    public void sendClickOnWalletDialogCancel(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "cancel");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogFindWallet(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "open wallet");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogNext(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "next");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenPromotionsFragmentEvent() {
        this.analyticsManager.logEvent(putPromotionAppAction("open", new HashMap()), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendPromotionsAppInteractClaimEvent(String str, float f) {
        this.analyticsManager.logEvent(createPromotionsInteractMap(ACTION_CLAIM, str, f), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionsAppInteractInstallEvent(String str, float f, DownloadModel.Action action, boolean z, boolean z2, String str2, String str3, String str4, boolean z3) {
        String str5;
        String str6 = str;
        DownloadModel.Action action2 = action;
        String viewName = getViewName(true);
        if (action2 == DownloadModel.Action.INSTALL) {
            str5 = "install";
        } else {
            str5 = action2 == DownloadModel.Action.UPDATE ? ACTION_UPDATE : null;
        }
        String str7 = str5;
        HashMap hashMap = new HashMap();
        hashMap.put(APPLICATION_NAME, str6);
        hashMap.put(CONTEXT, viewName);
        hashMap.put("action", str7);
        if (str7 != null) {
            this.installAnalytics.clickOnInstallEvent(str, str7, z, z2, str7.equals(DownloadModel.Action.MIGRATE.toString()), str2, "unknown", str3, str4, false, z3);
            this.analyticsManager.logEvent(createPromotionsInteractMap(str7, str6, f), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, viewName);
            this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
        }
    }

    public void sendValentineMigratorEvent(String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put("package", str);
        hashMap.put(RoomInstalled.SIGNATURE, bool.booleanValue() ? "same" : "different");
        this.analyticsManager.logEvent(hashMap, VALENTINE_MIGRATOR, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i, String str, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, Origin origin, boolean z) {
        this.downloadAnalytics.downloadStartEvent(roomDownload, i, str, DownloadAnalytics.AppContext.PROMOTIONS, action, false, origin, false);
        this.downloadAnalytics.downloadCompleteEvent(roomDownload.getMd5(), roomDownload.getPackageName(), "", action, offerResponseStatus, z);
    }
}
