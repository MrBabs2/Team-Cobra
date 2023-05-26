package p015cm.aptoide.p016pt.bottomNavigation;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationAnalytics */
public class BottomNavigationAnalytics {
    public static final String BOTTOM_NAVIGATION_INTERACT = "Bottom_Navigation_Interact";
    private static final String VIEW = "view";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public BottomNavigationAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private Map<String, Object> createBottomNavData(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(VIEW, str);
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendNavigateToAppsClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData(DeepLinkIntentReceiver.DeepLinksTargets.APPS), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToCurationClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("curation"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToHomeClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("home"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToSearchClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("search"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToStoresClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("stores"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
