package p015cm.aptoide.p016pt.editorial;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.InstallAnalytics;

/* renamed from: cm.aptoide.pt.editorial.EditorialAnalytics */
public class EditorialAnalytics {
    private static final String ACTION = "action";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    public static final String CURATION_CARD_INSTALL = "Curation_Card_Install";
    private static final String CURATION_DETAIL = "curation_detail";
    public static final String EDITORIAL_BN_CURATION_CARD_INSTALL = "Editorial_BN_Curation_Card_Install";
    public static final String REACTION_INTERACT = "Reaction_Interact";
    private static final String TYPE = "type";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final boolean fromHome;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public EditorialAnalytics(DownloadAnalytics downloadAnalytics2, AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, boolean z, InstallAnalytics installAnalytics2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        this.downloadAnalytics = downloadAnalytics2;
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.fromHome = z;
        this.installAnalytics = installAnalytics2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void clickOnInstallButton(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4) {
        String viewName = getViewName(true);
        String str6 = !this.fromHome ? EDITORIAL_BN_CURATION_CARD_INSTALL : CURATION_CARD_INSTALL;
        HashMap hashMap = new HashMap();
        String str7 = str;
        hashMap.put(APPLICATION_NAME, str7);
        String str8 = str2;
        hashMap.put("type", str8);
        hashMap.put(CONTEXT, viewName);
        this.installAnalytics.clickOnInstallEvent(str7, str8, z, z2, z3, str3, "unknown", str4, str5, false, z4);
        this.analyticsManager.logEvent(hashMap, str6, AnalyticsManager.Action.CLICK, viewName);
        this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendDeletedEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "delete_reaction");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendDownloadCancelEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "cancel");
    }

    public void sendDownloadPauseEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "pause");
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendReactedEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "click_to_react");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendReactionButtonClickEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "view_reactions");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i, String str, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str2, String str3, String str4) {
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), action, offerResponseStatus, false, roomDownload.hasAppc(), roomDownload.hasSplits(), str2, (String) null, str3, str4, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
        this.downloadAnalytics.downloadStartEvent(roomDownload, i, str, DownloadAnalytics.AppContext.EDITORIAL, action, false, false);
    }
}
