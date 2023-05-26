package p015cm.aptoide.p016pt;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;

/* renamed from: cm.aptoide.pt.DeepLinkAnalytics */
public class DeepLinkAnalytics {
    public static final String APPCOINS_WALLET_DEEPLINK = "AppCoins_Wallet_Deeplink";
    public static final String APP_LAUNCH = "Application Launch";
    private static final String DOWNLOADING_UPDATES = "Downloading Updates";
    public static final String FACEBOOK_APP_LAUNCH = "Aptoide Launch";
    private static final String HOSTNAME = "Hostname";
    private static final String LAUNCHER = "Launcher";
    private static final String NEW_REPO = "New Repository";
    private static final String NEW_UPDATES_NOTIFICATION = "New Updates Available";
    private static final String SOURCE = "Source";
    private static final String SOURCE_GROUP_ATTRIBUTE = "source_group";
    private static final String SOURCE_GROUP_OPTION_APP_VIEW = "aptoide app view";
    private static final String SOURCE_GROUP_OPTION_BUNDLES = "aptoide bundle";
    private static final String SOURCE_GROUP_OPTION_HOME = "aptoide homepage";
    private static final String SOURCE_GROUP_OPTION_STORE = "aptoide store";
    private static final String SOURCE_GROUP_OPTION_THANK_YOU = "aptoide thank you page";
    private static final String URI = "Uri";
    private static final String WEBSITE = "Website";
    private AnalyticsManager analyticsManager;
    private HashMap<String, Object> map = new HashMap<>();
    private NavigationTracker navigationTracker;

    public DeepLinkAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private Map<String, Object> createMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private void websiteSourceGroup(String str) {
        HashMap<String, Object> hashMap = this.map;
        if (hashMap != null && !hashMap.isEmpty()) {
            this.map.put(SOURCE_GROUP_ATTRIBUTE, str);
        }
    }

    public void downloadingUpdates() {
        this.analyticsManager.logEvent(createMap("Source", DOWNLOADING_UPDATES), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void launcher() {
        this.analyticsManager.logEvent(createMap("Source", LAUNCHER), FACEBOOK_APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void newRepo() {
        this.analyticsManager.logEvent(createMap("Source", NEW_REPO), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void newUpdatesNotification() {
        this.analyticsManager.logEvent(createMap("Source", NEW_UPDATES_NOTIFICATION), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void sendWalletDeepLinkEvent(String str) {
        this.analyticsManager.logEvent(createMap("Source", str), APPCOINS_WALLET_DEEPLINK, AnalyticsManager.Action.CLICK, "Application");
    }

    public void sendWebsite() {
        HashMap<String, Object> hashMap = this.map;
        if (hashMap != null && !hashMap.isEmpty()) {
            this.analyticsManager.logEvent(this.map, FACEBOOK_APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
            this.analyticsManager.logEvent(this.map, APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
        }
        this.map = null;
    }

    public void website(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        this.map = hashMap;
        hashMap.put("Source", WEBSITE);
        if (str != null) {
            this.map.put(URI, str.substring(0, str.indexOf(":")));
            this.map.put(HOSTNAME, Uri.parse(str).getHost());
        }
    }

    public void websiteFromAppViewWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_APP_VIEW);
    }

    public void websiteFromBundlesWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_BUNDLES);
    }

    public void websiteFromHomeWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_HOME);
    }

    public void websiteFromStoreWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_STORE);
    }

    public void websiteFromThankYouWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_THANK_YOU);
    }
}
