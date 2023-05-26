package p015cm.aptoide.p016pt.store;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.store.StoreAnalytics */
public class StoreAnalytics {
    private static final String ACTION = "action";
    private static final String FOLLOW_STORE_APPS = "follow_store_apps";
    private static final String FOLLOW_STORE_FOLLOWERS = "follow_store_followers";
    private static final String SOURCE = "source";
    public static final String STORES_INTERACT = "Store_Interact";
    public static final String STORES_OPEN = "Store_Open";
    public static final String STORES_TAB_INTERACT = "Stores_Tab_Interact";
    private static final String STORE_NAME = "store_name";
    private static final String TAB = "tab_name";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public StoreAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private Map<String, Object> createStoreInteractDataMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put(TAB, str2);
        hashMap.put("store_name", str3);
        return hashMap;
    }

    private Map<String, Object> createStoreInteractMap(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        return hashMap;
    }

    private Map<String, Object> createStoreOpenDataMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(SOURCE, str);
        hashMap.put("store_name", str2);
        return hashMap;
    }

    private Map<String, Object> createStoreTabInteractDataMap(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put(FOLLOW_STORE_APPS, AptoideUtils.StringU.toString(Integer.valueOf(i)));
        hashMap.put(FOLLOW_STORE_FOLLOWERS, AptoideUtils.StringU.toString(Integer.valueOf(i2)));
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendFollowersStoresInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "Open Followers");
        this.analyticsManager.logEvent(hashMap, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowingStoresInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "Open Following");
        this.analyticsManager.logEvent(hashMap, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreInteractEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createStoreInteractDataMap(str, str2, str3), STORES_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(String str, String str2, boolean z) {
        this.analyticsManager.logEvent(createStoreOpenDataMap(str, str2), STORES_OPEN, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, boolean z) {
        this.analyticsManager.logEvent(createStoreInteractMap(str), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, int i, int i2) {
        this.analyticsManager.logEvent(createStoreTabInteractDataMap(str, i, i2), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
