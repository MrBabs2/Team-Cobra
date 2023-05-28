package p015cm.aptoide.analytics.implementation;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;

/* renamed from: cm.aptoide.analytics.implementation.PageViewsAnalytics */
public class PageViewsAnalytics {
    public static final String PAGE_VIEW_EVENT = "Page_View";
    private final AnalyticsManager analyticsManager;

    public PageViewsAnalytics(AnalyticsManager analyticsManager2) {
        this.analyticsManager = analyticsManager2;
    }

    private Map<String, Object> createEventMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("fragment", str);
        hashMap.put(AccountAnalytics.STORE, str2);
        return hashMap;
    }

    public void sendPageViewedEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createEventMap(str, str3), PAGE_VIEW_EVENT, AnalyticsManager.Action.CLICK, str2);
    }
}
