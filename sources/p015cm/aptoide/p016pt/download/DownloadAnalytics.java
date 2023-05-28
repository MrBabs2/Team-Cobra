package p015cm.aptoide.p016pt.download;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.DeepLinkManager;

/* renamed from: cm.aptoide.pt.download.DownloadAnalytics */
public class DownloadAnalytics implements p015cm.aptoide.p016pt.downloadmanager.DownloadAnalytics {
    private static final String AB_TEST_GROUP = "ab_test_group";
    private static final String ACTION = "action";
    private static final String ADS_BLOCKED = "ads_status";
    private static final String ADS_BLOCK_BY_OFFER = "ads_block_by_offer";
    private static final String APP = "app";
    private static final String APPC = "appc";
    private static final String APP_AAB = "app_aab";
    private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
    private static final String APP_APPC = "app_appc";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_MIGRATION = "app_migration";
    private static final String APP_OBB = "app_obb";
    private static final String APP_VERSION_CODE = "app_version_code";
    private static final String CAMPAIGN_ID = "campaign_id";
    private static final String CONTEXT = "context";
    public static final String DOWNLOAD_COMPLETE_EVENT = "Download Complete";
    public static final String DOWNLOAD_EVENT_NAME = "DOWNLOAD";
    public static final String DOWNLOAD_INTERACT = "Download_Interact";
    public static final String EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME = "Editors_Choice_Download_Complete";
    private static final String ERROR = "error";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String ERROR_TYPE = "error_type";
    private static final String FAIL = "FAIL";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String MAIN = "MAIN";
    private static final String MESSAGE = "message";
    private static final String MIGRATOR = "migrator";
    private static final String MIRROR = "mirror";
    private static final String MIUI_AAB_FIX = "miui_aab_fix";
    private static final String NETWORK = "network";
    public static final String NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME = "Aptoide_Push_Notification_Download_Complete";
    private static final String OBB = "obb";
    private static final String ORIGIN = "origin";
    private static final String PACKAGE = "package";
    private static final String PACKAGENAME = "Package Name";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PATCH = "PATCH";
    private static final String POSITION = "position";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    private static final String PREVIOUS_TAG = "previous_tag";
    public static final String RAKAM_DOWNLOAD_EVENT = "download";
    private static final String RESULT = "result";
    private static final String STATUS = "status";
    private static final String STORE = "store";
    private static final String SUCCESS = "SUCC";
    private static final String TAG = "tag";
    private static final String TELECO = "teleco";
    private static final String TRUSTED_BADGE = "Trusted Badge";
    private static final String TYPE = "type";
    private static final String UPDATE_TO_APPC = "UPDATE TO APPC";
    private static final String URL = "url";
    private final AnalyticsManager analyticsManager;
    private final Map<String, DownloadEvent> cache = new HashMap();
    private final ConnectivityManager connectivityManager;
    private final NavigationTracker navigationTracker;
    private final TelephonyManager telephonyManager;

    /* renamed from: cm.aptoide.pt.download.DownloadAnalytics$AppContext */
    public enum AppContext {
        TIMELINE,
        APPVIEW,
        UPDATE_TAB,
        APPS_FRAGMENT,
        APPS_MIGRATOR_SEE_MORE,
        AUTO_UPDATE,
        DOWNLOADS,
        EDITORIAL,
        PROMOTIONS,
        WALLET_INSTALL_ACTIVITY,
        SEARCH
    }

    /* renamed from: cm.aptoide.pt.download.DownloadAnalytics$DownloadEvent */
    public static class DownloadEvent {
        private final AnalyticsManager.Action action;
        private final String context;
        private final Map<String, Object> data;
        private final String eventName;
        private boolean hadProgress;

        public AnalyticsManager.Action getAction() {
            return this.action;
        }

        public String getContext() {
            return this.context;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public String getEventName() {
            return this.eventName;
        }

        public boolean isHadProgress() {
            return this.hadProgress;
        }

        public void setHadProgress(boolean z) {
            this.hadProgress = z;
        }

        private DownloadEvent(String str, Map<String, Object> map, AppContext appContext, AnalyticsManager.Action action2) {
            this.data = map;
            this.eventName = str;
            this.action = action2;
            this.context = appContext.name();
            this.hadProgress = false;
        }

        public DownloadEvent(String str, HashMap<String, Object> hashMap, String str2, AnalyticsManager.Action action2) {
            this.data = hashMap;
            this.eventName = str;
            this.action = action2;
            this.context = str2;
            this.hadProgress = false;
        }
    }

    public DownloadAnalytics(ConnectivityManager connectivityManager2, TelephonyManager telephonyManager2, NavigationTracker navigationTracker2, AnalyticsManager analyticsManager2) {
        this.connectivityManager = connectivityManager2;
        this.telephonyManager = telephonyManager2;
        this.navigationTracker = navigationTracker2;
        this.analyticsManager = analyticsManager2;
    }

    private Map<String, Object> createAppData(RoomDownload roomDownload) {
        HashMap hashMap = new HashMap();
        hashMap.put("package", roomDownload.getPackageName());
        hashMap.put(APPC, Boolean.valueOf(roomDownload.hasAppc()));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(roomDownload.hasSplits()));
        return hashMap;
    }

    private HashMap<String, Object> createDownloadCompleteEventMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(PACKAGENAME, str);
        hashMap.put(CONTEXT, str3);
        hashMap.put(TRUSTED_BADGE, str2);
        hashMap.put(APPC, Boolean.valueOf(z2));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z3));
        hashMap.put(MIGRATOR, Boolean.valueOf(z));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        if (screenTagHistory != null) {
            hashMap.put("tag", screenTagHistory2.getTag());
            if (screenTagHistory.getFragment() != null) {
                hashMap.put(PREVIOUS_CONTEXT, screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                hashMap.put("store", screenTagHistory.getStore());
            }
        }
        return hashMap;
    }

    private Map<String, Object> createObbData(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (i == 1) {
            hashMap.put(MIRROR, str2);
            hashMap.put("type", MAIN);
        } else if (i == 2) {
            hashMap.put(MIRROR, str2);
            hashMap.put("type", PATCH);
        }
        hashMap.put(URL, str);
        return hashMap;
    }

    private HashMap<String, Object> createRakamDownloadEvent(String str, int i, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, String str5, String str6, String str7, boolean z5, String str8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        String str9 = str6;
        hashMap.put(CONTEXT, str6);
        hashMap.put("action", str2.toLowerCase());
        String str10 = str;
        hashMap.put("package_name", str);
        hashMap.put(APP_VERSION_CODE, Integer.valueOf(i));
        String str11 = str5;
        hashMap.put(PREVIOUS_CONTEXT, str5);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z));
        hashMap.put(APP_APPC, Boolean.valueOf(z3));
        hashMap.put(APP_AAB, Boolean.valueOf(z2));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(MIUI_AAB_FIX, Long.valueOf(AptoideUtils.getMIUITimestamp()));
        hashMap.put(APP_AAB_INSTALL_TIME, str8);
        if (str3 != null) {
            hashMap.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        hashMap.put(ADS_BLOCKED, offerResponseStatus.toString().toLowerCase());
        if (!str7.isEmpty()) {
            hashMap.put("tag", str7);
        }
        String str12 = str4;
        hashMap.put("store", str4);
        return hashMap;
    }

    private void editorsChoiceDownloadCompletedEvent(String str, String str2, String str3, String str4, InstallType installType, String str5, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3) {
        if (str4 != null && !str4.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(PACKAGENAME, str3);
            hashMap.put(CONTEXT, str5);
            hashMap.put(PREVIOUS_CONTEXT, str);
            hashMap.put(POSITION, str4);
            hashMap.put("type", installType.name());
            hashMap.put(APPC, Boolean.valueOf(z));
            hashMap.put(APP_BUNDLE, Boolean.valueOf(z2));
            hashMap.put(IS_APKFY, Boolean.valueOf(z3));
            DownloadEvent downloadEvent = new DownloadEvent(EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, (HashMap<String, Object>) hashMap, str5, action);
            Map<String, DownloadEvent> map = this.cache;
            map.put(str2 + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
        }
    }

    private void handleRakamOnError(String str, Throwable th) {
        Map<String, DownloadEvent> map = this.cache;
        DownloadEvent downloadEvent = map.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "fail");
            data.put(ERROR_TYPE, th.getClass().getSimpleName());
            data.put(ERROR_MESSAGE, th.getMessage());
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            Map<String, DownloadEvent> map2 = this.cache;
            map2.remove(str + RAKAM_DOWNLOAD_EVENT);
        }
    }

    private void pushNotificationDownloadEvent(String str, String str2, String str3, InstallType installType, AnalyticsManager.Action action, String str4, boolean z) {
        if (str.equals(DeepLinkManager.DEEPLINK_KEY)) {
            HashMap hashMap = new HashMap();
            hashMap.put(PACKAGENAME, str3);
            hashMap.put("type", installType.name());
            hashMap.put(IS_APKFY, Boolean.valueOf(z));
            DownloadEvent downloadEvent = new DownloadEvent(NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, (HashMap<String, Object>) hashMap, str4, action);
            Map<String, DownloadEvent> map = this.cache;
            map.put(str2 + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
        }
    }

    private void rakamDownloadCompleteEvent(String str, String str2, int i, String str3, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, String str6) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, createRakamDownloadEvent(str2, i, str3, offerResponseStatus, z, z2, z3, str4, str5, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : "", z5, str6), currentViewName, AnalyticsManager.Action.CLICK);
        Map<String, DownloadEvent> map = this.cache;
        map.put(str + RAKAM_DOWNLOAD_EVENT, downloadEvent);
    }

    private void sendDownloadCompletedEvent(String str, int i) {
        String str2 = str + i + DOWNLOAD_EVENT_NAME;
        DownloadEvent downloadEvent = this.cache.get(str2);
        if (downloadEvent.isHadProgress()) {
            Map<String, Object> data = downloadEvent.getData();
            HashMap hashMap = new HashMap();
            hashMap.put(STATUS, SUCCESS);
            data.put(RESULT, hashMap);
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str2);
        }
    }

    private void sendDownloadEvent(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent != null && downloadEvent.isHadProgress()) {
            this.analyticsManager.logEvent(downloadEvent.getData(), downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str);
        }
    }

    private void sendRakamDownloadEvent(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent != null && downloadEvent.isHadProgress()) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str);
        }
    }

    private void setUpInstallEvent(String str, int i, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str5, boolean z4, boolean z5, String str6) {
        WalletAdsOfferManager.OfferResponseStatus offerResponseStatus2 = offerResponseStatus;
        String viewName = this.navigationTracker.getViewName(true);
        boolean z6 = z2;
        rakamDownloadCompleteEvent(str, str2, i, installType.toString(), offerResponseStatus, z, z3, z6, str3, str5, z4, z5, str6);
        String str7 = viewName;
        String str8 = str;
        String str9 = str2;
        String str10 = viewName;
        editorsChoiceDownloadCompletedEvent(str7, str8, str9, str4, installType, str10, action, z6, z3, z4);
        pushNotificationDownloadEvent(str7, str8, str9, installType, action, str10, z4);
        if (!offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.NO_ADS)) {
            downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, viewName, offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE), z, z2, z3, z4);
            return;
        }
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, viewName, z, Boolean.valueOf(z2), z3, z4);
    }

    private void updateDownloadEventWithHasProgress(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent != null) {
            downloadEvent.setHadProgress(true);
            return;
        }
        Logger instance = Logger.getInstance();
        instance.mo12975d("DownloadAnalytics", "Tried setting progress on an event that was not setup " + str);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        HashMap<String, Object> createDownloadCompleteEventMap = createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z2, z3, z4, str4, z5);
        createDownloadCompleteEventMap.put(ADS_BLOCK_BY_OFFER, Boolean.valueOf(z));
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, createDownloadCompleteEventMap, str4, action);
        Map<String, DownloadEvent> map = this.cache;
        StringBuilder sb = new StringBuilder();
        String str5 = str;
        sb.append(str);
        sb.append(DOWNLOAD_COMPLETE_EVENT);
        map.put(sb.toString(), downloadEvent);
    }

    public void downloadInteractEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("package_name", str);
        hashMap.put("action", str2);
        this.analyticsManager.logEvent(hashMap, DOWNLOAD_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void downloadStartEvent(RoomDownload roomDownload, AnalyticsManager.Action action, AppContext appContext, Boolean bool) {
        downloadStartEvent(roomDownload, 0, (String) null, appContext, action, bool.booleanValue(), getOrigin(roomDownload.getAction()), false);
    }

    public Origin getOrigin(int i) {
        if (i == 0) {
            return Origin.INSTALL;
        }
        if (i == 1) {
            return Origin.UPDATE;
        }
        if (i != 2) {
            return Origin.INSTALL;
        }
        return Origin.DOWNGRADE;
    }

    public void installClicked(String str, int i, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6) {
        setUpInstallEvent(str, i, str2, str3, str4, installType, action, offerResponseStatus, false, z, z2, str5, z3, z4, str6);
    }

    public void migrationClicked(String str, int i, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6) {
        setUpInstallEvent(str, i, str2, str3, str4, installType, action, offerResponseStatus, true, z, z2, str5, z3, z4, str6);
    }

    public void onDownloadComplete(String str, String str2, int i) {
        sendDownloadCompletedEvent(str2, i);
        sendDownloadEvent(str + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendDownloadEvent(str + DOWNLOAD_COMPLETE_EVENT);
        sendDownloadEvent(str + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendRakamDownloadEvent(str + RAKAM_DOWNLOAD_EVENT);
    }

    public void onError(String str, int i, String str2, Throwable th) {
        String str3 = str + i + DOWNLOAD_EVENT_NAME;
        handleRakamOnError(str2, th);
        DownloadEvent downloadEvent = this.cache.get(str3);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put(STATUS, FAIL);
            hashMap2.put("type", th.getClass().getSimpleName());
            hashMap2.put(MESSAGE, th.getMessage());
            hashMap.put(ERROR, hashMap2);
            data.put(RESULT, hashMap);
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str3);
        }
    }

    public void sendAppNotValidError(String str, int i, InstallType installType, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        HashMap<String, Object> createRakamDownloadEvent = createRakamDownloadEvent(str, i, installType.toString(), offerResponseStatus, z, z2, z3, str2, str3, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : "", z5, str4);
        createRakamDownloadEvent.put(STATUS, "fail");
        createRakamDownloadEvent.put(ERROR_TYPE, th.getClass().getSimpleName());
        createRakamDownloadEvent.put(ERROR_MESSAGE, th.getMessage());
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, createRakamDownloadEvent, currentViewName, AnalyticsManager.Action.CLICK);
        this.analyticsManager.logEvent(createRakamDownloadEvent, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
    }

    public void sendNotEnoughSpaceError(String str) {
        Map<String, DownloadEvent> map = this.cache;
        DownloadEvent downloadEvent = map.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "incomplete");
            data.put(ERROR_TYPE, "FileDownloadOutOfSpace");
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        }
    }

    public void startProgress(RoomDownload roomDownload) {
        updateDownloadEventWithHasProgress(roomDownload.getPackageName() + roomDownload.getVersionCode() + DOWNLOAD_EVENT_NAME);
        StringBuilder sb = new StringBuilder();
        sb.append(roomDownload.getMd5());
        sb.append(DOWNLOAD_COMPLETE_EVENT);
        updateDownloadEventWithHasProgress(sb.toString());
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + RAKAM_DOWNLOAD_EVENT);
    }

    public void updateDownloadEvent(String str, String str2, int i, String str3, String str4) {
        Map<String, DownloadEvent> map = this.cache;
        Map<String, Object> data = map.get(str2 + str + DOWNLOAD_EVENT_NAME).getData();
        if (data == null) {
            return;
        }
        if (i == 0) {
            Map map2 = (Map) data.get(APP);
            map2.put(MIRROR, str3);
            map2.put(URL, str4);
            return;
        }
        List list = (List) data.get(OBB);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(createObbData(i, str4, str3));
        data.put(OBB, list);
    }

    public void installClicked(String str, String str2, int i, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        setUpInstallEvent(str, str2, i, action, offerResponseStatus, z, z2, z3, str3, str5, str6, z4, str7);
    }

    public void migrationClicked(String str, String str2, int i, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, String str3, String str4, String str5, boolean z2, String str6) {
        setUpInstallEvent(str, str2, i, action, offerResponseStatus, true, true, z, str3, str5, "update_to_appc", z2, str6);
    }

    public void downloadStartEvent(RoomDownload roomDownload, AnalyticsManager.Action action, AppContext appContext, Boolean bool, Origin origin) {
        downloadStartEvent(roomDownload, 0, (String) null, appContext, action, bool.booleanValue(), origin, false);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, Boolean bool, boolean z2, boolean z3) {
        String str5 = str4;
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z, bool.booleanValue(), z2, str4, z3), str5, action);
        Map<String, DownloadEvent> map = this.cache;
        StringBuilder sb = new StringBuilder();
        String str6 = str;
        sb.append(str);
        sb.append(DOWNLOAD_COMPLETE_EVENT);
        map.put(sb.toString(), downloadEvent);
    }

    public void downloadStartEvent(RoomDownload roomDownload, int i, String str, AppContext appContext, AnalyticsManager.Action action, boolean z, boolean z2) {
        downloadStartEvent(roomDownload, i, str, appContext, action, z, getOrigin(roomDownload.getAction()), z2);
    }

    public void downloadStartEvent(RoomDownload roomDownload, int i, String str, AppContext appContext, AnalyticsManager.Action action, boolean z, Origin origin, boolean z2) {
        HashMap hashMap = new HashMap();
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        hashMap.put(APP, createAppData(roomDownload));
        hashMap.put(NETWORK, AptoideUtils.SystemU.getConnectionType(this.connectivityManager).toUpperCase());
        hashMap.put(IS_APKFY, Boolean.valueOf(z2));
        if (z) {
            hashMap.put(ORIGIN, UPDATE_TO_APPC);
        } else {
            hashMap.put(ORIGIN, origin);
        }
        hashMap.put(PREVIOUS_CONTEXT, previousScreen.getFragment());
        hashMap.put("tag", this.navigationTracker.getCurrentScreen().getTag());
        hashMap.put("store", this.navigationTracker.getPreviousScreen().getStore());
        hashMap.put(TELECO, AptoideUtils.SystemU.getCarrierName(this.telephonyManager));
        hashMap.put(MIGRATOR, Boolean.valueOf(z));
        if (i > 0) {
            hashMap.put(CAMPAIGN_ID, Integer.valueOf(i));
            hashMap.put(AB_TEST_GROUP, str);
        }
        Map<String, DownloadEvent> map = this.cache;
        map.put(roomDownload.getPackageName() + roomDownload.getVersionCode() + DOWNLOAD_EVENT_NAME, new DownloadEvent(DOWNLOAD_EVENT_NAME, hashMap, appContext, action));
    }

    public void downloadCompleteEvent(String str, String str2, String str3, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        WalletAdsOfferManager.OfferResponseStatus offerResponseStatus2 = offerResponseStatus;
        String viewName = this.navigationTracker.getViewName(true);
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        if (!offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.NO_ADS)) {
            downloadCompleteEvent(previousScreen, currentScreen, str, str2, str3, action, viewName, offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE), false, z, false);
            return;
        }
        downloadCompleteEvent(previousScreen, currentScreen, str, str2, str3, action, viewName, false, false, z, false);
    }

    private void setUpInstallEvent(String str, String str2, int i, AnalyticsManager.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, String str6) {
        WalletAdsOfferManager.OfferResponseStatus offerResponseStatus2 = offerResponseStatus;
        String viewName = this.navigationTracker.getViewName(true);
        rakamDownloadCompleteEvent(str, str2, i, str5, offerResponseStatus, z, z3, z2, str3, str4, false, z4, str6);
        if (!offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.NO_ADS)) {
            downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, (String) null, action, viewName, offerResponseStatus2.equals(WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE), z, z2, z3, false);
            return;
        }
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, (String) null, action, viewName, z, Boolean.valueOf(z2), z3, false);
    }
}
