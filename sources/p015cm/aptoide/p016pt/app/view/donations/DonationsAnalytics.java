package p015cm.aptoide.p016pt.app.view.donations;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;

/* renamed from: cm.aptoide.pt.app.view.donations.DonationsAnalytics */
public class DonationsAnalytics {
    public static final String ACTION = "action";
    public static final String DONATIONS_INTERACT = "Donations_Dialog_Interact";
    public static final String NAME = "name";
    public static final String PACKAGE_NAME = "package_name";
    public static final String VALUE = "value";
    private AnalyticsManager analyticsManager;
    private NavigationTracker navigationTracker;

    public DonationsAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private HashMap<String, Object> createDonationsInteractMap(String str, String str2, float f, boolean z) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action", str);
        hashMap.put("package_name", str2);
        hashMap.put(VALUE, Float.valueOf(f));
        hashMap.put("name", Boolean.valueOf(z));
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendCancelInteractEvent(String str, float f, boolean z) {
        this.analyticsManager.logEvent(createDonationsInteractMap("cancel", str, f, z), DONATIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendDonateInteractEvent(String str, float f, boolean z) {
        this.analyticsManager.logEvent(createDonationsInteractMap("donate", str, f, z), DONATIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
