package p015cm.aptoide.p016pt.wallet;

import java.util.HashMap;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\n\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020%J\u0010\u0010/\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u00010\u0012JB\u00101\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020%H\u0002J(\u0010>\u001a\u00020+2\u0006\u00102\u001a\u0002032\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010?\u001a\u00020@2\u0006\u0010;\u001a\u00020<J\u0006\u0010A\u001a\u00020+R\u000e\u0010\u0011\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006B"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "notificationAnalytics", "Lcm/aptoide/pt/notification/NotificationAnalytics;", "installAnalytics", "Lcm/aptoide/pt/install/InstallAnalytics;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "splitAnalyticsMapper", "Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "(Lcm/aptoide/pt/download/DownloadAnalytics;Lcm/aptoide/pt/notification/NotificationAnalytics;Lcm/aptoide/pt/install/InstallAnalytics;Lcm/aptoide/pt/app/DownloadStateParser;Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;Lcm/aptoide/pt/download/SplitAnalyticsMapper;)V", "APPLICATION_NAME", "", "APPLICATION_PUBLISHER", "APP_BUNDLE", "CLICK_INSTALL", "TYPE", "VIEW_CONTEXT", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getDownloadAnalytics", "()Lcm/aptoide/pt/download/DownloadAnalytics;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getInstallAnalytics", "()Lcm/aptoide/pt/install/InstallAnalytics;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "getNotificationAnalytics", "()Lcm/aptoide/pt/notification/NotificationAnalytics;", "shouldRegister", "", "getSplitAnalyticsMapper", "()Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "getHistoryTracker", "Lcm/aptoide/analytics/implementation/navigation/ScreenTagHistory;", "sendClickOnInstallButtonEvent", "", "packageName", "applicationPublisher", "hasSplits", "sendNotEnoughSpaceErrorEvent", "md5", "setupDownloadAnalyticsEvents", "download", "Lcm/aptoide/pt/database/room/RoomDownload;", "campaignId", "", "abTestGroup", "downloadAction", "Lcm/aptoide/pt/app/DownloadModel$Action;", "action", "Lcm/aptoide/analytics/AnalyticsManager$Action;", "offerResponseStatus", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "hasObbs", "setupDownloadEvents", "appId", "", "setupHistoryTracker", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallAnalytics */
/* compiled from: WalletInstallAnalytics.kt */
public final class WalletInstallAnalytics {
    private final String APPLICATION_NAME = "Application Name";
    private final String APPLICATION_PUBLISHER = "Application Publisher";
    private final String APP_BUNDLE = "app_bundle";
    private final String CLICK_INSTALL = AppViewAnalytics.CLICK_INSTALL;
    private final String TYPE = "type";
    private final String VIEW_CONTEXT = "WalletInstallActivity";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadStateParser downloadStateParser;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final NotificationAnalytics notificationAnalytics;
    private boolean shouldRegister = true;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public WalletInstallAnalytics(DownloadAnalytics downloadAnalytics2, NotificationAnalytics notificationAnalytics2, InstallAnalytics installAnalytics2, DownloadStateParser downloadStateParser2, AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        C10202j.m34178b(downloadAnalytics2, "downloadAnalytics");
        C10202j.m34178b(notificationAnalytics2, "notificationAnalytics");
        C10202j.m34178b(installAnalytics2, "installAnalytics");
        C10202j.m34178b(downloadStateParser2, "downloadStateParser");
        C10202j.m34178b(analyticsManager2, "analyticsManager");
        C10202j.m34178b(navigationTracker2, "navigationTracker");
        C10202j.m34178b(splitAnalyticsMapper2, "splitAnalyticsMapper");
        this.downloadAnalytics = downloadAnalytics2;
        this.notificationAnalytics = notificationAnalytics2;
        this.installAnalytics = installAnalytics2;
        this.downloadStateParser = downloadStateParser2;
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
    }

    private final ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(this.VIEW_CONTEXT);
    }

    private final void setupDownloadAnalyticsEvents(RoomDownload roomDownload, int i, String str, DownloadModel.Action action, AnalyticsManager.Action action2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        DownloadModel.Action action3 = action;
        this.downloadAnalytics.downloadStartEvent(roomDownload, i, str, DownloadAnalytics.AppContext.WALLET_INSTALL_ACTIVITY, action2, false, false);
        if (action3 == DownloadModel.Action.INSTALL) {
            DownloadAnalytics downloadAnalytics2 = this.downloadAnalytics;
            String md5 = roomDownload.getMd5();
            String packageName = roomDownload.getPackageName();
            int versionCode = roomDownload.getVersionCode();
            boolean hasAppc = roomDownload.hasAppc();
            boolean hasSplits = roomDownload.hasSplits();
            String trustedBadge = roomDownload.getTrustedBadge();
            String storeName = roomDownload.getStoreName();
            String str2 = action2.toString();
            SplitAnalyticsMapper splitAnalyticsMapper2 = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits = roomDownload.getSplits();
            C10202j.m34174a((Object) splits, "download.splits");
            downloadAnalytics2.installClicked(md5, packageName, versionCode, action2, offerResponseStatus, false, hasAppc, hasSplits, trustedBadge, (String) null, storeName, str2, z, splitAnalyticsMapper2.getSplitTypesAsString(splits));
        }
        if (DownloadModel.Action.MIGRATE == action3) {
            DownloadAnalytics downloadAnalytics3 = this.downloadAnalytics;
            String md52 = roomDownload.getMd5();
            String packageName2 = roomDownload.getPackageName();
            int versionCode2 = roomDownload.getVersionCode();
            boolean hasSplits2 = roomDownload.hasSplits();
            String trustedBadge2 = roomDownload.getTrustedBadge();
            String storeName2 = roomDownload.getStoreName();
            SplitAnalyticsMapper splitAnalyticsMapper3 = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits2 = roomDownload.getSplits();
            C10202j.m34174a((Object) splits2, "download.splits");
            downloadAnalytics3.migrationClicked(md52, packageName2, versionCode2, action2, offerResponseStatus, hasSplits2, trustedBadge2, (String) null, storeName2, z, splitAnalyticsMapper3.getSplitTypesAsString(splits2));
        }
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final DownloadAnalytics getDownloadAnalytics() {
        return this.downloadAnalytics;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final InstallAnalytics getInstallAnalytics() {
        return this.installAnalytics;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final NotificationAnalytics getNotificationAnalytics() {
        return this.notificationAnalytics;
    }

    public final SplitAnalyticsMapper getSplitAnalyticsMapper() {
        return this.splitAnalyticsMapper;
    }

    public final void sendClickOnInstallButtonEvent(String str, String str2, boolean z) {
        C10202j.m34178b(str, "packageName");
        C10202j.m34178b(str2, "applicationPublisher");
        HashMap hashMap = new HashMap();
        hashMap.put(this.TYPE, "Install");
        hashMap.put(this.APPLICATION_NAME, str);
        hashMap.put(this.APPLICATION_PUBLISHER, str2);
        hashMap.put(this.APP_BUNDLE, Boolean.valueOf(z));
        this.analyticsManager.logEvent(hashMap, this.CLICK_INSTALL, AnalyticsManager.Action.CLICK, this.VIEW_CONTEXT);
    }

    public final void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public final void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        DownloadModel.Action action2 = action;
        long j2 = j;
        C10202j.m34178b(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(offerResponseStatus, "offerResponseStatus");
        int campaignId = this.notificationAnalytics.getCampaignId(roomDownload.getPackageName(), j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(roomDownload.getPackageName(), j2);
        C10202j.m34174a((Object) abTestingGroup, "abTestGroup");
        setupDownloadAnalyticsEvents(roomDownload, campaignId, abTestingGroup, action, AnalyticsManager.Action.CLICK, offerResponseStatus, roomDownload.hasObbs());
        InstallAnalytics installAnalytics2 = this.installAnalytics;
        String packageName = roomDownload.getPackageName();
        int versionCode = roomDownload.getVersionCode();
        AnalyticsManager.Action action3 = AnalyticsManager.Action.INSTALL;
        DownloadAnalytics.AppContext appContext = DownloadAnalytics.AppContext.WALLET_INSTALL_ACTIVITY;
        Origin origin = this.downloadStateParser.getOrigin(roomDownload.getAction());
        boolean z = action2 != null && action2 == DownloadModel.Action.MIGRATE;
        boolean hasAppc = roomDownload.hasAppc();
        boolean hasSplits = roomDownload.hasSplits();
        String str = offerResponseStatus.toString();
        String trustedBadge = roomDownload.getTrustedBadge();
        String storeName = roomDownload.getStoreName();
        boolean hasObbs = roomDownload.hasObbs();
        SplitAnalyticsMapper splitAnalyticsMapper2 = this.splitAnalyticsMapper;
        List<RoomFileToDownload> splits = roomDownload.getSplits();
        C10202j.m34174a((Object) splits, "download.splits");
        installAnalytics2.installStarted(packageName, versionCode, action3, appContext, origin, campaignId, abTestingGroup, z, hasAppc, hasSplits, str, trustedBadge, storeName, false, hasObbs, splitAnalyticsMapper2.getSplitTypesAsString(splits));
    }

    public final void setupHistoryTracker() {
        ScreenTagHistory historyTracker = getHistoryTracker();
        if (this.shouldRegister) {
            if (historyTracker != null) {
                this.navigationTracker.registerScreen(historyTracker);
            } else {
                throw new RuntimeException("If " + WalletInstallAnalytics.class.getSimpleName() + " should be logged to screen history, it has to return a value on method NavigationTrackFragment#getHistoryTracker");
            }
        }
        this.shouldRegister = false;
    }
}
