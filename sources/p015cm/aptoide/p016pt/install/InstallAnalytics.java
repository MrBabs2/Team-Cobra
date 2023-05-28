package p015cm.aptoide.p016pt.install;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.DeepLinkManager;

/* renamed from: cm.aptoide.pt.install.InstallAnalytics */
public class InstallAnalytics {
    private static final String AB_TEST_GROUP = "ab_test_group";
    private static final String ACTION = "action";
    private static final String ADS_BLOCKED = "ads_status";
    private static final String APP = "app";
    private static final String APPC = "appc";
    public static final String APPLICATION_INSTALL = "Application Install";
    private static final String APP_AAB = "app_aab";
    private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
    private static final String APP_APPC = "app_appc";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_MIGRATION = "app_migration";
    private static final String APP_OBB = "app_obb";
    private static final String CAMPAIGN_ID = "campaign_id";
    private static final String CANCEL = "CANCEL";
    public static final String CLICK_ON_INSTALL = "click_on_install_button";
    private static final String CONTEXT = "context";
    public static final String EDITORS_APPLICATION_INSTALL = "Editors_Choice_Application_Install";
    private static final String EDITORS_CHOICE = "apps-group-editors-choice";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String ERROR_TYPE = "error_type";
    private static final String FAIL = "FAIL";
    public static final String INSTALL_EVENT_NAME = "INSTALL";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String MAIN = "MAIN";
    private static final String MESSAGE = "message";
    private static final int MIGRATION_UNINSTALL_KEY = 8726;
    private static final String MIGRATOR = "migrator";
    private static final String MIUI_AAB_FIX = "miui_aab_fix";
    private static final String NETWORK = "network";
    public static final String NOTIFICATION_APPLICATION_INSTALL = "Aptoide_Push_Notification_Application_Install";
    private static final String NO_PREVIOUS_SCREEN_ERROR = "No_Previous_Screen";
    private static final String OBB = "obb";
    private static final String ORIGIN = "origin";
    private static final String PACKAGE = "package";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PATCH = "PATCH";
    private static final String PHONE = "phone";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    public static final String RAKAM_INSTALL_EVENT = "install";
    private static final String RESULT = "result";
    private static final String ROOT = "root";
    private static final String SETTINGS = "aptoide_settings";
    private static final String STATUS = "status";
    private static final String STORE = "store";
    private static final String SUCCESS = "SUCC";
    private static final String TAG = "tag";
    private static final String TELECO = "teleco";
    private static final String TRUSTED_BADGE = "trusted_badge";
    private static final String TYPE = "type";
    private static final String UPDATE_TO_APPC = "UPDATE TO APPC";
    private static final String URL = "url";
    private final AnalyticsManager analyticsManager;
    private final Map<String, InstallEvent> cache;
    private final ConnectivityManager connectivityManager;
    private final CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private final TelephonyManager telephonyManager;

    /* renamed from: cm.aptoide.pt.install.InstallAnalytics$InstallEvent */
    private static class InstallEvent {
        private final AnalyticsManager.Action action;
        private final String context;
        private final Map<String, Object> data;
        private final String eventName;

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

        private InstallEvent(Map<String, Object> map, String str, String str2, AnalyticsManager.Action action2) {
            this.data = map;
            this.eventName = str;
            this.context = str2;
            this.action = action2;
        }
    }

    public InstallAnalytics(CrashReport crashReport2, AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, Map<String, InstallEvent> map, ConnectivityManager connectivityManager2, TelephonyManager telephonyManager2) {
        this.crashReport = crashReport2;
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.cache = map;
        this.connectivityManager = connectivityManager2;
        this.telephonyManager = telephonyManager2;
    }

    private void applicationInstallUpdateApp(int i, String str, int i2, String str2, InstallEvent installEvent, String str3) {
        if (i2 == 0) {
            Map<String, Object> data = installEvent.getData();
            data.put(URL, str2);
            this.cache.put(getKey(str, i, str3), new InstallEvent(data, str3, installEvent.getContext(), installEvent.getAction()));
        }
    }

    private Map<String, Object> createApp(String str, boolean z, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("package", str);
        hashMap.put(APPC, Boolean.valueOf(z));
        hashMap.put(MIGRATOR, Boolean.valueOf(z2));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z3));
        return hashMap;
    }

    private void createApplicationInstallEvent(AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, String str, int i, int i2, String str2, List<String> list, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        String str4 = str;
        int i3 = i;
        Map<String, Object> applicationInstallEventsBaseBundle = getApplicationInstallEventsBaseBundle(str, i2, str2, z2, z3, this.navigationTracker.getViewName(true));
        applicationInstallEventsBaseBundle.put(MIGRATOR, Boolean.valueOf(z));
        if (z) {
            applicationInstallEventsBaseBundle.put(ORIGIN, Origin.UPDATE_TO_APPC);
        } else {
            Origin origin2 = origin;
            applicationInstallEventsBaseBundle.put(ORIGIN, origin);
        }
        applicationInstallEventsBaseBundle.put(IS_APKFY, Boolean.valueOf(z4));
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        if (currentScreen.getTag() == null || !currentScreen.getTag().contains(EDITORS_CHOICE)) {
            if (previousScreen == null) {
                if (!list.isEmpty()) {
                    this.crashReport.log(NO_PREVIOUS_SCREEN_ERROR, list.toString());
                }
            } else if (currentScreen.getTag() != null && previousScreen.getFragment().equals(DeepLinkManager.DEEPLINK_KEY)) {
                str3 = NOTIFICATION_APPLICATION_INSTALL;
            }
            str3 = "";
        } else {
            str3 = EDITORS_APPLICATION_INSTALL;
        }
        if (!str3.equals("")) {
            this.cache.put(getKey(str, i, str3), new InstallEvent(applicationInstallEventsBaseBundle, str3, appContext.name(), action));
        }
        this.cache.put(getKey(str, i, APPLICATION_INSTALL), new InstallEvent(applicationInstallEventsBaseBundle, APPLICATION_INSTALL, appContext.name(), action));
    }

    private Map<String, Object> createCancelResult() {
        HashMap hashMap = new HashMap();
        hashMap.put(STATUS, CANCEL);
        return hashMap;
    }

    private Map<String, Object> createFailResult(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put(STATUS, FAIL);
        hashMap.put("type", exc.getClass().getSimpleName());
        hashMap.put(MESSAGE, exc.getMessage());
        return hashMap;
    }

    private Map<String, Object> createInstallClickEventMap(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, boolean z4, boolean z5) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT, str7);
        hashMap.put("action", str2.toLowerCase());
        hashMap.put("package_name", str);
        hashMap.put(PREVIOUS_CONTEXT, previousViewName);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z3));
        hashMap.put(APP_APPC, Boolean.valueOf(z2));
        hashMap.put(APP_AAB, Boolean.valueOf(z));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(MIUI_AAB_FIX, Long.valueOf(AptoideUtils.getMIUITimestamp()));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        if (str3 != null) {
            hashMap.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        hashMap.put(ADS_BLOCKED, str4);
        if (str5 != null) {
            hashMap.put("tag", str5);
        }
        hashMap.put("store", str6);
        return hashMap;
    }

    private void createInstallEvent(AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Map<String, Object> installEventsBaseBundle = getInstallEventsBaseBundle(str, i2, str2, z2, z, z3);
        if (z) {
            installEventsBaseBundle.put(ORIGIN, UPDATE_TO_APPC);
        } else {
            Origin origin2 = origin;
            installEventsBaseBundle.put(ORIGIN, origin);
        }
        installEventsBaseBundle.put(IS_APKFY, Boolean.valueOf(z4));
        String str3 = str;
        int i3 = i;
        this.cache.put(getKey(str, i, INSTALL_EVENT_NAME), new InstallEvent(installEventsBaseBundle, INSTALL_EVENT_NAME, appContext.name(), action));
    }

    private void createMigrationInstallEvent(AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "install appc app");
        this.cache.put(getKey(str, i, AppViewAnalytics.BONUS_MIGRATION_APPVIEW), new InstallEvent(hashMap, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, appContext.name(), action));
    }

    private Map<String, Object> createObbData(int i, String str) {
        HashMap hashMap = new HashMap();
        if (i == 1) {
            hashMap.put("type", MAIN);
        } else if (i == 2) {
            hashMap.put("type", PATCH);
        }
        hashMap.put(URL, str);
        return hashMap;
    }

    private void createRakamInstallEvent(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, DownloadAnalytics.AppContext appContext, boolean z4, boolean z5, String str6) {
        String str7 = str;
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        String tag = this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : "";
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT, currentViewName);
        hashMap.put("action", str2.toLowerCase());
        hashMap.put("package_name", str);
        hashMap.put(PREVIOUS_CONTEXT, previousViewName);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z));
        hashMap.put(APP_APPC, Boolean.valueOf(z3));
        hashMap.put(APP_AAB, Boolean.valueOf(z2));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        hashMap.put(STATUS, RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(APP_AAB_INSTALL_TIME, str6);
        hashMap.put(MIUI_AAB_FIX, Long.valueOf(AptoideUtils.getMIUITimestamp()));
        if (str4 != null) {
            hashMap.put(TRUSTED_BADGE, str4.toLowerCase());
        }
        hashMap.put(ADS_BLOCKED, str3.toLowerCase());
        if (!tag.isEmpty()) {
            hashMap.put("tag", tag);
        }
        hashMap.put("store", str5);
        int i2 = i;
        this.cache.put(getKey(str, i, RAKAM_INSTALL_EVENT), new InstallEvent(hashMap, RAKAM_INSTALL_EVENT, appContext.name(), AnalyticsManager.Action.CLICK));
    }

    private Map<String, Object> createResult() {
        HashMap hashMap = new HashMap();
        hashMap.put(STATUS, SUCCESS);
        return hashMap;
    }

    private Map<String, Object> createRoot(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(PHONE, Boolean.valueOf(z));
        hashMap.put(SETTINGS, Boolean.valueOf(z2));
        return hashMap;
    }

    private Map<String, Object> getApplicationInstallEventsBaseBundle(String str, int i, String str2, boolean z, boolean z2, String str3) {
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        HashMap hashMap = new HashMap();
        hashMap.put("package", str);
        hashMap.put(APPC, Boolean.valueOf(z));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z2));
        hashMap.put(NETWORK, AptoideUtils.SystemU.getConnectionType(this.connectivityManager).toUpperCase());
        hashMap.put(PREVIOUS_CONTEXT, previousScreen.getFragment());
        hashMap.put("tag", currentScreen.getTag());
        if (i >= 0) {
            hashMap.put(CAMPAIGN_ID, Integer.valueOf(i));
        }
        if (str2 != null) {
            hashMap.put(AB_TEST_GROUP, str2);
        }
        hashMap.put("store", this.navigationTracker.getCurrentScreen().getStore());
        hashMap.put(TELECO, AptoideUtils.SystemU.getCarrierName(this.telephonyManager));
        hashMap.put(CONTEXT, str3);
        return hashMap;
    }

    private Map<String, Object> getInstallEventsBaseBundle(String str, int i, String str2, boolean z, boolean z2, boolean z3) {
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        HashMap hashMap = new HashMap();
        hashMap.put(APP, createApp(str, z, z2, z3));
        hashMap.put(NETWORK, AptoideUtils.SystemU.getConnectionType(this.connectivityManager).toUpperCase());
        hashMap.put(PREVIOUS_CONTEXT, previousScreen.getFragment());
        hashMap.put("tag", currentScreen.getTag());
        if (i >= 0) {
            hashMap.put(CAMPAIGN_ID, Integer.valueOf(i));
        }
        if (str2 != null) {
            hashMap.put(AB_TEST_GROUP, str2);
        }
        hashMap.put("store", this.navigationTracker.getCurrentScreen().getStore());
        hashMap.put(TELECO, AptoideUtils.SystemU.getCarrierName(this.telephonyManager));
        return hashMap;
    }

    private String getKey(String str, int i, String str2) {
        return str + i + str2;
    }

    private void sendApplicationInstallEvent(InstallEvent installEvent, boolean z, boolean z2, String str, int i) {
        Map<String, Object> data = installEvent.getData();
        data.put(ROOT, createRoot(z, z2));
        this.analyticsManager.logEvent(data, APPLICATION_INSTALL, installEvent.getAction(), installEvent.getContext());
        this.cache.remove(getKey(str, i, APPLICATION_INSTALL));
    }

    private void sendEvent(String str) {
        InstallEvent installEvent = this.cache.get(str);
        if (installEvent != null) {
            this.analyticsManager.logEvent(installEvent.getData(), installEvent.getEventName(), installEvent.getAction(), installEvent.getContext());
        }
        this.cache.remove(str);
    }

    private void sendInstallEvent(InstallEvent installEvent, boolean z, boolean z2, String str, int i) {
        Map<String, Object> data = installEvent.getData();
        data.put(ROOT, createRoot(z, z2));
        data.put(RESULT, createResult());
        this.analyticsManager.logEvent(data, INSTALL_EVENT_NAME, installEvent.getAction(), installEvent.getContext());
        this.cache.remove(getKey(str, i, INSTALL_EVENT_NAME));
    }

    private void sendInstallEvents(String str, int i, boolean z, boolean z2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i, INSTALL_EVENT_NAME));
        if (installEvent != null) {
            sendInstallEvent(installEvent, z, z2, str, i);
        }
        InstallEvent installEvent2 = this.cache.get(getKey(str, i, APPLICATION_INSTALL));
        if (installEvent2 != null) {
            sendApplicationInstallEvent(installEvent2, z, z2, str, i);
        }
    }

    private void sendRakamInstallCanceledEvent(String str, int i) {
        InstallEvent installEvent = this.cache.get(getKey(str, i, RAKAM_INSTALL_EVENT));
        if (installEvent != null) {
            Map<String, Object> data = installEvent.getData();
            data.put(STATUS, "fail");
            data.put(ERROR_TYPE, "canceled");
            data.put(ERROR_MESSAGE, "The install was canceled");
            this.analyticsManager.logEvent(data, RAKAM_INSTALL_EVENT, installEvent.getAction(), installEvent.getContext());
            this.cache.remove(getKey(str, i, RAKAM_INSTALL_EVENT));
        }
    }

    private void updateApp(int i, String str, int i2, String str2, InstallEvent installEvent, String str3) {
        if (i2 == 0) {
            Map<String, Object> data = installEvent.getData();
            Map map = (Map) data.get(APP);
            map.put(URL, str2);
            data.put(APP, map);
            this.cache.put(getKey(str, i, str3), new InstallEvent(data, str3, installEvent.getContext(), installEvent.getAction()));
        }
    }

    private void updateObb(int i, String str, int i2, String str2, InstallEvent installEvent, String str3) {
        if (i2 == 1 || i2 == 2) {
            Map<String, Object> data = installEvent.getData();
            List list = (List) data.get(OBB);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(createObbData(i2, str2));
            data.put(OBB, list);
            this.cache.put(getKey(str, i, str3), new InstallEvent(data, installEvent.getEventName(), installEvent.getContext(), installEvent.getAction()));
        }
    }

    public void clickOnInstallEvent(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, boolean z5) {
        String currentViewName = this.navigationTracker.getCurrentViewName();
        this.analyticsManager.logEvent(createInstallClickEventMap(str, str2, z, z2, z3, str3, str4, str5, str6, currentViewName, z4, z5), CLICK_ON_INSTALL, AnalyticsManager.Action.CLICK, currentViewName);
    }

    public void installCompleted(String str, int i, boolean z, boolean z2) {
        sendEvent(getKey(str, i, NOTIFICATION_APPLICATION_INSTALL));
        sendEvent(getKey(str, i, EDITORS_APPLICATION_INSTALL));
        sendEvent(getKey(str, i, APPLICATION_INSTALL));
        sendEvent(getKey(str, i, AppViewAnalytics.BONUS_MIGRATION_APPVIEW));
        sendEvent(getKey(str, i, RAKAM_INSTALL_EVENT));
        sendInstallEvents(str, i, z, z2);
    }

    public void installStarted(String str, int i, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, String str5) {
        createRakamInstallEvent(i, str, origin.toString(), str2, z, z3, z2, str3, str4, appContext, false, z4, str5);
        createApplicationInstallEvent(action, appContext, origin, str, i, -1, (String) null, Collections.emptyList(), z, z2, z3, false);
        createInstallEvent(action, appContext, origin, str, i, -1, (String) null, z, z2, z3, false);
    }

    public void logInstallCancelEvent(String str, int i) {
        sendRakamInstallCanceledEvent(str, i);
        InstallEvent installEvent = this.cache.get(getKey(str, i, INSTALL_EVENT_NAME));
        if (installEvent != null) {
            Map<String, Object> data = installEvent.getData();
            data.put(RESULT, createCancelResult());
            this.analyticsManager.logEvent(data, INSTALL_EVENT_NAME, installEvent.getAction(), installEvent.getContext());
            this.cache.remove(getKey(str, i, INSTALL_EVENT_NAME));
        }
    }

    public void logInstallErrorEvent(String str, int i, Exception exc, boolean z, boolean z2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i, INSTALL_EVENT_NAME));
        if (installEvent != null) {
            Map<String, Object> data = installEvent.getData();
            data.put(ROOT, createRoot(z, z2));
            data.put(RESULT, createFailResult(exc));
            this.analyticsManager.logEvent(data, INSTALL_EVENT_NAME, installEvent.getAction(), installEvent.getContext());
            this.cache.remove(getKey(str, i, INSTALL_EVENT_NAME));
        }
    }

    public void uninstallCompleted(String str) {
        sendEvent(getKey(str, MIGRATION_UNINSTALL_KEY, AppViewAnalytics.BONUS_MIGRATION_APPVIEW));
    }

    public void uninstallStarted(String str, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "uninstall");
        this.cache.put(getKey(str, MIGRATION_UNINSTALL_KEY, AppViewAnalytics.BONUS_MIGRATION_APPVIEW), new InstallEvent(hashMap, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, appContext.name(), action));
    }

    public void updateInstallEvents(int i, String str, int i2, String str2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i, INSTALL_EVENT_NAME));
        InstallEvent installEvent2 = this.cache.get(getKey(str, i, APPLICATION_INSTALL));
        if (installEvent != null) {
            int i3 = i;
            String str3 = str;
            int i4 = i2;
            String str4 = str2;
            InstallEvent installEvent3 = installEvent;
            updateApp(i3, str3, i4, str4, installEvent3, INSTALL_EVENT_NAME);
            updateObb(i3, str3, i4, str4, installEvent3, INSTALL_EVENT_NAME);
        }
        if (installEvent2 != null) {
            int i5 = i;
            String str5 = str;
            int i6 = i2;
            String str6 = str2;
            InstallEvent installEvent4 = installEvent2;
            applicationInstallUpdateApp(i5, str5, i6, str6, installEvent4, APPLICATION_INSTALL);
            updateObb(i5, str5, i6, str6, installEvent4, APPLICATION_INSTALL);
        }
    }

    public void installStarted(String str, int i, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, int i2, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, boolean z5, String str6) {
        createRakamInstallEvent(i, str, origin.toString(), str3, z, z3, z2, str4, str5, appContext, z4, z5, str6);
        String str7 = str;
        int i3 = i;
        AnalyticsManager.Action action2 = action;
        DownloadAnalytics.AppContext appContext2 = appContext;
        if (z) {
            createMigrationInstallEvent(action2, appContext2, str7, i3);
        }
        AnalyticsManager.Action action3 = action;
        DownloadAnalytics.AppContext appContext3 = appContext;
        Origin origin2 = origin;
        String str8 = str;
        int i4 = i;
        int i5 = i2;
        String str9 = str2;
        createApplicationInstallEvent(action3, appContext3, origin2, str8, i4, i5, str9, Collections.emptyList(), z, z2, z3, z4);
        createInstallEvent(action3, appContext3, origin2, str8, i4, i5, str9, z, z2, z3, z4);
    }
}
