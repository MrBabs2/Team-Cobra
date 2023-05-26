package p015cm.aptoide.p016pt;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;

/* renamed from: cm.aptoide.pt.AppShortcutsAnalytics */
public class AppShortcutsAnalytics {
    public static final String APPS_SHORTCUTS = "Apps_Shortcuts";
    private static final String DESTINATION = "destination";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public AppShortcutsAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void shortcutNavigation(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DESTINATION, str);
        this.analyticsManager.logEvent(hashMap, APPS_SHORTCUTS, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
