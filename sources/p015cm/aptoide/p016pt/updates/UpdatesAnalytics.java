package p015cm.aptoide.p016pt.updates;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.install.InstallAnalytics;

/* renamed from: cm.aptoide.pt.updates.UpdatesAnalytics */
public class UpdatesAnalytics {
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    public static final String OPEN_APP_VIEW = "Open App View";
    private static final String TYPE = "type";
    public static final String UPDATE_EVENT = "Updates";
    private final AnalyticsManager analyticsManager;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;

    public UpdatesAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2, InstallAnalytics installAnalytics2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
        this.installAnalytics = installAnalytics2;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public void sendUpdateAllClickEvent() {
        String viewName = this.navigationTracker.getViewName(true);
        HashMap hashMap = new HashMap();
        hashMap.put("type", "update all");
        hashMap.put(CONTEXT, viewName);
        this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendUpdateClickedEvent(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, boolean z4) {
        String viewName = this.navigationTracker.getViewName(true);
        HashMap hashMap = new HashMap();
        hashMap.put("type", "UPDATE");
        String str7 = str;
        hashMap.put(APPLICATION_NAME, str7);
        hashMap.put(CONTEXT, viewName);
        this.installAnalytics.clickOnInstallEvent(str7, str6, z, z2, z3, str2, str3, str4, str5, false, z4);
        this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void updates(String str) {
        this.analyticsManager.logEvent(createMapData("action", str), UPDATE_EVENT, AnalyticsManager.Action.AUTO, this.navigationTracker.getViewName(true));
    }
}
