package p015cm.aptoide.analytics.implementation.navigation;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;

/* renamed from: cm.aptoide.analytics.implementation.navigation.NavigationTracker */
public class NavigationTracker {
    private static final String TAG = "NavigationTracker";
    private List<ScreenTagHistory> historyList;
    private final AnalyticsLogger logger;
    private PageViewsAnalytics pageViewsAnalytics;
    private final ViewNameFilter viewNameFilter;

    public NavigationTracker(List<ScreenTagHistory> list, ViewNameFilter viewNameFilter2, PageViewsAnalytics pageViewsAnalytics2, AnalyticsLogger analyticsLogger) {
        this.historyList = list;
        this.viewNameFilter = viewNameFilter2;
        this.pageViewsAnalytics = pageViewsAnalytics2;
        this.logger = analyticsLogger;
    }

    private boolean filter(ScreenTagHistory screenTagHistory) {
        return this.viewNameFilter.filter(screenTagHistory.getFragment());
    }

    public ScreenTagHistory getCurrentScreen() {
        if (this.historyList.isEmpty()) {
            return new ScreenTagHistory();
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 1);
    }

    public String getCurrentViewName() {
        if (this.historyList.isEmpty()) {
            return "";
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 1).getFragment();
    }

    public List<ScreenTagHistory> getHistoryList() {
        return this.historyList;
    }

    public String getPrettyScreenHistory() {
        StringBuilder sb = new StringBuilder();
        List<ScreenTagHistory> list = this.historyList;
        Collections.reverse(list);
        for (ScreenTagHistory screenTagHistory : list) {
            sb.append("[");
            sb.append(screenTagHistory.toString());
            sb.append("]");
        }
        return sb.toString();
    }

    public ScreenTagHistory getPreviousScreen() {
        if (this.historyList.size() < 2) {
            return new ScreenTagHistory();
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 2);
    }

    public String getPreviousViewName() {
        if (this.historyList.size() < 2) {
            return "NoHistory";
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 2).getFragment();
    }

    public String getViewName(boolean z) {
        if (!z) {
            return getPreviousViewName();
        }
        try {
            return getCurrentViewName();
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public void registerScreen(ScreenTagHistory screenTagHistory) {
        if (screenTagHistory != null && filter(screenTagHistory)) {
            this.historyList.add(screenTagHistory);
            this.pageViewsAnalytics.sendPageViewedEvent(getViewName(true), getViewName(false), screenTagHistory.getStore());
            AnalyticsLogger analyticsLogger = this.logger;
            String str = TAG;
            analyticsLogger.logDebug(str, "NavigationTracker size: " + this.historyList.size() + "   Registering screen: " + screenTagHistory);
        }
    }
}
