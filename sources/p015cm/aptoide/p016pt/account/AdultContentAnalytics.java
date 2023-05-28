package p015cm.aptoide.p016pt.account;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;

/* renamed from: cm.aptoide.pt.account.AdultContentAnalytics */
public class AdultContentAnalytics {
    public static final String ADULT_CONTENT = "Adult Content";
    public static final String LOCK = "true";
    public static final String UNLOCK = "false";
    private AnalyticsManager analyticsManager;
    private NavigationTracker navigationTracker;

    public AdultContentAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void lock() {
        HashMap hashMap = new HashMap();
        hashMap.put("Action", "true");
        this.analyticsManager.logEvent(hashMap, ADULT_CONTENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void unlock() {
        HashMap hashMap = new HashMap();
        hashMap.put("Action", UNLOCK);
        this.analyticsManager.logEvent(hashMap, ADULT_CONTENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
